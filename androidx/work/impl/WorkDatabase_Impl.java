package androidx.work.impl;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase.Callback;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.DependencyDao_Impl;
import androidx.work.impl.model.PreferenceDao;
import androidx.work.impl.model.PreferenceDao_Impl;
import androidx.work.impl.model.RawWorkInfoDao;
import androidx.work.impl.model.RawWorkInfoDao_Impl;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.SystemIdInfoDao_Impl;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkNameDao_Impl;
import androidx.work.impl.model.WorkProgressDao;
import androidx.work.impl.model.WorkProgressDao_Impl;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkSpecDao_Impl;
import androidx.work.impl.model.WorkTagDao;
import androidx.work.impl.model.WorkTagDao_Impl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class WorkDatabase_Impl extends WorkDatabase {
    private volatile WorkSpecDao r;
    private volatile DependencyDao s;
    private volatile WorkTagDao t;
    private volatile SystemIdInfoDao u;
    private volatile WorkNameDao v;
    private volatile WorkProgressDao w;
    private volatile PreferenceDao x;
    private volatile RawWorkInfoDao y;

    @Override  // androidx.work.impl.WorkDatabase
    public DependencyDao T() {
        if(this.s != null) {
            return this.s;
        }
        synchronized(this) {
            if(this.s == null) {
                this.s = new DependencyDao_Impl(this);
            }
            return this.s;
        }
    }

    @Override  // androidx.work.impl.WorkDatabase
    public PreferenceDao U() {
        if(this.x != null) {
            return this.x;
        }
        synchronized(this) {
            if(this.x == null) {
                this.x = new PreferenceDao_Impl(this);
            }
            return this.x;
        }
    }

    @Override  // androidx.work.impl.WorkDatabase
    public RawWorkInfoDao V() {
        if(this.y != null) {
            return this.y;
        }
        synchronized(this) {
            if(this.y == null) {
                this.y = new RawWorkInfoDao_Impl(this);
            }
            return this.y;
        }
    }

    @Override  // androidx.work.impl.WorkDatabase
    public SystemIdInfoDao W() {
        if(this.u != null) {
            return this.u;
        }
        synchronized(this) {
            if(this.u == null) {
                this.u = new SystemIdInfoDao_Impl(this);
            }
            return this.u;
        }
    }

    @Override  // androidx.work.impl.WorkDatabase
    public WorkNameDao X() {
        if(this.v != null) {
            return this.v;
        }
        synchronized(this) {
            if(this.v == null) {
                this.v = new WorkNameDao_Impl(this);
            }
            return this.v;
        }
    }

    @Override  // androidx.work.impl.WorkDatabase
    public WorkProgressDao Y() {
        if(this.w != null) {
            return this.w;
        }
        synchronized(this) {
            if(this.w == null) {
                this.w = new WorkProgressDao_Impl(this);
            }
            return this.w;
        }
    }

    @Override  // androidx.work.impl.WorkDatabase
    public WorkSpecDao Z() {
        if(this.r != null) {
            return this.r;
        }
        synchronized(this) {
            if(this.r == null) {
                this.r = new WorkSpecDao_Impl(this);
            }
            return this.r;
        }
    }

    @Override  // androidx.work.impl.WorkDatabase
    public WorkTagDao a0() {
        if(this.t != null) {
            return this.t;
        }
        synchronized(this) {
            if(this.t == null) {
                this.t = new WorkTagDao_Impl(this);
            }
            return this.t;
        }
    }

    @Override  // androidx.room.RoomDatabase
    public void f() {
        super.c();
        SupportSQLiteDatabase supportSQLiteDatabase0 = super.s().getWritableDatabase();
        try {
            super.e();
            supportSQLiteDatabase0.W1("PRAGMA defer_foreign_keys = TRUE");
            supportSQLiteDatabase0.W1("DELETE FROM `Dependency`");
            supportSQLiteDatabase0.W1("DELETE FROM `WorkSpec`");
            supportSQLiteDatabase0.W1("DELETE FROM `WorkTag`");
            supportSQLiteDatabase0.W1("DELETE FROM `SystemIdInfo`");
            supportSQLiteDatabase0.W1("DELETE FROM `WorkName`");
            supportSQLiteDatabase0.W1("DELETE FROM `WorkProgress`");
            supportSQLiteDatabase0.W1("DELETE FROM `Preference`");
            super.Q();
        }
        finally {
            super.k();
            supportSQLiteDatabase0.x3("PRAGMA wal_checkpoint(FULL)").close();
            if(!supportSQLiteDatabase0.J3()) {
                supportSQLiteDatabase0.W1("VACUUM");
            }
        }
    }

    @Override  // androidx.room.RoomDatabase
    @NonNull
    protected InvalidationTracker i() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), new String[]{"Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference"});
    }

    @Override  // androidx.room.RoomDatabase
    @NonNull
    protected SupportSQLiteOpenHelper j(@NonNull DatabaseConfiguration databaseConfiguration0) {
        RoomOpenHelper roomOpenHelper0 = new RoomOpenHelper(databaseConfiguration0, new Delegate(23) {
            final WorkDatabase_Impl b;

            @Override  // androidx.room.RoomOpenHelper$Delegate
            public void a(@NonNull SupportSQLiteDatabase supportSQLiteDatabase0) {
                supportSQLiteDatabase0.W1("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                supportSQLiteDatabase0.W1("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
                supportSQLiteDatabase0.W1("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
                supportSQLiteDatabase0.W1("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x\'\', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                supportSQLiteDatabase0.W1("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                supportSQLiteDatabase0.W1("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                supportSQLiteDatabase0.W1("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                supportSQLiteDatabase0.W1("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                supportSQLiteDatabase0.W1("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                supportSQLiteDatabase0.W1("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                supportSQLiteDatabase0.W1("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
                supportSQLiteDatabase0.W1("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                supportSQLiteDatabase0.W1("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                supportSQLiteDatabase0.W1("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                supportSQLiteDatabase0.W1("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'86254750241babac4b8d52996a675549\')");
            }

            @Override  // androidx.room.RoomOpenHelper$Delegate
            public void b(@NonNull SupportSQLiteDatabase supportSQLiteDatabase0) {
                supportSQLiteDatabase0.W1("DROP TABLE IF EXISTS `Dependency`");
                supportSQLiteDatabase0.W1("DROP TABLE IF EXISTS `WorkSpec`");
                supportSQLiteDatabase0.W1("DROP TABLE IF EXISTS `WorkTag`");
                supportSQLiteDatabase0.W1("DROP TABLE IF EXISTS `SystemIdInfo`");
                supportSQLiteDatabase0.W1("DROP TABLE IF EXISTS `WorkName`");
                supportSQLiteDatabase0.W1("DROP TABLE IF EXISTS `WorkProgress`");
                supportSQLiteDatabase0.W1("DROP TABLE IF EXISTS `Preference`");
                List list0 = WorkDatabase_Impl.this.h;
                if(list0 != null) {
                    for(Object object0: list0) {
                        ((Callback)object0).b(supportSQLiteDatabase0);
                    }
                }
            }

            @Override  // androidx.room.RoomOpenHelper$Delegate
            public void c(@NonNull SupportSQLiteDatabase supportSQLiteDatabase0) {
                List list0 = WorkDatabase_Impl.this.h;
                if(list0 != null) {
                    for(Object object0: list0) {
                        ((Callback)object0).a(supportSQLiteDatabase0);
                    }
                }
            }

            @Override  // androidx.room.RoomOpenHelper$Delegate
            public void d(@NonNull SupportSQLiteDatabase supportSQLiteDatabase0) {
                WorkDatabase_Impl.this.a = supportSQLiteDatabase0;
                supportSQLiteDatabase0.W1("PRAGMA foreign_keys = ON");
                WorkDatabase_Impl.this.D(supportSQLiteDatabase0);
                List list0 = WorkDatabase_Impl.this.h;
                if(list0 != null) {
                    for(Object object0: list0) {
                        ((Callback)object0).c(supportSQLiteDatabase0);
                    }
                }
            }

            @Override  // androidx.room.RoomOpenHelper$Delegate
            public void e(@NonNull SupportSQLiteDatabase supportSQLiteDatabase0) {
            }

            @Override  // androidx.room.RoomOpenHelper$Delegate
            public void f(@NonNull SupportSQLiteDatabase supportSQLiteDatabase0) {
                DBUtil.b(supportSQLiteDatabase0);
            }

            @Override  // androidx.room.RoomOpenHelper$Delegate
            @NonNull
            public ValidationResult g(@NonNull SupportSQLiteDatabase supportSQLiteDatabase0) {
                HashMap hashMap0 = new HashMap(2);
                hashMap0.put("work_spec_id", new Column("work_spec_id", "TEXT", true, 1, null, 1));
                hashMap0.put("prerequisite_id", new Column("prerequisite_id", "TEXT", true, 2, null, 1));
                HashSet hashSet0 = new HashSet(2);
                hashSet0.add(new ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
                hashSet0.add(new ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{"id"})));
                HashSet hashSet1 = new HashSet(2);
                hashSet1.add(new Index("index_Dependency_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"})));
                hashSet1.add(new Index("index_Dependency_prerequisite_id", false, Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{"ASC"})));
                TableInfo tableInfo0 = new TableInfo("Dependency", hashMap0, hashSet0, hashSet1);
                TableInfo tableInfo1 = TableInfo.a(supportSQLiteDatabase0, "Dependency");
                if(!tableInfo0.equals(tableInfo1)) {
                    return new ValidationResult(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + tableInfo0 + "\n Found:\n" + tableInfo1);
                }
                HashMap hashMap1 = new HashMap(0x20);
                hashMap1.put("id", new Column("id", "TEXT", true, 1, null, 1));
                hashMap1.put("state", new Column("state", "INTEGER", true, 0, null, 1));
                hashMap1.put("worker_class_name", new Column("worker_class_name", "TEXT", true, 0, null, 1));
                hashMap1.put("input_merger_class_name", new Column("input_merger_class_name", "TEXT", true, 0, null, 1));
                hashMap1.put("input", new Column("input", "BLOB", true, 0, null, 1));
                hashMap1.put("output", new Column("output", "BLOB", true, 0, null, 1));
                hashMap1.put("initial_delay", new Column("initial_delay", "INTEGER", true, 0, null, 1));
                hashMap1.put("interval_duration", new Column("interval_duration", "INTEGER", true, 0, null, 1));
                hashMap1.put("flex_duration", new Column("flex_duration", "INTEGER", true, 0, null, 1));
                hashMap1.put("run_attempt_count", new Column("run_attempt_count", "INTEGER", true, 0, null, 1));
                hashMap1.put("backoff_policy", new Column("backoff_policy", "INTEGER", true, 0, null, 1));
                hashMap1.put("backoff_delay_duration", new Column("backoff_delay_duration", "INTEGER", true, 0, null, 1));
                hashMap1.put("last_enqueue_time", new Column("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
                hashMap1.put("minimum_retention_duration", new Column("minimum_retention_duration", "INTEGER", true, 0, null, 1));
                hashMap1.put("schedule_requested_at", new Column("schedule_requested_at", "INTEGER", true, 0, null, 1));
                hashMap1.put("run_in_foreground", new Column("run_in_foreground", "INTEGER", true, 0, null, 1));
                hashMap1.put("out_of_quota_policy", new Column("out_of_quota_policy", "INTEGER", true, 0, null, 1));
                hashMap1.put("period_count", new Column("period_count", "INTEGER", true, 0, "0", 1));
                hashMap1.put("generation", new Column("generation", "INTEGER", true, 0, "0", 1));
                hashMap1.put("next_schedule_time_override", new Column("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
                hashMap1.put("next_schedule_time_override_generation", new Column("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
                hashMap1.put("stop_reason", new Column("stop_reason", "INTEGER", true, 0, "-256", 1));
                hashMap1.put("trace_tag", new Column("trace_tag", "TEXT", false, 0, null, 1));
                hashMap1.put("required_network_type", new Column("required_network_type", "INTEGER", true, 0, null, 1));
                hashMap1.put("required_network_request", new Column("required_network_request", "BLOB", true, 0, "x\'\'", 1));
                hashMap1.put("requires_charging", new Column("requires_charging", "INTEGER", true, 0, null, 1));
                hashMap1.put("requires_device_idle", new Column("requires_device_idle", "INTEGER", true, 0, null, 1));
                hashMap1.put("requires_battery_not_low", new Column("requires_battery_not_low", "INTEGER", true, 0, null, 1));
                hashMap1.put("requires_storage_not_low", new Column("requires_storage_not_low", "INTEGER", true, 0, null, 1));
                hashMap1.put("trigger_content_update_delay", new Column("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
                hashMap1.put("trigger_max_content_delay", new Column("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
                hashMap1.put("content_uri_triggers", new Column("content_uri_triggers", "BLOB", true, 0, null, 1));
                HashSet hashSet2 = new HashSet(0);
                HashSet hashSet3 = new HashSet(2);
                hashSet3.add(new Index("index_WorkSpec_schedule_requested_at", false, Arrays.asList(new String[]{"schedule_requested_at"}), Arrays.asList(new String[]{"ASC"})));
                hashSet3.add(new Index("index_WorkSpec_last_enqueue_time", false, Arrays.asList(new String[]{"last_enqueue_time"}), Arrays.asList(new String[]{"ASC"})));
                TableInfo tableInfo2 = new TableInfo("WorkSpec", hashMap1, hashSet2, hashSet3);
                TableInfo tableInfo3 = TableInfo.a(supportSQLiteDatabase0, "WorkSpec");
                if(!tableInfo2.equals(tableInfo3)) {
                    return new ValidationResult(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + tableInfo2 + "\n Found:\n" + tableInfo3);
                }
                HashMap hashMap2 = new HashMap(2);
                hashMap2.put("tag", new Column("tag", "TEXT", true, 1, null, 1));
                hashMap2.put("work_spec_id", new Column("work_spec_id", "TEXT", true, 2, null, 1));
                HashSet hashSet4 = new HashSet(1);
                hashSet4.add(new ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
                HashSet hashSet5 = new HashSet(1);
                hashSet5.add(new Index("index_WorkTag_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"})));
                TableInfo tableInfo4 = new TableInfo("WorkTag", hashMap2, hashSet4, hashSet5);
                TableInfo tableInfo5 = TableInfo.a(supportSQLiteDatabase0, "WorkTag");
                if(!tableInfo4.equals(tableInfo5)) {
                    return new ValidationResult(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + tableInfo4 + "\n Found:\n" + tableInfo5);
                }
                HashMap hashMap3 = new HashMap(3);
                hashMap3.put("work_spec_id", new Column("work_spec_id", "TEXT", true, 1, null, 1));
                hashMap3.put("generation", new Column("generation", "INTEGER", true, 2, "0", 1));
                hashMap3.put("system_id", new Column("system_id", "INTEGER", true, 0, null, 1));
                HashSet hashSet6 = new HashSet(1);
                hashSet6.add(new ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
                TableInfo tableInfo6 = new TableInfo("SystemIdInfo", hashMap3, hashSet6, new HashSet(0));
                TableInfo tableInfo7 = TableInfo.a(supportSQLiteDatabase0, "SystemIdInfo");
                if(!tableInfo6.equals(tableInfo7)) {
                    return new ValidationResult(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + tableInfo6 + "\n Found:\n" + tableInfo7);
                }
                HashMap hashMap4 = new HashMap(2);
                hashMap4.put("name", new Column("name", "TEXT", true, 1, null, 1));
                hashMap4.put("work_spec_id", new Column("work_spec_id", "TEXT", true, 2, null, 1));
                HashSet hashSet7 = new HashSet(1);
                hashSet7.add(new ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
                HashSet hashSet8 = new HashSet(1);
                hashSet8.add(new Index("index_WorkName_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"})));
                TableInfo tableInfo8 = new TableInfo("WorkName", hashMap4, hashSet7, hashSet8);
                TableInfo tableInfo9 = TableInfo.a(supportSQLiteDatabase0, "WorkName");
                if(!tableInfo8.equals(tableInfo9)) {
                    return new ValidationResult(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + tableInfo8 + "\n Found:\n" + tableInfo9);
                }
                HashMap hashMap5 = new HashMap(2);
                hashMap5.put("work_spec_id", new Column("work_spec_id", "TEXT", true, 1, null, 1));
                hashMap5.put("progress", new Column("progress", "BLOB", true, 0, null, 1));
                HashSet hashSet9 = new HashSet(1);
                hashSet9.add(new ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
                TableInfo tableInfo10 = new TableInfo("WorkProgress", hashMap5, hashSet9, new HashSet(0));
                TableInfo tableInfo11 = TableInfo.a(supportSQLiteDatabase0, "WorkProgress");
                if(!tableInfo10.equals(tableInfo11)) {
                    return new ValidationResult(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + tableInfo10 + "\n Found:\n" + tableInfo11);
                }
                HashMap hashMap6 = new HashMap(2);
                hashMap6.put("key", new Column("key", "TEXT", true, 1, null, 1));
                hashMap6.put("long_value", new Column("long_value", "INTEGER", false, 0, null, 1));
                TableInfo tableInfo12 = new TableInfo("Preference", hashMap6, new HashSet(0), new HashSet(0));
                TableInfo tableInfo13 = TableInfo.a(supportSQLiteDatabase0, "Preference");
                return tableInfo12.equals(tableInfo13) ? new ValidationResult(true, null) : new ValidationResult(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + tableInfo12 + "\n Found:\n" + tableInfo13);
            }
        }, "86254750241babac4b8d52996a675549", "1cbd3130fa23b59692c061c594c16cc0");
        Configuration supportSQLiteOpenHelper$Configuration0 = Configuration.a(databaseConfiguration0.a).d(databaseConfiguration0.b).c(roomOpenHelper0).b();
        return databaseConfiguration0.c.a(supportSQLiteOpenHelper$Configuration0);
    }

    @Override  // androidx.room.RoomDatabase
    @NonNull
    public List m(@NonNull Map map0) {
        List list0 = new ArrayList();
        list0.add(new WorkDatabase_AutoMigration_13_14_Impl());
        list0.add(new WorkDatabase_AutoMigration_14_15_Impl());
        list0.add(new WorkDatabase_AutoMigration_16_17_Impl());
        list0.add(new WorkDatabase_AutoMigration_17_18_Impl());
        list0.add(new WorkDatabase_AutoMigration_18_19_Impl());
        list0.add(new WorkDatabase_AutoMigration_19_20_Impl());
        list0.add(new WorkDatabase_AutoMigration_20_21_Impl());
        list0.add(new WorkDatabase_AutoMigration_22_23_Impl());
        return list0;
    }

    @Override  // androidx.room.RoomDatabase
    @NonNull
    public Set u() {
        return new HashSet();
    }

    @Override  // androidx.room.RoomDatabase
    @NonNull
    protected Map v() {
        Map map0 = new HashMap();
        List list0 = WorkSpecDao_Impl.a0();
        ((HashMap)map0).put(WorkSpecDao.class, list0);
        List list1 = DependencyDao_Impl.f();
        ((HashMap)map0).put(DependencyDao.class, list1);
        List list2 = WorkTagDao_Impl.f();
        ((HashMap)map0).put(WorkTagDao.class, list2);
        List list3 = SystemIdInfoDao_Impl.h();
        ((HashMap)map0).put(SystemIdInfoDao.class, list3);
        List list4 = WorkNameDao_Impl.d();
        ((HashMap)map0).put(WorkNameDao.class, list4);
        List list5 = WorkProgressDao_Impl.a();
        ((HashMap)map0).put(WorkProgressDao.class, list5);
        List list6 = PreferenceDao_Impl.e();
        ((HashMap)map0).put(PreferenceDao.class, list6);
        List list7 = RawWorkInfoDao_Impl.k();
        ((HashMap)map0).put(RawWorkInfoDao.class, list7);
        return map0;
    }
}

