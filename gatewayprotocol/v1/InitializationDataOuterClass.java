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

public final class InitializationDataOuterClass {
    public static final class InitializationData extends GeneratedMessageLite implements InitializationDataOrBuilder {
        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements InitializationDataOrBuilder {
            private Builder() {
                super(InitializationData.DEFAULT_INSTANCE);
            }

            Builder(a initializationDataOuterClass$a0) {
            }

            public Builder clearInitializationRequest() {
                this.copyOnWrite();
                ((InitializationData)this.instance).clearInitializationRequest();
                return this;
            }

            public Builder clearSharedData() {
                this.copyOnWrite();
                ((InitializationData)this.instance).clearSharedData();
                return this;
            }

            @Override  // gatewayprotocol.v1.InitializationDataOuterClass$InitializationDataOrBuilder
            public InitializationRequest getInitializationRequest() {
                return ((InitializationData)this.instance).getInitializationRequest();
            }

            @Override  // gatewayprotocol.v1.InitializationDataOuterClass$InitializationDataOrBuilder
            public SharedData getSharedData() {
                return ((InitializationData)this.instance).getSharedData();
            }

            @Override  // gatewayprotocol.v1.InitializationDataOuterClass$InitializationDataOrBuilder
            public boolean hasInitializationRequest() {
                return ((InitializationData)this.instance).hasInitializationRequest();
            }

            @Override  // gatewayprotocol.v1.InitializationDataOuterClass$InitializationDataOrBuilder
            public boolean hasSharedData() {
                return ((InitializationData)this.instance).hasSharedData();
            }

            public Builder mergeInitializationRequest(InitializationRequest initializationRequestOuterClass$InitializationRequest0) {
                this.copyOnWrite();
                ((InitializationData)this.instance).mergeInitializationRequest(initializationRequestOuterClass$InitializationRequest0);
                return this;
            }

            public Builder mergeSharedData(SharedData universalRequestOuterClass$UniversalRequest$SharedData0) {
                this.copyOnWrite();
                ((InitializationData)this.instance).mergeSharedData(universalRequestOuterClass$UniversalRequest$SharedData0);
                return this;
            }

            public Builder setInitializationRequest(gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder initializationRequestOuterClass$InitializationRequest$Builder0) {
                this.copyOnWrite();
                ((InitializationData)this.instance).setInitializationRequest(((InitializationRequest)initializationRequestOuterClass$InitializationRequest$Builder0.build()));
                return this;
            }

            public Builder setInitializationRequest(InitializationRequest initializationRequestOuterClass$InitializationRequest0) {
                this.copyOnWrite();
                ((InitializationData)this.instance).setInitializationRequest(initializationRequestOuterClass$InitializationRequest0);
                return this;
            }

            public Builder setSharedData(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder universalRequestOuterClass$UniversalRequest$SharedData$Builder0) {
                this.copyOnWrite();
                ((InitializationData)this.instance).setSharedData(((SharedData)universalRequestOuterClass$UniversalRequest$SharedData$Builder0.build()));
                return this;
            }

            public Builder setSharedData(SharedData universalRequestOuterClass$UniversalRequest$SharedData0) {
                this.copyOnWrite();
                ((InitializationData)this.instance).setSharedData(universalRequestOuterClass$UniversalRequest$SharedData0);
                return this;
            }
        }

        private static final InitializationData DEFAULT_INSTANCE = null;
        public static final int INITIALIZATION_REQUEST_FIELD_NUMBER = 1;
        private static volatile Parser PARSER = null;
        public static final int SHARED_DATA_FIELD_NUMBER = 2;
        private int bitField0_;
        private InitializationRequest initializationRequest_;
        private SharedData sharedData_;

        static {
            InitializationData initializationDataOuterClass$InitializationData0 = new InitializationData();
            InitializationData.DEFAULT_INSTANCE = initializationDataOuterClass$InitializationData0;
            GeneratedMessageLite.registerDefaultInstance(InitializationData.class, initializationDataOuterClass$InitializationData0);
        }

        private void clearInitializationRequest() {
            this.initializationRequest_ = null;
            this.bitField0_ &= -2;
        }

