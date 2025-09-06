package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.datasource.DeveloperConsentDataSource;
import gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent;
import kotlin.jvm.internal.L;
import y4.l;

public final class AndroidDeveloperConsentRepository implements DeveloperConsentRepository {
    @l
    private final DeveloperConsent developerConsent;

    public AndroidDeveloperConsentRepository(@l DeveloperConsentDataSource developerConsentDataSource0) {
        L.p(developerConsentDataSource0, "developerConsentDataSource");
        super();
        this.developerConsent = developerConsentDataSource0.getDeveloperConsent();
    }

    @Override  // com.unity3d.ads.core.data.repository.DeveloperConsentRepository
    @l
    public DeveloperConsent getDeveloperConsent() {
        return this.developerConsent;
    }
}

