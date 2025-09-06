package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.KM;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.component.reward.PjT.qj;
import com.bytedance.sdk.openadsdk.component.reward.PjT.ub;
import com.bytedance.sdk.openadsdk.component.reward.Zh.XX;
import com.bytedance.sdk.openadsdk.component.reward.view.Au;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.cRA;
import com.bytedance.sdk.openadsdk.core.xf.cr.Zh;
import com.bytedance.sdk.openadsdk.qla.ReZ;
import com.bytedance.sdk.openadsdk.utils.cr;
import com.bytedance.sdk.openadsdk.utils.fDm;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import t.b;

public abstract class PjT extends cz implements com.bytedance.sdk.component.utils.KM.PjT, com.bytedance.sdk.openadsdk.component.reward.PjT.JQp.PjT, Zh {
    private final AtomicBoolean JQp;
    protected final KM PjT;
    protected com.bytedance.sdk.openadsdk.component.reward.PjT.PjT ReZ;
    private Bundle XX;
    @Nullable
    protected com.bytedance.sdk.openadsdk.component.reward.Zh.Zh Zh;
    protected int cr;
    private int cz;
    private boolean fDm;
    private boolean qla;
    private int xs;

    public PjT(com.bytedance.sdk.openadsdk.activity.Zh zh0, Owx owx0, int v) {
        super(zh0, owx0, v);
        this.PjT = new KM(Looper.getMainLooper(), this);
        this.JQp = new AtomicBoolean(false);
        this.cz = 1;
        this.xs = 0;
        this.fDm = false;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.cr.Zh
    public final void Au() {
        com.bytedance.sdk.openadsdk.component.reward.Zh.Zh zh0 = this.Zh;
        if(zh0 == null) {
            return;
        }
        zh0.xs();
    }

    private void Co() {
        if(!this.Au.cr()) {
            return;
        }
        if(this.fDm) {
            return;
        }
        this.fDm = true;
        this.PjT().post(new Runnable() {
            final PjT PjT;

            @Override
            public void run() {
                PjT.this.ReZ.KM.PjT(PjT.this.ReZ.iZZ.PjT(PjT.this.cz), PjT.this, PjT.this.Zh);
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.cr.Zh
    public final View DWo() {
        return this.ReZ.tT.ZX();
    }

    protected final void JQp() {
        Message message0 = new Message();
        message0.what = 400;
        if(this.Au.Sky()) {
            this.PjT(10000);
        }
        this.PjT.sendMessageDelayed(message0, 2000L);
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

    private void PjT(com.bytedance.sdk.openadsdk.core.Zh.Zh zh0) {
        if(zh0 != null) {
            HashMap hashMap0 = new HashMap();
            try {
                if(this.ReZ.Nv && this.cRA() != null) {
                    this.cRA().PjT(this);
                }
                JSONObject jSONObject0 = new JSONObject();
                jSONObject0.put("ad_show_order", this.SM);
                hashMap0.put("pag_json_data", jSONObject0.toString());
            }
            catch(Throwable unused_ex) {
            }
            zh0.PjT(hashMap0);
        }
    }

    private void PjT(Owx owx0, Bundle bundle0) {
        Activity activity0 = this.yIW();
        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = new com.bytedance.sdk.openadsdk.component.reward.PjT.PjT(activity0, this.PjT, owx0, this, 1);
        this.ReZ = pjT0;
        pjT0.ix = this.cRA().Zh();
        this.ReZ.Nv = this.cRA().PjT();
        this.ReZ.dIF = this.cRA().SM();
        this.ReZ.hN = this;
        this.ReZ.ZX = this.cRA().ltE();
        Intent intent0 = activity0.getIntent();
        com.bytedance.sdk.openadsdk.component.reward.PjT.Zh.PjT(this.ReZ, intent0, bundle0);
        if(intent0 != null) {
            com.bytedance.sdk.openadsdk.component.reward.PjT.Zh.PjT(intent0, this.ReZ);
            owx0.PjT(intent0.getLongExtra("start_show_time", 0L));
        }
        if(bundle0 != null && this.ReZ.kFP) {
            this.Zh();
        }
        com.bytedance.sdk.openadsdk.component.reward.Zh.Zh zh0 = XX.PjT(this.ReZ);
        this.Zh = zh0;
        this.ReZ.wKV = zh0;
        this.ReZ.qZS.PjT(this);
        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT1 = this.ReZ;
        if(pjT1.ix) {
            com.bytedance.sdk.openadsdk.activity.PjT.1 pjT$10 = new com.bytedance.sdk.openadsdk.core.xf.cr.PjT.PjT() {
                final PjT PjT;

                @Override  // com.bytedance.sdk.openadsdk.core.xf.cr.PjT$PjT
                public void PjT(int v) {
                    com.bytedance.sdk.openadsdk.activity.Zh zh0 = PjT.this.cRA();
                    if(zh0 == null) {
                        return;
                    }
                    zh0.PjT(v);
                }
            };
            pjT1.tT.PjT(pjT$10);
            this.cRA().SM().setShowSound(Owx.JQp(owx0));
        }
        fDm.PjT(this.ReZ);
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.cz
    public final View PjT() {
        return this.ReZ.ig;
    }

    public void PjT(float f) {
        com.bytedance.sdk.openadsdk.activity.Zh zh0 = this.cRA();
        if(zh0 == null) {
            return;
        }
        zh0.PjT(f);
        if(!this.qla && f >= ((float)this.Au.cX()) / 100.0f) {
            this.qla = true;
            PjT pjT0 = zh0.XX();
            if(pjT0 != null) {
                pjT0.gK();
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.cr.Zh
    public void PjT(int v) {
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.cz
    public void PjT(Activity activity0) {
        super.PjT(activity0);
        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = this.ReZ;
        if(pjT0 == null) {
            return;
        }
        pjT0.iZZ.PjT();
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.cz
    public final void PjT(Activity activity0, Bundle bundle0) {
        this.XX = bundle0;
        super.PjT(activity0, bundle0);
        this.PjT(bundle0);
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.cz
    public void PjT(Activity activity0, JQp zh$JQp0) {
        super.PjT(activity0, zh$JQp0);
        this.cz = this.Au.jK();
        this.PjT(this.Au, this.XX);
        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = this.ReZ;
        if(pjT0.ix && this.SM > 0) {
            pjT0.xH = zh$JQp0.cr;
        }
        try {
            this.tT();
        }
        catch(Throwable throwable0) {
            RD.PjT("TTAD.AdScene", "onCreate: ", throwable0);
            ReZ.Zh();
            this.iZZ();
            return;
        }
        this.ZX();
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.cr.Zh
    public abstract void PjT(Bundle arg1);

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
        if(cz0 == this && cz1 instanceof com.bytedance.sdk.openadsdk.activity.ReZ) {
            int v = zh$JQp0.Zh;
            if(v == 3) {
                ub ub0 = this.ReZ.tT;
                ub0.PjT(!ub0.Yo(), 2);
            }
            else {
                switch(v) {
                    case 5: {
                        if(!Owx.JQp(this.ReZ.Zh) && zh$JQp0.JQp) {
                            this.ReZ.tT.PjT("skip", true);
                        }
                        break;
                    }
                    case 6: {
                        ub ub1 = this.ReZ.tT;
                        ub1.PjT(!ub1.Yo(), !this.ReZ.tT.Yo());
                    }
                }
            }
            this.ReZ.wN.PjT(false);
            this.ReZ.wN.cr(false);
        }
        if(cz1.SM == 0 && this.SM != 0) {
            if(!TextUtils.isEmpty(this.Au.Co())) {
                this.Au.SM("0");
            }
            Map map0 = this.Au.Vs();
            if(map0 != null && map0.containsKey("price")) {
                map0.put("price", "0");
            }
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
        this.cRA().Zh(this, this.Zh(7));
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.cr.Zh
    public void PjT(boolean z) {
    }

    public final void PjT(boolean z, int v) {
        this.PjT(z, false, v);
    }

    public final void PjT(boolean z, boolean z1, int v) {
        this.ReZ.qZS.PjT(z, z1, false, this.ReZ.wKV, v);
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.PjT.JQp$PjT
    public void PjT(boolean z, boolean z1, boolean z2, com.bytedance.sdk.openadsdk.component.reward.Zh.Zh zh0, int v) {
        this.PjT(z, z1, z2, v);
    }

    public void RD() {
        this.cRA().PjT(this, this.Zh(com.bytedance.sdk.openadsdk.cr.Zh.Zh.Zh));
    }

    protected abstract void ReZ();

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
        this.ReZ.tT.Qf();
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.cz
    public com.bytedance.sdk.openadsdk.component.reward.PjT.PjT Sks() {
        return this.ReZ;
    }

    protected abstract void XX();

    private void ZX() {
        this.Zh.PjT(this.xf);
        this.cr = (int)this.ReZ.tT.KM();
        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = this.ReZ;
        if(pjT0.ix) {
            this.PjT(pjT0.Yo.JQp());
            this.PjT(this.ReZ.Yo.cr());
        }
        this.ReZ();
        this.wN();
        if(this.ReZ.Zh.QB() != null && this.ReZ.Zh.QB().PjT() != null) {
            this.ReZ.Zh.QB().PjT().PjT(0L);
        }
    }

    protected JQp Zh(int v) {
        JQp zh$JQp0 = new JQp(v, this.ReZ);
        zh$JQp0.cr = this.ReZ.xH;
        return zh$JQp0;
    }

    protected abstract void Zh();

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
                    this.ReZ.tT.PjT(false, this, this.xs != 0);
                }
                ++this.xs;
                this.Co();
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
        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = this.ReZ;
        if(pjT0 != null) {
            qj qj0 = pjT0.Yo;
            if(qj0 != null) {
                qj0.Zh(z);
                this.ReZ.Yo.ReZ(z);
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT1 = this.ReZ;
        if(pjT1 != null) {
            com.bytedance.sdk.openadsdk.component.reward.Zh.Zh zh0 = pjT1.wKV;
            if(zh0 instanceof com.bytedance.sdk.openadsdk.component.reward.Zh.cz) {
                ((com.bytedance.sdk.openadsdk.component.reward.Zh.cz)zh0).Zh(z);
            }
        }
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
        if(!this.JQp.compareAndSet(false, true)) {
            return;
        }
        RD.PjT("BVA", "invoke callback onShow, " + this);
        this.XX();
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.cz, com.bytedance.sdk.openadsdk.core.xf.cr.Zh
    public void fDm() {
    }

    public void gK() {
        com.bytedance.sdk.openadsdk.core.xf.PjT.Zh zh0 = Owx.PjT(CacheDirFactory.getICacheDir(this.Au.hx()).PjT(), this.Au);
        zh0.PjT("material_meta", this.Au);
        zh0.PjT("ad_slot", this.Au.ig());
        com.bytedance.sdk.openadsdk.core.xf.JQp.PjT.PjT(zh0, new b() {
            final PjT PjT;

            @Override  // t.a$a
            public void PjT(v.b b0, int v) {
            }

            @Override  // t.a$a
            public void PjT(v.b b0, int v, String s) {
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.cz
    public boolean ltE() {
        return this.ReZ != null && this.ReZ.tT.cRA();
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.cr.Zh
    public final void qj() {
        if(this.ReZ.fDm.getAndSet(true) && !cRA.ReZ(this.ReZ.Zh)) {
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
        this.ReZ.ig.PjT(this.Zh);
        this.Zh.PjT(this, this.PjT);
        this.Zh.qj();
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.cz
    public void ub() {
        super.ub();
        com.bytedance.sdk.openadsdk.component.reward.Zh.Zh zh0 = this.Zh;
        if(zh0 != null) {
            zh0.tT();
        }
    }

    private void wN() {
        if(!this.Au.cr()) {
            if(cRA.gK(this.ReZ.Zh)) {
                this.PjT(false, com.bytedance.sdk.openadsdk.cr.Zh.Zh.ReZ);
                return;
            }
            com.bytedance.sdk.openadsdk.component.reward.Zh.Zh zh0 = this.Zh;
            if(zh0 != null) {
                zh0.PjT(this.ReZ.Zd.cz());
                this.Zh.yIW();
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.PjT.JQp$PjT
    public void xE() {
        com.bytedance.sdk.openadsdk.activity.Zh zh0 = this.cRA();
        if(zh0 != null) {
            com.bytedance.sdk.openadsdk.activity.ReZ reZ0 = zh0.cz();
            if(reZ0 != null) {
                reZ0.JQp();
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.cr.Zh
    public void xf() {
    }

    protected final void xs() {
        this.PjT.removeMessages(400);
    }
}

