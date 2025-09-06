package com.google.api;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite.Builder;
import com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class a extends GeneratedMessageLite implements b {
    static class com.google.api.a.a {
        static final int[] a;

        static {
            int[] arr_v = new int[MethodToInvoke.values().length];
            com.google.api.a.a.a = arr_v;
            try {
                arr_v[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.api.a.a.a[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.api.a.a.a[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.api.a.a.a[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.api.a.a.a[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.api.a.a.a[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.api.a.a.a[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static final class com.google.api.a.b extends Builder implements b {
        private com.google.api.a.b() {
            super(a.DEFAULT_INSTANCE);
        }

        com.google.api.a.b(com.google.api.a.a a$a0) {
        }

        @Override  // com.google.api.b
        public ByteString a() {
            return ((a)this.instance).a();
        }

        @Override  // com.google.api.b
        public String getDescription() {
            return ((a)this.instance).getDescription();
        }

        public com.google.api.a.b ub() {
            this.copyOnWrite();
            ((a)this.instance).F3();
            return this;
        }

        public com.google.api.a.b vb(String s) {
            this.copyOnWrite();
            ((a)this.instance).vb(s);
            return this;
        }

        public com.google.api.a.b wb(ByteString byteString0) {
            this.copyOnWrite();
            ((a)this.instance).wb(byteString0);
            return this;
        }
    }

    private static final a DEFAULT_INSTANCE = null;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    private static volatile Parser PARSER;
    private String description_;

    static {
        a a0 = new a();
        a.DEFAULT_INSTANCE = a0;
        GeneratedMessageLite.registerDefaultInstance(a.class, a0);
    }

    private a() {
        this.description_ = "";
    }

    public static a A6(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (a)GeneratedMessageLite.parseDelimitedFrom(a.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static a A8(InputStream inputStream0) throws IOException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, inputStream0);
    }

    public static a B6(ByteString byteString0) throws InvalidProtocolBufferException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, byteString0);
    }

    private void F3() {
        this.description_ = "";
    }

    public static a Ja(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static a La(byte[] arr_b) throws InvalidProtocolBufferException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, arr_b);
    }

    public static a M4() {
        return a.DEFAULT_INSTANCE;
    }

    public static a M6(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static com.google.api.a.b P4() {
        return (com.google.api.a.b)a.DEFAULT_INSTANCE.createBuilder();
    }

    public static a Z7(CodedInputStream codedInputStream0) throws IOException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, codedInputStream0);
    }

    @Override  // com.google.api.b
    public ByteString a() {
        return ByteString.copyFromUtf8(this.description_);
    }

    public static a ca(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static com.google.api.a.b d6(a a0) {
        return (com.google.api.a.b)a.DEFAULT_INSTANCE.createBuilder(a0);
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new a();
            }
            case 2: {
                return new com.google.api.a.b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(a.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"description_"});
            }
            case 4: {
                return a.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = a.PARSER;
                if(parser0 == null) {
                    Class class0 = a.class;
                    synchronized(class0) {
                        parser0 = a.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(a.DEFAULT_INSTANCE);
                            a.PARSER = parser0;
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

    @Override  // com.google.api.b
    public String getDescription() {
        return this.description_;
    }

    public static a j9(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Parser parser() {
        return a.DEFAULT_INSTANCE.getParserForType();
    }

    public static a ub(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static a v8(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    private void vb(String s) {
        s.getClass();
        this.description_ = s;
    }

    private void wb(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.description_ = byteString0.toStringUtf8();
    }

    public static a z6(InputStream inputStream0) throws IOException {
        return (a)GeneratedMessageLite.parseDelimitedFrom(a.DEFAULT_INSTANCE, inputStream0);
    }
}

