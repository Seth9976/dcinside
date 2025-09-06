package com.bytedance.sdk.openadsdk.core.widget.PjT;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.RequiresApi;
import com.bytedance.sdk.component.SM.cz.PjT;
import com.bytedance.sdk.component.utils.Zh;
import com.bytedance.sdk.component.utils.ltE;
import com.bytedance.sdk.openadsdk.common.cr;
import com.bytedance.sdk.openadsdk.core.KM;
import com.bytedance.sdk.openadsdk.core.model.DWo;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.gK;
import com.bytedance.sdk.openadsdk.cr.ReZ;
import com.bytedance.sdk.openadsdk.cr.qj;
import com.bytedance.sdk.openadsdk.utils.RD;
import com.bytedance.sdk.openadsdk.utils.wN;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;
import org.json.JSONObject;

public class JQp extends PjT {
    protected boolean Au;
    private DWo DWo;
    protected final String JQp;
    private static final HashSet Owx;
    private final boolean PjT;
    protected final KM ReZ;
    protected boolean SM;
    protected boolean XX;
    private String Zh;
    protected final Context cr;
    protected qj cz;
    private String fDm;
    private JSONObject gK;
    private Owx ltE;
    private Map qj;
    private final Stack qla;
    private com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity.PjT ub;
    private boolean xE;
    private boolean xf;
    private cr xs;

    static {
        HashSet hashSet0 = new HashSet();
        JQp.Owx = hashSet0;
        hashSet0.add("png");
        hashSet0.add("ico");
        hashSet0.add("jpg");
        hashSet0.add("gif");
        hashSet0.add("svg");
        hashSet0.add("jpeg");
    }

    public JQp(Context context0, KM kM0, String s, cr cr0, qj qj0, boolean z) {
        this(context0, kM0, s, qj0, z);
        this.xs = cr0;
    }

    public JQp(Context context0, KM kM0, String s, cr cr0, qj qj0, boolean z, boolean z1, com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity.PjT tTCeilingLandingPageActivity$PjT0) {
        this(context0, kM0, s, cr0, qj0, z);
        this.xE = z1;
        this.ub = tTCeilingLandingPageActivity$PjT0;
    }

    public JQp(Context context0, KM kM0, String s, qj qj0, boolean z) {
        this.XX = true;
        this.Au = true;
        this.SM = false;
        this.cr = context0;
        this.ReZ = kM0;
        this.JQp = s;
        this.cz = qj0;
        this.PjT = z;
        this.qla = new Stack();
    }

    private boolean JQp(String s) {
        return gK.Au(this.ltE) ? TextUtils.equals(this.ltE.GP(), s) : false;
    }

    private void PjT(String s, String s1) {
        if((this.JQp(s) || "market".equals(s)) && (this.DWo != null || this.gK != null) && this.Zh(s1)) {
            this.ReZ();
        }
        this.DWo = null;
        this.gK = null;
    }

    private boolean PjT(WebView webView0, String s) {
        if(wN.cr(this.ltE) && this.ltE.qla() != null && webView0 != null) {
            int v = this.ltE.qla().Zh();
            int v1 = this.qla.size();
            if(this.xE) {
                ++v1;
            }
            if(v1 + 1 == v) {
                RD.PjT(this.cr, s, this.ltE, "saLandingPageLinks");
                com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity.PjT tTCeilingLandingPageActivity$PjT0 = this.ub;
                if(tTCeilingLandingPageActivity$PjT0 != null) {
                    tTCeilingLandingPageActivity$PjT0.PjT();
                }
                return true;
            }
        }
        return false;
    }

    public void PjT(DWo dWo0) {
        this.DWo = dWo0;
    }

    public void PjT(Owx owx0) {
        this.ltE = owx0;
    }

    public void PjT(String s) {
        this.Zh = s;
    }

    public void PjT(Map map0) {
        this.qj = map0;
    }

    public void PjT(JSONObject jSONObject0) {
        this.gK = jSONObject0;
    }

    public void ReZ() {
        if(!TextUtils.isEmpty(this.Zh) && gK.XX(this.ltE) && !this.xf) {
            DWo dWo0 = this.DWo;
            if(dWo0 != null) {
                ReZ.PjT("click", this.ltE, dWo0, this.Zh, true, this.qj, 1);
                this.xf = true;
                return;
            }
            JSONObject jSONObject0 = this.gK;
            if(jSONObject0 != null) {
                ReZ.PjT(this.ltE, this.Zh, "click", jSONObject0);
                this.xf = true;
            }
        }
    }

    public boolean ReZ(String s) {
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        try {
            Uri uri0 = Uri.parse(s);
            if("play.google.com".equals(uri0.getHost())) {
                if(gK.Au(this.ltE) && this.gK == null && this.DWo == null) {
                    return true;
                }
                Intent intent0 = new Intent("android.intent.action.VIEW");
                if(!(this.cr instanceof Activity)) {
                    intent0.addFlags(0x10000000);
                }
                intent0.setData(uri0);
                intent0.setPackage("com.android.vending");
                this.cr.startActivity(intent0);
                this.ReZ();
                this.gK = null;
                this.DWo = null;
                return true;
            }
        }
        catch(Throwable unused_ex) {
        }
        return false;
    }

