package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzgpo {
    public static final int zza;
    private static final zzgvo zzb;
    private static final zzgmt zzc;
    private static final zzgmp zzd;
    private static final zzglh zze;
    private static final zzgld zzf;

    static {
        zzgvo zzgvo0 = zzgnu.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzgpo.zzb = zzgvo0;
        zzgpo.zzc = zzgmt.zzb((zzgof zzgof0) -> {
            zzgsn zzgsn0 = zzgsp.zza();
            zzgsn0.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
            zzgqc zzgqc0 = zzgqe.zzb();
            zzgqc0.zzb(zzgpo.zzg(zzgof0));
            zzgqc0.zza(zzgof0.zzc());
            zzgsn0.zzc(((zzgqe)zzgqc0.zzbn()).zzaN());
            zzgsn0.zza(zzgpo.zzh(zzgof0.zzf()));
            return zzgni.zzb(((zzgsp)zzgsn0.zzbn()));
        }, zzgof.class, zzgni.class);
        zzgpo.zzd = zzgmp.zzb((zzgni zzgni0) -> // 去混淆评级： 中等(80)
        throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: "), zzgvo0, zzgni.class);
        zzgpo.zze = zzglh.zzb((zzgnx zzgnx0, zzgeo zzgeo0) -> {
            zzgpz zzgpz0 = zzgqb.zzb();
            zzgpz0.zzb(zzgpo.zzg(zzgnx0.zzb()));
            byte[] arr_b = zzgnx0.zzd().zzd(zzgeo0);
            zzgpz0.zza(zzgwj.zzv(arr_b, 0, arr_b.length));
            zzgwj zzgwj0 = ((zzgqb)zzgpz0.zzbn()).zzaN();
            zzgtp zzgtp0 = zzgpo.zzh(zzgnx0.zzb().zzf());
            return zzgnh.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", zzgwj0, zzgsj.zzb, zzgtp0, zzgnx0.zze());
        }, zzgnx.class, zzgnh.class);
        zzgpo.zzf = zzgld.zzb((zzgnh zzgnh0, zzgeo zzgeo0) -> {
            if(zzgnh0.zzg().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                try {
                    zzgqb zzgqb0 = zzgqb.zzd(zzgnh0.zze(), zzgxb.zza());
                    if(zzgqb0.zza() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    zzgoc zzgoc0 = zzgof.zze();
                    zzgoc0.zza(zzgqb0.zzg().zzd());
                    zzgoc0.zzb(zzgqb0.zzf().zza());
                    zzgoc0.zzc(zzgpo.zzf(zzgnh0.zzc()));
                    zzgof zzgof0 = zzgoc0.zzd();
                    zzgnv zzgnv0 = zzgnx.zza();
                    zzgnv0.zzc(zzgof0);
                    zzgnv0.zza(zzgvp.zzb(zzgqb0.zzg().zzA(), zzgeo0));
                    zzgnv0.zzb(zzgnh0.zzf());
                    return zzgnv0.zzd();
                }
                catch(zzgyg | IllegalArgumentException unused_ex) {
                    throw new GeneralSecurityException("Parsing AesCmacKey failed");
                }
            }
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }, zzgvo0, zzgnh.class);
    }

    // 检测为 Lambda 实现
    public static zzgnh zza(zzgnx zzgnx0, zzgeo zzgeo0) [...]

    // 检测为 Lambda 实现
    public static zzgni zzb(zzgof zzgof0) [...]

    // 检测为 Lambda 实现
    public static zzgnx zzc(zzgnh zzgnh0, zzgeo zzgeo0) [...]

    // 去混淆评级： 中等(80)
    // 检测为 Lambda 实现
    public static zzgof zzd(zzgni zzgni0) [...]

    public static void zze(zzgmk zzgmk0) throws GeneralSecurityException {
        zzgmk0.zzi(zzgpo.zzc);
        zzgmk0.zzh(zzgpo.zzd);
        zzgmk0.zzg(zzgpo.zze);
        zzgmk0.zzf(zzgpo.zzf);
    }

    private static zzgod zzf(zzgtp zzgtp0) throws GeneralSecurityException {
        switch(zzgtp0.ordinal()) {
            case 1: {
                return zzgod.zza;
            }
            case 2: {
                return zzgod.zzc;
            }
            case 3: {
                return zzgod.zzd;
            }
            case 4: {
                return zzgod.zzb;
            }
            default: {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgtp0.zza());
            }
        }
    }

    private static zzgqh zzg(zzgof zzgof0) {
        zzgqf zzgqf0 = zzgqh.zzb();
        zzgqf0.zza(zzgof0.zzb());
        return (zzgqh)zzgqf0.zzbn();
    }

    private static zzgtp zzh(zzgod zzgod0) throws GeneralSecurityException {
        if(zzgod.zza.equals(zzgod0)) {
            return zzgtp.zzb;
        }
        if(zzgod.zzb.equals(zzgod0)) {
            return zzgtp.zze;
        }
        if(zzgod.zzd.equals(zzgod0)) {
            return zzgtp.zzd;
        }
        if(!zzgod.zzc.equals(zzgod0)) {
            throw new GeneralSecurityException("Unable to serialize variant: " + zzgod0);
        }
        return zzgtp.zzc;
    }
}

