package com.igaworks.ssp.part.contents.activity;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnShowListener;
import android.content.DialogInterface;
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
import android.widget.Toast;
import androidx.core.view.E0;
import androidx.core.view.F0;
import com.igaworks.ssp.AdSize;
import com.igaworks.ssp.E;
import com.igaworks.ssp.H;
import com.igaworks.ssp.J;
import com.igaworks.ssp.L;
import com.igaworks.ssp.R.string;
import com.igaworks.ssp.SSPErrorCode;
import com.igaworks.ssp.b;
import com.igaworks.ssp.l;
import com.igaworks.ssp.p;
import com.igaworks.ssp.part.NonLeakingWebView;
import com.igaworks.ssp.part.banner.AdPopcornSSPBannerAd;
import com.igaworks.ssp.part.banner.listener.IBannerEventCallbackListener;
import com.igaworks.ssp.part.contents.dialog.AdPopcornSSPStartAdDialog;
import com.igaworks.ssp.part.custom.AdPopcornSSPReactNativeAd;
import com.igaworks.ssp.part.custom.listener.IReactNativeAdEventCallbackListener;
import com.igaworks.ssp.s0;
import com.igaworks.ssp.t.e;
import com.igaworks.ssp.t;
import org.json.JSONObject;

public class AdPopcornSSPContentsAdActivity extends Activity implements L {
    class g implements View.OnTouchListener {
        private float a;
        private float b;
        private int c;
        final AdPopcornSSPContentsAdActivity d;

