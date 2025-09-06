package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.component.reward.PjT.PjT;
import com.bytedance.sdk.openadsdk.core.Au.SM;
import com.bytedance.sdk.openadsdk.core.Au.fDm;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.gK;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.ltE.PjT.PjT.XX;
import com.bytedance.sdk.openadsdk.ltE.PjT.PjT.cz;
import com.bytedance.sdk.openadsdk.utils.qZS;
import org.json.JSONObject;

public class Au {
    private final String Au;
    private final PjT DWo;
    boolean JQp;
    cz PjT;
    boolean ReZ;
    private Zh SM;
    private final Owx XX;
    Handler Zh;
    boolean cr;
    private final Activity cz;
    private boolean qj;

    public Au(PjT pjT0) {
        this.ReZ = false;
        this.cr = false;
        this.JQp = false;
        this.DWo = pjT0;
        this.cz = pjT0.rds;
        this.XX = pjT0.Zh;
        this.Au = pjT0.JQp;
    }

    public boolean Au() {
        return this.SM == null ? false : this.SM.xs();
    }

    public void DWo() {
        Zh zh0 = this.SM;
        if(zh0 == null) {
            return;
        }
        zh0.Au();
    }

    public Handler JQp() {
        if(this.Zh == null) {
            this.Zh = new Handler(Looper.getMainLooper());
        }
        return this.Zh;
    }

    private cz PjT(Owx owx0) {
        return owx0.cI() == 4 ? XX.PjT(this.cz, owx0, this.Au) : null;
    }

    public Zh PjT() {
        return this.SM;
    }

    public JSONObject PjT(JSONObject jSONObject0) {
        return this.SM == null ? null : this.SM.PjT(jSONObject0, this.DWo.Zh);
    }

    public void PjT(int v, String s) {
        Zh zh0 = this.SM;
        if(zh0 != null) {
            zh0.Zh(v, s);
        }
    }

    public void PjT(int v, boolean z) {
        Zh zh0 = this.SM;
        if(zh0 != null) {
            zh0.PjT(v, z, false);
        }
    }

    public void PjT(AdSlot adSlot0, gK gK0) {
        if(this.JQp) {
            return;
        }
        this.JQp = true;
        Zh zh0 = new Zh(this.DWo, adSlot0, this.Au);
        this.SM = zh0;
        gK0.PjT(zh0, zh0.getVideoFrameLayout());
    }

    public void PjT(PAGExpressAdWrapperListener pAGExpressAdWrapperListener0) {
        Zh zh0 = this.SM;
        if(zh0 == null) {
            return;
        }
        zh0.setExpressInteractionListener(pAGExpressAdWrapperListener0);
    }

    public void PjT(SM sM0, com.bytedance.sdk.openadsdk.core.Au.Au au0) {
        if(this.SM != null) {
            Owx owx0 = this.XX;
            if(owx0 != null) {
                this.PjT = this.PjT(owx0);
                sM0.PjT(this.SM);
                sM0.PjT(this.PjT);
                this.SM.setClickListener(sM0);
                au0.PjT(this.SM);
                au0.PjT(this.PjT);
                this.SM.setClickCreativeListener(au0);
            }
        }
    }

    public void PjT(fDm fDm0) {
        Zh zh0 = this.SM;
        if(zh0 == null) {
            return;
        }
        zh0.setExpressVideoListenerProxy(fDm0);
    }

    public void PjT(boolean z) {
        this.ReZ = z;
    }

    public boolean ReZ() {
        return this.ReZ;
    }

    public int SM() {
        return this.SM == null ? 0 : this.SM.getDynamicShowType();
    }

    public void XX() {
        Zh zh0 = this.SM;
        if(zh0 != null) {
            zh0.DWo();
        }
    }

    public FrameLayout Zh() {
        Zh zh0 = this.SM;
        if(zh0 != null) {
            FrameLayout frameLayout0 = zh0.getVideoFrameLayout();
            if(this.SM.xs()) {
                this.xf();
            }
            return frameLayout0;
        }
        return null;
    }

    public void Zh(boolean z) {
        this.cr = z;
    }

    public boolean cr() {
        return this.cr;
    }

    public void cz() {
        if(this.qj) {
            return;
        }
        this.qj = true;
        Zh zh0 = this.SM;
        if(zh0 != null) {
            zh0.qj();
        }
        Handler handler0 = this.Zh;
        if(handler0 != null) {
            handler0.removeCallbacksAndMessages(null);
        }
    }

    public void qj() {
        Zh zh0 = this.SM;
        if(zh0 == null) {
            return;
        }
        zh0.SM();
        this.SM.DWo();
    }

    public void xf() {
        if(Owx.JQp(this.XX) && this.XX.wN() == 3 && this.XX.qZS() == 0) {
            try {
                if(this.XX.jK() == 1) {
                    int v = qZS.Zh(ub.PjT(), 90.0f);
                    FrameLayout frameLayout0 = (FrameLayout)this.SM.getBackupContainerBackgroundView();
                    if(frameLayout0 != null) {
                        FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)frameLayout0.getLayoutParams();
                        frameLayout$LayoutParams0.bottomMargin = v;
                        frameLayout0.setLayoutParams(frameLayout$LayoutParams0);
                    }
                }
            }
            catch(Throwable unused_ex) {
            }
        }
    }
}

