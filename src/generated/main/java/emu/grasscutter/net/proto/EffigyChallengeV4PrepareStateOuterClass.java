// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EffigyChallengeV4PrepareState.proto

package emu.grasscutter.net.proto;

public final class EffigyChallengeV4PrepareStateOuterClass {
  private EffigyChallengeV4PrepareStateOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code EffigyChallengeV4PrepareState}
   */
  public enum EffigyChallengeV4PrepareState
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>IDLE = 0;</code>
     */
    IDLE(0),
    /**
     * <code>CHANGING_AVATAR = 1;</code>
     */
    CHANGING_AVATAR(1),
    /**
     * <code>READY = 2;</code>
     */
    READY(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>IDLE = 0;</code>
     */
    public static final int IDLE_VALUE = 0;
    /**
     * <code>CHANGING_AVATAR = 1;</code>
     */
    public static final int CHANGING_AVATAR_VALUE = 1;
    /**
     * <code>READY = 2;</code>
     */
    public static final int READY_VALUE = 2;


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
    public static EffigyChallengeV4PrepareState valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static EffigyChallengeV4PrepareState forNumber(int value) {
      switch (value) {
        case 0: return IDLE;
        case 1: return CHANGING_AVATAR;
        case 2: return READY;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<EffigyChallengeV4PrepareState>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        EffigyChallengeV4PrepareState> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<EffigyChallengeV4PrepareState>() {
            public EffigyChallengeV4PrepareState findValueByNumber(int number) {
              return EffigyChallengeV4PrepareState.forNumber(number);
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
      return emu.grasscutter.net.proto.EffigyChallengeV4PrepareStateOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final EffigyChallengeV4PrepareState[] VALUES = values();

    public static EffigyChallengeV4PrepareState valueOf(
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

    private EffigyChallengeV4PrepareState(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:EffigyChallengeV4PrepareState)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#EffigyChallengeV4PrepareState.proto*I\n" +
      "\035EffigyChallengeV4PrepareState\022\010\n\004IDLE\020\000" +
      "\022\023\n\017CHANGING_AVATAR\020\001\022\t\n\005READY\020\002B\033\n\031emu." +
      "grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
