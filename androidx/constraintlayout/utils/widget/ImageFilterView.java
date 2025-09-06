package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Path.Direction;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.R.styleable;

public class ImageFilterView extends AppCompatImageView {
    static class ImageMatrix {
        float[] a;
        ColorMatrix b;
        ColorMatrix c;
        float d;
        float e;
        float f;
        float g;

        ImageMatrix() {
            this.a = new float[20];
            this.b = new ColorMatrix();
            this.c = new ColorMatrix();
            this.d = 1.0f;
            this.e = 1.0f;
            this.f = 1.0f;
            this.g = 1.0f;
        }

        private void a(float f) {
            float[] arr_f = this.a;
            arr_f[0] = f;
            arr_f[1] = 0.0f;
            arr_f[2] = 0.0f;
            arr_f[3] = 0.0f;
            arr_f[4] = 0.0f;
            arr_f[5] = 0.0f;
            arr_f[6] = f;
            arr_f[7] = 0.0f;
            arr_f[8] = 0.0f;
            arr_f[9] = 0.0f;
            arr_f[10] = 0.0f;
            arr_f[11] = 0.0f;
            arr_f[12] = f;
            arr_f[13] = 0.0f;
            arr_f[14] = 0.0f;
            arr_f[15] = 0.0f;
            arr_f[16] = 0.0f;
            arr_f[17] = 0.0f;
            arr_f[18] = 1.0f;
            arr_f[19] = 0.0f;
        }

        private void b(float f) {
            float f1 = 0.2999f * (1.0f - f);
            float f2 = 0.587f * (1.0f - f);
            float f3 = (1.0f - f) * 0.114f;
            float[] arr_f = this.a;
            arr_f[0] = f1 + f;
            arr_f[1] = f2;
            arr_f[2] = f3;
            arr_f[3] = 0.0f;
            arr_f[4] = 0.0f;
            arr_f[5] = f1;
            arr_f[6] = f2 + f;
            arr_f[7] = f3;
            arr_f[8] = 0.0f;
            arr_f[9] = 0.0f;
            arr_f[10] = f1;
            arr_f[11] = f2;
            arr_f[12] = f3 + f;
            arr_f[13] = 0.0f;
            arr_f[14] = 0.0f;
            arr_f[15] = 0.0f;
            arr_f[16] = 0.0f;
            arr_f[17] = 0.0f;
            arr_f[18] = 1.0f;
            arr_f[19] = 0.0f;
        }

        void c(ImageView imageView0) {
            int v1;
            this.b.reset();
            float f = this.e;
            int v = 1;
            if(f == 1.0f) {
                v1 = 0;
            }
            else {
                this.b(f);
                this.b.set(this.a);
                v1 = 1;
            }
            float f1 = this.f;
            if(f1 != 1.0f) {
                this.c.setScale(f1, f1, f1, 1.0f);
                this.b.postConcat(this.c);
                v1 = 1;
            }
            float f2 = this.g;
            if(f2 != 1.0f) {
                this.d(f2);
                this.c.set(this.a);
                this.b.postConcat(this.c);
                v1 = 1;
            }
            float f3 = this.d;
            if(f3 == 1.0f) {
                v = v1;
            }
            else {
                this.a(f3);
                this.c.set(this.a);
                this.b.postConcat(this.c);
            }
            if(v != 0) {
                imageView0.setColorFilter(new ColorMatrixColorFilter(this.b));
                return;
            }
            imageView0.clearColorFilter();
        }

        private void d(float f) {
            float f4;
            float f3;
            float f2;
            if(f <= 0.0f) {
                f = 0.01f;
            }
            float f1 = 5000.0f / f / 100.0f;
            if(f1 > 66.0f) {
                f2 = ((float)Math.pow(f1 - 60.0f, -0.133205)) * 329.69873f;
                f3 = ((float)Math.pow(f1 - 60.0f, 0.075515)) * 288.122162f;
            }
            else {
                f3 = ((float)Math.log(f1)) * 99.470802f - 161.119568f;
                f2 = 255.0f;
            }
            if(f1 >= 66.0f) {
                f4 = 255.0f;
            }
            else if(f1 > 19.0f) {
                f4 = ((float)Math.log(f1 - 10.0f)) * 138.517731f - 305.0448f;
            }
            else {
                f4 = 0.0f;
            }
            float[] arr_f = this.a;
            arr_f[0] = Math.min(255.0f, Math.max(f2, 0.0f)) / 255.0f;
            arr_f[1] = 0.0f;
            arr_f[2] = 0.0f;
            arr_f[3] = 0.0f;
            arr_f[4] = 0.0f;
            arr_f[5] = 0.0f;
            arr_f[6] = Math.min(255.0f, Math.max(f3, 0.0f)) / 228.012512f;
            arr_f[7] = 0.0f;
            arr_f[8] = 0.0f;
            arr_f[9] = 0.0f;
            arr_f[10] = 0.0f;
            arr_f[11] = 0.0f;
            arr_f[12] = Math.min(255.0f, Math.max(f4, 0.0f)) / 205.93042f;
            arr_f[13] = 0.0f;
            arr_f[14] = 0.0f;
            arr_f[15] = 0.0f;
            arr_f[16] = 0.0f;
            arr_f[17] = 0.0f;
            arr_f[18] = 1.0f;
            arr_f[19] = 0.0f;
        }
    }

