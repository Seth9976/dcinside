package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.InitializationStateKt;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.jvm.internal.L;
import y4.l;

public final class CommonGetInitializationState implements GetInitializationState {
    @l
    private final SDKPropertiesManager sdkPropertiesManager;
    @l
    private final SessionRepository sessionRepository;

    public CommonGetInitializationState(@l SessionRepository sessionRepository0, @l SDKPropertiesManager sDKPropertiesManager0) {
        L.p(sessionRepository0, "sessionRepository");
        L.p(sDKPropertiesManager0, "sdkPropertiesManager");
        super();
        this.sessionRepository = sessionRepository0;
        this.sdkPropertiesManager = sDKPropertiesManager0;
    }

    // 去混淆评级： 低(20)
    @Override  // com.unity3d.ads.core.domain.GetInitializationState
    @l
    public InitializationState invoke(boolean z) {
        return z ? InitializationStateKt.toBold(this.sdkPropertiesManager.getCurrentInitializationState()) : this.sessionRepository.getInitializationState();
    }
}

