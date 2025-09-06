package com.bytedance.sdk.openadsdk.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.component.utils.iZZ;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.DWo.cr;
import com.bytedance.sdk.openadsdk.common.fDm;
import com.bytedance.sdk.openadsdk.core.KM;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.xE;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.core.widget.PjT.JQp;
import com.bytedance.sdk.openadsdk.core.xf.Zh.ReZ;
import com.bytedance.sdk.openadsdk.cr.DWo;
import com.bytedance.sdk.openadsdk.cr.qj;
import com.bytedance.sdk.openadsdk.gK.Zh;
import com.bytedance.sdk.openadsdk.ltE.PjT.PjT.XX;
import com.bytedance.sdk.openadsdk.ltE.PjT.PjT.cz;
import com.bytedance.sdk.openadsdk.utils.Jo;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.qla;
import com.bytedance.sdk.openadsdk.utils.wN;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;
import x.a;
import x.b;
import x.c;

public abstract class TTVideoLandingPageActivity extends TTBaseActivity implements cr {
    @SuppressLint({"StaticFieldLeak"})
    static class PjT extends AsyncTask {
        private final Bitmap PjT;
        private final WeakReference Zh;

        private PjT(Bitmap bitmap0, c c0) {
            this.PjT = bitmap0;
            this.Zh = new WeakReference(c0);
        }

        PjT(Bitmap bitmap0, c c0, com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.1 tTVideoLandingPageActivity$10) {
            this(bitmap0, c0);
        }

        protected Drawable PjT(Void[] arr_void) {
            try {
                Bitmap bitmap0 = com.bytedance.sdk.component.adexpress.cr.PjT.PjT(ub.PjT(), this.PjT, 25);
                return bitmap0 == null ? null : new BitmapDrawable(ub.PjT().getResources(), bitmap0);
            }
            catch(Throwable throwable0) {
                RD.Zh("TTVideoLandingPage", throwable0.getMessage());
                return null;
            }
        }

        protected void PjT(Drawable drawable0) {
            if(drawable0 != null && (this.Zh != null && this.Zh.get() != null)) {
                ((c)this.Zh.get()).PjT(drawable0);
            }
        }

        @Override  // android.os.AsyncTask
        protected Object doInBackground(Object[] arr_object) {
            return this.PjT(((Void[])arr_object));
        }

        @Override  // android.os.AsyncTask
        protected void onPostExecute(Object object0) {
            this.PjT(((Drawable)object0));
        }
    }

    protected String Au;
    protected boolean Co;
    protected KM DWo;
    private final x.b.c HG;
    protected JSONArray IJ;
    protected Context JQp;
    protected boolean Jo;
    protected cz KM;
    private final AtomicInteger Ld;
    protected com.bytedance.sdk.openadsdk.core.widget.PjT Lrd;
    private final AtomicInteger MWx;
    protected String OMu;
    protected int Owx;
    protected com.bytedance.sdk.component.SM.cz PjT;
    protected boolean Qf;
    protected String RD;
    protected ImageView ReZ;
    protected String SM;
    protected RelativeLayout Sks;
    protected com.bytedance.sdk.openadsdk.core.widget.PjT.cz.PjT VY;
    protected Button Yo;
    protected String ZX;
    protected int Zd;
    protected ImageView Zh;
    private int cI;
    protected TextView cRA;
    protected TextView cr;
    protected int cz;
    private final AtomicInteger dwk;
    protected com.bytedance.sdk.openadsdk.core.xf.Zh.cz fDm;
    protected int gK;
    protected fDm iZZ;
    protected com.bytedance.sdk.openadsdk.multipro.Zh.PjT ig;
    protected AtomicBoolean kph;
    protected int ltE;
    private int oG;
    protected String qZS;
    protected int qj;
    protected long qla;
    protected qj rds;
    protected TextView tT;
    protected com.bytedance.sdk.openadsdk.core.Zh.PjT tY;
    protected int ub;
    protected boolean wN;
    protected Owx xE;
    private ILoader xH;
    protected FrameLayout xf;
    protected int xs;
    protected TextView yIW;
    private final com.bytedance.sdk.component.utils.iZZ.PjT zZ;

