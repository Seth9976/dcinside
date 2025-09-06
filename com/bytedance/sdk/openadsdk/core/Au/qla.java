package com.bytedance.sdk.openadsdk.core.Au;

import android.content.Context;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.xf.Zh.ReZ;
import com.bytedance.sdk.openadsdk.core.xf.Zh.cz;
import com.bytedance.sdk.openadsdk.cr.XX;
import com.bytedance.sdk.openadsdk.gK.Zh;
import com.bytedance.sdk.openadsdk.utils.qZS;
import x.b;
import x.c;

public class qla extends cz implements View.OnClickListener {
    private boolean xE;

    public qla(@NonNull Context context0, @NonNull Owx owx0, String s, XX xX0) {
        super(context0, owx0, false, s, false, false, xX0);
        this.xE = false;
        this.setOnClickListener(this);
        this.setNeedNativeVideoPlayBtnVisible(false);
    }

    protected void JQp() {
        this.XX();
        qZS.PjT(this.XX, 0);
    }

    public void PjT(int v, int v1) {
        b b0 = this.Zh;
        if(b0 != null) {
            ((ReZ)b0).Zh(v, v1);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.Zh.cz
    protected void PjT(boolean z) {
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.Zh.cz
    protected void ReZ() {
        if(this.xE) {
            super.ReZ();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.Zh.cz
    protected void Zh() {
        if(!this.JQp || !tT.Zh(this.xf)) {
            this.cr = false;
        }
        super.Zh();
    }

    public void cr() {
        ImageView imageView0 = this.DWo;
        if(imageView0 != null) {
            qZS.PjT(imageView0, 8);
        }
    }

    private void gK() {
        this.XX();
        RelativeLayout relativeLayout0 = this.XX;
        if(relativeLayout0 != null) {
            if(relativeLayout0.getVisibility() == 0) {
                return;
            }
            Zh.PjT().PjT(this.PjT.MWx().c(), this.PjT.MWx().o(), this.PjT.MWx().w(), this.Au, this.PjT);
        }
        this.ub();
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        if(this.SM != null && this.SM.getVisibility() == 0) {
            qZS.JQp(this.XX);
        }
        this.ReZ();
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.Zh.cz
    public void onWindowFocusChanged(boolean z) {
        if(this.SM != null && this.SM.getVisibility() == 0) {
            this.gK();
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.xf.Zh.cz
    protected void onWindowVisibilityChanged(int v) {
        if(this.SM != null && this.SM.getVisibility() == 0) {
            this.gK();
            return;
        }
        super.onWindowVisibilityChanged(v);
    }

    public void setCanInterruptVideoPlay(boolean z) {
        this.xE = z;
    }

    public void setShouldCheckNetChange(boolean z) {
        b b0 = this.Zh;
        if(b0 != null) {
            b0.cr(z);
        }
    }

    public void setShowAdInteractionView(boolean z) {
        b b0 = this.Zh;
        if(b0 != null) {
            c c0 = b0.xs();
            if(c0 != null) {
                c0.PjT(z);
            }
        }
    }

    private void ub() {
        qZS.PjT(this.XX, 0);
        qZS.PjT(this.Au, 0);
        qZS.PjT(this.DWo, 8);
    }
}

