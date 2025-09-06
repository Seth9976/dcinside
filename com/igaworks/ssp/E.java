package com.igaworks.ssp;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils.TruncateAt;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.igaworks.ssp.part.NonLeakingWebView;
import java.net.URISyntaxException;
import java.util.ArrayList;

public class e extends LinearLayout {
    class k implements ViewTreeObserver.OnGlobalLayoutListener {
        final e a;

        @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
        public void onGlobalLayout() {
            if(e.this.k) {
                e.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                return;
            }
            e.this.d();
        }
    }

    class l implements ViewTreeObserver.OnScrollChangedListener {
        final e a;

        @Override  // android.view.ViewTreeObserver$OnScrollChangedListener
        public void onScrollChanged() {
            try {
                if(e.this.k) {
                    e.this.getViewTreeObserver().removeOnScrollChangedListener(this);
                    return;
                }
                e.this.d();
            }
            catch(Exception unused_ex) {
            }
        }
    }

    class m implements View.OnTouchListener {
        private int a;
        private float b;
        private float c;
        final e d;

        m() {
            this.a = 200;
        }

        private boolean a(float f, float f1, float f2, float f3) {
            float f4 = (float)this.a;
            return Math.abs(f - f1) <= f4 && Math.abs(f2 - f3) <= f4;
        }

