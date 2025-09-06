package com.dcinside.app.archive.edit;

import Y.c;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.dcinside.app.archive.folder.ArchiveFolderActivity;
import com.dcinside.app.base.g;
import com.dcinside.app.perform.e;
import com.dcinside.app.perform.p.a;
import com.dcinside.app.realm.A0;
import com.dcinside.app.realm.d0;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.kl;
import com.dcinside.app.view.tool.NonPredictiveLayoutManager;
import io.realm.F0;
import io.realm.RealmQuery;
import io.realm.d1;
import io.realm.g1;
import io.realm.r1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.S0;
import kotlin.collections.T;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.ranges.l;
import kotlin.ranges.s;
import rx.o;
import y4.m;

@s0({"SMAP\nArchiveEditActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchiveEditActivity.kt\ncom/dcinside/app/archive/edit/ArchiveEditActivity\n+ 2 RealmExtensions.kt\nio/realm/kotlin/RealmExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,261:1\n37#2:262\n37#2:263\n37#2:264\n1#3:265\n1557#4:266\n1628#4,3:267\n1863#4,2:270\n1557#4:272\n1628#4,3:273\n774#4:276\n865#4,2:277\n1557#4:279\n1628#4,3:280\n774#4:283\n865#4,2:284\n*S KotlinDebug\n*F\n+ 1 ArchiveEditActivity.kt\ncom/dcinside/app/archive/edit/ArchiveEditActivity\n*L\n90#1:262\n103#1:263\n106#1:264\n146#1:266\n146#1:267,3\n146#1:270,2\n186#1:272\n186#1:273,3\n186#1:276\n186#1:277,2\n215#1:279\n215#1:280,3\n215#1:283\n215#1:284,2\n*E\n"})
public final class ArchiveEditActivity extends g {
    @m
    private o A;
    private c w;
    private int x;
    @m
    private com.dcinside.app.realm.c y;
    @m
    private g1 z;

    private final void Y1(g1 g10) {
        c c0 = this.w;
        com.dcinside.app.archive.edit.o o0 = null;
        if(c0 == null) {
            L.S("binding");
            c0 = null;
        }
        Adapter recyclerView$Adapter0 = c0.c.getAdapter();
        if(recyclerView$Adapter0 instanceof com.dcinside.app.archive.edit.o) {
            o0 = (com.dcinside.app.archive.edit.o)recyclerView$Adapter0;
        }
        if(o0 != null) {
            o0.B(g10);
            this.Z1(o0.v());
            o0.notifyDataSetChanged();
        }
    }

    private final void Z1(SparseBooleanArray sparseBooleanArray0) {
        c c0 = this.w;
        c c1 = null;
        if(c0 == null) {
            L.S("binding");
            c0 = null;
        }
        Adapter recyclerView$Adapter0 = c0.c.getAdapter();
        com.dcinside.app.archive.edit.o o0 = recyclerView$Adapter0 instanceof com.dcinside.app.archive.edit.o ? ((com.dcinside.app.archive.edit.o)recyclerView$Adapter0) : null;
        boolean z = false;
        int v = o0 == null ? 0 : o0.getItemCount();
        boolean z1 = v > 0;
        l l0 = s.W1(0, v);
        ArrayList arrayList0 = new ArrayList(u.b0(l0, 10));
        Iterator iterator0 = l0.iterator();
        while(iterator0.hasNext()) {
            arrayList0.add(Boolean.valueOf(sparseBooleanArray0.get(((T)iterator0).b())));
        }
        boolean z2 = false;
        for(Object object0: arrayList0) {
            if(((Boolean)object0).booleanValue()) {
                z2 = true;
            }
            else {
                z1 = false;
            }
        }
        c c2 = this.w;
        if(c2 == null) {
            L.S("binding");
            c2 = null;
        }
        c2.e.setOnCheckedChangeListener(null);
        c c3 = this.w;
        if(c3 == null) {
            L.S("binding");
            c3 = null;
        }
        c3.e.setChecked(z1);
        c c4 = this.w;
        if(c4 == null) {
            L.S("binding");
            c4 = null;
        }
        f f0 = (CompoundButton compoundButton0, boolean z) -> {
            L.p(this, "this$0");
            this.g2(z);
        };
        c4.e.setOnCheckedChangeListener(f0);
        c c5 = this.w;
        if(c5 == null) {
            L.S("binding");
            c5 = null;
        }
        FrameLayout frameLayout0 = c5.d;
        if(v > 0) {
            z = true;
        }
        frameLayout0.setEnabled(z);
        c c6 = this.w;
        if(c6 == null) {
            L.S("binding");
            c6 = null;
        }
        c6.f.setEnabled(z2);
        c c7 = this.w;
        if(c7 == null) {
            L.S("binding");
        }
        else {
            c1 = c7;
        }
        c1.g.setEnabled(z2);
    }

