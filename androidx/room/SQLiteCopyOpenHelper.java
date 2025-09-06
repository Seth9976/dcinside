package androidx.room;

import android.content.Context;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.room.util.DBUtil;
import androidx.room.util.FileUtil;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory;
import androidx.sqlite.util.ProcessLock;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import kotlin.io.c;
import kotlin.jvm.internal.L;
import kotlin.ranges.s;
import y4.l;
import y4.m;

public final class SQLiteCopyOpenHelper implements DelegatingOpenHelper, SupportSQLiteOpenHelper {
    @l
    private final Context a;
    @m
    private final String b;
    @m
    private final File c;
    @m
    private final Callable d;
    private final int e;
    @l
    private final SupportSQLiteOpenHelper f;
    private DatabaseConfiguration g;
    private boolean h;

    public SQLiteCopyOpenHelper(@l Context context0, @m String s, @m File file0, @m Callable callable0, int v, @l SupportSQLiteOpenHelper supportSQLiteOpenHelper0) {
        L.p(context0, "context");
        L.p(supportSQLiteOpenHelper0, "delegate");
        super();
        this.a = context0;
        this.b = s;
        this.c = file0;
        this.d = callable0;
        this.e = v;
        this.f = supportSQLiteOpenHelper0;
    }

    private final void a(File file0, boolean z) throws IOException {
        InputStream inputStream0;
        ReadableByteChannel readableByteChannel0;
        if(this.b == null) {
            if(this.c != null) {
                readableByteChannel0 = new FileInputStream(this.c).getChannel();
                L.o(readableByteChannel0, "FileInputStream(copyFromFile).channel");
                goto label_16;
            }
            Callable callable0 = this.d;
            if(callable0 == null) {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
            try {
                inputStream0 = (InputStream)callable0.call();
            }
            catch(Exception exception0) {
                throw new IOException("inputStreamCallable exception on call", exception0);
            }
            readableByteChannel0 = Channels.newChannel(inputStream0);
            L.o(readableByteChannel0, "newChannel(inputStream)");
        }
        else {
            readableByteChannel0 = Channels.newChannel(this.a.getAssets().open(this.b));
            L.o(readableByteChannel0, "newChannel(context.assets.open(copyFromAssetPath))");
        }
    label_16:
        File file1 = File.createTempFile("room-copy-helper", ".tmp", this.a.getCacheDir());
        file1.deleteOnExit();
        FileChannel fileChannel0 = new FileOutputStream(file1).getChannel();
        L.o(fileChannel0, "output");
        FileUtil.a(readableByteChannel0, fileChannel0);
        File file2 = file0.getParentFile();
        if(file2 != null && !file2.exists() && !file2.mkdirs()) {
            throw new IOException("Failed to create directories for " + file0.getAbsolutePath());
        }
        L.o(file1, "intermediateFile");
        this.c(file1, z);
        if(!file1.renameTo(file0)) {
            throw new IOException("Failed to move intermediate file (" + file1.getAbsolutePath() + ") to destination (" + file0.getAbsolutePath() + ").");
        }
    }

    private final SupportSQLiteOpenHelper b(File file0) {
        try {
            int v = DBUtil.g(file0);
            return new FrameworkSQLiteOpenHelperFactory().a(Configuration.f.a(this.a).d(file0.getAbsolutePath()).c(new Callback(/*ERROR_MISSING_ARG_1/*) {
                @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper$Callback
                public void d(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
                    L.p(supportSQLiteDatabase0, "db");
                }

                @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper$Callback
                public void f(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
                    L.p(supportSQLiteDatabase0, "db");
                    int v = s.u(v, 1);
                    if(v < 1) {
                        supportSQLiteDatabase0.setVersion(v);
                    }
                }

                @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper$Callback
                public void g(@l SupportSQLiteDatabase supportSQLiteDatabase0, int v, int v1) {
                    L.p(supportSQLiteDatabase0, "db");
                }
            }).b());
        }
        catch(IOException iOException0) {
            throw new RuntimeException("Malformed database file, unable to read version.", iOException0);
        }
    }

    private final void c(File file0, boolean z) {
        DatabaseConfiguration databaseConfiguration0 = this.g;
        if(databaseConfiguration0 == null) {
            L.S("databaseConfiguration");
            databaseConfiguration0 = null;
        }
        if(databaseConfiguration0.q == null) {
            return;
        }
        SupportSQLiteOpenHelper supportSQLiteOpenHelper0 = this.b(file0);
        try {
            SupportSQLiteDatabase supportSQLiteDatabase0 = z ? supportSQLiteOpenHelper0.getWritableDatabase() : supportSQLiteOpenHelper0.getReadableDatabase();
            DatabaseConfiguration databaseConfiguration1 = this.g;
            if(databaseConfiguration1 == null) {
                L.S("databaseConfiguration");
                databaseConfiguration1 = null;
            }
            L.m(databaseConfiguration1.q);
            databaseConfiguration1.q.a(supportSQLiteDatabase0);
            goto label_20;
        }
        catch(Throwable throwable0) {
        }
        try {
            throw throwable0;
        }
        catch(Throwable throwable1) {
            c.a(supportSQLiteOpenHelper0, throwable0);
            throw throwable1;
        }
    label_20:
        c.a(supportSQLiteOpenHelper0, null);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper
    public void close() {
        synchronized(this) {
            this.getDelegate().close();
            this.h = false;
        }
    }

    public final void e(@l DatabaseConfiguration databaseConfiguration0) {
        L.p(databaseConfiguration0, "databaseConfiguration");
        this.g = databaseConfiguration0;
    }

    private final void f(boolean z) {
        String s = this.getDatabaseName();
        if(s == null) {
            throw new IllegalStateException("Required value was null.");
        }
        File file0 = this.a.getDatabasePath(s);
        DatabaseConfiguration databaseConfiguration0 = this.g;
        DatabaseConfiguration databaseConfiguration1 = null;
        if(databaseConfiguration0 == null) {
            L.S("databaseConfiguration");
            databaseConfiguration0 = null;
        }
        ProcessLock processLock0 = new ProcessLock(s, this.a.getFilesDir(), databaseConfiguration0.t);
        try {
            ProcessLock.c(processLock0, false, 1, null);
            if(!file0.exists()) {
                try {
                    L.o(file0, "databaseFile");
                    this.a(file0, z);
                }
                catch(IOException iOException0) {
                    throw new RuntimeException("Unable to copy database file.", iOException0);
                }
                return;
            }
            try {
                L.o(file0, "databaseFile");
                int v1 = DBUtil.g(file0);
            }
            catch(IOException iOException1) {
                Log.w("ROOM", "Unable to read database version.", iOException1);
                return;
            }
            if(v1 == this.e) {
                return;
            }
            DatabaseConfiguration databaseConfiguration2 = this.g;
            if(databaseConfiguration2 == null) {
                L.S("databaseConfiguration");
            }
            else {
                databaseConfiguration1 = databaseConfiguration2;
            }
            if(databaseConfiguration1.a(v1, this.e)) {
                return;
            }
            if(this.a.deleteDatabase(s)) {
                try {
                    this.a(file0, z);
                }
                catch(IOException iOException2) {
                    Log.w("ROOM", "Unable to copy database file.", iOException2);
                }
            }
            else {
                Log.w("ROOM", "Failed to delete database file (" + s + ") for a copy destructive migration.");
            }
        }
        finally {
            processLock0.d();
        }
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper
    @m
    public String getDatabaseName() {
        return this.getDelegate().getDatabaseName();
    }

    @Override  // androidx.room.DelegatingOpenHelper
    @l
    public SupportSQLiteOpenHelper getDelegate() {
        return this.f;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper
    @l
    public SupportSQLiteDatabase getReadableDatabase() {
        if(!this.h) {
            this.f(false);
            this.h = true;
        }
        return this.getDelegate().getReadableDatabase();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper
    @l
    public SupportSQLiteDatabase getWritableDatabase() {
        if(!this.h) {
            this.f(true);
            this.h = true;
        }
        return this.getDelegate().getWritableDatabase();
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper
    @RequiresApi(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.getDelegate().setWriteAheadLoggingEnabled(z);
    }
}

