package com.dcinside.app.bookmark;

import Y.o0;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.dcinside.app.perform.e;
import com.dcinside.app.settings.c.a;
import com.dcinside.app.settings.c;
import com.dcinside.app.util.Xk;
import com.dcinside.app.util.dl;
import com.dcinside.app.view.tool.NonPredictiveLayoutManager;
import io.realm.N0;
import java.util.ArrayList;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import rx.o;
import rx.subscriptions.f;
import y4.l;
import y4.m;

@s0({"SMAP\nBookmarkSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BookmarkSettingActivity.kt\ncom/dcinside/app/bookmark/BookmarkSettingActivity\n+ 2 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,193:1\n25#2:194\n25#2:195\n25#2:196\n*S KotlinDebug\n*F\n+ 1 BookmarkSettingActivity.kt\ncom/dcinside/app/bookmark/BookmarkSettingActivity\n*L\n131#1:194\n153#1:195\n166#1:196\n*E\n"})
public final class BookmarkSettingActivity extends c implements K {
    private o A;
    private o B;
    @m
    private N0 C;
    @m
    private v D;
    @m
    private h E;
    private o0 F;
    @m
    private ItemTouchHelper z;

    public BookmarkSettingActivity() {
        super(null, 1, null);
        this.A = f.e();
        this.B = f.e();
    }

    @Override  // com.dcinside.app.settings.c
    public boolean R1() {
        return true;
    }

    @Override  // com.dcinside.app.settings.c
    @l
    public a T1() {
        ArrayList arrayList0 = new ArrayList(0);
        o0 o00 = this.F;
        if(o00 == null) {
            L.S("binding");
            o00 = null;
        }
        L.o(o00.e, "favoriteSettingOrderRecycler");
        Adapter recyclerView$Adapter0 = o00.e.getAdapter();
        if(!(recyclerView$Adapter0 instanceof com.dcinside.app.bookmark.a)) {
            recyclerView$Adapter0 = null;
        }
        if(((com.dcinside.app.bookmark.a)recyclerView$Adapter0) != null) {
            arrayList0.addAll(((com.dcinside.app.bookmark.a)recyclerView$Adapter0).v());
        }
        o0 o01 = this.F;
        if(o01 == null) {
            L.S("binding");
            throw new NullPointerException();
        }
        return new h(o01.b.getSelectedItem().toString(), arrayList0);
    }

    @Override  // com.dcinside.app.settings.c
    @l
    public a V1() {
        a c$a0 = this.E;
        L.m(c$a0);
        return c$a0;
    }

    private final void Y1() {
        public static final class d implements J {
            final BookmarkSettingActivity a;

            d(BookmarkSettingActivity bookmarkSettingActivity0) {
                this.a = bookmarkSettingActivity0;
                super();
            }

            @Override  // com.dcinside.app.bookmark.J
            public void a(boolean z) {
                if(z) {
                    ActivityCompat.c(this.a);
                    Xk.h(this.a, null, null, 6, null);
                }
            }
        }

        o0 o00 = this.F;
        o0 o01 = null;
        if(o00 == null) {
            L.S("binding");
            o00 = null;
        }
        L.o(o00.e, "favoriteSettingOrderRecycler");
        Adapter recyclerView$Adapter0 = o00.e.getAdapter();
        if(!(recyclerView$Adapter0 instanceof com.dcinside.app.bookmark.a)) {
            recyclerView$Adapter0 = null;
        }
        if(((com.dcinside.app.bookmark.a)recyclerView$Adapter0) == null) {
            return;
        }
        dl dl0 = dl.a;
        o0 o02 = this.F;
        if(o02 == null) {
            L.S("binding");
        }
        else {
            o01 = o02;
        }
        dl0.T3(Integer.parseInt(o01.b.getSelectedItem().toString()));
        v v0 = this.D;
        if(v0 != null) {
            v0.I(((com.dcinside.app.bookmark.a)recyclerView$Adapter0).v(), new d(this));
        }
    }

    @m
    public final ItemTouchHelper h2() {
        return this.z;
    }

