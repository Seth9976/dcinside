package com.google.api;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite.Builder;
import com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal.EnumLite;
import com.google.protobuf.Internal.EnumLiteMap;
import com.google.protobuf.Internal.EnumVerifier;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class i0 extends GeneratedMessageLite implements j0 {
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

    public static final class b extends Builder implements j0 {
        private b() {
            super(i0.DEFAULT_INSTANCE);
        }

        b(a i0$a0) {
        }

        public b Ab(ByteString byteString0) {
            this.copyOnWrite();
            ((i0)this.instance).Gb(byteString0);
            return this;
        }

        public b Bb(c i0$c0) {
            this.copyOnWrite();
            ((i0)this.instance).Hb(i0$c0);
            return this;
        }

        public b Cb(int v) {
            this.copyOnWrite();
            ((i0)this.instance).Ib(v);
            return this;
        }

        @Override  // com.google.api.j0
        public ByteString L6() {
            return ((i0)this.instance).L6();
        }

        @Override  // com.google.api.j0
        public ByteString a() {
            return ((i0)this.instance).a();
        }

        @Override  // com.google.api.j0
        public int a0() {
            return ((i0)this.instance).a0();
        }

        @Override  // com.google.api.j0
        public String getDescription() {
            return ((i0)this.instance).getDescription();
        }

        @Override  // com.google.api.j0
        public String getKey() {
            return ((i0)this.instance).getKey();
        }

        @Override  // com.google.api.j0
        public c o0() {
            return ((i0)this.instance).o0();
        }

        public b ub() {
            this.copyOnWrite();
            ((i0)this.instance).B6();
            return this;
        }

        public b vb() {
            this.copyOnWrite();
            ((i0)this.instance).M6();
            return this;
        }

        public b wb() {
            this.copyOnWrite();
            ((i0)this.instance).Z7();
            return this;
        }

        public b xb(String s) {
            this.copyOnWrite();
            ((i0)this.instance).Db(s);
            return this;
        }

        public b yb(ByteString byteString0) {
            this.copyOnWrite();
            ((i0)this.instance).Eb(byteString0);
            return this;
        }

        public b zb(String s) {
            this.copyOnWrite();
            ((i0)this.instance).Fb(s);
            return this;
        }
    }

    public static enum c implements EnumLite {
        class com.google.api.i0.c.a implements EnumLiteMap {
            com.google.api.i0.c.a() {
                super();
            }

            public c a(int v) {
                return c.a(v);
            }

            @Override  // com.google.protobuf.Internal$EnumLiteMap
            public EnumLite findValueByNumber(int v) {
                return this.a(v);
            }
        }

        static final class com.google.api.i0.c.b implements EnumVerifier {
            static final EnumVerifier a;

            static {
                com.google.api.i0.c.b.a = new com.google.api.i0.c.b();
            }

            @Override  // com.google.protobuf.Internal$EnumVerifier
            public boolean isInRange(int v) {
                return c.a(v) != null;
            }
        }

        STRING(0),
        BOOL(1),
        INT64(2),
        UNRECOGNIZED(-1);

        private final int a;
        public static final int f = 0;
        public static final int g = 1;
        public static final int h = 2;
        private static final EnumLiteMap i;

        static {
            c.i = new com.google.api.i0.c.a();
        }

        private c(int v1) {
            this.a = v1;
        }

        public static c a(int v) {
            switch(v) {
                case 0: {
                    return c.b;
                }
                case 1: {
                    return c.c;
                }
                case 2: {
                    return c.d;
                }
                default: {
                    return null;
                }
            }
        }

        public static EnumLiteMap b() {
            return c.i;
        }

        public static EnumVerifier c() {
            return com.google.api.i0.c.b.a;
        }

        @Deprecated
        public static c d(int v) {
            return c.a(v);
        }

        @Override  // com.google.protobuf.Internal$EnumLite
        public final int getNumber() {
            if(this == c.e) {
                throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
            }
            return this.a;
        }
    }

    private static final i0 DEFAULT_INSTANCE = null;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int KEY_FIELD_NUMBER = 1;
    private static volatile Parser PARSER = null;
    public static final int VALUE_TYPE_FIELD_NUMBER = 2;
    private String description_;
    private String key_;
    private int valueType_;

    static {
        i0 i00 = new i0();
        i0.DEFAULT_INSTANCE = i00;
        GeneratedMessageLite.registerDefaultInstance(i0.class, i00);
    }

    private i0() {
        this.key_ = "";
        this.description_ = "";
    }

    public static b A8() {
        return (b)i0.DEFAULT_INSTANCE.createBuilder();
    }

    public static i0 Ab(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (i0)GeneratedMessageLite.parseFrom(i0.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    private void B6() {
        this.description_ = "";
    }

    public static i0 Bb(byte[] arr_b) throws InvalidProtocolBufferException {
        return (i0)GeneratedMessageLite.parseFrom(i0.DEFAULT_INSTANCE, arr_b);
    }

    public static i0 Cb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (i0)GeneratedMessageLite.parseFrom(i0.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void Db(String s) {
        s.getClass();
        this.description_ = s;
    }

    private void Eb(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.description_ = byteString0.toStringUtf8();
    }

    private void Fb(String s) {
        s.getClass();
        this.key_ = s;
    }

    private void Gb(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.key_ = byteString0.toStringUtf8();
    }

    private void Hb(c i0$c0) {
        this.valueType_ = i0$c0.getNumber();
    }

    private void Ib(int v) {
        this.valueType_ = v;
    }

    public static i0 Ja(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (i0)GeneratedMessageLite.parseDelimitedFrom(i0.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    @Override  // com.google.api.j0
    public ByteString L6() {
        return ByteString.copyFromUtf8(this.key_);
    }

    public static i0 La(ByteString byteString0) throws InvalidProtocolBufferException {
        return (i0)GeneratedMessageLite.parseFrom(i0.DEFAULT_INSTANCE, byteString0);
    }

    private void M6() {
        this.key_ = "";
    }

    private void Z7() {
        this.valueType_ = 0;
    }

    @Override  // com.google.api.j0
    public ByteString a() {
        return ByteString.copyFromUtf8(this.description_);
    }

    @Override  // com.google.api.j0
    public int a0() {
        return this.valueType_;
    }

    public static i0 ca(InputStream inputStream0) throws IOException {
        return (i0)GeneratedMessageLite.parseDelimitedFrom(i0.DEFAULT_INSTANCE, inputStream0);
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new i0();
            }
            case 2: {
                return new b(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(i0.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ", new Object[]{"key_", "valueType_", "description_"});
            }
            case 4: {
                return i0.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = i0.PARSER;
                if(parser0 == null) {
                    Class class0 = i0.class;
                    synchronized(class0) {
                        parser0 = i0.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(i0.DEFAULT_INSTANCE);
                            i0.PARSER = parser0;
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

    @Override  // com.google.api.j0
    public String getDescription() {
        return this.description_;
    }

    @Override  // com.google.api.j0
    public String getKey() {
        return this.key_;
    }

    public static b j9(i0 i00) {
        return (b)i0.DEFAULT_INSTANCE.createBuilder(i00);
    }

    @Override  // com.google.api.j0
    public c o0() {
        c i0$c0 = c.a(this.valueType_);
        return i0$c0 == null ? c.e : i0$c0;
    }

    public static Parser parser() {
        return i0.DEFAULT_INSTANCE.getParserForType();
    }

    public static i0 ub(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (i0)GeneratedMessageLite.parseFrom(i0.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static i0 v8() {
        return i0.DEFAULT_INSTANCE;
    }

    public static i0 vb(CodedInputStream codedInputStream0) throws IOException {
        return (i0)GeneratedMessageLite.parseFrom(i0.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static i0 wb(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (i0)GeneratedMessageLite.parseFrom(i0.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static i0 xb(InputStream inputStream0) throws IOException {
        return (i0)GeneratedMessageLite.parseFrom(i0.DEFAULT_INSTANCE, inputStream0);
    }

    public static i0 yb(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (i0)GeneratedMessageLite.parseFrom(i0.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static i0 zb(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (i0)GeneratedMessageLite.parseFrom(i0.DEFAULT_INSTANCE, byteBuffer0);
    }
}

