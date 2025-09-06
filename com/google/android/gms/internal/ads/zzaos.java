package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class zzaos {
    public static X509Certificate[][] zza(String s) throws zzaoo, SecurityException, IOException {
        ByteBuffer byteBuffer4;
        int v11;
        int v10;
        RandomAccessFile randomAccessFile0 = new RandomAccessFile(s, "r");
        try {
            Pair pair0 = zzaot.zzc(randomAccessFile0);
            if(pair0 != null) {
                ByteBuffer byteBuffer0 = (ByteBuffer)pair0.first;
                long v1 = (long)(((Long)pair0.second));
                if(v1 - 20L >= 0L) {
                    randomAccessFile0.seek(v1 - 20L);
                    if(randomAccessFile0.readInt() == 0x504B0607) {
                        throw new zzaoo("ZIP64 APK not supported");
                    }
                }
                long v2 = zzaot.zza(byteBuffer0);
                if(v2 >= v1) {
                    throw new zzaoo("ZIP Central Directory offset out of range: " + v2 + ". ZIP End of Central Directory offset: " + v1);
                }
                if(zzaot.zzb(byteBuffer0) + v2 != v1) {
                    throw new zzaoo("ZIP Central Directory is not immediately followed by End of Central Directory");
                }
                if(v2 < 0x20L) {
                    throw new zzaoo("APK too small for APK Signing Block. ZIP Central Directory offset: " + v2);
                }
                ByteBuffer byteBuffer1 = ByteBuffer.allocate(24);
                ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
                byteBuffer1.order(byteOrder0);
                randomAccessFile0.seek(v2 - ((long)byteBuffer1.capacity()));
                randomAccessFile0.readFully(byteBuffer1.array(), byteBuffer1.arrayOffset(), byteBuffer1.capacity());
                if(byteBuffer1.getLong(8) != 0x20676953204B5041L || byteBuffer1.getLong(16) != 0x3234206B636F6C42L) {
                    throw new zzaoo("No APK Signing Block before ZIP Central Directory");
                }
                int v3 = 0;
                long v4 = byteBuffer1.getLong(0);
                if(v4 < ((long)byteBuffer1.capacity()) || v4 > 0x7FFFFFF7L) {
                    throw new zzaoo("APK Signing Block size out of range: " + v4);
                }
                long v5 = v2 - ((long)(((int)(v4 + 8L))));
                if(v5 < 0L) {
                    throw new zzaoo("APK Signing Block offset out of range: " + v5);
                }
                ByteBuffer byteBuffer2 = ByteBuffer.allocate(((int)(v4 + 8L)));
                byteBuffer2.order(byteOrder0);
                randomAccessFile0.seek(v5);
                randomAccessFile0.readFully(byteBuffer2.array(), byteBuffer2.arrayOffset(), byteBuffer2.capacity());
                long v6 = byteBuffer2.getLong(0);
                if(v6 != v4) {
                    throw new zzaoo("APK Signing Block sizes in header and footer do not match: " + v6 + " vs " + v4);
                }
                Pair pair1 = Pair.create(byteBuffer2, v5);
                ByteBuffer byteBuffer3 = (ByteBuffer)pair1.first;
                long v7 = (long)(((Long)pair1.second));
                if(byteBuffer3.order() != byteOrder0) {
                    throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                }
                int v8 = byteBuffer3.capacity();
                if(v8 - 24 < 8) {
                    throw new IllegalArgumentException("end < start: " + (v8 - 24) + " < " + 8);
                }
                int v9 = byteBuffer3.capacity();
                if(v8 - 24 > byteBuffer3.capacity()) {
                    throw new IllegalArgumentException("end > capacity: " + (v8 - 24) + " > " + v9);
                }
                try {
                    v10 = byteBuffer3.limit();
                    v11 = byteBuffer3.position();
                    byteBuffer3.position(0);
                    byteBuffer3.limit(v8 - 24);
                    byteBuffer3.position(8);
                    byteBuffer4 = byteBuffer3.slice();
                    byteBuffer4.order(byteBuffer3.order());
                }
                catch(Throwable throwable0) {
                    byteBuffer3.position(0);
                    byteBuffer3.limit(v10);
                    byteBuffer3.position(v11);
                    throw throwable0;
                }
                byteBuffer3.position(0);
                byteBuffer3.limit(v10);
                byteBuffer3.position(v11);
                while(byteBuffer4.hasRemaining()) {
                    ++v3;
                    if(byteBuffer4.remaining() < 8) {
                        throw new zzaoo("Insufficient data to read size of APK Signing Block entry #" + v3);
                    }
                    long v12 = byteBuffer4.getLong();
                    if(v12 < 4L || v12 > 0x7FFFFFFFL) {
                        throw new zzaoo("APK Signing Block entry #" + v3 + " size out of range: " + v12);
                    }
                    int v13 = byteBuffer4.position();
                    if(((int)v12) > byteBuffer4.remaining()) {
                        throw new zzaoo("APK Signing Block entry #" + v3 + " size out of range: " + ((int)v12) + ", available: " + byteBuffer4.remaining());
                    }
                    if(byteBuffer4.getInt() == 0x7109871A) {
                        zzaon zzaon0 = new zzaon(zzaos.zze(byteBuffer4, ((int)v12) - 4), v7, v2, v1, byteBuffer0, null);
                        X509Certificate[][] arr2_x509Certificate = zzaos.zzl(randomAccessFile0.getChannel(), zzaon0);
                        randomAccessFile0.close();
                        try {
                        }
                        catch(IOException unused_ex) {
                        }
                        return arr2_x509Certificate;
                    }
                    byteBuffer4.position(v13 + ((int)v12));
                }
                throw new zzaoo("No APK Signature Scheme v2 block in APK Signing Block");
            }
        }
        finally {
            randomAccessFile0.close();
        }
        throw new zzaoo("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile0.length() + " bytes");
    }

    private static int zzb(int v) {
        switch(v) {
            case 1: {
                return 0x20;
            }
            case 2: {
                return 0x40;
            }
            default: {
                throw new IllegalArgumentException("Unknown content digest algorthm: " + v);
            }
        }
    }

    private static int zzc(int v) {
        switch(v) {
            case 0x102: 
            case 260: 
            case 0x202: {
                return 2;
            }
            case 0x101: 
            case 0x103: 
            case 0x201: 
            case 0x301: {
                return 1;
            }
            default: {
                throw new IllegalArgumentException("Unknown signature algorithm: 0x" + Long.toHexString(v));
            }
        }
    }

    private static String zzd(int v) {
        switch(v) {
            case 1: {
                return "SHA-256";
            }
            case 2: {
                return "SHA-512";
            }
            default: {
                throw new IllegalArgumentException("Unknown content digest algorthm: " + v);
            }
        }
    }

    private static ByteBuffer zze(ByteBuffer byteBuffer0, int v) throws BufferUnderflowException {
        int v1 = byteBuffer0.limit();
        int v2 = byteBuffer0.position();
        int v3 = v + v2;
        if(v3 >= v2 && v3 <= v1) {
            byteBuffer0.limit(v3);
            try {
                ByteBuffer byteBuffer1 = byteBuffer0.slice();
                byteBuffer1.order(byteBuffer0.order());
                byteBuffer0.position(v3);
                return byteBuffer1;
            }
            finally {
                byteBuffer0.limit(v1);
            }
        }
        throw new BufferUnderflowException();
    }

    private static ByteBuffer zzf(ByteBuffer byteBuffer0) throws IOException {
        if(byteBuffer0.remaining() < 4) {
            throw new IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer0.remaining());
        }
        int v = byteBuffer0.getInt();
        if(v < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if(v > byteBuffer0.remaining()) {
            throw new IOException("Length-prefixed field longer than remaining buffer. Field length: " + v + ", remaining: " + byteBuffer0.remaining());
        }
        return zzaos.zze(byteBuffer0, v);
    }

    private static void zzg(int v, byte[] arr_b, int v1) {
        arr_b[1] = (byte)(v & 0xFF);
        arr_b[2] = (byte)(v >>> 8 & 0xFF);
        arr_b[3] = (byte)(v >>> 16 & 0xFF);
        arr_b[4] = (byte)(v >> 24);
    }

    private static void zzh(Map map0, FileChannel fileChannel0, long v, long v1, long v2, ByteBuffer byteBuffer0) throws SecurityException {
        if(map0.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        zzaom zzaom0 = new zzaom(fileChannel0, 0L, v);
        zzaom zzaom1 = new zzaom(fileChannel0, v1, v2 - v1);
        ByteBuffer byteBuffer1 = byteBuffer0.duplicate();
        byteBuffer1.order(ByteOrder.LITTLE_ENDIAN);
        zzaot.zzd(byteBuffer1, v);
        zzaok zzaok0 = new zzaok(byteBuffer1);
        int v4 = map0.size();
        int[] arr_v = new int[v4];
        int v5 = 0;
        for(Object object0: map0.keySet()) {
            arr_v[v5] = (int)(((Integer)object0));
            ++v5;
        }
        try {
            byte[][] arr2_b = zzaos.zzk(arr_v, new zzaol[]{zzaom0, zzaom1, zzaok0});
        }
        catch(DigestException digestException0) {
            throw new SecurityException("Failed to compute digest(s) of contents", digestException0);
        }
        for(int v3 = 0; v3 < v4; ++v3) {
            int v6 = arr_v[v3];
            if(!MessageDigest.isEqual(((byte[])map0.get(v6)), arr2_b[v3])) {
                throw new SecurityException(zzaos.zzd(v6) + " digest of contents did not verify");
            }
        }
    }

    private static byte[] zzi(ByteBuffer byteBuffer0) throws IOException {
        int v = byteBuffer0.getInt();
        if(v < 0) {
            throw new IOException("Negative length");
        }
        if(v > byteBuffer0.remaining()) {
            throw new IOException("Underflow while reading length-prefixed value. Length: " + v + ", available: " + byteBuffer0.remaining());
        }
        byte[] arr_b = new byte[v];
        byteBuffer0.get(arr_b);
        return arr_b;
    }

    private static X509Certificate[] zzj(ByteBuffer byteBuffer0, Map map0, CertificateFactory certificateFactory0) throws SecurityException, IOException {
        X509Certificate x509Certificate0;
        Pair pair0;
        String s;
        ByteBuffer byteBuffer1 = zzaos.zzf(byteBuffer0);
        ByteBuffer byteBuffer2 = zzaos.zzf(byteBuffer0);
        byte[] arr_b = zzaos.zzi(byteBuffer0);
        ArrayList arrayList0 = new ArrayList();
        byte[] arr_b1 = null;
        byte[] arr_b2 = null;
        int v = -1;
        int v1 = 0;
        while(byteBuffer2.hasRemaining()) {
            try {
                ++v1;
                ByteBuffer byteBuffer3 = zzaos.zzf(byteBuffer2);
                if(byteBuffer3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int v2 = byteBuffer3.getInt();
                arrayList0.add(v2);
                if(v2 != 0x201 && v2 != 0x202 && v2 != 0x301 && (v2 != 0x101 && v2 != 0x102 && v2 != 0x103 && v2 != 260) || v != -1 && (zzaos.zzc(v2) == 1 || zzaos.zzc(v) != 1)) {
                    continue;
                }
                arr_b2 = zzaos.zzi(byteBuffer3);
                v = v2;
                continue;
            }
            catch(IOException | BufferUnderflowException iOException0) {
            }
            throw new SecurityException("Failed to parse signature record #" + v1, iOException0);
        }
        if(v == -1) {
            throw v1 == 0 ? new SecurityException("No signatures found") : new SecurityException("No supported signatures found");
        }
        switch(v) {
            case 0x201: 
            case 0x202: {
                s = "EC";
                break;
            }
            case 0x301: {
                s = "DSA";
                break;
            }
            default: {
                if(v != 0x101 && v != 0x102 && v != 0x103 && v != 260) {
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x" + Long.toHexString(v));
                }
                s = "RSA";
            }
        }
        switch(v) {
            case 0x101: {
                pair0 = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 0x20, 1));
                break;
            }
            case 0x102: {
                pair0 = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 0x40, 1));
                break;
            }
            case 0x103: {
                pair0 = Pair.create("SHA256withRSA", null);
                break;
            }
            case 260: {
                pair0 = Pair.create("SHA512withRSA", null);
                break;
            }
            case 0x201: {
                pair0 = Pair.create("SHA256withECDSA", null);
                break;
            }
            case 0x202: {
                pair0 = Pair.create("SHA512withECDSA", null);
                break;
            }
            case 0x301: {
                pair0 = Pair.create("SHA256withDSA", null);
                break;
            }
            default: {
                throw new IllegalArgumentException("Unknown signature algorithm: 0x" + Long.toHexString(v));
            }
        }
        String s1 = (String)pair0.first;
        AlgorithmParameterSpec algorithmParameterSpec0 = (AlgorithmParameterSpec)pair0.second;
        try {
            PublicKey publicKey0 = KeyFactory.getInstance(s).generatePublic(new X509EncodedKeySpec(arr_b));
            Signature signature0 = Signature.getInstance(s1);
            signature0.initVerify(publicKey0);
            if(algorithmParameterSpec0 != null) {
                signature0.setParameter(algorithmParameterSpec0);
            }
            signature0.update(byteBuffer1);
            if(!signature0.verify(arr_b2)) {
                throw new SecurityException(s1 + " signature did not verify");
            }
        }
        catch(NoSuchAlgorithmException | InvalidKeySpecException | InvalidKeyException | InvalidAlgorithmParameterException | SignatureException noSuchAlgorithmException0) {
            throw new SecurityException("Failed to verify " + s1 + " signature", noSuchAlgorithmException0);
        }
        byteBuffer1.clear();
        ByteBuffer byteBuffer4 = zzaos.zzf(byteBuffer1);
        ArrayList arrayList1 = new ArrayList();
        int v3 = 0;
        while(byteBuffer4.hasRemaining()) {
            try {
                ++v3;
                ByteBuffer byteBuffer5 = zzaos.zzf(byteBuffer4);
                if(byteBuffer5.remaining() < 8) {
                    throw new IOException("Record too short");
                }
                int v4 = byteBuffer5.getInt();
                arrayList1.add(v4);
                if(v4 != v) {
                    continue;
                }
                arr_b1 = zzaos.zzi(byteBuffer5);
                continue;
            }
            catch(IOException | BufferUnderflowException iOException1) {
            }
            throw new IOException("Failed to parse digest record #" + v3, iOException1);
        }
        if(!arrayList0.equals(arrayList1)) {
            throw new SecurityException("Signature algorithms don\'t match between digests and signatures records");
        }
        int v5 = zzaos.zzc(v);
        byte[] arr_b3 = (byte[])map0.put(v5, arr_b1);
        if(arr_b3 != null && !MessageDigest.isEqual(arr_b3, arr_b1)) {
            throw new SecurityException(zzaos.zzd(v5) + " contents digest does not match the digest specified by a preceding signer");
        }
        ByteBuffer byteBuffer6 = zzaos.zzf(byteBuffer1);
        ArrayList arrayList2 = new ArrayList();
        int v6 = 0;
        while(byteBuffer6.hasRemaining()) {
            ++v6;
            byte[] arr_b4 = zzaos.zzi(byteBuffer6);
            try {
                x509Certificate0 = (X509Certificate)certificateFactory0.generateCertificate(new ByteArrayInputStream(arr_b4));
            }
            catch(CertificateException certificateException0) {
                throw new SecurityException("Failed to decode certificate #" + v6, certificateException0);
            }
            arrayList2.add(new zzaop(x509Certificate0, arr_b4));
        }
        if(arrayList2.isEmpty()) {
            throw new SecurityException("No certificates listed");
        }
        if(!Arrays.equals(arr_b, ((X509Certificate)arrayList2.get(0)).getPublicKey().getEncoded())) {
            throw new SecurityException("Public key mismatch between certificate and signature record");
        }
        return (X509Certificate[])arrayList2.toArray(new X509Certificate[arrayList2.size()]);
    }

    private static byte[][] zzk(int[] arr_v, zzaol[] arr_zzaol) throws DigestException {
        MessageDigest messageDigest1;
        int v11;
        int v = 0;
        long v1 = 0L;
        for(int v2 = 0; v2 < 3; ++v2) {
            v1 += (arr_zzaol[v2].zza() + 0xFFFFFL) / 0x100000L;
        }
        if(v1 >= 0x1FFFFFL) {
            throw new DigestException("Too many chunks: " + v1);
        }
        byte[][] arr2_b = new byte[arr_v.length][];
        for(int v3 = 0; v3 < arr_v.length; ++v3) {
            byte[] arr_b = new byte[zzaos.zzb(arr_v[v3]) * ((int)v1) + 5];
            arr_b[0] = 90;
            zzaos.zzg(((int)v1), arr_b, 1);
            arr2_b[v3] = arr_b;
        }
        byte[] arr_b1 = new byte[5];
        arr_b1[0] = -91;
        MessageDigest[] arr_messageDigest = new MessageDigest[arr_v.length];
        for(int v4 = 0; v4 < arr_v.length; ++v4) {
            String s = zzaos.zzd(arr_v[v4]);
            try {
                arr_messageDigest[v4] = MessageDigest.getInstance(s);
            }
            catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
                throw new RuntimeException(s + " digest not supported", noSuchAlgorithmException0);
            }
        }
        int v5 = 0;
        for(int v6 = 0; v6 < 3; ++v6) {
            zzaol zzaol0 = arr_zzaol[v6];
            long v8 = zzaol0.zza();
            for(long v7 = 0L; v8 > 0L; v7 += (long)v9) {
                int v9 = (int)Math.min(v8, 0x100000L);
                zzaos.zzg(v9, arr_b1, 1);
                for(int v10 = 0; v10 < arr_v.length; ++v10) {
                    arr_messageDigest[v10].update(arr_b1);
                }
                try {
                    zzaol0.zzb(arr_messageDigest, v7, v9);
                    v11 = 0;
                }
                catch(IOException iOException0) {
                    throw new DigestException("Failed to digest chunk #" + v5 + " of section #" + v, iOException0);
                }
                while(v11 < arr_v.length) {
                    int v12 = arr_v[v11];
                    byte[] arr_b2 = arr2_b[v11];
                    int v13 = zzaos.zzb(v12);
                    MessageDigest messageDigest0 = arr_messageDigest[v11];
                    int v14 = messageDigest0.digest(arr_b2, v5 * v13 + 5, v13);
                    if(v14 != v13) {
                        throw new RuntimeException("Unexpected output size of " + messageDigest0.getAlgorithm() + " digest: " + v14);
                    }
                    ++v11;
                }
                v8 -= (long)v9;
                ++v5;
            }
            ++v;
        }
        byte[][] arr2_b1 = new byte[arr_v.length][];
        for(int v15 = 0; v15 < arr_v.length; ++v15) {
            int v16 = arr_v[v15];
            byte[] arr_b3 = arr2_b[v15];
            String s1 = zzaos.zzd(v16);
            try {
                messageDigest1 = MessageDigest.getInstance(s1);
            }
            catch(NoSuchAlgorithmException noSuchAlgorithmException1) {
                throw new RuntimeException(s1 + " digest not supported", noSuchAlgorithmException1);
            }
            arr2_b1[v15] = messageDigest1.digest(arr_b3);
        }
        return arr2_b1;
    }

    private static X509Certificate[][] zzl(FileChannel fileChannel0, zzaon zzaon0) throws SecurityException {
        int v;
        ByteBuffer byteBuffer0;
        CertificateFactory certificateFactory0;
        HashMap hashMap0 = new HashMap();
        ArrayList arrayList0 = new ArrayList();
        try {
            certificateFactory0 = CertificateFactory.getInstance("X.509");
        }
        catch(CertificateException certificateException0) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", certificateException0);
        }
        try {
            byteBuffer0 = zzaos.zzf(zzaon0.zza);
            v = 0;
        }
        catch(IOException iOException0) {
            throw new SecurityException("Failed to read list of signers", iOException0);
        }
        while(byteBuffer0.hasRemaining()) {
            try {
                ++v;
                arrayList0.add(zzaos.zzj(zzaos.zzf(byteBuffer0), hashMap0, certificateFactory0));
            }
            catch(IOException | BufferUnderflowException | SecurityException iOException1) {
                throw new SecurityException("Failed to parse/verify signer #" + v + " block", iOException1);
            }
        }
        if(v <= 0) {
            throw new SecurityException("No signers found");
        }
        if(hashMap0.isEmpty()) {
            throw new SecurityException("No content digests found");
        }
        zzaos.zzh(hashMap0, fileChannel0, zzaon0.zzb, zzaon0.zzc, zzaon0.zzd, zzaon0.zze);
        return (X509Certificate[][])arrayList0.toArray(new X509Certificate[arrayList0.size()][]);
    }
}

