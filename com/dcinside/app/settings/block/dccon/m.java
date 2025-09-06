package com.dcinside.app.settings.block.dccon;

import Y.N1;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.base.h;
import com.dcinside.app.realm.f;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.dl;
import io.realm.F0;
import io.realm.P0;
import io.realm.g1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nBlockDcconSettingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockDcconSettingFragment.kt\ncom/dcinside/app/settings/block/dccon/BlockDcconSettingFragment\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,116:1\n177#2,9:117\n255#3,4:126\n255#3:130\n257#3,2:131\n257#3,2:133\n255#3:135\n257#3,2:137\n25#4:136\n1#5:139\n*S KotlinDebug\n*F\n+ 1 BlockDcconSettingFragment.kt\ncom/dcinside/app/settings/block/dccon/BlockDcconSettingFragment\n*L\n33#1:117,9\n95#1:126,4\n96#1:130\n97#1:131,2\n100#1:133,2\n103#1:135\n110#1:137,2\n108#1:136\n*E\n"})
public final class m extends h implements P0 {
    @y4.m
    private N1 b;
    @y4.m
    private g1 c;

    public m() {
        super(0, 1, null);
    }

    @Override  // io.realm.P0
    public void M(Object object0) {
        this.x0(((g1)object0));
    }

    @Override  // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @y4.m ViewGroup viewGroup0, @y4.m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.b = N1.d(layoutInflater0, viewGroup0, false);
        View view0 = this.p0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // com.dcinside.app.base.h
    public void onDestroyView() {
        g1 g10 = this.c;
        if(g10 != null) {
            g10.D();
        }
        super.onDestroyView();
        this.c = null;
        this.p0().i.setAdapter(null);
        this.b = null;
    }

    @Override  // com.dcinside.app.base.h
    public void onViewCreated(@l View view0, @y4.m Bundle bundle0) {
        F0 f00;
        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        try {
            f00 = null;
            f00 = this.i0();
        }
        catch(Exception unused_ex) {
        }
        if(f00 == null) {
            Dl.D(this.getContext(), 0x7F15030F);  // string:failed_block_initialize "차단 설정을 생성하던 중 알 수 없는 에러가 발생했습니다."
            return;
        }
        g1 g10 = f.i.d(f00);
        this.c = g10;
        if(g10 != null) {
            g10.l(this);
        }
        this.q0();
    }

    private final N1 p0() {
        N1 n10 = this.b;
        L.m(n10);
        return n10;
    }

    private final void q0() {
        dl dl0 = dl.a;
        boolean z = dl0.L();
        this.p0().c.setChecked(z);
        N1 n10 = this.p0();
        boolean z1 = dl0.M();
        n10.f.setChecked(z1);
        this.p0().d.setAlpha((z ? 1.0f : 0.3f));
        com.dcinside.app.settings.block.dccon.f f0 = new com.dcinside.app.settings.block.dccon.f();
        this.p0().i.setAdapter(f0);
        N1 n11 = this.p0();
        LinearLayoutManager linearLayoutManager0 = new LinearLayoutManager(this.getContext());
        n11.i.setLayoutManager(linearLayoutManager0);
        N1 n12 = this.p0();
        g g0 = (View view0, int v) -> {
            L.p(f0, "$adapter");
            L.p(this, "this$0");
            L.p(view0, "<anonymous parameter 0>");
            b f$b0 = f0.v(v);
            Long long0 = f$b0.h();
            String s = f$b0.i() == null ? "" : f$b0.i();
            Context context0 = this.getContext();
            if(context0 != null) {
                BlockDcconChildActivity.z.a(context0, long0, s);
            }
            return true;
        };
        com.dcinside.app.util.ql.b.e(n12.i, g0);
        g1 g10 = this.c;
        if(g10 != null) {
            this.x0(g10);
        }
        if(dl0.M2() && (this.c != null && !this.c.isEmpty() == 1)) {
            this.y0();
        }
        N1 n13 = this.p0();
        com.dcinside.app.settings.block.dccon.h h0 = (View view0) -> {
            L.p(this, "this$0");
            N1 n10 = this.p0();
            boolean z = this.p0().c.isChecked();
            n10.c.setChecked(!z);
        };
        n13.e.setOnClickListener(h0);
        N1 n14 = this.p0();
        i i0 = (View view0) -> {
            L.p(this, "this$0");
            N1 n10 = this.p0();
            boolean z = this.p0().f.isChecked();
            n10.f.setChecked(!z);
        };
        n14.h.setOnClickListener(i0);
        N1 n15 = this.p0();
        j j0 = (View view0) -> {
            L.p(this, "this$0");
            this.y0();
        };
        n15.k.setOnClickListener(j0);
        N1 n16 = this.p0();
        k k0 = (CompoundButton compoundButton0, boolean z) -> {
            L.p(this, "this$0");
            this.p0().d.setAlpha((z ? 1.0f : 0.3f));
            dl.a.z3(z);
        };
        n16.c.setOnCheckedChangeListener(k0);
        N1 n17 = this.p0();
        com.dcinside.app.settings.block.dccon.l l0 = (CompoundButton compoundButton0, boolean z) -> dl.a.A3(z);
        n17.f.setOnCheckedChangeListener(l0);
    }

