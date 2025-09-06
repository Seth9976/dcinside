package com.bytedance.sdk.openadsdk.component.reward.PjT;

import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.Lrd.PjT.ReZ;
import com.bytedance.sdk.openadsdk.component.reward.Zh.Zh;
import com.bytedance.sdk.openadsdk.component.reward.view.Au;
import com.bytedance.sdk.openadsdk.component.reward.view.cz;
import com.bytedance.sdk.openadsdk.core.KM;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.cRA;
import com.bytedance.sdk.openadsdk.core.model.gK;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.utils.RD;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.xs;
import java.util.HashMap;

public class JQp {
    public interface PjT {
        void PjT(boolean arg1, boolean arg2, boolean arg3, Zh arg4, int arg5);

        void xE();
    }

    private final com.bytedance.sdk.openadsdk.component.reward.PjT.PjT PjT;
    private PjT ReZ;
    private final cz Zh;

    public JQp(com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0) {
        this.PjT = pjT0;
        this.Zh = new cz(pjT0);
    }

    private int Au() {
        int v = this.PjT.Zh.Lx();
        if(v <= 5000 && v >= 0) {
            if(v < 1000) {
                v += 1000;
            }
            int v1 = ub.cr().PjT(this.PjT.Zh.joj());
            if(v1 <= 5000 && v1 >= 0) {
                if(v1 < 1000) {
                    v1 += 1000;
                }
                return Math.min(v, v1);
            }
        }
        return -1;
    }

    public boolean JQp() {
        return this.Zh == null ? false : this.Zh.JQp();
    }

    public void PjT() {
        this.Zh.PjT();
    }

    public void PjT(PjT jQp$PjT0) {
        this.ReZ = jQp$PjT0;
    }

    void PjT(Zh zh0) {
        this.PjT.Jo.PjT(0.0f);
        this.PjT.Zd.PjT(0.0f);
        if(Owx.ReZ(this.PjT.Zh)) {
            this.PjT.Jo.PjT(8);
            this.PjT.Co.PjT(0);
            this.PjT.Co.XX();
        }
        else {
            this.PjT.Co.PjT(8);
            this.PjT.Jo.PjT(0);
            this.PjT.Jo.kph();
        }
        if(this.PjT.XX) {
            qZS.PjT(zh0.fDm, 0);
            this.PjT.Zd.JQp(8);
        }
        this.PjT.Zd.ReZ(8);
        this.PjT.Zd.XX();
        if(Owx.ReZ(this.PjT.Zh)) {
            this.PjT.OMu.sendEmptyMessageDelayed(800, 100L);
            return;
        }
        this.PjT.OMu.sendEmptyMessageDelayed(500, 100L);
        this.PjT.Jo.PjT(this.PjT.xH, true);
        this.PjT.Jo.ReZ(true);
        this.PjT.Jo.Zh(true);
        KM kM0 = this.PjT.Jo.xf();
        if(kM0 != null) {
            kM0.PjT("prerender_page_show", null);
        }
    }

    public void PjT(com.bytedance.sdk.openadsdk.core.Zh.JQp jQp0) {
        this.Zh.PjT(jQp0);
    }

    public void PjT(boolean z) {
        if(!Owx.cr(this.PjT.Zh)) {
            this.PjT.Jo.PjT(false, 408, "end_card_timeout");
        }
        this.PjT.Jo.ZX();
        this.PjT.Jo.PjT(8);
        this.PjT.Co.PjT(8);
        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = this.PjT;
        if(pjT0.XX) {
            qZS.PjT(pjT0.wKV.fDm, 8);
            this.PjT.Zd.JQp(0);
        }
        this.PjT.Zd.ReZ(8);
        if(!this.PjT.Zh.uvo()) {
            com.bytedance.sdk.openadsdk.activity.cz cz0 = this.PjT.hN;
            if(cz0 != null) {
                int v = cz0.cRA().Au();
                this.Zh.PjT(v);
            }
            this.Zh.Zh();
        }
        else if(!this.Zh.PjT(this.PjT.tT)) {
            this.PjT.rds.finish();
        }
        this.PjT.Zd.XX();
        if(z) {
            this.ReZ(this.PjT.wKV);
        }
        this.PjT.wN.ReZ(false);
        boolean z1 = this.PjT.Zh.Sky();
        this.PjT.Yo.PjT(z1);
    }

