package com.bytedance.adsdk.ugeno.SM.cr;

import android.content.res.ColorStateList;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Matrix;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.widget.ImageView.ScaleType;
import com.bumptech.glide.load.resource.drawable.a;
import java.util.HashSet;

public class Zh extends Drawable {
    private final RectF Au;
    private final Matrix DWo;
    private final Paint JQp;
    private ImageView.ScaleType Owx;
    private final RectF PjT;
    private final RectF ReZ;
    private final Paint SM;
    private final int XX;
    private final RectF Zh;
    private final Bitmap cr;
    private final int cz;
    private boolean fDm;
    private float gK;
    private ColorStateList ltE;
    private final RectF qj;
    private float qla;
    private boolean ub;
    private final boolean[] xE;
    private Shader.TileMode xf;
    private Shader.TileMode xs;

    public Zh(Bitmap bitmap0) {
        this.PjT = new RectF();
        this.Zh = new RectF();
        RectF rectF0 = new RectF();
        this.ReZ = rectF0;
        this.Au = new RectF();
        this.DWo = new Matrix();
        this.qj = new RectF();
        this.xf = Shader.TileMode.CLAMP;
        this.xs = Shader.TileMode.CLAMP;
        this.fDm = true;
        this.qla = 0.0f;
        this.xE = new boolean[]{true, true, true, true};
        this.ub = false;
        this.gK = 0.0f;
        this.ltE = ColorStateList.valueOf(0xFF000000);
        this.Owx = ImageView.ScaleType.FIT_CENTER;
        this.cr = bitmap0;
        int v = bitmap0.getWidth();
        this.cz = v;
        int v1 = bitmap0.getHeight();
        this.XX = v1;
        rectF0.set(0.0f, 0.0f, ((float)v), ((float)v1));
        Paint paint0 = new Paint();
        this.JQp = paint0;
        paint0.setStyle(Paint.Style.FILL);
        paint0.setAntiAlias(true);
        Paint paint1 = new Paint();
        this.SM = paint1;
        paint1.setStyle(Paint.Style.STROKE);
        paint1.setAntiAlias(true);
        paint1.setColor(this.ltE.getColorForState(this.getState(), 0xFF000000));
        paint1.setStrokeWidth(0.0f);
    }

    public static Drawable PjT(Drawable drawable0) {
        if(drawable0 != null) {
            if(drawable0 instanceof Zh) {
                return drawable0;
            }
            if(Build.VERSION.SDK_INT >= 28 && a.a(drawable0)) {
                return drawable0;
            }
            if(drawable0 instanceof LayerDrawable) {
                Drawable.ConstantState drawable$ConstantState0 = drawable0.mutate().getConstantState();
                if(drawable$ConstantState0 != null) {
                    drawable0 = drawable$ConstantState0.newDrawable();
                }
                int v = ((LayerDrawable)drawable0).getNumberOfLayers();
                for(int v1 = 0; v1 < v; ++v1) {
                    Drawable drawable1 = ((LayerDrawable)drawable0).getDrawable(v1);
                    ((LayerDrawable)drawable0).setDrawableByLayerId(((LayerDrawable)drawable0).getId(v1), Zh.PjT(drawable1));
                }
                return (LayerDrawable)drawable0;
            }
        }
        Bitmap bitmap0 = Zh.Zh(drawable0);
        return bitmap0 != null ? new Zh(bitmap0) : drawable0;
    }

    public static Zh PjT(Bitmap bitmap0) {
        return bitmap0 == null ? null : new Zh(bitmap0);
    }

