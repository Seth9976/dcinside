package com.dcinside.app.totalsearch.move;

import A3.p;
import Y.M;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.dcinside.app.base.d;
import com.dcinside.app.internal.c;
import com.dcinside.app.internal.r;
import com.dcinside.app.response.i;
import com.dcinside.app.util.Nk;
import com.dcinside.app.util.Xk;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.gl;
import com.dcinside.app.util.uk;
import com.dcinside.app.util.vk;
import com.dcinside.app.util.xk;
import com.dcinside.app.view.ClearableEditText;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import rx.o;
import y4.l;
import y4.m;

public final class MoveGalleryActivity extends d {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a(@l Context context0) {
            L.p(context0, "context");
            context0.startActivity(new Intent(context0, MoveGalleryActivity.class));
        }
    }

    private M u;
    @m
    private o v;
    @l
    public static final a w = null;
    public static final int x = 0;
    public static final int y = 1;
    public static final int z = 2;

    static {
        MoveGalleryActivity.w = new a(null);
    }

    private final void I1() {
        static final class b extends N implements Function1 {
            final MoveGalleryActivity e;
            final String f;

            b(MoveGalleryActivity moveGalleryActivity0, String s) {
                this.e = moveGalleryActivity0;
                this.f = s;
                super(1);
            }

            public final void a(i i0) {
                if(L.g(i0.h(), "false")) {
                    c.v(this.e, 0x7F1501C7);  // string:cannot_find_gallery "해당 갤러리를 찾을 수 없습니다."
                }
                else {
                    Xk.i(this.e, this.f);
                }
                gl.j(this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((i)object0));
                return S0.a;
            }
        }

        Nk.a.a(this);
        M m0 = this.u;
        M m1 = null;
        if(m0 == null) {
            L.S("binding");
            m0 = null;
        }
        if(m0.h.isChecked()) {
            M m2 = this.u;
            if(m2 == null) {
                L.S("binding");
            }
            else {
                m1 = m2;
            }
            m1 = String.valueOf(m1.c.getText());
        }
        else {
            M m3 = this.u;
            if(m3 == null) {
                L.S("binding");
                m3 = null;
            }
            if(m3.m.isChecked()) {
                M m4 = this.u;
                if(m4 == null) {
                    L.S("binding");
                }
                else {
                    m1 = m4;
                }
                m1 = "mi$" + m1.d.getText();
            }
            else {
                M m5 = this.u;
                if(m5 == null) {
                    L.S("binding");
                    m5 = null;
                }
                if(m5.r.isChecked()) {
                    M m6 = this.u;
                    if(m6 == null) {
                        L.S("binding");
                    }
                    else {
                        m1 = m6;
                    }
                    m1 = "pr$" + m1.e.getText();
                }
            }
        }
        if(m1 == null) {
            return;
        }
        gl.c(this);
        o o0 = this.v;
        if(o0 != null) {
            o0.l();
        }
        this.v = uk.kG(((String)m1), null, 0, null, null, null, null, null, null, null, null).M3(rx.android.schedulers.a.c()).y5((Object object0) -> {
            L.p(new b(this, ((String)m1)), "$tmp0");
            new b(this, ((String)m1)).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            c.v(this, (xk.g(throwable0.getMessage()) ? 0x7F1501C7 : 0x7F1502AC));  // string:cannot_find_gallery "해당 갤러리를 찾을 수 없습니다."
            gl.j(this);
        });
    }

    // 检测为 Lambda 实现
    private static final void J1(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void K1(MoveGalleryActivity moveGalleryActivity0, Throwable throwable0) [...]

    private final void L1() {
        this.M1(dl.a.j0());
    }

    private final void M1(int v) {
        M m0 = this.u;
        M m1 = null;
        if(m0 == null) {
            L.S("binding");
            m0 = null;
        }
        boolean z = false;
        m0.h.setChecked(v == 0);
        M m2 = this.u;
        if(m2 == null) {
            L.S("binding");
            m2 = null;
        }
        m2.m.setChecked(v == 1);
        M m3 = this.u;
        if(m3 == null) {
            L.S("binding");
            m3 = null;
        }
        m3.r.setChecked(v == 2);
        int v1 = vk.b(this, 0x7F040158);  // attr:colorPrimary
        int v2 = vk.b(this, 0x7F04032A);  // attr:icTintNormal
        int v3 = vk.b(this, 0x1010036);
        switch(v) {
            case 0: {
                M m4 = this.u;
                if(m4 == null) {
                    L.S("binding");
                    m4 = null;
                }
                m4.j.setTextColor(v1);
                M m5 = this.u;
                if(m5 == null) {
                    L.S("binding");
                    m5 = null;
                }
                m5.i.setTextColor(v3);
                M m6 = this.u;
                if(m6 == null) {
                    L.S("binding");
                    m6 = null;
                }
                m6.o.setTextColor(v2);
                M m7 = this.u;
                if(m7 == null) {
                    L.S("binding");
                    m7 = null;
                }
                m7.n.setTextColor(v2);
                M m8 = this.u;
                if(m8 == null) {
                    L.S("binding");
                    m8 = null;
                }
                m8.t.setTextColor(v2);
                M m9 = this.u;
                if(m9 == null) {
                    L.S("binding");
                    m9 = null;
                }
                m9.s.setTextColor(v2);
                break;
            }
            case 1: {
                M m10 = this.u;
                if(m10 == null) {
                    L.S("binding");
                    m10 = null;
                }
                m10.j.setTextColor(v2);
                M m11 = this.u;
                if(m11 == null) {
                    L.S("binding");
                    m11 = null;
                }
                m11.i.setTextColor(v2);
                M m12 = this.u;
                if(m12 == null) {
                    L.S("binding");
                    m12 = null;
                }
                m12.o.setTextColor(v1);
                M m13 = this.u;
                if(m13 == null) {
                    L.S("binding");
                    m13 = null;
                }
                m13.n.setTextColor(v3);
                M m14 = this.u;
                if(m14 == null) {
                    L.S("binding");
                    m14 = null;
                }
                m14.t.setTextColor(v2);
                M m15 = this.u;
                if(m15 == null) {
                    L.S("binding");
                    m15 = null;
                }
                m15.s.setTextColor(v2);
                break;
            }
            case 2: {
                M m16 = this.u;
                if(m16 == null) {
                    L.S("binding");
                    m16 = null;
                }
                m16.j.setTextColor(v2);
                M m17 = this.u;
                if(m17 == null) {
                    L.S("binding");
                    m17 = null;
                }
                m17.i.setTextColor(v2);
                M m18 = this.u;
                if(m18 == null) {
                    L.S("binding");
                    m18 = null;
                }
                m18.o.setTextColor(v2);
                M m19 = this.u;
                if(m19 == null) {
                    L.S("binding");
                    m19 = null;
                }
                m19.n.setTextColor(v2);
                M m20 = this.u;
                if(m20 == null) {
                    L.S("binding");
                    m20 = null;
                }
                m20.t.setTextColor(v1);
                M m21 = this.u;
                if(m21 == null) {
                    L.S("binding");
                    m21 = null;
                }
                m21.s.setTextColor(v3);
            }
        }
        M m22 = this.u;
        if(m22 == null) {
            L.S("binding");
            m22 = null;
        }
        ClearableEditText clearableEditText0 = m22.c;
        clearableEditText0.setEnabled(v == 0);
        if(clearableEditText0.isEnabled()) {
            clearableEditText0.requestFocus();
            Nk.a.f(clearableEditText0);
        }
        M m23 = this.u;
        if(m23 == null) {
            L.S("binding");
            m23 = null;
        }
        ClearableEditText clearableEditText1 = m23.d;
        clearableEditText1.setEnabled(v == 1);
        if(clearableEditText1.isEnabled()) {
            clearableEditText1.requestFocus();
            Nk.a.f(clearableEditText1);
        }
        M m24 = this.u;
        if(m24 == null) {
            L.S("binding");
        }
        else {
            m1 = m24;
        }
        ClearableEditText clearableEditText2 = m1.e;
        if(v == 2) {
            z = true;
        }
        clearableEditText2.setEnabled(z);
        if(clearableEditText2.isEnabled()) {
            clearableEditText2.requestFocus();
            Nk.a.f(clearableEditText2);
        }
        dl.a.b4(v);
    }

    @Override  // com.dcinside.app.base.d
    protected void onCreate(@m Bundle bundle0) {
        @f(c = "com.dcinside.app.totalsearch.move.MoveGalleryActivity$onCreate$1", f = "MoveGalleryActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.totalsearch.move.MoveGalleryActivity.c extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final MoveGalleryActivity l;

            com.dcinside.app.totalsearch.move.MoveGalleryActivity.c(MoveGalleryActivity moveGalleryActivity0, kotlin.coroutines.d d0) {
                this.l = moveGalleryActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.totalsearch.move.MoveGalleryActivity.c(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.M1(0);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.totalsearch.move.MoveGalleryActivity$onCreate$2", f = "MoveGalleryActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.totalsearch.move.MoveGalleryActivity.d extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final MoveGalleryActivity l;

            com.dcinside.app.totalsearch.move.MoveGalleryActivity.d(MoveGalleryActivity moveGalleryActivity0, kotlin.coroutines.d d0) {
                this.l = moveGalleryActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.totalsearch.move.MoveGalleryActivity.d(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.M1(1);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.totalsearch.move.MoveGalleryActivity$onCreate$3", f = "MoveGalleryActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class e extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final MoveGalleryActivity l;

            e(MoveGalleryActivity moveGalleryActivity0, kotlin.coroutines.d d0) {
                this.l = moveGalleryActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new e(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.M1(2);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.totalsearch.move.MoveGalleryActivity$onCreate$4", f = "MoveGalleryActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.totalsearch.move.MoveGalleryActivity.f extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final MoveGalleryActivity l;

            com.dcinside.app.totalsearch.move.MoveGalleryActivity.f(MoveGalleryActivity moveGalleryActivity0, kotlin.coroutines.d d0) {
                this.l = moveGalleryActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.totalsearch.move.MoveGalleryActivity.f(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.I1();
                return S0.a;
            }
        }

        super.onCreate(bundle0);
        M m0 = M.c(this.getLayoutInflater());
        L.o(m0, "inflate(...)");
        this.u = m0;
        if(m0 == null) {
            L.S("binding");
            m0 = null;
        }
        this.setContentView(m0.b());
        M m1 = this.u;
        if(m1 == null) {
            L.S("binding");
            m1 = null;
        }
        this.S0(m1.u);
        kr.bhbfhfb.designcompat.a.d(this);
        this.L1();
        M m2 = this.u;
        if(m2 == null) {
            L.S("binding");
            m2 = null;
        }
        L.o(m2.f, "moveGalleryMain");
        com.dcinside.app.totalsearch.move.MoveGalleryActivity.c moveGalleryActivity$c0 = new com.dcinside.app.totalsearch.move.MoveGalleryActivity.c(this, null);
        r.M(m2.f, null, moveGalleryActivity$c0, 1, null);
        M m3 = this.u;
        if(m3 == null) {
            L.S("binding");
            m3 = null;
        }
        L.o(m3.k, "moveGalleryMini");
        com.dcinside.app.totalsearch.move.MoveGalleryActivity.d moveGalleryActivity$d0 = new com.dcinside.app.totalsearch.move.MoveGalleryActivity.d(this, null);
        r.M(m3.k, null, moveGalleryActivity$d0, 1, null);
        M m4 = this.u;
        if(m4 == null) {
            L.S("binding");
            m4 = null;
        }
        L.o(m4.p, "moveGalleryPerson");
        e moveGalleryActivity$e0 = new e(this, null);
        r.M(m4.p, null, moveGalleryActivity$e0, 1, null);
        M m5 = this.u;
        if(m5 == null) {
            L.S("binding");
            m5 = null;
        }
        L.o(m5.b, "moveGalleryFind");
        com.dcinside.app.totalsearch.move.MoveGalleryActivity.f moveGalleryActivity$f0 = new com.dcinside.app.totalsearch.move.MoveGalleryActivity.f(this, null);
        r.M(m5.b, null, moveGalleryActivity$f0, 1, null);
    }

    @Override  // com.dcinside.app.base.d
    protected void onDestroy() {
        super.onDestroy();
        o o0 = this.v;
        if(o0 != null) {
            o0.l();
        }
        this.v = null;
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        if(menuItem0.getItemId() == 0x102002C) {
            Nk.a.a(this);
            this.getOnBackPressedDispatcher().p();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }
}

