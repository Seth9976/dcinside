package com.unity3d.ads.core.data.manager;

import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.properties.SdkProperties.InitializationState;
import com.unity3d.services.core.properties.SdkProperties;
import kotlin.jvm.internal.L;
import y4.l;

public final class AndroidSDKPropertiesManager implements SDKPropertiesManager {
    @Override  // com.unity3d.ads.core.data.manager.SDKPropertiesManager
    @l
    public InitializationState getCurrentInitializationState() {
        InitializationState sdkProperties$InitializationState0 = SdkProperties.getCurrentInitializationState();
        L.o(sdkProperties$InitializationState0, "getCurrentInitializationState()");
        return sdkProperties$InitializationState0;
    }

    @Override  // com.unity3d.ads.core.data.manager.SDKPropertiesManager
    public void setInitializationTime() {
        SdkProperties.setInitializationTime(Device.getElapsedRealtime());
    }

    @Override  // com.unity3d.ads.core.data.manager.SDKPropertiesManager
    public void setInitializationTimeSinceEpoch() {
        SdkProperties.setInitializationTimeSinceEpoch(System.currentTimeMillis());
    }

    @Override  // com.unity3d.ads.core.data.manager.SDKPropertiesManager
    public void setInitializeState(@l InitializationState sdkProperties$InitializationState0) {
        L.p(sdkProperties$InitializationState0, "initializeState");
        SdkProperties.setInitializeState(sdkProperties$InitializationState0);
    }

    @Override  // com.unity3d.ads.core.data.manager.SDKPropertiesManager
    public void setInitialized(boolean z) {
        SdkProperties.setInitialized(z);
    }
}

