package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import com.google.android.datatransport.runtime.r;
import java.util.List;

public final class m implements b {
    public final N a;
    public final List b;
    public final r c;

    public m(N n0, List list0, r r0) {
        this.a = n0;
        this.b = list0;
        this.c = r0;
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.persistence.N$b
    public final Object apply(Object object0) {
        return this.a.R2(this.b, this.c, ((Cursor)object0));
    }
}

