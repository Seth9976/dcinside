package com.bytedance.sdk.openadsdk.core.ReZ;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils.TruncateAt;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.openadsdk.ReZ.ReZ;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.Au.Au;
import com.bytedance.sdk.openadsdk.core.Au.gK;
import com.bytedance.sdk.openadsdk.core.Au.ltE;
import com.bytedance.sdk.openadsdk.core.Au.ub;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.fDm;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.qj;
import com.bytedance.sdk.openadsdk.core.widget.qla;
import com.bytedance.sdk.openadsdk.core.widget.xE;
import com.bytedance.sdk.openadsdk.core.widget.xf;
import com.bytedance.sdk.openadsdk.core.xf.Zh.cz;
import com.bytedance.sdk.openadsdk.gK.Zh;
import com.bytedance.sdk.openadsdk.utils.DWo;
import com.bytedance.sdk.openadsdk.utils.qZS;
import java.util.List;

public class PjT extends com.bytedance.sdk.openadsdk.core.Au.PjT {
    static class com.bytedance.sdk.openadsdk.core.ReZ.PjT.PjT {
        private qj Au;
        FrameLayout JQp;
        public xf PjT;
        ImageView ReZ;
        TextView XX;
        public TextView Zh;
        qla cr;
        View cz;

        public com.bytedance.sdk.openadsdk.core.ReZ.PjT.PjT(View view0, xf xf0) {
            this.cz = view0;
            this.PjT = xf0;
        }

        public com.bytedance.sdk.openadsdk.core.ReZ.PjT.PjT(ImageView imageView0, View view0, TextView textView0, TextView textView1, qj qj0, qla qla0, FrameLayout frameLayout0) {
            this.ReZ = imageView0;
            this.cz = view0;
            this.XX = textView0;
            this.Zh = textView1;
            this.Au = qj0;
            this.cr = qla0;
            this.JQp = frameLayout0;
        }

        public com.bytedance.sdk.openadsdk.core.ReZ.PjT.PjT(ImageView imageView0, View view0, TextView textView0, TextView textView1, xf xf0, qla qla0, FrameLayout frameLayout0) {
            this.ReZ = imageView0;
            this.cz = view0;
            this.XX = textView0;
            this.Zh = textView1;
            this.PjT = xf0;
            this.cr = qla0;
            this.JQp = frameLayout0;
        }

        com.bytedance.sdk.openadsdk.core.ReZ.PjT.PjT(ImageView imageView0, TextView textView0, qla qla0, View view0, TextView textView1) {
            this.ReZ = imageView0;
            this.Zh = textView0;
            this.cr = qla0;
            this.cz = view0;
            this.XX = textView1;
        }
    }

    public static ub[] PjT;
    private ltE fDm;
    private String qla;
    private PAGBannerAdWrapperListener xE;
    private com.bytedance.sdk.openadsdk.core.ReZ.PjT.PjT xs;

    static {
        PjT.PjT = new ub[]{new ub(1, 6.4f, 320, 50), new ub(4, 1.2f, 300, 0xFA)};
    }

    public PjT(@NonNull Context context0) {
        super(context0);
        this.Zh = context0;
    }

