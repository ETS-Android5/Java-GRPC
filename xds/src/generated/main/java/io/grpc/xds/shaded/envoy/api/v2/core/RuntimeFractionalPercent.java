// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/api/v2/core/base.proto

package io.grpc.xds.shaded.envoy.api.v2.core;

/**
 * <pre>
 * Runtime derived FractionalPercent with defaults for when the numerator or denominator is not
 * specified via a runtime key.
 * </pre>
 *
 * Protobuf type {@code envoy.api.v2.core.RuntimeFractionalPercent}
 */
public  final class RuntimeFractionalPercent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.api.v2.core.RuntimeFractionalPercent)
    RuntimeFractionalPercentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RuntimeFractionalPercent.newBuilder() to construct.
  private RuntimeFractionalPercent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RuntimeFractionalPercent() {
    runtimeKey_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RuntimeFractionalPercent(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            io.grpc.xds.shaded.envoy.type.FractionalPercent.Builder subBuilder = null;
            if (defaultValue_ != null) {
              subBuilder = defaultValue_.toBuilder();
            }
            defaultValue_ = input.readMessage(io.grpc.xds.shaded.envoy.type.FractionalPercent.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(defaultValue_);
              defaultValue_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            runtimeKey_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.xds.shaded.envoy.api.v2.core.Base.internal_static_envoy_api_v2_core_RuntimeFractionalPercent_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.xds.shaded.envoy.api.v2.core.Base.internal_static_envoy_api_v2_core_RuntimeFractionalPercent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.xds.shaded.envoy.api.v2.core.RuntimeFractionalPercent.class, io.grpc.xds.shaded.envoy.api.v2.core.RuntimeFractionalPercent.Builder.class);
  }

  public static final int DEFAULT_VALUE_FIELD_NUMBER = 1;
  private io.grpc.xds.shaded.envoy.type.FractionalPercent defaultValue_;
  /**
   * <pre>
   * Default value if the runtime value's for the numerator/denominator keys are not available.
   * </pre>
   *
   * <code>.envoy.type.FractionalPercent default_value = 1 [(.validate.rules) = { ... }</code>
   */
  public boolean hasDefaultValue() {
    return defaultValue_ != null;
  }
  /**
   * <pre>
   * Default value if the runtime value's for the numerator/denominator keys are not available.
   * </pre>
   *
   * <code>.envoy.type.FractionalPercent default_value = 1 [(.validate.rules) = { ... }</code>
   */
  public io.grpc.xds.shaded.envoy.type.FractionalPercent getDefaultValue() {
    return defaultValue_ == null ? io.grpc.xds.shaded.envoy.type.FractionalPercent.getDefaultInstance() : defaultValue_;
  }
  /**
   * <pre>
   * Default value if the runtime value's for the numerator/denominator keys are not available.
   * </pre>
   *
   * <code>.envoy.type.FractionalPercent default_value = 1 [(.validate.rules) = { ... }</code>
   */
  public io.grpc.xds.shaded.envoy.type.FractionalPercentOrBuilder getDefaultValueOrBuilder() {
    return getDefaultValue();
  }

  public static final int RUNTIME_KEY_FIELD_NUMBER = 2;
  private volatile java.lang.Object runtimeKey_;
  /**
   * <pre>
   * Runtime key for a YAML representation of a FractionalPercent.
   * </pre>
   *
   * <code>string runtime_key = 2;</code>
   */
  public java.lang.String getRuntimeKey() {
    java.lang.Object ref = runtimeKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      runtimeKey_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Runtime key for a YAML representation of a FractionalPercent.
   * </pre>
   *
   * <code>string runtime_key = 2;</code>
   */
  public com.google.protobuf.ByteString
      getRuntimeKeyBytes() {
    java.lang.Object ref = runtimeKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      runtimeKey_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (defaultValue_ != null) {
      output.writeMessage(1, getDefaultValue());
    }
    if (!getRuntimeKeyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, runtimeKey_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (defaultValue_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDefaultValue());
    }
    if (!getRuntimeKeyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, runtimeKey_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.grpc.xds.shaded.envoy.api.v2.core.RuntimeFractionalPercent)) {
      return super.equals(obj);
    }
    io.grpc.xds.shaded.envoy.api.v2.core.RuntimeFractionalPercent other = (io.grpc.xds.shaded.envoy.api.v2.core.RuntimeFractionalPercent) obj;

    boolean result = true;
    result = result && (hasDefaultValue() == other.hasDefaultValue());
    if (hasDefaultValue()) {
      result = result && getDefaultValue()
          .equals(other.getDefaultValue());
    }
    result = result && getRuntimeKey()
        .equals(other.getRuntimeKey());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasDefaultValue()) {
      hash = (37 * hash) + DEFAULT_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getDefaultValue().hashCode();
    }
    hash = (37 * hash) + RUNTIME_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getRuntimeKey().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.xds.shaded.envoy.api.v2.core.RuntimeFractionalPercent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.RuntimeFractionalPercent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.RuntimeFractionalPercent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.RuntimeFractionalPercent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.RuntimeFractionalPercent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.RuntimeFractionalPercent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.RuntimeFractionalPercent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.RuntimeFractionalPercent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.RuntimeFractionalPercent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.RuntimeFractionalPercent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.RuntimeFractionalPercent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.xds.shaded.envoy.api.v2.core.RuntimeFractionalPercent parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.grpc.xds.shaded.envoy.api.v2.core.RuntimeFractionalPercent prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Runtime derived FractionalPercent with defaults for when the numerator or denominator is not
   * specified via a runtime key.
   * </pre>
   *
   * Protobuf type {@code envoy.api.v2.core.RuntimeFractionalPercent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.api.v2.core.RuntimeFractionalPercent)
      io.grpc.xds.shaded.envoy.api.v2.core.RuntimeFractionalPercentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.xds.shaded.envoy.api.v2.core.Base.internal_static_envoy_api_v2_core_RuntimeFractionalPercent_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.xds.shaded.envoy.api.v2.core.Base.internal_static_envoy_api_v2_core_RuntimeFractionalPercent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.xds.shaded.envoy.api.v2.core.RuntimeFractionalPercent.class, io.grpc.xds.shaded.envoy.api.v2.core.RuntimeFractionalPercent.Builder.class);
    }

    // Construct using io.grpc.xds.shaded.envoy.api.v2.core.RuntimeFractionalPercent.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      if (defaultValueBuilder_ == null) {
        defaultValue_ = null;
      } else {
        defaultValue_ = null;
        defaultValueBuilder_ = null;
      }
      runtimeKey_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.xds.shaded.envoy.api.v2.core.Base.internal_static_envoy_api_v2_core_RuntimeFractionalPercent_descriptor;
    }

    public io.grpc.xds.shaded.envoy.api.v2.core.RuntimeFractionalPercent getDefaultInstanceForType() {
      return io.grpc.xds.shaded.envoy.api.v2.core.RuntimeFractionalPercent.getDefaultInstance();
    }

    public io.grpc.xds.shaded.envoy.api.v2.core.RuntimeFractionalPercent build() {
      io.grpc.xds.shaded.envoy.api.v2.core.RuntimeFractionalPercent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.xds.shaded.envoy.api.v2.core.RuntimeFractionalPercent buildPartial() {
      io.grpc.xds.shaded.envoy.api.v2.core.RuntimeFractionalPercent result = new io.grpc.xds.shaded.envoy.api.v2.core.RuntimeFractionalPercent(this);
      if (defaultValueBuilder_ == null) {
        result.defaultValue_ = defaultValue_;
      } else {
        result.defaultValue_ = defaultValueBuilder_.build();
      }
      result.runtimeKey_ = runtimeKey_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.xds.shaded.envoy.api.v2.core.RuntimeFractionalPercent) {
        return mergeFrom((io.grpc.xds.shaded.envoy.api.v2.core.RuntimeFractionalPercent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.xds.shaded.envoy.api.v2.core.RuntimeFractionalPercent other) {
      if (other == io.grpc.xds.shaded.envoy.api.v2.core.RuntimeFractionalPercent.getDefaultInstance()) return this;
      if (other.hasDefaultValue()) {
        mergeDefaultValue(other.getDefaultValue());
      }
      if (!other.getRuntimeKey().isEmpty()) {
        runtimeKey_ = other.runtimeKey_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.grpc.xds.shaded.envoy.api.v2.core.RuntimeFractionalPercent parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.xds.shaded.envoy.api.v2.core.RuntimeFractionalPercent) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.grpc.xds.shaded.envoy.type.FractionalPercent defaultValue_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grpc.xds.shaded.envoy.type.FractionalPercent, io.grpc.xds.shaded.envoy.type.FractionalPercent.Builder, io.grpc.xds.shaded.envoy.type.FractionalPercentOrBuilder> defaultValueBuilder_;
    /**
     * <pre>
     * Default value if the runtime value's for the numerator/denominator keys are not available.
     * </pre>
     *
     * <code>.envoy.type.FractionalPercent default_value = 1 [(.validate.rules) = { ... }</code>
     */
    public boolean hasDefaultValue() {
      return defaultValueBuilder_ != null || defaultValue_ != null;
    }
    /**
     * <pre>
     * Default value if the runtime value's for the numerator/denominator keys are not available.
     * </pre>
     *
     * <code>.envoy.type.FractionalPercent default_value = 1 [(.validate.rules) = { ... }</code>
     */
    public io.grpc.xds.shaded.envoy.type.FractionalPercent getDefaultValue() {
      if (defaultValueBuilder_ == null) {
        return defaultValue_ == null ? io.grpc.xds.shaded.envoy.type.FractionalPercent.getDefaultInstance() : defaultValue_;
      } else {
        return defaultValueBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Default value if the runtime value's for the numerator/denominator keys are not available.
     * </pre>
     *
     * <code>.envoy.type.FractionalPercent default_value = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setDefaultValue(io.grpc.xds.shaded.envoy.type.FractionalPercent value) {
      if (defaultValueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        defaultValue_ = value;
        onChanged();
      } else {
        defaultValueBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Default value if the runtime value's for the numerator/denominator keys are not available.
     * </pre>
     *
     * <code>.envoy.type.FractionalPercent default_value = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setDefaultValue(
        io.grpc.xds.shaded.envoy.type.FractionalPercent.Builder builderForValue) {
      if (defaultValueBuilder_ == null) {
        defaultValue_ = builderForValue.build();
        onChanged();
      } else {
        defaultValueBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Default value if the runtime value's for the numerator/denominator keys are not available.
     * </pre>
     *
     * <code>.envoy.type.FractionalPercent default_value = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder mergeDefaultValue(io.grpc.xds.shaded.envoy.type.FractionalPercent value) {
      if (defaultValueBuilder_ == null) {
        if (defaultValue_ != null) {
          defaultValue_ =
            io.grpc.xds.shaded.envoy.type.FractionalPercent.newBuilder(defaultValue_).mergeFrom(value).buildPartial();
        } else {
          defaultValue_ = value;
        }
        onChanged();
      } else {
        defaultValueBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Default value if the runtime value's for the numerator/denominator keys are not available.
     * </pre>
     *
     * <code>.envoy.type.FractionalPercent default_value = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder clearDefaultValue() {
      if (defaultValueBuilder_ == null) {
        defaultValue_ = null;
        onChanged();
      } else {
        defaultValue_ = null;
        defaultValueBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Default value if the runtime value's for the numerator/denominator keys are not available.
     * </pre>
     *
     * <code>.envoy.type.FractionalPercent default_value = 1 [(.validate.rules) = { ... }</code>
     */
    public io.grpc.xds.shaded.envoy.type.FractionalPercent.Builder getDefaultValueBuilder() {
      
      onChanged();
      return getDefaultValueFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Default value if the runtime value's for the numerator/denominator keys are not available.
     * </pre>
     *
     * <code>.envoy.type.FractionalPercent default_value = 1 [(.validate.rules) = { ... }</code>
     */
    public io.grpc.xds.shaded.envoy.type.FractionalPercentOrBuilder getDefaultValueOrBuilder() {
      if (defaultValueBuilder_ != null) {
        return defaultValueBuilder_.getMessageOrBuilder();
      } else {
        return defaultValue_ == null ?
            io.grpc.xds.shaded.envoy.type.FractionalPercent.getDefaultInstance() : defaultValue_;
      }
    }
    /**
     * <pre>
     * Default value if the runtime value's for the numerator/denominator keys are not available.
     * </pre>
     *
     * <code>.envoy.type.FractionalPercent default_value = 1 [(.validate.rules) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grpc.xds.shaded.envoy.type.FractionalPercent, io.grpc.xds.shaded.envoy.type.FractionalPercent.Builder, io.grpc.xds.shaded.envoy.type.FractionalPercentOrBuilder> 
        getDefaultValueFieldBuilder() {
      if (defaultValueBuilder_ == null) {
        defaultValueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.grpc.xds.shaded.envoy.type.FractionalPercent, io.grpc.xds.shaded.envoy.type.FractionalPercent.Builder, io.grpc.xds.shaded.envoy.type.FractionalPercentOrBuilder>(
                getDefaultValue(),
                getParentForChildren(),
                isClean());
        defaultValue_ = null;
      }
      return defaultValueBuilder_;
    }

    private java.lang.Object runtimeKey_ = "";
    /**
     * <pre>
     * Runtime key for a YAML representation of a FractionalPercent.
     * </pre>
     *
     * <code>string runtime_key = 2;</code>
     */
    public java.lang.String getRuntimeKey() {
      java.lang.Object ref = runtimeKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        runtimeKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Runtime key for a YAML representation of a FractionalPercent.
     * </pre>
     *
     * <code>string runtime_key = 2;</code>
     */
    public com.google.protobuf.ByteString
        getRuntimeKeyBytes() {
      java.lang.Object ref = runtimeKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        runtimeKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Runtime key for a YAML representation of a FractionalPercent.
     * </pre>
     *
     * <code>string runtime_key = 2;</code>
     */
    public Builder setRuntimeKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      runtimeKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Runtime key for a YAML representation of a FractionalPercent.
     * </pre>
     *
     * <code>string runtime_key = 2;</code>
     */
    public Builder clearRuntimeKey() {
      
      runtimeKey_ = getDefaultInstance().getRuntimeKey();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Runtime key for a YAML representation of a FractionalPercent.
     * </pre>
     *
     * <code>string runtime_key = 2;</code>
     */
    public Builder setRuntimeKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      runtimeKey_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:envoy.api.v2.core.RuntimeFractionalPercent)
  }

  // @@protoc_insertion_point(class_scope:envoy.api.v2.core.RuntimeFractionalPercent)
  private static final io.grpc.xds.shaded.envoy.api.v2.core.RuntimeFractionalPercent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.xds.shaded.envoy.api.v2.core.RuntimeFractionalPercent();
  }

  public static io.grpc.xds.shaded.envoy.api.v2.core.RuntimeFractionalPercent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RuntimeFractionalPercent>
      PARSER = new com.google.protobuf.AbstractParser<RuntimeFractionalPercent>() {
    public RuntimeFractionalPercent parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RuntimeFractionalPercent(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RuntimeFractionalPercent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RuntimeFractionalPercent> getParserForType() {
    return PARSER;
  }

  public io.grpc.xds.shaded.envoy.api.v2.core.RuntimeFractionalPercent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

