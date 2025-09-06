package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

final class zzp implements OnCanceledListener, OnFailureListener, OnSuccessListener, zzq {
    private final Executor zza;
    private final SuccessContinuation zzb;
    private final zzw zzc;

    public zzp(@NonNull Executor executor0, @NonNull SuccessContinuation successContinuation0, @NonNull zzw zzw0) {
        this.zza = executor0;
        this.zzb = successContinuation0;
        this.zzc = zzw0;
    }

    @Override  // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        this.zzc.zzc();
    }

    @Override  // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(@NonNull Exception exception0) {
        this.zzc.zza(exception0);
    }

    @Override  // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object object0) {
        this.zzc.zzb(object0);
    }

    @Override  // com.google.android.gms.tasks.zzq
    public final void zzc() {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.android.gms.tasks.zzq
    public final void zzd(@NonNull Task task0) {
        zzo zzo0 = new zzo(this, task0);
        this.zza.execute(zzo0);
    }
}

