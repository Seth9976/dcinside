package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.cr.XX;
import com.bytedance.sdk.component.adexpress.dynamic.ReZ;
import com.bytedance.sdk.component.adexpress.dynamic.cr.Au;
import com.bytedance.sdk.component.utils.Lrd;

public class KM extends cz implements ReZ {
    private boolean PjT;

    public KM(Context context0, DynamicRootView dynamicRootView0, Au au0) {
        super(context0, dynamicRootView0, au0);
        this.XX = this.Au;
        ImageView imageView0 = new ImageView(context0);
        this.qla = imageView0;
        imageView0.setTag(this.getClickArea());
        this.addView(this.qla, this.getWidgetLayoutParams());
        dynamicRootView0.setTimeOutListener(this);
        if(dynamicRootView0.getRenderRequest() != null) {
            if(!dynamicRootView0.getRenderRequest().cRA()) {
                this.qla.setVisibility(8);
                this.setVisibility(8);
            }
            this.PjT = dynamicRootView0.getRenderRequest().xs();
        }
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.ReZ
    public void PjT(CharSequence charSequence0, boolean z, int v, boolean z1) {
        this.setVisibility((z || z1 ? 0 : 8));
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.cz
    public boolean SM() {
        super.SM();
        View view0 = this.qla;
        if(view0 != null) {
            ((ImageView)view0).setScaleType(ImageView.ScaleType.CENTER_CROP);
            Drawable drawable0 = com.bytedance.sdk.component.adexpress.cr.ReZ.PjT(this.getContext(), this.xf);
            if(drawable0 != null) {
                ((ImageView)this.qla).setBackground(drawable0);
            }
            Drawable drawable1 = this.PjT ? Lrd.ReZ(this.getContext(), "tt_close_btn") : Lrd.ReZ(this.getContext(), "tt_skip_btn");
            if(drawable1 != null) {
                drawable1.setAutoMirrored(true);
                ((ImageView)this.qla).setImageDrawable(drawable1);
            }
            int v = (int)XX.PjT(this.qj, ((float)this.xf.Zh()));
            this.qla.setPadding(v, v, v, v);
        }
        this.setVisibility(8);
        return true;
    }
}

