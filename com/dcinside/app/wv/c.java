package com.dcinside.app.wv;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;
import com.dcinside.app.http.f;
import com.dcinside.app.util.Al;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.jl;
import com.dcinside.app.util.zk;
import java.io.InputStream;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.text.v;
import timber.log.b;
import y4.l;
import y4.m;

public final class c extends WebViewClient {
    private int a;

    public final int a() {
        return this.a;
    }

    @Override  // android.webkit.WebViewClient
    public void onLoadResource(@l WebView webView0, @m String s) {
        L.p(webView0, "view");
        if(s == null || !v.v2(s, "http", false, 2, null) || webView0.getTag(0x7F0B10CA) != null) {  // id:web_fixed_size
            return;
        }
        int v = this.a;
        Object object0 = com.dcinside.app.wv.m.c.b.c(webView0);
        if(!(object0 instanceof Integer) || v != ((Number)object0).intValue()) {
            return;
        }
        j j0 = j.c(webView0);
        if(j0 != null) {
            j0.d(false, 500, this.a);
        }
    }

    @Override  // android.webkit.WebViewClient
    public void onPageFinished(@l WebView webView0, @m String s) {
        L.p(webView0, "view");
        WebViews.j(webView0);
        if(webView0.getTag(0x7F0B10CA) != null) {  // id:web_fixed_size
            return;
        }
        j j0 = j.c(webView0);
        if(j0 != null) {
            j0.d(true, 500, this.a);
        }
        a.a.b(webView0, 100);
    }

    @Override  // android.webkit.WebViewClient
    public void onPageStarted(@l WebView webView0, @m String s, @m Bitmap bitmap0) {
        L.p(webView0, "view");
        a.a.c(webView0, s);
        WebViews.j(webView0);
        j j0 = j.c(webView0);
        if(j0 == null) {
            return;
        }
        j0.i();
        Integer integer0 = (Integer)com.dcinside.app.wv.m.c.b.c(webView0);
        this.a = integer0 == null ? 0 : ((int)integer0);
        if(webView0.getTag(0x7F0B10CA) != null) {  // id:web_fixed_size
            return;
        }
        j0.d(true, 500, this.a);
    }

    @Override  // android.webkit.WebViewClient
    public void onReceivedError(@m WebView webView0, @m WebResourceRequest webResourceRequest0, @m WebResourceError webResourceError0) {
        WebViews.j(webView0);
        super.onReceivedError(webView0, webResourceRequest0, webResourceError0);
    }

    @Override  // android.webkit.WebViewClient
    public boolean onRenderProcessGone(@m WebView webView0, @m RenderProcessGoneDetail renderProcessGoneDetail0) {
        try {
            dl.a.q6(System.currentTimeMillis());
        }
        catch(Exception exception0) {
            zk.a(exception0);
            b.a.y(exception0);
        }
        try {
            if(Build.VERSION.SDK_INT >= 26 && jl.a.H0()) {
                int v = renderProcessGoneDetail0 == null ? -1 : renderProcessGoneDetail0.rendererPriorityAtExit();
                f f0 = new f("onRenderProcessGone: " + (renderProcessGoneDetail0 == null ? false : renderProcessGoneDetail0.didCrash()) + " , " + v);
                b.a.y(f0);
                zk.a(f0);
            }
            goto label_14;
        }
        catch(Exception exception1) {
        }
        b.a.y(exception1);
        zk.a(exception1);
        try {
        label_14:
            if(webView0 != null) {
                webView0.clearCache(true);
            }
            if(webView0 != null) {
                webView0.clearHistory();
                return super.onRenderProcessGone(webView0, renderProcessGoneDetail0);
            }
        }
        catch(Exception exception2) {
            b.a.y(exception2);
            zk.a(exception2);
            return super.onRenderProcessGone(webView0, renderProcessGoneDetail0);
        }
        return super.onRenderProcessGone(null, renderProcessGoneDetail0);
    }

    @Override  // android.webkit.WebViewClient
    @m
    public WebResourceResponse shouldInterceptRequest(@m WebView webView0, @m WebResourceRequest webResourceRequest0) {
        Uri uri0 = webResourceRequest0 == null ? null : webResourceRequest0.getUrl();
        if(uri0 == null) {
            return super.shouldInterceptRequest(webView0, webResourceRequest0);
        }
        List list0 = uri0.getPathSegments();
        if(list0.size() == 2 && L.g(list0.get(0), "app_private") && L.g(list0.get(1), "dc_font.ttf")) {
            InputStream inputStream0 = d.a.d();
            return inputStream0 == null ? super.shouldInterceptRequest(webView0, webResourceRequest0) : new WebResourceResponse("application/octet-stream", null, inputStream0);
        }
        return super.shouldInterceptRequest(webView0, webResourceRequest0);
    }

    @Override  // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(@l WebView webView0, @m String s) {
        L.p(webView0, "wv");
        Context context0 = Al.h(webView0.getContext());
        if(context0 instanceof AppCompatActivity) {
            return com.dcinside.app.main.a.b(((AppCompatActivity)context0), s);
        }
        ViewParent viewParent0 = webView0.getParent();
        Context context1 = null;
        ViewGroup viewGroup0 = viewParent0 instanceof ViewGroup ? ((ViewGroup)viewParent0) : null;
        if(viewGroup0 != null) {
            context1 = viewGroup0.getContext();
        }
        Context context2 = Al.h(context1);
        return context2 instanceof AppCompatActivity ? com.dcinside.app.main.a.b(((AppCompatActivity)context2), s) : false;
    }
}

