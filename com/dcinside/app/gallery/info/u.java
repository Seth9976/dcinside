package com.dcinside.app.gallery.info;

import A3.p;
import Y.m2;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.base.g;
import com.dcinside.app.internal.r;
import com.dcinside.app.model.Y;
import com.dcinside.app.util.Ok;
import java.util.List;
import kotlin.J;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

public final class u extends Fragment {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    static final class b extends Adapter {
        @l
        private List a;

        public b() {
            this.a = kotlin.collections.u.H();
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public int getItemCount() {
            return this.a.size();
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
            this.w(((c)recyclerView$ViewHolder0), v);
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
            return this.x(viewGroup0, v);
        }

        @l
        public final List v() {
            return this.a;
        }

        public void w(@l c u$c0, int v) {
            L.p(u$c0, "holder");
            u$c0.e(((Y)this.a.get(v)));
        }

        @l
        public c x(@l ViewGroup viewGroup0, int v) {
            L.p(viewGroup0, "parent");
            View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0219, viewGroup0, false);  // layout:view_minor_hot_item
            L.m(view0);
            return new c(view0);
        }

        public final void y(@l List list0) {
            L.p(list0, "value");
            this.a = list0;
            this.notifyDataSetChanged();
        }
    }

    static final class c extends ViewHolder {
        @l
        private final TextView a;
        @l
        private final TextView b;
        @l
        private final TextView c;
        @l
        private final View d;

        public c(@l View view0) {
            @f(c = "com.dcinside.app.gallery.info.MinorMoreHotFragment$HotHolder$1", f = "MinorMoreHotFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @s0({"SMAP\nMinorMoreHotFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MinorMoreHotFragment.kt\ncom/dcinside/app/gallery/info/MinorMoreHotFragment$HotHolder$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,182:1\n1#2:183\n25#3:184\n*S KotlinDebug\n*F\n+ 1 MinorMoreHotFragment.kt\ncom/dcinside/app/gallery/info/MinorMoreHotFragment$HotHolder$1\n*L\n107#1:184\n*E\n"})
            static final class com.dcinside.app.gallery.info.u.c.a extends o implements p {
                int k;
                Object l;
                final c m;

                com.dcinside.app.gallery.info.u.c.a(c u$c0, d d0) {
                    this.m = u$c0;
                    super(3, d0);
                }

                @m
                public final Object a(@l O o0, @l View view0, @m d d0) {
                    com.dcinside.app.gallery.info.u.c.a u$c$a0 = new com.dcinside.app.gallery.info.u.c.a(this.m, d0);
                    u$c$a0.l = view0;
                    return u$c$a0.invokeSuspend(S0.a);
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
                    Integer integer0 = kotlin.coroutines.jvm.internal.b.f(this.m.getBindingAdapterPosition());
                    Adapter recyclerView$Adapter0 = null;
                    if(integer0.intValue() < 0) {
                        integer0 = null;
                    }
                    if(integer0 != null) {
                        int v = (int)integer0;
                        ViewParent viewParent0 = view0.getParent();
                        RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
                        if(recyclerView0 != null) {
                            Adapter recyclerView$Adapter1 = recyclerView0.getAdapter();
                            if(recyclerView$Adapter1 instanceof b) {
                                recyclerView$Adapter0 = recyclerView$Adapter1;
                            }
                            if(((b)recyclerView$Adapter0) != null) {
                                Context context0 = view0.getContext();
                                L.n(context0, "null cannot be cast to non-null type com.dcinside.app.base.RealmBaseActivity");
                                String s = ((Y)((b)recyclerView$Adapter0).v().get(v)).h();
                                if(s == null) {
                                    return S0.a;
                                }
                                new com.dcinside.app.util.Xk.a(s, 0, 0, null, true, false, false, false, false, false, null, false, null, null, 0x3FEE, null).a(((g)context0));
                                return S0.a;
                            }
                        }
                        return S0.a;
                    }
                    return S0.a;
                }
            }

            L.p(view0, "itemView");
            super(view0);
            View view1 = view0.findViewById(0x7F0B0853);  // id:minor_hot_item_index
            L.o(view1, "findViewById(...)");
            this.a = (TextView)view1;
            View view2 = view0.findViewById(0x7F0B0854);  // id:minor_hot_item_name
            L.o(view2, "findViewById(...)");
            this.b = (TextView)view2;
            View view3 = view0.findViewById(0x7F0B0855);  // id:minor_hot_item_rank
            L.o(view3, "findViewById(...)");
            this.c = (TextView)view3;
            View view4 = view0.findViewById(0x7F0B0852);  // id:minor_hot_item_block
            L.o(view4, "findViewById(...)");
            this.d = view4;
            Context context0 = view0.getContext();
            L.o(context0, "getContext(...)");
            ((TextView)view1).setTextColor(Ok.c.c(context0));
            r.M(view0, null, new com.dcinside.app.gallery.info.u.c.a(this, null), 1, null);
        }

        public final void e(@l Y y0) {
            Drawable drawable0;
            L.p(y0, "ranking");
            try {
                Context context0 = this.itemView.getContext();
                String s = context0.getString(0x7F150844, new Object[]{y0.m()});  // string:ranking_dot_text "%d."
                this.a.setText(s);
                boolean z = y0.m() <= 20;
                this.a.setSelected(z);
                String s1 = y0.l();
                this.b.setText(s1);
                int v = y0.r();
                if(v == 0) {
                    this.c.setText("");
                    drawable0 = ContextCompat.getDrawable(context0, 0x7F0804E1);  // drawable:ranking_edited
                }
                else {
                    this.c.setText(String.valueOf(v));
                    drawable0 = ContextCompat.getDrawable(context0, y0.a().b());
                }
                if(drawable0 != null) {
                    drawable0.setBounds(0, 0, 0, 0);
                }
                this.c.setCompoundDrawables(null, null, drawable0, null);
                if(L.g("N", y0.getState())) {
                    this.b.setEnabled(false);
                    this.d.setVisibility(0);
                    return;
                }
                this.b.setEnabled(true);
                this.d.setVisibility(8);
                return;
            }
            catch(Exception exception0) {
            }
            timber.log.b.a.y(exception0);
        }
    }

