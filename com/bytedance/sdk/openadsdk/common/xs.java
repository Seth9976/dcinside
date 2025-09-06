package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.SM.cz;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.widget.PjT.cz.PjT;
import com.bytedance.sdk.openadsdk.utils.qla;

public class xs {
    private xE Au;
    private ImageView JQp;
    private final Owx PjT;
    private final Context ReZ;
    private gK XX;
    private RelativeLayout Zh;
    private cz cr;
    private final String cz;

    public xs(Context context0, Owx owx0, String s) {
        this.ReZ = context0;
        this.PjT = owx0;
        this.cz = s;
        this.cz();
    }

    public View JQp() {
        return this.Zh;
    }

    private static RelativeLayout PjT(Context context0) {
        RelativeLayout relativeLayout0 = new RelativeLayout(context0);
        relativeLayout0.setBackgroundColor(-1);
        relativeLayout0.addView(new SM(context0));
        cz cz0 = new cz(context0);
        cz0.setId(qla.tY);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-1, -1);
        relativeLayout$LayoutParams0.addRule(12);
        relativeLayout$LayoutParams0.addRule(3, qla.zYH);
        relativeLayout0.addView(cz0, relativeLayout$LayoutParams0);
        Au au0 = new Au(context0);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(au0.getLayoutParams());
        relativeLayout$LayoutParams1.addRule(12);
        relativeLayout0.addView(au0, relativeLayout$LayoutParams1);
        return relativeLayout0;
    }

    public void PjT() {
        gK gK0 = this.XX;
        if(gK0 != null) {
            gK0.PjT();
        }
        xE xE0 = this.Au;
        if(xE0 != null) {
            xE0.PjT();
        }
    }

    public void PjT(WebView webView0, int v, PjT cz$PjT0) {
        gK gK0 = this.XX;
        if(gK0 != null) {
            gK0.PjT(v);
        }
        xE xE0 = this.Au;
        if(xE0 != null) {
            xE0.PjT(webView0, cz$PjT0);
        }
    }

    public ImageView ReZ() {
        return this.JQp;
    }

    public void Zh() {
        gK gK0 = this.XX;
        if(gK0 != null) {
            gK0.Zh();
        }
        xE xE0 = this.Au;
        if(xE0 != null) {
            xE0.Zh();
        }
    }

    public cz cr() {
        return this.cr;
    }

    private void cz() {
        RelativeLayout relativeLayout0 = xs.PjT(this.ReZ);
        this.Zh = relativeLayout0;
        this.cr = (cz)relativeLayout0.findViewById(qla.tY);
        RelativeLayout relativeLayout1 = (RelativeLayout)this.Zh.findViewById(qla.zYH);
        gK gK0 = new gK(this.ReZ, relativeLayout1, this.PjT);
        this.XX = gK0;
        this.JQp = gK0.ReZ();
        View view0 = this.Zh.findViewById(qla.Nv);
        this.Au = new xE(this.ReZ, ((LinearLayout)view0), this.cr, this.PjT, this.cz);
    }
}

