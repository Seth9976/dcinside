package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class SourceContext extends GeneratedMessageLite implements SourceContextOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements SourceContextOrBuilder {
        private Builder() {
            super(SourceContext.DEFAULT_INSTANCE);
        }

        Builder(androidx.datastore.preferences.protobuf.SourceContext.1 sourceContext$10) {
        }

        @Override  // androidx.datastore.preferences.protobuf.SourceContextOrBuilder
        public String getFileName() {
            return ((SourceContext)this.b).getFileName();
        }

        @Override  // androidx.datastore.preferences.protobuf.SourceContextOrBuilder
        public ByteString getFileNameBytes() {
            return ((SourceContext)this.b).getFileNameBytes();
        }

        public Builder k0() {
            this.c0();
            ((SourceContext)this.b).V0();
            return this;
        }

        public Builder l0(String s) {
            this.c0();
            ((SourceContext)this.b).n1(s);
            return this;
        }

        public Builder m0(ByteString byteString0) {
            this.c0();
            ((SourceContext)this.b).o1(byteString0);
            return this;
        }
    }

    private static final SourceContext DEFAULT_INSTANCE = null;
    public static final int FILE_NAME_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    private String fileName_;

    static {
        SourceContext sourceContext0 = new SourceContext();
        SourceContext.DEFAULT_INSTANCE = sourceContext0;
        GeneratedMessageLite.P0(SourceContext.class, sourceContext0);
    }

    private SourceContext() {
        this.fileName_ = "";
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object V(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new SourceContext();
            }
            case 2: {
                return new Builder(null);
            }
            case 3: {
                return GeneratedMessageLite.t0(SourceContext.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"fileName_"});
            }
            case 4: {
                return SourceContext.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = SourceContext.PARSER;
                if(parser0 == null) {
                    Class class0 = SourceContext.class;
                    synchronized(class0) {
                        parser0 = SourceContext.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(SourceContext.DEFAULT_INSTANCE);
                            SourceContext.PARSER = parser0;
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

    private void V0() {
        this.fileName_ = "";
    }

    public static SourceContext W0() {
        return SourceContext.DEFAULT_INSTANCE;
    }

    public static Builder X0() {
        return (Builder)SourceContext.DEFAULT_INSTANCE.R();
    }

    public static Builder Y0(SourceContext sourceContext0) {
        return (Builder)SourceContext.DEFAULT_INSTANCE.S(sourceContext0);
    }

    public static SourceContext Z0(InputStream inputStream0) throws IOException {
        return (SourceContext)GeneratedMessageLite.w0(SourceContext.DEFAULT_INSTANCE, inputStream0);
    }

    public static SourceContext a1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (SourceContext)GeneratedMessageLite.x0(SourceContext.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static SourceContext b1(ByteString byteString0) throws InvalidProtocolBufferException {
        return (SourceContext)GeneratedMessageLite.y0(SourceContext.DEFAULT_INSTANCE, byteString0);
    }

    public static SourceContext c1(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (SourceContext)GeneratedMessageLite.z0(SourceContext.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static SourceContext d1(CodedInputStream codedInputStream0) throws IOException {
        return (SourceContext)GeneratedMessageLite.A0(SourceContext.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static SourceContext e1(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (SourceContext)GeneratedMessageLite.B0(SourceContext.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static SourceContext f1(InputStream inputStream0) throws IOException {
        return (SourceContext)GeneratedMessageLite.C0(SourceContext.DEFAULT_INSTANCE, inputStream0);
    }

    public static SourceContext g1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (SourceContext)GeneratedMessageLite.D0(SourceContext.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    @Override  // androidx.datastore.preferences.protobuf.SourceContextOrBuilder
    public String getFileName() {
        return this.fileName_;
    }

    @Override  // androidx.datastore.preferences.protobuf.SourceContextOrBuilder
    public ByteString getFileNameBytes() {
        return ByteString.r(this.fileName_);
    }

    public static SourceContext h1(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (SourceContext)GeneratedMessageLite.E0(SourceContext.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static SourceContext i1(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (SourceContext)GeneratedMessageLite.F0(SourceContext.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static SourceContext j1(byte[] arr_b) throws InvalidProtocolBufferException {
        return (SourceContext)GeneratedMessageLite.G0(SourceContext.DEFAULT_INSTANCE, arr_b);
    }

    public static SourceContext k1(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (SourceContext)GeneratedMessageLite.H0(SourceContext.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser m1() {
        return SourceContext.DEFAULT_INSTANCE.getParserForType();
    }

    private void n1(String s) {
        s.getClass();
        this.fileName_ = s;
    }

    private void o1(ByteString byteString0) {
        byteString0.getClass();
        AbstractMessageLite.H(byteString0);
        this.fileName_ = byteString0.b0();
    }
}

