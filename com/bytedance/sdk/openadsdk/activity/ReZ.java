package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.view.View.OnClickListener;
import android.view.View;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.KM.PjT;
import com.bytedance.sdk.component.utils.KM;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.component.utils.ltE;
import com.bytedance.sdk.openadsdk.component.reward.PjT.qj;
import com.bytedance.sdk.openadsdk.component.reward.Zh.XX;
import com.bytedance.sdk.openadsdk.component.reward.view.Au;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.cRA;
import com.bytedance.sdk.openadsdk.core.model.gK;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.core.xf.cr.Zh;
import com.bytedance.sdk.openadsdk.utils.cr;
import com.bytedance.sdk.openadsdk.utils.wN;
import org.json.JSONObject;
import s.a;

public class ReZ extends cz implements PjT, Zh {
    private static String JQp;
    private int Lrd;
    private String Owx;
    protected final KM PjT;
    private boolean RD;
    protected com.bytedance.sdk.openadsdk.component.reward.PjT.PjT ReZ;
    private long Sks;
    private static String XX;
    @Nullable
    protected com.bytedance.sdk.openadsdk.component.reward.Zh.Zh Zh;
    private boolean cRA;
    private static String cr;
    private static String cz;
    private Bundle fDm;
    private boolean gK;
    private String ltE;
    private int qla;
    private JSONObject tT;
    private boolean ub;
    private JQp xE;
    private static String xs;

