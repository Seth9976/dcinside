package com.google.firebase.remoteconfig.internal.rollouts;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.h;
import com.google.firebase.remoteconfig.interop.rollouts.f;

public final class b implements OnSuccessListener {
    public final e a;
    public final Task b;
    public final f c;

    public b(e e0, Task task0, f f0) {
        this.a = e0;
        this.b = task0;
        this.c = f0;
    }

    @Override  // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object object0) {
        this.a.f(this.b, this.c, ((h)object0));
    }
}

