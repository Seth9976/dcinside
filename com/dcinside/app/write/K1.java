package com.dcinside.app.write;

import A3.p;
import A3.q;
import Z.d;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import androidx.appcompat.app.AppCompatActivity;
import com.dcinside.app.base.e;
import com.dcinside.app.internal.i;
import com.dcinside.app.internal.r;
import com.dcinside.app.realm.k0;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Nk;
import com.dcinside.app.util.Wk;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

public final class k1 extends e implements d {
    @l
    private final View a;
    @l
    private final CheckBox b;

    public k1(@l ViewGroup viewGroup0) {
        @f(c = "com.dcinside.app.write.PostWriteAiEasyHolder$1", f = "PostWriteAiEasyHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements p {
            int k;
            final k1 l;

            a(k1 k10, kotlin.coroutines.d d0) {
                this.l = k10;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new a(this.l, d0).invokeSuspend(S0.a);
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
                this.l.s();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.PostWriteAiEasyHolder$2", f = "PostWriteAiEasyHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements p {
            int k;
            final k1 l;

            b(k1 k10, kotlin.coroutines.d d0) {
                this.l = k10;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new b(this.l, d0).invokeSuspend(S0.a);
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
                this.l.t();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.PostWriteAiEasyHolder$3", f = "PostWriteAiEasyHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends o implements p {
            int k;
            final k1 l;

            c(k1 k10, kotlin.coroutines.d d0) {
                this.l = k10;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new c(this.l, d0).invokeSuspend(S0.a);
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
                this.l.p();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.PostWriteAiEasyHolder$4", f = "PostWriteAiEasyHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.k1.d extends o implements q {
            int k;
            boolean l;
            final k1 m;

            com.dcinside.app.write.k1.d(k1 k10, kotlin.coroutines.d d0) {
                this.m = k10;
                super(4, d0);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                return this.a(((O)object0), ((CompoundButton)object1), ((Boolean)object2).booleanValue(), ((kotlin.coroutines.d)object3));
            }

            @m
            public final Object a(@l O o0, @l CompoundButton compoundButton0, boolean z, @m kotlin.coroutines.d d0) {
                com.dcinside.app.write.k1.d k1$d0 = new com.dcinside.app.write.k1.d(this.m, d0);
                k1$d0.l = z;
                return k1$d0.invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.m.o(this.l);
                return S0.a;
            }
        }

        L.p(viewGroup0, "parent");
        super(viewGroup0, 0x7F0E02B6);  // layout:view_write_item_ai_easy_image
        View view0 = this.itemView.findViewById(0x7F0B0B76);  // id:post_write_item_ai_easy_delete
        L.o(view0, "findViewById(...)");
        this.a = view0;
        View view1 = this.itemView.findViewById(0x7F0B0B78);  // id:post_write_item_ai_easy_image_hide_prompt
        L.o(view1, "findViewById(...)");
        this.b = (CheckBox)view1;
        L.o(this.itemView, "itemView");
        a k1$a0 = new a(this, null);
        r.M(this.itemView, null, k1$a0, 1, null);
        L.o(this.itemView, "itemView");
        b k1$b0 = new b(this, null);
        r.S(this.itemView, null, false, k1$b0, 3, null);
        r.M(view0, null, new c(this, null), 1, null);
        r.J(((CheckBox)view1), null, new com.dcinside.app.write.k1.d(this, null), 1, null);
    }

    @Override  // Z.d
    public void a() {
        this.itemView.setBackgroundColor(0xFFCCCCCC);
        this.itemView.setAlpha(0.7f);
    }

    @Override  // Z.d
    public void c() {
        this.itemView.setBackgroundColor(0);
        this.itemView.setAlpha(1.0f);
    }

    @l
    public final CheckBox n() {
        return this.b;
    }

    private final void o(boolean z) {
        i i0 = com.dcinside.app.internal.c.p(this);
        if(i0 == null) {
            return;
        }
        ((d1)i0.h()).X(this.getBindingAdapterPosition(), z);
    }

    private final void p() {
        static final class com.dcinside.app.write.k1.e extends N implements Function1 {
            public static final com.dcinside.app.write.k1.e e;

            static {
                com.dcinside.app.write.k1.e.e = new com.dcinside.app.write.k1.e();
            }

            com.dcinside.app.write.k1.e() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.m(0x7F1500A2);  // string:alert_delete "정말 삭제하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class com.dcinside.app.write.k1.f extends N implements Function1 {
            public static final com.dcinside.app.write.k1.f e;

            static {
                com.dcinside.app.write.k1.f.e = new com.dcinside.app.write.k1.f();
            }

            com.dcinside.app.write.k1.f() {
                super(1);
            }

            public final Boolean a(Boolean boolean0) {
                return boolean0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Boolean)object0));
            }
        }


        static final class g extends N implements Function1 {
            final d1 e;
            final int f;

            g(d1 d10, int v) {
                this.e = d10;
                this.f = v;
                super(1);
            }

            public final void a(Boolean boolean0) {
                this.e.q(this.f);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        com.dcinside.app.internal.c.A(this);
        i i0 = com.dcinside.app.internal.c.p(this);
        if(i0 != null) {
            d1 d10 = (d1)i0.h();
            if(d10 != null) {
                int v = this.getBindingAdapterPosition();
                Context context0 = Dl.b(this.itemView);
                L.n(context0, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                com.dcinside.app.perform.e.e.a(((AppCompatActivity)context0)).n(com.dcinside.app.write.k1.e.e).z(0x104000A).x(0x1040000).b().Z1((Object object0) -> {
                    L.p(com.dcinside.app.write.k1.f.e, "$tmp0");
                    return (Boolean)com.dcinside.app.write.k1.f.e.invoke(object0);
                }).x5((Object object0) -> {
                    L.p(new g(d10, v), "$tmp0");
                    new g(d10, v).invoke(object0);
                });
            }
        }
    }

    // 检测为 Lambda 实现
    private static final Boolean q(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void r(Function1 function10, Object object0) [...]

    private final void s() {
        i i0 = com.dcinside.app.internal.c.q(this);
        if(i0 == null) {
            return;
        }
        com.dcinside.app.internal.c.A(this);
        d1 d10 = (d1)i0.h();
        Nk.a.a(i0.g());
        ((PostWriteActivity)i0.g()).m9();
        int v = i0.i();
        if(v + 1 == d10.S().size()) {
            d10.z(v + 1);
            return;
        }
        k0 k00 = (k0)d10.S().get(v + 1);
        if(k0.r.J(k00)) {
            d10.G(v + 1);
            return;
        }
        d10.z(v + 1);
    }

    private final void t() {
        i i0 = com.dcinside.app.internal.c.q(this);
        if(i0 == null) {
            return;
        }
        com.dcinside.app.internal.c.A(this);
        Nk.a.a(i0.g());
        Wk wk0 = (Wk)((d1)i0.h()).J().a();
        if(wk0 != null) {
            wk0.u(this);
        }
    }
}