    private com.bytedance.sdk.openadsdk.core.ReZ.PjT.PjT Au() {
        int v = qZS.Zh(this.Zh, 8.0f);
        int v1 = qZS.Zh(this.Zh, 21.0f);
        RelativeLayout relativeLayout0 = new RelativeLayout(this.Zh);
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = new ViewGroup.LayoutParams(-1, -1);
        relativeLayout0.setPadding(v, v, v, v1);
        relativeLayout0.setLayoutParams(viewGroup$LayoutParams0);
        this.addView(relativeLayout0);
        LinearLayout linearLayout0 = new LinearLayout(this.Zh);
        linearLayout0.setId(0x1F000029);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-1, -2);
        relativeLayout$LayoutParams0.addRule(12);
        linearLayout0.setGravity(16);
        linearLayout0.setOrientation(0);
        linearLayout0.setLayoutParams(relativeLayout$LayoutParams0);
        relativeLayout0.addView(linearLayout0);
        xE xE0 = new xE(this.Zh);
        xE0.setId(0x1F00002A);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(qZS.Zh(this.Zh, 52.0f), qZS.Zh(this.Zh, 52.0f));
        xE0.setScaleType(ImageView.ScaleType.FIT_XY);
        xE0.setLayoutParams(linearLayout$LayoutParams0);
        linearLayout0.addView(xE0);
        LinearLayout linearLayout1 = new LinearLayout(this.Zh);
        linearLayout1.setOrientation(1);
        LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(0, -2);
        linearLayout$LayoutParams1.weight = 1.0f;
        linearLayout$LayoutParams1.leftMargin = v;
        linearLayout$LayoutParams1.rightMargin = v;
        linearLayout$LayoutParams1.setMarginStart(v);
        linearLayout$LayoutParams1.setMarginEnd(v);
        linearLayout0.addView(linearLayout1, linearLayout$LayoutParams1);
        TextView textView0 = new TextView(this.Zh);
        textView0.setId(0x1F000022);
        LinearLayout.LayoutParams linearLayout$LayoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        TextUtils.TruncateAt textUtils$TruncateAt0 = TextUtils.TruncateAt.END;
        textView0.setEllipsize(textUtils$TruncateAt0);
        textView0.setMaxLines(1);
        textView0.setTextColor(Color.parseColor("#FF3E3E3E"));
        textView0.setTextSize(16.0f);
        textView0.setLayoutParams(linearLayout$LayoutParams2);
        linearLayout1.addView(textView0);
        qla qla0 = new qla(this.Zh);
        qla0.setId(0x1F000027);
        linearLayout1.addView(qla0, new LinearLayout.LayoutParams(-2, -2));
        TextView textView1 = new TextView(this.Zh);
        textView1.setId(0x1F000007);
        LinearLayout.LayoutParams linearLayout$LayoutParams3 = new LinearLayout.LayoutParams(qZS.Zh(this.Zh, 76.0f), qZS.Zh(this.Zh, 36.0f));
        textView1.setBackground(DWo.PjT(this.Zh, 18));
        textView1.setEllipsize(textUtils$TruncateAt0);
        textView1.setMaxLines(1);
        textView1.setGravity(17);
        textView1.setText(Lrd.PjT(this.Zh, "tt_video_download_apk"));
        textView1.setTextColor(-1);
        textView1.setTextSize(14.0f);
        textView1.setLayoutParams(linearLayout$LayoutParams3);
        linearLayout0.addView(textView1);
        FrameLayout frameLayout0 = new FrameLayout(this.Zh);
        frameLayout0.setLayoutDirection(3);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-1, -1);
        relativeLayout$LayoutParams1.addRule(2, linearLayout0.getId());
        relativeLayout$LayoutParams1.bottomMargin = v1;
        frameLayout0.setLayoutParams(relativeLayout$LayoutParams1);
        relativeLayout0.addView(frameLayout0);
        xf xf0 = new xf(this.Zh);
        xf0.setId(0x1F000028);
        xf0.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-2, -1);
        frameLayout$LayoutParams0.gravity = 17;
        frameLayout0.addView(xf0, frameLayout$LayoutParams0);
        PAGLogoView pAGLogoView0 = PAGLogoView.createPAGLogoViewByMaterial(this.Zh, this.ReZ);
        pAGLogoView0.setId(0x1F00002B);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams2.addRule(10);
        relativeLayout$LayoutParams2.addRule(9);
        relativeLayout$LayoutParams2.setMargins(v, v, 0, 0);
        pAGLogoView0.setLayoutParams(relativeLayout$LayoutParams2);
        relativeLayout0.addView(pAGLogoView0);
        return new com.bytedance.sdk.openadsdk.core.ReZ.PjT.PjT(xE0, pAGLogoView0, textView1, textView0, xf0, qla0, frameLayout0);
    }

    private void JQp() {
        TextView textView2;
        Owx owx0 = this.ReZ;
        if(owx0 != null) {
            int v = owx0.fK();
            if(this.ReZ.MWx() == null) {
                com.bytedance.sdk.openadsdk.core.ReZ.PjT.PjT pjT$PjT0 = this.Au();
                this.xs = pjT$PjT0;
                xf xf0 = pjT$PjT0.PjT;
                ImageView imageView0 = pjT$PjT0.ReZ;
                TextView textView0 = pjT$PjT0.Zh;
                TextView textView1 = pjT$PjT0.XX;
                View view0 = pjT$PjT0.cz;
                if(view0 != null) {
                    view0.setOnClickListener(new View.OnClickListener() {
                        final PjT PjT;

                        @Override  // android.view.View$OnClickListener
                        public void onClick(View view0) {
                            TTWebsiteActivity.PjT(PjT.this.Zh, PjT.this.ReZ, PjT.this.cz);
                        }
                    });
                }
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = xf0.getLayoutParams();
                int v1 = this.Au;
                int v2 = qZS.Zh(this.Zh, 8.0f);
                int v3 = qZS.Zh(this.Zh, 21.0f);
                int v4 = qZS.Zh(this.Zh, 52.0f);
                if(this.XX - qZS.Zh(this.Zh, 8.0f) * 2 >= v1 - v2 - v3 * 2 - v4) {
                    viewGroup$LayoutParams0.width = -2;
                    viewGroup$LayoutParams0.height = -1;
                }
                else {
                    viewGroup$LayoutParams0.width = -1;
                    viewGroup$LayoutParams0.height = -2;
                }
                xf0.setLayoutParams(viewGroup$LayoutParams0);
                if(v == 33) {
                    xf0.setRatio(1.0f);
                }
                else {
                    xf0.setRatio(1.91f);
                }
                List list0 = this.ReZ.CY();
                if(list0 != null && !list0.isEmpty()) {
                    Zh.PjT().PjT(((com.bytedance.sdk.openadsdk.core.model.xE)list0.get(0)), xf0, this.ReZ);
                    Zh.PjT().PjT(((com.bytedance.sdk.openadsdk.core.model.xE)list0.get(0)).PjT(), this.xs.JQp);
                }
                if(this.ReZ.Xe() == null || TextUtils.isEmpty(this.ReZ.Xe().PjT())) {
                    textView2 = textView0;
                }
                else {
                    textView2 = textView0;
                    Zh.PjT().PjT(this.ReZ.Xe().PjT(), this.ReZ.Xe().Zh(), this.ReZ.Xe().ReZ(), imageView0, this.ReZ);
                }
                textView2.setText(this.ReZ.Xtz());
                if(TextUtils.isEmpty(this.ReZ.Nv())) {
                    textView1.setVisibility(8);
                }
                else {
                    textView1.setText(this.ReZ.Nv());
                }
                qZS.PjT(null, this.xs.cr, this.ReZ);
                this.PjT(xf0, true);
                xf0.setTag(0x1F000042, Boolean.TRUE);
                this.PjT(this, true);
                this.PjT(textView1, true);
                return;
            }
            com.bytedance.sdk.openadsdk.core.ReZ.PjT.PjT pjT$PjT1 = this.SM();
            this.xs = pjT$PjT1;
            TextView textView3 = pjT$PjT1.Zh;
            TextView textView4 = pjT$PjT1.XX;
            qj qj0 = pjT$PjT1.Au;
            Zh.PjT().PjT(this.ReZ.MWx().c(), this.xs.JQp);
            View view1 = this.xs.cz;
            if(view1 != null) {
                view1.setOnClickListener(new View.OnClickListener() {
                    final PjT PjT;

                    @Override  // android.view.View$OnClickListener
                    public void onClick(View view0) {
                        TTWebsiteActivity.PjT(PjT.this.Zh, PjT.this.ReZ, PjT.this.cz);
                    }
                });
            }
            ViewGroup.LayoutParams viewGroup$LayoutParams1 = qj0.getLayoutParams();
            if(v == 15) {
                viewGroup$LayoutParams1.width = -2;
                viewGroup$LayoutParams1.height = -1;
                qj0.setLayoutParams(viewGroup$LayoutParams1);
                qj0.setRatio(0.5625f);
            }
            else if(v == 5) {
                viewGroup$LayoutParams1.width = -1;
                viewGroup$LayoutParams1.height = -2;
                qj0.setLayoutParams(viewGroup$LayoutParams1);
                qj0.setRatio(1.777778f);
            }
            else {
                int v5 = this.Au;
                int v6 = qZS.Zh(this.Zh, 8.0f);
                int v7 = qZS.Zh(this.Zh, 21.0f);
                int v8 = qZS.Zh(this.Zh, 52.0f);
                if(this.XX - qZS.Zh(this.Zh, 8.0f) * 2 >= v5 - v6 - v7 * 2 - v8) {
                    viewGroup$LayoutParams1.width = -2;
                    viewGroup$LayoutParams1.height = -1;
                }
                else {
                    viewGroup$LayoutParams1.width = -1;
                    viewGroup$LayoutParams1.height = -2;
                }
                qj0.setLayoutParams(viewGroup$LayoutParams1);
                qj0.setRatio(1.0f);
            }
            qj0.removeAllViews();
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
            cz cz0 = this.getVideoView();
            if(cz0 != null) {
                ltE ltE0 = this.fDm;
                if(ltE0 instanceof gK) {
                    cz0.setVideoAdInteractionListener(((gK)ltE0));
                }
                qj0.addView(cz0, frameLayout$LayoutParams0);
                cz0.setAdCreativeClickListener(new com.bytedance.sdk.openadsdk.core.xf.Zh.cz.PjT() {
                    final PjT PjT;

                    @Override  // com.bytedance.sdk.openadsdk.core.xf.Zh.cz$PjT
                    public void PjT(View view0, int v) {
                        if(PjT.this.xE != null) {
                            PjT.this.xE.onAdClicked();
                        }
                    }
                });
                Au au0 = this.fDm.getClickCreativeListener();
                if(au0 != null) {
                    au0.PjT(cz0.getNativeVideoController());
                }
            }
            if(this.ReZ.Xe() != null && !TextUtils.isEmpty(this.ReZ.Xe().PjT())) {
                Zh.PjT().PjT(this.ReZ.Xe().PjT(), this.ReZ.Xe().Zh(), this.ReZ.Xe().ReZ(), this.xs.ReZ, this.ReZ);
            }
            textView3.setText(this.ReZ.Xtz());
            qZS.PjT(null, this.xs.cr, this.ReZ);
            if(TextUtils.isEmpty(this.ReZ.Nv())) {
                textView4.setVisibility(8);
            }
            else {
                textView4.setText(this.ReZ.Nv());
            }
            this.PjT(cz0, true);
            if(cz0 != null) {
                cz0.setTag(0x1F000042, Boolean.TRUE);
            }
            this.PjT(this, true);
            this.PjT(textView4, true);
            this.PjT(qj0);
        }
    }

    public static ub PjT(int v, int v1) {
        try {
            return ((double)v1) >= Math.floor(((double)v) * 450.0 / 600.0) ? PjT.PjT[1] : PjT.PjT[0];
        }
        catch(Throwable unused_ex) {
            return PjT.PjT[0];
        }
    }

    private void PjT(ub ub0) {
        if(ub0.PjT == 1) {
            this.ReZ();
            return;
        }
        this.JQp();
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.PjT
    public void PjT() {
        TTDislikeDialogAbstract tTDislikeDialogAbstract0 = this.JQp;
        if(tTDislikeDialogAbstract0 != null) {
            tTDislikeDialogAbstract0.show();
            return;
        }
        ReZ reZ0 = this.cr;
        if(reZ0 != null) {
            reZ0.PjT();
            return;
        }
        TTDelegateActivity.PjT(this.ReZ, this.qla);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.Au.PjT
    protected void PjT(View view0, int v, fDm fDm0) {
        ltE ltE0 = this.fDm;
        if(ltE0 != null) {
            ltE0.PjT(view0, v, fDm0);
        }
    }

    void PjT(Owx owx0, ltE ltE0, com.bytedance.sdk.openadsdk.ltE.PjT.PjT.cz cz0) {
        this.setBackgroundColor(-1);
        this.ReZ = owx0;
        this.fDm = ltE0;
        this.cz = "banner_ad";
        ltE0.addView(this, new ViewGroup.LayoutParams(-2, -2));
        this.Zh();
    }

    private void ReZ() {
        qZS.Zh(this.Zh, 50.0f);
        com.bytedance.sdk.openadsdk.core.ReZ.PjT.PjT pjT$PjT0 = this.XX();
        this.xs = pjT$PjT0;
        ImageView imageView0 = pjT$PjT0.ReZ;
        TextView textView0 = pjT$PjT0.Zh;
        qla qla0 = pjT$PjT0.cr;
        TextView textView1 = pjT$PjT0.XX;
        View view0 = pjT$PjT0.cz;
        if(view0 != null) {
            view0.setOnClickListener(new View.OnClickListener() {
                final PjT PjT;

                @Override  // android.view.View$OnClickListener
                public void onClick(View view0) {
                    TTWebsiteActivity.PjT(PjT.this.Zh, PjT.this.ReZ, PjT.this.cz);
                }
            });
        }
        if(this.ReZ.Xe() != null && !TextUtils.isEmpty(this.ReZ.Xe().PjT())) {
            Zh.PjT().PjT(this.ReZ.Xe().PjT(), this.ReZ.Xe().Zh(), this.ReZ.Xe().ReZ(), imageView0, this.ReZ);
        }
        textView0.setText(this.ReZ.Xtz());
        if(TextUtils.isEmpty(this.ReZ.Nv())) {
            textView1.setVisibility(8);
        }
        else {
            textView1.setText(this.ReZ.Nv());
        }
        qZS.PjT(null, qla0, this.ReZ);
        this.PjT(imageView0, true);
        imageView0.setTag(0x1F000042, Boolean.TRUE);
        this.PjT(this, true);
        this.PjT(textView1, true);
    }

    private com.bytedance.sdk.openadsdk.core.ReZ.PjT.PjT SM() {
        int v = qZS.Zh(this.Zh, 8.0f);
        int v1 = qZS.Zh(this.Zh, 21.0f);
        RelativeLayout relativeLayout0 = new RelativeLayout(this.Zh);
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = new ViewGroup.LayoutParams(-1, -1);
        relativeLayout0.setPadding(v, v, v, v1);
        relativeLayout0.setLayoutParams(viewGroup$LayoutParams0);
        this.addView(relativeLayout0);
        LinearLayout linearLayout0 = new LinearLayout(this.Zh);
        linearLayout0.setId(0x1F000029);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-1, -2);
        relativeLayout$LayoutParams0.addRule(12);
        linearLayout0.setGravity(16);
        linearLayout0.setOrientation(0);
        linearLayout0.setLayoutParams(relativeLayout$LayoutParams0);
        relativeLayout0.addView(linearLayout0);
        xE xE0 = new xE(this.Zh);
        xE0.setId(0x1F00002A);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(qZS.Zh(this.Zh, 52.0f), qZS.Zh(this.Zh, 52.0f));
        xE0.setScaleType(ImageView.ScaleType.FIT_XY);
        xE0.setLayoutParams(linearLayout$LayoutParams0);
        linearLayout0.addView(xE0);
        LinearLayout linearLayout1 = new LinearLayout(this.Zh);
        linearLayout1.setOrientation(1);
        LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(0, -2);
        linearLayout$LayoutParams1.weight = 1.0f;
        linearLayout$LayoutParams1.leftMargin = v;
        linearLayout$LayoutParams1.rightMargin = v;
        linearLayout$LayoutParams1.setMarginStart(v);
        linearLayout$LayoutParams1.setMarginEnd(v);
        linearLayout0.addView(linearLayout1, linearLayout$LayoutParams1);
        TextView textView0 = new TextView(this.Zh);
        textView0.setId(0x1F000022);
        LinearLayout.LayoutParams linearLayout$LayoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        TextUtils.TruncateAt textUtils$TruncateAt0 = TextUtils.TruncateAt.END;
        textView0.setEllipsize(textUtils$TruncateAt0);
        textView0.setMaxLines(1);
        textView0.setTextColor(Color.parseColor("#FF3E3E3E"));
        textView0.setTextSize(16.0f);
        textView0.setLayoutParams(linearLayout$LayoutParams2);
        linearLayout1.addView(textView0);
        qla qla0 = new qla(this.Zh);
        qla0.setId(0x1F000027);
        LinearLayout.LayoutParams linearLayout$LayoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        linearLayout$LayoutParams3.topMargin = qZS.Zh(this.Zh, 4.0f);
        linearLayout1.addView(qla0, linearLayout$LayoutParams3);
        TextView textView1 = new TextView(this.Zh);
        textView1.setId(0x1F000007);
        LinearLayout.LayoutParams linearLayout$LayoutParams4 = new LinearLayout.LayoutParams(qZS.Zh(this.Zh, 76.0f), qZS.Zh(this.Zh, 36.0f));
        textView1.setBackground(DWo.PjT(this.Zh, 18));
        textView1.setEllipsize(textUtils$TruncateAt0);
        textView1.setMaxLines(1);
        textView1.setGravity(17);
        textView1.setText(Lrd.PjT(this.Zh, "tt_video_download_apk"));
        textView1.setTextColor(-1);
        textView1.setTextSize(14.0f);
        textView1.setLayoutParams(linearLayout$LayoutParams4);
        linearLayout0.addView(textView1);
        FrameLayout frameLayout0 = new FrameLayout(this.Zh);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-1, -1);
        relativeLayout$LayoutParams1.addRule(2, linearLayout0.getId());
        relativeLayout$LayoutParams1.bottomMargin = v1;
        frameLayout0.setLayoutParams(relativeLayout$LayoutParams1);
        relativeLayout0.addView(frameLayout0);
        qj qj0 = new qj(this.Zh);
        qj0.setId(0x1F000028);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-2, -1);
        frameLayout$LayoutParams0.gravity = 17;
        qj0.setLayoutParams(frameLayout$LayoutParams0);
        frameLayout0.addView(qj0);
        PAGLogoView pAGLogoView0 = PAGLogoView.createPAGLogoViewByMaterial(this.Zh, this.ReZ);
        pAGLogoView0.setId(0x1F00002B);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams2.addRule(10);
        relativeLayout$LayoutParams2.addRule(9);
        relativeLayout$LayoutParams2.setMargins(v, v, 0, 0);
        pAGLogoView0.setLayoutParams(relativeLayout$LayoutParams2);
        relativeLayout0.addView(pAGLogoView0);
        return new com.bytedance.sdk.openadsdk.core.ReZ.PjT.PjT(xE0, pAGLogoView0, textView1, textView0, qj0, qla0, frameLayout0);
    }

    private com.bytedance.sdk.openadsdk.core.ReZ.PjT.PjT XX() {
        int v = qZS.Zh(this.Zh, 38.0f);
        int v1 = (int)(((double)qZS.Zh(this.Zh, 25.0f)) / 5.0);
        int v2 = qZS.Zh(this.Zh, 10.0f);
        int v3 = qZS.Zh(this.Zh, 2.0f);
        int v4 = qZS.Zh(this.Zh, 6.0f);
        int v5 = qZS.Zh(this.Zh, 8.0f);
        RelativeLayout relativeLayout0 = new RelativeLayout(this.Zh);
        this.addView(relativeLayout0, -1, -1);
        xE xE0 = new xE(this.Zh);
        xE0.setId(0x1F00002A);
        TextView textView0 = new TextView(this.Zh);
        textView0.setId(0x1F000022);
        qla qla0 = new qla(this.Zh);
        qla0.setId(0x1F000027);
        PAGLogoView pAGLogoView0 = PAGLogoView.createPAGLogoViewByMaterial(this.Zh, this.ReZ);
        pAGLogoView0.setId(0x1F00002B);
        TextView textView1 = new TextView(this.Zh);
        textView1.setId(0x1F000007);
        com.bytedance.sdk.openadsdk.core.ReZ.PjT.PjT pjT$PjT0 = new com.bytedance.sdk.openadsdk.core.ReZ.PjT.PjT(xE0, textView0, qla0, pAGLogoView0, textView1);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(v, v);
        relativeLayout$LayoutParams0.addRule(15);
        relativeLayout$LayoutParams0.addRule(9);
        relativeLayout$LayoutParams0.addRule(20);
        relativeLayout$LayoutParams0.setMarginStart(v4);
        relativeLayout$LayoutParams0.setMargins(v4, 0, 0, 0);
        xE0.setLayoutParams(relativeLayout$LayoutParams0);
        xE0.setBackgroundColor(-1);
        xE0.setScaleType(ImageView.ScaleType.FIT_XY);
        relativeLayout0.addView(xE0);
        LinearLayout linearLayout0 = new LinearLayout(this.Zh);
        linearLayout0.setOrientation(1);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-1, -2);
        relativeLayout$LayoutParams1.addRule(15);
        relativeLayout$LayoutParams1.addRule(16, textView1.getId());
        relativeLayout$LayoutParams1.addRule(17, xE0.getId());
        relativeLayout$LayoutParams1.setMarginStart(v5);
        relativeLayout$LayoutParams1.setMarginEnd(v5);
        relativeLayout$LayoutParams1.addRule(0, textView1.getId());
        relativeLayout$LayoutParams1.addRule(1, xE0.getId());
        relativeLayout$LayoutParams1.setMargins(v5, 0, v5, 0);
        relativeLayout0.addView(linearLayout0, relativeLayout$LayoutParams1);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
        textView0.setTextDirection(5);
        TextUtils.TruncateAt textUtils$TruncateAt0 = TextUtils.TruncateAt.END;
        textView0.setEllipsize(textUtils$TruncateAt0);
        textView0.setGravity(80);
        textView0.setMaxLines(1);
        textView0.setTextColor(Color.parseColor("#FF333333"));
        textView0.setTextSize(12.0f);
        textView0.setLayoutParams(linearLayout$LayoutParams0);
        linearLayout0.addView(textView0);
        LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-2, -2);
        linearLayout$LayoutParams1.topMargin = v3;
        qla0.setLayoutParams(linearLayout$LayoutParams1);
        linearLayout0.addView(qla0);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams2.addRule(20);
        relativeLayout$LayoutParams2.addRule(9);
        relativeLayout$LayoutParams2.addRule(12);
        pAGLogoView0.setLayoutParams(relativeLayout$LayoutParams2);
        relativeLayout0.addView(pAGLogoView0);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams3.addRule(11);
        relativeLayout$LayoutParams3.addRule(15);
        relativeLayout$LayoutParams3.setMarginEnd(v4);
        relativeLayout$LayoutParams3.addRule(21);
        relativeLayout$LayoutParams3.rightMargin = v4;
        textView1.setBackground(DWo.PjT(this.Zh, 12));
        textView1.setEllipsize(textUtils$TruncateAt0);
        textView1.setGravity(17);
        textView1.setMaxLines(1);
        textView1.setPadding(v2, v1, v2, v1);
        textView1.setText(Lrd.PjT(this.Zh, "tt_video_download_apk"));
        textView1.setTextColor(Color.parseColor("#f0f0f0"));
        textView1.setTextSize(10.0f);
        textView1.setLayoutParams(relativeLayout$LayoutParams3);
        relativeLayout0.addView(textView1);
        return pjT$PjT0;
    }

    private void Zh() {
        ub ub0 = PjT.PjT(this.fDm.getExpectExpressWidth(), this.fDm.getExpectExpressHeight());
        if(this.fDm.getExpectExpressWidth() <= 0 || this.fDm.getExpectExpressHeight() <= 0) {
            int v = qZS.ReZ(this.Zh);
            this.XX = v;
            this.Au = ((float)(((float)v) / ub0.Zh)).intValue();
        }
        else {
            this.XX = qZS.Zh(this.Zh, ((float)this.fDm.getExpectExpressWidth()));
            this.Au = qZS.Zh(this.Zh, ((float)this.fDm.getExpectExpressHeight()));
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
        Owx owx0 = this.ReZ;
        if(owx0 != null) {
            switch(owx0.fK()) {
                case 1010: 
                case 0x3F3: 
                case 0x3F4: {
                    this.cr();
                    break;
                }
                default: {
                    this.PjT(ub0);
                }
            }
        }
    }

    private void cr() {
        com.bytedance.sdk.openadsdk.core.ReZ.PjT.PjT pjT$PjT0 = this.cz();
        this.xs = pjT$PjT0;
        View view0 = pjT$PjT0.cz;
        if(view0 != null) {
            view0.setOnClickListener(new View.OnClickListener() {
                final PjT PjT;

                @Override  // android.view.View$OnClickListener
                public void onClick(View view0) {
                    TTWebsiteActivity.PjT(PjT.this.Zh, PjT.this.ReZ, PjT.this.cz);
                }
            });
        }
        xf xf0 = this.xs.PjT;
        if(xf0 != null) {
            List list0 = this.ReZ.CY();
            if(list0 != null && !list0.isEmpty()) {
                Zh.PjT().PjT(((com.bytedance.sdk.openadsdk.core.model.xE)list0.get(0)), xf0, this.ReZ);
            }
            this.PjT(xf0, true);
            xf0.setTag(0x1F000042, Boolean.TRUE);
        }
    }

    private com.bytedance.sdk.openadsdk.core.ReZ.PjT.PjT cz() {
        int v = qZS.Zh(this.Zh, 8.0f);
        xf xf0 = new xf(this.Zh);
        xf0.setId(0x1F000028);
        xf0.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
        frameLayout$LayoutParams0.gravity = 17;
        this.addView(xf0, frameLayout$LayoutParams0);
        PAGLogoView pAGLogoView0 = PAGLogoView.createPAGLogoViewByMaterial(this.Zh, this.ReZ);
        pAGLogoView0.setId(0x1F00002B);
        FrameLayout.LayoutParams frameLayout$LayoutParams1 = new FrameLayout.LayoutParams(-2, -2);
        frameLayout$LayoutParams1.setMargins(v, v, 0, 0);
        frameLayout$LayoutParams1.gravity = 0x800033;
        pAGLogoView0.setLayoutParams(frameLayout$LayoutParams1);
        this.addView(pAGLogoView0);
        return new com.bytedance.sdk.openadsdk.core.ReZ.PjT.PjT(pAGLogoView0, xf0);
    }

    public void setAdInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener0) {
        this.xE = pAGBannerAdWrapperListener0;
    }

    public void setClosedListenerKey(String s) {
        this.qla = s;
    }
}

