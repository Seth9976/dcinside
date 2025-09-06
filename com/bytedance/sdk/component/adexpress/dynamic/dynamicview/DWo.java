package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils.TruncateAt;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.cr.ReZ;
import com.bytedance.sdk.component.adexpress.cr.XX;
import com.bytedance.sdk.component.adexpress.cr;
import com.bytedance.sdk.component.adexpress.dynamic.cr.Au;
import com.bytedance.sdk.component.utils.Lrd;

public class DWo extends cz {
    public DWo(Context context0, DynamicRootView dynamicRootView0, Au au0) {
        super(context0, dynamicRootView0, au0);
        if(cr.Zh()) {
            ImageView imageView0 = new ImageView(context0);
            this.qla = imageView0;
            imageView0.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.XX = this.Au;
        }
        else {
            this.qla = new TextView(context0);
        }
        this.qla.setTag(3);
        this.addView(this.qla, this.getWidgetLayoutParams());
        dynamicRootView0.setDislikeView(this.qla);
        if(dynamicRootView0.getRenderRequest() != null && (!dynamicRootView0.getRenderRequest().Au() || !dynamicRootView0.getRenderRequest().cRA())) {
            this.qla.setVisibility(8);
            this.setVisibility(8);
        }
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.cz
    public boolean SM() {
        super.SM();
        if(cr.Zh()) {
            Drawable drawable0 = ReZ.PjT(this.getContext(), this.xf);
            if(drawable0 != null) {
                ((ImageView)this.qla).setBackground(drawable0);
            }
            ((ImageView)this.qla).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int v = Lrd.cr(this.getContext(), "tt_reward_full_feedback");
            if(v > 0) {
                ((ImageView)this.qla).setImageResource(v);
            }
            return true;
        }
        ((TextView)this.qla).setText(this.getText());
        this.qla.setTextAlignment(this.xf.Au());
        ((TextView)this.qla).setTextColor(this.xf.XX());
        ((TextView)this.qla).setTextSize(this.xf.JQp());
        this.qla.setBackground(this.getBackgroundDrawable());
        if(this.xf.Sks()) {
            int v1 = this.xf.tT();
            if(v1 > 0) {
                ((TextView)this.qla).setLines(v1);
                ((TextView)this.qla).setEllipsize(TextUtils.TruncateAt.END);
            }
        }
        else {
            ((TextView)this.qla).setMaxLines(1);
            ((TextView)this.qla).setGravity(17);
            ((TextView)this.qla).setEllipsize(TextUtils.TruncateAt.END);
        }
        this.qla.setPadding(((int)XX.PjT(cr.PjT(), ((float)this.xf.ReZ()))), ((int)XX.PjT(cr.PjT(), ((float)this.xf.Zh()))), ((int)XX.PjT(cr.PjT(), ((float)this.xf.cr()))), ((int)XX.PjT(cr.PjT(), ((float)this.xf.PjT()))));
        ((TextView)this.qla).setGravity(17);
        return true;
    }

    public String getText() {
        return Lrd.PjT(cr.PjT(), "tt_reward_feedback");
    }
}

