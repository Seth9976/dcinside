package com.dcinside.app.album.picker;

import A3.p;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.album.j;
import com.dcinside.app.image.s;
import com.dcinside.app.internal.r;
import com.dcinside.app.rx.bus.x;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Gk;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.jl;
import com.futuremind.recyclerviewfastscroll.b;
import com.google.android.material.snackbar.Snackbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0.g;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

@s0({"SMAP\nPickerGridAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PickerGridAdapter.kt\ncom/dcinside/app/album/picker/PickerGridAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,222:1\n1611#2,9:223\n1863#2:232\n1864#2:234\n1620#2:235\n1#3:233\n*S KotlinDebug\n*F\n+ 1 PickerGridAdapter.kt\ncom/dcinside/app/album/picker/PickerGridAdapter\n*L\n151#1:223,9\n151#1:232\n151#1:234\n151#1:235\n151#1:233\n*E\n"})
public final class f extends Adapter implements b {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    private final ArrayList a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    @m
    private WeakReference f;
    @m
    private j g;
    private int h;
    @l
    private List i;
    @l
    private List j;
    private boolean k;
    @l
    public static final a l = null;
    public static final int m = 0;
    public static final int n = 1;
    public static final int o = 2;

    static {
        f.l = new a(null);
    }

    public f() {
        this.a = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = true;
    }

    public final boolean A() {
        return this.k;
    }

    public final boolean B() {
        return this.b;
    }

    public final boolean C(int v) {
        return this.i.contains(v);
    }

    public final boolean D() {
        return this.c;
    }

    public final boolean E() {
        return this.d;
    }

    public final void F() {
        WeakReference weakReference0 = this.f;
        if(weakReference0 != null) {
            RecyclerView recyclerView0 = (RecyclerView)weakReference0.get();
            if(recyclerView0 != null) {
                Context context0 = Dl.b(recyclerView0);
                PickerActivity pickerActivity0 = context0 instanceof PickerActivity ? ((PickerActivity)context0) : null;
                if(pickerActivity0 != null) {
                    pickerActivity0.o2(this.i.size());
                }
            }
        }
    }

    public final void G(boolean z) {
        this.k = z;
    }

    public final void H(boolean z, boolean z1, boolean z2, @m j j0, boolean z3) {
        int v = this.h;
        if(v > 0) {
            this.notifyItemRangeRemoved(0, v);
        }
        this.d = z2;
        this.b = z;
        this.c = z1;
        this.e = z3;
        this.a.clear();
        this.a.add(null);
        this.a.add(null);
        this.g = j0;
        this.h = this.a.size() + (j0 == null ? 0 : j0.g());
        this.i.clear();
        this.notifyItemRangeInserted(0, this.h);
    }

    public static void I(f f0, boolean z, boolean z1, boolean z2, j j0, boolean z3, int v, Object object0) {
        f0.H(z, z1, z2, j0, ((v & 16) == 0 ? z3 : false));
    }

    public final void J(@l List list0) {
        L.p(list0, "<set-?>");
        this.j = list0;
    }

    public final void K(@l List list0) {
        L.p(list0, "<set-?>");
        this.i = list0;
    }

