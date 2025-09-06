package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzbux extends zzayb implements zzbuy {
    public zzbux() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        zzbvc zzbvc0 = null;
        switch(v) {
            case 1: {
                zzbuq zzbuq0 = (zzbuq)zzayc.zza(parcel0, zzbuq.CREATOR);
                zzayc.zzc(parcel0);
                parcel1.writeNoException();
                zzayc.zze(parcel1, null);
                return true;
            }
            case 2: {
                zzbuq zzbuq1 = (zzbuq)zzayc.zza(parcel0, zzbuq.CREATOR);
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if(iInterface0 instanceof zzbuz) {
                        zzbuz zzbuz0 = (zzbuz)iInterface0;
                    }
                }
                zzayc.zzc(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                zzbvk zzbvk0 = (zzbvk)zzayc.zza(parcel0, zzbvk.CREATOR);
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbvc0 = iInterface1 instanceof zzbvc ? ((zzbvc)iInterface1) : new zzbva(iBinder1);
                }
                zzayc.zzc(parcel0);
                this.zzg(zzbvk0, zzbvc0);
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                zzbvk zzbvk1 = (zzbvk)zzayc.zza(parcel0, zzbvk.CREATOR);
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbvc0 = iInterface2 instanceof zzbvc ? ((zzbvc)iInterface2) : new zzbva(iBinder2);
                }
                zzayc.zzc(parcel0);
                this.zzf(zzbvk1, zzbvc0);
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                zzbvk zzbvk2 = (zzbvk)zzayc.zza(parcel0, zzbvk.CREATOR);
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbvc0 = iInterface3 instanceof zzbvc ? ((zzbvc)iInterface3) : new zzbva(iBinder3);
                }
                zzayc.zzc(parcel0);
                this.zze(zzbvk2, zzbvc0);
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                String s = parcel0.readString();
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbvc0 = iInterface4 instanceof zzbvc ? ((zzbvc)iInterface4) : new zzbva(iBinder4);
                }
                zzayc.zzc(parcel0);
                this.zzh(s, zzbvc0);
                parcel1.writeNoException();
                return true;
            }
            case 8: {
                zzbuu zzbuu0 = (zzbuu)zzayc.zza(parcel0, zzbuu.CREATOR);
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 != null) {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                    zzbvc0 = iInterface5 instanceof zzbvd ? ((zzbvd)iInterface5) : new zzbvd(iBinder5);
                }
                zzayc.zzc(parcel0);
                this.zzi(zzbuu0, ((zzbvd)zzbvc0));
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

