package com.bytedance.sdk.openadsdk.Lrd.Zh;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.Owx;

public class ReZ extends Zh {
    private int cr;

    public ReZ(Integer integer0, View view0, Owx owx0, PjT jQp$PjT0) {
        super(integer0, view0, owx0, 1000, jQp$PjT0);
        this.cr = -1;
        this.Zh(view0);
    }

    @Override  // com.bytedance.sdk.openadsdk.Lrd.Zh.Zh
    protected boolean ReZ() {
        boolean z = false;
        if(this.PjT != null && this.PjT.get() != null) {
            View view0 = (View)this.PjT.get();
            if(this.cr == -1) {
                this.Zh(view0);
            }
            if(this.cr == 1) {
                z = true;
            }
            return cz.PjT(view0, z, this.Zh.kW());
        }
        return false;
    }

    private void Zh(View view0) {
        if(view0 != null) {
            int v = view0.getWidth();
            int v1 = view0.getHeight();
            if(v > 0 && v1 > 0) {
                this.cr = v * v1 < 242500 ? 0 : 1;
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.Lrd.Zh.Zh
    protected void Zh(int v) {
    }

    @Override  // com.bytedance.sdk.openadsdk.Lrd.Zh.Zh
    protected void cr() {
        super.cr();
    }

    @Override  // com.bytedance.sdk.openadsdk.Lrd.Zh.Zh
    public int cz() {
        return 100;
    }
}

