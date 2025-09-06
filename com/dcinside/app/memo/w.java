package com.dcinside.app.memo;

import A3.p;
import Y.C2;
import android.content.Context;
import android.os.Bundle;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.dcinside.app.backup.BackupActivity;
import com.dcinside.app.base.h;
import com.dcinside.app.internal.c;
import com.dcinside.app.perform.e;
import com.dcinside.app.rx.bus.z;
import com.dcinside.app.util.Clipboards;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.vk;
import com.dcinside.app.view.ClearableEditText;
import com.dcinside.app.view.tool.NonPredictiveLayoutManager;
import io.realm.F0;
import io.realm.P0;
import io.realm.T0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.u;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import kotlin.text.r;
import kotlin.text.v;
import kotlinx.coroutines.O;
import rx.subscriptions.b;
import y4.l;
import y4.m;

@s0({"SMAP\nUserMemoListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserMemoListFragment.kt\ncom/dcinside/app/memo/UserMemoListFragment\n+ 2 ContextBus.kt\ncom/dcinside/app/rx/bus/ContextBusKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 8 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 9 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,229:1\n60#2:230\n1#3:231\n1#3:260\n1#3:280\n25#4:232\n25#4:269\n25#4:292\n25#4:299\n25#4:300\n257#5,2:233\n257#5,2:235\n257#5,2:237\n257#5,2:293\n257#5,2:295\n257#5,2:297\n739#6,9:239\n1557#6:263\n1628#6,3:264\n1611#6,9:270\n1863#6:279\n1864#6:281\n1620#6:282\n37#7,2:248\n37#7,2:267\n11420#8,9:250\n13346#8:259\n13347#8:261\n11429#8:262\n177#9,9:283\n*S KotlinDebug\n*F\n+ 1 UserMemoListFragment.kt\ncom/dcinside/app/memo/UserMemoListFragment\n*L\n82#1:230\n133#1:260\n172#1:280\n105#1:232\n169#1:269\n186#1:292\n195#1:299\n219#1:300\n111#1:233,2\n113#1:235,2\n114#1:237,2\n188#1:293,2\n189#1:295,2\n190#1:297,2\n130#1:239,9\n143#1:263\n143#1:264,3\n172#1:270,9\n172#1:279\n172#1:281\n172#1:282\n130#1:248,2\n164#1:267,2\n133#1:250,9\n133#1:259\n133#1:261\n133#1:262\n181#1:283,9\n*E\n"})
public final class w extends h {
    @m
    private C2 b;
    @m
    private String c;
    @m
    private T0 d;
    @m
    private b e;
    @l
    private P0 f;

    public w() {
        super(0, 1, null);
        this.f = (T0 t00) -> {
            L.p(this, "this$0");
            L.m(t00);
            this.I0(t00);
        };
    }

    // 检测为 Lambda 实现
    private static final void A0(w w0, T0 t00) [...]

