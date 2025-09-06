package com.dcinside.app.archive.search;

import A3.p;
import Y.e;
import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.viewpager.widget.ViewPager;
import com.codewaves.stickyheadergrid.StickyHeaderGridLayoutManager;
import com.dcinside.app.archive.main.h;
import com.dcinside.app.base.g;
import com.dcinside.app.internal.r;
import com.dcinside.app.internal.s;
import com.dcinside.app.realm.u0;
import com.dcinside.app.recent.s.b;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Nk;
import com.dcinside.app.util.ll;
import com.dcinside.app.view.ClearableEditText.a;
import com.dcinside.app.view.ClearableEditText;
import com.google.android.material.tabs.TabLayout.f;
import com.google.android.material.tabs.TabLayout.i;
import com.google.android.material.tabs.TabLayout;
import io.realm.F0;
import io.realm.W;
import io.realm.g1;
import io.realm.r1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.T;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.io.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import kotlin.ranges.l;
import kotlin.text.v;
import kotlinx.coroutines.O;
import y4.m;

@s0({"SMAP\nArchiveSearchActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchiveSearchActivity.kt\ncom/dcinside/app/archive/search/ArchiveSearchActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n+ 4 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,220:1\n1#2:221\n1#2:226\n25#3:222\n112#4,3:223\n129#4,15:227\n116#4:242\n129#4,15:243\n1557#5:258\n1628#5,3:259\n1863#5,2:262\n*S KotlinDebug\n*F\n+ 1 ArchiveSearchActivity.kt\ncom/dcinside/app/archive/search/ArchiveSearchActivity\n*L\n188#1:226\n164#1:222\n188#1:223,3\n188#1:227,15\n188#1:242\n188#1:243,15\n193#1:258\n193#1:259,3\n193#1:262,2\n*E\n"})
public final class ArchiveSearchActivity extends g implements b, a {
    private e w;
    private boolean x;
    @m
    private g1 y;

    // 检测为 Lambda 实现
    private static final boolean O1(ArchiveSearchActivity archiveSearchActivity0, TextView textView0, int v, KeyEvent keyEvent0) [...]

    @Override  // com.dcinside.app.recent.s$b
    public void P(@m u0 u00) {
        if(u00 != null) {
            String s = u00.T5();
            if(s != null) {
                e e0 = this.w;
                if(e0 == null) {
                    L.S("binding");
                    e0 = null;
                }
                e0.g.setText(s);
                Editable editable0 = e0.g.getText();
                int v = editable0 == null ? 0 : editable0.length();
                e0.g.setSelection(v);
                this.Q1(s);
            }
        }
    }

    // 检测为 Lambda 实现
    private final void P1(g1 g10) [...]

