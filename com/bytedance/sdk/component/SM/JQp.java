package com.bytedance.sdk.component.SM;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.HashSet;
import java.util.Map;

public class JQp extends WebView {
    private boolean JQp;
    public long PjT;
    private boolean ReZ;
    private final HashSet Zh;
    private boolean cr;
    private ReZ cz;

    public JQp(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.Zh = new HashSet();
        this.PjT = System.currentTimeMillis();
        this.PjT();
    }

    public JQp(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.Zh = new HashSet();
        this.PjT = System.currentTimeMillis();
        this.PjT();
    }

    private void PjT() {
        WebSettings webSettings0 = this.getSettings();
        webSettings0.setSupportZoom(false);
        webSettings0.setDisplayZoomControls(false);
        webSettings0.setBuiltInZoomControls(false);
        webSettings0.setSupportMultipleWindows(false);
        webSettings0.setAllowFileAccess(false);
        webSettings0.setSavePassword(false);
        this.setWebViewClient(new PjT());
    }

    private void Zh() {
        if(this.ReZ) {
            return;
        }
        ViewParent viewParent0 = this.getParent();
        if(viewParent0 instanceof ViewGroup) {
            ((ViewGroup)viewParent0).removeView(this);
        }
        this.setOnClickListener(null);
        this.setOnTouchListener(null);
        for(Object object0: this.Zh) {
            super.removeJavascriptInterface(((String)object0));
        }
    }

    @Override  // android.webkit.WebView
    public void addJavascriptInterface(Object object0, String s) {
        if(!this.ReZ && !this.JQp) {
            super.addJavascriptInterface(object0, s);
            this.Zh.add(s);
        }
    }

    @Override  // android.webkit.WebView
    public void clearCache(boolean z) {
        if(!this.ReZ && !this.JQp) {
            super.clearCache(z);
        }
    }

    @Override  // android.webkit.WebView
    public void destroy() {
        if(this.ReZ) {
            return;
        }
        this.ReZ = true;
        this.Zh();
        super.destroy();
    }

    @Override  // android.webkit.WebView
    public void evaluateJavascript(String s, ValueCallback valueCallback0) {
        if(!this.ReZ && !this.JQp) {
            super.evaluateJavascript(s, valueCallback0);
            return;
        }
        if(valueCallback0 != null) {
            valueCallback0.onReceiveValue("");
        }
    }

    @Override  // android.webkit.WebView
    public void goBack() {
        if(!this.ReZ && !this.JQp) {
            super.goBack();
        }
    }

    @Override  // android.webkit.WebView
    public void goBackOrForward(int v) {
        if(!this.ReZ && !this.JQp) {
            super.goBackOrForward(v);
        }
    }

    @Override  // android.webkit.WebView
    public void goForward() {
        if(!this.ReZ && !this.JQp) {
            super.goForward();
        }
    }

    @Override  // android.webkit.WebView
    public void loadDataWithBaseURL(String s, String s1, String s2, String s3, String s4) {
        if(!this.ReZ && !this.JQp) {
            super.loadDataWithBaseURL(s, s1, s2, s3, s4);
        }
    }

    @Override  // android.webkit.WebView
    public void loadUrl(String s) {
        if(!this.ReZ && !this.JQp) {
            try {
                super.loadUrl(s);
            }
            catch(NoClassDefFoundError | IncompatibleClassChangeError | Exception unused_ex) {
            }
        }
    }

    @Override  // android.webkit.WebView
    public void loadUrl(String s, Map map0) {
        if(!this.ReZ && !this.JQp) {
            try {
                super.loadUrl(s, map0);
            }
            catch(NoClassDefFoundError | IncompatibleClassChangeError | Exception unused_ex) {
            }
        }
    }

    @Override  // android.webkit.WebView
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if(this.cr) {
            this.destroy();
        }
    }

    @Override  // android.webkit.WebView
    protected void onDraw(Canvas canvas0) {
        if(!this.ReZ && !this.JQp) {
            super.onDraw(canvas0);
        }
    }

    @Override  // android.webkit.WebView
    protected void onMeasure(int v, int v1) {
        if(!this.ReZ && !this.JQp) {
            super.onMeasure(v, v1);
            return;
        }
        this.setMeasuredDimension(0, 0);
    }

    @Override  // android.webkit.WebView
    public void onPause() {
        if(!this.ReZ && !this.JQp) {
            try {
                super.onPause();
            }
            catch(Exception unused_ex) {
            }
        }
    }

    @Override  // android.webkit.WebView
    public void onResume() {
        if(!this.ReZ && !this.JQp) {
            try {
                super.onResume();
            }
            catch(Exception unused_ex) {
            }
        }
    }

    @Override  // android.webkit.WebView
    public void pauseTimers() {
        if(!this.ReZ && !this.JQp) {
            super.pauseTimers();
        }
    }

    @Override  // android.webkit.WebView
    public void reload() {
        if(!this.ReZ && !this.JQp) {
            super.reload();
        }
    }

    @Override  // android.webkit.WebView
    public void removeJavascriptInterface(String s) {
        if(!this.ReZ && !this.JQp) {
            super.removeJavascriptInterface(s);
            this.Zh.remove(s);
        }
    }

    @Override  // android.webkit.WebView
    public void resumeTimers() {
        if(!this.ReZ && !this.JQp) {
            super.resumeTimers();
        }
    }

    public void setDestroyOnDetached(boolean z) {
        this.cr = z;
    }

    @Override  // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnTouchListener(View.OnTouchListener view$OnTouchListener0) {
        ReZ reZ0 = this.cz;
        if(reZ0 == null) {
            super.setOnTouchListener(view$OnTouchListener0);
            return;
        }
        reZ0.PjT(view$OnTouchListener0);
        super.setOnTouchListener(this.cz);
    }

    public void setRecycler(boolean z) {
        this.JQp = z;
    }

    public void setTouchListenerProxy(ReZ reZ0) {
        this.cz = reZ0;
    }

    @Override  // android.webkit.WebView
    public void stopLoading() {
        if(!this.ReZ && !this.JQp) {
            try {
                super.stopLoading();
            }
            catch(Exception unused_ex) {
            }
        }
    }
}

