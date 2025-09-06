package com.vungle.ads.internal.ui.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import androidx.annotation.VisibleForTesting;
import com.vungle.ads.internal.util.i;
import com.vungle.ads.internal.util.p;
import com.vungle.ads.internal.util.y;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class b extends RelativeLayout {
    @Retention(RetentionPolicy.RUNTIME)
    public @interface a {
        public static final class com.vungle.ads.internal.ui.view.b.a.a {
            static final com.vungle.ads.internal.ui.view.b.a.a $$INSTANCE = null;
            public static final int IS_AD_FINISHED_BY_API = 4;
            public static final int IS_AD_FINISHING = 2;
            public static final int IS_CHANGING_CONFIGURATION = 1;

            static {
                com.vungle.ads.internal.ui.view.b.a.a.$$INSTANCE = new com.vungle.ads.internal.ui.view.b.a.a();
            }
        }

        @l
        public static final com.vungle.ads.internal.ui.view.b.a.a Companion = null;
        public static final int IS_AD_FINISHED_BY_API = 4;
        public static final int IS_AD_FINISHING = 2;
        public static final int IS_CHANGING_CONFIGURATION = 1;

        static {
            a.Companion = com.vungle.ads.internal.ui.view.b.a.a.$$INSTANCE;
        }
    }

    public static final class com.vungle.ads.internal.ui.view.b.b extends ContextWrapper {
        public com.vungle.ads.internal.ui.view.b.b(@m Context context0) {
            super(context0);
        }

        @Override  // android.content.ContextWrapper
        @l
        public Object getSystemService(@l String s) {
            L.p(s, "name");
            Object object0 = L.g("audio", s) ? this.getApplicationContext().getSystemService(s) : super.getSystemService(s);
            L.o(object0, "if (AUDIO_SERVICE == nam…rvice(name)\n            }");
            return object0;
        }
    }

    public interface c {
        void close();
    }

    public static final class d {
        private d() {
        }

        public d(w w0) {
        }
    }

    static final class e implements Runnable {
        @l
        private final b widget;

        public e(@l b b0) {
            L.p(b0, "widget");
            super();
            this.widget = b0;
        }

        @Override
        public void run() {
            try {
                this.widget.removeAllViews();
                WebView webView0 = this.widget.webView;
                if(webView0 != null) {
                    webView0.setWebChromeClient(null);
                    webView0.stopLoading();
                    webView0.clearHistory();
                    if(Build.VERSION.SDK_INT >= 29) {
                        webView0.setWebViewRenderProcessClient(null);
                    }
                    webView0.loadUrl("about:blank");
                    webView0.removeAllViews();
                    ViewParent viewParent0 = webView0.getParent();
                    ViewGroup viewGroup0 = viewParent0 instanceof ViewGroup ? ((ViewGroup)viewParent0) : null;
                    if(viewGroup0 != null) {
                        viewGroup0.removeView(webView0);
                    }
                    webView0.destroy();
                }
                this.widget.webView = null;
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    public interface f {
        boolean onTouch(@m MotionEvent arg1);
    }

    public interface g {
        void setOrientation(int arg1);
    }

    @l
    public static final d Companion = null;
    @l
    private static final String TAG = "MRAIDAdWidget";
    @m
    private c closeDelegate;
    @m
    private f onViewTouchListener;
    @m
    private g orientationDelegate;
    @m
    private WebView webView;

    static {
        b.Companion = new d(null);
    }

    public b(@l Context context0) throws InstantiationException {
        L.p(context0, "context");
        super(context0);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-1, -1);
        this.setLayoutParams(relativeLayout$LayoutParams0);
        WebView webView0 = y.INSTANCE.getWebView(context0);
        this.webView = webView0;
        if(webView0 != null) {
            webView0.setLayoutParams(relativeLayout$LayoutParams0);
        }
        WebView webView1 = this.webView;
        if(webView1 != null) {
            webView1.setTag("VungleWebView");
        }
        this.addView(this.webView, relativeLayout$LayoutParams0);
        this.bindListeners();
        this.prepare();
    }

    private final void applyDefault(WebView webView0) {
        WebSettings webSettings0 = webView0.getSettings();
        L.o(webSettings0, "webView.settings");
        webSettings0.setBuiltInZoomControls(false);
        webSettings0.setJavaScriptEnabled(true);
        webSettings0.setLoadWithOverviewMode(true);
        webSettings0.setSaveFormData(true);
        webSettings0.setUseWideViewPort(false);
        webSettings0.setAllowFileAccess(true);
        webSettings0.setAllowFileAccessFromFileURLs(true);
        webSettings0.setAllowUniversalAccessFromFileURLs(true);
        webView0.setVisibility(4);
        webSettings0.setMediaPlaybackRequiresUserGesture(false);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void bindListeners() {
        WebView webView0 = this.webView;
        if(webView0 != null) {
            webView0.setOnTouchListener((View view0, MotionEvent motionEvent0) -> {
                L.p(this, "this$0");
                return this.onViewTouchListener == null ? false : this.onViewTouchListener.onTouch(motionEvent0);
            });
        }
    }

    // 检测为 Lambda 实现
    private static final boolean bindListeners$lambda-0(b b0, View view0, MotionEvent motionEvent0) [...]

    public final void close() {
        c b$c0 = this.closeDelegate;
        if(b$c0 != null) {
            b$c0.close();
        }
    }

    public final void destroyWebView(long v) {
        if(v <= 0L) {
            new e(this).run();
            return;
        }
        new i().schedule(new e(this), v);
    }

    @m
    public final c getCloseDelegate$vungle_ads_release() {
        return this.closeDelegate;
    }

    @VisibleForTesting
    public static void getCloseDelegate$vungle_ads_release$annotations() {
    }

    @m
    public final f getOnViewTouchListener$vungle_ads_release() {
        return this.onViewTouchListener;
    }

    @VisibleForTesting
    public static void getOnViewTouchListener$vungle_ads_release$annotations() {
    }

    @m
    public final g getOrientationDelegate$vungle_ads_release() {
        return this.orientationDelegate;
    }

    @VisibleForTesting
    public static void getOrientationDelegate$vungle_ads_release$annotations() {
    }

    @m
    public final String getUrl() {
        return this.webView == null ? null : this.webView.getUrl();
    }

    public final void linkWebView(@l WebViewClient webViewClient0) {
        L.p(webViewClient0, "vngWebViewClient");
        WebView webView0 = this.webView;
        if(webView0 != null) {
            this.applyDefault(webView0);
            webView0.setWebViewClient(webViewClient0);
        }
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getLayoutParams();
        if(viewGroup$LayoutParams0 != null) {
            viewGroup$LayoutParams0.height = -1;
            viewGroup$LayoutParams0.width = -1;
        }
        WebView webView0 = this.webView;
        if(webView0 != null) {
            ViewGroup.LayoutParams viewGroup$LayoutParams1 = webView0.getLayoutParams();
            if(viewGroup$LayoutParams1 != null) {
                viewGroup$LayoutParams1.height = -1;
                viewGroup$LayoutParams1.width = -1;
            }
        }
    }

    public final void pauseWeb() {
        WebView webView0 = this.webView;
        if(webView0 != null) {
            webView0.onPause();
        }
    }

    private final void prepare() {
        WebView webView0 = this.webView;
        if(webView0 != null) {
            webView0.setLayerType(2, null);
            webView0.setBackgroundColor(0);
            webView0.setVisibility(8);
        }
    }

    public final void resumeWeb() {
        WebView webView0 = this.webView;
        if(webView0 != null) {
            webView0.onResume();
        }
    }

    public final void setCloseDelegate(@l c b$c0) {
        L.p(b$c0, "closeDelegate");
        this.closeDelegate = b$c0;
    }

    public final void setCloseDelegate$vungle_ads_release(@m c b$c0) {
        this.closeDelegate = b$c0;
    }

    public final void setOnViewTouchListener(@m f b$f0) {
        this.onViewTouchListener = b$f0;
    }

    public final void setOnViewTouchListener$vungle_ads_release(@m f b$f0) {
        this.onViewTouchListener = b$f0;
    }

    public final void setOrientation(int v) {
        g b$g0 = this.orientationDelegate;
        if(b$g0 != null) {
            b$g0.setOrientation(v);
        }
    }

    public final void setOrientationDelegate(@m g b$g0) {
        this.orientationDelegate = b$g0;
    }

    public final void setOrientationDelegate$vungle_ads_release(@m g b$g0) {
        this.orientationDelegate = b$g0;
    }

    public final void showWebsite(@l String s) {
        L.p(s, "url");
        p.Companion.d("MRAIDAdWidget", "loadUrl: " + s);
        WebView webView0 = this.webView;
        if(webView0 != null) {
            webView0.setVisibility(0);
            webView0.loadUrl(s);
        }
    }
}

