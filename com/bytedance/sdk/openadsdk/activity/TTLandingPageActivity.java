package com.bytedance.sdk.openadsdk.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View.OnScrollChangeListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.cr;
import com.bytedance.sdk.openadsdk.common.fDm;
import com.bytedance.sdk.openadsdk.common.qla;
import com.bytedance.sdk.openadsdk.common.xf;
import com.bytedance.sdk.openadsdk.core.KM;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.widget.PjT.JQp;
import com.bytedance.sdk.openadsdk.cr.DWo;
import com.bytedance.sdk.openadsdk.cr.qj;
import com.bytedance.sdk.openadsdk.ltE.PjT.PjT.XX;
import com.bytedance.sdk.openadsdk.ltE.PjT.PjT.cz;
import com.bytedance.sdk.openadsdk.utils.Jo;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.wN;
import com.bytedance.sdk.openadsdk.utils.xs;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

public class TTLandingPageActivity extends TTBaseActivity {
    public static class PjT implements DWo {
        private final int PjT;
        private final String ReZ;
        private final Owx Zh;
        private final WeakReference cr;

        public PjT(int v, Owx owx0, String s, TTLandingPageActivity tTLandingPageActivity0) {
            this.PjT = v;
            this.Zh = owx0;
            this.ReZ = s;
            this.cr = new WeakReference(tTLandingPageActivity0);
        }

        @Override  // com.bytedance.sdk.openadsdk.cr.DWo
        public void PjT(int v) {
            TTLandingPageActivity tTLandingPageActivity0 = (TTLandingPageActivity)this.cr.get();
            if(tTLandingPageActivity0 != null) {
                int v1 = tTLandingPageActivity0.yIW.get();
                int v2 = tTLandingPageActivity0.KM.get();
                int v3 = tTLandingPageActivity0.cRA.get();
                int v4 = tTLandingPageActivity0.KM.get();
                com.bytedance.sdk.openadsdk.cr.ReZ.PjT.PjT(this.PjT, v1, v2, v3 - v4, this.Zh, this.ReZ, v);
            }
        }
    }

    static class ReZ implements View.OnTouchListener {
        private final WeakReference PjT;
        private final WeakReference Zh;

        public ReZ(qj qj0, cr cr0) {
            this.PjT = new WeakReference(qj0);
            this.Zh = new WeakReference(cr0);
        }

