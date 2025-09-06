package com.google.android.material.shape;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.annotation.AttrRes;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import com.google.android.material.R.styleable;

public class p {
    static class a {
    }

    public static final class b {
        @NonNull
        private f a;
        @NonNull
        private f b;
        @NonNull
        private f c;
        @NonNull
        private f d;
        @NonNull
        private e e;
        @NonNull
        private e f;
        @NonNull
        private e g;
        @NonNull
        private e h;
        @NonNull
        private h i;
        @NonNull
        private h j;
        @NonNull
        private h k;
        @NonNull
        private h l;

        public b() {
            this.a = l.b();
            this.b = l.b();
            this.c = l.b();
            this.d = l.b();
            this.e = new com.google.android.material.shape.a(0.0f);
            this.f = new com.google.android.material.shape.a(0.0f);
            this.g = new com.google.android.material.shape.a(0.0f);
            this.h = new com.google.android.material.shape.a(0.0f);
            this.i = l.c();
            this.j = l.c();
            this.k = l.c();
            this.l = l.c();
        }

        public b(@NonNull p p0) {
            this.a = l.b();
            this.b = l.b();
            this.c = l.b();
            this.d = l.b();
            this.e = new com.google.android.material.shape.a(0.0f);
            this.f = new com.google.android.material.shape.a(0.0f);
            this.g = new com.google.android.material.shape.a(0.0f);
            this.h = new com.google.android.material.shape.a(0.0f);
            this.i = l.c();
            this.j = l.c();
            this.k = l.c();
            l.c();
            this.a = p0.a;
            this.b = p0.b;
            this.c = p0.c;
            this.d = p0.d;
            this.e = p0.e;
            this.f = p0.f;
            this.g = p0.g;
            this.h = p0.h;
            this.i = p0.i;
            this.j = p0.j;
            this.k = p0.k;
            this.l = p0.l;
        }

        @O1.a
        @NonNull
        public b A(int v, @NonNull e e0) {
            return this.B(l.a(v)).D(e0);
        }

        @O1.a
        @NonNull
        public b B(@NonNull f f0) {
            this.c = f0;
            float f1 = b.n(f0);
            if(f1 != -1.0f) {
                this.C(f1);
            }
            return this;
        }

        @O1.a
        @NonNull
        public b C(@Dimension float f) {
            this.g = new com.google.android.material.shape.a(f);
            return this;
        }

        @O1.a
        @NonNull
        public b D(@NonNull e e0) {
            this.g = e0;
            return this;
        }

        @O1.a
        @NonNull
        public b E(@NonNull h h0) {
            this.l = h0;
            return this;
        }

        @O1.a
        @NonNull
        public b F(@NonNull h h0) {
            this.j = h0;
            return this;
        }

        @O1.a
        @NonNull
        public b G(@NonNull h h0) {
            this.i = h0;
            return this;
        }

        @O1.a
        @NonNull
        public b H(int v, @Dimension float f) {
            return this.J(l.a(v)).K(f);
        }

        @O1.a
        @NonNull
        public b I(int v, @NonNull e e0) {
            return this.J(l.a(v)).L(e0);
        }

        @O1.a
        @NonNull
        public b J(@NonNull f f0) {
            this.a = f0;
            float f1 = b.n(f0);
            if(f1 != -1.0f) {
                this.K(f1);
            }
            return this;
        }

        @O1.a
        @NonNull
        public b K(@Dimension float f) {
            this.e = new com.google.android.material.shape.a(f);
            return this;
        }

        @O1.a
        @NonNull
        public b L(@NonNull e e0) {
            this.e = e0;
            return this;
        }

        @O1.a
        @NonNull
        public b M(int v, @Dimension float f) {
            return this.O(l.a(v)).P(f);
        }

        @O1.a
        @NonNull
        public b N(int v, @NonNull e e0) {
            return this.O(l.a(v)).Q(e0);
        }

        @O1.a
        @NonNull
        public b O(@NonNull f f0) {
            this.b = f0;
            float f1 = b.n(f0);
            if(f1 != -1.0f) {
                this.P(f1);
            }
            return this;
        }

        @O1.a
        @NonNull
        public b P(@Dimension float f) {
            this.f = new com.google.android.material.shape.a(f);
            return this;
        }

        @O1.a
        @NonNull
        public b Q(@NonNull e e0) {
            this.f = e0;
            return this;
        }

        @NonNull
        public p m() {
            return new p(this, null);
        }

