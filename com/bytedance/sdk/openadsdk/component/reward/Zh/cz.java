package com.bytedance.sdk.openadsdk.component.reward.Zh;

import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.Zh.fDm;
import com.bytedance.sdk.openadsdk.component.reward.PjT.PjT;
import com.bytedance.sdk.openadsdk.component.reward.view.XX;
import com.bytedance.sdk.openadsdk.core.KM;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.RD;
import com.bytedance.sdk.openadsdk.cr.ReZ;
import com.bytedance.sdk.openadsdk.utils.Jo;
import com.bytedance.sdk.openadsdk.xf.Au;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class cz extends Zh implements Au {
    private final RD qla;
    private boolean xE;

    public cz(PjT pjT0) {
        super(pjT0);
        this.qla = (RD)pjT0.Zh;
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.Zh.Zh
    public boolean JQp() {
        return true;
    }

    public static void PjT(Owx owx0, boolean z, String s) {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("is_backup", Boolean.valueOf(z));
        ReZ.PjT("choose_ad_start_show", owx0, s, hashMap0);
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("req_id", owx0.ydj());
            jSONObject0.put("is_backup", z);
        }
        catch(JSONException unused_ex) {
        }
        com.bytedance.sdk.openadsdk.qla.ReZ.PjT().PjT("choose_ad_start_show", jSONObject0);
    }

    @Override  // com.bytedance.sdk.openadsdk.xf.Au
    public void PjT(int v, long v1) {
        this.xE = true;
        this.qla.cI(v - 1);
        ReZ.PjT(this.qla, this.PjT.JQp, v, v1);
        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT(this.qla.MD(), v - 1, this.PjT.cr);
        Jo.PjT(new Runnable() {
            final cz PjT;

            @Override
            public void run() {
                cz.this.yIW();
                cz cz0 = cz.this;
                PjT pjT0 = cz0.PjT;
                if(pjT0.VY) {
                    cz0.iZZ();
                    cz.this.PjT.qZS.Zh();
                    return;
                }
                com.bytedance.sdk.openadsdk.component.reward.PjT.JQp.PjT jQp$PjT0 = pjT0.qZS.cz();
                if(jQp$PjT0 != null) {
                    jQp$PjT0.xE();
                }
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.Zh.Zh
    public void PjT(FrameLayout frameLayout0) {
    }

    @Override  // com.bytedance.sdk.openadsdk.xf.XX
    public void PjT(fDm fDm0) {
        this.PjT.yIW.PjT().Zh(fDm0);
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.Zh.Zh
    public void PjT(XX xX0) {
        if(cr.PjT(this.qla)) {
            cr.PjT(this.qla, xX0, this.PjT);
            return;
        }
        super.PjT(xX0);
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.Zh.Zh
    public void XX() {
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.Zh.Zh
    protected boolean Yo() {
        return false;
    }

    public void Zh(boolean z) {
        if(!this.xE) {
            HashMap hashMap0 = new HashMap();
            hashMap0.put("has_focus", Boolean.valueOf(z));
            ReZ.PjT("choose_ad_focus_changed", this.qla, this.PjT.JQp, hashMap0);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.Zh.PjT
    public boolean Zh() {
        return this.xE;
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.Zh.Zh
    public boolean cz() {
        return true;
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.Zh.Zh
    public void yIW() {
        if(this.PjT.rds.isFinishing()) {
            return;
        }
        if(this.PjT.yIW.Au() || this.xE) {
            super.yIW();
            if(this.PjT.yIW.Au()) {
                this.iZZ();
                this.PjT.qZS.Zh();
            }
        }
        else {
            com.bytedance.sdk.openadsdk.component.reward.view.Zh zh0 = this.PjT.yIW.PjT();
            if(zh0 != null) {
                KM kM0 = zh0.getJsObject();
                if(kM0 != null) {
                    kM0.PjT(this);
                }
            }
        }
    }
}

