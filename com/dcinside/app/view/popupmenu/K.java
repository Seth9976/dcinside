package com.dcinside.app.view.popupmenu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.UiThread;
import java.util.List;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class k {
    public static abstract class a {
        @l
        private final Function1 a;

        public a(@l Function1 function10) {
            L.p(function10, "callback");
            super();
            this.a = function10;
        }

        @l
        public Function1 a() {
            return this.a;
        }
    }

    public static final class b extends a {
        private final int b;
        @l
        private final Function1 c;
        @l
        private final Function1 d;

        public b(@LayoutRes int v, @l Function1 function10, @l Function1 function11) {
            L.p(function10, "viewBoundCallback");
            L.p(function11, "callback");
            super(function11);
            this.b = v;
            this.c = function10;
            this.d = function11;
        }

        @Override  // com.dcinside.app.view.popupmenu.k$a
        @l
        public Function1 a() {
            return this.d;
        }

        public final int b() {
            return this.b;
        }

        @l
        public final Function1 c() {
            return this.c;
        }

        @l
        public final Function1 d() {
            return this.d;
        }

        @l
        public final b e(@LayoutRes int v, @l Function1 function10, @l Function1 function11) {
            L.p(function10, "viewBoundCallback");
            L.p(function11, "callback");
            return new b(v, function10, function11);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof b)) {
                return false;
            }
            if(this.b != ((b)object0).b) {
                return false;
            }
            return L.g(this.c, ((b)object0).c) ? L.g(this.d, ((b)object0).d) : false;
        }

        public static b f(b k$b0, int v, Function1 function10, Function1 function11, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = k$b0.b;
            }
            if((v1 & 2) != 0) {
                function10 = k$b0.c;
            }
            if((v1 & 4) != 0) {
                function11 = k$b0.d;
            }
            return k$b0.e(v, function10, function11);
        }

        public final int g() {
            return this.b;
        }

        @l
        public final Function1 h() {
            return this.c;
        }

        @Override
        public int hashCode() {
            return (this.b * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode();
        }

        @Override
        @l
        public String toString() {
            return "PopupMenuCustomItem(layoutResId=" + this.b + ", viewBoundCallback=" + this.c + ", callback=" + this.d + ")";
        }
    }

    public static final class c extends a {
        @l
        private final String b;
        private final int c;
        private final int d;
        private final int e;
        @m
        private final Drawable f;
        private final int g;
        private final boolean h;
        @l
        private final o i;
        @l
        private final Function1 j;

        public c(@l String s, @ColorInt int v, @DrawableRes int v1, @DrawableRes int v2, @m Drawable drawable0, @ColorInt int v3, boolean z, @l o o0, @l Function1 function10) {
            L.p(s, "label");
            L.p(o0, "menuIconGravity");
            L.p(function10, "callback");
            super(function10);
            this.b = s;
            this.c = v;
            this.d = v1;
            this.e = v2;
            this.f = drawable0;
            this.g = v3;
            this.h = z;
            this.i = o0;
            this.j = function10;
        }

        public c(String s, int v, int v1, int v2, Drawable drawable0, int v3, boolean z, o o0, Function1 function10, int v4, w w0) {
            this(s, v, v1, v2, drawable0, v3, z, ((v4 & 0x80) == 0 ? o0 : o.a), function10);
        }

        @Override  // com.dcinside.app.view.popupmenu.k$a
        @l
        public Function1 a() {
            return this.j;
        }

        @l
        public final String b() {
            return this.b;
        }

        public final int c() {
            return this.c;
        }

        public final int d() {
            return this.d;
        }

        public final int e() {
            return this.e;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof c)) {
                return false;
            }
            if(!L.g(this.b, ((c)object0).b)) {
                return false;
            }
            if(this.c != ((c)object0).c) {
                return false;
            }
            if(this.d != ((c)object0).d) {
                return false;
            }
            if(this.e != ((c)object0).e) {
                return false;
            }
            if(!L.g(this.f, ((c)object0).f)) {
                return false;
            }
            if(this.g != ((c)object0).g) {
                return false;
            }
            if(this.h != ((c)object0).h) {
                return false;
            }
            return this.i == ((c)object0).i ? L.g(this.j, ((c)object0).j) : false;
        }

        @m
        public final Drawable f() {
            return this.f;
        }

        public final int g() {
            return this.g;
        }

        public final boolean h() {
            return this.h;
        }

        @Override
        public int hashCode() {
            int v = (((this.b.hashCode() * 0x1F + this.c) * 0x1F + this.d) * 0x1F + this.e) * 0x1F;
            return this.f == null ? (((v * 0x1F + this.g) * 0x1F + androidx.compose.foundation.c.a(this.h)) * 0x1F + this.i.hashCode()) * 0x1F + this.j.hashCode() : ((((v + this.f.hashCode()) * 0x1F + this.g) * 0x1F + androidx.compose.foundation.c.a(this.h)) * 0x1F + this.i.hashCode()) * 0x1F + this.j.hashCode();
        }

        @l
        public final o i() {
            return this.i;
        }

        @l
        public final Function1 j() {
            return this.j;
        }

        @l
        public final c k(@l String s, @ColorInt int v, @DrawableRes int v1, @DrawableRes int v2, @m Drawable drawable0, @ColorInt int v3, boolean z, @l o o0, @l Function1 function10) {
            L.p(s, "label");
            L.p(o0, "menuIconGravity");
            L.p(function10, "callback");
            return new c(s, v, v1, v2, drawable0, v3, z, o0, function10);
        }

        public static c l(c k$c0, String s, int v, int v1, int v2, Drawable drawable0, int v3, boolean z, o o0, Function1 function10, int v4, Object object0) {
            String s1 = (v4 & 1) == 0 ? s : k$c0.b;
            int v5 = (v4 & 2) == 0 ? v : k$c0.c;
            int v6 = (v4 & 4) == 0 ? v1 : k$c0.d;
            int v7 = (v4 & 8) == 0 ? v2 : k$c0.e;
            Drawable drawable1 = (v4 & 16) == 0 ? drawable0 : k$c0.f;
            int v8 = (v4 & 0x20) == 0 ? v3 : k$c0.g;
            boolean z1 = (v4 & 0x40) == 0 ? z : k$c0.h;
            o o1 = (v4 & 0x80) == 0 ? o0 : k$c0.i;
            return (v4 & 0x100) == 0 ? k$c0.k(s1, v5, v6, v7, drawable1, v8, z1, o1, function10) : k$c0.k(s1, v5, v6, v7, drawable1, v8, z1, o1, k$c0.j);
        }

        public final int m() {
            return this.d;
        }

        public final int n() {
            return this.g;
        }

        @m
        public final Drawable o() {
            return this.f;
        }

        @l
        public final String p() {
            return this.b;
        }

        public final int q() {
            return this.c;
        }

        @l
        public final o r() {
            return this.i;
        }

        public final int s() {
            return this.e;
        }

        public final boolean t() {
            return this.h;
        }

        @Override
        @l
        public String toString() {
            return "PopupMenuItem(label=" + this.b + ", labelColor=" + this.c + ", icon=" + this.d + ", newIcon=" + this.e + ", iconDrawable=" + this.f + ", iconColor=" + this.g + ", isDismissOnClick=" + this.h + ", menuIconGravity=" + this.i + ", callback=" + this.j + ")";
        }
    }

    public static final class d {
        @m
        private final String a;
        @l
        private final List b;

        public d(@m String s, @l List list0) {
            L.p(list0, "items");
            super();
            this.a = s;
            this.b = list0;
        }

        @m
        public final String a() {
            return this.a;
        }

        @l
        public final List b() {
            return this.b;
        }

        @l
        public final d c(@m String s, @l List list0) {
            L.p(list0, "items");
            return new d(s, list0);
        }

        public static d d(d k$d0, String s, List list0, int v, Object object0) {
            if((v & 1) != 0) {
                s = k$d0.a;
            }
            if((v & 2) != 0) {
                list0 = k$d0.b;
            }
            return k$d0.c(s, list0);
        }

        @l
        public final List e() {
            return this.b;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof d)) {
                return false;
            }
            return L.g(this.a, ((d)object0).a) ? L.g(this.b, ((d)object0).b) : false;
        }

        @m
        public final String f() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a == null ? this.b.hashCode() : this.a.hashCode() * 0x1F + this.b.hashCode();
        }

        @Override
        @l
        public String toString() {
            return "PopupMenuSection(title=" + this.a + ", items=" + this.b + ")";
        }
    }

    private final int a;
    @l
    private final List b;

    public k(int v, @l List list0) {
        L.p(list0, "sections");
        super();
        this.a = v;
        this.b = list0;
    }

    public final int a() {
        return this.a;
    }

    @l
    public final List b() {
        return this.b;
    }

    @UiThread
    @l
    public final n c(@l Context context0, @l View view0) {
        static final class e extends N implements Function1 {
            final n e;

            e(n n0) {
                this.e = n0;
                super(1);
            }

            public final void a(@l a k$a0) {
                L.p(k$a0, "it");
                this.e.b();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((a)object0));
                return S0.a;
            }
        }

        L.p(context0, "context");
        L.p(view0, "anchor");
        n n0 = new n(context0, this.a);
        e k$e0 = new e(n0);
        n0.k(new q(context0, this.b, k$e0));
        n0.l(view0);
        n0.t();
        return n0;
    }

    @UiThread
    @l
    public final n d(@l Context context0, @l View view0, @l Function1 function10) {
        static final class f extends N implements Function1 {
            final n e;

            f(n n0) {
                this.e = n0;
                super(1);
            }

            public final void a(@l a k$a0) {
                L.p(k$a0, "it");
                this.e.b();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((a)object0));
                return S0.a;
            }
        }

        L.p(context0, "context");
        L.p(view0, "anchor");
        L.p(function10, "listener");
        n n0 = new n(context0, this.a);
        f k$f0 = new f(n0);
        n0.k(new q(context0, this.b, k$f0));
        n0.l(view0);
        function10.invoke(n0);
        n0.t();
        return n0;
    }
}

