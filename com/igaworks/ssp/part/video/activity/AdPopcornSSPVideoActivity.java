package com.igaworks.ssp.part.video.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnSeekCompleteListener;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.view.E0;
import androidx.core.view.F0;
import com.igaworks.ssp.A0;
import com.igaworks.ssp.B0;
import com.igaworks.ssp.E;
import com.igaworks.ssp.G;
import com.igaworks.ssp.J;
import com.igaworks.ssp.O;
import com.igaworks.ssp.R.mipmap;
import com.igaworks.ssp.S;
import com.igaworks.ssp.W;
import com.igaworks.ssp.b;
import com.igaworks.ssp.c;
import com.igaworks.ssp.e0;
import com.igaworks.ssp.m0;
import com.igaworks.ssp.n;
import com.igaworks.ssp.part.NonLeakingWebView;
import com.igaworks.ssp.t;
import com.igaworks.ssp.u0;
import com.igaworks.ssp.v0;
import com.igaworks.ssp.z0;
import java.lang.ref.WeakReference;
import java.util.List;

public class AdPopcornSSPVideoActivity extends Activity {
    class e extends WebViewClient {
        final AdPopcornSSPVideoActivity a;

        private boolean a(WebView webView0, String s) {
            if(AdPopcornSSPVideoActivity.this.z) {
                AdPopcornSSPVideoActivity.this.z = false;
                if(AdPopcornSSPVideoActivity.this.u.e() == null) {
                    Intent intent1 = new Intent("android.intent.action.VIEW", Uri.parse(s));
                    intent1.addFlags(0x10000000);
                    ((Context)AdPopcornSSPVideoActivity.this.a.get()).startActivity(intent1);
                }
                else {
                    try {
                        ((Context)AdPopcornSSPVideoActivity.this.a.get()).startActivity(new Intent("android.intent.action.VIEW", Uri.parse(AdPopcornSSPVideoActivity.this.u.e())));
                    }
                    catch(Exception unused_ex) {
                        Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse(s));
                        intent0.addFlags(0x10000000);
                        ((Context)AdPopcornSSPVideoActivity.this.a.get()).startActivity(intent0);
                    }
                }
                AdPopcornSSPVideoActivity.this.a("CompanionClickTracking");
                return true;
            }
            webView0.loadUrl(s);
            return false;
        }

        @Override  // android.webkit.WebViewClient
        public void onPageFinished(WebView webView0, String s) {
            super.onPageFinished(webView0, s);
            try {
                if(!e0.b(((Context)AdPopcornSSPVideoActivity.this.a.get()))) {
                    b.c(Thread.currentThread(), "onPageFinished Network OFFLINE");
                    return;
                }
                AdPopcornSSPVideoActivity.this.z = false;
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
                final e c;

                a(WebView webView0, String s) {
                    this.a = webView0;
                    this.b = s;
                    super();
                }

                @Override  // com.igaworks.ssp.u0$b
                public void a() {
                    e.this.a(this.a, this.b);
                }

                @Override  // com.igaworks.ssp.u0$b
                public void onSuccess(String s) {
                    b.c(Thread.currentThread(), "resolvedUrl : " + s);
                    e.this.a(this.a, s);
                }
            }

            try {
                String s = webResourceRequest0.getUrl().toString();
                if(AdPopcornSSPVideoActivity.this.O) {
                    new u0(s, new a(this, webView0, s)).start();
                    return true;
                }
                return this.a(webView0, s);
            }
            catch(Exception exception0) {
            }
            b.a(Thread.currentThread(), exception0);
            return false;
        }

        @Override  // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView0, String s) {
            class com.igaworks.ssp.part.video.activity.AdPopcornSSPVideoActivity.e.b implements com.igaworks.ssp.u0.b {
                final WebView a;
                final String b;
                final e c;

                com.igaworks.ssp.part.video.activity.AdPopcornSSPVideoActivity.e.b(WebView webView0, String s) {
                    this.a = webView0;
                    this.b = s;
                    super();
                }

                @Override  // com.igaworks.ssp.u0$b
                public void a() {
                    e.this.a(this.a, this.b);
                }

                @Override  // com.igaworks.ssp.u0$b
                public void onSuccess(String s) {
                    b.c(Thread.currentThread(), "resolvedUrl : " + s);
                    e.this.a(this.a, s);
                }
            }