    private ImageMatrix a;
    private boolean b;
    private Drawable c;
    private Drawable d;
    private float e;
    private float f;
    private float g;
    private Path h;
    ViewOutlineProvider i;
    RectF j;
    Drawable[] k;
    LayerDrawable l;
    float m;
    float n;
    float o;
    float p;

    public ImageFilterView(Context context0) {
        super(context0);
        this.a = new ImageMatrix();
        this.b = true;
        this.c = null;
        this.d = null;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = NaNf;
        this.k = new Drawable[2];
        this.m = NaNf;
        this.n = NaNf;
        this.o = NaNf;
        this.p = NaNf;
        this.e(context0, null);
    }

    public ImageFilterView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.a = new ImageMatrix();
        this.b = true;
        this.c = null;
        this.d = null;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = NaNf;
        this.k = new Drawable[2];
        this.m = NaNf;
        this.n = NaNf;
        this.o = NaNf;
        this.p = NaNf;
        this.e(context0, attributeSet0);
    }

    public ImageFilterView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a = new ImageMatrix();
        this.b = true;
        this.c = null;
        this.d = null;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = NaNf;
        this.k = new Drawable[2];
        this.m = NaNf;
        this.n = NaNf;
        this.o = NaNf;
        this.p = NaNf;
        this.e(context0, attributeSet0);
    }

    @Override  // android.view.View
    public void draw(@NonNull Canvas canvas0) {
        super.draw(canvas0);
    }

    private void e(Context context0, AttributeSet attributeSet0) {
        if(attributeSet0 != null) {
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.ImageFilterView);
            int v = typedArray0.getIndexCount();
            this.c = typedArray0.getDrawable(styleable.ImageFilterView_altSrc);
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                if(v2 == styleable.ImageFilterView_crossfade) {
                    this.e = typedArray0.getFloat(v2, 0.0f);
                }
                else if(v2 == styleable.ImageFilterView_warmth) {
                    this.setWarmth(typedArray0.getFloat(v2, 0.0f));
                }
                else if(v2 == styleable.ImageFilterView_saturation) {
                    this.setSaturation(typedArray0.getFloat(v2, 0.0f));
                }
                else if(v2 == styleable.ImageFilterView_contrast) {
                    this.setContrast(typedArray0.getFloat(v2, 0.0f));
                }
                else if(v2 == styleable.ImageFilterView_brightness) {
                    this.setBrightness(typedArray0.getFloat(v2, 0.0f));
                }
                else if(v2 == styleable.ImageFilterView_round) {
                    this.setRound(typedArray0.getDimension(v2, 0.0f));
                }
                else if(v2 == styleable.ImageFilterView_roundPercent) {
                    this.setRoundPercent(typedArray0.getFloat(v2, 0.0f));
                }
                else if(v2 == styleable.ImageFilterView_overlay) {
                    this.setOverlay(typedArray0.getBoolean(v2, this.b));
                }
                else if(v2 == styleable.ImageFilterView_imagePanX) {
                    this.setImagePanX(typedArray0.getFloat(v2, this.m));
                }
                else if(v2 == styleable.ImageFilterView_imagePanY) {
                    this.setImagePanY(typedArray0.getFloat(v2, this.n));
                }
                else if(v2 == styleable.ImageFilterView_imageRotate) {
                    this.setImageRotate(typedArray0.getFloat(v2, this.p));
                }
                else if(v2 == styleable.ImageFilterView_imageZoom) {
                    this.setImageZoom(typedArray0.getFloat(v2, this.o));
                }
            }
            typedArray0.recycle();
            Drawable drawable0 = this.getDrawable();
            this.d = drawable0;
            if(this.c != null && drawable0 != null) {
                Drawable[] arr_drawable = this.k;
                Drawable drawable1 = this.getDrawable().mutate();
                this.d = drawable1;
                arr_drawable[0] = drawable1;
                Drawable[] arr_drawable1 = this.k;
                arr_drawable1[1] = this.c.mutate();
                LayerDrawable layerDrawable0 = new LayerDrawable(this.k);
                this.l = layerDrawable0;
                layerDrawable0.getDrawable(1).setAlpha(((int)(this.e * 255.0f)));
                if(!this.b) {
                    this.l.getDrawable(0).setAlpha(((int)((1.0f - this.e) * 255.0f)));
                }
                super.setImageDrawable(this.l);
                return;
            }
            Drawable drawable2 = this.getDrawable();
            this.d = drawable2;
            if(drawable2 != null) {
                Drawable[] arr_drawable2 = this.k;
                Drawable drawable3 = drawable2.mutate();
                this.d = drawable3;
                arr_drawable2[0] = drawable3;
            }
        }
    }

    private void f() {
        float f = 0.0f;
        if(Float.isNaN(this.m) && Float.isNaN(this.n) && Float.isNaN(this.o) && Float.isNaN(this.p)) {
            return;
        }
        float f1 = Float.isNaN(this.m) ? 0.0f : this.m;
        float f2 = Float.isNaN(this.n) ? 0.0f : this.n;
        float f3 = Float.isNaN(this.o) ? 1.0f : this.o;
        if(!Float.isNaN(this.p)) {
            f = this.p;
        }
        Matrix matrix0 = new Matrix();
        matrix0.reset();
        float f4 = (float)this.getDrawable().getIntrinsicWidth();
        float f5 = (float)this.getDrawable().getIntrinsicHeight();
        float f6 = (float)this.getWidth();
        float f7 = (float)this.getHeight();
        float f8 = f3 * (f4 * f7 < f5 * f6 ? f6 / f4 : f7 / f5);
        matrix0.postScale(f8, f8);
        matrix0.postTranslate((f1 * (f6 - f4 * f8) + f6 - f4 * f8) * 0.5f, (f2 * (f7 - f8 * f5) + f7 - f8 * f5) * 0.5f);
        matrix0.postRotate(f, f6 / 2.0f, f7 / 2.0f);
        this.setImageMatrix(matrix0);
        this.setScaleType(ImageView.ScaleType.MATRIX);
    }

    private void g() {
        if(Float.isNaN(this.m) && Float.isNaN(this.n) && Float.isNaN(this.o) && Float.isNaN(this.p)) {
            this.setScaleType(ImageView.ScaleType.FIT_CENTER);
            return;
        }
        this.f();
    }

    public float getBrightness() {
        return this.a.d;
    }

    public float getContrast() {
        return this.a.f;
    }

    public float getCrossfade() {
        return this.e;
    }

    public float getImagePanX() {
        return this.m;
    }

    public float getImagePanY() {
        return this.n;
    }

    public float getImageRotate() {
        return this.p;
    }

    public float getImageZoom() {
        return this.o;
    }

    public float getRound() {
        return this.g;
    }

    public float getRoundPercent() {
        return this.f;
    }

    public float getSaturation() {
        return this.a.e;
    }

    public float getWarmth() {
        return this.a.g;
    }

    @Override  // android.view.View
    public void layout(int v, int v1, int v2, int v3) {
        super.layout(v, v1, v2, v3);
        this.f();
    }

    public void setAltImageDrawable(Drawable drawable0) {
        Drawable drawable1 = drawable0.mutate();
        this.c = drawable1;
        Drawable[] arr_drawable = this.k;
        arr_drawable[0] = this.d;
        arr_drawable[1] = drawable1;
        LayerDrawable layerDrawable0 = new LayerDrawable(this.k);
        this.l = layerDrawable0;
        super.setImageDrawable(layerDrawable0);
        this.setCrossfade(this.e);
    }

    public void setAltImageResource(int v) {
        Drawable drawable0 = AppCompatResources.b(this.getContext(), v);
        this.c = drawable0;
        this.setAltImageDrawable(drawable0);
    }

    public void setBrightness(float f) {
        this.a.d = f;
        this.a.c(this);
    }

    public void setContrast(float f) {
        this.a.f = f;
        this.a.c(this);
    }

    public void setCrossfade(float f) {
        this.e = f;
        if(this.k != null) {
            if(!this.b) {
                this.l.getDrawable(0).setAlpha(((int)((1.0f - this.e) * 255.0f)));
            }
            this.l.getDrawable(1).setAlpha(((int)(this.e * 255.0f)));
            super.setImageDrawable(this.l);
        }
    }

    @Override  // androidx.appcompat.widget.AppCompatImageView
    public void setImageDrawable(Drawable drawable0) {
        if(this.c != null && drawable0 != null) {
            Drawable drawable1 = drawable0.mutate();
            this.d = drawable1;
            Drawable[] arr_drawable = this.k;
            arr_drawable[0] = drawable1;
            arr_drawable[1] = this.c;
            LayerDrawable layerDrawable0 = new LayerDrawable(this.k);
            this.l = layerDrawable0;
            super.setImageDrawable(layerDrawable0);
            this.setCrossfade(this.e);
            return;
        }
        super.setImageDrawable(drawable0);
    }

    public void setImagePanX(float f) {
        this.m = f;
        this.g();
    }

    public void setImagePanY(float f) {
        this.n = f;
        this.g();
    }

    @Override  // androidx.appcompat.widget.AppCompatImageView
    public void setImageResource(int v) {
        if(this.c != null) {
            Drawable drawable0 = AppCompatResources.b(this.getContext(), v).mutate();
            this.d = drawable0;
            Drawable[] arr_drawable = this.k;
            arr_drawable[0] = drawable0;
            arr_drawable[1] = this.c;
            LayerDrawable layerDrawable0 = new LayerDrawable(this.k);
            this.l = layerDrawable0;
            super.setImageDrawable(layerDrawable0);
            this.setCrossfade(this.e);
            return;
        }
        super.setImageResource(v);
    }

    public void setImageRotate(float f) {
        this.p = f;
        this.g();
    }

    public void setImageZoom(float f) {
        this.o = f;
        this.g();
    }

    private void setOverlay(boolean z) {
        this.b = z;
    }

    @RequiresApi(21)
    public void setRound(float f) {
        if(Float.isNaN(f)) {
            this.g = f;
            float f1 = this.f;
            this.f = -1.0f;
            this.setRoundPercent(f1);
            return;
        }
        boolean z = this.g != f;
        this.g = f;
        if(f == 0.0f) {
            this.setClipToOutline(false);
        }
        else {
            if(this.h == null) {
                this.h = new Path();
            }
            if(this.j == null) {
                this.j = new RectF();
            }
            if(this.i == null) {
                androidx.constraintlayout.utils.widget.ImageFilterView.2 imageFilterView$20 = new ViewOutlineProvider() {
                    final ImageFilterView a;

                    @Override  // android.view.ViewOutlineProvider
                    public void getOutline(View view0, Outline outline0) {
                        outline0.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), ImageFilterView.this.g);
                    }
                };
                this.i = imageFilterView$20;
                this.setOutlineProvider(imageFilterView$20);
            }
            this.setClipToOutline(true);
            int v = this.getWidth();
            int v1 = this.getHeight();
            this.j.set(0.0f, 0.0f, ((float)v), ((float)v1));
            this.h.reset();
            this.h.addRoundRect(this.j, this.g, this.g, Path.Direction.CW);
        }
        if(z) {
            this.invalidateOutline();
        }
    }

    @RequiresApi(21)
    public void setRoundPercent(float f) {
        boolean z = this.f != f;
        this.f = f;
        if(f == 0.0f) {
            this.setClipToOutline(false);
        }
        else {
            if(this.h == null) {
                this.h = new Path();
            }
            if(this.j == null) {
                this.j = new RectF();
            }
            if(this.i == null) {
                androidx.constraintlayout.utils.widget.ImageFilterView.1 imageFilterView$10 = new ViewOutlineProvider() {
                    final ImageFilterView a;

                    @Override  // android.view.ViewOutlineProvider
                    public void getOutline(View view0, Outline outline0) {
                        int v = ImageFilterView.this.getWidth();
                        int v1 = ImageFilterView.this.getHeight();
                        outline0.setRoundRect(0, 0, v, v1, ((float)Math.min(v, v1)) * ImageFilterView.this.f / 2.0f);
                    }
                };
                this.i = imageFilterView$10;
                this.setOutlineProvider(imageFilterView$10);
            }
            this.setClipToOutline(true);
            int v = this.getWidth();
            int v1 = this.getHeight();
            float f1 = ((float)Math.min(v, v1)) * this.f / 2.0f;
            this.j.set(0.0f, 0.0f, ((float)v), ((float)v1));
            this.h.reset();
            this.h.addRoundRect(this.j, f1, f1, Path.Direction.CW);
        }
        if(z) {
            this.invalidateOutline();
        }
    }

    public void setSaturation(float f) {
        this.a.e = f;
        this.a.c(this);
    }

    public void setWarmth(float f) {
        this.a.g = f;
        this.a.c(this);
    }
}

