package com.bytedance.adsdk.ugeno.SM.cr;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.Log;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.PjT.JQp;
import com.bytedance.adsdk.ugeno.PjT.cz;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.cr;

public class PjT extends ImageView implements JQp, IAnimation {
    private float Au;
    private boolean DWo;
    private final float[] JQp;
    private cr Owx;
    public static final Shader.TileMode PjT = null;
    private cz RD;
    private float ReZ;
    private ColorFilter SM;
    private ColorStateList XX;
    static final boolean Zh = true;
    private static final ImageView.ScaleType[] cr;
    private Drawable cz;
    private boolean fDm;
    private Shader.TileMode gK;
    private Shader.TileMode ltE;
    private Drawable qj;
    private int qla;
    private ImageView.ScaleType ub;
    private int xE;
    private boolean xf;
    private boolean xs;

    static {
        PjT.PjT = Shader.TileMode.CLAMP;
        PjT.cr = new ImageView.ScaleType[]{ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    }

    public PjT(Context context0) {
        super(context0);
        this.JQp = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.XX = ColorStateList.valueOf(0xFF000000);
        this.Au = 0.0f;
        this.SM = null;
        this.DWo = false;
        this.xf = false;
        this.xs = false;
        this.fDm = false;
        this.gK = PjT.PjT;
        this.ltE = PjT.PjT;
        this.RD = new cz(this);
    }

    private Drawable PjT() {
        Resources resources0 = this.getResources();
        if(resources0 == null) {
            return null;
        }
        int v = this.qla;
        if(v != 0) {
            try {
                return Zh.PjT(resources0.getDrawable(v));
            }
            catch(Exception exception0) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.qla, exception0);
                this.qla = 0;
                return Zh.PjT(null);
            }
        }
        return Zh.PjT(null);
    }

    private void PjT(Drawable drawable0, ImageView.ScaleType imageView$ScaleType0) {
        if(drawable0 == null) {
            return;
        }
        if(drawable0 instanceof Zh) {
            ((Zh)drawable0).PjT(imageView$ScaleType0).PjT(this.Au).PjT(this.XX).PjT(this.xs).PjT(this.gK).Zh(this.ltE);
            float[] arr_f = this.JQp;
            if(arr_f != null) {
                ((Zh)drawable0).PjT(arr_f[0], arr_f[1], arr_f[2], arr_f[3]);
            }
            this.cr();
            return;
        }
        if(drawable0 instanceof LayerDrawable) {
            int v1 = ((LayerDrawable)drawable0).getNumberOfLayers();
            for(int v = 0; v < v1; ++v) {
                this.PjT(((LayerDrawable)drawable0).getDrawable(v), imageView$ScaleType0);
            }
        }
    }

    private void PjT(boolean z) {
        if(this.fDm) {
            if(z) {
                this.cz = Zh.PjT(this.cz);
            }
            this.PjT(this.cz, ImageView.ScaleType.FIT_XY);
        }
    }

    public void PjT(float f, float f1, float f2, float f3) {
        float[] arr_f = this.JQp;
        if(arr_f[0] == f && arr_f[1] == f1 && arr_f[2] == f3 && arr_f[3] == f2) {
            return;
        }
        arr_f[0] = f;
        arr_f[1] = f1;
        arr_f[3] = f2;
        arr_f[2] = f3;
        this.ReZ();
        this.PjT(false);
        this.invalidate();
    }

    public void PjT(cr cr0) {
        this.Owx = cr0;
    }

    private void ReZ() {
        this.PjT(this.qj, this.ub);
    }

    private Drawable Zh() {
        Resources resources0 = this.getResources();
        if(resources0 == null) {
            return null;
        }
        int v = this.xE;
        if(v != 0) {
            try {
                return Zh.PjT(resources0.getDrawable(v));
            }
            catch(Exception exception0) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.xE, exception0);
                this.xE = 0;
                return Zh.PjT(null);
            }
        }
        return Zh.PjT(null);
    }

    private void cr() {
        Drawable drawable0 = this.qj;
        if(drawable0 != null && this.DWo) {
            Drawable drawable1 = drawable0.mutate();
            this.qj = drawable1;
            if(this.xf) {
                drawable1.setColorFilter(this.SM);
            }
        }
    }

    @Override  // android.widget.ImageView
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.invalidate();
    }

    public int getBorderColor() {
        return this.XX.getDefaultColor();
    }

    public ColorStateList getBorderColors() {
        return this.XX;
    }

    public float getBorderRadius() {
        return this.RD.PjT();
    }

    public float getBorderWidth() {
        return this.Au;
    }

    public float getCornerRadius() {
        return this.getMaxCornerRadius();
    }

    public float getMaxCornerRadius() {
        float[] arr_f = this.JQp;
        float f = 0.0f;
        for(int v = 0; v < arr_f.length; ++v) {
            f = Math.max(arr_f[v], f);
        }
        return f;
    }

    @Override  // com.bytedance.adsdk.ugeno.PjT.JQp, com.bytedance.adsdk.ugeno.core.IAnimation
    public float getRipple() {
        return this.ReZ;
    }

    @Override  // com.bytedance.adsdk.ugeno.PjT.JQp
    public float getRubIn() {
        return this.RD.getRubIn();
    }

    @Override  // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.ub;
    }

    @Override  // com.bytedance.adsdk.ugeno.PjT.JQp
    public float getShine() {
        return this.RD.getShine();
    }

    @Override  // com.bytedance.adsdk.ugeno.PjT.JQp
    public float getStretch() {
        return this.RD.getStretch();
    }

    public Shader.TileMode getTileModeX() {
        return this.gK;
    }

    public Shader.TileMode getTileModeY() {
        return this.ltE;
    }

    @Override  // android.widget.ImageView
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        cr cr0 = this.Owx;
        if(cr0 != null) {
            cr0.XX();
        }
    }

    @Override  // android.widget.ImageView
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cr cr0 = this.Owx;
        if(cr0 != null) {
            cr0.Au();
        }
    }

    @Override  // android.widget.ImageView
    protected void onDraw(Canvas canvas0) {
        super.onDraw(canvas0);
        cr cr0 = this.Owx;
        if(cr0 != null) {
            cr0.PjT(canvas0, this);
        }
    }

    @Override  // android.view.View
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        cr cr0 = this.Owx;
        if(cr0 != null) {
            cr0.PjT(v, v1, v2, v3);
        }
        super.onLayout(z, v, v1, v2, v3);
    }

    @Override  // android.widget.ImageView
    protected void onMeasure(int v, int v1) {
        cr cr0 = this.Owx;
        if(cr0 != null) {
            int[] arr_v = cr0.PjT(v, v1);
            super.onMeasure(arr_v[0], arr_v[1]);
            return;
        }
        super.onMeasure(v, v1);
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        cr cr0 = this.Owx;
        if(cr0 != null) {
            cr0.Zh(v, v1, v2, v2);
        }
    }

    @Override  // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override  // android.view.View
    public void setBackground(Drawable drawable0) {
        this.setBackgroundDrawable(drawable0);
    }

    @Override  // android.view.View
    public void setBackgroundColor(int v) {
        ColorDrawable colorDrawable0 = new ColorDrawable(v);
        this.cz = colorDrawable0;
        this.setBackgroundDrawable(colorDrawable0);
    }

    @Override  // android.view.View
    @Deprecated
    public void setBackgroundDrawable(Drawable drawable0) {
        this.cz = drawable0;
        this.PjT(true);
        super.setBackgroundDrawable(this.cz);
    }

    @Override  // android.view.View
    public void setBackgroundResource(int v) {
        if(this.xE != v) {
            this.xE = v;
            Drawable drawable0 = this.Zh();
            this.cz = drawable0;
            this.setBackgroundDrawable(drawable0);
        }
    }

    public void setBorderColor(int v) {
        this.setBorderColor(ColorStateList.valueOf(v));
    }

    public void setBorderColor(ColorStateList colorStateList0) {
        if(this.XX.equals(colorStateList0)) {
            return;
        }
        if(colorStateList0 == null) {
            colorStateList0 = ColorStateList.valueOf(0xFF000000);
        }
        this.XX = colorStateList0;
        this.ReZ();
        this.PjT(false);
        if(this.Au > 0.0f) {
            this.invalidate();
        }
    }

    public void setBorderRadius(float f) {
        cz cz0 = this.RD;
        if(cz0 != null) {
            cz0.PjT(f);
        }
    }

    public void setBorderWidth(float f) {
        if(this.Au == f) {
            return;
        }
        this.Au = f;
        this.ReZ();
        this.PjT(false);
        this.invalidate();
    }

    public void setBorderWidth(int v) {
        this.setBorderWidth(this.getResources().getDimension(v));
    }

    @Override  // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter0) {
        if(this.SM != colorFilter0) {
            this.SM = colorFilter0;
            this.xf = true;
            this.DWo = true;
            this.cr();
            this.invalidate();
        }
    }

    public void setCornerRadius(float f) {
        this.PjT(f, f, f, f);
    }

    public void setCornerRadiusDimen(int v) {
        float f = this.getResources().getDimension(v);
        this.PjT(f, f, f, f);
    }

    @Override  // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap0) {
        this.qla = 0;
        this.qj = Zh.PjT(bitmap0);
        this.ReZ();
        super.setImageDrawable(this.qj);
    }

    @Override  // android.widget.ImageView
    public void setImageDrawable(Drawable drawable0) {
        this.qla = 0;
        this.qj = Zh.PjT(drawable0);
        this.ReZ();
        super.setImageDrawable(drawable0);
    }

    @Override  // android.widget.ImageView
    public void setImageResource(int v) {
        if(this.qla != v) {
            this.qla = v;
            this.qj = this.PjT();
            this.ReZ();
            super.setImageDrawable(this.qj);
        }
    }

    @Override  // android.widget.ImageView
    public void setImageURI(Uri uri0) {
        super.setImageURI(uri0);
        this.setImageDrawable(this.getDrawable());
    }

    public void setOval(boolean z) {
        this.xs = z;
        this.ReZ();
        this.PjT(false);
        this.invalidate();
    }

    @Override  // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f) {
        this.ReZ = f;
        cz cz0 = this.RD;
        if(cz0 != null) {
            cz0.Zh(f);
        }
        this.postInvalidate();
    }

    public void setRubIn(float f) {
        cz cz0 = this.RD;
        if(cz0 != null) {
            cz0.JQp(f);
        }
    }

    @Override  // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType imageView$ScaleType0) {
        if(!PjT.Zh && imageView$ScaleType0 == null) {
            throw new AssertionError();
        }
        if(this.ub != imageView$ScaleType0) {
            this.ub = imageView$ScaleType0;
            switch(com.bytedance.adsdk.ugeno.SM.cr.PjT.1.PjT[imageView$ScaleType0.ordinal()]) {
                case 1: 
                case 2: 
                case 3: 
                case 4: {
                    super.setScaleType(imageView$ScaleType0);
                    break;
                }
                default: {
                    super.setScaleType(ImageView.ScaleType.FIT_XY);
                }
            }
            this.ReZ();
            this.PjT(false);
            this.invalidate();
        }
    }

    public void setShine(float f) {
        cz cz0 = this.RD;
        if(cz0 != null) {
            cz0.ReZ(f);
        }
    }

    public void setStretch(float f) {
        cz cz0 = this.RD;
        if(cz0 != null) {
            cz0.cr(f);
        }
    }

    public void setTileModeX(Shader.TileMode shader$TileMode0) {
        if(this.gK == shader$TileMode0) {
            return;
        }
        this.gK = shader$TileMode0;
        this.ReZ();
        this.PjT(false);
        this.invalidate();
    }

    public void setTileModeY(Shader.TileMode shader$TileMode0) {
        if(this.ltE == shader$TileMode0) {
            return;
        }
        this.ltE = shader$TileMode0;
        this.ReZ();
        this.PjT(false);
        this.invalidate();
    }

    class com.bytedance.adsdk.ugeno.SM.cr.PjT.1 {
        static final int[] PjT;

        static {
            int[] arr_v = new int[ImageView.ScaleType.values().length];
            com.bytedance.adsdk.ugeno.SM.cr.PjT.1.PjT = arr_v;
            try {
                arr_v[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bytedance.adsdk.ugeno.SM.cr.PjT.1.PjT[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bytedance.adsdk.ugeno.SM.cr.PjT.1.PjT[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bytedance.adsdk.ugeno.SM.cr.PjT.1.PjT[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bytedance.adsdk.ugeno.SM.cr.PjT.1.PjT[ImageView.ScaleType.CENTER.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bytedance.adsdk.ugeno.SM.cr.PjT.1.PjT[ImageView.ScaleType.CENTER_CROP.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bytedance.adsdk.ugeno.SM.cr.PjT.1.PjT[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

}

