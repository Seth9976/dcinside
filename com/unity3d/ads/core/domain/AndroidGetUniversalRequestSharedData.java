package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.repository.DeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.TimestampExtensionsKt;
import gatewayprotocol.v1.PiiOuterClass.Pii;
import gatewayprotocol.v1.UniversalRequestKt.SharedDataKt.Dsl;
import gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken;
import gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData.Builder;
import gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidGetUniversalRequestSharedData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidGetUniversalRequestSharedData.kt\ncom/unity3d/ads/core/domain/AndroidGetUniversalRequestSharedData\n+ 2 UniversalRequestKt.kt\ngatewayprotocol/v1/UniversalRequestKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n108#2:37\n1#3:38\n*S KotlinDebug\n*F\n+ 1 AndroidGetUniversalRequestSharedData.kt\ncom/unity3d/ads/core/domain/AndroidGetUniversalRequestSharedData\n*L\n19#1:37\n19#1:38\n*E\n"})
public final class AndroidGetUniversalRequestSharedData implements GetUniversalRequestSharedData {
    @l
    private final DeveloperConsentRepository developerConsentRepository;
    @l
    private final DeviceInfoRepository deviceInfoRepository;
    @l
    private final GetLimitedSessionToken getLimitedSessionToken;
    @l
    private final GetSharedDataTimestamps getSharedDataTimestamps;
    @l
    private final SessionRepository sessionRepository;

    public AndroidGetUniversalRequestSharedData(@l GetSharedDataTimestamps getSharedDataTimestamps0, @l SessionRepository sessionRepository0, @l DeviceInfoRepository deviceInfoRepository0, @l GetLimitedSessionToken getLimitedSessionToken0, @l DeveloperConsentRepository developerConsentRepository0) {
        L.p(getSharedDataTimestamps0, "getSharedDataTimestamps");
        L.p(sessionRepository0, "sessionRepository");
        L.p(deviceInfoRepository0, "deviceInfoRepository");
        L.p(getLimitedSessionToken0, "getLimitedSessionToken");
        L.p(developerConsentRepository0, "developerConsentRepository");
        super();
        this.getSharedDataTimestamps = getSharedDataTimestamps0;
        this.sessionRepository = sessionRepository0;
        this.deviceInfoRepository = deviceInfoRepository0;
        this.getLimitedSessionToken = getLimitedSessionToken0;
        this.developerConsentRepository = developerConsentRepository0;
    }

    @Override  // com.unity3d.ads.core.domain.GetUniversalRequestSharedData
    @m
    public Object invoke(@l d d0) {
        Dsl universalRequestKt$SharedDataKt$Dsl1;
        AndroidGetUniversalRequestSharedData androidGetUniversalRequestSharedData0;
        Dsl universalRequestKt$SharedDataKt$Dsl0;
        com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData.invoke.1 androidGetUniversalRequestSharedData$invoke$10;
        if(d0 instanceof com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData.invoke.1) {
            androidGetUniversalRequestSharedData$invoke$10 = (com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData.invoke.1)d0;
            int v = androidGetUniversalRequestSharedData$invoke$10.label;
            if((v & 0x80000000) == 0) {
                androidGetUniversalRequestSharedData$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return d0.invoke(this);
                    }
                };
            }
            else {
                androidGetUniversalRequestSharedData$invoke$10.label = v ^ 0x80000000;
            }
        }
        else {
            androidGetUniversalRequestSharedData$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return d0.invoke(this);
                }
            };
        }
        Object object0 = androidGetUniversalRequestSharedData$invoke$10.result;
        Object object1 = b.l();
        switch(androidGetUniversalRequestSharedData$invoke$10.label) {
            case 0: {
                f0.n(object0);
                Builder universalRequestOuterClass$UniversalRequest$SharedData$Builder0 = SharedData.newBuilder();
                L.o(universalRequestOuterClass$UniversalRequest$SharedData$Builder0, "newBuilder()");
                universalRequestKt$SharedDataKt$Dsl0 = Dsl.Companion._create(universalRequestOuterClass$UniversalRequest$SharedData$Builder0);
                ByteString byteString0 = this.sessionRepository.getSessionToken();
                if(byteString0.isEmpty()) {
                    androidGetUniversalRequestSharedData$invoke$10.L$0 = this;
                    androidGetUniversalRequestSharedData$invoke$10.L$1 = universalRequestKt$SharedDataKt$Dsl0;
                    androidGetUniversalRequestSharedData$invoke$10.L$2 = universalRequestKt$SharedDataKt$Dsl0;
                    androidGetUniversalRequestSharedData$invoke$10.L$3 = universalRequestKt$SharedDataKt$Dsl0;
                    androidGetUniversalRequestSharedData$invoke$10.label = 1;
                    Object object2 = this.getLimitedSessionToken.invoke(androidGetUniversalRequestSharedData$invoke$10);
                    if(object2 == object1) {
                        return object1;
                    }
                    universalRequestKt$SharedDataKt$Dsl1 = universalRequestKt$SharedDataKt$Dsl0;
                    androidGetUniversalRequestSharedData0 = this;
                    universalRequestKt$SharedDataKt$Dsl0.setLimitedSessionToken(((LimitedSessionToken)object2));
                }
                else {
                    universalRequestKt$SharedDataKt$Dsl0.setSessionToken(byteString0);
                    androidGetUniversalRequestSharedData0 = this;
                    universalRequestKt$SharedDataKt$Dsl1 = universalRequestKt$SharedDataKt$Dsl0;
                }
                break;
            }
            case 1: {
                Dsl universalRequestKt$SharedDataKt$Dsl2 = (Dsl)androidGetUniversalRequestSharedData$invoke$10.L$3;
                Dsl universalRequestKt$SharedDataKt$Dsl3 = (Dsl)androidGetUniversalRequestSharedData$invoke$10.L$2;
                universalRequestKt$SharedDataKt$Dsl1 = (Dsl)androidGetUniversalRequestSharedData$invoke$10.L$1;
                androidGetUniversalRequestSharedData0 = (AndroidGetUniversalRequestSharedData)androidGetUniversalRequestSharedData$invoke$10.L$0;
                f0.n(object0);
                universalRequestKt$SharedDataKt$Dsl2.setLimitedSessionToken(((LimitedSessionToken)object0));
                universalRequestKt$SharedDataKt$Dsl0 = universalRequestKt$SharedDataKt$Dsl3;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        universalRequestKt$SharedDataKt$Dsl0.setTimestamps(androidGetUniversalRequestSharedData0.getSharedDataTimestamps.invoke());
        universalRequestKt$SharedDataKt$Dsl0.setSdkStartTime(TimestampExtensionsKt.fromMillis(0L));
        universalRequestKt$SharedDataKt$Dsl0.setAppStartTime(TimestampExtensionsKt.fromMillis(0L));
        universalRequestKt$SharedDataKt$Dsl0.setDeveloperConsent(androidGetUniversalRequestSharedData0.developerConsentRepository.getDeveloperConsent());
        Pii piiOuterClass$Pii0 = androidGetUniversalRequestSharedData0.deviceInfoRepository.getPiiData();
        if(!piiOuterClass$Pii0.getAdvertisingId().isEmpty() || !piiOuterClass$Pii0.getOpenAdvertisingTrackingId().isEmpty()) {
            universalRequestKt$SharedDataKt$Dsl0.setPii(piiOuterClass$Pii0);
        }
        return universalRequestKt$SharedDataKt$Dsl1._build();
    }
}

