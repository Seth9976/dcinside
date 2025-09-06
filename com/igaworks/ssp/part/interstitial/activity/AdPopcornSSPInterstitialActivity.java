package com.igaworks.ssp.part.interstitial.activity;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils.TruncateAt;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.E0;
import androidx.core.view.F0;
import com.igaworks.ssp.E;
import com.igaworks.ssp.J;
import com.igaworks.ssp.K;
import com.igaworks.ssp.Q;
import com.igaworks.ssp.S;
import com.igaworks.ssp.U;
import com.igaworks.ssp.W;
import com.igaworks.ssp.b;
import com.igaworks.ssp.h0;
import com.igaworks.ssp.j;
import com.igaworks.ssp.n.d;
import com.igaworks.ssp.part.NonLeakingWebView;
import com.igaworks.ssp.q0;
import com.igaworks.ssp.r;
import com.igaworks.ssp.s0;
import com.igaworks.ssp.t.e;
import com.igaworks.ssp.u0;
import com.igaworks.ssp.x;
import com.igaworks.ssp.z;
import java.lang.ref.WeakReference;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;

public class AdPopcornSSPInterstitialActivity extends Activity {
    class g extends WebViewClient {
        final AdPopcornSSPInterstitialActivity a;

        private boolean a(WebView webView0, String s) {
            Intent intent2;
            if(AdPopcornSSPInterstitialActivity.this.u != null) {
                for(Object object0: AdPopcornSSPInterstitialActivity.this.u) {
                    if(s != null && s.startsWith(((String)object0))) {
                        b.c(Thread.currentThread(), "url in urlSchemeList");
                        AdPopcornSSPInterstitialActivity.this.d();
                        Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse(s));
                        intent0.addFlags(0x10000000);
                        AdPopcornSSPInterstitialActivity.this.startActivity(intent0);
                        return true;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            if(s != null && (s.contains("http://") || s.contains("https://") || s.startsWith("market://"))) {
                AdPopcornSSPInterstitialActivity.this.d();
                Intent intent1 = new Intent("android.intent.action.VIEW", Uri.parse(s));
                intent1.addFlags(0x10000000);
                AdPopcornSSPInterstitialActivity.this.startActivity(intent1);
                return true;
            }
            if(s != null && s.toLowerCase().startsWith("intent:")) {
                try {
                    intent2 = null;
                    b.c(Thread.currentThread(), "click intent url : " + s);
                    AdPopcornSSPInterstitialActivity.this.d();
                    intent2 = Intent.parseUri(s, 1);
                    intent2.addFlags(0x10000000);
                    AdPopcornSSPInterstitialActivity.this.startActivity(intent2);
                    return true;
                }
                catch(ActivityNotFoundException | URISyntaxException unused_ex) {
                    return this.a(webView0, intent2);
                }
            }
            try {
                if(AdPopcornSSPInterstitialActivity.this.u != null && AdPopcornSSPInterstitialActivity.this.u.contains("ap_direct_deeplink")) {
                    b.c(Thread.currentThread(), "click pass direct_deeplink : " + s);
                    AdPopcornSSPInterstitialActivity.this.d();
                    Intent intent3 = new Intent("android.intent.action.VIEW", Uri.parse(s));
                    intent3.addFlags(0x10000000);
                    AdPopcornSSPInterstitialActivity.this.startActivity(intent3);
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
                AdPopcornSSPInterstitialActivity.this.startActivity(intent1);
                return true;
            }
            return false;
        }

        @Override  // android.webkit.WebViewClient
        public void onPageFinished(WebView webView0, String s) {
            super.onPageFinished(webView0, s);
            AdPopcornSSPInterstitialActivity.this.x = 0;
            try {
                if(s == null || !s.equals("about:blank")) {
                    b.c(Thread.currentThread(), "interstitial web contents onPageFinished");
                    Context context0 = (Context)AdPopcornSSPInterstitialActivity.this.d.get();
                    AdPopcornSSPInterstitialActivity.this.b(context0);
                    if(AdPopcornSSPInterstitialActivity.this.w) {
                        webView0.setDrawingCacheQuality(0x80000);
                        webView0.setDrawingCacheEnabled(true);
                        webView0.buildDrawingCache();
                        AdPopcornSSPInterstitialActivity.this.a(200, false);
                        return;
                    }
                }
                AdPopcornSSPInterstitialActivity.this.y.setVisibility(0);
                return;
            }
            catch(Exception exception0) {
            }
            b.a(Thread.currentThread(), exception0);
        }

        @Override  // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView0, WebResourceRequest webResourceRequest0) {
            class a implements com.igaworks.ssp.u0.b {
                final WebView a;
                final String b;
                final g c;

                a(WebView webView0, String s) {
                    this.a = webView0;
                    this.b = s;
                    super();
                }

                @Override  // com.igaworks.ssp.u0$b
                public void a() {
                    g.this.a(this.a, this.b);
                }

                @Override  // com.igaworks.ssp.u0$b
                public void onSuccess(String s) {
                    b.c(Thread.currentThread(), "resolvedUrl : " + s);
                    g.this.a(this.a, s);
                }
            }

            try {
                String s = webResourceRequest0.getUrl().toString();
                b.c(Thread.currentThread(), "shouldOverrideUrlLoading : " + s);
                if(AdPopcornSSPInterstitialActivity.this.B) {
                    new u0(s, new a(this, webView0, s)).start();
                    return true;
                }
                return this.a(webView0, s);
            }
            catch(Exception unused_ex) {
                return false;
            }
        }

        @Override  // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView0, String s) {
            class com.igaworks.ssp.part.interstitial.activity.AdPopcornSSPInterstitialActivity.g.b implements com.igaworks.ssp.u0.b {
                final WebView a;
                final String b;
                final g c;

                com.igaworks.ssp.part.interstitial.activity.AdPopcornSSPInterstitialActivity.g.b(WebView webView0, String s) {
                    this.a = webView0;
                    this.b = s;
                    super();
                }

                @Override  // com.igaworks.ssp.u0$b
                public void a() {
                    g.this.a(this.a, this.b);
                }

                @Override  // com.igaworks.ssp.u0$b
                public void onSuccess(String s) {
                    b.c(Thread.currentThread(), "resolvedUrl : " + s);
                    g.this.a(this.a, s);
                }
            }

            try {
                b.c(Thread.currentThread(), "shouldOverrideUrlLoading : " + s);
                if(AdPopcornSSPInterstitialActivity.this.B) {
                    new u0(s, new com.igaworks.ssp.part.interstitial.activity.AdPopcornSSPInterstitialActivity.g.b(this, webView0, s)).start();
                    return true;
                }
                return this.a(webView0, s);
            }
            catch(Exception unused_ex) {
                return false;
            }
        }
    }

