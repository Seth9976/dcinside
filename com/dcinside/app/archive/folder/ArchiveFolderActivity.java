package com.dcinside.app.archive.folder;

import Y.p;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.archive.util.u;
import com.dcinside.app.base.g;
import com.dcinside.app.realm.A0;
import com.dcinside.app.realm.d0;
import com.dcinside.app.util.Dl;
import com.dcinside.app.view.q0;
import com.dcinside.app.view.tool.NonPredictiveLayoutManager;
import io.realm.F0;
import io.realm.P0;
import io.realm.RealmQuery;
import io.realm.T0;
import io.realm.g1;
import java.util.Collections;
import java.util.List;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import rx.o;
import y4.l;
import y4.m;
import z3.n;

@s0({"SMAP\nArchiveFolderActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchiveFolderActivity.kt\ncom/dcinside/app/archive/folder/ArchiveFolderActivity\n+ 2 RealmExtensions.kt\nio/realm/kotlin/RealmExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,386:1\n37#2:387\n37#2:388\n1#3:389\n25#4:390\n25#4:391\n25#4:392\n*S KotlinDebug\n*F\n+ 1 ArchiveFolderActivity.kt\ncom/dcinside/app/archive/folder/ArchiveFolderActivity\n*L\n83#1:387\n84#1:388\n109#1:390\n184#1:391\n213#1:392\n*E\n"})
public final class ArchiveFolderActivity extends g implements P0 {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @n
        public final void a(@l AppCompatActivity appCompatActivity0, @l String s, int v) {
            L.p(appCompatActivity0, "activity");
            L.p(s, "action");
            Intent intent0 = new Intent(appCompatActivity0, ArchiveFolderActivity.class);
            intent0.putExtra("archiveType", v);
            intent0.setAction(s);
            appCompatActivity0.startActivityForResult(intent0, 0x3F9);
        }
    }

    static final class b extends ViewHolder {
        @l
        private final TextView a;
        @l
        private final TextView b;

        public b(@l View view0) {
            L.p(view0, "itemView");
            super(view0);
            View view1 = view0.findViewById(0x7F0B0141);  // id:archive_folder_select_name
            L.o(view1, "findViewById(...)");
            this.a = (TextView)view1;
            View view2 = view0.findViewById(0x7F0B0140);  // id:archive_folder_select_count
            L.o(view2, "findViewById(...)");
            this.b = (TextView)view2;
        }

        @l
        public final TextView e() {
            return this.b;
        }

        @l
        public final TextView f() {
            return this.a;
        }
    }

    @s0({"SMAP\nArchiveFolderActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchiveFolderActivity.kt\ncom/dcinside/app/archive/folder/ArchiveFolderActivity$ManagerAdapter\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,386:1\n112#2,3:387\n129#2,15:391\n116#2:406\n129#2,15:407\n1#3:390\n*S KotlinDebug\n*F\n+ 1 ArchiveFolderActivity.kt\ncom/dcinside/app/archive/folder/ArchiveFolderActivity$ManagerAdapter\n*L\n333#1:387,3\n333#1:391,15\n333#1:406\n333#1:407,15\n333#1:390\n*E\n"})
    static final class c extends Adapter implements Z.b {
        public static final class com.dcinside.app.archive.folder.ArchiveFolderActivity.c.a {
            private com.dcinside.app.archive.folder.ArchiveFolderActivity.c.a() {
            }

            public com.dcinside.app.archive.folder.ArchiveFolderActivity.c.a(w w0) {
            }
        }

        @m
        private final g1 a;
        @m
        private T0 b;
        @m
        private List c;
        private boolean d;
        @l
        public static final com.dcinside.app.archive.folder.ArchiveFolderActivity.c.a e = null;
        private static final int f = 0;
        private static final int g = 1;

        static {
            c.e = new com.dcinside.app.archive.folder.ArchiveFolderActivity.c.a(null);
        }

        public c(@m g1 g10) {
            this.a = g10;
        }

        public final void A(@l F0 f00, @l T0 t00) {
            L.p(f00, "realm");
            L.p(t00, "folderList");
            this.b = t00;
            this.c = f00.g2(t00);
            this.notifyDataSetChanged();
        }

        public final void B(@m List list0) {
            this.c = list0;
        }

        public final void C(@m T0 t00) {
            this.b = t00;
        }

        public final void D(boolean z) {
            this.d = z;
        }

        public final void E(boolean z) {
            this.d = z;
        }

        @Override  // Z.b
        public void e(int v) {
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter, Z.b
        public int getItemCount() {
            List list0 = this.c;
            if(list0 != null) {
                L.m(list0);
                return list0.size();
            }
            return 0;
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public int getItemViewType(int v) {
            return this.d;
        }

        @Override  // Z.b
        public boolean l(int v, int v1) {
            List list0 = this.c;
            if(list0 != null) {
                int v2 = list0.size();
                if(v >= 0 && v <= v2 - 1 && v1 >= 0 && v1 <= v2 - 1) {
                    if(v < v1) {
                        for(int v3 = v; v3 < v1; ++v3) {
                            Collections.swap(list0, v3, v3 + 1);
                        }
                    }
                    else if(v1 + 1 <= v) {
                        for(int v4 = v; true; --v4) {
                            Collections.swap(list0, v4, v4 - 1);
                            if(v4 == v1 + 1) {
                                break;
                            }
                        }
                    }
                    this.notifyItemMoved(v, v1);
                }
            }
            return true;
        }

        @Override  // Z.b
        public void m(int v) {
            T0 t00 = this.b;
            if(t00 == null) {
                return;
            }
            List list0 = this.c;
            if(list0 == null) {
                return;
            }
            F0 f00 = F0.g4();
            L.m(f00);
            if(f00.E0()) {
                goto label_31;
            }
            else {
                f00.beginTransaction();
                goto label_10;
            }
            goto label_53;
            try {
            label_10:
                int v1 = list0.size();
                for(int v2 = 0; v2 < v1; ++v2) {
                    long v3 = ((com.dcinside.app.realm.c)list0.get(v2)).Q5();
                    int v4 = t00.size();
                    int v5 = 0;
                    while(v5 < v4) {
                        com.dcinside.app.realm.c c0 = (com.dcinside.app.realm.c)t00.get(v5);
                        if(c0 == null || c0.Q5() != v3) {
                            ++v5;
                        }
                        else {
                            t00.y(v5, v2);
                            if(true) {
                                break;
                            }
                        }
                    }
                }
                f00.p();
                goto label_53;
            }
            catch(Throwable throwable1) {
            }
            if(f00.E0()) {
                f00.e();
            }
            throw throwable1;
            try {
            label_31:
                int v6 = list0.size();
                int v7 = 0;
                while(true) {
                    if(v7 >= v6) {
                        goto label_53;
                    }
                    long v8 = ((com.dcinside.app.realm.c)list0.get(v7)).Q5();
                    int v9 = t00.size();
                    int v10 = 0;
                    while(v10 < v9) {
                        com.dcinside.app.realm.c c1 = (com.dcinside.app.realm.c)t00.get(v10);
                        if(c1 == null || c1.Q5() != v8) {
                            ++v10;
                        }
                        else {
                            t00.y(v10, v7);
                            if(true) {
                                break;
                            }
                        }
                    }
                    ++v7;
                }
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
        label_53:
            kotlin.io.c.a(f00, null);
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public void onBindViewHolder(@l ViewHolder recyclerView$ViewHolder0, int v) {
            L.p(recyclerView$ViewHolder0, "holder");
            com.dcinside.app.realm.c c0 = this.w(v);
            String s = c0.R5();
            if(recyclerView$ViewHolder0 instanceof com.dcinside.app.archive.folder.g) {
                ((com.dcinside.app.archive.folder.g)recyclerView$ViewHolder0).p(c0.Q5());
                ((com.dcinside.app.archive.folder.g)recyclerView$ViewHolder0).a.setText(s);
                ((com.dcinside.app.archive.folder.g)recyclerView$ViewHolder0).a.setMaxWidth(0);
                ((com.dcinside.app.archive.folder.g)recyclerView$ViewHolder0).c.setVisibility(0);
                ((com.dcinside.app.archive.folder.g)recyclerView$ViewHolder0).b.setVisibility(4);
                List list0 = this.c;
                L.m(list0);
                if(list0.size() > 1) {
                    ((com.dcinside.app.archive.folder.g)recyclerView$ViewHolder0).d.setVisibility(0);
                    ((com.dcinside.app.archive.folder.g)recyclerView$ViewHolder0).e.setVisibility(0);
                    return;
                }
                ((com.dcinside.app.archive.folder.g)recyclerView$ViewHolder0).d.setVisibility(8);
                ((com.dcinside.app.archive.folder.g)recyclerView$ViewHolder0).e.setVisibility(8);
                return;
            }
            if(recyclerView$ViewHolder0 instanceof b) {
                ((b)recyclerView$ViewHolder0).f().setText(s);
                int v1 = u.s((this.a == null ? null : this.a.x4()), s);
                String s1 = Dl.a.format(((long)v1));
                ((b)recyclerView$ViewHolder0).e().setText(s1);
                ((b)recyclerView$ViewHolder0).f().setMaxWidth(-Dl.h(((b)recyclerView$ViewHolder0).e(), s1));
            }
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        @l
        public ViewHolder onCreateViewHolder(@l ViewGroup viewGroup0, int v) {
            L.p(viewGroup0, "parent");
            LayoutInflater layoutInflater0 = LayoutInflater.from(viewGroup0.getContext());
            switch(v) {
                case 0: {
                    View view1 = layoutInflater0.inflate(0x7F0E01D5, viewGroup0, false);  // layout:view_folder_select_item
                    L.m(view1);
                    return new b(view1);
                }
                case 1: {
                    View view2 = layoutInflater0.inflate(0x7F0E01D4, viewGroup0, false);  // layout:view_folder_archive_item
                    L.m(view2);
                    return new com.dcinside.app.archive.folder.g(view2);
                }
                default: {
                    View view0 = layoutInflater0.inflate(0x7F0E01D5, viewGroup0, false);  // layout:view_folder_select_item
                    L.m(view0);
                    return new b(view0);
                }
            }
        }

        @Override  // Z.b
        public void q(int v) {
        }

        @m
        public final g1 v() {
            return this.a;
        }

        @l
        public final com.dcinside.app.realm.c w(int v) {
            List list0 = this.c;
            L.m(list0);
            return (com.dcinside.app.realm.c)list0.get(v);
        }

        @m
        public final List x() {
            return this.c;
        }

        @m
        public final T0 y() {
            return this.b;
        }

        public final boolean z() {
            return this.d;
        }
    }

    @m
    private ItemTouchHelper A;
    private int B;
    @m
    private q0 C;
    @l
    public static final a D = null;
    @l
    public static final String E = "folderSelect";
    @l
    public static final String F = "folderManage";
    @l
    public static final String G = "archiveType";
    @l
    public static final String H = "selectedFolder";
    private p w;
    @m
    private T0 x;
    private boolean y;
    @m
    private o z;

    static {
        ArchiveFolderActivity.D = new a(null);
    }

    @Override  // io.realm.P0
    public void M(Object object0) {
        this.V1(((T0)object0));
    }

    public final void Q1(long v) {
        static final class d extends N implements Function1 {
            final long e;
            final ArchiveFolderActivity f;
            final q0 g;

            d(long v, ArchiveFolderActivity archiveFolderActivity0, q0 q00) {
                this.e = v;
                this.f = archiveFolderActivity0;
                this.g = q00;
                super(1);
            }

            public final void a(Long long0) {
                if(long0 != null && ((long)long0) == this.e) {
                    return;
                }
                F0 f00 = this.f.F1();
                if(f00 == null) {
                    return;
                }
                L.m(long0);
                com.dcinside.app.realm.d.f.i(f00, this.f.B, this.e, ((long)long0));
                Dl.J(this.g, 0x7F15027B);  // string:delete_folder_complete "폴더가 삭제되었습니다."
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Long)object0));
                return S0.a;
            }
        }

        q0 q00 = new q0(this, this.B);
        F0 f00 = this.F1();
        String s = null;
        com.dcinside.app.realm.c c0 = f00 == null ? null : com.dcinside.app.realm.d.f.b(f00, v);
        if(c0 != null) {
            s = c0.R5();
        }
        q00.setTitle(s);
        u.C(this, q00).x5((Object object0) -> {
            L.p(new d(v, this, q00), "$tmp0");
            new d(v, this, q00).invoke(object0);
        });
        this.C = q00;
    }

    // 检测为 Lambda 实现
    private static final void R1(Function1 function10, Object object0) [...]

    @m
    public final ItemTouchHelper S1() {
        return this.A;
    }

    private final void T1() {
        static final class e extends N implements Function1 {
            final ArchiveFolderActivity e;

            e(ArchiveFolderActivity archiveFolderActivity0) {
                this.e = archiveFolderActivity0;
                super(1);
            }

            public final void b(String s) {
                if(m0.a.a.i(s)) {
                    Dl.D(this.e, 0x7F1506E6);  // string:need_folder_name "폴더명을 입력하세요."
                    this.e.T1();
                    return;
                }
                F0 f00 = this.e.F1();
                if(f00 != null) {
                    com.dcinside.app.realm.d.a d$a0 = com.dcinside.app.realm.d.f;
                    L.m(s);
                    if(d$a0.f(f00, this.e.B, s)) {
                        Dl.D(this.e, 0x7F1502B6);  // string:exist_folder_name "이미 사용중인 폴더명입니다."
                        this.e.T1();
                        return;
                    }
                    d$a0.a(f00, this.e.B, s);
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.b(((String)object0));
                return S0.a;
            }
        }

        o o0 = this.z;
        if(o0 != null) {
            o0.l();
        }
        this.z = u.t(this, 0x7F150606).x5((Object object0) -> {
            L.p(new e(this), "$tmp0");
            new e(this).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final void U1(Function1 function10, Object object0) [...]

    public void V1(@l T0 t00) {
        L.p(t00, "archiveFolderChildren");
        p p0 = this.w;
        Adapter recyclerView$Adapter0 = null;
        if(p0 == null) {
            L.S("binding");
            p0 = null;
        }
        L.o(p0.b, "folderRecycler");
        Adapter recyclerView$Adapter1 = p0.b.getAdapter();
        if(recyclerView$Adapter1 instanceof c) {
            recyclerView$Adapter0 = recyclerView$Adapter1;
        }
        if(((c)recyclerView$Adapter0) != null) {
            F0 f00 = this.F1();
            L.m(f00);
            ((c)recyclerView$Adapter0).A(f00, t00);
        }
    }

    // 检测为 Lambda 实现
    private static final boolean W1(ArchiveFolderActivity archiveFolderActivity0, View view0, int v) [...]

    // 检测为 Lambda 实现
    private static final void X1(ArchiveFolderActivity archiveFolderActivity0, View view0) [...]

    private final boolean Y1(int v) {
        if(this.y) {
            return false;
        }
        p p0 = this.w;
        Adapter recyclerView$Adapter0 = null;
        if(p0 == null) {
            L.S("binding");
            p0 = null;
        }
        L.o(p0.b, "folderRecycler");
        Adapter recyclerView$Adapter1 = p0.b.getAdapter();
        if(recyclerView$Adapter1 instanceof c) {
            recyclerView$Adapter0 = recyclerView$Adapter1;
        }
        if(((c)recyclerView$Adapter0) != null) {
            com.dcinside.app.realm.c c0 = ((c)recyclerView$Adapter0).w(v);
            if(c0 != null) {
                Intent intent0 = this.getIntent();
                intent0.putExtra("selectedFolder", c0.Q5());
                this.setResult(-1, intent0);
                this.finish();
                return true;
            }
        }
        return false;
    }

    @n
    public static final void Z1(@l AppCompatActivity appCompatActivity0, @l String s, int v) {
        ArchiveFolderActivity.D.a(appCompatActivity0, s, v);
    }

    @Override  // com.dcinside.app.base.d
    protected void onActivityResult(int v, int v1, @m Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        if(-1 != v1) {
            return;
        }
        if(v == 0x3F9) {
            long v2 = 0L;
            q0 q00 = this.C;
            if(q00 != null) {
                if(intent0 != null) {
                    v2 = intent0.getLongExtra("selectedFolder", 0L);
                }
                q00.setFolderKey(v2);
            }
        }
    }

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        g1 g10;
        super.onCreate(bundle0);
        p p0 = p.c(this.getLayoutInflater());
        L.o(p0, "inflate(...)");
        this.w = p0;
        Adapter recyclerView$Adapter0 = null;
        if(p0 == null) {
            L.S("binding");
            p0 = null;
        }
        this.setContentView(p0.b());
        p p1 = this.w;
        if(p1 == null) {
            L.S("binding");
            p1 = null;
        }
        this.S0(p1.c);
        kr.bhbfhfb.designcompat.a.d(this);
        Intent intent0 = this.getIntent();
        this.B = intent0.getIntExtra("archiveType", 0);
        F0 f00 = this.F1();
        if(f00 == null) {
            g10 = null;
        }
        else if(this.B == 0) {
            RealmQuery realmQuery0 = f00.C4(d0.class);
            L.o(realmQuery0, "this.where(T::class.java)");
            g10 = realmQuery0.p0();
        }
        else {
            RealmQuery realmQuery1 = f00.C4(A0.class);
            L.o(realmQuery1, "this.where(T::class.java)");
            g10 = realmQuery1.p0();
        }
        p p2 = this.w;
        if(p2 == null) {
            L.S("binding");
            p2 = null;
        }
        c archiveFolderActivity$c0 = new c(g10);
        NonPredictiveLayoutManager nonPredictiveLayoutManager0 = new NonPredictiveLayoutManager();
        p2.b.setLayoutManager(nonPredictiveLayoutManager0);
        p2.b.setAdapter(archiveFolderActivity$c0);
        ItemTouchHelper itemTouchHelper0 = new ItemTouchHelper(new Z.c(archiveFolderActivity$c0, false));
        itemTouchHelper0.m(p2.b);
        this.A = itemTouchHelper0;
        com.dcinside.app.util.ql.b.d(p2.b);
        com.dcinside.app.archive.folder.d d0 = (View view0, int v) -> {
            L.p(this, "this$0");
            return this.Y1(v);
        };
        com.dcinside.app.util.ql.b.e(p2.b, d0);
        if(f00 != null) {
            T0 t00 = com.dcinside.app.realm.d.f.c(f00, this.B).S5();
            t00.j(this);
            this.V1(t00);
            this.x = t00;
        }
        String s = intent0.getAction();
        if(s != null) {
            this.y = m0.a.a.d(s, "folderManage");
            p p3 = this.w;
            if(p3 == null) {
                L.S("binding");
                p3 = null;
            }
            L.o(p3.b, "folderRecycler");
            Adapter recyclerView$Adapter1 = p3.b.getAdapter();
            if(recyclerView$Adapter1 instanceof c) {
                recyclerView$Adapter0 = recyclerView$Adapter1;
            }
            if(((c)recyclerView$Adapter0) != null) {
                ((c)recyclerView$Adapter0).E(this.y);
            }
            kr.bhbfhfb.designcompat.a.g(this, (this.y ? 0x7F150607 : 0x7F150932));  // string:manage_folder_title "폴더 편집"
        }
    }

    @Override  // android.app.Activity
    public boolean onCreateOptionsMenu(@m Menu menu0) {
        this.getMenuInflater().inflate(0x7F10000E, menu0);  // mipmap:ic_launcher18
        Button button0 = null;
        MenuItem menuItem0 = menu0 == null ? null : menu0.findItem(0x7F0B006A);  // id:action_new_folder
        if(menuItem0 != null) {
            View view0 = menuItem0.getActionView();
            Button button1 = view0 == null ? null : ((Button)view0.findViewById(0x7F0B0823));  // id:menu_new_folder
            if(button1 instanceof Button) {
                button0 = button1;
            }
            if(button0 != null) {
                button0.setOnClickListener((View view0) -> {
                    L.p(this, "this$0");
                    this.T1();
                });
            }
        }
        return super.onCreateOptionsMenu(menu0);
    }

    @Override  // com.dcinside.app.base.g
    protected void onDestroy() {
        super.onDestroy();
        o o0 = this.z;
        if(o0 != null) {
            o0.l();
        }
        T0 t00 = this.x;
        if(t00 != null) {
            if(!t00.s()) {
                t00 = null;
            }
            if(t00 != null) {
                t00.z();
            }
        }
        this.x = null;
        this.A = null;
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        if(menuItem0.getItemId() == 0x102002C) {
            this.onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }
}

