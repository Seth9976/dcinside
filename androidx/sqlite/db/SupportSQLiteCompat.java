package androidx.sqlite.db;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;
import z3.n;

@RestrictTo({Scope.b})
public final class SupportSQLiteCompat {
    @RequiresApi(16)
    @RestrictTo({Scope.b})
    public static final class Api16Impl {
        @l
        public static final Api16Impl a;

        static {
            Api16Impl.a = new Api16Impl();
        }

        @RestrictTo({Scope.b})
        @n
        public static final void a(@l CancellationSignal cancellationSignal0) {
            L.p(cancellationSignal0, "cancellationSignal");
            cancellationSignal0.cancel();
        }

        @RestrictTo({Scope.b})
        @l
        @n
        public static final CancellationSignal b() {
            return new CancellationSignal();
        }

        @RestrictTo({Scope.b})
        @n
        public static final boolean c(@l File file0) {
            L.p(file0, "file");
            return SQLiteDatabase.deleteDatabase(file0);
        }

        @RestrictTo({Scope.b})
        @n
        public static final void d(@l SQLiteDatabase sQLiteDatabase0) {
            L.p(sQLiteDatabase0, "sQLiteDatabase");
            sQLiteDatabase0.disableWriteAheadLogging();
        }

        @RestrictTo({Scope.b})
        @n
        public static final boolean e(@l SQLiteDatabase sQLiteDatabase0) {
            L.p(sQLiteDatabase0, "sQLiteDatabase");
            return sQLiteDatabase0.isWriteAheadLoggingEnabled();
        }

        @RestrictTo({Scope.b})
        @l
        @n
        public static final Cursor f(@l SQLiteDatabase sQLiteDatabase0, @l String s, @l String[] arr_s, @m String s1, @l CancellationSignal cancellationSignal0, @l SQLiteDatabase.CursorFactory sQLiteDatabase$CursorFactory0) {
            L.p(sQLiteDatabase0, "sQLiteDatabase");
            L.p(s, "sql");
            L.p(arr_s, "selectionArgs");
            L.p(cancellationSignal0, "cancellationSignal");
            L.p(sQLiteDatabase$CursorFactory0, "cursorFactory");
            Cursor cursor0 = sQLiteDatabase0.rawQueryWithFactory(sQLiteDatabase$CursorFactory0, s, arr_s, s1, cancellationSignal0);
            L.o(cursor0, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
            return cursor0;
        }

        @RestrictTo({Scope.b})
        @n
        public static final void g(@l SQLiteDatabase sQLiteDatabase0, boolean z) {
            L.p(sQLiteDatabase0, "sQLiteDatabase");
            sQLiteDatabase0.setForeignKeyConstraintsEnabled(z);
        }

        @RestrictTo({Scope.b})
        @n
        public static final void h(@l SQLiteOpenHelper sQLiteOpenHelper0, boolean z) {
            L.p(sQLiteOpenHelper0, "sQLiteOpenHelper");
            sQLiteOpenHelper0.setWriteAheadLoggingEnabled(z);
        }
    }

    @RequiresApi(19)
    @RestrictTo({Scope.b})
    public static final class Api19Impl {
        @l
        public static final Api19Impl a;

        static {
            Api19Impl.a = new Api19Impl();
        }

        @RestrictTo({Scope.b})
        @l
        @n
        public static final Uri a(@l Cursor cursor0) {
            L.p(cursor0, "cursor");
            Uri uri0 = cursor0.getNotificationUri();
            L.o(uri0, "cursor.notificationUri");
            return uri0;
        }

        @RestrictTo({Scope.b})
        @n
        public static final boolean b(@l ActivityManager activityManager0) {
            L.p(activityManager0, "activityManager");
            return activityManager0.isLowRamDevice();
        }
    }

    @RequiresApi(21)
    @RestrictTo({Scope.b})
    public static final class Api21Impl {
        @l
        public static final Api21Impl a;

        static {
            Api21Impl.a = new Api21Impl();
        }

        @RestrictTo({Scope.b})
        @l
        @n
        public static final File a(@l Context context0) {
            L.p(context0, "context");
            File file0 = context0.getNoBackupFilesDir();
            L.o(file0, "context.noBackupFilesDir");
            return file0;
        }
    }

    @RequiresApi(23)
    @RestrictTo({Scope.b})
    public static final class Api23Impl {
        @l
        public static final Api23Impl a;

        static {
            Api23Impl.a = new Api23Impl();
        }

        @RestrictTo({Scope.b})
        @n
        public static final void a(@l Cursor cursor0, @l Bundle bundle0) {
            L.p(cursor0, "cursor");
            L.p(bundle0, "extras");
            cursor0.setExtras(bundle0);
        }
    }

    @RequiresApi(29)
    @RestrictTo({Scope.b})
    public static final class Api29Impl {
        @l
        public static final Api29Impl a;

        static {
            Api29Impl.a = new Api29Impl();
        }

        @RestrictTo({Scope.b})
        @l
        @n
        public static final List a(@l Cursor cursor0) {
            L.p(cursor0, "cursor");
            List list0 = cursor0.getNotificationUris();
            L.m(list0);
            return list0;
        }

        @RestrictTo({Scope.b})
        @n
        public static final void b(@l Cursor cursor0, @l ContentResolver contentResolver0, @l List list0) {
            L.p(cursor0, "cursor");
            L.p(contentResolver0, "cr");
            L.p(list0, "uris");
            cursor0.setNotificationUris(contentResolver0, list0);
        }
    }

}

