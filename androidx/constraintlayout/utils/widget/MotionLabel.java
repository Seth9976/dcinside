package androidx.constraintlayout.utils.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path.Direction;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.R.attr;
import androidx.constraintlayout.motion.widget.FloatLayout;
import androidx.constraintlayout.widget.R.styleable;
import j..util.Objects;

public class MotionLabel extends View implements FloatLayout {
    private float A;
    private float B;
    private float C;
    private Drawable D;
    Matrix E;
    private Bitmap F;
    private BitmapShader G;
    private Matrix H;
    private float I;
    private float J;
    private float K;
    private float L;
    Paint M;
    float M8;
    private int N;
    float N8;
    Rect O;
    float O8;
    Paint P;
    float P8;
    float Q;
    static final String Q8 = "MotionLabel";
    private static final int R8 = 1;
    private static final int S8 = 2;
    private static final int T8 = 3;
    TextPaint a;
    Path b;
    private int c;
    private int d;
    private boolean e;
    private float f;
    private float g;
    ViewOutlineProvider h;
    RectF i;
    private float j;
    private float k;
    private int l;
    private int m;
    private float n;
    private String o;
    boolean p;
    private Rect q;
    private int r;
    private int s;
    private int t;
    private int u;
    private String v;
    private Layout w;
    private int x;
    private int y;
    private boolean z;

    public MotionLabel(Context context0) {
        super(context0);
        this.a = new TextPaint();
        this.b = new Path();
        this.c = 0xFFFF;
        this.d = 0xFFFF;
        this.e = false;
        this.f = 0.0f;
        this.g = NaNf;
        this.j = 48.0f;
        this.k = NaNf;
        this.n = 0.0f;
        this.o = "Hello World";
        this.p = true;
        this.q = new Rect();
        this.r = 1;
        this.s = 1;
        this.t = 1;
        this.u = 1;
        this.x = 0x800033;
        this.y = 0;
        this.z = false;
        this.I = NaNf;
        this.J = NaNf;
        this.K = 0.0f;
        this.L = 0.0f;
        this.M = new Paint();
        this.N = 0;
        this.M8 = NaNf;
        this.N8 = NaNf;
        this.O8 = NaNf;
        this.P8 = NaNf;
        this.g(context0, null);
    }

    public MotionLabel(Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.a = new TextPaint();
        this.b = new Path();
        this.c = 0xFFFF;
        this.d = 0xFFFF;
        this.e = false;
        this.f = 0.0f;
        this.g = NaNf;
        this.j = 48.0f;
        this.k = NaNf;
        this.n = 0.0f;
        this.o = "Hello World";
        this.p = true;
        this.q = new Rect();
        this.r = 1;
        this.s = 1;
        this.t = 1;
        this.u = 1;
        this.x = 0x800033;
        this.y = 0;
        this.z = false;
        this.I = NaNf;
        this.J = NaNf;
        this.K = 0.0f;
        this.L = 0.0f;
        this.M = new Paint();
        this.N = 0;
        this.M8 = NaNf;
        this.N8 = NaNf;
        this.O8 = NaNf;
        this.P8 = NaNf;
        this.g(context0, attributeSet0);
    }

    public MotionLabel(Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a = new TextPaint();
        this.b = new Path();
        this.c = 0xFFFF;
        this.d = 0xFFFF;
        this.e = false;
        this.f = 0.0f;
        this.g = NaNf;
        this.j = 48.0f;
        this.k = NaNf;
        this.n = 0.0f;
        this.o = "Hello World";
        this.p = true;
        this.q = new Rect();
        this.r = 1;
        this.s = 1;
        this.t = 1;
        this.u = 1;
        this.x = 0x800033;
        this.y = 0;
        this.z = false;
        this.I = NaNf;
        this.J = NaNf;
        this.K = 0.0f;
        this.L = 0.0f;
        this.M = new Paint();
        this.N = 0;
        this.M8 = NaNf;
        this.N8 = NaNf;
        this.O8 = NaNf;
        this.P8 = NaNf;
        this.g(context0, attributeSet0);
    }

