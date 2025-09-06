package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo.Builder;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.google.android.datatransport.h;
import com.google.android.datatransport.runtime.r;
import com.google.android.datatransport.runtime.scheduling.persistence.d;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import z1.a;

@RequiresApi(api = 21)
public class e implements y {
    private final Context a;
    private final d b;
    private final g c;
    private static final String d = "JobInfoScheduler";
    static final String e = "attemptNumber";
    static final String f = "backendName";
    static final String g = "priority";
    static final String h = "extras";

    public e(Context context0, d d0, g g0) {
        this.a = context0;
        this.b = d0;
        this.c = g0;
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.jobscheduling.y
    public void a(r r0, int v, boolean z) {
        ComponentName componentName0 = new ComponentName(this.a, JobInfoSchedulerService.class);
        Object object0 = this.a.getSystemService("jobscheduler");
        int v1 = this.c(r0);
        if(!z && this.d(((JobScheduler)object0), v1, v)) {
            a.c("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", r0);
            return;
        }
        long v2 = this.b.Q2(r0);
        JobInfo.Builder jobInfo$Builder0 = new JobInfo.Builder(v1, componentName0);
        h h0 = r0.d();
        JobInfo.Builder jobInfo$Builder1 = this.c.c(jobInfo$Builder0, h0, v2, v);
        PersistableBundle persistableBundle0 = new PersistableBundle();
        persistableBundle0.putInt("attemptNumber", v);
        persistableBundle0.putString("backendName", r0.b());
        persistableBundle0.putInt("priority", C1.a.a(r0.d()));
        if(r0.c() != null) {
            persistableBundle0.putString("extras", Base64.encodeToString(r0.c(), 0));
        }
        jobInfo$Builder1.setExtras(persistableBundle0);
        h h1 = r0.d();
        a.e("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", new Object[]{r0, v1, this.c.h(h1, v2, v), v2, v});
        ((JobScheduler)object0).schedule(jobInfo$Builder1.build());
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.jobscheduling.y
    public void b(r r0, int v) {
        this.a(r0, v, false);
    }

    @VisibleForTesting
    int c(r r0) {
        Adler32 adler320 = new Adler32();
        adler320.update("com.dcinside.app.android".getBytes(Charset.forName("UTF-8")));
        adler320.update(r0.b().getBytes(Charset.forName("UTF-8")));
        adler320.update(ByteBuffer.allocate(4).putInt(C1.a.a(r0.d())).array());
        if(r0.c() != null) {
            adler320.update(r0.c());
        }
        return (int)adler320.getValue();
    }

    private boolean d(JobScheduler jobScheduler0, int v, int v1) {
        for(Object object0: jobScheduler0.getAllPendingJobs()) {
            int v2 = ((JobInfo)object0).getExtras().getInt("attemptNumber");
            if(((JobInfo)object0).getId() == v) {
                return v2 >= v1;
            }
            if(false) {
                break;
            }
        }
        return false;
    }
}

