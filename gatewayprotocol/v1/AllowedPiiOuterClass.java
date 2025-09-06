package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class AllowedPiiOuterClass {
    public static final class AllowedPii extends GeneratedMessageLite implements AllowedPiiOrBuilder {
        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements AllowedPiiOrBuilder {
            private Builder() {
                super(AllowedPii.DEFAULT_INSTANCE);
            }

            Builder(a allowedPiiOuterClass$a0) {
            }

            public Builder clearIdfa() {
                this.copyOnWrite();
                ((AllowedPii)this.instance).clearIdfa();
                return this;
            }

            public Builder clearIdfv() {
                this.copyOnWrite();
                ((AllowedPii)this.instance).clearIdfv();
                return this;
            }

            @Override  // gatewayprotocol.v1.AllowedPiiOuterClass$AllowedPiiOrBuilder
            public boolean getIdfa() {
                return ((AllowedPii)this.instance).getIdfa();
            }

            @Override  // gatewayprotocol.v1.AllowedPiiOuterClass$AllowedPiiOrBuilder
            public boolean getIdfv() {
                return ((AllowedPii)this.instance).getIdfv();
            }

            public Builder setIdfa(boolean z) {
                this.copyOnWrite();
                ((AllowedPii)this.instance).setIdfa(z);
                return this;
            }

            public Builder setIdfv(boolean z) {
                this.copyOnWrite();
                ((AllowedPii)this.instance).setIdfv(z);
                return this;
            }
        }

        private static final AllowedPii DEFAULT_INSTANCE = null;
        public static final int IDFA_FIELD_NUMBER = 1;
        public static final int IDFV_FIELD_NUMBER = 2;
        private static volatile Parser PARSER;
        private boolean idfa_;
        private boolean idfv_;

        static {
            AllowedPii allowedPiiOuterClass$AllowedPii0 = new AllowedPii();
            AllowedPii.DEFAULT_INSTANCE = allowedPiiOuterClass$AllowedPii0;
            GeneratedMessageLite.registerDefaultInstance(AllowedPii.class, allowedPiiOuterClass$AllowedPii0);
        }

        private void clearIdfa() {
            this.idfa_ = false;
        }

        private void clearIdfv() {
            this.idfv_ = false;
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new AllowedPii();
                }
                case 2: {
                    return new Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(AllowedPii.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"idfa_", "idfv_"});
                }
                case 4: {
                    return AllowedPii.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = AllowedPii.PARSER;
                    if(parser0 == null) {
                        Class class0 = AllowedPii.class;
                        synchronized(class0) {
                            parser0 = AllowedPii.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(AllowedPii.DEFAULT_INSTANCE);
                                AllowedPii.PARSER = parser0;
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

        public static AllowedPii getDefaultInstance() {
            return AllowedPii.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.AllowedPiiOuterClass$AllowedPiiOrBuilder
        public boolean getIdfa() {
            return this.idfa_;
        }

        @Override  // gatewayprotocol.v1.AllowedPiiOuterClass$AllowedPiiOrBuilder
        public boolean getIdfv() {
            return this.idfv_;
        }

        public static Builder newBuilder() {
            return (Builder)AllowedPii.DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(AllowedPii allowedPiiOuterClass$AllowedPii0) {
            return (Builder)AllowedPii.DEFAULT_INSTANCE.createBuilder(allowedPiiOuterClass$AllowedPii0);
        }

        public static AllowedPii parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (AllowedPii)GeneratedMessageLite.parseDelimitedFrom(AllowedPii.DEFAULT_INSTANCE, inputStream0);
        }

        public static AllowedPii parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (AllowedPii)GeneratedMessageLite.parseDelimitedFrom(AllowedPii.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static AllowedPii parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (AllowedPii)GeneratedMessageLite.parseFrom(AllowedPii.DEFAULT_INSTANCE, byteString0);
        }

        public static AllowedPii parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (AllowedPii)GeneratedMessageLite.parseFrom(AllowedPii.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static AllowedPii parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (AllowedPii)GeneratedMessageLite.parseFrom(AllowedPii.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static AllowedPii parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (AllowedPii)GeneratedMessageLite.parseFrom(AllowedPii.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static AllowedPii parseFrom(InputStream inputStream0) throws IOException {
            return (AllowedPii)GeneratedMessageLite.parseFrom(AllowedPii.DEFAULT_INSTANCE, inputStream0);
        }

        public static AllowedPii parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (AllowedPii)GeneratedMessageLite.parseFrom(AllowedPii.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static AllowedPii parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (AllowedPii)GeneratedMessageLite.parseFrom(AllowedPii.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static AllowedPii parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (AllowedPii)GeneratedMessageLite.parseFrom(AllowedPii.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static AllowedPii parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (AllowedPii)GeneratedMessageLite.parseFrom(AllowedPii.DEFAULT_INSTANCE, arr_b);
        }

        public static AllowedPii parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (AllowedPii)GeneratedMessageLite.parseFrom(AllowedPii.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return AllowedPii.DEFAULT_INSTANCE.getParserForType();
        }

        private void setIdfa(boolean z) {
            this.idfa_ = z;
        }

        private void setIdfv(boolean z) {
            this.idfv_ = z;
        }
    }

    public interface AllowedPiiOrBuilder extends MessageLiteOrBuilder {
        boolean getIdfa();

        boolean getIdfv();
    }

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

    static {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite0) {
    }
}

