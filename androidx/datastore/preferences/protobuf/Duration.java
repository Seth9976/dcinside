package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Duration extends GeneratedMessageLite implements DurationOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements DurationOrBuilder {
        private Builder() {
            super(Duration.DEFAULT_INSTANCE);
        }

        Builder(androidx.datastore.preferences.protobuf.Duration.1 duration$10) {
        }

        @Override  // androidx.datastore.preferences.protobuf.DurationOrBuilder
        public int getNanos() {
            return ((Duration)this.b).getNanos();
        }

        @Override  // androidx.datastore.preferences.protobuf.DurationOrBuilder
        public long getSeconds() {
            return ((Duration)this.b).getSeconds();
        }

        public Builder k0() {
            this.c0();
            ((Duration)this.b).W0();
            return this;
        }

        public Builder l0() {
            this.c0();
            ((Duration)this.b).X0();
            return this;
        }

        public Builder m0(int v) {
            this.c0();
            ((Duration)this.b).p1(v);
            return this;
        }

        public Builder n0(long v) {
            this.c0();
            ((Duration)this.b).q1(v);
            return this;
        }
    }

    private static final Duration DEFAULT_INSTANCE = null;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile Parser PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    static {
        Duration duration0 = new Duration();
        Duration.DEFAULT_INSTANCE = duration0;
        GeneratedMessageLite.P0(Duration.class, duration0);
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object V(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new Duration();
            }
            case 2: {
                return new Builder(null);
            }
            case 3: {
                return GeneratedMessageLite.t0(Duration.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            }
            case 4: {
                return Duration.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = Duration.PARSER;
                if(parser0 == null) {
                    Class class0 = Duration.class;
                    synchronized(class0) {
                        parser0 = Duration.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(Duration.DEFAULT_INSTANCE);
                            Duration.PARSER = parser0;
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

    public static Duration Y0() {
        return Duration.DEFAULT_INSTANCE;
    }

    public static Builder Z0() {
        return (Builder)Duration.DEFAULT_INSTANCE.R();
    }

    public static Builder a1(Duration duration0) {
        return (Builder)Duration.DEFAULT_INSTANCE.S(duration0);
    }

    public static Duration b1(InputStream inputStream0) throws IOException {
        return (Duration)GeneratedMessageLite.w0(Duration.DEFAULT_INSTANCE, inputStream0);
    }

    public static Duration c1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Duration)GeneratedMessageLite.x0(Duration.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Duration d1(ByteString byteString0) throws InvalidProtocolBufferException {
        return (Duration)GeneratedMessageLite.y0(Duration.DEFAULT_INSTANCE, byteString0);
    }

    public static Duration e1(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Duration)GeneratedMessageLite.z0(Duration.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static Duration f1(CodedInputStream codedInputStream0) throws IOException {
        return (Duration)GeneratedMessageLite.A0(Duration.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static Duration g1(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Duration)GeneratedMessageLite.B0(Duration.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    @Override  // androidx.datastore.preferences.protobuf.DurationOrBuilder
    public int getNanos() {
        return this.nanos_;
    }

    @Override  // androidx.datastore.preferences.protobuf.DurationOrBuilder
    public long getSeconds() {
        return this.seconds_;
    }

    public static Duration h1(InputStream inputStream0) throws IOException {
        return (Duration)GeneratedMessageLite.C0(Duration.DEFAULT_INSTANCE, inputStream0);
    }

    public static Duration i1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Duration)GeneratedMessageLite.D0(Duration.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Duration j1(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (Duration)GeneratedMessageLite.E0(Duration.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static Duration k1(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Duration)GeneratedMessageLite.F0(Duration.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static Duration m1(byte[] arr_b) throws InvalidProtocolBufferException {
        return (Duration)GeneratedMessageLite.G0(Duration.DEFAULT_INSTANCE, arr_b);
    }

    public static Duration n1(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Duration)GeneratedMessageLite.H0(Duration.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser o1() {
        return Duration.DEFAULT_INSTANCE.getParserForType();
    }

    private void p1(int v) {
        this.nanos_ = v;
    }

    private void q1(long v) {
        this.seconds_ = v;
    }
}

