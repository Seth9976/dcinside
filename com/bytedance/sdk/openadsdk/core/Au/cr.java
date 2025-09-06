package com.bytedance.sdk.openadsdk.core.Au;

import android.annotation.SuppressLint;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.bytedance.sdk.openadsdk.core.widget.PjT.ReZ;
import java.util.ArrayList;
import java.util.List;

public class cr {
    private final List PjT;
    private static volatile cr ReZ;
    private static int Zh;

    static {
    }

    public cr() {
        this.PjT = new ArrayList();
    }

    public static cr PjT() {
        if(cr.ReZ == null) {
            Class class0 = cr.class;
            __monitor_enter(class0);
            try {
                if(cr.ReZ == null) {
                    cr.ReZ = new cr();
                }
                __monitor_exit(class0);
                return cr.ReZ;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return cr.ReZ;
    }

    @UiThread
    public void PjT(JQp jQp0) {
        if(jQp0 != null) {
            this.Zh(jQp0);
        }
    }

    public int ReZ() {
        return this.PjT.size();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void ReZ(JQp jQp0) {
        if(jQp0 != null && jQp0.getWebView() != null) {
            if(jQp0.getParent() != null) {
                ((ViewGroup)jQp0.getParent()).removeView(jQp0);
            }
            try {
                jQp0.removeAllViews();
                jQp0.XX();
                jQp0.setWebChromeClient(null);
                jQp0.setWebViewClient(null);
                jQp0.setDownloadListener(null);
                jQp0.setDefaultTextEncodingName("UTF-8");
                jQp0.setAllowFileAccess(false);
                jQp0.setJavaScriptEnabled(true);
                jQp0.setCacheMode(-1);
                jQp0.setDatabaseEnabled(true);
                jQp0.setSupportZoom(false);
                jQp0.getWebView().setLayerType(0, null);
                jQp0.setBackgroundColor(0);
                jQp0.getWebView().setHorizontalScrollBarEnabled(false);
                jQp0.getWebView().setHorizontalScrollbarOverlay(false);
                jQp0.getWebView().setVerticalScrollBarEnabled(false);
                jQp0.getWebView().setVerticalScrollbarOverlay(false);
                ReZ.PjT(jQp0);
                jQp0.fDm();
                jQp0.setMixedContentMode(0);
            }
            catch(Exception unused_ex) {
            }
        }
    }

    @Nullable
    public JQp Zh() {
        if(this.ReZ() <= 0) {
            return null;
        }
        JQp jQp0 = (JQp)this.PjT.remove(0);
        return jQp0 == null ? null : jQp0;
    }

    public void Zh(JQp jQp0) {
        if(jQp0 != null) {
            if(this.PjT.size() >= cr.Zh) {
                jQp0.xE();
                return;
            }
            if(!this.PjT.contains(jQp0)) {
                this.ReZ(jQp0);
                this.PjT.add(jQp0);
            }
        }
    }
}

