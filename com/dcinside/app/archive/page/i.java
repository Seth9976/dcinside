package com.dcinside.app.archive.page;

import A3.p;
import A3.q;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.base.g;
import com.dcinside.app.internal.r;
import com.dcinside.app.realm.d0;
import com.dcinside.app.util.Dl;
import io.realm.F0;
import io.realm.d1;
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

public final class i extends ViewHolder {
    @l
    private CheckBox a;
    @l
    private TextView b;
    @l
    private TextView c;
    @l
    private TextView d;
    @l
    private TextView e;
    @l
    private View f;
    @l
    private final View g;

    public i(@l View view0) {
        @f(c = "com.dcinside.app.archive.page.PostArchiveHolder$1", f = "PostArchiveHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements p {
            int k;
            Object l;
            final i m;

            a(i i0, d d0) {
                this.m = i0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                a i$a0 = new a(this.m, d0);
                i$a0.l = view0;
                return i$a0.invokeSuspend(S0.a);
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
                this.m.u(((View)this.l));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.archive.page.PostArchiveHolder$2", f = "PostArchiveHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements p {
            int k;
            Object l;
            final i m;

            b(i i0, d d0) {
                this.m = i0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                b i$b0 = new b(this.m, d0);
                i$b0.l = view0;
                return i$b0.invokeSuspend(S0.a);
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
                this.m.x(((View)this.l));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.archive.page.PostArchiveHolder$3", f = "PostArchiveHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends o implements q {
            int k;
            boolean l;
            final i m;

            c(i i0, d d0) {
                this.m = i0;
                super(4, d0);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                return this.a(((O)object0), ((CompoundButton)object1), ((Boolean)object2).booleanValue(), ((d)object3));
            }

            @m
            public final Object a(@l O o0, @l CompoundButton compoundButton0, boolean z, @m d d0) {
                c i$c0 = new c(this.m, d0);
                i$c0.l = z;
                return i$c0.invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.m.t(this.l);
                return S0.a;
            }
        }

        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B0A0F);  // id:post_archive_item_check
        L.o(view1, "findViewById(...)");
        this.a = (CheckBox)view1;
        View view2 = view0.findViewById(0x7F0B0A16);  // id:post_archive_item_subject
        L.o(view2, "findViewById(...)");
        this.b = (TextView)view2;
        View view3 = view0.findViewById(0x7F0B0A12);  // id:post_archive_item_gallery
        L.o(view3, "findViewById(...)");
        this.c = (TextView)view3;
        View view4 = view0.findViewById(0x7F0B0A13);  // id:post_archive_item_name
        L.o(view4, "findViewById(...)");
        this.d = (TextView)view4;
        View view5 = view0.findViewById(0x7F0B0A10);  // id:post_archive_item_date
        L.o(view5, "findViewById(...)");
        this.e = (TextView)view5;
        View view6 = view0.findViewById(0x7F0B0A15);  // id:post_archive_item_sub_div1
        L.o(view6, "findViewById(...)");
        this.f = view6;
        View view7 = view0.findViewById(0x7F0B0A11);  // id:post_archive_item_delete
        L.o(view7, "findViewById(...)");
        this.g = view7;
        r.M(view7, null, new a(this, null), 1, null);
        r.M(view0, null, new b(this, null), 1, null);
        r.J(this.a, null, new c(this, null), 1, null);
    }

    public final void A(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.e = textView0;
    }

    public final void B(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.c = textView0;
    }

    public final void C(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.d = textView0;
    }

    public final void D(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.b = textView0;
    }

    @l
    public final View l() {
        return this.f;
    }

    private final d0 m() {
        try {
            int v = this.getAdapterPosition();
            if(v < 0) {
                return null;
            }
            ViewParent viewParent0 = this.itemView.getParent();
            L.n(viewParent0, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            Adapter recyclerView$Adapter0 = ((RecyclerView)viewParent0).getAdapter();
            L.n(recyclerView$Adapter0, "null cannot be cast to non-null type com.dcinside.app.archive.page.ArchiveAdapter<*, *>");
            d1 d10 = ((com.dcinside.app.archive.page.a)recyclerView$Adapter0).w(v);
            L.n(d10, "null cannot be cast to non-null type com.dcinside.app.realm.PostArchive");
            return (d0)d10;
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    @l
    public final CheckBox n() {
        return this.a;
    }

    @l
    public final TextView o() {
        return this.e;
    }

    @l
    public final View p() {
        return this.g;
    }

    @l
    public final TextView q() {
        return this.c;
    }

    @l
    public final TextView r() {
        return this.d;
    }

    @l
    public final TextView s() {
        return this.b;
    }

    private final void t(boolean z) {
        ViewParent viewParent0 = this.itemView.getParent();
        com.dcinside.app.archive.page.a a0 = null;
        RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
        if(recyclerView0 == null) {
            return;
        }
        Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
        if(recyclerView$Adapter0 instanceof com.dcinside.app.archive.page.a) {
            a0 = (com.dcinside.app.archive.page.a)recyclerView$Adapter0;
        }
        if(a0 == null) {
            return;
        }
        a0.v(z, this.getBindingAdapterPosition());
    }

    private final void u(View view0) {
        static final class com.dcinside.app.archive.page.i.d extends N implements Function1 {
            public static final com.dcinside.app.archive.page.i.d e;

            static {
                com.dcinside.app.archive.page.i.d.e = new com.dcinside.app.archive.page.i.d();
            }

            com.dcinside.app.archive.page.i.d() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.m(0x7F1500A4);  // string:alert_delete_post_archive "보관함에서 삭제하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class e extends N implements Function1 {
            public static final e e;

            static {
                e.e = new e();
            }

            e() {
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


        static final class com.dcinside.app.archive.page.i.f extends N implements Function1 {
            final i e;
            final g f;
            final View g;

            com.dcinside.app.archive.page.i.f(i i0, g g0, View view0) {
                this.e = i0;
                this.f = g0;
                this.g = view0;
                super(1);
            }

            public final void b(Boolean boolean0) {
                d0 d00 = this.e.m();
                if(d00 == null || !d00.s()) {
                    Dl.D(this.g.getContext(), 0x7F150869);  // string:realm_in_delete "데이터 처리중입니다.\n잠시 후 다시 시도해주세요."
                }
                else {
                    F0 f00 = this.f.F1();
                    if(f00 != null) {
                        f00.Y3((F0 f00) -> d00.z5());
                    }
                }
            }

            // 检测为 Lambda 实现
            private static final void c(d0 d00, F0 f00) [...]

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.b(((Boolean)object0));
                return S0.a;
            }
        }

        Context context0 = view0.getContext();
        L.n(context0, "null cannot be cast to non-null type com.dcinside.app.base.RealmBaseActivity");
        com.dcinside.app.perform.e.e.a(((g)context0)).n(com.dcinside.app.archive.page.i.d.e).z(0x104000A).x(0x1040000).b().Z1((Object object0) -> {
            L.p(e.e, "$tmp0");
            return (Boolean)e.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new com.dcinside.app.archive.page.i.f(this, ((g)context0), view0), "$tmp0");
            new com.dcinside.app.archive.page.i.f(this, ((g)context0), view0).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean v(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void w(Function1 function10, Object object0) [...]

    private final void x(View view0) {
        d0 d00 = this.m();
        if(d00 != null && d00.s()) {
            ViewParent viewParent0 = this.itemView.getParent();
            L.n(viewParent0, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            Adapter recyclerView$Adapter0 = ((RecyclerView)viewParent0).getAdapter();
            L.n(recyclerView$Adapter0, "null cannot be cast to non-null type com.dcinside.app.archive.page.ArchiveAdapter<*, *>");
            if(((com.dcinside.app.archive.page.a)recyclerView$Adapter0).z() > 0) {
                this.a.setChecked(!this.a.isChecked());
                return;
            }
            String s = d00.U5();
            if(s == null) {
                return;
            }
            com.dcinside.app.util.Xk.a xk$a0 = new com.dcinside.app.util.Xk.a(s, d00.X5(), 0, null, false, false, true, false, false, false, null, false, null, null, 0x3FBC, null);
            Context context0 = Dl.b(view0);
            L.n(context0, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            xk$a0.a(((AppCompatActivity)context0));
            return;
        }
        Dl.D(view0.getContext(), 0x7F150869);  // string:realm_in_delete "데이터 처리중입니다.\n잠시 후 다시 시도해주세요."
    }

    public final void y(@l View view0) {
        L.p(view0, "<set-?>");
        this.f = view0;
    }

    public final void z(@l CheckBox checkBox0) {
        L.p(checkBox0, "<set-?>");
        this.a = checkBox0;
    }
}

