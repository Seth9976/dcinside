package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.text.TextUtils;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import com.bytedance.sdk.component.JQp.DWo;
import com.bytedance.sdk.component.adexpress.PjT.PjT.PjT;
import com.bytedance.sdk.component.adexpress.cr;
import com.bytedance.sdk.component.adexpress.dynamic.cr.Au;
import com.bytedance.sdk.component.utils.Lrd;

public class fDm extends cz {
    public fDm(Context context0, DynamicRootView dynamicRootView0, Au au0) {
        super(context0, dynamicRootView0, au0);
        ImageView imageView0 = new ImageView(context0);
        this.qla = imageView0;
        imageView0.setTag(this.getClickArea());
        if(cr.Zh()) {
            this.Au = Math.max(dynamicRootView0.getLogoUnionHeight(), this.Au);
        }
        this.addView(this.qla, this.getWidgetLayoutParams());
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.cz
    public boolean SM() {
        super.SM();
        if(cr.Zh()) {
            ((ImageView)this.qla).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        }
        if(this.fDm == null || this.fDm.getRenderRequest() == null || TextUtils.isEmpty(this.fDm.getRenderRequest().yIW())) {
            this.setVisibility(8);
        }
        else {
            String s = this.fDm.getRenderRequest().yIW();
            if(s.equals("logo")) {
                ((ImageView)this.qla).setImageResource(Lrd.cr(this.getContext(), "tt_ad_logo"));
            }
            else {
                DWo dWo0 = PjT.PjT().JQp().PjT(s).PjT(this.XX).Zh(this.Au).cr(this.XX).JQp(this.Au);
                String s1 = this.fDm.getRenderRequest().fDm();
                if(!TextUtils.isEmpty(s1)) {
                    dWo0.Zh(s1);
                }
                dWo0.PjT(((ImageView)this.qla));
            }
        }
        ((ImageView)this.qla).setColorFilter(this.xf.XX(), PorterDuff.Mode.SRC_IN);
        return true;
    }
}

