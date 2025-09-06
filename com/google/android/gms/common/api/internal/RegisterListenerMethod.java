package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk
public abstract class RegisterListenerMethod {
    private final ListenerHolder zaa;
    @Nullable
    private final Feature[] zab;
    private final boolean zac;
    private final int zad;

    @KeepForSdk
    protected RegisterListenerMethod(@NonNull ListenerHolder listenerHolder0) {
        this(listenerHolder0, null, false, 0);
    }

    @KeepForSdk
    protected RegisterListenerMethod(@NonNull ListenerHolder listenerHolder0, @NonNull Feature[] arr_feature, boolean z) {
        this(listenerHolder0, arr_feature, z, 0);
    }

    @KeepForSdk
    protected RegisterListenerMethod(@NonNull ListenerHolder listenerHolder0, @Nullable Feature[] arr_feature, boolean z, int v) {
        this.zaa = listenerHolder0;
        this.zab = arr_feature;
        this.zac = z;
        this.zad = v;
    }

    @KeepForSdk
    public void clearListener() {
        this.zaa.clear();
    }

    @Nullable
    @KeepForSdk
    public ListenerKey getListenerKey() {
        return this.zaa.getListenerKey();
    }

    @Nullable
    @KeepForSdk
    public Feature[] getRequiredFeatures() {
        return this.zab;
    }

    @KeepForSdk
    protected abstract void registerListener(@NonNull AnyClient arg1, @NonNull TaskCompletionSource arg2) throws RemoteException;

    public final int zaa() {
        return this.zad;
    }

    public final boolean zab() {
        return this.zac;
    }
}

