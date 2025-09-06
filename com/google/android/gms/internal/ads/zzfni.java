package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.Executor;

public final class zzfni {
    public static final int zza = 0;
    private final Context zzb;
    private final Executor zzc;
    private final Task zzd;
    private final boolean zze;
    private static volatile int zzf = 1;

    static {
    }

    public zzfni(@NonNull Context context0, @NonNull Executor executor0, @NonNull Task task0, boolean z) {
        this.zzb = context0;
        this.zzc = executor0;
        this.zzd = task0;
        this.zze = z;
    }

    public static zzfni zza(@NonNull Context context0, @NonNull Executor executor0, boolean z) {
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        if(z) {
            executor0.execute(new zzfng(context0, taskCompletionSource0));
            return new zzfni(context0, executor0, taskCompletionSource0.getTask(), true);
        }
        executor0.execute(new zzfnh(taskCompletionSource0));
        return new zzfni(context0, executor0, taskCompletionSource0.getTask(), false);
    }

    public final Task zzb(int v, String s) {
        return this.zzh(v, 0L, null, null, null, s);
    }

    public final Task zzc(int v, long v1, Exception exception0) {
        return this.zzh(v, v1, exception0, null, null, null);
    }

    public final Task zzd(int v, long v1) {
        return this.zzh(v, v1, null, null, null, null);
    }

    public final Task zze(int v, long v1, String s) {
        return this.zzh(v, v1, null, null, null, s);
    }

    public final Task zzf(int v, long v1, String s, Map map0) {
        return this.zzh(v, v1, null, s, null, null);
    }

    static void zzg(int v) {
        zzfni.zzf = v;
    }

    private final Task zzh(int v, long v1, Exception exception0, String s, Map map0, String s1) {
        if(!this.zze) {
            zzfne zzfne0 = new zzfne();
            return this.zzd.continueWith(this.zzc, zzfne0);
        }
        zzari zzari0 = zzarm.zza();
        zzari0.zza("com.dcinside.app.android");
        zzari0.zze(v1);
        zzari0.zzg(zzfni.zzf);
        if(exception0 != null) {
            StringWriter stringWriter0 = new StringWriter();
            exception0.printStackTrace(new PrintWriter(stringWriter0));
            zzari0.zzf(stringWriter0.toString());
            zzari0.zzd(exception0.getClass().getName());
        }
        if(s1 != null) {
            zzari0.zzb(s1);
        }
        if(s != null) {
            zzari0.zzc(s);
        }
        zzfnf zzfnf0 = new zzfnf(zzari0, v);
        return this.zzd.continueWith(this.zzc, zzfnf0);
    }
}

