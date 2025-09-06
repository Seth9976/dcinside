package com.google.android.gms.internal.clearcut;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.clearcut.ClearcutLogger.zza;
import com.google.android.gms.clearcut.zze;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.phenotype.Phenotype;
import j..util.concurrent.ConcurrentHashMap;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public final class zzp implements zza {
    private static final Charset UTF_8;
    private static final zzao zzaq;
    private static final zzao zzar;
    private static final ConcurrentHashMap zzas;
    private static final HashMap zzat;
    @VisibleForTesting
    private static Boolean zzau;
    @VisibleForTesting
    private static Long zzav;
    @VisibleForTesting
    private static final zzae zzaw;
    private final Context zzh;

    static {
        zzp.UTF_8 = Charset.forName("UTF-8");
        zzao zzao0 = new zzao(Phenotype.getContentProviderUri("com.google.android.gms.clearcut.public")).zzc("gms:playlog:service:samplingrules_").zzd("LogSamplingRules__");
        zzp.zzaq = zzao0;
        zzp.zzar = new zzao(Phenotype.getContentProviderUri("com.google.android.gms.clearcut.public")).zzc("gms:playlog:service:sampling_").zzd("LogSampling__");
        zzp.zzas = new ConcurrentHashMap();
        zzp.zzat = new HashMap();
        zzp.zzau = null;
        zzp.zzav = null;
        zzp.zzaw = zzao0.zzc("enable_log_sampling_rules", false);
    }

    public zzp(Context context0) {
        this.zzh = context0;
        if(context0 != null) {
            zzae.maybeInit(context0);
        }
    }

    @VisibleForTesting
    private static long zza(String s, long v) {
        if(s != null && !s.isEmpty()) {
            byte[] arr_b = s.getBytes(zzp.UTF_8);
            ByteBuffer byteBuffer0 = ByteBuffer.allocate(arr_b.length + 8);
            byteBuffer0.put(arr_b);
            byteBuffer0.putLong(v);
            return zzk.zza(byteBuffer0.array());
        }
        return zzk.zza(ByteBuffer.allocate(8).putLong(v).array());
    }

    @VisibleForTesting
    private static zzb zza(String s) {
        long v4;
        long v3;
        String s1;
        if(s == null) {
            return null;
        }
        int v = s.indexOf(44);
        int v1 = 0;
        if(v >= 0) {
            v1 = v + 1;
            s1 = s.substring(0, v);
        }
        else {
            s1 = "";
        }
        int v2 = s.indexOf(0x2F, v1);
        if(v2 <= 0) {
            Log.e("LogSamplerImpl", (s.length() == 0 ? new String("Failed to parse the rule: ") : "Failed to parse the rule: " + s));
            return null;
        }
        try {
            v3 = Long.parseLong(s.substring(v1, v2));
            v4 = Long.parseLong(s.substring(v2 + 1));
        }
        catch(NumberFormatException numberFormatException0) {
            Log.e("LogSamplerImpl", (s.length() == 0 ? new String("parseLong() failed while parsing: ") : "parseLong() failed while parsing: " + s), numberFormatException0);
            return null;
        }
        if(v3 >= 0L && v4 >= 0L) {
            return (zzb)zzb.zzfz().zzn(s1).zzr(v3).zzs(v4).zzbh();
        }
        Log.e("LogSamplerImpl", "negative values not supported: " + v3 + "/" + v4);
        return null;
    }

    @Override  // com.google.android.gms.clearcut.ClearcutLogger$zza
    public final boolean zza(zze zze0) {
        List list0;
        String s = zze0.zzag.zzj;
        int v = zze0.zzag.zzk;
        int v1 = zze0.zzaa == null ? 0 : zze0.zzaa.zzbji;
        String s1 = null;
        if(((Boolean)zzp.zzaw.get()).booleanValue()) {
            if(s == null || s.isEmpty()) {
                s = v < 0 ? null : String.valueOf(v);
            }
            if(s != null) {
                if(this.zzh == null) {
                    list0 = Collections.emptyList();
                }
                else {
                    ConcurrentHashMap concurrentHashMap0 = zzp.zzas;
                    zzae zzae1 = (zzae)concurrentHashMap0.get(s);
                    if(zzae1 == null) {
                        zzae1 = zzp.zzaq.zza(s, com.google.android.gms.internal.clearcut.zzgw.zza.zzft(), zzq.zzax);
                        zzae zzae2 = (zzae)concurrentHashMap0.putIfAbsent(s, zzae1);
                        if(zzae2 != null) {
                            zzae1 = zzae2;
                        }
                    }
                    list0 = ((com.google.android.gms.internal.clearcut.zzgw.zza)zzae1.get()).zzfs();
                }
                for(Object object0: list0) {
                    zzb zzgw$zza$zzb1 = (zzb)object0;
                    if((!zzgw$zza$zzb1.zzfv() || zzgw$zza$zzb1.getEventCode() == 0 || zzgw$zza$zzb1.getEventCode() == v1) && !zzp.zzb(zzp.zza("", zzp.zzd(this.zzh)), zzgw$zza$zzb1.zzfx(), zzgw$zza$zzb1.zzfy())) {
                        return false;
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        else {
            if(s == null || s.isEmpty()) {
                s = v < 0 ? null : String.valueOf(v);
            }
            if(s != null) {
                if(this.zzh != null && zzp.zzc(this.zzh)) {
                    HashMap hashMap0 = zzp.zzat;
                    zzae zzae0 = (zzae)hashMap0.get(s);
                    if(zzae0 == null) {
                        zzae0 = zzp.zzar.zza(s, null);
                        hashMap0.put(s, zzae0);
                    }
                    s1 = (String)zzae0.get();
                }
                zzb zzgw$zza$zzb0 = zzp.zza(s1);
                return zzgw$zza$zzb0 == null ? true : zzp.zzb(zzp.zza("", zzp.zzd(this.zzh)), zzgw$zza$zzb0.zzfx(), zzgw$zza$zzb0.zzfy());
            }
        }
        return true;
    }

    @VisibleForTesting
    private static boolean zzb(long v, long v1, long v2) {
        return v1 < 0L || v2 <= 0L ? true : (v < 0L ? (0x7FFFFFFFFFFFFFFFL % v2 + 1L + (v & 0x7FFFFFFFFFFFFFFFL) % v2) % v2 : v % v2) < v1;
    }

    private static boolean zzc(Context context0) {
        if(zzp.zzau == null) {
            zzp.zzau = Boolean.valueOf(Wrappers.packageManager(context0).checkCallingOrSelfPermission("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
        }
        return zzp.zzau.booleanValue();
    }

    @VisibleForTesting
    private static long zzd(Context context0) {
        long v = 0L;
        if(zzp.zzav == null) {
            if(context0 != null) {
                if(zzp.zzc(context0)) {
                    v = zzy.getLong(context0.getContentResolver(), "android_id", 0L);
                }
                zzp.zzav = v;
                return (long)zzp.zzav;
            }
            return 0L;
        }
        return (long)zzp.zzav;
    }
}

