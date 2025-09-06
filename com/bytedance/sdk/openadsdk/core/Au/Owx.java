package com.bytedance.sdk.openadsdk.core.Au;

import android.view.View;
import com.bytedance.sdk.component.adexpress.Zh.PjT;
import com.bytedance.sdk.component.adexpress.Zh.ReZ;
import com.bytedance.sdk.component.adexpress.Zh.XX;
import com.bytedance.sdk.component.adexpress.Zh.fDm;
import com.bytedance.sdk.component.adexpress.Zh.xs;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.Jo;
import java.util.concurrent.atomic.AtomicBoolean;

public class Owx extends PjT {
    private XX JQp;
    AtomicBoolean PjT;
    private final View ReZ;
    private com.bytedance.sdk.openadsdk.core.Au.PjT Zh;
    private ReZ cr;
    private final xs cz;

    public Owx(View view0, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver0, xs xs0) {
        this.PjT = new AtomicBoolean(false);
        this.ReZ = view0;
        this.cz = xs0;
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.cr
    public View JQp() {
        return this.PjT();
    }

    public com.bytedance.sdk.openadsdk.core.Au.PjT PjT() {
        return this.Zh;
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.PjT
    public void PjT(ReZ reZ0) {
        this.cr = reZ0;
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.cr
    public void PjT(XX xX0) {
        this.JQp = xX0;
        Jo.PjT(() -> {
            if(Owx.this.PjT.get()) {
                return;
            }
            if(Owx.this.cr != null && Owx.this.cr.PjT(((ltE)Owx.this.ReZ), 0)) {
                Owx.this.cz.JQp().XX();
                com.bytedance.sdk.openadsdk.core.Au.PjT pjT0 = (com.bytedance.sdk.openadsdk.core.Au.PjT)Owx.this.ReZ.findViewWithTag("tt_express_backup_fl_tag_26");
                Owx.this.Zh = pjT0;
                if(pjT0 != null) {
                    fDm fDm0 = new fDm();
                    float f = 0.0f;
                    float f1 = Owx.this.Zh == null ? 0.0f : Owx.this.Zh.getRealWidth();
                    com.bytedance.sdk.openadsdk.core.Au.PjT pjT1 = Owx.this.Zh;
                    if(pjT1 != null) {
                        f = pjT1.getRealHeight();
                    }
                    fDm0.PjT(true);
                    fDm0.PjT(((double)f1));
                    fDm0.Zh(((double)f));
                    Owx.this.JQp.PjT(Owx.this.Zh, fDm0);
                    return;
                }
                Owx.this.JQp.PjT(107, "backupview is null");
                return;
            }
            Owx.this.JQp.PjT(107, "backup false");
        });

        class com.bytedance.sdk.openadsdk.core.Au.Owx.1 implements Runnable {
            final Owx PjT;

            @Override
            public void run() {
                Owx.this.Zh();
            }
        }

    }

    // 检测为 Lambda 实现
    private void Zh() [...]
}

