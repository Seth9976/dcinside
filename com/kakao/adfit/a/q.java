package com.kakao.adfit.a;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.view.View;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.URLUtil;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.kakao.adfit.common.inappbrowser.activity.IABActivity;
import com.kakao.adfit.m.A;
import com.kakao.adfit.m.B;
import com.kakao.adfit.m.f;
import com.kakao.adfit.m.k;
import com.kakao.adfit.m.z;
import java.util.concurrent.atomic.AtomicBoolean;

public class q extends WebView {
    static final class b extends WebChromeClient {
        private b() {
        }

        b(a q$a0) {
        }

        @Override  // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView0, String s, String s1, JsResult jsResult0) {
            class com.kakao.adfit.a.q.b.a implements DialogInterface.OnClickListener {
                final JsResult a;
                final b b;

                com.kakao.adfit.a.q.b.a(JsResult jsResult0) {
                    this.a = jsResult0;
                    super();
                }

                @Override  // android.content.DialogInterface$OnClickListener
                public void onClick(DialogInterface dialogInterface0, int v) {
                    this.a.confirm();
                }
            }

            try {
                new AlertDialog.Builder(webView0.getContext()).setTitle(s).setMessage(s1).setPositiveButton(0x104000A, new com.kakao.adfit.a.q.b.a(this, jsResult0)).setCancelable(false).show();
                return true;
            }
            catch(Exception unused_ex) {
                return false;
            }
        }

