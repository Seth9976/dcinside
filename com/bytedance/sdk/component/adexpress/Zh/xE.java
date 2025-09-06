package com.bytedance.sdk.component.adexpress.Zh;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.cr.cr;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class xE implements DWo {
    class PjT implements Runnable {
        com.bytedance.sdk.component.adexpress.Zh.DWo.PjT PjT;
        private int ReZ;
        final xE Zh;

        public PjT(int v, com.bytedance.sdk.component.adexpress.Zh.DWo.PjT dWo$PjT0) {
            this.ReZ = v;
            this.PjT = dWo$PjT0;
        }

        @Override
        public void run() {
            if(this.ReZ == 1) {
                xE.this.Zh.PjT(true);
                xE.this.PjT(this.PjT, 107, null);
            }
        }
    }

    private ScheduledFuture JQp;
    private Context PjT;
    private Au ReZ;
    private com.bytedance.sdk.component.adexpress.JQp.PjT Zh;
    private xs cr;
    private AtomicBoolean cz;

    public xE(Context context0, xs xs0, com.bytedance.sdk.component.adexpress.JQp.PjT pjT0, Au au0) {
        this.PjT = context0;
        this.cr = xs0;
        this.ReZ = au0;
        this.cz = new AtomicBoolean(false);
        this.Zh = pjT0;
        pjT0.PjT(this.ReZ);
    }

    private void PjT(com.bytedance.sdk.component.adexpress.Zh.DWo.PjT dWo$PjT0, int v, String s) {
        if(dWo$PjT0.ReZ()) {
            return;
        }
        if(this.cz.get()) {
            return;
        }
        this.ReZ();
        this.cr.JQp().PjT(v, s);
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
        this.cz.getAndSet(true);
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.DWo
    public void PjT() {
        this.Zh.cr();
        this.ReZ();
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.DWo
    public boolean PjT(com.bytedance.sdk.component.adexpress.Zh.DWo.PjT dWo$PjT0) {
        int v = this.cr.cz();
        if(v < 0) {
            this.PjT(dWo$PjT0, 107, "time is " + v);
            return true;
        }
        this.JQp = cr.PjT(new PjT(this, 1, dWo$PjT0), ((long)v), TimeUnit.MILLISECONDS);
        this.Zh.PjT(new XX() {
            final xE Zh;

            @Override  // com.bytedance.sdk.component.adexpress.Zh.XX
            public void PjT(int v, String s) {
                xE.this.PjT(dWo$PjT0, v, s);
            }

            @Override  // com.bytedance.sdk.component.adexpress.Zh.XX
            public void PjT(View view0, fDm fDm0) {
                xE.this.ReZ();
                if(dWo$PjT0.ReZ()) {
                    return;
                }
                qla qla0 = dWo$PjT0.Zh();
                if(qla0 == null) {
                    return;
                }
                qla0.PjT(xE.this.Zh, fDm0);
                dWo$PjT0.PjT(true);
            }
        });
        return true;
    }

    private void ReZ() {
        try {
            if(this.JQp != null && !this.JQp.isCancelled()) {
                this.JQp.cancel(false);
                this.JQp = null;
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    public com.bytedance.sdk.component.adexpress.JQp.PjT Zh() {
        return this.Zh;
    }
}

