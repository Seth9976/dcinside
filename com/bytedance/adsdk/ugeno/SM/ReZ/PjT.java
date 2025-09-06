package com.bytedance.adsdk.ugeno.SM.ReZ;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView.ScaleType;
import com.bytedance.adsdk.ugeno.SM.cr.ReZ;

public abstract class PjT extends ReZ {
    private int dDm;

    public PjT(Context context0) {
        super(context0);
        this.dDm = 0xFF000000;
    }

    @Override  // com.bytedance.adsdk.ugeno.SM.cr.ReZ
    public void PjT(String s, String s1) {
        super.PjT(s, s1);
        s.hashCode();
        if(s.equals("textColor")) {
            this.dDm = com.bytedance.adsdk.ugeno.XX.PjT.PjT(s1);
        }
    }

    private String SM(String s) {
        String s1 = this.XX(s);
        return TextUtils.isEmpty(s1) ? "" : "local://" + s1;
    }

    public abstract String XX(String arg1);

    @Override  // com.bytedance.adsdk.ugeno.SM.cr.ReZ
    public void Zh() {
        this.PjT = this.SM(this.PjT);
        super.Zh();
        ((com.bytedance.adsdk.ugeno.SM.cr.PjT)this.JQp).setColorFilter(this.dDm);
        ((com.bytedance.adsdk.ugeno.SM.cr.PjT)this.JQp).setScaleType(ImageView.ScaleType.FIT_CENTER);
    }
}

