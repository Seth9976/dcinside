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

public final class InitializationCompletedEventRequestOuterClass {
    public static final class InitializationCompletedEventRequest extends GeneratedMessageLite implements InitializationCompletedEventRequestOrBuilder {
        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements InitializationCompletedEventRequestOrBuilder {
            private Builder() {
                super(InitializationCompletedEventRequest.DEFAULT_INSTANCE);
            }

            Builder(a initializationCompletedEventRequestOuterClass$a0) {
            }

            public Builder clearDynamicDeviceInfo() {
                this.copyOnWrite();
                ((InitializationCompletedEventRequest)this.instance).clearDynamicDeviceInfo();
                return this;
            }

            public Builder clearStaticDeviceInfo() {
                this.copyOnWrite();
                ((InitializationCompletedEventRequest)this.instance).clearStaticDeviceInfo();
                return this;
            }

            @Override  // gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequestOrBuilder
            public DynamicDeviceInfo getDynamicDeviceInfo() {
                return ((InitializationCompletedEventRequest)this.instance).getDynamicDeviceInfo();
            }

            @Override  // gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequestOrBuilder
            public StaticDeviceInfo getStaticDeviceInfo() {
                return ((InitializationCompletedEventRequest)this.instance).getStaticDeviceInfo();
            }

            @Override  // gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequestOrBuilder
            public boolean hasDynamicDeviceInfo() {
                return ((InitializationCompletedEventRequest)this.instance).hasDynamicDeviceInfo();
            }

            @Override  // gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequestOrBuilder
            public boolean hasStaticDeviceInfo() {
                return ((InitializationCompletedEventRequest)this.instance).hasStaticDeviceInfo();
            }

            public Builder mergeDynamicDeviceInfo(DynamicDeviceInfo dynamicDeviceInfoOuterClass$DynamicDeviceInfo0) {
                this.copyOnWrite();
                ((InitializationCompletedEventRequest)this.instance).mergeDynamicDeviceInfo(dynamicDeviceInfoOuterClass$DynamicDeviceInfo0);
                return this;
            }

            public Builder mergeStaticDeviceInfo(StaticDeviceInfo staticDeviceInfoOuterClass$StaticDeviceInfo0) {
                this.copyOnWrite();
                ((InitializationCompletedEventRequest)this.instance).mergeStaticDeviceInfo(staticDeviceInfoOuterClass$StaticDeviceInfo0);
                return this;
            }

            public Builder setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder0) {
                this.copyOnWrite();
                ((InitializationCompletedEventRequest)this.instance).setDynamicDeviceInfo(((DynamicDeviceInfo)dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder0.build()));
                return this;
            }

            public Builder setDynamicDeviceInfo(DynamicDeviceInfo dynamicDeviceInfoOuterClass$DynamicDeviceInfo0) {
                this.copyOnWrite();
                ((InitializationCompletedEventRequest)this.instance).setDynamicDeviceInfo(dynamicDeviceInfoOuterClass$DynamicDeviceInfo0);
                return this;
            }

            public Builder setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder staticDeviceInfoOuterClass$StaticDeviceInfo$Builder0) {
                this.copyOnWrite();
                ((InitializationCompletedEventRequest)this.instance).setStaticDeviceInfo(((StaticDeviceInfo)staticDeviceInfoOuterClass$StaticDeviceInfo$Builder0.build()));
                return this;
            }

