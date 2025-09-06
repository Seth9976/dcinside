package com.dcinside.app.read.holder;

import A3.p;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.perform.e;
import com.dcinside.app.rx.bus.d0;
import com.dcinside.app.util.Nk;
import com.dcinside.app.view.ClearableEditText;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

public final class r extends b {
    @l
    private final ClearableEditText b;

    public r(@l View view0) {
        @f(c = "com.dcinside.app.read.holder.SecretCodeHolder$1", f = "SecretCodeHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements p {
            int k;
            Object l;
            final r m;

            a(r r0, d d0) {
                this.m = r0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                a r$a0 = new a(this.m, d0);
                r$a0.l = view0;
                return r$a0.invokeSuspend(S0.a);
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
                this.m.q(((View)this.l));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.read.holder.SecretCodeHolder$3", f = "SecretCodeHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.read.holder.r.b extends o implements p {
            int k;
            final r l;

            com.dcinside.app.read.holder.r.b(r r0, d d0) {
                this.l = r0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.read.holder.r.b(this.l, d0).invokeSuspend(S0.a);
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
                this.l.m();
                return S0.a;
            }
        }

        L.p(view0, "itemView");
        super(view0, null, 2, null);
        View view1 = view0.findViewById(0x7F0B0DF5);  // id:secret_post_input
        L.o(view1, "findViewById(...)");
        this.b = (ClearableEditText)view1;
        ((ClearableEditText)view1).h();
        com.dcinside.app.internal.r.M(((ClearableEditText)view1), null, new a(this, null), 1, null);
        ((ClearableEditText)view1).setOnEditorActionListener((TextView textView0, int v, KeyEvent keyEvent0) -> {
            L.p(this, "this$0");
            if(v == 6) {
                this.m();
            }
            return true;
        });
        View view2 = view0.findViewById(0x7F0B0DF3);  // id:secret_post_apply
        L.o(view2, "findViewById(...)");
        com.dcinside.app.internal.r.M(view2, null, new com.dcinside.app.read.holder.r.b(this, null), 1, null);
    }

    // 检测为 Lambda 实现
    private static final boolean j(r r0, TextView textView0, int v, KeyEvent keyEvent0) [...]

    private final void m() {
        static final class c extends N implements Function1 {
            public static final c e;

            static {
                c.e = new c();
            }

            c() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.m(0x7F15078E);  // string:please_input_password "비밀번호를 입력하세요."
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class com.dcinside.app.read.holder.r.d extends N implements Function1 {
            public static final com.dcinside.app.read.holder.r.d e;

            static {
                com.dcinside.app.read.holder.r.d.e = new com.dcinside.app.read.holder.r.d();
            }

            com.dcinside.app.read.holder.r.d() {
                super(1);
            }

            public final void a(Boolean boolean0) {
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return S0.a;
            }
        }

        String s = String.valueOf(this.b.getText());
        Context context0 = this.itemView.getContext();
        if(s.length() == 0) {
            AppCompatActivity appCompatActivity0 = context0 instanceof AppCompatActivity ? ((AppCompatActivity)context0) : null;
            if(appCompatActivity0 == null) {
                return;
            }
            e.e.a(appCompatActivity0).n(c.e).z(0x104000A).b().x5((Object object0) -> {
                L.p(com.dcinside.app.read.holder.r.d.e, "$tmp0");
                com.dcinside.app.read.holder.r.d.e.invoke(object0);
            });
            return;
        }
        if(context0 != null) {
            com.dcinside.app.rx.bus.c.a(context0, new d0(s));
        }
    }

    // 检测为 Lambda 实现
    private static final void n(Function1 function10, Object object0) [...]

    public final void o() {
        this.b.setText(null);
    }

    public final void p() {
        this.q(this.b);
    }

    private final void q(View view0) {
        ViewParent viewParent0 = this.itemView.getParent();
        if(viewParent0 == null) {
            return;
        }
        if(viewParent0 instanceof RecyclerView) {
            ViewParent viewParent1 = ((RecyclerView)viewParent0).getParent();
            if(viewParent1 instanceof ViewGroup) {
                ((ViewGroup)viewParent1).setDescendantFocusability(0x40000);
                view0.requestFocus();
                ((ViewGroup)viewParent1).setDescendantFocusability(0x60000);
                Nk.a.f(view0);
            }
        }
    }
}

