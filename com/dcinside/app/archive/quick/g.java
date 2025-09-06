package com.dcinside.app.archive.quick;

import Y.L1;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextPaint;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewGroupKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.dcinside.app.internal.r;
import com.dcinside.app.internal.t;
import com.dcinside.app.read.ArchiveQuickManager;
import com.dcinside.app.realm.c;
import com.dcinside.app.rx.a;
import com.dcinside.app.rx.h;
import io.realm.F0;
import io.realm.g1;
import java.util.ArrayList;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.sequences.p;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

@s0({"SMAP\nArchiveQuickFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchiveQuickFragment.kt\ncom/dcinside/app/archive/quick/ArchiveQuickFragment\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,284:1\n112#2,3:285\n129#2,15:289\n116#2:304\n129#2,15:305\n177#2,9:320\n177#2,9:330\n1#3:288\n1#3:339\n1#3:350\n147#4:329\n1611#5,9:340\n1863#5:349\n1864#5:351\n1620#5:352\n*S KotlinDebug\n*F\n+ 1 ArchiveQuickFragment.kt\ncom/dcinside/app/archive/quick/ArchiveQuickFragment\n*L\n74#1:285,3\n74#1:289,15\n74#1:304\n74#1:305,15\n121#1:320,9\n135#1:330,9\n74#1:288\n232#1:350\n122#1:329\n232#1:340,9\n232#1:349\n232#1:351\n232#1:352\n*E\n"})
public final class g extends Fragment implements a {
    static final class com.dcinside.app.archive.quick.g.a {
        @l
        public static final com.dcinside.app.archive.quick.g.a a;
        @l
        private static final SparseIntArray b;

        static {
            com.dcinside.app.archive.quick.g.a.a = new com.dcinside.app.archive.quick.g.a();
            com.dcinside.app.archive.quick.g.a.b = new SparseIntArray();
        }

        public final int a(int v) {
            SparseIntArray sparseIntArray0 = com.dcinside.app.archive.quick.g.a.b;
            int v1 = sparseIntArray0.get(v);
            if(v1 == 0) {
                v1 = View.generateViewId();
                sparseIntArray0.put(v, v1);
            }
            return v1;
        }

        @l
        public final SparseIntArray b() {
            return com.dcinside.app.archive.quick.g.a.b;
        }
    }

    private final a a;
    @m
    private L1 b;
    private int c;
    @l
    private List d;
    @l
    private TextPaint e;
    @m
    private I0 f;

    public g() {
        this(null, 1, null);
    }

    public g(@l a a0) {
        L.p(a0, "scope");
        super();
        this.a = a0;
        this.d = u.H();
        this.e = new TextPaint();
    }

    public g(a a0, int v, w w0) {
        if((v & 1) != 0) {
            a0 = new h(null, 1, null);
        }
        this(a0);
    }

    private final void dismiss() {
        FragmentActivity fragmentActivity0 = this.getActivity();
        if(fragmentActivity0 == null) {
            return;
        }
        FragmentManager fragmentManager0 = fragmentActivity0.getSupportFragmentManager();
        L.o(fragmentManager0, "getSupportFragmentManager(...)");
        if(fragmentManager0.d1()) {
            return;
        }
        fragmentManager0.u().B(this).q();
    }

    @Override  // kotlinx.coroutines.O
    @l
    public kotlin.coroutines.g getCoroutineContext() {
        return this.a.getCoroutineContext();
    }

