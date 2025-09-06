package com.bytedance.sdk.openadsdk.core.Zh;

import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.qj.PjT;
import com.bytedance.sdk.openadsdk.utils.qla;

public abstract class XX extends ReZ {
    private final String PjT;
    private ReZ ReZ;
    private final PjT Zh;

    public XX(String s, PjT pjT0) {
        this(s, pjT0, null);
    }

    public XX(String s, PjT pjT0, ReZ reZ0) {
        this.PjT = s;
        this.Zh = pjT0;
        this.ReZ = reZ0;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Zh.ReZ
    protected void PjT(View view0, float f, float f1, float f2, float f3, SparseArray sparseArray0, boolean z) {
        PjT pjT0 = this.Zh;
        if(pjT0 != null) {
            pjT0.JQp(this.PjT);
        }
        if(view0 != null) {
            if(view0.getId() == qla.ReZ) {
                view0.setTag(0x22000001, "VAST_TITLE");
            }
            else if(view0.getId() == qla.XX) {
                view0.setTag(0x22000001, "VAST_DESCRIPTION");
            }
            else {
                view0.setTag(0x22000001, this.PjT);
            }
        }
        ReZ reZ0 = this.ReZ;
        if(reZ0 != null) {
            reZ0.cRA = this.cRA;
            reZ0.yIW = this.yIW;
            reZ0.iZZ = this.iZZ;
            reZ0.Yo = this.iZZ;
            reZ0.KM = this.iZZ;
            reZ0.PjT(view0, f, f1, f2, f3, sparseArray0, z);
        }
    }

    public void PjT(ReZ reZ0) {
        this.ReZ = reZ0;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Zh.ReZ
    public boolean onTouch(View view0, MotionEvent motionEvent0) {
        return super.onTouch(view0, motionEvent0);
    }
}

