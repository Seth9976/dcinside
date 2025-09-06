package com.bytedance.sdk.openadsdk.core.DWo.ReZ;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings.LayoutAlgorithm;
import com.bytedance.sdk.component.SM.cz;
import com.bytedance.sdk.component.adexpress.Zh.fDm;
import com.bytedance.sdk.component.adexpress.Zh.qj;
import com.bytedance.sdk.openadsdk.core.Au.PjT.Zh;
import com.bytedance.sdk.openadsdk.core.KM;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.qla;
import com.bytedance.sdk.openadsdk.core.widget.PjT.JQp;
import com.bytedance.sdk.openadsdk.utils.Zd;
import com.bytedance.sdk.openadsdk.utils.gK;
import org.json.JSONObject;

public class cr implements qj, ReZ {
    private String JQp;
    private Context PjT;
    private cz ReZ;
    private int XX;
    private Owx Zh;
    private KM cr;
    private PjT cz;

    public cr(Context context0, Owx owx0) {
        boolean z = true;
        this.PjT = context0;
        this.Zh = owx0;
        this.XX = owx0.jK();
        com.bytedance.sdk.openadsdk.core.model.qla.PjT qla$PjT0 = qla.Zh(this.Zh);
        if(this.XX != 1) {
            z = false;
        }
        this.JQp = qla$PjT0.PjT(z);
    }

    private void Au() {
        KM kM0 = new KM(this.PjT);
        this.cr = kM0;
        kM0.Zh(this.ReZ).PjT(this.Zh).ReZ(this.Zh.dIF()).cr(this.Zh.xR()).JQp(this.Zh.SW()).PjT(Zh.PjT(0.0f, 0.0f, false, this.Zh, null, null)).PjT(this).PjT(this.ReZ);
    }

    public KM JQp() {
        return this.cr;
    }

    private void PjT(cz cz0) {
        if(cz0 == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.core.widget.PjT.ReZ.PjT(this.PjT).PjT(false).PjT(cz0.getWebView());
            cz0.setVerticalScrollBarEnabled(false);
            cz0.setHorizontalScrollBarEnabled(false);
            com.bytedance.sdk.openadsdk.core.widget.PjT.ReZ.PjT(cz0);
            cz0.fDm();
            cz0.setUserAgentString(gK.PjT(cz0.getWebView(), 7104));
            cz0.setMixedContentMode(0);
            cz0.setJavaScriptEnabled(true);
            cz0.setJavaScriptCanOpenWindowsAutomatically(true);
            cz0.setDomStorageEnabled(true);
            cz0.setDatabaseEnabled(true);
            cz0.setAllowFileAccess(false);
            cz0.setSupportZoom(true);
            cz0.setBuiltInZoomControls(true);
            cz0.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            cz0.setUseWideViewPort(true);
            cz0.setCacheMode(-1);
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.DWo.ReZ.ReZ
    public void PjT() {
        this.ReZ = new cz(this.PjT);
        this.XX();
        this.Au();
        Zd.PjT(this.ReZ, false, this.Zh.kW(), new com.bytedance.sdk.openadsdk.utils.Zd.Zh() {
            final cr PjT;

            @Override  // com.bytedance.sdk.openadsdk.utils.Zd$Zh
            public void PjT() {
                cr.this.PjT(true);
            }

            @Override  // com.bytedance.sdk.openadsdk.utils.Zd$Zh
            public void PjT(View view0, boolean z) {
            }

            @Override  // com.bytedance.sdk.openadsdk.utils.Zd$Zh
            public void PjT(boolean z) {
                cr.this.PjT(z);
            }

            @Override  // com.bytedance.sdk.openadsdk.utils.Zd$Zh
            public void Zh() {
                cr.this.PjT(false);
            }
        }, null);
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.qj
    public void PjT(View view0, int v, com.bytedance.sdk.component.adexpress.ReZ reZ0) {
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.qj
    public void PjT(fDm fDm0) {
    }

    @Override  // com.bytedance.sdk.openadsdk.core.DWo.ReZ.ReZ
    public void PjT(com.bytedance.sdk.openadsdk.core.Au.fDm fDm0) {
        KM kM0 = this.cr;
        if(kM0 != null) {
            kM0.PjT(fDm0);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.DWo.ReZ.ReZ
    public void PjT(PjT pjT0) {
        this.cz = pjT0;
    }

    public void PjT(boolean z) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("visibleState", !z);
        }
        catch(Exception exception0) {
            exception0.getMessage();
        }
        this.cr.PjT("visibleStateChange", jSONObject0);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.DWo.ReZ.ReZ
    public void ReZ() {
        KM kM0 = this.cr;
        if(kM0 != null) {
            kM0.ReZ();
        }
        try {
            this.cr = null;
            cz cz0 = this.ReZ;
            if(cz0 != null) {
                ViewGroup viewGroup0 = (ViewGroup)cz0.getParent();
                if(viewGroup0 != null) {
                    viewGroup0.removeView(this.ReZ);
                }
                this.ReZ.xE();
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    private void XX() {
        this.ReZ.setBackgroundColor(0);
        this.ReZ.setBackgroundResource(0x106000D);
        this.ReZ.setVisibility(8);
        this.PjT(this.ReZ);
        if(this.Zh != null) {
            this.ReZ.setWebViewClient(new JQp(this.PjT, this.cr, this.Zh.dIF(), null, false));
        }
        com.bytedance.sdk.component.adexpress.JQp.JQp.PjT().PjT(this.ReZ, this.cr);
        this.ReZ.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.PjT.cr(this.cr));
    }

    @Override  // com.bytedance.sdk.openadsdk.core.DWo.ReZ.ReZ
    public void Zh() {
        if(TextUtils.isEmpty(this.JQp)) {
            this.ReZ.setVisibility(8);
            return;
        }
        this.ReZ.a_(this.JQp);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.DWo.ReZ.ReZ
    public View cr() {
        return this.cz();
    }

    public cz cz() {
        return this.ReZ;
    }
}

