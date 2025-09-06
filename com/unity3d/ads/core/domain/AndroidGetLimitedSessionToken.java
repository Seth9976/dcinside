package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.MediationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider;
import gatewayprotocol.v1.ClientInfoOuterClass.Platform;
import gatewayprotocol.v1.LimitedSessionTokenKt.Dsl;
import gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken.Builder;
import gatewayprotocol.v1.UniversalRequestOuterClass.LimitedSessionToken;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidGetLimitedSessionToken.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidGetLimitedSessionToken.kt\ncom/unity3d/ads/core/domain/AndroidGetLimitedSessionToken\n+ 2 LimitedSessionTokenKt.kt\ngatewayprotocol/v1/LimitedSessionTokenKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n10#2:39\n1#3:40\n1#3:41\n*S KotlinDebug\n*F\n+ 1 AndroidGetLimitedSessionToken.kt\ncom/unity3d/ads/core/domain/AndroidGetLimitedSessionToken\n*L\n17#1:39\n17#1:40\n*E\n"})
public final class AndroidGetLimitedSessionToken implements GetLimitedSessionToken {
    @l
    private final DeviceInfoRepository deviceInfoRepository;
    @l
    private final MediationRepository mediationRepository;
    @l
    private final SessionRepository sessionRepository;

    public AndroidGetLimitedSessionToken(@l DeviceInfoRepository deviceInfoRepository0, @l SessionRepository sessionRepository0, @l MediationRepository mediationRepository0) {
        L.p(deviceInfoRepository0, "deviceInfoRepository");
        L.p(sessionRepository0, "sessionRepository");
        L.p(mediationRepository0, "mediationRepository");
        super();
        this.deviceInfoRepository = deviceInfoRepository0;
        this.sessionRepository = sessionRepository0;
        this.mediationRepository = mediationRepository0;
    }

