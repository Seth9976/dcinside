package com.bytedance.sdk.openadsdk.api;

import android.os.Bundle;
import java.util.Map;

public class PAGRequest {
    private String PjT;
    private Bundle ReZ;
    private Map Zh;

    public PAGRequest() {
        this.ReZ = null;
    }

    public final void addNetworkExtrasBundle(Class class0, Bundle bundle0) {
        if(this.ReZ == null) {
            this.ReZ = new Bundle();
        }
        this.ReZ.putBundle(class0.getName(), bundle0);
    }

    public String getAdString() {
        return this.PjT;
    }

    public Map getExtraInfo() {
        return this.Zh;
    }

    public Bundle getNetworkExtrasBundle() {
        return this.ReZ;
    }

    public void setAdString(String s) {
        this.PjT = s;
    }

    public void setExtraInfo(Map map0) {
        this.Zh = map0;
    }
}