    public TTVideoLandingPageActivity() {
        this.xs = -1;
        this.ub = 0;
        this.gK = 0;
        this.ltE = 0;
        this.Owx = 0;
        this.RD = "ダウンロード";
        this.Qf = false;
        this.Jo = false;
        this.Co = true;
        this.wN = false;
        this.qZS = null;
        this.kph = new AtomicBoolean(true);
        this.IJ = null;
        this.dwk = new AtomicInteger(0);
        this.MWx = new AtomicInteger(0);
        this.Ld = new AtomicInteger(0);
        this.tY = null;
        this.HG = new x.b.c() {
            final TTVideoLandingPageActivity PjT;

            @Override  // x.b$c
            public void PjT(boolean z) {
                TTVideoLandingPageActivity.this.Qf = z;
                if(!TTVideoLandingPageActivity.this.isFinishing()) {
                    if(z) {
                        qZS.PjT(TTVideoLandingPageActivity.this.PjT, 8);
                        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)TTVideoLandingPageActivity.this.xf.getLayoutParams();
                        TTVideoLandingPageActivity.this.gK = viewGroup$MarginLayoutParams0.leftMargin;
                        TTVideoLandingPageActivity.this.ub = viewGroup$MarginLayoutParams0.topMargin;
                        TTVideoLandingPageActivity.this.ltE = viewGroup$MarginLayoutParams0.width;
                        TTVideoLandingPageActivity.this.Owx = viewGroup$MarginLayoutParams0.height;
                        viewGroup$MarginLayoutParams0.width = -1;
                        viewGroup$MarginLayoutParams0.height = -1;
                        viewGroup$MarginLayoutParams0.topMargin = 0;
                        viewGroup$MarginLayoutParams0.leftMargin = 0;
                        TTVideoLandingPageActivity.this.xf.setLayoutParams(viewGroup$MarginLayoutParams0);
                        return;
                    }
                    qZS.PjT(TTVideoLandingPageActivity.this.PjT, 0);
                    ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams1 = (ViewGroup.MarginLayoutParams)TTVideoLandingPageActivity.this.xf.getLayoutParams();
                    viewGroup$MarginLayoutParams1.width = TTVideoLandingPageActivity.this.ltE;
                    viewGroup$MarginLayoutParams1.height = TTVideoLandingPageActivity.this.Owx;
                    viewGroup$MarginLayoutParams1.leftMargin = TTVideoLandingPageActivity.this.gK;
                    viewGroup$MarginLayoutParams1.topMargin = TTVideoLandingPageActivity.this.ub;
                    TTVideoLandingPageActivity.this.xf.setLayoutParams(viewGroup$MarginLayoutParams1);
                }
            }
        };
        this.zZ = new com.bytedance.sdk.component.utils.iZZ.PjT() {
            final TTVideoLandingPageActivity PjT;

            // 检测为 Lambda 实现
            private void PjT(int v) [...]

            @Override  // com.bytedance.sdk.component.utils.iZZ$PjT
            public void PjT(Context context0, Intent intent0, boolean z, int v) {
                Jo.PjT(() -> {
                    TTVideoLandingPageActivity tTVideoLandingPageActivity0 = TTVideoLandingPageActivity.this;
                    if(tTVideoLandingPageActivity0.Zd == 0 && this.PjT != 0) {
                        com.bytedance.sdk.component.SM.cz cz0 = tTVideoLandingPageActivity0.PjT;
                        if(cz0 != null) {
                            String s = tTVideoLandingPageActivity0.qZS;
                            if(s != null) {
                                cz0.a_(s);
                            }
                        }
                    }
                    com.bytedance.sdk.openadsdk.core.xf.Zh.cz cz1 = TTVideoLandingPageActivity.this.fDm;
                    if(cz1 != null && cz1.getNativeVideoController() != null) {
                        TTVideoLandingPageActivity tTVideoLandingPageActivity1 = TTVideoLandingPageActivity.this;
                        if(!tTVideoLandingPageActivity1.Jo && tTVideoLandingPageActivity1.Zd != this.PjT) {
                            ((ReZ)tTVideoLandingPageActivity1.fDm.getNativeVideoController()).ReZ(this.PjT);
                        }
                    }
                    TTVideoLandingPageActivity.this.Zd = this.PjT;
                });

                class com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.2.1 implements Runnable {
                    final com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.2 Zh;

                    com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.2.1(int v) {
                    }

                    @Override
                    public void run() {
                        com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.2.this.PjT(this.PjT);
                    }
                }

            }
        };
    }

    protected void Au() {
        String s;
        if(this.xE != null && this.xE.cI() == 4) {
            qZS.PjT(this.Sks, 0);
            if(!TextUtils.isEmpty(this.xE.Xtz())) {
                s = this.xE.Xtz();
            }
            else if(TextUtils.isEmpty(this.xE.ix())) {
                s = TextUtils.isEmpty(this.xE.Ld()) ? "" : this.xE.Ld();
            }
            else {
                s = this.xE.ix();
            }
            if(this.xE.Xe() != null && this.xE.Xe().PjT() != null) {
                qZS.PjT(this.Lrd, 0);
                qZS.PjT(this.tT, 4);
                Zh.PjT().PjT(this.xE.Xe(), this.Lrd, this.xE);
            }
            else if(!TextUtils.isEmpty(s)) {
                qZS.PjT(this.Lrd, 4);
                qZS.PjT(this.tT, 0);
                this.tT.setText(s.substring(0, 1));
            }
            if(!TextUtils.isEmpty(this.xE.Nv())) {
                this.yIW.setText(this.xE.Nv());
            }
            if(!TextUtils.isEmpty(s)) {
                this.cRA.setText(s);
            }
            qZS.PjT(this.cRA, 0);
            qZS.PjT(this.yIW, 0);
        }
    }

    protected void DWo() {
        iZZ.PjT(this.zZ, this.JQp);
    }

    protected abstract boolean JQp();

    private void PjT(int v) {
        if(this.ReZ != null && this.ub()) {
            Jo.PjT(new Runnable() {
                final TTVideoLandingPageActivity Zh;

                @Override
                public void run() {
                    qZS.PjT(TTVideoLandingPageActivity.this.ReZ, v);
                }
            });
        }
    }

    private void PjT(String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        Button button0 = this.Yo;
        if(button0 != null) {
            button0.post(new Runnable() {
                final TTVideoLandingPageActivity Zh;

                @Override
                public void run() {
                    if(TTVideoLandingPageActivity.this.Yo != null && !TTVideoLandingPageActivity.this.isFinishing()) {
                        TTVideoLandingPageActivity.this.Yo.setText(s);
                    }
                }
            });
        }
    }

    private void PjT(b b0) {
        this.Jo = this.Jo || b0.qla();
        com.bytedance.sdk.openadsdk.multipro.cr.PjT.PjT("sp_multi_native_video_data", "key_video_is_update_flag", Boolean.TRUE);
        com.bytedance.sdk.openadsdk.multipro.cr.PjT.PjT("sp_multi_native_video_data", "key_video_isfromvideodetailpage", Boolean.TRUE);
        com.bytedance.sdk.openadsdk.multipro.cr.PjT.PjT("sp_multi_native_video_data", "key_native_video_complete", Boolean.valueOf(this.Jo));
        com.bytedance.sdk.openadsdk.multipro.cr.PjT.PjT("sp_multi_native_video_data", "key_video_current_play_position", b0.JQp());
        com.bytedance.sdk.openadsdk.multipro.cr.PjT.PjT("sp_multi_native_video_data", "key_video_total_play_duration", ((long)(b0.Au() + b0.cz())));
        com.bytedance.sdk.openadsdk.multipro.cr.PjT.PjT("sp_multi_native_video_data", "key_video_duration", b0.Au());
    }

    protected abstract View PjT();

    @Override  // com.bytedance.sdk.openadsdk.DWo.cr
    public void PjT(boolean z, JSONArray jSONArray0) {
        if(z && jSONArray0 != null && jSONArray0.length() > 0) {
            this.IJ = jSONArray0;
        }
    }

    protected void ReZ() {
        this.iZZ = (fDm)this.findViewById(qla.zZ);
        this.PjT = (com.bytedance.sdk.component.SM.cz)this.findViewById(qla.tY);
        ImageView imageView0 = (ImageView)this.findViewById(0x1F000018);
        this.Zh = imageView0;
        if(imageView0 != null) {
            imageView0.setOnClickListener(new View.OnClickListener() {
                final TTVideoLandingPageActivity PjT;

                @Override  // android.view.View$OnClickListener
                public void onClick(View view0) {
                    TTVideoLandingPageActivity tTVideoLandingPageActivity0 = TTVideoLandingPageActivity.this;
                    if(tTVideoLandingPageActivity0.PjT != null) {
                        com.bytedance.sdk.openadsdk.core.widget.PjT.cz.PjT cz$PjT0 = tTVideoLandingPageActivity0.VY;
                        if(cz$PjT0 != null) {
                            cz$PjT0.PjT();
                        }
                        if(TTVideoLandingPageActivity.this.PjT.SM()) {
                            TTVideoLandingPageActivity.this.PjT.DWo();
                            return;
                        }
                        if(TTVideoLandingPageActivity.this.ub()) {
                            TTVideoLandingPageActivity.this.onBackPressed();
                            return;
                        }
                        com.bytedance.sdk.openadsdk.core.xf.Zh.cz cz0 = TTVideoLandingPageActivity.this.fDm;
                        JSONObject jSONObject0 = cz0 == null || cz0.getNativeVideoController() == null ? null : wN.PjT(TTVideoLandingPageActivity.this.xE, TTVideoLandingPageActivity.this.fDm.getNativeVideoController().cz(), TTVideoLandingPageActivity.this.fDm.getNativeVideoController().xf());
                        com.bytedance.sdk.openadsdk.cr.ReZ.PjT(TTVideoLandingPageActivity.this.xE, "embeded_ad", "detail_back", TTVideoLandingPageActivity.this.cz(), TTVideoLandingPageActivity.this.XX(), jSONObject0, null);
                        TTVideoLandingPageActivity.this.finish();
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.xf.Zh.cz cz0 = this.fDm;
        if(cz0 != null) {
            cz0.setIsAutoPlay(this.wN);
        }
        ImageView imageView1 = (ImageView)this.findViewById(qla.ig);
        this.ReZ = imageView1;
        if(imageView1 != null) {
            imageView1.setOnClickListener(new View.OnClickListener() {
                final TTVideoLandingPageActivity PjT;

                @Override  // android.view.View$OnClickListener
                public void onClick(View view0) {
                    com.bytedance.sdk.openadsdk.core.xf.Zh.cz cz0 = TTVideoLandingPageActivity.this.fDm;
                    if(cz0 != null) {
                        JSONObject jSONObject0 = cz0.getNativeVideoController() == null ? null : wN.PjT(TTVideoLandingPageActivity.this.xE, TTVideoLandingPageActivity.this.fDm.getNativeVideoController().cz(), TTVideoLandingPageActivity.this.fDm.getNativeVideoController().xf());
                        com.bytedance.sdk.openadsdk.cr.ReZ.PjT(TTVideoLandingPageActivity.this.xE, "embeded_ad", "detail_skip", TTVideoLandingPageActivity.this.cz(), TTVideoLandingPageActivity.this.XX(), jSONObject0, null);
                    }
                    TTVideoLandingPageActivity.this.finish();
                }
            });
        }
        this.cr = (TextView)this.findViewById(qla.na);
        this.xf = (FrameLayout)this.findViewById(qla.Zd);
        this.Sks = (RelativeLayout)this.findViewById(qla.rds);
        this.tT = (TextView)this.findViewById(qla.IJ);
        this.cRA = (TextView)this.findViewById(qla.OMu);
        this.yIW = (TextView)this.findViewById(qla.VY);
        this.Lrd = (com.bytedance.sdk.openadsdk.core.widget.PjT)this.findViewById(qla.kph);
        this.Au();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void SM() {
        Owx owx0 = this.xE;
        if(owx0 == null) {
            return;
        }
        this.KM = XX.PjT(this, owx0, this.ZX);
        com.bytedance.sdk.openadsdk.core.Zh.PjT pjT0 = new com.bytedance.sdk.openadsdk.core.Zh.PjT(this, this.xE, this.ZX, this.qj);
        this.tY = pjT0;
        pjT0.PjT(false);
        this.tY.ReZ(true);
        this.yIW.setOnClickListener(this.tY);
        this.yIW.setOnTouchListener(this.tY);
        this.tY.PjT(this.KM);
    }

    protected int XX() {
        return this.fDm == null || this.fDm.getNativeVideoController() == null ? 0 : this.fDm.getNativeVideoController().DWo();
    }

    protected String Zh() [...] // 潜在的解密器

    protected void cr() {
        if(this.JQp()) {
            try {
                com.bytedance.sdk.openadsdk.core.xf.Zh.cz cz0 = new com.bytedance.sdk.openadsdk.core.xf.Zh.cz(this.JQp, this.xE, true, null);
                this.fDm = cz0;
                if(cz0.getNativeVideoController() != null) {
                    this.fDm.getNativeVideoController().PjT(false);
                }
                if(this.Jo) {
                    this.xf.setVisibility(0);
                    this.xf.removeAllViews();
                    this.xf.addView(this.fDm);
                    this.fDm.Zh(true);
                }
                else {
                    if(!this.wN) {
                        this.qla = 0L;
                    }
                    if(this.ig != null && this.fDm.getNativeVideoController() != null) {
                        this.fDm.getNativeVideoController().Zh(this.ig.XX);
                        this.fDm.getNativeVideoController().ReZ(this.ig.JQp);
                        int v = this.xE.joj();
                        this.fDm.PjT(ub.cr().ReZ(String.valueOf(v)), "landingPageInit");
                    }
                    if(this.fDm.PjT(this.qla, this.Co, this.Jo)) {
                        this.xf.setVisibility(0);
                        this.xf.removeAllViews();
                        this.xf.addView(this.fDm);
                    }
                    if(this.fDm.getNativeVideoController() != null) {
                        this.fDm.getNativeVideoController().PjT(false);
                        this.fDm.getNativeVideoController().PjT(this.HG);
                    }
                }
                String s = ((xE)this.xE.CY().get(0)).PjT();
                com.bytedance.sdk.openadsdk.SM.cr.PjT().PjT(s).PjT(((xE)this.xE.CY().get(0)).Zh()).Zh(((xE)this.xE.CY().get(0)).ReZ()).JQp(qZS.JQp(ub.PjT())).cr(qZS.ReZ(ub.PjT())).ReZ(2).PjT(new com.bytedance.sdk.openadsdk.SM.Zh(this.xE, s, new com.bytedance.sdk.component.JQp.xE() {
                    final TTVideoLandingPageActivity PjT;

                    @Override  // com.bytedance.sdk.component.JQp.xE
                    public void PjT(int v, String s, @Nullable Throwable throwable0) {
                    }

                    @Override  // com.bytedance.sdk.component.JQp.xE
                    public void PjT(com.bytedance.sdk.component.JQp.qj qj0) {
                        try {
                            new PjT(((Bitmap)qj0.Zh()), TTVideoLandingPageActivity.this.fDm.getNativeVideoController().xs(), null).execute(new Void[0]);
                        }
                        catch(Exception unused_ex) {
                        }
                    }
                }), 4);
                this.fDm.findViewById(0x1F00001E).setOnTouchListener(null);
                this.fDm.findViewById(0x1F00001E).setOnClickListener(null);
                goto label_34;
            }
            catch(Exception exception0) {
            }
            RD.Zh("TTVideoLandingPage", exception0.getMessage());
            if(this.fDm == null) {
                ApmHelper.reportCustomError("mNativeVideoTsView is null", "FUNCTION EXCEPTION", exception0);
            }
        label_34:
            if(this.Zd == 0) {
                try {
                    Toast.makeText(this, Lrd.PjT(this, "tt_no_network"), 0).show();
                }
                catch(Throwable unused_ex) {
                }
            }
        }
    }

    protected long cz() {
        return this.fDm == null || this.fDm.getNativeVideoController() == null ? 0L : this.fDm.getNativeVideoController().Au();
    }

    private void fDm() {
        if(this.fDm != null && this.fDm.getNativeVideoController() != null && !this.xE()) {
            this.fDm.xs();
        }
    }

    private void gK() {
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("isBackIntercept", true);
            this.DWo.PjT("temai_back_event", jSONObject0);
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // android.app.Activity
    public void onBackPressed() {
        if(this.Qf && (this.fDm != null && this.fDm.getNativeVideoController() != null)) {
            ((a)this.fDm.getNativeVideoController()).JQp(null, null);
            this.Qf = false;
            return;
        }
        if(this.ub() && !this.kph.getAndSet(true)) {
            this.gK();
            this.PjT(0);
            return;
        }
        super.onBackPressed();
    }

    @Override  // android.app.Activity
    public void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        this.xf();
    }

    // 去混淆评级： 低(20)
    @Override  // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        this.finish();

        class com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.1 implements DWo {
            final TTVideoLandingPageActivity PjT;

            @Override  // com.bytedance.sdk.openadsdk.cr.DWo
            public void PjT(int v) {
                com.bytedance.sdk.openadsdk.cr.ReZ.PjT.PjT(TTVideoLandingPageActivity.this.cI, TTVideoLandingPageActivity.this.Ld.get(), TTVideoLandingPageActivity.this.MWx.get(), TTVideoLandingPageActivity.this.dwk.get() - TTVideoLandingPageActivity.this.MWx.get(), TTVideoLandingPageActivity.this.xE, "landingpage_split_screen", v);
            }
        }


        class com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.4 extends JQp {
            final TTVideoLandingPageActivity PjT;

            com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.4(Context context0, KM kM0, String s, qj qj0, boolean z) {
            }

            @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
            public WebResourceResponse shouldInterceptRequest(WebView webView0, String s) {
                try {
                    if(TextUtils.isEmpty(TTVideoLandingPageActivity.this.OMu)) {
                        return super.shouldInterceptRequest(webView0, s);
                    }
                    TTVideoLandingPageActivity.this.dwk.incrementAndGet();
                    WebResourceResponseModel webResourceResponseModel0 = com.bytedance.sdk.openadsdk.XX.Zh.PjT().PjT(TTVideoLandingPageActivity.this.xH, TTVideoLandingPageActivity.this.OMu, s);
                    if(webResourceResponseModel0 != null && webResourceResponseModel0.getWebResourceResponse() != null) {
                        TTVideoLandingPageActivity.this.MWx.incrementAndGet();
                        return webResourceResponseModel0.getWebResourceResponse();
                    }
                    if(webResourceResponseModel0 != null && webResourceResponseModel0.getMsg() == 2) {
                        TTVideoLandingPageActivity.this.Ld.incrementAndGet();
                    }
                    return super.shouldInterceptRequest(webView0, s);
                }
                catch(Throwable throwable0) {
                }
                RD.PjT("TTVideoLandingPage", "shouldInterceptRequest url error", throwable0);
                return super.shouldInterceptRequest(webView0, s);
            }
        }


        class com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.5 extends com.bytedance.sdk.openadsdk.core.widget.PjT.cr {
            final TTVideoLandingPageActivity PjT;

            com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.5(KM kM0, qj qj0) {
            }

            @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.cr
            public void onProgressChanged(WebView webView0, int v) {
                super.onProgressChanged(webView0, v);
            }
        }


        class com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.6 implements DownloadListener {
            final TTVideoLandingPageActivity PjT;

            @Override  // android.webkit.DownloadListener
            public void onDownloadStart(String s, String s1, String s2, String s3, long v) {
                cz cz0 = TTVideoLandingPageActivity.this.KM;
                if(cz0 != null) {
                    cz0.cr();
                }
            }
        }

    }

    @Override  // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.qj();
        try {
            if(this.getWindow() != null) {
                ((ViewGroup)this.getWindow().getDecorView()).removeAllViews();
            }
            this.xE.cz(false);
        }
        catch(Throwable unused_ex) {
        }
        com.bytedance.sdk.component.SM.cz cz0 = this.PjT;
        if(cz0 != null) {
            com.bytedance.sdk.openadsdk.core.Jo.PjT(cz0.getWebView());
        }
        this.PjT = null;
        KM kM0 = this.DWo;
        if(kM0 != null) {
            kM0.xf();
        }
        if(this.fDm != null && this.fDm.getNativeVideoController() != null) {
            this.fDm.getNativeVideoController().cr();
        }
        this.fDm = null;
        this.xE = null;
        qj qj0 = this.rds;
        if(qj0 != null) {
            qj0.cr(true);
        }
        if(!TextUtils.isEmpty(this.OMu)) {
            com.bytedance.sdk.openadsdk.cr.ReZ.PjT.PjT(this.MWx.get(), this.dwk.get(), this.xE);
        }
        com.bytedance.sdk.openadsdk.XX.Zh.PjT().PjT(this.xH);
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    protected void onPause() {
        super.onPause();
        this.qla();
        if(this.fDm != null && this.fDm.getNativeVideoController() != null) {
            this.PjT(this.fDm.getNativeVideoController());
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    protected void onResume() {
        super.onResume();
        if(!this.Co) {
            this.fDm();
        }
        this.Co = false;
        KM kM0 = this.DWo;
        if(kM0 != null) {
            kM0.qj();
        }
        qj qj0 = this.rds;
        if(qj0 != null) {
            qj0.XX();
        }
    }

    @Override  // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle0) {
        if(bundle0 == null) {
            bundle0 = new Bundle();
        }
        bundle0.putString("material_meta", (this.xE == null ? null : this.xE.dDm().toString()));
        bundle0.putLong("video_play_position", this.qla);
        bundle0.putBoolean("is_complete", this.Jo);
        bundle0.putLong("video_play_position", (this.fDm == null || this.fDm.getNativeVideoController() == null ? this.qla : this.fDm.getNativeVideoController().JQp()));
        super.onSaveInstanceState(bundle0);
    }

    @Override  // android.app.Activity
    protected void onStart() {
        super.onStart();
        com.bytedance.sdk.openadsdk.utils.cr.PjT(this, this.xE);
    }

    @Override  // android.app.Activity
    protected void onStop() {
        super.onStop();
        qj qj0 = this.rds;
        if(qj0 != null) {
            qj0.Au();
        }
    }

    protected void qj() {
        try {
            iZZ.PjT(this.zZ);
        }
        catch(Exception unused_ex) {
        }
    }

    private void qla() {
        if(this.fDm != null && !this.xE()) {
            this.fDm.xs();
        }
    }

    // 去混淆评级： 低(20)
    private boolean ub() {
        return !TextUtils.isEmpty(this.qZS) && this.qZS.contains("__luban_sdk");
    }

    private boolean xE() {
        return this.fDm == null || this.fDm.getNativeVideoController() == null ? true : this.fDm.getNativeVideoController().qla();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void xf() {
        if(this.xE != null && this.xE.cI() == 4) {
            this.iZZ.setVisibility(0);
            Button button0 = (Button)this.findViewById(qla.xR);
            this.Yo = button0;
            if(button0 != null) {
                this.PjT("ダウンロード");
                this.Yo.setOnClickListener(this.tY);
                this.Yo.setOnTouchListener(this.tY);
            }
        }
    }

    private void xs() {
        KM kM0 = new KM(this);
        this.DWo = kM0;
        kM0.Zh(this.PjT).ReZ(this.Au).cr(this.SM).Zh(this.qj).PjT(this.xE).PjT(this.xE.OMu()).PjT(this.PjT).Zh("landingpage_split_screen").JQp(this.xE.SW());
    }
}

