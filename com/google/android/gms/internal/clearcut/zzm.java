package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.clearcut.zze;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

public abstract class zzm extends zzb implements zzl {
    public zzm() {
        super("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    @Override  // com.google.android.gms.internal.clearcut.zzb
    protected final boolean dispatchTransaction(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        switch(v) {
            case 1: {
                this.zza(((Status)zzc.zza(parcel0, Status.CREATOR)));
                return true;
            }
            case 2: {
                this.zzb(((Status)zzc.zza(parcel0, Status.CREATOR)));
                return true;
            }
            case 3: {
                this.zza(((Status)zzc.zza(parcel0, Status.CREATOR)), parcel0.readLong());
                return true;
            }
            case 4: {
                this.zzc(((Status)zzc.zza(parcel0, Status.CREATOR)));
                return true;
            }
            case 5: {
                this.zzb(((Status)zzc.zza(parcel0, Status.CREATOR)), parcel0.readLong());
                return true;
            }
            case 6: {
                this.zza(((Status)zzc.zza(parcel0, Status.CREATOR)), ((zze[])parcel0.createTypedArray(zze.CREATOR)));
                return true;
            }
            case 7: {
                this.zza(((DataHolder)zzc.zza(parcel0, DataHolder.CREATOR)));
                return true;
            }
            case 8: {
                this.zza(((Status)zzc.zza(parcel0, Status.CREATOR)), ((com.google.android.gms.clearcut.zzc)zzc.zza(parcel0, com.google.android.gms.clearcut.zzc.CREATOR)));
                return true;
            }
            case 9: {
                this.zzb(((Status)zzc.zza(parcel0, Status.CREATOR)), ((com.google.android.gms.clearcut.zzc)zzc.zza(parcel0, com.google.android.gms.clearcut.zzc.CREATOR)));
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