    private final void Q1(String s) {
        if(m0.a.a.h(s)) {
            Dl.D(this, 0x7F1506ED);  // string:need_search_keyword_length "검색어를 입력해 주세요."
            this.z();
            return;
        }
        e e0 = this.w;
        e e1 = null;
        if(e0 == null) {
            L.S("binding");
            e0 = null;
        }
        ClearableEditText clearableEditText0 = e0.g;
        if(clearableEditText0.isFocused()) {
            Nk.a.c(clearableEditText0);
        }
        e e2 = this.w;
        if(e2 == null) {
            L.S("binding");
            e2 = null;
        }
        TabLayout tabLayout0 = e2.h;
        L.o(tabLayout0, "postArchiveTab");
        e e3 = this.w;
        if(e3 == null) {
            L.S("binding");
            e3 = null;
        }
        L.o(e3.f, "postArchiveSearchDropdown");
        int v = Math.max(0, e3.f.getSelectedItemPosition());
        SpinnerAdapter spinnerAdapter0 = e3.f.getAdapter();
        int v1 = Math.min(v, (spinnerAdapter0 == null ? 0 : spinnerAdapter0.getCount()));
        FragmentManager fragmentManager0 = this.getSupportFragmentManager();
        L.o(fragmentManager0, "getSupportFragmentManager(...)");
        if(!fragmentManager0.d1() && !fragmentManager0.V0()) {
            e e4 = this.w;
            if(e4 == null) {
                L.S("binding");
                e4 = null;
            }
            ViewPager viewPager0 = e4.b;
            L.o(viewPager0, "postArchivePager");
            if(v1 == 2) {
                viewPager0.S(1, false);
            }
            F0 f00 = F0.g4();
            L.m(f00);
            if(f00.E0()) {
                u0 u00 = (u0)f00.t2(u0.i.a(2, s), new W[0]);
            }
            else {
                f00.beginTransaction();
                goto label_43;
            }
            goto label_55;
            try {
            label_43:
                u0 u01 = (u0)f00.t2(u0.i.a(2, s), new W[0]);
                f00.p();
                goto label_55;
            }
            catch(Throwable throwable1) {
                try {
                    if(f00.E0()) {
                        f00.e();
                    }
                    throw throwable1;
                }
                catch(Throwable throwable0) {
                }
            }
            try {
                throw throwable0;
            }
            catch(Throwable throwable2) {
                c.a(f00, throwable0);
                throw throwable2;
            }
        label_55:
            c.a(f00, null);
            l l0 = new l(0, 1);
            ArrayList arrayList0 = new ArrayList(u.b0(l0, 10));
            Iterator iterator0 = l0.iterator();
            while(iterator0.hasNext()) {
                int v2 = ((T)iterator0).b();
                arrayList0.add(r0.a(v2, s.l(viewPager0, v2)));
            }
            for(Object object0: arrayList0) {
                int v3 = ((Number)((V)object0).a()).intValue();
                Fragment fragment0 = fragmentManager0.s0(((String)((V)object0).b()));
                com.dcinside.app.archive.page.e e5 = fragment0 instanceof com.dcinside.app.archive.page.e ? ((com.dcinside.app.archive.page.e)fragment0) : null;
                int v4 = e5 == null ? 0 : e5.P0(s, v1);
                i tabLayout$i0 = tabLayout0.D(v3);
                if(tabLayout$i0 != null) {
                    tabLayout$i0.D((v3 == 0 ? this.getString(0x7F1500F6, new Object[]{v4}) : this.getString(0x7F1500F7, new Object[]{v4})));  // string:archive_tab_search_post "게시물(%1$d)"
                }
            }
            e e6 = this.w;
            if(e6 == null) {
                L.S("binding");
            }
            else {
                e1 = e6;
            }
            e1.c.setVisibility(8);
        }
    }

