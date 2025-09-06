package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import com.google.android.datatransport.runtime.firebase.transport.a.a;
import java.util.Map;

public final class r implements b {
    public final N a;
    public final Map b;
    public final a c;

    public r(N n0, Map map0, a a$a0) {
        this.a = n0;
        this.b = map0;
        this.c = a$a0;
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.persistence.N$b
    public final Object apply(Object object0) {
        return this.a.L2(this.b, this.c, ((Cursor)object0));
    }
}

