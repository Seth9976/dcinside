package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

@KeepForSdk
public class TaskUtil {
    @KeepForSdk
    public static void setResultOrApiException(@NonNull Status status0, @NonNull TaskCompletionSource taskCompletionSource0) {
        TaskUtil.setResultOrApiException(status0, null, taskCompletionSource0);
    }

    @KeepForSdk
    public static void setResultOrApiException(@NonNull Status status0, @Nullable Object object0, @NonNull TaskCompletionSource taskCompletionSource0) {
        if(status0.isSuccess()) {
            taskCompletionSource0.setResult(object0);
            return;
        }
        taskCompletionSource0.setException(ApiExceptionUtil.fromStatus(status0));
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static Task toVoidTaskThatFailsOnFalse(@NonNull Task task0) {
        return task0.continueWith(new zacx());
    }

    // 去混淆评级： 低(20)
    @KeepForSdk
    @ResultIgnorabilityUnspecified
    public static boolean trySetResultOrApiException(@NonNull Status status0, @Nullable Object object0, @NonNull TaskCompletionSource taskCompletionSource0) {
        return status0.isSuccess() ? taskCompletionSource0.trySetResult(object0) : taskCompletionSource0.trySetException(ApiExceptionUtil.fromStatus(status0));
    }
}

