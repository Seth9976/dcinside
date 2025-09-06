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

public final class a1 extends GeneratedMessageLite implements b1 {
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

    public static final class b extends Builder implements b1 {
        private b() {
            super(a1.DEFAULT_INSTANCE);
        }

        b(a a1$a0) {
        }

        @Override  // com.google.api.b1
        public ByteString C4() {
            return ((a1)this.instance).C4();
        }

        @Override  // com.google.api.b1
        public String getType() {
            return ((a1)this.instance).getType();
        }

        @Override  // com.google.api.b1
        public ByteString getTypeBytes() {
            return ((a1)this.instance).getTypeBytes();
        }

        @Override  // com.google.api.b1
        public String q9() {
            return ((a1)this.instance).q9();
        }

        public b ub() {
            this.copyOnWrite();
            ((a1)this.instance).d6();
            return this;
        }

        public b vb() {
            this.copyOnWrite();
            ((a1)this.instance).clearType();
            return this;
        }

        public b wb(String s) {
            this.copyOnWrite();
            ((a1)this.instance).yb(s);
            return this;
        }

        public b xb(ByteString byteString0) {
            this.copyOnWrite();
            ((a1)this.instance).zb(byteString0);
            return this;
        }

        public b yb(String s) {
            this.copyOnWrite();
            ((a1)this.instance).setType(s);
            return this;
        }

        public b zb(ByteString byteString0) {
            this.copyOnWrite();
            ((a1)this.instance).setTypeBytes(byteString0);
            return this;
        }
    }

    public static final int CHILD_TYPE_FIELD_NUMBER = 2;
    private static final a1 DEFAULT_INSTANCE = null;
    private static volatile Parser PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private String childType_;
    private String type_;

    static {
        a1 a10 = new a1();
        a1.DEFAULT_INSTANCE = a10;
        GeneratedMessageLite.registerDefaultInstance(a1.class, a10);
    }

    private a1() {
        this.type_ = "";
        this.childType_ = "";
    }

    public static b A6() {
        return (b)a1.DEFAULT_INSTANCE.createBuilder();
    }

    public static a1 A8(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (a1)GeneratedMessageLite.parseFrom(a1.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static b B6(a1 a10) {
        return (b)a1.DEFAULT_INSTANCE.createBuilder(a10);
    }

    @Override  // com.google.api.b1
    public ByteString C4() {
        return ByteString.copyFromUtf8(this.childType_);
    }

    public static a1 Ja(InputStream inputStream0) throws IOException {
        return (a1)GeneratedMessageLite.parseFrom(a1.DEFAULT_INSTANCE, inputStream0);
    }

    public static a1 La(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (a1)GeneratedMessageLite.parseFrom(a1.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static a1 M6(InputStream inputStream0) throws IOException {
        return (a1)GeneratedMessageLite.parseDelimitedFrom(a1.DEFAULT_INSTANCE, inputStream0);
    }

    public static a1 Z7(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (a1)GeneratedMessageLite.parseDelimitedFrom(a1.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static a1 ca(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (a1)GeneratedMessageLite.parseFrom(a1.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    private void clearType() {
        this.type_ = a1.z6().getType();
    }

    private void d6() {
        this.childType_ = "";
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new a1();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(a1.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"type_", "childType_"});
            }
            case 4: {
                return a1.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = a1.PARSER;
                if(parser0 == null) {
                    Class class0 = a1.class;
                    synchronized(class0) {
                        parser0 = a1.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(a1.DEFAULT_INSTANCE);
                            a1.PARSER = parser0;
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

    @Override  // com.google.api.b1
    public String getType() {
        return this.type_;
    }

    @Override  // com.google.api.b1
    public ByteString getTypeBytes() {
        return ByteString.copyFromUtf8(this.type_);
    }

    public static a1 j9(CodedInputStream codedInputStream0) throws IOException {
        return (a1)GeneratedMessageLite.parseFrom(a1.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static Parser parser() {
        return a1.DEFAULT_INSTANCE.getParserForType();
    }

    @Override  // com.google.api.b1
    public String q9() {
        return this.childType_;
    }

    private void setType(String s) {
        s.getClass();
        this.type_ = s;
    }

    private void setTypeBytes(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.type_ = byteString0.toStringUtf8();
    }

    public static a1 ub(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (a1)GeneratedMessageLite.parseFrom(a1.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static a1 v8(ByteString byteString0) throws InvalidProtocolBufferException {
        return (a1)GeneratedMessageLite.parseFrom(a1.DEFAULT_INSTANCE, byteString0);
    }

    public static a1 vb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (a1)GeneratedMessageLite.parseFrom(a1.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static a1 wb(byte[] arr_b) throws InvalidProtocolBufferException {
        return (a1)GeneratedMessageLite.parseFrom(a1.DEFAULT_INSTANCE, arr_b);
    }

    public static a1 xb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (a1)GeneratedMessageLite.parseFrom(a1.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void yb(String s) {
        s.getClass();
        this.childType_ = s;
    }

    public static a1 z6() {
        return a1.DEFAULT_INSTANCE;
    }

    private void zb(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.childType_ = byteString0.toStringUtf8();
    }
}

