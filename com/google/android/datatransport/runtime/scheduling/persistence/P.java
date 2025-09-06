package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.j;
import com.google.android.datatransport.runtime.r;

public final class p implements b {
    public final N a;
    public final j b;
    public final r c;

    public p(N n0, j j0, r r0) {
        this.a = n0;
        this.b = j0;
        this.c = r0;
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.persistence.N$b
    public final Object apply(Object object0) {
        return this.a.b3(this.b, this.c, ((SQLiteDatabase)object0));
    }
}

