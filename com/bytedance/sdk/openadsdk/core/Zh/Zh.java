package com.bytedance.sdk.openadsdk.core.Zh;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.openadsdk.api.PangleAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.SM;
import com.bytedance.sdk.openadsdk.core.ZX;
import com.bytedance.sdk.openadsdk.core.model.DWo;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.cRA;
import com.bytedance.sdk.openadsdk.core.model.fDm;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.ltE.PjT.PjT.XX;
import com.bytedance.sdk.openadsdk.ltE.PjT.PjT.cz;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.qla;
import com.bytedance.sdk.openadsdk.utils.wN;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import x.b;

public class Zh extends ReZ {
    public interface PjT {
        void PjT(View arg1, int arg2);
    }

    protected final int Au;
    protected WeakReference DWo;
    public fDm JQp;
    protected int Owx;
    private String PjT;
    private boolean ReZ;
    protected WeakReference SM;
    protected final String XX;
    private WeakReference Zh;
    protected Context cr;
    protected final Owx cz;
    protected b fDm;
    protected PangleAd gK;
    protected com.bytedance.sdk.openadsdk.core.Au.Zh ltE;
    protected DWo qj;
    protected boolean qla;
    protected Map ub;
    private static int wN = 0x80000000;
    protected cz xE;
    protected PjT xf;
    protected PAGNativeAd xs;

    static {
    }

    public Zh(@NonNull Context context0, @NonNull Owx owx0, @NonNull String s, int v) {
        this.qla = false;
        this.Owx = 0;
        this.ReZ = false;
        this.cr = context0;
        this.cz = owx0;
        this.XX = s;
        this.Au = v;
    }

    public Zh(@NonNull Context context0, @NonNull Owx owx0, @NonNull String s, int v, boolean z) {
        this(context0, owx0, s, v);
        this.ReZ = z;
    }

    public View JQp() {
        if(this.Zh != null && this.Zh.get() != null) {
            View view0 = ((Activity)this.Zh.get()).findViewById(0x1F000011);
            return view0 == null ? ((Activity)this.Zh.get()).findViewById(0x1F000011) : view0;
        }
        return null;
    }

    public void JQp(boolean z) {
        this.qla = z;
    }

    private static int PjT(Context context0) {
        if(Zh.wN == 0x80000000) {
            Zh.wN = Lrd.JQp(context0, "btn_native_creative");
        }
        return Zh.wN;
    }

    public static boolean PjT(View view0, Owx owx0, boolean z) {
        if(view0 != null && owx0 != null) {
            try {
                String s = String.valueOf(view0.getTag(com.bytedance.sdk.component.adexpress.dynamic.PjT.Owx));
                if(view0.getTag(com.bytedance.sdk.component.adexpress.dynamic.PjT.Owx) != null && !TextUtils.isEmpty(s)) {
                    return "click".equals(s) ? z : true;
                }
            }
            catch(Exception unused_ex) {
            }
            return Zh.ReZ(view0) ? owx0.Lrd() != 1 || z : owx0.tT() != 1 || z;
        }
        return true;
    }

    protected DWo PjT(float f, float f1, float f2, float f3, SparseArray sparseArray0, long v, long v1, View view0, View view1, String s, float f4, int v2, float f5, int v3, JSONObject jSONObject0, JSONObject jSONObject1) {
        com.bytedance.sdk.openadsdk.core.model.DWo.PjT dWo$PjT0 = new com.bytedance.sdk.openadsdk.core.model.DWo.PjT().cz(f).JQp(f1).cr(f2).ReZ(f3).Zh(v).PjT(v1).Zh(qZS.PjT(view0)).PjT(qZS.PjT(view1)).ReZ(qZS.ReZ(view0)).cr(qZS.ReZ(view1)).cr(this.iZZ).JQp(this.Yo).cz(this.KM).PjT(sparseArray0);
        return SM.Zh().PjT() ? dWo$PjT0.Zh(1).PjT(s).PjT(f4).ReZ(v2).Zh(f5).PjT(v3).PjT(jSONObject0).Zh(jSONObject1).PjT() : dWo$PjT0.Zh(2).PjT(s).PjT(f4).ReZ(v2).Zh(f5).PjT(v3).PjT(jSONObject0).Zh(jSONObject1).PjT();
    }

    public void PjT(int v) {
        this.KM = v;
    }

    public void PjT(Activity activity0) {
        if(activity0 == null) {
            return;
        }
        this.Zh = new WeakReference(activity0);
    }

