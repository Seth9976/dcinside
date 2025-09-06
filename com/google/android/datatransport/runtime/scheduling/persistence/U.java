package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import java.util.Map;

public final class u implements b {
    public final Map a;

    public u(Map map0) {
        this.a = map0;
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.persistence.N$b
    public final Object apply(Object object0) {
        return N.Y2(this.a, ((Cursor)object0));
    }
}