        g() {
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
                        AdPopcornSSPContentsAdActivity.this.g = true;
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

    class h extends WebViewClient {
        final AdPopcornSSPContentsAdActivity a;

        private boolean a(WebView webView0, String s) {
            b.c(Thread.currentThread(), "mIsClicked : " + AdPopcornSSPContentsAdActivity.this.g + ", urlLoading : " + s);
            if(AdPopcornSSPContentsAdActivity.this.g && s != null) {
                AdPopcornSSPContentsAdActivity.this.g = false;
                Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse(s));
                intent0.addFlags(0x10000000);
                AdPopcornSSPContentsAdActivity.this.c.startActivity(intent0);
                return true;
            }
            webView0.loadUrl(s);
            return false;
        }

        @Override  // android.webkit.WebViewClient
        public void onPageFinished(WebView webView0, String s) {
            super.onPageFinished(webView0, s);
            b.c(Thread.currentThread(), "onPageFinished : " + s);
            AdPopcornSSPContentsAdActivity.this.g = false;
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

    static abstract class i {
        static final int[] a;

        static {
            int[] arr_v = new int[e.values().length];
            i.a = arr_v;
            try {
                arr_v[e.z.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                i.a[e.A.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private final String a;
    private final String b;
    private Context c;
    FrameLayout d;
    LinearLayout e;
    private NonLeakingWebView f;
    private boolean g;
    private boolean h;
    private String i;
    private String j;
    private String k;
    private boolean l;
    private AdPopcornSSPStartAdDialog m;
    private t n;
    private View.OnTouchListener o;
    private WebViewClient p;

    public AdPopcornSSPContentsAdActivity() {
        this.a = "AdPopcornSSPContentsAdActivity";
        this.b = "APSSPContents";
        this.g = false;
        this.h = false;
        this.i = "";
        this.j = "";
        this.k = "";
        this.l = false;
        this.o = new g(this);
        this.p = new h(this);
    }

    private View a() {
        FrameLayout frameLayout0 = new FrameLayout(this.c);
        this.d = frameLayout0;
        frameLayout0.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout0 = new LinearLayout(this.c);
        linearLayout0.setOrientation(1);
        linearLayout0.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.d.addView(linearLayout0);
        this.f = new NonLeakingWebView(this);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
        this.f.setLayoutParams(frameLayout$LayoutParams0);
        WebView.setWebContentsDebuggingEnabled(true);
        this.f.getSettings().setJavaScriptEnabled(true);
        this.f.setWebViewClient(this.p);
        this.f.setVerticalScrollBarEnabled(false);
        this.f.setVerticalScrollbarOverlay(false);
        this.f.setHorizontalScrollBarEnabled(false);
        this.f.setHorizontalScrollbarOverlay(false);
        this.f.setBackgroundColor(-1);
        this.f.setOnTouchListener(this.o);
        this.f.getSettings().setDefaultTextEncodingName("UTF-8");
        this.f.getSettings().setAllowFileAccess(true);
        this.f.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.f.getSettings().setDomStorageEnabled(true);
        this.f.getSettings().setDatabaseEnabled(true);
        this.f.getSettings().setCacheMode(2);
        this.f.clearCache(true);
        this.f.addJavascriptInterface(this, "APSSPContents");
        WebView.setWebContentsDebuggingEnabled(true);
        linearLayout0.addView(this.f);
        LinearLayout linearLayout1 = new LinearLayout(this.c);
        this.e = linearLayout1;
        linearLayout1.setOrientation(1);
        this.e.setGravity(80);
        this.e.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.d.addView(this.e);
        return this.d;
    }

    // 检测为 Lambda 实现
    private static WindowInsets a(View view0, WindowInsets windowInsets0) [...]

    // 去混淆评级： 低(20)
    private String a(String s, String s1) {
        return "window.dispatchEvent(\n   new CustomEvent(\"" + s + "\", {\n" + "           detail: {\n" + "               data: " + s1 + "\n" + "           }\n" + "       }\n" + "   )\n" + ");";
    }

    private void a(l l0) {
        class d implements Runnable {
            final l a;
            final AdPopcornSSPContentsAdActivity b;

            d(l l0) {
                this.a = l0;
                super();
            }

            @Override
            public void run() {
                class a implements IBannerEventCallbackListener {
                    final AdPopcornSSPBannerAd a;
                    final d b;

                    a(AdPopcornSSPBannerAd adPopcornSSPBannerAd0) {
                        this.a = adPopcornSSPBannerAd0;
                        super();
                    }

                    @Override  // com.igaworks.ssp.part.banner.listener.IBannerEventCallbackListener
                    public void OnBannerAdClicked() {
                    }

                    @Override  // com.igaworks.ssp.part.banner.listener.IBannerEventCallbackListener
                    public void OnBannerAdReceiveFailed(SSPErrorCode sSPErrorCode0) {
                        class c implements DialogInterface.OnDismissListener {
                            final a a;

                            @Override  // android.content.DialogInterface$OnDismissListener
                            public void onDismiss(DialogInterface dialogInterface0) {
                                AdPopcornSSPBannerAd adPopcornSSPBannerAd0 = a.this.a;
                                if(adPopcornSSPBannerAd0 != null) {
                                    adPopcornSSPBannerAd0.stopAd();
                                }
                            }
                        }


                        class com.igaworks.ssp.part.contents.activity.AdPopcornSSPContentsAdActivity.d.a.d implements DialogInterface.OnShowListener {
                            final a a;

                            @Override  // android.content.DialogInterface$OnShowListener
                            public void onShow(DialogInterface dialogInterface0) {
                            }
                        }

                        try {
                            int v = J.a(AdPopcornSSPContentsAdActivity.this.c);
                            AdPopcornSSPStartAdDialog adPopcornSSPStartAdDialog0 = new AdPopcornSSPStartAdDialog(AdPopcornSSPContentsAdActivity.this.c, this.a, d.this.a, v);
                            AdPopcornSSPContentsAdActivity.this.m = adPopcornSSPStartAdDialog0;
                            AdPopcornSSPContentsAdActivity.this.m.setCancelable(true);
                            AdPopcornSSPContentsAdActivity.this.m.setOnDismissListener(new c(this));
                            AdPopcornSSPContentsAdActivity.this.m.setOnShowListener(new com.igaworks.ssp.part.contents.activity.AdPopcornSSPContentsAdActivity.d.a.d(this));
                            if(AdPopcornSSPContentsAdActivity.this.m != null && !AdPopcornSSPContentsAdActivity.this.isFinishing()) {
                                AdPopcornSSPContentsAdActivity.this.m.show();
                            }
                        }
                        catch(Exception unused_ex) {
                        }
                    }

                    @Override  // com.igaworks.ssp.part.banner.listener.IBannerEventCallbackListener
                    public void OnBannerAdReceiveSuccess() {
                        class com.igaworks.ssp.part.contents.activity.AdPopcornSSPContentsAdActivity.d.a.a implements DialogInterface.OnDismissListener {
                            final a a;

                            @Override  // android.content.DialogInterface$OnDismissListener
                            public void onDismiss(DialogInterface dialogInterface0) {
                                AdPopcornSSPBannerAd adPopcornSSPBannerAd0 = a.this.a;
                                if(adPopcornSSPBannerAd0 != null) {
                                    adPopcornSSPBannerAd0.stopAd();
                                }
                            }
                        }


                        class com.igaworks.ssp.part.contents.activity.AdPopcornSSPContentsAdActivity.d.a.b implements DialogInterface.OnShowListener {
                            final a a;

                            @Override  // android.content.DialogInterface$OnShowListener
                            public void onShow(DialogInterface dialogInterface0) {
                            }
                        }

                        try {
                            int v = J.a(AdPopcornSSPContentsAdActivity.this.c);
                            AdPopcornSSPStartAdDialog adPopcornSSPStartAdDialog0 = new AdPopcornSSPStartAdDialog(AdPopcornSSPContentsAdActivity.this.c, this.a, d.this.a, v);
                            AdPopcornSSPContentsAdActivity.this.m = adPopcornSSPStartAdDialog0;
                            AdPopcornSSPContentsAdActivity.this.m.setCancelable(true);
                            com.igaworks.ssp.part.contents.activity.AdPopcornSSPContentsAdActivity.d.a.a adPopcornSSPContentsAdActivity$d$a$a0 = new com.igaworks.ssp.part.contents.activity.AdPopcornSSPContentsAdActivity.d.a.a(this);
                            AdPopcornSSPContentsAdActivity.this.m.setOnDismissListener(adPopcornSSPContentsAdActivity$d$a$a0);
                            com.igaworks.ssp.part.contents.activity.AdPopcornSSPContentsAdActivity.d.a.b adPopcornSSPContentsAdActivity$d$a$b0 = new com.igaworks.ssp.part.contents.activity.AdPopcornSSPContentsAdActivity.d.a.b(this);
                            AdPopcornSSPContentsAdActivity.this.m.setOnShowListener(adPopcornSSPContentsAdActivity$d$a$b0);
                            if(AdPopcornSSPContentsAdActivity.this.m != null && !AdPopcornSSPContentsAdActivity.this.isFinishing()) {
                                AdPopcornSSPContentsAdActivity.this.m.show();
                            }
                        }
                        catch(Exception unused_ex) {
                        }
                    }
                }


                class com.igaworks.ssp.part.contents.activity.AdPopcornSSPContentsAdActivity.d.b implements IReactNativeAdEventCallbackListener {
                    final AdPopcornSSPReactNativeAd a;
                    final d b;

                    com.igaworks.ssp.part.contents.activity.AdPopcornSSPContentsAdActivity.d.b(AdPopcornSSPReactNativeAd adPopcornSSPReactNativeAd0) {
                        this.a = adPopcornSSPReactNativeAd0;
                        super();
                    }

                    @Override  // com.igaworks.ssp.part.custom.listener.IReactNativeAdEventCallbackListener
                    public void onClicked() {
                    }

                    @Override  // com.igaworks.ssp.part.custom.listener.IReactNativeAdEventCallbackListener
                    public void onImpression() {
                    }

                    @Override  // com.igaworks.ssp.part.custom.listener.IReactNativeAdEventCallbackListener
                    public void onReactNativeAdLoadFailed(SSPErrorCode sSPErrorCode0) {
                        class com.igaworks.ssp.part.contents.activity.AdPopcornSSPContentsAdActivity.d.b.c implements DialogInterface.OnDismissListener {
                            final com.igaworks.ssp.part.contents.activity.AdPopcornSSPContentsAdActivity.d.b a;

                            @Override  // android.content.DialogInterface$OnDismissListener
                            public void onDismiss(DialogInterface dialogInterface0) {
                                AdPopcornSSPReactNativeAd adPopcornSSPReactNativeAd0 = com.igaworks.ssp.part.contents.activity.AdPopcornSSPContentsAdActivity.d.b.this.a;
                                if(adPopcornSSPReactNativeAd0 != null) {
                                    adPopcornSSPReactNativeAd0.destroy();
                                }
                            }
                        }


                        class com.igaworks.ssp.part.contents.activity.AdPopcornSSPContentsAdActivity.d.b.d implements DialogInterface.OnShowListener {
                            final com.igaworks.ssp.part.contents.activity.AdPopcornSSPContentsAdActivity.d.b a;

                            @Override  // android.content.DialogInterface$OnShowListener
                            public void onShow(DialogInterface dialogInterface0) {
                            }
                        }

                        try {
                            int v = J.a(AdPopcornSSPContentsAdActivity.this.c);
                            AdPopcornSSPStartAdDialog adPopcornSSPStartAdDialog0 = new AdPopcornSSPStartAdDialog(AdPopcornSSPContentsAdActivity.this.c, this.a, d.this.a, v);
                            AdPopcornSSPContentsAdActivity.this.m = adPopcornSSPStartAdDialog0;
                            AdPopcornSSPContentsAdActivity.this.m.setCancelable(true);
                            com.igaworks.ssp.part.contents.activity.AdPopcornSSPContentsAdActivity.d.b.c adPopcornSSPContentsAdActivity$d$b$c0 = new com.igaworks.ssp.part.contents.activity.AdPopcornSSPContentsAdActivity.d.b.c(this);
                            AdPopcornSSPContentsAdActivity.this.m.setOnDismissListener(adPopcornSSPContentsAdActivity$d$b$c0);
                            com.igaworks.ssp.part.contents.activity.AdPopcornSSPContentsAdActivity.d.b.d adPopcornSSPContentsAdActivity$d$b$d0 = new com.igaworks.ssp.part.contents.activity.AdPopcornSSPContentsAdActivity.d.b.d(this);
                            AdPopcornSSPContentsAdActivity.this.m.setOnShowListener(adPopcornSSPContentsAdActivity$d$b$d0);
                            if(AdPopcornSSPContentsAdActivity.this.m != null && !AdPopcornSSPContentsAdActivity.this.isFinishing()) {
                                AdPopcornSSPContentsAdActivity.this.m.show();
                            }
                        }
                        catch(Exception unused_ex) {
                        }
                    }

                    @Override  // com.igaworks.ssp.part.custom.listener.IReactNativeAdEventCallbackListener
                    public void onReactNativeAdLoadSuccess(int v, int v1, int v2) {
                        class com.igaworks.ssp.part.contents.activity.AdPopcornSSPContentsAdActivity.d.b.a implements DialogInterface.OnDismissListener {
                            final com.igaworks.ssp.part.contents.activity.AdPopcornSSPContentsAdActivity.d.b a;

                            @Override  // android.content.DialogInterface$OnDismissListener
                            public void onDismiss(DialogInterface dialogInterface0) {
                                AdPopcornSSPReactNativeAd adPopcornSSPReactNativeAd0 = com.igaworks.ssp.part.contents.activity.AdPopcornSSPContentsAdActivity.d.b.this.a;
                                if(adPopcornSSPReactNativeAd0 != null) {
                                    adPopcornSSPReactNativeAd0.destroy();
                                }
                            }
                        }


                        class com.igaworks.ssp.part.contents.activity.AdPopcornSSPContentsAdActivity.d.b.b implements DialogInterface.OnShowListener {
                            final com.igaworks.ssp.part.contents.activity.AdPopcornSSPContentsAdActivity.d.b a;

                            @Override  // android.content.DialogInterface$OnShowListener
                            public void onShow(DialogInterface dialogInterface0) {
                            }
                        }

                        try {
                            int v3 = J.a(AdPopcornSSPContentsAdActivity.this.c);
                            AdPopcornSSPStartAdDialog adPopcornSSPStartAdDialog0 = new AdPopcornSSPStartAdDialog(AdPopcornSSPContentsAdActivity.this.c, this.a, d.this.a, v3);
                            AdPopcornSSPContentsAdActivity.this.m = adPopcornSSPStartAdDialog0;
                            AdPopcornSSPContentsAdActivity.this.m.setCancelable(true);
                            com.igaworks.ssp.part.contents.activity.AdPopcornSSPContentsAdActivity.d.b.a adPopcornSSPContentsAdActivity$d$b$a0 = new com.igaworks.ssp.part.contents.activity.AdPopcornSSPContentsAdActivity.d.b.a(this);
                            AdPopcornSSPContentsAdActivity.this.m.setOnDismissListener(adPopcornSSPContentsAdActivity$d$b$a0);
                            com.igaworks.ssp.part.contents.activity.AdPopcornSSPContentsAdActivity.d.b.b adPopcornSSPContentsAdActivity$d$b$b0 = new com.igaworks.ssp.part.contents.activity.AdPopcornSSPContentsAdActivity.d.b.b(this);
                            AdPopcornSSPContentsAdActivity.this.m.setOnShowListener(adPopcornSSPContentsAdActivity$d$b$b0);
                            if(AdPopcornSSPContentsAdActivity.this.m != null && !AdPopcornSSPContentsAdActivity.this.isFinishing()) {
                                AdPopcornSSPContentsAdActivity.this.m.show();
                            }
                        }
                        catch(Exception unused_ex) {
                        }
                    }
                }


                class com.igaworks.ssp.part.contents.activity.AdPopcornSSPContentsAdActivity.d.c implements IBannerEventCallbackListener {
                    final d a;

                    @Override  // com.igaworks.ssp.part.banner.listener.IBannerEventCallbackListener
                    public void OnBannerAdClicked() {
                    }

                    @Override  // com.igaworks.ssp.part.banner.listener.IBannerEventCallbackListener
                    public void OnBannerAdReceiveFailed(SSPErrorCode sSPErrorCode0) {
                        b.c(Thread.currentThread(), "OnBannerAdReceiveFailed : " + sSPErrorCode0.getErrorMessage());
                    }

                    @Override  // com.igaworks.ssp.part.banner.listener.IBannerEventCallbackListener
                    public void OnBannerAdReceiveSuccess() {
                    }
                }


                class com.igaworks.ssp.part.contents.activity.AdPopcornSSPContentsAdActivity.d.d implements IReactNativeAdEventCallbackListener {
                    final d a;

                    @Override  // com.igaworks.ssp.part.custom.listener.IReactNativeAdEventCallbackListener
                    public void onClicked() {
                    }

                    @Override  // com.igaworks.ssp.part.custom.listener.IReactNativeAdEventCallbackListener
                    public void onImpression() {
                    }

                    @Override  // com.igaworks.ssp.part.custom.listener.IReactNativeAdEventCallbackListener
                    public void onReactNativeAdLoadFailed(SSPErrorCode sSPErrorCode0) {
                    }

                    @Override  // com.igaworks.ssp.part.custom.listener.IReactNativeAdEventCallbackListener
                    public void onReactNativeAdLoadSuccess(int v, int v1, int v2) {
                    }
                }

                try {
                    switch(this.a.b()) {
                        case 3: {
                            goto label_37;
                        }
                        case 4: {
                            goto label_57;
                        }
                        default: {
                            switch(this.a.b()) {
                                case 5: {
                                    break;
                                }
                                case 6: {
                                    goto label_25;
                                }
                                default: {
                                    return;
                                }
                            }
                        }
                    }
                }
                catch(Exception exception0) {
                    exception0.printStackTrace();
                    return;
                }
                try {
                    if(AdPopcornSSPContentsAdActivity.this.e.getChildCount() > 0) {
                        AdPopcornSSPContentsAdActivity.this.e.removeAllViewsInLayout();
                    }
                }
                catch(Exception unused_ex) {
                }
                try {
                    AdPopcornSSPBannerAd adPopcornSSPBannerAd0 = new AdPopcornSSPBannerAd(AdPopcornSSPContentsAdActivity.this.c);
                    LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
                    linearLayout$LayoutParams0.gravity = 80;
                    adPopcornSSPBannerAd0.setLayoutParams(linearLayout$LayoutParams0);
                    b.c(Thread.currentThread(), "contentsModel bannerSize : " + this.a.c());
                    if(this.a.c() == 2) {
                        adPopcornSSPBannerAd0.setAdSize(AdSize.BANNER_300x250);
                    }
                    else {
                        switch(this.a.c()) {
                            case 3: {
                                adPopcornSSPBannerAd0.setAdSize(AdSize.BANNER_320x100);
                                break;
                            }
                            case 4: {
                                adPopcornSSPBannerAd0.setAdSize(AdSize.BANNER_ADAPTIVE_SIZE);
                                break;
                            }
                            default: {
                                adPopcornSSPBannerAd0.setAdSize(AdSize.BANNER_320x50);
                            }
                        }
                    }
                    adPopcornSSPBannerAd0.setPlacementAppKey(this.a.h());
                    adPopcornSSPBannerAd0.setPlacementId(this.a.i());
                    adPopcornSSPBannerAd0.setBannerEventCallbackListener(new com.igaworks.ssp.part.contents.activity.AdPopcornSSPContentsAdActivity.d.c(this));
                    AdPopcornSSPContentsAdActivity.this.e.addView(adPopcornSSPBannerAd0);
                    adPopcornSSPBannerAd0.loadAd();
                }
                catch(Exception exception0) {
                    exception0.printStackTrace();
                }
                return;
                try {
                label_25:
                    if(AdPopcornSSPContentsAdActivity.this.e.getChildCount() > 0) {
                        AdPopcornSSPContentsAdActivity.this.e.removeAllViewsInLayout();
                    }
                }
                catch(Exception unused_ex) {
                }
                try {
                    AdPopcornSSPReactNativeAd adPopcornSSPReactNativeAd0 = new AdPopcornSSPReactNativeAd(AdPopcornSSPContentsAdActivity.this.c);
                    LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-1, -2);
                    linearLayout$LayoutParams1.gravity = 80;
                    adPopcornSSPReactNativeAd0.setLayoutParams(linearLayout$LayoutParams1);
                    adPopcornSSPReactNativeAd0.setPlacementAppKey(this.a.h());
                    adPopcornSSPReactNativeAd0.setPlacementId(this.a.i());
                    adPopcornSSPReactNativeAd0.setReactNativeAdEventCallbackListener(new com.igaworks.ssp.part.contents.activity.AdPopcornSSPContentsAdActivity.d.d(this));
                    AdPopcornSSPContentsAdActivity.this.e.addView(adPopcornSSPReactNativeAd0);
                    adPopcornSSPReactNativeAd0.loadAd();
                    return;
                label_37:
                    AdPopcornSSPBannerAd adPopcornSSPBannerAd1 = new AdPopcornSSPBannerAd(AdPopcornSSPContentsAdActivity.this.c);
                    if(this.a.c() == 1) {
                        adPopcornSSPBannerAd1.setAdSize(AdSize.BANNER_320x50);
                    }
                    else {
                        switch(this.a.c()) {
                            case 2: {
                                adPopcornSSPBannerAd1.setAdSize(AdSize.BANNER_300x250);
                                break;
                            }
                            case 3: {
                                adPopcornSSPBannerAd1.setAdSize(AdSize.BANNER_320x100);
                                break;
                            }
                            default: {
                                adPopcornSSPBannerAd1.setAdSize(AdSize.BANNER_ADAPTIVE_SIZE);
                            }
                        }
                    }
                    if(s0.b(this.a.f())) {
                        String s = AdPopcornSSPContentsAdActivity.this.c.getString(string.apssp_today_weather_reward_template_message);
                        this.a.d(s);
                    }
                    adPopcornSSPBannerAd1.setPlacementAppKey(this.a.h());
                    adPopcornSSPBannerAd1.setPlacementId(this.a.i());
                    adPopcornSSPBannerAd1.setBannerEventCallbackListener(new a(this, adPopcornSSPBannerAd1));
                    if(AdPopcornSSPContentsAdActivity.this.m != null && AdPopcornSSPContentsAdActivity.this.m.isShowing()) {
                        AdPopcornSSPContentsAdActivity.this.m.dismiss();
                    }
                    adPopcornSSPBannerAd1.loadAd();
                    return;
                label_57:
                    AdPopcornSSPReactNativeAd adPopcornSSPReactNativeAd1 = new AdPopcornSSPReactNativeAd(AdPopcornSSPContentsAdActivity.this.c);
                    adPopcornSSPReactNativeAd1.setPlacementAppKey(this.a.h());
                    adPopcornSSPReactNativeAd1.setPlacementId(this.a.i());
                    adPopcornSSPReactNativeAd1.setReactNativeAdEventCallbackListener(new com.igaworks.ssp.part.contents.activity.AdPopcornSSPContentsAdActivity.d.b(this, adPopcornSSPReactNativeAd1));
                    if(AdPopcornSSPContentsAdActivity.this.m != null && AdPopcornSSPContentsAdActivity.this.m.isShowing()) {
                        AdPopcornSSPContentsAdActivity.this.m.dismiss();
                    }
                    adPopcornSSPReactNativeAd1.loadAd();
                    return;
                }
                catch(Exception exception0) {
                }
                exception0.printStackTrace();
            }
        }

        try {
            this.f.post(new d(this, l0));
        }
        catch(Exception unused_ex) {
        }
    }

    private void a(String s) {
        class com.igaworks.ssp.part.contents.activity.AdPopcornSSPContentsAdActivity.c implements Runnable {
            final String a;
            final AdPopcornSSPContentsAdActivity b;

            com.igaworks.ssp.part.contents.activity.AdPopcornSSPContentsAdActivity.c(String s) {
                this.a = s;
                super();
            }

            @Override
            public void run() {
                try {
                    if(!AdPopcornSSPContentsAdActivity.this.isFinishing()) {
                        Toast.makeText(AdPopcornSSPContentsAdActivity.this.c, this.a, 1).show();
                    }
                }
                catch(Exception unused_ex) {
                }
            }
        }

        try {
            this.f.post(new com.igaworks.ssp.part.contents.activity.AdPopcornSSPContentsAdActivity.c(this, s));
        }
        catch(Exception unused_ex) {
        }
    }

    private void a(String s, long v, String s1) {
        try {
            this.callEvent("{Result:true, EventName:\'campaignCompleted\', EventParam:\'" + s + "\', ResultMessage:\'success\'}");
            H.a().a(this.j).a(v, s1);
        }
        catch(Exception unused_ex) {
        }
    }

    private void a(String s, l l0) {
        JSONObject jSONObject0;
        if(s == null || s.length() <= 0) {
            this.a(this.c.getString(string.apssp_default_unknown_error));
        }
        else {
            try {
                b.a(Thread.currentThread(), "callbackCompleteReward result = " + s);
                jSONObject0 = new JSONObject(s);
                boolean z = jSONObject0.getBoolean("Result");
                int v = jSONObject0.getInt("ResultCode");
                String s1 = jSONObject0.getString("ResultMsg");
                if(!z) {
                    if(v == 2000) {
                        this.a(this.c.getString(string.apssp_already_get_reward));
                        return;
                    }
                    this.a(s1);
                    return;
                }
            }
            catch(Exception unused_ex) {
                this.a(this.c.getString(string.apssp_default_error));
                return;
            }
            try {
                this.a(l0.a(), l0.g(), new JSONObject(jSONObject0.getString("Data")).getString("RewardKey"));
            }
            catch(Exception unused_ex) {
            }
        }
    }

    private void b() {
        try {
            String s = String.format("https://dailyssp.adpopcorn.com/s%s?placementId=%s&usn=%s&platform=android&sdkVersion=%s&adid=%s", this.i, this.j, this.k, "3.8.2", "");
            b.c(Thread.currentThread(), "loadPage : " + s);
            this.f.loadUrl(s);
            this.d();
        }
        catch(Exception unused_ex) {
        }
    }

    private void b(String s, l l0) {
        if(s != null && s.length() > 0) {
            try {
                b.a(Thread.currentThread(), "callbackCompleteRewardAndLoadAd result = " + s);
                JSONObject jSONObject0 = new JSONObject(s);
                boolean z = jSONObject0.getBoolean("Result");
                int v = jSONObject0.getInt("ResultCode");
                String s1 = jSONObject0.getString("ResultMsg");
                if(z) {
                    if(s0.b(l0.f())) {
                        l0.d(this.c.getString(string.apssp_today_weather_reward_template_message));
                    }
                    try {
                        this.a(l0.a(), l0.g(), new JSONObject(jSONObject0.getString("Data")).getString("RewardKey"));
                    }
                    catch(Exception unused_ex) {
                    }
                }
                else if(v == 2000) {
                    l0.d(this.c.getString(string.apssp_already_get_reward));
                }
                else {
                    l0.d(s1);
                }
                this.a(l0);
            }
            catch(Exception unused_ex) {
            }
        }
    }

    private void c() {
        try {
            H.a().a(this.j).a();
        }
        catch(Exception unused_ex) {
        }
    }

    public void callEvent(String s) {
        class com.igaworks.ssp.part.contents.activity.AdPopcornSSPContentsAdActivity.b implements Runnable {
            final String a;
            final AdPopcornSSPContentsAdActivity b;

            com.igaworks.ssp.part.contents.activity.AdPopcornSSPContentsAdActivity.b(String s) {
                this.a = s;
                super();
            }

            @Override
            public void run() {
                AdPopcornSSPContentsAdActivity.this.f.evaluateJavascript(AdPopcornSSPContentsAdActivity.this.a("NativeEvent", (this.a == null ? this.a : this.a.replace("\n", "<br>"))), null);
            }
        }

        b.c(Thread.currentThread(), "callEvent : " + s);
        this.f.post(new com.igaworks.ssp.part.contents.activity.AdPopcornSSPContentsAdActivity.b(this, s));
    }

    public void callJavascript(String s) {
        class com.igaworks.ssp.part.contents.activity.AdPopcornSSPContentsAdActivity.a implements Runnable {
            final String a;
            final AdPopcornSSPContentsAdActivity b;

            com.igaworks.ssp.part.contents.activity.AdPopcornSSPContentsAdActivity.a(String s) {
                this.a = s;
                super();
            }

            @Override
            public void run() {
                AdPopcornSSPContentsAdActivity.this.f.evaluateJavascript(this.a, null);
            }
        }

        try {
            b.c(Thread.currentThread(), "callJavascript : " + s);
            NonLeakingWebView nonLeakingWebView0 = this.f;
            if(nonLeakingWebView0 != null) {
                nonLeakingWebView0.post(new com.igaworks.ssp.part.contents.activity.AdPopcornSSPContentsAdActivity.a(this, s));
            }
        }
        catch(Exception unused_ex) {
        }
    }

    @JavascriptInterface
    public void closeContents() {
        try {
            b.c(Thread.currentThread(), "closeContents");
            this.finish();
            this.overridePendingTransition(0, 0);
        }
        catch(Exception unused_ex) {
        }
    }

    @JavascriptInterface
    public void completeAndLoadNativeSDKAd(String s) {
        try {
            if(s == null) {
                b.c(Thread.currentThread(), "completeAndLoadNativeSDKAd jsonParameter is null");
                return;
            }
            b.c(Thread.currentThread(), "completeAndLoadNativeSDKAd = " + s);
            l l0 = p.h(s);
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("media_key", l0.d());
            jSONObject0.put("placement_id", l0.e());
            jSONObject0.put("ad_type", l0.b());
            jSONObject0.put("ad_id", l0.a());
            jSONObject0.put("usn", this.k);
            jSONObject0.put("gaid", "");
            this.n.a(this.c, e.A, this.h, jSONObject0, l0, this);
        }
        catch(Exception unused_ex) {
            this.a(this.c.getString(string.apssp_default_error));
        }
    }

    @JavascriptInterface
    public void completeCampaign(String s) {
        try {
            if(s == null) {
                b.c(Thread.currentThread(), "completeCampaign jsonParameter is null");
                return;
            }
            b.c(Thread.currentThread(), "completeCampaign = " + s);
            l l0 = p.h(s);
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("media_key", l0.d());
            jSONObject0.put("placement_id", l0.e());
            jSONObject0.put("ad_type", l0.b());
            jSONObject0.put("ad_id", l0.a());
            jSONObject0.put("usn", this.k);
            jSONObject0.put("gaid", "");
            this.n.a(this.c, e.z, this.h, jSONObject0, l0, this);
        }
        catch(Exception unused_ex) {
            this.a(this.c.getString(string.apssp_default_error));
        }
    }

    private void d() {
        try {
            H.a().a(this.j).b();
        }
        catch(Exception unused_ex) {
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

    @JavascriptInterface
    public void isTestMode(boolean z) {
        this.h = z;
    }

    @JavascriptInterface
    public void loadContentsSDKAd(String s) {
        try {
            if(s == null) {
                b.c(Thread.currentThread(), "loadContentsSDKAd jsonParameter is null");
                return;
            }
            b.c(Thread.currentThread(), "loadContentsSDKAd = " + s);
            this.a(p.h(s));
        }
        catch(Exception unused_ex) {
            this.a(this.c.getString(string.apssp_default_error));
        }
    }

    @Override  // android.app.Activity
    public void onBackPressed() {
        try {
            b.c(Thread.currentThread(), "onBackPressed");
            super.onBackPressed();
            this.overridePendingTransition(0, 0);
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // com.igaworks.ssp.L
    public void onCallback(e t$e0, String s, l l0, boolean z) {
        switch(t$e0) {
            case 1: {
                this.a(s, l0);
                return;
            }
            case 2: {
                this.b(s, l0);
            }
        }
    }

    @JavascriptInterface
    public void onContentsOpenFailed() {
        try {
            b.c(Thread.currentThread(), "onContentsOpenFailed");
            this.l = true;
        }
        catch(Exception unused_ex) {
        }
    }

    @JavascriptInterface
    public void onContentsOpenSuccess() {
        try {
            b.c(Thread.currentThread(), "onContentsOpenSuccess");
            this.l = true;
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // android.app.Activity
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.c = this;
        this.n = new t();
        try {
            Intent intent0 = this.getIntent();
            this.i = intent0.getStringExtra("appKey");
            this.j = intent0.getStringExtra("placementId");
            this.k = intent0.getStringExtra("usn");
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
        this.c();
    }

    @Override  // android.app.Activity
    public void onDetachedFromWindow() {
        class f implements Runnable {
            final AdPopcornSSPContentsAdActivity a;

            @Override
            public void run() {
                if(AdPopcornSSPContentsAdActivity.this.f != null) {
                    try {
                        AdPopcornSSPContentsAdActivity.this.f.loadUrl("about:blank");
                        AdPopcornSSPContentsAdActivity.this.f.clearDisappearingChildren();
                        AdPopcornSSPContentsAdActivity.this.f.removeAllViews();
                        if(AdPopcornSSPContentsAdActivity.this.f.getParent() != null) {
                            ((ViewGroup)AdPopcornSSPContentsAdActivity.this.f.getParent()).removeView(AdPopcornSSPContentsAdActivity.this.f);
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
            new Handler(Looper.getMainLooper()).post(new f(this));
        }
        catch(Exception exception0) {
            b.c(Thread.currentThread(), "onDetachedFromWindow" + exception0);
        }
    }

    @Override  // android.app.Activity
    protected void onPause() {
        super.onPause();
    }

    @Override  // android.app.Activity
    protected void onResume() {
        super.onResume();
        NonLeakingWebView nonLeakingWebView0 = this.f;
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
            b.c(Thread.currentThread(), "openWebBrowser = " + s);
            Intent intent0 = new Intent("android.intent.action.VIEW");
            intent0.setData(Uri.parse(s));
            this.c.startActivity(intent0);
        }
        catch(Exception unused_ex) {
        }
    }

    @JavascriptInterface
    public void toastMessage(String s) {
        class com.igaworks.ssp.part.contents.activity.AdPopcornSSPContentsAdActivity.e implements Runnable {
            final String a;
            final AdPopcornSSPContentsAdActivity b;

            com.igaworks.ssp.part.contents.activity.AdPopcornSSPContentsAdActivity.e(String s) {
                this.a = s;
                super();
            }

            @Override
            public void run() {
                try {
                    if(!AdPopcornSSPContentsAdActivity.this.isFinishing()) {
                        Toast.makeText(AdPopcornSSPContentsAdActivity.this.c, this.a, 1).show();
                    }
                }
                catch(Exception unused_ex) {
                }
            }
        }

        try {
            this.f.post(new com.igaworks.ssp.part.contents.activity.AdPopcornSSPContentsAdActivity.e(this, s));
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
    }

    @JavascriptInterface
    public void tracking(String s) {
        try {
            b.c(Thread.currentThread(), "tracking = " + s);
            E.g().d().a(this.c, e.i, s);
        }
        catch(Exception unused_ex) {
        }
    }
}

