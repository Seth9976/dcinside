package com.bytedance.sdk.openadsdk.ReZ;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.JQp.Au;
import com.bytedance.sdk.openadsdk.utils.qZS;
import java.util.ArrayList;
import java.util.List;

public class JQp extends com.bytedance.sdk.openadsdk.core.JQp.JQp implements View.OnClickListener, ReZ {
    private final int Au;
    private final DWo JQp;
    public static FilterWord PjT;
    public static FilterWord ReZ;
    private StateListDrawable XX;
    public static FilterWord Zh;
    public static List cr;
    private FilterWord cz;

    static {
        JQp.PjT = new FilterWord("100:1", "GOOD");
        JQp.Zh = new FilterWord("100:2", "NOT_BAD");
        JQp.ReZ = new FilterWord("100:3", "BAD");
        JQp.cr = new ArrayList(3);
    }

    public JQp(@NonNull Context context0, int v, DWo dWo0) {
        super(context0);
        this.Au = v;
        this.JQp = dWo0;
        if(dWo0 != null) {
            dWo0.PjT(this);
        }
        this.PjT(v);
        this.PjT();
        this.Zh();
        JQp.cr.add(this);
    }

    private void PjT() {
        if(this.XX == null) {
            GradientDrawable gradientDrawable0 = new GradientDrawable();
            gradientDrawable0.setCornerRadius(((float)qZS.Zh(this.getContext(), 12.0f)));
            gradientDrawable0.setColor(Color.parseColor("#F8F8F8"));
            GradientDrawable gradientDrawable1 = new GradientDrawable();
            gradientDrawable1.setStroke(qZS.Zh(this.getContext(), 2.0f), Color.parseColor("#FE2C55"));
            gradientDrawable1.setCornerRadius(((float)qZS.Zh(this.getContext(), 12.0f)));
            gradientDrawable1.setColor(Color.parseColor("#12FE2C55"));
            StateListDrawable stateListDrawable0 = new StateListDrawable();
            this.XX = stateListDrawable0;
            stateListDrawable0.addState(new int[]{0x10100A1}, gradientDrawable1);
            this.XX.addState(new int[0], gradientDrawable0);
        }
        this.setBackground(this.XX);
        this.setSelected(false);
        this.setOrientation(1);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(0, -2);
        linearLayout$LayoutParams0.weight = 1.0f;
        this.setLayoutParams(linearLayout$LayoutParams0);
        this.setOnClickListener(this);
    }

    private void PjT(int v) {
        switch(v) {
            case 1: {
                this.cz = JQp.PjT;
                return;
            }
            case 2: {
                this.cz = JQp.Zh;
                return;
            }
            case 3: {
                this.cz = JQp.ReZ;
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.ReZ.DWo$ReZ
    public void PjT(FilterWord filterWord0) {
        if(filterWord0 != null) {
            FilterWord filterWord1 = this.cz;
            if(filterWord1 != null) {
                this.setSelected(filterWord0.equals(filterWord1));
            }
        }
    }

    private void Zh() {
        Au au0 = new Au(this.getContext());
        au0.setTextSize(((float)(this.JQp.SM() ? 40 : 30)));
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-2, -2);
        linearLayout$LayoutParams0.gravity = 1;
        int v = qZS.Zh(this.getContext(), (this.JQp.SM() ? 8.0f : 4.0f));
        linearLayout$LayoutParams0.setMargins(0, qZS.Zh(this.getContext(), 12.0f), 0, v);
        this.addView(au0, linearLayout$LayoutParams0);
        PjT pjT0 = new PjT(this.getContext());
        pjT0.setTextSize(((float)(this.JQp.SM() ? 17 : 12)));
        pjT0.setTextColor(0xFF000000);
        pjT0.setMaxLines(1);
        pjT0.setSingleLine();
        pjT0.setGravity(17);
        LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-2, -2);
        linearLayout$LayoutParams1.gravity = 1;
        linearLayout$LayoutParams1.setMargins(0, 0, 0, qZS.Zh(this.getContext(), 12.0f));
        this.addView(pjT0, linearLayout$LayoutParams1);
        switch(this.Au) {
            case 1: {
                au0.setText("\uD83D\uDE0D");
                pjT0.setText(Lrd.PjT(this.getContext(), "tt_good"));
                return;
            }
            case 2: {
                pjT0.setText(Lrd.PjT(this.getContext(), "tt_not_bad"));
                au0.setText("\uD83D\uDE10");
                return;
            }
            case 3: {
                pjT0.setText(Lrd.PjT(this.getContext(), "tt_bad"));
                au0.setText("\uD83D\uDE21");
            }
        }
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        if(this.isSelected()) {
            this.JQp.PjT(DWo.PjT);
            return;
        }
        this.JQp.PjT(this.cz);
    }
}

