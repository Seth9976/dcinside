package com.bytedance.sdk.openadsdk.component.reward.PjT;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View.OnScrollChangeListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.webkit.DownloadListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.SM.cz;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.common.xs;
import com.bytedance.sdk.openadsdk.core.Jo;
import com.bytedance.sdk.openadsdk.core.KM;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.cRA;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.cr.DWo;
import com.bytedance.sdk.openadsdk.cr.cr.JQp;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils.AudioInfoReceiver;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.qla;
import com.bytedance.sdk.openadsdk.utils.wN;
import com.bytedance.sdk.openadsdk.xf.SM;
import com.bytedance.sdk.openadsdk.xf.qj;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import v.c;

public class gK implements SM {
    static class PjT extends com.bytedance.sdk.openadsdk.core.Zh.PjT implements com.bytedance.sdk.openadsdk.core.Zh.Zh.PjT {
        private final com.bytedance.sdk.openadsdk.component.reward.PjT.PjT PjT;
        private final View.OnClickListener ReZ;
        private final View Zh;

        public PjT(com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0, View view0, View.OnClickListener view$OnClickListener0) {
            super(pjT0.rds, pjT0.Zh, pjT0.JQp, (pjT0.cr ? 7 : 5));
            this.PjT = pjT0;
            this.Zh = view0;
            this.ReZ = view$OnClickListener0;
            HashMap hashMap0 = new HashMap();
            hashMap0.put("close_auto_click", Boolean.TRUE);
            hashMap0.put("click_scence", 2);
            this.PjT(hashMap0);
            this.PjT(pjT0.Lrd.ReZ());
            this.PjT(this);
        }

        @Override  // com.bytedance.sdk.openadsdk.core.Zh.PjT
        public void PjT(View view0, float f, float f1, float f2, float f3, SparseArray sparseArray0, boolean z) {
            if(this.cz.en()) {
                this.ReZ.onClick(view0);
                this.Zh.setOnTouchListener(null);
                this.Zh.setOnClickListener(this.ReZ);
                return;
            }
            super.PjT(view0, f, f1, f2, f3, sparseArray0, z);
            this.PjT.kph.c_();
        }

        @Override  // com.bytedance.sdk.openadsdk.core.Zh.Zh$PjT
        public void PjT(View view0, int v) {
            this.Zh.setOnTouchListener(null);
            this.Zh.setOnClickListener(this.ReZ);
        }
    }

    static class ReZ implements qj {
        private final cz PjT;

        private ReZ(cz cz0) {
            this.PjT = cz0;
        }

        ReZ(cz cz0, com.bytedance.sdk.openadsdk.component.reward.PjT.gK.1 gK$10) {
            this(cz0);
        }

        @Override  // com.bytedance.sdk.openadsdk.xf.qj
        public void PjT() {
            cz cz0 = this.PjT;
            if(cz0 == null) {
                return;
            }
            cz0.qla();
        }

        @Override  // com.bytedance.sdk.openadsdk.xf.qj
        public void Zh() {
            cz cz0 = this.PjT;
            if(cz0 == null) {
                return;
            }
            cz0.gK();
        }
    }

    static class Zh implements com.bytedance.sdk.openadsdk.xf.PjT {
        private final View PjT;

        public Zh(View view0) {
            this.PjT = view0;
        }

        @Override  // com.bytedance.sdk.openadsdk.xf.PjT
        public int PjT() {
            int v = this.PjT == null ? -1 : this.PjT.getMeasuredHeight();
            return v > 0 ? v : qZS.JQp(ub.PjT());
        }

        @Override  // com.bytedance.sdk.openadsdk.xf.PjT
        public int Zh() {
            int v = this.PjT == null ? -1 : this.PjT.getMeasuredWidth();
            return v > 0 ? v : qZS.ReZ(ub.PjT());
        }
    }

    public interface cr {
        void PjT(WebView arg1, int arg2);

        void PjT(WebView arg1, String arg2);

        void PjT(WebView arg1, String arg2, Bitmap arg3);
    }

    protected JQp Au;
    private boolean CY;
    private xs Co;
    public boolean DWo;
    private volatile int HG;
    private boolean IJ;
    com.bytedance.sdk.openadsdk.cr.qj JQp;
    private float Jo;
    private SparseArray KM;
    private String Ld;
    private View Lrd;
    private int MWx;
    private boolean OMu;
    private final AtomicBoolean Owx;
    KM PjT;
    private boolean Qf;
    private boolean RD;
    protected boolean ReZ;
    boolean SM;
    private boolean Sks;
    private long VY;
    String XX;
    private boolean Xe;
    private long Yo;
    private float ZX;
    private boolean Zd;
    KM Zh;
    private ILoader cI;
    private View cRA;
    protected String cr;
    int cz;
    private int dwk;
    private String fA;
    private final boolean fDm;
    private cz gK;
    private float iZZ;
    private com.bytedance.sdk.openadsdk.core.widget.PjT.JQp ig;
    private com.bytedance.sdk.openadsdk.core.widget.PjT.cz.PjT kFP;
    private boolean kph;
    private boolean ltE;
    private volatile int oG;
    private final com.bytedance.sdk.openadsdk.component.reward.PjT.PjT qZS;
    @NonNull
    private final Owx qj;
    private int qla;
    private boolean rds;
    private boolean tT;
    private long tY;
    private cz ub;
    private int wKV;
    private boolean wN;
    private int xE;
    private volatile int xH;
    private final String xf;
    private int xs;
    private com.bytedance.sdk.openadsdk.common.cr xu;
    private float yIW;
    private boolean zYH;
    private long zZ;

    public gK(com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0) {
        this.ReZ = true;
        this.ltE = false;
        this.Owx = new AtomicBoolean(true);
        this.cz = 0;
        this.XX = "";
        this.SM = false;
        this.KM = new SparseArray();
        this.Qf = true;
        this.ZX = -1.0f;
        this.Jo = -1.0f;
        this.Zd = false;
        this.VY = -1L;
        this.xH = 0;
        this.MWx = -1;
        this.oG = 0;
        this.HG = 0;
        this.zZ = 0L;
        this.DWo = false;
        this.wKV = -1;
        this.qZS = pjT0;
        this.qj = pjT0.Zh;
        this.xf = pjT0.JQp;
        this.fDm = pjT0.cr;
    }

    public void Au() {
        if(this.ub == null) {
            return;
        }
        this.Owx.set(this.Sks);
        if(this.gK.getVisibility() == 0 && this.Sks) {
            this.tY();
            return;
        }
        this.qZS.wN.ReZ(false);
        this.qZS.cRA.XX(Au.ReZ);
        this.PjT(this.PjT, true, false);
        this.Zh(this.PjT, false);
        this.PjT(this.PjT, false);
        this.ub.xE();
        if(this.Sks) {
            this.gK.setVisibility(0);
            this.PjT(this.Zh, this.qZS.xH, true);
            this.Zh(this.Zh, true);
            this.PjT(this.Zh, true);
            this.qZS.OMu.removeMessages(600);
            if(!this.qZS.qZS.ReZ(this.qZS.wKV)) {
                this.qZS.wKV.Lrd();
            }
        }
        else {
            if(this.qZS.cRA.PjT()) {
                this.qZS.cRA.PjT(5);
            }
            this.qZS.qZS.cr();
            this.qZS.Xtz.PjT(((long)this.qZS.Au));
        }
        this.zYH = true;
    }

    public boolean Co() {
        return this.PjT == null ? false : this.PjT.SM();
    }

    public cz DWo() {
        return this.ub;
    }

    public boolean IJ() {
        return this.rds;
    }

    public void JQp() {
        if(cRA.JQp(this.qj)) {
            return;
        }
        this.cz();
    }

    public void JQp(boolean z) {
        if(this.PjT != null && !this.qZS.rds.isFinishing()) {
            this.qZS.cRA.JQp(z);
            try {
                JSONObject jSONObject0 = new JSONObject();
                jSONObject0.put("endcard_mute", z);
                this.PjT.PjT("volumeChange", jSONObject0);
            }
            catch(Exception unused_ex) {
            }
        }
    }

