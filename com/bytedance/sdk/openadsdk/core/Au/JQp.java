package com.bytedance.sdk.openadsdk.core.Au;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.SM.cz;
import com.bytedance.sdk.component.utils.SM;
import com.bytedance.sdk.component.utils.ltE;
import com.bytedance.sdk.openadsdk.core.ZX;
import com.bytedance.sdk.openadsdk.core.model.DWo;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.qj;
import com.bytedance.sdk.openadsdk.utils.wN;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

public class JQp extends cz implements ReZ {
    static class PjT extends com.bytedance.sdk.component.SM.cz.PjT {
        public static final Set PjT;
        ReZ Zh;

        static {
            PjT.PjT = new HashSet() {
                {
                    this.add(".jpeg");
                    this.add(".png");
                    this.add(".bmp");
                    this.add(".gif");
                    this.add(".jpg");
                    this.add(".webp");
                }
            };
        }

        public PjT(ReZ reZ$ReZ0) {
            this.Zh = reZ$ReZ0;
        }

        private void PjT(String s) {
            if(TextUtils.isEmpty(s)) {
                return;
            }
            int v = s.lastIndexOf(".");
            if(v > 0 && PjT.PjT.contains(s.substring(v).toLowerCase())) {
                ReZ reZ$ReZ0 = this.Zh;
                if(reZ$ReZ0 != null) {
                    reZ$ReZ0.Zh(s);
                }
            }
        }

        private void PjT(String s, int v, String s1) {
            ReZ reZ$ReZ0 = this.Zh;
            if(reZ$ReZ0 != null) {
                reZ$ReZ0.PjT(106, v);
            }
        }

        @Override  // android.webkit.WebViewClient
        public void onPageFinished(WebView webView0, String s) {
            super.onPageFinished(webView0, s);
            ReZ reZ$ReZ0 = this.Zh;
            if(reZ$ReZ0 != null) {
                reZ$ReZ0.PjT();
            }
        }

        @Override  // android.webkit.WebViewClient
        public void onReceivedError(WebView webView0, int v, String s, String s1) {
            super.onReceivedError(webView0, v, s, s1);
        }

        @Override  // android.webkit.WebViewClient
        public void onReceivedError(WebView webView0, WebResourceRequest webResourceRequest0, WebResourceError webResourceError0) {
            super.onReceivedError(webView0, webResourceRequest0, webResourceError0);
            if(webResourceRequest0 != null && webResourceRequest0.getUrl() != null) {
                this.PjT(webResourceRequest0.getUrl().toString());
            }
        }

        @Override  // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView0, WebResourceRequest webResourceRequest0, WebResourceResponse webResourceResponse0) {
            super.onReceivedHttpError(webView0, webResourceRequest0, webResourceResponse0);
            if(webResourceRequest0 != null && webResourceResponse0 != null && webResourceRequest0.getUrl() != null) {
                if(webResourceRequest0.isForMainFrame()) {
                    this.PjT(webResourceRequest0.getUrl().toString(), webResourceResponse0.getStatusCode(), "");
                }
                this.PjT(webResourceRequest0.getUrl().toString());
            }
        }

