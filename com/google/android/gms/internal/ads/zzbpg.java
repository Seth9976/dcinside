package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;

public abstract class zzbpg extends zzayb implements zzbph {
    public zzbpg() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        zzbpk zzbpk0 = null;
        switch(v) {
            case 1: {
                IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
                Parcelable parcelable0 = zzayc.zza(parcel0, zzs.CREATOR);
                Parcelable parcelable1 = zzayc.zza(parcel0, zzm.CREATOR);
                String s = parcel0.readString();
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpk0 = iInterface0 instanceof zzbpk ? ((zzbpk)iInterface0) : new zzbpi(iBinder0);
                }
                zzayc.zzc(parcel0);
                this.zzu(iObjectWrapper0, ((zzs)parcelable0), ((zzm)parcelable1), s, zzbpk0);
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                IObjectWrapper iObjectWrapper1 = this.zzn();
                parcel1.writeNoException();
                zzayc.zzf(parcel1, iObjectWrapper1);
                return true;
            }
            case 3: {
                IObjectWrapper iObjectWrapper2 = Stub.asInterface(parcel0.readStrongBinder());
                zzm zzm0 = (zzm)zzayc.zza(parcel0, zzm.CREATOR);
                String s1 = parcel0.readString();
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpk0 = iInterface1 instanceof zzbpk ? ((zzbpk)iInterface1) : new zzbpi(iBinder1);
                }
                zzayc.zzc(parcel0);
                this.zzx(iObjectWrapper2, zzm0, s1, zzbpk0);
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                this.zzI();
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                this.zzo();
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                IObjectWrapper iObjectWrapper3 = Stub.asInterface(parcel0.readStrongBinder());
                Parcelable parcelable2 = zzayc.zza(parcel0, zzs.CREATOR);
                Parcelable parcelable3 = zzayc.zza(parcel0, zzm.CREATOR);
                String s2 = parcel0.readString();
                String s3 = parcel0.readString();
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpk0 = iInterface2 instanceof zzbpk ? ((zzbpk)iInterface2) : new zzbpi(iBinder2);
                }
                zzayc.zzc(parcel0);
                this.zzv(iObjectWrapper3, ((zzs)parcelable2), ((zzm)parcelable3), s2, s3, zzbpk0);
                parcel1.writeNoException();
                return true;
            }
            case 7: {
                IObjectWrapper iObjectWrapper4 = Stub.asInterface(parcel0.readStrongBinder());
                Parcelable parcelable4 = zzayc.zza(parcel0, zzm.CREATOR);
                String s4 = parcel0.readString();
                String s5 = parcel0.readString();
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpk0 = iInterface3 instanceof zzbpk ? ((zzbpk)iInterface3) : new zzbpi(iBinder3);
                }
                zzayc.zzc(parcel0);
                this.zzy(iObjectWrapper4, ((zzm)parcelable4), s4, s5, zzbpk0);
                parcel1.writeNoException();
                return true;
            }
            case 8: {
                this.zzE();
                parcel1.writeNoException();
                return true;
            }
            case 9: {
                this.zzF();
                parcel1.writeNoException();
                return true;
            }
            case 10: {
                IObjectWrapper iObjectWrapper5 = Stub.asInterface(parcel0.readStrongBinder());
                Parcelable parcelable5 = zzayc.zza(parcel0, zzm.CREATOR);
                String s6 = parcel0.readString();
                zzbwh zzbwh0 = zzbwg.zzb(parcel0.readStrongBinder());
                String s7 = parcel0.readString();
                zzayc.zzc(parcel0);
                this.zzp(iObjectWrapper5, ((zzm)parcelable5), s6, zzbwh0, s7);
                parcel1.writeNoException();
                return true;
            }
            case 11: {
                zzm zzm1 = (zzm)zzayc.zza(parcel0, zzm.CREATOR);
                String s8 = parcel0.readString();
                zzayc.zzc(parcel0);
                this.zzs(zzm1, s8);
                parcel1.writeNoException();
                return true;
            }
            case 12: {
                this.zzL();
                parcel1.writeNoException();
                return true;
            }
            case 13: {
                boolean z = this.zzN();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z));
                return true;
            }
            case 14: {
                IObjectWrapper iObjectWrapper6 = Stub.asInterface(parcel0.readStrongBinder());
                Parcelable parcelable6 = zzayc.zza(parcel0, zzm.CREATOR);
                String s9 = parcel0.readString();
                String s10 = parcel0.readString();
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpk0 = iInterface4 instanceof zzbpk ? ((zzbpk)iInterface4) : new zzbpi(iBinder4);
                }
                Parcelable parcelable7 = zzayc.zza(parcel0, zzbfl.CREATOR);
                ArrayList arrayList0 = parcel0.createStringArrayList();
                zzayc.zzc(parcel0);
                this.zzz(iObjectWrapper6, ((zzm)parcelable6), s9, s10, zzbpk0, ((zzbfl)parcelable7), arrayList0);
                parcel1.writeNoException();
                return true;
            }
            case 15: {
                parcel1.writeNoException();
                zzayc.zzf(parcel1, null);
                return true;
            }
            case 16: {
                parcel1.writeNoException();
                zzayc.zzf(parcel1, null);
                return true;
            }
            case 17: {
                Bundle bundle0 = this.zze();
                parcel1.writeNoException();
                zzayc.zze(parcel1, bundle0);
                return true;
            }
            case 18: {
                Bundle bundle1 = this.zzf();
                parcel1.writeNoException();
                zzayc.zze(parcel1, bundle1);
                return true;
            }
            case 19: {
                Bundle bundle2 = this.zzg();
                parcel1.writeNoException();
                zzayc.zze(parcel1, bundle2);
                return true;
            }
            case 20: {
                zzm zzm2 = (zzm)zzayc.zza(parcel0, zzm.CREATOR);
                String s11 = parcel0.readString();
                String s12 = parcel0.readString();
                zzayc.zzc(parcel0);
                this.zzB(zzm2, s11, s12);
                parcel1.writeNoException();
                return true;
            }
            case 21: {
                IObjectWrapper iObjectWrapper7 = Stub.asInterface(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzD(iObjectWrapper7);
                parcel1.writeNoException();
                return true;
            }
            case 22: {
                parcel1.writeNoException();
                parcel1.writeInt(0);
                return true;
            }
            case 23: {
                IObjectWrapper iObjectWrapper8 = Stub.asInterface(parcel0.readStrongBinder());
                zzbwh zzbwh1 = zzbwg.zzb(parcel0.readStrongBinder());
                ArrayList arrayList1 = parcel0.createStringArrayList();
                zzayc.zzc(parcel0);
                this.zzr(iObjectWrapper8, zzbwh1, arrayList1);
                parcel1.writeNoException();
                return true;
            }
            case 24: {
                zzbgq zzbgq0 = this.zzi();
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzbgq0);
                return true;
            }
            case 25: {
                boolean z1 = zzayc.zzg(parcel0);
                zzayc.zzc(parcel0);
                this.zzG(z1);
                parcel1.writeNoException();
                return true;
            }
            case 26: {
                zzeb zzeb0 = this.zzh();
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzeb0);
                return true;
            }
            case 27: {
                zzbpt zzbpt0 = this.zzk();
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzbpt0);
                return true;
            }
            case 28: {
                IObjectWrapper iObjectWrapper9 = Stub.asInterface(parcel0.readStrongBinder());
                zzm zzm3 = (zzm)zzayc.zza(parcel0, zzm.CREATOR);
                String s13 = parcel0.readString();
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 != null) {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpk0 = iInterface5 instanceof zzbpk ? ((zzbpk)iInterface5) : new zzbpi(iBinder5);
                }
                zzayc.zzc(parcel0);
                this.zzA(iObjectWrapper9, zzm3, s13, zzbpk0);
                parcel1.writeNoException();
                return true;
            }
            case 30: {
                IObjectWrapper iObjectWrapper10 = Stub.asInterface(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzK(iObjectWrapper10);
                parcel1.writeNoException();
                return true;
            }
            case 0x1F: {
                IObjectWrapper iObjectWrapper11 = Stub.asInterface(parcel0.readStrongBinder());
                zzblr zzblr0 = zzblq.zzb(parcel0.readStrongBinder());
                ArrayList arrayList2 = parcel0.createTypedArrayList(zzblx.CREATOR);
                zzayc.zzc(parcel0);
                this.zzq(iObjectWrapper11, zzblr0, arrayList2);
                parcel1.writeNoException();
                return true;
            }
            case 0x20: {
                IObjectWrapper iObjectWrapper12 = Stub.asInterface(parcel0.readStrongBinder());
                zzm zzm4 = (zzm)zzayc.zza(parcel0, zzm.CREATOR);
                String s14 = parcel0.readString();
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 != null) {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpk0 = iInterface6 instanceof zzbpk ? ((zzbpk)iInterface6) : new zzbpi(iBinder6);
                }
                zzayc.zzc(parcel0);
                this.zzC(iObjectWrapper12, zzm4, s14, zzbpk0);
                parcel1.writeNoException();
                return true;
            }
            case 33: {
                zzbrs zzbrs0 = this.zzl();
                parcel1.writeNoException();
                zzayc.zze(parcel1, zzbrs0);
                return true;
            }
            case 34: {
                zzbrs zzbrs1 = this.zzm();
                parcel1.writeNoException();
                zzayc.zze(parcel1, zzbrs1);
                return true;
            }
            case 35: {
                IObjectWrapper iObjectWrapper13 = Stub.asInterface(parcel0.readStrongBinder());
                Parcelable parcelable8 = zzayc.zza(parcel0, zzs.CREATOR);
                Parcelable parcelable9 = zzayc.zza(parcel0, zzm.CREATOR);
                String s15 = parcel0.readString();
                String s16 = parcel0.readString();
                IBinder iBinder7 = parcel0.readStrongBinder();
                if(iBinder7 != null) {
                    IInterface iInterface7 = iBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpk0 = iInterface7 instanceof zzbpk ? ((zzbpk)iInterface7) : new zzbpi(iBinder7);
                }
                zzayc.zzc(parcel0);
                this.zzw(iObjectWrapper13, ((zzs)parcelable8), ((zzm)parcelable9), s15, s16, zzbpk0);
                parcel1.writeNoException();
                return true;
            }
            case 36: {
                zzbpn zzbpn0 = this.zzj();
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzbpn0);
                return true;
            }
            case 37: {
                IObjectWrapper iObjectWrapper14 = Stub.asInterface(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzJ(iObjectWrapper14);
                parcel1.writeNoException();
                return true;
            }
            case 38: {
                IObjectWrapper iObjectWrapper15 = Stub.asInterface(parcel0.readStrongBinder());
                zzm zzm5 = (zzm)zzayc.zza(parcel0, zzm.CREATOR);
                String s17 = parcel0.readString();
                IBinder iBinder8 = parcel0.readStrongBinder();
                if(iBinder8 != null) {
                    IInterface iInterface8 = iBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpk0 = iInterface8 instanceof zzbpk ? ((zzbpk)iInterface8) : new zzbpi(iBinder8);
                }
                zzayc.zzc(parcel0);
                this.zzt(iObjectWrapper15, zzm5, s17, zzbpk0);
                parcel1.writeNoException();
                return true;
            }
            case 39: {
                IObjectWrapper iObjectWrapper16 = Stub.asInterface(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzH(iObjectWrapper16);
                parcel1.writeNoException();
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

