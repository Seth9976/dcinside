package androidx.work.impl.model;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SystemIdInfoDao_Impl implements SystemIdInfoDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter b;
    private final SharedSQLiteStatement c;
    private final SharedSQLiteStatement d;

    public SystemIdInfoDao_Impl(@NonNull RoomDatabase roomDatabase0) {
        this.a = roomDatabase0;
        this.b = new EntityInsertionAdapter(roomDatabase0) {
            final SystemIdInfoDao_Impl d;

            @Override  // androidx.room.SharedSQLiteStatement
            @NonNull
            protected String e() {
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            }

            @Override  // androidx.room.EntityInsertionAdapter
            protected void i(@NonNull SupportSQLiteStatement supportSQLiteStatement0, @NonNull Object object0) {
                this.t(supportSQLiteStatement0, ((SystemIdInfo)object0));
            }

            protected void t(@NonNull SupportSQLiteStatement supportSQLiteStatement0, @NonNull SystemIdInfo systemIdInfo0) {
                supportSQLiteStatement0.S0(1, systemIdInfo0.a);
                supportSQLiteStatement0.o1(2, ((long)systemIdInfo0.f()));
                supportSQLiteStatement0.o1(3, ((long)systemIdInfo0.c));
            }
        };
        this.c = new SharedSQLiteStatement(roomDatabase0) {
            final SystemIdInfoDao_Impl d;

            @Override  // androidx.room.SharedSQLiteStatement
            @NonNull
            public String e() {
                return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
            }
        };
        this.d = new SharedSQLiteStatement(roomDatabase0) {
            final SystemIdInfoDao_Impl d;

            @Override  // androidx.room.SharedSQLiteStatement
            @NonNull
            public String e() {
                return "DELETE FROM SystemIdInfo where work_spec_id=?";
            }
        };
    }

    @Override  // androidx.work.impl.model.SystemIdInfoDao
    public SystemIdInfo a(String s, int v) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.e("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        roomSQLiteQuery0.S0(1, s);
        roomSQLiteQuery0.o1(2, ((long)v));
        this.a.d();
        SystemIdInfo systemIdInfo0 = null;
        Cursor cursor0 = DBUtil.f(this.a, roomSQLiteQuery0, false, null);
        try {
            int v2 = CursorUtil.e(cursor0, "work_spec_id");
            int v3 = CursorUtil.e(cursor0, "generation");
            int v4 = CursorUtil.e(cursor0, "system_id");
            if(cursor0.moveToFirst()) {
                systemIdInfo0 = new SystemIdInfo(cursor0.getString(v2), cursor0.getInt(v3), cursor0.getInt(v4));
            }
            return systemIdInfo0;
        }
        finally {
            cursor0.close();
            roomSQLiteQuery0.release();
        }
    }

    @Override  // androidx.work.impl.model.SystemIdInfoDao
    public void b(WorkGenerationalId workGenerationalId0) {
        c.b(this, workGenerationalId0);
    }

    @Override  // androidx.work.impl.model.SystemIdInfoDao
    public void c(SystemIdInfo systemIdInfo0) {
        this.a.d();
        this.a.e();
        try {
            this.b.k(systemIdInfo0);
            this.a.Q();
        }
        finally {
            this.a.k();
        }
    }

    @Override  // androidx.work.impl.model.SystemIdInfoDao
    public SystemIdInfo d(WorkGenerationalId workGenerationalId0) {
        return c.a(this, workGenerationalId0);
    }

    @Override  // androidx.work.impl.model.SystemIdInfoDao
    public List e() {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.e("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.a.d();
        Cursor cursor0 = DBUtil.f(this.a, roomSQLiteQuery0, false, null);
        try {
            List list0 = new ArrayList(cursor0.getCount());
            while(cursor0.moveToNext()) {
                list0.add(cursor0.getString(0));
            }
            return list0;
        }
        finally {
            cursor0.close();
            roomSQLiteQuery0.release();
        }
    }

    @Override  // androidx.work.impl.model.SystemIdInfoDao
    public void f(String s, int v) {
        this.a.d();
        SupportSQLiteStatement supportSQLiteStatement0 = this.c.b();
        supportSQLiteStatement0.S0(1, s);
        supportSQLiteStatement0.o1(2, ((long)v));
        try {
            this.a.e();
            try {
                supportSQLiteStatement0.O();
                this.a.Q();
            }
            catch(Throwable throwable0) {
                this.a.k();
                throw throwable0;
            }
            this.a.k();
        }
        finally {
            this.c.h(supportSQLiteStatement0);
        }
    }

    @Override  // androidx.work.impl.model.SystemIdInfoDao
    public void g(String s) {
        this.a.d();
        SupportSQLiteStatement supportSQLiteStatement0 = this.d.b();
        supportSQLiteStatement0.S0(1, s);
        try {
            this.a.e();
            try {
                supportSQLiteStatement0.O();
                this.a.Q();
            }
            catch(Throwable throwable0) {
                this.a.k();
                throw throwable0;
            }
            this.a.k();
        }
        finally {
            this.d.h(supportSQLiteStatement0);
        }
    }

    @NonNull
    public static List h() {
        return Collections.emptyList();
    }
}

