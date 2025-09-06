package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzghw {
    public static final int zza;
    private static final zzgvo zzb;
    private static final zzgmt zzc;
    private static final zzgmp zzd;
    private static final zzglh zze;
    private static final zzgld zzf;

    static {
        zzgvo zzgvo0 = zzgnu.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zzghw.zzb = zzgvo0;
        zzghw.zzc = zzgmt.zzb((zzghr zzghr0) -> {
            zzgsn zzgsn0 = zzgsp.zza();
            zzgsn0.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
            zzgsn0.zzc(zzghw.zzg(zzghr0).zzaN());
            zzgsn0.zza(zzghw.zzh(zzghr0.zzc()));
            return zzgni.zzb(((zzgsp)zzgsn0.zzbn()));
        }, zzghr.class, zzgni.class);
        zzghw.zzd = zzgmp.zzb((zzgni zzgni0) -> // 去混淆评级： 中等(80)
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: "), zzgvo0, zzgni.class);
        zzghw.zze = zzglh.zzb((zzghm zzghm0, zzgeo zzgeo0) -> {
            zzgtj zzgtj0 = zzgtl.zzb();
            zzgtj0.zza(zzghw.zzg(zzghm0.zzb()));
            zzgwj zzgwj0 = ((zzgtl)zzgtj0.zzbn()).zzaN();
            zzgtp zzgtp0 = zzghw.zzh(zzghm0.zzb().zzc());
            return zzgnh.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", zzgwj0, zzgsj.zze, zzgtp0, zzghm0.zzd());
        }, zzghm.class, zzgnh.class);
        zzghw.zzf = zzgld.zzb((zzgnh zzgnh0, zzgeo zzgeo0) -> {
            if(!zzgnh0.zzg().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
            }
            try {
                zzgtl zzgtl0 = zzgtl.zzd(zzgnh0.zze(), zzgxb.zza());
                if(zzgtl0.zza() != 0) {
                    throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got " + zzgtl0);
                }
                return zzghm.zza(zzghw.zzf(zzgtl0.zzf(), zzgnh0.zzc()), zzgnh0.zzf());
            }
            catch(zzgyg zzgyg0) {
            }
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", zzgyg0);
        }, zzgvo0, zzgnh.class);
    }

    // 检测为 Lambda 实现
    public static zzghm zza(zzgnh zzgnh0, zzgeo zzgeo0) [...]

    // 去混淆评级： 中等(80)
    // 检测为 Lambda 实现
    public static zzghr zzb(zzgni zzgni0) [...]

    // 检测为 Lambda 实现
    public static zzgnh zzc(zzghm zzghm0, zzgeo zzgeo0) [...]

    // 检测为 Lambda 实现
    public static zzgni zzd(zzghr zzghr0) [...]

    public static void zze(zzgmk zzgmk0) throws GeneralSecurityException {
        zzgmk0.zzi(zzghw.zzc);
        zzgmk0.zzh(zzghw.zzd);
        zzgmk0.zzg(zzghw.zze);
        zzgmk0.zzf(zzghw.zzf);
    }

    private static zzghr zzf(zzgto zzgto0, zzgtp zzgtp0) throws GeneralSecurityException {
        zzghp zzghp0;
        zzgho zzgho0;
        zzgsn zzgsn0 = zzgsp.zza();
        zzgsn0.zzb("");
        zzgsn0.zzc(zzgto0.zza().zzh());
        zzgsn0.zza(zzgtp.zzd);
        zzgek zzgek0 = zzgeq.zza(((zzgsp)zzgsn0.zzbn()).zzaV());
        if(zzgek0 instanceof zzggf) {
            zzgho0 = zzgho.zza;
        }
        else {
            if(zzgek0 instanceof zzggw) {
                zzgho0 = zzgho.zzc;
                goto label_22;
            }
            if(zzgek0 instanceof zzgir) {
                zzgho0 = zzgho.zzb;
                goto label_22;
            }
            if(zzgek0 instanceof zzgfk) {
                zzgho0 = zzgho.zzd;
                goto label_22;
            }
            if(zzgek0 instanceof zzgfu) {
                zzgho0 = zzgho.zze;
            }
            else if(zzgek0 instanceof zzggq) {
                zzgho0 = zzgho.zzf;
            }
            else {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing " + zzgek0.toString());
            }
        }
    label_22:
        zzghn zzghn0 = new zzghn(null);
        switch(zzgtp0.ordinal()) {
            case 1: {
                zzghp0 = zzghp.zza;
                break;
            }
            case 3: {
                zzghp0 = zzghp.zzb;
                break;
            }
            default: {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgtp0.zza());
            }
        }
        zzghn0.zzd(zzghp0);
        zzghn0.zzc("");
        zzghn0.zza(((zzgeu)zzgek0));
        zzghn0.zzb(zzgho0);
        return zzghn0.zze();
    }

    private static zzgto zzg(zzghr zzghr0) throws GeneralSecurityException {
        byte[] arr_b = zzgeq.zzb(zzghr0.zzb());
        try {
            zzgsp zzgsp0 = zzgsp.zzf(arr_b, zzgxb.zza());
            zzgtm zzgtm0 = zzgto.zzb();
            zzgtm0.zzb(zzghr0.zzd());
            zzgtm0.zza(zzgsp0);
            return (zzgto)zzgtm0.zzbn();
        }
        catch(zzgyg zzgyg0) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", zzgyg0);
        }
    }

    private static zzgtp zzh(zzghp zzghp0) throws GeneralSecurityException {
        if(zzghp.zza.equals(zzghp0)) {
            return zzgtp.zzb;
        }
        if(!zzghp.zzb.equals(zzghp0)) {
            throw new GeneralSecurityException("Unable to serialize variant: " + zzghp0);
        }
        return zzgtp.zzd;
    }
}

