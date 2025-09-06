package androidx.work.impl;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.V;
import kotlin.collections.Y;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import kotlin.ranges.s;
import y4.l;
import z3.n;

@RestrictTo({Scope.b})
@s0({"SMAP\nWorkDatabasePathHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkDatabasePathHelper.kt\nandroidx/work/impl/WorkDatabasePathHelper\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,122:1\n215#2,2:123\n8676#3,2:125\n9358#3,4:127\n*S KotlinDebug\n*F\n+ 1 WorkDatabasePathHelper.kt\nandroidx/work/impl/WorkDatabasePathHelper\n*L\n46#1:123,2\n75#1:125,2\n75#1:127,4\n*E\n"})
public final class WorkDatabasePathHelper {
    @l
    public static final WorkDatabasePathHelper a;

    static {
        WorkDatabasePathHelper.a = new WorkDatabasePathHelper();
    }

    @l
    public final File a(@l Context context0) {
        L.p(context0, "context");
        return Build.VERSION.SDK_INT >= 23 ? this.c(context0) : this.b(context0);
    }

    @l
    public final File b(@l Context context0) {
        L.p(context0, "context");
        File file0 = context0.getDatabasePath("androidx.work.workdb");
        L.o(file0, "context.getDatabasePath(WORK_DATABASE_NAME)");
        return file0;
    }

    @RequiresApi(23)
    private final File c(Context context0) {
        return new File(Api21Impl.a.a(context0), "androidx.work.workdb");
    }

    @n
    public static final void d(@l Context context0) {
        L.p(context0, "context");
        WorkDatabasePathHelper workDatabasePathHelper0 = WorkDatabasePathHelper.a;
        File file0 = workDatabasePathHelper0.b(context0);
        if(Build.VERSION.SDK_INT >= 23 && file0.exists()) {
            Logger.e().a("WM-WrkDbPathHelper", "Migrating WorkDatabase to the no-backup directory");
            for(Object object0: workDatabasePathHelper0.e(context0).entrySet()) {
                File file1 = (File)((Map.Entry)object0).getKey();
                File file2 = (File)((Map.Entry)object0).getValue();
                if(file1.exists()) {
                    if(file2.exists()) {
                        Logger.e().l("WM-WrkDbPathHelper", "Over-writing contents of " + file2);
                    }
                    String s = file1.renameTo(file2) ? "Migrated " + file1 + "to " + file2 : "Renaming " + file1 + " to " + file2 + " failed";
                    Logger.e().a("WM-WrkDbPathHelper", s);
                }
            }
        }
    }

    @l
    public final Map e(@l Context context0) {
        L.p(context0, "context");
        if(Build.VERSION.SDK_INT >= 23) {
            File file0 = this.b(context0);
            File file1 = this.a(context0);
            String[] arr_s = WorkDatabasePathHelperKt.c;
            LinkedHashMap linkedHashMap0 = new LinkedHashMap(s.u(Y.j(arr_s.length), 16));
            for(int v = 0; v < arr_s.length; ++v) {
                String s = arr_s[v];
                V v1 = r0.a(new File(file0.getPath() + s), new File(file1.getPath() + s));
                linkedHashMap0.put(v1.e(), v1.f());
            }
            return Y.o0(linkedHashMap0, r0.a(file0, file1));
        }
        return Y.z();
    }
}

