package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.openadsdk.core.JQp.JQp;
import com.bytedance.sdk.openadsdk.core.JQp.cr;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.qla;

public class Au extends LinearLayout {
    public Au(Context context0) {
        super(context0);
        this.PjT();
    }

    private static ImageView PjT(Context context0, float f, float f1, float f2, float f3) {
        ImageView imageView0 = new cr(context0);
        imageView0.setClickable(true);
        imageView0.setFocusable(true);
        imageView0.setPadding(qZS.Zh(context0, f2), qZS.Zh(context0, f3), qZS.Zh(context0, f2), qZS.Zh(context0, f3));
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(qZS.Zh(context0, 40.0f), qZS.Zh(context0, 44.0f));
        if(f > 0.0f) {
            linearLayout$LayoutParams0.leftMargin = qZS.Zh(context0, f);
        }
        if(f1 > 0.0f) {
            linearLayout$LayoutParams0.rightMargin = qZS.Zh(context0, f1);
        }
        imageView0.setLayoutParams(linearLayout$LayoutParams0);
        return imageView0;
    }

    private void PjT() {
        Context context0 = this.getContext();
        this.setId(qla.Nv);
        this.setLayoutParams(new ViewGroup.LayoutParams(-1, qZS.Zh(context0, 44.5f)));
        this.setBackgroundColor(-1);
        this.setClickable(true);
        this.setFocusable(true);
        this.setOrientation(1);
        View view0 = new View(context0);
        view0.setBackgroundColor(Color.parseColor("#1F161823"));
        this.addView(view0, new LinearLayout.LayoutParams(-1, qZS.Zh(context0, 0.5f)));
        JQp jQp0 = new JQp(context0);
        jQp0.setOrientation(0);
        this.addView(jQp0, new LinearLayout.LayoutParams(-1, qZS.Zh(context0, 44.0f)));
        ImageView imageView0 = Au.PjT(context0, 16.0f, 0.0f, 14.75f, 12.5f);
        imageView0.setId(qla.dIF);
        imageView0.setImageResource(Lrd.cr(context0, "tt_ad_arrow_backward"));
        jQp0.addView(imageView0);
        View view1 = new View(context0);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(0, 0);
        linearLayout$LayoutParams0.weight = 1.0f;
        jQp0.addView(view1, linearLayout$LayoutParams0);
        ImageView imageView1 = Au.PjT(context0, 8.0f, 0.0f, 14.75f, 12.5f);
        imageView1.setId(qla.hN);
        imageView1.setImageResource(Lrd.cr(context0, "tt_ad_arrow_forward"));
        jQp0.addView(imageView1);
        View view2 = new View(context0);
        LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(0, 0);
        linearLayout$LayoutParams1.weight = 1.0f;
        jQp0.addView(view2, linearLayout$LayoutParams1);
        ImageView imageView2 = Au.PjT(context0, 8.0f, 0.0f, 10.0f, 12.0f);
        imageView2.setId(qla.uQg);
        imageView2.setImageResource(Lrd.cr(context0, "tt_ad_refresh"));
        jQp0.addView(imageView2);
        View view3 = new View(context0);
        LinearLayout.LayoutParams linearLayout$LayoutParams2 = new LinearLayout.LayoutParams(0, 0);
        linearLayout$LayoutParams2.weight = 1.0f;
        jQp0.addView(view3, linearLayout$LayoutParams2);
        ImageView imageView3 = Au.PjT(context0, 0.0f, 16.0f, 9.0f, 11.0f);
        imageView3.setId(qla.RV);
        imageView3.setImageResource(Lrd.cr(context0, "tt_ad_link"));
        jQp0.addView(imageView3);
    }
}

