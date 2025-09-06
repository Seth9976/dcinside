package com.bytedance.sdk.openadsdk.core.model;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.http.SslError;
import android.os.Build.VERSION;
import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View.OnScrollChangeListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.webkit.DownloadListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.JQp.Au;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity;
import com.bytedance.sdk.openadsdk.common.xf;
import com.bytedance.sdk.openadsdk.core.Au.ltE;
import com.bytedance.sdk.openadsdk.core.JQp.cr;
import com.bytedance.sdk.openadsdk.core.KM;
import com.bytedance.sdk.openadsdk.core.fDm;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.core.widget.PjT.JQp;
import com.bytedance.sdk.openadsdk.core.widget.xE;
import com.bytedance.sdk.openadsdk.cr.DWo;
import com.bytedance.sdk.openadsdk.cr.ReZ;
import com.bytedance.sdk.openadsdk.cr.qj;
import com.bytedance.sdk.openadsdk.ltE.PjT.PjT.XX;
import com.bytedance.sdk.openadsdk.ltE.PjT.PjT.cz;
import com.bytedance.sdk.openadsdk.utils.Jo;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.qla;
import com.bytedance.sdk.openadsdk.utils.wN;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import x.b.a;

public class gK implements Handler.Callback {
    static class PjT implements Au {
        @Override  // com.bytedance.sdk.component.JQp.Au
        public Bitmap PjT(Bitmap bitmap0) {
            return com.bytedance.sdk.component.adexpress.cr.PjT.PjT(ub.PjT(), bitmap0, 25);
        }
    }

    public static class Zh implements DWo {
        private final int PjT;
        private final String ReZ;
        private final Owx Zh;
        private final WeakReference cr;

        public Zh(int v, Owx owx0, String s, gK gK0) {
            this.PjT = v;
            this.Zh = owx0;
            this.ReZ = s;
            this.cr = new WeakReference(gK0);
        }

        @Override  // com.bytedance.sdk.openadsdk.cr.DWo
        public void PjT(int v) {
            gK gK0 = (gK)this.cr.get();
            if(gK0 != null) {
                int v1 = gK0.MWx;
                int v2 = gK0.dwk;
                int v3 = gK0.xH;
                int v4 = gK0.dwk;
                com.bytedance.sdk.openadsdk.cr.ReZ.PjT.PjT(this.PjT, v1, v2, v3 - v4, this.Zh, this.ReZ, v);
            }
        }
    }

    FrameLayout Au;
    private xE CY;
    private final com.bytedance.sdk.openadsdk.core.xf.cr.Zh Co;
    ValueAnimator DWo;
    private cr HG;
    private boolean IJ;
    View JQp;
    private String Jo;
    private long KM;
    private int Ld;
    private FrameLayout Lrd;
    private volatile int MWx;
    private final AtomicBoolean Nv;
    private JQp OMu;
    private xE Owx;
    ImageView PjT;
    private final AtomicBoolean Qf;
    private TextView RD;
    TextView ReZ;
    ObjectAnimator SM;
    private KM Sks;
    private String VY;
    final Owx XX;
    private FrameLayout Xe;
    private Zh Xtz;
    private View Yo;
    private final Activity ZX;
    private cz Zd;
    FrameLayout Zh;
    private int cI;
    private xf cRA;
    FrameLayout cr;
    RelativeLayout cz;
    private volatile int dwk;
    private com.bytedance.sdk.openadsdk.core.JQp.Au fA;
    com.bytedance.sdk.openadsdk.core.Zh.Zh fDm;
    private TextView gK;
    private ImageView iZZ;
    private qj ig;
    private ValueAnimator ix;
    private float kFP;
    private final AtomicBoolean kph;
    private TextView ltE;
    private com.bytedance.sdk.openadsdk.common.cr oG;
    private int qZS;
    ObjectAnimator qj;
    private Handler qla;
    private boolean rds;
    private com.bytedance.sdk.component.SM.cz tT;
    private ILoader tY;
    private View ub;
    private final AtomicBoolean wKV;
    private final View wN;
    private View xE;
    private volatile int xH;
    a xf;
    com.bytedance.sdk.openadsdk.core.Zh.PjT xs;
    private AtomicBoolean xu;
    private View yIW;
    private long yks;
    private LinearLayout.LayoutParams zYH;
    private ltE zZ;

    public gK(Activity activity0, Owx owx0, String s, FrameLayout frameLayout0, com.bytedance.sdk.openadsdk.core.xf.cr.Zh zh0, View view0) {
        this.Qf = new AtomicBoolean(false);
        this.kph = new AtomicBoolean(false);
        this.xH = 0;
        this.dwk = 0;
        this.MWx = 0;
        this.kFP = -1.0f;
        this.wKV = new AtomicBoolean(false);
        this.yks = -1L;
        this.Nv = new AtomicBoolean(false);
        this.ZX = activity0;
        this.XX = owx0;
        this.Jo = s;
        this.Co = zh0;
        this.wN = view0;
        this.qZS = wN.PjT(s);
        if(owx0 != null) {
            this.VY = owx0.MN();
        }
        if(!TextUtils.isEmpty(this.VY)) {
            this.tY = com.bytedance.sdk.openadsdk.XX.Zh.PjT().Zh();
            int v = com.bytedance.sdk.openadsdk.XX.Zh.PjT().PjT(this.tY, this.VY);
            this.Ld = v;
            this.cI = v <= 0 ? 0 : 2;
        }
        boolean z = gK.cr(owx0);
        boolean z1 = gK.JQp(owx0);
        boolean z2 = gK.Zh(owx0);
        if(z2) {
            this.Jo = "landingpage_split_screen";
        }
        else if(z) {
            this.Jo = "landingpage_direct";
        }
        else if(z1) {
            this.Jo = "aggregate_page";
        }
        else if(gK.ReZ(owx0)) {
            this.Jo = "landingpage_split_ceiling";
        }
        this.xs = new com.bytedance.sdk.openadsdk.core.Zh.PjT(ub.PjT(), owx0, this.Jo, wN.PjT(s));
        HashMap hashMap0 = new HashMap();
        hashMap0.put("click_scence", 1);
        this.xs.PjT(hashMap0);
        View view1 = activity0.findViewById(0x1020002);
        this.xs.PjT(view1);
        com.bytedance.sdk.openadsdk.core.model.gK.1 gK$10 = new com.bytedance.sdk.openadsdk.core.Zh.Zh(activity0, owx0, this.Jo, wN.PjT(s), true) {
            final gK Zh;

            @Override  // com.bytedance.sdk.openadsdk.core.Zh.Zh
            public boolean PjT(com.bytedance.sdk.openadsdk.core.model.DWo dWo0, Map map0) {
                if(gK.Au(owx0) && gK.this.OMu != null) {
                    gK.this.OMu.PjT(dWo0);
                    gK.this.OMu.PjT(map0);
                    return !gK.XX(gK.this.XX) && !gK.this.IJ ? super.PjT(dWo0, map0) : true;
                }
                return super.PjT(dWo0, map0);
            }
        };
        this.fDm = gK$10;
        gK$10.PjT(hashMap0);
        this.fDm.PjT(view1);
        this.Au = frameLayout0;
        try {
            if(z2 || z || z1) {
                this.qla = new Handler(Looper.getMainLooper(), this);
            }
            if(z || z1) {
                this.qla.sendMessage(this.qla.obtainMessage(100, 0, 0));
            }
        }
        catch(Exception exception0) {
            Log.e("LandingPageModel", "LandingPageModel: ", exception0);
        }
    }

