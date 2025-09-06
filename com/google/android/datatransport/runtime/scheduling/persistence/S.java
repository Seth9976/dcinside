package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.r;

public final class s implements b {
    public final long a;
    public final r b;

    public s(long v, r r0) {
        this.a = v;
        this.b = r0;
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.persistence.N$b
    public final Object apply(Object object0) {
        return N.s3(this.a, this.b, ((SQLiteDatabase)object0));
    }
}

