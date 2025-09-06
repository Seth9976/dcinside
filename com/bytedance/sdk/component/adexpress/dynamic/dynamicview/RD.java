package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.cr;
import com.bytedance.sdk.component.adexpress.dynamic.ReZ;
import com.bytedance.sdk.component.adexpress.dynamic.cr.Au;
import com.bytedance.sdk.component.utils.Lrd;

public class RD extends XX implements ReZ {
    private int Owx;
    private int[] PjT;
    private int Zh;

    public RD(Context context0, DynamicRootView dynamicRootView0, Au au0) {
        super(context0, dynamicRootView0, au0);
        dynamicRootView0.setTimeOutListener(this);
    }

    private void PjT() {
        int v = (int)com.bytedance.sdk.component.adexpress.cr.XX.PjT(this.qj, this.xf.JQp());
        int v1 = this.xf.PjT();
        this.Zh = (this.Au - v) / 2 - v1;
        this.Owx = 0;
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.ReZ
    @SuppressLint({"SetTextI18n"})
    public void PjT(CharSequence charSequence0, boolean z, int v, boolean z1) {
        String s = Lrd.PjT(cr.PjT(), "tt_reward_screen_skip_tx");
        if(v == 0) {
            this.qla.setVisibility(0);
            ((TextView)this.qla).setText("| " + s);
            this.qla.measure(-2, -2);
            this.PjT = new int[]{this.qla.getMeasuredWidth() + 1, this.qla.getMeasuredHeight()};
            this.qla.setLayoutParams(new FrameLayout.LayoutParams(this.PjT[0], this.PjT[1]));
            ((TextView)this.qla).setGravity(17);
            ((TextView)this.qla).setIncludeFontPadding(false);
            this.PjT();
            this.qla.setPadding(this.xf.ReZ(), this.Zh, this.xf.cr(), this.Owx);
        }
        this.requestLayout();
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.XX
    public boolean SM() {
        super.SM();
        ((TextView)this.qla).setText("");
        return true;
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JQp
    public void cz() {
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(this.XX, this.Au);
        frameLayout$LayoutParams0.gravity = 0x800015;
        frameLayout$LayoutParams0.setMarginStart(frameLayout$LayoutParams0.leftMargin);
        frameLayout$LayoutParams0.setMarginEnd(frameLayout$LayoutParams0.rightMargin);
        this.setLayoutParams(frameLayout$LayoutParams0);
    }

    @Override  // android.widget.FrameLayout
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        if(TextUtils.isEmpty(((TextView)this.qla).getText())) {
            this.setMeasuredDimension(0, this.Au);
            return;
        }
        this.setMeasuredDimension(this.XX, this.Au);
    }
}

