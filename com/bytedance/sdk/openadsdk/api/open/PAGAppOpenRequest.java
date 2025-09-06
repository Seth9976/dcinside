package com.bytedance.sdk.openadsdk.api.open;

import com.bytedance.sdk.openadsdk.api.PAGRequest;

public class PAGAppOpenRequest extends PAGRequest {
    private int PjT;

    public int getTimeout() {
        return this.PjT;
    }

    public void setTimeout(int v) {
        this.PjT = v;
    }
}

