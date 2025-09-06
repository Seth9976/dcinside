package androidx.work.impl;

import android.content.Context;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.room.AutoMigration;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Builder;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory;
import androidx.work.Clock;
import androidx.work.Data;
import androidx.work.impl.model.Dependency;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.Preference;
import androidx.work.impl.model.PreferenceDao;
import androidx.work.impl.model.RawWorkInfoDao;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkName;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkProgress;
import androidx.work.impl.model.WorkProgressDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTag;
import androidx.work.impl.model.WorkTagDao;
import androidx.work.impl.model.WorkTypeConverters;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.n;

@RestrictTo({Scope.b})
@Database(autoMigrations = {@AutoMigration(from = 13, to = 14), @AutoMigration(from = 14, spec = AutoMigration_14_15.class, to = 15), @AutoMigration(from = 16, to = 17), @AutoMigration(from = 17, to = 18), @AutoMigration(from = 18, to = 19), @AutoMigration(from = 19, spec = AutoMigration_19_20.class, to = 20), @AutoMigration(from = 20, to = 21), @AutoMigration(from = 22, to = 23)}, entities = {Dependency.class, WorkSpec.class, WorkTag.class, SystemIdInfo.class, WorkName.class, WorkProgress.class, Preference.class}, version = 23)
@TypeConverters({Data.class, WorkTypeConverters.class})
public abstract class WorkDatabase extends RoomDatabase {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        @n
        public final WorkDatabase b(@l Context context0, @l Executor executor0, @l Clock clock0, boolean z) {
            L.p(context0, "context");
            L.p(executor0, "queryExecutor");
            L.p(clock0, "clock");
            return z ? ((WorkDatabase)Room.c(context0, WorkDatabase.class).e().v(executor0).b(new CleanupCallback(clock0)).c(new Migration[]{Migration_1_2.c}).c(new Migration[]{new RescheduleMigration(context0, 2, 3)}).c(new Migration[]{Migration_3_4.c}).c(new Migration[]{Migration_4_5.c}).c(new Migration[]{new RescheduleMigration(context0, 5, 6)}).c(new Migration[]{Migration_6_7.c}).c(new Migration[]{Migration_7_8.c}).c(new Migration[]{Migration_8_9.c}).c(new Migration[]{new WorkMigration9To10(context0)}).c(new Migration[]{new RescheduleMigration(context0, 10, 11)}).c(new Migration[]{Migration_11_12.c}).c(new Migration[]{Migration_12_13.c}).c(new Migration[]{Migration_15_16.c}).c(new Migration[]{Migration_16_17.c}).c(new Migration[]{new RescheduleMigration(context0, 21, 22)}).n().f()) : ((WorkDatabase)Room.a(context0, WorkDatabase.class, "androidx.work.workdb").q((Configuration supportSQLiteOpenHelper$Configuration0) -> {
                L.p(supportSQLiteOpenHelper$Configuration0, "configuration");
                Builder supportSQLiteOpenHelper$Configuration$Builder0 = Configuration.f.a(context0);
                supportSQLiteOpenHelper$Configuration$Builder0.d(supportSQLiteOpenHelper$Configuration0.b).c(supportSQLiteOpenHelper$Configuration0.c).e(true).a(true);
                return new FrameworkSQLiteOpenHelperFactory().a(supportSQLiteOpenHelper$Configuration$Builder0.b());
            }).v(executor0).b(new CleanupCallback(clock0)).c(new Migration[]{Migration_1_2.c}).c(new Migration[]{new RescheduleMigration(context0, 2, 3)}).c(new Migration[]{Migration_3_4.c}).c(new Migration[]{Migration_4_5.c}).c(new Migration[]{new RescheduleMigration(context0, 5, 6)}).c(new Migration[]{Migration_6_7.c}).c(new Migration[]{Migration_7_8.c}).c(new Migration[]{Migration_8_9.c}).c(new Migration[]{new WorkMigration9To10(context0)}).c(new Migration[]{new RescheduleMigration(context0, 10, 11)}).c(new Migration[]{Migration_11_12.c}).c(new Migration[]{Migration_12_13.c}).c(new Migration[]{Migration_15_16.c}).c(new Migration[]{Migration_16_17.c}).c(new Migration[]{new RescheduleMigration(context0, 21, 22)}).n().f());
        }

        // 检测为 Lambda 实现
        private static final SupportSQLiteOpenHelper c(Context context0, Configuration supportSQLiteOpenHelper$Configuration0) [...]
    }

    @l
    public static final Companion q;

    static {
        WorkDatabase.q = new Companion(null);
    }

    @l
    @n
    public static final WorkDatabase S(@l Context context0, @l Executor executor0, @l Clock clock0, boolean z) {
        return WorkDatabase.q.b(context0, executor0, clock0, z);
    }

    @l
    public abstract DependencyDao T();

    @l
    public abstract PreferenceDao U();

    @l
    public abstract RawWorkInfoDao V();

    @l
    public abstract SystemIdInfoDao W();

    @l
    public abstract WorkNameDao X();

    @l
    public abstract WorkProgressDao Y();

    @l
    public abstract WorkSpecDao Z();

    @l
    public abstract WorkTagDao a0();
}

