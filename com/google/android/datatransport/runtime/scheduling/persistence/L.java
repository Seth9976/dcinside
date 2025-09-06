package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.firebase.transport.a.a;
import java.util.Map;

public final class l implements b {
    public final N a;
    public final String b;
    public final Map c;
    public final a d;

    public l(N n0, String s, Map map0, a a$a0) {
        this.a = n0;
        this.b = s;
        this.c = map0;
        this.d = a$a0;
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.persistence.N$b
    public final Object apply(Object object0) {
        return this.a.P2(this.b, this.c, this.d, ((SQLiteDatabase)object0));
    }
}

