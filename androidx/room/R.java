package androidx.room;

import androidx.sqlite.db.SupportSQLiteQuery;

public final class r implements Runnable {
    public final QueryInterceptorDatabase a;
    public final SupportSQLiteQuery b;
    public final QueryInterceptorProgram c;

    public r(QueryInterceptorDatabase queryInterceptorDatabase0, SupportSQLiteQuery supportSQLiteQuery0, QueryInterceptorProgram queryInterceptorProgram0) {
        this.a = queryInterceptorDatabase0;
        this.b = supportSQLiteQuery0;
        this.c = queryInterceptorProgram0;
    }

    @Override
    public final void run() {
        QueryInterceptorDatabase.d0(this.a, this.b, this.c);
    }
}