        @Override  // android.view.View$OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view0, MotionEvent motionEvent0) {
            qj qj0 = (qj)this.PjT.get();
            if(qj0 != null) {
                qj0.PjT(motionEvent0);
            }
            cr cr0 = (cr)this.Zh.get();
            if(cr0 != null) {
                cr0.PjT(motionEvent0);
            }
            return false;
        }
    }

    static class Zh implements View.OnScrollChangeListener {
        private final WeakReference PjT;

        public Zh(qj qj0) {
            this.PjT = new WeakReference(qj0);
        }

        @Override  // android.view.View$OnScrollChangeListener
        public void onScrollChange(View view0, int v, int v1, int v2, int v3) {
            qj qj0 = (qj)this.PjT.get();
            if(qj0 != null) {
                qj0.Zh(v1);
            }
        }
    }

    private ImageView Au;
    private com.bytedance.sdk.openadsdk.core.widget.PjT.cz.PjT Co;
    private Context DWo;
    final AtomicBoolean JQp;
    private xs Jo;
    private final AtomicInteger KM;
    private ILoader Lrd;
    private cz Owx;
    qj PjT;
    private xf Qf;
    private String RD;
    TTAdDislikeToast ReZ;
    private TextView SM;
    private final AtomicBoolean Sks;
    private int Yo;
    private boolean ZX;
    private String Zd;
    qla Zh;
    private final AtomicInteger cRA;
    final AtomicBoolean cr;
    private com.bytedance.sdk.component.SM.cz cz;
    private String fDm;
    private String gK;
    private int iZZ;
    private Owx ltE;
    private JQp qZS;
    private fDm qj;
    private String qla;
    private String tT;
    private int ub;
    private cr wN;
    private KM xE;
    private Button xf;
    private com.bytedance.sdk.openadsdk.core.JQp.cz xs;
    private final AtomicInteger yIW;

    public TTLandingPageActivity() {
        this.Sks = new AtomicBoolean(true);
        this.cRA = new AtomicInteger(0);
        this.yIW = new AtomicInteger(0);
        this.KM = new AtomicInteger(0);
        this.cr = new AtomicBoolean(false);
        this.JQp = new AtomicBoolean(false);
        this.Zd = "ダウンロード";
    }

    private void Au() {
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("isBackIntercept", true);
            this.xE.PjT("temai_back_event", jSONObject0);
        }
        catch(Exception unused_ex) {
        }
    }

    private void DWo() {
        TTAdDislikeToast tTAdDislikeToast0 = this.ReZ;
        if(tTAdDislikeToast0 == null) {
            return;
        }
        tTAdDislikeToast0.show(TTAdDislikeToast.getDislikeTip());
    }

    private void JQp() {
        com.bytedance.sdk.component.SM.cz cz0 = (com.bytedance.sdk.component.SM.cz)this.findViewById(com.bytedance.sdk.openadsdk.utils.qla.tY);
        this.cz = cz0;
        wN.PjT(this.ltE, cz0);
        this.qj = (fDm)this.findViewById(com.bytedance.sdk.openadsdk.utils.qla.zZ);
        fDm fDm0 = (fDm)this.findViewById(com.bytedance.sdk.openadsdk.utils.qla.kFP);
        xf xf0 = (xf)this.findViewById(0x1F000019);
        this.Qf = xf0;
        if(xf0 != null) {
            xf0.PjT(this.ltE);
            this.Qf.PjT();
        }
        if(fDm0 != null) {
            fDm0.setVisibility(0);
        }
        ImageView imageView0 = (ImageView)this.findViewById(0x1F000018);
        if(imageView0 != null) {
            imageView0.setOnClickListener(new View.OnClickListener() {
                final TTLandingPageActivity PjT;

                @Override  // android.view.View$OnClickListener
                public void onClick(View view0) {
                    if(TTLandingPageActivity.this.cz != null) {
                        if(TTLandingPageActivity.this.Co != null) {
                            TTLandingPageActivity.this.Co.PjT();
                        }
                        if(TTLandingPageActivity.this.cz.SM()) {
                            TTLandingPageActivity.this.cz.DWo();
                            return;
                        }
                        if(TTLandingPageActivity.this.XX()) {
                            TTLandingPageActivity.this.onBackPressed();
                            return;
                        }
                        TTLandingPageActivity.this.finish();
                    }
                }
            });
        }
        ImageView imageView1 = (ImageView)this.findViewById(0x1F000014);
        this.Au = imageView1;
        if(imageView1 != null) {
            imageView1.setOnClickListener(new View.OnClickListener() {
                final TTLandingPageActivity PjT;

                @Override  // android.view.View$OnClickListener
                public void onClick(View view0) {
                    TTLandingPageActivity.this.finish();
                }
            });
        }
        this.SM = (TextView)this.findViewById(com.bytedance.sdk.openadsdk.utils.qla.na);
        com.bytedance.sdk.openadsdk.core.JQp.cz cz1 = (com.bytedance.sdk.openadsdk.core.JQp.cz)this.findViewById(com.bytedance.sdk.openadsdk.utils.qla.fA);
        this.xs = cz1;
        if(cz1 != null) {
            cz1.setVisibility(0);
        }
        View view0 = this.findViewById(com.bytedance.sdk.openadsdk.utils.qla.fK);
        if(view0 != null) {
            view0.setOnClickListener((/* 缺少LAMBDA参数 */) -> {
                if(TTLandingPageActivity.this.isFinishing()) {
                    return;
                }
                if(TTLandingPageActivity.this.JQp.get()) {
                    TTLandingPageActivity.this.DWo();
                    return;
                }
                if(TTLandingPageActivity.this.Zh == null) {
                    TTLandingPageActivity.this.SM();
                }
                qla qla0 = TTLandingPageActivity.this.Zh;
                if(qla0 != null) {
                    qla0.PjT();
                }
            });
        }

        class com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.2 implements View.OnClickListener {
            final TTLandingPageActivity PjT;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                TTLandingPageActivity.this.PjT();
            }
        }

    }

    private void PjT(int v) {
        if(v == 1) {
            return;
        }
        switch(Build.VERSION.SDK_INT) {
            case 26: {
                break;
            }
            case 27: {
                try {
                    this.setRequestedOrientation(v);
                }
                catch(Throwable unused_ex) {
                }
                return;
            }
            default: {
                this.setRequestedOrientation(v);
                break;
            }
        }
    }

    private void PjT(String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        Button button0 = this.xf;
        if(button0 != null) {
            button0.post(new Runnable() {
                final TTLandingPageActivity Zh;

                @Override
                public void run() {
                    if(TTLandingPageActivity.this.xf != null && !TTLandingPageActivity.this.isFinishing()) {
                        TTLandingPageActivity.this.xf.setText(s);
                    }
                }
            });
        }
    }

    // 检测为 Lambda 实现
    protected void PjT() [...]

    @SuppressLint({"ClickableViewAccessibility"})
    private void ReZ() {
        if(this.ltE != null && this.ltE.cI() == 4) {
            fDm fDm0 = this.qj;
            if(fDm0 != null) {
                fDm0.setVisibility(0);
            }
            Button button0 = (Button)this.findViewById(com.bytedance.sdk.openadsdk.utils.qla.xR);
            this.xf = button0;
            if(button0 != null) {
                this.PjT("ダウンロード");
                if(this.Owx == null) {
                    String s = TextUtils.isEmpty(this.gK) ? wN.Zh(this.ub) : this.gK;
                    this.Owx = XX.PjT(this, this.ltE, s);
                }
                com.bytedance.sdk.openadsdk.core.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.core.Zh.PjT(this, this.ltE, this.gK, this.ub);
                pjT0.PjT(false);
                this.xf.setOnClickListener(pjT0);
                this.xf.setOnTouchListener(pjT0);
                pjT0.ReZ(true);
                pjT0.PjT(this.Owx);
            }
        }
    }

    private void SM() {
        try {
            if(this.Zh == null) {
                qla qla0 = new qla(this.DWo, this.ltE);
                this.Zh = qla0;
                qla0.setDislikeSource("landing_page");
                this.Zh.setCallback(new com.bytedance.sdk.openadsdk.common.qla.PjT() {
                    final TTLandingPageActivity PjT;

                    @Override  // com.bytedance.sdk.openadsdk.common.qla$PjT
                    public void PjT(View view0) {
                        TTLandingPageActivity.this.cr.set(true);
                    }

                    @Override  // com.bytedance.sdk.openadsdk.common.qla$PjT
                    public void PjT(FilterWord filterWord0) {
                        if(!TTLandingPageActivity.this.JQp.get() && filterWord0 != null && !filterWord0.hasSecondOptions()) {
                            TTLandingPageActivity.this.JQp.set(true);
                            TTLandingPageActivity.this.qj();
                        }
                    }

                    @Override  // com.bytedance.sdk.openadsdk.common.qla$PjT
                    public void Zh(View view0) {
                        TTLandingPageActivity.this.cr.set(false);
                    }
                });
            }
            FrameLayout frameLayout0 = (FrameLayout)this.findViewById(0x1020002);
            frameLayout0.addView(this.Zh);
            if(this.ReZ == null) {
                TTAdDislikeToast tTAdDislikeToast0 = new TTAdDislikeToast(this.DWo);
                this.ReZ = tTAdDislikeToast0;
                frameLayout0.addView(tTAdDislikeToast0);
            }
            return;
        }
        catch(Throwable throwable0) {
        }
        ApmHelper.reportCustomError("initDislike error", "LandingPageActivity", throwable0);
    }

    // 去混淆评级： 低(20)
    private boolean XX() {
        return !TextUtils.isEmpty(this.RD) && this.RD.contains("__luban_sdk");
    }

    private View Zh() {
        View view0 = new com.bytedance.sdk.openadsdk.core.JQp.ReZ(this);
        if(Build.VERSION.SDK_INT >= 35) {
            view0.setFitsSystemWindows(true);
        }
        com.bytedance.sdk.openadsdk.core.JQp.JQp jQp0 = new com.bytedance.sdk.openadsdk.core.JQp.JQp(this);
        jQp0.setOrientation(1);
        ((ViewGroup)view0).addView(jQp0, new FrameLayout.LayoutParams(-1, -1));
        fDm fDm0 = new fDm(this, new com.bytedance.sdk.openadsdk.common.fDm.PjT() {
            final TTLandingPageActivity PjT;

            @Override  // com.bytedance.sdk.openadsdk.common.fDm$PjT
            public View PjT(Context context0) {
                return new com.bytedance.sdk.openadsdk.common.DWo(context0);
            }
        });
        fDm0.setId(com.bytedance.sdk.openadsdk.utils.qla.kFP);
        jQp0.addView(fDm0, new LinearLayout.LayoutParams(-1, qZS.Zh(this, 44.0f)));
        com.bytedance.sdk.openadsdk.core.JQp.ReZ reZ0 = new com.bytedance.sdk.openadsdk.core.JQp.ReZ(this);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, 0);
        linearLayout$LayoutParams0.weight = 1.0f;
        jQp0.addView(reZ0, linearLayout$LayoutParams0);
        com.bytedance.sdk.component.SM.cz cz0 = new com.bytedance.sdk.component.SM.cz(this);
        cz0.setId(com.bytedance.sdk.openadsdk.utils.qla.tY);
        reZ0.addView(cz0, new FrameLayout.LayoutParams(-1, -1));
        fDm fDm1 = new fDm(this, new com.bytedance.sdk.openadsdk.common.fDm.PjT() {
            final TTLandingPageActivity PjT;

            @Override  // com.bytedance.sdk.openadsdk.common.fDm$PjT
            public View PjT(Context context0) {
                return new com.bytedance.sdk.openadsdk.common.XX(context0);
            }
        });
        fDm1.setId(com.bytedance.sdk.openadsdk.utils.qla.zZ);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -2);
        frameLayout$LayoutParams0.gravity = 81;
        reZ0.addView(fDm1, frameLayout$LayoutParams0);
        com.bytedance.sdk.openadsdk.core.JQp.cz cz1 = new com.bytedance.sdk.openadsdk.core.JQp.cz(this, null, 0x103001F);
        cz1.setId(com.bytedance.sdk.openadsdk.utils.qla.fA);
        cz1.setProgress(1);
        cz1.setVisibility(8);
        cz1.setProgressDrawable(com.bytedance.sdk.openadsdk.utils.DWo.PjT(this, "tt_browser_progress_style"));
        FrameLayout.LayoutParams frameLayout$LayoutParams1 = new FrameLayout.LayoutParams(-1, qZS.Zh(this, 3.0f));
        frameLayout$LayoutParams1.gravity = 49;
        reZ0.addView(cz1, frameLayout$LayoutParams1);
        xf xf0 = new xf(this);
        xf0.setId(0x1F000019);
        ((ViewGroup)view0).addView(xf0, new FrameLayout.LayoutParams(-1, -1));
        return view0;
    }

    private void Zh(int v) {
        if(this.Au != null && this.XX()) {
            Jo.PjT(new Runnable() {
                final TTLandingPageActivity Zh;

                @Override
                public void run() {
                    qZS.PjT(TTLandingPageActivity.this.Au, v);
                }
            });
        }
    }

    private String cr() [...] // 潜在的解密器

    private void cz() {
        KM kM0 = new KM(this);
        this.xE = kM0;
        kM0.Zh(this.cz).ReZ(this.fDm).cr(this.qla).PjT(this.ltE).Zh(this.ub).PjT(this.ltE.OMu()).JQp(this.ltE.SW()).PjT(this.cz).Zh("landingpage");
    }

    @Override  // android.app.Activity
    public void onBackPressed() {
        if(this.XX() && !this.Sks.getAndSet(true)) {
            this.Au();
            this.Zh(0);
            return;
        }
        try {
            super.onBackPressed();
        }
        catch(Throwable throwable0) {
            RD.Zh("TTAD.LandingPageAct", new Object[]{"onBackPressed: ", throwable0.getMessage()});
        }
    }

    @Override  // android.app.Activity
    public void onConfigurationChanged(Configuration configuration0) {
        try {
            super.onConfigurationChanged(configuration0);
        }
        catch(Throwable unused_ex) {
        }
        this.ReZ();
    }

    @Override  // android.app.Activity
    @SuppressLint({"ClickableViewAccessibility"})
    protected void onCreate(@Nullable Bundle bundle0) {
        this.PjT(3);
        super.onCreate(bundle0);
        this.finish();

        class com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.1 extends JQp {
            final TTLandingPageActivity PjT;

            com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.1(Context context0, KM kM0, String s, cr cr0, qj qj0, boolean z) {
            }

            @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
            public void onPageFinished(WebView webView0, String s) {
                super.onPageFinished(webView0, s);
                try {
                    if(TTLandingPageActivity.this.xs != null && !TTLandingPageActivity.this.isFinishing()) {
                        TTLandingPageActivity.this.xs.setVisibility(8);
                    }
                }
                catch(Throwable unused_ex) {
                }
                if(TTLandingPageActivity.this.Qf != null) {
                    TTLandingPageActivity.this.Qf.Zh();
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
            public WebResourceResponse shouldInterceptRequest(WebView webView0, String s) {
                try {
                    if(TextUtils.isEmpty(TTLandingPageActivity.this.tT)) {
                        return super.shouldInterceptRequest(webView0, s);
                    }
                    TTLandingPageActivity.this.cRA.incrementAndGet();
                    WebResourceResponseModel webResourceResponseModel0 = com.bytedance.sdk.openadsdk.XX.Zh.PjT().PjT(TTLandingPageActivity.this.Lrd, TTLandingPageActivity.this.tT, s);
                    if(webResourceResponseModel0 != null && webResourceResponseModel0.getWebResourceResponse() != null) {
                        TTLandingPageActivity.this.KM.incrementAndGet();
                        return webResourceResponseModel0.getWebResourceResponse();
                    }
                    if(webResourceResponseModel0 != null && webResourceResponseModel0.getMsg() == 2) {
                        TTLandingPageActivity.this.yIW.incrementAndGet();
                    }
                    return super.shouldInterceptRequest(webView0, s);
                }
                catch(Throwable throwable0) {
                }
                RD.PjT("TTAD.LandingPageAct", "shouldInterceptRequest url error", throwable0);
                return super.shouldInterceptRequest(webView0, s);
            }
        }


        class com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.5 extends com.bytedance.sdk.openadsdk.core.widget.PjT.cr {
            final TTLandingPageActivity PjT;

            com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.5(KM kM0, qj qj0, cr cr0) {
            }

            @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.cr
            public void onProgressChanged(WebView webView0, int v) {
                super.onProgressChanged(webView0, v);
                if(TTLandingPageActivity.this.Qf != null) {
                    TTLandingPageActivity.this.Qf.PjT(v);
                }
                if(TTLandingPageActivity.this.xs != null && !TTLandingPageActivity.this.isFinishing()) {
                    if(v == 100 && TTLandingPageActivity.this.xs.isShown()) {
                        TTLandingPageActivity.this.xs.setVisibility(8);
                        return;
                    }
                    TTLandingPageActivity.this.xs.setProgress(v);
                }
            }
        }


        class com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.6 implements DownloadListener {
            final TTLandingPageActivity PjT;

            @Override  // android.webkit.DownloadListener
            public void onDownloadStart(String s, String s1, String s2, String s3, long v) {
                if(TTLandingPageActivity.this.Owx != null) {
                    TTLandingPageActivity.this.Owx.cr();
                }
            }
        }


        class com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity.7 implements com.bytedance.sdk.openadsdk.utils.Au.PjT {
            final TTLandingPageActivity PjT;

            @Override  // com.bytedance.sdk.openadsdk.utils.Au$PjT
            public View PjT() {
                return TTLandingPageActivity.this.Au;
            }

            @Override  // com.bytedance.sdk.openadsdk.utils.Au$PjT
            public void Zh() {
            }
        }

    }

    @Override  // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        qj qj0 = this.PjT;
        if(qj0 != null) {
            com.bytedance.sdk.component.SM.cz cz0 = this.cz;
            if(cz0 != null) {
                qj0.PjT(cz0);
            }
        }
        try {
            if(this.getWindow() != null) {
                ((ViewGroup)this.getWindow().getDecorView()).removeAllViews();
            }
        }
        catch(Throwable unused_ex) {
        }
        com.bytedance.sdk.component.SM.cz cz1 = this.cz;
        if(cz1 != null) {
            com.bytedance.sdk.openadsdk.core.Jo.PjT(cz1.getWebView());
        }
        this.cz = null;
        KM kM0 = this.xE;
        if(kM0 != null) {
            kM0.xf();
        }
        qj qj1 = this.PjT;
        if(qj1 != null) {
            qj1.cr(true);
        }
        if(!TextUtils.isEmpty(this.tT)) {
            com.bytedance.sdk.openadsdk.cr.ReZ.PjT.PjT(this.KM.get(), this.cRA.get(), this.ltE);
        }
        com.bytedance.sdk.openadsdk.XX.Zh.PjT().PjT(this.Lrd);
        xs xs0 = this.Jo;
        if(xs0 != null) {
            xs0.ReZ();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    protected void onPause() {
        super.onPause();
        xs xs0 = this.Jo;
        if(xs0 != null) {
            xs0.Zh();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    protected void onResume() {
        super.onResume();
        KM kM0 = this.xE;
        if(kM0 != null) {
            kM0.qj();
        }
        qj qj0 = this.PjT;
        if(qj0 != null) {
            qj0.XX();
        }
        if(!this.ZX) {
            this.ZX = true;
            this.PjT(4);
        }
        xs xs0 = this.Jo;
        if(xs0 != null) {
            xs0.PjT();
        }
    }

    @Override  // android.app.Activity
    protected void onStart() {
        super.onStart();
        com.bytedance.sdk.openadsdk.utils.cr.PjT(this, this.ltE);
    }

    @Override  // android.app.Activity
    protected void onStop() {
        super.onStop();
        qj qj0 = this.PjT;
        if(qj0 != null) {
            qj0.Au();
        }
    }

    private void qj() {
        if(!this.isFinishing()) {
            TTAdDislikeToast tTAdDislikeToast0 = this.ReZ;
            if(tTAdDislikeToast0 != null) {
                tTAdDislikeToast0.show(TTAdDislikeToast.getDislikeSendTip());
            }
        }
    }
}

