package com.bytedance.sdk.openadsdk.core.DWo.JQp;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.core.Au;
import com.bytedance.sdk.component.adexpress.cr.cz;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.core.DWo.Zh.Zh;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.Yo;
import com.bytedance.sdk.openadsdk.core.model.fDm;
import com.bytedance.sdk.openadsdk.utils.qZS;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.json.JSONObject;

public class JQp extends ReZ {
    private com.bytedance.adsdk.ugeno.Zh.ReZ cRA;
    private boolean iZZ;
    private com.bytedance.adsdk.ugeno.Zh.ReZ yIW;

    public JQp(Context context0, Owx owx0, boolean z, PjT pjT0, ViewGroup viewGroup0) {
        super(context0, owx0, z, pjT0, viewGroup0);
        this.iZZ = false;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.DWo.JQp.ReZ
    protected com.bytedance.adsdk.ugeno.Zh.ReZ Au() {
        return null;
    }

    private void DWo() {
        Au au0 = new Au();
        HashMap hashMap0 = new HashMap();
        hashMap0.put("image_info", this.cz.qj());
        hashMap0.put("cache_dir", this.cz.fDm());
        au0.PjT(hashMap0);
        au0.PjT(this.Zh);
        au0.PjT(this.cr);
        au0.Zh(this.Lrd);
        this.PjT.PjT("ad", au0);
    }

    private void PjT(CharSequence charSequence0, boolean z, int v, boolean z1) {
        int v1;
        try {
            com.bytedance.adsdk.ugeno.Zh.ReZ reZ0 = this.cRA;
            if(reZ0 == null) {
                return;
            }
            if(!(reZ0 instanceof Zh)) {
                return;
            }
            v1 = Integer.parseInt(((String)charSequence0));
        }
        catch(Exception unused_ex) {
            RD.Zh("UGenRender", new Object[]{"parse duration exception", charSequence0});
            v1 = 0;
        }
        if(!z1 && v1 > 0 && !this.iZZ) {
            this.cRA.ReZ(0);
            if(!z && this.cz.PjT() && cz.Zh(this.cz.cr())) {
                ((Zh)this.cRA).XX(String.valueOf(v));
                return;
            }
            if(!"open_ad".equals(this.cz.cr()) && this.cz.PjT()) {
                this.iZZ = true;
                this.cRA.ReZ(8);
                return;
            }
            ((Zh)this.cRA).XX(String.valueOf(charSequence0));
            return;
        }
        this.cRA.ReZ(8);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.DWo.JQp.ReZ
    protected JSONObject PjT() {
        JSONObject jSONObject0 = this.cz.ReZ();
        return jSONObject0 == null ? null : jSONObject0.optJSONObject("xTemplate");
    }

    @Override  // com.bytedance.sdk.openadsdk.core.DWo.JQp.ReZ
    public void PjT(com.bytedance.adsdk.ugeno.Zh.ReZ reZ0, String s, com.bytedance.adsdk.ugeno.cr.cz.PjT cz$PjT0) {
        int v = 6;
        boolean z = true;
        if(this.Au == null) {
            return;
        }
        if(cz$PjT0 == null) {
            return;
        }
        String s1 = cz$PjT0.Zh();
        s1.hashCode();
        switch(s1) {
            case "convert": {
                v = 2;
                break;
            }
            case "dislike": {
                v = 3;
                break;
            }
            case "muteVideo": {
                v = 5;
                break;
            }
            case "openPrivacy": {
                v = 7;
                break;
            }
            case "pauseVideo": {
                v = 4;
                break;
            }
            case "skip": {
                break;
            }
            case "videoControl": {
                v = 4;
                break;
            }
            default: {
                v = 0;
            }
        }
        int[] arr_v = new int[2];
        int[] arr_v1 = new int[2];
        WeakReference weakReference0 = this.RD;
        if(weakReference0 != null) {
            int[] arr_v2 = qZS.PjT(((View)weakReference0.get()));
            if(arr_v2 != null) {
                arr_v = arr_v2;
            }
            int[] arr_v3 = qZS.ReZ(((View)this.RD.get()));
            if(arr_v3 != null) {
                arr_v1 = arr_v3;
            }
        }
        com.bytedance.sdk.openadsdk.core.model.fDm.PjT fDm$PjT0 = new com.bytedance.sdk.openadsdk.core.model.fDm.PjT().cr(this.xs).ReZ(this.fDm).Zh(this.qla).PjT(this.xE).Zh(this.ub).PjT(this.gK).ReZ(arr_v[0]).cr(arr_v[1]).JQp(arr_v1[0]).cz(arr_v1[1]).PjT(this.tT);
        if(s.equals("tap") && !this.ltE) {
            z = false;
        }
        fDm fDm0 = fDm$PjT0.PjT(z).PjT(reZ0.Co()).Zh(false).PjT();
        this.Au.PjT(reZ0.qj(), v, fDm0);
    }

    private void SM() {
        com.bytedance.adsdk.ugeno.Zh.ReZ reZ0 = this.cRA;
        if(reZ0 != null) {
            reZ0.ReZ(8);
        }
        com.bytedance.adsdk.ugeno.Zh.ReZ reZ1 = this.yIW;
        if(reZ1 != null) {
            reZ1.ReZ(8);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.DWo.JQp.ReZ
    protected com.bytedance.adsdk.ugeno.Zh.ReZ XX() {
        return this.ReZ == null ? null : this.ReZ.cr("VideoV3");
    }

    private void Zh(CharSequence charSequence0, boolean z, int v, boolean z1) {
        int v1 = 0;
        com.bytedance.adsdk.ugeno.Zh.ReZ reZ0 = this.yIW;
        if(reZ0 == null) {
            return;
        }
        if(!(reZ0 instanceof com.bytedance.sdk.openadsdk.core.DWo.Zh.cz)) {
            return;
        }
        if(!z && !z1) {
            v1 = 8;
        }
        reZ0.ReZ(v1);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.DWo.JQp.ReZ
    protected JSONObject Zh() {
        return this.cz.ReZ();
    }

    @Override  // com.bytedance.sdk.openadsdk.core.DWo.JQp.ReZ
    protected int cr() {
        this.DWo();
        this.PjT.PjT(this);
        this.PjT.PjT(this);
        Yo yo0 = this.JQp.xH();
        try {
            this.ReZ = yo0 == null ? this.PjT.PjT(this.cr, this.Lrd, null) : this.PjT.PjT(this.cr, this.Lrd, yo0.JQp());
            if(this.ReZ != null) {
                if(TextUtils.equals(this.Sks, "rewarded_video")) {
                    this.cRA = this.ReZ.cr("RVCountdown");
                    this.yIW = this.ReZ.cr("RVSkipView");
                }
                else {
                    this.cRA = this.ReZ.cr("FVCountdown");
                    this.yIW = this.ReZ.cr("FVSkipView");
                }
                this.SM();
            }
            this.cz.ZX().Zh();
            this.cz.ZX().ReZ();
            return 0;
        }
        catch(UnsatisfiedLinkError unused_ex) {
            return 0x8B;
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.DWo.JQp.ReZ
    public void setSoundMute(boolean z) {
    }

    @Override  // com.bytedance.sdk.openadsdk.core.DWo.JQp.ReZ
    public void setTime(CharSequence charSequence0, int v, int v1, boolean z) {
        boolean z1 = true;
        if(this.ReZ == null) {
            return;
        }
        if(v != 1) {
            z1 = false;
        }
        this.PjT(charSequence0, z1, v1, z);
        this.Zh(charSequence0, z1, v1, z);
    }
}

