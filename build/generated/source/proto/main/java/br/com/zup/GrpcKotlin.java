// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpcKotlin.proto

package br.com.zup;

public final class GrpcKotlin {
  private GrpcKotlin() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_br_com_zup_FuncionarioRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_br_com_zup_FuncionarioRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_br_com_zup_FuncionarioRequest_Endereco_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_br_com_zup_FuncionarioRequest_Endereco_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_br_com_zup_FuncionarioResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_br_com_zup_FuncionarioResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020grpcKotlin.proto\022\nbr.com.zup\032\037google/p" +
      "rotobuf/timestamp.proto\"\376\001\n\022FuncionarioR" +
      "equest\022\014\n\004nome\030\001 \001(\t\022\013\n\003cpf\030\002 \001(\t\022\r\n\005ida" +
      "de\030\003 \001(\005\022\017\n\007salario\030\004 \001(\001\022\r\n\005ativo\030\005 \001(\010" +
      "\022 \n\005cargo\030\006 \001(\0162\021.br.com.zup.Cargo\022:\n\ten" +
      "derecos\030\007 \003(\0132\'.br.com.zup.FuncionarioRe" +
      "quest.Endereco\032@\n\010Endereco\022\022\n\nlogradouro" +
      "\030\001 \001(\t\022\013\n\003cep\030\002 \001(\t\022\023\n\013complemento\030\003 \001(\t" +
      "\"Q\n\023FuncionarioResponse\022\014\n\004nome\030\001 \001(\t\022,\n" +
      "\010criadoEm\030\002 \001(\0132\032.google.protobuf.Timest" +
      "amp*%\n\005Cargo\022\007\n\003DEV\020\000\022\006\n\002QA\020\001\022\013\n\007GERENTE" +
      "\020\0022d\n\022FuncionarioService\022N\n\tcadastrar\022\036." +
      "br.com.zup.FuncionarioRequest\032\037.br.com.z" +
      "up.FuncionarioResponse\"\000B\032\n\nbr.com.zupB\n" +
      "GrpcKotlinP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_br_com_zup_FuncionarioRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_br_com_zup_FuncionarioRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_br_com_zup_FuncionarioRequest_descriptor,
        new java.lang.String[] { "Nome", "Cpf", "Idade", "Salario", "Ativo", "Cargo", "Enderecos", });
    internal_static_br_com_zup_FuncionarioRequest_Endereco_descriptor =
      internal_static_br_com_zup_FuncionarioRequest_descriptor.getNestedTypes().get(0);
    internal_static_br_com_zup_FuncionarioRequest_Endereco_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_br_com_zup_FuncionarioRequest_Endereco_descriptor,
        new java.lang.String[] { "Logradouro", "Cep", "Complemento", });
    internal_static_br_com_zup_FuncionarioResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_br_com_zup_FuncionarioResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_br_com_zup_FuncionarioResponse_descriptor,
        new java.lang.String[] { "Nome", "CriadoEm", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
