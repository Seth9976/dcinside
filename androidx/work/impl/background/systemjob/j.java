package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo.TriggerContentUri;
import android.net.Uri;

public final class j {
    public static JobInfo.TriggerContentUri a(Uri uri0, int v) {
        return new JobInfo.TriggerContentUri(uri0, v);
    }
}

