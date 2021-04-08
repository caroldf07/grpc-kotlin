// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpcKotlin.proto

package br.com.zup;

/**
 * Protobuf type {@code br.com.zup.FuncionarioResponse}
 */
public final class FuncionarioResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:br.com.zup.FuncionarioResponse)
    FuncionarioResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FuncionarioResponse.newBuilder() to construct.
  private FuncionarioResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FuncionarioResponse() {
    nome_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FuncionarioResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FuncionarioResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            nome_ = s;
            break;
          }
          case 18: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (criadoEm_ != null) {
              subBuilder = criadoEm_.toBuilder();
            }
            criadoEm_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(criadoEm_);
              criadoEm_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
    return br.com.zup.GrpcKotlin.internal_static_br_com_zup_FuncionarioResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return br.com.zup.GrpcKotlin.internal_static_br_com_zup_FuncionarioResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            br.com.zup.FuncionarioResponse.class, br.com.zup.FuncionarioResponse.Builder.class);
  }

  public static final int NOME_FIELD_NUMBER = 1;
  private volatile java.lang.Object nome_;
  /**
   * <code>string nome = 1;</code>
   * @return The nome.
   */
  @java.lang.Override
  public java.lang.String getNome() {
    java.lang.Object ref = nome_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nome_ = s;
      return s;
    }
  }
  /**
   * <code>string nome = 1;</code>
   * @return The bytes for nome.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNomeBytes() {
    java.lang.Object ref = nome_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nome_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CRIADOEM_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp criadoEm_;
  /**
   * <code>.google.protobuf.Timestamp criadoEm = 2;</code>
   * @return Whether the criadoEm field is set.
   */
  @java.lang.Override
  public boolean hasCriadoEm() {
    return criadoEm_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp criadoEm = 2;</code>
   * @return The criadoEm.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getCriadoEm() {
    return criadoEm_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : criadoEm_;
  }
  /**
   * <code>.google.protobuf.Timestamp criadoEm = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getCriadoEmOrBuilder() {
    return getCriadoEm();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getNomeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, nome_);
    }
    if (criadoEm_ != null) {
      output.writeMessage(2, getCriadoEm());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNomeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, nome_);
    }
    if (criadoEm_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCriadoEm());
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
    if (!(obj instanceof br.com.zup.FuncionarioResponse)) {
      return super.equals(obj);
    }
    br.com.zup.FuncionarioResponse other = (br.com.zup.FuncionarioResponse) obj;

    if (!getNome()
        .equals(other.getNome())) return false;
    if (hasCriadoEm() != other.hasCriadoEm()) return false;
    if (hasCriadoEm()) {
      if (!getCriadoEm()
          .equals(other.getCriadoEm())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NOME_FIELD_NUMBER;
    hash = (53 * hash) + getNome().hashCode();
    if (hasCriadoEm()) {
      hash = (37 * hash) + CRIADOEM_FIELD_NUMBER;
      hash = (53 * hash) + getCriadoEm().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static br.com.zup.FuncionarioResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zup.FuncionarioResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zup.FuncionarioResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zup.FuncionarioResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zup.FuncionarioResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zup.FuncionarioResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zup.FuncionarioResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.zup.FuncionarioResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.zup.FuncionarioResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static br.com.zup.FuncionarioResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.zup.FuncionarioResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.zup.FuncionarioResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(br.com.zup.FuncionarioResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code br.com.zup.FuncionarioResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:br.com.zup.FuncionarioResponse)
      br.com.zup.FuncionarioResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return br.com.zup.GrpcKotlin.internal_static_br_com_zup_FuncionarioResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return br.com.zup.GrpcKotlin.internal_static_br_com_zup_FuncionarioResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              br.com.zup.FuncionarioResponse.class, br.com.zup.FuncionarioResponse.Builder.class);
    }

    // Construct using br.com.zup.FuncionarioResponse.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      nome_ = "";

      if (criadoEmBuilder_ == null) {
        criadoEm_ = null;
      } else {
        criadoEm_ = null;
        criadoEmBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return br.com.zup.GrpcKotlin.internal_static_br_com_zup_FuncionarioResponse_descriptor;
    }

    @java.lang.Override
    public br.com.zup.FuncionarioResponse getDefaultInstanceForType() {
      return br.com.zup.FuncionarioResponse.getDefaultInstance();
    }

    @java.lang.Override
    public br.com.zup.FuncionarioResponse build() {
      br.com.zup.FuncionarioResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public br.com.zup.FuncionarioResponse buildPartial() {
      br.com.zup.FuncionarioResponse result = new br.com.zup.FuncionarioResponse(this);
      result.nome_ = nome_;
      if (criadoEmBuilder_ == null) {
        result.criadoEm_ = criadoEm_;
      } else {
        result.criadoEm_ = criadoEmBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof br.com.zup.FuncionarioResponse) {
        return mergeFrom((br.com.zup.FuncionarioResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(br.com.zup.FuncionarioResponse other) {
      if (other == br.com.zup.FuncionarioResponse.getDefaultInstance()) return this;
      if (!other.getNome().isEmpty()) {
        nome_ = other.nome_;
        onChanged();
      }
      if (other.hasCriadoEm()) {
        mergeCriadoEm(other.getCriadoEm());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      br.com.zup.FuncionarioResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (br.com.zup.FuncionarioResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object nome_ = "";
    /**
     * <code>string nome = 1;</code>
     * @return The nome.
     */
    public java.lang.String getNome() {
      java.lang.Object ref = nome_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nome_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string nome = 1;</code>
     * @return The bytes for nome.
     */
    public com.google.protobuf.ByteString
        getNomeBytes() {
      java.lang.Object ref = nome_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nome_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string nome = 1;</code>
     * @param value The nome to set.
     * @return This builder for chaining.
     */
    public Builder setNome(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nome_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string nome = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNome() {
      
      nome_ = getDefaultInstance().getNome();
      onChanged();
      return this;
    }
    /**
     * <code>string nome = 1;</code>
     * @param value The bytes for nome to set.
     * @return This builder for chaining.
     */
    public Builder setNomeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nome_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp criadoEm_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> criadoEmBuilder_;
    /**
     * <code>.google.protobuf.Timestamp criadoEm = 2;</code>
     * @return Whether the criadoEm field is set.
     */
    public boolean hasCriadoEm() {
      return criadoEmBuilder_ != null || criadoEm_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp criadoEm = 2;</code>
     * @return The criadoEm.
     */
    public com.google.protobuf.Timestamp getCriadoEm() {
      if (criadoEmBuilder_ == null) {
        return criadoEm_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : criadoEm_;
      } else {
        return criadoEmBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp criadoEm = 2;</code>
     */
    public Builder setCriadoEm(com.google.protobuf.Timestamp value) {
      if (criadoEmBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        criadoEm_ = value;
        onChanged();
      } else {
        criadoEmBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp criadoEm = 2;</code>
     */
    public Builder setCriadoEm(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (criadoEmBuilder_ == null) {
        criadoEm_ = builderForValue.build();
        onChanged();
      } else {
        criadoEmBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp criadoEm = 2;</code>
     */
    public Builder mergeCriadoEm(com.google.protobuf.Timestamp value) {
      if (criadoEmBuilder_ == null) {
        if (criadoEm_ != null) {
          criadoEm_ =
            com.google.protobuf.Timestamp.newBuilder(criadoEm_).mergeFrom(value).buildPartial();
        } else {
          criadoEm_ = value;
        }
        onChanged();
      } else {
        criadoEmBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp criadoEm = 2;</code>
     */
    public Builder clearCriadoEm() {
      if (criadoEmBuilder_ == null) {
        criadoEm_ = null;
        onChanged();
      } else {
        criadoEm_ = null;
        criadoEmBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp criadoEm = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getCriadoEmBuilder() {
      
      onChanged();
      return getCriadoEmFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp criadoEm = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getCriadoEmOrBuilder() {
      if (criadoEmBuilder_ != null) {
        return criadoEmBuilder_.getMessageOrBuilder();
      } else {
        return criadoEm_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : criadoEm_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp criadoEm = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getCriadoEmFieldBuilder() {
      if (criadoEmBuilder_ == null) {
        criadoEmBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getCriadoEm(),
                getParentForChildren(),
                isClean());
        criadoEm_ = null;
      }
      return criadoEmBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:br.com.zup.FuncionarioResponse)
  }

  // @@protoc_insertion_point(class_scope:br.com.zup.FuncionarioResponse)
  private static final br.com.zup.FuncionarioResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new br.com.zup.FuncionarioResponse();
  }

  public static br.com.zup.FuncionarioResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FuncionarioResponse>
      PARSER = new com.google.protobuf.AbstractParser<FuncionarioResponse>() {
    @java.lang.Override
    public FuncionarioResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FuncionarioResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FuncionarioResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FuncionarioResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public br.com.zup.FuncionarioResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

