package androidx.work.multiprocess;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.OneTimeWorkRequest;
import com.google.common.util.concurrent.t0;
import java.util.Collections;
import java.util.List;

public abstract class RemoteWorkContinuation {
    @NonNull
    public static RemoteWorkContinuation a(@NonNull List list0) {
        return ((RemoteWorkContinuation)list0.get(0)).b(list0);
    }

    @NonNull
    @RestrictTo({Scope.b})
    protected abstract RemoteWorkContinuation b(@NonNull List arg1);

    @NonNull
    public abstract t0 c();

    @NonNull
    public final RemoteWorkContinuation d(@NonNull OneTimeWorkRequest oneTimeWorkRequest0) {
        return this.e(Collections.singletonList(oneTimeWorkRequest0));
    }

    @NonNull
    public abstract RemoteWorkContinuation e(@NonNull List arg1);
}

