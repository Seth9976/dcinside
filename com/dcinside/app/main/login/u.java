package com.dcinside.app.main.login;

import androidx.lifecycle.ViewModel;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.E;
import kotlinx.coroutines.flow.U;
import kotlinx.coroutines.flow.W;
import kotlinx.coroutines.flow.k;
import y4.l;
import y4.m;

@s0({"SMAP\nSimpleLoginViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleLoginViewModel.kt\ncom/dcinside/app/main/login/SimpleLoginViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,46:1\n226#2,5:47\n226#2,5:52\n*S KotlinDebug\n*F\n+ 1 SimpleLoginViewModel.kt\ncom/dcinside/app/main/login/SimpleLoginViewModel\n*L\n18#1:47,5\n35#1:52,5\n*E\n"})
public final class u extends ViewModel {
    @l
    private final E a;
    @l
    private final U b;

    public u() {
        E e0 = W.a(new p(null, null, 3, null));
        this.a = e0;
        this.b = k.m(e0);
    }

    @m
    public final Boolean c(@l String s, @l String s1) {
        L.p(s, "galleryId");
        L.p(s1, "realId");
        p p0 = (p)this.b.getValue();
        return L.g("", s) ? Boolean.valueOf(p0.f().contains(s1)) : null;
    }

    @Override  // androidx.lifecycle.ViewModel
    public final void clear() {
        E e0 = this.a;
        do {
            Object object0 = e0.getValue();
        }
        while(!e0.compareAndSet(object0, p.d(((p)object0), null, null, 3, null)));
    }

    public final void d(@l String s, @l List list0) {
        L.p(s, "galleryId");
        L.p(list0, "managerList");
        E e0 = this.a;
        do {
            Object object0 = e0.getValue();
        }
        while(!e0.compareAndSet(object0, ((p)object0).c(s, list0)));
    }
}

