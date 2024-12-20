// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CompteService.proto

package ma.projet.grpc.stubs;

/**
 * <pre>
 * Search for accounts by date of creation
 * </pre>
 *
 * Protobuf type {@code SearchComptesByDateRequest}
 */
public  final class SearchComptesByDateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SearchComptesByDateRequest)
    SearchComptesByDateRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SearchComptesByDateRequest.newBuilder() to construct.
  private SearchComptesByDateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SearchComptesByDateRequest() {
    dateCreation_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SearchComptesByDateRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SearchComptesByDateRequest(
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

            dateCreation_ = s;
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
    return ma.projet.grpc.stubs.CompteServiceOuterClass.internal_static_SearchComptesByDateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ma.projet.grpc.stubs.CompteServiceOuterClass.internal_static_SearchComptesByDateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ma.projet.grpc.stubs.SearchComptesByDateRequest.class, ma.projet.grpc.stubs.SearchComptesByDateRequest.Builder.class);
  }

  public static final int DATECREATION_FIELD_NUMBER = 1;
  private volatile java.lang.Object dateCreation_;
  /**
   * <code>string dateCreation = 1;</code>
   * @return The dateCreation.
   */
  public java.lang.String getDateCreation() {
    java.lang.Object ref = dateCreation_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dateCreation_ = s;
      return s;
    }
  }
  /**
   * <code>string dateCreation = 1;</code>
   * @return The bytes for dateCreation.
   */
  public com.google.protobuf.ByteString
      getDateCreationBytes() {
    java.lang.Object ref = dateCreation_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dateCreation_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getDateCreationBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, dateCreation_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDateCreationBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, dateCreation_);
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
    if (!(obj instanceof ma.projet.grpc.stubs.SearchComptesByDateRequest)) {
      return super.equals(obj);
    }
    ma.projet.grpc.stubs.SearchComptesByDateRequest other = (ma.projet.grpc.stubs.SearchComptesByDateRequest) obj;

    if (!getDateCreation()
        .equals(other.getDateCreation())) return false;
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
    hash = (37 * hash) + DATECREATION_FIELD_NUMBER;
    hash = (53 * hash) + getDateCreation().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ma.projet.grpc.stubs.SearchComptesByDateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ma.projet.grpc.stubs.SearchComptesByDateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ma.projet.grpc.stubs.SearchComptesByDateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ma.projet.grpc.stubs.SearchComptesByDateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ma.projet.grpc.stubs.SearchComptesByDateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ma.projet.grpc.stubs.SearchComptesByDateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ma.projet.grpc.stubs.SearchComptesByDateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ma.projet.grpc.stubs.SearchComptesByDateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ma.projet.grpc.stubs.SearchComptesByDateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ma.projet.grpc.stubs.SearchComptesByDateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ma.projet.grpc.stubs.SearchComptesByDateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ma.projet.grpc.stubs.SearchComptesByDateRequest parseFrom(
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
  public static Builder newBuilder(ma.projet.grpc.stubs.SearchComptesByDateRequest prototype) {
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
   * <pre>
   * Search for accounts by date of creation
   * </pre>
   *
   * Protobuf type {@code SearchComptesByDateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SearchComptesByDateRequest)
      ma.projet.grpc.stubs.SearchComptesByDateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ma.projet.grpc.stubs.CompteServiceOuterClass.internal_static_SearchComptesByDateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ma.projet.grpc.stubs.CompteServiceOuterClass.internal_static_SearchComptesByDateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ma.projet.grpc.stubs.SearchComptesByDateRequest.class, ma.projet.grpc.stubs.SearchComptesByDateRequest.Builder.class);
    }

    // Construct using ma.projet.grpc.stubs.SearchComptesByDateRequest.newBuilder()
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
      dateCreation_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ma.projet.grpc.stubs.CompteServiceOuterClass.internal_static_SearchComptesByDateRequest_descriptor;
    }

    @java.lang.Override
    public ma.projet.grpc.stubs.SearchComptesByDateRequest getDefaultInstanceForType() {
      return ma.projet.grpc.stubs.SearchComptesByDateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public ma.projet.grpc.stubs.SearchComptesByDateRequest build() {
      ma.projet.grpc.stubs.SearchComptesByDateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ma.projet.grpc.stubs.SearchComptesByDateRequest buildPartial() {
      ma.projet.grpc.stubs.SearchComptesByDateRequest result = new ma.projet.grpc.stubs.SearchComptesByDateRequest(this);
      result.dateCreation_ = dateCreation_;
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
      if (other instanceof ma.projet.grpc.stubs.SearchComptesByDateRequest) {
        return mergeFrom((ma.projet.grpc.stubs.SearchComptesByDateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ma.projet.grpc.stubs.SearchComptesByDateRequest other) {
      if (other == ma.projet.grpc.stubs.SearchComptesByDateRequest.getDefaultInstance()) return this;
      if (!other.getDateCreation().isEmpty()) {
        dateCreation_ = other.dateCreation_;
        onChanged();
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
      ma.projet.grpc.stubs.SearchComptesByDateRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ma.projet.grpc.stubs.SearchComptesByDateRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object dateCreation_ = "";
    /**
     * <code>string dateCreation = 1;</code>
     * @return The dateCreation.
     */
    public java.lang.String getDateCreation() {
      java.lang.Object ref = dateCreation_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dateCreation_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dateCreation = 1;</code>
     * @return The bytes for dateCreation.
     */
    public com.google.protobuf.ByteString
        getDateCreationBytes() {
      java.lang.Object ref = dateCreation_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dateCreation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dateCreation = 1;</code>
     * @param value The dateCreation to set.
     * @return This builder for chaining.
     */
    public Builder setDateCreation(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dateCreation_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string dateCreation = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDateCreation() {
      
      dateCreation_ = getDefaultInstance().getDateCreation();
      onChanged();
      return this;
    }
    /**
     * <code>string dateCreation = 1;</code>
     * @param value The bytes for dateCreation to set.
     * @return This builder for chaining.
     */
    public Builder setDateCreationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dateCreation_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:SearchComptesByDateRequest)
  }

  // @@protoc_insertion_point(class_scope:SearchComptesByDateRequest)
  private static final ma.projet.grpc.stubs.SearchComptesByDateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ma.projet.grpc.stubs.SearchComptesByDateRequest();
  }

  public static ma.projet.grpc.stubs.SearchComptesByDateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchComptesByDateRequest>
      PARSER = new com.google.protobuf.AbstractParser<SearchComptesByDateRequest>() {
    @java.lang.Override
    public SearchComptesByDateRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SearchComptesByDateRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SearchComptesByDateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchComptesByDateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ma.projet.grpc.stubs.SearchComptesByDateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

