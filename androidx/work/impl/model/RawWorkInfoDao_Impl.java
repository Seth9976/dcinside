package androidx.work.impl.model;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.RelationUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.WorkInfo.State;
import androidx.work.impl.utils.NetworkRequestCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.S0;
import kotlinx.coroutines.flow.i;

public final class RawWorkInfoDao_Impl implements RawWorkInfoDao {
    private final RoomDatabase a;

    public RawWorkInfoDao_Impl(@NonNull RoomDatabase roomDatabase0) {
        this.a = roomDatabase0;
    }

    @Override  // androidx.work.impl.model.RawWorkInfoDao
    public List a(SupportSQLiteQuery supportSQLiteQuery0) {
        Set set0;
        long v48;
        boolean z7;
        int v47;
        int v46;
        boolean z6;
        boolean z5;
        int v45;
        boolean z4;
        boolean z3;
        int v44;
        boolean z2;
        boolean z1;
        NetworkRequestCompat networkRequestCompat0;
        int v43;
        NetworkType networkType0;
        int v42;
        int v41;
        int v40;
        long v39;
        int v38;
        int v37;
        int v36;
        int v35;
        long v34;
        int v33;
        long v32;
        BackoffPolicy backoffPolicy0;
        int v31;
        long v30;
        long v29;
        long v28;
        Data data0;
        State workInfo$State0;
        String s2;
        int v24;
        try {
            this.a.d();
            try(Cursor cursor0 = DBUtil.f(this.a, supportSQLiteQuery0, true, null)) {
                int v = CursorUtil.d(cursor0, "id");
                int v1 = CursorUtil.d(cursor0, "state");
                int v2 = CursorUtil.d(cursor0, "output");
                int v3 = CursorUtil.d(cursor0, "initial_delay");
                int v4 = CursorUtil.d(cursor0, "interval_duration");
                int v5 = CursorUtil.d(cursor0, "flex_duration");
                int v6 = CursorUtil.d(cursor0, "run_attempt_count");
                int v7 = CursorUtil.d(cursor0, "backoff_policy");
                int v8 = CursorUtil.d(cursor0, "backoff_delay_duration");
                int v9 = CursorUtil.d(cursor0, "last_enqueue_time");
                int v10 = CursorUtil.d(cursor0, "period_count");
                int v11 = CursorUtil.d(cursor0, "generation");
                int v12 = CursorUtil.d(cursor0, "next_schedule_time_override");
                int v13 = CursorUtil.d(cursor0, "stop_reason");
                int v14 = CursorUtil.d(cursor0, "required_network_type");
                int v15 = CursorUtil.d(cursor0, "required_network_request");
                int v16 = CursorUtil.d(cursor0, "requires_charging");
                int v17 = CursorUtil.d(cursor0, "requires_device_idle");
                int v18 = CursorUtil.d(cursor0, "requires_battery_not_low");
                int v19 = CursorUtil.d(cursor0, "requires_storage_not_low");
                int v20 = CursorUtil.d(cursor0, "trigger_content_update_delay");
                int v21 = CursorUtil.d(cursor0, "trigger_max_content_delay");
                int v22 = CursorUtil.d(cursor0, "content_uri_triggers");
                HashMap hashMap0 = new HashMap();
                int v23 = v12;
                HashMap hashMap1 = new HashMap();
                while(true) {
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                    String s = cursor0.getString(v);
                    if(hashMap0.containsKey(s)) {
                        v24 = v10;
                    }
                    else {
                        v24 = v10;
                        hashMap0.put(s, new ArrayList());
                    }
                    String s1 = cursor0.getString(v);
                    if(!hashMap1.containsKey(s1)) {
                        hashMap1.put(s1, new ArrayList());
                    }
                    v10 = v24;
                }
                int v25 = v10;
                int v26 = v11;
                cursor0.moveToPosition(-1);
                this.g(hashMap0);
                this.f(hashMap1);
                List list0 = new ArrayList(cursor0.getCount());
                while(true) {
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                    if(v == -1) {
                        s2 = null;
                    }
                    else {
                        s2 = cursor0.getString(v);
                    }
                    if(v1 == -1) {
                        workInfo$State0 = null;
                    }
                    else {
                        workInfo$State0 = WorkTypeConverters.g(cursor0.getInt(v1));
                    }
                    if(v2 == -1) {
                        data0 = null;
                    }
                    else {
                        data0 = Data.b(cursor0.getBlob(v2));
                    }
                    long v27 = 0L;
                    if(v3 == -1) {
                        v28 = 0L;
                    }
                    else {
                        v28 = cursor0.getLong(v3);
                    }
                    if(v4 == -1) {
                        v29 = 0L;
                    }
                    else {
                        v29 = cursor0.getLong(v4);
                    }
                    if(v5 == -1) {
                        v30 = 0L;
                    }
                    else {
                        v30 = cursor0.getLong(v5);
                    }
                    boolean z = false;
                    if(v6 == -1) {
                        v31 = 0;
                    }
                    else {
                        v31 = cursor0.getInt(v6);
                    }
                    if(v7 == -1) {
                        backoffPolicy0 = null;
                    }
                    else {
                        backoffPolicy0 = WorkTypeConverters.d(cursor0.getInt(v7));
                    }
                    if(v8 == -1) {
                        v32 = 0L;
                    }
                    else {
                        v32 = cursor0.getLong(v8);
                    }
                    if(v9 == -1) {
                        v33 = v25;
                        v34 = 0L;
                    }
                    else {
                        v34 = cursor0.getLong(v9);
                        v33 = v25;
                    }
                    if(v33 == -1) {
                        v25 = -1;
                        v35 = v26;
                        v36 = 0;
                    }
                    else {
                        v36 = cursor0.getInt(v33);
                        v25 = v33;
                        v35 = v26;
                    }
                    if(v35 == -1) {
                        v26 = -1;
                        v37 = v23;
                        v38 = 0;
                    }
                    else {
                        v38 = cursor0.getInt(v35);
                        v26 = v35;
                        v37 = v23;
                    }
                    if(v37 == -1) {
                        v23 = -1;
                        v39 = 0L;
                    }
                    else {
                        v39 = cursor0.getLong(v37);
                        v23 = v37;
                    }
                    if(v13 == -1) {
                        v40 = v14;
                        v41 = 0;
                    }
                    else {
                        v41 = cursor0.getInt(v13);
                        v40 = v14;
                    }
                    if(v40 == -1) {
                        v14 = -1;
                        v42 = v15;
                        networkType0 = null;
                    }
                    else {
                        networkType0 = WorkTypeConverters.e(cursor0.getInt(v40));
                        v14 = v40;
                        v42 = v15;
                    }
                    if(v42 == -1) {
                        v15 = -1;
                        v43 = v16;
                        networkRequestCompat0 = null;
                    }
                    else {
                        networkRequestCompat0 = WorkTypeConverters.l(cursor0.getBlob(v42));
                        v15 = v42;
                        v43 = v16;
                    }
                    if(v43 == -1) {
                        v16 = -1;
                        v44 = v17;
                        z2 = false;
                    }
                    else {
                        if(cursor0.getInt(v43) == 0) {
                            z1 = false;
                        }
                        else {
                            z1 = true;
                        }
                        z2 = z1;
                        v16 = v43;
                        v44 = v17;
                    }
                    if(v44 == -1) {
                        v17 = -1;
                        v45 = v18;
                        z4 = false;
                    }
                    else {
                        if(cursor0.getInt(v44) == 0) {
                            z3 = false;
                        }
                        else {
                            z3 = true;
                        }
                        z4 = z3;
                        v17 = v44;
                        v45 = v18;
                    }
                    if(v45 == -1) {
                        v18 = -1;
                        v46 = v19;
                        z6 = false;
                    }
                    else {
                        if(cursor0.getInt(v45) == 0) {
                            z5 = false;
                        }
                        else {
                            z5 = true;
                        }
                        z6 = z5;
                        v18 = v45;
                        v46 = v19;
                    }
                    if(v46 == -1) {
                        v19 = -1;
                        v47 = v20;
                        z7 = false;
                    }
                    else {
                        if(cursor0.getInt(v46) != 0) {
                            z = true;
                        }
                        v19 = v46;
                        v47 = v20;
                        z7 = z;
                    }
                    if(v47 == -1) {
                        v20 = -1;
                        v48 = 0L;
                    }
                    else {
                        v48 = cursor0.getLong(v47);
                        v20 = v47;
                    }
                    if(v21 != -1) {
                        v27 = cursor0.getLong(v21);
                    }
                    if(v22 == -1) {
                        set0 = null;
                    }
                    else {
                        set0 = WorkTypeConverters.b(cursor0.getBlob(v22));
                    }
                    list0.add(new WorkInfoPojo(s2, workInfo$State0, data0, v28, v29, v30, new Constraints(networkRequestCompat0, networkType0, z2, z4, z6, z7, v48, v27, set0), v31, backoffPolicy0, v32, v34, v36, v38, v39, v41, ((ArrayList)hashMap0.get(cursor0.getString(v))), ((ArrayList)hashMap1.get(cursor0.getString(v)))));
                }
            }
            return list0;
        }
        catch(Throwable throwable0) {
            throw throwable0;
        }
    }

