package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.sdk.component.adexpress.cr.XX;
import com.bytedance.sdk.component.adexpress.cr;
import com.bytedance.sdk.component.adexpress.dynamic.ReZ;
import com.bytedance.sdk.component.adexpress.dynamic.cr.Au;
import java.util.List;

public class iZZ extends cz implements ReZ {
    private int Owx;
    int PjT;
    private int RD;
    private boolean Sks;
    boolean Zh;

    public iZZ(Context context0, DynamicRootView dynamicRootView0, Au au0) {
        super(context0, dynamicRootView0, au0);
        this.RD = 0;
        this.setTag(this.getClickArea());
        this.PjT();
        dynamicRootView0.setTimeOutListener(this);
        if(dynamicRootView0.getRenderRequest() != null && !dynamicRootView0.getRenderRequest().cRA()) {
            View view0 = this.qla;
            if(view0 != null) {
                view0.setVisibility(8);
            }
            this.setVisibility(8);
        }
    }

    private void PjT() {
        List list0 = this.xs.qj();
        if(list0 != null && list0.size() > 0) {
            for(Object object0: list0) {
                Au au0 = (Au)object0;
                if(TextUtils.equals("skip-with-time-skip-btn", au0.DWo().Zh())) {
                    int v = cr.Zh() ? au0.xs() : 0;
                    int v1 = (int)XX.PjT(this.qj, au0.Au() + ((float)v));
                    this.Owx = v1;
                    this.PjT = this.XX - v1;
                    break;
                }
                if(false) {
                    break;
                }
            }
            this.RD = this.XX - this.PjT;
        }
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.ReZ
    public void PjT(CharSequence charSequence0, boolean z, int v, boolean z1) {
        if(z1 && !this.Sks) {
            this.Sks = true;
            this.cz();
            return;
        }
        if(z && !this.Zh) {
            this.Zh = true;
            this.cz();
        }
        this.Zh = z;
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.cz
    public boolean SM() {
        if(com.bytedance.sdk.component.adexpress.cr.cz.Zh(this.fDm.getRenderRequest().cr())) {
            return true;
        }
        super.SM();
        this.setPadding(((int)XX.PjT(cr.PjT(), ((float)this.xf.ReZ()))), ((int)XX.PjT(cr.PjT(), ((float)this.xf.Zh()))), ((int)XX.PjT(cr.PjT(), ((float)this.xf.cr()))), ((int)XX.PjT(cr.PjT(), ((float)this.xf.PjT()))));
        return true;
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JQp
    public void cz() {
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-2, -2);
        frameLayout$LayoutParams0.leftMargin = this.Zh ? this.SM : this.SM + this.RD;
        if(this.Sks && this.xf != null) {
            frameLayout$LayoutParams0.leftMargin = this.SM + this.RD - ((int)XX.PjT(cr.PjT(), ((float)this.xf.ReZ()))) - ((int)XX.PjT(cr.PjT(), ((float)this.xf.cr())));
        }
        frameLayout$LayoutParams0.topMargin = cr.Zh() ? this.DWo - ((int)XX.PjT(cr.PjT(), ((float)this.xf.Zh()))) : this.DWo;
        frameLayout$LayoutParams0.setMarginStart(frameLayout$LayoutParams0.leftMargin);
        frameLayout$LayoutParams0.setMarginEnd(frameLayout$LayoutParams0.rightMargin);
        this.setLayoutParams(frameLayout$LayoutParams0);
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.cz
    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override  // android.widget.FrameLayout
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        if(this.Sks && this.xf != null) {
            this.setMeasuredDimension(this.Owx + ((int)XX.PjT(cr.PjT(), ((float)this.xf.ReZ()))) + ((int)XX.PjT(cr.PjT(), ((float)this.xf.cr()))), this.Au);
            return;
        }
        if(this.Zh) {
            this.setMeasuredDimension(this.XX, this.Au);
            return;
        }
        this.setMeasuredDimension(this.PjT, this.Au);
    }
}

