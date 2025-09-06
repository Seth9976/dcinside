package androidx.sqlite.db.framework;

import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Factory;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import kotlin.jvm.internal.L;
import y4.l;

public final class FrameworkSQLiteOpenHelperFactory implements Factory {
    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper$Factory
    @l
    public SupportSQLiteOpenHelper a(@l Configuration supportSQLiteOpenHelper$Configuration0) {
        L.p(supportSQLiteOpenHelper$Configuration0, "configuration");
        return new FrameworkSQLiteOpenHelper(supportSQLiteOpenHelper$Configuration0.a, supportSQLiteOpenHelper$Configuration0.b, supportSQLiteOpenHelper$Configuration0.c, supportSQLiteOpenHelper$Configuration0.d, supportSQLiteOpenHelper$Configuration0.e);
    }
}

