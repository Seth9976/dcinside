package com.bytedance.sdk.openadsdk.ReZ;

import android.content.Context;
import android.graphics.Color;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.qZS;

public class XX extends LinearLayout {
    private final FilterWord PjT;
    private final DWo ReZ;
    private Au Zh;

    public XX(Context context0, FilterWord filterWord0, DWo dWo0) {
        super(context0);
        this.setOrientation(1);
        this.PjT = filterWord0;
        this.ReZ = dWo0;
        this.PjT();
    }

    private void PjT() {
        this.ReZ();
        this.Zh();
    }

    private void ReZ() {
        com.bytedance.sdk.openadsdk.core.JQp.Au au0 = new com.bytedance.sdk.openadsdk.core.JQp.Au(this.getContext());
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-2, -2);
        linearLayout$LayoutParams0.bottomMargin = qZS.Zh(this.getContext(), 12.0f);
        linearLayout$LayoutParams0.gravity = 17;
        au0.setGravity(17);
        au0.setText(this.PjT.getName());
        au0.setTextColor(Color.argb(85, 22, 24, 35));
        au0.setTextSize(((float)(this.ReZ.SM() ? 14 : 10)));
        this.addView(au0, linearLayout$LayoutParams0);
    }

    private void Zh() {
        this.Zh = new Au(this.getContext(), this.ReZ);
        new LinearLayout.LayoutParams(-1, -2);
        this.Zh.PjT(this.PjT.getOptions());
        this.addView(this.Zh);
    }
}