    // 检测为 Lambda 实现
    private static final void a2(ArchiveEditActivity archiveEditActivity0, CompoundButton compoundButton0, boolean z) [...]

    // 检测为 Lambda 实现
    private static final void b2(ArchiveEditActivity archiveEditActivity0, g1 g10) [...]

    // 检测为 Lambda 实现
    private static final void c2(ArchiveEditActivity archiveEditActivity0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void d2(ArchiveEditActivity archiveEditActivity0, CompoundButton compoundButton0, boolean z) [...]

    // 检测为 Lambda 实现
    private static final void e2(ArchiveEditActivity archiveEditActivity0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void f2(ArchiveEditActivity archiveEditActivity0, View view0) [...]

    private final void g2(boolean z) {
        c c0 = this.w;
        com.dcinside.app.archive.edit.o o0 = null;
        if(c0 == null) {
            L.S("binding");
            c0 = null;
        }
        Adapter recyclerView$Adapter0 = c0.c.getAdapter();
        if(recyclerView$Adapter0 instanceof com.dcinside.app.archive.edit.o) {
            o0 = (com.dcinside.app.archive.edit.o)recyclerView$Adapter0;
        }
        if(o0 != null) {
            int v = o0.getItemCount();
            for(int v1 = 0; v1 < v; ++v1) {
                o0.v().put(v1, z);
            }
            o0.notifyDataSetChanged();
            this.Z1(o0.v());
        }
    }

    private final void h2() {
        ArchiveFolderActivity.D.a(this, "folderSelect", this.x);
    }

    private final void i2() {
        static final class b extends N implements Function1 {
            public static final b e;

            static {
                b.e = new b();
            }

            b() {
                super(1);
            }

            @m
            public final Object a(@y4.l a p$a0) {
                L.p(p$a0, "b");
                return p$a0.m(0x7F1500A4);  // string:alert_delete_post_archive "보관함에서 삭제하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((a)object0));
            }
        }


        static final class com.dcinside.app.archive.edit.ArchiveEditActivity.c extends N implements Function1 {
            public static final com.dcinside.app.archive.edit.ArchiveEditActivity.c e;

            static {
                com.dcinside.app.archive.edit.ArchiveEditActivity.c.e = new com.dcinside.app.archive.edit.ArchiveEditActivity.c();
            }

            com.dcinside.app.archive.edit.ArchiveEditActivity.c() {
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


        @s0({"SMAP\nArchiveEditActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchiveEditActivity.kt\ncom/dcinside/app/archive/edit/ArchiveEditActivity$onSelectRemove$3\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,261:1\n11132#2:262\n11467#2,3:263\n13346#2,2:268\n37#3,2:266\n*S KotlinDebug\n*F\n+ 1 ArchiveEditActivity.kt\ncom/dcinside/app/archive/edit/ArchiveEditActivity$onSelectRemove$3\n*L\n201#1:262\n201#1:263,3\n203#1:268,2\n201#1:266,2\n*E\n"})
        static final class d extends N implements Function1 {
            final com.dcinside.app.archive.edit.o e;
            final ArchiveEditActivity f;
            final int[] g;

            d(com.dcinside.app.archive.edit.o o0, ArchiveEditActivity archiveEditActivity0, int[] arr_v) {
                this.e = o0;
                this.f = archiveEditActivity0;
                this.g = arr_v;
                super(1);
            }

            public final void b(Boolean boolean0) {
                com.dcinside.app.archive.edit.o o0 = this.e;
                if(o0 != null) {
                    SparseBooleanArray sparseBooleanArray0 = o0.v();
                    if(sparseBooleanArray0 != null) {
                        sparseBooleanArray0.clear();
                    }
                }
                F0 f00 = this.f.F1();
                if(f00 != null) {
                    f00.Y3((F0 f00) -> {
                        d1[] arr_d1;
                        L.p(this.f, "this$0");
                        L.p(this.g, "$array");
                        g1 g10 = this.f.z;
                        if(g10 == null) {
                            arr_d1 = null;
                        }
                        else {
                            ArrayList arrayList0 = new ArrayList(this.g.length);
                            for(int v1 = 0; v1 < this.g.length; ++v1) {
                                arrayList0.add(((d1)g10.get(this.g[v1])));
                            }
                            arr_d1 = (d1[])arrayList0.toArray(new d1[0]);
                        }
                        if(arr_d1 != null) {
                            for(int v = 0; v < arr_d1.length; ++v) {
                                d1 d10 = arr_d1[v];
                                if(d10 != null) {
                                    d10.z5();
                                }
                            }
                        }
                    });
                }
            }

            // 检测为 Lambda 实现
            private static final void c(ArchiveEditActivity archiveEditActivity0, int[] arr_v, F0 f00) [...]

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.b(((Boolean)object0));
                return S0.a;
            }
        }

        int[] arr_v;
        c c0 = this.w;
        com.dcinside.app.archive.edit.o o0 = null;
        if(c0 == null) {
            L.S("binding");
            c0 = null;
        }
        Adapter recyclerView$Adapter0 = c0.c.getAdapter();
        if(recyclerView$Adapter0 instanceof com.dcinside.app.archive.edit.o) {
            o0 = (com.dcinside.app.archive.edit.o)recyclerView$Adapter0;
        }
        if(o0 == null) {
            arr_v = new int[0];
        }
        else {
            SparseBooleanArray sparseBooleanArray0 = o0.v();
            l l0 = s.W1(0, sparseBooleanArray0.size());
            ArrayList arrayList0 = new ArrayList(u.b0(l0, 10));
            Iterator iterator0 = l0.iterator();
            while(iterator0.hasNext()) {
                arrayList0.add(sparseBooleanArray0.keyAt(((T)iterator0).b()));
            }
            ArrayList arrayList1 = new ArrayList();
            for(Object object0: arrayList0) {
                if(sparseBooleanArray0.get(((Number)object0).intValue())) {
                    arrayList1.add(object0);
                }
            }
            arr_v = u.U5(arrayList1);
            if(arr_v == null) {
                arr_v = new int[0];
            }
        }
        if(arr_v.length != 0) {
            o o1 = this.A;
            if(o1 != null) {
                o1.l();
            }
            this.A = e.e.a(this).n(b.e).z(0x104000A).x(0x1040000).b().Z1((Object object0) -> {
                L.p(com.dcinside.app.archive.edit.ArchiveEditActivity.c.e, "$tmp0");
                return (Boolean)com.dcinside.app.archive.edit.ArchiveEditActivity.c.e.invoke(object0);
            }).y5((Object object0) -> {
                L.p(new d(o0, this, arr_v), "$tmp0");
                new d(o0, this, arr_v).invoke(object0);
            }, (Throwable throwable0) -> {
                L.p(this, "this$0");
                Dl.G(this, throwable0.getMessage());
            });
        }
    }

    // 检测为 Lambda 实现
    private static final Boolean j2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void k2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void l2(ArchiveEditActivity archiveEditActivity0, Throwable throwable0) [...]

    private final void m2(com.dcinside.app.realm.c c0) {
        static final class com.dcinside.app.archive.edit.ArchiveEditActivity.e extends N implements Function1 {
            final String e;

            com.dcinside.app.archive.edit.ArchiveEditActivity.e(String s) {
                this.e = s;
                super(1);
            }

            @m
            public final Object a(@y4.l a p$a0) {
                L.p(p$a0, "b");
                return p$a0.n(this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((a)object0));
            }
        }


        static final class com.dcinside.app.archive.edit.ArchiveEditActivity.f extends N implements Function1 {
            public static final com.dcinside.app.archive.edit.ArchiveEditActivity.f e;

            static {
                com.dcinside.app.archive.edit.ArchiveEditActivity.f.e = new com.dcinside.app.archive.edit.ArchiveEditActivity.f();
            }

            com.dcinside.app.archive.edit.ArchiveEditActivity.f() {
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


        @s0({"SMAP\nArchiveEditActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchiveEditActivity.kt\ncom/dcinside/app/archive/edit/ArchiveEditActivity$onShowMoveDialog$3\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,261:1\n11132#2:262\n11467#2,3:263\n13346#2,2:268\n37#3,2:266\n*S KotlinDebug\n*F\n+ 1 ArchiveEditActivity.kt\ncom/dcinside/app/archive/edit/ArchiveEditActivity$onShowMoveDialog$3\n*L\n231#1:262\n231#1:263,3\n233#1:268,2\n231#1:266,2\n*E\n"})
        static final class com.dcinside.app.archive.edit.ArchiveEditActivity.g extends N implements Function1 {
            final com.dcinside.app.archive.edit.o e;
            final ArchiveEditActivity f;
            final int[] g;
            final com.dcinside.app.realm.c h;

            com.dcinside.app.archive.edit.ArchiveEditActivity.g(com.dcinside.app.archive.edit.o o0, ArchiveEditActivity archiveEditActivity0, int[] arr_v, com.dcinside.app.realm.c c0) {
                this.e = o0;
                this.f = archiveEditActivity0;
                this.g = arr_v;
                this.h = c0;
                super(1);
            }

            public final void b(Boolean boolean0) {
                com.dcinside.app.archive.edit.o o0 = this.e;
                if(o0 != null) {
                    SparseBooleanArray sparseBooleanArray0 = o0.v();
                    if(sparseBooleanArray0 != null) {
                        sparseBooleanArray0.clear();
                    }
                }
                F0 f00 = this.f.F1();
                if(f00 != null) {
                    f00.Y3((F0 f00) -> {
                        d1[] arr_d1;
                        L.p(this.f, "this$0");
                        L.p(this.g, "$array");
                        L.p(this.h, "$folder");
                        g1 g10 = this.f.z;
                        if(g10 == null) {
                            arr_d1 = null;
                        }
                        else {
                            ArrayList arrayList0 = new ArrayList(this.g.length);
                            for(int v1 = 0; v1 < this.g.length; ++v1) {
                                arrayList0.add(((d1)g10.get(this.g[v1])));
                            }
                            arr_d1 = (d1[])arrayList0.toArray(new d1[0]);
                        }
                        if(arr_d1 != null) {
                            for(int v = 0; v < arr_d1.length; ++v) {
                                d1 d10 = arr_d1[v];
                                if(d10 instanceof d0) {
                                    ((d0)d10).d6(this.h);
                                }
                                else if(d10 instanceof A0) {
                                    ((A0)d10).b6(this.h);
                                }
                            }
                        }
                    });
                }
            }

            // 检测为 Lambda 实现
            private static final void c(ArchiveEditActivity archiveEditActivity0, int[] arr_v, com.dcinside.app.realm.c c0, F0 f00) [...]

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.b(((Boolean)object0));
                return S0.a;
            }
        }

        int[] arr_v;
        c c1 = this.w;
        com.dcinside.app.archive.edit.o o0 = null;
        if(c1 == null) {
            L.S("binding");
            c1 = null;
        }
        Adapter recyclerView$Adapter0 = c1.c.getAdapter();
        if(recyclerView$Adapter0 instanceof com.dcinside.app.archive.edit.o) {
            o0 = (com.dcinside.app.archive.edit.o)recyclerView$Adapter0;
        }
        if(o0 == null) {
            arr_v = new int[0];
        }
        else {
            SparseBooleanArray sparseBooleanArray0 = o0.v();
            l l0 = s.W1(0, sparseBooleanArray0.size());
            ArrayList arrayList0 = new ArrayList(u.b0(l0, 10));
            Iterator iterator0 = l0.iterator();
            while(iterator0.hasNext()) {
                arrayList0.add(sparseBooleanArray0.keyAt(((T)iterator0).b()));
            }
            ArrayList arrayList1 = new ArrayList();
            for(Object object0: arrayList0) {
                if(sparseBooleanArray0.get(((Number)object0).intValue())) {
                    arrayList1.add(object0);
                }
            }
            arr_v = u.U5(arrayList1);
            if(arr_v == null) {
                arr_v = new int[0];
            }
        }
        if(arr_v.length != 0) {
            String s = this.getString(0x7F1500EB, new Object[]{c0.R5()});  // string:archive_move_folder_alert "%1$s 폴더로 이동하시겠습니까?"
            L.o(s, "getString(...)");
            o o1 = this.A;
            if(o1 != null) {
                o1.l();
            }
            this.A = e.e.a(this).n(new com.dcinside.app.archive.edit.ArchiveEditActivity.e(s)).z(0x104000A).x(0x1040000).b().Z1((Object object0) -> {
                L.p(com.dcinside.app.archive.edit.ArchiveEditActivity.f.e, "$tmp0");
                return (Boolean)com.dcinside.app.archive.edit.ArchiveEditActivity.f.e.invoke(object0);
            }).y5((Object object0) -> {
                L.p(new com.dcinside.app.archive.edit.ArchiveEditActivity.g(o0, this, arr_v, c0), "$tmp0");
                new com.dcinside.app.archive.edit.ArchiveEditActivity.g(o0, this, arr_v, c0).invoke(object0);
            }, (Throwable throwable0) -> {
                L.p(this, "this$0");
                Dl.G(this, throwable0.getMessage());
            });
        }
    }

    // 检测为 Lambda 实现
    private static final Boolean n2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void o2(Function1 function10, Object object0) [...]

    @Override  // com.dcinside.app.base.d
    protected void onActivityResult(int v, int v1, @m Intent intent0) {
        long v2 = 0L;
        super.onActivityResult(v, v1, intent0);
        if(v1 != -1) {
            return;
        }
        if(v == 0x3F9) {
            if(intent0 != null) {
                v2 = intent0.getLongExtra("selectedFolder", 0L);
            }
            F0 f00 = this.F1();
            if(f00 != null) {
                com.dcinside.app.realm.c c0 = com.dcinside.app.realm.d.f.b(f00, v2);
                if(c0 != null) {
                    this.m2(c0);
                }
            }
        }
    }

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        static final class com.dcinside.app.archive.edit.ArchiveEditActivity.a extends N implements Function1 {
            final ArchiveEditActivity e;

            com.dcinside.app.archive.edit.ArchiveEditActivity.a(ArchiveEditActivity archiveEditActivity0) {
                this.e = archiveEditActivity0;
                super(1);
            }

            public final void a(@y4.l SparseBooleanArray sparseBooleanArray0) {
                L.p(sparseBooleanArray0, "it");
                this.e.Z1(sparseBooleanArray0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((SparseBooleanArray)object0));
                return S0.a;
            }
        }

        RealmQuery realmQuery2;
        com.dcinside.app.realm.c c7;
        super.onCreate(bundle0);
        c c0 = c.c(this.getLayoutInflater());
        L.o(c0, "inflate(...)");
        this.w = c0;
        g1 g10 = null;
        if(c0 == null) {
            L.S("binding");
            c0 = null;
        }
        this.setContentView(c0.b());
        c c1 = this.w;
        if(c1 == null) {
            L.S("binding");
            c1 = null;
        }
        this.S0(c1.b);
        kr.bhbfhfb.designcompat.a.d(this);
        c c2 = this.w;
        if(c2 == null) {
            L.S("binding");
            c2 = null;
        }
        com.dcinside.app.archive.edit.g g0 = (View view0) -> {
            L.p(this, "this$0");
            c c0 = this.w;
            if(c0 == null) {
                L.S("binding");
                c0 = null;
            }
            boolean z = c0.e.isChecked();
            c0.e.setChecked(!z);
        };
        c2.d.setOnClickListener(g0);
        c c3 = this.w;
        if(c3 == null) {
            L.S("binding");
            c3 = null;
        }
        h h0 = (CompoundButton compoundButton0, boolean z) -> {
            L.p(this, "this$0");
            this.g2(z);
        };
        c3.e.setOnCheckedChangeListener(h0);
        c c4 = this.w;
        if(c4 == null) {
            L.S("binding");
            c4 = null;
        }
        i i0 = (View view0) -> {
            L.p(this, "this$0");
            this.h2();
        };
        c4.f.setOnClickListener(i0);
        c4.f.setEnabled(false);
        c c5 = this.w;
        if(c5 == null) {
            L.S("binding");
            c5 = null;
        }
        j j0 = (View view0) -> {
            L.p(this, "this$0");
            this.i2();
        };
        c5.g.setOnClickListener(j0);
        c5.g.setEnabled(false);
        c c6 = this.w;
        if(c6 == null) {
            L.S("binding");
            c6 = null;
        }
        NonPredictiveLayoutManager nonPredictiveLayoutManager0 = new NonPredictiveLayoutManager();
        c6.c.setLayoutManager(nonPredictiveLayoutManager0);
        com.dcinside.app.archive.edit.o o0 = new com.dcinside.app.archive.edit.o(new com.dcinside.app.archive.edit.ArchiveEditActivity.a(this));
        c6.c.setAdapter(o0);
        com.dcinside.app.util.ql.b.d(c6.c);
        this.x = this.getIntent().getIntExtra("com.dcinside.app.extra.ARCHIVE_TYPE", 0);
        long v = this.getIntent().getLongExtra("com.dcinside.app.extra.ARCHIVE_FOLDER", 0L);
        F0 f00 = this.F1();
        if(f00 == null) {
            c7 = null;
        }
        else {
            RealmQuery realmQuery0 = f00.C4(com.dcinside.app.realm.c.class);
            L.o(realmQuery0, "this.where(T::class.java)");
            if(realmQuery0 == null) {
                c7 = null;
            }
            else {
                RealmQuery realmQuery1 = realmQuery0.g0("key", v);
                c7 = realmQuery1 == null ? null : ((com.dcinside.app.realm.c)realmQuery1.r0());
            }
        }
        this.y = c7;
        this.setTitle((c7 == null ? "게시물 편집 - 전체" : this.getString(0x7F1500E6, new Object[]{(c7 == null ? null : c7.R5())})));  // string:archive_edit_folder_title "게시물 편집 - %1$s"
        switch(this.x) {
            case 0: {
                F0 f01 = this.F1();
                if(f01 == null) {
                    realmQuery2 = null;
                }
                else {
                    RealmQuery realmQuery3 = f01.C4(d0.class);
                    L.o(realmQuery3, "this.where(T::class.java)");
                    realmQuery2 = realmQuery3 == null ? null : realmQuery3.g2("time", r1.c);
                }
                break;
            }
            case 1: {
                F0 f02 = this.F1();
                if(f02 == null) {
                    realmQuery2 = null;
                }
                else {
                    RealmQuery realmQuery4 = f02.C4(A0.class);
                    L.o(realmQuery4, "this.where(T::class.java)");
                    realmQuery2 = realmQuery4 == null ? null : realmQuery4.g2("time", r1.c);
                }
                break;
            }
            default: {
                realmQuery2 = null;
            }
        }
        com.dcinside.app.realm.c c8 = this.y;
        if(c8 != null) {
            RealmQuery realmQuery5 = realmQuery2 == null ? null : realmQuery2.g0("folder.key", c8.Q5());
            if(realmQuery5 != null) {
                realmQuery2 = realmQuery5;
            }
        }
        g1 g11 = realmQuery2 == null ? null : realmQuery2.q0();
        if(g11 instanceof g1) {
            g10 = g11;
        }
        this.z = g10;
        if(g10 != null) {
            g10.l((g1 g10) -> {
                L.p(this, "this$0");
                L.m(g10);
                this.Y1(g10);
            });
        }
    }

    @Override  // com.dcinside.app.base.g
    protected void onDestroy() {
        super.onDestroy();
        g1 g10 = this.z;
        if(g10 != null) {
            if(!g10.s()) {
                g10 = null;
            }
            if(g10 != null) {
                g10.D();
            }
        }
        this.z = null;
        kl.b(new o[]{this.A});
        this.A = null;
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@y4.l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        if(menuItem0.getItemId() == 0x102002C) {
            this.onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }

    // 检测为 Lambda 实现
    private static final void p2(ArchiveEditActivity archiveEditActivity0, Throwable throwable0) [...]
}

