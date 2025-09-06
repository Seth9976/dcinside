package com.bytedance.sdk.component.adexpress.dynamic.ReZ;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.sdk.component.adexpress.cz.Sks;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JQp;

public class ub implements XX {
    protected int JQp;
    protected Sks PjT;
    protected JQp ReZ;
    protected Context Zh;
    protected com.bytedance.sdk.component.adexpress.dynamic.cr.XX cr;

    public ub(Context context0, JQp jQp0, com.bytedance.sdk.component.adexpress.dynamic.cr.XX xX0) {
        this(context0, jQp0, xX0, 0);
    }

    public ub(Context context0, JQp jQp0, com.bytedance.sdk.component.adexpress.dynamic.cr.XX xX0, int v) {
        this.JQp = v;
        this.Zh = context0;
        this.ReZ = jQp0;
        this.cr = xX0;
        this.cr();
    }

    public Sks JQp() {
        return this.PjT;
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.ReZ.XX
    public void PjT() {
        this.PjT.PjT();
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.ReZ.XX
    public ViewGroup ReZ() {
        return this.JQp();
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.ReZ.XX
    public void Zh() {
        this.PjT.Zh();
    }

    protected void cr() {
        this.PjT = new Sks(this.Zh, this.cr.IJ());
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, ((int)com.bytedance.sdk.component.adexpress.cr.XX.PjT(this.Zh, 200.0f)));
        frameLayout$LayoutParams0.gravity = 81;
        frameLayout$LayoutParams0.bottomMargin = (int)com.bytedance.sdk.component.adexpress.cr.XX.PjT(this.Zh, ((float)(100 - this.JQp)));
        this.PjT.setLayoutParams(frameLayout$LayoutParams0);
        try {
            this.PjT.setGuideText(this.cr.cI());
        }
        catch(Throwable unused_ex) {
        }
    }
}

