package com.google.geo.type;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite.Builder;
import com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.google.type.t;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class a extends GeneratedMessageLite implements b {
    static class com.google.geo.type.a.a {
        static final int[] a;

        static {
            int[] arr_v = new int[MethodToInvoke.values().length];
            com.google.geo.type.a.a.a = arr_v;
            try {
                arr_v[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.geo.type.a.a.a[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.geo.type.a.a.a[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.geo.type.a.a.a[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.geo.type.a.a.a[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.geo.type.a.a.a[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.geo.type.a.a.a[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static final class com.google.geo.type.a.b extends Builder implements b {
        private com.google.geo.type.a.b() {
            super(a.DEFAULT_INSTANCE);
        }

        com.google.geo.type.a.b(com.google.geo.type.a.a a$a0) {
        }

        public com.google.geo.type.a.b Ab(com.google.type.t.b t$b0) {
            this.copyOnWrite();
            ((a)this.instance).Cb(((t)t$b0.build()));
            return this;
        }

        public com.google.geo.type.a.b Bb(t t0) {
            this.copyOnWrite();
            ((a)this.instance).Cb(t0);
            return this;
        }

        @Override  // com.google.geo.type.b
        public t L1() {
            return ((a)this.instance).L1();
        }

        @Override  // com.google.geo.type.b
        public boolean O6() {
            return ((a)this.instance).O6();
        }

        @Override  // com.google.geo.type.b
        public t Q4() {
            return ((a)this.instance).Q4();
        }

        @Override  // com.google.geo.type.b
        public boolean u1() {
            return ((a)this.instance).u1();
        }

        public com.google.geo.type.a.b ub() {
            this.copyOnWrite();
            ((a)this.instance).d6();
            return this;
        }

        public com.google.geo.type.a.b vb() {
            this.copyOnWrite();
            ((a)this.instance).z6();
            return this;
        }

        public com.google.geo.type.a.b wb(t t0) {
            this.copyOnWrite();
            ((a)this.instance).B6(t0);
            return this;
        }

        public com.google.geo.type.a.b xb(t t0) {
            this.copyOnWrite();
            ((a)this.instance).M6(t0);
            return this;
        }

        public com.google.geo.type.a.b yb(com.google.type.t.b t$b0) {
            this.copyOnWrite();
            ((a)this.instance).Bb(((t)t$b0.build()));
            return this;
        }

        public com.google.geo.type.a.b zb(t t0) {
            this.copyOnWrite();
            ((a)this.instance).Bb(t0);
            return this;
        }
    }

    private static final a DEFAULT_INSTANCE = null;
    public static final int HIGH_FIELD_NUMBER = 2;
    public static final int LOW_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    private t high_;
    private t low_;

    static {
        a a0 = new a();
        a.DEFAULT_INSTANCE = a0;
        GeneratedMessageLite.registerDefaultInstance(a.class, a0);
    }

    public static a A6() {
        return a.DEFAULT_INSTANCE;
    }

    public static a A8(InputStream inputStream0) throws IOException {
        return (a)GeneratedMessageLite.parseDelimitedFrom(a.DEFAULT_INSTANCE, inputStream0);
    }

    public static a Ab(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void B6(t t0) {
        t0.getClass();
        if(this.high_ != null && this.high_ != t.d6()) {
            this.high_ = (t)((com.google.type.t.b)t.A6(this.high_).mergeFrom(t0)).buildPartial();
            return;
        }
        this.high_ = t0;
    }

    private void Bb(t t0) {
        t0.getClass();
        this.high_ = t0;
    }

    private void Cb(t t0) {
        t0.getClass();
        this.low_ = t0;
    }

    public static a Ja(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    @Override  // com.google.geo.type.b
    public t L1() {
        return this.high_ == null ? t.d6() : this.high_;
    }

    public static a La(CodedInputStream codedInputStream0) throws IOException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, codedInputStream0);
    }

    private void M6(t t0) {
        t0.getClass();
        if(this.low_ != null && this.low_ != t.d6()) {
            this.low_ = (t)((com.google.type.t.b)t.A6(this.low_).mergeFrom(t0)).buildPartial();
            return;
        }
        this.low_ = t0;
    }

    @Override  // com.google.geo.type.b
    public boolean O6() {
        return this.high_ != null;
    }

    @Override  // com.google.geo.type.b
    public t Q4() {
        return this.low_ == null ? t.d6() : this.low_;
    }

    public static com.google.geo.type.a.b Z7() {
        return (com.google.geo.type.a.b)a.DEFAULT_INSTANCE.createBuilder();
    }

    public static a ca(ByteString byteString0) throws InvalidProtocolBufferException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, byteString0);
    }

    private void d6() {
        this.high_ = null;
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new a();
            }
            case 2: {
                return new com.google.geo.type.a.b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(a.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"low_", "high_"});
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

    public static a j9(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (a)GeneratedMessageLite.parseDelimitedFrom(a.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Parser parser() {
        return a.DEFAULT_INSTANCE.getParserForType();
    }

    @Override  // com.google.geo.type.b
    public boolean u1() {
        return this.low_ != null;
    }

    public static a ub(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static com.google.geo.type.a.b v8(a a0) {
        return (com.google.geo.type.a.b)a.DEFAULT_INSTANCE.createBuilder(a0);
    }

    public static a vb(InputStream inputStream0) throws IOException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, inputStream0);
    }

    public static a wb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static a xb(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static a yb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    private void z6() {
        this.low_ = null;
    }

    public static a zb(byte[] arr_b) throws InvalidProtocolBufferException {
        return (a)GeneratedMessageLite.parseFrom(a.DEFAULT_INSTANCE, arr_b);
    }
}

