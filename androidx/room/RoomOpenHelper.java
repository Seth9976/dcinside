package androidx.room;

import android.database.Cursor;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import java.util.List;
import kotlin.io.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.k;
import y4.l;
import y4.m;
import z3.f;

@RestrictTo({Scope.c})
@s0({"SMAP\nRoomOpenHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomOpenHelper.kt\nandroidx/room/RoomOpenHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 CursorUtil.kt\nandroidx/room/util/CursorUtil\n*L\n1#1,245:1\n1855#2,2:246\n145#3,7:248\n*S KotlinDebug\n*F\n+ 1 RoomOpenHelper.kt\nandroidx/room/RoomOpenHelper\n*L\n90#1:246,2\n137#1:248,7\n*E\n"})
public class RoomOpenHelper extends Callback {
    @s0({"SMAP\nRoomOpenHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomOpenHelper.kt\nandroidx/room/RoomOpenHelper$Companion\n+ 2 CursorUtil.kt\nandroidx/room/util/CursorUtil\n*L\n1#1,245:1\n145#2,7:246\n145#2,7:253\n*S KotlinDebug\n*F\n+ 1 RoomOpenHelper.kt\nandroidx/room/RoomOpenHelper$Companion\n*L\n231#1:246,7\n239#1:253,7\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        public final boolean a(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
            boolean z = false;
            L.p(supportSQLiteDatabase0, "db");
            Cursor cursor0 = supportSQLiteDatabase0.x3("SELECT count(*) FROM sqlite_master WHERE name != \'android_metadata\'");
            try {
                if(cursor0.moveToFirst() && cursor0.getInt(0) == 0) {
                    z = true;
                }
            }
            catch(Throwable throwable0) {
                c.a(cursor0, throwable0);
                throw throwable0;
            }
            c.a(cursor0, null);
            return z;
        }

        public final boolean b(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
            boolean z = false;
            L.p(supportSQLiteDatabase0, "db");
            Cursor cursor0 = supportSQLiteDatabase0.x3("SELECT 1 FROM sqlite_master WHERE type = \'table\' AND name=\'room_master_table\'");
            try {
                if(cursor0.moveToFirst() && cursor0.getInt(0) != 0) {
                    z = true;
                }
            }
            catch(Throwable throwable0) {
                c.a(cursor0, throwable0);
                throw throwable0;
            }
            c.a(cursor0, null);
            return z;
        }
    }

    @RestrictTo({Scope.c})
    public static abstract class Delegate {
        @f
        public final int a;

        public Delegate(int v) {
            this.a = v;
        }

        public abstract void a(@l SupportSQLiteDatabase arg1);

        public abstract void b(@l SupportSQLiteDatabase arg1);

        public abstract void c(@l SupportSQLiteDatabase arg1);

        public abstract void d(@l SupportSQLiteDatabase arg1);

        public void e(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
            L.p(supportSQLiteDatabase0, "db");
        }

        public void f(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
            L.p(supportSQLiteDatabase0, "db");
        }

        @l
        public ValidationResult g(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
            L.p(supportSQLiteDatabase0, "db");
            this.h(supportSQLiteDatabase0);
            return new ValidationResult(true, null);
        }

        @k(message = "Use [onValidateSchema(SupportSQLiteDatabase)]")
        protected void h(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
            L.p(supportSQLiteDatabase0, "db");
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }

    @RestrictTo({Scope.c})
    public static class ValidationResult {
        @f
        public final boolean a;
        @m
        @f
        public final String b;

        public ValidationResult(boolean z, @m String s) {
            this.a = z;
            this.b = s;
        }
    }

    @m
    private DatabaseConfiguration d;
    @l
    private final Delegate e;
    @l
    private final String f;
    @l
    private final String g;
    @l
    public static final Companion h;

    static {
        RoomOpenHelper.h = new Companion(null);
    }

    public RoomOpenHelper(@l DatabaseConfiguration databaseConfiguration0, @l Delegate roomOpenHelper$Delegate0, @l String s) {
        L.p(databaseConfiguration0, "configuration");
        L.p(roomOpenHelper$Delegate0, "delegate");
        L.p(s, "legacyHash");
        this(databaseConfiguration0, roomOpenHelper$Delegate0, "", s);
    }

