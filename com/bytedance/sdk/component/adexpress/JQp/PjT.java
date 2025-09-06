package com.bytedance.sdk.component.adexpress.JQp;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import androidx.annotation.UiThread;
import com.bytedance.sdk.component.SM.cz;
import com.bytedance.sdk.component.adexpress.ReZ;
import com.bytedance.sdk.component.adexpress.Zh.Au;
import com.bytedance.sdk.component.adexpress.Zh.XX;
import com.bytedance.sdk.component.adexpress.Zh.cr;
import com.bytedance.sdk.component.adexpress.Zh.fDm;
import com.bytedance.sdk.component.adexpress.Zh.qj;
import com.bytedance.sdk.component.adexpress.Zh.xs;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.utils.Zh;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public abstract class PjT implements com.bytedance.sdk.component.adexpress.PjT, cr, qj, com.bytedance.sdk.component.adexpress.theme.PjT {
    private String Au;
    private boolean DWo;
    protected AtomicBoolean JQp;
    protected JSONObject PjT;
    protected cz ReZ;
    private volatile XX SM;
    private String XX;
    protected boolean Zh;
    protected int cr;
    private Context cz;
    private int fDm;
    private Au qj;
    private boolean qla;
    private xs xf;
    private boolean xs;

    public PjT(Context context0, xs xs0, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver0) {
        this.DWo = false;
        this.cr = 8;
        this.JQp = new AtomicBoolean(false);
        this.qla = false;
        this.cz = context0;
        this.xf = xs0;
        this.XX = xs0.cr();
        themeStatusBroadcastReceiver0.PjT(this);
        if(com.bytedance.sdk.component.adexpress.cr.Zh()) {
            this.xf();
            return;
        }
        cz cz0 = this.xs();
        this.ReZ = cz0;
        if(cz0 == null) {
            Log.d("WebViewRender", "initWebView: create WebView");
            if(com.bytedance.sdk.component.adexpress.cr.PjT() != null) {
                this.ReZ = new cz(com.bytedance.sdk.component.adexpress.cr.PjT());
            }
        }
        else {
            this.DWo = true;
            Log.d("WebViewRender", "initWebView: reuse WebView");
        }
    }

    public void Au() {
        this.SM();
        Activity activity0 = Zh.PjT(this.ReZ);
        if(activity0 != null) {
            this.fDm = this.Zh(activity0);
        }
    }

    protected void DWo() {
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.cr
    public View JQp() {
        return this.Zh();
    }

    @UiThread
    private void PjT(float f, float f1) {
        this.xf.JQp().JQp();
        if(this.ReZ() == 9) {
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)this.PjT().getLayoutParams();
            if(frameLayout$LayoutParams0 == null) {
                frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
            }
            frameLayout$LayoutParams0.width = -1;
            frameLayout$LayoutParams0.height = -1;
            this.PjT().setLayoutParams(frameLayout$LayoutParams0);
            return;
        }
        int v = (int)com.bytedance.sdk.component.adexpress.cr.XX.PjT(this.cz, f);
        int v1 = (int)com.bytedance.sdk.component.adexpress.cr.XX.PjT(this.cz, f1);
        FrameLayout.LayoutParams frameLayout$LayoutParams1 = (FrameLayout.LayoutParams)this.PjT().getLayoutParams();
        if(frameLayout$LayoutParams1 == null) {
            frameLayout$LayoutParams1 = new FrameLayout.LayoutParams(v, v1);
        }
        frameLayout$LayoutParams1.width = v;
        frameLayout$LayoutParams1.height = v1;
        this.PjT().setLayoutParams(frameLayout$LayoutParams1);
    }

    private void PjT(int v, String s) {
        if(this.SM != null) {
            this.SM.PjT(v, s);
        }
    }

    // 检测为 Lambda 实现
    private void PjT(fDm fDm0, float f, float f1) [...]

    public cz PjT() {
        return this.ReZ;
    }

    public abstract void PjT(int arg1);

    @Override  // com.bytedance.sdk.component.adexpress.PjT
    public void PjT(Activity activity0) {
        if(this.fDm != 0 && activity0 != null && activity0.hashCode() == this.fDm) {
            this.cr();
            this.DWo();
        }
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.qj
    public void PjT(View view0, int v, ReZ reZ0) {
        Au au0 = this.qj;
        if(au0 != null) {
            au0.PjT(view0, v, reZ0);
        }
    }

    public void PjT(Au au0) {
        this.qj = au0;
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.cr
    public void PjT(XX xX0) {
        this.SM = xX0;
        boolean z = false;
        if(this.PjT() != null && this.PjT().getWebView() != null) {
            if(TextUtils.isEmpty(this.Au)) {
                this.SM.PjT(102, "url is empty");
                return;
            }
            if(!this.xf.tT()) {
                if(!this.qla && !com.bytedance.sdk.component.adexpress.PjT.Zh.Zh.PjT(this.PjT)) {
                    XX xX1 = this.SM;
                    StringBuilder stringBuilder0 = new StringBuilder("data null is ");
                    if(this.PjT == null) {
                        z = true;
                    }
                    stringBuilder0.append(z);
                    xX1.PjT(103, stringBuilder0.toString());
                    return;
                }
                if(this.qla && !com.bytedance.sdk.component.adexpress.PjT.Zh.Zh.ReZ(this.PjT)) {
                    XX xX2 = this.SM;
                    StringBuilder stringBuilder1 = new StringBuilder("choice ad data null is ");
                    if(this.PjT == null) {
                        z = true;
                    }
                    stringBuilder1.append(z);
                    xX2.PjT(103, stringBuilder1.toString());
                    return;
                }
            }
            else if(this.ReZ() == 9 && !com.bytedance.sdk.component.adexpress.PjT.Zh.Zh.Zh(this.PjT)) {
                XX xX3 = this.SM;
                StringBuilder stringBuilder2 = new StringBuilder("data null is ");
                if(this.PjT == null) {
                    z = true;
                }
                stringBuilder2.append(z);
                xX3.PjT(103, stringBuilder2.toString());
                return;
            }
            this.xf.JQp().PjT(this.DWo);
            if(this.DWo) {
                try {
                    this.ReZ.ub();
                    com.bytedance.sdk.component.utils.fDm.PjT(this.ReZ.getWebView(), "javascript:window.SDK_RESET_RENDER();window.SDK_TRIGGER_RENDER();");
                }
                catch(Exception exception0) {
                    JQp.PjT().JQp(this.ReZ);
                    this.SM.PjT(102, "load exception is " + exception0.getMessage());
                }
                return;
            }
            cz cz0 = this.PjT();
            cz0.ub();
            cz0.a_(this.Au);
            return;
        }
        XX xX4 = this.SM;
        StringBuilder stringBuilder3 = new StringBuilder("SSWebview null is ");
        if(this.PjT() == null) {
            z = true;
        }
        stringBuilder3.append(z);
        stringBuilder3.append(" or Webview is null");
        xX4.PjT(102, stringBuilder3.toString());
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.qj
    public void PjT(fDm fDm0) {
        if(fDm0 == null) {
            if(this.SM != null) {
                this.SM.PjT(105, "renderResult is null");
            }
            return;
        }
        boolean z = fDm0.ReZ();
        float f = (float)fDm0.cr();
        float f1 = (float)fDm0.JQp();
        if(this.ReZ() == 0 && (f <= 0.0f || f1 <= 0.0f)) {
            if(this.SM != null) {
                this.SM.PjT(105, "width is " + f + "height is " + f1);
            }
            return;
        }
        this.Zh = z;
        if(Looper.myLooper() == Looper.getMainLooper()) {
            this.PjT(fDm0, f, f1);
            return;
        }
        new Handler(Looper.getMainLooper()).post(() -> {
            boolean z = PjT.this.Zh;
            if(!z || PjT.this.xs) {
                if(!z) {
                    JQp.PjT().JQp(PjT.this.ReZ);
                }
                PjT.this.PjT(this.PjT.qj(), this.PjT.DWo());
            }
            else {
                PjT.this.PjT(this.Zh, this.ReZ);
                PjT.this.PjT(PjT.this.cr);
                if(PjT.this.SM != null) {
                    PjT.this.SM.PjT(PjT.this.PjT(), this.PjT);
                }
            }
        });

        class com.bytedance.sdk.component.adexpress.JQp.PjT.1 implements Runnable {
            final PjT cr;

            com.bytedance.sdk.component.adexpress.JQp.PjT.1(fDm fDm0, float f, float f1) {
            }

            @Override
            public void run() {
                PjT.this.PjT(this.PjT, this.Zh, this.ReZ);
            }
        }

    }

    public void PjT(String s) {
        this.Au = s;
    }

    public void PjT(JSONObject jSONObject0) {
        this.PjT = jSONObject0;
    }

    public void PjT(boolean z) {
        this.xs = z;
    }

    @Override  // com.bytedance.sdk.component.adexpress.Zh.cr
    public int ReZ() {
        return 0;
    }

    protected void SM() {
    }

    public abstract void XX();

    private int Zh(Activity activity0) {
        return activity0.hashCode();
    }

    public cz Zh() {
        return this.PjT();
    }

    public void Zh(boolean z) {
        this.qla = z;
    }

    public void cr() {
        if(this.JQp.get()) {
            return;
        }
        this.JQp.set(true);
        this.XX();
        if(this.ReZ.getParent() != null) {
            ((ViewGroup)this.ReZ.getParent()).removeView(this.ReZ);
        }
        if(this.Zh) {
            this.fDm();
            return;
        }
        JQp.PjT().JQp(this.ReZ);
    }

    public void cz() {
        if(this.PjT() == null) {
            return;
        }
        try {
            this.PjT().getWebView().resumeTimers();
        }
        catch(Exception unused_ex) {
        }
    }

    private void fDm() {
        if(this.xf.tT()) {
            JQp.PjT().Zh(this.ReZ);
            return;
        }
        JQp.PjT().ReZ(this.ReZ);
    }

    public xs qj() {
        return this.xf;
    }

    private void xf() {
        if(this.cz == null && com.bytedance.sdk.component.adexpress.cr.PjT() != null) {
            this.cz = com.bytedance.sdk.component.adexpress.cr.PjT();
        }
        if(this.cz != null) {
            cz cz0 = this.xs();
            this.ReZ = cz0;
            if(cz0 == null) {
                Log.d("WebViewRender", "initWebView: create WebView by act");
                this.ReZ = new cz(new MutableContextWrapper(this.cz.getApplicationContext()));
                return;
            }
            this.DWo = true;
            Log.d("WebViewRender", "initWebView: reuse WebView");
        }
    }

    // 去混淆评级： 低(20)
    private cz xs() {
        return this.xf.tT() ? JQp.PjT().PjT(this.cz, this.XX) : JQp.PjT().Zh(this.cz, this.XX);
    }
}

