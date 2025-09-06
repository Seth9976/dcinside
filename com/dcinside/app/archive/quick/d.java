package com.dcinside.app.archive.quick;

import A3.p;
import Y.K1;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.dcinside.app.internal.r;
import com.dcinside.app.read.ArchiveQuickManager;
import com.dcinside.app.read.H;
import com.dcinside.app.rx.a;
import com.dcinside.app.rx.h;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Nk;
import com.dcinside.app.util.ll;
import com.dcinside.app.view.tool.j;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.c;
import io.realm.F0;
import io.realm.P0;
import io.realm.T0;
import java.util.Iterator;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.g;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

@s0({"SMAP\nArchiveChangeDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchiveChangeDialogFragment.kt\ncom/dcinside/app/archive/quick/ArchiveChangeDialogFragment\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 View.kt\nandroidx/core/view/ViewKt\n+ 7 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n*L\n1#1,232:1\n177#2,9:233\n177#2,9:243\n25#3:242\n25#3:253\n25#3:254\n25#3:262\n1#4:252\n360#5,7:255\n257#6,2:263\n255#6:265\n35#7:266\n*S KotlinDebug\n*F\n+ 1 ArchiveChangeDialogFragment.kt\ncom/dcinside/app/archive/quick/ArchiveChangeDialogFragment\n*L\n109#1:233,9\n116#1:243,9\n113#1:242\n129#1:253\n157#1:254\n180#1:262\n164#1:255,7\n210#1:263,2\n139#1:265\n142#1:266\n*E\n"})
public final class d extends com.google.android.material.bottomsheet.d implements a, P0 {
    public static final class com.dcinside.app.archive.quick.d.a {
        private com.dcinside.app.archive.quick.d.a() {
        }

        public com.dcinside.app.archive.quick.d.a(w w0) {
        }
    }

    private final a b;
    @m
    private K1 c;
    @m
    private T0 d;
    @m
    private F0 e;
    private int f;
    @m
    private H g;
    @m
    private I0 h;
    @l
    public static final com.dcinside.app.archive.quick.d.a i = null;
    @l
    public static final String j = "com.dcinside.app.extra.FOLDER_KEY";
    @l
    private static final String k = "com.dcinside.app.extra.MEMO";

    static {
        d.i = new com.dcinside.app.archive.quick.d.a(null);
    }

    public d() {
        this(null, 1, null);
    }

    public d(@l a a0) {
        L.p(a0, "scope");
        super();
        this.b = a0;
    }

    public d(a a0, int v, w w0) {
        if((v & 1) != 0) {
            a0 = new h(null, 1, null);
        }
        this(a0);
    }

    @Override  // io.realm.P0
    public void M(Object object0) {
        this.t0(((T0)object0));
    }

    @Override  // kotlinx.coroutines.O
    @l
    public g getCoroutineContext() {
        return this.b.getCoroutineContext();
    }

    @Override  // com.google.android.material.bottomsheet.d
    @l
    public Dialog onCreateDialog(@m Bundle bundle0) {
        Dialog dialog0 = new c(this.requireContext(), this.getTheme());
        dialog0.setOnShowListener((DialogInterface dialogInterface0) -> {
            L.p(this, "this$0");
            L.p(((c)dialog0), "$bottomSheetDialog");
            if(!(dialogInterface0 instanceof c)) {
                return;
            }
            K1 k10 = this.s0();
            L.o(k10.f, "archiveChangeMemoInput");
            boolean z = k10.f.getVisibility() == 0;
            View view0 = ((c)dialogInterface0).findViewById(0x7F0B03C6);  // id:design_bottom_sheet
            if(view0 == null) {
                return;
            }
            Context context0 = this.getContext();
            if(context0 != null) {
                Configuration configuration0 = context0.getResources().getConfiguration();
                L.o(configuration0, "getConfiguration(...)");
                if(configuration0 != null && configuration0.orientation == 2) {
                    BottomSheetBehavior.x0(view0).q1(Dk.d((z ? 0xC5 : 0x88)), false);
                }
            }
            if(z) {
                Window window0 = ((c)dialog0).getWindow();
                if(window0 != null) {
                    window0.setSoftInputMode(16);
                }
            }
        });
        return dialog0;
    }

