package com.bytedance.sdk.openadsdk.core.act;

import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;

public class ReZ implements Zh {
    public static void PjT(Context context0, String s, CustomTabsIntent customTabsIntent0, Uri uri0) {
        customTabsIntent0.a.setPackage(s);
        customTabsIntent0.t(context0, uri0);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.act.Zh
    public void PjT() {
        throw null;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.act.Zh
    public void PjT(CustomTabsClient customTabsClient0) {
        throw null;
    }
}

