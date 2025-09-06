package com.dcinside.app.gif.view;

import A3.p;
import A3.r;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.appcompat.widget.AppCompatImageView;
import com.dcinside.app.internal.s;
import kotlin.S0;
import kotlin.coroutines.g;
import kotlin.coroutines.i;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.enums.d;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

public final class RangeSeekBar extends AppCompatImageView {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public final Bitmap a(@l Drawable drawable0) {
            L.p(drawable0, "drawable");
            if(drawable0 instanceof BitmapDrawable) {
                Bitmap bitmap0 = ((BitmapDrawable)drawable0).getBitmap();
                L.o(bitmap0, "getBitmap(...)");
                return bitmap0;
            }
            int v = drawable0.getBounds().isEmpty() ? drawable0.getIntrinsicWidth() : drawable0.getBounds().width();
            int v1 = drawable0.getBounds().isEmpty() ? drawable0.getIntrinsicHeight() : drawable0.getBounds().height();
            if(v <= 0) {
                v = 1;
            }
            if(v1 <= 0) {
                v1 = 1;
            }
            Bitmap bitmap1 = Bitmap.createBitmap(v, v1, Bitmap.Config.ARGB_8888);
            L.o(bitmap1, "createBitmap(...)");
            Canvas canvas0 = new Canvas(bitmap1);
            drawable0.setBounds(0, 0, canvas0.getWidth(), canvas0.getHeight());
            drawable0.draw(canvas0);
            return bitmap1;
        }
    }

    static enum b {
        MIN,
        MID,
        INTERVAL,
        OUT;

        private static final b[] e;
        private static final kotlin.enums.a f;

        static {
            b.e = arr_rangeSeekBar$b;
            L.p(arr_rangeSeekBar$b, "entries");
            b.f = new d(arr_rangeSeekBar$b);
        }

        private static final b[] a() [...] // Inlined contents

        @l
        public static kotlin.enums.a b() {
            return b.f;
        }
    }

    public final class c {
        public static final int[] a;

        static {
            int[] arr_v = new int[b.values().length];
            try {
                arr_v[b.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[b.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[b.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            c.a = arr_v;
        }
    }

    private static final int A = 0;
    private static final int B = 100;
    private static final int C = 1;
    private static final int D = 30;
    private static final int E = 3;
    private static final int F = 8;
    private static final int G = 1;
    private float a;
    private final float b;
    private boolean c;
    private double d;
    private double e;
    private double f;
    private double g;
    private double h;
    private double i;
    @m
    private b j;
    private boolean k;
    @m
    private p l;
    private float m;
    private int n;
    private int o;
    private boolean p;
    private double q;
    @l
    private final RectF r;
    private int s;
    @l
    private final Paint t;
    @l
    private final Paint u;
    @l
    private final Paint v;
    @l
    public static final a w = null;
    private static final int x = 0xFF;
    private static final int y = 0xFF00;
    private static final int z = 8;

    static {
        RangeSeekBar.w = new a(null);
    }

    public RangeSeekBar(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        super(context0, attributeSet0);
        this.a = 0.5f;
        this.b = 0.55f;
        this.i = 1.0;
        this.n = 0xFF;
        RectF rectF0 = new RectF();
        this.r = rectF0;
        this.s = s.a(this, 0x7F040158);  // attr:colorPrimary
        Paint paint0 = new Paint();
        paint0.setStyle(Paint.Style.STROKE);
        paint0.setStrokeWidth(0.5f);
        paint0.setColor(this.s);
        this.t = paint0;
        Paint paint1 = new Paint();
        Paint.Style paint$Style0 = Paint.Style.FILL;
        paint1.setStyle(paint$Style0);
        paint1.setColor(-1);
        paint1.setAlpha(102);
        this.u = paint1;
        Paint paint2 = new Paint(1);
        paint2.setStyle(paint$Style0);
        paint2.setColor(this.s);
        this.v = paint2;
        this.d = 0.0;
        this.e = 100.0;
        this.g = 1.0;
        rectF0.set(0.0f, 0.0f, ((float)this.getWidth()), ((float)this.getHeight()));
        this.setFocusable(true);
        this.setFocusableInTouchMode(true);
        this.o = ViewConfiguration.get(context0).getScaledTouchSlop();
    }

    public RangeSeekBar(Context context0, AttributeSet attributeSet0, int v, w w0) {
        if((v & 2) != 0) {
            attributeSet0 = null;
        }
        this(context0, attributeSet0);
    }

    private final void a() {
        ViewParent viewParent0 = this.getParent();
        if(viewParent0 != null) {
            viewParent0.requestDisallowInterceptTouchEvent(true);
        }
    }

    private final void d(float f, float f1, boolean z, Canvas canvas0) {
        canvas0.drawCircle(f, f1, (z ? this.b : this.a), this.v);
    }

    private final b e(float f) {
        double f1 = this.i + this.h;
        float f2 = this.j(this.h);
        float f3 = this.j(f1);
        boolean z = false;
        boolean z1 = Math.abs(f - f2) <= this.a;
        if(Math.abs(f - f3) <= this.a) {
            z = true;
        }
        if(z1 && z) {
            if(this.c) {
                return f / ((float)this.getWidth()) > 0.5f ? b.a : b.c;
            }
            return b.b;
        }
        if(z1) {
            return this.c ? b.a : b.b;
        }
        if(z) {
            return this.c ? b.c : b.b;
        }
        return f2 > f || f > f3 ? b.d : b.b;
    }

    private final double f(TypedArray typedArray0, int v, int v1) {
        TypedValue typedValue0 = typedArray0.peekValue(v);
        if(typedValue0 == null) {
            return (double)v1;
        }
        return typedValue0.type == 4 ? ((double)typedArray0.getFloat(v, ((float)v1))) : ((double)typedArray0.getInteger(v, v1));
    }

    public final boolean g() {
        return this.p;
    }

    public final double getAbsoluteIntervalValue() {
        return this.e;
    }

    public final double getAbsoluteMinValue() {
        return this.d;
    }

    public final double getMaxRangeValue() {
        return this.f;
    }

    public final double getSelectedIntervalValue() {
        return this.k(this.i);
    }

    public final double getSelectedMinValue() {
        return this.k(this.h);
    }

    public final double getStep() {
        return this.g;
    }

    public final boolean h() {
        return this.k;
    }

    public final boolean i() {
        return this.c;
    }

    private final float j(double f) {
        return (float)(f * ((double)this.getWidth()));
    }

    private final double k(double f) {
        return ((double)Math.round((this.d + f * this.e) * 100.0)) / 100.0;
    }

    public final void l(@l g g0, @l r r0) {
        static final class com.dcinside.app.gif.view.RangeSeekBar.d extends N implements p {
            final g e;
            final r f;

            com.dcinside.app.gif.view.RangeSeekBar.d(g g0, r r0) {
                this.e = g0;
                this.f = r0;
                super(3);
            }

            public final void a(@l RangeSeekBar rangeSeekBar0, double f, double f1) {
                @f(c = "com.dcinside.app.gif.view.RangeSeekBar$onRangeChange$1$1", f = "RangeSeekBar.kt", i = {}, l = {0xBB}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.gif.view.RangeSeekBar.d.a extends o implements A3.o {
                    int k;
                    private Object l;
                    final r m;
                    final RangeSeekBar n;
                    final double o;
                    final double p;

                    com.dcinside.app.gif.view.RangeSeekBar.d.a(r r0, RangeSeekBar rangeSeekBar0, double f, double f1, kotlin.coroutines.d d0) {
                        this.m = r0;
                        this.n = rangeSeekBar0;
                        this.o = f;
                        this.p = f1;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        kotlin.coroutines.d d1 = new com.dcinside.app.gif.view.RangeSeekBar.d.a(this.m, this.n, this.o, this.p, d0);
                        d1.l = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.gif.view.RangeSeekBar.d.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        Object object1 = kotlin.coroutines.intrinsics.b.l();
                        switch(this.k) {
                            case 0: {
                                f0.n(object0);
                                this.k = 1;
                                return this.m.K0(((O)this.l), this.n, kotlin.coroutines.jvm.internal.b.d(this.o), kotlin.coroutines.jvm.internal.b.d(this.p), this) == object1 ? object1 : S0.a;
                            }
                            case 1: {
                                f0.n(object0);
                                return S0.a;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                    }
                }

                L.p(rangeSeekBar0, "v");
                com.dcinside.app.gif.view.RangeSeekBar.d.a rangeSeekBar$d$a0 = new com.dcinside.app.gif.view.RangeSeekBar.d.a(this.f, rangeSeekBar0, f, f1, null);
                k.f(() -> i.a, this.e, null, rangeSeekBar$d$a0, 2, null);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                this.a(((RangeSeekBar)object0), ((Number)object1).doubleValue(), ((Number)object2).doubleValue());
                return S0.a;
            }
        }

        L.p(g0, "context");
        L.p(r0, "handler");
        this.l = new com.dcinside.app.gif.view.RangeSeekBar.d(g0, r0);
    }

    public static void m(RangeSeekBar rangeSeekBar0, g g0, r r0, int v, Object object0) {
        if((v & 1) != 0) {
            g0 = h0.e();
        }
        rangeSeekBar0.l(g0, r0);
    }

    private final void n(MotionEvent motionEvent0) {
        int v = (motionEvent0.getAction() & 0xFF00) >> 8;
        if(motionEvent0.getPointerId(v) == this.n) {
            int v1 = v == 0 ? 1 : 0;
            this.m = motionEvent0.getX(v1);
            this.n = motionEvent0.getPointerId(v1);
        }
    }

    private final void o() {
        this.p = true;
    }

    @Override  // android.widget.ImageView
    protected void onDraw(@l Canvas canvas0) {
        synchronized(this) {
            L.p(canvas0, "canvas");
            super.onDraw(canvas0);
            double f = this.i + this.h;
            float f1 = this.j(this.h);
            float f2 = this.j(f);
            float f3 = (float)this.getHeight();
            this.r.bottom = f3;
            this.r.left = 0.0f;
            this.r.right = f1;
            if(this.r.width() > 0.0f) {
                canvas0.drawRect(this.r, this.u);
            }
            this.r.left = f2;
            this.r.right = (float)this.getWidth();
            if(this.r.width() > 0.0f) {
                canvas0.drawRect(this.r, this.u);
            }
            this.r.left = f1;
            this.r.right = f2;
            canvas0.drawRect(this.r, this.t);
            if(this.c) {
                boolean z = true;
                boolean z1 = b.b == this.j || b.d == this.j;
                boolean z2 = z1 || b.a == this.j;
                if(!z1 && b.c != this.j) {
                    z = false;
                }
                this.d(f1, f3 / 2.0f, z2, canvas0);
                this.d(f2, f3 / 2.0f, z, canvas0);
            }
        }
    }

    @Override  // android.view.View
    protected void onRestoreInstanceState(@m Parcelable parcelable0) {
        Bundle bundle0 = parcelable0 instanceof Bundle ? ((Bundle)parcelable0) : null;
        if(bundle0 != null) {
            super.onRestoreInstanceState(bundle0.getParcelable("SUPER"));
            this.h = bundle0.getDouble("MIN");
            this.i = bundle0.getDouble("INTERVAL");
            return;
        }
        super.onRestoreInstanceState(parcelable0);
    }

    @Override  // android.view.View
    @m
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new Bundle();
        ((Bundle)parcelable0).putParcelable("SUPER", super.onSaveInstanceState());
        ((BaseBundle)parcelable0).putDouble("MIN", this.h);
        ((BaseBundle)parcelable0).putDouble("INTERVAL", this.i);
        return parcelable0;
    }

    @Override  // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@l MotionEvent motionEvent0) {
        L.p(motionEvent0, "event");
        if(!this.isEnabled()) {
            return false;
        }
        int v = motionEvent0.getAction();
        switch(v & 0xFF) {
            case 0: {
                int v1 = motionEvent0.getPointerId(motionEvent0.getPointerCount() - 1);
                this.n = v1;
                float f = motionEvent0.getX(motionEvent0.findPointerIndex(v1));
                this.m = f;
                b rangeSeekBar$b0 = this.e(f);
                this.j = rangeSeekBar$b0;
                if(rangeSeekBar$b0 == null) {
                    return super.onTouchEvent(motionEvent0);
                }
                this.setPressed(true);
                this.invalidate();
                this.o();
                this.u(motionEvent0);
                this.a();
                return true;
            label_20:
                switch(v & 0xFF) {
                    case 2: {
                        goto label_35;
                    }
                    case 3: {
                        goto label_22;
                    }
                    case 5: {
                        goto label_27;
                    }
                    case 6: {
                        this.n(motionEvent0);
                        this.invalidate();
                        return true;
                    }
                }
                return true;
            label_22:
                if(this.p) {
                    this.p();
                    this.setPressed(false);
                }
                this.invalidate();
                return true;
            label_27:
                int v2 = motionEvent0.getPointerCount();
                this.m = motionEvent0.getX(v2 - 1);
                this.n = motionEvent0.getPointerId(v2 - 1);
                this.invalidate();
                return true;
            label_35:
                if(this.j != null) {
                    if(this.p) {
                        this.u(motionEvent0);
                    }
                    else if(Math.abs(motionEvent0.getX(motionEvent0.findPointerIndex(this.n)) - this.m) > ((float)this.o)) {
                        this.setPressed(true);
                        this.invalidate();
                        this.o();
                        this.u(motionEvent0);
                        this.a();
                    }
                    if(this.k) {
                        p p0 = this.l;
                        if(p0 != null) {
                            p0.invoke(this, this.getSelectedMinValue(), this.getSelectedIntervalValue());
                            return true;
                        }
                    }
                }
                break;
            }
            case 1: {
                if(this.p) {
                    this.u(motionEvent0);
                    this.p();
                    this.setPressed(false);
                }
                else {
                    this.o();
                    this.u(motionEvent0);
                    this.p();
                }
                this.q = -1.0;
                this.j = null;
                this.invalidate();
                p p1 = this.l;
                if(p1 != null) {
                    p1.invoke(this, this.getSelectedMinValue(), this.getSelectedIntervalValue());
                    return true;
                }
                break;
            }
            default: {
                goto label_20;
            }
        }
        return true;
    }

    private final void p() {
        this.p = false;
    }

    private final double q(float f) {
        return Math.min(1.0, Math.max(0.0, ((double)f) / ((double)this.getWidth())));
    }

    private final void r(double f, boolean z) {
        if(z) {
            double f1 = this.h + this.i;
            double f2 = Math.max(0.0, Math.min(1.0, Math.min(f, f1)));
            double f3 = f1 - f2;
            double f4 = this.f;
            if(f4 <= 0.0 || f3 <= f4) {
                this.h = f2;
                this.i = f3;
            }
            else {
                this.h = f1 - f4;
                this.i = f4;
            }
        }
        else {
            this.h = Math.max(0.0, Math.min(1.0 - this.i, f));
        }
        this.invalidate();
    }

    static void s(RangeSeekBar rangeSeekBar0, double f, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = true;
        }
        rangeSeekBar0.r(f, z);
    }

    public final void setMaxRangeValue(double f) {
        this.f = f;
    }

    private final void setNormalizedIntervalValue(double f) {
        this.i = this.f > 0.0 ? Math.min(Math.max(0.0, Math.min(1.0 - this.h, f)), this.f) : Math.max(0.0, Math.min(1.0 - this.h, f));
        this.invalidate();
    }

    public final void setNotifyWhileDragging(boolean z) {
        this.k = z;
    }

    public final void setSelectedIntervalValue(double f) {
        if(0.0 == this.e) {
            this.setNormalizedIntervalValue(1.0);
            return;
        }
        this.setNormalizedIntervalValue(this.v(f) - this.h);
    }

    public final void setSelectedMinValue(double f) {
        if(0.0 == this.e) {
            RangeSeekBar.s(this, 0.0, false, 2, null);
            return;
        }
        RangeSeekBar.s(this, this.v(f), false, 2, null);
    }

    public final void setStep(double f) {
        this.g = f;
    }

    public final void setThumbEnabled(boolean z) {
        this.c = z;
        this.invalidate();
    }

    public final void t(double f, double f1, double f2, double f3) {
        this.d = f;
        this.e = f1;
        this.g = f2;
        this.f = f3 == 0.0 || f1 == 0.0 ? 0.0 : (f3 - f) / f1;
    }

    private final void u(MotionEvent motionEvent0) {
        float f = motionEvent0.getX(motionEvent0.findPointerIndex(this.n));
        int v = this.j == null ? -1 : c.a[this.j.ordinal()];
        double f1 = 0.0;
        if(v != 1) {
            switch(v) {
                case 2: {
                    double f5 = this.q(f);
                    double f6 = this.q;
                    if(f6 >= 0.0) {
                        double f7 = this.h + (f5 - f6);
                        double f8 = 1.0 - this.i;
                        if(f7 > f8) {
                            f1 = f8;
                        }
                        else if(f7 >= 0.0) {
                            f1 = f7;
                        }
                        this.r(f1, false);
                    }
                    this.q = f5;
                    return;
                }
                case 3: {
                    this.setNormalizedIntervalValue(this.q(f) - this.h);
                    return;
                }
                default: {
                    double f2 = this.q(f);
                    if(this.q >= 0.0) {
                        double f3 = this.i;
                        double f4 = f2 - f3 / 2.0;
                        if(f4 > 1.0 - f3) {
                            f1 = 1.0 - f3;
                        }
                        else if(f4 >= 0.0) {
                            f1 = f4;
                        }
                        this.r(f1, false);
                    }
                    this.q = f2;
                    return;
                }
            }
        }
        RangeSeekBar.s(this, this.q(f), false, 2, null);
    }

    // 去混淆评级： 低(20)
    private final double v(double f) {
        return 0.0 == this.e ? 0.0 : (f - this.d) / this.e;
    }
}

