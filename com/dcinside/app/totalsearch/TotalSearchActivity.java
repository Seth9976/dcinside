package com.dcinside.app.totalsearch;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.codewaves.stickyheadergrid.StickyHeaderGridLayoutManager;
import com.dcinside.app.base.g;
import com.dcinside.app.gallery.info.MinorMoreActivity;
import com.dcinside.app.internal.s;
import com.dcinside.app.read.H;
import com.dcinside.app.realm.u0;
import com.dcinside.app.recent.s.b;
import com.dcinside.app.totalsearch.gallery.t;
import com.dcinside.app.totalsearch.gallery.w;
import com.dcinside.app.totalsearch.move.MoveGalleryActivity;
import com.dcinside.app.type.m;
import com.dcinside.app.util.Clipboards;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Nk;
import com.dcinside.app.view.ClearableEditText.a;
import com.dcinside.app.view.ClearableEditText;
import com.google.android.material.appbar.AppBarLayout.Behavior;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout.f;
import com.google.android.material.tabs.TabLayout.i;
import com.google.android.material.tabs.TabLayout.n;
import com.google.android.material.tabs.TabLayout;
import io.realm.F0;
import io.realm.W;
import io.realm.g1;
import io.realm.r1;
import kotlin.S0;
import kotlin.q0;
import l0.c;
import l0.d;

public class TotalSearchActivity extends g implements b, a, f {
    private CoordinatorLayout A;
    private AppBarLayout B;
    private RecyclerView C;
    private RecyclerView D;
    private View E;
    private View F;
    private d G;
    private String H;
    private t I;
    private g1 J;
    private boolean K;
    private H L;
    private final rx.subscriptions.b M;
    private static final String N = "searchText";
    private static final String O = "totalSearchDirectVideoTag";
    private View w;
    private ClearableEditText x;
    private TabLayout y;
    private ViewPager2 z;

    public TotalSearchActivity() {
        this.K = false;
        this.M = new rx.subscriptions.b();
    }

    private void A2(CharSequence charSequence0) {
        t t0 = this.I;
        if(t0 == null) {
            return;
        }
        if(m0.a.i(charSequence0)) {
            this.z();
            t0.i();
            return;
        }
        String s = charSequence0.toString();
        rx.g g0 = t0.f(s, null);
        if(g0 == null) {
            return;
        }
        View view0 = this.findViewById(0x7F0B0FAC);  // id:total_search_auto_progress
        t0.n(g0.R1(() -> view0.setVisibility(0)).T1(() -> view0.setVisibility(8)).y5((w w0) -> {
            t0.p(w0);
            t0.o(!s.isEmpty());
        }, (Throwable throwable0) -> {
            timber.log.b.B(throwable0);
            t0.m(throwable0);
        }));
    }

    // 检测为 Lambda 实现
    private S0 B2(boolean z) [...]

    public static void C2(Context context0, @Nullable String s, boolean z) {
        Intent intent0 = new Intent(context0, TotalSearchActivity.class);
        if(s != null) {
            intent0.putExtra("searchText", s);
        }
        intent0.putExtra("totalSearchDirectVideoTag", z);
        context0.startActivity(intent0);
    }

    protected void D2(String s) {
        if(m0.a.h(s)) {
            Dl.D(this, 0x7F1506ED);  // string:need_search_keyword_length "검색어를 입력해 주세요."
            this.z();
            return;
        }
        t t0 = this.I;
        if(t0 != null) {
            t0.i();
        }
        Clipboards clipboards0 = Clipboards.a;
        q0 q00 = clipboards0.d(s);
        if(q00 != null) {
            clipboards0.e(this, ((String)q00.a()), ((String)q00.b()), ((m)q00.c()));
            return;
        }
        this.H = s;
        if(this.F1() != null) {
            this.F1().a4((F0 f00) -> f00.t2(u0.Q5(1, s), new W[0]), (Throwable throwable0) -> Dl.D(this, 0x7F1502F5));  // string:fail_insert_recent_search "최근 검색어 등록에 실패했습니다."
        }
        if(this.D.getVisibility() == 0) {
            this.D.setVisibility(8);
        }
        Nk.a(this);
        this.getWindow().setSoftInputMode(2);
        if(this.H != null) {
            this.B.setVisibility(0);
            this.z.setVisibility(0);
        }
        this.c2();
        for(Object object0: this.getSupportFragmentManager().I0()) {
            Fragment fragment0 = (Fragment)object0;
            if(fragment0 instanceof c && fragment0.isVisible()) {
                ((c)fragment0).a();
                ((c)fragment0).a0();
            }
        }
        this.K = true;
        this.F.setVisibility(8);
    }

