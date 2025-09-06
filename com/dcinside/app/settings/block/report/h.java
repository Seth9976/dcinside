package com.dcinside.app.settings.block.report;

import Y.v2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.realm.j;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.dl;
import io.realm.F0;
import io.realm.g1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nBlockReportSettingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockReportSettingFragment.kt\ncom/dcinside/app/settings/block/report/BlockReportSettingFragment\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,83:1\n177#2,9:84\n255#3,4:93\n255#3:97\n255#3:98\n*S KotlinDebug\n*F\n+ 1 BlockReportSettingFragment.kt\ncom/dcinside/app/settings/block/report/BlockReportSettingFragment\n*L\n30#1:84,9\n74#1:93,4\n75#1:97\n80#1:98\n*E\n"})
public final class h extends com.dcinside.app.base.h {
    @m
    private v2 b;
    @m
    private g1 c;

    public h() {
        super(0, 1, null);
    }

    private final v2 m0() {
        v2 v20 = this.b;
        L.m(v20);
        return v20;
    }

    private final void n0() {
        v2 v20 = this.m0();
        boolean z = dl.a.Y();
        v20.c.setChecked(z);
        this.m0().i.setText(String.valueOf((this.c == null ? null : this.c.size())));
        v2 v21 = this.m0();
        LinearLayoutManager linearLayoutManager0 = new LinearLayoutManager(this.getContext());
        v21.f.setLayoutManager(linearLayoutManager0);
        this.m0().f.setItemAnimator(null);
        b b0 = new b();
        b0.x(this.c);
        this.m0().f.setAdapter(b0);
        if(dl.a.O2() && (this.c != null && !this.c.isEmpty() == 1)) {
            this.r0();
        }
        v2 v22 = this.m0();
        e e0 = (View view0) -> {
            L.p(this, "this$0");
            v2 v20 = this.m0();
            boolean z = this.m0().c.isChecked();
            v20.c.setChecked(!z);
        };
        v22.e.setOnClickListener(e0);
        v2 v23 = this.m0();
        f f0 = (View view0) -> {
            L.p(this, "this$0");
            this.r0();
        };
        v23.g.setOnClickListener(f0);
        v2 v24 = this.m0();
        g g0 = (CompoundButton compoundButton0, boolean z) -> dl.a.Q3(z);
        v24.c.setOnCheckedChangeListener(g0);
    }

    // 检测为 Lambda 实现
    private static final void o0(h h0, View view0) [...]

    @Override  // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.b = v2.d(layoutInflater0, viewGroup0, false);
        View view0 = this.m0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // com.dcinside.app.base.h
    public void onDestroyView() {
        super.onDestroyView();
        this.m0().f.setAdapter(null);
        this.c = null;
        this.b = null;
    }

    @Override  // com.dcinside.app.base.h
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
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
        this.c = f00.C4(j.class).p0();
        this.n0();
    }

    // 检测为 Lambda 实现
    private static final void p0(h h0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void q0(CompoundButton compoundButton0, boolean z) [...]

    private final void r0() {
        RecyclerView recyclerView0 = this.m0().f;
        L.o(recyclerView0, "blockReportList");
        v2 v20 = this.m0();
        L.o(v20.f, "blockReportList");
        boolean z = false;
        recyclerView0.setVisibility((v20.f.getVisibility() == 0 || (this.c == null || !this.c.isEmpty() != 1) ? 0 : 8));
        v2 v21 = this.m0();
        L.o(v21.f, "blockReportList");
        if(v21.f.getVisibility() == 0) {
            this.m0().h.setRotation(180.0f);
        }
        else {
            this.m0().h.setRotation(0.0f);
        }
        dl dl0 = dl.a;
        v2 v22 = this.m0();
        L.o(v22.f, "blockReportList");
        if(v22.f.getVisibility() == 0) {
            z = true;
        }
        dl0.F3(z);
    }
}

