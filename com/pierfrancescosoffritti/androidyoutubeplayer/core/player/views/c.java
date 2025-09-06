package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views;

import J2.o.b;
import J2.o;
import K2.d;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.pierfrancescosoffritti.androidyoutubeplayer.R.raw;
import java.io.InputStream;
import java.util.Collection;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import y4.l;
import y4.m;

public final class c extends WebView implements b {
    @l
    private final K2.b a;
    @l
    private final f b;
    private Function1 c;
    private boolean d;

    public c(@l Context context0) {
        L.p(context0, "context");
        this(context0, a.a, null, 0, 12, null);
    }

    public c(@l Context context0, @l K2.b b0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        L.p(b0, "listener");
        super(context0, attributeSet0, v);
        this.a = b0;
        this.b = new f(this);
    }

    public c(Context context0, K2.b b0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 4) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 8) != 0) {
            v = 0;
        }
        this(context0, b0, attributeSet0, v);
    }

    @Override  // J2.o$b
    public void a() {
        Function1 function10 = this.c;
        if(function10 == null) {
            L.S("youTubePlayerInitListener");
            function10 = null;
        }
        function10.invoke(this.b);
    }

    public final boolean c(@l d d0) {
        L.p(d0, "listener");
        return this.b.b().add(d0);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private final void d(L2.a a0) {
        public static final class com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.c.a extends WebChromeClient {
            final c a;

            com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.c.a(c c0) {
                this.a = c0;
                super();
            }

            @Override  // android.webkit.WebChromeClient
            @m
            public Bitmap getDefaultVideoPoster() {
                Bitmap bitmap0 = super.getDefaultVideoPoster();
                return bitmap0 == null ? Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565) : bitmap0;
            }

            @Override  // android.webkit.WebChromeClient
            public void onHideCustomView() {
                super.onHideCustomView();
                this.a.a.a();
            }

            @Override  // android.webkit.WebChromeClient
            public void onShowCustomView(@l View view0, @l WebChromeClient.CustomViewCallback webChromeClient$CustomViewCallback0) {
                static final class com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.c.a.a extends N implements A3.a {
                    final WebChromeClient.CustomViewCallback e;

                    com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.c.a.a(WebChromeClient.CustomViewCallback webChromeClient$CustomViewCallback0) {
                        this.e = webChromeClient$CustomViewCallback0;
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        this.invoke();
                        return S0.a;
                    }

                    public final void invoke() {
                        this.e.onCustomViewHidden();
                    }
                }

                L.p(view0, "view");
                L.p(webChromeClient$CustomViewCallback0, "callback");
                super.onShowCustomView(view0, webChromeClient$CustomViewCallback0);
                com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.c.a.a c$a$a0 = new com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.c.a.a(webChromeClient$CustomViewCallback0);
                this.a.a.b(view0, c$a$a0);
            }
        }

        WebSettings webSettings0 = this.getSettings();
        webSettings0.setJavaScriptEnabled(true);
        webSettings0.setMediaPlaybackRequiresUserGesture(false);
        webSettings0.setCacheMode(-1);
        this.addJavascriptInterface(new o(this), "YouTubePlayerBridge");
        InputStream inputStream0 = this.getResources().openRawResource(raw.ayp_youtube_player);
        L.o(inputStream0, "resources.openRawResourc…R.raw.ayp_youtube_player)");
        String s = v.l2(com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.d.a(inputStream0), "<<injectedPlayerVars>>", a0.toString(), false, 4, null);
        this.loadDataWithBaseURL(a0.b(), s, "text/html", "utf-8", null);
        this.setWebChromeClient(new com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.c.a(this));
    }

    @Override  // android.webkit.WebView
    public void destroy() {
        this.b.u();
        super.destroy();
    }

    public final void e(@l Function1 function10, @m L2.a a0) {
        L.p(function10, "initListener");
        this.c = function10;
        if(a0 == null) {
            a0 = L2.a.b.a();
        }
        this.d(a0);
    }

    public final boolean f() {
        return this.d;
    }

    public final boolean g(@l d d0) {
        L.p(d0, "listener");
        return this.b.b().remove(d0);
    }

    @Override  // J2.o$b
    @l
    public J2.c getInstance() {
        return this.b;
    }

    @Override  // J2.o$b
    @l
    public Collection getListeners() {
        return u.a6(this.b.b());
    }

    @l
    public final J2.c getYoutubePlayer$core_release() {
        return this.b;
    }

    @Override  // android.webkit.WebView
    protected void onWindowVisibilityChanged(int v) {
        if(this.d && (v == 4 || v == 8)) {
            return;
        }
        super.onWindowVisibilityChanged(v);
    }

    public final void setBackgroundPlaybackEnabled$core_release(boolean z) {
        this.d = z;
    }
}

