package com.google.protobuf;

import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class DescriptorProtos {
    public static final class DescriptorProto extends GeneratedMessageLite implements DescriptorProtoOrBuilder {
        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements DescriptorProtoOrBuilder {
            private Builder() {
                super(DescriptorProto.DEFAULT_INSTANCE);
            }

            Builder(a descriptorProtos$a0) {
            }

            public Builder addAllEnumType(Iterable iterable0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addAllEnumType(iterable0);
                return this;
            }

            public Builder addAllExtension(Iterable iterable0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addAllExtension(iterable0);
                return this;
            }

            public Builder addAllExtensionRange(Iterable iterable0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addAllExtensionRange(iterable0);
                return this;
            }

            public Builder addAllField(Iterable iterable0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addAllField(iterable0);
                return this;
            }

            public Builder addAllNestedType(Iterable iterable0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addAllNestedType(iterable0);
                return this;
            }

            public Builder addAllOneofDecl(Iterable iterable0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addAllOneofDecl(iterable0);
                return this;
            }

            public Builder addAllReservedName(Iterable iterable0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addAllReservedName(iterable0);
                return this;
            }

            public Builder addAllReservedRange(Iterable iterable0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addAllReservedRange(iterable0);
                return this;
            }

            public Builder addEnumType(int v, com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder descriptorProtos$EnumDescriptorProto$Builder0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addEnumType(v, ((EnumDescriptorProto)descriptorProtos$EnumDescriptorProto$Builder0.build()));
                return this;
            }

            public Builder addEnumType(int v, EnumDescriptorProto descriptorProtos$EnumDescriptorProto0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addEnumType(v, descriptorProtos$EnumDescriptorProto0);
                return this;
            }

            public Builder addEnumType(com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder descriptorProtos$EnumDescriptorProto$Builder0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addEnumType(((EnumDescriptorProto)descriptorProtos$EnumDescriptorProto$Builder0.build()));
                return this;
            }

            public Builder addEnumType(EnumDescriptorProto descriptorProtos$EnumDescriptorProto0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addEnumType(descriptorProtos$EnumDescriptorProto0);
                return this;
            }

            public Builder addExtension(int v, com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder descriptorProtos$FieldDescriptorProto$Builder0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addExtension(v, ((FieldDescriptorProto)descriptorProtos$FieldDescriptorProto$Builder0.build()));
                return this;
            }

            public Builder addExtension(int v, FieldDescriptorProto descriptorProtos$FieldDescriptorProto0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addExtension(v, descriptorProtos$FieldDescriptorProto0);
                return this;
            }

            public Builder addExtension(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder descriptorProtos$FieldDescriptorProto$Builder0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addExtension(((FieldDescriptorProto)descriptorProtos$FieldDescriptorProto$Builder0.build()));
                return this;
            }

            public Builder addExtension(FieldDescriptorProto descriptorProtos$FieldDescriptorProto0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addExtension(descriptorProtos$FieldDescriptorProto0);
                return this;
            }

            public Builder addExtensionRange(int v, com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.Builder descriptorProtos$DescriptorProto$ExtensionRange$Builder0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addExtensionRange(v, ((ExtensionRange)descriptorProtos$DescriptorProto$ExtensionRange$Builder0.build()));
                return this;
            }

            public Builder addExtensionRange(int v, ExtensionRange descriptorProtos$DescriptorProto$ExtensionRange0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addExtensionRange(v, descriptorProtos$DescriptorProto$ExtensionRange0);
                return this;
            }

            public Builder addExtensionRange(com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.Builder descriptorProtos$DescriptorProto$ExtensionRange$Builder0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addExtensionRange(((ExtensionRange)descriptorProtos$DescriptorProto$ExtensionRange$Builder0.build()));
                return this;
            }

            public Builder addExtensionRange(ExtensionRange descriptorProtos$DescriptorProto$ExtensionRange0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addExtensionRange(descriptorProtos$DescriptorProto$ExtensionRange0);
                return this;
            }

            public Builder addField(int v, com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder descriptorProtos$FieldDescriptorProto$Builder0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addField(v, ((FieldDescriptorProto)descriptorProtos$FieldDescriptorProto$Builder0.build()));
                return this;
            }

            public Builder addField(int v, FieldDescriptorProto descriptorProtos$FieldDescriptorProto0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addField(v, descriptorProtos$FieldDescriptorProto0);
                return this;
            }

            public Builder addField(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder descriptorProtos$FieldDescriptorProto$Builder0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addField(((FieldDescriptorProto)descriptorProtos$FieldDescriptorProto$Builder0.build()));
                return this;
            }

            public Builder addField(FieldDescriptorProto descriptorProtos$FieldDescriptorProto0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addField(descriptorProtos$FieldDescriptorProto0);
                return this;
            }

            public Builder addNestedType(int v, Builder descriptorProtos$DescriptorProto$Builder0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addNestedType(v, ((DescriptorProto)descriptorProtos$DescriptorProto$Builder0.build()));
                return this;
            }

            public Builder addNestedType(int v, DescriptorProto descriptorProtos$DescriptorProto0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addNestedType(v, descriptorProtos$DescriptorProto0);
                return this;
            }

            public Builder addNestedType(Builder descriptorProtos$DescriptorProto$Builder0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addNestedType(((DescriptorProto)descriptorProtos$DescriptorProto$Builder0.build()));
                return this;
            }

            public Builder addNestedType(DescriptorProto descriptorProtos$DescriptorProto0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addNestedType(descriptorProtos$DescriptorProto0);
                return this;
            }

            public Builder addOneofDecl(int v, com.google.protobuf.DescriptorProtos.OneofDescriptorProto.Builder descriptorProtos$OneofDescriptorProto$Builder0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addOneofDecl(v, ((OneofDescriptorProto)descriptorProtos$OneofDescriptorProto$Builder0.build()));
                return this;
            }

            public Builder addOneofDecl(int v, OneofDescriptorProto descriptorProtos$OneofDescriptorProto0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addOneofDecl(v, descriptorProtos$OneofDescriptorProto0);
                return this;
            }

            public Builder addOneofDecl(com.google.protobuf.DescriptorProtos.OneofDescriptorProto.Builder descriptorProtos$OneofDescriptorProto$Builder0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addOneofDecl(((OneofDescriptorProto)descriptorProtos$OneofDescriptorProto$Builder0.build()));
                return this;
            }

            public Builder addOneofDecl(OneofDescriptorProto descriptorProtos$OneofDescriptorProto0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addOneofDecl(descriptorProtos$OneofDescriptorProto0);
                return this;
            }

            public Builder addReservedName(String s) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addReservedName(s);
                return this;
            }

            public Builder addReservedNameBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addReservedNameBytes(byteString0);
                return this;
            }

            public Builder addReservedRange(int v, com.google.protobuf.DescriptorProtos.DescriptorProto.ReservedRange.Builder descriptorProtos$DescriptorProto$ReservedRange$Builder0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addReservedRange(v, ((ReservedRange)descriptorProtos$DescriptorProto$ReservedRange$Builder0.build()));
                return this;
            }

            public Builder addReservedRange(int v, ReservedRange descriptorProtos$DescriptorProto$ReservedRange0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addReservedRange(v, descriptorProtos$DescriptorProto$ReservedRange0);
                return this;
            }

            public Builder addReservedRange(com.google.protobuf.DescriptorProtos.DescriptorProto.ReservedRange.Builder descriptorProtos$DescriptorProto$ReservedRange$Builder0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addReservedRange(((ReservedRange)descriptorProtos$DescriptorProto$ReservedRange$Builder0.build()));
                return this;
            }

            public Builder addReservedRange(ReservedRange descriptorProtos$DescriptorProto$ReservedRange0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).addReservedRange(descriptorProtos$DescriptorProto$ReservedRange0);
                return this;
            }

            public Builder clearEnumType() {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).clearEnumType();
                return this;
            }

            public Builder clearExtension() {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).clearExtension();
                return this;
            }

            public Builder clearExtensionRange() {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).clearExtensionRange();
                return this;
            }

            public Builder clearField() {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).clearField();
                return this;
            }

            public Builder clearName() {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).clearName();
                return this;
            }

            public Builder clearNestedType() {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).clearNestedType();
                return this;
            }

            public Builder clearOneofDecl() {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).clearOneofDecl();
                return this;
            }

            public Builder clearOptions() {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).clearOptions();
                return this;
            }

            public Builder clearReservedName() {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).clearReservedName();
                return this;
            }

            public Builder clearReservedRange() {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).clearReservedRange();
                return this;
            }

            @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
            public EnumDescriptorProto getEnumType(int v) {
                return ((DescriptorProto)this.instance).getEnumType(v);
            }

            @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
            public int getEnumTypeCount() {
                return ((DescriptorProto)this.instance).getEnumTypeCount();
            }

            @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
            public List getEnumTypeList() {
                return DesugarCollections.unmodifiableList(((DescriptorProto)this.instance).getEnumTypeList());
            }

            @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
            public FieldDescriptorProto getExtension(int v) {
                return ((DescriptorProto)this.instance).getExtension(v);
            }

            @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
            public int getExtensionCount() {
                return ((DescriptorProto)this.instance).getExtensionCount();
            }

            @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
            public List getExtensionList() {
                return DesugarCollections.unmodifiableList(((DescriptorProto)this.instance).getExtensionList());
            }

            @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
            public ExtensionRange getExtensionRange(int v) {
                return ((DescriptorProto)this.instance).getExtensionRange(v);
            }

            @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
            public int getExtensionRangeCount() {
                return ((DescriptorProto)this.instance).getExtensionRangeCount();
            }

            @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
            public List getExtensionRangeList() {
                return DesugarCollections.unmodifiableList(((DescriptorProto)this.instance).getExtensionRangeList());
            }

            @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
            public FieldDescriptorProto getField(int v) {
                return ((DescriptorProto)this.instance).getField(v);
            }

            @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
            public int getFieldCount() {
                return ((DescriptorProto)this.instance).getFieldCount();
            }

            @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
            public List getFieldList() {
                return DesugarCollections.unmodifiableList(((DescriptorProto)this.instance).getFieldList());
            }

            @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
            public String getName() {
                return ((DescriptorProto)this.instance).getName();
            }

            @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
            public ByteString getNameBytes() {
                return ((DescriptorProto)this.instance).getNameBytes();
            }

            @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
            public DescriptorProto getNestedType(int v) {
                return ((DescriptorProto)this.instance).getNestedType(v);
            }

            @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
            public int getNestedTypeCount() {
                return ((DescriptorProto)this.instance).getNestedTypeCount();
            }

            @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
            public List getNestedTypeList() {
                return DesugarCollections.unmodifiableList(((DescriptorProto)this.instance).getNestedTypeList());
            }

            @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
            public OneofDescriptorProto getOneofDecl(int v) {
                return ((DescriptorProto)this.instance).getOneofDecl(v);
            }

            @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
            public int getOneofDeclCount() {
                return ((DescriptorProto)this.instance).getOneofDeclCount();
            }

            @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
            public List getOneofDeclList() {
                return DesugarCollections.unmodifiableList(((DescriptorProto)this.instance).getOneofDeclList());
            }

            @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
            public MessageOptions getOptions() {
                return ((DescriptorProto)this.instance).getOptions();
            }

            @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
            public String getReservedName(int v) {
                return ((DescriptorProto)this.instance).getReservedName(v);
            }

            @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
            public ByteString getReservedNameBytes(int v) {
                return ((DescriptorProto)this.instance).getReservedNameBytes(v);
            }

            @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
            public int getReservedNameCount() {
                return ((DescriptorProto)this.instance).getReservedNameCount();
            }

            @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
            public List getReservedNameList() {
                return DesugarCollections.unmodifiableList(((DescriptorProto)this.instance).getReservedNameList());
            }

            @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
            public ReservedRange getReservedRange(int v) {
                return ((DescriptorProto)this.instance).getReservedRange(v);
            }

            @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
            public int getReservedRangeCount() {
                return ((DescriptorProto)this.instance).getReservedRangeCount();
            }

            @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
            public List getReservedRangeList() {
                return DesugarCollections.unmodifiableList(((DescriptorProto)this.instance).getReservedRangeList());
            }

            @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
            public boolean hasName() {
                return ((DescriptorProto)this.instance).hasName();
            }

            @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
            public boolean hasOptions() {
                return ((DescriptorProto)this.instance).hasOptions();
            }

            public Builder mergeOptions(MessageOptions descriptorProtos$MessageOptions0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).mergeOptions(descriptorProtos$MessageOptions0);
                return this;
            }

            public Builder removeEnumType(int v) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).removeEnumType(v);
                return this;
            }

            public Builder removeExtension(int v) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).removeExtension(v);
                return this;
            }

            public Builder removeExtensionRange(int v) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).removeExtensionRange(v);
                return this;
            }

            public Builder removeField(int v) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).removeField(v);
                return this;
            }

            public Builder removeNestedType(int v) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).removeNestedType(v);
                return this;
            }

            public Builder removeOneofDecl(int v) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).removeOneofDecl(v);
                return this;
            }

            public Builder removeReservedRange(int v) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).removeReservedRange(v);
                return this;
            }

            public Builder setEnumType(int v, com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder descriptorProtos$EnumDescriptorProto$Builder0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).setEnumType(v, ((EnumDescriptorProto)descriptorProtos$EnumDescriptorProto$Builder0.build()));
                return this;
            }

            public Builder setEnumType(int v, EnumDescriptorProto descriptorProtos$EnumDescriptorProto0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).setEnumType(v, descriptorProtos$EnumDescriptorProto0);
                return this;
            }

            public Builder setExtension(int v, com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder descriptorProtos$FieldDescriptorProto$Builder0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).setExtension(v, ((FieldDescriptorProto)descriptorProtos$FieldDescriptorProto$Builder0.build()));
                return this;
            }

            public Builder setExtension(int v, FieldDescriptorProto descriptorProtos$FieldDescriptorProto0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).setExtension(v, descriptorProtos$FieldDescriptorProto0);
                return this;
            }

            public Builder setExtensionRange(int v, com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.Builder descriptorProtos$DescriptorProto$ExtensionRange$Builder0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).setExtensionRange(v, ((ExtensionRange)descriptorProtos$DescriptorProto$ExtensionRange$Builder0.build()));
                return this;
            }

            public Builder setExtensionRange(int v, ExtensionRange descriptorProtos$DescriptorProto$ExtensionRange0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).setExtensionRange(v, descriptorProtos$DescriptorProto$ExtensionRange0);
                return this;
            }

            public Builder setField(int v, com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder descriptorProtos$FieldDescriptorProto$Builder0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).setField(v, ((FieldDescriptorProto)descriptorProtos$FieldDescriptorProto$Builder0.build()));
                return this;
            }

            public Builder setField(int v, FieldDescriptorProto descriptorProtos$FieldDescriptorProto0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).setField(v, descriptorProtos$FieldDescriptorProto0);
                return this;
            }

            public Builder setName(String s) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).setName(s);
                return this;
            }

            public Builder setNameBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).setNameBytes(byteString0);
                return this;
            }

            public Builder setNestedType(int v, Builder descriptorProtos$DescriptorProto$Builder0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).setNestedType(v, ((DescriptorProto)descriptorProtos$DescriptorProto$Builder0.build()));
                return this;
            }

            public Builder setNestedType(int v, DescriptorProto descriptorProtos$DescriptorProto0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).setNestedType(v, descriptorProtos$DescriptorProto0);
                return this;
            }

            public Builder setOneofDecl(int v, com.google.protobuf.DescriptorProtos.OneofDescriptorProto.Builder descriptorProtos$OneofDescriptorProto$Builder0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).setOneofDecl(v, ((OneofDescriptorProto)descriptorProtos$OneofDescriptorProto$Builder0.build()));
                return this;
            }

            public Builder setOneofDecl(int v, OneofDescriptorProto descriptorProtos$OneofDescriptorProto0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).setOneofDecl(v, descriptorProtos$OneofDescriptorProto0);
                return this;
            }

            public Builder setOptions(com.google.protobuf.DescriptorProtos.MessageOptions.Builder descriptorProtos$MessageOptions$Builder0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).setOptions(((MessageOptions)descriptorProtos$MessageOptions$Builder0.build()));
                return this;
            }

            public Builder setOptions(MessageOptions descriptorProtos$MessageOptions0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).setOptions(descriptorProtos$MessageOptions0);
                return this;
            }

            public Builder setReservedName(int v, String s) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).setReservedName(v, s);
                return this;
            }

            public Builder setReservedRange(int v, com.google.protobuf.DescriptorProtos.DescriptorProto.ReservedRange.Builder descriptorProtos$DescriptorProto$ReservedRange$Builder0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).setReservedRange(v, ((ReservedRange)descriptorProtos$DescriptorProto$ReservedRange$Builder0.build()));
                return this;
            }

            public Builder setReservedRange(int v, ReservedRange descriptorProtos$DescriptorProto$ReservedRange0) {
                this.copyOnWrite();
                ((DescriptorProto)this.instance).setReservedRange(v, descriptorProtos$DescriptorProto$ReservedRange0);
                return this;
            }
        }

        public static final class ExtensionRange extends GeneratedMessageLite implements ExtensionRangeOrBuilder {
            public static final class com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements ExtensionRangeOrBuilder {
                private com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.Builder() {
                    super(ExtensionRange.DEFAULT_INSTANCE);
                }

                com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.Builder(a descriptorProtos$a0) {
                }

                public com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.Builder clearEnd() {
                    this.copyOnWrite();
                    ((ExtensionRange)this.instance).clearEnd();
                    return this;
                }

                public com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.Builder clearOptions() {
                    this.copyOnWrite();
                    ((ExtensionRange)this.instance).clearOptions();
                    return this;
                }

                public com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.Builder clearStart() {
                    this.copyOnWrite();
                    ((ExtensionRange)this.instance).clearStart();
                    return this;
                }

                @Override  // com.google.protobuf.DescriptorProtos$DescriptorProto$ExtensionRangeOrBuilder
                public int getEnd() {
                    return ((ExtensionRange)this.instance).getEnd();
                }

                @Override  // com.google.protobuf.DescriptorProtos$DescriptorProto$ExtensionRangeOrBuilder
                public ExtensionRangeOptions getOptions() {
                    return ((ExtensionRange)this.instance).getOptions();
                }

                @Override  // com.google.protobuf.DescriptorProtos$DescriptorProto$ExtensionRangeOrBuilder
                public int getStart() {
                    return ((ExtensionRange)this.instance).getStart();
                }

                @Override  // com.google.protobuf.DescriptorProtos$DescriptorProto$ExtensionRangeOrBuilder
                public boolean hasEnd() {
                    return ((ExtensionRange)this.instance).hasEnd();
                }

                @Override  // com.google.protobuf.DescriptorProtos$DescriptorProto$ExtensionRangeOrBuilder
                public boolean hasOptions() {
                    return ((ExtensionRange)this.instance).hasOptions();
                }

                @Override  // com.google.protobuf.DescriptorProtos$DescriptorProto$ExtensionRangeOrBuilder
                public boolean hasStart() {
                    return ((ExtensionRange)this.instance).hasStart();
                }

                public com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.Builder mergeOptions(ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions0) {
                    this.copyOnWrite();
                    ((ExtensionRange)this.instance).mergeOptions(descriptorProtos$ExtensionRangeOptions0);
                    return this;
                }

                public com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.Builder setEnd(int v) {
                    this.copyOnWrite();
                    ((ExtensionRange)this.instance).setEnd(v);
                    return this;
                }

                public com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.Builder setOptions(com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.Builder descriptorProtos$ExtensionRangeOptions$Builder0) {
                    this.copyOnWrite();
                    ((ExtensionRange)this.instance).setOptions(((ExtensionRangeOptions)descriptorProtos$ExtensionRangeOptions$Builder0.build()));
                    return this;
                }

                public com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.Builder setOptions(ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions0) {
                    this.copyOnWrite();
                    ((ExtensionRange)this.instance).setOptions(descriptorProtos$ExtensionRangeOptions0);
                    return this;
                }

                public com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.Builder setStart(int v) {
                    this.copyOnWrite();
                    ((ExtensionRange)this.instance).setStart(v);
                    return this;
                }
            }

            private static final ExtensionRange DEFAULT_INSTANCE = null;
            public static final int END_FIELD_NUMBER = 2;
            public static final int OPTIONS_FIELD_NUMBER = 3;
            private static volatile Parser PARSER = null;
            public static final int START_FIELD_NUMBER = 1;
            private int bitField0_;
            private int end_;
            private byte memoizedIsInitialized;
            private ExtensionRangeOptions options_;
            private int start_;

            static {
                ExtensionRange descriptorProtos$DescriptorProto$ExtensionRange0 = new ExtensionRange();
                ExtensionRange.DEFAULT_INSTANCE = descriptorProtos$DescriptorProto$ExtensionRange0;
                GeneratedMessageLite.registerDefaultInstance(ExtensionRange.class, descriptorProtos$DescriptorProto$ExtensionRange0);
            }

            private ExtensionRange() {
                this.memoizedIsInitialized = 2;
            }

            private void clearEnd() {
                this.bitField0_ &= -3;
                this.end_ = 0;
            }

            private void clearOptions() {
                this.options_ = null;
                this.bitField0_ &= -5;
            }

            private void clearStart() {
                this.bitField0_ &= -2;
                this.start_ = 0;
            }

            @Override  // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
                int v = 1;
                switch(generatedMessageLite$MethodToInvoke0) {
                    case 1: {
                        return new ExtensionRange();
                    }
                    case 2: {
                        return new com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.Builder(null);
                    }
                    case 3: {
                        return GeneratedMessageLite.newMessageInfo(ExtensionRange.DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001င\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"bitField0_", "start_", "end_", "options_"});
                    }
                    case 4: {
                        return ExtensionRange.DEFAULT_INSTANCE;
                    }
                    case 5: {
                        Parser parser0 = ExtensionRange.PARSER;
                        if(parser0 == null) {
                            synchronized(ExtensionRange.class) {
                                parser0 = ExtensionRange.PARSER;
                                if(parser0 == null) {
                                    parser0 = new DefaultInstanceBasedParser(ExtensionRange.DEFAULT_INSTANCE);
                                    ExtensionRange.PARSER = parser0;
                                }
                            }
                        }
                        return parser0;
                    }
                    case 6: {
                        return this.memoizedIsInitialized;
                    }
                    case 7: {
                        if(object0 == null) {
                            v = 0;
                        }
                        this.memoizedIsInitialized = (byte)v;
                        return null;
                    }
                    default: {
                        throw new UnsupportedOperationException();
                    }
                }
            }

            public static ExtensionRange getDefaultInstance() {
                return ExtensionRange.DEFAULT_INSTANCE;
            }

            @Override  // com.google.protobuf.DescriptorProtos$DescriptorProto$ExtensionRangeOrBuilder
            public int getEnd() {
                return this.end_;
            }

            @Override  // com.google.protobuf.DescriptorProtos$DescriptorProto$ExtensionRangeOrBuilder
            public ExtensionRangeOptions getOptions() {
                return this.options_ == null ? ExtensionRangeOptions.getDefaultInstance() : this.options_;
            }

            @Override  // com.google.protobuf.DescriptorProtos$DescriptorProto$ExtensionRangeOrBuilder
            public int getStart() {
                return this.start_;
            }

            @Override  // com.google.protobuf.DescriptorProtos$DescriptorProto$ExtensionRangeOrBuilder
            public boolean hasEnd() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override  // com.google.protobuf.DescriptorProtos$DescriptorProto$ExtensionRangeOrBuilder
            public boolean hasOptions() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override  // com.google.protobuf.DescriptorProtos$DescriptorProto$ExtensionRangeOrBuilder
            public boolean hasStart() {
                return (this.bitField0_ & 1) != 0;
            }

            private void mergeOptions(ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions0) {
                descriptorProtos$ExtensionRangeOptions0.getClass();
                this.options_ = this.options_ == null || this.options_ == ExtensionRangeOptions.getDefaultInstance() ? descriptorProtos$ExtensionRangeOptions0 : ((ExtensionRangeOptions)((com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.Builder)ExtensionRangeOptions.newBuilder(this.options_).mergeFrom(descriptorProtos$ExtensionRangeOptions0)).buildPartial());
                this.bitField0_ |= 4;
            }

            public static com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.Builder newBuilder() {
                return (com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.Builder)ExtensionRange.DEFAULT_INSTANCE.createBuilder();
            }

            public static com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.Builder newBuilder(ExtensionRange descriptorProtos$DescriptorProto$ExtensionRange0) {
                return (com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRange.Builder)ExtensionRange.DEFAULT_INSTANCE.createBuilder(descriptorProtos$DescriptorProto$ExtensionRange0);
            }

            public static ExtensionRange parseDelimitedFrom(InputStream inputStream0) throws IOException {
                return (ExtensionRange)GeneratedMessageLite.parseDelimitedFrom(ExtensionRange.DEFAULT_INSTANCE, inputStream0);
            }

            public static ExtensionRange parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return (ExtensionRange)GeneratedMessageLite.parseDelimitedFrom(ExtensionRange.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
            }

            public static ExtensionRange parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
                return (ExtensionRange)GeneratedMessageLite.parseFrom(ExtensionRange.DEFAULT_INSTANCE, byteString0);
            }

            public static ExtensionRange parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
                return (ExtensionRange)GeneratedMessageLite.parseFrom(ExtensionRange.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
            }

            public static ExtensionRange parseFrom(CodedInputStream codedInputStream0) throws IOException {
                return (ExtensionRange)GeneratedMessageLite.parseFrom(ExtensionRange.DEFAULT_INSTANCE, codedInputStream0);
            }

            public static ExtensionRange parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return (ExtensionRange)GeneratedMessageLite.parseFrom(ExtensionRange.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
            }

            public static ExtensionRange parseFrom(InputStream inputStream0) throws IOException {
                return (ExtensionRange)GeneratedMessageLite.parseFrom(ExtensionRange.DEFAULT_INSTANCE, inputStream0);
            }

            public static ExtensionRange parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return (ExtensionRange)GeneratedMessageLite.parseFrom(ExtensionRange.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
            }

            public static ExtensionRange parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
                return (ExtensionRange)GeneratedMessageLite.parseFrom(ExtensionRange.DEFAULT_INSTANCE, byteBuffer0);
            }

            public static ExtensionRange parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
                return (ExtensionRange)GeneratedMessageLite.parseFrom(ExtensionRange.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
            }

            public static ExtensionRange parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
                return (ExtensionRange)GeneratedMessageLite.parseFrom(ExtensionRange.DEFAULT_INSTANCE, arr_b);
            }

            public static ExtensionRange parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
                return (ExtensionRange)GeneratedMessageLite.parseFrom(ExtensionRange.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
            }

            public static Parser parser() {
                return ExtensionRange.DEFAULT_INSTANCE.getParserForType();
            }

            private void setEnd(int v) {
                this.bitField0_ |= 2;
                this.end_ = v;
            }

            private void setOptions(ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions0) {
                descriptorProtos$ExtensionRangeOptions0.getClass();
                this.options_ = descriptorProtos$ExtensionRangeOptions0;
                this.bitField0_ |= 4;
            }

            private void setStart(int v) {
                this.bitField0_ |= 1;
                this.start_ = v;
            }
        }

        public interface ExtensionRangeOrBuilder extends MessageLiteOrBuilder {
            int getEnd();

            ExtensionRangeOptions getOptions();

            int getStart();

            boolean hasEnd();

            boolean hasOptions();

            boolean hasStart();
        }

        public static final class ReservedRange extends GeneratedMessageLite implements ReservedRangeOrBuilder {
            public static final class com.google.protobuf.DescriptorProtos.DescriptorProto.ReservedRange.Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements ReservedRangeOrBuilder {
                private com.google.protobuf.DescriptorProtos.DescriptorProto.ReservedRange.Builder() {
                    super(ReservedRange.DEFAULT_INSTANCE);
                }

                com.google.protobuf.DescriptorProtos.DescriptorProto.ReservedRange.Builder(a descriptorProtos$a0) {
                }

                public com.google.protobuf.DescriptorProtos.DescriptorProto.ReservedRange.Builder clearEnd() {
                    this.copyOnWrite();
                    ((ReservedRange)this.instance).clearEnd();
                    return this;
                }

                public com.google.protobuf.DescriptorProtos.DescriptorProto.ReservedRange.Builder clearStart() {
                    this.copyOnWrite();
                    ((ReservedRange)this.instance).clearStart();
                    return this;
                }

                @Override  // com.google.protobuf.DescriptorProtos$DescriptorProto$ReservedRangeOrBuilder
                public int getEnd() {
                    return ((ReservedRange)this.instance).getEnd();
                }

                @Override  // com.google.protobuf.DescriptorProtos$DescriptorProto$ReservedRangeOrBuilder
                public int getStart() {
                    return ((ReservedRange)this.instance).getStart();
                }

                @Override  // com.google.protobuf.DescriptorProtos$DescriptorProto$ReservedRangeOrBuilder
                public boolean hasEnd() {
                    return ((ReservedRange)this.instance).hasEnd();
                }

                @Override  // com.google.protobuf.DescriptorProtos$DescriptorProto$ReservedRangeOrBuilder
                public boolean hasStart() {
                    return ((ReservedRange)this.instance).hasStart();
                }

                public com.google.protobuf.DescriptorProtos.DescriptorProto.ReservedRange.Builder setEnd(int v) {
                    this.copyOnWrite();
                    ((ReservedRange)this.instance).setEnd(v);
                    return this;
                }

                public com.google.protobuf.DescriptorProtos.DescriptorProto.ReservedRange.Builder setStart(int v) {
                    this.copyOnWrite();
                    ((ReservedRange)this.instance).setStart(v);
                    return this;
                }
            }

            private static final ReservedRange DEFAULT_INSTANCE = null;
            public static final int END_FIELD_NUMBER = 2;
            private static volatile Parser PARSER = null;
            public static final int START_FIELD_NUMBER = 1;
            private int bitField0_;
            private int end_;
            private int start_;

            static {
                ReservedRange descriptorProtos$DescriptorProto$ReservedRange0 = new ReservedRange();
                ReservedRange.DEFAULT_INSTANCE = descriptorProtos$DescriptorProto$ReservedRange0;
                GeneratedMessageLite.registerDefaultInstance(ReservedRange.class, descriptorProtos$DescriptorProto$ReservedRange0);
            }

            private void clearEnd() {
                this.bitField0_ &= -3;
                this.end_ = 0;
            }

            private void clearStart() {
                this.bitField0_ &= -2;
                this.start_ = 0;
            }

            @Override  // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
                switch(generatedMessageLite$MethodToInvoke0) {
                    case 1: {
                        return new ReservedRange();
                    }
                    case 2: {
                        return new com.google.protobuf.DescriptorProtos.DescriptorProto.ReservedRange.Builder(null);
                    }
                    case 3: {
                        return GeneratedMessageLite.newMessageInfo(ReservedRange.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"bitField0_", "start_", "end_"});
                    }
                    case 4: {
                        return ReservedRange.DEFAULT_INSTANCE;
                    }
                    case 5: {
                        Parser parser0 = ReservedRange.PARSER;
                        if(parser0 == null) {
                            Class class0 = ReservedRange.class;
                            synchronized(class0) {
                                parser0 = ReservedRange.PARSER;
                                if(parser0 == null) {
                                    parser0 = new DefaultInstanceBasedParser(ReservedRange.DEFAULT_INSTANCE);
                                    ReservedRange.PARSER = parser0;
                                }
                            }
                        }
                        return parser0;
                    }
                    case 6: {
                        return (byte)1;
                    }
                    case 7: {
                        return null;
                    }
                    default: {
                        throw new UnsupportedOperationException();
                    }
                }
            }

            public static ReservedRange getDefaultInstance() {
                return ReservedRange.DEFAULT_INSTANCE;
            }

            @Override  // com.google.protobuf.DescriptorProtos$DescriptorProto$ReservedRangeOrBuilder
            public int getEnd() {
                return this.end_;
            }

            @Override  // com.google.protobuf.DescriptorProtos$DescriptorProto$ReservedRangeOrBuilder
            public int getStart() {
                return this.start_;
            }

            @Override  // com.google.protobuf.DescriptorProtos$DescriptorProto$ReservedRangeOrBuilder
            public boolean hasEnd() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override  // com.google.protobuf.DescriptorProtos$DescriptorProto$ReservedRangeOrBuilder
            public boolean hasStart() {
                return (this.bitField0_ & 1) != 0;
            }

            public static com.google.protobuf.DescriptorProtos.DescriptorProto.ReservedRange.Builder newBuilder() {
                return (com.google.protobuf.DescriptorProtos.DescriptorProto.ReservedRange.Builder)ReservedRange.DEFAULT_INSTANCE.createBuilder();
            }

            public static com.google.protobuf.DescriptorProtos.DescriptorProto.ReservedRange.Builder newBuilder(ReservedRange descriptorProtos$DescriptorProto$ReservedRange0) {
                return (com.google.protobuf.DescriptorProtos.DescriptorProto.ReservedRange.Builder)ReservedRange.DEFAULT_INSTANCE.createBuilder(descriptorProtos$DescriptorProto$ReservedRange0);
            }

            public static ReservedRange parseDelimitedFrom(InputStream inputStream0) throws IOException {
                return (ReservedRange)GeneratedMessageLite.parseDelimitedFrom(ReservedRange.DEFAULT_INSTANCE, inputStream0);
            }

            public static ReservedRange parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return (ReservedRange)GeneratedMessageLite.parseDelimitedFrom(ReservedRange.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
            }

            public static ReservedRange parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
                return (ReservedRange)GeneratedMessageLite.parseFrom(ReservedRange.DEFAULT_INSTANCE, byteString0);
            }

            public static ReservedRange parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
                return (ReservedRange)GeneratedMessageLite.parseFrom(ReservedRange.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
            }

            public static ReservedRange parseFrom(CodedInputStream codedInputStream0) throws IOException {
                return (ReservedRange)GeneratedMessageLite.parseFrom(ReservedRange.DEFAULT_INSTANCE, codedInputStream0);
            }

            public static ReservedRange parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return (ReservedRange)GeneratedMessageLite.parseFrom(ReservedRange.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
            }

            public static ReservedRange parseFrom(InputStream inputStream0) throws IOException {
                return (ReservedRange)GeneratedMessageLite.parseFrom(ReservedRange.DEFAULT_INSTANCE, inputStream0);
            }

            public static ReservedRange parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return (ReservedRange)GeneratedMessageLite.parseFrom(ReservedRange.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
            }

            public static ReservedRange parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
                return (ReservedRange)GeneratedMessageLite.parseFrom(ReservedRange.DEFAULT_INSTANCE, byteBuffer0);
            }

            public static ReservedRange parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
                return (ReservedRange)GeneratedMessageLite.parseFrom(ReservedRange.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
            }

            public static ReservedRange parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
                return (ReservedRange)GeneratedMessageLite.parseFrom(ReservedRange.DEFAULT_INSTANCE, arr_b);
            }

            public static ReservedRange parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
                return (ReservedRange)GeneratedMessageLite.parseFrom(ReservedRange.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
            }

            public static Parser parser() {
                return ReservedRange.DEFAULT_INSTANCE.getParserForType();
            }

            private void setEnd(int v) {
                this.bitField0_ |= 2;
                this.end_ = v;
            }

            private void setStart(int v) {
                this.bitField0_ |= 1;
                this.start_ = v;
            }
        }

        public interface ReservedRangeOrBuilder extends MessageLiteOrBuilder {
            int getEnd();

            int getStart();

            boolean hasEnd();

            boolean hasStart();
        }

        private static final DescriptorProto DEFAULT_INSTANCE = null;
        public static final int ENUM_TYPE_FIELD_NUMBER = 4;
        public static final int EXTENSION_FIELD_NUMBER = 6;
        public static final int EXTENSION_RANGE_FIELD_NUMBER = 5;
        public static final int FIELD_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int NESTED_TYPE_FIELD_NUMBER = 3;
        public static final int ONEOF_DECL_FIELD_NUMBER = 8;
        public static final int OPTIONS_FIELD_NUMBER = 7;
        private static volatile Parser PARSER = null;
        public static final int RESERVED_NAME_FIELD_NUMBER = 10;
        public static final int RESERVED_RANGE_FIELD_NUMBER = 9;
        private int bitField0_;
        private ProtobufList enumType_;
        private ProtobufList extensionRange_;
        private ProtobufList extension_;
        private ProtobufList field_;
        private byte memoizedIsInitialized;
        private String name_;
        private ProtobufList nestedType_;
        private ProtobufList oneofDecl_;
        private MessageOptions options_;
        private ProtobufList reservedName_;
        private ProtobufList reservedRange_;

        static {
            DescriptorProto descriptorProtos$DescriptorProto0 = new DescriptorProto();
            DescriptorProto.DEFAULT_INSTANCE = descriptorProtos$DescriptorProto0;
            GeneratedMessageLite.registerDefaultInstance(DescriptorProto.class, descriptorProtos$DescriptorProto0);
        }

        private DescriptorProto() {
            this.memoizedIsInitialized = 2;
            this.name_ = "";
            this.field_ = GeneratedMessageLite.emptyProtobufList();
            this.extension_ = GeneratedMessageLite.emptyProtobufList();
            this.nestedType_ = GeneratedMessageLite.emptyProtobufList();
            this.enumType_ = GeneratedMessageLite.emptyProtobufList();
            this.extensionRange_ = GeneratedMessageLite.emptyProtobufList();
            this.oneofDecl_ = GeneratedMessageLite.emptyProtobufList();
            this.reservedRange_ = GeneratedMessageLite.emptyProtobufList();
            this.reservedName_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void addAllEnumType(Iterable iterable0) {
            this.ensureEnumTypeIsMutable();
            AbstractMessageLite.addAll(iterable0, this.enumType_);
        }

        private void addAllExtension(Iterable iterable0) {
            this.ensureExtensionIsMutable();
            AbstractMessageLite.addAll(iterable0, this.extension_);
        }

        private void addAllExtensionRange(Iterable iterable0) {
            this.ensureExtensionRangeIsMutable();
            AbstractMessageLite.addAll(iterable0, this.extensionRange_);
        }

        private void addAllField(Iterable iterable0) {
            this.ensureFieldIsMutable();
            AbstractMessageLite.addAll(iterable0, this.field_);
        }

        private void addAllNestedType(Iterable iterable0) {
            this.ensureNestedTypeIsMutable();
            AbstractMessageLite.addAll(iterable0, this.nestedType_);
        }

        private void addAllOneofDecl(Iterable iterable0) {
            this.ensureOneofDeclIsMutable();
            AbstractMessageLite.addAll(iterable0, this.oneofDecl_);
        }

        private void addAllReservedName(Iterable iterable0) {
            this.ensureReservedNameIsMutable();
            AbstractMessageLite.addAll(iterable0, this.reservedName_);
        }

        private void addAllReservedRange(Iterable iterable0) {
            this.ensureReservedRangeIsMutable();
            AbstractMessageLite.addAll(iterable0, this.reservedRange_);
        }

        private void addEnumType(int v, EnumDescriptorProto descriptorProtos$EnumDescriptorProto0) {
            descriptorProtos$EnumDescriptorProto0.getClass();
            this.ensureEnumTypeIsMutable();
            this.enumType_.add(v, descriptorProtos$EnumDescriptorProto0);
        }

        private void addEnumType(EnumDescriptorProto descriptorProtos$EnumDescriptorProto0) {
            descriptorProtos$EnumDescriptorProto0.getClass();
            this.ensureEnumTypeIsMutable();
            this.enumType_.add(descriptorProtos$EnumDescriptorProto0);
        }

        private void addExtension(int v, FieldDescriptorProto descriptorProtos$FieldDescriptorProto0) {
            descriptorProtos$FieldDescriptorProto0.getClass();
            this.ensureExtensionIsMutable();
            this.extension_.add(v, descriptorProtos$FieldDescriptorProto0);
        }

        private void addExtension(FieldDescriptorProto descriptorProtos$FieldDescriptorProto0) {
            descriptorProtos$FieldDescriptorProto0.getClass();
            this.ensureExtensionIsMutable();
            this.extension_.add(descriptorProtos$FieldDescriptorProto0);
        }

        private void addExtensionRange(int v, ExtensionRange descriptorProtos$DescriptorProto$ExtensionRange0) {
            descriptorProtos$DescriptorProto$ExtensionRange0.getClass();
            this.ensureExtensionRangeIsMutable();
            this.extensionRange_.add(v, descriptorProtos$DescriptorProto$ExtensionRange0);
        }

        private void addExtensionRange(ExtensionRange descriptorProtos$DescriptorProto$ExtensionRange0) {
            descriptorProtos$DescriptorProto$ExtensionRange0.getClass();
            this.ensureExtensionRangeIsMutable();
            this.extensionRange_.add(descriptorProtos$DescriptorProto$ExtensionRange0);
        }

        private void addField(int v, FieldDescriptorProto descriptorProtos$FieldDescriptorProto0) {
            descriptorProtos$FieldDescriptorProto0.getClass();
            this.ensureFieldIsMutable();
            this.field_.add(v, descriptorProtos$FieldDescriptorProto0);
        }

        private void addField(FieldDescriptorProto descriptorProtos$FieldDescriptorProto0) {
            descriptorProtos$FieldDescriptorProto0.getClass();
            this.ensureFieldIsMutable();
            this.field_.add(descriptorProtos$FieldDescriptorProto0);
        }

        private void addNestedType(int v, DescriptorProto descriptorProtos$DescriptorProto0) {
            descriptorProtos$DescriptorProto0.getClass();
            this.ensureNestedTypeIsMutable();
            this.nestedType_.add(v, descriptorProtos$DescriptorProto0);
        }

        private void addNestedType(DescriptorProto descriptorProtos$DescriptorProto0) {
            descriptorProtos$DescriptorProto0.getClass();
            this.ensureNestedTypeIsMutable();
            this.nestedType_.add(descriptorProtos$DescriptorProto0);
        }

        private void addOneofDecl(int v, OneofDescriptorProto descriptorProtos$OneofDescriptorProto0) {
            descriptorProtos$OneofDescriptorProto0.getClass();
            this.ensureOneofDeclIsMutable();
            this.oneofDecl_.add(v, descriptorProtos$OneofDescriptorProto0);
        }

        private void addOneofDecl(OneofDescriptorProto descriptorProtos$OneofDescriptorProto0) {
            descriptorProtos$OneofDescriptorProto0.getClass();
            this.ensureOneofDeclIsMutable();
            this.oneofDecl_.add(descriptorProtos$OneofDescriptorProto0);
        }

        private void addReservedName(String s) {
            s.getClass();
            this.ensureReservedNameIsMutable();
            this.reservedName_.add(s);
        }

        private void addReservedNameBytes(ByteString byteString0) {
            this.ensureReservedNameIsMutable();
            this.reservedName_.add(byteString0.toStringUtf8());
        }

        private void addReservedRange(int v, ReservedRange descriptorProtos$DescriptorProto$ReservedRange0) {
            descriptorProtos$DescriptorProto$ReservedRange0.getClass();
            this.ensureReservedRangeIsMutable();
            this.reservedRange_.add(v, descriptorProtos$DescriptorProto$ReservedRange0);
        }

        private void addReservedRange(ReservedRange descriptorProtos$DescriptorProto$ReservedRange0) {
            descriptorProtos$DescriptorProto$ReservedRange0.getClass();
            this.ensureReservedRangeIsMutable();
            this.reservedRange_.add(descriptorProtos$DescriptorProto$ReservedRange0);
        }

        private void clearEnumType() {
            this.enumType_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearExtension() {
            this.extension_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearExtensionRange() {
            this.extensionRange_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearField() {
            this.field_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearName() {
            this.bitField0_ &= -2;
            this.name_ = DescriptorProto.getDefaultInstance().getName();
        }

        private void clearNestedType() {
            this.nestedType_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearOneofDecl() {
            this.oneofDecl_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -3;
        }

        private void clearReservedName() {
            this.reservedName_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearReservedRange() {
            this.reservedRange_ = GeneratedMessageLite.emptyProtobufList();
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            int v = 1;
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new DescriptorProto();
                }
                case 2: {
                    return new Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(DescriptorProto.DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\b\u0007\u0001ဈ\u0000\u0002Л\u0003Л\u0004Л\u0005Л\u0006Л\u0007ᐉ\u0001\bЛ\t\u001B\n\u001A", new Object[]{"bitField0_", "name_", "field_", FieldDescriptorProto.class, "nestedType_", DescriptorProto.class, "enumType_", EnumDescriptorProto.class, "extensionRange_", ExtensionRange.class, "extension_", FieldDescriptorProto.class, "options_", "oneofDecl_", OneofDescriptorProto.class, "reservedRange_", ReservedRange.class, "reservedName_"});
                }
                case 4: {
                    return DescriptorProto.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = DescriptorProto.PARSER;
                    if(parser0 == null) {
                        synchronized(DescriptorProto.class) {
                            parser0 = DescriptorProto.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(DescriptorProto.DEFAULT_INSTANCE);
                                DescriptorProto.PARSER = parser0;
                            }
                        }
                    }
                    return parser0;
                }
                case 6: {
                    return this.memoizedIsInitialized;
                }
                case 7: {
                    if(object0 == null) {
                        v = 0;
                    }
                    this.memoizedIsInitialized = (byte)v;
                    return null;
                }
                default: {
                    throw new UnsupportedOperationException();
                }
            }
        }

        private void ensureEnumTypeIsMutable() {
            ProtobufList internal$ProtobufList0 = this.enumType_;
            if(!internal$ProtobufList0.isModifiable()) {
                this.enumType_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
            }
        }

        private void ensureExtensionIsMutable() {
            ProtobufList internal$ProtobufList0 = this.extension_;
            if(!internal$ProtobufList0.isModifiable()) {
                this.extension_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
            }
        }

        private void ensureExtensionRangeIsMutable() {
            ProtobufList internal$ProtobufList0 = this.extensionRange_;
            if(!internal$ProtobufList0.isModifiable()) {
                this.extensionRange_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
            }
        }

        private void ensureFieldIsMutable() {
            ProtobufList internal$ProtobufList0 = this.field_;
            if(!internal$ProtobufList0.isModifiable()) {
                this.field_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
            }
        }

        private void ensureNestedTypeIsMutable() {
            ProtobufList internal$ProtobufList0 = this.nestedType_;
            if(!internal$ProtobufList0.isModifiable()) {
                this.nestedType_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
            }
        }

        private void ensureOneofDeclIsMutable() {
            ProtobufList internal$ProtobufList0 = this.oneofDecl_;
            if(!internal$ProtobufList0.isModifiable()) {
                this.oneofDecl_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
            }
        }

        private void ensureReservedNameIsMutable() {
            ProtobufList internal$ProtobufList0 = this.reservedName_;
            if(!internal$ProtobufList0.isModifiable()) {
                this.reservedName_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
            }
        }

        private void ensureReservedRangeIsMutable() {
            ProtobufList internal$ProtobufList0 = this.reservedRange_;
            if(!internal$ProtobufList0.isModifiable()) {
                this.reservedRange_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
            }
        }

        public static DescriptorProto getDefaultInstance() {
            return DescriptorProto.DEFAULT_INSTANCE;
        }

        @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public EnumDescriptorProto getEnumType(int v) {
            return (EnumDescriptorProto)this.enumType_.get(v);
        }

        @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public int getEnumTypeCount() {
            return this.enumType_.size();
        }

        @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public List getEnumTypeList() {
            return this.enumType_;
        }

        public EnumDescriptorProtoOrBuilder getEnumTypeOrBuilder(int v) {
            return (EnumDescriptorProtoOrBuilder)this.enumType_.get(v);
        }

        public List getEnumTypeOrBuilderList() {
            return this.enumType_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public FieldDescriptorProto getExtension(int v) {
            return (FieldDescriptorProto)this.extension_.get(v);
        }

        @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public int getExtensionCount() {
            return this.extension_.size();
        }

        @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public List getExtensionList() {
            return this.extension_;
        }

        public FieldDescriptorProtoOrBuilder getExtensionOrBuilder(int v) {
            return (FieldDescriptorProtoOrBuilder)this.extension_.get(v);
        }

        public List getExtensionOrBuilderList() {
            return this.extension_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public ExtensionRange getExtensionRange(int v) {
            return (ExtensionRange)this.extensionRange_.get(v);
        }

        @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public int getExtensionRangeCount() {
            return this.extensionRange_.size();
        }

        @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public List getExtensionRangeList() {
            return this.extensionRange_;
        }

        public ExtensionRangeOrBuilder getExtensionRangeOrBuilder(int v) {
            return (ExtensionRangeOrBuilder)this.extensionRange_.get(v);
        }

        public List getExtensionRangeOrBuilderList() {
            return this.extensionRange_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public FieldDescriptorProto getField(int v) {
            return (FieldDescriptorProto)this.field_.get(v);
        }

        @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public int getFieldCount() {
            return this.field_.size();
        }

        @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public List getFieldList() {
            return this.field_;
        }

        public FieldDescriptorProtoOrBuilder getFieldOrBuilder(int v) {
            return (FieldDescriptorProtoOrBuilder)this.field_.get(v);
        }

        public List getFieldOrBuilderList() {
            return this.field_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public DescriptorProto getNestedType(int v) {
            return (DescriptorProto)this.nestedType_.get(v);
        }

        @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public int getNestedTypeCount() {
            return this.nestedType_.size();
        }

        @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public List getNestedTypeList() {
            return this.nestedType_;
        }

        public DescriptorProtoOrBuilder getNestedTypeOrBuilder(int v) {
            return (DescriptorProtoOrBuilder)this.nestedType_.get(v);
        }

        public List getNestedTypeOrBuilderList() {
            return this.nestedType_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public OneofDescriptorProto getOneofDecl(int v) {
            return (OneofDescriptorProto)this.oneofDecl_.get(v);
        }

        @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public int getOneofDeclCount() {
            return this.oneofDecl_.size();
        }

        @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public List getOneofDeclList() {
            return this.oneofDecl_;
        }

        public OneofDescriptorProtoOrBuilder getOneofDeclOrBuilder(int v) {
            return (OneofDescriptorProtoOrBuilder)this.oneofDecl_.get(v);
        }

        public List getOneofDeclOrBuilderList() {
            return this.oneofDecl_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public MessageOptions getOptions() {
            return this.options_ == null ? MessageOptions.getDefaultInstance() : this.options_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public String getReservedName(int v) {
            return (String)this.reservedName_.get(v);
        }

        @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public ByteString getReservedNameBytes(int v) {
            return ByteString.copyFromUtf8(((String)this.reservedName_.get(v)));
        }

        @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public int getReservedNameCount() {
            return this.reservedName_.size();
        }

        @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public List getReservedNameList() {
            return this.reservedName_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public ReservedRange getReservedRange(int v) {
            return (ReservedRange)this.reservedRange_.get(v);
        }

        @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public int getReservedRangeCount() {
            return this.reservedRange_.size();
        }

        @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public List getReservedRangeList() {
            return this.reservedRange_;
        }

        public ReservedRangeOrBuilder getReservedRangeOrBuilder(int v) {
            return (ReservedRangeOrBuilder)this.reservedRange_.get(v);
        }

        public List getReservedRangeOrBuilderList() {
            return this.reservedRange_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$DescriptorProtoOrBuilder
        public boolean hasOptions() {
            return (this.bitField0_ & 2) != 0;
        }

        private void mergeOptions(MessageOptions descriptorProtos$MessageOptions0) {
            descriptorProtos$MessageOptions0.getClass();
            this.options_ = this.options_ == null || this.options_ == MessageOptions.getDefaultInstance() ? descriptorProtos$MessageOptions0 : ((MessageOptions)((com.google.protobuf.DescriptorProtos.MessageOptions.Builder)MessageOptions.newBuilder(this.options_).mergeFrom(descriptorProtos$MessageOptions0)).buildPartial());
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder)DescriptorProto.DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(DescriptorProto descriptorProtos$DescriptorProto0) {
            return (Builder)DescriptorProto.DEFAULT_INSTANCE.createBuilder(descriptorProtos$DescriptorProto0);
        }

        public static DescriptorProto parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (DescriptorProto)GeneratedMessageLite.parseDelimitedFrom(DescriptorProto.DEFAULT_INSTANCE, inputStream0);
        }

        public static DescriptorProto parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (DescriptorProto)GeneratedMessageLite.parseDelimitedFrom(DescriptorProto.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static DescriptorProto parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (DescriptorProto)GeneratedMessageLite.parseFrom(DescriptorProto.DEFAULT_INSTANCE, byteString0);
        }

        public static DescriptorProto parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (DescriptorProto)GeneratedMessageLite.parseFrom(DescriptorProto.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static DescriptorProto parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (DescriptorProto)GeneratedMessageLite.parseFrom(DescriptorProto.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static DescriptorProto parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (DescriptorProto)GeneratedMessageLite.parseFrom(DescriptorProto.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static DescriptorProto parseFrom(InputStream inputStream0) throws IOException {
            return (DescriptorProto)GeneratedMessageLite.parseFrom(DescriptorProto.DEFAULT_INSTANCE, inputStream0);
        }

        public static DescriptorProto parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (DescriptorProto)GeneratedMessageLite.parseFrom(DescriptorProto.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static DescriptorProto parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (DescriptorProto)GeneratedMessageLite.parseFrom(DescriptorProto.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static DescriptorProto parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (DescriptorProto)GeneratedMessageLite.parseFrom(DescriptorProto.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static DescriptorProto parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (DescriptorProto)GeneratedMessageLite.parseFrom(DescriptorProto.DEFAULT_INSTANCE, arr_b);
        }

        public static DescriptorProto parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (DescriptorProto)GeneratedMessageLite.parseFrom(DescriptorProto.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return DescriptorProto.DEFAULT_INSTANCE.getParserForType();
        }

        private void removeEnumType(int v) {
            this.ensureEnumTypeIsMutable();
            this.enumType_.remove(v);
        }

        private void removeExtension(int v) {
            this.ensureExtensionIsMutable();
            this.extension_.remove(v);
        }

        private void removeExtensionRange(int v) {
            this.ensureExtensionRangeIsMutable();
            this.extensionRange_.remove(v);
        }

        private void removeField(int v) {
            this.ensureFieldIsMutable();
            this.field_.remove(v);
        }

        private void removeNestedType(int v) {
            this.ensureNestedTypeIsMutable();
            this.nestedType_.remove(v);
        }

        private void removeOneofDecl(int v) {
            this.ensureOneofDeclIsMutable();
            this.oneofDecl_.remove(v);
        }

        private void removeReservedRange(int v) {
            this.ensureReservedRangeIsMutable();
            this.reservedRange_.remove(v);
        }

        private void setEnumType(int v, EnumDescriptorProto descriptorProtos$EnumDescriptorProto0) {
            descriptorProtos$EnumDescriptorProto0.getClass();
            this.ensureEnumTypeIsMutable();
            this.enumType_.set(v, descriptorProtos$EnumDescriptorProto0);
        }

        private void setExtension(int v, FieldDescriptorProto descriptorProtos$FieldDescriptorProto0) {
            descriptorProtos$FieldDescriptorProto0.getClass();
            this.ensureExtensionIsMutable();
            this.extension_.set(v, descriptorProtos$FieldDescriptorProto0);
        }

        private void setExtensionRange(int v, ExtensionRange descriptorProtos$DescriptorProto$ExtensionRange0) {
            descriptorProtos$DescriptorProto$ExtensionRange0.getClass();
            this.ensureExtensionRangeIsMutable();
            this.extensionRange_.set(v, descriptorProtos$DescriptorProto$ExtensionRange0);
        }

        private void setField(int v, FieldDescriptorProto descriptorProtos$FieldDescriptorProto0) {
            descriptorProtos$FieldDescriptorProto0.getClass();
            this.ensureFieldIsMutable();
            this.field_.set(v, descriptorProtos$FieldDescriptorProto0);
        }

        private void setName(String s) {
            s.getClass();
            this.bitField0_ |= 1;
            this.name_ = s;
        }

        private void setNameBytes(ByteString byteString0) {
            this.name_ = byteString0.toStringUtf8();
            this.bitField0_ |= 1;
        }

        private void setNestedType(int v, DescriptorProto descriptorProtos$DescriptorProto0) {
            descriptorProtos$DescriptorProto0.getClass();
            this.ensureNestedTypeIsMutable();
            this.nestedType_.set(v, descriptorProtos$DescriptorProto0);
        }

        private void setOneofDecl(int v, OneofDescriptorProto descriptorProtos$OneofDescriptorProto0) {
            descriptorProtos$OneofDescriptorProto0.getClass();
            this.ensureOneofDeclIsMutable();
            this.oneofDecl_.set(v, descriptorProtos$OneofDescriptorProto0);
        }

        private void setOptions(MessageOptions descriptorProtos$MessageOptions0) {
            descriptorProtos$MessageOptions0.getClass();
            this.options_ = descriptorProtos$MessageOptions0;
            this.bitField0_ |= 2;
        }

        private void setReservedName(int v, String s) {
            s.getClass();
            this.ensureReservedNameIsMutable();
            this.reservedName_.set(v, s);
        }

        private void setReservedRange(int v, ReservedRange descriptorProtos$DescriptorProto$ReservedRange0) {
            descriptorProtos$DescriptorProto$ReservedRange0.getClass();
            this.ensureReservedRangeIsMutable();
            this.reservedRange_.set(v, descriptorProtos$DescriptorProto$ReservedRange0);
        }
    }

    public interface DescriptorProtoOrBuilder extends MessageLiteOrBuilder {
        EnumDescriptorProto getEnumType(int arg1);

        int getEnumTypeCount();

        List getEnumTypeList();

        FieldDescriptorProto getExtension(int arg1);

        int getExtensionCount();

        List getExtensionList();

        ExtensionRange getExtensionRange(int arg1);

        int getExtensionRangeCount();

        List getExtensionRangeList();

        FieldDescriptorProto getField(int arg1);

        int getFieldCount();

        List getFieldList();

        String getName();

        ByteString getNameBytes();

        DescriptorProto getNestedType(int arg1);

        int getNestedTypeCount();

        List getNestedTypeList();

        OneofDescriptorProto getOneofDecl(int arg1);

        int getOneofDeclCount();

        List getOneofDeclList();

        MessageOptions getOptions();

        String getReservedName(int arg1);

        ByteString getReservedNameBytes(int arg1);

        int getReservedNameCount();

        List getReservedNameList();

        ReservedRange getReservedRange(int arg1);

        int getReservedRangeCount();

        List getReservedRangeList();

        boolean hasName();

        boolean hasOptions();
    }

    public static final class EnumDescriptorProto extends GeneratedMessageLite implements EnumDescriptorProtoOrBuilder {
        public static final class com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements EnumDescriptorProtoOrBuilder {
            private com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder() {
                super(EnumDescriptorProto.DEFAULT_INSTANCE);
            }

            com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder(a descriptorProtos$a0) {
            }

            public com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder addAllReservedName(Iterable iterable0) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).addAllReservedName(iterable0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder addAllReservedRange(Iterable iterable0) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).addAllReservedRange(iterable0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder addAllValue(Iterable iterable0) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).addAllValue(iterable0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder addReservedName(String s) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).addReservedName(s);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder addReservedNameBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).addReservedNameBytes(byteString0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder addReservedRange(int v, com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRange.Builder descriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder0) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).addReservedRange(v, ((EnumReservedRange)descriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder addReservedRange(int v, EnumReservedRange descriptorProtos$EnumDescriptorProto$EnumReservedRange0) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).addReservedRange(v, descriptorProtos$EnumDescriptorProto$EnumReservedRange0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder addReservedRange(com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRange.Builder descriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder0) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).addReservedRange(((EnumReservedRange)descriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder addReservedRange(EnumReservedRange descriptorProtos$EnumDescriptorProto$EnumReservedRange0) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).addReservedRange(descriptorProtos$EnumDescriptorProto$EnumReservedRange0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder addValue(int v, com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder descriptorProtos$EnumValueDescriptorProto$Builder0) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).addValue(v, ((EnumValueDescriptorProto)descriptorProtos$EnumValueDescriptorProto$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder addValue(int v, EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto0) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).addValue(v, descriptorProtos$EnumValueDescriptorProto0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder addValue(com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder descriptorProtos$EnumValueDescriptorProto$Builder0) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).addValue(((EnumValueDescriptorProto)descriptorProtos$EnumValueDescriptorProto$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder addValue(EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto0) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).addValue(descriptorProtos$EnumValueDescriptorProto0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder clearName() {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).clearName();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder clearOptions() {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).clearOptions();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder clearReservedName() {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).clearReservedName();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder clearReservedRange() {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).clearReservedRange();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder clearValue() {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).clearValue();
                return this;
            }

            @Override  // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
            public String getName() {
                return ((EnumDescriptorProto)this.instance).getName();
            }

            @Override  // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
            public ByteString getNameBytes() {
                return ((EnumDescriptorProto)this.instance).getNameBytes();
            }

            @Override  // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
            public EnumOptions getOptions() {
                return ((EnumDescriptorProto)this.instance).getOptions();
            }

            @Override  // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
            public String getReservedName(int v) {
                return ((EnumDescriptorProto)this.instance).getReservedName(v);
            }

            @Override  // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
            public ByteString getReservedNameBytes(int v) {
                return ((EnumDescriptorProto)this.instance).getReservedNameBytes(v);
            }

            @Override  // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
            public int getReservedNameCount() {
                return ((EnumDescriptorProto)this.instance).getReservedNameCount();
            }

            @Override  // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
            public List getReservedNameList() {
                return DesugarCollections.unmodifiableList(((EnumDescriptorProto)this.instance).getReservedNameList());
            }

            @Override  // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
            public EnumReservedRange getReservedRange(int v) {
                return ((EnumDescriptorProto)this.instance).getReservedRange(v);
            }

            @Override  // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
            public int getReservedRangeCount() {
                return ((EnumDescriptorProto)this.instance).getReservedRangeCount();
            }

            @Override  // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
            public List getReservedRangeList() {
                return DesugarCollections.unmodifiableList(((EnumDescriptorProto)this.instance).getReservedRangeList());
            }

            @Override  // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
            public EnumValueDescriptorProto getValue(int v) {
                return ((EnumDescriptorProto)this.instance).getValue(v);
            }

            @Override  // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
            public int getValueCount() {
                return ((EnumDescriptorProto)this.instance).getValueCount();
            }

            @Override  // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
            public List getValueList() {
                return DesugarCollections.unmodifiableList(((EnumDescriptorProto)this.instance).getValueList());
            }

            @Override  // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
            public boolean hasName() {
                return ((EnumDescriptorProto)this.instance).hasName();
            }

            @Override  // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
            public boolean hasOptions() {
                return ((EnumDescriptorProto)this.instance).hasOptions();
            }

            public com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder mergeOptions(EnumOptions descriptorProtos$EnumOptions0) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).mergeOptions(descriptorProtos$EnumOptions0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder removeReservedRange(int v) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).removeReservedRange(v);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder removeValue(int v) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).removeValue(v);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder setName(String s) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).setName(s);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder setNameBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).setNameBytes(byteString0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder setOptions(com.google.protobuf.DescriptorProtos.EnumOptions.Builder descriptorProtos$EnumOptions$Builder0) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).setOptions(((EnumOptions)descriptorProtos$EnumOptions$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder setOptions(EnumOptions descriptorProtos$EnumOptions0) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).setOptions(descriptorProtos$EnumOptions0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder setReservedName(int v, String s) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).setReservedName(v, s);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder setReservedRange(int v, com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRange.Builder descriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder0) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).setReservedRange(v, ((EnumReservedRange)descriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder setReservedRange(int v, EnumReservedRange descriptorProtos$EnumDescriptorProto$EnumReservedRange0) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).setReservedRange(v, descriptorProtos$EnumDescriptorProto$EnumReservedRange0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder setValue(int v, com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder descriptorProtos$EnumValueDescriptorProto$Builder0) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).setValue(v, ((EnumValueDescriptorProto)descriptorProtos$EnumValueDescriptorProto$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder setValue(int v, EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto0) {
                this.copyOnWrite();
                ((EnumDescriptorProto)this.instance).setValue(v, descriptorProtos$EnumValueDescriptorProto0);
                return this;
            }
        }

        public static final class EnumReservedRange extends GeneratedMessageLite implements EnumReservedRangeOrBuilder {
            public static final class com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRange.Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements EnumReservedRangeOrBuilder {
                private com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRange.Builder() {
                    super(EnumReservedRange.DEFAULT_INSTANCE);
                }

                com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRange.Builder(a descriptorProtos$a0) {
                }

                public com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRange.Builder clearEnd() {
                    this.copyOnWrite();
                    ((EnumReservedRange)this.instance).clearEnd();
                    return this;
                }

                public com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRange.Builder clearStart() {
                    this.copyOnWrite();
                    ((EnumReservedRange)this.instance).clearStart();
                    return this;
                }

                @Override  // com.google.protobuf.DescriptorProtos$EnumDescriptorProto$EnumReservedRangeOrBuilder
                public int getEnd() {
                    return ((EnumReservedRange)this.instance).getEnd();
                }

                @Override  // com.google.protobuf.DescriptorProtos$EnumDescriptorProto$EnumReservedRangeOrBuilder
                public int getStart() {
                    return ((EnumReservedRange)this.instance).getStart();
                }

                @Override  // com.google.protobuf.DescriptorProtos$EnumDescriptorProto$EnumReservedRangeOrBuilder
                public boolean hasEnd() {
                    return ((EnumReservedRange)this.instance).hasEnd();
                }

                @Override  // com.google.protobuf.DescriptorProtos$EnumDescriptorProto$EnumReservedRangeOrBuilder
                public boolean hasStart() {
                    return ((EnumReservedRange)this.instance).hasStart();
                }

                public com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRange.Builder setEnd(int v) {
                    this.copyOnWrite();
                    ((EnumReservedRange)this.instance).setEnd(v);
                    return this;
                }

                public com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRange.Builder setStart(int v) {
                    this.copyOnWrite();
                    ((EnumReservedRange)this.instance).setStart(v);
                    return this;
                }
            }

            private static final EnumReservedRange DEFAULT_INSTANCE = null;
            public static final int END_FIELD_NUMBER = 2;
            private static volatile Parser PARSER = null;
            public static final int START_FIELD_NUMBER = 1;
            private int bitField0_;
            private int end_;
            private int start_;

            static {
                EnumReservedRange descriptorProtos$EnumDescriptorProto$EnumReservedRange0 = new EnumReservedRange();
                EnumReservedRange.DEFAULT_INSTANCE = descriptorProtos$EnumDescriptorProto$EnumReservedRange0;
                GeneratedMessageLite.registerDefaultInstance(EnumReservedRange.class, descriptorProtos$EnumDescriptorProto$EnumReservedRange0);
            }

            private void clearEnd() {
                this.bitField0_ &= -3;
                this.end_ = 0;
            }

            private void clearStart() {
                this.bitField0_ &= -2;
                this.start_ = 0;
            }

            @Override  // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
                switch(generatedMessageLite$MethodToInvoke0) {
                    case 1: {
                        return new EnumReservedRange();
                    }
                    case 2: {
                        return new com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRange.Builder(null);
                    }
                    case 3: {
                        return GeneratedMessageLite.newMessageInfo(EnumReservedRange.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"bitField0_", "start_", "end_"});
                    }
                    case 4: {
                        return EnumReservedRange.DEFAULT_INSTANCE;
                    }
                    case 5: {
                        Parser parser0 = EnumReservedRange.PARSER;
                        if(parser0 == null) {
                            Class class0 = EnumReservedRange.class;
                            synchronized(class0) {
                                parser0 = EnumReservedRange.PARSER;
                                if(parser0 == null) {
                                    parser0 = new DefaultInstanceBasedParser(EnumReservedRange.DEFAULT_INSTANCE);
                                    EnumReservedRange.PARSER = parser0;
                                }
                            }
                        }
                        return parser0;
                    }
                    case 6: {
                        return (byte)1;
                    }
                    case 7: {
                        return null;
                    }
                    default: {
                        throw new UnsupportedOperationException();
                    }
                }
            }

            public static EnumReservedRange getDefaultInstance() {
                return EnumReservedRange.DEFAULT_INSTANCE;
            }

            @Override  // com.google.protobuf.DescriptorProtos$EnumDescriptorProto$EnumReservedRangeOrBuilder
            public int getEnd() {
                return this.end_;
            }

            @Override  // com.google.protobuf.DescriptorProtos$EnumDescriptorProto$EnumReservedRangeOrBuilder
            public int getStart() {
                return this.start_;
            }

            @Override  // com.google.protobuf.DescriptorProtos$EnumDescriptorProto$EnumReservedRangeOrBuilder
            public boolean hasEnd() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override  // com.google.protobuf.DescriptorProtos$EnumDescriptorProto$EnumReservedRangeOrBuilder
            public boolean hasStart() {
                return (this.bitField0_ & 1) != 0;
            }

            public static com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRange.Builder newBuilder() {
                return (com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRange.Builder)EnumReservedRange.DEFAULT_INSTANCE.createBuilder();
            }

            public static com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRange.Builder newBuilder(EnumReservedRange descriptorProtos$EnumDescriptorProto$EnumReservedRange0) {
                return (com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRange.Builder)EnumReservedRange.DEFAULT_INSTANCE.createBuilder(descriptorProtos$EnumDescriptorProto$EnumReservedRange0);
            }

            public static EnumReservedRange parseDelimitedFrom(InputStream inputStream0) throws IOException {
                return (EnumReservedRange)GeneratedMessageLite.parseDelimitedFrom(EnumReservedRange.DEFAULT_INSTANCE, inputStream0);
            }

            public static EnumReservedRange parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return (EnumReservedRange)GeneratedMessageLite.parseDelimitedFrom(EnumReservedRange.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
            }

            public static EnumReservedRange parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
                return (EnumReservedRange)GeneratedMessageLite.parseFrom(EnumReservedRange.DEFAULT_INSTANCE, byteString0);
            }

            public static EnumReservedRange parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
                return (EnumReservedRange)GeneratedMessageLite.parseFrom(EnumReservedRange.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
            }

            public static EnumReservedRange parseFrom(CodedInputStream codedInputStream0) throws IOException {
                return (EnumReservedRange)GeneratedMessageLite.parseFrom(EnumReservedRange.DEFAULT_INSTANCE, codedInputStream0);
            }

            public static EnumReservedRange parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return (EnumReservedRange)GeneratedMessageLite.parseFrom(EnumReservedRange.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
            }

            public static EnumReservedRange parseFrom(InputStream inputStream0) throws IOException {
                return (EnumReservedRange)GeneratedMessageLite.parseFrom(EnumReservedRange.DEFAULT_INSTANCE, inputStream0);
            }

            public static EnumReservedRange parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return (EnumReservedRange)GeneratedMessageLite.parseFrom(EnumReservedRange.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
            }

            public static EnumReservedRange parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
                return (EnumReservedRange)GeneratedMessageLite.parseFrom(EnumReservedRange.DEFAULT_INSTANCE, byteBuffer0);
            }

            public static EnumReservedRange parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
                return (EnumReservedRange)GeneratedMessageLite.parseFrom(EnumReservedRange.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
            }

            public static EnumReservedRange parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
                return (EnumReservedRange)GeneratedMessageLite.parseFrom(EnumReservedRange.DEFAULT_INSTANCE, arr_b);
            }

            public static EnumReservedRange parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
                return (EnumReservedRange)GeneratedMessageLite.parseFrom(EnumReservedRange.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
            }

            public static Parser parser() {
                return EnumReservedRange.DEFAULT_INSTANCE.getParserForType();
            }

            private void setEnd(int v) {
                this.bitField0_ |= 2;
                this.end_ = v;
            }

            private void setStart(int v) {
                this.bitField0_ |= 1;
                this.start_ = v;
            }
        }

        public interface EnumReservedRangeOrBuilder extends MessageLiteOrBuilder {
            int getEnd();

            int getStart();

            boolean hasEnd();

            boolean hasStart();
        }

        private static final EnumDescriptorProto DEFAULT_INSTANCE = null;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private static volatile Parser PARSER = null;
        public static final int RESERVED_NAME_FIELD_NUMBER = 5;
        public static final int RESERVED_RANGE_FIELD_NUMBER = 4;
        public static final int VALUE_FIELD_NUMBER = 2;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private String name_;
        private EnumOptions options_;
        private ProtobufList reservedName_;
        private ProtobufList reservedRange_;
        private ProtobufList value_;

        static {
            EnumDescriptorProto descriptorProtos$EnumDescriptorProto0 = new EnumDescriptorProto();
            EnumDescriptorProto.DEFAULT_INSTANCE = descriptorProtos$EnumDescriptorProto0;
            GeneratedMessageLite.registerDefaultInstance(EnumDescriptorProto.class, descriptorProtos$EnumDescriptorProto0);
        }

        private EnumDescriptorProto() {
            this.memoizedIsInitialized = 2;
            this.name_ = "";
            this.value_ = GeneratedMessageLite.emptyProtobufList();
            this.reservedRange_ = GeneratedMessageLite.emptyProtobufList();
            this.reservedName_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void addAllReservedName(Iterable iterable0) {
            this.ensureReservedNameIsMutable();
            AbstractMessageLite.addAll(iterable0, this.reservedName_);
        }

        private void addAllReservedRange(Iterable iterable0) {
            this.ensureReservedRangeIsMutable();
            AbstractMessageLite.addAll(iterable0, this.reservedRange_);
        }

        private void addAllValue(Iterable iterable0) {
            this.ensureValueIsMutable();
            AbstractMessageLite.addAll(iterable0, this.value_);
        }

        private void addReservedName(String s) {
            s.getClass();
            this.ensureReservedNameIsMutable();
            this.reservedName_.add(s);
        }

        private void addReservedNameBytes(ByteString byteString0) {
            this.ensureReservedNameIsMutable();
            this.reservedName_.add(byteString0.toStringUtf8());
        }

        private void addReservedRange(int v, EnumReservedRange descriptorProtos$EnumDescriptorProto$EnumReservedRange0) {
            descriptorProtos$EnumDescriptorProto$EnumReservedRange0.getClass();
            this.ensureReservedRangeIsMutable();
            this.reservedRange_.add(v, descriptorProtos$EnumDescriptorProto$EnumReservedRange0);
        }

        private void addReservedRange(EnumReservedRange descriptorProtos$EnumDescriptorProto$EnumReservedRange0) {
            descriptorProtos$EnumDescriptorProto$EnumReservedRange0.getClass();
            this.ensureReservedRangeIsMutable();
            this.reservedRange_.add(descriptorProtos$EnumDescriptorProto$EnumReservedRange0);
        }

        private void addValue(int v, EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto0) {
            descriptorProtos$EnumValueDescriptorProto0.getClass();
            this.ensureValueIsMutable();
            this.value_.add(v, descriptorProtos$EnumValueDescriptorProto0);
        }

        private void addValue(EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto0) {
            descriptorProtos$EnumValueDescriptorProto0.getClass();
            this.ensureValueIsMutable();
            this.value_.add(descriptorProtos$EnumValueDescriptorProto0);
        }

        private void clearName() {
            this.bitField0_ &= -2;
            this.name_ = EnumDescriptorProto.getDefaultInstance().getName();
        }

        private void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -3;
        }

        private void clearReservedName() {
            this.reservedName_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearReservedRange() {
            this.reservedRange_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearValue() {
            this.value_ = GeneratedMessageLite.emptyProtobufList();
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            int v = 1;
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new EnumDescriptorProto();
                }
                case 2: {
                    return new com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(EnumDescriptorProto.DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0003\u0002\u0001ဈ\u0000\u0002Л\u0003ᐉ\u0001\u0004\u001B\u0005\u001A", new Object[]{"bitField0_", "name_", "value_", EnumValueDescriptorProto.class, "options_", "reservedRange_", EnumReservedRange.class, "reservedName_"});
                }
                case 4: {
                    return EnumDescriptorProto.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = EnumDescriptorProto.PARSER;
                    if(parser0 == null) {
                        synchronized(EnumDescriptorProto.class) {
                            parser0 = EnumDescriptorProto.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(EnumDescriptorProto.DEFAULT_INSTANCE);
                                EnumDescriptorProto.PARSER = parser0;
                            }
                        }
                    }
                    return parser0;
                }
                case 6: {
                    return this.memoizedIsInitialized;
                }
                case 7: {
                    if(object0 == null) {
                        v = 0;
                    }
                    this.memoizedIsInitialized = (byte)v;
                    return null;
                }
                default: {
                    throw new UnsupportedOperationException();
                }
            }
        }

        private void ensureReservedNameIsMutable() {
            ProtobufList internal$ProtobufList0 = this.reservedName_;
            if(!internal$ProtobufList0.isModifiable()) {
                this.reservedName_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
            }
        }

        private void ensureReservedRangeIsMutable() {
            ProtobufList internal$ProtobufList0 = this.reservedRange_;
            if(!internal$ProtobufList0.isModifiable()) {
                this.reservedRange_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
            }
        }

        private void ensureValueIsMutable() {
            ProtobufList internal$ProtobufList0 = this.value_;
            if(!internal$ProtobufList0.isModifiable()) {
                this.value_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
            }
        }

        public static EnumDescriptorProto getDefaultInstance() {
            return EnumDescriptorProto.DEFAULT_INSTANCE;
        }

        @Override  // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override  // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
        public EnumOptions getOptions() {
            return this.options_ == null ? EnumOptions.getDefaultInstance() : this.options_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
        public String getReservedName(int v) {
            return (String)this.reservedName_.get(v);
        }

        @Override  // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
        public ByteString getReservedNameBytes(int v) {
            return ByteString.copyFromUtf8(((String)this.reservedName_.get(v)));
        }

        @Override  // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
        public int getReservedNameCount() {
            return this.reservedName_.size();
        }

        @Override  // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
        public List getReservedNameList() {
            return this.reservedName_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
        public EnumReservedRange getReservedRange(int v) {
            return (EnumReservedRange)this.reservedRange_.get(v);
        }

        @Override  // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
        public int getReservedRangeCount() {
            return this.reservedRange_.size();
        }

        @Override  // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
        public List getReservedRangeList() {
            return this.reservedRange_;
        }

        public EnumReservedRangeOrBuilder getReservedRangeOrBuilder(int v) {
            return (EnumReservedRangeOrBuilder)this.reservedRange_.get(v);
        }

        public List getReservedRangeOrBuilderList() {
            return this.reservedRange_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
        public EnumValueDescriptorProto getValue(int v) {
            return (EnumValueDescriptorProto)this.value_.get(v);
        }

        @Override  // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
        public int getValueCount() {
            return this.value_.size();
        }

        @Override  // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
        public List getValueList() {
            return this.value_;
        }

        public EnumValueDescriptorProtoOrBuilder getValueOrBuilder(int v) {
            return (EnumValueDescriptorProtoOrBuilder)this.value_.get(v);
        }

        public List getValueOrBuilderList() {
            return this.value_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$EnumDescriptorProtoOrBuilder
        public boolean hasOptions() {
            return (this.bitField0_ & 2) != 0;
        }

        private void mergeOptions(EnumOptions descriptorProtos$EnumOptions0) {
            descriptorProtos$EnumOptions0.getClass();
            this.options_ = this.options_ == null || this.options_ == EnumOptions.getDefaultInstance() ? descriptorProtos$EnumOptions0 : ((EnumOptions)((com.google.protobuf.DescriptorProtos.EnumOptions.Builder)EnumOptions.newBuilder(this.options_).mergeFrom(descriptorProtos$EnumOptions0)).buildPartial());
            this.bitField0_ |= 2;
        }

        public static com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder newBuilder() {
            return (com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder)EnumDescriptorProto.DEFAULT_INSTANCE.createBuilder();
        }

        public static com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder newBuilder(EnumDescriptorProto descriptorProtos$EnumDescriptorProto0) {
            return (com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder)EnumDescriptorProto.DEFAULT_INSTANCE.createBuilder(descriptorProtos$EnumDescriptorProto0);
        }

        public static EnumDescriptorProto parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (EnumDescriptorProto)GeneratedMessageLite.parseDelimitedFrom(EnumDescriptorProto.DEFAULT_INSTANCE, inputStream0);
        }

        public static EnumDescriptorProto parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (EnumDescriptorProto)GeneratedMessageLite.parseDelimitedFrom(EnumDescriptorProto.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static EnumDescriptorProto parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (EnumDescriptorProto)GeneratedMessageLite.parseFrom(EnumDescriptorProto.DEFAULT_INSTANCE, byteString0);
        }

        public static EnumDescriptorProto parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (EnumDescriptorProto)GeneratedMessageLite.parseFrom(EnumDescriptorProto.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static EnumDescriptorProto parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (EnumDescriptorProto)GeneratedMessageLite.parseFrom(EnumDescriptorProto.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static EnumDescriptorProto parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (EnumDescriptorProto)GeneratedMessageLite.parseFrom(EnumDescriptorProto.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static EnumDescriptorProto parseFrom(InputStream inputStream0) throws IOException {
            return (EnumDescriptorProto)GeneratedMessageLite.parseFrom(EnumDescriptorProto.DEFAULT_INSTANCE, inputStream0);
        }

        public static EnumDescriptorProto parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (EnumDescriptorProto)GeneratedMessageLite.parseFrom(EnumDescriptorProto.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static EnumDescriptorProto parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (EnumDescriptorProto)GeneratedMessageLite.parseFrom(EnumDescriptorProto.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static EnumDescriptorProto parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (EnumDescriptorProto)GeneratedMessageLite.parseFrom(EnumDescriptorProto.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static EnumDescriptorProto parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (EnumDescriptorProto)GeneratedMessageLite.parseFrom(EnumDescriptorProto.DEFAULT_INSTANCE, arr_b);
        }

        public static EnumDescriptorProto parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (EnumDescriptorProto)GeneratedMessageLite.parseFrom(EnumDescriptorProto.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return EnumDescriptorProto.DEFAULT_INSTANCE.getParserForType();
        }

        private void removeReservedRange(int v) {
            this.ensureReservedRangeIsMutable();
            this.reservedRange_.remove(v);
        }

        private void removeValue(int v) {
            this.ensureValueIsMutable();
            this.value_.remove(v);
        }

        private void setName(String s) {
            s.getClass();
            this.bitField0_ |= 1;
            this.name_ = s;
        }

        private void setNameBytes(ByteString byteString0) {
            this.name_ = byteString0.toStringUtf8();
            this.bitField0_ |= 1;
        }

        private void setOptions(EnumOptions descriptorProtos$EnumOptions0) {
            descriptorProtos$EnumOptions0.getClass();
            this.options_ = descriptorProtos$EnumOptions0;
            this.bitField0_ |= 2;
        }

        private void setReservedName(int v, String s) {
            s.getClass();
            this.ensureReservedNameIsMutable();
            this.reservedName_.set(v, s);
        }

        private void setReservedRange(int v, EnumReservedRange descriptorProtos$EnumDescriptorProto$EnumReservedRange0) {
            descriptorProtos$EnumDescriptorProto$EnumReservedRange0.getClass();
            this.ensureReservedRangeIsMutable();
            this.reservedRange_.set(v, descriptorProtos$EnumDescriptorProto$EnumReservedRange0);
        }

        private void setValue(int v, EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto0) {
            descriptorProtos$EnumValueDescriptorProto0.getClass();
            this.ensureValueIsMutable();
            this.value_.set(v, descriptorProtos$EnumValueDescriptorProto0);
        }
    }

    public interface EnumDescriptorProtoOrBuilder extends MessageLiteOrBuilder {
        String getName();

        ByteString getNameBytes();

        EnumOptions getOptions();

        String getReservedName(int arg1);

        ByteString getReservedNameBytes(int arg1);

        int getReservedNameCount();

        List getReservedNameList();

        EnumReservedRange getReservedRange(int arg1);

        int getReservedRangeCount();

        List getReservedRangeList();

        EnumValueDescriptorProto getValue(int arg1);

        int getValueCount();

        List getValueList();

        boolean hasName();

        boolean hasOptions();
    }

    public static final class EnumOptions extends ExtendableMessage implements EnumOptionsOrBuilder {
        public static final class com.google.protobuf.DescriptorProtos.EnumOptions.Builder extends ExtendableBuilder implements EnumOptionsOrBuilder {
            private com.google.protobuf.DescriptorProtos.EnumOptions.Builder() {
                super(EnumOptions.DEFAULT_INSTANCE);
            }

            com.google.protobuf.DescriptorProtos.EnumOptions.Builder(a descriptorProtos$a0) {
            }

            public com.google.protobuf.DescriptorProtos.EnumOptions.Builder addAllUninterpretedOption(Iterable iterable0) {
                this.copyOnWrite();
                ((EnumOptions)this.instance).addAllUninterpretedOption(iterable0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumOptions.Builder addUninterpretedOption(int v, com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder descriptorProtos$UninterpretedOption$Builder0) {
                this.copyOnWrite();
                ((EnumOptions)this.instance).addUninterpretedOption(v, ((UninterpretedOption)descriptorProtos$UninterpretedOption$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumOptions.Builder addUninterpretedOption(int v, UninterpretedOption descriptorProtos$UninterpretedOption0) {
                this.copyOnWrite();
                ((EnumOptions)this.instance).addUninterpretedOption(v, descriptorProtos$UninterpretedOption0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumOptions.Builder addUninterpretedOption(com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder descriptorProtos$UninterpretedOption$Builder0) {
                this.copyOnWrite();
                ((EnumOptions)this.instance).addUninterpretedOption(((UninterpretedOption)descriptorProtos$UninterpretedOption$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumOptions.Builder addUninterpretedOption(UninterpretedOption descriptorProtos$UninterpretedOption0) {
                this.copyOnWrite();
                ((EnumOptions)this.instance).addUninterpretedOption(descriptorProtos$UninterpretedOption0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumOptions.Builder clearAllowAlias() {
                this.copyOnWrite();
                ((EnumOptions)this.instance).clearAllowAlias();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumOptions.Builder clearDeprecated() {
                this.copyOnWrite();
                ((EnumOptions)this.instance).clearDeprecated();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumOptions.Builder clearUninterpretedOption() {
                this.copyOnWrite();
                ((EnumOptions)this.instance).clearUninterpretedOption();
                return this;
            }

            @Override  // com.google.protobuf.DescriptorProtos$EnumOptionsOrBuilder
            public boolean getAllowAlias() {
                return ((EnumOptions)this.instance).getAllowAlias();
            }

            @Override  // com.google.protobuf.DescriptorProtos$EnumOptionsOrBuilder
            public boolean getDeprecated() {
                return ((EnumOptions)this.instance).getDeprecated();
            }

            @Override  // com.google.protobuf.DescriptorProtos$EnumOptionsOrBuilder
            public UninterpretedOption getUninterpretedOption(int v) {
                return ((EnumOptions)this.instance).getUninterpretedOption(v);
            }

            @Override  // com.google.protobuf.DescriptorProtos$EnumOptionsOrBuilder
            public int getUninterpretedOptionCount() {
                return ((EnumOptions)this.instance).getUninterpretedOptionCount();
            }

            @Override  // com.google.protobuf.DescriptorProtos$EnumOptionsOrBuilder
            public List getUninterpretedOptionList() {
                return DesugarCollections.unmodifiableList(((EnumOptions)this.instance).getUninterpretedOptionList());
            }

            @Override  // com.google.protobuf.DescriptorProtos$EnumOptionsOrBuilder
            public boolean hasAllowAlias() {
                return ((EnumOptions)this.instance).hasAllowAlias();
            }

            @Override  // com.google.protobuf.DescriptorProtos$EnumOptionsOrBuilder
            public boolean hasDeprecated() {
                return ((EnumOptions)this.instance).hasDeprecated();
            }

            public com.google.protobuf.DescriptorProtos.EnumOptions.Builder removeUninterpretedOption(int v) {
                this.copyOnWrite();
                ((EnumOptions)this.instance).removeUninterpretedOption(v);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumOptions.Builder setAllowAlias(boolean z) {
                this.copyOnWrite();
                ((EnumOptions)this.instance).setAllowAlias(z);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumOptions.Builder setDeprecated(boolean z) {
                this.copyOnWrite();
                ((EnumOptions)this.instance).setDeprecated(z);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumOptions.Builder setUninterpretedOption(int v, com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder descriptorProtos$UninterpretedOption$Builder0) {
                this.copyOnWrite();
                ((EnumOptions)this.instance).setUninterpretedOption(v, ((UninterpretedOption)descriptorProtos$UninterpretedOption$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumOptions.Builder setUninterpretedOption(int v, UninterpretedOption descriptorProtos$UninterpretedOption0) {
                this.copyOnWrite();
                ((EnumOptions)this.instance).setUninterpretedOption(v, descriptorProtos$UninterpretedOption0);
                return this;
            }
        }

        public static final int ALLOW_ALIAS_FIELD_NUMBER = 2;
        private static final EnumOptions DEFAULT_INSTANCE = null;
        public static final int DEPRECATED_FIELD_NUMBER = 3;
        private static volatile Parser PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private boolean allowAlias_;
        private int bitField0_;
        private boolean deprecated_;
        private byte memoizedIsInitialized;
        private ProtobufList uninterpretedOption_;

        static {
            EnumOptions descriptorProtos$EnumOptions0 = new EnumOptions();
            EnumOptions.DEFAULT_INSTANCE = descriptorProtos$EnumOptions0;
            GeneratedMessageLite.registerDefaultInstance(EnumOptions.class, descriptorProtos$EnumOptions0);
        }

        private EnumOptions() {
            this.memoizedIsInitialized = 2;
            this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void addAllUninterpretedOption(Iterable iterable0) {
            this.ensureUninterpretedOptionIsMutable();
            AbstractMessageLite.addAll(iterable0, this.uninterpretedOption_);
        }

        private void addUninterpretedOption(int v, UninterpretedOption descriptorProtos$UninterpretedOption0) {
            descriptorProtos$UninterpretedOption0.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(v, descriptorProtos$UninterpretedOption0);
        }

        private void addUninterpretedOption(UninterpretedOption descriptorProtos$UninterpretedOption0) {
            descriptorProtos$UninterpretedOption0.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(descriptorProtos$UninterpretedOption0);
        }

        private void clearAllowAlias() {
            this.bitField0_ &= -2;
            this.allowAlias_ = false;
        }

        private void clearDeprecated() {
            this.bitField0_ &= -3;
            this.deprecated_ = false;
        }

        private void clearUninterpretedOption() {
            this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            int v = 1;
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new EnumOptions();
                }
                case 2: {
                    return new com.google.protobuf.DescriptorProtos.EnumOptions.Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(EnumOptions.DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0002ϧ\u0003\u0000\u0001\u0001\u0002ဇ\u0000\u0003ဇ\u0001ϧЛ", new Object[]{"bitField0_", "allowAlias_", "deprecated_", "uninterpretedOption_", UninterpretedOption.class});
                }
                case 4: {
                    return EnumOptions.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = EnumOptions.PARSER;
                    if(parser0 == null) {
                        synchronized(EnumOptions.class) {
                            parser0 = EnumOptions.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(EnumOptions.DEFAULT_INSTANCE);
                                EnumOptions.PARSER = parser0;
                            }
                        }
                    }
                    return parser0;
                }
                case 6: {
                    return this.memoizedIsInitialized;
                }
                case 7: {
                    if(object0 == null) {
                        v = 0;
                    }
                    this.memoizedIsInitialized = (byte)v;
                    return null;
                }
                default: {
                    throw new UnsupportedOperationException();
                }
            }
        }

        private void ensureUninterpretedOptionIsMutable() {
            ProtobufList internal$ProtobufList0 = this.uninterpretedOption_;
            if(!internal$ProtobufList0.isModifiable()) {
                this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
            }
        }

        @Override  // com.google.protobuf.DescriptorProtos$EnumOptionsOrBuilder
        public boolean getAllowAlias() {
            return this.allowAlias_;
        }

        public static EnumOptions getDefaultInstance() {
            return EnumOptions.DEFAULT_INSTANCE;
        }

        @Override  // com.google.protobuf.DescriptorProtos$EnumOptionsOrBuilder
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$EnumOptionsOrBuilder
        public UninterpretedOption getUninterpretedOption(int v) {
            return (UninterpretedOption)this.uninterpretedOption_.get(v);
        }

        @Override  // com.google.protobuf.DescriptorProtos$EnumOptionsOrBuilder
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override  // com.google.protobuf.DescriptorProtos$EnumOptionsOrBuilder
        public List getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int v) {
            return (UninterpretedOptionOrBuilder)this.uninterpretedOption_.get(v);
        }

        public List getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$EnumOptionsOrBuilder
        public boolean hasAllowAlias() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$EnumOptionsOrBuilder
        public boolean hasDeprecated() {
            return (this.bitField0_ & 2) != 0;
        }

        public static com.google.protobuf.DescriptorProtos.EnumOptions.Builder newBuilder() {
            return (com.google.protobuf.DescriptorProtos.EnumOptions.Builder)EnumOptions.DEFAULT_INSTANCE.createBuilder();
        }

        public static com.google.protobuf.DescriptorProtos.EnumOptions.Builder newBuilder(EnumOptions descriptorProtos$EnumOptions0) {
            return (com.google.protobuf.DescriptorProtos.EnumOptions.Builder)EnumOptions.DEFAULT_INSTANCE.createBuilder(descriptorProtos$EnumOptions0);
        }

        public static EnumOptions parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (EnumOptions)GeneratedMessageLite.parseDelimitedFrom(EnumOptions.DEFAULT_INSTANCE, inputStream0);
        }

        public static EnumOptions parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (EnumOptions)GeneratedMessageLite.parseDelimitedFrom(EnumOptions.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static EnumOptions parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (EnumOptions)GeneratedMessageLite.parseFrom(EnumOptions.DEFAULT_INSTANCE, byteString0);
        }

        public static EnumOptions parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (EnumOptions)GeneratedMessageLite.parseFrom(EnumOptions.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static EnumOptions parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (EnumOptions)GeneratedMessageLite.parseFrom(EnumOptions.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static EnumOptions parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (EnumOptions)GeneratedMessageLite.parseFrom(EnumOptions.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static EnumOptions parseFrom(InputStream inputStream0) throws IOException {
            return (EnumOptions)GeneratedMessageLite.parseFrom(EnumOptions.DEFAULT_INSTANCE, inputStream0);
        }

        public static EnumOptions parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (EnumOptions)GeneratedMessageLite.parseFrom(EnumOptions.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static EnumOptions parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (EnumOptions)GeneratedMessageLite.parseFrom(EnumOptions.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static EnumOptions parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (EnumOptions)GeneratedMessageLite.parseFrom(EnumOptions.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static EnumOptions parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (EnumOptions)GeneratedMessageLite.parseFrom(EnumOptions.DEFAULT_INSTANCE, arr_b);
        }

        public static EnumOptions parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (EnumOptions)GeneratedMessageLite.parseFrom(EnumOptions.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return EnumOptions.DEFAULT_INSTANCE.getParserForType();
        }

        private void removeUninterpretedOption(int v) {
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(v);
        }

        private void setAllowAlias(boolean z) {
            this.bitField0_ |= 1;
            this.allowAlias_ = z;
        }

        private void setDeprecated(boolean z) {
            this.bitField0_ |= 2;
            this.deprecated_ = z;
        }

        private void setUninterpretedOption(int v, UninterpretedOption descriptorProtos$UninterpretedOption0) {
            descriptorProtos$UninterpretedOption0.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(v, descriptorProtos$UninterpretedOption0);
        }
    }

    public interface EnumOptionsOrBuilder extends ExtendableMessageOrBuilder {
        boolean getAllowAlias();

        boolean getDeprecated();

        UninterpretedOption getUninterpretedOption(int arg1);

        int getUninterpretedOptionCount();

        List getUninterpretedOptionList();

        boolean hasAllowAlias();

        boolean hasDeprecated();
    }

    public static final class EnumValueDescriptorProto extends GeneratedMessageLite implements EnumValueDescriptorProtoOrBuilder {
        public static final class com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements EnumValueDescriptorProtoOrBuilder {
            private com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder() {
                super(EnumValueDescriptorProto.DEFAULT_INSTANCE);
            }

            com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder(a descriptorProtos$a0) {
            }

            public com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder clearName() {
                this.copyOnWrite();
                ((EnumValueDescriptorProto)this.instance).clearName();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder clearNumber() {
                this.copyOnWrite();
                ((EnumValueDescriptorProto)this.instance).clearNumber();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder clearOptions() {
                this.copyOnWrite();
                ((EnumValueDescriptorProto)this.instance).clearOptions();
                return this;
            }

            @Override  // com.google.protobuf.DescriptorProtos$EnumValueDescriptorProtoOrBuilder
            public String getName() {
                return ((EnumValueDescriptorProto)this.instance).getName();
            }

            @Override  // com.google.protobuf.DescriptorProtos$EnumValueDescriptorProtoOrBuilder
            public ByteString getNameBytes() {
                return ((EnumValueDescriptorProto)this.instance).getNameBytes();
            }

            @Override  // com.google.protobuf.DescriptorProtos$EnumValueDescriptorProtoOrBuilder
            public int getNumber() {
                return ((EnumValueDescriptorProto)this.instance).getNumber();
            }

            @Override  // com.google.protobuf.DescriptorProtos$EnumValueDescriptorProtoOrBuilder
            public EnumValueOptions getOptions() {
                return ((EnumValueDescriptorProto)this.instance).getOptions();
            }

            @Override  // com.google.protobuf.DescriptorProtos$EnumValueDescriptorProtoOrBuilder
            public boolean hasName() {
                return ((EnumValueDescriptorProto)this.instance).hasName();
            }

            @Override  // com.google.protobuf.DescriptorProtos$EnumValueDescriptorProtoOrBuilder
            public boolean hasNumber() {
                return ((EnumValueDescriptorProto)this.instance).hasNumber();
            }

            @Override  // com.google.protobuf.DescriptorProtos$EnumValueDescriptorProtoOrBuilder
            public boolean hasOptions() {
                return ((EnumValueDescriptorProto)this.instance).hasOptions();
            }

            public com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder mergeOptions(EnumValueOptions descriptorProtos$EnumValueOptions0) {
                this.copyOnWrite();
                ((EnumValueDescriptorProto)this.instance).mergeOptions(descriptorProtos$EnumValueOptions0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder setName(String s) {
                this.copyOnWrite();
                ((EnumValueDescriptorProto)this.instance).setName(s);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder setNameBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((EnumValueDescriptorProto)this.instance).setNameBytes(byteString0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder setNumber(int v) {
                this.copyOnWrite();
                ((EnumValueDescriptorProto)this.instance).setNumber(v);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder setOptions(com.google.protobuf.DescriptorProtos.EnumValueOptions.Builder descriptorProtos$EnumValueOptions$Builder0) {
                this.copyOnWrite();
                ((EnumValueDescriptorProto)this.instance).setOptions(((EnumValueOptions)descriptorProtos$EnumValueOptions$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder setOptions(EnumValueOptions descriptorProtos$EnumValueOptions0) {
                this.copyOnWrite();
                ((EnumValueDescriptorProto)this.instance).setOptions(descriptorProtos$EnumValueOptions0);
                return this;
            }
        }

        private static final EnumValueDescriptorProto DEFAULT_INSTANCE = null;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int NUMBER_FIELD_NUMBER = 2;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private static volatile Parser PARSER;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private String name_;
        private int number_;
        private EnumValueOptions options_;

        static {
            EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto0 = new EnumValueDescriptorProto();
            EnumValueDescriptorProto.DEFAULT_INSTANCE = descriptorProtos$EnumValueDescriptorProto0;
            GeneratedMessageLite.registerDefaultInstance(EnumValueDescriptorProto.class, descriptorProtos$EnumValueDescriptorProto0);
        }

        private EnumValueDescriptorProto() {
            this.memoizedIsInitialized = 2;
            this.name_ = "";
        }

        private void clearName() {
            this.bitField0_ &= -2;
            this.name_ = EnumValueDescriptorProto.getDefaultInstance().getName();
        }

        private void clearNumber() {
            this.bitField0_ &= -3;
            this.number_ = 0;
        }

        private void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -5;
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            int v = 1;
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new EnumValueDescriptorProto();
                }
                case 2: {
                    return new com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(EnumValueDescriptorProto.DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"bitField0_", "name_", "number_", "options_"});
                }
                case 4: {
                    return EnumValueDescriptorProto.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = EnumValueDescriptorProto.PARSER;
                    if(parser0 == null) {
                        synchronized(EnumValueDescriptorProto.class) {
                            parser0 = EnumValueDescriptorProto.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(EnumValueDescriptorProto.DEFAULT_INSTANCE);
                                EnumValueDescriptorProto.PARSER = parser0;
                            }
                        }
                    }
                    return parser0;
                }
                case 6: {
                    return this.memoizedIsInitialized;
                }
                case 7: {
                    if(object0 == null) {
                        v = 0;
                    }
                    this.memoizedIsInitialized = (byte)v;
                    return null;
                }
                default: {
                    throw new UnsupportedOperationException();
                }
            }
        }

        public static EnumValueDescriptorProto getDefaultInstance() {
            return EnumValueDescriptorProto.DEFAULT_INSTANCE;
        }

        @Override  // com.google.protobuf.DescriptorProtos$EnumValueDescriptorProtoOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$EnumValueDescriptorProtoOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override  // com.google.protobuf.DescriptorProtos$EnumValueDescriptorProtoOrBuilder
        public int getNumber() {
            return this.number_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$EnumValueDescriptorProtoOrBuilder
        public EnumValueOptions getOptions() {
            return this.options_ == null ? EnumValueOptions.getDefaultInstance() : this.options_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$EnumValueDescriptorProtoOrBuilder
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$EnumValueDescriptorProtoOrBuilder
        public boolean hasNumber() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$EnumValueDescriptorProtoOrBuilder
        public boolean hasOptions() {
            return (this.bitField0_ & 4) != 0;
        }

        private void mergeOptions(EnumValueOptions descriptorProtos$EnumValueOptions0) {
            descriptorProtos$EnumValueOptions0.getClass();
            this.options_ = this.options_ == null || this.options_ == EnumValueOptions.getDefaultInstance() ? descriptorProtos$EnumValueOptions0 : ((EnumValueOptions)((com.google.protobuf.DescriptorProtos.EnumValueOptions.Builder)EnumValueOptions.newBuilder(this.options_).mergeFrom(descriptorProtos$EnumValueOptions0)).buildPartial());
            this.bitField0_ |= 4;
        }

        public static com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder newBuilder() {
            return (com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder)EnumValueDescriptorProto.DEFAULT_INSTANCE.createBuilder();
        }

        public static com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder newBuilder(EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto0) {
            return (com.google.protobuf.DescriptorProtos.EnumValueDescriptorProto.Builder)EnumValueDescriptorProto.DEFAULT_INSTANCE.createBuilder(descriptorProtos$EnumValueDescriptorProto0);
        }

        public static EnumValueDescriptorProto parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (EnumValueDescriptorProto)GeneratedMessageLite.parseDelimitedFrom(EnumValueDescriptorProto.DEFAULT_INSTANCE, inputStream0);
        }

        public static EnumValueDescriptorProto parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (EnumValueDescriptorProto)GeneratedMessageLite.parseDelimitedFrom(EnumValueDescriptorProto.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static EnumValueDescriptorProto parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (EnumValueDescriptorProto)GeneratedMessageLite.parseFrom(EnumValueDescriptorProto.DEFAULT_INSTANCE, byteString0);
        }

        public static EnumValueDescriptorProto parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (EnumValueDescriptorProto)GeneratedMessageLite.parseFrom(EnumValueDescriptorProto.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static EnumValueDescriptorProto parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (EnumValueDescriptorProto)GeneratedMessageLite.parseFrom(EnumValueDescriptorProto.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static EnumValueDescriptorProto parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (EnumValueDescriptorProto)GeneratedMessageLite.parseFrom(EnumValueDescriptorProto.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static EnumValueDescriptorProto parseFrom(InputStream inputStream0) throws IOException {
            return (EnumValueDescriptorProto)GeneratedMessageLite.parseFrom(EnumValueDescriptorProto.DEFAULT_INSTANCE, inputStream0);
        }

        public static EnumValueDescriptorProto parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (EnumValueDescriptorProto)GeneratedMessageLite.parseFrom(EnumValueDescriptorProto.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static EnumValueDescriptorProto parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (EnumValueDescriptorProto)GeneratedMessageLite.parseFrom(EnumValueDescriptorProto.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static EnumValueDescriptorProto parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (EnumValueDescriptorProto)GeneratedMessageLite.parseFrom(EnumValueDescriptorProto.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static EnumValueDescriptorProto parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (EnumValueDescriptorProto)GeneratedMessageLite.parseFrom(EnumValueDescriptorProto.DEFAULT_INSTANCE, arr_b);
        }

        public static EnumValueDescriptorProto parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (EnumValueDescriptorProto)GeneratedMessageLite.parseFrom(EnumValueDescriptorProto.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return EnumValueDescriptorProto.DEFAULT_INSTANCE.getParserForType();
        }

        private void setName(String s) {
            s.getClass();
            this.bitField0_ |= 1;
            this.name_ = s;
        }

        private void setNameBytes(ByteString byteString0) {
            this.name_ = byteString0.toStringUtf8();
            this.bitField0_ |= 1;
        }

        private void setNumber(int v) {
            this.bitField0_ |= 2;
            this.number_ = v;
        }

        private void setOptions(EnumValueOptions descriptorProtos$EnumValueOptions0) {
            descriptorProtos$EnumValueOptions0.getClass();
            this.options_ = descriptorProtos$EnumValueOptions0;
            this.bitField0_ |= 4;
        }
    }

    public interface EnumValueDescriptorProtoOrBuilder extends MessageLiteOrBuilder {
        String getName();

        ByteString getNameBytes();

        int getNumber();

        EnumValueOptions getOptions();

        boolean hasName();

        boolean hasNumber();

        boolean hasOptions();
    }

    public static final class EnumValueOptions extends ExtendableMessage implements EnumValueOptionsOrBuilder {
        public static final class com.google.protobuf.DescriptorProtos.EnumValueOptions.Builder extends ExtendableBuilder implements EnumValueOptionsOrBuilder {
            private com.google.protobuf.DescriptorProtos.EnumValueOptions.Builder() {
                super(EnumValueOptions.DEFAULT_INSTANCE);
            }

            com.google.protobuf.DescriptorProtos.EnumValueOptions.Builder(a descriptorProtos$a0) {
            }

            public com.google.protobuf.DescriptorProtos.EnumValueOptions.Builder addAllUninterpretedOption(Iterable iterable0) {
                this.copyOnWrite();
                ((EnumValueOptions)this.instance).addAllUninterpretedOption(iterable0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumValueOptions.Builder addUninterpretedOption(int v, com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder descriptorProtos$UninterpretedOption$Builder0) {
                this.copyOnWrite();
                ((EnumValueOptions)this.instance).addUninterpretedOption(v, ((UninterpretedOption)descriptorProtos$UninterpretedOption$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumValueOptions.Builder addUninterpretedOption(int v, UninterpretedOption descriptorProtos$UninterpretedOption0) {
                this.copyOnWrite();
                ((EnumValueOptions)this.instance).addUninterpretedOption(v, descriptorProtos$UninterpretedOption0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumValueOptions.Builder addUninterpretedOption(com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder descriptorProtos$UninterpretedOption$Builder0) {
                this.copyOnWrite();
                ((EnumValueOptions)this.instance).addUninterpretedOption(((UninterpretedOption)descriptorProtos$UninterpretedOption$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumValueOptions.Builder addUninterpretedOption(UninterpretedOption descriptorProtos$UninterpretedOption0) {
                this.copyOnWrite();
                ((EnumValueOptions)this.instance).addUninterpretedOption(descriptorProtos$UninterpretedOption0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumValueOptions.Builder clearDeprecated() {
                this.copyOnWrite();
                ((EnumValueOptions)this.instance).clearDeprecated();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumValueOptions.Builder clearUninterpretedOption() {
                this.copyOnWrite();
                ((EnumValueOptions)this.instance).clearUninterpretedOption();
                return this;
            }

            @Override  // com.google.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
            public boolean getDeprecated() {
                return ((EnumValueOptions)this.instance).getDeprecated();
            }

            @Override  // com.google.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
            public UninterpretedOption getUninterpretedOption(int v) {
                return ((EnumValueOptions)this.instance).getUninterpretedOption(v);
            }

            @Override  // com.google.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
            public int getUninterpretedOptionCount() {
                return ((EnumValueOptions)this.instance).getUninterpretedOptionCount();
            }

            @Override  // com.google.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
            public List getUninterpretedOptionList() {
                return DesugarCollections.unmodifiableList(((EnumValueOptions)this.instance).getUninterpretedOptionList());
            }

            @Override  // com.google.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
            public boolean hasDeprecated() {
                return ((EnumValueOptions)this.instance).hasDeprecated();
            }

            public com.google.protobuf.DescriptorProtos.EnumValueOptions.Builder removeUninterpretedOption(int v) {
                this.copyOnWrite();
                ((EnumValueOptions)this.instance).removeUninterpretedOption(v);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumValueOptions.Builder setDeprecated(boolean z) {
                this.copyOnWrite();
                ((EnumValueOptions)this.instance).setDeprecated(z);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumValueOptions.Builder setUninterpretedOption(int v, com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder descriptorProtos$UninterpretedOption$Builder0) {
                this.copyOnWrite();
                ((EnumValueOptions)this.instance).setUninterpretedOption(v, ((UninterpretedOption)descriptorProtos$UninterpretedOption$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.EnumValueOptions.Builder setUninterpretedOption(int v, UninterpretedOption descriptorProtos$UninterpretedOption0) {
                this.copyOnWrite();
                ((EnumValueOptions)this.instance).setUninterpretedOption(v, descriptorProtos$UninterpretedOption0);
                return this;
            }
        }

        private static final EnumValueOptions DEFAULT_INSTANCE = null;
        public static final int DEPRECATED_FIELD_NUMBER = 1;
        private static volatile Parser PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean deprecated_;
        private byte memoizedIsInitialized;
        private ProtobufList uninterpretedOption_;

        static {
            EnumValueOptions descriptorProtos$EnumValueOptions0 = new EnumValueOptions();
            EnumValueOptions.DEFAULT_INSTANCE = descriptorProtos$EnumValueOptions0;
            GeneratedMessageLite.registerDefaultInstance(EnumValueOptions.class, descriptorProtos$EnumValueOptions0);
        }

        private EnumValueOptions() {
            this.memoizedIsInitialized = 2;
            this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void addAllUninterpretedOption(Iterable iterable0) {
            this.ensureUninterpretedOptionIsMutable();
            AbstractMessageLite.addAll(iterable0, this.uninterpretedOption_);
        }

        private void addUninterpretedOption(int v, UninterpretedOption descriptorProtos$UninterpretedOption0) {
            descriptorProtos$UninterpretedOption0.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(v, descriptorProtos$UninterpretedOption0);
        }

        private void addUninterpretedOption(UninterpretedOption descriptorProtos$UninterpretedOption0) {
            descriptorProtos$UninterpretedOption0.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(descriptorProtos$UninterpretedOption0);
        }

        private void clearDeprecated() {
            this.bitField0_ &= -2;
            this.deprecated_ = false;
        }

        private void clearUninterpretedOption() {
            this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            int v = 1;
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new EnumValueOptions();
                }
                case 2: {
                    return new com.google.protobuf.DescriptorProtos.EnumValueOptions.Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(EnumValueOptions.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001ϧ\u0002\u0000\u0001\u0001\u0001ဇ\u0000ϧЛ", new Object[]{"bitField0_", "deprecated_", "uninterpretedOption_", UninterpretedOption.class});
                }
                case 4: {
                    return EnumValueOptions.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = EnumValueOptions.PARSER;
                    if(parser0 == null) {
                        synchronized(EnumValueOptions.class) {
                            parser0 = EnumValueOptions.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(EnumValueOptions.DEFAULT_INSTANCE);
                                EnumValueOptions.PARSER = parser0;
                            }
                        }
                    }
                    return parser0;
                }
                case 6: {
                    return this.memoizedIsInitialized;
                }
                case 7: {
                    if(object0 == null) {
                        v = 0;
                    }
                    this.memoizedIsInitialized = (byte)v;
                    return null;
                }
                default: {
                    throw new UnsupportedOperationException();
                }
            }
        }

        private void ensureUninterpretedOptionIsMutable() {
            ProtobufList internal$ProtobufList0 = this.uninterpretedOption_;
            if(!internal$ProtobufList0.isModifiable()) {
                this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
            }
        }

        public static EnumValueOptions getDefaultInstance() {
            return EnumValueOptions.DEFAULT_INSTANCE;
        }

        @Override  // com.google.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
        public UninterpretedOption getUninterpretedOption(int v) {
            return (UninterpretedOption)this.uninterpretedOption_.get(v);
        }

        @Override  // com.google.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override  // com.google.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
        public List getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int v) {
            return (UninterpretedOptionOrBuilder)this.uninterpretedOption_.get(v);
        }

        public List getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$EnumValueOptionsOrBuilder
        public boolean hasDeprecated() {
            return (this.bitField0_ & 1) != 0;
        }

        public static com.google.protobuf.DescriptorProtos.EnumValueOptions.Builder newBuilder() {
            return (com.google.protobuf.DescriptorProtos.EnumValueOptions.Builder)EnumValueOptions.DEFAULT_INSTANCE.createBuilder();
        }

        public static com.google.protobuf.DescriptorProtos.EnumValueOptions.Builder newBuilder(EnumValueOptions descriptorProtos$EnumValueOptions0) {
            return (com.google.protobuf.DescriptorProtos.EnumValueOptions.Builder)EnumValueOptions.DEFAULT_INSTANCE.createBuilder(descriptorProtos$EnumValueOptions0);
        }

        public static EnumValueOptions parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (EnumValueOptions)GeneratedMessageLite.parseDelimitedFrom(EnumValueOptions.DEFAULT_INSTANCE, inputStream0);
        }

        public static EnumValueOptions parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (EnumValueOptions)GeneratedMessageLite.parseDelimitedFrom(EnumValueOptions.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static EnumValueOptions parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (EnumValueOptions)GeneratedMessageLite.parseFrom(EnumValueOptions.DEFAULT_INSTANCE, byteString0);
        }

        public static EnumValueOptions parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (EnumValueOptions)GeneratedMessageLite.parseFrom(EnumValueOptions.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static EnumValueOptions parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (EnumValueOptions)GeneratedMessageLite.parseFrom(EnumValueOptions.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static EnumValueOptions parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (EnumValueOptions)GeneratedMessageLite.parseFrom(EnumValueOptions.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static EnumValueOptions parseFrom(InputStream inputStream0) throws IOException {
            return (EnumValueOptions)GeneratedMessageLite.parseFrom(EnumValueOptions.DEFAULT_INSTANCE, inputStream0);
        }

        public static EnumValueOptions parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (EnumValueOptions)GeneratedMessageLite.parseFrom(EnumValueOptions.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static EnumValueOptions parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (EnumValueOptions)GeneratedMessageLite.parseFrom(EnumValueOptions.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static EnumValueOptions parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (EnumValueOptions)GeneratedMessageLite.parseFrom(EnumValueOptions.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static EnumValueOptions parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (EnumValueOptions)GeneratedMessageLite.parseFrom(EnumValueOptions.DEFAULT_INSTANCE, arr_b);
        }

        public static EnumValueOptions parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (EnumValueOptions)GeneratedMessageLite.parseFrom(EnumValueOptions.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return EnumValueOptions.DEFAULT_INSTANCE.getParserForType();
        }

        private void removeUninterpretedOption(int v) {
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(v);
        }

        private void setDeprecated(boolean z) {
            this.bitField0_ |= 1;
            this.deprecated_ = z;
        }

        private void setUninterpretedOption(int v, UninterpretedOption descriptorProtos$UninterpretedOption0) {
            descriptorProtos$UninterpretedOption0.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(v, descriptorProtos$UninterpretedOption0);
        }
    }

    public interface EnumValueOptionsOrBuilder extends ExtendableMessageOrBuilder {
        boolean getDeprecated();

        UninterpretedOption getUninterpretedOption(int arg1);

        int getUninterpretedOptionCount();

        List getUninterpretedOptionList();

        boolean hasDeprecated();
    }

    public static final class ExtensionRangeOptions extends ExtendableMessage implements ExtensionRangeOptionsOrBuilder {
        public static final class com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.Builder extends ExtendableBuilder implements ExtensionRangeOptionsOrBuilder {
            private com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.Builder() {
                super(ExtensionRangeOptions.DEFAULT_INSTANCE);
            }

            com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.Builder(a descriptorProtos$a0) {
            }

            public com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.Builder addAllUninterpretedOption(Iterable iterable0) {
                this.copyOnWrite();
                ((ExtensionRangeOptions)this.instance).addAllUninterpretedOption(iterable0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.Builder addUninterpretedOption(int v, com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder descriptorProtos$UninterpretedOption$Builder0) {
                this.copyOnWrite();
                ((ExtensionRangeOptions)this.instance).addUninterpretedOption(v, ((UninterpretedOption)descriptorProtos$UninterpretedOption$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.Builder addUninterpretedOption(int v, UninterpretedOption descriptorProtos$UninterpretedOption0) {
                this.copyOnWrite();
                ((ExtensionRangeOptions)this.instance).addUninterpretedOption(v, descriptorProtos$UninterpretedOption0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.Builder addUninterpretedOption(com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder descriptorProtos$UninterpretedOption$Builder0) {
                this.copyOnWrite();
                ((ExtensionRangeOptions)this.instance).addUninterpretedOption(((UninterpretedOption)descriptorProtos$UninterpretedOption$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.Builder addUninterpretedOption(UninterpretedOption descriptorProtos$UninterpretedOption0) {
                this.copyOnWrite();
                ((ExtensionRangeOptions)this.instance).addUninterpretedOption(descriptorProtos$UninterpretedOption0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.Builder clearUninterpretedOption() {
                this.copyOnWrite();
                ((ExtensionRangeOptions)this.instance).clearUninterpretedOption();
                return this;
            }

            @Override  // com.google.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
            public UninterpretedOption getUninterpretedOption(int v) {
                return ((ExtensionRangeOptions)this.instance).getUninterpretedOption(v);
            }

            @Override  // com.google.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
            public int getUninterpretedOptionCount() {
                return ((ExtensionRangeOptions)this.instance).getUninterpretedOptionCount();
            }

            @Override  // com.google.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
            public List getUninterpretedOptionList() {
                return DesugarCollections.unmodifiableList(((ExtensionRangeOptions)this.instance).getUninterpretedOptionList());
            }

            public com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.Builder removeUninterpretedOption(int v) {
                this.copyOnWrite();
                ((ExtensionRangeOptions)this.instance).removeUninterpretedOption(v);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.Builder setUninterpretedOption(int v, com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder descriptorProtos$UninterpretedOption$Builder0) {
                this.copyOnWrite();
                ((ExtensionRangeOptions)this.instance).setUninterpretedOption(v, ((UninterpretedOption)descriptorProtos$UninterpretedOption$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.Builder setUninterpretedOption(int v, UninterpretedOption descriptorProtos$UninterpretedOption0) {
                this.copyOnWrite();
                ((ExtensionRangeOptions)this.instance).setUninterpretedOption(v, descriptorProtos$UninterpretedOption0);
                return this;
            }
        }

        private static final ExtensionRangeOptions DEFAULT_INSTANCE = null;
        private static volatile Parser PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private byte memoizedIsInitialized;
        private ProtobufList uninterpretedOption_;

        static {
            ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions0 = new ExtensionRangeOptions();
            ExtensionRangeOptions.DEFAULT_INSTANCE = descriptorProtos$ExtensionRangeOptions0;
            GeneratedMessageLite.registerDefaultInstance(ExtensionRangeOptions.class, descriptorProtos$ExtensionRangeOptions0);
        }

        private ExtensionRangeOptions() {
            this.memoizedIsInitialized = 2;
            this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void addAllUninterpretedOption(Iterable iterable0) {
            this.ensureUninterpretedOptionIsMutable();
            AbstractMessageLite.addAll(iterable0, this.uninterpretedOption_);
        }

        private void addUninterpretedOption(int v, UninterpretedOption descriptorProtos$UninterpretedOption0) {
            descriptorProtos$UninterpretedOption0.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(v, descriptorProtos$UninterpretedOption0);
        }

        private void addUninterpretedOption(UninterpretedOption descriptorProtos$UninterpretedOption0) {
            descriptorProtos$UninterpretedOption0.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(descriptorProtos$UninterpretedOption0);
        }

        private void clearUninterpretedOption() {
            this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            int v = 1;
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new ExtensionRangeOptions();
                }
                case 2: {
                    return new com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(ExtensionRangeOptions.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000ϧϧ\u0001\u0000\u0001\u0001ϧЛ", new Object[]{"uninterpretedOption_", UninterpretedOption.class});
                }
                case 4: {
                    return ExtensionRangeOptions.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = ExtensionRangeOptions.PARSER;
                    if(parser0 == null) {
                        synchronized(ExtensionRangeOptions.class) {
                            parser0 = ExtensionRangeOptions.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(ExtensionRangeOptions.DEFAULT_INSTANCE);
                                ExtensionRangeOptions.PARSER = parser0;
                            }
                        }
                    }
                    return parser0;
                }
                case 6: {
                    return this.memoizedIsInitialized;
                }
                case 7: {
                    if(object0 == null) {
                        v = 0;
                    }
                    this.memoizedIsInitialized = (byte)v;
                    return null;
                }
                default: {
                    throw new UnsupportedOperationException();
                }
            }
        }

        private void ensureUninterpretedOptionIsMutable() {
            ProtobufList internal$ProtobufList0 = this.uninterpretedOption_;
            if(!internal$ProtobufList0.isModifiable()) {
                this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
            }
        }

        public static ExtensionRangeOptions getDefaultInstance() {
            return ExtensionRangeOptions.DEFAULT_INSTANCE;
        }

        @Override  // com.google.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
        public UninterpretedOption getUninterpretedOption(int v) {
            return (UninterpretedOption)this.uninterpretedOption_.get(v);
        }

        @Override  // com.google.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override  // com.google.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder
        public List getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int v) {
            return (UninterpretedOptionOrBuilder)this.uninterpretedOption_.get(v);
        }

        public List getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        public static com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.Builder newBuilder() {
            return (com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.Builder)ExtensionRangeOptions.DEFAULT_INSTANCE.createBuilder();
        }

        public static com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.Builder newBuilder(ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions0) {
            return (com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.Builder)ExtensionRangeOptions.DEFAULT_INSTANCE.createBuilder(descriptorProtos$ExtensionRangeOptions0);
        }

        public static ExtensionRangeOptions parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (ExtensionRangeOptions)GeneratedMessageLite.parseDelimitedFrom(ExtensionRangeOptions.DEFAULT_INSTANCE, inputStream0);
        }

        public static ExtensionRangeOptions parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (ExtensionRangeOptions)GeneratedMessageLite.parseDelimitedFrom(ExtensionRangeOptions.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static ExtensionRangeOptions parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (ExtensionRangeOptions)GeneratedMessageLite.parseFrom(ExtensionRangeOptions.DEFAULT_INSTANCE, byteString0);
        }

        public static ExtensionRangeOptions parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (ExtensionRangeOptions)GeneratedMessageLite.parseFrom(ExtensionRangeOptions.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static ExtensionRangeOptions parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (ExtensionRangeOptions)GeneratedMessageLite.parseFrom(ExtensionRangeOptions.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static ExtensionRangeOptions parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (ExtensionRangeOptions)GeneratedMessageLite.parseFrom(ExtensionRangeOptions.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static ExtensionRangeOptions parseFrom(InputStream inputStream0) throws IOException {
            return (ExtensionRangeOptions)GeneratedMessageLite.parseFrom(ExtensionRangeOptions.DEFAULT_INSTANCE, inputStream0);
        }

        public static ExtensionRangeOptions parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (ExtensionRangeOptions)GeneratedMessageLite.parseFrom(ExtensionRangeOptions.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static ExtensionRangeOptions parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (ExtensionRangeOptions)GeneratedMessageLite.parseFrom(ExtensionRangeOptions.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static ExtensionRangeOptions parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (ExtensionRangeOptions)GeneratedMessageLite.parseFrom(ExtensionRangeOptions.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static ExtensionRangeOptions parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (ExtensionRangeOptions)GeneratedMessageLite.parseFrom(ExtensionRangeOptions.DEFAULT_INSTANCE, arr_b);
        }

        public static ExtensionRangeOptions parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (ExtensionRangeOptions)GeneratedMessageLite.parseFrom(ExtensionRangeOptions.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return ExtensionRangeOptions.DEFAULT_INSTANCE.getParserForType();
        }

        private void removeUninterpretedOption(int v) {
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(v);
        }

        private void setUninterpretedOption(int v, UninterpretedOption descriptorProtos$UninterpretedOption0) {
            descriptorProtos$UninterpretedOption0.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(v, descriptorProtos$UninterpretedOption0);
        }
    }

    public interface ExtensionRangeOptionsOrBuilder extends ExtendableMessageOrBuilder {
        UninterpretedOption getUninterpretedOption(int arg1);

        int getUninterpretedOptionCount();

        List getUninterpretedOptionList();
    }

    public static final class FieldDescriptorProto extends GeneratedMessageLite implements FieldDescriptorProtoOrBuilder {
        public static final class com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements FieldDescriptorProtoOrBuilder {
            private com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder() {
                super(FieldDescriptorProto.DEFAULT_INSTANCE);
            }

            com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder(a descriptorProtos$a0) {
            }

            public com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder clearDefaultValue() {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).clearDefaultValue();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder clearExtendee() {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).clearExtendee();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder clearJsonName() {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).clearJsonName();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder clearLabel() {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).clearLabel();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder clearName() {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).clearName();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder clearNumber() {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).clearNumber();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder clearOneofIndex() {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).clearOneofIndex();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder clearOptions() {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).clearOptions();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder clearProto3Optional() {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).clearProto3Optional();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder clearType() {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).clearType();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder clearTypeName() {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).clearTypeName();
                return this;
            }

            @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
            public String getDefaultValue() {
                return ((FieldDescriptorProto)this.instance).getDefaultValue();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
            public ByteString getDefaultValueBytes() {
                return ((FieldDescriptorProto)this.instance).getDefaultValueBytes();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
            public String getExtendee() {
                return ((FieldDescriptorProto)this.instance).getExtendee();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
            public ByteString getExtendeeBytes() {
                return ((FieldDescriptorProto)this.instance).getExtendeeBytes();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
            public String getJsonName() {
                return ((FieldDescriptorProto)this.instance).getJsonName();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
            public ByteString getJsonNameBytes() {
                return ((FieldDescriptorProto)this.instance).getJsonNameBytes();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
            public Label getLabel() {
                return ((FieldDescriptorProto)this.instance).getLabel();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
            public String getName() {
                return ((FieldDescriptorProto)this.instance).getName();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
            public ByteString getNameBytes() {
                return ((FieldDescriptorProto)this.instance).getNameBytes();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
            public int getNumber() {
                return ((FieldDescriptorProto)this.instance).getNumber();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
            public int getOneofIndex() {
                return ((FieldDescriptorProto)this.instance).getOneofIndex();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
            public FieldOptions getOptions() {
                return ((FieldDescriptorProto)this.instance).getOptions();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
            public boolean getProto3Optional() {
                return ((FieldDescriptorProto)this.instance).getProto3Optional();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
            public Type getType() {
                return ((FieldDescriptorProto)this.instance).getType();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
            public String getTypeName() {
                return ((FieldDescriptorProto)this.instance).getTypeName();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
            public ByteString getTypeNameBytes() {
                return ((FieldDescriptorProto)this.instance).getTypeNameBytes();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
            public boolean hasDefaultValue() {
                return ((FieldDescriptorProto)this.instance).hasDefaultValue();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
            public boolean hasExtendee() {
                return ((FieldDescriptorProto)this.instance).hasExtendee();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
            public boolean hasJsonName() {
                return ((FieldDescriptorProto)this.instance).hasJsonName();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
            public boolean hasLabel() {
                return ((FieldDescriptorProto)this.instance).hasLabel();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
            public boolean hasName() {
                return ((FieldDescriptorProto)this.instance).hasName();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
            public boolean hasNumber() {
                return ((FieldDescriptorProto)this.instance).hasNumber();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
            public boolean hasOneofIndex() {
                return ((FieldDescriptorProto)this.instance).hasOneofIndex();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
            public boolean hasOptions() {
                return ((FieldDescriptorProto)this.instance).hasOptions();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
            public boolean hasProto3Optional() {
                return ((FieldDescriptorProto)this.instance).hasProto3Optional();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
            public boolean hasType() {
                return ((FieldDescriptorProto)this.instance).hasType();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
            public boolean hasTypeName() {
                return ((FieldDescriptorProto)this.instance).hasTypeName();
            }

            public com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder mergeOptions(FieldOptions descriptorProtos$FieldOptions0) {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).mergeOptions(descriptorProtos$FieldOptions0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder setDefaultValue(String s) {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).setDefaultValue(s);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder setDefaultValueBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).setDefaultValueBytes(byteString0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder setExtendee(String s) {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).setExtendee(s);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder setExtendeeBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).setExtendeeBytes(byteString0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder setJsonName(String s) {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).setJsonName(s);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder setJsonNameBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).setJsonNameBytes(byteString0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder setLabel(Label descriptorProtos$FieldDescriptorProto$Label0) {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).setLabel(descriptorProtos$FieldDescriptorProto$Label0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder setName(String s) {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).setName(s);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder setNameBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).setNameBytes(byteString0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder setNumber(int v) {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).setNumber(v);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder setOneofIndex(int v) {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).setOneofIndex(v);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder setOptions(com.google.protobuf.DescriptorProtos.FieldOptions.Builder descriptorProtos$FieldOptions$Builder0) {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).setOptions(((FieldOptions)descriptorProtos$FieldOptions$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder setOptions(FieldOptions descriptorProtos$FieldOptions0) {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).setOptions(descriptorProtos$FieldOptions0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder setProto3Optional(boolean z) {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).setProto3Optional(z);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder setType(Type descriptorProtos$FieldDescriptorProto$Type0) {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).setType(descriptorProtos$FieldDescriptorProto$Type0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder setTypeName(String s) {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).setTypeName(s);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder setTypeNameBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((FieldDescriptorProto)this.instance).setTypeNameBytes(byteString0);
                return this;
            }
        }

        public static enum Label implements EnumLite {
            class com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.a implements EnumLiteMap {
                com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.a() {
                    super();
                }

                public Label findValueByNumber(int v) {
                    return Label.forNumber(v);
                }

                @Override  // com.google.protobuf.Internal$EnumLiteMap
                public EnumLite findValueByNumber(int v) {
                    return this.findValueByNumber(v);
                }
            }

            static final class b implements EnumVerifier {
                static final EnumVerifier INSTANCE;

                static {
                    b.INSTANCE = new b();
                }

                @Override  // com.google.protobuf.Internal$EnumVerifier
                public boolean isInRange(int v) {
                    return Label.forNumber(v) != null;
                }
            }

            LABEL_OPTIONAL(1),
            LABEL_REQUIRED(2),
            LABEL_REPEATED(3);

            public static final int LABEL_OPTIONAL_VALUE = 1;
            public static final int LABEL_REPEATED_VALUE = 3;
            public static final int LABEL_REQUIRED_VALUE = 2;
            private static final EnumLiteMap internalValueMap;
            private final int value;

            static {
                Label.internalValueMap = new com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.a();
            }

            private Label(int v1) {
                this.value = v1;
            }

            public static Label forNumber(int v) {
                switch(v) {
                    case 1: {
                        return Label.LABEL_OPTIONAL;
                    }
                    case 2: {
                        return Label.LABEL_REQUIRED;
                    }
                    case 3: {
                        return Label.LABEL_REPEATED;
                    }
                    default: {
                        return null;
                    }
                }
            }

            @Override  // com.google.protobuf.Internal$EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static EnumLiteMap internalGetValueMap() {
                return Label.internalValueMap;
            }

            public static EnumVerifier internalGetVerifier() {
                return b.INSTANCE;
            }

            @Deprecated
            public static Label valueOf(int v) {
                return Label.forNumber(v);
            }
        }

        public static enum Type implements EnumLite {
            class com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type.a implements EnumLiteMap {
                com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type.a() {
                    super();
                }

                public Type findValueByNumber(int v) {
                    return Type.forNumber(v);
                }

                @Override  // com.google.protobuf.Internal$EnumLiteMap
                public EnumLite findValueByNumber(int v) {
                    return this.findValueByNumber(v);
                }
            }

            static final class com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type.b implements EnumVerifier {
                static final EnumVerifier INSTANCE;

                static {
                    com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type.b.INSTANCE = new com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type.b();
                }

                @Override  // com.google.protobuf.Internal$EnumVerifier
                public boolean isInRange(int v) {
                    return Type.forNumber(v) != null;
                }
            }

            TYPE_DOUBLE(1),
            TYPE_FLOAT(2),
            TYPE_INT64(3),
            TYPE_UINT64(4),
            TYPE_INT32(5),
            TYPE_FIXED64(6),
            TYPE_FIXED32(7),
            TYPE_BOOL(8),
            TYPE_STRING(9),
            TYPE_GROUP(10),
            TYPE_MESSAGE(11),
            TYPE_BYTES(12),
            TYPE_UINT32(13),
            TYPE_ENUM(14),
            TYPE_SFIXED32(15),
            TYPE_SFIXED64(16),
            TYPE_SINT32(17),
            TYPE_SINT64(18);

            public static final int TYPE_BOOL_VALUE = 8;
            public static final int TYPE_BYTES_VALUE = 12;
            public static final int TYPE_DOUBLE_VALUE = 1;
            public static final int TYPE_ENUM_VALUE = 14;
            public static final int TYPE_FIXED32_VALUE = 7;
            public static final int TYPE_FIXED64_VALUE = 6;
            public static final int TYPE_FLOAT_VALUE = 2;
            public static final int TYPE_GROUP_VALUE = 10;
            public static final int TYPE_INT32_VALUE = 5;
            public static final int TYPE_INT64_VALUE = 3;
            public static final int TYPE_MESSAGE_VALUE = 11;
            public static final int TYPE_SFIXED32_VALUE = 15;
            public static final int TYPE_SFIXED64_VALUE = 16;
            public static final int TYPE_SINT32_VALUE = 17;
            public static final int TYPE_SINT64_VALUE = 18;
            public static final int TYPE_STRING_VALUE = 9;
            public static final int TYPE_UINT32_VALUE = 13;
            public static final int TYPE_UINT64_VALUE = 4;
            private static final EnumLiteMap internalValueMap;
            private final int value;

            static {
                Type.internalValueMap = new com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type.a();
            }

            private Type(int v1) {
                this.value = v1;
            }

            public static Type forNumber(int v) {
                switch(v) {
                    case 1: {
                        return Type.TYPE_DOUBLE;
                    }
                    case 2: {
                        return Type.TYPE_FLOAT;
                    }
                    case 3: {
                        return Type.TYPE_INT64;
                    }
                    case 4: {
                        return Type.TYPE_UINT64;
                    }
                    case 5: {
                        return Type.TYPE_INT32;
                    }
                    case 6: {
                        return Type.TYPE_FIXED64;
                    }
                    case 7: {
                        return Type.TYPE_FIXED32;
                    }
                    case 8: {
                        return Type.TYPE_BOOL;
                    }
                    case 9: {
                        return Type.TYPE_STRING;
                    }
                    case 10: {
                        return Type.TYPE_GROUP;
                    }
                    case 11: {
                        return Type.TYPE_MESSAGE;
                    }
                    case 12: {
                        return Type.TYPE_BYTES;
                    }
                    case 13: {
                        return Type.TYPE_UINT32;
                    }
                    case 14: {
                        return Type.TYPE_ENUM;
                    }
                    case 15: {
                        return Type.TYPE_SFIXED32;
                    }
                    case 16: {
                        return Type.TYPE_SFIXED64;
                    }
                    case 17: {
                        return Type.TYPE_SINT32;
                    }
                    case 18: {
                        return Type.TYPE_SINT64;
                    }
                    default: {
                        return null;
                    }
                }
            }

            @Override  // com.google.protobuf.Internal$EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static EnumLiteMap internalGetValueMap() {
                return Type.internalValueMap;
            }

            public static EnumVerifier internalGetVerifier() {
                return com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type.b.INSTANCE;
            }

            @Deprecated
            public static Type valueOf(int v) {
                return Type.forNumber(v);
            }
        }

        private static final FieldDescriptorProto DEFAULT_INSTANCE = null;
        public static final int DEFAULT_VALUE_FIELD_NUMBER = 7;
        public static final int EXTENDEE_FIELD_NUMBER = 2;
        public static final int JSON_NAME_FIELD_NUMBER = 10;
        public static final int LABEL_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int NUMBER_FIELD_NUMBER = 3;
        public static final int ONEOF_INDEX_FIELD_NUMBER = 9;
        public static final int OPTIONS_FIELD_NUMBER = 8;
        private static volatile Parser PARSER = null;
        public static final int PROTO3_OPTIONAL_FIELD_NUMBER = 17;
        public static final int TYPE_FIELD_NUMBER = 5;
        public static final int TYPE_NAME_FIELD_NUMBER = 6;
        private int bitField0_;
        private String defaultValue_;
        private String extendee_;
        private String jsonName_;
        private int label_;
        private byte memoizedIsInitialized;
        private String name_;
        private int number_;
        private int oneofIndex_;
        private FieldOptions options_;
        private boolean proto3Optional_;
        private String typeName_;
        private int type_;

        static {
            FieldDescriptorProto descriptorProtos$FieldDescriptorProto0 = new FieldDescriptorProto();
            FieldDescriptorProto.DEFAULT_INSTANCE = descriptorProtos$FieldDescriptorProto0;
            GeneratedMessageLite.registerDefaultInstance(FieldDescriptorProto.class, descriptorProtos$FieldDescriptorProto0);
        }

        private FieldDescriptorProto() {
            this.memoizedIsInitialized = 2;
            this.name_ = "";
            this.label_ = 1;
            this.type_ = 1;
            this.typeName_ = "";
            this.extendee_ = "";
            this.defaultValue_ = "";
            this.jsonName_ = "";
        }

        private void clearDefaultValue() {
            this.bitField0_ &= -65;
            this.defaultValue_ = "";
        }

        private void clearExtendee() {
            this.bitField0_ &= -33;
            this.extendee_ = "";
        }

        private void clearJsonName() {
            this.bitField0_ &= 0xFFFFFEFF;
            this.jsonName_ = "";
        }

        private void clearLabel() {
            this.bitField0_ &= -5;
            this.label_ = 1;
        }

        private void clearName() {
            this.bitField0_ &= -2;
            this.name_ = "";
        }

        private void clearNumber() {
            this.bitField0_ &= -3;
            this.number_ = 0;
        }

        private void clearOneofIndex() {
            this.bitField0_ &= 0xFFFFFF7F;
            this.oneofIndex_ = 0;
        }

        private void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= 0xFFFFFDFF;
        }

        private void clearProto3Optional() {
            this.bitField0_ &= 0xFFFFFBFF;
            this.proto3Optional_ = false;
        }

        private void clearType() {
            this.bitField0_ &= -9;
            this.type_ = 1;
        }

        private void clearTypeName() {
            this.bitField0_ &= -17;
            this.typeName_ = "";
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            int v = 1;
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new FieldDescriptorProto();
                }
                case 2: {
                    return new com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(FieldDescriptorProto.DEFAULT_INSTANCE, "\u0001\u000B\u0000\u0001\u0001\u0011\u000B\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0005\u0003င\u0001\u0004ဌ\u0002\u0005ဌ\u0003\u0006ဈ\u0004\u0007ဈ\u0006\bᐉ\t\tင\u0007\nဈ\b\u0011ဇ\n", new Object[]{"bitField0_", "name_", "extendee_", "number_", "label_", Label.internalGetVerifier(), "type_", Type.internalGetVerifier(), "typeName_", "defaultValue_", "options_", "oneofIndex_", "jsonName_", "proto3Optional_"});
                }
                case 4: {
                    return FieldDescriptorProto.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = FieldDescriptorProto.PARSER;
                    if(parser0 == null) {
                        synchronized(FieldDescriptorProto.class) {
                            parser0 = FieldDescriptorProto.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(FieldDescriptorProto.DEFAULT_INSTANCE);
                                FieldDescriptorProto.PARSER = parser0;
                            }
                        }
                    }
                    return parser0;
                }
                case 6: {
                    return this.memoizedIsInitialized;
                }
                case 7: {
                    if(object0 == null) {
                        v = 0;
                    }
                    this.memoizedIsInitialized = (byte)v;
                    return null;
                }
                default: {
                    throw new UnsupportedOperationException();
                }
            }
        }

        public static FieldDescriptorProto getDefaultInstance() {
            return FieldDescriptorProto.DEFAULT_INSTANCE;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public String getDefaultValue() {
            return this.defaultValue_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public ByteString getDefaultValueBytes() {
            return ByteString.copyFromUtf8(this.defaultValue_);
        }

        @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public String getExtendee() {
            return this.extendee_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public ByteString getExtendeeBytes() {
            return ByteString.copyFromUtf8(this.extendee_);
        }

        @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public String getJsonName() {
            return this.jsonName_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public ByteString getJsonNameBytes() {
            return ByteString.copyFromUtf8(this.jsonName_);
        }

        @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public Label getLabel() {
            Label descriptorProtos$FieldDescriptorProto$Label0 = Label.forNumber(this.label_);
            return descriptorProtos$FieldDescriptorProto$Label0 == null ? Label.LABEL_OPTIONAL : descriptorProtos$FieldDescriptorProto$Label0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public int getNumber() {
            return this.number_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public int getOneofIndex() {
            return this.oneofIndex_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public FieldOptions getOptions() {
            return this.options_ == null ? FieldOptions.getDefaultInstance() : this.options_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public boolean getProto3Optional() {
            return this.proto3Optional_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public Type getType() {
            Type descriptorProtos$FieldDescriptorProto$Type0 = Type.forNumber(this.type_);
            return descriptorProtos$FieldDescriptorProto$Type0 == null ? Type.TYPE_DOUBLE : descriptorProtos$FieldDescriptorProto$Type0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public String getTypeName() {
            return this.typeName_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public ByteString getTypeNameBytes() {
            return ByteString.copyFromUtf8(this.typeName_);
        }

        @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public boolean hasDefaultValue() {
            return (this.bitField0_ & 0x40) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public boolean hasExtendee() {
            return (this.bitField0_ & 0x20) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public boolean hasJsonName() {
            return (this.bitField0_ & 0x100) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public boolean hasLabel() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public boolean hasNumber() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public boolean hasOneofIndex() {
            return (this.bitField0_ & 0x80) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public boolean hasOptions() {
            return (this.bitField0_ & 0x200) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public boolean hasProto3Optional() {
            return (this.bitField0_ & 0x400) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public boolean hasType() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FieldDescriptorProtoOrBuilder
        public boolean hasTypeName() {
            return (this.bitField0_ & 16) != 0;
        }

        private void mergeOptions(FieldOptions descriptorProtos$FieldOptions0) {
            descriptorProtos$FieldOptions0.getClass();
            this.options_ = this.options_ == null || this.options_ == FieldOptions.getDefaultInstance() ? descriptorProtos$FieldOptions0 : ((FieldOptions)((com.google.protobuf.DescriptorProtos.FieldOptions.Builder)FieldOptions.newBuilder(this.options_).mergeFrom(descriptorProtos$FieldOptions0)).buildPartial());
            this.bitField0_ |= 0x200;
        }

        public static com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder newBuilder() {
            return (com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder)FieldDescriptorProto.DEFAULT_INSTANCE.createBuilder();
        }

        public static com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder newBuilder(FieldDescriptorProto descriptorProtos$FieldDescriptorProto0) {
            return (com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder)FieldDescriptorProto.DEFAULT_INSTANCE.createBuilder(descriptorProtos$FieldDescriptorProto0);
        }

        public static FieldDescriptorProto parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (FieldDescriptorProto)GeneratedMessageLite.parseDelimitedFrom(FieldDescriptorProto.DEFAULT_INSTANCE, inputStream0);
        }

        public static FieldDescriptorProto parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (FieldDescriptorProto)GeneratedMessageLite.parseDelimitedFrom(FieldDescriptorProto.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static FieldDescriptorProto parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (FieldDescriptorProto)GeneratedMessageLite.parseFrom(FieldDescriptorProto.DEFAULT_INSTANCE, byteString0);
        }

        public static FieldDescriptorProto parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (FieldDescriptorProto)GeneratedMessageLite.parseFrom(FieldDescriptorProto.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static FieldDescriptorProto parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (FieldDescriptorProto)GeneratedMessageLite.parseFrom(FieldDescriptorProto.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static FieldDescriptorProto parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (FieldDescriptorProto)GeneratedMessageLite.parseFrom(FieldDescriptorProto.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static FieldDescriptorProto parseFrom(InputStream inputStream0) throws IOException {
            return (FieldDescriptorProto)GeneratedMessageLite.parseFrom(FieldDescriptorProto.DEFAULT_INSTANCE, inputStream0);
        }

        public static FieldDescriptorProto parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (FieldDescriptorProto)GeneratedMessageLite.parseFrom(FieldDescriptorProto.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static FieldDescriptorProto parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (FieldDescriptorProto)GeneratedMessageLite.parseFrom(FieldDescriptorProto.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static FieldDescriptorProto parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (FieldDescriptorProto)GeneratedMessageLite.parseFrom(FieldDescriptorProto.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static FieldDescriptorProto parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (FieldDescriptorProto)GeneratedMessageLite.parseFrom(FieldDescriptorProto.DEFAULT_INSTANCE, arr_b);
        }

        public static FieldDescriptorProto parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (FieldDescriptorProto)GeneratedMessageLite.parseFrom(FieldDescriptorProto.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return FieldDescriptorProto.DEFAULT_INSTANCE.getParserForType();
        }

        private void setDefaultValue(String s) {
            s.getClass();
            this.bitField0_ |= 0x40;
            this.defaultValue_ = s;
        }

        private void setDefaultValueBytes(ByteString byteString0) {
            this.defaultValue_ = byteString0.toStringUtf8();
            this.bitField0_ |= 0x40;
        }

        private void setExtendee(String s) {
            s.getClass();
            this.bitField0_ |= 0x20;
            this.extendee_ = s;
        }

        private void setExtendeeBytes(ByteString byteString0) {
            this.extendee_ = byteString0.toStringUtf8();
            this.bitField0_ |= 0x20;
        }

        private void setJsonName(String s) {
            s.getClass();
            this.bitField0_ |= 0x100;
            this.jsonName_ = s;
        }

        private void setJsonNameBytes(ByteString byteString0) {
            this.jsonName_ = byteString0.toStringUtf8();
            this.bitField0_ |= 0x100;
        }

        private void setLabel(Label descriptorProtos$FieldDescriptorProto$Label0) {
            this.label_ = descriptorProtos$FieldDescriptorProto$Label0.getNumber();
            this.bitField0_ |= 4;
        }

        private void setName(String s) {
            s.getClass();
            this.bitField0_ |= 1;
            this.name_ = s;
        }

        private void setNameBytes(ByteString byteString0) {
            this.name_ = byteString0.toStringUtf8();
            this.bitField0_ |= 1;
        }

        private void setNumber(int v) {
            this.bitField0_ |= 2;
            this.number_ = v;
        }

        private void setOneofIndex(int v) {
            this.bitField0_ |= 0x80;
            this.oneofIndex_ = v;
        }

        private void setOptions(FieldOptions descriptorProtos$FieldOptions0) {
            descriptorProtos$FieldOptions0.getClass();
            this.options_ = descriptorProtos$FieldOptions0;
            this.bitField0_ |= 0x200;
        }

        private void setProto3Optional(boolean z) {
            this.bitField0_ |= 0x400;
            this.proto3Optional_ = z;
        }

        private void setType(Type descriptorProtos$FieldDescriptorProto$Type0) {
            this.type_ = descriptorProtos$FieldDescriptorProto$Type0.getNumber();
            this.bitField0_ |= 8;
        }

        private void setTypeName(String s) {
            s.getClass();
            this.bitField0_ |= 16;
            this.typeName_ = s;
        }

        private void setTypeNameBytes(ByteString byteString0) {
            this.typeName_ = byteString0.toStringUtf8();
            this.bitField0_ |= 16;
        }
    }

    public interface FieldDescriptorProtoOrBuilder extends MessageLiteOrBuilder {
        String getDefaultValue();

        ByteString getDefaultValueBytes();

        String getExtendee();

        ByteString getExtendeeBytes();

        String getJsonName();

        ByteString getJsonNameBytes();

        Label getLabel();

        String getName();

        ByteString getNameBytes();

        int getNumber();

        int getOneofIndex();

        FieldOptions getOptions();

        boolean getProto3Optional();

        Type getType();

        String getTypeName();

        ByteString getTypeNameBytes();

        boolean hasDefaultValue();

        boolean hasExtendee();

        boolean hasJsonName();

        boolean hasLabel();

        boolean hasName();

        boolean hasNumber();

        boolean hasOneofIndex();

        boolean hasOptions();

        boolean hasProto3Optional();

        boolean hasType();

        boolean hasTypeName();
    }

    public static final class FieldOptions extends ExtendableMessage implements FieldOptionsOrBuilder {
        public static final class com.google.protobuf.DescriptorProtos.FieldOptions.Builder extends ExtendableBuilder implements FieldOptionsOrBuilder {
            private com.google.protobuf.DescriptorProtos.FieldOptions.Builder() {
                super(FieldOptions.DEFAULT_INSTANCE);
            }

            com.google.protobuf.DescriptorProtos.FieldOptions.Builder(a descriptorProtos$a0) {
            }

            public com.google.protobuf.DescriptorProtos.FieldOptions.Builder addAllUninterpretedOption(Iterable iterable0) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).addAllUninterpretedOption(iterable0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FieldOptions.Builder addUninterpretedOption(int v, com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder descriptorProtos$UninterpretedOption$Builder0) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).addUninterpretedOption(v, ((UninterpretedOption)descriptorProtos$UninterpretedOption$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FieldOptions.Builder addUninterpretedOption(int v, UninterpretedOption descriptorProtos$UninterpretedOption0) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).addUninterpretedOption(v, descriptorProtos$UninterpretedOption0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FieldOptions.Builder addUninterpretedOption(com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder descriptorProtos$UninterpretedOption$Builder0) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).addUninterpretedOption(((UninterpretedOption)descriptorProtos$UninterpretedOption$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FieldOptions.Builder addUninterpretedOption(UninterpretedOption descriptorProtos$UninterpretedOption0) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).addUninterpretedOption(descriptorProtos$UninterpretedOption0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FieldOptions.Builder clearCtype() {
                this.copyOnWrite();
                ((FieldOptions)this.instance).clearCtype();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FieldOptions.Builder clearDeprecated() {
                this.copyOnWrite();
                ((FieldOptions)this.instance).clearDeprecated();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FieldOptions.Builder clearJstype() {
                this.copyOnWrite();
                ((FieldOptions)this.instance).clearJstype();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FieldOptions.Builder clearLazy() {
                this.copyOnWrite();
                ((FieldOptions)this.instance).clearLazy();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FieldOptions.Builder clearPacked() {
                this.copyOnWrite();
                ((FieldOptions)this.instance).clearPacked();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FieldOptions.Builder clearUninterpretedOption() {
                this.copyOnWrite();
                ((FieldOptions)this.instance).clearUninterpretedOption();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FieldOptions.Builder clearWeak() {
                this.copyOnWrite();
                ((FieldOptions)this.instance).clearWeak();
                return this;
            }

            @Override  // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
            public CType getCtype() {
                return ((FieldOptions)this.instance).getCtype();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
            public boolean getDeprecated() {
                return ((FieldOptions)this.instance).getDeprecated();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
            public JSType getJstype() {
                return ((FieldOptions)this.instance).getJstype();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
            public boolean getLazy() {
                return ((FieldOptions)this.instance).getLazy();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
            public boolean getPacked() {
                return ((FieldOptions)this.instance).getPacked();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
            public UninterpretedOption getUninterpretedOption(int v) {
                return ((FieldOptions)this.instance).getUninterpretedOption(v);
            }

            @Override  // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
            public int getUninterpretedOptionCount() {
                return ((FieldOptions)this.instance).getUninterpretedOptionCount();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
            public List getUninterpretedOptionList() {
                return DesugarCollections.unmodifiableList(((FieldOptions)this.instance).getUninterpretedOptionList());
            }

            @Override  // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
            public boolean getWeak() {
                return ((FieldOptions)this.instance).getWeak();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
            public boolean hasCtype() {
                return ((FieldOptions)this.instance).hasCtype();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
            public boolean hasDeprecated() {
                return ((FieldOptions)this.instance).hasDeprecated();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
            public boolean hasJstype() {
                return ((FieldOptions)this.instance).hasJstype();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
            public boolean hasLazy() {
                return ((FieldOptions)this.instance).hasLazy();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
            public boolean hasPacked() {
                return ((FieldOptions)this.instance).hasPacked();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
            public boolean hasWeak() {
                return ((FieldOptions)this.instance).hasWeak();
            }

            public com.google.protobuf.DescriptorProtos.FieldOptions.Builder removeUninterpretedOption(int v) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).removeUninterpretedOption(v);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FieldOptions.Builder setCtype(CType descriptorProtos$FieldOptions$CType0) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).setCtype(descriptorProtos$FieldOptions$CType0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FieldOptions.Builder setDeprecated(boolean z) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).setDeprecated(z);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FieldOptions.Builder setJstype(JSType descriptorProtos$FieldOptions$JSType0) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).setJstype(descriptorProtos$FieldOptions$JSType0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FieldOptions.Builder setLazy(boolean z) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).setLazy(z);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FieldOptions.Builder setPacked(boolean z) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).setPacked(z);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FieldOptions.Builder setUninterpretedOption(int v, com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder descriptorProtos$UninterpretedOption$Builder0) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).setUninterpretedOption(v, ((UninterpretedOption)descriptorProtos$UninterpretedOption$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FieldOptions.Builder setUninterpretedOption(int v, UninterpretedOption descriptorProtos$UninterpretedOption0) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).setUninterpretedOption(v, descriptorProtos$UninterpretedOption0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FieldOptions.Builder setWeak(boolean z) {
                this.copyOnWrite();
                ((FieldOptions)this.instance).setWeak(z);
                return this;
            }
        }

        public static enum CType implements EnumLite {
            class com.google.protobuf.DescriptorProtos.FieldOptions.CType.a implements EnumLiteMap {
                com.google.protobuf.DescriptorProtos.FieldOptions.CType.a() {
                    super();
                }

                public CType findValueByNumber(int v) {
                    return CType.forNumber(v);
                }

                @Override  // com.google.protobuf.Internal$EnumLiteMap
                public EnumLite findValueByNumber(int v) {
                    return this.findValueByNumber(v);
                }
            }

            static final class com.google.protobuf.DescriptorProtos.FieldOptions.CType.b implements EnumVerifier {
                static final EnumVerifier INSTANCE;

                static {
                    com.google.protobuf.DescriptorProtos.FieldOptions.CType.b.INSTANCE = new com.google.protobuf.DescriptorProtos.FieldOptions.CType.b();
                }

                @Override  // com.google.protobuf.Internal$EnumVerifier
                public boolean isInRange(int v) {
                    return CType.forNumber(v) != null;
                }
            }

            STRING(0),
            CORD(1),
            STRING_PIECE(2);

            public static final int CORD_VALUE = 1;
            public static final int STRING_PIECE_VALUE = 2;
            public static final int STRING_VALUE;
            private static final EnumLiteMap internalValueMap;
            private final int value;

            static {
                CType.internalValueMap = new com.google.protobuf.DescriptorProtos.FieldOptions.CType.a();
            }

            private CType(int v1) {
                this.value = v1;
            }

            public static CType forNumber(int v) {
                switch(v) {
                    case 0: {
                        return CType.STRING;
                    }
                    case 1: {
                        return CType.CORD;
                    }
                    case 2: {
                        return CType.STRING_PIECE;
                    }
                    default: {
                        return null;
                    }
                }
            }

            @Override  // com.google.protobuf.Internal$EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static EnumLiteMap internalGetValueMap() {
                return CType.internalValueMap;
            }

            public static EnumVerifier internalGetVerifier() {
                return com.google.protobuf.DescriptorProtos.FieldOptions.CType.b.INSTANCE;
            }

            @Deprecated
            public static CType valueOf(int v) {
                return CType.forNumber(v);
            }
        }

        public static enum JSType implements EnumLite {
            class com.google.protobuf.DescriptorProtos.FieldOptions.JSType.a implements EnumLiteMap {
                com.google.protobuf.DescriptorProtos.FieldOptions.JSType.a() {
                    super();
                }

                public JSType findValueByNumber(int v) {
                    return JSType.forNumber(v);
                }

                @Override  // com.google.protobuf.Internal$EnumLiteMap
                public EnumLite findValueByNumber(int v) {
                    return this.findValueByNumber(v);
                }
            }

            static final class com.google.protobuf.DescriptorProtos.FieldOptions.JSType.b implements EnumVerifier {
                static final EnumVerifier INSTANCE;

                static {
                    com.google.protobuf.DescriptorProtos.FieldOptions.JSType.b.INSTANCE = new com.google.protobuf.DescriptorProtos.FieldOptions.JSType.b();
                }

                @Override  // com.google.protobuf.Internal$EnumVerifier
                public boolean isInRange(int v) {
                    return JSType.forNumber(v) != null;
                }
            }

            JS_NORMAL(0),
            JS_STRING(1),
            JS_NUMBER(2);

            public static final int JS_NORMAL_VALUE = 0;
            public static final int JS_NUMBER_VALUE = 2;
            public static final int JS_STRING_VALUE = 1;
            private static final EnumLiteMap internalValueMap;
            private final int value;

            static {
                JSType.internalValueMap = new com.google.protobuf.DescriptorProtos.FieldOptions.JSType.a();
            }

            private JSType(int v1) {
                this.value = v1;
            }

            public static JSType forNumber(int v) {
                switch(v) {
                    case 0: {
                        return JSType.JS_NORMAL;
                    }
                    case 1: {
                        return JSType.JS_STRING;
                    }
                    case 2: {
                        return JSType.JS_NUMBER;
                    }
                    default: {
                        return null;
                    }
                }
            }

            @Override  // com.google.protobuf.Internal$EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static EnumLiteMap internalGetValueMap() {
                return JSType.internalValueMap;
            }

            public static EnumVerifier internalGetVerifier() {
                return com.google.protobuf.DescriptorProtos.FieldOptions.JSType.b.INSTANCE;
            }

            @Deprecated
            public static JSType valueOf(int v) {
                return JSType.forNumber(v);
            }
        }

        public static final int CTYPE_FIELD_NUMBER = 1;
        private static final FieldOptions DEFAULT_INSTANCE = null;
        public static final int DEPRECATED_FIELD_NUMBER = 3;
        public static final int JSTYPE_FIELD_NUMBER = 6;
        public static final int LAZY_FIELD_NUMBER = 5;
        public static final int PACKED_FIELD_NUMBER = 2;
        private static volatile Parser PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        public static final int WEAK_FIELD_NUMBER = 10;
        private int bitField0_;
        private int ctype_;
        private boolean deprecated_;
        private int jstype_;
        private boolean lazy_;
        private byte memoizedIsInitialized;
        private boolean packed_;
        private ProtobufList uninterpretedOption_;
        private boolean weak_;

        static {
            FieldOptions descriptorProtos$FieldOptions0 = new FieldOptions();
            FieldOptions.DEFAULT_INSTANCE = descriptorProtos$FieldOptions0;
            GeneratedMessageLite.registerDefaultInstance(FieldOptions.class, descriptorProtos$FieldOptions0);
        }

        private FieldOptions() {
            this.memoizedIsInitialized = 2;
            this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void addAllUninterpretedOption(Iterable iterable0) {
            this.ensureUninterpretedOptionIsMutable();
            AbstractMessageLite.addAll(iterable0, this.uninterpretedOption_);
        }

        private void addUninterpretedOption(int v, UninterpretedOption descriptorProtos$UninterpretedOption0) {
            descriptorProtos$UninterpretedOption0.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(v, descriptorProtos$UninterpretedOption0);
        }

        private void addUninterpretedOption(UninterpretedOption descriptorProtos$UninterpretedOption0) {
            descriptorProtos$UninterpretedOption0.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(descriptorProtos$UninterpretedOption0);
        }

        private void clearCtype() {
            this.bitField0_ &= -2;
            this.ctype_ = 0;
        }

        private void clearDeprecated() {
            this.bitField0_ &= -17;
            this.deprecated_ = false;
        }

        private void clearJstype() {
            this.bitField0_ &= -5;
            this.jstype_ = 0;
        }

        private void clearLazy() {
            this.bitField0_ &= -9;
            this.lazy_ = false;
        }

        private void clearPacked() {
            this.bitField0_ &= -3;
            this.packed_ = false;
        }

        private void clearUninterpretedOption() {
            this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearWeak() {
            this.bitField0_ &= -33;
            this.weak_ = false;
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            int v = 1;
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new FieldOptions();
                }
                case 2: {
                    return new com.google.protobuf.DescriptorProtos.FieldOptions.Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(FieldOptions.DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001ϧ\u0007\u0000\u0001\u0001\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဇ\u0004\u0005ဇ\u0003\u0006ဌ\u0002\nဇ\u0005ϧЛ", new Object[]{"bitField0_", "ctype_", CType.internalGetVerifier(), "packed_", "deprecated_", "lazy_", "jstype_", JSType.internalGetVerifier(), "weak_", "uninterpretedOption_", UninterpretedOption.class});
                }
                case 4: {
                    return FieldOptions.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = FieldOptions.PARSER;
                    if(parser0 == null) {
                        synchronized(FieldOptions.class) {
                            parser0 = FieldOptions.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(FieldOptions.DEFAULT_INSTANCE);
                                FieldOptions.PARSER = parser0;
                            }
                        }
                    }
                    return parser0;
                }
                case 6: {
                    return this.memoizedIsInitialized;
                }
                case 7: {
                    if(object0 == null) {
                        v = 0;
                    }
                    this.memoizedIsInitialized = (byte)v;
                    return null;
                }
                default: {
                    throw new UnsupportedOperationException();
                }
            }
        }

        private void ensureUninterpretedOptionIsMutable() {
            ProtobufList internal$ProtobufList0 = this.uninterpretedOption_;
            if(!internal$ProtobufList0.isModifiable()) {
                this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
            }
        }

        @Override  // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public CType getCtype() {
            CType descriptorProtos$FieldOptions$CType0 = CType.forNumber(this.ctype_);
            return descriptorProtos$FieldOptions$CType0 == null ? CType.STRING : descriptorProtos$FieldOptions$CType0;
        }

        public static FieldOptions getDefaultInstance() {
            return FieldOptions.DEFAULT_INSTANCE;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public JSType getJstype() {
            JSType descriptorProtos$FieldOptions$JSType0 = JSType.forNumber(this.jstype_);
            return descriptorProtos$FieldOptions$JSType0 == null ? JSType.JS_NORMAL : descriptorProtos$FieldOptions$JSType0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public boolean getLazy() {
            return this.lazy_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public boolean getPacked() {
            return this.packed_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public UninterpretedOption getUninterpretedOption(int v) {
            return (UninterpretedOption)this.uninterpretedOption_.get(v);
        }

        @Override  // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override  // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public List getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int v) {
            return (UninterpretedOptionOrBuilder)this.uninterpretedOption_.get(v);
        }

        public List getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public boolean getWeak() {
            return this.weak_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public boolean hasCtype() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public boolean hasDeprecated() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public boolean hasJstype() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public boolean hasLazy() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public boolean hasPacked() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FieldOptionsOrBuilder
        public boolean hasWeak() {
            return (this.bitField0_ & 0x20) != 0;
        }

        public static com.google.protobuf.DescriptorProtos.FieldOptions.Builder newBuilder() {
            return (com.google.protobuf.DescriptorProtos.FieldOptions.Builder)FieldOptions.DEFAULT_INSTANCE.createBuilder();
        }

        public static com.google.protobuf.DescriptorProtos.FieldOptions.Builder newBuilder(FieldOptions descriptorProtos$FieldOptions0) {
            return (com.google.protobuf.DescriptorProtos.FieldOptions.Builder)FieldOptions.DEFAULT_INSTANCE.createBuilder(descriptorProtos$FieldOptions0);
        }

        public static FieldOptions parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (FieldOptions)GeneratedMessageLite.parseDelimitedFrom(FieldOptions.DEFAULT_INSTANCE, inputStream0);
        }

        public static FieldOptions parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (FieldOptions)GeneratedMessageLite.parseDelimitedFrom(FieldOptions.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static FieldOptions parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (FieldOptions)GeneratedMessageLite.parseFrom(FieldOptions.DEFAULT_INSTANCE, byteString0);
        }

        public static FieldOptions parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (FieldOptions)GeneratedMessageLite.parseFrom(FieldOptions.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static FieldOptions parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (FieldOptions)GeneratedMessageLite.parseFrom(FieldOptions.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static FieldOptions parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (FieldOptions)GeneratedMessageLite.parseFrom(FieldOptions.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static FieldOptions parseFrom(InputStream inputStream0) throws IOException {
            return (FieldOptions)GeneratedMessageLite.parseFrom(FieldOptions.DEFAULT_INSTANCE, inputStream0);
        }

        public static FieldOptions parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (FieldOptions)GeneratedMessageLite.parseFrom(FieldOptions.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static FieldOptions parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (FieldOptions)GeneratedMessageLite.parseFrom(FieldOptions.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static FieldOptions parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (FieldOptions)GeneratedMessageLite.parseFrom(FieldOptions.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static FieldOptions parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (FieldOptions)GeneratedMessageLite.parseFrom(FieldOptions.DEFAULT_INSTANCE, arr_b);
        }

        public static FieldOptions parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (FieldOptions)GeneratedMessageLite.parseFrom(FieldOptions.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return FieldOptions.DEFAULT_INSTANCE.getParserForType();
        }

        private void removeUninterpretedOption(int v) {
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(v);
        }

        private void setCtype(CType descriptorProtos$FieldOptions$CType0) {
            this.ctype_ = descriptorProtos$FieldOptions$CType0.getNumber();
            this.bitField0_ |= 1;
        }

        private void setDeprecated(boolean z) {
            this.bitField0_ |= 16;
            this.deprecated_ = z;
        }

        private void setJstype(JSType descriptorProtos$FieldOptions$JSType0) {
            this.jstype_ = descriptorProtos$FieldOptions$JSType0.getNumber();
            this.bitField0_ |= 4;
        }

        private void setLazy(boolean z) {
            this.bitField0_ |= 8;
            this.lazy_ = z;
        }

        private void setPacked(boolean z) {
            this.bitField0_ |= 2;
            this.packed_ = z;
        }

        private void setUninterpretedOption(int v, UninterpretedOption descriptorProtos$UninterpretedOption0) {
            descriptorProtos$UninterpretedOption0.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(v, descriptorProtos$UninterpretedOption0);
        }

        private void setWeak(boolean z) {
            this.bitField0_ |= 0x20;
            this.weak_ = z;
        }
    }

    public interface FieldOptionsOrBuilder extends ExtendableMessageOrBuilder {
        CType getCtype();

        boolean getDeprecated();

        JSType getJstype();

        boolean getLazy();

        boolean getPacked();

        UninterpretedOption getUninterpretedOption(int arg1);

        int getUninterpretedOptionCount();

        List getUninterpretedOptionList();

        boolean getWeak();

        boolean hasCtype();

        boolean hasDeprecated();

        boolean hasJstype();

        boolean hasLazy();

        boolean hasPacked();

        boolean hasWeak();
    }

    public static final class FileDescriptorProto extends GeneratedMessageLite implements FileDescriptorProtoOrBuilder {
        public static final class com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements FileDescriptorProtoOrBuilder {
            private com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder() {
                super(FileDescriptorProto.DEFAULT_INSTANCE);
            }

            com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder(a descriptorProtos$a0) {
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder addAllDependency(Iterable iterable0) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addAllDependency(iterable0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder addAllEnumType(Iterable iterable0) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addAllEnumType(iterable0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder addAllExtension(Iterable iterable0) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addAllExtension(iterable0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder addAllMessageType(Iterable iterable0) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addAllMessageType(iterable0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder addAllPublicDependency(Iterable iterable0) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addAllPublicDependency(iterable0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder addAllService(Iterable iterable0) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addAllService(iterable0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder addAllWeakDependency(Iterable iterable0) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addAllWeakDependency(iterable0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder addDependency(String s) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addDependency(s);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder addDependencyBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addDependencyBytes(byteString0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder addEnumType(int v, com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder descriptorProtos$EnumDescriptorProto$Builder0) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addEnumType(v, ((EnumDescriptorProto)descriptorProtos$EnumDescriptorProto$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder addEnumType(int v, EnumDescriptorProto descriptorProtos$EnumDescriptorProto0) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addEnumType(v, descriptorProtos$EnumDescriptorProto0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder addEnumType(com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder descriptorProtos$EnumDescriptorProto$Builder0) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addEnumType(((EnumDescriptorProto)descriptorProtos$EnumDescriptorProto$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder addEnumType(EnumDescriptorProto descriptorProtos$EnumDescriptorProto0) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addEnumType(descriptorProtos$EnumDescriptorProto0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder addExtension(int v, com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder descriptorProtos$FieldDescriptorProto$Builder0) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addExtension(v, ((FieldDescriptorProto)descriptorProtos$FieldDescriptorProto$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder addExtension(int v, FieldDescriptorProto descriptorProtos$FieldDescriptorProto0) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addExtension(v, descriptorProtos$FieldDescriptorProto0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder addExtension(com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder descriptorProtos$FieldDescriptorProto$Builder0) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addExtension(((FieldDescriptorProto)descriptorProtos$FieldDescriptorProto$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder addExtension(FieldDescriptorProto descriptorProtos$FieldDescriptorProto0) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addExtension(descriptorProtos$FieldDescriptorProto0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder addMessageType(int v, Builder descriptorProtos$DescriptorProto$Builder0) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addMessageType(v, ((DescriptorProto)descriptorProtos$DescriptorProto$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder addMessageType(int v, DescriptorProto descriptorProtos$DescriptorProto0) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addMessageType(v, descriptorProtos$DescriptorProto0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder addMessageType(Builder descriptorProtos$DescriptorProto$Builder0) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addMessageType(((DescriptorProto)descriptorProtos$DescriptorProto$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder addMessageType(DescriptorProto descriptorProtos$DescriptorProto0) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addMessageType(descriptorProtos$DescriptorProto0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder addPublicDependency(int v) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addPublicDependency(v);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder addService(int v, com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder descriptorProtos$ServiceDescriptorProto$Builder0) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addService(v, ((ServiceDescriptorProto)descriptorProtos$ServiceDescriptorProto$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder addService(int v, ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto0) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addService(v, descriptorProtos$ServiceDescriptorProto0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder addService(com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder descriptorProtos$ServiceDescriptorProto$Builder0) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addService(((ServiceDescriptorProto)descriptorProtos$ServiceDescriptorProto$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder addService(ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto0) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addService(descriptorProtos$ServiceDescriptorProto0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder addWeakDependency(int v) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).addWeakDependency(v);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder clearDependency() {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).clearDependency();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder clearEnumType() {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).clearEnumType();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder clearExtension() {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).clearExtension();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder clearMessageType() {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).clearMessageType();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder clearName() {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).clearName();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder clearOptions() {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).clearOptions();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder clearPackage() {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).clearPackage();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder clearPublicDependency() {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).clearPublicDependency();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder clearService() {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).clearService();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder clearSourceCodeInfo() {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).clearSourceCodeInfo();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder clearSyntax() {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).clearSyntax();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder clearWeakDependency() {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).clearWeakDependency();
                return this;
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
            public String getDependency(int v) {
                return ((FileDescriptorProto)this.instance).getDependency(v);
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
            public ByteString getDependencyBytes(int v) {
                return ((FileDescriptorProto)this.instance).getDependencyBytes(v);
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
            public int getDependencyCount() {
                return ((FileDescriptorProto)this.instance).getDependencyCount();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
            public List getDependencyList() {
                return DesugarCollections.unmodifiableList(((FileDescriptorProto)this.instance).getDependencyList());
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
            public EnumDescriptorProto getEnumType(int v) {
                return ((FileDescriptorProto)this.instance).getEnumType(v);
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
            public int getEnumTypeCount() {
                return ((FileDescriptorProto)this.instance).getEnumTypeCount();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
            public List getEnumTypeList() {
                return DesugarCollections.unmodifiableList(((FileDescriptorProto)this.instance).getEnumTypeList());
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
            public FieldDescriptorProto getExtension(int v) {
                return ((FileDescriptorProto)this.instance).getExtension(v);
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
            public int getExtensionCount() {
                return ((FileDescriptorProto)this.instance).getExtensionCount();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
            public List getExtensionList() {
                return DesugarCollections.unmodifiableList(((FileDescriptorProto)this.instance).getExtensionList());
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
            public DescriptorProto getMessageType(int v) {
                return ((FileDescriptorProto)this.instance).getMessageType(v);
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
            public int getMessageTypeCount() {
                return ((FileDescriptorProto)this.instance).getMessageTypeCount();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
            public List getMessageTypeList() {
                return DesugarCollections.unmodifiableList(((FileDescriptorProto)this.instance).getMessageTypeList());
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
            public String getName() {
                return ((FileDescriptorProto)this.instance).getName();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
            public ByteString getNameBytes() {
                return ((FileDescriptorProto)this.instance).getNameBytes();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
            public FileOptions getOptions() {
                return ((FileDescriptorProto)this.instance).getOptions();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
            public String getPackage() {
                return ((FileDescriptorProto)this.instance).getPackage();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
            public ByteString getPackageBytes() {
                return ((FileDescriptorProto)this.instance).getPackageBytes();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
            public int getPublicDependency(int v) {
                return ((FileDescriptorProto)this.instance).getPublicDependency(v);
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
            public int getPublicDependencyCount() {
                return ((FileDescriptorProto)this.instance).getPublicDependencyCount();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
            public List getPublicDependencyList() {
                return DesugarCollections.unmodifiableList(((FileDescriptorProto)this.instance).getPublicDependencyList());
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
            public ServiceDescriptorProto getService(int v) {
                return ((FileDescriptorProto)this.instance).getService(v);
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
            public int getServiceCount() {
                return ((FileDescriptorProto)this.instance).getServiceCount();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
            public List getServiceList() {
                return DesugarCollections.unmodifiableList(((FileDescriptorProto)this.instance).getServiceList());
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
            public SourceCodeInfo getSourceCodeInfo() {
                return ((FileDescriptorProto)this.instance).getSourceCodeInfo();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
            public String getSyntax() {
                return ((FileDescriptorProto)this.instance).getSyntax();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
            public ByteString getSyntaxBytes() {
                return ((FileDescriptorProto)this.instance).getSyntaxBytes();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
            public int getWeakDependency(int v) {
                return ((FileDescriptorProto)this.instance).getWeakDependency(v);
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
            public int getWeakDependencyCount() {
                return ((FileDescriptorProto)this.instance).getWeakDependencyCount();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
            public List getWeakDependencyList() {
                return DesugarCollections.unmodifiableList(((FileDescriptorProto)this.instance).getWeakDependencyList());
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
            public boolean hasName() {
                return ((FileDescriptorProto)this.instance).hasName();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
            public boolean hasOptions() {
                return ((FileDescriptorProto)this.instance).hasOptions();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
            public boolean hasPackage() {
                return ((FileDescriptorProto)this.instance).hasPackage();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
            public boolean hasSourceCodeInfo() {
                return ((FileDescriptorProto)this.instance).hasSourceCodeInfo();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
            public boolean hasSyntax() {
                return ((FileDescriptorProto)this.instance).hasSyntax();
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder mergeOptions(FileOptions descriptorProtos$FileOptions0) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).mergeOptions(descriptorProtos$FileOptions0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder mergeSourceCodeInfo(SourceCodeInfo descriptorProtos$SourceCodeInfo0) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).mergeSourceCodeInfo(descriptorProtos$SourceCodeInfo0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder removeEnumType(int v) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).removeEnumType(v);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder removeExtension(int v) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).removeExtension(v);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder removeMessageType(int v) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).removeMessageType(v);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder removeService(int v) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).removeService(v);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder setDependency(int v, String s) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).setDependency(v, s);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder setEnumType(int v, com.google.protobuf.DescriptorProtos.EnumDescriptorProto.Builder descriptorProtos$EnumDescriptorProto$Builder0) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).setEnumType(v, ((EnumDescriptorProto)descriptorProtos$EnumDescriptorProto$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder setEnumType(int v, EnumDescriptorProto descriptorProtos$EnumDescriptorProto0) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).setEnumType(v, descriptorProtos$EnumDescriptorProto0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder setExtension(int v, com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Builder descriptorProtos$FieldDescriptorProto$Builder0) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).setExtension(v, ((FieldDescriptorProto)descriptorProtos$FieldDescriptorProto$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder setExtension(int v, FieldDescriptorProto descriptorProtos$FieldDescriptorProto0) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).setExtension(v, descriptorProtos$FieldDescriptorProto0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder setMessageType(int v, Builder descriptorProtos$DescriptorProto$Builder0) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).setMessageType(v, ((DescriptorProto)descriptorProtos$DescriptorProto$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder setMessageType(int v, DescriptorProto descriptorProtos$DescriptorProto0) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).setMessageType(v, descriptorProtos$DescriptorProto0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder setName(String s) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).setName(s);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder setNameBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).setNameBytes(byteString0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder setOptions(com.google.protobuf.DescriptorProtos.FileOptions.Builder descriptorProtos$FileOptions$Builder0) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).setOptions(((FileOptions)descriptorProtos$FileOptions$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder setOptions(FileOptions descriptorProtos$FileOptions0) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).setOptions(descriptorProtos$FileOptions0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder setPackage(String s) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).setPackage(s);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder setPackageBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).setPackageBytes(byteString0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder setPublicDependency(int v, int v1) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).setPublicDependency(v, v1);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder setService(int v, com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder descriptorProtos$ServiceDescriptorProto$Builder0) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).setService(v, ((ServiceDescriptorProto)descriptorProtos$ServiceDescriptorProto$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder setService(int v, ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto0) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).setService(v, descriptorProtos$ServiceDescriptorProto0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder setSourceCodeInfo(com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder descriptorProtos$SourceCodeInfo$Builder0) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).setSourceCodeInfo(((SourceCodeInfo)descriptorProtos$SourceCodeInfo$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder setSourceCodeInfo(SourceCodeInfo descriptorProtos$SourceCodeInfo0) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).setSourceCodeInfo(descriptorProtos$SourceCodeInfo0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder setSyntax(String s) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).setSyntax(s);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder setSyntaxBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).setSyntaxBytes(byteString0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder setWeakDependency(int v, int v1) {
                this.copyOnWrite();
                ((FileDescriptorProto)this.instance).setWeakDependency(v, v1);
                return this;
            }
        }

        private static final FileDescriptorProto DEFAULT_INSTANCE = null;
        public static final int DEPENDENCY_FIELD_NUMBER = 3;
        public static final int ENUM_TYPE_FIELD_NUMBER = 5;
        public static final int EXTENSION_FIELD_NUMBER = 7;
        public static final int MESSAGE_TYPE_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 8;
        public static final int PACKAGE_FIELD_NUMBER = 2;
        private static volatile Parser PARSER = null;
        public static final int PUBLIC_DEPENDENCY_FIELD_NUMBER = 10;
        public static final int SERVICE_FIELD_NUMBER = 6;
        public static final int SOURCE_CODE_INFO_FIELD_NUMBER = 9;
        public static final int SYNTAX_FIELD_NUMBER = 12;
        public static final int WEAK_DEPENDENCY_FIELD_NUMBER = 11;
        private int bitField0_;
        private ProtobufList dependency_;
        private ProtobufList enumType_;
        private ProtobufList extension_;
        private byte memoizedIsInitialized;
        private ProtobufList messageType_;
        private String name_;
        private FileOptions options_;
        private String package_;
        private IntList publicDependency_;
        private ProtobufList service_;
        private SourceCodeInfo sourceCodeInfo_;
        private String syntax_;
        private IntList weakDependency_;

        static {
            FileDescriptorProto descriptorProtos$FileDescriptorProto0 = new FileDescriptorProto();
            FileDescriptorProto.DEFAULT_INSTANCE = descriptorProtos$FileDescriptorProto0;
            GeneratedMessageLite.registerDefaultInstance(FileDescriptorProto.class, descriptorProtos$FileDescriptorProto0);
        }

        private FileDescriptorProto() {
            this.memoizedIsInitialized = 2;
            this.name_ = "";
            this.package_ = "";
            this.dependency_ = GeneratedMessageLite.emptyProtobufList();
            this.publicDependency_ = GeneratedMessageLite.emptyIntList();
            this.weakDependency_ = GeneratedMessageLite.emptyIntList();
            this.messageType_ = GeneratedMessageLite.emptyProtobufList();
            this.enumType_ = GeneratedMessageLite.emptyProtobufList();
            this.service_ = GeneratedMessageLite.emptyProtobufList();
            this.extension_ = GeneratedMessageLite.emptyProtobufList();
            this.syntax_ = "";
        }

        private void addAllDependency(Iterable iterable0) {
            this.ensureDependencyIsMutable();
            AbstractMessageLite.addAll(iterable0, this.dependency_);
        }

        private void addAllEnumType(Iterable iterable0) {
            this.ensureEnumTypeIsMutable();
            AbstractMessageLite.addAll(iterable0, this.enumType_);
        }

        private void addAllExtension(Iterable iterable0) {
            this.ensureExtensionIsMutable();
            AbstractMessageLite.addAll(iterable0, this.extension_);
        }

        private void addAllMessageType(Iterable iterable0) {
            this.ensureMessageTypeIsMutable();
            AbstractMessageLite.addAll(iterable0, this.messageType_);
        }

        private void addAllPublicDependency(Iterable iterable0) {
            this.ensurePublicDependencyIsMutable();
            AbstractMessageLite.addAll(iterable0, this.publicDependency_);
        }

        private void addAllService(Iterable iterable0) {
            this.ensureServiceIsMutable();
            AbstractMessageLite.addAll(iterable0, this.service_);
        }

        private void addAllWeakDependency(Iterable iterable0) {
            this.ensureWeakDependencyIsMutable();
            AbstractMessageLite.addAll(iterable0, this.weakDependency_);
        }

        private void addDependency(String s) {
            s.getClass();
            this.ensureDependencyIsMutable();
            this.dependency_.add(s);
        }

        private void addDependencyBytes(ByteString byteString0) {
            this.ensureDependencyIsMutable();
            this.dependency_.add(byteString0.toStringUtf8());
        }

        private void addEnumType(int v, EnumDescriptorProto descriptorProtos$EnumDescriptorProto0) {
            descriptorProtos$EnumDescriptorProto0.getClass();
            this.ensureEnumTypeIsMutable();
            this.enumType_.add(v, descriptorProtos$EnumDescriptorProto0);
        }

        private void addEnumType(EnumDescriptorProto descriptorProtos$EnumDescriptorProto0) {
            descriptorProtos$EnumDescriptorProto0.getClass();
            this.ensureEnumTypeIsMutable();
            this.enumType_.add(descriptorProtos$EnumDescriptorProto0);
        }

        private void addExtension(int v, FieldDescriptorProto descriptorProtos$FieldDescriptorProto0) {
            descriptorProtos$FieldDescriptorProto0.getClass();
            this.ensureExtensionIsMutable();
            this.extension_.add(v, descriptorProtos$FieldDescriptorProto0);
        }

        private void addExtension(FieldDescriptorProto descriptorProtos$FieldDescriptorProto0) {
            descriptorProtos$FieldDescriptorProto0.getClass();
            this.ensureExtensionIsMutable();
            this.extension_.add(descriptorProtos$FieldDescriptorProto0);
        }

        private void addMessageType(int v, DescriptorProto descriptorProtos$DescriptorProto0) {
            descriptorProtos$DescriptorProto0.getClass();
            this.ensureMessageTypeIsMutable();
            this.messageType_.add(v, descriptorProtos$DescriptorProto0);
        }

        private void addMessageType(DescriptorProto descriptorProtos$DescriptorProto0) {
            descriptorProtos$DescriptorProto0.getClass();
            this.ensureMessageTypeIsMutable();
            this.messageType_.add(descriptorProtos$DescriptorProto0);
        }

        private void addPublicDependency(int v) {
            this.ensurePublicDependencyIsMutable();
            this.publicDependency_.addInt(v);
        }

        private void addService(int v, ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto0) {
            descriptorProtos$ServiceDescriptorProto0.getClass();
            this.ensureServiceIsMutable();
            this.service_.add(v, descriptorProtos$ServiceDescriptorProto0);
        }

        private void addService(ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto0) {
            descriptorProtos$ServiceDescriptorProto0.getClass();
            this.ensureServiceIsMutable();
            this.service_.add(descriptorProtos$ServiceDescriptorProto0);
        }

        private void addWeakDependency(int v) {
            this.ensureWeakDependencyIsMutable();
            this.weakDependency_.addInt(v);
        }

        private void clearDependency() {
            this.dependency_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearEnumType() {
            this.enumType_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearExtension() {
            this.extension_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearMessageType() {
            this.messageType_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearName() {
            this.bitField0_ &= -2;
            this.name_ = "";
        }

        private void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -5;
        }

        private void clearPackage() {
            this.bitField0_ &= -3;
            this.package_ = FileDescriptorProto.getDefaultInstance().getPackage();
        }

        private void clearPublicDependency() {
            this.publicDependency_ = GeneratedMessageLite.emptyIntList();
        }

        private void clearService() {
            this.service_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearSourceCodeInfo() {
            this.sourceCodeInfo_ = null;
            this.bitField0_ &= -9;
        }

        private void clearSyntax() {
            this.bitField0_ &= -17;
            this.syntax_ = "";
        }

        private void clearWeakDependency() {
            this.weakDependency_ = GeneratedMessageLite.emptyIntList();
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            int v = 1;
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new FileDescriptorProto();
                }
                case 2: {
                    return new com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(FileDescriptorProto.DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0007\u0005\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001A\u0004Л\u0005Л\u0006Л\u0007Л\bᐉ\u0002\tဉ\u0003\n\u0016\u000B\u0016\fဈ\u0004", new Object[]{"bitField0_", "name_", "package_", "dependency_", "messageType_", DescriptorProto.class, "enumType_", EnumDescriptorProto.class, "service_", ServiceDescriptorProto.class, "extension_", FieldDescriptorProto.class, "options_", "sourceCodeInfo_", "publicDependency_", "weakDependency_", "syntax_"});
                }
                case 4: {
                    return FileDescriptorProto.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = FileDescriptorProto.PARSER;
                    if(parser0 == null) {
                        synchronized(FileDescriptorProto.class) {
                            parser0 = FileDescriptorProto.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(FileDescriptorProto.DEFAULT_INSTANCE);
                                FileDescriptorProto.PARSER = parser0;
                            }
                        }
                    }
                    return parser0;
                }
                case 6: {
                    return this.memoizedIsInitialized;
                }
                case 7: {
                    if(object0 == null) {
                        v = 0;
                    }
                    this.memoizedIsInitialized = (byte)v;
                    return null;
                }
                default: {
                    throw new UnsupportedOperationException();
                }
            }
        }

        private void ensureDependencyIsMutable() {
            ProtobufList internal$ProtobufList0 = this.dependency_;
            if(!internal$ProtobufList0.isModifiable()) {
                this.dependency_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
            }
        }

        private void ensureEnumTypeIsMutable() {
            ProtobufList internal$ProtobufList0 = this.enumType_;
            if(!internal$ProtobufList0.isModifiable()) {
                this.enumType_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
            }
        }

        private void ensureExtensionIsMutable() {
            ProtobufList internal$ProtobufList0 = this.extension_;
            if(!internal$ProtobufList0.isModifiable()) {
                this.extension_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
            }
        }

        private void ensureMessageTypeIsMutable() {
            ProtobufList internal$ProtobufList0 = this.messageType_;
            if(!internal$ProtobufList0.isModifiable()) {
                this.messageType_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
            }
        }

        private void ensurePublicDependencyIsMutable() {
            IntList internal$IntList0 = this.publicDependency_;
            if(!internal$IntList0.isModifiable()) {
                this.publicDependency_ = GeneratedMessageLite.mutableCopy(internal$IntList0);
            }
        }

        private void ensureServiceIsMutable() {
            ProtobufList internal$ProtobufList0 = this.service_;
            if(!internal$ProtobufList0.isModifiable()) {
                this.service_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
            }
        }

        private void ensureWeakDependencyIsMutable() {
            IntList internal$IntList0 = this.weakDependency_;
            if(!internal$IntList0.isModifiable()) {
                this.weakDependency_ = GeneratedMessageLite.mutableCopy(internal$IntList0);
            }
        }

        public static FileDescriptorProto getDefaultInstance() {
            return FileDescriptorProto.DEFAULT_INSTANCE;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public String getDependency(int v) {
            return (String)this.dependency_.get(v);
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public ByteString getDependencyBytes(int v) {
            return ByteString.copyFromUtf8(((String)this.dependency_.get(v)));
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public int getDependencyCount() {
            return this.dependency_.size();
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public List getDependencyList() {
            return this.dependency_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public EnumDescriptorProto getEnumType(int v) {
            return (EnumDescriptorProto)this.enumType_.get(v);
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public int getEnumTypeCount() {
            return this.enumType_.size();
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public List getEnumTypeList() {
            return this.enumType_;
        }

        public EnumDescriptorProtoOrBuilder getEnumTypeOrBuilder(int v) {
            return (EnumDescriptorProtoOrBuilder)this.enumType_.get(v);
        }

        public List getEnumTypeOrBuilderList() {
            return this.enumType_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public FieldDescriptorProto getExtension(int v) {
            return (FieldDescriptorProto)this.extension_.get(v);
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public int getExtensionCount() {
            return this.extension_.size();
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public List getExtensionList() {
            return this.extension_;
        }

        public FieldDescriptorProtoOrBuilder getExtensionOrBuilder(int v) {
            return (FieldDescriptorProtoOrBuilder)this.extension_.get(v);
        }

        public List getExtensionOrBuilderList() {
            return this.extension_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public DescriptorProto getMessageType(int v) {
            return (DescriptorProto)this.messageType_.get(v);
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public int getMessageTypeCount() {
            return this.messageType_.size();
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public List getMessageTypeList() {
            return this.messageType_;
        }

        public DescriptorProtoOrBuilder getMessageTypeOrBuilder(int v) {
            return (DescriptorProtoOrBuilder)this.messageType_.get(v);
        }

        public List getMessageTypeOrBuilderList() {
            return this.messageType_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public FileOptions getOptions() {
            return this.options_ == null ? FileOptions.getDefaultInstance() : this.options_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public String getPackage() {
            return this.package_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public ByteString getPackageBytes() {
            return ByteString.copyFromUtf8(this.package_);
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public int getPublicDependency(int v) {
            return this.publicDependency_.getInt(v);
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public int getPublicDependencyCount() {
            return this.publicDependency_.size();
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public List getPublicDependencyList() {
            return this.publicDependency_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public ServiceDescriptorProto getService(int v) {
            return (ServiceDescriptorProto)this.service_.get(v);
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public int getServiceCount() {
            return this.service_.size();
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public List getServiceList() {
            return this.service_;
        }

        public ServiceDescriptorProtoOrBuilder getServiceOrBuilder(int v) {
            return (ServiceDescriptorProtoOrBuilder)this.service_.get(v);
        }

        public List getServiceOrBuilderList() {
            return this.service_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public SourceCodeInfo getSourceCodeInfo() {
            return this.sourceCodeInfo_ == null ? SourceCodeInfo.getDefaultInstance() : this.sourceCodeInfo_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public String getSyntax() {
            return this.syntax_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public ByteString getSyntaxBytes() {
            return ByteString.copyFromUtf8(this.syntax_);
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public int getWeakDependency(int v) {
            return this.weakDependency_.getInt(v);
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public int getWeakDependencyCount() {
            return this.weakDependency_.size();
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public List getWeakDependencyList() {
            return this.weakDependency_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public boolean hasOptions() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public boolean hasPackage() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public boolean hasSourceCodeInfo() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public boolean hasSyntax() {
            return (this.bitField0_ & 16) != 0;
        }

        private void mergeOptions(FileOptions descriptorProtos$FileOptions0) {
            descriptorProtos$FileOptions0.getClass();
            this.options_ = this.options_ == null || this.options_ == FileOptions.getDefaultInstance() ? descriptorProtos$FileOptions0 : ((FileOptions)((com.google.protobuf.DescriptorProtos.FileOptions.Builder)FileOptions.newBuilder(this.options_).mergeFrom(descriptorProtos$FileOptions0)).buildPartial());
            this.bitField0_ |= 4;
        }

        private void mergeSourceCodeInfo(SourceCodeInfo descriptorProtos$SourceCodeInfo0) {
            descriptorProtos$SourceCodeInfo0.getClass();
            this.sourceCodeInfo_ = this.sourceCodeInfo_ == null || this.sourceCodeInfo_ == SourceCodeInfo.getDefaultInstance() ? descriptorProtos$SourceCodeInfo0 : ((SourceCodeInfo)((com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder)SourceCodeInfo.newBuilder(this.sourceCodeInfo_).mergeFrom(descriptorProtos$SourceCodeInfo0)).buildPartial());
            this.bitField0_ |= 8;
        }

        public static com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder newBuilder() {
            return (com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder)FileDescriptorProto.DEFAULT_INSTANCE.createBuilder();
        }

        public static com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder newBuilder(FileDescriptorProto descriptorProtos$FileDescriptorProto0) {
            return (com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder)FileDescriptorProto.DEFAULT_INSTANCE.createBuilder(descriptorProtos$FileDescriptorProto0);
        }

        public static FileDescriptorProto parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (FileDescriptorProto)GeneratedMessageLite.parseDelimitedFrom(FileDescriptorProto.DEFAULT_INSTANCE, inputStream0);
        }

        public static FileDescriptorProto parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (FileDescriptorProto)GeneratedMessageLite.parseDelimitedFrom(FileDescriptorProto.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static FileDescriptorProto parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (FileDescriptorProto)GeneratedMessageLite.parseFrom(FileDescriptorProto.DEFAULT_INSTANCE, byteString0);
        }

        public static FileDescriptorProto parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (FileDescriptorProto)GeneratedMessageLite.parseFrom(FileDescriptorProto.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static FileDescriptorProto parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (FileDescriptorProto)GeneratedMessageLite.parseFrom(FileDescriptorProto.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static FileDescriptorProto parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (FileDescriptorProto)GeneratedMessageLite.parseFrom(FileDescriptorProto.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static FileDescriptorProto parseFrom(InputStream inputStream0) throws IOException {
            return (FileDescriptorProto)GeneratedMessageLite.parseFrom(FileDescriptorProto.DEFAULT_INSTANCE, inputStream0);
        }

        public static FileDescriptorProto parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (FileDescriptorProto)GeneratedMessageLite.parseFrom(FileDescriptorProto.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static FileDescriptorProto parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (FileDescriptorProto)GeneratedMessageLite.parseFrom(FileDescriptorProto.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static FileDescriptorProto parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (FileDescriptorProto)GeneratedMessageLite.parseFrom(FileDescriptorProto.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static FileDescriptorProto parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (FileDescriptorProto)GeneratedMessageLite.parseFrom(FileDescriptorProto.DEFAULT_INSTANCE, arr_b);
        }

        public static FileDescriptorProto parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (FileDescriptorProto)GeneratedMessageLite.parseFrom(FileDescriptorProto.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return FileDescriptorProto.DEFAULT_INSTANCE.getParserForType();
        }

        private void removeEnumType(int v) {
            this.ensureEnumTypeIsMutable();
            this.enumType_.remove(v);
        }

        private void removeExtension(int v) {
            this.ensureExtensionIsMutable();
            this.extension_.remove(v);
        }

        private void removeMessageType(int v) {
            this.ensureMessageTypeIsMutable();
            this.messageType_.remove(v);
        }

        private void removeService(int v) {
            this.ensureServiceIsMutable();
            this.service_.remove(v);
        }

        private void setDependency(int v, String s) {
            s.getClass();
            this.ensureDependencyIsMutable();
            this.dependency_.set(v, s);
        }

        private void setEnumType(int v, EnumDescriptorProto descriptorProtos$EnumDescriptorProto0) {
            descriptorProtos$EnumDescriptorProto0.getClass();
            this.ensureEnumTypeIsMutable();
            this.enumType_.set(v, descriptorProtos$EnumDescriptorProto0);
        }

        private void setExtension(int v, FieldDescriptorProto descriptorProtos$FieldDescriptorProto0) {
            descriptorProtos$FieldDescriptorProto0.getClass();
            this.ensureExtensionIsMutable();
            this.extension_.set(v, descriptorProtos$FieldDescriptorProto0);
        }

        private void setMessageType(int v, DescriptorProto descriptorProtos$DescriptorProto0) {
            descriptorProtos$DescriptorProto0.getClass();
            this.ensureMessageTypeIsMutable();
            this.messageType_.set(v, descriptorProtos$DescriptorProto0);
        }

        private void setName(String s) {
            s.getClass();
            this.bitField0_ |= 1;
            this.name_ = s;
        }

        private void setNameBytes(ByteString byteString0) {
            this.name_ = byteString0.toStringUtf8();
            this.bitField0_ |= 1;
        }

        private void setOptions(FileOptions descriptorProtos$FileOptions0) {
            descriptorProtos$FileOptions0.getClass();
            this.options_ = descriptorProtos$FileOptions0;
            this.bitField0_ |= 4;
        }

        private void setPackage(String s) {
            s.getClass();
            this.bitField0_ |= 2;
            this.package_ = s;
        }

        private void setPackageBytes(ByteString byteString0) {
            this.package_ = byteString0.toStringUtf8();
            this.bitField0_ |= 2;
        }

        private void setPublicDependency(int v, int v1) {
            this.ensurePublicDependencyIsMutable();
            this.publicDependency_.setInt(v, v1);
        }

        private void setService(int v, ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto0) {
            descriptorProtos$ServiceDescriptorProto0.getClass();
            this.ensureServiceIsMutable();
            this.service_.set(v, descriptorProtos$ServiceDescriptorProto0);
        }

        private void setSourceCodeInfo(SourceCodeInfo descriptorProtos$SourceCodeInfo0) {
            descriptorProtos$SourceCodeInfo0.getClass();
            this.sourceCodeInfo_ = descriptorProtos$SourceCodeInfo0;
            this.bitField0_ |= 8;
        }

        private void setSyntax(String s) {
            s.getClass();
            this.bitField0_ |= 16;
            this.syntax_ = s;
        }

        private void setSyntaxBytes(ByteString byteString0) {
            this.syntax_ = byteString0.toStringUtf8();
            this.bitField0_ |= 16;
        }

        private void setWeakDependency(int v, int v1) {
            this.ensureWeakDependencyIsMutable();
            this.weakDependency_.setInt(v, v1);
        }
    }

    public interface FileDescriptorProtoOrBuilder extends MessageLiteOrBuilder {
        String getDependency(int arg1);

        ByteString getDependencyBytes(int arg1);

        int getDependencyCount();

        List getDependencyList();

        EnumDescriptorProto getEnumType(int arg1);

        int getEnumTypeCount();

        List getEnumTypeList();

        FieldDescriptorProto getExtension(int arg1);

        int getExtensionCount();

        List getExtensionList();

        DescriptorProto getMessageType(int arg1);

        int getMessageTypeCount();

        List getMessageTypeList();

        String getName();

        ByteString getNameBytes();

        FileOptions getOptions();

        String getPackage();

        ByteString getPackageBytes();

        int getPublicDependency(int arg1);

        int getPublicDependencyCount();

        List getPublicDependencyList();

        ServiceDescriptorProto getService(int arg1);

        int getServiceCount();

        List getServiceList();

        SourceCodeInfo getSourceCodeInfo();

        String getSyntax();

        ByteString getSyntaxBytes();

        int getWeakDependency(int arg1);

        int getWeakDependencyCount();

        List getWeakDependencyList();

        boolean hasName();

        boolean hasOptions();

        boolean hasPackage();

        boolean hasSourceCodeInfo();

        boolean hasSyntax();
    }

    public static final class FileDescriptorSet extends GeneratedMessageLite implements FileDescriptorSetOrBuilder {
        public static final class com.google.protobuf.DescriptorProtos.FileDescriptorSet.Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements FileDescriptorSetOrBuilder {
            private com.google.protobuf.DescriptorProtos.FileDescriptorSet.Builder() {
                super(FileDescriptorSet.DEFAULT_INSTANCE);
            }

            com.google.protobuf.DescriptorProtos.FileDescriptorSet.Builder(a descriptorProtos$a0) {
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorSet.Builder addAllFile(Iterable iterable0) {
                this.copyOnWrite();
                ((FileDescriptorSet)this.instance).addAllFile(iterable0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorSet.Builder addFile(int v, com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder descriptorProtos$FileDescriptorProto$Builder0) {
                this.copyOnWrite();
                ((FileDescriptorSet)this.instance).addFile(v, ((FileDescriptorProto)descriptorProtos$FileDescriptorProto$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorSet.Builder addFile(int v, FileDescriptorProto descriptorProtos$FileDescriptorProto0) {
                this.copyOnWrite();
                ((FileDescriptorSet)this.instance).addFile(v, descriptorProtos$FileDescriptorProto0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorSet.Builder addFile(com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder descriptorProtos$FileDescriptorProto$Builder0) {
                this.copyOnWrite();
                ((FileDescriptorSet)this.instance).addFile(((FileDescriptorProto)descriptorProtos$FileDescriptorProto$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorSet.Builder addFile(FileDescriptorProto descriptorProtos$FileDescriptorProto0) {
                this.copyOnWrite();
                ((FileDescriptorSet)this.instance).addFile(descriptorProtos$FileDescriptorProto0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorSet.Builder clearFile() {
                this.copyOnWrite();
                ((FileDescriptorSet)this.instance).clearFile();
                return this;
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorSetOrBuilder
            public FileDescriptorProto getFile(int v) {
                return ((FileDescriptorSet)this.instance).getFile(v);
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorSetOrBuilder
            public int getFileCount() {
                return ((FileDescriptorSet)this.instance).getFileCount();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorSetOrBuilder
            public List getFileList() {
                return DesugarCollections.unmodifiableList(((FileDescriptorSet)this.instance).getFileList());
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorSet.Builder removeFile(int v) {
                this.copyOnWrite();
                ((FileDescriptorSet)this.instance).removeFile(v);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorSet.Builder setFile(int v, com.google.protobuf.DescriptorProtos.FileDescriptorProto.Builder descriptorProtos$FileDescriptorProto$Builder0) {
                this.copyOnWrite();
                ((FileDescriptorSet)this.instance).setFile(v, ((FileDescriptorProto)descriptorProtos$FileDescriptorProto$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileDescriptorSet.Builder setFile(int v, FileDescriptorProto descriptorProtos$FileDescriptorProto0) {
                this.copyOnWrite();
                ((FileDescriptorSet)this.instance).setFile(v, descriptorProtos$FileDescriptorProto0);
                return this;
            }
        }

        private static final FileDescriptorSet DEFAULT_INSTANCE = null;
        public static final int FILE_FIELD_NUMBER = 1;
        private static volatile Parser PARSER;
        private ProtobufList file_;
        private byte memoizedIsInitialized;

        static {
            FileDescriptorSet descriptorProtos$FileDescriptorSet0 = new FileDescriptorSet();
            FileDescriptorSet.DEFAULT_INSTANCE = descriptorProtos$FileDescriptorSet0;
            GeneratedMessageLite.registerDefaultInstance(FileDescriptorSet.class, descriptorProtos$FileDescriptorSet0);
        }

        private FileDescriptorSet() {
            this.memoizedIsInitialized = 2;
            this.file_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void addAllFile(Iterable iterable0) {
            this.ensureFileIsMutable();
            AbstractMessageLite.addAll(iterable0, this.file_);
        }

        private void addFile(int v, FileDescriptorProto descriptorProtos$FileDescriptorProto0) {
            descriptorProtos$FileDescriptorProto0.getClass();
            this.ensureFileIsMutable();
            this.file_.add(v, descriptorProtos$FileDescriptorProto0);
        }

        private void addFile(FileDescriptorProto descriptorProtos$FileDescriptorProto0) {
            descriptorProtos$FileDescriptorProto0.getClass();
            this.ensureFileIsMutable();
            this.file_.add(descriptorProtos$FileDescriptorProto0);
        }

        private void clearFile() {
            this.file_ = GeneratedMessageLite.emptyProtobufList();
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            int v = 1;
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new FileDescriptorSet();
                }
                case 2: {
                    return new com.google.protobuf.DescriptorProtos.FileDescriptorSet.Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(FileDescriptorSet.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"file_", FileDescriptorProto.class});
                }
                case 4: {
                    return FileDescriptorSet.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = FileDescriptorSet.PARSER;
                    if(parser0 == null) {
                        synchronized(FileDescriptorSet.class) {
                            parser0 = FileDescriptorSet.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(FileDescriptorSet.DEFAULT_INSTANCE);
                                FileDescriptorSet.PARSER = parser0;
                            }
                        }
                    }
                    return parser0;
                }
                case 6: {
                    return this.memoizedIsInitialized;
                }
                case 7: {
                    if(object0 == null) {
                        v = 0;
                    }
                    this.memoizedIsInitialized = (byte)v;
                    return null;
                }
                default: {
                    throw new UnsupportedOperationException();
                }
            }
        }

        private void ensureFileIsMutable() {
            ProtobufList internal$ProtobufList0 = this.file_;
            if(!internal$ProtobufList0.isModifiable()) {
                this.file_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
            }
        }

        public static FileDescriptorSet getDefaultInstance() {
            return FileDescriptorSet.DEFAULT_INSTANCE;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorSetOrBuilder
        public FileDescriptorProto getFile(int v) {
            return (FileDescriptorProto)this.file_.get(v);
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorSetOrBuilder
        public int getFileCount() {
            return this.file_.size();
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileDescriptorSetOrBuilder
        public List getFileList() {
            return this.file_;
        }

        public FileDescriptorProtoOrBuilder getFileOrBuilder(int v) {
            return (FileDescriptorProtoOrBuilder)this.file_.get(v);
        }

        public List getFileOrBuilderList() {
            return this.file_;
        }

        public static com.google.protobuf.DescriptorProtos.FileDescriptorSet.Builder newBuilder() {
            return (com.google.protobuf.DescriptorProtos.FileDescriptorSet.Builder)FileDescriptorSet.DEFAULT_INSTANCE.createBuilder();
        }

        public static com.google.protobuf.DescriptorProtos.FileDescriptorSet.Builder newBuilder(FileDescriptorSet descriptorProtos$FileDescriptorSet0) {
            return (com.google.protobuf.DescriptorProtos.FileDescriptorSet.Builder)FileDescriptorSet.DEFAULT_INSTANCE.createBuilder(descriptorProtos$FileDescriptorSet0);
        }

        public static FileDescriptorSet parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (FileDescriptorSet)GeneratedMessageLite.parseDelimitedFrom(FileDescriptorSet.DEFAULT_INSTANCE, inputStream0);
        }

        public static FileDescriptorSet parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (FileDescriptorSet)GeneratedMessageLite.parseDelimitedFrom(FileDescriptorSet.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static FileDescriptorSet parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (FileDescriptorSet)GeneratedMessageLite.parseFrom(FileDescriptorSet.DEFAULT_INSTANCE, byteString0);
        }

        public static FileDescriptorSet parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (FileDescriptorSet)GeneratedMessageLite.parseFrom(FileDescriptorSet.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static FileDescriptorSet parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (FileDescriptorSet)GeneratedMessageLite.parseFrom(FileDescriptorSet.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static FileDescriptorSet parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (FileDescriptorSet)GeneratedMessageLite.parseFrom(FileDescriptorSet.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static FileDescriptorSet parseFrom(InputStream inputStream0) throws IOException {
            return (FileDescriptorSet)GeneratedMessageLite.parseFrom(FileDescriptorSet.DEFAULT_INSTANCE, inputStream0);
        }

        public static FileDescriptorSet parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (FileDescriptorSet)GeneratedMessageLite.parseFrom(FileDescriptorSet.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static FileDescriptorSet parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (FileDescriptorSet)GeneratedMessageLite.parseFrom(FileDescriptorSet.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static FileDescriptorSet parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (FileDescriptorSet)GeneratedMessageLite.parseFrom(FileDescriptorSet.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static FileDescriptorSet parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (FileDescriptorSet)GeneratedMessageLite.parseFrom(FileDescriptorSet.DEFAULT_INSTANCE, arr_b);
        }

        public static FileDescriptorSet parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (FileDescriptorSet)GeneratedMessageLite.parseFrom(FileDescriptorSet.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return FileDescriptorSet.DEFAULT_INSTANCE.getParserForType();
        }

        private void removeFile(int v) {
            this.ensureFileIsMutable();
            this.file_.remove(v);
        }

        private void setFile(int v, FileDescriptorProto descriptorProtos$FileDescriptorProto0) {
            descriptorProtos$FileDescriptorProto0.getClass();
            this.ensureFileIsMutable();
            this.file_.set(v, descriptorProtos$FileDescriptorProto0);
        }
    }

    public interface FileDescriptorSetOrBuilder extends MessageLiteOrBuilder {
        FileDescriptorProto getFile(int arg1);

        int getFileCount();

        List getFileList();
    }

    public static final class FileOptions extends ExtendableMessage implements FileOptionsOrBuilder {
        public static final class com.google.protobuf.DescriptorProtos.FileOptions.Builder extends ExtendableBuilder implements FileOptionsOrBuilder {
            private com.google.protobuf.DescriptorProtos.FileOptions.Builder() {
                super(FileOptions.DEFAULT_INSTANCE);
            }

            com.google.protobuf.DescriptorProtos.FileOptions.Builder(a descriptorProtos$a0) {
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder addAllUninterpretedOption(Iterable iterable0) {
                this.copyOnWrite();
                ((FileOptions)this.instance).addAllUninterpretedOption(iterable0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder addUninterpretedOption(int v, com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder descriptorProtos$UninterpretedOption$Builder0) {
                this.copyOnWrite();
                ((FileOptions)this.instance).addUninterpretedOption(v, ((UninterpretedOption)descriptorProtos$UninterpretedOption$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder addUninterpretedOption(int v, UninterpretedOption descriptorProtos$UninterpretedOption0) {
                this.copyOnWrite();
                ((FileOptions)this.instance).addUninterpretedOption(v, descriptorProtos$UninterpretedOption0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder addUninterpretedOption(com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder descriptorProtos$UninterpretedOption$Builder0) {
                this.copyOnWrite();
                ((FileOptions)this.instance).addUninterpretedOption(((UninterpretedOption)descriptorProtos$UninterpretedOption$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder addUninterpretedOption(UninterpretedOption descriptorProtos$UninterpretedOption0) {
                this.copyOnWrite();
                ((FileOptions)this.instance).addUninterpretedOption(descriptorProtos$UninterpretedOption0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder clearCcEnableArenas() {
                this.copyOnWrite();
                ((FileOptions)this.instance).clearCcEnableArenas();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder clearCcGenericServices() {
                this.copyOnWrite();
                ((FileOptions)this.instance).clearCcGenericServices();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder clearCsharpNamespace() {
                this.copyOnWrite();
                ((FileOptions)this.instance).clearCsharpNamespace();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder clearDeprecated() {
                this.copyOnWrite();
                ((FileOptions)this.instance).clearDeprecated();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder clearGoPackage() {
                this.copyOnWrite();
                ((FileOptions)this.instance).clearGoPackage();
                return this;
            }

            @Deprecated
            public com.google.protobuf.DescriptorProtos.FileOptions.Builder clearJavaGenerateEqualsAndHash() {
                this.copyOnWrite();
                ((FileOptions)this.instance).clearJavaGenerateEqualsAndHash();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder clearJavaGenericServices() {
                this.copyOnWrite();
                ((FileOptions)this.instance).clearJavaGenericServices();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder clearJavaMultipleFiles() {
                this.copyOnWrite();
                ((FileOptions)this.instance).clearJavaMultipleFiles();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder clearJavaOuterClassname() {
                this.copyOnWrite();
                ((FileOptions)this.instance).clearJavaOuterClassname();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder clearJavaPackage() {
                this.copyOnWrite();
                ((FileOptions)this.instance).clearJavaPackage();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder clearJavaStringCheckUtf8() {
                this.copyOnWrite();
                ((FileOptions)this.instance).clearJavaStringCheckUtf8();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder clearObjcClassPrefix() {
                this.copyOnWrite();
                ((FileOptions)this.instance).clearObjcClassPrefix();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder clearOptimizeFor() {
                this.copyOnWrite();
                ((FileOptions)this.instance).clearOptimizeFor();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder clearPhpClassPrefix() {
                this.copyOnWrite();
                ((FileOptions)this.instance).clearPhpClassPrefix();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder clearPhpGenericServices() {
                this.copyOnWrite();
                ((FileOptions)this.instance).clearPhpGenericServices();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder clearPhpMetadataNamespace() {
                this.copyOnWrite();
                ((FileOptions)this.instance).clearPhpMetadataNamespace();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder clearPhpNamespace() {
                this.copyOnWrite();
                ((FileOptions)this.instance).clearPhpNamespace();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder clearPyGenericServices() {
                this.copyOnWrite();
                ((FileOptions)this.instance).clearPyGenericServices();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder clearRubyPackage() {
                this.copyOnWrite();
                ((FileOptions)this.instance).clearRubyPackage();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder clearSwiftPrefix() {
                this.copyOnWrite();
                ((FileOptions)this.instance).clearSwiftPrefix();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder clearUninterpretedOption() {
                this.copyOnWrite();
                ((FileOptions)this.instance).clearUninterpretedOption();
                return this;
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public boolean getCcEnableArenas() {
                return ((FileOptions)this.instance).getCcEnableArenas();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public boolean getCcGenericServices() {
                return ((FileOptions)this.instance).getCcGenericServices();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public String getCsharpNamespace() {
                return ((FileOptions)this.instance).getCsharpNamespace();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public ByteString getCsharpNamespaceBytes() {
                return ((FileOptions)this.instance).getCsharpNamespaceBytes();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public boolean getDeprecated() {
                return ((FileOptions)this.instance).getDeprecated();
            }

            // 去混淆评级： 低(20)
            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public String getGoPackage() {
                return "";
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public ByteString getGoPackageBytes() {
                return ((FileOptions)this.instance).getGoPackageBytes();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            @Deprecated
            public boolean getJavaGenerateEqualsAndHash() {
                return ((FileOptions)this.instance).getJavaGenerateEqualsAndHash();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public boolean getJavaGenericServices() {
                return ((FileOptions)this.instance).getJavaGenericServices();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public boolean getJavaMultipleFiles() {
                return ((FileOptions)this.instance).getJavaMultipleFiles();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public String getJavaOuterClassname() {
                return ((FileOptions)this.instance).getJavaOuterClassname();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public ByteString getJavaOuterClassnameBytes() {
                return ((FileOptions)this.instance).getJavaOuterClassnameBytes();
            }

            // 去混淆评级： 低(20)
            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public String getJavaPackage() {
                return "";
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public ByteString getJavaPackageBytes() {
                return ((FileOptions)this.instance).getJavaPackageBytes();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public boolean getJavaStringCheckUtf8() {
                return ((FileOptions)this.instance).getJavaStringCheckUtf8();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public String getObjcClassPrefix() {
                return ((FileOptions)this.instance).getObjcClassPrefix();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public ByteString getObjcClassPrefixBytes() {
                return ((FileOptions)this.instance).getObjcClassPrefixBytes();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public OptimizeMode getOptimizeFor() {
                return ((FileOptions)this.instance).getOptimizeFor();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public String getPhpClassPrefix() {
                return ((FileOptions)this.instance).getPhpClassPrefix();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public ByteString getPhpClassPrefixBytes() {
                return ((FileOptions)this.instance).getPhpClassPrefixBytes();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public boolean getPhpGenericServices() {
                return ((FileOptions)this.instance).getPhpGenericServices();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public String getPhpMetadataNamespace() {
                return ((FileOptions)this.instance).getPhpMetadataNamespace();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public ByteString getPhpMetadataNamespaceBytes() {
                return ((FileOptions)this.instance).getPhpMetadataNamespaceBytes();
            }

            // 去混淆评级： 低(20)
            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public String getPhpNamespace() {
                return "";
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public ByteString getPhpNamespaceBytes() {
                return ((FileOptions)this.instance).getPhpNamespaceBytes();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public boolean getPyGenericServices() {
                return ((FileOptions)this.instance).getPyGenericServices();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public String getRubyPackage() {
                return ((FileOptions)this.instance).getRubyPackage();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public ByteString getRubyPackageBytes() {
                return ((FileOptions)this.instance).getRubyPackageBytes();
            }

            // 去混淆评级： 低(20)
            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public String getSwiftPrefix() {
                return "";
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public ByteString getSwiftPrefixBytes() {
                return ((FileOptions)this.instance).getSwiftPrefixBytes();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public UninterpretedOption getUninterpretedOption(int v) {
                return ((FileOptions)this.instance).getUninterpretedOption(v);
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public int getUninterpretedOptionCount() {
                return ((FileOptions)this.instance).getUninterpretedOptionCount();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public List getUninterpretedOptionList() {
                return DesugarCollections.unmodifiableList(((FileOptions)this.instance).getUninterpretedOptionList());
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public boolean hasCcEnableArenas() {
                return ((FileOptions)this.instance).hasCcEnableArenas();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public boolean hasCcGenericServices() {
                return ((FileOptions)this.instance).hasCcGenericServices();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public boolean hasCsharpNamespace() {
                return ((FileOptions)this.instance).hasCsharpNamespace();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public boolean hasDeprecated() {
                return ((FileOptions)this.instance).hasDeprecated();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public boolean hasGoPackage() {
                return ((FileOptions)this.instance).hasGoPackage();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            @Deprecated
            public boolean hasJavaGenerateEqualsAndHash() {
                return ((FileOptions)this.instance).hasJavaGenerateEqualsAndHash();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public boolean hasJavaGenericServices() {
                return ((FileOptions)this.instance).hasJavaGenericServices();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public boolean hasJavaMultipleFiles() {
                return ((FileOptions)this.instance).hasJavaMultipleFiles();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public boolean hasJavaOuterClassname() {
                return ((FileOptions)this.instance).hasJavaOuterClassname();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public boolean hasJavaPackage() {
                return ((FileOptions)this.instance).hasJavaPackage();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public boolean hasJavaStringCheckUtf8() {
                return ((FileOptions)this.instance).hasJavaStringCheckUtf8();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public boolean hasObjcClassPrefix() {
                return ((FileOptions)this.instance).hasObjcClassPrefix();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public boolean hasOptimizeFor() {
                return ((FileOptions)this.instance).hasOptimizeFor();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public boolean hasPhpClassPrefix() {
                return ((FileOptions)this.instance).hasPhpClassPrefix();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public boolean hasPhpGenericServices() {
                return ((FileOptions)this.instance).hasPhpGenericServices();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public boolean hasPhpMetadataNamespace() {
                return ((FileOptions)this.instance).hasPhpMetadataNamespace();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public boolean hasPhpNamespace() {
                return ((FileOptions)this.instance).hasPhpNamespace();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public boolean hasPyGenericServices() {
                return ((FileOptions)this.instance).hasPyGenericServices();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public boolean hasRubyPackage() {
                return ((FileOptions)this.instance).hasRubyPackage();
            }

            @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
            public boolean hasSwiftPrefix() {
                return ((FileOptions)this.instance).hasSwiftPrefix();
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder removeUninterpretedOption(int v) {
                this.copyOnWrite();
                ((FileOptions)this.instance).removeUninterpretedOption(v);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder setCcEnableArenas(boolean z) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setCcEnableArenas(z);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder setCcGenericServices(boolean z) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setCcGenericServices(z);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder setCsharpNamespace(String s) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setCsharpNamespace(s);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder setCsharpNamespaceBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setCsharpNamespaceBytes(byteString0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder setDeprecated(boolean z) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setDeprecated(z);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder setGoPackage(String s) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setGoPackage(s);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder setGoPackageBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setGoPackageBytes(byteString0);
                return this;
            }

            @Deprecated
            public com.google.protobuf.DescriptorProtos.FileOptions.Builder setJavaGenerateEqualsAndHash(boolean z) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setJavaGenerateEqualsAndHash(z);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder setJavaGenericServices(boolean z) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setJavaGenericServices(z);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder setJavaMultipleFiles(boolean z) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setJavaMultipleFiles(z);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder setJavaOuterClassname(String s) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setJavaOuterClassname(s);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder setJavaOuterClassnameBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setJavaOuterClassnameBytes(byteString0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder setJavaPackage(String s) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setJavaPackage(s);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder setJavaPackageBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setJavaPackageBytes(byteString0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder setJavaStringCheckUtf8(boolean z) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setJavaStringCheckUtf8(z);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder setObjcClassPrefix(String s) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setObjcClassPrefix(s);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder setObjcClassPrefixBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setObjcClassPrefixBytes(byteString0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder setOptimizeFor(OptimizeMode descriptorProtos$FileOptions$OptimizeMode0) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setOptimizeFor(descriptorProtos$FileOptions$OptimizeMode0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder setPhpClassPrefix(String s) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setPhpClassPrefix(s);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder setPhpClassPrefixBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setPhpClassPrefixBytes(byteString0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder setPhpGenericServices(boolean z) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setPhpGenericServices(z);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder setPhpMetadataNamespace(String s) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setPhpMetadataNamespace(s);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder setPhpMetadataNamespaceBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setPhpMetadataNamespaceBytes(byteString0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder setPhpNamespace(String s) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setPhpNamespace(s);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder setPhpNamespaceBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setPhpNamespaceBytes(byteString0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder setPyGenericServices(boolean z) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setPyGenericServices(z);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder setRubyPackage(String s) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setRubyPackage(s);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder setRubyPackageBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setRubyPackageBytes(byteString0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder setSwiftPrefix(String s) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setSwiftPrefix(s);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder setSwiftPrefixBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setSwiftPrefixBytes(byteString0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder setUninterpretedOption(int v, com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder descriptorProtos$UninterpretedOption$Builder0) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setUninterpretedOption(v, ((UninterpretedOption)descriptorProtos$UninterpretedOption$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.FileOptions.Builder setUninterpretedOption(int v, UninterpretedOption descriptorProtos$UninterpretedOption0) {
                this.copyOnWrite();
                ((FileOptions)this.instance).setUninterpretedOption(v, descriptorProtos$UninterpretedOption0);
                return this;
            }
        }

        public static enum OptimizeMode implements EnumLite {
            class com.google.protobuf.DescriptorProtos.FileOptions.OptimizeMode.a implements EnumLiteMap {
                com.google.protobuf.DescriptorProtos.FileOptions.OptimizeMode.a() {
                    super();
                }

                public OptimizeMode findValueByNumber(int v) {
                    return OptimizeMode.forNumber(v);
                }

                @Override  // com.google.protobuf.Internal$EnumLiteMap
                public EnumLite findValueByNumber(int v) {
                    return this.findValueByNumber(v);
                }
            }

            static final class com.google.protobuf.DescriptorProtos.FileOptions.OptimizeMode.b implements EnumVerifier {
                static final EnumVerifier INSTANCE;

                static {
                    com.google.protobuf.DescriptorProtos.FileOptions.OptimizeMode.b.INSTANCE = new com.google.protobuf.DescriptorProtos.FileOptions.OptimizeMode.b();
                }

                @Override  // com.google.protobuf.Internal$EnumVerifier
                public boolean isInRange(int v) {
                    return OptimizeMode.forNumber(v) != null;
                }
            }

            SPEED(1),
            CODE_SIZE(2),
            LITE_RUNTIME(3);

            public static final int CODE_SIZE_VALUE = 2;
            public static final int LITE_RUNTIME_VALUE = 3;
            public static final int SPEED_VALUE = 1;
            private static final EnumLiteMap internalValueMap;
            private final int value;

            static {
                OptimizeMode.internalValueMap = new com.google.protobuf.DescriptorProtos.FileOptions.OptimizeMode.a();
            }

            private OptimizeMode(int v1) {
                this.value = v1;
            }

            public static OptimizeMode forNumber(int v) {
                switch(v) {
                    case 1: {
                        return OptimizeMode.SPEED;
                    }
                    case 2: {
                        return OptimizeMode.CODE_SIZE;
                    }
                    case 3: {
                        return OptimizeMode.LITE_RUNTIME;
                    }
                    default: {
                        return null;
                    }
                }
            }

            @Override  // com.google.protobuf.Internal$EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static EnumLiteMap internalGetValueMap() {
                return OptimizeMode.internalValueMap;
            }

            public static EnumVerifier internalGetVerifier() {
                return com.google.protobuf.DescriptorProtos.FileOptions.OptimizeMode.b.INSTANCE;
            }

            @Deprecated
            public static OptimizeMode valueOf(int v) {
                return OptimizeMode.forNumber(v);
            }
        }

        public static final int CC_ENABLE_ARENAS_FIELD_NUMBER = 0x1F;
        public static final int CC_GENERIC_SERVICES_FIELD_NUMBER = 16;
        public static final int CSHARP_NAMESPACE_FIELD_NUMBER = 37;
        private static final FileOptions DEFAULT_INSTANCE = null;
        public static final int DEPRECATED_FIELD_NUMBER = 23;
        public static final int GO_PACKAGE_FIELD_NUMBER = 11;
        public static final int JAVA_GENERATE_EQUALS_AND_HASH_FIELD_NUMBER = 20;
        public static final int JAVA_GENERIC_SERVICES_FIELD_NUMBER = 17;
        public static final int JAVA_MULTIPLE_FILES_FIELD_NUMBER = 10;
        public static final int JAVA_OUTER_CLASSNAME_FIELD_NUMBER = 8;
        public static final int JAVA_PACKAGE_FIELD_NUMBER = 1;
        public static final int JAVA_STRING_CHECK_UTF8_FIELD_NUMBER = 27;
        public static final int OBJC_CLASS_PREFIX_FIELD_NUMBER = 36;
        public static final int OPTIMIZE_FOR_FIELD_NUMBER = 9;
        private static volatile Parser PARSER = null;
        public static final int PHP_CLASS_PREFIX_FIELD_NUMBER = 40;
        public static final int PHP_GENERIC_SERVICES_FIELD_NUMBER = 42;
        public static final int PHP_METADATA_NAMESPACE_FIELD_NUMBER = 44;
        public static final int PHP_NAMESPACE_FIELD_NUMBER = 41;
        public static final int PY_GENERIC_SERVICES_FIELD_NUMBER = 18;
        public static final int RUBY_PACKAGE_FIELD_NUMBER = 45;
        public static final int SWIFT_PREFIX_FIELD_NUMBER = 39;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean ccEnableArenas_;
        private boolean ccGenericServices_;
        private String csharpNamespace_;
        private boolean deprecated_;
        private String goPackage_;
        private boolean javaGenerateEqualsAndHash_;
        private boolean javaGenericServices_;
        private boolean javaMultipleFiles_;
        private String javaOuterClassname_;
        private String javaPackage_;
        private boolean javaStringCheckUtf8_;
        private byte memoizedIsInitialized;
        private String objcClassPrefix_;
        private int optimizeFor_;
        private String phpClassPrefix_;
        private boolean phpGenericServices_;
        private String phpMetadataNamespace_;
        private String phpNamespace_;
        private boolean pyGenericServices_;
        private String rubyPackage_;
        private String swiftPrefix_;
        private ProtobufList uninterpretedOption_;

        static {
            FileOptions descriptorProtos$FileOptions0 = new FileOptions();
            FileOptions.DEFAULT_INSTANCE = descriptorProtos$FileOptions0;
            GeneratedMessageLite.registerDefaultInstance(FileOptions.class, descriptorProtos$FileOptions0);
        }

        private FileOptions() {
            this.memoizedIsInitialized = 2;
            this.javaPackage_ = "";
            this.javaOuterClassname_ = "";
            this.optimizeFor_ = 1;
            this.goPackage_ = "";
            this.ccEnableArenas_ = true;
            this.objcClassPrefix_ = "";
            this.csharpNamespace_ = "";
            this.swiftPrefix_ = "";
            this.phpClassPrefix_ = "";
            this.phpNamespace_ = "";
            this.phpMetadataNamespace_ = "";
            this.rubyPackage_ = "";
            this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void addAllUninterpretedOption(Iterable iterable0) {
            this.ensureUninterpretedOptionIsMutable();
            AbstractMessageLite.addAll(iterable0, this.uninterpretedOption_);
        }

        private void addUninterpretedOption(int v, UninterpretedOption descriptorProtos$UninterpretedOption0) {
            descriptorProtos$UninterpretedOption0.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(v, descriptorProtos$UninterpretedOption0);
        }

        private void addUninterpretedOption(UninterpretedOption descriptorProtos$UninterpretedOption0) {
            descriptorProtos$UninterpretedOption0.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(descriptorProtos$UninterpretedOption0);
        }

        private void clearCcEnableArenas() {
            this.bitField0_ &= 0xFFFFEFFF;
            this.ccEnableArenas_ = true;
        }

        private void clearCcGenericServices() {
            this.bitField0_ &= 0xFFFFFF7F;
            this.ccGenericServices_ = false;
        }

        private void clearCsharpNamespace() {
            this.bitField0_ &= 0xFFFFBFFF;
            this.csharpNamespace_ = "";
        }

        private void clearDeprecated() {
            this.bitField0_ &= 0xFFFFF7FF;
            this.deprecated_ = false;
        }

        private void clearGoPackage() {
            this.bitField0_ &= -65;
            this.goPackage_ = "";
        }

        private void clearJavaGenerateEqualsAndHash() {
            this.bitField0_ &= -9;
            this.javaGenerateEqualsAndHash_ = false;
        }

        private void clearJavaGenericServices() {
            this.bitField0_ &= 0xFFFFFEFF;
            this.javaGenericServices_ = false;
        }

        private void clearJavaMultipleFiles() {
            this.bitField0_ &= -5;
            this.javaMultipleFiles_ = false;
        }

        private void clearJavaOuterClassname() {
            this.bitField0_ &= -3;
            this.javaOuterClassname_ = "";
        }

        private void clearJavaPackage() {
            this.bitField0_ &= -2;
            this.javaPackage_ = "";
        }

        private void clearJavaStringCheckUtf8() {
            this.bitField0_ &= -17;
            this.javaStringCheckUtf8_ = false;
        }

        private void clearObjcClassPrefix() {
            this.bitField0_ &= 0xFFFFDFFF;
            this.objcClassPrefix_ = "";
        }

        private void clearOptimizeFor() {
            this.bitField0_ &= -33;
            this.optimizeFor_ = 1;
        }

        private void clearPhpClassPrefix() {
            this.bitField0_ &= 0xFFFEFFFF;
            this.phpClassPrefix_ = FileOptions.getDefaultInstance().getPhpClassPrefix();
        }

        private void clearPhpGenericServices() {
            this.bitField0_ &= 0xFFFFFBFF;
            this.phpGenericServices_ = false;
        }

        private void clearPhpMetadataNamespace() {
            this.bitField0_ &= 0xFFFBFFFF;
            this.phpMetadataNamespace_ = FileOptions.getDefaultInstance().getPhpMetadataNamespace();
        }

        private void clearPhpNamespace() {
            this.bitField0_ &= 0xFFFDFFFF;
            this.phpNamespace_ = FileOptions.getDefaultInstance().getPhpNamespace();
        }

        private void clearPyGenericServices() {
            this.bitField0_ &= 0xFFFFFDFF;
            this.pyGenericServices_ = false;
        }

        private void clearRubyPackage() {
            this.bitField0_ &= 0xFFF7FFFF;
            this.rubyPackage_ = FileOptions.getDefaultInstance().getRubyPackage();
        }

        private void clearSwiftPrefix() {
            this.bitField0_ &= 0xFFFF7FFF;
            this.swiftPrefix_ = "";
        }

        private void clearUninterpretedOption() {
            this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            int v = 1;
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new FileOptions();
                }
                case 2: {
                    return new com.google.protobuf.DescriptorProtos.FileOptions.Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(FileOptions.DEFAULT_INSTANCE, "\u0001\u0015\u0000\u0001\u0001ϧ\u0015\u0000\u0001\u0001\u0001ဈ\u0000\bဈ\u0001\tဌ\u0005\nဇ\u0002\u000Bဈ\u0006\u0010ဇ\u0007\u0011ဇ\b\u0012ဇ\t\u0014ဇ\u0003\u0017ဇ\u000B\u001Bဇ\u0004\u001Fဇ\f$ဈ\r%ဈ\u000E\'ဈ\u000F(ဈ\u0010)ဈ\u0011*ဇ\n,ဈ\u0012-ဈ\u0013ϧЛ", new Object[]{"bitField0_", "javaPackage_", "javaOuterClassname_", "optimizeFor_", OptimizeMode.internalGetVerifier(), "javaMultipleFiles_", "goPackage_", "ccGenericServices_", "javaGenericServices_", "pyGenericServices_", "javaGenerateEqualsAndHash_", "deprecated_", "javaStringCheckUtf8_", "ccEnableArenas_", "objcClassPrefix_", "csharpNamespace_", "swiftPrefix_", "phpClassPrefix_", "phpNamespace_", "phpGenericServices_", "phpMetadataNamespace_", "rubyPackage_", "uninterpretedOption_", UninterpretedOption.class});
                }
                case 4: {
                    return FileOptions.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = FileOptions.PARSER;
                    if(parser0 == null) {
                        synchronized(FileOptions.class) {
                            parser0 = FileOptions.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(FileOptions.DEFAULT_INSTANCE);
                                FileOptions.PARSER = parser0;
                            }
                        }
                    }
                    return parser0;
                }
                case 6: {
                    return this.memoizedIsInitialized;
                }
                case 7: {
                    if(object0 == null) {
                        v = 0;
                    }
                    this.memoizedIsInitialized = (byte)v;
                    return null;
                }
                default: {
                    throw new UnsupportedOperationException();
                }
            }
        }

        private void ensureUninterpretedOptionIsMutable() {
            ProtobufList internal$ProtobufList0 = this.uninterpretedOption_;
            if(!internal$ProtobufList0.isModifiable()) {
                this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
            }
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean getCcEnableArenas() {
            return this.ccEnableArenas_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean getCcGenericServices() {
            return this.ccGenericServices_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public String getCsharpNamespace() {
            return this.csharpNamespace_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public ByteString getCsharpNamespaceBytes() {
            return ByteString.copyFromUtf8(this.csharpNamespace_);
        }

        public static FileOptions getDefaultInstance() {
            return FileOptions.DEFAULT_INSTANCE;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public String getGoPackage() [...] // 潜在的解密器

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public ByteString getGoPackageBytes() {
            return ByteString.copyFromUtf8(this.goPackage_);
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        @Deprecated
        public boolean getJavaGenerateEqualsAndHash() {
            return this.javaGenerateEqualsAndHash_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean getJavaGenericServices() {
            return this.javaGenericServices_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean getJavaMultipleFiles() {
            return this.javaMultipleFiles_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public String getJavaOuterClassname() {
            return this.javaOuterClassname_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public ByteString getJavaOuterClassnameBytes() {
            return ByteString.copyFromUtf8(this.javaOuterClassname_);
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public String getJavaPackage() [...] // 潜在的解密器

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public ByteString getJavaPackageBytes() {
            return ByteString.copyFromUtf8(this.javaPackage_);
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean getJavaStringCheckUtf8() {
            return this.javaStringCheckUtf8_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public String getObjcClassPrefix() {
            return this.objcClassPrefix_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public ByteString getObjcClassPrefixBytes() {
            return ByteString.copyFromUtf8(this.objcClassPrefix_);
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public OptimizeMode getOptimizeFor() {
            OptimizeMode descriptorProtos$FileOptions$OptimizeMode0 = OptimizeMode.forNumber(this.optimizeFor_);
            return descriptorProtos$FileOptions$OptimizeMode0 == null ? OptimizeMode.SPEED : descriptorProtos$FileOptions$OptimizeMode0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public String getPhpClassPrefix() {
            return this.phpClassPrefix_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public ByteString getPhpClassPrefixBytes() {
            return ByteString.copyFromUtf8(this.phpClassPrefix_);
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean getPhpGenericServices() {
            return this.phpGenericServices_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public String getPhpMetadataNamespace() {
            return this.phpMetadataNamespace_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public ByteString getPhpMetadataNamespaceBytes() {
            return ByteString.copyFromUtf8(this.phpMetadataNamespace_);
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public String getPhpNamespace() [...] // 潜在的解密器

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public ByteString getPhpNamespaceBytes() {
            return ByteString.copyFromUtf8(this.phpNamespace_);
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean getPyGenericServices() {
            return this.pyGenericServices_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public String getRubyPackage() {
            return this.rubyPackage_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public ByteString getRubyPackageBytes() {
            return ByteString.copyFromUtf8(this.rubyPackage_);
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public String getSwiftPrefix() [...] // 潜在的解密器

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public ByteString getSwiftPrefixBytes() {
            return ByteString.copyFromUtf8(this.swiftPrefix_);
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public UninterpretedOption getUninterpretedOption(int v) {
            return (UninterpretedOption)this.uninterpretedOption_.get(v);
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public List getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int v) {
            return (UninterpretedOptionOrBuilder)this.uninterpretedOption_.get(v);
        }

        public List getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasCcEnableArenas() {
            return (this.bitField0_ & 0x1000) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasCcGenericServices() {
            return (this.bitField0_ & 0x80) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasCsharpNamespace() {
            return (this.bitField0_ & 0x4000) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasDeprecated() {
            return (this.bitField0_ & 0x800) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasGoPackage() {
            return (this.bitField0_ & 0x40) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        @Deprecated
        public boolean hasJavaGenerateEqualsAndHash() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasJavaGenericServices() {
            return (this.bitField0_ & 0x100) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasJavaMultipleFiles() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasJavaOuterClassname() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasJavaPackage() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasJavaStringCheckUtf8() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasObjcClassPrefix() {
            return (this.bitField0_ & 0x2000) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasOptimizeFor() {
            return (this.bitField0_ & 0x20) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasPhpClassPrefix() {
            return (this.bitField0_ & 0x10000) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasPhpGenericServices() {
            return (this.bitField0_ & 0x400) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasPhpMetadataNamespace() {
            return (this.bitField0_ & 0x40000) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasPhpNamespace() {
            return (this.bitField0_ & 0x20000) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasPyGenericServices() {
            return (this.bitField0_ & 0x200) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasRubyPackage() {
            return (this.bitField0_ & 0x80000) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasSwiftPrefix() {
            return (this.bitField0_ & 0x8000) != 0;
        }

        public static com.google.protobuf.DescriptorProtos.FileOptions.Builder newBuilder() {
            return (com.google.protobuf.DescriptorProtos.FileOptions.Builder)FileOptions.DEFAULT_INSTANCE.createBuilder();
        }

        public static com.google.protobuf.DescriptorProtos.FileOptions.Builder newBuilder(FileOptions descriptorProtos$FileOptions0) {
            return (com.google.protobuf.DescriptorProtos.FileOptions.Builder)FileOptions.DEFAULT_INSTANCE.createBuilder(descriptorProtos$FileOptions0);
        }

        public static FileOptions parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (FileOptions)GeneratedMessageLite.parseDelimitedFrom(FileOptions.DEFAULT_INSTANCE, inputStream0);
        }

        public static FileOptions parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (FileOptions)GeneratedMessageLite.parseDelimitedFrom(FileOptions.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static FileOptions parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (FileOptions)GeneratedMessageLite.parseFrom(FileOptions.DEFAULT_INSTANCE, byteString0);
        }

        public static FileOptions parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (FileOptions)GeneratedMessageLite.parseFrom(FileOptions.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static FileOptions parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (FileOptions)GeneratedMessageLite.parseFrom(FileOptions.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static FileOptions parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (FileOptions)GeneratedMessageLite.parseFrom(FileOptions.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static FileOptions parseFrom(InputStream inputStream0) throws IOException {
            return (FileOptions)GeneratedMessageLite.parseFrom(FileOptions.DEFAULT_INSTANCE, inputStream0);
        }

        public static FileOptions parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (FileOptions)GeneratedMessageLite.parseFrom(FileOptions.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static FileOptions parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (FileOptions)GeneratedMessageLite.parseFrom(FileOptions.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static FileOptions parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (FileOptions)GeneratedMessageLite.parseFrom(FileOptions.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static FileOptions parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (FileOptions)GeneratedMessageLite.parseFrom(FileOptions.DEFAULT_INSTANCE, arr_b);
        }

        public static FileOptions parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (FileOptions)GeneratedMessageLite.parseFrom(FileOptions.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return FileOptions.DEFAULT_INSTANCE.getParserForType();
        }

        private void removeUninterpretedOption(int v) {
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(v);
        }

        private void setCcEnableArenas(boolean z) {
            this.bitField0_ |= 0x1000;
            this.ccEnableArenas_ = z;
        }

        private void setCcGenericServices(boolean z) {
            this.bitField0_ |= 0x80;
            this.ccGenericServices_ = z;
        }

        private void setCsharpNamespace(String s) {
            s.getClass();
            this.bitField0_ |= 0x4000;
            this.csharpNamespace_ = s;
        }

        private void setCsharpNamespaceBytes(ByteString byteString0) {
            this.csharpNamespace_ = byteString0.toStringUtf8();
            this.bitField0_ |= 0x4000;
        }

        private void setDeprecated(boolean z) {
            this.bitField0_ |= 0x800;
            this.deprecated_ = z;
        }

        private void setGoPackage(String s) {
            s.getClass();
            this.bitField0_ |= 0x40;
            this.goPackage_ = s;
        }

        private void setGoPackageBytes(ByteString byteString0) {
            this.goPackage_ = byteString0.toStringUtf8();
            this.bitField0_ |= 0x40;
        }

        private void setJavaGenerateEqualsAndHash(boolean z) {
            this.bitField0_ |= 8;
            this.javaGenerateEqualsAndHash_ = z;
        }

        private void setJavaGenericServices(boolean z) {
            this.bitField0_ |= 0x100;
            this.javaGenericServices_ = z;
        }

        private void setJavaMultipleFiles(boolean z) {
            this.bitField0_ |= 4;
            this.javaMultipleFiles_ = z;
        }

        private void setJavaOuterClassname(String s) {
            s.getClass();
            this.bitField0_ |= 2;
            this.javaOuterClassname_ = s;
        }

        private void setJavaOuterClassnameBytes(ByteString byteString0) {
            this.javaOuterClassname_ = byteString0.toStringUtf8();
            this.bitField0_ |= 2;
        }

        private void setJavaPackage(String s) {
            s.getClass();
            this.bitField0_ |= 1;
            this.javaPackage_ = s;
        }

        private void setJavaPackageBytes(ByteString byteString0) {
            this.javaPackage_ = byteString0.toStringUtf8();
            this.bitField0_ |= 1;
        }

        private void setJavaStringCheckUtf8(boolean z) {
            this.bitField0_ |= 16;
            this.javaStringCheckUtf8_ = z;
        }

        private void setObjcClassPrefix(String s) {
            s.getClass();
            this.bitField0_ |= 0x2000;
            this.objcClassPrefix_ = s;
        }

        private void setObjcClassPrefixBytes(ByteString byteString0) {
            this.objcClassPrefix_ = byteString0.toStringUtf8();
            this.bitField0_ |= 0x2000;
        }

        private void setOptimizeFor(OptimizeMode descriptorProtos$FileOptions$OptimizeMode0) {
            this.optimizeFor_ = descriptorProtos$FileOptions$OptimizeMode0.getNumber();
            this.bitField0_ |= 0x20;
        }

        private void setPhpClassPrefix(String s) {
            s.getClass();
            this.bitField0_ |= 0x10000;
            this.phpClassPrefix_ = s;
        }

        private void setPhpClassPrefixBytes(ByteString byteString0) {
            this.phpClassPrefix_ = byteString0.toStringUtf8();
            this.bitField0_ |= 0x10000;
        }

        private void setPhpGenericServices(boolean z) {
            this.bitField0_ |= 0x400;
            this.phpGenericServices_ = z;
        }

        private void setPhpMetadataNamespace(String s) {
            s.getClass();
            this.bitField0_ |= 0x40000;
            this.phpMetadataNamespace_ = s;
        }

        private void setPhpMetadataNamespaceBytes(ByteString byteString0) {
            this.phpMetadataNamespace_ = byteString0.toStringUtf8();
            this.bitField0_ |= 0x40000;
        }

        private void setPhpNamespace(String s) {
            s.getClass();
            this.bitField0_ |= 0x20000;
            this.phpNamespace_ = s;
        }

        private void setPhpNamespaceBytes(ByteString byteString0) {
            this.phpNamespace_ = byteString0.toStringUtf8();
            this.bitField0_ |= 0x20000;
        }

        private void setPyGenericServices(boolean z) {
            this.bitField0_ |= 0x200;
            this.pyGenericServices_ = z;
        }

        private void setRubyPackage(String s) {
            s.getClass();
            this.bitField0_ |= 0x80000;
            this.rubyPackage_ = s;
        }

        private void setRubyPackageBytes(ByteString byteString0) {
            this.rubyPackage_ = byteString0.toStringUtf8();
            this.bitField0_ |= 0x80000;
        }

        private void setSwiftPrefix(String s) {
            s.getClass();
            this.bitField0_ |= 0x8000;
            this.swiftPrefix_ = s;
        }

        private void setSwiftPrefixBytes(ByteString byteString0) {
            this.swiftPrefix_ = byteString0.toStringUtf8();
            this.bitField0_ |= 0x8000;
        }

        private void setUninterpretedOption(int v, UninterpretedOption descriptorProtos$UninterpretedOption0) {
            descriptorProtos$UninterpretedOption0.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(v, descriptorProtos$UninterpretedOption0);
        }
    }

    public interface FileOptionsOrBuilder extends ExtendableMessageOrBuilder {
        boolean getCcEnableArenas();

        boolean getCcGenericServices();

        String getCsharpNamespace();

        ByteString getCsharpNamespaceBytes();

        boolean getDeprecated();

        String getGoPackage();

        ByteString getGoPackageBytes();

        @Deprecated
        boolean getJavaGenerateEqualsAndHash();

        boolean getJavaGenericServices();

        boolean getJavaMultipleFiles();

        String getJavaOuterClassname();

        ByteString getJavaOuterClassnameBytes();

        String getJavaPackage();

        ByteString getJavaPackageBytes();

        boolean getJavaStringCheckUtf8();

        String getObjcClassPrefix();

        ByteString getObjcClassPrefixBytes();

        OptimizeMode getOptimizeFor();

        String getPhpClassPrefix();

        ByteString getPhpClassPrefixBytes();

        boolean getPhpGenericServices();

        String getPhpMetadataNamespace();

        ByteString getPhpMetadataNamespaceBytes();

        String getPhpNamespace();

        ByteString getPhpNamespaceBytes();

        boolean getPyGenericServices();

        String getRubyPackage();

        ByteString getRubyPackageBytes();

        String getSwiftPrefix();

        ByteString getSwiftPrefixBytes();

        UninterpretedOption getUninterpretedOption(int arg1);

        int getUninterpretedOptionCount();

        List getUninterpretedOptionList();

        boolean hasCcEnableArenas();

        boolean hasCcGenericServices();

        boolean hasCsharpNamespace();

        boolean hasDeprecated();

        boolean hasGoPackage();

        @Deprecated
        boolean hasJavaGenerateEqualsAndHash();

        boolean hasJavaGenericServices();

        boolean hasJavaMultipleFiles();

        boolean hasJavaOuterClassname();

        boolean hasJavaPackage();

        boolean hasJavaStringCheckUtf8();

        boolean hasObjcClassPrefix();

        boolean hasOptimizeFor();

        boolean hasPhpClassPrefix();

        boolean hasPhpGenericServices();

        boolean hasPhpMetadataNamespace();

        boolean hasPhpNamespace();

        boolean hasPyGenericServices();

        boolean hasRubyPackage();

        boolean hasSwiftPrefix();
    }

    public static final class GeneratedCodeInfo extends GeneratedMessageLite implements GeneratedCodeInfoOrBuilder {
        public static final class Annotation extends GeneratedMessageLite implements AnnotationOrBuilder {
            public static final class com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Annotation.Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements AnnotationOrBuilder {
                private com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Annotation.Builder() {
                    super(Annotation.DEFAULT_INSTANCE);
                }

                com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Annotation.Builder(a descriptorProtos$a0) {
                }

                public com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Annotation.Builder addAllPath(Iterable iterable0) {
                    this.copyOnWrite();
                    ((Annotation)this.instance).addAllPath(iterable0);
                    return this;
                }

                public com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Annotation.Builder addPath(int v) {
                    this.copyOnWrite();
                    ((Annotation)this.instance).addPath(v);
                    return this;
                }

                public com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Annotation.Builder clearBegin() {
                    this.copyOnWrite();
                    ((Annotation)this.instance).clearBegin();
                    return this;
                }

                public com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Annotation.Builder clearEnd() {
                    this.copyOnWrite();
                    ((Annotation)this.instance).clearEnd();
                    return this;
                }

                public com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Annotation.Builder clearPath() {
                    this.copyOnWrite();
                    ((Annotation)this.instance).clearPath();
                    return this;
                }

                public com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Annotation.Builder clearSourceFile() {
                    this.copyOnWrite();
                    ((Annotation)this.instance).clearSourceFile();
                    return this;
                }

                @Override  // com.google.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder
                public int getBegin() {
                    return ((Annotation)this.instance).getBegin();
                }

                @Override  // com.google.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder
                public int getEnd() {
                    return ((Annotation)this.instance).getEnd();
                }

                @Override  // com.google.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder
                public int getPath(int v) {
                    return ((Annotation)this.instance).getPath(v);
                }

                @Override  // com.google.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder
                public int getPathCount() {
                    return ((Annotation)this.instance).getPathCount();
                }

                @Override  // com.google.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder
                public List getPathList() {
                    return DesugarCollections.unmodifiableList(((Annotation)this.instance).getPathList());
                }

                @Override  // com.google.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder
                public String getSourceFile() {
                    return ((Annotation)this.instance).getSourceFile();
                }

                @Override  // com.google.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder
                public ByteString getSourceFileBytes() {
                    return ((Annotation)this.instance).getSourceFileBytes();
                }

                @Override  // com.google.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder
                public boolean hasBegin() {
                    return ((Annotation)this.instance).hasBegin();
                }

                @Override  // com.google.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder
                public boolean hasEnd() {
                    return ((Annotation)this.instance).hasEnd();
                }

                @Override  // com.google.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder
                public boolean hasSourceFile() {
                    return ((Annotation)this.instance).hasSourceFile();
                }

                public com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Annotation.Builder setBegin(int v) {
                    this.copyOnWrite();
                    ((Annotation)this.instance).setBegin(v);
                    return this;
                }

                public com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Annotation.Builder setEnd(int v) {
                    this.copyOnWrite();
                    ((Annotation)this.instance).setEnd(v);
                    return this;
                }

                public com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Annotation.Builder setPath(int v, int v1) {
                    this.copyOnWrite();
                    ((Annotation)this.instance).setPath(v, v1);
                    return this;
                }

                public com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Annotation.Builder setSourceFile(String s) {
                    this.copyOnWrite();
                    ((Annotation)this.instance).setSourceFile(s);
                    return this;
                }

                public com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Annotation.Builder setSourceFileBytes(ByteString byteString0) {
                    this.copyOnWrite();
                    ((Annotation)this.instance).setSourceFileBytes(byteString0);
                    return this;
                }
            }

            public static final int BEGIN_FIELD_NUMBER = 3;
            private static final Annotation DEFAULT_INSTANCE = null;
            public static final int END_FIELD_NUMBER = 4;
            private static volatile Parser PARSER = null;
            public static final int PATH_FIELD_NUMBER = 1;
            public static final int SOURCE_FILE_FIELD_NUMBER = 2;
            private int begin_;
            private int bitField0_;
            private int end_;
            private int pathMemoizedSerializedSize;
            private IntList path_;
            private String sourceFile_;

            static {
                Annotation descriptorProtos$GeneratedCodeInfo$Annotation0 = new Annotation();
                Annotation.DEFAULT_INSTANCE = descriptorProtos$GeneratedCodeInfo$Annotation0;
                GeneratedMessageLite.registerDefaultInstance(Annotation.class, descriptorProtos$GeneratedCodeInfo$Annotation0);
            }

            private Annotation() {
                this.pathMemoizedSerializedSize = -1;
                this.path_ = GeneratedMessageLite.emptyIntList();
                this.sourceFile_ = "";
            }

            private void addAllPath(Iterable iterable0) {
                this.ensurePathIsMutable();
                AbstractMessageLite.addAll(iterable0, this.path_);
            }

            private void addPath(int v) {
                this.ensurePathIsMutable();
                this.path_.addInt(v);
            }

            private void clearBegin() {
                this.bitField0_ &= -3;
                this.begin_ = 0;
            }

            private void clearEnd() {
                this.bitField0_ &= -5;
                this.end_ = 0;
            }

            private void clearPath() {
                this.path_ = GeneratedMessageLite.emptyIntList();
            }

            private void clearSourceFile() {
                this.bitField0_ &= -2;
                this.sourceFile_ = "";
            }

            @Override  // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
                switch(generatedMessageLite$MethodToInvoke0) {
                    case 1: {
                        return new Annotation();
                    }
                    case 2: {
                        return new com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Annotation.Builder(null);
                    }
                    case 3: {
                        return GeneratedMessageLite.newMessageInfo(Annotation.DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\'\u0002ဈ\u0000\u0003င\u0001\u0004င\u0002", new Object[]{"bitField0_", "path_", "sourceFile_", "begin_", "end_"});
                    }
                    case 4: {
                        return Annotation.DEFAULT_INSTANCE;
                    }
                    case 5: {
                        Parser parser0 = Annotation.PARSER;
                        if(parser0 == null) {
                            Class class0 = Annotation.class;
                            synchronized(class0) {
                                parser0 = Annotation.PARSER;
                                if(parser0 == null) {
                                    parser0 = new DefaultInstanceBasedParser(Annotation.DEFAULT_INSTANCE);
                                    Annotation.PARSER = parser0;
                                }
                            }
                        }
                        return parser0;
                    }
                    case 6: {
                        return (byte)1;
                    }
                    case 7: {
                        return null;
                    }
                    default: {
                        throw new UnsupportedOperationException();
                    }
                }
            }

            private void ensurePathIsMutable() {
                IntList internal$IntList0 = this.path_;
                if(!internal$IntList0.isModifiable()) {
                    this.path_ = GeneratedMessageLite.mutableCopy(internal$IntList0);
                }
            }

            @Override  // com.google.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder
            public int getBegin() {
                return this.begin_;
            }

            public static Annotation getDefaultInstance() {
                return Annotation.DEFAULT_INSTANCE;
            }

            @Override  // com.google.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder
            public int getEnd() {
                return this.end_;
            }

            @Override  // com.google.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder
            public int getPath(int v) {
                return this.path_.getInt(v);
            }

            @Override  // com.google.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder
            public int getPathCount() {
                return this.path_.size();
            }

            @Override  // com.google.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder
            public List getPathList() {
                return this.path_;
            }

            @Override  // com.google.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder
            public String getSourceFile() {
                return this.sourceFile_;
            }

            @Override  // com.google.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder
            public ByteString getSourceFileBytes() {
                return ByteString.copyFromUtf8(this.sourceFile_);
            }

            @Override  // com.google.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder
            public boolean hasBegin() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override  // com.google.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder
            public boolean hasEnd() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override  // com.google.protobuf.DescriptorProtos$GeneratedCodeInfo$AnnotationOrBuilder
            public boolean hasSourceFile() {
                return (this.bitField0_ & 1) != 0;
            }

            public static com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Annotation.Builder newBuilder() {
                return (com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Annotation.Builder)Annotation.DEFAULT_INSTANCE.createBuilder();
            }

            public static com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Annotation.Builder newBuilder(Annotation descriptorProtos$GeneratedCodeInfo$Annotation0) {
                return (com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Annotation.Builder)Annotation.DEFAULT_INSTANCE.createBuilder(descriptorProtos$GeneratedCodeInfo$Annotation0);
            }

            public static Annotation parseDelimitedFrom(InputStream inputStream0) throws IOException {
                return (Annotation)GeneratedMessageLite.parseDelimitedFrom(Annotation.DEFAULT_INSTANCE, inputStream0);
            }

            public static Annotation parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return (Annotation)GeneratedMessageLite.parseDelimitedFrom(Annotation.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
            }

            public static Annotation parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
                return (Annotation)GeneratedMessageLite.parseFrom(Annotation.DEFAULT_INSTANCE, byteString0);
            }

            public static Annotation parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
                return (Annotation)GeneratedMessageLite.parseFrom(Annotation.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
            }

            public static Annotation parseFrom(CodedInputStream codedInputStream0) throws IOException {
                return (Annotation)GeneratedMessageLite.parseFrom(Annotation.DEFAULT_INSTANCE, codedInputStream0);
            }

            public static Annotation parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return (Annotation)GeneratedMessageLite.parseFrom(Annotation.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
            }

            public static Annotation parseFrom(InputStream inputStream0) throws IOException {
                return (Annotation)GeneratedMessageLite.parseFrom(Annotation.DEFAULT_INSTANCE, inputStream0);
            }

            public static Annotation parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return (Annotation)GeneratedMessageLite.parseFrom(Annotation.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
            }

            public static Annotation parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
                return (Annotation)GeneratedMessageLite.parseFrom(Annotation.DEFAULT_INSTANCE, byteBuffer0);
            }

            public static Annotation parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
                return (Annotation)GeneratedMessageLite.parseFrom(Annotation.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
            }

            public static Annotation parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
                return (Annotation)GeneratedMessageLite.parseFrom(Annotation.DEFAULT_INSTANCE, arr_b);
            }

            public static Annotation parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
                return (Annotation)GeneratedMessageLite.parseFrom(Annotation.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
            }

            public static Parser parser() {
                return Annotation.DEFAULT_INSTANCE.getParserForType();
            }

            private void setBegin(int v) {
                this.bitField0_ |= 2;
                this.begin_ = v;
            }

            private void setEnd(int v) {
                this.bitField0_ |= 4;
                this.end_ = v;
            }

            private void setPath(int v, int v1) {
                this.ensurePathIsMutable();
                this.path_.setInt(v, v1);
            }

            private void setSourceFile(String s) {
                s.getClass();
                this.bitField0_ |= 1;
                this.sourceFile_ = s;
            }

            private void setSourceFileBytes(ByteString byteString0) {
                this.sourceFile_ = byteString0.toStringUtf8();
                this.bitField0_ |= 1;
            }
        }

        public interface AnnotationOrBuilder extends MessageLiteOrBuilder {
            int getBegin();

            int getEnd();

            int getPath(int arg1);

            int getPathCount();

            List getPathList();

            String getSourceFile();

            ByteString getSourceFileBytes();

            boolean hasBegin();

            boolean hasEnd();

            boolean hasSourceFile();
        }

        public static final class com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements GeneratedCodeInfoOrBuilder {
            private com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Builder() {
                super(GeneratedCodeInfo.DEFAULT_INSTANCE);
            }

            com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Builder(a descriptorProtos$a0) {
            }

            public com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Builder addAllAnnotation(Iterable iterable0) {
                this.copyOnWrite();
                ((GeneratedCodeInfo)this.instance).addAllAnnotation(iterable0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Builder addAnnotation(int v, com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Annotation.Builder descriptorProtos$GeneratedCodeInfo$Annotation$Builder0) {
                this.copyOnWrite();
                ((GeneratedCodeInfo)this.instance).addAnnotation(v, ((Annotation)descriptorProtos$GeneratedCodeInfo$Annotation$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Builder addAnnotation(int v, Annotation descriptorProtos$GeneratedCodeInfo$Annotation0) {
                this.copyOnWrite();
                ((GeneratedCodeInfo)this.instance).addAnnotation(v, descriptorProtos$GeneratedCodeInfo$Annotation0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Builder addAnnotation(com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Annotation.Builder descriptorProtos$GeneratedCodeInfo$Annotation$Builder0) {
                this.copyOnWrite();
                ((GeneratedCodeInfo)this.instance).addAnnotation(((Annotation)descriptorProtos$GeneratedCodeInfo$Annotation$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Builder addAnnotation(Annotation descriptorProtos$GeneratedCodeInfo$Annotation0) {
                this.copyOnWrite();
                ((GeneratedCodeInfo)this.instance).addAnnotation(descriptorProtos$GeneratedCodeInfo$Annotation0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Builder clearAnnotation() {
                this.copyOnWrite();
                ((GeneratedCodeInfo)this.instance).clearAnnotation();
                return this;
            }

            @Override  // com.google.protobuf.DescriptorProtos$GeneratedCodeInfoOrBuilder
            public Annotation getAnnotation(int v) {
                return ((GeneratedCodeInfo)this.instance).getAnnotation(v);
            }

            @Override  // com.google.protobuf.DescriptorProtos$GeneratedCodeInfoOrBuilder
            public int getAnnotationCount() {
                return ((GeneratedCodeInfo)this.instance).getAnnotationCount();
            }

            @Override  // com.google.protobuf.DescriptorProtos$GeneratedCodeInfoOrBuilder
            public List getAnnotationList() {
                return DesugarCollections.unmodifiableList(((GeneratedCodeInfo)this.instance).getAnnotationList());
            }

            public com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Builder removeAnnotation(int v) {
                this.copyOnWrite();
                ((GeneratedCodeInfo)this.instance).removeAnnotation(v);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Builder setAnnotation(int v, com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Annotation.Builder descriptorProtos$GeneratedCodeInfo$Annotation$Builder0) {
                this.copyOnWrite();
                ((GeneratedCodeInfo)this.instance).setAnnotation(v, ((Annotation)descriptorProtos$GeneratedCodeInfo$Annotation$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Builder setAnnotation(int v, Annotation descriptorProtos$GeneratedCodeInfo$Annotation0) {
                this.copyOnWrite();
                ((GeneratedCodeInfo)this.instance).setAnnotation(v, descriptorProtos$GeneratedCodeInfo$Annotation0);
                return this;
            }
        }

        public static final int ANNOTATION_FIELD_NUMBER = 1;
        private static final GeneratedCodeInfo DEFAULT_INSTANCE;
        private static volatile Parser PARSER;
        private ProtobufList annotation_;

        static {
            GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo0 = new GeneratedCodeInfo();
            GeneratedCodeInfo.DEFAULT_INSTANCE = descriptorProtos$GeneratedCodeInfo0;
            GeneratedMessageLite.registerDefaultInstance(GeneratedCodeInfo.class, descriptorProtos$GeneratedCodeInfo0);
        }

        private GeneratedCodeInfo() {
            this.annotation_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void addAllAnnotation(Iterable iterable0) {
            this.ensureAnnotationIsMutable();
            AbstractMessageLite.addAll(iterable0, this.annotation_);
        }

        private void addAnnotation(int v, Annotation descriptorProtos$GeneratedCodeInfo$Annotation0) {
            descriptorProtos$GeneratedCodeInfo$Annotation0.getClass();
            this.ensureAnnotationIsMutable();
            this.annotation_.add(v, descriptorProtos$GeneratedCodeInfo$Annotation0);
        }

        private void addAnnotation(Annotation descriptorProtos$GeneratedCodeInfo$Annotation0) {
            descriptorProtos$GeneratedCodeInfo$Annotation0.getClass();
            this.ensureAnnotationIsMutable();
            this.annotation_.add(descriptorProtos$GeneratedCodeInfo$Annotation0);
        }

        private void clearAnnotation() {
            this.annotation_ = GeneratedMessageLite.emptyProtobufList();
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new GeneratedCodeInfo();
                }
                case 2: {
                    return new com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(GeneratedCodeInfo.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"annotation_", Annotation.class});
                }
                case 4: {
                    return GeneratedCodeInfo.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = GeneratedCodeInfo.PARSER;
                    if(parser0 == null) {
                        Class class0 = GeneratedCodeInfo.class;
                        synchronized(class0) {
                            parser0 = GeneratedCodeInfo.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(GeneratedCodeInfo.DEFAULT_INSTANCE);
                                GeneratedCodeInfo.PARSER = parser0;
                            }
                        }
                    }
                    return parser0;
                }
                case 6: {
                    return (byte)1;
                }
                case 7: {
                    return null;
                }
                default: {
                    throw new UnsupportedOperationException();
                }
            }
        }

        private void ensureAnnotationIsMutable() {
            ProtobufList internal$ProtobufList0 = this.annotation_;
            if(!internal$ProtobufList0.isModifiable()) {
                this.annotation_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
            }
        }

        @Override  // com.google.protobuf.DescriptorProtos$GeneratedCodeInfoOrBuilder
        public Annotation getAnnotation(int v) {
            return (Annotation)this.annotation_.get(v);
        }

        @Override  // com.google.protobuf.DescriptorProtos$GeneratedCodeInfoOrBuilder
        public int getAnnotationCount() {
            return this.annotation_.size();
        }

        @Override  // com.google.protobuf.DescriptorProtos$GeneratedCodeInfoOrBuilder
        public List getAnnotationList() {
            return this.annotation_;
        }

        public AnnotationOrBuilder getAnnotationOrBuilder(int v) {
            return (AnnotationOrBuilder)this.annotation_.get(v);
        }

        public List getAnnotationOrBuilderList() {
            return this.annotation_;
        }

        public static GeneratedCodeInfo getDefaultInstance() {
            return GeneratedCodeInfo.DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Builder newBuilder() {
            return (com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Builder)GeneratedCodeInfo.DEFAULT_INSTANCE.createBuilder();
        }

        public static com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Builder newBuilder(GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo0) {
            return (com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Builder)GeneratedCodeInfo.DEFAULT_INSTANCE.createBuilder(descriptorProtos$GeneratedCodeInfo0);
        }

        public static GeneratedCodeInfo parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (GeneratedCodeInfo)GeneratedMessageLite.parseDelimitedFrom(GeneratedCodeInfo.DEFAULT_INSTANCE, inputStream0);
        }

        public static GeneratedCodeInfo parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (GeneratedCodeInfo)GeneratedMessageLite.parseDelimitedFrom(GeneratedCodeInfo.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static GeneratedCodeInfo parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (GeneratedCodeInfo)GeneratedMessageLite.parseFrom(GeneratedCodeInfo.DEFAULT_INSTANCE, byteString0);
        }

        public static GeneratedCodeInfo parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (GeneratedCodeInfo)GeneratedMessageLite.parseFrom(GeneratedCodeInfo.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static GeneratedCodeInfo parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (GeneratedCodeInfo)GeneratedMessageLite.parseFrom(GeneratedCodeInfo.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static GeneratedCodeInfo parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (GeneratedCodeInfo)GeneratedMessageLite.parseFrom(GeneratedCodeInfo.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static GeneratedCodeInfo parseFrom(InputStream inputStream0) throws IOException {
            return (GeneratedCodeInfo)GeneratedMessageLite.parseFrom(GeneratedCodeInfo.DEFAULT_INSTANCE, inputStream0);
        }

        public static GeneratedCodeInfo parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (GeneratedCodeInfo)GeneratedMessageLite.parseFrom(GeneratedCodeInfo.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static GeneratedCodeInfo parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (GeneratedCodeInfo)GeneratedMessageLite.parseFrom(GeneratedCodeInfo.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static GeneratedCodeInfo parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (GeneratedCodeInfo)GeneratedMessageLite.parseFrom(GeneratedCodeInfo.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static GeneratedCodeInfo parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (GeneratedCodeInfo)GeneratedMessageLite.parseFrom(GeneratedCodeInfo.DEFAULT_INSTANCE, arr_b);
        }

        public static GeneratedCodeInfo parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (GeneratedCodeInfo)GeneratedMessageLite.parseFrom(GeneratedCodeInfo.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return GeneratedCodeInfo.DEFAULT_INSTANCE.getParserForType();
        }

        private void removeAnnotation(int v) {
            this.ensureAnnotationIsMutable();
            this.annotation_.remove(v);
        }

        private void setAnnotation(int v, Annotation descriptorProtos$GeneratedCodeInfo$Annotation0) {
            descriptorProtos$GeneratedCodeInfo$Annotation0.getClass();
            this.ensureAnnotationIsMutable();
            this.annotation_.set(v, descriptorProtos$GeneratedCodeInfo$Annotation0);
        }
    }

    public interface GeneratedCodeInfoOrBuilder extends MessageLiteOrBuilder {
        Annotation getAnnotation(int arg1);

        int getAnnotationCount();

        List getAnnotationList();
    }

    public static final class MessageOptions extends ExtendableMessage implements MessageOptionsOrBuilder {
        public static final class com.google.protobuf.DescriptorProtos.MessageOptions.Builder extends ExtendableBuilder implements MessageOptionsOrBuilder {
            private com.google.protobuf.DescriptorProtos.MessageOptions.Builder() {
                super(MessageOptions.DEFAULT_INSTANCE);
            }

            com.google.protobuf.DescriptorProtos.MessageOptions.Builder(a descriptorProtos$a0) {
            }

            public com.google.protobuf.DescriptorProtos.MessageOptions.Builder addAllUninterpretedOption(Iterable iterable0) {
                this.copyOnWrite();
                ((MessageOptions)this.instance).addAllUninterpretedOption(iterable0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.MessageOptions.Builder addUninterpretedOption(int v, com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder descriptorProtos$UninterpretedOption$Builder0) {
                this.copyOnWrite();
                ((MessageOptions)this.instance).addUninterpretedOption(v, ((UninterpretedOption)descriptorProtos$UninterpretedOption$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.MessageOptions.Builder addUninterpretedOption(int v, UninterpretedOption descriptorProtos$UninterpretedOption0) {
                this.copyOnWrite();
                ((MessageOptions)this.instance).addUninterpretedOption(v, descriptorProtos$UninterpretedOption0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.MessageOptions.Builder addUninterpretedOption(com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder descriptorProtos$UninterpretedOption$Builder0) {
                this.copyOnWrite();
                ((MessageOptions)this.instance).addUninterpretedOption(((UninterpretedOption)descriptorProtos$UninterpretedOption$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.MessageOptions.Builder addUninterpretedOption(UninterpretedOption descriptorProtos$UninterpretedOption0) {
                this.copyOnWrite();
                ((MessageOptions)this.instance).addUninterpretedOption(descriptorProtos$UninterpretedOption0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.MessageOptions.Builder clearDeprecated() {
                this.copyOnWrite();
                ((MessageOptions)this.instance).clearDeprecated();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.MessageOptions.Builder clearMapEntry() {
                this.copyOnWrite();
                ((MessageOptions)this.instance).clearMapEntry();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.MessageOptions.Builder clearMessageSetWireFormat() {
                this.copyOnWrite();
                ((MessageOptions)this.instance).clearMessageSetWireFormat();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.MessageOptions.Builder clearNoStandardDescriptorAccessor() {
                this.copyOnWrite();
                ((MessageOptions)this.instance).clearNoStandardDescriptorAccessor();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.MessageOptions.Builder clearUninterpretedOption() {
                this.copyOnWrite();
                ((MessageOptions)this.instance).clearUninterpretedOption();
                return this;
            }

            @Override  // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
            public boolean getDeprecated() {
                return ((MessageOptions)this.instance).getDeprecated();
            }

            @Override  // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
            public boolean getMapEntry() {
                return ((MessageOptions)this.instance).getMapEntry();
            }

            @Override  // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
            public boolean getMessageSetWireFormat() {
                return ((MessageOptions)this.instance).getMessageSetWireFormat();
            }

            @Override  // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
            public boolean getNoStandardDescriptorAccessor() {
                return ((MessageOptions)this.instance).getNoStandardDescriptorAccessor();
            }

            @Override  // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
            public UninterpretedOption getUninterpretedOption(int v) {
                return ((MessageOptions)this.instance).getUninterpretedOption(v);
            }

            @Override  // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
            public int getUninterpretedOptionCount() {
                return ((MessageOptions)this.instance).getUninterpretedOptionCount();
            }

            @Override  // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
            public List getUninterpretedOptionList() {
                return DesugarCollections.unmodifiableList(((MessageOptions)this.instance).getUninterpretedOptionList());
            }

            @Override  // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
            public boolean hasDeprecated() {
                return ((MessageOptions)this.instance).hasDeprecated();
            }

            @Override  // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
            public boolean hasMapEntry() {
                return ((MessageOptions)this.instance).hasMapEntry();
            }

            @Override  // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
            public boolean hasMessageSetWireFormat() {
                return ((MessageOptions)this.instance).hasMessageSetWireFormat();
            }

            @Override  // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
            public boolean hasNoStandardDescriptorAccessor() {
                return ((MessageOptions)this.instance).hasNoStandardDescriptorAccessor();
            }

            public com.google.protobuf.DescriptorProtos.MessageOptions.Builder removeUninterpretedOption(int v) {
                this.copyOnWrite();
                ((MessageOptions)this.instance).removeUninterpretedOption(v);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.MessageOptions.Builder setDeprecated(boolean z) {
                this.copyOnWrite();
                ((MessageOptions)this.instance).setDeprecated(z);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.MessageOptions.Builder setMapEntry(boolean z) {
                this.copyOnWrite();
                ((MessageOptions)this.instance).setMapEntry(z);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.MessageOptions.Builder setMessageSetWireFormat(boolean z) {
                this.copyOnWrite();
                ((MessageOptions)this.instance).setMessageSetWireFormat(z);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.MessageOptions.Builder setNoStandardDescriptorAccessor(boolean z) {
                this.copyOnWrite();
                ((MessageOptions)this.instance).setNoStandardDescriptorAccessor(z);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.MessageOptions.Builder setUninterpretedOption(int v, com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder descriptorProtos$UninterpretedOption$Builder0) {
                this.copyOnWrite();
                ((MessageOptions)this.instance).setUninterpretedOption(v, ((UninterpretedOption)descriptorProtos$UninterpretedOption$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.MessageOptions.Builder setUninterpretedOption(int v, UninterpretedOption descriptorProtos$UninterpretedOption0) {
                this.copyOnWrite();
                ((MessageOptions)this.instance).setUninterpretedOption(v, descriptorProtos$UninterpretedOption0);
                return this;
            }
        }

        private static final MessageOptions DEFAULT_INSTANCE = null;
        public static final int DEPRECATED_FIELD_NUMBER = 3;
        public static final int MAP_ENTRY_FIELD_NUMBER = 7;
        public static final int MESSAGE_SET_WIRE_FORMAT_FIELD_NUMBER = 1;
        public static final int NO_STANDARD_DESCRIPTOR_ACCESSOR_FIELD_NUMBER = 2;
        private static volatile Parser PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean deprecated_;
        private boolean mapEntry_;
        private byte memoizedIsInitialized;
        private boolean messageSetWireFormat_;
        private boolean noStandardDescriptorAccessor_;
        private ProtobufList uninterpretedOption_;

        static {
            MessageOptions descriptorProtos$MessageOptions0 = new MessageOptions();
            MessageOptions.DEFAULT_INSTANCE = descriptorProtos$MessageOptions0;
            GeneratedMessageLite.registerDefaultInstance(MessageOptions.class, descriptorProtos$MessageOptions0);
        }

        private MessageOptions() {
            this.memoizedIsInitialized = 2;
            this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void addAllUninterpretedOption(Iterable iterable0) {
            this.ensureUninterpretedOptionIsMutable();
            AbstractMessageLite.addAll(iterable0, this.uninterpretedOption_);
        }

        private void addUninterpretedOption(int v, UninterpretedOption descriptorProtos$UninterpretedOption0) {
            descriptorProtos$UninterpretedOption0.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(v, descriptorProtos$UninterpretedOption0);
        }

        private void addUninterpretedOption(UninterpretedOption descriptorProtos$UninterpretedOption0) {
            descriptorProtos$UninterpretedOption0.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(descriptorProtos$UninterpretedOption0);
        }

        private void clearDeprecated() {
            this.bitField0_ &= -5;
            this.deprecated_ = false;
        }

        private void clearMapEntry() {
            this.bitField0_ &= -9;
            this.mapEntry_ = false;
        }

        private void clearMessageSetWireFormat() {
            this.bitField0_ &= -2;
            this.messageSetWireFormat_ = false;
        }

        private void clearNoStandardDescriptorAccessor() {
            this.bitField0_ &= -3;
            this.noStandardDescriptorAccessor_ = false;
        }

        private void clearUninterpretedOption() {
            this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            int v = 1;
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new MessageOptions();
                }
                case 2: {
                    return new com.google.protobuf.DescriptorProtos.MessageOptions.Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(MessageOptions.DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001ϧ\u0005\u0000\u0001\u0001\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0007ဇ\u0003ϧЛ", new Object[]{"bitField0_", "messageSetWireFormat_", "noStandardDescriptorAccessor_", "deprecated_", "mapEntry_", "uninterpretedOption_", UninterpretedOption.class});
                }
                case 4: {
                    return MessageOptions.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = MessageOptions.PARSER;
                    if(parser0 == null) {
                        synchronized(MessageOptions.class) {
                            parser0 = MessageOptions.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(MessageOptions.DEFAULT_INSTANCE);
                                MessageOptions.PARSER = parser0;
                            }
                        }
                    }
                    return parser0;
                }
                case 6: {
                    return this.memoizedIsInitialized;
                }
                case 7: {
                    if(object0 == null) {
                        v = 0;
                    }
                    this.memoizedIsInitialized = (byte)v;
                    return null;
                }
                default: {
                    throw new UnsupportedOperationException();
                }
            }
        }

        private void ensureUninterpretedOptionIsMutable() {
            ProtobufList internal$ProtobufList0 = this.uninterpretedOption_;
            if(!internal$ProtobufList0.isModifiable()) {
                this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
            }
        }

        public static MessageOptions getDefaultInstance() {
            return MessageOptions.DEFAULT_INSTANCE;
        }

        @Override  // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
        public boolean getMapEntry() {
            return this.mapEntry_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
        public boolean getMessageSetWireFormat() {
            return this.messageSetWireFormat_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
        public boolean getNoStandardDescriptorAccessor() {
            return this.noStandardDescriptorAccessor_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
        public UninterpretedOption getUninterpretedOption(int v) {
            return (UninterpretedOption)this.uninterpretedOption_.get(v);
        }

        @Override  // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override  // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
        public List getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int v) {
            return (UninterpretedOptionOrBuilder)this.uninterpretedOption_.get(v);
        }

        public List getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
        public boolean hasDeprecated() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
        public boolean hasMapEntry() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
        public boolean hasMessageSetWireFormat() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$MessageOptionsOrBuilder
        public boolean hasNoStandardDescriptorAccessor() {
            return (this.bitField0_ & 2) != 0;
        }

        public static com.google.protobuf.DescriptorProtos.MessageOptions.Builder newBuilder() {
            return (com.google.protobuf.DescriptorProtos.MessageOptions.Builder)MessageOptions.DEFAULT_INSTANCE.createBuilder();
        }

        public static com.google.protobuf.DescriptorProtos.MessageOptions.Builder newBuilder(MessageOptions descriptorProtos$MessageOptions0) {
            return (com.google.protobuf.DescriptorProtos.MessageOptions.Builder)MessageOptions.DEFAULT_INSTANCE.createBuilder(descriptorProtos$MessageOptions0);
        }

        public static MessageOptions parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (MessageOptions)GeneratedMessageLite.parseDelimitedFrom(MessageOptions.DEFAULT_INSTANCE, inputStream0);
        }

        public static MessageOptions parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (MessageOptions)GeneratedMessageLite.parseDelimitedFrom(MessageOptions.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static MessageOptions parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (MessageOptions)GeneratedMessageLite.parseFrom(MessageOptions.DEFAULT_INSTANCE, byteString0);
        }

        public static MessageOptions parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (MessageOptions)GeneratedMessageLite.parseFrom(MessageOptions.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static MessageOptions parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (MessageOptions)GeneratedMessageLite.parseFrom(MessageOptions.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static MessageOptions parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (MessageOptions)GeneratedMessageLite.parseFrom(MessageOptions.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static MessageOptions parseFrom(InputStream inputStream0) throws IOException {
            return (MessageOptions)GeneratedMessageLite.parseFrom(MessageOptions.DEFAULT_INSTANCE, inputStream0);
        }

        public static MessageOptions parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (MessageOptions)GeneratedMessageLite.parseFrom(MessageOptions.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static MessageOptions parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (MessageOptions)GeneratedMessageLite.parseFrom(MessageOptions.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static MessageOptions parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (MessageOptions)GeneratedMessageLite.parseFrom(MessageOptions.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static MessageOptions parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (MessageOptions)GeneratedMessageLite.parseFrom(MessageOptions.DEFAULT_INSTANCE, arr_b);
        }

        public static MessageOptions parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (MessageOptions)GeneratedMessageLite.parseFrom(MessageOptions.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return MessageOptions.DEFAULT_INSTANCE.getParserForType();
        }

        private void removeUninterpretedOption(int v) {
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(v);
        }

        private void setDeprecated(boolean z) {
            this.bitField0_ |= 4;
            this.deprecated_ = z;
        }

        private void setMapEntry(boolean z) {
            this.bitField0_ |= 8;
            this.mapEntry_ = z;
        }

        private void setMessageSetWireFormat(boolean z) {
            this.bitField0_ |= 1;
            this.messageSetWireFormat_ = z;
        }

        private void setNoStandardDescriptorAccessor(boolean z) {
            this.bitField0_ |= 2;
            this.noStandardDescriptorAccessor_ = z;
        }

        private void setUninterpretedOption(int v, UninterpretedOption descriptorProtos$UninterpretedOption0) {
            descriptorProtos$UninterpretedOption0.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(v, descriptorProtos$UninterpretedOption0);
        }
    }

    public interface MessageOptionsOrBuilder extends ExtendableMessageOrBuilder {
        boolean getDeprecated();

        boolean getMapEntry();

        boolean getMessageSetWireFormat();

        boolean getNoStandardDescriptorAccessor();

        UninterpretedOption getUninterpretedOption(int arg1);

        int getUninterpretedOptionCount();

        List getUninterpretedOptionList();

        boolean hasDeprecated();

        boolean hasMapEntry();

        boolean hasMessageSetWireFormat();

        boolean hasNoStandardDescriptorAccessor();
    }

    public static final class MethodDescriptorProto extends GeneratedMessageLite implements MethodDescriptorProtoOrBuilder {
        public static final class com.google.protobuf.DescriptorProtos.MethodDescriptorProto.Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements MethodDescriptorProtoOrBuilder {
            private com.google.protobuf.DescriptorProtos.MethodDescriptorProto.Builder() {
                super(MethodDescriptorProto.DEFAULT_INSTANCE);
            }

            com.google.protobuf.DescriptorProtos.MethodDescriptorProto.Builder(a descriptorProtos$a0) {
            }

            public com.google.protobuf.DescriptorProtos.MethodDescriptorProto.Builder clearClientStreaming() {
                this.copyOnWrite();
                ((MethodDescriptorProto)this.instance).clearClientStreaming();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.MethodDescriptorProto.Builder clearInputType() {
                this.copyOnWrite();
                ((MethodDescriptorProto)this.instance).clearInputType();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.MethodDescriptorProto.Builder clearName() {
                this.copyOnWrite();
                ((MethodDescriptorProto)this.instance).clearName();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.MethodDescriptorProto.Builder clearOptions() {
                this.copyOnWrite();
                ((MethodDescriptorProto)this.instance).clearOptions();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.MethodDescriptorProto.Builder clearOutputType() {
                this.copyOnWrite();
                ((MethodDescriptorProto)this.instance).clearOutputType();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.MethodDescriptorProto.Builder clearServerStreaming() {
                this.copyOnWrite();
                ((MethodDescriptorProto)this.instance).clearServerStreaming();
                return this;
            }

            @Override  // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
            public boolean getClientStreaming() {
                return ((MethodDescriptorProto)this.instance).getClientStreaming();
            }

            @Override  // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
            public String getInputType() {
                return ((MethodDescriptorProto)this.instance).getInputType();
            }

            @Override  // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
            public ByteString getInputTypeBytes() {
                return ((MethodDescriptorProto)this.instance).getInputTypeBytes();
            }

            @Override  // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
            public String getName() {
                return ((MethodDescriptorProto)this.instance).getName();
            }

            @Override  // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
            public ByteString getNameBytes() {
                return ((MethodDescriptorProto)this.instance).getNameBytes();
            }

            @Override  // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
            public MethodOptions getOptions() {
                return ((MethodDescriptorProto)this.instance).getOptions();
            }

            @Override  // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
            public String getOutputType() {
                return ((MethodDescriptorProto)this.instance).getOutputType();
            }

            @Override  // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
            public ByteString getOutputTypeBytes() {
                return ((MethodDescriptorProto)this.instance).getOutputTypeBytes();
            }

            @Override  // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
            public boolean getServerStreaming() {
                return ((MethodDescriptorProto)this.instance).getServerStreaming();
            }

            @Override  // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
            public boolean hasClientStreaming() {
                return ((MethodDescriptorProto)this.instance).hasClientStreaming();
            }

            @Override  // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
            public boolean hasInputType() {
                return ((MethodDescriptorProto)this.instance).hasInputType();
            }

            @Override  // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
            public boolean hasName() {
                return ((MethodDescriptorProto)this.instance).hasName();
            }

            @Override  // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
            public boolean hasOptions() {
                return ((MethodDescriptorProto)this.instance).hasOptions();
            }

            @Override  // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
            public boolean hasOutputType() {
                return ((MethodDescriptorProto)this.instance).hasOutputType();
            }

            @Override  // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
            public boolean hasServerStreaming() {
                return ((MethodDescriptorProto)this.instance).hasServerStreaming();
            }

            public com.google.protobuf.DescriptorProtos.MethodDescriptorProto.Builder mergeOptions(MethodOptions descriptorProtos$MethodOptions0) {
                this.copyOnWrite();
                ((MethodDescriptorProto)this.instance).mergeOptions(descriptorProtos$MethodOptions0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.MethodDescriptorProto.Builder setClientStreaming(boolean z) {
                this.copyOnWrite();
                ((MethodDescriptorProto)this.instance).setClientStreaming(z);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.MethodDescriptorProto.Builder setInputType(String s) {
                this.copyOnWrite();
                ((MethodDescriptorProto)this.instance).setInputType(s);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.MethodDescriptorProto.Builder setInputTypeBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((MethodDescriptorProto)this.instance).setInputTypeBytes(byteString0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.MethodDescriptorProto.Builder setName(String s) {
                this.copyOnWrite();
                ((MethodDescriptorProto)this.instance).setName(s);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.MethodDescriptorProto.Builder setNameBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((MethodDescriptorProto)this.instance).setNameBytes(byteString0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.MethodDescriptorProto.Builder setOptions(com.google.protobuf.DescriptorProtos.MethodOptions.Builder descriptorProtos$MethodOptions$Builder0) {
                this.copyOnWrite();
                ((MethodDescriptorProto)this.instance).setOptions(((MethodOptions)descriptorProtos$MethodOptions$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.MethodDescriptorProto.Builder setOptions(MethodOptions descriptorProtos$MethodOptions0) {
                this.copyOnWrite();
                ((MethodDescriptorProto)this.instance).setOptions(descriptorProtos$MethodOptions0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.MethodDescriptorProto.Builder setOutputType(String s) {
                this.copyOnWrite();
                ((MethodDescriptorProto)this.instance).setOutputType(s);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.MethodDescriptorProto.Builder setOutputTypeBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((MethodDescriptorProto)this.instance).setOutputTypeBytes(byteString0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.MethodDescriptorProto.Builder setServerStreaming(boolean z) {
                this.copyOnWrite();
                ((MethodDescriptorProto)this.instance).setServerStreaming(z);
                return this;
            }
        }

        public static final int CLIENT_STREAMING_FIELD_NUMBER = 5;
        private static final MethodDescriptorProto DEFAULT_INSTANCE = null;
        public static final int INPUT_TYPE_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 4;
        public static final int OUTPUT_TYPE_FIELD_NUMBER = 3;
        private static volatile Parser PARSER = null;
        public static final int SERVER_STREAMING_FIELD_NUMBER = 6;
        private int bitField0_;
        private boolean clientStreaming_;
        private String inputType_;
        private byte memoizedIsInitialized;
        private String name_;
        private MethodOptions options_;
        private String outputType_;
        private boolean serverStreaming_;

        static {
            MethodDescriptorProto descriptorProtos$MethodDescriptorProto0 = new MethodDescriptorProto();
            MethodDescriptorProto.DEFAULT_INSTANCE = descriptorProtos$MethodDescriptorProto0;
            GeneratedMessageLite.registerDefaultInstance(MethodDescriptorProto.class, descriptorProtos$MethodDescriptorProto0);
        }

        private MethodDescriptorProto() {
            this.memoizedIsInitialized = 2;
            this.name_ = "";
            this.inputType_ = "";
            this.outputType_ = "";
        }

        private void clearClientStreaming() {
            this.bitField0_ &= -17;
            this.clientStreaming_ = false;
        }

        private void clearInputType() {
            this.bitField0_ &= -3;
            this.inputType_ = "";
        }

        private void clearName() {
            this.bitField0_ &= -2;
            this.name_ = "";
        }

        private void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -9;
        }

        private void clearOutputType() {
            this.bitField0_ &= -5;
            this.outputType_ = "";
        }

        private void clearServerStreaming() {
            this.bitField0_ &= -33;
            this.serverStreaming_ = false;
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            int v = 1;
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new MethodDescriptorProto();
                }
                case 2: {
                    return new com.google.protobuf.DescriptorProtos.MethodDescriptorProto.Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(MethodDescriptorProto.DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"bitField0_", "name_", "inputType_", "outputType_", "options_", "clientStreaming_", "serverStreaming_"});
                }
                case 4: {
                    return MethodDescriptorProto.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = MethodDescriptorProto.PARSER;
                    if(parser0 == null) {
                        synchronized(MethodDescriptorProto.class) {
                            parser0 = MethodDescriptorProto.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(MethodDescriptorProto.DEFAULT_INSTANCE);
                                MethodDescriptorProto.PARSER = parser0;
                            }
                        }
                    }
                    return parser0;
                }
                case 6: {
                    return this.memoizedIsInitialized;
                }
                case 7: {
                    if(object0 == null) {
                        v = 0;
                    }
                    this.memoizedIsInitialized = (byte)v;
                    return null;
                }
                default: {
                    throw new UnsupportedOperationException();
                }
            }
        }

        @Override  // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
        public boolean getClientStreaming() {
            return this.clientStreaming_;
        }

        public static MethodDescriptorProto getDefaultInstance() {
            return MethodDescriptorProto.DEFAULT_INSTANCE;
        }

        @Override  // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
        public String getInputType() {
            return this.inputType_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
        public ByteString getInputTypeBytes() {
            return ByteString.copyFromUtf8(this.inputType_);
        }

        @Override  // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override  // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
        public MethodOptions getOptions() {
            return this.options_ == null ? MethodOptions.getDefaultInstance() : this.options_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
        public String getOutputType() {
            return this.outputType_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
        public ByteString getOutputTypeBytes() {
            return ByteString.copyFromUtf8(this.outputType_);
        }

        @Override  // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
        public boolean getServerStreaming() {
            return this.serverStreaming_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
        public boolean hasClientStreaming() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
        public boolean hasInputType() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
        public boolean hasOptions() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
        public boolean hasOutputType() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$MethodDescriptorProtoOrBuilder
        public boolean hasServerStreaming() {
            return (this.bitField0_ & 0x20) != 0;
        }

        private void mergeOptions(MethodOptions descriptorProtos$MethodOptions0) {
            descriptorProtos$MethodOptions0.getClass();
            this.options_ = this.options_ == null || this.options_ == MethodOptions.getDefaultInstance() ? descriptorProtos$MethodOptions0 : ((MethodOptions)((com.google.protobuf.DescriptorProtos.MethodOptions.Builder)MethodOptions.newBuilder(this.options_).mergeFrom(descriptorProtos$MethodOptions0)).buildPartial());
            this.bitField0_ |= 8;
        }

        public static com.google.protobuf.DescriptorProtos.MethodDescriptorProto.Builder newBuilder() {
            return (com.google.protobuf.DescriptorProtos.MethodDescriptorProto.Builder)MethodDescriptorProto.DEFAULT_INSTANCE.createBuilder();
        }

        public static com.google.protobuf.DescriptorProtos.MethodDescriptorProto.Builder newBuilder(MethodDescriptorProto descriptorProtos$MethodDescriptorProto0) {
            return (com.google.protobuf.DescriptorProtos.MethodDescriptorProto.Builder)MethodDescriptorProto.DEFAULT_INSTANCE.createBuilder(descriptorProtos$MethodDescriptorProto0);
        }

        public static MethodDescriptorProto parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (MethodDescriptorProto)GeneratedMessageLite.parseDelimitedFrom(MethodDescriptorProto.DEFAULT_INSTANCE, inputStream0);
        }

        public static MethodDescriptorProto parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (MethodDescriptorProto)GeneratedMessageLite.parseDelimitedFrom(MethodDescriptorProto.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static MethodDescriptorProto parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (MethodDescriptorProto)GeneratedMessageLite.parseFrom(MethodDescriptorProto.DEFAULT_INSTANCE, byteString0);
        }

        public static MethodDescriptorProto parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (MethodDescriptorProto)GeneratedMessageLite.parseFrom(MethodDescriptorProto.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static MethodDescriptorProto parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (MethodDescriptorProto)GeneratedMessageLite.parseFrom(MethodDescriptorProto.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static MethodDescriptorProto parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (MethodDescriptorProto)GeneratedMessageLite.parseFrom(MethodDescriptorProto.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static MethodDescriptorProto parseFrom(InputStream inputStream0) throws IOException {
            return (MethodDescriptorProto)GeneratedMessageLite.parseFrom(MethodDescriptorProto.DEFAULT_INSTANCE, inputStream0);
        }

        public static MethodDescriptorProto parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (MethodDescriptorProto)GeneratedMessageLite.parseFrom(MethodDescriptorProto.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static MethodDescriptorProto parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (MethodDescriptorProto)GeneratedMessageLite.parseFrom(MethodDescriptorProto.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static MethodDescriptorProto parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (MethodDescriptorProto)GeneratedMessageLite.parseFrom(MethodDescriptorProto.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static MethodDescriptorProto parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (MethodDescriptorProto)GeneratedMessageLite.parseFrom(MethodDescriptorProto.DEFAULT_INSTANCE, arr_b);
        }

        public static MethodDescriptorProto parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (MethodDescriptorProto)GeneratedMessageLite.parseFrom(MethodDescriptorProto.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return MethodDescriptorProto.DEFAULT_INSTANCE.getParserForType();
        }

        private void setClientStreaming(boolean z) {
            this.bitField0_ |= 16;
            this.clientStreaming_ = z;
        }

        private void setInputType(String s) {
            s.getClass();
            this.bitField0_ |= 2;
            this.inputType_ = s;
        }

        private void setInputTypeBytes(ByteString byteString0) {
            this.inputType_ = byteString0.toStringUtf8();
            this.bitField0_ |= 2;
        }

        private void setName(String s) {
            s.getClass();
            this.bitField0_ |= 1;
            this.name_ = s;
        }

        private void setNameBytes(ByteString byteString0) {
            this.name_ = byteString0.toStringUtf8();
            this.bitField0_ |= 1;
        }

        private void setOptions(MethodOptions descriptorProtos$MethodOptions0) {
            descriptorProtos$MethodOptions0.getClass();
            this.options_ = descriptorProtos$MethodOptions0;
            this.bitField0_ |= 8;
        }

        private void setOutputType(String s) {
            s.getClass();
            this.bitField0_ |= 4;
            this.outputType_ = s;
        }

        private void setOutputTypeBytes(ByteString byteString0) {
            this.outputType_ = byteString0.toStringUtf8();
            this.bitField0_ |= 4;
        }

        private void setServerStreaming(boolean z) {
            this.bitField0_ |= 0x20;
            this.serverStreaming_ = z;
        }
    }

    public interface MethodDescriptorProtoOrBuilder extends MessageLiteOrBuilder {
        boolean getClientStreaming();

        String getInputType();

        ByteString getInputTypeBytes();

        String getName();

        ByteString getNameBytes();

        MethodOptions getOptions();

        String getOutputType();

        ByteString getOutputTypeBytes();

        boolean getServerStreaming();

        boolean hasClientStreaming();

        boolean hasInputType();

        boolean hasName();

        boolean hasOptions();

        boolean hasOutputType();

        boolean hasServerStreaming();
    }

    public static final class MethodOptions extends ExtendableMessage implements MethodOptionsOrBuilder {
        public static final class com.google.protobuf.DescriptorProtos.MethodOptions.Builder extends ExtendableBuilder implements MethodOptionsOrBuilder {
            private com.google.protobuf.DescriptorProtos.MethodOptions.Builder() {
                super(MethodOptions.DEFAULT_INSTANCE);
            }

            com.google.protobuf.DescriptorProtos.MethodOptions.Builder(a descriptorProtos$a0) {
            }

            public com.google.protobuf.DescriptorProtos.MethodOptions.Builder addAllUninterpretedOption(Iterable iterable0) {
                this.copyOnWrite();
                ((MethodOptions)this.instance).addAllUninterpretedOption(iterable0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.MethodOptions.Builder addUninterpretedOption(int v, com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder descriptorProtos$UninterpretedOption$Builder0) {
                this.copyOnWrite();
                ((MethodOptions)this.instance).addUninterpretedOption(v, ((UninterpretedOption)descriptorProtos$UninterpretedOption$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.MethodOptions.Builder addUninterpretedOption(int v, UninterpretedOption descriptorProtos$UninterpretedOption0) {
                this.copyOnWrite();
                ((MethodOptions)this.instance).addUninterpretedOption(v, descriptorProtos$UninterpretedOption0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.MethodOptions.Builder addUninterpretedOption(com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder descriptorProtos$UninterpretedOption$Builder0) {
                this.copyOnWrite();
                ((MethodOptions)this.instance).addUninterpretedOption(((UninterpretedOption)descriptorProtos$UninterpretedOption$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.MethodOptions.Builder addUninterpretedOption(UninterpretedOption descriptorProtos$UninterpretedOption0) {
                this.copyOnWrite();
                ((MethodOptions)this.instance).addUninterpretedOption(descriptorProtos$UninterpretedOption0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.MethodOptions.Builder clearDeprecated() {
                this.copyOnWrite();
                ((MethodOptions)this.instance).clearDeprecated();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.MethodOptions.Builder clearIdempotencyLevel() {
                this.copyOnWrite();
                ((MethodOptions)this.instance).clearIdempotencyLevel();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.MethodOptions.Builder clearUninterpretedOption() {
                this.copyOnWrite();
                ((MethodOptions)this.instance).clearUninterpretedOption();
                return this;
            }

            @Override  // com.google.protobuf.DescriptorProtos$MethodOptionsOrBuilder
            public boolean getDeprecated() {
                return ((MethodOptions)this.instance).getDeprecated();
            }

            @Override  // com.google.protobuf.DescriptorProtos$MethodOptionsOrBuilder
            public IdempotencyLevel getIdempotencyLevel() {
                return ((MethodOptions)this.instance).getIdempotencyLevel();
            }

            @Override  // com.google.protobuf.DescriptorProtos$MethodOptionsOrBuilder
            public UninterpretedOption getUninterpretedOption(int v) {
                return ((MethodOptions)this.instance).getUninterpretedOption(v);
            }

            @Override  // com.google.protobuf.DescriptorProtos$MethodOptionsOrBuilder
            public int getUninterpretedOptionCount() {
                return ((MethodOptions)this.instance).getUninterpretedOptionCount();
            }

            @Override  // com.google.protobuf.DescriptorProtos$MethodOptionsOrBuilder
            public List getUninterpretedOptionList() {
                return DesugarCollections.unmodifiableList(((MethodOptions)this.instance).getUninterpretedOptionList());
            }

            @Override  // com.google.protobuf.DescriptorProtos$MethodOptionsOrBuilder
            public boolean hasDeprecated() {
                return ((MethodOptions)this.instance).hasDeprecated();
            }

            @Override  // com.google.protobuf.DescriptorProtos$MethodOptionsOrBuilder
            public boolean hasIdempotencyLevel() {
                return ((MethodOptions)this.instance).hasIdempotencyLevel();
            }

            public com.google.protobuf.DescriptorProtos.MethodOptions.Builder removeUninterpretedOption(int v) {
                this.copyOnWrite();
                ((MethodOptions)this.instance).removeUninterpretedOption(v);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.MethodOptions.Builder setDeprecated(boolean z) {
                this.copyOnWrite();
                ((MethodOptions)this.instance).setDeprecated(z);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.MethodOptions.Builder setIdempotencyLevel(IdempotencyLevel descriptorProtos$MethodOptions$IdempotencyLevel0) {
                this.copyOnWrite();
                ((MethodOptions)this.instance).setIdempotencyLevel(descriptorProtos$MethodOptions$IdempotencyLevel0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.MethodOptions.Builder setUninterpretedOption(int v, com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder descriptorProtos$UninterpretedOption$Builder0) {
                this.copyOnWrite();
                ((MethodOptions)this.instance).setUninterpretedOption(v, ((UninterpretedOption)descriptorProtos$UninterpretedOption$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.MethodOptions.Builder setUninterpretedOption(int v, UninterpretedOption descriptorProtos$UninterpretedOption0) {
                this.copyOnWrite();
                ((MethodOptions)this.instance).setUninterpretedOption(v, descriptorProtos$UninterpretedOption0);
                return this;
            }
        }

        public static enum IdempotencyLevel implements EnumLite {
            class com.google.protobuf.DescriptorProtos.MethodOptions.IdempotencyLevel.a implements EnumLiteMap {
                com.google.protobuf.DescriptorProtos.MethodOptions.IdempotencyLevel.a() {
                    super();
                }

                public IdempotencyLevel findValueByNumber(int v) {
                    return IdempotencyLevel.forNumber(v);
                }

                @Override  // com.google.protobuf.Internal$EnumLiteMap
                public EnumLite findValueByNumber(int v) {
                    return this.findValueByNumber(v);
                }
            }

            static final class com.google.protobuf.DescriptorProtos.MethodOptions.IdempotencyLevel.b implements EnumVerifier {
                static final EnumVerifier INSTANCE;

                static {
                    com.google.protobuf.DescriptorProtos.MethodOptions.IdempotencyLevel.b.INSTANCE = new com.google.protobuf.DescriptorProtos.MethodOptions.IdempotencyLevel.b();
                }

                @Override  // com.google.protobuf.Internal$EnumVerifier
                public boolean isInRange(int v) {
                    return IdempotencyLevel.forNumber(v) != null;
                }
            }

            IDEMPOTENCY_UNKNOWN(0),
            NO_SIDE_EFFECTS(1),
            IDEMPOTENT(2);

            public static final int IDEMPOTENCY_UNKNOWN_VALUE = 0;
            public static final int IDEMPOTENT_VALUE = 2;
            public static final int NO_SIDE_EFFECTS_VALUE = 1;
            private static final EnumLiteMap internalValueMap;
            private final int value;

            static {
                IdempotencyLevel.internalValueMap = new com.google.protobuf.DescriptorProtos.MethodOptions.IdempotencyLevel.a();
            }

            private IdempotencyLevel(int v1) {
                this.value = v1;
            }

            public static IdempotencyLevel forNumber(int v) {
                switch(v) {
                    case 0: {
                        return IdempotencyLevel.IDEMPOTENCY_UNKNOWN;
                    }
                    case 1: {
                        return IdempotencyLevel.NO_SIDE_EFFECTS;
                    }
                    case 2: {
                        return IdempotencyLevel.IDEMPOTENT;
                    }
                    default: {
                        return null;
                    }
                }
            }

            @Override  // com.google.protobuf.Internal$EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static EnumLiteMap internalGetValueMap() {
                return IdempotencyLevel.internalValueMap;
            }

            public static EnumVerifier internalGetVerifier() {
                return com.google.protobuf.DescriptorProtos.MethodOptions.IdempotencyLevel.b.INSTANCE;
            }

            @Deprecated
            public static IdempotencyLevel valueOf(int v) {
                return IdempotencyLevel.forNumber(v);
            }
        }

        private static final MethodOptions DEFAULT_INSTANCE = null;
        public static final int DEPRECATED_FIELD_NUMBER = 33;
        public static final int IDEMPOTENCY_LEVEL_FIELD_NUMBER = 34;
        private static volatile Parser PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean deprecated_;
        private int idempotencyLevel_;
        private byte memoizedIsInitialized;
        private ProtobufList uninterpretedOption_;

        static {
            MethodOptions descriptorProtos$MethodOptions0 = new MethodOptions();
            MethodOptions.DEFAULT_INSTANCE = descriptorProtos$MethodOptions0;
            GeneratedMessageLite.registerDefaultInstance(MethodOptions.class, descriptorProtos$MethodOptions0);
        }

        private MethodOptions() {
            this.memoizedIsInitialized = 2;
            this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void addAllUninterpretedOption(Iterable iterable0) {
            this.ensureUninterpretedOptionIsMutable();
            AbstractMessageLite.addAll(iterable0, this.uninterpretedOption_);
        }

        private void addUninterpretedOption(int v, UninterpretedOption descriptorProtos$UninterpretedOption0) {
            descriptorProtos$UninterpretedOption0.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(v, descriptorProtos$UninterpretedOption0);
        }

        private void addUninterpretedOption(UninterpretedOption descriptorProtos$UninterpretedOption0) {
            descriptorProtos$UninterpretedOption0.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(descriptorProtos$UninterpretedOption0);
        }

        private void clearDeprecated() {
            this.bitField0_ &= -2;
            this.deprecated_ = false;
        }

        private void clearIdempotencyLevel() {
            this.bitField0_ &= -3;
            this.idempotencyLevel_ = 0;
        }

        private void clearUninterpretedOption() {
            this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            int v = 1;
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new MethodOptions();
                }
                case 2: {
                    return new com.google.protobuf.DescriptorProtos.MethodOptions.Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(MethodOptions.DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001!ϧ\u0003\u0000\u0001\u0001!ဇ\u0000\"ဌ\u0001ϧЛ", new Object[]{"bitField0_", "deprecated_", "idempotencyLevel_", IdempotencyLevel.internalGetVerifier(), "uninterpretedOption_", UninterpretedOption.class});
                }
                case 4: {
                    return MethodOptions.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = MethodOptions.PARSER;
                    if(parser0 == null) {
                        synchronized(MethodOptions.class) {
                            parser0 = MethodOptions.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(MethodOptions.DEFAULT_INSTANCE);
                                MethodOptions.PARSER = parser0;
                            }
                        }
                    }
                    return parser0;
                }
                case 6: {
                    return this.memoizedIsInitialized;
                }
                case 7: {
                    if(object0 == null) {
                        v = 0;
                    }
                    this.memoizedIsInitialized = (byte)v;
                    return null;
                }
                default: {
                    throw new UnsupportedOperationException();
                }
            }
        }

        private void ensureUninterpretedOptionIsMutable() {
            ProtobufList internal$ProtobufList0 = this.uninterpretedOption_;
            if(!internal$ProtobufList0.isModifiable()) {
                this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
            }
        }

        public static MethodOptions getDefaultInstance() {
            return MethodOptions.DEFAULT_INSTANCE;
        }

        @Override  // com.google.protobuf.DescriptorProtos$MethodOptionsOrBuilder
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$MethodOptionsOrBuilder
        public IdempotencyLevel getIdempotencyLevel() {
            IdempotencyLevel descriptorProtos$MethodOptions$IdempotencyLevel0 = IdempotencyLevel.forNumber(this.idempotencyLevel_);
            return descriptorProtos$MethodOptions$IdempotencyLevel0 == null ? IdempotencyLevel.IDEMPOTENCY_UNKNOWN : descriptorProtos$MethodOptions$IdempotencyLevel0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$MethodOptionsOrBuilder
        public UninterpretedOption getUninterpretedOption(int v) {
            return (UninterpretedOption)this.uninterpretedOption_.get(v);
        }

        @Override  // com.google.protobuf.DescriptorProtos$MethodOptionsOrBuilder
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override  // com.google.protobuf.DescriptorProtos$MethodOptionsOrBuilder
        public List getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int v) {
            return (UninterpretedOptionOrBuilder)this.uninterpretedOption_.get(v);
        }

        public List getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$MethodOptionsOrBuilder
        public boolean hasDeprecated() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$MethodOptionsOrBuilder
        public boolean hasIdempotencyLevel() {
            return (this.bitField0_ & 2) != 0;
        }

        public static com.google.protobuf.DescriptorProtos.MethodOptions.Builder newBuilder() {
            return (com.google.protobuf.DescriptorProtos.MethodOptions.Builder)MethodOptions.DEFAULT_INSTANCE.createBuilder();
        }

        public static com.google.protobuf.DescriptorProtos.MethodOptions.Builder newBuilder(MethodOptions descriptorProtos$MethodOptions0) {
            return (com.google.protobuf.DescriptorProtos.MethodOptions.Builder)MethodOptions.DEFAULT_INSTANCE.createBuilder(descriptorProtos$MethodOptions0);
        }

        public static MethodOptions parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (MethodOptions)GeneratedMessageLite.parseDelimitedFrom(MethodOptions.DEFAULT_INSTANCE, inputStream0);
        }

        public static MethodOptions parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (MethodOptions)GeneratedMessageLite.parseDelimitedFrom(MethodOptions.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static MethodOptions parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (MethodOptions)GeneratedMessageLite.parseFrom(MethodOptions.DEFAULT_INSTANCE, byteString0);
        }

        public static MethodOptions parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (MethodOptions)GeneratedMessageLite.parseFrom(MethodOptions.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static MethodOptions parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (MethodOptions)GeneratedMessageLite.parseFrom(MethodOptions.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static MethodOptions parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (MethodOptions)GeneratedMessageLite.parseFrom(MethodOptions.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static MethodOptions parseFrom(InputStream inputStream0) throws IOException {
            return (MethodOptions)GeneratedMessageLite.parseFrom(MethodOptions.DEFAULT_INSTANCE, inputStream0);
        }

        public static MethodOptions parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (MethodOptions)GeneratedMessageLite.parseFrom(MethodOptions.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static MethodOptions parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (MethodOptions)GeneratedMessageLite.parseFrom(MethodOptions.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static MethodOptions parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (MethodOptions)GeneratedMessageLite.parseFrom(MethodOptions.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static MethodOptions parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (MethodOptions)GeneratedMessageLite.parseFrom(MethodOptions.DEFAULT_INSTANCE, arr_b);
        }

        public static MethodOptions parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (MethodOptions)GeneratedMessageLite.parseFrom(MethodOptions.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return MethodOptions.DEFAULT_INSTANCE.getParserForType();
        }

        private void removeUninterpretedOption(int v) {
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(v);
        }

        private void setDeprecated(boolean z) {
            this.bitField0_ |= 1;
            this.deprecated_ = z;
        }

        private void setIdempotencyLevel(IdempotencyLevel descriptorProtos$MethodOptions$IdempotencyLevel0) {
            this.idempotencyLevel_ = descriptorProtos$MethodOptions$IdempotencyLevel0.getNumber();
            this.bitField0_ |= 2;
        }

        private void setUninterpretedOption(int v, UninterpretedOption descriptorProtos$UninterpretedOption0) {
            descriptorProtos$UninterpretedOption0.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(v, descriptorProtos$UninterpretedOption0);
        }
    }

    public interface MethodOptionsOrBuilder extends ExtendableMessageOrBuilder {
        boolean getDeprecated();

        IdempotencyLevel getIdempotencyLevel();

        UninterpretedOption getUninterpretedOption(int arg1);

        int getUninterpretedOptionCount();

        List getUninterpretedOptionList();

        boolean hasDeprecated();

        boolean hasIdempotencyLevel();
    }

    public static final class OneofDescriptorProto extends GeneratedMessageLite implements OneofDescriptorProtoOrBuilder {
        public static final class com.google.protobuf.DescriptorProtos.OneofDescriptorProto.Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements OneofDescriptorProtoOrBuilder {
            private com.google.protobuf.DescriptorProtos.OneofDescriptorProto.Builder() {
                super(OneofDescriptorProto.DEFAULT_INSTANCE);
            }

            com.google.protobuf.DescriptorProtos.OneofDescriptorProto.Builder(a descriptorProtos$a0) {
            }

            public com.google.protobuf.DescriptorProtos.OneofDescriptorProto.Builder clearName() {
                this.copyOnWrite();
                ((OneofDescriptorProto)this.instance).clearName();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.OneofDescriptorProto.Builder clearOptions() {
                this.copyOnWrite();
                ((OneofDescriptorProto)this.instance).clearOptions();
                return this;
            }

            @Override  // com.google.protobuf.DescriptorProtos$OneofDescriptorProtoOrBuilder
            public String getName() {
                return ((OneofDescriptorProto)this.instance).getName();
            }

            @Override  // com.google.protobuf.DescriptorProtos$OneofDescriptorProtoOrBuilder
            public ByteString getNameBytes() {
                return ((OneofDescriptorProto)this.instance).getNameBytes();
            }

            @Override  // com.google.protobuf.DescriptorProtos$OneofDescriptorProtoOrBuilder
            public OneofOptions getOptions() {
                return ((OneofDescriptorProto)this.instance).getOptions();
            }

            @Override  // com.google.protobuf.DescriptorProtos$OneofDescriptorProtoOrBuilder
            public boolean hasName() {
                return ((OneofDescriptorProto)this.instance).hasName();
            }

            @Override  // com.google.protobuf.DescriptorProtos$OneofDescriptorProtoOrBuilder
            public boolean hasOptions() {
                return ((OneofDescriptorProto)this.instance).hasOptions();
            }

            public com.google.protobuf.DescriptorProtos.OneofDescriptorProto.Builder mergeOptions(OneofOptions descriptorProtos$OneofOptions0) {
                this.copyOnWrite();
                ((OneofDescriptorProto)this.instance).mergeOptions(descriptorProtos$OneofOptions0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.OneofDescriptorProto.Builder setName(String s) {
                this.copyOnWrite();
                ((OneofDescriptorProto)this.instance).setName(s);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.OneofDescriptorProto.Builder setNameBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((OneofDescriptorProto)this.instance).setNameBytes(byteString0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.OneofDescriptorProto.Builder setOptions(com.google.protobuf.DescriptorProtos.OneofOptions.Builder descriptorProtos$OneofOptions$Builder0) {
                this.copyOnWrite();
                ((OneofDescriptorProto)this.instance).setOptions(((OneofOptions)descriptorProtos$OneofOptions$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.OneofDescriptorProto.Builder setOptions(OneofOptions descriptorProtos$OneofOptions0) {
                this.copyOnWrite();
                ((OneofDescriptorProto)this.instance).setOptions(descriptorProtos$OneofOptions0);
                return this;
            }
        }

        private static final OneofDescriptorProto DEFAULT_INSTANCE = null;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 2;
        private static volatile Parser PARSER;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private String name_;
        private OneofOptions options_;

        static {
            OneofDescriptorProto descriptorProtos$OneofDescriptorProto0 = new OneofDescriptorProto();
            OneofDescriptorProto.DEFAULT_INSTANCE = descriptorProtos$OneofDescriptorProto0;
            GeneratedMessageLite.registerDefaultInstance(OneofDescriptorProto.class, descriptorProtos$OneofDescriptorProto0);
        }

        private OneofDescriptorProto() {
            this.memoizedIsInitialized = 2;
            this.name_ = "";
        }

        private void clearName() {
            this.bitField0_ &= -2;
            this.name_ = "";
        }

        private void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -3;
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            int v = 1;
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new OneofDescriptorProto();
                }
                case 2: {
                    return new com.google.protobuf.DescriptorProtos.OneofDescriptorProto.Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(OneofDescriptorProto.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"bitField0_", "name_", "options_"});
                }
                case 4: {
                    return OneofDescriptorProto.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = OneofDescriptorProto.PARSER;
                    if(parser0 == null) {
                        synchronized(OneofDescriptorProto.class) {
                            parser0 = OneofDescriptorProto.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(OneofDescriptorProto.DEFAULT_INSTANCE);
                                OneofDescriptorProto.PARSER = parser0;
                            }
                        }
                    }
                    return parser0;
                }
                case 6: {
                    return this.memoizedIsInitialized;
                }
                case 7: {
                    if(object0 == null) {
                        v = 0;
                    }
                    this.memoizedIsInitialized = (byte)v;
                    return null;
                }
                default: {
                    throw new UnsupportedOperationException();
                }
            }
        }

        public static OneofDescriptorProto getDefaultInstance() {
            return OneofDescriptorProto.DEFAULT_INSTANCE;
        }

        @Override  // com.google.protobuf.DescriptorProtos$OneofDescriptorProtoOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$OneofDescriptorProtoOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override  // com.google.protobuf.DescriptorProtos$OneofDescriptorProtoOrBuilder
        public OneofOptions getOptions() {
            return this.options_ == null ? OneofOptions.getDefaultInstance() : this.options_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$OneofDescriptorProtoOrBuilder
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$OneofDescriptorProtoOrBuilder
        public boolean hasOptions() {
            return (this.bitField0_ & 2) != 0;
        }

        private void mergeOptions(OneofOptions descriptorProtos$OneofOptions0) {
            descriptorProtos$OneofOptions0.getClass();
            this.options_ = this.options_ == null || this.options_ == OneofOptions.getDefaultInstance() ? descriptorProtos$OneofOptions0 : ((OneofOptions)((com.google.protobuf.DescriptorProtos.OneofOptions.Builder)OneofOptions.newBuilder(this.options_).mergeFrom(descriptorProtos$OneofOptions0)).buildPartial());
            this.bitField0_ |= 2;
        }

        public static com.google.protobuf.DescriptorProtos.OneofDescriptorProto.Builder newBuilder() {
            return (com.google.protobuf.DescriptorProtos.OneofDescriptorProto.Builder)OneofDescriptorProto.DEFAULT_INSTANCE.createBuilder();
        }

        public static com.google.protobuf.DescriptorProtos.OneofDescriptorProto.Builder newBuilder(OneofDescriptorProto descriptorProtos$OneofDescriptorProto0) {
            return (com.google.protobuf.DescriptorProtos.OneofDescriptorProto.Builder)OneofDescriptorProto.DEFAULT_INSTANCE.createBuilder(descriptorProtos$OneofDescriptorProto0);
        }

        public static OneofDescriptorProto parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (OneofDescriptorProto)GeneratedMessageLite.parseDelimitedFrom(OneofDescriptorProto.DEFAULT_INSTANCE, inputStream0);
        }

        public static OneofDescriptorProto parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (OneofDescriptorProto)GeneratedMessageLite.parseDelimitedFrom(OneofDescriptorProto.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static OneofDescriptorProto parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (OneofDescriptorProto)GeneratedMessageLite.parseFrom(OneofDescriptorProto.DEFAULT_INSTANCE, byteString0);
        }

        public static OneofDescriptorProto parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (OneofDescriptorProto)GeneratedMessageLite.parseFrom(OneofDescriptorProto.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static OneofDescriptorProto parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (OneofDescriptorProto)GeneratedMessageLite.parseFrom(OneofDescriptorProto.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static OneofDescriptorProto parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (OneofDescriptorProto)GeneratedMessageLite.parseFrom(OneofDescriptorProto.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static OneofDescriptorProto parseFrom(InputStream inputStream0) throws IOException {
            return (OneofDescriptorProto)GeneratedMessageLite.parseFrom(OneofDescriptorProto.DEFAULT_INSTANCE, inputStream0);
        }

        public static OneofDescriptorProto parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (OneofDescriptorProto)GeneratedMessageLite.parseFrom(OneofDescriptorProto.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static OneofDescriptorProto parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (OneofDescriptorProto)GeneratedMessageLite.parseFrom(OneofDescriptorProto.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static OneofDescriptorProto parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (OneofDescriptorProto)GeneratedMessageLite.parseFrom(OneofDescriptorProto.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static OneofDescriptorProto parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (OneofDescriptorProto)GeneratedMessageLite.parseFrom(OneofDescriptorProto.DEFAULT_INSTANCE, arr_b);
        }

        public static OneofDescriptorProto parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (OneofDescriptorProto)GeneratedMessageLite.parseFrom(OneofDescriptorProto.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return OneofDescriptorProto.DEFAULT_INSTANCE.getParserForType();
        }

        private void setName(String s) {
            s.getClass();
            this.bitField0_ |= 1;
            this.name_ = s;
        }

        private void setNameBytes(ByteString byteString0) {
            this.name_ = byteString0.toStringUtf8();
            this.bitField0_ |= 1;
        }

        private void setOptions(OneofOptions descriptorProtos$OneofOptions0) {
            descriptorProtos$OneofOptions0.getClass();
            this.options_ = descriptorProtos$OneofOptions0;
            this.bitField0_ |= 2;
        }
    }

    public interface OneofDescriptorProtoOrBuilder extends MessageLiteOrBuilder {
        String getName();

        ByteString getNameBytes();

        OneofOptions getOptions();

        boolean hasName();

        boolean hasOptions();
    }

    public static final class OneofOptions extends ExtendableMessage implements OneofOptionsOrBuilder {
        public static final class com.google.protobuf.DescriptorProtos.OneofOptions.Builder extends ExtendableBuilder implements OneofOptionsOrBuilder {
            private com.google.protobuf.DescriptorProtos.OneofOptions.Builder() {
                super(OneofOptions.DEFAULT_INSTANCE);
            }

            com.google.protobuf.DescriptorProtos.OneofOptions.Builder(a descriptorProtos$a0) {
            }

            public com.google.protobuf.DescriptorProtos.OneofOptions.Builder addAllUninterpretedOption(Iterable iterable0) {
                this.copyOnWrite();
                ((OneofOptions)this.instance).addAllUninterpretedOption(iterable0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.OneofOptions.Builder addUninterpretedOption(int v, com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder descriptorProtos$UninterpretedOption$Builder0) {
                this.copyOnWrite();
                ((OneofOptions)this.instance).addUninterpretedOption(v, ((UninterpretedOption)descriptorProtos$UninterpretedOption$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.OneofOptions.Builder addUninterpretedOption(int v, UninterpretedOption descriptorProtos$UninterpretedOption0) {
                this.copyOnWrite();
                ((OneofOptions)this.instance).addUninterpretedOption(v, descriptorProtos$UninterpretedOption0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.OneofOptions.Builder addUninterpretedOption(com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder descriptorProtos$UninterpretedOption$Builder0) {
                this.copyOnWrite();
                ((OneofOptions)this.instance).addUninterpretedOption(((UninterpretedOption)descriptorProtos$UninterpretedOption$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.OneofOptions.Builder addUninterpretedOption(UninterpretedOption descriptorProtos$UninterpretedOption0) {
                this.copyOnWrite();
                ((OneofOptions)this.instance).addUninterpretedOption(descriptorProtos$UninterpretedOption0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.OneofOptions.Builder clearUninterpretedOption() {
                this.copyOnWrite();
                ((OneofOptions)this.instance).clearUninterpretedOption();
                return this;
            }

            @Override  // com.google.protobuf.DescriptorProtos$OneofOptionsOrBuilder
            public UninterpretedOption getUninterpretedOption(int v) {
                return ((OneofOptions)this.instance).getUninterpretedOption(v);
            }

            @Override  // com.google.protobuf.DescriptorProtos$OneofOptionsOrBuilder
            public int getUninterpretedOptionCount() {
                return ((OneofOptions)this.instance).getUninterpretedOptionCount();
            }

            @Override  // com.google.protobuf.DescriptorProtos$OneofOptionsOrBuilder
            public List getUninterpretedOptionList() {
                return DesugarCollections.unmodifiableList(((OneofOptions)this.instance).getUninterpretedOptionList());
            }

            public com.google.protobuf.DescriptorProtos.OneofOptions.Builder removeUninterpretedOption(int v) {
                this.copyOnWrite();
                ((OneofOptions)this.instance).removeUninterpretedOption(v);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.OneofOptions.Builder setUninterpretedOption(int v, com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder descriptorProtos$UninterpretedOption$Builder0) {
                this.copyOnWrite();
                ((OneofOptions)this.instance).setUninterpretedOption(v, ((UninterpretedOption)descriptorProtos$UninterpretedOption$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.OneofOptions.Builder setUninterpretedOption(int v, UninterpretedOption descriptorProtos$UninterpretedOption0) {
                this.copyOnWrite();
                ((OneofOptions)this.instance).setUninterpretedOption(v, descriptorProtos$UninterpretedOption0);
                return this;
            }
        }

        private static final OneofOptions DEFAULT_INSTANCE = null;
        private static volatile Parser PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private byte memoizedIsInitialized;
        private ProtobufList uninterpretedOption_;

        static {
            OneofOptions descriptorProtos$OneofOptions0 = new OneofOptions();
            OneofOptions.DEFAULT_INSTANCE = descriptorProtos$OneofOptions0;
            GeneratedMessageLite.registerDefaultInstance(OneofOptions.class, descriptorProtos$OneofOptions0);
        }

        private OneofOptions() {
            this.memoizedIsInitialized = 2;
            this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void addAllUninterpretedOption(Iterable iterable0) {
            this.ensureUninterpretedOptionIsMutable();
            AbstractMessageLite.addAll(iterable0, this.uninterpretedOption_);
        }

        private void addUninterpretedOption(int v, UninterpretedOption descriptorProtos$UninterpretedOption0) {
            descriptorProtos$UninterpretedOption0.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(v, descriptorProtos$UninterpretedOption0);
        }

        private void addUninterpretedOption(UninterpretedOption descriptorProtos$UninterpretedOption0) {
            descriptorProtos$UninterpretedOption0.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(descriptorProtos$UninterpretedOption0);
        }

        private void clearUninterpretedOption() {
            this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            int v = 1;
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new OneofOptions();
                }
                case 2: {
                    return new com.google.protobuf.DescriptorProtos.OneofOptions.Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(OneofOptions.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000ϧϧ\u0001\u0000\u0001\u0001ϧЛ", new Object[]{"uninterpretedOption_", UninterpretedOption.class});
                }
                case 4: {
                    return OneofOptions.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = OneofOptions.PARSER;
                    if(parser0 == null) {
                        synchronized(OneofOptions.class) {
                            parser0 = OneofOptions.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(OneofOptions.DEFAULT_INSTANCE);
                                OneofOptions.PARSER = parser0;
                            }
                        }
                    }
                    return parser0;
                }
                case 6: {
                    return this.memoizedIsInitialized;
                }
                case 7: {
                    if(object0 == null) {
                        v = 0;
                    }
                    this.memoizedIsInitialized = (byte)v;
                    return null;
                }
                default: {
                    throw new UnsupportedOperationException();
                }
            }
        }

        private void ensureUninterpretedOptionIsMutable() {
            ProtobufList internal$ProtobufList0 = this.uninterpretedOption_;
            if(!internal$ProtobufList0.isModifiable()) {
                this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
            }
        }

        public static OneofOptions getDefaultInstance() {
            return OneofOptions.DEFAULT_INSTANCE;
        }

        @Override  // com.google.protobuf.DescriptorProtos$OneofOptionsOrBuilder
        public UninterpretedOption getUninterpretedOption(int v) {
            return (UninterpretedOption)this.uninterpretedOption_.get(v);
        }

        @Override  // com.google.protobuf.DescriptorProtos$OneofOptionsOrBuilder
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override  // com.google.protobuf.DescriptorProtos$OneofOptionsOrBuilder
        public List getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int v) {
            return (UninterpretedOptionOrBuilder)this.uninterpretedOption_.get(v);
        }

        public List getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        public static com.google.protobuf.DescriptorProtos.OneofOptions.Builder newBuilder() {
            return (com.google.protobuf.DescriptorProtos.OneofOptions.Builder)OneofOptions.DEFAULT_INSTANCE.createBuilder();
        }

        public static com.google.protobuf.DescriptorProtos.OneofOptions.Builder newBuilder(OneofOptions descriptorProtos$OneofOptions0) {
            return (com.google.protobuf.DescriptorProtos.OneofOptions.Builder)OneofOptions.DEFAULT_INSTANCE.createBuilder(descriptorProtos$OneofOptions0);
        }

        public static OneofOptions parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (OneofOptions)GeneratedMessageLite.parseDelimitedFrom(OneofOptions.DEFAULT_INSTANCE, inputStream0);
        }

        public static OneofOptions parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (OneofOptions)GeneratedMessageLite.parseDelimitedFrom(OneofOptions.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static OneofOptions parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (OneofOptions)GeneratedMessageLite.parseFrom(OneofOptions.DEFAULT_INSTANCE, byteString0);
        }

        public static OneofOptions parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (OneofOptions)GeneratedMessageLite.parseFrom(OneofOptions.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static OneofOptions parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (OneofOptions)GeneratedMessageLite.parseFrom(OneofOptions.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static OneofOptions parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (OneofOptions)GeneratedMessageLite.parseFrom(OneofOptions.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static OneofOptions parseFrom(InputStream inputStream0) throws IOException {
            return (OneofOptions)GeneratedMessageLite.parseFrom(OneofOptions.DEFAULT_INSTANCE, inputStream0);
        }

        public static OneofOptions parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (OneofOptions)GeneratedMessageLite.parseFrom(OneofOptions.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static OneofOptions parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (OneofOptions)GeneratedMessageLite.parseFrom(OneofOptions.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static OneofOptions parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (OneofOptions)GeneratedMessageLite.parseFrom(OneofOptions.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static OneofOptions parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (OneofOptions)GeneratedMessageLite.parseFrom(OneofOptions.DEFAULT_INSTANCE, arr_b);
        }

        public static OneofOptions parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (OneofOptions)GeneratedMessageLite.parseFrom(OneofOptions.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return OneofOptions.DEFAULT_INSTANCE.getParserForType();
        }

        private void removeUninterpretedOption(int v) {
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(v);
        }

        private void setUninterpretedOption(int v, UninterpretedOption descriptorProtos$UninterpretedOption0) {
            descriptorProtos$UninterpretedOption0.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(v, descriptorProtos$UninterpretedOption0);
        }
    }

    public interface OneofOptionsOrBuilder extends ExtendableMessageOrBuilder {
        UninterpretedOption getUninterpretedOption(int arg1);

        int getUninterpretedOptionCount();

        List getUninterpretedOptionList();
    }

    public static final class ServiceDescriptorProto extends GeneratedMessageLite implements ServiceDescriptorProtoOrBuilder {
        public static final class com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements ServiceDescriptorProtoOrBuilder {
            private com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder() {
                super(ServiceDescriptorProto.DEFAULT_INSTANCE);
            }

            com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder(a descriptorProtos$a0) {
            }

            public com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder addAllMethod(Iterable iterable0) {
                this.copyOnWrite();
                ((ServiceDescriptorProto)this.instance).addAllMethod(iterable0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder addMethod(int v, com.google.protobuf.DescriptorProtos.MethodDescriptorProto.Builder descriptorProtos$MethodDescriptorProto$Builder0) {
                this.copyOnWrite();
                ((ServiceDescriptorProto)this.instance).addMethod(v, ((MethodDescriptorProto)descriptorProtos$MethodDescriptorProto$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder addMethod(int v, MethodDescriptorProto descriptorProtos$MethodDescriptorProto0) {
                this.copyOnWrite();
                ((ServiceDescriptorProto)this.instance).addMethod(v, descriptorProtos$MethodDescriptorProto0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder addMethod(com.google.protobuf.DescriptorProtos.MethodDescriptorProto.Builder descriptorProtos$MethodDescriptorProto$Builder0) {
                this.copyOnWrite();
                ((ServiceDescriptorProto)this.instance).addMethod(((MethodDescriptorProto)descriptorProtos$MethodDescriptorProto$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder addMethod(MethodDescriptorProto descriptorProtos$MethodDescriptorProto0) {
                this.copyOnWrite();
                ((ServiceDescriptorProto)this.instance).addMethod(descriptorProtos$MethodDescriptorProto0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder clearMethod() {
                this.copyOnWrite();
                ((ServiceDescriptorProto)this.instance).clearMethod();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder clearName() {
                this.copyOnWrite();
                ((ServiceDescriptorProto)this.instance).clearName();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder clearOptions() {
                this.copyOnWrite();
                ((ServiceDescriptorProto)this.instance).clearOptions();
                return this;
            }

            @Override  // com.google.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
            public MethodDescriptorProto getMethod(int v) {
                return ((ServiceDescriptorProto)this.instance).getMethod(v);
            }

            @Override  // com.google.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
            public int getMethodCount() {
                return ((ServiceDescriptorProto)this.instance).getMethodCount();
            }

            @Override  // com.google.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
            public List getMethodList() {
                return DesugarCollections.unmodifiableList(((ServiceDescriptorProto)this.instance).getMethodList());
            }

            @Override  // com.google.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
            public String getName() {
                return ((ServiceDescriptorProto)this.instance).getName();
            }

            @Override  // com.google.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
            public ByteString getNameBytes() {
                return ((ServiceDescriptorProto)this.instance).getNameBytes();
            }

            @Override  // com.google.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
            public ServiceOptions getOptions() {
                return ((ServiceDescriptorProto)this.instance).getOptions();
            }

            @Override  // com.google.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
            public boolean hasName() {
                return ((ServiceDescriptorProto)this.instance).hasName();
            }

            @Override  // com.google.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
            public boolean hasOptions() {
                return ((ServiceDescriptorProto)this.instance).hasOptions();
            }

            public com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder mergeOptions(ServiceOptions descriptorProtos$ServiceOptions0) {
                this.copyOnWrite();
                ((ServiceDescriptorProto)this.instance).mergeOptions(descriptorProtos$ServiceOptions0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder removeMethod(int v) {
                this.copyOnWrite();
                ((ServiceDescriptorProto)this.instance).removeMethod(v);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder setMethod(int v, com.google.protobuf.DescriptorProtos.MethodDescriptorProto.Builder descriptorProtos$MethodDescriptorProto$Builder0) {
                this.copyOnWrite();
                ((ServiceDescriptorProto)this.instance).setMethod(v, ((MethodDescriptorProto)descriptorProtos$MethodDescriptorProto$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder setMethod(int v, MethodDescriptorProto descriptorProtos$MethodDescriptorProto0) {
                this.copyOnWrite();
                ((ServiceDescriptorProto)this.instance).setMethod(v, descriptorProtos$MethodDescriptorProto0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder setName(String s) {
                this.copyOnWrite();
                ((ServiceDescriptorProto)this.instance).setName(s);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder setNameBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((ServiceDescriptorProto)this.instance).setNameBytes(byteString0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder setOptions(com.google.protobuf.DescriptorProtos.ServiceOptions.Builder descriptorProtos$ServiceOptions$Builder0) {
                this.copyOnWrite();
                ((ServiceDescriptorProto)this.instance).setOptions(((ServiceOptions)descriptorProtos$ServiceOptions$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder setOptions(ServiceOptions descriptorProtos$ServiceOptions0) {
                this.copyOnWrite();
                ((ServiceDescriptorProto)this.instance).setOptions(descriptorProtos$ServiceOptions0);
                return this;
            }
        }

        private static final ServiceDescriptorProto DEFAULT_INSTANCE = null;
        public static final int METHOD_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private static volatile Parser PARSER;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private ProtobufList method_;
        private String name_;
        private ServiceOptions options_;

        static {
            ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto0 = new ServiceDescriptorProto();
            ServiceDescriptorProto.DEFAULT_INSTANCE = descriptorProtos$ServiceDescriptorProto0;
            GeneratedMessageLite.registerDefaultInstance(ServiceDescriptorProto.class, descriptorProtos$ServiceDescriptorProto0);
        }

        private ServiceDescriptorProto() {
            this.memoizedIsInitialized = 2;
            this.name_ = "";
            this.method_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void addAllMethod(Iterable iterable0) {
            this.ensureMethodIsMutable();
            AbstractMessageLite.addAll(iterable0, this.method_);
        }

        private void addMethod(int v, MethodDescriptorProto descriptorProtos$MethodDescriptorProto0) {
            descriptorProtos$MethodDescriptorProto0.getClass();
            this.ensureMethodIsMutable();
            this.method_.add(v, descriptorProtos$MethodDescriptorProto0);
        }

        private void addMethod(MethodDescriptorProto descriptorProtos$MethodDescriptorProto0) {
            descriptorProtos$MethodDescriptorProto0.getClass();
            this.ensureMethodIsMutable();
            this.method_.add(descriptorProtos$MethodDescriptorProto0);
        }

        private void clearMethod() {
            this.method_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearName() {
            this.bitField0_ &= -2;
            this.name_ = "";
        }

        private void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -3;
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            int v = 1;
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new ServiceDescriptorProto();
                }
                case 2: {
                    return new com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(ServiceDescriptorProto.DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001ဈ\u0000\u0002Л\u0003ᐉ\u0001", new Object[]{"bitField0_", "name_", "method_", MethodDescriptorProto.class, "options_"});
                }
                case 4: {
                    return ServiceDescriptorProto.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = ServiceDescriptorProto.PARSER;
                    if(parser0 == null) {
                        synchronized(ServiceDescriptorProto.class) {
                            parser0 = ServiceDescriptorProto.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(ServiceDescriptorProto.DEFAULT_INSTANCE);
                                ServiceDescriptorProto.PARSER = parser0;
                            }
                        }
                    }
                    return parser0;
                }
                case 6: {
                    return this.memoizedIsInitialized;
                }
                case 7: {
                    if(object0 == null) {
                        v = 0;
                    }
                    this.memoizedIsInitialized = (byte)v;
                    return null;
                }
                default: {
                    throw new UnsupportedOperationException();
                }
            }
        }

        private void ensureMethodIsMutable() {
            ProtobufList internal$ProtobufList0 = this.method_;
            if(!internal$ProtobufList0.isModifiable()) {
                this.method_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
            }
        }

        public static ServiceDescriptorProto getDefaultInstance() {
            return ServiceDescriptorProto.DEFAULT_INSTANCE;
        }

        @Override  // com.google.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
        public MethodDescriptorProto getMethod(int v) {
            return (MethodDescriptorProto)this.method_.get(v);
        }

        @Override  // com.google.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
        public int getMethodCount() {
            return this.method_.size();
        }

        @Override  // com.google.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
        public List getMethodList() {
            return this.method_;
        }

        public MethodDescriptorProtoOrBuilder getMethodOrBuilder(int v) {
            return (MethodDescriptorProtoOrBuilder)this.method_.get(v);
        }

        public List getMethodOrBuilderList() {
            return this.method_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override  // com.google.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
        public ServiceOptions getOptions() {
            return this.options_ == null ? ServiceOptions.getDefaultInstance() : this.options_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$ServiceDescriptorProtoOrBuilder
        public boolean hasOptions() {
            return (this.bitField0_ & 2) != 0;
        }

        private void mergeOptions(ServiceOptions descriptorProtos$ServiceOptions0) {
            descriptorProtos$ServiceOptions0.getClass();
            this.options_ = this.options_ == null || this.options_ == ServiceOptions.getDefaultInstance() ? descriptorProtos$ServiceOptions0 : ((ServiceOptions)((com.google.protobuf.DescriptorProtos.ServiceOptions.Builder)ServiceOptions.newBuilder(this.options_).mergeFrom(descriptorProtos$ServiceOptions0)).buildPartial());
            this.bitField0_ |= 2;
        }

        public static com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder newBuilder() {
            return (com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder)ServiceDescriptorProto.DEFAULT_INSTANCE.createBuilder();
        }

        public static com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder newBuilder(ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto0) {
            return (com.google.protobuf.DescriptorProtos.ServiceDescriptorProto.Builder)ServiceDescriptorProto.DEFAULT_INSTANCE.createBuilder(descriptorProtos$ServiceDescriptorProto0);
        }

        public static ServiceDescriptorProto parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (ServiceDescriptorProto)GeneratedMessageLite.parseDelimitedFrom(ServiceDescriptorProto.DEFAULT_INSTANCE, inputStream0);
        }

        public static ServiceDescriptorProto parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (ServiceDescriptorProto)GeneratedMessageLite.parseDelimitedFrom(ServiceDescriptorProto.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static ServiceDescriptorProto parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (ServiceDescriptorProto)GeneratedMessageLite.parseFrom(ServiceDescriptorProto.DEFAULT_INSTANCE, byteString0);
        }

        public static ServiceDescriptorProto parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (ServiceDescriptorProto)GeneratedMessageLite.parseFrom(ServiceDescriptorProto.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static ServiceDescriptorProto parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (ServiceDescriptorProto)GeneratedMessageLite.parseFrom(ServiceDescriptorProto.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static ServiceDescriptorProto parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (ServiceDescriptorProto)GeneratedMessageLite.parseFrom(ServiceDescriptorProto.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static ServiceDescriptorProto parseFrom(InputStream inputStream0) throws IOException {
            return (ServiceDescriptorProto)GeneratedMessageLite.parseFrom(ServiceDescriptorProto.DEFAULT_INSTANCE, inputStream0);
        }

        public static ServiceDescriptorProto parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (ServiceDescriptorProto)GeneratedMessageLite.parseFrom(ServiceDescriptorProto.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static ServiceDescriptorProto parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (ServiceDescriptorProto)GeneratedMessageLite.parseFrom(ServiceDescriptorProto.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static ServiceDescriptorProto parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (ServiceDescriptorProto)GeneratedMessageLite.parseFrom(ServiceDescriptorProto.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static ServiceDescriptorProto parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (ServiceDescriptorProto)GeneratedMessageLite.parseFrom(ServiceDescriptorProto.DEFAULT_INSTANCE, arr_b);
        }

        public static ServiceDescriptorProto parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (ServiceDescriptorProto)GeneratedMessageLite.parseFrom(ServiceDescriptorProto.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return ServiceDescriptorProto.DEFAULT_INSTANCE.getParserForType();
        }

        private void removeMethod(int v) {
            this.ensureMethodIsMutable();
            this.method_.remove(v);
        }

        private void setMethod(int v, MethodDescriptorProto descriptorProtos$MethodDescriptorProto0) {
            descriptorProtos$MethodDescriptorProto0.getClass();
            this.ensureMethodIsMutable();
            this.method_.set(v, descriptorProtos$MethodDescriptorProto0);
        }

        private void setName(String s) {
            s.getClass();
            this.bitField0_ |= 1;
            this.name_ = s;
        }

        private void setNameBytes(ByteString byteString0) {
            this.name_ = byteString0.toStringUtf8();
            this.bitField0_ |= 1;
        }

        private void setOptions(ServiceOptions descriptorProtos$ServiceOptions0) {
            descriptorProtos$ServiceOptions0.getClass();
            this.options_ = descriptorProtos$ServiceOptions0;
            this.bitField0_ |= 2;
        }
    }

    public interface ServiceDescriptorProtoOrBuilder extends MessageLiteOrBuilder {
        MethodDescriptorProto getMethod(int arg1);

        int getMethodCount();

        List getMethodList();

        String getName();

        ByteString getNameBytes();

        ServiceOptions getOptions();

        boolean hasName();

        boolean hasOptions();
    }

    public static final class ServiceOptions extends ExtendableMessage implements ServiceOptionsOrBuilder {
        public static final class com.google.protobuf.DescriptorProtos.ServiceOptions.Builder extends ExtendableBuilder implements ServiceOptionsOrBuilder {
            private com.google.protobuf.DescriptorProtos.ServiceOptions.Builder() {
                super(ServiceOptions.DEFAULT_INSTANCE);
            }

            com.google.protobuf.DescriptorProtos.ServiceOptions.Builder(a descriptorProtos$a0) {
            }

            public com.google.protobuf.DescriptorProtos.ServiceOptions.Builder addAllUninterpretedOption(Iterable iterable0) {
                this.copyOnWrite();
                ((ServiceOptions)this.instance).addAllUninterpretedOption(iterable0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.ServiceOptions.Builder addUninterpretedOption(int v, com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder descriptorProtos$UninterpretedOption$Builder0) {
                this.copyOnWrite();
                ((ServiceOptions)this.instance).addUninterpretedOption(v, ((UninterpretedOption)descriptorProtos$UninterpretedOption$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.ServiceOptions.Builder addUninterpretedOption(int v, UninterpretedOption descriptorProtos$UninterpretedOption0) {
                this.copyOnWrite();
                ((ServiceOptions)this.instance).addUninterpretedOption(v, descriptorProtos$UninterpretedOption0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.ServiceOptions.Builder addUninterpretedOption(com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder descriptorProtos$UninterpretedOption$Builder0) {
                this.copyOnWrite();
                ((ServiceOptions)this.instance).addUninterpretedOption(((UninterpretedOption)descriptorProtos$UninterpretedOption$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.ServiceOptions.Builder addUninterpretedOption(UninterpretedOption descriptorProtos$UninterpretedOption0) {
                this.copyOnWrite();
                ((ServiceOptions)this.instance).addUninterpretedOption(descriptorProtos$UninterpretedOption0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.ServiceOptions.Builder clearDeprecated() {
                this.copyOnWrite();
                ((ServiceOptions)this.instance).clearDeprecated();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.ServiceOptions.Builder clearUninterpretedOption() {
                this.copyOnWrite();
                ((ServiceOptions)this.instance).clearUninterpretedOption();
                return this;
            }

            @Override  // com.google.protobuf.DescriptorProtos$ServiceOptionsOrBuilder
            public boolean getDeprecated() {
                return ((ServiceOptions)this.instance).getDeprecated();
            }

            @Override  // com.google.protobuf.DescriptorProtos$ServiceOptionsOrBuilder
            public UninterpretedOption getUninterpretedOption(int v) {
                return ((ServiceOptions)this.instance).getUninterpretedOption(v);
            }

            @Override  // com.google.protobuf.DescriptorProtos$ServiceOptionsOrBuilder
            public int getUninterpretedOptionCount() {
                return ((ServiceOptions)this.instance).getUninterpretedOptionCount();
            }

            @Override  // com.google.protobuf.DescriptorProtos$ServiceOptionsOrBuilder
            public List getUninterpretedOptionList() {
                return DesugarCollections.unmodifiableList(((ServiceOptions)this.instance).getUninterpretedOptionList());
            }

            @Override  // com.google.protobuf.DescriptorProtos$ServiceOptionsOrBuilder
            public boolean hasDeprecated() {
                return ((ServiceOptions)this.instance).hasDeprecated();
            }

            public com.google.protobuf.DescriptorProtos.ServiceOptions.Builder removeUninterpretedOption(int v) {
                this.copyOnWrite();
                ((ServiceOptions)this.instance).removeUninterpretedOption(v);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.ServiceOptions.Builder setDeprecated(boolean z) {
                this.copyOnWrite();
                ((ServiceOptions)this.instance).setDeprecated(z);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.ServiceOptions.Builder setUninterpretedOption(int v, com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder descriptorProtos$UninterpretedOption$Builder0) {
                this.copyOnWrite();
                ((ServiceOptions)this.instance).setUninterpretedOption(v, ((UninterpretedOption)descriptorProtos$UninterpretedOption$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.ServiceOptions.Builder setUninterpretedOption(int v, UninterpretedOption descriptorProtos$UninterpretedOption0) {
                this.copyOnWrite();
                ((ServiceOptions)this.instance).setUninterpretedOption(v, descriptorProtos$UninterpretedOption0);
                return this;
            }
        }

        private static final ServiceOptions DEFAULT_INSTANCE = null;
        public static final int DEPRECATED_FIELD_NUMBER = 33;
        private static volatile Parser PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean deprecated_;
        private byte memoizedIsInitialized;
        private ProtobufList uninterpretedOption_;

        static {
            ServiceOptions descriptorProtos$ServiceOptions0 = new ServiceOptions();
            ServiceOptions.DEFAULT_INSTANCE = descriptorProtos$ServiceOptions0;
            GeneratedMessageLite.registerDefaultInstance(ServiceOptions.class, descriptorProtos$ServiceOptions0);
        }

        private ServiceOptions() {
            this.memoizedIsInitialized = 2;
            this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void addAllUninterpretedOption(Iterable iterable0) {
            this.ensureUninterpretedOptionIsMutable();
            AbstractMessageLite.addAll(iterable0, this.uninterpretedOption_);
        }

        private void addUninterpretedOption(int v, UninterpretedOption descriptorProtos$UninterpretedOption0) {
            descriptorProtos$UninterpretedOption0.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(v, descriptorProtos$UninterpretedOption0);
        }

        private void addUninterpretedOption(UninterpretedOption descriptorProtos$UninterpretedOption0) {
            descriptorProtos$UninterpretedOption0.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(descriptorProtos$UninterpretedOption0);
        }

        private void clearDeprecated() {
            this.bitField0_ &= -2;
            this.deprecated_ = false;
        }

        private void clearUninterpretedOption() {
            this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            int v = 1;
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new ServiceOptions();
                }
                case 2: {
                    return new com.google.protobuf.DescriptorProtos.ServiceOptions.Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(ServiceOptions.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001!ϧ\u0002\u0000\u0001\u0001!ဇ\u0000ϧЛ", new Object[]{"bitField0_", "deprecated_", "uninterpretedOption_", UninterpretedOption.class});
                }
                case 4: {
                    return ServiceOptions.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = ServiceOptions.PARSER;
                    if(parser0 == null) {
                        synchronized(ServiceOptions.class) {
                            parser0 = ServiceOptions.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(ServiceOptions.DEFAULT_INSTANCE);
                                ServiceOptions.PARSER = parser0;
                            }
                        }
                    }
                    return parser0;
                }
                case 6: {
                    return this.memoizedIsInitialized;
                }
                case 7: {
                    if(object0 == null) {
                        v = 0;
                    }
                    this.memoizedIsInitialized = (byte)v;
                    return null;
                }
                default: {
                    throw new UnsupportedOperationException();
                }
            }
        }

        private void ensureUninterpretedOptionIsMutable() {
            ProtobufList internal$ProtobufList0 = this.uninterpretedOption_;
            if(!internal$ProtobufList0.isModifiable()) {
                this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
            }
        }

        public static ServiceOptions getDefaultInstance() {
            return ServiceOptions.DEFAULT_INSTANCE;
        }

        @Override  // com.google.protobuf.DescriptorProtos$ServiceOptionsOrBuilder
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$ServiceOptionsOrBuilder
        public UninterpretedOption getUninterpretedOption(int v) {
            return (UninterpretedOption)this.uninterpretedOption_.get(v);
        }

        @Override  // com.google.protobuf.DescriptorProtos$ServiceOptionsOrBuilder
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override  // com.google.protobuf.DescriptorProtos$ServiceOptionsOrBuilder
        public List getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int v) {
            return (UninterpretedOptionOrBuilder)this.uninterpretedOption_.get(v);
        }

        public List getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$ServiceOptionsOrBuilder
        public boolean hasDeprecated() {
            return (this.bitField0_ & 1) != 0;
        }

        public static com.google.protobuf.DescriptorProtos.ServiceOptions.Builder newBuilder() {
            return (com.google.protobuf.DescriptorProtos.ServiceOptions.Builder)ServiceOptions.DEFAULT_INSTANCE.createBuilder();
        }

        public static com.google.protobuf.DescriptorProtos.ServiceOptions.Builder newBuilder(ServiceOptions descriptorProtos$ServiceOptions0) {
            return (com.google.protobuf.DescriptorProtos.ServiceOptions.Builder)ServiceOptions.DEFAULT_INSTANCE.createBuilder(descriptorProtos$ServiceOptions0);
        }

        public static ServiceOptions parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (ServiceOptions)GeneratedMessageLite.parseDelimitedFrom(ServiceOptions.DEFAULT_INSTANCE, inputStream0);
        }

        public static ServiceOptions parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (ServiceOptions)GeneratedMessageLite.parseDelimitedFrom(ServiceOptions.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static ServiceOptions parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (ServiceOptions)GeneratedMessageLite.parseFrom(ServiceOptions.DEFAULT_INSTANCE, byteString0);
        }

        public static ServiceOptions parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (ServiceOptions)GeneratedMessageLite.parseFrom(ServiceOptions.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static ServiceOptions parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (ServiceOptions)GeneratedMessageLite.parseFrom(ServiceOptions.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static ServiceOptions parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (ServiceOptions)GeneratedMessageLite.parseFrom(ServiceOptions.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static ServiceOptions parseFrom(InputStream inputStream0) throws IOException {
            return (ServiceOptions)GeneratedMessageLite.parseFrom(ServiceOptions.DEFAULT_INSTANCE, inputStream0);
        }

        public static ServiceOptions parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (ServiceOptions)GeneratedMessageLite.parseFrom(ServiceOptions.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static ServiceOptions parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (ServiceOptions)GeneratedMessageLite.parseFrom(ServiceOptions.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static ServiceOptions parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (ServiceOptions)GeneratedMessageLite.parseFrom(ServiceOptions.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static ServiceOptions parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (ServiceOptions)GeneratedMessageLite.parseFrom(ServiceOptions.DEFAULT_INSTANCE, arr_b);
        }

        public static ServiceOptions parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (ServiceOptions)GeneratedMessageLite.parseFrom(ServiceOptions.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return ServiceOptions.DEFAULT_INSTANCE.getParserForType();
        }

        private void removeUninterpretedOption(int v) {
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(v);
        }

        private void setDeprecated(boolean z) {
            this.bitField0_ |= 1;
            this.deprecated_ = z;
        }

        private void setUninterpretedOption(int v, UninterpretedOption descriptorProtos$UninterpretedOption0) {
            descriptorProtos$UninterpretedOption0.getClass();
            this.ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(v, descriptorProtos$UninterpretedOption0);
        }
    }

    public interface ServiceOptionsOrBuilder extends ExtendableMessageOrBuilder {
        boolean getDeprecated();

        UninterpretedOption getUninterpretedOption(int arg1);

        int getUninterpretedOptionCount();

        List getUninterpretedOptionList();

        boolean hasDeprecated();
    }

    public static final class SourceCodeInfo extends GeneratedMessageLite implements SourceCodeInfoOrBuilder {
        public static final class com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements SourceCodeInfoOrBuilder {
            private com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder() {
                super(SourceCodeInfo.DEFAULT_INSTANCE);
            }

            com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder(a descriptorProtos$a0) {
            }

            public com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder addAllLocation(Iterable iterable0) {
                this.copyOnWrite();
                ((SourceCodeInfo)this.instance).addAllLocation(iterable0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder addLocation(int v, com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.Builder descriptorProtos$SourceCodeInfo$Location$Builder0) {
                this.copyOnWrite();
                ((SourceCodeInfo)this.instance).addLocation(v, ((Location)descriptorProtos$SourceCodeInfo$Location$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder addLocation(int v, Location descriptorProtos$SourceCodeInfo$Location0) {
                this.copyOnWrite();
                ((SourceCodeInfo)this.instance).addLocation(v, descriptorProtos$SourceCodeInfo$Location0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder addLocation(com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.Builder descriptorProtos$SourceCodeInfo$Location$Builder0) {
                this.copyOnWrite();
                ((SourceCodeInfo)this.instance).addLocation(((Location)descriptorProtos$SourceCodeInfo$Location$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder addLocation(Location descriptorProtos$SourceCodeInfo$Location0) {
                this.copyOnWrite();
                ((SourceCodeInfo)this.instance).addLocation(descriptorProtos$SourceCodeInfo$Location0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder clearLocation() {
                this.copyOnWrite();
                ((SourceCodeInfo)this.instance).clearLocation();
                return this;
            }

            @Override  // com.google.protobuf.DescriptorProtos$SourceCodeInfoOrBuilder
            public Location getLocation(int v) {
                return ((SourceCodeInfo)this.instance).getLocation(v);
            }

            @Override  // com.google.protobuf.DescriptorProtos$SourceCodeInfoOrBuilder
            public int getLocationCount() {
                return ((SourceCodeInfo)this.instance).getLocationCount();
            }

            @Override  // com.google.protobuf.DescriptorProtos$SourceCodeInfoOrBuilder
            public List getLocationList() {
                return DesugarCollections.unmodifiableList(((SourceCodeInfo)this.instance).getLocationList());
            }

            public com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder removeLocation(int v) {
                this.copyOnWrite();
                ((SourceCodeInfo)this.instance).removeLocation(v);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder setLocation(int v, com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.Builder descriptorProtos$SourceCodeInfo$Location$Builder0) {
                this.copyOnWrite();
                ((SourceCodeInfo)this.instance).setLocation(v, ((Location)descriptorProtos$SourceCodeInfo$Location$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder setLocation(int v, Location descriptorProtos$SourceCodeInfo$Location0) {
                this.copyOnWrite();
                ((SourceCodeInfo)this.instance).setLocation(v, descriptorProtos$SourceCodeInfo$Location0);
                return this;
            }
        }

        public static final class Location extends GeneratedMessageLite implements LocationOrBuilder {
            public static final class com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements LocationOrBuilder {
                private com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.Builder() {
                    super(Location.DEFAULT_INSTANCE);
                }

                com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.Builder(a descriptorProtos$a0) {
                }

                public com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.Builder addAllLeadingDetachedComments(Iterable iterable0) {
                    this.copyOnWrite();
                    ((Location)this.instance).addAllLeadingDetachedComments(iterable0);
                    return this;
                }

                public com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.Builder addAllPath(Iterable iterable0) {
                    this.copyOnWrite();
                    ((Location)this.instance).addAllPath(iterable0);
                    return this;
                }

                public com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.Builder addAllSpan(Iterable iterable0) {
                    this.copyOnWrite();
                    ((Location)this.instance).addAllSpan(iterable0);
                    return this;
                }

                public com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.Builder addLeadingDetachedComments(String s) {
                    this.copyOnWrite();
                    ((Location)this.instance).addLeadingDetachedComments(s);
                    return this;
                }

                public com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.Builder addLeadingDetachedCommentsBytes(ByteString byteString0) {
                    this.copyOnWrite();
                    ((Location)this.instance).addLeadingDetachedCommentsBytes(byteString0);
                    return this;
                }

                public com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.Builder addPath(int v) {
                    this.copyOnWrite();
                    ((Location)this.instance).addPath(v);
                    return this;
                }

                public com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.Builder addSpan(int v) {
                    this.copyOnWrite();
                    ((Location)this.instance).addSpan(v);
                    return this;
                }

                public com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.Builder clearLeadingComments() {
                    this.copyOnWrite();
                    ((Location)this.instance).clearLeadingComments();
                    return this;
                }

                public com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.Builder clearLeadingDetachedComments() {
                    this.copyOnWrite();
                    ((Location)this.instance).clearLeadingDetachedComments();
                    return this;
                }

                public com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.Builder clearPath() {
                    this.copyOnWrite();
                    ((Location)this.instance).clearPath();
                    return this;
                }

                public com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.Builder clearSpan() {
                    this.copyOnWrite();
                    ((Location)this.instance).clearSpan();
                    return this;
                }

                public com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.Builder clearTrailingComments() {
                    this.copyOnWrite();
                    ((Location)this.instance).clearTrailingComments();
                    return this;
                }

                @Override  // com.google.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
                public String getLeadingComments() {
                    return ((Location)this.instance).getLeadingComments();
                }

                @Override  // com.google.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
                public ByteString getLeadingCommentsBytes() {
                    return ((Location)this.instance).getLeadingCommentsBytes();
                }

                @Override  // com.google.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
                public String getLeadingDetachedComments(int v) {
                    return ((Location)this.instance).getLeadingDetachedComments(v);
                }

                @Override  // com.google.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
                public ByteString getLeadingDetachedCommentsBytes(int v) {
                    return ((Location)this.instance).getLeadingDetachedCommentsBytes(v);
                }

                @Override  // com.google.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
                public int getLeadingDetachedCommentsCount() {
                    return ((Location)this.instance).getLeadingDetachedCommentsCount();
                }

                @Override  // com.google.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
                public List getLeadingDetachedCommentsList() {
                    return DesugarCollections.unmodifiableList(((Location)this.instance).getLeadingDetachedCommentsList());
                }

                @Override  // com.google.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
                public int getPath(int v) {
                    return ((Location)this.instance).getPath(v);
                }

                @Override  // com.google.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
                public int getPathCount() {
                    return ((Location)this.instance).getPathCount();
                }

                @Override  // com.google.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
                public List getPathList() {
                    return DesugarCollections.unmodifiableList(((Location)this.instance).getPathList());
                }

                @Override  // com.google.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
                public int getSpan(int v) {
                    return ((Location)this.instance).getSpan(v);
                }

                @Override  // com.google.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
                public int getSpanCount() {
                    return ((Location)this.instance).getSpanCount();
                }

                @Override  // com.google.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
                public List getSpanList() {
                    return DesugarCollections.unmodifiableList(((Location)this.instance).getSpanList());
                }

                @Override  // com.google.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
                public String getTrailingComments() {
                    return ((Location)this.instance).getTrailingComments();
                }

                @Override  // com.google.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
                public ByteString getTrailingCommentsBytes() {
                    return ((Location)this.instance).getTrailingCommentsBytes();
                }

                @Override  // com.google.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
                public boolean hasLeadingComments() {
                    return ((Location)this.instance).hasLeadingComments();
                }

                @Override  // com.google.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
                public boolean hasTrailingComments() {
                    return ((Location)this.instance).hasTrailingComments();
                }

                public com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.Builder setLeadingComments(String s) {
                    this.copyOnWrite();
                    ((Location)this.instance).setLeadingComments(s);
                    return this;
                }

                public com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.Builder setLeadingCommentsBytes(ByteString byteString0) {
                    this.copyOnWrite();
                    ((Location)this.instance).setLeadingCommentsBytes(byteString0);
                    return this;
                }

                public com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.Builder setLeadingDetachedComments(int v, String s) {
                    this.copyOnWrite();
                    ((Location)this.instance).setLeadingDetachedComments(v, s);
                    return this;
                }

                public com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.Builder setPath(int v, int v1) {
                    this.copyOnWrite();
                    ((Location)this.instance).setPath(v, v1);
                    return this;
                }

                public com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.Builder setSpan(int v, int v1) {
                    this.copyOnWrite();
                    ((Location)this.instance).setSpan(v, v1);
                    return this;
                }

                public com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.Builder setTrailingComments(String s) {
                    this.copyOnWrite();
                    ((Location)this.instance).setTrailingComments(s);
                    return this;
                }

                public com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.Builder setTrailingCommentsBytes(ByteString byteString0) {
                    this.copyOnWrite();
                    ((Location)this.instance).setTrailingCommentsBytes(byteString0);
                    return this;
                }
            }

            private static final Location DEFAULT_INSTANCE = null;
            public static final int LEADING_COMMENTS_FIELD_NUMBER = 3;
            public static final int LEADING_DETACHED_COMMENTS_FIELD_NUMBER = 6;
            private static volatile Parser PARSER = null;
            public static final int PATH_FIELD_NUMBER = 1;
            public static final int SPAN_FIELD_NUMBER = 2;
            public static final int TRAILING_COMMENTS_FIELD_NUMBER = 4;
            private int bitField0_;
            private String leadingComments_;
            private ProtobufList leadingDetachedComments_;
            private int pathMemoizedSerializedSize;
            private IntList path_;
            private int spanMemoizedSerializedSize;
            private IntList span_;
            private String trailingComments_;

            static {
                Location descriptorProtos$SourceCodeInfo$Location0 = new Location();
                Location.DEFAULT_INSTANCE = descriptorProtos$SourceCodeInfo$Location0;
                GeneratedMessageLite.registerDefaultInstance(Location.class, descriptorProtos$SourceCodeInfo$Location0);
            }

            private Location() {
                this.pathMemoizedSerializedSize = -1;
                this.spanMemoizedSerializedSize = -1;
                this.path_ = GeneratedMessageLite.emptyIntList();
                this.span_ = GeneratedMessageLite.emptyIntList();
                this.leadingComments_ = "";
                this.trailingComments_ = "";
                this.leadingDetachedComments_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void addAllLeadingDetachedComments(Iterable iterable0) {
                this.ensureLeadingDetachedCommentsIsMutable();
                AbstractMessageLite.addAll(iterable0, this.leadingDetachedComments_);
            }

            private void addAllPath(Iterable iterable0) {
                this.ensurePathIsMutable();
                AbstractMessageLite.addAll(iterable0, this.path_);
            }

            private void addAllSpan(Iterable iterable0) {
                this.ensureSpanIsMutable();
                AbstractMessageLite.addAll(iterable0, this.span_);
            }

            private void addLeadingDetachedComments(String s) {
                s.getClass();
                this.ensureLeadingDetachedCommentsIsMutable();
                this.leadingDetachedComments_.add(s);
            }

            private void addLeadingDetachedCommentsBytes(ByteString byteString0) {
                this.ensureLeadingDetachedCommentsIsMutable();
                this.leadingDetachedComments_.add(byteString0.toStringUtf8());
            }

            private void addPath(int v) {
                this.ensurePathIsMutable();
                this.path_.addInt(v);
            }

            private void addSpan(int v) {
                this.ensureSpanIsMutable();
                this.span_.addInt(v);
            }

            private void clearLeadingComments() {
                this.bitField0_ &= -2;
                this.leadingComments_ = Location.getDefaultInstance().getLeadingComments();
            }

            private void clearLeadingDetachedComments() {
                this.leadingDetachedComments_ = GeneratedMessageLite.emptyProtobufList();
            }

            private void clearPath() {
                this.path_ = GeneratedMessageLite.emptyIntList();
            }

            private void clearSpan() {
                this.span_ = GeneratedMessageLite.emptyIntList();
            }

            private void clearTrailingComments() {
                this.bitField0_ &= -3;
                this.trailingComments_ = "";
            }

            @Override  // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
                switch(generatedMessageLite$MethodToInvoke0) {
                    case 1: {
                        return new Location();
                    }
                    case 2: {
                        return new com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.Builder(null);
                    }
                    case 3: {
                        return GeneratedMessageLite.newMessageInfo(Location.DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0003\u0000\u0001\'\u0002\'\u0003ဈ\u0000\u0004ဈ\u0001\u0006\u001A", new Object[]{"bitField0_", "path_", "span_", "leadingComments_", "trailingComments_", "leadingDetachedComments_"});
                    }
                    case 4: {
                        return Location.DEFAULT_INSTANCE;
                    }
                    case 5: {
                        Parser parser0 = Location.PARSER;
                        if(parser0 == null) {
                            Class class0 = Location.class;
                            synchronized(class0) {
                                parser0 = Location.PARSER;
                                if(parser0 == null) {
                                    parser0 = new DefaultInstanceBasedParser(Location.DEFAULT_INSTANCE);
                                    Location.PARSER = parser0;
                                }
                            }
                        }
                        return parser0;
                    }
                    case 6: {
                        return (byte)1;
                    }
                    case 7: {
                        return null;
                    }
                    default: {
                        throw new UnsupportedOperationException();
                    }
                }
            }

            private void ensureLeadingDetachedCommentsIsMutable() {
                ProtobufList internal$ProtobufList0 = this.leadingDetachedComments_;
                if(!internal$ProtobufList0.isModifiable()) {
                    this.leadingDetachedComments_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
                }
            }

            private void ensurePathIsMutable() {
                IntList internal$IntList0 = this.path_;
                if(!internal$IntList0.isModifiable()) {
                    this.path_ = GeneratedMessageLite.mutableCopy(internal$IntList0);
                }
            }

            private void ensureSpanIsMutable() {
                IntList internal$IntList0 = this.span_;
                if(!internal$IntList0.isModifiable()) {
                    this.span_ = GeneratedMessageLite.mutableCopy(internal$IntList0);
                }
            }

            public static Location getDefaultInstance() {
                return Location.DEFAULT_INSTANCE;
            }

            @Override  // com.google.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
            public String getLeadingComments() {
                return this.leadingComments_;
            }

            @Override  // com.google.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
            public ByteString getLeadingCommentsBytes() {
                return ByteString.copyFromUtf8(this.leadingComments_);
            }

            @Override  // com.google.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
            public String getLeadingDetachedComments(int v) {
                return (String)this.leadingDetachedComments_.get(v);
            }

            @Override  // com.google.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
            public ByteString getLeadingDetachedCommentsBytes(int v) {
                return ByteString.copyFromUtf8(((String)this.leadingDetachedComments_.get(v)));
            }

            @Override  // com.google.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
            public int getLeadingDetachedCommentsCount() {
                return this.leadingDetachedComments_.size();
            }

            @Override  // com.google.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
            public List getLeadingDetachedCommentsList() {
                return this.leadingDetachedComments_;
            }

            @Override  // com.google.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
            public int getPath(int v) {
                return this.path_.getInt(v);
            }

            @Override  // com.google.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
            public int getPathCount() {
                return this.path_.size();
            }

            @Override  // com.google.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
            public List getPathList() {
                return this.path_;
            }

            @Override  // com.google.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
            public int getSpan(int v) {
                return this.span_.getInt(v);
            }

            @Override  // com.google.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
            public int getSpanCount() {
                return this.span_.size();
            }

            @Override  // com.google.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
            public List getSpanList() {
                return this.span_;
            }

            @Override  // com.google.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
            public String getTrailingComments() {
                return this.trailingComments_;
            }

            @Override  // com.google.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
            public ByteString getTrailingCommentsBytes() {
                return ByteString.copyFromUtf8(this.trailingComments_);
            }

            @Override  // com.google.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
            public boolean hasLeadingComments() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override  // com.google.protobuf.DescriptorProtos$SourceCodeInfo$LocationOrBuilder
            public boolean hasTrailingComments() {
                return (this.bitField0_ & 2) != 0;
            }

            public static com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.Builder newBuilder() {
                return (com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.Builder)Location.DEFAULT_INSTANCE.createBuilder();
            }

            public static com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.Builder newBuilder(Location descriptorProtos$SourceCodeInfo$Location0) {
                return (com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.Builder)Location.DEFAULT_INSTANCE.createBuilder(descriptorProtos$SourceCodeInfo$Location0);
            }

            public static Location parseDelimitedFrom(InputStream inputStream0) throws IOException {
                return (Location)GeneratedMessageLite.parseDelimitedFrom(Location.DEFAULT_INSTANCE, inputStream0);
            }

            public static Location parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return (Location)GeneratedMessageLite.parseDelimitedFrom(Location.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
            }

            public static Location parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
                return (Location)GeneratedMessageLite.parseFrom(Location.DEFAULT_INSTANCE, byteString0);
            }

            public static Location parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
                return (Location)GeneratedMessageLite.parseFrom(Location.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
            }

            public static Location parseFrom(CodedInputStream codedInputStream0) throws IOException {
                return (Location)GeneratedMessageLite.parseFrom(Location.DEFAULT_INSTANCE, codedInputStream0);
            }

            public static Location parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return (Location)GeneratedMessageLite.parseFrom(Location.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
            }

            public static Location parseFrom(InputStream inputStream0) throws IOException {
                return (Location)GeneratedMessageLite.parseFrom(Location.DEFAULT_INSTANCE, inputStream0);
            }

            public static Location parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return (Location)GeneratedMessageLite.parseFrom(Location.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
            }

            public static Location parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
                return (Location)GeneratedMessageLite.parseFrom(Location.DEFAULT_INSTANCE, byteBuffer0);
            }

            public static Location parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
                return (Location)GeneratedMessageLite.parseFrom(Location.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
            }

            public static Location parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
                return (Location)GeneratedMessageLite.parseFrom(Location.DEFAULT_INSTANCE, arr_b);
            }

            public static Location parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
                return (Location)GeneratedMessageLite.parseFrom(Location.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
            }

            public static Parser parser() {
                return Location.DEFAULT_INSTANCE.getParserForType();
            }

            private void setLeadingComments(String s) {
                s.getClass();
                this.bitField0_ |= 1;
                this.leadingComments_ = s;
            }

            private void setLeadingCommentsBytes(ByteString byteString0) {
                this.leadingComments_ = byteString0.toStringUtf8();
                this.bitField0_ |= 1;
            }

            private void setLeadingDetachedComments(int v, String s) {
                s.getClass();
                this.ensureLeadingDetachedCommentsIsMutable();
                this.leadingDetachedComments_.set(v, s);
            }

            private void setPath(int v, int v1) {
                this.ensurePathIsMutable();
                this.path_.setInt(v, v1);
            }

            private void setSpan(int v, int v1) {
                this.ensureSpanIsMutable();
                this.span_.setInt(v, v1);
            }

            private void setTrailingComments(String s) {
                s.getClass();
                this.bitField0_ |= 2;
                this.trailingComments_ = s;
            }

            private void setTrailingCommentsBytes(ByteString byteString0) {
                this.trailingComments_ = byteString0.toStringUtf8();
                this.bitField0_ |= 2;
            }
        }

        public interface LocationOrBuilder extends MessageLiteOrBuilder {
            String getLeadingComments();

            ByteString getLeadingCommentsBytes();

            String getLeadingDetachedComments(int arg1);

            ByteString getLeadingDetachedCommentsBytes(int arg1);

            int getLeadingDetachedCommentsCount();

            List getLeadingDetachedCommentsList();

            int getPath(int arg1);

            int getPathCount();

            List getPathList();

            int getSpan(int arg1);

            int getSpanCount();

            List getSpanList();

            String getTrailingComments();

            ByteString getTrailingCommentsBytes();

            boolean hasLeadingComments();

            boolean hasTrailingComments();
        }

        private static final SourceCodeInfo DEFAULT_INSTANCE = null;
        public static final int LOCATION_FIELD_NUMBER = 1;
        private static volatile Parser PARSER;
        private ProtobufList location_;

        static {
            SourceCodeInfo descriptorProtos$SourceCodeInfo0 = new SourceCodeInfo();
            SourceCodeInfo.DEFAULT_INSTANCE = descriptorProtos$SourceCodeInfo0;
            GeneratedMessageLite.registerDefaultInstance(SourceCodeInfo.class, descriptorProtos$SourceCodeInfo0);
        }

        private SourceCodeInfo() {
            this.location_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void addAllLocation(Iterable iterable0) {
            this.ensureLocationIsMutable();
            AbstractMessageLite.addAll(iterable0, this.location_);
        }

        private void addLocation(int v, Location descriptorProtos$SourceCodeInfo$Location0) {
            descriptorProtos$SourceCodeInfo$Location0.getClass();
            this.ensureLocationIsMutable();
            this.location_.add(v, descriptorProtos$SourceCodeInfo$Location0);
        }

        private void addLocation(Location descriptorProtos$SourceCodeInfo$Location0) {
            descriptorProtos$SourceCodeInfo$Location0.getClass();
            this.ensureLocationIsMutable();
            this.location_.add(descriptorProtos$SourceCodeInfo$Location0);
        }

        private void clearLocation() {
            this.location_ = GeneratedMessageLite.emptyProtobufList();
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new SourceCodeInfo();
                }
                case 2: {
                    return new com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(SourceCodeInfo.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"location_", Location.class});
                }
                case 4: {
                    return SourceCodeInfo.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = SourceCodeInfo.PARSER;
                    if(parser0 == null) {
                        Class class0 = SourceCodeInfo.class;
                        synchronized(class0) {
                            parser0 = SourceCodeInfo.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(SourceCodeInfo.DEFAULT_INSTANCE);
                                SourceCodeInfo.PARSER = parser0;
                            }
                        }
                    }
                    return parser0;
                }
                case 6: {
                    return (byte)1;
                }
                case 7: {
                    return null;
                }
                default: {
                    throw new UnsupportedOperationException();
                }
            }
        }

        private void ensureLocationIsMutable() {
            ProtobufList internal$ProtobufList0 = this.location_;
            if(!internal$ProtobufList0.isModifiable()) {
                this.location_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
            }
        }

        public static SourceCodeInfo getDefaultInstance() {
            return SourceCodeInfo.DEFAULT_INSTANCE;
        }

        @Override  // com.google.protobuf.DescriptorProtos$SourceCodeInfoOrBuilder
        public Location getLocation(int v) {
            return (Location)this.location_.get(v);
        }

        @Override  // com.google.protobuf.DescriptorProtos$SourceCodeInfoOrBuilder
        public int getLocationCount() {
            return this.location_.size();
        }

        @Override  // com.google.protobuf.DescriptorProtos$SourceCodeInfoOrBuilder
        public List getLocationList() {
            return this.location_;
        }

        public LocationOrBuilder getLocationOrBuilder(int v) {
            return (LocationOrBuilder)this.location_.get(v);
        }

        public List getLocationOrBuilderList() {
            return this.location_;
        }

        public static com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder newBuilder() {
            return (com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder)SourceCodeInfo.DEFAULT_INSTANCE.createBuilder();
        }

        public static com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder newBuilder(SourceCodeInfo descriptorProtos$SourceCodeInfo0) {
            return (com.google.protobuf.DescriptorProtos.SourceCodeInfo.Builder)SourceCodeInfo.DEFAULT_INSTANCE.createBuilder(descriptorProtos$SourceCodeInfo0);
        }

        public static SourceCodeInfo parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (SourceCodeInfo)GeneratedMessageLite.parseDelimitedFrom(SourceCodeInfo.DEFAULT_INSTANCE, inputStream0);
        }

        public static SourceCodeInfo parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (SourceCodeInfo)GeneratedMessageLite.parseDelimitedFrom(SourceCodeInfo.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static SourceCodeInfo parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (SourceCodeInfo)GeneratedMessageLite.parseFrom(SourceCodeInfo.DEFAULT_INSTANCE, byteString0);
        }

        public static SourceCodeInfo parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (SourceCodeInfo)GeneratedMessageLite.parseFrom(SourceCodeInfo.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static SourceCodeInfo parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (SourceCodeInfo)GeneratedMessageLite.parseFrom(SourceCodeInfo.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static SourceCodeInfo parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (SourceCodeInfo)GeneratedMessageLite.parseFrom(SourceCodeInfo.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static SourceCodeInfo parseFrom(InputStream inputStream0) throws IOException {
            return (SourceCodeInfo)GeneratedMessageLite.parseFrom(SourceCodeInfo.DEFAULT_INSTANCE, inputStream0);
        }

        public static SourceCodeInfo parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (SourceCodeInfo)GeneratedMessageLite.parseFrom(SourceCodeInfo.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static SourceCodeInfo parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (SourceCodeInfo)GeneratedMessageLite.parseFrom(SourceCodeInfo.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static SourceCodeInfo parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (SourceCodeInfo)GeneratedMessageLite.parseFrom(SourceCodeInfo.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static SourceCodeInfo parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (SourceCodeInfo)GeneratedMessageLite.parseFrom(SourceCodeInfo.DEFAULT_INSTANCE, arr_b);
        }

        public static SourceCodeInfo parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (SourceCodeInfo)GeneratedMessageLite.parseFrom(SourceCodeInfo.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return SourceCodeInfo.DEFAULT_INSTANCE.getParserForType();
        }

        private void removeLocation(int v) {
            this.ensureLocationIsMutable();
            this.location_.remove(v);
        }

        private void setLocation(int v, Location descriptorProtos$SourceCodeInfo$Location0) {
            descriptorProtos$SourceCodeInfo$Location0.getClass();
            this.ensureLocationIsMutable();
            this.location_.set(v, descriptorProtos$SourceCodeInfo$Location0);
        }
    }

    public interface SourceCodeInfoOrBuilder extends MessageLiteOrBuilder {
        Location getLocation(int arg1);

        int getLocationCount();

        List getLocationList();
    }

    public static final class UninterpretedOption extends GeneratedMessageLite implements UninterpretedOptionOrBuilder {
        public static final class com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements UninterpretedOptionOrBuilder {
            private com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder() {
                super(UninterpretedOption.DEFAULT_INSTANCE);
            }

            com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder(a descriptorProtos$a0) {
            }

            public com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder addAllName(Iterable iterable0) {
                this.copyOnWrite();
                ((UninterpretedOption)this.instance).addAllName(iterable0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder addName(int v, com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePart.Builder descriptorProtos$UninterpretedOption$NamePart$Builder0) {
                this.copyOnWrite();
                ((UninterpretedOption)this.instance).addName(v, ((NamePart)descriptorProtos$UninterpretedOption$NamePart$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder addName(int v, NamePart descriptorProtos$UninterpretedOption$NamePart0) {
                this.copyOnWrite();
                ((UninterpretedOption)this.instance).addName(v, descriptorProtos$UninterpretedOption$NamePart0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder addName(com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePart.Builder descriptorProtos$UninterpretedOption$NamePart$Builder0) {
                this.copyOnWrite();
                ((UninterpretedOption)this.instance).addName(((NamePart)descriptorProtos$UninterpretedOption$NamePart$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder addName(NamePart descriptorProtos$UninterpretedOption$NamePart0) {
                this.copyOnWrite();
                ((UninterpretedOption)this.instance).addName(descriptorProtos$UninterpretedOption$NamePart0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder clearAggregateValue() {
                this.copyOnWrite();
                ((UninterpretedOption)this.instance).clearAggregateValue();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder clearDoubleValue() {
                this.copyOnWrite();
                ((UninterpretedOption)this.instance).clearDoubleValue();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder clearIdentifierValue() {
                this.copyOnWrite();
                ((UninterpretedOption)this.instance).clearIdentifierValue();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder clearName() {
                this.copyOnWrite();
                ((UninterpretedOption)this.instance).clearName();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder clearNegativeIntValue() {
                this.copyOnWrite();
                ((UninterpretedOption)this.instance).clearNegativeIntValue();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder clearPositiveIntValue() {
                this.copyOnWrite();
                ((UninterpretedOption)this.instance).clearPositiveIntValue();
                return this;
            }

            public com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder clearStringValue() {
                this.copyOnWrite();
                ((UninterpretedOption)this.instance).clearStringValue();
                return this;
            }

            @Override  // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
            public String getAggregateValue() {
                return ((UninterpretedOption)this.instance).getAggregateValue();
            }

            @Override  // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
            public ByteString getAggregateValueBytes() {
                return ((UninterpretedOption)this.instance).getAggregateValueBytes();
            }

            @Override  // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
            public double getDoubleValue() {
                return ((UninterpretedOption)this.instance).getDoubleValue();
            }

            @Override  // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
            public String getIdentifierValue() {
                return ((UninterpretedOption)this.instance).getIdentifierValue();
            }

            @Override  // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
            public ByteString getIdentifierValueBytes() {
                return ((UninterpretedOption)this.instance).getIdentifierValueBytes();
            }

            @Override  // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
            public NamePart getName(int v) {
                return ((UninterpretedOption)this.instance).getName(v);
            }

            @Override  // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
            public int getNameCount() {
                return ((UninterpretedOption)this.instance).getNameCount();
            }

            @Override  // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
            public List getNameList() {
                return DesugarCollections.unmodifiableList(((UninterpretedOption)this.instance).getNameList());
            }

            @Override  // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
            public long getNegativeIntValue() {
                return ((UninterpretedOption)this.instance).getNegativeIntValue();
            }

            @Override  // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
            public long getPositiveIntValue() {
                return ((UninterpretedOption)this.instance).getPositiveIntValue();
            }

            @Override  // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
            public ByteString getStringValue() {
                return ((UninterpretedOption)this.instance).getStringValue();
            }

            @Override  // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
            public boolean hasAggregateValue() {
                return ((UninterpretedOption)this.instance).hasAggregateValue();
            }

            @Override  // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
            public boolean hasDoubleValue() {
                return ((UninterpretedOption)this.instance).hasDoubleValue();
            }

            @Override  // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
            public boolean hasIdentifierValue() {
                return ((UninterpretedOption)this.instance).hasIdentifierValue();
            }

            @Override  // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
            public boolean hasNegativeIntValue() {
                return ((UninterpretedOption)this.instance).hasNegativeIntValue();
            }

            @Override  // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
            public boolean hasPositiveIntValue() {
                return ((UninterpretedOption)this.instance).hasPositiveIntValue();
            }

            @Override  // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
            public boolean hasStringValue() {
                return ((UninterpretedOption)this.instance).hasStringValue();
            }

            public com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder removeName(int v) {
                this.copyOnWrite();
                ((UninterpretedOption)this.instance).removeName(v);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder setAggregateValue(String s) {
                this.copyOnWrite();
                ((UninterpretedOption)this.instance).setAggregateValue(s);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder setAggregateValueBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((UninterpretedOption)this.instance).setAggregateValueBytes(byteString0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder setDoubleValue(double f) {
                this.copyOnWrite();
                ((UninterpretedOption)this.instance).setDoubleValue(f);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder setIdentifierValue(String s) {
                this.copyOnWrite();
                ((UninterpretedOption)this.instance).setIdentifierValue(s);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder setIdentifierValueBytes(ByteString byteString0) {
                this.copyOnWrite();
                ((UninterpretedOption)this.instance).setIdentifierValueBytes(byteString0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder setName(int v, com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePart.Builder descriptorProtos$UninterpretedOption$NamePart$Builder0) {
                this.copyOnWrite();
                ((UninterpretedOption)this.instance).setName(v, ((NamePart)descriptorProtos$UninterpretedOption$NamePart$Builder0.build()));
                return this;
            }

            public com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder setName(int v, NamePart descriptorProtos$UninterpretedOption$NamePart0) {
                this.copyOnWrite();
                ((UninterpretedOption)this.instance).setName(v, descriptorProtos$UninterpretedOption$NamePart0);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder setNegativeIntValue(long v) {
                this.copyOnWrite();
                ((UninterpretedOption)this.instance).setNegativeIntValue(v);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder setPositiveIntValue(long v) {
                this.copyOnWrite();
                ((UninterpretedOption)this.instance).setPositiveIntValue(v);
                return this;
            }

            public com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder setStringValue(ByteString byteString0) {
                this.copyOnWrite();
                ((UninterpretedOption)this.instance).setStringValue(byteString0);
                return this;
            }
        }

        public static final class NamePart extends GeneratedMessageLite implements NamePartOrBuilder {
            public static final class com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePart.Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements NamePartOrBuilder {
                private com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePart.Builder() {
                    super(NamePart.DEFAULT_INSTANCE);
                }

                com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePart.Builder(a descriptorProtos$a0) {
                }

                public com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePart.Builder clearIsExtension() {
                    this.copyOnWrite();
                    ((NamePart)this.instance).clearIsExtension();
                    return this;
                }

                public com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePart.Builder clearNamePart() {
                    this.copyOnWrite();
                    ((NamePart)this.instance).clearNamePart();
                    return this;
                }

                @Override  // com.google.protobuf.DescriptorProtos$UninterpretedOption$NamePartOrBuilder
                public boolean getIsExtension() {
                    return ((NamePart)this.instance).getIsExtension();
                }

                // 去混淆评级： 低(20)
                @Override  // com.google.protobuf.DescriptorProtos$UninterpretedOption$NamePartOrBuilder
                public String getNamePart() {
                    return "";
                }

                @Override  // com.google.protobuf.DescriptorProtos$UninterpretedOption$NamePartOrBuilder
                public ByteString getNamePartBytes() {
                    return ((NamePart)this.instance).getNamePartBytes();
                }

                @Override  // com.google.protobuf.DescriptorProtos$UninterpretedOption$NamePartOrBuilder
                public boolean hasIsExtension() {
                    return ((NamePart)this.instance).hasIsExtension();
                }

                @Override  // com.google.protobuf.DescriptorProtos$UninterpretedOption$NamePartOrBuilder
                public boolean hasNamePart() {
                    return ((NamePart)this.instance).hasNamePart();
                }

                public com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePart.Builder setIsExtension(boolean z) {
                    this.copyOnWrite();
                    ((NamePart)this.instance).setIsExtension(z);
                    return this;
                }

                public com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePart.Builder setNamePart(String s) {
                    this.copyOnWrite();
                    ((NamePart)this.instance).setNamePart(s);
                    return this;
                }

                public com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePart.Builder setNamePartBytes(ByteString byteString0) {
                    this.copyOnWrite();
                    ((NamePart)this.instance).setNamePartBytes(byteString0);
                    return this;
                }
            }

            private static final NamePart DEFAULT_INSTANCE = null;
            public static final int IS_EXTENSION_FIELD_NUMBER = 2;
            public static final int NAME_PART_FIELD_NUMBER = 1;
            private static volatile Parser PARSER;
            private int bitField0_;
            private boolean isExtension_;
            private byte memoizedIsInitialized;
            private String namePart_;

            static {
                NamePart descriptorProtos$UninterpretedOption$NamePart0 = new NamePart();
                NamePart.DEFAULT_INSTANCE = descriptorProtos$UninterpretedOption$NamePart0;
                GeneratedMessageLite.registerDefaultInstance(NamePart.class, descriptorProtos$UninterpretedOption$NamePart0);
            }

            private NamePart() {
                this.memoizedIsInitialized = 2;
                this.namePart_ = "";
            }

            private void clearIsExtension() {
                this.bitField0_ &= -3;
                this.isExtension_ = false;
            }

            private void clearNamePart() {
                this.bitField0_ &= -2;
                this.namePart_ = "";
            }

            @Override  // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
                int v = 1;
                switch(generatedMessageLite$MethodToInvoke0) {
                    case 1: {
                        return new NamePart();
                    }
                    case 2: {
                        return new com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePart.Builder(null);
                    }
                    case 3: {
                        return GeneratedMessageLite.newMessageInfo(NamePart.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔇ\u0001", new Object[]{"bitField0_", "namePart_", "isExtension_"});
                    }
                    case 4: {
                        return NamePart.DEFAULT_INSTANCE;
                    }
                    case 5: {
                        Parser parser0 = NamePart.PARSER;
                        if(parser0 == null) {
                            synchronized(NamePart.class) {
                                parser0 = NamePart.PARSER;
                                if(parser0 == null) {
                                    parser0 = new DefaultInstanceBasedParser(NamePart.DEFAULT_INSTANCE);
                                    NamePart.PARSER = parser0;
                                }
                            }
                        }
                        return parser0;
                    }
                    case 6: {
                        return this.memoizedIsInitialized;
                    }
                    case 7: {
                        if(object0 == null) {
                            v = 0;
                        }
                        this.memoizedIsInitialized = (byte)v;
                        return null;
                    }
                    default: {
                        throw new UnsupportedOperationException();
                    }
                }
            }

            public static NamePart getDefaultInstance() {
                return NamePart.DEFAULT_INSTANCE;
            }

            @Override  // com.google.protobuf.DescriptorProtos$UninterpretedOption$NamePartOrBuilder
            public boolean getIsExtension() {
                return this.isExtension_;
            }

            @Override  // com.google.protobuf.DescriptorProtos$UninterpretedOption$NamePartOrBuilder
            public String getNamePart() [...] // 潜在的解密器

            @Override  // com.google.protobuf.DescriptorProtos$UninterpretedOption$NamePartOrBuilder
            public ByteString getNamePartBytes() {
                return ByteString.copyFromUtf8(this.namePart_);
            }

            @Override  // com.google.protobuf.DescriptorProtos$UninterpretedOption$NamePartOrBuilder
            public boolean hasIsExtension() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override  // com.google.protobuf.DescriptorProtos$UninterpretedOption$NamePartOrBuilder
            public boolean hasNamePart() {
                return (this.bitField0_ & 1) != 0;
            }

            public static com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePart.Builder newBuilder() {
                return (com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePart.Builder)NamePart.DEFAULT_INSTANCE.createBuilder();
            }

            public static com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePart.Builder newBuilder(NamePart descriptorProtos$UninterpretedOption$NamePart0) {
                return (com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePart.Builder)NamePart.DEFAULT_INSTANCE.createBuilder(descriptorProtos$UninterpretedOption$NamePart0);
            }

            public static NamePart parseDelimitedFrom(InputStream inputStream0) throws IOException {
                return (NamePart)GeneratedMessageLite.parseDelimitedFrom(NamePart.DEFAULT_INSTANCE, inputStream0);
            }

            public static NamePart parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return (NamePart)GeneratedMessageLite.parseDelimitedFrom(NamePart.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
            }

            public static NamePart parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
                return (NamePart)GeneratedMessageLite.parseFrom(NamePart.DEFAULT_INSTANCE, byteString0);
            }

            public static NamePart parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
                return (NamePart)GeneratedMessageLite.parseFrom(NamePart.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
            }

            public static NamePart parseFrom(CodedInputStream codedInputStream0) throws IOException {
                return (NamePart)GeneratedMessageLite.parseFrom(NamePart.DEFAULT_INSTANCE, codedInputStream0);
            }

            public static NamePart parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return (NamePart)GeneratedMessageLite.parseFrom(NamePart.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
            }

            public static NamePart parseFrom(InputStream inputStream0) throws IOException {
                return (NamePart)GeneratedMessageLite.parseFrom(NamePart.DEFAULT_INSTANCE, inputStream0);
            }

            public static NamePart parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return (NamePart)GeneratedMessageLite.parseFrom(NamePart.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
            }

            public static NamePart parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
                return (NamePart)GeneratedMessageLite.parseFrom(NamePart.DEFAULT_INSTANCE, byteBuffer0);
            }

            public static NamePart parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
                return (NamePart)GeneratedMessageLite.parseFrom(NamePart.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
            }

            public static NamePart parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
                return (NamePart)GeneratedMessageLite.parseFrom(NamePart.DEFAULT_INSTANCE, arr_b);
            }

            public static NamePart parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
                return (NamePart)GeneratedMessageLite.parseFrom(NamePart.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
            }

            public static Parser parser() {
                return NamePart.DEFAULT_INSTANCE.getParserForType();
            }

            private void setIsExtension(boolean z) {
                this.bitField0_ |= 2;
                this.isExtension_ = z;
            }

            private void setNamePart(String s) {
                s.getClass();
                this.bitField0_ |= 1;
                this.namePart_ = s;
            }

            private void setNamePartBytes(ByteString byteString0) {
                this.namePart_ = byteString0.toStringUtf8();
                this.bitField0_ |= 1;
            }
        }

        public interface NamePartOrBuilder extends MessageLiteOrBuilder {
            boolean getIsExtension();

            String getNamePart();

            ByteString getNamePartBytes();

            boolean hasIsExtension();

            boolean hasNamePart();
        }

        public static final int AGGREGATE_VALUE_FIELD_NUMBER = 8;
        private static final UninterpretedOption DEFAULT_INSTANCE = null;
        public static final int DOUBLE_VALUE_FIELD_NUMBER = 6;
        public static final int IDENTIFIER_VALUE_FIELD_NUMBER = 3;
        public static final int NAME_FIELD_NUMBER = 2;
        public static final int NEGATIVE_INT_VALUE_FIELD_NUMBER = 5;
        private static volatile Parser PARSER = null;
        public static final int POSITIVE_INT_VALUE_FIELD_NUMBER = 4;
        public static final int STRING_VALUE_FIELD_NUMBER = 7;
        private String aggregateValue_;
        private int bitField0_;
        private double doubleValue_;
        private String identifierValue_;
        private byte memoizedIsInitialized;
        private ProtobufList name_;
        private long negativeIntValue_;
        private long positiveIntValue_;
        private ByteString stringValue_;

        static {
            UninterpretedOption descriptorProtos$UninterpretedOption0 = new UninterpretedOption();
            UninterpretedOption.DEFAULT_INSTANCE = descriptorProtos$UninterpretedOption0;
            GeneratedMessageLite.registerDefaultInstance(UninterpretedOption.class, descriptorProtos$UninterpretedOption0);
        }

        private UninterpretedOption() {
            this.memoizedIsInitialized = 2;
            this.name_ = GeneratedMessageLite.emptyProtobufList();
            this.identifierValue_ = "";
            this.stringValue_ = ByteString.EMPTY;
            this.aggregateValue_ = "";
        }

        private void addAllName(Iterable iterable0) {
            this.ensureNameIsMutable();
            AbstractMessageLite.addAll(iterable0, this.name_);
        }

        private void addName(int v, NamePart descriptorProtos$UninterpretedOption$NamePart0) {
            descriptorProtos$UninterpretedOption$NamePart0.getClass();
            this.ensureNameIsMutable();
            this.name_.add(v, descriptorProtos$UninterpretedOption$NamePart0);
        }

        private void addName(NamePart descriptorProtos$UninterpretedOption$NamePart0) {
            descriptorProtos$UninterpretedOption$NamePart0.getClass();
            this.ensureNameIsMutable();
            this.name_.add(descriptorProtos$UninterpretedOption$NamePart0);
        }

        private void clearAggregateValue() {
            this.bitField0_ &= -33;
            this.aggregateValue_ = UninterpretedOption.getDefaultInstance().getAggregateValue();
        }

        private void clearDoubleValue() {
            this.bitField0_ &= -9;
            this.doubleValue_ = 0.0;
        }

        private void clearIdentifierValue() {
            this.bitField0_ &= -2;
            this.identifierValue_ = "";
        }

        private void clearName() {
            this.name_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearNegativeIntValue() {
            this.bitField0_ &= -5;
            this.negativeIntValue_ = 0L;
        }

        private void clearPositiveIntValue() {
            this.bitField0_ &= -3;
            this.positiveIntValue_ = 0L;
        }

        private void clearStringValue() {
            this.bitField0_ &= -17;
            this.stringValue_ = UninterpretedOption.getDefaultInstance().getStringValue();
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            int v = 1;
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new UninterpretedOption();
                }
                case 2: {
                    return new com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(UninterpretedOption.DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0001\u0002Л\u0003ဈ\u0000\u0004ဃ\u0001\u0005ဂ\u0002\u0006က\u0003\u0007ည\u0004\bဈ\u0005", new Object[]{"bitField0_", "name_", NamePart.class, "identifierValue_", "positiveIntValue_", "negativeIntValue_", "doubleValue_", "stringValue_", "aggregateValue_"});
                }
                case 4: {
                    return UninterpretedOption.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = UninterpretedOption.PARSER;
                    if(parser0 == null) {
                        synchronized(UninterpretedOption.class) {
                            parser0 = UninterpretedOption.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(UninterpretedOption.DEFAULT_INSTANCE);
                                UninterpretedOption.PARSER = parser0;
                            }
                        }
                    }
                    return parser0;
                }
                case 6: {
                    return this.memoizedIsInitialized;
                }
                case 7: {
                    if(object0 == null) {
                        v = 0;
                    }
                    this.memoizedIsInitialized = (byte)v;
                    return null;
                }
                default: {
                    throw new UnsupportedOperationException();
                }
            }
        }

        private void ensureNameIsMutable() {
            ProtobufList internal$ProtobufList0 = this.name_;
            if(!internal$ProtobufList0.isModifiable()) {
                this.name_ = GeneratedMessageLite.mutableCopy(internal$ProtobufList0);
            }
        }

        @Override  // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public String getAggregateValue() {
            return this.aggregateValue_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public ByteString getAggregateValueBytes() {
            return ByteString.copyFromUtf8(this.aggregateValue_);
        }

        public static UninterpretedOption getDefaultInstance() {
            return UninterpretedOption.DEFAULT_INSTANCE;
        }

        @Override  // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public double getDoubleValue() {
            return this.doubleValue_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public String getIdentifierValue() {
            return this.identifierValue_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public ByteString getIdentifierValueBytes() {
            return ByteString.copyFromUtf8(this.identifierValue_);
        }

        @Override  // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public NamePart getName(int v) {
            return (NamePart)this.name_.get(v);
        }

        @Override  // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public int getNameCount() {
            return this.name_.size();
        }

        @Override  // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public List getNameList() {
            return this.name_;
        }

        public NamePartOrBuilder getNameOrBuilder(int v) {
            return (NamePartOrBuilder)this.name_.get(v);
        }

        public List getNameOrBuilderList() {
            return this.name_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public long getNegativeIntValue() {
            return this.negativeIntValue_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public long getPositiveIntValue() {
            return this.positiveIntValue_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public ByteString getStringValue() {
            return this.stringValue_;
        }

        @Override  // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public boolean hasAggregateValue() {
            return (this.bitField0_ & 0x20) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public boolean hasDoubleValue() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public boolean hasIdentifierValue() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public boolean hasNegativeIntValue() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public boolean hasPositiveIntValue() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override  // com.google.protobuf.DescriptorProtos$UninterpretedOptionOrBuilder
        public boolean hasStringValue() {
            return (this.bitField0_ & 16) != 0;
        }

        public static com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder newBuilder() {
            return (com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder)UninterpretedOption.DEFAULT_INSTANCE.createBuilder();
        }

        public static com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder newBuilder(UninterpretedOption descriptorProtos$UninterpretedOption0) {
            return (com.google.protobuf.DescriptorProtos.UninterpretedOption.Builder)UninterpretedOption.DEFAULT_INSTANCE.createBuilder(descriptorProtos$UninterpretedOption0);
        }

        public static UninterpretedOption parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (UninterpretedOption)GeneratedMessageLite.parseDelimitedFrom(UninterpretedOption.DEFAULT_INSTANCE, inputStream0);
        }

        public static UninterpretedOption parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (UninterpretedOption)GeneratedMessageLite.parseDelimitedFrom(UninterpretedOption.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static UninterpretedOption parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (UninterpretedOption)GeneratedMessageLite.parseFrom(UninterpretedOption.DEFAULT_INSTANCE, byteString0);
        }

        public static UninterpretedOption parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (UninterpretedOption)GeneratedMessageLite.parseFrom(UninterpretedOption.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static UninterpretedOption parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (UninterpretedOption)GeneratedMessageLite.parseFrom(UninterpretedOption.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static UninterpretedOption parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (UninterpretedOption)GeneratedMessageLite.parseFrom(UninterpretedOption.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static UninterpretedOption parseFrom(InputStream inputStream0) throws IOException {
            return (UninterpretedOption)GeneratedMessageLite.parseFrom(UninterpretedOption.DEFAULT_INSTANCE, inputStream0);
        }

        public static UninterpretedOption parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (UninterpretedOption)GeneratedMessageLite.parseFrom(UninterpretedOption.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static UninterpretedOption parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (UninterpretedOption)GeneratedMessageLite.parseFrom(UninterpretedOption.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static UninterpretedOption parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (UninterpretedOption)GeneratedMessageLite.parseFrom(UninterpretedOption.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static UninterpretedOption parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (UninterpretedOption)GeneratedMessageLite.parseFrom(UninterpretedOption.DEFAULT_INSTANCE, arr_b);
        }

        public static UninterpretedOption parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (UninterpretedOption)GeneratedMessageLite.parseFrom(UninterpretedOption.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return UninterpretedOption.DEFAULT_INSTANCE.getParserForType();
        }

        private void removeName(int v) {
            this.ensureNameIsMutable();
            this.name_.remove(v);
        }

        private void setAggregateValue(String s) {
            s.getClass();
            this.bitField0_ |= 0x20;
            this.aggregateValue_ = s;
        }

        private void setAggregateValueBytes(ByteString byteString0) {
            this.aggregateValue_ = byteString0.toStringUtf8();
            this.bitField0_ |= 0x20;
        }

        private void setDoubleValue(double f) {
            this.bitField0_ |= 8;
            this.doubleValue_ = f;
        }

        private void setIdentifierValue(String s) {
            s.getClass();
            this.bitField0_ |= 1;
            this.identifierValue_ = s;
        }

        private void setIdentifierValueBytes(ByteString byteString0) {
            this.identifierValue_ = byteString0.toStringUtf8();
            this.bitField0_ |= 1;
        }

        private void setName(int v, NamePart descriptorProtos$UninterpretedOption$NamePart0) {
            descriptorProtos$UninterpretedOption$NamePart0.getClass();
            this.ensureNameIsMutable();
            this.name_.set(v, descriptorProtos$UninterpretedOption$NamePart0);
        }

        private void setNegativeIntValue(long v) {
            this.bitField0_ |= 4;
            this.negativeIntValue_ = v;
        }

        private void setPositiveIntValue(long v) {
            this.bitField0_ |= 2;
            this.positiveIntValue_ = v;
        }

        private void setStringValue(ByteString byteString0) {
            byteString0.getClass();
            this.bitField0_ |= 16;
            this.stringValue_ = byteString0;
        }
    }

    public interface UninterpretedOptionOrBuilder extends MessageLiteOrBuilder {
        String getAggregateValue();

        ByteString getAggregateValueBytes();

        double getDoubleValue();

        String getIdentifierValue();

        ByteString getIdentifierValueBytes();

        NamePart getName(int arg1);

        int getNameCount();

        List getNameList();

        long getNegativeIntValue();

        long getPositiveIntValue();

        ByteString getStringValue();

        boolean hasAggregateValue();

        boolean hasDoubleValue();

        boolean hasIdentifierValue();

        boolean hasNegativeIntValue();

        boolean hasPositiveIntValue();

        boolean hasStringValue();
    }

    static class a {
        static final int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] arr_v = new int[MethodToInvoke.values().length];
            a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = arr_v;
            try {
                arr_v[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    static {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite0) {
    }
}

