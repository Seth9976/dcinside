package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class zzfiv {
    private final zzegq zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final Context zze;
    private final zzfcb zzf;
    private final zzfcc zzg;
    private final Clock zzh;
    private final zzava zzi;

    public zzfiv(zzegq zzegq0, VersionInfoParcel versionInfoParcel0, String s, String s1, Context context0, @Nullable zzfcb zzfcb0, @Nullable zzfcc zzfcc0, Clock clock0, zzava zzava0) {
        this.zza = zzegq0;
        this.zzb = versionInfoParcel0.afmaVersion;
        this.zzc = s;
        this.zzd = s1;
        this.zze = context0;
        this.zzf = zzfcb0;
        this.zzg = zzfcc0;
        this.zzh = clock0;
        this.zzi = zzava0;
    }

    // 检测为 Lambda 实现
    static String zza(zzfcb zzfcb0) [...]

    // 检测为 Lambda 实现
    static String zzb(zzfcb zzfcb0) [...]

    public final List zzc(zzfca zzfca0, @Nullable zzfbo zzfbo0, List list0) {
        return this.zzd(zzfca0, zzfbo0, false, "", "", list0);
    }

    // This method was un-flattened
    public final List zzd(zzfca zzfca0, @Nullable zzfbo zzfbo0, boolean z, @Nullable String s, @Nullable String s1, List list0) {
        List list1 = new ArrayList();
        Iterator iterator0 = list0.iterator();
        while(true) {
            int v = 1;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            String s2 = zzfiv.zzj(zzfiv.zzj(zzfiv.zzj(((String)object0), "@gw_adlocid@", zzfca0.zza.zza.zzf), "@gw_adnetrefresh@", (z ? "1" : "0")), "@gw_sdkver@", this.zzb);
            if(zzfbo0 != null) {
                s2 = zzbyk.zzc(zzfiv.zzj(zzfiv.zzj(zzfiv.zzj(s2, "@gw_qdata@", zzfbo0.zzy), "@gw_adnetid@", zzfbo0.zzx), "@gw_allocid@", zzfbo0.zzw), this.zze, zzfbo0.zzW, zzfbo0.zzaw);
            }
            boolean z1 = false;
            String s3 = zzfiv.zzj(zzfiv.zzj(zzfiv.zzj(zzfiv.zzj(s2, "@gw_adnetstatus@", this.zza.zzg()), "@gw_ttr@", Long.toString(this.zza.zza(), 10)), "@gw_seqnum@", this.zzc), "@gw_sessid@", this.zzd);
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzdE)).booleanValue() && !TextUtils.isEmpty(s)) {
                z1 = true;
                v = !TextUtils.isEmpty(s1);
                goto label_15;
            }
            else if(!TextUtils.isEmpty(s1)) {
            label_15:
                Uri uri0 = Uri.parse(s3);
                if(this.zzi.zzf(uri0)) {
                    Uri.Builder uri$Builder0 = Uri.parse(s3).buildUpon();
                    if(z1) {
                        uri$Builder0 = uri$Builder0.appendQueryParameter("ms", s);
                    }
                    if(v != 0) {
                        uri$Builder0 = uri$Builder0.appendQueryParameter("attok", s1);
                    }
                    s3 = uri$Builder0.build().toString();
                }
            }
            list1.add(s3);
        }
        return list1;
    }

    public final List zze(zzfbo zzfbo0, List list0, zzbvw zzbvw0) {
        zzful zzful0;
        String s1;
        String s;
        List list1 = new ArrayList();
        long v = this.zzh.currentTimeMillis();
        try {
            s = zzbvw0.zzc();
            s1 = Integer.toString(zzbvw0.zzb());
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("Unable to determine award type and amount.", remoteException0);
            return list1;
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzdF)).booleanValue()) {
            zzfcc zzfcc0 = this.zzg;
            zzful0 = zzfcc0 == null ? zzful.zzc() : zzful.zzd(zzfcc0.zza);
        }
        else {
            zzful0 = zzful.zzd(this.zzf);
        }
        String s2 = (String)zzful0.zza((zzfcb zzfcb0) -> zzfiv.zzi(zzfcb0.zza)).zzb("");
        String s3 = (String)zzful0.zza((zzfcb zzfcb0) -> zzfiv.zzi(zzfcb0.zzb)).zzb("");
        for(Object object0: list0) {
            list1.add(zzbyk.zzc(zzfiv.zzj(zzfiv.zzj(zzfiv.zzj(zzfiv.zzj(zzfiv.zzj(zzfiv.zzj(((String)object0), "@gw_rwd_userid@", Uri.encode(s2)), "@gw_rwd_custom_data@", Uri.encode(s3)), "@gw_tmstmp@", Long.toString(v)), "@gw_rwd_itm@", Uri.encode(s)), "@gw_rwd_amt@", s1), "@gw_sdkver@", this.zzb), this.zze, zzfbo0.zzW, zzfbo0.zzaw));
        }
        return list1;
    }

    public static final List zzf(int v, int v1, List list0) {
        List list1 = new ArrayList();
        for(Object object0: list0) {
            list1.add(zzfiv.zzj(((String)object0), "@gw_mpe@", "2." + v1));
        }
        return list1;
    }

    public static final List zzg(List list0, String s) {
        List list1 = new ArrayList();
        for(Object object0: list0) {
            list1.add(zzfiv.zzj(((String)object0), "@gw_adnetstatus@", s));
        }
        return list1;
    }

    public static final List zzh(List list0, long v) {
        List list1 = new ArrayList();
        for(Object object0: list0) {
            list1.add(zzfiv.zzj(((String)object0), "@gw_ttr@", Long.toString(v, 10)));
        }
        return list1;
    }

    @Nullable
    private static String zzi(@Nullable String s) {
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        return zzl.zzk() ? "fakeForAdDebugLog" : s;
    }

    private static String zzj(String s, String s1, @Nullable String s2) {
        if(TextUtils.isEmpty(s2)) {
            s2 = "";
        }
        return s.replaceAll(s1, s2);
    }
}

