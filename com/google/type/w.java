package com.google.type;

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

public final class w extends GeneratedMessageLite implements x {
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

    public static final class b extends Builder implements x {
        private b() {
            super(w.DEFAULT_INSTANCE);
        }

        b(a w$a0) {
        }

        public b Ab(long v) {
            this.copyOnWrite();
            ((w)this.instance).Cb(v);
            return this;
        }

        @Override  // com.google.type.x
        public long O9() {
            return ((w)this.instance).O9();
        }

        @Override  // com.google.type.x
        public ByteString R8() {
            return ((w)this.instance).R8();
        }

        @Override  // com.google.type.x
        public int getNanos() {
            return ((w)this.instance).getNanos();
        }

        @Override  // com.google.type.x
        public String r9() {
            return ((w)this.instance).r9();
        }

        public b ub() {
            this.copyOnWrite();
            ((w)this.instance).z6();
            return this;
        }

        public b vb() {
            this.copyOnWrite();
            ((w)this.instance).clearNanos();
            return this;
        }

        public b wb() {
            this.copyOnWrite();
            ((w)this.instance).A6();
            return this;
        }

        public b xb(String s) {
            this.copyOnWrite();
            ((w)this.instance).Ab(s);
            return this;
        }

        public b yb(ByteString byteString0) {
            this.copyOnWrite();
            ((w)this.instance).Bb(byteString0);
            return this;
        }

        public b zb(int v) {
            this.copyOnWrite();
            ((w)this.instance).setNanos(v);
            return this;
        }
    }

    public static final int CURRENCY_CODE_FIELD_NUMBER = 1;
    private static final w DEFAULT_INSTANCE = null;
    public static final int NANOS_FIELD_NUMBER = 3;
    private static volatile Parser PARSER = null;
    public static final int UNITS_FIELD_NUMBER = 2;
    private String currencyCode_;
    private int nanos_;
    private long units_;

    static {
        w w0 = new w();
        w.DEFAULT_INSTANCE = w0;
        GeneratedMessageLite.registerDefaultInstance(w.class, w0);
    }

    private w() {
        this.currencyCode_ = "";
    }

    private void A6() {
        this.units_ = 0L;
    }

    public static w A8(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (w)GeneratedMessageLite.parseDelimitedFrom(w.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    private void Ab(String s) {
        s.getClass();
        this.currencyCode_ = s;
    }

    public static w B6() {
        return w.DEFAULT_INSTANCE;
    }

    private void Bb(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.currencyCode_ = byteString0.toStringUtf8();
    }

    private void Cb(long v) {
        this.units_ = v;
    }

    public static w Ja(CodedInputStream codedInputStream0) throws IOException {
        return (w)GeneratedMessageLite.parseFrom(w.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static w La(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (w)GeneratedMessageLite.parseFrom(w.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static b M6() {
        return (b)w.DEFAULT_INSTANCE.createBuilder();
    }

    @Override  // com.google.type.x
    public long O9() {
        return this.units_;
    }

    @Override  // com.google.type.x
    public ByteString R8() {
        return ByteString.copyFromUtf8(this.currencyCode_);
    }

    public static b Z7(w w0) {
        return (b)w.DEFAULT_INSTANCE.createBuilder(w0);
    }

    public static w ca(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (w)GeneratedMessageLite.parseFrom(w.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    private void clearNanos() {
        this.nanos_ = 0;
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new w();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(w.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0004", new Object[]{"currencyCode_", "units_", "nanos_"});
            }
            case 4: {
                return w.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = w.PARSER;
                if(parser0 == null) {
                    Class class0 = w.class;
                    synchronized(class0) {
                        parser0 = w.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(w.DEFAULT_INSTANCE);
                            w.PARSER = parser0;
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

    @Override  // com.google.type.x
    public int getNanos() {
        return this.nanos_;
    }

    public static w j9(ByteString byteString0) throws InvalidProtocolBufferException {
        return (w)GeneratedMessageLite.parseFrom(w.DEFAULT_INSTANCE, byteString0);
    }

    public static Parser parser() {
        return w.DEFAULT_INSTANCE.getParserForType();
    }

    @Override  // com.google.type.x
    public String r9() {
        return this.currencyCode_;
    }

    private void setNanos(int v) {
        this.nanos_ = v;
    }

    public static w ub(InputStream inputStream0) throws IOException {
        return (w)GeneratedMessageLite.parseFrom(w.DEFAULT_INSTANCE, inputStream0);
    }

    public static w v8(InputStream inputStream0) throws IOException {
        return (w)GeneratedMessageLite.parseDelimitedFrom(w.DEFAULT_INSTANCE, inputStream0);
    }

    public static w vb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (w)GeneratedMessageLite.parseFrom(w.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static w wb(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (w)GeneratedMessageLite.parseFrom(w.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static w xb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (w)GeneratedMessageLite.parseFrom(w.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static w yb(byte[] arr_b) throws InvalidProtocolBufferException {
        return (w)GeneratedMessageLite.parseFrom(w.DEFAULT_INSTANCE, arr_b);
    }

    private void z6() {
        this.currencyCode_ = "";
    }

    public static w zb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (w)GeneratedMessageLite.parseFrom(w.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }
}

