package com.bytedance.sdk.openadsdk.core.ReZ;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.openadsdk.ReZ.ReZ;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.Au.PjT;
import com.bytedance.sdk.openadsdk.core.Au.ltE;
import com.bytedance.sdk.openadsdk.core.Au.ub;
import com.bytedance.sdk.openadsdk.core.JQp.cr;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.fDm;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.qj;
import com.bytedance.sdk.openadsdk.gK.Zh;
import com.bytedance.sdk.openadsdk.ltE.PjT.PjT.cz;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import x.b.b;
import x.b.d;

public class XX extends PjT implements b, d {
    static class com.bytedance.sdk.openadsdk.core.ReZ.XX.PjT {
        public PAGLogoView JQp;
        public FrameLayout PjT;
        public cr ReZ;
        public qj Zh;
        public cr cr;
        public cr cz;

        private com.bytedance.sdk.openadsdk.core.ReZ.XX.PjT() {
        }

        com.bytedance.sdk.openadsdk.core.ReZ.XX.PjT(com.bytedance.sdk.openadsdk.core.ReZ.XX.1 xX$10) {
        }
    }

    public boolean PjT;
    private cz fDm;
    private long gK;
    private PAGBannerAdWrapperListener ltE;
    private com.bytedance.sdk.openadsdk.core.xf.Zh.cz qla;
    private String ub;
    private ImageView xE;
    private ltE xs;

    public XX(@NonNull Context context0) {
        super(context0);
        this.PjT = true;
        this.Zh = context0;
    }

