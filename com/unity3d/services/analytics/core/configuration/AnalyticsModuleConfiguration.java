package com.unity3d.services.analytics.core.configuration;

import com.unity3d.services.analytics.core.api.Analytics;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.IModuleConfiguration;

public class AnalyticsModuleConfiguration implements IModuleConfiguration {
    private static final Class[] WEB_APP_API_CLASS_LIST;

    static {
        AnalyticsModuleConfiguration.WEB_APP_API_CLASS_LIST = new Class[]{Analytics.class};
    }

    @Override  // com.unity3d.services.core.configuration.IModuleConfiguration
    public Class[] getWebAppApiClassList() {
        return AnalyticsModuleConfiguration.WEB_APP_API_CLASS_LIST;
    }

    @Override  // com.unity3d.services.core.configuration.IModuleConfiguration
    public boolean initCompleteState(Configuration configuration0) {
        return true;
    }

    @Override  // com.unity3d.services.core.configuration.IModuleConfiguration
    public boolean initErrorState(Configuration configuration0, ErrorState errorState0, String s) {
        return true;
    }

    @Override  // com.unity3d.services.core.configuration.IModuleConfiguration
    public boolean resetState(Configuration configuration0) {
        return true;
    }
}

