package com.unity3d.services.ads.operation.load;

import com.unity3d.services.core.configuration.ExperimentsReader;
import com.unity3d.services.core.configuration.InitializationNotificationCenter;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import org.json.JSONException;
import org.json.JSONObject;

public class LoadBannerModule extends BaseLoadModule {
    static ILoadModule _instance;

    public LoadBannerModule(SDKMetricsSender sDKMetricsSender0) {
        super(sDKMetricsSender0);
    }

    @Override  // com.unity3d.services.ads.operation.load.BaseLoadModule
    protected void addOptionalParameters(LoadOperationState loadOperationState0, JSONObject jSONObject0) throws JSONException {
        if(loadOperationState0 instanceof LoadBannerOperationState) {
            jSONObject0.put("width", ((LoadBannerOperationState)loadOperationState0).getSize().getWidth());
            jSONObject0.put("height", ((LoadBannerOperationState)loadOperationState0).getSize().getHeight());
        }
    }

    public static ILoadModule getInstance() {
        if(LoadBannerModule._instance == null) {
            LoadBannerModule._instance = new LoadModuleDecoratorTimeout(new LoadModuleDecoratorInitializationBuffer(new LoadBannerModule(((SDKMetricsSender)Utilities.getService(SDKMetricsSender.class))), InitializationNotificationCenter.getInstance()), new ExperimentsReader());
        }
        return LoadBannerModule._instance;
    }
}