    public static boolean Au(Owx owx0) {
        if(owx0 != null) {
            switch(owx0.RD()) {
                case 19: 
                case 20: {
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
        return false;
    }

    public void Au() {
        qj qj0 = this.ig;
        if(qj0 != null) {
            qj0.Au();
        }
    }

    // 去混淆评级： 中等(60)
    public static boolean DWo(Owx owx0) {
        return owx0 == null ? false : ub.cr().Owx() && owx0.IJ() && !gK.Zh(owx0) && !gK.cr(owx0) && !gK.JQp(owx0);
    }

    public void DWo() {
        if("landingpage_split_screen".equals(this.Jo) && com.bytedance.sdk.openadsdk.RD.PjT.PjT("default_split_style", false) && this.Nv.compareAndSet(false, true)) {
            Jo.PjT(new Runnable() {
                final gK PjT;

                @Override
                public void run() {
                    ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
                    gK.this.ix = valueAnimator0;
                    gK.this.ix.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        final com.bytedance.sdk.openadsdk.core.model.gK.10 PjT;

                        @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
                        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator0) {
                            float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
                            if(gK.this.Yo != null) {
                                LinearLayout.LayoutParams linearLayout$LayoutParams0 = (LinearLayout.LayoutParams)gK.this.Yo.getLayoutParams();
                                linearLayout$LayoutParams0.weight = f;
                                gK.this.Yo.setLayoutParams(linearLayout$LayoutParams0);
                            }
                        }
                    });
                    gK.this.ix.setDuration(500L);
                    gK.this.ix.start();
                    if(gK.this.yIW != null) {
                        gK.this.yIW.setVisibility(8);
                    }
                }
            });
        }
    }

    public static boolean JQp(Owx owx0) {
        return owx0 == null ? false : owx0.RD() == 33;
    }

    public void JQp() {
        FrameLayout frameLayout0 = this.Lrd;
        if(frameLayout0 != null) {
            frameLayout0.setVisibility(8);
            View view0 = this.Yo;
            if(view0 != null) {
                view0.setVisibility(0);
            }
        }
    }

    private void Owx() {
        if(this.tT != null && this.tT.getWebView() != null) {
            this.xH = this.tT.PjT;
            this.dwk = this.tT.Zh;
            this.MWx = this.tT.ReZ;
            if(this.tT.Zh()) {
                this.Co.qj();
                this.KM = System.currentTimeMillis();
            }
            if(this.tT.cr()) {
                this.xs();
            }
            if(this.tT.ReZ()) {
                int v = 1;
                this.xs();
                int v1 = wN.PjT(this.tT.getWebView());
                Zh gK$Zh0 = this.Xtz;
                if(gK$Zh0 != null) {
                    if(v1 != 1) {
                        v = 0;
                    }
                    gK$Zh0.PjT(v);
                }
            }
        }
    }

    // 去混淆评级： 低(40)
    public static boolean PjT(Owx owx0) {
        return owx0 != null && !gK.SM(owx0) && (gK.cr(owx0) || gK.Zh(owx0) || gK.JQp(owx0));
    }

