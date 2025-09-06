package com.igaworks.ssp.part.popcontents.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
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
import androidx.core.view.E0;
import androidx.core.view.F0;
import com.igaworks.ssp.E;
import com.igaworks.ssp.b;
import com.igaworks.ssp.f0;
import com.igaworks.ssp.part.NonLeakingWebView;

public class AdPopcornSSPPopContentsAdActivity extends Activity {
    class e implements View.OnTouchListener {
        private float a;
        private float b;
        private int c;
        final AdPopcornSSPPopContentsAdActivity d;

        e() {
            this.c = 200;
        }

        private boolean a(float f, float f1, float f2, float f3) {
            float f4 = (float)this.c;
            return Math.abs(f - f1) <= f4 && Math.abs(f2 - f3) <= f4;
        }

        @Override  // android.view.View$OnTouchListener
        public boolean onTouch(View view0, MotionEvent motionEvent0) {
            switch(motionEvent0.getAction()) {
                case 0: {
                    this.a = motionEvent0.getX();
                    this.b = motionEvent0.getY();
                    return false;
                }
                case 1: {
                    float f = motionEvent0.getX();
                    float f1 = motionEvent0.getY();
                    if(this.a(this.a, f, this.b, f1)) {
                        AdPopcornSSPPopContentsAdActivity.this.f = true;
                        return false;
                    }
                    return false;
                }
                default: {
                    return false;
                }
            }
        }
    }

    class f extends WebViewClient {
        final AdPopcornSSPPopContentsAdActivity a;

        private boolean a(WebView webView0, String s) {
            b.c(Thread.currentThread(), "mIsClicked : " + AdPopcornSSPPopContentsAdActivity.this.f + ", urlLoading : " + s);
            if(AdPopcornSSPPopContentsAdActivity.this.f && s != null) {
                AdPopcornSSPPopContentsAdActivity.this.f = false;
                Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse(s));
                intent0.addFlags(0x10000000);
                AdPopcornSSPPopContentsAdActivity.this.d.startActivity(intent0);
                return true;
            }
            webView0.loadUrl(s);
            return false;
        }

