package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzbrc extends zzayb implements zzbrd {
    public zzbrc() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzbrd zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return iInterface0 instanceof zzbrd ? ((zzbrd)iInterface0) : new zzbrb(iBinder0);
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        zzbrg zzbrg0 = null;
        switch(v) {
            case 1: {
                IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
                String s = parcel0.readString();
                Parcelable.Creator parcelable$Creator0 = Bundle.CREATOR;
                Bundle bundle0 = (Bundle)zzayc.zza(parcel0, parcelable$Creator0);
                Parcelable parcelable0 = zzayc.zza(parcel0, parcelable$Creator0);
                Parcelable parcelable1 = zzayc.zza(parcel0, zzs.CREATOR);
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                    zzbrg0 = iInterface0 instanceof zzbrg ? ((zzbrg)iInterface0) : new zzbre(iBinder0);
                }
                zzayc.zzc(parcel0);
                this.zzh(iObjectWrapper0, s, bundle0, ((Bundle)parcelable0), ((zzs)parcelable1), zzbrg0);
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                zzbrs zzbrs0 = this.zzf();
                parcel1.writeNoException();
                zzayc.zze(parcel1, zzbrs0);
                return true;
            }
            case 3: {
                zzbrs zzbrs1 = this.zzg();
                parcel1.writeNoException();
                zzayc.zze(parcel1, zzbrs1);
                return true;
            }
            case 5: {
                zzeb zzeb0 = this.zze();
                parcel1.writeNoException();
                zzayc.zzf(parcel1, zzeb0);
                return true;
            }
            case 10: {
                Stub.asInterface(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 11: {
                parcel0.createStringArray();
                Bundle[] arr_bundle = (Bundle[])parcel0.createTypedArray(Bundle.CREATOR);
                zzayc.zzc(parcel0);
                parcel1.writeNoException();
                return true;
            }
            case 13: {
                String s1 = parcel0.readString();
                String s2 = parcel0.readString();
                Parcelable parcelable2 = zzayc.zza(parcel0, zzm.CREATOR);
                IObjectWrapper iObjectWrapper1 = Stub.asInterface(parcel0.readStrongBinder());
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                    zzbrg0 = iInterface1 instanceof zzbqr ? ((zzbqr)iInterface1) : new zzbqp(iBinder1);
                }
                zzbpk zzbpk0 = zzbpj.zzb(parcel0.readStrongBinder());
                Parcelable parcelable3 = zzayc.zza(parcel0, zzs.CREATOR);
                zzayc.zzc(parcel0);
                this.zzj(s1, s2, ((zzm)parcelable2), iObjectWrapper1, ((zzbqr)zzbrg0), zzbpk0, ((zzs)parcelable3));
                parcel1.writeNoException();
                return true;
            }
            case 14: {
                String s3 = parcel0.readString();
                String s4 = parcel0.readString();
                Parcelable parcelable4 = zzayc.zza(parcel0, zzm.CREATOR);
                IObjectWrapper iObjectWrapper2 = Stub.asInterface(parcel0.readStrongBinder());
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                    zzbrg0 = iInterface2 instanceof zzbqu ? ((zzbqu)iInterface2) : new zzbqs(iBinder2);
                }
                zzbpk zzbpk1 = zzbpj.zzb(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzl(s3, s4, ((zzm)parcelable4), iObjectWrapper2, ((zzbqu)zzbrg0), zzbpk1);
                parcel1.writeNoException();
                return true;
            }
            case 15: {
                IObjectWrapper iObjectWrapper3 = Stub.asInterface(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                boolean z = this.zzs(iObjectWrapper3);
                parcel1.writeNoException();
                parcel1.writeInt(((int)z));
                return true;
            }
            case 16: {
                String s5 = parcel0.readString();
                String s6 = parcel0.readString();
                Parcelable parcelable5 = zzayc.zza(parcel0, zzm.CREATOR);
                IObjectWrapper iObjectWrapper4 = Stub.asInterface(parcel0.readStrongBinder());
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                    zzbrg0 = iInterface3 instanceof zzbra ? ((zzbra)iInterface3) : new zzbqy(iBinder3);
                }
                zzbpk zzbpk2 = zzbpj.zzb(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzp(s5, s6, ((zzm)parcelable5), iObjectWrapper4, ((zzbra)zzbrg0), zzbpk2);
                parcel1.writeNoException();
                return true;
            }
            case 17: {
                IObjectWrapper iObjectWrapper5 = Stub.asInterface(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                boolean z1 = this.zzt(iObjectWrapper5);
                parcel1.writeNoException();
                parcel1.writeInt(((int)z1));
                return true;
            }
            case 18: {
                String s7 = parcel0.readString();
                String s8 = parcel0.readString();
                Parcelable parcelable6 = zzayc.zza(parcel0, zzm.CREATOR);
                IObjectWrapper iObjectWrapper6 = Stub.asInterface(parcel0.readStrongBinder());
                IBinder iBinder4 = parcel0.readStrongBinder();
                if(iBinder4 != null) {
                    IInterface iInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                    zzbrg0 = iInterface4 instanceof zzbqx ? ((zzbqx)iInterface4) : new zzbqv(iBinder4);
                }
                zzbpk zzbpk3 = zzbpj.zzb(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzm(s7, s8, ((zzm)parcelable6), iObjectWrapper6, ((zzbqx)zzbrg0), zzbpk3);
                parcel1.writeNoException();
                return true;
            }
            case 19: {
                String s9 = parcel0.readString();
                zzayc.zzc(parcel0);
                this.zzq(s9);
                parcel1.writeNoException();
                return true;
            }
            case 20: {
                String s10 = parcel0.readString();
                String s11 = parcel0.readString();
                Parcelable parcelable7 = zzayc.zza(parcel0, zzm.CREATOR);
                IObjectWrapper iObjectWrapper7 = Stub.asInterface(parcel0.readStrongBinder());
                IBinder iBinder5 = parcel0.readStrongBinder();
                if(iBinder5 != null) {
                    IInterface iInterface5 = iBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                    zzbrg0 = iInterface5 instanceof zzbra ? ((zzbra)iInterface5) : new zzbqy(iBinder5);
                }
                zzbpk zzbpk4 = zzbpj.zzb(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzo(s10, s11, ((zzm)parcelable7), iObjectWrapper7, ((zzbra)zzbrg0), zzbpk4);
                parcel1.writeNoException();
                return true;
            }
            case 21: {
                String s12 = parcel0.readString();
                String s13 = parcel0.readString();
                Parcelable parcelable8 = zzayc.zza(parcel0, zzm.CREATOR);
                IObjectWrapper iObjectWrapper8 = Stub.asInterface(parcel0.readStrongBinder());
                IBinder iBinder6 = parcel0.readStrongBinder();
                if(iBinder6 != null) {
                    IInterface iInterface6 = iBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                    zzbrg0 = iInterface6 instanceof zzbqr ? ((zzbqr)iInterface6) : new zzbqp(iBinder6);
                }
                zzbpk zzbpk5 = zzbpj.zzb(parcel0.readStrongBinder());
                Parcelable parcelable9 = zzayc.zza(parcel0, zzs.CREATOR);
                zzayc.zzc(parcel0);
                this.zzk(s12, s13, ((zzm)parcelable8), iObjectWrapper8, ((zzbqr)zzbrg0), zzbpk5, ((zzs)parcelable9));
                parcel1.writeNoException();
                return true;
            }
            case 22: {
                String s14 = parcel0.readString();
                String s15 = parcel0.readString();
                Parcelable parcelable10 = zzayc.zza(parcel0, zzm.CREATOR);
                IObjectWrapper iObjectWrapper9 = Stub.asInterface(parcel0.readStrongBinder());
                IBinder iBinder7 = parcel0.readStrongBinder();
                if(iBinder7 != null) {
                    IInterface iInterface7 = iBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                    zzbrg0 = iInterface7 instanceof zzbqx ? ((zzbqx)iInterface7) : new zzbqv(iBinder7);
                }
                zzbpk zzbpk6 = zzbpj.zzb(parcel0.readStrongBinder());
                Parcelable parcelable11 = zzayc.zza(parcel0, zzbfl.CREATOR);
                zzayc.zzc(parcel0);
                this.zzn(s14, s15, ((zzm)parcelable10), iObjectWrapper9, ((zzbqx)zzbrg0), zzbpk6, ((zzbfl)parcelable11));
                parcel1.writeNoException();
                return true;
            }
            case 23: {
                String s16 = parcel0.readString();
                String s17 = parcel0.readString();
                Parcelable parcelable12 = zzayc.zza(parcel0, zzm.CREATOR);
                IObjectWrapper iObjectWrapper10 = Stub.asInterface(parcel0.readStrongBinder());
                IBinder iBinder8 = parcel0.readStrongBinder();
                if(iBinder8 != null) {
                    IInterface iInterface8 = iBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                    zzbrg0 = iInterface8 instanceof zzbqo ? ((zzbqo)iInterface8) : new zzbqm(iBinder8);
                }
                zzbpk zzbpk7 = zzbpj.zzb(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                this.zzi(s16, s17, ((zzm)parcelable12), iObjectWrapper10, ((zzbqo)zzbrg0), zzbpk7);
                parcel1.writeNoException();
                return true;
            }
            case 24: {
                IObjectWrapper iObjectWrapper11 = Stub.asInterface(parcel0.readStrongBinder());
                zzayc.zzc(parcel0);
                boolean z2 = this.zzr(iObjectWrapper11);
                parcel1.writeNoException();
                parcel1.writeInt(((int)z2));
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

