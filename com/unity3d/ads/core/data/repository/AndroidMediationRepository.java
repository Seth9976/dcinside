package com.unity3d.ads.core.data.repository;

import A3.a;
import com.unity3d.ads.core.data.datasource.MediationDataSource;
import gatewayprotocol.v1.ClientInfoOuterClass.MediationProvider;
import kotlin.jvm.internal.L;
import kotlin.text.v;
import y4.l;
import y4.m;

public final class AndroidMediationRepository implements MediationRepository {
    @l
    private final MediationDataSource mediationDataSource;

    public AndroidMediationRepository(@l MediationDataSource mediationDataSource0) {
        L.p(mediationDataSource0, "mediationDataSource");
        super();
        this.mediationDataSource = mediationDataSource0;
    }

    @Override  // com.unity3d.ads.core.data.repository.MediationRepository
    @l
    public a getMediationProvider() {
        return new a() {
            {
                AndroidMediationRepository.this = androidMediationRepository0;
                super(0);
            }

            @l
            public final MediationProvider invoke() {
                String s = AndroidMediationRepository.this.getName();
                if(s != null) {
                    if(v.v2(s, "AppLovinSdk_", false, 2, null)) {
                        return MediationProvider.MEDIATION_PROVIDER_MAX == null ? MediationProvider.MEDIATION_PROVIDER_UNSPECIFIED : MediationProvider.MEDIATION_PROVIDER_MAX;
                    }
                    if(v.O1(s, "AdMob", true)) {
                        return MediationProvider.MEDIATION_PROVIDER_ADMOB == null ? MediationProvider.MEDIATION_PROVIDER_UNSPECIFIED : MediationProvider.MEDIATION_PROVIDER_ADMOB;
                    }
                    if(v.O1(s, "MAX", true)) {
                        return MediationProvider.MEDIATION_PROVIDER_MAX == null ? MediationProvider.MEDIATION_PROVIDER_UNSPECIFIED : MediationProvider.MEDIATION_PROVIDER_MAX;
                    }
                    MediationProvider clientInfoOuterClass$MediationProvider0 = v.O1(s, "ironSource", true) ? MediationProvider.MEDIATION_PROVIDER_LEVELPLAY : MediationProvider.MEDIATION_PROVIDER_CUSTOM;
                    return clientInfoOuterClass$MediationProvider0 == null ? MediationProvider.MEDIATION_PROVIDER_UNSPECIFIED : clientInfoOuterClass$MediationProvider0;
                }
                return MediationProvider.MEDIATION_PROVIDER_UNSPECIFIED;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        };
    }

    @Override  // com.unity3d.ads.core.data.repository.MediationRepository
    @m
    public String getName() {
        return this.mediationDataSource.getName();
    }

    @Override  // com.unity3d.ads.core.data.repository.MediationRepository
    @m
    public String getVersion() {
        return this.mediationDataSource.getVersion();
    }
}