    public void PjT() {
        long v = SystemClock.elapsedRealtime();
        com.bytedance.sdk.component.SM.cz cz0 = (com.bytedance.sdk.component.SM.cz)this.wN.findViewById(qla.RD);
        this.tT = cz0;
        if(cz0 == null || Owx.PjT(this.XX)) {
            qZS.PjT(this.tT, 8);
        }
        else if(!this.tT.f_()) {
            this.tT.JQp();
        }
        this.Lrd = (FrameLayout)this.wN.findViewById(qla.Owx);
        this.cRA = (xf)this.wN.findViewById(qla.cRA);
        this.yIW = this.wN.findViewById(qla.Sks);
        this.iZZ = (ImageView)this.wN.findViewById(qla.tT);
        this.Yo = this.wN.findViewById(qla.Co);
        this.Zh = (FrameLayout)this.wN.findViewById(qla.gK);
        this.PjT = (ImageView)this.wN.findViewById(qla.ltE);
        this.cz = (RelativeLayout)this.wN.findViewById(qla.Lrd);
        this.ReZ = (TextView)this.wN.findViewById(qla.Ee);
        this.cr = (FrameLayout)this.wN.findViewById(qla.DWo);
        View view0 = this.wN.findViewById(qla.yIW);
        this.xE = view0;
        if(view0 == null) {
            this.xE = this.wN.findViewById(qla.qZS);
        }
        this.ub = this.ZX.findViewById(qla.iZZ);
        this.gK = (TextView)this.wN.findViewById(qla.KM);
        this.ltE = (TextView)this.wN.findViewById(qla.Qf);
        this.Owx = (xE)this.wN.findViewById(qla.Yo);
        this.RD = (TextView)this.wN.findViewById(qla.ZX);
        if(this.ReZ != null && this.XX.xs() != null) {
            this.ReZ.setText("");
        }
        this.JQp = this.wN.findViewById(qla.Jo);
        this.HG = (cr)this.wN.findViewById(qla.Yr);
        if((gK.cr(this.XX) || gK.Zh(this.XX) || gK.JQp(this.XX) || gK.ReZ(this.XX)) && this.XX.xs() != null) {
            View view1 = this.JQp;
            if(view1 != null) {
                view1.setVisibility(8);
            }
            long v1 = gK.JQp(this.XX) ? this.XX.xs().ReZ() : this.XX.xs().PjT();
            fDm.ReZ().postDelayed(new Runnable() {
                final gK PjT;

                @Override
                public void run() {
                    if(!gK.this.Qf.get()) {
                        ReZ.PjT(gK.this.XX, gK.this.Jo, System.currentTimeMillis() - gK.this.KM, false);
                        gK.this.qla();
                    }
                }
            }, v1 * 1000L);
        }
        this.qj();
        if(gK.Zh(this.XX)) {
            this.gK();
            if(!this.cr()) {
                LinearLayout.LayoutParams linearLayout$LayoutParams0 = (LinearLayout.LayoutParams)this.Lrd.getLayoutParams();
                linearLayout$LayoutParams0.weight = 2.33f;
                this.Lrd.setLayoutParams(linearLayout$LayoutParams0);
            }
        }
        if(gK.cr(this.XX) || gK.JQp(this.XX)) {
            View view2 = this.Yo;
            if(view2 != null) {
                view2.setVisibility(8);
            }
        }
        xf xf0 = this.cRA;
        if(xf0 != null) {
            xf0.PjT(this.XX);
        }
        if(gK.ReZ(this.XX)) {
            this.ub();
        }
        com.bytedance.sdk.openadsdk.cr.ReZ.PjT.PjT(SystemClock.elapsedRealtime() - v, this.XX, this.Jo, this.tY, this.VY);
    }

    public void PjT(float f) {
        try {
            this.Co.SM();
        }
        catch(Throwable unused_ex) {
        }
    }

    public void PjT(int v) {
        ltE ltE0 = this.zZ;
        if(ltE0 != null) {
            ltE0.JQp(v);
        }
    }

