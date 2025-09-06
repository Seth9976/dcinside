package com.bytedance.sdk.openadsdk.api;

import androidx.annotation.MainThread;
import com.bytedance.sdk.openadsdk.common.cz;

public interface PAGLoadListener extends cz {
    @MainThread
    void onAdLoaded(Object arg1);

    @Override  // com.bytedance.sdk.openadsdk.common.cz
    @MainThread
    void onError(int arg1, String arg2);
}