    public void PjT(boolean z, Zh zh0) {
        if(cRA.gK(this.PjT.Zh)) {
            return;
        }
        this.PjT.gK.set(z);
        zh0.fDm();
        if(this.PjT.Zh.uvo()) {
            this.PjT.wN.cr(false);
        }
        else {
            boolean z1 = cRA.gK(this.PjT.Zh);
            this.PjT.wN.cr(z1);
        }
        boolean z2 = cRA.XX(this.PjT.Zh);
        this.PjT.wN.ReZ(z2);
        if(this.PjT.Zh.cr() && cRA.XX(this.PjT.Zh) && z) {
            this.PjT.wN.cr(true);
        }
        this.PjT.Jo.KM();
        gK gK0 = this.PjT.Zd.qla;
        if(gK0 != null) {
            gK0.JQp();
        }
        this.PjT.Zd.ReZ();
        Au au0 = this.PjT.yIW;
        if(au0 != null) {
            au0.cz();
        }
        com.bytedance.sdk.openadsdk.component.reward.PjT.Au au1 = this.PjT.cRA;
        if(au1 != null) {
            au1.XX(com.bytedance.sdk.openadsdk.component.reward.PjT.Au.Zh);
        }
        if(!TextUtils.isEmpty(Owx.PjT(this.PjT.IJ, this.PjT.Zh))) {
            String s = cRA.xs(this.PjT.Zh);
            RD.PjT(this.PjT.rds, s, this.PjT.Zh, "direct");
            return;
        }
        if(Owx.ReZ(this.PjT.Zh)) {
            qla qla0 = this.PjT.Co;
            if(qla0 != null) {
                qla0.cz();
            }
        }
        if(!Owx.PjT(this.PjT.Zh) && (Owx.ReZ(this.PjT.Zh) || !this.PjT.Jo.rds())) {
            boolean z3 = this.PjT.Jo.gK();
            boolean z4 = this.PjT.Co.xf();
            if(Owx.PjT(this.PjT.Zh, z3, this.PjT.Jo.OMu(), z4, this.PjT.Jo.Qf()) || cRA.XX(this.PjT.Zh)) {
                if(!Owx.cr(this.PjT.Zh) && !cRA.XX(this.PjT.Zh) && !Owx.ReZ(this.PjT.Zh)) {
                    this.PjT.Jo.PjT(true, 0, null);
                }
                if(cRA.XX(this.PjT.Zh)) {
                    if(cRA.tT(this.PjT.Zh) && !this.PjT.Jo.Zd()) {
                        if(!this.PjT.Jo.gK()) {
                            if(this.PjT.cRA.cr() != null) {
                                this.PjT.cRA.cr().PjT(2);
                            }
                            this.PjT.cRA.JQp();
                            return;
                        }
                        if(this.PjT.cRA.cr() != null) {
                            this.PjT.cRA.cr().PjT(-1);
                        }
                        this.PjT.cRA.cz();
                        this.PjT.wN.cr(false);
                        this.PjT.cRA.PjT(this.PjT.Yo.JQp());
                        return;
                    }
                    if(this.PjT.Jo.Zd() && this.PjT.cRA.cr() != null) {
                        this.PjT.cRA.cr().PjT(1);
                    }
                    this.Zh(zh0);
                }
                else {
                    this.ReZ(zh0);
                }
                this.PjT(zh0);
                return;
            }
        }
        this.cr();
    }

    public void PjT(boolean z, boolean z1, boolean z2, Zh zh0, int v) {
        int v1;
        if(this.PjT != null) {
            com.bytedance.sdk.openadsdk.cz.Zh.PjT().PjT("videoForceBreak", this.PjT.Zh);
            ReZ.Zh(this.PjT.Zh);
        }
        if(!this.PjT.rds.isFinishing() && zh0 != null) {
            this.PjT.Zd.xf();
            if(z1) {
                this.PjT.qla.set(true);
            }
            boolean z3 = false;
            if(this.PjT.yks && !this.PjT.xE.get() && !gK.SM(this.PjT.Zh) && (!gK.Zh(this.PjT.Zh) || !this.PjT.qla.get() || !this.PjT.ub.get())) {
                if(gK.Zh(this.PjT.Zh) && z2) {
                    return;
                }
                if(!this.Zh(z1)) {
                    return;
                }
                if(gK.Zh(this.PjT.Zh) || gK.cr(this.PjT.Zh) || gK.JQp(this.PjT.Zh)) {
                    this.PjT.wN.ReZ(false);
                    zh0.qla();
                    return;
                }
            }
            if(this.PjT.rds.isDestroyed()) {
                return;
            }
            if(this.PjT.rds.isFinishing()) {
                return;
            }
            if(this.PjT.Zh.es()) {
                Au au0 = this.PjT.yIW;
                com.bytedance.sdk.openadsdk.core.Au.ReZ reZ0 = au0 == null || au0.PjT() == null ? null : au0.PjT().getBrandBannerController();
                if(reZ0 != null) {
                    reZ0.Zh();
                }
                this.PjT.rds.finish();
                return;
            }
            PjT jQp$PjT0 = this.ReZ;
            if(jQp$PjT0 != null) {
                jQp$PjT0.PjT(z, z1, z2, zh0, v);
                return;
            }
            this.PjT.tT.fDm();
            this.PjT.Jo.Yo();
            this.PjT.qj.set(false);
            if(!this.PjT.Nv || (!(this.PjT.hN instanceof com.bytedance.sdk.openadsdk.activity.ReZ) || this.PjT.hN.Lrd())) {
                this.PjT.xf.set(false);
            }
            this.PjT.Qf.PjT();
            fDm fDm0 = this.PjT.wN;
            if(!this.PjT.XX && this.PjT.Zh.jp()) {
                z3 = true;
            }
            fDm0.PjT(z3);
            if(this.PjT.DWo.getAndSet(true)) {
                return;
            }
            if(cRA.Zh(this.PjT.Zh)) {
                HashMap hashMap0 = new HashMap();
                if(this.PjT.Jo.Zd()) {
                    v1 = 1;
                }
                else {
                    v1 = this.PjT.Jo.ltE() ? 2 : -1;
                }
                hashMap0.put("webview_state", v1);
                boolean z4 = this.PjT.rds.isFinishing();
                com.bytedance.sdk.openadsdk.cr.ReZ.PjT(this.PjT.Zh, this.PjT.JQp, z, z1, z2, z4, v, hashMap0);
            }
            if(this.PjT.Zh.cr() && cRA.XX(this.PjT.Zh) && z) {
                this.PjT.wN.cr(true);
            }
            if(cRA.XX(this.PjT.Zh)) {
                this.PjT.wN.ReZ(true);
            }
            this.SM();
            if(cRA.JQp(this.PjT.Zh)) {
                this.PjT.Zd.ReZ(8);
                this.PjT.wN.ReZ(true);
                this.PjT.Zd.ReZ();
                Au au1 = this.PjT.yIW;
                if(au1 != null) {
                    au1.cz();
                }
                this.PjT.cRA.gK();
                return;
            }
            this.PjT(z, zh0);
        }
    }

