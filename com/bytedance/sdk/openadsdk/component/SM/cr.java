package com.bytedance.sdk.openadsdk.component.SM;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path.Direction;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.adexpress.cr.Zh;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.openadsdk.core.JQp.Au;
import com.bytedance.sdk.openadsdk.core.JQp.JQp;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.qla;
import com.bytedance.sdk.openadsdk.core.widget.xE;
import com.bytedance.sdk.openadsdk.utils.DWo;
import com.bytedance.sdk.openadsdk.utils.qZS;

public class cr extends ReZ {
    static final class PjT extends Drawable {
        private static final int JQp;
        private final RectF PjT;
        private final Path ReZ;
        private final Paint Zh;
        private final boolean cr;
        private static final int cz;

        static {
            PjT.JQp = Color.parseColor("#b0000000");
            PjT.cz = Color.parseColor("#40000000");
        }

        public PjT(Context context0) {
            this.PjT = new RectF();
            this.Zh = new Paint();
            this.ReZ = new Path();
            this.cr = Zh.PjT(context0);
        }

        @Override  // android.graphics.drawable.Drawable
        public void draw(@NonNull Canvas canvas0) {
            canvas0.drawPath(this.ReZ, this.Zh);
        }

        @Override  // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override  // android.graphics.drawable.Drawable
        protected void onBoundsChange(@NonNull Rect rect0) {
            super.onBoundsChange(rect0);
            this.PjT.set(rect0);
            this.ReZ.reset();
            int v = rect0.height();
            this.ReZ.addRoundRect(this.PjT, (this.cr ? new float[]{((float)(v / 2)), ((float)(v / 2)), 0.0f, 0.0f, 0.0f, 0.0f, ((float)(v / 2)), ((float)(v / 2))} : new float[]{0.0f, 0.0f, ((float)(v / 2)), ((float)(v / 2)), ((float)(v / 2)), ((float)(v / 2)), 0.0f, 0.0f}), Path.Direction.CW);
            LinearGradient linearGradient0 = new LinearGradient(0.0f, 0.0f, ((float)rect0.right), 0.0f, new int[]{(this.cr ? PjT.cz : PjT.JQp), (this.cr ? PjT.JQp : PjT.cz)}, null, Shader.TileMode.CLAMP);
            this.Zh.setShader(linearGradient0);
        }

        @Override  // android.graphics.drawable.Drawable
        public void setAlpha(int v) {
        }

        @Override  // android.graphics.drawable.Drawable
        public void setColorFilter(@Nullable ColorFilter colorFilter0) {
        }
    }

    private final qla fDm;
    private final Au qla;
    private final JQp ub;
    private final com.bytedance.sdk.openadsdk.core.JQp.cr xE;
    private final com.bytedance.sdk.openadsdk.core.JQp.ReZ xs;

