package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.datasource.LegacyUserConsentDataSource;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class AndroidLegacyUserConsentRepository implements LegacyUserConsentRepository {
    @l
    private final LegacyUserConsentDataSource legacyUserConsentDataSource;

    public AndroidLegacyUserConsentRepository(@l LegacyUserConsentDataSource legacyUserConsentDataSource0) {
        L.p(legacyUserConsentDataSource0, "legacyUserConsentDataSource");
        super();
        this.legacyUserConsentDataSource = legacyUserConsentDataSource0;
    }

    @Override  // com.unity3d.ads.core.data.repository.LegacyUserConsentRepository
    @m
    public String getLegacyFlowUserConsent() {
        return this.legacyUserConsentDataSource.getPrivacyData();
    }
}

