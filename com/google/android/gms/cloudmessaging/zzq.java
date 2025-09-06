package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import j..util.Objects;

final class zzq {
    @Nullable
    private final Messenger zza;
    @Nullable
    private final zzd zzb;

    zzq(IBinder iBinder0) throws RemoteException {
        String s = iBinder0.getInterfaceDescriptor();
        if(Objects.equals(s, "android.os.IMessenger")) {
            this.zza = new Messenger(iBinder0);
            this.zzb = null;
            return;
        }
        if(Objects.equals(s, "com.google.android.gms.iid.IMessengerCompat")) {
            this.zzb = new zzd(iBinder0);
            this.zza = null;
            return;
        }
        Log.w("MessengerIpcClient", "Invalid interface descriptor: " + s);
        throw new RemoteException();
    }

    final void zza(Message message0) throws RemoteException {
        Messenger messenger0 = this.zza;
        if(messenger0 != null) {
            messenger0.send(message0);
            return;
        }
        zzd zzd0 = this.zzb;
        if(zzd0 == null) {
            throw new IllegalStateException("Both messengers are null");
        }
        zzd0.zzb(message0);
    }
}