    @Override  // androidx.work.impl.model.RawWorkInfoDao
    public LiveData b(SupportSQLiteQuery supportSQLiteQuery0) {
        androidx.work.impl.model.RawWorkInfoDao_Impl.1 rawWorkInfoDao_Impl$10 = new Callable() {
            final RawWorkInfoDao_Impl b;

            @Nullable
            public List a() throws Exception {
                Set set0;
                long v49;
                boolean z7;
                int v48;
                int v47;
                boolean z6;
                boolean z5;
                int v46;
                boolean z4;
                boolean z3;
                int v45;
                boolean z2;
                boolean z1;
                NetworkRequestCompat networkRequestCompat0;
                int v44;
                NetworkType networkType0;
                int v43;
                int v42;
                int v41;
                long v40;
                int v39;
                int v38;
                int v37;
                int v36;
                int v35;
                long v34;
                int v33;
                long v32;
                BackoffPolicy backoffPolicy0;
                int v31;
                long v30;
                long v29;
                long v28;
                Data data0;
                State workInfo$State0;
                String s2;
                int v24;
                try(Cursor cursor0 = DBUtil.f(RawWorkInfoDao_Impl.this.a, supportSQLiteQuery0, true, null)) {
                    int v = CursorUtil.d(cursor0, "id");
                    int v1 = CursorUtil.d(cursor0, "state");
                    int v2 = CursorUtil.d(cursor0, "output");
                    int v3 = CursorUtil.d(cursor0, "initial_delay");
                    int v4 = CursorUtil.d(cursor0, "interval_duration");
                    int v5 = CursorUtil.d(cursor0, "flex_duration");
                    int v6 = CursorUtil.d(cursor0, "run_attempt_count");
                    int v7 = CursorUtil.d(cursor0, "backoff_policy");
                    int v8 = CursorUtil.d(cursor0, "backoff_delay_duration");
                    int v9 = CursorUtil.d(cursor0, "last_enqueue_time");
                    int v10 = CursorUtil.d(cursor0, "period_count");
                    int v11 = CursorUtil.d(cursor0, "generation");
                    int v12 = CursorUtil.d(cursor0, "next_schedule_time_override");
                    int v13 = CursorUtil.d(cursor0, "stop_reason");
                    int v14 = CursorUtil.d(cursor0, "required_network_type");
                    int v15 = CursorUtil.d(cursor0, "required_network_request");
                    int v16 = CursorUtil.d(cursor0, "requires_charging");
                    int v17 = CursorUtil.d(cursor0, "requires_device_idle");
                    int v18 = CursorUtil.d(cursor0, "requires_battery_not_low");
                    int v19 = CursorUtil.d(cursor0, "requires_storage_not_low");
                    int v20 = CursorUtil.d(cursor0, "trigger_content_update_delay");
                    int v21 = CursorUtil.d(cursor0, "trigger_max_content_delay");
                    int v22 = CursorUtil.d(cursor0, "content_uri_triggers");
                    HashMap hashMap0 = new HashMap();
                    int v23 = v12;
                    HashMap hashMap1 = new HashMap();
                    while(true) {
                        if(!cursor0.moveToNext()) {
                            break;
                        }
                        String s = cursor0.getString(v);
                        if(hashMap0.containsKey(s)) {
                            v24 = v10;
                        }
                        else {
                            v24 = v10;
                            hashMap0.put(s, new ArrayList());
                        }
                        String s1 = cursor0.getString(v);
                        if(!hashMap1.containsKey(s1)) {
                            hashMap1.put(s1, new ArrayList());
                        }
                        v10 = v24;
                    }
                    int v25 = v10;
                    int v26 = v11;
                    cursor0.moveToPosition(-1);
                    RawWorkInfoDao_Impl.this.g(hashMap0);
                    RawWorkInfoDao_Impl.this.f(hashMap1);
                    List list0 = new ArrayList(cursor0.getCount());
                    while(true) {
                        if(!cursor0.moveToNext()) {
                            break;
                        }
                        s2 = v == -1 ? null : cursor0.getString(v);
                        workInfo$State0 = v1 == -1 ? null : WorkTypeConverters.g(cursor0.getInt(v1));
                        data0 = v2 == -1 ? null : Data.b(cursor0.getBlob(v2));
                        long v27 = 0L;
                        v28 = v3 == -1 ? 0L : cursor0.getLong(v3);
                        v29 = v4 == -1 ? 0L : cursor0.getLong(v4);
                        v30 = v5 == -1 ? 0L : cursor0.getLong(v5);
                        boolean z = false;
                        v31 = v6 == -1 ? 0 : cursor0.getInt(v6);
                        backoffPolicy0 = v7 == -1 ? null : WorkTypeConverters.d(cursor0.getInt(v7));
                        v32 = v8 == -1 ? 0L : cursor0.getLong(v8);
                        if(v9 == -1) {
                            v33 = v25;
                            v34 = 0L;
                        }
                        else {
                            v34 = cursor0.getLong(v9);
                            v33 = v25;
                        }
                        if(v33 == -1) {
                            v25 = -1;
                            v35 = v26;
                            v36 = 0;
                        }
                        else {
                            v36 = cursor0.getInt(v33);
                            v25 = v33;
                            v35 = v26;
                        }
                        if(v35 == -1) {
                            v26 = -1;
                            v37 = v23;
                            v38 = 0;
                        }
                        else {
                            v38 = cursor0.getInt(v35);
                            v26 = v35;
                            v37 = v23;
                        }
                        if(v37 == -1) {
                            v23 = -1;
                            v39 = v13;
                            v40 = 0L;
                        }
                        else {
                            v40 = cursor0.getLong(v37);
                            v23 = v37;
                            v39 = v13;
                        }
                        if(v39 == -1) {
                            v13 = -1;
                            v41 = v14;
                            v42 = 0;
                        }
                        else {
                            v42 = cursor0.getInt(v39);
                            v13 = v39;
                            v41 = v14;
                        }
                        if(v41 == -1) {
                            v14 = -1;
                            v43 = v15;
                            networkType0 = null;
                        }
                        else {
                            networkType0 = WorkTypeConverters.e(cursor0.getInt(v41));
                            v14 = v41;
                            v43 = v15;
                        }
                        if(v43 == -1) {
                            v15 = -1;
                            v44 = v16;
                            networkRequestCompat0 = null;
                        }
                        else {
                            networkRequestCompat0 = WorkTypeConverters.l(cursor0.getBlob(v43));
                            v15 = v43;
                            v44 = v16;
                        }
                        if(v44 == -1) {
                            v16 = -1;
                            v45 = v17;
                            z2 = false;
                        }
                        else {
                            z1 = cursor0.getInt(v44) == 0 ? false : true;
                            z2 = z1;
                            v16 = v44;
                            v45 = v17;
                        }
                        if(v45 == -1) {
                            v17 = -1;
                            v46 = v18;
                            z4 = false;
                        }
                        else {
                            z3 = cursor0.getInt(v45) == 0 ? false : true;
                            z4 = z3;
                            v17 = v45;
                            v46 = v18;
                        }
                        if(v46 == -1) {
                            v18 = -1;
                            v47 = v19;
                            z6 = false;
                        }
                        else {
                            z5 = cursor0.getInt(v46) == 0 ? false : true;
                            z6 = z5;
                            v18 = v46;
                            v47 = v19;
                        }
                        if(v47 == -1) {
                            v19 = -1;
                            v48 = v20;
                            z7 = false;
                        }
                        else {
                            if(cursor0.getInt(v47) != 0) {
                                z = true;
                            }
                            v19 = v47;
                            v48 = v20;
                            z7 = z;
                        }
                        if(v48 == -1) {
                            v20 = -1;
                            v49 = 0L;
                        }
                        else {
                            v49 = cursor0.getLong(v48);
                            v20 = v48;
                        }
                        if(v21 != -1) {
                            v27 = cursor0.getLong(v21);
                        }
                        set0 = v22 == -1 ? null : WorkTypeConverters.b(cursor0.getBlob(v22));
                        list0.add(new WorkInfoPojo(s2, workInfo$State0, data0, v28, v29, v30, new Constraints(networkRequestCompat0, networkType0, z2, z4, z6, z7, v49, v27, set0), v31, backoffPolicy0, v32, v34, v36, v38, v40, v42, ((ArrayList)hashMap0.get(cursor0.getString(v))), ((ArrayList)hashMap1.get(cursor0.getString(v)))));
                    }
                }
                return list0;
            }

            @Override
            @Nullable
            public Object call() throws Exception {
                return this.a();
            }
        };
        return this.a.p().f(new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, false, rawWorkInfoDao_Impl$10);
    }

