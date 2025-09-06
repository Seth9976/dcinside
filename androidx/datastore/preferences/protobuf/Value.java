package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Value extends GeneratedMessageLite implements ValueOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements ValueOrBuilder {
        private Builder() {
            super(Value.DEFAULT_INSTANCE);
        }

        Builder(androidx.datastore.preferences.protobuf.Value.1 value$10) {
        }

        public Builder A0(ByteString byteString0) {
            this.c0();
            ((Value)this.b).S1(byteString0);
            return this;
        }

        public Builder B0(androidx.datastore.preferences.protobuf.Struct.Builder struct$Builder0) {
            this.c0();
            ((Value)this.b).T1(struct$Builder0);
            return this;
        }

        public Builder C0(Struct struct0) {
            this.c0();
            ((Value)this.b).U1(struct0);
            return this;
        }

        @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public boolean getBoolValue() {
            return ((Value)this.b).getBoolValue();
        }

        @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public KindCase getKindCase() {
            return ((Value)this.b).getKindCase();
        }

        @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public ListValue getListValue() {
            return ((Value)this.b).getListValue();
        }

        @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public NullValue getNullValue() {
            return ((Value)this.b).getNullValue();
        }

        @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public int getNullValueValue() {
            return ((Value)this.b).getNullValueValue();
        }

        @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public double getNumberValue() {
            return ((Value)this.b).getNumberValue();
        }

        @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public String getStringValue() {
            return ((Value)this.b).getStringValue();
        }

        @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public ByteString getStringValueBytes() {
            return ((Value)this.b).getStringValueBytes();
        }

        @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public Struct getStructValue() {
            return ((Value)this.b).getStructValue();
        }

        @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public boolean hasListValue() {
            return ((Value)this.b).hasListValue();
        }

        @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
        public boolean hasStructValue() {
            return ((Value)this.b).hasStructValue();
        }

        public Builder k0() {
            this.c0();
            ((Value)this.b).m1();
            return this;
        }

        public Builder l0() {
            this.c0();
            ((Value)this.b).n1();
            return this;
        }

        public Builder m0() {
            this.c0();
            ((Value)this.b).o1();
            return this;
        }

        public Builder n0() {
            this.c0();
            ((Value)this.b).p1();
            return this;
        }

        public Builder o0() {
            this.c0();
            ((Value)this.b).q1();
            return this;
        }

        public Builder p0() {
            this.c0();
            ((Value)this.b).r1();
            return this;
        }

        public Builder q0() {
            this.c0();
            ((Value)this.b).s1();
            return this;
        }

        public Builder r0(ListValue listValue0) {
            this.c0();
            ((Value)this.b).u1(listValue0);
            return this;
        }

        public Builder s0(Struct struct0) {
            this.c0();
            ((Value)this.b).v1(struct0);
            return this;
        }

        public Builder t0(boolean z) {
            this.c0();
            ((Value)this.b).L1(z);
            return this;
        }

        public Builder u0(androidx.datastore.preferences.protobuf.ListValue.Builder listValue$Builder0) {
            this.c0();
            ((Value)this.b).M1(listValue$Builder0);
            return this;
        }

        public Builder v0(ListValue listValue0) {
            this.c0();
            ((Value)this.b).N1(listValue0);
            return this;
        }

        public Builder w0(NullValue nullValue0) {
            this.c0();
            ((Value)this.b).O1(nullValue0);
            return this;
        }

        public Builder x0(int v) {
            this.c0();
            ((Value)this.b).P1(v);
            return this;
        }

        public Builder y0(double f) {
            this.c0();
            ((Value)this.b).Q1(f);
            return this;
        }

        public Builder z0(String s) {
            this.c0();
            ((Value)this.b).R1(s);
            return this;
        }
    }

    public static enum KindCase {
        NULL_VALUE(1),
        NUMBER_VALUE(2),
        STRING_VALUE(3),
        BOOL_VALUE(4),
        STRUCT_VALUE(5),
        LIST_VALUE(6),
        KIND_NOT_SET(0);

        private final int a;

        private KindCase(int v1) {
            this.a = v1;
        }

        public static KindCase a(int v) {
            switch(v) {
                case 0: {
                    return KindCase.h;
                }
                case 1: {
                    return KindCase.b;
                }
                case 2: {
                    return KindCase.c;
                }
                case 3: {
                    return KindCase.d;
                }
                case 4: {
                    return KindCase.e;
                }
                case 5: {
                    return KindCase.f;
                }
                case 6: {
                    return KindCase.g;
                }
                default: {
                    return null;
                }
            }
        }

        @Deprecated
        public static KindCase b(int v) {
            return KindCase.a(v);
        }

        public int getNumber() {
            return this.a;
        }
    }

    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    private static final Value DEFAULT_INSTANCE = null;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    private static volatile Parser PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    private int kindCase_;
    private Object kind_;

    static {
        Value value0 = new Value();
        Value.DEFAULT_INSTANCE = value0;
        GeneratedMessageLite.P0(Value.class, value0);
    }

    private Value() {
        this.kindCase_ = 0;
    }

    public static Value A1(ByteString byteString0) throws InvalidProtocolBufferException {
        return (Value)GeneratedMessageLite.y0(Value.DEFAULT_INSTANCE, byteString0);
    }

    public static Value B1(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Value)GeneratedMessageLite.z0(Value.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static Value C1(CodedInputStream codedInputStream0) throws IOException {
        return (Value)GeneratedMessageLite.A0(Value.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static Value D1(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Value)GeneratedMessageLite.B0(Value.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static Value E1(InputStream inputStream0) throws IOException {
        return (Value)GeneratedMessageLite.C0(Value.DEFAULT_INSTANCE, inputStream0);
    }

    public static Value F1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Value)GeneratedMessageLite.D0(Value.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Value G1(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (Value)GeneratedMessageLite.E0(Value.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static Value H1(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Value)GeneratedMessageLite.F0(Value.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static Value I1(byte[] arr_b) throws InvalidProtocolBufferException {
        return (Value)GeneratedMessageLite.G0(Value.DEFAULT_INSTANCE, arr_b);
    }

    public static Value J1(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Value)GeneratedMessageLite.H0(Value.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser K1() {
        return Value.DEFAULT_INSTANCE.getParserForType();
    }

    private void L1(boolean z) {
        this.kindCase_ = 4;
        this.kind_ = Boolean.valueOf(z);
    }

    private void M1(androidx.datastore.preferences.protobuf.ListValue.Builder listValue$Builder0) {
        this.kind_ = listValue$Builder0.Y();
        this.kindCase_ = 6;
    }

    private void N1(ListValue listValue0) {
        listValue0.getClass();
        this.kind_ = listValue0;
        this.kindCase_ = 6;
    }

    private void O1(NullValue nullValue0) {
        nullValue0.getClass();
        this.kindCase_ = 1;
        this.kind_ = nullValue0.getNumber();
    }

    private void P1(int v) {
        this.kindCase_ = 1;
        this.kind_ = v;
    }

    private void Q1(double f) {
        this.kindCase_ = 2;
        this.kind_ = f;
    }

    private void R1(String s) {
        s.getClass();
        this.kindCase_ = 3;
        this.kind_ = s;
    }

    private void S1(ByteString byteString0) {
        byteString0.getClass();
        AbstractMessageLite.H(byteString0);
        this.kindCase_ = 3;
        this.kind_ = byteString0.b0();
    }

    private void T1(androidx.datastore.preferences.protobuf.Struct.Builder struct$Builder0) {
        this.kind_ = struct$Builder0.Y();
        this.kindCase_ = 5;
    }

    private void U1(Struct struct0) {
        struct0.getClass();
        this.kind_ = struct0;
        this.kindCase_ = 5;
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object V(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new Value();
            }
            case 2: {
                return new Builder(null);
            }
            case 3: {
                return GeneratedMessageLite.t0(Value.DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"kind_", "kindCase_", Struct.class, ListValue.class});
            }
            case 4: {
                return Value.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = Value.PARSER;
                if(parser0 == null) {
                    Class class0 = Value.class;
                    synchronized(class0) {
                        parser0 = Value.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(Value.DEFAULT_INSTANCE);
                            Value.PARSER = parser0;
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

    @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public boolean getBoolValue() {
        return this.kindCase_ == 4 ? ((Boolean)this.kind_).booleanValue() : false;
    }

    @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public KindCase getKindCase() {
        return KindCase.a(this.kindCase_);
    }

    @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public ListValue getListValue() {
        return this.kindCase_ == 6 ? ((ListValue)this.kind_) : ListValue.i1();
    }

    @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public NullValue getNullValue() {
        if(this.kindCase_ == 1) {
            NullValue nullValue0 = NullValue.a(((int)(((Integer)this.kind_))));
            return nullValue0 == null ? NullValue.c : nullValue0;
        }
        return NullValue.b;
    }

    @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public int getNullValueValue() {
        return this.kindCase_ == 1 ? ((int)(((Integer)this.kind_))) : 0;
    }

    @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public double getNumberValue() {
        return this.kindCase_ == 2 ? ((double)(((Double)this.kind_))) : 0.0;
    }

    @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public String getStringValue() {
        return this.kindCase_ == 3 ? ((String)this.kind_) : "";
    }

    @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public ByteString getStringValueBytes() {
        return this.kindCase_ == 3 ? ByteString.r(((String)this.kind_)) : ByteString.r("");
    }

    @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public Struct getStructValue() {
        return this.kindCase_ == 5 ? ((Struct)this.kind_) : Struct.T0();
    }

    @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public boolean hasListValue() {
        return this.kindCase_ == 6;
    }

    @Override  // androidx.datastore.preferences.protobuf.ValueOrBuilder
    public boolean hasStructValue() {
        return this.kindCase_ == 5;
    }

    private void m1() {
        if(this.kindCase_ == 4) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    private void n1() {
        this.kindCase_ = 0;
        this.kind_ = null;
    }

    private void o1() {
        if(this.kindCase_ == 6) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    private void p1() {
        if(this.kindCase_ == 1) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    private void q1() {
        if(this.kindCase_ == 2) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    private void r1() {
        if(this.kindCase_ == 3) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    private void s1() {
        if(this.kindCase_ == 5) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    public static Value t1() {
        return Value.DEFAULT_INSTANCE;
    }

    private void u1(ListValue listValue0) {
        listValue0.getClass();
        this.kind_ = this.kindCase_ != 6 || this.kind_ == ListValue.i1() ? listValue0 : ((androidx.datastore.preferences.protobuf.ListValue.Builder)ListValue.n1(((ListValue)this.kind_)).g0(listValue0)).Z();
        this.kindCase_ = 6;
    }

    private void v1(Struct struct0) {
        struct0.getClass();
        this.kind_ = this.kindCase_ != 5 || this.kind_ == Struct.T0() ? struct0 : ((androidx.datastore.preferences.protobuf.Struct.Builder)Struct.Y0(((Struct)this.kind_)).g0(struct0)).Z();
        this.kindCase_ = 5;
    }

    public static Builder w1() {
        return (Builder)Value.DEFAULT_INSTANCE.R();
    }

    public static Builder x1(Value value0) {
        return (Builder)Value.DEFAULT_INSTANCE.S(value0);
    }

    public static Value y1(InputStream inputStream0) throws IOException {
        return (Value)GeneratedMessageLite.w0(Value.DEFAULT_INSTANCE, inputStream0);
    }

    public static Value z1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Value)GeneratedMessageLite.x0(Value.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }
}

