package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbif;
import com.google.android.gms.internal.ads.zzbih;
import com.google.android.gms.internal.ads.zzbsx;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzcex;
import com.google.android.gms.internal.ads.zzcwg;
import com.google.android.gms.internal.ads.zzdds;
import j..util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

@Class(creator = "AdOverlayInfoCreator")
@Reserved({1})
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator CREATOR;
    @Field(id = 2)
    public final zzc zza;
    @Field(getter = "getAdClickListenerAsBinder", id = 3, type = "android.os.IBinder")
    public final zza zzb;
    @Field(getter = "getAdOverlayListenerAsBinder", id = 4, type = "android.os.IBinder")
    public final zzr zzc;
    @Field(getter = "getAdWebViewAsBinder", id = 5, type = "android.os.IBinder")
    public final zzcex zzd;
    @Field(getter = "getAppEventGmsgListenerAsBinder", id = 6, type = "android.os.IBinder")
    public final zzbih zze;
    @NonNull
    @Field(id = 7)
    public final String zzf;
    @Field(id = 8)
    public final boolean zzg;
    @NonNull
    @Field(id = 9)
    public final String zzh;
    @Field(getter = "getLeaveApplicationListenerAsBinder", id = 10, type = "android.os.IBinder")
    public final zzac zzi;
    @Field(id = 11)
    public final int zzj;
    @Field(id = 12)
    public final int zzk;
    @NonNull
    @Field(id = 13)
    public final String zzl;
    @NonNull
    @Field(id = 14)
    public final VersionInfoParcel zzm;
    @NonNull
    @Field(id = 16)
    public final String zzn;
    @Field(id = 17)
    public final zzl zzo;
    @Field(getter = "getAdMetadataGmsgListenerAsBinder", id = 18, type = "android.os.IBinder")
    public final zzbif zzp;
    @NonNull
    @Field(id = 19)
    public final String zzq;
    @NonNull
    @Field(id = 24)
    public final String zzr;
    @NonNull
    @Field(id = 25)
    public final String zzs;
    @Field(getter = "getAdFailedToShowEventEmitterAsBinder", id = 26, type = "android.os.IBinder")
    public final zzcwg zzt;
    @Field(getter = "getPhysicalClickListenerAsBinder", id = 27, type = "android.os.IBinder")
    public final zzdds zzu;
    @Field(getter = "getOfflineUtilsAsBinder", id = 28, type = "android.os.IBinder")
    public final zzbsx zzv;
    @Field(id = 29)
    public final boolean zzw;
    @Field(id = 30)
    public final long zzx;
    private static final AtomicLong zzy;
    private static final ConcurrentHashMap zzz;

    static {
        AdOverlayInfoParcel.CREATOR = new zzo();
        AdOverlayInfoParcel.zzy = new AtomicLong(0L);
        AdOverlayInfoParcel.zzz = new ConcurrentHashMap();
    }

    public AdOverlayInfoParcel(zza zza0, zzr zzr0, zzac zzac0, zzcex zzcex0, int v, VersionInfoParcel versionInfoParcel0, String s, zzl zzl0, String s1, String s2, String s3, zzcwg zzcwg0, zzbsx zzbsx0, String s4) {
        this.zza = null;
        this.zzb = null;
        this.zzc = zzr0;
        this.zzd = zzcex0;
        this.zzp = null;
        this.zze = null;
        this.zzg = false;
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzaT)).booleanValue()) {
            this.zzf = null;
            this.zzh = null;
        }
        else {
            this.zzf = s1;
            this.zzh = s2;
        }
        this.zzi = null;
        this.zzj = v;
        this.zzk = 1;
        this.zzl = null;
        this.zzm = versionInfoParcel0;
        this.zzn = s;
        this.zzo = zzl0;
        this.zzq = s4;
        this.zzr = null;
        this.zzs = s3;
        this.zzt = zzcwg0;
        this.zzu = null;
        this.zzv = zzbsx0;
        this.zzw = false;
        this.zzx = AdOverlayInfoParcel.zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(zza zza0, zzr zzr0, zzac zzac0, zzcex zzcex0, boolean z, int v, VersionInfoParcel versionInfoParcel0, zzdds zzdds0, zzbsx zzbsx0) {
        this.zza = null;
        this.zzb = zza0;
        this.zzc = zzr0;
        this.zzd = zzcex0;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = z;
        this.zzh = null;
        this.zzi = zzac0;
        this.zzj = v;
        this.zzk = 2;
        this.zzl = null;
        this.zzm = versionInfoParcel0;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzdds0;
        this.zzv = zzbsx0;
        this.zzw = false;
        this.zzx = AdOverlayInfoParcel.zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(zza zza0, zzr zzr0, zzbif zzbif0, zzbih zzbih0, zzac zzac0, zzcex zzcex0, boolean z, int v, String s, VersionInfoParcel versionInfoParcel0, zzdds zzdds0, zzbsx zzbsx0, boolean z1) {
        this.zza = null;
        this.zzb = zza0;
        this.zzc = zzr0;
        this.zzd = zzcex0;
        this.zzp = zzbif0;
        this.zze = zzbih0;
        this.zzf = null;
        this.zzg = z;
        this.zzh = null;
        this.zzi = zzac0;
        this.zzj = v;
        this.zzk = 3;
        this.zzl = s;
        this.zzm = versionInfoParcel0;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzdds0;
        this.zzv = zzbsx0;
        this.zzw = z1;
        this.zzx = AdOverlayInfoParcel.zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(zza zza0, zzr zzr0, zzbif zzbif0, zzbih zzbih0, zzac zzac0, zzcex zzcex0, boolean z, int v, String s, String s1, VersionInfoParcel versionInfoParcel0, zzdds zzdds0, zzbsx zzbsx0) {
        this.zza = null;
        this.zzb = zza0;
        this.zzc = zzr0;
        this.zzd = zzcex0;
        this.zzp = zzbif0;
        this.zze = zzbih0;
        this.zzf = s1;
        this.zzg = z;
        this.zzh = s;
        this.zzi = zzac0;
        this.zzj = v;
        this.zzk = 3;
        this.zzl = null;
        this.zzm = versionInfoParcel0;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzdds0;
        this.zzv = zzbsx0;
        this.zzw = false;
        this.zzx = AdOverlayInfoParcel.zzy.getAndIncrement();
    }

    @Constructor
    AdOverlayInfoParcel(@Param(id = 2) zzc zzc0, @Param(id = 3) IBinder iBinder0, @Param(id = 4) IBinder iBinder1, @Param(id = 5) IBinder iBinder2, @Param(id = 6) IBinder iBinder3, @Param(id = 7) String s, @Param(id = 8) boolean z, @Param(id = 9) String s1, @Param(id = 10) IBinder iBinder4, @Param(id = 11) int v, @Param(id = 12) int v1, @Param(id = 13) String s2, @Param(id = 14) VersionInfoParcel versionInfoParcel0, @Param(id = 16) String s3, @Param(id = 17) zzl zzl0, @Param(id = 18) IBinder iBinder5, @Param(id = 19) String s4, @Param(id = 24) String s5, @Param(id = 25) String s6, @Param(id = 26) IBinder iBinder6, @Param(id = 27) IBinder iBinder7, @Param(id = 28) IBinder iBinder8, @Param(id = 29) boolean z1, @Param(id = 30) long v2) {
        this.zza = zzc0;
        this.zzf = s;
        this.zzg = z;
        this.zzh = s1;
        this.zzj = v;
        this.zzk = v1;
        this.zzl = s2;
        this.zzm = versionInfoParcel0;
        this.zzn = s3;
        this.zzo = zzl0;
        this.zzq = s4;
        this.zzr = s5;
        this.zzs = s6;
        this.zzw = z1;
        this.zzx = v2;
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzmL)).booleanValue()) {
            zzp zzp0 = (zzp)AdOverlayInfoParcel.zzz.remove(v2);
            if(zzp0 == null) {
                throw new NullPointerException("AdOverlayObjects is null");
            }
            this.zzb = zzp0.zza;
            this.zzc = zzp0.zzb;
            this.zzd = zzp0.zzc;
            this.zzp = zzp0.zzd;
            this.zze = zzp0.zze;
            this.zzt = zzp0.zzg;
            this.zzu = zzp0.zzh;
            this.zzv = zzp0.zzi;
            this.zzi = zzp0.zzf;
            zzp0.zzj.cancel(false);
            return;
        }
        this.zzb = (zza)ObjectWrapper.unwrap(Stub.asInterface(iBinder0));
        this.zzc = (zzr)ObjectWrapper.unwrap(Stub.asInterface(iBinder1));
        this.zzd = (zzcex)ObjectWrapper.unwrap(Stub.asInterface(iBinder2));
        this.zzp = (zzbif)ObjectWrapper.unwrap(Stub.asInterface(iBinder5));
        this.zze = (zzbih)ObjectWrapper.unwrap(Stub.asInterface(iBinder3));
        this.zzi = (zzac)ObjectWrapper.unwrap(Stub.asInterface(iBinder4));
        this.zzt = (zzcwg)ObjectWrapper.unwrap(Stub.asInterface(iBinder6));
        this.zzu = (zzdds)ObjectWrapper.unwrap(Stub.asInterface(iBinder7));
        this.zzv = (zzbsx)ObjectWrapper.unwrap(Stub.asInterface(iBinder8));
    }

    public AdOverlayInfoParcel(zzc zzc0, zza zza0, zzr zzr0, zzac zzac0, VersionInfoParcel versionInfoParcel0, zzcex zzcex0, zzdds zzdds0, String s) {
        this.zza = zzc0;
        this.zzb = zza0;
        this.zzc = zzr0;
        this.zzd = zzcex0;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = zzac0;
        this.zzj = -1;
        this.zzk = 4;
        this.zzl = null;
        this.zzm = versionInfoParcel0;
        this.zzn = null;
        this.zzo = null;
        this.zzq = s;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzdds0;
        this.zzv = null;
        this.zzw = false;
        this.zzx = AdOverlayInfoParcel.zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(zzr zzr0, zzcex zzcex0, int v, VersionInfoParcel versionInfoParcel0) {
        this.zzc = zzr0;
        this.zzd = zzcex0;
        this.zzj = 1;
        this.zzm = versionInfoParcel0;
        this.zza = null;
        this.zzb = null;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzk = 1;
        this.zzl = null;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = null;
        this.zzw = false;
        this.zzx = AdOverlayInfoParcel.zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(zzcex zzcex0, VersionInfoParcel versionInfoParcel0, String s, String s1, int v, zzbsx zzbsx0) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzcex0;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = 14;
        this.zzk = 5;
        this.zzl = null;
        this.zzm = versionInfoParcel0;
        this.zzn = null;
        this.zzo = null;
        this.zzq = s;
        this.zzr = s1;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = zzbsx0;
        this.zzw = false;
        this.zzx = AdOverlayInfoParcel.zzy.getAndIncrement();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeParcelable(parcel0, 2, this.zza, v, false);
        SafeParcelWriter.writeIBinder(parcel0, 3, AdOverlayInfoParcel.zzc(this.zzb), false);
        SafeParcelWriter.writeIBinder(parcel0, 4, AdOverlayInfoParcel.zzc(this.zzc), false);
        SafeParcelWriter.writeIBinder(parcel0, 5, AdOverlayInfoParcel.zzc(this.zzd), false);
        SafeParcelWriter.writeIBinder(parcel0, 6, AdOverlayInfoParcel.zzc(this.zze), false);
        SafeParcelWriter.writeString(parcel0, 7, this.zzf, false);
        SafeParcelWriter.writeBoolean(parcel0, 8, this.zzg);
        SafeParcelWriter.writeString(parcel0, 9, this.zzh, false);
        SafeParcelWriter.writeIBinder(parcel0, 10, AdOverlayInfoParcel.zzc(this.zzi), false);
        SafeParcelWriter.writeInt(parcel0, 11, this.zzj);
        SafeParcelWriter.writeInt(parcel0, 12, this.zzk);
        SafeParcelWriter.writeString(parcel0, 13, this.zzl, false);
        SafeParcelWriter.writeParcelable(parcel0, 14, this.zzm, v, false);
        SafeParcelWriter.writeString(parcel0, 16, this.zzn, false);
        SafeParcelWriter.writeParcelable(parcel0, 17, this.zzo, v, false);
        SafeParcelWriter.writeIBinder(parcel0, 18, AdOverlayInfoParcel.zzc(this.zzp), false);
        SafeParcelWriter.writeString(parcel0, 19, this.zzq, false);
        SafeParcelWriter.writeString(parcel0, 24, this.zzr, false);
        SafeParcelWriter.writeString(parcel0, 25, this.zzs, false);
        SafeParcelWriter.writeIBinder(parcel0, 26, AdOverlayInfoParcel.zzc(this.zzt), false);
        SafeParcelWriter.writeIBinder(parcel0, 27, AdOverlayInfoParcel.zzc(this.zzu), false);
        SafeParcelWriter.writeIBinder(parcel0, 28, AdOverlayInfoParcel.zzc(this.zzv), false);
        SafeParcelWriter.writeBoolean(parcel0, 29, this.zzw);
        SafeParcelWriter.writeLong(parcel0, 30, this.zzx);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzmL)).booleanValue()) {
            zzq zzq0 = new zzq(this.zzx);
            long v2 = (long)(((int)(((Integer)zzbe.zzc().zza(zzbcl.zzmN)))));
            ScheduledFuture scheduledFuture0 = zzbzw.zzd.schedule(zzq0, v2, TimeUnit.SECONDS);
            zzp zzp0 = new zzp(this.zzb, this.zzc, this.zzd, this.zzp, this.zze, this.zzi, this.zzt, this.zzu, this.zzv, scheduledFuture0);
            AdOverlayInfoParcel.zzz.put(this.zzx, zzp0);
        }
    }

    @Nullable
    public static AdOverlayInfoParcel zza(@NonNull Intent intent0) {
        try {
            Bundle bundle0 = intent0.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundle0.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel)bundle0.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        }
        catch(Exception exception0) {
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzmL)).booleanValue()) {
                zzv.zzp().zzw(exception0, "AdOverlayInfoParcel.getFromIntent");
            }
            return null;
        }
    }

    // 去混淆评级： 低(20)
    @Nullable
    private static final IBinder zzc(Object object0) {
        return ((Boolean)zzbe.zzc().zza(zzbcl.zzmL)).booleanValue() ? null : ObjectWrapper.wrap(object0).asBinder();
    }
}

