package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.InitializationStateKt;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.jvm.internal.L;
import y4.l;

public final class CommonSetInitializationState implements SetInitializationState {
    @l
    private final SDKPropertiesManager sdkPropertiesManager;
    @l
    private final SessionRepository sessionRepository;

    public CommonSetInitializationState(@l SessionRepository sessionRepository0, @l SDKPropertiesManager sDKPropertiesManager0) {
        L.p(sessionRepository0, "sessionRepository");
        L.p(sDKPropertiesManager0, "sdkPropertiesManager");
        super();
        this.sessionRepository = sessionRepository0;
        this.sdkPropertiesManager = sDKPropertiesManager0;
    }

    @Override  // com.unity3d.ads.core.domain.SetInitializationState
    public void invoke(@l InitializationState initializationState0, boolean z) {
        L.p(initializationState0, "state");
        if(z) {
            com.unity3d.services.core.properties.SdkProperties.InitializationState sdkProperties$InitializationState0 = InitializationStateKt.toLegacy(initializationState0);
            this.sdkPropertiesManager.setInitializeState(sdkProperties$InitializationState0);
            return;
        }
        this.sessionRepository.setInitializationState(initializationState0);
    }
}

