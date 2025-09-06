package com.bytedance.sdk.openadsdk.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View.OnScrollChangeListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.SM.cz;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.openadsdk.common.cr;
import com.bytedance.sdk.openadsdk.core.KM;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.ub;
import com.bytedance.sdk.openadsdk.core.widget.PjT.JQp;
import com.bytedance.sdk.openadsdk.cr.qj;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.wN;

public class TTCeilingLandingPageActivity extends TTBaseActivity {
    public interface PjT {
        void PjT();
    }

    private String Au;
    private cr DWo;
    private String JQp;
    PjT PjT;
    private KM ReZ;
    private qj SM;
    private Owx Zh;
    private String cr;
    private int cz;
    private cz qj;

    private void PjT() {
        KM kM0 = new KM(this);
        this.ReZ = kM0;
        kM0.Zh(this.qj).ReZ(this.cr).cr(this.JQp).PjT(this.Zh).Zh(this.cz).PjT(this.Zh.OMu()).JQp(this.Zh.SW()).PjT(this.qj).Zh("landingpage_split_ceiling");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void PjT(Context context0, FrameLayout frameLayout0) {
        com.bytedance.sdk.openadsdk.core.JQp.cr cr1;
        this.qj = new cz(context0);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
        frameLayout0.addView(this.qj, frameLayout$LayoutParams0);
        com.bytedance.sdk.openadsdk.core.JQp.cr cr0 = com.bytedance.sdk.openadsdk.core.widget.cz.Zh(context0);
        FrameLayout.LayoutParams frameLayout$LayoutParams1 = new FrameLayout.LayoutParams(-2, -2);
        frameLayout$LayoutParams1.gravity = 0x800035;
        frameLayout$LayoutParams1.topMargin = qZS.Zh(context0, 18.0f);
        frameLayout$LayoutParams1.rightMargin = qZS.Zh(context0, 18.0f);
        frameLayout0.addView(cr0, frameLayout$LayoutParams1);
        int v = this.Zh.fDm().XX();
        if(v == 3) {
            cr1 = null;
        }
        else {
            cr1 = new com.bytedance.sdk.openadsdk.core.JQp.cr(context0);
            FrameLayout.LayoutParams frameLayout$LayoutParams2 = new FrameLayout.LayoutParams(qZS.Zh(context0, 28.0f), qZS.Zh(context0, 28.0f));
            frameLayout$LayoutParams2.gravity = 0x800033;
            frameLayout$LayoutParams2.topMargin = qZS.Zh(context0, 18.0f);
            frameLayout$LayoutParams2.leftMargin = qZS.Zh(context0, 18.0f);
            int v1 = qZS.Zh(context0, 5.0f);
            cr1.setPadding(v1, v1, v1, v1);
            cr1.setScaleType(ImageView.ScaleType.FIT_XY);
            cr1.setBackground(com.bytedance.sdk.openadsdk.core.widget.cr.PjT());
            cr1.setImageDrawable(Lrd.ReZ(context0, "tt_white_lefterbackicon_titlebar"));
            frameLayout0.addView(cr1, frameLayout$LayoutParams2);
        }
        com.bytedance.sdk.openadsdk.utils.Owx.PjT(this.qj, this.Au);
        WebView webView0 = this.qj.getWebView();
        cr0.setOnClickListener(new View.OnClickListener() {
            final TTCeilingLandingPageActivity PjT;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                TTCeilingLandingPageActivity.this.finish();
            }
        });
        qj qj0 = new qj(this.Zh, webView0, true);
        this.SM = qj0;
        qj0.PjT("landingpage_split_ceiling");
        com.bytedance.sdk.openadsdk.core.widget.PjT.cz.PjT cz$PjT0 = this.SM.PjT;
        if(cr1 != null) {
            cr1.setOnClickListener(new View.OnClickListener() {
                final TTCeilingLandingPageActivity cr;

                @Override  // android.view.View$OnClickListener
                public void onClick(View view0) {
                    int v = v;
                    if(v == 1) {
                        TTCeilingLandingPageActivity.this.finish();
                    }
                    else if(v != 2) {
                        return;
                    }
                    if(webView0 == null || !webView0.canGoBack()) {
                        TTCeilingLandingPageActivity.this.finish();
                    }
                    else {
                        webView0.goBack();
                        com.bytedance.sdk.openadsdk.core.widget.PjT.cz.PjT cz$PjT0 = cz$PjT0;
                        if(cz$PjT0 != null) {
                            cz$PjT0.PjT();
                        }
                    }
                }
            });
        }
        cr cr2 = wN.PjT(this.Zh, this.qj, this, "landingpage_split_ceiling");
        this.DWo = cr2;
        if(cr2 != null) {
            cr2.PjT("landingpage_split_ceiling");
            this.DWo.PjT();
        }
        wN.PjT(this.Zh, this.qj, true);
        this.PjT = new PjT() {
            final TTCeilingLandingPageActivity PjT;

            @Override  // com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity$PjT
            public void PjT() {
                if(TTCeilingLandingPageActivity.this.Zh.fDm().Au() == ub.Zh) {
                    TTCeilingLandingPageActivity.this.finish();
                }
            }
        };
        com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity.4 tTCeilingLandingPageActivity$40 = new JQp(this, this.ReZ, this.cr, this.DWo, this.SM, true, true, this.PjT) {
            final TTCeilingLandingPageActivity PjT;

            @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.JQp
            public void onPageFinished(WebView webView0, String s) {
                super.onPageFinished(webView0, s);
            }
        };
        tTCeilingLandingPageActivity$40.PjT(this.Zh);
        com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity.5 tTCeilingLandingPageActivity$50 = new com.bytedance.sdk.openadsdk.core.widget.PjT.cr(this.ReZ, this.SM, this.DWo) {
            final TTCeilingLandingPageActivity PjT;

            @Override  // com.bytedance.sdk.openadsdk.core.widget.PjT.cr
            public void onProgressChanged(WebView webView0, int v) {
                super.onProgressChanged(webView0, v);
            }
        };
        cz cz0 = this.qj;
        if(cz0 != null) {
            cz0.setWebViewClient(tTCeilingLandingPageActivity$40);
            this.qj.setWebChromeClient(tTCeilingLandingPageActivity$50);
        }
        if(webView0 != null) {
            webView0.setOnTouchListener(new View.OnTouchListener() {
                final TTCeilingLandingPageActivity PjT;

                @Override  // android.view.View$OnTouchListener
                public boolean onTouch(View view0, MotionEvent motionEvent0) {
                    if(TTCeilingLandingPageActivity.this.SM != null) {
                        TTCeilingLandingPageActivity.this.SM.PjT(motionEvent0);
                    }
                    return false;
                }
            });
            if(Build.VERSION.SDK_INT >= 23) {
                webView0.setOnScrollChangeListener(new View.OnScrollChangeListener() {
                    final TTCeilingLandingPageActivity PjT;

                    @Override  // android.view.View$OnScrollChangeListener
                    public void onScrollChange(View view0, int v, int v1, int v2, int v3) {
                        if(TTCeilingLandingPageActivity.this.SM != null) {
                            TTCeilingLandingPageActivity.this.SM.Zh(v1);
                        }
                    }
                });
            }
        }
    }

    @Override  // android.app.Activity
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        this.finish();
    }

    @Override  // android.app.Activity
    protected void onStop() {
        super.onStop();
        qj qj0 = this.SM;
        if(qj0 != null) {
            qj0.Au();
        }
    }
}

