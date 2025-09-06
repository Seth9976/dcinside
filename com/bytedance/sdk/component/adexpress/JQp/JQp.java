package com.bytedance.sdk.component.adexpress.JQp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.text.TextUtils;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.bytedance.sdk.component.PjT.cRA;
import com.bytedance.sdk.component.SM.cz;
import com.bytedance.sdk.component.adexpress.PjT.PjT.PjT;
import com.bytedance.sdk.component.adexpress.PjT.PjT.ReZ;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class JQp {
    private static int Au = 10;
    private static final byte[] JQp = null;
    private List PjT;
    private Map ReZ;
    private static volatile JQp SM = null;
    private final AtomicBoolean XX;
    private List Zh;
    private Map cr;
    private static int cz = 10;

    static {
        JQp.JQp = new byte[0];
    }

    private JQp() {
        this.XX = new AtomicBoolean(false);
        this.PjT = new ArrayList();
        this.Zh = new ArrayList();
        this.ReZ = new HashMap();
        this.cr = new HashMap();
        ReZ reZ0 = PjT.PjT().ReZ();
        if(reZ0 != null) {
            JQp.cz = reZ0.DWo();
            JQp.Au = reZ0.qj();
        }
    }

    public boolean JQp(cz cz0) {
        if(cz0 == null) {
            return false;
        }
        try {
            Context context0 = cz0.getContext();
            if(context0 instanceof MutableContextWrapper) {
                ((MutableContextWrapper)context0).setBaseContext(context0.getApplicationContext());
            }
            cz0.xE();
            return true;
        }
        catch(Throwable unused_ex) {
        }
        return true;
    }

    public static JQp PjT() {
        if(JQp.SM == null) {
            Class class0 = JQp.class;
            __monitor_enter(class0);
            try {
                if(JQp.SM == null) {
                    JQp.SM = new JQp();
                }
                __monitor_exit(class0);
                return JQp.SM;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return JQp.SM;
    }

    @Nullable
    public cz PjT(Context context0, String s) {
        if(this.cr() <= 0) {
            return null;
        }
        if(com.bytedance.sdk.component.adexpress.cr.JQp.PjT(s) && this.cr() <= 1) {
            return null;
        }
        cz cz0 = (cz)this.Zh.remove(0);
        if(cz0 == null) {
            return null;
        }
        try {
            Context context1 = cz0.getContext();
            if(context1 instanceof MutableContextWrapper) {
                ((MutableContextWrapper)context1).setBaseContext(context0.getApplicationContext());
                cz0.setRecycler(false);
            }
            return cz0;
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    public void PjT(int v) {
        synchronized(JQp.JQp) {
            JQp.cz = v;
        }
    }

    @SuppressLint({"JavascriptInterface"})
    public void PjT(WebView webView0, cRA cRA0, String s) {
        if(webView0 != null && cRA0 != null && !TextUtils.isEmpty(s)) {
            cr cr0 = (cr)this.cr.get(webView0.hashCode());
            if(cr0 == null) {
                cr0 = new cr(cRA0);
                this.cr.put(webView0.hashCode(), cr0);
            }
            else {
                cr0.PjT(cRA0);
            }
            webView0.addJavascriptInterface(cr0, s);
        }
    }

    public void PjT(WebView webView0, String s) {
        if(webView0 != null && !TextUtils.isEmpty(s)) {
            cr cr0 = (cr)this.cr.get(webView0.hashCode());
            if(cr0 != null) {
                cr0.PjT(null);
            }
            webView0.removeJavascriptInterface(s);
        }
    }

    public void PjT(cz cz0) {
        if(cz0 == null) {
            return;
        }
        if(this.Zh.size() >= JQp.Au) {
            try {
                Context context0 = cz0.getContext();
                if(context0 instanceof MutableContextWrapper) {
                    ((MutableContextWrapper)context0).setBaseContext(context0.getApplicationContext());
                }
                cz0.xE();
                return;
            }
            catch(Throwable unused_ex) {
            }
            return;
        }
        if(!this.Zh.contains(cz0)) {
            try {
                Context context1 = cz0.getContext();
                if(context1 instanceof MutableContextWrapper) {
                    ((MutableContextWrapper)context1).setBaseContext(context1.getApplicationContext());
                    cz0.setRecycler(true);
                    this.Zh.add(cz0);
                }
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    @SuppressLint({"JavascriptInterface"})
    public void PjT(cz cz0, Zh zh0) {
        if(cz0 != null && zh0 != null) {
            com.bytedance.sdk.component.adexpress.JQp.ReZ reZ0 = (com.bytedance.sdk.component.adexpress.JQp.ReZ)this.ReZ.get(cz0.hashCode());
            if(reZ0 == null) {
                reZ0 = new com.bytedance.sdk.component.adexpress.JQp.ReZ(zh0);
                this.ReZ.put(cz0.hashCode(), reZ0);
            }
            else {
                reZ0.PjT(zh0);
            }
            cz0.PjT(reZ0, "SDK_INJECT_GLOBAL");
        }
    }

    public int ReZ() {
        return this.PjT.size();
    }

    @UiThread
    public void ReZ(cz cz0) {
        if(cz0 == null) {
            return;
        }
        this.XX(cz0);
        cz0.b_("SDK_INJECT_GLOBAL");
        this.cz(cz0);
        this.cr(cz0);
    }

    private void XX(cz cz0) {
        try {
            cz0.removeAllViews();
            cz0.XX();
            cz0.setWebChromeClient(null);
            cz0.setWebViewClient(null);
            cz0.setDownloadListener(null);
            cz0.setJavaScriptEnabled(true);
            cz0.setCacheMode(-1);
            cz0.setSupportZoom(false);
            cz0.setUseWideViewPort(true);
            cz0.setJavaScriptCanOpenWindowsAutomatically(true);
            cz0.setDomStorageEnabled(true);
            cz0.setBuiltInZoomControls(false);
            cz0.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
            cz0.setLoadWithOverviewMode(false);
            cz0.setDefaultTextEncodingName("UTF-8");
            cz0.setDefaultFontSize(16);
        }
        catch(Throwable unused_ex) {
        }
    }

    @Nullable
    public cz Zh(Context context0, String s) {
        if(this.ReZ() <= 0) {
            return null;
        }
        if(com.bytedance.sdk.component.adexpress.cr.JQp.PjT(s) && this.ReZ() <= 1) {
            return null;
        }
        cz cz0 = (cz)this.PjT.remove(0);
        if(cz0 == null) {
            return null;
        }
        try {
            Context context1 = cz0.getContext();
            if(context1 instanceof MutableContextWrapper) {
                ((MutableContextWrapper)context1).setBaseContext(context0.getApplicationContext());
                cz0.setRecycler(false);
            }
            return cz0;
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    public void Zh() {
        for(Object object0: this.PjT) {
            cz cz0 = (cz)object0;
            if(cz0 != null) {
                try {
                    Context context0 = cz0.getContext();
                    if(context0 instanceof MutableContextWrapper) {
                        ((MutableContextWrapper)context0).setBaseContext(context0.getApplicationContext());
                    }
                    cz0.xE();
                }
                catch(Throwable unused_ex) {
                }
            }
        }
        this.PjT.clear();
        for(Object object1: this.Zh) {
            cz cz1 = (cz)object1;
            if(cz1 != null) {
                try {
                    Context context1 = cz1.getContext();
                    if(context1 instanceof MutableContextWrapper) {
                        ((MutableContextWrapper)context1).setBaseContext(context1.getApplicationContext());
                    }
                    cz1.xE();
                }
                catch(Throwable unused_ex) {
                }
            }
        }
        this.Zh.clear();
    }

    public void Zh(int v) {
        synchronized(JQp.JQp) {
            JQp.Au = v;
        }
    }

    @UiThread
    public void Zh(cz cz0) {
        if(cz0 == null) {
            return;
        }
        this.XX(cz0);
        cz0.b_("SDK_INJECT_GLOBAL");
        this.cz(cz0);
        this.PjT(cz0);
    }

    public int cr() {
        return this.Zh.size();
    }

    public void cr(cz cz0) {
        if(cz0 == null) {
            return;
        }
        if(this.PjT.size() >= JQp.cz) {
            try {
                Context context0 = cz0.getContext();
                if(context0 instanceof MutableContextWrapper) {
                    ((MutableContextWrapper)context0).setBaseContext(context0.getApplicationContext());
                }
                cz0.xE();
                return;
            }
            catch(Throwable unused_ex) {
            }
            return;
        }
        if(!this.PjT.contains(cz0)) {
            try {
                Context context1 = cz0.getContext();
                if(context1 instanceof MutableContextWrapper) {
                    ((MutableContextWrapper)context1).setBaseContext(context1.getApplicationContext());
                    cz0.setRecycler(true);
                    this.PjT.add(cz0);
                }
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    public void cz(cz cz0) {
        if(cz0 == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.JQp.ReZ reZ0 = (com.bytedance.sdk.component.adexpress.JQp.ReZ)this.ReZ.get(cz0.hashCode());
        if(reZ0 != null) {
            reZ0.PjT(null);
        }
        cz0.b_("SDK_INJECT_GLOBAL");
    }
}