    @Override  // androidx.work.impl.model.RawWorkInfoDao
    public i c(SupportSQLiteQuery supportSQLiteQuery0) {
        androidx.work.impl.model.RawWorkInfoDao_Impl.2 rawWorkInfoDao_Impl$20 = new Callable() {
            final RawWorkInfoDao_Impl b;

            @NonNull
            public List a() throws Exception {
                Set set0;
                long v49;
                boolean z7;
                int v48;
                int v47;
                boolean z6;
                boolean z5;
                int v46;
                boolean z4;
                boolean z3;
                int v45;
                boolean z2;
                boolean z1;
                NetworkRequestCompat networkRequestCompat0;
                int v44;
                NetworkType networkType0;
                int v43;
                int v42;
                int v41;
                long v40;
                int v39;
                int v38;
                int v37;
                int v36;
                int v35;
                long v34;
                int v33;
                long v32;
                BackoffPolicy backoffPolicy0;
                int v31;
                long v30;
                long v29;
                long v28;
                Data data0;
                State workInfo$State0;
                String s2;
                int v24;
                try(Cursor cursor0 = DBUtil.f(RawWorkInfoDao_Impl.this.a, supportSQLiteQuery0, true, null)) {
                    int v = CursorUtil.d(cursor0, "id");
                    int v1 = CursorUtil.d(cursor0, "state");
                    int v2 = CursorUtil.d(cursor0, "output");
                    int v3 = CursorUtil.d(cursor0, "initial_delay");
                    int v4 = CursorUtil.d(cursor0, "interval_duration");
                    int v5 = CursorUtil.d(cursor0, "flex_duration");
                    int v6 = CursorUtil.d(cursor0, "run_attempt_count");
                    int v7 = CursorUtil.d(cursor0, "backoff_policy");
                    int v8 = CursorUtil.d(cursor0, "backoff_delay_duration");
                    int v9 = CursorUtil.d(cursor0, "last_enqueue_time");
                    int v10 = CursorUtil.d(cursor0, "period_count");
                    int v11 = CursorUtil.d(cursor0, "generation");
                    int v12 = CursorUtil.d(cursor0, "next_schedule_time_override");
                    int v13 = CursorUtil.d(cursor0, "stop_reason");
                    int v14 = CursorUtil.d(cursor0, "required_network_type");
                    int v15 = CursorUtil.d(cursor0, "required_network_request");
                    int v16 = CursorUtil.d(cursor0, "requires_charging");
                    int v17 = CursorUtil.d(cursor0, "requires_device_idle");
                    int v18 = CursorUtil.d(cursor0, "requires_battery_not_low");
                    int v19 = CursorUtil.d(cursor0, "requires_storage_not_low");
                    int v20 = CursorUtil.d(cursor0, "trigger_content_update_delay");
                    int v21 = CursorUtil.d(cursor0, "trigger_max_content_delay");
                    int v22 = CursorUtil.d(cursor0, "content_uri_triggers");
                    HashMap hashMap0 = new HashMap();
                    int v23 = v12;
                    HashMap hashMap1 = new HashMap();
                    while(true) {
                        if(!cursor0.moveToNext()) {
                            break;
                        }
                        String s = cursor0.getString(v);
                        if(hashMap0.containsKey(s)) {
                            v24 = v10;
                        }
                        else {
                            v24 = v10;
                            hashMap0.put(s, new ArrayList());
                        }
                        String s1 = cursor0.getString(v);
                        if(!hashMap1.containsKey(s1)) {
                            hashMap1.put(s1, new ArrayList());
                        }
                        v10 = v24;
                    }
                    int v25 = v10;
                    int v26 = v11;
                    cursor0.moveToPosition(-1);
                    RawWorkInfoDao_Impl.this.g(hashMap0);
                    RawWorkInfoDao_Impl.this.f(hashMap1);
                    List list0 = new ArrayList(cursor0.getCount());
                    while(true) {
                        if(!cursor0.moveToNext()) {
                            break;
                        }
                        s2 = v == -1 ? null : cursor0.getString(v);
                        workInfo$State0 = v1 == -1 ? null : WorkTypeConverters.g(cursor0.getInt(v1));
                        data0 = v2 == -1 ? null : Data.b(cursor0.getBlob(v2));
                        long v27 = 0L;
                        v28 = v3 == -1 ? 0L : cursor0.getLong(v3);
                        v29 = v4 == -1 ? 0L : cursor0.getLong(v4);
                        v30 = v5 == -1 ? 0L : cursor0.getLong(v5);
                        boolean z = false;
                        v31 = v6 == -1 ? 0 : cursor0.getInt(v6);
                        backoffPolicy0 = v7 == -1 ? null : WorkTypeConverters.d(cursor0.getInt(v7));
                        v32 = v8 == -1 ? 0L : cursor0.getLong(v8);
                        if(v9 == -1) {
                            v33 = v25;
                            v34 = 0L;
                        }
                        else {
                            v34 = cursor0.getLong(v9);
                            v33 = v25;
                        }
                        if(v33 == -1) {
                            v25 = -1;
                            v35 = v26;
                            v36 = 0;
                        }
                        else {
                            v36 = cursor0.getInt(v33);
                            v25 = v33;
                            v35 = v26;
                        }
                        if(v35 == -1) {
                            v26 = -1;
                            v37 = v23;
                            v38 = 0;
                        }
                        else {
                            v38 = cursor0.getInt(v35);
                            v26 = v35;
                            v37 = v23;
                        }
                        if(v37 == -1) {
                            v23 = -1;
                            v39 = v13;
                            v40 = 0L;
                        }
                        else {
                            v40 = cursor0.getLong(v37);
                            v23 = v37;
                            v39 = v13;
                        }
                        if(v39 == -1) {
                            v13 = -1;
                            v41 = v14;
                            v42 = 0;
                        }
                        else {
                            v42 = cursor0.getInt(v39);
                            v13 = v39;
                            v41 = v14;
                        }
                        if(v41 == -1) {
                            v14 = -1;
                            v43 = v15;
                            networkType0 = null;
                        }
                        else {
                            networkType0 = WorkTypeConverters.e(cursor0.getInt(v41));
                            v14 = v41;
                            v43 = v15;
                        }
                        if(v43 == -1) {
                            v15 = -1;
                            v44 = v16;
                            networkRequestCompat0 = null;
                        }
                        else {
                            networkRequestCompat0 = WorkTypeConverters.l(cursor0.getBlob(v43));
                            v15 = v43;
                            v44 = v16;
                        }
                        if(v44 == -1) {
                            v16 = -1;
                            v45 = v17;
                            z2 = false;
                        }
                        else {
                            z1 = cursor0.getInt(v44) == 0 ? false : true;
                            z2 = z1;
                            v16 = v44;
                            v45 = v17;
                        }
                        if(v45 == -1) {
                            v17 = -1;
                            v46 = v18;
                            z4 = false;
                        }
                        else {
                            z3 = cursor0.getInt(v45) == 0 ? false : true;
                            z4 = z3;
                            v17 = v45;
                            v46 = v18;
                        }
                        if(v46 == -1) {
                            v18 = -1;
                            v47 = v19;
                            z6 = false;
                        }
                        else {
                            z5 = cursor0.getInt(v46) == 0 ? false : true;
                            z6 = z5;
                            v18 = v46;
                            v47 = v19;
                        }
                        if(v47 == -1) {
                            v19 = -1;
                            v48 = v20;
                            z7 = false;
                        }
                        else {
                            if(cursor0.getInt(v47) != 0) {
                                z = true;
                            }
                            v19 = v47;
                            v48 = v20;
                            z7 = z;
                        }
                        if(v48 == -1) {
                            v20 = -1;
                            v49 = 0L;
                        }
                        else {
                            v49 = cursor0.getLong(v48);
                            v20 = v48;
                        }
                        if(v21 != -1) {
                            v27 = cursor0.getLong(v21);
                        }
                        set0 = v22 == -1 ? null : WorkTypeConverters.b(cursor0.getBlob(v22));
                        list0.add(new WorkInfoPojo(s2, workInfo$State0, data0, v28, v29, v30, new Constraints(networkRequestCompat0, networkType0, z2, z4, z6, z7, v49, v27, set0), v31, backoffPolicy0, v32, v34, v36, v38, v40, v42, ((ArrayList)hashMap0.get(cursor0.getString(v))), ((ArrayList)hashMap1.get(cursor0.getString(v)))));
                    }
                }
                return list0;
            }

            @Override
            @NonNull
            public Object call() throws Exception {
                return this.a();
            }
        };
        return CoroutinesRoom.a(this.a, false, new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, rawWorkInfoDao_Impl$20);
    }

    private void f(@NonNull HashMap hashMap0) {
        Set set0 = hashMap0.keySet();
        if(set0.isEmpty()) {
            return;
        }
        if(hashMap0.size() > 999) {
            RelationUtil.b(hashMap0, true, (HashMap hashMap0) -> {
                this.f(hashMap0);
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

    private void g(@NonNull HashMap hashMap0) {
        Set set0 = hashMap0.keySet();
        if(set0.isEmpty()) {
            return;
        }
        if(hashMap0.size() > 999) {
            RelationUtil.b(hashMap0, true, (HashMap hashMap0) -> {
                this.g(hashMap0);
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

    @NonNull
    public static List k() {
        return Collections.emptyList();
    }

    // 检测为 Lambda 实现
    private S0 l(HashMap hashMap0) [...]

    // 检测为 Lambda 实现
    private S0 m(HashMap hashMap0) [...]
}