        @Override  // android.view.View$OnTouchListener
        public boolean onTouch(View view0, MotionEvent motionEvent0) {
            switch(motionEvent0.getAction()) {
                case 0: {
                    this.b = motionEvent0.getX();
                    this.c = motionEvent0.getY();
                    return false;
                }
                case 1: {
                    float f = motionEvent0.getX();
                    float f1 = motionEvent0.getY();
                    if(this.a(this.b, f, this.c, f1)) {
                        e.this.b = true;
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

    class n extends WebViewClient {
        final e a;

        private boolean a(WebView webView0, String s) {
            b.c(Thread.currentThread(), "urlLoading: " + s);
            if(e.this.n != null) {
                for(Object object0: e.this.n) {
                    if(s != null && s.startsWith(((String)object0)) && e.this.b) {
                        b.c(Thread.currentThread(), "click urlSchemeList url : " + s);
                        e.this.b = false;
                        e.this.a(e.this.g);
                        Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse(s));
                        intent0.addFlags(0x10000000);
                        e.this.h.startActivity(intent0);
                        return true;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            Intent intent1 = null;
            if(s != null && (s.startsWith("http://") || s.startsWith("https://") || s.startsWith("market://"))) {
                if(e.this.b) {
                    b.c(Thread.currentThread(), "click http/https/market url : " + s);
                    e.this.b = false;
                    e.this.a(e.this.g);
                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(s));
                    intent2.addFlags(0x10000000);
                    e.this.h.startActivity(intent2);
                }
                return true;
            }
            if(s != null && s.toLowerCase().startsWith("intent:")) {
                try {
                    if(e.this.b) {
                        b.c(Thread.currentThread(), "click intent scheme url : " + s);
                        e.this.b = false;
                        e.this.a(e.this.g);
                        intent1 = Intent.parseUri(s, 1);
                        intent1.addFlags(0x10000000);
                        if(s0.a(intent1.getPackage())) {
                            Intent intent3 = e.this.h.getPackageManager().getLaunchIntentForPackage(intent1.getPackage());
                            b.c(Thread.currentThread(), "click intent existPackageIntent : " + intent3);
                            if(intent3 != null) {
                                e.this.h.startActivity(intent1);
                                return true;
                            }
                            Intent intent4 = new Intent("android.intent.action.VIEW");
                            intent4.addFlags(0x10000000);
                            intent4.setData(Uri.parse(("market://details?id=" + intent1.getPackage())));
                            e.this.h.startActivity(intent4);
                        }
                    }
                    return true;
                }
                catch(ActivityNotFoundException | URISyntaxException unused_ex) {
                    return this.a(webView0, intent1);
                }
            }
            try {
                if(e.this.b && e.this.n != null && e.this.n.contains("ap_direct_deeplink")) {
                    b.c(Thread.currentThread(), "click pass direct_deeplink : " + s);
                    e.this.b = false;
                    e.this.a(e.this.g);
                    Intent intent5 = new Intent("android.intent.action.VIEW", Uri.parse(s));
                    intent5.addFlags(0x10000000);
                    e.this.h.startActivity(intent5);
                    return true;
                }
            }
            catch(Exception unused_ex) {
                b.c(Thread.currentThread(), "can not find action view activity : " + s);
            }
            webView0.loadUrl(s);
            return false;
        }

        public boolean a(WebView webView0, Intent intent0) {
            b.c(Thread.currentThread(), "doFallback : " + intent0);
            if(intent0 == null) {
                return false;
            }
            String s = intent0.getStringExtra("browser_fallback_url");
            if(s != null) {
                webView0.loadUrl(s);
                return true;
            }
            String s1 = intent0.getPackage();
            if(s1 != null) {
                Intent intent1 = new Intent("android.intent.action.VIEW", Uri.parse(("market://details?id=" + s1)));
                e.this.h.startActivity(intent1);
                return true;
            }
            return false;
        }

        @Override  // android.webkit.WebViewClient
        public void onPageFinished(WebView webView0, String s) {
            boolean z;
            super.onPageFinished(webView0, s);
            try {
                if(!e0.b(e.this.h.getApplicationContext())) {
                    b.c(Thread.currentThread(), "onPageFinished Network OFFLINE");
                    e.this.b();
                    return;
                }
                e.this.b = false;
                e.this.j = 0;
                long v = System.currentTimeMillis();
                long v1 = e.this.a;
                if(s == null || !s.equals("about:blank")) {
                    b.c(Thread.currentThread(), "WebContents Loading Time  : " + (v - v1));
                    z = false;
                }
                else {
                    z = true;
                }
                if(e.this.e.getParent() == null) {
                    e.this.addView(e.this.e);
                }
                if(e.this.f) {
                    if(!z) {
                        e.this.c();
                    }
                    e.this.e.setDrawingCacheQuality(0x80000);
                    e.this.e.setDrawingCacheEnabled(true);
                    e.this.e.buildDrawingCache();
                    if(e.this.e != null) {
                        e.this.a(350, false);
                    }
                }
                else {
                    webView0.setVisibility(0);
                    Context context0 = webView0.getContext();
                    e.this.d(context0);
                    if(!z) {
                        e.this.c();
                    }
                }
            }
            catch(Exception exception0) {
                b.a(Thread.currentThread(), exception0);
                e.this.b();
            }
        }

        @Override  // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView0, WebResourceRequest webResourceRequest0) {
            class a implements com.igaworks.ssp.u0.b {
                final WebView a;
                final String b;
                final n c;

                a(WebView webView0, String s) {
                    this.a = webView0;
                    this.b = s;
                    super();
                }

                @Override  // com.igaworks.ssp.u0$b
                public void a() {
                    b.c(Thread.currentThread(), "onFailure urlLoading : " + this.b);
                    n.this.a(this.a, this.b);
                }

                @Override  // com.igaworks.ssp.u0$b
                public void onSuccess(String s) {
                    b.c(Thread.currentThread(), "resolvedUrl : " + s);
                    n.this.a(this.a, s);
                }
            }

            try {
                String s = webResourceRequest0.getUrl().toString();
                b.c(Thread.currentThread(), "shouldOverrideUrlLoading : " + s);
                if(e.this.m && e.this.b) {
                    new u0(s, new a(this, webView0, s)).start();
                    return true;
                }
                b.c(Thread.currentThread(), "urlLoading : " + s);
                return this.a(webView0, s);
            }
            catch(Exception exception0) {
            }
            b.a(Thread.currentThread(), exception0);
            return false;
        }

        @Override  // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView0, String s) {
            class com.igaworks.ssp.e.n.b implements com.igaworks.ssp.u0.b {
                final WebView a;
                final String b;
                final n c;

                com.igaworks.ssp.e.n.b(WebView webView0, String s) {
                    this.a = webView0;
                    this.b = s;
                    super();
                }

                @Override  // com.igaworks.ssp.u0$b
                public void a() {
                    n.this.a(this.a, this.b);
                }

                @Override  // com.igaworks.ssp.u0$b
                public void onSuccess(String s) {
                    n.this.a(this.a, s);
                }
            }

            try {
                b.c(Thread.currentThread(), "shouldOverrideUrlLoading : " + s);
                if(e.this.m && e.this.b) {
                    new u0(s, new com.igaworks.ssp.e.n.b(this, webView0, s)).start();
                    return true;
                }
                return this.a(webView0, s);
            }
            catch(Exception exception0) {
            }
            b.a(Thread.currentThread(), exception0);
            return false;
        }
    }

    public interface o {
        void a();

        void b();

        void onSuccess();
    }

    private long a;
    private boolean b;
    private AdSize c;
    private o d;
    private NonLeakingWebView e;
    private boolean f;
    private g g;
    private Context h;
    private int i;
    private int j;
    private boolean k;
    private boolean l;
    private boolean m;
    private ArrayList n;
    private int o;
    private RelativeLayout p;
    private GradientDrawable q;
    private GradientDrawable r;
    private GradientDrawable s;
    private GradientDrawable t;
    private GradientDrawable u;
    ViewTreeObserver.OnGlobalLayoutListener v;
    ViewTreeObserver.OnScrollChangedListener w;
    private View.OnTouchListener x;
    private WebViewClient y;

    public e(Context context0, AdSize adSize0, boolean z) {
        super(context0);
        this.a = 0L;
        this.b = false;
        this.i = 0;
        this.j = 0;
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = new ArrayList();
        this.o = 0;
        this.v = new k(this);
        this.w = new l(this);
        this.x = new m(this);
        this.y = new n(this);
        this.c = adSize0;
        this.f = z;
        this.c(context0);
    }

    private void a() {
        class d implements com.igaworks.ssp.W.b {
            final e a;

            @Override  // com.igaworks.ssp.W$b
            public void a() {
                if(e.this.d != null) {
                    e.this.d.a();
                }
            }
        }

        W.a(new d(this));
    }

    private void a(int v, boolean z) {
        class com.igaworks.ssp.e.a implements Runnable {
            final boolean a;
            final e b;

            com.igaworks.ssp.e.a(boolean z) {
                this.a = z;
                super();
            }

            @Override
            public void run() {
                int v;
                try {
                    if(!this.a && e.this.e.getContentHeight() == 0) {
                        e.p(e.this);
                        if(e.this.j > 2) {
                            e.this.a(100, true);
                        }
                        else {
                            e.this.a(100, false);
                        }
                        goto label_6;
                    }
                    goto label_11;
                }
                catch(Exception exception0) {
                    goto label_29;
                }
                catch(Throwable throwable0) {
                    goto label_35;
                }
            label_6:
                if(e.this.e != null) {
                    e.this.e.setVisibility(0);
                }
                if(!e.this.k) {
                    e.this.d();
                }
                return;
                try {
                label_11:
                    Bitmap bitmap0 = e.this.e.getDrawingCache(false);
                    if(bitmap0 == null) {
                        goto label_40;
                    }
                    else {
                        v = bitmap0.getPixel(1, 1);
                        if(!this.a && e.this.i == v) {
                            e.this.a(150, true);
                            if(e.this.e != null) {
                                goto label_17;
                            }
                            goto label_18;
                        }
                        goto label_21;
                    }
                    return;
                }
                catch(Exception exception0) {
                    goto label_29;
                }
                catch(Throwable throwable0) {
                    goto label_35;
                }
            label_17:
                e.this.e.setVisibility(0);
            label_18:
                if(!e.this.k) {
                    e.this.d();
                }
                return;
                try {
                    try {
                    label_21:
                        e.this.setBackgroundColor(v);
                        e.this.e.setDrawingCacheEnabled(false);
                        e.this.e.destroyDrawingCache();
                        e.this.i = v;
                        goto label_40;
                    }
                    catch(Exception exception0) {
                    }
                label_29:
                    b.a(Thread.currentThread(), exception0);
                    if(e.this.e != null) {
                        goto label_31;
                    }
                    goto label_32;
                }
                catch(Throwable throwable0) {
                    goto label_35;
                }
            label_31:
                e.this.e.setVisibility(0);
            label_32:
                if(!e.this.k) {
                    e.this.d();
                    return;
                label_35:
                    if(e.this.e != null) {
                        e.this.e.setVisibility(0);
                    }
                    if(!e.this.k) {
                        e.this.d();
                    }
                    throw throwable0;
                label_40:
                    if(e.this.e != null) {
                        e.this.e.setVisibility(0);
                    }
                    if(!e.this.k) {
                        e.this.d();
                    }
                }
            }
        }

        this.e.postDelayed(new com.igaworks.ssp.e.a(this, z), ((long)v));
    }

    private void a(Context context0) {
        try {
            this.k = true;
            for(int v = 0; v < this.g.j().size(); ++v) {
                String s = (String)this.g.j().get(v);
                if(s0.a(s)) {
                    b.c(Thread.currentThread(), String.format("<Impression in banner url : %s>", s));
                    E.g().d().a(context0, com.igaworks.ssp.t.e.i, s);
                }
            }
        }
        catch(Exception unused_ex) {
        }
    }

    private void a(g g0) {
        try {
            this.a();
            for(int v = 0; v < g0.b().size(); ++v) {
                String s = (String)g0.b().get(v);
                if(s0.a(s)) {
                    b.c(Thread.currentThread(), String.format("Click Report URL Called in banner : %s ", s));
                    E.g().d().a(this.h, com.igaworks.ssp.t.e.j, s);
                }
            }
        }
        catch(Exception unused_ex) {
        }
    }

    public void a(Context context0, g g0, boolean z) {
        int v1;
        int v;
        this.g = g0;
        this.h = context0;
        this.l = z;
        if(g0.w() != null) {
            this.n = g0.w();
        }
        try {
            this.m = g0.I();
            b.c(Thread.currentThread(), "startAd checkViewability : " + z + ", isWebViewLanding : " + this.m);
            AdSize adSize0 = this.c;
            if(adSize0 == AdSize.BANNER_320x50) {
                v = (int)J.a(this.h, 320.0f);
                v1 = (int)J.a(this.h, 50.0f);
            }
            else if(adSize0 == AdSize.BANNER_320x100) {
                v = (int)J.a(this.h, 320.0f);
                v1 = (int)J.a(this.h, 100.0f);
            }
            else if(adSize0 != AdSize.BANNER_ADAPTIVE_SIZE) {
                v = (int)J.a(this.h, 300.0f);
                v1 = (int)J.a(this.h, 250.0f);
            }
            else {
                v = (int)J.a(this.h, 360.0f);
                v1 = -2;
                if(J.c(this.h) <= v) {
                    v = -1;
                }
            }
            if(this.g.H()) {
                if(this.e == null) {
                    this.e = new NonLeakingWebView(this.h.getApplicationContext());
                }
                this.e.setDrawingCacheEnabled(false);
                this.e.destroyDrawingCache();
                this.e.setBackgroundColor(0);
                RelativeLayout relativeLayout0 = this.p;
                if(relativeLayout0 != null) {
                    relativeLayout0.setVisibility(8);
                }
                this.e.setVisibility(4);
                LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(v, v1);
                linearLayout$LayoutParams0.gravity = 17;
                this.e.setLayoutParams(linearLayout$LayoutParams0);
                this.e.getSettings().setJavaScriptEnabled(true);
                this.e.setVerticalScrollBarEnabled(false);
                this.e.setVerticalScrollbarOverlay(false);
                this.e.setHorizontalScrollBarEnabled(false);
                this.e.setHorizontalScrollbarOverlay(false);
                this.e.setDrawingCacheEnabled(true);
                this.e.setOnTouchListener(this.x);
                this.e.setWebViewClient(this.y);
                this.e.getSettings().setDefaultTextEncodingName("UTF-8");
                this.e.getSettings().setAllowFileAccess(true);
                this.a = System.currentTimeMillis();
                b.c(Thread.currentThread(), "tempFileName : tempFile-ssp-1.html");
                K.a(this.h, "tempFile-ssp-1.html", this.g.y().getBytes(), com.igaworks.ssp.K.a.a);
                String s = this.h.getFilesDir().getPath() + "/" + "tempFile-ssp-1.html";
                String s1 = s.startsWith("/") ? "file://" + s : "file:///" + s;
                if(K.a(s)) {
                    b.c(Thread.currentThread(), "Banner web contents file load success");
                    this.e.loadUrl(s1);
                }
                else {
                    b.c(Thread.currentThread(), "Banner web contents loadDataWithBaseURL");
                    this.e.loadDataWithBaseURL(null, this.g.y(), "text/html", "UTF-8", null);
                }
                goto label_58;
            }
            else {
                goto label_62;
            }
            goto label_64;
        }
        catch(Exception exception0) {
            b.a(Thread.currentThread(), exception0);
            this.b();
            return;
        }
        try {
        label_58:
            String s2 = this.e.getSettings().getUserAgentString();
            if(s2 != null && s2.length() > 0) {
                q0.a().b(this.h, "igaw_ssp_sp", "webview_user_agent_key", s2);
            }
        }
        catch(Exception unused_ex) {
        }
        goto label_64;
        try {
        label_62:
            b.c(Thread.currentThread(), "Banner Native");
            this.e();
        label_64:
            if(g0.D()) {
                this.b(this.h);
                return;
            }
            return;
        }
        catch(Exception exception0) {
        }
        b.a(Thread.currentThread(), exception0);
        this.b();
    }

    public boolean a(View view0) {
        if(view0 == null) {
            return false;
        }
        else {
            try {
                if(view0.isShown() && view0.getWindowVisibility() != 8) {
                    Rect rect0 = new Rect();
                    view0.getWindowVisibleDisplayFrame(rect0);
                    Context context0 = view0.getContext();
                    int v = !(context0 instanceof Activity) || ((Activity)context0).getActionBar() == null ? 0 : ((Activity)context0).getActionBar().getHeight();
                    Rect rect1 = new Rect(rect0.left, rect0.top + v, rect0.right, rect0.bottom);
                    int[] arr_v = new int[2];
                    view0.getLocationInWindow(arr_v);
                    int v1 = arr_v[0];
                    int v2 = arr_v[1];
                    Rect rect2 = new Rect(v1, v2, view0.getWidth() + v1, view0.getHeight() + v2);
                    return view0.getWidth() == 0 || view0.getHeight() == 0 ? false : rect1.intersect(rect2);
                }
                return false;
            }
            catch(Exception unused_ex) {
            }
        }
        return true;
    }

    private void b() {
        class c implements com.igaworks.ssp.W.b {
            final e a;

            @Override  // com.igaworks.ssp.W$b
            public void a() {
                if(e.this.d != null) {
                    e.this.d.b();
                }
            }
        }

        W.a(new c(this));
    }

    private void b(Context context0) {
        try {
            for(int v = 0; v < this.g.x().size(); ++v) {
                String s = (String)this.g.x().get(v);
                if(s0.a(s)) {
                    b.c(Thread.currentThread(), String.format("<Viewability off Impression in banner url : %s>", s));
                    E.g().d().a(context0, com.igaworks.ssp.t.e.i, s);
                }
            }
        }
        catch(Exception unused_ex) {
        }
    }

    private void c() {
        class com.igaworks.ssp.e.b implements com.igaworks.ssp.W.b {
            final e a;

            @Override  // com.igaworks.ssp.W$b
            public void a() {
                if(e.this.d != null) {
                    e.this.d.onSuccess();
                }
            }
        }

        try {
            W.a(new com.igaworks.ssp.e.b(this));
            if(this.l) {
                this.k = false;
                try {
                    this.getViewTreeObserver().addOnGlobalLayoutListener(this.v);
                    this.getViewTreeObserver().addOnScrollChangedListener(this.w);
                }
                catch(Exception unused_ex) {
                    this.a(this.h);
                }
                return;
            }
            this.a(this.h);
        }
        catch(Exception unused_ex) {
        }
    }

    public void c(Context context0) {
        LinearLayout.LayoutParams linearLayout$LayoutParams0;
        try {
            b.a(Thread.currentThread(), "init AdPopcornSSPBannerView");
            this.h = context0;
            AdSize adSize0 = this.c;
            if(adSize0 == AdSize.BANNER_320x50) {
                linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, ((int)J.a(context0, 50.0f)));
            }
            else if(adSize0 == AdSize.BANNER_320x100) {
                linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, ((int)J.a(context0, 100.0f)));
            }
            else {
                linearLayout$LayoutParams0 = adSize0 == AdSize.BANNER_ADAPTIVE_SIZE ? new LinearLayout.LayoutParams(-1, -2) : new LinearLayout.LayoutParams(-1, ((int)J.a(context0, 250.0f)));
            }
            this.setLayoutParams(linearLayout$LayoutParams0);
            this.setBackgroundColor(0);
            this.setGravity(17);
            GradientDrawable.Orientation gradientDrawable$Orientation0 = GradientDrawable.Orientation.TOP_BOTTOM;
            GradientDrawable gradientDrawable0 = new GradientDrawable(gradientDrawable$Orientation0, new int[]{0xFF008BFA, 0xFF008BFA});
            this.q = gradientDrawable0;
            gradientDrawable0.setShape(0);
            this.q.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, ((float)J.a(context0, 2)), ((float)J.a(context0, 2)), ((float)J.a(context0, 2)), ((float)J.a(context0, 2))});
            this.q.setGradientType(0);
            GradientDrawable gradientDrawable1 = new GradientDrawable(gradientDrawable$Orientation0, new int[]{0xFF008BFA, 0xFF008BFA});
            this.r = gradientDrawable1;
            gradientDrawable1.setShape(0);
            this.r.setCornerRadius(((float)J.a(context0, 2)));
            this.r.setGradientType(0);
            GradientDrawable gradientDrawable2 = new GradientDrawable(gradientDrawable$Orientation0, new int[]{0xFF008BFA, 0xFF008BFA});
            this.s = gradientDrawable2;
            gradientDrawable2.setShape(0);
            this.s.setCornerRadius(((float)J.a(context0, 4)));
            this.s.setGradientType(0);
            GradientDrawable gradientDrawable3 = new GradientDrawable(gradientDrawable$Orientation0, new int[]{0, 0x7D000000});
            this.t = gradientDrawable3;
            gradientDrawable3.setShape(0);
            this.t.setGradientType(0);
            GradientDrawable gradientDrawable4 = new GradientDrawable(gradientDrawable$Orientation0, new int[]{0x7D000000, 0xFF000000});
            this.u = gradientDrawable4;
            gradientDrawable4.setShape(0);
            this.u.setGradientType(0);
            return;
        }
        catch(Exception exception0) {
        }
        b.a(Thread.currentThread(), exception0);
    }