    private void PjT() {
        float f2;
        float f11;
        float f10;
        switch(com.bytedance.adsdk.ugeno.SM.cr.Zh.1.PjT[this.Owx.ordinal()]) {
            case 1: {
                this.Au.set(this.PjT);
                this.Au.inset(this.gK / 2.0f, this.gK / 2.0f);
                this.DWo.reset();
                float f12 = this.Au.width();
                float f13 = this.Au.height();
                this.DWo.setTranslate(((float)(((int)((f12 - ((float)this.cz)) * 0.5f + 0.5f)))), ((float)(((int)((f13 - ((float)this.XX)) * 0.5f + 0.5f)))));
                break;
            }
            case 2: {
                this.Au.set(this.PjT);
                this.Au.inset(this.gK / 2.0f, this.gK / 2.0f);
                this.DWo.reset();
                float f7 = this.Au.height();
                float f8 = this.Au.width();
                float f9 = 0.0f;
                if(((float)this.cz) * f7 > f8 * ((float)this.XX)) {
                    f10 = this.Au.height() / ((float)this.XX);
                    f9 = (this.Au.width() - ((float)this.cz) * f10) * 0.5f;
                    f11 = 0.0f;
                }
                else {
                    f10 = this.Au.width() / ((float)this.cz);
                    f11 = (this.Au.height() - ((float)this.XX) * f10) * 0.5f;
                }
                this.DWo.setScale(f10, f10);
                this.DWo.postTranslate(((float)(((int)(f9 + 0.5f)))) + this.gK / 2.0f, ((float)(((int)(f11 + 0.5f)))) + this.gK / 2.0f);
                break;
            }
            case 3: {
                this.DWo.reset();
                float f = this.PjT.width();
                if(((float)this.cz) <= f) {
                    float f1 = this.PjT.height();
                    if(((float)this.XX) <= f1) {
                        f2 = 1.0f;
                        goto label_34;
                    }
                    goto label_31;
                }
                else {
                label_31:
                    float f3 = this.PjT.width();
                    float f4 = this.PjT.height();
                    f2 = Math.min(f3 / ((float)this.cz), f4 / ((float)this.XX));
                }
            label_34:
                float f5 = this.PjT.width();
                float f6 = this.PjT.height();
                this.DWo.setScale(f2, f2);
                this.DWo.postTranslate(((float)(((int)((f5 - ((float)this.cz) * f2) * 0.5f + 0.5f)))), ((float)(((int)((f6 - ((float)this.XX) * f2) * 0.5f + 0.5f)))));
                this.Au.set(this.ReZ);
                this.DWo.mapRect(this.Au);
                this.Au.inset(this.gK / 2.0f, this.gK / 2.0f);
                this.DWo.setRectToRect(this.ReZ, this.Au, Matrix.ScaleToFit.FILL);
                break;
            }
            case 5: {
                this.Au.set(this.ReZ);
                this.DWo.setRectToRect(this.ReZ, this.PjT, Matrix.ScaleToFit.END);
                this.DWo.mapRect(this.Au);
                this.Au.inset(this.gK / 2.0f, this.gK / 2.0f);
                this.DWo.setRectToRect(this.ReZ, this.Au, Matrix.ScaleToFit.FILL);
                break;
            }
            case 6: {
                this.Au.set(this.ReZ);
                this.DWo.setRectToRect(this.ReZ, this.PjT, Matrix.ScaleToFit.START);
                this.DWo.mapRect(this.Au);
                this.Au.inset(this.gK / 2.0f, this.gK / 2.0f);
                this.DWo.setRectToRect(this.ReZ, this.Au, Matrix.ScaleToFit.FILL);
                break;
            }
            case 7: {
                this.Au.set(this.PjT);
                this.Au.inset(this.gK / 2.0f, this.gK / 2.0f);
                this.DWo.reset();
                this.DWo.setRectToRect(this.ReZ, this.Au, Matrix.ScaleToFit.FILL);
                break;
            }
            default: {
                this.Au.set(this.ReZ);
                this.DWo.setRectToRect(this.ReZ, this.PjT, Matrix.ScaleToFit.CENTER);
                this.DWo.mapRect(this.Au);
                this.Au.inset(this.gK / 2.0f, this.gK / 2.0f);
                this.DWo.setRectToRect(this.ReZ, this.Au, Matrix.ScaleToFit.FILL);
            }
        }
        this.Zh.set(this.Au);
        this.fDm = true;
    }

    private void PjT(Canvas canvas0) {
        if(Zh.Zh(this.xE)) {
            return;
        }
        if(this.qla == 0.0f) {
            return;
        }
        float f = this.Zh.left;
        float f1 = this.Zh.top;
        float f2 = this.Zh.width() + f;
        float f3 = this.Zh.height() + f1;
        float f4 = this.qla;
        if(!this.xE[0]) {
            this.qj.set(f, f1, f + f4, f1 + f4);
            canvas0.drawRect(this.qj, this.JQp);
        }
        if(!this.xE[1]) {
            this.qj.set(f2 - f4, f1, f2, f4);
            canvas0.drawRect(this.qj, this.JQp);
        }
        if(!this.xE[2]) {
            this.qj.set(f2 - f4, f3 - f4, f2, f3);
            canvas0.drawRect(this.qj, this.JQp);
        }
        if(!this.xE[3]) {
            this.qj.set(f, f3 - f4, f4 + f, f3);
            canvas0.drawRect(this.qj, this.JQp);
        }
    }

