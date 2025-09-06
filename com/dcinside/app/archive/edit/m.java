package com.dcinside.app.archive.edit;

import io.realm.F0.d;
import io.realm.F0;

public final class m implements d {
    public final ArchiveEditActivity a;
    public final int[] b;

    public m(ArchiveEditActivity archiveEditActivity0, int[] arr_v) {
        this.a = archiveEditActivity0;
        this.b = arr_v;
    }

    @Override  // io.realm.F0$d
    public final void a(F0 f00) {
        com.dcinside.app.archive.edit.ArchiveEditActivity.d.c(this.a, this.b, f00);
    }
}

