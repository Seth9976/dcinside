package com.github.chrisbanes.photoview;

import android.content.Context;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.OverScroller;

public class l implements View.OnLayoutChangeListener, View.OnTouchListener {
    class a implements d {
        final l a;

        @Override  // com.github.chrisbanes.photoview.d
        public void a(float f, float f1) {
            if(l.this.j.e()) {
                return;
            }
            if(l.this.x != null) {
                l.this.x.a(f, f1);
            }
            l.this.m.postTranslate(f, f1);
            l.this.B();
            ViewParent viewParent0 = l.this.h.getParent();
            if(l.this.f && !l.this.j.e() && !l.this.g) {
                if((l.this.z == 2 || l.this.z == 0 && f >= 1.0f || l.this.z == 1 && f <= -1.0f || l.this.A == 0 && f1 >= 1.0f || l.this.A == 1 && f1 <= -1.0f) && viewParent0 != null) {
                    viewParent0.requestDisallowInterceptTouchEvent(false);
                }
            }
            else if(viewParent0 != null) {
                viewParent0.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override  // com.github.chrisbanes.photoview.d
        public void b(float f, float f1, float f2, float f3) {
            Context context0 = l.this.h.getContext();
            f l$f0 = new f(l.this, context0);
            l.this.y = l$f0;
            l.this.y.b(l.this.J(l.this.h), l.this.I(l.this.h), ((int)f2), ((int)f3));
            f l$f1 = l.this.y;
            l.this.h.post(l$f1);
        }

        @Override  // com.github.chrisbanes.photoview.d
        public void c(float f, float f1, float f2) {
            if(l.this.N() < l.this.e || f < 1.0f) {
                if(l.this.v != null) {
                    l.this.v.a(f, f1, f2);
                }
                l.this.m.postScale(f, f, f1, f2);
                l.this.B();
            }
        }
    }

    static class com.github.chrisbanes.photoview.l.d {
        static final int[] a;

        static {
            int[] arr_v = new int[ImageView.ScaleType.values().length];
            com.github.chrisbanes.photoview.l.d.a = arr_v;
            try {
                arr_v[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.github.chrisbanes.photoview.l.d.a[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.github.chrisbanes.photoview.l.d.a[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.github.chrisbanes.photoview.l.d.a[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    class e implements Runnable {
        private final float a;
        private final float b;
        private final long c;
        private final float d;
        private final float e;
        final l f;

        public e(float f, float f1, float f2, float f3) {
            this.a = f2;
            this.b = f3;
            this.c = System.currentTimeMillis();
            this.d = f;
            this.e = f1;
        }

        private float a() {
            float f = (float)l.this.b;
            return l.this.a.getInterpolation(Math.min(1.0f, ((float)(System.currentTimeMillis() - this.c)) * 1.0f / f));
        }

        @Override
        public void run() {
            float f = this.a();
            float f1 = l.this.N();
            l.this.E.c((this.d + (this.e - this.d) * f) / f1, this.a, this.b);
            if(f < 1.0f) {
                b.a(l.this.h, this);
            }
        }
    }

    class f implements Runnable {
        private final OverScroller a;
        private int b;
        private int c;
        final l d;

        public f(Context context0) {
            this.a = new OverScroller(context0);
        }

        public void a() {
            this.a.forceFinished(true);
        }

        public void b(int v, int v1, int v2, int v3) {
            int v9;
            int v8;
            int v6;
            int v5;
            RectF rectF0 = l.this.E();
            if(rectF0 == null) {
                return;
            }
            int v4 = Math.round(-rectF0.left);
            if(((float)v) < rectF0.width()) {
                v5 = Math.round(rectF0.width() - ((float)v));
                v6 = 0;
            }
            else {
                v6 = v4;
                v5 = v6;
            }
            int v7 = Math.round(-rectF0.top);
            if(((float)v1) < rectF0.height()) {
                v8 = Math.round(rectF0.height() - ((float)v1));
                v9 = 0;
            }
            else {
                v9 = v7;
                v8 = v9;
            }
            this.b = v4;
            this.c = v7;
            if(v4 != v5 || v7 != v8) {
                this.a.fling(v4, v7, v2, v3, v6, v5, v9, v8, 0, 0);
            }
        }

        @Override
        public void run() {
            if(this.a.isFinished()) {
                return;
            }
            if(this.a.computeScrollOffset()) {
                int v = this.a.getCurrX();
                int v1 = this.a.getCurrY();
                l.this.m.postTranslate(((float)(this.b - v)), ((float)(this.c - v1)));
                l.this.B();
                this.b = v;
                this.c = v1;
                b.a(l.this.h, this);
            }
        }
    }

    private int A;
    private float B;
    private boolean C;
    private ImageView.ScaleType D;
    private d E;
    private static float F = 3.0f;
    private static float G = 1.75f;
    private static float H = 1.0f;
    private static int I = 200;
    private static final int J = -1;
    private static final int K = 0;
    private static final int L = 1;
    private static final int M = 2;
    private static final int N = -1;
    private static final int O = 0;
    private static final int P = 1;
    private static final int Q = 2;
    private static int X = 1;
    private Interpolator a;
    private int b;
    private float c;
    private float d;
    private float e;
    private boolean f;
    private boolean g;
    private ImageView h;
    private GestureDetector i;
    private c j;
    private final Matrix k;
    private final Matrix l;
    private final Matrix m;
    private final RectF n;
    private final float[] o;
    private com.github.chrisbanes.photoview.e p;
    private g q;
    private com.github.chrisbanes.photoview.f r;
    private k s;
    private View.OnClickListener t;
    private View.OnLongClickListener u;
    private h v;
    private i w;
    private j x;
    private f y;
    private int z;

    static {
    }

    public l(ImageView imageView0) {
        class com.github.chrisbanes.photoview.l.b extends GestureDetector.SimpleOnGestureListener {
            final l a;

            // 去混淆评级： 低(23)
            @Override  // android.view.GestureDetector$SimpleOnGestureListener
            public boolean onFling(MotionEvent motionEvent0, MotionEvent motionEvent1, float f, float f1) {
                if(l.this.w == null || l.this.N() > 1.0f) {
                    return false;
                }
                return motionEvent0.getPointerCount() > 1 || motionEvent1.getPointerCount() > 1 ? false : l.this.w.onFling(motionEvent0, motionEvent1, f, f1);
            }

            @Override  // android.view.GestureDetector$SimpleOnGestureListener
            public void onLongPress(MotionEvent motionEvent0) {
                if(l.this.u != null) {
                    l.this.u.onLongClick(l.this.h);
                }
            }
        }


        class com.github.chrisbanes.photoview.l.c implements GestureDetector.OnDoubleTapListener {
            final l a;

            @Override  // android.view.GestureDetector$OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent motionEvent0) {
                try {
                    float f = l.this.N();
                    float f1 = motionEvent0.getX();
                    float f2 = motionEvent0.getY();
                    if(f < l.this.L()) {
                        l.this.o0(l.this.L(), f1, f2, true);
                        return true;
                    }
                    if(f >= l.this.L() && f < l.this.K()) {
                        l.this.o0(l.this.K(), f1, f2, true);
                        return true;
                    }
                    l.this.o0(l.this.M(), f1, f2, true);
                }
                catch(ArrayIndexOutOfBoundsException unused_ex) {
                }
                return true;
            }

            @Override  // android.view.GestureDetector$OnDoubleTapListener
            public boolean onDoubleTapEvent(MotionEvent motionEvent0) {
                return false;
            }

            @Override  // android.view.GestureDetector$OnDoubleTapListener
            public boolean onSingleTapConfirmed(MotionEvent motionEvent0) {
                if(l.this.t != null) {
                    l.this.t.onClick(l.this.h);
                }
                RectF rectF0 = l.this.E();
                float f = motionEvent0.getX();
                float f1 = motionEvent0.getY();
                if(l.this.s != null) {
                    l.this.s.a(l.this.h, f, f1);
                }
                if(rectF0 != null) {
                    if(rectF0.contains(f, f1)) {
                        float f2 = f - rectF0.left;
                        float f3 = rectF0.width();
                        float f4 = f1 - rectF0.top;
                        float f5 = rectF0.height();
                        if(l.this.q != null) {
                            l.this.q.a(l.this.h, f2 / f3, f4 / f5);
                        }
                        return true;
                    }
                    if(l.this.r != null) {
                        l.this.r.a(l.this.h);
                    }
                }
                return false;
            }
        }

        this.a = new AccelerateDecelerateInterpolator();
        this.b = l.I;
        this.c = l.H;
        this.d = l.G;
        this.e = l.F;
        this.f = true;
        this.g = false;
        this.k = new Matrix();
        this.l = new Matrix();
        this.m = new Matrix();
        this.n = new RectF();
        this.o = new float[9];
        this.z = 2;
        this.A = 2;
        this.C = true;
        this.D = ImageView.ScaleType.FIT_CENTER;
        this.E = new a(this);
        this.h = imageView0;
        imageView0.setOnTouchListener(this);
        imageView0.addOnLayoutChangeListener(this);
        if(imageView0.isInEditMode()) {
            return;
        }
        this.B = 0.0f;
        this.j = new c(imageView0.getContext(), this.E);
        GestureDetector gestureDetector0 = new GestureDetector(imageView0.getContext(), new com.github.chrisbanes.photoview.l.b(this));
        this.i = gestureDetector0;
        gestureDetector0.setOnDoubleTapListener(new com.github.chrisbanes.photoview.l.c(this));
    }

    private void A() {
        f l$f0 = this.y;
        if(l$f0 != null) {
            l$f0.a();
            this.y = null;
        }
    }

    private void B() {
        if(this.C()) {
            this.X(this.G());
        }
    }

    private boolean C() {
        float f4;
        RectF rectF0 = this.F(this.G());
        if(rectF0 == null) {
            return false;
        }
        float f = rectF0.height();
        float f1 = rectF0.width();
        float f2 = (float)this.I(this.h);
        float f3 = 0.0f;
        if(f <= f2) {
            switch(com.github.chrisbanes.photoview.l.d.a[this.D.ordinal()]) {
                case 2: {
                    f4 = -rectF0.top;
                    break;
                }
                case 3: {
                    f4 = f2 - f - rectF0.top;
                    break;
                }
                default: {
                    f4 = (f2 - f) / 2.0f - rectF0.top;
                }
            }
            this.A = 2;
        }
        else {
            float f5 = rectF0.top;
            if(f5 > 0.0f) {
                this.A = 0;
                f4 = -f5;
            }
            else {
                float f6 = rectF0.bottom;
                if(f6 < f2) {
                    this.A = 1;
                    f4 = f2 - f6;
                }
                else {
                    this.A = -1;
                    f4 = 0.0f;
                }
            }
        }
        float f7 = (float)this.J(this.h);
        if(f1 <= f7) {
            switch(com.github.chrisbanes.photoview.l.d.a[this.D.ordinal()]) {
                case 2: {
                    f3 = -rectF0.left;
                    break;
                }
                case 3: {
                    f3 = f7 - f1 - rectF0.left;
                    break;
                }
                default: {
                    f3 = (f7 - f1) / 2.0f - rectF0.left;
                }
            }
            this.z = 2;
        }
        else {
            float f8 = rectF0.left;
            if(f8 > 0.0f) {
                this.z = 0;
                f3 = -f8;
            }
            else {
                float f9 = rectF0.right;
                if(f9 < f7) {
                    f3 = f7 - f9;
                    this.z = 1;
                }
                else {
                    this.z = -1;
                }
            }
        }
        this.m.postTranslate(f3, f4);
        return true;
    }

    public void D(Matrix matrix0) {
        matrix0.set(this.G());
    }

    public RectF E() {
        this.C();
        return this.F(this.G());
    }

    private RectF F(Matrix matrix0) {
        Drawable drawable0 = this.h.getDrawable();
        if(drawable0 != null) {
            float f = (float)drawable0.getIntrinsicWidth();
            float f1 = (float)drawable0.getIntrinsicHeight();
            this.n.set(0.0f, 0.0f, f, f1);
            matrix0.mapRect(this.n);
            return this.n;
        }
        return null;
    }

    private Matrix G() {
        this.l.set(this.k);
        this.l.postConcat(this.m);
        return this.l;
    }

    public Matrix H() {
        return this.l;
    }

    private int I(ImageView imageView0) {
        return imageView0.getHeight() - imageView0.getPaddingTop() - imageView0.getPaddingBottom();
    }

    private int J(ImageView imageView0) {
        return imageView0.getWidth() - imageView0.getPaddingLeft() - imageView0.getPaddingRight();
    }

    public float K() {
        return this.e;
    }

    public float L() {
        return this.d;
    }

    public float M() {
        return this.c;
    }

    public float N() {
        return (float)Math.sqrt(((float)Math.pow(this.Q(this.m, 0), 2.0)) + ((float)Math.pow(this.Q(this.m, 3), 2.0)));
    }

    public ImageView.ScaleType O() {
        return this.D;
    }

    public void P(Matrix matrix0) {
        matrix0.set(this.m);
    }

    private float Q(Matrix matrix0, int v) {
        matrix0.getValues(this.o);
        return this.o[v];
    }

    @Deprecated
    public boolean R() {
        return this.C;
    }

    public boolean S() {
        return this.C;
    }

    private void T() {
        this.m.reset();
        this.l0(this.B);
        this.X(this.G());
        this.C();
    }

    public void U(boolean z) {
        this.f = z;
    }

    public void V(float f) {
        this.B = f % 360.0f;
        this.v0();
        this.l0(this.B);
        this.B();
    }

    public boolean W(Matrix matrix0) {
        if(matrix0 == null) {
            throw new IllegalArgumentException("Matrix cannot be null");
        }
        if(this.h.getDrawable() == null) {
            return false;
        }
        this.m.set(matrix0);
        this.B();
        return true;
    }

    private void X(Matrix matrix0) {
        this.h.setImageMatrix(matrix0);
        if(this.p != null) {
            RectF rectF0 = this.F(matrix0);
            if(rectF0 != null) {
                this.p.a(rectF0);
            }
        }
    }

    public void Y(float f) {
        m.a(this.c, this.d, f);
        this.e = f;
    }

    public void Z(float f) {
        m.a(this.c, f, this.e);
        this.d = f;
    }

    public void a0(float f) {
        m.a(f, this.d, this.e);
        this.c = f;
    }

    public void b0(View.OnClickListener view$OnClickListener0) {
        this.t = view$OnClickListener0;
    }

    public void c0(GestureDetector.OnDoubleTapListener gestureDetector$OnDoubleTapListener0) {
        this.i.setOnDoubleTapListener(gestureDetector$OnDoubleTapListener0);
    }

    public void d0(View.OnLongClickListener view$OnLongClickListener0) {
        this.u = view$OnLongClickListener0;
    }

    public void e0(com.github.chrisbanes.photoview.e e0) {
        this.p = e0;
    }

    public void f0(com.github.chrisbanes.photoview.f f0) {
        this.r = f0;
    }

    public void g0(g g0) {
        this.q = g0;
    }

    public void h0(h h0) {
        this.v = h0;
    }

    static float i() [...] // 潜在的解密器

    public void i0(i i0) {
        this.w = i0;
    }

    static int j() [...] // 潜在的解密器

    public void j0(j j0) {
        this.x = j0;
    }

    public void k0(k k0) {
        this.s = k0;
    }

    public void l0(float f) {
        this.m.postRotate(f % 360.0f);
        this.B();
    }

    public void m0(float f) {
        this.m.setRotate(f % 360.0f);
        this.B();
    }

    public void n0(float f) {
        this.p0(f, false);
    }

    public void o0(float f, float f1, float f2, boolean z) {
        if(f < this.c || f > this.e) {
            throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
        }
        if(z) {
            this.h.post(new e(this, this.N(), f, f1, f2));
            return;
        }
        this.m.setScale(f, f, f1, f2);
        this.B();
    }

    @Override  // android.view.View$OnLayoutChangeListener
    public void onLayoutChange(View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
        if(v != v4 || v1 != v5 || v2 != v6 || v3 != v7) {
            this.w0(this.h.getDrawable());
        }
    }

    @Override  // android.view.View$OnTouchListener
    public boolean onTouch(View view0, MotionEvent motionEvent0) {
        boolean z1;
        boolean z = false;
        if(this.C && m.c(((ImageView)view0))) {
            int v = motionEvent0.getAction();
            switch(v) {
                case 0: {
                    ViewParent viewParent0 = view0.getParent();
                    if(viewParent0 != null) {
                        viewParent0.requestDisallowInterceptTouchEvent(true);
                    }
                    this.A();
                    z1 = false;
                    break;
                }
                case 1: {
                label_13:
                    if(this.N() < this.c) {
                        RectF rectF0 = this.E();
                        if(rectF0 == null) {
                            z1 = false;
                        }
                        else {
                            view0.post(new e(this, this.N(), this.c, rectF0.centerX(), rectF0.centerY()));
                            z1 = true;
                        }
                    }
                    else if(this.N() > this.e) {
                        RectF rectF1 = this.E();
                        if(rectF1 == null) {
                            z1 = false;
                        }
                        else {
                            view0.post(new e(this, this.N(), this.e, rectF1.centerX(), rectF1.centerY()));
                            z1 = true;
                        }
                    }
                    else {
                        z1 = false;
                    }
                    break;
                }
                default: {
                    if(v == 3) {
                        goto label_13;
                    }
                    else {
                        z1 = false;
                    }
                }
            }
            c c0 = this.j;
            if(c0 != null) {
                boolean z2 = c0.e();
                boolean z3 = this.j.d();
                boolean z4 = this.j.f(motionEvent0);
                if(!z2 && !this.j.e() && (!z3 && !this.j.d())) {
                    z = true;
                }
                this.g = z;
                return this.i == null || !this.i.onTouchEvent(motionEvent0) ? z4 : true;
            }
            return this.i == null || !this.i.onTouchEvent(motionEvent0) ? z1 : true;
        }
        return false;
    }

    public void p0(float f, boolean z) {
        this.o0(f, ((float)(this.h.getRight() / 2)), ((float)(this.h.getBottom() / 2)), z);
    }

    public void q0(float f, float f1, float f2) {
        m.a(f, f1, f2);
        this.c = f;
        this.d = f1;
        this.e = f2;
    }

    public void r0(ImageView.ScaleType imageView$ScaleType0) {
        if(m.d(imageView$ScaleType0) && imageView$ScaleType0 != this.D) {
            this.D = imageView$ScaleType0;
            this.v0();
        }
    }

    public void s0(Interpolator interpolator0) {
        this.a = interpolator0;
    }

    public void t0(int v) {
        this.b = v;
    }

    public void u0(boolean z) {
        this.C = z;
        this.v0();
    }

    public void v0() {
        if(this.C) {
            this.w0(this.h.getDrawable());
            return;
        }
        this.T();
    }

    private void w0(Drawable drawable0) {
        if(drawable0 == null) {
            return;
        }
        float f = (float)this.J(this.h);
        float f1 = (float)this.I(this.h);
        int v = drawable0.getIntrinsicWidth();
        int v1 = drawable0.getIntrinsicHeight();
        this.k.reset();
        float f2 = f / ((float)v);
        float f3 = f1 / ((float)v1);
        ImageView.ScaleType imageView$ScaleType0 = this.D;
        if(imageView$ScaleType0 == ImageView.ScaleType.CENTER) {
            this.k.postTranslate((f - ((float)v)) / 2.0f, (f1 - ((float)v1)) / 2.0f);
        }
        else if(imageView$ScaleType0 == ImageView.ScaleType.CENTER_CROP) {
            float f4 = Math.max(f2, f3);
            this.k.postScale(f4, f4);
            this.k.postTranslate((f - ((float)v) * f4) / 2.0f, (f1 - ((float)v1) * f4) / 2.0f);
        }
        else if(imageView$ScaleType0 == ImageView.ScaleType.CENTER_INSIDE) {
            float f5 = Math.min(1.0f, Math.min(f2, f3));
            this.k.postScale(f5, f5);
            this.k.postTranslate((f - ((float)v) * f5) / 2.0f, (f1 - ((float)v1) * f5) / 2.0f);
        }
        else {
            RectF rectF0 = new RectF(0.0f, 0.0f, ((float)v), ((float)v1));
            RectF rectF1 = new RectF(0.0f, 0.0f, f, f1);
            if(((int)this.B) % 180 != 0) {
                rectF0 = new RectF(0.0f, 0.0f, ((float)v1), ((float)v));
            }
            switch(com.github.chrisbanes.photoview.l.d.a[this.D.ordinal()]) {
                case 1: {
                    this.k.setRectToRect(rectF0, rectF1, Matrix.ScaleToFit.CENTER);
                    break;
                }
                case 2: {
                    this.k.setRectToRect(rectF0, rectF1, Matrix.ScaleToFit.START);
                    break;
                }
                case 3: {
                    this.k.setRectToRect(rectF0, rectF1, Matrix.ScaleToFit.END);
                    break;
                }
                case 4: {
                    this.k.setRectToRect(rectF0, rectF1, Matrix.ScaleToFit.FILL);
                }
            }
        }
        this.T();
    }
}

