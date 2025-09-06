package com.unity3d.services.ads.operation;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.timer.BaseTimer;
import com.unity3d.services.core.webview.bridge.IWebViewSharedObject;
import java.util.concurrent.TimeUnit;

public class OperationState implements IWebViewSharedObject {
    private static String _emptyPlacementId = "";
    public Configuration configuration;
    public String id;
    public String placementId;
    public long startTime;
    public BaseTimer timeoutTimer;

    static {
    }

    public OperationState(String s, Configuration configuration0) {
        if(s == null) {
            s = "";
        }
        this.placementId = s;
        this.configuration = configuration0;
        this.id = "f2135eb1-3487-428f-981b-d1699bfce3fa";
    }

    public long duration() {
        return TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.startTime);
    }

    @Override  // com.unity3d.services.core.webview.bridge.IWebViewSharedObject
    public String getId() {
        return this.id;
    }

    public void start() {
        this.startTime = System.nanoTime();
    }
}

