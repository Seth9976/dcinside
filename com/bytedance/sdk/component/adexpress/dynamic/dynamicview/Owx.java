package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.cr;
import com.bytedance.sdk.component.adexpress.dynamic.ReZ;
import com.bytedance.sdk.component.adexpress.dynamic.cr.Au;
import com.bytedance.sdk.component.utils.Lrd;

public class Owx extends XX implements ReZ {
    public Owx(Context context0, DynamicRootView dynamicRootView0, Au au0) {
        super(context0, dynamicRootView0, au0);
        dynamicRootView0.setTimeOutListener(this);
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.ReZ
    public void PjT(CharSequence charSequence0, boolean z, int v, boolean z1) {
        if(v != 0) {
            String s = Lrd.PjT(cr.PjT(), "tt_reward_full_skip_count_down");
            ((TextView)this.qla).setText(" | " + String.format(s, v));
        }
        else if(this.getParent() != null) {
            ((ViewGroup)this.getParent()).removeView(this);
        }
        this.requestLayout();
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JQp
    public void cz() {
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(this.XX, this.Au);
        frameLayout$LayoutParams0.leftMargin = this.SM;
        frameLayout$LayoutParams0.gravity = 16;
        frameLayout$LayoutParams0.setMarginStart(this.SM);
        frameLayout$LayoutParams0.setMarginEnd(frameLayout$LayoutParams0.rightMargin);
        this.setLayoutParams(frameLayout$LayoutParams0);
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.XX
    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override  // android.widget.FrameLayout
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        if(TextUtils.isEmpty(((TextView)this.qla).getText())) {
            this.setMeasuredDimension(0, this.Au);
        }
    }
}

