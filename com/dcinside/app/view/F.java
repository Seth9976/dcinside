package com.dcinside.app.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.TextView;
import com.futuremind.recyclerviewfastscroll.FastScroller;
import com.futuremind.recyclerviewfastscroll.viewprovider.c;
import com.futuremind.recyclerviewfastscroll.viewprovider.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nFastScrollProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastScrollProvider.kt\ncom/dcinside/app/view/FastScrollProvider\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,83:1\n255#2:84\n257#2,2:85\n257#2,2:87\n*S KotlinDebug\n*F\n+ 1 FastScrollProvider.kt\ncom/dcinside/app/view/FastScrollProvider\n*L\n18#1:84\n21#1:85,2\n27#1:87,2\n*E\n"})
public final class f extends c {
    private boolean d;

    @Override  // com.futuremind.recyclerviewfastscroll.viewprovider.c
    public int b() {
        return 0;
    }

    @Override  // com.futuremind.recyclerviewfastscroll.viewprovider.c
    public void f() {
        super.f();
        this.r(true);
    }

    @Override  // com.futuremind.recyclerviewfastscroll.viewprovider.c
    public void g() {
        super.g();
        this.r(false);
    }

    @Override  // com.futuremind.recyclerviewfastscroll.viewprovider.c
    public void h() {
        super.h();
        this.r(false);
    }

    @Override  // com.futuremind.recyclerviewfastscroll.viewprovider.c
    public void i() {
        super.i();
        this.r(true);
    }

    @Override  // com.futuremind.recyclerviewfastscroll.viewprovider.c
    @m
    protected d j() {
        return null;
    }

    @Override  // com.futuremind.recyclerviewfastscroll.viewprovider.c
    @m
    public TextView k() {
        return null;
    }

    @Override  // com.futuremind.recyclerviewfastscroll.viewprovider.c
    @l
    public View l(@l ViewGroup viewGroup0) {
        L.p(viewGroup0, "container");
        View view0 = new View(viewGroup0.getContext());
        view0.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
        return view0;
    }

    @Override  // com.futuremind.recyclerviewfastscroll.viewprovider.c
    @m
    protected d m() {
        return null;
    }

    @Override  // com.futuremind.recyclerviewfastscroll.viewprovider.c
    @l
    public View n(@l ViewGroup viewGroup0) {
        L.p(viewGroup0, "container");
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E01D2, viewGroup0, false);  // layout:view_fastscroll
        L.o(view0, "inflate(...)");
        return view0;
    }

    // 检测为 Lambda 实现
    private static final void q(f f0) [...]

    private final void r(boolean z) {
        this.d = z;
        if(z) {
            FastScroller fastScroller0 = this.e();
            L.o(fastScroller0, "getScroller(...)");
            if(fastScroller0.getVisibility() != 0) {
                this.e().setAlpha(0.0f);
            }
            FastScroller fastScroller1 = this.e();
            L.o(fastScroller1, "getScroller(...)");
            fastScroller1.setVisibility(0);
            this.e().animate().cancel();
            this.e().animate().setDuration(50L).setStartDelay(0L).alpha(1.0f);
            return;
        }
        this.e().animate().cancel();
        this.e().animate().setDuration(300L).setStartDelay(2000L).alpha(0.0f).withEndAction(() -> {
            L.p(this, "this$0");
            FastScroller fastScroller0 = this.e();
            L.o(fastScroller0, "getScroller(...)");
            fastScroller0.setVisibility(8);
        });
    }
}

