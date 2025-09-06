package com.google.firebase.perf.v1;

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

        @Override  // com.google.firebase.perf.v1.i
        public long F8() {
            return ((h)this.instance).F8();
        }

        @Override  // com.google.firebase.perf.v1.i
        public boolean Oa() {
            return ((h)this.instance).Oa();
        }

        @Override  // com.google.firebase.perf.v1.i
        public long k5() {
            return ((h)this.instance).k5();
        }

        @Override  // com.google.firebase.perf.v1.i
        public boolean s4() {
            return ((h)this.instance).s4();
        }

        @Override  // com.google.firebase.perf.v1.i
        public long u0() {
            return ((h)this.instance).u0();
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

        @Override  // com.google.firebase.perf.v1.i
        public boolean w0() {
            return ((h)this.instance).w0();
        }

        public b wb() {
            this.copyOnWrite();
            ((h)this.instance).A6();
            return this;
        }

        public b xb(long v) {
            this.copyOnWrite();
            ((h)this.instance).Ab(v);
            return this;
        }

        public b yb(long v) {
            this.copyOnWrite();
            ((h)this.instance).Bb(v);
            return this;
        }

        public b zb(long v) {
            this.copyOnWrite();
            ((h)this.instance).Cb(v);
            return this;
        }
    }

    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final h DEFAULT_INSTANCE = null;
    private static volatile Parser PARSER = null;
    public static final int SYSTEM_TIME_US_FIELD_NUMBER = 3;
    public static final int USER_TIME_US_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private long systemTimeUs_;
    private long userTimeUs_;

    static {
        h h0 = new h();
        h.DEFAULT_INSTANCE = h0;
        GeneratedMessageLite.registerDefaultInstance(h.class, h0);
    }

    private void A6() {
        this.bitField0_ &= -3;
        this.userTimeUs_ = 0L;
    }

    public static h A8(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (h)GeneratedMessageLite.parseDelimitedFrom(h.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    private void Ab(long v) {
        this.bitField0_ |= 1;
        this.clientTimeUs_ = v;
    }

    public static h B6() {
        return h.DEFAULT_INSTANCE;
    }

    private void Bb(long v) {
        this.bitField0_ |= 4;
        this.systemTimeUs_ = v;
    }

    private void Cb(long v) {
        this.bitField0_ |= 2;
        this.userTimeUs_ = v;
    }

    @Override  // com.google.firebase.perf.v1.i
    public long F8() {
        return this.userTimeUs_;
    }

    public static h Ja(CodedInputStream codedInputStream0) throws IOException {
        return (h)GeneratedMessageLite.parseFrom(h.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static h La(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (h)GeneratedMessageLite.parseFrom(h.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static b M6() {
        return (b)h.DEFAULT_INSTANCE.createBuilder();
    }

    @Override  // com.google.firebase.perf.v1.i
    public boolean Oa() {
        return (this.bitField0_ & 2) != 0;
    }

    public static b Z7(h h0) {
        return (b)h.DEFAULT_INSTANCE.createBuilder(h0);
    }

    public static h ca(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (h)GeneratedMessageLite.parseFrom(h.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    private void d6() {
        this.bitField0_ &= -2;
        this.clientTimeUs_ = 0L;
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
                return GeneratedMessageLite.newMessageInfo(h.DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "clientTimeUs_", "userTimeUs_", "systemTimeUs_"});
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

    public static h j9(ByteString byteString0) throws InvalidProtocolBufferException {
        return (h)GeneratedMessageLite.parseFrom(h.DEFAULT_INSTANCE, byteString0);
    }

    @Override  // com.google.firebase.perf.v1.i
    public long k5() {
        return this.systemTimeUs_;
    }

    public static Parser parser() {
        return h.DEFAULT_INSTANCE.getParserForType();
    }

    @Override  // com.google.firebase.perf.v1.i
    public boolean s4() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override  // com.google.firebase.perf.v1.i
    public long u0() {
        return this.clientTimeUs_;
    }

    public static h ub(InputStream inputStream0) throws IOException {
        return (h)GeneratedMessageLite.parseFrom(h.DEFAULT_INSTANCE, inputStream0);
    }

    public static h v8(InputStream inputStream0) throws IOException {
        return (h)GeneratedMessageLite.parseDelimitedFrom(h.DEFAULT_INSTANCE, inputStream0);
    }

    public static h vb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (h)GeneratedMessageLite.parseFrom(h.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    @Override  // com.google.firebase.perf.v1.i
    public boolean w0() {
        return (this.bitField0_ & 1) != 0;
    }

    public static h wb(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (h)GeneratedMessageLite.parseFrom(h.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static h xb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (h)GeneratedMessageLite.parseFrom(h.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static h yb(byte[] arr_b) throws InvalidProtocolBufferException {
        return (h)GeneratedMessageLite.parseFrom(h.DEFAULT_INSTANCE, arr_b);
    }

    private void z6() {
        this.bitField0_ &= -5;
        this.systemTimeUs_ = 0L;
    }

    public static h zb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (h)GeneratedMessageLite.parseFrom(h.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }
}

