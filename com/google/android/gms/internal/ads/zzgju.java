package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzgju {
    public static final int zza;
    private static final zzgvo zzb;
    private static final zzgmt zzc;
    private static final zzgmp zzd;
    private static final zzglh zze;
    private static final zzgld zzf;

    static {
        zzgvo zzgvo0 = zzgnu.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzgju.zzb = zzgvo0;
        zzgju.zzc = zzgmt.zzb((zzggw zzggw0) -> {
            zzgsn zzgsn0 = zzgsp.zza();
            zzgsn0.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
            zzgsn0.zzc(zzgrx.zzb().zzaN());
            zzgsn0.zza(zzgju.zzg(zzggw0.zzb()));
            return zzgni.zzb(((zzgsp)zzgsn0.zzbn()));
        }, zzggw.class, zzgni.class);
        zzgju.zzd = zzgmp.zzb((zzgni zzgni0) -> // 去混淆评级： 中等(80)
        throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: "), zzgvo0, zzgni.class);
        zzgju.zze = zzglh.zzb((zzggr zzggr0, zzgeo zzgeo0) -> {
            zzgrs zzgrs0 = zzgru.zzb();
            byte[] arr_b = zzggr0.zzd().zzd(zzgeo0);
            zzgrs0.zza(zzgwj.zzv(arr_b, 0, arr_b.length));
            zzgwj zzgwj0 = ((zzgru)zzgrs0.zzbn()).zzaN();
            zzgtp zzgtp0 = zzgju.zzg(zzggr0.zzb().zzb());
            return zzgnh.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", zzgwj0, zzgsj.zzb, zzgtp0, zzggr0.zze());
        }, zzggr.class, zzgnh.class);
        zzgju.zzf = zzgld.zzb((zzgnh zzgnh0, zzgeo zzgeo0) -> {
            if(zzgnh0.zzg().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                try {
                    zzgru zzgru0 = zzgru.zzd(zzgnh0.zze(), zzgxb.zza());
                    if(zzgru0.zza() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    return zzggr.zza(zzgju.zzf(zzgnh0.zzc()), zzgvp.zzb(zzgru0.zzf().zzA(), zzgeo0), zzgnh0.zzf());
                }
                catch(zzgyg unused_ex) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
                }
            }
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }, zzgvo0, zzgnh.class);
    }

    // 检测为 Lambda 实现
    public static zzggr zza(zzgnh zzgnh0, zzgeo zzgeo0) [...]

    // 去混淆评级： 中等(80)
    // 检测为 Lambda 实现
    public static zzggw zzb(zzgni zzgni0) [...]

    // 检测为 Lambda 实现
    public static zzgnh zzc(zzggr zzggr0, zzgeo zzgeo0) [...]

    // 检测为 Lambda 实现
    public static zzgni zzd(zzggw zzggw0) [...]

    public static void zze(zzgmk zzgmk0) throws GeneralSecurityException {
        zzgmk0.zzi(zzgju.zzc);
        zzgmk0.zzh(zzgju.zzd);
        zzgmk0.zzg(zzgju.zze);
        zzgmk0.zzf(zzgju.zzf);
    }

    private static zzggv zzf(zzgtp zzgtp0) throws GeneralSecurityException {
        switch(zzgtp0.ordinal()) {
            case 1: {
                return zzggv.zza;
            }
            case 3: {
                return zzggv.zzc;
            }
            case 2: 
            case 4: {
                return zzggv.zzb;
            }
            default: {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgtp0.zza());
            }
        }
    }

    private static zzgtp zzg(zzggv zzggv0) throws GeneralSecurityException {
        if(zzggv.zza.equals(zzggv0)) {
            return zzgtp.zzb;
        }
        if(zzggv.zzb.equals(zzggv0)) {
            return zzgtp.zze;
        }
        if(!zzggv.zzc.equals(zzggv0)) {
            throw new GeneralSecurityException("Unable to serialize variant: " + zzggv0.toString());
        }
        return zzgtp.zzd;
    }
}

