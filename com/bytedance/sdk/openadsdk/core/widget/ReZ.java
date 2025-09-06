package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import com.bytedance.sdk.openadsdk.core.JQp.cr;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.gK.Zh;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.qla;

public class ReZ extends cr {
    public ReZ(Context context0) {
        super(context0);
        this.PjT();
    }

    private void PjT() {
        this.setVisibility(8);
        this.setId(qla.GL);
    }

    public void PjT(int v, Owx owx0) {
        if(owx0.uvo() || owx0.pBJ() && owx0.xf()) {
            qZS.PjT(this, 0);
            Zh.PjT().PjT(((int)qZS.PjT(this.getContext(), ((float)v), true)), this, owx0);
        }
    }
}

