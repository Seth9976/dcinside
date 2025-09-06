package androidx.work.impl;

import androidx.work.WorkerParameters.RuntimeExtras;
import y4.l;
import y4.m;

public interface WorkLauncher {
    void a(@l StartStopToken arg1, int arg2);

    void b(@l StartStopToken arg1);

    void c(@l StartStopToken arg1, @m RuntimeExtras arg2);

    void d(@l StartStopToken arg1, int arg2);

    void e(@l StartStopToken arg1);
}

