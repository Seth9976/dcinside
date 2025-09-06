package com.bytedance.sdk.openadsdk.core.widget.PjT;

import android.content.MutableContextWrapper;
import android.net.Uri;
import android.os.MessageQueue.IdleHandler;
import android.os.MessageQueue;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.sdk.component.SM.cz;
import com.bytedance.sdk.component.adexpress.JQp.JQp;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.core.KM;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.utils.gK;
import java.util.concurrent.atomic.AtomicInteger;

public class Zh implements PjT {
    private final boolean JQp;
    KM PjT;
    private final AtomicInteger ReZ;
    private cz Zh;
    private final MessageQueue cr;

    public Zh(int v, boolean z, MessageQueue messageQueue0) {
        this.ReZ = new AtomicInteger(v);
        this.JQp = z;
        this.cr = messageQueue0;
    }

    private void PjT(cz cz0) {
        if(cz0 != null && cz0.getWebView() != null) {
            try {
                ReZ.PjT(ub.PjT()).PjT(false).PjT(cz0.getWebView());
                cz0.setVerticalScrollBarEnabled(false);
                cz0.setHorizontalScrollBarEnabled(false);
                ReZ.PjT(cz0);
                cz0.fDm();
                cz0.setUserAgentString(gK.PjT(cz0.getWebView(), 7104));
                cz0.setMixedContentMode(0);
                cz0.setJavaScriptEnabled(true);
                cz0.setJavaScriptCanOpenWindowsAutomatically(true);
                cz0.setDomStorageEnabled(true);
                cz0.setDatabaseEnabled(true);
                cz0.setCacheMode(-1);
                cz0.setAllowFileAccess(false);
                cz0.setSupportZoom(true);
                cz0.setBuiltInZoomControls(true);
                cz0.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
                cz0.setUseWideViewPort(true);
            }
            catch(Throwable throwable0) {
                RD.Zh("WebViewPool", throwable0.toString());
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.PjT
    public void PjT() {
        if(this.JQp) {
            JQp.PjT().Zh(this.Zh);
        }
        else {
            JQp.PjT().ReZ(this.Zh);
        }
        try {
            this.ReZ.get();
            this.ReZ.decrementAndGet();
            if(this.ReZ.get() > 0) {
                MessageQueue messageQueue0 = this.cr;
                if(messageQueue0 != null) {
                    messageQueue0.addIdleHandler(new MessageQueue.IdleHandler() {
                        final Zh PjT;

                        @Override  // android.os.MessageQueue$IdleHandler
                        public boolean queueIdle() {
                            new Zh(Zh.this.ReZ.get(), Zh.this.JQp, Zh.this.cr).Zh();
                            return false;
                        }
                    });
                }
            }
        }
        catch(Exception exception0) {
            exception0.getMessage();
        }
    }

    public void Zh() {
        if(this.ReZ.get() <= 0) {
            return;
        }
        String s = com.bytedance.sdk.component.adexpress.PjT.Zh.Zh.cr(null);
        if(this.JQp) {
            String s1 = com.bytedance.sdk.component.adexpress.PjT.Zh.Zh.cr("v3");
            if(s != null && s.equals(s1)) {
                return;
            }
            s = s1;
        }
        if(TextUtils.isEmpty(s)) {
            return;
        }
        try {
            cz cz0 = new cz(new MutableContextWrapper(ub.PjT()));
            this.Zh = cz0;
            if(cz0.getWebView() == null) {
                return;
            }
        }
        catch(Exception unused_ex) {
            return;
        }
        this.Zh.setWebViewClient(new WebViewClient() {
            final Zh PjT;

            @Override  // android.webkit.WebViewClient
            public boolean onRenderProcessGone(WebView webView0, RenderProcessGoneDetail renderProcessGoneDetail0) {
                return true;
            }
        });
        this.PjT(this.Zh);
        Uri uri0 = Uri.parse(s).buildUpon().appendQueryParameter("isPreLoad", "1").build();
        KM kM0 = new KM(this.Zh.getContext());
        this.PjT = kM0;
        kM0.Zh(this.Zh).PjT(this).PjT(this.Zh);
        JQp.PjT().PjT(this.Zh, this.PjT);
        this.Zh.a_(uri0.toString());
    }
}

