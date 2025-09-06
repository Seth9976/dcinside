package androidx.room;

import androidx.annotation.RequiresApi;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class QueryInterceptorOpenHelper implements DelegatingOpenHelper, SupportSQLiteOpenHelper {
    @l
    private final SupportSQLiteOpenHelper a;
    @l
    private final Executor b;
    @l
    private final QueryCallback c;

    public QueryInterceptorOpenHelper(@l SupportSQLiteOpenHelper supportSQLiteOpenHelper0, @l Executor executor0, @l QueryCallback roomDatabase$QueryCallback0) {
        L.p(supportSQLiteOpenHelper0, "delegate");
        L.p(executor0, "queryCallbackExecutor");
        L.p(roomDatabase$QueryCallback0, "queryCallback");
        super();
        this.a = supportSQLiteOpenHelper0;
        this.b = executor0;
        this.c = roomDatabase$QueryCallback0;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper
    public void close() {
        this.a.close();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper
    @m
    public String getDatabaseName() {
        return this.a.getDatabaseName();
    }

    @Override  // androidx.room.DelegatingOpenHelper
    @l
    public SupportSQLiteOpenHelper getDelegate() {
        return this.a;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper
    @l
    public SupportSQLiteDatabase getReadableDatabase() {
        return new QueryInterceptorDatabase(this.getDelegate().getReadableDatabase(), this.b, this.c);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper
    @l
    public SupportSQLiteDatabase getWritableDatabase() {
        return new QueryInterceptorDatabase(this.getDelegate().getWritableDatabase(), this.b, this.c);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper
    @RequiresApi(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.a.setWriteAheadLoggingEnabled(z);
    }
}

