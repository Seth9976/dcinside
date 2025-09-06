package com.igaworks.ssp.part.video.activity;

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
import com.igaworks.ssp.M;
import com.igaworks.ssp.R.string;
import com.igaworks.ssp.b;
import com.igaworks.ssp.j0;
import com.igaworks.ssp.k0;
import com.igaworks.ssp.p;
import com.igaworks.ssp.part.NonLeakingWebView;
import com.igaworks.ssp.t.e;
import com.igaworks.ssp.t;
import com.igaworks.ssp.w;
import com.igaworks.ssp.y;
import java.util.Calendar;
import org.json.JSONObject;

public class AdPopcornSSPRewardPlusWebViewActivity extends Activity implements M {
    class a extends WebViewClient {
        final AdPopcornSSPRewardPlusWebViewActivity a;

        private boolean a(WebView webView0, String s) {
            b.c(Thread.currentThread(), "urlLoading : " + s);
            if(s != null && !s.startsWith("https://nid.naver.com") && !s.startsWith("https://reward-plus")) {
                Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse(s));
                intent0.addFlags(0x10000000);
                AdPopcornSSPRewardPlusWebViewActivity.this.c.startActivity(intent0);
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
            catch(Exception exception0) {
                exception0.printStackTrace();
                return false;
            }
        }
    }

    static abstract class g {
        static final int[] a;

