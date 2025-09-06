package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
public abstract class RemoteCreator {
    @KeepForSdk
    public static class RemoteCreatorException extends Exception {
        @KeepForSdk
        public RemoteCreatorException(@NonNull String s) {
            super(s);
        }

        @KeepForSdk
        public RemoteCreatorException(@NonNull String s, @NonNull Throwable throwable0) {
            super(s, throwable0);
        }
    }

    private final String zza;
    private Object zzb;

    @KeepForSdk
    protected RemoteCreator(@NonNull String s) {
        this.zza = s;
    }

    @NonNull
    @KeepForSdk
    protected abstract Object getRemoteCreator(@NonNull IBinder arg1);

    @NonNull
    @KeepForSdk
    protected final Object getRemoteCreatorInstance(@NonNull Context context0) throws RemoteCreatorException {
        if(this.zzb == null) {
            Preconditions.checkNotNull(context0);
            Context context1 = GooglePlayServicesUtilLight.getRemoteContext(context0);
            if(context1 != null) {
                ClassLoader classLoader0 = context1.getClassLoader();
                try {
                    this.zzb = this.getRemoteCreator(((IBinder)classLoader0.loadClass(this.zza).newInstance()));
                    return this.zzb;
                }
                catch(ClassNotFoundException classNotFoundException0) {
                    throw new RemoteCreatorException("Could not load creator class.", classNotFoundException0);
                }
                catch(InstantiationException instantiationException0) {
                    throw new RemoteCreatorException("Could not instantiate creator.", instantiationException0);
                }
                catch(IllegalAccessException illegalAccessException0) {
                    throw new RemoteCreatorException("Could not access creator.", illegalAccessException0);
                }
            }
            throw new RemoteCreatorException("Could not get remote context.");
        }
        return this.zzb;
    }
}

