package androidx.room;

import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Factory;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import kotlin.jvm.internal.L;
import y4.l;

public final class AutoClosingRoomOpenHelperFactory implements Factory {
    @l
    private final Factory a;
    @l
    private final AutoCloser b;

    public AutoClosingRoomOpenHelperFactory(@l Factory supportSQLiteOpenHelper$Factory0, @l AutoCloser autoCloser0) {
        L.p(supportSQLiteOpenHelper$Factory0, "delegate");
        L.p(autoCloser0, "autoCloser");
        super();
        this.a = supportSQLiteOpenHelper$Factory0;
        this.b = autoCloser0;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper$Factory
    public SupportSQLiteOpenHelper a(Configuration supportSQLiteOpenHelper$Configuration0) {
        return this.b(supportSQLiteOpenHelper$Configuration0);
    }

    @l
    public AutoClosingRoomOpenHelper b(@l Configuration supportSQLiteOpenHelper$Configuration0) {
        L.p(supportSQLiteOpenHelper$Configuration0, "configuration");
        return new AutoClosingRoomOpenHelper(this.a.a(supportSQLiteOpenHelper$Configuration0), this.b);
    }
}