    public qj Zh() {
        return this.cz;
    }

    public boolean Zh(String s) {
        if(this.cr == null) {
            return false;
        }
        boolean z = this.ltE == null || this.ltE.uQg() == null;
        if(com.bytedance.sdk.openadsdk.ltE.PjT.PjT.ReZ.PjT()) {
            Owx owx0 = this.ltE;
            int v = wN.Zh(owx0);
            return com.bytedance.sdk.openadsdk.ltE.PjT.PjT.ReZ.PjT(this.cr, s, owx0, v, null, true) || com.bytedance.sdk.openadsdk.ltE.PjT.PjT.JQp.PjT(this.ltE, "", this.cr, this.Zh, null) || com.bytedance.sdk.openadsdk.ltE.PjT.PjT.JQp.PjT(this.cr, "", "", this.Zh, this.ltE);
        }
        return com.bytedance.sdk.openadsdk.ltE.PjT.PjT.PjT.PjT(s, this.cr, this.Zh, this.ltE, null) || com.bytedance.sdk.openadsdk.ltE.PjT.PjT.PjT.PjT(this.ltE, "", this.cr, this.Zh, null) || com.bytedance.sdk.openadsdk.ltE.PjT.PjT.cr.PjT(this.cr, "", "", this.Zh, this.ltE);
    }

    public static String cr(String s) {
        if(s == null) {
            return null;
        }
        int v = s.lastIndexOf(46);
        if(v >= 0 && v != s.length() - 1) {
            String s1 = s.substring(v);
            if(s1 == null) {
                return null;
            }
            String s2 = s1.toLowerCase(Locale.getDefault());
            return JQp.Owx.contains(s2) ? "image/" + s1 : null;
        }
        return null;
    }

    @Override  // android.webkit.WebViewClient
    public void onLoadResource(WebView webView0, String s) {
        super.onLoadResource(webView0, s);
    }

    @Override  // android.webkit.WebViewClient
    public void onPageFinished(WebView webView0, String s) {
        qj qj0 = this.cz;
        if(qj0 != null) {
            qj0.PjT(webView0, s, this.PjT);
        }
        cr cr0 = this.xs;
        if(cr0 != null) {
            cr0.Zh(webView0, s, this.PjT);
        }
        super.onPageFinished(webView0, s);
    }

    @Override  // android.webkit.WebViewClient
    public void onPageStarted(WebView webView0, String s, Bitmap bitmap0) {
        super.onPageStarted(webView0, s, bitmap0);
        int v = this.ltE == null || !this.ltE.HG() || !com.bytedance.sdk.openadsdk.RD.PjT.PjT("opt_web_index", false) ? -1 : wN.PjT(webView0);
        qj qj0 = this.cz;
        if(qj0 != null) {
            qj0.PjT(webView0, s, bitmap0, this.PjT, v);
        }
        cr cr0 = this.xs;
        if(cr0 != null) {
            cr0.ReZ(webView0, s, this.PjT);
        }
        if(this.PjT && (this.ltE != null && this.ltE.HG() && this.ltE.qla().Zh() >= 2)) {
            if(!TextUtils.isEmpty(s) && !s.equals(this.fDm)) {
                if(this.qla.contains(s)) {
                    while(!s.equals(this.qla.peek())) {
                        this.qla.pop();
                    }
                }
                else {
                    this.qla.push(s);
                }
            }
            this.fDm = s;
        }
        if(this.Au && !this.SM) {
            this.SM = true;
            com.bytedance.sdk.openadsdk.core.widget.PjT.ReZ.PjT(this.cr).PjT(true).Zh(webView0.getSettings().getBuiltInZoomControls()).PjT(webView0);
        }
    }

    @Override  // android.webkit.WebViewClient
    public void onReceivedError(WebView webView0, int v, String s, String s1) {
        super.onReceivedError(webView0, v, s, s1);
        if(Build.VERSION.SDK_INT >= 23) {
            return;
        }
        if(this.cz != null) {
            boolean z = webView0 != null && s1 != null && s1.equals(webView0.getUrl());
            this.cz.PjT(webView0, v, s, s1, JQp.cr(s1), z);
        }
    }

    @Override  // android.webkit.WebViewClient
    @TargetApi(23)
    public void onReceivedError(WebView webView0, WebResourceRequest webResourceRequest0, WebResourceError webResourceError0) {
        super.onReceivedError(webView0, webResourceRequest0, webResourceError0);
        if(Build.VERSION.SDK_INT < 23) {
            return;
        }
        if(this.cz != null && webResourceError0 != null) {
            Uri uri0 = webResourceRequest0.getUrl();
            String s = "";
            String s1 = uri0 == null ? "" : uri0.toString();
            Map map0 = webResourceRequest0.getRequestHeaders();
            if(map0.containsKey("accept")) {
                s = (String)map0.get("accept");
            }
            boolean z = webResourceRequest0.isForMainFrame();
            this.cz.PjT(webView0, webResourceError0.getErrorCode(), String.valueOf(webResourceError0.getDescription()), s1, s, z);
        }
    }

