package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.model.Owx;

public class ReZ extends xf {
    public ReZ(@NonNull Context context0) {
        super(context0);
        this.Zh = false;
    }

    @Override  // com.bytedance.sdk.openadsdk.common.xf
    public void PjT() {
        this.post(new Runnable() {
            final ReZ PjT;

            @Override
            public void run() {
                ReZ reZ0 = ReZ.this;
                if(reZ0.PjT != null) {
                    reZ0.setVisibility(0);
                }
            }
        });
    }

    public void PjT(Owx owx0, String s, int v, String s1, long v1, boolean z, int v2, long v3) {
        if(this.getVisibility() != 8) {
            com.bytedance.sdk.openadsdk.cr.ReZ.PjT(owx0, s, v, s1, SystemClock.elapsedRealtime() - v1, z, v2, v3);
            super.Zh();
        }
    }
}

