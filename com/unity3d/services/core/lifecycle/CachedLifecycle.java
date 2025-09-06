package com.unity3d.services.core.lifecycle;

import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.properties.ClientProperties;

public class CachedLifecycle {
    private static LifecycleCache _listener;

    public static LifecycleCache getLifecycleListener() {
        return CachedLifecycle._listener;
    }

    public static void register() {
        if(ClientProperties.getApplication() != null && CachedLifecycle.getLifecycleListener() == null) {
            CachedLifecycle.setLifecycleListener(new LifecycleCache(new ConfigurationReader()));
            ClientProperties.getApplication().registerActivityLifecycleCallbacks(CachedLifecycle.getLifecycleListener());
        }
    }

    public static void setLifecycleListener(LifecycleCache lifecycleCache0) {
        CachedLifecycle._listener = lifecycleCache0;
    }

    public static void unregister() {
        if(ClientProperties.getApplication() != null && CachedLifecycle.getLifecycleListener() != null) {
            ClientProperties.getApplication().unregisterActivityLifecycleCallbacks(CachedLifecycle.getLifecycleListener());
            CachedLifecycle.setLifecycleListener(null);
        }
    }
}

