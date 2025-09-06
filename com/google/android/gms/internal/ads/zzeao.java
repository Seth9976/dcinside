package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo.DetailedState;
import android.os.Bundle;
import android.provider.Settings.Global;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;

public final class zzeao extends zzeap {
    private static final SparseArray zzb;
    private final Context zzc;
    private final zzcuw zzd;
    private final TelephonyManager zze;
    private final zzeag zzf;
    private zzbbq.zzq zzg;

    static {
        SparseArray sparseArray0 = new SparseArray();
        zzeao.zzb = sparseArray0;
        sparseArray0.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzbbq.zzaf.zzd.zzc);
        sparseArray0.put(NetworkInfo.DetailedState.AUTHENTICATING.ordinal(), zzbbq.zzaf.zzd.zzb);
        sparseArray0.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzbbq.zzaf.zzd.zzb);
        sparseArray0.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzbbq.zzaf.zzd.zzb);
        sparseArray0.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzbbq.zzaf.zzd.zzd);
        sparseArray0.put(NetworkInfo.DetailedState.BLOCKED.ordinal(), zzbbq.zzaf.zzd.zze);
        sparseArray0.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzbbq.zzaf.zzd.zze);
        sparseArray0.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzbbq.zzaf.zzd.zze);
        sparseArray0.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzbbq.zzaf.zzd.zze);
        sparseArray0.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzbbq.zzaf.zzd.zze);
        sparseArray0.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzbbq.zzaf.zzd.zzf);
        sparseArray0.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzbbq.zzaf.zzd.zzb);
        sparseArray0.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzbbq.zzaf.zzd.zzb);
    }

    zzeao(Context context0, zzcuw zzcuw0, zzeag zzeag0, zzeac zzeac0, zzg zzg0) {
        super(zzeac0, zzg0);
        this.zzc = context0;
        this.zzd = zzcuw0;
        this.zzf = zzeag0;
        this.zze = (TelephonyManager)context0.getSystemService("phone");
    }

    static zzbbq.zzab zza(zzeao zzeao0, Bundle bundle0) {
        zzbbq.zzab.zzb zzbbq$zzab$zzb0;
        zzbbq.zzab.zza zzbbq$zzab$zza0 = zzbbq.zzab.zza();
        int v = bundle0.getInt("cnt", -2);
        int v1 = bundle0.getInt("gnt", 0);
        if(v == -1) {
            zzeao0.zzg = zzbbq.zzq.zzb;
            return (zzbbq.zzab)zzbbq$zzab$zza0.zzbn();
        }
        zzeao0.zzg = zzbbq.zzq.zza;
        switch(v) {
            case 0: {
                zzbbq$zzab$zza0.zzd(zzbbq.zzab.zzc.zzb);
                break;
            }
            case 1: {
                zzbbq$zzab$zza0.zzd(zzbbq.zzab.zzc.zzc);
                break;
            }
            default: {
                zzbbq$zzab$zza0.zzd(zzbbq.zzab.zzc.zza);
            }
        }
        switch(v1) {
            case 13: {
                zzbbq$zzab$zzb0 = zzbbq.zzab.zzb.zzd;
                break;
            }
            case 1: 
            case 2: 
            case 4: 
            case 7: 
            case 11: 
            case 16: {
                zzbbq$zzab$zzb0 = zzbbq.zzab.zzb.zzb;
                break;
            }
            case 3: 
            case 5: 
            case 6: 
            case 8: 
            case 9: 
            case 10: 
            case 12: 
            case 14: 
            case 15: 
            case 17: {
                zzbbq$zzab$zzb0 = zzbbq.zzab.zzb.zzc;
                break;
            }
            default: {
                zzbbq$zzab$zzb0 = zzbbq.zzab.zzb.zza;
            }
        }
        zzbbq$zzab$zza0.zzc(zzbbq$zzab$zzb0);
        return (zzbbq.zzab)zzbbq$zzab$zza0.zzbn();
    }

    static zzbbq.zzaf.zzd zzb(zzeao zzeao0, Bundle bundle0) {
        int v = zzfcx.zza(zzfcx.zza(bundle0, "device"), "network").getInt("active_network_state", -1);
        return (zzbbq.zzaf.zzd)zzeao.zzb.get(v, zzbbq.zzaf.zzd.zza);
    }

    public final void zzd(boolean z) {
        Bundle bundle0 = new Bundle();
        zzgch.zzr(this.zzd.zzb(bundle0), new zzean(this, z), zzbzw.zzg);
    }

    static byte[] zze(zzeao zzeao0, boolean z, ArrayList arrayList0, zzbbq.zzab zzbbq$zzab0, zzbbq.zzaf.zzd zzbbq$zzaf$zzd0) {
        zzbbq.zzaf.zza.zza zzbbq$zzaf$zza$zza0 = zzbbq.zzaf.zza.zzn();
        zzbbq$zzaf$zza$zza0.zzn(arrayList0);
        boolean z1 = false;
        zzbbq$zzaf$zza$zza0.zzD(zzeao.zzg(Settings.Global.getInt(zzeao0.zzc.getContentResolver(), "airplane_mode_on", 0) != 0));
        zzbbq$zzaf$zza$zza0.zzE(zzv.zzr().zzg(zzeao0.zzc, zzeao0.zze));
        zzbbq$zzaf$zza$zza0.zzM(zzeao0.zzf.zze());
        zzbbq$zzaf$zza$zza0.zzL(zzeao0.zzf.zzb());
        zzbbq$zzaf$zza$zza0.zzG(zzeao0.zzf.zza());
        zzbbq$zzaf$zza$zza0.zzH(zzbbq$zzaf$zzd0);
        zzbbq$zzaf$zza$zza0.zzJ(zzbbq$zzab0);
        zzbbq$zzaf$zza$zza0.zzK(zzeao0.zzg);
        zzbbq$zzaf$zza$zza0.zzN(zzeao.zzg(z));
        zzbbq$zzaf$zza$zza0.zzP(zzeao0.zzf.zzd());
        zzbbq$zzaf$zza$zza0.zzO(zzv.zzC().currentTimeMillis());
        if(Settings.Global.getInt(zzeao0.zzc.getContentResolver(), "wifi_on", 0) != 0) {
            z1 = true;
        }
        zzbbq$zzaf$zza$zza0.zzQ(zzeao.zzg(z1));
        return ((zzbbq.zzaf.zza)zzbbq$zzaf$zza$zza0.zzbn()).zzaV();
    }

    // 去混淆评级： 低(20)
    private static final zzbbq.zzq zzg(boolean z) {
        return z ? zzbbq.zzq.zzb : zzbbq.zzq.zza;
    }
}

