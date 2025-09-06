package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zaac implements OnCompleteListener {
    final TaskCompletionSource zaa;
    final zaad zab;

    zaac(zaad zaad0, TaskCompletionSource taskCompletionSource0) {
        this.zab = zaad0;
        this.zaa = taskCompletionSource0;
        super();
    }

    @Override  // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(@NonNull Task task0) {
        this.zab.zab.remove(this.zaa);
    }
}

