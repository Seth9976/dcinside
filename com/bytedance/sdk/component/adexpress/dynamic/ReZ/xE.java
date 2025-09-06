package com.bytedance.sdk.component.adexpress.dynamic.ReZ;

import android.content.Context;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.sdk.component.adexpress.cz.RD;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JQp;

public class xE implements XX {
    private RD PjT;
    private JQp ReZ;
    private Context Zh;
    private com.bytedance.sdk.component.adexpress.dynamic.cr.XX cr;

    public xE(Context context0, JQp jQp0, com.bytedance.sdk.component.adexpress.dynamic.cr.XX xX0) {
        this.Zh = context0;
        this.ReZ = jQp0;
        this.cr = xX0;
        this.cr();
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.ReZ.XX
    public void PjT() {
        RD rD0 = this.PjT;
        if(rD0 != null) {
            rD0.PjT();
        }
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.ReZ.XX
    public ViewGroup ReZ() {
        return this.PjT;
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.ReZ.XX
    public void Zh() {
        RD rD0 = this.PjT;
        if(rD0 != null) {
            rD0.Zh();
        }
    }

    private void cr() {
        this.PjT = new RD(this.Zh);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-2, ((int)com.bytedance.sdk.component.adexpress.cr.XX.PjT(this.Zh, 120.0f)));
        frameLayout$LayoutParams0.gravity = 17;
        this.PjT.setLayoutParams(frameLayout$LayoutParams0);
        this.PjT.setClipChildren(false);
        this.PjT.setGuideText(this.cr.cI());
        JQp jQp0 = this.ReZ;
        if(jQp0 != null) {
            this.PjT.setOnClickListener(((View.OnClickListener)jQp0.getDynamicClickListener()));
        }
    }
}

