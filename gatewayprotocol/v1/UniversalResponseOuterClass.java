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

public final class UniversalResponseOuterClass {
    public static final class UniversalResponse extends GeneratedMessageLite implements UniversalResponseOrBuilder {
        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements UniversalResponseOrBuilder {
            private Builder() {
                super(UniversalResponse.DEFAULT_INSTANCE);
            }

            Builder(a universalResponseOuterClass$a0) {
            }

            public Builder clearError() {
                this.copyOnWrite();
                ((UniversalResponse)this.instance).clearError();
                return this;
            }

            public Builder clearMutableData() {
                this.copyOnWrite();
                ((UniversalResponse)this.instance).clearMutableData();
                return this;
            }

            public Builder clearPayload() {
                this.copyOnWrite();
                ((UniversalResponse)this.instance).clearPayload();
                return this;
            }

            @Override  // gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponseOrBuilder
            public Error getError() {
                return ((UniversalResponse)this.instance).getError();
            }

            @Override  // gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponseOrBuilder
            public MutableData getMutableData() {
                return ((UniversalResponse)this.instance).getMutableData();
            }

            @Override  // gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponseOrBuilder
            public Payload getPayload() {
                return ((UniversalResponse)this.instance).getPayload();
            }

            @Override  // gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponseOrBuilder
            public boolean hasError() {
                return ((UniversalResponse)this.instance).hasError();
            }

            @Override  // gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponseOrBuilder
            public boolean hasMutableData() {
                return ((UniversalResponse)this.instance).hasMutableData();
            }

            @Override  // gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponseOrBuilder
            public boolean hasPayload() {
                return ((UniversalResponse)this.instance).hasPayload();
            }

            public Builder mergeError(Error errorOuterClass$Error0) {
                this.copyOnWrite();
                ((UniversalResponse)this.instance).mergeError(errorOuterClass$Error0);
                return this;
            }

            public Builder mergeMutableData(MutableData mutableDataOuterClass$MutableData0) {
                this.copyOnWrite();
                ((UniversalResponse)this.instance).mergeMutableData(mutableDataOuterClass$MutableData0);
                return this;
            }

            public Builder mergePayload(Payload universalResponseOuterClass$UniversalResponse$Payload0) {
                this.copyOnWrite();
                ((UniversalResponse)this.instance).mergePayload(universalResponseOuterClass$UniversalResponse$Payload0);
                return this;
            }

            public Builder setError(gatewayprotocol.v1.ErrorOuterClass.Error.Builder errorOuterClass$Error$Builder0) {
                this.copyOnWrite();
                ((UniversalResponse)this.instance).setError(((Error)errorOuterClass$Error$Builder0.build()));
                return this;
            }

            public Builder setError(Error errorOuterClass$Error0) {
                this.copyOnWrite();
                ((UniversalResponse)this.instance).setError(errorOuterClass$Error0);
                return this;
            }

            public Builder setMutableData(gatewayprotocol.v1.MutableDataOuterClass.MutableData.Builder mutableDataOuterClass$MutableData$Builder0) {
                this.copyOnWrite();
                ((UniversalResponse)this.instance).setMutableData(((MutableData)mutableDataOuterClass$MutableData$Builder0.build()));
                return this;
            }

            public Builder setMutableData(MutableData mutableDataOuterClass$MutableData0) {
                this.copyOnWrite();
                ((UniversalResponse)this.instance).setMutableData(mutableDataOuterClass$MutableData0);
                return this;
            }

            public Builder setPayload(gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder universalResponseOuterClass$UniversalResponse$Payload$Builder0) {
                this.copyOnWrite();
                ((UniversalResponse)this.instance).setPayload(((Payload)universalResponseOuterClass$UniversalResponse$Payload$Builder0.build()));
                return this;
            }

            public Builder setPayload(Payload universalResponseOuterClass$UniversalResponse$Payload0) {
                this.copyOnWrite();
                ((UniversalResponse)this.instance).setPayload(universalResponseOuterClass$UniversalResponse$Payload0);
                return this;
            }
        }