    private void JQp() {
        ub ub0 = com.bytedance.sdk.openadsdk.core.ReZ.PjT.PjT(this.xs.getExpectExpressWidth(), this.xs.getExpectExpressHeight());
        if(this.xs.getExpectExpressWidth() <= 0 || this.xs.getExpectExpressHeight() <= 0) {
            int v = qZS.ReZ(this.Zh);
            this.XX = v;
            this.Au = ((float)(((float)v) / ub0.Zh)).intValue();
        }
        else {
            this.XX = qZS.Zh(this.Zh, ((float)this.xs.getExpectExpressWidth()));
            this.Au = qZS.Zh(this.Zh, ((float)this.xs.getExpectExpressHeight()));
        }
        if(this.XX > 0 && this.XX > qZS.ReZ(this.Zh)) {
            float f = ((float)qZS.ReZ(this.Zh)) / ((float)this.XX);
            this.XX = qZS.ReZ(this.Zh);
            this.Au = ((float)(((float)this.Au) * f)).intValue();
        }
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getLayoutParams();
        if(viewGroup$LayoutParams0 == null) {
            viewGroup$LayoutParams0 = new ViewGroup.LayoutParams(this.XX, this.Au);
        }
        viewGroup$LayoutParams0.width = this.XX;
        viewGroup$LayoutParams0.height = this.Au;
        if(viewGroup$LayoutParams0 instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams)viewGroup$LayoutParams0).gravity = 17;
        }
        this.setLayoutParams(viewGroup$LayoutParams0);
        this.PjT(ub0);
    }

    private void PjT(ub ub0) {
        Owx owx0 = this.ReZ;
        if(owx0 != null) {
            int v = owx0.fK();
            com.bytedance.sdk.openadsdk.core.ReZ.XX.PjT xX$PjT0 = this.Zh(ub0);
            if(xX$PjT0 != null) {
                FrameLayout frameLayout0 = xX$PjT0.PjT;
                if(frameLayout0 != null) {
                    this.addView(frameLayout0);
                    cr cr0 = xX$PjT0.cr;
                    PAGLogoView pAGLogoView0 = xX$PjT0.JQp;
                    cr cr1 = xX$PjT0.cz;
                    if(cr1 != null && this.ReZ.xf()) {
                        qZS.PjT(cr1, 0);
                        Zh.PjT().PjT(((int)qZS.PjT(com.bytedance.sdk.openadsdk.core.ub.PjT(), 11.0f, true)), cr1, this.ReZ);
                    }
                    this.xE = xX$PjT0.ReZ;
                    com.bytedance.sdk.openadsdk.core.xf.Zh.cz cz0 = this.getVideoView();
                    if(cz0 instanceof com.bytedance.sdk.openadsdk.core.xf.Zh.cz) {
                        this.qla = cz0;
                        cz0.setVideoAdLoadListener(this);
                        this.qla.setVideoAdInteractionListener(this);
                        ArrayList arrayList0 = new ArrayList();
                        arrayList0.add(new Pair(cr0, FriendlyObstructionPurpose.CLOSE_AD));
                        arrayList0.add(new Pair(pAGLogoView0, FriendlyObstructionPurpose.OTHER));
                        arrayList0.add(new Pair(cr1, FriendlyObstructionPurpose.OTHER));
                        arrayList0.add(new Pair(this.xE, FriendlyObstructionPurpose.VIDEO_CONTROLS));
                        this.qla.PjT(arrayList0);
                        this.qla.setAdCreativeClickListener(new com.bytedance.sdk.openadsdk.core.xf.Zh.cz.PjT() {
                            final XX PjT;

                            @Override  // com.bytedance.sdk.openadsdk.core.xf.Zh.cz$PjT
                            public void PjT(View view0, int v) {
                                if(XX.this.ltE != null) {
                                    XX.this.ltE.onAdClicked();
                                }
                            }
                        });
                    }
                    if(pAGLogoView0 != null) {
                        pAGLogoView0.setOnClickListener(new View.OnClickListener() {
                            final XX PjT;

                            @Override  // android.view.View$OnClickListener
                            public void onClick(View view0) {
                                TTWebsiteActivity.PjT(XX.this.Zh, XX.this.ReZ, XX.this.cz);
                            }
                        });
                    }
                    if(cr0 != null) {
                        cr0.setOnClickListener((/* 缺少LAMBDA参数 */) -> {
                            TTDislikeDialogAbstract tTDislikeDialogAbstract0 = XX.this.JQp;
                            if(tTDislikeDialogAbstract0 != null) {
                                tTDislikeDialogAbstract0.show();
                                return;
                            }
                            ReZ reZ0 = XX.this.cr;
                            if(reZ0 != null) {
                                reZ0.PjT();
                                return;
                            }
                            TTDelegateActivity.PjT(XX.this.ReZ, XX.this.ub);
                        });
                        ltE ltE0 = this.xs;
                        if(ltE0 != null) {
                            if(ltE0.getClickListener() != null) {
                                this.xs.getClickListener().Zh(cr0);
                            }
                            if(this.xs.getClickCreativeListener() != null) {
                                this.xs.getClickCreativeListener().Zh(cr0);
                            }
                        }
                    }
                    ImageView imageView0 = this.xE;
                    if(imageView0 != null) {
                        imageView0.setOnClickListener(new View.OnClickListener() {
                            final XX PjT;

                            @Override  // android.view.View$OnClickListener
                            public void onClick(View view0) {
                                if(XX.this.qla != null) {
                                    boolean z = XX.this.qla.SM();
                                    Drawable drawable0 = z ? Lrd.ReZ(XX.this.getContext(), "tt_reward_full_unmute") : Lrd.ReZ(XX.this.getContext(), "tt_reward_full_mute");
                                    XX.this.qla.PjT(!z, "vastBannerBackupViewClick");
                                    XX.this.xE.setImageDrawable(drawable0);
                                    if(XX.this.ReZ != null && XX.this.ReZ.QB() != null && XX.this.ReZ.QB().PjT() != null) {
                                        if(!z) {
                                            XX.this.ReZ.QB().PjT().Au(XX.this.gK);
                                            return;
                                        }
                                        XX.this.ReZ.QB().PjT().SM(XX.this.gK);
                                    }
                                }
                            }
                        });
                    }
                    qj qj0 = xX$PjT0.Zh;
                    if(this.ReZ != null && this.ReZ.QB() != null && qj0 != null) {
                        int v1 = this.ReZ.QB().xf();
                        float f = (float)this.ReZ.QB().xs();
                        if(v1 <= 0 || f <= 0.0f) {
                            switch(v) {
                                case 5: {
                                    qj0.setRatio(1.777778f);
                                    break;
                                }
                                case 15: {
                                    qj0.setRatio(0.5625f);
                                    break;
                                }
                                default: {
                                    qj0.setRatio(1.0f);
                                }
                            }
                        }
                        else {
                            qj0.setRatio(((float)v1) / f);
                        }
                    }
                    FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
                    if(cz0 != null && qj0 != null) {
                        qj0.addView(cz0, frameLayout$LayoutParams0);
                        cz0.setTag(0x1F000042, Boolean.TRUE);
                    }
                    this.PjT(cz0, true);
                    this.PjT(this, true);
                    this.PjT(qj0);
                }
            }
        }

        class com.bytedance.sdk.openadsdk.core.ReZ.XX.3 implements View.OnClickListener {
            final XX PjT;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                XX.this.PjT();
            }
        }

    }

    // 检测为 Lambda 实现
    @Override  // com.bytedance.sdk.openadsdk.core.Au.PjT
    public void PjT() [...]

    @Override  // x.b$d
    public void PjT(int v, int v1) {
        ImageView imageView0 = this.xE;
        if(imageView0 != null) {
            imageView0.setVisibility(8);
        }
    }

    @Override  // x.b$b
    public void PjT(long v, long v1) {
        this.gK = v;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.PjT
    protected void PjT(View view0, int v, fDm fDm0) {
        ltE ltE0 = this.xs;
        if(ltE0 != null) {
            ltE0.PjT(view0, v, fDm0);
            if(this.qla != null && this.qla.getNativeVideoController() instanceof com.bytedance.sdk.openadsdk.core.xf.Zh.ReZ) {
                ((com.bytedance.sdk.openadsdk.core.xf.Zh.ReZ)this.qla.getNativeVideoController()).Co();
            }
        }
    }

    public void PjT(Owx owx0, ltE ltE0, cz cz0) {
        this.setBackgroundColor(0xFF000000);
        this.ReZ = owx0;
        this.xs = ltE0;
        this.fDm = cz0;
        this.cz = "banner_ad";
        ltE0.addView(this, new ViewGroup.LayoutParams(-2, -2));
        this.JQp();
    }

    private com.bytedance.sdk.openadsdk.core.ReZ.XX.PjT Zh(ub ub0) {
        com.bytedance.sdk.openadsdk.core.ReZ.XX.PjT xX$PjT0 = new com.bytedance.sdk.openadsdk.core.ReZ.XX.PjT(null);
        xX$PjT0.PjT = new FrameLayout(this.Zh);
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = new ViewGroup.LayoutParams(-2, -2);
        viewGroup$LayoutParams0.width = -1;
        viewGroup$LayoutParams0.height = -1;
        xX$PjT0.PjT.setLayoutParams(viewGroup$LayoutParams0);
        xX$PjT0.Zh = new qj(this.Zh);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-2, -1);
        frameLayout$LayoutParams0.gravity = 17;
        xX$PjT0.Zh.setLayoutParams(frameLayout$LayoutParams0);
        xX$PjT0.PjT.addView(xX$PjT0.Zh);
        int v = qZS.Zh(this.Zh, 28.0f);
        int v1 = qZS.Zh(this.Zh, 12.0f);
        int v2 = qZS.Zh(this.Zh, 2.25f);
        int v3 = qZS.Zh(this.Zh, 5.0f);
        if(ub0 != null && ub0.PjT == 1) {
            v = v1;
        }
        if(ub0 == null || ub0.PjT != 1) {
            v2 = v3;
        }
        cr cr0 = new cr(this.getContext());
        xX$PjT0.ReZ = cr0;
        cr0.setPadding(v2, v2, v2, v2);
        xX$PjT0.ReZ.setBackground(com.bytedance.sdk.openadsdk.core.widget.cr.PjT());
        FrameLayout.LayoutParams frameLayout$LayoutParams1 = new FrameLayout.LayoutParams(v, v);
        frameLayout$LayoutParams1.setMargins(v3, v3, v3, v3);
        ImageView.ScaleType imageView$ScaleType0 = ImageView.ScaleType.FIT_CENTER;
        xX$PjT0.ReZ.setScaleType(imageView$ScaleType0);
        xX$PjT0.ReZ.setImageDrawable(Lrd.ReZ(this.getContext(), "tt_reward_full_mute"));
        xX$PjT0.ReZ.setLayoutParams(frameLayout$LayoutParams1);
        xX$PjT0.PjT.addView(xX$PjT0.ReZ);
        xX$PjT0.cr = ub0 == null || ub0.PjT != 1 ? com.bytedance.sdk.openadsdk.core.widget.cz.Zh(this.getContext()) : com.bytedance.sdk.openadsdk.core.widget.cz.PjT(this.getContext());
        xX$PjT0.cr.setId(0x1F000001);
        FrameLayout.LayoutParams frameLayout$LayoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        frameLayout$LayoutParams2.gravity = 0x800005;
        frameLayout$LayoutParams2.setMargins(v3, v3, v3, v3);
        xX$PjT0.cr.setLayoutParams(frameLayout$LayoutParams2);
        xX$PjT0.PjT.addView(xX$PjT0.cr);
        xX$PjT0.JQp = PAGLogoView.createPAGLogoViewByMaterial(this.Zh, this.ReZ);
        FrameLayout.LayoutParams frameLayout$LayoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        frameLayout$LayoutParams3.gravity = 0x800053;
        frameLayout$LayoutParams3.setMargins(v3, v3, v3, v3);
        xX$PjT0.JQp.setLayoutParams(frameLayout$LayoutParams3);
        xX$PjT0.PjT.addView(xX$PjT0.JQp);
        xX$PjT0.cz = new cr(this.Zh);
        int v4 = qZS.Zh(this.Zh, 11.0f);
        FrameLayout.LayoutParams frameLayout$LayoutParams4 = new FrameLayout.LayoutParams(v4, v4);
        frameLayout$LayoutParams4.gravity = 0x800055;
        frameLayout$LayoutParams4.rightMargin = v3;
        frameLayout$LayoutParams4.bottomMargin = v3;
        xX$PjT0.cz.setVisibility(8);
        xX$PjT0.cz.setScaleType(imageView$ScaleType0);
        xX$PjT0.cz.setLayoutParams(frameLayout$LayoutParams4);
        xX$PjT0.PjT.addView(xX$PjT0.cz);
        return xX$PjT0;
    }

    @Override  // x.b$b
    public void d_() {
    }

    @Override  // x.b$b
    public void g_() {
    }

    public long getVideoProgress() {
        return this.gK;
    }

    @Override  // x.b$b
    public void h_() {
    }

    @Override  // x.b$b
    public void i_() {
        ImageView imageView0 = this.xE;
        if(imageView0 != null) {
            imageView0.setVisibility(8);
        }
    }

    public void setAdInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener0) {
        this.ltE = pAGBannerAdWrapperListener0;
    }

    public void setClosedListenerKey(String s) {
        this.ub = s;
    }
}

