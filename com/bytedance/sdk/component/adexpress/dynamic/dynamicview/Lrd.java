package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.sdk.component.adexpress.cr.XX;
import com.bytedance.sdk.component.adexpress.cr;
import com.bytedance.sdk.component.adexpress.dynamic.cr.Au;

public class Lrd extends cz {
    private int PjT;

    public Lrd(Context context0, DynamicRootView dynamicRootView0, Au au0) {
        super(context0, dynamicRootView0, au0);
        this.PjT = 0;
        com.bytedance.sdk.component.adexpress.cz.Lrd lrd0 = new com.bytedance.sdk.component.adexpress.cz.Lrd(context0, null);
        this.qla = lrd0;
        lrd0.setTag(this.getClickArea());
        this.addView(this.qla, this.getWidgetLayoutParams());
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.cz
    public boolean SM() {
        super.SM();
        double f = this.xf.xs();
        if(cr.Zh() && (f < 0.0 || f > 5.0 || this.fDm != null && this.fDm.getRenderRequest() != null && this.fDm.getRenderRequest().DWo() != 4)) {
            this.qla.setVisibility(8);
            return true;
        }
        this.qla.setVisibility(0);
        ((com.bytedance.sdk.component.adexpress.cz.Lrd)this.qla).PjT((f < 0.0 || f > 5.0 ? 5.0 : f), this.xf.XX(), ((int)this.xf.JQp()), ((int)XX.PjT(this.qj, ((float)this.xf.Zh()))) + ((int)XX.PjT(this.qj, ((float)this.xf.PjT()))) + ((int)XX.PjT(this.qj, this.xf.JQp())));
        return true;
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JQp
    public void cz() {
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(this.XX, this.Au);
        frameLayout$LayoutParams0.topMargin = this.DWo;
        int v = this.SM + this.PjT;
        frameLayout$LayoutParams0.leftMargin = v;
        frameLayout$LayoutParams0.setMarginStart(v);
        frameLayout$LayoutParams0.setMarginEnd(frameLayout$LayoutParams0.rightMargin);
        this.setLayoutParams(frameLayout$LayoutParams0);
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.cz
    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        int v = (int)(XX.PjT(cr.PjT(), this.xf.JQp()) * 5.0f + XX.PjT(cr.PjT(), ((float)this.xf.ReZ()) + XX.PjT(cr.PjT(), ((float)this.xf.cr()))));
        if(this.XX > v && 4 == this.xf.Au()) {
            this.PjT = (this.XX - v) / 2;
        }
        this.XX = v;
        return new FrameLayout.LayoutParams(this.XX, this.Au);
    }
}