    public cr(Context context0, Owx owx0) {
        super(context0);
        this.setId(0x1F000039);
        this.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.setBackgroundColor(0);
        int v = qZS.Zh(context0, 8.0f);
        int v1 = qZS.Zh(context0, 9.0f);
        int v2 = qZS.Zh(context0, 10.0f);
        int v3 = qZS.Zh(context0, 40.0f);
        com.bytedance.sdk.openadsdk.core.widget.ReZ reZ0 = new com.bytedance.sdk.openadsdk.core.widget.ReZ(context0);
        this.xf = reZ0;
        reZ0.setPadding(v1, 0, v1, 0);
        this.xf.setScaleType(ImageView.ScaleType.FIT_CENTER);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(qZS.Zh(context0, 32.0f), qZS.Zh(context0, 14.0f));
        relativeLayout$LayoutParams0.addRule(12);
        relativeLayout$LayoutParams0.addRule(11);
        relativeLayout$LayoutParams0.setMargins(0, 0, v2, v2);
        this.xf.setLayoutParams(relativeLayout$LayoutParams0);
        com.bytedance.sdk.openadsdk.core.JQp.ReZ reZ1 = new com.bytedance.sdk.openadsdk.core.JQp.ReZ(context0);
        this.xs = reZ1;
        reZ1.setBackgroundColor(-1);
        reZ1.setId(0x1F00003E);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-1, qZS.Zh(context0, 107.0f));
        relativeLayout$LayoutParams1.addRule(12);
        reZ1.setLayoutParams(relativeLayout$LayoutParams1);
        JQp jQp0 = new JQp(context0);
        jQp0.setOrientation(0);
        jQp0.setGravity(16);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-2, -2);
        frameLayout$LayoutParams0.gravity = 17;
        jQp0.setLayoutParams(frameLayout$LayoutParams0);
        reZ1.addView(jQp0);
        xE xE0 = new xE(context0);
        this.cz = xE0;
        xE0.setId(0x1F00003F);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(v3, v3);
        linearLayout$LayoutParams0.rightMargin = v;
        linearLayout$LayoutParams0.setMarginEnd(v);
        this.cz.setLayoutParams(linearLayout$LayoutParams0);
        Au au0 = new Au(context0);
        this.XX = au0;
        au0.setId(0x1F000041);
        this.XX.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        TextUtils.TruncateAt textUtils$TruncateAt0 = TextUtils.TruncateAt.END;
        this.XX.setEllipsize(textUtils$TruncateAt0);
        this.XX.setMaxLines(2);
        this.XX.setTextColor(Color.parseColor("#161823"));
        this.XX.setTextSize(30.0f);
        jQp0.addView(this.cz);
        jQp0.addView(this.XX);
        com.bytedance.sdk.openadsdk.core.JQp.ReZ reZ2 = new com.bytedance.sdk.openadsdk.core.JQp.ReZ(context0);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        relativeLayout$LayoutParams2.addRule(2, reZ1.getId());
        relativeLayout$LayoutParams2.addRule(10);
        reZ2.setLayoutParams(relativeLayout$LayoutParams2);
        com.bytedance.sdk.openadsdk.core.JQp.cr cr0 = new com.bytedance.sdk.openadsdk.core.JQp.cr(context0);
        this.PjT = cr0;
        cr0.setId(0x1F00003A);
        this.PjT.setScaleType(ImageView.ScaleType.CENTER_CROP);
        reZ2.addView(this.PjT, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.JQp.ReZ reZ3 = new com.bytedance.sdk.openadsdk.core.JQp.ReZ(context0);
        this.Zh = reZ3;
        reZ3.setId(0x1F00003B);
        FrameLayout.LayoutParams frameLayout$LayoutParams1 = new FrameLayout.LayoutParams(-1, -1);
        frameLayout$LayoutParams1.gravity = 17;
        reZ2.addView(this.Zh, frameLayout$LayoutParams1);
        com.bytedance.sdk.openadsdk.core.JQp.cr cr1 = new com.bytedance.sdk.openadsdk.core.JQp.cr(context0);
        this.ReZ = cr1;
        cr1.setId(0x1F00003C);
        reZ2.addView(this.ReZ, new FrameLayout.LayoutParams(-1, -1));
        Au au1 = new Au(context0);
        this.JQp = au1;
        au1.setId(0x1F000015);
        this.JQp.setBackground(DWo.PjT(context0, Color.parseColor("#b3000000"), 24));
        this.JQp.setEllipsize(textUtils$TruncateAt0);
        this.JQp.setGravity(17);
        this.JQp.setSingleLine(true);
        this.JQp.setText(Lrd.PjT(context0, "tt_video_download_apk"));
        this.JQp.setTextColor(-1);
        this.JQp.setTextSize(1, 16.0f);
        this.JQp.setTag("open_ad_click_button_tag");
        FrameLayout.LayoutParams frameLayout$LayoutParams2 = new FrameLayout.LayoutParams(qZS.Zh(context0, 236.0f), qZS.Zh(context0, 48.0f));
        frameLayout$LayoutParams2.gravity = 81;
        frameLayout$LayoutParams2.bottomMargin = qZS.Zh(context0, 32.0f);
        reZ2.addView(this.JQp, frameLayout$LayoutParams2);
        JQp jQp1 = new JQp(context0);
        this.ub = jQp1;
        jQp1.setOrientation(0);
        jQp1.setGravity(16);
        jQp1.setBackground(new PjT(context0));
        jQp1.setPadding(qZS.Zh(context0, 16.0f), qZS.Zh(context0, 8.0f), qZS.Zh(context0, 16.0f), qZS.Zh(context0, 8.0f));
        RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams3.addRule(10);
        relativeLayout$LayoutParams3.topMargin = qZS.Zh(context0, 90.0f);
        jQp1.setLayoutParams(relativeLayout$LayoutParams3);
        xE xE1 = new xE(context0);
        this.xE = xE1;
        jQp1.addView(xE1, new LinearLayout.LayoutParams(qZS.Zh(context0, 36.0f), qZS.Zh(context0, 36.0f)));
        JQp jQp2 = new JQp(context0);
        jQp2.setOrientation(1);
        LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-2, -2);
        linearLayout$LayoutParams1.leftMargin = qZS.Zh(context0, 8.0f);
        jQp1.addView(jQp2, linearLayout$LayoutParams1);
        Au au2 = new Au(context0);
        this.qla = au2;
        au2.setTextColor(-1);
        jQp2.addView(au2, new LinearLayout.LayoutParams(-2, -2));
        qla qla0 = new qla(context0, true);
        this.fDm = qla0;
        jQp2.addView(qla0, new LinearLayout.LayoutParams(-2, -2));
        PAGLogoView pAGLogoView0 = PAGLogoView.createPAGLogoViewByMaterial(context0, owx0);
        this.cr = pAGLogoView0;
        pAGLogoView0.setId(0x1F00003D);
        FrameLayout.LayoutParams frameLayout$LayoutParams3 = new FrameLayout.LayoutParams(-2, qZS.Zh(context0, 14.0f));
        frameLayout$LayoutParams3.gravity = 83;
        reZ2.addView(this.cr, frameLayout$LayoutParams3);
        this.addView(reZ2);
        this.addView(this.xf);
        this.addView(reZ1);
        this.addView(this.Au);
        this.addView(jQp1);
    }

    @Override  // com.bytedance.sdk.openadsdk.component.SM.ReZ
    public com.bytedance.sdk.openadsdk.core.JQp.cr getAdIconView() {
        return this.xE;
    }

    @Override  // com.bytedance.sdk.openadsdk.component.SM.ReZ
    public Au getAdTitleTextView() {
        return this.qla;
    }

    @Override  // com.bytedance.sdk.openadsdk.component.SM.ReZ
    public JQp getOverlayLayout() {
        return this.ub;
    }

    @Override  // com.bytedance.sdk.openadsdk.component.SM.ReZ
    public qla getScoreBar() {
        return this.fDm;
    }

    @Override  // com.bytedance.sdk.openadsdk.component.SM.ReZ
    public View getUserInfo() {
        return this.xs;
    }
}

