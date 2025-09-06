package com.mackhartley.roundedprogressbar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path.Direction;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View.BaseSavedState;
import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.ColorInt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import java.util.HashMap;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.t0;
import y4.l;
import y4.m;
import z3.f;
import z3.j;

public final class RoundedProgressBar extends ConstraintLayout {
    public static final class SavedState extends View.BaseSavedState {
        public static final class a implements Parcelable.Creator {
            @l
            public SavedState a(@l Parcel parcel0) {
                L.q(parcel0, "source");
                return new SavedState(parcel0);
            }

            @l
            public SavedState[] b(int v) {
                return new SavedState[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.a(parcel0);
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.b(v);
            }
        }

        public static final class b {
            private b() {
            }

            public b(w w0) {
            }

            public static void a() {
            }
        }

        @l
        @f
        public static final Parcelable.Creator CREATOR;
        private double a;
        private float b;
        @ColorInt
        private int c;
        @ColorInt
        private int d;
        private long e;
        private float f;
        private float g;
        private float h;
        private float i;
        private boolean j;
        private float k;
        @ColorInt
        private int l;
        @ColorInt
        private int m;
        private boolean n;
        private float o;
        @l
        private String p;
        public static final b q;

        static {
            SavedState.q = new b(null);
            SavedState.CREATOR = new a();
        }

        public SavedState(@l Parcel parcel0) {
            L.q(parcel0, "source");
            super(parcel0);
            boolean z = true;
            this.j = true;
            this.n = true;
            String s = "";
            this.p = "";
            this.a = parcel0.readDouble();
            this.b = parcel0.readFloat();
            this.c = parcel0.readInt();
            this.d = parcel0.readInt();
            this.e = parcel0.readLong();
            this.f = parcel0.readFloat();
            this.g = parcel0.readFloat();
            this.h = parcel0.readFloat();
            this.i = parcel0.readFloat();
            this.j = parcel0.readByte() != 0;
            this.k = parcel0.readFloat();
            this.l = parcel0.readInt();
            this.m = parcel0.readInt();
            if(parcel0.readByte() == 0) {
                z = false;
            }
            this.n = z;
            this.o = parcel0.readFloat();
            String s1 = parcel0.readString();
            if(s1 != null) {
                s = s1;
            }
            this.p = s;
        }

        public SavedState(@m Parcelable parcelable0) {
            super(parcelable0);
            this.j = true;
            this.n = true;
            this.p = "";
        }

        public final void A(float f) {
            this.f = f;
        }

        public final void B(float f) {
            this.g = f;
        }

        public final void C(double f) {
            this.a = f;
        }

        public final void D(@l String s) {
            L.q(s, "<set-?>");
            this.p = s;
        }

        public final void E(boolean z) {
            this.j = z;
        }

        public final void F(float f) {
            this.b = f;
        }

        public final void G(int v) {
            this.c = v;
        }

        public final void H(int v) {
            this.l = v;
        }

        public final void I(boolean z) {
            this.n = z;
        }

        public final void J(float f) {
            this.o = f;
        }

        public final void K(float f) {
            this.k = f;
        }

        public final long a() {
            return this.e;
        }

        public final int c() {
            return this.d;
        }

        public final int d() {
            return this.m;
        }

        public final float e() {
            return this.i;
        }

        public final float f() {
            return this.h;
        }

        public final float g() {
            return this.f;
        }

        public final float h() {
            return this.g;
        }

        public final double i() {
            return this.a;
        }

        @l
        public final String l() {
            return this.p;
        }

        public final boolean m() {
            return this.j;
        }

        public final float o() {
            return this.b;
        }

        public final int q() {
            return this.c;
        }

        public final int r() {
            return this.l;
        }

        public final boolean s() {
            return this.n;
        }

        public final float t() {
            return this.o;
        }

        public final float u() {
            return this.k;
        }