    private final void l0() {
        static final class b extends N implements Function1 {
            public static final b e;

            static {
                b.e = new b();
            }

            b() {
                super(1);
            }

            @l
            public final TextView b(@l View view0) {
                L.p(view0, "it");
                return (TextView)view0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.b(((View)object0));
            }
        }

        float f7;
        LayoutInflater layoutInflater0 = LayoutInflater.from(this.getContext());
        LinearLayout linearLayout0 = this.p0().c;
        L.o(linearLayout0, "archiveQuickRecentContainer");
        Rect rect0 = new Rect();
        List list0 = u.Y5(u.c2(this.d, 1));
        float f = 0.0f;
        while(true) {
            String s = "";
            if(list0.isEmpty() || linearLayout0.getChildCount() >= 3) {
                break;
            }
            c c0 = (c)list0.remove(0);
            TextView textView0 = g.m0(layoutInflater0, linearLayout0, 0.5f, this);
            String s1 = c0.R5();
            if(s1 != null) {
                s = s1;
            }
            textView0.setText(s);
            float f1 = g.n0(textView0, this, rect0, 0.5f);
            f += f1 + 1.0f;
            textView0.getLayoutParams().width = (int)f1;
            linearLayout0.addView(textView0);
        }
        int v = linearLayout0.getChildCount();
        kotlin.sequences.m m0 = p.k1(ViewGroupKt.e(linearLayout0), b.e);
        float f2 = -0.5f / ((float)v) - 1.0f;
        float f3 = f;
        float f4 = (float)Math.ceil(f + 0.5f);
        List list1 = p.c3(m0);
        while(f4 > 0.0f && !list1.isEmpty()) {
            float f5 = (float)Math.ceil(f4 / ((float)list1.size()));
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: list1) {
                TextView textView1 = (TextView)object0;
                float f6 = (float)textView1.getLayoutParams().width;
                if(f6 > f2) {
                    f7 = f5;
                    textView1.getLayoutParams().width = (int)Math.max(f6 - f5, f2);
                }
                else {
                    f7 = f5;
                    textView1 = null;
                }
                if(textView1 != null) {
                    arrayList0.add(textView1);
                }
                f5 = f7;
            }
            double f8 = 0.0;
            for(Object object1: m0) {
                f8 += ((double)((TextView)object1).getLayoutParams().width) + 1.0;
            }
            f4 = (float)Math.ceil(((float)f8) + 0.5f);
            list1 = arrayList0;
            f3 = (float)f8;
        }
        while(!list0.isEmpty() && -0.5f > f3 + 2.0f) {
            c c1 = (c)list0.remove(0);
            TextView textView2 = g.m0(layoutInflater0, linearLayout0, 0.5f, this);
            String s2 = c1.R5();
            if(s2 == null) {
                s2 = "";
            }
            textView2.setText(s2);
            float f9 = g.n0(textView2, this, rect0, 0.5f);
            float f10 = f3 + f9 + 1.0f + 0.5f;
            if(f10 > 0.0f) {
                f9 -= f10;
            }
            f3 += f9 + 1.0f;
            textView2.getLayoutParams().width = (int)f9;
            linearLayout0.addView(textView2);
        }
    }

    private static final TextView m0(LayoutInflater layoutInflater0, LinearLayout linearLayout0, float f, g g0) {
        @f(c = "com.dcinside.app.archive.quick.ArchiveQuickFragment$applyRecentItems$createView$2", f = "ArchiveQuickFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.archive.quick.g.c extends o implements A3.p {
            int k;
            Object l;
            final g m;

            com.dcinside.app.archive.quick.g.c(g g0, d d0) {
                this.m = g0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                com.dcinside.app.archive.quick.g.c g$c0 = new com.dcinside.app.archive.quick.g.c(this.m, d0);
                g$c0.l = view0;
                return g$c0.invokeSuspend(S0.a);
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
                this.m.w0(((View)this.l));
                return S0.a;
            }
        }

        View view0 = layoutInflater0.inflate(0x7F0E019A, linearLayout0, false);  // layout:view_archive_quick_recent_item
        L.n(view0, "null cannot be cast to non-null type android.widget.TextView");
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-2, -2);
        linearLayout$LayoutParams0.setMargins(((int)f), 0, ((int)f), 0);
        ((TextView)view0).setLayoutParams(linearLayout$LayoutParams0);
        int v = linearLayout0.getChildCount();
        ((TextView)view0).setId(com.dcinside.app.archive.quick.g.a.a.a(v));
        r.M(((TextView)view0), null, new com.dcinside.app.archive.quick.g.c(g0, null), 1, null);
        return (TextView)view0;
    }

    private static final float n0(TextView textView0, g g0, Rect rect0, float f) {
        String s = textView0.getText().toString();
        g0.e.getTextBounds(s, 0, s.length(), rect0);
        return ((float)rect0.width()) + f;
    }

    private final void o0(long v) {
        FragmentActivity fragmentActivity0 = this.getActivity();
        com.dcinside.app.base.g g0 = fragmentActivity0 instanceof com.dcinside.app.base.g ? ((com.dcinside.app.base.g)fragmentActivity0) : null;
        if(g0 != null) {
            ArchiveQuickManager archiveQuickManager0 = g0.k1();
            if(archiveQuickManager0 != null) {
                archiveQuickManager0.z(v, null);
            }
        }
        this.dismiss();
    }

    @Override  // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.b = L1.d(layoutInflater0, viewGroup0, false);
        View view0 = this.p0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.b = null;
        super.onDestroyView();
        this.t();
        try {
            I0 i00 = this.f;
            if(i00 != null) {
                kotlinx.coroutines.I0.a.b(i00, null, 1, null);
            }
        }
        catch(Exception unused_ex) {
        }
        this.f = null;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@l Bundle bundle0) {
        L.p(bundle0, "outState");
        super.onSaveInstanceState(bundle0);
        bundle0.putInt("com.dcinside.app.extra.ARCHIVE_TYPE", this.c);
    }

    @Override  // androidx.fragment.app.Fragment
    public void onStart() {
        @f(c = "com.dcinside.app.archive.quick.ArchiveQuickFragment$onStart$2", f = "ArchiveQuickFragment.kt", i = {}, l = {0x7C, 0x7D}, m = "invokeSuspend", n = {}, s = {})
        static final class e extends o implements A3.o {
            int k;
            final t l;

            e(t t0, d d0) {
                this.l = t0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new e(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((e)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @f(c = "com.dcinside.app.archive.quick.ArchiveQuickFragment$onStart$2$1", f = "ArchiveQuickFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.archive.quick.g.e.a extends o implements A3.o {
                    int k;
                    final t l;

                    com.dcinside.app.archive.quick.g.e.a(t t0, d d0) {
                        this.l = t0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new com.dcinside.app.archive.quick.g.e.a(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.dcinside.app.archive.quick.g.e.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        g g0 = (g)this.l.a();
                        if(g0 != null) {
                            g0.dismiss();
                        }
                        return S0.a;
                    }
                }

                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        this.k = 1;
                        if(a0.b(4000L, this) == object1) {
                            return object1;
                        }
                        break;
                    }
                    case 1: {
                        f0.n(object0);
                        break;
                    }
                    case 2: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                com.dcinside.app.archive.quick.g.e.a g$e$a0 = new com.dcinside.app.archive.quick.g.e.a(this.l, null);
                this.k = 2;
                return i.h(h0.e(), g$e$a0, this) == object1 ? object1 : S0.a;
            }
        }

        super.onStart();
        I0 i00 = this.f;
        if(i00 != null) {
            try {
                kotlinx.coroutines.I0.a.b(i00, null, 1, null);
            }
            catch(Exception unused_ex) {
            }
        }
        this.f = k.f(this, null, null, new e(new t(this), null), 3, null);
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        this.s0(bundle0);
        this.t0();
        this.r0();
        this.u0();
        this.q0();
    }

    private final L1 p0() {
        L1 l10 = this.b;
        L.m(l10);
        return l10;
    }

    private final void q0() {
        @f(c = "com.dcinside.app.archive.quick.ArchiveQuickFragment$initCallbacks$1", f = "ArchiveQuickFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.archive.quick.g.d extends o implements A3.p {
            int k;
            final g l;

            com.dcinside.app.archive.quick.g.d(g g0, d d0) {
                this.l = g0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.archive.quick.g.d(this.l, d0).invokeSuspend(S0.a);
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
                this.l.v0();
                return S0.a;
            }
        }

        L1 l10 = this.p0();
        L.o(l10.b, "archiveQuickEdit");
        com.dcinside.app.archive.quick.g.d g$d0 = new com.dcinside.app.archive.quick.g.d(this, null);
        r.M(l10.b, null, g$d0, 1, null);
    }

    private final void r0() {
        L1 l10 = this.p0();
        L.o(l10.c, "archiveQuickRecentContainer");
        View view0 = LayoutInflater.from(l10.c.getContext()).inflate(0x7F0E019A, l10.c, false);  // layout:view_archive_quick_recent_item
        L.n(view0, "null cannot be cast to non-null type android.widget.TextView");
        TextPaint textPaint0 = ((TextView)view0).getPaint();
        L.o(textPaint0, "getPaint(...)");
        this.e = textPaint0;
        String s = ((c)u.B2(this.d)).R5();
        if(s == null) {
            s = "";
        }
        TextView textView0 = this.p0().b;
        L.o(textView0, "archiveQuickEdit");
        TextView textView1 = this.p0().d;
        L.o(textView1, "archiveQuickTitle");
        r.o0(textView0, (this.c == 0 ? 0x7F1500D9 : 0x7F1500DA));  // string:archive_change_edit0 "변경"
        textView1.setText(com.dcinside.app.span.g.a.i(this.e, textView1, textView0, s));
    }

    private final void s0(Bundle bundle0) {
        if(bundle0 == null) {
            bundle0 = this.getArguments();
        }
        if(bundle0 != null) {
            this.c = bundle0.getInt("com.dcinside.app.extra.ARCHIVE_TYPE");
        }
    }

    @Override  // com.dcinside.app.rx.a
    public void t() {
        this.a.t();
    }

    private final void t0() {
        List list0;
        F0 f00 = F0.g4();
        L.m(f00);
        if(f00.E0()) {
            goto label_12;
        }
        else {
            f00.beginTransaction();
            goto label_4;
        }
        goto label_26;
        try {
        label_4:
            g1 g10 = com.dcinside.app.realm.d.f.d(f00, this.c, 21L);
            list0 = g10.isEmpty() ? u.k(f00.d2(com.dcinside.app.realm.d.f.a(f00, this.c, null))) : f00.g2(g10);
            f00.p();
            goto label_26;
        }
        catch(Throwable throwable1) {
        }
        if(f00.E0()) {
            f00.e();
        }
        throw throwable1;
        try {
        label_12:
            com.dcinside.app.realm.d.a d$a0 = com.dcinside.app.realm.d.f;
            g1 g11 = d$a0.d(f00, this.c, 21L);
            list0 = g11.isEmpty() ? u.k(f00.d2(d$a0.a(f00, this.c, null))) : f00.g2(g11);
            goto label_26;
        }
        catch(Throwable throwable2) {
        }
        try {
            throw throwable2;
        }
        catch(Throwable throwable0) {
        }
        try {
            throw throwable0;
        }
        catch(Throwable throwable3) {
            kotlin.io.c.a(f00, throwable0);
            throw throwable3;
        }
    label_26:
        kotlin.io.c.a(f00, null);
        L.m(list0);
        this.d = list0;
    }

    private final void u0() {
        if(this.d.size() <= 1) {
            this.p0().c.setVisibility(8);
            return;
        }
        this.p0().c.setVisibility(0);
        this.l0();
    }

    private final void v0() {
        FragmentActivity fragmentActivity0 = this.getActivity();
        com.dcinside.app.base.g g0 = fragmentActivity0 instanceof com.dcinside.app.base.g ? ((com.dcinside.app.base.g)fragmentActivity0) : null;
        long v = ((c)u.B2(this.d)).Q5();
        if(g0 != null) {
            ArchiveQuickManager archiveQuickManager0 = g0.k1();
            if(archiveQuickManager0 != null) {
                archiveQuickManager0.B(g0, v);
            }
        }
        this.dismiss();
    }

    private final void w0(View view0) {
        Integer integer0 = this.p0().c.indexOfChild(view0);
        if(integer0.intValue() < 0) {
            integer0 = null;
        }
        if(integer0 != null) {
            c c0 = (c)u.W2(u.c2(this.d, 1), ((int)integer0));
            if(c0 == null) {
                return;
            }
            this.o0(c0.Q5());
        }
    }
}

