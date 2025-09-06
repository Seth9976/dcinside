package com.google.cloud.audit;

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

public final class h extends GeneratedMessageLite implements i {
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

    public static final class b extends Builder implements i {
        private b() {
            super(h.DEFAULT_INSTANCE);
        }

        b(a h$a0) {
        }

        @Override  // com.google.cloud.audit.i
        public ByteString D3() {
            return ((h)this.instance).D3();
        }

        @Override  // com.google.cloud.audit.i
        public String E5() {
            return ((h)this.instance).E5();
        }

        @Override  // com.google.cloud.audit.i
        public String E6() {
            return ((h)this.instance).E6();
        }

        @Override  // com.google.cloud.audit.i
        public ByteString N6() {
            return ((h)this.instance).N6();
        }

        public b ub() {
            this.copyOnWrite();
            ((h)this.instance).d6();
            return this;
        }

        public b vb() {
            this.copyOnWrite();
            ((h)this.instance).z6();
            return this;
        }

        public b wb(String s) {
            this.copyOnWrite();
            ((h)this.instance).zb(s);
            return this;
        }

        public b xb(ByteString byteString0) {
            this.copyOnWrite();
            ((h)this.instance).Ab(byteString0);
            return this;
        }

        public b yb(String s) {
            this.copyOnWrite();
            ((h)this.instance).Bb(s);
            return this;
        }

        public b zb(ByteString byteString0) {
            this.copyOnWrite();
            ((h)this.instance).Cb(byteString0);
            return this;
        }
    }

    public static final int CALLER_IP_FIELD_NUMBER = 1;
    public static final int CALLER_SUPPLIED_USER_AGENT_FIELD_NUMBER = 2;
    private static final h DEFAULT_INSTANCE;
    private static volatile Parser PARSER;
    private String callerIp_;
    private String callerSuppliedUserAgent_;

    static {
        h h0 = new h();
        h.DEFAULT_INSTANCE = h0;
        GeneratedMessageLite.registerDefaultInstance(h.class, h0);
    }

    private h() {
        this.callerIp_ = "";
        this.callerSuppliedUserAgent_ = "";
    }

    public static h A6() {
        return h.DEFAULT_INSTANCE;
    }

    public static h A8(ByteString byteString0) throws InvalidProtocolBufferException {
        return (h)GeneratedMessageLite.parseFrom(h.DEFAULT_INSTANCE, byteString0);
    }

    private void Ab(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.callerIp_ = byteString0.toStringUtf8();
    }

    public static b B6() {
        return (b)h.DEFAULT_INSTANCE.createBuilder();
    }

    private void Bb(String s) {
        s.getClass();
        this.callerSuppliedUserAgent_ = s;
    }

    private void Cb(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.callerSuppliedUserAgent_ = byteString0.toStringUtf8();
    }

    @Override  // com.google.cloud.audit.i
    public ByteString D3() {
        return ByteString.copyFromUtf8(this.callerSuppliedUserAgent_);
    }

    @Override  // com.google.cloud.audit.i
    public String E5() {
        return this.callerSuppliedUserAgent_;
    }

    @Override  // com.google.cloud.audit.i
    public String E6() {
        return this.callerIp_;
    }

    public static h Ja(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (h)GeneratedMessageLite.parseFrom(h.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static h La(InputStream inputStream0) throws IOException {
        return (h)GeneratedMessageLite.parseFrom(h.DEFAULT_INSTANCE, inputStream0);
    }

    public static b M6(h h0) {
        return (b)h.DEFAULT_INSTANCE.createBuilder(h0);
    }

    @Override  // com.google.cloud.audit.i
    public ByteString N6() {
        return ByteString.copyFromUtf8(this.callerIp_);
    }

    public static h Z7(InputStream inputStream0) throws IOException {
        return (h)GeneratedMessageLite.parseDelimitedFrom(h.DEFAULT_INSTANCE, inputStream0);
    }

    public static h ca(CodedInputStream codedInputStream0) throws IOException {
        return (h)GeneratedMessageLite.parseFrom(h.DEFAULT_INSTANCE, codedInputStream0);
    }

    private void d6() {
        this.callerIp_ = "";
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new h();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(h.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"callerIp_", "callerSuppliedUserAgent_"});
            }
            case 4: {
                return h.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = h.PARSER;
                if(parser0 == null) {
                    Class class0 = h.class;
                    synchronized(class0) {
                        parser0 = h.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(h.DEFAULT_INSTANCE);
                            h.PARSER = parser0;
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

    public static h j9(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (h)GeneratedMessageLite.parseFrom(h.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static Parser parser() {
        return h.DEFAULT_INSTANCE.getParserForType();
    }

    public static h ub(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (h)GeneratedMessageLite.parseFrom(h.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static h v8(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (h)GeneratedMessageLite.parseDelimitedFrom(h.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static h vb(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (h)GeneratedMessageLite.parseFrom(h.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static h wb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (h)GeneratedMessageLite.parseFrom(h.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static h xb(byte[] arr_b) throws InvalidProtocolBufferException {
        return (h)GeneratedMessageLite.parseFrom(h.DEFAULT_INSTANCE, arr_b);
    }

    public static h yb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (h)GeneratedMessageLite.parseFrom(h.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void z6() {
        this.callerSuppliedUserAgent_ = "";
    }

    private void zb(String s) {
        s.getClass();
        this.callerIp_ = s;
    }
}

