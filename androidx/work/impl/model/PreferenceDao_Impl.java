package androidx.work.impl.model;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

public final class PreferenceDao_Impl implements PreferenceDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter b;

    public PreferenceDao_Impl(@NonNull RoomDatabase roomDatabase0) {
        this.a = roomDatabase0;
        this.b = new EntityInsertionAdapter(roomDatabase0) {
            final PreferenceDao_Impl d;

            @Override  // androidx.room.SharedSQLiteStatement
            @NonNull
            protected String e() {
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            }

            @Override  // androidx.room.EntityInsertionAdapter
            protected void i(@NonNull SupportSQLiteStatement supportSQLiteStatement0, @NonNull Object object0) {
                this.t(supportSQLiteStatement0, ((Preference)object0));
            }

            protected void t(@NonNull SupportSQLiteStatement supportSQLiteStatement0, @NonNull Preference preference0) {
                supportSQLiteStatement0.S0(1, preference0.e());
                if(preference0.f() == null) {
                    supportSQLiteStatement0.H1(2);
                    return;
                }
                supportSQLiteStatement0.o1(2, ((long)preference0.f()));
            }
        };
    }

    @Override  // androidx.work.impl.model.PreferenceDao
    public LiveData a(String s) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.e("SELECT long_value FROM Preference where `key`=?", 1);
        roomSQLiteQuery0.S0(1, s);
        androidx.work.impl.model.PreferenceDao_Impl.2 preferenceDao_Impl$20 = new Callable() {
            final PreferenceDao_Impl b;

            @Nullable
            public Long a() throws Exception {
                try(Cursor cursor0 = DBUtil.f(PreferenceDao_Impl.this.a, roomSQLiteQuery0, false, null)) {
                    return cursor0.moveToFirst() && !cursor0.isNull(0) ? cursor0.getLong(0) : null;
                }
            }

            @Override
            @Nullable
            public Object call() throws Exception {
                return this.a();
            }

            @Override
            protected void finalize() {
                roomSQLiteQuery0.release();
            }
        };
        return this.a.p().f(new String[]{"Preference"}, false, preferenceDao_Impl$20);
    }

    @Override  // androidx.work.impl.model.PreferenceDao
    public void b(Preference preference0) {
        this.a.d();
        this.a.e();
        try {
            this.b.k(preference0);
            this.a.Q();
        }
        finally {
            this.a.k();
        }
    }

    @Override  // androidx.work.impl.model.PreferenceDao
    public Long c(String s) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.e("SELECT long_value FROM Preference where `key`=?", 1);
        roomSQLiteQuery0.S0(1, s);
        this.a.d();
        Long long0 = null;
        Cursor cursor0 = DBUtil.f(this.a, roomSQLiteQuery0, false, null);
        try {
            if(cursor0.moveToFirst() && !cursor0.isNull(0)) {
                long0 = cursor0.getLong(0);
            }
            return long0;
        }
        finally {
            cursor0.close();
            roomSQLiteQuery0.release();
        }
    }

    @NonNull
    public static List e() {
        return Collections.emptyList();
    }
}

