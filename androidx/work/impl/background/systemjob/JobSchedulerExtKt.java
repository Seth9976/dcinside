package androidx.work.impl.background.systemjob;

import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build.VERSION;
import androidx.annotation.RequiresApi;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nJobSchedulerExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSchedulerExt.kt\nandroidx/work/impl/background/systemjob/JobSchedulerExtKt\n+ 2 LoggerExt.kt\nandroidx/work/LoggerExtKt\n*L\n1#1,127:1\n32#2:128\n*S KotlinDebug\n*F\n+ 1 JobSchedulerExt.kt\nandroidx/work/impl/background/systemjob/JobSchedulerExtKt\n*L\n70#1:128\n*E\n"})
public final class JobSchedulerExtKt {
    @l
    public static final String a = "androidx.work.systemjobscheduler";
    @l
    private static final String b;

    // 去混淆评级： 低(20)
    static {
        L.o("WM-SystemJobScheduler", "tagWithPrefix(\"SystemJobScheduler\")");
        JobSchedulerExtKt.b = "WM-SystemJobScheduler";
    }

    @RequiresApi(23)
    @l
    public static final String a(@l Context context0, @l WorkDatabase workDatabase0, @l Configuration configuration0) {
        L.p(context0, "context");
        L.p(workDatabase0, "workDatabase");
        L.p(configuration0, "configuration");
        int v = Build.VERSION.SDK_INT;
        int v1 = v < 0x1F ? 100 : 150;
        int v2 = workDatabase0.Z().E().size();
        String s = "<faulty JobScheduler failed to getPendingJobs>";
        if(v >= 34) {
            JobScheduler jobScheduler0 = JobSchedulerExtKt.c(context0);
            List list0 = JobSchedulerExtKt.b(jobScheduler0);
            if(list0 != null) {
                List list1 = SystemJobScheduler.g(context0, jobScheduler0);
                int v3 = 0;
                int v4 = list1 == null ? 0 : list0.size() - list1.size();
                String s1 = null;
                Object object0 = context0.getSystemService("jobscheduler");
                L.n(object0, "null cannot be cast to non-null type android.app.job.JobScheduler");
                List list2 = SystemJobScheduler.g(context0, ((JobScheduler)object0));
                if(list2 != null) {
                    v3 = list2.size();
                }
                if(v3 != 0) {
                    s1 = v3 + " from WorkManager in the default namespace";
                }
                return "JobScheduler " + v1 + " job limit exceeded.\nIn JobScheduler there are " + u.m3(u.Q(new String[]{list0.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", (v4 == 0 ? null : v4 + " of which are not owned by WorkManager"), s1}), ",\n", null, null, 0, null, null, 62, null) + ".\nThere are " + v2 + " jobs tracked by WorkManager\'s database;\nthe Configuration limit is " + configuration0.h() + '.';
            }
        }
        else {
            List list3 = SystemJobScheduler.g(context0, JobSchedulerExtKt.c(context0));
            if(list3 != null) {
                s = list3.size() + " jobs from WorkManager";
            }
        }
        return "JobScheduler " + v1 + " job limit exceeded.\nIn JobScheduler there are " + s + ".\nThere are " + v2 + " jobs tracked by WorkManager\'s database;\nthe Configuration limit is " + configuration0.h() + '.';
    }

    @RequiresApi(21)
    @m
    public static final List b(@l JobScheduler jobScheduler0) {
        L.p(jobScheduler0, "<this>");
        try {
            return JobScheduler21.a.a(jobScheduler0);
        }
        catch(Throwable throwable0) {
            Logger.e().d("WM-SystemJobScheduler", "getAllPendingJobs() is not reliable on this device.", throwable0);
            return null;
        }
    }

    @RequiresApi(21)
    @l
    public static final JobScheduler c(@l Context context0) {
        L.p(context0, "<this>");
        Object object0 = context0.getSystemService("jobscheduler");
        L.n(object0, "null cannot be cast to non-null type android.app.job.JobScheduler");
        return Build.VERSION.SDK_INT < 34 ? ((JobScheduler)object0) : JobScheduler34.a.a(((JobScheduler)object0));
    }
}

