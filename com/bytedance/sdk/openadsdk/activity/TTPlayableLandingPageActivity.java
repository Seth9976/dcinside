package com.bytedance.sdk.openadsdk.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.SM.cz;
import com.bytedance.sdk.component.utils.KM.PjT;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.Owx.Au;
import com.bytedance.sdk.openadsdk.Owx.XX;
import com.bytedance.sdk.openadsdk.XX.Zh;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.Jo;
import com.bytedance.sdk.openadsdk.core.KM;
import com.bytedance.sdk.openadsdk.core.Lrd;
import com.bytedance.sdk.openadsdk.core.Zh.cr;
import com.bytedance.sdk.openadsdk.core.cRA;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.core.widget.DWo;
import com.bytedance.sdk.openadsdk.core.widget.SM;
import com.bytedance.sdk.openadsdk.core.widget.fDm;
import com.bytedance.sdk.openadsdk.core.widget.xs;
import com.bytedance.sdk.openadsdk.cr.ReZ;
import com.bytedance.sdk.openadsdk.cr.cr.JQp;
import com.bytedance.sdk.openadsdk.cr.qj;
import com.bytedance.sdk.openadsdk.utils.gK;
import com.bytedance.sdk.openadsdk.utils.qZS;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

public class TTPlayableLandingPageActivity extends TTBaseActivity implements PjT, cr {
    private boolean Au;
    private final AtomicInteger Co;
    private RelativeLayout DWo;
    private boolean IJ;
    private cz JQp;
    private String Jo;
    private boolean KM;
    private String Lrd;
    private com.bytedance.sdk.openadsdk.Owx.PjT.PjT MWx;
    private JQp OMu;
    private KM Owx;
    cRA PjT;
    private com.bytedance.sdk.openadsdk.ltE.PjT.PjT.cz Qf;
    private KM RD;
    final AtomicBoolean ReZ;
    private boolean SM;
    private int Sks;
    private qj VY;
    private boolean Yo;
    private final AtomicBoolean ZX;
    private int Zd;
    TTAdDislikeToast Zh;
    private final String cRA;
    protected com.bytedance.sdk.openadsdk.xf.JQp cr;
    private boolean cz;
    private boolean dwk;
    private int fDm;
    private String gK;
    private final com.bytedance.sdk.component.utils.KM iZZ;
    private int ig;
    private ILoader kph;
    private String ltE;
    private final AtomicInteger qZS;
    private fDm qj;
    private com.bytedance.sdk.openadsdk.core.JQp.cz qla;
    private Au rds;
    private String tT;
    private static final com.bytedance.sdk.openadsdk.Owx.XX.PjT tY;
    private SM ub;
    private final AtomicInteger wN;
    private DWo xE;
    private int xH;
    private xs xf;
    private Context xs;
    private Owx yIW;

    static {
        TTPlayableLandingPageActivity.tY = new com.bytedance.sdk.openadsdk.Owx.XX.PjT() {
        };
    }

