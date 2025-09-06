package com.bytedance.sdk.openadsdk.component.reward.Zh;

import android.content.Context;
import android.graphics.Color;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.SM.cz;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.openadsdk.component.reward.PjT.PjT;
import com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.XX;
import com.bytedance.sdk.openadsdk.core.JQp.JQp;
import com.bytedance.sdk.openadsdk.core.JQp.ReZ;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.gK;
import com.bytedance.sdk.openadsdk.core.widget.DWo;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.qla;
import com.bytedance.sdk.openadsdk.utils.xs;

public class cr extends Zh {
    public cr(PjT pjT0) {
        super(pjT0);
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.Zh.Zh
    public RFEndCardBackUpLayout Au() {
        return null;
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.Zh.Zh
    public boolean JQp() {
        return true;
    }

    protected static cz PjT(Context context0, Owx owx0) {
        cz cz0 = com.bytedance.sdk.openadsdk.xs.PjT.PjT().Zh(owx0);
        if(cz0 == null) {
            cz0 = new cz(context0, true);
            cz0.setLayerType(2, null);
        }
        else {
            cz0.setLpPreRender(true);
            ViewGroup viewGroup0 = (ViewGroup)cz0.getParent();
            if(viewGroup0 != null) {
                viewGroup0.removeView(cz0);
            }
        }
        qZS.PjT(cz0, 0);
        cz0.setId(qla.RD);
        cz0.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return cz0;
    }

    static void PjT(FrameLayout frameLayout0, Owx owx0) {
        Context context0 = frameLayout0.getContext();
        JQp jQp0 = new JQp(context0);
        jQp0.setOrientation(1);
        frameLayout0.addView(jQp0, new FrameLayout.LayoutParams(-1, -1));
        ReZ reZ0 = new ReZ(context0);
        reZ0.setId(qla.Co);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, 0);
        linearLayout$LayoutParams0.weight = 1.0f;
        jQp0.addView(reZ0, linearLayout$LayoutParams0);
        ReZ reZ1 = new ReZ(context0);
        reZ1.setId(qla.DWo);
        reZ0.addView(reZ1, new FrameLayout.LayoutParams(-1, -1));
        reZ1.addView(Zh.PjT(context0));
        ReZ reZ2 = new ReZ(context0);
        reZ2.setId(qla.gK);
        reZ2.setVisibility(8);
        reZ2.setBackgroundColor(0xFF000000);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
        frameLayout$LayoutParams0.gravity = 17;
        reZ1.addView(reZ2, frameLayout$LayoutParams0);
        com.bytedance.sdk.openadsdk.core.JQp.cr cr0 = new com.bytedance.sdk.openadsdk.core.JQp.cr(context0);
        cr0.setId(qla.ltE);
        cr0.setScaleType(ImageView.ScaleType.FIT_CENTER);
        reZ2.addView(cr0, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.component.reward.view.cr.PjT(reZ0);
        ReZ reZ3 = new ReZ(context0);
        reZ3.setId(qla.Owx);
        LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-1, 0);
        linearLayout$LayoutParams1.weight = 0.0f;
        jQp0.addView(reZ3, linearLayout$LayoutParams1);
        reZ3.addView(cr.PjT(context0, owx0));
        LinearLayout linearLayout0 = cr.Zh(context0);
        linearLayout0.setBackgroundColor(Color.parseColor("#70161823"));
        reZ3.addView(linearLayout0);
        linearLayout0.addView(cr.ReZ(context0));
        com.bytedance.sdk.openadsdk.component.reward.view.cr.PjT(reZ3, owx0);
    }

    public static void PjT(Owx owx0, FrameLayout frameLayout0, PjT pjT0) {
        if(gK.Zh(owx0)) {
            cr.PjT(frameLayout0, owx0);
            return;
        }
        if(!gK.cr(owx0) && !gK.JQp(owx0)) {
            Zh.PjT(frameLayout0, pjT0);
            return;
        }
        cr.Zh(frameLayout0, owx0);
    }

    // 去混淆评级： 低(30)
    public static boolean PjT(Owx owx0) {
        return gK.Zh(owx0) || gK.cr(owx0) || gK.JQp(owx0);
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.Zh.Zh
    public void PjT(FrameLayout frameLayout0) {
        if(gK.cr(this.PjT.Zh)) {
            PjT pjT0 = this.PjT;
            xs xs0 = pjT0.Xtz;
            if(xs0 != null) {
                xs0.PjT(pjT0.Zh.xs().Zh() * 1000L);
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.Zh.Zh
    public void PjT(XX xX0) {
        cr.PjT(this.Zh, xX0, this.PjT);
    }

    private static ImageView ReZ(Context context0) {
        ImageView imageView0 = new com.bytedance.sdk.openadsdk.core.JQp.cr(context0);
        imageView0.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView0.setImageResource(Lrd.cr(context0, "tt_up_slide"));
        imageView0.setId(qla.tT);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(qZS.Zh(context0, 18.0f), qZS.Zh(context0, 16.0f));
        linearLayout$LayoutParams0.gravity = 17;
        linearLayout$LayoutParams0.topMargin = qZS.Zh(context0, 45.0f);
        imageView0.setLayoutParams(linearLayout$LayoutParams0);
        return imageView0;
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.Zh.Zh
    public void XX() {
    }

    private static LinearLayout Zh(Context context0) {
        LinearLayout linearLayout0 = new JQp(context0);
        linearLayout0.setId(qla.Sks);
        linearLayout0.setOrientation(1);
        linearLayout0.setVisibility(8);
        linearLayout0.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return linearLayout0;
    }

    static void Zh(FrameLayout frameLayout0, Owx owx0) {
        Context context0 = frameLayout0.getContext();
        ReZ reZ0 = new ReZ(context0);
        reZ0.setId(qla.Owx);
        frameLayout0.addView(reZ0, new FrameLayout.LayoutParams(-1, -1));
        reZ0.addView(cr.PjT(context0, owx0));
        LinearLayout linearLayout0 = cr.Zh(context0);
        linearLayout0.setBackgroundColor(Color.parseColor("#99161823"));
        reZ0.addView(linearLayout0);
        linearLayout0.addView(cr.ReZ(context0));
        com.bytedance.sdk.openadsdk.component.reward.view.cr.PjT(reZ0, owx0);
        ReZ reZ1 = new ReZ(context0);
        reZ1.setId(qla.Co);
        frameLayout0.addView(reZ1, new FrameLayout.LayoutParams(-1, -1));
        ReZ reZ2 = new ReZ(context0);
        reZ2.setId(qla.DWo);
        reZ1.addView(reZ2, new FrameLayout.LayoutParams(-1, -1));
        reZ2.addView(Zh.PjT(context0));
        ReZ reZ3 = new ReZ(context0);
        reZ3.setId(qla.gK);
        reZ3.setVisibility(8);
        reZ3.setBackgroundColor(0xFF000000);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
        frameLayout$LayoutParams0.gravity = 17;
        reZ2.addView(reZ3, frameLayout$LayoutParams0);
        com.bytedance.sdk.openadsdk.core.JQp.cr cr0 = new com.bytedance.sdk.openadsdk.core.JQp.cr(context0);
        cr0.setId(qla.ltE);
        cr0.setScaleType(ImageView.ScaleType.FIT_CENTER);
        reZ3.addView(cr0, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.component.reward.view.cr.PjT(reZ1);
        DWo dWo0 = new DWo(context0);
        dWo0.setId(qla.wN);
        dWo0.setClickable(true);
        dWo0.setFocusable(true);
        frameLayout0.addView(dWo0, new FrameLayout.LayoutParams(-1, -1));
    }

    // 去混淆评级： 低(40)
    @Override  // com.bytedance.sdk.openadsdk.component.reward.Zh.Zh
    public boolean cz() {
        return gK.Zh(this.PjT.Zh) ? true : !gK.cr(this.PjT.Zh) && !gK.JQp(this.PjT.Zh);
    }

    @Override  // com.bytedance.sdk.openadsdk.component.reward.Zh.Zh
    public void xs() {
        if(gK.Zh(this.PjT.Zh)) {
            com.bytedance.sdk.openadsdk.component.reward.view.DWo dWo0 = this.PjT.Zd;
            if(dWo0 != null) {
                gK gK0 = dWo0.qla;
                if(gK0 != null) {
                    if(gK0.cr()) {
                        this.PjT.Zd.Zh(0);
                        this.PjT.xE.set(true);
                    }
                    else {
                        this.PjT.ub.set(true);
                        this.PjT(true, false, true, 80);
                    }
                }
            }
        }
        if(gK.cr(this.PjT.Zh) || gK.JQp(this.PjT.Zh)) {
            this.PjT(true, false, true, 70);
        }
    }
}