    private static boolean PjT(boolean[] arr_z) {
        for(int v = 0; v < arr_z.length; ++v) {
            if(arr_z[v]) {
                return true;
            }
        }
        return false;
    }

    public Zh PjT(float f) {
        this.gK = f;
        this.SM.setStrokeWidth(f);
        return this;
    }

    public Zh PjT(float f, float f1, float f2, float f3) {
        HashSet hashSet0 = new HashSet(4);
        hashSet0.add(f);
        hashSet0.add(f1);
        hashSet0.add(f2);
        hashSet0.add(f3);
        hashSet0.remove(0.0f);
        boolean z = true;
        if(hashSet0.size() > 1) {
            throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
        }
        if(hashSet0.isEmpty()) {
            this.qla = 0.0f;
        }
        else {
            Object object0 = hashSet0.iterator().next();
            float f4 = (float)(((Float)object0));
            if(Float.isInfinite(f4) || Float.isNaN(f4) || f4 < 0.0f) {
                throw new IllegalArgumentException("Invalid radius value: " + f4);
            }
            this.qla = f4;
        }
        boolean[] arr_z = this.xE;
        arr_z[0] = f > 0.0f;
        arr_z[1] = f1 > 0.0f;
        arr_z[2] = f2 > 0.0f;
        if(f3 <= 0.0f) {
            z = false;
        }
        arr_z[3] = z;
        return this;
    }

    public Zh PjT(ColorStateList colorStateList0) {
        if(colorStateList0 == null) {
            colorStateList0 = ColorStateList.valueOf(0);
        }
        this.ltE = colorStateList0;
        int v = colorStateList0.getColorForState(this.getState(), 0xFF000000);
        this.SM.setColor(v);
        return this;
    }

    public Zh PjT(Shader.TileMode shader$TileMode0) {
        if(this.xf != shader$TileMode0) {
            this.xf = shader$TileMode0;
            this.fDm = true;
            this.invalidateSelf();
        }
        return this;
    }

    public Zh PjT(ImageView.ScaleType imageView$ScaleType0) {
        if(imageView$ScaleType0 == null) {
            imageView$ScaleType0 = ImageView.ScaleType.FIT_CENTER;
        }
        if(this.Owx != imageView$ScaleType0) {
            this.Owx = imageView$ScaleType0;
            this.PjT();
        }
        return this;
    }

    public Zh PjT(boolean z) {
        this.ub = z;
        return this;
    }

    public static Bitmap Zh(Drawable drawable0) {
        if(drawable0 == null) {
            return null;
        }
        if(drawable0 instanceof BitmapDrawable) {
            return ((BitmapDrawable)drawable0).getBitmap();
        }
        int v = Math.max(drawable0.getIntrinsicWidth(), 2);
        int v1 = Math.max(drawable0.getIntrinsicHeight(), 2);
        try {
            Bitmap bitmap0 = Bitmap.createBitmap(v, v1, Bitmap.Config.ARGB_8888);
            Canvas canvas0 = new Canvas(bitmap0);
            drawable0.setBounds(0, 0, canvas0.getWidth(), canvas0.getHeight());
            drawable0.draw(canvas0);
            return bitmap0;
        }
        catch(Throwable unused_ex) {
            Log.w("RoundedDrawable", "Failed to create bitmap from drawable!");
            return null;
        }
    }

