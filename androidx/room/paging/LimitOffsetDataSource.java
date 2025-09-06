package androidx.room.paging;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.paging.PositionalDataSource.LoadInitialCallback;
import androidx.paging.PositionalDataSource.LoadInitialParams;
import androidx.paging.PositionalDataSource.LoadRangeCallback;
import androidx.paging.PositionalDataSource.LoadRangeParams;
import androidx.paging.PositionalDataSource;
import androidx.room.InvalidationTracker.Observer;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteQuery;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

@RestrictTo({Scope.c})
public abstract class LimitOffsetDataSource extends PositionalDataSource {
    private final RoomSQLiteQuery a;
    private final String b;
    private final String c;
    private final RoomDatabase d;
    private final Observer e;
    private final boolean f;
    private final AtomicBoolean g;

    protected LimitOffsetDataSource(@NonNull RoomDatabase roomDatabase0, @NonNull RoomSQLiteQuery roomSQLiteQuery0, boolean z, boolean z1, @NonNull String[] arr_s) {
        this.g = new AtomicBoolean(false);
        this.d = roomDatabase0;
        this.a = roomSQLiteQuery0;
        this.f = z;
        this.b = "SELECT COUNT(*) FROM ( " + roomSQLiteQuery0.b() + " )";
        this.c = "SELECT * FROM ( " + roomSQLiteQuery0.b() + " ) LIMIT ? OFFSET ?";
        this.e = new Observer(arr_s) {
            final LimitOffsetDataSource b;

            @Override  // androidx.room.InvalidationTracker$Observer
            public void c(@NonNull Set set0) {
                LimitOffsetDataSource.this.invalidate();
            }
        };
        if(z1) {
            this.h();
        }
    }

    protected LimitOffsetDataSource(@NonNull RoomDatabase roomDatabase0, @NonNull RoomSQLiteQuery roomSQLiteQuery0, boolean z, @NonNull String[] arr_s) {
        this(roomDatabase0, roomSQLiteQuery0, z, true, arr_s);
    }

    protected LimitOffsetDataSource(@NonNull RoomDatabase roomDatabase0, @NonNull SupportSQLiteQuery supportSQLiteQuery0, boolean z, boolean z1, @NonNull String[] arr_s) {
        this(roomDatabase0, RoomSQLiteQuery.i(supportSQLiteQuery0), z, z1, arr_s);
    }

    protected LimitOffsetDataSource(@NonNull RoomDatabase roomDatabase0, @NonNull SupportSQLiteQuery supportSQLiteQuery0, boolean z, @NonNull String[] arr_s) {
        this(roomDatabase0, RoomSQLiteQuery.i(supportSQLiteQuery0), z, arr_s);
    }

    @NonNull
    protected abstract List a(@NonNull Cursor arg1);

    @RestrictTo({Scope.a})
    public int b() {
        this.h();
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.e(this.b, this.a.a());
        roomSQLiteQuery0.f(this.a);
        Cursor cursor0 = this.d.J(roomSQLiteQuery0);
        try {
            return cursor0.moveToFirst() ? cursor0.getInt(0) : 0;
        }
        finally {
            cursor0.close();
            roomSQLiteQuery0.release();
        }
    }

    private RoomSQLiteQuery c(int v, int v1) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.e(this.c, this.a.a() + 2);
        roomSQLiteQuery0.f(this.a);
        roomSQLiteQuery0.o1(roomSQLiteQuery0.a() - 1, ((long)v1));
        roomSQLiteQuery0.o1(roomSQLiteQuery0.a(), ((long)v));
        return roomSQLiteQuery0;
    }

    public boolean d() {
        this.h();
        this.d.p().s();
        return super.isInvalid();
    }

    public void e(@NonNull PositionalDataSource.LoadInitialParams positionalDataSource$LoadInitialParams0, @NonNull PositionalDataSource.LoadInitialCallback positionalDataSource$LoadInitialCallback0) {
        int v2;
        RoomSQLiteQuery roomSQLiteQuery1;
        RoomSQLiteQuery roomSQLiteQuery0;
        int v;
        this.h();
        List list0 = Collections.emptyList();
        this.d.e();
        Cursor cursor0 = null;
        try {
            v = this.b();
            if(v == 0) {
                v2 = 0;
                roomSQLiteQuery1 = null;
            }
            else {
                int v1 = LimitOffsetDataSource.computeInitialLoadPosition(positionalDataSource$LoadInitialParams0, v);
                roomSQLiteQuery0 = this.c(v1, LimitOffsetDataSource.computeInitialLoadSize(positionalDataSource$LoadInitialParams0, v1, v));
                try {
                    cursor0 = this.d.J(roomSQLiteQuery0);
                    List list1 = this.a(cursor0);
                    this.d.Q();
                    roomSQLiteQuery1 = roomSQLiteQuery0;
                    v2 = v1;
                    list0 = list1;
                }
                catch(Throwable throwable0) {
                    goto label_22;
                }
            }
            goto label_28;
        }
        catch(Throwable throwable0) {
            roomSQLiteQuery0 = null;
        }
    label_22:
        if(cursor0 != null) {
            cursor0.close();
        }
        this.d.k();
        if(roomSQLiteQuery0 != null) {
            roomSQLiteQuery0.release();
        }
        throw throwable0;
    label_28:
        if(cursor0 != null) {
            cursor0.close();
        }
        this.d.k();
        if(roomSQLiteQuery1 != null) {
            roomSQLiteQuery1.release();
        }
        positionalDataSource$LoadInitialCallback0.onResult(list0, v2, v);
    }

    @NonNull
    @RestrictTo({Scope.a})
    public List f(int v, int v1) {
        List list0;
        RoomSQLiteQuery roomSQLiteQuery0 = this.c(v, v1);
        if(this.f) {
            this.d.e();
            Cursor cursor0 = null;
            try {
                cursor0 = this.d.J(roomSQLiteQuery0);
                list0 = this.a(cursor0);
                this.d.Q();
            }
            catch(Throwable throwable0) {
                if(cursor0 != null) {
                    cursor0.close();
                }
                this.d.k();
                roomSQLiteQuery0.release();
                throw throwable0;
            }
            if(cursor0 != null) {
                cursor0.close();
            }
            this.d.k();
            roomSQLiteQuery0.release();
            return list0;
        }
        Cursor cursor1 = this.d.J(roomSQLiteQuery0);
        try {
            return this.a(cursor1);
        }
        finally {
            cursor1.close();
            roomSQLiteQuery0.release();
        }
    }

    public void g(@NonNull PositionalDataSource.LoadRangeParams positionalDataSource$LoadRangeParams0, @NonNull PositionalDataSource.LoadRangeCallback positionalDataSource$LoadRangeCallback0) {
        positionalDataSource$LoadRangeCallback0.onResult(this.f(positionalDataSource$LoadRangeParams0.startPosition, positionalDataSource$LoadRangeParams0.loadSize));
    }

    private void h() {
        if(this.g.compareAndSet(false, true)) {
            this.d.p().d(this.e);
        }
    }
}