            try {
                if(AdPopcornSSPVideoActivity.this.O) {
                    new u0(s, new com.igaworks.ssp.part.video.activity.AdPopcornSSPVideoActivity.e.b(this, webView0, s)).start();
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

    class l implements View.OnTouchListener {
        private int a;
        private float b;
        private float c;
        final AdPopcornSSPVideoActivity d;

        l() {
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
                        AdPopcornSSPVideoActivity.this.z = true;
                        AdPopcornSSPVideoActivity.this.a("CompanionClickTracking");
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

    private boolean A;
    private boolean B;
    private List C;
    private List D;
    private String E;
    private String F;
    private boolean G;
    private long H;
    private int I;
    private int J;
    private G K;
    private O L;
    private int M;
    private int N;
    private boolean O;
    private View.OnTouchListener P;
    private WebViewClient Q;
    private WeakReference a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;
    private double g;
    private FrameLayout h;
    private c i;
    private ProgressBar j;
    private LinearLayout k;
    private ImageView l;
    private ImageView m;
    private ImageView n;
    private TextView o;
    private NonLeakingWebView p;
    private ImageView q;
    private GradientDrawable r;
    private t s;
    private Runnable t;
    private B0 u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    public AdPopcornSSPVideoActivity() {
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = false;
        this.A = false;
        this.B = false;
        this.C = null;
        this.D = null;
        this.E = "";
        this.F = "";
        this.I = 0;
        this.M = 0;
        this.N = 0;
        this.O = false;
        this.P = new l(this);
        this.Q = new e(this);
    }

    // 检测为 Lambda 实现
    private static WindowInsets a(View view0, WindowInsets windowInsets0) [...]

    private void a() {
        class d implements com.igaworks.ssp.W.b {
            final AdPopcornSSPVideoActivity a;

            @Override  // com.igaworks.ssp.W$b
            public void a() {
                if(AdPopcornSSPVideoActivity.this.v) {
                    if(m0.b().c() != null) {
                        m0.b().d();
                    }
                }
                else if(S.c().b() != null) {
                    S.c().d();
                }
            }
        }

        W.a(new d(this));
    }

    private void a(int v) {
        try {
            if(this.u != null && this.u.k() != null) {
                for(int v1 = 0; v1 < this.u.k().size(); ++v1) {
                    String s = A0.a(((String)this.u.k().get(v1)), v);
                    E.g().d().a(((Context)this.a.get()), com.igaworks.ssp.t.e.s, s);
                }
            }
        }
        catch(Exception unused_ex) {
        }
    }

    private void a(String s) {
        List list0;
        try {
            b.c(Thread.currentThread(), "AdPopcornSSPVideoActivity eventTracking : " + s);
            switch(s) {
                case "CompanionClickTracking": {
                    list0 = this.u.f();
                    break;
                }
                case "IconClickTracking": {
                    list0 = this.u.n();
                    break;
                }
                case "IconViewTracking": {
                    list0 = this.u.o();
                    break;
                }
                case "VideoClicks": {
                    list0 = this.u.b();
                    break;
                }
                case "close": {
                    list0 = this.u.c();
                    break;
                }
                case "complete": {
                    list0 = this.u.h();
                    if(!this.w) {
                        list0.add(this.E);
                        this.w = true;
                    }
                    break;
                }
                case "creativeView": {
                    list0 = this.u.g();
                    break;
                }
                case "pause": {
                    list0 = this.u.r();
                    break;
                }
                case "resume": {
                    list0 = this.u.t();
                    break;
                }
                case "skip": {
                    list0 = this.u.v();
                    break;
                }
                default: {
                    list0 = null;
                }
            }
            if(list0 != null) {
                for(int v = 0; v <= list0.size() - 1; ++v) {
                    t t0 = this.s;
                    Context context0 = (Context)this.a.get();
                    String s1 = (String)list0.get(v);
                    t0.a(context0, com.igaworks.ssp.t.e.s, s1);
                }
            }
            if(s.equalsIgnoreCase("VideoClicks") || s.equalsIgnoreCase("CompanionClickTracking") || s.equalsIgnoreCase("IconClickTracking")) {
                this.a();
            }
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
    }

    private void a(boolean z) {
        try {
            int v = this.i.getCurrentPosition();
            int v1 = 0;
            if(this.J != -1 || v != 0) {
                if(this.D != null) {
                    for(int v2 = 0; v2 <= this.D.size() - 1; ++v2) {
                        v0 v00 = (v0)this.D.get(v2);
                        long v3 = v00.a();
                        if(v3 <= ((long)v) && v3 > ((long)this.J) && !v00.c()) {
                            this.s.a(((Context)this.a.get()), com.igaworks.ssp.t.e.s, v00.b());
                            v00.a(true);
                        }
                        if(z && !v00.c()) {
                            this.s.a(((Context)this.a.get()), com.igaworks.ssp.t.e.s, v00.b());
                            v00.a(true);
                        }
                    }
                }
                if(this.C != null) {
                    while(v1 <= this.C.size() - 1) {
                        z0 z00 = (z0)this.C.get(v1);
                        long v4 = (long)(((float)this.H) * z00.a());
                        if(v4 <= ((long)v) && v4 > ((long)this.J) && !z00.c()) {
                            this.s.a(((Context)this.a.get()), com.igaworks.ssp.t.e.s, z00.b());
                            z00.a(true);
                        }
                        if(z && !z00.c()) {
                            this.s.a(((Context)this.a.get()), com.igaworks.ssp.t.e.s, z00.b());
                            z00.a(true);
                        }
                        ++v1;
                    }
                }
            }
            else if(this.D != null) {
                while(v1 <= this.D.size() - 1) {
                    v0 v01 = (v0)this.D.get(v1);
                    if(v01.a() == 0L) {
                        this.s.a(((Context)this.a.get()), com.igaworks.ssp.t.e.s, v01.b());
                        v01.a(true);
                    }
                    ++v1;
                }
            }
            this.J = v;
            return;
        }
        catch(Exception exception0) {
        }
        exception0.printStackTrace();
    }

    private void b() {
        try {
            if(this.u.p() != null) {
                for(int v = 0; v <= this.u.p().size() - 1; ++v) {
                    t t0 = this.s;
                    Context context0 = (Context)this.a.get();
                    String s = (String)this.u.p().get(v);
                    t0.a(context0, com.igaworks.ssp.t.e.s, s);
                }
            }
        }
        catch(Exception unused_ex) {
        }
    }

    public Drawable buildRatingBarDrawables() {
        Drawable[] arr_drawable = new Drawable[3];
        for(int v1 = 0; v1 < 3; ++v1) {
            switch(v1) {
                case 0: {
                    ShapeDrawable shapeDrawable0 = new ShapeDrawable();
                    shapeDrawable0.getPaint().setColor(-1);
                    arr_drawable[0] = new ClipDrawable(shapeDrawable0, 3, 1);
                    break;
                }
                case 1: {
                    ShapeDrawable shapeDrawable1 = new ShapeDrawable();
                    shapeDrawable1.getPaint().setColor(-1);
                    arr_drawable[1] = new ClipDrawable(shapeDrawable1, 3, 1);
                    break;
                }
                case 2: {
                    ShapeDrawable shapeDrawable2 = new ShapeDrawable();
                    shapeDrawable2.getPaint().setColor(Color.parseColor("#1e90ff"));
                    arr_drawable[2] = new ClipDrawable(shapeDrawable2, 3, 1);
                }
            }
        }
        Drawable drawable0 = new LayerDrawable(arr_drawable);
        for(int v = 0; v < 3; ++v) {
            ((LayerDrawable)drawable0).setId(v, new int[]{0x1020000, 0x102000F, 0x102000D}[v]);
        }
        return drawable0;
    }

    private void c() {
        try {
            this.h = new FrameLayout(((Context)this.a.get()));
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
            frameLayout$LayoutParams0.gravity = 0x30;
            this.h.setLayoutParams(frameLayout$LayoutParams0);
            this.h.setBackgroundColor(0xFF000000);
            this.setContentView(this.h);
            this.e();
        }
        catch(Exception unused_ex) {
        }
    }

    private void d() {
        double f5;
        double f4;
        int v7;
        int v6;
        try {
            b.c(Thread.currentThread(), "AdPopcornSSPVideoActivity initVideoSetting : minimumViewTimeSec : " + this.M);
            long v = this.u.j();
            this.H = v;
            if(this.v) {
                this.I = 0;
                this.G = false;
            }
            else {
                int v1 = this.M;
                if(v1 != 0) {
                    this.I = v < ((long)(v1 * 1000)) ? 0 : v1;
                }
                else if(this.u.z()) {
                    long v2 = this.u.u();
                    this.I = (int)(v2 / 1000L);
                    int v3 = ((int)(v2 / 1000L)) * 1000;
                    if(this.H <= ((long)v3) || v3 < 0) {
                        this.I = 0;
                        this.G = true;
                    }
                }
                else {
                    this.I = 0;
                    this.G = true;
                }
            }
            if(this.B) {
                this.G = true;
            }
            this.F = this.u.q().d();
            this.D = this.u.a();
            this.C = this.u.s();
            this.K = this.u.d();
            this.L = this.u.l();
            this.b = (double)J.c(((Context)this.a.get()));
            this.c = (double)J.b(((Context)this.a.get()));
            int v4 = this.u.q().e();
            int v5 = this.u.q().c();
            double f = this.b;
            double f1 = this.c;
            double f2 = f / ((double)v4);
            double f3 = f1 / ((double)v5);
            b.c(Thread.currentThread(), "AdPopcornSSPVideoActivity landscapeMode : " + this.y + ", displayWidth : " + this.b + ", displayHeight : " + this.c + ", mediaFileWidth : " + v4 + ", mediaFileHeight : " + v5 + ", mediaRatio : " + ((double)v4) / ((double)v5) + ", displayRatio : " + f / f1 + ", widthScaleFactor : " + f2 + ", heightScaleFactor : " + f3);
            if(this.u.d() == null) {
                f4 = 0.0;
                f5 = 0.0;
                v7 = 0;
                v6 = 0;
            }
            else {
                v6 = J.a(((Context)this.a.get()), this.u.d().f());
                v7 = J.a(((Context)this.a.get()), this.u.d().c());
                f4 = this.b / ((double)v6);
                f5 = this.c / ((double)v7);
                b.c(Thread.currentThread(), "AdPopcornSSPVideoActivity companionWidth : " + v6 + ", companionHeight : " + v7 + ", companionRatio : " + ((double)v6) / ((double)v7) + ", companionWScaleFactor : " + f4 + ", companionHScaleFactor : " + f5);
            }
            this.d = this.b;
            double f6 = ((double)v5) * f2;
            if(f6 >= this.c) {
                this.d = ((double)v4) * f3;
                this.e = ((double)v5) * f3;
            }
            else {
                this.e = f6;
            }
            if(this.u.d() != null) {
                double f7 = this.b;
                if(((double)v6) > f7 || ((double)v7) > this.c) {
                    int v8 = Double.compare(v6, f7);
                    if(v8 <= 0 || ((double)v7) <= this.c) {
                        if(v8 > 0) {
                            this.f = f7;
                            this.g = ((double)v7) * f4;
                        }
                        else {
                            double f8 = this.c;
                            if(((double)v7) > f8) {
                                this.f = ((double)v6) * f5;
                                this.g = f8;
                            }
                        }
                    }
                    else if(f4 >= f5) {
                        this.f = ((double)v6) * f5;
                        this.g = ((double)v7) * f5;
                    }
                    else {
                        this.f = ((double)v6) * f4;
                        this.g = ((double)v7) * f4;
                    }
                }
                else {
                    this.f = (double)v6;
                    this.g = (double)v7;
                }
            }
            b.c(Thread.currentThread(), "AdPopcornSSPVideoActivity videoViewWidth : " + this.d + ", videoViewHeight : " + this.e);
            b.c(Thread.currentThread(), "AdPopcornSSPVideoActivity companionViewWidth : " + this.f + ", companionViewHeight : " + this.g);
        }
        catch(Exception unused_ex) {
            this.a(100);
        }
    }

    private void e() {
        class f implements View.OnClickListener {
            final AdPopcornSSPVideoActivity a;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                AdPopcornSSPVideoActivity.this.onBackPressed();
            }
        }


        class g implements View.OnClickListener {
            final AdPopcornSSPVideoActivity a;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                AdPopcornSSPVideoActivity.this.onBackPressed();
            }
        }


        class h implements com.igaworks.ssp.n.d {
            final AdPopcornSSPVideoActivity a;

            @Override  // com.igaworks.ssp.n$d
            public void a(Bitmap bitmap0) {
                AdPopcornSSPVideoActivity.this.q.setImageBitmap(bitmap0);
            }
        }


        class i implements View.OnClickListener {
            final AdPopcornSSPVideoActivity a;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                if(AdPopcornSSPVideoActivity.this.u.e() != null) {
                    try {
                        AdPopcornSSPVideoActivity.this.a("CompanionClickTracking");
                        ((Context)AdPopcornSSPVideoActivity.this.a.get()).startActivity(new Intent("android.intent.action.VIEW", Uri.parse(AdPopcornSSPVideoActivity.this.u.e())));
                    }
                    catch(Exception unused_ex) {
                    }
                }
            }
        }


        class j implements View.OnClickListener {
            final AdPopcornSSPVideoActivity a;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                if(AdPopcornSSPVideoActivity.this.u.m() != null) {
                    try {
                        ((Context)AdPopcornSSPVideoActivity.this.a.get()).startActivity(new Intent("android.intent.action.VIEW", Uri.parse(AdPopcornSSPVideoActivity.this.u.m())));
                        AdPopcornSSPVideoActivity.this.a("IconClickTracking");
                    }
                    catch(Exception exception0) {
                        exception0.printStackTrace();
                    }
                }
            }
        }


        class k implements com.igaworks.ssp.n.d {
            final AdPopcornSSPVideoActivity a;

            @Override  // com.igaworks.ssp.n$d
            public void a(Bitmap bitmap0) {
                AdPopcornSSPVideoActivity.this.l.setImageBitmap(bitmap0);
            }
        }

        int v1;
        this.i = new c(((Context)this.a.get()), ((int)this.d), ((int)this.e));
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(((int)this.b), ((int)this.c));
        frameLayout$LayoutParams0.gravity = 17;
        this.i.setLayoutParams(frameLayout$LayoutParams0);
        this.g();
        this.h.addView(this.i);
        this.j = new ProgressBar(((Context)this.a.get()), null, 0x1010078);
        FrameLayout.LayoutParams frameLayout$LayoutParams1 = new FrameLayout.LayoutParams(-1, J.a(((Context)this.a.get()), 8));
        frameLayout$LayoutParams1.gravity = 80;
        this.j.setLayoutParams(frameLayout$LayoutParams1);
        this.j.setBackgroundColor(0xFF000000);
        this.j.setProgressDrawable(this.buildRatingBarDrawables());
        int v = 0;
        this.j.setProgress(0);
        this.o = new TextView(((Context)this.a.get()));
        FrameLayout.LayoutParams frameLayout$LayoutParams2 = new FrameLayout.LayoutParams(-2, J.a(((Context)this.a.get()), 24));
        frameLayout$LayoutParams2.gravity = 53;
        frameLayout$LayoutParams2.topMargin = J.a(((Context)this.a.get()), 19);
        frameLayout$LayoutParams2.rightMargin = J.a(((Context)this.a.get()), 19);
        this.o.setLayoutParams(frameLayout$LayoutParams2);
        this.o.setTextColor(-1);
        this.o.setGravity(17);
        this.o.setTextSize(0, ((float)J.a(((Context)this.a.get()), 16)));
        this.o.setVisibility(4);
        this.m = new ImageView(((Context)this.a.get()));
        FrameLayout.LayoutParams frameLayout$LayoutParams3 = new FrameLayout.LayoutParams(J.a(((Context)this.a.get()), 26), J.a(((Context)this.a.get()), 26));
        frameLayout$LayoutParams3.topMargin = J.a(((Context)this.a.get()), 14);
        frameLayout$LayoutParams3.rightMargin = J.a(((Context)this.a.get()), 14);
        frameLayout$LayoutParams3.gravity = 53;
        this.m.setImageResource(mipmap.ic_close_btn);
        this.m.setLayoutParams(frameLayout$LayoutParams3);
        this.m.setVisibility(4);
        this.m.setOnClickListener((/* 缺少LAMBDA参数 */) -> {
            b.c(Thread.currentThread(), "AdPopcornSSPVideoActivity onBackPressed : " + AdPopcornSSPVideoActivity.this.B + ", possibleToClose : " + AdPopcornSSPVideoActivity.this.G);
            if(!AdPopcornSSPVideoActivity.this.B && AdPopcornSSPVideoActivity.this.v) {
                return;
            }
            if(AdPopcornSSPVideoActivity.this.G) {
                super.onBackPressed();
                if(!AdPopcornSSPVideoActivity.this.B) {
                    AdPopcornSSPVideoActivity.this.a("skip");
                }
                AdPopcornSSPVideoActivity.this.A = true;
            }
        });
        this.n = new ImageView(((Context)this.a.get()));
        FrameLayout.LayoutParams frameLayout$LayoutParams4 = new FrameLayout.LayoutParams(J.a(((Context)this.a.get()), 50), J.a(((Context)this.a.get()), 50));
        frameLayout$LayoutParams4.gravity = 53;
        this.n.setLayoutParams(frameLayout$LayoutParams4);
        this.n.setVisibility(4);
        this.n.setOnClickListener((/* 缺少LAMBDA参数 */) -> {
            b.c(Thread.currentThread(), "AdPopcornSSPVideoActivity onBackPressed : " + AdPopcornSSPVideoActivity.this.B + ", possibleToClose : " + AdPopcornSSPVideoActivity.this.G);
            if(!AdPopcornSSPVideoActivity.this.B && AdPopcornSSPVideoActivity.this.v) {
                return;
            }
            if(AdPopcornSSPVideoActivity.this.G) {
                super.onBackPressed();
                if(!AdPopcornSSPVideoActivity.this.B) {
                    AdPopcornSSPVideoActivity.this.a("skip");
                }
                AdPopcornSSPVideoActivity.this.A = true;
            }
        });
        this.h.addView(this.m);
        this.h.addView(this.n);
        this.h.addView(this.j);
        this.h.addView(this.o);
        G g0 = this.K;
        if(g0 != null) {
            if(g0.e() != null) {
                this.q = new ImageView(((Context)this.a.get()));
                FrameLayout.LayoutParams frameLayout$LayoutParams5 = new FrameLayout.LayoutParams(((int)this.f), ((int)this.g));
                frameLayout$LayoutParams5.gravity = 17;
                this.q.setLayoutParams(frameLayout$LayoutParams5);
                n.a(((Context)this.a.get()), this.K.e(), this.q, this.K.f(), this.K.c(), new h(this));
                this.q.setVisibility(8);
                this.q.setOnClickListener(new i(this));
                this.h.addView(this.q);
            }
            else if(this.K.d() != null) {
                if(this.p == null) {
                    this.p = new NonLeakingWebView(((Context)this.a.get()));
                }
                FrameLayout.LayoutParams frameLayout$LayoutParams6 = new FrameLayout.LayoutParams(((int)this.f), ((int)this.g));
                frameLayout$LayoutParams6.gravity = 17;
                this.p.setLayoutParams(frameLayout$LayoutParams6);
                this.p.setDrawingCacheEnabled(false);
                this.p.destroyDrawingCache();
                this.p.setBackgroundColor(0);
                this.p.getSettings().setJavaScriptEnabled(true);
                this.p.setVerticalScrollBarEnabled(false);
                this.p.setVerticalScrollbarOverlay(false);
                this.p.setHorizontalScrollBarEnabled(false);
                this.p.setHorizontalScrollbarOverlay(false);
                this.p.setDrawingCacheEnabled(true);
                this.p.setOnTouchListener(this.P);
                this.p.setWebViewClient(this.Q);
                this.p.getSettings().setDefaultTextEncodingName("UTF-8");
                this.p.getSettings().setAllowFileAccess(true);
                this.p.setVisibility(8);
                this.p.loadDataWithBaseURL(null, this.K.d() + "<style>html,body{overflow:hidden;position:relative;width:100%;height:100%;margin:0;padding:0}</style>", "text/html", "UTF-8", null);
                this.h.addView(this.p);
            }
        }
        if(this.L != null) {
            try {
                this.k = new LinearLayout(((Context)this.a.get()));
                FrameLayout.LayoutParams frameLayout$LayoutParams7 = new FrameLayout.LayoutParams(((int)this.d), ((int)this.e));
                frameLayout$LayoutParams7.gravity = 17;
                this.k.setBackgroundColor(0);
                this.k.setOrientation(0);
                this.k.setLayoutParams(frameLayout$LayoutParams7);
                ImageView imageView0 = new ImageView(((Context)this.a.get()));
                this.l = imageView0;
                imageView0.setBackgroundColor(0xFFFF0000);
                LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(this.L.f(), this.L.c());
                if(this.L.g() != null && !this.L.g().contains("left")) {
                    v1 = this.L.g().contains("right") ? ((int)this.d) - this.L.f() : Integer.parseInt(this.L.g());
                }
                else {
                    v1 = 0;
                }
                if(this.L.h() != null && !this.L.h().contains("top")) {
                    v = this.L.h().contains("bottom") ? ((int)this.e) - this.L.c() : Integer.parseInt(this.L.h());
                }
                linearLayout$LayoutParams0.leftMargin = v1;
                linearLayout$LayoutParams0.topMargin = v;
                this.l.setLayoutParams(linearLayout$LayoutParams0);
                this.l.setOnClickListener(new j(this));
                this.k.addView(this.l);
                this.k.setVisibility(4);
                n.a(((Context)this.a.get()), this.L.d(), this.l, this.L.f(), this.L.c(), new k(this));
                this.h.addView(this.k);
                return;
            }
            catch(Exception exception0) {
            }
            exception0.printStackTrace();
        }
    }

    private void f() {
        if(this.y) {
            this.getWindow().setFlags(0x400, 0x400);
            try {
                this.setRequestedOrientation(6);
            }
            catch(Exception unused_ex) {
                this.setRequestedOrientation(0);
            }
            return;
        }
        this.setRequestedOrientation(1);
    }

    private void g() {
        class com.igaworks.ssp.part.video.activity.AdPopcornSSPVideoActivity.a implements MediaPlayer.OnErrorListener {
            final AdPopcornSSPVideoActivity a;

            @Override  // android.media.MediaPlayer$OnErrorListener
            public boolean onError(MediaPlayer mediaPlayer0, int v, int v1) {
                b.c(Thread.currentThread(), "AdPopcornSSPVideoActivity onError");
                AdPopcornSSPVideoActivity.this.a(false);
                AdPopcornSSPVideoActivity.this.o.setVisibility(8);
                AdPopcornSSPVideoActivity.this.m.setVisibility(0);
                AdPopcornSSPVideoActivity.this.n.setVisibility(0);
                AdPopcornSSPVideoActivity.this.a(405);
                return true;
            }
        }


        class com.igaworks.ssp.part.video.activity.AdPopcornSSPVideoActivity.b implements View.OnClickListener {
            final AdPopcornSSPVideoActivity a;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                b.c(Thread.currentThread(), "AdPopcornSSPVideoActivity nativeVideoPlayer clicked");
                AdPopcornSSPVideoActivity.this.a("VideoClicks");
                try {
                    if(AdPopcornSSPVideoActivity.this.u.w() != null) {
                        ((Context)AdPopcornSSPVideoActivity.this.a.get()).startActivity(new Intent("android.intent.action.VIEW", Uri.parse(AdPopcornSSPVideoActivity.this.u.w())));
                    }
                }
                catch(Exception unused_ex) {
                }
            }
        }


        class m implements MediaPlayer.OnPreparedListener {
            final AdPopcornSSPVideoActivity a;

            @Override  // android.media.MediaPlayer$OnPreparedListener
            public void onPrepared(MediaPlayer mediaPlayer0) {
                class com.igaworks.ssp.part.video.activity.AdPopcornSSPVideoActivity.m.a implements MediaPlayer.OnSeekCompleteListener {
                    final m a;

                    @Override  // android.media.MediaPlayer$OnSeekCompleteListener
                    public void onSeekComplete(MediaPlayer mediaPlayer0) {
                        if(!AdPopcornSSPVideoActivity.this.B) {
                            b.c(Thread.currentThread(), "AdPopcornSSPVideoActivity onSeekComplete");
                            AdPopcornSSPVideoActivity.this.j();
                        }
                    }
                }

                try {
                    b.c(Thread.currentThread(), "AdPopcornSSPVideoActivity onPrepared, isMute : " + AdPopcornSSPVideoActivity.this.u.y() + ", pausedTime : " + AdPopcornSSPVideoActivity.this.N);
                    if(!AdPopcornSSPVideoActivity.this.B) {
                        if(AdPopcornSSPVideoActivity.this.u.y()) {
                            mediaPlayer0.setVolume(0.0f, 0.0f);
                        }
                        AdPopcornSSPVideoActivity.this.b();
                        AdPopcornSSPVideoActivity.this.a(false);
                        if(AdPopcornSSPVideoActivity.this.N > 0) {
                            mediaPlayer0.setOnSeekCompleteListener(new com.igaworks.ssp.part.video.activity.AdPopcornSSPVideoActivity.m.a(this));
                            mediaPlayer0.start();
                            AdPopcornSSPVideoActivity.this.i.seekTo(AdPopcornSSPVideoActivity.this.N);
                            return;
                        }
                        AdPopcornSSPVideoActivity.this.j();
                        return;
                    }
                    AdPopcornSSPVideoActivity.this.i.seekTo(AdPopcornSSPVideoActivity.this.i.getDuration() - 500);
                    AdPopcornSSPVideoActivity.this.m.setVisibility(0);
                    AdPopcornSSPVideoActivity.this.m.bringToFront();
                    AdPopcornSSPVideoActivity.this.n.setVisibility(0);
                    AdPopcornSSPVideoActivity.this.n.bringToFront();
                }
                catch(Exception unused_ex) {
                }
            }
        }


        class com.igaworks.ssp.part.video.activity.AdPopcornSSPVideoActivity.n implements MediaPlayer.OnCompletionListener {
            final AdPopcornSSPVideoActivity a;

            @Override  // android.media.MediaPlayer$OnCompletionListener
            public void onCompletion(MediaPlayer mediaPlayer0) {
                try {
                    b.c(Thread.currentThread(), "AdPopcornSSPVideoActivity onCompletion");
                    AdPopcornSSPVideoActivity.this.x = false;
                    AdPopcornSSPVideoActivity.this.B = true;
                    AdPopcornSSPVideoActivity.this.G = true;
                    AdPopcornSSPVideoActivity.this.a(true);
                    AdPopcornSSPVideoActivity.this.a("complete");
                    if(AdPopcornSSPVideoActivity.this.j != null) {
                        AdPopcornSSPVideoActivity.this.j.setProgress(((int)AdPopcornSSPVideoActivity.this.H));
                        AdPopcornSSPVideoActivity.this.j.setVisibility(8);
                    }
                    if(AdPopcornSSPVideoActivity.this.o != null) {
                        AdPopcornSSPVideoActivity.this.o.setVisibility(8);
                    }
                    if(AdPopcornSSPVideoActivity.this.k != null) {
                        AdPopcornSSPVideoActivity.this.k.setVisibility(8);
                    }
                    if(AdPopcornSSPVideoActivity.this.u.d() == null) {
                        int v = AdPopcornSSPVideoActivity.this.i.getDuration();
                        AdPopcornSSPVideoActivity.this.i.seekTo(v - 500);
                    }
                    else {
                        AdPopcornSSPVideoActivity.this.i.setVisibility(4);
                        AdPopcornSSPVideoActivity.this.h();
                    }
                    AdPopcornSSPVideoActivity.this.m.setVisibility(0);
                    AdPopcornSSPVideoActivity.this.m.bringToFront();
                    AdPopcornSSPVideoActivity.this.n.setVisibility(0);
                    AdPopcornSSPVideoActivity.this.n.bringToFront();
                    if(AdPopcornSSPVideoActivity.this.v && m0.b().c() != null) {
                        m0.b().f();
                    }
                }
                catch(Exception unused_ex) {
                }
            }
        }

        this.i.setOnPreparedListener(new m(this));
        this.i.setOnCompletionListener(new com.igaworks.ssp.part.video.activity.AdPopcornSSPVideoActivity.n(this));
        this.i.setOnErrorListener(new com.igaworks.ssp.part.video.activity.AdPopcornSSPVideoActivity.a(this));
        this.i.setOnClickListener(new com.igaworks.ssp.part.video.activity.AdPopcornSSPVideoActivity.b(this));
    }

