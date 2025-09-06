package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
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
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.R.styleable;

public class ImageFilterButton extends AppCompatImageButton {
    private ImageMatrix d;
    private float e;
    private float f;
    private float g;
    private Path h;
    ViewOutlineProvider i;
    RectF j;
    Drawable[] k;
    LayerDrawable l;
    private boolean m;
    private Drawable n;
    private Drawable o;
    private float p;
    private float q;
    private float r;
    private float s;

    public ImageFilterButton(Context context0) {
        super(context0);
        this.d = new ImageMatrix();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = NaNf;
        this.k = new Drawable[2];
        this.m = true;
        this.n = null;
        this.o = null;
        this.p = NaNf;
        this.q = NaNf;
        this.r = NaNf;
        this.s = NaNf;
        this.c(context0, null);
    }

    public ImageFilterButton(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.d = new ImageMatrix();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = NaNf;
        this.k = new Drawable[2];
        this.m = true;
        this.n = null;
        this.o = null;
        this.p = NaNf;
        this.q = NaNf;
        this.r = NaNf;
        this.s = NaNf;
        this.c(context0, attributeSet0);
    }

    public ImageFilterButton(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.d = new ImageMatrix();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = NaNf;
        this.k = new Drawable[2];
        this.m = true;
        this.n = null;
        this.o = null;
        this.p = NaNf;
        this.q = NaNf;
        this.r = NaNf;
        this.s = NaNf;
        this.c(context0, attributeSet0);
    }

