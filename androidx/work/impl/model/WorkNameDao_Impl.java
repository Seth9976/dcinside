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

public final class WorkNameDao_Impl implements WorkNameDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter b;

    public WorkNameDao_Impl(@NonNull RoomDatabase roomDatabase0) {
        this.a = roomDatabase0;
        this.b = new EntityInsertionAdapter(roomDatabase0) {
            final WorkNameDao_Impl d;

            @Override  // androidx.room.SharedSQLiteStatement
            @NonNull
            protected String e() {
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            }

            @Override  // androidx.room.EntityInsertionAdapter
            protected void i(@NonNull SupportSQLiteStatement supportSQLiteStatement0, @NonNull Object object0) {
                this.t(supportSQLiteStatement0, ((WorkName)object0));
            }

            protected void t(@NonNull SupportSQLiteStatement supportSQLiteStatement0, @NonNull WorkName workName0) {
                supportSQLiteStatement0.S0(1, workName0.a());
                supportSQLiteStatement0.S0(2, workName0.b());
            }
        };
    }

    @Override  // androidx.work.impl.model.WorkNameDao
    public void a(WorkName workName0) {
        this.a.d();
        this.a.e();
        try {
            this.b.k(workName0);
            this.a.Q();
        }
        finally {
            this.a.k();
        }
    }

    @Override  // androidx.work.impl.model.WorkNameDao
    public List b(String s) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.e("SELECT name FROM workname WHERE work_spec_id=?", 1);
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

    @Override  // androidx.work.impl.model.WorkNameDao
    public List c(String s) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.e("SELECT work_spec_id FROM workname WHERE name=?", 1);
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
    public static List d() {
        return Collections.emptyList();
    }
}

