package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.component.utils.ltE;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.view.Au;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.cRA;
import com.bytedance.sdk.openadsdk.core.model.gK;
import com.bytedance.sdk.openadsdk.core.qj.cr;
import com.bytedance.sdk.openadsdk.core.tT;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.cr.XX;
import com.bytedance.sdk.openadsdk.utils.fDm;
import com.bytedance.sdk.openadsdk.utils.wN;
import com.bytedance.sdk.openadsdk.utils.xs;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import x.b.a;

public class JQp extends PjT {
    protected int JQp;
    private int Owx;
    int XX;
    protected int cz;
    private static String fDm;
    private String gK;
    private String ltE;
    private static String qla;
    private static String ub;
    private static String xE;
    private static String xs;

    public JQp(Zh zh0, Owx owx0, int v) {
        super(zh0, owx0, v);
        this.Owx = -1;
    }

    private void Jo() {
        com.bytedance.sdk.openadsdk.cr.JQp.Zh.qla.PjT qla$PjT0 = new com.bytedance.sdk.openadsdk.cr.JQp.Zh.qla.PjT();
        qla$PjT0.PjT(this.ReZ.tT.XX());
        qla$PjT0.ReZ(this.ReZ.tT.Owx());
        qla$PjT0.Zh(this.ReZ.tT.qj());
        qla$PjT0.ReZ(3);
        qla$PjT0.cr(this.ReZ.tT.ltE());
        com.bytedance.sdk.openadsdk.cr.JQp.PjT.PjT.PjT(this.ReZ.tT.ReZ(), qla$PjT0, this.ReZ.tT.PjT());
        tT.ReZ(this.ReZ.cz);
        this.ReZ.tT.PjT("skip", false);
        if(this.ReZ.ReZ) {
            this.PjT(true, 4);
            if(gK.PjT(this.ReZ.Zh) && !this.ReZ.xE.get()) {
                this.iZZ();
            }
        }
        else {
            this.iZZ();
        }
        com.bytedance.sdk.openadsdk.core.qj.PjT pjT0 = this.ReZ.Zh.QB();
        if(pjT0 != null) {
            cr cr0 = pjT0.PjT();
            long v = this.ReZ.tT.XX();
            cr0.cz(v);
            cr0.JQp(v);
        }
        com.bytedance.sdk.openadsdk.Lrd.Zh.JQp.PjT(this.ReZ.Zh, 5);
    }

