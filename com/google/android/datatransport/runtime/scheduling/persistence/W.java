package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;

public final class w implements b {
    public final N a;
    public final String b;
    public final String c;

    public w(N n0, String s, String s1) {
        this.a = n0;
        this.b = s;
        this.c = s1;
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.persistence.N$b
    public final Object apply(Object object0) {
        return this.a.n3(this.b, this.c, ((SQLiteDatabase)object0));
    }
}

