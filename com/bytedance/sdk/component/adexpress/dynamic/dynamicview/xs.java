package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.cr.XX;
import com.bytedance.sdk.component.adexpress.cr;
import com.bytedance.sdk.component.adexpress.dynamic.JQp.qj;
import com.bytedance.sdk.component.adexpress.dynamic.cr.Au;
import com.bytedance.sdk.component.utils.Lrd;

public class xs extends cz {
    public xs(Context context0, DynamicRootView dynamicRootView0, Au au0) {
        super(context0, dynamicRootView0, au0);
        TextView textView0 = new TextView(context0);
        this.qla = textView0;
        textView0.setTag(this.getClickArea());
        this.addView(this.qla, this.getWidgetLayoutParams());
    }

    // 去混淆评级： 中等(50)
    private boolean PjT() {
        return cr.Zh() ? false : !TextUtils.isEmpty(this.xf.Zh) && this.xf.Zh.contains("adx:") || qj.Zh();
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.cz
    public boolean SM() {
        super.SM();
        this.qla.setTextAlignment(this.xf.Au());
        ((TextView)this.qla).setTextColor(this.xf.XX());
        ((TextView)this.qla).setTextSize(this.xf.JQp());
        if(cr.Zh()) {
            int v = 0;
            ((TextView)this.qla).setIncludeFontPadding(false);
            ((TextView)this.qla).setTextSize(Math.min(((float)(XX.Zh(cr.PjT(), ((float)this.Au)) - this.xf.Zh() - this.xf.PjT())) - 0.5f, this.xf.JQp()));
            DynamicRootView dynamicRootView0 = this.fDm;
            if(dynamicRootView0 == null) {
                v = 8;
            }
            else {
                com.bytedance.sdk.component.adexpress.Zh.xs xs0 = dynamicRootView0.getRenderRequest();
                if(xs0 == null) {
                    v = 8;
                }
                else {
                    String s = xs0.iZZ();
                    if(TextUtils.isEmpty(s)) {
                        v = 8;
                    }
                    else {
                        ((TextView)this.qla).setText(s);
                    }
                }
            }
            ((TextView)this.qla).setVisibility(v);
            return true;
        }
        if(this.PjT()) {
            if(qj.Zh()) {
                ((TextView)this.qla).setText(qj.PjT());
                return true;
            }
            ((TextView)this.qla).setText(qj.PjT(this.xf.Zh));
            return true;
        }
        ((TextView)this.qla).setText(Lrd.Zh(this.getContext(), "tt_logo_cn"));
        return true;
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JQp
    public void cz() {
        com.bytedance.sdk.component.adexpress.Zh.xs xs0 = this.fDm.getRenderRequest();
        if(xs0 != null && TextUtils.isEmpty(xs0.yIW())) {
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(this.XX, this.Au);
            frameLayout$LayoutParams0.gravity = 17;
            this.setLayoutParams(frameLayout$LayoutParams0);
            return;
        }
        super.cz();
    }
}

