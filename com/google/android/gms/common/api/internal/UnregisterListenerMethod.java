package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk
public abstract class UnregisterListenerMethod {
    private final ListenerKey zaa;

    @KeepForSdk
    protected UnregisterListenerMethod(@NonNull ListenerKey listenerHolder$ListenerKey0) {
        this.zaa = listenerHolder$ListenerKey0;
    }

    @NonNull
    @KeepForSdk
    public ListenerKey getListenerKey() {
        return this.zaa;
    }

    @KeepForSdk
    protected abstract void unregisterListener(@NonNull AnyClient arg1, @NonNull TaskCompletionSource arg2) throws RemoteException;
}

