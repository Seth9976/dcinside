package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzbw;
import com.google.android.gms.internal.measurement.zzbx;
import java.util.List;

public abstract class zzge extends zzbx implements zzgb {
    public zzge() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override  // com.google.android.gms.internal.measurement.zzbx
    protected final boolean zza(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        switch(v) {
            case 1: {
                zzbf zzbf0 = (zzbf)zzbw.zza(parcel0, zzbf.CREATOR);
                zzo zzo0 = (zzo)zzbw.zza(parcel0, zzo.CREATOR);
                zzbw.zzb(parcel0);
                this.zza(zzbf0, zzo0);
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                zzon zzon0 = (zzon)zzbw.zza(parcel0, zzon.CREATOR);
                zzo zzo1 = (zzo)zzbw.zza(parcel0, zzo.CREATOR);
                zzbw.zzb(parcel0);
                this.zza(zzon0, zzo1);
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                zzo zzo2 = (zzo)zzbw.zza(parcel0, zzo.CREATOR);
                zzbw.zzb(parcel0);
                this.zzd(zzo2);
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                zzbf zzbf1 = (zzbf)zzbw.zza(parcel0, zzbf.CREATOR);
                String s = parcel0.readString();
                String s1 = parcel0.readString();
                zzbw.zzb(parcel0);
                this.zza(zzbf1, s, s1);
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                zzo zzo3 = (zzo)zzbw.zza(parcel0, zzo.CREATOR);
                zzbw.zzb(parcel0);
                this.zzh(zzo3);
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                zzo zzo4 = (zzo)zzbw.zza(parcel0, zzo.CREATOR);
                boolean z = zzbw.zzc(parcel0);
                zzbw.zzb(parcel0);
                List list0 = this.zza(zzo4, z);
                parcel1.writeNoException();
                parcel1.writeTypedList(list0);
                return true;
            }
            case 9: {
                zzbf zzbf2 = (zzbf)zzbw.zza(parcel0, zzbf.CREATOR);
                String s2 = parcel0.readString();
                zzbw.zzb(parcel0);
                byte[] arr_b = this.zza(zzbf2, s2);
                parcel1.writeNoException();
                parcel1.writeByteArray(arr_b);
                return true;
            }
            case 10: {
                long v2 = parcel0.readLong();
                String s3 = parcel0.readString();
                String s4 = parcel0.readString();
                String s5 = parcel0.readString();
                zzbw.zzb(parcel0);
                this.zza(v2, s3, s4, s5);
                parcel1.writeNoException();
                return true;
            }
            case 11: {
                zzo zzo5 = (zzo)zzbw.zza(parcel0, zzo.CREATOR);
                zzbw.zzb(parcel0);
                String s6 = this.zzb(zzo5);
                parcel1.writeNoException();
                parcel1.writeString(s6);
                return true;
            }
            case 12: {
                zzae zzae0 = (zzae)zzbw.zza(parcel0, zzae.CREATOR);
                zzo zzo6 = (zzo)zzbw.zza(parcel0, zzo.CREATOR);
                zzbw.zzb(parcel0);
                this.zza(zzae0, zzo6);
                parcel1.writeNoException();
                return true;
            }
            case 13: {
                zzae zzae1 = (zzae)zzbw.zza(parcel0, zzae.CREATOR);
                zzbw.zzb(parcel0);
                this.zza(zzae1);
                parcel1.writeNoException();
                return true;
            }
            case 14: {
                String s7 = parcel0.readString();
                String s8 = parcel0.readString();
                boolean z1 = zzbw.zzc(parcel0);
                zzo zzo7 = (zzo)zzbw.zza(parcel0, zzo.CREATOR);
                zzbw.zzb(parcel0);
                List list1 = this.zza(s7, s8, z1, zzo7);
                parcel1.writeNoException();
                parcel1.writeTypedList(list1);
                return true;
            }
            case 15: {
                String s9 = parcel0.readString();
                String s10 = parcel0.readString();
                String s11 = parcel0.readString();
                boolean z2 = zzbw.zzc(parcel0);
                zzbw.zzb(parcel0);
                List list2 = this.zza(s9, s10, s11, z2);
                parcel1.writeNoException();
                parcel1.writeTypedList(list2);
                return true;
            }
            case 16: {
                String s12 = parcel0.readString();
                String s13 = parcel0.readString();
                zzo zzo8 = (zzo)zzbw.zza(parcel0, zzo.CREATOR);
                zzbw.zzb(parcel0);
                List list3 = this.zza(s12, s13, zzo8);
                parcel1.writeNoException();
                parcel1.writeTypedList(list3);
                return true;
            }
            case 17: {
                String s14 = parcel0.readString();
                String s15 = parcel0.readString();
                String s16 = parcel0.readString();
                zzbw.zzb(parcel0);
                List list4 = this.zza(s14, s15, s16);
                parcel1.writeNoException();
                parcel1.writeTypedList(list4);
                return true;
            }
            case 18: {
                zzo zzo9 = (zzo)zzbw.zza(parcel0, zzo.CREATOR);
                zzbw.zzb(parcel0);
                this.zze(zzo9);
                parcel1.writeNoException();
                return true;
            }
            case 19: {
                Bundle bundle0 = (Bundle)zzbw.zza(parcel0, Bundle.CREATOR);
                zzo zzo10 = (zzo)zzbw.zza(parcel0, zzo.CREATOR);
                zzbw.zzb(parcel0);
                this.zza(bundle0, zzo10);
                parcel1.writeNoException();
                return true;
            }
            case 20: {
                zzo zzo11 = (zzo)zzbw.zza(parcel0, zzo.CREATOR);
                zzbw.zzb(parcel0);
                this.zzf(zzo11);
                parcel1.writeNoException();
                return true;
            }
            case 21: {
                zzo zzo12 = (zzo)zzbw.zza(parcel0, zzo.CREATOR);
                zzbw.zzb(parcel0);
                zzaj zzaj0 = this.zza(zzo12);
                parcel1.writeNoException();
                zzbw.zzb(parcel1, zzaj0);
                return true;
            }
            case 24: {
                zzo zzo13 = (zzo)zzbw.zza(parcel0, zzo.CREATOR);
                Bundle bundle1 = (Bundle)zzbw.zza(parcel0, Bundle.CREATOR);
                zzbw.zzb(parcel0);
                List list5 = this.zza(zzo13, bundle1);
                parcel1.writeNoException();
                parcel1.writeTypedList(list5);
                return true;
            }
            case 25: {
                zzo zzo14 = (zzo)zzbw.zza(parcel0, zzo.CREATOR);
                zzbw.zzb(parcel0);
                this.zzi(zzo14);
                parcel1.writeNoException();
                return true;
            }
            case 26: {
                zzo zzo15 = (zzo)zzbw.zza(parcel0, zzo.CREATOR);
                zzbw.zzb(parcel0);
                this.zzg(zzo15);
                parcel1.writeNoException();
                return true;
            }
            case 27: {
                zzo zzo16 = (zzo)zzbw.zza(parcel0, zzo.CREATOR);
                zzbw.zzb(parcel0);
                this.zzc(zzo16);
                parcel1.writeNoException();
                return true;
            }
            case 28: {
                Bundle bundle2 = (Bundle)zzbw.zza(parcel0, Bundle.CREATOR);
                zzo zzo17 = (zzo)zzbw.zza(parcel0, zzo.CREATOR);
                zzbw.zzb(parcel0);
                this.zzb(bundle2, zzo17);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

