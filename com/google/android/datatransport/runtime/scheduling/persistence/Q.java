package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.r;

public final class q implements b {
    public final N a;
    public final r b;

    public q(N n0, r r0) {
        this.a = n0;
        this.b = r0;
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.persistence.N$b
    public final Object apply(Object object0) {
        return this.a.t2(this.b, ((SQLiteDatabase)object0));
    }
}

