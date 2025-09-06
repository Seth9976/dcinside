package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils.TruncateAt;
import android.text.TextUtils;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.cr;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.PjT;
import com.bytedance.sdk.component.adexpress.dynamic.cr.Au;

public class XX extends cz {
    public XX(Context context0, DynamicRootView dynamicRootView0, Au au0) {
        super(context0, dynamicRootView0, au0);
        PjT pjT0 = new PjT(context0);
        this.qla = pjT0;
        pjT0.setTag(this.getClickArea());
        this.addView(this.qla, this.getWidgetLayoutParams());
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.cz
    public boolean SM() {
        super.SM();
        if(TextUtils.equals("download-progress-button", this.xs.DWo().Zh()) && TextUtils.isEmpty(this.xf.DWo())) {
            this.qla.setVisibility(4);
            return true;
        }
        this.qla.setTextAlignment(this.xf.Au());
        ((TextView)this.qla).setText(this.xf.DWo());
        ((TextView)this.qla).setTextColor(this.xf.XX());
        ((TextView)this.qla).setTextSize(this.xf.JQp());
        ((TextView)this.qla).setGravity(17);
        ((TextView)this.qla).setIncludeFontPadding(false);
        if("fillButton".equals(this.xs.DWo().Zh())) {
            this.qla.setPadding(0, 0, 0, 0);
            return true;
        }
        this.qla.setPadding(this.xf.ReZ(), this.xf.Zh(), this.xf.cr(), this.xf.PjT());
        return true;
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.cz
    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        if(cr.Zh() && "fillButton".equals(this.xs.DWo().Zh())) {
            ((TextView)this.qla).setEllipsize(TextUtils.TruncateAt.END);
            ((TextView)this.qla).setMaxLines(1);
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = super.getWidgetLayoutParams();
            frameLayout$LayoutParams0.width -= this.xf.gK() * 2;
            frameLayout$LayoutParams0.height -= this.xf.gK() * 2;
            frameLayout$LayoutParams0.topMargin += this.xf.gK();
            int v = frameLayout$LayoutParams0.leftMargin + this.xf.gK();
            frameLayout$LayoutParams0.leftMargin = v;
            frameLayout$LayoutParams0.setMarginStart(v);
            frameLayout$LayoutParams0.setMarginEnd(frameLayout$LayoutParams0.rightMargin);
            return frameLayout$LayoutParams0;
        }
        return super.getWidgetLayoutParams();
    }
}

