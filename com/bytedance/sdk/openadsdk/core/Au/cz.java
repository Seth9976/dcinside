package com.bytedance.sdk.openadsdk.core.Au;

import android.content.Context;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.adexpress.Zh.XX;
import com.bytedance.sdk.component.adexpress.Zh.xs;
import com.bytedance.sdk.component.adexpress.dynamic.PjT.PjT;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.core.fDm;
import com.bytedance.sdk.openadsdk.utils.Jo;

public class cz extends PjT {
    private final xs PjT;
    private final Au ReZ;
    private XX Zh;
    private final Runnable cr;

    public cz(Context context0, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver0, boolean z, com.bytedance.sdk.component.adexpress.dynamic.JQp.Au au0, xs xs0, com.bytedance.sdk.component.adexpress.dynamic.cz.PjT pjT0) {
        super(context0, themeStatusBroadcastReceiver0, z, au0, xs0, pjT0);
        this.ReZ = new Au("dynamic_render_template") {
            final cz PjT;

            @Override
            public void run() {
                cz.this.PjT.ReZ();
                fDm.ReZ().post(cz.this.cr);
            }
        };
        this.cr = new Runnable() {
            final cz PjT;

            @Override
            public void run() {
                if(cz.this.Zh != null) {
                    XX xX0 = cz.this.Zh;
                    cz.this.super.PjT(xX0);
                }
            }
        };
        this.PjT = xs0;
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.PjT.PjT
    public void PjT(XX xX0) {
        this.Zh = xX0;
        Jo.Zh(this.ReZ);
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.PjT.PjT
    public void Zh() {
        super.Zh();
        fDm.ReZ().removeCallbacks(this.cr);
    }
}

