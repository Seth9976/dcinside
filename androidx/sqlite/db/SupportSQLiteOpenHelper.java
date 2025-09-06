package androidx.sqlite.db;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import y4.l;
import y4.m;
import z3.f;
import z3.n;

public interface SupportSQLiteOpenHelper extends Closeable {
    @s0({"SMAP\nSupportSQLiteOpenHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportSQLiteOpenHelper.kt\nandroidx/sqlite/db/SupportSQLiteOpenHelper$Callback\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,426:1\n1#2:427\n1855#3,2:428\n107#4:430\n79#4,22:431\n*S KotlinDebug\n*F\n+ 1 SupportSQLiteOpenHelper.kt\nandroidx/sqlite/db/SupportSQLiteOpenHelper$Callback\n*L\n243#1:428,2\n251#1:430\n251#1:431,22\n*E\n"})
    public static abstract class Callback {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }
        }

        @f
        public final int a;
        @l
        public static final Companion b = null;
        @l
        private static final String c = "SupportSQLite";

        static {
            Callback.b = new Companion(null);
        }

        public Callback(int v) {
            this.a = v;
        }

        private final void a(String s) {
            if(!v.O1(s, ":memory:", true)) {
                int v = s.length() - 1;
                int v1 = 0;
                boolean z = false;
                while(v1 <= v) {
                    boolean z1 = L.t(s.charAt((z ? v : v1)), 0x20) <= 0;
                    if(z) {
                        if(!z1) {
                            break;
                        }
                        --v;
                    }
                    else if(z1) {
                        ++v1;
                    }
                    else {
                        z = true;
                    }
                }
                if(s.subSequence(v1, v + 1).toString().length() != 0) {
                    Log.w("SupportSQLite", "deleting the database file: " + s);
                    try {
                        Api16Impl.c(new File(s));
                    }
                    catch(Exception exception0) {
                        Log.w("SupportSQLite", "delete failed: ", exception0);
                    }
                }
            }
        }

        public void b(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
            L.p(supportSQLiteDatabase0, "db");
        }

        public void c(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
            L.p(supportSQLiteDatabase0, "db");
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + supportSQLiteDatabase0 + ".path");
            if(!supportSQLiteDatabase0.isOpen()) {
                String s = supportSQLiteDatabase0.getPath();
                if(s != null) {
                    this.a(s);
                }
                return;
            }
            try {
                List list0 = null;
                list0 = supportSQLiteDatabase0.I0();
            }
            catch(SQLiteException unused_ex) {
            }
            finally {
                if(list0 == null) {
                    String s1 = supportSQLiteDatabase0.getPath();
                    if(s1 != null) {
                        this.a(s1);
                    }
                }
                else {
                    for(Object object0: list0) {
                        Object object1 = ((Pair)object0).second;
                        L.o(object1, "p.second");
                        this.a(((String)object1));
                    }
                }
            }
            try {
                supportSQLiteDatabase0.close();
            }
            catch(IOException unused_ex) {
            }
        }

        public abstract void d(@l SupportSQLiteDatabase arg1);

        public void e(@l SupportSQLiteDatabase supportSQLiteDatabase0, int v, int v1) {
            L.p(supportSQLiteDatabase0, "db");
            throw new SQLiteException("Can\'t downgrade database from version " + v + " to " + v1);
        }

        public void f(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
            L.p(supportSQLiteDatabase0, "db");
        }

        public abstract void g(@l SupportSQLiteDatabase arg1, int arg2, int arg3);
    }

    public static final class Configuration {
        public static class Builder {
            @l
            private final Context a;
            @m
            private String b;
            @m
            private Callback c;
            private boolean d;
            private boolean e;

            public Builder(@l Context context0) {
                L.p(context0, "context");
                super();
                this.a = context0;
            }

            @l
            public Builder a(boolean z) {
                this.e = z;
                return this;
            }

            @l
            public Configuration b() {
                Callback supportSQLiteOpenHelper$Callback0 = this.c;
                if(supportSQLiteOpenHelper$Callback0 == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if(this.d && (this.b == null || this.b.length() == 0)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new Configuration(this.a, this.b, supportSQLiteOpenHelper$Callback0, this.d, this.e);
            }

            @l
            public Builder c(@l Callback supportSQLiteOpenHelper$Callback0) {
                L.p(supportSQLiteOpenHelper$Callback0, "callback");
                this.c = supportSQLiteOpenHelper$Callback0;
                return this;
            }

            @l
            public Builder d(@m String s) {
                this.b = s;
                return this;
            }

            @l
            public Builder e(boolean z) {
                this.d = z;
                return this;
            }
        }

        public static final class androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Companion {
            private androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Companion() {
            }

            public androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Companion(w w0) {
            }

            @l
            @n
            public final Builder a(@l Context context0) {
                L.p(context0, "context");
                return new Builder(context0);
            }
        }

        @l
        @f
        public final Context a;
        @m
        @f
        public final String b;
        @l
        @f
        public final Callback c;
        @f
        public final boolean d;
        @f
        public final boolean e;
        @l
        public static final androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Companion f;

        static {
            Configuration.f = new androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Companion(null);
        }

        public Configuration(@l Context context0, @m String s, @l Callback supportSQLiteOpenHelper$Callback0, boolean z, boolean z1) {
            L.p(context0, "context");
            L.p(supportSQLiteOpenHelper$Callback0, "callback");
            super();
            this.a = context0;
            this.b = s;
            this.c = supportSQLiteOpenHelper$Callback0;
            this.d = z;
            this.e = z1;
        }

        public Configuration(Context context0, String s, Callback supportSQLiteOpenHelper$Callback0, boolean z, boolean z1, int v, w w0) {
            this(context0, s, supportSQLiteOpenHelper$Callback0, ((v & 8) == 0 ? z : false), ((v & 16) == 0 ? z1 : false));
        }

        @l
        @n
        public static final Builder a(@l Context context0) {
            return Configuration.f.a(context0);
        }
    }

    public interface Factory {
        @l
        SupportSQLiteOpenHelper a(@l Configuration arg1);
    }

    @Override
    void close();

    @m
    String getDatabaseName();

    @l
    SupportSQLiteDatabase getReadableDatabase();

    @l
    SupportSQLiteDatabase getWritableDatabase();

    @RequiresApi(api = 16)
    void setWriteAheadLoggingEnabled(boolean arg1);
}

