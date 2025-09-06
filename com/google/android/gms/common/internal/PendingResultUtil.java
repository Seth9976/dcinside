package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk
public class PendingResultUtil {
    @KeepForSdk
    public interface ResultConverter {
        @Nullable
        @KeepForSdk
        Object convert(@NonNull Result arg1);
    }

    private static final zas zaa;

    static {
        PendingResultUtil.zaa = new zao();
    }

    @NonNull
    @KeepForSdk
    public static Task toResponseTask(@NonNull PendingResult pendingResult0, @NonNull Response response0) {
        return PendingResultUtil.toTask(pendingResult0, new zaq(response0));
    }

    @NonNull
    @KeepForSdk
    public static Task toTask(@NonNull PendingResult pendingResult0, @NonNull ResultConverter pendingResultUtil$ResultConverter0) {
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        pendingResult0.addStatusListener(new zap(pendingResult0, taskCompletionSource0, pendingResultUtil$ResultConverter0, PendingResultUtil.zaa));
        return taskCompletionSource0.getTask();
    }

    @NonNull
    @KeepForSdk
    public static Task toVoidTask(@NonNull PendingResult pendingResult0) {
        return PendingResultUtil.toTask(pendingResult0, new zar());
    }
}

