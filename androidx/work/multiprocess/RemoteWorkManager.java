package androidx.work.multiprocess;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.Data;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ForegroundInfo;
import androidx.work.OneTimeWorkRequest;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkContinuation;
import androidx.work.WorkQuery;
import androidx.work.WorkRequest;
import androidx.work.impl.WorkManagerImpl;
import com.google.common.util.concurrent.t0;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public abstract class RemoteWorkManager {
    @NonNull
    public final RemoteWorkContinuation a(@NonNull String s, @NonNull ExistingWorkPolicy existingWorkPolicy0, @NonNull OneTimeWorkRequest oneTimeWorkRequest0) {
        return this.b(s, existingWorkPolicy0, Collections.singletonList(oneTimeWorkRequest0));
    }

    @NonNull
    public abstract RemoteWorkContinuation b(@NonNull String arg1, @NonNull ExistingWorkPolicy arg2, @NonNull List arg3);

    @NonNull
    public final RemoteWorkContinuation c(@NonNull OneTimeWorkRequest oneTimeWorkRequest0) {
        return this.d(Collections.singletonList(oneTimeWorkRequest0));
    }

    @NonNull
    public abstract RemoteWorkContinuation d(@NonNull List arg1);

    @NonNull
    public abstract t0 e();

    @NonNull
    public abstract t0 f(@NonNull String arg1);

    @NonNull
    public abstract t0 g(@NonNull String arg1);

    @NonNull
    public abstract t0 h(@NonNull UUID arg1);

    @NonNull
    @RestrictTo({Scope.b})
    public abstract t0 i(@NonNull WorkContinuation arg1);

    @NonNull
    public abstract t0 j(@NonNull WorkRequest arg1);

    @NonNull
    public abstract t0 k(@NonNull List arg1);

    @NonNull
    public abstract t0 l(@NonNull String arg1, @NonNull ExistingPeriodicWorkPolicy arg2, @NonNull PeriodicWorkRequest arg3);

    @NonNull
    public final t0 m(@NonNull String s, @NonNull ExistingWorkPolicy existingWorkPolicy0, @NonNull OneTimeWorkRequest oneTimeWorkRequest0) {
        return this.n(s, existingWorkPolicy0, Collections.singletonList(oneTimeWorkRequest0));
    }

    @NonNull
    public abstract t0 n(@NonNull String arg1, @NonNull ExistingWorkPolicy arg2, @NonNull List arg3);

    @NonNull
    public static RemoteWorkManager o(@NonNull Context context0) {
        RemoteWorkManager remoteWorkManager0 = WorkManagerImpl.O(context0).R();
        if(remoteWorkManager0 == null) {
            throw new IllegalStateException("Unable to initialize RemoteWorkManager");
        }
        return remoteWorkManager0;
    }

    @NonNull
    public abstract t0 p(@NonNull WorkQuery arg1);

    @NonNull
    @RestrictTo({Scope.b})
    public abstract t0 q(@NonNull String arg1, @NonNull ForegroundInfo arg2);

    @NonNull
    @RestrictTo({Scope.b})
    public abstract t0 r(@NonNull UUID arg1, @NonNull Data arg2);
}

