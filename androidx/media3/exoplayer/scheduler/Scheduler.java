package androidx.media3.exoplayer.scheduler;

import androidx.media3.common.util.UnstableApi;

@UnstableApi
public interface Scheduler {
    boolean a(Requirements arg1, String arg2, String arg3);

    Requirements b(Requirements arg1);

    boolean cancel();
}

