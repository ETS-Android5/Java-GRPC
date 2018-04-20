// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/channelz/channelz.proto

package io.grpc.channelz.v1;

public interface SocketOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.channelz.Socket)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.grpc.channelz.SocketRef ref = 1;</code>
   */
  boolean hasRef();
  /**
   * <code>.grpc.channelz.SocketRef ref = 1;</code>
   */
  io.grpc.channelz.v1.SocketRef getRef();
  /**
   * <code>.grpc.channelz.SocketRef ref = 1;</code>
   */
  io.grpc.channelz.v1.SocketRefOrBuilder getRefOrBuilder();

  /**
   * <code>.grpc.channelz.SocketData data = 2;</code>
   */
  boolean hasData();
  /**
   * <code>.grpc.channelz.SocketData data = 2;</code>
   */
  io.grpc.channelz.v1.SocketData getData();
  /**
   * <code>.grpc.channelz.SocketData data = 2;</code>
   */
  io.grpc.channelz.v1.SocketDataOrBuilder getDataOrBuilder();

  /**
   * <pre>
   * The locally bound address.
   * </pre>
   *
   * <code>.grpc.channelz.Address local = 3;</code>
   */
  boolean hasLocal();
  /**
   * <pre>
   * The locally bound address.
   * </pre>
   *
   * <code>.grpc.channelz.Address local = 3;</code>
   */
  io.grpc.channelz.v1.Address getLocal();
  /**
   * <pre>
   * The locally bound address.
   * </pre>
   *
   * <code>.grpc.channelz.Address local = 3;</code>
   */
  io.grpc.channelz.v1.AddressOrBuilder getLocalOrBuilder();

  /**
   * <pre>
   * The remote bound address.  May be absent.
   * </pre>
   *
   * <code>.grpc.channelz.Address remote = 4;</code>
   */
  boolean hasRemote();
  /**
   * <pre>
   * The remote bound address.  May be absent.
   * </pre>
   *
   * <code>.grpc.channelz.Address remote = 4;</code>
   */
  io.grpc.channelz.v1.Address getRemote();
  /**
   * <pre>
   * The remote bound address.  May be absent.
   * </pre>
   *
   * <code>.grpc.channelz.Address remote = 4;</code>
   */
  io.grpc.channelz.v1.AddressOrBuilder getRemoteOrBuilder();

  /**
   * <code>.grpc.channelz.Security security = 5;</code>
   */
  boolean hasSecurity();
  /**
   * <code>.grpc.channelz.Security security = 5;</code>
   */
  io.grpc.channelz.v1.Security getSecurity();
  /**
   * <code>.grpc.channelz.Security security = 5;</code>
   */
  io.grpc.channelz.v1.SecurityOrBuilder getSecurityOrBuilder();

  /**
   * <pre>
   * Optional, represents the name of the remote endpoint, if different than
   * the original target name.
   * </pre>
   *
   * <code>string remote_name = 6;</code>
   */
  java.lang.String getRemoteName();
  /**
   * <pre>
   * Optional, represents the name of the remote endpoint, if different than
   * the original target name.
   * </pre>
   *
   * <code>string remote_name = 6;</code>
   */
  com.google.protobuf.ByteString
      getRemoteNameBytes();
}
