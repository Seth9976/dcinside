package com.igaworks.ssp.rewardplus.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.webkit.JavascriptInterface;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.core.view.E0;
import androidx.core.view.F0;
import com.igaworks.ssp.E;
import com.igaworks.ssp.N;
import com.igaworks.ssp.R.string;
import com.igaworks.ssp.SSPErrorCode;
import com.igaworks.ssp.b;
import com.igaworks.ssp.i0;
import com.igaworks.ssp.k0;
import com.igaworks.ssp.p;
import com.igaworks.ssp.part.NonLeakingWebView;
import com.igaworks.ssp.part.interstitial.AdPopcornSSPInterstitialAd;
import com.igaworks.ssp.part.interstitial.listener.IInterstitialEventCallbackListener;
import com.igaworks.ssp.part.mix.AdPopcornSSPVideoMixAd;
import com.igaworks.ssp.part.mix.listener.IVideoMixAdEventCallbackListener;
import com.igaworks.ssp.part.video.AdPopcornSSPInterstitialVideoAd;
import com.igaworks.ssp.part.video.AdPopcornSSPRewardVideoAd;
import com.igaworks.ssp.part.video.listener.IInterstitialVideoAdEventCallbackListener;
import com.igaworks.ssp.part.video.listener.IRewardVideoAdEventCallbackListener;
import com.igaworks.ssp.t.e;
import com.igaworks.ssp.w;
import com.igaworks.ssp.y;
import org.json.JSONObject;

public class AdPopcornSSPRewardAdPlusPageActivity extends Activity implements N {
    class d extends WebViewClient {
        final AdPopcornSSPRewardAdPlusPageActivity a;

        private boolean a(WebView webView0, String s) {
            b.c(Thread.currentThread(), "urlLoading : " + s);
            if(s != null && !s.startsWith("https://nid.naver.com") && !s.startsWith("https://reward-plus")) {
                Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse(s));
                intent0.addFlags(0x10000000);
                AdPopcornSSPRewardAdPlusPageActivity.this.b.startActivity(intent0);
                return true;
            }
            webView0.loadUrl(s);
            return false;
        }

        @Override  // android.webkit.WebViewClient
        public void onPageFinished(WebView webView0, String s) {
            super.onPageFinished(webView0, s);
            b.c(Thread.currentThread(), "onPageFinished : " + s);
        }

