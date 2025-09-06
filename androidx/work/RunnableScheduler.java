package androidx.work;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;

public interface RunnableScheduler {
    void a(@NonNull Runnable arg1);

    void b(@IntRange(from = 0L) long arg1, @NonNull Runnable arg2);
}