        @Override  // android.webkit.WebViewClient
        public void onPageFinished(WebView webView0, String s) {
            super.onPageFinished(webView0, s);
            b.c(Thread.currentThread(), "onPageFinished : " + s);
            AdPopcornSSPPopContentsAdActivity.this.f = false;
            if(!AdPopcornSSPPopContentsAdActivity.this.n && AdPopcornSSPPopContentsAdActivity.this.o) {
                AdPopcornSSPPopContentsAdActivity.this.callJavascript("window.nativeCallback.onPageLoaded(\'1\')");
            }
            AdPopcornSSPPopContentsAdActivity.this.n = true;
            if(AdPopcornSSPPopContentsAdActivity.this.u.booleanValue()) {
                AdPopcornSSPPopContentsAdActivity.this.e.clearHistory();
            }
            AdPopcornSSPPopContentsAdActivity.this.u = Boolean.FALSE;
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

    private final String a;
    private final String b;
    private final String c;
    private Context d;
    private NonLeakingWebView e;
    private boolean f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private boolean n;
    private boolean o;
    private boolean p;
    private final String q;
    private final String r;
    private final String s;
    private final String t;
    private Boolean u;
    private View.OnTouchListener v;
    private WebViewClient w;

    public AdPopcornSSPPopContentsAdActivity() {
        this.a = "AdPopcornSSPPopContentsAdActivity";
        this.b = "APSSPContents";
        this.c = "nativeBridge";
        this.f = false;
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = "";
        this.k = "";
        this.l = "";
        this.m = "";
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = "window.nativeCallback.registerBackKeyListener(\'1\')";
        this.r = "window.nativeCallback.registerBackKeyListener(\'0\')";
        this.s = "window.nativeCallback.onBackKeyPress()";
        this.t = "window.nativeCallback.onPageLoaded(\'1\')";
        this.u = Boolean.FALSE;
        this.v = new e(this);
        this.w = new f(this);
    }

    private View a() {
        View view0 = new FrameLayout(this.d);
        view0.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout0 = new LinearLayout(this.d);
        linearLayout0.setOrientation(1);
        linearLayout0.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        ((ViewGroup)view0).addView(linearLayout0);
        this.e = new NonLeakingWebView(this.d.getApplicationContext());
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
        this.e.setLayoutParams(frameLayout$LayoutParams0);
        this.e.getSettings().setJavaScriptEnabled(true);
        this.e.setWebViewClient(this.w);
        this.e.setVerticalScrollBarEnabled(false);
        this.e.setVerticalScrollbarOverlay(false);
        this.e.setHorizontalScrollBarEnabled(false);
        this.e.setHorizontalScrollbarOverlay(false);
        this.e.setBackgroundColor(-1);
        this.e.setOnTouchListener(this.v);
        this.e.getSettings().setDefaultTextEncodingName("UTF-8");
        this.e.getSettings().setAllowFileAccess(true);
        this.e.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.e.getSettings().setDomStorageEnabled(true);
        this.e.getSettings().setDatabaseEnabled(true);
        this.e.getSettings().setCacheMode(2);
        this.e.clearCache(true);
        this.e.addJavascriptInterface(this, "nativeBridge");
        this.e.addJavascriptInterface(this, "APSSPContents");
        WebView.setWebContentsDebuggingEnabled(true);
        this.e.getSettings().setTextZoom(100);
        linearLayout0.addView(this.e);
        return view0;
    }

    // 检测为 Lambda 实现
    private static WindowInsets a(View view0, WindowInsets windowInsets0) [...]

    // 去混淆评级： 低(20)
    private String a(String s, String s1) {
        return "window.dispatchEvent(\n   new CustomEvent(\"" + s + "\", {\n" + "           detail: {\n" + "               data: " + s1 + "\n" + "           }\n" + "       }\n" + "   )\n" + ");";
    }

    private void b() {
        try {
            b.c(Thread.currentThread(), "loadPage : " + this.l);
            this.e.loadUrl(this.l);
            this.d();
        }
        catch(Exception unused_ex) {
        }
    }

    private void c() {
        try {
            f0.a().a(this.h).a();
        }
        catch(Exception unused_ex) {
        }
    }

    public void callEvent(String s) {
        class com.igaworks.ssp.part.popcontents.activity.AdPopcornSSPPopContentsAdActivity.b implements Runnable {
            final String a;
            final AdPopcornSSPPopContentsAdActivity b;

            com.igaworks.ssp.part.popcontents.activity.AdPopcornSSPPopContentsAdActivity.b(String s) {
                this.a = s;
                super();
            }

            @Override
            public void run() {
                AdPopcornSSPPopContentsAdActivity.this.e.evaluateJavascript(AdPopcornSSPPopContentsAdActivity.this.a("NativeEvent", (this.a == null ? this.a : this.a.replace("\n", "<br>"))), null);
            }
        }

        b.c(Thread.currentThread(), "callEvent : " + s);
        this.e.post(new com.igaworks.ssp.part.popcontents.activity.AdPopcornSSPPopContentsAdActivity.b(this, s));
    }

    public void callJavascript(String s) {
        class a implements Runnable {
            final String a;
            final AdPopcornSSPPopContentsAdActivity b;

            a(String s) {
                this.a = s;
                super();
            }

            @Override
            public void run() {
                b.c(Thread.currentThread(), "callJavascript : " + this.a);
                AdPopcornSSPPopContentsAdActivity.this.e.evaluateJavascript(this.a, null);
            }
        }

        try {
            NonLeakingWebView nonLeakingWebView0 = this.e;
            if(nonLeakingWebView0 != null) {
                nonLeakingWebView0.post(new a(this, s));
            }
        }
        catch(Exception unused_ex) {
        }
    }

    private void d() {
        try {
            f0.a().a(this.h).b();
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // android.app.Activity
    @JavascriptInterface
    public void finish() {
        try {
            b.c(Thread.currentThread(), "JavascriptInterface finish");
            super.finish();
            this.overridePendingTransition(0, 0);
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // android.app.Activity
    public void onBackPressed() {
        try {
            if(this.p) {
                b.c(Thread.currentThread(), "onBackPressed enableBackKeyCallback");
                this.callJavascript("window.nativeCallback.onBackKeyPress()");
                return;
            }
            super.onBackPressed();
            this.overridePendingTransition(0, 0);
            return;
        }
        catch(Exception exception0) {
        }
        exception0.printStackTrace();
    }

    @Override  // android.app.Activity
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.d = this;
        try {
            Intent intent0 = this.getIntent();
            this.g = intent0.getStringExtra("appKey");
            this.h = intent0.getStringExtra("placement_id");
            this.l = intent0.getStringExtra("popcontents_url");
            this.i = intent0.getStringExtra("popcontents_channel_id");
            this.j = intent0.getStringExtra("popcontents_serevice_id");
            this.k = intent0.getStringExtra("popcontents_page_id");
            this.m = "";
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
            this.n = false;
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
        this.c();
    }

    @Override  // android.app.Activity
    public void onDetachedFromWindow() {
        class d implements Runnable {
            final AdPopcornSSPPopContentsAdActivity a;

            @Override
            public void run() {
                if(AdPopcornSSPPopContentsAdActivity.this.e != null) {
                    try {
                        AdPopcornSSPPopContentsAdActivity.this.e.loadUrl("about:blank");
                        AdPopcornSSPPopContentsAdActivity.this.e.clearDisappearingChildren();
                        AdPopcornSSPPopContentsAdActivity.this.e.removeAllViews();
                        if(AdPopcornSSPPopContentsAdActivity.this.e.getParent() != null) {
                            ((ViewGroup)AdPopcornSSPPopContentsAdActivity.this.e.getParent()).removeView(AdPopcornSSPPopContentsAdActivity.this.e);
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
            new Handler(Looper.getMainLooper()).post(new d(this));
        }
        catch(Exception exception0) {
            b.c(Thread.currentThread(), "onDetachedFromWindow" + exception0);
        }
    }

    @JavascriptInterface
    public void onPageLoaded() {
        try {
            b.c(Thread.currentThread(), "JavascriptInterface onPageLoaded event enable");
            this.o = true;
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
    public void openExternalBrowser(String s) {
        try {
            b.c(Thread.currentThread(), "JavascriptInterface openExternalBrowser : " + s);
            Intent intent0 = new Intent("android.intent.action.VIEW");
            intent0.addFlags(0x10000000);
            intent0.setData(Uri.parse(s));
            this.d.startActivity(intent0);
        }
        catch(Exception unused_ex) {
        }
    }

    @JavascriptInterface
    public void openWebBrowser(String s) {
        try {
            b.c(Thread.currentThread(), "openWebBrowser : " + s);
            Intent intent0 = new Intent("android.intent.action.VIEW");
            intent0.addFlags(0x10000000);
            intent0.setData(Uri.parse(s));
            this.d.startActivity(intent0);
        }
        catch(Exception unused_ex) {
        }
    }

    @JavascriptInterface
    public void pushUrl(String s, boolean z) {
        class c implements Runnable {
            final String a;
            final boolean b;
            final AdPopcornSSPPopContentsAdActivity c;

            c(String s, boolean z) {
                this.a = s;
                this.b = z;
                super();
            }

            @Override
            public void run() {
                AdPopcornSSPPopContentsAdActivity.this.e.loadUrl(this.a);
                if(this.b) {
                    AdPopcornSSPPopContentsAdActivity.this.u = Boolean.TRUE;
                    return;
                }
                AdPopcornSSPPopContentsAdActivity.this.u = Boolean.FALSE;
            }
        }

        try {
            b.c(Thread.currentThread(), "JavascriptInterface pushUrl : " + z + ", url : " + s);
            this.e.post(new c(this, s, z));
        }
        catch(Exception unused_ex) {
        }
    }

    @JavascriptInterface
    public void registerBackKeyListener() {
        try {
            b.c(Thread.currentThread(), "JavascriptInterface registerBackKeyListener");
            this.p = true;
            this.callJavascript("window.nativeCallback.registerBackKeyListener(\'1\')");
        }
        catch(Exception unused_ex) {
            this.callJavascript("window.nativeCallback.registerBackKeyListener(\'0\')");
        }
    }

    @JavascriptInterface
    public void tracking(String s) {
        try {
            b.c(Thread.currentThread(), "tracking : " + s);
            E.g().d().a(this.d, com.igaworks.ssp.t.e.i, s);
        }
        catch(Exception unused_ex) {
        }
    }
}

