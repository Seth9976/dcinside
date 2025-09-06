package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class FrameworkSQLiteStatement extends FrameworkSQLiteProgram implements SupportSQLiteStatement {
    @l
    private final SQLiteStatement b;

    public FrameworkSQLiteStatement(@l SQLiteStatement sQLiteStatement0) {
        L.p(sQLiteStatement0, "delegate");
        super(sQLiteStatement0);
        this.b = sQLiteStatement0;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteStatement
    public long D0() {
        return this.b.simpleQueryForLong();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteStatement
    @m
    public String E2() {
        return this.b.simpleQueryForString();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteStatement
    public int O() {
        return this.b.executeUpdateDelete();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteStatement
    public long Z2() {
        return this.b.executeInsert();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteStatement
    public void execute() {
        this.b.execute();
    }
}

