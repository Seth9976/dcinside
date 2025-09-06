package com.google.android.gms.tasks;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

final class zzw extends Task {
    private final Object zza;
    private final zzr zzb;
    private boolean zzc;
    private volatile boolean zzd;
    @Nullable
    private Object zze;
    private Exception zzf;

    zzw() {
        this.zza = new Object();
        this.zzb = new zzr();
    }

    @Override  // com.google.android.gms.tasks.Task
    @NonNull
    public final Task addOnCanceledListener(@NonNull Activity activity0, @NonNull OnCanceledListener onCanceledListener0) {
        zzh zzh0 = new zzh(TaskExecutors.MAIN_THREAD, onCanceledListener0);
        this.zzb.zza(zzh0);
        zzv.zza(activity0).zzb(zzh0);
        this.zzi();
        return this;
    }

    @Override  // com.google.android.gms.tasks.Task
    @NonNull
    public final Task addOnCanceledListener(@NonNull OnCanceledListener onCanceledListener0) {
        this.addOnCanceledListener(TaskExecutors.MAIN_THREAD, onCanceledListener0);
        return this;
    }

    @Override  // com.google.android.gms.tasks.Task
    @NonNull
    public final Task addOnCanceledListener(@NonNull Executor executor0, @NonNull OnCanceledListener onCanceledListener0) {
        zzh zzh0 = new zzh(executor0, onCanceledListener0);
        this.zzb.zza(zzh0);
        this.zzi();
        return this;
    }

    @Override  // com.google.android.gms.tasks.Task
    @NonNull
    public final Task addOnCompleteListener(@NonNull Activity activity0, @NonNull OnCompleteListener onCompleteListener0) {
        zzj zzj0 = new zzj(TaskExecutors.MAIN_THREAD, onCompleteListener0);
        this.zzb.zza(zzj0);
        zzv.zza(activity0).zzb(zzj0);
        this.zzi();
        return this;
    }

    @Override  // com.google.android.gms.tasks.Task
    @NonNull
    public final Task addOnCompleteListener(@NonNull OnCompleteListener onCompleteListener0) {
        zzj zzj0 = new zzj(TaskExecutors.MAIN_THREAD, onCompleteListener0);
        this.zzb.zza(zzj0);
        this.zzi();
        return this;
    }

    @Override  // com.google.android.gms.tasks.Task
    @NonNull
    public final Task addOnCompleteListener(@NonNull Executor executor0, @NonNull OnCompleteListener onCompleteListener0) {
        zzj zzj0 = new zzj(executor0, onCompleteListener0);
        this.zzb.zza(zzj0);
        this.zzi();
        return this;
    }

    @Override  // com.google.android.gms.tasks.Task
    @NonNull
    public final Task addOnFailureListener(@NonNull Activity activity0, @NonNull OnFailureListener onFailureListener0) {
        zzl zzl0 = new zzl(TaskExecutors.MAIN_THREAD, onFailureListener0);
        this.zzb.zza(zzl0);
        zzv.zza(activity0).zzb(zzl0);
        this.zzi();
        return this;
    }

    @Override  // com.google.android.gms.tasks.Task
    @NonNull
    public final Task addOnFailureListener(@NonNull OnFailureListener onFailureListener0) {
        this.addOnFailureListener(TaskExecutors.MAIN_THREAD, onFailureListener0);
        return this;
    }

    @Override  // com.google.android.gms.tasks.Task
    @NonNull
    public final Task addOnFailureListener(@NonNull Executor executor0, @NonNull OnFailureListener onFailureListener0) {
        zzl zzl0 = new zzl(executor0, onFailureListener0);
        this.zzb.zza(zzl0);
        this.zzi();
        return this;
    }

    @Override  // com.google.android.gms.tasks.Task
    @NonNull
    public final Task addOnSuccessListener(@NonNull Activity activity0, @NonNull OnSuccessListener onSuccessListener0) {
        zzn zzn0 = new zzn(TaskExecutors.MAIN_THREAD, onSuccessListener0);
        this.zzb.zza(zzn0);
        zzv.zza(activity0).zzb(zzn0);
        this.zzi();
        return this;
    }

    @Override  // com.google.android.gms.tasks.Task
    @NonNull
    public final Task addOnSuccessListener(@NonNull OnSuccessListener onSuccessListener0) {
        this.addOnSuccessListener(TaskExecutors.MAIN_THREAD, onSuccessListener0);
        return this;
    }

    @Override  // com.google.android.gms.tasks.Task
    @NonNull
    public final Task addOnSuccessListener(@NonNull Executor executor0, @NonNull OnSuccessListener onSuccessListener0) {
        zzn zzn0 = new zzn(executor0, onSuccessListener0);
        this.zzb.zza(zzn0);
        this.zzi();
        return this;
    }

    @Override  // com.google.android.gms.tasks.Task
    @NonNull
    public final Task continueWith(@NonNull Continuation continuation0) {
        return this.continueWith(TaskExecutors.MAIN_THREAD, continuation0);
    }