    private void h() {
        NonLeakingWebView nonLeakingWebView0 = this.p;
        if(nonLeakingWebView0 == null) {
            ImageView imageView0 = this.q;
            if(imageView0 != null) {
                imageView0.setVisibility(0);
                this.q.bringToFront();
            }
        }
        else {
            nonLeakingWebView0.setVisibility(0);
            this.p.bringToFront();
        }
        this.a("creativeView");
    }

    private void i() {
        class com.igaworks.ssp.part.video.activity.AdPopcornSSPVideoActivity.c implements Runnable {
            final AdPopcornSSPVideoActivity a;

            @Override
            public void run() {
                try {
                    AdPopcornSSPVideoActivity.this.a(false);
                    int v = AdPopcornSSPVideoActivity.this.i.getCurrentPosition();
                    int v1 = (int)((AdPopcornSSPVideoActivity.this.H - ((long)v)) / 1000L + 1L);
                    if(AdPopcornSSPVideoActivity.this.o != null) {
                        if(v1 <= 0 || v < 0) {
                            AdPopcornSSPVideoActivity.this.o.setVisibility(8);
                            AdPopcornSSPVideoActivity.this.m.setVisibility(0);
                            AdPopcornSSPVideoActivity.this.n.setVisibility(0);
                        }
                        else if(Math.abs(AdPopcornSSPVideoActivity.this.H - ((long)v)) < 300L) {
                            AdPopcornSSPVideoActivity.this.o.setVisibility(8);
                            v1 = 0;
                        }
                        else if(AdPopcornSSPVideoActivity.this.I <= 0) {
                            AdPopcornSSPVideoActivity.this.o.setText(v1 + "");
                            AdPopcornSSPVideoActivity.this.o.setVisibility(0);
                            AdPopcornSSPVideoActivity.this.o.bringToFront();
                            AdPopcornSSPVideoActivity.this.m.setVisibility(8);
                            AdPopcornSSPVideoActivity.this.n.setVisibility(8);
                        }
                        else if(v / 1000 - AdPopcornSSPVideoActivity.this.I < 0) {
                            AdPopcornSSPVideoActivity.this.o.setText(AdPopcornSSPVideoActivity.this.I - v / 1000 + "");
                            AdPopcornSSPVideoActivity.this.o.setVisibility(0);
                            AdPopcornSSPVideoActivity.this.o.bringToFront();
                            AdPopcornSSPVideoActivity.this.m.setVisibility(8);
                            AdPopcornSSPVideoActivity.this.n.setVisibility(8);
                        }
                        else {
                            AdPopcornSSPVideoActivity.this.o.setVisibility(8);
                        }
                    }
                    if(AdPopcornSSPVideoActivity.this.I > 0 && AdPopcornSSPVideoActivity.this.I - v / 1000 <= 0) {
                        AdPopcornSSPVideoActivity.this.G = true;
                        AdPopcornSSPVideoActivity.this.m.setVisibility(0);
                        AdPopcornSSPVideoActivity.this.n.setVisibility(0);
                        AdPopcornSSPVideoActivity.this.o.setVisibility(8);
                    }
                    if(AdPopcornSSPVideoActivity.this.I == 0 && !AdPopcornSSPVideoActivity.this.v) {
                        AdPopcornSSPVideoActivity.this.G = true;
                        AdPopcornSSPVideoActivity.this.m.setVisibility(0);
                        AdPopcornSSPVideoActivity.this.n.setVisibility(0);
                        AdPopcornSSPVideoActivity.this.o.setVisibility(8);
                    }
                    if(AdPopcornSSPVideoActivity.this.j != null && v > 0) {
                        AdPopcornSSPVideoActivity.this.j.setProgress(v);
                    }
                    if(AdPopcornSSPVideoActivity.this.t != null && v1 > 0) {
                        AdPopcornSSPVideoActivity.this.i.postDelayed(AdPopcornSSPVideoActivity.this.t, 100L);
                        return;
                    }
                    if(AdPopcornSSPVideoActivity.this.j != null) {
                        AdPopcornSSPVideoActivity.this.j.setProgress(((int)AdPopcornSSPVideoActivity.this.H));
                    }
                }
                catch(Exception exception0) {
                    exception0.printStackTrace();
                }
            }
        }

        if(this.t != null) {
            this.t = null;
        }
        com.igaworks.ssp.part.video.activity.AdPopcornSSPVideoActivity.c adPopcornSSPVideoActivity$c0 = new com.igaworks.ssp.part.video.activity.AdPopcornSSPVideoActivity.c(this);
        this.t = adPopcornSSPVideoActivity$c0;
        adPopcornSSPVideoActivity$c0.run();
    }

