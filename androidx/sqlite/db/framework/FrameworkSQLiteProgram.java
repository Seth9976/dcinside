package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteProgram;
import androidx.sqlite.db.SupportSQLiteProgram;
import kotlin.jvm.internal.L;
import y4.l;

public class FrameworkSQLiteProgram implements SupportSQLiteProgram {
    @l
    private final SQLiteProgram a;

    public FrameworkSQLiteProgram(@l SQLiteProgram sQLiteProgram0) {
        L.p(sQLiteProgram0, "delegate");
        super();
        this.a = sQLiteProgram0;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void H1(int v) {
        this.a.bindNull(v);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void Q3() {
        this.a.clearBindings();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void S0(int v, @l String s) {
        L.p(s, "value");
        this.a.bindString(v, s);
    }

    @Override
    public void close() {
        this.a.close();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void f2(int v, double f) {
        this.a.bindDouble(v, f);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void o1(int v, long v1) {
        this.a.bindLong(v, v1);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteProgram
    public void r1(int v, @l byte[] arr_b) {
        L.p(arr_b, "value");
        this.a.bindBlob(v, arr_b);
    }
}