    private final void B0() {
        static final class a extends N implements Function1 {
            public static final a e;

            static {
                a.e = new a();
            }

            a() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.m(0x7F150644);  // string:memo_already_exist "같은 식별 코드 또는 IP를 가진 이용자 메모가 이미 있습니다. 변경하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        @s0({"SMAP\nUserMemoListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserMemoListFragment.kt\ncom/dcinside/app/memo/UserMemoListFragment$onAdd$2\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,229:1\n37#2,2:230\n*S KotlinDebug\n*F\n+ 1 UserMemoListFragment.kt\ncom/dcinside/app/memo/UserMemoListFragment$onAdd$2\n*L\n158#1:230,2\n*E\n"})
        static final class com.dcinside.app.memo.w.b extends N implements Function1 {
            final ClearableEditText e;
            final F0 f;
            final String g;
            final String h;
            final List i;

            com.dcinside.app.memo.w.b(ClearableEditText clearableEditText0, F0 f00, String s, String s1, List list0) {
                this.e = clearableEditText0;
                this.f = f00;
                this.g = s;
                this.h = s1;
                this.i = list0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                L.m(boolean0);
                if(boolean0.booleanValue()) {
                    this.e.f();
                    V[] arr_v = (V[])this.i.toArray(new V[0]);
                    V[] arr_v1 = (V[])Arrays.copyOf(arr_v, arr_v.length);
                    F.i(this.f, this.g, this.h, false, arr_v1);
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        Object object0;
        List list1;
        F0 f00 = this.i0();
        if(f00.isClosed()) {
            return;
        }
        String s = this.c;
        if(s == null) {
            return;
        }
        ClearableEditText clearableEditText0 = this.z0().i;
        L.o(clearableEditText0, "userMemoAddText");
        String s1 = String.valueOf(clearableEditText0.getText());
        List list0 = new r("\n").p(s1, 0);
        if(!list0.isEmpty()) {
            ListIterator listIterator0 = list0.listIterator(list0.size());
            while(listIterator0.hasPrevious()) {
                if(((String)listIterator0.previous()).length() == 0) {
                    continue;
                }
                list1 = u.J5(list0, listIterator0.nextIndex() + 1);
                goto label_17;
            }
        }
        list1 = u.H();
    label_17:
        String[] arr_s = (String[])list1.toArray(new String[0]);
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; true; ++v) {
            object0 = null;
            if(v >= arr_s.length) {
                break;
            }
            String s2 = v.G5(arr_s[v]).toString();
            String s3 = s2.length() <= 0 ? null : s2;
            if(s3 != null) {
                List list2 = v.U4(s3, new char[]{'-'}, false, 0, 6, null);
                if(list2.size() != 2) {
                    list2 = null;
                }
                if(list2 != null) {
                    object0 = r0.a(((String)list2.get(0)), v.Z8(((String)list2.get(1)), 15));
                }
            }
            if(object0 != null) {
                arrayList0.add(object0);
            }
        }
        Integer integer0 = this.z0().r.getCurrentColor();
        String s4 = integer0 == null ? null : c.i(((int)integer0));
        if(arrayList0.isEmpty()) {
            return;
        }
        ArrayList arrayList1 = new ArrayList(u.b0(arrayList0, 10));
        for(Object object1: arrayList0) {
            arrayList1.add(((String)((V)object1).e()));
        }
        if(this.y0(arrayList1)) {
            Context context0 = this.getContext();
            if(context0 instanceof AppCompatActivity) {
                object0 = (AppCompatActivity)context0;
            }
            if(object0 == null) {
                return;
            }
            e.e.a(((AppCompatActivity)object0)).n(a.e).z(0x7F1500AA).x(0x7F1501C1).b().x5((Object object0) -> {
                L.p(new com.dcinside.app.memo.w.b(clearableEditText0, f00, s, s4, arrayList0), "$tmp0");
                new com.dcinside.app.memo.w.b(clearableEditText0, f00, s, s4, arrayList0).invoke(object0);
            });
            return;
        }
        clearableEditText0.f();
        V[] arr_v = (V[])arrayList0.toArray(new V[0]);
        F.i(f00, s, s4, false, ((V[])Arrays.copyOf(arr_v, arr_v.length)));
    }

    // 检测为 Lambda 实现
    private static final void C0(Function1 function10, Object object0) [...]

    private final void D0(boolean z) {
        C2 c20 = this.z0();
        L.o(c20.g, "userMemoAddRecycler");
        Adapter recyclerView$Adapter0 = c20.g.getAdapter();
        if(!(recyclerView$Adapter0 instanceof j)) {
            recyclerView$Adapter0 = null;
        }
        if(((j)recyclerView$Adapter0) == null) {
            return;
        }
        ((j)recyclerView$Adapter0).B(z);
    }

    private final void E0() {
        static final class com.dcinside.app.memo.w.c extends N implements Function1 {
            public static final com.dcinside.app.memo.w.c e;

            static {
                com.dcinside.app.memo.w.c.e = new com.dcinside.app.memo.w.c();
            }

            com.dcinside.app.memo.w.c() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.m(0x7F1501E4);  // string:check_delete_memo "선택한 메모를 삭제하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class d extends N implements Function1 {
            final w e;
            final List f;
            final j g;

            d(w w0, List list0, j j0) {
                this.e = w0;
                this.f = list0;
                this.g = j0;
                super(1);
            }

            public final void b(Boolean boolean0) {
                L.m(boolean0);
                if(boolean0.booleanValue()) {
                    T0 t00 = this.e.d;
                    if(t00 != null) {
                        t00.B(this.e.f);
                    }
                    F.a.F(this.e.c, this.f);
                    this.e.i0().Y3((F0 f00) -> {
                        L.p(this.e, "this$0");
                        T0 t00 = this.e.d;
                        if(t00 != null) {
                            t00.removeAll(this.f);
                        }
                    });
                    boolean z = this.g.getItemCount() > 0;
                    this.g.P(z);
                    FragmentActivity fragmentActivity0 = this.e.getActivity();
                    if(fragmentActivity0 != null) {
                        fragmentActivity0.setResult(-1);
                    }
                    this.e.L0();
                    T0 t01 = this.e.d;
                    if(t01 != null) {
                        t01.j(this.e.f);
                    }
                    int v = this.g.getItemCount();
                    this.g.notifyItemRangeChanged(0, v);
                }
            }

            // 检测为 Lambda 实现
            private static final void c(w w0, List list0, F0 f00) [...]

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.b(((Boolean)object0));
                return S0.a;
            }
        }

        C2 c20 = this.z0();
        L.o(c20.g, "userMemoAddRecycler");
        Adapter recyclerView$Adapter0 = c20.g.getAdapter();
        AppCompatActivity appCompatActivity0 = null;
        if(!(recyclerView$Adapter0 instanceof j)) {
            recyclerView$Adapter0 = null;
        }
        if(((j)recyclerView$Adapter0) == null) {
            return;
        }
        List list0 = ((j)recyclerView$Adapter0).C(this.d);
        if(list0 != null && !list0.isEmpty()) {
            FragmentActivity fragmentActivity0 = this.getActivity();
            if(fragmentActivity0 instanceof AppCompatActivity) {
                appCompatActivity0 = (AppCompatActivity)fragmentActivity0;
            }
            if(appCompatActivity0 == null) {
                return;
            }
            e.e.a(appCompatActivity0).n(com.dcinside.app.memo.w.c.e).z(0x7F15034A).x(0x7F1501C1).b().x5((Object object0) -> {
                L.p(new d(this, list0, ((j)recyclerView$Adapter0)), "$tmp0");
                new d(this, list0, ((j)recyclerView$Adapter0)).invoke(object0);
            });
        }
    }

    // 检测为 Lambda 实现
    private static final void F0(Function1 function10, Object object0) [...]

    private final void G0() {
        static final class com.dcinside.app.memo.w.e extends N implements Function1 {
            final w e;

            com.dcinside.app.memo.w.e(w w0) {
                this.e = w0;
                super(1);
            }

            @l
            public final CharSequence a(q q0) {
                L.m(q0);
                return this.e.M0(q0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((q)object0));
            }
        }

        String s;
        if(this.getContext() == null) {
            return;
        }
        T0 t00 = this.d;
        if(t00 == null || !t00.s() || t00.size() == 0) {
            return;
        }
        try {
            s = null;
            s = u.m3(t00, "\n", null, null, 0, null, new com.dcinside.app.memo.w.e(this), 30, null);
        }
        catch(Exception unused_ex) {
        }
        if(s == null) {
            return;
        }
        String s1 = this.getString(0x7F15021D);  // string:copy_list "목록 복사"
        L.o(s1, "getString(...)");
        Clipboards.a.b(0x7F15021A, s1, s);  // string:copy_block_list_to_memo "목록이 복사되었습니다."
    }

    private final void H0(boolean z) {
        C2 c20 = this.z0();
        L.o(c20.g, "userMemoAddRecycler");
        Adapter recyclerView$Adapter0 = c20.g.getAdapter();
        if(!(recyclerView$Adapter0 instanceof j)) {
            recyclerView$Adapter0 = null;
        }
        if(((j)recyclerView$Adapter0) == null) {
            return;
        }
        ((j)recyclerView$Adapter0).P(z);
        LinearLayout linearLayout0 = this.z0().n;
        L.o(linearLayout0, "userMemoDeleteWrap");
        int v = 8;
        linearLayout0.setVisibility((z ? 0 : 8));
        LinearLayout linearLayout1 = this.z0().p;
        L.o(linearLayout1, "userMemoNormalWrap");
        linearLayout1.setVisibility((z ? 8 : 0));
        ConstraintLayout constraintLayout0 = this.z0().j;
        L.o(constraintLayout0, "userMemoAddWrap");
        if(((j)recyclerView$Adapter0).getItemCount() > 0 && !z) {
            v = 0;
        }
        constraintLayout0.setVisibility(v);
        ((j)recyclerView$Adapter0).notifyItemRangeChanged(0, ((j)recyclerView$Adapter0).getItemCount());
    }

    private final void I0(T0 t00) {
        FragmentActivity fragmentActivity0 = this.getActivity();
        if(fragmentActivity0 != null) {
            fragmentActivity0.setResult(-1);
        }
        this.L0();
    }

    // 检测为 Lambda 实现
    private static final void J0(w w0, CompoundButton compoundButton0, boolean z) [...]

    // 检测为 Lambda 实现
    private static final void K0(Function1 function10, Object object0) [...]

    private final void L0() {
        int v = 0;
        C2 c20 = this.z0();
        L.o(c20.g, "userMemoAddRecycler");
        Adapter recyclerView$Adapter0 = c20.g.getAdapter();
        if(!(recyclerView$Adapter0 instanceof j)) {
            recyclerView$Adapter0 = null;
        }
        if(((j)recyclerView$Adapter0) == null) {
            return;
        }
        ((j)recyclerView$Adapter0).Q(this.c);
        ((j)recyclerView$Adapter0).R(this.d);
        String s = this.getString(0x7F150657, new Object[]{((j)recyclerView$Adapter0).getItemCount()});  // string:memo_list_total_count "전체 %1$d"
        L.o(s, "getString(...)");
        this.z0().e.setText(s);
        this.z0().l.setText(s);
        LinearLayout linearLayout0 = this.z0().p;
        L.o(linearLayout0, "userMemoNormalWrap");
        linearLayout0.setVisibility((((j)recyclerView$Adapter0).H() ? 8 : 0));
        if(((j)recyclerView$Adapter0).getItemCount() > 0) {
            ConstraintLayout constraintLayout0 = this.z0().j;
            L.o(constraintLayout0, "userMemoAddWrap");
            constraintLayout0.setVisibility((((j)recyclerView$Adapter0).H() ? 8 : 0));
            LinearLayout linearLayout1 = this.z0().n;
            L.o(linearLayout1, "userMemoDeleteWrap");
            if(!((j)recyclerView$Adapter0).H()) {
                v = 8;
            }
            linearLayout1.setVisibility(v);
            return;
        }
        this.z0().j.setVisibility(8);
        this.z0().n.setVisibility(8);
    }

    private final String M0(q q0) {
        Context context0 = this.getContext();
        return context0 == null ? "" : F.x(context0, q0.S5(), q0.R5());
    }

    @Override  // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.b = C2.d(layoutInflater0, viewGroup0, false);
        View view0 = this.z0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // com.dcinside.app.base.h
    public void onDestroyView() {
        b b0 = this.e;
        if(b0 != null) {
            b0.l();
        }
        this.e = null;
        T0 t00 = this.d;
        if(t00 != null) {
            if(!t00.s()) {
                t00 = null;
            }
            if(t00 != null) {
                t00.z();
            }
        }
        this.d = null;
        super.onDestroyView();
        this.b = null;
    }

    @Override  // com.dcinside.app.base.h
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
        static final class f extends N implements Function1 {
            final w e;

            f(w w0) {
                this.e = w0;
                super(1);
            }

            public final void a(z z0) {
                if(this.e.z0().l.isChecked() == z0.a()) {
                    return;
                }
                this.e.z0().l.setChecked(z0.a());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((z)object0));
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.memo.UserMemoListFragment$onViewCreated$2", f = "UserMemoListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class g extends o implements p {
            int k;
            final Context l;

            g(Context context0, kotlin.coroutines.d d0) {
                this.l = context0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new g(this.l, d0).invokeSuspend(S0.a);
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
                L.o(this.l, "$context");
                BackupActivity.C.a(this.l);
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.memo.UserMemoListFragment$onViewCreated$3", f = "UserMemoListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.memo.w.h extends o implements p {
            int k;
            final w l;

            com.dcinside.app.memo.w.h(w w0, kotlin.coroutines.d d0) {
                this.l = w0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.memo.w.h(this.l, d0).invokeSuspend(S0.a);
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
                this.l.B0();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.memo.UserMemoListFragment$onViewCreated$4", f = "UserMemoListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class i extends o implements p {
            int k;
            final w l;

            i(w w0, kotlin.coroutines.d d0) {
                this.l = w0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new i(this.l, d0).invokeSuspend(S0.a);
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
                this.l.z0().r.performClick();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.memo.UserMemoListFragment$onViewCreated$5", f = "UserMemoListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.memo.w.j extends o implements p {
            int k;
            final w l;

            com.dcinside.app.memo.w.j(w w0, kotlin.coroutines.d d0) {
                this.l = w0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.memo.w.j(this.l, d0).invokeSuspend(S0.a);
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
                this.l.G0();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.memo.UserMemoListFragment$onViewCreated$6", f = "UserMemoListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class k extends o implements p {
            int k;
            final w l;

            k(w w0, kotlin.coroutines.d d0) {
                this.l = w0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new k(this.l, d0).invokeSuspend(S0.a);
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
                this.l.H0(true);
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.memo.UserMemoListFragment$onViewCreated$7", f = "UserMemoListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.memo.w.l extends o implements p {
            int k;
            final w l;

            com.dcinside.app.memo.w.l(w w0, kotlin.coroutines.d d0) {
                this.l = w0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.memo.w.l(this.l, d0).invokeSuspend(S0.a);
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
                this.l.H0(false);
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.memo.UserMemoListFragment$onViewCreated$9", f = "UserMemoListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.memo.w.m extends o implements p {
            int k;
            final w l;

            com.dcinside.app.memo.w.m(w w0, kotlin.coroutines.d d0) {
                this.l = w0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.memo.w.m(this.l, d0).invokeSuspend(S0.a);
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
                this.l.E0();
                return S0.a;
            }
        }

        T0 t00;
        String s;
        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        Context context0 = view0.getContext();
        Bundle bundle1 = this.getArguments();
        if(bundle1 == null || bundle1.getInt("com.dcinside.app.memo.UserMemoTargetPagerAdapter.EXTRA_USER_MEMO_LIST_MODE") != 1) {
            Bundle bundle2 = this.getArguments();
            s = bundle2 == null ? null : bundle2.getString("galleryId");
        }
        else {
            s = "";
        }
        this.c = s;
        n n0 = F.y(this.i0(), this.c);
        if(n0 == null) {
            t00 = null;
        }
        else {
            t00 = n0.R5();
            if(t00 == null) {
                t00 = null;
            }
            else {
                t00.j(this.f);
            }
        }
        this.d = t00;
        L.m(context0);
        String s1 = c.i(vk.b(context0, 0x7F0401F8));  // attr:dcBodyLinkColor
        C2 c20 = this.z0();
        Spanned spanned0 = Dl.c(this.getString(0x7F15012E, new Object[]{s1}));  // string:available_restore_item "앱 재설치 시 자동 백업 파일로 복원이 가능합니다. <font color=%s>바로가기></font>"
        c20.u.setText(spanned0);
        C2 c21 = this.z0();
        L.o(c21.o, "userMemoGoBackup");
        g w$g0 = new g(context0, null);
        com.dcinside.app.internal.r.M(c21.o, null, w$g0, 1, null);
        C2 c22 = this.z0();
        L.o(c22.b, "userMemoAddBtn");
        com.dcinside.app.memo.w.h w$h0 = new com.dcinside.app.memo.w.h(this, null);
        com.dcinside.app.internal.r.M(c22.b, null, w$h0, 1, null);
        C2 c23 = this.z0();
        L.o(c23.q, "userMemoSelectColorContainer");
        i w$i0 = new i(this, null);
        com.dcinside.app.internal.r.M(c23.q, null, w$i0, 1, null);
        C2 c24 = this.z0();
        L.o(c24.d, "userMemoAddCopy");
        com.dcinside.app.memo.w.j w$j0 = new com.dcinside.app.memo.w.j(this, null);
        com.dcinside.app.internal.r.M(c24.d, null, w$j0, 1, null);
        C2 c25 = this.z0();
        L.o(c25.h, "userMemoAddStartDelete");
        k w$k0 = new k(this, null);
        com.dcinside.app.internal.r.M(c25.h, null, w$k0, 1, null);
        C2 c26 = this.z0();
        L.o(c26.k, "userMemoCancelDeleteMode");
        com.dcinside.app.memo.w.l w$l0 = new com.dcinside.app.memo.w.l(this, null);
        com.dcinside.app.internal.r.M(c26.k, null, w$l0, 1, null);
        C2 c27 = this.z0();
        NonPredictiveLayoutManager nonPredictiveLayoutManager0 = new NonPredictiveLayoutManager();
        c27.g.setLayoutManager(nonPredictiveLayoutManager0);
        j j0 = new j();
        c27.g.setAdapter(j0);
        C2 c28 = this.z0();
        L.o(c28.m, "userMemoDeleteBtn");
        com.dcinside.app.memo.w.m w$m0 = new com.dcinside.app.memo.w.m(this, null);
        com.dcinside.app.internal.r.M(c28.m, null, w$m0, 1, null);
        C2 c29 = this.z0();
        t t0 = (CompoundButton compoundButton0, boolean z) -> {
            L.p(this, "this$0");
            this.D0(z);
        };
        c29.l.setOnCheckedChangeListener(t0);
        this.z0().r.e();
        this.L0();
        b b0 = this.e;
        if(b0 != null) {
            b0.c();
        }
        rx.o o0 = com.dcinside.app.rx.bus.c.c(context0, z.class).x5((Object object0) -> {
            L.p(new f(this), "$tmp0");
            new f(this).invoke(object0);
        });
        b b1 = this.e;
        if(b1 != null) {
            b1.a(o0);
        }
    }

    private final boolean y0(List list0) {
        C2 c20 = this.z0();
        L.o(c20.g, "userMemoAddRecycler");
        Adapter recyclerView$Adapter0 = c20.g.getAdapter();
        if(!(recyclerView$Adapter0 instanceof j)) {
            recyclerView$Adapter0 = null;
        }
        if(((j)recyclerView$Adapter0) == null) {
            return false;
        }
        T0 t00 = ((j)recyclerView$Adapter0).F();
        if(t00 == null) {
            return false;
        }
        int v = ((j)recyclerView$Adapter0).getItemCount();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: t00) {
            String s = ((q)object0).S5();
            if(s != null) {
                arrayList0.add(s);
            }
        }
        return v != u.p4(arrayList0, u.a6(list0)).size();
    }

    private final C2 z0() {
        C2 c20 = this.b;
        L.m(c20);
        return c20;
    }
}

