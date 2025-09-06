package com.bytedance.sdk.openadsdk.api;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;

public interface PAGLoadCallback {
    @MainThread
    void onAdLoaded(Object arg1);

    @MainThread
    void onError(@NonNull PAGErrorModel arg1);
}

