package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Empty extends GeneratedMessageLite implements EmptyOrBuilder {
    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder implements EmptyOrBuilder {
        private Builder() {
            super(Empty.DEFAULT_INSTANCE);
        }

        Builder(androidx.datastore.preferences.protobuf.Empty.1 empty$10) {
        }
    }

    private static final Empty DEFAULT_INSTANCE;
    private static volatile Parser PARSER;

    static {
        Empty empty0 = new Empty();
        Empty.DEFAULT_INSTANCE = empty0;
        GeneratedMessageLite.P0(Empty.class, empty0);
    }

    public static Empty S0() {
        return Empty.DEFAULT_INSTANCE;
    }

    public static Builder T0() {
        return (Builder)Empty.DEFAULT_INSTANCE.R();
    }

    public static Builder U0(Empty empty0) {
        return (Builder)Empty.DEFAULT_INSTANCE.S(empty0);
    }

    @Override  // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    protected final Object V(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
        switch(generatedMessageLite$MethodToInvoke0) {
            case 1: {
                return new Empty();
            }
            case 2: {
                return new Builder(null);
            }
            case 3: {
                return GeneratedMessageLite.t0(Empty.DEFAULT_INSTANCE, "\u0000\u0000", null);
            }
            case 4: {
                return Empty.DEFAULT_INSTANCE;
            }
            case 5: {
                Parser parser0 = Empty.PARSER;
                if(parser0 == null) {
                    Class class0 = Empty.class;
                    synchronized(class0) {
                        parser0 = Empty.PARSER;
                        if(parser0 == null) {
                            parser0 = new DefaultInstanceBasedParser(Empty.DEFAULT_INSTANCE);
                            Empty.PARSER = parser0;
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

    public static Empty V0(InputStream inputStream0) throws IOException {
        return (Empty)GeneratedMessageLite.w0(Empty.DEFAULT_INSTANCE, inputStream0);
    }

    public static Empty W0(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Empty)GeneratedMessageLite.x0(Empty.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Empty X0(ByteString byteString0) throws InvalidProtocolBufferException {
        return (Empty)GeneratedMessageLite.y0(Empty.DEFAULT_INSTANCE, byteString0);
    }

    public static Empty Y0(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Empty)GeneratedMessageLite.z0(Empty.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
    }

    public static Empty Z0(CodedInputStream codedInputStream0) throws IOException {
        return (Empty)GeneratedMessageLite.A0(Empty.DEFAULT_INSTANCE, codedInputStream0);
    }

    public static Empty a1(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Empty)GeneratedMessageLite.B0(Empty.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
    }

    public static Empty b1(InputStream inputStream0) throws IOException {
        return (Empty)GeneratedMessageLite.C0(Empty.DEFAULT_INSTANCE, inputStream0);
    }

    public static Empty c1(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        return (Empty)GeneratedMessageLite.D0(Empty.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
    }

    public static Empty d1(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
        return (Empty)GeneratedMessageLite.E0(Empty.DEFAULT_INSTANCE, byteBuffer0);
    }

    public static Empty e1(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Empty)GeneratedMessageLite.F0(Empty.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
    }

    public static Empty f1(byte[] arr_b) throws InvalidProtocolBufferException {
        return (Empty)GeneratedMessageLite.G0(Empty.DEFAULT_INSTANCE, arr_b);
    }

    public static Empty g1(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
        return (Empty)GeneratedMessageLite.H0(Empty.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
    }

    public static Parser h1() {
        return Empty.DEFAULT_INSTANCE.getParserForType();
    }
}

