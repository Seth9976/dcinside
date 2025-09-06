package com.dcinside.app.settings.block.image;

import Y.V1;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.base.h;
import com.dcinside.app.settings.b0;
import com.dcinside.app.type.w;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.ql.b;
import io.realm.F0;
import io.realm.P0;
import io.realm.g1;
import java.util.Arrays;
import kotlin.V;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.m;

@s0({"SMAP\nBlockImageSettingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockImageSettingFragment.kt\ncom/dcinside/app/settings/block/image/BlockImageSettingFragment\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,141:1\n177#2,9:142\n204#2,7:164\n255#3,4:151\n255#3:155\n257#3,2:156\n257#3,2:158\n255#3:160\n257#3,2:162\n25#4:161\n*S KotlinDebug\n*F\n+ 1 BlockImageSettingFragment.kt\ncom/dcinside/app/settings/block/image/BlockImageSettingFragment\n*L\n39#1:142,9\n86#1:164,7\n104#1:151,4\n105#1:155\n106#1:156,2\n109#1:158,2\n112#1:160\n135#1:162,2\n133#1:161\n*E\n"})
public final class l extends h implements FragmentResultListener, P0 {
    @m
    private V1 b;
    @m
    private g1 c;
    @m
    private b0 d;

    public l() {
        super(0, 1, null);
    }

    @Override  // io.realm.P0
    public void M(Object object0) {
        this.y0(((g1)object0));
    }

    @Override  // androidx.fragment.app.FragmentResultListener
    public void e(@y4.l String s, @y4.l Bundle bundle0) {
        L.p(s, "requestKey");
        L.p(bundle0, "result");
        if(!L.g(s, "com.dcinside.app.setting.ImageBlockSettingFragment")) {
            return;
        }
        int v = bundle0.getInt("com.dcinside.app.setting.ImageBlockSettingFragment.rangeType", dl.a.k1());
        dl.a.c5(v);
        V1 v10 = this.p0();
        String s1 = this.q0(dl.a.k1());
        v10.p.setText(s1);
    }

