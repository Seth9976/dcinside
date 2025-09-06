package com.bytedance.sdk.openadsdk.fDm;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout.LayoutParams;
import com.bytedance.sdk.openadsdk.core.JQp.ReZ;
import com.bytedance.sdk.openadsdk.core.JQp.XX;
import com.bytedance.sdk.openadsdk.core.JQp.cr;
import com.bytedance.sdk.openadsdk.core.JQp.cz;
import com.bytedance.sdk.openadsdk.utils.DWo;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.qla;

public class fDm extends XX {
    public fDm(Context context0) {
        this(context0, null);
    }

    public fDm(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public fDm(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.PjT(context0);
    }

    private void PjT(Context context0) {
        this.setBackgroundColor(Color.parseColor("#000000"));
        this.setId(0x1F00001E);
        int v = qZS.Zh(context0, 60.0f);
        ReZ reZ0 = new ReZ(context0);
        reZ0.setId(qla.QB);
        reZ0.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        reZ0.setBackgroundColor(0);
        this.addView(reZ0);
        cr cr0 = new cr(context0);
        cr0.setId(qla.pBJ);
        cr0.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        cr0.setScaleType(ImageView.ScaleType.CENTER_CROP);
        reZ0.addView(cr0);
        cz cz0 = new cz(context0);
        cz0.setId(qla.sjb);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(v, v);
        frameLayout$LayoutParams0.gravity = 17;
        cz0.setLayoutParams(frameLayout$LayoutParams0);
        cz0.setIndeterminateDrawable(DWo.PjT(context0, "tt_video_loading_progress_bar"));
        reZ0.addView(cz0);
        cr cr1 = new cr(context0);
        cr1.setId(qla.dG);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams0.addRule(13);
        cr1.setLayoutParams(relativeLayout$LayoutParams0);
        cr1.setScaleType(ImageView.ScaleType.CENTER);
        cr1.setImageDrawable(DWo.PjT(context0, "tt_play_movebar_textpage"));
        cr1.setVisibility(8);
        this.addView(cr1);
        xf xf0 = new xf(context0);
        xf0.setId(qla.fU);
        xf0.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.addView(xf0);
    }
}

