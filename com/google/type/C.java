package com.google.type;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.FloatValue;
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

        public b Ab(FloatValue floatValue0) {
            this.copyOnWrite();
            ((c)this.instance).Fb(floatValue0);
            return this;
        }

        public b Bb(float f) {
            this.copyOnWrite();
            ((c)this.instance).Gb(f);
            return this;
        }

        public b Cb(float f) {
            this.copyOnWrite();
            ((c)this.instance).Hb(f);
            return this;
        }

        public b Db(float f) {
            this.copyOnWrite();
            ((c)this.instance).Ib(f);
            return this;
        }

        @Override  // com.google.type.d
        public float H3() {
            return ((c)this.instance).H3();
        }

        @Override  // com.google.type.d
        public float H9() {
            return ((c)this.instance).H9();
        }

        @Override  // com.google.type.d
        public float cb() {
            return ((c)this.instance).cb();
        }

        @Override  // com.google.type.d
        public FloatValue i() {
            return ((c)this.instance).i();
        }

        @Override  // com.google.type.d
        public boolean p3() {
            return ((c)this.instance).p3();
        }

        public b ub() {
            this.copyOnWrite();
            ((c)this.instance).B6();
            return this;
        }

        public b vb() {
            this.copyOnWrite();
            ((c)this.instance).M6();
            return this;
        }

        public b wb() {
            this.copyOnWrite();
            ((c)this.instance).Z7();
            return this;
        }

        public b xb() {
            this.copyOnWrite();
            ((c)this.instance).v8();
            return this;
        }

        public b yb(FloatValue floatValue0) {
            this.copyOnWrite();
            ((c)this.instance).j9(floatValue0);
            return this;
        }

        public b zb(com.google.protobuf.FloatValue.Builder floatValue$Builder0) {
            this.copyOnWrite();
            ((c)this.instance).Fb(((FloatValue)floatValue$Builder0.build()));
            return this;
        }
    }

    public static final int ALPHA_FIELD_NUMBER = 4;
    public static final int BLUE_FIELD_NUMBER = 3;
    private static final c DEFAULT_INSTANCE = null;
    public static final int GREEN_FIELD_NUMBER = 2;
    private static volatile Parser PARSER = null;
    public static final int RED_FIELD_NUMBER = 1;
    private FloatValue alpha_;
    private float blue_;
    private float green_;
    private float red_;

    static {
        c c0 = new c();
        c.DEFAULT_INSTANCE = c0;
        GeneratedMessageLite.registerDefaultInstance(c.class, c0);
    }

    public static c A8() {
        return c.DEFAULT_INSTANCE;
    }

    public static c Ab(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    private void B6() {
        this.alpha_ = null;
    }

    public static c Bb(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static c Cb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static c Db(byte[] arr_b) throws InvalidProtocolBufferException {
        return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, arr_b);
    }

    public static c Eb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void Fb(FloatValue floatValue0) {
        floatValue0.getClass();
        this.alpha_ = floatValue0;
    }

    private void Gb(float f) {
        this.blue_ = f;
    }

    @Override  // com.google.type.d
    public float H3() {
        return this.blue_;
    }

    @Override  // com.google.type.d
    public float H9() {
        return this.green_;
    }

    private void Hb(float f) {
        this.green_ = f;
    }

    private void Ib(float f) {
        this.red_ = f;
    }

    public static b Ja(c c0) {
        return (b)c.DEFAULT_INSTANCE.createBuilder(c0);
    }

    public static c La(InputStream inputStream0) throws IOException {
        return (c)GeneratedMessageLite.parseDelimitedFrom(c.DEFAULT_INSTANCE, inputStream0);
    }

    private void M6() {
        this.blue_ = 0.0f;
    }

    private void Z7() {
        this.green_ = 0.0f;
    }

    public static b ca() {
        return (b)c.DEFAULT_INSTANCE.createBuilder();
    }

    @Override  // com.google.type.d
    public float cb() {
        return this.red_;
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
                return GeneratedMessageLite.newMessageInfo(c.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0001\u0002\u0001\u0003\u0001\u0004\t", new Object[]{"red_", "green_", "blue_", "alpha_"});
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

    @Override  // com.google.type.d
    public FloatValue i() {
        return this.alpha_ == null ? FloatValue.getDefaultInstance() : this.alpha_;
    }

    private void j9(FloatValue floatValue0) {
        floatValue0.getClass();
        if(this.alpha_ != null && this.alpha_ != FloatValue.getDefaultInstance()) {
            this.alpha_ = (FloatValue)((com.google.protobuf.FloatValue.Builder)FloatValue.newBuilder(this.alpha_).mergeFrom(floatValue0)).buildPartial();
            return;
        }
        this.alpha_ = floatValue0;
    }

    @Override  // com.google.type.d
    public boolean p3() {
        return this.alpha_ != null;
    }

    public static Parser parser() {
        return c.DEFAULT_INSTANCE.getParserForType();
    }

    public static c ub(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (c)GeneratedMessageLite.parseDelimitedFrom(c.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    private void v8() {
        this.red_ = 0.0f;
    }

    public static c vb(ByteString byteString0) throws InvalidProtocolBufferException {
        return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, byteString0);
    }

    public static c wb(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static c xb(CodedInputStream codedInputStream0) throws IOException {
        return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static c yb(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static c zb(InputStream inputStream0) throws IOException {
        return (c)GeneratedMessageLite.parseFrom(c.DEFAULT_INSTANCE, inputStream0);
    }
}