    @Override  // androidx.fragment.app.Fragment
    @y4.l
    public View onCreateView(@y4.l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.b = V1.d(layoutInflater0, viewGroup0, false);
        View view0 = this.p0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // com.dcinside.app.base.h
    public void onDestroyView() {
        b0 b00 = this.d;
        if(b00 != null) {
            b00.dismissAllowingStateLoss();
        }
        this.d = null;
        g1 g10 = this.c;
        if(g10 != null) {
            g10.D();
        }
        this.c = null;
        FragmentKt.c(this, "com.dcinside.app.setting.ImageBlockSettingFragment");
        super.onDestroyView();
        this.p0().i.setAdapter(null);
        this.b = null;
    }

    @Override  // com.dcinside.app.base.h
    public void onViewCreated(@y4.l View view0, @m Bundle bundle0) {
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
        g1 g10 = f00.C4(com.dcinside.app.realm.h.class).p0();
        this.c = g10;
        if(g10 != null) {
            g10.l(this);
        }
        this.r0();
        this.getChildFragmentManager().c("com.dcinside.app.setting.ImageBlockSettingFragment", this.getViewLifecycleOwner(), this);
        g1 g11 = this.c;
        if(g11 != null) {
            this.y0(g11);
        }
    }

    private final V1 p0() {
        V1 v10 = this.b;
        L.m(v10);
        return v10;
    }

    private final String q0(int v) {
        w w0;
        try {
            w0 = (w)w.b().get(v);
        }
        catch(Exception unused_ex) {
            w0 = w.c;
        }
        String s = this.getString(w0.c());
        L.o(s, "getString(...)");
        return s;
    }

    private final void r0() {
        dl dl0 = dl.a;
        boolean z = dl0.N();
        this.p0().c.setChecked(z);
        V1 v10 = this.p0();
        boolean z1 = dl0.O();
        v10.f.setChecked(z1);
        this.p0().d.setAlpha((z ? 1.0f : 0.3f));
        V1 v11 = this.p0();
        e e0 = new e();
        v11.i.setAdapter(e0);
        V1 v12 = this.p0();
        LinearLayoutManager linearLayoutManager0 = new LinearLayoutManager(this.getContext());
        v12.i.setLayoutManager(linearLayoutManager0);
        b.d(this.p0().i);
        if(dl0.N2() && (this.c != null && !this.c.isEmpty() == 1)) {
            this.z0();
        }
        V1 v13 = this.p0();
        f f0 = (View view0) -> {
            L.p(this, "this$0");
            V1 v10 = this.p0();
            boolean z = this.p0().c.isChecked();
            v10.c.setChecked(!z);
        };
        v13.e.setOnClickListener(f0);
        V1 v14 = this.p0();
        g g0 = (View view0) -> {
            L.p(this, "this$0");
            V1 v10 = this.p0();
            boolean z = this.p0().f.isChecked();
            v10.f.setChecked(!z);
        };
        v14.h.setOnClickListener(g0);
        V1 v15 = this.p0();
        com.dcinside.app.settings.block.image.h h0 = (View view0) -> {
            L.p(this, "this$0");
            b0 b00 = this.d;
            if(b00 != null) {
                b00.dismissAllowingStateLoss();
            }
            FragmentManager fragmentManager0 = this.getChildFragmentManager();
            L.o(fragmentManager0, "getChildFragmentManager(...)");
            FragmentFactory fragmentFactory0 = fragmentManager0.G0();
            ClassLoader classLoader0 = b0.class.getClassLoader();
            L.m(classLoader0);
            Fragment fragment0 = fragmentFactory0.a(classLoader0, "com.dcinside.app.settings.b0");
            if(fragment0 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.dcinside.app.settings.SelectImageBlockRangeFragment");
            }
            ((b0)fragment0).setArguments(BundleKt.b(((V[])Arrays.copyOf(new V[0], 0))));
            ((b0)fragment0).show(fragmentManager0, "com.dcinside.app.settings.b0");
            this.d = (b0)fragment0;
        };
        v15.q.setOnClickListener(h0);
        V1 v16 = this.p0();
        i i0 = (View view0) -> {
            L.p(this, "this$0");
            this.z0();
        };
        v16.k.setOnClickListener(i0);
        V1 v17 = this.p0();
        j j0 = (CompoundButton compoundButton0, boolean z) -> {
            L.p(this, "this$0");
            this.p0().d.setAlpha((z ? 1.0f : 0.3f));
            dl.a.D3(z);
        };
        v17.c.setOnCheckedChangeListener(j0);
        V1 v18 = this.p0();
        k k0 = (CompoundButton compoundButton0, boolean z) -> dl.a.E3(z);
        v18.f.setOnCheckedChangeListener(k0);
        V1 v19 = this.p0();
        String s = this.q0(dl0.k1());
        v19.p.setText(s);
    }

    // 检测为 Lambda 实现
    private static final void s0(l l0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void t0(l l0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void u0(l l0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void v0(l l0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void w0(l l0, CompoundButton compoundButton0, boolean z) [...]

    // 检测为 Lambda 实现
    private static final void x0(CompoundButton compoundButton0, boolean z) [...]

    public void y0(@y4.l g1 g10) {
        L.p(g10, "results");
        Adapter recyclerView$Adapter0 = null;
        this.p0().m.setText(String.valueOf((this.c == null ? null : this.c.size())));
        V1 v10 = this.p0();
        L.o(v10.i, "blockImageList");
        Adapter recyclerView$Adapter1 = v10.i.getAdapter();
        if(recyclerView$Adapter1 instanceof e) {
            recyclerView$Adapter0 = recyclerView$Adapter1;
        }
        if(((e)recyclerView$Adapter0) != null) {
            ((e)recyclerView$Adapter0).E(g10);
        }
        if(g10.isEmpty()) {
            V1 v11 = this.p0();
            L.o(v11.j, "blockImageListDiv");
            v11.j.setVisibility(8);
            this.p0().l.setRotation(0.0f);
        }
    }

    private final void z0() {
        RecyclerView recyclerView0 = this.p0().i;
        L.o(recyclerView0, "blockImageList");
        V1 v10 = this.p0();
        L.o(v10.i, "blockImageList");
        boolean z = false;
        recyclerView0.setVisibility((v10.i.getVisibility() == 0 || (this.c == null || !this.c.isEmpty() != 1) ? 0 : 8));
        V1 v11 = this.p0();
        L.o(v11.i, "blockImageList");
        if(v11.i.getVisibility() == 0) {
            V1 v12 = this.p0();
            L.o(v12.j, "blockImageListDiv");
            v12.j.setVisibility(0);
            this.p0().l.setRotation(180.0f);
        }
        else {
            V1 v13 = this.p0();
            L.o(v13.j, "blockImageListDiv");
            v13.j.setVisibility(8);
            this.p0().l.setRotation(0.0f);
        }
        dl dl0 = dl.a;
        V1 v14 = this.p0();
        L.o(v14.i, "blockImageList");
        if(v14.i.getVisibility() == 0) {
            z = true;
        }
        dl0.C3(z);
    }
}

