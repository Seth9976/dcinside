package com.bytedance.sdk.openadsdk.component.reward.PjT;

import android.app.Activity;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.Zh.JQp;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.cRA;
import com.bytedance.sdk.openadsdk.utils.qla;
import com.bytedance.sdk.openadsdk.utils.xs;
import com.bytedance.sdk.openadsdk.xf.cz;
import java.util.concurrent.atomic.AtomicBoolean;

public class DWo {
    protected final Activity Au;
    protected final String DWo;
    @NonNull
    protected final Owx SM;
    protected volatile boolean XX;
    protected boolean fDm;
    protected AtomicBoolean gK;
    protected final PjT qj;
    protected boolean qla;
    protected com.bytedance.sdk.openadsdk.Owx.PjT.PjT ub;
    protected FrameLayout xE;
    protected boolean xf;
    protected boolean xs;

    public DWo(PjT pjT0) {
        this.gK = new AtomicBoolean(false);
        this.qj = pjT0;
        this.Au = pjT0.rds;
        this.DWo = pjT0.JQp;
        this.SM = pjT0.Zh;
        this.xs = cRA.JQp(pjT0.Zh);
    }

    public void Au() {
    }

    public boolean DWo() {
        return this.XX;
    }

    public void JQp() {
        if(this.xs && !this.gK.get()) {
            com.bytedance.sdk.openadsdk.Owx.PjT.PjT pjT0 = this.ub;
            if(pjT0 != null) {
                pjT0.ReZ();
            }
        }
    }

    public void PjT() {
        if(!this.xs) {
            return;
        }
        if(this.xf) {
            return;
        }
        this.xf = true;
    }

    public void PjT(int v) {
    }

    public void PjT(long v) {
    }

    public void PjT(JQp jQp0) {
        if(!this.xs) {
            return;
        }
        com.bytedance.sdk.openadsdk.Owx.PjT.PjT pjT0 = this.ub;
        if(pjT0 != null) {
            pjT0.PjT(jQp0);
        }
    }

    protected void PjT(boolean z) {
        FrameLayout frameLayout0 = this.xE;
        if(frameLayout0 != null) {
            com.bytedance.sdk.openadsdk.Owx.PjT.PjT pjT0 = new com.bytedance.sdk.openadsdk.Owx.PjT.PjT(this.qj.IJ, this.SM, this.qj.cI, z, frameLayout0);
            this.ub = pjT0;
            pjT0.PjT(this.qj.kph);
            this.ub.PjT(true, this.Zh());
        }
    }

    public void ReZ() {
        if(!this.xs) {
            return;
        }
        this.XX = true;
        this.ReZ(this.qj.xH);
        this.ub.PjT();
        this.XX();
        if(cRA.DWo(this.SM)) {
            this.qj.Jo.cz();
        }
    }

    public void ReZ(boolean z) {
        if(!this.xs) {
            return;
        }
        if(this.ub != null && this.XX) {
            this.ub.PjT(z);
        }
    }

    public boolean SM() {
        return false;
    }

    private void XX() {
        int v = this.SM.fU();
        if(v != -1) {
            if(v >= 0) {
                this.qj.wN.cr(false);
                if(cRA.SM(this.SM)) {
                    if(this.ub != null && this.ub.JQp()) {
                        this.qj.OMu.sendEmptyMessageDelayed(600, ((long)v));
                        goto label_21;
                    }
                    this.qj.OMu.sendEmptyMessageDelayed(1, ((long)v));
                    return;
                }
                else {
                    this.qj.OMu.sendEmptyMessageDelayed(600, ((long)v));
                }
            label_21:
                xs xs0 = this.qj.Xtz;
                if(xs0 != null) {
                    xs0.PjT(((long)v));
                }
            }
        }
        else if(cRA.SM(this.SM)) {
            if(this.ub != null && this.ub.JQp()) {
                this.qj.ltE.set(true);
                this.qj.wKV.qla();
                goto label_21;
            }
            this.qj.wKV.Lrd();
        }
        else {
            this.qj.ltE.set(true);
            this.qj.wKV.qla();
            goto label_21;
        }
    }

    protected cz Zh() {
        return new cz() {
            final DWo PjT;

            @Override  // com.bytedance.sdk.openadsdk.xf.cz
            public void PjT() {
                DWo.this.qj.kph.PjT(false);
            }
        };
    }

    public void Zh(boolean z) {
        if(this.xs) {
            PjT pjT0 = this.qj;
            if(pjT0.VY) {
                this.xE = (FrameLayout)pjT0.ig.findViewById(qla.Pv);
                this.PjT(z);
            }
        }
    }

    public void cr() {
        if(this.xs && !this.gK.get()) {
            com.bytedance.sdk.openadsdk.Owx.PjT.PjT pjT0 = this.ub;
            if(pjT0 != null) {
                pjT0.Zh();
            }
        }
    }

    public void cz() {
        if(!this.xs) {
            return;
        }
        if(this.qla) {
            return;
        }
        this.qla = true;
        com.bytedance.sdk.openadsdk.Owx.PjT.PjT pjT0 = this.ub;
        if(pjT0 != null) {
            pjT0.cr();
        }
        FrameLayout frameLayout0 = this.xE;
        if(frameLayout0 != null) {
            frameLayout0.setVisibility(8);
        }
    }

    public void qj() {
        if(this.gK.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.Owx.PjT.PjT pjT0 = this.ub;
            if(pjT0 != null) {
                pjT0.PjT(true);
            }
            this.qj.Jo.XX(true);
            this.qj.qZS.PjT(true, this.qj.wKV);
            if(this.qj.qZS.XX()) {
                this.qj.Xtz.PjT(((long)this.qj.Au));
                return;
            }
            this.qj.Jo.PjT(this.qj.xH, true);
            this.qj.Jo.ReZ(true);
            this.qj.Jo.Zh(true);
            this.qj.OMu.removeMessages(600);
            return;
        }
        this.qj.Jo.SM();
    }
}

