package com.bytedance.sdk.openadsdk.component.reward.PjT;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.sdk.component.adexpress.dynamic.cr;
import com.bytedance.sdk.openadsdk.component.reward.top.ReZ;
import com.bytedance.sdk.openadsdk.component.reward.top.Zh;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.qla;

public class fDm {
    private boolean JQp;
    ReZ PjT;
    private final Activity ReZ;
    cr Zh;
    private final PjT cr;
    private boolean cz;

    public fDm(PjT pjT0) {
        this.JQp = false;
        this.ReZ = pjT0.rds;
        this.cr = pjT0;
    }

    public void JQp() {
        if(this.cz) {
            return;
        }
        ReZ reZ0 = this.PjT;
        if(reZ0 != null) {
            reZ0.setSkipInvisiable();
        }
    }

    public void JQp(boolean z) {
        if(this.cz) {
            return;
        }
        ReZ reZ0 = this.PjT;
        if(reZ0 != null) {
            reZ0.setSkipEnable(z);
        }
    }

    public void PjT() {
        if(this.JQp) {
            return;
        }
        this.JQp = true;
        PjT pjT0 = this.cr;
        ReZ reZ0 = pjT0.dIF;
        if(reZ0 == null) {
            this.PjT = (ReZ)pjT0.ig.findViewById(qla.DnO);
        }
        else {
            this.PjT = reZ0;
            this.cz = true;
        }
        ReZ reZ1 = this.PjT;
        if(reZ1 != null) {
            reZ1.PjT(this.cr.Zh);
            if(this.cr.Zh.uvo()) {
                this.PjT(false);
                return;
            }
            this.PjT(this.cr.Zh.jp());
        }
    }

    public void PjT(int v) {
        if(this.PjT != null && this.PjT.getITopLayout() != null && v != 0) {
            View view0 = this.PjT.getITopLayout().findViewById(0x1F000011);
            if(view0 != null && view0.getLayoutParams() instanceof ViewGroup.MarginLayoutParams && view0.getWidth() > 0 && view0.getVisibility() == 0) {
                int[] arr_v = new int[2];
                view0.getLocationOnScreen(arr_v);
                int v1 = v - (arr_v[0] + view0.getWidth());
                if(v1 < qZS.Zh(this.ReZ, 16.0f)) {
                    ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
                    viewGroup$MarginLayoutParams0.rightMargin = ((ViewGroup.MarginLayoutParams)view0.getLayoutParams()).rightMargin + (qZS.Zh(this.ReZ, 16.0f) - v1);
                    view0.requestLayout();
                }
            }
        }
    }

    public void PjT(cr cr0) {
        this.Zh = cr0;
    }

    public void PjT(Zh zh0) {
        ReZ reZ0 = this.PjT;
        if(reZ0 != null) {
            reZ0.setListener(zh0);
        }
    }

    public void PjT(CharSequence charSequence0) {
        if(this.cz) {
            return;
        }
        ReZ reZ0 = this.PjT;
        if(reZ0 != null) {
            reZ0.setSkipText(charSequence0);
        }
    }

    public void PjT(String s) {
        ReZ reZ0 = this.PjT;
        if(reZ0 != null) {
            reZ0.clickSound(s);
        }
    }

    public void PjT(String s, CharSequence charSequence0) {
        if(this.cz) {
            return;
        }
        ReZ reZ0 = this.PjT;
        if(reZ0 != null) {
            reZ0.setTime(String.valueOf(s), charSequence0);
        }
    }

    public void PjT(boolean z) {
        if(this.cz) {
            return;
        }
        ReZ reZ0 = this.PjT;
        if(reZ0 != null) {
            reZ0.setShowDislike(z);
        }
    }

    public void ReZ() {
        if(this.cz) {
            return;
        }
        ReZ reZ0 = this.PjT;
        if(reZ0 != null) {
            reZ0.showSkipButton();
        }
    }

    public void ReZ(boolean z) {
        if(this.cz) {
            return;
        }
        ReZ reZ0 = this.PjT;
        if(reZ0 != null) {
            reZ0.setShowSound(z);
        }
    }

    public void Zh() {
        if(this.cz) {
            return;
        }
        ReZ reZ0 = this.PjT;
        if(reZ0 != null) {
            reZ0.showCountDownText();
        }
    }

    public void Zh(boolean z) {
        ReZ reZ0 = this.PjT;
        if(reZ0 != null) {
            reZ0.setSoundMute(z);
        }
        cr cr0 = this.Zh;
        if(cr0 != null) {
            cr0.setSoundMute(z);
        }
    }

    public void cr() {
        ReZ reZ0 = this.PjT;
        if(reZ0 != null) {
            reZ0.clickSkip();
        }
    }

    public void cr(boolean z) {
        if(this.cz) {
            return;
        }
        ReZ reZ0 = this.PjT;
        if(reZ0 != null) {
            reZ0.setShowSkip(z);
        }
    }
}

