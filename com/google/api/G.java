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

public final class g extends GeneratedMessageLite implements h {
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

    public static final class b extends Builder implements h {
        private b() {
            super(g.DEFAULT_INSTANCE);
        }

        b(a g$a0) {
        }

        @Override  // com.google.api.h
        public ByteString E0() {
            return ((g)this.instance).E0();
        }

        @Override  // com.google.api.h
        public ByteString P8() {
            return ((g)this.instance).P8();
        }

        @Override  // com.google.api.h
        public String V9() {
            return ((g)this.instance).V9();
        }

        @Override  // com.google.api.h
        public String a1() {
            return ((g)this.instance).a1();
        }

        public b ub() {
            this.copyOnWrite();
            ((g)this.instance).d6();
            return this;
        }

        public b vb() {
            this.copyOnWrite();
            ((g)this.instance).z6();
            return this;
        }

        public b wb(String s) {
            this.copyOnWrite();
            ((g)this.instance).zb(s);
            return this;
        }

        public b xb(ByteString byteString0) {
            this.copyOnWrite();
            ((g)this.instance).Ab(byteString0);
            return this;
        }

        public b yb(String s) {
            this.copyOnWrite();
            ((g)this.instance).Bb(s);
            return this;
        }

        public b zb(ByteString byteString0) {
            this.copyOnWrite();
            ((g)this.instance).Cb(byteString0);
            return this;
        }
    }

    public static final int AUDIENCES_FIELD_NUMBER = 2;
    private static final g DEFAULT_INSTANCE = null;
    private static volatile Parser PARSER = null;
    public static final int PROVIDER_ID_FIELD_NUMBER = 1;
    private String audiences_;
    private String providerId_;

    static {
        g g0 = new g();
        g.DEFAULT_INSTANCE = g0;
        GeneratedMessageLite.registerDefaultInstance(g.class, g0);
    }

    private g() {
        this.providerId_ = "";
        this.audiences_ = "";
    }

    public static g A6() {
        return g.DEFAULT_INSTANCE;
    }

    public static g A8(ByteString byteString0) throws InvalidProtocolBufferException {
        return (g)GeneratedMessageLite.parseFrom(g.DEFAULT_INSTANCE, byteString0);
    }

    private void Ab(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.audiences_ = byteString0.toStringUtf8();
    }

    public static b B6() {
        return (b)g.DEFAULT_INSTANCE.createBuilder();
    }

    private void Bb(String s) {
        s.getClass();
        this.providerId_ = s;
    }

    private void Cb(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.providerId_ = byteString0.toStringUtf8();
    }

    @Override  // com.google.api.h
    public ByteString E0() {
        return ByteString.copyFromUtf8(this.audiences_);
    }

    public static g Ja(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (g)GeneratedMessageLite.parseFrom(g.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static g La(InputStream inputStream0) throws IOException {
        return (g)GeneratedMessageLite.parseFrom(g.DEFAULT_INSTANCE, inputStream0);
    }

    public static b M6(g g0) {
        return (b)g.DEFAULT_INSTANCE.createBuilder(g0);
    }

    @Override  // com.google.api.h
    public ByteString P8() {
        return ByteString.copyFromUtf8(this.providerId_);
    }

    @Override  // com.google.api.h
    public String V9() {
        return this.providerId_;
    }

    public static g Z7(InputStream inputStream0) throws IOException {
        return (g)GeneratedMessageLite.parseDelimitedFrom(g.DEFAULT_INSTANCE, inputStream0);
    }

    @Override  // com.google.api.h
    public String a1() {
        return this.audiences_;
    }

    public static g ca(CodedInputStream codedInputStream0) throws IOException {
        return (g)GeneratedMessageLite.parseFrom(g.DEFAULT_INSTANCE, codedInputStream0);
    }

    private void d6() {
        this.audiences_ = "";
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new g();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(g.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"providerId_", "audiences_"});
            }
            case 4: {
                return g.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = g.PARSER;
                if(parser0 == null) {
                    Class class0 = g.class;
                    synchronized(class0) {
                        parser0 = g.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(g.DEFAULT_INSTANCE);
                            g.PARSER = parser0;
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

    public static g j9(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (g)GeneratedMessageLite.parseFrom(g.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static Parser parser() {
        return g.DEFAULT_INSTANCE.getParserForType();
    }

    public static g ub(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (g)GeneratedMessageLite.parseFrom(g.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static g v8(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (g)GeneratedMessageLite.parseDelimitedFrom(g.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static g vb(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (g)GeneratedMessageLite.parseFrom(g.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static g wb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (g)GeneratedMessageLite.parseFrom(g.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static g xb(byte[] arr_b) throws InvalidProtocolBufferException {
        return (g)GeneratedMessageLite.parseFrom(g.DEFAULT_INSTANCE, arr_b);
    }

    public static g yb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (g)GeneratedMessageLite.parseFrom(g.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void z6() {
        this.providerId_ = "";
    }

    private void zb(String s) {
        s.getClass();
        this.audiences_ = s;
    }
}