    private void d() {
        try {
            if(this.a(this)) {
                b.c(Thread.currentThread(), "checkImpression isViewFullyVisible : " + true);
                this.a(this.h);
            }
        }
        catch(Exception unused_ex) {
            this.a(this.h);
        }
    }

    private void d(Context context0) {
        int v1;
        int v;
        try {
            AdSize adSize0 = this.c;
            if(adSize0 == AdSize.BANNER_320x50) {
                v = (int)J.a(context0, 320.0f);
                v1 = (int)J.a(context0, 50.0f);
            }
            else if(adSize0 == AdSize.BANNER_320x100) {
                v = (int)J.a(context0, 320.0f);
                v1 = (int)J.a(context0, 100.0f);
            }
            else if(adSize0 != AdSize.BANNER_ADAPTIVE_SIZE) {
                v = (int)J.a(context0, 300.0f);
                v1 = (int)J.a(context0, 250.0f);
            }
            else {
                v = (int)J.a(context0, 360.0f);
                v1 = -2;
                if(J.c(context0) <= v) {
                    v = -1;
                }
            }
            if(this.e != null) {
                LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(v, v1);
                linearLayout$LayoutParams0.topMargin = 0;
                linearLayout$LayoutParams0.gravity = 17;
                this.e.setLayoutParams(linearLayout$LayoutParams0);
            }
        }
        catch(Exception exception0) {
            b.a(Thread.currentThread(), exception0);
        }
    }

