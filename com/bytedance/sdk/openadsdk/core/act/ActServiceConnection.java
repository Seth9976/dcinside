package com.bytedance.sdk.openadsdk.core.act;

import android.content.ComponentName;
import androidx.annotation.NonNull;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;

public class ActServiceConnection extends CustomTabsServiceConnection {
    private Zh mConnectionCallback;

    public ActServiceConnection(Zh zh0) {
        this.mConnectionCallback = zh0;
    }

    @Override  // androidx.browser.customtabs.CustomTabsServiceConnection
    public void onCustomTabsServiceConnected(@NonNull ComponentName componentName0, @NonNull CustomTabsClient customTabsClient0) {
        Zh zh0 = this.mConnectionCallback;
        if(zh0 != null) {
            zh0.PjT(customTabsClient0);
        }
    }

    @Override  // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName0) {
        Zh zh0 = this.mConnectionCallback;
        if(zh0 != null) {
            zh0.PjT();
        }
    }
}

