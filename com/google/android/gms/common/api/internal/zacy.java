package com.google.android.gms.common.api.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.internal.Preconditions;

final class zacy implements Runnable {
    final Result zaa;
    final zada zab;

    zacy(zada zada0, Result result0) {
        this.zab = zada0;
        this.zaa = result0;
        super();
    }

    @Override
    @WorkerThread
    public final void run() {
        try {
            try {
                BasePendingResult.zaa.set(Boolean.TRUE);
                PendingResult pendingResult0 = ((ResultTransform)Preconditions.checkNotNull(this.zab.zaa)).onSuccess(this.zaa);
                this.zab.zah.sendMessage(this.zab.zah.obtainMessage(0, pendingResult0));
                goto label_18;
            }
            catch(RuntimeException runtimeException0) {
            }
            this.zab.zah.sendMessage(this.zab.zah.obtainMessage(1, runtimeException0));
        }
        catch(Throwable throwable0) {
            goto label_12;
        }
        BasePendingResult.zaa.set(Boolean.FALSE);
        zada.zaf(this.zab, this.zaa);
        GoogleApiClient googleApiClient0 = (GoogleApiClient)this.zab.zag.get();
        if(googleApiClient0 != null) {
            googleApiClient0.zap(this.zab);
            return;
        }
        return;
    label_12:
        BasePendingResult.zaa.set(Boolean.FALSE);
        zada.zaf(this.zab, this.zaa);
        GoogleApiClient googleApiClient1 = (GoogleApiClient)this.zab.zag.get();
        if(googleApiClient1 != null) {
            googleApiClient1.zap(this.zab);
        }
        throw throwable0;
    label_18:
        BasePendingResult.zaa.set(Boolean.FALSE);
        zada.zaf(this.zab, this.zaa);
        googleApiClient0 = (GoogleApiClient)this.zab.zag.get();
        if(googleApiClient0 != null) {
            googleApiClient0.zap(this.zab);
        }
    }
}