        public final void v(long v) {
            this.e = v;
        }

        public final void w(int v) {
            this.d = v;
        }

        @Override  // android.view.View$BaseSavedState
        public void writeToParcel(@l Parcel parcel0, int v) {
            L.q(parcel0, "out");
            super.writeToParcel(parcel0, v);
            parcel0.writeDouble(this.a);
            parcel0.writeFloat(this.b);
            parcel0.writeInt(this.c);
            parcel0.writeInt(this.d);
            parcel0.writeLong(this.e);
            parcel0.writeFloat(this.f);
            parcel0.writeFloat(this.g);
            parcel0.writeFloat(this.h);
            parcel0.writeFloat(this.i);
            parcel0.writeByte((this.j ? 1 : 0));
            parcel0.writeFloat(this.k);
            parcel0.writeInt(this.l);
            parcel0.writeInt(this.m);
            parcel0.writeByte((this.n ? 1 : 0));
            parcel0.writeFloat(this.o);
            parcel0.writeString(this.p);
        }

        public final void x(int v) {
            this.m = v;
        }

        public final void y(float f) {
            this.i = f;
        }

        public final void z(float f) {
            this.h = f;
        }
    }

    public static final class com.mackhartley.roundedprogressbar.RoundedProgressBar.a {
        private com.mackhartley.roundedprogressbar.RoundedProgressBar.a() {
        }

        public com.mackhartley.roundedprogressbar.RoundedProgressBar.a(w w0) {
        }
    }

    @ColorInt
    private int A;
    private boolean B;
    private float C;
    private String D;
    private final ProgressBar E;
    private final ProgressTextOverlay F;
    private Path G;
    private HashMap H;
    private static final double I = 100.0;
    private static final double J = 0.0;
    private static final int K = 100;
    private static final int L = 10;
    private static final int M = 0;
    public static final com.mackhartley.roundedprogressbar.RoundedProgressBar.a M8 = null;
    private static final double N = 100.0;
    private static final int O = 0;
    private static final int P = 1;
    private static final float Q = -1.0f;
    private final int a;
    @ColorInt
    private final int b;
    @ColorInt
    private final int c;
    private final int d;
    private final float e;
    private final boolean f;
    private final float g;
    @ColorInt
    private final int h;
    @ColorInt
    private final int i;
    private final boolean j;
    private final float k;
    private final String l;
    private double m;
    private float n;
    @ColorInt
    private int o;
    @ColorInt
    private int p;
    private long q;
    private float r;
    private float s;
    private float t;
    private float u;
    private boolean v;
    private int w;
    private int x;
    private float y;
    @ColorInt
    private int z;

    static {
        RoundedProgressBar.M8 = new com.mackhartley.roundedprogressbar.RoundedProgressBar.a(null);
    }

    @j
    public RoundedProgressBar(@l Context context0) {
        this(context0, null, 0, 6, null);
    }

