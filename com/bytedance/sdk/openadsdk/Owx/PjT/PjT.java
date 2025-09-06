package com.bytedance.sdk.openadsdk.Owx.PjT;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bytedance.sdk.component.SM.cz;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.Owx.Au;
import com.bytedance.sdk.openadsdk.Owx.JQp;
import com.bytedance.sdk.openadsdk.Owx.XX;
import com.bytedance.sdk.openadsdk.Owx.cr;
import com.bytedance.sdk.openadsdk.core.KM;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.cRA;
import com.bytedance.sdk.openadsdk.core.widget.DWo;
import com.bytedance.sdk.openadsdk.core.widget.SM;
import com.bytedance.sdk.openadsdk.core.xf.cr.Zh;
import com.bytedance.sdk.openadsdk.cr.ReZ;
import com.bytedance.sdk.openadsdk.cr.ub;
import com.bytedance.sdk.openadsdk.utils.gK;
import com.bytedance.sdk.openadsdk.utils.wN;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class PjT {
    public interface com.bytedance.sdk.openadsdk.Owx.PjT.PjT.PjT {
        void PjT();
    }

    private String Au;
    private Au DWo;
    private final FrameLayout JQp;
    protected cz PjT;
    private final Owx ReZ;
    private final String SM;
    private KM XX;
    private final Context Zh;
    private final int cr;
    @Nullable
    private DWo cz;
    private volatile boolean fDm;
    private com.bytedance.sdk.openadsdk.Owx.PjT.PjT.PjT gK;
    @Nullable
    private com.bytedance.sdk.openadsdk.xf.cz qj;
    private AtomicBoolean qla;
    private com.bytedance.sdk.openadsdk.core.Zh.PjT ub;
    private SM xE;
    private boolean xf;
    private volatile boolean xs;

    public PjT(Context context0, Owx owx0, int v, boolean z, FrameLayout frameLayout0) {
        this(context0, owx0, v, z, frameLayout0, false);
    }

    public PjT(Context context0, Owx owx0, int v, boolean z, FrameLayout frameLayout0, boolean z1) {
        this.xf = true;
        this.qla = new AtomicBoolean(false);
        this.Zh = context0;
        this.ReZ = owx0;
        this.cr = v;
        String s = wN.ReZ(owx0.ig().getDurationSlotType());
        this.Au = s;
        int v1 = wN.PjT(s);
        if(z1) {
            this.Au = wN.Zh(v1);
        }
        this.SM = cRA.xs(owx0);
        this.JQp = frameLayout0;
        this.PjT(frameLayout0);
        this.PjT(v1);
        this.ReZ(z);
        this.XX();
    }

    public boolean JQp() {
        return this.xs;
    }

    private void PjT(int v) {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("click_scence", 3);
        this.XX = new KM(this.Zh);
        String s = this.ReZ.SW();
        this.XX.Zh(this.PjT).PjT(this.ReZ).ReZ(this.ReZ.dIF()).cr(this.ReZ.xR()).Zh(v).JQp(s).PjT(this.PjT).Zh(this.Au).PjT(hashMap0).PjT(new ub(3, this.Au, this.ReZ));
    }

    private void PjT(FrameLayout frameLayout0) {
        cz cz0 = new cz(this.Zh);
        this.PjT = cz0;
        cz0.JQp();
        this.PjT.setLayerType(2, null);
        this.PjT.setVisibility(4);
        this.PjT.setBackgroundColor(0xFF000000);
        this.PjT.setEnabled(true);
        this.PjT.setTag(this.Au);
        this.PjT.setMaterialMeta(this.ReZ.RXa());
        this.PjT.setLandingPage(true);
        frameLayout0.addView(this.PjT, new FrameLayout.LayoutParams(-1, -1));
        SM sM0 = new SM(this.Zh);
        this.xE = sM0;
        sM0.PjT(this.ReZ, this.Au, this.ub);
        frameLayout0.addView(this.xE, new FrameLayout.LayoutParams(-1, -1));
        if(this.ReZ.Os()) {
            DWo dWo0 = new DWo(this.Zh);
            this.cz = dWo0;
            dWo0.Zh();
            frameLayout0.addView(this.cz, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public static void PjT(Owx owx0, JSONObject jSONObject0) {
        if(jSONObject0 != null && owx0 != null && cRA.Zh(owx0) && owx0.fc()) {
            try {
                new JSONObject().put("is_new_playable", 1);
                jSONObject0.put("pag_json_data", "{\"is_new_playable\":1}");
            }
            catch(JSONException unused_ex) {
            }
        }
    }

    public void PjT() {
        boolean z;
        if(this.qla.getAndSet(true)) {
            return;
        }
        FrameLayout frameLayout0 = this.JQp;
        if(frameLayout0 != null) {
            frameLayout0.setVisibility(0);
        }
        if(this.fDm) {
            this.DWo.ReZ(true);
            z = false;
        }
        else {
            DWo dWo0 = this.cz;
            if(dWo0 == null) {
                this.DWo.ReZ(true);
                z = false;
            }
            else {
                dWo0.Zh(this.ReZ, this.cr);
                Au au0 = this.DWo;
                if(au0 != null) {
                    au0.KM();
                }
                z = true;
            }
        }
        if(this.DWo != null) {
            JSONObject jSONObject0 = new JSONObject();
            try {
                JSONObject jSONObject1 = new JSONObject();
                jSONObject1.put("webview_state", this.DWo.ig());
                jSONObject1.put("has_loading", z);
                jSONObject1.put("is_new_playable", 1);
                jSONObject0.put("pag_json_data", jSONObject1.toString());
                jSONObject0.put("playable_event", "start_show_plb");
            }
            catch(Throwable unused_ex) {
            }
            ReZ.Zh(this.ReZ, this.Au, "playable_track", jSONObject0);
            this.DWo.cz(com.bytedance.sdk.openadsdk.core.xf.ReZ.PjT.PjT().PjT(this.ReZ));
        }
        this.PjT.setVisibility(0);
    }

    public void PjT(int v, int v1) {
        if(this.fDm) {
            return;
        }
        this.fDm = true;
        if(v == 2) {
            this.xs = true;
            this.DWo.PjT(3);
        }
        else if(v == 1) {
            this.xs = true;
            this.DWo.PjT(2);
        }
        else if(v == 3) {
            this.xs = true;
            this.DWo.PjT(4);
        }
        else if(v == 0) {
            this.DWo.PjT(1);
        }
        if(this.xs) {
            com.bytedance.sdk.openadsdk.Owx.PjT.PjT.PjT pjT$PjT0 = this.gK;
            if(pjT$PjT0 != null) {
                pjT$PjT0.PjT();
            }
        }
        if(this.qla.get()) {
            Au au0 = this.DWo;
            if(au0 != null) {
                au0.ReZ(true);
            }
        }
        DWo dWo0 = this.cz;
        if(dWo0 != null) {
            dWo0.post(new Runnable() {
                final PjT ReZ;

                @Override
                public void run() {
                    if(PjT.this.xs) {
                        PjT.this.xE.setVisibility(0);
                        PjT.this.PjT(true);
                    }
                    PjT.this.cz.ReZ();
                    if(PjT.this.qla.get()) {
                        JSONObject jSONObject0 = new JSONObject();
                        try {
                            JSONObject jSONObject1 = new JSONObject();
                            jSONObject1.put("remove_loading_page_type", v);
                            jSONObject1.put("remove_loading_page_reason", v1);
                            jSONObject1.put("playable_url", PjT.this.SM);
                            jSONObject1.put("duration", PjT.this.cz.getDisplayDuration());
                            jSONObject1.put("is_new_playable", 1);
                            jSONObject0.put("pag_json_data", jSONObject1.toString());
                            jSONObject0.put("playable_event", "remove_loading_page");
                        }
                        catch(Throwable unused_ex) {
                        }
                        ReZ.Zh(PjT.this.ReZ, PjT.this.Au, "playable_track", jSONObject0);
                    }
                }
            });
        }
    }

    public void PjT(com.bytedance.sdk.openadsdk.Owx.PjT.PjT.PjT pjT$PjT0) {
        this.gK = pjT$PjT0;
    }

    public void PjT(com.bytedance.sdk.openadsdk.core.Zh.PjT pjT0) {
        this.ub = pjT0;
        if(this.cz != null && this.cz.getDownloadButton() != null) {
            com.bytedance.sdk.openadsdk.core.JQp.Au au0 = this.cz.getDownloadButton();
            au0.setOnClickListener(pjT0);
            au0.setOnTouchListener(pjT0);
        }
        SM sM0 = this.xE;
        if(sM0 != null) {
            sM0.setClickListener(pjT0);
        }
    }

    public void PjT(Zh zh0) {
        KM kM0 = this.XX;
        if(kM0 != null) {
            kM0.PjT(zh0);
        }
    }

    public void PjT(boolean z) {
        Au au0 = this.DWo;
        if(au0 != null) {
            au0.PjT(z);
        }
    }

    public void PjT(boolean z, com.bytedance.sdk.openadsdk.xf.cz cz0) {
        this.qj = cz0;
        this.DWo.Zh(z);
        com.bytedance.sdk.openadsdk.core.xf.ReZ.PjT.PjT().Zh(this.ReZ);
        this.PjT.a_(this.SM);
        Au au0 = this.DWo;
        if(au0 != null) {
            au0.cz(com.bytedance.sdk.openadsdk.core.xf.ReZ.PjT.PjT().PjT(this.ReZ));
            this.DWo.Au(this.SM);
        }
    }

    private void ReZ(boolean z) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("cid", this.ReZ.dIF());
            jSONObject0.put("log_extra", this.ReZ.xR());
        }
        catch(Throwable unused_ex) {
        }
        if(com.bytedance.sdk.openadsdk.core.SM.Zh().ltE()) {
            XX.PjT(new com.bytedance.sdk.openadsdk.Owx.XX.PjT() {
                final PjT PjT;

            });
        }
        Au au0 = Au.PjT(com.bytedance.sdk.openadsdk.core.ub.PjT(), this.PjT.getWebView(), new com.bytedance.sdk.openadsdk.Owx.ReZ() {
            final PjT PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.ReZ
            public void PjT(String s, JSONObject jSONObject0) {
                if(PjT.this.XX != null) {
                    PjT.this.XX.PjT(s, jSONObject0);
                }
            }
        }, new com.bytedance.sdk.openadsdk.Owx.PjT() {
            final PjT PjT;

            // 去混淆评级： 中等(120)
            @Override  // com.bytedance.sdk.openadsdk.Owx.PjT
            public cr PjT() {
                return cr.XX;
            }

            @Override  // com.bytedance.sdk.openadsdk.Owx.PjT
            public void PjT(int v, String s) {
                PjT.this.xf = false;
                switch(v) {
                    case 2: 
                    case 3: 
                    case 4: {
                        PjT.this.PjT(2, v);
                        return;
                    }
                    case 5: {
                        PjT.this.PjT(3, 5);
                        return;
                    }
                    default: {
                        PjT.this.PjT(1, 0);
                    }
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.Owx.PjT
            public void PjT(JSONObject jSONObject0) {
                if(jSONObject0 == null) {
                    jSONObject0 = new JSONObject();
                }
                try {
                    JSONObject jSONObject1 = new JSONObject();
                    jSONObject1.put("is_new_playable", 1);
                    if(PjT.this.ReZ.Fx()) {
                        jSONObject1.put("is_pre_render", 1);
                    }
                    jSONObject0.put("pag_json_data", jSONObject1.toString());
                }
                catch(JSONException jSONException0) {
                    RD.Zh("PlayableManager", jSONException0.getMessage());
                }
                ReZ.Zh(PjT.this.ReZ, PjT.this.Au, "playable_track", jSONObject0);
            }

            @Override  // com.bytedance.sdk.openadsdk.Owx.PjT
            public void Zh() {
                PjT.this.XX.ReZ(true);
                if(PjT.this.qj != null) {
                    PjT.this.qj.PjT();
                }
            }
        });
        this.DWo = au0;
        au0.XX(this.SM).JQp(com.bytedance.sdk.openadsdk.common.Zh.PjT(com.bytedance.sdk.openadsdk.core.ub.PjT())).Zh("").PjT("open_news").cr(com.bytedance.sdk.openadsdk.common.Zh.cr()).ReZ(jSONObject0).ReZ(cRA.qj(this.ReZ)).cr(true).PjT(z).ReZ(false).PjT(cRA.Owx(this.ReZ)).Zh(cRA.Owx(this.ReZ)).PjT("sdkEdition", "7.1.0.4").JQp(cRA.cz(this.ReZ)).cz(this.Au);
        this.DWo.PjT(JQp.Zh(this.Zh));
        Set set0 = this.DWo.qj();
        WeakReference weakReference0 = new WeakReference(this.DWo);
        for(Object object0: set0) {
            String s = (String)object0;
            if(!"subscribe_app_ad".equals(s) && !"adInfo".equals(s) && !"webview_time_track".equals(s) && !"download_app_ad".equals(s)) {
                com.bytedance.sdk.component.PjT.ub ub0 = this.XX.Zh();
                if(ub0 != null) {
                    ub0.PjT(s, new com.bytedance.sdk.component.PjT.JQp() {
                        final PjT Zh;

                        @Override  // com.bytedance.sdk.component.PjT.JQp
                        public Object PjT(@NonNull Object object0, @NonNull com.bytedance.sdk.component.PjT.cz cz0) throws Exception {
                            return this.PjT(((JSONObject)object0), cz0);
                        }

                        public JSONObject PjT(@NonNull JSONObject jSONObject0, @NonNull com.bytedance.sdk.component.PjT.cz cz0) {
                            try {
                                Au au0 = (Au)weakReference0.get();
                                return au0 == null ? null : au0.cr(this.PjT(), jSONObject0);
                            }
                            catch(Throwable unused_ex) {
                                return null;
                            }
                        }
                    });
                }
            }
        }
    }

    public void ReZ() {
        if(this.qla.get()) {
            Au au0 = this.DWo;
            if(au0 != null) {
                au0.ReZ(false);
            }
        }
    }

    private void XX() {
        this.PjT.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.PjT.JQp(com.bytedance.sdk.openadsdk.core.ub.PjT(), this.XX, this.ReZ.dIF(), null, true) {
            final PjT PjT;

            @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
            public void onPageFinished(WebView webView0, String s) {
                super.onPageFinished(webView0, s);
                if(PjT.this.DWo != null) {
                    PjT.this.DWo.SM(s);
                }
                if(PjT.this.xf) {
                    PjT.this.PjT(0, 0);
                    ReZ.PjT(System.currentTimeMillis(), PjT.this.ReZ, PjT.this.Au, "py_loading_success");
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
            public void onReceivedError(WebView webView0, int v, String s, String s1) {
                super.onReceivedError(webView0, v, s, s1);
                PjT.this.xf = false;
                if(PjT.this.DWo != null) {
                    PjT.this.DWo.cz(com.bytedance.sdk.openadsdk.core.xf.ReZ.PjT.PjT().PjT(PjT.this.ReZ));
                    PjT.this.DWo.PjT(v, s, s1);
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
            @RequiresApi(api = 23)
            public void onReceivedError(WebView webView0, WebResourceRequest webResourceRequest0, WebResourceError webResourceError0) {
                super.onReceivedError(webView0, webResourceRequest0, webResourceError0);
                if(Build.VERSION.SDK_INT < 23) {
                    return;
                }
                if(webResourceRequest0.isForMainFrame()) {
                    PjT.this.xf = false;
                    if(PjT.this.DWo != null && webResourceError0 != null) {
                        boolean z = com.bytedance.sdk.openadsdk.core.xf.ReZ.PjT.PjT().PjT(PjT.this.ReZ);
                        PjT.this.DWo.cz(z);
                        int v = webResourceError0.getErrorCode();
                        String s = String.valueOf(webResourceError0.getDescription());
                        String s1 = String.valueOf(webResourceRequest0.getUrl());
                        PjT.this.DWo.PjT(v, s, s1);
                    }
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
            public void onReceivedHttpError(WebView webView0, WebResourceRequest webResourceRequest0, WebResourceResponse webResourceResponse0) {
                super.onReceivedHttpError(webView0, webResourceRequest0, webResourceResponse0);
                if(webResourceRequest0.isForMainFrame()) {
                    PjT.this.xf = false;
                    if(PjT.this.DWo != null) {
                        boolean z = com.bytedance.sdk.openadsdk.core.xf.ReZ.PjT.PjT().PjT(PjT.this.ReZ);
                        PjT.this.DWo.cz(z);
                        boolean z1 = webResourceRequest0.isForMainFrame();
                        String s = webResourceRequest0.getUrl().toString();
                        int v = webResourceResponse0.getStatusCode();
                        PjT.this.DWo.PjT(z1, s, v);
                    }
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
            public WebResourceResponse shouldInterceptRequest(WebView webView0, String s) {
                try {
                    if(PjT.this.ReZ.MWx() != null && !TextUtils.isEmpty(PjT.this.ReZ.MWx().N())) {
                        if(PjT.this.DWo != null) {
                            PjT.this.DWo.DWo(s);
                        }
                        String s1 = cRA.xs(PjT.this.ReZ);
                        String s2 = PjT.this.ReZ.MWx().N();
                        WebResourceResponse webResourceResponse0 = com.bytedance.sdk.openadsdk.core.xf.ReZ.PjT.PjT().PjT(s2, s1, s);
                        if(webResourceResponse0 != null) {
                            if(PjT.this.DWo != null) {
                                PjT.this.DWo.qj(s);
                            }
                            return webResourceResponse0;
                        }
                        return super.shouldInterceptRequest(webView0, s);
                    }
                    return super.shouldInterceptRequest(webView0, s);
                }
                catch(Throwable unused_ex) {
                    return super.shouldInterceptRequest(webView0, s);
                }
            }
        });
        this.PjT.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.PjT.cr(this.XX) {
            final PjT PjT;

            @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.cr
            public boolean onConsoleMessage(ConsoleMessage consoleMessage0) {
                return super.onConsoleMessage(consoleMessage0);
            }

            @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.cr
            public void onProgressChanged(WebView webView0, int v) {
                super.onProgressChanged(webView0, v);
                if(PjT.this.cz != null && PjT.this.cz.getVisibility() == 0) {
                    PjT.this.cz.setProgress(v);
                }
            }
        });
        com.bytedance.sdk.openadsdk.core.widget.PjT.ReZ.PjT(this.Zh).PjT(false).Zh(false).PjT(this.PjT.getWebView());
        this.PjT.setUserAgentString(gK.PjT(this.PjT.getWebView(), 7104));
        this.PjT.setMixedContentMode(0);
    }

    public void Zh() {
        if(this.qla.get()) {
            Au au0 = this.DWo;
            if(au0 != null) {
                au0.ReZ(true);
            }
        }
    }

    public void Zh(boolean z) {
        Au au0 = this.DWo;
        if(au0 != null) {
            au0.JQp(z);
        }
    }

    public void cr() {
        Au au0 = this.DWo;
        if(au0 != null) {
            au0.wN();
        }
        cz cz0 = this.PjT;
        if(cz0 != null) {
            cz0.xE();
        }
        KM kM0 = this.XX;
        if(kM0 != null) {
            kM0.xf();
        }
        this.PjT = null;
    }

    public boolean cz() {
        return this.XX == null ? false : this.XX.cz();
    }
}

