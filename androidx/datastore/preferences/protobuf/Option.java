package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Option extends GeneratedMessageLite implements OptionOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements OptionOrBuilder {
        private Builder() {
            super(Option.DEFAULT_INSTANCE);
        }

        Builder(androidx.datastore.preferences.protobuf.Option.1 option$10) {
        }

        @Override  // androidx.datastore.preferences.protobuf.OptionOrBuilder
        public String getName() {
            return ((Option)this.b).getName();
        }

        @Override  // androidx.datastore.preferences.protobuf.OptionOrBuilder
        public ByteString getNameBytes() {
            return ((Option)this.b).getNameBytes();
        }

        @Override  // androidx.datastore.preferences.protobuf.OptionOrBuilder
        public Any getValue() {
            return ((Option)this.b).getValue();
        }

        @Override  // androidx.datastore.preferences.protobuf.OptionOrBuilder
        public boolean hasValue() {
            return ((Option)this.b).hasValue();
        }

        public Builder k0() {
            this.c0();
            ((Option)this.b).Z0();
            return this;
        }

        public Builder l0() {
            this.c0();
            ((Option)this.b).a1();
            return this;
        }

        public Builder m0(Any any0) {
            this.c0();
            ((Option)this.b).c1(any0);
            return this;
        }

        public Builder n0(String s) {
            this.c0();
            ((Option)this.b).t1(s);
            return this;
        }

        public Builder o0(ByteString byteString0) {
            this.c0();
            ((Option)this.b).u1(byteString0);
            return this;
        }

        public Builder p0(androidx.datastore.preferences.protobuf.Any.Builder any$Builder0) {
            this.c0();
            ((Option)this.b).v1(any$Builder0);
            return this;
        }

        public Builder q0(Any any0) {
            this.c0();
            ((Option)this.b).w1(any0);
            return this;
        }
    }

    private static final Option DEFAULT_INSTANCE = null;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String name_;
    private Any value_;

    static {
        Option option0 = new Option();
        Option.DEFAULT_INSTANCE = option0;
        GeneratedMessageLite.P0(Option.class, option0);
    }

    private Option() {
        this.name_ = "";
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object V(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new Option();
            }
            case 2: {
                return new Builder(null);
            }
            case 3: {
                return GeneratedMessageLite.t0(Option.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"name_", "value_"});
            }
            case 4: {
                return Option.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = Option.PARSER;
                if(parser0 == null) {
                    Class class0 = Option.class;
                    synchronized(class0) {
                        parser0 = Option.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(Option.DEFAULT_INSTANCE);
                            Option.PARSER = parser0;
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

    private void Z0() {
        this.name_ = "";
    }

    private void a1() {
        this.value_ = null;
    }

    public static Option b1() {
        return Option.DEFAULT_INSTANCE;
    }

    private void c1(Any any0) {
        any0.getClass();
        if(this.value_ != null && this.value_ != Any.Z0()) {
            this.value_ = (Any)((androidx.datastore.preferences.protobuf.Any.Builder)Any.b1(this.value_).g0(any0)).Z();
            return;
        }
        this.value_ = any0;
    }

    public static Builder d1() {
        return (Builder)Option.DEFAULT_INSTANCE.R();
    }

    public static Builder e1(Option option0) {
        return (Builder)Option.DEFAULT_INSTANCE.S(option0);
    }

    public static Option f1(InputStream inputStream0) throws IOException {
        return (Option)GeneratedMessageLite.w0(Option.DEFAULT_INSTANCE, inputStream0);
    }

    public static Option g1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Option)GeneratedMessageLite.x0(Option.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    @Override  // androidx.datastore.preferences.protobuf.OptionOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override  // androidx.datastore.preferences.protobuf.OptionOrBuilder
    public ByteString getNameBytes() {
        return ByteString.r(this.name_);
    }

    @Override  // androidx.datastore.preferences.protobuf.OptionOrBuilder
    public Any getValue() {
        return this.value_ == null ? Any.Z0() : this.value_;
    }

    public static Option h1(ByteString byteString0) throws InvalidProtocolBufferException {
        return (Option)GeneratedMessageLite.y0(Option.DEFAULT_INSTANCE, byteString0);
    }

    @Override  // androidx.datastore.preferences.protobuf.OptionOrBuilder
    public boolean hasValue() {
        return this.value_ != null;
    }

    public static Option i1(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Option)GeneratedMessageLite.z0(Option.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static Option j1(CodedInputStream codedInputStream0) throws IOException {
        return (Option)GeneratedMessageLite.A0(Option.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static Option k1(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Option)GeneratedMessageLite.B0(Option.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static Option m1(InputStream inputStream0) throws IOException {
        return (Option)GeneratedMessageLite.C0(Option.DEFAULT_INSTANCE, inputStream0);
    }

    public static Option n1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Option)GeneratedMessageLite.D0(Option.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Option o1(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (Option)GeneratedMessageLite.E0(Option.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static Option p1(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Option)GeneratedMessageLite.F0(Option.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static Option q1(byte[] arr_b) throws InvalidProtocolBufferException {
        return (Option)GeneratedMessageLite.G0(Option.DEFAULT_INSTANCE, arr_b);
    }

    public static Option r1(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Option)GeneratedMessageLite.H0(Option.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser s1() {
        return Option.DEFAULT_INSTANCE.getParserForType();
    }

    private void t1(String s) {
        s.getClass();
        this.name_ = s;
    }

    private void u1(ByteString byteString0) {
        byteString0.getClass();
        AbstractMessageLite.H(byteString0);
        this.name_ = byteString0.b0();
    }

    private void v1(androidx.datastore.preferences.protobuf.Any.Builder any$Builder0) {
        this.value_ = (Any)any$Builder0.Y();
    }

    private void w1(Any any0) {
        any0.getClass();
        this.value_ = any0;
    }
}

