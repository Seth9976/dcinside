package com.bytedance.sdk.openadsdk.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils.TruncateAt;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View.OnScrollChangeListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.SM.cz;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.DWo.cr;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.qla;
import com.bytedance.sdk.openadsdk.common.xE;
import com.bytedance.sdk.openadsdk.common.xf;
import com.bytedance.sdk.openadsdk.core.JQp.Au;
import com.bytedance.sdk.openadsdk.core.JQp.ReZ;
import com.bytedance.sdk.openadsdk.core.JQp.XX;
import com.bytedance.sdk.openadsdk.core.KM;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.PjT.JQp;
import com.bytedance.sdk.openadsdk.core.widget.PjT;
import com.bytedance.sdk.openadsdk.core.widget.fDm;
import com.bytedance.sdk.openadsdk.core.widget.xs;
import com.bytedance.sdk.openadsdk.cr.qj;
import com.bytedance.sdk.openadsdk.gK.Zh;
import com.bytedance.sdk.openadsdk.utils.DWo;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.wN;
import java.util.concurrent.atomic.AtomicBoolean;
import x.b.a;

public class TTVideoLandingPageLink2Activity extends TTVideoLandingPageActivity implements cr {
    private boolean CY;
    private View HG;
    final AtomicBoolean Ld;
    final AtomicBoolean MWx;
    private TextView Xe;
    private PAGLogoView Xtz;
    private xf cI;
    TTAdDislikeToast dwk;
    private boolean fA;
    private JQp ix;
    private TextView kFP;
    private View oG;
    private LinearLayout wKV;
    qla xH;
    private long xu;
    private com.bytedance.sdk.openadsdk.common.cr yks;
    private xE zYH;
    private boolean zZ;

