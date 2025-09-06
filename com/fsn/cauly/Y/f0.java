package com.fsn.cauly.Y;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings.ZoomDensity;
import android.webkit.WebView.WebViewTransport;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RequiresApi;
import com.fsn.cauly.blackdragoncore.utils.g.b;
import com.fsn.cauly.blackdragoncore.utils.g;
import com.fsn.cauly.blackdragoncore.utils.j;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class f0 extends WebView {
    public interface e {
        boolean a(String arg1);

        void b(int arg1, String arg2);

        void b(String arg1);

        boolean c();

        boolean c(String arg1);

        boolean d(String arg1);

        void e();

        boolean e(String arg1);

        boolean f(String arg1);

        boolean g(String arg1);
    }

    WeakReference a;
    boolean b;
    final int c;
    private Context d;
    private boolean e;

    public f0(Context context0) {
        super(context0);
        this.c = 0;
        this.e = false;
        this.d = context0;
    }

    public int a(String s) {
        if(this.a != null && this.a.get() != null && !((e)this.a.get()).c()) {
            return 2;
        }
        if(s != null && s.startsWith("https://play.google.com/store/apps/details?id=")) {
            s = s.replace("https://play.google.com/store/apps/details?id=", "market://details?id=");
        }
        if(s != null && !s.startsWith("http")) {
            if(s.startsWith("intent:")) {
                return 2;
            }
            Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse(s));
            intent0.addCategory("android.intent.category.BROWSABLE");
            if(com.fsn.cauly.blackdragoncore.e.a().b()) {
                intent0.addFlags(0x34000000);
            }
            if(!this.getContext().getPackageManager().queryIntentActivities(intent0, 0x10000).isEmpty()) {
                if(this.getContext() instanceof Activity) {
                    try {
                        intent0.setPackage("com.android.vending");
                        ((Activity)this.getContext()).startActivity(intent0);
                    }
                    catch(Exception unused_ex) {
                        intent0.setPackage(null);
                        ((Activity)this.getContext()).startActivity(intent0);
                    }
                    return 1;
                }
                intent0.setPackage("com.android.vending");
                intent0.addFlags(0x10000000);
                this.getContext().getApplicationContext().startActivity(intent0);
                return 1;
            }
            return 2;
        }
        return 0;
    }

    public void a(boolean z, boolean z1, int v, boolean z2, boolean z3) {
        class c implements View.OnTouchListener {
            final f0 a;

            @Override  // android.view.View$OnTouchListener
            public boolean onTouch(View view0, MotionEvent motionEvent0) {
                return false;
            }
        }


        class d implements DownloadListener {
            final f0 a;

            @Override  // android.webkit.DownloadListener
            public void onDownloadStart(String s, String s1, String s2, String s3, long v) {
                f0.this.g(s);
            }
        }

        if(z) {
            this.getSettings().setJavaScriptEnabled(true);
            this.getSettings().setBuiltInZoomControls(false);
            this.getSettings().setUseWideViewPort(true);
            this.getSettings().setDomStorageEnabled(true);
            this.setVerticalScrollBarEnabled(false);
            this.setHorizontalScrollBarEnabled(false);
            this.setOnTouchListener(new c(this));
        }
        else {
            this.getSettings().setJavaScriptEnabled(true);
            this.getSettings().setLoadWithOverviewMode(true);
            this.getSettings().setUseWideViewPort(false);
            if(z2) {
                this.getSettings().setUseWideViewPort(true);
            }
            this.getSettings().setDomStorageEnabled(true);
            this.setVerticalScrollBarEnabled(false);
            this.setHorizontalScrollBarEnabled(false);
            this.getSettings().setBuiltInZoomControls(false);
            this.getSettings().setSupportZoom(false);
            this.getSettings().setSupportMultipleWindows(true);
            this.setDownloadListener((String s, /* 缺少LAMBDA参数 */, /* 缺少LAMBDA参数 */, /* 缺少LAMBDA参数 */, /* 缺少LAMBDA参数 */) -> {
                WeakReference weakReference0 = f0.this.a;
                if(weakReference0 == null) {
                    return false;
                }
                e f0$e0 = (e)weakReference0.get();
                return f0$e0 == null ? false : f0$e0.e(s);
            });
        }
        if(!z3) {
            this.getSettings().setTextZoom(100);
        }
        if(j.a(this.d, "ssl", false)) {
            this.getSettings().setMixedContentMode(0);
        }
        if(v > 0 && !z2) {
            this.setInitialScale(v);
        }
        if(z1) {
            this.getSettings().setDefaultZoom(WebSettings.ZoomDensity.FAR);
        }
        this.getSettings().setCacheMode(2);
    }

    public void b(String s, boolean z, boolean z1, int v, boolean z2, boolean z3) {
        g.a(b.e, "WebView URL : " + s);
        if(s != null && s.startsWith("http")) {
            this.f(z, z1, v, z2, z3);
            if(this.e) {
                HashMap hashMap0 = new HashMap();
                hashMap0.put("X-Requested-With", "");
                this.loadUrl(s, hashMap0);
                return;
            }
            this.loadUrl(s);
            return;
        }
        if(s != null) {
            this.c(s, z, z1, v, z2, z3);
        }
    }

    void c(String s, boolean z, boolean z1, int v, boolean z2, boolean z3) {
        g.a(b.e, "WebView Load Data : " + s);
        this.f(z, z1, v, z2, z3);
        try {
            this.loadData(Base64.encodeToString(s.getBytes("UTF-8"), 0), "text/html; charset=utf-8", "base64");
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            unsupportedEncodingException0.printStackTrace();
        }
    }

    private boolean d(WebView webView0, String s) {
        WeakReference weakReference0 = this.a;
        if(weakReference0 != null) {
            e f0$e0 = (e)weakReference0.get();
            if(f0$e0 != null && f0$e0.c(s)) {
                return true;
            }
        }
        if(this.a(s) == 1) {
            WeakReference weakReference1 = this.a;
            if(weakReference1 == null) {
                return true;
            }
            e f0$e1 = (e)weakReference1.get();
            if(f0$e1 != null) {
                f0$e1.b(s);
            }
            return true;
        }
        if(webView0 != null) {
            try {
                Matcher matcher0 = Pattern.compile("^(https?:\\/\\/)((\\w+\\.)?(youtube.com)|(youtu.be))").matcher(s);
                Matcher matcher1 = Pattern.compile("cauly_action_param=open_browser").matcher(s);
                Matcher matcher2 = Pattern.compile("cauly_action_param=open_youtube").matcher(s);
                Matcher matcher3 = Pattern.compile("cauly_action_param=open_player").matcher(s);
                if(s.startsWith("https://play.google.com/store/apps/details?id=")) {
                    s = s.replace("https://play.google.com/store/apps/details?id=", "market://details?id=");
                }
                else if(!s.startsWith("https://play.google.com/store/apps/category/") && !s.startsWith("https://play.google.com/store/apps/editors_choice") && !s.startsWith("https://play.google.com/store/apps/top") && !s.startsWith("https://play.google.com/store/apps/collection")) {
                }
                else {
                    return this.i(s);
                }
                if(matcher2.find()) {
                    return this.j(s);
                }
                if(!matcher0.find() && !matcher1.find()) {
                    if(matcher3.find()) {
                        return this.h(s);
                    }
                    return s.startsWith("http://") || s.startsWith("https://") ? false : this.g(s);
                }
                return this.g(s);
            }
            catch(Exception exception0) {
            }
            g.a(b.b, exception0.getMessage());
        }
        return true;
    }

    void f(boolean z, boolean z1, int v, boolean z2, boolean z3) {
        class a extends WebChromeClient {
            final f0 a;

            @Override  // android.webkit.WebChromeClient
            public boolean onCreateWindow(WebView webView0, boolean z, boolean z1, Message message0) {
                class com.fsn.cauly.Y.f0.a.a extends WebViewClient {
                    final a a;

                    @Override  // android.webkit.WebViewClient
                    @RequiresApi(24)
                    public boolean shouldOverrideUrlLoading(WebView webView0, WebResourceRequest webResourceRequest0) {
                        WeakReference weakReference0 = f0.this.a;
                        if(weakReference0 != null) {
                            e f0$e0 = (e)weakReference0.get();
                            if(f0$e0 != null) {
                                String s = webResourceRequest0.getUrl().toString();
                                return f0$e0.d(s) ? true : f0.this.d(webView0, s);
                            }
                        }
                        return true;
                    }

                    @Override  // android.webkit.WebViewClient
                    public boolean shouldOverrideUrlLoading(WebView webView0, String s) {
                        WeakReference weakReference0 = f0.this.a;
                        if(weakReference0 != null) {
                            e f0$e0 = (e)weakReference0.get();
                            return f0$e0 == null || f0$e0.d(s) ? true : f0.this.d(webView0, s);
                        }
                        return true;
                    }
                }

                if(z1) {
                    try {
                        WebView webView1 = new WebView(f0.this.getContext());
                        webView0.addView(webView1);
                        ((WebView.WebViewTransport)message0.obj).setWebView(webView1);
                        message0.sendToTarget();
                        webView1.setWebViewClient(new com.fsn.cauly.Y.f0.a.a(this));
                    }
                    catch(Exception unused_ex) {
                    }
                }
                return true;
            }

            @Override  // android.webkit.WebChromeClient
            public boolean onJsAlert(WebView webView0, String s, String s1, JsResult jsResult0) {
                return true;
            }
        }


        class com.fsn.cauly.Y.f0.b extends WebViewClient {
            final f0 a;

            @Override  // android.webkit.WebViewClient
            public void onPageFinished(WebView webView0, String s) {
                super.onPageFinished(webView0, s);
                f0 f00 = f0.this;
                if(f00.b) {
                    return;
                }
                f00.b = true;
                WeakReference weakReference0 = f00.a;
                if(weakReference0 == null) {
                    return;
                }
                e f0$e0 = (e)weakReference0.get();
                if(f0$e0 == null) {
                    return;
                }
                f0$e0.e();
            }

            @Override  // android.webkit.WebViewClient
            public void onPageStarted(WebView webView0, String s, Bitmap bitmap0) {
                super.onPageStarted(webView0, s, bitmap0);
                if(f0.this.a(s) == 1) {
                    WeakReference weakReference0 = f0.this.a;
                    if(weakReference0 == null) {
                        return;
                    }
                    e f0$e0 = (e)weakReference0.get();
                    if(f0$e0 != null) {
                        f0$e0.b(s);
                    }
                }
            }

            @Override  // android.webkit.WebViewClient
            public void onReceivedError(WebView webView0, int v, String s, String s1) {
                f0 f00 = f0.this;
                if(f00.b) {
                    return;
                }
                f00.b = true;
                WeakReference weakReference0 = f00.a;
                if(weakReference0 == null) {
                    return;
                }
                e f0$e0 = (e)weakReference0.get();
                if(f0$e0 == null) {
                    return;
                }
                f0$e0.b(v, s);
            }

            @Override  // android.webkit.WebViewClient
            @RequiresApi(24)
            public boolean shouldOverrideUrlLoading(WebView webView0, WebResourceRequest webResourceRequest0) {
                String s = webResourceRequest0.getUrl().toString();
                return f0.this.d(webView0, s);
            }

            @Override  // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView0, String s) {
                return f0.this.d(webView0, s);
            }
        }

        this.a(z, z1, v, z2, z3);
        this.setWebChromeClient(new a(this));
        this.setWebViewClient(new com.fsn.cauly.Y.f0.b(this));
    }

    // 检测为 Lambda 实现
    boolean g(String s) [...]

    boolean h(String s) {
        WeakReference weakReference0 = this.a;
        if(weakReference0 == null) {
            return false;
        }
        e f0$e0 = (e)weakReference0.get();
        return f0$e0 == null ? false : f0$e0.g(s);
    }

    boolean i(String s) {
        WeakReference weakReference0 = this.a;
        if(weakReference0 == null) {
            return false;
        }
        e f0$e0 = (e)weakReference0.get();
        return f0$e0 == null ? false : f0$e0.f(s);
    }

    boolean j(String s) {
        WeakReference weakReference0 = this.a;
        if(weakReference0 == null) {
            return false;
        }
        e f0$e0 = (e)weakReference0.get();
        return f0$e0 == null ? false : f0$e0.a(s);
    }

    public void setHidePackageName(boolean z) {
        this.e = z;
    }

    public void setListener(e f0$e0) {
        this.a = new WeakReference(f0$e0);
    }
}

