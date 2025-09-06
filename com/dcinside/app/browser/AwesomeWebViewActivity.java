package com.dcinside.app.browser;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.DownloadManager.Request;
import android.app.DownloadManager;
import android.content.ActivityNotFoundException;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager.ResolveInfoFlags;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.MailTo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient.FileChooserParams;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebSettings;
import android.webkit.WebView.HitTestResult;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.core.content.PermissionChecker;
import androidx.core.graphics.drawable.DrawableCompat;
import com.dcinside.app.auth.OtpEnterActivity;
import com.dcinside.app.base.d;
import com.dcinside.app.browser.objects.CustomMenu;
import com.dcinside.app.browser.views.ShadowLayout;
import com.dcinside.app.browser.views.VideoEnabledWebView;
import com.dcinside.app.realm.B;
import com.dcinside.app.util.Al;
import com.dcinside.app.util.Dk;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.snackbar.Snackbar;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.single.PermissionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import y4.l;
import y4.m;

@s0({"SMAP\nAwesomeWebViewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AwesomeWebViewActivity.kt\ncom/dcinside/app/browser/AwesomeWebViewActivity\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,1837:1\n37#2,2:1838\n*S KotlinDebug\n*F\n+ 1 AwesomeWebViewActivity.kt\ncom/dcinside/app/browser/AwesomeWebViewActivity\n*L\n1758#1:1838,2\n*E\n"})
public final class AwesomeWebViewActivity extends d implements Handler.Callback, View.OnClickListener, PermissionListener {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    public final class b extends com.dcinside.app.browser.views.a {
        final AwesomeWebViewActivity i;

        public b(@l View view0, @l ViewGroup viewGroup0, @l View view1, @m WebView webView0) {
            L.p(view0, "activityNonVideoView");
            L.p(viewGroup0, "activityVideoView");
            L.p(view1, "loadingView");
            this.i = awesomeWebViewActivity0;
            super(view0, viewGroup0, view1, webView0);
        }

        @Override  // android.webkit.WebChromeClient
        public void onGeolocationPermissionsShowPrompt(@l String s, @l GeolocationPermissions.Callback geolocationPermissions$Callback0) {
            L.p(s, "origin");
            L.p(geolocationPermissions$Callback0, "callback");
            if(this.i.u5("android.permission.ACCESS_FINE_LOCATION")) {
                return;
            }
            geolocationPermissions$Callback0.invoke(s, false, false);
        }

        @Override  // android.webkit.WebChromeClient
        public void onPermissionRequest(@l PermissionRequest permissionRequest0) {
            L.p(permissionRequest0, "request");
            String[] arr_s = permissionRequest0.getResources();
            L.o(arr_s, "getResources(...)");
            for(int v = 0; v < arr_s.length; ++v) {
                String s = arr_s[v];
                if(L.g(s, "android.webkit.resource.AUDIO_CAPTURE")) {
                    if(!this.i.r4()) {
                        permissionRequest0.deny();
                        return;
                    }
                    L.m(s);
                    String[] arr_s1 = this.i.q5(new String[]{s});
                    if(this.i.u5(arr_s1[0])) {
                        return;
                    }
                }
                if(L.g(s, "android.webkit.resource.VIDEO_CAPTURE")) {
                    if(!this.i.w4()) {
                        permissionRequest0.deny();
                        return;
                    }
                    L.m(s);
                    String[] arr_s2 = this.i.q5(new String[]{s});
                    if(this.i.u5(arr_s2[0])) {
                        return;
                    }
                }
            }
            permissionRequest0.grant(permissionRequest0.getResources());
        }

        @Override  // android.webkit.WebChromeClient
        public void onProgressChanged(@l WebView webView0, int v) {
            L.p(webView0, "view");
            int v1 = this.i.I2();
            com.dcinside.app.browser.listeners.a.r(this.i, v1, v);
            if(v == 100) {
                v = 0;
            }
            this.i.k3().setProgress(v);
        }

        @Override  // android.webkit.WebChromeClient
        public void onReceivedTitle(@l WebView webView0, @l String s) {
            L.p(webView0, "view");
            L.p(s, "title");
            com.dcinside.app.browser.listeners.a.t(this.i, this.i.I2(), s);
        }

        @Override  // android.webkit.WebChromeClient
        public void onReceivedTouchIconUrl(@l WebView webView0, @l String s, boolean z) {
            L.p(webView0, "view");
            L.p(s, "url");
            com.dcinside.app.browser.listeners.a.v(this.i, this.i.I2(), s, z);
        }

        @Override  // android.webkit.WebChromeClient
        public boolean onShowFileChooser(@l WebView webView0, @l ValueCallback valueCallback0, @l WebChromeClient.FileChooserParams webChromeClient$FileChooserParams0) {
            L.p(webView0, "webView");
            L.p(valueCallback0, "filePathCallback");
            L.p(webChromeClient$FileChooserParams0, "fileChooserParams");
            this.i.B2().sendEmptyMessage(2);
            if(!this.i.u2()) {
                valueCallback0.onReceiveValue(null);
                return true;
            }
            if(this.i.u5("android.permission.READ_MEDIA_IMAGES")) {
                valueCallback0.onReceiveValue(null);
                return true;
            }
            ValueCallback valueCallback1 = this.i.x2();
            if(valueCallback1 != null) {
                valueCallback1.onReceiveValue(null);
            }
            this.i.S5(valueCallback0);
            Intent intent0 = new Intent("android.intent.action.GET_CONTENT");
            intent0.addCategory("android.intent.category.OPENABLE");
            intent0.putExtra("android.intent.extra.LOCAL_ONLY", true);
            intent0.setType("*/*");
            String[] arr_s = webChromeClient$FileChooserParams0.getAcceptTypes();
            if(arr_s == null || arr_s.length == 0) {
                arr_s = new String[]{"*/*"};
            }
            else if(TextUtils.isEmpty(arr_s[0])) {
                arr_s = new String[]{"*/*"};
            }
            intent0.putExtra("android.intent.extra.MIME_TYPES", arr_s);
            Intent intent1 = new Intent("android.intent.action.CHOOSER");
            intent1.putExtra("android.intent.extra.INTENT", intent0);
            intent1.putExtra("android.intent.extra.TITLE", this.i.getResources().getString(this.i.J3()));
            this.i.startActivityForResult(intent1, 1);
            return true;
        }
    }

    public final class c extends WebViewClient {
        final AwesomeWebViewActivity a;

        public final boolean a(@m String s) {
            return s != null && v.v2(s, "com.dcinside.app", false, 2, null);
        }

        public final void b(@l Context context0, @m String s) {
            L.p(context0, "context");
            Intent intent0 = new Intent(AwesomeWebViewActivity.this, OtpEnterActivity.class);
            intent0.putExtra("com.dcinside.app.auth.OtpEnterActivity.EXTRA_URL", s);
            context0.startActivity(intent0);
        }

        @Override  // android.webkit.WebViewClient
        public void onLoadResource(@m WebView webView0, @m String s) {
            if(webView0 != null && s != null) {
                com.dcinside.app.browser.listeners.a.j(AwesomeWebViewActivity.this, AwesomeWebViewActivity.this.I2(), s);
            }
        }

        @Override  // android.webkit.WebViewClient
        public void onPageCommitVisible(@m WebView webView0, @m String s) {
            if(webView0 != null && s != null) {
                com.dcinside.app.browser.listeners.a.l(AwesomeWebViewActivity.this, AwesomeWebViewActivity.this.I2(), s);
            }
        }

        @Override  // android.webkit.WebViewClient
        public void onPageFinished(@m WebView webView0, @m String s) {
            ProgressBar progressBar0 = AwesomeWebViewActivity.this.V4();
            int v = 8;
            if(progressBar0 != null) {
                progressBar0.setVisibility(8);
            }
            if(webView0 != null && s != null) {
                AwesomeWebViewActivity.this.setResult(-1);
                com.dcinside.app.browser.listeners.a.n(AwesomeWebViewActivity.this, AwesomeWebViewActivity.this.I2(), s);
                if(AwesomeWebViewActivity.this.b4()) {
                    AwesomeWebViewActivity.this.S3().setText(webView0.getTitle());
                }
                AwesomeWebViewActivity.this.g4().setText(com.dcinside.app.browser.helpers.d.a(s));
                AwesomeWebViewActivity.this.t5();
                if(webView0.canGoBack() || webView0.canGoForward()) {
                    boolean z = false;
                    AwesomeWebViewActivity.this.d2().setVisibility((AwesomeWebViewActivity.this.s3() ? 0 : 8));
                    AppCompatImageButton appCompatImageButton0 = AwesomeWebViewActivity.this.y2();
                    if(AwesomeWebViewActivity.this.u3()) {
                        v = 0;
                    }
                    appCompatImageButton0.setVisibility(v);
                    AwesomeWebViewActivity.this.d2().setEnabled(!AwesomeWebViewActivity.this.j2() && (AwesomeWebViewActivity.this.o3() ? webView0.canGoForward() : webView0.canGoBack()));
                    AppCompatImageButton appCompatImageButton1 = AwesomeWebViewActivity.this.y2();
                    if(!AwesomeWebViewActivity.this.l2() && (AwesomeWebViewActivity.this.o3() ? webView0.canGoBack() : webView0.canGoForward())) {
                        z = true;
                    }
                    appCompatImageButton1.setEnabled(z);
                }
                else {
                    AwesomeWebViewActivity.this.d2().setVisibility(8);
                    AwesomeWebViewActivity.this.y2().setVisibility(8);
                }
                String s1 = AwesomeWebViewActivity.this.G2();
                if(s1 != null) {
                    Boolean boolean0 = AwesomeWebViewActivity.this.H2();
                    L.m(boolean0);
                    if(boolean0.booleanValue() && !L.g(s, AwesomeWebViewActivity.this.c4())) {
                        return;
                    }
                    WebView webView1 = AwesomeWebViewActivity.this.j4();
                    L.m(webView1);
                    webView1.evaluateJavascript(s1, null);
                }
            }
        }

        @Override  // android.webkit.WebViewClient
        public void onPageStarted(@m WebView webView0, @m String s, @m Bitmap bitmap0) {
            if(AwesomeWebViewActivity.this.i3()) {
                AwesomeWebViewActivity.this.B6(false);
                WebView webView1 = AwesomeWebViewActivity.this.j4();
                if(webView1 != null) {
                    webView1.clearHistory();
                }
            }
            if(AwesomeWebViewActivity.this.C3()) {
                ProgressBar progressBar0 = AwesomeWebViewActivity.this.V4();
                if(progressBar0 != null) {
                    progressBar0.setVisibility(0);
                }
            }
            if(webView0 != null && s != null) {
                com.dcinside.app.browser.listeners.a.p(AwesomeWebViewActivity.this, AwesomeWebViewActivity.this.I2(), s);
                if(!v.W2(s, "docs.google.com", false, 2, null) && v.N1(s, ".pdf", false, 2, null)) {
                    WebView webView2 = AwesomeWebViewActivity.this.j4();
                    L.m(webView2);
                    webView2.loadUrl("http://docs.google.com/gview?embedded=true&url=" + s);
                }
            }
        }