    @j
    public RoundedProgressBar(@l Context context0, @m AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public RoundedProgressBar(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.q(context0, "context");
        super(context0, attributeSet0, v);
        int v1 = ContextCompat.getColor(context0, color.rpb_default_progress_color);
        this.b = v1;
        int v2 = ContextCompat.getColor(context0, color.rpb_default_progress_bg_color);
        this.c = v2;
        int v3 = context0.getResources().getInteger(integer.rpb_default_animation_duration);
        this.d = v3;
        float f = context0.getResources().getDimension(dimen.rpb_default_corner_radius);
        this.e = f;
        this.f = true;
        float f1 = context0.getResources().getDimension(dimen.rpb_default_text_size);
        this.g = f1;
        int v4 = ContextCompat.getColor(context0, color.rpb_default_text_color);
        this.h = v4;
        int v5 = ContextCompat.getColor(context0, color.rpb_default_text_color);
        this.i = v5;
        this.j = true;
        float f2 = context0.getResources().getDimension(dimen.rpb_default_text_padding);
        this.k = f2;
        this.l = "";
        this.o = v1;
        this.p = v2;
        this.q = (long)v3;
        this.r = f;
        this.s = f;
        this.t = f;
        this.u = f;
        this.v = true;
        this.y = f1;
        this.z = v4;
        this.A = v5;
        this.B = true;
        this.C = f2;
        this.D = "";
        this.G = new Path();
        this.setSaveEnabled(true);
        this.setWillNotDraw(false);
        View view0 = LayoutInflater.from(context0).inflate(layout.layout_rounded_progress_bar, this, false);
        L.h(view0, "view");
        ProgressBar progressBar0 = (ProgressBar)view0.findViewById(id.rounded_progress_bar);
        L.h(progressBar0, "view.rounded_progress_bar");
        this.E = progressBar0;
        ProgressTextOverlay progressTextOverlay0 = (ProgressTextOverlay)view0.findViewById(id.progress_text_overlay);
        L.h(progressTextOverlay0, "view.progress_text_overlay");
        this.F = progressTextOverlay0;
        progressBar0.setMax(1000);
        this.K(attributeSet0);
        this.addView(view0);
    }

    public RoundedProgressBar(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    public View A(int v) {
        if(this.H == null) {
            this.H = new HashMap();
        }
        View view0 = (View)this.H.get(v);
        if(view0 == null) {
            view0 = this.findViewById(v);
            this.H.put(v, view0);
        }
        return view0;
    }

    public static final float B(RoundedProgressBar roundedProgressBar0) {
        return roundedProgressBar0.n;
    }

    private final int D(double f) {
        return kotlin.math.b.K0(((long)f) * 0x4059000000000000L);
    }

    private final Drawable E() {
        Drawable drawable0 = new ShapeDrawable(new RectShape());
        G2.a.a(drawable0, this.p);
        return drawable0;
    }

    private final Drawable F() {
        float f = H2.a.a(this.r, this.w, this.v);
        float f1 = H2.a.a(this.s, this.w, this.v);
        float f2 = H2.a.a(this.t, this.w, this.v);
        float f3 = H2.a.a(this.u, this.w, this.v);
        ShapeDrawable shapeDrawable0 = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f1, f1, f2, f2, f3, f3}, null, null));
        G2.a.a(shapeDrawable0, this.o);
        return new ScaleDrawable(shapeDrawable0, 0x800003, 1.0f, -1.0f);
    }

    private final void G(TypedArray typedArray0) {
        float f2;
        float f = this.e;
        float f1 = typedArray0.getDimension(styleable.RoundedProgressBar_rpbCornerRadius, -1.0f);
        if(f1 == -1.0f) {
            f1 = f;
            f2 = f1;
        }
        else {
            f = f1;
            f2 = f;
        }
        float f3 = f2;
        float f4 = typedArray0.getDimension(styleable.RoundedProgressBar_rpbCornerRadiusTopLeft, -1.0f);
        if(f4 != -1.0f) {
            f = f4;
        }
        float f5 = typedArray0.getDimension(styleable.RoundedProgressBar_rpbCornerRadiusTopRight, -1.0f);
        if(f5 != -1.0f) {
            f1 = f5;
        }
        float f6 = typedArray0.getDimension(styleable.RoundedProgressBar_rpbCornerRadiusBottomRight, -1.0f);
        if(f6 != -1.0f) {
            f2 = f6;
        }
        float f7 = typedArray0.getDimension(styleable.RoundedProgressBar_rpbCornerRadiusBottomLeft, -1.0f);
        if(f7 != -1.0f) {
            f3 = f7;
        }
        this.M(f, f1, f2, f3);
    }

    private final double H(double f) {
        if(f < 0.0) {
            return 0.0;
        }
        return f > 100.0 ? 0.0 : f;
    }

    private final int I(double f) {
        return (int)(f * 10.0);
    }

