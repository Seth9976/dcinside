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

        @Override  // com.google.firebase.perf.v1.d
        public boolean Za() {
            return ((c)this.instance).Za();
        }

        @Override  // com.google.firebase.perf.v1.d
        public int d9() {
            return ((c)this.instance).d9();
        }

        @Override  // com.google.firebase.perf.v1.d
        public long u0() {
            return ((c)this.instance).u0();
        }

        public b ub() {
            this.copyOnWrite();
            ((c)this.instance).M4();
            return this;
        }

        public b vb() {
            this.copyOnWrite();
            ((c)this.instance).P4();
            return this;
        }

        @Override  // com.google.firebase.perf.v1.d
        public boolean w0() {
            return ((c)this.instance).w0();
        }

        public b wb(long v) {
            this.copyOnWrite();
            ((c)this.instance).xb(v);
            return this;
        }

        public b xb(int v) {
            this.copyOnWrite();
            ((c)this.instance).yb(v);
            return this;
        }
    }

    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final c DEFAULT_INSTANCE = null;
    private static volatile Parser PARSER = null;
    public static final int USED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private int usedAppJavaHeapMemoryKb_;

    static {
        c c0 = new c();
        c.DEFAULT_INSTANCE = c0;
        GeneratedMessageLite.registerDefaultInstance(c.class, c0);
    }

    public static b A6(c c0) {
        return (b)c.DEFAULT_INSTANCE.createBuilder(c0);
    }

    public static c A8(CodedInputStream codedInputStream0) throws IOException {
        return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static c B6(InputStream inputStream0) throws IOException {
        return (c)GeneratedMessageLite.parseDelimitedFrom(c.DEFAULT_INSTANCE, inputStream0);
    }

    public static c Ja(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static c La(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, byteBuffer0);
    }

    private void M4() {
        this.bitField0_ &= -2;
        this.clientTimeUs_ = 0L;
    }

    public static c M6(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (c)GeneratedMessageLite.parseDelimitedFrom(c.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    private void P4() {
        this.bitField0_ &= -3;
        this.usedAppJavaHeapMemoryKb_ = 0;
    }

    public static c Z7(ByteString byteString0) throws InvalidProtocolBufferException {
        return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, byteString0);
    }

    @Override  // com.google.firebase.perf.v1.d
    public boolean Za() {
        return (this.bitField0_ & 2) != 0;
    }

    public static c ca(InputStream inputStream0) throws IOException {
        return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, inputStream0);
    }

    public static c d6() {
        return c.DEFAULT_INSTANCE;
    }

    @Override  // com.google.firebase.perf.v1.d
    public int d9() {
        return this.usedAppJavaHeapMemoryKb_;
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
                return GeneratedMessageLite.newMessageInfo(c.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"bitField0_", "clientTimeUs_", "usedAppJavaHeapMemoryKb_"});
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

    public static c j9(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static Parser parser() {
        return c.DEFAULT_INSTANCE.getParserForType();
    }

    @Override  // com.google.firebase.perf.v1.d
    public long u0() {
        return this.clientTimeUs_;
    }

    public static c ub(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static c v8(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static c vb(byte[] arr_b) throws InvalidProtocolBufferException {
        return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, arr_b);
    }

    @Override  // com.google.firebase.perf.v1.d
    public boolean w0() {
        return (this.bitField0_ & 1) != 0;
    }

    public static c wb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void xb(long v) {
        this.bitField0_ |= 1;
        this.clientTimeUs_ = v;
    }

    private void yb(int v) {
        this.bitField0_ |= 2;
        this.usedAppJavaHeapMemoryKb_ = v;
    }

    public static b z6() {
        return (b)c.DEFAULT_INSTANCE.createBuilder();
    }
}

