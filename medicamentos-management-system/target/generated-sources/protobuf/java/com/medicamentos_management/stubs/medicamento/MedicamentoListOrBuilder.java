// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: medicamento.proto

package com.medicamentos_management.stubs.medicamento;

public interface MedicamentoListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.medicamentos_management.stubs.medicamento.MedicamentoList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .com.medicamentos_management.stubs.medicamento.Medicamento resultList = 1;</code>
   */
  java.util.List<com.medicamentos_management.stubs.medicamento.Medicamento> 
      getResultListList();
  /**
   * <code>repeated .com.medicamentos_management.stubs.medicamento.Medicamento resultList = 1;</code>
   */
  com.medicamentos_management.stubs.medicamento.Medicamento getResultList(int index);
  /**
   * <code>repeated .com.medicamentos_management.stubs.medicamento.Medicamento resultList = 1;</code>
   */
  int getResultListCount();
  /**
   * <code>repeated .com.medicamentos_management.stubs.medicamento.Medicamento resultList = 1;</code>
   */
  java.util.List<? extends com.medicamentos_management.stubs.medicamento.MedicamentoOrBuilder> 
      getResultListOrBuilderList();
  /**
   * <code>repeated .com.medicamentos_management.stubs.medicamento.Medicamento resultList = 1;</code>
   */
  com.medicamentos_management.stubs.medicamento.MedicamentoOrBuilder getResultListOrBuilder(
      int index);

  /**
   * <code>.google.protobuf.Int32Value resultCount = 2;</code>
   * @return Whether the resultCount field is set.
   */
  boolean hasResultCount();
  /**
   * <code>.google.protobuf.Int32Value resultCount = 2;</code>
   * @return The resultCount.
   */
  com.google.protobuf.Int32Value getResultCount();
  /**
   * <code>.google.protobuf.Int32Value resultCount = 2;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getResultCountOrBuilder();
}
