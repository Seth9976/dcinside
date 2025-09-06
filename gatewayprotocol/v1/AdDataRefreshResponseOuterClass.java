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

public final class AdDataRefreshResponseOuterClass {
    public static final class AdDataRefreshResponse extends GeneratedMessageLite implements AdDataRefreshResponseOrBuilder {
        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements AdDataRefreshResponseOrBuilder {
            private Builder() {
                super(AdDataRefreshResponse.DEFAULT_INSTANCE);
            }

            Builder(a adDataRefreshResponseOuterClass$a0) {
            }

            public Builder clearAdData() {
                this.copyOnWrite();
                ((AdDataRefreshResponse)this.instance).clearAdData();
                return this;
            }

            public Builder clearAdDataRefreshToken() {
                this.copyOnWrite();
                ((AdDataRefreshResponse)this.instance).clearAdDataRefreshToken();
                return this;
            }

            public Builder clearAdDataVersion() {
                this.copyOnWrite();
                ((AdDataRefreshResponse)this.instance).clearAdDataVersion();
                return this;
            }

            public Builder clearError() {
                this.copyOnWrite();
                ((AdDataRefreshResponse)this.instance).clearError();
                return this;
            }

            public Builder clearTrackingToken() {
                this.copyOnWrite();
                ((AdDataRefreshResponse)this.instance).clearTrackingToken();
                return this;
            }

            @Override  // gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponseOrBuilder
            public ByteString getAdData() {
                return ((AdDataRefreshResponse)this.instance).getAdData();
            }

            @Override  // gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponseOrBuilder
            public ByteString getAdDataRefreshToken() {
                return ((AdDataRefreshResponse)this.instance).getAdDataRefreshToken();
            }

            @Override  // gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponseOrBuilder
            public int getAdDataVersion() {
                return ((AdDataRefreshResponse)this.instance).getAdDataVersion();
            }

            @Override  // gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponseOrBuilder
            public Error getError() {
                return ((AdDataRefreshResponse)this.instance).getError();
            }

            @Override  // gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponseOrBuilder
            public ByteString getTrackingToken() {
                return ((AdDataRefreshResponse)this.instance).getTrackingToken();
            }

            @Override  // gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponseOrBuilder
            public boolean hasError() {
                return ((AdDataRefreshResponse)this.instance).hasError();
            }

            public Builder mergeError(Error errorOuterClass$Error0) {
                this.copyOnWrite();
                ((AdDataRefreshResponse)this.instance).mergeError(errorOuterClass$Error0);
                return this;
            }

            public Builder setAdData(ByteString byteString0) {
                this.copyOnWrite();
                ((AdDataRefreshResponse)this.instance).setAdData(byteString0);
                return this;
            }

            public Builder setAdDataRefreshToken(ByteString byteString0) {
                this.copyOnWrite();
                ((AdDataRefreshResponse)this.instance).setAdDataRefreshToken(byteString0);
                return this;
            }

            public Builder setAdDataVersion(int v) {
                this.copyOnWrite();
                ((AdDataRefreshResponse)this.instance).setAdDataVersion(v);
                return this;
            }

            public Builder setError(gatewayprotocol.v1.ErrorOuterClass.Error.Builder errorOuterClass$Error$Builder0) {
                this.copyOnWrite();
                ((AdDataRefreshResponse)this.instance).setError(((Error)errorOuterClass$Error$Builder0.build()));
                return this;
            }

            public Builder setError(Error errorOuterClass$Error0) {
                this.copyOnWrite();
                ((AdDataRefreshResponse)this.instance).setError(errorOuterClass$Error0);
                return this;
            }

            public Builder setTrackingToken(ByteString byteString0) {
                this.copyOnWrite();
                ((AdDataRefreshResponse)this.instance).setTrackingToken(byteString0);
                return this;
            }
        }

        public static final int AD_DATA_FIELD_NUMBER = 1;
        public static final int AD_DATA_REFRESH_TOKEN_FIELD_NUMBER = 4;
        public static final int AD_DATA_VERSION_FIELD_NUMBER = 2;
        private static final AdDataRefreshResponse DEFAULT_INSTANCE = null;
        public static final int ERROR_FIELD_NUMBER = 5;
        private static volatile Parser PARSER = null;
        public static final int TRACKING_TOKEN_FIELD_NUMBER = 3;
        private ByteString adDataRefreshToken_;
        private int adDataVersion_;
        private ByteString adData_;
        private int bitField0_;
        private Error error_;
        private ByteString trackingToken_;

        static {
            AdDataRefreshResponse adDataRefreshResponseOuterClass$AdDataRefreshResponse0 = new AdDataRefreshResponse();
            AdDataRefreshResponse.DEFAULT_INSTANCE = adDataRefreshResponseOuterClass$AdDataRefreshResponse0;
            GeneratedMessageLite.registerDefaultInstance(AdDataRefreshResponse.class, adDataRefreshResponseOuterClass$AdDataRefreshResponse0);
        }

        private AdDataRefreshResponse() {
            this.adData_ = ByteString.EMPTY;
            this.trackingToken_ = ByteString.EMPTY;
            this.adDataRefreshToken_ = ByteString.EMPTY;
        }

        private void clearAdData() {
            this.adData_ = AdDataRefreshResponse.getDefaultInstance().getAdData();
        }

        private void clearAdDataRefreshToken() {
            this.adDataRefreshToken_ = AdDataRefreshResponse.getDefaultInstance().getAdDataRefreshToken();
        }

        private void clearAdDataVersion() {
            this.adDataVersion_ = 0;
        }

        private void clearError() {
            this.error_ = null;
            this.bitField0_ &= -2;
        }

