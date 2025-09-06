package androidx.work.impl.model;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class WorkTagDao_Impl implements WorkTagDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter b;
    private final SharedSQLiteStatement c;

    public WorkTagDao_Impl(@NonNull RoomDatabase roomDatabase0) {
        this.a = roomDatabase0;
        this.b = new EntityInsertionAdapter(roomDatabase0) {
            final WorkTagDao_Impl d;

            @Override  // androidx.room.SharedSQLiteStatement
            @NonNull
            protected String e() {
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
            }

            @Override  // androidx.room.EntityInsertionAdapter
            protected void i(@NonNull SupportSQLiteStatement supportSQLiteStatement0, @NonNull Object object0) {
                this.t(supportSQLiteStatement0, ((WorkTag)object0));
            }

            protected void t(@NonNull SupportSQLiteStatement supportSQLiteStatement0, @NonNull WorkTag workTag0) {
                supportSQLiteStatement0.S0(1, workTag0.a());
                supportSQLiteStatement0.S0(2, workTag0.b());
            }
        };
        this.c = new SharedSQLiteStatement(roomDatabase0) {
            final WorkTagDao_Impl d;

            @Override  // androidx.room.SharedSQLiteStatement
            @NonNull
            public String e() {
                return "DELETE FROM worktag WHERE work_spec_id=?";
            }
        };
    }

    @Override  // androidx.work.impl.model.WorkTagDao
    public void a(String s) {
        this.a.d();
        SupportSQLiteStatement supportSQLiteStatement0 = this.c.b();
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
            this.c.h(supportSQLiteStatement0);
        }
    }

    @Override  // androidx.work.impl.model.WorkTagDao
    public void b(String s, Set set0) {
        g.a(this, s, set0);
    }

    @Override  // androidx.work.impl.model.WorkTagDao
    public List c(String s) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.e("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
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

    @Override  // androidx.work.impl.model.WorkTagDao
    public void d(WorkTag workTag0) {
        this.a.d();
        this.a.e();
        try {
            this.b.k(workTag0);
            this.a.Q();
        }
        finally {
            this.a.k();
        }
    }

    @Override  // androidx.work.impl.model.WorkTagDao
    public List e(String s) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.e("SELECT work_spec_id FROM worktag WHERE tag=?", 1);
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

    @NonNull
    public static List f() {
        return Collections.emptyList();
    }
}

