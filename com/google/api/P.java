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

public final class p extends GeneratedMessageLite implements q {
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

    public static enum b {
        JWT_AUDIENCE(7),
        DISABLE_AUTH(8),
        AUTHENTICATION_NOT_SET(0);

        private final int a;

        private b(int v1) {
            this.a = v1;
        }

        public static b a(int v) {
            switch(v) {
                case 0: {
                    return b.d;
                }
                case 7: {
                    return b.b;
                }
                case 8: {
                    return b.c;
                }
                default: {
                    return null;
                }
            }
        }

        @Deprecated
        public static b b(int v) {
            return b.a(v);
        }

        public int getNumber() {
            return this.a;
        }
    }

    public static final class c extends Builder implements q {
        private c() {
            super(p.DEFAULT_INSTANCE);
        }

        c(a p$a0) {
        }

        public c Ab() {
            this.copyOnWrite();
            ((p)this.instance).Gb();
            return this;
        }

        public c Bb() {
            this.copyOnWrite();
            ((p)this.instance).Hb();
            return this;
        }

        public c Cb() {
            this.copyOnWrite();
            ((p)this.instance).Ib();
            return this;
        }

        public c Db() {
            this.copyOnWrite();
            ((p)this.instance).Jb();
            return this;
        }

        public c Eb(String s) {
            this.copyOnWrite();
            ((p)this.instance).Zb(s);
            return this;
        }

        public c Fb(ByteString byteString0) {
            this.copyOnWrite();
            ((p)this.instance).ac(byteString0);
            return this;
        }

        public c Gb(double f) {
            this.copyOnWrite();
            ((p)this.instance).bc(f);
            return this;
        }

        public c Hb(boolean z) {
            this.copyOnWrite();
            ((p)this.instance).cc(z);
            return this;
        }

        @Override  // com.google.api.q
        public double I4() {
            return ((p)this.instance).I4();
        }

        public c Ib(String s) {
            this.copyOnWrite();
            ((p)this.instance).dc(s);
            return this;
        }

        public c Jb(ByteString byteString0) {
            this.copyOnWrite();
            ((p)this.instance).ec(byteString0);
            return this;
        }

        public c Kb(double f) {
            this.copyOnWrite();
            ((p)this.instance).fc(f);
            return this;
        }

        public c Lb(double f) {
            this.copyOnWrite();
            ((p)this.instance).gc(f);
            return this;
        }

        public c Mb(d p$d0) {
            this.copyOnWrite();
            ((p)this.instance).hc(p$d0);
            return this;
        }

        public c Nb(int v) {
            this.copyOnWrite();
            ((p)this.instance).ic(v);
            return this;
        }

        public c Ob(String s) {
            this.copyOnWrite();
            ((p)this.instance).jc(s);
            return this;
        }

        @Override  // com.google.api.q
        public boolean P6() {
            return ((p)this.instance).P6();
        }

        public c Pb(ByteString byteString0) {
            this.copyOnWrite();
            ((p)this.instance).kc(byteString0);
            return this;
        }

        @Override  // com.google.api.q
        public ByteString Q3() {
            return ((p)this.instance).Q3();
        }

        public c Qb(String s) {
            this.copyOnWrite();
            ((p)this.instance).lc(s);
            return this;
        }

        public c Rb(ByteString byteString0) {
            this.copyOnWrite();
            ((p)this.instance).mc(byteString0);
            return this;
        }

        @Override  // com.google.api.q
        public String b() {
            return ((p)this.instance).b();
        }

        @Override  // com.google.api.q
        public ByteString c() {
            return ((p)this.instance).c();
        }

        @Override  // com.google.api.q
        public String g3() {
            return ((p)this.instance).g3();
        }

        @Override  // com.google.api.q
        public int h3() {
            return ((p)this.instance).h3();
        }

        @Override  // com.google.api.q
        public ByteString j() {
            return ((p)this.instance).j();
        }

        @Override  // com.google.api.q
        public String l() {
            return ((p)this.instance).l();
        }

        @Override  // com.google.api.q
        public double m7() {
            return ((p)this.instance).m7();
        }

        @Override  // com.google.api.q
        public String o7() {
            return ((p)this.instance).o7();
        }

        @Override  // com.google.api.q
        public ByteString r2() {
            return ((p)this.instance).r2();
        }

        public c ub() {
            this.copyOnWrite();
            ((p)this.instance).Ab();
            return this;
        }

        @Override  // com.google.api.q
        public d va() {
            return ((p)this.instance).va();
        }

        public c vb() {
            this.copyOnWrite();
            ((p)this.instance).Bb();
            return this;
        }

        public c wb() {
            this.copyOnWrite();
            ((p)this.instance).Cb();
            return this;
        }

        @Override  // com.google.api.q
        public double x9() {
            return ((p)this.instance).x9();
        }

        public c xb() {
            this.copyOnWrite();
            ((p)this.instance).Db();
            return this;
        }

