package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.cr.XX;
import com.bytedance.sdk.component.adexpress.cr.Zh;
import com.bytedance.sdk.component.adexpress.cr;
import com.bytedance.sdk.component.adexpress.dynamic.JQp;
import com.bytedance.sdk.component.adexpress.dynamic.PjT;
import com.bytedance.sdk.component.adexpress.dynamic.cr.Au;

public class Jo extends cz implements JQp {
    boolean Owx;
    TextView PjT;
    FrameLayout Zh;

    public Jo(Context context0, DynamicRootView dynamicRootView0, Au au0) {
        super(context0, dynamicRootView0, au0);
        this.Owx = false;
        View view0 = new View(context0);
        this.qla = view0;
        view0.setTag(this.getClickArea());
        this.PjT = new TextView(context0);
        this.Zh = new FrameLayout(context0);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(((int)XX.PjT(context0, 40.0f)), ((int)XX.PjT(context0, 15.0f)));
        frameLayout$LayoutParams0.gravity = 0x800055;
        frameLayout$LayoutParams0.rightMargin = 20;
        frameLayout$LayoutParams0.bottomMargin = 20;
        this.PjT.setLayoutParams(frameLayout$LayoutParams0);
        GradientDrawable gradientDrawable0 = new GradientDrawable();
        gradientDrawable0.setShape(0);
        gradientDrawable0.setCornerRadius(25.0f);
        gradientDrawable0.setColor(Color.parseColor("#57000000"));
        this.PjT.setBackground(gradientDrawable0);
        this.PjT.setTextSize(10.0f);
        this.PjT.setGravity(17);
        this.PjT.setTextColor(-1);
        this.PjT.setVisibility(8);
        if(cr.Zh()) {
            this.addView(this.Zh, new FrameLayout.LayoutParams(-1, -1));
        }
        this.addView(this.PjT);
        this.addView(this.qla, this.getWidgetLayoutParams());
        if(!cr.Zh()) {
            this.addView(this.Zh, this.getWidgetLayoutParams());
        }
        dynamicRootView0.videoView = this.Zh;
        dynamicRootView0.setVideoListener(this);
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JQp
    public boolean JQp() {
        return true;
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.JQp
    public void PjT() {
        this.PjT.setVisibility(8);
    }

    private void ReZ(View view0) {
        if(view0 == this.PjT) {
            return;
        }
        if(view0 == this.ltE) {
            return;
        }
        try {
            if(((int)(((Integer)view0.getTag(PjT.cz)))) == 1) {
                return;
            }
        }
        catch(Throwable unused_ex) {
        }
        view0.setVisibility(0);
        if(view0 instanceof ViewGroup) {
            for(int v = 0; v < ((ViewGroup)view0).getChildCount(); ++v) {
                this.ReZ(((ViewGroup)view0).getChildAt(v));
            }
        }
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.cz
    public boolean SM() {
        super.SM();
        Au au0 = this.xs;
        double f = 0.0;
        double f1 = 0.0;
        while(au0 != null) {
            f1 = f1 + ((double)au0.cz()) - ((double)au0.cr());
            f = f + ((double)au0.XX()) - ((double)au0.JQp());
            au0 = au0.xf();
        }
        try {
            int v = (int)XX.PjT(this.getContext(), ((float)f1));
            int v1 = (int)XX.PjT(this.getContext(), ((float)f1) + this.JQp);
            if(Zh.PjT(this.getContext())) {
                int v2 = ((gK)this.fDm.getChildAt(0)).getDynamicWidth();
                int v3 = v2 - v1;
                v1 = v2 - v;
                v = v3;
            }
            if("open_ad".equals(this.fDm.getRenderRequest().cr())) {
                this.fDm.videoView = this.Zh;
            }
            else {
                ((gK)this.fDm.getChildAt(0)).PjT.PjT(v, ((int)XX.PjT(this.getContext(), ((float)f))), v1, ((int)XX.PjT(this.getContext(), ((float)f) + this.cz)));
            }
        }
        catch(Exception unused_ex) {
        }
        this.fDm.updateRenderInfoForVideo(f1, f, ((double)this.JQp), ((double)this.cz), this.xf.qla());
        return true;
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.JQp
    public void setTimeUpdate(int v) {
        if(this.xs.DWo().JQp().sjb() && v > 0 && !this.Owx) {
            String s = v < 60 ? "00" : "0" + v / 60;
            this.PjT.setText((v % 60 <= 9 ? s + ":" + "0" + v % 60 : s + ":" + v % 60));
            this.PjT.setVisibility(0);
            return;
        }
        this.Owx = true;
        for(int v1 = 0; v1 < this.getChildCount(); ++v1) {
            this.ReZ(this.getChildAt(v1));
        }
        this.PjT.setVisibility(8);
    }
}

