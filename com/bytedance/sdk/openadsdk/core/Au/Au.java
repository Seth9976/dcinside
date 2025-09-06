package com.bytedance.sdk.openadsdk.core.Au;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.SM;
import com.bytedance.sdk.openadsdk.core.Zh.PjT;
import com.bytedance.sdk.openadsdk.core.model.DWo;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.fDm;
import com.bytedance.sdk.openadsdk.utils.qZS;
import org.json.JSONObject;

public class Au extends PjT {
    public Au(@NonNull Context context0, @NonNull Owx owx0, @NonNull String s, int v) {
        super(context0, owx0, s, v);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Zh.Zh
    protected DWo PjT(float f, float f1, float f2, float f3, SparseArray sparseArray0, long v, long v1, View view0, View view1, String s, float f4, int v2, float f5, int v3, JSONObject jSONObject0, JSONObject jSONObject1) {
        int v12;
        int v11;
        long v10;
        long v9;
        float f9;
        float f8;
        float f7;
        float f6;
        int v5;
        int v4;
        int[] arr_v = qZS.PjT(view0);
        if(arr_v == null || arr_v.length != 2) {
            f8 = f;
            f9 = f1;
            f7 = f2;
            f6 = f3;
            v4 = 0;
            v5 = 0;
        }
        else {
            v4 = arr_v[0];
            v5 = arr_v[1];
            if(this.Owx == 0) {
                int v6 = qZS.Zh(this.cr, f);
                int v7 = qZS.Zh(this.cr, f1);
                int v8 = qZS.Zh(this.cr, f2);
                f6 = ((float)(qZS.Zh(this.cr, f3) + v5)) - 0.5f;
                f7 = ((float)(v8 + v4)) - 0.5f;
                f8 = ((float)(v6 + v4)) - 0.5f;
                f9 = ((float)(v7 + v5)) - 0.5f;
            }
            else {
                f8 = f;
                f9 = f1;
                f7 = f2;
                f6 = f3;
            }
        }
        int[] arr_v1 = new int[2];
        int[] arr_v2 = new int[2];
        fDm fDm0 = this.JQp;
        if(fDm0 == null) {
            v9 = v;
            v10 = v1;
        }
        else {
            v9 = fDm0.JQp;
            v10 = fDm0.cz;
            if(this.Owx == 0) {
                arr_v1[0] = qZS.Zh(this.cr, ((float)fDm0.XX)) + v4;
                arr_v1[1] = qZS.Zh(this.cr, ((float)this.JQp.Au)) + v5;
                v11 = qZS.Zh(this.cr, ((float)this.JQp.SM));
                v12 = qZS.Zh(this.cr, ((float)this.JQp.DWo));
            }
            else {
                arr_v1[0] = fDm0.XX;
                arr_v1[1] = fDm0.Au;
                v11 = fDm0.SM;
                v12 = fDm0.DWo;
            }
            arr_v2[0] = v11;
            arr_v2[1] = v12;
            if(v11 == 0 && v12 == 0 && view1 != null) {
                arr_v1 = qZS.PjT(view1);
                arr_v2 = qZS.ReZ(view1);
            }
        }
        this.Owx = 0;
        com.bytedance.sdk.openadsdk.core.model.DWo.PjT dWo$PjT0 = new com.bytedance.sdk.openadsdk.core.model.DWo.PjT().cz(f8).JQp(f9).cr(f7).ReZ(f6).Zh(v9).PjT(v10).Zh(arr_v).PjT(arr_v1).ReZ(qZS.ReZ(view0)).cr(arr_v2).cr(this.iZZ).JQp(this.Yo).cz(this.KM);
        return SM.Zh().PjT() ? dWo$PjT0.Zh(1).PjT(sparseArray0).PjT(s).PjT(f4).ReZ(v2).Zh(f5).PjT(v3).PjT(jSONObject0).Zh(jSONObject1).PjT() : dWo$PjT0.Zh(2).PjT(sparseArray0).PjT(s).PjT(f4).ReZ(v2).Zh(f5).PjT(v3).PjT(jSONObject0).Zh(jSONObject1).PjT();
    }

    public void PjT(fDm fDm0) {
        this.JQp = fDm0;
    }
}

