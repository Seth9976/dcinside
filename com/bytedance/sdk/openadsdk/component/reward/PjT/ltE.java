package com.bytedance.sdk.openadsdk.component.reward.PjT;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebView;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.JQp.DWo;
import com.bytedance.sdk.component.JQp.qj;
import com.bytedance.sdk.component.JQp.xE;
import com.bytedance.sdk.component.SM.cz;
import com.bytedance.sdk.openadsdk.SM.Zh;
import com.bytedance.sdk.openadsdk.SM.cr;
import com.bytedance.sdk.openadsdk.core.Jo;
import com.bytedance.sdk.openadsdk.core.Zh.XX;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.qj.JQp;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.cr.ReZ;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils.AudioInfoReceiver;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.qla;
import com.bytedance.sdk.openadsdk.xf.SM;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class ltE implements SM {
    static class PjT implements xE {
        private final WeakReference PjT;
        private final WeakReference ReZ;
        private final String Zh;
        private final AtomicBoolean cr;

        public PjT(ImageView imageView0, String s, ltE ltE0, AtomicBoolean atomicBoolean0) {
            this.PjT = new WeakReference(imageView0);
            this.Zh = s;
            this.ReZ = new WeakReference(ltE0);
            this.cr = atomicBoolean0;
        }

        @Override  // com.bytedance.sdk.component.JQp.xE
        public void PjT(int v, String s, @Nullable Throwable throwable0) {
            ImageView imageView0 = (ImageView)this.PjT.get();
            if(imageView0 == null) {
                return;
            }
            ltE ltE0 = (ltE)this.ReZ.get();
            if(ltE0 == null) {
                return;
            }
            imageView0.setVisibility(8);
            ltE0.PjT(-2, this.Zh);
        }

        @Override  // com.bytedance.sdk.component.JQp.xE
        public void PjT(qj qj0) {
            ImageView imageView0 = (ImageView)this.PjT.get();
            if(imageView0 == null) {
                return;
            }
            ltE ltE0 = (ltE)this.ReZ.get();
            if(ltE0 == null) {
                return;
            }
            if(qj0 != null) {
                Bitmap bitmap0 = (Bitmap)qj0.Zh();
                if(bitmap0 == null) {
                    ltE0.PjT(-1, this.Zh);
                    return;
                }
                imageView0.setImageBitmap(bitmap0);
                this.cr.set(true);
                ltE0.cr();
            }
        }
    }

    private volatile boolean Au;
    private int DWo;
    private boolean JQp;
    private final Activity PjT;
    private cz ReZ;
    private final com.bytedance.sdk.openadsdk.component.reward.PjT.PjT SM;
    private final AtomicBoolean XX;
    private final Owx Zh;
    private ImageView cr;
    private XX cz;

    public ltE(com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0) {
        this.XX = new AtomicBoolean(false);
        this.SM = pjT0;
        this.Zh = pjT0.Zh;
        this.PjT = pjT0.rds;
    }

    private void JQp() {
        this.ReZ.JQp();
        this.PjT(this.ReZ);
        this.ReZ.setDisplayZoomControls(false);
        this.ReZ.setWebChromeClient(new WebChromeClient() {
            final ltE PjT;

            @Override  // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView0, int v) {
                super.onProgressChanged(webView0, v);
                if(v == 100) {
                    ltE.this.cr();
                }
            }
        });
        this.ReZ.setWebViewClient(new com.bytedance.sdk.component.SM.cz.PjT() {
            final ltE PjT;

            @Override  // android.webkit.WebViewClient
            public void onPageFinished(WebView webView0, String s) {
                super.onPageFinished(webView0, s);
                ltE.this.cr();
            }

            @Override  // android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView0, WebResourceRequest webResourceRequest0, WebResourceResponse webResourceResponse0) {
                super.onReceivedHttpError(webView0, webResourceRequest0, webResourceResponse0);
                if(!webResourceRequest0.isForMainFrame()) {
                    return;
                }
                int v = webResourceResponse0.getStatusCode();
                String s = webResourceRequest0.getUrl() == null ? null : webResourceRequest0.getUrl().toString();
                ltE.this.PjT(v, s);
            }

            // 去混淆评级： 低(20)
            @Override  // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView0, String s) {
                return ltE.this.PjT(s) ? true : super.shouldOverrideUrlLoading(webView0, s);
            }
        });
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void PjT(int v, int v1) {
        if(v != 0 && v1 != 0 && this.cr != null) {
            int v2 = qZS.ReZ(this.PjT);
            int v3 = qZS.JQp(this.PjT);
            float f = ((float)v) / ((float)v1);
            if(f <= ((float)v2) / ((float)v3)) {
                v2 = (int)Math.ceil(((float)v2) * f);
            }
            else {
                v3 = (int)Math.ceil(((float)v2) / f);
            }
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)this.cr.getLayoutParams();
            frameLayout$LayoutParams0.width = v2;
            frameLayout$LayoutParams0.height = v3;
            frameLayout$LayoutParams0.gravity = 17;
            this.cr.setLayoutParams(frameLayout$LayoutParams0);
            this.cr.setOnClickListener(this.cz);
            this.cr.setOnTouchListener(this.cz);
        }
    }

    private void PjT(int v, String s) {
        if(this.Au) {
            return;
        }
        this.Au = true;
        String s1 = this.Zh.QB() == null ? "" : this.Zh.QB().qj();
        if(v == 0x7FFFFFFF) {
            ReZ.Zh(this.Zh, s1, "load_vast_endcard_success", null);
            return;
        }
        ReZ.PjT(new Au("load_vast_endcard_fail") {
            final ltE cr;

            @Override
            public void run() {
                try {
                    JSONObject jSONObject0 = new JSONObject();
                    jSONObject0.put("reason_code", v);
                    jSONObject0.put("error_code", v);
                    String s = s;
                    if(s != null) {
                        jSONObject0.put("url", s);
                    }
                    ReZ.Zh(ltE.this.Zh, s1, "load_vast_endcard_fail", jSONObject0);
                }
                catch(Exception unused_ex) {
                }
            }
        });
    }

    private void PjT(cz cz0) {
        cz0.setVerticalScrollBarEnabled(false);
        cz0.setHorizontalScrollBarEnabled(false);
        cz0.setMixedContentMode(0);
        cz0.setJavaScriptEnabled(true);
        cz0.setJavaScriptCanOpenWindowsAutomatically(true);
        cz0.setDomStorageEnabled(true);
        cz0.setDatabaseEnabled(true);
        cz0.setCacheMode(-1);
        cz0.setAllowFileAccess(false);
        cz0.setSupportZoom(true);
        cz0.setBuiltInZoomControls(true);
        cz0.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        cz0.setUseWideViewPort(true);
    }

    private boolean PjT(String s) {
        if(s != null && (this.Zh != null && this.Zh.QB() != null && this.cz != null)) {
            this.Zh.QB().XX(s);
            this.cz.onClick(this.ReZ);
            return true;
        }
        return false;
    }

    public void PjT() {
        AudioInfoReceiver.PjT(this);
        this.DWo = 0;
        if(this.Zh.QB() != null) {
            this.cz = new XX("VAST_END_CARD", this.Zh.QB()) {
                final ltE PjT;

            };
            com.bytedance.sdk.openadsdk.core.qj.ReZ reZ0 = this.Zh.QB().ReZ();
            if(reZ0 != null) {
                String s = reZ0.JQp();
                if(!TextUtils.isEmpty(s)) {
                    this.JQp = true;
                    this.cr = (ImageView)this.SM.ig.findViewById(qla.Au);
                    this.PjT(reZ0.Zh(), reZ0.ReZ());
                    DWo dWo0 = cr.PjT(s).PjT(reZ0.Zh()).Zh(reZ0.ReZ()).JQp(qZS.JQp(ub.PjT())).cr(qZS.ReZ(ub.PjT())).ReZ(2);
                    PjT ltE$PjT0 = new PjT(this.cr, s, this, this.XX);
                    dWo0.PjT(new Zh(this.Zh, s, ltE$PjT0));
                    return;
                }
                cz cz0 = (cz)this.SM.ig.findViewById(qla.SM);
                this.ReZ = cz0;
                if(cz0 == null) {
                    return;
                }
                this.JQp();
                String s1 = reZ0.cr();
                if(s1 != null) {
                    this.JQp = true;
                    if(s1.startsWith("http")) {
                        this.ReZ.a_(s1);
                        return;
                    }
                    String s2 = JQp.PjT(s1);
                    String s3 = TextUtils.isEmpty(s2) ? s1 : s2;
                    this.ReZ.setDefaultTextEncodingName("UTF -8");
                    this.ReZ.PjT(null, s3, "text/html", "UTF-8", null);
                }
            }
        }
    }

    public void PjT(com.bytedance.sdk.openadsdk.core.Zh.JQp jQp0) {
        XX xX0 = this.cz;
        if(xX0 != null) {
            xX0.PjT(jQp0);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean PjT(com.bytedance.sdk.openadsdk.component.reward.PjT.ub ub0) {
        if(!this.JQp) {
            return false;
        }
        if(this.cr == null || !this.XX.get()) {
            cz cz0 = this.ReZ;
            if(cz0 != null) {
                cz0.setVisibility(0);
                if(this.ReZ.getWebView() != null) {
                    this.ReZ.getWebView().setOnTouchListener(this.cz);
                }
            }
        }
        else {
            this.cr.setVisibility(0);
        }
        if(this.Zh != null && this.Zh.QB() != null) {
            com.bytedance.sdk.openadsdk.core.qj.ReZ reZ0 = this.Zh.QB().ReZ();
            if(reZ0 != null) {
                reZ0.Zh((ub0 == null ? -1L : ub0.XX()));
            }
        }
        return true;
    }

    public boolean ReZ() {
        if(!this.JQp) {
            return false;
        }
        ImageView imageView0 = this.cr;
        if(imageView0 != null) {
            imageView0.performClick();
            return true;
        }
        cz cz0 = this.ReZ;
        if(cz0 != null) {
            this.cz.onClick(cz0);
            return true;
        }
        return false;
    }

    public void Zh() {
        AudioInfoReceiver.Zh(this);
        cz cz0 = this.ReZ;
        if(cz0 != null) {
            Jo.PjT(cz0.getWebView());
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.xf.SM
    public void Zh(int v) {
        int v1 = this.DWo;
        if(v1 == 0 && v > 0) {
            this.Zh.QB().PjT().SM(this.SM.tT.XX());
        }
        else if(v1 > 0 && v == 0) {
            this.Zh.QB().PjT().Au(this.SM.tT.XX());
        }
        this.DWo = v;
    }

    private void cr() {
        this.PjT(0x7FFFFFFF, null);
    }
}