        @Override  // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView0, String s) {
            this.Zh.PjT(s);
            return true;
        }
    }

    public static class com.bytedance.sdk.openadsdk.core.Au.JQp.ReZ {
        protected int PjT;
        private com.bytedance.sdk.openadsdk.core.qj.cz Zh;

        com.bytedance.sdk.openadsdk.core.Au.JQp.ReZ() {
            this.PjT = 0;
            this.Zh = com.bytedance.sdk.openadsdk.core.qj.cz.PjT();
        }

        public void PjT() {
            if(this.PjT != 0 && this.PjT != 4) {
                com.bytedance.sdk.openadsdk.core.qj.cz cz0 = this.Zh;
                if(cz0 != null) {
                    cz0.cr();
                }
            }
            this.PjT = 4;
            this.Zh = null;
        }

        public void PjT(@Nullable View view0, @Nullable FriendlyObstructionPurpose friendlyObstructionPurpose0) {
            com.bytedance.sdk.openadsdk.core.qj.cz cz0 = this.Zh;
            if(cz0 != null) {
                cz0.PjT(view0, friendlyObstructionPurpose0);
            }
        }

        public void PjT(WebView webView0) {
            if(webView0 == null) {
                return;
            }
            if(this.PjT == 0) {
                if(this.Zh == null) {
                    this.Zh = com.bytedance.sdk.openadsdk.core.qj.cz.PjT();
                }
                this.Zh.PjT(webView0);
                this.Zh.Zh();
                this.PjT = 1;
            }
        }

        public void PjT(boolean z) {
            if(this.PjT == 1 && z) {
                com.bytedance.sdk.openadsdk.core.qj.cz cz0 = this.Zh;
                if(cz0 != null) {
                    cz0.ReZ();
                    this.PjT = 3;
                }
            }
        }

        public void Zh() {
            this.PjT();
        }
    }

    public interface Zh {
        View PjT();

        void PjT(int arg1, int arg2);

        void PjT(View arg1, int arg2);

        View Zh();

        void e_();
    }

    private Sks Au;
    private Owx DWo;
    protected boolean JQp;
    private com.bytedance.sdk.openadsdk.core.Au.JQp.ReZ SM;
    AtomicBoolean XX;
    protected boolean cr;
    AtomicBoolean cz;
    private Zh fDm;
    private String qj;
    private int qla;
    private long xE;
    private int xf;
    private List xs;

    public JQp(Context context0) {
        super(context0);
        this.cr = false;
        this.JQp = false;
        this.cz = new AtomicBoolean(false);
        this.XX = new AtomicBoolean(false);
        this.xf = 0;
    }

    public void Owx() {
        this.cz.set(false);
        String s = this.DWo.sjb();
        if(TextUtils.isEmpty(s)) {
            return;
        }
        String s1 = com.bytedance.sdk.openadsdk.core.qj.JQp.PjT(s);
        String s2 = TextUtils.isEmpty(s1) ? s : s1;
        this.xf = 0;
        this.PjT(null, s2, "text/html", "UTF-8", null);
        this.xE = SystemClock.elapsedRealtime();
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.ReZ$ReZ
    public void PjT() {
        if(this.cz.compareAndSet(false, true)) {
            this.cr = true;
            this.SM.PjT(this.getWebView());
            this.SM.PjT(this.JQp);
            this.ltE();
            this.RD();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.ReZ$ReZ
    public void PjT(int v, int v1) {
        Zh jQp$Zh0 = this.fDm;
        if(jQp$Zh0 != null) {
            jQp$Zh0.PjT(v, v1);
        }
        this.xf = v1;
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("error_code", v1);
            jSONObject0.put("render_duration", SystemClock.elapsedRealtime() - this.xE);
        }
        catch(Throwable unused_ex) {
        }
        com.bytedance.sdk.openadsdk.cr.ReZ.Zh(this.DWo, this.qj, "render_html_fail", jSONObject0);
    }

    public void PjT(@Nullable View view0, @Nullable FriendlyObstructionPurpose friendlyObstructionPurpose0) {
        this.SM.PjT(view0, friendlyObstructionPurpose0);
    }

    public void PjT(Owx owx0, Zh jQp$Zh0, String s) {
        this.fDm = jQp$Zh0;
        this.DWo = owx0;
        this.qj = s;
        this.SM = new com.bytedance.sdk.openadsdk.core.Au.JQp.ReZ();
        this.Au = new Sks(this.getContext());
        this.setWebViewClient(new PjT(this));
        this.setWebChromeClient(new WebChromeClient() {
            final JQp PjT;

            @Override  // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView0, int v) {
                JQp.this.qla = v;
                super.onProgressChanged(webView0, v);
                if(v >= 100) {
                    JQp.this.PjT();
                }
            }
        });
        SM.Zh().post(new Runnable() {
            final JQp PjT;

            @Override
            @SuppressLint({"ClickableViewAccessibility"})
            public void run() {
                WebView webView0 = JQp.this.getWebView();
                if(webView0 != null) {
                    webView0.setOnTouchListener(new View.OnTouchListener() {
                        final com.bytedance.sdk.openadsdk.core.Au.JQp.2 PjT;

                        @Override  // android.view.View$OnTouchListener
                        public boolean onTouch(View view0, MotionEvent motionEvent0) {
                            JQp.this.Au.onTouchEvent(motionEvent0);
                            return false;
                        }
                    });
                }
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.ReZ$ReZ
    public void PjT(String s) {
        View view3;
        String s3;
        boolean z;
        String s1;
        if(TextUtils.isEmpty(s) || this.DWo == null || !this.Au.Zh()) {
            return;
        }
        int v = wN.PjT(this.qj);
        View view0 = null;
        if(ltE.PjT(s) || this.DWo.RV() != null && !TextUtils.isEmpty(this.DWo.RV().PjT())) {
            s1 = s;
        }
        else {
            qj qj0 = new qj();
            qj0.PjT(s);
            this.DWo.PjT(qj0);
            s1 = null;
        }
        this.DWo.PjT(true);
        if(this.DWo == null || this.DWo.RV() == null || TextUtils.isEmpty(this.DWo.RV().PjT())) {
            z = false;
            s3 = s1;
        }
        else {
            z = ZX.PjT(this.getContext(), this.DWo, v, this.qj, true, null);
            if(z || TextUtils.isEmpty(this.DWo.RV().Zh())) {
                s3 = s1;
            }
            else {
                String s2 = this.DWo.RV().Zh();
                com.bytedance.sdk.openadsdk.cr.ReZ.PjT(this.DWo, this.qj, "open_fallback_url", null);
                s3 = s2;
            }
        }
        if(!z) {
            if(!TextUtils.isEmpty(s3)) {
                ZX.PjT(this.getContext(), this.DWo, v, null, null, this.qj, true, s3);
                goto label_28;
            }
            return;
        }
    label_28:
        if(this.Au != null) {
            Zh jQp$Zh0 = this.fDm;
            if(jQp$Zh0 == null) {
                view3 = null;
            }
            else {
                View view1 = jQp$Zh0.PjT();
                View view2 = this.fDm.Zh();
                this.fDm.PjT(this, 2);
                view0 = view2;
                view3 = view1;
            }
            DWo dWo0 = this.Au.PjT(this.getContext(), view0, view3);
            HashMap hashMap0 = new HashMap();
            hashMap0.put("click_scence", 1);
            com.bytedance.sdk.openadsdk.cr.ReZ.PjT("click", this.DWo, dWo0, this.qj, true, hashMap0, (this.Au.Zh() ? 1 : 2));
        }
        Sks sks0 = this.Au;
        if(sks0 != null) {
            sks0.PjT();
        }
    }

    private void RD() {
        if(this.xs == null) {
            com.bytedance.sdk.openadsdk.cr.ReZ.Zh(this.DWo, this.qj, "dsp_html_success_url", null);
            return;
        }
        com.bytedance.sdk.openadsdk.cr.ReZ.PjT(new Au("dsp_html_error_url") {
            final JQp PjT;

            @Override
            public void run() {
                try {
                    if(JQp.this.xs == null) {
                        return;
                    }
                    if(JQp.this.XX.compareAndSet(false, true)) {
                        JSONObject jSONObject0 = new JSONObject();
                        JSONArray jSONArray0 = new JSONArray();
                        for(Object object0: JQp.this.xs) {
                            jSONArray0.put(((String)object0));
                        }
                        jSONObject0.put("url", jSONArray0);
                        com.bytedance.sdk.openadsdk.cr.ReZ.Zh(JQp.this.DWo, JQp.this.qj, "dsp_html_error_url", jSONObject0);
                        JQp.this.xs = null;
                    }
                }
                catch(Exception unused_ex) {
                }
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.ReZ$ReZ
    public void Zh(String s) {
        if(this.xs == null) {
            this.xs = new ArrayList();
        }
        this.xs.add(s);
    }

    public void ltE() {
        Zh jQp$Zh0 = this.fDm;
        if(jQp$Zh0 != null) {
            jQp$Zh0.e_();
        }
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("render_duration", SystemClock.elapsedRealtime() - this.xE);
        }
        catch(Throwable unused_ex) {
        }
        com.bytedance.sdk.openadsdk.cr.ReZ.Zh(this.DWo, this.qj, "render_html_success", jSONObject0);
    }

    @Override  // com.bytedance.sdk.component.SM.cz
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if(this.cr) {
            this.SM.PjT(this.getWebView());
        }
    }

    @Override  // com.bytedance.sdk.component.SM.cz
    protected void onDetachedFromWindow() {
        this.SM.PjT();
        super.onDetachedFromWindow();
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("rate", ((double)(((float)this.qla) / 100.0f)));
        }
        catch(Throwable unused_ex) {
        }
        com.bytedance.sdk.openadsdk.cr.ReZ.Zh(this.DWo, this.qj, "load_rate", jSONObject0);
    }

    @Override  // android.view.View
    protected void onVisibilityChanged(@NonNull View view0, int v) {
        super.onVisibilityChanged(view0, v);
        this.JQp = v == 0;
        this.SM.PjT(v == 0);
    }

    @Override  // com.bytedance.sdk.component.SM.cz
    public void xE() {
        this.SM.Zh();
        super.xE();
    }
}