        public static final class Payload extends GeneratedMessageLite implements PayloadOrBuilder {
            public static final class gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements PayloadOrBuilder {
                private gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder() {
                    super(Payload.DEFAULT_INSTANCE);
                }

                gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder(a universalResponseOuterClass$a0) {
                }

                public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder clearAdDataRefreshResponse() {
                    this.copyOnWrite();
                    ((Payload)this.instance).clearAdDataRefreshResponse();
                    return this;
                }

                public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder clearAdPlayerConfigResponse() {
                    this.copyOnWrite();
                    ((Payload)this.instance).clearAdPlayerConfigResponse();
                    return this;
                }

                public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder clearAdResponse() {
                    this.copyOnWrite();
                    ((Payload)this.instance).clearAdResponse();
                    return this;
                }

                public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder clearInitializationResponse() {
                    this.copyOnWrite();
                    ((Payload)this.instance).clearInitializationResponse();
                    return this;
                }

                public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder clearPrivacyUpdateResponse() {
                    this.copyOnWrite();
                    ((Payload)this.instance).clearPrivacyUpdateResponse();
                    return this;
                }

                public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder clearValue() {
                    this.copyOnWrite();
                    ((Payload)this.instance).clearValue();
                    return this;
                }

                @Override  // gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder
                public AdDataRefreshResponse getAdDataRefreshResponse() {
                    return ((Payload)this.instance).getAdDataRefreshResponse();
                }

                @Override  // gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder
                public AdPlayerConfigResponse getAdPlayerConfigResponse() {
                    return ((Payload)this.instance).getAdPlayerConfigResponse();
                }

                @Override  // gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder
                public AdResponse getAdResponse() {
                    return ((Payload)this.instance).getAdResponse();
                }

                @Override  // gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder
                public InitializationResponse getInitializationResponse() {
                    return ((Payload)this.instance).getInitializationResponse();
                }

                @Override  // gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder
                public PrivacyUpdateResponse getPrivacyUpdateResponse() {
                    return ((Payload)this.instance).getPrivacyUpdateResponse();
                }

                @Override  // gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder
                public ValueCase getValueCase() {
                    return ((Payload)this.instance).getValueCase();
                }

                @Override  // gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder
                public boolean hasAdDataRefreshResponse() {
                    return ((Payload)this.instance).hasAdDataRefreshResponse();
                }

                @Override  // gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder
                public boolean hasAdPlayerConfigResponse() {
                    return ((Payload)this.instance).hasAdPlayerConfigResponse();
                }

                @Override  // gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder
                public boolean hasAdResponse() {
                    return ((Payload)this.instance).hasAdResponse();
                }

                @Override  // gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder
                public boolean hasInitializationResponse() {
                    return ((Payload)this.instance).hasInitializationResponse();
                }

                @Override  // gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder
                public boolean hasPrivacyUpdateResponse() {
                    return ((Payload)this.instance).hasPrivacyUpdateResponse();
                }

                public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder mergeAdDataRefreshResponse(AdDataRefreshResponse adDataRefreshResponseOuterClass$AdDataRefreshResponse0) {
                    this.copyOnWrite();
                    ((Payload)this.instance).mergeAdDataRefreshResponse(adDataRefreshResponseOuterClass$AdDataRefreshResponse0);
                    return this;
                }

                public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder mergeAdPlayerConfigResponse(AdPlayerConfigResponse adPlayerConfigResponseOuterClass$AdPlayerConfigResponse0) {
                    this.copyOnWrite();
                    ((Payload)this.instance).mergeAdPlayerConfigResponse(adPlayerConfigResponseOuterClass$AdPlayerConfigResponse0);
                    return this;
                }

                public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder mergeAdResponse(AdResponse adResponseOuterClass$AdResponse0) {
                    this.copyOnWrite();
                    ((Payload)this.instance).mergeAdResponse(adResponseOuterClass$AdResponse0);
                    return this;
                }

