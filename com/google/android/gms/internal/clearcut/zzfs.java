package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

public final class zzfs {
    private final ByteBuffer zzgd;
    private zzbn zzrh;
    private int zzri;

    private zzfs(ByteBuffer byteBuffer0) {
        this.zzgd = byteBuffer0;
        byteBuffer0.order(ByteOrder.LITTLE_ENDIAN);
    }

    private zzfs(byte[] arr_b, int v, int v1) {
        this(ByteBuffer.wrap(arr_b, v, v1));
    }

    private static int zza(CharSequence charSequence0) {
        int v = charSequence0.length();
        int v1 = 0;
        int v2;
        for(v2 = 0; v2 < v && charSequence0.charAt(v2) < 0x80; ++v2) {
        }
        int v3 = v;
        while(v2 < v) {
            int v4 = charSequence0.charAt(v2);
            if(v4 < 0x800) {
                v3 += 0x7F - v4 >>> 0x1F;
                ++v2;
            }
            else {
                int v5 = charSequence0.length();
                while(v2 < v5) {
                    int v6 = charSequence0.charAt(v2);
                    if(v6 < 0x800) {
                        v1 += 0x7F - v6 >>> 0x1F;
                    }
                    else {
                        v1 += 2;
                        if(0xD800 <= v6 && v6 <= 0xDFFF) {
                            if(Character.codePointAt(charSequence0, v2) < 0x10000) {
                                throw new IllegalArgumentException("Unpaired surrogate at index " + v2);
                            }
                            ++v2;
                        }
                    }
                    ++v2;
                }
                v3 += v1;
                if(true) {
                    break;
                }
            }
        }
        if(v3 < v) {
            throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long)v3) + 0x100000000L));
        }
        return v3;
    }

    public final void zza(int v, zzfz zzfz0) throws IOException {
        this.zzb(v, 2);
        if(zzfz0.zzrs < 0) {
            zzfz0.zzas();
        }
        this.zzap(zzfz0.zzrs);
        zzfz0.zza(this);
    }

    public final void zza(int v, String s) throws IOException {
        this.zzb(v, 2);
        try {
            int v1 = zzfs.zzz(s.length());
            if(v1 == zzfs.zzz(s.length() * 3)) {
                int v2 = this.zzgd.position();
                if(this.zzgd.remaining() < v1) {
                    throw new zzft(v2 + v1, this.zzgd.limit());
                }
                this.zzgd.position(v2 + v1);
                zzfs.zzd(s, this.zzgd);
                int v3 = this.zzgd.position();
                this.zzgd.position(v2);
                this.zzap(v3 - v2 - v1);
                this.zzgd.position(v3);
                return;
            }
            this.zzap(zzfs.zza(s));
            zzfs.zzd(s, this.zzgd);
            return;
        }
        catch(BufferOverflowException bufferOverflowException0) {
        }
        zzft zzft0 = new zzft(this.zzgd.position(), this.zzgd.limit());
        zzft0.initCause(bufferOverflowException0);
        throw zzft0;
    }

    public final void zza(int v, byte[] arr_b) throws IOException {
        this.zzb(v, 2);
        this.zzap(arr_b.length);
        if(this.zzgd.remaining() < arr_b.length) {
            throw new zzft(this.zzgd.position(), this.zzgd.limit());
        }
        this.zzgd.put(arr_b, 0, arr_b.length);
    }

    private final void zzao(int v) throws IOException {
        if(!this.zzgd.hasRemaining()) {
            throw new zzft(this.zzgd.position(), this.zzgd.limit());
        }
        this.zzgd.put(((byte)v));
    }

    private final void zzap(int v) throws IOException {
        while((v & 0xFFFFFF80) != 0) {
            this.zzao(v & 0x7F | 0x80);
            v >>>= 7;
        }
        this.zzao(v);
    }

    public static int zzb(int v, zzfz zzfz0) {
        int v1 = zzfz0.zzas();
        return zzfs.zzr(v) + (zzfs.zzz(v1) + v1);
    }

    public static int zzb(int v, String s) {
        return zzfs.zzr(v) + zzfs.zzh(s);
    }

    public static int zzb(int v, byte[] arr_b) {
        return zzfs.zzr(v) + zzfs.zzh(arr_b);
    }

    public final void zzb(int v, int v1) throws IOException {
        this.zzap(v << 3 | v1);
    }

    public final void zzb(int v, boolean z) throws IOException {
        this.zzb(25, 0);
        if(!this.zzgd.hasRemaining()) {
            throw new zzft(this.zzgd.position(), this.zzgd.limit());
        }
        this.zzgd.put(((byte)z));
    }

    public final void zzc(int v, int v1) throws IOException {
        this.zzb(v, 0);
        if(v1 >= 0) {
            this.zzap(v1);
            return;
        }
        this.zzn(((long)v1));
    }

    public static int zzd(int v, long v1) {
        return zzfs.zzr(v) + zzfs.zzo(v1);
    }

    private static void zzd(CharSequence charSequence0, ByteBuffer byteBuffer0) {
        int v6;
        int v = 0;
        if(byteBuffer0.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        if(byteBuffer0.hasArray()) {
            try {
                byte[] arr_b = byteBuffer0.array();
                int v1 = byteBuffer0.arrayOffset() + byteBuffer0.position();
                int v2 = charSequence0.length();
                int v3 = byteBuffer0.remaining() + v1;
                while(v < v2) {
                    int v4 = v + v1;
                    if(v4 >= v3) {
                        break;
                    }
                    int v5 = charSequence0.charAt(v);
                    if(v5 >= 0x80) {
                        break;
                    }
                    arr_b[v4] = (byte)v5;
                    ++v;
                }
                if(v == v2) {
                    v6 = v1 + v2;
                }
                else {
                    v6 = v1 + v;
                    while(v < v2) {
                        int v7 = charSequence0.charAt(v);
                        if(v7 < 0x80 && v6 < v3) {
                            arr_b[v6] = (byte)v7;
                            ++v6;
                        }
                        else if(v7 < 0x800 && v6 <= v3 - 2) {
                            int v8 = v6 + 1;
                            arr_b[v6] = (byte)(v7 >>> 6 | 960);
                            v6 += 2;
                            arr_b[v8] = (byte)(v7 & 0x3F | 0x80);
                        }
                        else if(v7 >= 0xD800 && 0xDFFF >= v7 || v6 > v3 - 3) {
                            if(v6 > v3 - 4) {
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char)v7) + " at index " + v6);
                            }
                            if(v + 1 == charSequence0.length()) {
                                throw new IllegalArgumentException("Unpaired surrogate at index " + (v - 1));
                            }
                            int v10 = charSequence0.charAt(v + 1);
                            if(!Character.isSurrogatePair(((char)v7), ((char)v10))) {
                                ++v;
                                throw new IllegalArgumentException("Unpaired surrogate at index " + (v - 1));
                            }
                            int v11 = Character.toCodePoint(((char)v7), ((char)v10));
                            arr_b[v6] = (byte)(v11 >>> 18 | 0xF0);
                            arr_b[v6 + 1] = (byte)(v11 >>> 12 & 0x3F | 0x80);
                            int v12 = v6 + 3;
                            arr_b[v6 + 2] = (byte)(v11 >>> 6 & 0x3F | 0x80);
                            v6 += 4;
                            arr_b[v12] = (byte)(v11 & 0x3F | 0x80);
                            ++v;
                        }
                        else {
                            arr_b[v6] = (byte)(v7 >>> 12 | 480);
                            int v9 = v6 + 2;
                            arr_b[v6 + 1] = (byte)(v7 >>> 6 & 0x3F | 0x80);
                            v6 += 3;
                            arr_b[v9] = (byte)(v7 & 0x3F | 0x80);
                        }
                        ++v;
                    }
                }
                byteBuffer0.position(v6 - byteBuffer0.arrayOffset());
                return;
            }
            catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException0) {
            }
            BufferOverflowException bufferOverflowException0 = new BufferOverflowException();
            bufferOverflowException0.initCause(arrayIndexOutOfBoundsException0);
            throw bufferOverflowException0;
        }
        int v13 = charSequence0.length();
        while(v < v13) {
            int v14 = charSequence0.charAt(v);
            if(v14 >= 0x80) {
                if(v14 < 0x800) {
                    byteBuffer0.put(((byte)(v14 >>> 6 | 960)));
                    byteBuffer0.put(((byte)(v14 & 0x3F | 0x80)));
                    goto label_87;
                }
                else if(v14 < 0xD800 || 0xDFFF < v14) {
                    byteBuffer0.put(((byte)(v14 >>> 12 | 480)));
                    byteBuffer0.put(((byte)(v14 >>> 6 & 0x3F | 0x80)));
                    byteBuffer0.put(((byte)(v14 & 0x3F | 0x80)));
                    goto label_87;
                }
                else {
                    if(v + 1 != charSequence0.length()) {
                        int v15 = charSequence0.charAt(v + 1);
                        if(Character.isSurrogatePair(((char)v14), ((char)v15))) {
                            int v16 = Character.toCodePoint(((char)v14), ((char)v15));
                            byteBuffer0.put(((byte)(v16 >>> 18 | 0xF0)));
                            byteBuffer0.put(((byte)(v16 >>> 12 & 0x3F | 0x80)));
                            byteBuffer0.put(((byte)(v16 >>> 6 & 0x3F | 0x80)));
                            byteBuffer0.put(((byte)(v16 & 0x3F | 0x80)));
                            ++v;
                            goto label_87;
                        }
                        else {
                            ++v;
                        }
                    }
                    throw new IllegalArgumentException("Unpaired surrogate at index " + (v - 1));
                }
                goto label_86;
            }
            else {
            label_86:
                byteBuffer0.put(((byte)v14));
            }
        label_87:
            ++v;
        }
    }

    public final void zze(int v, zzdo zzdo0) throws IOException {
        if(this.zzrh == null) {
            this.zzrh = zzbn.zza(this.zzgd);
            this.zzri = this.zzgd.position();
        }
        else if(this.zzri != this.zzgd.position()) {
            this.zzrh.write(this.zzgd.array(), this.zzri, this.zzgd.position() - this.zzri);
            this.zzri = this.zzgd.position();
        }
        zzbn zzbn0 = this.zzrh;
        zzbn0.zza(v, zzdo0);
        zzbn0.flush();
        this.zzri = this.zzgd.position();
    }

    public final void zzem() {
        if(this.zzgd.remaining() != 0) {
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", this.zzgd.remaining()));
        }
    }

    public static zzfs zzg(byte[] arr_b) {
        return zzfs.zzh(arr_b, 0, arr_b.length);
    }

    public static int zzh(String s) {
        int v = zzfs.zza(s);
        return zzfs.zzz(v) + v;
    }

    public static int zzh(byte[] arr_b) {
        return zzfs.zzz(arr_b.length) + arr_b.length;
    }

    public static zzfs zzh(byte[] arr_b, int v, int v1) {
        return new zzfs(arr_b, 0, v1);
    }

    public final void zzi(int v, long v1) throws IOException {
        this.zzb(v, 0);
        this.zzn(v1);
    }

    public static long zzj(long v) [...] // Inlined contents

    public final void zzn(long v) throws IOException {
        while((0xFFFFFFFFFFFFFF80L & v) != 0L) {
            this.zzao(((int)v) & 0x7F | 0x80);
            v >>>= 7;
        }
        this.zzao(((int)v));
    }

    public static int zzo(long v) {
        if((0xFFFFFFFFFFFFFF80L & v) == 0L) {
            return 1;
        }
        if((0xFFFFFFFFFFFFC000L & v) == 0L) {
            return 2;
        }
        if((0xFFFFFFFFFFE00000L & v) == 0L) {
            return 3;
        }
        if((0xFFFFFFFFF0000000L & v) == 0L) {
            return 4;
        }
        if((0xFFFFFFF800000000L & v) == 0L) {
            return 5;
        }
        if((0xFFFFFC0000000000L & v) == 0L) {
            return 6;
        }
        if((0xFFFE000000000000L & v) == 0L) {
            return 7;
        }
        if((0xFF00000000000000L & v) == 0L) {
            return 8;
        }
        return (v & 0x8000000000000000L) == 0L ? 9 : 10;
    }

    public static int zzr(int v) [...] // 潜在的解密器

    public static int zzs(int v) {
        return v < 0 ? 10 : zzfs.zzz(v);
    }

    private static int zzz(int v) {
        if((v & 0xFFFFFF80) == 0) {
            return 1;
        }
        if((v & 0xFFFFC000) == 0) {
            return 2;
        }
        if((0xFFE00000 & v) == 0) {
            return 3;
        }
        return (v & 0xF0000000) == 0 ? 4 : 5;
    }
}

