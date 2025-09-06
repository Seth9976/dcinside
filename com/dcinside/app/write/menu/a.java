package com.dcinside.app.write.menu;

import A3.p;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.dcinside.app.internal.r;
import com.dcinside.app.realm.B;
import com.dcinside.app.response.GalleryInfo;
import java.util.ArrayList;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nPostWriteMenuHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostWriteMenuHelper.kt\ncom/dcinside/app/write/menu/PostWriteMenuHelper\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,114:1\n3829#2:115\n4344#2,2:116\n*S KotlinDebug\n*F\n+ 1 PostWriteMenuHelper.kt\ncom/dcinside/app/write/menu/PostWriteMenuHelper\n*L\n63#1:115\n63#1:116,2\n*E\n"})
public final class a {
    @l
    private final ViewGroup a;
    @l
    private final ViewGroup b;
    @m
    private final Function1 c;
    @l
    private final MenuVisible d;

    public a(@m MenuVisible menuVisible0, @m GalleryInfo galleryInfo0, @l ViewGroup viewGroup0, @l ViewGroup viewGroup1, @m Function1 function10) {
        com.dcinside.app.type.m m0 = null;
        L.p(viewGroup0, "menuWrapper");
        L.p(viewGroup1, "moreMenuWrapper");
        super();
        this.a = viewGroup0;
        this.b = viewGroup1;
        this.c = function10;
        if(menuVisible0 == null) {
            String s = galleryInfo0 == null ? null : galleryInfo0.Z();
            String s1 = galleryInfo0 == null ? null : galleryInfo0.Y();
            String s2 = galleryInfo0 == null ? null : galleryInfo0.e();
            if(galleryInfo0 != null) {
                m0 = galleryInfo0.q();
            }
            boolean z = L.g(s, "1") || L.g(s, "Y");
            boolean z1 = L.g(s1, "1") || L.g(s1, "Y");
            boolean z2 = L.g(s2, "Y") || L.g(s2, "1");
            String s3 = B.E.k0();
            boolean z3 = s3 != null && s3.length() != 0 && z2;
            menuVisible0 = new MenuVisible(m0 == com.dcinside.app.type.m.i, z, z1, z3, z2, galleryInfo0 != null && galleryInfo0.f());
        }
        this.d = menuVisible0;
    }

    // 去混淆评级： 低(20)
    public final boolean b() {
        String s = B.E.k0();
        return s != null && s.length() != 0 && this.d.c() || this.d.f() || this.d.a();
    }

    @m
    public final View c(@l Object object0) {
        L.p(object0, "tag");
        View view0 = this.a.findViewWithTag(object0);
        return view0 == null ? this.b.findViewWithTag(object0) : view0;
    }

    @l
    public final MenuVisible d() {
        return this.d;
    }

    public final boolean e() {
        return this.b.getChildCount() > 0;
    }

    public final void f() {
        @f(c = "com.dcinside.app.write.menu.PostWriteMenuHelper$initPostMenu$1$1$1", f = "PostWriteMenuHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.menu.a.a extends o implements p {
            int k;
            Object l;
            final a m;

            com.dcinside.app.write.menu.a.a(a a0, d d0) {
                this.m = a0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                com.dcinside.app.write.menu.a.a a$a0 = new com.dcinside.app.write.menu.a.a(this.m, d0);
                a$a0.l = view0;
                return a$a0.invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                View view0 = (View)this.l;
                Function1 function10 = this.m.c;
                if(function10 != null) {
                    function10.invoke(view0);
                }
                return S0.a;
            }
        }

        ArrayList arrayList0 = new ArrayList();
        b[] arr_b = b.values();
        ArrayList arrayList1 = new ArrayList();
        for(int v = 0; v < arr_b.length; ++v) {
            b b0 = arr_b[v];
            if(b.e.a(b0, this.d)) {
                arrayList1.add(b0);
            }
        }
        arrayList0.addAll(arrayList1);
        int v1 = arrayList0.size();
        ViewGroup viewGroup0 = this.a;
        for(int v2 = 0; v2 < v1; ++v2) {
            Object object0 = arrayList0.remove(0);
            L.o(object0, "removeAt(...)");
            Context context0 = viewGroup0.getContext();
            L.o(context0, "getContext(...)");
            c c0 = new c(context0);
            c0.setIcon(((b)object0).c());
            c0.setPadding(((b)object0).e());
            c0.setTag(((b)object0).f());
            r.M(c0, null, new com.dcinside.app.write.menu.a.a(this, null), 1, null);
            viewGroup0.addView(c0);
        }
    }

    public final void g() {
    }

    public final void h() {
        this.a.removeAllViews();
        this.b.removeAllViews();
    }
}