    private final float J(double f) {
        return (float)(f / 100.0);
    }

    private final void K(AttributeSet attributeSet0) {
        if(attributeSet0 == null) {
            return;
        }
        TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, styleable.RoundedProgressBar);
        int v = typedArray0.getInteger(styleable.RoundedProgressBar_rpbProgress, this.a);
        if(v != this.a) {
            RoundedProgressBar.P(this, ((double)v), false, 2, null);
        }
        int v1 = typedArray0.getColor(styleable.RoundedProgressBar_rpbProgressColor, this.b);
        if(v1 != this.b) {
            this.setProgressDrawableColor(v1);
        }
        int v2 = typedArray0.getColor(styleable.RoundedProgressBar_rpbBackgroundColor, this.c);
        if(v2 != this.c) {
            this.setBackgroundDrawableColor(v2);
        }
        float f = typedArray0.getDimension(styleable.RoundedProgressBar_rpbTextSize, this.g);
        if(f != this.g) {
            this.setTextSize(f);
        }
        int v3 = typedArray0.getColor(styleable.RoundedProgressBar_rpbProgressTextColor, this.h);
        if(v3 != this.h) {
            this.setProgressTextColor(v3);
        }
        int v4 = typedArray0.getColor(styleable.RoundedProgressBar_rpbBackgroundTextColor, this.i);
        if(v4 != this.i) {
            this.setBackgroundTextColor(v4);
        }
        boolean z = typedArray0.getBoolean(styleable.RoundedProgressBar_rpbShowProgressText, this.j);
        if(z != this.j) {
            this.Q(z);
        }
        int v5 = typedArray0.getInteger(styleable.RoundedProgressBar_rpbAnimationLength, this.d);
        if(v5 != this.d) {
            this.setAnimationLength(((long)v5));
        }
        boolean z1 = typedArray0.getBoolean(styleable.RoundedProgressBar_rpbIsRadiusRestricted, this.f);
        if(z1 != this.f) {
            this.setRadiusRestricted(z1);
        }
        float f1 = typedArray0.getDimension(styleable.RoundedProgressBar_rpbTextPadding, this.k);
        if(f1 != this.k) {
            this.setTextPadding(f1);
        }
        String s = typedArray0.getString(styleable.RoundedProgressBar_rpbCustomFontPath);
        if(s != null && !L.g(s, this.l)) {
            this.setCustomFontPath(s);
        }
        L.h(typedArray0, "rpbAttributes");
        this.G(typedArray0);
        typedArray0.recycle();
    }

    private final void L() {
        this.M(this.r, this.s, this.t, this.u);
    }

    public final void M(float f, float f1, float f2, float f3) {
        this.r = f;
        this.s = f1;
        this.t = f2;
        this.u = f3;
        this.R();
        LayerDrawable layerDrawable0 = new LayerDrawable(new Drawable[]{this.E(), this.F()});
        this.E.setProgressDrawable(layerDrawable0);
        Drawable drawable0 = this.E.getProgressDrawable();
        if(drawable0 == null) {
            throw new t0("null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        }
        Drawable drawable1 = ((LayerDrawable)drawable0).getDrawable(1);
        L.h(drawable1, "currentProgressDrawable");
        drawable1.setLevel(this.D(this.getProgressPercentage()));
    }

    public final void N(float f, @l com.mackhartley.roundedprogressbar.b b0) {
        L.q(b0, "cornerToModify");
        switch(b0) {
            case 1: {
                this.M(f, this.s, this.t, this.u);
                return;
            }
            case 2: {
                this.M(this.r, f, this.t, this.u);
                return;
            }
            case 3: {
                this.M(this.r, this.s, f, this.u);
                return;
            }
            case 4: {
                this.M(this.r, this.s, this.t, f);
            }
        }
    }

    public final void O(double f, boolean z) {
        static final class com.mackhartley.roundedprogressbar.RoundedProgressBar.b implements ValueAnimator.AnimatorUpdateListener {
            final RoundedProgressBar a;

            com.mackhartley.roundedprogressbar.RoundedProgressBar.b(RoundedProgressBar roundedProgressBar0) {
                this.a = roundedProgressBar0;
                super();
            }

            @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
                RoundedProgressBar roundedProgressBar0 = this.a;
                L.h(valueAnimator0, "it");
                Object object0 = valueAnimator0.getAnimatedValue();
                if(!(object0 instanceof Float)) {
                    object0 = null;
                }
                roundedProgressBar0.n = ((Float)object0) == null ? 0.0f : ((float)(((Float)object0)));
            }
        }

        double f1 = this.H(f);
        int v = this.I(f1);
        float f2 = this.J(f1);
        if(z) {
            ObjectAnimator objectAnimator0 = ObjectAnimator.ofInt(this.E, "progress", new int[]{v}).setDuration(this.q);
            L.h(objectAnimator0, "ObjectAnimator\n         …Duration(animationLength)");
            ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(this.F, "progress", new float[]{this.n, f2}).setDuration(this.q);
            L.h(objectAnimator1, "ObjectAnimator\n         …Duration(animationLength)");
            objectAnimator1.addUpdateListener(new com.mackhartley.roundedprogressbar.RoundedProgressBar.b(this));
            AnimatorSet animatorSet0 = new AnimatorSet();
            animatorSet0.play(objectAnimator0).with(objectAnimator1);
            animatorSet0.start();
        }
        else {
            this.E.setProgress(v);
            this.F.setProgress(f2);
        }
        this.n = f2;
        this.m = f1;
    }

    public static void P(RoundedProgressBar roundedProgressBar0, double f, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = true;
        }
        roundedProgressBar0.O(f, z);
    }

    public final void Q(boolean z) {
        this.B = z;
        this.F.e(z);
    }

    private final void R() {
        int v = this.w;
        int v1 = this.x;
        float f = H2.a.a(this.r, v, this.v);
        float f1 = H2.a.a(this.s, v, this.v);
        float f2 = H2.a.a(this.t, v, this.v);
        float f3 = H2.a.a(this.u, v, this.v);
        this.G.reset();
        this.G.addRoundRect(0.0f, 0.0f, ((float)v1), ((float)v), new float[]{f, f, f1, f1, f2, f2, f3, f3}, Path.Direction.CW);
        this.invalidate();
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap0 = this.H;
        if(hashMap0 != null) {
            hashMap0.clear();
        }
    }

    @Override  // android.view.ViewGroup
    protected void dispatchRestoreInstanceState(@l SparseArray sparseArray0) {
        L.q(sparseArray0, "container");
        this.dispatchThawSelfOnly(sparseArray0);
    }

    @Override  // android.view.ViewGroup
    protected void dispatchSaveInstanceState(@l SparseArray sparseArray0) {
        L.q(sparseArray0, "container");
        this.dispatchFreezeSelfOnly(sparseArray0);
    }

    public final double getProgressPercentage() {
        return this.m;
    }

    @Override  // android.view.View
    protected void onDraw(@l Canvas canvas0) {
        L.q(canvas0, "canvas");
        canvas0.clipPath(this.G);
    }

    @Override  // android.view.View
    public void onRestoreInstanceState(@l Parcelable parcelable0) {
        L.q(parcelable0, "state");
        if(parcelable0 instanceof SavedState) {
            super.onRestoreInstanceState(((SavedState)parcelable0).getSuperState());
            this.m = ((SavedState)parcelable0).i();
            this.n = ((SavedState)parcelable0).o();
            this.o = ((SavedState)parcelable0).q();
            this.p = ((SavedState)parcelable0).c();
            this.q = ((SavedState)parcelable0).a();
            this.r = ((SavedState)parcelable0).g();
            this.s = ((SavedState)parcelable0).h();
            this.t = ((SavedState)parcelable0).f();
            this.u = ((SavedState)parcelable0).e();
            this.v = ((SavedState)parcelable0).m();
            this.M(this.r, this.s, this.t, this.u);
            this.setBackgroundDrawableColor(this.p);
            this.setProgressDrawableColor(this.o);
            this.O(this.m, false);
            this.y = ((SavedState)parcelable0).u();
            this.z = ((SavedState)parcelable0).r();
            this.A = ((SavedState)parcelable0).d();
            this.B = ((SavedState)parcelable0).s();
            this.C = ((SavedState)parcelable0).t();
            this.D = ((SavedState)parcelable0).l();
            this.setTextSize(this.y);
            this.setProgressTextColor(this.z);
            this.setBackgroundTextColor(this.A);
            this.Q(this.B);
            this.setTextPadding(this.C);
            this.setCustomFontPath(this.D);
            return;
        }
        super.onRestoreInstanceState(parcelable0);
    }

    @Override  // android.view.View
    @m
    public Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SavedState(super.onSaveInstanceState());
        ((SavedState)parcelable0).C(this.m);
        ((SavedState)parcelable0).F(this.n);
        ((SavedState)parcelable0).G(this.o);
        ((SavedState)parcelable0).w(this.p);
        ((SavedState)parcelable0).v(this.q);
        ((SavedState)parcelable0).A(this.r);
        ((SavedState)parcelable0).B(this.s);
        ((SavedState)parcelable0).z(this.t);
        ((SavedState)parcelable0).y(this.u);
        ((SavedState)parcelable0).E(this.v);
        ((SavedState)parcelable0).K(this.y);
        ((SavedState)parcelable0).H(this.z);
        ((SavedState)parcelable0).x(this.A);
        ((SavedState)parcelable0).I(this.B);
        ((SavedState)parcelable0).J(this.C);
        ((SavedState)parcelable0).D(this.D);
        return parcelable0;
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        this.w = v1;
        this.x = v;
        this.L();
    }

    public final void setAnimationLength(long v) {
        this.q = v;
    }

    public final void setBackgroundDrawableColor(@ColorInt int v) {
        this.p = v;
        Drawable drawable0 = this.E.getProgressDrawable();
        if(drawable0 == null) {
            throw new t0("null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        }
        Drawable drawable1 = ((LayerDrawable)drawable0).getDrawable(0);
        L.h(drawable1, "layerToModify");
        G2.a.a(drawable1, v);
    }

    public final void setBackgroundTextColor(@ColorInt int v) {
        this.A = v;
        this.F.setBackgroundTextColor(v);
    }

    public final void setCornerRadius(float f) {
        this.M(f, f, f, f);
    }

    public final void setCustomFontPath(@l String s) {
        L.q(s, "newFontPath");
        this.D = s;
        this.F.setCustomFontPath(s);
    }

    public final void setProgressDrawableColor(@ColorInt int v) {
        this.o = v;
        Drawable drawable0 = this.E.getProgressDrawable();
        if(drawable0 == null) {
            throw new t0("null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        }
        Drawable drawable1 = ((LayerDrawable)drawable0).getDrawable(1);
        L.h(drawable1, "layerToModify");
        G2.a.a(drawable1, v);
    }

    public final void setProgressTextColor(@ColorInt int v) {
        this.z = v;
        this.F.setProgressTextColor(v);
    }

    public final void setProgressTextFormatter(@l d d0) {
        L.q(d0, "newProgressTextFormatter");
        this.F.setProgressTextFormatter(d0);
    }

    public final void setRadiusRestricted(boolean z) {
        this.v = z;
        this.L();
    }

    public final void setTextPadding(float f) {
        this.C = f;
        this.F.setTextPadding(f);
    }

    public final void setTextSize(float f) {
        this.y = f;
        this.F.setTextSize(f);
    }
}