    @Override  // com.unity3d.ads.core.domain.GetLimitedSessionToken
    @m
    public Object invoke(@l d d0) {
        AndroidGetLimitedSessionToken androidGetLimitedSessionToken0;
        Dsl limitedSessionTokenKt$Dsl2;
        Dsl limitedSessionTokenKt$Dsl1;
        Dsl limitedSessionTokenKt$Dsl0;
        AndroidGetLimitedSessionToken androidGetLimitedSessionToken1;
        Dsl limitedSessionTokenKt$Dsl5;
        Dsl limitedSessionTokenKt$Dsl4;
        Dsl limitedSessionTokenKt$Dsl3;
        AndroidGetLimitedSessionToken androidGetLimitedSessionToken2;
        Dsl limitedSessionTokenKt$Dsl8;
        Dsl limitedSessionTokenKt$Dsl7;
        Dsl limitedSessionTokenKt$Dsl6;
        AndroidGetLimitedSessionToken androidGetLimitedSessionToken3;
        Dsl limitedSessionTokenKt$Dsl11;
        Dsl limitedSessionTokenKt$Dsl10;
        Dsl limitedSessionTokenKt$Dsl9;
        com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken.invoke.1 androidGetLimitedSessionToken$invoke$10;
        if(d0 instanceof com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken.invoke.1) {
            androidGetLimitedSessionToken$invoke$10 = (com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken.invoke.1)d0;
            int v = androidGetLimitedSessionToken$invoke$10.label;
            if((v & 0x80000000) == 0) {
                androidGetLimitedSessionToken$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
                androidGetLimitedSessionToken$invoke$10.label = v ^ 0x80000000;
            }
        }
        else {
            androidGetLimitedSessionToken$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
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
        Object object0 = androidGetLimitedSessionToken$invoke$10.result;
        Object object1 = b.l();
        switch(androidGetLimitedSessionToken$invoke$10.label) {
            case 0: {
                f0.n(object0);
                Builder universalRequestOuterClass$LimitedSessionToken$Builder0 = LimitedSessionToken.newBuilder();
                L.o(universalRequestOuterClass$LimitedSessionToken$Builder0, "newBuilder()");
                limitedSessionTokenKt$Dsl9 = Dsl.Companion._create(universalRequestOuterClass$LimitedSessionToken$Builder0);
                limitedSessionTokenKt$Dsl9.setSessionId(this.sessionRepository.getSessionId());
                androidGetLimitedSessionToken$invoke$10.L$0 = this;
                androidGetLimitedSessionToken$invoke$10.L$1 = limitedSessionTokenKt$Dsl9;
                androidGetLimitedSessionToken$invoke$10.L$2 = limitedSessionTokenKt$Dsl9;
                androidGetLimitedSessionToken$invoke$10.L$3 = limitedSessionTokenKt$Dsl9;
                androidGetLimitedSessionToken$invoke$10.label = 1;
                if(this.deviceInfoRepository.staticDeviceInfo(androidGetLimitedSessionToken$invoke$10) == object1) {
                    return object1;
                }
                androidGetLimitedSessionToken3 = this;
                limitedSessionTokenKt$Dsl10 = limitedSessionTokenKt$Dsl9;
                limitedSessionTokenKt$Dsl11 = limitedSessionTokenKt$Dsl10;
                break;
            }
            case 1: {
                limitedSessionTokenKt$Dsl9 = (Dsl)androidGetLimitedSessionToken$invoke$10.L$3;
                limitedSessionTokenKt$Dsl10 = (Dsl)androidGetLimitedSessionToken$invoke$10.L$2;
                limitedSessionTokenKt$Dsl11 = (Dsl)androidGetLimitedSessionToken$invoke$10.L$1;
                androidGetLimitedSessionToken3 = (AndroidGetLimitedSessionToken)androidGetLimitedSessionToken$invoke$10.L$0;
                f0.n(object0);
                break;
            }
            case 2: {
                limitedSessionTokenKt$Dsl6 = (Dsl)androidGetLimitedSessionToken$invoke$10.L$3;
                limitedSessionTokenKt$Dsl7 = (Dsl)androidGetLimitedSessionToken$invoke$10.L$2;
                limitedSessionTokenKt$Dsl8 = (Dsl)androidGetLimitedSessionToken$invoke$10.L$1;
                androidGetLimitedSessionToken2 = (AndroidGetLimitedSessionToken)androidGetLimitedSessionToken$invoke$10.L$0;
                f0.n(object0);
                goto label_65;
            }
            case 3: {
                limitedSessionTokenKt$Dsl3 = (Dsl)androidGetLimitedSessionToken$invoke$10.L$3;
                limitedSessionTokenKt$Dsl4 = (Dsl)androidGetLimitedSessionToken$invoke$10.L$2;
                limitedSessionTokenKt$Dsl5 = (Dsl)androidGetLimitedSessionToken$invoke$10.L$1;
                androidGetLimitedSessionToken1 = (AndroidGetLimitedSessionToken)androidGetLimitedSessionToken$invoke$10.L$0;
                f0.n(object0);
                goto label_78;
            }
            case 4: {
                limitedSessionTokenKt$Dsl0 = (Dsl)androidGetLimitedSessionToken$invoke$10.L$3;
                limitedSessionTokenKt$Dsl1 = (Dsl)androidGetLimitedSessionToken$invoke$10.L$2;
                limitedSessionTokenKt$Dsl2 = (Dsl)androidGetLimitedSessionToken$invoke$10.L$1;
                androidGetLimitedSessionToken0 = (AndroidGetLimitedSessionToken)androidGetLimitedSessionToken$invoke$10.L$0;
                f0.n(object0);
                goto label_92;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        L.o("", "deviceInfoRepository.staticDeviceInfo().deviceMake");
        limitedSessionTokenKt$Dsl9.setDeviceMake("");
        androidGetLimitedSessionToken$invoke$10.L$0 = androidGetLimitedSessionToken3;
        androidGetLimitedSessionToken$invoke$10.L$1 = limitedSessionTokenKt$Dsl11;
        androidGetLimitedSessionToken$invoke$10.L$2 = limitedSessionTokenKt$Dsl10;
        androidGetLimitedSessionToken$invoke$10.L$3 = limitedSessionTokenKt$Dsl10;
        androidGetLimitedSessionToken$invoke$10.label = 2;
        if(androidGetLimitedSessionToken3.deviceInfoRepository.staticDeviceInfo(androidGetLimitedSessionToken$invoke$10) == object1) {
            return object1;
        }
        limitedSessionTokenKt$Dsl6 = limitedSessionTokenKt$Dsl10;
        limitedSessionTokenKt$Dsl7 = limitedSessionTokenKt$Dsl6;
        limitedSessionTokenKt$Dsl8 = limitedSessionTokenKt$Dsl11;
        androidGetLimitedSessionToken2 = androidGetLimitedSessionToken3;
    label_65:
        L.o("", "deviceInfoRepository.sta…cDeviceInfo().deviceModel");
        limitedSessionTokenKt$Dsl6.setDeviceModel("");
        androidGetLimitedSessionToken$invoke$10.L$0 = androidGetLimitedSessionToken2;
        androidGetLimitedSessionToken$invoke$10.L$1 = limitedSessionTokenKt$Dsl8;
        androidGetLimitedSessionToken$invoke$10.L$2 = limitedSessionTokenKt$Dsl7;
        androidGetLimitedSessionToken$invoke$10.L$3 = limitedSessionTokenKt$Dsl7;
        androidGetLimitedSessionToken$invoke$10.label = 3;
        if(androidGetLimitedSessionToken2.deviceInfoRepository.staticDeviceInfo(androidGetLimitedSessionToken$invoke$10) == object1) {
            return object1;
        }
        limitedSessionTokenKt$Dsl3 = limitedSessionTokenKt$Dsl7;
        limitedSessionTokenKt$Dsl4 = limitedSessionTokenKt$Dsl3;
        limitedSessionTokenKt$Dsl5 = limitedSessionTokenKt$Dsl8;
        androidGetLimitedSessionToken1 = androidGetLimitedSessionToken2;
    label_78:
        L.o("", "deviceInfoRepository.staticDeviceInfo().osVersion");
        limitedSessionTokenKt$Dsl3.setOsVersion("");
        androidGetLimitedSessionToken$invoke$10.L$0 = androidGetLimitedSessionToken1;
        androidGetLimitedSessionToken$invoke$10.L$1 = limitedSessionTokenKt$Dsl5;
        androidGetLimitedSessionToken$invoke$10.L$2 = limitedSessionTokenKt$Dsl4;
        androidGetLimitedSessionToken$invoke$10.L$3 = limitedSessionTokenKt$Dsl4;
        androidGetLimitedSessionToken$invoke$10.label = 4;
        object0 = androidGetLimitedSessionToken1.deviceInfoRepository.getIdfi(androidGetLimitedSessionToken$invoke$10);
        if(object0 == object1) {
            return object1;
        }
        limitedSessionTokenKt$Dsl0 = limitedSessionTokenKt$Dsl4;
        limitedSessionTokenKt$Dsl1 = limitedSessionTokenKt$Dsl0;
        limitedSessionTokenKt$Dsl2 = limitedSessionTokenKt$Dsl5;
        androidGetLimitedSessionToken0 = androidGetLimitedSessionToken1;
    label_92:
        limitedSessionTokenKt$Dsl0.setIdfi(((String)object0));
        limitedSessionTokenKt$Dsl1.setSdkVersion(41401);
        limitedSessionTokenKt$Dsl1.setSdkVersionName("4.14.1");
        String s = androidGetLimitedSessionToken0.sessionRepository.getGameId();
        if(s != null) {
            limitedSessionTokenKt$Dsl1.setGameId(s);
        }
        limitedSessionTokenKt$Dsl1.setPlatform(Platform.PLATFORM_ANDROID);
        limitedSessionTokenKt$Dsl1.setMediationProvider(((MediationProvider)androidGetLimitedSessionToken0.mediationRepository.getMediationProvider().invoke()));
        String s1 = androidGetLimitedSessionToken0.mediationRepository.getName();
        if(s1 != null && limitedSessionTokenKt$Dsl1.getMediationProvider() == MediationProvider.MEDIATION_PROVIDER_CUSTOM) {
            limitedSessionTokenKt$Dsl1.setCustomMediationName(s1);
        }
        String s2 = androidGetLimitedSessionToken0.mediationRepository.getVersion();
        if(s2 != null) {
            limitedSessionTokenKt$Dsl1.setMediationVersion(s2);
        }
        return limitedSessionTokenKt$Dsl2._build();
    }
}

