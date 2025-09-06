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

public final class GetTokenEventRequestOuterClass {
    public static final class GetTokenEventRequest extends GeneratedMessageLite implements GetTokenEventRequestOrBuilder {
        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements GetTokenEventRequestOrBuilder {
            private Builder() {
                super(GetTokenEventRequest.DEFAULT_INSTANCE);
            }

            Builder(a getTokenEventRequestOuterClass$a0) {
            }

            public Builder clearBanner() {
                this.copyOnWrite();
                ((GetTokenEventRequest)this.instance).clearBanner();
                return this;
            }

            public Builder clearInterstitial() {
                this.copyOnWrite();
                ((GetTokenEventRequest)this.instance).clearInterstitial();
                return this;
            }

            public Builder clearRewarded() {
                this.copyOnWrite();
                ((GetTokenEventRequest)this.instance).clearRewarded();
                return this;
            }

            public Builder clearTokenId() {
                this.copyOnWrite();
                ((GetTokenEventRequest)this.instance).clearTokenId();
                return this;
            }

            @Override  // gatewayprotocol.v1.GetTokenEventRequestOuterClass$GetTokenEventRequestOrBuilder
            public ByteString getBanner() {
                return ((GetTokenEventRequest)this.instance).getBanner();
            }

            @Override  // gatewayprotocol.v1.GetTokenEventRequestOuterClass$GetTokenEventRequestOrBuilder
            public ByteString getInterstitial() {
                return ((GetTokenEventRequest)this.instance).getInterstitial();
            }

            @Override  // gatewayprotocol.v1.GetTokenEventRequestOuterClass$GetTokenEventRequestOrBuilder
            public ByteString getRewarded() {
                return ((GetTokenEventRequest)this.instance).getRewarded();
            }

            @Override  // gatewayprotocol.v1.GetTokenEventRequestOuterClass$GetTokenEventRequestOrBuilder
            public ByteString getTokenId() {
                return ((GetTokenEventRequest)this.instance).getTokenId();
            }

            @Override  // gatewayprotocol.v1.GetTokenEventRequestOuterClass$GetTokenEventRequestOrBuilder
            public boolean hasBanner() {
                return ((GetTokenEventRequest)this.instance).hasBanner();
            }

            @Override  // gatewayprotocol.v1.GetTokenEventRequestOuterClass$GetTokenEventRequestOrBuilder
            public boolean hasInterstitial() {
                return ((GetTokenEventRequest)this.instance).hasInterstitial();
            }

            @Override  // gatewayprotocol.v1.GetTokenEventRequestOuterClass$GetTokenEventRequestOrBuilder
            public boolean hasRewarded() {
                return ((GetTokenEventRequest)this.instance).hasRewarded();
            }

            public Builder setBanner(ByteString byteString0) {
                this.copyOnWrite();
                ((GetTokenEventRequest)this.instance).setBanner(byteString0);
                return this;
            }

            public Builder setInterstitial(ByteString byteString0) {
                this.copyOnWrite();
                ((GetTokenEventRequest)this.instance).setInterstitial(byteString0);
                return this;
            }

            public Builder setRewarded(ByteString byteString0) {
                this.copyOnWrite();
                ((GetTokenEventRequest)this.instance).setRewarded(byteString0);
                return this;
            }

            public Builder setTokenId(ByteString byteString0) {
                this.copyOnWrite();
                ((GetTokenEventRequest)this.instance).setTokenId(byteString0);
                return this;
            }
        }

        public static final int BANNER_FIELD_NUMBER = 3;
        private static final GetTokenEventRequest DEFAULT_INSTANCE = null;
        public static final int INTERSTITIAL_FIELD_NUMBER = 2;
        private static volatile Parser PARSER = null;
        public static final int REWARDED_FIELD_NUMBER = 1;
        public static final int TOKEN_ID_FIELD_NUMBER = 4;
        private ByteString banner_;
        private int bitField0_;
        private ByteString interstitial_;
        private ByteString rewarded_;
        private ByteString tokenId_;

        static {
            GetTokenEventRequest getTokenEventRequestOuterClass$GetTokenEventRequest0 = new GetTokenEventRequest();
            GetTokenEventRequest.DEFAULT_INSTANCE = getTokenEventRequestOuterClass$GetTokenEventRequest0;
            GeneratedMessageLite.registerDefaultInstance(GetTokenEventRequest.class, getTokenEventRequestOuterClass$GetTokenEventRequest0);
        }

        private GetTokenEventRequest() {
            this.rewarded_ = ByteString.EMPTY;
            this.interstitial_ = ByteString.EMPTY;
            this.banner_ = ByteString.EMPTY;
            this.tokenId_ = ByteString.EMPTY;
        }

        private void clearBanner() {
            this.bitField0_ &= -5;
            this.banner_ = GetTokenEventRequest.getDefaultInstance().getBanner();
        }

        private void clearInterstitial() {
            this.bitField0_ &= -3;
            this.interstitial_ = GetTokenEventRequest.getDefaultInstance().getInterstitial();
        }

        private void clearRewarded() {
            this.bitField0_ &= -2;
            this.rewarded_ = GetTokenEventRequest.getDefaultInstance().getRewarded();
        }

