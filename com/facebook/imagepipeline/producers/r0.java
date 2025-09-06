package com.facebook.imagepipeline.producers;

import com.facebook.common.executors.i;
import java.util.Map;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public abstract class r0 extends i {
    @l
    private final n g;
    @l
    private final l0 h;
    @l
    private final j0 i;
    @l
    private final String j;

    public r0(@l n n0, @l l0 l00, @l j0 j00, @l String s) {
        L.p(n0, "consumer");
        L.p(l00, "producerListener");
        L.p(j00, "producerContext");
        L.p(s, "producerName");
        super();
        this.g = n0;
        this.h = l00;
        this.i = j00;
        this.j = s;
        l00.b(j00, s);
    }

    @Override  // com.facebook.common.executors.i
    protected abstract void b(@m Object arg1);

    @Override  // com.facebook.common.executors.i
    protected void d() {
        boolean z = !this.h.f(this.i, this.j);
        this.h.d(this.i, this.j, null);
        this.g.a();
    }

    @Override  // com.facebook.common.executors.i
    protected void e(@l Exception exception0) {
        L.p(exception0, "e");
        boolean z = !this.h.f(this.i, this.j);
        this.h.k(this.i, this.j, exception0, null);
        this.g.onFailure(exception0);
    }

    @Override  // com.facebook.common.executors.i
    protected void f(@m Object object0) {
        Map map0 = this.h.f(this.i, this.j) ? this.i(object0) : null;
        this.h.j(this.i, this.j, map0);
        this.g.b(object0, 1);
    }

    @m
    protected Map g() [...] // Inlined contents

    @m
    protected Map h(@m Exception exception0) [...] // Inlined contents

    @m
    protected Map i(@m Object object0) {
        return null;
    }
}