    public void E2(String s) {
        this.H = s;
        this.x.setText(s);
        Editable editable0 = this.x.getText();
        int v = editable0 == null ? 0 : editable0.length();
        this.x.setSelection(v);
        this.D2(s);
    }

    public void F2() {
        Editable editable0 = this.x.getText();
        if(editable0 != null && editable0.length() > 0) {
            this.D2(editable0.toString());
            this.f2().setCurrentItem(1);
        }
    }

    public void G2() {
        this.E.setVisibility(0);
    }

    @Override  // com.google.android.material.tabs.TabLayout$c
    public void N(i tabLayout$i0) {
    }

    @Override  // com.dcinside.app.recent.s$b
    public void P(u0 u00) {
        this.E2(u00.T5());
    }

    @Override  // com.google.android.material.tabs.TabLayout$c
    public void R(i tabLayout$i0) {
    }

    public void b2() {
        Behavior appBarLayout$Behavior0 = (Behavior)((LayoutParams)this.B.getLayoutParams()).f();
        if(appBarLayout$Behavior0 != null) {
            appBarLayout$Behavior0.U(-this.B.getHeight());
            this.A.requestLayout();
            this.B.requestLayout();
        }
    }

    public void c2() {
        Behavior appBarLayout$Behavior0 = (Behavior)((LayoutParams)this.B.getLayoutParams()).f();
        if(appBarLayout$Behavior0 != null) {
            appBarLayout$Behavior0.U(0);
            this.A.requestLayout();
            this.B.requestLayout();
        }
    }

    private void d2() {
        int v = this.y.getTabCount();
        for(int v1 = 0; v1 < v; ++v1) {
            i tabLayout$i0 = this.y.D(v1);
            if(tabLayout$i0 != null) {
                n tabLayout$n0 = tabLayout$i0.i;
                tabLayout$n0.setPadding(0, tabLayout$n0.getPaddingTop(), 0, tabLayout$n0.getPaddingBottom());
            }
        }
    }

    public String e2() {
        return this.H;
    }

    public ViewPager2 f2() {
        return this.z;
    }

    // 检测为 Lambda 实现
    private void g2(View view0) [...]

    private void h2() {
        int v = this.y.getSelectedTabPosition();
        if(v == -1) {
            return;
        }
        Fragment fragment0 = this.getSupportFragmentManager().s0(s.m(this.z, v));
        if(fragment0 instanceof c) {
            ((c)fragment0).a0();
        }
    }

    public void i2() {
        this.E.setVisibility(8);
    }

    @Override  // com.google.android.material.tabs.TabLayout$c
    public void j(i tabLayout$i0) {
        if(tabLayout$i0 != null) {
            this.z.s(tabLayout$i0.k(), false);
        }
    }

    private void j2() {
        this.L = new H(this.w, null, (/* 缺少LAMBDA参数 */) -> {
            if(this.K) {
                return S0.a;
            }
            if(((Boolean)object0).booleanValue()) {
                this.F.setVisibility(0);
                return S0.a;
            }
            this.F.setVisibility(8);
            return S0.a;
        });
    }

    public void k2(Intent intent0) {
        if(intent0 == null) {
            return;
        }
        String s = intent0.getStringExtra("searchText");
        if(m0.a.i(s)) {
            return;
        }
        this.getWindow().setSoftInputMode(2);
        this.E2(s);
        if(intent0.getBooleanExtra("totalSearchDirectVideoTag", false)) {
            this.f2().setCurrentItem(2);
        }
    }

    // 检测为 Lambda 实现
    private void l2(View view0) [...]

    // 检测为 Lambda 实现
    private void m2(View view0) [...]

    // 检测为 Lambda 实现
    private S0 n2(Boolean boolean0) [...]

    // 检测为 Lambda 实现
    private static void o2(i tabLayout$i0, int v) [...]

    @Override  // com.dcinside.app.base.d
    public void onBackPressed() {
        if(this.I != null && this.I.k()) {
            this.I.i();
            return;
        }
        super.onBackPressed();
    }

