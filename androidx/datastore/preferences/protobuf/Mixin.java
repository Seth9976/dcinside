package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Mixin extends GeneratedMessageLite implements MixinOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements MixinOrBuilder {
        private Builder() {
            super(Mixin.DEFAULT_INSTANCE);
        }

        Builder(androidx.datastore.preferences.protobuf.Mixin.1 mixin$10) {
        }

        @Override  // androidx.datastore.preferences.protobuf.MixinOrBuilder
        public String getName() {
            return ((Mixin)this.b).getName();
        }

        @Override  // androidx.datastore.preferences.protobuf.MixinOrBuilder
        public ByteString getNameBytes() {
            return ((Mixin)this.b).getNameBytes();
        }

        @Override  // androidx.datastore.preferences.protobuf.MixinOrBuilder
        public String getRoot() {
            return ((Mixin)this.b).getRoot();
        }

        @Override  // androidx.datastore.preferences.protobuf.MixinOrBuilder
        public ByteString getRootBytes() {
            return ((Mixin)this.b).getRootBytes();
        }

        public Builder k0() {
            this.c0();
            ((Mixin)this.b).Y0();
            return this;
        }

        public Builder l0() {
            this.c0();
            ((Mixin)this.b).Z0();
            return this;
        }

        public Builder m0(String s) {
            this.c0();
            ((Mixin)this.b).r1(s);
            return this;
        }

        public Builder n0(ByteString byteString0) {
            this.c0();
            ((Mixin)this.b).s1(byteString0);
            return this;
        }

        public Builder o0(String s) {
            this.c0();
            ((Mixin)this.b).t1(s);
            return this;
        }

        public Builder p0(ByteString byteString0) {
            this.c0();
            ((Mixin)this.b).u1(byteString0);
            return this;
        }
    }

    private static final Mixin DEFAULT_INSTANCE = null;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser PARSER = null;
    public static final int ROOT_FIELD_NUMBER = 2;
    private String name_;
    private String root_;

    static {
        Mixin mixin0 = new Mixin();
        Mixin.DEFAULT_INSTANCE = mixin0;
        GeneratedMessageLite.P0(Mixin.class, mixin0);
    }

    private Mixin() {
        this.name_ = "";
        this.root_ = "";
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object V(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new Mixin();
            }
            case 2: {
                return new Builder(null);
            }
            case 3: {
                return GeneratedMessageLite.t0(Mixin.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"name_", "root_"});
            }
            case 4: {
                return Mixin.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = Mixin.PARSER;
                if(parser0 == null) {
                    Class class0 = Mixin.class;
                    synchronized(class0) {
                        parser0 = Mixin.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(Mixin.DEFAULT_INSTANCE);
                            Mixin.PARSER = parser0;
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

    private void Y0() {
        this.name_ = "";
    }

    private void Z0() {
        this.root_ = "";
    }

    public static Mixin a1() {
        return Mixin.DEFAULT_INSTANCE;
    }

    public static Builder b1() {
        return (Builder)Mixin.DEFAULT_INSTANCE.R();
    }

    public static Builder c1(Mixin mixin0) {
        return (Builder)Mixin.DEFAULT_INSTANCE.S(mixin0);
    }

    public static Mixin d1(InputStream inputStream0) throws IOException {
        return (Mixin)GeneratedMessageLite.w0(Mixin.DEFAULT_INSTANCE, inputStream0);
    }

    public static Mixin e1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Mixin)GeneratedMessageLite.x0(Mixin.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Mixin f1(ByteString byteString0) throws InvalidProtocolBufferException {
        return (Mixin)GeneratedMessageLite.y0(Mixin.DEFAULT_INSTANCE, byteString0);
    }

    public static Mixin g1(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Mixin)GeneratedMessageLite.z0(Mixin.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    @Override  // androidx.datastore.preferences.protobuf.MixinOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override  // androidx.datastore.preferences.protobuf.MixinOrBuilder
    public ByteString getNameBytes() {
        return ByteString.r(this.name_);
    }

    @Override  // androidx.datastore.preferences.protobuf.MixinOrBuilder
    public String getRoot() {
        return this.root_;
    }

    @Override  // androidx.datastore.preferences.protobuf.MixinOrBuilder
    public ByteString getRootBytes() {
        return ByteString.r(this.root_);
    }

    public static Mixin h1(CodedInputStream codedInputStream0) throws IOException {
        return (Mixin)GeneratedMessageLite.A0(Mixin.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static Mixin i1(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Mixin)GeneratedMessageLite.B0(Mixin.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static Mixin j1(InputStream inputStream0) throws IOException {
        return (Mixin)GeneratedMessageLite.C0(Mixin.DEFAULT_INSTANCE, inputStream0);
    }

    public static Mixin k1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Mixin)GeneratedMessageLite.D0(Mixin.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Mixin m1(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (Mixin)GeneratedMessageLite.E0(Mixin.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static Mixin n1(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Mixin)GeneratedMessageLite.F0(Mixin.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static Mixin o1(byte[] arr_b) throws InvalidProtocolBufferException {
        return (Mixin)GeneratedMessageLite.G0(Mixin.DEFAULT_INSTANCE, arr_b);
    }

    public static Mixin p1(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Mixin)GeneratedMessageLite.H0(Mixin.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser q1() {
        return Mixin.DEFAULT_INSTANCE.getParserForType();
    }

    private void r1(String s) {
        s.getClass();
        this.name_ = s;
    }

    private void s1(ByteString byteString0) {
        byteString0.getClass();
        AbstractMessageLite.H(byteString0);
        this.name_ = byteString0.b0();
    }

    private void t1(String s) {
        s.getClass();
        this.root_ = s;
    }

    private void u1(ByteString byteString0) {
        byteString0.getClass();
        AbstractMessageLite.H(byteString0);
        this.root_ = byteString0.b0();
    }
}