    public void ReZ() {
        this.Zh.cr();
    }

    public boolean ReZ(Zh zh0) {
        int v2;
        this.PjT.Au = this.Au();
        int v = 0;
        if(!this.PjT.Zh.SM()) {
            com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = this.PjT;
            int v1 = pjT0.Au;
            if(v1 != -1) {
                if(v1 >= 0) {
                    pjT0.RD.set(false);
                    Message message0 = Message.obtain();
                    message0.what = 700;
                    message0.arg1 = this.PjT.Au;
                    this.PjT.OMu.sendMessage(message0);
                    v2 = cRA.SM(this.PjT.Zh) ? 0 : 1;
                }
                else {
                    v2 = 0;
                }
            }
            else if(cRA.Au(pjT0.Zh) && this.PjT.Jo.gK()) {
                zh0.Lrd();
                v2 = 0;
            }
            else if(!cRA.DWo(this.PjT.Zh) || !this.PjT.Jo.gK()) {
                zh0.qla();
                v2 = 1;
            }
            else {
                zh0.Lrd();
                v2 = 0;
            }
            if(!this.PjT.Jo.yIW()) {
                v = v2;
            }
            if(v == 0 || (this.PjT.Xtz == null || this.PjT.Nv && (this.PjT.hN != null && !this.PjT.hN.Lrd()))) {
                return true;
            }
            this.PjT.Xtz.PjT(((long)this.PjT.Au));
            return true;
        }
        return false;
    }

    private void SM() {
        if(cRA.ltE(this.PjT.Zh)) {
            com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = this.PjT;
            if(pjT0.xH) {
                pjT0.wN.Zh(true);
                this.PjT.cRA.JQp(true);
            }
        }
    }

    public boolean XX() {
        return this.Zh.cz();
    }

    private boolean Zh(boolean z) {
        if(gK.ReZ(this.PjT.Zh)) {
            com.bytedance.sdk.openadsdk.component.reward.view.Zh zh0 = this.PjT.yIW.PjT();
            if(zh0 != null && zh0.cr == 0 && !z) {
                this.PjT.wN.ReZ(false);
                return false;
            }
        }
        return true;
    }

    public void Zh() {
        this.Zh.ReZ();
    }

    public void Zh(Zh zh0) {
        int v = this.PjT.Zh.fU();
        if(cRA.gK(this.PjT.Zh)) {
            v = (this.PjT.Zh.Gr() + 1) * 1000;
        }
        if(v == -1) {
            if(cRA.Au(this.PjT.Zh)) {
                if(cRA.tT(this.PjT.Zh) && this.PjT.cRA.XX()) {
                    zh0.qla();
                    return;
                }
                zh0.Lrd();
                return;
            }
            zh0.qla();
            goto label_21;
        }
        else if(v >= 0) {
            this.PjT.wN.cr(false);
            if(cRA.Au(this.PjT.Zh)) {
                if(cRA.tT(this.PjT.Zh) && this.PjT.cRA.XX()) {
                    this.PjT.OMu.sendEmptyMessageDelayed(600, ((long)v));
                    goto label_21;
                }
                this.PjT.OMu.sendEmptyMessageDelayed(1, ((long)v));
                return;
            }
            else {
                this.PjT.OMu.sendEmptyMessageDelayed(600, ((long)v));
            }
        label_21:
            xs xs0 = this.PjT.Xtz;
            if(xs0 != null) {
                xs0.PjT(((long)v));
            }
        }
    }

    public void cr() {
        this.PjT(true);
    }

    public PjT cz() {
        return this.ReZ;
    }
}

