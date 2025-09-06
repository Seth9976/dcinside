package com.bytedance.sdk.openadsdk.core.Au;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.JQp.ReZ;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.fDm;
import com.bytedance.sdk.openadsdk.core.model.gK;
import com.bytedance.sdk.openadsdk.gK.Zh;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.qla;

public class xE extends PjT {
    private FrameLayout PjT;
    private FrameLayout fDm;
    private ltE xs;

    public xE(@NonNull Context context0) {
        super(context0);
        this.Zh = context0;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.PjT
    protected void PjT(View view0, int v, fDm fDm0) {
        ltE ltE0 = this.xs;
        if(ltE0 != null) {
            ltE0.PjT(view0, v, fDm0);
        }
    }

    public void PjT(Owx owx0, ltE ltE0, ViewGroup viewGroup0) {
        if(owx0 == null) {
            return;
        }
        this.setBackgroundColor(-1);
        this.ReZ = owx0;
        this.xs = ltE0;
        this.cz = owx0.XWz() == 7 ? "rewarded_video" : "fullscreen_interstitial_ad";
        this.Zh();
        if(gK.ReZ(owx0)) {
            this.xs.addView(this, new ViewGroup.LayoutParams(-1, -1));
        }
        else {
            this.xs.addView(this, new ViewGroup.LayoutParams(-2, -2));
        }
        int v = qla.WAt;
        View view0 = viewGroup0.findViewById(v);
        if(view0 != null) {
            Object object0 = view0.getTag(v);
            if(object0 instanceof String && !TextUtils.isEmpty(((String)object0))) {
                Zh.PjT().PjT(((String)object0), view0);
            }
        }
    }

    private void ReZ() {
        ReZ reZ0 = new ReZ(this.Zh);
        this.PjT = reZ0;
        this.addView(reZ0, new FrameLayout.LayoutParams(-1, -1));
        ReZ reZ1 = new ReZ(this.Zh);
        this.fDm = reZ1;
        this.PjT.addView(reZ1, new FrameLayout.LayoutParams(-1, -1));
        this.fDm.removeAllViews();
    }

    private void Zh() {
        this.XX = qZS.Zh(this.Zh, ((float)this.xs.getExpectExpressWidth()));
        this.Au = qZS.Zh(this.Zh, ((float)this.xs.getExpectExpressWidth()));
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getLayoutParams();
        if(viewGroup$LayoutParams0 == null) {
            viewGroup$LayoutParams0 = new ViewGroup.LayoutParams(this.XX, this.Au);
        }
        viewGroup$LayoutParams0.width = this.XX;
        viewGroup$LayoutParams0.height = this.Au;
        if(viewGroup$LayoutParams0 instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams)viewGroup$LayoutParams0).gravity = 17;
        }
        this.setLayoutParams(viewGroup$LayoutParams0);
        this.ReZ.qZS();
        this.ReZ();
    }

    public View getBackupContainerBackgroundView() {
        return this.PjT;
    }

    public FrameLayout getVideoContainer() {
        return this.fDm;
    }
}

