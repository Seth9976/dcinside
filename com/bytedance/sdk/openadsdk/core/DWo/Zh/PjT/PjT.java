package com.bytedance.sdk.openadsdk.core.DWo.Zh.PjT;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView.ScaleType;
import com.bytedance.adsdk.Zh.DWo;
import com.bytedance.adsdk.Zh.cr;
import com.bytedance.adsdk.ugeno.JQp;
import com.bytedance.adsdk.ugeno.XX.Au;
import com.bytedance.adsdk.ugeno.Zh.ReZ;
import java.util.HashMap;

public class PjT extends ReZ {
    private int Gr;
    private float Lx;
    protected HashMap OL;
    protected String PjT;
    private boolean ZsT;
    protected ImageView.ScaleType dDm;
    private boolean fU;
    protected ImageView.ScaleType jp;
    @Deprecated
    private boolean kWj;
    private String oMU;
    private float uvo;

    public PjT(Context context0) {
        super(context0);
        this.oMU = "images";
        this.uvo = 1.0f;
        this.jp = ImageView.ScaleType.FIT_CENTER;
        this.dDm = ImageView.ScaleType.FIT_XY;
        this.OL = new HashMap();
    }

    private ImageView.ScaleType Au(String s) {
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
            case "autoPlay": {
                this.fU = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, false);
                return;
            }
            case "autoReverse": {
                this.ZsT = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, false);
                return;
            }
            case "autoplay": {
                this.fU = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, true);
                return;
            }
            case "imagePath": {
                this.oMU = s1;
                return;
            }
            case "loop": {
                if(this.Qf()) {
                    this.Gr = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, 0);
                    return;
                }
                this.kWj = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, false);
                return;
            }
            case "progress": {
                this.Lx = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, 0.0f);
                return;
            }
            case "scaleMode": {
                this.dDm = this.SM(s1);
                return;
            }
            case "scaleType": {
                this.jp = this.Au(s1);
                return;
            }
            case "speed": {
                this.uvo = com.bytedance.adsdk.ugeno.XX.ReZ.PjT(s1, 1.0f);
                return;
            }
            case "src": {
                this.PjT = s1;
            }
        }
    }

    public Zh ReZ() {
        Zh zh0 = new Zh(this.Zh);
        zh0.PjT(this);
        return zh0;
    }

    private ImageView.ScaleType SM(String s) {
        ImageView.ScaleType imageView$ScaleType0 = ImageView.ScaleType.FIT_XY;
        s.hashCode();
        switch(s) {
            case "center": {
                return ImageView.ScaleType.CENTER;
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
            case "none": {
                return ImageView.ScaleType.CENTER;
            }
            default: {
                return imageView$ScaleType0;
            }
        }
    }

    private String XX(String s) {
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        if(!s.contains("local")) {
            return "";
        }
        if(s.contains("shake_phone")) {
            return "lottie_json/shake_phone.json";
        }
        return s.contains("swipe_right") ? "lottie_json/swipe_right.json" : "";
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.ReZ
    public void Zh() {
        super.Zh();
        ((Zh)this.JQp).setProgress(this.Lx);
        if(this.uvo <= 0.0f) {
            this.uvo = 1.0f;
        }
        ((Zh)this.JQp).setSpeed(this.uvo);
        if(this.PjT.startsWith("local")) {
            String s = this.XX(this.PjT);
            ((Zh)this.JQp).setAnimation(s);
            ((Zh)this.JQp).setImageAssetsFolder(this.oMU);
        }
        else {
            ((Zh)this.JQp).setAnimationFromUrl(this.PjT);
        }
        ((Zh)this.JQp).setImageAssetDelegate(new cr() {
            final PjT PjT;

            @Override  // com.bytedance.adsdk.Zh.cr
            public Bitmap PjT(DWo dWo0) {
                String s2;
                if(dWo0 == null) {
                    return null;
                }
                String s = dWo0.DWo();
                String s1 = dWo0.SM();
                if(!TextUtils.isEmpty(s) && TextUtils.isEmpty(s1)) {
                    s2 = com.bytedance.adsdk.ugeno.ReZ.Zh.PjT(s, PjT.this.cr);
                }
                else if(TextUtils.isEmpty(s1) || !TextUtils.isEmpty(s)) {
                    s2 = TextUtils.isEmpty(s1) || TextUtils.isEmpty(s) ? null : com.bytedance.adsdk.ugeno.ReZ.Zh.PjT(s, PjT.this.cr) + com.bytedance.adsdk.ugeno.ReZ.Zh.PjT(s1, PjT.this.cr);
                }
                else {
                    s2 = com.bytedance.adsdk.ugeno.ReZ.Zh.PjT(s1, PjT.this.cr);
                }
                if(TextUtils.isEmpty(s2)) {
                    return null;
                }
                Bitmap bitmap0 = (Bitmap)PjT.this.OL.get(s2);
                if(bitmap0 != null) {
                    return bitmap0;
                }
                JQp.PjT().Zh().PjT(PjT.this.SM, s2, new com.bytedance.adsdk.ugeno.PjT.PjT() {
                    final com.bytedance.sdk.openadsdk.core.DWo.Zh.PjT.PjT.1 ReZ;

                    @Override  // com.bytedance.adsdk.ugeno.PjT$PjT
                    public void PjT(Bitmap bitmap0) {
                        if(bitmap0 != null) {
                            Bitmap bitmap1 = Bitmap.createScaledBitmap(bitmap0, dWo0.PjT(), dWo0.Zh(), false);
                            PjT.this.OL.put(s2, bitmap1);
                            Au.PjT(new Runnable() {
                                final com.bytedance.sdk.openadsdk.core.DWo.Zh.PjT.PjT.1.1 Zh;

                                @Override
                                public void run() {
                                    ((Zh)PjT.this.JQp).PjT(com.bytedance.sdk.openadsdk.core.DWo.Zh.PjT.PjT.1.1.this.PjT.Au(), bitmap1);
                                }
                            });
                        }
                    }
                });
                return (Bitmap)PjT.this.OL.get(s2);
            }
        });
        if(this.Qf()) {
            ((Zh)this.JQp).setScaleType(this.dDm);
        }
        else {
            ((Zh)this.JQp).setScaleType(this.jp);
        }
        if(this.Qf()) {
            ((Zh)this.JQp).setRepeatCount(this.Gr);
        }
        else {
            ((Zh)this.JQp).PjT(this.kWj);
        }
        this.cr();
    }

    protected void cr() {
        ((Zh)this.JQp).PjT();
    }
}