        @Override  // com.google.api.q
        public b y7() {
            return ((p)this.instance).y7();
        }

        public c yb() {
            this.copyOnWrite();
            ((p)this.instance).Eb();
            return this;
        }

        public c zb() {
            this.copyOnWrite();
            ((p)this.instance).Fb();
            return this;
        }
    }

    public static enum d implements EnumLite {
        class com.google.api.p.d.a implements EnumLiteMap {
            com.google.api.p.d.a() {
                super();
            }

            public d a(int v) {
                return d.a(v);
            }

            @Override  // com.google.protobuf.Internal$EnumLiteMap
            public EnumLite findValueByNumber(int v) {
                return this.a(v);
            }
        }

        static final class com.google.api.p.d.b implements EnumVerifier {
            static final EnumVerifier a;

            static {
                com.google.api.p.d.b.a = new com.google.api.p.d.b();
            }

            @Override  // com.google.protobuf.Internal$EnumVerifier
            public boolean isInRange(int v) {
                return d.a(v) != null;
            }
        }

        PATH_TRANSLATION_UNSPECIFIED(0),
        CONSTANT_ADDRESS(1),
        APPEND_PATH_TO_ADDRESS(2),
        UNRECOGNIZED(-1);

        private final int a;
        public static final int f = 0;
        public static final int g = 1;
        public static final int h = 2;
        private static final EnumLiteMap i;

        static {
            d.i = new com.google.api.p.d.a();
        }

        private d(int v1) {
            this.a = v1;
        }

        public static d a(int v) {
            switch(v) {
                case 0: {
                    return d.b;
                }
                case 1: {
                    return d.c;
                }
                case 2: {
                    return d.d;
                }
                default: {
                    return null;
                }
            }
        }

        public static EnumLiteMap b() {
            return d.i;
        }

        public static EnumVerifier c() {
            return com.google.api.p.d.b.a;
        }

        @Deprecated
        public static d d(int v) {
            return d.a(v);
        }

        @Override  // com.google.protobuf.Internal$EnumLite
        public final int getNumber() {
            if(this == d.e) {
                throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
            }
            return this.a;
        }
    }

    public static final int ADDRESS_FIELD_NUMBER = 2;
    public static final int DEADLINE_FIELD_NUMBER = 3;
    private static final p DEFAULT_INSTANCE = null;
    public static final int DISABLE_AUTH_FIELD_NUMBER = 8;
    public static final int JWT_AUDIENCE_FIELD_NUMBER = 7;
    public static final int MIN_DEADLINE_FIELD_NUMBER = 4;
    public static final int OPERATION_DEADLINE_FIELD_NUMBER = 5;
    private static volatile Parser PARSER = null;
    public static final int PATH_TRANSLATION_FIELD_NUMBER = 6;
    public static final int PROTOCOL_FIELD_NUMBER = 9;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private String address_;
    private int authenticationCase_;
    private Object authentication_;
    private double deadline_;
    private double minDeadline_;
    private double operationDeadline_;
    private int pathTranslation_;
    private String protocol_;
    private String selector_;

    static {
        p p0 = new p();
        p.DEFAULT_INSTANCE = p0;
        GeneratedMessageLite.registerDefaultInstance(p.class, p0);
    }

    private p() {
        this.authenticationCase_ = 0;
        this.selector_ = "";
        this.address_ = "";
        this.protocol_ = "";
    }

    private void Ab() {
        this.address_ = "";
    }

    private void Bb() {
        this.authenticationCase_ = 0;
        this.authentication_ = null;
    }

    private void Cb() {
        this.deadline_ = 0.0;
    }

    private void Db() {
        if(this.authenticationCase_ == 8) {
            this.authenticationCase_ = 0;
            this.authentication_ = null;
        }
    }

    private void Eb() {
        if(this.authenticationCase_ == 7) {
            this.authenticationCase_ = 0;
            this.authentication_ = null;
        }
    }

    private void Fb() {
        this.minDeadline_ = 0.0;
    }

    private void Gb() {
        this.operationDeadline_ = 0.0;
    }

    private void Hb() {
        this.pathTranslation_ = 0;
    }

    @Override  // com.google.api.q
    public double I4() {
        return this.deadline_;
    }

    private void Ib() {
        this.protocol_ = "";
    }

    private void Jb() {
        this.selector_ = "";
    }

    public static p Kb() {
        return p.DEFAULT_INSTANCE;
    }

    public static c Lb() {
        return (c)p.DEFAULT_INSTANCE.createBuilder();
    }

    public static c Mb(p p0) {
        return (c)p.DEFAULT_INSTANCE.createBuilder(p0);
    }

    public static p Nb(InputStream inputStream0) throws IOException {
        return (p)GeneratedMessageLite.parseDelimitedFrom(p.DEFAULT_INSTANCE, inputStream0);
    }

