package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

final class zacx implements Continuation {
    @Override  // com.google.android.gms.tasks.Continuation
    public final Object then(@NonNull Task task0) throws Exception {
        if(!((Boolean)task0.getResult()).booleanValue()) {
            throw new ApiException(new Status(13, "listener already unregistered"));
        }
        return null;
    }
}

