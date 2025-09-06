package androidx.sqlite.db.framework;

import A3.a;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.sqlite.db.SupportSQLiteCompat.Api16Impl;
import androidx.sqlite.db.SupportSQLiteCompat.Api21Impl;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.util.ProcessLock;
import java.io.File;
import kotlin.D;
import kotlin.E;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public final class FrameworkSQLiteOpenHelper implements SupportSQLiteOpenHelper {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    static final class DBRefHolder {
        @m
        private FrameworkSQLiteDatabase a;

        public DBRefHolder(@m FrameworkSQLiteDatabase frameworkSQLiteDatabase0) {
            this.a = frameworkSQLiteDatabase0;
        }

        @m
        public final FrameworkSQLiteDatabase a() {
            return this.a;
        }

        public final void b(@m FrameworkSQLiteDatabase frameworkSQLiteDatabase0) {
            this.a = frameworkSQLiteDatabase0;
        }
    }

    static final class OpenHelper extends SQLiteOpenHelper {
        static final class CallbackException extends RuntimeException {
            @l
            private final CallbackName a;
            @l
            private final Throwable b;

            public CallbackException(@l CallbackName frameworkSQLiteOpenHelper$OpenHelper$CallbackName0, @l Throwable throwable0) {
                L.p(frameworkSQLiteOpenHelper$OpenHelper$CallbackName0, "callbackName");
                L.p(throwable0, "cause");
                super(throwable0);
                this.a = frameworkSQLiteOpenHelper$OpenHelper$CallbackName0;
                this.b = throwable0;
            }

            @l
            public final CallbackName a() {
                return this.a;
            }

            @Override
            @l
            public Throwable getCause() {
                return this.b;
            }
        }

        public static enum CallbackName {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN;

            private static final CallbackName[] a() [...] // Inlined contents
        }

        @s0({"SMAP\nFrameworkSQLiteOpenHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameworkSQLiteOpenHelper.kt\nandroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,342:1\n1#2:343\n*E\n"})
        public static final class androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.Companion {
            private androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.Companion() {
            }

            public androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.Companion(w w0) {
            }

            @l
            public final FrameworkSQLiteDatabase a(@l DBRefHolder frameworkSQLiteOpenHelper$DBRefHolder0, @l SQLiteDatabase sQLiteDatabase0) {
                L.p(frameworkSQLiteOpenHelper$DBRefHolder0, "refHolder");
                L.p(sQLiteDatabase0, "sqLiteDatabase");
                FrameworkSQLiteDatabase frameworkSQLiteDatabase0 = frameworkSQLiteOpenHelper$DBRefHolder0.a();
                if(frameworkSQLiteDatabase0 == null || !frameworkSQLiteDatabase0.c(sQLiteDatabase0)) {
                    frameworkSQLiteDatabase0 = new FrameworkSQLiteDatabase(sQLiteDatabase0);
                    frameworkSQLiteOpenHelper$DBRefHolder0.b(frameworkSQLiteDatabase0);
                }
                return frameworkSQLiteDatabase0;
            }
        }

        public final class WhenMappings {
            public static final int[] a;

            static {
                int[] arr_v = new int[CallbackName.values().length];
                try {
                    arr_v[CallbackName.a.ordinal()] = 1;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[CallbackName.b.ordinal()] = 2;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[CallbackName.c.ordinal()] = 3;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[CallbackName.d.ordinal()] = 4;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[CallbackName.e.ordinal()] = 5;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                WhenMappings.a = arr_v;
            }
        }

        @l
        private final Context a;
        @l
        private final DBRefHolder b;
        @l
        private final Callback c;
        private final boolean d;
        private boolean e;
        @l
        private final ProcessLock f;
        private boolean g;
        @l
        public static final androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.Companion h;

        static {
            OpenHelper.h = new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.Companion(null);
        }

        public OpenHelper(@l Context context0, @m String s, @l DBRefHolder frameworkSQLiteOpenHelper$DBRefHolder0, @l Callback supportSQLiteOpenHelper$Callback0, boolean z) {
            L.p(context0, "context");
            L.p(frameworkSQLiteOpenHelper$DBRefHolder0, "dbRef");
            L.p(supportSQLiteOpenHelper$Callback0, "callback");
            c c0 = (SQLiteDatabase sQLiteDatabase0) -> {
                L.p(supportSQLiteOpenHelper$Callback0, "$callback");
                L.p(frameworkSQLiteOpenHelper$DBRefHolder0, "$dbRef");
                L.o(sQLiteDatabase0, "dbObj");
                supportSQLiteOpenHelper$Callback0.c(OpenHelper.h.a(frameworkSQLiteOpenHelper$DBRefHolder0, sQLiteDatabase0));
            };
            super(context0, s, null, supportSQLiteOpenHelper$Callback0.a, c0);
            this.a = context0;
            this.b = frameworkSQLiteOpenHelper$DBRefHolder0;
            this.c = supportSQLiteOpenHelper$Callback0;
            this.d = z;
            if(s == null) {
                s = "b17a4fc4-af69-42a1-bd03-fa93e8f337c0";
                L.o("b17a4fc4-af69-42a1-bd03-fa93e8f337c0", "randomUUID().toString()");
            }
            this.f = new ProcessLock(s, context0.getCacheDir(), false);
        }

        // 检测为 Lambda 实现
        private static final void b(Callback supportSQLiteOpenHelper$Callback0, DBRefHolder frameworkSQLiteOpenHelper$DBRefHolder0, SQLiteDatabase sQLiteDatabase0) [...]

        public final boolean c() {
            return this.d;
        }

        @Override  // android.database.sqlite.SQLiteOpenHelper
        public void close() {
            try {
                ProcessLock.c(this.f, false, 1, null);
                super.close();
                this.b.b(null);
                this.g = false;
            }
            finally {
                this.f.d();
            }
        }

        @l
        public final Callback e() {
            return this.c;
        }

        @l
        public final Context f() {
            return this.a;
        }

        @l
        public final DBRefHolder i() {
            return this.b;
        }

        @l
        public final SupportSQLiteDatabase j(boolean z) {
            SupportSQLiteDatabase supportSQLiteDatabase1;
            SupportSQLiteDatabase supportSQLiteDatabase0;
            SQLiteDatabase sQLiteDatabase0;
            try {
                boolean z1 = !this.g && this.getDatabaseName() != null;
                this.f.b(z1);
                this.e = false;
                sQLiteDatabase0 = this.o(z);
                if(this.e) {
                    this.close();
                    supportSQLiteDatabase0 = this.j(z);
                    goto label_7;
                }
                supportSQLiteDatabase1 = this.k(sQLiteDatabase0);
                goto label_14;
            }
            catch(Throwable throwable0) {
                this.f.d();
                throw throwable0;
            }
        label_7:
            this.f.d();
            return supportSQLiteDatabase0;
            try {
                supportSQLiteDatabase1 = this.k(sQLiteDatabase0);
            }
            catch(Throwable throwable0) {
                this.f.d();
                throw throwable0;
            }
        label_14:
            this.f.d();
            return supportSQLiteDatabase1;
        }

        @l
        public final FrameworkSQLiteDatabase k(@l SQLiteDatabase sQLiteDatabase0) {
            L.p(sQLiteDatabase0, "sqLiteDatabase");
            return OpenHelper.h.a(this.b, sQLiteDatabase0);
        }

        private final SQLiteDatabase n(boolean z) {
            SQLiteDatabase sQLiteDatabase0;
            if(z) {
                sQLiteDatabase0 = super.getWritableDatabase();
                L.o(sQLiteDatabase0, "{\n                super.…eDatabase()\n            }");
                return sQLiteDatabase0;
            }
            sQLiteDatabase0 = super.getReadableDatabase();
            L.o(sQLiteDatabase0, "{\n                super.…eDatabase()\n            }");
            return sQLiteDatabase0;
        }

        private final SQLiteDatabase o(boolean z) {
            String s = this.getDatabaseName();
            if(s != null && !this.g) {
                File file0 = this.a.getDatabasePath(s).getParentFile();
                if(file0 != null) {
                    file0.mkdirs();
                    if(!file0.isDirectory()) {
                        Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + file0);
                    }
                }
            }
            try {
                return this.n(z);
            }
            catch(Throwable unused_ex) {
                super.close();
                try {
                    Thread.sleep(500L);
                }
                catch(InterruptedException unused_ex) {
                }
                try {
                    return this.n(z);
                }
                catch(Throwable throwable0) {
                }
            }
            super.close();
            if(throwable0 instanceof CallbackException) {
                Throwable throwable1 = ((CallbackException)throwable0).getCause();
                switch(((CallbackException)throwable0).a()) {
                    case 1: 
                    case 2: 
                    case 3: 
                    case 4: {
                        throw throwable1;
                    label_18:
                        if(!(throwable1 instanceof SQLiteException)) {
                            throw throwable1;
                        }
                        goto label_21;
                    }
                    default: {
                        goto label_18;
                    }
                }
            }
            if(throwable0 instanceof SQLiteException && s != null && this.d) {
            label_21:
                this.a.deleteDatabase(s);
                try {
                    return this.n(z);
                }
                catch(CallbackException frameworkSQLiteOpenHelper$OpenHelper$CallbackException0) {
                    throw frameworkSQLiteOpenHelper$OpenHelper$CallbackException0.getCause();
                }
            }
            throw throwable0;
        }

        @Override  // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(@l SQLiteDatabase sQLiteDatabase0) {
            L.p(sQLiteDatabase0, "db");
            if(!this.e) {
                int v = sQLiteDatabase0.getVersion();
                if(this.c.a != v) {
                    sQLiteDatabase0.setMaxSqlCacheSize(1);
                }
            }
            try {
                FrameworkSQLiteDatabase frameworkSQLiteDatabase0 = this.k(sQLiteDatabase0);
                this.c.b(frameworkSQLiteDatabase0);
            }
            catch(Throwable throwable0) {
                throw new CallbackException(CallbackName.a, throwable0);
            }
        }

        @Override  // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(@l SQLiteDatabase sQLiteDatabase0) {
            L.p(sQLiteDatabase0, "sqLiteDatabase");
            try {
                FrameworkSQLiteDatabase frameworkSQLiteDatabase0 = this.k(sQLiteDatabase0);
                this.c.d(frameworkSQLiteDatabase0);
            }
            catch(Throwable throwable0) {
                throw new CallbackException(CallbackName.b, throwable0);
            }
        }

        @Override  // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(@l SQLiteDatabase sQLiteDatabase0, int v, int v1) {
            L.p(sQLiteDatabase0, "db");
            this.e = true;
            try {
                FrameworkSQLiteDatabase frameworkSQLiteDatabase0 = this.k(sQLiteDatabase0);
                this.c.e(frameworkSQLiteDatabase0, v, v1);
            }
            catch(Throwable throwable0) {
                throw new CallbackException(CallbackName.d, throwable0);
            }
        }

        @Override  // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(@l SQLiteDatabase sQLiteDatabase0) {
            L.p(sQLiteDatabase0, "db");
            if(!this.e) {
                try {
                    FrameworkSQLiteDatabase frameworkSQLiteDatabase0 = this.k(sQLiteDatabase0);
                    this.c.f(frameworkSQLiteDatabase0);
                }
                catch(Throwable throwable0) {
                    throw new CallbackException(CallbackName.e, throwable0);
                }
            }
            this.g = true;
        }

        @Override  // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(@l SQLiteDatabase sQLiteDatabase0, int v, int v1) {
            L.p(sQLiteDatabase0, "sqLiteDatabase");
            this.e = true;
            try {
                FrameworkSQLiteDatabase frameworkSQLiteDatabase0 = this.k(sQLiteDatabase0);
                this.c.g(frameworkSQLiteDatabase0, v, v1);
            }
            catch(Throwable throwable0) {
                throw new CallbackException(CallbackName.c, throwable0);
            }
        }
    }

    @l
    private final Context a;
    @m
    private final String b;
    @l
    private final Callback c;
    private final boolean d;
    private final boolean e;
    @l
    private final D f;
    private boolean g;
    @l
    public static final Companion h = null;
    @l
    private static final String i = "SupportSQLite";

    static {
        FrameworkSQLiteOpenHelper.h = new Companion(null);
    }

    @j
    public FrameworkSQLiteOpenHelper(@l Context context0, @m String s, @l Callback supportSQLiteOpenHelper$Callback0) {
        L.p(context0, "context");
        L.p(supportSQLiteOpenHelper$Callback0, "callback");
        this(context0, s, supportSQLiteOpenHelper$Callback0, false, false, 24, null);
    }

    @j
    public FrameworkSQLiteOpenHelper(@l Context context0, @m String s, @l Callback supportSQLiteOpenHelper$Callback0, boolean z) {
        L.p(context0, "context");
        L.p(supportSQLiteOpenHelper$Callback0, "callback");
        this(context0, s, supportSQLiteOpenHelper$Callback0, z, false, 16, null);
    }

    @j
    public FrameworkSQLiteOpenHelper(@l Context context0, @m String s, @l Callback supportSQLiteOpenHelper$Callback0, boolean z, boolean z1) {
        L.p(context0, "context");
        L.p(supportSQLiteOpenHelper$Callback0, "callback");
        super();
        this.a = context0;
        this.b = s;
        this.c = supportSQLiteOpenHelper$Callback0;
        this.d = z;
        this.e = z1;
        this.f = E.a(new a() {
            final FrameworkSQLiteOpenHelper e;

            {
                this.e = frameworkSQLiteOpenHelper0;
                super(0);
            }

            @l
            public final OpenHelper b() {
                OpenHelper frameworkSQLiteOpenHelper$OpenHelper0;
                if(Build.VERSION.SDK_INT < 23 || this.e.b == null || !this.e.d) {
                    frameworkSQLiteOpenHelper$OpenHelper0 = new OpenHelper(this.e.a, this.e.b, new DBRefHolder(null), this.e.c, this.e.e);
                }
                else {
                    File file0 = new File(Api21Impl.a(this.e.a), this.e.b);
                    frameworkSQLiteOpenHelper$OpenHelper0 = new OpenHelper(this.e.a, file0.getAbsolutePath(), new DBRefHolder(null), this.e.c, this.e.e);
                }
                Api16Impl.h(frameworkSQLiteOpenHelper$OpenHelper0, this.e.g);
                return frameworkSQLiteOpenHelper$OpenHelper0;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        });
    }

    public FrameworkSQLiteOpenHelper(Context context0, String s, Callback supportSQLiteOpenHelper$Callback0, boolean z, boolean z1, int v, w w0) {
        this(context0, s, supportSQLiteOpenHelper$Callback0, ((v & 8) == 0 ? z : false), ((v & 16) == 0 ? z1 : false));
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper
    public void close() {
        if(this.f.isInitialized()) {
            this.j().close();
        }
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper
    @m
    public String getDatabaseName() {
        return this.b;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper
    @l
    public SupportSQLiteDatabase getReadableDatabase() {
        return this.j().j(false);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper
    @l
    public SupportSQLiteDatabase getWritableDatabase() {
        return this.j().j(true);
    }

    private final OpenHelper j() {
        return (OpenHelper)this.f.getValue();
    }

    private static Object k(FrameworkSQLiteOpenHelper frameworkSQLiteOpenHelper0) {
        return frameworkSQLiteOpenHelper0.f;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper
    @RequiresApi(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z) {
        if(this.f.isInitialized()) {
            Api16Impl.h(this.j(), z);
        }
        this.g = z;
    }
}