    @Override  // androidx.constraintlayout.motion.widget.FloatLayout
    public void a(float f, float f1, float f2, float f3) {
        this.A = f - ((float)(((int)(f + 0.5f))));
        int v = ((int)(f2 + 0.5f)) - ((int)(f + 0.5f));
        int v1 = ((int)(f3 + 0.5f)) - ((int)(f1 + 0.5f));
        float f4 = f2 - f;
        this.B = f4;
        float f5 = f3 - f1;
        this.C = f5;
        this.d(f, f1, f2, f3);
        if(this.getMeasuredHeight() != v1 || this.getMeasuredWidth() != v) {
            this.measure(View.MeasureSpec.makeMeasureSpec(v, 0x40000000), View.MeasureSpec.makeMeasureSpec(v1, 0x40000000));
        }
        super.layout(((int)(f + 0.5f)), ((int)(f1 + 0.5f)), ((int)(f2 + 0.5f)), ((int)(f3 + 0.5f)));
        if(this.z) {
            if(this.O == null) {
                this.P = new Paint();
                this.O = new Rect();
                this.P.set(this.a);
                this.Q = this.P.getTextSize();
            }
            this.B = f4;
            this.C = f5;
            this.P.getTextBounds(this.o, 0, this.o.length(), this.O);
            int v2 = this.O.width();
            float f6 = ((float)this.O.height()) * 1.3f;
            float f7 = f4 - ((float)this.s) - ((float)this.r);
            float f8 = f5 - ((float)this.u) - ((float)this.t);
            if(((float)v2) * f8 > f6 * f7) {
                this.a.setTextSize(this.Q * f7 / ((float)v2));
            }
            else {
                this.a.setTextSize(this.Q * f8 / f6);
            }
            if(this.e || !Float.isNaN(this.k)) {
                this.f((Float.isNaN(this.k) ? 1.0f : this.j / this.k));
            }
        }
    }

    private void d(float f, float f1, float f2, float f3) {
        if(this.H == null) {
            return;
        }
        this.B = f2 - f;
        this.C = f3 - f1;
        this.k();
    }

    Bitmap e(Bitmap bitmap0, int v) {
        int v1 = bitmap0.getWidth() / 2;
        int v2 = bitmap0.getHeight() / 2;
        Bitmap bitmap1 = Bitmap.createScaledBitmap(bitmap0, v1, v2, true);
        for(int v3 = 0; v3 < v && v1 >= 0x20 && v2 >= 0x20; ++v3) {
            v1 /= 2;
            v2 /= 2;
            bitmap1 = Bitmap.createScaledBitmap(bitmap1, v1, v2, true);
        }
        return bitmap1;
    }

    void f(float f) {
        if(!this.e && f == 1.0f) {
            return;
        }
        this.b.reset();
        String s = this.o;
        int v = s.length();
        this.a.getTextBounds(s, 0, v, this.q);
        this.a.getTextPath(s, 0, v, 0.0f, 0.0f, this.b);
        if(f != 1.0f) {
            Log.v("MotionLabel", ".(null:-1) f() scale " + f);
            Matrix matrix0 = new Matrix();
            matrix0.postScale(f, f);
            this.b.transform(matrix0);
        }
        --this.q.right;
        ++this.q.left;
        ++this.q.bottom;
        --this.q.top;
        RectF rectF0 = new RectF();
        rectF0.bottom = (float)this.getHeight();
        rectF0.right = (float)this.getWidth();
        this.p = false;
    }

