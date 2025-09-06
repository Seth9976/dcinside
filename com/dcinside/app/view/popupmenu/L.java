package com.dcinside.app.view.popupmenu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import java.util.ArrayList;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.m;

@r
@s0({"SMAP\nMaterialPopupMenuBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaterialPopupMenuBuilder.kt\ncom/dcinside/app/view/popupmenu/MaterialPopupMenuBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,263:1\n1#2:264\n1557#3:265\n1628#3,3:266\n*S KotlinDebug\n*F\n+ 1 MaterialPopupMenuBuilder.kt\ncom/dcinside/app/view/popupmenu/MaterialPopupMenuBuilder\n*L\n52#1:265\n52#1:266,3\n*E\n"})
public final class l {
    @r
    public static abstract class a {
        @y4.l
        private Function1 a;

        public a() {
            static final class com.dcinside.app.view.popupmenu.l.a.a extends N implements Function1 {
                public static final com.dcinside.app.view.popupmenu.l.a.a e;

                static {
                    com.dcinside.app.view.popupmenu.l.a.a.e = new com.dcinside.app.view.popupmenu.l.a.a();
                }

                com.dcinside.app.view.popupmenu.l.a.a() {
                    super(1);
                }

                public final void a(@y4.l Context context0) {
                    L.p(context0, "it");
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.a(((Context)object0));
                    return S0.a;
                }
            }

            this.a = com.dcinside.app.view.popupmenu.l.a.a.e;
        }

        @y4.l
        public abstract com.dcinside.app.view.popupmenu.k.a a();

        @y4.l
        public final Function1 b() {
            return this.a;
        }

        public final void c(@y4.l Function1 function10) {
            L.p(function10, "<set-?>");
            this.a = function10;
        }
    }

    @r
    @s0({"SMAP\nMaterialPopupMenuBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaterialPopupMenuBuilder.kt\ncom/dcinside/app/view/popupmenu/MaterialPopupMenuBuilder$CustomItemHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,263:1\n1#2:264\n*E\n"})
    public static final class b extends a {
        @LayoutRes
        private int b;
        @y4.l
        private Function1 c;

        public b() {
            static final class com.dcinside.app.view.popupmenu.l.b.a extends N implements Function1 {
                public static final com.dcinside.app.view.popupmenu.l.b.a e;

                static {
                    com.dcinside.app.view.popupmenu.l.b.a.e = new com.dcinside.app.view.popupmenu.l.b.a();
                }

                com.dcinside.app.view.popupmenu.l.b.a() {
                    super(1);
                }

                public final void b(@y4.l View view0) {
                    L.p(view0, "it");
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.b(((View)object0));
                    return S0.a;
                }
            }

            this.c = com.dcinside.app.view.popupmenu.l.b.a.e;
        }

        @Override  // com.dcinside.app.view.popupmenu.l$a
        public com.dcinside.app.view.popupmenu.k.a a() {
            return this.d();
        }

        @y4.l
        public com.dcinside.app.view.popupmenu.k.b d() {
            int v = this.b;
            if(v == 0) {
                throw new IllegalStateException("Layout resource ID must be set for a custom item!");
            }
            return new com.dcinside.app.view.popupmenu.k.b(v, this.c, this.b());
        }

        public final int e() {
            return this.b;
        }

        @y4.l
        public final Function1 f() {
            return this.c;
        }

        public final void g(int v) {
            this.b = v;
        }

        public final void h(@y4.l Function1 function10) {
            L.p(function10, "<set-?>");
            this.c = function10;
        }

        @Override
        @y4.l
        public String toString() {
            return "CustomItemHolder(layoutResId=" + this.b + ", viewBoundCallback=" + this.c + ", callback=" + this.b() + ")";
        }
    }

    @r
    @s0({"SMAP\nMaterialPopupMenuBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaterialPopupMenuBuilder.kt\ncom/dcinside/app/view/popupmenu/MaterialPopupMenuBuilder$ItemHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,263:1\n1#2:264\n*E\n"})
    public static final class c extends a {
        @m
        private String b;
        @ColorInt
        private int c;
        @DrawableRes
        private int d;
        @DrawableRes
        private int e;
        @m
        private Drawable f;
        @ColorInt
        private int g;
        private boolean h;
        @y4.l
        private o i;

        public c() {
            this.h = true;
            this.i = o.a;
        }

