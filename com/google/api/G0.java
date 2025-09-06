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

public final class g0 extends GeneratedMessageLite implements h0 {
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

    public static final class b extends Builder implements h0 {
        private b() {
            super(g0.DEFAULT_INSTANCE);
        }

        b(a g0$a0) {
        }

        public b Ab(String s) {
            this.copyOnWrite();
            ((g0)this.instance).Hb(s);
            return this;
        }

        public b Bb(ByteString byteString0) {
            this.copyOnWrite();
            ((g0)this.instance).Ib(byteString0);
            return this;
        }

        public b Cb(String s) {
            this.copyOnWrite();
            ((g0)this.instance).Jb(s);
            return this;
        }

        public b Db(ByteString byteString0) {
            this.copyOnWrite();
            ((g0)this.instance).Kb(byteString0);
            return this;
        }

        @Override  // com.google.api.h0
        public String U() {
            return ((g0)this.instance).U();
        }

        @Override  // com.google.api.h0
        public String W8() {
            return ((g0)this.instance).W8();
        }

        @Override  // com.google.api.h0
        public ByteString Y0() {
            return ((g0)this.instance).Y0();
        }

        @Override  // com.google.api.h0
        public ByteString i8() {
            return ((g0)this.instance).i8();
        }

        @Override  // com.google.api.h0
        public String j0() {
            return ((g0)this.instance).j0();
        }

        @Override  // com.google.api.h0
        public c ka() {
            return ((g0)this.instance).ka();
        }

        @Override  // com.google.api.h0
        public ByteString q4() {
            return ((g0)this.instance).q4();
        }

        public b ub() {
            this.copyOnWrite();
            ((g0)this.instance).M6();
            return this;
        }

        public b vb() {
            this.copyOnWrite();
            ((g0)this.instance).Z7();
            return this;
        }

        public b wb() {
            this.copyOnWrite();
            ((g0)this.instance).v8();
            return this;
        }

        public b xb() {
            this.copyOnWrite();
            ((g0)this.instance).A8();
            return this;
        }

        public b yb(String s) {
            this.copyOnWrite();
            ((g0)this.instance).Fb(s);
            return this;
        }

        public b zb(ByteString byteString0) {
            this.copyOnWrite();
            ((g0)this.instance).Gb(byteString0);
            return this;
        }
    }

    public static enum c {
        HEADER(1),
        QUERY(2),
        IN_NOT_SET(0);

        private final int a;

        private c(int v1) {
            this.a = v1;
        }

        public static c a(int v) {
            switch(v) {
                case 0: {
                    return c.d;
                }
                case 1: {
                    return c.b;
                }
                case 2: {
                    return c.c;
                }
                default: {
                    return null;
                }
            }
        }

        @Deprecated
        public static c b(int v) {
            return c.a(v);
        }

        public int getNumber() {
            return this.a;
        }
    }

    private static final g0 DEFAULT_INSTANCE = null;
    public static final int HEADER_FIELD_NUMBER = 1;
    private static volatile Parser PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int VALUE_PREFIX_FIELD_NUMBER = 3;
    private int inCase_;
    private Object in_;
    private String valuePrefix_;

    static {
        g0 g00 = new g0();
        g0.DEFAULT_INSTANCE = g00;
        GeneratedMessageLite.registerDefaultInstance(g0.class, g00);
    }

    private g0() {
        this.inCase_ = 0;
        this.valuePrefix_ = "";
    }

    private void A8() {
        this.valuePrefix_ = "";
    }