    private int A;
    private boolean B;
    private int C;
    private RelativeLayout D;
    private GradientDrawable E;
    private GradientDrawable F;
    private WebViewClient G;
    private Q a;
    private U b;
    private U c;
    private WeakReference d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private x i;
    private HashMap j;
    private boolean k;
    private int l;
    private boolean m;
    private int n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private int s;
    private ImageView t;
    private ArrayList u;
    private int v;
    private boolean w;
    private int x;
    private NonLeakingWebView y;
    private RelativeLayout z;

    public AdPopcornSSPInterstitialActivity() {
        this.e = false;
        this.g = false;
        this.h = false;
        this.k = false;
        this.l = 0;
        this.m = true;
        this.n = -28;
        this.o = 20;
        this.p = 20;
        this.q = 0;
        this.r = false;
        this.s = 0;
        this.u = new ArrayList();
        this.v = 0;
        this.w = false;
        this.x = 0;
        this.G = new g(this);
    }

    // 检测为 Lambda 实现
    private static WindowInsets a(View view0, WindowInsets windowInsets0) [...]

    private void a() {
        class f implements com.igaworks.ssp.W.b {
            final AdPopcornSSPInterstitialActivity a;

            @Override  // com.igaworks.ssp.W$b
            public void a() {
                if(S.c().b() != null) {
                    S.c().d();
                }
            }
        }

        W.a(new f(this));
    }

    private void a(int v, boolean z) {
        class h implements Runnable {
            final boolean a;
            final AdPopcornSSPInterstitialActivity b;

            h(boolean z) {
                this.a = z;
                super();
            }

            @Override
            public void run() {
                try {
                    if(!this.a && AdPopcornSSPInterstitialActivity.this.y.getContentHeight() == 0) {
                        AdPopcornSSPInterstitialActivity.d(AdPopcornSSPInterstitialActivity.this);
                        if(AdPopcornSSPInterstitialActivity.this.x > 2) {
                            AdPopcornSSPInterstitialActivity.this.a(100, true);
                        }
                        else {
                            AdPopcornSSPInterstitialActivity.this.a(100, false);
                        }
                        goto label_6;
                    }
                    goto label_9;
                }
                catch(Exception exception0) {
                    goto label_20;
                }
                catch(Throwable throwable0) {
                    goto label_24;
                }
            label_6:
                if(AdPopcornSSPInterstitialActivity.this.y != null) {
                    AdPopcornSSPInterstitialActivity.this.y.setVisibility(0);
                }
                return;
                try {
                    try {
                    label_9:
                        Bitmap bitmap0 = AdPopcornSSPInterstitialActivity.this.y.getDrawingCache(false);
                        if(bitmap0 != null) {
                            int v = bitmap0.getPixel(1, 1);
                            AdPopcornSSPInterstitialActivity.this.y.setDrawingCacheEnabled(false);
                            AdPopcornSSPInterstitialActivity.this.y.destroyDrawingCache();
                            int v1 = h0.a(((Context)AdPopcornSSPInterstitialActivity.this.d.get()), "interstitial_container", "id");
                            ((FrameLayout)AdPopcornSSPInterstitialActivity.this.findViewById(v1)).setBackgroundColor(v);
                        }
                        goto label_27;
                    }
                    catch(Exception exception0) {
                    }
                label_20:
                    b.a(Thread.currentThread(), exception0);
                    if(AdPopcornSSPInterstitialActivity.this.y != null) {
                        goto label_22;
                    }
                    return;
                }
                catch(Throwable throwable0) {
                    goto label_24;
                }
            label_22:
                AdPopcornSSPInterstitialActivity.this.y.setVisibility(0);
                return;
            label_24:
                if(AdPopcornSSPInterstitialActivity.this.y != null) {
                    AdPopcornSSPInterstitialActivity.this.y.setVisibility(0);
                }
                throw throwable0;
            label_27:
                if(AdPopcornSSPInterstitialActivity.this.y != null) {
                    AdPopcornSSPInterstitialActivity.this.y.setVisibility(0);
                }
            }
        }

        this.y.postDelayed(new h(this, z), ((long)v));
    }

    private void a(Context context0) {
        try {
            for(int v = 0; v < this.c.g().size(); ++v) {
                String s = (String)this.c.g().get(v);
                if(s0.a(s)) {
                    b.c(Thread.currentThread(), String.format("<Impression in interstitial companion url : %s>", s));
                    E.g().d().a(context0, e.i, s);
                }
            }
        }
        catch(Exception unused_ex) {
        }
    }

