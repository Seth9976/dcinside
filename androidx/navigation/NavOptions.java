package androidx.navigation;

import androidx.annotation.AnimRes;
import androidx.annotation.AnimatorRes;
import androidx.annotation.IdRes;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.k;
import y4.l;
import y4.m;
import z3.j;

public final class NavOptions {
    public static final class Builder {
        private boolean a;
        private boolean b;
        @IdRes
        private int c;
        @m
        private String d;
        private boolean e;
        private boolean f;
        @AnimRes
        @AnimatorRes
        private int g;
        @AnimRes
        @AnimatorRes
        private int h;
        @AnimRes
        @AnimatorRes
        private int i;
        @AnimRes
        @AnimatorRes
        private int j;

        public Builder() {
            this.c = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
        }

        @l
        public final NavOptions a() {
            String s = this.d;
            return s == null ? new NavOptions(this.a, this.b, this.c, this.e, this.f, this.g, this.h, this.i, this.j) : new NavOptions(this.a, this.b, s, this.e, this.f, this.g, this.h, this.i, this.j);
        }

        @l
        public final Builder b(@AnimRes @AnimatorRes int v) {
            this.g = v;
            return this;
        }

        @l
        public final Builder c(@AnimRes @AnimatorRes int v) {
            this.h = v;
            return this;
        }

        @l
        public final Builder d(boolean z) {
            this.a = z;
            return this;
        }

        @l
        public final Builder e(@AnimRes @AnimatorRes int v) {
            this.i = v;
            return this;
        }

        @l
        public final Builder f(@AnimRes @AnimatorRes int v) {
            this.j = v;
            return this;
        }

        @l
        @j
        public final Builder g(@IdRes int v, boolean z) {
            return Builder.k(this, v, z, false, 4, null);
        }

        @l
        @j
        public final Builder h(@IdRes int v, boolean z, boolean z1) {
            this.c = v;
            this.d = null;
            this.e = z;
            this.f = z1;
            return this;
        }

        @l
        @j
        public final Builder i(@m String s, boolean z) {
            return Builder.l(this, s, z, false, 4, null);
        }

        @l
        @j
        public final Builder j(@m String s, boolean z, boolean z1) {
            this.d = s;
            this.c = -1;
            this.e = z;
            this.f = z1;
            return this;
        }

        public static Builder k(Builder navOptions$Builder0, int v, boolean z, boolean z1, int v1, Object object0) {
            if((v1 & 4) != 0) {
                z1 = false;
            }
            return navOptions$Builder0.h(v, z, z1);
        }

        public static Builder l(Builder navOptions$Builder0, String s, boolean z, boolean z1, int v, Object object0) {
            if((v & 4) != 0) {
                z1 = false;
            }
            return navOptions$Builder0.j(s, z, z1);
        }

        @l
        public final Builder m(boolean z) {
            this.b = z;
            return this;
        }
    }

    private final boolean a;
    private final boolean b;
    @IdRes
    private final int c;
    private final boolean d;
    private final boolean e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    @m
    private String j;

    public NavOptions(boolean z, boolean z1, @IdRes int v, boolean z2, boolean z3, @AnimRes @AnimatorRes int v1, @AnimRes @AnimatorRes int v2, @AnimRes @AnimatorRes int v3, @AnimRes @AnimatorRes int v4) {
        this.a = z;
        this.b = z1;
        this.c = v;
        this.d = z2;
        this.e = z3;
        this.f = v1;
        this.g = v2;
        this.h = v3;
        this.i = v4;
    }

    public NavOptions(boolean z, boolean z1, @m String s, boolean z2, boolean z3, int v, int v1, int v2, int v3) {
        this(z, z1, NavDestination.j.a(s).hashCode(), z2, z3, v, v1, v2, v3);
        this.j = s;
    }

    @AnimRes
    @AnimatorRes
    public final int a() {
        return this.f;
    }

    @AnimRes
    @AnimatorRes
    public final int b() {
        return this.g;
    }

    @AnimRes
    @AnimatorRes
    public final int c() {
        return this.h;
    }

    @AnimRes
    @AnimatorRes
    public final int d() {
        return this.i;
    }

    @IdRes
    @k(message = "Use popUpToId instead.", replaceWith = @c0(expression = "popUpToId", imports = {}))
    public final int e() {
        return this.c;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return L.g(NavOptions.class, class0) && (this.a == ((NavOptions)object0).a && this.b == ((NavOptions)object0).b && this.c == ((NavOptions)object0).c && L.g(this.j, ((NavOptions)object0).j) && this.d == ((NavOptions)object0).d && this.e == ((NavOptions)object0).e && this.f == ((NavOptions)object0).f && this.g == ((NavOptions)object0).g && this.h == ((NavOptions)object0).h && this.i == ((NavOptions)object0).i);
        }
        return false;
    }

    @IdRes
    public final int f() {
        return this.c;
    }

    @m
    public final String g() {
        return this.j;
    }

    public final boolean h() {
        return this.d;
    }

    @Override
    public int hashCode() {
        int v = ((this.i() * 0x1F + this.k()) * 0x1F + this.c) * 0x1F;
        return this.j == null ? (((((v * 0x1F + this.h()) * 0x1F + this.j()) * 0x1F + this.f) * 0x1F + this.g) * 0x1F + this.h) * 0x1F + this.i : ((((((v + this.j.hashCode()) * 0x1F + this.h()) * 0x1F + this.j()) * 0x1F + this.f) * 0x1F + this.g) * 0x1F + this.h) * 0x1F + this.i;
    }

    public final boolean i() {
        return this.a;
    }

    public final boolean j() {
        return this.e;
    }

    public final boolean k() {
        return this.b;
    }
}

