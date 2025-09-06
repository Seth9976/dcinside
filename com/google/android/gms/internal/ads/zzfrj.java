package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.t0;

public final class zzfrj {
    public static t0 zza(Task task0, CancellationTokenSource cancellationTokenSource0) {
        t0 t00 = new zzfri(task0, null);
        task0.addOnCompleteListener(zzgcz.zzc(), new zzfrh(((zzfri)t00)));
        return t00;
    }
}

