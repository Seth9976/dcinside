package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.core.JQp.Au;
import com.bytedance.sdk.openadsdk.core.JQp.JQp;
import com.bytedance.sdk.openadsdk.core.widget.xE;
import com.bytedance.sdk.openadsdk.utils.qZS;

public class qj {
    private Au JQp;
    protected View PjT;
    private com.bytedance.sdk.openadsdk.core.widget.Au ReZ;
    protected Context Zh;
    private xE cr;

    public qj(Context context0) {
        this.Zh = context0;
        this.PjT = this.JQp();
    }

    private View JQp() {
        View view0 = new JQp(this.Zh);
        ((JQp)view0).setGravity(1);
        ((LinearLayout)view0).setOrientation(1);
        xE xE0 = new xE(this.Zh);
        this.cr = xE0;
        xE0.setId(0x1F000031);
        int v = qZS.Zh(this.Zh, 64.0f);
        ((ViewGroup)view0).addView(this.cr, new LinearLayout.LayoutParams(v, v));
        Au au0 = new Au(this.Zh);
        this.JQp = au0;
        au0.setId(0x1F000032);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(qZS.Zh(this.Zh, 219.0f), -2);
        linearLayout$LayoutParams0.topMargin = qZS.Zh(this.Zh, 16.0f);
        this.JQp.setLayoutParams(linearLayout$LayoutParams0);
        this.JQp.setEllipsize(TextUtils.TruncateAt.END);
        this.JQp.setGravity(17);
        this.JQp.setMaxWidth(qZS.Zh(this.Zh, 150.0f));
        this.JQp.setMaxLines(2);
        this.JQp.setTextColor(-1);
        this.JQp.setTextSize(1, 16.0f);
        ((ViewGroup)view0).addView(this.JQp);
        this.ReZ = new com.bytedance.sdk.openadsdk.core.widget.Au(this.Zh);
        LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(qZS.Zh(this.Zh, 219.0f), qZS.Zh(this.Zh, 6.0f));
        linearLayout$LayoutParams1.topMargin = qZS.Zh(this.Zh, 32.0f);
        ((ViewGroup)view0).addView(this.ReZ, linearLayout$LayoutParams1);
        return view0;
    }

    public View PjT() {
        return this.PjT;
    }

    public void PjT(int v) {
        this.ReZ.setProgress(v);
    }

    public Au ReZ() {
        return this.JQp;
    }

    public xE Zh() {
        return this.cr;
    }

    public void cr() {
        this.PjT = null;
        this.Zh = null;
    }
}