    private void Zh(Canvas canvas0) {
        float f6;
        if(Zh.Zh(this.xE)) {
            return;
        }
        if(this.qla == 0.0f) {
            return;
        }
        float f = this.Zh.left;
        float f1 = this.Zh.top;
        float f2 = this.Zh.width() + f;
        float f3 = f1 + this.Zh.height();
        float f4 = this.qla;
        float f5 = this.gK / 2.0f;
        if(!this.xE[0]) {
            canvas0.drawLine(f - f5, f1, f + f4, f1, this.SM);
            canvas0.drawLine(f, f1 - f5, f, f1 + f4, this.SM);
        }
        if(!this.xE[1]) {
            canvas0.drawLine(f2 - f4 - f5, f1, f2, f1, this.SM);
            canvas0.drawLine(f2, f1 - f5, f2, f1 + f4, this.SM);
        }
        if(this.xE[2]) {
            f6 = f4;
        }
        else {
            f6 = f4;
            canvas0.drawLine(f2 - f4 - f5, f3, f2 + f5, f3, this.SM);
            canvas0.drawLine(f2, f3 - f6, f2, f3, this.SM);
        }
        if(!this.xE[3]) {
            canvas0.drawLine(f - f5, f3, f + f6, f3, this.SM);
            canvas0.drawLine(f, f3 - f6, f, f3, this.SM);
        }
    }

    private static boolean Zh(boolean[] arr_z) {
        for(int v = 0; v < arr_z.length; ++v) {
            if(arr_z[v]) {
                return false;
            }
        }
        return true;
    }

    public Zh Zh(Shader.TileMode shader$TileMode0) {
        if(this.xs != shader$TileMode0) {
            this.xs = shader$TileMode0;
            this.fDm = true;
            this.invalidateSelf();
        }
        return this;
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(Canvas canvas0) {
        if(this.fDm) {
            BitmapShader bitmapShader0 = new BitmapShader(this.cr, this.xf, this.xs);
            if(this.xf == Shader.TileMode.CLAMP && this.xs == Shader.TileMode.CLAMP) {
                bitmapShader0.setLocalMatrix(this.DWo);
            }
            this.JQp.setShader(bitmapShader0);
            this.fDm = false;
        }
        if(this.ub) {
            if(this.gK > 0.0f) {
                canvas0.drawOval(this.Zh, this.JQp);
                canvas0.drawOval(this.Au, this.SM);
                return;
            }
            canvas0.drawOval(this.Zh, this.JQp);
            return;
        }
        if(Zh.PjT(this.xE)) {
            float f = this.qla;
            if(this.gK > 0.0f) {
                canvas0.drawRoundRect(this.Zh, f, f, this.JQp);
                canvas0.drawRoundRect(this.Au, f, f, this.SM);
                this.PjT(canvas0);
                this.Zh(canvas0);
                return;
            }
            canvas0.drawRoundRect(this.Zh, f, f, this.JQp);
            this.PjT(canvas0);
            return;
        }
        canvas0.drawRect(this.Zh, this.JQp);
        if(this.gK > 0.0f) {
            canvas0.drawRect(this.Au, this.SM);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.JQp.getAlpha();
    }

    @Override  // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.JQp.getColorFilter();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.XX;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.cz;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.ltE.isStateful();
    }

    @Override  // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect0) {
        super.onBoundsChange(rect0);
        this.PjT.set(rect0);
        this.PjT();
    }

    @Override  // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] arr_v) {
        int v = this.ltE.getColorForState(arr_v, 0);
        if(this.SM.getColor() != v) {
            this.SM.setColor(v);
            return true;
        }
        return super.onStateChange(arr_v);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        this.JQp.setAlpha(v);
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter0) {
        this.JQp.setColorFilter(colorFilter0);
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.JQp.setDither(z);
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.JQp.setFilterBitmap(z);
        this.invalidateSelf();
    }

    class com.bytedance.adsdk.ugeno.SM.cr.Zh.1 {
        static final int[] PjT;

        static {
            int[] arr_v = new int[ImageView.ScaleType.values().length];
            com.bytedance.adsdk.ugeno.SM.cr.Zh.1.PjT = arr_v;
            try {
                arr_v[ImageView.ScaleType.CENTER.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bytedance.adsdk.ugeno.SM.cr.Zh.1.PjT[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bytedance.adsdk.ugeno.SM.cr.Zh.1.PjT[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bytedance.adsdk.ugeno.SM.cr.Zh.1.PjT[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bytedance.adsdk.ugeno.SM.cr.Zh.1.PjT[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bytedance.adsdk.ugeno.SM.cr.Zh.1.PjT[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bytedance.adsdk.ugeno.SM.cr.Zh.1.PjT[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

}

