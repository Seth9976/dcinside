package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class zzaty {
    static boolean zza = false;
    static final CountDownLatch zzb;
    public static final int zzc;
    private static MessageDigest zzd;
    private static final Object zze;
    private static final Object zzf;

    static {
        zzaty.zze = new Object();
        zzaty.zzf = new Object();
        zzaty.zzb = new CountDownLatch(1);
    }

    static zzatm zza(byte[] arr_b, String s) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        Vector vector0 = zzaty.zzc(arr_b, 0xFF);
        if(vector0 != null && !vector0.isEmpty()) {
            zzatm zzatm0 = zzatn.zza();
            int v = vector0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                zzatm0.zza(zzgwj.zzv(zzaty.zzh(((byte[])vector0.get(v1)), s, false), 0, 0x100));
            }
            byte[] arr_b1 = zzaty.zzf(arr_b);
            zzatm0.zzb(zzgwj.zzv(arr_b1, 0, arr_b1.length));
            return zzatm0;
        }
        return null;
    }

    static String zzb(byte[] arr_b, String s) throws GeneralSecurityException, UnsupportedEncodingException {
        zzatm zzatm0 = zzaty.zza(arr_b, s);
        return zzatm0 == null ? zzatr.zza(zzaty.zzh(zzaty.zzg(0x1000).zzaV(), s, true), true) : zzatr.zza(((zzatn)zzatm0.zzbn()).zzaV(), true);
    }

    static Vector zzc(byte[] arr_b, int v) {
        if(arr_b.length <= 0) {
            return null;
        }
        int v1 = arr_b.length + 0xFE;
        Vector vector0 = new Vector();
        for(int v2 = 0; v2 < v1 / 0xFF; ++v2) {
            try {
                vector0.add(Arrays.copyOfRange(arr_b, v2 * 0xFF, (arr_b.length - v2 * 0xFF <= 0xFF ? arr_b.length : v2 * 0xFF + 0xFF)));
            }
            catch(IndexOutOfBoundsException unused_ex) {
                return null;
            }
        }
        return vector0;
    }

    static void zze() {
        synchronized(zzaty.zzf) {
            if(!zzaty.zza) {
                zzaty.zza = true;
                new Thread(new zzatw(null)).start();
            }
        }
    }

    public static byte[] zzf(byte[] arr_b) throws NoSuchAlgorithmException {
        synchronized(zzaty.zze) {
            zzaty.zze();
            MessageDigest messageDigest0 = null;
            try {
                if(zzaty.zzb.await(2L, TimeUnit.SECONDS)) {
                    MessageDigest messageDigest1 = zzaty.zzd;
                    if(messageDigest1 != null) {
                        messageDigest0 = messageDigest1;
                    }
                }
            }
            catch(InterruptedException unused_ex) {
            }
            if(messageDigest0 != null) {
                messageDigest0.reset();
                messageDigest0.update(arr_b);
                return zzaty.zzd.digest();
            }
        }
        throw new NoSuchAlgorithmException("Cannot compute hash");
    }

    static zzasy zzg(int v) {
        zzasc zzasc0 = zzasy.zza();
        zzasc0.zzD(0x1000L);
        return (zzasy)zzasc0.zzbn();
    }

    private static byte[] zzh(byte[] arr_b, String s, boolean z) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] arr_b2;
        if(arr_b.length > (z ? 0xEF : 0xFF)) {
            arr_b = zzaty.zzg(0x1000).zzaV();
        }
        int v = (byte)arr_b.length;
        if(arr_b.length < (z ? 0xEF : 0xFF)) {
            byte[] arr_b1 = new byte[(z ? 0xEF : 0xFF) - arr_b.length];
            new SecureRandom().nextBytes(arr_b1);
            arr_b2 = ByteBuffer.allocate((z ? 0xEF : 0xFF) + 1).put(((byte)v)).put(arr_b).put(arr_b1).array();
        }
        else {
            arr_b2 = ByteBuffer.allocate((z ? 0xEF : 0xFF) + 1).put(((byte)v)).put(arr_b).array();
        }
        if(z) {
            byte[] arr_b3 = zzaty.zzf(arr_b2);
            arr_b2 = ByteBuffer.allocate(0x100).put(arr_b3).put(arr_b2).array();
        }
        byte[] arr_b4 = new byte[0x100];
        zzatz[] arr_zzatz = new zzaun().zzcG;
        for(int v1 = 0; v1 < 12; ++v1) {
            arr_zzatz[v1].zza(arr_b2, arr_b4);
        }
        if(s != null && s.length() > 0) {
            if(s.length() > 0x20) {
                s = s.substring(0, 0x20);
            }
            new zzatp(s.getBytes("UTF-8")).zza(arr_b4);
        }
        return arr_b4;
    }
}

