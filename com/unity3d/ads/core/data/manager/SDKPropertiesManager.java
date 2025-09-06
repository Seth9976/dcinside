package com.unity3d.ads.core.data.manager;

import com.unity3d.services.core.properties.SdkProperties.InitializationState;
import y4.l;

public interface SDKPropertiesManager {
    @l
    InitializationState getCurrentInitializationState();

    void setInitializationTime();

    void setInitializationTimeSinceEpoch();

    void setInitializeState(@l InitializationState arg1);

    void setInitialized(boolean arg1);
}