    private final void i2() {
        static final class com.dcinside.app.bookmark.BookmarkSettingActivity.a extends N implements Function1 {
            public static final com.dcinside.app.bookmark.BookmarkSettingActivity.a e;

            static {
                com.dcinside.app.bookmark.BookmarkSettingActivity.a.e = new com.dcinside.app.bookmark.BookmarkSettingActivity.a();
            }

            com.dcinside.app.bookmark.BookmarkSettingActivity.a() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.m(0x7F15095B);  // string:setting_apply_warn "변경 사항 중 재시작이 필요한 설정이 있습니다. 저장을 누르면 자동으로 앱이 재시작됩니다. 재시작하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class b extends N implements Function1 {
            public static final b e;

            static {
                b.e = new b();
            }

            b() {
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


        static final class com.dcinside.app.bookmark.BookmarkSettingActivity.c extends N implements Function1 {
            final BookmarkSettingActivity e;

            com.dcinside.app.bookmark.BookmarkSettingActivity.c(BookmarkSettingActivity bookmarkSettingActivity0) {
                this.e = bookmarkSettingActivity0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                this.e.Y1();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        e.e.a(this).n(com.dcinside.app.bookmark.BookmarkSettingActivity.a.e).z(0x7F1508E1).x(0x1040000).b().Z1((Object object0) -> {
            L.p(b.e, "$tmp0");
            return (Boolean)b.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new com.dcinside.app.bookmark.BookmarkSettingActivity.c(this), "$tmp0");
            new com.dcinside.app.bookmark.BookmarkSettingActivity.c(this).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean j2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void k2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void l2(BookmarkSettingActivity bookmarkSettingActivity0) [...]

    // 检测为 Lambda 实现
    private static final void m2(BookmarkSettingActivity bookmarkSettingActivity0, MenuItem menuItem0, View view0) [...]

    @Override  // com.dcinside.app.bookmark.K
    public void n(@l v v0, int v1, @m List list0) {
        L.p(v0, "favoriteBasket");
        o0 o00 = this.F;
        o0 o01 = null;
        if(o00 == null) {
            L.S("binding");
            o00 = null;
        }
        L.o(o00.e, "favoriteSettingOrderRecycler");
        Adapter recyclerView$Adapter0 = o00.e.getAdapter();
        if(!(recyclerView$Adapter0 instanceof com.dcinside.app.bookmark.a)) {
            recyclerView$Adapter0 = null;
        }
        if(((com.dcinside.app.bookmark.a)recyclerView$Adapter0) == null) {
            return;
        }
        switch(v1) {
            case 0: {
                o0 o02 = this.F;
                if(o02 == null) {
                    L.S("binding");
                    o02 = null;
                }
                k0.d d0 = k0.d.g(v0.x());
                o02.f.e(d0);
                o0 o03 = this.F;
                if(o03 == null) {
                    L.S("binding");
                }
                else {
                    o01 = o03;
                }
                o01.e.suppressLayout(false);
                ((com.dcinside.app.bookmark.a)recyclerView$Adapter0).y(u.H());
                return;
            }
            case 1: {
                o0 o04 = this.F;
                if(o04 == null) {
                    L.S("binding");
                    o04 = null;
                }
                k0.d d1 = k0.d.e();
                o04.f.e(d1);
                o0 o05 = this.F;
                if(o05 == null) {
                    L.S("binding");
                }
                else {
                    o01 = o05;
                }
                o01.e.suppressLayout(true);
                ((com.dcinside.app.bookmark.a)recyclerView$Adapter0).y(u.H());
                return;
            }
            case 2: {
                o0 o06 = this.F;
                if(o06 == null) {
                    L.S("binding");
                    o06 = null;
                }
                k0.d d2 = k0.d.a();
                o06.f.e(d2);
                o0 o07 = this.F;
                if(o07 == null) {
                    L.S("binding");
                }
                else {
                    o01 = o07;
                }
                o01.e.suppressLayout(false);
                ArrayList arrayList0 = new ArrayList();
                if(list0 != null) {
                    for(Object object0: list0) {
                        com.dcinside.app.realm.m m0 = new com.dcinside.app.realm.m();
                        m0.V5(((com.dcinside.app.realm.m)object0).R5());
                        m0.W5(((com.dcinside.app.realm.m)object0).S5());
                        m0.X5(((com.dcinside.app.realm.m)object0).T5());
                        arrayList0.add(m0);
                    }
                }
                ((com.dcinside.app.bookmark.a)recyclerView$Adapter0).y(arrayList0);
            }
        }
    }

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        o0 o00 = o0.c(this.getLayoutInflater());
        L.o(o00, "inflate(...)");
        this.F = o00;
        o0 o01 = null;
        if(o00 == null) {
            L.S("binding");
            o00 = null;
        }
        this.setContentView(o00.b());
        o0 o02 = this.F;
        if(o02 == null) {
            L.S("binding");
            o02 = null;
        }
        this.S0(o02.g);
        kr.bhbfhfb.designcompat.a.d(this);
        ArrayList arrayList0 = new ArrayList();
        for(int v = 5; v < 16; ++v) {
            arrayList0.add(String.valueOf(v));
        }
        o0 o03 = this.F;
        if(o03 == null) {
            L.S("binding");
            o03 = null;
        }
        ArrayAdapter arrayAdapter0 = new ArrayAdapter(this, 0x7F0E0285, arrayList0);  // layout:view_spinner_item
        o03.b.setAdapter(arrayAdapter0);
        o0 o04 = this.F;
        if(o04 == null) {
            L.S("binding");
            o04 = null;
        }
        int v1 = arrayList0.indexOf(String.valueOf(dl.a.b0()));
        o04.b.setSelection(v1);
        com.dcinside.app.bookmark.a a0 = new com.dcinside.app.bookmark.a();
        o0 o05 = this.F;
        if(o05 == null) {
            L.S("binding");
            o05 = null;
        }
        NonPredictiveLayoutManager nonPredictiveLayoutManager0 = new NonPredictiveLayoutManager();
        o05.e.setLayoutManager(nonPredictiveLayoutManager0);
        o0 o06 = this.F;
        if(o06 == null) {
            L.S("binding");
            o06 = null;
        }
        com.dcinside.app.util.ql.b.d(o06.e);
        o0 o07 = this.F;
        if(o07 == null) {
            L.S("binding");
            o07 = null;
        }
        o07.e.setAdapter(a0);
        ItemTouchHelper itemTouchHelper0 = new ItemTouchHelper(new Z.c(a0, false));
        this.z = itemTouchHelper0;
        o0 o08 = this.F;
        if(o08 == null) {
            L.S("binding");
            o08 = null;
        }
        itemTouchHelper0.m(o08.e);
        this.D = new v(this.F1(), this);
        o0 o09 = this.F;
        if(o09 == null) {
            L.S("binding");
        }
        else {
            o01 = o09;
        }
        com.dcinside.app.bookmark.e e0 = () -> {
            L.p(this, "this$0");
            v v0 = this.D;
            L.m(v0);
            v0.E(null);
        };
        o01.f.setOnRetryListener(e0);
        a c$a0 = this.T1();
        L.n(c$a0, "null cannot be cast to non-null type com.dcinside.app.bookmark.BookmarkSettingInitial");
        this.E = (h)c$a0;
    }

    @Override  // android.app.Activity
    public boolean onCreateOptionsMenu(@l Menu menu0) {
        L.p(menu0, "menu");
        this.getMenuInflater().inflate(0x7F100016, menu0);  // mipmap:ic_launcher25
        return super.onCreateOptionsMenu(menu0);
    }

    @Override  // com.dcinside.app.settings.c
    protected void onDestroy() {
        super.onDestroy();
        v v0 = this.D;
        if(v0 != null) {
            L.m(v0);
            v0.release();
            this.D = null;
        }
        o o0 = this.A;
        if(o0 != null) {
            L.m(o0);
            o0.l();
            this.A = null;
        }
        o o1 = this.B;
        if(o1 != null) {
            L.m(o1);
            o1.l();
            this.B = null;
        }
        N0 n00 = this.C;
        if(n00 != null) {
            L.m(n00);
            n00.cancel();
            this.C = null;
        }
        this.z = null;
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        switch(menuItem0.getItemId()) {
            case 0x102002C: {
                this.onBackPressed();
                return true;
            }
            case 0x7F0B0070: {  // id:action_save
                this.i2();
                return true;
            }
            default: {
                return super.onOptionsItemSelected(menuItem0);
            }
        }
    }

    @Override  // com.dcinside.app.base.d
    public boolean onPrepareOptionsMenu(@m Menu menu0) {
        Button button0 = null;
        MenuItem menuItem0 = menu0 == null ? null : menu0.findItem(0x7F0B0070);  // id:action_save
        if(menuItem0 != null) {
            View view0 = menuItem0.getActionView();
            if(view0 != null) {
                button0 = (Button)view0.findViewById(0x7F0B082E);  // id:menu_save
            }
            if(button0 != null) {
                button0.setOnClickListener((View view0) -> {
                    L.p(this, "this$0");
                    this.onOptionsItemSelected(menuItem0);
                });
            }
        }
        return super.onPrepareOptionsMenu(menu0);
    }
}

