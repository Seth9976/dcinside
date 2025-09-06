package com.bytedance.sdk.component.adexpress.dynamic.ReZ;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.cr;
import com.bytedance.sdk.component.adexpress.cz.DWo;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JQp;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.component.utils.Qf;

public class qj implements XX {
    private final DWo PjT;
    private final FrameLayout Zh;

    public qj(Context context0, JQp jQp0, com.bytedance.sdk.component.adexpress.dynamic.cr.XX xX0, String s, String s1) {
        int v;
        DWo dWo0 = new DWo(context0);
        this.PjT = dWo0;
        dWo0.setImageLottieTosPath(s);
        FrameLayout frameLayout0 = new FrameLayout(context0);
        this.Zh = frameLayout0;
        frameLayout0.addView(dWo0, new FrameLayout.LayoutParams(-2, -2));
        double f = xX0.fA();
        double f1 = 1.0;
        if(f == 0.0) {
            f = 1.0;
        }
        double f2 = xX0.zYH();
        if(f2 != 0.0) {
            f1 = f2;
        }
        if("22".equals(s1)) {
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, ((int)com.bytedance.sdk.component.adexpress.cr.XX.PjT(context0, 250.0f)));
            frameLayout$LayoutParams0.gravity = 81;
            frameLayout$LayoutParams0.bottomMargin = (int)com.bytedance.sdk.component.adexpress.cr.XX.PjT(context0, 120.0f);
            frameLayout0.setLayoutParams(frameLayout$LayoutParams0);
            return;
        }
        if("20".equals(s1)) {
            this.PjT(context0, frameLayout0, xX0);
            FrameLayout.LayoutParams frameLayout$LayoutParams1 = new FrameLayout.LayoutParams(-2, -2);
            frameLayout$LayoutParams1.gravity = 81;
            if(xX0.xH() > 0) {
                v = xX0.xH();
            }
            else {
                v = cr.Zh() ? 0 : 120;
            }
            frameLayout$LayoutParams1.bottomMargin = (int)com.bytedance.sdk.component.adexpress.cr.XX.PjT(context0, ((float)v));
            frameLayout0.setLayoutParams(frameLayout$LayoutParams1);
            frameLayout0.setClipChildren(false);
            return;
        }
        FrameLayout.LayoutParams frameLayout$LayoutParams2 = new FrameLayout.LayoutParams(((int)(((double)jQp0.getDynamicWidth()) * 0.32 * f)), ((int)(((double)jQp0.getDynamicWidth()) * 0.32 * f1)));
        frameLayout$LayoutParams2.gravity = 17;
        frameLayout0.setLayoutParams(frameLayout$LayoutParams2);
    }

    private void PjT(Context context0, FrameLayout frameLayout0, com.bytedance.sdk.component.adexpress.dynamic.cr.XX xX0) {
        LinearLayout linearLayout0 = new LinearLayout(context0);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-2, -2);
        frameLayout$LayoutParams0.gravity = 17;
        frameLayout$LayoutParams0.setMargins(0, -Qf.PjT(context0, 5.0f), 0, 0);
        linearLayout0.setLayoutParams(frameLayout$LayoutParams0);
        linearLayout0.setOrientation(1);
        TextView textView0 = new TextView(context0);
        textView0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView0.setText(context0.getString(Lrd.Zh(context0, "tt_splash_brush_mask_title")));
        textView0.setTextColor(-1);
        textView0.setTextSize(2, 20.0f);
        TextView textView1 = new TextView(context0);
        textView1.setId(0x7D06FFF2);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-2, -2);
        linearLayout$LayoutParams0.setMargins(0, Qf.PjT(context0, 5.0f), 0, 0);
        textView1.setLayoutParams(linearLayout$LayoutParams0);
        textView1.setText(context0.getString(Lrd.Zh(context0, "tt_splash_brush_mask_hint")));
        if(xX0 != null && !TextUtils.isEmpty(xX0.cI())) {
            textView1.setText(xX0.cI());
        }
        textView1.setTextColor(-1);
        textView1.setTextSize(2, 14.0f);
        linearLayout0.addView(textView0);
        linearLayout0.addView(textView1);
        frameLayout0.addView(linearLayout0);
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.ReZ.XX
    public void PjT() {
        this.PjT.Au();
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.ReZ.XX
    public ViewGroup ReZ() {
        return this.Zh;
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.ReZ.XX
    public void Zh() {
        this.PjT.cz();
        ViewParent viewParent0 = this.Zh.getParent();
        if(viewParent0 instanceof ViewGroup) {
            ((ViewGroup)viewParent0).removeView(this.Zh);
        }
    }
}