        private void clearTrackingToken() {
            this.trackingToken_ = AdDataRefreshResponse.getDefaultInstance().getTrackingToken();
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new AdDataRefreshResponse();
                }
                case 2: {
                    return new Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(AdDataRefreshResponse.DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\n\u0002\u0004\u0003\n\u0004\n\u0005ဉ\u0000", new Object[]{"bitField0_", "adData_", "adDataVersion_", "trackingToken_", "adDataRefreshToken_", "error_"});
                }
                case 4: {
                    return AdDataRefreshResponse.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = AdDataRefreshResponse.PARSER;
                    if(parser0 == null) {
                        Class class0 = AdDataRefreshResponse.class;
                        synchronized(class0) {
                            parser0 = AdDataRefreshResponse.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(AdDataRefreshResponse.DEFAULT_INSTANCE);
                                AdDataRefreshResponse.PARSER = parser0;
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

        @Override  // gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponseOrBuilder
        public ByteString getAdData() {
            return this.adData_;
        }

        @Override  // gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponseOrBuilder
        public ByteString getAdDataRefreshToken() {
            return this.adDataRefreshToken_;
        }

        @Override  // gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponseOrBuilder
        public int getAdDataVersion() {
            return this.adDataVersion_;
        }

        public static AdDataRefreshResponse getDefaultInstance() {
            return AdDataRefreshResponse.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponseOrBuilder
        public Error getError() {
            return this.error_ == null ? Error.getDefaultInstance() : this.error_;
        }

        @Override  // gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponseOrBuilder
        public ByteString getTrackingToken() {
            return this.trackingToken_;
        }

        @Override  // gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponseOrBuilder
        public boolean hasError() {
            return (this.bitField0_ & 1) != 0;
        }

        private void mergeError(Error errorOuterClass$Error0) {
            errorOuterClass$Error0.getClass();
            this.error_ = this.error_ == null || this.error_ == Error.getDefaultInstance() ? errorOuterClass$Error0 : ((Error)((gatewayprotocol.v1.ErrorOuterClass.Error.Builder)Error.newBuilder(this.error_).mergeFrom(errorOuterClass$Error0)).buildPartial());
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder)AdDataRefreshResponse.DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(AdDataRefreshResponse adDataRefreshResponseOuterClass$AdDataRefreshResponse0) {
            return (Builder)AdDataRefreshResponse.DEFAULT_INSTANCE.createBuilder(adDataRefreshResponseOuterClass$AdDataRefreshResponse0);
        }

        public static AdDataRefreshResponse parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (AdDataRefreshResponse)GeneratedMessageLite.parseDelimitedFrom(AdDataRefreshResponse.DEFAULT_INSTANCE, inputStream0);
        }

        public static AdDataRefreshResponse parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (AdDataRefreshResponse)GeneratedMessageLite.parseDelimitedFrom(AdDataRefreshResponse.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static AdDataRefreshResponse parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (AdDataRefreshResponse)GeneratedMessageLite.parseFrom(AdDataRefreshResponse.DEFAULT_INSTANCE, byteString0);
        }

        public static AdDataRefreshResponse parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (AdDataRefreshResponse)GeneratedMessageLite.parseFrom(AdDataRefreshResponse.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static AdDataRefreshResponse parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (AdDataRefreshResponse)GeneratedMessageLite.parseFrom(AdDataRefreshResponse.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static AdDataRefreshResponse parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (AdDataRefreshResponse)GeneratedMessageLite.parseFrom(AdDataRefreshResponse.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static AdDataRefreshResponse parseFrom(InputStream inputStream0) throws IOException {
            return (AdDataRefreshResponse)GeneratedMessageLite.parseFrom(AdDataRefreshResponse.DEFAULT_INSTANCE, inputStream0);
        }

        public static AdDataRefreshResponse parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (AdDataRefreshResponse)GeneratedMessageLite.parseFrom(AdDataRefreshResponse.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static AdDataRefreshResponse parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (AdDataRefreshResponse)GeneratedMessageLite.parseFrom(AdDataRefreshResponse.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static AdDataRefreshResponse parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (AdDataRefreshResponse)GeneratedMessageLite.parseFrom(AdDataRefreshResponse.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static AdDataRefreshResponse parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (AdDataRefreshResponse)GeneratedMessageLite.parseFrom(AdDataRefreshResponse.DEFAULT_INSTANCE, arr_b);
        }

        public static AdDataRefreshResponse parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (AdDataRefreshResponse)GeneratedMessageLite.parseFrom(AdDataRefreshResponse.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return AdDataRefreshResponse.DEFAULT_INSTANCE.getParserForType();
        }

        private void setAdData(ByteString byteString0) {
            byteString0.getClass();
            this.adData_ = byteString0;
        }

        private void setAdDataRefreshToken(ByteString byteString0) {
            byteString0.getClass();
            this.adDataRefreshToken_ = byteString0;
        }

        private void setAdDataVersion(int v) {
            this.adDataVersion_ = v;
        }

        private void setError(Error errorOuterClass$Error0) {
            errorOuterClass$Error0.getClass();
            this.error_ = errorOuterClass$Error0;
            this.bitField0_ |= 1;
        }

        private void setTrackingToken(ByteString byteString0) {
            byteString0.getClass();
            this.trackingToken_ = byteString0;
        }
    }

    public interface AdDataRefreshResponseOrBuilder extends MessageLiteOrBuilder {
        ByteString getAdData();

        ByteString getAdDataRefreshToken();

        int getAdDataVersion();

        Error getError();

        ByteString getTrackingToken();

        boolean hasError();
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