    private void j() {
        this.i.start();
        this.i();
        this.x = true;
        if(this.H >= ((long)this.i.getDuration())) {
            this.H = (long)this.i.getDuration();
        }
        this.j.setMax(((int)this.H));
        LinearLayout linearLayout0 = this.k;
        if(linearLayout0 != null) {
            linearLayout0.setVisibility(0);
            this.a("IconViewTracking");
        }
    }

    // 检测为 Lambda 实现
    @Override  // android.app.Activity
    public void onBackPressed() [...]

    @Override  // android.app.Activity
    public void onConfigurationChanged(Configuration configuration0) {
        c c0 = this.i;
        if(c0 == null) {
            b.c(Thread.currentThread(), "AdPopcornSSPVideoActivity onConfigurationChanged");
        }
        else {
            this.N = c0.getCurrentPosition();
            b.c(Thread.currentThread(), "AdPopcornSSPVideoActivity onConfigurationChanged pausedTime : " + this.N);
        }
        super.onConfigurationChanged(configuration0);
        this.d();
        this.c();
        if(this.u != null && this.u.q() != null) {
            String s = n.a(((Context)this.a.get()), this.F, true);
            if(s != null) {
                b.c(Thread.currentThread(), "AdPopcornSSPVideoActivity isLocalFileExist path : " + s);
                this.i.setVideoPath(s);
                return;
            }
            b.c(Thread.currentThread(), "AdPopcornSSPVideoActivity isLocalFileExist false");
            this.i.setVideoURI(Uri.parse(this.F));
        }
    }

