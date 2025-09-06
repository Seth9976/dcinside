package com.bytedance.sdk.openadsdk.core.Au;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.sdk.component.adexpress.PjT.Zh.Zh;
import com.bytedance.sdk.component.adexpress.Zh.xs;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.SM.cr;
import com.bytedance.sdk.openadsdk.core.KM;
import com.bytedance.sdk.openadsdk.core.SM;
import com.bytedance.sdk.openadsdk.core.cr.PjT;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.xE;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.core.widget.PjT.JQp;
import com.bytedance.sdk.openadsdk.cr.qj;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class DWo extends JQp {
    private xs DWo;
    public ArrayList PjT;
    private final Owx Zh;

    public DWo(Context context0, KM kM0, Owx owx0, qj qj0, xs xs0) {
        super(context0, kM0, owx0.dIF(), qj0, false);
        this.PjT = new ArrayList();
        this.Zh = owx0;
        this.DWo = xs0;
    }

    private WebResourceResponse JQp() {
        int v = SM.Zh().SM();
        if(v == 0) {
            return null;
        }
        Resources resources0 = ub.PjT().getResources();
        if(resources0 != null) {
            try {
                InputStream inputStream0 = resources0.openRawResource(v);
                return inputStream0 == null ? null : new WebResourceResponse("image/*", "UTF-8", inputStream0);
            }
            catch(Resources.NotFoundException resources$NotFoundException0) {
                RD.Zh("ExpressClient", resources$NotFoundException0.toString());
            }
        }
        return null;
    }

    private WebResourceResponse JQp(String s) {
        WebResourceResponse webResourceResponse0 = null;
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        InputStream inputStream0 = PjT.PjT().PjT(s);
        if(inputStream0 != null) {
            webResourceResponse0 = new WebResourceResponse("audio/*", "UTF-8", inputStream0);
            this.PjT(webResourceResponse0);
        }
        return webResourceResponse0;
    }

    private WebResourceResponse PjT(String s, String s1) {
        WebResourceResponse webResourceResponse1;
        WebResourceResponse webResourceResponse0 = null;
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        try {
            InputStream inputStream0 = cr.PjT(s, s1);
            if(inputStream0 != null) {
                webResourceResponse1 = new WebResourceResponse("image/*", "utf-8", inputStream0);
                goto label_9;
            }
        }
        catch(Throwable throwable0) {
            RD.PjT("ExpressClient", "get image WebResourceResponse error", throwable0);
        }
        return webResourceResponse0;
        try {
        label_9:
            this.PjT(webResourceResponse1);
            return webResourceResponse1;
        }
        catch(Throwable throwable0) {
            webResourceResponse0 = webResourceResponse1;
        }
        RD.PjT("ExpressClient", "get image WebResourceResponse error", throwable0);
        return webResourceResponse0;
    }

    private com.bytedance.sdk.component.adexpress.PjT.Zh.PjT PjT(WebView webView0, String s) {
        xE xE0 = null;
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        if(!s.equals("local://pag_open_icon_id") && !s.equals("https://pag_open_icon_id/appicon.png")) {
            com.bytedance.sdk.openadsdk.core.model.Owx.PjT owx$PjT0 = this.Zh.VY();
            if(owx$PjT0 != null && !TextUtils.isEmpty(s) && s.equals(owx$PjT0.cr())) {
                com.bytedance.sdk.component.adexpress.PjT.Zh.PjT pjT0 = new com.bytedance.sdk.component.adexpress.PjT.Zh.PjT();
                pjT0.PjT(5);
                WebResourceResponse webResourceResponse0 = this.JQp(s);
                pjT0.PjT(webResourceResponse0);
                PjT.PjT().PjT(webResourceResponse0 != null);
                return pjT0;
            }
            com.bytedance.sdk.component.adexpress.cr.SM.PjT sM$PjT0 = com.bytedance.sdk.component.adexpress.cr.SM.PjT(s);
            if(sM$PjT0 != com.bytedance.sdk.component.adexpress.cr.SM.PjT.cr) {
                for(Object object0: this.Zh.CY()) {
                    xE xE1 = (xE)object0;
                    if(!TextUtils.isEmpty(xE1.PjT()) && !TextUtils.isEmpty(s)) {
                        String s1 = xE1.PjT();
                        if((s.startsWith("https") ? s.replaceFirst("https", "http") : s).equals((s1.startsWith("https") ? s1.replaceFirst("https", "http") : xE1.PjT()))) {
                            xE0 = xE1;
                            break;
                        }
                        if(false) {
                            break;
                        }
                    }
                }
            }
            if(sM$PjT0 != com.bytedance.sdk.component.adexpress.cr.SM.PjT.cr && xE0 == null) {
                return Zh.PjT(s, sM$PjT0, "", this.cr());
            }
            com.bytedance.sdk.component.adexpress.PjT.Zh.PjT pjT1 = new com.bytedance.sdk.component.adexpress.PjT.Zh.PjT();
            pjT1.PjT(5);
            pjT1.PjT(this.PjT(s, com.bytedance.sdk.openadsdk.core.Au.PjT.Zh.PjT(this.Zh, s)));
            return pjT1;
        }
        com.bytedance.sdk.component.adexpress.PjT.Zh.PjT pjT2 = new com.bytedance.sdk.component.adexpress.PjT.Zh.PjT();
        pjT2.PjT(5);
        pjT2.PjT(this.JQp());
        return pjT2;
    }

    private void PjT(long v, long v1, String s, int v2) {
        if(this.cz != null && this.cz.Zh() != null) {
            com.bytedance.sdk.component.adexpress.cr.SM.PjT sM$PjT0 = com.bytedance.sdk.component.adexpress.cr.SM.PjT(s);
            if(sM$PjT0 == com.bytedance.sdk.component.adexpress.cr.SM.PjT.PjT) {
                this.cz.Zh().PjT(s, v, v1, v2);
                return;
            }
            if(sM$PjT0 == com.bytedance.sdk.component.adexpress.cr.SM.PjT.ReZ) {
                this.cz.Zh().Zh(s, v, v1, v2);
            }
        }
    }

    private void PjT(WebResourceResponse webResourceResponse0) {
        if(webResourceResponse0 == null) {
            return;
        }
        HashMap hashMap0 = new HashMap();
        hashMap0.put("Access-Control-Allow-Origin", "*");
        webResourceResponse0.setResponseHeaders(hashMap0);
    }

    public int PjT() {
        for(Object object0: this.PjT) {
            Integer integer0 = (Integer)object0;
            switch(((int)integer0)) {
                case -1: 
                case 2: 
                case 3: {
                    break;
                }
                default: {
                    continue;
                }
            }
            return (int)integer0;
        }
        return TextUtils.isEmpty(this.cr()) ? -1 : 1;
    }

    private String cr() {
        Owx owx0 = this.Zh;
        if(owx0 != null) {
            if(owx0.VY() != null) {
                return this.Zh.VY().xs();
            }
            return this.Zh.xH() == null ? null : "v3";
        }
        return null;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
    public void onPageFinished(WebView webView0, String s) {
        this.XX = false;
        super.onPageFinished(webView0, s);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
    public void onPageStarted(WebView webView0, String s, Bitmap bitmap0) {
        this.Au = false;
        super.onPageStarted(webView0, s, bitmap0);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
    @TargetApi(21)
    public WebResourceResponse shouldInterceptRequest(WebView webView0, WebResourceRequest webResourceRequest0) {
        try {
            return this.shouldInterceptRequest(webView0, webResourceRequest0.getUrl().toString());
        }
        catch(Throwable throwable0) {
            RD.PjT("ExpressClient", "shouldInterceptRequest error1", throwable0);
            return super.shouldInterceptRequest(webView0, webResourceRequest0);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
    public WebResourceResponse shouldInterceptRequest(WebView webView0, String s) {
        com.bytedance.sdk.component.adexpress.PjT.Zh.PjT pjT0;
        try {
            pjT0 = this.PjT(webView0, s);
            this.PjT(System.currentTimeMillis(), System.currentTimeMillis(), s, (pjT0 == null || pjT0.PjT() == null ? 2 : 1));
            if(pjT0 != null && pjT0.Zh() != 5) {
                this.PjT.add(pjT0.Zh());
            }
            return pjT0 != null && pjT0.PjT() != null ? pjT0.PjT() : super.shouldInterceptRequest(webView0, s);
        }
        catch(Throwable throwable0) {
        }
        RD.PjT("ExpressClient", "shouldInterceptRequest error2", throwable0);
        return super.shouldInterceptRequest(webView0, s);
    }
}