        static {
            int[] arr_v = new int[e.values().length];
            g.a = arr_v;
            try {
                arr_v[e.B.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                g.a[e.C.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private final String a;
    private final String b;
    private Context c;
    FrameLayout d;
    private NonLeakingWebView e;
    private String f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private WebViewClient k;

    public AdPopcornSSPRewardPlusWebViewActivity() {
        this.a = "AdPopcornSSPRewardPlusWebViewActivity";
        this.b = "APSSPRewardPlus";
        this.f = "";
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = true;
        this.k = new a(this);
    }

    private View a() {
        FrameLayout frameLayout0 = new FrameLayout(this.c);
        this.d = frameLayout0;
        frameLayout0.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout0 = new LinearLayout(this.c);
        linearLayout0.setOrientation(1);
        linearLayout0.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.d.addView(linearLayout0);
        this.e = new NonLeakingWebView(this);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
        this.e.setLayoutParams(frameLayout$LayoutParams0);
        WebView.setWebContentsDebuggingEnabled(true);
        this.e.getSettings().setJavaScriptEnabled(true);
        this.e.setWebViewClient(this.k);
        this.e.setVerticalScrollBarEnabled(false);
        this.e.setVerticalScrollbarOverlay(false);
        this.e.setHorizontalScrollBarEnabled(false);
        this.e.setHorizontalScrollbarOverlay(false);
        this.e.setBackgroundColor(-1);
        this.e.getSettings().setDefaultTextEncodingName("UTF-8");
        this.e.getSettings().setAllowFileAccess(true);
        this.e.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.e.getSettings().setDomStorageEnabled(true);
        this.e.getSettings().setDatabaseEnabled(true);
        this.e.getSettings().setCacheMode(2);
        this.e.clearCache(true);
        this.e.addJavascriptInterface(this, "APSSPRewardPlus");
        WebView.setWebContentsDebuggingEnabled(true);
        linearLayout0.addView(this.e);
        return this.d;
    }

    // 检测为 Lambda 实现
    private static WindowInsets a(View view0, WindowInsets windowInsets0) [...]

    // 去混淆评级： 低(20)
    private String a(String s, String s1) {
        return "window.dispatchEvent(\n   new CustomEvent(\"" + s + "\", {\n" + "           detail: {\n" + "               data: " + s1 + "\n" + "           }\n" + "       }\n" + "   )\n" + ");";
    }

    private void a(String s) {
        class d implements Runnable {
            final AdPopcornSSPRewardPlusWebViewActivity a;

            // 去混淆评级： 低(38)
            @Override
            public void run() {
                String s = String.format("use_npay=%b&use_notification=%b&point_count=%d&daily_cap=%d&naver_id=%s&media_key=%s&media_name=%s", Boolean.valueOf(E.g().c("reward_plus_use_state_") == 1), Boolean.valueOf(E.g().c("reward_plus_enable_notice_") != 0), E.g().c("reward_plus_apssp_daily_user_count_"), E.g().c("reward_plus_apssp_daily_user_limit_"), "", "", y.a(AdPopcornSSPRewardPlusWebViewActivity.this.c));
                if(AdPopcornSSPRewardPlusWebViewActivity.this.i) {
                    AdPopcornSSPRewardPlusWebViewActivity.this.e.loadUrl("https://reward-plus-dev.adpopcorn.com/settings?" + s);
                    return;
                }
                AdPopcornSSPRewardPlusWebViewActivity.this.e.loadUrl("https://reward-plus.adpopcorn.com/settings?" + s);
            }
        }


        class com.igaworks.ssp.part.video.activity.AdPopcornSSPRewardPlusWebViewActivity.e implements Runnable {
            final AdPopcornSSPRewardPlusWebViewActivity a;

            // 去混淆评级： 低(38)
            @Override
            public void run() {
                String s = String.format("use_npay=%b&use_notification=%b&point_count=%d&daily_cap=%d&naver_id=%s&media_key=%s&media_name=%s", Boolean.valueOf(E.g().c("reward_plus_use_state_") == 1), Boolean.valueOf(E.g().c("reward_plus_enable_notice_") != 0), E.g().c("reward_plus_apssp_daily_user_count_"), E.g().c("reward_plus_apssp_daily_user_limit_"), "", "", y.a(AdPopcornSSPRewardPlusWebViewActivity.this.c));
                if(AdPopcornSSPRewardPlusWebViewActivity.this.i) {
                    AdPopcornSSPRewardPlusWebViewActivity.this.e.loadUrl("https://reward-plus-dev.adpopcorn.com/settings?" + s);
                    return;
                }
                AdPopcornSSPRewardPlusWebViewActivity.this.e.loadUrl("https://reward-plus.adpopcorn.com/settings?" + s);
            }
        }


        class f implements Runnable {
            final AdPopcornSSPRewardPlusWebViewActivity a;

            @Override
            public void run() {
                if(AdPopcornSSPRewardPlusWebViewActivity.this.i) {
                    AdPopcornSSPRewardPlusWebViewActivity.this.e.loadUrl("https://reward-plus-dev.adpopcorn.com/join-npay");
                    return;
                }
                AdPopcornSSPRewardPlusWebViewActivity.this.e.loadUrl("https://reward-plus.adpopcorn.com/join-npay");
            }
        }

        if(s != null && s.length() > 0) {
            try {
                b.a(Thread.currentThread(), "lastActionShowVideo : " + this.j + ", callbackAddNpayUser result = " + s);
                JSONObject jSONObject0 = new JSONObject(s);
                switch(jSONObject0.getInt("ResultCode")) {
                    case 1: {
                        E.g().a("reward_plus_use_state_", 1);
                        String s1 = "";
                        int v = jSONObject0.has("DailyUserCount") ? jSONObject0.getInt("DailyUserCount") : -1;
                        int v1 = jSONObject0.has("DailyUserLimit") ? jSONObject0.getInt("DailyUserLimit") : -1;
                        if(jSONObject0.has("NaverMaskingId")) {
                            s1 = jSONObject0.getString("NaverMaskingId");
                        }
                        if(v > -1) {
                            E.g().a("reward_plus_apssp_daily_user_count_", v);
                        }
                        if(v1 > -1) {
                            E.g().a("reward_plus_apssp_daily_user_limit_", v1);
                        }
                        if(s1 != null && s1.length() > 0) {
                            E.g().a("reward_plus_apssp_npay_masking_id_", s1);
                        }
                        if(this.j) {
                            j0.b().c();
                            this.finish();
                            this.overridePendingTransition(0, 0);
                            return;
                        }
                        this.e.post(new d(this));
                        this.j = false;
                        return;
                    }
                    case 6007: {
                        E.g().a("reward_plus_use_state_", 1);
                        if(this.j) {
                            j0.b().c();
                            this.finish();
                            this.overridePendingTransition(0, 0);
                            return;
                        }
                        this.e.post(new com.igaworks.ssp.part.video.activity.AdPopcornSSPRewardPlusWebViewActivity.e(this));
                        this.j = false;
                        return;
                    }
                    default: {
                        this.e.post(new f(this));
                        return;
                    }
                }
            }
            catch(Exception unused_ex) {
                this.c(this.c.getString(string.apssp_default_error));
                this.finish();
                return;
            }
        }
        this.c(this.c.getString(string.apssp_default_unknown_error));
        this.finish();
    }

    private void b() {
        class h implements Runnable {
            final AdPopcornSSPRewardPlusWebViewActivity a;

            @Override
            public void run() {
                String s = AdPopcornSSPRewardPlusWebViewActivity.this.f;
                AdPopcornSSPRewardPlusWebViewActivity.this.e.loadUrl(s);
            }
        }

        try {
            b.c(Thread.currentThread(), "loadPage : " + this.f);
            this.e.post(new h(this));
        }
        catch(Exception unused_ex) {
        }
    }

    private void b(String s) {
        class com.igaworks.ssp.part.video.activity.AdPopcornSSPRewardPlusWebViewActivity.b implements Runnable {
            final AdPopcornSSPRewardPlusWebViewActivity a;

            // 去混淆评级： 低(38)
            @Override
            public void run() {
                String s = String.format("use_npay=%b&use_notification=%b&point_count=%d&daily_cap=%d&naver_id=%s&media_key=%s&media_name=%s", Boolean.valueOf(E.g().c("reward_plus_use_state_") == 1), Boolean.valueOf(E.g().c("reward_plus_enable_notice_") != 0), E.g().c("reward_plus_apssp_daily_user_count_"), E.g().c("reward_plus_apssp_daily_user_limit_"), "", "", y.a(AdPopcornSSPRewardPlusWebViewActivity.this.c));
                if(AdPopcornSSPRewardPlusWebViewActivity.this.i) {
                    AdPopcornSSPRewardPlusWebViewActivity.this.e.loadUrl("https://reward-plus-dev.adpopcorn.com/settings?" + s);
                    return;
                }
                AdPopcornSSPRewardPlusWebViewActivity.this.e.loadUrl("https://reward-plus.adpopcorn.com/settings?" + s);
            }
        }


        class c implements Runnable {
            final AdPopcornSSPRewardPlusWebViewActivity a;

            @Override
            public void run() {
                if(AdPopcornSSPRewardPlusWebViewActivity.this.i) {
                    AdPopcornSSPRewardPlusWebViewActivity.this.e.loadUrl("https://reward-plus-dev.adpopcorn.com/init-npay?isFromSetting=true");
                    return;
                }
                AdPopcornSSPRewardPlusWebViewActivity.this.e.loadUrl("https://reward-plus.adpopcorn.com/init-npay?isFromSetting=true");
            }
        }

        if(s != null && s.length() > 0) {
            try {
                b.a(Thread.currentThread(), "callbackGetNpayUser result = " + s);
                JSONObject jSONObject0 = new JSONObject(s);
                int v = jSONObject0.getInt("ResultCode");
                if(v != 1 && v != 6001 && v != 6002) {
                    this.j = false;
                    this.e.post(new c(this));
                    return;
                }
                E.g().a("reward_plus_use_state_", 1);
                String s1 = "";
                int v1 = jSONObject0.has("DailyUserCount") ? jSONObject0.getInt("DailyUserCount") : -1;
                int v2 = jSONObject0.has("DailyUserLimit") ? jSONObject0.getInt("DailyUserLimit") : -1;
                if(jSONObject0.has("NaverMaskingId")) {
                    s1 = jSONObject0.getString("NaverMaskingId");
                }
                if(v1 > -1) {
                    E.g().a("reward_plus_apssp_daily_user_count_", v1);
                }
                if(v2 > -1) {
                    E.g().a("reward_plus_apssp_daily_user_limit_", v2);
                }
                if(s1 != null && s1.length() > 0) {
                    E.g().a("reward_plus_apssp_npay_masking_id_", s1);
                }
                this.e.post(new com.igaworks.ssp.part.video.activity.AdPopcornSSPRewardPlusWebViewActivity.b(this));
            }
            catch(Exception unused_ex) {
                this.c(this.c.getString(string.apssp_default_error));
                this.finish();
            }
            return;
        }
        this.c(this.c.getString(string.apssp_default_unknown_error));
        this.finish();
    }

    private void c(String s) {
        class k implements Runnable {
            final String a;
            final AdPopcornSSPRewardPlusWebViewActivity b;

            k(String s) {
                this.a = s;
                super();
            }

            @Override
            public void run() {
                try {
                    if(!AdPopcornSSPRewardPlusWebViewActivity.this.isFinishing()) {
                        Toast.makeText(AdPopcornSSPRewardPlusWebViewActivity.this.c, this.a, 1).show();
                    }
                }
                catch(Exception unused_ex) {
                }
            }
        }

        try {
            this.e.post(new k(this, s));
        }
        catch(Exception unused_ex) {
        }
    }

    public void callEvent(String s) {
        class j implements Runnable {
            final String a;
            final AdPopcornSSPRewardPlusWebViewActivity b;

            j(String s) {
                this.a = s;
                super();
            }

            @Override
            public void run() {
                String s = AdPopcornSSPRewardPlusWebViewActivity.this.a("NativeEvent", (this.a == null ? this.a : this.a.replace("\n", "<br>")));
                AdPopcornSSPRewardPlusWebViewActivity.this.e.evaluateJavascript(s, null);
            }
        }

        b.c(Thread.currentThread(), "callEvent : " + s);
        this.e.post(new j(this, s));
    }

    public void callJavascript(String s) {
        class i implements Runnable {
            final String a;
            final AdPopcornSSPRewardPlusWebViewActivity b;

            i(String s) {
                this.a = s;
                super();
            }

            @Override
            public void run() {
                AdPopcornSSPRewardPlusWebViewActivity.this.e.evaluateJavascript(this.a, null);
            }
        }

        try {
            b.c(Thread.currentThread(), "callJavascript : " + s);
            NonLeakingWebView nonLeakingWebView0 = this.e;
            if(nonLeakingWebView0 != null) {
                nonLeakingWebView0.post(new i(this, s));
            }
        }
        catch(Exception unused_ex) {
        }
    }

    @JavascriptInterface
    public void checkNpayMember(String s) {
        try {
            w w0 = p.g(s);
            b.c(Thread.currentThread(), "checkNpayMember : " + w0.c() + ", openNewPage : " + w0.g());
            this.g = w0.g();
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("naver_unique_id", w0.c());
            E.g().d().a(this.c, e.C, jSONObject0, this);
        }
        catch(Exception unused_ex) {
            this.c(this.c.getString(string.apssp_default_error));
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
    public void disableNotice() {
        try {
            b.c(Thread.currentThread(), "disableNotice");
            E.g().a("reward_plus_enable_notice_", 0);
        }
        catch(Exception unused_ex) {
        }
    }

    @JavascriptInterface
    public void disableRewardPlus() {
        try {
            b.c(Thread.currentThread(), "disableRewardPlus");
            E.g().a("reward_plus_use_state_", 0);
        }
        catch(Exception unused_ex) {
        }
    }

    @JavascriptInterface
    public void enableNotice() {
        try {
            b.c(Thread.currentThread(), "enableNotice");
            E.g().a("reward_plus_enable_notice_", 1);
        }
        catch(Exception unused_ex) {
        }
    }

    @JavascriptInterface
    public void enableRewardPlus() {
        try {
            b.c(Thread.currentThread(), "enableRewardPlus");
            t t0 = E.g().d();
            Context context0 = this.c;
            JSONObject jSONObject0 = new JSONObject();
            t0.a(context0, e.B, jSONObject0, this);
        }
        catch(Exception unused_ex) {
        }
    }

    @JavascriptInterface
    public void exceedAdPopcornDailyCapAndShowVideo() {
        try {
            b.c(Thread.currentThread(), "exceedAdPopcornDailyCapAndShowVideo");
            E.g().a("reward_plus_apssp_daily_cap_day_", Calendar.getInstance().get(6));
            j0.b().c();
            this.finish();
            this.overridePendingTransition(0, 0);
        }
        catch(Exception unused_ex) {
            this.c(this.c.getString(string.apssp_default_error));
        }
    }

    @JavascriptInterface
    public void exceedUserDailyCapAndShowVideo() {
        try {
            b.c(Thread.currentThread(), "exceedUserDailyCapAndShowVideo");
            E.g().a("reward_plus_user_daily_cap_day_", Calendar.getInstance().get(6));
            j0.b().c();
            this.finish();
            this.overridePendingTransition(0, 0);
        }
        catch(Exception unused_ex) {
            this.c(this.c.getString(string.apssp_default_error));
        }
    }

    @JavascriptInterface
    public void getParameter() {
        try {
            String s = E.g().e().a(this.c, "", "").toString();
            b.c(Thread.currentThread(), "getParameter : " + s);
            this.callEvent("{Result:true, EventName:\'getParameter\', EventBody:\'" + s + "\'}");
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // android.app.Activity
    public void onBackPressed() {
        class o implements Runnable {
            final AdPopcornSSPRewardPlusWebViewActivity a;

            @Override
            public void run() {
                if(AdPopcornSSPRewardPlusWebViewActivity.this.e != null && AdPopcornSSPRewardPlusWebViewActivity.this.e.canGoBack()) {
                    AdPopcornSSPRewardPlusWebViewActivity.this.e.goBack();
                }
                AdPopcornSSPRewardPlusWebViewActivity.this.h = false;
            }
        }

        try {
            b.c(Thread.currentThread(), "onBackPressed : " + this.h);
            if(this.h) {
                this.runOnUiThread(new o(this));
                return;
            }
            super.onBackPressed();
            this.overridePendingTransition(0, 0);
            this.h = false;
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // android.app.Activity
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.c = this;
        try {
            Intent intent0 = this.getIntent();
            this.f = intent0.getStringExtra("reward_plus_url");
            this.i = intent0.getBooleanExtra("reward_plus_test_mode", false);
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
            this.setContentView(this.a());
            this.b();
        }
        catch(Exception unused_ex) {
            b.c(Thread.currentThread(), "onCreate Exception");
        }
    }

    @Override  // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if(k0.c().b() != null) {
            k0.c().d();
        }
    }

    @Override  // android.app.Activity
    public void onDetachedFromWindow() {
        class com.igaworks.ssp.part.video.activity.AdPopcornSSPRewardPlusWebViewActivity.p implements Runnable {
            final AdPopcornSSPRewardPlusWebViewActivity a;

            @Override
            public void run() {
                if(AdPopcornSSPRewardPlusWebViewActivity.this.e != null) {
                    try {
                        AdPopcornSSPRewardPlusWebViewActivity.this.e.loadUrl("about:blank");
                        AdPopcornSSPRewardPlusWebViewActivity.this.e.clearDisappearingChildren();
                        AdPopcornSSPRewardPlusWebViewActivity.this.e.removeAllViews();
                        if(AdPopcornSSPRewardPlusWebViewActivity.this.e.getParent() != null) {
                            ((ViewGroup)AdPopcornSSPRewardPlusWebViewActivity.this.e.getParent()).removeView(AdPopcornSSPRewardPlusWebViewActivity.this.e);
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
            new Handler(Looper.getMainLooper()).post(new com.igaworks.ssp.part.video.activity.AdPopcornSSPRewardPlusWebViewActivity.p(this));
        }
        catch(Exception exception0) {
            b.c(Thread.currentThread(), "onDetachedFromWindow" + exception0);
        }
    }

    @Override  // com.igaworks.ssp.M
    public void onNetResponseListener(e t$e0, String s, String s1, boolean z) {
        switch(t$e0) {
            case 1: {
                this.b(s);
                return;
            }
            case 2: {
                this.a(s);
            }
        }
    }

    @Override  // android.app.Activity
    protected void onPause() {
        super.onPause();
    }

    @Override  // android.app.Activity
    protected void onResume() {
        super.onResume();
        NonLeakingWebView nonLeakingWebView0 = this.e;
        if(nonLeakingWebView0 != null) {
            nonLeakingWebView0.resumeTimers();
        }
    }

    @Override  // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
    }

    @JavascriptInterface
    public void openCSPage() {
        class n implements Runnable {
            final AdPopcornSSPRewardPlusWebViewActivity a;

            @Override
            public void run() {
                if(AdPopcornSSPRewardPlusWebViewActivity.this.e != null) {
                    String s = String.format("usn=%s&media_key=%s&sdk_version=%s&media_name=%s", "", "", "3.8.2", y.a(AdPopcornSSPRewardPlusWebViewActivity.this.c));
                    if(AdPopcornSSPRewardPlusWebViewActivity.this.i) {
                        AdPopcornSSPRewardPlusWebViewActivity.this.e.loadUrl("https://reward-plus-dev.adpopcorn.com/cs?" + s);
                    }
                    else {
                        AdPopcornSSPRewardPlusWebViewActivity.this.e.loadUrl("https://reward-plus.adpopcorn.com/cs?" + s);
                    }
                }
                AdPopcornSSPRewardPlusWebViewActivity.this.h = true;
            }
        }

        try {
            b.c(Thread.currentThread(), "openCSPage");
            this.runOnUiThread(new n(this));
        }
        catch(Exception unused_ex) {
        }
    }

    @JavascriptInterface
    public void openWebBrowser(String s) {
        try {
            w w0 = p.g(s);
            b.c(Thread.currentThread(), "openWebBrowser = " + w0.d());
            Intent intent0 = new Intent("android.intent.action.VIEW");
            intent0.setData(Uri.parse(w0.d()));
            this.c.startActivity(intent0);
        }
        catch(Exception unused_ex) {
        }
    }

    @JavascriptInterface
    public void pressBackKey() {
        class m implements Runnable {
            final AdPopcornSSPRewardPlusWebViewActivity a;

            @Override
            public void run() {
                if(AdPopcornSSPRewardPlusWebViewActivity.this.e != null && AdPopcornSSPRewardPlusWebViewActivity.this.e.canGoBack()) {
                    AdPopcornSSPRewardPlusWebViewActivity.this.e.goBack();
                }
                AdPopcornSSPRewardPlusWebViewActivity.this.h = false;
            }
        }

        try {
            b.c(Thread.currentThread(), "pressBackKey");
            this.runOnUiThread(new m(this));
        }
        catch(Exception unused_ex) {
        }
    }

    @JavascriptInterface
    public void showRewardVideo() {
        try {
            b.c(Thread.currentThread(), "showRewardVideo");
            j0.b().c();
            this.finish();
            this.overridePendingTransition(0, 0);
        }
        catch(Exception unused_ex) {
        }
    }

    @JavascriptInterface
    public void toastMessage(String s) {
        class l implements Runnable {
            final w a;
            final AdPopcornSSPRewardPlusWebViewActivity b;

            l(w w0) {
                this.a = w0;
                super();
            }

            @Override
            public void run() {
                try {
                    if(!AdPopcornSSPRewardPlusWebViewActivity.this.isFinishing()) {
                        Toast.makeText(AdPopcornSSPRewardPlusWebViewActivity.this.c, this.a.f(), 1).show();
                    }
                }
                catch(Exception unused_ex) {
                }
            }
        }

        try {
            w w0 = p.g(s);
            this.e.post(new l(this, w0));
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
    }
}