    @Override  // android.app.Activity
    protected void onCreate(Bundle bundle0) {
        boolean z2;
        super.onCreate(bundle0);
        this.a = new WeakReference(this);
        Window window0 = this.getWindow();
        int v = Build.VERSION.SDK_INT;
        boolean z = false;
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
        try {
            this.G = false;
            Intent intent0 = this.getIntent();
            this.u = (B0)intent0.getSerializableExtra("vast_video_setting");
            boolean z1 = intent0.getBooleanExtra("is_reward_video_type", false);
            this.v = z1;
            if(z1) {
                this.E = intent0.getStringExtra("reward_video_complete_url");
            }
            this.y = intent0.getBooleanExtra("is_video_landscape_mode", false);
            this.O = this.u.x();
            Configuration configuration0 = ((Context)this.a.get()).getResources().getConfiguration();
        }
        catch(Exception exception0) {
            goto label_51;
        }
        if(configuration0 == null) {
            z2 = true;
        }
        else if(configuration0.orientation == 1) {
            z2 = false;
        }
        else {
            z2 = true;
        }
        try {
            GradientDrawable gradientDrawable0 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0x66000000, 0x66000000});
            this.r = gradientDrawable0;
            gradientDrawable0.setShape(1);
            this.r.setGradientType(0);
            this.r.setStroke(3, Color.parseColor("#ffffffff"));
            this.s = E.g().d();
            this.J = -1;
            this.A = false;
            this.M = this.u.i();
            this.N = 0;
            goto label_53;
        }
        catch(Exception exception1) {
            z = z2;
            exception0 = exception1;
        }
    label_51:
        exception0.printStackTrace();
        z2 = z;
    label_53:
        this.f();
        if(z2 == this.y) {
            this.d();
            this.c();
            if(this.u != null && this.u.q() != null) {
                String s = n.a(((Context)this.a.get()), this.F, true);
                if(s != null) {
                    b.c(Thread.currentThread(), "AdPopcornSSPVideoActivity isLocalFileExist path : " + s);
                    this.i.setVideoPath(s);
                    return;
                }
                b.c(Thread.currentThread(), "AdPopcornSSPVideoActivity isLocalFileExist false");
                this.i.setVideoURI(Uri.parse(this.F));
            }
        }
        else {
            b.c(Thread.currentThread(), "AdPopcornSSPVideoActivity screen orientation change");
        }
    }

    @Override  // android.app.Activity
    public void onDestroy() {
        if(!this.v) {
            if(S.c().b() != null) {
                S.c().a(1);
            }
        }
        else if(m0.b().c() != null) {
            m0.b().e();
        }
        c c0 = this.i;
        if(c0 != null) {
            c0.stopPlayback();
            this.i = null;
            this.x = false;
        }
        this.a("close");
        super.onDestroy();
    }

    @Override  // android.app.Activity
    public void onPause() {
        b.c(Thread.currentThread(), "AdPopcornSSPVideoActivity onPause");
        super.onPause();
        if(!this.A && !this.B) {
            this.a("pause");
            c c0 = this.i;
            if(c0 != null) {
                this.N = c0.getCurrentPosition();
                b.c(Thread.currentThread(), "AdPopcornSSPVideoActivity pausedTime : " + this.N);
            }
        }
        c c1 = this.i;
        if(c1 != null) {
            c1.pause();
        }
        TextView textView0 = this.o;
        if(textView0 != null) {
            textView0.removeCallbacks(this.t);
        }
        if(this.t != null) {
            this.t = null;
        }
    }

    @Override  // android.app.Activity
    public void onResume() {
        b.c(Thread.currentThread(), "AdPopcornSSPVideoActivity onResume : isOnceCompleted : " + this.B + ", isVideoAdPlaying : " + this.x);
        super.onResume();
        if(!this.B && this.x && this.i != null) {
            this.i();
            this.x = true;
            this.a("resume");
            this.i.resume();
        }
    }
}

