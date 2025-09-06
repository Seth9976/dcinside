package com.dcinside.app.wv;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build.VERSION;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebView;
import android.widget.FrameLayout.LayoutParams;
import androidx.appcompat.app.AppCompatActivity;
import com.dcinside.app.Application;
import com.dcinside.app.base.i;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nWebViewVideoClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebViewVideoClient.kt\ncom/dcinside/app/wv/WebViewVideoClient\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,105:1\n177#2,9:106\n*S KotlinDebug\n*F\n+ 1 WebViewVideoClient.kt\ncom/dcinside/app/wv/WebViewVideoClient\n*L\n79#1:106,9\n*E\n"})
public final class s extends q implements i {
    public interface a {
        @m
        AppCompatActivity L();

        void setFullScreenView(@m View arg1);
    }

    @m
    private WeakReference b;
    @l
    private final WeakReference c;
    @m
    private Integer d;

    public s(@l WebView webView0) {
        L.p(webView0, "webView");
        super();
        this.c = new WeakReference(webView0);
    }

    public final boolean g() {
        if(this.b != null) {
            this.onHideCustomView();
            return true;
        }
        return false;
    }

    @Override  // android.webkit.WebChromeClient
    @m
    public Bitmap getDefaultVideoPoster() {
        if(Build.VERSION.SDK_INT >= 23) {
            return super.getDefaultVideoPoster();
        }
        Bitmap bitmap0 = super.getDefaultVideoPoster();
        if(bitmap0 == null) {
            WebView webView0 = (WebView)this.c.get();
            Context context0 = webView0 == null ? null : webView0.getContext();
            if(context0 == null) {
                context0 = Application.e.c();
            }
            return BitmapFactory.decodeResource(context0.getResources(), 0x7F0802F1);  // drawable:ic_symbol
        }
        return bitmap0;
    }

    @Override  // android.webkit.WebChromeClient
    public void onHideCustomView() {
        super.onHideCustomView();
        WebView webView0 = (WebView)this.c.get();
        if(webView0 == null) {
            return;
        }
        Context context0 = webView0.getContext();
        WeakReference weakReference0 = this.b;
        if(weakReference0 == null) {
            return;
        }
        a s$a0 = context0 instanceof a ? ((a)context0) : null;
        if(s$a0 == null) {
            return;
        }
        AppCompatActivity appCompatActivity0 = s$a0.L();
        if(appCompatActivity0 == null) {
            return;
        }
        Window window0 = appCompatActivity0.getWindow();
        WindowManager.LayoutParams windowManager$LayoutParams0 = window0.getAttributes();
        windowManager$LayoutParams0.flags &= 0xFFFFFB7F;
        window0.setAttributes(windowManager$LayoutParams0);
        window0.getDecorView().setSystemUiVisibility((this.d == null ? 0 : ((int)this.d)));
        try {
            WebChromeClient.CustomViewCallback webChromeClient$CustomViewCallback0 = (WebChromeClient.CustomViewCallback)weakReference0.get();
            if(webChromeClient$CustomViewCallback0 != null) {
                webChromeClient$CustomViewCallback0.onCustomViewHidden();
            }
        }
        catch(Exception unused_ex) {
        }
        weakReference0.clear();
        this.b = null;
        s$a0.setFullScreenView(null);
    }

    @Override  // android.webkit.WebChromeClient
    public void onProgressChanged(@m WebView webView0, int v) {
        super.onProgressChanged(webView0, v);
        com.dcinside.app.wv.m.a.a.b(webView0, v);
    }

    @Override  // android.webkit.WebChromeClient
    public void onShowCustomView(@l View view0, @l WebChromeClient.CustomViewCallback webChromeClient$CustomViewCallback0) {
        L.p(view0, "view");
        L.p(webChromeClient$CustomViewCallback0, "callback");
        super.onShowCustomView(view0, webChromeClient$CustomViewCallback0);
        WebView webView0 = (WebView)this.c.get();
        if(webView0 == null) {
            return;
        }
        Context context0 = webView0.getContext();
        a s$a0 = context0 instanceof a ? ((a)context0) : null;
        if(s$a0 == null) {
            return;
        }
        AppCompatActivity appCompatActivity0 = s$a0.L();
        if(appCompatActivity0 == null) {
            return;
        }
        this.b = new WeakReference(webChromeClient$CustomViewCallback0);
        view0.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Window window0 = appCompatActivity0.getWindow();
        WindowManager.LayoutParams windowManager$LayoutParams0 = window0.getAttributes();
        windowManager$LayoutParams0.flags |= 0x480;
        window0.setAttributes(windowManager$LayoutParams0);
        this.d = window0.getDecorView().getSystemUiVisibility();
        window0.getDecorView().setSystemUiVisibility((this.d == null ? 0 : ((int)this.d)) | 0x1706);
        s$a0.setFullScreenView(view0);
    }

    @Override  // com.dcinside.app.base.i
    public void release() {
        this.g();
        this.c.clear();
    }
}