    public static g0 Ab(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (g0)GeneratedMessageLite.parseFrom(g0.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static g0 Bb(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (g0)GeneratedMessageLite.parseFrom(g0.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static g0 Cb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (g0)GeneratedMessageLite.parseFrom(g0.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static g0 Db(byte[] arr_b) throws InvalidProtocolBufferException {
        return (g0)GeneratedMessageLite.parseFrom(g0.DEFAULT_INSTANCE, arr_b);
    }

    public static g0 Eb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (g0)GeneratedMessageLite.parseFrom(g0.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void Fb(String s) {
        s.getClass();
        this.inCase_ = 1;
        this.in_ = s;
    }

    private void Gb(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.in_ = byteString0.toStringUtf8();
        this.inCase_ = 1;
    }

    private void Hb(String s) {
        s.getClass();
        this.inCase_ = 2;
        this.in_ = s;
    }

    private void Ib(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.in_ = byteString0.toStringUtf8();
        this.inCase_ = 2;
    }

    public static b Ja(g0 g00) {
        return (b)g0.DEFAULT_INSTANCE.createBuilder(g00);
    }

    private void Jb(String s) {
        s.getClass();
        this.valuePrefix_ = s;
    }

    private void Kb(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.valuePrefix_ = byteString0.toStringUtf8();
    }

    public static g0 La(InputStream inputStream0) throws IOException {
        return (g0)GeneratedMessageLite.parseDelimitedFrom(g0.DEFAULT_INSTANCE, inputStream0);
    }

    private void M6() {
        if(this.inCase_ == 1) {
            this.inCase_ = 0;
            this.in_ = null;
        }
    }

    @Override  // com.google.api.h0
    public String U() {
        return this.inCase_ == 2 ? ((String)this.in_) : "";
    }

    @Override  // com.google.api.h0
    public String W8() {
        return this.valuePrefix_;
    }

    @Override  // com.google.api.h0
    public ByteString Y0() {
        return this.inCase_ == 2 ? ByteString.copyFromUtf8(((String)this.in_)) : ByteString.copyFromUtf8("");
    }

    private void Z7() {
        this.inCase_ = 0;
        this.in_ = null;
    }

    public static b ca() {
        return (b)g0.DEFAULT_INSTANCE.createBuilder();
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new g0();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(g0.DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000\u0003Ȉ", new Object[]{"in_", "inCase_", "valuePrefix_"});
            }
            case 4: {
                return g0.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = g0.PARSER;
                if(parser0 == null) {
                    Class class0 = g0.class;
                    synchronized(class0) {
                        parser0 = g0.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(g0.DEFAULT_INSTANCE);
                            g0.PARSER = parser0;
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

    @Override  // com.google.api.h0
    public ByteString i8() {
        return ByteString.copyFromUtf8(this.valuePrefix_);
    }

    @Override  // com.google.api.h0
    public String j0() {
        return this.inCase_ == 1 ? ((String)this.in_) : "";
    }

    public static g0 j9() {
        return g0.DEFAULT_INSTANCE;
    }

    @Override  // com.google.api.h0
    public c ka() {
        return c.a(this.inCase_);
    }

    public static Parser parser() {
        return g0.DEFAULT_INSTANCE.getParserForType();
    }

    @Override  // com.google.api.h0
    public ByteString q4() {
        return this.inCase_ == 1 ? ByteString.copyFromUtf8(((String)this.in_)) : ByteString.copyFromUtf8("");
    }

    public static g0 ub(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (g0)GeneratedMessageLite.parseDelimitedFrom(g0.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    private void v8() {
        if(this.inCase_ == 2) {
            this.inCase_ = 0;
            this.in_ = null;
        }
    }

    public static g0 vb(ByteString byteString0) throws InvalidProtocolBufferException {
        return (g0)GeneratedMessageLite.parseFrom(g0.DEFAULT_INSTANCE, byteString0);
    }

    public static g0 wb(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (g0)GeneratedMessageLite.parseFrom(g0.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static g0 xb(CodedInputStream codedInputStream0) throws IOException {
        return (g0)GeneratedMessageLite.parseFrom(g0.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static g0 yb(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (g0)GeneratedMessageLite.parseFrom(g0.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static g0 zb(InputStream inputStream0) throws IOException {
        return (g0)GeneratedMessageLite.parseFrom(g0.DEFAULT_INSTANCE, inputStream0);
    }
}

