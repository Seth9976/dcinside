package com.google.firebase.crashlytics.internal.send;

import com.google.android.datatransport.n;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.common.F;

public final class d implements n {
    public final e a;
    public final TaskCompletionSource b;
    public final boolean c;
    public final F d;

    public d(e e0, TaskCompletionSource taskCompletionSource0, boolean z, F f0) {
        this.a = e0;
        this.b = taskCompletionSource0;
        this.c = z;
        this.d = f0;
    }

    @Override  // com.google.android.datatransport.n
    public final void a(Exception exception0) {
        this.a.n(this.b, this.c, this.d, exception0);
    }
}

