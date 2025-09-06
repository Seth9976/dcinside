package com.google.android.gms.internal.ads;

import j..util.Objects;
import java.security.GeneralSecurityException;

public final class zzgkj {
    public static final int zza;
    private static final zzgvo zzb;
    private static final zzgmt zzc;
    private static final zzgmp zzd;
    private static final zzglh zze;
    private static final zzgld zzf;

    static {
        zzgvo zzgvo0 = zzgnu.zzb("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        zzgkj.zzb = zzgvo0;
        zzgkj.zzc = zzgmt.zzb((zzgik zzgik0) -> {
            zzgsn zzgsn0 = zzgsp.zza();
            zzgsn0.zzb("type.googleapis.com/google.crypto.tink.XAesGcmKey");
            zzgtw zzgtw0 = zzgty.zzb();
            zzgtz zzgtz0 = zzgub.zzb();
            zzgtz0.zza(zzgik0.zzb());
            zzgtw0.zza(((zzgub)zzgtz0.zzbn()));
            zzgsn0.zzc(((zzgty)zzgtw0.zzbn()).zzaN());
            zzgsn0.zza(zzgkj.zzg(zzgik0.zzc()));
            return zzgni.zzb(((zzgsp)zzgsn0.zzbn()));
        }, zzgik.class, zzgni.class);
        zzgkj.zzd = zzgmp.zzb((zzgni zzgni0) -> // 去混淆评级： 中等(80)
        throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: "), zzgvo0, zzgni.class);
        zzgkj.zze = zzglh.zzb((zzgif zzgif0, zzgeo zzgeo0) -> {
            zzgtt zzgtt0 = zzgtv.zzb();
            byte[] arr_b = zzgif0.zzd().zzd(zzgeo0);
            zzgtt0.zza(zzgwj.zzv(arr_b, 0, arr_b.length));
            zzgtz zzgtz0 = zzgub.zzb();
            zzgtz0.zza(zzgif0.zzb().zzb());
            zzgtt0.zzb(((zzgub)zzgtz0.zzbn()));
            zzgwj zzgwj0 = ((zzgtv)zzgtt0.zzbn()).zzaN();
            zzgtp zzgtp0 = zzgkj.zzg(zzgif0.zzb().zzc());
            return zzgnh.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey", zzgwj0, zzgsj.zzb, zzgtp0, zzgif0.zze());
        }, zzgif.class, zzgnh.class);
        zzgkj.zzf = zzgld.zzb((zzgnh zzgnh0, zzgeo zzgeo0) -> {
            if(zzgnh0.zzg().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                try {
                    zzgtv zzgtv0 = zzgtv.zzd(zzgnh0.zze(), zzgxb.zza());
                    if(zzgtv0.zza() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if(zzgtv0.zzg().zzd() != 0x20) {
                        throw new GeneralSecurityException("Only 32 byte key size is accepted");
                    }
                    return zzgif.zza(zzgik.zzd(zzgkj.zzf(zzgnh0.zzc()), zzgtv0.zzf().zza()), zzgvp.zzb(zzgtv0.zzg().zzA(), zzgeo0), zzgnh0.zzf());
                }
                catch(zzgyg unused_ex) {
                    throw new GeneralSecurityException("Parsing XAesGcmKey failed");
                }
            }
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
        }, zzgvo0, zzgnh.class);
    }

    // 检测为 Lambda 实现
    public static zzgif zza(zzgnh zzgnh0, zzgeo zzgeo0) [...]

    // 去混淆评级： 中等(80)
    // 检测为 Lambda 实现
    public static zzgik zzb(zzgni zzgni0) [...]

    // 检测为 Lambda 实现
    public static zzgnh zzc(zzgif zzgif0, zzgeo zzgeo0) [...]

    // 检测为 Lambda 实现
    public static zzgni zzd(zzgik zzgik0) [...]

    public static void zze(zzgmk zzgmk0) throws GeneralSecurityException {
        zzgmk0.zzi(zzgkj.zzc);
        zzgmk0.zzh(zzgkj.zzd);
        zzgmk0.zzg(zzgkj.zze);
        zzgmk0.zzf(zzgkj.zzf);
    }

    private static zzgij zzf(zzgtp zzgtp0) throws GeneralSecurityException {
        switch(zzgtp0.ordinal()) {
            case 1: {
                return zzgij.zza;
            }
            case 3: {
                return zzgij.zzb;
            }
            default: {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgtp0.zza());
            }
        }
    }

    private static zzgtp zzg(zzgij zzgij0) throws GeneralSecurityException {
        if(Objects.equals(zzgij0, zzgij.zza)) {
            return zzgtp.zzb;
        }
        if(!Objects.equals(zzgij0, zzgij.zzb)) {
            throw new GeneralSecurityException("Unable to serialize variant: " + zzgij0.toString());
        }
        return zzgtp.zzd;
    }
}

