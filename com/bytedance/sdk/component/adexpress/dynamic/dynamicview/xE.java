package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.cr.ReZ;
import com.bytedance.sdk.component.adexpress.cr;
import com.bytedance.sdk.component.adexpress.dynamic.Zh;
import com.bytedance.sdk.component.adexpress.dynamic.cr.Au;
import com.bytedance.sdk.component.utils.Lrd;

public class xE extends cz implements Zh {
    public xE(Context context0, DynamicRootView dynamicRootView0, Au au0) {
        super(context0, dynamicRootView0, au0);
        ImageView imageView0 = new ImageView(context0);
        this.qla = imageView0;
        imageView0.setTag(5);
        this.addView(this.qla, this.getWidgetLayoutParams());
        dynamicRootView0.setMuteListener(this);
        if(dynamicRootView0.getRenderRequest() != null && !dynamicRootView0.getRenderRequest().cRA()) {
            this.qla.setVisibility(8);
            this.setVisibility(8);
        }
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JQp
    public boolean JQp() {
        return true;
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.cz
    public boolean SM() {
        super.SM();
        if(cr.Zh()) {
            ((ImageView)this.qla).setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        else {
            ((ImageView)this.qla).setScaleType(ImageView.ScaleType.CENTER);
        }
        this.setSoundMute(this.fDm.mIsMute);
        if(cr.Zh()) {
            Drawable drawable0 = ReZ.PjT(this.getContext(), this.xf);
            if(drawable0 != null) {
                ((ImageView)this.qla).setBackground(drawable0);
                return true;
            }
        }
        else {
            GradientDrawable gradientDrawable0 = com.bytedance.sdk.component.adexpress.cr.Au.PjT(0, this.xf.Yo(), new int[]{this.Au / 2}, null, null, null);
            ((ImageView)this.qla).setBackgroundDrawable(gradientDrawable0);
        }
        return true;
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.Zh
    public void setSoundMute(boolean z) {
        int v;
        if(!cr.Zh()) {
            v = z ? Lrd.cr(this.getContext(), "tt_mute") : Lrd.cr(this.getContext(), "tt_unmute");
        }
        else if(z) {
            v = Lrd.cr(this.getContext(), "tt_reward_full_mute");
        }
        else {
            v = Lrd.cr(this.getContext(), "tt_reward_full_unmute");
        }
        ((ImageView)this.qla).setImageResource(v);
        if(((ImageView)this.qla).getDrawable() != null) {
            ((ImageView)this.qla).getDrawable().setAutoMirrored(true);
        }
    }
}