    private void a(boolean z) {
        class l implements Runnable {
            final AdPopcornSSPInterstitialActivity a;

            @Override
            public void run() {
                AdPopcornSSPInterstitialActivity.this.t.setVisibility(0);
            }
        }

        this.t = this.m ? ((ImageView)this.findViewById(h0.a(this, "close_button", "id"))) : ((ImageView)this.findViewById(h0.a(this, "relative_close_button", "id")));
        if(z) {
            if(this.s > 0) {
                new Handler(Looper.getMainLooper()).postDelayed(new l(this), ((long)this.s));
                return;
            }
            this.t.setVisibility(0);
            return;
        }
        this.t.setVisibility(8);
    }

    private void b() {
        if(S.c().b() != null) {
            S.c().a(this.l);
        }
        this.finish();
    }

    private void b(Context context0) {
        try {
            for(int v = 0; v < this.a.d().size(); ++v) {
                String s = (String)this.a.d().get(v);
                if(s0.a(s)) {
                    b.c(Thread.currentThread(), String.format("<Impression in interstitial url : %s>", s));
                    E.g().d().a(context0, e.i, s);
                }
            }
        }
        catch(Exception unused_ex) {
        }
    }

    private void c() {
        try {
            this.a();
            for(int v = 0; v < this.c.b().size(); ++v) {
                String s = (String)this.c.b().get(v);
                if(s0.a(s)) {
                    b.c(Thread.currentThread(), String.format("Click Report URL Called in interstitial companionAd : %s ", s));
                    E.g().d().a(this.getApplicationContext(), e.j, s);
                }
            }
        }
        catch(Exception unused_ex) {
        }
    }

    private void c(Context context0) {
        try {
            for(int v = 0; v < this.b.g().size(); ++v) {
                String s = (String)this.b.g().get(v);
                if(s0.a(s)) {
                    b.c(Thread.currentThread(), String.format("<Impression in interstitial native url : %s>", s));
                    E.g().d().a(context0, e.i, s);
                }
            }
        }
        catch(Exception unused_ex) {
        }
    }

    static int d(AdPopcornSSPInterstitialActivity adPopcornSSPInterstitialActivity0) {
        int v = adPopcornSSPInterstitialActivity0.x;
        adPopcornSSPInterstitialActivity0.x = v + 1;
        return v;
    }

    private void d() {
        try {
            this.a();
            for(int v = 0; v < this.a.a().size(); ++v) {
                String s = (String)this.a.a().get(v);
                if(s0.a(s)) {
                    b.c(Thread.currentThread(), String.format("Click Report URL Called in interstitial : %s ", s));
                    E.g().d().a(this.getApplicationContext(), e.j, s);
                }
            }
        }
        catch(Exception unused_ex) {
        }
    }

    private void e() {
        try {
            this.a();
            for(int v = 0; v < this.b.b().size(); ++v) {
                String s = (String)this.b.b().get(v);
                if(s0.a(s)) {
                    b.c(Thread.currentThread(), String.format("Click Report URL Called in interstitial nativeAd : %s ", s));
                    E.g().d().a(this.getApplicationContext(), e.j, s);
                }
            }
        }
        catch(Exception unused_ex) {
        }
    }

    private void f() {
        class k implements View.OnClickListener {
            final AdPopcornSSPInterstitialActivity a;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                AdPopcornSSPInterstitialActivity.this.l = 1;
                AdPopcornSSPInterstitialActivity.this.b();
            }
        }

