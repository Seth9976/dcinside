package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.repository.MediationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import gatewayprotocol.v1.ClientInfoKt.Dsl;
import gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo.Builder;
import gatewayprotocol.v1.ClientInfoOuterClass.ClientInfo;
import gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider;
import gatewayprotocol.v1.ClientInfoOuterClass.Platform;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidGetClientInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidGetClientInfo.kt\ncom/unity3d/ads/core/domain/AndroidGetClientInfo\n+ 2 ClientInfoKt.kt\ngatewayprotocol/v1/ClientInfoKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,50:1\n10#2:51\n1#3:52\n1#3:53\n*S KotlinDebug\n*F\n+ 1 AndroidGetClientInfo.kt\ncom/unity3d/ads/core/domain/AndroidGetClientInfo\n*L\n23#1:51\n23#1:52\n*E\n"})
public final class AndroidGetClientInfo implements GetClientInfo {
    @l
    private final MediationRepository mediationRepository;
    @l
    private final OfferwallManager offerwallManager;
    @l
    private final OmidManager omidManager;
    @l
    private final ScarManager scarManager;
    @l
    private final SessionRepository sessionRepository;

    public AndroidGetClientInfo(@l SessionRepository sessionRepository0, @l MediationRepository mediationRepository0, @l OmidManager omidManager0, @l ScarManager scarManager0, @l OfferwallManager offerwallManager0) {
        L.p(sessionRepository0, "sessionRepository");
        L.p(mediationRepository0, "mediationRepository");
        L.p(omidManager0, "omidManager");
        L.p(scarManager0, "scarManager");
        L.p(offerwallManager0, "offerwallManager");
        super();
        this.sessionRepository = sessionRepository0;
        this.mediationRepository = mediationRepository0;
        this.omidManager = omidManager0;
        this.scarManager = scarManager0;
        this.offerwallManager = offerwallManager0;
    }

    @Override  // com.unity3d.ads.core.domain.GetClientInfo
    @m
    public Object invoke(@l d d0) {
        AndroidGetClientInfo androidGetClientInfo1;
        Dsl clientInfoKt$Dsl4;
        Dsl clientInfoKt$Dsl3;
        Dsl clientInfoKt$Dsl2;
        Dsl clientInfoKt$Dsl1;
        AndroidGetClientInfo androidGetClientInfo0;
        com.unity3d.ads.core.domain.AndroidGetClientInfo.invoke.1 androidGetClientInfo$invoke$10;
        if(d0 instanceof com.unity3d.ads.core.domain.AndroidGetClientInfo.invoke.1) {
            androidGetClientInfo$invoke$10 = (com.unity3d.ads.core.domain.AndroidGetClientInfo.invoke.1)d0;
            int v = androidGetClientInfo$invoke$10.label;
            if((v & 0x80000000) == 0) {
                androidGetClientInfo$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object L$0;
                    Object L$1;
                    Object L$2;
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
                androidGetClientInfo$invoke$10.label = v ^ 0x80000000;
            }
        }
        else {
            androidGetClientInfo$invoke$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object L$0;
                Object L$1;
                Object L$2;
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
        Object object0 = androidGetClientInfo$invoke$10.result;
        Object object1 = b.l();
        switch(androidGetClientInfo$invoke$10.label) {
            case 0: {
                f0.n(object0);
                Builder clientInfoOuterClass$ClientInfo$Builder0 = ClientInfo.newBuilder();
                L.o(clientInfoOuterClass$ClientInfo$Builder0, "newBuilder()");
                Dsl clientInfoKt$Dsl0 = Dsl.Companion._create(clientInfoOuterClass$ClientInfo$Builder0);
                clientInfoKt$Dsl0.setSdkVersion(41401);
                clientInfoKt$Dsl0.setSdkVersionName("4.14.1");
                String s = this.sessionRepository.getGameId();
                if(s != null) {
                    clientInfoKt$Dsl0.setGameId(s);
                }
                clientInfoKt$Dsl0.setTest(this.sessionRepository.isTestModeEnabled());
                clientInfoKt$Dsl0.setPlatform(Platform.PLATFORM_ANDROID);
                clientInfoKt$Dsl0.setMediationProvider(((MediationProvider)this.mediationRepository.getMediationProvider().invoke()));
                String s1 = this.mediationRepository.getName();
                if(s1 != null && clientInfoKt$Dsl0.getMediationProvider() == MediationProvider.MEDIATION_PROVIDER_CUSTOM) {
                    clientInfoKt$Dsl0.setCustomMediationName(s1);
                }
                String s2 = this.mediationRepository.getVersion();
                if(s2 != null) {
                    clientInfoKt$Dsl0.setMediationVersion(s2);
                }
                androidGetClientInfo$invoke$10.L$0 = this;
                androidGetClientInfo$invoke$10.L$1 = clientInfoKt$Dsl0;
                androidGetClientInfo$invoke$10.L$2 = clientInfoKt$Dsl0;
                androidGetClientInfo$invoke$10.label = 1;
                Object object2 = this.scarManager.getVersion(androidGetClientInfo$invoke$10);
                if(object2 == object1) {
                    return object1;
                }
                androidGetClientInfo0 = this;
                clientInfoKt$Dsl1 = clientInfoKt$Dsl0;
                object0 = object2;
                clientInfoKt$Dsl2 = clientInfoKt$Dsl1;
                goto label_47;
            }
            case 1: {
                clientInfoKt$Dsl2 = (Dsl)androidGetClientInfo$invoke$10.L$2;
                clientInfoKt$Dsl1 = (Dsl)androidGetClientInfo$invoke$10.L$1;
                androidGetClientInfo0 = (AndroidGetClientInfo)androidGetClientInfo$invoke$10.L$0;
                f0.n(object0);
            label_47:
                if(((String)object0) != null) {
                    clientInfoKt$Dsl2.setScarVersionName(((String)object0));
                }
                androidGetClientInfo$invoke$10.L$0 = androidGetClientInfo0;
                androidGetClientInfo$invoke$10.L$1 = clientInfoKt$Dsl1;
                androidGetClientInfo$invoke$10.L$2 = clientInfoKt$Dsl2;
                androidGetClientInfo$invoke$10.label = 2;
                object0 = androidGetClientInfo0.offerwallManager.getVersion(androidGetClientInfo$invoke$10);
                if(object0 == object1) {
                    return object1;
                }
                clientInfoKt$Dsl3 = clientInfoKt$Dsl2;
                clientInfoKt$Dsl4 = clientInfoKt$Dsl1;
                androidGetClientInfo1 = androidGetClientInfo0;
                break;
            }
            case 2: {
                clientInfoKt$Dsl3 = (Dsl)androidGetClientInfo$invoke$10.L$2;
                clientInfoKt$Dsl4 = (Dsl)androidGetClientInfo$invoke$10.L$1;
                androidGetClientInfo1 = (AndroidGetClientInfo)androidGetClientInfo$invoke$10.L$0;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((String)object0) != null) {
            clientInfoKt$Dsl3.setOfferwallVersion(((String)object0));
        }
        clientInfoKt$Dsl3.setOmidVersion(androidGetClientInfo1.omidManager.getVersion());
        clientInfoKt$Dsl3.setOmidPartnerVersion("1");
        clientInfoKt$Dsl3.setSdkDevelopmentPlatform("");
        return clientInfoKt$Dsl4._build();
    }
}

