package com.unity3d.services.ads.operation.load;

import com.unity3d.services.core.configuration.ExperimentsReader;
import com.unity3d.services.core.configuration.InitializationNotificationCenter;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import org.json.JSONObject;

public class LoadModule extends BaseLoadModule {
    static ILoadModule _instance;

    public LoadModule(SDKMetricsSender sDKMetricsSender0) {
        super(sDKMetricsSender0);
    }

    @Override  // com.unity3d.services.ads.operation.load.BaseLoadModule
    void addOptionalParameters(LoadOperationState loadOperationState0, JSONObject jSONObject0) {
    }

    public static ILoadModule getInstance() {
        if(LoadModule._instance == null) {
            LoadModule._instance = new LoadModuleDecoratorTimeout(new LoadModuleDecoratorInitializationBuffer(new LoadModule(((SDKMetricsSender)Utilities.getService(SDKMetricsSender.class))), InitializationNotificationCenter.getInstance()), new ExperimentsReader());
        }
        return LoadModule._instance;
    }
}