    private void g(Context context0, AttributeSet attributeSet0) {
        this.setUpTheme(context0);
        if(attributeSet0 != null) {
            TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, styleable.MotionLabel);
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                if(v2 == styleable.MotionLabel_android_text) {
                    this.setText(typedArray0.getText(v2));
                }
                else if(v2 == styleable.MotionLabel_android_fontFamily) {
                    this.v = typedArray0.getString(v2);
                }
                else if(v2 == styleable.MotionLabel_scaleFromTextSize) {
                    this.k = (float)typedArray0.getDimensionPixelSize(v2, ((int)this.k));
                }
                else if(v2 == styleable.MotionLabel_android_textSize) {
                    this.j = (float)typedArray0.getDimensionPixelSize(v2, ((int)this.j));
                }
                else if(v2 == styleable.MotionLabel_android_textStyle) {
                    this.l = typedArray0.getInt(v2, this.l);
                }
                else if(v2 == styleable.MotionLabel_android_typeface) {
                    this.m = typedArray0.getInt(v2, this.m);
                }
                else if(v2 == styleable.MotionLabel_android_textColor) {
                    this.c = typedArray0.getColor(v2, this.c);
                }
                else if(v2 == styleable.MotionLabel_borderRound) {
                    float f = typedArray0.getDimension(v2, this.g);
                    this.g = f;
                    this.setRound(f);
                }
                else if(v2 == styleable.MotionLabel_borderRoundPercent) {
                    float f1 = typedArray0.getFloat(v2, this.f);
                    this.f = f1;
                    this.setRoundPercent(f1);
                }
                else if(v2 == styleable.MotionLabel_android_gravity) {
                    this.setGravity(typedArray0.getInt(v2, -1));
                }
                else if(v2 == styleable.MotionLabel_android_autoSizeTextType) {
                    this.y = typedArray0.getInt(v2, 0);
                }
                else if(v2 == styleable.MotionLabel_textOutlineColor) {
                    this.d = typedArray0.getInt(v2, this.d);
                    this.e = true;
                }
                else if(v2 == styleable.MotionLabel_textOutlineThickness) {
                    this.n = typedArray0.getDimension(v2, this.n);
                    this.e = true;
                }
                else if(v2 == styleable.MotionLabel_textBackground) {
                    this.D = typedArray0.getDrawable(v2);
                    this.e = true;
                }
                else if(v2 == styleable.MotionLabel_textBackgroundPanX) {
                    this.M8 = typedArray0.getFloat(v2, this.M8);
                }
                else if(v2 == styleable.MotionLabel_textBackgroundPanY) {
                    this.N8 = typedArray0.getFloat(v2, this.N8);
                }
                else if(v2 == styleable.MotionLabel_textPanX) {
                    this.K = typedArray0.getFloat(v2, this.K);
                }
                else if(v2 == styleable.MotionLabel_textPanY) {
                    this.L = typedArray0.getFloat(v2, this.L);
                }
                else if(v2 == styleable.MotionLabel_textBackgroundRotate) {
                    this.P8 = typedArray0.getFloat(v2, this.P8);
                }
                else if(v2 == styleable.MotionLabel_textBackgroundZoom) {
                    this.O8 = typedArray0.getFloat(v2, this.O8);
                }
                else if(v2 == styleable.MotionLabel_textureHeight) {
                    this.I = typedArray0.getDimension(v2, this.I);
                }
                else if(v2 == styleable.MotionLabel_textureWidth) {
                    this.J = typedArray0.getDimension(v2, this.J);
                }
                else if(v2 == styleable.MotionLabel_textureEffect) {
                    this.N = typedArray0.getInt(v2, this.N);
                }
            }
            typedArray0.recycle();
        }
        this.j();
        this.i();
    }

    private float getHorizontalOffset() {
        float f = Float.isNaN(this.k) ? 1.0f : this.j / this.k;
        float f1 = this.a.measureText(this.o, 0, this.o.length());
        return Float.isNaN(this.B) ? (((float)this.getMeasuredWidth()) - ((float)this.getPaddingLeft()) - ((float)this.getPaddingRight()) - f * f1) * (this.K + 1.0f) / 2.0f : (this.B - ((float)this.getPaddingLeft()) - ((float)this.getPaddingRight()) - f * f1) * (this.K + 1.0f) / 2.0f;
    }

    public float getRound() {
        return this.g;
    }

    public float getRoundPercent() {
        return this.f;
    }

    public float getScaleFromTextSize() {
        return this.k;
    }

    public float getTextBackgroundPanX() {
        return this.M8;
    }

    public float getTextBackgroundPanY() {
        return this.N8;
    }

    public float getTextBackgroundRotate() {
        return this.P8;
    }

    public float getTextBackgroundZoom() {
        return this.O8;
    }

    public int getTextOutlineColor() {
        return this.d;
    }

    public float getTextPanX() {
        return this.K;
    }

    public float getTextPanY() {
        return this.L;
    }

    public float getTextureHeight() {
        return this.I;
    }

    public float getTextureWidth() {
        return this.J;
    }

    public Typeface getTypeface() {
        return this.a.getTypeface();
    }

    private float getVerticalOffset() {
        float f = Float.isNaN(this.k) ? 1.0f : this.j / this.k;
        Paint.FontMetrics paint$FontMetrics0 = this.a.getFontMetrics();
        return Float.isNaN(this.C) ? (((float)this.getMeasuredHeight()) - ((float)this.getPaddingTop()) - ((float)this.getPaddingBottom()) - (paint$FontMetrics0.descent - paint$FontMetrics0.ascent) * f) * (1.0f - this.L) / 2.0f - f * paint$FontMetrics0.ascent : (this.C - ((float)this.getPaddingTop()) - ((float)this.getPaddingBottom()) - (paint$FontMetrics0.descent - paint$FontMetrics0.ascent) * f) * (1.0f - this.L) / 2.0f - f * paint$FontMetrics0.ascent;
    }

    private void h(String s, int v, int v1) {
        Typeface typeface0;
        if(s == null) {
            typeface0 = null;
        }
        else {
            typeface0 = Typeface.create(s, v1);
            if(typeface0 != null) {
                this.setTypeface(typeface0);
                return;
            }
        }
        boolean z = true;
        switch(v) {
            case 1: {
                typeface0 = Typeface.SANS_SERIF;
                break;
            }
            case 2: {
                typeface0 = Typeface.SERIF;
                break;
            }
            default: {
                if(v == 3) {
                    typeface0 = Typeface.MONOSPACE;
                }
            }
        }
        float f = 0.0f;
        if(v1 > 0) {
            Typeface typeface1 = typeface0 == null ? Typeface.defaultFromStyle(v1) : Typeface.create(typeface0, v1);
            this.setTypeface(typeface1);
            int v2 = ~(typeface1 == null ? 0 : typeface1.getStyle()) & v1;
            TextPaint textPaint0 = this.a;
            if((v2 & 1) == 0) {
                z = false;
            }
            textPaint0.setFakeBoldText(z);
            TextPaint textPaint1 = this.a;
            if((v2 & 2) != 0) {
                f = -0.25f;
            }
            textPaint1.setTextSkewX(f);
            return;
        }
        this.a.setFakeBoldText(false);
        this.a.setTextSkewX(0.0f);
        this.setTypeface(typeface0);
    }

    void i() {
        this.r = this.getPaddingLeft();
        this.s = this.getPaddingRight();
        this.t = this.getPaddingTop();
        this.u = this.getPaddingBottom();
        this.h(this.v, this.m, this.l);
        this.a.setColor(this.c);
        this.a.setStrokeWidth(this.n);
        this.a.setStyle(Paint.Style.FILL_AND_STROKE);
        this.a.setFlags(0x80);
        this.setTextSize(this.j);
        this.a.setAntiAlias(true);
    }

    private void j() {
        if(this.D != null) {
            this.H = new Matrix();
            int v = this.D.getIntrinsicWidth();
            int v1 = this.D.getIntrinsicHeight();
            int v2 = 0x80;
            if(v <= 0) {
                v = this.getWidth();
                if(v == 0) {
                    v = Float.isNaN(this.J) ? 0x80 : ((int)this.J);
                }
            }
            if(v1 <= 0) {
                v1 = this.getHeight();
                if(v1 == 0) {
                    if(!Float.isNaN(this.I)) {
                        v2 = (int)this.I;
                    }
                    v1 = v2;
                }
            }
            if(this.N != 0) {
                v /= 2;
                v1 /= 2;
            }
            this.F = Bitmap.createBitmap(v, v1, Bitmap.Config.ARGB_8888);
            Canvas canvas0 = new Canvas(this.F);
            this.D.setBounds(0, 0, canvas0.getWidth(), canvas0.getHeight());
            this.D.setFilterBitmap(true);
            this.D.draw(canvas0);
            if(this.N != 0) {
                this.F = this.e(this.F, 4);
            }
            this.G = new BitmapShader(this.F, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
        }
    }

    private void k() {
        float f = 0.0f;
        float f1 = Float.isNaN(this.M8) ? 0.0f : this.M8;
        float f2 = Float.isNaN(this.N8) ? 0.0f : this.N8;
        float f3 = Float.isNaN(this.O8) ? 1.0f : this.O8;
        if(!Float.isNaN(this.P8)) {
            f = this.P8;
        }
        this.H.reset();
        float f4 = (float)this.F.getWidth();
        float f5 = (float)this.F.getHeight();
        float f6 = Float.isNaN(this.J) ? this.B : this.J;
        float f7 = Float.isNaN(this.I) ? this.C : this.I;
        float f8 = f3 * (f4 * f7 < f5 * f6 ? f6 / f4 : f7 / f5);
        this.H.postScale(f8, f8);
        float f9 = f4 * f8;
        float f10 = f6 - f9;
        float f11 = f8 * f5;
        float f12 = Float.isNaN(this.I) ? f7 - f11 : this.I / 2.0f;
        if(!Float.isNaN(this.J)) {
            f10 = this.J / 2.0f;
        }
        this.H.postTranslate((f1 * f10 + f6 - f9) * 0.5f, (f2 * f12 + f7 - f11) * 0.5f);
        this.H.postRotate(f, f6 / 2.0f, f7 / 2.0f);
        this.G.setLocalMatrix(this.H);
    }

    @Override  // android.view.View
    public void layout(int v, int v1, int v2, int v3) {
        super.layout(v, v1, v2, v3);
        boolean z = Float.isNaN(this.k);
        float f = z ? 1.0f : this.j / this.k;
        this.B = (float)(v2 - v);
        this.C = (float)(v3 - v1);
        if(this.z) {
            if(this.O == null) {
                this.P = new Paint();
                this.O = new Rect();
                this.P.set(this.a);
                this.Q = this.P.getTextSize();
            }
            this.P.getTextBounds(this.o, 0, this.o.length(), this.O);
            int v4 = this.O.width();
            int v5 = (int)(((float)this.O.height()) * 1.3f);
            float f1 = this.B - ((float)this.s) - ((float)this.r);
            float f2 = this.C - ((float)this.u) - ((float)this.t);
            if(!z) {
                f = ((float)v4) * f2 > ((float)v5) * f1 ? f1 / ((float)v4) : f2 / ((float)v5);
            }
            else if(((float)v4) * f2 > ((float)v5) * f1) {
                this.a.setTextSize(this.Q * f1 / ((float)v4));
            }
            else {
                this.a.setTextSize(this.Q * f2 / ((float)v5));
            }
        }
        if(this.e || !z) {
            this.d(((float)v), ((float)v1), ((float)v2), ((float)v3));
            this.f(f);
        }
    }

    @Override  // android.view.View
    protected void onDraw(@NonNull Canvas canvas0) {
        float f = Float.isNaN(this.k) ? 1.0f : this.j / this.k;
        super.onDraw(canvas0);
        if(!this.e && f == 1.0f) {
            float f1 = (float)this.r;
            float f2 = this.getHorizontalOffset();
            float f3 = (float)this.t;
            float f4 = this.getVerticalOffset();
            canvas0.drawText(this.o, this.A + (f1 + f2), f3 + f4, this.a);
            return;
        }
        if(this.p) {
            this.f(f);
        }
        if(this.E == null) {
            this.E = new Matrix();
        }
        if(this.e) {
            this.M.set(this.a);
            this.E.reset();
            float f5 = ((float)this.r) + this.getHorizontalOffset();
            float f6 = ((float)this.t) + this.getVerticalOffset();
            this.E.postTranslate(f5, f6);
            this.E.preScale(f, f);
            this.b.transform(this.E);
            if(this.G == null) {
                this.a.setColor(this.c);
            }
            else {
                this.a.setFilterBitmap(true);
                this.a.setShader(this.G);
            }
            this.a.setStyle(Paint.Style.FILL);
            this.a.setStrokeWidth(this.n);
            canvas0.drawPath(this.b, this.a);
            if(this.G != null) {
                this.a.setShader(null);
            }
            this.a.setColor(this.d);
            this.a.setStyle(Paint.Style.STROKE);
            this.a.setStrokeWidth(this.n);
            canvas0.drawPath(this.b, this.a);
            this.E.reset();
            this.E.postTranslate(-f5, -f6);
            this.b.transform(this.E);
            this.a.set(this.M);
            return;
        }
        float f7 = ((float)this.r) + this.getHorizontalOffset();
        float f8 = ((float)this.t) + this.getVerticalOffset();
        this.E.reset();
        this.E.preTranslate(f7, f8);
        this.b.transform(this.E);
        this.a.setColor(this.c);
        this.a.setStyle(Paint.Style.FILL_AND_STROKE);
        this.a.setStrokeWidth(this.n);
        canvas0.drawPath(this.b, this.a);
        this.E.reset();
        this.E.preTranslate(-f7, -f8);
        this.b.transform(this.E);
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        int v2 = View.MeasureSpec.getMode(v);
        int v3 = View.MeasureSpec.getMode(v1);
        int v4 = View.MeasureSpec.getSize(v);
        int v5 = View.MeasureSpec.getSize(v1);
        this.z = false;
        this.r = this.getPaddingLeft();
        this.s = this.getPaddingRight();
        this.t = this.getPaddingTop();
        this.u = this.getPaddingBottom();
        if(v2 != 0x40000000 || v3 != 0x40000000) {
            this.a.getTextBounds(this.o, 0, this.o.length(), this.q);
            if(v2 != 0x40000000) {
                v4 = (int)(((float)this.q.width()) + 0.99999f);
            }
            v4 += this.r + this.s;
            if(v3 != 0x40000000) {
                int v6 = (int)(((float)this.a.getFontMetricsInt(null)) + 0.99999f);
                if(v3 == 0x80000000) {
                    v6 = Math.min(v5, v6);
                }
                v5 = this.t + this.u + v6;
            }
        }
        else if(this.y != 0) {
            this.z = true;
        }
        this.setMeasuredDimension(v4, v5);
    }

    @SuppressLint({"RtlHardcoded"})
    public void setGravity(int v) {
        if((v & 0x800007) == 0) {
            v |= 0x800003;
        }
        if((v & 0x70) == 0) {
            v |= 0x30;
        }
        if(v != this.x) {
            this.invalidate();
        }
        this.x = v;
        switch(v & 0x70) {
            case 0x30: {
                this.L = -1.0f;
                break;
            }
            case 80: {
                this.L = 1.0f;
                break;
            }
            default: {
                this.L = 0.0f;
            }
        }
        if((v & 0x800007) != 3) {
            switch(v & 0x800007) {
                case 5: {
                    this.K = 1.0f;
                    return;
                }
                case 0x800003: {
                    break;
                }
                default: {
                    if((v & 0x800007) != 0x800005) {
                        this.K = 0.0f;
                        return;
                    }
                    this.K = 1.0f;
                    return;
                }
            }
        }
        this.K = -1.0f;
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
            if(this.b == null) {
                this.b = new Path();
            }
            if(this.i == null) {
                this.i = new RectF();
            }
            if(this.h == null) {
                androidx.constraintlayout.utils.widget.MotionLabel.2 motionLabel$20 = new ViewOutlineProvider() {
                    final MotionLabel a;

                    @Override  // android.view.ViewOutlineProvider
                    public void getOutline(View view0, Outline outline0) {
                        outline0.setRoundRect(0, 0, MotionLabel.this.getWidth(), MotionLabel.this.getHeight(), MotionLabel.this.g);
                    }
                };
                this.h = motionLabel$20;
                this.setOutlineProvider(motionLabel$20);
            }
            this.setClipToOutline(true);
            int v = this.getWidth();
            int v1 = this.getHeight();
            this.i.set(0.0f, 0.0f, ((float)v), ((float)v1));
            this.b.reset();
            this.b.addRoundRect(this.i, this.g, this.g, Path.Direction.CW);
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
            if(this.b == null) {
                this.b = new Path();
            }
            if(this.i == null) {
                this.i = new RectF();
            }
            if(this.h == null) {
                androidx.constraintlayout.utils.widget.MotionLabel.1 motionLabel$10 = new ViewOutlineProvider() {
                    final MotionLabel a;

                    @Override  // android.view.ViewOutlineProvider
                    public void getOutline(View view0, Outline outline0) {
                        int v = MotionLabel.this.getWidth();
                        int v1 = MotionLabel.this.getHeight();
                        outline0.setRoundRect(0, 0, v, v1, ((float)Math.min(v, v1)) * MotionLabel.this.f / 2.0f);
                    }
                };
                this.h = motionLabel$10;
                this.setOutlineProvider(motionLabel$10);
            }
            this.setClipToOutline(true);
            int v = this.getWidth();
            int v1 = this.getHeight();
            float f1 = ((float)Math.min(v, v1)) * this.f / 2.0f;
            this.i.set(0.0f, 0.0f, ((float)v), ((float)v1));
            this.b.reset();
            this.b.addRoundRect(this.i, f1, f1, Path.Direction.CW);
        }
        if(z) {
            this.invalidateOutline();
        }
    }

    public void setScaleFromTextSize(float f) {
        this.k = f;
    }

    public void setText(CharSequence charSequence0) {
        this.o = charSequence0.toString();
        this.invalidate();
    }

    public void setTextBackgroundPanX(float f) {
        this.M8 = f;
        this.k();
        this.invalidate();
    }

    public void setTextBackgroundPanY(float f) {
        this.N8 = f;
        this.k();
        this.invalidate();
    }

    public void setTextBackgroundRotate(float f) {
        this.P8 = f;
        this.k();
        this.invalidate();
    }

    public void setTextBackgroundZoom(float f) {
        this.O8 = f;
        this.k();
        this.invalidate();
    }

    public void setTextFillColor(int v) {
        this.c = v;
        this.invalidate();
    }

    public void setTextOutlineColor(int v) {
        this.d = v;
        this.e = true;
        this.invalidate();
    }

    public void setTextOutlineThickness(float f) {
        this.n = f;
        this.e = true;
        if(Float.isNaN(f)) {
            this.n = 1.0f;
            this.e = false;
        }
        this.invalidate();
    }

    public void setTextPanX(float f) {
        this.K = f;
        this.invalidate();
    }

    public void setTextPanY(float f) {
        this.L = f;
        this.invalidate();
    }

    public void setTextSize(float f) {
        this.j = f;
        TextPaint textPaint0 = this.a;
        if(!Float.isNaN(this.k)) {
            f = this.k;
        }
        textPaint0.setTextSize(f);
        this.f((Float.isNaN(this.k) ? 1.0f : this.j / this.k));
        this.requestLayout();
        this.invalidate();
    }

    public void setTextureHeight(float f) {
        this.I = f;
        this.k();
        this.invalidate();
    }

    public void setTextureWidth(float f) {
        this.J = f;
        this.k();
        this.invalidate();
    }

    public void setTypeface(Typeface typeface0) {
        if(!Objects.equals(this.a.getTypeface(), typeface0)) {
            this.a.setTypeface(typeface0);
            if(this.w != null) {
                this.w = null;
                this.requestLayout();
                this.invalidate();
            }
        }
    }

    private void setUpTheme(Context context0) {
        TypedValue typedValue0 = new TypedValue();
        context0.getTheme().resolveAttribute(attr.colorPrimary, typedValue0, true);
        this.c = typedValue0.data;
        this.a.setColor(typedValue0.data);
    }
}

