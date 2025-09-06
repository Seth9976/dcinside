package androidx.work;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LiveData;
import com.google.common.util.concurrent.t0;
import java.util.Collections;
import java.util.List;

public abstract class WorkContinuation {
    @NonNull
    public static WorkContinuation a(@NonNull List list0) {
        return ((WorkContinuation)list0.get(0)).b(list0);
    }

    @NonNull
    @RestrictTo({Scope.b})
    protected abstract WorkContinuation b(@NonNull List arg1);

    @NonNull
    public abstract Operation c();

    @NonNull
    public abstract t0 d();

    @NonNull
    public abstract LiveData e();

    @NonNull
    public final WorkContinuation f(@NonNull OneTimeWorkRequest oneTimeWorkRequest0) {
        return this.g(Collections.singletonList(oneTimeWorkRequest0));
    }

    @NonNull
    public abstract WorkContinuation g(@NonNull List arg1);
}