    private void e() {
        class f implements com.igaworks.ssp.n.d {
            final ImageView a;
            final e b;

            f(ImageView imageView0) {
                this.a = imageView0;
                super();
            }

            @Override  // com.igaworks.ssp.n$d
            public void a(Bitmap bitmap0) {
                if(bitmap0 != null) {
                    this.a.setImageBitmap(bitmap0);
                }
            }
        }


        class com.igaworks.ssp.e.g implements com.igaworks.ssp.n.d {
            final ImageView a;
            final e b;

            com.igaworks.ssp.e.g(ImageView imageView0) {
                this.a = imageView0;
                super();
            }

            @Override  // com.igaworks.ssp.n$d
            public void a(Bitmap bitmap0) {
                if(bitmap0 != null) {
                    this.a.setImageBitmap(bitmap0);
                }
            }
        }


        class h implements com.igaworks.ssp.n.d {
            final ImageView a;
            final e b;

            h(ImageView imageView0) {
                this.a = imageView0;
                super();
            }

            @Override  // com.igaworks.ssp.n$d
            public void a(Bitmap bitmap0) {
                if(bitmap0 != null) {
                    this.a.setImageBitmap(bitmap0);
                }
            }
        }


        class i implements View.OnClickListener {
            final e a;

            // 去混淆评级： 中等(70)
            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
            }
        }


