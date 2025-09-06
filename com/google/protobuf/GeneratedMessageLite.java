package com.google.protobuf;

import j..util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public abstract class GeneratedMessageLite extends AbstractMessageLite {
    public static abstract class Builder extends com.google.protobuf.AbstractMessageLite.Builder {
        private final GeneratedMessageLite defaultInstance;
        protected GeneratedMessageLite instance;

        protected Builder(GeneratedMessageLite generatedMessageLite0) {
            this.defaultInstance = generatedMessageLite0;
            if(generatedMessageLite0.isMutable()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.instance = this.newMutableInstance();
        }

        public final GeneratedMessageLite build() {
            GeneratedMessageLite generatedMessageLite0 = this.buildPartial();
            if(!generatedMessageLite0.isInitialized()) {
                throw com.google.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(generatedMessageLite0);
            }
            return generatedMessageLite0;
        }

        @Override  // com.google.protobuf.MessageLite$Builder
        public MessageLite build() {
            return this.build();
        }

        public GeneratedMessageLite buildPartial() {
            if(!this.instance.isMutable()) {
                return this.instance;
            }
            this.instance.makeImmutable();
            return this.instance;
        }

        @Override  // com.google.protobuf.MessageLite$Builder
        public MessageLite buildPartial() {
            return this.buildPartial();
        }

        public final Builder clear() {
            if(this.defaultInstance.isMutable()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.instance = this.newMutableInstance();
            return this;
        }

        @Override  // com.google.protobuf.MessageLite$Builder
        public com.google.protobuf.MessageLite.Builder clear() {
            return this.clear();
        }

        @Override  // com.google.protobuf.AbstractMessageLite$Builder
        public com.google.protobuf.AbstractMessageLite.Builder clone() {
            return this.clone();
        }

        public Builder clone() {
            Builder generatedMessageLite$Builder0 = this.getDefaultInstanceForType().newBuilderForType();
            generatedMessageLite$Builder0.instance = this.buildPartial();
            return generatedMessageLite$Builder0;
        }

        @Override  // com.google.protobuf.AbstractMessageLite$Builder
        public com.google.protobuf.MessageLite.Builder clone() {
            return this.clone();
        }

        @Override  // com.google.protobuf.AbstractMessageLite$Builder
        public Object clone() throws CloneNotSupportedException {
            return this.clone();
        }

        protected final void copyOnWrite() {
            if(!this.instance.isMutable()) {
                this.copyOnWriteInternal();
            }
        }

        protected void copyOnWriteInternal() {
            GeneratedMessageLite generatedMessageLite0 = this.newMutableInstance();
            Builder.mergeFromInstance(generatedMessageLite0, this.instance);
            this.instance = generatedMessageLite0;
        }

        public GeneratedMessageLite getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        @Override  // com.google.protobuf.MessageLiteOrBuilder
        public MessageLite getDefaultInstanceForType() {
            return this.getDefaultInstanceForType();
        }

        @Override  // com.google.protobuf.AbstractMessageLite$Builder
        protected com.google.protobuf.AbstractMessageLite.Builder internalMergeFrom(AbstractMessageLite abstractMessageLite0) {
            return this.internalMergeFrom(((GeneratedMessageLite)abstractMessageLite0));
        }

        protected Builder internalMergeFrom(GeneratedMessageLite generatedMessageLite0) {
            return this.mergeFrom(generatedMessageLite0);
        }

        @Override  // com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return GeneratedMessageLite.isInitialized(this.instance, false);
        }

        @Override  // com.google.protobuf.AbstractMessageLite$Builder
        public com.google.protobuf.AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
        }

        @Override  // com.google.protobuf.AbstractMessageLite$Builder
        public com.google.protobuf.AbstractMessageLite.Builder mergeFrom(byte[] arr_b, int v, int v1) throws InvalidProtocolBufferException {
            return this.mergeFrom(arr_b, v, v1);
        }

        @Override  // com.google.protobuf.AbstractMessageLite$Builder
        public com.google.protobuf.AbstractMessageLite.Builder mergeFrom(byte[] arr_b, int v, int v1, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return this.mergeFrom(arr_b, v, v1, extensionRegistryLite0);
        }

        public Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            this.copyOnWrite();
            try {
                X.getInstance().schemaFor(this.instance).mergeFrom(this.instance, l.forCodedInput(codedInputStream0), extensionRegistryLite0);
                return this;
            }
            catch(RuntimeException runtimeException0) {
                if(runtimeException0.getCause() instanceof IOException) {
                    throw (IOException)runtimeException0.getCause();
                }
                throw runtimeException0;
            }
        }

        public Builder mergeFrom(GeneratedMessageLite generatedMessageLite0) {
            if(this.getDefaultInstanceForType().equals(generatedMessageLite0)) {
                return this;
            }
            this.copyOnWrite();
            Builder.mergeFromInstance(this.instance, generatedMessageLite0);
            return this;
        }

        public Builder mergeFrom(byte[] arr_b, int v, int v1) throws InvalidProtocolBufferException {
            return this.mergeFrom(arr_b, v, v1, ExtensionRegistryLite.getEmptyRegistry());
        }

        public Builder mergeFrom(byte[] arr_b, int v, int v1, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            this.copyOnWrite();
            try {
                X.getInstance().schemaFor(this.instance).mergeFrom(this.instance, arr_b, v, v + v1, new b(extensionRegistryLite0));
                return this;
            }
            catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                throw invalidProtocolBufferException0;
            }
            catch(IndexOutOfBoundsException unused_ex) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            catch(IOException iOException0) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", iOException0);
            }
        }

        @Override  // com.google.protobuf.AbstractMessageLite$Builder
        public com.google.protobuf.MessageLite.Builder mergeFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return this.mergeFrom(codedInputStream0, extensionRegistryLite0);
        }

        @Override  // com.google.protobuf.AbstractMessageLite$Builder
        public com.google.protobuf.MessageLite.Builder mergeFrom(byte[] arr_b, int v, int v1) throws InvalidProtocolBufferException {
            return this.mergeFrom(arr_b, v, v1);
        }

        @Override  // com.google.protobuf.AbstractMessageLite$Builder
        public com.google.protobuf.MessageLite.Builder mergeFrom(byte[] arr_b, int v, int v1, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return this.mergeFrom(arr_b, v, v1, extensionRegistryLite0);
        }

        private static void mergeFromInstance(Object object0, Object object1) {
            X.getInstance().schemaFor(object0).mergeFrom(object0, object1);
        }

        private GeneratedMessageLite newMutableInstance() {
            return this.defaultInstance.newMutableInstance();
        }
    }

    public static class DefaultInstanceBasedParser extends AbstractParser {
        private final GeneratedMessageLite defaultInstance;

        public DefaultInstanceBasedParser(GeneratedMessageLite generatedMessageLite0) {
            this.defaultInstance = generatedMessageLite0;
        }

        public GeneratedMessageLite parsePartialFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parsePartialFrom(this.defaultInstance, codedInputStream0, extensionRegistryLite0);
        }

        public GeneratedMessageLite parsePartialFrom(byte[] arr_b, int v, int v1, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parsePartialFrom(this.defaultInstance, arr_b, v, v1, extensionRegistryLite0);
        }

        @Override  // com.google.protobuf.AbstractParser
        public MessageLite parsePartialFrom(byte[] arr_b, int v, int v1, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return this.parsePartialFrom(arr_b, v, v1, extensionRegistryLite0);
        }

        @Override  // com.google.protobuf.Parser
        public Object parsePartialFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return this.parsePartialFrom(codedInputStream0, extensionRegistryLite0);
        }

        @Override  // com.google.protobuf.AbstractParser
        public Object parsePartialFrom(byte[] arr_b, int v, int v1, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return this.parsePartialFrom(arr_b, v, v1, extensionRegistryLite0);
        }
    }

    public static abstract class ExtendableBuilder extends Builder implements ExtendableMessageOrBuilder {
        protected ExtendableBuilder(ExtendableMessage generatedMessageLite$ExtendableMessage0) {
            super(generatedMessageLite$ExtendableMessage0);
        }

        public final ExtendableBuilder addExtension(ExtensionLite extensionLite0, Object object0) {
            GeneratedExtension generatedMessageLite$GeneratedExtension0 = GeneratedMessageLite.checkIsLite(extensionLite0);
            this.verifyExtensionContainingType(generatedMessageLite$GeneratedExtension0);
            this.copyOnWrite();
            FieldSet fieldSet0 = this.ensureExtensionsAreMutable();
            Object object1 = generatedMessageLite$GeneratedExtension0.singularToFieldSetType(object0);
            fieldSet0.addRepeatedField(generatedMessageLite$GeneratedExtension0.descriptor, object1);
            return this;
        }

        public final ExtendableMessage buildPartial() {
            if(!((ExtendableMessage)this.instance).isMutable()) {
                return (ExtendableMessage)this.instance;
            }
            ((ExtendableMessage)this.instance).extensions.makeImmutable();
            return (ExtendableMessage)super.buildPartial();
        }

        @Override  // com.google.protobuf.GeneratedMessageLite$Builder
        public GeneratedMessageLite buildPartial() {
            return this.buildPartial();
        }

        @Override  // com.google.protobuf.GeneratedMessageLite$Builder
        public MessageLite buildPartial() {
            return this.buildPartial();
        }

        public final ExtendableBuilder clearExtension(ExtensionLite extensionLite0) {
            GeneratedExtension generatedMessageLite$GeneratedExtension0 = GeneratedMessageLite.checkIsLite(extensionLite0);
            this.verifyExtensionContainingType(generatedMessageLite$GeneratedExtension0);
            this.copyOnWrite();
            this.ensureExtensionsAreMutable().clearField(generatedMessageLite$GeneratedExtension0.descriptor);
            return this;
        }

        @Override  // com.google.protobuf.GeneratedMessageLite$Builder
        protected void copyOnWriteInternal() {
            super.copyOnWriteInternal();
            if(((ExtendableMessage)this.instance).extensions != FieldSet.emptySet()) {
                GeneratedMessageLite generatedMessageLite0 = this.instance;
                ((ExtendableMessage)generatedMessageLite0).extensions = ((ExtendableMessage)generatedMessageLite0).extensions.clone();
            }
        }

        private FieldSet ensureExtensionsAreMutable() {
            FieldSet fieldSet0 = ((ExtendableMessage)this.instance).extensions;
            if(fieldSet0.isImmutable()) {
                fieldSet0 = fieldSet0.clone();
                ((ExtendableMessage)this.instance).extensions = fieldSet0;
            }
            return fieldSet0;
        }

        @Override  // com.google.protobuf.GeneratedMessageLite$ExtendableMessageOrBuilder
        public final Object getExtension(ExtensionLite extensionLite0) {
            return ((ExtendableMessage)this.instance).getExtension(extensionLite0);
        }

        @Override  // com.google.protobuf.GeneratedMessageLite$ExtendableMessageOrBuilder
        public final Object getExtension(ExtensionLite extensionLite0, int v) {
            return ((ExtendableMessage)this.instance).getExtension(extensionLite0, v);
        }

        @Override  // com.google.protobuf.GeneratedMessageLite$ExtendableMessageOrBuilder
        public final int getExtensionCount(ExtensionLite extensionLite0) {
            return ((ExtendableMessage)this.instance).getExtensionCount(extensionLite0);
        }

        @Override  // com.google.protobuf.GeneratedMessageLite$ExtendableMessageOrBuilder
        public final boolean hasExtension(ExtensionLite extensionLite0) {
            return ((ExtendableMessage)this.instance).hasExtension(extensionLite0);
        }

        void internalSetExtensionSet(FieldSet fieldSet0) {
            this.copyOnWrite();
            ((ExtendableMessage)this.instance).extensions = fieldSet0;
        }

        public final ExtendableBuilder setExtension(ExtensionLite extensionLite0, int v, Object object0) {
            GeneratedExtension generatedMessageLite$GeneratedExtension0 = GeneratedMessageLite.checkIsLite(extensionLite0);
            this.verifyExtensionContainingType(generatedMessageLite$GeneratedExtension0);
            this.copyOnWrite();
            FieldSet fieldSet0 = this.ensureExtensionsAreMutable();
            Object object1 = generatedMessageLite$GeneratedExtension0.singularToFieldSetType(object0);
            fieldSet0.setRepeatedField(generatedMessageLite$GeneratedExtension0.descriptor, v, object1);
            return this;
        }

        public final ExtendableBuilder setExtension(ExtensionLite extensionLite0, Object object0) {
            GeneratedExtension generatedMessageLite$GeneratedExtension0 = GeneratedMessageLite.checkIsLite(extensionLite0);
            this.verifyExtensionContainingType(generatedMessageLite$GeneratedExtension0);
            this.copyOnWrite();
            FieldSet fieldSet0 = this.ensureExtensionsAreMutable();
            Object object1 = generatedMessageLite$GeneratedExtension0.toFieldSetType(object0);
            fieldSet0.setField(generatedMessageLite$GeneratedExtension0.descriptor, object1);
            return this;
        }

        private void verifyExtensionContainingType(GeneratedExtension generatedMessageLite$GeneratedExtension0) {
            if(generatedMessageLite$GeneratedExtension0.getContainingTypeDefaultInstance() != this.getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }
    }

    public static abstract class ExtendableMessage extends GeneratedMessageLite implements ExtendableMessageOrBuilder {
        public class ExtensionWriter {
            private final Iterator iter;
            private final boolean messageSetWireFormat;
            private Map.Entry next;

            private ExtensionWriter(boolean z) {
                Iterator iterator0 = generatedMessageLite$ExtendableMessage0.extensions.iterator();
                this.iter = iterator0;
                if(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    this.next = (Map.Entry)object0;
                }
                this.messageSetWireFormat = z;
            }

            ExtensionWriter(boolean z, a generatedMessageLite$a0) {
                this(z);
            }

            public void writeUntil(int v, CodedOutputStream codedOutputStream0) throws IOException {
                while(this.next != null && ((com.google.protobuf.GeneratedMessageLite.b)this.next.getKey()).getNumber() < v) {
                    com.google.protobuf.GeneratedMessageLite.b generatedMessageLite$b0 = (com.google.protobuf.GeneratedMessageLite.b)this.next.getKey();
                    if(!this.messageSetWireFormat || generatedMessageLite$b0.getLiteJavaType() != JavaType.MESSAGE || generatedMessageLite$b0.isRepeated()) {
                        FieldSet.writeField(generatedMessageLite$b0, this.next.getValue(), codedOutputStream0);
                    }
                    else {
                        codedOutputStream0.writeMessageSetExtension(generatedMessageLite$b0.getNumber(), ((MessageLite)this.next.getValue()));
                    }
                    if(this.iter.hasNext()) {
                        Object object0 = this.iter.next();
                        this.next = (Map.Entry)object0;
                    }
                    else {
                        this.next = null;
                    }
                }
            }
        }

        protected FieldSet extensions;

        public ExtendableMessage() {
            this.extensions = FieldSet.emptySet();
        }

        private void eagerlyMergeMessageSetExtension(CodedInputStream codedInputStream0, GeneratedExtension generatedMessageLite$GeneratedExtension0, ExtensionRegistryLite extensionRegistryLite0, int v) throws IOException {
            this.parseExtension(codedInputStream0, extensionRegistryLite0, generatedMessageLite$GeneratedExtension0, v << 3 | 2, v);
        }

        @j
        FieldSet ensureExtensionsAreMutable() {
            if(this.extensions.isImmutable()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        protected boolean extensionsAreInitialized() {
            return this.extensions.isInitialized();
        }

        protected int extensionsSerializedSize() {
            return this.extensions.getSerializedSize();
        }

        protected int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.getMessageSetSerializedSize();
        }

        @Override  // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.MessageLiteOrBuilder
        public MessageLite getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override  // com.google.protobuf.GeneratedMessageLite$ExtendableMessageOrBuilder
        public final Object getExtension(ExtensionLite extensionLite0) {
            GeneratedExtension generatedMessageLite$GeneratedExtension0 = GeneratedMessageLite.checkIsLite(extensionLite0);
            this.verifyExtensionContainingType(generatedMessageLite$GeneratedExtension0);
            Object object0 = this.extensions.getField(generatedMessageLite$GeneratedExtension0.descriptor);
            return object0 == null ? generatedMessageLite$GeneratedExtension0.defaultValue : generatedMessageLite$GeneratedExtension0.fromFieldSetType(object0);
        }

        @Override  // com.google.protobuf.GeneratedMessageLite$ExtendableMessageOrBuilder
        public final Object getExtension(ExtensionLite extensionLite0, int v) {
            GeneratedExtension generatedMessageLite$GeneratedExtension0 = GeneratedMessageLite.checkIsLite(extensionLite0);
            this.verifyExtensionContainingType(generatedMessageLite$GeneratedExtension0);
            return generatedMessageLite$GeneratedExtension0.singularFromFieldSetType(this.extensions.getRepeatedField(generatedMessageLite$GeneratedExtension0.descriptor, v));
        }

        @Override  // com.google.protobuf.GeneratedMessageLite$ExtendableMessageOrBuilder
        public final int getExtensionCount(ExtensionLite extensionLite0) {
            GeneratedExtension generatedMessageLite$GeneratedExtension0 = GeneratedMessageLite.checkIsLite(extensionLite0);
            this.verifyExtensionContainingType(generatedMessageLite$GeneratedExtension0);
            return this.extensions.getRepeatedFieldCount(generatedMessageLite$GeneratedExtension0.descriptor);
        }

        @Override  // com.google.protobuf.GeneratedMessageLite$ExtendableMessageOrBuilder
        public final boolean hasExtension(ExtensionLite extensionLite0) {
            GeneratedExtension generatedMessageLite$GeneratedExtension0 = GeneratedMessageLite.checkIsLite(extensionLite0);
            this.verifyExtensionContainingType(generatedMessageLite$GeneratedExtension0);
            return this.extensions.hasField(generatedMessageLite$GeneratedExtension0.descriptor);
        }

        protected final void mergeExtensionFields(ExtendableMessage generatedMessageLite$ExtendableMessage0) {
            if(this.extensions.isImmutable()) {
                this.extensions = this.extensions.clone();
            }
            this.extensions.mergeFrom(generatedMessageLite$ExtendableMessage0.extensions);
        }

        private void mergeMessageSetExtensionFromBytes(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0, GeneratedExtension generatedMessageLite$GeneratedExtension0) throws IOException {
            MessageLite messageLite0 = (MessageLite)this.extensions.getField(generatedMessageLite$GeneratedExtension0.descriptor);
            com.google.protobuf.MessageLite.Builder messageLite$Builder0 = messageLite0 == null ? null : messageLite0.toBuilder();
            if(messageLite$Builder0 == null) {
                messageLite$Builder0 = generatedMessageLite$GeneratedExtension0.getMessageDefaultInstance().newBuilderForType();
            }
            messageLite$Builder0.mergeFrom(byteString0, extensionRegistryLite0);
            MessageLite messageLite1 = messageLite$Builder0.build();
            FieldSet fieldSet0 = this.ensureExtensionsAreMutable();
            Object object0 = generatedMessageLite$GeneratedExtension0.singularToFieldSetType(messageLite1);
            fieldSet0.setField(generatedMessageLite$GeneratedExtension0.descriptor, object0);
        }

        private void mergeMessageSetExtensionFromCodedStream(MessageLite messageLite0, CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            int v = 0;
            ByteString byteString0 = null;
            GeneratedExtension generatedMessageLite$GeneratedExtension0 = null;
        alab1:
            while(true) {
                do {
                label_3:
                    int v1 = codedInputStream0.readTag();
                    if(v1 == 0) {
                        break alab1;
                    }
                    if(v1 != WireFormat.MESSAGE_SET_TYPE_ID_TAG) {
                        goto label_10;
                    }
                    v = codedInputStream0.readUInt32();
                }
                while(v == 0);
                generatedMessageLite$GeneratedExtension0 = extensionRegistryLite0.findLiteExtensionByNumber(messageLite0, v);
                goto label_3;
            label_10:
                if(v1 == WireFormat.MESSAGE_SET_MESSAGE_TAG) {
                    if(v == 0 || generatedMessageLite$GeneratedExtension0 == null) {
                        byteString0 = codedInputStream0.readBytes();
                    }
                    else {
                        this.eagerlyMergeMessageSetExtension(codedInputStream0, generatedMessageLite$GeneratedExtension0, extensionRegistryLite0, v);
                        byteString0 = null;
                    }
                    goto label_3;
                }
                if(codedInputStream0.skipField(v1)) {
                    goto label_3;
                }
                break;
            }
            codedInputStream0.checkLastTagWas(WireFormat.MESSAGE_SET_ITEM_END_TAG);
            if(byteString0 != null && v != 0) {
                if(generatedMessageLite$GeneratedExtension0 != null) {
                    this.mergeMessageSetExtensionFromBytes(byteString0, extensionRegistryLite0, generatedMessageLite$GeneratedExtension0);
                    return;
                }
                this.mergeLengthDelimitedField(v, byteString0);
            }
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        public com.google.protobuf.MessageLite.Builder newBuilderForType() {
            return super.newBuilderForType();
        }

        protected ExtensionWriter newExtensionWriter() {
            return new ExtensionWriter(this, false, null);
        }

        protected ExtensionWriter newMessageSetExtensionWriter() {
            return new ExtensionWriter(this, true, null);
        }

        private boolean parseExtension(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0, GeneratedExtension generatedMessageLite$GeneratedExtension0, int v, int v1) throws IOException {
            Object object2;
            com.google.protobuf.MessageLite.Builder messageLite$Builder0;
            boolean z1;
            boolean z;
            if(generatedMessageLite$GeneratedExtension0 == null) {
                z = true;
                z1 = false;
            }
            else if((v & 7) == FieldSet.getWireFormatForFieldType(generatedMessageLite$GeneratedExtension0.descriptor.getLiteType(), false)) {
                z = false;
                z1 = false;
            }
            else if(!generatedMessageLite$GeneratedExtension0.descriptor.isRepeated || !generatedMessageLite$GeneratedExtension0.descriptor.type.isPackable() || (v & 7) != FieldSet.getWireFormatForFieldType(generatedMessageLite$GeneratedExtension0.descriptor.getLiteType(), true)) {
                z = true;
                z1 = false;
            }
            else {
                z1 = true;
                z = false;
            }
            if(z) {
                return this.parseUnknownField(v, codedInputStream0);
            }
            this.ensureExtensionsAreMutable();
            if(z1) {
                int v2 = codedInputStream0.pushLimit(codedInputStream0.readRawVarint32());
                if(generatedMessageLite$GeneratedExtension0.descriptor.getLiteType() == FieldType.ENUM) {
                    while(codedInputStream0.getBytesUntilLimit() > 0) {
                        int v3 = codedInputStream0.readEnum();
                        EnumLite internal$EnumLite0 = generatedMessageLite$GeneratedExtension0.descriptor.getEnumType().findValueByNumber(v3);
                        if(internal$EnumLite0 == null) {
                            return true;
                        }
                        FieldSet fieldSet0 = this.extensions;
                        Object object0 = generatedMessageLite$GeneratedExtension0.singularToFieldSetType(internal$EnumLite0);
                        fieldSet0.addRepeatedField(generatedMessageLite$GeneratedExtension0.descriptor, object0);
                    }
                }
                else {
                    while(codedInputStream0.getBytesUntilLimit() > 0) {
                        Object object1 = FieldSet.readPrimitiveField(codedInputStream0, generatedMessageLite$GeneratedExtension0.descriptor.getLiteType(), false);
                        this.extensions.addRepeatedField(generatedMessageLite$GeneratedExtension0.descriptor, object1);
                    }
                }
                codedInputStream0.popLimit(v2);
                return true;
            }
            switch(generatedMessageLite$GeneratedExtension0.descriptor.getLiteJavaType()) {
                case 1: {
                    if(generatedMessageLite$GeneratedExtension0.descriptor.isRepeated()) {
                        messageLite$Builder0 = null;
                    }
                    else {
                        MessageLite messageLite0 = (MessageLite)this.extensions.getField(generatedMessageLite$GeneratedExtension0.descriptor);
                        messageLite$Builder0 = messageLite0 == null ? null : messageLite0.toBuilder();
                    }
                    if(messageLite$Builder0 == null) {
                        messageLite$Builder0 = generatedMessageLite$GeneratedExtension0.getMessageDefaultInstance().newBuilderForType();
                    }
                    if(generatedMessageLite$GeneratedExtension0.descriptor.getLiteType() == FieldType.GROUP) {
                        codedInputStream0.readGroup(generatedMessageLite$GeneratedExtension0.getNumber(), messageLite$Builder0, extensionRegistryLite0);
                    }
                    else {
                        codedInputStream0.readMessage(messageLite$Builder0, extensionRegistryLite0);
                    }
                    object2 = messageLite$Builder0.build();
                    break;
                }
                case 2: {
                    int v4 = codedInputStream0.readEnum();
                    EnumLite internal$EnumLite1 = generatedMessageLite$GeneratedExtension0.descriptor.getEnumType().findValueByNumber(v4);
                    if(internal$EnumLite1 == null) {
                        this.mergeVarintField(v1, v4);
                        return true;
                    }
                    object2 = internal$EnumLite1;
                    break;
                }
                default: {
                    object2 = FieldSet.readPrimitiveField(codedInputStream0, generatedMessageLite$GeneratedExtension0.descriptor.getLiteType(), false);
                }
            }
            if(generatedMessageLite$GeneratedExtension0.descriptor.isRepeated()) {
                FieldSet fieldSet1 = this.extensions;
                Object object3 = generatedMessageLite$GeneratedExtension0.singularToFieldSetType(object2);
                fieldSet1.addRepeatedField(generatedMessageLite$GeneratedExtension0.descriptor, object3);
                return true;
            }
            FieldSet fieldSet2 = this.extensions;
            Object object4 = generatedMessageLite$GeneratedExtension0.singularToFieldSetType(object2);
            fieldSet2.setField(generatedMessageLite$GeneratedExtension0.descriptor, object4);
            return true;
        }

        protected boolean parseUnknownField(MessageLite messageLite0, CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0, int v) throws IOException {
            return this.parseExtension(codedInputStream0, extensionRegistryLite0, extensionRegistryLite0.findLiteExtensionByNumber(messageLite0, v >>> 3), v, v >>> 3);
        }

        protected boolean parseUnknownFieldAsMessageSet(MessageLite messageLite0, CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0, int v) throws IOException {
            if(v == WireFormat.MESSAGE_SET_ITEM_TAG) {
                this.mergeMessageSetExtensionFromCodedStream(messageLite0, codedInputStream0, extensionRegistryLite0);
                return true;
            }
            return (v & 7) == 2 ? this.parseUnknownField(messageLite0, codedInputStream0, extensionRegistryLite0, v) : codedInputStream0.skipField(v);
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        public com.google.protobuf.MessageLite.Builder toBuilder() {
            return super.toBuilder();
        }

        private void verifyExtensionContainingType(GeneratedExtension generatedMessageLite$GeneratedExtension0) {
            if(generatedMessageLite$GeneratedExtension0.getContainingTypeDefaultInstance() != this.getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }
    }

    public interface ExtendableMessageOrBuilder extends MessageLiteOrBuilder {
        Object getExtension(ExtensionLite arg1);

        Object getExtension(ExtensionLite arg1, int arg2);

        int getExtensionCount(ExtensionLite arg1);

        boolean hasExtension(ExtensionLite arg1);
    }

    public static class GeneratedExtension extends ExtensionLite {
        final MessageLite containingTypeDefaultInstance;
        final Object defaultValue;
        final com.google.protobuf.GeneratedMessageLite.b descriptor;
        final MessageLite messageDefaultInstance;

        GeneratedExtension(MessageLite messageLite0, Object object0, MessageLite messageLite1, com.google.protobuf.GeneratedMessageLite.b generatedMessageLite$b0, Class class0) {
            if(messageLite0 == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if(generatedMessageLite$b0.getLiteType() == FieldType.MESSAGE && messageLite1 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.containingTypeDefaultInstance = messageLite0;
            this.defaultValue = object0;
            this.messageDefaultInstance = messageLite1;
            this.descriptor = generatedMessageLite$b0;
        }

        Object fromFieldSetType(Object object0) {
            if(this.descriptor.isRepeated()) {
                if(this.descriptor.getLiteJavaType() == JavaType.ENUM) {
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object1: ((List)object0)) {
                        arrayList0.add(this.singularFromFieldSetType(object1));
                    }
                    return arrayList0;
                }
                return object0;
            }
            return this.singularFromFieldSetType(object0);
        }

        public MessageLite getContainingTypeDefaultInstance() {
            return this.containingTypeDefaultInstance;
        }

        @Override  // com.google.protobuf.ExtensionLite
        public Object getDefaultValue() {
            return this.defaultValue;
        }

        @Override  // com.google.protobuf.ExtensionLite
        public FieldType getLiteType() {
            return this.descriptor.getLiteType();
        }

        @Override  // com.google.protobuf.ExtensionLite
        public MessageLite getMessageDefaultInstance() {
            return this.messageDefaultInstance;
        }

        @Override  // com.google.protobuf.ExtensionLite
        public int getNumber() {
            return this.descriptor.getNumber();
        }

        @Override  // com.google.protobuf.ExtensionLite
        public boolean isRepeated() {
            return this.descriptor.isRepeated;
        }

        Object singularFromFieldSetType(Object object0) {
            return this.descriptor.getLiteJavaType() == JavaType.ENUM ? this.descriptor.enumTypeMap.findValueByNumber(((int)(((Integer)object0)))) : object0;
        }

        Object singularToFieldSetType(Object object0) {
            return this.descriptor.getLiteJavaType() == JavaType.ENUM ? ((EnumLite)object0).getNumber() : object0;
        }

        Object toFieldSetType(Object object0) {
            if(this.descriptor.isRepeated()) {
                if(this.descriptor.getLiteJavaType() == JavaType.ENUM) {
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object1: ((List)object0)) {
                        arrayList0.add(this.singularToFieldSetType(object1));
                    }
                    return arrayList0;
                }
                return object0;
            }
            return this.singularToFieldSetType(object0);
        }
    }

    public static enum MethodToInvoke {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER;

    }

    public static final class SerializedForm implements Serializable {
        private final byte[] asBytes;
        private final Class messageClass;
        private final String messageClassName;
        private static final long serialVersionUID;

        SerializedForm(MessageLite messageLite0) {
            this.messageClass = messageLite0.getClass();
            this.messageClassName = messageLite0.getClass().getName();
            this.asBytes = messageLite0.toByteArray();
        }

        public static SerializedForm of(MessageLite messageLite0) {
            return new SerializedForm(messageLite0);
        }

        protected Object readResolve() throws ObjectStreamException {
            try {
                Field field0 = this.resolveMessageClass().getDeclaredField("DEFAULT_INSTANCE");
                field0.setAccessible(true);
                return ((MessageLite)field0.get(null)).newBuilderForType().mergeFrom(this.asBytes).buildPartial();
            }
            catch(ClassNotFoundException classNotFoundException0) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.messageClassName, classNotFoundException0);
            }
            catch(NoSuchFieldException unused_ex) {
                return this.readResolveFallback();
            }
            catch(SecurityException securityException0) {
                throw new RuntimeException("Unable to call DEFAULT_INSTANCE in " + this.messageClassName, securityException0);
            }
            catch(IllegalAccessException illegalAccessException0) {
                throw new RuntimeException("Unable to call parsePartialFrom", illegalAccessException0);
            }
            catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                throw new RuntimeException("Unable to understand proto buffer", invalidProtocolBufferException0);
            }
        }

        @Deprecated
        private Object readResolveFallback() throws ObjectStreamException {
            try {
                Field field0 = this.resolveMessageClass().getDeclaredField("defaultInstance");
                field0.setAccessible(true);
                return ((MessageLite)field0.get(null)).newBuilderForType().mergeFrom(this.asBytes).buildPartial();
            }
            catch(ClassNotFoundException classNotFoundException0) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.messageClassName, classNotFoundException0);
            }
            catch(NoSuchFieldException noSuchFieldException0) {
                throw new RuntimeException("Unable to find defaultInstance in " + this.messageClassName, noSuchFieldException0);
            }
            catch(SecurityException securityException0) {
                throw new RuntimeException("Unable to call defaultInstance in " + this.messageClassName, securityException0);
            }
            catch(IllegalAccessException illegalAccessException0) {
                throw new RuntimeException("Unable to call parsePartialFrom", illegalAccessException0);
            }
            catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                throw new RuntimeException("Unable to understand proto buffer", invalidProtocolBufferException0);
            }
        }

        private Class resolveMessageClass() throws ClassNotFoundException {
            return this.messageClass == null ? Class.forName(this.messageClassName) : this.messageClass;
        }
    }

    static class a {
        static final int[] $SwitchMap$com$google$protobuf$WireFormat$JavaType;

        static {
            int[] arr_v = new int[JavaType.values().length];
            a.$SwitchMap$com$google$protobuf$WireFormat$JavaType = arr_v;
            try {
                arr_v[JavaType.MESSAGE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.$SwitchMap$com$google$protobuf$WireFormat$JavaType[JavaType.ENUM.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    static final class com.google.protobuf.GeneratedMessageLite.b implements FieldDescriptorLite {
        final EnumLiteMap enumTypeMap;
        final boolean isPacked;
        final boolean isRepeated;
        final int number;
        final FieldType type;

        com.google.protobuf.GeneratedMessageLite.b(EnumLiteMap internal$EnumLiteMap0, int v, FieldType wireFormat$FieldType0, boolean z, boolean z1) {
            this.enumTypeMap = internal$EnumLiteMap0;
            this.number = v;
            this.type = wireFormat$FieldType0;
            this.isRepeated = z;
            this.isPacked = z1;
        }

        public int compareTo(com.google.protobuf.GeneratedMessageLite.b generatedMessageLite$b0) {
            return this.number - generatedMessageLite$b0.number;
        }

        @Override
        public int compareTo(Object object0) {
            return this.compareTo(((com.google.protobuf.GeneratedMessageLite.b)object0));
        }

        @Override  // com.google.protobuf.FieldSet$FieldDescriptorLite
        public EnumLiteMap getEnumType() {
            return this.enumTypeMap;
        }

        @Override  // com.google.protobuf.FieldSet$FieldDescriptorLite
        public JavaType getLiteJavaType() {
            return this.type.getJavaType();
        }

        @Override  // com.google.protobuf.FieldSet$FieldDescriptorLite
        public FieldType getLiteType() {
            return this.type;
        }

        @Override  // com.google.protobuf.FieldSet$FieldDescriptorLite
        public int getNumber() {
            return this.number;
        }

        @Override  // com.google.protobuf.FieldSet$FieldDescriptorLite
        public com.google.protobuf.MessageLite.Builder internalMergeFrom(com.google.protobuf.MessageLite.Builder messageLite$Builder0, MessageLite messageLite0) {
            return ((Builder)messageLite$Builder0).mergeFrom(((GeneratedMessageLite)messageLite0));
        }

        @Override  // com.google.protobuf.FieldSet$FieldDescriptorLite
        public boolean isPacked() {
            return this.isPacked;
        }

        @Override  // com.google.protobuf.FieldSet$FieldDescriptorLite
        public boolean isRepeated() {
            return this.isRepeated;
        }
    }

    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = 0x7FFFFFFF;
    private static final int MUTABLE_FLAG_MASK = 0x80000000;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = 0x7FFFFFFF;
    private static Map defaultInstanceMap;
    private int memoizedSerializedSize;
    protected UnknownFieldSetLite unknownFields;

    static {
        GeneratedMessageLite.defaultInstanceMap = new ConcurrentHashMap();
    }

    public GeneratedMessageLite() {
        this.memoizedSerializedSize = -1;
        this.unknownFields = UnknownFieldSetLite.getDefaultInstance();
    }

    Object buildMessageInfo() throws Exception {
        return this.dynamicMethod(MethodToInvoke.BUILD_MESSAGE_INFO);
    }

    private static GeneratedExtension checkIsLite(ExtensionLite extensionLite0) {
        return (GeneratedExtension)extensionLite0;
    }

    private static GeneratedMessageLite checkMessageInitialized(GeneratedMessageLite generatedMessageLite0) throws InvalidProtocolBufferException {
        if(generatedMessageLite0 != null && !generatedMessageLite0.isInitialized()) {
            throw generatedMessageLite0.newUninitializedMessageException().asInvalidProtocolBufferException().setUnfinishedMessage(generatedMessageLite0);
        }
        return generatedMessageLite0;
    }

    void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    void clearMemoizedSerializedSize() {
        this.setMemoizedSerializedSize(0x7FFFFFFF);
    }

    int computeHashCode() {
        return X.getInstance().schemaFor(this).hashCode(this);
    }

    private int computeSerializedSize(c0 c00) {
        return c00 == null ? X.getInstance().schemaFor(this).getSerializedSize(this) : c00.getSerializedSize(this);
    }

    protected final Builder createBuilder() {
        return (Builder)this.dynamicMethod(MethodToInvoke.NEW_BUILDER);
    }

    protected final Builder createBuilder(GeneratedMessageLite generatedMessageLite0) {
        return this.createBuilder().mergeFrom(generatedMessageLite0);
    }

    protected Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0) {
        return this.dynamicMethod(generatedMessageLite$MethodToInvoke0, null, null);
    }

    @j
    protected Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0) {
        return this.dynamicMethod(generatedMessageLite$MethodToInvoke0, object0, null);
    }

    protected abstract Object dynamicMethod(MethodToInvoke arg1, Object arg2, Object arg3);

    protected static BooleanList emptyBooleanList() {
        return g.emptyList();
    }

    protected static DoubleList emptyDoubleList() {
        return o.emptyList();
    }

    protected static FloatList emptyFloatList() {
        return t.emptyList();
    }

    protected static IntList emptyIntList() {
        return w.emptyList();
    }

    protected static LongList emptyLongList() {
        return F.emptyList();
    }

    protected static ProtobufList emptyProtobufList() {
        return Y.emptyList();
    }

    private void ensureUnknownFieldsInitialized() {
        if(this.unknownFields == UnknownFieldSetLite.getDefaultInstance()) {
            this.unknownFields = UnknownFieldSetLite.newInstance();
        }
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null) {
            return false;
        }
        return this.getClass() == object0.getClass() ? X.getInstance().schemaFor(this).equals(this, ((GeneratedMessageLite)object0)) : false;
    }

    static GeneratedMessageLite getDefaultInstance(Class class0) {
        GeneratedMessageLite generatedMessageLite0 = (GeneratedMessageLite)GeneratedMessageLite.defaultInstanceMap.get(class0);
        if(generatedMessageLite0 == null) {
            try {
                Class.forName(class0.getName(), true, class0.getClassLoader());
            }
            catch(ClassNotFoundException classNotFoundException0) {
                throw new IllegalStateException("Class initialization cannot fail.", classNotFoundException0);
            }
            generatedMessageLite0 = (GeneratedMessageLite)GeneratedMessageLite.defaultInstanceMap.get(class0);
        }
        if(generatedMessageLite0 == null) {
            generatedMessageLite0 = ((GeneratedMessageLite)j0.allocateInstance(class0)).getDefaultInstanceForType();
            if(generatedMessageLite0 == null) {
                throw new IllegalStateException();
            }
            GeneratedMessageLite.defaultInstanceMap.put(class0, generatedMessageLite0);
            return generatedMessageLite0;
        }
        return generatedMessageLite0;
    }

    public final GeneratedMessageLite getDefaultInstanceForType() {
        return (GeneratedMessageLite)this.dynamicMethod(MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    @Override  // com.google.protobuf.MessageLiteOrBuilder
    public MessageLite getDefaultInstanceForType() {
        return this.getDefaultInstanceForType();
    }

    int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    @Override  // com.google.protobuf.AbstractMessageLite
    int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & 0x7FFFFFFF;
    }

    static Method getMethodOrDie(Class class0, String s, Class[] arr_class) {
        try {
            return class0.getMethod(s, arr_class);
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            throw new RuntimeException("Generated message class \"" + class0.getName() + "\" missing method \"" + s + "\".", noSuchMethodException0);
        }
    }

    @Override  // com.google.protobuf.MessageLite
    public final Parser getParserForType() {
        return (Parser)this.dynamicMethod(MethodToInvoke.GET_PARSER);
    }

    @Override  // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        return this.getSerializedSize(null);
    }

    @Override  // com.google.protobuf.AbstractMessageLite
    int getSerializedSize(c0 c00) {
        if(this.isMutable()) {
            int v = this.computeSerializedSize(c00);
            if(v < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + v);
            }
            return v;
        }
        if(this.getMemoizedSerializedSize() != 0x7FFFFFFF) {
            return this.getMemoizedSerializedSize();
        }
        int v1 = this.computeSerializedSize(c00);
        this.setMemoizedSerializedSize(v1);
        return v1;
    }

    @Override
    public int hashCode() {
        if(this.isMutable()) {
            return this.computeHashCode();
        }
        if(this.hashCodeIsNotMemoized()) {
            this.setMemoizedHashCode(this.computeHashCode());
        }
        return this.getMemoizedHashCode();
    }

    boolean hashCodeIsNotMemoized() {
        return this.getMemoizedHashCode() == 0;
    }

    static Object invokeOrDie(Method method0, Object object0, Object[] arr_object) {
        try {
            return method0.invoke(object0, arr_object);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new RuntimeException("Couldn\'t use Java reflection to implement protocol message reflection.", illegalAccessException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            Throwable throwable0 = invocationTargetException0.getCause();
            if(throwable0 instanceof RuntimeException) {
                throw (RuntimeException)throwable0;
            }
            if(throwable0 instanceof Error) {
                throw (Error)throwable0;
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", throwable0);
        }
    }

    protected static final boolean isInitialized(GeneratedMessageLite generatedMessageLite0, boolean z) {
        int v = (byte)(((Byte)generatedMessageLite0.dynamicMethod(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)));
        if(v == 1) {
            return true;
        }
        if(v == 0) {
            return false;
        }
        boolean z1 = X.getInstance().schemaFor(generatedMessageLite0).isInitialized(generatedMessageLite0);
        if(z) {
            generatedMessageLite0.dynamicMethod(MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED, (z1 ? generatedMessageLite0 : null));
        }
        return z1;
    }

    @Override  // com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        return GeneratedMessageLite.isInitialized(this, true);
    }

    boolean isMutable() {
        return (this.memoizedSerializedSize & 0x80000000) != 0;
    }

    protected void makeImmutable() {
        X.getInstance().schemaFor(this).makeImmutable(this);
        this.markImmutable();
    }

    void markImmutable() {
        this.memoizedSerializedSize &= 0x7FFFFFFF;
    }

    protected void mergeLengthDelimitedField(int v, ByteString byteString0) {
        this.ensureUnknownFieldsInitialized();
        this.unknownFields.mergeLengthDelimitedField(v, byteString0);
    }

    protected final void mergeUnknownFields(UnknownFieldSetLite unknownFieldSetLite0) {
        this.unknownFields = UnknownFieldSetLite.mutableCopyOf(this.unknownFields, unknownFieldSetLite0);
    }

    protected void mergeVarintField(int v, int v1) {
        this.ensureUnknownFieldsInitialized();
        this.unknownFields.mergeVarintField(v, v1);
    }

    protected static BooleanList mutableCopy(BooleanList internal$BooleanList0) {
        int v = internal$BooleanList0.size();
        return v == 0 ? internal$BooleanList0.mutableCopyWithCapacity(10) : internal$BooleanList0.mutableCopyWithCapacity(v * 2);
    }

    protected static DoubleList mutableCopy(DoubleList internal$DoubleList0) {
        int v = internal$DoubleList0.size();
        return v == 0 ? internal$DoubleList0.mutableCopyWithCapacity(10) : internal$DoubleList0.mutableCopyWithCapacity(v * 2);
    }

    protected static FloatList mutableCopy(FloatList internal$FloatList0) {
        int v = internal$FloatList0.size();
        return v == 0 ? internal$FloatList0.mutableCopyWithCapacity(10) : internal$FloatList0.mutableCopyWithCapacity(v * 2);
    }

    protected static IntList mutableCopy(IntList internal$IntList0) {
        int v = internal$IntList0.size();
        return v == 0 ? internal$IntList0.mutableCopyWithCapacity(10) : internal$IntList0.mutableCopyWithCapacity(v * 2);
    }

    protected static LongList mutableCopy(LongList internal$LongList0) {
        int v = internal$LongList0.size();
        return v == 0 ? internal$LongList0.mutableCopyWithCapacity(10) : internal$LongList0.mutableCopyWithCapacity(v * 2);
    }

    protected static ProtobufList mutableCopy(ProtobufList internal$ProtobufList0) {
        int v = internal$ProtobufList0.size();
        return v == 0 ? internal$ProtobufList0.mutableCopyWithCapacity(10) : internal$ProtobufList0.mutableCopyWithCapacity(v * 2);
    }

    public final Builder newBuilderForType() {
        return (Builder)this.dynamicMethod(MethodToInvoke.NEW_BUILDER);
    }

    @Override  // com.google.protobuf.MessageLite
    public com.google.protobuf.MessageLite.Builder newBuilderForType() {
        return this.newBuilderForType();
    }

    protected static Object newMessageInfo(MessageLite messageLite0, String s, Object[] arr_object) {
        return new Z(messageLite0, s, arr_object);
    }

    GeneratedMessageLite newMutableInstance() {
        return (GeneratedMessageLite)this.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
    }

    public static GeneratedExtension newRepeatedGeneratedExtension(MessageLite messageLite0, MessageLite messageLite1, EnumLiteMap internal$EnumLiteMap0, int v, FieldType wireFormat$FieldType0, boolean z, Class class0) {
        return new GeneratedExtension(messageLite0, Collections.emptyList(), messageLite1, new com.google.protobuf.GeneratedMessageLite.b(internal$EnumLiteMap0, v, wireFormat$FieldType0, true, z), class0);
    }

    public static GeneratedExtension newSingularGeneratedExtension(MessageLite messageLite0, Object object0, MessageLite messageLite1, EnumLiteMap internal$EnumLiteMap0, int v, FieldType wireFormat$FieldType0, Class class0) {
        return new GeneratedExtension(messageLite0, object0, messageLite1, new com.google.protobuf.GeneratedMessageLite.b(internal$EnumLiteMap0, v, wireFormat$FieldType0, false, false), class0);
    }

    protected static GeneratedMessageLite parseDelimitedFrom(GeneratedMessageLite generatedMessageLite0, InputStream inputStream0) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.checkMessageInitialized(GeneratedMessageLite.parsePartialDelimitedFrom(generatedMessageLite0, inputStream0, ExtensionRegistryLite.getEmptyRegistry()));
    }

    protected static GeneratedMessageLite parseDelimitedFrom(GeneratedMessageLite generatedMessageLite0, InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.checkMessageInitialized(GeneratedMessageLite.parsePartialDelimitedFrom(generatedMessageLite0, inputStream0, extensionRegistryLite0));
    }

    protected static GeneratedMessageLite parseFrom(GeneratedMessageLite generatedMessageLite0, ByteString byteString0) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.checkMessageInitialized(GeneratedMessageLite.parseFrom(generatedMessageLite0, byteString0, ExtensionRegistryLite.getEmptyRegistry()));
    }

    protected static GeneratedMessageLite parseFrom(GeneratedMessageLite generatedMessageLite0, ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.checkMessageInitialized(GeneratedMessageLite.parsePartialFrom(generatedMessageLite0, byteString0, extensionRegistryLite0));
    }

    protected static GeneratedMessageLite parseFrom(GeneratedMessageLite generatedMessageLite0, CodedInputStream codedInputStream0) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(generatedMessageLite0, codedInputStream0, ExtensionRegistryLite.getEmptyRegistry());
    }

    protected static GeneratedMessageLite parseFrom(GeneratedMessageLite generatedMessageLite0, CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.checkMessageInitialized(GeneratedMessageLite.parsePartialFrom(generatedMessageLite0, codedInputStream0, extensionRegistryLite0));
    }

    protected static GeneratedMessageLite parseFrom(GeneratedMessageLite generatedMessageLite0, InputStream inputStream0) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.checkMessageInitialized(GeneratedMessageLite.parsePartialFrom(generatedMessageLite0, CodedInputStream.newInstance(inputStream0), ExtensionRegistryLite.getEmptyRegistry()));
    }

    protected static GeneratedMessageLite parseFrom(GeneratedMessageLite generatedMessageLite0, InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.checkMessageInitialized(GeneratedMessageLite.parsePartialFrom(generatedMessageLite0, CodedInputStream.newInstance(inputStream0), extensionRegistryLite0));
    }

    protected static GeneratedMessageLite parseFrom(GeneratedMessageLite generatedMessageLite0, ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parseFrom(generatedMessageLite0, byteBuffer0, ExtensionRegistryLite.getEmptyRegistry());
    }

    protected static GeneratedMessageLite parseFrom(GeneratedMessageLite generatedMessageLite0, ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.checkMessageInitialized(GeneratedMessageLite.parseFrom(generatedMessageLite0, CodedInputStream.newInstance(byteBuffer0), extensionRegistryLite0));
    }

    protected static GeneratedMessageLite parseFrom(GeneratedMessageLite generatedMessageLite0, byte[] arr_b) throws InvalidProtocolBufferException {
        ExtensionRegistryLite extensionRegistryLite0 = ExtensionRegistryLite.getEmptyRegistry();
        return GeneratedMessageLite.checkMessageInitialized(GeneratedMessageLite.parsePartialFrom(generatedMessageLite0, arr_b, 0, arr_b.length, extensionRegistryLite0));
    }

    protected static GeneratedMessageLite parseFrom(GeneratedMessageLite generatedMessageLite0, byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.checkMessageInitialized(GeneratedMessageLite.parsePartialFrom(generatedMessageLite0, arr_b, 0, arr_b.length, extensionRegistryLite0));
    }

    private static GeneratedMessageLite parsePartialDelimitedFrom(GeneratedMessageLite generatedMessageLite0, InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        int v1;
        try {
            int v = inputStream0.read();
            if(v == -1) {
                return null;
            }
            v1 = CodedInputStream.readRawVarint32(v, inputStream0);
        }
        catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
            if(invalidProtocolBufferException0.getThrownFromInputStream()) {
                invalidProtocolBufferException0 = new InvalidProtocolBufferException(invalidProtocolBufferException0);
            }
            throw invalidProtocolBufferException0;
        }
        catch(IOException iOException0) {
            throw new InvalidProtocolBufferException(iOException0);
        }
        CodedInputStream codedInputStream0 = CodedInputStream.newInstance(new com.google.protobuf.AbstractMessageLite.Builder.a(inputStream0, v1));
        GeneratedMessageLite generatedMessageLite1 = GeneratedMessageLite.parsePartialFrom(generatedMessageLite0, codedInputStream0, extensionRegistryLite0);
        try {
            codedInputStream0.checkLastTagWas(0);
            return generatedMessageLite1;
        }
        catch(InvalidProtocolBufferException invalidProtocolBufferException1) {
            throw invalidProtocolBufferException1.setUnfinishedMessage(generatedMessageLite1);
        }
    }

    private static GeneratedMessageLite parsePartialFrom(GeneratedMessageLite generatedMessageLite0, ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        CodedInputStream codedInputStream0 = byteString0.newCodedInput();
        GeneratedMessageLite generatedMessageLite1 = GeneratedMessageLite.parsePartialFrom(generatedMessageLite0, codedInputStream0, extensionRegistryLite0);
        try {
            codedInputStream0.checkLastTagWas(0);
            return generatedMessageLite1;
        }
        catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
            throw invalidProtocolBufferException0.setUnfinishedMessage(generatedMessageLite1);
        }
    }

    protected static GeneratedMessageLite parsePartialFrom(GeneratedMessageLite generatedMessageLite0, CodedInputStream codedInputStream0) throws InvalidProtocolBufferException {
        return GeneratedMessageLite.parsePartialFrom(generatedMessageLite0, codedInputStream0, ExtensionRegistryLite.getEmptyRegistry());
    }

    static GeneratedMessageLite parsePartialFrom(GeneratedMessageLite generatedMessageLite0, CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        GeneratedMessageLite generatedMessageLite1 = generatedMessageLite0.newMutableInstance();
        try {
            c0 c00 = X.getInstance().schemaFor(generatedMessageLite1);
            c00.mergeFrom(generatedMessageLite1, l.forCodedInput(codedInputStream0), extensionRegistryLite0);
            c00.makeImmutable(generatedMessageLite1);
            return generatedMessageLite1;
        }
        catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
            if(invalidProtocolBufferException0.getThrownFromInputStream()) {
                invalidProtocolBufferException0 = new InvalidProtocolBufferException(invalidProtocolBufferException0);
            }
            throw invalidProtocolBufferException0.setUnfinishedMessage(generatedMessageLite1);
        }
        catch(UninitializedMessageException uninitializedMessageException0) {
            throw uninitializedMessageException0.asInvalidProtocolBufferException().setUnfinishedMessage(generatedMessageLite1);
        }
        catch(IOException iOException0) {
            throw iOException0.getCause() instanceof InvalidProtocolBufferException ? ((InvalidProtocolBufferException)iOException0.getCause()) : new InvalidProtocolBufferException(iOException0).setUnfinishedMessage(generatedMessageLite1);
        }
        catch(RuntimeException runtimeException0) {
            if(runtimeException0.getCause() instanceof InvalidProtocolBufferException) {
                throw (InvalidProtocolBufferException)runtimeException0.getCause();
            }
            throw runtimeException0;
        }
    }

    private static GeneratedMessageLite parsePartialFrom(GeneratedMessageLite generatedMessageLite0, byte[] arr_b, int v, int v1, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        GeneratedMessageLite generatedMessageLite1 = generatedMessageLite0.newMutableInstance();
        try {
            c0 c00 = X.getInstance().schemaFor(generatedMessageLite1);
            c00.mergeFrom(generatedMessageLite1, arr_b, v, v + v1, new b(extensionRegistryLite0));
            c00.makeImmutable(generatedMessageLite1);
            return generatedMessageLite1;
        }
        catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
            if(invalidProtocolBufferException0.getThrownFromInputStream()) {
                invalidProtocolBufferException0 = new InvalidProtocolBufferException(invalidProtocolBufferException0);
            }
            throw invalidProtocolBufferException0.setUnfinishedMessage(generatedMessageLite1);
        }
        catch(UninitializedMessageException uninitializedMessageException0) {
            throw uninitializedMessageException0.asInvalidProtocolBufferException().setUnfinishedMessage(generatedMessageLite1);
        }
        catch(IOException iOException0) {
            throw iOException0.getCause() instanceof InvalidProtocolBufferException ? ((InvalidProtocolBufferException)iOException0.getCause()) : new InvalidProtocolBufferException(iOException0).setUnfinishedMessage(generatedMessageLite1);
        }
        catch(IndexOutOfBoundsException unused_ex) {
            throw InvalidProtocolBufferException.truncatedMessage().setUnfinishedMessage(generatedMessageLite1);
        }
    }

    protected boolean parseUnknownField(int v, CodedInputStream codedInputStream0) throws IOException {
        if((v & 7) == 4) {
            return false;
        }
        this.ensureUnknownFieldsInitialized();
        return this.unknownFields.mergeFieldFrom(v, codedInputStream0);
    }

    protected static void registerDefaultInstance(Class class0, GeneratedMessageLite generatedMessageLite0) {
        generatedMessageLite0.markImmutable();
        GeneratedMessageLite.defaultInstanceMap.put(class0, generatedMessageLite0);
    }

    void setMemoizedHashCode(int v) {
        this.memoizedHashCode = v;
    }

    @Override  // com.google.protobuf.AbstractMessageLite
    void setMemoizedSerializedSize(int v) {
        if(v < 0) {
            throw new IllegalStateException("serialized size must be non-negative, was " + v);
        }
        this.memoizedSerializedSize = v & 0x7FFFFFFF | this.memoizedSerializedSize & 0x80000000;
    }

    public final Builder toBuilder() {
        return ((Builder)this.dynamicMethod(MethodToInvoke.NEW_BUILDER)).mergeFrom(this);
    }

    @Override  // com.google.protobuf.MessageLite
    public com.google.protobuf.MessageLite.Builder toBuilder() {
        return this.toBuilder();
    }

    @Override
    public String toString() {
        return M.toString(this, super.toString());
    }

    @Override  // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream0) throws IOException {
        X.getInstance().schemaFor(this).writeTo(this, m.forCodedOutput(codedOutputStream0));
    }
}

