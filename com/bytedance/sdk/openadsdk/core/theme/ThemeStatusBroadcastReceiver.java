package com.bytedance.sdk.openadsdk.core.theme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;

public class ThemeStatusBroadcastReceiver extends BroadcastReceiver {
    private WeakReference PjT;

    @Override  // android.content.BroadcastReceiver
    public void onReceive(Context context0, Intent intent0) {
        if(intent0 == null) {
            return;
        }
        intent0.getIntExtra("theme_status_change", 0);
        if(this.PjT != null && this.PjT.get() != null) {
            this.PjT.get();
        }
    }
}