        @Override  // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(@m WebView webView0, @m String s) {
            if(webView0 != null && s != null) {
                Context context0 = Al.h(webView0.getContext());
                AppCompatActivity appCompatActivity0 = context0 instanceof AppCompatActivity ? ((AppCompatActivity)context0) : null;
                if(appCompatActivity0 == null) {
                    ViewParent viewParent0 = webView0.getParent();
                    ViewGroup viewGroup0 = viewParent0 instanceof ViewGroup ? ((ViewGroup)viewParent0) : null;
                    Context context1 = Al.h((viewGroup0 == null ? null : viewGroup0.getContext()));
                    appCompatActivity0 = context1 instanceof AppCompatActivity ? ((AppCompatActivity)context1) : null;
                }
                ProgressBar progressBar0 = AwesomeWebViewActivity.this.V4();
                if(progressBar0 != null) {
                    progressBar0.setVisibility(8);
                }
                AwesomeWebViewActivity.this.B2().sendEmptyMessage(2);
                if(v.v2(s, "about:blank#blocked", false, 2, null)) {
                    return true;
                }
                if(v.N1(s, ".mp4", false, 2, null)) {
                    Intent intent0 = new Intent("android.intent.action.VIEW");
                    intent0.setDataAndType(Uri.parse(s), "video/*");
                    intent0.setFlags(0x10000000);
                    webView0.getContext().startActivity(intent0);
                    return true;
                }
                if(!v.v2(s, "tel:", false, 2, null) && !v.v2(s, "sms:", false, 2, null) && !v.v2(s, "smsto:", false, 2, null) && !v.v2(s, "mms:", false, 2, null) && !v.v2(s, "mmsto:", false, 2, null)) {
                    if(v.v2(s, "mailto:", false, 2, null)) {
                        MailTo mailTo0 = MailTo.parse(s);
                        Intent intent1 = new Intent("android.intent.action.SEND");
                        intent1.setType("text/html");
                        intent1.putExtra("android.intent.extra.EMAIL", new String[]{mailTo0.getTo()});
                        intent1.putExtra("android.intent.extra.SUBJECT", mailTo0.getSubject());
                        intent1.putExtra("android.intent.extra.CC", mailTo0.getCc());
                        intent1.putExtra("android.intent.extra.TEXT", mailTo0.getBody());
                        AwesomeWebViewActivity.this.startActivity(intent1);
                        return true;
                    }
                    if(com.dcinside.app.main.a.c(appCompatActivity0, s)) {
                        return true;
                    }
                    if(!v.v2(s, "http", false, 2, null) && !v.v2(s, "https", false, 2, null) && !v.v2(s, "ftp", false, 2, null)) {
                        if(v.v2(s, "intent:", false, 2, null)) {
                            try {
                                Context context2 = webView0.getContext();
                                Intent intent2 = new Intent(Intent.parseUri(s, 1));
                                intent2.addCategory("android.intent.category.BROWSABLE");
                                intent2.setComponent(null);
                                intent2.setSelector(null);
                                String s1 = intent2.getPackage();
                                PackageManager packageManager0 = context2.getPackageManager();
                                if((Build.VERSION.SDK_INT < 33 ? packageManager0.resolveActivity(intent2, 0x10000) : packageManager0.resolveActivity(intent2, PackageManager.ResolveInfoFlags.of(0x10000L))) != null) {
                                    webView0.stopLoading();
                                    if(this.a(s1)) {
                                        L.m(context2);
                                        this.b(context2, s);
                                        return true;
                                    }
                                    context2.startActivity(intent2);
                                    return true;
                                }
                                if(this.a(s1)) {
                                    String s2 = intent2.getScheme();
                                    if(s2 != null) {
                                        switch(s2) {
                                            case "dcapp": {
                                                AwesomeWebViewActivity.this.finish();
                                                return true;
                                            }
                                            case "dcauth": {
                                                L.m(context2);
                                                this.b(context2, s);
                                                break;
                                            }
                                            default: {
                                                return true;
                                            }
                                        }
                                    }
                                    return true;
                                }
                                if(!TextUtils.isEmpty(s1)) {
                                    goto label_67;
                                }
                                if(intent2.hasExtra("browser_fallback_url")) {
                                    webView0.stopLoading();
                                    String s3 = intent2.getStringExtra("browser_fallback_url");
                                    L.m(s3);
                                    webView0.loadUrl(s3);
                                    return true;
                                    try {
                                    label_67:
                                        context2.startActivity(intent2);
                                    }
                                    catch(ActivityNotFoundException unused_ex) {
                                        if(!TextUtils.isEmpty(s1)) {
                                            webView0.stopLoading();
                                            Intent intent3 = new Intent("android.intent.action.VIEW");
                                            intent3.setData(Uri.parse(("market://details?id=" + s1)));
                                            context2.startActivity(intent3);
                                        }
                                    }
                                    return true;
                                }
                            }
                            catch(Exception exception0) {
                                exception0.printStackTrace();
                            }
                            return true;
                        }
                        if(AwesomeWebViewActivity.this.q4()) {
                            try {
                                Intent intent4 = new Intent("android.intent.action.VIEW", Uri.parse(s));
                                intent4.setFlags(0x10000000);
                                webView0.getContext().startActivity(intent4);
                            }
                            catch(Exception exception1) {
                                exception1.printStackTrace();
                            }
                            return true;
                        }
                        return super.shouldOverrideUrlLoading(webView0, s);
                    }
                    Map map0 = AwesomeWebViewActivity.this.s2();
                    if(map0 != null) {
                        Boolean boolean0 = AwesomeWebViewActivity.this.t2();
                        L.m(boolean0);
                        if(!boolean0.booleanValue() || L.g(s, AwesomeWebViewActivity.this.c4())) {
                            webView0.loadUrl(s, map0);
                            return true;
                        }
                    }
                    Uri uri0 = Uri.parse(s);
                    String s4 = uri0.getQueryParameter("id");
                    if(L.g(uri0.getAuthority(), "play.google.com") && s4 != null && v.W2(s4, "apps.authenticator2", false, 2, null)) {
                        AwesomeWebViewActivity.this.n5(s4);
                        return true;
                    }
                    return super.shouldOverrideUrlLoading(webView0, s);
                }
                Intent intent5 = new Intent("android.intent.action.VIEW", Uri.parse(s));
                intent5.setFlags(0x10000000);
                webView0.getContext().startActivity(intent5);
                return true;
            }
            return false;
        }
    }

    public final class com.dcinside.app.browser.AwesomeWebViewActivity.d {
        public static final int[] a;

        static {
            int[] arr_v = new int[X.a.values().length];
            try {
                arr_v[X.a.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[X.a.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[X.a.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[X.a.d.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            com.dcinside.app.browser.AwesomeWebViewActivity.d.a = arr_v;
        }
    }

    private int A;
    private int A9;
    @m
    private String Aa;
    private int B;
    @m
    private Boolean B9;
    @m
    private String Ba;
    private int C;
    @m
    private Boolean C9;
    @m
    private String Ca;
    private int D;
    @m
    private Boolean D9;
    @m
    private String Da;
    private boolean E;
    @m
    private Boolean E9;
    @m
    private Map Ea;
    private boolean F;
    @m
    private Boolean F9;
    @m
    private Boolean Fa;
    private boolean G;
    @m
    private Boolean G9;
    @m
    private WebView Ga;
    private boolean H;
    @m
    private Boolean H9;
    @m
    private n Ha;
    private boolean I;
    @m
    private Boolean I9;
    @m
    private String Ia;
    private boolean J;
    @m
    private Integer J9;
    @m
    private String Ja;
    private boolean K;
    @m
    private Boolean K9;
    @m
    private ProgressBar Ka;
    private boolean L;
    @m
    private Boolean L9;
    public CoordinatorLayout La;
    private boolean M;
    @m
    private String M8;
    @m
    private WebSettings.LayoutAlgorithm M9;
    public AppBarLayout Ma;
    private boolean N;
    private boolean N8;
    @m
    private String N9;
    public Toolbar Na;
    private int O;
    private float O8;
    @m
    private String O9;
    public RelativeLayout Oa;
    private float P;
    @l
    private String P8;
    @m
    private String P9;
    public TextView Pa;
    private boolean Q;
    private int Q8;
    @m
    private String Q9;
    public TextView Qa;
    private boolean R8;
    @m
    private String R9;
    public AppCompatImageButton Ra;
    private float S8;
    @m
    private String S9;
    public AppCompatImageButton Sa;
    @l
    private String T8;
    @m
    private Integer T9;
    public AppCompatImageButton Ta;
    private int U8;
    @m
    private Integer U9;
    public AppCompatImageButton Ua;
    private int V8;
    @m
    private Integer V9;
    public WebChromeClient Va;
    private int W8;
    @m
    private Integer W9;
    public WebViewClient Wa;
    private int X;
    private float X8;
    @m
    private Boolean X9;
    public View Xa;
    private float Y;
    private int Y8;
    private boolean Y9;
    public View Ya;
    @m
    private X.a Z;
    private float Z8;
    private boolean Z9;
    public ProgressBar Za;
    @l
    private String a9;
    private boolean aa;
    public RelativeLayout ab;
    private int b9;
    @m
    private Boolean ba;
    public ShadowLayout bb;
    private int c9;
    @m
    private Boolean ca;
    public LinearLayout cb;
    private float d9;
    @m
    private String da;
    public LinearLayout db;
    private float e9;
    @m
    private Boolean ea;
    public TextView eb;
    private boolean f9;
    @m
    private String fa;
    public LinearLayout fb;
    private int g9;
    @m
    private Boolean ga;
    public TextView gb;
    private boolean h9;
    @m
    private Boolean ha;
    public LinearLayout hb;
    private int i9;
    @m
    private Boolean ia;
    public TextView ib;
    private boolean j9;
    @m
    private Boolean ja;
    public LinearLayout jb;
    private int k9;
    @m
    private String ka;
    public TextView kb;
    private boolean l9;
    @m
    private String la;
    public LinearLayout lb;
    private int m9;
    @m
    private Boolean ma;
    public TextView mb;
    private boolean n9;
    @m
    private Boolean na;
    public FrameLayout nb;
    private int o9;
    @m
    private Integer oa;
    public FrameLayout ob;
    private boolean p9;
    @m
    private Integer pa;
    @m
    private Dialog pb;
    private int q9;
    @m
    private Boolean qa;
    @l
    private DownloadListener qb;
    private boolean r9;
    private boolean ra;
    @l
    private Handler rb;
    private int s9;
    private boolean sa;
    private boolean sb;
    private int t9;
    private boolean ta;
    @l
    public static final a tb = null;
    private int u;
    private boolean u9;
    private boolean ua;
    public static final int ub = 1;
    private boolean v;
    private int v9;
    @m
    private String va;
    public static final int vb = 1;
    private int w;
    @l
    private List w9;
    @m
    private ValueCallback wa;
    public static final int wb = 2;
    private boolean x;
    private int x9;
    @m
    private ValueCallback xa;
    @l
    public static final String xb = "*/*";
    private int y;
    private int y9;
    @m
    private String ya;
    public static final int yb = 3080;
    private boolean z;
    private boolean z9;
    @m
    private Boolean za;
    @l
    public static final String zb = "com.dcinside.app.EXTRA_LOGIN_URL_RESULT";

    static {
        AwesomeWebViewActivity.tb = new a(null);
    }

    public AwesomeWebViewActivity() {
        this.P8 = "Roboto-Regular.ttf";
        this.T8 = "Roboto-Regular.ttf";
        this.a9 = "Roboto-Regular.ttf";
        this.w9 = u.H();
        this.aa = true;
        this.ra = true;
        this.sa = true;
        this.ta = true;
        this.ua = true;
        this.qb = (String s, String s1, String s2, String s3, long v) -> {
            L.p(this, "this$0");
            Context context0 = this.Ga == null ? null : this.Ga.getContext();
            if(context0 == null) {
                return;
            }
            try {
                DownloadManager.Request downloadManager$Request0 = new DownloadManager.Request(Uri.parse(s));
                String s4 = Uri.parse(s).getLastPathSegment();
                downloadManager$Request0.allowScanningByMediaScanner();
                downloadManager$Request0.setNotificationVisibility(1);
                downloadManager$Request0.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, "/dcinside/" + s4);
                DownloadManager downloadManager0 = (DownloadManager)ContextCompat.getSystemService(context0, DownloadManager.class);
                if(downloadManager0 != null) {
                    downloadManager0.enqueue(downloadManager$Request0);
                }
            }
            catch(Exception unused_ex) {
                this.M1("다운로드 처리중 오류가 발생하였습니다.", this);
            }
        };
        this.rb = new Handler(this);
    }

    public final boolean A2() {
        return this.N;
    }

    public final boolean A3() {
        return this.p9;
    }

    @m
    public final Boolean A4() {
        return this.ga;
    }

    public final void A5(boolean z) {
        this.z9 = z;
    }

    public final void A6(@l AppCompatImageButton appCompatImageButton0) {
        L.p(appCompatImageButton0, "<set-?>");
        this.Ua = appCompatImageButton0;
    }

    public final void A7(@l WebChromeClient webChromeClient0) {
        L.p(webChromeClient0, "<set-?>");
        this.Va = webChromeClient0;
    }

    public final void A8(@m ViewGroup viewGroup0) {
        if(viewGroup0 != null && viewGroup0.getChildCount() != 0) {
            int v = viewGroup0.getChildCount();
            for(int v1 = 0; v1 < v; ++v1) {
                View view0 = viewGroup0.getChildAt(v1);
                if(view0 instanceof TextView) {
                    ((TextView)view0).setTextColor(this.Q8);
                    ((TextView)view0).setTypeface(com.dcinside.app.browser.helpers.c.a(this, this.P8));
                    ((TextView)view0).setLineSpacing(0.0f, 1.1f);
                    ((TextView)view0).setIncludeFontPadding(false);
                }
                if(view0 instanceof ViewGroup) {
                    this.A8(((ViewGroup)view0));
                }
            }
        }
    }

    @l
    public final Handler B2() {
        return this.rb;
    }

    public final boolean B3() {
        return this.j9;
    }

    @m
    public final Integer B4() {
        return this.W9;
    }

    public final void B5(@l AppCompatImageButton appCompatImageButton0) {
        L.p(appCompatImageButton0, "<set-?>");
        this.Ra = appCompatImageButton0;
    }

    public final void B6(boolean z) {
        this.sb = z;
    }

    public final void B7(@l FrameLayout frameLayout0) {
        L.p(frameLayout0, "<set-?>");
        this.nb = frameLayout0;
    }

    public final void B8(@l ImageButton imageButton0, @DrawableRes int v) {
        L.p(imageButton0, "icon");
        StateListDrawable stateListDrawable0 = new StateListDrawable();
        Bitmap bitmap0 = com.dcinside.app.browser.helpers.a.a(this, v, this.C);
        BitmapDrawable bitmapDrawable0 = new BitmapDrawable(this.getResources(), bitmap0);
        stateListDrawable0.addState(new int[]{0x10100A7}, bitmapDrawable0);
        Bitmap bitmap1 = com.dcinside.app.browser.helpers.a.a(this, v, this.B);
        BitmapDrawable bitmapDrawable1 = new BitmapDrawable(this.getResources(), bitmap1);
        stateListDrawable0.addState(new int[]{0xFEFEFF62}, bitmapDrawable1);
        Bitmap bitmap2 = com.dcinside.app.browser.helpers.a.a(this, v, this.A);
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(this.getResources(), bitmap2);
        stateListDrawable0.addState(new int[0], bitmapDrawable2);
        imageButton0.setImageDrawable(stateListDrawable0);
    }

    public final int C2() {
        return this.A;
    }

    public final boolean C3() {
        return this.Q;
    }

    @m
    public final Integer C4() {
        return this.V9;
    }

    public final void C5(@l CoordinatorLayout coordinatorLayout0) {
        L.p(coordinatorLayout0, "<set-?>");
        this.La = coordinatorLayout0;
    }

    public final void C6(@m String s) {
        this.Ja = s;
    }

    public final void C7(@m WebView webView0) {
        this.Ga = webView0;
    }

    public final int D2() {
        return this.B;
    }

    public final boolean D3() {
        return this.r9;
    }

    @m
    public final String D4() {
        return this.ka;
    }

    public final void D5(@l List list0) {
        L.p(list0, "<set-?>");
        this.w9 = list0;
    }

    public final void D6(@l ProgressBar progressBar0) {
        L.p(progressBar0, "<set-?>");
        this.Za = progressBar0;
    }

    public final void D7(@m Boolean boolean0) {
        this.G9 = boolean0;
    }

    public static void E1(DialogInterface dialogInterface0, int v) {
    }

    public final int E2() {
        return this.C;
    }

    public final boolean E3() {
        return this.R8;
    }

    @m
    public final Boolean E4() {
        return this.E9;
    }

    public final void E5(@m String s) {
        this.Ca = s;
    }

    public final void E6(int v) {
        this.X = v;
    }

    public final void E7(@m Boolean boolean0) {
        this.F9 = boolean0;
    }

    public final int F2() {
        return this.D;
    }

    public final int F3() {
        return this.w;
    }

    @m
    public final Boolean F4() {
        return this.ha;
    }

    public final void F5(boolean z) {
        this.H = z;
    }

    public final void F6(float f) {
        this.Y = f;
    }

    public final void F7(@m Boolean boolean0) {
        this.ca = boolean0;
    }

    @m
    public final String G2() {
        return this.ya;
    }

    public final boolean G3() {
        return this.x;
    }

    @m
    public final String G4() {
        return this.S9;
    }

    public final void G5(boolean z) {
        this.F = z;
    }

    public final void G6(@m X.a a0) {
        this.Z = a0;
    }

    public final void G7(@m Boolean boolean0) {
        this.ba = boolean0;
    }

    @m
    public final Boolean H2() {
        return this.za;
    }

    public final int H3() {
        return this.A9;
    }

    @m
    public final String H4() {
        return this.O9;
    }

    public final void H5(boolean z) {
        this.J = z;
    }

    public final void H6(boolean z) {
        this.v = z;
    }

    public final void H7(@m Boolean boolean0) {
        this.ea = boolean0;
    }

    public final int I2() {
        return this.u;
    }

    public final int I3() {
        return this.m9;
    }

    @m
    public final String I4() {
        return this.da;
    }

    public final void I5(boolean z) {
        this.L = z;
    }

    public final void I6(@m n n0) {
        this.Ha = n0;
    }

    public final void I7(@m String s) {
        this.fa = s;
    }

    // 去混淆评级： 中等(50)
    public final int J2() {
        return this.y2().getVisibility() == 0 ? Dk.h(this) : Dk.h(this);
    }

    public final int J3() {
        return this.v9;
    }

    @m
    public final Boolean J4() {
        return this.ia;
    }

    public final void J5(int v) {
        this.O = v;
    }

    public final void J6(@l ShadowLayout shadowLayout0) {
        L.p(shadowLayout0, "<set-?>");
        this.bb = shadowLayout0;
    }

    public final void J7(boolean z) {
        this.ra = z;
    }

    @l
    public final LinearLayout K2() {
        LinearLayout linearLayout0 = this.cb;
        if(linearLayout0 != null) {
            return linearLayout0;
        }
        L.S("menuBackground");
        return null;
    }

    public final int K3() {
        return this.i9;
    }

    @m
    public final Boolean K4() {
        return this.ja;
    }

    public final void K5(float f) {
        this.P = f;
    }

    public final void K6(boolean z) {
        this.M = z;
    }

    public final void K7(boolean z) {
        this.ua = z;
    }

    public final int L2() {
        return this.V8;
    }

    public final int L3() {
        return this.o9;
    }

    public final boolean L4() {
        return this.aa;
    }

    public final void L5(@l DownloadListener downloadListener0) {
        L.p(downloadListener0, "<set-?>");
        this.qb = downloadListener0;
    }

    public final void L6(boolean z) {
        this.G = z;
    }

    public final void L7(boolean z) {
        this.Y9 = z;
    }

    public final void M1(@l String s, @l AppCompatActivity appCompatActivity0) {
        L.p(s, "message");
        L.p(appCompatActivity0, "activity");
        new Builder(appCompatActivity0).l(s).setPositiveButton(0x104000A, new e()).I();
    }

    @l
    public final LinearLayout M2() {
        LinearLayout linearLayout0 = this.jb;
        if(linearLayout0 != null) {
            return linearLayout0;
        }
        L.S("menuCopyLink");
        return null;
    }

    public final int M3() {
        return this.t9;
    }

    @m
    public final WebSettings.LayoutAlgorithm M4() {
        return this.M9;
    }

    public final void M5(@m String s) {
        this.Ba = s;
    }

    public final void M6(boolean z) {
        this.E = z;
    }

    public final void M7(boolean z) {
        this.Z9 = z;
    }

    private static final void N1(DialogInterface dialogInterface0, int v) {
    }

    @l
    public final TextView N2() {
        TextView textView0 = this.kb;
        if(textView0 != null) {
            return textView0;
        }
        L.S("menuCopyLinkTv");
        return null;
    }

    public final int N3() {
        return this.s9;
    }

    @m
    public final Boolean N4() {
        return this.H9;
    }

    public final void N5(@m Map map0) {
        this.Ea = map0;
    }

    public final void N6(boolean z) {
        this.I = z;
    }

    public final void N7(@m Boolean boolean0) {
        this.D9 = boolean0;
    }

    public final void O1() {
        View view0 = this.findViewById(0x7F0B02FB);  // id:coordinatorLayout
        L.o(view0, "findViewById(...)");
        this.C5(((CoordinatorLayout)view0));
        View view1 = this.findViewById(0x7F0B0121);  // id:appBar
        L.o(view1, "findViewById(...)");
        this.y5(((AppBarLayout)view1));
        View view2 = this.findViewById(0x7F0B0F92);  // id:toolbar
        L.o(view2, "findViewById(...)");
        this.q7(((Toolbar)view2));
        View view3 = this.findViewById(0x7F0B0F93);  // id:toolbarLayout
        L.o(view3, "findViewById(...)");
        this.s7(((RelativeLayout)view3));
        View view4 = this.findViewById(0x7F0B0F8E);  // id:title
        L.o(view4, "findViewById(...)");
        this.l7(((TextView)view4));
        View view5 = this.findViewById(0x7F0B0FF7);  // id:url
        L.o(view5, "findViewById(...)");
        this.z7(((TextView)view5));
        View view6 = this.findViewById(0x7F0B02BD);  // id:close
        L.o(view6, "findViewById(...)");
        this.B5(((AppCompatImageButton)view6));
        View view7 = this.findViewById(0x7F0B0182);  // id:back
        L.o(view7, "findViewById(...)");
        this.z5(((AppCompatImageButton)view7));
        View view8 = this.findViewById(0x7F0B04BF);  // id:forward
        L.o(view8, "findViewById(...)");
        this.T5(((AppCompatImageButton)view8));
        View view9 = this.findViewById(0x7F0B087F);  // id:more
        L.o(view9, "findViewById(...)");
        this.A6(((AppCompatImageButton)view9));
        this.f2().setOnClickListener(this);
        this.d2().setOnClickListener(this);
        this.y2().setOnClickListener(this);
        this.h3().setOnClickListener(this);
        View view10 = this.findViewById(0x7F0B0545);  // id:gradient
        L.o(view10, "findViewById(...)");
        this.setGradient(view10);
        View view11 = this.findViewById(0x7F0B042F);  // id:divider
        L.o(view11, "findViewById(...)");
        this.setDivider(view11);
        View view12 = this.findViewById(0x7F0B0BF0);  // id:progressBar
        L.o(view12, "findViewById(...)");
        this.D6(((ProgressBar)view12));
        this.Ka = (ProgressBar)this.findViewById(0x7F0B017F);  // id:awesome_web_progress
        View view13 = this.findViewById(0x7F0B080C);  // id:menuLayout
        L.o(view13, "findViewById(...)");
        this.l6(((RelativeLayout)view13));
        View view14 = this.findViewById(0x7F0B0EEA);  // id:shadowLayout
        L.o(view14, "findViewById(...)");
        this.J6(((ShadowLayout)view14));
        View view15 = this.findViewById(0x7F0B0807);  // id:menuBackground
        L.o(view15, "findViewById(...)");
        this.d6(((LinearLayout)view15));
        View view16 = this.findViewById(0x7F0B080F);  // id:menuRefresh
        L.o(view16, "findViewById(...)");
        this.o6(((LinearLayout)view16));
        View view17 = this.findViewById(0x7F0B0810);  // id:menuRefreshTv
        L.o(view17, "findViewById(...)");
        this.p6(((TextView)view17));
        View view18 = this.findViewById(0x7F0B080A);  // id:menuFind
        L.o(view18, "findViewById(...)");
        this.j6(((LinearLayout)view18));
        View view19 = this.findViewById(0x7F0B080B);  // id:menuFindTv
        L.o(view19, "findViewById(...)");
        this.k6(((TextView)view19));
        View view20 = this.findViewById(0x7F0B0811);  // id:menuShareVia
        L.o(view20, "findViewById(...)");
        this.r6(((LinearLayout)view20));
        View view21 = this.findViewById(0x7F0B0812);  // id:menuShareViaTv
        L.o(view21, "findViewById(...)");
        this.s6(((TextView)view21));
        View view22 = this.findViewById(0x7F0B0808);  // id:menuCopyLink
        L.o(view22, "findViewById(...)");
        this.f6(((LinearLayout)view22));
        View view23 = this.findViewById(0x7F0B0809);  // id:menuCopyLinkTv
        L.o(view23, "findViewById(...)");
        this.g6(((TextView)view23));
        View view24 = this.findViewById(0x7F0B080D);  // id:menuOpenWith
        L.o(view24, "findViewById(...)");
        this.m6(((LinearLayout)view24));
        View view25 = this.findViewById(0x7F0B080E);  // id:menuOpenWithTv
        L.o(view25, "findViewById(...)");
        this.n6(((TextView)view25));
        View view26 = this.findViewById(0x7F0B10C9);  // id:webLayout
        L.o(view26, "findViewById(...)");
        this.B7(((FrameLayout)view26));
        View view27 = this.findViewById(0x7F0B0F58);  // id:swipeRefreshLayout
        L.o(view27, "findViewById(...)");
        this.k7(((FrameLayout)view27));
        WebView webView0 = this.R1();
        n n0 = new n(webView0);
        this.Ha = n0;
        webView0.addJavascriptInterface(n0, "DcJsCallback");
        this.Ga = webView0;
        this.i4().addView(this.Ga);
    }

    public final int O2() {
        return this.W8;
    }

    public final int O3() {
        return this.g9;
    }

    @m
    public final Boolean O4() {
        return this.X9;
    }

    public final void O5(@m Boolean boolean0) {
        this.Fa = boolean0;
    }

    public final void O6(boolean z) {
        this.K = z;
    }

    public final void O7(@m Integer integer0) {
        this.oa = integer0;
    }

    @l
    public final WebChromeClient P1() {
        FrameLayout frameLayout0 = this.i4();
        View view0 = this.findViewById(0x7F0B104A);  // id:videoLayout
        View view1 = this.getLayoutInflater().inflate(0x7F0E0206, ((ViewGroup)view0), false);  // layout:view_loading_video
        L.m(((ViewGroup)view0));
        L.m(view1);
        WebChromeClient webChromeClient0 = new b(this, frameLayout0, ((ViewGroup)view0), view1, this.Ga);
        ((com.dcinside.app.browser.views.a)webChromeClient0).c((boolean z) -> {
            L.p(this, "this$0");
            if(z) {
                WindowManager.LayoutParams windowManager$LayoutParams0 = this.getWindow().getAttributes();
                windowManager$LayoutParams0.flags |= 0x480;
                this.getWindow().setAttributes(windowManager$LayoutParams0);
                this.getWindow().getDecorView().setSystemUiVisibility(1);
                return;
            }
            WindowManager.LayoutParams windowManager$LayoutParams1 = this.getWindow().getAttributes();
            windowManager$LayoutParams1.flags &= 0xFFFFFB7F;
            this.getWindow().setAttributes(windowManager$LayoutParams1);
            this.getWindow().getDecorView().setSystemUiVisibility(0);
        });
        return webChromeClient0;
    }

    public final float P2() {
        return this.X8;
    }

    public final int P3() {
        return this.q9;
    }

    @m
    public final Boolean P4() {
        return this.C9;
    }

    public final void P5(boolean z) {
        this.u9 = z;
    }

    public final void P6(boolean z) {
        this.l9 = z;
    }

    public final void P7(boolean z) {
        this.ta = z;
    }

    // 检测为 Lambda 实现
    private static final void Q1(AwesomeWebViewActivity awesomeWebViewActivity0, boolean z) [...]

    @l
    public final LinearLayout Q2() {
        LinearLayout linearLayout0 = this.fb;
        if(linearLayout0 != null) {
            return linearLayout0;
        }
        L.S("menuFind");
        return null;
    }

    public final int Q3() {
        return this.k9;
    }

    @m
    public final Integer Q4() {
        return this.T9;
    }

    public final void Q5(@m String s) {
        this.va = s;
    }

    public final void Q6(boolean z) {
        this.h9 = z;
    }

    public final void Q7(@l WebViewClient webViewClient0) {
        L.p(webViewClient0, "<set-?>");
        this.Wa = webViewClient0;
    }

    @l
    public final WebView R1() {
        return new VideoEnabledWebView(this);
    }

    @l
    public final TextView R2() {
        TextView textView0 = this.gb;
        if(textView0 != null) {
            return textView0;
        }
        L.S("menuFindTv");
        return null;
    }

    @l
    public final FrameLayout R3() {
        FrameLayout frameLayout0 = this.ob;
        if(frameLayout0 != null) {
            return frameLayout0;
        }
        L.S("swipeRefreshLayout");
        return null;
    }

    @m
    public final Integer R4() {
        return this.U9;
    }

    public final void R5(@m ValueCallback valueCallback0) {
        this.wa = valueCallback0;
    }

    public final void R6(boolean z) {
        this.n9 = z;
    }

    public final void R7(boolean z) {
        this.sa = z;
    }

    @l
    public final WebViewClient S1() {
        return new c(this);
    }

    @l
    public final RelativeLayout S2() {
        RelativeLayout relativeLayout0 = this.ab;
        if(relativeLayout0 != null) {
            return relativeLayout0;
        }
        L.S("menuLayout");
        return null;
    }

    @l
    public final TextView S3() {
        TextView textView0 = this.Pa;
        if(textView0 != null) {
            return textView0;
        }
        L.S("title");
        return null;
    }

    @m
    public final Integer S4() {
        return this.pa;
    }

    public final void S5(@m ValueCallback valueCallback0) {
        this.xa = valueCallback0;
    }

    public final void S6(boolean z) {
        this.f9 = z;
    }

    public final void S7(@m String s) {
        this.R9 = s;
    }

    public final void T1(@l String s, @l Bitmap bitmap0) {
        FileOutputStream fileOutputStream1;
        L.p(s, "code");
        L.p(bitmap0, "bitmap");
        Intent intent0 = this.getIntent();
        FileOutputStream fileOutputStream0 = null;
        String s1 = String.format("%s_%s", Arrays.copyOf(new Object[]{(intent0 == null ? null : intent0.getStringExtra("extraSecurityUser")), s}, 2));
        L.o(s1, "format(...)");
        File file0 = new File(Environment.getExternalStorageDirectory(), "dcinside/" + s1 + ".png");
        try {
            fileOutputStream1 = new FileOutputStream(file0, false);
        }
        catch(Exception unused_ex) {
            goto label_12;
        }
        catch(Throwable throwable0) {
            goto label_23;
        }
        try {
            bitmap0.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream1);
            this.M1("이미지가 저장되었습니다.", this);
            goto label_28;
        }
        catch(Exception unused_ex) {
            fileOutputStream0 = fileOutputStream1;
            try {
            label_12:
                this.M1("이미지를 생성할 수 없습니다.", this);
            }
            catch(Throwable throwable0) {
                goto label_23;
            }
            if(fileOutputStream0 != null) {
                try {
                    fileOutputStream0.flush();
                label_18:
                    if(fileOutputStream0 != null) {
                        fileOutputStream0.close();
                        return;
                    }
                }
                catch(IOException unused_ex) {
                }
                return;
            }
            goto label_18;
        }
        catch(Throwable throwable0) {
            fileOutputStream0 = fileOutputStream1;
        }
        try {
        label_23:
            if(fileOutputStream0 != null) {
                fileOutputStream0.flush();
            }
            if(fileOutputStream0 != null) {
                fileOutputStream0.close();
            }
        }
        catch(IOException unused_ex) {
        }
        throw throwable0;
        try {
        label_28:
            fileOutputStream1.flush();
            fileOutputStream1.close();
        }
        catch(IOException unused_ex) {
        }
    }

    @l
    public final LinearLayout T2() {
        LinearLayout linearLayout0 = this.lb;
        if(linearLayout0 != null) {
            return linearLayout0;
        }
        L.S("menuOpenWith");
        return null;
    }

    @m
    public final String T3() {
        return this.M8;
    }

    @m
    public final Boolean T4() {
        return this.na;
    }

    public final void T5(@l AppCompatImageButton appCompatImageButton0) {
        L.p(appCompatImageButton0, "<set-?>");
        this.Ta = appCompatImageButton0;
    }

    public final void T6(boolean z) {
        this.p9 = z;
    }

    public final void T7(@m Boolean boolean0) {
        this.ga = boolean0;
    }

    public final void U1() {
        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            L.p(this, "this$0");
            WebView webView0 = this.Ga;
            if(webView0 != null) {
                webView0.destroy();
            }
        }, 4000L);
    }

    @l
    public final TextView U2() {
        TextView textView0 = this.mb;
        if(textView0 != null) {
            return textView0;
        }
        L.S("menuOpenWithTv");
        return null;
    }

    @l
    public final String U3() {
        return this.P8;
    }

    @m
    public final Boolean U4() {
        return this.qa;
    }

    public final void U5(boolean z) {
        this.N = z;
    }

    public final void U6(boolean z) {
        this.j9 = z;
    }

    public final void U7(@m Integer integer0) {
        this.W9 = integer0;
    }

    // 检测为 Lambda 实现
    private static final void V1(AwesomeWebViewActivity awesomeWebViewActivity0) [...]

    @l
    public final LinearLayout V2() {
        LinearLayout linearLayout0 = this.db;
        if(linearLayout0 != null) {
            return linearLayout0;
        }
        L.S("menuRefresh");
        return null;
    }

    public final float V3() {
        return this.O8;
    }

    @m
    public final ProgressBar V4() {
        return this.Ka;
    }

    public final void V5(@l Handler handler0) {
        L.p(handler0, "<set-?>");
        this.rb = handler0;
    }

    public final void V6(boolean z) {
        this.Q = z;
    }

    public final void V7(@m Integer integer0) {
        this.V9 = integer0;
    }

    // 检测为 Lambda 实现
    private static final void W1(AwesomeWebViewActivity awesomeWebViewActivity0, String s, String s1, String s2, String s3, long v) [...]

    @l
    public final TextView W2() {
        TextView textView0 = this.eb;
        if(textView0 != null) {
            return textView0;
        }
        L.S("menuRefreshTv");
        return null;
    }

    public final int W3() {
        return this.Q8;
    }

    @m
    public final String W4() {
        return this.P9;
    }

    public final void W5(int v) {
        this.A = v;
    }

    public final void W6(boolean z) {
        this.r9 = z;
    }

    public final void W7(@m String s) {
        this.ka = s;
    }

    public final void X1(@l String s) {
        FileOutputStream fileOutputStream1;
        L.p(s, "code");
        Intent intent0 = this.getIntent();
        FileOutputStream fileOutputStream0 = null;
        String s1 = String.format("%s_%s", Arrays.copyOf(new Object[]{(intent0 == null ? null : intent0.getStringExtra("extraSecurityUser")), s}, 2));
        L.o(s1, "format(...)");
        File file0 = new File(Environment.getExternalStorageDirectory(), "dcinside/" + s1 + ".txt");
        try {
            fileOutputStream1 = new FileOutputStream(file0, false);
        }
        catch(Exception unused_ex) {
            goto label_22;
        }
        catch(Throwable throwable0) {
            goto label_27;
        }
        try {
            Charset charset0 = StandardCharsets.UTF_8;
            L.o(charset0, "UTF_8");
            byte[] arr_b = s.getBytes(charset0);
            L.o(arr_b, "getBytes(...)");
            fileOutputStream1.write(arr_b);
            fileOutputStream1.flush();
            fileOutputStream1.close();
        }
        catch(Exception unused_ex) {
            fileOutputStream0 = fileOutputStream1;
            goto label_22;
        }
        catch(Throwable throwable0) {
            fileOutputStream0 = fileOutputStream1;
            goto label_27;
        }
        try {
            try {
                this.M1("파일이 저장되었습니다.", this);
                return;
            }
            catch(Exception unused_ex) {
            }
        label_22:
            this.M1("파일을 생성할 수 없습니다.", this);
            if(fileOutputStream0 != null) {
                goto label_24;
            }
            return;
        }
        catch(Throwable throwable0) {
            goto label_27;
        }
        try {
        label_24:
            fileOutputStream0.close();
        }
        catch(IOException unused_ex) {
        }
        return;
    label_27:
        if(fileOutputStream0 != null) {
            try {
                fileOutputStream0.close();
            }
            catch(IOException unused_ex) {
            }
        }
        throw throwable0;
    }

    public final int X2() {
        return this.Y8;
    }

    @l
    public final Toolbar X3() {
        Toolbar toolbar0 = this.Na;
        if(toolbar0 != null) {
            return toolbar0;
        }
        L.S("toolbar");
        return null;
    }

    @m
    public final Boolean X4() {
        return this.I9;
    }

    public final void X5(int v) {
        this.B = v;
    }

    public final void X6(boolean z) {
        this.R8 = z;
    }

    public final void X7(@m Boolean boolean0) {
        this.E9 = boolean0;
    }

    public final void Y1() {
        super.onBackPressed();
        this.overridePendingTransition(this.x9, this.y9);
    }

    @l
    public final LinearLayout Y2() {
        LinearLayout linearLayout0 = this.hb;
        if(linearLayout0 != null) {
            return linearLayout0;
        }
        L.S("menuShareVia");
        return null;
    }

    public final int Y3() {
        return this.y;
    }

    @m
    public final String Y4() {
        return this.Q9;
    }

    public final void Y5(int v) {
        this.C = v;
    }

    public final void Y6(int v) {
        this.w = v;
    }

    public final void Y7(@m Boolean boolean0) {
        this.ha = boolean0;
    }

    @m
    public final String Z1() {
        return this.Ia;
    }

    @l
    public final TextView Z2() {
        TextView textView0 = this.ib;
        if(textView0 != null) {
            return textView0;
        }
        L.S("menuShareViaTv");
        return null;
    }

    @l
    public final RelativeLayout Z3() {
        RelativeLayout relativeLayout0 = this.Oa;
        if(relativeLayout0 != null) {
            return relativeLayout0;
        }
        L.S("toolbarLayout");
        return null;
    }

    @m
    public final String Z4() {
        return this.N9;
    }

    public final void Z5(int v) {
        this.D = v;
    }

    public final void Z6(boolean z) {
        this.x = z;
    }

    public final void Z7(@m String s) {
        this.S9 = s;
    }

    public final int a2() {
        return this.x9;
    }

    public final int a3() {
        return this.b9;
    }

    public final boolean a4() {
        return this.z;
    }

    @m
    public final Boolean a5() {
        return this.L9;
    }

    public final void a6(@m String s) {
        this.ya = s;
    }

    public final void a7(int v) {
        this.A9 = v;
    }

    public final void a8(@m String s) {
        this.O9 = s;
    }

    public final int b2() {
        return this.y9;
    }

    @l
    public final String b3() {
        return this.a9;
    }

    public final boolean b4() {
        return this.N8;
    }

    @m
    public final Boolean b5() {
        return this.B9;
    }

    public final void b6(@m Boolean boolean0) {
        this.za = boolean0;
    }

    public final void b7(int v) {
        this.m9 = v;
    }

    public final void b8(@m String s) {
        this.da = s;
    }

    @l
    public final AppBarLayout c2() {
        AppBarLayout appBarLayout0 = this.Ma;
        if(appBarLayout0 != null) {
            return appBarLayout0;
        }
        L.S("appBar");
        return null;
    }

    public final int c3() {
        return this.c9;
    }

    @m
    public final String c4() {
        return this.Da;
    }

    @m
    public final Integer c5() {
        return this.J9;
    }

    public final void c6(int v) {
        this.u = v;
    }

    public final void c7(int v) {
        this.v9 = v;
    }

    public final void c8(@m Boolean boolean0) {
        this.ia = boolean0;
    }

    @l
    public final AppCompatImageButton d2() {
        AppCompatImageButton appCompatImageButton0 = this.Sa;
        if(appCompatImageButton0 != null) {
            return appCompatImageButton0;
        }
        L.S("back");
        return null;
    }

    public final float d3() {
        return this.d9;
    }

    public final int d4() {
        return this.U8;
    }

    @m
    public final Boolean d5() {
        return this.K9;
    }

    public final void d6(@l LinearLayout linearLayout0) {
        L.p(linearLayout0, "<set-?>");
        this.cb = linearLayout0;
    }

    public final void d7(int v) {
        this.i9 = v;
    }

    public final void d8(@m Boolean boolean0) {
        this.ja = boolean0;
    }

    public final boolean e2() {
        return this.z9;
    }

    public final float e3() {
        return this.e9;
    }

    @l
    public final String e4() {
        return this.T8;
    }

    @m
    public final Boolean e5() {
        return this.ma;
    }

    public final void e6(int v) {
        this.V8 = v;
    }

    public final void e7(int v) {
        this.o9 = v;
    }

    public final void e8(boolean z) {
        this.aa = z;
    }

    @l
    public final AppCompatImageButton f2() {
        AppCompatImageButton appCompatImageButton0 = this.Ra;
        if(appCompatImageButton0 != null) {
            return appCompatImageButton0;
        }
        L.S("close");
        return null;
    }

    public final float f3() {
        return this.Z8;
    }

    public final float f4() {
        return this.S8;
    }

    @m
    public final String f5() {
        return this.la;
    }

    public final void f6(@l LinearLayout linearLayout0) {
        L.p(linearLayout0, "<set-?>");
        this.jb = linearLayout0;
    }

    public final void f7(int v) {
        this.t9 = v;
    }

    public final void f8(@m WebSettings.LayoutAlgorithm webSettings$LayoutAlgorithm0) {
        this.M9 = webSettings$LayoutAlgorithm0;
    }

    @l
    public final CoordinatorLayout g2() {
        CoordinatorLayout coordinatorLayout0 = this.La;
        if(coordinatorLayout0 != null) {
            return coordinatorLayout0;
        }
        L.S("coordinatorLayout");
        return null;
    }

    @m
    public final String g3() {
        return this.Aa;
    }

    @l
    public final TextView g4() {
        TextView textView0 = this.Qa;
        if(textView0 != null) {
            return textView0;
        }
        L.S("urlTv");
        return null;
    }

    public final void g5() {
        public static final class com.dcinside.app.browser.AwesomeWebViewActivity.e implements Animation.AnimationListener {
            final AwesomeWebViewActivity a;

            com.dcinside.app.browser.AwesomeWebViewActivity.e(AwesomeWebViewActivity awesomeWebViewActivity0) {
                this.a = awesomeWebViewActivity0;
                super();
            }

            @Override  // android.view.animation.Animation$AnimationListener
            public void onAnimationEnd(@l Animation animation0) {
                L.p(animation0, "animation");
                this.a.S2().setVisibility(8);
            }

            @Override  // android.view.animation.Animation$AnimationListener
            public void onAnimationRepeat(@l Animation animation0) {
                L.p(animation0, "animation");
            }

            @Override  // android.view.animation.Animation$AnimationListener
            public void onAnimationStart(@l Animation animation0) {
                L.p(animation0, "animation");
            }
        }

        Animation animation0 = AnimationUtils.loadAnimation(this, 0x7F010050);  // anim:popup_flyout_hide
        this.q3().startAnimation(animation0);
        animation0.setAnimationListener(new com.dcinside.app.browser.AwesomeWebViewActivity.e(this));
    }

    public final void g6(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.kb = textView0;
    }

    public final void g7(int v) {
        this.s9 = v;
    }

    public final void g8(@m Boolean boolean0) {
        this.H9 = boolean0;
    }

    @l
    public final List h2() {
        return this.w9;
    }

    @l
    public final AppCompatImageButton h3() {
        AppCompatImageButton appCompatImageButton0 = this.Ua;
        if(appCompatImageButton0 != null) {
            return appCompatImageButton0;
        }
        L.S("more");
        return null;
    }

    @l
    public final WebChromeClient h4() {
        WebChromeClient webChromeClient0 = this.Va;
        if(webChromeClient0 != null) {
            return webChromeClient0;
        }
        L.S("webChromeClient");
        return null;
    }

    @SuppressLint({"ResourceType"})
    public final void h5() {
        float f1;
        float f;
        Intent intent0 = this.getIntent();
        if(intent0 == null) {
            return;
        }
        com.dcinside.app.browser.AwesomeWebView.Builder awesomeWebView$Builder0 = (com.dcinside.app.browser.AwesomeWebView.Builder)intent0.getParcelableExtra("builder");
        if(awesomeWebView$Builder0 == null) {
            return;
        }
        Integer integer0 = awesomeWebView$Builder0.R0();
        boolean z = false;
        this.setTheme((integer0 == null ? 0 : ((int)integer0)));
        TypedArray typedArray0 = this.obtainStyledAttributes(new TypedValue().data, new int[]{0x7F04015A, 0x7F040158, 0x7F04012E, 0x1010036, 0x1010038, 0x101030E, 0x101045C});  // attr:colorPrimaryDark
        L.o(typedArray0, "obtainStyledAttributes(...)");
        int v = typedArray0.getColor(0, ContextCompat.getColor(this, 0x7F06011D));  // color:finestGray
        boolean z1 = true;
        int v1 = typedArray0.getColor(1, ContextCompat.getColor(this, 0x7F060121));  // color:finestWhite
        int v2 = typedArray0.getColor(2, ContextCompat.getColor(this, 0x7F060117));  // color:finestBlack
        int v3 = typedArray0.getColor(3, ContextCompat.getColor(this, 0x7F060117));  // color:finestBlack
        int v4 = typedArray0.getColor(4, ContextCompat.getColor(this, 0x7F060120));  // color:finestSilver
        int v5 = typedArray0.getResourceId(5, 0);
        int v6 = typedArray0.getResourceId(6, 0);
        typedArray0.recycle();
        this.u = awesomeWebView$Builder0.V();
        Boolean boolean0 = awesomeWebView$Builder0.n0();
        this.v = boolean0 == null ? this.getResources().getBoolean(0x7F050007) : boolean0.booleanValue();  // bool:is_right_to_left
        Integer integer1 = awesomeWebView$Builder0.F0();
        if(integer1 != null) {
            v = (int)integer1;
        }
        this.w = v;
        Boolean boolean1 = awesomeWebView$Builder0.G0();
        this.x = boolean1 == null ? false : boolean1.booleanValue();
        Integer integer2 = awesomeWebView$Builder0.W0();
        if(integer2 != null) {
            v1 = (int)integer2;
        }
        this.y = v1;
        Boolean boolean2 = awesomeWebView$Builder0.X0();
        this.z = boolean2 == null ? true : boolean2.booleanValue();
        Integer integer3 = awesomeWebView$Builder0.M();
        this.A = integer3 == null ? v2 : ((int)integer3);
        Integer integer4 = awesomeWebView$Builder0.N();
        this.B = integer4 == null ? com.dcinside.app.browser.helpers.b.a(this.A) : ((int)integer4);
        Integer integer5 = awesomeWebView$Builder0.O();
        this.C = integer5 == null ? this.A : ((int)integer5);
        Integer integer6 = awesomeWebView$Builder0.P();
        if(integer6 != null) {
            v6 = (int)integer6;
        }
        this.D = v6;
        Boolean boolean3 = awesomeWebView$Builder0.q0();
        this.E = boolean3 == null ? true : boolean3.booleanValue();
        Boolean boolean4 = awesomeWebView$Builder0.C();
        this.F = boolean4 == null ? false : boolean4.booleanValue();
        Boolean boolean5 = awesomeWebView$Builder0.p0();
        this.G = boolean5 == null ? true : boolean5.booleanValue();
        Boolean boolean6 = awesomeWebView$Builder0.B();
        this.H = boolean6 == null ? false : boolean6.booleanValue();
        Boolean boolean7 = awesomeWebView$Builder0.r0();
        this.I = boolean7 == null ? true : boolean7.booleanValue();
        Boolean boolean8 = awesomeWebView$Builder0.D();
        this.J = boolean8 == null ? false : boolean8.booleanValue();
        Boolean boolean9 = awesomeWebView$Builder0.s0();
        this.K = boolean9 == null ? true : boolean9.booleanValue();
        Boolean boolean10 = awesomeWebView$Builder0.E();
        this.L = boolean10 == null ? false : boolean10.booleanValue();
        Boolean boolean11 = awesomeWebView$Builder0.o0();
        this.M = boolean11 == null ? true : boolean11.booleanValue();
        Boolean boolean12 = awesomeWebView$Builder0.L();
        this.N = boolean12 == null ? true : boolean12.booleanValue();
        Integer integer7 = awesomeWebView$Builder0.F();
        this.O = integer7 == null ? ContextCompat.getColor(this, 0x7F060119) : ((int)integer7);  // color:finestBlack10
        Float float0 = awesomeWebView$Builder0.G();
        this.P = float0 == null ? this.getResources().getDimension(0x7F07007D) : ((float)float0);  // dimen:defaultDividerHeight
        Boolean boolean13 = awesomeWebView$Builder0.z0();
        this.Q = boolean13 == null ? false : boolean13.booleanValue();
        Integer integer8 = awesomeWebView$Builder0.j0();
        if(integer8 != null) {
            v2 = (int)integer8;
        }
        this.X = v2;
        Float float1 = awesomeWebView$Builder0.k0();
        this.Y = float1 == null ? this.getResources().getDimension(0x7F070085) : ((float)float1);  // dimen:defaultProgressBarHeight
        this.Z = awesomeWebView$Builder0.l0() == null ? X.a.b : awesomeWebView$Builder0.l0();
        this.M8 = awesomeWebView$Builder0.T0();
        Boolean boolean14 = awesomeWebView$Builder0.Y0();
        this.N8 = boolean14 == null ? true : boolean14.booleanValue();
        Float float2 = awesomeWebView$Builder0.V0();
        this.O8 = float2 == null ? this.getResources().getDimension(0x7F070086) : ((float)float2);  // dimen:defaultTitleSize
        this.P8 = awesomeWebView$Builder0.U0() == null ? "Roboto-Medium.ttf" : awesomeWebView$Builder0.U0();
        Integer integer9 = awesomeWebView$Builder0.S0();
        if(integer9 != null) {
            v3 = (int)integer9;
        }
        this.Q8 = v3;
        Boolean boolean15 = awesomeWebView$Builder0.B0();
        this.R8 = boolean15 == null ? true : boolean15.booleanValue();
        Float float3 = awesomeWebView$Builder0.d1();
        this.S8 = float3 == null ? this.getResources().getDimension(0x7F070087) : ((float)float3);  // dimen:defaultUrlSize
        String s = awesomeWebView$Builder0.c1();
        String s1 = "Roboto-Regular.ttf";
        if(s == null) {
            s = "Roboto-Regular.ttf";
        }
        this.T8 = s;
        Integer integer10 = awesomeWebView$Builder0.b1();
        if(integer10 != null) {
            v4 = (int)integer10;
        }
        this.U8 = v4;
        Integer integer11 = awesomeWebView$Builder0.X();
        this.V8 = integer11 == null ? ContextCompat.getColor(this, 0x7F060121) : ((int)integer11);  // color:finestWhite
        Integer integer12 = awesomeWebView$Builder0.Y();
        this.W8 = integer12 == null ? ContextCompat.getColor(this, 0x7F060119) : ((int)integer12);  // color:finestBlack10
        Float float4 = awesomeWebView$Builder0.Z();
        this.X8 = float4 == null ? this.getResources().getDimension(0x7F070080) : ((float)float4);  // dimen:defaultMenuDropShadowSize
        Integer integer13 = awesomeWebView$Builder0.a0();
        if(integer13 != null) {
            v5 = (int)integer13;
        }
        this.Y8 = v5;
        Float float5 = awesomeWebView$Builder0.g0();
        this.Z8 = float5 == null ? this.getResources().getDimension(0x7F070084) : ((float)float5);  // dimen:defaultMenuTextSize
        String s2 = awesomeWebView$Builder0.c0();
        if(s2 != null) {
            s1 = s2;
        }
        this.a9 = s1;
        Integer integer14 = awesomeWebView$Builder0.b0();
        this.b9 = integer14 == null ? ContextCompat.getColor(this, 0x7F060117) : ((int)integer14);  // color:finestBlack
        Integer integer15 = awesomeWebView$Builder0.d0();
        this.c9 = integer15 == null ? 0x800013 : ((int)integer15);
        if(awesomeWebView$Builder0.e0() == null) {
            f = this.v ? this.getResources().getDimension(0x7F070083) : this.getResources().getDimension(0x7F070082);  // dimen:defaultMenuTextPaddingRight
        }
        else {
            Float float6 = awesomeWebView$Builder0.e0();
            L.m(float6);
            f = (float)float6;
        }
        this.d9 = f;
        if(awesomeWebView$Builder0.f0() == null) {
            f1 = this.v ? this.getResources().getDimension(0x7F070082) : this.getResources().getDimension(0x7F070083);  // dimen:defaultMenuTextPaddingLeft
        }
        else {
            Float float7 = awesomeWebView$Builder0.f0();
            L.m(float7);
            f1 = (float)float7;
        }
        this.e9 = f1;
        Boolean boolean16 = awesomeWebView$Builder0.w0();
        this.f9 = boolean16 == null ? true : boolean16.booleanValue();
        Integer integer16 = awesomeWebView$Builder0.O0();
        this.g9 = integer16 == null ? 0x7F150880 : ((int)integer16);  // string:refresh "새로고침"
        Boolean boolean17 = awesomeWebView$Builder0.u0();
        this.h9 = boolean17 == null ? false : boolean17.booleanValue();
        Integer integer17 = awesomeWebView$Builder0.K0();
        this.i9 = integer17 == null ? 0x7F150359 : ((int)integer17);  // string:find "찾기"
        Boolean boolean18 = awesomeWebView$Builder0.y0();
        this.j9 = boolean18 == null ? true : boolean18.booleanValue();
        Integer integer18 = awesomeWebView$Builder0.Q0();
        this.k9 = integer18 == null ? 0x7F1509CA : ((int)integer18);  // string:share_via "주소 공유하기"
        Boolean boolean19 = awesomeWebView$Builder0.t0();
        this.l9 = boolean19 == null ? true : boolean19.booleanValue();
        Integer integer19 = awesomeWebView$Builder0.I0();
        this.m9 = integer19 == null ? 0x7F15021C : ((int)integer19);  // string:copy_link "주소 복사하기"
        Boolean boolean20 = awesomeWebView$Builder0.v0();
        this.n9 = boolean20 == null ? true : boolean20.booleanValue();
        Integer integer20 = awesomeWebView$Builder0.L0();
        this.o9 = integer20 == null ? 0x7F150726 : ((int)integer20);  // string:open_with "다른 앱으로 열기"
        Boolean boolean21 = awesomeWebView$Builder0.x0();
        this.p9 = boolean21 == null ? true : boolean21.booleanValue();
        Integer integer21 = awesomeWebView$Builder0.P0();
        this.q9 = integer21 == null ? 0x7F1508E2 : ((int)integer21);  // string:save_photo "이미지 저장"
        Boolean boolean22 = awesomeWebView$Builder0.A0();
        this.r9 = boolean22 == null ? true : boolean22.booleanValue();
        Integer integer22 = awesomeWebView$Builder0.N0();
        this.s9 = integer22 == null ? 0x7F150786 : ((int)integer22);  // string:photo_saved_to "저장 위치"
        Integer integer23 = awesomeWebView$Builder0.M0();
        this.t9 = integer23 == null ? 0x7F150785 : ((int)integer23);  // string:photo_save_failed "이미지 저장 실패"
        Boolean boolean23 = awesomeWebView$Builder0.K();
        this.u9 = boolean23 == null ? true : boolean23.booleanValue();
        Integer integer24 = awesomeWebView$Builder0.J0();
        this.v9 = integer24 == null ? 0x7F150343 : ((int)integer24);  // string:file_chooser "파일 선택"
        List list0 = awesomeWebView$Builder0.z();
        if(list0 == null) {
            list0 = new ArrayList(0);
        }
        this.w9 = list0;
        Integer integer25 = awesomeWebView$Builder0.t();
        this.x9 = integer25 == null ? 0x7F010044 : ((int)integer25);  // anim:modal_activity_close_enter
        Integer integer26 = awesomeWebView$Builder0.u();
        this.y9 = integer26 == null ? 0x7F010045 : ((int)integer26);  // anim:modal_activity_close_exit
        Boolean boolean24 = awesomeWebView$Builder0.x();
        this.z9 = boolean24 == null ? false : boolean24.booleanValue();
        Integer integer27 = awesomeWebView$Builder0.H0();
        this.A9 = integer27 == null ? 0x7F150217 : ((int)integer27);  // string:copied_to_clipboard "주소가 복사 되었습니다"
        this.B9 = awesomeWebView$Builder0.V1();
        this.C9 = awesomeWebView$Builder0.J1();
        this.D9 = awesomeWebView$Builder0.p1() == null ? Boolean.FALSE : awesomeWebView$Builder0.p1();
        this.E9 = awesomeWebView$Builder0.y1() == null ? Boolean.FALSE : awesomeWebView$Builder0.y1();
        this.F9 = awesomeWebView$Builder0.f1() == null ? Boolean.TRUE : awesomeWebView$Builder0.f1();
        this.G9 = awesomeWebView$Builder0.e1();
        this.H9 = awesomeWebView$Builder0.H1() == null ? Boolean.TRUE : awesomeWebView$Builder0.H1();
        this.I9 = awesomeWebView$Builder0.R1();
        this.J9 = awesomeWebView$Builder0.W1();
        this.K9 = awesomeWebView$Builder0.X1();
        this.L9 = awesomeWebView$Builder0.U1();
        this.M9 = awesomeWebView$Builder0.G1();
        this.N9 = awesomeWebView$Builder0.T1();
        this.O9 = awesomeWebView$Builder0.B1();
        this.P9 = awesomeWebView$Builder0.P1();
        this.Q9 = awesomeWebView$Builder0.S1();
        this.R9 = awesomeWebView$Builder0.t1();
        this.S9 = awesomeWebView$Builder0.A1();
        this.T9 = awesomeWebView$Builder0.K1();
        this.U9 = awesomeWebView$Builder0.L1();
        this.V9 = awesomeWebView$Builder0.w1();
        this.W9 = awesomeWebView$Builder0.v1();
        this.X9 = awesomeWebView$Builder0.I1();
        Boolean boolean25 = awesomeWebView$Builder0.n1();
        this.Y9 = boolean25 == null ? false : boolean25.booleanValue();
        Boolean boolean26 = awesomeWebView$Builder0.o1();
        if(boolean26 != null) {
            z = boolean26.booleanValue();
        }
        this.Z9 = z;
        Boolean boolean27 = awesomeWebView$Builder0.F1();
        this.aa = boolean27 == null ? true : boolean27.booleanValue();
        this.ba = awesomeWebView$Builder0.i1();
        this.ca = awesomeWebView$Builder0.g1();
        this.da = awesomeWebView$Builder0.C1();
        this.ea = awesomeWebView$Builder0.j1() == null ? Boolean.TRUE : awesomeWebView$Builder0.j1();
        this.fa = awesomeWebView$Builder0.k1();
        this.ga = awesomeWebView$Builder0.u1();
        this.ha = awesomeWebView$Builder0.z1() == null ? Boolean.TRUE : awesomeWebView$Builder0.z1();
        this.ia = awesomeWebView$Builder0.D1();
        this.ja = awesomeWebView$Builder0.E1();
        this.ka = awesomeWebView$Builder0.x1();
        this.la = awesomeWebView$Builder0.Z1();
        this.ma = awesomeWebView$Builder0.Y1();
        this.na = awesomeWebView$Builder0.N1();
        this.oa = awesomeWebView$Builder0.q1();
        this.pa = awesomeWebView$Builder0.M1();
        this.qa = awesomeWebView$Builder0.O1();
        Boolean boolean28 = awesomeWebView$Builder0.l1();
        this.ra = boolean28 == null ? true : boolean28.booleanValue();
        Boolean boolean29 = awesomeWebView$Builder0.s1();
        this.sa = boolean29 == null ? true : boolean29.booleanValue();
        Boolean boolean30 = awesomeWebView$Builder0.r1();
        this.ta = boolean30 == null ? true : boolean30.booleanValue();
        Boolean boolean31 = awesomeWebView$Builder0.m1();
        if(boolean31 != null) {
            z1 = boolean31.booleanValue();
        }
        this.ua = z1;
        this.ya = awesomeWebView$Builder0.S();
        this.za = awesomeWebView$Builder0.U() == null ? Boolean.TRUE : awesomeWebView$Builder0.U();
        this.Fa = awesomeWebView$Builder0.J() == null ? Boolean.TRUE : awesomeWebView$Builder0.J();
        this.Aa = awesomeWebView$Builder0.i0();
        this.Ba = awesomeWebView$Builder0.H();
        this.Ca = awesomeWebView$Builder0.A();
        this.Da = awesomeWebView$Builder0.Z0();
        this.Ea = awesomeWebView$Builder0.I();
        this.Ia = intent0.getAction();
        this.Ja = intent0.getStringExtra("extraPostArguments");
    }

    public final void h6(int v) {
        this.W8 = v;
    }

    public final void h7(int v) {
        this.g9 = v;
    }

    public final void h8(@m Boolean boolean0) {
        this.X9 = boolean0;
    }

    @Override  // android.os.Handler$Callback
    public boolean handleMessage(@l Message message0) {
        L.p(message0, "msg");
        int v = message0.what;
        if(v == 2) {
            this.rb.removeMessages(1);
            return true;
        }
        if(v == 1) {
            WebView webView0 = this.Ga;
            L.m(webView0);
            WebView.HitTestResult webView$HitTestResult0 = webView0.getHitTestResult();
            L.o(webView$HitTestResult0, "getHitTestResult(...)");
            switch(webView$HitTestResult0.getType()) {
                case 5: 
                case 8: {
                    com.dcinside.app.browser.listeners.a.d(this, this.u, webView$HitTestResult0.getExtra());
                    return true;
                }
                default: {
                    return true;
                }
            }
        }
        return false;
    }

    @m
    public final String i2() {
        return this.Ca;
    }

    public final boolean i3() {
        return this.sb;
    }

    @l
    public final FrameLayout i4() {
        FrameLayout frameLayout0 = this.nb;
        if(frameLayout0 != null) {
            return frameLayout0;
        }
        L.S("webLayout");
        return null;
    }

    @SuppressLint({"SetJavaScriptEnabled", "ClickableViewAccessibility"})
    public final void i5() {
        public static final class f implements View.OnTouchListener {
            private float a;
            private float b;
            private long c;
            final AwesomeWebViewActivity d;

            f(AwesomeWebViewActivity awesomeWebViewActivity0) {
                this.d = awesomeWebViewActivity0;
                super();
            }

            @Override  // android.view.View$OnTouchListener
            public boolean onTouch(@l View view0, @l MotionEvent motionEvent0) {
                L.p(view0, "v");
                L.p(motionEvent0, "event");
                if(view0 == this.d.j4() && motionEvent0.getAction() == 0) {
                    this.a = motionEvent0.getX();
                    this.b = motionEvent0.getY();
                    this.c = System.currentTimeMillis();
                    return false;
                }
                if(view0 == this.d.j4() && motionEvent0.getAction() == 1 && Math.abs(this.a - motionEvent0.getX()) < 50.0f && Math.abs(this.b - motionEvent0.getY()) < 50.0f && System.currentTimeMillis() - this.c < 200L) {
                    this.d.B2().sendEmptyMessageDelayed(1, 500L);
                }
                return false;
            }
        }

        int v = 8;
        if(!this.z) {
            this.S0(this.X3());
            this.X3().setVisibility(8);
        }
        Window window0 = this.getWindow();
        window0.clearFlags(0x4000000);
        window0.addFlags(0x80000000);
        window0.setStatusBarColor(this.w);
        int v1 = Build.VERSION.SDK_INT;
        if(v1 >= 23) {
            if(this.x) {
                window0.getDecorView().setSystemUiVisibility(0x2000);
            }
            else {
                window0.getDecorView().setSystemUiVisibility(0x100);
            }
        }
        this.X3().setBackgroundColor(this.y);
        this.S3().setText(this.M8);
        this.S3().setTextSize(0, this.O8);
        this.S3().setTypeface(com.dcinside.app.browser.helpers.c.a(this, this.P8));
        this.S3().setTextColor(this.Q8);
        this.g4().setVisibility((this.R8 ? 0 : 8));
        this.g4().setText(com.dcinside.app.browser.helpers.d.a(this.Da));
        this.g4().setTextSize(0, this.S8);
        this.g4().setTypeface(com.dcinside.app.browser.helpers.c.a(this, this.T8));
        this.g4().setTextColor(this.U8);
        this.t5();
        this.f2().setBackgroundResource(this.D);
        this.d2().setBackgroundResource(this.D);
        this.y2().setBackgroundResource(this.D);
        this.h3().setBackgroundResource(this.D);
        this.f2().setVisibility((this.E ? 0 : 8));
        this.f2().setEnabled(!this.F);
        if(!this.f9 && !this.h9 && !this.j9 && !this.l9 && !this.n9 && this.w9.isEmpty() || !this.K) {
            this.h3().setVisibility(8);
        }
        else {
            this.h3().setVisibility(0);
        }
        this.h3().setEnabled(!this.L);
        if(this.sa) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this.Ga, true);
        }
        this.A7(this.P1());
        this.Q7(this.S1());
        WebView webView0 = this.Ga;
        L.m(webView0);
        webView0.setWebChromeClient(this.h4());
        WebView webView1 = this.Ga;
        L.m(webView1);
        webView1.setWebViewClient(this.x4());
        WebView webView2 = this.Ga;
        L.m(webView2);
        webView2.setDownloadListener(this.qb);
        WebView webView3 = this.Ga;
        L.m(webView3);
        webView3.setOnTouchListener(new f(this));
        WebView webView4 = this.Ga;
        L.m(webView4);
        WebSettings webSettings0 = webView4.getSettings();
        L.o(webSettings0, "getSettings(...)");
        Boolean boolean0 = this.B9;
        if(boolean0 != null) {
            L.m(boolean0);
            webSettings0.setSupportZoom(boolean0.booleanValue());
        }
        Boolean boolean1 = this.C9;
        if(boolean1 != null) {
            L.m(boolean1);
            webSettings0.setMediaPlaybackRequiresUserGesture(boolean1.booleanValue());
        }
        webSettings0.setBuiltInZoomControls((this.D9 == null ? false : this.D9.booleanValue()));
        webSettings0.setDisplayZoomControls((this.E9 == null ? false : this.E9.booleanValue()));
        Boolean boolean2 = this.F9;
        if(boolean2 != null) {
            L.m(boolean2);
            webSettings0.setAllowFileAccess(boolean2.booleanValue());
        }
        Boolean boolean3 = this.G9;
        if(boolean3 != null) {
            L.m(boolean3);
            webSettings0.setAllowContentAccess(boolean3.booleanValue());
        }
        Boolean boolean4 = this.H9;
        if(boolean4 != null) {
            L.m(boolean4);
            webSettings0.setLoadWithOverviewMode(boolean4.booleanValue());
        }
        Boolean boolean5 = this.I9;
        if(boolean5 != null) {
            L.m(boolean5);
            webSettings0.setSaveFormData(boolean5.booleanValue());
        }
        Integer integer0 = this.J9;
        if(integer0 != null) {
            L.m(integer0);
            webSettings0.setTextZoom(((int)integer0));
        }
        Boolean boolean6 = this.K9;
        if(boolean6 != null) {
            L.m(boolean6);
            webSettings0.setUseWideViewPort(boolean6.booleanValue());
        }
        Boolean boolean7 = this.L9;
        if(boolean7 != null) {
            L.m(boolean7);
            webSettings0.setSupportMultipleWindows(boolean7.booleanValue());
        }
        WebSettings.LayoutAlgorithm webSettings$LayoutAlgorithm0 = this.M9;
        if(webSettings$LayoutAlgorithm0 != null) {
            webSettings0.setLayoutAlgorithm(webSettings$LayoutAlgorithm0);
        }
        String s = this.N9;
        if(s != null) {
            webSettings0.setStandardFontFamily(s);
        }
        String s1 = this.O9;
        if(s1 != null) {
            webSettings0.setFixedFontFamily(s1);
        }
        String s2 = this.P9;
        if(s2 != null) {
            webSettings0.setSansSerifFontFamily(s2);
        }
        String s3 = this.Q9;
        if(s3 != null) {
            webSettings0.setSerifFontFamily(s3);
        }
        String s4 = this.R9;
        if(s4 != null) {
            webSettings0.setCursiveFontFamily(s4);
        }
        String s5 = this.S9;
        if(s5 != null) {
            webSettings0.setFantasyFontFamily(s5);
        }
        Integer integer1 = this.T9;
        if(integer1 != null) {
            L.m(integer1);
            webSettings0.setMinimumFontSize(((int)integer1));
        }
        Integer integer2 = this.U9;
        if(integer2 != null) {
            L.m(integer2);
            webSettings0.setMinimumLogicalFontSize(((int)integer2));
        }
        Integer integer3 = this.V9;
        if(integer3 != null) {
            L.m(integer3);
            webSettings0.setDefaultFontSize(((int)integer3));
        }
        Integer integer4 = this.W9;
        if(integer4 != null) {
            L.m(integer4);
            webSettings0.setDefaultFixedFontSize(((int)integer4));
        }
        Boolean boolean8 = this.X9;
        if(boolean8 != null) {
            L.m(boolean8);
            webSettings0.setLoadsImagesAutomatically(boolean8.booleanValue());
        }
        webSettings0.setBlockNetworkImage(this.Y9);
        webSettings0.setBlockNetworkLoads(this.Z9);
        webSettings0.setJavaScriptEnabled(this.aa);
        Boolean boolean9 = this.ba;
        if(boolean9 != null) {
            L.m(boolean9);
            webSettings0.setAllowUniversalAccessFromFileURLs(boolean9.booleanValue());
        }
        Boolean boolean10 = this.ca;
        if(boolean10 != null) {
            L.m(boolean10);
            webSettings0.setAllowFileAccessFromFileURLs(boolean10.booleanValue());
        }
        String s6 = this.da;
        if(s6 != null) {
            webSettings0.setGeolocationDatabasePath(s6);
        }
        Boolean boolean11 = this.ga;
        if(boolean11 != null) {
            L.m(boolean11);
            webSettings0.setDatabaseEnabled(boolean11.booleanValue());
        }
        Boolean boolean12 = this.ha;
        if(boolean12 != null) {
            L.m(boolean12);
            webSettings0.setDomStorageEnabled(boolean12.booleanValue());
        }
        Boolean boolean13 = this.ia;
        if(boolean13 != null) {
            L.m(boolean13);
            webSettings0.setGeolocationEnabled(boolean13.booleanValue());
        }
        Boolean boolean14 = this.ja;
        if(boolean14 != null) {
            L.m(boolean14);
            webSettings0.setJavaScriptCanOpenWindowsAutomatically(boolean14.booleanValue());
        }
        String s7 = this.ka;
        if(s7 != null) {
            webSettings0.setDefaultTextEncodingName(s7);
        }
        if(this.la != null) {
            if(L.g(Boolean.TRUE, this.ma)) {
                webSettings0.setUserAgentString(webSettings0.getUserAgentString() + " " + this.la);
            }
            else {
                webSettings0.setUserAgentString(this.la);
            }
        }
        Boolean boolean15 = this.na;
        if(boolean15 != null) {
            L.m(boolean15);
            webSettings0.setNeedInitialFocus(boolean15.booleanValue());
        }
        Integer integer5 = this.oa;
        if(integer5 != null) {
            L.m(integer5);
            webSettings0.setCacheMode(((int)integer5));
        }
        Integer integer6 = this.pa;
        L.m(integer6);
        webSettings0.setMixedContentMode(((int)integer6));
        Boolean boolean16 = this.qa;
        if(boolean16 != null && v1 >= 23) {
            L.m(boolean16);
            webSettings0.setOffscreenPreRaster(boolean16.booleanValue());
        }
        this.z2().setVisibility((!this.M || !this.N ? 8 : 0));
        this.n2().setVisibility((!this.M || this.N ? 8 : 0));
        if(this.N) {
            Bitmap bitmap0 = com.dcinside.app.browser.helpers.a.c(Dk.h(this), ((int)this.P), this.O);
            BitmapDrawable bitmapDrawable0 = new BitmapDrawable(this.getResources(), bitmap0);
            this.z2().setBackground(bitmapDrawable0);
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.z2().getLayoutParams();
            L.n(viewGroup$LayoutParams0, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            ((LayoutParams)viewGroup$LayoutParams0).height = (int)this.P;
            this.z2().setLayoutParams(((LayoutParams)viewGroup$LayoutParams0));
        }
        else {
            this.n2().setBackgroundColor(this.O);
            ViewGroup.LayoutParams viewGroup$LayoutParams1 = this.n2().getLayoutParams();
            L.n(viewGroup$LayoutParams1, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            ((LinearLayout.LayoutParams)viewGroup$LayoutParams1).height = (int)this.P;
            this.n2().setLayoutParams(((LinearLayout.LayoutParams)viewGroup$LayoutParams1));
        }
        this.k3().setVisibility((this.Q ? 0 : 8));
        DrawableCompat.o(DrawableCompat.r(this.k3().getProgressDrawable()), ColorStateList.valueOf(this.X));
        this.k3().setMinimumHeight(((int)this.Y));
        LayoutParams coordinatorLayout$LayoutParams0 = new LayoutParams(-1, ((int)this.Y));
        float f = this.z ? this.getResources().getDimension(0x7F070402) : 0.0f;  // dimen:toolbarHeight
        switch((this.Z == null ? -1 : com.dcinside.app.browser.AwesomeWebViewActivity.d.a[this.Z.ordinal()])) {
            case 1: {
                coordinatorLayout$LayoutParams0.setMargins(0, 0, 0, 0);
                break;
            }
            case 2: {
                coordinatorLayout$LayoutParams0.setMargins(0, ((int)f) - ((int)this.Y), 0, 0);
                break;
            }
            case 3: {
                coordinatorLayout$LayoutParams0.setMargins(0, ((int)f), 0, 0);
                break;
            }
            case 4: {
                coordinatorLayout$LayoutParams0.setMargins(0, Dk.e(this) - ((int)this.Y), 0, 0);
                break;
            }
            default: {
                coordinatorLayout$LayoutParams0.setMargins(0, 0, 0, 0);
            }
        }
        this.k3().setLayoutParams(coordinatorLayout$LayoutParams0);
        ProgressBar progressBar0 = this.Ka;
        if(progressBar0 != null) {
            if(this.Q) {
                progressBar0.setVisibility(0);
            }
            Drawable drawable0 = progressBar0.getIndeterminateDrawable();
            Drawable drawable1 = drawable0 == null ? null : drawable0.mutate();
            PorterDuffColorFilter porterDuffColorFilter0 = new PorterDuffColorFilter(this.X, PorterDuff.Mode.SRC_IN);
            if(drawable1 != null) {
                drawable1.setColorFilter(porterDuffColorFilter0);
            }
            progressBar0.setIndeterminateDrawable(drawable1);
        }
        GradientDrawable gradientDrawable0 = new GradientDrawable();
        gradientDrawable0.setCornerRadius(this.getResources().getDimension(0x7F07007E));  // dimen:defaultMenuCornerRadius
        gradientDrawable0.setColor(this.V8);
        this.K2().setBackground(gradientDrawable0);
        this.q3().setShadowColor(this.W8);
        this.q3().setShadowSize(this.X8);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
        int v2 = (int)(this.getResources().getDimension(0x7F070081) - this.X8);  // dimen:defaultMenuLayoutMargin
        relativeLayout$LayoutParams0.setMargins(0, v2, v2, 0);
        relativeLayout$LayoutParams0.addRule(10);
        relativeLayout$LayoutParams0.addRule((this.v ? 9 : 11));
        this.q3().setLayoutParams(relativeLayout$LayoutParams0);
        this.V2().setVisibility((this.f9 ? 0 : 8));
        this.V2().setBackgroundResource(this.Y8);
        this.V2().setGravity(this.c9);
        this.W2().setText(this.g9);
        this.W2().setTextSize(0, this.Z8);
        this.W2().setTypeface(com.dcinside.app.browser.helpers.c.a(this, this.a9));
        this.W2().setTextColor(this.b9);
        this.W2().setPadding(((int)this.d9), 0, ((int)this.e9), 0);
        this.Q2().setVisibility((this.h9 ? 0 : 8));
        this.Q2().setBackgroundResource(this.Y8);
        this.Q2().setGravity(this.c9);
        this.R2().setText(this.i9);
        this.R2().setTextSize(0, this.Z8);
        this.R2().setTypeface(com.dcinside.app.browser.helpers.c.a(this, this.a9));
        this.R2().setTextColor(this.b9);
        this.R2().setPadding(((int)this.d9), 0, ((int)this.e9), 0);
        this.Y2().setVisibility((this.j9 ? 0 : 8));
        this.Y2().setBackgroundResource(this.Y8);
        this.Y2().setGravity(this.c9);
        this.Z2().setText(this.k9);
        this.Z2().setTextSize(0, this.Z8);
        this.Z2().setTypeface(com.dcinside.app.browser.helpers.c.a(this, this.a9));
        this.Z2().setTextColor(this.b9);
        this.Z2().setPadding(((int)this.d9), 0, ((int)this.e9), 0);
        this.M2().setVisibility((this.l9 ? 0 : 8));
        this.M2().setBackgroundResource(this.Y8);
        this.M2().setGravity(this.c9);
        this.N2().setText(this.m9);
        this.N2().setTextSize(0, this.Z8);
        this.N2().setTypeface(com.dcinside.app.browser.helpers.c.a(this, this.a9));
        this.N2().setTextColor(this.b9);
        this.N2().setPadding(((int)this.d9), 0, ((int)this.e9), 0);
        LinearLayout linearLayout0 = this.T2();
        if(this.n9) {
            v = 0;
        }
        linearLayout0.setVisibility(v);
        this.T2().setBackgroundResource(this.Y8);
        this.T2().setGravity(this.c9);
        this.U2().setText(this.o9);
        this.U2().setTextSize(0, this.Z8);
        this.U2().setTypeface(com.dcinside.app.browser.helpers.c.a(this, this.a9));
        this.U2().setTextColor(this.b9);
        this.U2().setPadding(((int)this.d9), 0, ((int)this.e9), 0);
        ViewGroup viewGroup0 = (ViewGroup)this.findViewById(0x1020002);
        for(Object object0: this.w9) {
            View view0 = LayoutInflater.from(this).inflate(0x7F0E01B7, viewGroup0, false);  // layout:view_custom_menu
            LinearLayout linearLayout1 = (LinearLayout)view0.findViewById(0x7F0B0324);  // id:customMenuLayout
            TextView textView0 = (TextView)linearLayout1.findViewById(0x7F0B0323);  // id:customMenu
            linearLayout1.setBackgroundResource(this.Y8);
            linearLayout1.setGravity(this.c9);
            textView0.setText(((CustomMenu)object0).c());
            textView0.setTextSize(0, this.Z8);
            textView0.setTypeface(com.dcinside.app.browser.helpers.c.a(this, this.a9));
            textView0.setTextColor(this.b9);
            textView0.setPadding(((int)this.d9), 0, ((int)this.e9), 0);
            linearLayout1.setOnClickListener((View view0) -> {
                L.p(this, "this$0");
                L.p(this, "$this_run");
                L.p(((CustomMenu)object0), "$customMenu");
                com.dcinside.app.browser.listeners.a.f(this, this.u, ((CustomMenu)object0).a());
                this.g5();
            });
            this.K2().addView(view0, -1, -2);
        }
    }

    public final void i6(float f) {
        this.X8 = f;
    }

    public final void i7(int v) {
        this.q9 = v;
    }

    public final void i8(@m Boolean boolean0) {
        this.C9 = boolean0;
    }

    public final boolean j2() {
        return this.H;
    }

    @m
    public final String j3() {
        return this.Ja;
    }

    @m
    public final WebView j4() {
        return this.Ga;
    }

    // 检测为 Lambda 实现
    private static final void j5(AwesomeWebViewActivity awesomeWebViewActivity0, AwesomeWebViewActivity awesomeWebViewActivity1, CustomMenu customMenu0, View view0) [...]

    public final void j6(@l LinearLayout linearLayout0) {
        L.p(linearLayout0, "<set-?>");
        this.fb = linearLayout0;
    }

    public final void j7(int v) {
        this.k9 = v;
    }

    public final void j8(@m Integer integer0) {
        this.T9 = integer0;
    }

    public final boolean k2() {
        return this.F;
    }

    @l
    public final ProgressBar k3() {
        ProgressBar progressBar0 = this.Za;
        if(progressBar0 != null) {
            return progressBar0;
        }
        L.S("progressBar");
        return null;
    }

    @m
    public final Boolean k4() {
        return this.G9;
    }

    public final void k5() {
        if(!this.z) {
            this.S0(this.X3());
            this.X3().setVisibility(8);
        }
        float f = 0.0f;
        float f1 = this.z ? this.getResources().getDimension(0x7F070402) : 0.0f;  // dimen:toolbarHeight
        if(!this.N) {
            f1 += this.P;
        }
        LayoutParams coordinatorLayout$LayoutParams0 = new LayoutParams(-1, ((int)f1));
        this.c2().setLayoutParams(coordinatorLayout$LayoutParams0);
        this.g2().requestLayout();
        float f2 = this.z ? this.getResources().getDimension(0x7F070402) : 0.0f;  // dimen:toolbarHeight
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, ((int)f2));
        this.Z3().setMinimumHeight(((int)f2));
        this.Z3().setLayoutParams(linearLayout$LayoutParams0);
        this.g2().requestLayout();
        int v = this.J2();
        this.S3().setMaxWidth(v);
        this.g4().setMaxWidth(v);
        this.t5();
        int v1 = 0x7F080159;  // drawable:close
        this.B8(this.f2(), (this.v ? 0x7F08041F : 0x7F080159));  // drawable:more
        this.B8(this.d2(), 0x7F080102);  // drawable:back
        this.B8(this.y2(), 0x7F0801FA);  // drawable:forward
        AppCompatImageButton appCompatImageButton0 = this.h3();
        if(!this.v) {
            v1 = 0x7F08041F;  // drawable:more
        }
        this.B8(appCompatImageButton0, v1);
        if(this.N) {
            float f3 = this.z ? this.getResources().getDimension(0x7F070402) : 0.0f;  // dimen:toolbarHeight
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.z2().getLayoutParams();
            L.n(viewGroup$LayoutParams0, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            ((LayoutParams)viewGroup$LayoutParams0).setMargins(0, ((int)f3), 0, 0);
            this.z2().setLayoutParams(((LayoutParams)viewGroup$LayoutParams0));
        }
        this.k3().setMinimumHeight(((int)this.Y));
        LayoutParams coordinatorLayout$LayoutParams1 = new LayoutParams(-1, ((int)this.Y));
        float f4 = this.z ? this.getResources().getDimension(0x7F070402) : 0.0f;  // dimen:toolbarHeight
        switch((this.Z == null ? -1 : com.dcinside.app.browser.AwesomeWebViewActivity.d.a[this.Z.ordinal()])) {
            case 1: {
                coordinatorLayout$LayoutParams1.setMargins(0, 0, 0, 0);
                break;
            }
            case 2: {
                coordinatorLayout$LayoutParams1.setMargins(0, ((int)f4) - ((int)this.Y), 0, 0);
                break;
            }
            case 3: {
                coordinatorLayout$LayoutParams1.setMargins(0, ((int)f4), 0, 0);
                break;
            }
            case 4: {
                coordinatorLayout$LayoutParams1.setMargins(0, Dk.e(this) - ((int)this.Y), 0, 0);
                break;
            }
            default: {
                coordinatorLayout$LayoutParams1.setMargins(0, 0, 0, 0);
            }
        }
        this.k3().setLayoutParams(coordinatorLayout$LayoutParams1);
        if(this.z) {
            f = this.getResources().getDimension(0x7F070402);  // dimen:toolbarHeight
        }
        float f5 = ((float)Dk.e(this)) - f - 0.0f;
        if(this.M && !this.N) {
            f5 -= this.P;
        }
        this.R3().setMinimumHeight(((int)f5));
        LayoutParams coordinatorLayout$LayoutParams2 = new LayoutParams(-1, -1);
        coordinatorLayout$LayoutParams2.setMargins(0, ((int)f), 0, 0);
        this.R3().setLayoutParams(coordinatorLayout$LayoutParams2);
    }

    public final void k6(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.gb = textView0;
    }

    public final void k7(@l FrameLayout frameLayout0) {
        L.p(frameLayout0, "<set-?>");
        this.ob = frameLayout0;
    }

    public final void k8(@m Integer integer0) {
        this.U9 = integer0;
    }

    public final boolean l2() {
        return this.J;
    }

    public final int l3() {
        return this.X;
    }

    @m
    public final Boolean l4() {
        return this.F9;
    }

    public final void l5() {
        WebView webView0 = this.Ga;
        if(webView0 != null) {
            webView0.post(() -> {
                byte[] arr_b1;
                byte[] arr_b;
                L.p(this, "this$0");
                String s = this.Ca;
                if(s != null) {
                    WebView webView0 = this.Ga;
                    L.m(webView0);
                    webView0.loadData(s, this.Aa, this.Ba);
                    return;
                }
                String s1 = this.Da;
                String s2 = this.Ja;
                if(s1 != null) {
                    if(this.Ea == null) {
                        if(L.g(this.Ia, "actionLoadUrlPost")) {
                            if(s2 == null) {
                                arr_b = new byte[0];
                            }
                            else {
                                arr_b = s2.getBytes(kotlin.text.f.b);
                                L.o(arr_b, "getBytes(...)");
                                if(arr_b == null) {
                                    arr_b = new byte[0];
                                }
                            }
                            WebView webView1 = this.Ga;
                            L.m(webView1);
                            webView1.postUrl(s1, arr_b);
                            return;
                        }
                        WebView webView2 = this.Ga;
                        L.m(webView2);
                        webView2.loadUrl(s1);
                        return;
                    }
                    if(L.g(this.Ia, "actionLoadUrlPost")) {
                        if(s2 == null) {
                            arr_b1 = new byte[0];
                        }
                        else {
                            arr_b1 = s2.getBytes(kotlin.text.f.b);
                            L.o(arr_b1, "getBytes(...)");
                            if(arr_b1 == null) {
                                arr_b1 = new byte[0];
                            }
                        }
                        WebView webView3 = this.Ga;
                        L.m(webView3);
                        webView3.postUrl(s1, arr_b1);
                        return;
                    }
                    WebView webView4 = this.Ga;
                    L.m(webView4);
                    webView4.loadUrl(s1);
                }
            });
        }
    }

    public final void l6(@l RelativeLayout relativeLayout0) {
        L.p(relativeLayout0, "<set-?>");
        this.ab = relativeLayout0;
    }

    public final void l7(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.Pa = textView0;
    }

    public final void l8(@m Integer integer0) {
        this.pa = integer0;
    }

    public final boolean m2() {
        return this.L;
    }

    public final float m3() {
        return this.Y;
    }

    @m
    public final Boolean m4() {
        return this.ca;
    }

    // 检测为 Lambda 实现
    private static final void m5(AwesomeWebViewActivity awesomeWebViewActivity0) [...]

    public final void m6(@l LinearLayout linearLayout0) {
        L.p(linearLayout0, "<set-?>");
        this.lb = linearLayout0;
    }

    public final void m7(@m String s) {
        this.M8 = s;
    }

    public final void m8(@m Boolean boolean0) {
        this.na = boolean0;
    }

    @l
    public final View n2() {
        View view0 = this.Ya;
        if(view0 != null) {
            return view0;
        }
        L.S("divider");
        return null;
    }

    @m
    public final X.a n3() {
        return this.Z;
    }

    @m
    public final Boolean n4() {
        return this.ba;
    }

    public final void n5(@l String s) {
        L.p(s, "url");
        try {
            try {
                Intent intent0 = new Intent("android.intent.action.VIEW");
                intent0.setData(Uri.parse(("market://details?id=" + s)));
                intent0.setFlags(0x10000000);
                this.startActivity(intent0);
            }
            catch(ActivityNotFoundException unused_ex) {
                Intent intent1 = new Intent("android.intent.action.VIEW");
                intent1.setData(Uri.parse(("http://play.google.com/store/apps/details?id=" + s)));
                intent1.setFlags(0x10000000);
                this.startActivity(intent1);
            }
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
    }

    public final void n6(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.mb = textView0;
    }

    public final void n7(@l String s) {
        L.p(s, "<set-?>");
        this.P8 = s;
    }

    public final void n8(@m Boolean boolean0) {
        this.qa = boolean0;
    }

    public final int o2() {
        return this.O;
    }

    public final boolean o3() {
        return this.v;
    }

    @m
    public final Boolean o4() {
        return this.ea;
    }

    public final void o5() {
        String s = B.E.k0();
        if(s != null) {
            this.sb = true;
            WebView webView0 = this.Ga;
            if(webView0 != null) {
                String s1 = webView0.getUrl();
                if(s1 != null) {
                    L.m(s1);
                    WebView webView1 = this.Ga;
                    if(webView1 != null) {
                        webView1.loadUrl(s1 + "&confirm_id=" + s);
                    }
                }
            }
        }
    }

    public final void o6(@l LinearLayout linearLayout0) {
        L.p(linearLayout0, "<set-?>");
        this.db = linearLayout0;
    }

    public final void o7(float f) {
        this.O8 = f;
    }

    public final void o8(@m ProgressBar progressBar0) {
        this.Ka = progressBar0;
    }

    @Override  // com.dcinside.app.base.d
    protected void onActivityResult(int v, int v1, @m Intent intent0) {
        Uri[] arr_uri;
        super.onActivityResult(v, v1, intent0);
        if(v == 3080) {
            if(intent0 != null) {
                String s = intent0.getStringExtra("com.dcinside.app.EXTRA_LOGIN_URL_RESULT");
                if(s != null) {
                    this.sb = true;
                    WebView webView0 = this.Ga;
                    if(webView0 != null) {
                        String s1 = webView0.getUrl();
                        if(s1 != null) {
                            L.m(s1);
                            WebView webView1 = this.Ga;
                            if(webView1 != null) {
                                webView1.loadUrl(s1 + "&confirm_id=" + s);
                            }
                        }
                    }
                }
            }
            return;
        }
        if(v1 != -1 || v != 1) {
            arr_uri = null;
        }
        else {
            if(this.xa == null) {
                return;
            }
            if(intent0 == null || intent0.getDataString() == null) {
                String s3 = this.va;
                if(s3 == null) {
                    arr_uri = null;
                }
                else {
                    arr_uri = new Uri[1];
                    Uri uri1 = Uri.parse(s3);
                    L.o(uri1, "parse(...)");
                    arr_uri[0] = uri1;
                }
            }
            else {
                String s2 = intent0.getDataString();
                if(s2 == null) {
                    arr_uri = null;
                }
                else {
                    arr_uri = new Uri[1];
                    Uri uri0 = Uri.parse(s2);
                    L.o(uri0, "parse(...)");
                    arr_uri[0] = uri0;
                }
            }
        }
        ValueCallback valueCallback0 = this.xa;
        if(valueCallback0 != null) {
            valueCallback0.onReceiveValue(arr_uri);
        }
        this.xa = null;
    }

    @Override  // com.dcinside.app.base.d
    public void onBackPressed() {
        if(this.h4() instanceof b) {
            WebChromeClient webChromeClient0 = this.h4();
            L.n(webChromeClient0, "null cannot be cast to non-null type com.dcinside.app.browser.AwesomeWebViewActivity.MyWebChromeClient");
            if(((b)webChromeClient0).b()) {
                return;
            }
        }
        if(this.S2().getVisibility() == 0) {
            this.g5();
            return;
        }
        if(!this.z9) {
            WebView webView0 = this.Ga;
            L.m(webView0);
            if(webView0.canGoBack()) {
                WebView webView1 = this.Ga;
                L.m(webView1);
                webView1.goBack();
                return;
            }
        }
        this.Y1();
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(@l View view0) {
        L.p(view0, "v");
        switch(view0.getId()) {
            case 0x7F0B0182: {  // id:back
                if(this.v) {
                    WebView webView0 = this.Ga;
                    L.m(webView0);
                    webView0.goForward();
                    return;
                }
                WebView webView1 = this.Ga;
                L.m(webView1);
                webView1.goBack();
                return;
            }
            case 0x7F0B02BD: {  // id:close
                if(this.v) {
                    this.z8();
                    return;
                }
                this.Y1();
                return;
            }
            case 0x7F0B04BF: {  // id:forward
                if(this.v) {
                    WebView webView2 = this.Ga;
                    L.m(webView2);
                    webView2.goBack();
                    return;
                }
                WebView webView3 = this.Ga;
                L.m(webView3);
                webView3.goForward();
                return;
            }
            case 0x7F0B0808: {  // id:menuCopyLink
                Object object0 = this.getSystemService("clipboard");
                ClipboardManager clipboardManager0 = object0 instanceof ClipboardManager ? ((ClipboardManager)object0) : null;
                if(clipboardManager0 != null) {
                    WebView webView4 = this.Ga;
                    L.m(webView4);
                    clipboardManager0.setText(webView4.getUrl());
                }
                Snackbar snackbar0 = Snackbar.E0(this.g2(), this.getString(this.A9), 0);
                L.o(snackbar0, "make(...)");
                View view1 = snackbar0.M();
                L.o(view1, "getView(...)");
                view1.setBackgroundColor(this.y);
                if(view1 instanceof ViewGroup) {
                    this.A8(((ViewGroup)view1));
                }
                snackbar0.m0();
                this.g5();
                return;
            }
            case 0x7F0B080A: {  // id:menuFind
                WebView webView5 = this.Ga;
                if(webView5 != null) {
                    webView5.showFindDialog("", true);
                }
                this.g5();
                return;
            }
            case 0x7F0B080C: {  // id:menuLayout
                this.g5();
                return;
            }
            case 0x7F0B080D: {  // id:menuOpenWith
                WebView webView6 = this.Ga;
                L.m(webView6);
                this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(webView6.getUrl())));
                this.g5();
                return;
            }
            case 0x7F0B080F: {  // id:menuRefresh
                WebView webView7 = this.Ga;
                if(webView7 != null) {
                    webView7.reload();
                }
                this.g5();
                return;
            }
            case 0x7F0B0811: {  // id:menuShareVia
                Intent intent0 = new Intent();
                intent0.setAction("android.intent.action.SEND");
                WebView webView8 = this.Ga;
                L.m(webView8);
                intent0.putExtra("android.intent.extra.TEXT", webView8.getUrl());
                intent0.setType("text/plain");
                this.startActivity(Intent.createChooser(intent0, this.getResources().getString(this.k9)));
                this.g5();
                return;
            }
            case 0x7F0B087F: {  // id:more
                if(this.v) {
                    this.Y1();
                    return;
                }
                this.z8();
            }
        }
    }

    @Override  // androidx.appcompat.app.AppCompatActivity
    public void onConfigurationChanged(@l Configuration configuration0) {
        L.p(configuration0, "newConfig");
        super.onConfigurationChanged(configuration0);
        int v = configuration0.orientation;
        if(v == 2) {
            this.k5();
            return;
        }
        if(v == 1) {
            this.k5();
        }
    }

    @Override  // com.dcinside.app.base.d
    protected void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        this.h5();
        this.setContentView(0x7F0E00A0);  // layout:awesome_web_view
        this.O1();
        this.k5();
        this.i5();
        this.r5();
    }

    @Override  // com.dcinside.app.base.d
    protected void onDestroy() {
        super.onDestroy();
        this.getSupportFragmentManager().d("simpleLoginResultKey");
        n n0 = this.Ha;
        if(n0 != null) {
            n0.l();
        }
        Dialog dialog0 = this.pb;
        if(dialog0 != null) {
            dialog0.dismiss();
        }
        com.dcinside.app.browser.listeners.a.z(this, this.u);
        WebView webView0 = this.Ga;
        if(webView0 == null) {
            return;
        }
        webView0.removeJavascriptInterface("DcJsCallback");
        webView0.onPause();
        this.U1();
    }

    @Override  // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionDenied(@l PermissionDeniedResponse permissionDeniedResponse0) {
        L.p(permissionDeniedResponse0, "response");
        String s = permissionDeniedResponse0.getPermissionName();
        this.pb = new Builder(this).F(0x7F150763).k(0x7F150761).setPositiveButton(0x7F150762, (DialogInterface dialogInterface0, int v) -> {
            L.p(this, "this$0");
            L.m(s);
            this.u5(s);
        }).setNegativeButton(0x1040000, null).I();
    }

    @Override  // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionGranted(@l PermissionGrantedResponse permissionGrantedResponse0) {
        L.p(permissionGrantedResponse0, "response");
    }

    @Override  // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionRationaleShouldBeShown(@l com.karumi.dexter.listener.PermissionRequest permissionRequest0, @l PermissionToken permissionToken0) {
        L.p(permissionRequest0, "permission");
        L.p(permissionToken0, "token");
        permissionToken0.continuePermissionRequest();
    }

    @Override  // androidx.appcompat.app.AppCompatActivity
    protected void onPostCreate(@m Bundle bundle0) {
        super.onPostCreate(bundle0);
        this.l5();
    }

    public final float p2() {
        return this.P;
    }

    @m
    public final n p3() {
        return this.Ha;
    }

    @m
    public final String p4() {
        return this.fa;
    }

    // 检测为 Lambda 实现
    private static final void p5(AwesomeWebViewActivity awesomeWebViewActivity0, String s, DialogInterface dialogInterface0, int v) [...]

    public final void p6(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.eb = textView0;
    }

    public final void p7(int v) {
        this.Q8 = v;
    }

    public final void p8(@m String s) {
        this.P9 = s;
    }

    @l
    public final DownloadListener q2() {
        return this.qb;
    }

    @l
    public final ShadowLayout q3() {
        ShadowLayout shadowLayout0 = this.bb;
        if(shadowLayout0 != null) {
            return shadowLayout0;
        }
        L.S("shadowLayout");
        return null;
    }

    public final boolean q4() {
        return this.ra;
    }

    @l
    public final String[] q5(@l String[] arr_s) {
        L.p(arr_s, "resource");
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            if(L.g(s, "android.webkit.resource.AUDIO_CAPTURE")) {
                arrayList0.add("android.permission.RECORD_AUDIO");
            }
            if(L.g(s, "android.webkit.resource.VIDEO_CAPTURE")) {
                arrayList0.add("android.permission.CAMERA");
            }
        }
        return (String[])arrayList0.toArray(new String[0]);
    }

    public final void q6(int v) {
        this.Y8 = v;
    }

    public final void q7(@l Toolbar toolbar0) {
        L.p(toolbar0, "<set-?>");
        this.Na = toolbar0;
    }

    public final void q8(@m Boolean boolean0) {
        this.I9 = boolean0;
    }

    @m
    public final String r2() {
        return this.Ba;
    }

    public final boolean r3() {
        return this.M;
    }

    public final boolean r4() {
        return this.ua;
    }

    public final void r5() {
        this.getSupportFragmentManager().c("simpleLoginResultKey", this, (String s, Bundle bundle0) -> {
            L.p(this, "this$0");
            L.p(s, "<anonymous parameter 0>");
            L.p(bundle0, "<anonymous parameter 1>");
            this.o5();
        });
    }

    public final void r6(@l LinearLayout linearLayout0) {
        L.p(linearLayout0, "<set-?>");
        this.hb = linearLayout0;
    }

    public final void r7(int v) {
        this.y = v;
    }

    public final void r8(@m String s) {
        this.Q9 = s;
    }

    @m
    public final Map s2() {
        return this.Ea;
    }

    public final boolean s3() {
        return this.G;
    }

    public final boolean s4() {
        return this.Y9;
    }

    // 检测为 Lambda 实现
    private static final void s5(AwesomeWebViewActivity awesomeWebViewActivity0, String s, Bundle bundle0) [...]

    public final void s6(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.ib = textView0;
    }

    public final void s7(@l RelativeLayout relativeLayout0) {
        L.p(relativeLayout0, "<set-?>");
        this.Oa = relativeLayout0;
    }

    public final void s8(@m String s) {
        this.N9 = s;
    }

    public final void setDivider(@l View view0) {
        L.p(view0, "<set-?>");
        this.Ya = view0;
    }

    public final void setGradient(@l View view0) {
        L.p(view0, "<set-?>");
        this.Xa = view0;
    }

    @Override  // com.dcinside.app.base.d
    public boolean t1() {
        return false;
    }

    @m
    public final Boolean t2() {
        return this.Fa;
    }

    public final boolean t3() {
        return this.E;
    }

    public final boolean t4() {
        return this.Z9;
    }

    public final void t5() {
        int v;
        WebView webView0 = this.Ga;
        L.m(webView0);
        if(webView0.canGoBack()) {
            v = Dk.h(this);
        }
        else {
            WebView webView1 = this.Ga;
            L.m(webView1);
            v = webView1.canGoForward() ? Dk.h(this) : Dk.h(this);
        }
        this.S3().setMaxWidth(v);
        this.g4().setMaxWidth(v);
        this.S3().requestLayout();
        this.g4().requestLayout();
    }

    public final void t6(int v) {
        this.b9 = v;
    }

    public final void t7(boolean z) {
        this.z = z;
    }

    public final void t8(@m Boolean boolean0) {
        this.L9 = boolean0;
    }

    public final boolean u2() {
        return this.u9;
    }

    public final boolean u3() {
        return this.I;
    }

    @m
    public final Boolean u4() {
        return this.D9;
    }

    public final boolean u5(@l String s) {
        L.p(s, "permission");
        if(PermissionChecker.d(this, s) != 0) {
            Dexter.withActivity(this).withPermission(s).withListener(this).check();
            return true;
        }
        return false;
    }

    public final void u6(@l String s) {
        L.p(s, "<set-?>");
        this.a9 = s;
    }

    public final void u7(boolean z) {
        this.N8 = z;
    }

    public final void u8(@m Boolean boolean0) {
        this.B9 = boolean0;
    }

    @m
    public final String v2() {
        return this.va;
    }

    public final boolean v3() {
        return this.K;
    }

    @m
    public final Integer v4() {
        return this.oa;
    }

    public final void v5(@m String s) {
        this.Ia = s;
    }

    public final void v6(int v) {
        this.c9 = v;
    }

    public final void v7(@m String s) {
        this.Da = s;
    }

    public final void v8(@m Integer integer0) {
        this.J9 = integer0;
    }

    @m
    public final ValueCallback w2() {
        return this.wa;
    }

    public final boolean w3() {
        return this.l9;
    }

    public final boolean w4() {
        return this.ta;
    }

    public final void w5(int v) {
        this.x9 = v;
    }

    public final void w6(float f) {
        this.d9 = f;
    }

    public final void w7(int v) {
        this.U8 = v;
    }

    public final void w8(@m Boolean boolean0) {
        this.K9 = boolean0;
    }

    @m
    public final ValueCallback x2() {
        return this.xa;
    }

    public final boolean x3() {
        return this.h9;
    }

    @l
    public final WebViewClient x4() {
        WebViewClient webViewClient0 = this.Wa;
        if(webViewClient0 != null) {
            return webViewClient0;
        }
        L.S("webViewClient");
        return null;
    }

    public final void x5(int v) {
        this.y9 = v;
    }

    public final void x6(float f) {
        this.e9 = f;
    }

    public final void x7(@l String s) {
        L.p(s, "<set-?>");
        this.T8 = s;
    }

    public final void x8(@m Boolean boolean0) {
        this.ma = boolean0;
    }

    @l
    public final AppCompatImageButton y2() {
        AppCompatImageButton appCompatImageButton0 = this.Ta;
        if(appCompatImageButton0 != null) {
            return appCompatImageButton0;
        }
        L.S("forward");
        return null;
    }

    public final boolean y3() {
        return this.n9;
    }

    public final boolean y4() {
        return this.sa;
    }

    public final void y5(@l AppBarLayout appBarLayout0) {
        L.p(appBarLayout0, "<set-?>");
        this.Ma = appBarLayout0;
    }

    public final void y6(float f) {
        this.Z8 = f;
    }

    public final void y7(float f) {
        this.S8 = f;
    }

    public final void y8(@m String s) {
        this.la = s;
    }

    @l
    public final View z2() {
        View view0 = this.Xa;
        if(view0 != null) {
            return view0;
        }
        L.S("gradient");
        return null;
    }

    public final boolean z3() {
        return this.f9;
    }

    @m
    public final String z4() {
        return this.R9;
    }

    public final void z5(@l AppCompatImageButton appCompatImageButton0) {
        L.p(appCompatImageButton0, "<set-?>");
        this.Sa = appCompatImageButton0;
    }

    public final void z6(@m String s) {
        this.Aa = s;
    }

    public final void z7(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.Qa = textView0;
    }

    public final void z8() {
        this.S2().setVisibility(0);
        Animation animation0 = AnimationUtils.loadAnimation(this, 0x7F010051);  // anim:popup_flyout_show
        this.q3().startAnimation(animation0);
    }
}