        private static float n(f f0) {
            if(f0 instanceof o) {
                return ((o)f0).a;
            }
            return f0 instanceof g ? ((g)f0).a : -1.0f;
        }

        @O1.a
        @NonNull
        public b o(@Dimension float f) {
            return this.K(f).P(f).C(f).x(f);
        }

        @O1.a
        @NonNull
        public b p(@NonNull e e0) {
            return this.L(e0).Q(e0).D(e0).y(e0);
        }

        @O1.a
        @NonNull
        public b q(int v, @Dimension float f) {
            return this.r(l.a(v)).o(f);
        }

        @O1.a
        @NonNull
        public b r(@NonNull f f0) {
            return this.J(f0).O(f0).B(f0).w(f0);
        }

        @O1.a
        @NonNull
        public b s(@NonNull h h0) {
            return this.E(h0).G(h0).F(h0).t(h0);
        }

        @O1.a
        @NonNull
        public b t(@NonNull h h0) {
            this.k = h0;
            return this;
        }

        @O1.a
        @NonNull
        public b u(int v, @Dimension float f) {
            return this.w(l.a(v)).x(f);
        }

        @O1.a
        @NonNull
        public b v(int v, @NonNull e e0) {
            return this.w(l.a(v)).y(e0);
        }

        @O1.a
        @NonNull
        public b w(@NonNull f f0) {
            this.d = f0;
            float f1 = b.n(f0);
            if(f1 != -1.0f) {
                this.x(f1);
            }
            return this;
        }

        @O1.a
        @NonNull
        public b x(@Dimension float f) {
            this.h = new com.google.android.material.shape.a(f);
            return this;
        }

        @O1.a
        @NonNull
        public b y(@NonNull e e0) {
            this.h = e0;
            return this;
        }

        @O1.a
        @NonNull
        public b z(int v, @Dimension float f) {
            return this.B(l.a(v)).C(f);
        }
    }

    @RestrictTo({Scope.b})
    public interface c {
        @NonNull
        e a(@NonNull e arg1);
    }

    f a;
    f b;
    f c;
    f d;
    e e;
    e f;
    e g;
    e h;
    h i;
    h j;
    h k;
    h l;
    public static final e m;

    static {
        p.m = new n(0.5f);
    }

    public p() {
        this.a = l.b();
        this.b = l.b();
        this.c = l.b();
        this.d = l.b();
        this.e = new com.google.android.material.shape.a(0.0f);
        this.f = new com.google.android.material.shape.a(0.0f);
        this.g = new com.google.android.material.shape.a(0.0f);
        this.h = new com.google.android.material.shape.a(0.0f);
        this.i = l.c();
        this.j = l.c();
        this.k = l.c();
        this.l = l.c();
    }

    private p(@NonNull b p$b0) {
        this.a = p$b0.a;
        this.b = p$b0.b;
        this.c = p$b0.c;
        this.d = p$b0.d;
        this.e = p$b0.e;
        this.f = p$b0.f;
        this.g = p$b0.g;
        this.h = p$b0.h;
        this.i = p$b0.i;
        this.j = p$b0.j;
        this.k = p$b0.k;
        this.l = p$b0.l;
    }

    p(b p$b0, a p$a0) {
        this(p$b0);
    }

    @NonNull
    public static b a() {
        return new b();
    }

    @NonNull
    public static b b(Context context0, @StyleRes int v, @StyleRes int v1) {
        return p.c(context0, v, v1, 0);
    }

    @NonNull
    private static b c(Context context0, @StyleRes int v, @StyleRes int v1, int v2) {
        return p.d(context0, v, v1, new com.google.android.material.shape.a(((float)v2)));
    }

