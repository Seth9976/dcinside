package com.bytedance.sdk.openadsdk.common;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.component.SM.Zh;
import com.bytedance.sdk.component.SM.cz;
import com.bytedance.sdk.component.utils.KM.PjT;
import com.bytedance.sdk.component.utils.KM;
import com.bytedance.sdk.component.utils.SM;
import com.bytedance.sdk.openadsdk.core.fDm;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.settings.xs;
import com.bytedance.sdk.openadsdk.utils.Jo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.json.JSONObject;

public class cr implements PjT {
    private float Au;
    private long DWo;
    private ReZ JQp;
    private String Owx;
    private final Owx PjT;
    private WebView ReZ;
    private int SM;
    private final Handler XX;
    private final boolean Zh;
    private final cz cr;
    private String cz;
    private boolean fDm;
    private long gK;
    private int ltE;
    private final AtomicBoolean qj;
    private long qla;
    private final List ub;
    private boolean xE;
    private Pattern xf;
    private int xs;

    public cr(Owx owx0, cz cz0, String s, boolean z) {
        this.cz = "landingpage";
        this.XX = new KM(fDm.Zh().getLooper(), this);
        this.qj = new AtomicBoolean(false);
        this.xf = null;
        this.gK = -1L;
        this.PjT = owx0;
        this.cr = cz0;
        this.Zh = z;
        this.ub = new ArrayList();
        this.Zh();
    }

    private void Au() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("loading_show_interval", SystemClock.elapsedRealtime() - this.gK);
            jSONObject0.put("loading_show_timestamp", this.qla);
            jSONObject0.put("arbi_current_url", (this.ReZ == null ? "" : this.ReZ.getUrl()));
        }
        catch(Throwable unused_ex) {
        }
        com.bytedance.sdk.openadsdk.cr.ReZ.Zh(this.PjT, this.cz, jSONObject0);
    }

    // 检测为 Lambda 实现
    @SuppressLint({"ClickableViewAccessibility"})
    private void JQp() [...]

    private void PjT(int v) {
        WebView webView0 = this.ReZ;
        if(webView0 != null && v == 1) {
            String s = webView0.getUrl();
            if(TextUtils.isEmpty(s) || s.equals(this.Owx)) {
                return;
            }
        }
        SM.Zh().post(new Runnable() {
            final cr Zh;

            @Override
            public void run() {
                if(cr.this.JQp != null) {
                    cr.this.qj.set(false);
                    ReZ reZ0 = cr.this.JQp;
                    Owx owx0 = cr.this.PjT;
                    String s = cr.this.cz;
                    String s1 = cr.this.Owx;
                    long v = cr.this.DWo;
                    boolean z = cr.this.fDm;
                    int v1 = cr.this.xs;
                    long v2 = cr.this.qla;
                    reZ0.PjT(owx0, s, v, s1, v, z, v1, v2);
                    cr.this.xs = 0;
                }
            }
        });
        this.cr();
    }

    private void PjT(int v, WebView webView0) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("load_progress", v);
            jSONObject0.put("progress_timestamp", System.currentTimeMillis());
            jSONObject0.put("arbi_current_url", webView0.getUrl());
        }
        catch(Throwable unused_ex) {
        }
        com.bytedance.sdk.openadsdk.cr.ReZ.ReZ(this.PjT, this.cz, jSONObject0);
    }

    private boolean PjT(int v, int v1) {
        if(v < v1 || this.ub.contains(v1) || this.ltE < 2) {
            return false;
        }
        this.ub.add(v1);
        return true;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void PjT() {
        if(Jo.cz()) {
            this.JQp();
            return;
        }
        SM.Zh().post(() -> {
            cr.this.fDm = false;
            if(!cr.this.qj.getAndSet(true)) {
                cr.this.DWo = SystemClock.elapsedRealtime();
                cr.this.qla = System.currentTimeMillis();
                cr.this.Au();
                if(cr.this.JQp == null) {
                    return;
                }
                WebView webView0 = cr.this.ReZ;
                if(webView0 != null) {
                    cr.this.Owx = webView0.getUrl();
                }
                cr.this.JQp.setVisibility(0);
                cr.this.JQp.PjT(cr.this.PjT);
                cr.this.JQp.PjT();
                cr.this.JQp.setAlpha(cr.this.Au);
                cr.this.JQp.setOnTouchListener(new View.OnTouchListener() {
                    final cr PjT;

                    @Override  // android.view.View$OnTouchListener
                    public boolean onTouch(View view0, MotionEvent motionEvent0) {
                        return true;
                    }
                });
                cr.this.cr();
                cr.this.ReZ();
            }
        });

        class com.bytedance.sdk.openadsdk.common.cr.2 implements Runnable {
            final cr PjT;

            @Override
            public void run() {
                cr.this.JQp();
            }
        }

    }

    @Override  // com.bytedance.sdk.component.utils.KM$PjT
    public void PjT(Message message0) {
        if(message0.what == 1) {
            this.PjT(0);
        }
    }

    public void PjT(MotionEvent motionEvent0) {
        if(motionEvent0.getAction() == 1) {
            this.gK = SystemClock.elapsedRealtime();
        }
    }

    public void PjT(WebView webView0, int v) {
        ReZ reZ0 = this.JQp;
        if(reZ0 != null) {
            reZ0.PjT(v);
        }
        if(this.xE) {
            if(this.PjT(v, 30)) {
                this.PjT(30, webView0);
            }
            if(this.PjT(v, 50)) {
                this.PjT(50, webView0);
            }
            if(this.PjT(v, 70)) {
                this.PjT(70, webView0);
            }
        }
        if(this.JQp != null && v == 100) {
            this.PjT(1);
        }
    }

    public void PjT(WebView webView0, String s) {
        if(this.PjT != null && Zh.PjT(this.PjT.qla().ReZ(), s)) {
            ++this.xs;
            SM.Zh().post(new Runnable() {
                final cr PjT;

                @Override
                public void run() {
                    if(cr.this.cz()) {
                        cr.this.PjT();
                    }
                }
            });
        }
    }

    public void PjT(WebView webView0, String s, boolean z) {
        if(z && this.cz()) {
            this.PjT();
        }
    }

    public void PjT(String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        this.cz = s;
    }

    private void ReZ() {
        Handler handler0 = this.XX;
        if(handler0 != null) {
            handler0.sendEmptyMessageDelayed(1, ((long)this.SM));
        }
    }

    public void ReZ(WebView webView0, String s, boolean z) {
        this.ub.clear();
        this.xE = z;
        if(z) {
            this.fDm = true;
        }
        this.ltE = this.XX();
    }

    private int XX() {
        try {
            return this.ReZ.copyBackForwardList().getCurrentIndex() + 1;
        }
        catch(Throwable unused_ex) {
            return 0;
        }
    }

    private void Zh() {
        cz cz0 = this.cr;
        if(cz0 != null) {
            this.ReZ = cz0.getWebView();
            View view0 = this.cr.getArbitrageLoadingView();
            if(view0 instanceof ReZ) {
                this.JQp = (ReZ)view0;
            }
        }
        this.SM = xs.Gr().na();
        this.Au = xs.Gr().MN();
    }

    public void Zh(WebView webView0, String s, boolean z) {
        if(z && this.JQp != null) {
            this.PjT(1);
        }
    }

    private void cr() {
        Handler handler0 = this.XX;
        if(handler0 != null) {
            handler0.removeCallbacksAndMessages(null);
        }
    }

    private boolean cz() {
        return this.XX() > 0 && !this.qj.get();
    }
}

