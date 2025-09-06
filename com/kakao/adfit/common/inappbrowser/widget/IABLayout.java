package com.kakao.adfit.common.inappbrowser.widget;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.kakao.adfit.ads.R.dimen;
import com.kakao.adfit.ads.R.id;
import com.kakao.adfit.ads.R.layout;
import com.kakao.adfit.ads.R.string;
import com.kakao.adfit.m.B;
import com.kakao.adfit.m.c;
import com.kakao.adfit.m.f;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.regex.Pattern;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import y4.l;
import y4.m;
import z3.j;

@s0({"SMAP\nIABLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IABLayout.kt\ncom/kakao/adfit/common/inappbrowser/widget/IABLayout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,553:1\n1#2:554\n*E\n"})
public final class IABLayout extends FrameLayout {
    public interface d {
        void a();

        void b();

        void c();
    }

    private final IABWebView a;
    private final IABNavigationBar b;
    private final ProgressBar c;
    private final View d;
    private final FrameLayout e;
    private WebChromeClient f;
    private boolean g;
    private boolean h;
    private boolean i;
    private final Pattern j;
    private String k;
    private d l;

    @j
    public IABLayout(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public IABLayout(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public IABLayout(@l Context context0, @m AttributeSet attributeSet0, int v) {
        public static final class a implements com.kakao.adfit.common.inappbrowser.widget.IABNavigationBar.a {
            final IABLayout a;

            a(IABLayout iABLayout0) {
                this.a = iABLayout0;
                super();
            }

            @Override  // com.kakao.adfit.common.inappbrowser.widget.IABNavigationBar$a
            public void a() {
                this.a.h();
            }

            @Override  // com.kakao.adfit.common.inappbrowser.widget.IABNavigationBar$a
            public void b() {
                if(this.a.a.canGoForward()) {
                    this.a.a.goForward();
                }
            }

            @Override  // com.kakao.adfit.common.inappbrowser.widget.IABNavigationBar$a
            public void c() {
                this.a.c();
            }

            @Override  // com.kakao.adfit.common.inappbrowser.widget.IABNavigationBar$a
            public void d() {
                if(this.a.a.canGoBack()) {
                    this.a.a.goBack();
                }
            }

            @Override  // com.kakao.adfit.common.inappbrowser.widget.IABNavigationBar$a
            public void e() {
                this.a.i();
            }

            @Override  // com.kakao.adfit.common.inappbrowser.widget.IABNavigationBar$a
            public void f() {
                this.a.j();
            }

            @Override  // com.kakao.adfit.common.inappbrowser.widget.IABNavigationBar$a
            public void g() {
                this.a.b();
            }
        }


        public static final class b extends WebViewClient {
            private boolean a;
            final Context b;
            final IABLayout c;

            b(Context context0, IABLayout iABLayout0) {
                this.b = context0;
                this.c = iABLayout0;
                super();
            }

            @Override  // android.webkit.WebViewClient
            public void onLoadResource(WebView webView0, String s) {
                L.p(webView0, "view");
                L.p(s, "url");
                if(!this.a && v.N1(s, ".js", false, 2, null)) {
                    this.a = true;
                    String s1 = this.c.k;
                    if(s1 != null && !v.x3(s1) == 1) {
                        f.d(("IABLayout#onLoadResource(): inject etxId = " + s1));
                        webView0.evaluateJavascript("window._kakaoPixelEtxId = \'" + s1 + "\';", null);
                    }
                }
                super.onLoadResource(webView0, s);
            }

            @Override  // android.webkit.WebViewClient
            public void onPageFinished(WebView webView0, String s) {
                public static final class com.kakao.adfit.common.inappbrowser.widget.IABLayout.b.a implements Runnable {
                    final WeakReference a;
                    final IABNavigationBar b;

                    public com.kakao.adfit.common.inappbrowser.widget.IABLayout.b.a(WeakReference weakReference0, IABNavigationBar iABNavigationBar0) {
                        this.a = weakReference0;
                        this.b = iABNavigationBar0;
                        super();
                    }

                    @Override
                    public final void run() {
                        WebView webView0 = (WebView)this.a.get();
                        if(webView0 != null && webView0.isAttachedToWindow()) {
                            this.b.a(webView0);
                        }
                    }
                }

                L.p(webView0, "view");
                L.p(s, "url");
                f.d(("IABLayout#onPageFinished(): url = " + s));
                if(this.c.i) {
                    if(!v.O1("about:blank", s, true)) {
                        this.c.i = false;
                    }
                    try {
                        webView0.clearHistory();
                    }
                    catch(Throwable unused_ex) {
                    }
                }
                super.onPageFinished(webView0, s);
                if(this.c.g) {
                    IABNavigationBar iABNavigationBar0 = this.c.b;
                    iABNavigationBar0.postDelayed(new com.kakao.adfit.common.inappbrowser.widget.IABLayout.b.a(new WeakReference(webView0), iABNavigationBar0), 300L);
                }
                else {
                    String s1 = webView0.getTitle();
                    if(s1 != null) {
                        this.c.b.c(s1);
                    }
                    this.c.b.a(webView0);
                    this.c.a.setVisibility(0);
                    this.c.d.setVisibility(8);
                }
                this.c.c.setVisibility(8);
                c.a.a();
            }

            @Override  // android.webkit.WebViewClient
            public void onPageStarted(WebView webView0, String s, Bitmap bitmap0) {
                L.p(webView0, "view");
                L.p(s, "url");
                f.d(("IABLayout#onPageStarted(): url = " + s));
                super.onPageStarted(webView0, s, bitmap0);
                if(this.c.g) {
                    this.c.g = false;
                    this.c.a.setVisibility(0);
                    this.c.d.setVisibility(8);
                }
                String s1 = this.b.getString(string.adfit_iab_label_for_request_web);
                L.o(s1, "context.getString(R.stri…ab_label_for_request_web)");
                this.c.b.c(s1);
                this.c.b.b(s);
                this.c.b.a(webView0);
                this.c.c.setProgress(0);
                this.c.c.setVisibility(0);
                this.a = false;
            }

            @Override  // android.webkit.WebViewClient
            public void onReceivedError(WebView webView0, int v, String s, String s1) {
                L.p(webView0, "view");
                L.p(s, "description");
                L.p(s1, "failingUrl");
                f.a(("IABLayout#onReceivedError(): error = [" + v + "] " + s + ", url = " + s1));
                super.onReceivedError(webView0, v, s, s1);
                this.c.g = true;
                String s2 = this.c.getResources().getString(string.adfit_iab_label_error_message);
                L.o(s2, "resources.getString(R.st…_iab_label_error_message)");
                this.c.b.c(s2);
                this.c.b.b();
                this.c.a.setVisibility(8);
                this.c.d.setVisibility(0);
                this.c.c.setVisibility(8);
                B.a.a(this.b, v, s, s1);
            }

            @Override  // android.webkit.WebViewClient
            public boolean onRenderProcessGone(WebView webView0, RenderProcessGoneDetail renderProcessGoneDetail0) {
                L.p(webView0, "view");
                L.p(renderProcessGoneDetail0, "detail");
                f.a("IABLayout#onRenderProcessGone()");
                this.c.b();
                return true;
            }

            @Override  // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView0, String s) {
                L.p(webView0, "webView");
                L.p(s, "url");
                f.d(("IABLayout#shouldOverrideUrlLoading(): url = " + s));
                if(B.a.c(this.b, s)) {
                    return true;
                }
                if(!this.c.a(s)) {
                    this.c.b(s);
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView0, s);
            }
        }


        public static final class com.kakao.adfit.common.inappbrowser.widget.IABLayout.c extends WebChromeClient {
            private WebChromeClient.CustomViewCallback a;
            final IABLayout b;

            com.kakao.adfit.common.inappbrowser.widget.IABLayout.c(IABLayout iABLayout0) {
                this.b = iABLayout0;
                super();
            }

            @Override  // android.webkit.WebChromeClient
            public void onHideCustomView() {
                f.d("IABLayout#onHideCustomView()");
                if(!this.b.h) {
                    return;
                }
                this.b.h = false;
                this.b.e.setVisibility(8);
                this.b.e.removeAllViews();
                WebChromeClient.CustomViewCallback webChromeClient$CustomViewCallback0 = this.a;
                if(webChromeClient$CustomViewCallback0 != null) {
                    try {
                        webChromeClient$CustomViewCallback0.onCustomViewHidden();
                    }
                    catch(Throwable unused_ex) {
                    }
                }
                this.a = null;
                d iABLayout$d0 = this.b.getOnEventListener();
                if(iABLayout$d0 != null) {
                    iABLayout$d0.b();
                }
            }

            @Override  // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView0, int v) {
                L.p(webView0, "view");
                this.b.c.setProgress(v);
            }

            @Override  // android.webkit.WebChromeClient
            public void onReceivedTitle(WebView webView0, String s) {
                L.p(webView0, "view");
                L.p(s, "title");
                f.d(("IABLayout#onReceivedTitle(): title = " + s));
                if(!this.b.g) {
                    this.b.b.c(s);
                }
                this.b.b.a(webView0);
            }

            @Override  // android.webkit.WebChromeClient
            public void onShowCustomView(View view0, WebChromeClient.CustomViewCallback webChromeClient$CustomViewCallback0) {
                L.p(view0, "view");
                f.d("IABLayout#onShowCustomView()");
                this.b.h = true;
                this.b.e.addView(view0);
                this.b.e.setVisibility(0);
                this.a = webChromeClient$CustomViewCallback0;
                d iABLayout$d0 = this.b.getOnEventListener();
                if(iABLayout$d0 != null) {
                    iABLayout$d0.c();
                }
            }
        }

        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.j = Pattern.compile("^(https?://|about:|javascript:).*", 2);
        LayoutInflater.from(context0).inflate(layout.adfit_webview_layout, this, true);
        View view0 = this.findViewById(id.webview);
        L.o(view0, "findViewById(R.id.webview)");
        this.a = (IABWebView)view0;
        View view1 = this.findViewById(id.webview_navigation);
        L.o(view1, "findViewById(R.id.webview_navigation)");
        this.b = (IABNavigationBar)view1;
        View view2 = this.findViewById(id.webview_progress);
        L.o(view2, "findViewById(R.id.webview_progress)");
        this.c = (ProgressBar)view2;
        View view3 = this.findViewById(id.webview_error_page);
        L.o(view3, "findViewById(R.id.webview_error_page)");
        this.d = view3;
        View view4 = this.findViewById(id.fullscreen_view);
        L.o(view4, "findViewById(R.id.fullscreen_view)");
        this.e = (FrameLayout)view4;
        ((IABNavigationBar)view1).setOnItemClickListener(new a(this));
        ((IABWebView)view0).setWebViewClient(new b(context0, this));
        com.kakao.adfit.common.inappbrowser.widget.IABLayout.c iABLayout$c0 = new com.kakao.adfit.common.inappbrowser.widget.IABLayout.c(this);
        this.f = iABLayout$c0;
        ((IABWebView)view0).setWebChromeClient(iABLayout$c0);
        ((IABWebView)view0).setHorizontalScrollBarEnabled(false);
        ((IABWebView)view0).setDownloadListener((String s, String s1, String s2, String s3, long v) -> {
            L.p(context0, "$context");
            try {
                Uri uri0 = Uri.parse(s);
                Intent intent0 = new Intent("android.intent.action.VIEW");
                intent0.setData(uri0);
                context0.startActivity(intent0);
            }
            catch(Throwable throwable0) {
                f.b(("Failed to downloaded file. [error = " + throwable0 + ']'));
            }
        });
        this.findViewById(id.webview_refresh_button).setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.h();
        });
        c.a.a(((IABWebView)view0));
    }

    public IABLayout(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    private final String a(Intent intent0) {
        String s = intent0.getStringExtra("browser_fallback_url");
        if(s != null && s.length() > 0) {
            try {
                return URLDecoder.decode(s, "UTF-8");
            }
            catch(UnsupportedEncodingException unused_ex) {
            }
        }
        return null;
    }

    // 检测为 Lambda 实现
    private static final void a(Context context0, String s, String s1, String s2, String s3, long v) [...]

    private final void a(WebView webView0) {
        try {
            webView0.destroyDrawingCache();
            webView0.setDownloadListener(null);
            webView0.setWebChromeClient(null);
            webView0.stopLoading();
            webView0.clearCache(true);
            webView0.removeAllViews();
            webView0.loadUrl("about:blank");
            webView0.clearHistory();
            webView0.clearFormData();
            webView0.clearSslPreferences();
            webView0.clearDisappearingChildren();
            webView0.clearFocus();
            webView0.clearMatches();
            webView0.freeMemory();
        }
        catch(Throwable unused_ex) {
        }
        try {
            webView0.destroy();
        }
        catch(Throwable unused_ex) {
        }
    }

    // 检测为 Lambda 实现
    private static final void a(IABLayout iABLayout0, View view0) [...]

    private final boolean a(String s) {
        return this.j.matcher(s).matches();
    }

    public final void a() {
        this.i = true;
        this.a.loadUrl("about:blank");
    }

    public final void a(String s, String s1) {
        if(s != null && s.length() > 0) {
            B b0 = B.a;
            if(b0.a(s)) {
                this.a.loadUrl("about:blank");
                return;
            }
            Context context0 = this.getContext();
            L.o(context0, "context");
            if(b0.c(context0, s)) {
                this.b();
                return;
            }
            if(!this.a(s) && this.b(s)) {
                return;
            }
            this.k = s1;
            f.a(("In-app browser load URL: URL = " + s));
            String s2 = this.getContext().getString(string.adfit_iab_label_for_request_web);
            L.o(s2, "context.getString(R.stri…ab_label_for_request_web)");
            this.b.c(s2);
            this.a.loadUrl(s);
            return;
        }
        this.a.loadUrl("about:blank");
    }

    private final String b(Intent intent0) {
        String s = intent0.getPackage();
        if(s != null && s.length() > 0) {
            String s1 = intent0.getStringExtra("market_referrer");
            if(s1 != null && s1.length() > 0) {
                try {
                    return "market://details?id=" + s + "&referrer=" + URLEncoder.encode(s1, "UTF-8");
                }
                catch(UnsupportedEncodingException unused_ex) {
                }
            }
            return "market://details?id=" + s;
        }
        return null;
    }

    private final boolean b(String s) {
        Intent intent0;
        f.d(("IABLayout#overrideUrlLoading(): url = " + s));
        try {
            intent0 = Intent.parseUri(s, ((int)v.v2(s, "intent:", false, 2, null)));
            L.o(intent0, "{\n            Intent.par…_SCHEME else 0)\n        }");
        }
        catch(Exception exception0) {
            f.e(("Failed to parse URL: " + exception0));
            return false;
        }
        if(this.d(intent0)) {
            f.a(("In-app browser load URL by intent: intent = " + intent0));
            String s1 = this.a.getUrl();
            if(s1 == null || s1.length() <= 0) {
                this.b();
            }
            return true;
        }
        String s2 = this.a(intent0);
        if(s2 != null && s2.length() > 0 && !L.g(s, s2)) {
            f.a(("In-app browser load fallback URL: URL = " + s2));
            if(this.a(s2)) {
                this.a.loadUrl(s2);
                return true;
            }
            if(this.b(s2)) {
                return true;
            }
        }
        String s3 = this.b(intent0);
        if(s3 != null && s3.length() > 0) {
            f.a(("In-app browser load market page: URL = " + s3));
            if(this.b(s3)) {
                return true;
            }
        }
        if(L.g(intent0.getScheme(), "market")) {
            String s4 = this.c(intent0);
            if(s4 != null && s4.length() > 0) {
                f.a(("In-app browser load Play Store page: URL = " + s4));
                this.a.loadUrl(s4);
                return true;
            }
        }
        return false;
    }

    public final void b() {
        this.a.stopLoading();
        d iABLayout$d0 = this.l;
        if(iABLayout$d0 != null) {
            iABLayout$d0.a();
        }
    }

    private final String c(Intent intent0) {
        Uri uri0 = intent0.getData();
        if(uri0 != null) {
            String s = uri0.toString();
            L.o(s, "data.toString()");
            if(v.v2(s, "market://details?", false, 2, null)) {
                try {
                    String s1 = uri0.getQueryParameter("id");
                    return s1 == null || s1.length() <= 0 ? null : "https://play.google.com/store/apps/details?" + uri0.getEncodedQuery();
                }
                catch(UnsupportedOperationException unused_ex) {
                }
            }
        }
        return null;
    }

    public final void c() {
        String s = this.a.getUrl();
        if(s != null && s.length() > 0) {
            Object object0 = this.getContext().getSystemService("clipboard");
            L.n(object0, "null cannot be cast to non-null type android.content.ClipboardManager");
            ClipData clipData0 = ClipData.newPlainText("URL", s);
            L.o(clipData0, "newPlainText(\"URL\", url)");
            ((ClipboardManager)object0).setPrimaryClip(clipData0);
            Toast toast0 = Toast.makeText(this.getContext(), this.getResources().getString(string.adfit_iab_url_copy), 0);
            toast0.setGravity(0x30, 17, this.getResources().getDimensionPixelOffset(dimen.adfit_webview_url_copy_toast_y));
            toast0.show();
        }
    }

    private final boolean d(Intent intent0) {
        try {
            this.getContext().startActivity(intent0.addFlags(0x10000000));
            return true;
        }
        catch(Exception exception0) {
            f.b(("Failed to start Activity: " + exception0));
            return false;
        }
    }

    public final boolean d() {
        if(this.a.isAttachedToWindow()) {
            if(this.h) {
                WebChromeClient webChromeClient0 = this.f;
                if(webChromeClient0 != null) {
                    webChromeClient0.onHideCustomView();
                }
                return true;
            }
            if(this.a.canGoBack()) {
                this.a.goBack();
                return true;
            }
        }
        return false;
    }

    public final void e() {
        this.l = null;
        this.f = null;
        this.removeAllViews();
        this.a(this.a);
        System.gc();
    }

    public final void f() {
        if(this.h) {
            WebChromeClient webChromeClient0 = this.f;
            if(webChromeClient0 != null) {
                webChromeClient0.onHideCustomView();
            }
        }
        this.a.onPause();
    }

    public final void g() {
        this.a.onResume();
    }

    @m
    public final d getOnEventListener() {
        return this.l;
    }

    public final void h() {
        this.a.stopLoading();
        this.a.reload();
    }

    public final void i() {
        String s = this.a.getUrl();
        if(s != null && s.length() > 0) {
            Intent intent0 = new Intent();
            intent0.setAction("android.intent.action.SEND");
            intent0.setType("text/plain");
            intent0.putExtra("android.intent.extra.TEXT", s);
            String s1 = this.a.getTitle();
            if(s1 != null) {
                L.o(s1, "it");
                if(s1.length() <= 0) {
                    s1 = null;
                }
                if(s1 != null) {
                    intent0.putExtra("android.intent.extra.SUBJECT", s1);
                }
            }
            try {
                this.getContext().startActivity(Intent.createChooser(intent0, null));
            }
            catch(Exception unused_ex) {
            }
        }
    }

    public final void j() {
        String s = this.a.getUrl();
        if(s != null && s.length() > 0) {
            Context context0 = this.getContext();
            L.o(context0, "context");
            B.a.b(context0, s);
        }
    }

    public final void setOnEventListener(@m d iABLayout$d0) {
        this.l = iABLayout$d0;
    }
}

