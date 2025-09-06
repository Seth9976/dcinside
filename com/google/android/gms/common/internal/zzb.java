package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.common.zzh;

final class zzb extends zzh {
    final BaseGmsClient zza;

    public zzb(BaseGmsClient baseGmsClient0, Looper looper0) {
        this.zza = baseGmsClient0;
        super(looper0);
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        if(this.zza.zzd.get() != message0.arg1) {
            if(zzb.zzb(message0)) {
                zzb.zza(message0);
            }
            return;
        }
        if(message0.what != 1 && message0.what != 4 && message0.what != 7 && message0.what != 5 || this.zza.isConnecting()) {
            PendingIntent pendingIntent0 = null;
            switch(message0.what) {
                case 2: {
                    if(!this.zza.isConnected()) {
                        zzb.zza(message0);
                        return;
                    }
                    break;
                }
                case 3: {
                    Object object0 = message0.obj;
                    if(object0 instanceof PendingIntent) {
                        pendingIntent0 = (PendingIntent)object0;
                    }
                    ConnectionResult connectionResult3 = new ConnectionResult(message0.arg2, pendingIntent0);
                    this.zza.zzc.onReportServiceBinding(connectionResult3);
                    this.zza.onConnectionFailed(connectionResult3);
                    return;
                }
                case 4: {
                    ConnectionResult connectionResult0 = new ConnectionResult(message0.arg2);
                    this.zza.zzC = connectionResult0;
                    if(BaseGmsClient.zzo(this.zza)) {
                        BaseGmsClient baseGmsClient0 = this.zza;
                        if(!baseGmsClient0.zzD) {
                            BaseGmsClient.zzi(baseGmsClient0, 3, null);
                            return;
                        }
                    }
                    ConnectionResult connectionResult1 = this.zza.zzC == null ? new ConnectionResult(8) : this.zza.zzC;
                    this.zza.zzc.onReportServiceBinding(connectionResult1);
                    this.zza.onConnectionFailed(connectionResult1);
                    return;
                }
                case 5: {
                    ConnectionResult connectionResult2 = this.zza.zzC == null ? new ConnectionResult(8) : this.zza.zzC;
                    this.zza.zzc.onReportServiceBinding(connectionResult2);
                    this.zza.onConnectionFailed(connectionResult2);
                    return;
                }
                case 6: {
                    BaseGmsClient.zzi(this.zza, 5, null);
                    BaseGmsClient baseGmsClient1 = this.zza;
                    if(baseGmsClient1.zzw != null) {
                        baseGmsClient1.zzw.onConnectionSuspended(message0.arg2);
                    }
                    this.zza.onConnectionSuspended(message0.arg2);
                    BaseGmsClient.zzn(this.zza, 5, 1, null);
                    return;
                }
            }
            if(zzb.zzb(message0)) {
                ((zzc)message0.obj).zze();
                return;
            }
            Log.wtf("GmsClient", "Don\'t know how to handle message: " + message0.what, new Exception());
            return;
        }
        zzb.zza(message0);
    }

    private static final void zza(Message message0) {
        zzc zzc0 = (zzc)message0.obj;
        zzc0.zzc();
        zzc0.zzg();
    }

    private static final boolean zzb(Message message0) {
        return message0.what == 1 || message0.what == 2 || message0.what == 7;
    }
}