    @Override  // com.dcinside.app.base.g
    protected void onCreate(Bundle bundle0) {
        class com.dcinside.app.totalsearch.TotalSearchActivity.a implements TextWatcher {
            final TotalSearchActivity a;

            @Override  // android.text.TextWatcher
            public void afterTextChanged(Editable editable0) {
            }

            @Override  // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
            }

            @Override  // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
                TotalSearchActivity.this.A2(charSequence0);
            }
        }


        class com.dcinside.app.totalsearch.TotalSearchActivity.b extends l0.a {
            @Override  // l0.a
            public boolean i(RecyclerView recyclerView0, MotionEvent motionEvent0) {
                Nk.c(recyclerView0);
                return false;
            }
        }


        class com.dcinside.app.totalsearch.TotalSearchActivity.c extends d {
            final TotalSearchActivity a;

            @Override  // l0.d
            public void c(int v) {
                if(v == -1) {
                    return;
                }
                String s = s.m(TotalSearchActivity.this.z, v);
                Fragment fragment0 = TotalSearchActivity.this.getSupportFragmentManager().s0(s);
                if(fragment0 instanceof c) {
                    ((c)fragment0).R();
                }
            }
        }

        super.onCreate(bundle0);
        this.setContentView(0x7F0E0074);  // layout:activity_total_search
        this.w = this.findViewById(0x7F0B0FC0);  // id:total_search_parent
        this.x = (ClearableEditText)this.findViewById(0x7F0B0FCC);  // id:total_search_search_text
        this.y = (TabLayout)this.findViewById(0x7F0B0FCE);  // id:total_search_tab
        this.z = (ViewPager2)this.findViewById(0x7F0B0FD2);  // id:total_search_viewpager
        this.A = (CoordinatorLayout)this.findViewById(0x7F0B0FAF);  // id:total_search_content_parent
        this.B = (AppBarLayout)this.findViewById(0x7F0B0FCF);  // id:total_search_tab_container
        this.C = (RecyclerView)this.findViewById(0x7F0B0FAD);  // id:total_search_auto_recycler
        this.D = (RecyclerView)this.findViewById(0x7F0B0FCA);  // id:total_search_recent_recycler
        this.E = this.findViewById(0x7F0B0FD0);  // id:total_search_to_top
        this.F = this.findViewById(0x7F0B0FBA);  // id:total_search_go_hot_parent
        this.E.setOnClickListener((View view0) -> this.h2());
        this.findViewById(0x7F0B0FCB).setOnClickListener((View view0) -> this.w2());
        this.findViewById(0x7F0B0FBB).setOnClickListener((View view0) -> switch(view0.getId()) {
            case 0x7F0B0FAE: {  // id:total_search_close_keyboard
                Nk.a(this);
                return;
            }
            case 0x7F0B0FBB: {  // id:total_search_go_major_hot
                Context context0 = view0.getContext();
                MinorMoreActivity.A.b(context0, m.g);
                return;
            }
            case 0x7F0B0FBC: {  // id:total_search_go_mini_hot
                Context context2 = view0.getContext();
                MinorMoreActivity.A.b(context2, m.i);
                return;
            }
            case 0x7F0B0FBD: {  // id:total_search_go_minor_hot
                Context context1 = view0.getContext();
                MinorMoreActivity.A.b(context1, m.h);
                return;
            }
            case 0x7F0B0FBE: {  // id:total_search_go_person_hot
                Context context3 = view0.getContext();
                MinorMoreActivity.A.b(context3, m.j);
            }
        });
        this.findViewById(0x7F0B0FBD).setOnClickListener((View view0) -> switch(view0.getId()) {
            case 0x7F0B0FAE: {  // id:total_search_close_keyboard
                Nk.a(this);
                return;
            }
            case 0x7F0B0FBB: {  // id:total_search_go_major_hot
                Context context0 = view0.getContext();
                MinorMoreActivity.A.b(context0, m.g);
                return;
            }
            case 0x7F0B0FBC: {  // id:total_search_go_mini_hot
                Context context2 = view0.getContext();
                MinorMoreActivity.A.b(context2, m.i);
                return;
            }
            case 0x7F0B0FBD: {  // id:total_search_go_minor_hot
                Context context1 = view0.getContext();
                MinorMoreActivity.A.b(context1, m.h);
                return;
            }
            case 0x7F0B0FBE: {  // id:total_search_go_person_hot
                Context context3 = view0.getContext();
                MinorMoreActivity.A.b(context3, m.j);
            }
        });
        this.findViewById(0x7F0B0FBC).setOnClickListener((View view0) -> switch(view0.getId()) {
            case 0x7F0B0FAE: {  // id:total_search_close_keyboard
                Nk.a(this);
                return;
            }
            case 0x7F0B0FBB: {  // id:total_search_go_major_hot
                Context context0 = view0.getContext();
                MinorMoreActivity.A.b(context0, m.g);
                return;
            }
            case 0x7F0B0FBC: {  // id:total_search_go_mini_hot
                Context context2 = view0.getContext();
                MinorMoreActivity.A.b(context2, m.i);
                return;
            }
            case 0x7F0B0FBD: {  // id:total_search_go_minor_hot
                Context context1 = view0.getContext();
                MinorMoreActivity.A.b(context1, m.h);
                return;
            }
            case 0x7F0B0FBE: {  // id:total_search_go_person_hot
                Context context3 = view0.getContext();
                MinorMoreActivity.A.b(context3, m.j);
            }
        });
        this.findViewById(0x7F0B0FBE).setOnClickListener((View view0) -> switch(view0.getId()) {
            case 0x7F0B0FAE: {  // id:total_search_close_keyboard
                Nk.a(this);
                return;
            }
            case 0x7F0B0FBB: {  // id:total_search_go_major_hot
                Context context0 = view0.getContext();
                MinorMoreActivity.A.b(context0, m.g);
                return;
            }
            case 0x7F0B0FBC: {  // id:total_search_go_mini_hot
                Context context2 = view0.getContext();
                MinorMoreActivity.A.b(context2, m.i);
                return;
            }
            case 0x7F0B0FBD: {  // id:total_search_go_minor_hot
                Context context1 = view0.getContext();
                MinorMoreActivity.A.b(context1, m.h);
                return;
            }
            case 0x7F0B0FBE: {  // id:total_search_go_person_hot
                Context context3 = view0.getContext();
                MinorMoreActivity.A.b(context3, m.j);
            }
        });
        this.findViewById(0x7F0B0FAE).setOnClickListener((View view0) -> switch(view0.getId()) {
            case 0x7F0B0FAE: {  // id:total_search_close_keyboard
                Nk.a(this);
                return;
            }
            case 0x7F0B0FBB: {  // id:total_search_go_major_hot
                Context context0 = view0.getContext();
                MinorMoreActivity.A.b(context0, m.g);
                return;
            }
            case 0x7F0B0FBC: {  // id:total_search_go_mini_hot
                Context context2 = view0.getContext();
                MinorMoreActivity.A.b(context2, m.i);
                return;
            }
            case 0x7F0B0FBD: {  // id:total_search_go_minor_hot
                Context context1 = view0.getContext();
                MinorMoreActivity.A.b(context1, m.h);
                return;
            }
            case 0x7F0B0FBE: {  // id:total_search_go_person_hot
                Context context3 = view0.getContext();
                MinorMoreActivity.A.b(context3, m.j);
            }
        });
        this.x.setOnEditorActionListener((TextView textView0, int v, KeyEvent keyEvent0) -> {
            if(v == 3) {
                this.D2(textView0.getText().toString().trim());
                return true;
            }
            return false;
        });
        this.x.addTextChangedListener(new com.dcinside.app.totalsearch.TotalSearchActivity.a(this));
        this.S0(((Toolbar)this.findViewById(0x7F0B0FD1)));  // id:total_search_toolbar
        kr.bhbfhfb.designcompat.a.c(this.I0());
        StickyHeaderGridLayoutManager stickyHeaderGridLayoutManager0 = new StickyHeaderGridLayoutManager(1);
        stickyHeaderGridLayoutManager0.m3(0);
        this.D.setLayoutManager(stickyHeaderGridLayoutManager0);
        this.D.setAdapter(new com.dcinside.app.recent.s(1, this));
        if(this.F1() != null) {
            g1 g10 = this.F1().C4(u0.class).f0("type", 1).g2("time", r1.c).q0();
            this.J = g10;
            g10.l((g1 g10) -> {
                Adapter recyclerView$Adapter0 = this.D.getAdapter();
                if(recyclerView$Adapter0 instanceof com.dcinside.app.recent.s) {
                    ((com.dcinside.app.recent.s)recyclerView$Adapter0).u0(g10.h().g2(g10));
                }
            });
        }
        this.D.addOnItemTouchListener(new com.dcinside.app.totalsearch.TotalSearchActivity.b(this));
        this.G = new com.dcinside.app.totalsearch.TotalSearchActivity.c(this);
        e e0 = (Boolean boolean0) -> {
            this.y2(boolean0.booleanValue());
            return S0.a;
        };
        t.j.b(this, this.M, e0);
        this.z.setAdapter(new q(this));
        this.y.h(this);
        new com.google.android.material.tabs.d(this.y, this.z, (i tabLayout$i0, int v) -> switch(v) {
            case 0: {
                tabLayout$i0.C(0x7F150A90);  // string:total_search_tab_total "통합"
                return;
            }
            case 1: {
                tabLayout$i0.C(0x7F150A8E);  // string:total_search_tab_gallery "갤러리"
                return;
            }
            case 2: {
                tabLayout$i0.C(0x7F150A91);  // string:total_search_tab_video "동영상"
                return;
            }
            case 3: {
                tabLayout$i0.C(0x7F150A8F);  // string:total_search_tab_post "게시물"
            }
        }).a();
        this.z.n(this.G);
        this.j2();
        this.d2();
        t t0 = new t(null, this.C, null, true);
        this.I = t0;
        t0.q(this.D);
        this.x.setOnClearListener(this);
        this.k2(this.getIntent());
    }

    @Override  // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu0) {
        this.getMenuInflater().inflate(0x7F10000D, menu0);  // mipmap:ic_launcher17
        return super.onCreateOptionsMenu(menu0);
    }

    @Override  // com.dcinside.app.base.g
    protected void onDestroy() {
        super.onDestroy();
        this.M.l();
        if(this.J != null && this.J.s()) {
            this.J.D();
        }
        this.J = null;
        ViewPager2 viewPager20 = this.z;
        if(viewPager20 != null) {
            viewPager20.x(this.G);
        }
        TabLayout tabLayout0 = this.y;
        if(tabLayout0 != null) {
            tabLayout0.N(this);
        }
        t t0 = this.I;
        if(t0 != null) {
            t0.l();
            this.I = null;
        }
        H h0 = this.L;
        if(h0 != null) {
            h0.n();
            this.L = null;
        }
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem0) {
        int v = menuItem0.getItemId();
        if(v == 0x102002C) {
            this.finish();
            return true;
        }
        if(v == 0x7F0B0060) {  // id:action_gallery_move
            MoveGalleryActivity.w.a(this);
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }

    @Override  // androidx.fragment.app.FragmentActivity
    protected void onPause() {
        super.onPause();
        if(this.x.isFocused()) {
            this.x.clearFocus();
        }
    }

    @Override  // com.dcinside.app.base.d
    public boolean onPrepareOptionsMenu(Menu menu0) {
        MenuItem menuItem0 = menu0.findItem(0x7F0B0060);  // id:action_gallery_move
        if(menuItem0 != null) {
            menuItem0.getActionView().findViewById(0x7F0B0822).setOnClickListener((View view0) -> this.onOptionsItemSelected(menuItem0));
        }
        return super.onPrepareOptionsMenu(menu0);
    }

    // 检测为 Lambda 实现
    private void p2(MenuItem menuItem0, View view0) [...]

    // 检测为 Lambda 实现
    private static void q2(t t0, Throwable throwable0) [...]

    // 检测为 Lambda 实现
    private static void r2(View view0) [...]

    // 检测为 Lambda 实现
    private static void s2(View view0) [...]

    // 检测为 Lambda 实现
    private static void t2(t t0, String s, w w0) [...]

    // 检测为 Lambda 实现
    private static void u2(String s, F0 f00) [...]

    // 检测为 Lambda 实现
    private void v2(Throwable throwable0) [...]

    private void w2() {
        Editable editable0 = this.x.getText();
        this.D2((editable0 == null ? null : editable0.toString().trim()));
    }

    // 检测为 Lambda 实现
    private void x2(g1 g10) [...]

    public void y2(boolean z) {
        this.z.setUserInputEnabled(!z);
    }

    @Override  // com.dcinside.app.view.ClearableEditText$a
    public void z() {
        this.b2();
        this.D.setVisibility(0);
        this.E.setVisibility(8);
        this.C.setVisibility(8);
        this.B.setVisibility(8);
        this.z.setVisibility(8);
    }

    // 检测为 Lambda 实现
    private boolean z2(TextView textView0, int v, KeyEvent keyEvent0) [...]
}