    public RoomOpenHelper(@l DatabaseConfiguration databaseConfiguration0, @l Delegate roomOpenHelper$Delegate0, @l String s, @l String s1) {
        L.p(databaseConfiguration0, "configuration");
        L.p(roomOpenHelper$Delegate0, "delegate");
        L.p(s, "identityHash");
        L.p(s1, "legacyHash");
        super(roomOpenHelper$Delegate0.a);
        this.d = databaseConfiguration0;
        this.e = roomOpenHelper$Delegate0;
        this.f = s;
        this.g = s1;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper$Callback
    public void b(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
        L.p(supportSQLiteDatabase0, "db");
        super.b(supportSQLiteDatabase0);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper$Callback
    public void d(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
        L.p(supportSQLiteDatabase0, "db");
        boolean z = RoomOpenHelper.h.a(supportSQLiteDatabase0);
        this.e.a(supportSQLiteDatabase0);
        if(!z) {
            ValidationResult roomOpenHelper$ValidationResult0 = this.e.g(supportSQLiteDatabase0);
            if(!roomOpenHelper$ValidationResult0.a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + roomOpenHelper$ValidationResult0.b);
            }
        }
        this.j(supportSQLiteDatabase0);
        this.e.c(supportSQLiteDatabase0);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper$Callback
    public void e(@l SupportSQLiteDatabase supportSQLiteDatabase0, int v, int v1) {
        L.p(supportSQLiteDatabase0, "db");
        this.g(supportSQLiteDatabase0, v, v1);
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper$Callback
    public void f(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
        L.p(supportSQLiteDatabase0, "db");
        super.f(supportSQLiteDatabase0);
        this.h(supportSQLiteDatabase0);
        this.e.d(supportSQLiteDatabase0);
        this.d = null;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper$Callback
    public void g(@l SupportSQLiteDatabase supportSQLiteDatabase0, int v, int v1) {
        L.p(supportSQLiteDatabase0, "db");
        DatabaseConfiguration databaseConfiguration0 = this.d;
        if(databaseConfiguration0 != null) {
            List list0 = databaseConfiguration0.d.e(v, v1);
            if(list0 != null) {
                this.e.f(supportSQLiteDatabase0);
                for(Object object0: list0) {
                    ((Migration)object0).a(supportSQLiteDatabase0);
                }
                ValidationResult roomOpenHelper$ValidationResult0 = this.e.g(supportSQLiteDatabase0);
                if(!roomOpenHelper$ValidationResult0.a) {
                    throw new IllegalStateException("Migration didn\'t properly handle: " + roomOpenHelper$ValidationResult0.b);
                }
                this.e.e(supportSQLiteDatabase0);
                this.j(supportSQLiteDatabase0);
                return;
            }
        }
        if(this.d == null || this.d.a(v, v1)) {
            throw new IllegalStateException("A migration from " + v + " to " + v1 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        this.e.b(supportSQLiteDatabase0);
        this.e.a(supportSQLiteDatabase0);
    }

    private final void h(SupportSQLiteDatabase supportSQLiteDatabase0) {
        String s;
        if(RoomOpenHelper.h.b(supportSQLiteDatabase0)) {
            Cursor cursor0 = supportSQLiteDatabase0.Q0(new SimpleSQLiteQuery("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
            try {
                s = cursor0.moveToFirst() ? cursor0.getString(0) : null;
            }
            catch(Throwable throwable0) {
                c.a(cursor0, throwable0);
                throw throwable0;
            }
            c.a(cursor0, null);
            if(!L.g(this.f, s) && !L.g(this.g, s)) {
                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you\'ve changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + this.f + ", found: " + s);
            }
            return;
        }
        ValidationResult roomOpenHelper$ValidationResult0 = this.e.g(supportSQLiteDatabase0);
        if(!roomOpenHelper$ValidationResult0.a) {
            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + roomOpenHelper$ValidationResult0.b);
        }
        this.e.e(supportSQLiteDatabase0);
        this.j(supportSQLiteDatabase0);
    }

    private final void i(SupportSQLiteDatabase supportSQLiteDatabase0) {
        supportSQLiteDatabase0.W1("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private final void j(SupportSQLiteDatabase supportSQLiteDatabase0) {
        this.i(supportSQLiteDatabase0);
        supportSQLiteDatabase0.W1(RoomMasterTable.a(this.f));
    }
}

