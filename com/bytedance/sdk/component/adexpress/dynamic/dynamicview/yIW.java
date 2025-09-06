package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.cr.cz;
import com.bytedance.sdk.component.adexpress.cr;
import com.bytedance.sdk.component.adexpress.dynamic.JQp.qj;
import com.bytedance.sdk.component.adexpress.dynamic.ReZ;
import com.bytedance.sdk.component.adexpress.dynamic.cr.Au;
import com.bytedance.sdk.component.utils.Lrd;

public class yIW extends XX implements ReZ {
    private boolean Owx;
    private boolean PjT;
    private boolean Zh;

    public yIW(Context context0, DynamicRootView dynamicRootView0, Au au0) {
        super(context0, dynamicRootView0, au0);
        dynamicRootView0.setTimeOutListener(this);
        if("timedown".equals(au0.DWo().Zh())) {
            dynamicRootView0.setTimedown(this.Au);
        }
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.ReZ
    public void PjT(CharSequence charSequence0, boolean z, int v, boolean z1) {
        String s = "";
        if(!z1 && !this.Owx) {
            try {
                if(Integer.parseInt(((String)charSequence0)) <= 0) {
                    this.setVisibility(8);
                    return;
                }
            }
            catch(Exception unused_ex) {
            }
            this.setVisibility(0);
            if(!z && this.fDm.getRenderRequest().PjT() && cz.Zh(this.fDm.getRenderRequest().cr())) {
                if(cr.Zh()) {
                    ((TextView)this.qla).setText(v + "s");
                }
                else {
                    ((TextView)this.qla).setText(String.format(Lrd.PjT(cr.PjT(), "tt_reward_full_skip"), v));
                }
                this.PjT = true;
                return;
            }
            if(cr.Zh() && !"open_ad".equals(this.fDm.getRenderRequest().cr()) && this.fDm.getRenderRequest().PjT()) {
                this.Owx = true;
                this.setVisibility(8);
                return;
            }
            if("timedown".equals(this.xs.DWo().Zh())) {
                ((TextView)this.qla).setText(charSequence0);
                return;
            }
            ((TextView)this.qla).setText(charSequence0 + "s");
            this.Zh = true;
            if(this.PjT) {
                CharSequence charSequence1 = ((TextView)this.qla).getText();
                if(charSequence1 != null) {
                    s = charSequence1.toString();
                }
                FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(((int)(((float)qj.Zh(s, this.xf.JQp(), true)[0]) + com.bytedance.sdk.component.adexpress.cr.XX.PjT(cr.PjT(), ((float)(this.xf.ReZ() + this.xf.cr()))))), this.Au);
                frameLayout$LayoutParams0.gravity = 0x800015;
                this.qla.setLayoutParams(frameLayout$LayoutParams0);
                this.PjT = false;
                this.requestLayout();
            }
            return;
        }
        ((TextView)this.qla).setText("");
        this.setVisibility(8);
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.XX
    public boolean SM() {
        super.SM();
        if(cz.Zh(this.fDm.getRenderRequest().cr())) {
            this.setVisibility(8);
        }
        if("timedown".equals(this.xs.DWo().Zh())) {
            ((TextView)this.qla).setText(String.valueOf(((int)Double.parseDouble(this.xf.DWo()))));
            return true;
        }
        ((TextView)this.qla).setText(((int)Double.parseDouble(this.xf.DWo())) + "s");
        return true;
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.JQp
    public void cz() {
        if(!TextUtils.equals("skip-with-countdowns-video-countdown", this.xs.DWo().Zh()) && !TextUtils.equals("skip-with-time-countdown", this.xs.DWo().Zh())) {
            super.cz();
            return;
        }
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(this.XX, this.Au);
        frameLayout$LayoutParams0.gravity = 0x800013;
        if(cr.Zh()) {
            frameLayout$LayoutParams0.leftMargin = this.SM;
        }
        frameLayout$LayoutParams0.setMarginStart(frameLayout$LayoutParams0.leftMargin);
        frameLayout$LayoutParams0.setMarginEnd(frameLayout$LayoutParams0.rightMargin);
        this.setLayoutParams(frameLayout$LayoutParams0);
    }

    @Override  // android.widget.FrameLayout
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        if(TextUtils.isEmpty(((TextView)this.qla).getText())) {
            this.setMeasuredDimension(0, this.Au);
        }
    }
}