        @Override  // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView0, WebResourceRequest webResourceRequest0) {
            try {
                String s = webResourceRequest0.getUrl().toString();
                b.c(Thread.currentThread(), "shouldOverrideUrlLoading : " + s);
                return this.a(webView0, s);
            }
            catch(Exception exception0) {
                exception0.printStackTrace();
                return false;
            }
        }

        @Override  // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView0, String s) {
            try {
                b.c(Thread.currentThread(), "shouldOverrideUrlLoading : " + s);
                return this.a(webView0, s);
            }
            catch(Exception unused_ex) {
                return false;
            }
        }
    }

    static abstract class i {
        static final int[] a;

        static {
            int[] arr_v = new int[e.values().length];
            i.a = arr_v;
            try {
                arr_v[e.L.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private final String a;
    private Context b;
    FrameLayout c;
    private NonLeakingWebView d;
    private String e;
    private AdPopcornSSPInterstitialAd f;
    private AdPopcornSSPRewardVideoAd g;
    private AdPopcornSSPInterstitialVideoAd h;
    private AdPopcornSSPVideoMixAd i;
    private final String j;
    private final String k;
    private final String l;
    private boolean m;
    private WebViewClient n;

    public AdPopcornSSPRewardAdPlusPageActivity() {
        this.a = "APSSPRewardPlus";
        this.e = "";
        this.j = "window.nativeCallback.onBackKeyPress()";
        this.k = "window.nativeCallback.dismissLoading()";
        this.l = "window.nativeCallback.showPointResultPopup(%s)";
        this.m = false;
        this.n = new d(this);
    }

    // 检测为 Lambda 实现
    private static WindowInsets a(View view0, WindowInsets windowInsets0) [...]

    // 去混淆评级： 低(20)
    private String a(String s, String s1) {
        return "window.dispatchEvent(\n   new CustomEvent(\"" + s + "\", {\n" + "           detail: {\n" + "               data: " + s1 + "\n" + "           }\n" + "       }\n" + "   )\n" + ");";
    }

    private void a() {
        try {
            b.c(Thread.currentThread(), "dismissLoadingBar");
            this.b("window.nativeCallback.dismissLoading()");
        }
        catch(Exception unused_ex) {
        }
    }

    private void a(boolean z, String s) {
        class com.igaworks.ssp.rewardplus.activity.AdPopcornSSPRewardAdPlusPageActivity.e implements Runnable {
            final String a;
            final AdPopcornSSPRewardAdPlusPageActivity b;

            com.igaworks.ssp.rewardplus.activity.AdPopcornSSPRewardAdPlusPageActivity.e(String s) {
                this.a = s;
                super();
            }

            @Override
            public void run() {
                if(AdPopcornSSPRewardAdPlusPageActivity.this.d != null) {
                    AdPopcornSSPRewardAdPlusPageActivity.this.d.clearHistory();
                    Object[] arr_object = {"", y.a(AdPopcornSSPRewardAdPlusPageActivity.this.b), this.a, "3.8.2"};
                    AdPopcornSSPRewardAdPlusPageActivity.this.d.loadUrl("https://reward-plus.adpopcorn.com/v1_5/settings?" + String.format("media_key=%s&media_name=%s&usn=%s&sdk_version=%s", arr_object));
                }
            }
        }


        class f implements Runnable {
            final String a;
            final AdPopcornSSPRewardAdPlusPageActivity b;

            f(String s) {
                this.a = s;
                super();
            }

            @Override
            public void run() {
                if(AdPopcornSSPRewardAdPlusPageActivity.this.d != null) {
                    Object[] arr_object = {"", y.a(AdPopcornSSPRewardAdPlusPageActivity.this.b), this.a, "3.8.2"};
                    AdPopcornSSPRewardAdPlusPageActivity.this.d.loadUrl("https://reward-plus.adpopcorn.com/v1_5/join-npay?" + String.format("media_key=%s&media_name=%s&usn=%s&sdk_version=%s", arr_object));
                }
            }
        }


        class g implements Runnable {
            final String a;
            final AdPopcornSSPRewardAdPlusPageActivity b;

            g(String s) {
                this.a = s;
                super();
            }

            @Override
            public void run() {
                Object[] arr_object = {"", y.a(AdPopcornSSPRewardAdPlusPageActivity.this.b), this.a, "3.8.2"};
                AdPopcornSSPRewardAdPlusPageActivity.this.d.loadUrl("https://reward-plus.adpopcorn.com/v1_5/settings?" + String.format("media_key=%s&media_name=%s&usn=%s&sdk_version=%s", arr_object));
            }
        }


        class h implements Runnable {
            final String a;
            final AdPopcornSSPRewardAdPlusPageActivity b;

            h(String s) {
                this.a = s;
                super();
            }

            @Override
            public void run() {
                Object[] arr_object = {"", y.a(AdPopcornSSPRewardAdPlusPageActivity.this.b), this.a, "3.8.2"};
                AdPopcornSSPRewardAdPlusPageActivity.this.d.loadUrl("https://reward-plus.adpopcorn.com/v1_5/settings?" + String.format("media_key=%s&media_name=%s&usn=%s&sdk_version=%s", arr_object));
            }
        }

        if(s == null || s.isEmpty()) {
            this.c(this.b.getString(string.apssp_default_unknown_error));
            this.a();
            NonLeakingWebView nonLeakingWebView2 = this.d;
            if(nonLeakingWebView2 != null) {
                nonLeakingWebView2.clearHistory();
                this.d.post(new h(this, ""));
            }
        }
        else {
            try {
                b.a(Thread.currentThread(), "callbackRegisterNpayUser result : " + z + ", response : " + s);
                int v = new JSONObject(s).getInt("result_code");
                if(z) {
                    this.d.post(new com.igaworks.ssp.rewardplus.activity.AdPopcornSSPRewardAdPlusPageActivity.e(this, ""));
                    return;
                }
                if(v != 6007) {
                    this.d.post(new f(this, ""));
                    return;
                }
                NonLeakingWebView nonLeakingWebView0 = this.d;
                if(nonLeakingWebView0 != null) {
                    nonLeakingWebView0.clearHistory();
                    Object[] arr_object = {"", y.a(this.b), "", "3.8.2"};
                    this.d.loadUrl("https://reward-plus.adpopcorn.com/v1_5/settings?" + String.format("media_key=%s&media_name=%s&usn=%s&sdk_version=%s", arr_object));
                }
            }
            catch(Exception unused_ex) {
                this.c(this.b.getString(string.apssp_default_error));
                this.a();
                NonLeakingWebView nonLeakingWebView1 = this.d;
                if(nonLeakingWebView1 != null) {
                    nonLeakingWebView1.clearHistory();
                    this.d.post(new g(this, ""));
                }
            }
        }
    }

    private void a(boolean z, String s, int v, String s1, int v1) {
        class n implements N {
            final AdPopcornSSPRewardAdPlusPageActivity a;

            @Override  // com.igaworks.ssp.N
            public void a(e t$e0, String s, boolean z) {
                AdPopcornSSPRewardAdPlusPageActivity.this.a();
                try {
                    b.a(Thread.currentThread(), "claimNaverPayPoint successListener, response : " + s);
                    if(s != null && !s.isEmpty()) {
                        int v = new JSONObject(s).getInt("point");
                        JSONObject jSONObject0 = new JSONObject();
                        jSONObject0.put("success", true);
                        jSONObject0.put("point", v);
                        AdPopcornSSPRewardAdPlusPageActivity.this.b(String.format("window.nativeCallback.showPointResultPopup(%s)", jSONObject0.toString()));
                    }
                }
                catch(Exception unused_ex) {
                }
            }

            @Override  // com.igaworks.ssp.N
            public void b(e t$e0, String s, boolean z) {
                AdPopcornSSPRewardAdPlusPageActivity.this.a();
                try {
                    b.a(Thread.currentThread(), "claimNaverPayPoint failListener, response : " + s);
                    JSONObject jSONObject0 = new JSONObject();
                    jSONObject0.put("success", false);
                    jSONObject0.put("point", 0);
                    AdPopcornSSPRewardAdPlusPageActivity.this.b("window.nativeCallback.showPointResultPopup({\"success\":false,\"point\":0})");
                }
                catch(Exception unused_ex) {
                }
            }
        }

        try {
            if(z) {
                this.a();
            }
            E.g().e();
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("ad_request_no", s);
            jSONObject0.put("advertising_id", "");
            jSONObject0.put("box_no", v1);
            jSONObject0.put("impression_campaign_type", v);
            jSONObject0.put("media_key", "");
            jSONObject0.put("placement_id", s1);
            jSONObject0.put("usn", "");
            i0.a(this.b, jSONObject0, new n(this));
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // com.igaworks.ssp.N
    public void a(e t$e0, String s, boolean z) {
        if(i.a[t$e0.ordinal()] == 1) {
            this.a(true, s);
        }
    }

    public void a(String s) {
        class l implements Runnable {
            final String a;
            final AdPopcornSSPRewardAdPlusPageActivity b;

            l(String s) {
                this.a = s;
                super();
            }

            @Override
            public void run() {
                String s = AdPopcornSSPRewardAdPlusPageActivity.this.a("NativeEvent", (this.a == null ? this.a : this.a.replace("\n", "<br>")));
                AdPopcornSSPRewardAdPlusPageActivity.this.d.evaluateJavascript(s, null);
            }
        }

        b.c(Thread.currentThread(), "callEvent : " + s);
        this.d.post(new l(this, s));
    }

    private View b() {
        FrameLayout frameLayout0 = new FrameLayout(this.b);
        this.c = frameLayout0;
        frameLayout0.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout0 = new LinearLayout(this.b);
        linearLayout0.setOrientation(1);
        linearLayout0.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.c.addView(linearLayout0);
        this.d = new NonLeakingWebView(this);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
        this.d.setLayoutParams(frameLayout$LayoutParams0);
        WebView.setWebContentsDebuggingEnabled(true);
        this.d.getSettings().setJavaScriptEnabled(true);
        this.d.setWebViewClient(this.n);
        this.d.setVerticalScrollBarEnabled(false);
        this.d.setVerticalScrollbarOverlay(false);
        this.d.setHorizontalScrollBarEnabled(false);
        this.d.setHorizontalScrollbarOverlay(false);
        this.d.setBackgroundColor(-1);
        this.d.getSettings().setDefaultTextEncodingName("UTF-8");
        this.d.getSettings().setAllowFileAccess(true);
        this.d.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.d.getSettings().setDomStorageEnabled(true);
        this.d.getSettings().setDatabaseEnabled(true);
        this.d.getSettings().setCacheMode(2);
        this.d.clearCache(true);
        this.d.addJavascriptInterface(this, "APSSPRewardPlus");
        WebView.setWebContentsDebuggingEnabled(true);
        linearLayout0.addView(this.d);
        return this.c;
    }

    @Override  // com.igaworks.ssp.N
    public void b(e t$e0, String s, boolean z) {
        if(i.a[t$e0.ordinal()] == 1) {
            this.a(false, s);
        }
    }

    public void b(String s) {
        class k implements Runnable {
            final String a;
            final AdPopcornSSPRewardAdPlusPageActivity b;

            k(String s) {
                this.a = s;
                super();
            }

            @Override
            public void run() {
                AdPopcornSSPRewardAdPlusPageActivity.this.d.evaluateJavascript(this.a, null);
            }
        }

        try {
            b.c(Thread.currentThread(), "callJavascript : " + s);
            NonLeakingWebView nonLeakingWebView0 = this.d;
            if(nonLeakingWebView0 != null) {
                nonLeakingWebView0.post(new k(this, s));
            }
        }
        catch(Exception unused_ex) {
        }
    }

    private void c() {
        class j implements Runnable {
            final AdPopcornSSPRewardAdPlusPageActivity a;

            @Override
            public void run() {
                String s = AdPopcornSSPRewardAdPlusPageActivity.this.e;
                AdPopcornSSPRewardAdPlusPageActivity.this.d.loadUrl(s);
            }
        }

        try {
            b.c(Thread.currentThread(), "loadPage : " + this.e);
            this.d.post(new j(this));
        }
        catch(Exception unused_ex) {
        }
    }

    private void c(String s) {
        class m implements Runnable {
            final String a;
            final AdPopcornSSPRewardAdPlusPageActivity b;

            m(String s) {
                this.a = s;
                super();
            }

            @Override
            public void run() {
                try {
                    if(!AdPopcornSSPRewardAdPlusPageActivity.this.isFinishing()) {
                        Toast.makeText(AdPopcornSSPRewardAdPlusPageActivity.this.b, this.a, 1).show();
                    }
                }
                catch(Exception unused_ex) {
                }
            }
        }

        try {
            this.d.post(new m(this, s));
        }
        catch(Exception unused_ex) {
        }
    }

    @JavascriptInterface
    public void checkNpayMember(String s) {
        try {
            w w0 = p.g(s);
            b.c(Thread.currentThread(), "checkNpayMember : " + w0.c() + ", openNewPage : " + w0.g());
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("naver_unique_id", w0.c());
            E.g().d().a(this.b, e.L, jSONObject0, this);
        }
        catch(Exception unused_ex) {
            this.c(this.b.getString(string.apssp_default_error));
        }
    }

    @JavascriptInterface
    public void closeWebView() {
        try {
            b.c(Thread.currentThread(), "closeWebView");
            this.finish();
            this.overridePendingTransition(0, 0);
        }
        catch(Exception unused_ex) {
        }
    }

    @JavascriptInterface
    public void getParameter() {
        try {
            String s = E.g().e().a(this.b, "", "").toString();
            b.c(Thread.currentThread(), "getParameter : " + s);
            this.a("{Result:true, EventName:\'getParameter\', EventBody:\'" + s + "\'}");
        }
        catch(Exception unused_ex) {
        }
    }

    @JavascriptInterface
    public void loadAd(String s) {
        class a implements IInterstitialVideoAdEventCallbackListener {
            final int a;
            final String b;
            final int c;
            final AdPopcornSSPRewardAdPlusPageActivity d;

            a(int v, String s, int v1) {
                this.a = v;
                this.b = s;
                this.c = v1;
                super();
            }

            @Override  // com.igaworks.ssp.part.video.listener.IInterstitialVideoAdEventCallbackListener
            public void OnInterstitialVideoAdClicked() {
                b.c(Thread.currentThread(), "loadAd, OnInterstitialVideoAdClicked");
            }

            @Override  // com.igaworks.ssp.part.video.listener.IInterstitialVideoAdEventCallbackListener
            public void OnInterstitialVideoAdClosed() {
                b.c(Thread.currentThread(), "loadAd, OnInterstitialVideoAdClosed");
            }

            @Override  // com.igaworks.ssp.part.video.listener.IInterstitialVideoAdEventCallbackListener
            public void OnInterstitialVideoAdLoadFailed(SSPErrorCode sSPErrorCode0) {
                b.c(Thread.currentThread(), "loadAd, OnInterstitialVideoAdLoadFailed");
                AdPopcornSSPRewardAdPlusPageActivity.this.a(false, (AdPopcornSSPRewardAdPlusPageActivity.this.h == null ? "0" : ""), 0, this.b, this.c);
            }

            @Override  // com.igaworks.ssp.part.video.listener.IInterstitialVideoAdEventCallbackListener
            public void OnInterstitialVideoAdLoaded() {
                b.c(Thread.currentThread(), "loadAd, OnInterstitialVideoAdLoaded");
                if(AdPopcornSSPRewardAdPlusPageActivity.this.h != null) {
                    AdPopcornSSPRewardAdPlusPageActivity.this.h.showAd();
                }
                AdPopcornSSPRewardAdPlusPageActivity.this.a(true, "", this.a, this.b, this.c);
            }

            @Override  // com.igaworks.ssp.part.video.listener.IInterstitialVideoAdEventCallbackListener
            public void OnInterstitialVideoAdOpenFalied() {
                b.c(Thread.currentThread(), "loadAd, OnInterstitialVideoAdOpenFalied");
            }

            @Override  // com.igaworks.ssp.part.video.listener.IInterstitialVideoAdEventCallbackListener
            public void OnInterstitialVideoAdOpened() {
                b.c(Thread.currentThread(), "loadAd, OnInterstitialVideoAdOpened");
            }
        }


        class com.igaworks.ssp.rewardplus.activity.AdPopcornSSPRewardAdPlusPageActivity.b implements IVideoMixAdEventCallbackListener {
            final int a;
            final String b;
            final int c;
            final AdPopcornSSPRewardAdPlusPageActivity d;

            com.igaworks.ssp.rewardplus.activity.AdPopcornSSPRewardAdPlusPageActivity.b(int v, String s, int v1) {
                this.a = v;
                this.b = s;
                this.c = v1;
                super();
            }

            @Override  // com.igaworks.ssp.part.mix.listener.IVideoMixAdEventCallbackListener
            public void OnVideoMixAdClicked() {
                b.c(Thread.currentThread(), "loadAd, OnVideoMixAdClicked");
            }

            @Override  // com.igaworks.ssp.part.mix.listener.IVideoMixAdEventCallbackListener
            public void OnVideoMixAdClosed(int v) {
                b.c(Thread.currentThread(), "loadAd, OnVideoMixAdClosed");
            }

            @Override  // com.igaworks.ssp.part.mix.listener.IVideoMixAdEventCallbackListener
            public void OnVideoMixAdLoadFailed(SSPErrorCode sSPErrorCode0) {
                b.c(Thread.currentThread(), "loadAd, OnVideoMixAdLoadFailed");
                AdPopcornSSPRewardAdPlusPageActivity.this.a(false, (AdPopcornSSPRewardAdPlusPageActivity.this.i == null ? "0" : ""), 0, this.b, this.c);
            }

            @Override  // com.igaworks.ssp.part.mix.listener.IVideoMixAdEventCallbackListener
            public void OnVideoMixAdLoaded() {
                b.c(Thread.currentThread(), "loadAd, OnVideoMixAdLoaded");
                if(AdPopcornSSPRewardAdPlusPageActivity.this.i != null) {
                    AdPopcornSSPRewardAdPlusPageActivity.this.i.showAd();
                }
                AdPopcornSSPRewardAdPlusPageActivity.this.a(true, "", this.a, this.b, this.c);
            }

            @Override  // com.igaworks.ssp.part.mix.listener.IVideoMixAdEventCallbackListener
            public void OnVideoMixAdOpenFailed() {
                b.c(Thread.currentThread(), "loadAd, OnVideoMixAdOpenFailed");
            }

            @Override  // com.igaworks.ssp.part.mix.listener.IVideoMixAdEventCallbackListener
            public void OnVideoMixAdOpened() {
                b.c(Thread.currentThread(), "loadAd, OnVideoMixAdOpened");
            }

            @Override  // com.igaworks.ssp.part.mix.listener.IVideoMixAdEventCallbackListener
            public void OnVideoMixPlayCompleted(int v, boolean z) {
                b.c(Thread.currentThread(), "loadAd, OnVideoMixPlayCompleted");
            }
        }


        class q implements IInterstitialEventCallbackListener {
            final int a;
            final String b;
            final int c;
            final AdPopcornSSPRewardAdPlusPageActivity d;

            q(int v, String s, int v1) {
                this.a = v;
                this.b = s;
                this.c = v1;
                super();
            }

            @Override  // com.igaworks.ssp.part.interstitial.listener.IInterstitialEventCallbackListener
            public void OnInterstitialClicked() {
                b.c(Thread.currentThread(), "loadAd, OnInterstitialClicked");
            }

            @Override  // com.igaworks.ssp.part.interstitial.listener.IInterstitialEventCallbackListener
            public void OnInterstitialClosed(int v) {
                b.c(Thread.currentThread(), "loadAd, OnInterstitialClosed");
            }

            @Override  // com.igaworks.ssp.part.interstitial.listener.IInterstitialEventCallbackListener
            public void OnInterstitialLoaded() {
                b.c(Thread.currentThread(), "loadAd, OnInterstitialLoaded");
                AdPopcornSSPRewardAdPlusPageActivity.this.a();
                if(AdPopcornSSPRewardAdPlusPageActivity.this.f != null) {
                    AdPopcornSSPRewardAdPlusPageActivity.this.f.showAd();
                }
                AdPopcornSSPRewardAdPlusPageActivity.this.a(true, "", this.a, this.b, this.c);
            }

            @Override  // com.igaworks.ssp.part.interstitial.listener.IInterstitialEventCallbackListener
            public void OnInterstitialOpenFailed(SSPErrorCode sSPErrorCode0) {
                b.c(Thread.currentThread(), "loadAd, OnInterstitialOpenFailed");
            }

            @Override  // com.igaworks.ssp.part.interstitial.listener.IInterstitialEventCallbackListener
            public void OnInterstitialOpened() {
                b.c(Thread.currentThread(), "loadAd, OnInterstitialOpened");
            }

            @Override  // com.igaworks.ssp.part.interstitial.listener.IInterstitialEventCallbackListener
            public void OnInterstitialReceiveFailed(SSPErrorCode sSPErrorCode0) {
                b.c(Thread.currentThread(), "loadAd, OnInterstitialReceiveFailed");
                AdPopcornSSPRewardAdPlusPageActivity.this.a(false, (AdPopcornSSPRewardAdPlusPageActivity.this.f == null ? "0" : ""), 0, this.b, this.c);
            }
        }


        class r implements IRewardVideoAdEventCallbackListener {
            final int a;
            final String b;
            final int c;
            final AdPopcornSSPRewardAdPlusPageActivity d;

            r(int v, String s, int v1) {
                this.a = v;
                this.b = s;
                this.c = v1;
                super();
            }

            @Override  // com.igaworks.ssp.part.video.listener.IRewardVideoAdEventCallbackListener
            public void OnRewardPlusCompleted(boolean z, int v, int v1) {
                b.c(Thread.currentThread(), "loadAd, OnRewardPlusCompleted");
            }

            @Override  // com.igaworks.ssp.part.video.listener.IRewardVideoAdEventCallbackListener
            public void OnRewardVideoAdClicked() {
                b.c(Thread.currentThread(), "loadAd, OnRewardVideoAdClicked");
            }

            @Override  // com.igaworks.ssp.part.video.listener.IRewardVideoAdEventCallbackListener
            public void OnRewardVideoAdClosed() {
                b.c(Thread.currentThread(), "loadAd, OnRewardVideoAdClosed");
            }

            @Override  // com.igaworks.ssp.part.video.listener.IRewardVideoAdEventCallbackListener
            public void OnRewardVideoAdLoadFailed(SSPErrorCode sSPErrorCode0) {
                b.c(Thread.currentThread(), "loadAd, OnRewardVideoAdLoadFailed");
                AdPopcornSSPRewardAdPlusPageActivity.this.a(false, (AdPopcornSSPRewardAdPlusPageActivity.this.g == null ? "0" : ""), 0, this.b, this.c);
            }

            @Override  // com.igaworks.ssp.part.video.listener.IRewardVideoAdEventCallbackListener
            public void OnRewardVideoAdLoaded() {
                b.c(Thread.currentThread(), "loadAd, OnRewardVideoAdLoaded");
                if(AdPopcornSSPRewardAdPlusPageActivity.this.g != null) {
                    AdPopcornSSPRewardAdPlusPageActivity.this.g.showAd();
                }
                AdPopcornSSPRewardAdPlusPageActivity.this.a(true, "", this.a, this.b, this.c);
            }

            @Override  // com.igaworks.ssp.part.video.listener.IRewardVideoAdEventCallbackListener
            public void OnRewardVideoAdOpenFalied() {
                b.c(Thread.currentThread(), "loadAd, OnRewardVideoAdOpenFalied");
            }

            @Override  // com.igaworks.ssp.part.video.listener.IRewardVideoAdEventCallbackListener
            public void OnRewardVideoAdOpened() {
                b.c(Thread.currentThread(), "loadAd, OnRewardVideoAdOpened");
            }

            @Override  // com.igaworks.ssp.part.video.listener.IRewardVideoAdEventCallbackListener
            public void OnRewardVideoPlayCompleted(int v, boolean z) {
                b.c(Thread.currentThread(), "loadAd, OnRewardVideoPlayCompleted");
            }
        }

        w w0 = p.g(s);
        if(w0 == null) {
            goto label_51;
        }
        else {
            try {
                int v = w0.b();
                String s1 = w0.e();
                int v1 = w0.a();
                b.c(Thread.currentThread(), "loadAd, campaignType : " + v + ", placementId : " + s1);
                switch(v) {
                    case 2: {
                        try {
                            if(this.f != null && !this.f.getPlacementId().equals(s1)) {
                                this.f.destroy();
                                this.f.setInterstitialEventCallbackListener(null);
                            }
                        }
                        catch(Exception unused_ex) {
                        }
                        AdPopcornSSPInterstitialAd adPopcornSSPInterstitialAd0 = new AdPopcornSSPInterstitialAd(this);
                        this.f = adPopcornSSPInterstitialAd0;
                        adPopcornSSPInterstitialAd0.setPlacementId(s1);
                        this.f.setInterstitialEventCallbackListener(new q(this, 2, s1, v1));
                        this.f.loadAd();
                        return;
                    }
                    case 4: {
                        try {
                            if(this.g != null && !this.g.getPlacementId().equals(s1)) {
                                this.g.destroy();
                                this.g.setRewardVideoAdEventCallbackListener(null);
                            }
                        }
                        catch(Exception unused_ex) {
                        }
                        AdPopcornSSPRewardVideoAd adPopcornSSPRewardVideoAd0 = new AdPopcornSSPRewardVideoAd(this.b);
                        this.g = adPopcornSSPRewardVideoAd0;
                        adPopcornSSPRewardVideoAd0.setPlacementId(s1);
                        this.g.setRewardVideoAdEventCallbackListener(new r(this, 4, s1, v1));
                        this.g.loadAd();
                        return;
                    }
                    case 6: {
                        try {
                            if(this.h != null && !this.h.getPlacementId().equals(s1)) {
                                this.h.destroy();
                                this.h.setEventCallbackListener(null);
                            }
                        }
                        catch(Exception unused_ex) {
                        }
                        AdPopcornSSPInterstitialVideoAd adPopcornSSPInterstitialVideoAd0 = new AdPopcornSSPInterstitialVideoAd(this.b);
                        this.h = adPopcornSSPInterstitialVideoAd0;
                        adPopcornSSPInterstitialVideoAd0.setPlacementId(s1);
                        this.h.setEventCallbackListener(new a(this, 6, s1, v1));
                        this.h.loadAd();
                        return;
                    }
                    case 13: {
                        try {
                            if(this.i != null && !this.i.getPlacementId().equals(s1)) {
                                this.i.destroy();
                                this.i.setVideoMixAdEventCallbackListener(null);
                            }
                        }
                        catch(Exception unused_ex) {
                        }
                        AdPopcornSSPVideoMixAd adPopcornSSPVideoMixAd0 = new AdPopcornSSPVideoMixAd(this.b);
                        this.i = adPopcornSSPVideoMixAd0;
                        adPopcornSSPVideoMixAd0.setPlacementId(s1);
                        this.i.setVideoMixAdEventCallbackListener(new com.igaworks.ssp.rewardplus.activity.AdPopcornSSPRewardAdPlusPageActivity.b(this, 13, s1, v1));
                        this.i.loadAd();
                    }
                }
            }
            catch(Exception exception0) {
                try {
                    b.a(Thread.currentThread(), exception0);
                    JSONObject jSONObject0 = new JSONObject();
                    jSONObject0.put("success", false);
                    jSONObject0.put("point", 0);
                    this.b("window.nativeCallback.showPointResultPopup({\"success\":false,\"point\":0})");
                    return;
                label_51:
                    b.a(Thread.currentThread(), "load ad model parsing error");
                    JSONObject jSONObject1 = new JSONObject();
                    jSONObject1.put("success", false);
                    jSONObject1.put("point", 0);
                    this.b("window.nativeCallback.showPointResultPopup({\"success\":false,\"point\":0})");
                }
                catch(Exception unused_ex) {
                }
            }
        }
    }

    @Override  // android.app.Activity
    public void onBackPressed() {
        try {
            b.c(Thread.currentThread(), "onBackPressed.isPageLoaded : " + this.m);
            if(this.m) {
                this.b("window.nativeCallback.onBackKeyPress()");
                return;
            }
            super.onBackPressed();
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // android.app.Activity
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.b = this;
        try {
            this.e = this.getIntent().getStringExtra("reward_plus_url");
            this.getWindow().getDecorView().setBackgroundColor(0);
            int v = Build.VERSION.SDK_INT;
            this.getWindow().setFlags(0x1000000, 0x1000000);
            Window window0 = this.getWindow();
            if(v < 35) {
                if(v >= 23 && window0 != null) {
                    window0.addFlags(0x80000000);
                    window0.setStatusBarColor(-1);
                    window0.getDecorView().setSystemUiVisibility(0x2000);
                    window0.setBackgroundDrawable(new ColorDrawable(0));
                }
            }
            else if(window0 != null) {
                window0.setDecorFitsSystemWindows(false);
                window0.setStatusBarColor(0);
                window0.setNavigationBarColor(0);
                window0.getDecorView().setOnApplyWindowInsetsListener((View view0, WindowInsets windowInsets0) -> {
                    view0.setPadding(0, windowInsets0.getInsets(E0.a()).top, 0, windowInsets0.getInsets(F0.a()).bottom);
                    return windowInsets0;
                });
            }
            this.setContentView(this.b());
            this.c();
        }
        catch(Exception unused_ex) {
            b.c(Thread.currentThread(), "onCreate Exception");
        }
    }

    @Override  // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        try {
            AdPopcornSSPInterstitialAd adPopcornSSPInterstitialAd0 = this.f;
            if(adPopcornSSPInterstitialAd0 != null) {
                adPopcornSSPInterstitialAd0.destroy();
                this.f.setInterstitialEventCallbackListener(null);
            }
            AdPopcornSSPInterstitialVideoAd adPopcornSSPInterstitialVideoAd0 = this.h;
            if(adPopcornSSPInterstitialVideoAd0 != null) {
                adPopcornSSPInterstitialVideoAd0.destroy();
                this.h.setEventCallbackListener(null);
            }
            AdPopcornSSPRewardVideoAd adPopcornSSPRewardVideoAd0 = this.g;
            if(adPopcornSSPRewardVideoAd0 != null) {
                adPopcornSSPRewardVideoAd0.destroy();
                this.g.setRewardVideoAdEventCallbackListener(null);
            }
            AdPopcornSSPVideoMixAd adPopcornSSPVideoMixAd0 = this.i;
            if(adPopcornSSPVideoMixAd0 != null) {
                adPopcornSSPVideoMixAd0.destroy();
                this.i.setVideoMixAdEventCallbackListener(null);
            }
        }
        catch(Exception unused_ex) {
        }
        if(k0.c().b() != null) {
            k0.c().d();
        }
    }

    @Override  // android.app.Activity
    public void onDetachedFromWindow() {
        class c implements Runnable {
            final AdPopcornSSPRewardAdPlusPageActivity a;

            @Override
            public void run() {
                if(AdPopcornSSPRewardAdPlusPageActivity.this.d != null) {
                    try {
                        AdPopcornSSPRewardAdPlusPageActivity.this.d.loadUrl("about:blank");
                        AdPopcornSSPRewardAdPlusPageActivity.this.d.clearDisappearingChildren();
                        AdPopcornSSPRewardAdPlusPageActivity.this.d.removeAllViews();
                        if(AdPopcornSSPRewardAdPlusPageActivity.this.d.getParent() != null) {
                            ((ViewGroup)AdPopcornSSPRewardAdPlusPageActivity.this.d.getParent()).removeView(AdPopcornSSPRewardAdPlusPageActivity.this.d);
                        }
                    }
                    catch(Exception exception0) {
                        b.c(Thread.currentThread(), "onDetachedFromWindow" + exception0);
                    }
                }
            }
        }

        super.onDetachedFromWindow();
        try {
            b.c(Thread.currentThread(), "onDetachedFromWindow");
            new Handler(Looper.getMainLooper()).post(new c(this));
        }
        catch(Exception exception0) {
            b.c(Thread.currentThread(), "onDetachedFromWindow" + exception0);
        }
    }

    @JavascriptInterface
    public void onPageLoaded() {
        try {
            b.c(Thread.currentThread(), "onPageLoaded");
            this.m = true;
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // android.app.Activity
    protected void onPause() {
        super.onPause();
    }

    @Override  // android.app.Activity
    protected void onResume() {
        super.onResume();
        NonLeakingWebView nonLeakingWebView0 = this.d;
        if(nonLeakingWebView0 != null) {
            nonLeakingWebView0.resumeTimers();
        }
    }

    @Override  // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
    }

    @JavascriptInterface
    public void openWebBrowser(String s) {
        try {
            w w0 = p.g(s);
            b.c(Thread.currentThread(), "openWebBrowser = " + w0.d());
            Intent intent0 = new Intent("android.intent.action.VIEW");
            intent0.setData(Uri.parse(w0.d()));
            this.b.startActivity(intent0);
        }
        catch(Exception unused_ex) {
        }
    }

    @JavascriptInterface
    public void pressBackKey() {
        class com.igaworks.ssp.rewardplus.activity.AdPopcornSSPRewardAdPlusPageActivity.p implements Runnable {
            final AdPopcornSSPRewardAdPlusPageActivity a;

            @Override
            public void run() {
                if(AdPopcornSSPRewardAdPlusPageActivity.this.d != null && AdPopcornSSPRewardAdPlusPageActivity.this.d.canGoBack()) {
                    AdPopcornSSPRewardAdPlusPageActivity.this.d.goBack();
                }
            }
        }

        try {
            b.c(Thread.currentThread(), "pressBackKey");
            this.runOnUiThread(new com.igaworks.ssp.rewardplus.activity.AdPopcornSSPRewardAdPlusPageActivity.p(this));
        }
        catch(Exception unused_ex) {
        }
    }

    @JavascriptInterface
    public void toastMessage(String s) {
        class o implements Runnable {
            final w a;
            final AdPopcornSSPRewardAdPlusPageActivity b;

            o(w w0) {
                this.a = w0;
                super();
            }

            @Override
            public void run() {
                try {
                    if(!AdPopcornSSPRewardAdPlusPageActivity.this.isFinishing()) {
                        Toast.makeText(AdPopcornSSPRewardAdPlusPageActivity.this.b, this.a.f(), 1).show();
                    }
                }
                catch(Exception unused_ex) {
                }
            }
        }

        try {
            w w0 = p.g(s);
            this.d.post(new o(this, w0));
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
    }
}

