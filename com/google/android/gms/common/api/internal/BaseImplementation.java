package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Api.AnyClientKey;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
public class BaseImplementation {
    @KeepForSdk
    public static abstract class ApiMethodImpl extends BasePendingResult implements ResultHolder {
        @Nullable
        @KeepForSdk
        private final Api api;
        @KeepForSdk
        private final AnyClientKey clientKey;

        @KeepForSdk
        @Deprecated
        protected ApiMethodImpl(@NonNull AnyClientKey api$AnyClientKey0, @NonNull GoogleApiClient googleApiClient0) {
            super(((GoogleApiClient)Preconditions.checkNotNull(googleApiClient0, "GoogleApiClient must not be null")));
            this.clientKey = (AnyClientKey)Preconditions.checkNotNull(api$AnyClientKey0);
            this.api = null;
        }

        @KeepForSdk
        protected ApiMethodImpl(@NonNull Api api0, @NonNull GoogleApiClient googleApiClient0) {
            super(((GoogleApiClient)Preconditions.checkNotNull(googleApiClient0, "GoogleApiClient must not be null")));
            Preconditions.checkNotNull(api0, "Api must not be null");
            this.clientKey = api0.zab();
            this.api = api0;
        }

        @VisibleForTesting
        @KeepForSdk
        protected ApiMethodImpl(@NonNull CallbackHandler basePendingResult$CallbackHandler0) {
            super(basePendingResult$CallbackHandler0);
            this.clientKey = new AnyClientKey();
            this.api = null;
        }

        @KeepForSdk
        protected abstract void doExecute(@NonNull AnyClient arg1) throws RemoteException;

        @Nullable
        @KeepForSdk
        public final Api getApi() {
            return this.api;
        }

        @NonNull
        @KeepForSdk
        public final AnyClientKey getClientKey() {
            return this.clientKey;
        }

        @KeepForSdk
        protected void onSetFailedResult(@NonNull Result result0) {
        }

        @KeepForSdk
        public final void run(@NonNull AnyClient api$AnyClient0) throws DeadObjectException {
            try {
                this.doExecute(api$AnyClient0);
            }
            catch(DeadObjectException deadObjectException0) {
                this.setFailedResult(deadObjectException0);
                throw deadObjectException0;
            }
            catch(RemoteException remoteException0) {
                this.setFailedResult(remoteException0);
            }
        }

        @KeepForSdk
        private void setFailedResult(@NonNull RemoteException remoteException0) {
            this.setFailedResult(new Status(8, remoteException0.getLocalizedMessage(), null));
        }

        @Override  // com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder
        @KeepForSdk
        public final void setFailedResult(@NonNull Status status0) {
            Preconditions.checkArgument(!status0.isSuccess(), "Failed result must not be success");
            this.setResult(this.createFailedResult(status0));
        }

        @Override  // com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder
        @KeepForSdk
        public void setResult(@NonNull Object object0) {
            super.setResult(((Result)object0));
        }
    }

    @KeepForSdk
    public interface ResultHolder {
        @KeepForSdk
        void setFailedResult(@NonNull Status arg1);

        @KeepForSdk
        void setResult(@NonNull Object arg1);
    }

}

