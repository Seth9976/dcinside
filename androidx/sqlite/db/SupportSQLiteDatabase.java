package androidx.sqlite.db;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import androidx.annotation.RequiresApi;
import java.io.Closeable;
import java.util.List;
import java.util.Locale;
import y4.l;
import y4.m;

public interface SupportSQLiteDatabase extends Closeable {
    void F2(@l SQLiteTransactionListener arg1);

    long G0();

    int H0(@l String arg1, @m String arg2, @m Object[] arg3);

    void H2();

    @m
    List I0();

    void I3(@l SQLiteTransactionListener arg1);

    @RequiresApi(api = 16)
    void J0();

    boolean J3();

    @RequiresApi(api = 16)
    @l
    Cursor K0(@l SupportSQLiteQuery arg1, @m CancellationSignal arg2);

    void M0();

    @RequiresApi(api = 16)
    boolean M3();

    boolean N0();

    boolean O0();

    void O3(int arg1);

    boolean P0(int arg1);

    void P3(long arg1);

    @l
    Cursor Q0(@l SupportSQLiteQuery arg1);

    @l
    Cursor R0(@l String arg1, @l Object[] arg2);

    void W1(@l String arg1) throws SQLException;

    void W2(@l String arg1, @SuppressLint({"ArrayReturn"}) @m Object[] arg2);

    boolean a2();

    void beginTransaction();

    boolean c3(long arg1);

    @l
    SupportSQLiteStatement f3(@l String arg1);

    @m
    String getPath();

    int getVersion();

    boolean isOpen();

    boolean l3();

    @RequiresApi(api = 16)
    void n1(boolean arg1);

    long p1();

    boolean s2();

    void setLocale(@l Locale arg1);

    void setVersion(int arg1);

    int t3(@l String arg1, int arg2, @l ContentValues arg3, @m String arg4, @m Object[] arg5);

    void u2();

    void v2(@l String arg1, @l Object[] arg2) throws SQLException;

    long w2(long arg1);

    boolean w3();

    @l
    Cursor x3(@l String arg1);

    long y1(@l String arg1, int arg2, @l ContentValues arg3) throws SQLException;
}

