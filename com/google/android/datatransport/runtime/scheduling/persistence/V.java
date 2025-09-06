package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;

public final class v implements b {
    public final N a;
    public final long b;

    public v(N n0, long v) {
        this.a = n0;
        this.b = v;
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.persistence.N$b
    public final Object apply(Object object0) {
        return this.a.N1(this.b, ((SQLiteDatabase)object0));
    }
}

