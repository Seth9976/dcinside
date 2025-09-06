package com.bytedance.sdk.openadsdk.core.Zh;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.Au.ltE;
import com.bytedance.sdk.openadsdk.core.ZX;
import com.bytedance.sdk.openadsdk.core.model.DWo;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.XX;
import com.bytedance.sdk.openadsdk.core.model.cRA;
import com.bytedance.sdk.openadsdk.core.model.fDm;
import com.bytedance.sdk.openadsdk.core.model.gK;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.cr.ReZ;
import com.bytedance.sdk.openadsdk.ltE.PjT.PjT.cr;
import com.bytedance.sdk.openadsdk.ltE.PjT.PjT.cz;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.qla;
import com.bytedance.sdk.openadsdk.utils.wN;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class PjT extends Zh {
    public interface com.bytedance.sdk.openadsdk.core.Zh.PjT.PjT {
        long getVideoProgress();
    }

    private boolean PjT;
    private boolean ReZ;
    private int Zd;
    private boolean Zh;
    private boolean qZS;
    private WeakReference wN;

    public PjT(@NonNull Context context0, @NonNull Owx owx0, @NonNull String s, int v) {
        super(context0, owx0, s, v);
        this.PjT = true;
        this.Zh = false;
        this.ReZ = false;
        this.qZS = false;
    }

    private boolean Au() {
        return Owx.JQp(this.cz) && this.cz.Qf() == 1;
    }

    private boolean DWo() {
        if(this.cz == null) {
            return false;
        }
        switch(this.cz.fK()) {
            case 5: 
            case 15: {
                if(this.Zd == 0) {
                    this.Zd = this.cz.XWz();
                }
                this.Zh();
                this.PjT();
                this.ReZ();
                return this.Zd != 5 || !this.Au() || !this.PjT() || this.Zh() || this.ReZ() ? this.Zd == 1 || (this.Zd == 2 || this.Zd == 5) : false;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Zh.Zh
    public void PjT(View view0, float f, float f1, float f2, float f3, SparseArray sparseArray0, boolean z) {
        boolean z2;
        JSONObject jSONObject2;
        JSONObject jSONObject1;
        boolean z1;
        int v3;
        String s;
        if(this.PjT(view0, 2, f, f1, f2, f3, sparseArray0, z)) {
            return;
        }
        this.cz.JQp(true);
        this.cz.Xw();
        if(!this.cz.SM()) {
            this.cz.PjT(true);
        }
        if(Owx.JQp(this.cz)) {
            long v = this.cz.Ebj();
            ReZ.Zh(this.cz, this.XX, v);
        }
        if(this.fDm != null) {
            if(this.ub == null) {
                this.ub = new HashMap();
            }
            this.ub.put("duration", this.fDm.JQp());
        }
        int v1 = this.cz.KLT();
        this.cz.ig(0);
        cz cz0 = this.xE;
        if(cz0 != null) {
            cz0.PjT((v1 <= 0 ? 0 : v1));
        }
        Map map0 = this.ub;
        if(map0 != null) {
            map0.remove("dsp_click_type");
            this.ub.remove("click_probability_jump");
            this.ub.remove("auto_click");
        }
        if(v1 > 0) {
            if(this.ub == null) {
                this.ub = new HashMap();
            }
            if(this.cz.uvo() && v1 < 11) {
                this.ub.put("dsp_click_type", v1);
            }
            if(v1 >= 11 && this.cz.cyr() == 0) {
                this.ub.put("click_probability_jump", XX.PjT(v1));
            }
        }
        if(this.cz.uvo()) {
            if(view0 == null) {
                s = "VAST_ACTION_BUTTON";
            }
            else {
                Object object0 = view0.getTag(0x22000001);
                s = object0 instanceof String ? ((String)object0) : "VAST_ACTION_BUTTON";
            }
            this.cz.QB().JQp(s);
            if(!TextUtils.isEmpty(s)) {
                this.PjT(s);
            }
            long v2 = this.wN == null || this.wN.get() == null ? 0L : ((com.bytedance.sdk.openadsdk.core.Zh.PjT.PjT)this.wN.get()).getVideoProgress();
            if(!"VAST_ICON".equals(s)) {
                if(!"VAST_END_CARD".equals(s)) {
                    this.cz.QB().PjT().XX(v2);
                }
                else if(this.cz.QB().ReZ() != null) {
                    this.cz.QB().ReZ().PjT(v2);
                }
            }
            else if(this.cz.QB().Zh() != null) {
                this.cz.QB().Zh().PjT(v2);
            }
        }
        if(this.DWo() && this.cr(view0) && !this.ReZ) {
            super.PjT(view0, f, f1, f2, f3, sparseArray0, z);
            return;
        }
        if(this.cr == null) {
            this.cr = ub.PjT();
        }
        if(this.cr == null) {
            return;
        }
        if(!this.PjT(view0, z)) {
            return;
        }
        JSONObject jSONObject0 = ltE.PjT(view0);
        fDm fDm0 = this.JQp;
        Activity activity0 = null;
        if(fDm0 == null) {
            jSONObject1 = jSONObject0;
            jSONObject2 = null;
            v3 = -1;
            z1 = false;
        }
        else {
            v3 = fDm0.xf;
            z1 = fDm0.gK;
            jSONObject1 = fDm0.xs;
            jSONObject2 = fDm0.ub;
        }
        DWo dWo0 = this.PjT(f, f1, f2, f3, sparseArray0, this.cRA, this.yIW, (this.SM == null ? this.cr() : ((View)this.SM.get())), (this.DWo == null ? this.JQp() : ((View)this.DWo.get())), this.cz(), qZS.XX(this.cr), qZS.SM(this.cr), qZS.Au(this.cr), v3, jSONObject1, jSONObject2);
        this.qj = dWo0;
        int v4 = 2;
        if(z1) {
            Owx owx0 = this.cz;
            String s1 = this.XX;
            Map map1 = this.ub;
            if(z) {
                v4 = 1;
            }
            ReZ.PjT("click", owx0, dWo0, s1, true, map1, v4);
            return;
        }
        int v5 = this.cz.cI();
        switch(v5) {
            case 4: {
                if(!cRA.Zh(this.cz) || this.xs == null && this.gK == null) {
                    cz cz1 = this.xE;
                    if(cz1 != null) {
                        cz1.cr();
                        Map map2 = this.ub;
                        if(this.cz.SM() && !this.cz.Au()) {
                            map2.put("auto_click", Boolean.TRUE);
                            this.cz.Zh(false);
                        }
                        if(this.PjT) {
                            ReZ.PjT("click", this.cz, this.qj, this.XX, true, map2, (z ? 1 : 2));
                        }
                    }
                }
                else {
                    if(view0 != null) {
                        activity0 = com.bytedance.sdk.component.utils.Zh.PjT(view0);
                    }
                    Context context1 = activity0 == null ? this.cr : activity0;
                    boolean z4 = ZX.PjT(context1, this.cz, this.Au, this.xs, this.gK, this.XX, this.xE, true, v1);
                    if(this.PjT) {
                        ReZ.PjT("click", this.cz, this.qj, this.XX, z4, this.ub, (z ? 1 : 2));
                    }
                }
                break;
            }
            case 5: {
                String s3 = this.Zh(this.XX);
                if(!TextUtils.isEmpty(s3)) {
                    ReZ.PjT("click_call", this.cz, this.qj, s3, true, this.ub, (z ? 1 : 2));
                }
                boolean z5 = wN.Zh(view0.getContext(), this.cz.fA());
                ReZ.PjT("click", this.cz, this.qj, this.XX, z5, this.ub, (z ? 1 : 2));
                break;
            }
            case 2: 
            case 3: 
            case 8: {
                if(v5 == 3) {
                    String s2 = this.cz.xu();
                    if(TextUtils.isEmpty(s2) || !s2.contains("play.google.com/store") || !cr.PjT(this.cr, s2, s2.substring(s2.indexOf("?id=") + 4), this.XX, this.cz)) {
                        goto label_95;
                    }
                    else if(this.PjT) {
                        ReZ.PjT("click", this.cz, this.qj, this.XX, true, this.ub, (z ? 1 : 2));
                    }
                }
                else {
                label_95:
                    if(this.xs != null || this.Zh) {
                        ReZ.PjT("click_button", this.cz, this.qj, this.XX, true, this.ub, (z ? 1 : 2));
                    }
                    try {
                        if(view0 != null && (view0.getId() == 0x1F00001E || view0 instanceof com.bytedance.sdk.openadsdk.core.xf.Zh.cz)) {
                            ZX.PjT(true);
                        }
                        else if(((Boolean)view0.getTag(0x1F000042)).booleanValue()) {
                            ZX.PjT(true);
                        }
                    }
                    catch(Exception unused_ex) {
                    }
                    if(view0 != null) {
                        activity0 = com.bytedance.sdk.component.utils.Zh.PjT(view0);
                    }
                    Context context0 = activity0 == null ? this.cr : activity0;
                    if(!gK.ReZ(this.cz) || !this.qZS) {
                        boolean z3 = ZX.PjT(context0, this.cz, this.Au, this.xs, this.gK, this.XX, this.xE, true, v1);
                        ZX.PjT(false);
                        z2 = z3;
                    }
                    else {
                        z2 = false;
                    }
                    if(this.PjT) {
                        ReZ.PjT("click", this.cz, this.qj, this.XX, z2, this.ub, (z ? 1 : 2));
                    }
                }
                break;
            }
            default: {
                v5 = -1;
            }
        }
        com.bytedance.sdk.openadsdk.core.Zh.Zh.PjT zh$PjT0 = this.xf;
        if(zh$PjT0 != null) {
            zh$PjT0.PjT(view0, v5);
        }
    }

    public void PjT(com.bytedance.sdk.openadsdk.core.Zh.PjT.PjT pjT$PjT0) {
        this.wN = new WeakReference(pjT$PjT0);
    }

    public void PjT(boolean z) {
        this.PjT = z;
    }

    protected boolean PjT() {
        Owx owx0 = this.cz;
        if(owx0 == null) {
            return true;
        }
        int v = owx0.joj();
        int v1 = ub.cr().Zh(v);
        int v2 = com.bytedance.sdk.component.utils.ltE.ReZ(ub.PjT());
        switch(v1) {
            case 1: {
                return wN.cr(v2);
            }
            case 2: {
                return wN.JQp(v2) || wN.cr(v2) || wN.cz(v2);
            }
            case 3: {
                return false;
            }
            case 5: {
                return wN.cr(v2) || wN.cz(v2);
            }
            default: {
                return true;
            }
        }
    }

    public void ReZ(boolean z) {
        this.ReZ = z;
    }

    public boolean ReZ() {
        return false;
    }

    private boolean SM() [...] // 潜在的解密器

    private String Zh(String s) {
        s.hashCode();
        switch(s) {
            case "banner_ad": {
                return "banner_call";
            }
            case "embeded_ad": {
                return "feed_call";
            }
            case "interaction": {
                return "interaction_call";
            }
            case "open_ad": {
                return "open_ad";
            }
            case "slide_banner_ad": {
                return "banner_call";
            }
            default: {
                return "";
            }
        }
    }

    public void Zh(boolean z) {
        this.Zh = z;
    }

    public boolean Zh() {
        return false;
    }

    private boolean cr(View view0) {
        if(view0 == null) {
            return false;
        }
        if(view0 instanceof com.bytedance.sdk.openadsdk.core.xf.Zh.cz) {
            return true;
        }
        if(view0.getId() != qla.Lx && view0.getId() != qla.kph && view0.getId() != qla.IJ && view0.getId() != qla.OMu && view0.getId() != qla.VY && view0.getId() != 0x1F00001E && view0.getId() != qla.dG) {
            if(view0 instanceof ViewGroup) {
                for(int v = 0; v < ((ViewGroup)view0).getChildCount(); ++v) {
                    if(this.cr(((ViewGroup)view0).getChildAt(v))) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public void cr(boolean z) {
        this.qZS = z;
    }
}