        @Override  // com.dcinside.app.view.popupmenu.l$a
        public com.dcinside.app.view.popupmenu.k.a a() {
            return this.d();
        }

        @y4.l
        public com.dcinside.app.view.popupmenu.k.c d() {
            String s = this.b;
            if(s == null) {
                throw new IllegalStateException(("Item \'" + this + "\' does not have a label").toString());
            }
            return new com.dcinside.app.view.popupmenu.k.c(s, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.b());
        }

        public final int e() {
            return this.d;
        }

        public final int f() {
            return this.g;
        }

        @m
        public final Drawable g() {
            return this.f;
        }

        @m
        public final String h() {
            return this.b;
        }

        public final int i() {
            return this.c;
        }

        @y4.l
        public final o j() {
            return this.i;
        }

        public final int k() {
            return this.e;
        }

        public final boolean l() {
            return this.h;
        }

        public final void m(boolean z) {
            this.h = z;
        }

        public final void n(int v) {
            this.d = v;
        }

        public final void o(int v) {
            this.g = v;
        }

        public final void p(@m Drawable drawable0) {
            this.f = drawable0;
        }

        public final void q(@m String s) {
            this.b = s;
        }

        public final void r(int v) {
            this.c = v;
        }

        public final void s(@y4.l o o0) {
            L.p(o0, "<set-?>");
            this.i = o0;
        }

        public final void t(int v) {
            this.e = v;
        }

        @Override
        @y4.l
        public String toString() {
            return "ItemHolder(label=" + this.b + ", labelColor=" + this.c + ", icon=" + this.d + ", iconDrawable=" + this.f + ", iconColor=" + this.g + ", isDismissOnClick=" + this.h + ", iconGravity=" + this.i + ", callback=" + this.b() + ")";
        }
    }

    @r
    @s0({"SMAP\nMaterialPopupMenuBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaterialPopupMenuBuilder.kt\ncom/dcinside/app/view/popupmenu/MaterialPopupMenuBuilder$SectionHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,263:1\n1#2:264\n1557#3:265\n1628#3,3:266\n*S KotlinDebug\n*F\n+ 1 MaterialPopupMenuBuilder.kt\ncom/dcinside/app/view/popupmenu/MaterialPopupMenuBuilder$SectionHolder\n*L\n100#1:265\n100#1:266,3\n*E\n"})
    public static final class d {
        @m
        private String a;
        @y4.l
        private final ArrayList b;

        public d() {
            this.b = new ArrayList();
        }

        @y4.l
        public final com.dcinside.app.view.popupmenu.k.d a() {
            if(this.b.isEmpty()) {
                throw new IllegalStateException(("Section \'" + this + "\' has no items!").toString());
            }
            String s = this.a;
            ArrayList arrayList0 = new ArrayList(u.b0(this.b, 10));
            for(Object object0: this.b) {
                arrayList0.add(((a)object0).a());
            }
            return new com.dcinside.app.view.popupmenu.k.d(s, arrayList0);
        }

        public final void b(@y4.l Function1 function10) {
            L.p(function10, "init");
            b l$b0 = new b();
            function10.invoke(l$b0);
            this.b.add(l$b0);
        }

        @m
        public final String c() {
            return this.a;
        }

        public final void d(@y4.l Function1 function10) {
            L.p(function10, "init");
            c l$c0 = new c();
            function10.invoke(l$c0);
            this.b.add(l$c0);
        }

        public final void e(@m String s) {
            this.a = s;
        }

        @Override
        @y4.l
        public String toString() {
            return "SectionHolder(title=" + this.a + ", itemsHolderList=" + this.b + ")";
        }
    }

    private int a;
    @y4.l
    private final ArrayList b;

    public l() {
        this.b = new ArrayList();
    }

    @y4.l
    public final k a() {
        if(this.b.isEmpty()) {
            throw new IllegalStateException("Popup menu sections cannot be empty!");
        }
        ArrayList arrayList0 = new ArrayList(u.b0(this.b, 10));
        for(Object object0: this.b) {
            arrayList0.add(((d)object0).a());
        }
        return new k(this.a, arrayList0);
    }

    public final int b() {
        return this.a;
    }

    public final void c(@y4.l Function1 function10) {
        L.p(function10, "init");
        d l$d0 = new d();
        function10.invoke(l$d0);
        this.b.add(l$d0);
    }

    public final void d(int v) {
        this.a = v;
    }
}

