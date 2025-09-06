package androidx.room.util;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteCompat.Api16Impl;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import kotlin.collections.u;
import kotlin.io.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.k;
import kotlin.text.v;
import y4.l;
import y4.m;
import z3.i;

@RestrictTo({Scope.c})
@s0({"SMAP\nDBUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DBUtil.kt\nandroidx/room/util/DBUtil\n+ 2 CursorUtil.kt\nandroidx/room/util/CursorUtil\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,214:1\n145#2,7:215\n145#2,7:224\n1855#3,2:222\n*S KotlinDebug\n*F\n+ 1 DBUtil.kt\nandroidx/room/util/DBUtil\n*L\n100#1:215,7\n121#1:224,7\n107#1:222,2\n*E\n"})
@i(name = "DBUtil")
public final class DBUtil {
    @m
    public static final CancellationSignal a() {
        return Api16Impl.b();
    }

    public static final void b(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
        L.p(supportSQLiteDatabase0, "db");
        List list0 = u.i();
        Cursor cursor0 = supportSQLiteDatabase0.x3("SELECT name FROM sqlite_master WHERE type = \'trigger\'");
        try {
            while(true) {
                if(!cursor0.moveToNext()) {
                    goto label_11;
                }
                list0.add(cursor0.getString(0));
            }
        }
        catch(Throwable throwable0) {
        }
        try {
            throw throwable0;
        }
        catch(Throwable throwable1) {
            c.a(cursor0, throwable0);
            throw throwable1;
        }
    label_11:
        c.a(cursor0, null);
        for(Object object0: u.a(list0)) {
            String s = (String)object0;
            L.o(s, "triggerName");
            if(v.v2(s, "room_fts_content_sync_", false, 2, null)) {
                supportSQLiteDatabase0.W1("DROP TRIGGER IF EXISTS " + s);
            }
        }
    }

    public static final void c(@l SupportSQLiteDatabase supportSQLiteDatabase0, @l String s) {
        L.p(supportSQLiteDatabase0, "db");
        L.p(s, "tableName");
        Cursor cursor0 = supportSQLiteDatabase0.x3("PRAGMA foreign_key_check(`" + s + "`)");
        try {
            if(cursor0.getCount() > 0) {
                throw new SQLiteConstraintException(DBUtil.d(cursor0));
            }
        }
        catch(Throwable throwable0) {
            c.a(cursor0, throwable0);
            throw throwable0;
        }
        c.a(cursor0, null);
    }

    private static final String d(Cursor cursor0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        int v = cursor0.getCount();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        while(cursor0.moveToNext()) {
            if(cursor0.isFirst()) {
                stringBuilder0.append("Foreign key violation(s) detected in \'");
                stringBuilder0.append(cursor0.getString(0));
                stringBuilder0.append("\'.\n");
            }
            String s = cursor0.getString(3);
            if(!linkedHashMap0.containsKey(s)) {
                L.o(s, "constraintIndex");
                String s1 = cursor0.getString(2);
                L.o(s1, "cursor.getString(2)");
                linkedHashMap0.put(s, s1);
            }
        }
        stringBuilder0.append("Number of different violations discovered: ");
        stringBuilder0.append(linkedHashMap0.keySet().size());
        stringBuilder0.append("\n");
        stringBuilder0.append("Number of rows in violation: ");
        stringBuilder0.append(v);
        stringBuilder0.append("\n");
        stringBuilder0.append("Violation(s) detected in the following constraint(s):\n");
        for(Object object0: linkedHashMap0.entrySet()) {
            String s2 = (String)((Map.Entry)object0).getKey();
            String s3 = (String)((Map.Entry)object0).getValue();
            stringBuilder0.append("\tParent Table = ");
            stringBuilder0.append(s3);
            stringBuilder0.append(", Foreign Key Constraint Index = ");
            stringBuilder0.append(s2);
            stringBuilder0.append("\n");
        }
        String s4 = stringBuilder0.toString();
        L.o(s4, "StringBuilder().apply(builderAction).toString()");
        return s4;
    }

    @k(message = "This is only used in the generated code and shouldn\'t be called directly.")
    @l
    public static final Cursor e(@l RoomDatabase roomDatabase0, @l SupportSQLiteQuery supportSQLiteQuery0, boolean z) {
        L.p(roomDatabase0, "db");
        L.p(supportSQLiteQuery0, "sqLiteQuery");
        return DBUtil.f(roomDatabase0, supportSQLiteQuery0, z, null);
    }

    @l
    public static final Cursor f(@l RoomDatabase roomDatabase0, @l SupportSQLiteQuery supportSQLiteQuery0, boolean z, @m CancellationSignal cancellationSignal0) {
        L.p(roomDatabase0, "db");
        L.p(supportSQLiteQuery0, "sqLiteQuery");
        Cursor cursor0 = roomDatabase0.K(supportSQLiteQuery0, cancellationSignal0);
        if(z && cursor0 instanceof AbstractWindowedCursor) {
            int v = ((AbstractWindowedCursor)cursor0).getCount();
            int v1 = ((AbstractWindowedCursor)cursor0).hasWindow() ? ((AbstractWindowedCursor)cursor0).getWindow().getNumRows() : v;
            return Build.VERSION.SDK_INT >= 23 && v1 >= v ? cursor0 : CursorUtil.a(cursor0);
        }
        return cursor0;
    }

    public static final int g(@l File file0) throws IOException {
        int v;
        L.p(file0, "databaseFile");
        FileChannel fileChannel0 = new FileInputStream(file0).getChannel();
        try {
            ByteBuffer byteBuffer0 = ByteBuffer.allocate(4);
            fileChannel0.tryLock(60L, 4L, true);
            fileChannel0.position(60L);
            if(fileChannel0.read(byteBuffer0) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBuffer0.rewind();
            v = byteBuffer0.getInt();
        }
        catch(Throwable throwable0) {
            c.a(fileChannel0, throwable0);
            throw throwable0;
        }
        c.a(fileChannel0, null);
        return v;
    }
}

