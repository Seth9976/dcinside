package com.google.type;

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

public final class t extends GeneratedMessageLite implements u {
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

    public static final class b extends Builder implements u {
        private b() {
            super(t.DEFAULT_INSTANCE);
        }

        b(a t$a0) {
        }

        @Override  // com.google.type.u
        public double I7() {
            return ((t)this.instance).I7();
        }

        @Override  // com.google.type.u
        public double c9() {
            return ((t)this.instance).c9();
        }

        public b ub() {
            this.copyOnWrite();
            ((t)this.instance).M4();
            return this;
        }

        public b vb() {
            this.copyOnWrite();
            ((t)this.instance).P4();
            return this;
        }

        public b wb(double f) {
            this.copyOnWrite();
            ((t)this.instance).xb(f);
            return this;
        }

        public b xb(double f) {
            this.copyOnWrite();
            ((t)this.instance).yb(f);
            return this;
        }
    }

    private static final t DEFAULT_INSTANCE = null;
    public static final int LATITUDE_FIELD_NUMBER = 1;
    public static final int LONGITUDE_FIELD_NUMBER = 2;
    private static volatile Parser PARSER;
    private double latitude_;
    private double longitude_;

    static {
        t t0 = new t();
        t.DEFAULT_INSTANCE = t0;
        GeneratedMessageLite.registerDefaultInstance(t.class, t0);
    }

    public static b A6(t t0) {
        return (b)t.DEFAULT_INSTANCE.createBuilder(t0);
    }

    public static t A8(CodedInputStream codedInputStream0) throws IOException {
        return (t)GeneratedMessageLite.parseFrom(t.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static t B6(InputStream inputStream0) throws IOException {
        return (t)GeneratedMessageLite.parseDelimitedFrom(t.DEFAULT_INSTANCE, inputStream0);
    }

    @Override  // com.google.type.u
    public double I7() {
        return this.latitude_;
    }

    public static t Ja(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (t)GeneratedMessageLite.parseFrom(t.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static t La(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (t)GeneratedMessageLite.parseFrom(t.DEFAULT_INSTANCE, byteBuffer0);
    }

    private void M4() {
        this.latitude_ = 0.0;
    }

    public static t M6(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (t)GeneratedMessageLite.parseDelimitedFrom(t.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    private void P4() {
        this.longitude_ = 0.0;
    }

    public static t Z7(ByteString byteString0) throws InvalidProtocolBufferException {
        return (t)GeneratedMessageLite.parseFrom(t.DEFAULT_INSTANCE, byteString0);
    }

    @Override  // com.google.type.u
    public double c9() {
        return this.longitude_;
    }

    public static t ca(InputStream inputStream0) throws IOException {
        return (t)GeneratedMessageLite.parseFrom(t.DEFAULT_INSTANCE, inputStream0);
    }

    public static t d6() {
        return t.DEFAULT_INSTANCE;
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new t();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(t.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"latitude_", "longitude_"});
            }
            case 4: {
                return t.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = t.PARSER;
                if(parser0 == null) {
                    Class class0 = t.class;
                    synchronized(class0) {
                        parser0 = t.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(t.DEFAULT_INSTANCE);
                            t.PARSER = parser0;
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

    public static t j9(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (t)GeneratedMessageLite.parseFrom(t.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static Parser parser() {
        return t.DEFAULT_INSTANCE.getParserForType();
    }

    public static t ub(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (t)GeneratedMessageLite.parseFrom(t.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static t v8(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (t)GeneratedMessageLite.parseFrom(t.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static t vb(byte[] arr_b) throws InvalidProtocolBufferException {
        return (t)GeneratedMessageLite.parseFrom(t.DEFAULT_INSTANCE, arr_b);
    }

    public static t wb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (t)GeneratedMessageLite.parseFrom(t.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void xb(double f) {
        this.latitude_ = f;
    }

    private void yb(double f) {
        this.longitude_ = f;
    }

    public static b z6() {
        return (b)t.DEFAULT_INSTANCE.createBuilder();
    }
}

