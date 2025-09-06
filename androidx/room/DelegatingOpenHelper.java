package androidx.room;

import androidx.sqlite.db.SupportSQLiteOpenHelper;
import y4.l;

public interface DelegatingOpenHelper {
    @l
    SupportSQLiteOpenHelper getDelegate();
}

