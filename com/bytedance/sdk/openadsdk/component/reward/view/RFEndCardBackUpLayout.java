package com.bytedance.sdk.openadsdk.component.reward.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Path.Direction;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils.TruncateAt;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.activity.cz;
import com.bytedance.sdk.openadsdk.core.JQp.Au;
import com.bytedance.sdk.openadsdk.core.JQp.JQp;
import com.bytedance.sdk.openadsdk.core.JQp.ReZ;
import com.bytedance.sdk.openadsdk.core.JQp.cr;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.RD;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.qla;
import com.bytedance.sdk.openadsdk.core.widget.xE;
import com.bytedance.sdk.openadsdk.gK.Zh;
import com.bytedance.sdk.openadsdk.ltE.PjT.PjT.XX;
import com.bytedance.sdk.openadsdk.utils.DWo;
import com.bytedance.sdk.openadsdk.utils.qZS;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

public class RFEndCardBackUpLayout extends ReZ {
    static final class PjT extends Drawable {
        Path PjT;
        private final int ReZ;
        private final Drawable Zh;

        public PjT(Context context0) {
            this.PjT = new Path();
            this.Zh = Lrd.ReZ(context0, "tt_ad_bg_header_gradient");
            this.ReZ = qZS.Zh(context0, 8.0f);
        }

        @Override  // android.graphics.drawable.Drawable
        public void draw(@NonNull Canvas canvas0) {
            canvas0.clipPath(this.PjT);
            canvas0.drawColor(-1);
            this.Zh.draw(canvas0);
        }

        @Override  // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override  // android.graphics.drawable.Drawable
        public void setAlpha(int v) {
        }

        @Override  // android.graphics.drawable.Drawable
        public void setBounds(int v, int v1, int v2, int v3) {
            super.setBounds(v, v1, v2, v3);
            int v4 = this.Zh.getIntrinsicHeight();
            int v5 = (int)(1.0f * ((float)v2) / ((float)this.Zh.getIntrinsicWidth()) * ((float)v4));
            this.Zh.setBounds(v, v1, v2, v5);
            this.PjT.reset();
            this.PjT.addRoundRect(new RectF(0.0f, 0.0f, ((float)v2), ((float)v3)), ((float)this.ReZ), ((float)this.ReZ), Path.Direction.CCW);
        }

        @Override  // android.graphics.drawable.Drawable
        public void setColorFilter(@Nullable ColorFilter colorFilter0) {
        }
    }

    private static final String TAG = "TTAD.RFEndCardBackUpL";
    private com.bytedance.sdk.openadsdk.component.reward.PjT.PjT adContext;
    private PAGLogoView adLogo;
    private xE ivIcon;
    private boolean mInit;
    private qla rbScore;
    private int shownAdCount;
    private Au tvDesc;
    private Au tvDownload;
    private TextView tvTitle;

    public RFEndCardBackUpLayout(Context context0) {
        super(context0);
        this.setVisibility(8);
        this.setId(com.bytedance.sdk.openadsdk.utils.qla.MN);
    }

    private void bindDescData(Au au0, Owx owx0) {
        if(au0 == null) {
            return;
        }
        String s = owx0.ix();
        if(!TextUtils.isEmpty(s)) {
            au0.setText(s);
        }
    }

    private void bindIconData(cr cr0, Owx owx0) {
        if(cr0 != null && owx0.Xe() != null && !TextUtils.isEmpty(owx0.Xe().PjT())) {
            Zh.PjT().PjT(owx0.Xe(), cr0, owx0);
        }
    }

    private void bindTitleData(TextView textView0, Owx owx0, String s) {
        if(textView0 != null) {
            if(owx0.uQg() != null && false) {
                textView0.setText("");
                return;
            }
            textView0.setText(s);
        }
    }

    public void init(com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0) {
        this.adContext = pjT0;
        if(pjT0.Zh.uvo()) {
            this.initViews();
        }
    }

