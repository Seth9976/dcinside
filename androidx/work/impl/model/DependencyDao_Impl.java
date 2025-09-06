package androidx.work.impl.model;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class DependencyDao_Impl implements DependencyDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter b;

    public DependencyDao_Impl(@NonNull RoomDatabase roomDatabase0) {
        this.a = roomDatabase0;
        this.b = new EntityInsertionAdapter(roomDatabase0) {
            final DependencyDao_Impl d;

            @Override  // androidx.room.SharedSQLiteStatement
            @NonNull
            protected String e() {
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            }

            @Override  // androidx.room.EntityInsertionAdapter
            protected void i(@NonNull SupportSQLiteStatement supportSQLiteStatement0, @NonNull Object object0) {
                this.t(supportSQLiteStatement0, ((Dependency)object0));
            }

            protected void t(@NonNull SupportSQLiteStatement supportSQLiteStatement0, @NonNull Dependency dependency0) {
                supportSQLiteStatement0.S0(1, dependency0.b());
                supportSQLiteStatement0.S0(2, dependency0.a());
            }
        };
    }

    @Override  // androidx.work.impl.model.DependencyDao
    public void a(Dependency dependency0) {
        this.a.d();
        this.a.e();
        try {
            this.b.k(dependency0);
            this.a.Q();
        }
        finally {
            this.a.k();
        }
    }

    @Override  // androidx.work.impl.model.DependencyDao
    public List b(String s) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.e("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        roomSQLiteQuery0.S0(1, s);
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

    @Override  // androidx.work.impl.model.DependencyDao
    public boolean c(String s) {
        boolean z = true;
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.e("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        roomSQLiteQuery0.S0(1, s);
        this.a.d();
        boolean z1 = false;
        Cursor cursor0 = DBUtil.f(this.a, roomSQLiteQuery0, false, null);
        try {
            if(cursor0.moveToFirst()) {
                if(cursor0.getInt(0) == 0) {
                    z = false;
                }
                z1 = z;
            }
            return z1;
        }
        finally {
            cursor0.close();
            roomSQLiteQuery0.release();
        }
    }

    @Override  // androidx.work.impl.model.DependencyDao
    public List d(String s) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.e("SELECT prerequisite_id FROM dependency WHERE work_spec_id=?", 1);
        roomSQLiteQuery0.S0(1, s);
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

    @Override  // androidx.work.impl.model.DependencyDao
    public boolean e(String s) {
        boolean z = true;
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.e("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        roomSQLiteQuery0.S0(1, s);
        this.a.d();
        boolean z1 = false;
        Cursor cursor0 = DBUtil.f(this.a, roomSQLiteQuery0, false, null);
        try {
            if(cursor0.moveToFirst()) {
                if(cursor0.getInt(0) == 0) {
                    z = false;
                }
                z1 = z;
            }
            return z1;
        }
        finally {
            cursor0.close();
            roomSQLiteQuery0.release();
        }
    }

    @NonNull
    public static List f() {
        return Collections.emptyList();
    }
}

