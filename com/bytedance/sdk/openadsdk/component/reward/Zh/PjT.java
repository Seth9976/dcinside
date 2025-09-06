package com.bytedance.sdk.openadsdk.component.reward.Zh;

import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.KM;
import com.bytedance.sdk.openadsdk.component.reward.PjT.fDm;
import com.bytedance.sdk.openadsdk.component.reward.PjT.gK;
import com.bytedance.sdk.openadsdk.component.reward.PjT.ub;
import com.bytedance.sdk.openadsdk.component.reward.view.DWo;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.cRA;
import com.bytedance.sdk.openadsdk.core.xf.cr.Zh;

public class PjT {
    protected final fDm Au;
    protected KM DWo;
    protected final ub JQp;
    protected com.bytedance.sdk.openadsdk.component.reward.PjT.PjT PjT;
    protected int ReZ;
    protected Zh SM;
    protected final gK XX;
    protected Owx Zh;
    protected int cr;
    protected final DWo cz;

    public PjT(com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0) {
        this.PjT = pjT0;
        this.Zh = pjT0.Zh;
        this.ReZ = pjT0.HG;
        this.cr = pjT0.zZ;
        this.JQp = pjT0.tT;
        this.cz = pjT0.Zd;
        this.XX = pjT0.Jo;
        this.Au = pjT0.wN;
    }

    public void PjT(Zh zh0, KM kM0) {
        this.SM = zh0;
        this.DWo = kM0;
    }

    public void PjT(boolean z) {
        if(this.PjT.DWo.get()) {
            return;
        }
        if(this.Zh != null && this.Zh.es()) {
            this.Au.ReZ(false);
            this.Au.PjT(true);
            this.PjT.Zd.Zh(8);
            this.PjT.Zd.ReZ(8);
            return;
        }
        if(z) {
            boolean z1 = this.PjT.Zh.jp();
            this.Au.PjT(z1);
            if(cRA.gK(this.PjT.Zh) || this.PjT()) {
                this.Au.ReZ(true);
            }
            if(this.PjT() || this instanceof Au && this.PjT.Zh.cr()) {
                this.Au.cr(true);
            }
            else {
                this.Au.JQp();
                this.PjT.Zd.JQp(0);
            }
        }
        else {
            this.Au.ReZ(false);
            this.Au.PjT(false);
            this.Au.cr(false);
            this.PjT.Zd.JQp(8);
        }
        if(z) {
            com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = this.PjT;
            if(pjT0.oG != com.bytedance.sdk.openadsdk.component.reward.view.Zh.PjT) {
                pjT0.Zd.Zh(8);
                this.PjT.Zd.ReZ(8);
                return;
            }
            pjT0.Zd.Zh(0);
            this.PjT.Zd.ReZ(0);
            return;
        }
        this.PjT.Zd.Zh(4);
        this.PjT.Zd.ReZ(8);
    }

    public boolean PjT() {
        if(!this.PjT.Zh.uvo()) {
            switch(this.PjT.Zh.fK()) {
                case 5: 
                case 15: 
                case 50: {
                    break;
                }
                default: {
                    return false;
                }
            }
        }
        return true;
    }

    protected void ReZ() {
        if(cRA.Zh(this.PjT.Zh)) {
            this.PjT.xH = true;
        }
        this.PjT.wN.Zh(this.PjT.xH);
    }

    public boolean Zh() {
        if(com.bytedance.sdk.openadsdk.core.model.gK.Zh(this.PjT.Zh) && this.PjT.ltE.get()) {
            FrameLayout frameLayout0 = this.PjT.Zd.cz();
            frameLayout0.setVisibility(4);
            frameLayout0.setVisibility(0);
            return false;
        }
        return !this.PjT.DWo.get() && !this.PjT.qj.get() && !cRA.gK(this.PjT.Zh);
    }
}