        @Override  // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView0, int v) {
            if(v == 100) {
                f.a("Contents has been loaded");
            }
        }
    }

    class c extends WebViewClient {
        private final Handler a;
        final q b;

        c() {
            this.a = new Handler(Looper.getMainLooper());
        }

        @Override  // android.webkit.WebViewClient
        public void onPageFinished(WebView webView0, String s) {
            f.d(("onPageFinished: " + s));
            this.a.removeCallbacksAndMessages(null);
            webView0.requestLayout();
            webView0.invalidate();
            q.this.a.set(true);
            if(q.this.g != null) {
                q.this.g.a(s);
            }
        }

        @Override  // android.webkit.WebViewClient
        public void onPageStarted(WebView webView0, String s, Bitmap bitmap0) {
            class com.kakao.adfit.a.q.c.a implements Runnable {
                final String a;
                final c b;

                com.kakao.adfit.a.q.c.a(String s) {
                    this.a = s;
                    super();
                }

                @Override
                public void run() {
                    f.a(("Timeout: URL = " + this.a));
                    if(q.this.h != null) {
                        q.this.h.a(this.a);
                    }
                }
            }

            f.d(("onPageStarted: " + s));
            this.a.removeCallbacksAndMessages(null);
            com.kakao.adfit.a.q.c.a q$c$a0 = new com.kakao.adfit.a.q.c.a(this, s);
            this.a.postDelayed(q$c$a0, 30000L);
        }

        @Override  // android.webkit.WebViewClient
        public void onReceivedError(WebView webView0, int v, String s, String s1) {
            f.a(("Error: " + v + ", " + s));
            this.a.removeCallbacksAndMessages(null);
        }

        @Override  // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView0, RenderProcessGoneDetail renderProcessGoneDetail0) {
            f.a("WebView\'s render process has exited");
            if(q.this.j != null) {
                q.this.j.a();
            }
            return true;
        }

        @Override  // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView0, String s) {
            String s1 = !s.startsWith("http") || !s.contains("analytics.ad.daum.net") ? s : Uri.parse(s).buildUpon().appendQueryParameter("b", (webView0.isShown() ? "F" : "B")).appendQueryParameter("r", (z.c(webView0.getContext()) ? "R" : "N")).build().toString();
            f.d(("shouldOverrideUrlLoading: " + s1));
            if(q.this.i != null && !s.contains("info.ad.daum.net")) {
                q.this.i.a(s1);
            }
            return q.this.c(s1);
        }
    }

    public interface d {
        void a(String arg1);
    }

    public interface e {
        void a(String arg1);
    }

    public interface com.kakao.adfit.a.q.f {
        void a(String arg1);
    }

    public interface g {
        void a();
    }

    private final AtomicBoolean a;
    private final AtomicBoolean b;
    private int c;
    private int d;
    private final DisplayMetrics e;
    private Display f;
    private com.kakao.adfit.a.q.f g;
    private e h;
    private d i;
    private g j;

    public q(Context context0) {
        super(context0);
        this.a = new AtomicBoolean(false);
        this.b = new AtomicBoolean(false);
        this.e = new DisplayMetrics();
        this.f = null;
        A.a.b(context0);
        try {
            this.a(context0);
        }
        catch(Exception exception0) {
            com.kakao.adfit.common.matrix.c.a.a(exception0);
        }
    }

    private void a(WebSettings webSettings0, boolean z) {
        if(z) {
            webSettings0.setCacheMode(-1);
            this.setDrawingCacheEnabled(true);
            return;
        }
        webSettings0.setCacheMode(2);
        this.clearCache(true);
        this.setDrawingCacheEnabled(false);
    }

    public void a(int v, int v1) {
        this.c = v;
        this.d = v1;
        this.requestLayout();
    }

    protected void a(Context context0) {
        class a implements View.OnTouchListener {
            final q a;

            @Override  // android.view.View$OnTouchListener
            public boolean onTouch(View view0, MotionEvent motionEvent0) {
                switch(motionEvent0.getAction()) {
                    case 0: 
                    case 1: {
                        try {
                            if(!view0.hasFocus()) {
                                view0.requestFocus();
                            }
                        }
                        catch(Throwable unused_ex) {
                        }
                        return false;
                    }
                    default: {
                        return false;
                    }
                }
            }
        }

        this.setBackgroundColor(0);
        this.setFocusable(true);
        this.setFocusableInTouchMode(true);
        this.setOnTouchListener(new a(this));
        this.setVerticalScrollBarEnabled(false);
        this.setHorizontalScrollBarEnabled(false);
        this.setOverScrollMode(2);
        WebSettings webSettings0 = this.getSettings();
        webSettings0.setJavaScriptEnabled(true);
        webSettings0.setUserAgentString(k.a(this));
        webSettings0.setDomStorageEnabled(true);
        webSettings0.setSupportMultipleWindows(false);
        webSettings0.setSavePassword(false);
        webSettings0.setDefaultTextEncodingName("utf-8");
        webSettings0.setLoadsImagesAutomatically(true);
        webSettings0.setBuiltInZoomControls(false);
        webSettings0.setSupportZoom(false);
        webSettings0.setAllowFileAccess(true);
        this.setCache(true);
        this.setWebViewClient(new c(this));
        this.setWebChromeClient(new b(null));
    }

    public void a(String s) {
        this.loadDataWithBaseURL("https://display.ad.daum.net/", s, "text/html", "utf-8", null);
    }

    public boolean a() {
        return this.b.get();
    }

    public void b() {
        this.b("javascript:document.body.innerHTML=\'\';");
        this.destroyDrawingCache();
        this.removeAllViews();
    }

    public void b(String s) {
        String s1 = URLUtil.isJavaScriptUrl(s) ? s : "javascript:" + s;
        try {
            if(this.a.get()) {
                f.d(("Load javascript: " + s));
                this.loadUrl(s1);
            }
        }
        catch(Exception exception0) {
            f.a(("Failed to load javascript: " + exception0), exception0);
        }
    }

    public boolean c(String s) {
        Context context0 = this.getContext();
        if(B.a.a(context0, s)) {
            return true;
        }
        try {
            this.getContext().startActivity(IABActivity.a(this.getContext(), s));
        }
        catch(Throwable throwable0) {
            com.kakao.adfit.common.matrix.c.a.a(throwable0);
        }
        return true;
    }

    @Override  // android.webkit.WebView
    public void destroy() {
        if(!this.b.compareAndSet(false, true)) {
            return;
        }
        this.b();
        this.setOnKeyListener(null);
        super.destroy();
    }

    @Override  // android.webkit.WebView
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f = this.getDisplay();
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f = null;
    }

    @Override  // android.webkit.WebView
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        Display display0 = this.f;
        if(display0 != null) {
            display0.getMetrics(this.e);
        }
        int v2 = View.MeasureSpec.getMode(v) == 0 ? this.e.widthPixels : View.MeasureSpec.getSize(v);
        int v3 = View.MeasureSpec.getMode(v1) == 0 ? this.e.heightPixels : View.MeasureSpec.getSize(v1);
        int v4 = this.c;
        if(v4 > 0) {
            int v5 = this.d;
            if(v5 > 0) {
                int v6 = v3 * v4 / v5;
                if(v2 < v6) {
                    this.setMeasuredDimension(v2, v5 * v2 / v4);
                    return;
                }
                this.setMeasuredDimension(v6, v3);
                return;
            }
        }
        this.setMeasuredDimension(v2, v3);
    }

    public void setCache(boolean z) {
        this.a(this.getSettings(), z);
    }

    public void setOnNewPageOpenListener(d q$d0) {
        this.i = q$d0;
    }

    public void setOnPageErrorListener(e q$e0) {
        this.h = q$e0;
    }

    public void setOnPageLoadListener(com.kakao.adfit.a.q.f q$f0) {
        this.g = q$f0;
    }

    public void setOnPrivateAdEventListener(s s0) {
    }

    public void setOnRenderProcessGoneListener(g q$g0) {
        this.j = q$g0;
    }
}