        try {
            ImageView imageView0 = (ImageView)this.findViewById(h0.a(((Context)this.d.get()), "close_button", "id"));
            int v = (int)J.b(this, 28.0f);
            if(this.c == null) {
                if(this.m) {
                    b.c(Thread.currentThread(), "Close Btn Location Type 1");
                    imageView0.getLayoutParams().width = v;
                    imageView0.getLayoutParams().height = v;
                    ((FrameLayout.LayoutParams)imageView0.getLayoutParams()).gravity = 53;
                    FrameLayout.LayoutParams frameLayout$LayoutParams2 = (FrameLayout.LayoutParams)imageView0.getLayoutParams();
                    frameLayout$LayoutParams2.topMargin = (int)J.a(this, ((float)this.p));
                    FrameLayout.LayoutParams frameLayout$LayoutParams3 = (FrameLayout.LayoutParams)imageView0.getLayoutParams();
                    frameLayout$LayoutParams3.rightMargin = (int)J.a(this, ((float)this.o));
                    ((FrameLayout.LayoutParams)imageView0.getLayoutParams()).leftMargin = 0;
                    ((FrameLayout.LayoutParams)imageView0.getLayoutParams()).bottomMargin = 0;
                }
                else {
                    int v2 = J.c(((Context)this.d.get()));
                    int v3 = J.b(((Context)this.d.get()));
                    int v4 = (int)J.a(this.getApplicationContext(), ((float)this.a.i()));
                    int v5 = (int)J.a(this.getApplicationContext(), ((float)this.a.c()));
                    if(v2 > v4 && v3 - J.e(((Context)this.d.get())) - J.d(((Context)this.d.get())) > v5) {
                        b.c(Thread.currentThread(), "Close Btn Location Type 3");
                        ImageView imageView1 = (ImageView)this.findViewById(h0.a(((Context)this.d.get()), "close_button_standard_iv", "id"));
                        try {
                            if(this.a != null && this.a.b() == j.c.b()) {
                                int v6 = (int)J.a(this.getApplicationContext(), ((float)this.a.i()));
                                int v7 = (int)J.a(this.getApplicationContext(), ((float)this.a.c()));
                                if(v6 > 0 && v7 > 0) {
                                    RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(v6, v7);
                                    relativeLayout$LayoutParams1.addRule(13, -1);
                                    imageView1.setLayoutParams(relativeLayout$LayoutParams1);
                                }
                            }
                        }
                        catch(Exception exception0) {
                            exception0.printStackTrace();
                        }
                        ImageView imageView2 = (ImageView)this.findViewById(h0.a(((Context)this.d.get()), "relative_close_button", "id"));
                        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(v, v);
                        relativeLayout$LayoutParams2.addRule(1, imageView1.getId());
                        relativeLayout$LayoutParams2.addRule(2, imageView1.getId());
                        relativeLayout$LayoutParams2.leftMargin = (int)J.a(this, ((float)this.n));
                        relativeLayout$LayoutParams2.bottomMargin = (int)J.a(this, ((float)this.q));
                        relativeLayout$LayoutParams2.topMargin = 0;
                        relativeLayout$LayoutParams2.rightMargin = 0;
                        imageView2.setLayoutParams(relativeLayout$LayoutParams2);
                        imageView0 = imageView2;
                    }
                    else {
                        b.c(Thread.currentThread(), "Close Btn Location Type 2");
                        imageView0 = (ImageView)this.findViewById(h0.a(((Context)this.d.get()), "relative_close_button", "id"));
                        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(v, v);
                        relativeLayout$LayoutParams0.addRule(11);
                        relativeLayout$LayoutParams0.addRule(10);
                        relativeLayout$LayoutParams0.topMargin = (int)J.a(this, ((float)this.p));
                        relativeLayout$LayoutParams0.rightMargin = (int)J.a(this, ((float)this.o));
                        relativeLayout$LayoutParams0.leftMargin = 0;
                        relativeLayout$LayoutParams0.bottomMargin = 0;
                        imageView0.setLayoutParams(relativeLayout$LayoutParams0);
                    }
                }
                imageView0.setImageBitmap(h0.a(((Context)this.d.get()), "ic_close_btn.png"));
            }
            else {
                int v1 = (int)J.b(this, 20.0f);
                b.c(Thread.currentThread(), "Close Btn Location : Companion");
                imageView0.getLayoutParams().width = v1;
                imageView0.getLayoutParams().height = v1;
                ((FrameLayout.LayoutParams)imageView0.getLayoutParams()).gravity = 53;
                FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)imageView0.getLayoutParams();
                frameLayout$LayoutParams0.topMargin = (J.b(((Context)this.d.get())) - ((int)J.a(this.getApplicationContext(), ((float)this.a.c()))) - this.A) / 2 - J.a(((Context)this.d.get()), 40);
                FrameLayout.LayoutParams frameLayout$LayoutParams1 = (FrameLayout.LayoutParams)imageView0.getLayoutParams();
                frameLayout$LayoutParams1.rightMargin = (J.c(((Context)this.d.get())) - J.a(this, 324)) / 2 + J.a(this, 5);
                ((FrameLayout.LayoutParams)imageView0.getLayoutParams()).leftMargin = 0;
                ((FrameLayout.LayoutParams)imageView0.getLayoutParams()).bottomMargin = 0;
                imageView0.setImageBitmap(h0.a(((Context)this.d.get()), "interstitial_close.png"));
            }
            imageView0.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView0.setOnClickListener(new k(this));
            if(!this.k) {
                this.a(true);
                return;
            }
            this.a(false);
        }
        catch(Exception unused_ex) {
        }
    }

    private void g() {
        class com.igaworks.ssp.part.interstitial.activity.AdPopcornSSPInterstitialActivity.a implements d {
            final ImageView a;
            final AdPopcornSSPInterstitialActivity b;

            com.igaworks.ssp.part.interstitial.activity.AdPopcornSSPInterstitialActivity.a(ImageView imageView0) {
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


        class com.igaworks.ssp.part.interstitial.activity.AdPopcornSSPInterstitialActivity.b implements d {
            final ImageView a;
            final AdPopcornSSPInterstitialActivity b;

            com.igaworks.ssp.part.interstitial.activity.AdPopcornSSPInterstitialActivity.b(ImageView imageView0) {
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


        class c implements d {
            final ImageView a;
            final AdPopcornSSPInterstitialActivity b;

            c(ImageView imageView0) {
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


        class com.igaworks.ssp.part.interstitial.activity.AdPopcornSSPInterstitialActivity.d implements View.OnClickListener {
            final AdPopcornSSPInterstitialActivity a;

            // 去混淆评级： 中等(70)
            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
            }
        }


        class com.igaworks.ssp.part.interstitial.activity.AdPopcornSSPInterstitialActivity.e implements View.OnClickListener {
            final AdPopcornSSPInterstitialActivity a;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                try {
                    AdPopcornSSPInterstitialActivity.this.c();
                }
                catch(Exception exception0) {
                    b.a(Thread.currentThread(), exception0);
                }
            }
        }

        try {
            int v = this.c.n();
            int v1 = J.a(((Context)this.d.get()), 324);
            this.A = J.a(((Context)this.d.get()), 58);
            int v2 = J.a(((Context)this.d.get()), 84);
            int v3 = J.a(((Context)this.d.get()), 44);
            int v4 = v1 - v2;
            int v5 = v4 - J.a(((Context)this.d.get()), 0x1F);
            int v6 = J.a(((Context)this.d.get()), 0x1F);
            if(v != 1) {
                v5 -= J.a(((Context)this.d.get()), 20);
            }
            this.z = (RelativeLayout)this.findViewById(h0.a(((Context)this.d.get()), "interstital_companion", "id"));
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(v1, this.A);
            linearLayout$LayoutParams0.leftMargin = J.a(((Context)this.d.get()), 18);
            linearLayout$LayoutParams0.rightMargin = J.a(((Context)this.d.get()), 18);
            linearLayout$LayoutParams0.bottomMargin = J.a(((Context)this.d.get()), 12);
            this.z.setBackgroundColor(Color.parseColor("#F4F4F4"));
            this.z.setLayoutParams(linearLayout$LayoutParams0);
            ImageView imageView0 = new ImageView(((Context)this.d.get()));
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(v2, v3);
            relativeLayout$LayoutParams0.leftMargin = J.a(((Context)this.d.get()), 7);
            relativeLayout$LayoutParams0.rightMargin = J.a(((Context)this.d.get()), 7);
            relativeLayout$LayoutParams0.addRule(11);
            relativeLayout$LayoutParams0.addRule(15);
            imageView0.setLayoutParams(relativeLayout$LayoutParams0);
            ImageView.ScaleType imageView$ScaleType0 = ImageView.ScaleType.FIT_XY;
            imageView0.setScaleType(imageView$ScaleType0);
            this.z.addView(imageView0);
            if(v == 5) {
                ImageView imageView1 = new ImageView(((Context)this.d.get()));
                RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(J.a(((Context)this.d.get()), 16), J.a(((Context)this.d.get()), 16));
                relativeLayout$LayoutParams1.leftMargin = J.a(((Context)this.d.get()), 17);
                relativeLayout$LayoutParams1.rightMargin = J.a(((Context)this.d.get()), 4);
                relativeLayout$LayoutParams1.topMargin = J.a(((Context)this.d.get()), 13);
                relativeLayout$LayoutParams1.addRule(9);
                relativeLayout$LayoutParams1.addRule(10);
                imageView1.setLayoutParams(relativeLayout$LayoutParams1);
                imageView1.setScaleType(imageView$ScaleType0);
                this.z.addView(imageView1);
            }
            TextView textView0 = new TextView(((Context)this.d.get()));
            textView0.setId(10);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(v5, J.a(((Context)this.d.get()), 20));
            relativeLayout$LayoutParams2.leftMargin = v == 1 ? J.a(((Context)this.d.get()), 17) : J.a(((Context)this.d.get()), 37);
            relativeLayout$LayoutParams2.rightMargin = J.a(((Context)this.d.get()), 7);
            relativeLayout$LayoutParams2.topMargin = J.a(((Context)this.d.get()), 11);
            relativeLayout$LayoutParams2.addRule(10);
            textView0.setSingleLine();
            textView0.setGravity(16);
            textView0.setLayoutParams(relativeLayout$LayoutParams2);
            int v7 = Color.parseColor("#494949");
            TextUtils.TruncateAt textUtils$TruncateAt0 = TextUtils.TruncateAt.END;
            s0.a(textView0, "", 13, v7, null, 0, 1, textUtils$TruncateAt0, true);
            this.z.addView(textView0);
            TextView textView1 = new TextView(((Context)this.d.get()));
            RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(v4 - v6, J.a(((Context)this.d.get()), 18));
            relativeLayout$LayoutParams3.leftMargin = J.a(((Context)this.d.get()), 17);
            relativeLayout$LayoutParams3.rightMargin = J.a(((Context)this.d.get()), 7);
            relativeLayout$LayoutParams3.addRule(9);
            relativeLayout$LayoutParams3.addRule(3, textView0.getId());
            textView1.setLayoutParams(relativeLayout$LayoutParams3);
            textView1.setSingleLine();
            textView1.setGravity(16);
            s0.a(textView1, "", 12, Color.parseColor("#707070"), null, 0, 1, textUtils$TruncateAt0, false);
            this.z.addView(textView1);
            this.z.setOnClickListener(new com.igaworks.ssp.part.interstitial.activity.AdPopcornSSPInterstitialActivity.e(this));
            this.z.setVisibility(0);
            this.a(((Context)this.d.get()));
            return;
        }
        catch(Exception exception0) {
        }
        exception0.printStackTrace();
    }

    private void h() {
        class com.igaworks.ssp.part.interstitial.activity.AdPopcornSSPInterstitialActivity.j extends z {
            final AdPopcornSSPInterstitialActivity a;

            @Override  // com.igaworks.ssp.z
            public void a() {
                AdPopcornSSPInterstitialActivity.this.e = true;
                if(AdPopcornSSPInterstitialActivity.this.f) {
                    AdPopcornSSPInterstitialActivity.this.l = 2;
                    AdPopcornSSPInterstitialActivity.this.b();
                }
            }
        }

        try {
            HashMap hashMap0 = this.j;
            if(hashMap0 != null) {
                if(((Boolean)hashMap0.get("isEndingAd")).booleanValue()) {
                    TextView textView0 = (TextView)this.findViewById(h0.a(((Context)this.d.get()), "tv_end_msg", "id"));
                    textView0.setVisibility(0);
                    String s = (String)this.j.get("endingText");
                    if(s == null || s.length() <= 0) {
                        textView0.setText(" " + r.a(((Context)this.d.get())).j);
                    }
                    else {
                        textView0.setText(s);
                    }
                    textView0.setTextSize(2, ((float)(((int)(((Integer)this.j.get("endingTextSize")))))));
                    textView0.setTextColor(((int)(((Integer)this.j.get("endingTextColor")))));
                    textView0.setGravity(((int)(((Integer)this.j.get("endingTextGravity")))));
                }
                int v = (int)(((Integer)this.j.get("backgroundColor")));
                b.c(Thread.currentThread(), "interstitialBackgroundColor : " + v);
                ((FrameLayout)this.findViewById(h0.a(((Context)this.d.get()), "interstitial_container", "id"))).setBackgroundColor(v);
                this.k = ((Boolean)this.j.get("hideCloseBtn")).booleanValue();
                this.g = ((Boolean)this.j.get("enableAutoClose")).booleanValue();
                b.c(Thread.currentThread(), "interstitial enableAutoClose : " + this.g);
                if(this.j.containsKey("closeBtnGravityFromEdge")) {
                    this.m = ((Boolean)this.j.get("closeBtnGravityFromEdge")).booleanValue();
                }
                if(this.j.containsKey("closeBtnLeftMargin")) {
                    this.n = (int)(((Integer)this.j.get("closeBtnLeftMargin")));
                }
                if(this.j.containsKey("closeBtnRightMargin")) {
                    this.o = (int)(((Integer)this.j.get("closeBtnRightMargin")));
                }
                if(this.j.containsKey("closeBtnTopMargin")) {
                    this.p = (int)(((Integer)this.j.get("closeBtnTopMargin")));
                }
                if(this.j.containsKey("closeBtnBottomMargin")) {
                    this.q = (int)(((Integer)this.j.get("closeBtnBottomMargin")));
                }
                if(this.j.containsKey("disableBackBtn")) {
                    this.h = ((Boolean)this.j.get("disableBackBtn")).booleanValue();
                }
                if(this.j.containsKey("contentsScale")) {
                    this.v = (int)(((Integer)this.j.get("contentsScale")));
                }
                if(this.j.containsKey("backgroundAutoBg")) {
                    this.w = ((Boolean)this.j.get("backgroundAutoBg")).booleanValue();
                }
            }
            int v1 = this.a.e();
            this.s = v1 * 1000;
            if(v1 * 1000 > 0) {
                goto label_38;
            }
        }
        catch(Exception exception0) {
            b.a(Thread.currentThread(), exception0);
        }
        this.e = true;
        return;
        try {
        label_38:
            b.c(Thread.currentThread(), "interstitial minimumViewTimeMillis : " + this.s);
            x x0 = this.i;
            if(x0 == null) {
                this.i = new x();
            }
            else {
                x0.a();
            }
            this.i.a(((long)this.s), new com.igaworks.ssp.part.interstitial.activity.AdPopcornSSPInterstitialActivity.j(this));
            return;
        }
        catch(Exception exception1) {
        }
        try {
            b.a(Thread.currentThread(), exception1);
            this.e = true;
            return;
        }
        catch(Exception exception0) {
        }
        b.a(Thread.currentThread(), exception0);
        this.e = true;
    }

    private void i() {
        class m implements d {
            final ImageView a;
            final AdPopcornSSPInterstitialActivity b;

            m(ImageView imageView0) {
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


        class n implements d {
            final ImageView a;
            final AdPopcornSSPInterstitialActivity b;

            n(ImageView imageView0) {
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


        class o implements d {
            final ImageView a;
            final AdPopcornSSPInterstitialActivity b;

            o(ImageView imageView0) {
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


        class p implements View.OnClickListener {
            final AdPopcornSSPInterstitialActivity a;

            // 去混淆评级： 中等(80)
            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
            }
        }


        class q implements View.OnClickListener {
            final AdPopcornSSPInterstitialActivity a;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                try {
                    AdPopcornSSPInterstitialActivity.this.e();
                }
                catch(Exception exception0) {
                    b.a(Thread.currentThread(), exception0);
                }
            }
        }

        try {
            this.C = this.b.n();
            int v = J.a(((Context)this.d.get()), 320);
            int v1 = J.a(((Context)this.d.get()), 0xA7);
            int v2 = J.a(((Context)this.d.get()), 320);
            if(this.C == 13) {
                v2 = J.a(((Context)this.d.get()), 52);
            }
            this.D = (RelativeLayout)this.findViewById(h0.a(((Context)this.d.get()), "interstital_native", "id"));
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(J.a(((Context)this.d.get()), 320), J.a(((Context)this.d.get()), 480));
            this.D.setBackgroundDrawable(this.F);
            this.D.setLayoutParams(linearLayout$LayoutParams0);
            ImageView imageView0 = new ImageView(((Context)this.d.get()));
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(v2, v2);
            relativeLayout$LayoutParams0.addRule(9);
            relativeLayout$LayoutParams0.addRule(10);
            if(this.C == 13) {
                relativeLayout$LayoutParams0.topMargin = J.a(((Context)this.d.get()), 0xB7);
                relativeLayout$LayoutParams0.leftMargin = J.a(((Context)this.d.get()), 16);
            }
            imageView0.setLayoutParams(relativeLayout$LayoutParams0);
            ImageView.ScaleType imageView$ScaleType0 = ImageView.ScaleType.FIT_XY;
            imageView0.setScaleType(imageView$ScaleType0);
            this.D.addView(imageView0);
            if(this.C == 13) {
                ImageView imageView1 = new ImageView(((Context)this.d.get()));
                RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(v, v1);
                relativeLayout$LayoutParams1.addRule(9);
                relativeLayout$LayoutParams1.addRule(10);
                imageView1.setLayoutParams(relativeLayout$LayoutParams1);
                imageView1.setScaleType(imageView$ScaleType0);
                this.D.addView(imageView1);
            }
            TextView textView0 = new TextView(((Context)this.d.get()));
            RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-1, J.a(((Context)this.d.get()), 24));
            relativeLayout$LayoutParams2.leftMargin = J.a(((Context)this.d.get()), 16);
            relativeLayout$LayoutParams2.rightMargin = J.a(((Context)this.d.get()), 16);
            int v3 = this.C;
            if(v3 == 12) {
                relativeLayout$LayoutParams2.topMargin = J.a(((Context)this.d.get()), 0x150);
            }
            else if(v3 == 13) {
                relativeLayout$LayoutParams2.topMargin = J.a(((Context)this.d.get()), 0xF5);
            }
            relativeLayout$LayoutParams2.addRule(10);
            textView0.setSingleLine();
            textView0.setGravity(16);
            textView0.setLayoutParams(relativeLayout$LayoutParams2);
            int v4 = Color.parseColor("#000000");
            TextUtils.TruncateAt textUtils$TruncateAt0 = TextUtils.TruncateAt.END;
            s0.a(textView0, "", 16, v4, null, 0, 1, textUtils$TruncateAt0, true);
            this.D.addView(textView0);
            TextView textView1 = new TextView(((Context)this.d.get()));
            RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(-1, J.a(((Context)this.d.get()), 21));
            relativeLayout$LayoutParams3.leftMargin = J.a(((Context)this.d.get()), 16);
            relativeLayout$LayoutParams3.rightMargin = J.a(((Context)this.d.get()), 16);
            int v5 = this.C;
            if(v5 == 12) {
                relativeLayout$LayoutParams3.topMargin = J.a(((Context)this.d.get()), 361);
            }
            else if(v5 == 13) {
                relativeLayout$LayoutParams3.topMargin = J.a(((Context)this.d.get()), 270);
            }
            relativeLayout$LayoutParams3.addRule(9);
            relativeLayout$LayoutParams3.addRule(10);
            textView1.setLayoutParams(relativeLayout$LayoutParams3);
            textView1.setSingleLine();
            textView1.setGravity(16);
            if(this.C == 12) {
                s0.a(textView1, "", 14, Color.parseColor("#363636"), null, 0, 1, textUtils$TruncateAt0, false);
            }
            else {
                s0.a(textView1, "", 12, Color.parseColor("#363636"), null, 0, 1, textUtils$TruncateAt0, false);
            }
            this.D.addView(textView1);
            TextView textView2 = new TextView(((Context)this.d.get()));
            RelativeLayout.LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout.LayoutParams(J.a(((Context)this.d.get()), 320), J.a(((Context)this.d.get()), 40));
            relativeLayout$LayoutParams4.topMargin = J.a(((Context)this.d.get()), 440);
            textView2.setBackgroundDrawable(this.E);
            relativeLayout$LayoutParams4.addRule(10);
            relativeLayout$LayoutParams4.addRule(9);
            textView2.setSingleLine();
            textView2.setGravity(17);
            textView2.setLayoutParams(relativeLayout$LayoutParams4);
            s0.a(textView2, "", 14, Color.parseColor("#ffffff"), null, 0, 1, TextUtils.TruncateAt.END, false);
            this.D.addView(textView2);
            this.D.setVisibility(0);
            this.D.setOnClickListener(new q(this));
            this.c(((Context)this.d.get()));
        }
        catch(Exception unused_ex) {
        }
    }

    private void j() {
        try {
            if(this.a != null && this.a.b() == j.c.b()) {
                b.c(Thread.currentThread(), "setWebContent contentsScaleType : " + this.v + ", dp width : " + this.a.i() + ", dp height : " + this.a.c());
                int v = (int)J.a(this.getApplicationContext(), ((float)this.a.i()));
                int v1 = (int)J.a(this.getApplicationContext(), ((float)this.a.c()));
                U u0 = this.c;
                if(u0 == null && this.v == 2) {
                    int v2 = J.c(((Context)this.d.get()));
                    int v3 = J.b(((Context)this.d.get()));
                    if(v2 > v3) {
                        if(v > 0 && v1 > 0) {
                            LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(((int)(((double)v2) * (((double)v3) / ((double)v1)))), v3);
                            if(this.c == null) {
                                linearLayout$LayoutParams1.gravity = 17;
                            }
                            else {
                                linearLayout$LayoutParams1.gravity = 0x30;
                                linearLayout$LayoutParams1.topMargin = J.a(((Context)this.d.get()), 0xC1);
                            }
                            this.y.setLayoutParams(linearLayout$LayoutParams1);
                        }
                    }
                    else if(v > 0 && v1 > 0) {
                        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(v2, ((int)(((double)v1) * (((double)v2) / ((double)v)))));
                        linearLayout$LayoutParams0.gravity = 17;
                        this.y.setLayoutParams(linearLayout$LayoutParams0);
                    }
                }
                else if(u0 != null || this.v != 1) {
                    if(v > 0 && v1 > 0) {
                        LinearLayout.LayoutParams linearLayout$LayoutParams3 = new LinearLayout.LayoutParams(v, v1);
                        linearLayout$LayoutParams3.gravity = 17;
                        this.y.setLayoutParams(linearLayout$LayoutParams3);
                    }
                }
                else if(v > 0 && v1 > 0) {
                    LinearLayout.LayoutParams linearLayout$LayoutParams2 = new LinearLayout.LayoutParams(-1, -1);
                    linearLayout$LayoutParams2.gravity = 17;
                    this.y.setLayoutParams(linearLayout$LayoutParams2);
                }
            }
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
        this.y.setVisibility(4);
        this.y.getSettings().setJavaScriptEnabled(true);
        this.y.setWebViewClient(this.G);
        this.y.setVerticalScrollBarEnabled(false);
        this.y.setVerticalScrollbarOverlay(false);
        this.y.setHorizontalScrollBarEnabled(false);
        this.y.setHorizontalScrollbarOverlay(false);
        this.y.setBackgroundColor(0xFF000000);
        this.y.getSettings().setDefaultTextEncodingName("UTF-8");
        this.y.getSettings().setAllowFileAccess(true);
        K.a(this.getApplicationContext(), "tempFile-ssp-o.html", this.a.h().getBytes(), com.igaworks.ssp.K.a.a);
        String s = this.getApplicationContext().getFilesDir().getPath() + "/" + "tempFile-ssp-o.html";
        String s1 = s.startsWith("/") ? "file://" + s : "file:///" + s;
        if(K.a(s)) {
            b.c(Thread.currentThread(), "interstitial web contents file load success");
            this.y.loadUrl(s1);
        }
        else {
            b.c(Thread.currentThread(), "interstitial web contents loadDataWithBaseURL");
            this.y.loadDataWithBaseURL(null, this.a.h(), "text/html", "UTF-8", null);
        }
        try {
            String s2 = this.y.getSettings().getUserAgentString();
            if(s2 != null && s2.length() > 0) {
                q0.a().b(((Context)this.d.get()), "igaw_ssp_sp", "webview_user_agent_key", s2);
            }
        }
        catch(Exception unused_ex) {
        }
    }

    static U l(AdPopcornSSPInterstitialActivity adPopcornSSPInterstitialActivity0) {
        return adPopcornSSPInterstitialActivity0.b;
    }

    static U n(AdPopcornSSPInterstitialActivity adPopcornSSPInterstitialActivity0) {
        return adPopcornSSPInterstitialActivity0.c;
    }

    @Override  // android.app.Activity
    public void onBackPressed() {
        if(this.h) {
            return;
        }
        this.f = true;
        if(this.e) {
            this.l = 2;
            this.b();
        }
    }

    @Override  // android.app.Activity
    public void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
    }

    @Override  // android.app.Activity
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        try {
            this.d = new WeakReference(this);
            this.l = 0;
            Window window0 = this.getWindow();
            int v = Build.VERSION.SDK_INT;
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
        }
        catch(Exception exception0) {
            b.a(Thread.currentThread(), exception0);
            return;
        }
        try {
            Intent intent0 = this.getIntent();
            this.a = (Q)intent0.getSerializableExtra("interstitial_intent_model_data");
            this.j = (HashMap)intent0.getSerializableExtra("interstitial_intent_custom_data");
            this.c = (U)intent0.getSerializableExtra("interstitial_intent_companion_model_data");
            this.b = (U)intent0.getSerializableExtra("interstitial_intent_native_model_data");
        }
        catch(Exception unused_ex) {
        }
        try {
            GradientDrawable.Orientation gradientDrawable$Orientation0 = GradientDrawable.Orientation.TOP_BOTTOM;
            GradientDrawable gradientDrawable0 = new GradientDrawable(gradientDrawable$Orientation0, new int[]{0xFFF8F8F8, 0xFFF8F8F8});
            this.F = gradientDrawable0;
            gradientDrawable0.setShape(0);
            this.F.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, ((float)J.a(((Context)this.d.get()), 2)), ((float)J.a(((Context)this.d.get()), 2)), ((float)J.a(((Context)this.d.get()), 2)), ((float)J.a(((Context)this.d.get()), 2))});
            this.F.setGradientType(0);
            GradientDrawable gradientDrawable1 = new GradientDrawable(gradientDrawable$Orientation0, new int[]{0xFF008BFA, 0xFF008BFA});
            this.E = gradientDrawable1;
            gradientDrawable1.setShape(0);
            this.E.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, ((float)J.a(((Context)this.d.get()), 2)), ((float)J.a(((Context)this.d.get()), 2)), ((float)J.a(((Context)this.d.get()), 2)), ((float)J.a(((Context)this.d.get()), 2))});
            this.E.setGradientType(0);
            this.f = false;
            this.k = false;
            Q q0 = this.a;
            if(q0 == null) {
                this.l = 0;
                this.b();
                return;
            }
        }
        catch(Exception exception0) {
            b.a(Thread.currentThread(), exception0);
            return;
        }
        try {
            if(q0.f() == 0) {
                this.getWindow().setFlags(0x400, 0x400);
            }
            if(this.a.g() != null) {
                this.u = this.a.g();
            }
            this.B = this.a.k();
        }
        catch(Exception unused_ex) {
        }
        try {
            this.setContentView(h0.a(this, "dialog_integration", "layout"));
            this.h();
            this.r = this.a.j();
            this.y = (NonLeakingWebView)this.findViewById(h0.a(this, "interstitial_web", "id"));
            if(this.c != null) {
                this.g();
            }
            if(this.r) {
                this.j();
            }
            else {
                this.i();
            }
            this.f();
            return;
        }
        catch(Exception exception0) {
        }
        b.a(Thread.currentThread(), exception0);
    }

    @Override  // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override  // android.app.Activity
    public void onDetachedFromWindow() {
        class i implements Runnable {
            final AdPopcornSSPInterstitialActivity a;

            @Override
            public void run() {
                try {
                    int v = h0.a(((Context)AdPopcornSSPInterstitialActivity.this.d.get()), "interstitial_web", "id");
                    WebView webView0 = (WebView)AdPopcornSSPInterstitialActivity.this.findViewById(v);
                    if(webView0 != null) {
                        webView0.loadUrl("about:blank");
                        webView0.clearDisappearingChildren();
                        webView0.removeAllViews();
                        if(webView0.getParent() != null) {
                            ((ViewGroup)webView0.getParent()).removeView(webView0);
                        }
                    }
                }
                catch(Exception exception0) {
                    b.a(Thread.currentThread(), exception0);
                }
            }
        }

        super.onDetachedFromWindow();
        try {
            new Handler(Looper.getMainLooper()).post(new i(this));
        }
        catch(Exception exception0) {
            b.a(Thread.currentThread(), exception0);
        }
        x x0 = this.i;
        if(x0 != null) {
            x0.a();
            this.i = null;
        }
    }

    @Override  // android.app.Activity
    protected void onPause() {
        super.onPause();
        if(this.g && this.l == 0) {
            b.c(Thread.currentThread(), "interstitial onPause autoClose");
            this.l = 5;
            this.b();
        }
    }
}