        private void clearSharedData() {
            this.sharedData_ = null;
            this.bitField0_ &= -3;
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new InitializationData();
                }
                case 2: {
                    return new Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(InitializationData.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "initializationRequest_", "sharedData_"});
                }
                case 4: {
                    return InitializationData.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = InitializationData.PARSER;
                    if(parser0 == null) {
                        Class class0 = InitializationData.class;
                        synchronized(class0) {
                            parser0 = InitializationData.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(InitializationData.DEFAULT_INSTANCE);
                                InitializationData.PARSER = parser0;
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

        public static InitializationData getDefaultInstance() {
            return InitializationData.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.InitializationDataOuterClass$InitializationDataOrBuilder
        public InitializationRequest getInitializationRequest() {
            return this.initializationRequest_ == null ? InitializationRequest.getDefaultInstance() : this.initializationRequest_;
        }

        @Override  // gatewayprotocol.v1.InitializationDataOuterClass$InitializationDataOrBuilder
        public SharedData getSharedData() {
            return this.sharedData_ == null ? SharedData.getDefaultInstance() : this.sharedData_;
        }

        @Override  // gatewayprotocol.v1.InitializationDataOuterClass$InitializationDataOrBuilder
        public boolean hasInitializationRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override  // gatewayprotocol.v1.InitializationDataOuterClass$InitializationDataOrBuilder
        public boolean hasSharedData() {
            return (this.bitField0_ & 2) != 0;
        }

        private void mergeInitializationRequest(InitializationRequest initializationRequestOuterClass$InitializationRequest0) {
            initializationRequestOuterClass$InitializationRequest0.getClass();
            this.initializationRequest_ = this.initializationRequest_ == null || this.initializationRequest_ == InitializationRequest.getDefaultInstance() ? initializationRequestOuterClass$InitializationRequest0 : ((InitializationRequest)((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest.Builder)InitializationRequest.newBuilder(this.initializationRequest_).mergeFrom(initializationRequestOuterClass$InitializationRequest0)).buildPartial());
            this.bitField0_ |= 1;
        }

        private void mergeSharedData(SharedData universalRequestOuterClass$UniversalRequest$SharedData0) {
            universalRequestOuterClass$UniversalRequest$SharedData0.getClass();
            this.sharedData_ = this.sharedData_ == null || this.sharedData_ == SharedData.getDefaultInstance() ? universalRequestOuterClass$UniversalRequest$SharedData0 : ((SharedData)((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder)SharedData.newBuilder(this.sharedData_).mergeFrom(universalRequestOuterClass$UniversalRequest$SharedData0)).buildPartial());
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder)InitializationData.DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(InitializationData initializationDataOuterClass$InitializationData0) {
            return (Builder)InitializationData.DEFAULT_INSTANCE.createBuilder(initializationDataOuterClass$InitializationData0);
        }

        public static InitializationData parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (InitializationData)GeneratedMessageLite.parseDelimitedFrom(InitializationData.DEFAULT_INSTANCE, inputStream0);
        }

        public static InitializationData parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (InitializationData)GeneratedMessageLite.parseDelimitedFrom(InitializationData.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static InitializationData parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (InitializationData)GeneratedMessageLite.parseFrom(InitializationData.DEFAULT_INSTANCE, byteString0);
        }

        public static InitializationData parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (InitializationData)GeneratedMessageLite.parseFrom(InitializationData.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static InitializationData parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (InitializationData)GeneratedMessageLite.parseFrom(InitializationData.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static InitializationData parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (InitializationData)GeneratedMessageLite.parseFrom(InitializationData.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static InitializationData parseFrom(InputStream inputStream0) throws IOException {
            return (InitializationData)GeneratedMessageLite.parseFrom(InitializationData.DEFAULT_INSTANCE, inputStream0);
        }

        public static InitializationData parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (InitializationData)GeneratedMessageLite.parseFrom(InitializationData.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static InitializationData parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (InitializationData)GeneratedMessageLite.parseFrom(InitializationData.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static InitializationData parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (InitializationData)GeneratedMessageLite.parseFrom(InitializationData.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static InitializationData parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (InitializationData)GeneratedMessageLite.parseFrom(InitializationData.DEFAULT_INSTANCE, arr_b);
        }

        public static InitializationData parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (InitializationData)GeneratedMessageLite.parseFrom(InitializationData.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return InitializationData.DEFAULT_INSTANCE.getParserForType();
        }

        private void setInitializationRequest(InitializationRequest initializationRequestOuterClass$InitializationRequest0) {
            initializationRequestOuterClass$InitializationRequest0.getClass();
            this.initializationRequest_ = initializationRequestOuterClass$InitializationRequest0;
            this.bitField0_ |= 1;
        }

        private void setSharedData(SharedData universalRequestOuterClass$UniversalRequest$SharedData0) {
            universalRequestOuterClass$UniversalRequest$SharedData0.getClass();
            this.sharedData_ = universalRequestOuterClass$UniversalRequest$SharedData0;
            this.bitField0_ |= 2;
        }
    }

    public interface InitializationDataOrBuilder extends MessageLiteOrBuilder {
        InitializationRequest getInitializationRequest();

        SharedData getSharedData();

        boolean hasInitializationRequest();

        boolean hasSharedData();
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

