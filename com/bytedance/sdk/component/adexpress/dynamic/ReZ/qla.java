package com.bytedance.sdk.component.adexpress.dynamic.ReZ;

import android.content.Context;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.sdk.component.adexpress.cz.ltE;
import com.bytedance.sdk.component.adexpress.dynamic.cz.PjT;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JQp;
import org.json.JSONObject;

public class qla implements XX {
    private int Au;
    private String JQp;
    private ltE PjT;
    private JQp ReZ;
    private JSONObject SM;
    private int XX;
    private Context Zh;
    private com.bytedance.sdk.component.adexpress.dynamic.cr.XX cr;
    private int cz;

    public qla(Context context0, JQp jQp0, com.bytedance.sdk.component.adexpress.dynamic.cr.XX xX0, String s, int v, int v1, int v2, JSONObject jSONObject0) {
        this.Zh = context0;
        this.ReZ = jQp0;
        this.cr = xX0;
        this.JQp = s;
        this.cz = v;
        this.XX = v1;
        this.Au = v2;
        this.SM = jSONObject0;
        this.JQp();
    }

    private void JQp() {
        PjT pjT0 = this.ReZ.getDynamicClickListener();
        try {
            new JSONObject().put("convertActionType", 1);
        }
        catch(Throwable unused_ex) {
        }
        if("16".equals(this.JQp)) {
            ltE ltE0 = new ltE(this.Zh, com.bytedance.sdk.component.adexpress.ReZ.PjT.Au(this.Zh), this.cz, this.XX, this.Au, this.SM);
            this.PjT = ltE0;
            if(ltE0.getShakeLayout() != null) {
                this.PjT.getShakeLayout().setOnClickListener(((View.OnClickListener)pjT0));
            }
        }
        else {
            this.PjT = new ltE(this.Zh, com.bytedance.sdk.component.adexpress.ReZ.PjT.XX(this.Zh), this.cz, this.XX, this.Au, this.SM);
        }
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
        this.PjT.setGravity(17);
        frameLayout$LayoutParams0.gravity = 17;
        this.PjT.setLayoutParams(frameLayout$LayoutParams0);
        this.PjT.setTranslationY(com.bytedance.sdk.component.adexpress.cr.XX.PjT(this.Zh, ((float)this.cr.wKV())));
        this.PjT.setShakeText(this.cr.cI());
        this.PjT.setClipChildren(false);
        this.PjT.setOnShakeViewListener(new com.bytedance.sdk.component.adexpress.cz.ltE.PjT() {
            final qla Zh;

        });
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.ReZ.XX
    public void PjT() {
        this.PjT.PjT();
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.ReZ.XX
    public ViewGroup ReZ() {
        return this.cr();
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.ReZ.XX
    public void Zh() {
        this.PjT.clearAnimation();
    }

    public ltE cr() {
        return this.PjT;
    }
}