    public void PjT(int v, com.bytedance.sdk.component.adexpress.Zh.fDm fDm0) {
        float f1;
        if(v != 3 && !this.Zh(v)) {
            return;
        }
        if(this.Xe != null && fDm0 != null) {
            AtomicBoolean atomicBoolean0 = this.xu;
            if(atomicBoolean0 != null) {
                if(v == 1) {
                    return;
                }
                if(v == 5 && atomicBoolean0.get()) {
                    return;
                }
            }
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.Yo.getLayoutParams();
            this.zYH = (LinearLayout.LayoutParams)this.Lrd.getLayoutParams();
            float f = ((LinearLayout.LayoutParams)viewGroup$LayoutParams0).weight;
            com.bytedance.sdk.openadsdk.core.model.ub ub0 = this.XX.fDm();
            if(!this.Zh(v)) {
                f1 = ub0 == null ? 70.0f : ((float)ub0.cz());
            }
            else if(ub0 != null) {
                f1 = (float)ub0.JQp();
            }
            else {
                f1 = 30.0f;
            }
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)this.Xe.getLayoutParams();
            if(frameLayout$LayoutParams0 == null) {
                frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
            }
            int v1 = frameLayout$LayoutParams0.height;
            int v2 = frameLayout$LayoutParams0.width;
            int v3 = frameLayout$LayoutParams0.leftMargin;
            int v4 = frameLayout$LayoutParams0.topMargin;
            int v5 = qZS.Zh(this.ZX, ((float)fDm0.Au()));
            int v6 = qZS.Zh(this.ZX, ((float)fDm0.SM()));
            int v7 = qZS.Zh(this.ZX, ((float)fDm0.cz()));
            int v8 = qZS.Zh(this.ZX, ((float)fDm0.XX()));
            ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.DWo = valueAnimator0;
            valueAnimator0.setDuration(500L);
            this.DWo.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                final gK fDm;

                @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
                public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator0) {
                    float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
                    ((LinearLayout.LayoutParams)viewGroup$LayoutParams0).weight = f + (f1 - f) * f;
                    gK.this.zYH.weight = 100.0f - ((LinearLayout.LayoutParams)viewGroup$LayoutParams0).weight;
                    if(gK.this.Yo != null) {
                        gK.this.Yo.setLayoutParams(((LinearLayout.LayoutParams)viewGroup$LayoutParams0));
                    }
                    if(gK.this.Lrd != null) {
                        gK.this.Lrd.setLayoutParams(gK.this.zYH);
                    }
                    if(gK.this.zYH.weight < 30.0f) {
                        gK.this.ReZ(8);
                    }
                    else {
                        gK.this.ReZ(0);
                    }
                    frameLayout$LayoutParams0.width = v2 + ((int)(((float)(v5 - v2)) * f));
                    frameLayout$LayoutParams0.height = v1 + ((int)(((float)(v6 - v1)) * f));
                    frameLayout$LayoutParams0.leftMargin = v3 + ((int)(((float)(v7 - v3)) * f));
                    frameLayout$LayoutParams0.topMargin = v4 + ((int)(((float)(v8 - v4)) * f));
                    if(gK.this.Xe != null) {
                        gK.this.Xe.setLayoutParams(frameLayout$LayoutParams0);
                    }
                    gK.this.PjT(0.0f);
                    if(f == 1.0f) {
                        if(gK.this.HG != null) {
                            qZS.PjT(gK.this.HG, 0);
                            if(gK.this.Zh(v)) {
                                Drawable drawable0 = Lrd.ReZ(gK.this.ZX, "tt_ad_zoom_down");
                                gK.this.HG.setImageDrawable(drawable0);
                                gK.this.HG.setTag(1);
                            }
                            else {
                                Drawable drawable1 = Lrd.ReZ(gK.this.ZX, "tt_ad_zoom_up");
                                gK.this.HG.setImageDrawable(drawable1);
                                gK.this.HG.setTag(2);
                            }
                        }
                        if(gK.this.xu == null) {
                            AtomicBoolean atomicBoolean0 = new AtomicBoolean();
                            gK.this.xu = atomicBoolean0;
                        }
                        gK.this.xu.set(gK.this.Zh(v));
                    }
                }
            });
            ReZ.cr(this.XX, this.Jo, v);
            this.DWo.start();
            if(this.wKV.compareAndSet(false, true)) {
                this.yks = SystemClock.elapsedRealtime();
            }
            qj qj0 = this.ig;
            if(qj0 != null) {
                qj0.PjT(true, SystemClock.elapsedRealtime());
            }
            qZS.PjT(this.HG, 8);
        }
    }

    public void PjT(@NonNull ltE ltE0, FrameLayout frameLayout0) {
        this.zZ = ltE0;
        this.Xe = frameLayout0;
    }

    public void PjT(a b$a0) {
        this.xf = b$a0;
    }

    private void ReZ(int v) {
        qZS.PjT(this.CY, v);
        qZS.PjT(this.fA, v);
        if(this.kph.get()) {
            qZS.PjT(this.gK, v);
            qZS.PjT(this.ltE, v);
            qZS.PjT(this.Owx, v);
            qZS.PjT(this.RD, 0);
        }
    }

    public static boolean ReZ(Owx owx0) {
        return owx0 == null ? false : owx0.cI() == 3 && owx0.Sks() == 38 && owx0.jK() == 1;
    }

    public void ReZ() {
        if(!this.ltE()) {
            return;
        }
        try {
            String s = this.XX.MWx().c();
            com.bytedance.sdk.component.JQp.DWo dWo0 = com.bytedance.sdk.openadsdk.SM.cr.PjT().PjT(s).PjT(this.XX.MWx().o()).Zh(this.XX.MWx().w()).JQp(qZS.JQp(ub.PjT())).cr(qZS.ReZ(ub.PjT())).ReZ(2).PjT(new PjT());
            com.bytedance.sdk.openadsdk.core.model.gK.4 gK$40 = new com.bytedance.sdk.component.JQp.xE() {
                final gK PjT;

                @Override  // com.bytedance.sdk.component.JQp.xE
                public void PjT(int v, String s, @Nullable Throwable throwable0) {
                }

                @Override  // com.bytedance.sdk.component.JQp.xE
                public void PjT(com.bytedance.sdk.component.JQp.qj qj0) {
                    try {
                        Bitmap bitmap0 = (Bitmap)qj0.Zh();
                        if(bitmap0 != null && qj0.ReZ() != null) {
                            BitmapDrawable bitmapDrawable0 = new BitmapDrawable(ub.PjT().getResources(), bitmap0);
                            View view0 = gK.this.Co.DWo();
                            if(view0 != null && view0.getParent() instanceof View) {
                                ((View)view0.getParent()).setBackground(bitmapDrawable0);
                            }
                        }
                    }
                    catch(Throwable throwable0) {
                        RD.Zh("LandingPageModel", throwable0.getMessage());
                    }
                }
            };
            dWo0.PjT(new com.bytedance.sdk.openadsdk.SM.Zh(this.XX, s, gK$40));
        }
        catch(Exception unused_ex) {
        }
    }

    public static boolean SM(Owx owx0) {
        return owx0 != null && owx0.RD() == 19;
    }

    // 去混淆评级： 低(20)
    public boolean SM() {
        return gK.ReZ(this.XX) && (this.xu != null && !this.xu.get());
    }

    public static boolean XX(Owx owx0) {
        return owx0 != null && owx0.OnL() != 1 && gK.Au(owx0);
    }

    public void XX() {
        KM kM0 = this.Sks;
        if(kM0 != null) {
            kM0.qj();
        }
        qj qj0 = this.ig;
        if(qj0 != null) {
            qj0.XX();
        }
    }

    private boolean Zh(int v) {
        return v == 1 || v == 2 || v == 4 || v == 5;
    }

    public static boolean Zh(Owx owx0) {
        if(owx0 == null) {
            return false;
        }
        if(owx0.cI() == 3 && owx0.RD() == 6 && !cRA.Zh(owx0) && owx0.jK() == 1) {
            switch(owx0.Qtm()) {
                case 0: 
                case 0x42C80000: {
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
        return false;
    }

    protected void Zh() {
        if(this.XX != null && !TextUtils.isEmpty(this.XX.Nv())) {
            this.RD.setText(this.XX.Nv());
        }
    }

    public static boolean cr(Owx owx0) {
        if(owx0 == null) {
            return false;
        }
        if(gK.SM(owx0)) {
            return true;
        }
        if(owx0.cI() == 3 && owx0.RD() == 5 && !cRA.Zh(owx0)) {
            switch(owx0.Qtm()) {
                case 0: 
                case 0x42C80000: {
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
        return false;
    }

    public boolean cr() {
        switch(this.XX.fK()) {
            case 15: 
            case 16: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    // 去混淆评级： 低(20)
    public static boolean cz(Owx owx0) {
        return gK.cr(owx0) && !gK.SM(owx0);
    }

    public void cz() {
        qj qj0 = this.ig;
        if(qj0 != null) {
            com.bytedance.sdk.component.SM.cz cz0 = this.tT;
            if(cz0 != null) {
                qj0.PjT(cz0);
            }
        }
        Handler handler0 = this.qla;
        if(handler0 != null) {
            handler0.removeCallbacksAndMessages(null);
        }
        ValueAnimator valueAnimator0 = this.ix;
        if(valueAnimator0 != null) {
            valueAnimator0.removeAllUpdateListeners();
            this.ix.cancel();
        }
        ValueAnimator valueAnimator1 = this.DWo;
        if(valueAnimator1 != null) {
            valueAnimator1.removeAllUpdateListeners();
            this.DWo.cancel();
        }
        ObjectAnimator objectAnimator0 = this.qj;
        if(objectAnimator0 != null) {
            objectAnimator0.removeAllUpdateListeners();
            this.qj.cancel();
        }
        xf xf0 = this.cRA;
        if(xf0 != null) {
            xf0.Zh();
        }
        ObjectAnimator objectAnimator1 = this.SM;
        if(objectAnimator1 != null) {
            objectAnimator1.cancel();
        }
        com.bytedance.sdk.component.SM.cz cz1 = this.tT;
        if(cz1 != null) {
            com.bytedance.sdk.openadsdk.core.Jo.PjT(cz1.getWebView());
        }
        this.tT = null;
        KM kM0 = this.Sks;
        if(kM0 != null) {
            kM0.xf();
        }
        qj qj1 = this.ig;
        if(qj1 != null) {
            qj1.cr(true);
        }
        if(!TextUtils.isEmpty(this.VY) && this.rds) {
            com.bytedance.sdk.openadsdk.cr.ReZ.PjT.PjT(this.dwk, this.xH, this.XX);
        }
        com.bytedance.sdk.openadsdk.XX.Zh.PjT().PjT(this.tY);
    }

    static int fDm(gK gK0) {
        int v = gK0.dwk;
        gK0.dwk = v + 1;
        return v;
    }

    private void fDm() {
        this.cz.setVisibility(8);
        if(!gK.cr(this.XX) && !gK.JQp(this.XX) && this.cr() && !gK.ReZ(this.XX)) {
            ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this, "timeVisible", new float[]{0.0f, 1.0f});
            this.qj = objectAnimator0;
            objectAnimator0.setDuration(100L);
            this.qj.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                final gK PjT;

                @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator0) {
                    LinearLayout.LayoutParams linearLayout$LayoutParams0 = (LinearLayout.LayoutParams)gK.this.Lrd.getLayoutParams();
                    linearLayout$LayoutParams0.weight = (float)(((double)(((float)(((Float)valueAnimator0.getAnimatedValue()))))) * 0.25);
                    float f = (float)(1.0 - ((double)(((float)(((Float)valueAnimator0.getAnimatedValue()))))) * 0.2);
                    gK.this.PjT(f);
                    gK.this.Lrd.setLayoutParams(linearLayout$LayoutParams0);
                }
            });
            this.qj.start();
        }
    }

    private void gK() {
        if(this.cr()) {
            this.yIW.setVisibility(0);
            ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this.iZZ, "translationY", new float[]{16.0f, 0.0f}).setDuration(500L);
            this.SM = objectAnimator0;
            objectAnimator0.setRepeatMode(2);
            this.SM.setRepeatCount(-1);
            this.SM.start();
            this.yIW.setClickable(true);
            this.yIW.setOnTouchListener(new View.OnTouchListener() {
                final gK PjT;

                @Override  // android.view.View$OnTouchListener
                public boolean onTouch(View view0, MotionEvent motionEvent0) {
                    if(!gK.this.IJ) {
                        gK.this.fDm.onTouch(view0, motionEvent0);
                    }
                    switch(motionEvent0.getAction()) {
                        case 1: 
                        case 3: {
                            gK.this.DWo = ObjectAnimator.ofFloat(this, "timeSlide", new float[]{0.0f, 1.0f});
                            gK.this.DWo.setDuration(200L);
                            gK.this.DWo.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                final com.bytedance.sdk.openadsdk.core.model.gK.5 PjT;

                                @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
                                public void onAnimationUpdate(ValueAnimator valueAnimator0) {
                                    LinearLayout.LayoutParams linearLayout$LayoutParams0 = (LinearLayout.LayoutParams)gK.this.Lrd.getLayoutParams();
                                    linearLayout$LayoutParams0.weight = (float)(((double)(((float)(((Float)valueAnimator0.getAnimatedValue()))) * 2.07f)) + 0.25);
                                    float f = (float)(0.8 - ((double)(((float)(((Float)valueAnimator0.getAnimatedValue()))))) * 0.5);
                                    gK.this.PjT(f);
                                    gK.this.Lrd.setLayoutParams(linearLayout$LayoutParams0);
                                }
                            });
                            if(gK.this.fDm.XX()) {
                                gK.this.yIW.performClick();
                                gK.this.IJ = true;
                            }
                            gK.this.DWo.start();
                            gK.this.yIW.setVisibility(8);
                            return true;
                        }
                        default: {
                            return false;
                        }
                    }
                }
            });
            this.yIW.setOnClickListener(this.fDm);
        }
        if(!this.ltE()) {
            this.Au.setVisibility(8);
            this.Zh.setVisibility(0);
            this.PjT.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.PjT.setOnClickListener(new View.OnClickListener() {
                final gK PjT;

                @Override  // android.view.View$OnClickListener
                public void onClick(View view0) {
                    String s = gK.this.Jo;
                    ReZ.Zh(gK.this.XX, s);
                }
            });
            if(this.XX != null && this.XX.CY() != null && this.XX.CY().size() > 0 && this.XX.CY().get(0) != null && !TextUtils.isEmpty(((com.bytedance.sdk.openadsdk.core.model.xE)this.XX.CY().get(0)).PjT())) {
                com.bytedance.sdk.openadsdk.gK.Zh zh0 = com.bytedance.sdk.openadsdk.gK.Zh.PjT();
                com.bytedance.sdk.openadsdk.core.model.xE xE0 = (com.bytedance.sdk.openadsdk.core.model.xE)this.XX.CY().get(0);
                ImageView imageView0 = this.PjT;
                com.bytedance.sdk.openadsdk.core.model.gK.7 gK$70 = new com.bytedance.sdk.component.JQp.xE() {
                    final gK PjT;

                    @Override  // com.bytedance.sdk.component.JQp.xE
                    public void PjT(int v, String s, @Nullable Throwable throwable0) {
                        if(gK.this.qla != null) {
                            gK.this.qla.removeMessages(101);
                        }
                        gK.this.DWo();
                    }

                    @Override  // com.bytedance.sdk.component.JQp.xE
                    public void PjT(com.bytedance.sdk.component.JQp.qj qj0) {
                        if(gK.this.qla != null) {
                            gK.this.qla.removeMessages(101);
                        }
                    }
                };
                zh0.PjT(xE0, imageView0, this.XX, gK$70);
            }
        }
        try {
            String s = ((com.bytedance.sdk.openadsdk.core.model.xE)this.XX.CY().get(0)).PjT();
            com.bytedance.sdk.component.JQp.DWo dWo0 = com.bytedance.sdk.openadsdk.SM.cr.PjT().PjT(s).PjT(((com.bytedance.sdk.openadsdk.core.model.xE)this.XX.CY().get(0)).Zh()).Zh(((com.bytedance.sdk.openadsdk.core.model.xE)this.XX.CY().get(0)).ReZ()).JQp(qZS.JQp(ub.PjT())).cr(qZS.ReZ(ub.PjT())).ReZ(2).PjT(new PjT());
            com.bytedance.sdk.openadsdk.core.model.gK.8 gK$80 = new com.bytedance.sdk.component.JQp.xE() {
                final gK PjT;

                @Override  // com.bytedance.sdk.component.JQp.xE
                public void PjT(int v, String s, @Nullable Throwable throwable0) {
                }

                @Override  // com.bytedance.sdk.component.JQp.xE
                public void PjT(com.bytedance.sdk.component.JQp.qj qj0) {
                    try {
                        Bitmap bitmap0 = (Bitmap)qj0.Zh();
                        if(bitmap0 != null && qj0.ReZ() != null) {
                            BitmapDrawable bitmapDrawable0 = new BitmapDrawable(ub.PjT().getResources(), bitmap0);
                            if(!gK.this.ltE()) {
                                gK.this.Zh.setBackground(bitmapDrawable0);
                                return;
                            }
                            gK.this.cr.setBackground(bitmapDrawable0);
                            View view0 = gK.this.Co.DWo();
                            if(view0 != null && view0.getParent() instanceof View) {
                                ((View)view0.getParent()).setBackground(bitmapDrawable0);
                            }
                        }
                    }
                    catch(Exception unused_ex) {
                    }
                }
            };
            dWo0.PjT(new com.bytedance.sdk.openadsdk.SM.Zh(this.XX, s, gK$80));
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // android.os.Handler$Callback
    public boolean handleMessage(@NonNull Message message0) {
        long v2;
        int v = message0.what;
        if(v == 100) {
            int v1 = message0.arg1;
            if(!gK.cr(this.XX) || (this.XX == null || this.XX.xs() == null)) {
                v2 = !gK.JQp(this.XX) || (this.XX == null || this.XX.xs() == null) ? 20L : this.XX.xs().cr();
            }
            else {
                v2 = this.XX.xs().Zh();
            }
            a b$a0 = this.xf;
            if(b$a0 != null) {
                b$a0.PjT(((long)v1) * 1000L, v2 * 1000L);
            }
            int v3 = Long.compare(v1, v2);
            if(v3 >= 0) {
                a b$a1 = this.xf;
                if(b$a1 != null) {
                    b$a1.PjT(v2 * 1000L, 100);
                    return true;
                }
            }
            else if(v3 < 0 && this.qla != null) {
                Message message1 = Message.obtain();
                message1.what = 100;
                message1.arg1 = v1 + 1;
                this.qla.sendMessageDelayed(message1, 1000L);
                return true;
            }
        }
        else if(v == 101) {
            this.DWo();
        }
        return true;
    }

    private boolean ltE() {
        return Owx.JQp(this.XX);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void qj() {
        if(this.tT != null && this.tT.getWebView() != null) {
            com.bytedance.sdk.openadsdk.core.widget.PjT.ReZ.PjT(ub.PjT()).PjT(false).Zh(false).PjT(this.tT.getWebView());
            if(this.tT != null && this.tT.getWebView() != null) {
                this.Xtz = new Zh(this.Ld, this.XX, this.Jo, this);
                if(!this.tT.f_() || !(this.tT.getWebViewClient() instanceof JQp)) {
                    this.ig = new qj(this.XX, this.tT.getWebView(), this.Xtz, this.cI).Zh(true);
                }
                else {
                    qj qj0 = ((JQp)this.tT.getWebViewClient()).Zh();
                    this.ig = qj0;
                    if(qj0 != null) {
                        qj0.PjT(this.Xtz);
                        this.ig.Zh(true);
                    }
                }
                this.ig.PjT(this.Jo);
                com.bytedance.sdk.openadsdk.common.cr cr0 = wN.PjT(this.XX, this.tT, this.ZX, this.Jo);
                this.oG = cr0;
                if(cr0 != null) {
                    cr0.PjT(this.Jo);
                }
                wN.PjT(this.XX, this.tT);
            }
            this.xf();
            if(this.tT.f_()) {
                this.Owx();
            }
            this.tT.setLandingPage(true);
            this.tT.setTag(this.Jo);
            this.tT.setMaterialMeta(this.XX.RXa());
            com.bytedance.sdk.openadsdk.core.model.gK.12 gK$120 = new JQp(ub.PjT(), this.Sks, this.XX.dIF(), this.oG, this.ig, true) {
                final gK PjT;

                @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
                public void onPageFinished(WebView webView0, String s) {
                    super.onPageFinished(webView0, s);
                    gK.this.xs();
                }

                @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
                public void onPageStarted(WebView webView0, String s, Bitmap bitmap0) {
                    super.onPageStarted(webView0, s, bitmap0);
                    gK.this.Co.qj();
                    gK.this.KM = System.currentTimeMillis();
                    if(gK.Zh(gK.this.XX) && gK.this.qla != null && !Owx.JQp(gK.this.XX)) {
                        gK.this.qla.sendEmptyMessageDelayed(101, 2000L);
                    }
                }

                @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
                public void onReceivedError(WebView webView0, int v, String s, String s1) {
                    super.onReceivedError(webView0, v, s, s1);
                    String s2 = JQp.cr(s1);
                    boolean z = false;
                    if(this.cz != null) {
                        boolean z1 = webView0 != null && s1 != null && s1.equals(webView0.getUrl());
                        this.cz.PjT(webView0, v, s, s1, JQp.cr(s1), z1);
                    }
                    boolean z2 = s2 != null && s2.startsWith("image");
                    if(s2 != null && s2.startsWith("mp4")) {
                        z = true;
                    }
                    if(!z2 && !z && !gK.this.Qf.get()) {
                        gK.this.qla();
                    }
                }

                @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
                public void onReceivedSslError(WebView webView0, SslErrorHandler sslErrorHandler0, SslError sslError0) {
                    if(sslErrorHandler0 != null) {
                        gK.this.qla();
                    }
                    super.onReceivedSslError(webView0, sslErrorHandler0, sslError0);
                }

                @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
                public WebResourceResponse shouldInterceptRequest(WebView webView0, String s) {
                    try {
                        if(TextUtils.isEmpty(gK.this.VY)) {
                            return super.shouldInterceptRequest(webView0, s);
                        }
                        gK.xf(gK.this);
                        WebResourceResponseModel webResourceResponseModel0 = com.bytedance.sdk.openadsdk.XX.Zh.PjT().PjT(gK.this.tY, gK.this.VY, s);
                        if(webResourceResponseModel0 != null && webResourceResponseModel0.getWebResourceResponse() != null) {
                            gK.fDm(gK.this);
                            return webResourceResponseModel0.getWebResourceResponse();
                        }
                        if(webResourceResponseModel0 != null && webResourceResponseModel0.getMsg() == 2) {
                            gK.qla(gK.this);
                        }
                        return super.shouldInterceptRequest(webView0, s);
                    }
                    catch(Throwable throwable0) {
                    }
                    RD.PjT("LandingPageModel", "shouldInterceptRequest url error", throwable0);
                    return super.shouldInterceptRequest(webView0, s);
                }

                @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
                public boolean shouldOverrideUrlLoading(WebView webView0, String s) {
                    if(gK.ReZ(gK.this.XX) && wN.PjT(webView0) == 1) {
                        Intent intent0 = new Intent(gK.this.ZX, TTCeilingLandingPageActivity.class);
                        intent0.putExtra("second_url", s);
                        com.bytedance.sdk.openadsdk.core.Lrd.PjT().cz();
                        com.bytedance.sdk.openadsdk.core.Lrd.PjT().PjT(gK.this.XX);
                        com.bytedance.sdk.component.utils.Zh.PjT(this.cr, intent0, null);
                        return true;
                    }
                    return super.shouldOverrideUrlLoading(webView0, s);
                }
            };
            this.OMu = gK$120;
            this.tT.setWebViewClient(gK$120);
            this.OMu.PjT(this.XX);
            this.OMu.PjT(this.Jo);
            this.tT.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.PjT.cr(this.Sks, this.ig, this.oG) {
                final gK PjT;

                @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.cr
                public void onProgressChanged(WebView webView0, int v) {
                    super.onProgressChanged(webView0, v);
                    if(gK.this.ZX != null && !gK.this.ZX.isFinishing() && v == 100) {
                        gK.this.xs();
                    }
                    if(gK.this.cRA != null) {
                        gK.this.cRA.PjT(v);
                    }
                }
            });
            if(this.Zd == null) {
                this.Zd = XX.PjT(ub.PjT(), this.XX, this.Jo);
            }
            this.tT.setDownloadListener(new DownloadListener() {
                final gK PjT;

                @Override  // android.webkit.DownloadListener
                public void onDownloadStart(String s, String s1, String s2, String s3, long v) {
                    if(gK.this.Zd != null) {
                        gK.this.Zd.cr();
                    }
                }
            });
            this.tT.setUserAgentString(com.bytedance.sdk.openadsdk.utils.gK.PjT(this.tT.getWebView(), 7104));
            int v = Build.VERSION.SDK_INT;
            this.tT.setMixedContentMode(0);
            if(v >= 23) {
                this.tT.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() {
                    final gK PjT;

                    @Override  // android.view.View$OnScrollChangeListener
                    public void onScrollChange(View view0, int v, int v1, int v2, int v3) {
                        if(gK.this.ig != null) {
                            gK.this.ig.Zh(v1);
                        }
                    }
                });
            }
            this.tT.getWebView().setOnTouchListener(new View.OnTouchListener() {
                final gK PjT;

                @Override  // android.view.View$OnTouchListener
                public boolean onTouch(View view0, MotionEvent motionEvent0) {
                    if(gK.this.SM()) {
                        int v = motionEvent0.getAction();
                        switch(v) {
                            case 0: {
                                float f = motionEvent0.getY();
                                gK.this.kFP = f;
                                break;
                            }
                            case 1: {
                                float f1 = motionEvent0.getY();
                                if(qZS.PjT(gK.this.kFP, f1, gK.this.ZX)) {
                                    gK.this.PjT(5);
                                }
                                break;
                            }
                            default: {
                                if(v == 2) {
                                    motionEvent0.setAction(3);
                                }
                            }
                        }
                    }
                    if((!gK.this.IJ || gK.Au(gK.this.XX)) && !gK.JQp(gK.this.XX)) {
                        gK.this.fDm.onTouch(view0, motionEvent0);
                    }
                    if((!gK.this.IJ || gK.Au(gK.this.XX)) && !gK.JQp(gK.this.XX) && motionEvent0.getAction() == 1 && gK.this.fDm.XX()) {
                        gK.this.tT.getWebView().performClick();
                        gK.this.IJ = true;
                    }
                    if(gK.this.ig != null) {
                        gK.this.ig.PjT(motionEvent0);
                    }
                    if(gK.this.oG != null) {
                        gK.this.oG.PjT(motionEvent0);
                    }
                    return false;
                }
            });
            this.tT.getWebView().setOnClickListener(this.fDm);
            ReZ.PjT(this.XX, this.Jo, this.cI);
            if(!this.tT.f_()) {
                com.bytedance.sdk.openadsdk.utils.Owx.PjT(this.tT, this.XX.xu());
            }
            this.rds = true;
        }
        if(this.tT != null && this.cRA != null && !this.tT.ReZ()) {
            this.cRA.PjT();
        }
    }

    static int qla(gK gK0) {
        int v = gK0.MWx;
        gK0.MWx = v + 1;
        return v;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void qla() {
        if(this.Qf.get()) {
            return;
        }
        this.xE();
        this.kph.set(true);
        this.Co.Au();
        xf xf0 = this.cRA;
        if(xf0 != null) {
            xf0.Zh();
        }
        if(gK.JQp(this.XX)) {
            ReZ.PjT(System.currentTimeMillis(), this.XX, this.Jo, "show_agg_backup");
            View view0 = this.ub;
            if(view0 != null) {
                view0.setVisibility(0);
                RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = (RelativeLayout.LayoutParams)this.ub.getLayoutParams();
                relativeLayout$LayoutParams0.addRule(13);
                relativeLayout$LayoutParams0.addRule(10, 0);
                this.ub.setLayoutParams(relativeLayout$LayoutParams0);
                RelativeLayout relativeLayout0 = this.cz;
                if(relativeLayout0 != null) {
                    relativeLayout0.setOnClickListener(new View.OnClickListener() {
                        final gK PjT;

                        @Override  // android.view.View$OnClickListener
                        public void onClick(View view0) {
                        }
                    });
                }
            }
        }
        else {
            this.xE.setVisibility(0);
            RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = (RelativeLayout.LayoutParams)this.xE.getLayoutParams();
            relativeLayout$LayoutParams1.addRule(13);
            relativeLayout$LayoutParams1.addRule(10, 0);
            this.xE.setLayoutParams(relativeLayout$LayoutParams1);
            if(this.XX.Xe() != null && !TextUtils.isEmpty(this.XX.Xe().PjT())) {
                com.bytedance.sdk.openadsdk.gK.Zh.PjT().PjT(this.XX.Xe().PjT(), this.XX.Xe().Zh(), this.XX.Xe().ReZ(), this.Owx, this.XX);
            }
            this.gK.setText(this.XX.Ld());
            this.ltE.setText(this.XX.ix());
            if(this.RD != null) {
                this.Zh();
                this.RD.setClickable(true);
                this.RD.setOnClickListener(this.xs);
                this.RD.setOnTouchListener(this.xs);
            }
            if(gK.ReZ(this.XX)) {
                LinearLayout.LayoutParams linearLayout$LayoutParams0 = this.zYH;
                if(linearLayout$LayoutParams0 != null) {
                    if(linearLayout$LayoutParams0.weight < 30.0f) {
                        this.ReZ(8);
                        return;
                    }
                    this.ReZ(0);
                }
            }
        }
    }

    private void ub() {
        xf xf0 = this.cRA;
        if(xf0 != null) {
            com.bytedance.sdk.openadsdk.common.qj qj0 = xf0.getLoadingStyle();
            if(qj0 != null) {
                this.CY = qj0.Zh();
                this.fA = qj0.ReZ();
            }
        }
        cr cr0 = this.HG;
        if(cr0 != null) {
            cr0.setOnClickListener(new View.OnClickListener() {
                final gK PjT;

                @Override  // android.view.View$OnClickListener
                public void onClick(View view0) {
                    if(gK.this.HG.getTag() != null) {
                        if(gK.this.HG.getTag().equals(1)) {
                            gK.this.PjT(3);
                            return;
                        }
                        if(gK.this.HG.getTag().equals(2)) {
                            gK.this.PjT(4);
                        }
                    }
                }
            });
        }
    }

    private void xE() {
        if((gK.cr(this.XX) || gK.JQp(this.XX)) && this.ZX instanceof com.bytedance.sdk.openadsdk.core.xf.cr.Zh) {
            this.Co.qj();
            this.Co.xf();
        }
    }

    static int xf(gK gK0) {
        int v = gK0.xH;
        gK0.xH = v + 1;
        return v;
    }

    private void xf() {
        KM kM0 = new KM(this.ZX);
        this.Sks = kM0;
        kM0.Zh(this.tT).ReZ(this.XX.dIF()).cr(this.XX.xR()).PjT(this.XX).Zh((gK.JQp(this.XX) ? this.qZS : -1)).PjT(this.XX.OMu()).Zh(this.Jo).JQp(this.XX.SW()).PjT(this.tT).PjT(new com.bytedance.sdk.openadsdk.core.widget.JQp() {
            final gK PjT;

            @Override  // com.bytedance.sdk.openadsdk.core.widget.JQp
            public void PjT() {
                if(gK.JQp(gK.this.XX) && gK.this.ZX instanceof com.bytedance.sdk.openadsdk.core.xf.cr.Zh) {
                    ((com.bytedance.sdk.openadsdk.core.xf.cr.Zh)gK.this.ZX).c_();
                    return;
                }
                if(gK.this.OMu != null) {
                    gK.this.OMu.ReZ();
                }
            }
        });
    }

    private void xs() {
        if(!this.Qf.get() && !this.kph.get()) {
            this.Qf.set(true);
            long v = this.yks == -1L ? 0L : SystemClock.elapsedRealtime() - this.yks;
            if(gK.ReZ(this.XX)) {
                ReZ.ReZ(this.XX, this.Jo, v);
            }
            ReZ.PjT(this.XX, this.Jo, System.currentTimeMillis() - this.KM, true);
            this.fDm();
        }
    }
}