    @Override  // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.c = K1.d(layoutInflater0, viewGroup0, false);
        View view0 = this.s0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onDestroyView() {
        K1 k10 = this.s0();
        L.o(k10.b, "archiveChangeFolderList");
        Adapter recyclerView$Adapter0 = k10.b.getAdapter();
        if(!(recyclerView$Adapter0 instanceof b)) {
            recyclerView$Adapter0 = null;
        }
        if(((b)recyclerView$Adapter0) != null) {
            ((b)recyclerView$Adapter0).onDestroy();
        }
        this.c = null;
        this.t();
        try {
            I0 i00 = this.h;
            if(i00 != null) {
                kotlinx.coroutines.I0.a.b(i00, null, 1, null);
            }
        }
        catch(Exception unused_ex) {
        }
        this.h = null;
        H h0 = this.g;
        if(h0 != null) {
            h0.n();
        }
        this.g = null;
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
        F0 f00 = this.e;
        if(f00 != null) {
            if(f00.isClosed()) {
                f00 = null;
            }
            if(f00 != null) {
                f00.close();
            }
        }
        this.e = null;
        super.onDestroyView();
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onSaveInstanceState(@l Bundle bundle0) {
        L.p(bundle0, "outState");
        super.onSaveInstanceState(bundle0);
        K1 k10 = this.s0();
        L.o(k10.b, "archiveChangeFolderList");
        Adapter recyclerView$Adapter0 = k10.b.getAdapter();
        String s = null;
        if(!(recyclerView$Adapter0 instanceof b)) {
            recyclerView$Adapter0 = null;
        }
        bundle0.putLong("com.dcinside.app.extra.FOLDER_KEY", (((b)recyclerView$Adapter0) == null ? -1L : ((b)recyclerView$Adapter0).C()));
        bundle0.putInt("com.dcinside.app.extra.ARCHIVE_TYPE", this.f);
        Editable editable0 = this.s0().f.getText();
        if(editable0 != null) {
            s = editable0.toString();
        }
        bundle0.putString("com.dcinside.app.extra.MEMO", s);
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onStop() {
        super.onStop();
        Nk.a.b(this.getDialog());
        try {
            this.dismissAllowingStateLoss();
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
        static final class com.dcinside.app.archive.quick.d.c extends N implements Function1 {
            final d e;

            com.dcinside.app.archive.quick.d.c(d d0) {
                this.e = d0;
                super(1);
            }

            public final void a(int v) {
                this.e.u0(v);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Number)object0).intValue());
                return S0.a;
            }
        }


        static final class com.dcinside.app.archive.quick.d.d extends N implements Function1 {
            final d e;

            com.dcinside.app.archive.quick.d.d(d d0) {
                this.e = d0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Boolean)object0).booleanValue());
                return S0.a;
            }

            public final void invoke(boolean z) {
                this.e.v0(z);
            }
        }


        @f(c = "com.dcinside.app.archive.quick.ArchiveChangeDialogFragment$onViewCreated$4", f = "ArchiveChangeDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class e extends o implements p {
            int k;
            final d l;

            e(d d0, kotlin.coroutines.d d1) {
                this.l = d0;
                super(3, d1);
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
                this.l.w0();
                return S0.a;
            }
        }

        String s;
        long v;
        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        this.g = new H(view0, new com.dcinside.app.archive.quick.d.c(this), new com.dcinside.app.archive.quick.d.d(this));
        this.e = F0.g4();
        if(bundle0 == null) {
            bundle0 = this.getArguments();
        }
        if(bundle0 == null) {
            v = -1L;
            s = null;
        }
        else {
            v = bundle0.getLong("com.dcinside.app.extra.FOLDER_KEY");
            this.f = bundle0.getInt("com.dcinside.app.extra.ARCHIVE_TYPE");
            s = bundle0.getString("com.dcinside.app.extra.MEMO");
        }
        FrameLayout frameLayout0 = this.s0().d;
        int v1 = ll.q();
        boolean z = !ll.x();
        j.h(frameLayout0, v1);
        this.s0().f.setText(s);
        K1 k10 = this.s0();
        L.o(k10.h, "archiveChangeOk");
        e d$e0 = new e(this, null);
        r.M(k10.h, null, d$e0, 1, null);
        K1 k11 = this.s0();
        b b0 = new b(this.f, v);
        k11.b.setAdapter(b0);
        if(this.f == 0) {
            this.s0().g.setVisibility(8);
            this.s0().f.setVisibility(8);
            this.s0().e.setVisibility(8);
        }
        F0 f00 = this.e;
        L.m(f00);
        T0 t00 = com.dcinside.app.realm.d.f.c(f00, this.f).S5();
        t00.j(this);
        this.t0(t00);
        this.d = t00;
    }

    private final K1 s0() {
        K1 k10 = this.c;
        L.m(k10);
        return k10;
    }

    @Override  // com.dcinside.app.rx.a
    public void t() {
        this.b.t();
    }

    public void t0(@l T0 t00) {
        L.p(t00, "list");
        K1 k10 = this.s0();
        L.o(k10.b, "archiveChangeFolderList");
        Adapter recyclerView$Adapter0 = k10.b.getAdapter();
        if(!(recyclerView$Adapter0 instanceof b)) {
            recyclerView$Adapter0 = null;
        }
        if(((b)recyclerView$Adapter0) == null) {
            return;
        }
        long v = ((b)recyclerView$Adapter0).C();
        List list0 = t00.t().g2(t00);
        if(v >= 0L) {
            L.m(list0);
            int v1 = 0;
            Iterator iterator0 = list0.iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    v1 = -1;
                    break;
                }
                Object object0 = iterator0.next();
                if(((com.dcinside.app.realm.c)object0).Q5() == v) {
                    break;
                }
                ++v1;
            }
            if(v1 > 0) {
                list0 = u.Y5(list0);
                list0.add(0, ((com.dcinside.app.realm.c)list0.remove(v1)));
            }
        }
        L.m(list0);
        ((b)recyclerView$Adapter0).I(list0);
    }

    private final void u0(int v) {
        boolean z = !ll.x();
        K1 k10 = this.s0();
        int v1 = s.u(v, 0);
        j.h(k10.d, v1);
    }

    private final void v0(boolean z) {
        @f(c = "com.dcinside.app.archive.quick.ArchiveChangeDialogFragment$onChangedKeyboardVisible$2", f = "ArchiveChangeDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.archive.quick.d.b extends o implements A3.o {
            int k;
            final View l;

            com.dcinside.app.archive.quick.d.b(View view0, kotlin.coroutines.d d0) {
                this.l = view0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.archive.quick.d.b(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.archive.quick.d.b)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                BottomSheetBehavior.x0(this.l).g(3);
                return S0.a;
            }
        }

        if(!this.isVisible()) {
            return;
        }
        Dialog dialog0 = this.getDialog();
        if(dialog0 == null) {
            return;
        }
        View view0 = dialog0.findViewById(0x7F0B03C6);  // id:design_bottom_sheet
        if(view0 == null) {
            return;
        }
        if(z) {
            BottomSheetBehavior.x0(view0).g(3);
        }
        FrameLayout frameLayout0 = this.s0().d;
        L.o(frameLayout0, "archiveChangeKeyboardSpace");
        int v = 0;
        if(z) {
            Rect rect0 = new Rect();
            View view1 = this.getView();
            if(view1 != null) {
                view1.getWindowVisibleDisplayFrame(rect0);
            }
            if(Math.abs(-(rect0.bottom + ll.q())) <= 1) {
                v = 8;
            }
        }
        else {
            v = 8;
        }
        frameLayout0.setVisibility(v);
        if(z) {
            k.f(this, h0.e(), null, new com.dcinside.app.archive.quick.d.b(view0, null), 2, null);
        }
    }

    private final void w0() {
        K1 k10 = this.s0();
        L.o(k10.b, "archiveChangeFolderList");
        Adapter recyclerView$Adapter0 = k10.b.getAdapter();
        String s = null;
        if(!(recyclerView$Adapter0 instanceof b)) {
            recyclerView$Adapter0 = null;
        }
        if(((b)recyclerView$Adapter0) == null) {
            return;
        }
        long v = ((b)recyclerView$Adapter0).C();
        if(v >= 0L) {
            FragmentActivity fragmentActivity0 = this.getActivity();
            com.dcinside.app.base.g g0 = fragmentActivity0 instanceof com.dcinside.app.base.g ? ((com.dcinside.app.base.g)fragmentActivity0) : null;
            if(g0 != null) {
                ArchiveQuickManager archiveQuickManager0 = g0.k1();
                if(archiveQuickManager0 != null) {
                    Editable editable0 = this.s0().f.getText();
                    if(editable0 != null) {
                        s = editable0.toString();
                    }
                    archiveQuickManager0.z(v, s);
                }
            }
            this.dismiss();
            return;
        }
        Context context0 = this.getContext();
        if(context0 == null) {
            return;
        }
        Dl.D(context0, 0x7F1500DC);  // string:archive_change_folder_select_alert "폴더를 선택해주세요."
    }

    // 检测为 Lambda 实现
    private static final void x0(d d0, c c0, DialogInterface dialogInterface0) [...]
}

