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

public final class HeaderBiddingTokenOuterClass {
    public static final class HeaderBiddingToken extends GeneratedMessageLite implements HeaderBiddingTokenOrBuilder {
        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements HeaderBiddingTokenOrBuilder {
            private Builder() {
                super(HeaderBiddingToken.DEFAULT_INSTANCE);
            }

            Builder(a headerBiddingTokenOuterClass$a0) {
            }

            public Builder clearAdFormat() {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).clearAdFormat();
                return this;
            }

            public Builder clearCampaignState() {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).clearCampaignState();
                return this;
            }

            public Builder clearClientInfo() {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).clearClientInfo();
                return this;
            }

            public Builder clearDynamicDeviceInfo() {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).clearDynamicDeviceInfo();
                return this;
            }

            public Builder clearInitializationData() {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).clearInitializationData();
                return this;
            }

            public Builder clearLimitedSessionToken() {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).clearLimitedSessionToken();
                return this;
            }

            public Builder clearOfferwallEnabled() {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).clearOfferwallEnabled();
                return this;
            }

            public Builder clearPii() {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).clearPii();
                return this;
            }

            public Builder clearScarSignalsCollected() {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).clearScarSignalsCollected();
                return this;
            }

            public Builder clearSessionCounters() {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).clearSessionCounters();
                return this;
            }

            public Builder clearSessionToken() {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).clearSessionToken();
                return this;
            }

            public Builder clearStaticDeviceInfo() {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).clearStaticDeviceInfo();
                return this;
            }

            public Builder clearTcf() {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).clearTcf();
                return this;
            }

            public Builder clearTestData() {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).clearTestData();
                return this;
            }

            public Builder clearTimestamps() {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).clearTimestamps();
                return this;
            }

            public Builder clearTokenCounters() {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).clearTokenCounters();
                return this;
            }

            public Builder clearTokenId() {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).clearTokenId();
                return this;
            }

            public Builder clearTokenNumber() {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).clearTokenNumber();
                return this;
            }

            @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
            public AdFormat getAdFormat() {
                return ((HeaderBiddingToken)this.instance).getAdFormat();
            }

            @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
            public int getAdFormatValue() {
                return ((HeaderBiddingToken)this.instance).getAdFormatValue();
            }

            @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
            public CampaignState getCampaignState() {
                return ((HeaderBiddingToken)this.instance).getCampaignState();
            }

            @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
            public ClientInfo getClientInfo() {
                return ((HeaderBiddingToken)this.instance).getClientInfo();
            }

            @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
            public DynamicDeviceInfo getDynamicDeviceInfo() {
                return ((HeaderBiddingToken)this.instance).getDynamicDeviceInfo();
            }

            @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
            public InitializationData getInitializationData() {
                return ((HeaderBiddingToken)this.instance).getInitializationData();
            }

            @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
            public LimitedSessionToken getLimitedSessionToken() {
                return ((HeaderBiddingToken)this.instance).getLimitedSessionToken();
            }

            @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
            public boolean getOfferwallEnabled() {
                return ((HeaderBiddingToken)this.instance).getOfferwallEnabled();
            }

            @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
            public Pii getPii() {
                return ((HeaderBiddingToken)this.instance).getPii();
            }

            @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
            public boolean getScarSignalsCollected() {
                return ((HeaderBiddingToken)this.instance).getScarSignalsCollected();
            }

            @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
            public SessionCounters getSessionCounters() {
                return ((HeaderBiddingToken)this.instance).getSessionCounters();
            }

            @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
            public ByteString getSessionToken() {
                return ((HeaderBiddingToken)this.instance).getSessionToken();
            }

            @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
            public StaticDeviceInfo getStaticDeviceInfo() {
                return ((HeaderBiddingToken)this.instance).getStaticDeviceInfo();
            }

            @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
            public ByteString getTcf() {
                return ((HeaderBiddingToken)this.instance).getTcf();
            }

            @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
            public TestData getTestData() {
                return ((HeaderBiddingToken)this.instance).getTestData();
            }

            @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
            public Timestamps getTimestamps() {
                return ((HeaderBiddingToken)this.instance).getTimestamps();
            }

            @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
            public TokenCounters getTokenCounters() {
                return ((HeaderBiddingToken)this.instance).getTokenCounters();
            }

            @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
            public ByteString getTokenId() {
                return ((HeaderBiddingToken)this.instance).getTokenId();
            }

            @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
            public int getTokenNumber() {
                return ((HeaderBiddingToken)this.instance).getTokenNumber();
            }

            @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
            public boolean hasAdFormat() {
                return ((HeaderBiddingToken)this.instance).hasAdFormat();
            }

            @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
            public boolean hasCampaignState() {
                return ((HeaderBiddingToken)this.instance).hasCampaignState();
            }

            @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
            public boolean hasClientInfo() {
                return ((HeaderBiddingToken)this.instance).hasClientInfo();
            }

            @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
            public boolean hasDynamicDeviceInfo() {
                return ((HeaderBiddingToken)this.instance).hasDynamicDeviceInfo();
            }

            @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
            public boolean hasInitializationData() {
                return ((HeaderBiddingToken)this.instance).hasInitializationData();
            }

            @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
            public boolean hasLimitedSessionToken() {
                return ((HeaderBiddingToken)this.instance).hasLimitedSessionToken();
            }

            @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
            public boolean hasOfferwallEnabled() {
                return ((HeaderBiddingToken)this.instance).hasOfferwallEnabled();
            }

            @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
            public boolean hasPii() {
                return ((HeaderBiddingToken)this.instance).hasPii();
            }

            @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
            public boolean hasScarSignalsCollected() {
                return ((HeaderBiddingToken)this.instance).hasScarSignalsCollected();
            }

            @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
            public boolean hasSessionCounters() {
                return ((HeaderBiddingToken)this.instance).hasSessionCounters();
            }

            @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
            public boolean hasStaticDeviceInfo() {
                return ((HeaderBiddingToken)this.instance).hasStaticDeviceInfo();
            }

            @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
            public boolean hasTcf() {
                return ((HeaderBiddingToken)this.instance).hasTcf();
            }

            @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
            public boolean hasTestData() {
                return ((HeaderBiddingToken)this.instance).hasTestData();
            }

            @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
            public boolean hasTimestamps() {
                return ((HeaderBiddingToken)this.instance).hasTimestamps();
            }

            @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
            public boolean hasTokenCounters() {
                return ((HeaderBiddingToken)this.instance).hasTokenCounters();
            }

            public Builder mergeCampaignState(CampaignState campaignStateOuterClass$CampaignState0) {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).mergeCampaignState(campaignStateOuterClass$CampaignState0);
                return this;
            }

            public Builder mergeClientInfo(ClientInfo clientInfoOuterClass$ClientInfo0) {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).mergeClientInfo(clientInfoOuterClass$ClientInfo0);
                return this;
            }

            public Builder mergeDynamicDeviceInfo(DynamicDeviceInfo dynamicDeviceInfoOuterClass$DynamicDeviceInfo0) {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).mergeDynamicDeviceInfo(dynamicDeviceInfoOuterClass$DynamicDeviceInfo0);
                return this;
            }

            public Builder mergeInitializationData(InitializationData initializationDataOuterClass$InitializationData0) {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).mergeInitializationData(initializationDataOuterClass$InitializationData0);
                return this;
            }

            public Builder mergeLimitedSessionToken(LimitedSessionToken universalRequestOuterClass$LimitedSessionToken0) {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).mergeLimitedSessionToken(universalRequestOuterClass$LimitedSessionToken0);
                return this;
            }

            public Builder mergePii(Pii piiOuterClass$Pii0) {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).mergePii(piiOuterClass$Pii0);
                return this;
            }

            public Builder mergeSessionCounters(SessionCounters sessionCountersOuterClass$SessionCounters0) {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).mergeSessionCounters(sessionCountersOuterClass$SessionCounters0);
                return this;
            }

            public Builder mergeStaticDeviceInfo(StaticDeviceInfo staticDeviceInfoOuterClass$StaticDeviceInfo0) {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).mergeStaticDeviceInfo(staticDeviceInfoOuterClass$StaticDeviceInfo0);
                return this;
            }

            public Builder mergeTestData(TestData testDataOuterClass$TestData0) {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).mergeTestData(testDataOuterClass$TestData0);
                return this;
            }

            public Builder mergeTimestamps(Timestamps timestampsOuterClass$Timestamps0) {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).mergeTimestamps(timestampsOuterClass$Timestamps0);
                return this;
            }

            public Builder mergeTokenCounters(TokenCounters headerBiddingTokenOuterClass$TokenCounters0) {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).mergeTokenCounters(headerBiddingTokenOuterClass$TokenCounters0);
                return this;
            }

            public Builder setAdFormat(AdFormat initializationResponseOuterClass$AdFormat0) {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).setAdFormat(initializationResponseOuterClass$AdFormat0);
                return this;
            }

            public Builder setAdFormatValue(int v) {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).setAdFormatValue(v);
                return this;
            }

            public Builder setCampaignState(gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder campaignStateOuterClass$CampaignState$Builder0) {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).setCampaignState(((CampaignState)campaignStateOuterClass$CampaignState$Builder0.build()));
                return this;
            }

            public Builder setCampaignState(CampaignState campaignStateOuterClass$CampaignState0) {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).setCampaignState(campaignStateOuterClass$CampaignState0);
                return this;
            }

            public Builder setClientInfo(gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder clientInfoOuterClass$ClientInfo$Builder0) {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).setClientInfo(((ClientInfo)clientInfoOuterClass$ClientInfo$Builder0.build()));
                return this;
            }

            public Builder setClientInfo(ClientInfo clientInfoOuterClass$ClientInfo0) {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).setClientInfo(clientInfoOuterClass$ClientInfo0);
                return this;
            }

            public Builder setDynamicDeviceInfo(gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder0) {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).setDynamicDeviceInfo(((DynamicDeviceInfo)dynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder0.build()));
                return this;
            }

            public Builder setDynamicDeviceInfo(DynamicDeviceInfo dynamicDeviceInfoOuterClass$DynamicDeviceInfo0) {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).setDynamicDeviceInfo(dynamicDeviceInfoOuterClass$DynamicDeviceInfo0);
                return this;
            }

            public Builder setInitializationData(gatewayprotocol.v1.InitializationDataOuterClass.InitializationData.Builder initializationDataOuterClass$InitializationData$Builder0) {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).setInitializationData(((InitializationData)initializationDataOuterClass$InitializationData$Builder0.build()));
                return this;
            }

            public Builder setInitializationData(InitializationData initializationDataOuterClass$InitializationData0) {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).setInitializationData(initializationDataOuterClass$InitializationData0);
                return this;
            }

            public Builder setLimitedSessionToken(gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder universalRequestOuterClass$LimitedSessionToken$Builder0) {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).setLimitedSessionToken(((LimitedSessionToken)universalRequestOuterClass$LimitedSessionToken$Builder0.build()));
                return this;
            }

            public Builder setLimitedSessionToken(LimitedSessionToken universalRequestOuterClass$LimitedSessionToken0) {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).setLimitedSessionToken(universalRequestOuterClass$LimitedSessionToken0);
                return this;
            }

            public Builder setOfferwallEnabled(boolean z) {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).setOfferwallEnabled(z);
                return this;
            }

            public Builder setPii(gatewayprotocol.v1.PiiOuterClass.Pii.Builder piiOuterClass$Pii$Builder0) {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).setPii(((Pii)piiOuterClass$Pii$Builder0.build()));
                return this;
            }

            public Builder setPii(Pii piiOuterClass$Pii0) {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).setPii(piiOuterClass$Pii0);
                return this;
            }

            public Builder setScarSignalsCollected(boolean z) {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).setScarSignalsCollected(z);
                return this;
            }

            public Builder setSessionCounters(gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder sessionCountersOuterClass$SessionCounters$Builder0) {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).setSessionCounters(((SessionCounters)sessionCountersOuterClass$SessionCounters$Builder0.build()));
                return this;
            }

            public Builder setSessionCounters(SessionCounters sessionCountersOuterClass$SessionCounters0) {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).setSessionCounters(sessionCountersOuterClass$SessionCounters0);
                return this;
            }

            public Builder setSessionToken(ByteString byteString0) {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).setSessionToken(byteString0);
                return this;
            }

            public Builder setStaticDeviceInfo(gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder staticDeviceInfoOuterClass$StaticDeviceInfo$Builder0) {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).setStaticDeviceInfo(((StaticDeviceInfo)staticDeviceInfoOuterClass$StaticDeviceInfo$Builder0.build()));
                return this;
            }

            public Builder setStaticDeviceInfo(StaticDeviceInfo staticDeviceInfoOuterClass$StaticDeviceInfo0) {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).setStaticDeviceInfo(staticDeviceInfoOuterClass$StaticDeviceInfo0);
                return this;
            }

            public Builder setTcf(ByteString byteString0) {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).setTcf(byteString0);
                return this;
            }

            public Builder setTestData(gatewayprotocol.v1.TestDataOuterClass.TestData.Builder testDataOuterClass$TestData$Builder0) {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).setTestData(((TestData)testDataOuterClass$TestData$Builder0.build()));
                return this;
            }

            public Builder setTestData(TestData testDataOuterClass$TestData0) {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).setTestData(testDataOuterClass$TestData0);
                return this;
            }

            public Builder setTimestamps(gatewayprotocol.v1.TimestampsOuterClass.Timestamps.Builder timestampsOuterClass$Timestamps$Builder0) {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).setTimestamps(((Timestamps)timestampsOuterClass$Timestamps$Builder0.build()));
                return this;
            }

            public Builder setTimestamps(Timestamps timestampsOuterClass$Timestamps0) {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).setTimestamps(timestampsOuterClass$Timestamps0);
                return this;
            }

            public Builder setTokenCounters(gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder headerBiddingTokenOuterClass$TokenCounters$Builder0) {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).setTokenCounters(((TokenCounters)headerBiddingTokenOuterClass$TokenCounters$Builder0.build()));
                return this;
            }

            public Builder setTokenCounters(TokenCounters headerBiddingTokenOuterClass$TokenCounters0) {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).setTokenCounters(headerBiddingTokenOuterClass$TokenCounters0);
                return this;
            }

            public Builder setTokenId(ByteString byteString0) {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).setTokenId(byteString0);
                return this;
            }

            public Builder setTokenNumber(int v) {
                this.copyOnWrite();
                ((HeaderBiddingToken)this.instance).setTokenNumber(v);
                return this;
            }
        }

        public static final int AD_FORMAT_FIELD_NUMBER = 15;
        public static final int CAMPAIGN_STATE_FIELD_NUMBER = 10;
        public static final int CLIENT_INFO_FIELD_NUMBER = 4;
        private static final HeaderBiddingToken DEFAULT_INSTANCE = null;
        public static final int DYNAMIC_DEVICE_INFO_FIELD_NUMBER = 8;
        public static final int INITIALIZATION_DATA_FIELD_NUMBER = 14;
        public static final int LIMITED_SESSION_TOKEN_FIELD_NUMBER = 13;
        public static final int OFFERWALL_ENABLED_FIELD_NUMBER = 18;
        private static volatile Parser PARSER = null;
        public static final int PII_FIELD_NUMBER = 9;
        public static final int SCAR_SIGNALS_COLLECTED_FIELD_NUMBER = 12;
        public static final int SESSION_COUNTERS_FIELD_NUMBER = 6;
        public static final int SESSION_TOKEN_FIELD_NUMBER = 3;
        public static final int STATIC_DEVICE_INFO_FIELD_NUMBER = 7;
        public static final int TCF_FIELD_NUMBER = 11;
        public static final int TEST_DATA_FIELD_NUMBER = 16;
        public static final int TIMESTAMPS_FIELD_NUMBER = 5;
        public static final int TOKEN_COUNTERS_FIELD_NUMBER = 17;
        public static final int TOKEN_ID_FIELD_NUMBER = 1;
        public static final int TOKEN_NUMBER_FIELD_NUMBER = 2;
        private int adFormat_;
        private int bitField0_;
        private CampaignState campaignState_;
        private ClientInfo clientInfo_;
        private DynamicDeviceInfo dynamicDeviceInfo_;
        private InitializationData initializationData_;
        private LimitedSessionToken limitedSessionToken_;
        private boolean offerwallEnabled_;
        private Pii pii_;
        private boolean scarSignalsCollected_;
        private SessionCounters sessionCounters_;
        private ByteString sessionToken_;
        private StaticDeviceInfo staticDeviceInfo_;
        private ByteString tcf_;
        private TestData testData_;
        private Timestamps timestamps_;
        private TokenCounters tokenCounters_;
        private ByteString tokenId_;
        private int tokenNumber_;

        static {
            HeaderBiddingToken headerBiddingTokenOuterClass$HeaderBiddingToken0 = new HeaderBiddingToken();
            HeaderBiddingToken.DEFAULT_INSTANCE = headerBiddingTokenOuterClass$HeaderBiddingToken0;
            GeneratedMessageLite.registerDefaultInstance(HeaderBiddingToken.class, headerBiddingTokenOuterClass$HeaderBiddingToken0);
        }

        private HeaderBiddingToken() {
            this.tokenId_ = ByteString.EMPTY;
            this.sessionToken_ = ByteString.EMPTY;
            this.tcf_ = ByteString.EMPTY;
        }

        private void clearAdFormat() {
            this.bitField0_ &= 0xFFFFF7FF;
            this.adFormat_ = 0;
        }

        private void clearCampaignState() {
            this.campaignState_ = null;
            this.bitField0_ &= -65;
        }

        private void clearClientInfo() {
            this.clientInfo_ = null;
            this.bitField0_ &= -2;
        }

        private void clearDynamicDeviceInfo() {
            this.dynamicDeviceInfo_ = null;
            this.bitField0_ &= -17;
        }

        private void clearInitializationData() {
            this.initializationData_ = null;
            this.bitField0_ &= 0xFFFFFBFF;
        }

        private void clearLimitedSessionToken() {
            this.limitedSessionToken_ = null;
            this.bitField0_ &= 0xFFFFFDFF;
        }

        private void clearOfferwallEnabled() {
            this.bitField0_ &= 0xFFFFBFFF;
            this.offerwallEnabled_ = false;
        }

        private void clearPii() {
            this.pii_ = null;
            this.bitField0_ &= -33;
        }

        private void clearScarSignalsCollected() {
            this.bitField0_ &= 0xFFFFFEFF;
            this.scarSignalsCollected_ = false;
        }

        private void clearSessionCounters() {
            this.sessionCounters_ = null;
            this.bitField0_ &= -5;
        }

        private void clearSessionToken() {
            this.sessionToken_ = HeaderBiddingToken.getDefaultInstance().getSessionToken();
        }

        private void clearStaticDeviceInfo() {
            this.staticDeviceInfo_ = null;
            this.bitField0_ &= -9;
        }

        private void clearTcf() {
            this.bitField0_ &= 0xFFFFFF7F;
            this.tcf_ = HeaderBiddingToken.getDefaultInstance().getTcf();
        }

        private void clearTestData() {
            this.testData_ = null;
            this.bitField0_ &= 0xFFFFEFFF;
        }

        private void clearTimestamps() {
            this.timestamps_ = null;
            this.bitField0_ &= -3;
        }

        private void clearTokenCounters() {
            this.tokenCounters_ = null;
            this.bitField0_ &= 0xFFFFDFFF;
        }

        private void clearTokenId() {
            this.tokenId_ = HeaderBiddingToken.getDefaultInstance().getTokenId();
        }

        private void clearTokenNumber() {
            this.tokenNumber_ = 0;
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new HeaderBiddingToken();
                }
                case 2: {
                    return new Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(HeaderBiddingToken.DEFAULT_INSTANCE, "\u0000\u0012\u0000\u0001\u0001\u0012\u0012\u0000\u0000\u0000\u0001\n\u0002\u0004\u0003\n\u0004ဉ\u0000\u0005ဉ\u0001\u0006ဉ\u0002\u0007ဉ\u0003\bဉ\u0004\tဉ\u0005\nဉ\u0006\u000Bည\u0007\fဇ\b\rဉ\t\u000Eဉ\n\u000Fဌ\u000B\u0010ဉ\f\u0011ဉ\r\u0012ဇ\u000E", new Object[]{"bitField0_", "tokenId_", "tokenNumber_", "sessionToken_", "clientInfo_", "timestamps_", "sessionCounters_", "staticDeviceInfo_", "dynamicDeviceInfo_", "pii_", "campaignState_", "tcf_", "scarSignalsCollected_", "limitedSessionToken_", "initializationData_", "adFormat_", "testData_", "tokenCounters_", "offerwallEnabled_"});
                }
                case 4: {
                    return HeaderBiddingToken.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = HeaderBiddingToken.PARSER;
                    if(parser0 == null) {
                        Class class0 = HeaderBiddingToken.class;
                        synchronized(class0) {
                            parser0 = HeaderBiddingToken.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(HeaderBiddingToken.DEFAULT_INSTANCE);
                                HeaderBiddingToken.PARSER = parser0;
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

        @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
        public AdFormat getAdFormat() {
            AdFormat initializationResponseOuterClass$AdFormat0 = AdFormat.forNumber(this.adFormat_);
            return initializationResponseOuterClass$AdFormat0 == null ? AdFormat.UNRECOGNIZED : initializationResponseOuterClass$AdFormat0;
        }

        @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
        public int getAdFormatValue() {
            return this.adFormat_;
        }

        @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
        public CampaignState getCampaignState() {
            return this.campaignState_ == null ? CampaignState.getDefaultInstance() : this.campaignState_;
        }

        @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
        public ClientInfo getClientInfo() {
            return this.clientInfo_ == null ? ClientInfo.getDefaultInstance() : this.clientInfo_;
        }

        public static HeaderBiddingToken getDefaultInstance() {
            return HeaderBiddingToken.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
        public DynamicDeviceInfo getDynamicDeviceInfo() {
            return this.dynamicDeviceInfo_ == null ? DynamicDeviceInfo.getDefaultInstance() : this.dynamicDeviceInfo_;
        }

        @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
        public InitializationData getInitializationData() {
            return this.initializationData_ == null ? InitializationData.getDefaultInstance() : this.initializationData_;
        }

        @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
        public LimitedSessionToken getLimitedSessionToken() {
            return this.limitedSessionToken_ == null ? LimitedSessionToken.getDefaultInstance() : this.limitedSessionToken_;
        }

        @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
        public boolean getOfferwallEnabled() {
            return this.offerwallEnabled_;
        }

        @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
        public Pii getPii() {
            return this.pii_ == null ? Pii.getDefaultInstance() : this.pii_;
        }

        @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
        public boolean getScarSignalsCollected() {
            return this.scarSignalsCollected_;
        }

        @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
        public SessionCounters getSessionCounters() {
            return this.sessionCounters_ == null ? SessionCounters.getDefaultInstance() : this.sessionCounters_;
        }

        @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
        public ByteString getSessionToken() {
            return this.sessionToken_;
        }

        @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
        public StaticDeviceInfo getStaticDeviceInfo() {
            return this.staticDeviceInfo_ == null ? StaticDeviceInfo.getDefaultInstance() : this.staticDeviceInfo_;
        }

        @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
        public ByteString getTcf() {
            return this.tcf_;
        }

        @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
        public TestData getTestData() {
            return this.testData_ == null ? TestData.getDefaultInstance() : this.testData_;
        }

        @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
        public Timestamps getTimestamps() {
            return this.timestamps_ == null ? Timestamps.getDefaultInstance() : this.timestamps_;
        }

        @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
        public TokenCounters getTokenCounters() {
            return this.tokenCounters_ == null ? TokenCounters.getDefaultInstance() : this.tokenCounters_;
        }

        @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
        public ByteString getTokenId() {
            return this.tokenId_;
        }

        @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
        public int getTokenNumber() {
            return this.tokenNumber_;
        }

        @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
        public boolean hasAdFormat() {
            return (this.bitField0_ & 0x800) != 0;
        }

        @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
        public boolean hasCampaignState() {
            return (this.bitField0_ & 0x40) != 0;
        }

        @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
        public boolean hasClientInfo() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
        public boolean hasDynamicDeviceInfo() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
        public boolean hasInitializationData() {
            return (this.bitField0_ & 0x400) != 0;
        }

        @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
        public boolean hasLimitedSessionToken() {
            return (this.bitField0_ & 0x200) != 0;
        }

        @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
        public boolean hasOfferwallEnabled() {
            return (this.bitField0_ & 0x4000) != 0;
        }

        @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
        public boolean hasPii() {
            return (this.bitField0_ & 0x20) != 0;
        }

        @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
        public boolean hasScarSignalsCollected() {
            return (this.bitField0_ & 0x100) != 0;
        }

        @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
        public boolean hasSessionCounters() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
        public boolean hasStaticDeviceInfo() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
        public boolean hasTcf() {
            return (this.bitField0_ & 0x80) != 0;
        }

        @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
        public boolean hasTestData() {
            return (this.bitField0_ & 0x1000) != 0;
        }

        @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
        public boolean hasTimestamps() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingTokenOrBuilder
        public boolean hasTokenCounters() {
            return (this.bitField0_ & 0x2000) != 0;
        }

        private void mergeCampaignState(CampaignState campaignStateOuterClass$CampaignState0) {
            campaignStateOuterClass$CampaignState0.getClass();
            this.campaignState_ = this.campaignState_ == null || this.campaignState_ == CampaignState.getDefaultInstance() ? campaignStateOuterClass$CampaignState0 : ((CampaignState)((gatewayprotocol.v1.CampaignStateOuterClass.CampaignState.Builder)CampaignState.newBuilder(this.campaignState_).mergeFrom(campaignStateOuterClass$CampaignState0)).buildPartial());
            this.bitField0_ |= 0x40;
        }

        private void mergeClientInfo(ClientInfo clientInfoOuterClass$ClientInfo0) {
            clientInfoOuterClass$ClientInfo0.getClass();
            this.clientInfo_ = this.clientInfo_ == null || this.clientInfo_ == ClientInfo.getDefaultInstance() ? clientInfoOuterClass$ClientInfo0 : ((ClientInfo)((gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder)ClientInfo.newBuilder(this.clientInfo_).mergeFrom(clientInfoOuterClass$ClientInfo0)).buildPartial());
            this.bitField0_ |= 1;
        }

        private void mergeDynamicDeviceInfo(DynamicDeviceInfo dynamicDeviceInfoOuterClass$DynamicDeviceInfo0) {
            dynamicDeviceInfoOuterClass$DynamicDeviceInfo0.getClass();
            this.dynamicDeviceInfo_ = this.dynamicDeviceInfo_ == null || this.dynamicDeviceInfo_ == DynamicDeviceInfo.getDefaultInstance() ? dynamicDeviceInfoOuterClass$DynamicDeviceInfo0 : ((DynamicDeviceInfo)((gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder)DynamicDeviceInfo.newBuilder(this.dynamicDeviceInfo_).mergeFrom(dynamicDeviceInfoOuterClass$DynamicDeviceInfo0)).buildPartial());
            this.bitField0_ |= 16;
        }

        private void mergeInitializationData(InitializationData initializationDataOuterClass$InitializationData0) {
            initializationDataOuterClass$InitializationData0.getClass();
            this.initializationData_ = this.initializationData_ == null || this.initializationData_ == InitializationData.getDefaultInstance() ? initializationDataOuterClass$InitializationData0 : ((InitializationData)((gatewayprotocol.v1.InitializationDataOuterClass.InitializationData.Builder)InitializationData.newBuilder(this.initializationData_).mergeFrom(initializationDataOuterClass$InitializationData0)).buildPartial());
            this.bitField0_ |= 0x400;
        }

        private void mergeLimitedSessionToken(LimitedSessionToken universalRequestOuterClass$LimitedSessionToken0) {
            universalRequestOuterClass$LimitedSessionToken0.getClass();
            this.limitedSessionToken_ = this.limitedSessionToken_ == null || this.limitedSessionToken_ == LimitedSessionToken.getDefaultInstance() ? universalRequestOuterClass$LimitedSessionToken0 : ((LimitedSessionToken)((gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder)LimitedSessionToken.newBuilder(this.limitedSessionToken_).mergeFrom(universalRequestOuterClass$LimitedSessionToken0)).buildPartial());
            this.bitField0_ |= 0x200;
        }

        private void mergePii(Pii piiOuterClass$Pii0) {
            piiOuterClass$Pii0.getClass();
            this.pii_ = this.pii_ == null || this.pii_ == Pii.getDefaultInstance() ? piiOuterClass$Pii0 : ((Pii)((gatewayprotocol.v1.PiiOuterClass.Pii.Builder)Pii.newBuilder(this.pii_).mergeFrom(piiOuterClass$Pii0)).buildPartial());
            this.bitField0_ |= 0x20;
        }

        private void mergeSessionCounters(SessionCounters sessionCountersOuterClass$SessionCounters0) {
            sessionCountersOuterClass$SessionCounters0.getClass();
            this.sessionCounters_ = this.sessionCounters_ == null || this.sessionCounters_ == SessionCounters.getDefaultInstance() ? sessionCountersOuterClass$SessionCounters0 : ((SessionCounters)((gatewayprotocol.v1.SessionCountersOuterClass.SessionCounters.Builder)SessionCounters.newBuilder(this.sessionCounters_).mergeFrom(sessionCountersOuterClass$SessionCounters0)).buildPartial());
            this.bitField0_ |= 4;
        }

        private void mergeStaticDeviceInfo(StaticDeviceInfo staticDeviceInfoOuterClass$StaticDeviceInfo0) {
            staticDeviceInfoOuterClass$StaticDeviceInfo0.getClass();
            this.staticDeviceInfo_ = this.staticDeviceInfo_ == null || this.staticDeviceInfo_ == StaticDeviceInfo.getDefaultInstance() ? staticDeviceInfoOuterClass$StaticDeviceInfo0 : ((StaticDeviceInfo)((gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder)StaticDeviceInfo.newBuilder(this.staticDeviceInfo_).mergeFrom(staticDeviceInfoOuterClass$StaticDeviceInfo0)).buildPartial());
            this.bitField0_ |= 8;
        }

        private void mergeTestData(TestData testDataOuterClass$TestData0) {
            testDataOuterClass$TestData0.getClass();
            this.testData_ = this.testData_ == null || this.testData_ == TestData.getDefaultInstance() ? testDataOuterClass$TestData0 : ((TestData)((gatewayprotocol.v1.TestDataOuterClass.TestData.Builder)TestData.newBuilder(this.testData_).mergeFrom(testDataOuterClass$TestData0)).buildPartial());
            this.bitField0_ |= 0x1000;
        }

        private void mergeTimestamps(Timestamps timestampsOuterClass$Timestamps0) {
            timestampsOuterClass$Timestamps0.getClass();
            this.timestamps_ = this.timestamps_ == null || this.timestamps_ == Timestamps.getDefaultInstance() ? timestampsOuterClass$Timestamps0 : ((Timestamps)((gatewayprotocol.v1.TimestampsOuterClass.Timestamps.Builder)Timestamps.newBuilder(this.timestamps_).mergeFrom(timestampsOuterClass$Timestamps0)).buildPartial());
            this.bitField0_ |= 2;
        }

        private void mergeTokenCounters(TokenCounters headerBiddingTokenOuterClass$TokenCounters0) {
            headerBiddingTokenOuterClass$TokenCounters0.getClass();
            this.tokenCounters_ = this.tokenCounters_ == null || this.tokenCounters_ == TokenCounters.getDefaultInstance() ? headerBiddingTokenOuterClass$TokenCounters0 : ((TokenCounters)((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder)TokenCounters.newBuilder(this.tokenCounters_).mergeFrom(headerBiddingTokenOuterClass$TokenCounters0)).buildPartial());
            this.bitField0_ |= 0x2000;
        }

        public static Builder newBuilder() {
            return (Builder)HeaderBiddingToken.DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(HeaderBiddingToken headerBiddingTokenOuterClass$HeaderBiddingToken0) {
            return (Builder)HeaderBiddingToken.DEFAULT_INSTANCE.createBuilder(headerBiddingTokenOuterClass$HeaderBiddingToken0);
        }

        public static HeaderBiddingToken parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (HeaderBiddingToken)GeneratedMessageLite.parseDelimitedFrom(HeaderBiddingToken.DEFAULT_INSTANCE, inputStream0);
        }

        public static HeaderBiddingToken parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (HeaderBiddingToken)GeneratedMessageLite.parseDelimitedFrom(HeaderBiddingToken.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static HeaderBiddingToken parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (HeaderBiddingToken)GeneratedMessageLite.parseFrom(HeaderBiddingToken.DEFAULT_INSTANCE, byteString0);
        }

        public static HeaderBiddingToken parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (HeaderBiddingToken)GeneratedMessageLite.parseFrom(HeaderBiddingToken.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static HeaderBiddingToken parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (HeaderBiddingToken)GeneratedMessageLite.parseFrom(HeaderBiddingToken.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static HeaderBiddingToken parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (HeaderBiddingToken)GeneratedMessageLite.parseFrom(HeaderBiddingToken.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static HeaderBiddingToken parseFrom(InputStream inputStream0) throws IOException {
            return (HeaderBiddingToken)GeneratedMessageLite.parseFrom(HeaderBiddingToken.DEFAULT_INSTANCE, inputStream0);
        }

        public static HeaderBiddingToken parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (HeaderBiddingToken)GeneratedMessageLite.parseFrom(HeaderBiddingToken.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static HeaderBiddingToken parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (HeaderBiddingToken)GeneratedMessageLite.parseFrom(HeaderBiddingToken.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static HeaderBiddingToken parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (HeaderBiddingToken)GeneratedMessageLite.parseFrom(HeaderBiddingToken.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static HeaderBiddingToken parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (HeaderBiddingToken)GeneratedMessageLite.parseFrom(HeaderBiddingToken.DEFAULT_INSTANCE, arr_b);
        }

        public static HeaderBiddingToken parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (HeaderBiddingToken)GeneratedMessageLite.parseFrom(HeaderBiddingToken.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return HeaderBiddingToken.DEFAULT_INSTANCE.getParserForType();
        }

        private void setAdFormat(AdFormat initializationResponseOuterClass$AdFormat0) {
            this.adFormat_ = initializationResponseOuterClass$AdFormat0.getNumber();
            this.bitField0_ |= 0x800;
        }

        private void setAdFormatValue(int v) {
            this.bitField0_ |= 0x800;
            this.adFormat_ = v;
        }

        private void setCampaignState(CampaignState campaignStateOuterClass$CampaignState0) {
            campaignStateOuterClass$CampaignState0.getClass();
            this.campaignState_ = campaignStateOuterClass$CampaignState0;
            this.bitField0_ |= 0x40;
        }

        private void setClientInfo(ClientInfo clientInfoOuterClass$ClientInfo0) {
            clientInfoOuterClass$ClientInfo0.getClass();
            this.clientInfo_ = clientInfoOuterClass$ClientInfo0;
            this.bitField0_ |= 1;
        }

        private void setDynamicDeviceInfo(DynamicDeviceInfo dynamicDeviceInfoOuterClass$DynamicDeviceInfo0) {
            dynamicDeviceInfoOuterClass$DynamicDeviceInfo0.getClass();
            this.dynamicDeviceInfo_ = dynamicDeviceInfoOuterClass$DynamicDeviceInfo0;
            this.bitField0_ |= 16;
        }

        private void setInitializationData(InitializationData initializationDataOuterClass$InitializationData0) {
            initializationDataOuterClass$InitializationData0.getClass();
            this.initializationData_ = initializationDataOuterClass$InitializationData0;
            this.bitField0_ |= 0x400;
        }

        private void setLimitedSessionToken(LimitedSessionToken universalRequestOuterClass$LimitedSessionToken0) {
            universalRequestOuterClass$LimitedSessionToken0.getClass();
            this.limitedSessionToken_ = universalRequestOuterClass$LimitedSessionToken0;
            this.bitField0_ |= 0x200;
        }

        private void setOfferwallEnabled(boolean z) {
            this.bitField0_ |= 0x4000;
            this.offerwallEnabled_ = z;
        }

        private void setPii(Pii piiOuterClass$Pii0) {
            piiOuterClass$Pii0.getClass();
            this.pii_ = piiOuterClass$Pii0;
            this.bitField0_ |= 0x20;
        }

        private void setScarSignalsCollected(boolean z) {
            this.bitField0_ |= 0x100;
            this.scarSignalsCollected_ = z;
        }

        private void setSessionCounters(SessionCounters sessionCountersOuterClass$SessionCounters0) {
            sessionCountersOuterClass$SessionCounters0.getClass();
            this.sessionCounters_ = sessionCountersOuterClass$SessionCounters0;
            this.bitField0_ |= 4;
        }

        private void setSessionToken(ByteString byteString0) {
            byteString0.getClass();
            this.sessionToken_ = byteString0;
        }

        private void setStaticDeviceInfo(StaticDeviceInfo staticDeviceInfoOuterClass$StaticDeviceInfo0) {
            staticDeviceInfoOuterClass$StaticDeviceInfo0.getClass();
            this.staticDeviceInfo_ = staticDeviceInfoOuterClass$StaticDeviceInfo0;
            this.bitField0_ |= 8;
        }

        private void setTcf(ByteString byteString0) {
            byteString0.getClass();
            this.bitField0_ |= 0x80;
            this.tcf_ = byteString0;
        }

        private void setTestData(TestData testDataOuterClass$TestData0) {
            testDataOuterClass$TestData0.getClass();
            this.testData_ = testDataOuterClass$TestData0;
            this.bitField0_ |= 0x1000;
        }

        private void setTimestamps(Timestamps timestampsOuterClass$Timestamps0) {
            timestampsOuterClass$Timestamps0.getClass();
            this.timestamps_ = timestampsOuterClass$Timestamps0;
            this.bitField0_ |= 2;
        }

        private void setTokenCounters(TokenCounters headerBiddingTokenOuterClass$TokenCounters0) {
            headerBiddingTokenOuterClass$TokenCounters0.getClass();
            this.tokenCounters_ = headerBiddingTokenOuterClass$TokenCounters0;
            this.bitField0_ |= 0x2000;
        }

        private void setTokenId(ByteString byteString0) {
            byteString0.getClass();
            this.tokenId_ = byteString0;
        }

        private void setTokenNumber(int v) {
            this.tokenNumber_ = v;
        }
    }

    public interface HeaderBiddingTokenOrBuilder extends MessageLiteOrBuilder {
        AdFormat getAdFormat();

        int getAdFormatValue();

        CampaignState getCampaignState();

        ClientInfo getClientInfo();

        DynamicDeviceInfo getDynamicDeviceInfo();

        InitializationData getInitializationData();

        LimitedSessionToken getLimitedSessionToken();

        boolean getOfferwallEnabled();

        Pii getPii();

        boolean getScarSignalsCollected();

        SessionCounters getSessionCounters();

        ByteString getSessionToken();

        StaticDeviceInfo getStaticDeviceInfo();

        ByteString getTcf();

        TestData getTestData();

        Timestamps getTimestamps();

        TokenCounters getTokenCounters();

        ByteString getTokenId();

        int getTokenNumber();

        boolean hasAdFormat();

        boolean hasCampaignState();

        boolean hasClientInfo();

        boolean hasDynamicDeviceInfo();

        boolean hasInitializationData();

        boolean hasLimitedSessionToken();

        boolean hasOfferwallEnabled();

        boolean hasPii();

        boolean hasScarSignalsCollected();

        boolean hasSessionCounters();

        boolean hasStaticDeviceInfo();

        boolean hasTcf();

        boolean hasTestData();

        boolean hasTimestamps();

        boolean hasTokenCounters();
    }

    public static final class TokenCounters extends GeneratedMessageLite implements TokenCountersOrBuilder {
        public static final class gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder extends com.google.protobuf.GeneratedMessageLite.Builder implements TokenCountersOrBuilder {
            private gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder() {
                super(TokenCounters.DEFAULT_INSTANCE);
            }

            gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder(a headerBiddingTokenOuterClass$a0) {
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder clearSeq() {
                this.copyOnWrite();
                ((TokenCounters)this.instance).clearSeq();
                return this;
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder clearStarts() {
                this.copyOnWrite();
                ((TokenCounters)this.instance).clearStarts();
                return this;
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder clearWins() {
                this.copyOnWrite();
                ((TokenCounters)this.instance).clearWins();
                return this;
            }

            @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCountersOrBuilder
            public int getSeq() {
                return ((TokenCounters)this.instance).getSeq();
            }

            @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCountersOrBuilder
            public int getStarts() {
                return ((TokenCounters)this.instance).getStarts();
            }

            @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCountersOrBuilder
            public int getWins() {
                return ((TokenCounters)this.instance).getWins();
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder setSeq(int v) {
                this.copyOnWrite();
                ((TokenCounters)this.instance).setSeq(v);
                return this;
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder setStarts(int v) {
                this.copyOnWrite();
                ((TokenCounters)this.instance).setStarts(v);
                return this;
            }

            public gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder setWins(int v) {
                this.copyOnWrite();
                ((TokenCounters)this.instance).setWins(v);
                return this;
            }
        }

        private static final TokenCounters DEFAULT_INSTANCE = null;
        private static volatile Parser PARSER = null;
        public static final int SEQ_FIELD_NUMBER = 1;
        public static final int STARTS_FIELD_NUMBER = 3;
        public static final int WINS_FIELD_NUMBER = 2;
        private int seq_;
        private int starts_;
        private int wins_;

        static {
            TokenCounters headerBiddingTokenOuterClass$TokenCounters0 = new TokenCounters();
            TokenCounters.DEFAULT_INSTANCE = headerBiddingTokenOuterClass$TokenCounters0;
            GeneratedMessageLite.registerDefaultInstance(TokenCounters.class, headerBiddingTokenOuterClass$TokenCounters0);
        }

        private void clearSeq() {
            this.seq_ = 0;
        }

        private void clearStarts() {
            this.starts_ = 0;
        }

        private void clearWins() {
            this.wins_ = 0;
        }

        @Override  // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(MethodToInvoke generatedMessageLite$MethodToInvoke0, Object object0, Object object1) {
            switch(generatedMessageLite$MethodToInvoke0) {
                case 1: {
                    return new TokenCounters();
                }
                case 2: {
                    return new gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder(null);
                }
                case 3: {
                    return GeneratedMessageLite.newMessageInfo(TokenCounters.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new Object[]{"seq_", "wins_", "starts_"});
                }
                case 4: {
                    return TokenCounters.DEFAULT_INSTANCE;
                }
                case 5: {
                    Parser parser0 = TokenCounters.PARSER;
                    if(parser0 == null) {
                        Class class0 = TokenCounters.class;
                        synchronized(class0) {
                            parser0 = TokenCounters.PARSER;
                            if(parser0 == null) {
                                parser0 = new DefaultInstanceBasedParser(TokenCounters.DEFAULT_INSTANCE);
                                TokenCounters.PARSER = parser0;
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

        public static TokenCounters getDefaultInstance() {
            return TokenCounters.DEFAULT_INSTANCE;
        }

        @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCountersOrBuilder
        public int getSeq() {
            return this.seq_;
        }

        @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCountersOrBuilder
        public int getStarts() {
            return this.starts_;
        }

        @Override  // gatewayprotocol.v1.HeaderBiddingTokenOuterClass$TokenCountersOrBuilder
        public int getWins() {
            return this.wins_;
        }

        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder newBuilder() {
            return (gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder)TokenCounters.DEFAULT_INSTANCE.createBuilder();
        }

        public static gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder newBuilder(TokenCounters headerBiddingTokenOuterClass$TokenCounters0) {
            return (gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder)TokenCounters.DEFAULT_INSTANCE.createBuilder(headerBiddingTokenOuterClass$TokenCounters0);
        }

        public static TokenCounters parseDelimitedFrom(InputStream inputStream0) throws IOException {
            return (TokenCounters)GeneratedMessageLite.parseDelimitedFrom(TokenCounters.DEFAULT_INSTANCE, inputStream0);
        }

        public static TokenCounters parseDelimitedFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (TokenCounters)GeneratedMessageLite.parseDelimitedFrom(TokenCounters.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static TokenCounters parseFrom(ByteString byteString0) throws InvalidProtocolBufferException {
            return (TokenCounters)GeneratedMessageLite.parseFrom(TokenCounters.DEFAULT_INSTANCE, byteString0);
        }

        public static TokenCounters parseFrom(ByteString byteString0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (TokenCounters)GeneratedMessageLite.parseFrom(TokenCounters.DEFAULT_INSTANCE, byteString0, extensionRegistryLite0);
        }

        public static TokenCounters parseFrom(CodedInputStream codedInputStream0) throws IOException {
            return (TokenCounters)GeneratedMessageLite.parseFrom(TokenCounters.DEFAULT_INSTANCE, codedInputStream0);
        }

        public static TokenCounters parseFrom(CodedInputStream codedInputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (TokenCounters)GeneratedMessageLite.parseFrom(TokenCounters.DEFAULT_INSTANCE, codedInputStream0, extensionRegistryLite0);
        }

        public static TokenCounters parseFrom(InputStream inputStream0) throws IOException {
            return (TokenCounters)GeneratedMessageLite.parseFrom(TokenCounters.DEFAULT_INSTANCE, inputStream0);
        }

        public static TokenCounters parseFrom(InputStream inputStream0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
            return (TokenCounters)GeneratedMessageLite.parseFrom(TokenCounters.DEFAULT_INSTANCE, inputStream0, extensionRegistryLite0);
        }

        public static TokenCounters parseFrom(ByteBuffer byteBuffer0) throws InvalidProtocolBufferException {
            return (TokenCounters)GeneratedMessageLite.parseFrom(TokenCounters.DEFAULT_INSTANCE, byteBuffer0);
        }

        public static TokenCounters parseFrom(ByteBuffer byteBuffer0, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (TokenCounters)GeneratedMessageLite.parseFrom(TokenCounters.DEFAULT_INSTANCE, byteBuffer0, extensionRegistryLite0);
        }

        public static TokenCounters parseFrom(byte[] arr_b) throws InvalidProtocolBufferException {
            return (TokenCounters)GeneratedMessageLite.parseFrom(TokenCounters.DEFAULT_INSTANCE, arr_b);
        }

        public static TokenCounters parseFrom(byte[] arr_b, ExtensionRegistryLite extensionRegistryLite0) throws InvalidProtocolBufferException {
            return (TokenCounters)GeneratedMessageLite.parseFrom(TokenCounters.DEFAULT_INSTANCE, arr_b, extensionRegistryLite0);
        }

        public static Parser parser() {
            return TokenCounters.DEFAULT_INSTANCE.getParserForType();
        }

        private void setSeq(int v) {
            this.seq_ = v;
        }

        private void setStarts(int v) {
            this.starts_ = v;
        }

        private void setWins(int v) {
            this.wins_ = v;
        }
    }

    public interface TokenCountersOrBuilder extends MessageLiteOrBuilder {
        int getSeq();

        int getStarts();

        int getWins();
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