    private boolean PjT(boolean z, boolean z1, Runnable runnable0) {
        if(!z1 && this.cRA().qj().getBoolean("user_has_give_up_reward", false) && (cRA.Au(this.ReZ.Zh) || runnable0 != null)) {
            if(runnable0 == null) {
                this.Jo();
            }
            return false;
        }
        if(!ub.cr().Au(String.valueOf(this.ReZ.cz))) {
            if(runnable0 == null) {
                if(z) {
                    this.iZZ();
                    return false;
                }
                this.Jo();
            }
            return false;
        }
        if(this.cRA().qj().getBoolean("reward_verify", false)) {
            if(runnable0 == null) {
                if(cRA.Au(this.ReZ.Zh)) {
                    this.Jo();
                    return false;
                }
                if(z) {
                    this.iZZ();
                    return false;
                }
                this.Jo();
            }
            return false;
        }
        this.ReZ.Owx.set(true);
        this.ReZ.tT.xE();
        if(z) {
            this.ReZ.cRA.fDm();
        }
        com.bytedance.sdk.openadsdk.core.widget.Zh zh0 = new com.bytedance.sdk.openadsdk.core.widget.Zh(this.yIW());
        this.Zh.xs = zh0;
        if(z) {
            zh0.PjT(JQp.xs).Zh(JQp.fDm).ReZ(JQp.qla);
        }
        else {
            zh0.PjT(JQp.xE).Zh(JQp.ub).ReZ(JQp.qla);
        }
        this.Zh.xs.PjT(new com.bytedance.sdk.openadsdk.core.widget.Zh.PjT() {
            final JQp cr;

            @Override  // com.bytedance.sdk.openadsdk.core.widget.Zh$PjT
            public void PjT() {
                JQp.this.ReZ.tT.qla();
                if(z) {
                    JQp.this.ReZ.cRA.JQp(1000);
                }
                zh0.dismiss();
                JQp.this.ReZ.Owx.set(false);
            }

            @Override  // com.bytedance.sdk.openadsdk.core.widget.Zh$PjT
            public void Zh() {
                zh0.dismiss();
                JQp.this.cRA().qj().putBoolean("user_has_give_up_reward", true);
                JQp.this.ReZ.Owx.set(false);
                JQp.this.ReZ.cRA.cz(0x7FFFFFFF);
                Runnable runnable0 = runnable0;
                if(runnable0 != null) {
                    runnable0.run();
                    return;
                }
                if(z) {
                    if(cRA.Au(JQp.this.ReZ.Zh)) {
                        if(JQp.this.ReZ.cRA.PjT()) {
                            JQp.this.ReZ.cRA.PjT(5);
                            return;
                        }
                        JQp.this.Jo();
                        return;
                    }
                    JQp.this.ReZ.Yo.cz();
                    if(JQp.this.ReZ.cRA.PjT()) {
                        JQp.this.ReZ.cRA.PjT(4);
                    }
                    JQp.this.iZZ();
                    return;
                }
                JQp.this.Jo();
            }
        }).show();
        return true;
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.PjT
    public void PjT(int v) {
        if(v == 10000) {
            this.tT();
        }
    }

    public void PjT(long v, long v1) {
        if(this.ReZ.ix) {
            return;
        }
        if(this.Au != null && this.Au.Yo() >= 0 && this.Au.Zh() >= 0) {
            this.Zh(v, ((long)this.Au.Zh()));
            return;
        }
        if(v1 <= 0L) {
            return;
        }
        long v2 = v + ((long)this.ReZ.MWx) * 1000L;
        if(this.Owx == -1) {
            this.Owx = ub.cr().iZZ(String.valueOf(this.ReZ.cz)).cz;
        }
        if(v1 >= 30000L && v2 >= 27000L) {
            this.tT();
            return;
        }
        if(((float)(v2 * 100L)) / ((float)v1) >= ((float)this.Owx)) {
            this.tT();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.PjT
    public void PjT(Activity activity0, com.bytedance.sdk.openadsdk.activity.Zh.JQp zh$JQp0) {
        super.PjT(activity0, zh$JQp0);
        if(activity0.isFinishing()) {
            return;
        }
        Intent intent0 = activity0.getIntent();
        this.ltE = intent0.getStringExtra("media_extra");
        this.gK = intent0.getStringExtra("user_id");
        if(JQp.xE == null) {
            try {
                JQp.xE = Lrd.PjT(this.ReZ.IJ, "tt_reward_msg");
                JQp.xs = Lrd.PjT(this.ReZ.IJ, "tt_msgPlayable");
                JQp.qla = Lrd.PjT(this.ReZ.IJ, "tt_negtiveBtnBtnText");
                JQp.ub = Lrd.PjT(this.ReZ.IJ, "tt_postiveBtnText");
                JQp.fDm = Lrd.PjT(this.ReZ.IJ, "tt_postiveBtnTextPlayable");
            }
            catch(Throwable throwable0) {
                RD.Zh("TTAD.RewardAdScene", throwable0.getMessage());
            }
        }
        Zh zh0 = this.cRA();
        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = this.ReZ;
        if(pjT0 != null && zh0 != null) {
            pjT0.uQg = zh0.Zh;
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.PjT
    public void PjT(Bundle bundle0) {
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.PjT
    public void PjT(String s, JSONObject jSONObject0) {
        if("skipToNextAd".equals(s) && this.ReZ.hN != null && this.cRA().XX() == null && this.PjT(cRA.ReZ(this.ReZ.Zh), false, new Runnable() {
            final JQp ReZ;

            @Override
            public void run() {
                JQp.this.super.PjT(s, jSONObject0);
            }
        })) {
            return;
        }
        super.PjT(s, jSONObject0);
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.PjT
    public void PjT(boolean z) {
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.cr.Zh
    public boolean PjT(long v, boolean z) {
        if(this.Au.cr()) {
            Au au0 = this.ReZ.yIW;
            XX xX0 = au0 == null || au0.PjT() == null ? new XX() : this.ReZ.yIW.PjT().getAdShowTime();
            this.ReZ.tT.PjT(this.ReZ.yIW.Zh(), xX0);
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
                final JQp Zh;

                @Override  // x.b$a
                public void PjT() {
                    JQp.this.PjT.removeMessages(300);
                    JQp.this.xs();
                    JQp.this.tT();
                    com.bytedance.sdk.openadsdk.activity.Zh.JQp zh$JQp0 = JQp.this.Zh(6);
                    JQp.this.cRA().PjT(JQp.this, zh$JQp0);
                }

                @Override  // x.b$a
                public void PjT(long v, int v1) {
                    if(this.PjT) {
                        return;
                    }
                    this.PjT = true;
                    JQp.this.PjT.removeMessages(300);
                    JQp.this.xs();
                    JQp.this.ReZ.tT.PjT(v, v);
                    JQp.this.ReZ.yIW.Zh(true);
                    if(JQp.this.ReZ.Zh.RD() == 36) {
                        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = JQp.this.ReZ;
                        if(pjT0.ReZ) {
                            pjT0.Lrd.ReZ().cr();
                            fDm.Zh();
                        }
                    }
                    if(JQp.this.ReZ.Zh.RD() == 21 && !JQp.this.ReZ.Zh.Au()) {
                        JQp.this.ReZ.Zh.Zh(true);
                        JQp.this.ReZ.Zd.ub();
                    }
                    JQp jQp0 = JQp.this;
                    com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT1 = jQp0.ReZ;
                    if(pjT1.ix) {
                        com.bytedance.sdk.openadsdk.activity.Zh.JQp zh$JQp0 = JQp.this.Zh(5);
                        jQp0.cRA().PjT(JQp.this, zh$JQp0);
                    }
                    else if(!pjT1.ReZ) {
                        if(!pjT1.Zh.Ik()) {
                            if(!Owx.JQp(JQp.this.ReZ.Zh)) {
                                JQp.this.ReZ.tT.PjT("skip", true);
                            }
                            JQp.this.iZZ();
                        }
                        else if(JQp.this.ReZ.yIW.SM() == 1) {
                            JQp.this.ReZ.wN.ReZ();
                        }
                    }
                    else if(!pjT1.Zh.Ik()) {
                        JQp.this.PjT(false, 5);
                        if(!Owx.JQp(JQp.this.ReZ.Zh)) {
                            JQp.this.ReZ.tT.PjT("skip", true);
                        }
                    }
                    else if(JQp.this.ReZ.yIW.SM() == 1) {
                        JQp.this.ReZ.wN.ReZ();
                    }
                    JQp.this.JQp = (int)(System.currentTimeMillis() / 1000L);
                    JQp jQp1 = JQp.this;
                    if(!jQp1.ReZ.ix) {
                        jQp1.tT();
                    }
                }

                @Override  // x.b$a
                public void PjT(long v, long v1) {
                    int v2;
                    com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = JQp.this.ReZ;
                    if(!pjT0.dwk && pjT0.tT.Zh()) {
                        JQp.this.ReZ.tT.xE();
                    }
                    if(JQp.this.ReZ.DWo.get()) {
                        return;
                    }
                    JQp.this.PjT.removeMessages(300);
                    if(v != JQp.this.ReZ.tT.Au()) {
                        JQp.this.xs();
                    }
                    if(!JQp.this.ReZ.tT.Zh()) {
                        return;
                    }
                    JQp.this.ReZ.tT.PjT(v, v1);
                    Owx owx0 = JQp.this.Au;
                    if(owx0 == null || owx0.Zh() < 0) {
                        v2 = JQp.this.ReZ == null ? 30 : ub.cr().DWo(String.valueOf(JQp.this.ReZ.cz));
                    }
                    else {
                        v2 = JQp.this.Au.Zh();
                    }
                    boolean z = JQp.this.ReZ.yIW.Au() && v2 != -1 && v2 >= 0;
                    JQp.this.XX = (int)(JQp.this.ReZ.tT.KM() - ((double)(v / 1000L)));
                    if((JQp.this.ReZ.Owx.get() || JQp.this.ReZ.qj.get()) && JQp.this.ReZ.tT.Zh()) {
                        JQp.this.ReZ.tT.xE();
                    }
                    JQp jQp0 = JQp.this;
                    int v3 = jQp0.XX;
                    if(v3 >= 0) {
                        jQp0.ReZ.wN.PjT(String.valueOf(v3), null);
                    }
                    JQp.this.ReZ.Zd.cr(((int)(v / 1000L)));
                    JQp.this.PjT(v, v1);
                    Au au0 = JQp.this.ReZ.yIW;
                    if(au0 != null && au0.PjT() != null) {
                        JQp.this.ReZ.yIW.PjT().setTime(String.valueOf(JQp.this.XX), ((int)(v / 1000L)), 0, false);
                    }
                    JQp.this.PjT(((float)v) * 1.0f / ((float)v1));
                    JQp jQp1 = JQp.this;
                    if(jQp1.XX > 0) {
                        if(z && ((int)(v / 1000L)) >= v2 && jQp1.ReZ.Zh.RD() != 5) {
                            JQp.this.ReZ.PjT(true);
                            JQp.this.ReZ.wN.PjT(String.valueOf(JQp.this.XX), TTAdDislikeToast.getSkipText());
                            JQp.this.ReZ.wN.JQp(true);
                            return;
                        }
                        JQp.this.ReZ.wN.PjT(String.valueOf(JQp.this.XX), null);
                    }
                }

                @Override  // x.b$a
                public void Zh(long v, int v1) {
                    JQp.this.PjT.removeMessages(300);
                    gK gK0 = JQp.this.ReZ.Zd.qla;
                    if(gK0 != null) {
                        gK0.DWo();
                    }
                    if(JQp.this.ReZ.tT.Zh()) {
                        JQp.this.JQp();
                        return;
                    }
                    JQp.this.tT();
                    JQp.this.ReZ.tT.fDm();
                    JQp.this.ReZ.yIW.PjT(true);
                    com.bytedance.sdk.openadsdk.activity.Zh.JQp zh$JQp0 = JQp.this.Zh(3);
                    JQp.this.cRA().PjT(JQp.this, zh$JQp0);
                }
            });
            boolean z1 = this.ReZ.tT.PjT(v, z, hashMap0, this.Zh);
            if(z1 && !z) {
                this.cz = (int)(System.currentTimeMillis() / 1000L);
            }
            return z1;
        }
        XX xX1 = new XX();
        xX1.PjT(System.currentTimeMillis(), 1.0f);
        this.ReZ.tT.PjT(this.ReZ.Zd.cz(), xX1);
        com.bytedance.sdk.openadsdk.activity.JQp.4 jQp$40 = new a() {
            boolean PjT;
            final JQp Zh;

            @Override  // x.b$a
            public void PjT() {
                JQp.this.PjT.removeMessages(300);
                JQp.this.xs();
                JQp.this.tT();
                com.bytedance.sdk.openadsdk.activity.Zh.JQp zh$JQp0 = JQp.this.Zh(6);
                JQp.this.cRA().PjT(JQp.this, zh$JQp0);
            }

            @Override  // x.b$a
            public void PjT(long v, int v1) {
                if(this.PjT) {
                    return;
                }
                this.PjT = true;
                JQp.this.PjT.removeMessages(300);
                JQp.this.xs();
                JQp jQp0 = JQp.this;
                if(!jQp0.ReZ.ix) {
                    jQp0.tT();
                }
                JQp.this.ReZ.tT.PjT(v, v);
                JQp.this.ReZ.ltE.set(true);
                if(JQp.this.ReZ.Zh.KH()) {
                    JQp.this.ReZ.Zh.ig(1);
                    JQp.this.ReZ.Zd.ub();
                }
                if(JQp.this.ReZ.Zh.RD() == 21 && !JQp.this.ReZ.Zh.Au()) {
                    JQp.this.ReZ.Zh.Zh(true);
                    JQp.this.ReZ.Zd.ub();
                }
                JQp.this.JQp = (int)(System.currentTimeMillis() / 1000L);
                JQp jQp1 = JQp.this;
                com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = jQp1.ReZ;
                if(pjT0.ix) {
                    com.bytedance.sdk.openadsdk.activity.Zh.JQp zh$JQp0 = jQp1.Zh(5);
                    zh$JQp0.JQp = true;
                    JQp.this.cRA().PjT(JQp.this, zh$JQp0);
                    return;
                }
                if(!gK.cr(pjT0.Zh) && !gK.Zh(JQp.this.ReZ.Zh) && !gK.JQp(JQp.this.ReZ.Zh)) {
                    if(gK.PjT(JQp.this.ReZ.Zh) && !JQp.this.ReZ.xE.get()) {
                        JQp.this.ReZ.PjT(true);
                        JQp.this.ReZ.wN.JQp(true);
                        return;
                    }
                    com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT1 = JQp.this.ReZ;
                    if(pjT1.ReZ) {
                        if(pjT1.Zh.Ik()) {
                            JQp.this.ReZ.wN.ReZ();
                            return;
                        }
                        JQp.this.PjT(false, 5);
                        if(!Owx.JQp(JQp.this.ReZ.Zh)) {
                            JQp.this.ReZ.tT.PjT("skip", true);
                            return;
                        }
                    }
                    else {
                        if(pjT1.Zh.Ik()) {
                            JQp.this.ReZ.wN.ReZ();
                            return;
                        }
                        if(!Owx.JQp(JQp.this.ReZ.Zh)) {
                            JQp.this.ReZ.tT.PjT("skip", true);
                        }
                        JQp.this.iZZ();
                    }
                    return;
                }
                JQp.this.PjT(false, 5);
                if(gK.Zh(JQp.this.ReZ.Zh)) {
                    xs xs0 = JQp.this.ReZ.Xtz;
                    if(xs0 != null) {
                        xs0.PjT(0L);
                    }
                }
            }

            @Override  // x.b$a
            public void PjT(long v, long v1) {
                int v3;
                com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = JQp.this.ReZ;
                if(!pjT0.dwk && pjT0.tT.Zh()) {
                    JQp.this.ReZ.tT.xE();
                }
                if(JQp.this.ReZ.DWo.get()) {
                    return;
                }
                JQp.this.PjT.removeMessages(300);
                if(v != JQp.this.ReZ.tT.Au()) {
                    JQp.this.xs();
                }
                JQp.this.ReZ.tT.PjT(v, v1);
                JQp.this.XX = (int)(JQp.this.ReZ.tT.KM() - ((double)(v / 1000L)));
                JQp jQp0 = JQp.this;
                int v2 = jQp0.XX;
                if(v2 >= 0) {
                    jQp0.ReZ.wN.PjT(String.valueOf(v2), null);
                }
                JQp.this.XX = (int)(JQp.this.ReZ.tT.KM() - ((double)(v / 1000L)));
                Owx owx0 = JQp.this.Au;
                if(owx0 == null || owx0.Zh() < 0) {
                    v3 = JQp.this.ReZ == null ? 30 : ub.cr().DWo(String.valueOf(JQp.this.ReZ.cz));
                }
                else {
                    v3 = JQp.this.Au.Zh();
                }
                if((JQp.this.ReZ.Owx.get() || JQp.this.ReZ.qj.get()) && JQp.this.ReZ.tT.Zh()) {
                    JQp.this.ReZ.tT.xE();
                }
                JQp.this.ReZ.Zd.cr(((int)(v / 1000L)));
                JQp.this.PjT(v, v1);
                JQp.this.PjT(((float)v) * 1.0f / ((float)v1));
                JQp jQp1 = JQp.this;
                if(jQp1.XX > 0) {
                    jQp1.ReZ.wN.cr(true);
                    if(v3 >= 0 && ((int)(v / 1000L)) >= v3) {
                        JQp.this.ReZ.PjT(true);
                        JQp.this.ReZ.wN.PjT(String.valueOf(JQp.this.XX), TTAdDislikeToast.getSkipText());
                        JQp.this.ReZ.wN.JQp(true);
                        return;
                    }
                    JQp.this.ReZ.wN.PjT(String.valueOf(JQp.this.XX), null);
                }
            }

            @Override  // x.b$a
            public void Zh(long v, int v1) {
                JQp.this.PjT.removeMessages(300);
                gK gK0 = JQp.this.ReZ.Zd.qla;
                if(gK0 != null) {
                    gK0.DWo();
                }
                if(JQp.this.ReZ.tT.Zh()) {
                    JQp.this.JQp();
                    return;
                }
                JQp.this.ReZ.tT.fDm();
                JQp.this.tT();
                com.bytedance.sdk.openadsdk.activity.Zh.JQp zh$JQp0 = JQp.this.Zh(3);
                JQp.this.cRA().PjT(JQp.this, zh$JQp0);
            }
        };
        this.ReZ.tT.PjT(jQp$40);
        gK gK0 = this.ReZ.Zd.qla;
        if(gK0 != null) {
            gK0.PjT(jQp$40);
        }
        boolean z2 = this.ReZ.tT.PjT(v, z, null, this.Zh);
        if(z2 && !z) {
            this.cz = (int)(System.currentTimeMillis() / 1000L);
        }
        return z2;
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.PjT
    protected void ReZ() {
        View view0 = this.ReZ.Zd.DWo();
        if(view0 != null) {
            com.bytedance.sdk.openadsdk.activity.JQp.1 jQp$10 = new View.OnClickListener() {
                final JQp PjT;

                @Override  // android.view.View$OnClickListener
                public void onClick(View view0) {
                    boolean z1;
                    if(JQp.this.ReZ.Jo.yIW() && JQp.this.ReZ.DWo.get()) {
                        boolean z = JQp.this.ReZ.Co.xs();
                        JQp.this.ReZ.Jo.cz(z);
                        JQp.this.ReZ.Zd.JQp(8);
                        JQp.this.ReZ.OMu.sendEmptyMessageDelayed(600, 5000L);
                        if(!Owx.ReZ(JQp.this.ReZ.Zh) || Owx.ReZ(JQp.this.ReZ.Zh) && z) {
                            return;
                        }
                    }
                    if(!JQp.this.ReZ.Zh.wWn()) {
                    label_21:
                        z1 = false;
                    }
                    else if(JQp.this.ReZ.Zh.uvo()) {
                        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = JQp.this.ReZ;
                        if(pjT0.qZS == null) {
                            goto label_21;
                        }
                        else {
                            pjT0.Zh.ig(2);
                            z1 = JQp.this.ReZ.qZS.JQp();
                        }
                    }
                    else {
                        if(JQp.this.ReZ.Zh.cyr() == 0 && !JQp.this.ReZ.Jo.ub()) {
                            JQp.this.ReZ.Zh.ig(11);
                            if(JQp.this.ReZ.Jo.cr()) {
                                JQp.this.ReZ.Zh.ig(12);
                            }
                            try {
                                JQp.this.ReZ.Zd.ub();
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
                    JQp.this.ReZ.Jo.iZZ();
                    JQp.this.ReZ.Co.qj();
                    JQp.this.ReZ.Yo.cz();
                    if(cRA.cr(JQp.this.ReZ.Zh)) {
                        JQp.this.PjT(true, true, null);
                        return;
                    }
                    JQp.this.iZZ();
                }
            };
            view0.setOnClickListener(jQp$10);
            view0.setTag(view0.getId(), jQp$10);
        }
        this.ReZ.wN.PjT(new com.bytedance.sdk.openadsdk.component.reward.top.Zh() {
            final JQp Zh;

            @Override  // com.bytedance.sdk.openadsdk.component.reward.top.Zh
            public void PjT(View view0) {
                if(JQp.this.ReZ.Zh.Ee()) {
                    if(JQp.this.ReZ.Zd.qj() != null) {
                        JQp.this.ReZ.Zh.ig(2);
                        JQp.this.ReZ.Zd.ub();
                    }
                    return;
                }
                com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = JQp.this.ReZ;
                if(!pjT0.ReZ && pjT0.Zh.wWn() && !JQp.this.ReZ.Zh.uvo()) {
                    JQp.this.ReZ.Zh.ig(13);
                    try {
                        JQp.this.ReZ.Zd.ub();
                        return;
                    }
                    catch(Exception unused_ex) {
                    }
                }
                boolean z = cRA.ReZ(JQp.this.ReZ.Zh);
                JQp.this.PjT(z, false, null);
            }

            @Override  // com.bytedance.sdk.openadsdk.component.reward.top.Zh
            public void PjT(View view0, String s) {
                com.bytedance.sdk.openadsdk.component.reward.Zh.Zh zh0 = JQp.this.Zh;
                if(zh0 != null && zh0.cr() != null) {
                    JQp.this.Zh.cr().PjT(JQp.this.ReZ.xH);
                }
                JQp.this.ReZ.xH = !JQp.this.ReZ.xH;
                StringBuilder stringBuilder0 = new StringBuilder("will set is Mute ");
                stringBuilder0.append(JQp.this.ReZ.xH);
                stringBuilder0.append(" mLastVolume=");
                stringBuilder0.append(JQp.this.ReZ.ZX.PjT());
                JQp.this.ReZ.tT.PjT(JQp.this.ReZ.xH, s);
                if(cRA.ltE(JQp.this.ReZ.Zh) && !JQp.this.ReZ.DWo.get()) {
                    return;
                }
                JQp.this.ReZ.Jo.JQp(JQp.this.ReZ.xH);
                Owx owx0 = JQp.this.ReZ.Zh;
                if(owx0 != null && owx0.QB() != null && JQp.this.ReZ.Zh.QB().PjT() != null) {
                    com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = JQp.this.ReZ;
                    if(pjT0.tT != null) {
                        if(pjT0.xH) {
                            pjT0.Zh.QB().PjT().Au(JQp.this.ReZ.tT.XX());
                            return;
                        }
                        pjT0.Zh.QB().PjT().SM(JQp.this.ReZ.tT.XX());
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
                JQp.this.ReZ.Qf.PjT(JQp.this.Zh);
            }
        });
    }

    public void ReZ(int v) {
        if(!this.cRA().qj().getBoolean("reward_verify", false) && !this.cRA().qla() && !this.cRA().qj().getBoolean("user_has_give_up_reward", false)) {
            this.cRA().qj().putBoolean("reward_verify", true);
            if(ub.cr().xE(String.valueOf(this.ReZ.cz))) {
                this.PjT(true, this.ReZ.Zh.yIW(), this.ReZ.Zh.cRA(), 0, "", v);
                return;
            }
            JSONObject jSONObject0 = this.ZX();
            ub.ReZ().PjT(jSONObject0, new com.bytedance.sdk.openadsdk.core.ltE.Zh() {
                final JQp Zh;

                @Override  // com.bytedance.sdk.openadsdk.core.ltE$Zh
                public void PjT(int v, String s) {
                    JQp.this.PjT(false, 0, "", v, s, v);
                }

                @Override  // com.bytedance.sdk.openadsdk.core.ltE$Zh
                public void PjT(com.bytedance.sdk.openadsdk.core.Owx.Zh owx$Zh0) {
                    int v = owx$Zh0.ReZ.PjT();
                    String s = owx$Zh0.ReZ.Zh();
                    JQp.this.PjT(owx$Zh0.Zh, v, s, 0, "", v);
                }
            });
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.PjT
    protected void XX() {
        this.KM();
        if(this.Au.cr()) {
            this.ReZ.yIW.DWo();
        }
    }

    private JSONObject ZX() {
        JSONObject jSONObject0 = new JSONObject();
        int v = (int)this.ReZ.tT.RD();
        try {
            jSONObject0.put("oversea_version_type", 1);
            jSONObject0.put("reward_name", this.ReZ.Zh.cRA());
            jSONObject0.put("reward_amount", this.ReZ.Zh.yIW());
            jSONObject0.put("network", ltE.ReZ(this.ReZ.IJ));
            jSONObject0.put("sdk_version", "7.1.0.4");
            int v1 = this.ReZ.Zh.OMu();
            jSONObject0.put("user_agent", (v1 == 2 || v1 != 1 ? "unKnow" : wN.ReZ()));
            JSONObject jSONObject1 = this.ReZ.Zh.Tn();
            jSONObject1.put("gaid", com.bytedance.sdk.openadsdk.ltE.PjT.Zh.PjT.PjT().Zh());
            jSONObject0.put("extra", jSONObject1);
            jSONObject0.put("media_extra", this.ltE);
            jSONObject0.put("video_duration", this.ReZ.Zh.MWx().C());
            jSONObject0.put("play_start_ts", this.cz);
            jSONObject0.put("play_end_ts", this.JQp);
            jSONObject0.put("duration", v);
            jSONObject0.put("user_id", this.gK);
            jSONObject0.put("trans_id", "2a8c81fe68d740d1bb57e1a7d568eb97");
            return jSONObject0;
        }
        catch(Throwable throwable0) {
        }
        RD.PjT("TTAD.RewardAdScene", "", throwable0);
        return null;
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.PjT
    protected void Zh() {
        this.ReZ.wN.PjT(null, TTAdDislikeToast.getSkipText());
        this.ReZ.wN.JQp(true);
    }

    protected void Zh(long v, long v1) {
        if(v1 <= 0L) {
            return;
        }
        if(this.Owx == -1) {
            this.Owx = Math.min(100, this.Au.Yo());
        }
        if(((float)v) / 1000.0f / ((float)v1) * 100.0f >= ((float)this.Owx)) {
            this.tT();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.cz
    protected boolean a_() {
        return true;
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.cz
    public String b_() {
        return "rewarded_video";
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.cr.Zh
    public void c_() {
        this.Qf();
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.PjT
    public void fDm() {
        if(!this.Au.Sky()) {
            return;
        }
        int v = ub.cr().iZZ(String.valueOf(this.ReZ.cz)).cz;
        int v1 = 0;
        if(cRA.ltE(this.ReZ.Zh)) {
            double f = this.ReZ.tT.KM();
            if((1.0 - ((double)this.XX) / f) * 100.0 >= ((double)v)) {
                v1 = 1;
            }
        }
        else {
            int v2 = this.ReZ.Zh.Gr();
            int v3 = (1.0f - this.ReZ.cRA.Zh() / ((float)v2)) * 100.0f >= ((float)v) ? 1 : 0;
            int v4 = ub.cr().PjT(String.valueOf(this.ReZ.cz));
            if(v4 == 0) {
                boolean z = this.ReZ.Jo.xf().cz();
                if(this.ReZ.cRA.ReZ()) {
                    z = true;
                }
                if(v3 != 0 && z) {
                    v1 = 1;
                }
            }
            else if(v4 == 1) {
                v1 = v3;
            }
        }
        if(v1 != 0) {
            this.tT();
        }
    }

    public void tT() {
        this.ReZ(0);
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.PjT
    public void xf() {
        this.tT();
    }
}

