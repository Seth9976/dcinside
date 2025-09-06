package com.canhub.cropper;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path.Direction;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener;
import android.view.ScaleGestureDetector;
import android.view.View;
import androidx.annotation.RequiresApi;
import java.util.Arrays;
import java.util.List;
import kotlin.J;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

@s0({"SMAP\nCropOverlayView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CropOverlayView.kt\ncom/canhub/cropper/CropOverlayView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1304:1\n1#2:1305\n*E\n"})
public final class CropOverlayView extends View {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public final Paint a(int v) {
            Paint paint0 = new Paint();
            paint0.setColor(v);
            return paint0;
        }

        @m
        public final Paint b(float f, int v) {
            if(f > 0.0f) {
                Paint paint0 = new Paint();
                paint0.setColor(v);
                paint0.setStrokeWidth(f);
                paint0.setStyle(Paint.Style.STROKE);
                paint0.setAntiAlias(true);
                return paint0;
            }
            return null;
        }

        @l
        public final Paint c(int v) {
            Paint paint0 = new Paint();
            paint0.setColor(v);
            paint0.setStyle(Paint.Style.FILL);
            paint0.setAntiAlias(true);
            return paint0;
        }

        @l
        public final Paint d(@l CropImageOptions cropImageOptions0) {
            L.p(cropImageOptions0, "options");
            Paint paint0 = new Paint();
            paint0.setStrokeWidth(1.0f);
            paint0.setTextSize(cropImageOptions0.c9);
            paint0.setStyle(Paint.Style.FILL);
            paint0.setTextAlign(Paint.Align.CENTER);
            paint0.setColor(cropImageOptions0.d9);
            return paint0;
        }
    }

    public interface b {
        void a(boolean arg1);
    }

    final class c extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        final CropOverlayView a;

        @Override  // android.view.ScaleGestureDetector$SimpleOnScaleGestureListener
        public boolean onScale(@l ScaleGestureDetector scaleGestureDetector0) {
            L.p(scaleGestureDetector0, "detector");
            RectF rectF0 = CropOverlayView.this.g.i();
            float f = scaleGestureDetector0.getFocusX();
            float f1 = scaleGestureDetector0.getFocusY();
            float f2 = scaleGestureDetector0.getCurrentSpanY();
            float f3 = scaleGestureDetector0.getCurrentSpanX();
            float f4 = f1 - f2 / 2.0f;
            float f5 = f - f3 / 2.0f;
            float f6 = f + f3 / 2.0f;
            float f7 = f1 + f2 / 2.0f;
            if(f5 < f6 && f4 <= f7 && f5 >= 0.0f && f6 <= CropOverlayView.this.g.d() && f4 >= 0.0f && f7 <= CropOverlayView.this.g.c()) {
                rectF0.set(f5, f4, f6, f7);
                CropOverlayView.this.g.w(rectF0);
                CropOverlayView.this.invalidate();
            }
            return true;
        }
    }

    public final class d {
        public static final int[] a;
        public static final int[] b;

        static {
            int[] arr_v = new int[com.canhub.cropper.CropImageView.d.values().length];
            try {
                arr_v[com.canhub.cropper.CropImageView.d.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.canhub.cropper.CropImageView.d.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.canhub.cropper.CropImageView.d.d.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.canhub.cropper.CropImageView.d.b.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            d.a = arr_v;
            int[] arr_v1 = new int[com.canhub.cropper.CropImageView.b.values().length];
            try {
                arr_v1[com.canhub.cropper.CropImageView.b.b.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[com.canhub.cropper.CropImageView.b.a.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            d.b = arr_v1;
        }
    }

    private int A;
    private int B;
    private float C;
    @m
    private e D;
    @m
    private com.canhub.cropper.CropImageView.d E;
    @m
    private com.canhub.cropper.CropImageView.b F;
    private boolean G;
    @l
    private String H;
    private float I;
    private int J;
    @l
    private final Rect K;
    private boolean L;
    private final float M;
    @l
    public static final a N;
    private float a;
    @m
    private Integer b;
    @m
    private CropImageOptions c;
    @m
    private ScaleGestureDetector d;
    private boolean e;
    private boolean f;
    @l
    private final y g;
    @m
    private b h;
    @l
    private final RectF i;
    @m
    private Paint j;
    @m
    private Paint k;
    @m
    private Paint l;
    @m
    private Paint m;
    @m
    private Paint n;
    @l
    private final Path o;
    @l
    private final float[] p;
    @l
    private final RectF q;
    private int r;
    private int s;
    private float t;
    private float u;
    private float v;
    private float w;
    private float x;
    @m
    private z y;
    private boolean z;

    static {
        CropOverlayView.N = new a(null);
    }

    @j
    public CropOverlayView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 2, null);
    }

    @j
    public CropOverlayView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        super(context0, attributeSet0);
        this.f = true;
        this.g = new y();
        this.i = new RectF();
        this.o = new Path();
        this.p = new float[8];
        this.q = new RectF();
        this.C = ((float)this.A) / ((float)this.B);
        this.H = "";
        this.I = 20.0f;
        this.J = -1;
        this.K = new Rect();
        this.M = TypedValue.applyDimension(1, 200.0f, Resources.getSystem().getDisplayMetrics());
    }

    public CropOverlayView(Context context0, AttributeSet attributeSet0, int v, w w0) {
        if((v & 2) != 0) {
            attributeSet0 = null;
        }
        this(context0, attributeSet0);
    }

    public final boolean A(boolean z) {
        if(this.e != z) {
            this.e = z;
            if(z && this.d == null) {
                this.d = new ScaleGestureDetector(this.getContext(), new c(this));
            }
            return true;
        }
        return false;
    }

    @RequiresApi(29)
    private final void B() {
        RectF rectF0 = this.g.i();
        List list0 = this.getSystemGestureExclusionRects();
        L.o(list0, "getSystemGestureExclusionRects(...)");
        Rect rect0 = list0.size() > 0 ? list0.get(0) : new Rect();
        List list1 = this.getSystemGestureExclusionRects();
        L.o(list1, "getSystemGestureExclusionRects(...)");
        Rect rect1 = 1 < list1.size() ? list1.get(1) : new Rect();
        List list2 = this.getSystemGestureExclusionRects();
        L.o(list2, "getSystemGestureExclusionRects(...)");
        Rect rect2 = 2 < list2.size() ? list2.get(2) : new Rect();
        int v = (int)(rectF0.left - this.w);
        rect0.left = v;
        int v1 = (int)(rectF0.right + this.w);
        rect0.right = v1;
        float f = rectF0.top;
        int v2 = (int)(f - this.w);
        rect0.top = v2;
        rect0.bottom = (int)(((float)v2) + this.M * 0.3f);
        rect1.left = v;
        rect1.right = v1;
        float f1 = rectF0.bottom;
        int v3 = (int)((f + f1) / 2.0f - 0.2f * this.M);
        rect1.top = v3;
        rect1.bottom = (int)(((float)v3) + 0.4f * this.M);
        rect2.left = rect0.left;
        rect2.right = rect0.right;
        int v4 = (int)(f1 + this.w);
        rect2.bottom = v4;
        rect2.top = (int)(((float)v4) - this.M * 0.3f);
        this.setSystemGestureExclusionRects(u.O(new Rect[]{rect0, rect1, rect2}));
    }

    private final boolean b(RectF rectF0) {
        float f12;
        float f11;
        float f = com.canhub.cropper.d.a.A(this.p);
        float f1 = com.canhub.cropper.d.a.C(this.p);
        float f2 = com.canhub.cropper.d.a.B(this.p);
        float f3 = com.canhub.cropper.d.a.v(this.p);
        if(!this.p()) {
            this.q.set(f, f1, f2, f3);
            return false;
        }
        float[] arr_f = this.p;
        float f4 = arr_f[0];
        float f5 = arr_f[1];
        float f6 = arr_f[4];
        float f7 = arr_f[5];
        float f8 = arr_f[6];
        float f9 = arr_f[7];
        if(f9 < f5) {
            float f10 = arr_f[3];
            if(f5 < f10) {
                f5 = f7;
                f11 = f8;
                f7 = f10;
                f12 = f9;
                float f13 = f6;
                f6 = arr_f[2];
                f4 = f13;
            }
            else {
                float f14 = f4;
                f4 = arr_f[2];
                f11 = f6;
                f6 = f14;
                float f15 = f7;
                f7 = f5;
                f5 = f10;
                f12 = f15;
            }
        }
        else {
            f12 = arr_f[3];
            if(f5 > f12) {
                f11 = arr_f[2];
                f6 = f8;
                f7 = f9;
            }
            else {
                f11 = f4;
                f12 = f5;
                f4 = f8;
                f5 = f9;
            }
        }
        float f16 = (f5 - f12) / (f4 - f11);
        float f17 = f12 - f16 * f11;
        float f18 = f12 - f11 * (-1.0f / f16);
        float f19 = f7 - f16 * f6;
        float f20 = f7 - f6 * (-1.0f / f16);
        float f21 = rectF0.centerY() - rectF0.top;
        float f22 = rectF0.centerX();
        float f23 = rectF0.left;
        float f24 = f21 / (f22 - f23);
        float f25 = rectF0.top - f23 * f24;
        float f26 = rectF0.right;
        float f27 = rectF0.top - -f24 * f26;
        float f28 = f16 - f24;
        float f29 = (f25 - f17) / f28;
        float f30 = Math.max(f, (f29 < f26 ? f29 : f));
        float f31 = (f25 - f18) / (-1.0f / f16 - f24);
        if(f31 >= rectF0.right) {
            f31 = f30;
        }
        float f32 = Math.max(f30, f31);
        float f33 = -1.0f / f16 - -f24;
        float f34 = (f27 - f20) / f33;
        if(f34 >= rectF0.right) {
            f34 = f32;
        }
        float f35 = Math.max(f32, f34);
        float f36 = (f27 - f18) / f33;
        if(f36 <= rectF0.left) {
            f36 = f2;
        }
        float f37 = Math.min(f2, f36);
        float f38 = (f27 - f19) / (f16 - -f24);
        if(f38 <= rectF0.left) {
            f38 = f37;
        }
        float f39 = Math.min(f37, f38);
        float f40 = (f25 - f19) / f28;
        if(f40 <= rectF0.left) {
            f40 = f39;
        }
        float f41 = Math.min(f39, f40);
        this.q.left = f35;
        this.q.top = Math.max(f1, Math.max(f16 * f35 + f17, -1.0f / f16 * f41 + f18));
        this.q.right = f41;
        this.q.bottom = Math.min(f3, Math.min(-1.0f / f16 * f35 + f20, f16 * f41 + f19));
        return true;
    }

    private final void c(Canvas canvas0) {
        RectF rectF0 = this.g.i();
        float f = Math.max(com.canhub.cropper.d.a.A(this.p), 0.0f);
        float f1 = Math.max(com.canhub.cropper.d.a.C(this.p), 0.0f);
        float f2 = Math.min(com.canhub.cropper.d.a.B(this.p), this.getWidth());
        float f3 = Math.min(com.canhub.cropper.d.a.v(this.p), this.getHeight());
        switch((this.E == null ? -1 : d.a[this.E.ordinal()])) {
            case 1: 
            case 2: 
            case 3: {
                if(!this.p()) {
                    float f4 = rectF0.top;
                    Paint paint0 = this.m;
                    L.m(paint0);
                    canvas0.drawRect(f, f1, f2, f4, paint0);
                    float f5 = rectF0.bottom;
                    Paint paint1 = this.m;
                    L.m(paint1);
                    canvas0.drawRect(f, f5, f2, f3, paint1);
                    float f6 = rectF0.top;
                    float f7 = rectF0.left;
                    float f8 = rectF0.bottom;
                    Paint paint2 = this.m;
                    L.m(paint2);
                    canvas0.drawRect(f, f6, f7, f8, paint2);
                    float f9 = rectF0.right;
                    float f10 = rectF0.top;
                    float f11 = rectF0.bottom;
                    Paint paint3 = this.m;
                    L.m(paint3);
                    canvas0.drawRect(f9, f10, f2, f11, paint3);
                    return;
                }
                this.o.reset();
                this.o.moveTo(this.p[0], this.p[1]);
                this.o.lineTo(this.p[2], this.p[3]);
                this.o.lineTo(this.p[4], this.p[5]);
                this.o.lineTo(this.p[6], this.p[7]);
                this.o.close();
                canvas0.save();
                if(Build.VERSION.SDK_INT >= 26) {
                    canvas0.clipOutPath(this.o);
                }
                else {
                    canvas0.clipPath(this.o, Region.Op.INTERSECT);
                }
                Paint paint4 = this.m;
                L.m(paint4);
                canvas0.drawRect(f, f1, f2, f3, paint4);
                canvas0.restore();
                return;
            }
            case 4: {
                this.o.reset();
                this.i.set(rectF0.left, rectF0.top, rectF0.right, rectF0.bottom);
                this.o.addOval(this.i, Path.Direction.CW);
                canvas0.save();
                if(Build.VERSION.SDK_INT >= 26) {
                    canvas0.clipOutPath(this.o);
                }
                else {
                    canvas0.clipPath(this.o, Region.Op.XOR);
                }
                Paint paint5 = this.m;
                L.m(paint5);
                canvas0.drawRect(f, f1, f2, f3, paint5);
                canvas0.restore();
                return;
            }
            default: {
                throw new IllegalStateException("Unrecognized crop shape");
            }
        }
    }

    private final void d(Canvas canvas0) {
        Paint paint0 = this.j;
        if(paint0 != null) {
            L.m(paint0);
            float f = paint0.getStrokeWidth();
            RectF rectF0 = this.g.i();
            rectF0.inset(f / 2.0f, f / 2.0f);
            int v = this.E == null ? -1 : d.a[this.E.ordinal()];
            if(v != 1 && v != 2) {
                switch(v) {
                    case 3: {
                        break;
                    }
                    case 4: {
                        Paint paint1 = this.j;
                        L.m(paint1);
                        canvas0.drawOval(rectF0, paint1);
                        return;
                    }
                    default: {
                        throw new IllegalStateException("Unrecognized crop shape");
                    }
                }
            }
            Paint paint2 = this.j;
            L.m(paint2);
            canvas0.drawRect(rectF0, paint2);
        }
    }

    private final void e(Canvas canvas0, RectF rectF0, float f, float f1) {
        float f2 = rectF0.left - f;
        float f3 = rectF0.top - f;
        Paint paint0 = this.k;
        L.m(paint0);
        canvas0.drawCircle(f2, f3, f1, paint0);
        float f4 = rectF0.right + f;
        float f5 = rectF0.top - f;
        Paint paint1 = this.k;
        L.m(paint1);
        canvas0.drawCircle(f4, f5, f1, paint1);
        float f6 = rectF0.left - f;
        float f7 = rectF0.bottom + f;
        Paint paint2 = this.k;
        L.m(paint2);
        canvas0.drawCircle(f6, f7, f1, paint2);
        float f8 = rectF0.right + f;
        float f9 = rectF0.bottom + f;
        Paint paint3 = this.k;
        L.m(paint3);
        canvas0.drawCircle(f8, f9, f1, paint3);
    }

    private final void f(Canvas canvas0, RectF rectF0, float f, float f1) {
        switch((this.E == null ? -1 : d.a[this.E.ordinal()])) {
            case 1: {
                this.g(canvas0, rectF0, f, f1, this.a);
                return;
            }
            case 2: {
                float f2 = rectF0.centerX() - this.u;
                float f3 = rectF0.top - f;
                float f4 = rectF0.centerX() + this.u;
                float f5 = rectF0.top - f;
                Paint paint0 = this.k;
                L.m(paint0);
                canvas0.drawLine(f2, f3, f4, f5, paint0);
                float f6 = rectF0.centerX() - this.u;
                float f7 = rectF0.bottom + f;
                float f8 = rectF0.centerX() + this.u;
                float f9 = rectF0.bottom + f;
                Paint paint1 = this.k;
                L.m(paint1);
                canvas0.drawLine(f6, f7, f8, f9, paint1);
                return;
            }
            case 3: {
                float f10 = rectF0.left - f;
                float f11 = rectF0.centerY() - this.u;
                float f12 = rectF0.left - f;
                float f13 = rectF0.centerY() + this.u;
                Paint paint2 = this.k;
                L.m(paint2);
                canvas0.drawLine(f10, f11, f12, f13, paint2);
                float f14 = rectF0.right + f;
                float f15 = rectF0.centerY() - this.u;
                float f16 = rectF0.right + f;
                float f17 = rectF0.centerY() + this.u;
                Paint paint3 = this.k;
                L.m(paint3);
                canvas0.drawLine(f14, f15, f16, f17, paint3);
                return;
            }
            case 4: {
                this.k(canvas0, rectF0, f, f1);
                return;
            }
            default: {
                throw new IllegalStateException("Unrecognized crop shape");
            }
        }
    }

    private final void g(Canvas canvas0, RectF rectF0, float f, float f1, float f2) {
        switch((this.F == null ? -1 : d.b[this.F.ordinal()])) {
            case -1: {
                break;
            }
            case 1: {
                this.e(canvas0, rectF0, f, f2);
                break;
            }
            case 2: {
                this.k(canvas0, rectF0, f, f1);
                return;
            }
            default: {
                throw new J();
            }
        }
    }

    public final int getAspectRatioX() {
        return this.A;
    }

    public final int getAspectRatioY() {
        return this.B;
    }

    @m
    public final com.canhub.cropper.CropImageView.b getCornerShape() {
        return this.F;
    }

    @m
    public final com.canhub.cropper.CropImageView.d getCropShape() {
        return this.E;
    }

    @l
    public final RectF getCropWindowRect() {
        return this.g.i();
    }

    @m
    public final e getGuidelines() {
        return this.D;
    }

    @m
    public final Rect getInitialCropWindowRect() {
        return this.K;
    }

    private final void h(Canvas canvas0) {
        float f;
        if(this.k != null) {
            Paint paint0 = this.j;
            if(paint0 == null) {
                f = 0.0f;
            }
            else {
                L.m(paint0);
                f = paint0.getStrokeWidth();
            }
            Paint paint1 = this.k;
            L.m(paint1);
            float f1 = paint1.getStrokeWidth();
            float f2 = (f1 - f) / 2.0f;
            float f3 = f1 / 2.0f;
            float f4 = f3 + f2;
            int v = this.E == null ? -1 : d.a[this.E.ordinal()];
            if(v == 1 || v == 2 || v == 3) {
                f3 += this.t;
            }
            else if(v != 4) {
                throw new IllegalStateException("Unrecognized crop shape");
            }
            RectF rectF0 = this.g.i();
            rectF0.inset(f3, f3);
            this.f(canvas0, rectF0, f2, f4);
            if(this.F == com.canhub.cropper.CropImageView.b.b) {
                this.k = this.b == null ? null : CropOverlayView.N.c(this.b.intValue());
                this.f(canvas0, rectF0, f2, f4);
            }
        }
    }

    private final void i(Canvas canvas0) {
        if(this.G) {
            RectF rectF0 = this.g.i();
            float f = (rectF0.left + rectF0.right) / 2.0f;
            float f1 = rectF0.top - 50.0f;
            Paint paint0 = this.n;
            if(paint0 != null) {
                paint0.setTextSize(this.I);
                paint0.setColor(this.J);
            }
            String s = this.H;
            Paint paint1 = this.n;
            L.m(paint1);
            canvas0.drawText(s, f, f1, paint1);
            canvas0.save();
        }
    }

    private final void j(Canvas canvas0) {
        float f;
        if(this.l != null) {
            Paint paint0 = this.j;
            if(paint0 == null) {
                f = 0.0f;
            }
            else {
                L.m(paint0);
                f = paint0.getStrokeWidth();
            }
            RectF rectF0 = this.g.i();
            rectF0.inset(f, f);
            float f1 = rectF0.width();
            float f2 = rectF0.height();
            int v = this.E == null ? -1 : d.a[this.E.ordinal()];
            if(v != 1 && (v != 2 && v != 3)) {
                if(v != 4) {
                    throw new IllegalStateException("Unrecognized crop shape");
                }
                float f3 = rectF0.width() / 2.0f - f;
                float f4 = rectF0.height() / 2.0f - f;
                float f5 = rectF0.left + f1 / 3.0f;
                float f6 = rectF0.right - f1 / 3.0f;
                float f7 = (float)(((double)f4) * Math.sin(Math.acos((f3 - f1 / 3.0f) / f3)));
                float f8 = rectF0.top + f4 - f7;
                float f9 = rectF0.bottom - f4 + f7;
                Paint paint1 = this.l;
                L.m(paint1);
                canvas0.drawLine(f5, f8, f5, f9, paint1);
                float f10 = rectF0.top + f4 - f7;
                float f11 = rectF0.bottom - f4 + f7;
                Paint paint2 = this.l;
                L.m(paint2);
                canvas0.drawLine(f6, f10, f6, f11, paint2);
                float f12 = rectF0.top + f2 / 3.0f;
                float f13 = rectF0.bottom - f2 / 3.0f;
                float f14 = (float)(((double)f3) * Math.cos(Math.asin((f4 - f2 / 3.0f) / f4)));
                float f15 = rectF0.left + f3 - f14;
                float f16 = rectF0.right - f3 + f14;
                Paint paint3 = this.l;
                L.m(paint3);
                canvas0.drawLine(f15, f12, f16, f12, paint3);
                float f17 = rectF0.left + f3 - f14;
                float f18 = rectF0.right - f3 + f14;
                Paint paint4 = this.l;
                L.m(paint4);
                canvas0.drawLine(f17, f13, f18, f13, paint4);
                return;
            }
            float f19 = rectF0.left + f1 / 3.0f;
            float f20 = rectF0.right - f1 / 3.0f;
            float f21 = rectF0.top;
            float f22 = rectF0.bottom;
            Paint paint5 = this.l;
            L.m(paint5);
            canvas0.drawLine(f19, f21, f19, f22, paint5);
            float f23 = rectF0.top;
            float f24 = rectF0.bottom;
            Paint paint6 = this.l;
            L.m(paint6);
            canvas0.drawLine(f20, f23, f20, f24, paint6);
            float f25 = rectF0.top + f2 / 3.0f;
            float f26 = rectF0.bottom - f2 / 3.0f;
            float f27 = rectF0.left;
            float f28 = rectF0.right;
            Paint paint7 = this.l;
            L.m(paint7);
            canvas0.drawLine(f27, f25, f28, f25, paint7);
            float f29 = rectF0.left;
            float f30 = rectF0.right;
            Paint paint8 = this.l;
            L.m(paint8);
            canvas0.drawLine(f29, f26, f30, f26, paint8);
        }
    }

    private final void k(Canvas canvas0, RectF rectF0, float f, float f1) {
        float f2 = rectF0.left - f;
        float f3 = rectF0.top - f1;
        float f4 = rectF0.left - f;
        float f5 = rectF0.top + this.u;
        Paint paint0 = this.k;
        L.m(paint0);
        canvas0.drawLine(f2, f3, f4, f5, paint0);
        float f6 = rectF0.left - f1;
        float f7 = rectF0.top - f;
        float f8 = this.u + rectF0.left;
        float f9 = rectF0.top - f;
        Paint paint1 = this.k;
        L.m(paint1);
        canvas0.drawLine(f6, f7, f8, f9, paint1);
        float f10 = rectF0.right + f;
        float f11 = rectF0.top - f1;
        float f12 = rectF0.right + f;
        float f13 = rectF0.top + this.u;
        Paint paint2 = this.k;
        L.m(paint2);
        canvas0.drawLine(f10, f11, f12, f13, paint2);
        float f14 = rectF0.right + f1;
        float f15 = rectF0.top - f;
        float f16 = rectF0.right - this.u;
        float f17 = rectF0.top - f;
        Paint paint3 = this.k;
        L.m(paint3);
        canvas0.drawLine(f14, f15, f16, f17, paint3);
        float f18 = rectF0.left - f;
        float f19 = rectF0.bottom + f1;
        float f20 = rectF0.left - f;
        float f21 = rectF0.bottom - this.u;
        Paint paint4 = this.k;
        L.m(paint4);
        canvas0.drawLine(f18, f19, f20, f21, paint4);
        float f22 = rectF0.left - f1;
        float f23 = rectF0.bottom + f;
        float f24 = this.u + rectF0.left;
        float f25 = rectF0.bottom + f;
        Paint paint5 = this.k;
        L.m(paint5);
        canvas0.drawLine(f22, f23, f24, f25, paint5);
        float f26 = rectF0.right + f;
        float f27 = rectF0.bottom + f1;
        float f28 = rectF0.right + f;
        float f29 = rectF0.bottom - this.u;
        Paint paint6 = this.k;
        L.m(paint6);
        canvas0.drawLine(f26, f27, f28, f29, paint6);
        float f30 = rectF0.right + f1;
        float f31 = rectF0.bottom + f;
        float f32 = rectF0.right - this.u;
        float f33 = rectF0.bottom + f;
        Paint paint7 = this.k;
        L.m(paint7);
        canvas0.drawLine(f30, f31, f32, f33, paint7);
    }

    private final void l(RectF rectF0) {
        if(rectF0.width() < this.g.f()) {
            float f = (this.g.f() - rectF0.width()) / 2.0f;
            rectF0.left -= f;
            rectF0.right += f;
        }
        if(rectF0.height() < this.g.e()) {
            float f1 = (this.g.e() - rectF0.height()) / 2.0f;
            rectF0.top -= f1;
            rectF0.bottom += f1;
        }
        if(rectF0.width() > this.g.d()) {
            float f2 = (rectF0.width() - this.g.d()) / 2.0f;
            rectF0.left += f2;
            rectF0.right -= f2;
        }
        if(rectF0.height() > this.g.c()) {
            float f3 = (rectF0.height() - this.g.c()) / 2.0f;
            rectF0.top += f3;
            rectF0.bottom -= f3;
        }
        this.b(rectF0);
        if(this.q.width() > 0.0f && this.q.height() > 0.0f) {
            float f4 = Math.max(this.q.left, 0.0f);
            float f5 = Math.max(this.q.top, 0.0f);
            float f6 = Math.min(this.q.right, this.getWidth());
            float f7 = Math.min(this.q.bottom, this.getHeight());
            if(rectF0.left < f4) {
                rectF0.left = f4;
            }
            if(rectF0.top < f5) {
                rectF0.top = f5;
            }
            if(rectF0.right > f6) {
                rectF0.right = f6;
            }
            if(rectF0.bottom > f7) {
                rectF0.bottom = f7;
            }
        }
        if(this.z && ((double)Math.abs(rectF0.width() - rectF0.height() * this.C)) > 0.1) {
            if(rectF0.width() > rectF0.height() * this.C) {
                float f8 = Math.abs(rectF0.height() * this.C - rectF0.width());
                rectF0.left += f8 / 2.0f;
                rectF0.right -= f8 / 2.0f;
                return;
            }
            float f9 = Math.abs(rectF0.width() / this.C - rectF0.height());
            rectF0.top += f9 / 2.0f;
            rectF0.bottom -= f9 / 2.0f;
        }
    }

    public final void m() {
        RectF rectF0 = this.getCropWindowRect();
        this.l(rectF0);
        this.g.w(rectF0);
    }

    private final void n() {
        float f = Math.max(com.canhub.cropper.d.a.A(this.p), 0.0f);
        float f1 = Math.max(com.canhub.cropper.d.a.C(this.p), 0.0f);
        float f2 = Math.min(com.canhub.cropper.d.a.B(this.p), this.getWidth());
        float f3 = Math.min(com.canhub.cropper.d.a.v(this.p), this.getHeight());
        if(f2 > f && f3 > f1) {
            RectF rectF0 = new RectF();
            this.L = true;
            float f4 = f2 - f;
            float f5 = this.v * f4;
            float f6 = f3 - f1;
            float f7 = this.v * f6;
            if(this.K.width() > 0 && this.K.height() > 0) {
                rectF0.left = ((float)this.K.left) / this.g.n() + f;
                rectF0.top = ((float)this.K.top) / this.g.m() + f1;
                rectF0.right = rectF0.left + ((float)this.K.width()) / this.g.n();
                float f8 = ((float)this.K.height()) / this.g.m();
                rectF0.left = Math.max(f, rectF0.left);
                rectF0.top = Math.max(f1, rectF0.top);
                rectF0.right = Math.min(f2, rectF0.right);
                rectF0.bottom = Math.min(f3, rectF0.bottom);
            }
            else if(!this.z || f2 <= f || f3 <= f1) {
                rectF0.left = f + f5;
                rectF0.top = f1 + f7;
                rectF0.right = f2 - f5;
                rectF0.bottom = f3 - f7;
            }
            else if(f4 / f6 > this.C) {
                rectF0.top = f1 + f7;
                rectF0.bottom = f3 - f7;
                float f9 = ((float)this.getWidth()) / 2.0f;
                this.C = ((float)this.A) / ((float)this.B);
                float f10 = Math.max(this.g.f(), rectF0.height() * this.C);
                rectF0.left = f9 - f10 / 2.0f;
                rectF0.right = f9 + f10 / 2.0f;
            }
            else {
                rectF0.left = f + f5;
                rectF0.right = f2 - f5;
                float f11 = ((float)this.getHeight()) / 2.0f;
                float f12 = Math.max(this.g.e(), rectF0.width() / this.C);
                rectF0.top = f11 - f12 / 2.0f;
                rectF0.bottom = f11 + f12 / 2.0f;
            }
            this.l(rectF0);
            this.g.w(rectF0);
        }
    }

    public final boolean o() {
        return this.z;
    }

    @Override  // android.view.View
    protected void onDraw(@l Canvas canvas0) {
        L.p(canvas0, "canvas");
        super.onDraw(canvas0);
        this.c(canvas0);
        if(this.g.x()) {
            e cropImageView$e0 = this.D;
            if(cropImageView$e0 == e.c) {
                this.j(canvas0);
            }
            else if(cropImageView$e0 == e.b && this.y != null) {
                this.j(canvas0);
            }
        }
        this.k = CropOverlayView.N.b((this.c == null ? 0.0f : this.c.y), (this.c == null ? -1 : this.c.B));
        this.i(canvas0);
        this.d(canvas0);
        this.h(canvas0);
        if(Build.VERSION.SDK_INT >= 29) {
            this.B();
        }
    }

    @Override  // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@l MotionEvent motionEvent0) {
        L.p(motionEvent0, "event");
        if(this.isEnabled()) {
            if(this.e) {
                ScaleGestureDetector scaleGestureDetector0 = this.d;
                if(scaleGestureDetector0 != null) {
                    scaleGestureDetector0.onTouchEvent(motionEvent0);
                }
            }
            switch(motionEvent0.getAction()) {
                case 0: {
                    this.q(motionEvent0.getX(), motionEvent0.getY());
                    return true;
                }
                case 2: {
                    this.r(motionEvent0.getX(), motionEvent0.getY());
                    this.getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
                case 1: 
                case 3: {
                    this.getParent().requestDisallowInterceptTouchEvent(false);
                    this.s();
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
        return false;
    }

    private final boolean p() {
        return this.p[0] != this.p[6] && this.p[1] != this.p[7];
    }

    private final void q(float f, float f1) {
        float f2 = this.w;
        com.canhub.cropper.CropImageView.d cropImageView$d0 = this.E;
        L.m(cropImageView$d0);
        z z0 = this.g.g(f, f1, f2, cropImageView$d0, this.f);
        this.y = z0;
        if(z0 != null) {
            this.invalidate();
        }
    }

    private final void r(float f, float f1) {
        if(this.y != null) {
            float f2 = this.x;
            RectF rectF0 = this.g.i();
            float f3 = this.b(rectF0) ? 0.0f : f2;
            z z0 = this.y;
            L.m(z0);
            z0.l(rectF0, f, f1, this.q, this.r, this.s, f3, this.z, this.C);
            this.g.w(rectF0);
            b cropOverlayView$b0 = this.h;
            if(cropOverlayView$b0 != null) {
                cropOverlayView$b0.a(true);
            }
            this.invalidate();
        }
    }

    private final void s() {
        if(this.y != null) {
            this.y = null;
            b cropOverlayView$b0 = this.h;
            if(cropOverlayView$b0 != null) {
                cropOverlayView$b0.a(false);
            }
            this.invalidate();
        }
    }

    public final void setAspectRatioX(int v) {
        if(v <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if(this.A != v) {
            this.A = v;
            this.C = ((float)v) / ((float)this.B);
            if(this.L) {
                this.n();
                this.invalidate();
            }
        }
    }

    public final void setAspectRatioY(int v) {
        if(v <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if(this.B != v) {
            this.B = v;
            this.C = ((float)this.A) / ((float)v);
            if(this.L) {
                this.n();
                this.invalidate();
            }
        }
    }

    public final void setCropCornerRadius(float f) {
        this.a = f;
    }

    public final void setCropCornerShape(@l com.canhub.cropper.CropImageView.b cropImageView$b0) {
        L.p(cropImageView$b0, "cropCornerShape");
        if(this.F != cropImageView$b0) {
            this.F = cropImageView$b0;
            this.invalidate();
        }
    }

    public final void setCropLabelText(@m String s) {
        if(s != null) {
            this.H = s;
        }
    }

    public final void setCropLabelTextColor(int v) {
        this.J = v;
        this.invalidate();
    }

    public final void setCropLabelTextSize(float f) {
        this.I = f;
        this.invalidate();
    }

    public final void setCropShape(@l com.canhub.cropper.CropImageView.d cropImageView$d0) {
        L.p(cropImageView$d0, "cropShape");
        if(this.E != cropImageView$d0) {
            this.E = cropImageView$d0;
            this.invalidate();
        }
    }

    public final void setCropWindowChangeListener(@m b cropOverlayView$b0) {
        this.h = cropOverlayView$b0;
    }

    public final void setCropWindowRect(@l RectF rectF0) {
        L.p(rectF0, "rect");
        this.g.w(rectF0);
    }

    public final void setCropperTextLabelVisibility(boolean z) {
        this.G = z;
        this.invalidate();
    }

    public final void setFixedAspectRatio(boolean z) {
        if(this.z != z) {
            this.z = z;
            if(this.L) {
                this.n();
                this.invalidate();
            }
        }
    }

    public final void setGuidelines(@l e cropImageView$e0) {
        L.p(cropImageView$e0, "guidelines");
        if(this.D != cropImageView$e0) {
            this.D = cropImageView$e0;
            if(this.L) {
                this.invalidate();
            }
        }
    }

    public final void setInitialAttributeValues(@l CropImageOptions cropImageOptions0) {
        L.p(cropImageOptions0, "options");
        boolean z = L.g(this.c, cropImageOptions0);
        boolean z1 = this.c == null || cropImageOptions0.t != this.c.t || this.c == null || cropImageOptions0.u != this.c.u || this.c == null || cropImageOptions0.v != this.c.v;
        this.c = cropImageOptions0;
        this.g.v(cropImageOptions0.I, cropImageOptions0.J);
        this.g.u(cropImageOptions0.K, cropImageOptions0.L);
        if(z) {
            return;
        }
        this.g.t(cropImageOptions0);
        this.J = cropImageOptions0.d9;
        this.I = cropImageOptions0.c9;
        this.H = cropImageOptions0.e9 == null ? "" : cropImageOptions0.e9;
        this.G = cropImageOptions0.k;
        this.a = cropImageOptions0.e;
        this.F = cropImageOptions0.d;
        this.E = cropImageOptions0.c;
        this.x = cropImageOptions0.f;
        this.setEnabled(cropImageOptions0.q);
        this.D = cropImageOptions0.h;
        this.z = cropImageOptions0.t;
        this.setAspectRatioX(cropImageOptions0.u);
        this.setAspectRatioY(cropImageOptions0.v);
        this.e = cropImageOptions0.o;
        if(cropImageOptions0.o && this.d == null) {
            this.d = new ScaleGestureDetector(this.getContext(), new c(this));
        }
        this.f = cropImageOptions0.p;
        this.w = cropImageOptions0.g;
        this.v = cropImageOptions0.s;
        this.j = CropOverlayView.N.b(cropImageOptions0.w, cropImageOptions0.x);
        this.t = cropImageOptions0.z;
        this.u = cropImageOptions0.A;
        this.b = cropImageOptions0.C;
        this.k = CropOverlayView.N.b(cropImageOptions0.y, cropImageOptions0.B);
        this.l = CropOverlayView.N.b(cropImageOptions0.D, cropImageOptions0.E);
        this.m = CropOverlayView.N.a(cropImageOptions0.F);
        this.n = CropOverlayView.N.d(cropImageOptions0);
        if(z1) {
            this.n();
        }
        this.invalidate();
        if(z1) {
            b cropOverlayView$b0 = this.h;
            if(cropOverlayView$b0 != null) {
                cropOverlayView$b0.a(false);
            }
        }
    }

    public final void setInitialCropWindowRect(@m Rect rect0) {
        Rect rect1 = this.K;
        if(rect0 == null) {
            rect0 = com.canhub.cropper.d.a.o();
        }
        rect1.set(rect0);
        if(this.L) {
            this.n();
            this.invalidate();
            b cropOverlayView$b0 = this.h;
            if(cropOverlayView$b0 != null) {
                cropOverlayView$b0.a(false);
            }
        }
    }

    public final void setSnapRadius(float f) {
        this.x = f;
    }

    public final void t() {
        if(this.L) {
            this.setCropWindowRect(com.canhub.cropper.d.a.p());
            this.n();
            this.invalidate();
        }
    }

    public final void u() {
        if(this.L) {
            this.n();
            this.invalidate();
            b cropOverlayView$b0 = this.h;
            if(cropOverlayView$b0 != null) {
                cropOverlayView$b0.a(false);
            }
        }
    }

    public final void v(@m float[] arr_f, int v, int v1) {
        if(arr_f == null || !Arrays.equals(this.p, arr_f)) {
            if(arr_f == null) {
                Arrays.fill(this.p, 0.0f);
            }
            else {
                System.arraycopy(arr_f, 0, this.p, 0, arr_f.length);
            }
            this.r = v;
            this.s = v1;
            RectF rectF0 = this.g.i();
            if(rectF0.width() == 0.0f || rectF0.height() == 0.0f) {
                this.n();
            }
        }
    }

    public final boolean w(boolean z) {
        if(this.f != z) {
            this.f = z;
            return true;
        }
        return false;
    }

    public final void x(float f, float f1, float f2, float f3) {
        this.g.s(f, f1, f2, f3);
    }

    public final void y(int v, int v1) {
        this.g.u(v, v1);
    }

    public final void z(int v, int v1) {
        this.g.v(v, v1);
    }
}

