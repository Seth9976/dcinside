package com.bytedance.sdk.openadsdk.api;

import android.view.View;

public interface PAGExpressAdWrapperListener extends PAGAdWrapperListener {
    void onAdDismissed();

    void onAdShow(View arg1, int arg2);

    void onRenderFail(View arg1, String arg2, int arg3);

    void onRenderSuccess(View arg1, float arg2, float arg3);
}

