package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.Zh.SM;
import com.bytedance.sdk.openadsdk.component.reward.view.Au;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.cRA;
import com.bytedance.sdk.openadsdk.core.model.gK;
import com.bytedance.sdk.openadsdk.core.tT;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.cr.XX;
import com.bytedance.sdk.openadsdk.utils.fDm;
import com.bytedance.sdk.openadsdk.utils.xs;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import x.b.a;

public class cr extends PjT {
    int JQp;
    private boolean cz;

    public cr(Zh zh0, Owx owx0, int v) {
        super(zh0, owx0, v);
    }

    private void JQp(int v) {
        SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder(String.format(Lrd.PjT(ub.PjT(), "tt_skip_ad_time_text"), v));
        this.ReZ.wN.PjT(null, spannableStringBuilder0);
    }

    private boolean PjT(Owx owx0) {
        return owx0 == null ? true : owx0.Qtm() == 100.0f;
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.PjT
    public void PjT(Bundle bundle0) {
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.cr.Zh
    public boolean PjT(long v, boolean z) {
        if(this.Au.cr()) {
            Au au0 = this.ReZ.yIW;
            XX xX0 = au0 == null || au0.PjT() == null ? new XX() : this.ReZ.yIW.PjT().getAdShowTime();
            com.bytedance.sdk.openadsdk.component.reward.Zh.Zh zh0 = this.Zh;
            if(zh0 == null || !(zh0 instanceof SM)) {
                this.ReZ.tT.PjT(this.ReZ.yIW.Zh(), xX0);
            }
            else {
                com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = this.ReZ;
                if(pjT0.Ld) {
                    this.ReZ.tT.PjT(this.ReZ.yIW.Zh(), xX0);
                }
                else {
                    FrameLayout frameLayout0 = ((SM)zh0).KM();
                    pjT0.tT.PjT(frameLayout0, xX0);
                }
            }
            HashMap hashMap0 = new HashMap();
            Au au1 = this.ReZ.yIW;
            if(au1 != null) {
                hashMap0.put("dynamic_show_type", au1.SM());
                JSONObject jSONObject0 = this.ReZ.yIW.PjT(null);
                if(jSONObject0 != null) {
                    Iterator iterator0 = jSONObject0.keys();
                    while(iterator0.hasNext()) {
                        Object object0 = iterator0.next();
                        String s = (String)object0;
                        try {
                            hashMap0.put(s, jSONObject0.get(s));
                        }
                        catch(JSONException unused_ex) {
                        }
                    }
                }
            }
            this.ReZ.tT.PjT(new a() {
                boolean PjT;
                final cr Zh;

                @Override  // x.b$a
                public void PjT() {
                    cr.this.PjT.removeMessages(300);
                    cr.this.xs();
                    JQp zh$JQp0 = cr.this.Zh(6);
                    cr.this.cRA().PjT(cr.this, zh$JQp0);
                }

                @Override  // x.b$a
                public void PjT(long v, int v1) {
                    if(this.PjT) {
                        return;
                    }
                    this.PjT = true;
                    cr.this.PjT.removeMessages(300);
                    cr.this.xs();
                    cr.this.ReZ.tT.PjT(v, v);
                    cr.this.ReZ.yIW.Zh(true);
                    if(cr.this.ReZ.Zh.RD() == 36) {
                        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = cr.this.ReZ;
                        if(pjT0.ReZ) {
                            pjT0.Lrd.ReZ().cr();
                            fDm.Zh();
                        }
                    }
                    if(cr.this.ReZ.Zh.RD() == 21 && !cr.this.ReZ.Zh.Au()) {
                        cr.this.ReZ.Zh.Zh(true);
                        cr.this.ReZ.Zd.ub();
                    }
                    cr cr0 = cr.this;
                    com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT1 = cr0.ReZ;
                    if(pjT1.ix) {
                        JQp zh$JQp0 = cr0.Zh(5);
                        zh$JQp0.JQp = true;
                        cr.this.cRA().PjT(cr.this, zh$JQp0);
                        return;
                    }
                    if(!pjT1.ReZ) {
                        if(Owx.JQp(pjT1.Zh)) {
                            cr.this.iZZ();
                            return;
                        }
                        Au au0 = cr.this.ReZ.yIW;
                        if(au0 != null && au0.PjT() != null) {
                            cr.this.ReZ.yIW.PjT().setTime("0", 0, 0, false);
                            if(cr.this.ReZ.yIW.Au()) {
                                cr.this.ReZ.wN.PjT("0", "X");
                                cr.this.ReZ.wN.JQp(true);
                                cr.this.ReZ.wN.ReZ();
                            }
                        }
                    }
                    else if(!pjT1.Zh.Ik()) {
                        cr.this.PjT(false, 5);
                        if(!Owx.JQp(cr.this.ReZ.Zh)) {
                            cr.this.ReZ.tT.PjT("skip", true);
                        }
                    }
                    else if(cr.this.ReZ.yIW.SM() == 1) {
                        cr.this.ReZ.wN.ReZ();
                    }
                }

                @Override  // x.b$a
                public void PjT(long v, long v1) {
                    com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = cr.this.ReZ;
                    if(!pjT0.dwk && pjT0.tT.Zh()) {
                        cr.this.ReZ.tT.xE();
                    }
                    if(cr.this.ReZ.DWo.get()) {
                        return;
                    }
                    cr.this.PjT.removeMessages(300);
                    if(v != cr.this.ReZ.tT.Au()) {
                        cr.this.xs();
                    }
                    if(!cr.this.ReZ.tT.Zh()) {
                        return;
                    }
                    cr.this.ReZ.tT.PjT(v, v1);
                    cr.this.JQp = (int)(cr.this.ReZ.tT.KM() - ((double)(v / 1000L)));
                    if((cr.this.ReZ.Owx.get() || cr.this.ReZ.qj.get()) && cr.this.ReZ.tT.Zh()) {
                        cr.this.ReZ.tT.xE();
                    }
                    Au au0 = cr.this.ReZ.yIW;
                    if(au0 != null && au0.PjT() != null) {
                        cr.this.ReZ.yIW.PjT().setTime(String.valueOf(cr.this.JQp), ((int)(v / 1000L)), 0, false);
                    }
                    cr.this.PjT(((float)v) * 1.0f / ((float)v1));
                    if(cr.this.ReZ.yIW.Au() || cr.this.ReZ.Zh.es()) {
                        cr.this.ReZ(((int)(v / 1000L)));
                        cr cr0 = cr.this;
                        if(cr0.JQp >= 0) {
                            cr0.ReZ.wN.cr(true);
                            cr.this.ReZ.wN.PjT(String.valueOf(cr.this.JQp), null);
                        }
                    }
                }

                @Override  // x.b$a
                public void Zh(long v, int v1) {
                    cr.this.PjT.removeMessages(300);
                    gK gK0 = cr.this.ReZ.Zd.qla;
                    if(gK0 != null) {
                        gK0.DWo();
                    }
                    if(cr.this.ReZ.tT.Zh()) {
                        cr.this.JQp();
                        return;
                    }
                    cr.this.ReZ.tT.fDm();
                    cr.this.ReZ.yIW.PjT(true);
                    JQp zh$JQp0 = cr.this.Zh(3);
                    cr.this.cRA().PjT(cr.this, zh$JQp0);
                }
            });
            return this.ReZ.tT.PjT(v, z, hashMap0, this.Zh);
        }
        XX xX1 = new XX();
        xX1.PjT(System.currentTimeMillis(), 1.0f);
        com.bytedance.sdk.openadsdk.component.reward.Zh.Zh zh1 = this.Zh;
        if(zh1 == null || !(zh1 instanceof SM)) {
            this.ReZ.tT.PjT(this.ReZ.Zd.cz(), xX1);
        }
        else {
            this.ReZ.tT.PjT(((SM)zh1).KM(), xX1);
        }
        com.bytedance.sdk.openadsdk.activity.cr.4 cr$40 = new a() {
            boolean PjT;
            final cr Zh;

            @Override  // x.b$a
            public void PjT() {
                cr.this.PjT.removeMessages(300);
                cr.this.xs();
                JQp zh$JQp0 = cr.this.Zh(6);
                cr.this.cRA().PjT(cr.this, zh$JQp0);
            }

            @Override  // x.b$a
            public void PjT(long v, int v1) {
                if(this.PjT) {
                    return;
                }
                this.PjT = true;
                cr.this.PjT.removeMessages(300);
                cr.this.xs();
                cr.this.ReZ.tT.PjT(v, v);
                cr.this.ReZ.ltE.set(true);
                if(cr.this.ReZ.Zh.KH()) {
                    cr.this.ReZ.Zh.ig(1);
                    cr.this.ReZ.Zd.ub();
                }
                if(cr.this.ReZ.Zh.RD() == 21 && !cr.this.ReZ.Zh.Au()) {
                    cr.this.ReZ.Zh.Zh(true);
                    cr.this.ReZ.Zd.ub();
                }
                cr cr0 = cr.this;
                com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = cr0.ReZ;
                if(pjT0.ix) {
                    JQp zh$JQp0 = cr0.Zh(5);
                    zh$JQp0.JQp = true;
                    cr.this.cRA().PjT(cr.this, zh$JQp0);
                    return;
                }
                if(pjT0.ReZ) {
                    if(pjT0.Zh.Ik()) {
                        cr.this.ReZ.wN.ReZ();
                        return;
                    }
                    cr.this.PjT(false, 5);
                    if(gK.Zh(cr.this.ReZ.Zh)) {
                        xs xs0 = cr.this.ReZ.Xtz;
                        if(xs0 != null) {
                            xs0.PjT(0L);
                        }
                    }
                    if(!Owx.JQp(cr.this.ReZ.Zh)) {
                        cr.this.ReZ.tT.PjT("skip", true);
                    }
                }
                else {
                    if(pjT0.Zh.Ik()) {
                        cr.this.ReZ.wN.ReZ();
                        return;
                    }
                    if(!Owx.JQp(cr.this.ReZ.Zh)) {
                        cr.this.ReZ.tT.PjT("skip", true);
                    }
                    cr.this.iZZ();
                }
            }

            @Override  // x.b$a
            public void PjT(long v, long v1) {
                com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = cr.this.ReZ;
                if(!pjT0.dwk && pjT0.tT.Zh()) {
                    cr.this.ReZ.tT.xE();
                }
                if(cr.this.ReZ.DWo.get()) {
                    return;
                }
                cr.this.PjT.removeMessages(300);
                if(v != cr.this.ReZ.tT.Au()) {
                    cr.this.xs();
                }
                cr.this.ReZ.tT.PjT(v, v1);
                cr.this.JQp = (int)(cr.this.ReZ.tT.KM() - ((double)(v / 1000L)));
                if((cr.this.ReZ.Owx.get() || cr.this.ReZ.qj.get()) && cr.this.ReZ.tT.Zh()) {
                    cr.this.ReZ.tT.xE();
                }
                cr.this.ReZ(((int)(v / 1000L)));
                cr.this.PjT(((float)v) * 1.0f / ((float)v1));
                cr cr0 = cr.this;
                int v2 = cr0.JQp;
                if(v2 >= 0) {
                    cr0.ReZ.wN.PjT(String.valueOf(v2), null);
                }
            }

            @Override  // x.b$a
            public void Zh(long v, int v1) {
                cr.this.PjT.removeMessages(300);
                gK gK0 = cr.this.ReZ.Zd.qla;
                if(gK0 != null) {
                    gK0.DWo();
                }
                if(cr.this.ReZ.tT.Zh()) {
                    cr.this.JQp();
                    return;
                }
                cr.this.ReZ.tT.fDm();
                JQp zh$JQp0 = cr.this.Zh(3);
                cr.this.cRA().PjT(cr.this, zh$JQp0);
            }
        };
        this.ReZ.tT.PjT(cr$40);
        gK gK0 = this.ReZ.Zd.qla;
        if(gK0 != null) {
            gK0.PjT(cr$40);
        }
        return this.ReZ.tT.PjT(v, z, null, this.Zh);
    }

    private void ReZ(int v) {
        int v1;
        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = this.ReZ;
        if(pjT0 == null) {
            v1 = 5;
        }
        else {
            Owx owx0 = pjT0.Zh;
            if(owx0 == null) {
                v1 = pjT0 == null ? 5 : ub.cr().ltE(String.valueOf(this.ReZ.cz));
            }
            else {
                v1 = owx0.PjT();
            }
        }
        if(ub.cr().cz(String.valueOf(this.ReZ.cz)) && (Owx.JQp(this.ReZ.Zh) || this.ReZ.ReZ)) {
            com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT1 = this.ReZ;
            if(!pjT1.kFP) {
                pjT1.PjT(true);
            }
            if(v <= v1) {
                this.JQp(v1 - v);
                this.ReZ.wN.JQp(false);
                return;
            }
            this.Zh();
            return;
        }
        if(v >= v1) {
            com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT2 = this.ReZ;
            if(!pjT2.kFP) {
                pjT2.PjT(true);
            }
            this.Zh();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.PjT
    protected void ReZ() {
        View view0 = this.ReZ.Zd.DWo();
        if(view0 != null) {
            com.bytedance.sdk.openadsdk.activity.cr.1 cr$10 = new View.OnClickListener() {
                final cr PjT;

                @Override  // android.view.View$OnClickListener
                public void onClick(View view0) {
                    boolean z1;
                    if(cr.this.ReZ.Jo.yIW() && cr.this.ReZ.DWo.get()) {
                        boolean z = cr.this.ReZ.Co.xs();
                        cr.this.ReZ.Jo.cz(z);
                        cr.this.ReZ.Zd.JQp(8);
                        cr.this.ReZ.OMu.sendEmptyMessageDelayed(600, 5000L);
                        if(!Owx.ReZ(cr.this.ReZ.Zh) || Owx.ReZ(cr.this.ReZ.Zh) && z) {
                            return;
                        }
                    }
                    if(!cr.this.ReZ.Zh.wWn()) {
                    label_21:
                        z1 = false;
                    }
                    else if(cr.this.ReZ.Zh.uvo()) {
                        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = cr.this.ReZ;
                        if(pjT0.qZS == null) {
                            goto label_21;
                        }
                        else {
                            pjT0.Zh.ig(2);
                            z1 = cr.this.ReZ.qZS.JQp();
                        }
                    }
                    else {
                        if(cr.this.ReZ.Zh.cyr() == 0 && !cr.this.ReZ.Jo.ub()) {
                            cr.this.ReZ.Zh.ig(11);
                            if(cr.this.ReZ.Jo.cr()) {
                                cr.this.ReZ.Zh.ig(12);
                            }
                            try {
                                cr.this.ReZ.Zd.ub();
                                z1 = true;
                                goto label_22;
                            }
                            catch(Exception unused_ex) {
                            }
                        }
                        goto label_21;
                    }
                label_22:
                    if(z1) {
                        return;
                    }
                    cr.this.ReZ.Jo.iZZ();
                    cr.this.ReZ.Co.qj();
                    cr.this.ReZ.Yo.cz();
                    cr.this.iZZ();
                }
            };
            view0.setOnClickListener(cr$10);
            view0.setTag(view0.getId(), cr$10);
        }
        this.ReZ.wN.PjT(new com.bytedance.sdk.openadsdk.component.reward.top.Zh() {
            final cr Zh;

            @Override  // com.bytedance.sdk.openadsdk.component.reward.top.Zh
            public void PjT(View view0) {
                if(cRA.Au(cr.this.ReZ.Zh) && (cRA.gK(cr.this.ReZ.Zh) || cr.this.ReZ.DWo.get())) {
                    if(cr.this.ReZ.cRA.PjT()) {
                        cr.this.ReZ.cRA.PjT(5);
                        return;
                    }
                    cr.this.ReZ.Jo.Au();
                    return;
                }
                if(!cRA.gK(cr.this.ReZ.Zh) && (!gK.PjT(cr.this.ReZ.Zh) || cr.this.ReZ.xE.get())) {
                    if(cr.this.ReZ.Zh.Ee()) {
                        if(cr.this.ReZ.Zd.qj() != null) {
                            cr.this.ReZ.Zh.ig(2);
                            cr.this.ReZ.Zd.ub();
                        }
                        return;
                    }
                    com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = cr.this.ReZ;
                    if(!pjT0.ReZ && pjT0.Zh.wWn() && !cr.this.ReZ.Zh.uvo()) {
                        cr.this.ReZ.Zh.ig(13);
                        try {
                            cr.this.ReZ.Zd.ub();
                            return;
                        }
                        catch(Exception unused_ex) {
                        }
                    }
                    com.bytedance.sdk.openadsdk.cr.JQp.Zh.qla.PjT qla$PjT0 = new com.bytedance.sdk.openadsdk.cr.JQp.Zh.qla.PjT();
                    qla$PjT0.PjT(cr.this.ReZ.tT.XX());
                    qla$PjT0.ReZ(cr.this.ReZ.tT.Owx());
                    qla$PjT0.Zh(cr.this.ReZ.tT.qj());
                    qla$PjT0.ReZ(3);
                    qla$PjT0.cr(cr.this.ReZ.tT.ltE());
                    com.bytedance.sdk.openadsdk.cr.JQp.PjT.PjT.PjT(cr.this.ReZ.tT.ReZ(), qla$PjT0, cr.this.ReZ.tT.PjT());
                    tT.ReZ(cr.this.ReZ.cz);
                    cr.this.ReZ.tT.PjT("skip", false);
                    cr.this.ReZ.wN.cr(false);
                    cr cr0 = cr.this;
                    if(cr0.ReZ.ReZ) {
                        cr0.PjT(true, 4);
                    }
                    else {
                        cr0.iZZ();
                    }
                    Owx owx0 = cr.this.ReZ.Zh;
                    if(owx0 != null && owx0.QB() != null) {
                        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT1 = cr.this.ReZ;
                        if(pjT1.tT != null) {
                            pjT1.Zh.QB().PjT().cz(cr.this.ReZ.tT.XX());
                            cr.this.ReZ.Zh.QB().PjT().JQp(cr.this.ReZ.tT.XX());
                        }
                    }
                    com.bytedance.sdk.openadsdk.Lrd.Zh.JQp.PjT(cr.this.ReZ.Zh, 5);
                    return;
                }
                if(!cRA.Au(cr.this.ReZ.Zh) && cr.this.ReZ.cRA.PjT()) {
                    cr.this.ReZ.cRA.PjT(4);
                }
                cr.this.iZZ();
            }

            @Override  // com.bytedance.sdk.openadsdk.component.reward.top.Zh
            public void PjT(View view0, String s) {
                cr.this.ReZ.xH = !cr.this.ReZ.xH;
                com.bytedance.sdk.openadsdk.component.reward.Zh.Zh zh0 = cr.this.Zh;
                if(zh0 != null && zh0.cr() != null) {
                    cr.this.Zh.cr().PjT(cr.this.ReZ.xH);
                }
                cr.this.ReZ.tT.PjT(cr.this.ReZ.xH, s);
                if(cRA.ltE(cr.this.ReZ.Zh) && !cr.this.ReZ.DWo.get()) {
                    return;
                }
                cr.this.ReZ.Jo.JQp(cr.this.ReZ.xH);
                Owx owx0 = cr.this.ReZ.Zh;
                if(owx0 != null && owx0.QB() != null && cr.this.ReZ.Zh.QB().PjT() != null) {
                    com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = cr.this.ReZ;
                    if(pjT0.tT != null) {
                        if(pjT0.xH) {
                            pjT0.Zh.QB().PjT().Au(cr.this.ReZ.tT.XX());
                            return;
                        }
                        pjT0.Zh.QB().PjT().SM(cr.this.ReZ.tT.XX());
                    }
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.component.reward.top.Zh
            public void ReZ(View view0) {
                View view1 = view0;
                if(view1 != null) {
                    view1.performClick();
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.component.reward.top.Zh
            public void Zh(View view0) {
                cr.this.ReZ.Qf.PjT(cr.this.Zh);
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.PjT
    public void ReZ(Activity activity0) {
        super.ReZ(activity0);
        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = this.ReZ;
        if(pjT0 == null) {
            return;
        }
        if(this.Zh(pjT0.Zh) && !this.PjT(this.ReZ.Zh)) {
            if(this.cz) {
                this.cz = false;
                this.iZZ();
                return;
            }
            if(this.ReZ.Jo.Co()) {
                this.iZZ();
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.PjT
    protected void XX() {
        this.KM();
        if(this.Au.cr()) {
            this.ReZ.yIW.DWo();
        }
    }

    private boolean Zh(Owx owx0) {
        return owx0 == null ? false : ub.cr().Owx(String.valueOf(this.ReZ.cz));
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.PjT
    public void Zh() {
        if(Owx.JQp(this.ReZ.Zh)) {
            this.ReZ.wN.PjT(null, TTAdDislikeToast.getSkipText());
        }
        else {
            com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = this.ReZ;
            if(pjT0.ReZ) {
                this.ReZ.wN.PjT(null, TTAdDislikeToast.getSkipText());
            }
            else {
                pjT0.wN.PjT(null, "X");
            }
        }
        this.ReZ.wN.JQp(true);
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.cz
    protected boolean a_() {
        return false;
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.cz
    public String b_() {
        return "fullscreen_interstitial_ad";
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.cr.Zh
    public void c_() {
        if(this.ReZ.Zh.Qtm() != 100.0f) {
            this.cz = true;
        }
        this.Qf();
    }
}

