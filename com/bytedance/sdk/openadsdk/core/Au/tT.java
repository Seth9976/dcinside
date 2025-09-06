package com.bytedance.sdk.openadsdk.core.Au;

import android.content.Context;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebView;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.SM.cz;
import com.bytedance.sdk.component.adexpress.JQp.PjT;
import com.bytedance.sdk.component.adexpress.PjT.Zh.Zh;
import com.bytedance.sdk.component.adexpress.Zh.XX;
import com.bytedance.sdk.component.adexpress.Zh.xs;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.utils.SM;
import com.bytedance.sdk.openadsdk.core.KM;
import com.bytedance.sdk.openadsdk.core.fDm;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.RD;
import com.bytedance.sdk.openadsdk.core.qla;
import com.bytedance.sdk.openadsdk.core.widget.PjT.ReZ;
import com.bytedance.sdk.openadsdk.core.widget.PjT.cr;
import com.bytedance.sdk.openadsdk.cr.cr.JQp;
import com.bytedance.sdk.openadsdk.cr.qj;
import com.bytedance.sdk.openadsdk.utils.Jo;
import com.bytedance.sdk.openadsdk.utils.ZX;
import com.bytedance.sdk.openadsdk.utils.gK;
import com.bytedance.sdk.openadsdk.utils.wN;
import j..util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class tT extends PjT {
    private String Au;
    private JSONObject DWo;
    private final Au Owx;
    private final Runnable RD;
    private Owx SM;
    private Context XX;
    com.bytedance.sdk.openadsdk.utils.PjT cz;
    private final Map fDm;
    private volatile int gK;
    private DWo ltE;
    private JQp qj;
    private KM qla;
    private com.bytedance.sdk.openadsdk.core.model.Owx.PjT ub;
    private XX xE;
    private String xf;
    private qj xs;

    public tT(Context context0, xs xs0, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver0, JQp jQp0, Owx owx0) {
        super(context0, xs0, themeStatusBroadcastReceiver0);
        this.fDm = DesugarCollections.synchronizedMap(new HashMap());
        this.gK = 0;
        this.Owx = new Au("webviewrender_template") {
            final tT PjT;

            @Override
            public void run() {
                if(tT.this.JQp.get()) {
                    return;
                }
                if(tT.this.SM instanceof RD && ((RD)tT.this.SM).ELH()) {
                    tT.this.Zh(true);
                }
                JSONObject jSONObject0 = tT.this.qj().ReZ();
                tT.this.DWo = jSONObject0;
                tT.this.PjT(tT.this.DWo);
                if(tT.this.gK == 0) {
                    tT.this.ub();
                }
                fDm.ReZ().post(tT.this.RD);
            }
        };
        this.RD = new Runnable() {
            final tT PjT;

            @Override
            public void run() {
                if(tT.this.JQp.get()) {
                    return;
                }
                if(tT.this.xE != null) {
                    tT.this.xf();
                    tT.this.super.PjT(tT.this.xE);
                }
            }
        };
        if(this.ReZ == null) {
            return;
        }
        this.XX = context0;
        this.Au = xs0.cr();
        this.SM = owx0;
        this.qj = jQp0;
        themeStatusBroadcastReceiver0.PjT(this);
        this.ub();
    }

    @Override  // com.bytedance.sdk.component.adexpress.JQp.PjT
    public void Au() {
        super.Au();
        if(this.qla == null) {
            return;
        }
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("expressShow", true);
            this.qla.PjT("expressShow", jSONObject0);
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // com.bytedance.sdk.component.adexpress.JQp.PjT
    protected void DWo() {
        super.DWo();
        com.bytedance.sdk.openadsdk.utils.PjT pjT0 = this.cz;
        if(pjT0 != null) {
            pjT0.Zh(this);
        }
    }

    public static String PjT(Owx owx0) {
        return owx0 == null || !owx0.tY() ? Zh.cr(null) : Zh.cr("v3");
    }

    private void PjT(cz cz0) {
        if(cz0 == null) {
            return;
        }
        try {
            ReZ.PjT(this.XX).PjT(false).PjT(cz0.getWebView());
            cz0.setVerticalScrollBarEnabled(false);
            cz0.setHorizontalScrollBarEnabled(false);
            ReZ.PjT(cz0);
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
        catch(Exception exception0) {
            com.bytedance.sdk.component.utils.RD.Zh("TTAD.WebViewRender", exception0.toString());
        }
    }

    @Override  // com.bytedance.sdk.component.adexpress.JQp.PjT
    public cz PjT() {
        return this.ReZ;
    }

    @Override  // com.bytedance.sdk.component.adexpress.JQp.PjT
    public void PjT(int v) {
        if(v == this.cr) {
            return;
        }
        this.cr = v;
        this.ReZ(v == 0);
    }

    @Override  // com.bytedance.sdk.component.adexpress.JQp.PjT
    public void PjT(XX xX0) {
        this.xE = xX0;
        Jo.Zh(this.Owx);
    }

    @Override  // com.bytedance.sdk.component.adexpress.JQp.PjT
    public void PjT(com.bytedance.sdk.component.adexpress.Zh.fDm fDm0) {
        super.PjT(fDm0);
        if(!this.Zh) {
            return;
        }
        SM.Zh().postDelayed(new Runnable() {
            final tT PjT;

            @Override
            public void run() {
                WebView webView0 = tT.this.ReZ.getWebView();
                if(webView0 != null) {
                    webView0.resumeTimers();
                }
            }
        }, 2000L);
    }

    private void ReZ(boolean z) {
        if(this.qla != null && this.ReZ != null) {
            try {
                JSONObject jSONObject0 = new JSONObject();
                jSONObject0.put("adVisible", z);
                this.qla.PjT("expressAdShow", jSONObject0);
            }
            catch(Exception unused_ex) {
            }
        }
    }

    @Override  // com.bytedance.sdk.component.adexpress.JQp.PjT
    public int ReZ() {
        return this.SM.ZX();
    }

    @Override  // com.bytedance.sdk.component.adexpress.JQp.PjT
    protected void SM() {
        super.SM();
        com.bytedance.sdk.openadsdk.utils.PjT pjT0 = qla.PjT().JQp();
        this.cz = pjT0;
        pjT0.PjT(this);
    }

    @Override  // com.bytedance.sdk.component.adexpress.JQp.PjT
    public void XX() {
        KM kM0 = this.qla;
        if(kM0 == null) {
            return;
        }
        kM0.PjT("expressWebviewRecycle", null);
    }

    // 去混淆评级： 低(40)
    public static boolean Zh(String s) {
        return "banner_call".equals(s) || "banner_ad".equals(s) || "slide_banner_ad".equals(s) || "banner_ad_landingpage".equals(s);
    }

    public void Zh(int v) {
        if(this.qla == null) {
            return;
        }
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("zoom_type", v);
            this.qla.PjT("expressAdViewWillZoom", jSONObject0);
        }
        catch(JSONException jSONException0) {
            com.bytedance.sdk.component.utils.RD.Zh("TTAD.WebViewRender", jSONException0.getMessage());
        }
    }

    @Override  // com.bytedance.sdk.component.adexpress.JQp.PjT
    public void cr() {
        if(this.JQp.get()) {
            return;
        }
        super.cr();
        KM kM0 = this.qla;
        if(kM0 != null) {
            kM0.ReZ();
            this.qla.xf();
            this.qla = null;
        }
        qj qj0 = this.xs;
        if(qj0 != null) {
            qj0.cr(false);
        }
        fDm.ReZ().removeCallbacks(this.RD);
        this.fDm.clear();
    }

    @Override  // com.bytedance.sdk.component.adexpress.JQp.PjT
    public void cz() {
        if(this.PjT() == null) {
            return;
        }
        try {
            this.PjT().getWebView().resumeTimers();
        }
        catch(Exception unused_ex) {
        }
    }

    public void fDm() {
        if(this.ReZ != null && this.ReZ.getWebView() != null) {
            this.ReZ.setBackgroundColor(0);
            this.ReZ.setBackgroundResource(0x106000D);
            this.PjT(this.ReZ);
            if(this.PjT() != null) {
                this.xs = new qj(this.SM, this.PjT().getWebView()).Zh(false);
            }
            this.xs.PjT(this.qj);
            DWo dWo0 = new DWo(this.XX, this.qla, this.SM, this.xs, this.qj());
            this.ltE = dWo0;
            this.ReZ.setWebViewClient(dWo0);
            this.ReZ.setWebChromeClient(new cr(this.qla, this.xs));
            com.bytedance.sdk.component.adexpress.JQp.JQp.PjT().PjT(this.ReZ, this.qla);
        }
    }

    // 检测为 Lambda 实现
    private void gK() [...]

    @Override  // com.bytedance.sdk.component.adexpress.theme.PjT
    public void onThemeChanged(int v) {
        if(this.qla == null) {
            return;
        }
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("status", v);
        }
        catch(JSONException unused_ex) {
        }
        this.qla.PjT("themeChange", jSONObject0);
    }

    public DWo qla() {
        return this.ltE;
    }

    private void ub() {
        if(this.ReZ.getWebView() != null && Jo.cz()) {
            this.gK();
            return;
        }
        this.gK = 1;
        Jo.PjT(() -> {
            if(tT.this.ReZ == null || tT.this.ReZ.getWebView() == null || tT.this.gK == 2) {
                return;
            }
            tT.this.xf = tT.PjT(tT.this.SM);
            tT.this.ReZ.setDisplayZoomControls(false);
            tT.this.PjT(ZX.PjT(tT.this.xf));
            tT.this.xs();
            KM kM0 = new KM(tT.this.XX);
            tT.this.qla = kM0;
            kM0.cr(true);
            tT.this.fDm();
            tT.this.gK = 2;
        });

        class com.bytedance.sdk.openadsdk.core.Au.tT.3 implements Runnable {
            final tT PjT;

            @Override
            public void run() {
                tT.this.gK();
            }
        }

    }

    public KM xE() {
        return this.qla;
    }

    public void xf() {
        if(this.ReZ != null && this.ReZ.getWebView() != null) {
            KM kM0 = this.qla;
            if(kM0 != null) {
                kM0.Zh(this.ReZ).PjT(this.SM).ReZ(this.SM.dIF()).cr(this.SM.xR()).Zh(wN.PjT(this.Au)).JQp(this.SM.SW()).PjT(this).PjT(this.DWo).PjT(this.ReZ).PjT(this.qj);
            }
        }
    }

    public void xs() {
        if(this.SM != null && this.SM.VY() != null) {
            this.ub = this.SM.VY();
        }
    }
}

