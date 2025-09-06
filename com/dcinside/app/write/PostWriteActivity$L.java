package com.dcinside.app.write;

import A3.p;
import android.view.View;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@f(c = "com.dcinside.app.write.PostWriteActivity$initCallbacks$23", f = "PostWriteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class PostWriteActivity.L extends o implements p {
    int k;
    final PostWriteActivity l;

    PostWriteActivity.L(PostWriteActivity postWriteActivity0, d d0) {
        this.l = postWriteActivity0;
        super(3, d0);
    }

    @m
    public final Object a(@l O o0, @l View view0, @m d d0) {
        return new PostWriteActivity.L(this.l, d0).invokeSuspend(S0.a);
    }

    @Override  // A3.p
    public Object invoke(Object object0, Object object1, Object object2) {
        return this.a(((O)object0), ((View)object1), ((d)object2));
    }

    @Override  // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object object0) {
        if(this.k != 0) {
            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
        }
        f0.n(object0);
        this.l.X9();
        return S0.a;
    }
}

