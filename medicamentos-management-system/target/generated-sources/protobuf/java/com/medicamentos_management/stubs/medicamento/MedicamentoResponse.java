// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: medicamento.proto

package com.medicamentos_management.stubs.medicamento;

/**
 * Protobuf type {@code com.medicamentos_management.stubs.medicamento.MedicamentoResponse}
 */
public final class MedicamentoResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.medicamentos_management.stubs.medicamento.MedicamentoResponse)
    MedicamentoResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MedicamentoResponse.newBuilder() to construct.
  private MedicamentoResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MedicamentoResponse() {
    codigo_ = "";
    nombreComercial_ = "";
    nombreDroga_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MedicamentoResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MedicamentoResponse(
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
          case 8: {

            id_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            codigo_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            nombreComercial_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            nombreDroga_ = s;
            break;
          }
          case 42: {
            com.medicamentos_management.stubs.medicamento.TipoMedicamento.Builder subBuilder = null;
            if (tipo_ != null) {
              subBuilder = tipo_.toBuilder();
            }
            tipo_ = input.readMessage(com.medicamentos_management.stubs.medicamento.TipoMedicamento.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(tipo_);
              tipo_ = subBuilder.buildPartial();
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
    return com.medicamentos_management.stubs.medicamento.MedicamentoOuterClass.internal_static_com_medicamentos_management_stubs_medicamento_MedicamentoResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.medicamentos_management.stubs.medicamento.MedicamentoOuterClass.internal_static_com_medicamentos_management_stubs_medicamento_MedicamentoResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.medicamentos_management.stubs.medicamento.MedicamentoResponse.class, com.medicamentos_management.stubs.medicamento.MedicamentoResponse.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public int getId() {
    return id_;
  }

  public static final int CODIGO_FIELD_NUMBER = 2;
  private volatile java.lang.Object codigo_;
  /**
   * <code>string codigo = 2;</code>
   * @return The codigo.
   */
  @java.lang.Override
  public java.lang.String getCodigo() {
    java.lang.Object ref = codigo_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      codigo_ = s;
      return s;
    }
  }
  /**
   * <code>string codigo = 2;</code>
   * @return The bytes for codigo.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCodigoBytes() {
    java.lang.Object ref = codigo_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      codigo_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NOMBRECOMERCIAL_FIELD_NUMBER = 3;
  private volatile java.lang.Object nombreComercial_;
  /**
   * <code>string nombreComercial = 3;</code>
   * @return The nombreComercial.
   */
  @java.lang.Override
  public java.lang.String getNombreComercial() {
    java.lang.Object ref = nombreComercial_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nombreComercial_ = s;
      return s;
    }
  }
  /**
   * <code>string nombreComercial = 3;</code>
   * @return The bytes for nombreComercial.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNombreComercialBytes() {
    java.lang.Object ref = nombreComercial_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nombreComercial_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NOMBREDROGA_FIELD_NUMBER = 4;
  private volatile java.lang.Object nombreDroga_;
  /**
   * <code>string nombreDroga = 4;</code>
   * @return The nombreDroga.
   */
  @java.lang.Override
  public java.lang.String getNombreDroga() {
    java.lang.Object ref = nombreDroga_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nombreDroga_ = s;
      return s;
    }
  }
  /**
   * <code>string nombreDroga = 4;</code>
   * @return The bytes for nombreDroga.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNombreDrogaBytes() {
    java.lang.Object ref = nombreDroga_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nombreDroga_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TIPO_FIELD_NUMBER = 5;
  private com.medicamentos_management.stubs.medicamento.TipoMedicamento tipo_;
  /**
   * <code>.com.medicamentos_management.stubs.medicamento.TipoMedicamento tipo = 5;</code>
   * @return Whether the tipo field is set.
   */
  @java.lang.Override
  public boolean hasTipo() {
    return tipo_ != null;
  }
  /**
   * <code>.com.medicamentos_management.stubs.medicamento.TipoMedicamento tipo = 5;</code>
   * @return The tipo.
   */
  @java.lang.Override
  public com.medicamentos_management.stubs.medicamento.TipoMedicamento getTipo() {
    return tipo_ == null ? com.medicamentos_management.stubs.medicamento.TipoMedicamento.getDefaultInstance() : tipo_;
  }
  /**
   * <code>.com.medicamentos_management.stubs.medicamento.TipoMedicamento tipo = 5;</code>
   */
  @java.lang.Override
  public com.medicamentos_management.stubs.medicamento.TipoMedicamentoOrBuilder getTipoOrBuilder() {
    return getTipo();
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
    if (id_ != 0) {
      output.writeInt32(1, id_);
    }
    if (!getCodigoBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, codigo_);
    }
    if (!getNombreComercialBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, nombreComercial_);
    }
    if (!getNombreDrogaBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, nombreDroga_);
    }
    if (tipo_ != null) {
      output.writeMessage(5, getTipo());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, id_);
    }
    if (!getCodigoBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, codigo_);
    }
    if (!getNombreComercialBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, nombreComercial_);
    }
    if (!getNombreDrogaBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, nombreDroga_);
    }
    if (tipo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getTipo());
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
    if (!(obj instanceof com.medicamentos_management.stubs.medicamento.MedicamentoResponse)) {
      return super.equals(obj);
    }
    com.medicamentos_management.stubs.medicamento.MedicamentoResponse other = (com.medicamentos_management.stubs.medicamento.MedicamentoResponse) obj;

    if (getId()
        != other.getId()) return false;
    if (!getCodigo()
        .equals(other.getCodigo())) return false;
    if (!getNombreComercial()
        .equals(other.getNombreComercial())) return false;
    if (!getNombreDroga()
        .equals(other.getNombreDroga())) return false;
    if (hasTipo() != other.hasTipo()) return false;
    if (hasTipo()) {
      if (!getTipo()
          .equals(other.getTipo())) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (37 * hash) + CODIGO_FIELD_NUMBER;
    hash = (53 * hash) + getCodigo().hashCode();
    hash = (37 * hash) + NOMBRECOMERCIAL_FIELD_NUMBER;
    hash = (53 * hash) + getNombreComercial().hashCode();
    hash = (37 * hash) + NOMBREDROGA_FIELD_NUMBER;
    hash = (53 * hash) + getNombreDroga().hashCode();
    if (hasTipo()) {
      hash = (37 * hash) + TIPO_FIELD_NUMBER;
      hash = (53 * hash) + getTipo().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.medicamentos_management.stubs.medicamento.MedicamentoResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.medicamentos_management.stubs.medicamento.MedicamentoResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.medicamentos_management.stubs.medicamento.MedicamentoResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.medicamentos_management.stubs.medicamento.MedicamentoResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.medicamentos_management.stubs.medicamento.MedicamentoResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.medicamentos_management.stubs.medicamento.MedicamentoResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.medicamentos_management.stubs.medicamento.MedicamentoResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.medicamentos_management.stubs.medicamento.MedicamentoResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.medicamentos_management.stubs.medicamento.MedicamentoResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.medicamentos_management.stubs.medicamento.MedicamentoResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.medicamentos_management.stubs.medicamento.MedicamentoResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.medicamentos_management.stubs.medicamento.MedicamentoResponse parseFrom(
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
  public static Builder newBuilder(com.medicamentos_management.stubs.medicamento.MedicamentoResponse prototype) {
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
   * Protobuf type {@code com.medicamentos_management.stubs.medicamento.MedicamentoResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.medicamentos_management.stubs.medicamento.MedicamentoResponse)
      com.medicamentos_management.stubs.medicamento.MedicamentoResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.medicamentos_management.stubs.medicamento.MedicamentoOuterClass.internal_static_com_medicamentos_management_stubs_medicamento_MedicamentoResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.medicamentos_management.stubs.medicamento.MedicamentoOuterClass.internal_static_com_medicamentos_management_stubs_medicamento_MedicamentoResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.medicamentos_management.stubs.medicamento.MedicamentoResponse.class, com.medicamentos_management.stubs.medicamento.MedicamentoResponse.Builder.class);
    }

    // Construct using com.medicamentos_management.stubs.medicamento.MedicamentoResponse.newBuilder()
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
      id_ = 0;

      codigo_ = "";

      nombreComercial_ = "";

      nombreDroga_ = "";

      if (tipoBuilder_ == null) {
        tipo_ = null;
      } else {
        tipo_ = null;
        tipoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.medicamentos_management.stubs.medicamento.MedicamentoOuterClass.internal_static_com_medicamentos_management_stubs_medicamento_MedicamentoResponse_descriptor;
    }

    @java.lang.Override
    public com.medicamentos_management.stubs.medicamento.MedicamentoResponse getDefaultInstanceForType() {
      return com.medicamentos_management.stubs.medicamento.MedicamentoResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.medicamentos_management.stubs.medicamento.MedicamentoResponse build() {
      com.medicamentos_management.stubs.medicamento.MedicamentoResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.medicamentos_management.stubs.medicamento.MedicamentoResponse buildPartial() {
      com.medicamentos_management.stubs.medicamento.MedicamentoResponse result = new com.medicamentos_management.stubs.medicamento.MedicamentoResponse(this);
      result.id_ = id_;
      result.codigo_ = codigo_;
      result.nombreComercial_ = nombreComercial_;
      result.nombreDroga_ = nombreDroga_;
      if (tipoBuilder_ == null) {
        result.tipo_ = tipo_;
      } else {
        result.tipo_ = tipoBuilder_.build();
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
      if (other instanceof com.medicamentos_management.stubs.medicamento.MedicamentoResponse) {
        return mergeFrom((com.medicamentos_management.stubs.medicamento.MedicamentoResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.medicamentos_management.stubs.medicamento.MedicamentoResponse other) {
      if (other == com.medicamentos_management.stubs.medicamento.MedicamentoResponse.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (!other.getCodigo().isEmpty()) {
        codigo_ = other.codigo_;
        onChanged();
      }
      if (!other.getNombreComercial().isEmpty()) {
        nombreComercial_ = other.nombreComercial_;
        onChanged();
      }
      if (!other.getNombreDroga().isEmpty()) {
        nombreDroga_ = other.nombreDroga_;
        onChanged();
      }
      if (other.hasTipo()) {
        mergeTipo(other.getTipo());
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
      com.medicamentos_management.stubs.medicamento.MedicamentoResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.medicamentos_management.stubs.medicamento.MedicamentoResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int id_ ;
    /**
     * <code>int32 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }
    /**
     * <code>int32 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object codigo_ = "";
    /**
     * <code>string codigo = 2;</code>
     * @return The codigo.
     */
    public java.lang.String getCodigo() {
      java.lang.Object ref = codigo_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        codigo_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string codigo = 2;</code>
     * @return The bytes for codigo.
     */
    public com.google.protobuf.ByteString
        getCodigoBytes() {
      java.lang.Object ref = codigo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        codigo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string codigo = 2;</code>
     * @param value The codigo to set.
     * @return This builder for chaining.
     */
    public Builder setCodigo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      codigo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string codigo = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCodigo() {
      
      codigo_ = getDefaultInstance().getCodigo();
      onChanged();
      return this;
    }
    /**
     * <code>string codigo = 2;</code>
     * @param value The bytes for codigo to set.
     * @return This builder for chaining.
     */
    public Builder setCodigoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      codigo_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object nombreComercial_ = "";
    /**
     * <code>string nombreComercial = 3;</code>
     * @return The nombreComercial.
     */
    public java.lang.String getNombreComercial() {
      java.lang.Object ref = nombreComercial_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nombreComercial_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string nombreComercial = 3;</code>
     * @return The bytes for nombreComercial.
     */
    public com.google.protobuf.ByteString
        getNombreComercialBytes() {
      java.lang.Object ref = nombreComercial_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nombreComercial_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string nombreComercial = 3;</code>
     * @param value The nombreComercial to set.
     * @return This builder for chaining.
     */
    public Builder setNombreComercial(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nombreComercial_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string nombreComercial = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNombreComercial() {
      
      nombreComercial_ = getDefaultInstance().getNombreComercial();
      onChanged();
      return this;
    }
    /**
     * <code>string nombreComercial = 3;</code>
     * @param value The bytes for nombreComercial to set.
     * @return This builder for chaining.
     */
    public Builder setNombreComercialBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nombreComercial_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object nombreDroga_ = "";
    /**
     * <code>string nombreDroga = 4;</code>
     * @return The nombreDroga.
     */
    public java.lang.String getNombreDroga() {
      java.lang.Object ref = nombreDroga_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nombreDroga_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string nombreDroga = 4;</code>
     * @return The bytes for nombreDroga.
     */
    public com.google.protobuf.ByteString
        getNombreDrogaBytes() {
      java.lang.Object ref = nombreDroga_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nombreDroga_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string nombreDroga = 4;</code>
     * @param value The nombreDroga to set.
     * @return This builder for chaining.
     */
    public Builder setNombreDroga(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nombreDroga_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string nombreDroga = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearNombreDroga() {
      
      nombreDroga_ = getDefaultInstance().getNombreDroga();
      onChanged();
      return this;
    }
    /**
     * <code>string nombreDroga = 4;</code>
     * @param value The bytes for nombreDroga to set.
     * @return This builder for chaining.
     */
    public Builder setNombreDrogaBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nombreDroga_ = value;
      onChanged();
      return this;
    }

    private com.medicamentos_management.stubs.medicamento.TipoMedicamento tipo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.medicamentos_management.stubs.medicamento.TipoMedicamento, com.medicamentos_management.stubs.medicamento.TipoMedicamento.Builder, com.medicamentos_management.stubs.medicamento.TipoMedicamentoOrBuilder> tipoBuilder_;
    /**
     * <code>.com.medicamentos_management.stubs.medicamento.TipoMedicamento tipo = 5;</code>
     * @return Whether the tipo field is set.
     */
    public boolean hasTipo() {
      return tipoBuilder_ != null || tipo_ != null;
    }
    /**
     * <code>.com.medicamentos_management.stubs.medicamento.TipoMedicamento tipo = 5;</code>
     * @return The tipo.
     */
    public com.medicamentos_management.stubs.medicamento.TipoMedicamento getTipo() {
      if (tipoBuilder_ == null) {
        return tipo_ == null ? com.medicamentos_management.stubs.medicamento.TipoMedicamento.getDefaultInstance() : tipo_;
      } else {
        return tipoBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.medicamentos_management.stubs.medicamento.TipoMedicamento tipo = 5;</code>
     */
    public Builder setTipo(com.medicamentos_management.stubs.medicamento.TipoMedicamento value) {
      if (tipoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tipo_ = value;
        onChanged();
      } else {
        tipoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.medicamentos_management.stubs.medicamento.TipoMedicamento tipo = 5;</code>
     */
    public Builder setTipo(
        com.medicamentos_management.stubs.medicamento.TipoMedicamento.Builder builderForValue) {
      if (tipoBuilder_ == null) {
        tipo_ = builderForValue.build();
        onChanged();
      } else {
        tipoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.medicamentos_management.stubs.medicamento.TipoMedicamento tipo = 5;</code>
     */
    public Builder mergeTipo(com.medicamentos_management.stubs.medicamento.TipoMedicamento value) {
      if (tipoBuilder_ == null) {
        if (tipo_ != null) {
          tipo_ =
            com.medicamentos_management.stubs.medicamento.TipoMedicamento.newBuilder(tipo_).mergeFrom(value).buildPartial();
        } else {
          tipo_ = value;
        }
        onChanged();
      } else {
        tipoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.medicamentos_management.stubs.medicamento.TipoMedicamento tipo = 5;</code>
     */
    public Builder clearTipo() {
      if (tipoBuilder_ == null) {
        tipo_ = null;
        onChanged();
      } else {
        tipo_ = null;
        tipoBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.medicamentos_management.stubs.medicamento.TipoMedicamento tipo = 5;</code>
     */
    public com.medicamentos_management.stubs.medicamento.TipoMedicamento.Builder getTipoBuilder() {
      
      onChanged();
      return getTipoFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.medicamentos_management.stubs.medicamento.TipoMedicamento tipo = 5;</code>
     */
    public com.medicamentos_management.stubs.medicamento.TipoMedicamentoOrBuilder getTipoOrBuilder() {
      if (tipoBuilder_ != null) {
        return tipoBuilder_.getMessageOrBuilder();
      } else {
        return tipo_ == null ?
            com.medicamentos_management.stubs.medicamento.TipoMedicamento.getDefaultInstance() : tipo_;
      }
    }
    /**
     * <code>.com.medicamentos_management.stubs.medicamento.TipoMedicamento tipo = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.medicamentos_management.stubs.medicamento.TipoMedicamento, com.medicamentos_management.stubs.medicamento.TipoMedicamento.Builder, com.medicamentos_management.stubs.medicamento.TipoMedicamentoOrBuilder> 
        getTipoFieldBuilder() {
      if (tipoBuilder_ == null) {
        tipoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.medicamentos_management.stubs.medicamento.TipoMedicamento, com.medicamentos_management.stubs.medicamento.TipoMedicamento.Builder, com.medicamentos_management.stubs.medicamento.TipoMedicamentoOrBuilder>(
                getTipo(),
                getParentForChildren(),
                isClean());
        tipo_ = null;
      }
      return tipoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.medicamentos_management.stubs.medicamento.MedicamentoResponse)
  }

  // @@protoc_insertion_point(class_scope:com.medicamentos_management.stubs.medicamento.MedicamentoResponse)
  private static final com.medicamentos_management.stubs.medicamento.MedicamentoResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.medicamentos_management.stubs.medicamento.MedicamentoResponse();
  }

  public static com.medicamentos_management.stubs.medicamento.MedicamentoResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MedicamentoResponse>
      PARSER = new com.google.protobuf.AbstractParser<MedicamentoResponse>() {
    @java.lang.Override
    public MedicamentoResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MedicamentoResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MedicamentoResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MedicamentoResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.medicamentos_management.stubs.medicamento.MedicamentoResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

