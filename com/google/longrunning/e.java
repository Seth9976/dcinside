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

public final class e extends GeneratedMessageLite implements f {
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

    public static final class b extends Builder implements f {
        private b() {
            super(e.DEFAULT_INSTANCE);
        }

        b(a e$a0) {
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.longrunning.f
        public String getName() {
            return "";
        }

        @Override  // com.google.longrunning.f
        public ByteString getNameBytes() {
            return ((e)this.instance).getNameBytes();
        }

        public b ub() {
            this.copyOnWrite();
            ((e)this.instance).clearName();
            return this;
        }

        public b vb(String s) {
            this.copyOnWrite();
            ((e)this.instance).setName(s);
            return this;
        }

        public b wb(ByteString byteString0) {
            this.copyOnWrite();
            ((e)this.instance).setNameBytes(byteString0);
            return this;
        }
    }

    private static final e DEFAULT_INSTANCE = null;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    private String name_;

    static {
        e e0 = new e();
        e.DEFAULT_INSTANCE = e0;
        GeneratedMessageLite.registerDefaultInstance(e.class, e0);
    }

    private e() {
        this.name_ = "";
    }

    public static e A6(ByteString byteString0) throws InvalidProtocolBufferException {
        return (e)GeneratedMessageLite.parseFrom(e.DEFAULT_INSTANCE, byteString0);
    }

    public static e A8(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (e)GeneratedMessageLite.parseFrom(e.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static e B6(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (e)GeneratedMessageLite.parseFrom(e.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static e F3() {
        return e.DEFAULT_INSTANCE;
    }

    public static e Ja(byte[] arr_b) throws InvalidProtocolBufferException {
        return (e)GeneratedMessageLite.parseFrom(e.DEFAULT_INSTANCE, arr_b);
    }

    public static e La(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (e)GeneratedMessageLite.parseFrom(e.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static b M4() {
        return (b)e.DEFAULT_INSTANCE.createBuilder();
    }

    public static e M6(CodedInputStream codedInputStream0) throws IOException {
        return (e)GeneratedMessageLite.parseFrom(e.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static b P4(e e0) {
        return (b)e.DEFAULT_INSTANCE.createBuilder(e0);
    }

    public static e Z7(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (e)GeneratedMessageLite.parseFrom(e.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static e ca(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (e)GeneratedMessageLite.parseFrom(e.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    private void clearName() {
        this.name_ = "";
    }

    public static e d6(InputStream inputStream0) throws IOException {
        return (e)GeneratedMessageLite.parseDelimitedFrom(e.DEFAULT_INSTANCE, inputStream0);
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new e();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(e.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"name_"});
            }
            case 4: {
                return e.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = e.PARSER;
                if(parser0 == null) {
                    Class class0 = e.class;
                    synchronized(class0) {
                        parser0 = e.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(e.DEFAULT_INSTANCE);
                            e.PARSER = parser0;
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

    @Override  // com.google.longrunning.f
    public String getName() [...] // 潜在的解密器

    @Override  // com.google.longrunning.f
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public static e j9(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (e)GeneratedMessageLite.parseFrom(e.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static Parser parser() {
        return e.DEFAULT_INSTANCE.getParserForType();
    }

    private void setName(String s) {
        s.getClass();
        this.name_ = s;
    }

    private void setNameBytes(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.name_ = byteString0.toStringUtf8();
    }

    public static e v8(InputStream inputStream0) throws IOException {
        return (e)GeneratedMessageLite.parseFrom(e.DEFAULT_INSTANCE, inputStream0);
    }

    public static e z6(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (e)GeneratedMessageLite.parseDelimitedFrom(e.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }
}

