package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

public final class TaskExecutors {
    @NonNull
    public static final Executor MAIN_THREAD;
    static final Executor zza;

    static {
        TaskExecutors.MAIN_THREAD = new zzu();
        TaskExecutors.zza = new zzt();
    }
}

