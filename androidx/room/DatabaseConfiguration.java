package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Factory;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.c0;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.k;
import y4.l;
import y4.m;
import z3.f;

public class DatabaseConfiguration {
    @l
    @f
    public final Context a;
    @m
    @f
    public final String b;
    @l
    @f
    public final Factory c;
    @l
    @f
    public final MigrationContainer d;
    @m
    @f
    public final List e;
    @f
    public final boolean f;
    @l
    @f
    public final JournalMode g;
    @l
    @f
    public final Executor h;
    @l
    @f
    public final Executor i;
    @RestrictTo({Scope.c})
    @m
    @f
    public final Intent j;
    @f
    public final boolean k;
    @f
    public final boolean l;
    @m
    private final Set m;
    @m
    @f
    public final String n;
    @m
    @f
    public final File o;
    @m
    @f
    public final Callable p;
    @m
    @f
    public final PrepackagedDatabaseCallback q;
    @l
    @f
    public final List r;
    @l
    @f
    public final List s;
    @f
    public final boolean t;

    @SuppressLint({"LambdaLast"})
    @RestrictTo({Scope.c})
    public DatabaseConfiguration(@l Context context0, @m String s, @l Factory supportSQLiteOpenHelper$Factory0, @l MigrationContainer roomDatabase$MigrationContainer0, @m List list0, boolean z, @l JournalMode roomDatabase$JournalMode0, @l Executor executor0, @l Executor executor1, @m Intent intent0, boolean z1, boolean z2, @m Set set0, @m String s1, @m File file0, @m Callable callable0, @m PrepackagedDatabaseCallback roomDatabase$PrepackagedDatabaseCallback0, @l List list1, @l List list2) {
        L.p(context0, "context");
        L.p(supportSQLiteOpenHelper$Factory0, "sqliteOpenHelperFactory");
        L.p(roomDatabase$MigrationContainer0, "migrationContainer");
        L.p(roomDatabase$JournalMode0, "journalMode");
        L.p(executor0, "queryExecutor");
        L.p(executor1, "transactionExecutor");
        L.p(list1, "typeConverters");
        L.p(list2, "autoMigrationSpecs");
        super();
        this.a = context0;
        this.b = s;
        this.c = supportSQLiteOpenHelper$Factory0;
        this.d = roomDatabase$MigrationContainer0;
        this.e = list0;
        this.f = z;
        this.g = roomDatabase$JournalMode0;
        this.h = executor0;
        this.i = executor1;
        this.j = intent0;
        this.k = z1;
        this.l = z2;
        this.m = set0;
        this.n = s1;
        this.o = file0;
        this.p = callable0;
        this.q = roomDatabase$PrepackagedDatabaseCallback0;
        this.r = list1;
        this.s = list2;
        this.t = intent0 != null;
    }