    private void initData(Owx owx0, Au au0) {
        this.setDownloadButtonData(au0, owx0, -1);
        this.bindIconData(this.ivIcon, owx0);
        qla qla0 = this.rbScore;
        if(qla0 != null) {
            qZS.PjT(null, qla0, owx0);
            if(owx0.uQg() != null) {
                this.rbScore.setVisibility(0);
            }
        }
        if(this.tvTitle != null) {
            if(owx0.uQg() != null && false) {
                this.tvTitle.setText("");
            }
            else if(TextUtils.isEmpty(owx0.Ld())) {
                this.tvTitle.setVisibility(8);
            }
            else {
                this.tvTitle.setText(owx0.Ld());
            }
        }
        if(this.tvDesc != null) {
            String s = owx0.Xtz();
            if(TextUtils.isEmpty(s)) {
                this.tvDesc.setVisibility(8);
            }
            else {
                this.tvDesc.setText(s);
            }
        }
        this.adLogo.setOnClickListener(new View.OnClickListener() {
            final RFEndCardBackUpLayout PjT;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                try {
                    com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0 = RFEndCardBackUpLayout.this.adContext;
                    com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT1 = RFEndCardBackUpLayout.this.adContext;
                    com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT2 = RFEndCardBackUpLayout.this.adContext;
                    TTWebsiteActivity.PjT(pjT0.rds, pjT1.Zh, pjT2.JQp);
                }
                catch(Throwable unused_ex) {
                }
            }
        });
    }

    private void initOneSlotMultipleAdsLayout() {
        Context context0 = this.getContext();
        this.setBackgroundColor(Color.parseColor("#C2FFFFFF"));
        JQp jQp0 = new JQp(context0);
        jQp0.setOrientation(1);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -2);
        frameLayout$LayoutParams0.setMargins(qZS.Zh(context0, 16.0f), 0, qZS.Zh(context0, 16.0f), 0);
        frameLayout$LayoutParams0.gravity = 17;
        this.addView(jQp0, frameLayout$LayoutParams0);
        if(this.adContext.cI == 2) {
            JQp jQp1 = new JQp(context0);
            jQp1.setOrientation(0);
            jQp0.addView(jQp1, new FrameLayout.LayoutParams(-1, -2));
            this.initOneSlotMultipleAdsLayoutLandscape(jQp1, this.shownAdCount);
        }
        else if(this.shownAdCount == 2) {
            this.initOneSlotMultipleAdsLayoutForTwoAdVertical(jQp0);
        }
        else {
            this.initOneSlotMultipleAdsLayoutForThreeAdVertical(jQp0);
        }
        PAGLogoView pAGLogoView0 = PAGLogoView.createPAGLogoViewByMaterial(this.adContext.rds, this.adContext.Zh);
        pAGLogoView0.setId(0x1F00003D);
        jQp0.addView(pAGLogoView0);
        pAGLogoView0.setOnClickListener(new View.OnClickListener() {
            final RFEndCardBackUpLayout PjT;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                TTWebsiteActivity.PjT(RFEndCardBackUpLayout.this.adContext.rds, RFEndCardBackUpLayout.this.adContext.Zh, RFEndCardBackUpLayout.this.adContext.JQp);
            }
        });
    }

    private void initOneSlotMultipleAdsLayoutForThreeAdVertical(JQp jQp0) {
        Owx owx0 = this.adContext.Zh;
        if(owx0 instanceof RD) {
            List list0 = ((RD)owx0).MD().cr();
            for(int v = 0; v < list0.size() && v < 3; ++v) {
                this.initSingleCardInThreeCardStyle(jQp0, ((Owx)list0.get(v)), v);
            }
        }
    }

    private void initOneSlotMultipleAdsLayoutForTwoAdVertical(JQp jQp0) {
        Owx owx0 = this.adContext.Zh;
        if(owx0 instanceof RD) {
            List list0 = ((RD)owx0).MD().cr();
            for(int v = 0; v < list0.size() && v < 2; ++v) {
                this.initSingleCardInTwoCardStyle(jQp0, ((Owx)list0.get(v)), v);
            }
        }
    }

    private void initOneSlotMultipleAdsLayoutLandscape(JQp jQp0, int v) {
        Owx owx0 = this.adContext.Zh;
        if(owx0 instanceof RD) {
            List list0 = ((RD)owx0).MD().cr();
            for(int v1 = 0; v1 < list0.size() && v1 < v && v1 < 3; ++v1) {
                this.initSingleCardInTwoCardStyleLandscape(jQp0, ((Owx)list0.get(v1)), v1, v);
            }
        }
    }

    private void initSingleCardInThreeCardStyle(JQp jQp0, Owx owx0, int v) {
        Context context0 = this.getContext();
        JQp jQp1 = new JQp(context0);
        jQp1.setOrientation(1);
        jQp1.setGravity(1);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -2);
        frameLayout$LayoutParams0.setMargins(0, (v <= 0 ? 0 : qZS.Zh(context0, 12.0f)), 0, 0);
        jQp1.setBackground(new PjT(context0));
        jQp0.addView(jQp1, frameLayout$LayoutParams0);
        JQp jQp2 = new JQp(context0);
        jQp2.setOrientation(0);
        jQp2.setGravity(16);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout$LayoutParams0.topMargin = qZS.Zh(context0, 20.0f);
        linearLayout$LayoutParams0.leftMargin = qZS.Zh(context0, 17.0f);
        linearLayout$LayoutParams0.rightMargin = qZS.Zh(context0, 30.0f);
        jQp1.addView(jQp2, linearLayout$LayoutParams0);
        xE xE0 = new xE(context0);
        jQp2.addView(xE0, new FrameLayout.LayoutParams(qZS.Zh(context0, 70.0f), qZS.Zh(context0, 63.0f)));
        this.bindIconData(xE0, owx0);
        JQp jQp3 = new JQp(context0);
        jQp3.setOrientation(1);
        LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout$LayoutParams1.leftMargin = qZS.Zh(context0, 7.0f);
        jQp2.addView(jQp3, linearLayout$LayoutParams1);
        Au au0 = new Au(context0);
        au0.setSingleLine(true);
        TextUtils.TruncateAt textUtils$TruncateAt0 = TextUtils.TruncateAt.END;
        au0.setEllipsize(textUtils$TruncateAt0);
        au0.setTextSize(18.0f);
        au0.setTextColor(Color.parseColor("#161823"));
        au0.setGravity(0x800003);
        au0.setTypeface(null, 1);
        jQp3.addView(au0, new FrameLayout.LayoutParams(-1, -2));
        this.bindTitleData(au0, owx0, owx0.Ld());
        Au au1 = new Au(context0);
        au1.setSingleLine(true);
        au1.setEllipsize(textUtils$TruncateAt0);
        au1.setTextSize(16.0f);
        au1.setTextColor(Color.parseColor("#80161823"));
        jQp3.addView(au1, new FrameLayout.LayoutParams(-1, -2));
        this.bindDescData(au1, owx0);
        JQp jQp4 = new JQp(context0);
        jQp4.setOrientation(0);
        jQp4.setGravity(16);
        jQp3.addView(jQp4, new FrameLayout.LayoutParams(-2, -2));
        Au au2 = new Au(context0);
        au2.setTextSize(16.0f);
        au2.setTextColor(Color.parseColor("#80161823"));
        jQp4.addView(au2, new ViewGroup.LayoutParams(-2, -2));
        qla qla0 = new qla(context0);
        LinearLayout.LayoutParams linearLayout$LayoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        linearLayout$LayoutParams2.leftMargin = qZS.Zh(context0, 8.0f);
        jQp4.addView(qla0, linearLayout$LayoutParams2);
        qZS.PjT(au2, qla0, owx0, 18);
        Au au3 = new Au(context0);
        au3.setGravity(17);
        au3.setId(0x1F00000B);
        au3.setText(Lrd.PjT(context0, "tt_video_download_apk"));
        au3.setTextColor(-1);
        au3.setTextSize(2, 16.0f);
        au3.setBackground(DWo.PjT(context0, "tt_reward_full_video_backup_btn_bg"));
        FrameLayout.LayoutParams frameLayout$LayoutParams1 = new FrameLayout.LayoutParams(-1, qZS.Zh(context0, 36.0f));
        frameLayout$LayoutParams1.setMargins(qZS.Zh(context0, 20.0f), qZS.Zh(context0, 22.0f), qZS.Zh(context0, 20.0f), qZS.Zh(context0, 20.0f));
        jQp1.addView(au3, frameLayout$LayoutParams1);
        this.setDownloadButtonData(au3, owx0, v);
    }

    private void initSingleCardInTwoCardStyle(JQp jQp0, Owx owx0, int v) {
        Context context0 = this.getContext();
        JQp jQp1 = new JQp(context0);
        jQp1.setOrientation(1);
        jQp1.setGravity(1);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -2);
        frameLayout$LayoutParams0.setMargins(0, (v <= 0 ? 0 : qZS.Zh(context0, 12.0f)), 0, 0);
        jQp1.setBackground(new PjT(context0));
        jQp0.addView(jQp1, frameLayout$LayoutParams0);
        xE xE0 = new xE(context0);
        FrameLayout.LayoutParams frameLayout$LayoutParams1 = new FrameLayout.LayoutParams(qZS.Zh(context0, 70.0f), qZS.Zh(context0, 63.0f));
        frameLayout$LayoutParams1.setMargins(0, qZS.Zh(context0, 24.0f), 0, qZS.Zh(context0, 12.0f));
        jQp1.addView(xE0, frameLayout$LayoutParams1);
        this.bindIconData(xE0, owx0);
        Au au0 = new Au(context0);
        au0.setSingleLine(true);
        TextUtils.TruncateAt textUtils$TruncateAt0 = TextUtils.TruncateAt.END;
        au0.setEllipsize(textUtils$TruncateAt0);
        au0.setTextSize(18.0f);
        au0.setTextColor(Color.parseColor("#161823"));
        au0.setGravity(17);
        au0.setTypeface(null, 1);
        FrameLayout.LayoutParams frameLayout$LayoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        frameLayout$LayoutParams2.setMargins(qZS.Zh(context0, 56.0f), 0, qZS.Zh(context0, 56.0f), 0);
        jQp1.addView(au0, frameLayout$LayoutParams2);
        this.bindTitleData(au0, owx0, owx0.Ld());
        Au au1 = new Au(context0);
        au1.setSingleLine(true);
        au1.setEllipsize(textUtils$TruncateAt0);
        au1.setTextSize(16.0f);
        au1.setTextColor(Color.parseColor("#80161823"));
        FrameLayout.LayoutParams frameLayout$LayoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        frameLayout$LayoutParams3.setMargins(qZS.Zh(context0, 56.0f), qZS.Zh(context0, 4.0f), qZS.Zh(context0, 56.0f), 0);
        jQp1.addView(au1, frameLayout$LayoutParams3);
        this.bindDescData(au1, owx0);
        JQp jQp2 = new JQp(context0);
        jQp2.setOrientation(0);
        jQp2.setGravity(16);
        jQp1.addView(jQp2, new FrameLayout.LayoutParams(-2, -2));
        Au au2 = new Au(context0);
        au2.setTextSize(16.0f);
        au2.setTextColor(Color.parseColor("#80161823"));
        jQp2.addView(au2, new ViewGroup.LayoutParams(-2, -2));
        qla qla0 = new qla(context0);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-2, -2);
        linearLayout$LayoutParams0.leftMargin = qZS.Zh(context0, 8.0f);
        jQp2.addView(qla0, linearLayout$LayoutParams0);
        qZS.PjT(au2, qla0, owx0, 18);
        Au au3 = new Au(context0);
        au3.setGravity(17);
        au3.setId(0x1F00000B);
        au3.setText(Lrd.PjT(context0, "tt_video_download_apk"));
        au3.setTextColor(-1);
        au3.setTextSize(2, 16.0f);
        au3.setBackground(DWo.PjT(context0, "tt_reward_full_video_backup_btn_bg"));
        FrameLayout.LayoutParams frameLayout$LayoutParams4 = new FrameLayout.LayoutParams(-1, qZS.Zh(context0, 36.0f));
        frameLayout$LayoutParams4.setMargins(qZS.Zh(context0, 20.0f), qZS.Zh(context0, 36.0f), qZS.Zh(context0, 20.0f), qZS.Zh(context0, 20.0f));
        jQp1.addView(au3, frameLayout$LayoutParams4);
        this.setDownloadButtonData(au3, owx0, v);
    }

    private void initSingleCardInTwoCardStyleLandscape(JQp jQp0, Owx owx0, int v, int v1) {
        Context context0 = this.getContext();
        JQp jQp1 = new JQp(context0);
        jQp1.setOrientation(1);
        jQp1.setGravity(1);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(0, -2);
        linearLayout$LayoutParams0.weight = 1.0f;
        if(v > 0) {
            linearLayout$LayoutParams0.setMargins(qZS.Zh(context0, 12.0f), 0, 0, 0);
        }
        jQp1.setBackground(new PjT(context0));
        jQp0.addView(jQp1, linearLayout$LayoutParams0);
        JQp jQp2 = new JQp(context0);
        jQp2.setOrientation(0);
        jQp2.setGravity(0x30);
        LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout$LayoutParams1.topMargin = qZS.Zh(context0, 20.0f);
        linearLayout$LayoutParams1.leftMargin = qZS.Zh(context0, 17.0f);
        linearLayout$LayoutParams1.rightMargin = qZS.Zh(context0, 30.0f);
        jQp1.addView(jQp2, linearLayout$LayoutParams1);
        xE xE0 = new xE(context0);
        jQp2.addView(xE0, new FrameLayout.LayoutParams(qZS.Zh(context0, 44.0f), qZS.Zh(context0, 44.0f)));
        this.bindIconData(xE0, owx0);
        JQp jQp3 = new JQp(context0);
        jQp3.setOrientation(1);
        LinearLayout.LayoutParams linearLayout$LayoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout$LayoutParams2.leftMargin = qZS.Zh(context0, 7.0f);
        jQp2.addView(jQp3, linearLayout$LayoutParams2);
        Au au0 = new Au(context0);
        au0.setSingleLine(true);
        TextUtils.TruncateAt textUtils$TruncateAt0 = TextUtils.TruncateAt.END;
        au0.setEllipsize(textUtils$TruncateAt0);
        au0.setTextSize(18.0f);
        au0.setTextColor(Color.parseColor("#161823"));
        au0.setGravity(0x800003);
        au0.setTypeface(null, 1);
        jQp3.addView(au0, new FrameLayout.LayoutParams(-1, -2));
        this.bindTitleData(au0, owx0, owx0.Ld());
        JQp jQp4 = new JQp(context0);
        jQp4.setOrientation(0);
        jQp4.setGravity(16);
        jQp3.addView(jQp4, new FrameLayout.LayoutParams(-2, -2));
        Au au1 = new Au(context0);
        au1.setTextSize(16.0f);
        au1.setTextColor(Color.parseColor("#80161823"));
        jQp4.addView(au1, new ViewGroup.LayoutParams(-2, -2));
        qla qla0 = new qla(context0);
        LinearLayout.LayoutParams linearLayout$LayoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        linearLayout$LayoutParams3.leftMargin = qZS.Zh(context0, 8.0f);
        jQp4.addView(qla0, linearLayout$LayoutParams3);
        qZS.PjT(au1, qla0, owx0, 18);
        Au au2 = new Au(context0);
        if(v1 == 2) {
            au2.setSingleLine(true);
        }
        else {
            au2.setLines(2);
        }
        au2.setEllipsize(textUtils$TruncateAt0);
        au2.setTextSize(16.0f);
        au2.setTextColor(Color.parseColor("#80161823"));
        LinearLayout.LayoutParams linearLayout$LayoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout$LayoutParams4.rightMargin = linearLayout$LayoutParams1.leftMargin;
        linearLayout$LayoutParams4.leftMargin = linearLayout$LayoutParams1.leftMargin;
        linearLayout$LayoutParams4.topMargin = qZS.Zh(context0, 12.0f);
        jQp1.addView(au2, linearLayout$LayoutParams4);
        this.bindDescData(au2, owx0);
        Au au3 = new Au(context0);
        au3.setGravity(17);
        au3.setId(0x1F00000B);
        au3.setText(Lrd.PjT(context0, "tt_video_download_apk"));
        au3.setTextColor(-1);
        au3.setTextSize(2, 16.0f);
        au3.setBackground(DWo.PjT(context0, "tt_reward_full_video_backup_btn_bg"));
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, qZS.Zh(context0, 36.0f));
        frameLayout$LayoutParams0.setMargins(qZS.Zh(context0, 20.0f), qZS.Zh(context0, 22.0f), qZS.Zh(context0, 20.0f), qZS.Zh(context0, 20.0f));
        jQp1.addView(au3, frameLayout$LayoutParams0);
        this.setDownloadButtonData(au3, owx0, v);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void initViews() {
        if(this.mInit) {
            return;
        }
        this.mInit = true;
        if(this.adContext.Zh.fd()) {
            cz cz0 = this.adContext.hN;
            if(cz0 != null && cz0.Lrd() && this.shownAdCount > 1) {
                this.initOneSlotMultipleAdsLayout();
                return;
            }
        }
        Owx owx0 = this.adContext.Zh;
        if(owx0.uvo()) {
            this.initViewsForVast();
            return;
        }
        this.initViewsDefault();
        this.initData(owx0, this.tvDownload);
    }

    private void initViewsDefault() {
        Context context0 = this.getContext();
        boolean z = this.adContext.Zh.jK() == 1;
        this.setBackgroundColor(0xFF000000);
        JQp jQp0 = new JQp(context0);
        jQp0.setGravity(1);
        jQp0.setOrientation(1);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = z ? new FrameLayout.LayoutParams(-1, -2) : new FrameLayout.LayoutParams(qZS.Zh(context0, 327.0f), -2);
        frameLayout$LayoutParams0.gravity = 17;
        int v = qZS.Zh(context0, 24.0f);
        frameLayout$LayoutParams0.rightMargin = v;
        frameLayout$LayoutParams0.leftMargin = v;
        this.addView(jQp0, frameLayout$LayoutParams0);
        xE xE0 = new xE(context0);
        this.ivIcon = xE0;
        xE0.setBackgroundColor(0);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(qZS.Zh(context0, 80.0f), qZS.Zh(context0, 80.0f));
        linearLayout$LayoutParams0.bottomMargin = qZS.Zh(context0, 12.0f);
        jQp0.addView(this.ivIcon, linearLayout$LayoutParams0);
        Au au0 = new Au(context0);
        this.tvTitle = au0;
        TextUtils.TruncateAt textUtils$TruncateAt0 = TextUtils.TruncateAt.END;
        au0.setEllipsize(textUtils$TruncateAt0);
        this.tvTitle.setGravity(17);
        this.tvTitle.setMaxLines(2);
        this.tvTitle.setMaxWidth(qZS.Zh(context0, 180.0f));
        this.tvTitle.setTextColor(-1);
        this.tvTitle.setTextSize(2, 24.0f);
        LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-1, -2);
        jQp0.addView(this.tvTitle, linearLayout$LayoutParams1);
        Au au1 = new Au(context0);
        this.tvDesc = au1;
        au1.setEllipsize(textUtils$TruncateAt0);
        this.tvDesc.setGravity(17);
        this.tvDesc.setMaxLines(2);
        this.tvDesc.setTextColor(Color.parseColor("#BFFFFFFF"));
        this.tvDesc.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams linearLayout$LayoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout$LayoutParams2.topMargin = qZS.Zh(context0, 8.0f);
        jQp0.addView(this.tvDesc, linearLayout$LayoutParams2);
        this.rbScore = new qla(context0, true);
        LinearLayout.LayoutParams linearLayout$LayoutParams3 = new LinearLayout.LayoutParams(-2, qZS.Zh(context0, 16.0f));
        linearLayout$LayoutParams3.topMargin = qZS.Zh(context0, 12.0f);
        this.rbScore.setVisibility(8);
        jQp0.addView(this.rbScore, linearLayout$LayoutParams3);
        Au au2 = new Au(context0);
        this.tvDownload = au2;
        au2.setId(0x1F00000B);
        this.tvDownload.setGravity(17);
        this.tvDownload.setText(Lrd.PjT(context0, "tt_video_download_apk"));
        this.tvDownload.setTextColor(-1);
        this.tvDownload.setTextSize(2, 16.0f);
        this.tvDownload.setBackground(DWo.PjT(context0, "tt_reward_full_video_backup_btn_bg"));
        LinearLayout.LayoutParams linearLayout$LayoutParams4 = new LinearLayout.LayoutParams(-1, qZS.Zh(context0, 44.0f));
        linearLayout$LayoutParams4.topMargin = qZS.Zh(context0, 54.0f);
        jQp0.addView(this.tvDownload, linearLayout$LayoutParams4);
        this.adLogo = PAGLogoView.createPAGLogoViewByMaterial(context0, this.adContext.Zh);
        FrameLayout.LayoutParams frameLayout$LayoutParams1 = new FrameLayout.LayoutParams(-2, qZS.Zh(context0, 14.0f));
        frameLayout$LayoutParams1.gravity = 0x800053;
        frameLayout$LayoutParams1.leftMargin = qZS.Zh(context0, 18.0f);
        frameLayout$LayoutParams1.bottomMargin = z ? qZS.Zh(context0, 61.0f) : qZS.Zh(context0, 24.0f);
        this.addView(this.adLogo, frameLayout$LayoutParams1);
    }

    private void initViewsForVast() {
        Context context0 = this.getContext();
        this.setBackgroundColor(0xFF000000);
        cr cr0 = new cr(context0);
        cr0.setId(com.bytedance.sdk.openadsdk.utils.qla.Au);
        cr0.setVisibility(8);
        this.addView(cr0, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.component.SM.cz cz0 = new com.bytedance.sdk.component.SM.cz(context0, true);
        cz0.setVisibility(8);
        cz0.setId(com.bytedance.sdk.openadsdk.utils.qla.SM);
        this.addView(cz0, new FrameLayout.LayoutParams(-1, -1));
    }

    private void setDownloadButtonData(Au au0, Owx owx0, int v) {
        com.bytedance.sdk.openadsdk.core.Zh.JQp jQp0 = this.adContext.Yo.PjT(this.adContext, owx0);
        jQp0.PjT(XX.PjT(this.adContext.rds, owx0, this.adContext.JQp));
        if(v != -1) {
            HashMap hashMap0 = new HashMap();
            hashMap0.put("ad_show_order", ((int)(v + 1)));
            try {
                JSONObject jSONObject0 = new JSONObject();
                jSONObject0.put("ad_show_order", v + 1);
                hashMap0.put("pag_json_data", jSONObject0.toString());
            }
            catch(Throwable unused_ex) {
            }
            jQp0.PjT(hashMap0);
        }
        au0.setOnClickListener(jQp0);
        au0.setOnTouchListener(jQp0);
        String s = owx0.Nv();
        if(!TextUtils.isEmpty(s)) {
            au0.setText(s);
        }
    }

    public void setShownAdCount(int v) {
        this.shownAdCount = v;
    }

    @Override  // android.view.View
    public void setVisibility(int v) {
        super.setVisibility(v);
        if(v == 0) {
            this.initViews();
        }
    }
}

