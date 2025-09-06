package androidx.work.impl.background.systemjob;

import android.annotation.SuppressLint;
import android.app.job.JobInfo.Builder;
import android.app.job.JobInfo.TriggerContentUri;
import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest.Builder;
import android.net.NetworkRequest;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.BackoffPolicy;
import androidx.work.Clock;
import androidx.work.Constraints.ContentUriTrigger;
import androidx.work.Constraints;
import androidx.work.Logger;
import androidx.work.NetworkType;
import androidx.work.impl.model.WorkSpec;

@SuppressLint({"ClassVerificationFailure"})
@RequiresApi(api = 23)
@RestrictTo({Scope.b})
class SystemJobInfoConverter {
    private final ComponentName a;
    private final Clock b;
    private final boolean c;
    private static final String d = null;
    static final String e = "EXTRA_WORK_SPEC_ID";
    static final String f = "EXTRA_IS_PERIODIC";
    static final String g = "EXTRA_WORK_SPEC_GENERATION";

    static {
        SystemJobInfoConverter.d = "WM-SystemJobInfoConvert";
    }

    SystemJobInfoConverter(@NonNull Context context0, Clock clock0, boolean z) {
        this.b = clock0;
        this.a = new ComponentName(context0.getApplicationContext(), SystemJobService.class);
        this.c = z;
    }

    JobInfo a(WorkSpec workSpec0, int v) {
        Constraints constraints0 = workSpec0.j;
        PersistableBundle persistableBundle0 = new PersistableBundle();
        persistableBundle0.putString("EXTRA_WORK_SPEC_ID", workSpec0.a);
        persistableBundle0.putInt("EXTRA_WORK_SPEC_GENERATION", workSpec0.D());
        persistableBundle0.putBoolean("EXTRA_IS_PERIODIC", workSpec0.L());
        JobInfo.Builder jobInfo$Builder0 = new JobInfo.Builder(v, this.a).setRequiresCharging(constraints0.i()).setRequiresDeviceIdle(constraints0.j()).setExtras(persistableBundle0);
        NetworkRequest networkRequest0 = constraints0.d();
        int v1 = Build.VERSION.SDK_INT;
        if(v1 < 28 || networkRequest0 == null) {
            SystemJobInfoConverter.d(jobInfo$Builder0, constraints0.f());
        }
        else {
            SystemJobInfoConverterExtKt.a(jobInfo$Builder0, networkRequest0);
        }
        boolean z = false;
        if(!constraints0.j()) {
            jobInfo$Builder0.setBackoffCriteria(workSpec0.m, (workSpec0.l == BackoffPolicy.b ? 0 : 1));
        }
        long v2 = Math.max(workSpec0.c() - this.b.currentTimeMillis(), 0L);
        if(v1 <= 28) {
            jobInfo$Builder0.setMinimumLatency(v2);
        }
        else if(v2 > 0L) {
            jobInfo$Builder0.setMinimumLatency(v2);
        }
        else if(!workSpec0.q && this.c) {
            jobInfo$Builder0.setImportantWhileForeground(true);
        }
        if(v1 >= 24 && constraints0.g()) {
            for(Object object0: constraints0.c()) {
                jobInfo$Builder0.addTriggerContentUri(SystemJobInfoConverter.b(((ContentUriTrigger)object0)));
            }
            jobInfo$Builder0.setTriggerContentUpdateDelay(constraints0.b());
            jobInfo$Builder0.setTriggerContentMaxDelay(constraints0.a());
        }
        jobInfo$Builder0.setPersisted(false);
        int v3 = Build.VERSION.SDK_INT;
        if(v3 >= 26) {
            jobInfo$Builder0.setRequiresBatteryNotLow(constraints0.h());
            jobInfo$Builder0.setRequiresStorageNotLow(constraints0.k());
        }
        boolean z1 = workSpec0.k > 0;
        if(v2 > 0L) {
            z = true;
        }
        if(v3 >= 0x1F && workSpec0.q && !z1 && !z) {
            jobInfo$Builder0.setExpedited(true);
        }
        if(v3 >= 35) {
            String s = workSpec0.I();
            if(s != null) {
                jobInfo$Builder0.setTraceTag(s);
            }
        }
        return jobInfo$Builder0.build();
    }

    @RequiresApi(24)
    private static JobInfo.TriggerContentUri b(ContentUriTrigger constraints$ContentUriTrigger0) {
        return j.a(constraints$ContentUriTrigger0.a(), ((int)constraints$ContentUriTrigger0.b()));
    }

    static int c(NetworkType networkType0) {
        switch(networkType0) {
            case 1: {
                return 0;
            }
            case 2: {
                return 1;
            }
            case 3: {
                return 2;
            }
            case 4: {
                if(Build.VERSION.SDK_INT >= 24) {
                    return 3;
                }
                break;
            }
            case 5: {
                if(Build.VERSION.SDK_INT >= 26) {
                    return 4;
                }
            }
        }
        Logger.e().a("WM-SystemJobInfoConvert", "API version too low. Cannot convert network type value " + networkType0);
        return 1;
    }

    static void d(@NonNull JobInfo.Builder jobInfo$Builder0, @NonNull NetworkType networkType0) {
        if(Build.VERSION.SDK_INT >= 30 && networkType0 == NetworkType.f) {
            jobInfo$Builder0.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            return;
        }
        jobInfo$Builder0.setRequiredNetworkType(SystemJobInfoConverter.c(networkType0));
    }
}