    @RestrictTo({Scope.c})
    @k(message = "This constructor is deprecated.", replaceWith = @c0(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    public DatabaseConfiguration(@l Context context0, @m String s, @l Factory supportSQLiteOpenHelper$Factory0, @l MigrationContainer roomDatabase$MigrationContainer0, @m List list0, boolean z, @l JournalMode roomDatabase$JournalMode0, @l Executor executor0, @l Executor executor1, boolean z1, boolean z2, boolean z3, @m Set set0) {
        L.p(context0, "context");
        L.p(supportSQLiteOpenHelper$Factory0, "sqliteOpenHelperFactory");
        L.p(roomDatabase$MigrationContainer0, "migrationContainer");
        L.p(roomDatabase$JournalMode0, "journalMode");
        L.p(executor0, "queryExecutor");
        L.p(executor1, "transactionExecutor");
        this(context0, s, supportSQLiteOpenHelper$Factory0, roomDatabase$MigrationContainer0, list0, z, roomDatabase$JournalMode0, executor0, executor1, (z1 ? new Intent(context0, MultiInstanceInvalidationService.class) : null), z2, z3, set0, null, null, null, null, u.H(), u.H());
    }

    @RestrictTo({Scope.c})
    @k(message = "This constructor is deprecated.", replaceWith = @c0(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    public DatabaseConfiguration(@l Context context0, @m String s, @l Factory supportSQLiteOpenHelper$Factory0, @l MigrationContainer roomDatabase$MigrationContainer0, @m List list0, boolean z, @l JournalMode roomDatabase$JournalMode0, @l Executor executor0, @l Executor executor1, boolean z1, boolean z2, boolean z3, @m Set set0, @m String s1, @m File file0) {
        L.p(context0, "context");
        L.p(supportSQLiteOpenHelper$Factory0, "sqliteOpenHelperFactory");
        L.p(roomDatabase$MigrationContainer0, "migrationContainer");
        L.p(roomDatabase$JournalMode0, "journalMode");
        L.p(executor0, "queryExecutor");
        L.p(executor1, "transactionExecutor");
        this(context0, s, supportSQLiteOpenHelper$Factory0, roomDatabase$MigrationContainer0, list0, z, roomDatabase$JournalMode0, executor0, executor1, (z1 ? new Intent(context0, MultiInstanceInvalidationService.class) : null), z2, z3, set0, s1, file0, null, null, u.H(), u.H());
    }

    @RestrictTo({Scope.c})
    @k(message = "This constructor is deprecated.", replaceWith = @c0(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    public DatabaseConfiguration(@l Context context0, @m String s, @l Factory supportSQLiteOpenHelper$Factory0, @l MigrationContainer roomDatabase$MigrationContainer0, @m List list0, boolean z, @l JournalMode roomDatabase$JournalMode0, @l Executor executor0, @l Executor executor1, boolean z1, boolean z2, boolean z3, @m Set set0, @m String s1, @m File file0, @m Callable callable0) {
        L.p(context0, "context");
        L.p(supportSQLiteOpenHelper$Factory0, "sqliteOpenHelperFactory");
        L.p(roomDatabase$MigrationContainer0, "migrationContainer");
        L.p(roomDatabase$JournalMode0, "journalMode");
        L.p(executor0, "queryExecutor");
        L.p(executor1, "transactionExecutor");
        this(context0, s, supportSQLiteOpenHelper$Factory0, roomDatabase$MigrationContainer0, list0, z, roomDatabase$JournalMode0, executor0, executor1, (z1 ? new Intent(context0, MultiInstanceInvalidationService.class) : null), z2, z3, set0, s1, file0, callable0, null, u.H(), u.H());
    }

    @SuppressLint({"LambdaLast"})
    @RestrictTo({Scope.c})
    @k(message = "This constructor is deprecated.", replaceWith = @c0(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    public DatabaseConfiguration(@l Context context0, @m String s, @l Factory supportSQLiteOpenHelper$Factory0, @l MigrationContainer roomDatabase$MigrationContainer0, @m List list0, boolean z, @l JournalMode roomDatabase$JournalMode0, @l Executor executor0, @l Executor executor1, boolean z1, boolean z2, boolean z3, @m Set set0, @m String s1, @m File file0, @m Callable callable0, @m PrepackagedDatabaseCallback roomDatabase$PrepackagedDatabaseCallback0) {
        L.p(context0, "context");
        L.p(supportSQLiteOpenHelper$Factory0, "sqliteOpenHelperFactory");
        L.p(roomDatabase$MigrationContainer0, "migrationContainer");
        L.p(roomDatabase$JournalMode0, "journalMode");
        L.p(executor0, "queryExecutor");
        L.p(executor1, "transactionExecutor");
        this(context0, s, supportSQLiteOpenHelper$Factory0, roomDatabase$MigrationContainer0, list0, z, roomDatabase$JournalMode0, executor0, executor1, (z1 ? new Intent(context0, MultiInstanceInvalidationService.class) : null), z2, z3, set0, s1, file0, callable0, roomDatabase$PrepackagedDatabaseCallback0, u.H(), u.H());
    }

    @SuppressLint({"LambdaLast"})
    @RestrictTo({Scope.c})
    @k(message = "This constructor is deprecated.", replaceWith = @c0(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    public DatabaseConfiguration(@l Context context0, @m String s, @l Factory supportSQLiteOpenHelper$Factory0, @l MigrationContainer roomDatabase$MigrationContainer0, @m List list0, boolean z, @l JournalMode roomDatabase$JournalMode0, @l Executor executor0, @l Executor executor1, boolean z1, boolean z2, boolean z3, @m Set set0, @m String s1, @m File file0, @m Callable callable0, @m PrepackagedDatabaseCallback roomDatabase$PrepackagedDatabaseCallback0, @l List list1) {
        L.p(context0, "context");
        L.p(supportSQLiteOpenHelper$Factory0, "sqliteOpenHelperFactory");
        L.p(roomDatabase$MigrationContainer0, "migrationContainer");
        L.p(roomDatabase$JournalMode0, "journalMode");
        L.p(executor0, "queryExecutor");
        L.p(executor1, "transactionExecutor");
        L.p(list1, "typeConverters");
        this(context0, s, supportSQLiteOpenHelper$Factory0, roomDatabase$MigrationContainer0, list0, z, roomDatabase$JournalMode0, executor0, executor1, (z1 ? new Intent(context0, MultiInstanceInvalidationService.class) : null), z2, z3, set0, s1, file0, callable0, roomDatabase$PrepackagedDatabaseCallback0, list1, u.H());
    }

    @SuppressLint({"LambdaLast"})
    @RestrictTo({Scope.c})
    @k(message = "This constructor is deprecated.", replaceWith = @c0(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    public DatabaseConfiguration(@l Context context0, @m String s, @l Factory supportSQLiteOpenHelper$Factory0, @l MigrationContainer roomDatabase$MigrationContainer0, @m List list0, boolean z, @l JournalMode roomDatabase$JournalMode0, @l Executor executor0, @l Executor executor1, boolean z1, boolean z2, boolean z3, @m Set set0, @m String s1, @m File file0, @m Callable callable0, @m PrepackagedDatabaseCallback roomDatabase$PrepackagedDatabaseCallback0, @l List list1, @l List list2) {
        L.p(context0, "context");
        L.p(supportSQLiteOpenHelper$Factory0, "sqliteOpenHelperFactory");
        L.p(roomDatabase$MigrationContainer0, "migrationContainer");
        L.p(roomDatabase$JournalMode0, "journalMode");
        L.p(executor0, "queryExecutor");
        L.p(executor1, "transactionExecutor");
        L.p(list1, "typeConverters");
        L.p(list2, "autoMigrationSpecs");
        this(context0, s, supportSQLiteOpenHelper$Factory0, roomDatabase$MigrationContainer0, list0, z, roomDatabase$JournalMode0, executor0, executor1, (z1 ? new Intent(context0, MultiInstanceInvalidationService.class) : null), z2, z3, set0, s1, file0, callable0, null, list1, list2);
    }

    @RestrictTo({Scope.c})
    @k(message = "This constructor is deprecated.", replaceWith = @c0(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    public DatabaseConfiguration(@l Context context0, @m String s, @l Factory supportSQLiteOpenHelper$Factory0, @l MigrationContainer roomDatabase$MigrationContainer0, @m List list0, boolean z, @l JournalMode roomDatabase$JournalMode0, @l Executor executor0, boolean z1, @m Set set0) {
        L.p(context0, "context");
        L.p(supportSQLiteOpenHelper$Factory0, "sqliteOpenHelperFactory");
        L.p(roomDatabase$MigrationContainer0, "migrationContainer");
        L.p(roomDatabase$JournalMode0, "journalMode");
        L.p(executor0, "queryExecutor");
        this(context0, s, supportSQLiteOpenHelper$Factory0, roomDatabase$MigrationContainer0, list0, z, roomDatabase$JournalMode0, executor0, executor0, null, z1, false, set0, null, null, null, null, u.H(), u.H());
    }

    // 去混淆评级： 低(40)
    public boolean a(int v, int v1) {
        return v <= v1 || !this.l ? this.k && (this.m == null || !this.m.contains(v)) : false;
    }

    @k(message = "Use [isMigrationRequired(int, int)] which takes\n      [allowDestructiveMigrationOnDowngrade] into account.", replaceWith = @c0(expression = "isMigrationRequired(version, version + 1)", imports = {}))
    public boolean b(int v) {
        return this.a(v, v + 1);
    }
}

