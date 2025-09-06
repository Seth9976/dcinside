package androidx.work.impl.model;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.RelationUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo.State;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.S0;
import kotlinx.coroutines.flow.i;

public final class WorkSpecDao_Impl implements WorkSpecDao {
    private final RoomDatabase a;
    private final EntityInsertionAdapter b;
    private final EntityDeletionOrUpdateAdapter c;
    private final SharedSQLiteStatement d;
    private final SharedSQLiteStatement e;
    private final SharedSQLiteStatement f;
    private final SharedSQLiteStatement g;
    private final SharedSQLiteStatement h;
    private final SharedSQLiteStatement i;
    private final SharedSQLiteStatement j;
    private final SharedSQLiteStatement k;
    private final SharedSQLiteStatement l;
    private final SharedSQLiteStatement m;
    private final SharedSQLiteStatement n;
    private final SharedSQLiteStatement o;
    private final SharedSQLiteStatement p;
    private final SharedSQLiteStatement q;
    private final SharedSQLiteStatement r;

    public WorkSpecDao_Impl(@NonNull RoomDatabase roomDatabase0) {
        this.a = roomDatabase0;
        this.b = new EntityInsertionAdapter(roomDatabase0) {
            final WorkSpecDao_Impl d;

            @Override  // androidx.room.SharedSQLiteStatement
            @NonNull
            protected String e() {
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override  // androidx.room.EntityInsertionAdapter
            protected void i(@NonNull SupportSQLiteStatement supportSQLiteStatement0, @NonNull Object object0) {
                this.t(supportSQLiteStatement0, ((WorkSpec)object0));
            }

            protected void t(@NonNull SupportSQLiteStatement supportSQLiteStatement0, @NonNull WorkSpec workSpec0) {
                supportSQLiteStatement0.S0(1, workSpec0.a);
                supportSQLiteStatement0.o1(2, ((long)WorkTypeConverters.k(workSpec0.b)));
                supportSQLiteStatement0.S0(3, workSpec0.c);
                supportSQLiteStatement0.S0(4, workSpec0.d);
                supportSQLiteStatement0.r1(5, Data.y(workSpec0.e));
                supportSQLiteStatement0.r1(6, Data.y(workSpec0.f));
                supportSQLiteStatement0.o1(7, workSpec0.g);
                supportSQLiteStatement0.o1(8, workSpec0.h);
                supportSQLiteStatement0.o1(9, workSpec0.i);
                supportSQLiteStatement0.o1(10, ((long)workSpec0.k));
                supportSQLiteStatement0.o1(11, ((long)WorkTypeConverters.a(workSpec0.l)));
                supportSQLiteStatement0.o1(12, workSpec0.m);
                supportSQLiteStatement0.o1(13, workSpec0.n);
                supportSQLiteStatement0.o1(14, workSpec0.o);
                supportSQLiteStatement0.o1(15, workSpec0.p);
                supportSQLiteStatement0.o1(16, ((long)workSpec0.q));
                supportSQLiteStatement0.o1(17, ((long)WorkTypeConverters.i(workSpec0.r)));
                supportSQLiteStatement0.o1(18, ((long)workSpec0.G()));
                supportSQLiteStatement0.o1(19, ((long)workSpec0.D()));
                supportSQLiteStatement0.o1(20, workSpec0.E());
                supportSQLiteStatement0.o1(21, ((long)workSpec0.F()));
                supportSQLiteStatement0.o1(22, ((long)workSpec0.H()));
                if(workSpec0.I() == null) {
                    supportSQLiteStatement0.H1(23);
                }
                else {
                    supportSQLiteStatement0.S0(23, workSpec0.I());
                }
                Constraints constraints0 = workSpec0.j;
                supportSQLiteStatement0.o1(24, ((long)WorkTypeConverters.h(constraints0.f())));
                supportSQLiteStatement0.r1(25, WorkTypeConverters.c(constraints0.e()));
                supportSQLiteStatement0.o1(26, ((long)constraints0.i()));
                supportSQLiteStatement0.o1(27, ((long)constraints0.j()));
                supportSQLiteStatement0.o1(28, ((long)constraints0.h()));
                supportSQLiteStatement0.o1(29, ((long)constraints0.k()));
                supportSQLiteStatement0.o1(30, constraints0.b());
                supportSQLiteStatement0.o1(0x1F, constraints0.a());
                supportSQLiteStatement0.r1(0x20, WorkTypeConverters.j(constraints0.c()));
            }
        };
        this.c = new EntityDeletionOrUpdateAdapter(roomDatabase0) {
            final WorkSpecDao_Impl d;

            @Override  // androidx.room.EntityDeletionOrUpdateAdapter
            @NonNull
            protected String e() {
                return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
            }

            @Override  // androidx.room.EntityDeletionOrUpdateAdapter
            protected void i(@NonNull SupportSQLiteStatement supportSQLiteStatement0, @NonNull Object object0) {
                this.m(supportSQLiteStatement0, ((WorkSpec)object0));
            }

            protected void m(@NonNull SupportSQLiteStatement supportSQLiteStatement0, @NonNull WorkSpec workSpec0) {
                supportSQLiteStatement0.S0(1, workSpec0.a);
                supportSQLiteStatement0.o1(2, ((long)WorkTypeConverters.k(workSpec0.b)));
                supportSQLiteStatement0.S0(3, workSpec0.c);
                supportSQLiteStatement0.S0(4, workSpec0.d);
                supportSQLiteStatement0.r1(5, Data.y(workSpec0.e));
                supportSQLiteStatement0.r1(6, Data.y(workSpec0.f));
                supportSQLiteStatement0.o1(7, workSpec0.g);
                supportSQLiteStatement0.o1(8, workSpec0.h);
                supportSQLiteStatement0.o1(9, workSpec0.i);
                supportSQLiteStatement0.o1(10, ((long)workSpec0.k));
                supportSQLiteStatement0.o1(11, ((long)WorkTypeConverters.a(workSpec0.l)));
                supportSQLiteStatement0.o1(12, workSpec0.m);
                supportSQLiteStatement0.o1(13, workSpec0.n);
                supportSQLiteStatement0.o1(14, workSpec0.o);
                supportSQLiteStatement0.o1(15, workSpec0.p);
                supportSQLiteStatement0.o1(16, ((long)workSpec0.q));
                supportSQLiteStatement0.o1(17, ((long)WorkTypeConverters.i(workSpec0.r)));
                supportSQLiteStatement0.o1(18, ((long)workSpec0.G()));
                supportSQLiteStatement0.o1(19, ((long)workSpec0.D()));
                supportSQLiteStatement0.o1(20, workSpec0.E());
                supportSQLiteStatement0.o1(21, ((long)workSpec0.F()));
                supportSQLiteStatement0.o1(22, ((long)workSpec0.H()));
                if(workSpec0.I() == null) {
                    supportSQLiteStatement0.H1(23);
                }
                else {
                    supportSQLiteStatement0.S0(23, workSpec0.I());
                }
                Constraints constraints0 = workSpec0.j;
                supportSQLiteStatement0.o1(24, ((long)WorkTypeConverters.h(constraints0.f())));
                supportSQLiteStatement0.r1(25, WorkTypeConverters.c(constraints0.e()));
                supportSQLiteStatement0.o1(26, ((long)constraints0.i()));
                supportSQLiteStatement0.o1(27, ((long)constraints0.j()));
                supportSQLiteStatement0.o1(28, ((long)constraints0.h()));
                supportSQLiteStatement0.o1(29, ((long)constraints0.k()));
                supportSQLiteStatement0.o1(30, constraints0.b());
                supportSQLiteStatement0.o1(0x1F, constraints0.a());
                supportSQLiteStatement0.r1(0x20, WorkTypeConverters.j(constraints0.c()));
                supportSQLiteStatement0.S0(33, workSpec0.a);
            }
        };
        this.d = new SharedSQLiteStatement(roomDatabase0) {
            final WorkSpecDao_Impl d;

            @Override  // androidx.room.SharedSQLiteStatement
            @NonNull
            public String e() {
                return "DELETE FROM workspec WHERE id=?";
            }
        };
        this.e = new SharedSQLiteStatement(roomDatabase0) {
            final WorkSpecDao_Impl d;

            @Override  // androidx.room.SharedSQLiteStatement
            @NonNull
            public String e() {
                return "UPDATE workspec SET state=? WHERE id=?";
            }
        };
        this.f = new SharedSQLiteStatement(roomDatabase0) {
            final WorkSpecDao_Impl d;

            @Override  // androidx.room.SharedSQLiteStatement
            @NonNull
            public String e() {
                return "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
            }
        };
        this.g = new SharedSQLiteStatement(roomDatabase0) {
            final WorkSpecDao_Impl d;

            @Override  // androidx.room.SharedSQLiteStatement
            @NonNull
            public String e() {
                return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
            }
        };
        this.h = new SharedSQLiteStatement(roomDatabase0) {
            final WorkSpecDao_Impl d;

            @Override  // androidx.room.SharedSQLiteStatement
            @NonNull
            public String e() {
                return "UPDATE workspec SET output=? WHERE id=?";
            }
        };
        this.i = new SharedSQLiteStatement(roomDatabase0) {
            final WorkSpecDao_Impl d;

            @Override  // androidx.room.SharedSQLiteStatement
            @NonNull
            public String e() {
                return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
            }
        };
        this.j = new SharedSQLiteStatement(roomDatabase0) {
            final WorkSpecDao_Impl d;

            @Override  // androidx.room.SharedSQLiteStatement
            @NonNull
            public String e() {
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
            }
        };
        this.k = new SharedSQLiteStatement(roomDatabase0) {
            final WorkSpecDao_Impl d;

            @Override  // androidx.room.SharedSQLiteStatement
            @NonNull
            public String e() {
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            }
        };
        this.l = new SharedSQLiteStatement(roomDatabase0) {
            final WorkSpecDao_Impl d;

            @Override  // androidx.room.SharedSQLiteStatement
            @NonNull
            public String e() {
                return "UPDATE workspec SET next_schedule_time_override=? WHERE id=?";
            }
        };
        this.m = new SharedSQLiteStatement(roomDatabase0) {
            final WorkSpecDao_Impl d;

            @Override  // androidx.room.SharedSQLiteStatement
            @NonNull
            public String e() {
                return "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
            }
        };
        this.n = new SharedSQLiteStatement(roomDatabase0) {
            final WorkSpecDao_Impl d;

            @Override  // androidx.room.SharedSQLiteStatement
            @NonNull
            public String e() {
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            }
        };
        this.o = new SharedSQLiteStatement(roomDatabase0) {
            final WorkSpecDao_Impl d;

            @Override  // androidx.room.SharedSQLiteStatement
            @NonNull
            public String e() {
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
            }
        };
        this.p = new SharedSQLiteStatement(roomDatabase0) {
            final WorkSpecDao_Impl d;

            @Override  // androidx.room.SharedSQLiteStatement
            @NonNull
            public String e() {
                return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
            }
        };
        this.q = new SharedSQLiteStatement(roomDatabase0) {
            final WorkSpecDao_Impl d;

            @Override  // androidx.room.SharedSQLiteStatement
            @NonNull
            public String e() {
                return "UPDATE workspec SET generation=generation+1 WHERE id=?";
            }
        };
        this.r = new SharedSQLiteStatement(roomDatabase0) {
            final WorkSpecDao_Impl d;

            @Override  // androidx.room.SharedSQLiteStatement
            @NonNull
            public String e() {
                return "UPDATE workspec SET stop_reason=? WHERE id=?";
            }
        };
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public void A(String s, int v) {
        this.a.d();
        SupportSQLiteStatement supportSQLiteStatement0 = this.m.b();
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
            this.m.h(supportSQLiteStatement0);
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public List B() {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.e("SELECT id FROM workspec", 0);
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

    @Override  // androidx.work.impl.model.WorkSpecDao
    public void C(String s) {
        this.a.d();
        SupportSQLiteStatement supportSQLiteStatement0 = this.g.b();
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
            this.g.h(supportSQLiteStatement0);
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public List D(long v) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.e("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        roomSQLiteQuery0.o1(1, v);
        this.a.d();
        Cursor cursor0 = DBUtil.f(this.a, roomSQLiteQuery0, false, null);
        try {
            int v2 = CursorUtil.e(cursor0, "id");
            int v3 = CursorUtil.e(cursor0, "state");
            int v4 = CursorUtil.e(cursor0, "worker_class_name");
            int v5 = CursorUtil.e(cursor0, "input_merger_class_name");
            int v6 = CursorUtil.e(cursor0, "input");
            int v7 = CursorUtil.e(cursor0, "output");
            int v8 = CursorUtil.e(cursor0, "initial_delay");
            int v9 = CursorUtil.e(cursor0, "interval_duration");
            int v10 = CursorUtil.e(cursor0, "flex_duration");
            int v11 = CursorUtil.e(cursor0, "run_attempt_count");
            int v12 = CursorUtil.e(cursor0, "backoff_policy");
            int v13 = CursorUtil.e(cursor0, "backoff_delay_duration");
            int v14 = CursorUtil.e(cursor0, "last_enqueue_time");
            int v15 = CursorUtil.e(cursor0, "minimum_retention_duration");
            int v16 = CursorUtil.e(cursor0, "schedule_requested_at");
            int v17 = CursorUtil.e(cursor0, "run_in_foreground");
            int v18 = CursorUtil.e(cursor0, "out_of_quota_policy");
            int v19 = CursorUtil.e(cursor0, "period_count");
            int v20 = CursorUtil.e(cursor0, "generation");
            int v21 = CursorUtil.e(cursor0, "next_schedule_time_override");
            int v22 = CursorUtil.e(cursor0, "next_schedule_time_override_generation");
            int v23 = CursorUtil.e(cursor0, "stop_reason");
            int v24 = CursorUtil.e(cursor0, "trace_tag");
            int v25 = CursorUtil.e(cursor0, "required_network_type");
            int v26 = CursorUtil.e(cursor0, "required_network_request");
            int v27 = CursorUtil.e(cursor0, "requires_charging");
            int v28 = CursorUtil.e(cursor0, "requires_device_idle");
            int v29 = CursorUtil.e(cursor0, "requires_battery_not_low");
            int v30 = CursorUtil.e(cursor0, "requires_storage_not_low");
            int v31 = CursorUtil.e(cursor0, "trigger_content_update_delay");
            int v32 = CursorUtil.e(cursor0, "trigger_max_content_delay");
            int v33 = CursorUtil.e(cursor0, "content_uri_triggers");
            List list0 = new ArrayList(cursor0.getCount());
            while(cursor0.moveToNext()) {
                String s = cursor0.getString(v2);
                State workInfo$State0 = WorkTypeConverters.g(cursor0.getInt(v3));
                String s1 = cursor0.getString(v4);
                String s2 = cursor0.getString(v5);
                Data data0 = Data.b(cursor0.getBlob(v6));
                Data data1 = Data.b(cursor0.getBlob(v7));
                long v34 = cursor0.getLong(v8);
                long v35 = cursor0.getLong(v9);
                long v36 = cursor0.getLong(v10);
                int v37 = cursor0.getInt(v11);
                BackoffPolicy backoffPolicy0 = WorkTypeConverters.d(cursor0.getInt(v12));
                long v38 = cursor0.getLong(v13);
                long v39 = cursor0.getLong(v14);
                long v40 = cursor0.getLong(v15);
                long v41 = cursor0.getLong(v16);
                boolean z = cursor0.getInt(v17) != 0;
                OutOfQuotaPolicy outOfQuotaPolicy0 = WorkTypeConverters.f(cursor0.getInt(v18));
                int v42 = cursor0.getInt(v19);
                int v43 = cursor0.getInt(v20);
                long v44 = cursor0.getLong(v21);
                int v45 = cursor0.getInt(v22);
                int v46 = cursor0.getInt(v23);
                String s3 = cursor0.isNull(v24) ? null : cursor0.getString(v24);
                NetworkType networkType0 = WorkTypeConverters.e(cursor0.getInt(v25));
                list0.add(new WorkSpec(s, workInfo$State0, s1, s2, data0, data1, v34, v35, v36, new Constraints(WorkTypeConverters.l(cursor0.getBlob(v26)), networkType0, cursor0.getInt(v27) != 0, cursor0.getInt(v28) != 0, cursor0.getInt(v29) != 0, cursor0.getInt(v30) != 0, cursor0.getLong(v31), cursor0.getLong(v32), WorkTypeConverters.b(cursor0.getBlob(v33))), v37, backoffPolicy0, v38, v39, v40, v41, z, outOfQuotaPolicy0, v42, v43, v44, v45, v46, s3));
            }
            return list0;
        }
        finally {
            cursor0.close();
            roomSQLiteQuery0.release();
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public List E() {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.e("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.a.d();
        Cursor cursor0 = DBUtil.f(this.a, roomSQLiteQuery0, false, null);
        try {
            int v1 = CursorUtil.e(cursor0, "id");
            int v2 = CursorUtil.e(cursor0, "state");
            int v3 = CursorUtil.e(cursor0, "worker_class_name");
            int v4 = CursorUtil.e(cursor0, "input_merger_class_name");
            int v5 = CursorUtil.e(cursor0, "input");
            int v6 = CursorUtil.e(cursor0, "output");
            int v7 = CursorUtil.e(cursor0, "initial_delay");
            int v8 = CursorUtil.e(cursor0, "interval_duration");
            int v9 = CursorUtil.e(cursor0, "flex_duration");
            int v10 = CursorUtil.e(cursor0, "run_attempt_count");
            int v11 = CursorUtil.e(cursor0, "backoff_policy");
            int v12 = CursorUtil.e(cursor0, "backoff_delay_duration");
            int v13 = CursorUtil.e(cursor0, "last_enqueue_time");
            int v14 = CursorUtil.e(cursor0, "minimum_retention_duration");
            int v15 = CursorUtil.e(cursor0, "schedule_requested_at");
            int v16 = CursorUtil.e(cursor0, "run_in_foreground");
            int v17 = CursorUtil.e(cursor0, "out_of_quota_policy");
            int v18 = CursorUtil.e(cursor0, "period_count");
            int v19 = CursorUtil.e(cursor0, "generation");
            int v20 = CursorUtil.e(cursor0, "next_schedule_time_override");
            int v21 = CursorUtil.e(cursor0, "next_schedule_time_override_generation");
            int v22 = CursorUtil.e(cursor0, "stop_reason");
            int v23 = CursorUtil.e(cursor0, "trace_tag");
            int v24 = CursorUtil.e(cursor0, "required_network_type");
            int v25 = CursorUtil.e(cursor0, "required_network_request");
            int v26 = CursorUtil.e(cursor0, "requires_charging");
            int v27 = CursorUtil.e(cursor0, "requires_device_idle");
            int v28 = CursorUtil.e(cursor0, "requires_battery_not_low");
            int v29 = CursorUtil.e(cursor0, "requires_storage_not_low");
            int v30 = CursorUtil.e(cursor0, "trigger_content_update_delay");
            int v31 = CursorUtil.e(cursor0, "trigger_max_content_delay");
            int v32 = CursorUtil.e(cursor0, "content_uri_triggers");
            List list0 = new ArrayList(cursor0.getCount());
            while(cursor0.moveToNext()) {
                String s = cursor0.getString(v1);
                State workInfo$State0 = WorkTypeConverters.g(cursor0.getInt(v2));
                String s1 = cursor0.getString(v3);
                String s2 = cursor0.getString(v4);
                Data data0 = Data.b(cursor0.getBlob(v5));
                Data data1 = Data.b(cursor0.getBlob(v6));
                long v33 = cursor0.getLong(v7);
                long v34 = cursor0.getLong(v8);
                long v35 = cursor0.getLong(v9);
                int v36 = cursor0.getInt(v10);
                BackoffPolicy backoffPolicy0 = WorkTypeConverters.d(cursor0.getInt(v11));
                long v37 = cursor0.getLong(v12);
                long v38 = cursor0.getLong(v13);
                long v39 = cursor0.getLong(v14);
                long v40 = cursor0.getLong(v15);
                boolean z = cursor0.getInt(v16) != 0;
                OutOfQuotaPolicy outOfQuotaPolicy0 = WorkTypeConverters.f(cursor0.getInt(v17));
                int v41 = cursor0.getInt(v18);
                int v42 = cursor0.getInt(v19);
                long v43 = cursor0.getLong(v20);
                int v44 = cursor0.getInt(v21);
                int v45 = cursor0.getInt(v22);
                String s3 = cursor0.isNull(v23) ? null : cursor0.getString(v23);
                NetworkType networkType0 = WorkTypeConverters.e(cursor0.getInt(v24));
                list0.add(new WorkSpec(s, workInfo$State0, s1, s2, data0, data1, v33, v34, v35, new Constraints(WorkTypeConverters.l(cursor0.getBlob(v25)), networkType0, cursor0.getInt(v26) != 0, cursor0.getInt(v27) != 0, cursor0.getInt(v28) != 0, cursor0.getInt(v29) != 0, cursor0.getLong(v30), cursor0.getLong(v31), WorkTypeConverters.b(cursor0.getBlob(v32))), v36, backoffPolicy0, v37, v38, v39, v40, z, outOfQuotaPolicy0, v41, v42, v43, v44, v45, s3));
            }
            return list0;
        }
        finally {
            cursor0.close();
            roomSQLiteQuery0.release();
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public WorkInfoPojo F(String s) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.e("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id=?", 1);
        roomSQLiteQuery0.S0(1, s);
        this.a.d();
        this.a.e();
        try {
            WorkInfoPojo workSpec$WorkInfoPojo0 = null;
            Cursor cursor0 = DBUtil.f(this.a, roomSQLiteQuery0, true, null);
            try {
                HashMap hashMap0 = new HashMap();
                HashMap hashMap1 = new HashMap();
                while(cursor0.moveToNext()) {
                    String s1 = cursor0.getString(0);
                    if(!hashMap0.containsKey(s1)) {
                        hashMap0.put(s1, new ArrayList());
                    }
                    String s2 = cursor0.getString(0);
                    if(!hashMap1.containsKey(s2)) {
                        hashMap1.put(s2, new ArrayList());
                    }
                }
                cursor0.moveToPosition(-1);
                this.W(hashMap0);
                this.V(hashMap1);
                if(cursor0.moveToFirst()) {
                    String s3 = cursor0.getString(0);
                    State workInfo$State0 = WorkTypeConverters.g(cursor0.getInt(1));
                    Data data0 = Data.b(cursor0.getBlob(2));
                    int v2 = cursor0.getInt(3);
                    int v3 = cursor0.getInt(4);
                    long v4 = cursor0.getLong(14);
                    long v5 = cursor0.getLong(15);
                    long v6 = cursor0.getLong(16);
                    BackoffPolicy backoffPolicy0 = WorkTypeConverters.d(cursor0.getInt(17));
                    long v7 = cursor0.getLong(18);
                    long v8 = cursor0.getLong(19);
                    int v9 = cursor0.getInt(20);
                    long v10 = cursor0.getLong(21);
                    int v11 = cursor0.getInt(22);
                    NetworkType networkType0 = WorkTypeConverters.e(cursor0.getInt(5));
                    workSpec$WorkInfoPojo0 = new WorkInfoPojo(s3, workInfo$State0, data0, v4, v5, v6, new Constraints(WorkTypeConverters.l(cursor0.getBlob(6)), networkType0, cursor0.getInt(7) != 0, cursor0.getInt(8) != 0, cursor0.getInt(9) != 0, cursor0.getInt(10) != 0, cursor0.getLong(11), cursor0.getLong(12), WorkTypeConverters.b(cursor0.getBlob(13))), v2, backoffPolicy0, v7, v8, v9, v3, v10, v11, ((ArrayList)hashMap0.get(cursor0.getString(0))), ((ArrayList)hashMap1.get(cursor0.getString(0))));
                }
                this.a.Q();
                return workSpec$WorkInfoPojo0;
            }
            finally {
                cursor0.close();
                roomSQLiteQuery0.release();
            }
        }
        finally {
            this.a.k();
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public WorkSpec G(String s) {
        WorkSpec workSpec0;
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.e("SELECT * FROM workspec WHERE id=?", 1);
        roomSQLiteQuery0.S0(1, s);
        this.a.d();
        Cursor cursor0 = DBUtil.f(this.a, roomSQLiteQuery0, false, null);
        try {
            int v1 = CursorUtil.e(cursor0, "id");
            int v2 = CursorUtil.e(cursor0, "state");
            int v3 = CursorUtil.e(cursor0, "worker_class_name");
            int v4 = CursorUtil.e(cursor0, "input_merger_class_name");
            int v5 = CursorUtil.e(cursor0, "input");
            int v6 = CursorUtil.e(cursor0, "output");
            int v7 = CursorUtil.e(cursor0, "initial_delay");
            int v8 = CursorUtil.e(cursor0, "interval_duration");
            int v9 = CursorUtil.e(cursor0, "flex_duration");
            int v10 = CursorUtil.e(cursor0, "run_attempt_count");
            int v11 = CursorUtil.e(cursor0, "backoff_policy");
            int v12 = CursorUtil.e(cursor0, "backoff_delay_duration");
            int v13 = CursorUtil.e(cursor0, "last_enqueue_time");
            int v14 = CursorUtil.e(cursor0, "minimum_retention_duration");
            int v15 = CursorUtil.e(cursor0, "schedule_requested_at");
            int v16 = CursorUtil.e(cursor0, "run_in_foreground");
            int v17 = CursorUtil.e(cursor0, "out_of_quota_policy");
            int v18 = CursorUtil.e(cursor0, "period_count");
            int v19 = CursorUtil.e(cursor0, "generation");
            int v20 = CursorUtil.e(cursor0, "next_schedule_time_override");
            int v21 = CursorUtil.e(cursor0, "next_schedule_time_override_generation");
            int v22 = CursorUtil.e(cursor0, "stop_reason");
            int v23 = CursorUtil.e(cursor0, "trace_tag");
            int v24 = CursorUtil.e(cursor0, "required_network_type");
            int v25 = CursorUtil.e(cursor0, "required_network_request");
            int v26 = CursorUtil.e(cursor0, "requires_charging");
            int v27 = CursorUtil.e(cursor0, "requires_device_idle");
            int v28 = CursorUtil.e(cursor0, "requires_battery_not_low");
            int v29 = CursorUtil.e(cursor0, "requires_storage_not_low");
            int v30 = CursorUtil.e(cursor0, "trigger_content_update_delay");
            int v31 = CursorUtil.e(cursor0, "trigger_max_content_delay");
            int v32 = CursorUtil.e(cursor0, "content_uri_triggers");
            if(cursor0.moveToFirst()) {
                String s1 = cursor0.getString(v1);
                State workInfo$State0 = WorkTypeConverters.g(cursor0.getInt(v2));
                String s2 = cursor0.getString(v3);
                String s3 = cursor0.getString(v4);
                Data data0 = Data.b(cursor0.getBlob(v5));
                Data data1 = Data.b(cursor0.getBlob(v6));
                long v33 = cursor0.getLong(v7);
                long v34 = cursor0.getLong(v8);
                long v35 = cursor0.getLong(v9);
                int v36 = cursor0.getInt(v10);
                BackoffPolicy backoffPolicy0 = WorkTypeConverters.d(cursor0.getInt(v11));
                long v37 = cursor0.getLong(v12);
                long v38 = cursor0.getLong(v13);
                long v39 = cursor0.getLong(v14);
                long v40 = cursor0.getLong(v15);
                boolean z = cursor0.getInt(v16) != 0;
                OutOfQuotaPolicy outOfQuotaPolicy0 = WorkTypeConverters.f(cursor0.getInt(v17));
                int v41 = cursor0.getInt(v18);
                int v42 = cursor0.getInt(v19);
                long v43 = cursor0.getLong(v20);
                int v44 = cursor0.getInt(v21);
                int v45 = cursor0.getInt(v22);
                String s4 = cursor0.isNull(v23) ? null : cursor0.getString(v23);
                NetworkType networkType0 = WorkTypeConverters.e(cursor0.getInt(v24));
                workSpec0 = new WorkSpec(s1, workInfo$State0, s2, s3, data0, data1, v33, v34, v35, new Constraints(WorkTypeConverters.l(cursor0.getBlob(v25)), networkType0, cursor0.getInt(v26) != 0, cursor0.getInt(v27) != 0, cursor0.getInt(v28) != 0, cursor0.getInt(v29) != 0, cursor0.getLong(v30), cursor0.getLong(v31), WorkTypeConverters.b(cursor0.getBlob(v32))), v36, backoffPolicy0, v37, v38, v39, v40, z, outOfQuotaPolicy0, v41, v42, v43, v44, v45, s4);
            }
            else {
                workSpec0 = null;
            }
            return workSpec0;
        }
        finally {
            cursor0.close();
            roomSQLiteQuery0.release();
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public LiveData H(String s) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.e("SELECT schedule_requested_at FROM workspec WHERE id=?", 1);
        roomSQLiteQuery0.S0(1, s);
        androidx.work.impl.model.WorkSpecDao_Impl.26 workSpecDao_Impl$260 = new Callable() {
            final WorkSpecDao_Impl b;

            @Nullable
            public Long a() throws Exception {
                try(Cursor cursor0 = DBUtil.f(WorkSpecDao_Impl.this.a, roomSQLiteQuery0, false, null)) {
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
        return this.a.p().f(new String[]{"workspec"}, false, workSpecDao_Impl$260);
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public int I() {
        int v1;
        this.a.d();
        SupportSQLiteStatement supportSQLiteStatement0 = this.o.b();
        try {
            this.a.e();
            try {
                v1 = supportSQLiteStatement0.O();
                this.a.Q();
            }
            catch(Throwable throwable0) {
                this.a.k();
                throw throwable0;
            }
            this.a.k();
            return v1;
        }
        finally {
            this.o.h(supportSQLiteStatement0);
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public int J(String s, long v) {
        int v2;
        this.a.d();
        SupportSQLiteStatement supportSQLiteStatement0 = this.n.b();
        supportSQLiteStatement0.o1(1, v);
        supportSQLiteStatement0.S0(2, s);
        try {
            this.a.e();
            try {
                v2 = supportSQLiteStatement0.O();
                this.a.Q();
            }
            catch(Throwable throwable0) {
                this.a.k();
                throw throwable0;
            }
            this.a.k();
            return v2;
        }
        finally {
            this.n.h(supportSQLiteStatement0);
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public List K(String s) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.e("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        roomSQLiteQuery0.S0(1, s);
        this.a.d();
        Cursor cursor0 = DBUtil.f(this.a, roomSQLiteQuery0, false, null);
        try {
            List list0 = new ArrayList(cursor0.getCount());
            while(cursor0.moveToNext()) {
                list0.add(new IdAndState(cursor0.getString(0), WorkTypeConverters.g(cursor0.getInt(1))));
            }
            return list0;
        }
        finally {
            cursor0.close();
            roomSQLiteQuery0.release();
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public i L() {
        androidx.work.impl.model.WorkSpecDao_Impl.25 workSpecDao_Impl$250 = new Callable() {
            final WorkSpecDao_Impl b;

            @NonNull
            public Boolean a() throws Exception {
                try {
                    boolean z = false;
                    try(Cursor cursor0 = DBUtil.f(WorkSpecDao_Impl.this.a, RoomSQLiteQuery.e("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0), false, null)) {
                        if(cursor0.moveToFirst()) {
                            if(cursor0.getInt(0) != 0) {
                                z = true;
                            }
                            return Boolean.valueOf(z);
                        }
                    }
                    return false;
                }
                catch(Throwable throwable0) {
                    throw throwable0;
                }
            }

            @Override
            @NonNull
            public Object call() throws Exception {
                return this.a();
            }

            @Override
            protected void finalize() {
                RoomSQLiteQuery.e("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0).release();
            }
        };
        return CoroutinesRoom.a(this.a, false, new String[]{"workspec"}, workSpecDao_Impl$250);
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public List M(int v) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.e("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))", 1);
        roomSQLiteQuery0.o1(1, ((long)v));
        this.a.d();
        Cursor cursor0 = DBUtil.f(this.a, roomSQLiteQuery0, false, null);
        try {
            int v2 = CursorUtil.e(cursor0, "id");
            int v3 = CursorUtil.e(cursor0, "state");
            int v4 = CursorUtil.e(cursor0, "worker_class_name");
            int v5 = CursorUtil.e(cursor0, "input_merger_class_name");
            int v6 = CursorUtil.e(cursor0, "input");
            int v7 = CursorUtil.e(cursor0, "output");
            int v8 = CursorUtil.e(cursor0, "initial_delay");
            int v9 = CursorUtil.e(cursor0, "interval_duration");
            int v10 = CursorUtil.e(cursor0, "flex_duration");
            int v11 = CursorUtil.e(cursor0, "run_attempt_count");
            int v12 = CursorUtil.e(cursor0, "backoff_policy");
            int v13 = CursorUtil.e(cursor0, "backoff_delay_duration");
            int v14 = CursorUtil.e(cursor0, "last_enqueue_time");
            int v15 = CursorUtil.e(cursor0, "minimum_retention_duration");
            int v16 = CursorUtil.e(cursor0, "schedule_requested_at");
            int v17 = CursorUtil.e(cursor0, "run_in_foreground");
            int v18 = CursorUtil.e(cursor0, "out_of_quota_policy");
            int v19 = CursorUtil.e(cursor0, "period_count");
            int v20 = CursorUtil.e(cursor0, "generation");
            int v21 = CursorUtil.e(cursor0, "next_schedule_time_override");
            int v22 = CursorUtil.e(cursor0, "next_schedule_time_override_generation");
            int v23 = CursorUtil.e(cursor0, "stop_reason");
            int v24 = CursorUtil.e(cursor0, "trace_tag");
            int v25 = CursorUtil.e(cursor0, "required_network_type");
            int v26 = CursorUtil.e(cursor0, "required_network_request");
            int v27 = CursorUtil.e(cursor0, "requires_charging");
            int v28 = CursorUtil.e(cursor0, "requires_device_idle");
            int v29 = CursorUtil.e(cursor0, "requires_battery_not_low");
            int v30 = CursorUtil.e(cursor0, "requires_storage_not_low");
            int v31 = CursorUtil.e(cursor0, "trigger_content_update_delay");
            int v32 = CursorUtil.e(cursor0, "trigger_max_content_delay");
            int v33 = CursorUtil.e(cursor0, "content_uri_triggers");
            List list0 = new ArrayList(cursor0.getCount());
            while(cursor0.moveToNext()) {
                String s = cursor0.getString(v2);
                State workInfo$State0 = WorkTypeConverters.g(cursor0.getInt(v3));
                String s1 = cursor0.getString(v4);
                String s2 = cursor0.getString(v5);
                Data data0 = Data.b(cursor0.getBlob(v6));
                Data data1 = Data.b(cursor0.getBlob(v7));
                long v34 = cursor0.getLong(v8);
                long v35 = cursor0.getLong(v9);
                long v36 = cursor0.getLong(v10);
                int v37 = cursor0.getInt(v11);
                BackoffPolicy backoffPolicy0 = WorkTypeConverters.d(cursor0.getInt(v12));
                long v38 = cursor0.getLong(v13);
                long v39 = cursor0.getLong(v14);
                long v40 = cursor0.getLong(v15);
                long v41 = cursor0.getLong(v16);
                boolean z = cursor0.getInt(v17) != 0;
                OutOfQuotaPolicy outOfQuotaPolicy0 = WorkTypeConverters.f(cursor0.getInt(v18));
                int v42 = cursor0.getInt(v19);
                int v43 = cursor0.getInt(v20);
                long v44 = cursor0.getLong(v21);
                int v45 = cursor0.getInt(v22);
                int v46 = cursor0.getInt(v23);
                String s3 = cursor0.isNull(v24) ? null : cursor0.getString(v24);
                NetworkType networkType0 = WorkTypeConverters.e(cursor0.getInt(v25));
                list0.add(new WorkSpec(s, workInfo$State0, s1, s2, data0, data1, v34, v35, v36, new Constraints(WorkTypeConverters.l(cursor0.getBlob(v26)), networkType0, cursor0.getInt(v27) != 0, cursor0.getInt(v28) != 0, cursor0.getInt(v29) != 0, cursor0.getInt(v30) != 0, cursor0.getLong(v31), cursor0.getLong(v32), WorkTypeConverters.b(cursor0.getBlob(v33))), v37, backoffPolicy0, v38, v39, v40, v41, z, outOfQuotaPolicy0, v42, v43, v44, v45, v46, s3));
            }
            return list0;
        }
        finally {
            cursor0.close();
            roomSQLiteQuery0.release();
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public void N(String s, Data data0) {
        this.a.d();
        SupportSQLiteStatement supportSQLiteStatement0 = this.h.b();
        supportSQLiteStatement0.r1(1, Data.y(data0));
        supportSQLiteStatement0.S0(2, s);
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
            this.h.h(supportSQLiteStatement0);
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public List O() {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.e("SELECT * FROM workspec WHERE state=1", 0);
        this.a.d();
        Cursor cursor0 = DBUtil.f(this.a, roomSQLiteQuery0, false, null);
        try {
            int v1 = CursorUtil.e(cursor0, "id");
            int v2 = CursorUtil.e(cursor0, "state");
            int v3 = CursorUtil.e(cursor0, "worker_class_name");
            int v4 = CursorUtil.e(cursor0, "input_merger_class_name");
            int v5 = CursorUtil.e(cursor0, "input");
            int v6 = CursorUtil.e(cursor0, "output");
            int v7 = CursorUtil.e(cursor0, "initial_delay");
            int v8 = CursorUtil.e(cursor0, "interval_duration");
            int v9 = CursorUtil.e(cursor0, "flex_duration");
            int v10 = CursorUtil.e(cursor0, "run_attempt_count");
            int v11 = CursorUtil.e(cursor0, "backoff_policy");
            int v12 = CursorUtil.e(cursor0, "backoff_delay_duration");
            int v13 = CursorUtil.e(cursor0, "last_enqueue_time");
            int v14 = CursorUtil.e(cursor0, "minimum_retention_duration");
            int v15 = CursorUtil.e(cursor0, "schedule_requested_at");
            int v16 = CursorUtil.e(cursor0, "run_in_foreground");
            int v17 = CursorUtil.e(cursor0, "out_of_quota_policy");
            int v18 = CursorUtil.e(cursor0, "period_count");
            int v19 = CursorUtil.e(cursor0, "generation");
            int v20 = CursorUtil.e(cursor0, "next_schedule_time_override");
            int v21 = CursorUtil.e(cursor0, "next_schedule_time_override_generation");
            int v22 = CursorUtil.e(cursor0, "stop_reason");
            int v23 = CursorUtil.e(cursor0, "trace_tag");
            int v24 = CursorUtil.e(cursor0, "required_network_type");
            int v25 = CursorUtil.e(cursor0, "required_network_request");
            int v26 = CursorUtil.e(cursor0, "requires_charging");
            int v27 = CursorUtil.e(cursor0, "requires_device_idle");
            int v28 = CursorUtil.e(cursor0, "requires_battery_not_low");
            int v29 = CursorUtil.e(cursor0, "requires_storage_not_low");
            int v30 = CursorUtil.e(cursor0, "trigger_content_update_delay");
            int v31 = CursorUtil.e(cursor0, "trigger_max_content_delay");
            int v32 = CursorUtil.e(cursor0, "content_uri_triggers");
            List list0 = new ArrayList(cursor0.getCount());
            while(cursor0.moveToNext()) {
                String s = cursor0.getString(v1);
                State workInfo$State0 = WorkTypeConverters.g(cursor0.getInt(v2));
                String s1 = cursor0.getString(v3);
                String s2 = cursor0.getString(v4);
                Data data0 = Data.b(cursor0.getBlob(v5));
                Data data1 = Data.b(cursor0.getBlob(v6));
                long v33 = cursor0.getLong(v7);
                long v34 = cursor0.getLong(v8);
                long v35 = cursor0.getLong(v9);
                int v36 = cursor0.getInt(v10);
                BackoffPolicy backoffPolicy0 = WorkTypeConverters.d(cursor0.getInt(v11));
                long v37 = cursor0.getLong(v12);
                long v38 = cursor0.getLong(v13);
                long v39 = cursor0.getLong(v14);
                long v40 = cursor0.getLong(v15);
                boolean z = cursor0.getInt(v16) != 0;
                OutOfQuotaPolicy outOfQuotaPolicy0 = WorkTypeConverters.f(cursor0.getInt(v17));
                int v41 = cursor0.getInt(v18);
                int v42 = cursor0.getInt(v19);
                long v43 = cursor0.getLong(v20);
                int v44 = cursor0.getInt(v21);
                int v45 = cursor0.getInt(v22);
                String s3 = cursor0.isNull(v23) ? null : cursor0.getString(v23);
                NetworkType networkType0 = WorkTypeConverters.e(cursor0.getInt(v24));
                list0.add(new WorkSpec(s, workInfo$State0, s1, s2, data0, data1, v33, v34, v35, new Constraints(WorkTypeConverters.l(cursor0.getBlob(v25)), networkType0, cursor0.getInt(v26) != 0, cursor0.getInt(v27) != 0, cursor0.getInt(v28) != 0, cursor0.getInt(v29) != 0, cursor0.getLong(v30), cursor0.getLong(v31), WorkTypeConverters.b(cursor0.getBlob(v32))), v36, backoffPolicy0, v37, v38, v39, v40, z, outOfQuotaPolicy0, v41, v42, v43, v44, v45, s3));
            }
            return list0;
        }
        finally {
            cursor0.close();
            roomSQLiteQuery0.release();
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public i P(String s) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.e("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        roomSQLiteQuery0.S0(1, s);
        androidx.work.impl.model.WorkSpecDao_Impl.24 workSpecDao_Impl$240 = new Callable() {
            final WorkSpecDao_Impl b;

            @NonNull
            public List a() throws Exception {
                WorkSpecDao_Impl.this.a.e();
                try {
                    Cursor cursor0 = DBUtil.f(WorkSpecDao_Impl.this.a, roomSQLiteQuery0, true, null);
                    try {
                        HashMap hashMap0 = new HashMap();
                        HashMap hashMap1 = new HashMap();
                        while(cursor0.moveToNext()) {
                            String s = cursor0.getString(0);
                            if(!hashMap0.containsKey(s)) {
                                hashMap0.put(s, new ArrayList());
                            }
                            String s1 = cursor0.getString(0);
                            if(!hashMap1.containsKey(s1)) {
                                hashMap1.put(s1, new ArrayList());
                            }
                        }
                        cursor0.moveToPosition(-1);
                        WorkSpecDao_Impl.this.W(hashMap0);
                        WorkSpecDao_Impl.this.V(hashMap1);
                        List list0 = new ArrayList(cursor0.getCount());
                        while(cursor0.moveToNext()) {
                            String s2 = cursor0.getString(0);
                            State workInfo$State0 = WorkTypeConverters.g(cursor0.getInt(1));
                            Data data0 = Data.b(cursor0.getBlob(2));
                            int v2 = cursor0.getInt(3);
                            int v3 = cursor0.getInt(4);
                            long v4 = cursor0.getLong(14);
                            long v5 = cursor0.getLong(15);
                            long v6 = cursor0.getLong(16);
                            BackoffPolicy backoffPolicy0 = WorkTypeConverters.d(cursor0.getInt(17));
                            long v7 = cursor0.getLong(18);
                            long v8 = cursor0.getLong(19);
                            int v9 = cursor0.getInt(20);
                            long v10 = cursor0.getLong(21);
                            int v11 = cursor0.getInt(22);
                            NetworkType networkType0 = WorkTypeConverters.e(cursor0.getInt(5));
                            list0.add(new WorkInfoPojo(s2, workInfo$State0, data0, v4, v5, v6, new Constraints(WorkTypeConverters.l(cursor0.getBlob(6)), networkType0, cursor0.getInt(7) != 0, cursor0.getInt(8) != 0, cursor0.getInt(9) != 0, cursor0.getInt(10) != 0, cursor0.getLong(11), cursor0.getLong(12), WorkTypeConverters.b(cursor0.getBlob(13))), v2, backoffPolicy0, v7, v8, v9, v3, v10, v11, ((ArrayList)hashMap0.get(cursor0.getString(0))), ((ArrayList)hashMap1.get(cursor0.getString(0)))));
                        }
                        WorkSpecDao_Impl.this.a.Q();
                        return list0;
                    }
                    finally {
                        cursor0.close();
                    }
                }
                finally {
                    WorkSpecDao_Impl.this.a.k();
                }
            }

            @Override
            @NonNull
            public Object call() throws Exception {
                return this.a();
            }

            @Override
            protected void finalize() {
                roomSQLiteQuery0.release();
            }
        };
        return CoroutinesRoom.a(this.a, true, new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, workSpecDao_Impl$240);
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public List Q(String s) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.e("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        roomSQLiteQuery0.S0(1, s);
        this.a.d();
        this.a.e();
        try {
            Cursor cursor0 = DBUtil.f(this.a, roomSQLiteQuery0, true, null);
            try {
                HashMap hashMap0 = new HashMap();
                HashMap hashMap1 = new HashMap();
                while(cursor0.moveToNext()) {
                    String s1 = cursor0.getString(0);
                    if(!hashMap0.containsKey(s1)) {
                        hashMap0.put(s1, new ArrayList());
                    }
                    String s2 = cursor0.getString(0);
                    if(!hashMap1.containsKey(s2)) {
                        hashMap1.put(s2, new ArrayList());
                    }
                }
                cursor0.moveToPosition(-1);
                this.W(hashMap0);
                this.V(hashMap1);
                List list0 = new ArrayList(cursor0.getCount());
                while(cursor0.moveToNext()) {
                    String s3 = cursor0.getString(0);
                    State workInfo$State0 = WorkTypeConverters.g(cursor0.getInt(1));
                    Data data0 = Data.b(cursor0.getBlob(2));
                    int v2 = cursor0.getInt(3);
                    int v3 = cursor0.getInt(4);
                    long v4 = cursor0.getLong(14);
                    long v5 = cursor0.getLong(15);
                    long v6 = cursor0.getLong(16);
                    BackoffPolicy backoffPolicy0 = WorkTypeConverters.d(cursor0.getInt(17));
                    long v7 = cursor0.getLong(18);
                    long v8 = cursor0.getLong(19);
                    int v9 = cursor0.getInt(20);
                    long v10 = cursor0.getLong(21);
                    int v11 = cursor0.getInt(22);
                    NetworkType networkType0 = WorkTypeConverters.e(cursor0.getInt(5));
                    list0.add(new WorkInfoPojo(s3, workInfo$State0, data0, v4, v5, v6, new Constraints(WorkTypeConverters.l(cursor0.getBlob(6)), networkType0, cursor0.getInt(7) != 0, cursor0.getInt(8) != 0, cursor0.getInt(9) != 0, cursor0.getInt(10) != 0, cursor0.getLong(11), cursor0.getLong(12), WorkTypeConverters.b(cursor0.getBlob(13))), v2, backoffPolicy0, v7, v8, v9, v3, v10, v11, ((ArrayList)hashMap0.get(cursor0.getString(0))), ((ArrayList)hashMap1.get(cursor0.getString(0)))));
                }
                this.a.Q();
                return list0;
            }
            finally {
                cursor0.close();
                roomSQLiteQuery0.release();
            }
        }
        finally {
            this.a.k();
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public int R(String s) {
        int v1;
        this.a.d();
        SupportSQLiteStatement supportSQLiteStatement0 = this.j.b();
        supportSQLiteStatement0.S0(1, s);
        try {
            this.a.e();
            try {
                v1 = supportSQLiteStatement0.O();
                this.a.Q();
            }
            catch(Throwable throwable0) {
                this.a.k();
                throw throwable0;
            }
            this.a.k();
            return v1;
        }
        finally {
            this.j.h(supportSQLiteStatement0);
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public List S(List list0) {
        StringBuilder stringBuilder0 = StringUtil.d();
        stringBuilder0.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        int v = list0.size();
        StringUtil.a(stringBuilder0, v);
        stringBuilder0.append(")");
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.e(stringBuilder0.toString(), v);
        int v1 = 1;
        for(Object object0: list0) {
            roomSQLiteQuery0.S0(v1, ((String)object0));
            ++v1;
        }
        this.a.d();
        this.a.e();
        try {
            Cursor cursor0 = DBUtil.f(this.a, roomSQLiteQuery0, true, null);
            try {
                HashMap hashMap0 = new HashMap();
                HashMap hashMap1 = new HashMap();
                while(cursor0.moveToNext()) {
                    String s = cursor0.getString(0);
                    if(!hashMap0.containsKey(s)) {
                        hashMap0.put(s, new ArrayList());
                    }
                    String s1 = cursor0.getString(0);
                    if(!hashMap1.containsKey(s1)) {
                        hashMap1.put(s1, new ArrayList());
                    }
                }
                cursor0.moveToPosition(-1);
                this.W(hashMap0);
                this.V(hashMap1);
                List list1 = new ArrayList(cursor0.getCount());
                while(cursor0.moveToNext()) {
                    String s2 = cursor0.getString(0);
                    State workInfo$State0 = WorkTypeConverters.g(cursor0.getInt(1));
                    Data data0 = Data.b(cursor0.getBlob(2));
                    int v4 = cursor0.getInt(3);
                    int v5 = cursor0.getInt(4);
                    long v6 = cursor0.getLong(14);
                    long v7 = cursor0.getLong(15);
                    long v8 = cursor0.getLong(16);
                    BackoffPolicy backoffPolicy0 = WorkTypeConverters.d(cursor0.getInt(17));
                    long v9 = cursor0.getLong(18);
                    long v10 = cursor0.getLong(19);
                    int v11 = cursor0.getInt(20);
                    long v12 = cursor0.getLong(21);
                    int v13 = cursor0.getInt(22);
                    NetworkType networkType0 = WorkTypeConverters.e(cursor0.getInt(5));
                    list1.add(new WorkInfoPojo(s2, workInfo$State0, data0, v6, v7, v8, new Constraints(WorkTypeConverters.l(cursor0.getBlob(6)), networkType0, cursor0.getInt(7) != 0, cursor0.getInt(8) != 0, cursor0.getInt(9) != 0, cursor0.getInt(10) != 0, cursor0.getLong(11), cursor0.getLong(12), WorkTypeConverters.b(cursor0.getBlob(13))), v4, backoffPolicy0, v9, v10, v11, v5, v12, v13, ((ArrayList)hashMap0.get(cursor0.getString(0))), ((ArrayList)hashMap1.get(cursor0.getString(0)))));
                }
                this.a.Q();
                return list1;
            }
            finally {
                cursor0.close();
                roomSQLiteQuery0.release();
            }
        }
        finally {
            this.a.k();
        }
    }

    private void V(@NonNull HashMap hashMap0) {
        Set set0 = hashMap0.keySet();
        if(set0.isEmpty()) {
            return;
        }
        if(hashMap0.size() > 999) {
            RelationUtil.b(hashMap0, true, (HashMap hashMap0) -> {
                this.V(hashMap0);
                return S0.a;
            });
            return;
        }
        StringBuilder stringBuilder0 = StringUtil.d();
        stringBuilder0.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int v = set0.size();
        StringUtil.a(stringBuilder0, v);
        stringBuilder0.append(")");
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.e(stringBuilder0.toString(), v);
        int v1 = 1;
        for(Object object0: set0) {
            roomSQLiteQuery0.S0(v1, ((String)object0));
            ++v1;
        }
        try(Cursor cursor0 = DBUtil.f(this.a, roomSQLiteQuery0, false, null)) {
            int v2 = CursorUtil.d(cursor0, "work_spec_id");
            if(v2 != -1) {
                while(true) {
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                    ArrayList arrayList0 = (ArrayList)hashMap0.get(cursor0.getString(v2));
                    if(arrayList0 != null) {
                        arrayList0.add(Data.b(cursor0.getBlob(0)));
                    }
                }
            }
        }
    }

    private void W(@NonNull HashMap hashMap0) {
        Set set0 = hashMap0.keySet();
        if(set0.isEmpty()) {
            return;
        }
        if(hashMap0.size() > 999) {
            RelationUtil.b(hashMap0, true, (HashMap hashMap0) -> {
                this.W(hashMap0);
                return S0.a;
            });
            return;
        }
        StringBuilder stringBuilder0 = StringUtil.d();
        stringBuilder0.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int v = set0.size();
        StringUtil.a(stringBuilder0, v);
        stringBuilder0.append(")");
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.e(stringBuilder0.toString(), v);
        int v1 = 1;
        for(Object object0: set0) {
            roomSQLiteQuery0.S0(v1, ((String)object0));
            ++v1;
        }
        try(Cursor cursor0 = DBUtil.f(this.a, roomSQLiteQuery0, false, null)) {
            int v2 = CursorUtil.d(cursor0, "work_spec_id");
            if(v2 != -1) {
                while(true) {
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                    ArrayList arrayList0 = (ArrayList)hashMap0.get(cursor0.getString(v2));
                    if(arrayList0 != null) {
                        arrayList0.add(cursor0.getString(0));
                    }
                }
            }
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public void a(String s, int v) {
        this.a.d();
        SupportSQLiteStatement supportSQLiteStatement0 = this.r.b();
        supportSQLiteStatement0.o1(1, ((long)v));
        supportSQLiteStatement0.S0(2, s);
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
            this.r.h(supportSQLiteStatement0);
        }
    }

    @NonNull
    public static List a0() {
        return Collections.emptyList();
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public void b(String s) {
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

    // 检测为 Lambda 实现
    private S0 b0(HashMap hashMap0) [...]

    @Override  // androidx.work.impl.model.WorkSpecDao
    public void c(WorkSpec workSpec0) {
        this.a.d();
        this.a.e();
        try {
            this.c.j(workSpec0);
            this.a.Q();
        }
        finally {
            this.a.k();
        }
    }

    // 检测为 Lambda 实现
    private S0 c0(HashMap hashMap0) [...]

    @Override  // androidx.work.impl.model.WorkSpecDao
    public void d() {
        this.a.d();
        SupportSQLiteStatement supportSQLiteStatement0 = this.p.b();
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
            this.p.h(supportSQLiteStatement0);
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public void e(String s) {
        this.a.d();
        SupportSQLiteStatement supportSQLiteStatement0 = this.q.b();
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
            this.q.h(supportSQLiteStatement0);
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public void f(WorkSpec workSpec0) {
        this.a.d();
        this.a.e();
        try {
            this.b.k(workSpec0);
            this.a.Q();
        }
        finally {
            this.a.k();
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public void g(String s, long v) {
        this.a.d();
        SupportSQLiteStatement supportSQLiteStatement0 = this.l.b();
        supportSQLiteStatement0.o1(1, v);
        supportSQLiteStatement0.S0(2, s);
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
            this.l.h(supportSQLiteStatement0);
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public List h(String s) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.e("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
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

    @Override  // androidx.work.impl.model.WorkSpecDao
    public i i(List list0) {
        StringBuilder stringBuilder0 = StringUtil.d();
        stringBuilder0.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        int v = list0.size();
        StringUtil.a(stringBuilder0, v);
        stringBuilder0.append(")");
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.e(stringBuilder0.toString(), v);
        int v1 = 1;
        for(Object object0: list0) {
            roomSQLiteQuery0.S0(v1, ((String)object0));
            ++v1;
        }
        androidx.work.impl.model.WorkSpecDao_Impl.20 workSpecDao_Impl$200 = new Callable() {
            final WorkSpecDao_Impl b;

            @NonNull
            public List a() throws Exception {
                WorkSpecDao_Impl.this.a.e();
                try {
                    Cursor cursor0 = DBUtil.f(WorkSpecDao_Impl.this.a, roomSQLiteQuery0, true, null);
                    try {
                        HashMap hashMap0 = new HashMap();
                        HashMap hashMap1 = new HashMap();
                        while(cursor0.moveToNext()) {
                            String s = cursor0.getString(0);
                            if(!hashMap0.containsKey(s)) {
                                hashMap0.put(s, new ArrayList());
                            }
                            String s1 = cursor0.getString(0);
                            if(!hashMap1.containsKey(s1)) {
                                hashMap1.put(s1, new ArrayList());
                            }
                        }
                        cursor0.moveToPosition(-1);
                        WorkSpecDao_Impl.this.W(hashMap0);
                        WorkSpecDao_Impl.this.V(hashMap1);
                        List list0 = new ArrayList(cursor0.getCount());
                        while(cursor0.moveToNext()) {
                            String s2 = cursor0.getString(0);
                            State workInfo$State0 = WorkTypeConverters.g(cursor0.getInt(1));
                            Data data0 = Data.b(cursor0.getBlob(2));
                            int v2 = cursor0.getInt(3);
                            int v3 = cursor0.getInt(4);
                            long v4 = cursor0.getLong(14);
                            long v5 = cursor0.getLong(15);
                            long v6 = cursor0.getLong(16);
                            BackoffPolicy backoffPolicy0 = WorkTypeConverters.d(cursor0.getInt(17));
                            long v7 = cursor0.getLong(18);
                            long v8 = cursor0.getLong(19);
                            int v9 = cursor0.getInt(20);
                            long v10 = cursor0.getLong(21);
                            int v11 = cursor0.getInt(22);
                            NetworkType networkType0 = WorkTypeConverters.e(cursor0.getInt(5));
                            list0.add(new WorkInfoPojo(s2, workInfo$State0, data0, v4, v5, v6, new Constraints(WorkTypeConverters.l(cursor0.getBlob(6)), networkType0, cursor0.getInt(7) != 0, cursor0.getInt(8) != 0, cursor0.getInt(9) != 0, cursor0.getInt(10) != 0, cursor0.getLong(11), cursor0.getLong(12), WorkTypeConverters.b(cursor0.getBlob(13))), v2, backoffPolicy0, v7, v8, v9, v3, v10, v11, ((ArrayList)hashMap0.get(cursor0.getString(0))), ((ArrayList)hashMap1.get(cursor0.getString(0)))));
                        }
                        WorkSpecDao_Impl.this.a.Q();
                        return list0;
                    }
                    finally {
                        cursor0.close();
                    }
                }
                finally {
                    WorkSpecDao_Impl.this.a.k();
                }
            }

            @Override
            @NonNull
            public Object call() throws Exception {
                return this.a();
            }

            @Override
            protected void finalize() {
                roomSQLiteQuery0.release();
            }
        };
        return CoroutinesRoom.a(this.a, true, new String[]{"WorkTag", "WorkProgress", "workspec"}, workSpecDao_Impl$200);
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public State j(String s) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.e("SELECT state FROM workspec WHERE id=?", 1);
        roomSQLiteQuery0.S0(1, s);
        this.a.d();
        State workInfo$State0 = null;
        Cursor cursor0 = DBUtil.f(this.a, roomSQLiteQuery0, false, null);
        try {
            if(cursor0.moveToFirst()) {
                Integer integer0 = cursor0.isNull(0) ? null : cursor0.getInt(0);
                if(integer0 != null) {
                    workInfo$State0 = WorkTypeConverters.g(((int)integer0));
                }
            }
            return workInfo$State0;
        }
        finally {
            cursor0.close();
            roomSQLiteQuery0.release();
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public int k(String s) {
        int v1;
        this.a.d();
        SupportSQLiteStatement supportSQLiteStatement0 = this.f.b();
        supportSQLiteStatement0.S0(1, s);
        try {
            this.a.e();
            try {
                v1 = supportSQLiteStatement0.O();
                this.a.Q();
            }
            catch(Throwable throwable0) {
                this.a.k();
                throw throwable0;
            }
            this.a.k();
            return v1;
        }
        finally {
            this.f.h(supportSQLiteStatement0);
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public List l(String s) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.e("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
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

    @Override  // androidx.work.impl.model.WorkSpecDao
    public List m(String s) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.e("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        roomSQLiteQuery0.S0(1, s);
        this.a.d();
        Cursor cursor0 = DBUtil.f(this.a, roomSQLiteQuery0, false, null);
        try {
            List list0 = new ArrayList(cursor0.getCount());
            while(cursor0.moveToNext()) {
                list0.add(Data.b(cursor0.getBlob(0)));
            }
            return list0;
        }
        finally {
            cursor0.close();
            roomSQLiteQuery0.release();
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public List n(String s) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.e("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        roomSQLiteQuery0.S0(1, s);
        this.a.d();
        this.a.e();
        try {
            Cursor cursor0 = DBUtil.f(this.a, roomSQLiteQuery0, true, null);
            try {
                HashMap hashMap0 = new HashMap();
                HashMap hashMap1 = new HashMap();
                while(cursor0.moveToNext()) {
                    String s1 = cursor0.getString(0);
                    if(!hashMap0.containsKey(s1)) {
                        hashMap0.put(s1, new ArrayList());
                    }
                    String s2 = cursor0.getString(0);
                    if(!hashMap1.containsKey(s2)) {
                        hashMap1.put(s2, new ArrayList());
                    }
                }
                cursor0.moveToPosition(-1);
                this.W(hashMap0);
                this.V(hashMap1);
                List list0 = new ArrayList(cursor0.getCount());
                while(cursor0.moveToNext()) {
                    String s3 = cursor0.getString(0);
                    State workInfo$State0 = WorkTypeConverters.g(cursor0.getInt(1));
                    Data data0 = Data.b(cursor0.getBlob(2));
                    int v2 = cursor0.getInt(3);
                    int v3 = cursor0.getInt(4);
                    long v4 = cursor0.getLong(14);
                    long v5 = cursor0.getLong(15);
                    long v6 = cursor0.getLong(16);
                    BackoffPolicy backoffPolicy0 = WorkTypeConverters.d(cursor0.getInt(17));
                    long v7 = cursor0.getLong(18);
                    long v8 = cursor0.getLong(19);
                    int v9 = cursor0.getInt(20);
                    long v10 = cursor0.getLong(21);
                    int v11 = cursor0.getInt(22);
                    NetworkType networkType0 = WorkTypeConverters.e(cursor0.getInt(5));
                    list0.add(new WorkInfoPojo(s3, workInfo$State0, data0, v4, v5, v6, new Constraints(WorkTypeConverters.l(cursor0.getBlob(6)), networkType0, cursor0.getInt(7) != 0, cursor0.getInt(8) != 0, cursor0.getInt(9) != 0, cursor0.getInt(10) != 0, cursor0.getLong(11), cursor0.getLong(12), WorkTypeConverters.b(cursor0.getBlob(13))), v2, backoffPolicy0, v7, v8, v9, v3, v10, v11, ((ArrayList)hashMap0.get(cursor0.getString(0))), ((ArrayList)hashMap1.get(cursor0.getString(0)))));
                }
                this.a.Q();
                return list0;
            }
            finally {
                cursor0.close();
                roomSQLiteQuery0.release();
            }
        }
        finally {
            this.a.k();
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public List o(int v) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.e("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        roomSQLiteQuery0.o1(1, ((long)v));
        this.a.d();
        Cursor cursor0 = DBUtil.f(this.a, roomSQLiteQuery0, false, null);
        try {
            int v2 = CursorUtil.e(cursor0, "id");
            int v3 = CursorUtil.e(cursor0, "state");
            int v4 = CursorUtil.e(cursor0, "worker_class_name");
            int v5 = CursorUtil.e(cursor0, "input_merger_class_name");
            int v6 = CursorUtil.e(cursor0, "input");
            int v7 = CursorUtil.e(cursor0, "output");
            int v8 = CursorUtil.e(cursor0, "initial_delay");
            int v9 = CursorUtil.e(cursor0, "interval_duration");
            int v10 = CursorUtil.e(cursor0, "flex_duration");
            int v11 = CursorUtil.e(cursor0, "run_attempt_count");
            int v12 = CursorUtil.e(cursor0, "backoff_policy");
            int v13 = CursorUtil.e(cursor0, "backoff_delay_duration");
            int v14 = CursorUtil.e(cursor0, "last_enqueue_time");
            int v15 = CursorUtil.e(cursor0, "minimum_retention_duration");
            int v16 = CursorUtil.e(cursor0, "schedule_requested_at");
            int v17 = CursorUtil.e(cursor0, "run_in_foreground");
            int v18 = CursorUtil.e(cursor0, "out_of_quota_policy");
            int v19 = CursorUtil.e(cursor0, "period_count");
            int v20 = CursorUtil.e(cursor0, "generation");
            int v21 = CursorUtil.e(cursor0, "next_schedule_time_override");
            int v22 = CursorUtil.e(cursor0, "next_schedule_time_override_generation");
            int v23 = CursorUtil.e(cursor0, "stop_reason");
            int v24 = CursorUtil.e(cursor0, "trace_tag");
            int v25 = CursorUtil.e(cursor0, "required_network_type");
            int v26 = CursorUtil.e(cursor0, "required_network_request");
            int v27 = CursorUtil.e(cursor0, "requires_charging");
            int v28 = CursorUtil.e(cursor0, "requires_device_idle");
            int v29 = CursorUtil.e(cursor0, "requires_battery_not_low");
            int v30 = CursorUtil.e(cursor0, "requires_storage_not_low");
            int v31 = CursorUtil.e(cursor0, "trigger_content_update_delay");
            int v32 = CursorUtil.e(cursor0, "trigger_max_content_delay");
            int v33 = CursorUtil.e(cursor0, "content_uri_triggers");
            List list0 = new ArrayList(cursor0.getCount());
            while(cursor0.moveToNext()) {
                String s = cursor0.getString(v2);
                State workInfo$State0 = WorkTypeConverters.g(cursor0.getInt(v3));
                String s1 = cursor0.getString(v4);
                String s2 = cursor0.getString(v5);
                Data data0 = Data.b(cursor0.getBlob(v6));
                Data data1 = Data.b(cursor0.getBlob(v7));
                long v34 = cursor0.getLong(v8);
                long v35 = cursor0.getLong(v9);
                long v36 = cursor0.getLong(v10);
                int v37 = cursor0.getInt(v11);
                BackoffPolicy backoffPolicy0 = WorkTypeConverters.d(cursor0.getInt(v12));
                long v38 = cursor0.getLong(v13);
                long v39 = cursor0.getLong(v14);
                long v40 = cursor0.getLong(v15);
                long v41 = cursor0.getLong(v16);
                boolean z = cursor0.getInt(v17) != 0;
                OutOfQuotaPolicy outOfQuotaPolicy0 = WorkTypeConverters.f(cursor0.getInt(v18));
                int v42 = cursor0.getInt(v19);
                int v43 = cursor0.getInt(v20);
                long v44 = cursor0.getLong(v21);
                int v45 = cursor0.getInt(v22);
                int v46 = cursor0.getInt(v23);
                String s3 = cursor0.isNull(v24) ? null : cursor0.getString(v24);
                NetworkType networkType0 = WorkTypeConverters.e(cursor0.getInt(v25));
                list0.add(new WorkSpec(s, workInfo$State0, s1, s2, data0, data1, v34, v35, v36, new Constraints(WorkTypeConverters.l(cursor0.getBlob(v26)), networkType0, cursor0.getInt(v27) != 0, cursor0.getInt(v28) != 0, cursor0.getInt(v29) != 0, cursor0.getInt(v30) != 0, cursor0.getLong(v31), cursor0.getLong(v32), WorkTypeConverters.b(cursor0.getBlob(v33))), v37, backoffPolicy0, v38, v39, v40, v41, z, outOfQuotaPolicy0, v42, v43, v44, v45, v46, s3));
            }
            return list0;
        }
        finally {
            cursor0.close();
            roomSQLiteQuery0.release();
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public i p(String s) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.e("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        roomSQLiteQuery0.S0(1, s);
        androidx.work.impl.model.WorkSpecDao_Impl.21 workSpecDao_Impl$210 = new Callable() {
            final WorkSpecDao_Impl b;

            @NonNull
            public List a() throws Exception {
                WorkSpecDao_Impl.this.a.e();
                try {
                    Cursor cursor0 = DBUtil.f(WorkSpecDao_Impl.this.a, roomSQLiteQuery0, true, null);
                    try {
                        HashMap hashMap0 = new HashMap();
                        HashMap hashMap1 = new HashMap();
                        while(cursor0.moveToNext()) {
                            String s = cursor0.getString(0);
                            if(!hashMap0.containsKey(s)) {
                                hashMap0.put(s, new ArrayList());
                            }
                            String s1 = cursor0.getString(0);
                            if(!hashMap1.containsKey(s1)) {
                                hashMap1.put(s1, new ArrayList());
                            }
                        }
                        cursor0.moveToPosition(-1);
                        WorkSpecDao_Impl.this.W(hashMap0);
                        WorkSpecDao_Impl.this.V(hashMap1);
                        List list0 = new ArrayList(cursor0.getCount());
                        while(cursor0.moveToNext()) {
                            String s2 = cursor0.getString(0);
                            State workInfo$State0 = WorkTypeConverters.g(cursor0.getInt(1));
                            Data data0 = Data.b(cursor0.getBlob(2));
                            int v2 = cursor0.getInt(3);
                            int v3 = cursor0.getInt(4);
                            long v4 = cursor0.getLong(14);
                            long v5 = cursor0.getLong(15);
                            long v6 = cursor0.getLong(16);
                            BackoffPolicy backoffPolicy0 = WorkTypeConverters.d(cursor0.getInt(17));
                            long v7 = cursor0.getLong(18);
                            long v8 = cursor0.getLong(19);
                            int v9 = cursor0.getInt(20);
                            long v10 = cursor0.getLong(21);
                            int v11 = cursor0.getInt(22);
                            NetworkType networkType0 = WorkTypeConverters.e(cursor0.getInt(5));
                            list0.add(new WorkInfoPojo(s2, workInfo$State0, data0, v4, v5, v6, new Constraints(WorkTypeConverters.l(cursor0.getBlob(6)), networkType0, cursor0.getInt(7) != 0, cursor0.getInt(8) != 0, cursor0.getInt(9) != 0, cursor0.getInt(10) != 0, cursor0.getLong(11), cursor0.getLong(12), WorkTypeConverters.b(cursor0.getBlob(13))), v2, backoffPolicy0, v7, v8, v9, v3, v10, v11, ((ArrayList)hashMap0.get(cursor0.getString(0))), ((ArrayList)hashMap1.get(cursor0.getString(0)))));
                        }
                        WorkSpecDao_Impl.this.a.Q();
                        return list0;
                    }
                    finally {
                        cursor0.close();
                    }
                }
                finally {
                    WorkSpecDao_Impl.this.a.k();
                }
            }

            @Override
            @NonNull
            public Object call() throws Exception {
                return this.a();
            }

            @Override
            protected void finalize() {
                roomSQLiteQuery0.release();
            }
        };
        return CoroutinesRoom.a(this.a, true, new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, workSpecDao_Impl$210);
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public int q(State workInfo$State0, String s) {
        int v1;
        this.a.d();
        SupportSQLiteStatement supportSQLiteStatement0 = this.e.b();
        supportSQLiteStatement0.o1(1, ((long)WorkTypeConverters.k(workInfo$State0)));
        supportSQLiteStatement0.S0(2, s);
        try {
            this.a.e();
            try {
                v1 = supportSQLiteStatement0.O();
                this.a.Q();
            }
            catch(Throwable throwable0) {
                this.a.k();
                throw throwable0;
            }
            this.a.k();
            return v1;
        }
        finally {
            this.e.h(supportSQLiteStatement0);
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public LiveData r() {
        androidx.work.impl.model.WorkSpecDao_Impl.18 workSpecDao_Impl$180 = new Callable() {
            final WorkSpecDao_Impl b;

            @Nullable
            public List a() throws Exception {
                WorkSpecDao_Impl.this.a.e();
                try {
                    Cursor cursor0 = DBUtil.f(WorkSpecDao_Impl.this.a, RoomSQLiteQuery.e("SELECT id FROM workspec", 0), false, null);
                    try {
                        List list0 = new ArrayList(cursor0.getCount());
                        while(cursor0.moveToNext()) {
                            list0.add(cursor0.getString(0));
                        }
                        WorkSpecDao_Impl.this.a.Q();
                        return list0;
                    }
                    finally {
                        cursor0.close();
                    }
                }
                finally {
                    WorkSpecDao_Impl.this.a.k();
                }
            }

            @Override
            @Nullable
            public Object call() throws Exception {
                return this.a();
            }

            @Override
            protected void finalize() {
                RoomSQLiteQuery.e("SELECT id FROM workspec", 0).release();
            }
        };
        return this.a.p().f(new String[]{"workspec"}, true, workSpecDao_Impl$180);
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public LiveData s(String s) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.e("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        roomSQLiteQuery0.S0(1, s);
        androidx.work.impl.model.WorkSpecDao_Impl.23 workSpecDao_Impl$230 = new Callable() {
            final WorkSpecDao_Impl b;

            @Nullable
            public List a() throws Exception {
                WorkSpecDao_Impl.this.a.e();
                try {
                    Cursor cursor0 = DBUtil.f(WorkSpecDao_Impl.this.a, roomSQLiteQuery0, true, null);
                    try {
                        HashMap hashMap0 = new HashMap();
                        HashMap hashMap1 = new HashMap();
                        while(cursor0.moveToNext()) {
                            String s = cursor0.getString(0);
                            if(!hashMap0.containsKey(s)) {
                                hashMap0.put(s, new ArrayList());
                            }
                            String s1 = cursor0.getString(0);
                            if(!hashMap1.containsKey(s1)) {
                                hashMap1.put(s1, new ArrayList());
                            }
                        }
                        cursor0.moveToPosition(-1);
                        WorkSpecDao_Impl.this.W(hashMap0);
                        WorkSpecDao_Impl.this.V(hashMap1);
                        List list0 = new ArrayList(cursor0.getCount());
                        while(cursor0.moveToNext()) {
                            String s2 = cursor0.getString(0);
                            State workInfo$State0 = WorkTypeConverters.g(cursor0.getInt(1));
                            Data data0 = Data.b(cursor0.getBlob(2));
                            int v2 = cursor0.getInt(3);
                            int v3 = cursor0.getInt(4);
                            long v4 = cursor0.getLong(14);
                            long v5 = cursor0.getLong(15);
                            long v6 = cursor0.getLong(16);
                            BackoffPolicy backoffPolicy0 = WorkTypeConverters.d(cursor0.getInt(17));
                            long v7 = cursor0.getLong(18);
                            long v8 = cursor0.getLong(19);
                            int v9 = cursor0.getInt(20);
                            long v10 = cursor0.getLong(21);
                            int v11 = cursor0.getInt(22);
                            NetworkType networkType0 = WorkTypeConverters.e(cursor0.getInt(5));
                            list0.add(new WorkInfoPojo(s2, workInfo$State0, data0, v4, v5, v6, new Constraints(WorkTypeConverters.l(cursor0.getBlob(6)), networkType0, cursor0.getInt(7) != 0, cursor0.getInt(8) != 0, cursor0.getInt(9) != 0, cursor0.getInt(10) != 0, cursor0.getLong(11), cursor0.getLong(12), WorkTypeConverters.b(cursor0.getBlob(13))), v2, backoffPolicy0, v7, v8, v9, v3, v10, v11, ((ArrayList)hashMap0.get(cursor0.getString(0))), ((ArrayList)hashMap1.get(cursor0.getString(0)))));
                        }
                        WorkSpecDao_Impl.this.a.Q();
                        return list0;
                    }
                    finally {
                        cursor0.close();
                    }
                }
                finally {
                    WorkSpecDao_Impl.this.a.k();
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
        return this.a.p().f(new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, true, workSpecDao_Impl$230);
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public void t(String s, long v) {
        this.a.d();
        SupportSQLiteStatement supportSQLiteStatement0 = this.i.b();
        supportSQLiteStatement0.o1(1, v);
        supportSQLiteStatement0.S0(2, s);
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
            this.i.h(supportSQLiteStatement0);
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public LiveData u(String s) {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.e("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        roomSQLiteQuery0.S0(1, s);
        androidx.work.impl.model.WorkSpecDao_Impl.22 workSpecDao_Impl$220 = new Callable() {
            final WorkSpecDao_Impl b;

            @Nullable
            public List a() throws Exception {
                WorkSpecDao_Impl.this.a.e();
                try {
                    Cursor cursor0 = DBUtil.f(WorkSpecDao_Impl.this.a, roomSQLiteQuery0, true, null);
                    try {
                        HashMap hashMap0 = new HashMap();
                        HashMap hashMap1 = new HashMap();
                        while(cursor0.moveToNext()) {
                            String s = cursor0.getString(0);
                            if(!hashMap0.containsKey(s)) {
                                hashMap0.put(s, new ArrayList());
                            }
                            String s1 = cursor0.getString(0);
                            if(!hashMap1.containsKey(s1)) {
                                hashMap1.put(s1, new ArrayList());
                            }
                        }
                        cursor0.moveToPosition(-1);
                        WorkSpecDao_Impl.this.W(hashMap0);
                        WorkSpecDao_Impl.this.V(hashMap1);
                        List list0 = new ArrayList(cursor0.getCount());
                        while(cursor0.moveToNext()) {
                            String s2 = cursor0.getString(0);
                            State workInfo$State0 = WorkTypeConverters.g(cursor0.getInt(1));
                            Data data0 = Data.b(cursor0.getBlob(2));
                            int v2 = cursor0.getInt(3);
                            int v3 = cursor0.getInt(4);
                            long v4 = cursor0.getLong(14);
                            long v5 = cursor0.getLong(15);
                            long v6 = cursor0.getLong(16);
                            BackoffPolicy backoffPolicy0 = WorkTypeConverters.d(cursor0.getInt(17));
                            long v7 = cursor0.getLong(18);
                            long v8 = cursor0.getLong(19);
                            int v9 = cursor0.getInt(20);
                            long v10 = cursor0.getLong(21);
                            int v11 = cursor0.getInt(22);
                            NetworkType networkType0 = WorkTypeConverters.e(cursor0.getInt(5));
                            list0.add(new WorkInfoPojo(s2, workInfo$State0, data0, v4, v5, v6, new Constraints(WorkTypeConverters.l(cursor0.getBlob(6)), networkType0, cursor0.getInt(7) != 0, cursor0.getInt(8) != 0, cursor0.getInt(9) != 0, cursor0.getInt(10) != 0, cursor0.getLong(11), cursor0.getLong(12), WorkTypeConverters.b(cursor0.getBlob(13))), v2, backoffPolicy0, v7, v8, v9, v3, v10, v11, ((ArrayList)hashMap0.get(cursor0.getString(0))), ((ArrayList)hashMap1.get(cursor0.getString(0)))));
                        }
                        WorkSpecDao_Impl.this.a.Q();
                        return list0;
                    }
                    finally {
                        cursor0.close();
                    }
                }
                finally {
                    WorkSpecDao_Impl.this.a.k();
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
        return this.a.p().f(new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, true, workSpecDao_Impl$220);
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public List v() {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.e("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
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

    @Override  // androidx.work.impl.model.WorkSpecDao
    public List w() {
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.e("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time", 0);
        this.a.d();
        Cursor cursor0 = DBUtil.f(this.a, roomSQLiteQuery0, false, null);
        try {
            int v1 = CursorUtil.e(cursor0, "id");
            int v2 = CursorUtil.e(cursor0, "state");
            int v3 = CursorUtil.e(cursor0, "worker_class_name");
            int v4 = CursorUtil.e(cursor0, "input_merger_class_name");
            int v5 = CursorUtil.e(cursor0, "input");
            int v6 = CursorUtil.e(cursor0, "output");
            int v7 = CursorUtil.e(cursor0, "initial_delay");
            int v8 = CursorUtil.e(cursor0, "interval_duration");
            int v9 = CursorUtil.e(cursor0, "flex_duration");
            int v10 = CursorUtil.e(cursor0, "run_attempt_count");
            int v11 = CursorUtil.e(cursor0, "backoff_policy");
            int v12 = CursorUtil.e(cursor0, "backoff_delay_duration");
            int v13 = CursorUtil.e(cursor0, "last_enqueue_time");
            int v14 = CursorUtil.e(cursor0, "minimum_retention_duration");
            int v15 = CursorUtil.e(cursor0, "schedule_requested_at");
            int v16 = CursorUtil.e(cursor0, "run_in_foreground");
            int v17 = CursorUtil.e(cursor0, "out_of_quota_policy");
            int v18 = CursorUtil.e(cursor0, "period_count");
            int v19 = CursorUtil.e(cursor0, "generation");
            int v20 = CursorUtil.e(cursor0, "next_schedule_time_override");
            int v21 = CursorUtil.e(cursor0, "next_schedule_time_override_generation");
            int v22 = CursorUtil.e(cursor0, "stop_reason");
            int v23 = CursorUtil.e(cursor0, "trace_tag");
            int v24 = CursorUtil.e(cursor0, "required_network_type");
            int v25 = CursorUtil.e(cursor0, "required_network_request");
            int v26 = CursorUtil.e(cursor0, "requires_charging");
            int v27 = CursorUtil.e(cursor0, "requires_device_idle");
            int v28 = CursorUtil.e(cursor0, "requires_battery_not_low");
            int v29 = CursorUtil.e(cursor0, "requires_storage_not_low");
            int v30 = CursorUtil.e(cursor0, "trigger_content_update_delay");
            int v31 = CursorUtil.e(cursor0, "trigger_max_content_delay");
            int v32 = CursorUtil.e(cursor0, "content_uri_triggers");
            List list0 = new ArrayList(cursor0.getCount());
            while(cursor0.moveToNext()) {
                String s = cursor0.getString(v1);
                State workInfo$State0 = WorkTypeConverters.g(cursor0.getInt(v2));
                String s1 = cursor0.getString(v3);
                String s2 = cursor0.getString(v4);
                Data data0 = Data.b(cursor0.getBlob(v5));
                Data data1 = Data.b(cursor0.getBlob(v6));
                long v33 = cursor0.getLong(v7);
                long v34 = cursor0.getLong(v8);
                long v35 = cursor0.getLong(v9);
                int v36 = cursor0.getInt(v10);
                BackoffPolicy backoffPolicy0 = WorkTypeConverters.d(cursor0.getInt(v11));
                long v37 = cursor0.getLong(v12);
                long v38 = cursor0.getLong(v13);
                long v39 = cursor0.getLong(v14);
                long v40 = cursor0.getLong(v15);
                boolean z = cursor0.getInt(v16) != 0;
                OutOfQuotaPolicy outOfQuotaPolicy0 = WorkTypeConverters.f(cursor0.getInt(v17));
                int v41 = cursor0.getInt(v18);
                int v42 = cursor0.getInt(v19);
                long v43 = cursor0.getLong(v20);
                int v44 = cursor0.getInt(v21);
                int v45 = cursor0.getInt(v22);
                String s3 = cursor0.isNull(v23) ? null : cursor0.getString(v23);
                NetworkType networkType0 = WorkTypeConverters.e(cursor0.getInt(v24));
                list0.add(new WorkSpec(s, workInfo$State0, s1, s2, data0, data1, v33, v34, v35, new Constraints(WorkTypeConverters.l(cursor0.getBlob(v25)), networkType0, cursor0.getInt(v26) != 0, cursor0.getInt(v27) != 0, cursor0.getInt(v28) != 0, cursor0.getInt(v29) != 0, cursor0.getLong(v30), cursor0.getLong(v31), WorkTypeConverters.b(cursor0.getBlob(v32))), v36, backoffPolicy0, v37, v38, v39, v40, z, outOfQuotaPolicy0, v41, v42, v43, v44, v45, s3));
            }
            return list0;
        }
        finally {
            cursor0.close();
            roomSQLiteQuery0.release();
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public int x(String s) {
        int v1;
        this.a.d();
        SupportSQLiteStatement supportSQLiteStatement0 = this.k.b();
        supportSQLiteStatement0.S0(1, s);
        try {
            this.a.e();
            try {
                v1 = supportSQLiteStatement0.O();
                this.a.Q();
            }
            catch(Throwable throwable0) {
                this.a.k();
                throw throwable0;
            }
            this.a.k();
            return v1;
        }
        finally {
            this.k.h(supportSQLiteStatement0);
        }
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public LiveData y(List list0) {
        StringBuilder stringBuilder0 = StringUtil.d();
        stringBuilder0.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        int v = list0.size();
        StringUtil.a(stringBuilder0, v);
        stringBuilder0.append(")");
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.e(stringBuilder0.toString(), v);
        int v1 = 1;
        for(Object object0: list0) {
            roomSQLiteQuery0.S0(v1, ((String)object0));
            ++v1;
        }
        androidx.work.impl.model.WorkSpecDao_Impl.19 workSpecDao_Impl$190 = new Callable() {
            final WorkSpecDao_Impl b;

            @Nullable
            public List a() throws Exception {
                WorkSpecDao_Impl.this.a.e();
                try {
                    Cursor cursor0 = DBUtil.f(WorkSpecDao_Impl.this.a, roomSQLiteQuery0, true, null);
                    try {
                        HashMap hashMap0 = new HashMap();
                        HashMap hashMap1 = new HashMap();
                        while(cursor0.moveToNext()) {
                            String s = cursor0.getString(0);
                            if(!hashMap0.containsKey(s)) {
                                hashMap0.put(s, new ArrayList());
                            }
                            String s1 = cursor0.getString(0);
                            if(!hashMap1.containsKey(s1)) {
                                hashMap1.put(s1, new ArrayList());
                            }
                        }
                        cursor0.moveToPosition(-1);
                        WorkSpecDao_Impl.this.W(hashMap0);
                        WorkSpecDao_Impl.this.V(hashMap1);
                        List list0 = new ArrayList(cursor0.getCount());
                        while(cursor0.moveToNext()) {
                            String s2 = cursor0.getString(0);
                            State workInfo$State0 = WorkTypeConverters.g(cursor0.getInt(1));
                            Data data0 = Data.b(cursor0.getBlob(2));
                            int v2 = cursor0.getInt(3);
                            int v3 = cursor0.getInt(4);
                            long v4 = cursor0.getLong(14);
                            long v5 = cursor0.getLong(15);
                            long v6 = cursor0.getLong(16);
                            BackoffPolicy backoffPolicy0 = WorkTypeConverters.d(cursor0.getInt(17));
                            long v7 = cursor0.getLong(18);
                            long v8 = cursor0.getLong(19);
                            int v9 = cursor0.getInt(20);
                            long v10 = cursor0.getLong(21);
                            int v11 = cursor0.getInt(22);
                            NetworkType networkType0 = WorkTypeConverters.e(cursor0.getInt(5));
                            list0.add(new WorkInfoPojo(s2, workInfo$State0, data0, v4, v5, v6, new Constraints(WorkTypeConverters.l(cursor0.getBlob(6)), networkType0, cursor0.getInt(7) != 0, cursor0.getInt(8) != 0, cursor0.getInt(9) != 0, cursor0.getInt(10) != 0, cursor0.getLong(11), cursor0.getLong(12), WorkTypeConverters.b(cursor0.getBlob(13))), v2, backoffPolicy0, v7, v8, v9, v3, v10, v11, ((ArrayList)hashMap0.get(cursor0.getString(0))), ((ArrayList)hashMap1.get(cursor0.getString(0)))));
                        }
                        WorkSpecDao_Impl.this.a.Q();
                        return list0;
                    }
                    finally {
                        cursor0.close();
                    }
                }
                finally {
                    WorkSpecDao_Impl.this.a.k();
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
        return this.a.p().f(new String[]{"WorkTag", "WorkProgress", "workspec"}, true, workSpecDao_Impl$190);
    }

    @Override  // androidx.work.impl.model.WorkSpecDao
    public int z() {
        int v = 0;
        RoomSQLiteQuery roomSQLiteQuery0 = RoomSQLiteQuery.e("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)", 0);
        this.a.d();
        Cursor cursor0 = DBUtil.f(this.a, roomSQLiteQuery0, false, null);
        try {
            if(cursor0.moveToFirst()) {
                v = cursor0.getInt(0);
            }
            return v;
        }
        finally {
            cursor0.close();
            roomSQLiteQuery0.release();
        }
    }
}

