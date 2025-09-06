package com.dcinside.app.write;

import io.realm.F0.d;
import io.realm.F0;
import java.util.List;

public final class b1 implements d {
    public final List a;
    public final boolean b;
    public final PostWriteActivity c;

    public b1(List list0, boolean z, PostWriteActivity postWriteActivity0) {
        this.a = list0;
        this.b = z;
        this.c = postWriteActivity0;
    }

    @Override  // io.realm.F0$d
    public final void a(F0 f00) {
        i1.c(this.a, this.b, this.c, f00);
    }
}

