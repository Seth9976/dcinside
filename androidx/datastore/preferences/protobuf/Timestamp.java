package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Timestamp extends GeneratedMessageLite implements TimestampOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements TimestampOrBuilder {
        private Builder() {
            super(Timestamp.DEFAULT_INSTANCE);
        }

        Builder(androidx.datastore.preferences.protobuf.Timestamp.1 timestamp$10) {
        }

        @Override  // androidx.datastore.preferences.protobuf.TimestampOrBuilder
        public int getNanos() {
            return ((Timestamp)this.b).getNanos();
        }

        @Override  // androidx.datastore.preferences.protobuf.TimestampOrBuilder
        public long getSeconds() {
            return ((Timestamp)this.b).getSeconds();
        }

        public Builder k0() {
            this.c0();
            ((Timestamp)this.b).W0();
            return this;
        }

        public Builder l0() {
            this.c0();
            ((Timestamp)this.b).X0();
            return this;
        }

        public Builder m0(int v) {
            this.c0();
            ((Timestamp)this.b).p1(v);
            return this;
        }

        public Builder n0(long v) {
            this.c0();
            ((Timestamp)this.b).q1(v);
            return this;
        }
    }

    private static final Timestamp DEFAULT_INSTANCE = null;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile Parser PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    static {
        Timestamp timestamp0 = new Timestamp();
        Timestamp.DEFAULT_INSTANCE = timestamp0;
        GeneratedMessageLite.P0(Timestamp.class, timestamp0);
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object V(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new Timestamp();
            }
            case 2: {
                return new Builder(null);
            }
            case 3: {
                return GeneratedMessageLite.t0(Timestamp.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            }
            case 4: {
                return Timestamp.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = Timestamp.PARSER;
                if(parser0 == null) {
                    Class class0 = Timestamp.class;
                    synchronized(class0) {
                        parser0 = Timestamp.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(Timestamp.DEFAULT_INSTANCE);
                            Timestamp.PARSER = parser0;
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

    private void W0() {
        this.nanos_ = 0;
    }

    private void X0() {
        this.seconds_ = 0L;
    }

    public static Timestamp Y0() {
        return Timestamp.DEFAULT_INSTANCE;
    }

    public static Builder Z0() {
        return (Builder)Timestamp.DEFAULT_INSTANCE.R();
    }

    public static Builder a1(Timestamp timestamp0) {
        return (Builder)Timestamp.DEFAULT_INSTANCE.S(timestamp0);
    }

    public static Timestamp b1(InputStream inputStream0) throws IOException {
        return (Timestamp)GeneratedMessageLite.w0(Timestamp.DEFAULT_INSTANCE, inputStream0);
    }

    public static Timestamp c1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Timestamp)GeneratedMessageLite.x0(Timestamp.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Timestamp d1(ByteString byteString0) throws InvalidProtocolBufferException {
        return (Timestamp)GeneratedMessageLite.y0(Timestamp.DEFAULT_INSTANCE, byteString0);
    }

    public static Timestamp e1(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Timestamp)GeneratedMessageLite.z0(Timestamp.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static Timestamp f1(CodedInputStream codedInputStream0) throws IOException {
        return (Timestamp)GeneratedMessageLite.A0(Timestamp.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static Timestamp g1(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Timestamp)GeneratedMessageLite.B0(Timestamp.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    @Override  // androidx.datastore.preferences.protobuf.TimestampOrBuilder
    public int getNanos() {
        return this.nanos_;
    }

    @Override  // androidx.datastore.preferences.protobuf.TimestampOrBuilder
    public long getSeconds() {
        return this.seconds_;
    }

    public static Timestamp h1(InputStream inputStream0) throws IOException {
        return (Timestamp)GeneratedMessageLite.C0(Timestamp.DEFAULT_INSTANCE, inputStream0);
    }

    public static Timestamp i1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Timestamp)GeneratedMessageLite.D0(Timestamp.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Timestamp j1(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (Timestamp)GeneratedMessageLite.E0(Timestamp.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static Timestamp k1(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Timestamp)GeneratedMessageLite.F0(Timestamp.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static Timestamp m1(byte[] arr_b) throws InvalidProtocolBufferException {
        return (Timestamp)GeneratedMessageLite.G0(Timestamp.DEFAULT_INSTANCE, arr_b);
    }

    public static Timestamp n1(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Timestamp)GeneratedMessageLite.H0(Timestamp.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser o1() {
        return Timestamp.DEFAULT_INSTANCE.getParserForType();
    }

    private void p1(int v) {
        this.nanos_ = v;
    }

    private void q1(long v) {
        this.seconds_ = v;
    }
}