    public TTVideoLandingPageLink2Activity() {
        this.CY = false;
        this.MWx = new AtomicBoolean(false);
        this.Ld = new AtomicBoolean(false);
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    protected boolean JQp() {
        return this.xs == 5 || this.xs == 15 || this.xs == 50;
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    protected View PjT() {
        View view0 = new com.bytedance.sdk.openadsdk.core.JQp.JQp(this);
        if(Build.VERSION.SDK_INT >= 35) {
            view0.setFitsSystemWindows(true);
        }
        ((LinearLayout)view0).setOrientation(1);
        view0.setBackgroundColor(-1);
        ReZ reZ0 = new ReZ(this);
        ((ViewGroup)view0).addView(reZ0, new LinearLayout.LayoutParams(-1, qZS.Zh(this, 220.0f)));
        ReZ reZ1 = new ReZ(this);
        reZ1.setId(com.bytedance.sdk.openadsdk.utils.qla.Zd);
        reZ0.addView(reZ1, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.JQp.JQp jQp0 = new com.bytedance.sdk.openadsdk.core.JQp.JQp(this);
        jQp0.setOrientation(0);
        jQp0.setPadding(0, qZS.Zh(this, 20.0f), 0, 0);
        reZ0.addView(jQp0, new FrameLayout.LayoutParams(-1, -2));
        View view1 = new View(this);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(0, 0);
        linearLayout$LayoutParams0.weight = 1.0f;
        jQp0.addView(view1, linearLayout$LayoutParams0);
        fDm fDm0 = new fDm(this);
        fDm0.setId(0x1F000011);
        fDm0.setGravity(17);
        fDm0.setText(Lrd.PjT(this, "tt_reward_feedback"));
        fDm0.setTextColor(-1);
        fDm0.setTextSize(2, 14.0f);
        LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-2, qZS.Zh(this, 28.0f));
        int v = qZS.Zh(this, 16.0f);
        linearLayout$LayoutParams1.rightMargin = v;
        linearLayout$LayoutParams1.leftMargin = v;
        jQp0.addView(fDm0, linearLayout$LayoutParams1);
        xs xs0 = new xs(this);
        xs0.setId(com.bytedance.sdk.openadsdk.utils.qla.ig);
        xs0.setPadding(qZS.Zh(this, 7.0f), qZS.Zh(this, 7.0f), qZS.Zh(this, 7.0f), qZS.Zh(this, 7.0f));
        xs0.setImageResource(Lrd.cr(this, "tt_video_close_drawable"));
        LinearLayout.LayoutParams linearLayout$LayoutParams2 = new LinearLayout.LayoutParams(qZS.Zh(this, 28.0f), qZS.Zh(this, 28.0f));
        linearLayout$LayoutParams2.rightMargin = qZS.Zh(this, 12.0f);
        jQp0.addView(xs0, linearLayout$LayoutParams2);
        XX xX0 = new XX(this);
        xX0.setVisibility(8);
        xX0.setId(com.bytedance.sdk.openadsdk.utils.qla.rds);
        LinearLayout.LayoutParams linearLayout$LayoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout$LayoutParams3.topMargin = qZS.Zh(this, 10.0f);
        ((ViewGroup)view0).addView(xX0, linearLayout$LayoutParams3);
        PjT pjT0 = new PjT(this);
        pjT0.setId(com.bytedance.sdk.openadsdk.utils.qla.kph);
        pjT0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        pjT0.setVisibility(8);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(qZS.Zh(this, 44.0f), qZS.Zh(this, 44.0f));
        relativeLayout$LayoutParams0.addRule(9);
        relativeLayout$LayoutParams0.leftMargin = qZS.Zh(this, 5.0f);
        xX0.addView(pjT0, relativeLayout$LayoutParams0);
        Au au0 = new Au(this);
        au0.setId(com.bytedance.sdk.openadsdk.utils.qla.IJ);
        au0.setBackground(DWo.PjT(this, "tt_circle_solid_mian"));
        au0.setGravity(17);
        au0.setTextColor(-1);
        au0.setTextSize(2, 19.0f);
        au0.setTypeface(Typeface.DEFAULT_BOLD);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(qZS.Zh(this, 44.0f), qZS.Zh(this, 44.0f));
        relativeLayout$LayoutParams1.addRule(9);
        relativeLayout$LayoutParams1.leftMargin = qZS.Zh(this, 5.0f);
        xX0.addView(au0, relativeLayout$LayoutParams1);
        Au au1 = new Au(this);
        au1.setId(com.bytedance.sdk.openadsdk.utils.qla.OMu);
        au1.setMaxLines(1);
        TextUtils.TruncateAt textUtils$TruncateAt0 = TextUtils.TruncateAt.END;
        au1.setEllipsize(textUtils$TruncateAt0);
        au1.setTextColor(Color.parseColor("#e5000000"));
        au1.setTextSize(2, 12.0f);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams2.addRule(15);
        relativeLayout$LayoutParams2.leftMargin = qZS.Zh(this, 5.0f);
        relativeLayout$LayoutParams2.rightMargin = qZS.Zh(this, 80.0f);
        relativeLayout$LayoutParams2.addRule(1, com.bytedance.sdk.openadsdk.utils.qla.IJ);
        xX0.addView(au1, relativeLayout$LayoutParams2);
        Au au2 = new Au(this);
        au2.setId(com.bytedance.sdk.openadsdk.utils.qla.VY);
        au2.setClickable(true);
        au2.setMaxLines(1);
        au2.setEllipsize(textUtils$TruncateAt0);
        au2.setFocusable(true);
        au2.setGravity(17);
        au2.setText(Lrd.PjT(this, "tt_video_mobile_go_detail"));
        au2.setTextColor(-1);
        au2.setTextSize(2, 14.0f);
        au2.setPadding(qZS.Zh(this, 2.0f), qZS.Zh(this, 2.0f), qZS.Zh(this, 2.0f), qZS.Zh(this, 2.0f));
        au2.setBackground(DWo.PjT(this, "tt_ad_cover_btn_begin_bg"));
        RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(qZS.Zh(this, 90.0f), qZS.Zh(this, 36.0f));
        relativeLayout$LayoutParams3.addRule(11);
        relativeLayout$LayoutParams3.addRule(15);
        relativeLayout$LayoutParams3.rightMargin = qZS.Zh(this, 5.0f);
        xX0.addView(au2, relativeLayout$LayoutParams3);
        ReZ reZ2 = new ReZ(this);
        ((ViewGroup)view0).addView(reZ2, new LinearLayout.LayoutParams(-1, -1));
        cz cz0 = new cz(this);
        cz0.setId(com.bytedance.sdk.openadsdk.utils.qla.tY);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
        frameLayout$LayoutParams0.topMargin = qZS.Zh(this, 2.0f);
        reZ2.addView(cz0, frameLayout$LayoutParams0);
        XX xX1 = new XX(this);
        xX1.setId(com.bytedance.sdk.openadsdk.utils.qla.xH);
        xX1.setBackgroundColor(Color.parseColor("#F8F8F8"));
        reZ2.addView(xX1, new FrameLayout.LayoutParams(-1, -1));
        xf xf0 = new xf(this);
        xf0.setId(com.bytedance.sdk.openadsdk.utils.qla.dwk);
        xX1.addView(xf0, new RelativeLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.JQp.JQp jQp1 = new com.bytedance.sdk.openadsdk.core.JQp.JQp(this);
        jQp1.setId(com.bytedance.sdk.openadsdk.utils.qla.qZS);
        jQp1.setOrientation(1);
        jQp1.setVisibility(8);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        relativeLayout$LayoutParams4.addRule(13);
        xX1.addView(jQp1, relativeLayout$LayoutParams4);
        com.bytedance.sdk.openadsdk.core.widget.xE xE0 = new com.bytedance.sdk.openadsdk.core.widget.xE(this);
        xE0.setId(com.bytedance.sdk.openadsdk.utils.qla.MWx);
        LinearLayout.LayoutParams linearLayout$LayoutParams4 = new LinearLayout.LayoutParams(qZS.Zh(this, 80.0f), qZS.Zh(this, 80.0f));
        linearLayout$LayoutParams4.gravity = 17;
        jQp1.addView(xE0, linearLayout$LayoutParams4);
        Au au3 = new Au(this);
        au3.setId(com.bytedance.sdk.openadsdk.utils.qla.Ld);
        au3.setTextColor(Color.parseColor("#161823"));
        au3.setTextSize(0, ((float)qZS.Zh(this, 24.0f)));
        LinearLayout.LayoutParams linearLayout$LayoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        linearLayout$LayoutParams5.gravity = 17;
        linearLayout$LayoutParams5.topMargin = qZS.Zh(this, 12.0f);
        jQp1.addView(au3, linearLayout$LayoutParams5);
        Au au4 = new Au(this);
        au4.setId(com.bytedance.sdk.openadsdk.utils.qla.cI);
        au4.setTextColor(Color.parseColor("#80161823"));
        au4.setTextSize(0, ((float)qZS.Zh(this, 16.0f)));
        au4.setTextAlignment(4);
        LinearLayout.LayoutParams linearLayout$LayoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        linearLayout$LayoutParams6.gravity = 17;
        int v1 = qZS.Zh(this, 60.0f);
        linearLayout$LayoutParams6.rightMargin = v1;
        linearLayout$LayoutParams6.leftMargin = v1;
        linearLayout$LayoutParams6.topMargin = qZS.Zh(this, 8.0f);
        jQp1.addView(au4, linearLayout$LayoutParams6);
        Au au5 = new Au(this);
        au5.setId(com.bytedance.sdk.openadsdk.utils.qla.oG);
        au5.setGravity(17);
        au5.setTextColor(-1);
        au5.setText(Lrd.PjT(this, "tt_video_mobile_go_detail"));
        au5.setBackground(DWo.PjT(this, "tt_reward_video_download_btn_bg"));
        LinearLayout.LayoutParams linearLayout$LayoutParams7 = new LinearLayout.LayoutParams(qZS.Zh(this, 255.0f), qZS.Zh(this, 44.0f));
        linearLayout$LayoutParams7.gravity = 17;
        linearLayout$LayoutParams7.topMargin = qZS.Zh(this, 32.0f);
        jQp1.addView(au5, linearLayout$LayoutParams7);
        PAGLogoView pAGLogoView0 = new PAGLogoView(this);
        this.Xtz = pAGLogoView0;
        pAGLogoView0.setId(com.bytedance.sdk.openadsdk.utils.qla.HG);
        this.Xtz.setVisibility(8);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams5 = new RelativeLayout.LayoutParams(-2, qZS.Zh(this, 14.0f));
        relativeLayout$LayoutParams5.addRule(12);
        relativeLayout$LayoutParams5.leftMargin = qZS.Zh(this, 18.0f);
        relativeLayout$LayoutParams5.bottomMargin = qZS.Zh(this, 61.0f);
        xX1.addView(this.Xtz, relativeLayout$LayoutParams5);
        com.bytedance.sdk.openadsdk.common.fDm fDm1 = new com.bytedance.sdk.openadsdk.common.fDm(this, new com.bytedance.sdk.openadsdk.common.fDm.PjT() {
            final TTVideoLandingPageLink2Activity PjT;

            @Override  // com.bytedance.sdk.openadsdk.common.fDm$PjT
            public View PjT(Context context0) {
                return new com.bytedance.sdk.openadsdk.common.XX(context0);
            }
        });
        fDm1.setId(com.bytedance.sdk.openadsdk.utils.qla.zZ);
        FrameLayout.LayoutParams frameLayout$LayoutParams1 = new FrameLayout.LayoutParams(-1, qZS.Zh(this, 48.0f));
        frameLayout$LayoutParams1.gravity = 81;
        reZ2.addView(fDm1, frameLayout$LayoutParams1);
        com.bytedance.sdk.openadsdk.common.fDm fDm2 = new com.bytedance.sdk.openadsdk.common.fDm(this, new com.bytedance.sdk.openadsdk.common.fDm.PjT() {
            final TTVideoLandingPageLink2Activity PjT;

            @Override  // com.bytedance.sdk.openadsdk.common.fDm$PjT
            public View PjT(Context context0) {
                return new com.bytedance.sdk.openadsdk.common.Au(context0);
            }
        });
        fDm2.setId(com.bytedance.sdk.openadsdk.utils.qla.Xe);
        FrameLayout.LayoutParams frameLayout$LayoutParams2 = new FrameLayout.LayoutParams(-1, qZS.Zh(this, 44.0f));
        frameLayout$LayoutParams2.gravity = 80;
        reZ2.addView(fDm2, frameLayout$LayoutParams2);
        return view0;
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    @SuppressLint({"ClickableViewAccessibility"})
    protected void ReZ() {
        super.ReZ();
        TextView textView0 = (TextView)this.findViewById(0x1F000011);
        if(textView0 != null) {
            textView0.setText(Lrd.PjT(ub.PjT(), "tt_reward_feedback"));
            textView0.setOnClickListener((/* 缺少LAMBDA参数 */) -> {
                if(TTVideoLandingPageLink2Activity.this.isFinishing()) {
                    return;
                }
                if(TTVideoLandingPageLink2Activity.this.Ld.get()) {
                    TTVideoLandingPageLink2Activity.this.qla();
                    return;
                }
                if(TTVideoLandingPageLink2Activity.this.xH == null) {
                    TTVideoLandingPageLink2Activity.this.xE();
                }
                qla qla0 = TTVideoLandingPageLink2Activity.this.xH;
                if(qla0 != null) {
                    qla0.PjT();
                }
            });
        }
        this.Xe = (TextView)this.findViewById(0x1F000012);
        this.cI = (xf)this.findViewById(com.bytedance.sdk.openadsdk.utils.qla.dwk);
        this.oG = this.findViewById(com.bytedance.sdk.openadsdk.utils.qla.xH);
        this.HG = this.findViewById(com.bytedance.sdk.openadsdk.utils.qla.qZS);
        TextView textView1 = (TextView)this.findViewById(com.bytedance.sdk.openadsdk.utils.qla.Ld);
        TextView textView2 = (TextView)this.findViewById(com.bytedance.sdk.openadsdk.utils.qla.cI);
        com.bytedance.sdk.openadsdk.core.widget.xE xE0 = (com.bytedance.sdk.openadsdk.core.widget.xE)this.findViewById(com.bytedance.sdk.openadsdk.utils.qla.MWx);
        this.kFP = (TextView)this.findViewById(com.bytedance.sdk.openadsdk.utils.qla.oG);
        if(this.xE.Xe() != null && !TextUtils.isEmpty(this.xE.Xe().PjT())) {
            Zh.PjT().PjT(this.xE.Xe(), xE0, this.xE);
        }
        textView1.setText(this.xE.Ld());
        textView2.setText(this.xE.ix());
        View view0 = this.findViewById(com.bytedance.sdk.openadsdk.utils.qla.HG);
        view0.setOnClickListener(new View.OnClickListener() {
            final TTVideoLandingPageLink2Activity PjT;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                TTWebsiteActivity.PjT(TTVideoLandingPageLink2Activity.this.JQp, TTVideoLandingPageLink2Activity.this.xE, TTVideoLandingPageLink2Activity.this.ZX);
            }
        });
        if(view0 instanceof PAGLogoView) {
            ((PAGLogoView)view0).initData(this.xE);
        }
        if(this.PjT != null && this.PjT.getWebView() != null) {
            wN.PjT(this.xE, this.PjT);
        }
        boolean z = ub.cr().Owx();
        this.fA = z;
        if(z) {
            ((com.bytedance.sdk.openadsdk.common.fDm)this.findViewById(com.bytedance.sdk.openadsdk.utils.qla.Xe)).setVisibility(0);
            LinearLayout linearLayout0 = (LinearLayout)this.findViewById(com.bytedance.sdk.openadsdk.utils.qla.Nv);
            this.wKV = linearLayout0;
            linearLayout0.setVisibility(8);
            this.zYH = new xE(this, this.wKV, this.PjT, this.xE, "landingpage_split_screen");
            if(this.PjT.getWebView() != null) {
                this.PjT.getWebView().setOnTouchListener(new View.OnTouchListener() {
                    float PjT;
                    final TTVideoLandingPageLink2Activity Zh;

                    {
                        this.PjT = 0.0f;
                    }

                    @Override  // android.view.View$OnTouchListener
                    public boolean onTouch(View view0, MotionEvent motionEvent0) {
                        if(motionEvent0.getAction() == 0) {
                            this.PjT = motionEvent0.getY();
                        }
                        qj qj0 = TTVideoLandingPageLink2Activity.this.rds;
                        if(qj0 != null) {
                            qj0.PjT(motionEvent0);
                        }
                        if(TTVideoLandingPageLink2Activity.this.yks != null) {
                            TTVideoLandingPageLink2Activity.this.yks.PjT(motionEvent0);
                        }
                        if(motionEvent0.getAction() == 2) {
                            float f = motionEvent0.getY();
                            float f1 = this.PjT;
                            if(f - f1 > 8.0f) {
                                if(TTVideoLandingPageLink2Activity.this.zYH != null) {
                                    TTVideoLandingPageLink2Activity.this.zYH.PjT();
                                }
                                return false;
                            }
                            if(f - f1 < -8.0f && TTVideoLandingPageLink2Activity.this.zYH != null) {
                                TTVideoLandingPageLink2Activity.this.zYH.Zh();
                            }
                        }
                        return false;
                    }
                });
            }
        }
        else if(this.PjT.getWebView() != null) {
            this.PjT.getWebView().setOnTouchListener(new View.OnTouchListener() {
                final TTVideoLandingPageLink2Activity PjT;

                @Override  // android.view.View$OnTouchListener
                public boolean onTouch(View view0, MotionEvent motionEvent0) {
                    qj qj0 = TTVideoLandingPageLink2Activity.this.rds;
                    if(qj0 != null) {
                        qj0.PjT(motionEvent0);
                    }
                    if(TTVideoLandingPageLink2Activity.this.yks != null) {
                        TTVideoLandingPageLink2Activity.this.yks.PjT(motionEvent0);
                    }
                    return false;
                }
            });
        }
        xf xf0 = this.cI;
        if(xf0 != null) {
            xf0.PjT(this.xE);
        }

        class com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.12 implements View.OnClickListener {
            final TTVideoLandingPageLink2Activity PjT;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                TTVideoLandingPageLink2Activity.this.xf();
            }
        }

    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    @SuppressLint({"ClickableViewAccessibility"})
    public void SM() {
        super.SM();
        Owx owx0 = this.xE;
        if(owx0 != null) {
            owx0.cz(true);
        }
        TextView textView0 = this.kFP;
        if(textView0 != null) {
            textView0.setText("ダウンロード");
            this.kFP.setClickable(true);
            this.kFP.setOnClickListener(this.tY);
            this.kFP.setOnTouchListener(this.tY);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    @SuppressLint({"ClickableViewAccessibility"})
    protected void cr() {
        if(this.JQp()) {
            super.cr();
            com.bytedance.sdk.openadsdk.core.xf.Zh.cz cz0 = this.fDm;
            if(cz0 != null) {
                if(cz0.getNativeVideoController() != null) {
                    this.fDm.getNativeVideoController().PjT(false);
                    ((com.bytedance.sdk.openadsdk.core.xf.Zh.ReZ)this.fDm.getNativeVideoController()).cz(false);
                    this.xf.setClickable(true);
                    this.xf.setOnTouchListener(new View.OnTouchListener() {
                        final TTVideoLandingPageLink2Activity PjT;

                        @Override  // android.view.View$OnTouchListener
                        public boolean onTouch(View view0, MotionEvent motionEvent0) {
                            if(motionEvent0.getAction() == 0) {
                                TTVideoLandingPageLink2Activity.this.xs();
                            }
                            return false;
                        }
                    });
                }
                this.fDm.getNativeVideoController().PjT(new a() {
                    final TTVideoLandingPageLink2Activity PjT;

                    @Override  // x.b$a
                    public void PjT() {
                    }

                    @Override  // x.b$a
                    public void PjT(long v, int v1) {
                    }

                    @Override  // x.b$a
                    public void PjT(long v, long v1) {
                        if(TTVideoLandingPageLink2Activity.this.Xe != null) {
                            int v2 = (int)Math.max(0L, (v1 - v) / 1000L);
                            TTVideoLandingPageLink2Activity.this.Xe.setText(String.valueOf(v2));
                            if(v2 <= 0) {
                                TTVideoLandingPageLink2Activity.this.Xe.setVisibility(8);
                            }
                        }
                    }

                    @Override  // x.b$a
                    public void Zh(long v, int v1) {
                    }
                });
            }
        }
        else {
            try {
                ImageView imageView0 = new ImageView(this);
                imageView0.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                imageView0.setScaleType(ImageView.ScaleType.FIT_CENTER);
                Zh.PjT().PjT(((com.bytedance.sdk.openadsdk.core.model.xE)this.xE.CY().get(0)), imageView0, this.xE);
                this.xf.setVisibility(0);
                this.xf.removeAllViews();
                this.xf.addView(imageView0);
                imageView0.setOnClickListener(new View.OnClickListener() {
                    final TTVideoLandingPageLink2Activity PjT;

                    @Override  // android.view.View$OnClickListener
                    public void onClick(View view0) {
                        com.bytedance.sdk.openadsdk.cr.ReZ.Zh(TTVideoLandingPageLink2Activity.this.xE, "landingpage_split_screen");
                    }
                });
            }
            catch(Exception unused_ex) {
            }
        }
    }

    private void fDm() {
        xf xf0 = this.cI;
        if(xf0 != null) {
            xf0.Zh();
        }
    }

    @Override  // android.app.Activity
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        xf xf0 = this.cI;
        if(xf0 != null) {
            xf0.PjT();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    protected void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        this.finish();

        class com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.1 implements View.OnScrollChangeListener {
            final TTVideoLandingPageLink2Activity PjT;

            @Override  // android.view.View$OnScrollChangeListener
            public void onScrollChange(View view0, int v, int v1, int v2, int v3) {
                qj qj0 = TTVideoLandingPageLink2Activity.this.rds;
                if(qj0 != null) {
                    qj0.Zh(v1);
                }
            }
        }


        class com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.7 extends JQp {
            final TTVideoLandingPageLink2Activity PjT;

            com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.7(Context context0, KM kM0, String s, com.bytedance.sdk.openadsdk.common.cr cr0, qj qj0, boolean z) {
            }

            @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
            public void onPageFinished(WebView webView0, String s) {
                super.onPageFinished(webView0, s);
                try {
                    if(TTVideoLandingPageLink2Activity.this.oG != null && !TTVideoLandingPageLink2Activity.this.zZ) {
                        TTVideoLandingPageLink2Activity.this.oG.setVisibility(8);
                    }
                    if(TTVideoLandingPageLink2Activity.this.wKV != null) {
                        TTVideoLandingPageLink2Activity.this.wKV.setVisibility(0);
                    }
                    TTVideoLandingPageLink2Activity.this.CY = true;
                    TTVideoLandingPageLink2Activity.this.fDm();
                    com.bytedance.sdk.openadsdk.cr.ReZ.PjT(TTVideoLandingPageLink2Activity.this.xE, TTVideoLandingPageLink2Activity.this.ZX, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.xu, true);
                }
                catch(Throwable unused_ex) {
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
            public void onPageStarted(WebView webView0, String s, Bitmap bitmap0) {
                super.onPageStarted(webView0, s, bitmap0);
                TTVideoLandingPageLink2Activity.this.xu = System.currentTimeMillis();
            }
        }


        class com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.8 extends com.bytedance.sdk.openadsdk.core.widget.PjT.cr {
            final TTVideoLandingPageLink2Activity PjT;

            com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.8(KM kM0, qj qj0, com.bytedance.sdk.openadsdk.common.cr cr0) {
            }

            @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.cr
            public void onProgressChanged(WebView webView0, int v) {
                super.onProgressChanged(webView0, v);
                if(TTVideoLandingPageLink2Activity.this.fA && TTVideoLandingPageLink2Activity.this.zYH != null && v == 100) {
                    TTVideoLandingPageLink2Activity.this.zYH.PjT(webView0, TTVideoLandingPageLink2Activity.this.VY);
                }
                if(TTVideoLandingPageLink2Activity.this.cI != null) {
                    TTVideoLandingPageLink2Activity.this.cI.PjT(v);
                }
            }
        }


        class com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.9 implements Runnable {
            final TTVideoLandingPageLink2Activity PjT;

            @Override
            public void run() {
                try {
                    TTVideoLandingPageLink2Activity.this.zZ = true;
                    if(TTVideoLandingPageLink2Activity.this.cI != null) {
                        TTVideoLandingPageLink2Activity.this.cI.Zh();
                    }
                    TTVideoLandingPageLink2Activity.this.HG.setVisibility(0);
                    if(TTVideoLandingPageLink2Activity.this.Xtz != null) {
                        TTVideoLandingPageLink2Activity.this.Xtz.setVisibility(0);
                    }
                    if(!TTVideoLandingPageLink2Activity.this.CY) {
                        com.bytedance.sdk.openadsdk.cr.ReZ.PjT(TTVideoLandingPageLink2Activity.this.xE, TTVideoLandingPageLink2Activity.this.ZX, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.xu, false);
                    }
                }
                catch(Exception unused_ex) {
                }
            }
        }

    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    protected void onDestroy() {
        this.fDm();
        if(!this.zZ && this.rds != null && this.PjT != null && this.cI.getVisibility() == 8) {
            this.rds.PjT(this.PjT);
        }
        super.onDestroy();
    }

    private void qla() {
        TTAdDislikeToast tTAdDislikeToast0 = this.dwk;
        if(tTAdDislikeToast0 == null) {
            return;
        }
        tTAdDislikeToast0.show(TTAdDislikeToast.getDislikeTip());
    }

    private void ub() {
        if(!this.isFinishing()) {
            TTAdDislikeToast tTAdDislikeToast0 = this.dwk;
            if(tTAdDislikeToast0 != null) {
                tTAdDislikeToast0.show(TTAdDislikeToast.getDislikeSendTip());
            }
        }
    }

    private void xE() {
        try {
            if(this.xH == null) {
                qla qla0 = new qla(this.JQp, this.xE);
                this.xH = qla0;
                qla0.setDislikeSource("landing_page");
                this.xH.setCallback(new com.bytedance.sdk.openadsdk.common.qla.PjT() {
                    final TTVideoLandingPageLink2Activity PjT;

                    @Override  // com.bytedance.sdk.openadsdk.common.qla$PjT
                    public void PjT(View view0) {
                        TTVideoLandingPageLink2Activity.this.MWx.set(true);
                    }

                    @Override  // com.bytedance.sdk.openadsdk.common.qla$PjT
                    public void PjT(FilterWord filterWord0) {
                        if(!TTVideoLandingPageLink2Activity.this.Ld.get() && filterWord0 != null && !filterWord0.hasSecondOptions()) {
                            TTVideoLandingPageLink2Activity.this.Ld.set(true);
                            TTVideoLandingPageLink2Activity.this.ub();
                        }
                    }

                    @Override  // com.bytedance.sdk.openadsdk.common.qla$PjT
                    public void Zh(View view0) {
                        TTVideoLandingPageLink2Activity.this.MWx.set(false);
                    }
                });
            }
            FrameLayout frameLayout0 = (FrameLayout)this.findViewById(0x1020002);
            frameLayout0.addView(this.xH);
            if(this.dwk == null) {
                TTAdDislikeToast tTAdDislikeToast0 = new TTAdDislikeToast(this.JQp);
                this.dwk = tTAdDislikeToast0;
                frameLayout0.addView(tTAdDislikeToast0);
            }
            return;
        }
        catch(Throwable throwable0) {
        }
        ApmHelper.reportCustomError("initDislike error", "TTVideoLandingPageLink2Activity", throwable0);
    }

    // 检测为 Lambda 实现
    protected void xf() [...]

    private void xs() {
        com.bytedance.sdk.openadsdk.cr.ReZ.PjT(this.xE, "landingpage_split_screen", "click_video", null);
    }
}

