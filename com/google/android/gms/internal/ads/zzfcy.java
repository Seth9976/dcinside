package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import o3.h;

public final class zzfcy {
    @VisibleForTesting
    public zzfcy() {
        try {
            zzges.zza();
        }
        catch(GeneralSecurityException generalSecurityException0) {
            zze.zza(("Failed to Configure Aead. " + generalSecurityException0.toString()));
            zzv.zzp().zzw(generalSecurityException0, "CryptoUtils.registerAead");
        }
    }

    public static final String zza() {
        try {
            zzgeg zzgeg0 = zzgeg.zzb(zzgea.zza(zzgmg.zzb().zza("AES128_GCM")));
            try {
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                zzgdq.zzb(zzgeg0, zzgdp.zzb(byteArrayOutputStream0));
                return Base64.encodeToString(byteArrayOutputStream0.toByteArray(), 11);
            }
            catch(IOException unused_ex) {
                throw new GeneralSecurityException("Serialize keyset failed");
            }
        }
        catch(GeneralSecurityException generalSecurityException0) {
            zze.zza(("Failed to generate key" + generalSecurityException0.toString()));
            zzv.zzp().zzw(generalSecurityException0, "CryptoUtils.generateKey");
            return "";
        }
    }

    @h
    public static final String zzb(byte[] arr_b, byte[] arr_b1, @h String s, zzdrq zzdrq0) {
        if(s == null) {
            return null;
        }
        zzgeg zzgeg0 = zzfcy.zzc(s);
        if(zzgeg0 != null) {
            try {
                byte[] arr_b2 = ((zzgdn)zzgeg0.zzd(zzgnl.zzd(), zzgdn.class)).zza(arr_b, arr_b1);
                zzdrq0.zzb().put("ds", "1");
                return new String(arr_b2, "UTF-8");
            }
            catch(GeneralSecurityException | UnsupportedEncodingException | UnsupportedOperationException generalSecurityException0) {
                zze.zza(("Failed to decrypt " + generalSecurityException0.toString()));
                zzv.zzp().zzw(generalSecurityException0, "CryptoUtils.decrypt");
                zzdrq0.zzb().put("dsf", generalSecurityException0.toString());
            }
        }
        return null;
    }

    @h
    private static final zzgeg zzc(String s) {
        try {
            byte[] arr_b = Base64.decode(s, 11);
            try {
                return zzgdq.zza(zzgdo.zzb(arr_b));
            }
            catch(IOException unused_ex) {
                throw new GeneralSecurityException("Parse keyset failed");
            }
        }
        catch(GeneralSecurityException generalSecurityException0) {
            zze.zza(("Failed to get keysethandle" + generalSecurityException0.toString()));
            zzv.zzp().zzw(generalSecurityException0, "CryptoUtils.getHandle");
            return null;
        }
    }
}

