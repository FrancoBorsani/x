// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tipoMedicamento.proto

package com.medicamentos_management.stubs.tipoMedicamento;

public final class TipoMedicamento {
  private TipoMedicamento() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_medicamentos_management_stubs_tipoMedicamento_TipoMedicamentoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_medicamentos_management_stubs_tipoMedicamento_TipoMedicamentoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_medicamentos_management_stubs_tipoMedicamento_TipoMedicamentoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_medicamentos_management_stubs_tipoMedicamento_TipoMedicamentoResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025tipoMedicamento.proto\0221com.medicamento" +
      "s_management.stubs.tipoMedicamento\032\033goog" +
      "le/protobuf/empty.proto\032\036google/protobuf" +
      "/wrappers.proto\032\031google/protobuf/any.pro" +
      "to\"4\n\026TipoMedicamentoRequest\022\n\n\002id\030\001 \001(\005" +
      "\022\016\n\006nombre\030\002 \001(\t\"5\n\027TipoMedicamentoRespo" +
      "nse\022\n\n\002id\030\001 \001(\005\022\016\n\006nombre\030\002 \001(\t2\311\003\n\026Tipo" +
      "MedicamentoService\022\256\001\n\023altaTipoMedicamen" +
      "to\022I.com.medicamentos_management.stubs.t" +
      "ipoMedicamento.TipoMedicamentoRequest\032J." +
      "com.medicamentos_management.stubs.tipoMe" +
      "dicamento.TipoMedicamentoResponse\"\000\022L\n\023b" +
      "ajaTipoMedicamento\022\033.google.protobuf.Int" +
      "32Value\032\026.google.protobuf.Empty\"\000\022\257\001\n\026ge" +
      "tTipoMedicamentoInfo\022I.com.medicamentos_" +
      "management.stubs.tipoMedicamento.TipoMed" +
      "icamentoRequest\032J.com.medicamentos_manag" +
      "ement.stubs.tipoMedicamento.TipoMedicame" +
      "ntoResponseB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
        });
    internal_static_com_medicamentos_management_stubs_tipoMedicamento_TipoMedicamentoRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_medicamentos_management_stubs_tipoMedicamento_TipoMedicamentoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_medicamentos_management_stubs_tipoMedicamento_TipoMedicamentoRequest_descriptor,
        new java.lang.String[] { "Id", "Nombre", });
    internal_static_com_medicamentos_management_stubs_tipoMedicamento_TipoMedicamentoResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_medicamentos_management_stubs_tipoMedicamento_TipoMedicamentoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_medicamentos_management_stubs_tipoMedicamento_TipoMedicamentoResponse_descriptor,
        new java.lang.String[] { "Id", "Nombre", });
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