                public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder mergeInitializationResponse(InitializationResponse initializationResponseOuterClass$InitializationResponse0) {
                    this.copyOnWrite();
                    ((Payload)this.instance).mergeInitializationResponse(initializationResponseOuterClass$InitializationResponse0);
                    return this;
                }

                public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder mergePrivacyUpdateResponse(PrivacyUpdateResponse privacyUpdateResponseOuterClass$PrivacyUpdateResponse0) {
                    this.copyOnWrite();
                    ((Payload)this.instance).mergePrivacyUpdateResponse(privacyUpdateResponseOuterClass$PrivacyUpdateResponse0);
                    return this;
                }

                public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder setAdDataRefreshResponse(gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder adDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder0) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setAdDataRefreshResponse(((AdDataRefreshResponse)adDataRefreshResponseOuterClass$AdDataRefreshResponse$Builder0.build()));
                    return this;
                }

                public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder setAdDataRefreshResponse(AdDataRefreshResponse adDataRefreshResponseOuterClass$AdDataRefreshResponse0) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setAdDataRefreshResponse(adDataRefreshResponseOuterClass$AdDataRefreshResponse0);
                    return this;
                }

                public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder setAdPlayerConfigResponse(gatewayprotocol.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.Builder adPlayerConfigResponseOuterClass$AdPlayerConfigResponse$Builder0) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setAdPlayerConfigResponse(((AdPlayerConfigResponse)adPlayerConfigResponseOuterClass$AdPlayerConfigResponse$Builder0.build()));
                    return this;
                }

