package com.dcinside.app.write;

import io.realm.F0.d;
import io.realm.F0;

public final class b0 implements d {
    public final long a;
    public final F0 b;

    public b0(long v, F0 f00) {
        this.a = v;
        this.b = f00;
    }

    @Override  // io.realm.F0$d
    public final void a(F0 f00) {
        PostWriteActivity.Y8(this.a, this.b, f00);
    }
}