    private void c(Context context0, AttributeSet attributeSet0) {
        this.setPadding(0, 0, 0, 0);
        if(attributeSet0 != null) {
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.ImageFilterView);
            int v = typedArray0.getIndexCount();
            this.n = typedArray0.getDrawable(styleable.ImageFilterView_altSrc);
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
                else if(v2 == styleable.ImageFilterView_round) {
                    this.setRound(typedArray0.getDimension(v2, 0.0f));
                }
                else if(v2 == styleable.ImageFilterView_roundPercent) {
                    this.setRoundPercent(typedArray0.getFloat(v2, 0.0f));
                }
                else if(v2 == styleable.ImageFilterView_overlay) {
                    this.setOverlay(typedArray0.getBoolean(v2, this.m));
                }
                else if(v2 == styleable.ImageFilterView_imagePanX) {
                    this.setImagePanX(typedArray0.getFloat(v2, this.p));
                }
                else if(v2 == styleable.ImageFilterView_imagePanY) {
                    this.setImagePanY(typedArray0.getFloat(v2, this.q));
                }
                else if(v2 == styleable.ImageFilterView_imageRotate) {
                    this.setImageRotate(typedArray0.getFloat(v2, this.s));
                }
                else if(v2 == styleable.ImageFilterView_imageZoom) {
                    this.setImageZoom(typedArray0.getFloat(v2, this.r));
                }
            }
            typedArray0.recycle();
            Drawable drawable0 = this.getDrawable();
            this.o = drawable0;
            if(this.n != null && drawable0 != null) {
                Drawable[] arr_drawable = this.k;
                Drawable drawable1 = this.getDrawable().mutate();
                this.o = drawable1;
                arr_drawable[0] = drawable1;
                Drawable[] arr_drawable1 = this.k;
                arr_drawable1[1] = this.n.mutate();
                LayerDrawable layerDrawable0 = new LayerDrawable(this.k);
                this.l = layerDrawable0;
                layerDrawable0.getDrawable(1).setAlpha(((int)(this.e * 255.0f)));
                if(!this.m) {
                    this.l.getDrawable(0).setAlpha(((int)((1.0f - this.e) * 255.0f)));
                }
                super.setImageDrawable(this.l);
                return;
            }
            Drawable drawable2 = this.getDrawable();
            this.o = drawable2;
            if(drawable2 != null) {
                Drawable[] arr_drawable2 = this.k;
                Drawable drawable3 = drawable2.mutate();
                this.o = drawable3;
                arr_drawable2[0] = drawable3;
            }
        }
    }

    private void d() {
        float f = 0.0f;
        if(Float.isNaN(this.p) && Float.isNaN(this.q) && Float.isNaN(this.r) && Float.isNaN(this.s)) {
            return;
        }
        float f1 = Float.isNaN(this.p) ? 0.0f : this.p;
        float f2 = Float.isNaN(this.q) ? 0.0f : this.q;
        float f3 = Float.isNaN(this.r) ? 1.0f : this.r;
        if(!Float.isNaN(this.s)) {
            f = this.s;
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

    @Override  // android.view.View
    public void draw(@NonNull Canvas canvas0) {
        super.draw(canvas0);
    }

    private void e() {
        if(Float.isNaN(this.p) && Float.isNaN(this.q) && Float.isNaN(this.r) && Float.isNaN(this.s)) {
            this.setScaleType(ImageView.ScaleType.FIT_CENTER);
            return;
        }
        this.d();
    }

    public float getContrast() {
        return this.d.f;
    }

    public float getCrossfade() {
        return this.e;
    }

    public float getImagePanX() {
        return this.p;
    }

    public float getImagePanY() {
        return this.q;
    }

    public float getImageRotate() {
        return this.s;
    }

    public float getImageZoom() {
        return this.r;
    }

    public float getRound() {
        return this.g;
    }

    public float getRoundPercent() {
        return this.f;
    }

    public float getSaturation() {
        return this.d.e;
    }

    public float getWarmth() {
        return this.d.g;
    }

    @Override  // android.view.View
    public void layout(int v, int v1, int v2, int v3) {
        super.layout(v, v1, v2, v3);
        this.d();
    }

    public void setAltImageResource(int v) {
        Drawable drawable0 = AppCompatResources.b(this.getContext(), v).mutate();
        this.n = drawable0;
        Drawable[] arr_drawable = this.k;
        arr_drawable[0] = this.o;
        arr_drawable[1] = drawable0;
        LayerDrawable layerDrawable0 = new LayerDrawable(this.k);
        this.l = layerDrawable0;
        super.setImageDrawable(layerDrawable0);
        this.setCrossfade(this.e);
    }

    public void setBrightness(float f) {
        ImageMatrix imageFilterView$ImageMatrix0 = this.d;
        imageFilterView$ImageMatrix0.d = f;
        imageFilterView$ImageMatrix0.c(this);
    }

    public void setContrast(float f) {
        this.d.f = f;
        this.d.c(this);
    }

    public void setCrossfade(float f) {
        this.e = f;
        if(this.k != null) {
            if(!this.m) {
                this.l.getDrawable(0).setAlpha(((int)((1.0f - this.e) * 255.0f)));
            }
            this.l.getDrawable(1).setAlpha(((int)(this.e * 255.0f)));
            super.setImageDrawable(this.l);
        }
    }

    @Override  // androidx.appcompat.widget.AppCompatImageButton
    public void setImageDrawable(Drawable drawable0) {
        if(this.n != null && drawable0 != null) {
            Drawable drawable1 = drawable0.mutate();
            this.o = drawable1;
            Drawable[] arr_drawable = this.k;
            arr_drawable[0] = drawable1;
            arr_drawable[1] = this.n;
            LayerDrawable layerDrawable0 = new LayerDrawable(this.k);
            this.l = layerDrawable0;
            super.setImageDrawable(layerDrawable0);
            this.setCrossfade(this.e);
            return;
        }
        super.setImageDrawable(drawable0);
    }

    public void setImagePanX(float f) {
        this.p = f;
        this.e();
    }

    public void setImagePanY(float f) {
        this.q = f;
        this.e();
    }

    @Override  // androidx.appcompat.widget.AppCompatImageButton
    public void setImageResource(int v) {
        if(this.n != null) {
            Drawable drawable0 = AppCompatResources.b(this.getContext(), v).mutate();
            this.o = drawable0;
            Drawable[] arr_drawable = this.k;
            arr_drawable[0] = drawable0;
            arr_drawable[1] = this.n;
            LayerDrawable layerDrawable0 = new LayerDrawable(this.k);
            this.l = layerDrawable0;
            super.setImageDrawable(layerDrawable0);
            this.setCrossfade(this.e);
            return;
        }
        super.setImageResource(v);
    }

    public void setImageRotate(float f) {
        this.s = f;
        this.e();
    }

    public void setImageZoom(float f) {
        this.r = f;
        this.e();
    }

    private void setOverlay(boolean z) {
        this.m = z;
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
                androidx.constraintlayout.utils.widget.ImageFilterButton.2 imageFilterButton$20 = new ViewOutlineProvider() {
                    final ImageFilterButton a;

                    @Override  // android.view.ViewOutlineProvider
                    public void getOutline(View view0, Outline outline0) {
                        outline0.setRoundRect(0, 0, ImageFilterButton.this.getWidth(), ImageFilterButton.this.getHeight(), ImageFilterButton.this.g);
                    }
                };
                this.i = imageFilterButton$20;
                this.setOutlineProvider(imageFilterButton$20);
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
                androidx.constraintlayout.utils.widget.ImageFilterButton.1 imageFilterButton$10 = new ViewOutlineProvider() {
                    final ImageFilterButton a;

                    @Override  // android.view.ViewOutlineProvider
                    public void getOutline(View view0, Outline outline0) {
                        int v = ImageFilterButton.this.getWidth();
                        int v1 = ImageFilterButton.this.getHeight();
                        outline0.setRoundRect(0, 0, v, v1, ((float)Math.min(v, v1)) * ImageFilterButton.this.f / 2.0f);
                    }
                };
                this.i = imageFilterButton$10;
                this.setOutlineProvider(imageFilterButton$10);
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
        this.d.e = f;
        this.d.c(this);
    }

    public void setWarmth(float f) {
        this.d.g = f;
        this.d.c(this);
    }
}

