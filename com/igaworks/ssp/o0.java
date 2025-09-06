package com.igaworks.ssp;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.Log;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;

public class o0 extends ImageView {
    static abstract class a {
        static final int[] a;

        static {
            int[] arr_v = new int[ImageView.ScaleType.values().length];
            a.a = arr_v;
            try {
                arr_v[ImageView.ScaleType.CENTER.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[ImageView.ScaleType.FIT_START.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[ImageView.ScaleType.FIT_END.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private float a;
    private float b;
    private ColorStateList c;
    private boolean d;
    private boolean e;
    private Shader.TileMode f;
    private Shader.TileMode g;
    private int h;
    private Drawable i;
    private Drawable j;
    private ImageView.ScaleType k;
    private float l;
    private float m;
    public static final Shader.TileMode n = null;
    private static final ImageView.ScaleType[] o = null;
    static final boolean p = true;

    static {
        o0.n = Shader.TileMode.CLAMP;
        o0.o = new ImageView.ScaleType[]{ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    }

    public o0(Context context0, float f) {
        super(context0);
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = ColorStateList.valueOf(0xFF000000);
        this.d = false;
        this.e = false;
        this.f = o0.n;
        this.g = o0.n;
        this.l = 0.0f;
        this.m = 0.0f;
        this.a = f;
    }

    private Drawable a() {
        Resources resources0 = this.getResources();
        if(resources0 == null) {
            return null;
        }
        int v = this.h;
        if(v != 0) {
            try {
                return n0.b(resources0.getDrawable(v));
            }
            catch(Exception exception0) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.h, exception0);
                this.h = 0;
                return n0.b(null);
            }
        }
        return n0.b(null);
    }

    private void a(Drawable drawable0) {
        if(drawable0 == null) {
            return;
        }
        if(drawable0 instanceof n0) {
            ((n0)drawable0).a(this.k).b(this.a).a(this.b).a(this.c).a(this.d).a(this.f).b(this.g);
            return;
        }
        if(drawable0 instanceof LayerDrawable) {
            int v = ((LayerDrawable)drawable0).getNumberOfLayers();
            for(int v1 = 0; v1 < v; ++v1) {
                this.a(((LayerDrawable)drawable0).getDrawable(v1));
            }
        }
    }

    private void a(boolean z) {
        if(this.e) {
            if(z) {
                this.j = n0.b(this.j);
            }
            this.a(this.j);
        }
    }

    private void b() {
        this.a(this.i);
    }

    @Override  // android.widget.ImageView
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.invalidate();
    }

    public int getBorderColor() {
        return this.c.getDefaultColor();
    }

    public ColorStateList getBorderColors() {
        return this.c;
    }

    public float getBorderWidth() {
        return this.b;
    }

    public float getCornerRadius() {
        return this.a;
    }

    @Override  // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.k;
    }

    public Shader.TileMode getTileModeX() {
        return this.f;
    }

    public Shader.TileMode getTileModeY() {
        return this.g;
    }

    @Override  // android.view.View
    public void setBackground(Drawable drawable0) {
        this.setBackgroundDrawable(drawable0);
    }

    @Override  // android.view.View
    @Deprecated
    public void setBackgroundDrawable(Drawable drawable0) {
        this.j = drawable0;
        this.a(true);
        super.setBackgroundDrawable(this.j);
    }

    public void setBorderColor(int v) {
        this.setBorderColor(ColorStateList.valueOf(v));
    }

    public void setBorderColor(ColorStateList colorStateList0) {
        if(this.c.equals(colorStateList0)) {
            return;
        }
        if(colorStateList0 == null) {
            colorStateList0 = ColorStateList.valueOf(0xFF000000);
        }
        this.c = colorStateList0;
        this.b();
        this.a(false);
        if(this.b > 0.0f) {
            this.invalidate();
        }
    }

    public void setBorderWidth(float f) {
        if(this.b == f) {
            return;
        }
        this.b = f;
        this.b();
        this.a(false);
        this.invalidate();
    }

    public void setBorderWidth(int v) {
        this.setBorderWidth(this.getResources().getDimension(v));
    }

    public void setCornerRadius(float f) {
        if(this.a == f) {
            return;
        }
        this.a = f;
        this.b();
        this.a(false);
    }

    public void setCornerRadius(int v) {
        this.setCornerRadius(this.getResources().getDimension(v));
    }

    @Override  // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap0) {
        this.h = 0;
        this.i = n0.a(bitmap0);
        this.b();
        super.setImageDrawable(this.i);
    }

    @Override  // android.widget.ImageView
    public void setImageDrawable(Drawable drawable0) {
        this.h = 0;
        this.i = n0.b(drawable0);
        this.b();
        super.setImageDrawable(this.i);
    }

    @Override  // android.widget.ImageView
    public void setImageResource(int v) {
        if(this.h != v) {
            this.h = v;
            this.i = this.a();
            this.b();
            super.setImageDrawable(this.i);
        }
    }

    @Override  // android.widget.ImageView
    public void setImageURI(Uri uri0) {
        super.setImageURI(uri0);
        this.setImageDrawable(this.getDrawable());
    }

    public void setOval(boolean z) {
        this.d = z;
        this.b();
        this.a(false);
        this.invalidate();
    }

    @Override  // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType imageView$ScaleType0) {
        if(!o0.p && imageView$ScaleType0 == null) {
            throw new AssertionError();
        }
        if(this.k != imageView$ScaleType0) {
            this.k = imageView$ScaleType0;
            switch(a.a[imageView$ScaleType0.ordinal()]) {
                case 1: 
                case 2: 
                case 3: 
                case 4: 
                case 5: 
                case 6: 
                case 7: {
                    super.setScaleType(ImageView.ScaleType.FIT_XY);
                    break;
                }
                default: {
                    super.setScaleType(imageView$ScaleType0);
                }
            }
            this.b();
            this.a(false);
            this.invalidate();
        }
    }

    public void setTileModeX(Shader.TileMode shader$TileMode0) {
        if(this.f == shader$TileMode0) {
            return;
        }
        this.f = shader$TileMode0;
        this.b();
        this.a(false);
        this.invalidate();
    }

    public void setTileModeY(Shader.TileMode shader$TileMode0) {
        if(this.g == shader$TileMode0) {
            return;
        }
        this.g = shader$TileMode0;
        this.b();
        this.a(false);
        this.invalidate();
    }
}

