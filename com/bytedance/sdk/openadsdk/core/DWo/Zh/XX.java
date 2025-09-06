package com.bytedance.sdk.openadsdk.core.DWo.Zh;

import android.content.Context;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.fDm;
import com.bytedance.sdk.component.adexpress.Zh.Au;
import com.bytedance.sdk.component.adexpress.Zh.DWo;
import com.bytedance.sdk.component.adexpress.Zh.qla;
import com.bytedance.sdk.component.adexpress.Zh.xs;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.core.DWo.JQp.ReZ;
import com.bytedance.sdk.openadsdk.utils.Jo;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class XX implements DWo {
    class PjT implements Runnable {
        com.bytedance.sdk.component.adexpress.Zh.DWo.PjT PjT;
        private int ReZ;
        final XX Zh;

        PjT(int v, com.bytedance.sdk.component.adexpress.Zh.DWo.PjT dWo$PjT0) {
            this.ReZ = v;
            this.PjT = dWo$PjT0;
        }

        @Override
        public void run() {
            if(this.ReZ == 1) {
                XX.this.Zh.PjT(true);
                XX.this.PjT(this.PjT, 0x89, "real time out" + XX.this.ReZ.cz());
            }
        }
    }

    private AtomicBoolean JQp;
    private Context PjT;
    private xs ReZ;
    private ReZ Zh;
    private ScheduledFuture cr;

    public XX(Context context0, ReZ reZ0, Au au0, xs xs0) {
        this.PjT = context0;
        this.Zh = reZ0;
        this.ReZ = xs0;
        this.JQp = new AtomicBoolean(false);
        this.Zh.PjT(au0);
    }

    private void PjT(com.bytedance.sdk.component.adexpress.Zh.DWo.PjT dWo$PjT0, int v, String s) {
        if(dWo$PjT0.ReZ()) {
            return;
        }
        if(this.JQp.get()) {
            return;
        }
        this.Zh();
        fDm fDm0 = new fDm();
        fDm0.PjT(v);
        fDm0.PjT(s);
        ((com.bytedance.sdk.openadsdk.core.DWo.JQp.PjT)this.ReZ).ZX().PjT(fDm0);
        if(dWo$PjT0.Zh(this)) {
            dWo$PjT0.PjT(this);
        }
        else {
            if(dWo$PjT0.ReZ()) {
                return;
            }
            qla qla0 = dWo$PjT0.Zh();
            if(qla0 == null) {
                return;
            }
            dWo$PjT0.PjT(true);
            qla0.a_(v);
        }
        this.JQp.getAndSet(true);
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.DWo
    public void PjT() {
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.DWo
    public boolean PjT(com.bytedance.sdk.component.adexpress.Zh.DWo.PjT dWo$PjT0) {
        int v = this.ReZ.cz();
        if(v < 0) {
            this.PjT(dWo$PjT0, 0x89, "time is " + v);
            return true;
        }
        this.cr = Jo.PjT().schedule(new PjT(this, 1, dWo$PjT0), ((long)v), TimeUnit.MILLISECONDS);
        this.Zh.PjT(new com.bytedance.sdk.component.adexpress.Zh.XX() {
            final XX Zh;

            @Override  // com.bytedance.sdk.component.adexpress.Zh.XX
            public void PjT(int v, String s) {
                XX.this.PjT(dWo$PjT0, v, s);
            }

            @Override  // com.bytedance.sdk.component.adexpress.Zh.XX
            public void PjT(View view0, com.bytedance.sdk.component.adexpress.Zh.fDm fDm0) {
                XX.this.Zh();
                if(dWo$PjT0.ReZ()) {
                    return;
                }
                fDm fDm1 = new fDm();
                fDm1.PjT(0);
                ((com.bytedance.sdk.openadsdk.core.DWo.JQp.PjT)XX.this.ReZ).ZX().PjT(fDm1);
                XX.this.ReZ.JQp().DWo();
                qla qla0 = dWo$PjT0.Zh();
                if(qla0 == null) {
                    return;
                }
                qla0.PjT(XX.this.Zh, fDm0);
                dWo$PjT0.PjT(true);
            }
        });
        return true;
    }

    private void Zh() {
        try {
            if(this.cr != null && !this.cr.isCancelled()) {
                this.cr.cancel(false);
                this.cr = null;
            }
        }
        catch(Throwable throwable0) {
            RD.Zh("RenderInterceptor", new Object[]{"remove ugen time out task fail", throwable0.getMessage()});
        }
    }
}

