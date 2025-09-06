package com.google.longrunning;

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

public final class c extends GeneratedMessageLite implements d {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[MethodToInvoke.values().length];
            a.a = arr_v;
            try {
                arr_v[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static final class b extends Builder implements d {
        private b() {
            super(c.DEFAULT_INSTANCE);
        }

        b(a c$a0) {
        }

        @Override  // com.google.longrunning.d
        public String getName() {
            return ((c)this.instance).getName();
        }

        @Override  // com.google.longrunning.d
        public ByteString getNameBytes() {
            return ((c)this.instance).getNameBytes();
        }

        public b ub() {
            this.copyOnWrite();
            ((c)this.instance).clearName();
            return this;
        }

        public b vb(String s) {
            this.copyOnWrite();
            ((c)this.instance).setName(s);
            return this;
        }

        public b wb(ByteString byteString0) {
            this.copyOnWrite();
            ((c)this.instance).setNameBytes(byteString0);
            return this;
        }
    }

    private static final c DEFAULT_INSTANCE = null;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    private String name_;

    static {
        c c0 = new c();
        c.DEFAULT_INSTANCE = c0;
        GeneratedMessageLite.registerDefaultInstance(c.class, c0);
    }

    private c() {
        this.name_ = "";
    }

    public static c A6(ByteString byteString0) throws InvalidProtocolBufferException {
        return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, byteString0);
    }

    public static c A8(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static c B6(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static c F3() {
        return c.DEFAULT_INSTANCE;
    }

    public static c Ja(byte[] arr_b) throws InvalidProtocolBufferException {
        return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, arr_b);
    }

    public static c La(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static b M4() {
        return (b)c.DEFAULT_INSTANCE.createBuilder();
    }

    public static c M6(CodedInputStream codedInputStream0) throws IOException {
        return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static b P4(c c0) {
        return (b)c.DEFAULT_INSTANCE.createBuilder(c0);
    }

    public static c Z7(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static c ca(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    private void clearName() {
        this.name_ = "";
    }

    public static c d6(InputStream inputStream0) throws IOException {
        return (c)GeneratedMessageLite.parseDelimitedFrom(c.DEFAULT_INSTANCE, inputStream0);
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new c();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(c.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"name_"});
            }
            case 4: {
                return c.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = c.PARSER;
                if(parser0 == null) {
                    Class class0 = c.class;
                    synchronized(class0) {
                        parser0 = c.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(c.DEFAULT_INSTANCE);
                            c.PARSER = parser0;
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

    @Override  // com.google.longrunning.d
    public String getName() {
        return this.name_;
    }

    @Override  // com.google.longrunning.d
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public static c j9(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static Parser parser() {
        return c.DEFAULT_INSTANCE.getParserForType();
    }

    private void setName(String s) {
        s.getClass();
        this.name_ = s;
    }

    private void setNameBytes(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.name_ = byteString0.toStringUtf8();
    }

    public static c v8(InputStream inputStream0) throws IOException {
        return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, inputStream0);
    }

    public static c z6(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (c)GeneratedMessageLite.parseDelimitedFrom(c.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }
}

