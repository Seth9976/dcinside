package com.bytedance.adsdk.ugeno.cz.PjT;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import com.bytedance.adsdk.ugeno.XX.Au;
import com.bytedance.adsdk.ugeno.cz.cr;
import java.util.ArrayList;
import java.util.List;

public class PjT extends LinearLayout {
    private boolean Au;
    private int JQp;
    private List PjT;
    private int ReZ;
    private int SM;
    private int XX;
    private int Zh;
    private Context cr;
    private int cz;

    public PjT(Context context0) {
        super(context0);
        this.Zh = 0xFFFF0000;
        this.ReZ = 0xFF0000FF;
        this.JQp = 5;
        this.cz = 20;
        this.XX = 20;
        this.cr = context0;
        this.PjT = new ArrayList();
        this.PjT();
    }

    public void PjT() {
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -2);
        frameLayout$LayoutParams0.gravity = 80;
        this.setGravity(17);
        this.setOrientation(0);
        frameLayout$LayoutParams0.bottomMargin = (int)Au.PjT(this.cr, 10.0f);
        this.setLayoutParams(frameLayout$LayoutParams0);
    }

    public void PjT(int v) {
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(this.cz, this.XX);
        linearLayout$LayoutParams0.leftMargin = this.JQp;
        linearLayout$LayoutParams0.rightMargin = this.JQp;
        LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(this.cz, this.XX);
        linearLayout$LayoutParams1.leftMargin = this.JQp;
        linearLayout$LayoutParams1.rightMargin = this.JQp;
        int v1 = cr.PjT(this.Au, this.SM, this.PjT.size());
        int v2 = cr.PjT(this.Au, v, this.PjT.size());
        if(this.PjT.size() == 0) {
            v2 = 0;
        }
        if(!this.PjT.isEmpty() && cr.PjT(v1, this.PjT) && cr.PjT(v2, this.PjT)) {
            ((View)this.PjT.get(v1)).setBackground(this.Zh(this.ReZ));
            ((View)this.PjT.get(v1)).setLayoutParams(linearLayout$LayoutParams1);
            ((View)this.PjT.get(v2)).setBackground(this.Zh(this.Zh));
            ((View)this.PjT.get(v2)).setLayoutParams(linearLayout$LayoutParams0);
            this.SM = v;
        }
    }

    public void PjT(int v, int v1) {
        for(Object object0: this.PjT) {
            ((View)object0).setBackground(this.Zh(this.ReZ));
        }
        if(v < 0 || v >= this.PjT.size()) {
            v = 0;
        }
        if(this.PjT.size() > 0) {
            ((View)this.PjT.get(v)).setBackground(this.Zh(this.Zh));
            this.SM = v1;
        }
    }

    private GradientDrawable Zh(int v) {
        GradientDrawable gradientDrawable0 = new GradientDrawable();
        gradientDrawable0.setShape(1);
        gradientDrawable0.setColor(v);
        return gradientDrawable0;
    }

    public void Zh() {
        View view0 = new View(this.getContext());
        view0.setClickable(false);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(this.cz, this.XX);
        linearLayout$LayoutParams0.leftMargin = this.JQp;
        linearLayout$LayoutParams0.rightMargin = this.JQp;
        this.addView(view0, linearLayout$LayoutParams0);
        view0.setBackground(this.Zh(this.ReZ));
        this.PjT.add(view0);
    }

    public int getSize() {
        return this.PjT.size();
    }

    public void setLoop(boolean z) {
        this.Au = z;
    }

    public void setSelectedColor(int v) {
        this.Zh = v;
    }

    public void setUnSelectedColor(int v) {
        this.ReZ = v;
    }
}

