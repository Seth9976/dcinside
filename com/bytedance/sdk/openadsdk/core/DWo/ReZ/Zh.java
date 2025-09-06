package com.bytedance.sdk.openadsdk.core.DWo.ReZ;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.Au.fDm;
import com.bytedance.sdk.openadsdk.core.KM;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.qla;

public class Zh {
    public static class PjT {
        public static ReZ PjT(Context context0, Owx owx0) {
            return qla.PjT(owx0) ? new cr(context0, owx0) : null;
        }
    }

    private ReZ PjT;
    private Owx ReZ;
    private Context Zh;
    private com.bytedance.sdk.openadsdk.core.DWo.ReZ.PjT cr;

    public Zh(Context context0, Owx owx0) {
        this.Zh = context0;
        this.ReZ = owx0;
    }

    public void PjT() {
        ReZ reZ0 = this.PjT;
        if(reZ0 != null) {
            reZ0.Zh();
        }
    }

    public void PjT(int v) {
        ReZ reZ0 = this.PjT;
        if(reZ0 instanceof cr) {
            KM kM0 = ((cr)reZ0).JQp();
            if(kM0 != null && kM0.PjT() != null) {
                kM0.PjT().PjT(v);
            }
        }
    }

    public void PjT(fDm fDm0) {
        ReZ reZ0 = PjT.PjT(this.Zh, this.ReZ);
        this.PjT = reZ0;
        if(reZ0 != null) {
            reZ0.PjT();
            this.PjT.PjT(fDm0);
        }
    }

    public void PjT(com.bytedance.sdk.openadsdk.core.DWo.ReZ.PjT pjT0) {
        this.cr = pjT0;
        ReZ reZ0 = this.PjT;
        if(reZ0 != null) {
            reZ0.PjT(pjT0);
        }
    }

    public void ReZ() {
        ReZ reZ0 = this.PjT;
        if(reZ0 != null) {
            reZ0.ReZ();
        }
    }

    public View Zh() {
        return this.PjT == null ? null : this.PjT.cr();
    }
}

