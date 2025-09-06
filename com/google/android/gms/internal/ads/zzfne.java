package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public final class zzfne implements Continuation {
    @Override  // com.google.android.gms.tasks.Continuation
    public final Object then(Task task0) {
        return Boolean.valueOf(task0.isSuccessful());
    }
}