    @NonNull
    private static b d(Context context0, @StyleRes int v, @StyleRes int v1, @NonNull e e0) {
        ContextThemeWrapper contextThemeWrapper0 = new ContextThemeWrapper(context0, v);
        if(v1 != 0) {
            contextThemeWrapper0 = new ContextThemeWrapper(contextThemeWrapper0, v1);
        }
        TypedArray typedArray0 = contextThemeWrapper0.obtainStyledAttributes(styleable.ShapeAppearance);
        try {
            int v3 = typedArray0.getInt(styleable.ShapeAppearance_cornerFamily, 0);
            int v4 = typedArray0.getInt(styleable.ShapeAppearance_cornerFamilyTopLeft, v3);
            int v5 = typedArray0.getInt(styleable.ShapeAppearance_cornerFamilyTopRight, v3);
            int v6 = typedArray0.getInt(styleable.ShapeAppearance_cornerFamilyBottomRight, v3);
            int v7 = typedArray0.getInt(styleable.ShapeAppearance_cornerFamilyBottomLeft, v3);
            e e1 = p.m(typedArray0, styleable.ShapeAppearance_cornerSize, e0);
            e e2 = p.m(typedArray0, styleable.ShapeAppearance_cornerSizeTopLeft, e1);
            e e3 = p.m(typedArray0, styleable.ShapeAppearance_cornerSizeTopRight, e1);
            e e4 = p.m(typedArray0, styleable.ShapeAppearance_cornerSizeBottomRight, e1);
            e e5 = p.m(typedArray0, styleable.ShapeAppearance_cornerSizeBottomLeft, e1);
            return new b().I(v4, e2).N(v5, e3).A(v6, e4).v(v7, e5);
        }
        finally {
            typedArray0.recycle();
        }
    }

    @NonNull
    public static b e(@NonNull Context context0, AttributeSet attributeSet0, @AttrRes int v, @StyleRes int v1) {
        return p.f(context0, attributeSet0, v, v1, 0);
    }

    @NonNull
    public static b f(@NonNull Context context0, AttributeSet attributeSet0, @AttrRes int v, @StyleRes int v1, int v2) {
        return p.g(context0, attributeSet0, v, v1, new com.google.android.material.shape.a(((float)v2)));
    }

    @NonNull
    public static b g(@NonNull Context context0, AttributeSet attributeSet0, @AttrRes int v, @StyleRes int v1, @NonNull e e0) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.MaterialShape, v, v1);
        int v2 = typedArray0.getResourceId(styleable.MaterialShape_shapeAppearance, 0);
        int v3 = typedArray0.getResourceId(styleable.MaterialShape_shapeAppearanceOverlay, 0);
        typedArray0.recycle();
        return p.d(context0, v2, v3, e0);
    }

    @NonNull
    public h h() {
        return this.k;
    }

    @NonNull
    public f i() {
        return this.d;
    }

    @NonNull
    public e j() {
        return this.h;
    }

    @NonNull
    public f k() {
        return this.c;
    }

    @NonNull
    public e l() {
        return this.g;
    }

    @NonNull
    private static e m(TypedArray typedArray0, int v, @NonNull e e0) {
        TypedValue typedValue0 = typedArray0.peekValue(v);
        if(typedValue0 == null) {
            return e0;
        }
        int v1 = typedValue0.type;
        if(v1 == 5) {
            return new com.google.android.material.shape.a(((float)TypedValue.complexToDimensionPixelSize(typedValue0.data, typedArray0.getResources().getDisplayMetrics())));
        }
        return v1 == 6 ? new n(typedValue0.getFraction(1.0f, 1.0f)) : e0;
    }

    @NonNull
    public h n() {
        return this.l;
    }

    @NonNull
    public h o() {
        return this.j;
    }

    @NonNull
    public h p() {
        return this.i;
    }

    @NonNull
    public f q() {
        return this.a;
    }

    @NonNull
    public e r() {
        return this.e;
    }

    @NonNull
    public f s() {
        return this.b;
    }

    @NonNull
    public e t() {
        return this.f;
    }

    // 去混淆评级： 低(36)
    @RestrictTo({Scope.b})
    public boolean u(@NonNull RectF rectF0) {
        boolean z = this.l.getClass().equals(h.class) && this.j.getClass().equals(h.class) && this.i.getClass().equals(h.class) && this.k.getClass().equals(h.class);
        float f = this.e.a(rectF0);
        return z && (this.f.a(rectF0) == f && this.h.a(rectF0) == f && this.g.a(rectF0) == f) && (this.b instanceof o && this.a instanceof o && this.c instanceof o && this.d instanceof o);
    }

    @NonNull
    public b v() {
        return new b(this);
    }

    @NonNull
    public p w(float f) {
        return this.v().o(f).m();
    }

    @NonNull
    public p x(@NonNull e e0) {
        return this.v().p(e0).m();
    }

    @NonNull
    @RestrictTo({Scope.b})
    public p y(@NonNull c p$c0) {
        return this.v().L(p$c0.a(this.r())).Q(p$c0.a(this.t())).y(p$c0.a(this.j())).D(p$c0.a(this.l())).m();
    }
}

