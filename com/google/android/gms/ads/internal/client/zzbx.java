package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbag;
import com.google.android.gms.internal.ads.zzbdf;
import com.google.android.gms.internal.ads.zzbdg;
import com.google.android.gms.internal.ads.zzbtm;
import com.google.android.gms.internal.ads.zzbtn;
import com.google.android.gms.internal.ads.zzbtp;
import com.google.android.gms.internal.ads.zzbtq;
import com.google.android.gms.internal.ads.zzbwb;
import com.google.android.gms.internal.ads.zzbwc;

public abstract class zzbx extends zzayb implements zzby {
    public zzbx() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static zzby zzad(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return iInterface0 instanceof zzby ? ((zzby)iInterface0) : new zzbw(iBinder0);
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        zzbl zzbl0 = null;
        switch(v) {
            case 1: {
                IObjectWrapper iObjectWrapper0 = this.zzn();
                parcel1.writeNoException();
                zzayc.zzf(parcel1, iObjectWrapper0);
                return true;
            }
            case 2: {
                this.zzx();
                parcel1.writeNoException();
                return true;
            }
            case 3: {
                boolean z = this.zzaa();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z));
                return true;
            }
            case 4: {
                zzm zzm0 = (zzm)zzayc.zza(parcel0, zzm.CREATOR);
                zzayc.zzc(parcel0);
                boolean z1 = this.zzab(zzm0);
                parcel1.writeNoException();
                parcel1.writeInt(((int)z1));
                return true;
            }
            case 5: {
                this.zzz();
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                this.zzB();
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbl0 = iInterface0 instanceof zzbl ? ((zzbl)iInterface0) : new zzbj(iBinder0);
                }
                zzayc.zzc(parcel0);
                this.zzD(zzbl0);
                parcel1.writeNoException();
                return true;
            }
            case 8: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    zzbl0 = iInterface1 instanceof zzcm ? ((zzcm)iInterface1) : new zzck(iBinder1);
                }
                zzayc.zzc(parcel0);
                this.zzG(((zzcm)zzbl0));
                parcel1.writeNoException();
                return true;
            }
            case 9: {
                this.zzX();
                parcel1.writeNoException();
                return true;
            }
            case 10: {
                parcel1.writeNoException();
                return true;
            }
            case 11: {
                this.zzA();
                parcel1.writeNoException();
                return true;
            }
            case 12: {
                zzs zzs0 = this.zzg();
                parcel1.writeNoException();
                zzayc.zze(parcel1, zzs0);
                return true;
            }
            case 13: {
                zzs zzs1 = (zzs)zzayc.zza(parcel0, zzs.CREATOR);
                zzayc.zzc(parcel0);
                this.zzF(zzs1);
                parcel1.writeNoException();
                return true;
            }
            case 14: {
                zzbtn zzbtn0 = zzbtm.zzb(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzM(zzbtn0);
                parcel1.writeNoException();
                return true;
            }
            case 15: {
                zzbtq zzbtq0 = zzbtp.zzb(parcel0.readStrongBinder());
                String s = parcel0.readString();
                zzayc.zzc(parcel0);
                this.zzQ(zzbtq0, s);
                parcel1.writeNoException();
                return true;
            }
            case 18: {
                String s1 = this.zzs();
                parcel1.writeNoException();
                parcel1.writeString(s1);
                return true;
            }
            case 19: {
                zzbdg zzbdg0 = zzbdf.zzb(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzO(zzbdg0);
                parcel1.writeNoException();
                return true;
            }
            case 20: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    zzbl0 = iInterface2 instanceof zzbi ? ((zzbi)iInterface2) : new zzbg(iBinder2);
                }
                zzayc.zzc(parcel0);
                this.zzC(((zzbi)zzbl0));
                parcel1.writeNoException();
                return true;
            }
            case 21: {
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzbl0 = iInterface3 instanceof zzcq ? ((zzcq)iInterface3) : new zzcq(iBinder3);
                }
                zzayc.zzc(parcel0);
                this.zzac(((zzcq)zzbl0));
                parcel1.writeNoException();
                return true;
            }
            case 22: {
                boolean z2 = zzayc.zzg(parcel0);
                zzayc.zzc(parcel0);
                this.zzN(z2);
                parcel1.writeNoException();
                return true;
            }
            case 23: {
                boolean z3 = this.zzZ();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z3));
                return true;
            }
            case 24: {
                zzbwc zzbwc0 = zzbwb.zzb(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzS(zzbwc0);
                parcel1.writeNoException();
                return true;
            }
            case 25: {
                String s2 = parcel0.readString();
                zzayc.zzc(parcel0);
                this.zzT(s2);
                parcel1.writeNoException();
                return true;
            }
            case 26: {
                zzeb zzeb0 = this.zzl();
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzeb0);
                return true;
            }
            case 29: {
                zzga zzga0 = (zzga)zzayc.zza(parcel0, zzga.CREATOR);
                zzayc.zzc(parcel0);
                this.zzU(zzga0);
                parcel1.writeNoException();
                return true;
            }
            case 30: {
                zzef zzef0 = (zzef)zzayc.zza(parcel0, zzef.CREATOR);
                zzayc.zzc(parcel0);
                this.zzK(zzef0);
                parcel1.writeNoException();
                return true;
            }
            case 0x1F: {
                String s3 = this.zzr();
                parcel1.writeNoException();
                parcel1.writeString(s3);
                return true;
            }
            case 0x20: {
                zzcm zzcm0 = this.zzj();
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzcm0);
                return true;
            }
            case 33: {
                zzbl zzbl1 = this.zzi();
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzbl1);
                return true;
            }
            case 34: {
                boolean z4 = zzayc.zzg(parcel0);
                zzayc.zzc(parcel0);
                this.zzL(z4);
                parcel1.writeNoException();
                return true;
            }
            case 35: {
                String s4 = this.zzt();
                parcel1.writeNoException();
                parcel1.writeString(s4);
                return true;
            }
            case 36: {
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    zzbl0 = iInterface4 instanceof zzcc ? ((zzcc)iInterface4) : new zzca(iBinder4);
                }
                zzayc.zzc(parcel0);
                this.zzE(((zzcc)zzbl0));
                parcel1.writeNoException();
                return true;
            }
            case 37: {
                Bundle bundle0 = this.zzd();
                parcel1.writeNoException();
                zzayc.zze(parcel1, bundle0);
                return true;
            }
            case 38: {
                String s5 = parcel0.readString();
                zzayc.zzc(parcel0);
                this.zzR(s5);
                parcel1.writeNoException();
                return true;
            }
            case 39: {
                zzy zzy0 = (zzy)zzayc.zza(parcel0, zzy.CREATOR);
                zzayc.zzc(parcel0);
                this.zzI(zzy0);
                parcel1.writeNoException();
                return true;
            }
            case 40: {
                zzbag zzbag0 = zzbaf.zze(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzH(zzbag0);
                parcel1.writeNoException();
                return true;
            }
            case 41: {
                zzdy zzdy0 = this.zzk();
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzdy0);
                return true;
            }
            case 42: {
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 != null) {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    zzbl0 = iInterface5 instanceof zzdr ? ((zzdr)iInterface5) : new zzdp(iBinder5);
                }
                zzayc.zzc(parcel0);
                this.zzP(((zzdr)zzbl0));
                parcel1.writeNoException();
                return true;
            }
            case 43: {
                zzm zzm1 = (zzm)zzayc.zza(parcel0, zzm.CREATOR);
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 != null) {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    zzbl0 = iInterface6 instanceof zzbo ? ((zzbo)iInterface6) : new zzbm(iBinder6);
                }
                zzayc.zzc(parcel0);
                this.zzy(zzm1, ((zzbo)zzbl0));
                parcel1.writeNoException();
                return true;
            }
            case 44: {
                IObjectWrapper iObjectWrapper1 = Stub.asInterface(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzW(iObjectWrapper1);
                parcel1.writeNoException();
                return true;
            }
            case 45: {
                IBinder iBinder7 = parcel0.readStrongBinder();
                if(iBinder7 != null) {
                    IInterface iInterface7 = iBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    zzbl0 = iInterface7 instanceof zzct ? ((zzct)iInterface7) : new zzcr(iBinder7);
                }
                zzayc.zzc(parcel0);
                this.zzJ(((zzct)zzbl0));
                parcel1.writeNoException();
                return true;
            }
            case 46: {
                boolean z5 = this.zzY();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z5));
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