        class j implements View.OnClickListener {
            final e a;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                try {
                    e.this.a(e.this.g);
                }
                catch(Exception exception0) {
                    b.a(Thread.currentThread(), exception0);
                }
            }
        }

        int v18;
        RelativeLayout.LayoutParams relativeLayout$LayoutParams6;
        int v15;
        int v14;
        RelativeLayout.LayoutParams relativeLayout$LayoutParams5;
        int v12;
        float f;
        int v10;
        int v9;
        this.o = this.g.u();
        int v = J.a(this.h, 100);
        int v1 = J.a(this.h, 52);
        int v2 = J.a(this.h, 30);
        int v3 = J.a(this.h, 5);
        int v4 = J.a(this.h, 10);
        int v5 = J.a(this.h, 320) - J.a(this.h, 0x40) - J.a(this.h, 35);
        int v6 = J.a(this.h, 320) - J.a(this.h, 0x40) - J.a(this.h, 35);
        int v7 = J.a(this.h, 300);
        int v8 = J.a(this.h, 0x20);
        switch(this.o) {
            case 7: {
                v5 = J.a(this.h, 320) - J.a(this.h, 14) - J.a(this.h, 0x80);
                v9 = J.a(this.h, 320) - J.a(this.h, 14);
                v10 = J.a(this.h, 0x80);
                v6 = v9 - v10;
                break;
            }
            case 8: {
                v2 = J.a(this.h, 58);
                v5 = J.a(this.h, 320) - J.a(this.h, 14) - J.a(this.h, 76);
                v9 = J.a(this.h, 320) - J.a(this.h, 14);
                v10 = J.a(this.h, 76);
                v6 = v9 - v10;
                break;
            }
            case 9: {
                v3 = J.a(this.h, 10);
                v4 = J.a(this.h, 20);
                v5 = J.a(this.h, 320) - J.a(this.h, 14) - J.a(this.h, 50);
                v9 = J.a(this.h, 320) - J.a(this.h, 14);
                v10 = J.a(this.h, 50);
                v6 = v9 - v10;
                break;
            }
            case 10: {
                v = J.a(this.h, 300);
                v1 = J.a(this.h, 0x9D);
                v2 = J.a(this.h, 38);
                v5 = J.a(this.h, 300) - J.a(this.h, 62) - J.a(this.h, 16);
                v6 = J.a(this.h, 300) - J.a(this.h, 62) - J.a(this.h, 16);
                break;
            }
            case 11: {
                v = J.a(this.h, 300);
                v1 = J.a(this.h, 0x9D);
                v5 = J.a(this.h, 300) - J.a(this.h, 16) - J.a(this.h, 0x79);
                v6 = J.a(this.h, 300) - J.a(this.h, 16) - J.a(this.h, 0x79);
                v7 = J.a(this.h, 89);
                v8 = J.a(this.h, 34);
                break;
            }
            case 21: {
                v2 = J.a(this.h, 100);
                v5 = J.a(this.h, 360) - J.a(this.h, 16) - J.a(this.h, 0x80);
                v6 = J.a(this.h, 360) - J.a(this.h, 16) - J.a(this.h, 0x80);
                v8 = J.a(this.h, 44);
                break;
            }
            case 22: {
                v = J.a(this.h, 0x91);
                v1 = J.a(this.h, 76);
                v5 = J.a(this.h, 360) - J.a(this.h, 16) - J.a(this.h, 0xAD);
                v6 = J.a(this.h, 360) - J.a(this.h, 16) - J.a(this.h, 0xAD);
                v8 = J.a(this.h, 44);
                break;
            }
            case 23: {
                v = J.a(this.h, 360);
                v1 = J.a(this.h, 0xB9);
                v5 = J.a(this.h, 360) - J.a(this.h, 56) - J.a(this.h, 93);
                v6 = J.a(this.h, 360) - J.a(this.h, 56) - J.a(this.h, 93);
                v7 = J.a(this.h, 69);
                v8 = J.a(this.h, 0x20);
                break;
            }
            case 24: {
                v = J.a(this.h, 360);
                v1 = J.a(this.h, 0xB9);
                v5 = J.a(this.h, 360) - J.a(this.h, 56) - J.a(this.h, 93);
                v6 = J.a(this.h, 360) - J.a(this.h, 56) - J.a(this.h, 93);
                v7 = J.a(this.h, 69);
                v8 = J.a(this.h, 0x20);
            }
        }
        RelativeLayout relativeLayout0 = this.p;
        if(relativeLayout0 != null) {
            relativeLayout0.removeAllViews();
            if(this.p.getParent() != null) {
                ((ViewGroup)this.p.getParent()).removeView(this.p);
            }
        }
        AdSize adSize0 = this.c;
        int v11 = -1;
        if(adSize0 == AdSize.BANNER_320x50) {
            f = J.a(this.h, 320.0f);
            goto label_77;
        }
        else if(adSize0 == AdSize.BANNER_320x100) {
            f = J.a(this.h, 320.0f);
        label_77:
            v12 = (int)f;
        }
        else if(adSize0 == AdSize.BANNER_ADAPTIVE_SIZE) {
            v12 = (int)J.a(this.h, 360.0f);
            v11 = (int)J.a(this.h, 185.0f);
            if(J.c(this.h) <= v12) {
                v12 = -1;
            }
        }
        else {
            v12 = (int)J.a(this.h, 300.0f);
        }
        this.p = new RelativeLayout(this.h);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(v12, v11);
        this.p.setBackgroundColor(Color.parseColor("#F8F8F8"));
        this.p.setLayoutParams(relativeLayout$LayoutParams0);
        switch(this.o) {
            case 7: 
            case 10: 
            case 11: 
            case 22: 
            case 23: 
            case 24: {
                ImageView imageView0 = new ImageView(this.h);
                RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(v, v1);
                int v13 = this.o;
                if(v13 == 7) {
                    relativeLayout$LayoutParams1.rightMargin = J.a(this.h, 14);
                    relativeLayout$LayoutParams1.addRule(11);
                    relativeLayout$LayoutParams1.addRule(15);
                }
                else if(v13 == 10 || v13 == 11) {
                    relativeLayout$LayoutParams1.addRule(10);
                }
                else {
                    switch(v13) {
                        case 22: {
                            relativeLayout$LayoutParams1.topMargin = J.a(this.h, 0x20);
                            relativeLayout$LayoutParams1.rightMargin = J.a(this.h, 16);
                            relativeLayout$LayoutParams1.leftMargin = J.a(this.h, 12);
                            relativeLayout$LayoutParams1.addRule(10);
                            relativeLayout$LayoutParams1.addRule(11);
                            break;
                        }
                        case 23: 
                        case 24: {
                            relativeLayout$LayoutParams1.addRule(10);
                        }
                    }
                }
                imageView0.setLayoutParams(relativeLayout$LayoutParams1);
                imageView0.setScaleType(ImageView.ScaleType.FIT_XY);
                this.p.addView(imageView0);
            }
        }
        if(this.o == 23 || this.o == 24) {
            ImageView imageView1 = new ImageView(this.h);
            if(this.o == 23) {
                RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(v, v1);
                relativeLayout$LayoutParams2.addRule(12);
                imageView1.setLayoutParams(relativeLayout$LayoutParams2);
                imageView1.setBackgroundDrawable(this.t);
            }
            else {
                RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(v, J.a(this.h, 0x40));
                relativeLayout$LayoutParams3.addRule(12);
                imageView1.setLayoutParams(relativeLayout$LayoutParams3);
                imageView1.setBackgroundDrawable(this.u);
            }
            this.p.addView(imageView1);
        }
        switch(this.o) {
            case 6: 
            case 8: 
            case 10: 
            case 21: 
            case 23: 
            case 24: {
                ImageView imageView2 = new ImageView(this.h);
                RelativeLayout.LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout.LayoutParams(v2, v2);
                switch(this.o) {
                    case 6: {
                        relativeLayout$LayoutParams4.leftMargin = J.a(this.h, 13);
                        relativeLayout$LayoutParams4.rightMargin = J.a(this.h, 22);
                        relativeLayout$LayoutParams4.topMargin = J.a(this.h, 10);
                        relativeLayout$LayoutParams4.addRule(9);
                        relativeLayout$LayoutParams4.addRule(10);
                        break;
                    }
                    case 8: {
                        relativeLayout$LayoutParams4.leftMargin = J.a(this.h, 14);
                        relativeLayout$LayoutParams4.rightMargin = J.a(this.h, 14);
                        relativeLayout$LayoutParams4.topMargin = J.a(this.h, 21);
                        relativeLayout$LayoutParams4.addRule(11);
                        relativeLayout$LayoutParams4.addRule(10);
                        break;
                    }
                    case 10: {
                        relativeLayout$LayoutParams4.leftMargin = J.a(this.h, 16);
                        relativeLayout$LayoutParams4.topMargin = J.a(this.h, 0xA8);
                        relativeLayout$LayoutParams4.addRule(9);
                        relativeLayout$LayoutParams4.addRule(10);
                        break;
                    }
                    case 21: {
                        relativeLayout$LayoutParams4.leftMargin = J.a(this.h, 16);
                        relativeLayout$LayoutParams4.rightMargin = J.a(this.h, 16);
                        relativeLayout$LayoutParams4.topMargin = J.a(this.h, 20);
                        relativeLayout$LayoutParams4.addRule(11);
                        relativeLayout$LayoutParams4.addRule(10);
                        break;
                    }
                    case 23: 
                    case 24: {
                        relativeLayout$LayoutParams4.leftMargin = J.a(this.h, 16);
                        relativeLayout$LayoutParams4.rightMargin = J.a(this.h, 8);
                        relativeLayout$LayoutParams4.bottomMargin = J.a(this.h, 16);
                        relativeLayout$LayoutParams4.addRule(9);
                        relativeLayout$LayoutParams4.addRule(12);
                    }
                }
                imageView2.setLayoutParams(relativeLayout$LayoutParams4);
                imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
                this.p.addView(imageView2);
            }
        }
        TextView textView0 = new TextView(this.h);
        textView0.setId(10);
        switch(this.o) {
            case 6: {
                relativeLayout$LayoutParams5 = new RelativeLayout.LayoutParams(v5, J.a(this.h, 20));
                relativeLayout$LayoutParams5.topMargin = J.a(this.h, 15);
                relativeLayout$LayoutParams5.leftMargin = J.a(this.h, 0x40);
                relativeLayout$LayoutParams5.rightMargin = J.a(this.h, 35);
                v14 = 13;
                break;
            }
            case 7: 
            case 8: 
            case 9: {
                relativeLayout$LayoutParams5 = new RelativeLayout.LayoutParams(v5, J.a(this.h, 21));
                relativeLayout$LayoutParams5.topMargin = J.a(this.h, 30);
                relativeLayout$LayoutParams5.leftMargin = J.a(this.h, 14);
                relativeLayout$LayoutParams5.rightMargin = J.a(this.h, 14);
                v14 = 14;
                break;
            }
            case 10: {
                relativeLayout$LayoutParams5 = new RelativeLayout.LayoutParams(v5, J.a(this.h, 18));
                relativeLayout$LayoutParams5.topMargin = J.a(this.h, 0xA9);
                relativeLayout$LayoutParams5.leftMargin = J.a(this.h, 62);
                v14 = 12;
                break;
            }
            case 11: {
                relativeLayout$LayoutParams5 = new RelativeLayout.LayoutParams(v5, J.a(this.h, 21));
                relativeLayout$LayoutParams5.topMargin = J.a(this.h, 0xB8);
                relativeLayout$LayoutParams5.leftMargin = J.a(this.h, 16);
                v14 = 14;
                break;
            }
            case 21: 
            case 22: {
                relativeLayout$LayoutParams5 = new RelativeLayout.LayoutParams(v5, J.a(this.h, 24));
                relativeLayout$LayoutParams5.topMargin = J.a(this.h, 0x2F);
                relativeLayout$LayoutParams5.leftMargin = J.a(this.h, 16);
                v14 = 16;
                break;
            }
            case 23: 
            case 24: {
                relativeLayout$LayoutParams5 = new RelativeLayout.LayoutParams(v5, J.a(this.h, 16));
                relativeLayout$LayoutParams5.topMargin = J.a(this.h, 0x89);
                relativeLayout$LayoutParams5.leftMargin = J.a(this.h, 56);
                v14 = 12;
                break;
            }
            default: {
                relativeLayout$LayoutParams5 = null;
                v14 = 13;
            }
        }
        relativeLayout$LayoutParams5.addRule(10);
        relativeLayout$LayoutParams5.addRule(9);
        textView0.setSingleLine();
        textView0.setGravity(16);
        textView0.setLayoutParams(relativeLayout$LayoutParams5);
        if(this.o == 23 || this.o == 24) {
            s0.a(textView0, "", v14, Color.parseColor("#ffffff"), null, 0, 1, TextUtils.TruncateAt.END, true);
        }
        else {
            s0.a(textView0, "", v14, Color.parseColor("#000000"), null, 0, 1, TextUtils.TruncateAt.END, true);
        }
        this.p.addView(textView0);
        switch(this.o) {
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 21: 
            case 22: 
            case 23: 
            case 24: {
                TextView textView1 = new TextView(this.h);
                switch(this.o) {
                    case 7: 
                    case 8: 
                    case 9: {
                        relativeLayout$LayoutParams6 = new RelativeLayout.LayoutParams(v6, J.a(this.h, 18));
                        relativeLayout$LayoutParams6.topMargin = J.a(this.h, 52);
                        relativeLayout$LayoutParams6.leftMargin = J.a(this.h, 14);
                        relativeLayout$LayoutParams6.rightMargin = J.a(this.h, 14);
                        v15 = 12;
                        break;
                    }
                    case 10: {
                        relativeLayout$LayoutParams6 = new RelativeLayout.LayoutParams(v6, J.a(this.h, 18));
                        relativeLayout$LayoutParams6.topMargin = J.a(this.h, 0xBB);
                        relativeLayout$LayoutParams6.leftMargin = J.a(this.h, 62);
                        v15 = 12;
                        break;
                    }
                    case 11: {
                        relativeLayout$LayoutParams6 = new RelativeLayout.LayoutParams(v6, J.a(this.h, 18));
                        relativeLayout$LayoutParams6.topMargin = J.a(this.h, 206);
                        relativeLayout$LayoutParams6.leftMargin = J.a(this.h, 16);
                        v15 = 12;
                        break;
                    }
                    case 21: 
                    case 22: {
                        relativeLayout$LayoutParams6 = new RelativeLayout.LayoutParams(v6, J.a(this.h, 24));
                        relativeLayout$LayoutParams6.topMargin = J.a(this.h, 71);
                        relativeLayout$LayoutParams6.leftMargin = J.a(this.h, 16);
                        v15 = 14;
                        break;
                    }
                    case 23: 
                    case 24: {
                        relativeLayout$LayoutParams6 = new RelativeLayout.LayoutParams(v6, J.a(this.h, 16));
                        relativeLayout$LayoutParams6.topMargin = J.a(this.h, 0x99);
                        relativeLayout$LayoutParams6.leftMargin = J.a(this.h, 56);
                        v15 = 12;
                        break;
                    }
                    default: {
                        relativeLayout$LayoutParams6 = null;
                        v15 = 12;
                        break;
                    }
                }
                relativeLayout$LayoutParams6.addRule(9);
                textView1.setLayoutParams(relativeLayout$LayoutParams6);
                textView1.setSingleLine();
                textView1.setGravity(16);
                if(this.o == 23 || this.o == 24) {
                    s0.a(textView1, "", v15, Color.parseColor("#ffffff"), null, 0, 1, TextUtils.TruncateAt.END, false);
                }
                else {
                    s0.a(textView1, "", v15, Color.parseColor("#363636"), null, 0, 1, TextUtils.TruncateAt.END, false);
                }
                this.p.addView(textView1);
            }
        }
        if(this.o == 6 || this.o == 9) {
            ImageView imageView3 = new ImageView(this.h);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams7 = new RelativeLayout.LayoutParams(v3, v4);
            int v16 = this.o;
            if(v16 == 6) {
                relativeLayout$LayoutParams7.rightMargin = J.a(this.h, 15);
            }
            else if(v16 == 9) {
                relativeLayout$LayoutParams7.rightMargin = J.a(this.h, 20);
            }
            relativeLayout$LayoutParams7.addRule(11);
            relativeLayout$LayoutParams7.addRule(15);
            imageView3.setLayoutParams(relativeLayout$LayoutParams7);
            imageView3.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView3.setImageResource(mipmap.interstitial_arrow);
            this.p.addView(imageView3);
        }
        switch(this.o) {
            case 10: 
            case 11: 
            case 21: 
            case 22: 
            case 23: 
            case 24: {
                TextView textView2 = new TextView(this.h);
                textView2.setId(11);
                RelativeLayout.LayoutParams relativeLayout$LayoutParams8 = new RelativeLayout.LayoutParams(v7, v8);
                int v17 = this.o;
                if(v17 == 10) {
                    relativeLayout$LayoutParams8.addRule(10);
                    relativeLayout$LayoutParams8.addRule(9);
                    relativeLayout$LayoutParams8.topMargin = J.a(this.h, 0xDA);
                    textView2.setBackgroundDrawable(this.q);
                    goto label_284;
                }
                else {
                    switch(v17) {
                        case 11: {
                            relativeLayout$LayoutParams8.addRule(10);
                            relativeLayout$LayoutParams8.addRule(9);
                            relativeLayout$LayoutParams8.topMargin = J.a(this.h, 0xBB);
                            relativeLayout$LayoutParams8.leftMargin = J.a(this.h, 0xC3);
                            textView2.setBackgroundDrawable(this.r);
                            v18 = 12;
                            break;
                        }
                        case 21: 
                        case 22: {
                            relativeLayout$LayoutParams8.addRule(10);
                            relativeLayout$LayoutParams8.addRule(9);
                            relativeLayout$LayoutParams8.width = -1;
                            relativeLayout$LayoutParams8.topMargin = J.a(this.h, 0x8D);
                            textView2.setBackgroundColor(Color.parseColor("#008BFA"));
                            v18 = 14;
                            break;
                        }
                        default: {
                            if(v17 == 23 || v17 == 24) {
                                relativeLayout$LayoutParams8.addRule(10);
                                relativeLayout$LayoutParams8.addRule(11);
                                relativeLayout$LayoutParams8.topMargin = J.a(this.h, 0x89);
                                relativeLayout$LayoutParams8.rightMargin = J.a(this.h, 16);
                                textView2.setBackgroundDrawable(this.s);
                            }
                        label_284:
                            v18 = 12;
                        }
                    }
                }
                textView2.setSingleLine();
                textView2.setGravity(17);
                textView2.setPadding(J.a(this.h, 2), 0, J.a(this.h, 2), 0);
                textView2.setLayoutParams(relativeLayout$LayoutParams8);
                s0.a(textView2, "", v18, Color.parseColor("#ffffff"), null, 0, 1, TextUtils.TruncateAt.END, true);
                this.p.addView(textView2);
            }
        }
        this.p.setOnClickListener(new j(this));
        this.p.setVisibility(0);
        if(this.p.getParent() == null) {
            this.addView(this.p);
        }
        NonLeakingWebView nonLeakingWebView0 = this.e;
        if(nonLeakingWebView0 != null) {
            nonLeakingWebView0.setVisibility(8);
        }
        this.c();
    }

    public void f() {
        class com.igaworks.ssp.e.e implements Runnable {
            final e a;

            @Override
            public void run() {
                if(e.this.e != null) {
                    try {
                        e.this.e.loadUrl("about:blank");
                        e.this.e.clearDisappearingChildren();
                        e.this.e.removeAllViews();
                        if(e.this.e.getParent() != null) {
                            ((ViewGroup)e.this.e.getParent()).removeView(e.this.e);
                        }
                    }
                    catch(Exception exception0) {
                        b.a(Thread.currentThread(), exception0);
                    }
                }
            }
        }

        try {
            this.d = null;
            new Handler(Looper.getMainLooper()).post(new com.igaworks.ssp.e.e(this));
            if(this.v != null) {
                this.getViewTreeObserver().removeOnGlobalLayoutListener(this.v);
            }
            if(this.w != null) {
                this.getViewTreeObserver().removeOnScrollChangedListener(this.w);
            }
        }
        catch(Exception exception0) {
            b.a(Thread.currentThread(), exception0);
        }
    }

    @Override  // android.view.View
    protected void onVisibilityChanged(View view0, int v) {
        super.onVisibilityChanged(view0, v);
        try {
            if(!this.k) {
                this.d();
            }
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        try {
            if(!this.k) {
                this.d();
            }
        }
        catch(Exception unused_ex) {
        }
    }

    static int p(e e0) {
        int v = e0.j;
        e0.j = v + 1;
        return v;
    }

    public void setInnerAdPopcornSSPBannerViewListener(o e$o0) {
        this.d = e$o0;
    }
}

