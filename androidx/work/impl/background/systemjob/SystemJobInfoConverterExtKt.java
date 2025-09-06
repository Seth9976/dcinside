package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo.Builder;
import android.net.NetworkRequest;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@RequiresApi(28)
public final class SystemJobInfoConverterExtKt {
    public static final void a(@l JobInfo.Builder jobInfo$Builder0, @m NetworkRequest networkRequest0) {
        L.p(jobInfo$Builder0, "builder");
        jobInfo$Builder0.setRequiredNetwork(networkRequest0);
    }
}