        private void clearTokenId() {
            this.tokenId_ = GetTokenEventRequest.getDefaultInstance().getTokenId();
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new GetTokenEventRequest();
                }
                case 2: {
                    return new Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(GetTokenEventRequest.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004\n", new Object[]{"bitField0_", "rewarded_", "interstitial_", "banner_", "tokenId_"});
                }
                case 4: {
                    return GetTokenEventRequest.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = GetTokenEventRequest.PARSER;
                    if(parser0 == null) {
                        Class class0 = GetTokenEventRequest.class;
                        synchronized(class0) {
                            parser0 = GetTokenEventRequest.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(GetTokenEventRequest.DEFAULT_INSTANCE);
                                GetTokenEventRequest.PARSER = parser0;
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

        @Override  // gatewayprotocol.v1.GetTokenEventRequestOuterClass$GetTokenEventRequestOrBuilder
        public ByteString getBanner() {
            return this.banner_;
        }

        public static GetTokenEventRequest getDefaultInstance() {
            return GetTokenEventRequest.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.GetTokenEventRequestOuterClass$GetTokenEventRequestOrBuilder
        public ByteString getInterstitial() {
            return this.interstitial_;
        }

        @Override  // gatewayprotocol.v1.GetTokenEventRequestOuterClass$GetTokenEventRequestOrBuilder
        public ByteString getRewarded() {
            return this.rewarded_;
        }

        @Override  // gatewayprotocol.v1.GetTokenEventRequestOuterClass$GetTokenEventRequestOrBuilder
        public ByteString getTokenId() {
            return this.tokenId_;
        }

        @Override  // gatewayprotocol.v1.GetTokenEventRequestOuterClass$GetTokenEventRequestOrBuilder
        public boolean hasBanner() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override  // gatewayprotocol.v1.GetTokenEventRequestOuterClass$GetTokenEventRequestOrBuilder
        public boolean hasInterstitial() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override  // gatewayprotocol.v1.GetTokenEventRequestOuterClass$GetTokenEventRequestOrBuilder
        public boolean hasRewarded() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder() {
            return (Builder)GetTokenEventRequest.DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(GetTokenEventRequest getTokenEventRequestOuterClass$GetTokenEventRequest0) {
            return (Builder)GetTokenEventRequest.DEFAULT_INSTANCE.createBuilder(getTokenEventRequestOuterClass$GetTokenEventRequest0);
        }

        public static GetTokenEventRequest parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (GetTokenEventRequest)GeneratedMessageLite.parseDelimitedFrom(GetTokenEventRequest.DEFAULT_INSTANCE, inputStream0);
        }

        public static GetTokenEventRequest parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (GetTokenEventRequest)GeneratedMessageLite.parseDelimitedFrom(GetTokenEventRequest.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static GetTokenEventRequest parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (GetTokenEventRequest)GeneratedMessageLite.parseFrom(GetTokenEventRequest.DEFAULT_INSTANCE, byteString0);
        }

        public static GetTokenEventRequest parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (GetTokenEventRequest)GeneratedMessageLite.parseFrom(GetTokenEventRequest.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static GetTokenEventRequest parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (GetTokenEventRequest)GeneratedMessageLite.parseFrom(GetTokenEventRequest.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static GetTokenEventRequest parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (GetTokenEventRequest)GeneratedMessageLite.parseFrom(GetTokenEventRequest.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static GetTokenEventRequest parseFrom(InputStream inputStream0) throws IOException {
            return (GetTokenEventRequest)GeneratedMessageLite.parseFrom(GetTokenEventRequest.DEFAULT_INSTANCE, inputStream0);
        }

        public static GetTokenEventRequest parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (GetTokenEventRequest)GeneratedMessageLite.parseFrom(GetTokenEventRequest.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static GetTokenEventRequest parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (GetTokenEventRequest)GeneratedMessageLite.parseFrom(GetTokenEventRequest.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static GetTokenEventRequest parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (GetTokenEventRequest)GeneratedMessageLite.parseFrom(GetTokenEventRequest.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static GetTokenEventRequest parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (GetTokenEventRequest)GeneratedMessageLite.parseFrom(GetTokenEventRequest.DEFAULT_INSTANCE, arr_b);
        }

        public static GetTokenEventRequest parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (GetTokenEventRequest)GeneratedMessageLite.parseFrom(GetTokenEventRequest.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return GetTokenEventRequest.DEFAULT_INSTANCE.getParserForType();
        }

        private void setBanner(ByteString byteString0) {
            byteString0.getClass();
            this.bitField0_ |= 4;
            this.banner_ = byteString0;
        }

        private void setInterstitial(ByteString byteString0) {
            byteString0.getClass();
            this.bitField0_ |= 2;
            this.interstitial_ = byteString0;
        }

        private void setRewarded(ByteString byteString0) {
            byteString0.getClass();
            this.bitField0_ |= 1;
            this.rewarded_ = byteString0;
        }

        private void setTokenId(ByteString byteString0) {
            byteString0.getClass();
            this.tokenId_ = byteString0;
        }
    }

    public interface GetTokenEventRequestOrBuilder extends MessageLiteOrBuilder {
        ByteString getBanner();

        ByteString getInterstitial();

        ByteString getRewarded();

        ByteString getTokenId();

        boolean hasBanner();

        boolean hasInterstitial();

        boolean hasRewarded();
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

