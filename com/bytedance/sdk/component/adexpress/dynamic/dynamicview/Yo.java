package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.dynamic.ReZ;
import com.bytedance.sdk.component.adexpress.dynamic.cr.Au;
import com.bytedance.sdk.component.utils.Lrd;

public class Yo extends cz implements ReZ {
    private boolean PjT;

    public Yo(Context context0, DynamicRootView dynamicRootView0, Au au0) {
        super(context0, dynamicRootView0, au0);
        if(dynamicRootView0.getRenderRequest() != null) {
            this.PjT = dynamicRootView0.getRenderRequest().xs();
        }
        this.XX = this.Au;
        ImageView imageView0 = new ImageView(context0);
        this.qla = imageView0;
        imageView0.setTag(this.getClickArea());
        this.addView(this.qla, this.getWidgetLayoutParams());
        dynamicRootView0.setTimeOutListener(this);
        if(dynamicRootView0.getRenderRequest() != null && !dynamicRootView0.getRenderRequest().cRA()) {
            this.qla.setVisibility(8);
            this.setVisibility(8);
        }
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.ReZ
    public void PjT(CharSequence charSequence0, boolean z, int v, boolean z1) {
        this.setVisibility((z || z1 ? 0 : 8));
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.cz
    public boolean SM() {
        Drawable drawable1;
        super.SM();
        ((ImageView)this.qla).setScaleType(ImageView.ScaleType.CENTER_CROP);
        Drawable drawable0 = com.bytedance.sdk.component.adexpress.cr.ReZ.PjT(this.getContext(), this.xf);
        if(drawable0 != null) {
            ((ImageView)this.qla).setBackground(drawable0);
        }
        if(this.PjT) {
            drawable1 = Lrd.ReZ(this.getContext(), "tt_close_btn");
        }
        else {
            drawable1 = Lrd.ReZ(this.getContext(), "tt_skip_btn");
            if(drawable1 != null) {
                drawable1.setAutoMirrored(true);
            }
        }
        if(drawable1 != null) {
            ((ImageView)this.qla).setImageDrawable(drawable1);
        }
        this.setVisibility(8);
        return true;
    }
}