    // 检测为 Lambda 实现
    private static final boolean r0(com.dcinside.app.settings.block.dccon.f f0, m m0, View view0, int v) [...]

    // 检测为 Lambda 实现
    private static final void s0(m m0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void t0(m m0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void u0(m m0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void v0(m m0, CompoundButton compoundButton0, boolean z) [...]

    // 检测为 Lambda 实现
    private static final void w0(CompoundButton compoundButton0, boolean z) [...]

    public void x0(@l g1 g10) {
        L.p(g10, "results");
        Adapter recyclerView$Adapter0 = null;
        this.p0().m.setText(String.valueOf((this.c == null ? null : this.c.size())));
        N1 n10 = this.p0();
        L.o(n10.i, "blockDcconList");
        Adapter recyclerView$Adapter1 = n10.i.getAdapter();
        if(recyclerView$Adapter1 instanceof com.dcinside.app.settings.block.dccon.f) {
            recyclerView$Adapter0 = recyclerView$Adapter1;
        }
        if(((com.dcinside.app.settings.block.dccon.f)recyclerView$Adapter0) != null) {
            ((com.dcinside.app.settings.block.dccon.f)recyclerView$Adapter0).y(g10);
        }
        if(g10.isEmpty()) {
            N1 n11 = this.p0();
            L.o(n11.j, "blockDcconListDiv");
            n11.j.setVisibility(8);
            this.p0().l.setRotation(0.0f);
        }
    }

    private final void y0() {
        RecyclerView recyclerView0 = this.p0().i;
        L.o(recyclerView0, "blockDcconList");
        N1 n10 = this.p0();
        L.o(n10.i, "blockDcconList");
        boolean z = false;
        recyclerView0.setVisibility((n10.i.getVisibility() == 0 || (this.c == null || !this.c.isEmpty() != 1) ? 0 : 8));
        N1 n11 = this.p0();
        L.o(n11.i, "blockDcconList");
        if(n11.i.getVisibility() == 0) {
            N1 n12 = this.p0();
            L.o(n12.j, "blockDcconListDiv");
            n12.j.setVisibility(0);
            this.p0().l.setRotation(180.0f);
        }
        else {
            N1 n13 = this.p0();
            L.o(n13.j, "blockDcconListDiv");
            n13.j.setVisibility(8);
            this.p0().l.setRotation(0.0f);
        }
        dl dl0 = dl.a;
        N1 n14 = this.p0();
        L.o(n14.i, "blockDcconList");
        if(n14.i.getVisibility() == 0) {
            z = true;
        }
        dl0.B3(z);
    }
}

