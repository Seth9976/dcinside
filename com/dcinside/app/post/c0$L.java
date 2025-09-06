package com.dcinside.app.post;

import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@f(c = "com.dcinside.app.post.PostContainerActivity$onChildViewAdded$1", f = "PostContainerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class c0.L extends o implements A3.o {
    int k;
    final c0 l;

    c0.L(c0 c00, d d0) {
        this.l = c00;
        super(2, d0);
    }

    @Override  // kotlin.coroutines.jvm.internal.a
    @l
    public final d create(@m Object object0, @l d d0) {
        return new c0.L(this.l, d0);
    }

    @Override  // A3.o
    public Object invoke(Object object0, Object object1) {
        return this.invoke(((O)object0), ((d)object1));
    }

    @m
    public final Object invoke(@l O o0, @m d d0) {
        return ((c0.L)this.create(o0, d0)).invokeSuspend(S0.a);
    }

    @Override  // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object object0) {
        if(this.k != 0) {
            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
        }
        f0.n(object0);
        this.l.j3();
        this.l.f5();
        return S0.a;
    }
}

