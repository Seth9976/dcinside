package com.google.android.gms.common.api.internal;

import O1.a;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
public class RegistrationMethods {
    @KeepForSdk
    public static class Builder {
        private RemoteCall zaa;
        private RemoteCall zab;
        private Runnable zac;
        private ListenerHolder zad;
        private Feature[] zae;
        private boolean zaf;
        private int zag;

        private Builder() {
            this.zac = zacj.zaa;
            this.zaf = true;
        }

        Builder(zacm zacm0) {
            this.zac = zacj.zaa;
            this.zaf = true;
        }

        @NonNull
        @KeepForSdk
        public RegistrationMethods build() {
            boolean z = false;
            Preconditions.checkArgument(this.zaa != null, "Must set register function");
            Preconditions.checkArgument(this.zab != null, "Must set unregister function");
            if(this.zad != null) {
                z = true;
            }
            Preconditions.checkArgument(z, "Must set holder");
            ListenerKey listenerHolder$ListenerKey0 = (ListenerKey)Preconditions.checkNotNull(this.zad.getListenerKey(), "Key must not be null");
            return new RegistrationMethods(new zack(this, this.zad, this.zae, this.zaf, this.zag), new zacl(this, listenerHolder$ListenerKey0), this.zac, null);
        }

        @a
        @NonNull
        @KeepForSdk
        public Builder onConnectionSuspended(@NonNull Runnable runnable0) {
            this.zac = runnable0;
            return this;
        }

        @a
        @NonNull
        @KeepForSdk
        public Builder register(@NonNull RemoteCall remoteCall0) {
            this.zaa = remoteCall0;
            return this;
        }

        @a
        @NonNull
        @KeepForSdk
        public Builder setAutoResolveMissingFeatures(boolean z) {
            this.zaf = z;
            return this;
        }

        @a
        @NonNull
        @KeepForSdk
        public Builder setFeatures(@NonNull Feature[] arr_feature) {
            this.zae = arr_feature;
            return this;
        }

        @a
        @NonNull
        @KeepForSdk
        public Builder setMethodKey(int v) {
            this.zag = v;
            return this;
        }

        @a
        @NonNull
        @KeepForSdk
        public Builder unregister(@NonNull RemoteCall remoteCall0) {
            this.zab = remoteCall0;
            return this;
        }

        @a
        @NonNull
        @KeepForSdk
        public Builder withHolder(@NonNull ListenerHolder listenerHolder0) {
            this.zad = listenerHolder0;
            return this;
        }
    }

    @NonNull
    @KeepForSdk
    public final RegisterListenerMethod register;
    @NonNull
    public final UnregisterListenerMethod zaa;
    @NonNull
    public final Runnable zab;

    RegistrationMethods(RegisterListenerMethod registerListenerMethod0, UnregisterListenerMethod unregisterListenerMethod0, Runnable runnable0, zacn zacn0) {
        this.register = registerListenerMethod0;
        this.zaa = unregisterListenerMethod0;
        this.zab = runnable0;
    }

    @NonNull
    @KeepForSdk
    public static Builder builder() {
        return new Builder(null);
    }
}

