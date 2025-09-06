package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.adexpress.cr.ReZ;
import com.bytedance.sdk.component.adexpress.cr.XX;
import com.bytedance.sdk.component.adexpress.cr;
import com.bytedance.sdk.component.adexpress.dynamic.cr.Au;
import com.bytedance.sdk.component.utils.Lrd;

public class SM extends cz {
    public SM(Context context0, @NonNull DynamicRootView dynamicRootView0, @NonNull Au au0) {
        super(context0, dynamicRootView0, au0);
        this.qla = cr.Zh() ? new ImageView(context0) : new com.bytedance.sdk.component.adexpress.cz.SM(context0);
        this.qla.setTag(3);
        this.addView(this.qla, this.getWidgetLayoutParams());
        dynamicRootView0.setDislikeView(this.qla);
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.cz
    public boolean SM() {
        super.SM();
        if(cr.Zh()) {
            Drawable drawable0 = ReZ.PjT(this.getContext(), this.xf);
            if(drawable0 != null) {
                this.qla.setBackground(drawable0);
            }
            int v = Lrd.cr(this.getContext(), "tt_close_btn");
            if(v > 0) {
                ((ImageView)this.qla).setImageResource(v);
            }
            ((ImageView)this.qla).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        }
        int v1 = (int)XX.PjT(this.qj, this.xf.ub());
        View view0 = this.qla;
        if(view0 instanceof com.bytedance.sdk.component.adexpress.cz.SM) {
            ((com.bytedance.sdk.component.adexpress.cz.SM)view0).setRadius(((int)XX.PjT(this.qj, this.xf.qla())));
            ((com.bytedance.sdk.component.adexpress.cz.SM)this.qla).setStrokeWidth(v1);
            ((com.bytedance.sdk.component.adexpress.cz.SM)this.qla).setStrokeColor(this.xf.xE());
            ((com.bytedance.sdk.component.adexpress.cz.SM)this.qla).setBgColor(this.xf.Yo());
            ((com.bytedance.sdk.component.adexpress.cz.SM)this.qla).setDislikeColor(this.xf.XX());
            ((com.bytedance.sdk.component.adexpress.cz.SM)this.qla).setDislikeWidth(((int)XX.PjT(this.qj, 1.0f)));
        }
        return true;
    }
}