    public void Jo() {
        JQp jQp0 = this.Au;
        if(jQp0 != null) {
            jQp0.DWo();
        }
    }

    public void KM() {
        com.bytedance.sdk.openadsdk.cr.qj qj0 = this.JQp;
        if(qj0 != null) {
            qj0.PjT(System.currentTimeMillis());
        }
    }

    public String Lrd() {
        return this.XX;
    }

    public boolean OMu() {
        return this.DWo;
    }

    public void Owx() {
        JQp jQp0 = this.Au;
        if(jQp0 != null) {
            jQp0.SM();
        }
        com.bytedance.sdk.openadsdk.cr.qj qj0 = this.JQp;
        if(qj0 != null) {
            qj0.Au();
        }
    }

    private static String PjT(String s, Owx owx0, int v, int v1, int v2) {
        float f = owx0.Qtm();
        if(!TextUtils.isEmpty(s)) {
            if(v == 1) {
                s = (s.contains("?") ? s + "&" : s + "?") + "orientation=portrait";
            }
            s = (s.contains("?") ? s + "&" : s + "?") + "height=" + v1 + "&width=" + v2 + "&aspect_ratio=" + f;
        }
        return cRA.XX(owx0) ? s : com.bytedance.sdk.openadsdk.utils.JQp.PjT(s);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void PjT(String s, cr gK$cr0) {
        if(this.ub != null && this.ub.getWebView() != null) {
            WebView webView0 = this.ub.getWebView();
            com.bytedance.sdk.openadsdk.component.reward.PjT.gK.7 gK$70 = new DWo() {
                final gK PjT;

                @Override  // com.bytedance.sdk.openadsdk.cr.DWo
                public void PjT(int v) {
                    if(!TextUtils.isEmpty(gK.this.Ld)) {
                        com.bytedance.sdk.openadsdk.cr.ReZ.PjT.PjT(gK.this.dwk, gK.this.xH, gK.this.HG, gK.this.oG - gK.this.HG, gK.this.qj, "landingpage_endcard", v);
                    }
                }
            };
            com.bytedance.sdk.openadsdk.cr.qj qj0 = new com.bytedance.sdk.openadsdk.cr.qj(this.qj, webView0, gK$70, this.MWx).Zh(true);
            this.JQp = qj0;
            this.kFP = qj0.PjT;
            qj0.PjT((this.ub() ? "landingpage_endcard" : s));
            this.JQp.Zh(this.xf);
            this.JQp.ReZ(true);
            int v = Build.VERSION.SDK_INT;
            if(v >= 23) {
                this.ub.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() {
                    final gK PjT;

                    @Override  // android.view.View$OnScrollChangeListener
                    public void onScrollChange(View view0, int v, int v1, int v2, int v3) {
                        com.bytedance.sdk.openadsdk.cr.qj qj0 = gK.this.JQp;
                        if(qj0 != null) {
                            qj0.Zh(v1);
                        }
                    }
                });
            }
            Au au0 = this.qZS.cRA;
            if(au0 != null) {
                this.JQp.PjT(au0.cr());
            }
            com.bytedance.sdk.openadsdk.common.cr cr0 = wN.PjT(this.qj, this.ub, this.qZS.rds, this.xf);
            this.xu = cr0;
            if(cr0 != null) {
                if(this.ub()) {
                    s = "landingpage_endcard";
                }
                cr0.PjT(s);
            }
            if(this.ub()) {
                wN.PjT(this.qj, this.ub);
            }
            com.bytedance.sdk.openadsdk.component.reward.PjT.gK.9 gK$90 = new com.bytedance.sdk.openadsdk.core.widget.PjT.JQp(ub.PjT(), this.PjT, this.qj.dIF(), this.xu, this.JQp, this.qj.IJ() || cRA.XX(this.qj)) {
                final gK Zh;

                @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
                public void onPageFinished(WebView webView0, String s) {
                    super.onPageFinished(webView0, s);
                    gK.this.CY = false;
                    gK.this.RD = true;
                    if(gK.this.qZS.Jo.yIW()) {
                        View view0 = gK.this.qZS.Zd.DWo();
                        if(view0 instanceof com.bytedance.sdk.openadsdk.core.JQp.cr) {
                            ((com.bytedance.sdk.openadsdk.core.JQp.cr)view0).setImageResource(Lrd.cr(gK.this.qZS.IJ, "tt_skip_btn"));
                        }
                    }
                    AudioInfoReceiver.PjT(gK.this);
                    gK.this.wKV = 0;
                    JQp jQp0 = gK.this.Au;
                    if(jQp0 != null) {
                        jQp0.cz();
                    }
                    gK.this.qZS.cRA.Zh(s);
                    cr gK$cr0 = gK$cr0;
                    if(gK$cr0 != null) {
                        gK$cr0.PjT(webView0, s);
                    }
                }

                @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
                public void onPageStarted(WebView webView0, String s, Bitmap bitmap0) {
                    super.onPageStarted(webView0, s, bitmap0);
                    JQp jQp0 = gK.this.Au;
                    if(jQp0 != null) {
                        jQp0.JQp();
                    }
                    cr gK$cr0 = gK$cr0;
                    if(gK$cr0 != null) {
                        gK$cr0.PjT(webView0, s, bitmap0);
                    }
                }

                @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
                public void onReceivedError(WebView webView0, int v, String s, String s1) {
                    super.onReceivedError(webView0, v, s, s1);
                    if(Build.VERSION.SDK_INT >= 23) {
                        return;
                    }
                    if(gK.this.PjT(s1)) {
                        return;
                    }
                    gK.this.Owx.set(false);
                    gK.this.cz = v;
                    gK.this.XX = s;
                    gK.this.CY = false;
                    gK.this.qZS.cRA.PjT(v, s, s1);
                    if(gK.this.Au != null) {
                        try {
                            JSONObject jSONObject0 = new JSONObject();
                            gK.this.Au.PjT(jSONObject0);
                        }
                        catch(JSONException unused_ex) {
                        }
                    }
                }

                @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
                @TargetApi(23)
                public void onReceivedError(WebView webView0, WebResourceRequest webResourceRequest0, WebResourceError webResourceError0) {
                    super.onReceivedError(webView0, webResourceRequest0, webResourceError0);
                    int v = Build.VERSION.SDK_INT;
                    if(v < 23) {
                        return;
                    }
                    if(webResourceError0 != null && webResourceRequest0 != null && webResourceRequest0.getUrl() != null) {
                        Log.i("TTAD.RFWVM", "onReceivedError WebResourceError : description=" + webResourceError0.getDescription() + "  url =" + webResourceRequest0.getUrl().toString());
                    }
                    if(webResourceRequest0 != null && webResourceRequest0.getUrl() != null) {
                        String s = webResourceRequest0.getUrl().toString();
                        if(gK.this.PjT(s)) {
                            return;
                        }
                    }
                    if(webResourceError0 != null && webResourceRequest0 != null && webResourceRequest0.isForMainFrame()) {
                        int v1 = webResourceError0.getErrorCode();
                        String s1 = String.valueOf(webResourceError0.getDescription());
                        String s2 = String.valueOf(webResourceRequest0.getUrl());
                        gK.this.qZS.cRA.PjT(v1, s1, s2);
                    }
                    if(webResourceRequest0 == null || webResourceRequest0.isForMainFrame()) {
                        gK.this.Owx.set(false);
                        gK.this.CY = false;
                    }
                    if(gK.this.Au != null) {
                        try {
                            JSONObject jSONObject0 = new JSONObject();
                            if(v >= 23 && webResourceError0 != null) {
                                jSONObject0.put("code", webResourceError0.getErrorCode());
                                jSONObject0.put("msg", webResourceError0.getDescription());
                            }
                            gK.this.Au.PjT(jSONObject0);
                        }
                        catch(JSONException unused_ex) {
                        }
                    }
                    if(webResourceError0 != null) {
                        gK.this.cz = webResourceError0.getErrorCode();
                        gK.this.XX = String.valueOf(webResourceError0.getDescription());
                    }
                }

                @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
                @TargetApi(21)
                public void onReceivedHttpError(WebView webView0, WebResourceRequest webResourceRequest0, WebResourceResponse webResourceResponse0) {
                    boolean z = webResourceRequest0.isForMainFrame();
                    String s = webResourceRequest0.getUrl().toString();
                    int v = webResourceResponse0.getStatusCode();
                    gK.this.qZS.cRA.PjT(z, s, v);
                    if(webResourceRequest0.getUrl() != null) {
                        Log.i("TTAD.RFWVM", "onReceivedHttpError:url =" + webResourceRequest0.getUrl().toString());
                    }
                    if(webResourceRequest0.isForMainFrame()) {
                        gK.this.Owx.set(false);
                        gK.this.CY = false;
                        gK.this.cz = webResourceResponse0.getStatusCode();
                        gK.this.XX = "onReceivedHttpError";
                    }
                    if(gK.this.Au != null) {
                        try {
                            JSONObject jSONObject0 = new JSONObject();
                            jSONObject0.put("code", webResourceResponse0.getStatusCode());
                            jSONObject0.put("msg", webResourceResponse0.getReasonPhrase());
                            gK.this.Au.PjT(jSONObject0);
                        }
                        catch(JSONException unused_ex) {
                        }
                    }
                    super.onReceivedHttpError(webView0, webResourceRequest0, webResourceResponse0);
                }

                @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
                public void onReceivedSslError(WebView webView0, SslErrorHandler sslErrorHandler0, SslError sslError0) {
                    super.onReceivedSslError(webView0, sslErrorHandler0, sslError0);
                }

                @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
                @TargetApi(21)
                public WebResourceResponse shouldInterceptRequest(WebView webView0, WebResourceRequest webResourceRequest0) {
                    try {
                        return this.shouldInterceptRequest(webView0, webResourceRequest0.getUrl().toString());
                    }
                    catch(Throwable throwable0) {
                        RD.PjT("TTAD.RFWVM", "shouldInterceptRequest error1", throwable0);
                        return super.shouldInterceptRequest(webView0, webResourceRequest0);
                    }
                }

                @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
                public WebResourceResponse shouldInterceptRequest(WebView webView0, String s) {
                    if(cRA.XX(gK.this.qj)) {
                        long v = System.currentTimeMillis();
                        String s1 = cRA.xs(gK.this.qj);
                        String s2 = gK.this.qj.MWx().N();
                        WebResourceResponse webResourceResponse0 = com.bytedance.sdk.openadsdk.core.xf.ReZ.PjT.PjT().PjT(s2, s1, s);
                        long v1 = System.currentTimeMillis();
                        if(gK.this.Au != null) {
                            com.bytedance.sdk.component.adexpress.cr.SM.PjT sM$PjT0 = com.bytedance.sdk.component.adexpress.cr.SM.PjT(s);
                            int v2 = webResourceResponse0 == null ? 2 : 1;
                            if(sM$PjT0 == com.bytedance.sdk.component.adexpress.cr.SM.PjT.PjT) {
                                gK.this.Au.PjT(s, v, v1, v2);
                                return webResourceResponse0 == null ? super.shouldInterceptRequest(webView0, s) : webResourceResponse0;
                            }
                            if(sM$PjT0 == com.bytedance.sdk.component.adexpress.cr.SM.PjT.ReZ) {
                                gK.this.Au.Zh(s, v, v1, v2);
                            }
                        }
                        return webResourceResponse0 == null ? super.shouldInterceptRequest(webView0, s) : webResourceResponse0;
                    }
                    try {
                        if(TextUtils.isEmpty(gK.this.Ld)) {
                            return super.shouldInterceptRequest(webView0, s);
                        }
                        gK.fDm(gK.this);
                        WebResourceResponseModel webResourceResponseModel0 = com.bytedance.sdk.openadsdk.XX.Zh.PjT().PjT(gK.this.cI, gK.this.Ld, s);
                        if(webResourceResponseModel0 != null && webResourceResponseModel0.getWebResourceResponse() != null) {
                            gK.xE(gK.this);
                            return webResourceResponseModel0.getWebResourceResponse();
                        }
                        if(webResourceResponseModel0 != null && webResourceResponseModel0.getMsg() == 2) {
                            gK.ub(gK.this);
                        }
                        return super.shouldInterceptRequest(webView0, s);
                    }
                    catch(Throwable throwable0) {
                    }
                    RD.PjT("TTAD.RFWVM", "shouldInterceptRequest url error", throwable0);
                    return super.shouldInterceptRequest(webView0, s);
                }
            };
            this.ig = gK$90;
            this.ub.setWebViewClient(gK$90);
            this.ig.PjT(this.qj);
            this.ig.PjT((this.fDm ? "rewarded_video" : "fullscreen_interstitial_ad"));
            if(this.qj.IJ() && (this.ub != null && this.ub.getWebView() != null)) {
                this.ub.getWebView().setOnTouchListener(new View.OnTouchListener() {
                    final gK PjT;
                    private final int Zh;

                    {
                        this.Zh = ub.Zh();
                    }

                    @Override  // android.view.View$OnTouchListener
                    public boolean onTouch(View view0, MotionEvent motionEvent0) {
                        long v5;
                        int v1;
                        com.bytedance.sdk.openadsdk.cr.qj qj0 = gK.this.JQp;
                        if(qj0 != null) {
                            qj0.PjT(motionEvent0);
                        }
                        if(gK.this.xu != null) {
                            gK.this.xu.PjT(motionEvent0);
                        }
                        try {
                            int v = motionEvent0.getActionMasked();
                            if(v == 0) {
                                gK.this.Qf = true;
                                SparseArray sparseArray0 = new SparseArray();
                                gK.this.KM = sparseArray0;
                                float f4 = motionEvent0.getRawX();
                                gK.this.yIW = f4;
                                float f5 = motionEvent0.getRawY();
                                gK.this.iZZ = f5;
                                gK.this.Yo = System.currentTimeMillis();
                                try {
                                    long v3 = gK.this.ub.getLandingPageClickBegin();
                                    if(v3 > 0L && v3 < gK.this.Yo) {
                                        gK.this.Yo = v3;
                                        gK.this.ub.setLandingPageClickBegin(-1L);
                                    }
                                }
                                catch(Exception unused_ex) {
                                }
                                gK.this.ZX = -1.0f;
                                gK.this.Jo = -1.0f;
                                v1 = 0;
                            }
                            else {
                                switch(v) {
                                    case 1: {
                                        v1 = 3;
                                        break;
                                    }
                                    case 2: {
                                        float f = motionEvent0.getRawX();
                                        float f1 = motionEvent0.getRawY();
                                        if(Math.abs(f - gK.this.yIW) >= ((float)this.Zh) || Math.abs(f1 - gK.this.iZZ) >= ((float)this.Zh)) {
                                            gK.this.Qf = false;
                                        }
                                        float f2 = Math.abs(motionEvent0.getX() - gK.this.yIW);
                                        gK.this.ZX += f2;
                                        float f3 = Math.abs(motionEvent0.getY() - gK.this.iZZ);
                                        gK.this.Jo += f3;
                                        int v2 = System.currentTimeMillis() - gK.this.Yo <= 200L || gK.this.ZX <= 8.0f && gK.this.Jo <= 8.0f ? 2 : 1;
                                        if(gK.this.wN) {
                                            if(f1 - gK.this.iZZ > 8.0f) {
                                                gK.this.Co.PjT();
                                            }
                                            if(f1 - gK.this.iZZ < -8.0f) {
                                                gK.this.Co.Zh();
                                            }
                                        }
                                        v1 = v2;
                                        break;
                                    }
                                    case 3: {
                                        v1 = 4;
                                        break;
                                    }
                                    default: {
                                        v1 = -1;
                                    }
                                }
                            }
                            gK.this.KM.put(motionEvent0.getActionMasked(), new com.bytedance.sdk.openadsdk.core.Zh.ReZ.PjT(v1, ((double)motionEvent0.getSize()), ((double)motionEvent0.getPressure()), System.currentTimeMillis()));
                            if(motionEvent0.getAction() != 1 || view0.getVisibility() != 0 || view0.getAlpha().intValue() != 1 || gK.this.ltE && !com.bytedance.sdk.openadsdk.core.model.gK.Au(gK.this.qj) || !gK.this.Qf) {
                                return false;
                            }
                            JSONObject jSONObject0 = new JSONObject();
                            jSONObject0.put("down_x", ((double)gK.this.yIW));
                            jSONObject0.put("down_y", ((double)gK.this.iZZ));
                            jSONObject0.put("down_time", gK.this.Yo);
                            jSONObject0.put("up_x", ((double)motionEvent0.getRawX()));
                            jSONObject0.put("up_y", ((double)motionEvent0.getRawY()));
                            long v4 = System.currentTimeMillis();
                            try {
                                v5 = gK.this.ub.getLandingPageClickEnd();
                                if(v5 > 0L && v5 < v4) {
                                    goto label_57;
                                }
                            }
                            catch(Exception unused_ex) {
                            }
                            goto label_59;
                            try {
                            label_57:
                                gK.this.ub.setLandingPageClickEnd(-1L);
                            }
                            catch(Exception unused_ex) {
                            }
                            v4 = v5;
                        label_59:
                            jSONObject0.put("up_time", v4);
                            int[] arr_v = new int[2];
                            if(gK.this.wN) {
                                View view1 = gK.this.qZS.ig.findViewById(qla.Xtz);
                                gK.this.cRA = view1;
                            }
                            else {
                                View view2 = gK.this.qZS.ig.findViewById(0x1F000011);
                                gK.this.cRA = view2;
                            }
                            if(gK.this.cRA != null) {
                                gK.this.cRA.getLocationOnScreen(arr_v);
                                jSONObject0.put("button_x", arr_v[0]);
                                jSONObject0.put("button_y", arr_v[1]);
                                jSONObject0.put("button_width", gK.this.cRA.getWidth());
                                jSONObject0.put("button_height", gK.this.cRA.getHeight());
                            }
                            if(gK.this.Lrd != null) {
                                int[] arr_v1 = new int[2];
                                gK.this.Lrd.getLocationOnScreen(arr_v1);
                                jSONObject0.put("ad_x", arr_v1[0]);
                                jSONObject0.put("ad_y", arr_v1[1]);
                                jSONObject0.put("width", gK.this.Lrd.getWidth());
                                jSONObject0.put("height", gK.this.Lrd.getHeight());
                            }
                            jSONObject0.put("toolType", motionEvent0.getToolType(0));
                            jSONObject0.put("deviceId", motionEvent0.getDeviceId());
                            jSONObject0.put("source", motionEvent0.getSource());
                            jSONObject0.put("ft", com.bytedance.sdk.openadsdk.core.model.DWo.PjT(gK.this.KM, (com.bytedance.sdk.openadsdk.core.SM.Zh().PjT() ? 1 : 2)));
                            jSONObject0.put("user_behavior_type", (gK.this.Qf ? 1 : 2));
                            jSONObject0.put("click_scence", 2);
                            if(gK.this.ig != null) {
                                gK.this.ig.PjT(jSONObject0);
                            }
                            if(!gK.this.ltE && !com.bytedance.sdk.openadsdk.core.model.gK.XX(gK.this.qj)) {
                                if(gK.this.fDm) {
                                    com.bytedance.sdk.openadsdk.cr.ReZ.PjT(gK.this.qj, "rewarded_video", "click", jSONObject0);
                                }
                                else {
                                    com.bytedance.sdk.openadsdk.cr.ReZ.PjT(gK.this.qj, "fullscreen_interstitial_ad", "click", jSONObject0);
                                }
                                gK.this.ltE = true;
                                return false;
                            }
                            return false;
                        }
                        catch(Throwable throwable0) {
                        }
                        Log.e("TTAD.RFWVM", "TouchRecordTool onTouch error", throwable0);
                        return false;
                    }
                });
            }
            cz cz0 = this.ub;
            if(cz0 != null) {
                cz0.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.PjT.cr(this.PjT, this.JQp, this.xu) {
                    final gK Zh;

                    @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.cr
                    public void onProgressChanged(WebView webView0, int v) {
                        super.onProgressChanged(webView0, v);
                        cr gK$cr0 = gK$cr0;
                        if(gK$cr0 != null) {
                            gK$cr0.PjT(webView0, v);
                        }
                    }
                });
            }
            this.PjT(this.ub);
            if(v >= 24) {
                this.ub.setLayerType(1, null);
            }
            this.ub.setBackgroundColor(-1);
            this.ub.setDisplayZoomControls(false);
        }
    }

    // 去混淆评级： 低(40)
    private boolean PjT(String s) {
        return TextUtils.isEmpty(s) ? true : this.qj.IJ() && s.endsWith(".mp4");
    }

    public void PjT() {
        if(this.tT) {
            return;
        }
        this.tT = true;
        this.xs = this.qZS.cI;
        this.qla = this.qZS.HG;
        this.xE = this.qZS.zZ;
        long v = SystemClock.elapsedRealtime();
        this.Zh();
        this.zZ = SystemClock.elapsedRealtime() - v;
    }

    public void PjT(float f) {
        qZS.PjT(this.ub, f);
    }

    public void PjT(int v) {
        qZS.PjT(this.ub, v);
        cz cz0 = this.ub;
        if(cz0 != null) {
            qZS.PjT(cz0.getWebView(), v);
        }
        if(this.ub != null && (this.qj.IJ() || cRA.XX(this.qj))) {
            this.ub.setLandingPage(true);
            this.ub.setTag((cRA.XX(this.qj) ? this.xf : "landingpage_endcard"));
            this.ub.setMaterialMeta(this.qj.RXa());
        }
        if(v == 0 && cRA.Au(this.qj)) {
            this.XX();
        }
    }

    public void PjT(int v, int v1) {
        if(this.PjT != null && !this.qZS.rds.isFinishing()) {
            try {
                JSONObject jSONObject0 = new JSONObject();
                jSONObject0.put("width", v);
                jSONObject0.put("height", v1);
                this.PjT.PjT("resize", jSONObject0);
            }
            catch(Exception exception0) {
                Log.e("TTAD.RFWVM", "", exception0);
            }
        }
    }

    public void PjT(DownloadListener downloadListener0) {
        cz cz0 = this.ub;
        if(cz0 != null && downloadListener0 != null) {
            cz0.setDownloadListener(downloadListener0);
        }
    }

    public void PjT(cz cz0) {
        if(cz0 == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.PjT.ReZ.PjT(this.qZS.rds).PjT(false).Zh(false).PjT(cz0.getWebView());
        cz0.setUserAgentString(com.bytedance.sdk.openadsdk.utils.gK.PjT(cz0.getWebView(), 7104));
        cz0.setMixedContentMode(0);
    }

    public void PjT(xs xs0) {
        this.Co = xs0;
    }

    public void PjT(KM kM0, boolean z) {
        if(this.PjT != null && !this.qZS.rds.isFinishing()) {
            kM0.Zh(z);
        }
    }

    public void PjT(KM kM0, boolean z, boolean z1) {
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("endcard_mute", z);
            jSONObject0.put("endcard_show", z1);
            com.bytedance.sdk.openadsdk.activity.cz cz0 = this.qZS.hN;
            if(cz0 != null) {
                jSONObject0.put("multi_ads_show", cz0.cRA().Au());
            }
            kM0.PjT("endcard_control_event", jSONObject0);
            if(!z1) {
                this.Xe = false;
            }
            else if(!this.RD) {
                this.Xe = true;
            }
        }
        catch(Exception unused_ex) {
        }
    }

    public void PjT(com.bytedance.sdk.openadsdk.xf.cz cz0, String s, com.bytedance.sdk.openadsdk.core.xf.cr.Zh zh0) {
        if(this.ub == null) {
            return;
        }
        HashMap hashMap0 = new HashMap();
        if(cRA.XX(this.qj)) {
            hashMap0.put("click_scence", 3);
        }
        else {
            hashMap0.put("click_scence", 2);
        }
        this.Au = this.xH();
        KM kM0 = new KM(this.qZS.rds);
        this.PjT = kM0;
        kM0.PjT(this.qZS.kph);
        String s1 = this.qj.SW();
        int v = 5;
        this.PjT.Zh(this.ub).PjT(this.qj).ReZ(this.qj.dIF()).cr(this.qj.xR()).Zh((this.qj.Sky() ? 7 : 5)).PjT(new Zh(this.ub)).JQp(s1).PjT(this.ub).Zh((this.ub() ? "landingpage_endcard" : s)).PjT(hashMap0).PjT(this.Au).PjT(new com.bytedance.sdk.openadsdk.core.widget.JQp() {
            final gK Zh;

            @Override  // com.bytedance.sdk.openadsdk.core.widget.JQp
            public void PjT() {
                if(gK.this.ig != null) {
                    gK.this.ig.ReZ();
                }
                com.bytedance.sdk.openadsdk.core.xf.cr.Zh zh0 = zh0;
                if(zh0 != null) {
                    zh0.cr();
                }
            }
        }).PjT(() -> {
            gK.this.rds = true;
            gK.this.zYH = false;
            gK.this.qZS.OMu.removeMessages(600);
            gK.this.qZS.OMu.removeMessages(700);
            gK.this.qZS.OMu.removeMessages(900);
            gK.this.qZS.wN.cr(false);
            gK.this.qZS.ltE.set(true);
            gK.this.qZS.wKV.qla();
            gK.this.qj.en();
            if(!gK.this.qj.en() && wN.Au(cRA.PjT(gK.this.qj))) {
                View view0 = gK.this.qZS.Zd.DWo();
                View.OnClickListener view$OnClickListener0 = (View.OnClickListener)view0.getTag(view0.getId());
                if(view$OnClickListener0 != null) {
                    PjT gK$PjT0 = new PjT(gK.this.qZS, view0, view$OnClickListener0);
                    view0.setOnClickListener(gK$PjT0);
                    view0.setOnTouchListener(gK$PjT0);
                }
            }
        });
        HashMap hashMap1 = new HashMap();
        if(cRA.Au(this.qj)) {
            hashMap1.put("click_scence", 2);
        }
        KM kM1 = new KM(this.qZS.rds);
        this.Zh = kM1;
        kM1.PjT(this.qZS.kph);
        KM kM2 = this.Zh.Zh(this.gK).PjT(this.qj).ReZ(this.qj.dIF()).cr(this.qj.xR());
        if(this.qj.Sky()) {
            v = 7;
        }
        KM kM3 = kM2.Zh(v).PjT(new Zh(this.gK)).PjT(this.gK).JQp(s1);
        if(this.ub()) {
            s = "landingpage_endcard";
        }
        kM3.Zh(s).PjT(hashMap1).PjT(this.Au).PjT(new com.bytedance.sdk.openadsdk.core.widget.JQp() {
            final gK PjT;

            @Override  // com.bytedance.sdk.openadsdk.core.widget.JQp
            public void PjT() {
                if(gK.this.ig != null) {
                    gK.this.ig.ReZ();
                }
            }
        }).PjT(() -> {
            gK.this.rds = true;
            gK.this.zYH = false;
            gK.this.qZS.OMu.removeMessages(600);
            gK.this.qZS.OMu.removeMessages(700);
            gK.this.qZS.OMu.removeMessages(900);
            gK.this.qZS.wN.cr(false);
            gK.this.qZS.ltE.set(true);
            gK.this.qZS.wKV.qla();
            gK.this.qj.en();
            if(!gK.this.qj.en() && wN.Au(cRA.PjT(gK.this.qj))) {
                View view0 = gK.this.qZS.Zd.DWo();
                View.OnClickListener view$OnClickListener0 = (View.OnClickListener)view0.getTag(view0.getId());
                if(view$OnClickListener0 != null) {
                    PjT gK$PjT0 = new PjT(gK.this.qZS, view0, view$OnClickListener0);
                    view0.setOnClickListener(gK$PjT0);
                    view0.setOnTouchListener(gK$PjT0);
                }
            }
        });
        this.PjT.PjT(new ReZ(this.ub, null));
        this.Zh.PjT(new ReZ(this.gK, null));
        this.PjT.PjT(this.qZS.Zd.DWo()).PjT(this.qZS.xu).PjT(cz0).PjT(this.qZS.cRA.qj()).PjT(new com.bytedance.sdk.openadsdk.xf.ReZ() {
            final gK PjT;

            @Override  // com.bytedance.sdk.openadsdk.xf.ReZ
            public void PjT() {
                gK.this.OMu = true;
                gK.this.qZS.Zd.DWo().performClick();
            }

            @Override  // com.bytedance.sdk.openadsdk.xf.ReZ
            public void PjT(boolean z, int v, String s) {
                if(z) {
                    gK.this.DWo = true;
                    if(gK.this.Xe) {
                        gK.this.Xe = false;
                        gK.this.PjT(gK.this.qZS.xH, true);
                    }
                }
                if(Owx.cr(gK.this.qZS.Zh) && !cRA.XX(gK.this.qZS.Zh)) {
                    gK.this.PjT(z, v, s);
                }
            }
        });
        this.PjT.JQp(this.kph);
        this.Zh.PjT(this.qZS.Zd.DWo()).PjT(new com.bytedance.sdk.openadsdk.xf.ReZ() {
            final gK PjT;

            @Override  // com.bytedance.sdk.openadsdk.xf.ReZ
            public void PjT() {
                gK.this.OMu = true;
                gK.this.qZS.Zd.DWo().performClick();
            }

            @Override  // com.bytedance.sdk.openadsdk.xf.ReZ
            public void PjT(boolean z, int v, String s) {
            }
        });

        class com.bytedance.sdk.openadsdk.component.reward.PjT.gK.15 implements com.bytedance.sdk.openadsdk.core.KM.PjT {
            final gK PjT;

            @Override  // com.bytedance.sdk.openadsdk.core.KM$PjT
            public void PjT() {
                gK.this.VY();
            }
        }


        class com.bytedance.sdk.openadsdk.component.reward.PjT.gK.17 implements com.bytedance.sdk.openadsdk.core.KM.PjT {
            final gK PjT;

            @Override  // com.bytedance.sdk.openadsdk.core.KM$PjT
            public void PjT() {
                gK.this.VY();
            }
        }

    }

    public void PjT(String s, com.bytedance.sdk.openadsdk.core.xf.cr.Zh zh0) {
        this.PjT(s, new cr() {
            final gK PjT;

            @Override  // com.bytedance.sdk.openadsdk.component.reward.PjT.gK$cr
            public void PjT(WebView webView0, int v) {
                try {
                    if(cRA.gK(gK.this.qZS.Zh) && gK.this.qZS.Zh.Os() && !gK.this.qZS.rds.isFinishing()) {
                        gK.this.qZS.cRA.ReZ(v);
                        return;
                    }
                    if(gK.this.qZS.XX && gK.this.qZS.fA != null) {
                        gK.this.qZS.fA.PjT(webView0, v, gK.this.kFP);
                    }
                }
                catch(Exception unused_ex) {
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.component.reward.PjT.gK$cr
            public void PjT(WebView webView0, String s) {
                if(gK.this.qZS.rds.isFinishing()) {
                    return;
                }
                boolean z = gK.this.gK();
                gK.this.qZS.cRA.Zh(z);
            }

            @Override  // com.bytedance.sdk.openadsdk.component.reward.PjT.gK$cr
            public void PjT(WebView webView0, String s, Bitmap bitmap0) {
                if(!gK.this.Zd && cRA.gK(gK.this.qZS.Zh)) {
                    gK.this.Zd = true;
                    boolean z = gK.this.qZS.Zh.Sky();
                    gK.this.qZS.cRA.PjT(gK.this.qZS.cz, gK.this.qZS.Zh, z);
                    if(!cRA.Au(gK.this.qj)) {
                        long v = gK.this.qZS.cRA.SM();
                        gK.this.qZS.OMu.sendEmptyMessageDelayed(600, v * 1000L);
                    }
                    gK.this.qZS.cRA.DWo();
                    gK.this.qZS.kph.qj();
                }
            }
        });
        if(cRA.gK(this.qZS.Zh)) {
            this.PjT(this.gK);
            com.bytedance.sdk.openadsdk.component.reward.PjT.gK.13 gK$130 = new DownloadListener() {
                final gK Zh;

                @Override  // android.webkit.DownloadListener
                public void onDownloadStart(String s, String s1, String s2, String s3, long v) {
                    gK.this.qZS.Lrd.Zh();
                    com.bytedance.sdk.openadsdk.core.xf.cr.Zh zh0 = zh0;
                    if(zh0 != null) {
                        zh0.cr();
                    }
                }
            };
            this.qZS.cRA.PjT(gK$130);
        }
        this.qZS.cRA.ReZ(this.qZS.xu);
        this.PjT(new DownloadListener() {
            final gK Zh;

            @Override  // android.webkit.DownloadListener
            public void onDownloadStart(String s, String s1, String s2, String s3, long v) {
                gK.this.qZS.Lrd.Zh();
                com.bytedance.sdk.openadsdk.core.xf.cr.Zh zh0 = zh0;
                if(zh0 != null) {
                    zh0.cr();
                }
            }
        });
    }

    public void PjT(boolean z) {
        this.ReZ = z;
    }

    public void PjT(boolean z, int v, String s) {
        JQp jQp0 = this.Au;
        if(jQp0 == null) {
            return;
        }
        if(z) {
            jQp0.Zh();
            return;
        }
        jQp0.PjT(v, s);
    }

    public void PjT(boolean z, boolean z1) {
        this.PjT(this.PjT, z, z1);
    }

    public boolean Qf() {
        return this.SM;
    }

    public void RD() {
        cz cz0 = this.ub;
        if(cz0 != null) {
            cz0.qla();
        }
        cz cz1 = this.gK;
        if(cz1 != null) {
            cz1.qla();
        }
        if(this.VY > 0L) {
            this.tY += SystemClock.elapsedRealtime() - this.VY;
            this.VY = 0L;
        }
        KM kM0 = this.PjT;
        if(kM0 != null) {
            kM0.Zh(false);
            this.Zh(this.PjT, false);
            this.PjT(this.PjT, true, false);
        }
        if(this.Zh != null && cRA.Au(this.qj)) {
            this.Zh.Zh(false);
            this.Zh(this.Zh, false);
            this.PjT(this.Zh, true, false);
        }
    }

    public void ReZ(boolean z) {
        this.Zh(this.PjT, z);
    }

    public boolean ReZ() {
        return this.OMu;
    }

    public void SM() {
        this.PjT.PjT("showPlayableEndCardOverlay", null);
        this.qZS.OMu.sendEmptyMessageDelayed(600, 1000L);
        com.bytedance.sdk.openadsdk.component.reward.PjT.gK.6 gK$60 = () -> {
            gK.this.rds = true;
            gK.this.zYH = false;
            gK.this.qZS.OMu.removeMessages(600);
            gK.this.qZS.OMu.removeMessages(700);
            gK.this.qZS.OMu.removeMessages(900);
            gK.this.qZS.wN.cr(false);
            gK.this.qZS.ltE.set(true);
            gK.this.qZS.wKV.qla();
            gK.this.qj.en();
            if(!gK.this.qj.en() && wN.Au(cRA.PjT(gK.this.qj))) {
                View view0 = gK.this.qZS.Zd.DWo();
                View.OnClickListener view$OnClickListener0 = (View.OnClickListener)view0.getTag(view0.getId());
                if(view$OnClickListener0 != null) {
                    PjT gK$PjT0 = new PjT(gK.this.qZS, view0, view$OnClickListener0);
                    view0.setOnClickListener(gK$PjT0);
                    view0.setOnTouchListener(gK$PjT0);
                }
            }
        };
        this.qZS.OMu.postDelayed(gK$60, 1000L);
        com.bytedance.sdk.openadsdk.utils.xs xs0 = this.qZS.Xtz;
        if(xs0 != null) {
            xs0.PjT(0L);
        }

        class com.bytedance.sdk.openadsdk.component.reward.PjT.gK.6 implements Runnable {
            final gK PjT;

            @Override
            public void run() {
                gK.this.VY();
            }
        }

    }

    public void Sks() {
        cz cz0 = this.ub;
        if(cz0 != null) {
            cz0.xs();
        }
        cz cz1 = this.gK;
        if(cz1 != null) {
            cz1.xs();
        }
        if(this.VY == 0L) {
            this.VY = SystemClock.elapsedRealtime();
        }
        KM kM0 = this.PjT;
        if(kM0 != null) {
            kM0.qj();
            cz cz2 = this.ub;
            if(cz2 != null) {
                if(cz2.getVisibility() == 0) {
                    this.PjT.Zh(true);
                    this.Zh(this.PjT, true);
                    this.PjT(this.PjT, false, true);
                    if(cRA.DWo(this.qj) && !this.rds && this.qZS.Zh.en()) {
                        this.SM();
                    }
                }
                else {
                    this.PjT.Zh(false);
                    this.Zh(this.PjT, false);
                    this.PjT(this.PjT, true, false);
                }
            }
        }
        if(this.Zh != null && cRA.Au(this.qj)) {
            this.Zh.qj();
            cz cz3 = this.gK;
            if(cz3 != null) {
                if(cz3.getVisibility() == 0) {
                    this.Zh.Zh(true);
                    this.Zh(this.Zh, true);
                    this.PjT(this.Zh, false, true);
                    if(!this.rds && this.qZS.Zh.en()) {
                        this.tY();
                    }
                }
                else {
                    this.Zh.Zh(false);
                    this.Zh(this.Zh, false);
                    this.PjT(this.Zh, true, false);
                }
            }
        }
        com.bytedance.sdk.openadsdk.cr.qj qj0 = this.JQp;
        if(qj0 != null) {
            qj0.XX();
        }
    }

    // 检测为 Lambda 实现
    private void VY() [...]

    public void XX() {
        c c0 = this.qj.MWx();
        if(c0 == null) {
            return;
        }
        String s = c0.M();
        this.fA = s;
        if(TextUtils.isEmpty(s)) {
            return;
        }
        this.fA = gK.PjT(this.fA, this.qj, this.xs, this.xE, this.qla);
        com.bytedance.sdk.openadsdk.component.reward.PjT.gK.3 gK$30 = new com.bytedance.sdk.openadsdk.core.widget.PjT.JQp(ub.PjT(), this.Zh, this.qj.dIF(), this.JQp, this.qj.IJ() || cRA.XX(this.qj)) {
            final gK PjT;

            @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
            public void onPageFinished(WebView webView0, String s) {
                super.onPageFinished(webView0, s);
                JQp jQp0 = gK.this.Au;
                if(jQp0 != null) {
                    jQp0.cz();
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
            public void onPageStarted(WebView webView0, String s, Bitmap bitmap0) {
                super.onPageStarted(webView0, s, bitmap0);
                JQp jQp0 = gK.this.Au;
                if(jQp0 != null) {
                    jQp0.JQp();
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
            public void onReceivedError(WebView webView0, int v, String s, String s1) {
                if(gK.this.PjT(s1)) {
                    return;
                }
                gK.this.Sks = false;
                gK.this.cz = v;
                gK.this.XX = s;
                if(gK.this.Au != null) {
                    try {
                        JSONObject jSONObject0 = new JSONObject();
                        if(Build.VERSION.SDK_INT >= 23) {
                            jSONObject0.put("code", v);
                            jSONObject0.put("msg", s);
                        }
                        gK.this.Au.PjT(jSONObject0);
                    }
                    catch(JSONException unused_ex) {
                    }
                }
                super.onReceivedError(webView0, v, s, s1);
            }

            @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
            @TargetApi(23)
            public void onReceivedError(WebView webView0, WebResourceRequest webResourceRequest0, WebResourceError webResourceError0) {
                if(webResourceRequest0 != null && webResourceRequest0.getUrl() != null) {
                    String s = webResourceRequest0.getUrl().toString();
                    if(gK.this.PjT(s)) {
                        return;
                    }
                }
                gK.this.Sks = false;
                if(gK.this.Au != null) {
                    try {
                        JSONObject jSONObject0 = new JSONObject();
                        if(Build.VERSION.SDK_INT >= 23 && webResourceError0 != null) {
                            jSONObject0.put("code", webResourceError0.getErrorCode());
                            jSONObject0.put("msg", webResourceError0.getDescription());
                        }
                        gK.this.Au.PjT(jSONObject0);
                    }
                    catch(JSONException unused_ex) {
                    }
                }
                if(webResourceError0 != null) {
                    gK.this.cz = webResourceError0.getErrorCode();
                    gK.this.XX = String.valueOf(webResourceError0.getDescription());
                }
                if(webResourceRequest0 == null) {
                    return;
                }
                super.onReceivedError(webView0, webResourceRequest0, webResourceError0);
            }

            @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
            @TargetApi(21)
            public void onReceivedHttpError(WebView webView0, WebResourceRequest webResourceRequest0, WebResourceResponse webResourceResponse0) {
                if(webResourceRequest0 != null && webResourceRequest0.isForMainFrame()) {
                    gK.this.Sks = false;
                    if(webResourceResponse0 != null) {
                        gK.this.cz = webResourceResponse0.getStatusCode();
                        gK.this.XX = "onReceivedHttpError";
                    }
                }
                if(gK.this.Au != null) {
                    try {
                        JSONObject jSONObject0 = new JSONObject();
                        if(webResourceResponse0 != null) {
                            jSONObject0.put("code", webResourceResponse0.getStatusCode());
                            jSONObject0.put("msg", webResourceResponse0.getReasonPhrase());
                        }
                        gK.this.Au.PjT(jSONObject0);
                    }
                    catch(JSONException unused_ex) {
                    }
                }
                if(webResourceRequest0 != null) {
                    super.onReceivedHttpError(webView0, webResourceRequest0, webResourceResponse0);
                }
            }
        };
        this.gK.setWebViewClient(gK$30);
        this.gK.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.PjT.cr(this.Zh, this.JQp) {
            final gK PjT;

            @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.cr
            public void onProgressChanged(WebView webView0, int v) {
                super.onProgressChanged(webView0, v);
                if(gK.this.qZS.XX && gK.this.qZS.fA != null) {
                    gK.this.qZS.fA.PjT(webView0, v, gK.this.kFP);
                }
            }
        });
        com.bytedance.sdk.openadsdk.utils.Owx.PjT(this.gK, this.fA);
        this.Sks = true;
    }

    public void XX(boolean z) {
        this.zYH = z;
    }

    public void Yo() {
        JQp jQp0 = this.Au;
        if(jQp0 != null) {
            jQp0.XX();
        }
    }

    public void ZX() {
        JQp jQp0 = this.Au;
        if(jQp0 != null) {
            jQp0.ReZ();
            this.Au.cr();
        }
    }

    // 去混淆评级： 低(20)
    public boolean Zd() {
        return this.RD && this.Owx.get();
    }

    void Zh() {
        this.Lrd = this.qZS.rds.findViewById(0x1020002);
        com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = this.qZS;
        this.wN = pjT0.XX;
        if(pjT0.XX) {
            xs xs0 = this.Co;
            if(xs0 != null) {
                this.ub = xs0.cr();
                goto label_14;
            }
            goto label_8;
        }
        else {
        label_8:
            cz cz0 = (cz)pjT0.ig.findViewById(qla.fDm);
            this.ub = cz0;
            if(cz0 == null || !Owx.Zh(this.qj)) {
                qZS.PjT(this.ub, 8);
            }
            else {
                this.ub.JQp();
            }
        }
    label_14:
        cz cz1 = (cz)this.qZS.ig.findViewById(qla.xE);
        this.gK = cz1;
        if(cz1 == null || !cRA.XX(this.qj) || !cRA.Au(this.qj)) {
            qZS.PjT(this.gK, 8);
        }
        else {
            this.gK.JQp();
            this.gK.setDisplayZoomControls(false);
        }
        cz cz2 = this.ub;
        if(cz2 != null) {
            cz2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                final gK PjT;

                @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
                public void onGlobalLayout() {
                    if(gK.this.ub != null && gK.this.ub.getViewTreeObserver() != null) {
                        gK.this.ub.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        int v = gK.this.ub.getMeasuredWidth();
                        int v1 = gK.this.ub.getMeasuredHeight();
                        if(gK.this.ub.getVisibility() == 0) {
                            gK.this.PjT(v, v1);
                        }
                    }
                }
            });
        }
        cz cz3 = this.gK;
        if(cz3 != null) {
            cz3.setLandingPage(true);
            this.gK.setTag((cRA.XX(this.qj) ? this.xf : "landingpage_endcard"));
            this.gK.setWebViewClient(new com.bytedance.sdk.component.SM.cz.PjT());
            this.gK.setMaterialMeta(this.qj.RXa());
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.xf.SM
    public void Zh(int v) {
        int v1 = this.wKV;
        if(v1 <= 0 && v > 0) {
            this.cr(false);
        }
        else if(v1 > 0 && v == 0) {
            this.cr(true);
        }
        this.wKV = v;
    }

    public void Zh(KM kM0, boolean z) {
        try {
            this.qZS.cRA.cr(z);
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("viewStatus", ((int)z));
            kM0.PjT("viewableChange", jSONObject0);
        }
        catch(Exception unused_ex) {
        }
    }

    public void Zh(boolean z) {
        this.PjT(this.PjT, z);
    }

    public String cRA() {
        return this.cr;
    }

    public void cr(boolean z) {
        if(cRA.Zh(this.qj)) {
            return;
        }
        this.JQp(z);
    }

    public boolean cr() {
        return this.IJ;
    }

    public void cz() {
        if(!TextUtils.isEmpty(Owx.PjT(this.qZS.IJ, this.qj))) {
            return;
        }
        if(this.qj != null && !this.qj.iZF() && this.cI == null && this.ub()) {
            this.Ld = this.qj.MN();
            this.cI = com.bytedance.sdk.openadsdk.XX.Zh.PjT().Zh();
            int v = com.bytedance.sdk.openadsdk.XX.Zh.PjT().PjT(this.cI, this.Ld);
            this.dwk = v;
            this.MWx = v <= 0 ? 0 : 2;
            if(!TextUtils.isEmpty(this.Ld)) {
                com.bytedance.sdk.openadsdk.cr.qj qj0 = this.JQp;
                if(qj0 != null) {
                    qj0.PjT(this.MWx);
                }
                com.bytedance.sdk.openadsdk.cr.ReZ.PjT.PjT(this.zZ, this.qj, "landingpage_endcard", this.cI, this.Ld);
            }
        }
        if((TextUtils.isEmpty(this.cr) || !this.cr.contains("play.google.com/store")) && !com.bytedance.sdk.openadsdk.core.model.gK.cz(this.qj) && !com.bytedance.sdk.openadsdk.core.model.gK.JQp(this.qj)) {
            Log.d("TTAD.RFWVM", "preLoadEndCardForce: return mShouldPreloadEndCard " + this.ReZ + ",webViewIsLoading " + this.CY);
            if(this.ReZ) {
                if(this.ub != null && !TextUtils.isEmpty(this.cr) && Owx.Zh(this.qj)) {
                    if(this.CY) {
                        return;
                    }
                    String s = this.cr + "&is_pre_render=1";
                    com.bytedance.sdk.openadsdk.cr.qj qj1 = this.JQp;
                    if(qj1 != null) {
                        qj1.cr();
                    }
                    if(cRA.XX(this.qj)) {
                        com.bytedance.sdk.openadsdk.core.xf.ReZ.PjT.PjT().Zh(this.qj);
                    }
                    com.bytedance.sdk.openadsdk.utils.Owx.PjT(this.ub, s);
                    this.qZS.cRA.PjT(s);
                    this.CY = true;
                    return;
                }
                if(Owx.ReZ(this.qj)) {
                    this.qZS.Co.ReZ();
                }
            }
            return;
        }
        this.SM = true;
    }

    public void cz(boolean z) {
        this.IJ = true;
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("endcard_overlay_render_type", (Owx.ReZ(this.qj) ? 7 : 0));
        }
        catch(Throwable unused_ex) {
        }
        com.bytedance.sdk.openadsdk.cr.ReZ.Zh(this.qj, this.xf, "use_second_endcard", jSONObject0);
        this.VY = SystemClock.elapsedRealtime();
        try {
            if(!Owx.ReZ(this.qj)) {
                this.PjT.PjT("click_endcard_close", null);
            }
            else if(z) {
                this.qZS.Co.Au();
                com.bytedance.sdk.openadsdk.cr.ReZ.Zh(this.qj, this.xf, "endcard_close_skip", jSONObject0);
            }
        }
        catch(Exception unused_ex) {
        }
        this.qZS.Xtz.PjT(((long)this.qZS.Au));
    }

    static int fDm(gK gK0) {
        int v = gK0.oG;
        gK0.oG = v + 1;
        return v;
    }

    public com.bytedance.sdk.openadsdk.cr.qj fDm() {
        return this.JQp;
    }

    public boolean gK() {
        return this.Owx.get();
    }

    public void iZZ() {
        JQp jQp0 = this.Au;
        if(jQp0 != null) {
            jQp0.Au();
        }
    }

    public boolean ig() {
        return this.zYH;
    }

    public void kph() {
        com.bytedance.sdk.openadsdk.cr.qj qj0 = this.JQp;
        if(qj0 != null) {
            qj0.JQp();
        }
    }

    public boolean ltE() {
        return this.RD;
    }

    public void qZS() {
        qZS.PjT(this.gK, 8);
    }

    public cz qj() {
        return this.gK;
    }

    public void qla() {
        if(cRA.JQp(this.qj)) {
            Owx owx0 = this.qj;
            if(owx0 != null) {
                c c0 = owx0.MWx();
                if(c0 != null) {
                    this.cr = c0.M();
                }
            }
        }
        else {
            this.cr = cRA.xs(this.qj);
        }
        String s = gK.PjT(this.cr, this.qj, this.xs, this.xE, this.qla);
        this.cr = s;
        if(!TextUtils.isEmpty(s)) {
            this.kph = this.cr.contains("use_second_endcard=1");
        }
    }

    public boolean rds() {
        return this.ub == null || this.ub.getWebView() == null;
    }

    public int tT() {
        return this.cz;
    }

    private void tY() {
        this.Zh.PjT("showPlayableEndCardOverlay", null);
        this.qZS.OMu.sendEmptyMessageDelayed(600, 1000L);
        com.bytedance.sdk.openadsdk.component.reward.PjT.gK.5 gK$50 = () -> {
            gK.this.rds = true;
            gK.this.zYH = false;
            gK.this.qZS.OMu.removeMessages(600);
            gK.this.qZS.OMu.removeMessages(700);
            gK.this.qZS.OMu.removeMessages(900);
            gK.this.qZS.wN.cr(false);
            gK.this.qZS.ltE.set(true);
            gK.this.qZS.wKV.qla();
            gK.this.qj.en();
            if(!gK.this.qj.en() && wN.Au(cRA.PjT(gK.this.qj))) {
                View view0 = gK.this.qZS.Zd.DWo();
                View.OnClickListener view$OnClickListener0 = (View.OnClickListener)view0.getTag(view0.getId());
                if(view$OnClickListener0 != null) {
                    PjT gK$PjT0 = new PjT(gK.this.qZS, view0, view$OnClickListener0);
                    view0.setOnClickListener(gK$PjT0);
                    view0.setOnTouchListener(gK$PjT0);
                }
            }
        };
        this.qZS.OMu.postDelayed(gK$50, 1000L);
        com.bytedance.sdk.openadsdk.utils.xs xs0 = this.qZS.Xtz;
        if(xs0 != null) {
            xs0.PjT(0L);
        }

        class com.bytedance.sdk.openadsdk.component.reward.PjT.gK.5 implements Runnable {
            final gK PjT;

            @Override
            public void run() {
                gK.this.VY();
            }
        }

    }

    static int ub(gK gK0) {
        int v = gK0.xH;
        gK0.xH = v + 1;
        return v;
    }

    public boolean ub() {
        String s = this.cr;
        if(s == null) {
            return false;
        }
        try {
            return Uri.parse(s).getQueryParameterNames().contains("show_landingpage");
        }
        catch(Exception unused_ex) {
            return false;
        }
    }

    public void wN() {
        qZS.PjT(this.ub, 0);
        qZS.PjT(this.gK, 8);
    }

    static int xE(gK gK0) {
        int v = gK0.HG;
        gK0.HG = v + 1;
        return v;
    }

    public void xE() {
        cz cz0 = this.ub;
        if(cz0 != null) {
            Jo.PjT(cz0.getWebView());
        }
        cz cz1 = this.gK;
        if(cz1 != null) {
            Jo.PjT(cz1.getWebView());
        }
        long v = this.tY;
        boolean z = false;
        if(v > 0L) {
            if(this.VY > 0L) {
                this.tY = v + (SystemClock.elapsedRealtime() - this.VY);
            }
            JSONObject jSONObject0 = new JSONObject();
            try {
                jSONObject0.put("endcard_overlay_render_type", (Owx.ReZ(this.qj) ? 7 : 0));
            }
            catch(Throwable unused_ex) {
            }
            com.bytedance.sdk.openadsdk.cr.ReZ.PjT(this.qZS.Zh, this.xf, "second_endcard_duration", jSONObject0, this.tY);
        }
        this.ub = null;
        if(this.Au != null && !com.bytedance.sdk.openadsdk.core.model.gK.cr(this.qj) && !com.bytedance.sdk.openadsdk.core.model.gK.JQp(this.qj) && !Owx.ReZ(this.qj)) {
            this.Au.PjT(true);
            this.Au.xf();
        }
        KM kM0 = this.PjT;
        if(kM0 != null) {
            kM0.xf();
        }
        KM kM1 = this.Zh;
        if(kM1 != null) {
            kM1.xf();
        }
        com.bytedance.sdk.openadsdk.cr.qj qj0 = this.JQp;
        if(qj0 != null) {
            if(this.qj.IJ() || cRA.XX(this.qj)) {
                z = true;
            }
            qj0.cr(z);
        }
        AudioInfoReceiver.Zh(this);
    }

    // 去混淆评级： 低(20)
    private JQp xH() {
        int v = cRA.XX(this.qj) ? 3 : 2;
        return this.fDm ? new com.bytedance.sdk.openadsdk.cr.ub(v, "rewarded_video", this.qj) : new com.bytedance.sdk.openadsdk.cr.ub(v, "fullscreen_interstitial_ad", this.qj);
    }

    public KM xf() {
        return this.PjT;
    }

    public KM xs() {
        return this.Zh;
    }

    // 去混淆评级： 中等(90)
    public boolean yIW() {
        return Owx.ReZ(this.qj) ? this.kph && !this.IJ && this.qZS.Co.xf() : this.kph && !this.IJ && this.Owx.get() && this.RD;
    }
}