    @Override  // com.google.android.gms.tasks.Task
    @NonNull
    public final Task continueWith(@NonNull Executor executor0, @NonNull Continuation continuation0) {
        Task task0 = new zzw();
        zzd zzd0 = new zzd(executor0, continuation0, ((zzw)task0));
        this.zzb.zza(zzd0);
        this.zzi();
        return task0;
    }

    @Override  // com.google.android.gms.tasks.Task
    @NonNull
    public final Task continueWithTask(@NonNull Continuation continuation0) {
        return this.continueWithTask(TaskExecutors.MAIN_THREAD, continuation0);
    }

    @Override  // com.google.android.gms.tasks.Task
    @NonNull
    public final Task continueWithTask(@NonNull Executor executor0, @NonNull Continuation continuation0) {
        Task task0 = new zzw();
        zzf zzf0 = new zzf(executor0, continuation0, ((zzw)task0));
        this.zzb.zza(zzf0);
        this.zzi();
        return task0;
    }

    @Override  // com.google.android.gms.tasks.Task
    @Nullable
    public final Exception getException() {
        synchronized(this.zza) {
        }
        return this.zzf;
    }

    @Override  // com.google.android.gms.tasks.Task
    public final Object getResult() {
        Exception exception0;
        synchronized(this.zza) {
            this.zzf();
            this.zzg();
            exception0 = this.zzf;
            if(exception0 == null) {
                return this.zze;
            }
        }
        throw new RuntimeExecutionException(exception0);
    }

    @Override  // com.google.android.gms.tasks.Task
    public final Object getResult(@NonNull Class class0) throws Throwable {
        synchronized(this.zza) {
            this.zzf();
            this.zzg();
            if(!class0.isInstance(this.zzf)) {
                Exception exception0 = this.zzf;
                if(exception0 != null) {
                    throw new RuntimeExecutionException(exception0);
                }
                return this.zze;
            }
        }
        throw (Throwable)class0.cast(this.zzf);
    }

    @Override  // com.google.android.gms.tasks.Task
    public final boolean isCanceled() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.tasks.Task
    public final boolean isComplete() {
        synchronized(this.zza) {
        }
        return this.zzc;
    }

    @Override  // com.google.android.gms.tasks.Task
    public final boolean isSuccessful() {
        boolean z = false;
        synchronized(this.zza) {
            if(this.zzc && !this.zzd && this.zzf == null) {
                z = true;
            }
        }
        return z;
    }

    @Override  // com.google.android.gms.tasks.Task
    @NonNull
    public final Task onSuccessTask(@NonNull SuccessContinuation successContinuation0) {
        Task task0 = new zzw();
        zzp zzp0 = new zzp(TaskExecutors.MAIN_THREAD, successContinuation0, ((zzw)task0));
        this.zzb.zza(zzp0);
        this.zzi();
        return task0;
    }

    @Override  // com.google.android.gms.tasks.Task
    @NonNull
    public final Task onSuccessTask(Executor executor0, SuccessContinuation successContinuation0) {
        Task task0 = new zzw();
        zzp zzp0 = new zzp(executor0, successContinuation0, ((zzw)task0));
        this.zzb.zza(zzp0);
        this.zzi();
        return task0;
    }

    public final void zza(@NonNull Exception exception0) {
        Preconditions.checkNotNull(exception0, "Exception must not be null");
        synchronized(this.zza) {
            this.zzh();
            this.zzc = true;
            this.zzf = exception0;
        }
        this.zzb.zzb(this);
    }

    public final void zzb(@Nullable Object object0) {
        synchronized(this.zza) {
            this.zzh();
            this.zzc = true;
            this.zze = object0;
        }
        this.zzb.zzb(this);
    }

    public final boolean zzc() {
        synchronized(this.zza) {
            if(this.zzc) {
                return false;
            }
            this.zzc = true;
            this.zzd = true;
        }
        this.zzb.zzb(this);
        return true;
    }

    public final boolean zzd(@NonNull Exception exception0) {
        Preconditions.checkNotNull(exception0, "Exception must not be null");
        synchronized(this.zza) {
            if(this.zzc) {
                return false;
            }
            this.zzc = true;
            this.zzf = exception0;
        }
        this.zzb.zzb(this);
        return true;
    }

    public final boolean zze(@Nullable Object object0) {
        synchronized(this.zza) {
            if(this.zzc) {
                return false;
            }
            this.zzc = true;
            this.zze = object0;
        }
        this.zzb.zzb(this);
        return true;
    }

    private final void zzf() {
        Preconditions.checkState(this.zzc, "Task is not yet complete");
    }

    private final void zzg() {
        if(this.zzd) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void zzh() {
        if(this.zzc) {
            throw DuplicateTaskCompletionException.of(this);
        }
    }

    private final void zzi() {
        synchronized(this.zza) {
            if(!this.zzc) {
                return;
            }
        }
        this.zzb.zzb(this);
    }
}