    public void PjT(View view0) {
        if(view0 == null) {
            return;
        }
        this.SM = new WeakReference(view0);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Zh.ReZ
    public void PjT(View view0, float f, float f1, float f2, float f3, SparseArray sparseArray0, boolean z) {
        JSONObject jSONObject1;
        JSONObject jSONObject0;
        int v;
        boolean z1;
        if(this.cr == null) {
            this.cr = ub.PjT();
        }
        if(!this.ReZ && this.PjT(view0, 1, f, f1, f2, f3, sparseArray0, z)) {
            return;
        }
        if(this.cr == null) {
            return;
        }
        fDm fDm0 = this.JQp;
        Activity activity0 = null;
        if(fDm0 == null) {
            jSONObject0 = null;
            jSONObject1 = null;
            v = -1;
            z1 = false;
        }
        else {
            z1 = fDm0.gK;
            v = fDm0.xf;
            jSONObject0 = fDm0.xs;
            jSONObject1 = fDm0.ub;
        }
        DWo dWo0 = this.PjT(f, f1, f2, f3, sparseArray0, this.cRA, this.yIW, (this.SM == null ? null : ((View)this.SM.get())), (this.DWo == null ? null : ((View)this.DWo.get())), this.cz(), qZS.XX(this.cr), qZS.SM(this.cr), qZS.Au(this.cr), v, jSONObject0, jSONObject1);
        this.qj = dWo0;
        if(this.PjT(dWo0, this.ub)) {
            return;
        }
        if(this.fDm != null) {
            if(this.ub == null) {
                this.ub = new HashMap();
            }
            this.ub.put("duration", this.fDm.JQp());
        }
        int v1 = 2;
        if(!this.ReZ && !z1) {
            PjT zh$PjT0 = this.xf;
            if(zh$PjT0 != null) {
                zh$PjT0.PjT(view0, -1);
            }
            if(!this.PjT(view0, z)) {
                return;
            }
            boolean z2 = cRA.Zh(this.cz);
            String s = z2 ? this.XX : wN.PjT(this.Au);
            if(view0 != null) {
                try {
                    if(((Boolean)view0.getTag(0x1F000042)).booleanValue()) {
                        ZX.PjT(true);
                    }
                }
                catch(Exception unused_ex) {
                }
            }
            if(view0 != null) {
                activity0 = com.bytedance.sdk.component.utils.Zh.PjT(view0);
            }
            Context context0 = activity0 == null ? this.cr : activity0;
            boolean z3 = ZX.PjT(context0, this.cz, this.Au, this.xs, this.gK, s, this.xE, z2, 0);
            ZX.PjT(false);
            if(!z3 && (this.cz != null && this.cz.RV() != null && this.cz.RV().ReZ() == 2)) {
                return;
            }
            if(this.cz != null && !z3 && TextUtils.isEmpty(this.cz.xu()) && com.bytedance.sdk.openadsdk.cr.Zh.PjT(this.XX)) {
                XX.PjT(this.cr, this.cz, this.XX).cr();
            }
            Owx owx0 = this.cz;
            DWo dWo1 = this.qj;
            String s1 = this.XX;
            Map map0 = this.ub;
            if(z) {
                v1 = 1;
            }
            com.bytedance.sdk.openadsdk.cr.ReZ.PjT("click", owx0, dWo1, s1, z3, map0, v1);
            return;
        }
        Owx owx1 = this.cz;
        DWo dWo2 = this.qj;
        String s2 = this.XX;
        Map map1 = this.ub;
        if(z) {
            v1 = 1;
        }
        com.bytedance.sdk.openadsdk.cr.ReZ.PjT("click", owx1, dWo2, s2, true, map1, v1);
    }

    public void PjT(PangleAd pangleAd0) {
        this.gK = pangleAd0;
    }

    public void PjT(PAGNativeAd pAGNativeAd0) {
        this.xs = pAGNativeAd0;
    }

    public void PjT(com.bytedance.sdk.openadsdk.core.Au.Zh zh0) {
        this.ltE = zh0;
    }

    public void PjT(PjT zh$PjT0) {
        this.xf = zh$PjT0;
    }

    public void PjT(cz cz0) {
        this.xE = cz0;
    }

    public void PjT(String s) {
        this.PjT = s;
    }

    public void PjT(Map map0) {
        Map map1 = this.ub;
        if(map1 != null) {
            map1.putAll(map0);
            map0.putAll(this.ub);
        }
        this.ub = map0;
    }

    public void PjT(b b0) {
        this.fDm = b0;
    }

    protected boolean PjT(View view0, int v, float f, float f1, float f2, float f3, SparseArray sparseArray0, boolean z) {
        if(this.ltE != null) {
            int[] arr_v = new int[2];
            int[] arr_v1 = new int[2];
            WeakReference weakReference0 = this.DWo;
            if(weakReference0 != null) {
                arr_v = qZS.PjT(((View)weakReference0.get()));
                arr_v1 = qZS.ReZ(((View)this.DWo.get()));
            }
            fDm fDm0 = new com.bytedance.sdk.openadsdk.core.model.fDm.PjT().cr(f).ReZ(f1).Zh(f2).PjT(f3).Zh(this.cRA).PjT(this.yIW).ReZ(arr_v[0]).cr(arr_v[1]).JQp(arr_v1[0]).cz(arr_v1[1]).PjT(sparseArray0).PjT(z).PjT();
            this.ltE.PjT(view0, v, fDm0);
            return true;
        }
        return false;
    }

    public boolean PjT(View view0, boolean z) {
        return Zh.PjT(view0, this.cz, z);
    }

    public boolean PjT(DWo dWo0, Map map0) {
        return false;
    }

    public static boolean ReZ(View view0) {
        if(0x1F000009 != view0.getId() && 0x1F00000B != view0.getId() && 0x1F000007 != view0.getId() && Zh.PjT(view0.getContext()) != view0.getId()) {
            int v = view0.getId();
            if(qla.Wo != v) {
                int v1 = view0.getId();
                return qla.AjB == v1;
            }
        }
        return true;
    }

    public void ReZ(int v) {
        this.iZZ = v;
    }

    public void Zh(int v) {
        this.Yo = v;
    }

    public void Zh(View view0) {
        if(view0 == null) {
            return;
        }
        this.DWo = new WeakReference(view0);
    }

    public View cr() {
        return this.Zh == null || this.Zh.get() == null ? null : ((Activity)this.Zh.get()).findViewById(0x1020002);
    }

    public void cr(int v) {
        this.Owx = v;
    }

    public String cz() {
        return this.PjT;
    }
}