    public ReZ(com.bytedance.sdk.openadsdk.activity.Zh zh0, Owx owx0, int v) {
        super(zh0, owx0, v);
        this.PjT = new KM(Looper.getMainLooper(), this);
        this.qla = 0;
        this.cRA = true;
        this.RD = zh0.PjT();
        this.PjT(owx0, this.fDm);
        if(!this.RD) {
            try {
                this.gK();
            }
            catch(Throwable unused_ex) {
                this.iZZ();
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.cr.Zh
    public final void Au() {
        if(this.cRA() == null) {
            return;
        }
        boolean z = this.xE.PjT.getBoolean("isSkip", false);
        boolean z1 = this.xE.PjT.getBoolean("force", false);
        boolean z2 = this.xE.PjT.getBoolean("isFromLandingPage", false);
        this.ReZ.qZS.PjT(z, z1, z2, this.Zh, this.xE.Zh);
    }

    // 检测为 Lambda 实现
    private void Co() [...]

    @Override  // com.bytedance.sdk.openadsdk.core.xf.cr.Zh
    public final View DWo() {
        return null;
    }

    public void JQp() {
        com.bytedance.sdk.openadsdk.component.reward.Zh.Zh zh0 = this.Zh;
        if(zh0 == null) {
            return;
        }
        zh0.iZZ();
        this.ReZ.qZS.Zh();
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.cz
    public final void JQp(Activity activity0) {
        super.JQp(activity0);
        com.bytedance.sdk.openadsdk.component.reward.Zh.Zh zh0 = this.Zh;
        if(zh0 == null) {
            return;
        }
        zh0.Owx();
    }

    private boolean Jo() {
        if(this.ReZ.DWo.get() && this.ReZ.XX) {
            return false;
        }
        return this.Au.cr() ? this.ReZ.DWo.get() : true;
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.cz
    protected String Owx() {
        return this.ReZ.tY;
    }

    private void PjT(com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0, com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT1) {
        if(this.RD && !this.Lrd() && pjT0 != null && pjT1 != null) {
            try {
                this.Sks = pjT1.tT.Au();
                if(this.Au.Ik()) {
                    this.Sks = pjT1.ReZ();
                }
                this.Lrd = pjT1.tT.gK();
                long v = pjT1.tT.qj();
                a a0 = pjT1.tT.xf();
                this.tT = wN.PjT(this.Au, v, a0);
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    private void PjT(Owx owx0, Bundle bundle0) {
        Activity activity0 = this.yIW();
        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = new com.bytedance.sdk.openadsdk.component.reward.PjT.PjT(activity0, this.PjT, owx0, this, 2);
        this.ReZ = pjT0;
        pjT0.ix = this.cRA().Zh();
        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT1 = this.ReZ;
        pjT1.Nv = this.RD;
        if(this.RD) {
            pjT1.dIF = this.cRA().SM();
        }
        this.ReZ.hN = this;
        this.ReZ.ZX = this.cRA().ltE();
        Intent intent0 = activity0.getIntent();
        com.bytedance.sdk.openadsdk.component.reward.PjT.Zh.PjT(this.ReZ, intent0, bundle0);
        com.bytedance.sdk.openadsdk.component.reward.Zh.Zh zh0 = XX.PjT(this.ReZ);
        this.Zh = zh0;
        this.ReZ.wKV = zh0;
    }

    private boolean PjT(boolean z, boolean z1, Runnable runnable0) {
        if(!this.ReZ.cr || this.cRA().qj().getBoolean("reward_verify", false) || this.cRA().qla() || !z1 && this.cRA().qj().getBoolean("user_has_give_up_reward", false)) {
            return false;
        }
        if(!ub.cr().Au(String.valueOf(this.ReZ.cz))) {
            if(!z1) {
                return false;
            }
            if(runnable0 == null && z) {
                this.iZZ();
                return true;
            }
        }
        this.ReZ.Owx.set(true);
        if(z) {
            this.ReZ.cRA.fDm();
        }
        com.bytedance.sdk.openadsdk.core.widget.Zh zh0 = new com.bytedance.sdk.openadsdk.core.widget.Zh(this.ReZ.rds);
        this.Zh.xs = zh0;
        if(z) {
            zh0.PjT(ReZ.cr).Zh(ReZ.JQp).ReZ(ReZ.cz);
        }
        else {
            zh0.PjT(ReZ.XX).Zh(ReZ.xs).ReZ(ReZ.cz);
        }
        this.Zh.xs.PjT(new com.bytedance.sdk.openadsdk.core.widget.Zh.PjT() {
            final ReZ cr;

            @Override  // com.bytedance.sdk.openadsdk.core.widget.Zh$PjT
            public void PjT() {
                if(z) {
                    ReZ.this.ReZ.cRA.JQp(1000);
                }
                zh0.dismiss();
                ReZ.this.ReZ.Owx.set(false);
            }

            @Override  // com.bytedance.sdk.openadsdk.core.widget.Zh$PjT
            public void Zh() {
                zh0.dismiss();
                ReZ.this.cRA().qj().putBoolean("user_has_give_up_reward", true);
                ReZ.this.ReZ.Owx.set(false);
                ReZ.this.ReZ.cRA.cz(0x7FFFFFFF);
                Runnable runnable0 = runnable0;
                if(runnable0 != null) {
                    runnable0.run();
                    return;
                }
                if(z) {
                    if(cRA.Au(ReZ.this.ReZ.Zh)) {
                        if(ReZ.this.ReZ.cRA.PjT()) {
                            ReZ.this.ReZ.cRA.PjT(5);
                            return;
                        }
                        ReZ.this.ReZ.Jo.Au();
                        ReZ.this.ZX();
                        return;
                    }
                    ReZ.this.ReZ.Yo.cz();
                    if(ReZ.this.ReZ.cRA.PjT()) {
                        ReZ.this.ReZ.cRA.PjT(4);
                    }
                    ReZ.this.iZZ();
                    return;
                }
                ReZ.this.ZX();
            }
        }).show();
        return true;
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.cz
    public final View PjT() {
        return this.ReZ.ig;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.cr.Zh
    public void PjT(int v) {
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.cz
    public final void PjT(Activity activity0, Bundle bundle0) {
        this.fDm = bundle0;
        super.PjT(activity0, bundle0);
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.cz
    public void PjT(Activity activity0, JQp zh$JQp0) {
        super.PjT(activity0, zh$JQp0);
        this.xE = zh$JQp0;
        Intent intent0 = activity0.getIntent();
        this.Owx = intent0.getStringExtra("media_extra");
        this.ltE = intent0.getStringExtra("user_id");
        if(ReZ.XX == null) {
            try {
                ReZ.XX = Lrd.PjT(this.ReZ.IJ, "tt_reward_msg");
                ReZ.cr = Lrd.PjT(this.ReZ.IJ, "tt_msgPlayable");
                ReZ.cz = Lrd.PjT(this.ReZ.IJ, "tt_negtiveBtnBtnText");
                ReZ.xs = Lrd.PjT(this.ReZ.IJ, "tt_postiveBtnText");
                ReZ.JQp = Lrd.PjT(this.ReZ.IJ, "tt_postiveBtnTextPlayable");
            }
            catch(Throwable throwable0) {
                RD.Zh("TTAD.EndCardScene", throwable0.getMessage());
            }
        }
        if(zh$JQp0 != null) {
            com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = zh$JQp0.ReZ;
            if(pjT0 != null) {
                this.ReZ.xs.set(pjT0.xs.get());
                this.ReZ.CY = pjT0.CY;
                this.ReZ.xH = pjT0.xH;
                if(this.RD && !this.Lrd()) {
                    this.ReZ.xf.set(pjT0.xf.get());
                }
                this.ReZ.fDm.set(pjT0.fDm.get());
                this.ReZ.tT.PjT(pjT0.tT.PjT());
                this.PjT(this.ReZ, pjT0);
            }
        }
        if(this.RD) {
            try {
                this.gK();
            }
            catch(Throwable unused_ex) {
                this.iZZ();
            }
        }
        com.bytedance.sdk.openadsdk.activity.Zh zh0 = this.cRA();
        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT1 = this.ReZ;
        if(pjT1 != null && zh0 != null) {
            pjT1.uQg = zh0.Zh;
        }
        this.RD();
        this.tT();
        this.Au();
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.cr.Zh
    public void PjT(Bundle bundle0) {
    }

    @Override  // com.bytedance.sdk.component.utils.KM$PjT
    public final void PjT(Message message0) {
        com.bytedance.sdk.openadsdk.component.reward.Zh.Zh zh0 = this.Zh;
        if(zh0 == null) {
            return;
        }
        zh0.PjT(message0);
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.cz
    public void PjT(cz cz0, cz cz1, JQp zh$JQp0) {
        super.PjT(cz0, cz1, zh$JQp0);
        if(this.RD) {
            if(cz1 instanceof com.bytedance.sdk.openadsdk.activity.PjT && (this.SM == cz1.SM + 1 || cz0 == null && this.Lrd())) {
                try {
                    this.gK();
                }
                catch(Throwable unused_ex) {
                    this.iZZ();
                }
                this.RD();
            }
            return;
        }
        if(cz0 == null && cz1 != this) {
            this.RD();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.cr.Zh
    public void PjT(String s, JSONObject jSONObject0) {
        if(s == null) {
            return;
        }
        if(!"skipToNextAd".equals(s) || this.cRA() == null) {
            return;
        }
        if(this.Lrd()) {
            return;
        }
        if(this.cRA().XX() == null && this.PjT(cRA.ReZ(this.ReZ.Zh), false, () -> {
            JQp zh$JQp0 = new JQp(7, ReZ.this.ReZ);
            zh$JQp0.cr = ReZ.this.ReZ.xH;
            ReZ.this.cRA().Zh(ReZ.this, zh$JQp0);
        })) {
            return;
        }
        this.Co();

        class com.bytedance.sdk.openadsdk.activity.ReZ.4 implements Runnable {
            final ReZ PjT;

            @Override
            public void run() {
                ReZ.this.Co();
            }
        }

    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.cr.Zh
    public void PjT(boolean z) {
        if(z) {
            this.ReZ();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.cr.Zh
    public boolean PjT(long v, boolean z) {
        return false;
    }

    private void RD() {
        if(this.ub) {
            return;
        }
        this.ub = true;
        if(cRA.XX(this.ReZ.Zh) || com.bytedance.sdk.openadsdk.RD.PjT.PjT("ivrv_new_arch_endcard_view_add_at_first", 0) == 1) {
            if(this.RD) {
                this.cRA().PjT(this.PjT(), this.Lrd());
            }
            else {
                this.cRA().PjT(this.PjT());
            }
        }
        this.Zh.PjT(this.xf);
    }

    public void ReZ() {
        this.Zh(0);
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.cz
    public void ReZ(Activity activity0) {
        super.ReZ(activity0);
        com.bytedance.sdk.openadsdk.component.reward.Zh.Zh zh0 = this.Zh;
        if(zh0 == null) {
            return;
        }
        zh0.RD();
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.cr.Zh
    public final void SM() {
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.cz
    public com.bytedance.sdk.openadsdk.component.reward.PjT.PjT Sks() {
        return this.ReZ;
    }

    private boolean ZX() {
        if(this.RD && !this.Lrd()) {
            try {
                String s = this.ReZ.JQp;
                com.bytedance.sdk.openadsdk.activity.ReZ.3 reZ$30 = new com.bytedance.sdk.openadsdk.qla.ReZ.PjT() {
                    final ReZ PjT;

                    @Override  // com.bytedance.sdk.openadsdk.qla.ReZ.PjT
                    public JSONObject PjT() {
                        JSONObject jSONObject0 = new JSONObject();
                        try {
                            jSONObject0.put("duration", ReZ.this.Sks);
                            jSONObject0.put("percent", ReZ.this.Lrd);
                            if(ReZ.this.tT != null) {
                                JSONObject jSONObject1 = new JSONObject();
                                jSONObject1.put("scene_type", ReZ.this.ReZ.PjT);
                                ReZ.this.tT.put("pag_json_data", jSONObject1.toString());
                                jSONObject0.put("ad_extra_data", ReZ.this.tT);
                            }
                        }
                        catch(Throwable unused_ex) {
                        }
                        return jSONObject0;
                    }
                };
                com.bytedance.sdk.openadsdk.cr.ReZ.PjT(System.currentTimeMillis(), this.Au, s, "skip", reZ$30);
            }
            catch(Throwable unused_ex) {
            }
            this.cRA().PjT(this, true, false, false, 4);
            return true;
        }
        return false;
    }

    public void Zh(int v) {
        if(!this.cRA().qj().getBoolean("reward_verify", false) && !this.cRA().qla() && !this.cRA().qj().getBoolean("user_has_give_up_reward", false)) {
            this.cRA().qj().putBoolean("reward_verify", true);
            if(ub.cr().xE(String.valueOf(this.ReZ.cz))) {
                this.PjT(true, this.ReZ.Zh.yIW(), this.ReZ.Zh.cRA(), 0, "", v);
                return;
            }
            JSONObject jSONObject0 = this.wN();
            ub.ReZ().PjT(jSONObject0, new com.bytedance.sdk.openadsdk.core.ltE.Zh() {
                final ReZ Zh;

                @Override  // com.bytedance.sdk.openadsdk.core.ltE$Zh
                public void PjT(int v, String s) {
                    ReZ.this.PjT(false, 0, "", v, s, v);
                }

                @Override  // com.bytedance.sdk.openadsdk.core.ltE$Zh
                public void PjT(com.bytedance.sdk.openadsdk.core.Owx.Zh owx$Zh0) {
                    ReZ.this.PjT(owx$Zh0.Zh, owx$Zh0.ReZ.PjT(), owx$Zh0.ReZ.Zh(), 0, "", v);
                }
            });
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.cz
    public final void Zh(Activity activity0) {
        super.Zh(activity0);
        if(this.ReZ != null) {
            com.bytedance.sdk.openadsdk.component.reward.Zh.Zh zh0 = this.Zh;
            if(zh0 != null) {
                zh0.ub();
                this.ReZ.dwk = true;
                this.ReZ.iZZ.Zh(this.PjT);
                if(this.Jo()) {
                    this.ReZ.wN.PjT(this.ReZ.Zh.jp());
                }
                this.ReZ.Zd.qla();
                this.ReZ.Jo.Sks();
                this.ReZ.cRA.xs();
                if(this.Zh.Zh()) {
                    this.ReZ.tT.PjT(this.Zh);
                    this.ReZ.tT.PjT(false, this, this.qla != 0);
                }
                ++this.qla;
                Au au0 = this.ReZ.yIW;
                if(au0 != null) {
                    au0.XX();
                }
                this.ReZ.iZZ.PjT(this.PjT);
                this.Zh.ltE();
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.cz
    public void Zh(boolean z) {
        long v = this.cRA ? this.ReZ.CY : 0L;
        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = this.ReZ;
        if(pjT0 != null) {
            qj qj0 = pjT0.Yo;
            if(qj0 != null) {
                qj0.Zh(z);
                this.ReZ.Yo.ReZ(z);
                if(z && v > 0L) {
                    this.ReZ.CY = v;
                }
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT1 = this.ReZ;
        if(pjT1 != null) {
            com.bytedance.sdk.openadsdk.component.reward.Zh.Zh zh0 = pjT1.wKV;
            if(zh0 instanceof com.bytedance.sdk.openadsdk.component.reward.Zh.cz) {
                ((com.bytedance.sdk.openadsdk.component.reward.Zh.cz)zh0).Zh(z);
            }
        }
        if(z) {
            this.cRA = false;
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.cz
    protected boolean a_() {
        return this.ReZ.cr;
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.cz
    public String b_() {
        return this.ReZ.JQp;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.cr.Zh
    public void c_() {
        this.Qf();
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.cr.Zh
    public final void cr() {
        this.Qf();
        this.ReZ.Zh.Xw();
        this.ReZ.Zh.PjT(true);
        if(Owx.JQp(this.ReZ.Zh)) {
            Owx owx0 = this.ReZ.Zh;
            com.bytedance.sdk.openadsdk.cr.ReZ.Zh(owx0, this.ReZ.JQp, owx0.Ebj());
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.cz
    public final void cr(Activity activity0) {
        super.cr(activity0);
        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = this.ReZ;
        if(pjT0 == null) {
            return;
        }
        pjT0.Jo.Jo();
        cr.PjT(activity0, this.ReZ.Zh);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.cr.Zh
    public final void cz() {
        this.KM();
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.cz, com.bytedance.sdk.openadsdk.core.xf.cr.Zh
    public void fDm() {
        int v = ub.cr().iZZ(String.valueOf(this.ReZ.cz)).cz;
        int v1 = this.ReZ.Zh.Gr();
        int v2 = 1;
        int v3 = 0;
        int v4 = (1.0f - this.ReZ.cRA.Zh() / ((float)v1)) * 100.0f >= ((float)v) ? 1 : 0;
        int v5 = ub.cr().PjT(String.valueOf(this.ReZ.cz));
        if(v5 == 0) {
            boolean z = this.ReZ.Jo.xf().cz();
            if(this.ReZ.cRA.ReZ()) {
                z = true;
            }
            if(v4 == 0 || !z) {
                v2 = 0;
            }
            v3 = v2;
        }
        else if(v5 == 1) {
            v3 = v4;
        }
        if(v3 != 0) {
            this.ReZ();
        }
    }

    private void gK() {
        if(this.gK) {
            return;
        }
        this.gK = true;
        if(this.RD && !this.Lrd()) {
            this.ReZ.dIF = this.cRA().SM();
        }
        this.ReZ.ig.PjT(this.Zh);
        this.Zh.PjT(this, this.PjT);
        this.Zh.qj();
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.cz
    public boolean ltE() {
        return this.ReZ != null && this.ReZ.tT.cRA();
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.cr.Zh
    public final void qj() {
        if(this.ReZ.fDm.getAndSet(true) && !cRA.gK(this.ReZ.Zh)) {
            return;
        }
        this.ReZ.Yo.PjT();
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.cz
    public void qla() {
        super.qla();
        com.bytedance.sdk.openadsdk.component.reward.Zh.Zh zh0 = this.Zh;
        if(zh0 == null) {
            return;
        }
        zh0.Sks();
    }

    private void tT() {
        View view0 = this.ReZ.Zd.DWo();
        if(view0 != null) {
            com.bytedance.sdk.openadsdk.activity.ReZ.1 reZ$10 = new View.OnClickListener() {
                final ReZ Zh;

                @Override  // android.view.View$OnClickListener
                public void onClick(View view0) {
                    boolean z1;
                    if(ReZ.this.ReZ.Jo.yIW()) {
                        boolean z = ReZ.this.ReZ.Co.xs();
                        ReZ.this.ReZ.Jo.cz(z);
                        ReZ.this.ReZ.Zd.JQp(8);
                        View view1 = view0;
                        if(view1 instanceof com.bytedance.sdk.openadsdk.core.JQp.cr) {
                            ((com.bytedance.sdk.openadsdk.core.JQp.cr)view1).setImageResource(Lrd.cr(ReZ.this.ReZ.IJ, "tt_close_btn"));
                        }
                        ReZ.this.ReZ.OMu.sendEmptyMessageDelayed(600, 5000L);
                        if(!Owx.ReZ(ReZ.this.ReZ.Zh) || Owx.ReZ(ReZ.this.ReZ.Zh) && z) {
                            return;
                        }
                    }
                    if(!ReZ.this.ReZ.Zh.wWn()) {
                    label_24:
                        z1 = false;
                    }
                    else if(ReZ.this.ReZ.Zh.uvo()) {
                        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = ReZ.this.ReZ;
                        if(pjT0.qZS == null) {
                            goto label_24;
                        }
                        else {
                            pjT0.Zh.ig(2);
                            z1 = ReZ.this.ReZ.qZS.JQp();
                        }
                    }
                    else {
                        if(ReZ.this.ReZ.Zh.cyr() == 0 && !ReZ.this.ReZ.Jo.ub()) {
                            ReZ.this.ReZ.Zh.ig(11);
                            if(ReZ.this.ReZ.Jo.cr()) {
                                ReZ.this.ReZ.Zh.ig(12);
                            }
                            try {
                                ReZ.this.ReZ.Zd.ub();
                                z1 = true;
                                goto label_25;
                            }
                            catch(Exception unused_ex) {
                            }
                        }
                        goto label_24;
                    }
                label_25:
                    if(z1) {
                        return;
                    }
                    ReZ.this.ReZ.Jo.iZZ();
                    ReZ.this.ReZ.Co.qj();
                    ReZ.this.ReZ.Yo.cz();
                    if(cRA.cr(ReZ.this.ReZ.Zh) && ReZ.this.PjT(true, true, null)) {
                        return;
                    }
                    ReZ.this.iZZ();
                }
            };
            view0.setOnClickListener(reZ$10);
            view0.setTag(view0.getId(), reZ$10);
        }
        this.ReZ.wN.PjT(new com.bytedance.sdk.openadsdk.component.reward.top.Zh() {
            final ReZ Zh;

            @Override  // com.bytedance.sdk.openadsdk.component.reward.top.Zh
            public void PjT(View view0) {
                boolean z = cRA.ReZ(ReZ.this.ReZ.Zh);
                if(ReZ.this.PjT(z, false, null)) {
                    return;
                }
                if(ReZ.this.ZX()) {
                    return;
                }
                if(cRA.JQp(ReZ.this.ReZ.Zh)) {
                    if(cRA.DWo(ReZ.this.ReZ.Zh)) {
                        ReZ.this.ReZ.cRA.ub();
                        return;
                    }
                    View view1 = view0;
                    if(view1 != null) {
                        view1.performClick();
                        return;
                    }
                    ReZ.this.iZZ();
                    return;
                }
                if(cRA.Au(ReZ.this.ReZ.Zh)) {
                    if(ReZ.this.ReZ.cRA.PjT()) {
                        ReZ.this.ReZ.cRA.PjT(5);
                        return;
                    }
                    ReZ.this.ReZ.Jo.Au();
                    return;
                }
                if(!cRA.gK(ReZ.this.ReZ.Zh) && (!gK.PjT(ReZ.this.ReZ.Zh) || ReZ.this.ReZ.xE.get())) {
                    ReZ.this.iZZ();
                    return;
                }
                if(!cRA.Au(ReZ.this.ReZ.Zh) && ReZ.this.ReZ.cRA.PjT()) {
                    ReZ.this.ReZ.cRA.PjT(4);
                }
                ReZ.this.iZZ();
            }

            @Override  // com.bytedance.sdk.openadsdk.component.reward.top.Zh
            public void PjT(View view0, String s) {
                com.bytedance.sdk.openadsdk.component.reward.Zh.Zh zh0 = ReZ.this.Zh;
                if(zh0 != null && zh0.cr() != null) {
                    ReZ.this.Zh.cr().PjT(ReZ.this.ReZ.xH);
                }
                ReZ.this.ReZ.xH = !ReZ.this.ReZ.xH;
                StringBuilder stringBuilder0 = new StringBuilder("will set is Mute ");
                stringBuilder0.append(ReZ.this.ReZ.xH);
                stringBuilder0.append(" mLastVolume=");
                stringBuilder0.append(ReZ.this.ReZ.ZX.PjT());
                ReZ.this.ReZ.tT.PjT(ReZ.this.ReZ.xH, s);
                if(cRA.ltE(ReZ.this.ReZ.Zh) && !ReZ.this.ReZ.DWo.get()) {
                    return;
                }
                ReZ.this.ReZ.Jo.JQp(ReZ.this.ReZ.xH);
                Owx owx0 = ReZ.this.ReZ.Zh;
                if(owx0 != null && owx0.QB() != null && ReZ.this.ReZ.Zh.QB().PjT() != null) {
                    com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = ReZ.this.ReZ;
                    if(pjT0.tT != null) {
                        if(pjT0.xH) {
                            pjT0.Zh.QB().PjT().Au(ReZ.this.ReZ.tT.XX());
                        }
                        else {
                            pjT0.Zh.QB().PjT().SM(ReZ.this.ReZ.tT.XX());
                        }
                    }
                }
                ReZ.this.ReZ.cRA.cz(ReZ.this.ReZ.xH);
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
                ReZ.this.ReZ.Qf.PjT(ReZ.this.Zh);
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.cz
    public void ub() {
        super.ub();
        com.bytedance.sdk.openadsdk.component.reward.Zh.Zh zh0 = this.Zh;
        if(zh0 != null) {
            zh0.tT();
        }
    }

    private JSONObject wN() {
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
            jSONObject0.put("media_extra", this.Owx);
            jSONObject0.put("video_duration", this.ReZ.Zh.MWx().C());
            jSONObject0.put("play_start_ts", 0);
            jSONObject0.put("play_end_ts", 0);
            jSONObject0.put("duration", v);
            jSONObject0.put("user_id", this.ltE);
            jSONObject0.put("trans_id", "047221d3e106409b90a529a9c2f171c4");
            return jSONObject0;
        }
        catch(Throwable throwable0) {
        }
        RD.PjT("TTAD.EndCardScene", "", throwable0);
        return null;
    }

    public void xE() {
        if(this.Lrd()) {
            return;
        }
        JQp zh$JQp0 = new JQp(8, this.ReZ);
        zh$JQp0.cr = this.ReZ.xH;
        if(this.cRA() != null) {
            this.cRA().PjT(this, zh$JQp0);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.cr.Zh
    public void xf() {
        this.ReZ();
    }
}

