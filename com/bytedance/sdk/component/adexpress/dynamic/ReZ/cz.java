package com.bytedance.sdk.component.adexpress.dynamic.ReZ;

import android.content.Context;
import android.view.View.OnClickListener;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.sdk.component.adexpress.cr;
import com.bytedance.sdk.component.adexpress.cz.Owx;
import com.bytedance.sdk.component.adexpress.cz.Sks;
import com.bytedance.sdk.component.adexpress.cz.ltE.PjT;
import com.bytedance.sdk.component.adexpress.dynamic.cr.XX;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JQp;
import org.json.JSONObject;

public class cz extends ub {
    public cz(Context context0, JQp jQp0, XX xX0, int v, int v1, int v2, JSONObject jSONObject0) {
        super(context0, jQp0, xX0);
        this.Zh = context0;
        this.cr = xX0;
        this.ReZ = jQp0;
        this.PjT(v, v1, v2, jSONObject0, xX0);
    }

    private void PjT(int v, int v1, int v2, JSONObject jSONObject0, XX xX0) {
        int v3;
        this.PjT = new com.bytedance.sdk.component.adexpress.cz.cz(this.Zh, v, v1, v2, jSONObject0);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, ((int)com.bytedance.sdk.component.adexpress.cr.XX.PjT(this.Zh, 300.0f)));
        frameLayout$LayoutParams0.gravity = 81;
        Context context0 = this.Zh;
        if(xX0.xH() > 0) {
            v3 = xX0.xH();
        }
        else {
            v3 = cr.Zh() ? 0 : 120;
        }
        frameLayout$LayoutParams0.bottomMargin = (int)com.bytedance.sdk.component.adexpress.cr.XX.PjT(context0, ((float)v3));
        this.PjT.setLayoutParams(frameLayout$LayoutParams0);
        this.PjT.setClipChildren(false);
        this.PjT.setSlideText(this.cr.cI());
        Sks sks0 = this.PjT;
        if(sks0 instanceof com.bytedance.sdk.component.adexpress.cz.cz) {
            ((com.bytedance.sdk.component.adexpress.cz.cz)sks0).setShakeText(this.cr.HG());
            Owx owx0 = ((com.bytedance.sdk.component.adexpress.cz.cz)this.PjT).getShakeView();
            if(owx0 != null) {
                owx0.setOnShakeViewListener(new PjT() {
                    final cz Zh;

                });
                owx0.setOnClickListener(((View.OnClickListener)this.ReZ.getDynamicClickListener()));
            }
        }
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.ReZ.ub
    protected void cr() {
    }
}

