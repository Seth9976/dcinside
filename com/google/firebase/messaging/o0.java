package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final class o0 implements OnCompleteListener {
    public final Intent a;

    public o0(Intent intent0) {
        this.a = intent0;
    }

    @Override  // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task0) {
        p0.g(this.a, task0);
    }
}