    @Override  // android.webkit.WebViewClient
    @TargetApi(21)
    public void onReceivedHttpError(WebView webView0, WebResourceRequest webResourceRequest0, WebResourceResponse webResourceResponse0) {
        super.onReceivedHttpError(webView0, webResourceRequest0, webResourceResponse0);
        if(this.cz != null && webResourceResponse0 != null) {
            Uri uri0 = webResourceRequest0.getUrl();
            String s = "";
            String s1 = uri0 == null ? "" : uri0.toString();
            Map map0 = webResourceRequest0.getRequestHeaders();
            if(map0.containsKey("accept")) {
                s = (String)map0.get("accept");
            }
            boolean z = webResourceRequest0.isForMainFrame();
            this.cz.PjT(webView0, webResourceResponse0.getStatusCode(), webResourceResponse0.getReasonPhrase(), s1, s, z);
        }
    }

    @Override  // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView0, SslErrorHandler sslErrorHandler0, SslError sslError0) {
        if(sslErrorHandler0 != null) {
            try {
                sslErrorHandler0.cancel();
            }
            catch(Throwable unused_ex) {
            }
        }
        if(this.cz != null) {
            int v = 0;
            String s = "SslError: unknown";
            String s1 = null;
            if(sslError0 != null) {
                try {
                    v = sslError0.getPrimaryError();
                    s = "SslError: " + sslError0;
                    s1 = sslError0.getUrl();
                }
                catch(Throwable unused_ex) {
                }
            }
            this.cz.PjT(webView0, v, s, s1, JQp.cr(s1), true);
        }
    }

    @Override  // com.bytedance.sdk.component.SM.cz$PjT
    public boolean onRenderProcessGone(WebView webView0, RenderProcessGoneDetail renderProcessGoneDetail0) {
        try {
            com.bytedance.sdk.component.adexpress.JQp.JQp.PjT().Zh();
        }
        catch(Exception unused_ex) {
        }
        return super.onRenderProcessGone(webView0, renderProcessGoneDetail0);
    }

    @Override  // android.webkit.WebViewClient
    @RequiresApi(api = 21)
    public WebResourceResponse shouldInterceptRequest(WebView webView0, WebResourceRequest webResourceRequest0) {
        return super.shouldInterceptRequest(webView0, webResourceRequest0);
    }

    @Override  // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView0, String s) {
        qj qj0 = this.cz;
        if(qj0 != null) {
            qj0.Zh(webView0, s, this.PjT);
        }
        cr cr0 = this.xs;
        if(cr0 != null) {
            cr0.PjT(webView0, s);
        }
        return super.shouldInterceptRequest(webView0, s);
    }

    @Override  // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView0, String s) {
        Uri uri0;
        qj qj0 = this.cz;
        if(qj0 != null) {
            qj0.PjT(s, this.PjT);
        }
        cr cr0 = this.xs;
        if(cr0 != null) {
            cr0.PjT(webView0, s, this.PjT);
        }
        if(this.PjT(webView0, s)) {
            return true;
        }
        if(this.ltE != null && this.ltE.XX() == 1 && (com.bytedance.sdk.openadsdk.ltE.PjT.PjT.JQp.PjT(s, this.ltE) || com.bytedance.sdk.openadsdk.ltE.PjT.PjT.JQp.PjT(this.ltE, s)) && com.bytedance.sdk.openadsdk.ltE.PjT.PjT.JQp.Zh(this.ltE, this.cr, true)) {
            return true;
        }
        try {
            uri0 = Uri.parse(s);
            String s1 = uri0.getScheme().toLowerCase();
            if("bytedance".equals(s1)) {
                com.bytedance.sdk.openadsdk.utils.gK.PjT(uri0, this.ReZ);
                return true;
            }
            if(this.ReZ(s)) {
                return true;
            }
            if(!ltE.PjT(s)) {
                if(gK.Au(this.ltE)) {
                    this.PjT(s1, s);
                    return true;
                }
                goto label_22;
            }
            return super.shouldOverrideUrlLoading(webView0, s);
        }
        catch(Throwable unused_ex) {
            return this.ReZ == null || !this.ReZ.JQp() ? super.shouldOverrideUrlLoading(webView0, s) : true;
        }
        try {
        label_22:
            Intent intent0 = new Intent("android.intent.action.VIEW");
            intent0.setData(uri0);
            intent0.addFlags(0x10000000);
            Zh.PjT(this.cr, intent0, null);
        }
        catch(Throwable unused_ex) {
        }
        return true;
    }
}

