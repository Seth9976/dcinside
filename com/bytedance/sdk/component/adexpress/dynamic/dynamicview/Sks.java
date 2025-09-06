package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.sdk.component.adexpress.cr.XX;
import com.bytedance.sdk.component.adexpress.cr;
import com.bytedance.sdk.component.adexpress.dynamic.ReZ;
import com.bytedance.sdk.component.adexpress.dynamic.cr.Au;
import java.util.List;

public class Sks extends cz implements ReZ {
    private int Owx;
    private int PjT;
    private int Zh;

    public Sks(Context context0, DynamicRootView dynamicRootView0, Au au0) {
        super(context0, dynamicRootView0, au0);
        this.setTag(this.getClickArea());
        dynamicRootView0.setTimeOutListener(this);
        this.PjT();
    }

    private void PjT() {
        List list0 = this.xs.qj();
        if(list0 != null && list0.size() > 0) {
            for(Object object0: list0) {
                Au au0 = (Au)object0;
                if(au0.DWo().PjT() == 21) {
                    this.PjT = (int)(((float)this.XX) - XX.PjT(this.qj, au0.Au()));
                }
                if(au0.DWo().PjT() == 20) {
                    this.Zh = (int)(((float)this.XX) - XX.PjT(this.qj, au0.Au()));
                }
            }
        }
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.ReZ
    public void PjT(CharSequence charSequence0, boolean z, int v, boolean z1) {
        this.Owx = v;
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.cz
    public boolean SM() {
        this.setBackground(this.getBackgroundDrawable());
        this.setPadding(((int)XX.PjT(cr.PjT(), ((float)this.xf.ReZ()))), ((int)XX.PjT(cr.PjT(), ((float)this.xf.Zh()))), ((int)XX.PjT(cr.PjT(), ((float)this.xf.cr()))), ((int)XX.PjT(cr.PjT(), ((float)this.xf.PjT()))));
        return true;
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JQp
    public void cz() {
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-2, -2);
        frameLayout$LayoutParams0.leftMargin = this.SM;
        frameLayout$LayoutParams0.topMargin = this.DWo;
        frameLayout$LayoutParams0.setMarginStart(this.SM);
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
        if(this.Owx == 0) {
            this.setMeasuredDimension(this.Zh, this.Au);
            return;
        }
        this.setMeasuredDimension(this.PjT, this.Au);
    }
}

