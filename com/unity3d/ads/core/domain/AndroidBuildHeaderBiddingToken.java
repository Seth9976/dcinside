package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.model.TokenCounters;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TcfRepository;
import gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo;
import gatewayprotocol.v1.HeaderBiddingTokenKt.Dsl;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken;
import gatewayprotocol.v1.InitializationDataOuterClass.InitializationData;
import gatewayprotocol.v1.PiiOuterClass.Pii;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo;
import gatewayprotocol.v1.TestDataOuterClass.TestData;
import gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidBuildHeaderBiddingToken.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidBuildHeaderBiddingToken.kt\ncom/unity3d/ads/core/domain/AndroidBuildHeaderBiddingToken\n+ 2 HeaderBiddingTokenKt.kt\ngatewayprotocol/v1/HeaderBiddingTokenKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 TokenCountersKt.kt\ngatewayprotocol/v1/TokenCountersKtKt\n*L\n1#1,69:1\n10#2:70\n1#3:71\n1#3:72\n1#3:74\n10#4:73\n*S KotlinDebug\n*F\n+ 1 AndroidBuildHeaderBiddingToken.kt\ncom/unity3d/ads/core/domain/AndroidBuildHeaderBiddingToken\n*L\n32#1:70\n32#1:71\n62#1:74\n62#1:73\n*E\n"})
public final class AndroidBuildHeaderBiddingToken implements BuildHeaderBiddingToken {
    @l
    private final CampaignRepository campaignRepository;
    @l
    private final DeviceInfoRepository deviceInfoRepository;
    @l
    private final GetByteStringId generateId;
    @l
    private final GetClientInfo getClientInfo;
    @l
    private final GetInitializationData getInitializationData;
    @l
    private final GetLimitedSessionToken getLimitedSessionToken;
    @l
    private final GetSharedDataTimestamps getTimestamps;
    @l
    private final OfferwallManager offerwallManager;
    @l
    private final SessionRepository sessionRepository;
    @l
    private final TcfRepository tcfRepository;
    @l
    private final AndroidTestDataInfo testDataInfo;

    public AndroidBuildHeaderBiddingToken(@l GetByteStringId getByteStringId0, @l GetClientInfo getClientInfo0, @l GetSharedDataTimestamps getSharedDataTimestamps0, @l GetLimitedSessionToken getLimitedSessionToken0, @l GetInitializationData getInitializationData0, @l DeviceInfoRepository deviceInfoRepository0, @l SessionRepository sessionRepository0, @l CampaignRepository campaignRepository0, @l TcfRepository tcfRepository0, @l AndroidTestDataInfo androidTestDataInfo0, @l OfferwallManager offerwallManager0) {
        L.p(getByteStringId0, "generateId");
        L.p(getClientInfo0, "getClientInfo");
        L.p(getSharedDataTimestamps0, "getTimestamps");
        L.p(getLimitedSessionToken0, "getLimitedSessionToken");
        L.p(getInitializationData0, "getInitializationData");
        L.p(deviceInfoRepository0, "deviceInfoRepository");
        L.p(sessionRepository0, "sessionRepository");
        L.p(campaignRepository0, "campaignRepository");
        L.p(tcfRepository0, "tcfRepository");
        L.p(androidTestDataInfo0, "testDataInfo");
        L.p(offerwallManager0, "offerwallManager");
        super();
        this.generateId = getByteStringId0;
        this.getClientInfo = getClientInfo0;
        this.getTimestamps = getSharedDataTimestamps0;
        this.getLimitedSessionToken = getLimitedSessionToken0;
        this.getInitializationData = getInitializationData0;
        this.deviceInfoRepository = deviceInfoRepository0;
        this.sessionRepository = sessionRepository0;
        this.campaignRepository = campaignRepository0;
        this.tcfRepository = tcfRepository0;
        this.testDataInfo = androidTestDataInfo0;
        this.offerwallManager = offerwallManager0;
    }

