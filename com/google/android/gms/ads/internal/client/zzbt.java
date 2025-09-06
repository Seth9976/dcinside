package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzbfl;
import com.google.android.gms.internal.ads.zzbgt;
import com.google.android.gms.internal.ads.zzbgu;
import com.google.android.gms.internal.ads.zzbgw;
import com.google.android.gms.internal.ads.zzbgx;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzbha;
import com.google.android.gms.internal.ads.zzbhc;
import com.google.android.gms.internal.ads.zzbhd;
import com.google.android.gms.internal.ads.zzbhg;
import com.google.android.gms.internal.ads.zzbhh;
import com.google.android.gms.internal.ads.zzbhj;
import com.google.android.gms.internal.ads.zzbhk;
import com.google.android.gms.internal.ads.zzblz;
import com.google.android.gms.internal.ads.zzbmh;
import com.google.android.gms.internal.ads.zzbmi;

public abstract class zzbt extends zzayb implements zzbu {
    public zzbt() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        zzbl zzbl0 = null;
        switch(v) {
            case 1: {
                zzbr zzbr0 = this.zze();
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzbr0);
                return true;
            }
            case 2: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbl0 = iInterface0 instanceof zzbl ? ((zzbl)iInterface0) : new zzbj(iBinder0);
                }
                zzayc.zzc(parcel0);
                this.zzl(zzbl0);
                parcel1.writeNoException();
                return true;
            }
            case 3: {
                zzbgu zzbgu0 = zzbgt.zzb(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzf(zzbgu0);
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                zzbgx zzbgx0 = zzbgw.zzb(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzg(zzbgx0);
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                String s = parcel0.readString();
                zzbhd zzbhd0 = zzbhc.zzb(parcel0.readStrongBinder());
                zzbha zzbha0 = zzbgz.zzb(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzh(s, zzbhd0, zzbha0);
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                zzbfl zzbfl0 = (zzbfl)zzayc.zza(parcel0, zzbfl.CREATOR);
                zzayc.zzc(parcel0);
                this.zzo(zzbfl0);
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzbl0 = iInterface1 instanceof zzcq ? ((zzcq)iInterface1) : new zzcq(iBinder1);
                }
                zzayc.zzc(parcel0);
                this.zzq(((zzcq)zzbl0));
                parcel1.writeNoException();
                return true;
            }
            case 8: {
                zzbhh zzbhh0 = zzbhg.zzb(parcel0.readStrongBinder());
                zzs zzs0 = (zzs)zzayc.zza(parcel0, zzs.CREATOR);
                zzayc.zzc(parcel0);
                this.zzj(zzbhh0, zzs0);
                parcel1.writeNoException();
                return true;
            }
            case 9: {
                PublisherAdViewOptions publisherAdViewOptions0 = (PublisherAdViewOptions)zzayc.zza(parcel0, PublisherAdViewOptions.CREATOR);
                zzayc.zzc(parcel0);
                this.zzp(publisherAdViewOptions0);
                parcel1.writeNoException();
                return true;
            }
            case 10: {
                zzbhk zzbhk0 = zzbhj.zzb(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzk(zzbhk0);
                parcel1.writeNoException();
                return true;
            }
            case 13: {
                zzblz zzblz0 = (zzblz)zzayc.zza(parcel0, zzblz.CREATOR);
                zzayc.zzc(parcel0);
                this.zzn(zzblz0);
                parcel1.writeNoException();
                return true;
            }
            case 14: {
                zzbmi zzbmi0 = zzbmh.zzb(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzi(zzbmi0);
                parcel1.writeNoException();
                return true;
            }
            case 15: {
                AdManagerAdViewOptions adManagerAdViewOptions0 = (AdManagerAdViewOptions)zzayc.zza(parcel0, AdManagerAdViewOptions.CREATOR);
                zzayc.zzc(parcel0);
                this.zzm(adManagerAdViewOptions0);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

