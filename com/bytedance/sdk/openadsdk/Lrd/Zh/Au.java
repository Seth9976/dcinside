package com.bytedance.sdk.openadsdk.Lrd.Zh;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.Owx;

public class Au extends Zh {
    private int cr;

    public Au(Integer integer0, View view0, Owx owx0, PjT jQp$PjT0) {
        super(integer0, view0, owx0, 2000, jQp$PjT0);
        this.cr = 0;
    }

    @Override  // com.bytedance.sdk.openadsdk.Lrd.Zh.Zh
    public void PjT() {
        if(this.cr != 1) {
            return;
        }
        super.PjT();
    }

    @Override  // com.bytedance.sdk.openadsdk.Lrd.Zh.Zh
    protected boolean ReZ() {
        return cz.PjT(((View)this.PjT.get()), this.Zh.kW()) && this.cr == 1;
    }

    @Override  // com.bytedance.sdk.openadsdk.Lrd.Zh.Zh
    protected void Zh(int v) {
        if(this.SM()) {
            return;
        }
        if(v == 5 || v == 6) {
            this.cr = 0;
            this.Au();
        }
        if(v == 2 || v == 3) {
            this.cr = 2;
            this.Au();
        }
        if(this.cr != 1 && v == 0) {
            this.cr = 1;
            this.PjT();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.Lrd.Zh.Zh
    protected void cr() {
        super.cr();
    }

    @Override  // com.bytedance.sdk.openadsdk.Lrd.Zh.Zh
    public int cz() {
        return 200;
    }

    @Override  // com.bytedance.sdk.openadsdk.Lrd.Zh.Zh
    public boolean xf() {
        boolean z = this.cr == 0 || this.cr == 2;
        if(z) {
            this.ReZ.set(false);
        }
        return !z || super.xf();
    }
}