            public Builder setStaticDeviceInfo(StaticDeviceInfo staticDeviceInfoOuterClass$StaticDeviceInfo0) {
                this.copyOnWrite();
                ((InitializationCompletedEventRequest)this.instance).setStaticDeviceInfo(staticDeviceInfoOuterClass$StaticDeviceInfo0);
                return this;
            }
        }

        private static final InitializationCompletedEventRequest DEFAULT_INSTANCE = null;
        public static final int DYNAMIC_DEVICE_INFO_FIELD_NUMBER = 2;
        private static volatile Parser PARSER = null;
        public static final int STATIC_DEVICE_INFO_FIELD_NUMBER = 1;
        private int bitField0_;
        private DynamicDeviceInfo dynamicDeviceInfo_;
        private StaticDeviceInfo staticDeviceInfo_;

        static {
            InitializationCompletedEventRequest initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest0 = new InitializationCompletedEventRequest();
            InitializationCompletedEventRequest.DEFAULT_INSTANCE = initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest0;
            GeneratedMessageLite.registerDefaultInstance(InitializationCompletedEventRequest.class, initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest0);
        }

        private void clearDynamicDeviceInfo() {
            this.dynamicDeviceInfo_ = null;
            this.bitField0_ &= -3;
        }

        private void clearStaticDeviceInfo() {
            this.staticDeviceInfo_ = null;
            this.bitField0_ &= -2;
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new InitializationCompletedEventRequest();
                }
                case 2: {
                    return new Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(InitializationCompletedEventRequest.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "staticDeviceInfo_", "dynamicDeviceInfo_"});
                }
                case 4: {
                    return InitializationCompletedEventRequest.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = InitializationCompletedEventRequest.PARSER;
                    if(parser0 == null) {
                        Class class0 = InitializationCompletedEventRequest.class;
                        synchronized(class0) {
                            parser0 = InitializationCompletedEventRequest.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(InitializationCompletedEventRequest.DEFAULT_INSTANCE);
                                InitializationCompletedEventRequest.PARSER = parser0;
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

        public static InitializationCompletedEventRequest getDefaultInstance() {
            return InitializationCompletedEventRequest.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequestOrBuilder
        public DynamicDeviceInfo getDynamicDeviceInfo() {
            return this.dynamicDeviceInfo_ == null ? DynamicDeviceInfo.getDefaultInstance() : this.dynamicDeviceInfo_;
        }

        @Override  // gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequestOrBuilder
        public StaticDeviceInfo getStaticDeviceInfo() {
            return this.staticDeviceInfo_ == null ? StaticDeviceInfo.getDefaultInstance() : this.staticDeviceInfo_;
        }

        @Override  // gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequestOrBuilder
        public boolean hasDynamicDeviceInfo() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override  // gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass$InitializationCompletedEventRequestOrBuilder
        public boolean hasStaticDeviceInfo() {
            return (this.bitField0_ & 1) != 0;
        }

        private void mergeDynamicDeviceInfo(DynamicDeviceInfo dynamicDeviceInfoOuterClass$DynamicDeviceInfo0) {
            dynamicDeviceInfoOuterClass$DynamicDeviceInfo0.getClass();
            this.dynamicDeviceInfo_ = this.dynamicDeviceInfo_ == null || this.dynamicDeviceInfo_ == DynamicDeviceInfo.getDefaultInstance() ? dynamicDeviceInfoOuterClass$DynamicDeviceInfo0 : ((DynamicDeviceInfo)((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder)DynamicDeviceInfo.newBuilder(this.dynamicDeviceInfo_).mergeFrom(dynamicDeviceInfoOuterClass$DynamicDeviceInfo0)).buildPartial());
            this.bitField0_ |= 2;
        }

        private void mergeStaticDeviceInfo(StaticDeviceInfo staticDeviceInfoOuterClass$StaticDeviceInfo0) {
            staticDeviceInfoOuterClass$StaticDeviceInfo0.getClass();
            this.staticDeviceInfo_ = this.staticDeviceInfo_ == null || this.staticDeviceInfo_ == StaticDeviceInfo.getDefaultInstance() ? staticDeviceInfoOuterClass$StaticDeviceInfo0 : ((StaticDeviceInfo)((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder)StaticDeviceInfo.newBuilder(this.staticDeviceInfo_).mergeFrom(staticDeviceInfoOuterClass$StaticDeviceInfo0)).buildPartial());
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder)InitializationCompletedEventRequest.DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(InitializationCompletedEventRequest initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest0) {
            return (Builder)InitializationCompletedEventRequest.DEFAULT_INSTANCE.createBuilder(initializationCompletedEventRequestOuterClass$InitializationCompletedEventRequest0);
        }

        public static InitializationCompletedEventRequest parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (InitializationCompletedEventRequest)GeneratedMessageLite.parseDelimitedFrom(InitializationCompletedEventRequest.DEFAULT_INSTANCE, inputStream0);
        }

        public static InitializationCompletedEventRequest parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (InitializationCompletedEventRequest)GeneratedMessageLite.parseDelimitedFrom(InitializationCompletedEventRequest.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static InitializationCompletedEventRequest parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (InitializationCompletedEventRequest)GeneratedMessageLite.parseFrom(InitializationCompletedEventRequest.DEFAULT_INSTANCE, byteString0);
        }

        public static InitializationCompletedEventRequest parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (InitializationCompletedEventRequest)GeneratedMessageLite.parseFrom(InitializationCompletedEventRequest.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static InitializationCompletedEventRequest parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (InitializationCompletedEventRequest)GeneratedMessageLite.parseFrom(InitializationCompletedEventRequest.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static InitializationCompletedEventRequest parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (InitializationCompletedEventRequest)GeneratedMessageLite.parseFrom(InitializationCompletedEventRequest.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static InitializationCompletedEventRequest parseFrom(InputStream inputStream0) throws IOException {
            return (InitializationCompletedEventRequest)GeneratedMessageLite.parseFrom(InitializationCompletedEventRequest.DEFAULT_INSTANCE, inputStream0);
        }

        public static InitializationCompletedEventRequest parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (InitializationCompletedEventRequest)GeneratedMessageLite.parseFrom(InitializationCompletedEventRequest.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static InitializationCompletedEventRequest parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (InitializationCompletedEventRequest)GeneratedMessageLite.parseFrom(InitializationCompletedEventRequest.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static InitializationCompletedEventRequest parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (InitializationCompletedEventRequest)GeneratedMessageLite.parseFrom(InitializationCompletedEventRequest.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static InitializationCompletedEventRequest parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (InitializationCompletedEventRequest)GeneratedMessageLite.parseFrom(InitializationCompletedEventRequest.DEFAULT_INSTANCE, arr_b);
        }

        public static InitializationCompletedEventRequest parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (InitializationCompletedEventRequest)GeneratedMessageLite.parseFrom(InitializationCompletedEventRequest.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return InitializationCompletedEventRequest.DEFAULT_INSTANCE.getParserForType();
        }

        private void setDynamicDeviceInfo(DynamicDeviceInfo dynamicDeviceInfoOuterClass$DynamicDeviceInfo0) {
            dynamicDeviceInfoOuterClass$DynamicDeviceInfo0.getClass();
            this.dynamicDeviceInfo_ = dynamicDeviceInfoOuterClass$DynamicDeviceInfo0;
            this.bitField0_ |= 2;
        }

        private void setStaticDeviceInfo(StaticDeviceInfo staticDeviceInfoOuterClass$StaticDeviceInfo0) {
            staticDeviceInfoOuterClass$StaticDeviceInfo0.getClass();
            this.staticDeviceInfo_ = staticDeviceInfoOuterClass$StaticDeviceInfo0;
            this.bitField0_ |= 1;
        }
    }

    public interface InitializationCompletedEventRequestOrBuilder extends MessageLiteOrBuilder {
        DynamicDeviceInfo getDynamicDeviceInfo();

        StaticDeviceInfo getStaticDeviceInfo();

        boolean hasDynamicDeviceInfo();

        boolean hasStaticDeviceInfo();
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

