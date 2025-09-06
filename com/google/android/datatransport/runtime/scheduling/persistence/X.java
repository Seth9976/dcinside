package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;

public final class x implements b {
    public final String a;
    public final com.google.android.datatransport.runtime.firebase.transport.c.b b;
    public final long c;

    public x(String s, com.google.android.datatransport.runtime.firebase.transport.c.b c$b0, long v) {
        this.a = s;
        this.b = c$b0;
        this.c = v;
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.persistence.N$b
    public final Object apply(Object object0) {
        return N.r3(this.a, this.b, this.c, ((SQLiteDatabase)object0));
    }
}

