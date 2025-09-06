package com.bytedance.adsdk.ugeno.SM.cr;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import com.bumptech.glide.load.resource.drawable.a;
import com.bytedance.adsdk.ugeno.JQp;
import com.bytedance.adsdk.ugeno.XX.Au;
import com.bytedance.adsdk.ugeno.XX.cr;

public class ReZ extends com.bytedance.adsdk.ugeno.Zh.ReZ {
    protected ImageView.ScaleType OL;
    protected String PjT;
    private float ZsT;
    private int dDm;
    protected boolean jp;
    private float oMU;

    public ReZ(Context context0) {
        super(context0);
        this.OL = ImageView.ScaleType.FIT_XY;
        this.dDm = -1;
        this.oMU = -1.0f;
        this.ZsT = -1.0f;
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.ReZ
    public void Au() {
        super.Au();
        Drawable drawable0 = ((PjT)this.JQp).getDrawable();
        if(Build.VERSION.SDK_INT >= 28 && a.a(drawable0)) {
            ((AnimatedImageDrawable)drawable0).stop();
        }
    }

    public void Au(String s) {
        this.PjT = s;
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.ReZ
    public View PjT() {
        return this.ReZ();
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.ReZ
    public void PjT(String s, String s1) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        super.PjT(s, s1);
        s.hashCode();
        switch(s) {
            case "imageBgBlur": {
                this.ZsT = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, -1.0f);
                return;
            }
            case "imageBlur": {
                this.oMU = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, -1.0f);
                return;
            }
            case "isBgGaussianBlur": {
                this.jp = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, false);
                return;
            }
            case "scaleMode": 
            case "scaleType": {
                this.OL = this.XX(s1);
                return;
            }
            case "src": {
                this.PjT = s1;
                return;
            }
            case "tintColor": {
                this.dDm = com.bytedance.adsdk.ugeno.XX.PjT.PjT(s1);
            }
        }
    }

    public PjT ReZ() {
        PjT pjT0 = new PjT(this.Zh);
        pjT0.PjT(this);
        return pjT0;
    }

    private void SM() {
        if(this.oMU > 0.0f) {
            JQp.PjT().Zh().PjT(this.SM, this.PjT, new com.bytedance.adsdk.ugeno.PjT.PjT() {
                final ReZ PjT;

                @Override  // com.bytedance.adsdk.ugeno.PjT$PjT
                public void PjT(Bitmap bitmap0) {
                    if(bitmap0 == null) {
                        return;
                    }
                    Bitmap bitmap1 = Au.PjT(ReZ.this.Zh, bitmap0, ((int)ReZ.this.oMU));
                    if(bitmap1 != null) {
                        Au.PjT(new Runnable() {
                            final com.bytedance.adsdk.ugeno.SM.cr.ReZ.1 Zh;

                            @Override
                            public void run() {
                                ((PjT)ReZ.this.JQp).setImageBitmap(bitmap1);
                            }
                        });
                    }
                    if(ReZ.this.jp || ReZ.this.ZsT > 0.0f) {
                        Bitmap bitmap2 = Au.PjT(ReZ.this.Zh, bitmap0, (ReZ.this.ZsT > 0.0f ? ((int)ReZ.this.ZsT) : 10));
                        if(bitmap2 != null) {
                            Au.PjT(new Runnable() {
                                final com.bytedance.adsdk.ugeno.SM.cr.ReZ.1 Zh;

                                @Override
                                public void run() {
                                    ((PjT)ReZ.this.JQp).setBackground(new BitmapDrawable(ReZ.this.Zh.getResources(), bitmap2));
                                }
                            });
                        }
                    }
                }
            });
            return;
        }
        JQp.PjT().Zh().PjT(this.SM, this.PjT, ((ImageView)this.JQp), ((PjT)this.JQp).getWidth(), ((PjT)this.JQp).getHeight());
        if(this.jp || this.ZsT > 0.0f) {
            JQp.PjT().Zh().PjT(this.SM, this.PjT, new com.bytedance.adsdk.ugeno.PjT.PjT() {
                final ReZ PjT;

                @Override  // com.bytedance.adsdk.ugeno.PjT$PjT
                public void PjT(Bitmap bitmap0) {
                    if(bitmap0 == null) {
                        return;
                    }
                    Au.PjT(new Runnable() {
                        final com.bytedance.adsdk.ugeno.SM.cr.ReZ.2 Zh;

                        @Override
                        public void run() {
                            if(Au.PjT(ReZ.this.Zh, bitmap0, (ReZ.this.ZsT > 0.0f ? ((int)ReZ.this.ZsT) : 10)) != null) {
                                BitmapDrawable bitmapDrawable0 = new BitmapDrawable(ReZ.this.Zh.getResources(), Au.PjT(ReZ.this.Zh, bitmap0, (ReZ.this.ZsT > 0.0f ? ((int)ReZ.this.ZsT) : 10)));
                                ((PjT)ReZ.this.JQp).setBackground(bitmapDrawable0);
                            }
                        }
                    });
                }
            });
        }
    }

    private ImageView.ScaleType XX(String s) {
        ImageView.ScaleType imageView$ScaleType0 = ImageView.ScaleType.FIT_XY;
        s.hashCode();
        switch(s) {
            case "center": {
                return ImageView.ScaleType.CENTER;
            }
            case "centerCrop": {
                return ImageView.ScaleType.CENTER_CROP;
            }
            case "centerInside": {
                return ImageView.ScaleType.CENTER_INSIDE;
            }
            case "crop": {
                return ImageView.ScaleType.CENTER_CROP;
            }
            case "fill": {
                return imageView$ScaleType0;
            }
            case "fit": {
                return ImageView.ScaleType.FIT_CENTER;
            }
            case "fitCenter": {
                return ImageView.ScaleType.FIT_CENTER;
            }
            case "fitEnd": {
                return ImageView.ScaleType.FIT_END;
            }
            case "fitStart": {
                return ImageView.ScaleType.FIT_START;
            }
            case "fitXY": {
                return imageView$ScaleType0;
            }
            default: {
                return imageView$ScaleType0;
            }
        }
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.ReZ
    public void XX() {
        super.XX();
        ((PjT)this.JQp).post(new Runnable() {
            final ReZ PjT;

            @Override
            public void run() {
                Drawable drawable0 = ((PjT)ReZ.this.JQp).getDrawable();
                if(Build.VERSION.SDK_INT >= 28 && a.a(drawable0)) {
                    ((AnimatedImageDrawable)drawable0).start();
                }
            }
        });
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.ReZ
    public void Zh() {
        super.Zh();
        this.cr();
        ((PjT)this.JQp).setScaleType(this.OL);
        ((PjT)this.JQp).setBorderColor(this.Xe);
        ((PjT)this.JQp).setCornerRadius(this.VY);
        ((PjT)this.JQp).setBorderWidth(this.zZ);
        int v = this.dDm;
        if(v != -1) {
            ((PjT)this.JQp).setColorFilter(v);
        }
    }

    private void cr() {
        if(TextUtils.isEmpty(this.PjT)) {
            return;
        }
        ((PjT)this.JQp).setImageDrawable(null);
        if(this.PjT.startsWith("local://")) {
            try {
                ((PjT)this.JQp).setImageResource(cr.PjT(this.Zh, this.PjT.replace("local://", "")));
            }
            catch(Throwable unused_ex) {
            }
            return;
        }
        if(this.PjT.startsWith("@")) {
            try {
                int v = Integer.parseInt(this.PjT.substring(1));
                ((PjT)this.JQp).setImageResource(v);
            }
            catch(Exception unused_ex) {
            }
            return;
        }
        this.SM();
    }
}

