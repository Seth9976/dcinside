package androidx.datastore.preferences.protobuf;

import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class Field extends GeneratedMessageLite implements FieldOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements FieldOrBuilder {
        private Builder() {
            super(Field.DEFAULT_INSTANCE);
        }

        Builder(androidx.datastore.preferences.protobuf.Field.1 field$10) {
        }

        public Builder A0(Cardinality field$Cardinality0) {
            this.c0();
            ((Field)this.b).j2(field$Cardinality0);
            return this;
        }

        public Builder B0(int v) {
            this.c0();
            ((Field)this.b).k2(v);
            return this;
        }

        public Builder C0(String s) {
            this.c0();
            ((Field)this.b).l2(s);
            return this;
        }

        public Builder D0(ByteString byteString0) {
            this.c0();
            ((Field)this.b).m2(byteString0);
            return this;
        }

        public Builder E0(String s) {
            this.c0();
            ((Field)this.b).n2(s);
            return this;
        }

        public Builder F0(ByteString byteString0) {
            this.c0();
            ((Field)this.b).o2(byteString0);
            return this;
        }

        public Builder G0(Kind field$Kind0) {
            this.c0();
            ((Field)this.b).p2(field$Kind0);
            return this;
        }

        public Builder H0(int v) {
            this.c0();
            ((Field)this.b).q2(v);
            return this;
        }

        public Builder I0(String s) {
            this.c0();
            ((Field)this.b).r2(s);
            return this;
        }

        public Builder J0(ByteString byteString0) {
            this.c0();
            ((Field)this.b).s2(byteString0);
            return this;
        }

        public Builder K0(int v) {
            this.c0();
            ((Field)this.b).t2(v);
            return this;
        }

        public Builder L0(int v) {
            this.c0();
            ((Field)this.b).u2(v);
            return this;
        }

        public Builder M0(int v, androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
            this.c0();
            ((Field)this.b).v2(v, option$Builder0);
            return this;
        }

        public Builder N0(int v, Option option0) {
            this.c0();
            ((Field)this.b).w2(v, option0);
            return this;
        }

        public Builder O0(boolean z) {
            this.c0();
            ((Field)this.b).x2(z);
            return this;
        }

        public Builder P0(String s) {
            this.c0();
            ((Field)this.b).y2(s);
            return this;
        }

        public Builder Q0(ByteString byteString0) {
            this.c0();
            ((Field)this.b).z2(byteString0);
            return this;
        }

        @Override  // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public Cardinality getCardinality() {
            return ((Field)this.b).getCardinality();
        }

        @Override  // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public int getCardinalityValue() {
            return ((Field)this.b).getCardinalityValue();
        }

        @Override  // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public String getDefaultValue() {
            return ((Field)this.b).getDefaultValue();
        }

        @Override  // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public ByteString getDefaultValueBytes() {
            return ((Field)this.b).getDefaultValueBytes();
        }

        @Override  // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public String getJsonName() {
            return ((Field)this.b).getJsonName();
        }

        @Override  // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public ByteString getJsonNameBytes() {
            return ((Field)this.b).getJsonNameBytes();
        }

        @Override  // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public Kind getKind() {
            return ((Field)this.b).getKind();
        }

        @Override  // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public int getKindValue() {
            return ((Field)this.b).getKindValue();
        }

        @Override  // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public String getName() {
            return ((Field)this.b).getName();
        }

        @Override  // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public ByteString getNameBytes() {
            return ((Field)this.b).getNameBytes();
        }

        @Override  // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public int getNumber() {
            return ((Field)this.b).getNumber();
        }

        @Override  // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public int getOneofIndex() {
            return ((Field)this.b).getOneofIndex();
        }

        @Override  // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public Option getOptions(int v) {
            return ((Field)this.b).getOptions(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public int getOptionsCount() {
            return ((Field)this.b).getOptionsCount();
        }

        @Override  // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public List getOptionsList() {
            return DesugarCollections.unmodifiableList(((Field)this.b).getOptionsList());
        }

        @Override  // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public boolean getPacked() {
            return ((Field)this.b).getPacked();
        }

        @Override  // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public String getTypeUrl() {
            return ((Field)this.b).getTypeUrl();
        }

        @Override  // androidx.datastore.preferences.protobuf.FieldOrBuilder
        public ByteString getTypeUrlBytes() {
            return ((Field)this.b).getTypeUrlBytes();
        }

        public Builder k0(Iterable iterable0) {
            this.c0();
            ((Field)this.b).A1(iterable0);
            return this;
        }

        public Builder l0(int v, androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
            this.c0();
            ((Field)this.b).B1(v, option$Builder0);
            return this;
        }

        public Builder m0(int v, Option option0) {
            this.c0();
            ((Field)this.b).C1(v, option0);
            return this;
        }

        public Builder n0(androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
            this.c0();
            ((Field)this.b).D1(option$Builder0);
            return this;
        }

        public Builder o0(Option option0) {
            this.c0();
            ((Field)this.b).E1(option0);
            return this;
        }

        public Builder p0() {
            this.c0();
            ((Field)this.b).F1();
            return this;
        }

        public Builder q0() {
            this.c0();
            ((Field)this.b).G1();
            return this;
        }

        public Builder r0() {
            this.c0();
            ((Field)this.b).H1();
            return this;
        }

        public Builder s0() {
            this.c0();
            ((Field)this.b).I1();
            return this;
        }

        public Builder t0() {
            this.c0();
            ((Field)this.b).J1();
            return this;
        }

        public Builder u0() {
            this.c0();
            ((Field)this.b).K1();
            return this;
        }

        public Builder v0() {
            this.c0();
            ((Field)this.b).L1();
            return this;
        }

        public Builder w0() {
            this.c0();
            ((Field)this.b).M1();
            return this;
        }

        public Builder x0() {
            this.c0();
            ((Field)this.b).N1();
            return this;
        }

        public Builder y0() {
            this.c0();
            ((Field)this.b).O1();
            return this;
        }

        public Builder z0(int v) {
            this.c0();
            ((Field)this.b).i2(v);
            return this;
        }
    }

    public static enum Cardinality implements EnumLite {
        static final class CardinalityVerifier implements EnumVerifier {
            static final EnumVerifier a;

            static {
                CardinalityVerifier.a = new CardinalityVerifier();
            }

            @Override  // androidx.datastore.preferences.protobuf.Internal$EnumVerifier
            public boolean isInRange(int v) {
                return Cardinality.a(v) != null;
            }
        }

        CARDINALITY_UNKNOWN(0),
        CARDINALITY_OPTIONAL(1),
        CARDINALITY_REQUIRED(2),
        CARDINALITY_REPEATED(3),
        UNRECOGNIZED(-1);

        private final int a;
        public static final int g = 0;
        public static final int h = 1;
        public static final int i = 2;
        public static final int j = 3;
        private static final EnumLiteMap k;

        static {
            Cardinality.k = new EnumLiteMap() {
                public Cardinality a(int v) {
                    return Cardinality.a(v);
                }

                @Override  // androidx.datastore.preferences.protobuf.Internal$EnumLiteMap
                public EnumLite findValueByNumber(int v) {
                    return this.a(v);
                }
            };
        }

        private Cardinality(int v1) {
            this.a = v1;
        }

        public static Cardinality a(int v) {
            switch(v) {
                case 0: {
                    return Cardinality.b;
                }
                case 1: {
                    return Cardinality.c;
                }
                case 2: {
                    return Cardinality.d;
                }
                case 3: {
                    return Cardinality.e;
                }
                default: {
                    return null;
                }
            }
        }

        public static EnumLiteMap b() {
            return Cardinality.k;
        }

        public static EnumVerifier c() {
            return CardinalityVerifier.a;
        }

        @Deprecated
        public static Cardinality d(int v) {
            return Cardinality.a(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.Internal$EnumLite
        public final int getNumber() {
            if(this == Cardinality.f) {
                throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
            }
            return this.a;
        }
    }

    public static enum Kind implements EnumLite {
        static final class KindVerifier implements EnumVerifier {
            static final EnumVerifier a;

            static {
                KindVerifier.a = new KindVerifier();
            }

            @Override  // androidx.datastore.preferences.protobuf.Internal$EnumVerifier
            public boolean isInRange(int v) {
                return Kind.a(v) != null;
            }
        }

        TYPE_UNKNOWN(0),
        TYPE_DOUBLE(1),
        TYPE_FLOAT(2),
        TYPE_INT64(3),
        TYPE_UINT64(4),
        TYPE_INT32(5),
        TYPE_FIXED64(6),
        TYPE_FIXED32(7),
        TYPE_BOOL(8),
        TYPE_STRING(9),
        TYPE_GROUP(10),
        TYPE_MESSAGE(11),
        TYPE_BYTES(12),
        TYPE_UINT32(13),
        TYPE_ENUM(14),
        TYPE_SFIXED32(15),
        TYPE_SFIXED64(16),
        TYPE_SINT32(17),
        TYPE_SINT64(18),
        UNRECOGNIZED(-1);

        public static final int A = 5;
        public static final int B = 6;
        public static final int C = 7;
        public static final int D = 8;
        public static final int E = 9;
        public static final int F = 10;
        public static final int G = 11;
        public static final int H = 12;
        public static final int I = 13;
        public static final int J = 14;
        public static final int K = 15;
        public static final int L = 16;
        public static final int M = 17;
        public static final int N = 18;
        private static final EnumLiteMap O = null;
        private final int a;
        public static final int v = 0;
        public static final int w = 1;
        public static final int x = 2;
        public static final int y = 3;
        public static final int z = 4;

        static {
            Kind.O = new EnumLiteMap() {
                public Kind a(int v) {
                    return Kind.a(v);
                }

                @Override  // androidx.datastore.preferences.protobuf.Internal$EnumLiteMap
                public EnumLite findValueByNumber(int v) {
                    return this.a(v);
                }
            };
        }

        private Kind(int v1) {
            this.a = v1;
        }

        public static Kind a(int v) {
            switch(v) {
                case 0: {
                    return Kind.b;
                }
                case 1: {
                    return Kind.c;
                }
                case 2: {
                    return Kind.d;
                }
                case 3: {
                    return Kind.e;
                }
                case 4: {
                    return Kind.f;
                }
                case 5: {
                    return Kind.g;
                }
                case 6: {
                    return Kind.h;
                }
                case 7: {
                    return Kind.i;
                }
                case 8: {
                    return Kind.j;
                }
                case 9: {
                    return Kind.k;
                }
                case 10: {
                    return Kind.l;
                }
                case 11: {
                    return Kind.m;
                }
                case 12: {
                    return Kind.n;
                }
                case 13: {
                    return Kind.o;
                }
                case 14: {
                    return Kind.p;
                }
                case 15: {
                    return Kind.q;
                }
                case 16: {
                    return Kind.r;
                }
                case 17: {
                    return Kind.s;
                }
                case 18: {
                    return Kind.t;
                }
                default: {
                    return null;
                }
            }
        }

        public static EnumLiteMap b() {
            return Kind.O;
        }

        public static EnumVerifier c() {
            return KindVerifier.a;
        }

        @Deprecated
        public static Kind d(int v) {
            return Kind.a(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.Internal$EnumLite
        public final int getNumber() {
            if(this == Kind.u) {
                throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
            }
            return this.a;
        }
    }

    public static final int CARDINALITY_FIELD_NUMBER = 2;
    private static final Field DEFAULT_INSTANCE = null;
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 11;
    public static final int JSON_NAME_FIELD_NUMBER = 10;
    public static final int KIND_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int NUMBER_FIELD_NUMBER = 3;
    public static final int ONEOF_INDEX_FIELD_NUMBER = 7;
    public static final int OPTIONS_FIELD_NUMBER = 9;
    public static final int PACKED_FIELD_NUMBER = 8;
    private static volatile Parser PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 6;
    private int cardinality_;
    private String defaultValue_;
    private String jsonName_;
    private int kind_;
    private String name_;
    private int number_;
    private int oneofIndex_;
    private ProtobufList options_;
    private boolean packed_;
    private String typeUrl_;

    static {
        Field field0 = new Field();
        Field.DEFAULT_INSTANCE = field0;
        GeneratedMessageLite.P0(Field.class, field0);
    }

    private Field() {
        this.name_ = "";
        this.typeUrl_ = "";
        this.options_ = GeneratedMessageLite.b0();
        this.jsonName_ = "";
        this.defaultValue_ = "";
    }

    private void A1(Iterable iterable0) {
        this.P1();
        AbstractMessageLite.G(iterable0, this.options_);
    }

    private void B1(int v, androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
        this.P1();
        this.options_.add(v, option$Builder0.Y());
    }

    private void C1(int v, Option option0) {
        option0.getClass();
        this.P1();
        this.options_.add(v, option0);
    }

    private void D1(androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
        this.P1();
        this.options_.add(option$Builder0.Y());
    }

    private void E1(Option option0) {
        option0.getClass();
        this.P1();
        this.options_.add(option0);
    }

    private void F1() {
        this.cardinality_ = 0;
    }

    private void G1() {
        this.defaultValue_ = Field.Q1().getDefaultValue();
    }

    private void H1() {
        this.jsonName_ = Field.Q1().getJsonName();
    }

    private void I1() {
        this.kind_ = 0;
    }

    private void J1() {
        this.name_ = Field.Q1().getName();
    }

    private void K1() {
        this.number_ = 0;
    }

    private void L1() {
        this.oneofIndex_ = 0;
    }

    private void M1() {
        this.options_ = GeneratedMessageLite.b0();
    }

    private void N1() {
        this.packed_ = false;
    }

    private void O1() {
        this.typeUrl_ = Field.Q1().getTypeUrl();
    }

    private void P1() {
        if(!this.options_.isModifiable()) {
            this.options_ = GeneratedMessageLite.r0(this.options_);
        }
    }

    public static Field Q1() {
        return Field.DEFAULT_INSTANCE;
    }

    public OptionOrBuilder R1(int v) {
        return (OptionOrBuilder)this.options_.get(v);
    }

    public List S1() {
        return this.options_;
    }

    public static Builder T1() {
        return (Builder)Field.DEFAULT_INSTANCE.R();
    }

    public static Builder U1(Field field0) {
        return (Builder)Field.DEFAULT_INSTANCE.S(field0);
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object V(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new Field();
            }
            case 2: {
                return new Builder(null);
            }
            case 3: {
                return GeneratedMessageLite.t0(Field.DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\u000B\n\u0000\u0001\u0000\u0001\f\u0002\f\u0003\u0004\u0004Ȉ\u0006Ȉ\u0007\u0004\b\u0007\t\u001B\nȈ\u000BȈ", new Object[]{"kind_", "cardinality_", "number_", "name_", "typeUrl_", "oneofIndex_", "packed_", "options_", Option.class, "jsonName_", "defaultValue_"});
            }
            case 4: {
                return Field.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = Field.PARSER;
                if(parser0 == null) {
                    Class class0 = Field.class;
                    synchronized(class0) {
                        parser0 = Field.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(Field.DEFAULT_INSTANCE);
                            Field.PARSER = parser0;
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

    public static Field V1(InputStream inputStream0) throws IOException {
        return (Field)GeneratedMessageLite.w0(Field.DEFAULT_INSTANCE, inputStream0);
    }

    public static Field W1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Field)GeneratedMessageLite.x0(Field.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Field X1(ByteString byteString0) throws InvalidProtocolBufferException {
        return (Field)GeneratedMessageLite.y0(Field.DEFAULT_INSTANCE, byteString0);
    }

    public static Field Y1(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Field)GeneratedMessageLite.z0(Field.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static Field Z1(CodedInputStream codedInputStream0) throws IOException {
        return (Field)GeneratedMessageLite.A0(Field.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static Field a2(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Field)GeneratedMessageLite.B0(Field.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static Field b2(InputStream inputStream0) throws IOException {
        return (Field)GeneratedMessageLite.C0(Field.DEFAULT_INSTANCE, inputStream0);
    }

    public static Field c2(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Field)GeneratedMessageLite.D0(Field.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Field d2(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (Field)GeneratedMessageLite.E0(Field.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static Field e2(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Field)GeneratedMessageLite.F0(Field.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static Field f2(byte[] arr_b) throws InvalidProtocolBufferException {
        return (Field)GeneratedMessageLite.G0(Field.DEFAULT_INSTANCE, arr_b);
    }

    public static Field g2(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Field)GeneratedMessageLite.H0(Field.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    @Override  // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public Cardinality getCardinality() {
        Cardinality field$Cardinality0 = Cardinality.a(this.cardinality_);
        return field$Cardinality0 == null ? Cardinality.f : field$Cardinality0;
    }

    @Override  // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public int getCardinalityValue() {
        return this.cardinality_;
    }

    @Override  // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public String getDefaultValue() {
        return this.defaultValue_;
    }

    @Override  // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public ByteString getDefaultValueBytes() {
        return ByteString.r(this.defaultValue_);
    }

    @Override  // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public String getJsonName() {
        return this.jsonName_;
    }

    @Override  // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public ByteString getJsonNameBytes() {
        return ByteString.r(this.jsonName_);
    }

    @Override  // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public Kind getKind() {
        Kind field$Kind0 = Kind.a(this.kind_);
        return field$Kind0 == null ? Kind.u : field$Kind0;
    }

    @Override  // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public int getKindValue() {
        return this.kind_;
    }

    @Override  // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override  // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public ByteString getNameBytes() {
        return ByteString.r(this.name_);
    }

    @Override  // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public int getNumber() {
        return this.number_;
    }

    @Override  // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public int getOneofIndex() {
        return this.oneofIndex_;
    }

    @Override  // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public Option getOptions(int v) {
        return (Option)this.options_.get(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override  // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public List getOptionsList() {
        return this.options_;
    }

    @Override  // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public boolean getPacked() {
        return this.packed_;
    }

    @Override  // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public String getTypeUrl() {
        return this.typeUrl_;
    }

    @Override  // androidx.datastore.preferences.protobuf.FieldOrBuilder
    public ByteString getTypeUrlBytes() {
        return ByteString.r(this.typeUrl_);
    }

    public static Parser h2() {
        return Field.DEFAULT_INSTANCE.getParserForType();
    }

    private void i2(int v) {
        this.P1();
        this.options_.remove(v);
    }

    private void j2(Cardinality field$Cardinality0) {
        field$Cardinality0.getClass();
        this.cardinality_ = field$Cardinality0.getNumber();
    }

    private void k2(int v) {
        this.cardinality_ = v;
    }

    private void l2(String s) {
        s.getClass();
        this.defaultValue_ = s;
    }

    private void m2(ByteString byteString0) {
        byteString0.getClass();
        AbstractMessageLite.H(byteString0);
        this.defaultValue_ = byteString0.b0();
    }

    private void n2(String s) {
        s.getClass();
        this.jsonName_ = s;
    }

    private void o2(ByteString byteString0) {
        byteString0.getClass();
        AbstractMessageLite.H(byteString0);
        this.jsonName_ = byteString0.b0();
    }

    private void p2(Kind field$Kind0) {
        field$Kind0.getClass();
        this.kind_ = field$Kind0.getNumber();
    }

    private void q2(int v) {
        this.kind_ = v;
    }

    private void r2(String s) {
        s.getClass();
        this.name_ = s;
    }

    private void s2(ByteString byteString0) {
        byteString0.getClass();
        AbstractMessageLite.H(byteString0);
        this.name_ = byteString0.b0();
    }

    private void t2(int v) {
        this.number_ = v;
    }

    private void u2(int v) {
        this.oneofIndex_ = v;
    }

    private void v2(int v, androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
        this.P1();
        this.options_.set(v, option$Builder0.Y());
    }

    private void w2(int v, Option option0) {
        option0.getClass();
        this.P1();
        this.options_.set(v, option0);
    }

    private void x2(boolean z) {
        this.packed_ = z;
    }

    private void y2(String s) {
        s.getClass();
        this.typeUrl_ = s;
    }

    private void z2(ByteString byteString0) {
        byteString0.getClass();
        AbstractMessageLite.H(byteString0);
        this.typeUrl_ = byteString0.b0();
    }
}

