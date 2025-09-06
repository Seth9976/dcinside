package androidx.datastore.preferences.protobuf;

import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class EnumValue extends GeneratedMessageLite implements EnumValueOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements EnumValueOrBuilder {
        private Builder() {
            super(EnumValue.DEFAULT_INSTANCE);
        }

        Builder(androidx.datastore.preferences.protobuf.EnumValue.1 enumValue$10) {
        }

        @Override  // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
        public String getName() {
            return ((EnumValue)this.b).getName();
        }

        @Override  // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
        public ByteString getNameBytes() {
            return ((EnumValue)this.b).getNameBytes();
        }

        @Override  // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
        public int getNumber() {
            return ((EnumValue)this.b).getNumber();
        }

        @Override  // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
        public Option getOptions(int v) {
            return ((EnumValue)this.b).getOptions(v);
        }

        @Override  // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
        public int getOptionsCount() {
            return ((EnumValue)this.b).getOptionsCount();
        }

        @Override  // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
        public List getOptionsList() {
            return DesugarCollections.unmodifiableList(((EnumValue)this.b).getOptionsList());
        }

        public Builder k0(Iterable iterable0) {
            this.c0();
            ((EnumValue)this.b).g1(iterable0);
            return this;
        }

        public Builder l0(int v, androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
            this.c0();
            ((EnumValue)this.b).h1(v, option$Builder0);
            return this;
        }

        public Builder m0(int v, Option option0) {
            this.c0();
            ((EnumValue)this.b).i1(v, option0);
            return this;
        }

        public Builder n0(androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
            this.c0();
            ((EnumValue)this.b).j1(option$Builder0);
            return this;
        }

        public Builder o0(Option option0) {
            this.c0();
            ((EnumValue)this.b).k1(option0);
            return this;
        }

        public Builder p0() {
            this.c0();
            ((EnumValue)this.b).m1();
            return this;
        }

        public Builder q0() {
            this.c0();
            ((EnumValue)this.b).n1();
            return this;
        }

        public Builder r0() {
            this.c0();
            ((EnumValue)this.b).o1();
            return this;
        }

        public Builder s0(int v) {
            this.c0();
            ((EnumValue)this.b).I1(v);
            return this;
        }

        public Builder t0(String s) {
            this.c0();
            ((EnumValue)this.b).J1(s);
            return this;
        }

        public Builder u0(ByteString byteString0) {
            this.c0();
            ((EnumValue)this.b).K1(byteString0);
            return this;
        }

        public Builder v0(int v) {
            this.c0();
            ((EnumValue)this.b).L1(v);
            return this;
        }

        public Builder w0(int v, androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
            this.c0();
            ((EnumValue)this.b).M1(v, option$Builder0);
            return this;
        }

        public Builder x0(int v, Option option0) {
            this.c0();
            ((EnumValue)this.b).N1(v, option0);
            return this;
        }
    }

    private static final EnumValue DEFAULT_INSTANCE = null;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile Parser PARSER;
    private String name_;
    private int number_;
    private ProtobufList options_;

    static {
        EnumValue enumValue0 = new EnumValue();
        EnumValue.DEFAULT_INSTANCE = enumValue0;
        GeneratedMessageLite.P0(EnumValue.class, enumValue0);
    }

    private EnumValue() {
        this.name_ = "";
        this.options_ = GeneratedMessageLite.b0();
    }

    public static EnumValue A1(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (EnumValue)GeneratedMessageLite.B0(EnumValue.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static EnumValue B1(InputStream inputStream0) throws IOException {
        return (EnumValue)GeneratedMessageLite.C0(EnumValue.DEFAULT_INSTANCE, inputStream0);
    }

    public static EnumValue C1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (EnumValue)GeneratedMessageLite.D0(EnumValue.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static EnumValue D1(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (EnumValue)GeneratedMessageLite.E0(EnumValue.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static EnumValue E1(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (EnumValue)GeneratedMessageLite.F0(EnumValue.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static EnumValue F1(byte[] arr_b) throws InvalidProtocolBufferException {
        return (EnumValue)GeneratedMessageLite.G0(EnumValue.DEFAULT_INSTANCE, arr_b);
    }

    public static EnumValue G1(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (EnumValue)GeneratedMessageLite.H0(EnumValue.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser H1() {
        return EnumValue.DEFAULT_INSTANCE.getParserForType();
    }

    private void I1(int v) {
        this.p1();
        this.options_.remove(v);
    }

    private void J1(String s) {
        s.getClass();
        this.name_ = s;
    }

    private void K1(ByteString byteString0) {
        byteString0.getClass();
        AbstractMessageLite.H(byteString0);
        this.name_ = byteString0.b0();
    }

    private void L1(int v) {
        this.number_ = v;
    }

    private void M1(int v, androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
        this.p1();
        this.options_.set(v, option$Builder0.Y());
    }

    private void N1(int v, Option option0) {
        option0.getClass();
        this.p1();
        this.options_.set(v, option0);
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object V(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new EnumValue();
            }
            case 2: {
                return new Builder(null);
            }
            case 3: {
                return GeneratedMessageLite.t0(EnumValue.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u001B", new Object[]{"name_", "number_", "options_", Option.class});
            }
            case 4: {
                return EnumValue.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = EnumValue.PARSER;
                if(parser0 == null) {
                    Class class0 = EnumValue.class;
                    synchronized(class0) {
                        parser0 = EnumValue.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(EnumValue.DEFAULT_INSTANCE);
                            EnumValue.PARSER = parser0;
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

    private void g1(Iterable iterable0) {
        this.p1();
        AbstractMessageLite.G(iterable0, this.options_);
    }

    @Override  // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override  // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
    public ByteString getNameBytes() {
        return ByteString.r(this.name_);
    }

    @Override  // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
    public int getNumber() {
        return this.number_;
    }

    @Override  // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
    public Option getOptions(int v) {
        return (Option)this.options_.get(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override  // androidx.datastore.preferences.protobuf.EnumValueOrBuilder
    public List getOptionsList() {
        return this.options_;
    }

    private void h1(int v, androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
        this.p1();
        this.options_.add(v, option$Builder0.Y());
    }

    private void i1(int v, Option option0) {
        option0.getClass();
        this.p1();
        this.options_.add(v, option0);
    }

    private void j1(androidx.datastore.preferences.protobuf.Option.Builder option$Builder0) {
        this.p1();
        this.options_.add(option$Builder0.Y());
    }

    private void k1(Option option0) {
        option0.getClass();
        this.p1();
        this.options_.add(option0);
    }

    private void m1() {
        this.name_ = EnumValue.q1().getName();
    }

    private void n1() {
        this.number_ = 0;
    }

    private void o1() {
        this.options_ = GeneratedMessageLite.b0();
    }

    private void p1() {
        if(!this.options_.isModifiable()) {
            this.options_ = GeneratedMessageLite.r0(this.options_);
        }
    }

    public static EnumValue q1() {
        return EnumValue.DEFAULT_INSTANCE;
    }

    public OptionOrBuilder r1(int v) {
        return (OptionOrBuilder)this.options_.get(v);
    }

    public List s1() {
        return this.options_;
    }

    public static Builder t1() {
        return (Builder)EnumValue.DEFAULT_INSTANCE.R();
    }

    public static Builder u1(EnumValue enumValue0) {
        return (Builder)EnumValue.DEFAULT_INSTANCE.S(enumValue0);
    }

    public static EnumValue v1(InputStream inputStream0) throws IOException {
        return (EnumValue)GeneratedMessageLite.w0(EnumValue.DEFAULT_INSTANCE, inputStream0);
    }

    public static EnumValue w1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (EnumValue)GeneratedMessageLite.x0(EnumValue.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static EnumValue x1(ByteString byteString0) throws InvalidProtocolBufferException {
        return (EnumValue)GeneratedMessageLite.y0(EnumValue.DEFAULT_INSTANCE, byteString0);
    }

    public static EnumValue y1(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (EnumValue)GeneratedMessageLite.z0(EnumValue.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static EnumValue z1(CodedInputStream codedInputStream0) throws IOException {
        return (EnumValue)GeneratedMessageLite.A0(EnumValue.DEFAULT_INSTANCE, codedInputStream0);
    }
}