    @Override  // com.dcinside.app.base.d
    public void onBackPressed() {
        FragmentManager fragmentManager0 = this.getSupportFragmentManager();
        L.o(fragmentManager0, "getSupportFragmentManager(...)");
        e e0 = this.w;
        if(e0 == null) {
            L.S("binding");
            e0 = null;
        }
        L.m(e0.b);
        Fragment fragment0 = fragmentManager0.s0(s.l(e0.b, e0.b.getCurrentItem()));
        if(fragment0 instanceof com.dcinside.app.archive.page.e) {
            switch(((com.dcinside.app.archive.page.e)fragment0).A0()) {
                case 0: {
                    super.onBackPressed();
                    return;
                }
                case 2: {
                    ((com.dcinside.app.archive.page.e)fragment0).K0();
                    return;
                }
                default: {
                    ((com.dcinside.app.archive.page.e)fragment0).G0();
                    return;
                }
            }
        }
        super.onBackPressed();
    }

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        public static final class com.dcinside.app.archive.search.ArchiveSearchActivity.a implements f {
            @Override  // com.google.android.material.tabs.TabLayout$c
            public void N(@y4.l i tabLayout$i0) {
                L.p(tabLayout$i0, "tab");
            }

            @Override  // com.google.android.material.tabs.TabLayout$c
            public void R(@y4.l i tabLayout$i0) {
                L.p(tabLayout$i0, "tab");
            }

            @Override  // com.google.android.material.tabs.TabLayout$c
            public void j(@y4.l i tabLayout$i0) {
                L.p(tabLayout$i0, "tab");
                ll.g0(tabLayout$i0.k());
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.archive.search.ArchiveSearchActivity$onCreate$3", f = "ArchiveSearchActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.archive.search.ArchiveSearchActivity.b extends o implements p {
            int k;
            final ArchiveSearchActivity l;

            com.dcinside.app.archive.search.ArchiveSearchActivity.b(ArchiveSearchActivity archiveSearchActivity0, d d0) {
                this.l = archiveSearchActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@y4.l O o0, @y4.l View view0, @m d d0) {
                return new com.dcinside.app.archive.search.ArchiveSearchActivity.b(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@y4.l Object object0) {
                String s1;
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                ArchiveSearchActivity archiveSearchActivity0 = this.l;
                e e0 = archiveSearchActivity0.w;
                if(e0 == null) {
                    L.S("binding");
                    e0 = null;
                }
                Editable editable0 = e0.g.getText();
                if(editable0 == null) {
                    s1 = "";
                }
                else {
                    String s = editable0.toString();
                    if(s == null) {
                        s1 = "";
                    }
                    else {
                        s1 = v.G5(s).toString();
                        if(s1 == null) {
                            s1 = "";
                        }
                    }
                }
                archiveSearchActivity0.Q1(s1);
                return S0.a;
            }
        }

        super.onCreate(bundle0);
        e e0 = e.c(this.getLayoutInflater());
        L.o(e0, "inflate(...)");
        this.w = e0;
        e e1 = null;
        if(e0 == null) {
            L.S("binding");
            e0 = null;
        }
        this.setContentView(e0.b());
        e e2 = this.w;
        if(e2 == null) {
            L.S("binding");
            e2 = null;
        }
        this.S0(e2.j);
        kr.bhbfhfb.designcompat.a.d(this);
        e e3 = this.w;
        if(e3 == null) {
            L.S("binding");
            e3 = null;
        }
        FragmentManager fragmentManager0 = this.getSupportFragmentManager();
        L.o(fragmentManager0, "getSupportFragmentManager(...)");
        h h0 = new h(fragmentManager0, true);
        e3.b.setAdapter(h0);
        e e4 = this.w;
        if(e4 == null) {
            L.S("binding");
            e4 = null;
        }
        TabLayout tabLayout0 = e4.h;
        e e5 = this.w;
        if(e5 == null) {
            L.S("binding");
            e5 = null;
        }
        tabLayout0.setupWithViewPager(e5.b);
        e e6 = this.w;
        if(e6 == null) {
            L.S("binding");
            e6 = null;
        }
        com.dcinside.app.archive.search.ArchiveSearchActivity.a archiveSearchActivity$a0 = new com.dcinside.app.archive.search.ArchiveSearchActivity.a();
        e6.h.h(archiveSearchActivity$a0);
        e e7 = this.w;
        if(e7 == null) {
            L.S("binding");
            e7 = null;
        }
        int v = ll.m();
        e7.b.setCurrentItem(v);
        e e8 = this.w;
        if(e8 == null) {
            L.S("binding");
            e8 = null;
        }
        e8.g.setOnClearListener(this);
        e e9 = this.w;
        if(e9 == null) {
            L.S("binding");
            e9 = null;
        }
        com.dcinside.app.archive.search.a a0 = (TextView textView0, int v, KeyEvent keyEvent0) -> {
            String s1;
            L.p(this, "this$0");
            if(3 == v) {
                if(textView0 == null) {
                    s1 = "";
                }
                else {
                    CharSequence charSequence0 = textView0.getText();
                    if(charSequence0 == null) {
                        s1 = "";
                    }
                    else {
                        String s = charSequence0.toString();
                        if(s == null) {
                            s1 = "";
                        }
                        else {
                            s1 = v.G5(s).toString();
                            if(s1 == null) {
                                s1 = "";
                            }
                        }
                    }
                }
                this.Q1(s1);
                return true;
            }
            return false;
        };
        e9.g.setOnEditorActionListener(a0);
        e e10 = this.w;
        if(e10 == null) {
            L.S("binding");
            e10 = null;
        }
        L.o(e10.e, "postArchiveSearchConfirm");
        com.dcinside.app.archive.search.ArchiveSearchActivity.b archiveSearchActivity$b0 = new com.dcinside.app.archive.search.ArchiveSearchActivity.b(this, null);
        r.M(e10.e, null, archiveSearchActivity$b0, 1, null);
        String[] arr_s = this.getResources().getStringArray(0x7F030000);  // array:archive_search_type
        L.o(arr_s, "getStringArray(...)");
        e e11 = this.w;
        if(e11 == null) {
            L.S("binding");
            e11 = null;
        }
        ArrayAdapter arrayAdapter0 = new ArrayAdapter(this, 0x7F0E019B, arr_s);  // layout:view_archive_spinner_item
        e11.f.setAdapter(arrayAdapter0);
        e e12 = this.w;
        if(e12 == null) {
            L.S("binding");
        }
        else {
            e1 = e12;
        }
        StickyHeaderGridLayoutManager stickyHeaderGridLayoutManager0 = new StickyHeaderGridLayoutManager(1);
        stickyHeaderGridLayoutManager0.m3(0);
        e1.c.setLayoutManager(stickyHeaderGridLayoutManager0);
        e1.c.setVisibility(0);
        com.dcinside.app.recent.s s0 = new com.dcinside.app.recent.s(2, this);
        e1.c.setAdapter(s0);
        F0 f00 = this.F1();
        L.m(f00);
        g1 g10 = f00.C4(u0.class).f0("type", 2).g2("time", r1.c).q0();
        this.y = g10;
        if(g10 != null) {
            g10.l((g1 g10) -> {
                e e0 = this.w;
                Adapter recyclerView$Adapter0 = null;
                if(e0 == null) {
                    L.S("binding");
                    e0 = null;
                }
                L.o(e0.c, "postArchiveRecent");
                Adapter recyclerView$Adapter1 = e0.c.getAdapter();
                if(recyclerView$Adapter1 instanceof com.dcinside.app.recent.s) {
                    recyclerView$Adapter0 = recyclerView$Adapter1;
                }
                if(((com.dcinside.app.recent.s)recyclerView$Adapter0) == null) {
                    return;
                }
                ((com.dcinside.app.recent.s)recyclerView$Adapter0).u0(g10.h().g2(g10));
            });
        }
    }

    @Override  // com.dcinside.app.base.g
    protected void onDestroy() {
        super.onDestroy();
        g1 g10 = this.y;
        if(g10 != null) {
            if(!g10.s()) {
                g10 = null;
            }
            if(g10 != null) {
                g10.D();
            }
        }
        this.y = null;
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

    @Override  // androidx.fragment.app.FragmentActivity
    protected void onPause() {
        super.onPause();
        e e0 = this.w;
        e e1 = null;
        if(e0 == null) {
            L.S("binding");
            e0 = null;
        }
        if(e0.g.isFocused()) {
            com.dcinside.app.util.Nk.a nk$a0 = Nk.a;
            e e2 = this.w;
            if(e2 == null) {
                L.S("binding");
            }
            else {
                e1 = e2;
            }
            nk$a0.c(e1.g);
        }
    }

    @Override  // com.dcinside.app.base.d
    protected void onResume() {
        super.onResume();
        if(this.x) {
            this.x = false;
            com.dcinside.app.util.Nk.a nk$a0 = Nk.a;
            e e0 = this.w;
            if(e0 == null) {
                L.S("binding");
                e0 = null;
            }
            nk$a0.f(e0.g);
        }
    }

    @Override  // com.dcinside.app.view.ClearableEditText$a
    public void z() {
        e e0 = this.w;
        e e1 = null;
        if(e0 == null) {
            L.S("binding");
            e0 = null;
        }
        e0.i.setExpanded(true);
        e e2 = this.w;
        if(e2 == null) {
            L.S("binding");
        }
        else {
            e1 = e2;
        }
        e1.c.setVisibility(0);
    }
}

