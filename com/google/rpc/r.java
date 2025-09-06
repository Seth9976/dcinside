package com.google.rpc;

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

public final class r extends GeneratedMessageLite implements s {
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

    public static final class b extends Builder implements s {
        private b() {
            super(r.DEFAULT_INSTANCE);
        }

        b(a r$a0) {
        }

        @Override  // com.google.rpc.s
        public ByteString Ka() {
            return ((r)this.instance).Ka();
        }

        @Override  // com.google.rpc.s
        public String j3() {
            return ((r)this.instance).j3();
        }

        @Override  // com.google.rpc.s
        public ByteString k6() {
            return ((r)this.instance).k6();
        }

        @Override  // com.google.rpc.s
        public String m2() {
            return ((r)this.instance).m2();
        }

        public b ub() {
            this.copyOnWrite();
            ((r)this.instance).d6();
            return this;
        }

        public b vb() {
            this.copyOnWrite();
            ((r)this.instance).z6();
            return this;
        }

        public b wb(String s) {
            this.copyOnWrite();
            ((r)this.instance).zb(s);
            return this;
        }

        public b xb(ByteString byteString0) {
            this.copyOnWrite();
            ((r)this.instance).Ab(byteString0);
            return this;
        }

        public b yb(String s) {
            this.copyOnWrite();
            ((r)this.instance).Bb(s);
            return this;
        }

        public b zb(ByteString byteString0) {
            this.copyOnWrite();
            ((r)this.instance).Cb(byteString0);
            return this;
        }
    }

    private static final r DEFAULT_INSTANCE = null;
    private static volatile Parser PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 1;
    public static final int SERVING_DATA_FIELD_NUMBER = 2;
    private String requestId_;
    private String servingData_;

    static {
        r r0 = new r();
        r.DEFAULT_INSTANCE = r0;
        GeneratedMessageLite.registerDefaultInstance(r.class, r0);
    }

    private r() {
        this.requestId_ = "";
        this.servingData_ = "";
    }

    public static r A6() {
        return r.DEFAULT_INSTANCE;
    }

    public static r A8(ByteString byteString0) throws InvalidProtocolBufferException {
        return (r)GeneratedMessageLite.parseFrom(r.DEFAULT_INSTANCE, byteString0);
    }

    private void Ab(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.requestId_ = byteString0.toStringUtf8();
    }

    public static b B6() {
        return (b)r.DEFAULT_INSTANCE.createBuilder();
    }

    private void Bb(String s) {
        s.getClass();
        this.servingData_ = s;
    }

    private void Cb(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.servingData_ = byteString0.toStringUtf8();
    }

    public static r Ja(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (r)GeneratedMessageLite.parseFrom(r.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    @Override  // com.google.rpc.s
    public ByteString Ka() {
        return ByteString.copyFromUtf8(this.requestId_);
    }

    public static r La(InputStream inputStream0) throws IOException {
        return (r)GeneratedMessageLite.parseFrom(r.DEFAULT_INSTANCE, inputStream0);
    }

    public static b M6(r r0) {
        return (b)r.DEFAULT_INSTANCE.createBuilder(r0);
    }

    public static r Z7(InputStream inputStream0) throws IOException {
        return (r)GeneratedMessageLite.parseDelimitedFrom(r.DEFAULT_INSTANCE, inputStream0);
    }

    public static r ca(CodedInputStream codedInputStream0) throws IOException {
        return (r)GeneratedMessageLite.parseFrom(r.DEFAULT_INSTANCE, codedInputStream0);
    }

    private void d6() {
        this.requestId_ = "";
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new r();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(r.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"requestId_", "servingData_"});
            }
            case 4: {
                return r.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = r.PARSER;
                if(parser0 == null) {
                    Class class0 = r.class;
                    synchronized(class0) {
                        parser0 = r.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(r.DEFAULT_INSTANCE);
                            r.PARSER = parser0;
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

    @Override  // com.google.rpc.s
    public String j3() {
        return this.servingData_;
    }

    public static r j9(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (r)GeneratedMessageLite.parseFrom(r.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    @Override  // com.google.rpc.s
    public ByteString k6() {
        return ByteString.copyFromUtf8(this.servingData_);
    }

    @Override  // com.google.rpc.s
    public String m2() {
        return this.requestId_;
    }

    public static Parser parser() {
        return r.DEFAULT_INSTANCE.getParserForType();
    }

    public static r ub(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (r)GeneratedMessageLite.parseFrom(r.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static r v8(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (r)GeneratedMessageLite.parseDelimitedFrom(r.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static r vb(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (r)GeneratedMessageLite.parseFrom(r.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static r wb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (r)GeneratedMessageLite.parseFrom(r.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static r xb(byte[] arr_b) throws InvalidProtocolBufferException {
        return (r)GeneratedMessageLite.parseFrom(r.DEFAULT_INSTANCE, arr_b);
    }

    public static r yb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (r)GeneratedMessageLite.parseFrom(r.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void z6() {
        this.servingData_ = "";
    }

    private void zb(String s) {
        s.getClass();
        this.requestId_ = s;
    }
}