    @Override  // com.unity3d.ads.core.domain.BuildHeaderBiddingToken
    @m
    public Object invoke(boolean z, @l d d0) {
        AndroidBuildHeaderBiddingToken androidBuildHeaderBiddingToken3;
        Dsl headerBiddingTokenKt$Dsl11;
        TokenCounters tokenCounters3;
        Dsl headerBiddingTokenKt$Dsl10;
        Dsl headerBiddingTokenKt$Dsl9;
        AndroidBuildHeaderBiddingToken androidBuildHeaderBiddingToken2;
        TokenCounters tokenCounters2;
        Dsl headerBiddingTokenKt$Dsl6;
        AndroidBuildHeaderBiddingToken androidBuildHeaderBiddingToken1;
        TokenCounters tokenCounters1;
        ByteString byteString1;
        Dsl headerBiddingTokenKt$Dsl5;
        Dsl headerBiddingTokenKt$Dsl4;
        Dsl headerBiddingTokenKt$Dsl3;
        Dsl headerBiddingTokenKt$Dsl2;
        Dsl headerBiddingTokenKt$Dsl1;
        AndroidBuildHeaderBiddingToken androidBuildHeaderBiddingToken0;
        Dsl headerBiddingTokenKt$Dsl0;
        ByteString byteString0;
        TokenCounters tokenCounters0;
        com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken.invoke.1 androidBuildHeaderBiddingToken$invoke$10;
        if(d0 instanceof com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken.invoke.1) {
            androidBuildHeaderBiddingToken$invoke$10 = (com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken.invoke.1)d0;
            int v = androidBuildHeaderBiddingToken$invoke$10.label;
            if((v & 0x80000000) == 0) {
                androidBuildHeaderBiddingToken$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    Object L$5;
                    boolean Z$0;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.invoke(false, this);
                    }
                };
            }
            else {
                androidBuildHeaderBiddingToken$invoke$10.label = v ^ 0x80000000;
            }
        }
        else {
            androidBuildHeaderBiddingToken$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                Object L$4;
                Object L$5;
                boolean Z$0;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.invoke(false, this);
                }
            };
        }
        Object object0 = androidBuildHeaderBiddingToken$invoke$10.result;
        Object object1 = b.l();
        boolean z1 = true;
        switch(androidBuildHeaderBiddingToken$invoke$10.label) {
            case 0: {
                f0.n(object0);
                tokenCounters0 = this.sessionRepository.getTokenCounters();
                byteString0 = this.sessionRepository.getSessionToken();
                this.sessionRepository.incrementTokenSequenceNumber();
                Builder headerBiddingTokenOuterClass$HeaderBiddingToken$Builder0 = HeaderBiddingToken.newBuilder();
                L.o(headerBiddingTokenOuterClass$HeaderBiddingToken$Builder0, "newBuilder()");
                headerBiddingTokenKt$Dsl0 = Dsl.Companion._create(headerBiddingTokenOuterClass$HeaderBiddingToken$Builder0);
                headerBiddingTokenKt$Dsl0.setTokenId(this.generateId.invoke());
                headerBiddingTokenKt$Dsl0.setTokenNumber(this.sessionRepository.getHeaderBiddingTokenCounter());
                androidBuildHeaderBiddingToken$invoke$10.L$0 = this;
                androidBuildHeaderBiddingToken$invoke$10.L$1 = tokenCounters0;
                androidBuildHeaderBiddingToken$invoke$10.L$2 = byteString0;
                androidBuildHeaderBiddingToken$invoke$10.L$3 = headerBiddingTokenKt$Dsl0;
                androidBuildHeaderBiddingToken$invoke$10.L$4 = headerBiddingTokenKt$Dsl0;
                androidBuildHeaderBiddingToken$invoke$10.L$5 = headerBiddingTokenKt$Dsl0;
                androidBuildHeaderBiddingToken$invoke$10.Z$0 = z;
                androidBuildHeaderBiddingToken$invoke$10.label = 1;
                object0 = this.getClientInfo.invoke(androidBuildHeaderBiddingToken$invoke$10);
                if(object0 == object1) {
                    return object1;
                }
                androidBuildHeaderBiddingToken0 = this;
                headerBiddingTokenKt$Dsl1 = headerBiddingTokenKt$Dsl0;
                headerBiddingTokenKt$Dsl2 = headerBiddingTokenKt$Dsl1;
                goto label_46;
            }
            case 1: {
                z = androidBuildHeaderBiddingToken$invoke$10.Z$0;
                headerBiddingTokenKt$Dsl0 = (Dsl)androidBuildHeaderBiddingToken$invoke$10.L$5;
                headerBiddingTokenKt$Dsl1 = (Dsl)androidBuildHeaderBiddingToken$invoke$10.L$4;
                headerBiddingTokenKt$Dsl2 = (Dsl)androidBuildHeaderBiddingToken$invoke$10.L$3;
                byteString0 = (ByteString)androidBuildHeaderBiddingToken$invoke$10.L$2;
                tokenCounters0 = (TokenCounters)androidBuildHeaderBiddingToken$invoke$10.L$1;
                androidBuildHeaderBiddingToken0 = (AndroidBuildHeaderBiddingToken)androidBuildHeaderBiddingToken$invoke$10.L$0;
                f0.n(object0);
            label_46:
                headerBiddingTokenKt$Dsl0.setClientInfo(((ClientInfo)object0));
                headerBiddingTokenKt$Dsl1.setTimestamps(androidBuildHeaderBiddingToken0.getTimestamps.invoke());
                headerBiddingTokenKt$Dsl1.setSessionCounters(androidBuildHeaderBiddingToken0.sessionRepository.getSessionCounters());
                headerBiddingTokenKt$Dsl1.setDynamicDeviceInfo(androidBuildHeaderBiddingToken0.deviceInfoRepository.getDynamicDeviceInfo());
                Pii piiOuterClass$Pii0 = androidBuildHeaderBiddingToken0.deviceInfoRepository.getPiiData();
                if(!piiOuterClass$Pii0.getAdvertisingId().isEmpty() || !piiOuterClass$Pii0.getOpenAdvertisingTrackingId().isEmpty()) {
                    headerBiddingTokenKt$Dsl1.setPii(piiOuterClass$Pii0);
                }
                headerBiddingTokenKt$Dsl1.setCampaignState(androidBuildHeaderBiddingToken0.campaignRepository.getCampaignState());
                String s = androidBuildHeaderBiddingToken0.tcfRepository.getTcfString();
                if(s != null) {
                    headerBiddingTokenKt$Dsl1.setTcf(ByteStringsKt.toByteStringUtf8(s));
                }
                headerBiddingTokenKt$Dsl1.setScarSignalsCollected(z);
                androidBuildHeaderBiddingToken$invoke$10.L$0 = androidBuildHeaderBiddingToken0;
                androidBuildHeaderBiddingToken$invoke$10.L$1 = tokenCounters0;
                androidBuildHeaderBiddingToken$invoke$10.L$2 = byteString0;
                androidBuildHeaderBiddingToken$invoke$10.L$3 = headerBiddingTokenKt$Dsl2;
                androidBuildHeaderBiddingToken$invoke$10.L$4 = headerBiddingTokenKt$Dsl1;
                androidBuildHeaderBiddingToken$invoke$10.L$5 = headerBiddingTokenKt$Dsl1;
                androidBuildHeaderBiddingToken$invoke$10.label = 2;
                object0 = androidBuildHeaderBiddingToken0.offerwallManager.isConnected(androidBuildHeaderBiddingToken$invoke$10);
                if(object0 == object1) {
                    return object1;
                }
                headerBiddingTokenKt$Dsl3 = headerBiddingTokenKt$Dsl1;
                headerBiddingTokenKt$Dsl4 = headerBiddingTokenKt$Dsl3;
                headerBiddingTokenKt$Dsl5 = headerBiddingTokenKt$Dsl2;
                byteString1 = byteString0;
                tokenCounters1 = tokenCounters0;
                androidBuildHeaderBiddingToken1 = androidBuildHeaderBiddingToken0;
                goto label_82;
            }
            case 2: {
                headerBiddingTokenKt$Dsl3 = (Dsl)androidBuildHeaderBiddingToken$invoke$10.L$5;
                headerBiddingTokenKt$Dsl4 = (Dsl)androidBuildHeaderBiddingToken$invoke$10.L$4;
                headerBiddingTokenKt$Dsl5 = (Dsl)androidBuildHeaderBiddingToken$invoke$10.L$3;
                byteString1 = (ByteString)androidBuildHeaderBiddingToken$invoke$10.L$2;
                tokenCounters1 = (TokenCounters)androidBuildHeaderBiddingToken$invoke$10.L$1;
                androidBuildHeaderBiddingToken1 = (AndroidBuildHeaderBiddingToken)androidBuildHeaderBiddingToken$invoke$10.L$0;
                f0.n(object0);
            label_82:
                if(((Boolean)object0).booleanValue()) {
                    androidBuildHeaderBiddingToken$invoke$10.L$0 = androidBuildHeaderBiddingToken1;
                    androidBuildHeaderBiddingToken$invoke$10.L$1 = tokenCounters1;
                    androidBuildHeaderBiddingToken$invoke$10.L$2 = byteString1;
                    androidBuildHeaderBiddingToken$invoke$10.L$3 = headerBiddingTokenKt$Dsl5;
                    androidBuildHeaderBiddingToken$invoke$10.L$4 = headerBiddingTokenKt$Dsl4;
                    androidBuildHeaderBiddingToken$invoke$10.L$5 = headerBiddingTokenKt$Dsl3;
                    androidBuildHeaderBiddingToken$invoke$10.label = 3;
                    object0 = androidBuildHeaderBiddingToken1.offerwallManager.isContentReady(androidBuildHeaderBiddingToken$invoke$10);
                    if(object0 == object1) {
                        return object1;
                    }
                    goto label_102;
                }
                else {
                    z1 = false;
                }
                goto label_104;
            }
            case 3: {
                headerBiddingTokenKt$Dsl3 = (Dsl)androidBuildHeaderBiddingToken$invoke$10.L$5;
                headerBiddingTokenKt$Dsl4 = (Dsl)androidBuildHeaderBiddingToken$invoke$10.L$4;
                headerBiddingTokenKt$Dsl5 = (Dsl)androidBuildHeaderBiddingToken$invoke$10.L$3;
                byteString1 = (ByteString)androidBuildHeaderBiddingToken$invoke$10.L$2;
                tokenCounters1 = (TokenCounters)androidBuildHeaderBiddingToken$invoke$10.L$1;
                androidBuildHeaderBiddingToken1 = (AndroidBuildHeaderBiddingToken)androidBuildHeaderBiddingToken$invoke$10.L$0;
                f0.n(object0);
            label_102:
                if(((Boolean)object0).booleanValue()) {
                    z1 = false;
                }
            label_104:
                headerBiddingTokenKt$Dsl3.setOfferwallEnabled(z1);
                if(byteString1.isEmpty()) {
                    String s1 = androidBuildHeaderBiddingToken1.sessionRepository.getGameId();
                    if(s1 == null || s1.length() <= 0) {
                        androidBuildHeaderBiddingToken$invoke$10.L$0 = androidBuildHeaderBiddingToken1;
                        androidBuildHeaderBiddingToken$invoke$10.L$1 = tokenCounters1;
                        androidBuildHeaderBiddingToken$invoke$10.L$2 = headerBiddingTokenKt$Dsl5;
                        androidBuildHeaderBiddingToken$invoke$10.L$3 = headerBiddingTokenKt$Dsl4;
                        androidBuildHeaderBiddingToken$invoke$10.L$4 = headerBiddingTokenKt$Dsl4;
                        androidBuildHeaderBiddingToken$invoke$10.L$5 = null;
                        androidBuildHeaderBiddingToken$invoke$10.label = 5;
                        object0 = androidBuildHeaderBiddingToken1.getLimitedSessionToken.invoke(androidBuildHeaderBiddingToken$invoke$10);
                        if(object0 == object1) {
                            return object1;
                        }
                        headerBiddingTokenKt$Dsl6 = headerBiddingTokenKt$Dsl5;
                        tokenCounters2 = tokenCounters1;
                        androidBuildHeaderBiddingToken2 = androidBuildHeaderBiddingToken1;
                        headerBiddingTokenKt$Dsl4.setLimitedSessionToken(((LimitedSessionToken)object0));
                    }
                    else {
                        androidBuildHeaderBiddingToken$invoke$10.L$0 = androidBuildHeaderBiddingToken1;
                        androidBuildHeaderBiddingToken$invoke$10.L$1 = tokenCounters1;
                        androidBuildHeaderBiddingToken$invoke$10.L$2 = headerBiddingTokenKt$Dsl5;
                        androidBuildHeaderBiddingToken$invoke$10.L$3 = headerBiddingTokenKt$Dsl4;
                        androidBuildHeaderBiddingToken$invoke$10.L$4 = headerBiddingTokenKt$Dsl4;
                        androidBuildHeaderBiddingToken$invoke$10.L$5 = null;
                        androidBuildHeaderBiddingToken$invoke$10.label = 4;
                        object0 = androidBuildHeaderBiddingToken1.getInitializationData.invoke(androidBuildHeaderBiddingToken$invoke$10);
                        if(object0 == object1) {
                            return object1;
                        }
                        headerBiddingTokenKt$Dsl6 = headerBiddingTokenKt$Dsl5;
                        tokenCounters2 = tokenCounters1;
                        androidBuildHeaderBiddingToken2 = androidBuildHeaderBiddingToken1;
                        headerBiddingTokenKt$Dsl4.setInitializationData(((InitializationData)object0));
                    }
                    goto label_156;
                }
                else {
                    headerBiddingTokenKt$Dsl4.setSessionToken(androidBuildHeaderBiddingToken1.sessionRepository.getSessionToken());
                    headerBiddingTokenKt$Dsl4.setStaticDeviceInfo(androidBuildHeaderBiddingToken1.deviceInfoRepository.cachedStaticDeviceInfo());
                }
                break;
            }
            case 4: {
                Dsl headerBiddingTokenKt$Dsl7 = (Dsl)androidBuildHeaderBiddingToken$invoke$10.L$4;
                headerBiddingTokenKt$Dsl4 = (Dsl)androidBuildHeaderBiddingToken$invoke$10.L$3;
                headerBiddingTokenKt$Dsl6 = (Dsl)androidBuildHeaderBiddingToken$invoke$10.L$2;
                tokenCounters2 = (TokenCounters)androidBuildHeaderBiddingToken$invoke$10.L$1;
                androidBuildHeaderBiddingToken2 = (AndroidBuildHeaderBiddingToken)androidBuildHeaderBiddingToken$invoke$10.L$0;
                f0.n(object0);
                headerBiddingTokenKt$Dsl7.setInitializationData(((InitializationData)object0));
                goto label_156;
            }
            case 5: {
                Dsl headerBiddingTokenKt$Dsl8 = (Dsl)androidBuildHeaderBiddingToken$invoke$10.L$4;
                headerBiddingTokenKt$Dsl4 = (Dsl)androidBuildHeaderBiddingToken$invoke$10.L$3;
                headerBiddingTokenKt$Dsl6 = (Dsl)androidBuildHeaderBiddingToken$invoke$10.L$2;
                tokenCounters2 = (TokenCounters)androidBuildHeaderBiddingToken$invoke$10.L$1;
                androidBuildHeaderBiddingToken2 = (AndroidBuildHeaderBiddingToken)androidBuildHeaderBiddingToken$invoke$10.L$0;
                f0.n(object0);
                headerBiddingTokenKt$Dsl8.setLimitedSessionToken(((LimitedSessionToken)object0));
            label_156:
                headerBiddingTokenKt$Dsl9 = headerBiddingTokenKt$Dsl4;
                headerBiddingTokenKt$Dsl10 = headerBiddingTokenKt$Dsl6;
                tokenCounters3 = tokenCounters2;
                androidBuildHeaderBiddingToken$invoke$10.L$0 = androidBuildHeaderBiddingToken2;
                androidBuildHeaderBiddingToken$invoke$10.L$1 = tokenCounters3;
                androidBuildHeaderBiddingToken$invoke$10.L$2 = headerBiddingTokenKt$Dsl10;
                androidBuildHeaderBiddingToken$invoke$10.L$3 = headerBiddingTokenKt$Dsl9;
                androidBuildHeaderBiddingToken$invoke$10.L$4 = headerBiddingTokenKt$Dsl9;
                androidBuildHeaderBiddingToken$invoke$10.label = 6;
                object0 = androidBuildHeaderBiddingToken2.deviceInfoRepository.staticDeviceInfo(androidBuildHeaderBiddingToken$invoke$10);
                if(object0 == object1) {
                    return object1;
                }
                headerBiddingTokenKt$Dsl11 = headerBiddingTokenKt$Dsl9;
                androidBuildHeaderBiddingToken3 = androidBuildHeaderBiddingToken2;
                goto label_177;
            }
            case 6: {
                headerBiddingTokenKt$Dsl9 = (Dsl)androidBuildHeaderBiddingToken$invoke$10.L$4;
                headerBiddingTokenKt$Dsl11 = (Dsl)androidBuildHeaderBiddingToken$invoke$10.L$3;
                headerBiddingTokenKt$Dsl10 = (Dsl)androidBuildHeaderBiddingToken$invoke$10.L$2;
                tokenCounters3 = (TokenCounters)androidBuildHeaderBiddingToken$invoke$10.L$1;
                androidBuildHeaderBiddingToken3 = (AndroidBuildHeaderBiddingToken)androidBuildHeaderBiddingToken$invoke$10.L$0;
                f0.n(object0);
            label_177:
                headerBiddingTokenKt$Dsl9.setStaticDeviceInfo(((StaticDeviceInfo)object0));
                androidBuildHeaderBiddingToken1 = androidBuildHeaderBiddingToken3;
                headerBiddingTokenKt$Dsl5 = headerBiddingTokenKt$Dsl10;
                tokenCounters1 = tokenCounters3;
                headerBiddingTokenKt$Dsl4 = headerBiddingTokenKt$Dsl11;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        TestData testDataOuterClass$TestData0 = androidBuildHeaderBiddingToken1.testDataInfo.invoke();
        if(testDataOuterClass$TestData0 != null) {
            headerBiddingTokenKt$Dsl4.setTestData(testDataOuterClass$TestData0);
        }
        gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.Builder headerBiddingTokenOuterClass$TokenCounters$Builder0 = gatewayprotocol.v1.HeaderBiddingTokenOuterClass.TokenCounters.newBuilder();
        L.o(headerBiddingTokenOuterClass$TokenCounters$Builder0, "newBuilder()");
        gatewayprotocol.v1.TokenCountersKt.Dsl tokenCountersKt$Dsl0 = gatewayprotocol.v1.TokenCountersKt.Dsl.Companion._create(headerBiddingTokenOuterClass$TokenCounters$Builder0);
        tokenCountersKt$Dsl0.setSeq(tokenCounters1.getSeq());
        tokenCountersKt$Dsl0.setWins(tokenCounters1.getWins());
        tokenCountersKt$Dsl0.setStarts(tokenCounters1.getStarts());
        headerBiddingTokenKt$Dsl4.setTokenCounters(tokenCountersKt$Dsl0._build());
        return headerBiddingTokenKt$Dsl5._build();
    }
}