                public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder setAdPlayerConfigResponse(AdPlayerConfigResponse adPlayerConfigResponseOuterClass$AdPlayerConfigResponse0) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setAdPlayerConfigResponse(adPlayerConfigResponseOuterClass$AdPlayerConfigResponse0);
                    return this;
                }

                public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder setAdResponse(gatewayprotocol.v1.AdResponseOuterClass.AdResponse.Builder adResponseOuterClass$AdResponse$Builder0) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setAdResponse(((AdResponse)adResponseOuterClass$AdResponse$Builder0.build()));
                    return this;
                }

                public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder setAdResponse(AdResponse adResponseOuterClass$AdResponse0) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setAdResponse(adResponseOuterClass$AdResponse0);
                    return this;
                }

                public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder setInitializationResponse(gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder initializationResponseOuterClass$InitializationResponse$Builder0) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setInitializationResponse(((InitializationResponse)initializationResponseOuterClass$InitializationResponse$Builder0.build()));
                    return this;
                }

                public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder setInitializationResponse(InitializationResponse initializationResponseOuterClass$InitializationResponse0) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setInitializationResponse(initializationResponseOuterClass$InitializationResponse0);
                    return this;
                }

                public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder setPrivacyUpdateResponse(gatewayprotocol.v1.PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.Builder privacyUpdateResponseOuterClass$PrivacyUpdateResponse$Builder0) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setPrivacyUpdateResponse(((PrivacyUpdateResponse)privacyUpdateResponseOuterClass$PrivacyUpdateResponse$Builder0.build()));
                    return this;
                }

                public gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder setPrivacyUpdateResponse(PrivacyUpdateResponse privacyUpdateResponseOuterClass$PrivacyUpdateResponse0) {
                    this.copyOnWrite();
                    ((Payload)this.instance).setPrivacyUpdateResponse(privacyUpdateResponseOuterClass$PrivacyUpdateResponse0);
                    return this;
                }
            }

            public static enum ValueCase {
                INITIALIZATION_RESPONSE(1),
                AD_RESPONSE(2),
                AD_PLAYER_CONFIG_RESPONSE(3),
                AD_DATA_REFRESH_RESPONSE(4),
                PRIVACY_UPDATE_RESPONSE(5),
                VALUE_NOT_SET(0);

                private final int value;

                private static ValueCase[] $values() [...] // Inlined contents

                private ValueCase(int v1) {
                    this.value = v1;
                }

                public static ValueCase forNumber(int v) {
                    switch(v) {
                        case 0: {
                            return ValueCase.VALUE_NOT_SET;
                        }
                        case 1: {
                            return ValueCase.INITIALIZATION_RESPONSE;
                        }
                        case 2: {
                            return ValueCase.AD_RESPONSE;
                        }
                        case 3: {
                            return ValueCase.AD_PLAYER_CONFIG_RESPONSE;
                        }
                        case 4: {
                            return ValueCase.AD_DATA_REFRESH_RESPONSE;
                        }
                        case 5: {
                            return ValueCase.PRIVACY_UPDATE_RESPONSE;
                        }
                        default: {
                            return null;
                        }
                    }
                }

                public int getNumber() {
                    return this.value;
                }

                @Deprecated
                public static ValueCase valueOf(int v) {
                    return ValueCase.forNumber(v);
                }
            }

            public static final int AD_DATA_REFRESH_RESPONSE_FIELD_NUMBER = 4;
            public static final int AD_PLAYER_CONFIG_RESPONSE_FIELD_NUMBER = 3;
            public static final int AD_RESPONSE_FIELD_NUMBER = 2;
            private static final Payload DEFAULT_INSTANCE = null;
            public static final int INITIALIZATION_RESPONSE_FIELD_NUMBER = 1;
            private static volatile Parser PARSER = null;
            public static final int PRIVACY_UPDATE_RESPONSE_FIELD_NUMBER = 5;
            private int valueCase_;
            private Object value_;

            static {
                Payload universalResponseOuterClass$UniversalResponse$Payload0 = new Payload();
                Payload.DEFAULT_INSTANCE = universalResponseOuterClass$UniversalResponse$Payload0;
                GeneratedMessageLite.registerDefaultInstance(Payload.class, universalResponseOuterClass$UniversalResponse$Payload0);
            }

            private Payload() {
                this.valueCase_ = 0;
            }

            private void clearAdDataRefreshResponse() {
                if(this.valueCase_ == 4) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            private void clearAdPlayerConfigResponse() {
                if(this.valueCase_ == 3) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            private void clearAdResponse() {
                if(this.valueCase_ == 2) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            private void clearInitializationResponse() {
                if(this.valueCase_ == 1) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            private void clearPrivacyUpdateResponse() {
                if(this.valueCase_ == 5) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                }
            }

            private void clearValue() {
                this.valueCase_ = 0;
                this.value_ = null;
            }

            @Override  // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
                switch(generatedMessageLite$MethodToInvoke0) {
                    case 1: {
                        return new Payload();
                    }
                    case 2: {
                        return new gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder(null);
                    }
                    case 3: {
                        return GeneratedMessageLite.newMessageInfo(Payload.DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"value_", "valueCase_", InitializationResponse.class, AdResponse.class, AdPlayerConfigResponse.class, AdDataRefreshResponse.class, PrivacyUpdateResponse.class});
                    }
                    case 4: {
                        return Payload.DEFAULT_INSTANCE;
                    }
                    case 5: {
                        Parser parser0 = Payload.PARSER;
                        if(parser0 == null) {
                            Class class0 = Payload.class;
                            synchronized(class0) {
                                parser0 = Payload.PARSER;
                                if(parser0 == null) {
                                    parser0 = new DefaultInstanceBasedParser(Payload.DEFAULT_INSTANCE);
                                    Payload.PARSER = parser0;
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

            @Override  // gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder
            public AdDataRefreshResponse getAdDataRefreshResponse() {
                return this.valueCase_ == 4 ? ((AdDataRefreshResponse)this.value_) : AdDataRefreshResponse.getDefaultInstance();
            }

            @Override  // gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder
            public AdPlayerConfigResponse getAdPlayerConfigResponse() {
                return this.valueCase_ == 3 ? ((AdPlayerConfigResponse)this.value_) : AdPlayerConfigResponse.getDefaultInstance();
            }

            @Override  // gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder
            public AdResponse getAdResponse() {
                return this.valueCase_ == 2 ? ((AdResponse)this.value_) : AdResponse.getDefaultInstance();
            }

            public static Payload getDefaultInstance() {
                return Payload.DEFAULT_INSTANCE;
            }

            @Override  // gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder
            public InitializationResponse getInitializationResponse() {
                return this.valueCase_ == 1 ? ((InitializationResponse)this.value_) : InitializationResponse.getDefaultInstance();
            }

            @Override  // gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder
            public PrivacyUpdateResponse getPrivacyUpdateResponse() {
                return this.valueCase_ == 5 ? ((PrivacyUpdateResponse)this.value_) : PrivacyUpdateResponse.getDefaultInstance();
            }

            @Override  // gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder
            public ValueCase getValueCase() {
                return ValueCase.forNumber(this.valueCase_);
            }

            @Override  // gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder
            public boolean hasAdDataRefreshResponse() {
                return this.valueCase_ == 4;
            }

            @Override  // gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder
            public boolean hasAdPlayerConfigResponse() {
                return this.valueCase_ == 3;
            }

            @Override  // gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder
            public boolean hasAdResponse() {
                return this.valueCase_ == 2;
            }

            @Override  // gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder
            public boolean hasInitializationResponse() {
                return this.valueCase_ == 1;
            }

            @Override  // gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse$PayloadOrBuilder
            public boolean hasPrivacyUpdateResponse() {
                return this.valueCase_ == 5;
            }

            private void mergeAdDataRefreshResponse(AdDataRefreshResponse adDataRefreshResponseOuterClass$AdDataRefreshResponse0) {
                adDataRefreshResponseOuterClass$AdDataRefreshResponse0.getClass();
                this.value_ = this.valueCase_ != 4 || this.value_ == AdDataRefreshResponse.getDefaultInstance() ? adDataRefreshResponseOuterClass$AdDataRefreshResponse0 : ((gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder)AdDataRefreshResponse.newBuilder(((AdDataRefreshResponse)this.value_)).mergeFrom(adDataRefreshResponseOuterClass$AdDataRefreshResponse0)).buildPartial();
                this.valueCase_ = 4;
            }

            private void mergeAdPlayerConfigResponse(AdPlayerConfigResponse adPlayerConfigResponseOuterClass$AdPlayerConfigResponse0) {
                adPlayerConfigResponseOuterClass$AdPlayerConfigResponse0.getClass();
                this.value_ = this.valueCase_ != 3 || this.value_ == AdPlayerConfigResponse.getDefaultInstance() ? adPlayerConfigResponseOuterClass$AdPlayerConfigResponse0 : ((gatewayprotocol.v1.AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.Builder)AdPlayerConfigResponse.newBuilder(((AdPlayerConfigResponse)this.value_)).mergeFrom(adPlayerConfigResponseOuterClass$AdPlayerConfigResponse0)).buildPartial();
                this.valueCase_ = 3;
            }

            private void mergeAdResponse(AdResponse adResponseOuterClass$AdResponse0) {
                adResponseOuterClass$AdResponse0.getClass();
                this.value_ = this.valueCase_ != 2 || this.value_ == AdResponse.getDefaultInstance() ? adResponseOuterClass$AdResponse0 : ((gatewayprotocol.v1.AdResponseOuterClass.AdResponse.Builder)AdResponse.newBuilder(((AdResponse)this.value_)).mergeFrom(adResponseOuterClass$AdResponse0)).buildPartial();
                this.valueCase_ = 2;
            }

            private void mergeInitializationResponse(InitializationResponse initializationResponseOuterClass$InitializationResponse0) {
                initializationResponseOuterClass$InitializationResponse0.getClass();
                this.value_ = this.valueCase_ != 1 || this.value_ == InitializationResponse.getDefaultInstance() ? initializationResponseOuterClass$InitializationResponse0 : ((gatewayprotocol.v1.InitializationResponseOuterClass.InitializationResponse.Builder)InitializationResponse.newBuilder(((InitializationResponse)this.value_)).mergeFrom(initializationResponseOuterClass$InitializationResponse0)).buildPartial();
                this.valueCase_ = 1;
            }

            private void mergePrivacyUpdateResponse(PrivacyUpdateResponse privacyUpdateResponseOuterClass$PrivacyUpdateResponse0) {
                privacyUpdateResponseOuterClass$PrivacyUpdateResponse0.getClass();
                this.value_ = this.valueCase_ != 5 || this.value_ == PrivacyUpdateResponse.getDefaultInstance() ? privacyUpdateResponseOuterClass$PrivacyUpdateResponse0 : ((gatewayprotocol.v1.PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.Builder)PrivacyUpdateResponse.newBuilder(((PrivacyUpdateResponse)this.value_)).mergeFrom(privacyUpdateResponseOuterClass$PrivacyUpdateResponse0)).buildPartial();
                this.valueCase_ = 5;
            }

            public static gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder newBuilder() {
                return (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder)Payload.DEFAULT_INSTANCE.createBuilder();
            }

            public static gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder newBuilder(Payload universalResponseOuterClass$UniversalResponse$Payload0) {
                return (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder)Payload.DEFAULT_INSTANCE.createBuilder(universalResponseOuterClass$UniversalResponse$Payload0);
            }

            public static Payload parseDelimitedFrom(InputStream inputStream0) throws IOException {
                return (Payload)GeneratedMessageLite.parseDelimitedFrom(Payload.DEFAULT_INSTANCE, inputStream0);
            }

            public static Payload parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return (Payload)GeneratedMessageLite.parseDelimitedFrom(Payload.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
            }

            public static Payload parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
                return (Payload)GeneratedMessageLite.parseFrom(Payload.DEFAULT_INSTANCE, byteString0);
            }

            public static Payload parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
                return (Payload)GeneratedMessageLite.parseFrom(Payload.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
            }

            public static Payload parseFrom(CodedInputStream codedInputStream0) throws IOException {
                return (Payload)GeneratedMessageLite.parseFrom(Payload.DEFAULT_INSTANCE, codedInputStream0);
            }

            public static Payload parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return (Payload)GeneratedMessageLite.parseFrom(Payload.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
            }

            public static Payload parseFrom(InputStream inputStream0) throws IOException {
                return (Payload)GeneratedMessageLite.parseFrom(Payload.DEFAULT_INSTANCE, inputStream0);
            }

            public static Payload parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
                return (Payload)GeneratedMessageLite.parseFrom(Payload.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
            }

            public static Payload parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
                return (Payload)GeneratedMessageLite.parseFrom(Payload.DEFAULT_INSTANCE, byteBuffer0);
            }

            public static Payload parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
                return (Payload)GeneratedMessageLite.parseFrom(Payload.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
            }

            public static Payload parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
                return (Payload)GeneratedMessageLite.parseFrom(Payload.DEFAULT_INSTANCE, arr_b);
            }

            public static Payload parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
                return (Payload)GeneratedMessageLite.parseFrom(Payload.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
            }

            public static Parser parser() {
                return Payload.DEFAULT_INSTANCE.getParserForType();
            }

            private void setAdDataRefreshResponse(AdDataRefreshResponse adDataRefreshResponseOuterClass$AdDataRefreshResponse0) {
                adDataRefreshResponseOuterClass$AdDataRefreshResponse0.getClass();
                this.value_ = adDataRefreshResponseOuterClass$AdDataRefreshResponse0;
                this.valueCase_ = 4;
            }

            private void setAdPlayerConfigResponse(AdPlayerConfigResponse adPlayerConfigResponseOuterClass$AdPlayerConfigResponse0) {
                adPlayerConfigResponseOuterClass$AdPlayerConfigResponse0.getClass();
                this.value_ = adPlayerConfigResponseOuterClass$AdPlayerConfigResponse0;
                this.valueCase_ = 3;
            }

            private void setAdResponse(AdResponse adResponseOuterClass$AdResponse0) {
                adResponseOuterClass$AdResponse0.getClass();
                this.value_ = adResponseOuterClass$AdResponse0;
                this.valueCase_ = 2;
            }

            private void setInitializationResponse(InitializationResponse initializationResponseOuterClass$InitializationResponse0) {
                initializationResponseOuterClass$InitializationResponse0.getClass();
                this.value_ = initializationResponseOuterClass$InitializationResponse0;
                this.valueCase_ = 1;
            }

            private void setPrivacyUpdateResponse(PrivacyUpdateResponse privacyUpdateResponseOuterClass$PrivacyUpdateResponse0) {
                privacyUpdateResponseOuterClass$PrivacyUpdateResponse0.getClass();
                this.value_ = privacyUpdateResponseOuterClass$PrivacyUpdateResponse0;
                this.valueCase_ = 5;
            }
        }

        public interface PayloadOrBuilder extends MessageLiteOrBuilder {
            AdDataRefreshResponse getAdDataRefreshResponse();

            AdPlayerConfigResponse getAdPlayerConfigResponse();

            AdResponse getAdResponse();

            InitializationResponse getInitializationResponse();

            PrivacyUpdateResponse getPrivacyUpdateResponse();

            ValueCase getValueCase();

            boolean hasAdDataRefreshResponse();

            boolean hasAdPlayerConfigResponse();

            boolean hasAdResponse();

            boolean hasInitializationResponse();

            boolean hasPrivacyUpdateResponse();
        }

        private static final UniversalResponse DEFAULT_INSTANCE = null;
        public static final int ERROR_FIELD_NUMBER = 3;
        public static final int MUTABLE_DATA_FIELD_NUMBER = 2;
        private static volatile Parser PARSER = null;
        public static final int PAYLOAD_FIELD_NUMBER = 1;
        private int bitField0_;
        private Error error_;
        private MutableData mutableData_;
        private Payload payload_;

        static {
            UniversalResponse universalResponseOuterClass$UniversalResponse0 = new UniversalResponse();
            UniversalResponse.DEFAULT_INSTANCE = universalResponseOuterClass$UniversalResponse0;
            GeneratedMessageLite.registerDefaultInstance(UniversalResponse.class, universalResponseOuterClass$UniversalResponse0);
        }

        private void clearError() {
            this.error_ = null;
            this.bitField0_ &= -5;
        }

        private void clearMutableData() {
            this.mutableData_ = null;
            this.bitField0_ &= -3;
        }

        private void clearPayload() {
            this.payload_ = null;
            this.bitField0_ &= -2;
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new UniversalResponse();
                }
                case 2: {
                    return new Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(UniversalResponse.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "payload_", "mutableData_", "error_"});
                }
                case 4: {
                    return UniversalResponse.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = UniversalResponse.PARSER;
                    if(parser0 == null) {
                        Class class0 = UniversalResponse.class;
                        synchronized(class0) {
                            parser0 = UniversalResponse.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(UniversalResponse.DEFAULT_INSTANCE);
                                UniversalResponse.PARSER = parser0;
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

        public static UniversalResponse getDefaultInstance() {
            return UniversalResponse.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponseOrBuilder
        public Error getError() {
            return this.error_ == null ? Error.getDefaultInstance() : this.error_;
        }

        @Override  // gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponseOrBuilder
        public MutableData getMutableData() {
            return this.mutableData_ == null ? MutableData.getDefaultInstance() : this.mutableData_;
        }

        @Override  // gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponseOrBuilder
        public Payload getPayload() {
            return this.payload_ == null ? Payload.getDefaultInstance() : this.payload_;
        }

        @Override  // gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponseOrBuilder
        public boolean hasError() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override  // gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponseOrBuilder
        public boolean hasMutableData() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override  // gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponseOrBuilder
        public boolean hasPayload() {
            return (this.bitField0_ & 1) != 0;
        }

        private void mergeError(Error errorOuterClass$Error0) {
            errorOuterClass$Error0.getClass();
            this.error_ = this.error_ == null || this.error_ == Error.getDefaultInstance() ? errorOuterClass$Error0 : ((Error)((gatewayprotocol.v1.ErrorOuterClass.Error.Builder)Error.newBuilder(this.error_).mergeFrom(errorOuterClass$Error0)).buildPartial());
            this.bitField0_ |= 4;
        }

        private void mergeMutableData(MutableData mutableDataOuterClass$MutableData0) {
            mutableDataOuterClass$MutableData0.getClass();
            this.mutableData_ = this.mutableData_ == null || this.mutableData_ == MutableData.getDefaultInstance() ? mutableDataOuterClass$MutableData0 : ((MutableData)((gatewayprotocol.v1.MutableDataOuterClass.MutableData.Builder)MutableData.newBuilder(this.mutableData_).mergeFrom(mutableDataOuterClass$MutableData0)).buildPartial());
            this.bitField0_ |= 2;
        }

        private void mergePayload(Payload universalResponseOuterClass$UniversalResponse$Payload0) {
            universalResponseOuterClass$UniversalResponse$Payload0.getClass();
            this.payload_ = this.payload_ == null || this.payload_ == Payload.getDefaultInstance() ? universalResponseOuterClass$UniversalResponse$Payload0 : ((Payload)((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Payload.Builder)Payload.newBuilder(this.payload_).mergeFrom(universalResponseOuterClass$UniversalResponse$Payload0)).buildPartial());
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder)UniversalResponse.DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(UniversalResponse universalResponseOuterClass$UniversalResponse0) {
            return (Builder)UniversalResponse.DEFAULT_INSTANCE.createBuilder(universalResponseOuterClass$UniversalResponse0);
        }

        public static UniversalResponse parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (UniversalResponse)GeneratedMessageLite.parseDelimitedFrom(UniversalResponse.DEFAULT_INSTANCE, inputStream0);
        }

        public static UniversalResponse parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (UniversalResponse)GeneratedMessageLite.parseDelimitedFrom(UniversalResponse.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static UniversalResponse parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (UniversalResponse)GeneratedMessageLite.parseFrom(UniversalResponse.DEFAULT_INSTANCE, byteString0);
        }

        public static UniversalResponse parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (UniversalResponse)GeneratedMessageLite.parseFrom(UniversalResponse.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static UniversalResponse parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (UniversalResponse)GeneratedMessageLite.parseFrom(UniversalResponse.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static UniversalResponse parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (UniversalResponse)GeneratedMessageLite.parseFrom(UniversalResponse.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static UniversalResponse parseFrom(InputStream inputStream0) throws IOException {
            return (UniversalResponse)GeneratedMessageLite.parseFrom(UniversalResponse.DEFAULT_INSTANCE, inputStream0);
        }

        public static UniversalResponse parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (UniversalResponse)GeneratedMessageLite.parseFrom(UniversalResponse.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static UniversalResponse parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (UniversalResponse)GeneratedMessageLite.parseFrom(UniversalResponse.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static UniversalResponse parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (UniversalResponse)GeneratedMessageLite.parseFrom(UniversalResponse.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static UniversalResponse parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (UniversalResponse)GeneratedMessageLite.parseFrom(UniversalResponse.DEFAULT_INSTANCE, arr_b);
        }

        public static UniversalResponse parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (UniversalResponse)GeneratedMessageLite.parseFrom(UniversalResponse.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return UniversalResponse.DEFAULT_INSTANCE.getParserForType();
        }

        private void setError(Error errorOuterClass$Error0) {
            errorOuterClass$Error0.getClass();
            this.error_ = errorOuterClass$Error0;
            this.bitField0_ |= 4;
        }

        private void setMutableData(MutableData mutableDataOuterClass$MutableData0) {
            mutableDataOuterClass$MutableData0.getClass();
            this.mutableData_ = mutableDataOuterClass$MutableData0;
            this.bitField0_ |= 2;
        }

        private void setPayload(Payload universalResponseOuterClass$UniversalResponse$Payload0) {
            universalResponseOuterClass$UniversalResponse$Payload0.getClass();
            this.payload_ = universalResponseOuterClass$UniversalResponse$Payload0;
            this.bitField0_ |= 1;
        }
    }

    public interface UniversalResponseOrBuilder extends MessageLiteOrBuilder {
        Error getError();

        MutableData getMutableData();

        Payload getPayload();

        boolean hasError();

        boolean hasMutableData();

        boolean hasPayload();
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

