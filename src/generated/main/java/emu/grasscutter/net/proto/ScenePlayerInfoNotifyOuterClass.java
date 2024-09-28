// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ScenePlayerInfoNotify.proto

package emu.grasscutter.net.proto;

public final class ScenePlayerInfoNotifyOuterClass {
  private ScenePlayerInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ScenePlayerInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ScenePlayerInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .ScenePlayerInfo player_info_list = 3;</code>
     */
    java.util.List<emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo> 
        getPlayerInfoListList();
    /**
     * <code>repeated .ScenePlayerInfo player_info_list = 3;</code>
     */
    emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo getPlayerInfoList(int index);
    /**
     * <code>repeated .ScenePlayerInfo player_info_list = 3;</code>
     */
    int getPlayerInfoListCount();
    /**
     * <code>repeated .ScenePlayerInfo player_info_list = 3;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfoOrBuilder> 
        getPlayerInfoListOrBuilderList();
    /**
     * <code>repeated .ScenePlayerInfo player_info_list = 3;</code>
     */
    emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfoOrBuilder getPlayerInfoListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code ScenePlayerInfoNotify}
   */
  public static final class ScenePlayerInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ScenePlayerInfoNotify)
      ScenePlayerInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ScenePlayerInfoNotify.newBuilder() to construct.
    private ScenePlayerInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ScenePlayerInfoNotify() {
      playerInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ScenePlayerInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ScenePlayerInfoNotify(
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
            case 26: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                playerInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              playerInfoList_.add(
                  input.readMessage(emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          playerInfoList_ = java.util.Collections.unmodifiableList(playerInfoList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.internal_static_ScenePlayerInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.internal_static_ScenePlayerInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify.class, emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify.Builder.class);
    }

    public static final int PLAYER_INFO_LIST_FIELD_NUMBER = 3;
    private java.util.List<emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo> playerInfoList_;
    /**
     * <code>repeated .ScenePlayerInfo player_info_list = 3;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo> getPlayerInfoListList() {
      return playerInfoList_;
    }
    /**
     * <code>repeated .ScenePlayerInfo player_info_list = 3;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfoOrBuilder> 
        getPlayerInfoListOrBuilderList() {
      return playerInfoList_;
    }
    /**
     * <code>repeated .ScenePlayerInfo player_info_list = 3;</code>
     */
    @java.lang.Override
    public int getPlayerInfoListCount() {
      return playerInfoList_.size();
    }
    /**
     * <code>repeated .ScenePlayerInfo player_info_list = 3;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo getPlayerInfoList(int index) {
      return playerInfoList_.get(index);
    }
    /**
     * <code>repeated .ScenePlayerInfo player_info_list = 3;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfoOrBuilder getPlayerInfoListOrBuilder(
        int index) {
      return playerInfoList_.get(index);
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
      for (int i = 0; i < playerInfoList_.size(); i++) {
        output.writeMessage(3, playerInfoList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < playerInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, playerInfoList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify other = (emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify) obj;

      if (!getPlayerInfoListList()
          .equals(other.getPlayerInfoListList())) return false;
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
      if (getPlayerInfoListCount() > 0) {
        hash = (37 * hash) + PLAYER_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getPlayerInfoListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify prototype) {
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
     * Protobuf type {@code ScenePlayerInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ScenePlayerInfoNotify)
        emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.internal_static_ScenePlayerInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.internal_static_ScenePlayerInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify.class, emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify.newBuilder()
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
          getPlayerInfoListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (playerInfoListBuilder_ == null) {
          playerInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          playerInfoListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.internal_static_ScenePlayerInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify build() {
        emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify buildPartial() {
        emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify result = new emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify(this);
        int from_bitField0_ = bitField0_;
        if (playerInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            playerInfoList_ = java.util.Collections.unmodifiableList(playerInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.playerInfoList_ = playerInfoList_;
        } else {
          result.playerInfoList_ = playerInfoListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify) {
          return mergeFrom((emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify other) {
        if (other == emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify.getDefaultInstance()) return this;
        if (playerInfoListBuilder_ == null) {
          if (!other.playerInfoList_.isEmpty()) {
            if (playerInfoList_.isEmpty()) {
              playerInfoList_ = other.playerInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensurePlayerInfoListIsMutable();
              playerInfoList_.addAll(other.playerInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.playerInfoList_.isEmpty()) {
            if (playerInfoListBuilder_.isEmpty()) {
              playerInfoListBuilder_.dispose();
              playerInfoListBuilder_ = null;
              playerInfoList_ = other.playerInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              playerInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getPlayerInfoListFieldBuilder() : null;
            } else {
              playerInfoListBuilder_.addAllMessages(other.playerInfoList_);
            }
          }
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
        emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo> playerInfoList_ =
        java.util.Collections.emptyList();
      private void ensurePlayerInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          playerInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo>(playerInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo, emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo.Builder, emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfoOrBuilder> playerInfoListBuilder_;

      /**
       * <code>repeated .ScenePlayerInfo player_info_list = 3;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo> getPlayerInfoListList() {
        if (playerInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(playerInfoList_);
        } else {
          return playerInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ScenePlayerInfo player_info_list = 3;</code>
       */
      public int getPlayerInfoListCount() {
        if (playerInfoListBuilder_ == null) {
          return playerInfoList_.size();
        } else {
          return playerInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ScenePlayerInfo player_info_list = 3;</code>
       */
      public emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo getPlayerInfoList(int index) {
        if (playerInfoListBuilder_ == null) {
          return playerInfoList_.get(index);
        } else {
          return playerInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ScenePlayerInfo player_info_list = 3;</code>
       */
      public Builder setPlayerInfoList(
          int index, emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo value) {
        if (playerInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayerInfoListIsMutable();
          playerInfoList_.set(index, value);
          onChanged();
        } else {
          playerInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ScenePlayerInfo player_info_list = 3;</code>
       */
      public Builder setPlayerInfoList(
          int index, emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo.Builder builderForValue) {
        if (playerInfoListBuilder_ == null) {
          ensurePlayerInfoListIsMutable();
          playerInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          playerInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ScenePlayerInfo player_info_list = 3;</code>
       */
      public Builder addPlayerInfoList(emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo value) {
        if (playerInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayerInfoListIsMutable();
          playerInfoList_.add(value);
          onChanged();
        } else {
          playerInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ScenePlayerInfo player_info_list = 3;</code>
       */
      public Builder addPlayerInfoList(
          int index, emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo value) {
        if (playerInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayerInfoListIsMutable();
          playerInfoList_.add(index, value);
          onChanged();
        } else {
          playerInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ScenePlayerInfo player_info_list = 3;</code>
       */
      public Builder addPlayerInfoList(
          emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo.Builder builderForValue) {
        if (playerInfoListBuilder_ == null) {
          ensurePlayerInfoListIsMutable();
          playerInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          playerInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ScenePlayerInfo player_info_list = 3;</code>
       */
      public Builder addPlayerInfoList(
          int index, emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo.Builder builderForValue) {
        if (playerInfoListBuilder_ == null) {
          ensurePlayerInfoListIsMutable();
          playerInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          playerInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ScenePlayerInfo player_info_list = 3;</code>
       */
      public Builder addAllPlayerInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo> values) {
        if (playerInfoListBuilder_ == null) {
          ensurePlayerInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, playerInfoList_);
          onChanged();
        } else {
          playerInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ScenePlayerInfo player_info_list = 3;</code>
       */
      public Builder clearPlayerInfoList() {
        if (playerInfoListBuilder_ == null) {
          playerInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          playerInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ScenePlayerInfo player_info_list = 3;</code>
       */
      public Builder removePlayerInfoList(int index) {
        if (playerInfoListBuilder_ == null) {
          ensurePlayerInfoListIsMutable();
          playerInfoList_.remove(index);
          onChanged();
        } else {
          playerInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ScenePlayerInfo player_info_list = 3;</code>
       */
      public emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo.Builder getPlayerInfoListBuilder(
          int index) {
        return getPlayerInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ScenePlayerInfo player_info_list = 3;</code>
       */
      public emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfoOrBuilder getPlayerInfoListOrBuilder(
          int index) {
        if (playerInfoListBuilder_ == null) {
          return playerInfoList_.get(index);  } else {
          return playerInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ScenePlayerInfo player_info_list = 3;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfoOrBuilder> 
           getPlayerInfoListOrBuilderList() {
        if (playerInfoListBuilder_ != null) {
          return playerInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(playerInfoList_);
        }
      }
      /**
       * <code>repeated .ScenePlayerInfo player_info_list = 3;</code>
       */
      public emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo.Builder addPlayerInfoListBuilder() {
        return getPlayerInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .ScenePlayerInfo player_info_list = 3;</code>
       */
      public emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo.Builder addPlayerInfoListBuilder(
          int index) {
        return getPlayerInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .ScenePlayerInfo player_info_list = 3;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo.Builder> 
           getPlayerInfoListBuilderList() {
        return getPlayerInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo, emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo.Builder, emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfoOrBuilder> 
          getPlayerInfoListFieldBuilder() {
        if (playerInfoListBuilder_ == null) {
          playerInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo, emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfo.Builder, emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.ScenePlayerInfoOrBuilder>(
                  playerInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          playerInfoList_ = null;
        }
        return playerInfoListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:ScenePlayerInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:ScenePlayerInfoNotify)
    private static final emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify();
    }

    public static emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ScenePlayerInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<ScenePlayerInfoNotify>() {
      @java.lang.Override
      public ScenePlayerInfoNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ScenePlayerInfoNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ScenePlayerInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ScenePlayerInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ScenePlayerInfoNotifyOuterClass.ScenePlayerInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ScenePlayerInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ScenePlayerInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033ScenePlayerInfoNotify.proto\032\025ScenePlay" +
      "erInfo.proto\"C\n\025ScenePlayerInfoNotify\022*\n" +
      "\020player_info_list\030\003 \003(\0132\020.ScenePlayerInf" +
      "oB\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.getDescriptor(),
        });
    internal_static_ScenePlayerInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ScenePlayerInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ScenePlayerInfoNotify_descriptor,
        new java.lang.String[] { "PlayerInfoList", });
    emu.grasscutter.net.proto.ScenePlayerInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
