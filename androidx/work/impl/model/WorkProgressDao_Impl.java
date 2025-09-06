package androidx.work.impl.model;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.Data;
import java.util.Collections;
import java.util.List;

public final class WorkProgressDao_Impl implements WorkProgressDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter b;
    private final SharedSQLiteStatement c;
    private final SharedSQLiteStatement d;

    public WorkProgressDao_Impl(@NonNull RoomDatabase roomDatabase0) {
        this.a = roomDatabase0;
        this.b = new EntityInsertionAdapter(roomDatabase0) {
            final WorkProgressDao_Impl d;

            @Override  // androidx.room.SharedSQLiteStatement
            @NonNull
            protected String e() {
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            }

            @Override  // androidx.room.EntityInsertionAdapter
            protected void i(@NonNull SupportSQLiteStatement supportSQLiteStatement0, @NonNull Object object0) {
                this.t(supportSQLiteStatement0, ((WorkProgress)object0));
            }

            protected void t(@NonNull SupportSQLiteStatement supportSQLiteStatement0, @NonNull WorkProgress workProgress0) {
                supportSQLiteStatement0.S0(1, workProgress0.b());
                supportSQLiteStatement0.r1(2, Data.y(workProgress0.a()));
            }
        };
        this.c = new SharedSQLiteStatement(roomDatabase0) {
            final WorkProgressDao_Impl d;

            @Override  // androidx.room.SharedSQLiteStatement
            @NonNull
            public String e() {
                return "DELETE from WorkProgress where work_spec_id=?";
            }
        };
        this.d = new SharedSQLiteStatement(roomDatabase0) {
            final WorkProgressDao_Impl d;

            @Override  // androidx.room.SharedSQLiteStatement
            @NonNull
            public String e() {
                return "DELETE FROM WorkProgress";
            }
        };
    }

    @NonNull
    public static List a() {
        return Collections.emptyList();
    }

    @Override  // androidx.work.impl.model.WorkProgressDao
    public void b(String s) {
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

    @Override  // androidx.work.impl.model.WorkProgressDao
    public Data c(String s) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.e("SELECT progress FROM WorkProgress WHERE work_spec_id=?", 1);
        roomSQLiteQuery0.S0(1, s);
        this.a.d();
        Data data0 = null;
        Cursor cursor0 = DBUtil.f(this.a, roomSQLiteQuery0, false, null);
        try {
            if(cursor0.moveToFirst()) {
                byte[] arr_b = cursor0.isNull(0) ? null : cursor0.getBlob(0);
                if(arr_b != null) {
                    data0 = Data.b(arr_b);
                }
            }
            return data0;
        }
        finally {
            cursor0.close();
            roomSQLiteQuery0.release();
        }
    }

    @Override  // androidx.work.impl.model.WorkProgressDao
    public void d() {
        this.a.d();
        SupportSQLiteStatement supportSQLiteStatement0 = this.d.b();
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

    @Override  // androidx.work.impl.model.WorkProgressDao
    public void e(WorkProgress workProgress0) {
        this.a.d();
        this.a.e();
        try {
            this.b.k(workProgress0);
            this.a.Q();
        }
        finally {
            this.a.k();
        }
    }
}

