package com.dcinside.app.wv;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;

public class VideoEnabledWebView extends WebView {
    private WeakReference a;
    private WeakReference b;
    @Nullable
    private WeakReference c;

    public VideoEnabledWebView(Context context0) {
        super(context0);
    }

    public VideoEnabledWebView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    public VideoEnabledWebView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    public boolean a() {
        WeakReference weakReference0 = this.b;
        if(weakReference0 != null) {
            try {
                s s0 = (s)weakReference0.get();
                if(s0 != null) {
                    return s0.g();
                }
            }
            catch(Exception exception0) {
                exception0.printStackTrace();
            }
        }
        return false;
    }

    @Nullable
    private RecyclerView b(@Nullable ViewParent viewParent0) {
        if(viewParent0 == null) {
            return null;
        }
        return viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : this.b(viewParent0.getParent());
    }

    public boolean c() {
        return this.a();
    }

    @Nullable
    public c getContentClient() {
        return this.a == null ? null : ((c)this.a.get());
    }

    @Nullable
    public WeakReference getWeakParentRecyclerView() {
        return this.c;
    }

    @Override  // android.webkit.WebView
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c = new WeakReference(this.b(this.getParent()));
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c = null;
    }

    @Override  // android.webkit.WebView
    public boolean onGenericMotionEvent(MotionEvent motionEvent0) {
        if(motionEvent0.getAction() == 8) {
            RecyclerView recyclerView0 = this.c == null ? null : ((RecyclerView)this.c.get());
            return recyclerView0 == null ? super.onGenericMotionEvent(motionEvent0) : recyclerView0.onGenericMotionEvent(motionEvent0);
        }
        return super.onGenericMotionEvent(motionEvent0);
    }

    @Override  // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient0) {
        super.setWebChromeClient(webChromeClient0);
        WeakReference weakReference0 = this.b;
        if(weakReference0 != null) {
            s s0 = (s)weakReference0.get();
            if(s0 != null) {
                s0.release();
            }
            this.b.clear();
        }
        if(webChromeClient0 instanceof s) {
            this.b = new WeakReference(((s)webChromeClient0));
            return;
        }
        this.b = null;
    }

    @Override  // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient0) {
        super.setWebViewClient(webViewClient0);
        WeakReference weakReference0 = this.a;
        if(weakReference0 != null) {
            weakReference0.clear();
        }
        if(webViewClient0 instanceof c) {
            this.a = new WeakReference(((c)webViewClient0));
        }
    }
}

