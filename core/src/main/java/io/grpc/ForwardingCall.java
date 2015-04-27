/*
 * Copyright 2015, Google Inc. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 *    * Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 *    * Redistributions in binary form must reproduce the above
 * copyright notice, this list of conditions and the following disclaimer
 * in the documentation and/or other materials provided with the
 * distribution.
 *
 *    * Neither the name of Google Inc. nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package io.grpc;

/**
 * A {@link Call} which forwards all of it's methods to another {@link Call}.
 */
public abstract class ForwardingCall<ReqT, RespT> extends Call<ReqT, RespT> {
  /**
   * Returns the delegated {@code Call}.
   */
  protected abstract Call<ReqT, RespT> delegate();

  @Override
  public void start(Listener<RespT> responseListener, Metadata.Headers headers) {
    delegate().start(responseListener, headers);
  }

  @Override
  public void request(int numMessages) {
    delegate().request(numMessages);
  }

  @Override
  public void cancel() {
    delegate().cancel();
  }

  @Override
  public void halfClose() {
    delegate().halfClose();
  }

  @Override
  public void sendPayload(ReqT payload) {
    delegate().sendPayload(payload);
  }

  @Override
  public boolean isReady() {
    return delegate().isReady();
  }

  /**
   * A simplified version of {@link ForwardingCall} where subclasses can pass in a {@link Call} as
   * the delegate.
   */
  public abstract static class SimpleForwardingCall<ReqT, RespT>
      extends ForwardingCall<ReqT, RespT> {
    private final Call<ReqT, RespT> delegate;

    protected SimpleForwardingCall(Call<ReqT, RespT> delegate) {
      this.delegate = delegate;
    }

    @Override
    protected Call<ReqT, RespT> delegate() {
      return delegate;
    }
  }
}
