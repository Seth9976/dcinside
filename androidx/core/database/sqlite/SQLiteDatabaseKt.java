package androidx.core.database.sqlite;

import android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.functions.Function1;
import y4.l;

public final class SQLiteDatabaseKt {
    public static final Object a(@l SQLiteDatabase sQLiteDatabase0, boolean z, @l Function1 function10) {
        if(z) {
            sQLiteDatabase0.beginTransaction();
        }
        else {
            sQLiteDatabase0.beginTransactionNonExclusive();
        }
        try {
            Object object0 = function10.invoke(sQLiteDatabase0);
            sQLiteDatabase0.setTransactionSuccessful();
            return object0;
        }
        finally {
            sQLiteDatabase0.endTransaction();
        }
    }

    public static Object b(SQLiteDatabase sQLiteDatabase0, boolean z, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            z = true;
        }
        if(z) {
            sQLiteDatabase0.beginTransaction();
        }
        else {
            sQLiteDatabase0.beginTransactionNonExclusive();
        }
        try {
            Object object1 = function10.invoke(sQLiteDatabase0);
            sQLiteDatabase0.setTransactionSuccessful();
            return object1;
        }
        finally {
            sQLiteDatabase0.endTransaction();
        }
    }
}

