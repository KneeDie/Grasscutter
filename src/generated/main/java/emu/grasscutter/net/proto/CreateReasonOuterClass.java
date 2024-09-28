// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CreateReason.proto

package emu.grasscutter.net.proto;

public final class CreateReasonOuterClass {
  private CreateReasonOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code CreateReason}
   */
  public enum CreateReason
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>CREATE_NONE = 0;</code>
     */
    CREATE_NONE(0),
    /**
     * <code>CREATE_QUEST = 1;</code>
     */
    CREATE_QUEST(1),
    /**
     * <code>CREATE_ENERGY = 2;</code>
     */
    CREATE_ENERGY(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>CREATE_NONE = 0;</code>
     */
    public static final int CREATE_NONE_VALUE = 0;
    /**
     * <code>CREATE_QUEST = 1;</code>
     */
    public static final int CREATE_QUEST_VALUE = 1;
    /**
     * <code>CREATE_ENERGY = 2;</code>
     */
    public static final int CREATE_ENERGY_VALUE = 2;


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
    public static CreateReason valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CreateReason forNumber(int value) {
      switch (value) {
        case 0: return CREATE_NONE;
        case 1: return CREATE_QUEST;
        case 2: return CREATE_ENERGY;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CreateReason>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CreateReason> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CreateReason>() {
            public CreateReason findValueByNumber(int number) {
              return CreateReason.forNumber(number);
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
      return emu.grasscutter.net.proto.CreateReasonOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final CreateReason[] VALUES = values();

    public static CreateReason valueOf(
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

    private CreateReason(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:CreateReason)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022CreateReason.proto*D\n\014CreateReason\022\017\n\013" +
      "CREATE_NONE\020\000\022\020\n\014CREATE_QUEST\020\001\022\021\n\rCREAT" +
      "E_ENERGY\020\002B\033\n\031emu.grasscutter.net.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
