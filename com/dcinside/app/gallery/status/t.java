package com.dcinside.app.gallery.status;

import Y.R1;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.dcinside.app.realm.B;
import com.dcinside.app.response.h;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.ql.b;
import com.dcinside.app.util.uk;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import rx.o;
import rx.schedulers.c;
import y4.l;
import y4.m;

public final class t extends Fragment {
    @m
    private R1 a;
    @m
    private o b;
    @m
    private a c;

    private final R1 m0() {
        R1 r10 = this.a;
        L.m(r10);
        return r10;
    }

    private final void n0() {
        static final class com.dcinside.app.gallery.status.t.a extends N implements Function1 {
            final t e;

            com.dcinside.app.gallery.status.t.a(t t0) {
                this.e = t0;
                super(1);
            }

            public final void a(h h0) {
                L.m(h0);
                this.e.r0(h0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((h)object0));
                return S0.a;
            }
        }

        String s = B.E.k0();
        if(s != null && s.length() != 0) {
            this.m0().d.setVisibility(0);
            o o0 = this.b;
            if(o0 != null) {
                o0.l();
            }
            this.b = uk.cG().A5(c.e()).M3(rx.android.schedulers.a.c()).T1(() -> {
                L.p(this, "this$0");
                this.m0().d.setVisibility(8);
            }).y5((Object object0) -> {
                L.p(new com.dcinside.app.gallery.status.t.a(this), "$tmp0");
                new com.dcinside.app.gallery.status.t.a(this).invoke(object0);
            }, (Throwable throwable0) -> {
                L.p(this, "this$0");
                Context context0 = this.getContext();
                if(context0 == null) {
                    return;
                }
                Dl.D(context0, 0x7F15037E);  // string:gallery_all_failed "갤러리 목록 갱신을 실패했습니다."
            });
            return;
        }
        this.r0(new h());
    }

    // 检测为 Lambda 实现
    private static final void o0(t t0) [...]

    @Override  // androidx.fragment.app.Fragment
    public void onActivityResult(int v, int v1, @m Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        if(v1 == -1) {
            this.n0();
        }
    }

    @Override  // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.a = R1.d(layoutInflater0, viewGroup0, false);
        View view0 = this.m0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        o o0 = this.b;
        if(o0 != null) {
            o0.l();
        }
        this.b = null;
        this.a = null;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        R1 r10 = this.m0();
        LinearLayoutManager linearLayoutManager0 = new LinearLayoutManager(r10.c.getContext());
        r10.c.setLayoutManager(linearLayoutManager0);
        a a0 = new a();
        this.c = a0;
        r10.c.setAdapter(a0);
        b.d(r10.c);
        this.n0();
    }

    // 检测为 Lambda 实现
    private static final void p0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void q0(t t0, Throwable throwable0) [...]

    private final void r0(h h0) {
        boolean z = h0.l();
        if(z) {
            this.m0().c.setVisibility(8);
            this.m0().b.b().setVisibility(0);
        }
        else {
            a a0 = this.c;
            if(a0 != null) {
                a0.y();
            }
            a a1 = this.c;
            if(a1 != null) {
                a1.I(h0);
            }
            this.m0().c.setVisibility(0);
            this.m0().b.b().setVisibility(8);
        }
        FragmentActivity fragmentActivity0 = this.getActivity();
        MyGalleryStatusActivity myGalleryStatusActivity0 = fragmentActivity0 instanceof MyGalleryStatusActivity ? ((MyGalleryStatusActivity)fragmentActivity0) : null;
        if(myGalleryStatusActivity0 != null) {
            myGalleryStatusActivity0.O1(z);
        }
    }
}

