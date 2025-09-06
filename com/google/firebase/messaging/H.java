package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final class h implements OnCompleteListener {
    public final j a;
    public final Intent b;

    public h(j j0, Intent intent0) {
        this.a = j0;
        this.b = intent0;
    }

    @Override  // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task0) {
        this.a.h(this.b, task0);
    }
}

