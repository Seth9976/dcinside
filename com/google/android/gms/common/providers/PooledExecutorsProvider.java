package com.google.android.gms.common.providers;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.ScheduledExecutorService;

@KeepForSdk
@Deprecated
public class PooledExecutorsProvider {
    public interface PooledExecutorFactory {
        @NonNull
        @KeepForSdk
        @Deprecated
        ScheduledExecutorService newSingleThreadScheduledExecutor();
    }

    private static PooledExecutorFactory zza;

    @NonNull
    @KeepForSdk
    @Deprecated
    public static PooledExecutorFactory getInstance() {
        synchronized(PooledExecutorsProvider.class) {
            if(PooledExecutorsProvider.zza == null) {
                PooledExecutorsProvider.zza = new zza();
            }
            return PooledExecutorsProvider.zza;
        }
    }
}

