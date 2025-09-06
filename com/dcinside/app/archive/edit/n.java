package com.dcinside.app.archive.edit;

import com.dcinside.app.realm.c;
import io.realm.F0.d;
import io.realm.F0;

public final class n implements d {
    public final ArchiveEditActivity a;
    public final int[] b;
    public final c c;

    public n(ArchiveEditActivity archiveEditActivity0, int[] arr_v, c c0) {
        this.a = archiveEditActivity0;
        this.b = arr_v;
        this.c = c0;
    }

    @Override  // io.realm.F0$d
    public final void a(F0 f00) {
        g.c(this.a, this.b, this.c, f00);
    }
}

