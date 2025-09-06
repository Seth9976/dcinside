package com.dcinside.app.write;

import A3.p;
import Z.d;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView;
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
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nPostWritePollHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostWritePollHolder.kt\ncom/dcinside/app/write/PostWritePollHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IdViewHolder.kt\ncom/dcinside/app/base/IdViewHolder\n+ 4 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,97:1\n1#2:98\n20#3:99\n25#4:100\n*S KotlinDebug\n*F\n+ 1 PostWritePollHolder.kt\ncom/dcinside/app/write/PostWritePollHolder\n*L\n92#1:99\n92#1:100\n*E\n"})
public final class p2 extends e implements d {
    @l
    private View a;
    @l
    private View b;
    @l
    private TextView c;

    public p2(@l ViewGroup viewGroup0) {
        @f(c = "com.dcinside.app.write.PostWritePollHolder$1", f = "PostWritePollHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements p {
            int k;
            final p2 l;

            a(p2 p20, kotlin.coroutines.d d0) {
                this.l = p20;
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
                this.l.t();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.PostWritePollHolder$2", f = "PostWritePollHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements p {
            int k;
            final p2 l;

            b(p2 p20, kotlin.coroutines.d d0) {
                this.l = p20;
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
                this.l.u();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.PostWritePollHolder$3", f = "PostWritePollHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends o implements p {
            int k;
            final p2 l;

            c(p2 p20, kotlin.coroutines.d d0) {
                this.l = p20;
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
                this.l.q();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.write.PostWritePollHolder$4", f = "PostWritePollHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.p2.d extends o implements p {
            int k;
            final p2 l;

            com.dcinside.app.write.p2.d(p2 p20, kotlin.coroutines.d d0) {
                this.l = p20;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.p2.d(this.l, d0).invokeSuspend(S0.a);
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
                this.l.v();
                return S0.a;
            }
        }

        L.p(viewGroup0, "parent");
        super(viewGroup0, 0x7F0E02BC);  // layout:view_write_item_poll
        View view0 = this.itemView.findViewById(0x7F0B0BB1);  // id:post_write_item_poll_delete
        L.o(view0, "findViewById(...)");
        this.a = view0;
        View view1 = this.itemView.findViewById(0x7F0B0BB3);  // id:post_write_item_poll_modify
        L.o(view1, "findViewById(...)");
        this.b = view1;
        View view2 = this.itemView.findViewById(0x7F0B0BB4);  // id:post_write_item_poll_title
        L.o(view2, "findViewById(...)");
        this.c = (TextView)view2;
        L.o(this.itemView, "itemView");
        a p2$a0 = new a(this, null);
        r.M(this.itemView, null, p2$a0, 1, null);
        L.o(this.itemView, "itemView");
        b p2$b0 = new b(this, null);
        r.S(this.itemView, null, false, p2$b0, 3, null);
        r.M(this.a, null, new c(this, null), 1, null);
        r.M(this.b, null, new com.dcinside.app.write.p2.d(this, null), 1, null);
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
    public final View n() {
        return this.a;
    }

    @l
    public final View o() {
        return this.b;
    }

    @l
    public final TextView p() {
        return this.c;
    }

    private final void q() {
        static final class com.dcinside.app.write.p2.e extends N implements Function1 {
            public static final com.dcinside.app.write.p2.e e;

            static {
                com.dcinside.app.write.p2.e.e = new com.dcinside.app.write.p2.e();
            }

            com.dcinside.app.write.p2.e() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.m(0x7F150796);  // string:poll_delete "투표를 삭제하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class com.dcinside.app.write.p2.f extends N implements Function1 {
            public static final com.dcinside.app.write.p2.f e;

            static {
                com.dcinside.app.write.p2.f.e = new com.dcinside.app.write.p2.f();
            }

            com.dcinside.app.write.p2.f() {
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
            final p2 e;

            g(p2 p20) {
                this.e = p20;
                super(1);
            }

            public final void a(Boolean boolean0) {
                i i0 = com.dcinside.app.internal.c.p(this.e);
                if(i0 == null) {
                    return;
                }
                ((d1)i0.h()).q(i0.i());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        com.dcinside.app.internal.c.A(this);
        Context context0 = Dl.b(this.itemView);
        L.n(context0, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        com.dcinside.app.perform.e.e.a(((AppCompatActivity)context0)).n(com.dcinside.app.write.p2.e.e).z(0x104000A).x(0x1040000).b().Z1((Object object0) -> {
            L.p(com.dcinside.app.write.p2.f.e, "$tmp0");
            return (Boolean)com.dcinside.app.write.p2.f.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new g(this), "$tmp0");
            new g(this).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean r(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void s(Function1 function10, Object object0) [...]

    private final void t() {
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

    private final void u() {
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

    private final void v() {
        com.dcinside.app.internal.c.A(this);
        i i0 = com.dcinside.app.internal.c.q(this);
        if(i0 == null) {
            return;
        }
        Integer integer0 = this.getAdapterPosition();
        Adapter recyclerView$Adapter0 = null;
        if(integer0.intValue() < 0) {
            integer0 = null;
        }
        if(integer0 != null) {
            int v = (int)integer0;
            RecyclerView recyclerView0 = this.e();
            if(recyclerView0 != null) {
                Adapter recyclerView$Adapter1 = recyclerView0.getAdapter();
                if(recyclerView$Adapter1 instanceof d1) {
                    recyclerView$Adapter0 = recyclerView$Adapter1;
                }
                recyclerView$Adapter0 = (d1)recyclerView$Adapter0;
            }
            if(recyclerView$Adapter0 == null) {
                return;
            }
            Object object0 = ((d1)recyclerView$Adapter0).S().get(v);
            L.o(object0, "get(...)");
            ((PostWriteActivity)i0.g()).s7(((k0)object0).b6());
        }
    }

    public final void w(@l View view0) {
        L.p(view0, "<set-?>");
        this.a = view0;
    }

    public final void x(@l View view0) {
        L.p(view0, "<set-?>");
        this.b = view0;
    }

    public final void y(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.c = textView0;
    }
}

