package com.google.android.gms.common.api.internal;

import O1.a;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk
public abstract class TaskApiCall {
    @KeepForSdk
    public static class Builder {
        private RemoteCall zaa;
        private boolean zab;
        private Feature[] zac;
        private int zad;

        private Builder() {
            this.zab = true;
            this.zad = 0;
        }

        Builder(zacw zacw0) {
            this.zab = true;
            this.zad = 0;
        }

        @NonNull
        @KeepForSdk
        public TaskApiCall build() {
            Preconditions.checkArgument(this.zaa != null, "execute parameter required");
            return new zacv(this, this.zac, this.zab, this.zad);
        }

        @a
        @NonNull
        @KeepForSdk
        @Deprecated
        public Builder execute(@NonNull BiConsumer biConsumer0) {
            this.zaa = new zacu(biConsumer0);
            return this;
        }

        @a
        @NonNull
        @KeepForSdk
        public Builder run(@NonNull RemoteCall remoteCall0) {
            this.zaa = remoteCall0;
            return this;
        }

        @a
        @NonNull
        @KeepForSdk
        public Builder setAutoResolveMissingFeatures(boolean z) {
            this.zab = z;
            return this;
        }

        @a
        @NonNull
        @KeepForSdk
        public Builder setFeatures(@NonNull Feature[] arr_feature) {
            this.zac = arr_feature;
            return this;
        }

        @a
        @NonNull
        @KeepForSdk
        public Builder setMethodKey(int v) {
            this.zad = v;
            return this;
        }
    }

    @Nullable
    private final Feature[] zaa;
    private final boolean zab;
    private final int zac;

    @KeepForSdk
    @Deprecated
    public TaskApiCall() {
        this.zaa = null;
        this.zab = false;
        this.zac = 0;
    }

    @KeepForSdk
    protected TaskApiCall(@Nullable Feature[] arr_feature, boolean z, int v) {
        this.zaa = arr_feature;
        this.zab = arr_feature != null && z;
        this.zac = v;
    }

    @NonNull
    @KeepForSdk
    public static Builder builder() {
        return new Builder(null);
    }

    @KeepForSdk
    protected abstract void doExecute(@NonNull AnyClient arg1, @NonNull TaskCompletionSource arg2) throws RemoteException;

    @KeepForSdk
    public boolean shouldAutoResolveMissingFeatures() {
        return this.zab;
    }

    public final int zaa() {
        return this.zac;
    }

    @Nullable
    public final Feature[] zab() {
        return this.zaa;
    }
}

