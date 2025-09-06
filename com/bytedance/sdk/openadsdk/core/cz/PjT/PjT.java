package com.bytedance.sdk.openadsdk.core.cz.PjT;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.adexpress.Zh.qj;
import com.bytedance.sdk.openadsdk.core.Zh.ReZ;
import com.bytedance.sdk.openadsdk.core.model.fDm;
import com.bytedance.sdk.openadsdk.utils.qZS;
import java.lang.ref.WeakReference;

public class PjT extends ReZ implements com.bytedance.sdk.component.adexpress.dynamic.cz.PjT {
    protected WeakReference PjT;
    private qj ReZ;
    protected WeakReference Zh;

    private void PjT(View view0, int v, float f, float f1, float f2, float f3, SparseArray sparseArray0) {
        String s;
        if(this.ReZ != null) {
            int[] arr_v = new int[2];
            int[] arr_v1 = new int[2];
            WeakReference weakReference0 = this.Zh;
            if(weakReference0 != null) {
                int[] arr_v2 = qZS.PjT(((View)weakReference0.get()));
                if(arr_v2 != null) {
                    arr_v = arr_v2;
                }
                int[] arr_v3 = qZS.ReZ(((View)this.Zh.get()));
                if(arr_v3 != null) {
                    arr_v1 = arr_v3;
                }
            }
            try {
                s = "";
                int v1 = com.bytedance.sdk.component.adexpress.dynamic.PjT.RD;
                if(view0.getTag(v1) != null) {
                    s = String.valueOf(view0.getTag(v1));
                }
            }
            catch(Exception unused_ex) {
            }
            fDm fDm0 = new com.bytedance.sdk.openadsdk.core.model.fDm.PjT().cr(f).ReZ(f1).Zh(f2).PjT(f3).Zh(this.cRA).PjT(this.yIW).ReZ(arr_v[0]).cr(arr_v[1]).JQp(arr_v1[0]).cz(arr_v1[1]).PjT(sparseArray0).PjT(this.ZX).PjT(s).PjT();
            this.ReZ.PjT(view0, v, fDm0);
        }
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.cz.PjT
    public void PjT(View view0) {
        this.PjT = new WeakReference(view0);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Zh.ReZ
    public void PjT(View view0, float f, float f1, float f2, float f3, SparseArray sparseArray0, boolean z) {
        this.PjT(view0, ((int)(((Integer)view0.getTag()))), f, f1, f2, f3, sparseArray0);
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.cz.PjT
    public void PjT(qj qj0) {
        this.ReZ = qj0;
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.cz.PjT
    public void Zh(View view0) {
        this.Zh = new WeakReference(view0);
    }
}

