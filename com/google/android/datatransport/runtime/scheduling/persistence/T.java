package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;

public final class t implements b {
    public final N a;

    public t(N n0) {
        this.a = n0;
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.persistence.N$b
    public final Object apply(Object object0) {
        return this.a.v3(((SQLiteDatabase)object0));
    }
}

