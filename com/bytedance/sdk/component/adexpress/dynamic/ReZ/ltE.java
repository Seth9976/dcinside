package com.bytedance.sdk.component.adexpress.dynamic.ReZ;

import android.content.Context;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.sdk.component.adexpress.cz.yIW;
import com.bytedance.sdk.component.adexpress.dynamic.cr.DWo;
import com.bytedance.sdk.component.adexpress.dynamic.cz.PjT;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JQp;
import com.bytedance.sdk.component.utils.Lrd;
import org.json.JSONObject;

public class ltE implements XX {
    private String JQp;
    private yIW PjT;
    private JQp ReZ;
    private Context Zh;
    private com.bytedance.sdk.component.adexpress.dynamic.cr.XX cr;
    private DWo cz;

    public ltE(Context context0, JQp jQp0, com.bytedance.sdk.component.adexpress.dynamic.cr.XX xX0, String s, DWo dWo0) {
        this.Zh = context0;
        this.ReZ = jQp0;
        this.cr = xX0;
        this.JQp = s;
        this.cz = dWo0;
        this.JQp();
    }

    private void JQp() {
        int v = this.cr.xH();
        PjT pjT0 = this.ReZ.getDynamicClickListener();
        try {
            new JSONObject().put("convertActionType", 2);
        }
        catch(Throwable unused_ex) {
        }
        if("18".equals(this.JQp)) {
            yIW yIW0 = new yIW(this.Zh, com.bytedance.sdk.component.adexpress.ReZ.PjT.SM(this.Zh), this.cz);
            this.PjT = yIW0;
            if(yIW0.getWriggleLayout() != null) {
                this.PjT.getWriggleLayout().setOnClickListener(((View.OnClickListener)pjT0));
            }
            if(this.PjT.getTopTextView() != null) {
                if(TextUtils.isEmpty(this.cr.yks())) {
                    this.PjT.getTopTextView().setText(Lrd.Zh(this.Zh, "tt_splash_wriggle_top_text_style_17"));
                }
                else {
                    this.PjT.getTopTextView().setText(this.cr.yks());
                }
            }
        }
        else {
            this.PjT = new yIW(this.Zh, com.bytedance.sdk.component.adexpress.ReZ.PjT.SM(this.Zh), this.cz);
        }
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-2, -2);
        frameLayout$LayoutParams0.gravity = 81;
        this.PjT.setTranslationY(((float)(-((int)com.bytedance.sdk.component.adexpress.cr.XX.PjT(this.Zh, ((float)v))))));
        this.PjT.setLayoutParams(frameLayout$LayoutParams0);
        this.PjT.setShakeText(this.cr.cI());
        this.PjT.setClipChildren(false);
        this.PjT.setOnShakeViewListener(new com.bytedance.sdk.component.adexpress.cz.yIW.PjT() {
            final ltE ReZ;

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

    public yIW cr() {
        return this.PjT;
    }
}