    public TTPlayableLandingPageActivity() {
        this.cz = true;
        this.Au = false;
        this.SM = true;
        this.ReZ = new AtomicBoolean(false);
        this.cRA = "embeded_ad";
        this.iZZ = new com.bytedance.sdk.component.utils.KM(Looper.getMainLooper(), this);
        this.ZX = new AtomicBoolean(false);
        this.Co = new AtomicInteger(0);
        this.wN = new AtomicInteger(0);
        this.qZS = new AtomicInteger(0);
        this.IJ = false;
        this.cr = new com.bytedance.sdk.openadsdk.xf.JQp() {
            final TTPlayableLandingPageActivity PjT;

            @Override  // com.bytedance.sdk.openadsdk.xf.JQp
            public void PjT() {
                if(!TTPlayableLandingPageActivity.this.isFinishing() && com.bytedance.sdk.openadsdk.core.model.cRA.xE(TTPlayableLandingPageActivity.this.yIW)) {
                    TTPlayableLandingPageActivity.this.iZZ.removeMessages(2);
                    Message message0 = TTPlayableLandingPageActivity.this.PjT(1, 0);
                    TTPlayableLandingPageActivity.this.iZZ.sendMessage(message0);
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.xf.JQp
            public void PjT(int v) {
                if(TTPlayableLandingPageActivity.this.xE != null) {
                    TTPlayableLandingPageActivity.this.xE.setProgress(v);
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.xf.JQp
            public void Zh() {
                if(com.bytedance.sdk.openadsdk.core.model.cRA.qla(TTPlayableLandingPageActivity.this.yIW)) {
                    Message message0 = TTPlayableLandingPageActivity.this.PjT(0, 0);
                    TTPlayableLandingPageActivity.this.iZZ.sendMessageDelayed(message0, 1000L);
                }
            }
        };
        this.xH = 1;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void Au() {
        cz cz0 = this.JQp;
        if(cz0 == null) {
            return;
        }
        cz0.setLandingPage(true);
        this.JQp.setTag("landingpage");
        this.JQp.setMaterialMeta(this.yIW.RXa());
        qj qj0 = new qj(this.yIW, this.JQp.getWebView(), new com.bytedance.sdk.openadsdk.cr.DWo() {
            final TTPlayableLandingPageActivity PjT;

            @Override  // com.bytedance.sdk.openadsdk.cr.DWo
            public void PjT(int v) {
                com.bytedance.sdk.openadsdk.cr.ReZ.PjT.PjT(TTPlayableLandingPageActivity.this.Zd, TTPlayableLandingPageActivity.this.qZS.get(), TTPlayableLandingPageActivity.this.wN.get(), TTPlayableLandingPageActivity.this.Co.get() - TTPlayableLandingPageActivity.this.wN.get(), TTPlayableLandingPageActivity.this.yIW, "embeded_ad", v);
            }
        }, this.ig).Zh(true);
        this.VY = qj0;
        qj0.PjT("embeded_ad");
        this.VY.PjT(this.OMu);
        this.VY.PjT(this.rds);
        this.JQp.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.PjT.JQp(this.xs, this.Owx, this.gK, this.VY, true) {
            final TTPlayableLandingPageActivity PjT;

            @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
            public void onPageFinished(WebView webView0, String s) {
                super.onPageFinished(webView0, s);
                TTPlayableLandingPageActivity.this.Au = true;
                if(TTPlayableLandingPageActivity.this.isFinishing()) {
                    return;
                }
                if(TTPlayableLandingPageActivity.this.rds != null) {
                    TTPlayableLandingPageActivity.this.rds.SM(s);
                }
                try {
                    TTPlayableLandingPageActivity.this.cr.Zh();
                }
                catch(Throwable unused_ex) {
                }
                try {
                    if(TTPlayableLandingPageActivity.this.qla != null) {
                        TTPlayableLandingPageActivity.this.qla.setVisibility(8);
                    }
                    if(TTPlayableLandingPageActivity.this.cz) {
                        TTPlayableLandingPageActivity.this.DWo();
                        TTPlayableLandingPageActivity.this.PjT("py_loading_success");
                        KM kM0 = this.ReZ;
                        if(kM0 != null) {
                            kM0.Zh(true);
                        }
                    }
                }
                catch(Throwable unused_ex) {
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
            public void onPageStarted(WebView webView0, String s, Bitmap bitmap0) {
                super.onPageStarted(webView0, s, bitmap0);
            }

            @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
            public void onReceivedError(WebView webView0, int v, String s, String s1) {
                super.onReceivedError(webView0, v, s, s1);
                if(Build.VERSION.SDK_INT >= 23) {
                    return;
                }
                TTPlayableLandingPageActivity.this.cz = false;
                if(TTPlayableLandingPageActivity.this.rds != null) {
                    TTPlayableLandingPageActivity.this.rds.PjT(v, s, s1);
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
            public void onReceivedError(WebView webView0, WebResourceRequest webResourceRequest0, WebResourceError webResourceError0) {
                super.onReceivedError(webView0, webResourceRequest0, webResourceError0);
                if(Build.VERSION.SDK_INT < 23) {
                    return;
                }
                TTPlayableLandingPageActivity.this.cz = false;
                if(TTPlayableLandingPageActivity.this.rds != null && webResourceError0 != null && webResourceRequest0 != null) {
                    int v = webResourceError0.getErrorCode();
                    String s = String.valueOf(webResourceError0.getDescription());
                    String s1 = String.valueOf(webResourceRequest0.getUrl());
                    TTPlayableLandingPageActivity.this.rds.PjT(v, s, s1);
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
            @RequiresApi(api = 21)
            public void onReceivedHttpError(WebView webView0, WebResourceRequest webResourceRequest0, WebResourceResponse webResourceResponse0) {
                if(TTPlayableLandingPageActivity.this.tT != null && webResourceRequest0 != null && webResourceRequest0.getUrl() != null && TTPlayableLandingPageActivity.this.tT.equals(webResourceRequest0.getUrl().toString())) {
                    TTPlayableLandingPageActivity.this.cz = false;
                }
                if(TTPlayableLandingPageActivity.this.rds != null && webResourceRequest0 != null) {
                    try {
                        boolean z = webResourceRequest0.isForMainFrame();
                        String s = webResourceRequest0.getUrl().toString();
                        int v = webResourceResponse0.getStatusCode();
                        TTPlayableLandingPageActivity.this.rds.PjT(z, s, v);
                    }
                    catch(Throwable unused_ex) {
                    }
                }
                super.onReceivedHttpError(webView0, webResourceRequest0, webResourceResponse0);
            }

            @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
            public WebResourceResponse shouldInterceptRequest(WebView webView0, String s) {
                try {
                    if(TTPlayableLandingPageActivity.this.rds != null) {
                        TTPlayableLandingPageActivity.this.rds.DWo(s);
                    }
                    if(!TextUtils.isEmpty(TTPlayableLandingPageActivity.this.Jo)) {
                        TTPlayableLandingPageActivity.this.Co.incrementAndGet();
                    }
                    long v = System.currentTimeMillis();
                    WebResourceResponseModel webResourceResponseModel0 = Zh.PjT().PjT(TTPlayableLandingPageActivity.this.kph, TTPlayableLandingPageActivity.this.Jo, s);
                    long v1 = System.currentTimeMillis();
                    if(TTPlayableLandingPageActivity.this.OMu != null) {
                        com.bytedance.sdk.component.adexpress.cr.SM.PjT sM$PjT0 = com.bytedance.sdk.component.adexpress.cr.SM.PjT(s);
                        int v2 = webResourceResponseModel0 == null || webResourceResponseModel0.getWebResourceResponse() == null ? 2 : 1;
                        if(sM$PjT0 == com.bytedance.sdk.component.adexpress.cr.SM.PjT.PjT) {
                            TTPlayableLandingPageActivity.this.OMu.PjT(s, v, v1, v2);
                        }
                        else if(sM$PjT0 == com.bytedance.sdk.component.adexpress.cr.SM.PjT.ReZ) {
                            TTPlayableLandingPageActivity.this.OMu.Zh(s, v, v1, v2);
                        }
                    }
                    if(webResourceResponseModel0 != null && webResourceResponseModel0.getWebResourceResponse() != null) {
                        TTPlayableLandingPageActivity.this.wN.incrementAndGet();
                        if(TTPlayableLandingPageActivity.this.rds != null) {
                            TTPlayableLandingPageActivity.this.rds.qj(s);
                        }
                        return webResourceResponseModel0.getWebResourceResponse();
                    }
                    if(webResourceResponseModel0 != null && webResourceResponseModel0.getMsg() == 2) {
                        TTPlayableLandingPageActivity.this.qZS.incrementAndGet();
                    }
                    return super.shouldInterceptRequest(webView0, s);
                }
                catch(Exception unused_ex) {
                    return super.shouldInterceptRequest(webView0, s);
                }
            }
        });
        this.PjT(this.JQp);
        com.bytedance.sdk.openadsdk.utils.Owx.PjT(this.JQp, this.tT);
        Au au0 = this.rds;
        if(au0 != null) {
            au0.Au(this.tT);
        }
        this.JQp.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.PjT.cr(this.Owx, this.VY) {
            final TTPlayableLandingPageActivity PjT;

            @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.cr
            public void onProgressChanged(WebView webView0, int v) {
                super.onProgressChanged(webView0, v);
                if(TTPlayableLandingPageActivity.this.isFinishing()) {
                    return;
                }
                try {
                    TTPlayableLandingPageActivity.this.cr.PjT(v);
                }
                catch(Throwable unused_ex) {
                }
                if(TTPlayableLandingPageActivity.this.qla != null) {
                    if(v == 100) {
                        TTPlayableLandingPageActivity.this.Au = true;
                        TTPlayableLandingPageActivity.this.qla.setVisibility(8);
                        TTPlayableLandingPageActivity.this.DWo();
                        return;
                    }
                    TTPlayableLandingPageActivity.this.qla.setProgress(v);
                }
            }
        });
        this.JQp.setOnTouchListener(new View.OnTouchListener() {
            final TTPlayableLandingPageActivity PjT;

            @Override  // android.view.View$OnTouchListener
            public boolean onTouch(View view0, MotionEvent motionEvent0) {
                if(TTPlayableLandingPageActivity.this.VY != null) {
                    TTPlayableLandingPageActivity.this.VY.PjT(motionEvent0);
                }
                return false;
            }
        });
    }

    private void DWo() {
        if(this.ZX.getAndSet(true)) {
            return;
        }
        if(!com.bytedance.sdk.openadsdk.core.model.cRA.tT(this.yIW) || this.Au && this.cz) {
            cz cz0 = this.JQp;
            if(cz0 != null && this.xE != null) {
                qZS.PjT(cz0, 0);
                qZS.PjT(this.xE, 8);
            }
        }
        else if(this.ub != null && this.xE != null) {
            com.bytedance.sdk.openadsdk.core.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.core.Zh.PjT(this, this.yIW, "embeded_ad", this.Sks);
            pjT0.PjT(this.Qf);
            this.ub.PjT(this.yIW, "embeded_ad", pjT0);
            qZS.PjT(this.ub, 0);
            qZS.PjT(this.xE, 8);
            qZS.PjT(this.xf, 8);
        }
    }

    private void JQp() {
        if(this.rds != null) {
            return;
        }
        if(com.bytedance.sdk.openadsdk.core.SM.Zh().ltE()) {
            XX.PjT(TTPlayableLandingPageActivity.tY);
        }
        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.9 tTPlayableLandingPageActivity$90 = new com.bytedance.sdk.openadsdk.Owx.PjT() {
            final TTPlayableLandingPageActivity PjT;

            // 去混淆评级： 中等(120)
            @Override  // com.bytedance.sdk.openadsdk.Owx.PjT
            public com.bytedance.sdk.openadsdk.Owx.cr PjT() {
                return com.bytedance.sdk.openadsdk.Owx.cr.XX;
            }

            @Override  // com.bytedance.sdk.openadsdk.Owx.PjT
            public void PjT(int v, String s) {
                super.PjT(v, s);
                if(com.bytedance.sdk.openadsdk.core.model.cRA.tT(TTPlayableLandingPageActivity.this.yIW)) {
                    TTPlayableLandingPageActivity.this.iZZ.sendMessage(TTPlayableLandingPageActivity.this.PjT(3, v + 10));
                    TTPlayableLandingPageActivity.this.DWo();
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.Owx.PjT
            public void PjT(JSONObject jSONObject0) {
                ReZ.Zh(TTPlayableLandingPageActivity.this.yIW, "embeded_ad", "playable_track", jSONObject0);
            }
        };
        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.10 tTPlayableLandingPageActivity$100 = new com.bytedance.sdk.openadsdk.Owx.ReZ() {
            final TTPlayableLandingPageActivity PjT;

            @Override  // com.bytedance.sdk.openadsdk.Owx.ReZ
            public void PjT(String s, JSONObject jSONObject0) {
                TTPlayableLandingPageActivity.this.Owx.PjT(s, jSONObject0);
            }
        };
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("cid", this.gK);
            jSONObject0.put("log_extra", this.ltE);
            this.rds = Au.PjT(this.getApplicationContext(), this.JQp.getWebView(), tTPlayableLandingPageActivity$100, tTPlayableLandingPageActivity$90).XX(this.tT).JQp(com.bytedance.sdk.openadsdk.common.Zh.PjT(ub.PjT())).PjT("open_news").ReZ(jSONObject0).Zh("").PjT("sdkEdition", "7.1.0.4").cr(com.bytedance.sdk.openadsdk.common.Zh.cr()).cr(false).PjT(this.IJ).PjT(com.bytedance.sdk.openadsdk.core.model.cRA.Owx(this.yIW)).Zh(com.bytedance.sdk.openadsdk.core.model.cRA.Owx(this.yIW)).JQp(true);
        }
        catch(Throwable unused_ex) {
        }
        if(this.rds == null) {
            return;
        }
        if(!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.model.cRA.qj(this.yIW))) {
            this.rds.ReZ(com.bytedance.sdk.openadsdk.core.model.cRA.qj(this.yIW));
        }
        Set set0 = this.rds.qj();
        WeakReference weakReference0 = new WeakReference(this.rds);
        for(Object object0: set0) {
            String s = (String)object0;
            if(!"subscribe_app_ad".equals(s) && !"adInfo".equals(s) && !"webview_time_track".equals(s) && !"download_app_ad".equals(s)) {
                this.Owx.Zh().PjT(s, new com.bytedance.sdk.component.PjT.JQp() {
                    final TTPlayableLandingPageActivity Zh;

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

    private Message PjT(int v, int v1) {
        Message message0 = Message.obtain();
        message0.what = 2;
        message0.arg1 = v;
        if(v == 3) {
            message0.arg2 = v1;
        }
        return message0;
    }

    private void PjT(Bundle bundle0) {
        Intent intent0 = this.getIntent();
        if(intent0 != null) {
            this.fDm = intent0.getIntExtra("sdk_version", 1);
            this.gK = intent0.getStringExtra("adid");
            this.ltE = intent0.getStringExtra("log_extra");
            this.Sks = intent0.getIntExtra("source", -1);
            this.Yo = intent0.getBooleanExtra("ad_pending_download", false);
            this.tT = intent0.getStringExtra("url");
            this.Jo = intent0.getStringExtra("gecko_id");
            this.Lrd = intent0.getStringExtra("web_title");
            if(com.bytedance.sdk.openadsdk.multipro.Zh.ReZ()) {
                String s = intent0.getStringExtra("multi_process_materialmeta");
                if(s != null) {
                    try {
                        this.yIW = com.bytedance.sdk.openadsdk.core.Zh.PjT(new JSONObject(s));
                    }
                    catch(Exception exception0) {
                        RD.PjT("TTPWPActivity", "TTPlayableLandingPageActivity - onCreate MultiGlobalInfo : ", exception0);
                    }
                }
            }
            else {
                this.yIW = Lrd.PjT().Zh();
                Lrd.PjT().cz();
            }
        }
        if(bundle0 != null) {
            try {
                this.fDm = bundle0.getInt("sdk_version", 1);
                this.gK = bundle0.getString("adid");
                this.ltE = bundle0.getString("log_extra");
                this.Sks = bundle0.getInt("source", -1);
                this.Yo = bundle0.getBoolean("ad_pending_download", false);
                this.tT = bundle0.getString("url");
                this.Lrd = bundle0.getString("web_title");
                String s1 = bundle0.getString("material_meta", null);
                if(!TextUtils.isEmpty(s1)) {
                    this.yIW = com.bytedance.sdk.openadsdk.core.Zh.PjT(new JSONObject(s1));
                }
            }
            catch(Throwable unused_ex) {
            }
        }
        if(this.yIW == null) {
            this.finish();
            return;
        }
        try {
            this.IJ = ub.cr().ub(this.yIW.ig().getCodeId());
        }
        catch(Throwable throwable0) {
            RD.Zh("TTPWPActivity", throwable0.getMessage());
        }
    }

    private void PjT(cz cz0) {
        if(cz0 == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.PjT.ReZ.PjT(this.xs).PjT(false).Zh(false).PjT(cz0.getWebView());
        cz0.setUserAgentString(gK.PjT(cz0.getWebView(), this.fDm));
        cz0.setMixedContentMode(0);
    }

    private void PjT(String s) {
        ReZ.PjT(System.currentTimeMillis(), this.yIW, "embeded_ad", s);
    }

    protected void PjT() {
        if(this.xE == null) {
            return;
        }
        this.xE.Zh(this.yIW, this.xH);
        if(this.xE.getDownloadButton() != null) {
            com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.5 tTPlayableLandingPageActivity$50 = new com.bytedance.sdk.openadsdk.core.Zh.PjT(this, this.yIW, "embeded_ad", this.Sks) {
                final TTPlayableLandingPageActivity PjT;

                @Override  // com.bytedance.sdk.openadsdk.core.Zh.PjT
                public void PjT(View view0, float f, float f1, float f2, float f3, SparseArray sparseArray0, boolean z) {
                    if(this.cz != null && this.cz.Lrd() == 1 && !z) {
                        return;
                    }
                    super.PjT(view0, f, f1, f2, f3, sparseArray0, z);
                    TTPlayableLandingPageActivity.this.Yo = true;
                    TTPlayableLandingPageActivity.this.KM = true;
                    JSONObject jSONObject0 = new JSONObject();
                    try {
                        jSONObject0.put("playable_url", TTPlayableLandingPageActivity.this.tT);
                    }
                    catch(JSONException jSONException0) {
                        RD.PjT("TTPWPActivity", "onClick JSON ERROR", jSONException0);
                    }
                    ReZ.Zh(TTPlayableLandingPageActivity.this.yIW, this.XX, "click_playable_download_button_loading", jSONObject0);
                }
            };
            tTPlayableLandingPageActivity$50.PjT(this.Qf);
            this.xE.getDownloadButton().setOnClickListener(tTPlayableLandingPageActivity$50);
        }
        if(com.bytedance.sdk.openadsdk.core.model.cRA.xE(this.yIW)) {
            Message message0 = this.PjT(2, 12);
            long v = com.bytedance.sdk.openadsdk.core.model.cRA.RD(this.yIW);
            this.iZZ.sendMessageDelayed(message0, v);
        }
    }

    @Override  // com.bytedance.sdk.component.utils.KM$PjT
    public void PjT(Message message0) {
        switch(message0.what) {
            case 1: {
                qZS.PjT(this.DWo, 0);
                return;
            }
            case 2: {
                if(this.xE != null && this.xE.cr()) {
                    return;
                }
                JSONObject jSONObject0 = new JSONObject();
                try {
                    jSONObject0.put("remove_loading_page_type", message0.arg1);
                    int v = message0.arg2;
                    if(v != 0) {
                        jSONObject0.put("remove_loading_page_reason", v);
                    }
                    jSONObject0.put("playable_url", this.tT);
                    jSONObject0.put("duration", (this.xE == null ? 0L : this.xE.getDisplayDuration()));
                }
                catch(JSONException jSONException0) {
                    RD.PjT("TTPWPActivity", "handleMsg json error", jSONException0);
                }
                ReZ.Zh(this.yIW, "embeded_ad", "remove_loading_page", jSONObject0);
                this.iZZ.removeMessages(2);
                DWo dWo0 = this.xE;
                if(dWo0 != null) {
                    dWo0.ReZ();
                }
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Zh.cr
    public void PjT(boolean z) {
        this.Yo = true;
        this.KM = z;
        if(!z) {
            try {
                Toast.makeText(this.xs, "Download later", 0).show();
            }
            catch(Throwable unused_ex) {
            }
        }
        if(this.KM) {
            com.bytedance.sdk.openadsdk.ltE.PjT.PjT.cz cz0 = this.Qf;
            if(cz0 != null) {
                cz0.cr();
            }
        }
    }

    void ReZ() {
        Owx owx0 = this.yIW;
        if(owx0 != null) {
            this.PjT = new com.bytedance.sdk.openadsdk.ReZ.ReZ(this, owx0.xR(), this.yIW.na(), this.yIW.dDm().toString(), "playable");
        }
        if(this.Zh == null) {
            this.Zh = new TTAdDislikeToast(this);
            ((FrameLayout)this.findViewById(0x1020002)).addView(this.Zh);
        }
    }

    protected void ReZ(boolean z) {
        try {
            this.IJ = z;
            Drawable drawable0 = z ? com.bytedance.sdk.openadsdk.utils.DWo.PjT(this.xs, "tt_mute_wrapper") : com.bytedance.sdk.openadsdk.utils.DWo.PjT(this.xs, "tt_unmute_wrapper");
            this.xf.setImageDrawable(drawable0);
            Au au0 = this.rds;
            if(au0 != null) {
                au0.PjT(z);
            }
            com.bytedance.sdk.openadsdk.Owx.PjT.PjT pjT0 = this.MWx;
            if(pjT0 != null) {
                pjT0.PjT(z);
            }
            return;
        }
        catch(Exception exception0) {
        }
        RD.Zh("TTPWPActivity", exception0.getMessage());
    }

    private void SM() {
        RelativeLayout relativeLayout0 = this.DWo;
        if(relativeLayout0 != null) {
            relativeLayout0.setOnClickListener(new View.OnClickListener() {
                final TTPlayableLandingPageActivity PjT;

                @Override  // android.view.View$OnClickListener
                public void onClick(View view0) {
                    if(TTPlayableLandingPageActivity.this.OMu != null) {
                        TTPlayableLandingPageActivity.this.OMu.Au();
                    }
                    Message message0 = TTPlayableLandingPageActivity.this.PjT(4, 0);
                    TTPlayableLandingPageActivity.this.iZZ.sendMessage(message0);
                    TTPlayableLandingPageActivity.this.PjT("playable_close");
                    TTPlayableLandingPageActivity.this.finish();
                }
            });
        }
        fDm fDm0 = this.qj;
        if(fDm0 != null) {
            fDm0.setOnClickListener((/* 缺少LAMBDA参数 */) -> {
                if(TTPlayableLandingPageActivity.this.yIW != null && !TTPlayableLandingPageActivity.this.isFinishing()) {
                    if(TTPlayableLandingPageActivity.this.ReZ.get()) {
                        TTPlayableLandingPageActivity.this.xf();
                        return;
                    }
                    if(TTPlayableLandingPageActivity.this.PjT == null) {
                        TTPlayableLandingPageActivity.this.ReZ();
                    }
                    TTPlayableLandingPageActivity.this.PjT.PjT(new com.bytedance.sdk.openadsdk.core.cRA.PjT() {
                        final TTPlayableLandingPageActivity PjT;

                        @Override  // com.bytedance.sdk.openadsdk.core.cRA$PjT
                        public void PjT() {
                        }

                        @Override  // com.bytedance.sdk.openadsdk.core.cRA$PjT
                        public void PjT(int v, String s) {
                            if(!TTPlayableLandingPageActivity.this.ReZ.get() && !TextUtils.isEmpty(s)) {
                                TTPlayableLandingPageActivity.this.ReZ.set(true);
                                TTPlayableLandingPageActivity.this.xs();
                            }
                        }
                    });
                    cRA cRA0 = TTPlayableLandingPageActivity.this.PjT;
                    if(cRA0 != null) {
                        cRA0.PjT();
                    }
                }
            });
        }
        xs xs0 = this.xf;
        if(xs0 != null) {
            xs0.setOnClickListener(new View.OnClickListener() {
                final TTPlayableLandingPageActivity PjT;

                @Override  // android.view.View$OnClickListener
                public void onClick(View view0) {
                    TTPlayableLandingPageActivity.this.IJ = !TTPlayableLandingPageActivity.this.IJ;
                    TTPlayableLandingPageActivity.this.ReZ(TTPlayableLandingPageActivity.this.IJ);
                    if(TTPlayableLandingPageActivity.this.rds != null) {
                        TTPlayableLandingPageActivity.this.rds.PjT(TTPlayableLandingPageActivity.this.IJ);
                    }
                }
            });
        }
        if(!this.dwk) {
            this.JQp.setBackgroundColor(0xFF000000);
            qZS.PjT(this.JQp, 4);
            this.xE.Zh(this.yIW, this.xH);
        }

        class com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.3 implements View.OnClickListener {
            final TTPlayableLandingPageActivity PjT;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                TTPlayableLandingPageActivity.this.Zh();
            }
        }

    }

    private void XX() {
        String s = String.valueOf(this.yIW.joj());
        int v = ub.cr().iZZ(s).ub;
        if(v >= 0) {
            this.iZZ.sendEmptyMessageDelayed(1, ((long)v) * 1000L);
            return;
        }
        qZS.PjT(this.DWo, 0);
    }

    // 检测为 Lambda 实现
    protected void Zh() [...]

    private View cr() {
        View view0 = new com.bytedance.sdk.openadsdk.core.JQp.ReZ(this);
        ((com.bytedance.sdk.openadsdk.core.JQp.ReZ)view0).setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        if(this.dwk) {
            this.MWx = new com.bytedance.sdk.openadsdk.Owx.PjT.PjT(this.xs, this.yIW, this.xH, this.IJ, ((FrameLayout)view0), true);
        }
        else {
            this.JQp = new cz(this);
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
            this.JQp.setLayoutParams(frameLayout$LayoutParams0);
            this.JQp.setVisibility(4);
            this.qla = new com.bytedance.sdk.openadsdk.core.JQp.cz(this, null, 0x103001F);
            FrameLayout.LayoutParams frameLayout$LayoutParams1 = new FrameLayout.LayoutParams(-1, qZS.Zh(this, 3.0f));
            frameLayout$LayoutParams1.gravity = 49;
            this.qla.setLayoutParams(frameLayout$LayoutParams1);
            this.qla.setProgress(1);
            this.qla.setProgressDrawable(com.bytedance.sdk.openadsdk.utils.DWo.PjT(this, "tt_browser_progress_style"));
            this.xE = new DWo(this);
            FrameLayout.LayoutParams frameLayout$LayoutParams2 = new FrameLayout.LayoutParams(-1, -1);
            this.xE.setLayoutParams(frameLayout$LayoutParams2);
            this.xE.setClickable(true);
            this.xE.setFocusable(true);
            this.ub = new SM(this);
            FrameLayout.LayoutParams frameLayout$LayoutParams3 = new FrameLayout.LayoutParams(-1, -1);
            this.ub.setLayoutParams(frameLayout$LayoutParams3);
        }
        this.xf = new xs(this);
        FrameLayout.LayoutParams frameLayout$LayoutParams4 = new FrameLayout.LayoutParams(qZS.Zh(this, 28.0f), qZS.Zh(this, 28.0f));
        frameLayout$LayoutParams4.leftMargin = qZS.Zh(this, 12.0f);
        frameLayout$LayoutParams4.topMargin = qZS.Zh(this, 20.0f);
        this.xf.setLayoutParams(frameLayout$LayoutParams4);
        this.xf.setScaleType(ImageView.ScaleType.CENTER);
        this.xf.setImageDrawable(com.bytedance.sdk.openadsdk.utils.DWo.PjT(this, "tt_unmute_wrapper"));
        this.qj = new fDm(this);
        FrameLayout.LayoutParams frameLayout$LayoutParams5 = new FrameLayout.LayoutParams(-2, qZS.Zh(this, 28.0f));
        frameLayout$LayoutParams5.gravity = 0x800035;
        frameLayout$LayoutParams5.leftMargin = qZS.Zh(this, 16.0f);
        frameLayout$LayoutParams5.rightMargin = qZS.Zh(this, 80.0f);
        frameLayout$LayoutParams5.topMargin = qZS.Zh(this, 20.0f);
        this.qj.setLayoutParams(frameLayout$LayoutParams5);
        this.qj.setGravity(17);
        this.qj.setText(com.bytedance.sdk.component.utils.Lrd.PjT(this, "tt_reward_feedback"));
        this.qj.setTextColor(-1);
        this.qj.setTextSize(14.0f);
        this.DWo = new com.bytedance.sdk.openadsdk.core.JQp.XX(this);
        FrameLayout.LayoutParams frameLayout$LayoutParams6 = new FrameLayout.LayoutParams(qZS.Zh(this, 28.0f), qZS.Zh(this, 28.0f));
        frameLayout$LayoutParams6.gravity = 0x800035;
        frameLayout$LayoutParams6.topMargin = qZS.Zh(this, 20.0f);
        frameLayout$LayoutParams6.rightMargin = qZS.Zh(this, 24.0f);
        this.DWo.setLayoutParams(frameLayout$LayoutParams6);
        this.DWo.setBackground(com.bytedance.sdk.openadsdk.utils.DWo.PjT(this, "tt_mute_btn_bg"));
        this.DWo.setGravity(17);
        this.DWo.setVisibility(8);
        com.bytedance.sdk.openadsdk.core.JQp.cr cr0 = new com.bytedance.sdk.openadsdk.core.JQp.cr(this);
        cr0.setLayoutParams(new RelativeLayout.LayoutParams(qZS.Zh(this, 12.0f), qZS.Zh(this, 12.0f)));
        cr0.setImageDrawable(com.bytedance.sdk.component.utils.Lrd.ReZ(this, "tt_video_close_drawable"));
        cr0.setVisibility(0);
        this.DWo.addView(cr0);
        if(!this.dwk) {
            ((ViewGroup)view0).addView(this.JQp);
            ((ViewGroup)view0).addView(this.qla);
            ((ViewGroup)view0).addView(this.ub);
            ((ViewGroup)view0).addView(this.xE);
        }
        ((ViewGroup)view0).addView(this.xf);
        ((ViewGroup)view0).addView(this.qj);
        ((ViewGroup)view0).addView(this.DWo);
        return view0;
    }

    private void cz() {
        if(this.yIW.cI() == 4) {
            this.Qf = com.bytedance.sdk.openadsdk.ltE.PjT.PjT.XX.PjT(this.xs, this.yIW, "interaction");
        }
    }

    private void fDm() {
        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.7 tTPlayableLandingPageActivity$70 = new com.bytedance.sdk.openadsdk.core.Zh.PjT(this, this.yIW, "embeded_ad", this.Sks) {
            final TTPlayableLandingPageActivity PjT;

            @Override  // com.bytedance.sdk.openadsdk.core.Zh.PjT
            public void PjT(View view0, float f, float f1, float f2, float f3, SparseArray sparseArray0, boolean z) {
                if(this.cz != null && this.cz.Lrd() == 1 && !z) {
                    return;
                }
                super.PjT(view0, f, f1, f2, f3, sparseArray0, z);
                TTPlayableLandingPageActivity.this.Yo = true;
                TTPlayableLandingPageActivity.this.KM = true;
                JSONObject jSONObject0 = new JSONObject();
                try {
                    jSONObject0.put("playable_url", TTPlayableLandingPageActivity.this.tT);
                }
                catch(JSONException jSONException0) {
                    RD.PjT("TTPWPActivity", "onClick JSON ERROR", jSONException0);
                }
                ReZ.Zh(TTPlayableLandingPageActivity.this.yIW, this.XX, "click_playable_download_button_loading", jSONObject0);
            }
        };
        tTPlayableLandingPageActivity$70.PjT(this.Qf);
        com.bytedance.sdk.openadsdk.Owx.PjT.PjT pjT0 = this.MWx;
        if(pjT0 != null) {
            pjT0.PjT(tTPlayableLandingPageActivity$70);
        }
    }

    @Override  // android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        JQp jQp0 = this.OMu;
        if(jQp0 != null) {
            jQp0.Au();
        }
    }

    @Override  // android.app.Activity
    public void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
    }

    // 去混淆评级： 低(20)
    @Override  // android.app.Activity
    @SuppressLint({"SourceLockedOrientationActivity"})
    protected void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        this.finish();
    }

    @Override  // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        com.bytedance.sdk.openadsdk.Owx.PjT.PjT pjT0 = this.MWx;
        if(pjT0 != null) {
            pjT0.cr();
        }
        JQp jQp0 = this.OMu;
        if(jQp0 != null) {
            jQp0.PjT(true);
            this.OMu.xf();
        }
        this.iZZ.removeCallbacksAndMessages(null);
        try {
            if(this.getWindow() != null) {
                ((ViewGroup)this.getWindow().getDecorView()).removeAllViews();
            }
        }
        catch(Throwable unused_ex) {
        }
        if(!TextUtils.isEmpty(this.Jo)) {
            com.bytedance.sdk.openadsdk.cr.ReZ.PjT.PjT(this.wN.get(), this.Co.get(), this.yIW);
        }
        Zh.PjT().PjT(this.kph);
        cz cz0 = this.JQp;
        if(cz0 != null) {
            Jo.PjT(cz0.getWebView());
            this.JQp.xE();
        }
        this.JQp = null;
        KM kM0 = this.Owx;
        if(kM0 != null) {
            kM0.xf();
        }
        KM kM1 = this.RD;
        if(kM1 != null) {
            kM1.xf();
        }
        Au au0 = this.rds;
        if(au0 != null) {
            au0.wN();
        }
        qj qj0 = this.VY;
        if(qj0 != null) {
            qj0.cr(true);
        }
        cRA cRA0 = this.PjT;
        if(cRA0 != null) {
            cRA0.Zh();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    protected void onPause() {
        super.onPause();
        KM kM0 = this.Owx;
        if(kM0 != null) {
            kM0.Zh(false);
        }
        Au au0 = this.rds;
        if(au0 != null) {
            au0.PjT(true);
            this.rds.ReZ(false);
        }
        com.bytedance.sdk.openadsdk.Owx.PjT.PjT pjT0 = this.MWx;
        if(pjT0 != null) {
            pjT0.ReZ();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    protected void onResume() {
        super.onResume();
        KM kM0 = this.Owx;
        if(kM0 != null) {
            kM0.qj();
            cz cz0 = this.JQp;
            if(cz0 != null) {
                this.Owx.Zh(cz0.getVisibility() == 0);
            }
        }
        KM kM1 = this.RD;
        if(kM1 != null) {
            kM1.qj();
        }
        Au au0 = this.rds;
        if(au0 != null) {
            au0.ReZ(true);
        }
        qj qj0 = this.VY;
        if(qj0 != null) {
            qj0.XX();
        }
        this.IJ = true;
        this.ReZ(true);
        com.bytedance.sdk.openadsdk.Owx.PjT.PjT pjT0 = this.MWx;
        if(pjT0 != null) {
            pjT0.Zh();
        }
    }

    @Override  // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle0) {
        if(bundle0 == null) {
            bundle0 = new Bundle();
        }
        try {
            bundle0.putString("material_meta", (this.yIW == null ? null : this.yIW.dDm().toString()));
            bundle0.putInt("sdk_version", this.fDm);
            bundle0.putString("adid", this.gK);
            bundle0.putString("log_extra", this.ltE);
            bundle0.putInt("source", this.Sks);
            bundle0.putBoolean("ad_pending_download", this.Yo);
            bundle0.putString("url", this.tT);
            bundle0.putString("web_title", this.Lrd);
            bundle0.putString("event_tag", "embeded_ad");
        }
        catch(Throwable unused_ex) {
        }
        super.onSaveInstanceState(bundle0);
    }

    @Override  // android.app.Activity
    protected void onStart() {
        super.onStart();
        JQp jQp0 = this.OMu;
        if(jQp0 != null) {
            jQp0.DWo();
        }
    }

    @Override  // android.app.Activity
    protected void onStop() {
        super.onStop();
        JQp jQp0 = this.OMu;
        if(jQp0 != null) {
            jQp0.SM();
        }
        qj qj0 = this.VY;
        if(qj0 != null) {
            qj0.Au();
        }
    }

    private void qj() {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(this.yIW);
        this.OMu = new com.bytedance.sdk.openadsdk.cr.ub(3, "embeded_ad", this.yIW);
        this.Owx = new KM(this);
        String s = this.yIW.SW();
        this.Owx.Zh(this.JQp).PjT(this.yIW).PjT(arrayList0).ReZ(this.gK).cr(this.ltE).Zh("embeded_ad").Zh(this.Sks).PjT(this).PjT(this.OMu).PjT(this.cr).PjT(this.JQp).JQp(s);
        this.JQp();
    }

    private void xf() {
        TTAdDislikeToast tTAdDislikeToast0 = this.Zh;
        if(tTAdDislikeToast0 != null) {
            tTAdDislikeToast0.show(TTAdDislikeToast.getDislikeTip());
        }
    }

    private void xs() {
        TTAdDislikeToast tTAdDislikeToast0 = this.Zh;
        if(tTAdDislikeToast0 != null) {
            tTAdDislikeToast0.show(TTAdDislikeToast.getDislikeSendTip());
        }
    }
}