    public final class com.dcinside.app.gallery.info.u.d {
        public static final int[] a;

        static {
            int[] arr_v = new int[com.dcinside.app.type.m.values().length];
            try {
                arr_v[com.dcinside.app.type.m.g.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.dcinside.app.type.m.h.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.dcinside.app.type.m.i.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.dcinside.app.type.m.j.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            com.dcinside.app.gallery.info.u.d.a = arr_v;
        }
    }

    @m
    private m2 a;
    @m
    private rx.o b;
    @l
    public static final a c = null;
    @l
    public static final String d = "KEY_GALLERY_GRADE_TYPE";

    static {
        u.c = new a(null);
    }

    private final m2 n0() {
        m2 m20 = this.a;
        L.m(m20);
        return m20;
    }

    private final void o0(boolean z) {
        @s0({"SMAP\nMinorMoreHotFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MinorMoreHotFragment.kt\ncom/dcinside/app/gallery/info/MinorMoreHotFragment$loadHot$1\n+ 2 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,182:1\n25#2:183\n*S KotlinDebug\n*F\n+ 1 MinorMoreHotFragment.kt\ncom/dcinside/app/gallery/info/MinorMoreHotFragment$loadHot$1\n*L\n71#1:183\n*E\n"})
        static final class e extends N implements Function1 {
            final u e;

            e(u u0) {
                this.e = u0;
                super(1);
            }

            public final void a(List list0) {
                m2 m20 = this.e.n0();
                L.o(m20.c, "minorHotList");
                Adapter recyclerView$Adapter0 = m20.c.getAdapter();
                if(!(recyclerView$Adapter0 instanceof b)) {
                    recyclerView$Adapter0 = null;
                }
                if(((b)recyclerView$Adapter0) != null) {
                    L.m(list0);
                    ((b)recyclerView$Adapter0).y(list0);
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((List)object0));
                return S0.a;
            }
        }


        static final class com.dcinside.app.gallery.info.u.f extends N implements Function1 {
            final Throwable e;

            com.dcinside.app.gallery.info.u.f(Throwable throwable0) {
                this.e = throwable0;
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.n(this.e.getMessage());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class com.dcinside.app.gallery.info.u.g extends N implements Function1 {
            final u e;
            final MinorMoreActivity f;

            com.dcinside.app.gallery.info.u.g(u u0, MinorMoreActivity minorMoreActivity0) {
                this.e = u0;
                this.f = minorMoreActivity0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                L.m(boolean0);
                if(boolean0.booleanValue()) {
                    u.p0(this.e, false, 1, null);
                    return;
                }
                this.f.onBackPressed();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        FragmentActivity fragmentActivity0 = this.getActivity();
        MinorMoreActivity minorMoreActivity0 = fragmentActivity0 instanceof MinorMoreActivity ? ((MinorMoreActivity)fragmentActivity0) : null;
        if(minorMoreActivity0 == null) {
            return;
        }
        this.n0().c.setVisibility(0);
        this.n0().b.setVisibility(8);
        rx.o o0 = this.b;
        if(o0 != null) {
            o0.l();
        }
        this.b = minorMoreActivity0.Q1().y5((Object object0) -> {
            L.p(new e(this), "$tmp0");
            new e(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            L.p(minorMoreActivity0, "$activity");
            if(z) {
                this.n0().c.setVisibility(8);
                this.n0().b.setVisibility(0);
                return;
            }
            com.dcinside.app.perform.e.e.a(minorMoreActivity0).n(new com.dcinside.app.gallery.info.u.f(throwable0)).z(0x7F1508D7).x(0x1040000).b().y5((Object object0) -> {
                L.p(new com.dcinside.app.gallery.info.u.g(u0, minorMoreActivity0), "$tmp0");
                new com.dcinside.app.gallery.info.u.g(u0, minorMoreActivity0).invoke(object0);
            }, (Throwable throwable0) -> {
                L.p(minorMoreActivity0, "$activity");
                minorMoreActivity0.onBackPressed();
            });
        });
    }

    @Override  // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.a = m2.d(layoutInflater0, viewGroup0, false);
        View view0 = this.n0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        rx.o o0 = this.b;
        if(o0 != null) {
            o0.l();
        }
        this.b = null;
        this.a = null;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
        int v1;
        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        Bundle bundle1 = this.getArguments();
        int v = bundle1 == null ? 0 : bundle1.getInt("KEY_GALLERY_GRADE_TYPE");
        switch(com.dcinside.app.type.m.d.a(v)) {
            case 1: {
                v1 = 0x7F1503A5;  // string:gallery_info_major_hot "흥한 갤러리"
                break;
            }
            case 2: {
                v1 = 0x7F1503AE;  // string:gallery_info_minor_hot "흥한 마이너 갤러리"
                break;
            }
            case 3: {
                v1 = 0x7F1503AC;  // string:gallery_info_mini_hot "흥한 미니 갤러리"
                break;
            }
            case 4: {
                v1 = 0x7F1503B2;  // string:gallery_info_person_hot "흥한 인물 갤러리"
                break;
            }
            default: {
                throw new J();
            }
        }
        FragmentActivity fragmentActivity0 = this.getActivity();
        MinorMoreActivity minorMoreActivity0 = fragmentActivity0 instanceof MinorMoreActivity ? ((MinorMoreActivity)fragmentActivity0) : null;
        if(minorMoreActivity0 != null) {
            minorMoreActivity0.setTitle(v1);
        }
        this.o0(false);
        m2 m20 = this.n0();
        L.o(m20.c, "minorHotList");
        b u$b0 = new b();
        m20.c.setAdapter(u$b0);
        com.dcinside.app.util.ql.b.d(m20.c);
    }

    static void p0(u u0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        u0.o0(z);
    }

    // 检测为 Lambda 实现
    private static final void q0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void r0(boolean z, u u0, MinorMoreActivity minorMoreActivity0, Throwable throwable0) [...]

    // 检测为 Lambda 实现
    private static final void s0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void t0(MinorMoreActivity minorMoreActivity0, Throwable throwable0) [...]
}