    public final void L(int v, boolean z) {
        String s;
        WeakReference weakReference0 = this.f;
        if(weakReference0 != null) {
            h h0 = null;
            RecyclerView recyclerView0 = (RecyclerView)weakReference0.get();
            if(recyclerView0 != null) {
                if(z) {
                    if(this.c && !this.i.isEmpty()) {
                        return;
                    }
                    int v1 = this.b ? U.a.a : U.a.b;
                    if(v1 <= this.i.size()) {
                        boolean z1 = this.e;
                        if(!z1 || v1 != 20) {
                            s = z1 ? recyclerView0.getContext().getString(0x7F1507FE, new Object[]{jl.a.N()}) : recyclerView0.getContext().getString(0x7F1507FE, new Object[]{v1});  // string:post_write_image_max "이미지는 최대 %d개까지만 첨부 가능합니다."
                        }
                        else {
                            s = recyclerView0.getContext().getString(0x7F15011E, new Object[]{20});  // string:auto_image_max_upload "이미지는 한 번에 %1$d개까지 첨부 가능합니다."
                        }
                        L.m(s);
                        Snackbar.E0(recyclerView0, s, -1).m0();
                        return;
                    }
                    PickerItem pickerItem0 = this.v(v);
                    if(pickerItem0 == null) {
                        return;
                    }
                    boolean z2 = this.d && this.c;
                    Context context0 = recyclerView0.getContext();
                    L.o(context0, "getContext(...)");
                    if(!com.dcinside.app.album.l.a.o(recyclerView0, context0, pickerItem0.m(), z2, z2)) {
                        return;
                    }
                    this.i.add(v);
                    this.F();
                    ViewHolder recyclerView$ViewHolder0 = recyclerView0.findViewHolderForAdapterPosition(v);
                    if(recyclerView$ViewHolder0 instanceof h) {
                        h0 = (h)recyclerView$ViewHolder0;
                    }
                    if(h0 == null) {
                        return;
                    }
                    h0.h(this, v);
                    return;
                }
                int v2 = ((Number)u.m4(this.i)).intValue();
                int v3 = ((Number)u.U3(this.i)).intValue();
                this.i.remove(Integer.valueOf(v));
                this.F();
                if(v2 <= v3) {
                    while(true) {
                        ViewHolder recyclerView$ViewHolder1 = recyclerView0.findViewHolderForAdapterPosition(v2);
                        h h1 = recyclerView$ViewHolder1 instanceof h ? ((h)recyclerView$ViewHolder1) : null;
                        if(h1 == null) {
                            this.notifyItemChanged(v2);
                        }
                        else {
                            h1.h(this, v2);
                        }
                        if(v2 == v3) {
                            break;
                        }
                        ++v2;
                    }
                }
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.h;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemViewType(int v) {
        switch(v) {
            case 0: {
                return 1;
            }
            case 1: {
                return 2;
            }
            default: {
                return 0;
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onAttachedToRecyclerView(@l RecyclerView recyclerView0) {
        L.p(recyclerView0, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView0);
        WeakReference weakReference0 = this.f;
        if(weakReference0 != null) {
            weakReference0.clear();
        }
        this.f = new WeakReference(recyclerView0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@l ViewHolder recyclerView$ViewHolder0, int v) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.album.picker.PickerGridAdapter$onBindViewHolder$1", f = "PickerGridAdapter.kt", i = {}, l = {0x7D}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nPickerGridAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PickerGridAdapter.kt\ncom/dcinside/app/album/picker/PickerGridAdapter$onBindViewHolder$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,222:1\n1#2:223\n*E\n"})
        static final class com.dcinside.app.album.picker.f.b extends o implements A3.o {
            int k;
            final f l;
            final int m;
            final ViewHolder n;

            com.dcinside.app.album.picker.f.b(f f0, int v, ViewHolder recyclerView$ViewHolder0, d d0) {
                this.l = f0;
                this.m = v;
                this.n = recyclerView$ViewHolder0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.dcinside.app.album.picker.f.b(this.l, this.m, this.n, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.dcinside.app.album.picker.f.b)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.album.picker.PickerGridAdapter$onBindViewHolder$1$1", f = "PickerGridAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.album.picker.f.b.a extends o implements A3.o {
                    int k;
                    final ViewHolder l;
                    final f m;
                    final int n;
                    final String o;
                    final PickerItem p;

                    com.dcinside.app.album.picker.f.b.a(ViewHolder recyclerView$ViewHolder0, f f0, int v, String s, PickerItem pickerItem0, d d0) {
                        this.l = recyclerView$ViewHolder0;
                        this.m = f0;
                        this.n = v;
                        this.o = s;
                        this.p = pickerItem0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new com.dcinside.app.album.picker.f.b.a(this.l, this.m, this.n, this.o, this.p, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.dcinside.app.album.picker.f.b.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        ((h)this.l).h(this.m, this.n);
                        ((h)this.l).l().setVisibility(0);
                        ((h)this.l).j().setVisibility(0);
                        ((h)this.l).l().setText(this.o);
                        s.j(((h)this.l).j(), this.p.m());
                        return S0.a;
                    }
                }

                String s1;
                long v2;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        PickerItem pickerItem0 = this.l.v(this.m);
                        if(pickerItem0 == null) {
                            return S0.a;
                        }
                        if(pickerItem0.q()) {
                            String s = Gk.a(pickerItem0.o());
                            g l0$g0 = new g();
                            long v = pickerItem0.i();
                            l0$g0.a = v / 1000L;
                            long v1 = 0L;
                            if(v / 1000L >= 3600L) {
                                v2 = v / 1000L / 3600L;
                                l0$g0.a = v / 1000L - 3600L * v2;
                            }
                            else {
                                v2 = 0L;
                            }
                            long v3 = l0$g0.a;
                            if(v3 >= 60L) {
                                v1 = v3 / 60L;
                                l0$g0.a = v3 - 60L * v1;
                            }
                            s1 = String.format("%02d:%02d:%02d %s", Arrays.copyOf(new Object[]{kotlin.coroutines.jvm.internal.b.g(v2), kotlin.coroutines.jvm.internal.b.g(v1), kotlin.coroutines.jvm.internal.b.g(l0$g0.a), s}, 4));
                        }
                        else {
                            s1 = String.format("%s %s", Arrays.copyOf(new Object[]{pickerItem0.l(), Gk.a(pickerItem0.o())}, 2));
                        }
                        L.o(s1, "format(...)");
                        com.dcinside.app.album.picker.f.b.a f$b$a0 = new com.dcinside.app.album.picker.f.b.a(this.n, this.l, this.m, s1, pickerItem0, null);
                        this.k = 1;
                        return i.h(h0.e(), f$b$a0, this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.album.picker.PickerGridAdapter$onBindViewHolder$2", f = "PickerGridAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends o implements p {
            int k;
            final ViewHolder l;
            final int m;

            c(ViewHolder recyclerView$ViewHolder0, int v, d d0) {
                this.l = recyclerView$ViewHolder0;
                this.m = v;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new c(this.l, this.m, d0).invokeSuspend(S0.a);
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
                Context context0 = this.l.itemView.getContext();
                L.o(context0, "getContext(...)");
                com.dcinside.app.rx.bus.c.a(context0, new x(this.m));
                return S0.a;
            }
        }

        I0 i01;
        L.p(recyclerView$ViewHolder0, "holder");
        if(recyclerView$ViewHolder0 instanceof com.dcinside.app.album.picker.l) {
            int v1 = dl.a.G0();
            int v2 = com.dcinside.app.album.m.d.b(v1).d();
            ((com.dcinside.app.album.picker.l)recyclerView$ViewHolder0).j().setText(recyclerView$ViewHolder0.itemView.getContext().getString(v2));
            return;
        }
        if(recyclerView$ViewHolder0 instanceof h) {
            ((h)recyclerView$ViewHolder0).k().setVisibility(8);
            ((h)recyclerView$ViewHolder0).l().setVisibility(4);
            ((h)recyclerView$ViewHolder0).j().setVisibility(4);
            I0 i00 = ((h)recyclerView$ViewHolder0).m();
            if(i00 != null) {
                kotlinx.coroutines.I0.a.b(i00, null, 1, null);
            }
            WeakReference weakReference0 = this.f;
            if(weakReference0 == null) {
                i01 = null;
            }
            else {
                RecyclerView recyclerView0 = (RecyclerView)weakReference0.get();
                if(recyclerView0 == null) {
                    i01 = null;
                }
                else {
                    LifecycleOwner lifecycleOwner0 = ViewTreeLifecycleOwner.a(recyclerView0);
                    if(lifecycleOwner0 == null) {
                        i01 = null;
                    }
                    else {
                        LifecycleCoroutineScope lifecycleCoroutineScope0 = LifecycleOwnerKt.a(lifecycleOwner0);
                        i01 = lifecycleCoroutineScope0 == null ? null : k.f(lifecycleCoroutineScope0, h0.c(), null, new com.dcinside.app.album.picker.f.b(this, v, recyclerView$ViewHolder0, null), 2, null);
                    }
                }
            }
            ((h)recyclerView$ViewHolder0).y(i01);
            r.S(((h)recyclerView$ViewHolder0).j(), null, false, new c(recyclerView$ViewHolder0, v, null), 3, null);
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @l
    public ViewHolder onCreateViewHolder(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        LayoutInflater layoutInflater0 = LayoutInflater.from(viewGroup0.getContext());
        switch(v) {
            case 1: {
                View view1 = layoutInflater0.inflate(0x7F0E017A, viewGroup0, false);  // layout:picker_sort_item
                L.m(view1);
                return new com.dcinside.app.album.picker.l(view1);
            }
            case 2: {
                View view2 = layoutInflater0.inflate(0x7F0E0179, viewGroup0, false);  // layout:picker_add_item
                L.m(view2);
                return new com.dcinside.app.album.picker.g(view2);
            }
            default: {
                View view0 = layoutInflater0.inflate(0x7F0E017B, viewGroup0, false);  // layout:picker_thum_item
                L.m(view0);
                return new h(view0);
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onDetachedFromRecyclerView(@l RecyclerView recyclerView0) {
        L.p(recyclerView0, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView0);
        WeakReference weakReference0 = this.f;
        if(weakReference0 != null) {
            weakReference0.clear();
        }
        this.f = null;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onViewRecycled(@l ViewHolder recyclerView$ViewHolder0) {
        L.p(recyclerView$ViewHolder0, "holder");
        h h0 = recyclerView$ViewHolder0 instanceof h ? ((h)recyclerView$ViewHolder0) : null;
        if(h0 != null) {
            I0 i00 = h0.m();
            if(i00 != null) {
                kotlinx.coroutines.I0.a.b(i00, null, 1, null);
            }
            s.b(h0.j());
        }
    }

    @Override  // com.futuremind.recyclerviewfastscroll.b
    @l
    public String p(int v) {
        return "";
    }

    @m
    public final PickerItem v(int v) {
        if(this.a.size() <= v) {
            return this.g == null ? null : this.g.d(v - this.a.size());
        }
        return (PickerItem)this.a.get(v);
    }

    @l
    public final List w(@l List list0) {
        L.p(list0, "selectedIndexes");
        List list1 = new ArrayList();
        for(Object object0: list0) {
            PickerItem pickerItem0 = this.v(((Number)object0).intValue());
            if(pickerItem0 != null) {
                list1.add(pickerItem0);
            }
        }
        return list1;
    }

    @l
    public final List x() {
        return this.j;
    }

    @l
    public final List y() {
        return this.i;
    }

    public final boolean z() {
        return this.e;
    }
}

