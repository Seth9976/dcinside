package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView.ScaleType;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.openadsdk.core.JQp.cr;
import com.bytedance.sdk.openadsdk.utils.qZS;

public class cz extends cr {
    private float PjT;
    private int Zh;

    public cz(Context context0) {
        super(context0);
        this.PjT = 2.25f;
        this.Zh = 12;
        this.PjT();
    }

    public cz(Context context0, int v, float f) {
        super(context0);
        this.PjT = f;
        this.Zh = v;
        this.PjT();
    }

    public static cr PjT(Context context0) {
        return new cz(context0);
    }

    private void PjT() {
        this.setBackground(com.bytedance.sdk.openadsdk.core.widget.cr.PjT());
        this.setImageResource(Lrd.cr(this.getContext(), "tt_close_btn"));
        int v = qZS.Zh(this.getContext(), this.PjT);
        this.setPadding(v, v, v, v);
        this.setScaleType(ImageView.ScaleType.FIT_XY);
    }

    public static cr Zh(Context context0) {
        return new cz(context0, 28, 5.0f);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.JQp.cr
    public void setLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(viewGroup$LayoutParams0 != null) {
            int v = qZS.Zh(this.getContext(), ((float)this.Zh));
            viewGroup$LayoutParams0.width = v;
            viewGroup$LayoutParams0.height = v;
        }
        super.setLayoutParams(viewGroup$LayoutParams0);
    }
}

