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

public final class PrivacyUpdateResponseOuterClass {
    public static final class PrivacyUpdateResponse extends GeneratedMessageLite implements PrivacyUpdateResponseOrBuilder {
        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements PrivacyUpdateResponseOrBuilder {
            private Builder() {
                super(PrivacyUpdateResponse.DEFAULT_INSTANCE);
            }

            Builder(a privacyUpdateResponseOuterClass$a0) {
            }

            public Builder clearContent() {
                this.copyOnWrite();
                ((PrivacyUpdateResponse)this.instance).clearContent();
                return this;
            }

            public Builder clearVersion() {
                this.copyOnWrite();
                ((PrivacyUpdateResponse)this.instance).clearVersion();
                return this;
            }

            @Override  // gatewayprotocol.v1.PrivacyUpdateResponseOuterClass$PrivacyUpdateResponseOrBuilder
            public ByteString getContent() {
                return ((PrivacyUpdateResponse)this.instance).getContent();
            }

            @Override  // gatewayprotocol.v1.PrivacyUpdateResponseOuterClass$PrivacyUpdateResponseOrBuilder
            public int getVersion() {
                return ((PrivacyUpdateResponse)this.instance).getVersion();
            }

            public Builder setContent(ByteString byteString0) {
                this.copyOnWrite();
                ((PrivacyUpdateResponse)this.instance).setContent(byteString0);
                return this;
            }

            public Builder setVersion(int v) {
                this.copyOnWrite();
                ((PrivacyUpdateResponse)this.instance).setVersion(v);
                return this;
            }
        }

        public static final int CONTENT_FIELD_NUMBER = 2;
        private static final PrivacyUpdateResponse DEFAULT_INSTANCE = null;
        private static volatile Parser PARSER = null;
        public static final int VERSION_FIELD_NUMBER = 1;
        private ByteString content_;
        private int version_;

        static {
            PrivacyUpdateResponse privacyUpdateResponseOuterClass$PrivacyUpdateResponse0 = new PrivacyUpdateResponse();
            PrivacyUpdateResponse.DEFAULT_INSTANCE = privacyUpdateResponseOuterClass$PrivacyUpdateResponse0;
            GeneratedMessageLite.registerDefaultInstance(PrivacyUpdateResponse.class, privacyUpdateResponseOuterClass$PrivacyUpdateResponse0);
        }

        private PrivacyUpdateResponse() {
            this.content_ = ByteString.EMPTY;
        }

        private void clearContent() {
            this.content_ = PrivacyUpdateResponse.getDefaultInstance().getContent();
        }

        private void clearVersion() {
            this.version_ = 0;
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new PrivacyUpdateResponse();
                }
                case 2: {
                    return new Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(PrivacyUpdateResponse.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\n", new Object[]{"version_", "content_"});
                }
                case 4: {
                    return PrivacyUpdateResponse.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = PrivacyUpdateResponse.PARSER;
                    if(parser0 == null) {
                        Class class0 = PrivacyUpdateResponse.class;
                        synchronized(class0) {
                            parser0 = PrivacyUpdateResponse.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(PrivacyUpdateResponse.DEFAULT_INSTANCE);
                                PrivacyUpdateResponse.PARSER = parser0;
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

        @Override  // gatewayprotocol.v1.PrivacyUpdateResponseOuterClass$PrivacyUpdateResponseOrBuilder
        public ByteString getContent() {
            return this.content_;
        }

        public static PrivacyUpdateResponse getDefaultInstance() {
            return PrivacyUpdateResponse.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.PrivacyUpdateResponseOuterClass$PrivacyUpdateResponseOrBuilder
        public int getVersion() {
            return this.version_;
        }

        public static Builder newBuilder() {
            return (Builder)PrivacyUpdateResponse.DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(PrivacyUpdateResponse privacyUpdateResponseOuterClass$PrivacyUpdateResponse0) {
            return (Builder)PrivacyUpdateResponse.DEFAULT_INSTANCE.createBuilder(privacyUpdateResponseOuterClass$PrivacyUpdateResponse0);
        }

        public static PrivacyUpdateResponse parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (PrivacyUpdateResponse)GeneratedMessageLite.parseDelimitedFrom(PrivacyUpdateResponse.DEFAULT_INSTANCE, inputStream0);
        }

        public static PrivacyUpdateResponse parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (PrivacyUpdateResponse)GeneratedMessageLite.parseDelimitedFrom(PrivacyUpdateResponse.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static PrivacyUpdateResponse parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (PrivacyUpdateResponse)GeneratedMessageLite.parseFrom(PrivacyUpdateResponse.DEFAULT_INSTANCE, byteString0);
        }

        public static PrivacyUpdateResponse parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (PrivacyUpdateResponse)GeneratedMessageLite.parseFrom(PrivacyUpdateResponse.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static PrivacyUpdateResponse parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (PrivacyUpdateResponse)GeneratedMessageLite.parseFrom(PrivacyUpdateResponse.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static PrivacyUpdateResponse parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (PrivacyUpdateResponse)GeneratedMessageLite.parseFrom(PrivacyUpdateResponse.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static PrivacyUpdateResponse parseFrom(InputStream inputStream0) throws IOException {
            return (PrivacyUpdateResponse)GeneratedMessageLite.parseFrom(PrivacyUpdateResponse.DEFAULT_INSTANCE, inputStream0);
        }

        public static PrivacyUpdateResponse parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (PrivacyUpdateResponse)GeneratedMessageLite.parseFrom(PrivacyUpdateResponse.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static PrivacyUpdateResponse parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (PrivacyUpdateResponse)GeneratedMessageLite.parseFrom(PrivacyUpdateResponse.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static PrivacyUpdateResponse parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (PrivacyUpdateResponse)GeneratedMessageLite.parseFrom(PrivacyUpdateResponse.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static PrivacyUpdateResponse parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (PrivacyUpdateResponse)GeneratedMessageLite.parseFrom(PrivacyUpdateResponse.DEFAULT_INSTANCE, arr_b);
        }

        public static PrivacyUpdateResponse parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (PrivacyUpdateResponse)GeneratedMessageLite.parseFrom(PrivacyUpdateResponse.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return PrivacyUpdateResponse.DEFAULT_INSTANCE.getParserForType();
        }

        private void setContent(ByteString byteString0) {
            byteString0.getClass();
            this.content_ = byteString0;
        }

        private void setVersion(int v) {
            this.version_ = v;
        }
    }

    public interface PrivacyUpdateResponseOrBuilder extends MessageLiteOrBuilder {
        ByteString getContent();

        int getVersion();
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

