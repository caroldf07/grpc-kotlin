// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpcKotlin.proto

package br.com.zup;

/**
 * Protobuf enum {@code br.com.zup.Cargo}
 */
public enum Cargo
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   *Dentro de um enum, o = é relativo ao tipo da enum, pois quando a informação for serializada, é essa informação que será utilizada para
   *especificar qual é o enum
   * </pre>
   *
   * <code>DEV = 0;</code>
   */
  DEV(0),
  /**
   * <code>QA = 1;</code>
   */
  QA(1),
  /**
   * <code>GERENTE = 2;</code>
   */
  GERENTE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   *Dentro de um enum, o = é relativo ao tipo da enum, pois quando a informação for serializada, é essa informação que será utilizada para
   *especificar qual é o enum
   * </pre>
   *
   * <code>DEV = 0;</code>
   */
  public static final int DEV_VALUE = 0;
  /**
   * <code>QA = 1;</code>
   */
  public static final int QA_VALUE = 1;
  /**
   * <code>GERENTE = 2;</code>
   */
  public static final int GERENTE_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Cargo valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Cargo forNumber(int value) {
    switch (value) {
      case 0: return DEV;
      case 1: return QA;
      case 2: return GERENTE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Cargo>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Cargo> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Cargo>() {
          public Cargo findValueByNumber(int number) {
            return Cargo.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return br.com.zup.GrpcKotlin.getDescriptor().getEnumTypes().get(0);
  }

  private static final Cargo[] VALUES = values();

  public static Cargo valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Cargo(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:br.com.zup.Cargo)
}