    public static p Ob(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (p)GeneratedMessageLite.parseDelimitedFrom(p.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    @Override  // com.google.api.q
    public boolean P6() {
        return this.authenticationCase_ == 8 ? ((Boolean)this.authentication_).booleanValue() : false;
    }

    public static p Pb(ByteString byteString0) throws InvalidProtocolBufferException {
        return (p)GeneratedMessageLite.parseFrom(p.DEFAULT_INSTANCE, byteString0);
    }

    @Override  // com.google.api.q
    public ByteString Q3() {
        return this.authenticationCase_ == 7 ? ByteString.copyFromUtf8(((String)this.authentication_)) : ByteString.copyFromUtf8("");
    }

    public static p Qb(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (p)GeneratedMessageLite.parseFrom(p.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static p Rb(CodedInputStream codedInputStream0) throws IOException {
        return (p)GeneratedMessageLite.parseFrom(p.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static p Sb(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (p)GeneratedMessageLite.parseFrom(p.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static p Tb(InputStream inputStream0) throws IOException {
        return (p)GeneratedMessageLite.parseFrom(p.DEFAULT_INSTANCE, inputStream0);
    }

    public static p Ub(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (p)GeneratedMessageLite.parseFrom(p.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static p Vb(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (p)GeneratedMessageLite.parseFrom(p.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static p Wb(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (p)GeneratedMessageLite.parseFrom(p.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static p Xb(byte[] arr_b) throws InvalidProtocolBufferException {
        return (p)GeneratedMessageLite.parseFrom(p.DEFAULT_INSTANCE, arr_b);
    }

    public static p Yb(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (p)GeneratedMessageLite.parseFrom(p.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    private void Zb(String s) {
        s.getClass();
        this.address_ = s;
    }

    private void ac(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.address_ = byteString0.toStringUtf8();
    }

    @Override  // com.google.api.q
    public String b() {
        return this.selector_;
    }

    private void bc(double f) {
        this.deadline_ = f;
    }

    @Override  // com.google.api.q
    public ByteString c() {
        return ByteString.copyFromUtf8(this.selector_);
    }

    private void cc(boolean z) {
        this.authenticationCase_ = 8;
        this.authentication_ = Boolean.valueOf(z);
    }

    private void dc(String s) {
        s.getClass();
        this.authenticationCase_ = 7;
        this.authentication_ = s;
    }

    @Override  // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new p();
            }
            case 2: {
                return new c(null);
            }
            case 3: {
                return GeneratedMessageLite.newMessageInfo(p.DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0000\u0004\u0000\u0005\u0000\u0006\f\u0007Ȼ\u0000\b:\u0000\tȈ", new Object[]{"authentication_", "authenticationCase_", "selector_", "address_", "deadline_", "minDeadline_", "operationDeadline_", "pathTranslation_", "protocol_"});
            }
            case 4: {
                return p.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = p.PARSER;
                if(parser0 == null) {
                    Class class0 = p.class;
                    synchronized(class0) {
                        parser0 = p.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(p.DEFAULT_INSTANCE);
                            p.PARSER = parser0;
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

    private void ec(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.authentication_ = byteString0.toStringUtf8();
        this.authenticationCase_ = 7;
    }

    private void fc(double f) {
        this.minDeadline_ = f;
    }

    @Override  // com.google.api.q
    public String g3() {
        return this.authenticationCase_ == 7 ? ((String)this.authentication_) : "";
    }

    private void gc(double f) {
        this.operationDeadline_ = f;
    }

    @Override  // com.google.api.q
    public int h3() {
        return this.pathTranslation_;
    }

    private void hc(d p$d0) {
        this.pathTranslation_ = p$d0.getNumber();
    }

    private void ic(int v) {
        this.pathTranslation_ = v;
    }

    @Override  // com.google.api.q
    public ByteString j() {
        return ByteString.copyFromUtf8(this.protocol_);
    }

    private void jc(String s) {
        s.getClass();
        this.protocol_ = s;
    }

    private void kc(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.protocol_ = byteString0.toStringUtf8();
    }

    @Override  // com.google.api.q
    public String l() {
        return this.protocol_;
    }

    private void lc(String s) {
        s.getClass();
        this.selector_ = s;
    }

    @Override  // com.google.api.q
    public double m7() {
        return this.operationDeadline_;
    }

    private void mc(ByteString byteString0) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString0);
        this.selector_ = byteString0.toStringUtf8();
    }

    @Override  // com.google.api.q
    public String o7() {
        return this.address_;
    }

    public static Parser parser() {
        return p.DEFAULT_INSTANCE.getParserForType();
    }

    @Override  // com.google.api.q
    public ByteString r2() {
        return ByteString.copyFromUtf8(this.address_);
    }

    @Override  // com.google.api.q
    public d va() {
        d p$d0 = d.a(this.pathTranslation_);
        return p$d0 == null ? d.e : p$d0;
    }

    @Override  // com.google.api.q
    public double x9() {
        return this.minDeadline_;
    }

    @Override  // com.google.api.q
    public b y7() {
        return b.a(this.authenticationCase_);
    }
}

