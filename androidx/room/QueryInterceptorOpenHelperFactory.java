package androidx.room;

import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Factory;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.L;
import y4.l;

public final class QueryInterceptorOpenHelperFactory implements Factory {
    @l
    private final Factory a;
    @l
    private final Executor b;
    @l
    private final QueryCallback c;

    public QueryInterceptorOpenHelperFactory(@l Factory supportSQLiteOpenHelper$Factory0, @l Executor executor0, @l QueryCallback roomDatabase$QueryCallback0) {
        L.p(supportSQLiteOpenHelper$Factory0, "delegate");
        L.p(executor0, "queryCallbackExecutor");
        L.p(roomDatabase$QueryCallback0, "queryCallback");
        super();
        this.a = supportSQLiteOpenHelper$Factory0;
        this.b = executor0;
        this.c = roomDatabase$QueryCallback0;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper$Factory
    @l
    public SupportSQLiteOpenHelper a(@l Configuration supportSQLiteOpenHelper$Configuration0) {
        L.p(supportSQLiteOpenHelper$Configuration0, "configuration");
        return new QueryInterceptorOpenHelper(this.a.a(supportSQLiteOpenHelper$Configuration0), this.b, this.c);
    }
}

