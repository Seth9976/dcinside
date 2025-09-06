package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzii extends zzhq {
    static final class zza extends zzii {
        private final byte[] zzb;
        private final int zzc;
        private final int zzd;
        private int zze;

        zza(byte[] arr_b, int v, int v1) {
            super(null);
            if(arr_b == null) {
                throw new NullPointerException("buffer");
            }
            if((arr_b.length - v1 | v1) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", ((int)arr_b.length), 0, v1));
            }
            this.zzb = arr_b;
            this.zzc = 0;
            this.zze = 0;
            this.zzd = v1;
        }

        @Override  // com.google.android.gms.internal.vision.zzii
        public final int zza() {
            return this.zzd - this.zze;
        }

        @Override  // com.google.android.gms.internal.vision.zzii
        public final void zza(byte b) throws IOException {
            try {
                int v = this.zze;
                this.zze = v + 1;
                this.zzb[v] = b;
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", this.zze, this.zzd, 1), indexOutOfBoundsException0);
            }
        }

        @Override  // com.google.android.gms.internal.vision.zzii
        public final void zza(int v) throws IOException {
            if(v >= 0) {
                this.zzb(v);
                return;
            }
            this.zza(((long)v));
        }

        @Override  // com.google.android.gms.internal.vision.zzii
        public final void zza(int v, int v1) throws IOException {
            this.zzb(v << 3 | v1);
        }

        @Override  // com.google.android.gms.internal.vision.zzii
        public final void zza(int v, long v1) throws IOException {
            this.zza(v, 0);
            this.zza(v1);
        }

        @Override  // com.google.android.gms.internal.vision.zzii
        public final void zza(int v, zzht zzht0) throws IOException {
            this.zza(v, 2);
            this.zza(zzht0);
        }

        @Override  // com.google.android.gms.internal.vision.zzii
        public final void zza(int v, zzkk zzkk0) throws IOException {
            this.zza(1, 3);
            this.zzc(2, v);
            this.zza(3, 2);
            this.zza(zzkk0);
            this.zza(1, 4);
        }

        @Override  // com.google.android.gms.internal.vision.zzii
        final void zza(int v, zzkk zzkk0, zzlc zzlc0) throws IOException {
            this.zza(v, 2);
            int v1 = ((zzhf)zzkk0).zzi();
            if(v1 == -1) {
                v1 = zzlc0.zzb(((zzhf)zzkk0));
                ((zzhf)zzkk0).zzb(v1);
            }
            this.zzb(v1);
            zzlc0.zza(zzkk0, this.zza);
        }

        @Override  // com.google.android.gms.internal.vision.zzii
        public final void zza(int v, String s) throws IOException {
            this.zza(v, 2);
            this.zza(s);
        }

        @Override  // com.google.android.gms.internal.vision.zzii
        public final void zza(int v, boolean z) throws IOException {
            this.zza(v, 0);
            this.zza(((byte)z));
        }

        @Override  // com.google.android.gms.internal.vision.zzii
        public final void zza(long v) throws IOException {
            if(this.zza() >= 10) {
                while((v & 0xFFFFFFFFFFFFFF80L) != 0L) {
                    int v1 = this.zze;
                    this.zze = v1 + 1;
                    zzma.zza(this.zzb, ((long)v1), ((byte)(((int)v) & 0x7F | 0x80)));
                    v >>>= 7;
                }
                int v2 = this.zze;
                this.zze = v2 + 1;
                zzma.zza(this.zzb, ((long)v2), ((byte)(((int)v))));
                return;
            }
            try {
                while(true) {
                    if((v & 0xFFFFFFFFFFFFFF80L) == 0L) {
                        int v3 = this.zze;
                        this.zze = v3 + 1;
                        this.zzb[v3] = (byte)(((int)v));
                        return;
                    }
                    int v4 = this.zze;
                    this.zze = v4 + 1;
                    this.zzb[v4] = (byte)(((int)v) & 0x7F | 0x80);
                    v >>>= 7;
                }
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            }
            throw new zzb(String.format("Pos: %d, limit: %d, len: %d", this.zze, this.zzd, 1), indexOutOfBoundsException0);
        }

        @Override  // com.google.android.gms.internal.vision.zzii
        public final void zza(zzht zzht0) throws IOException {
            this.zzb(zzht0.zza());
            zzht0.zza(this);
        }

        @Override  // com.google.android.gms.internal.vision.zzii
        public final void zza(zzkk zzkk0) throws IOException {
            this.zzb(zzkk0.zzm());
            zzkk0.zza(this);
        }

        @Override  // com.google.android.gms.internal.vision.zzii
        public final void zza(String s) throws IOException {
            int v;
            try {
                v = this.zze;
                int v1 = zzii.zzg(s.length());
                if(v1 == zzii.zzg(s.length() * 3)) {
                    int v2 = v + v1;
                    this.zze = v2;
                    int v3 = this.zza();
                    int v4 = zzmd.zza(s, this.zzb, v2, v3);
                    this.zze = v;
                    this.zzb(v4 - v - v1);
                    this.zze = v4;
                    return;
                }
                this.zzb(zzmd.zza(s));
                int v5 = this.zze;
                int v6 = this.zza();
                this.zze = zzmd.zza(s, this.zzb, v5, v6);
                return;
            }
            catch(zzmg zzmg0) {
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                throw new zzb(indexOutOfBoundsException0);
            }
            this.zze = v;
            this.zza(s, zzmg0);
        }

        @Override  // com.google.android.gms.internal.vision.zzhq
        public final void zza(byte[] arr_b, int v, int v1) throws IOException {
            this.zzc(arr_b, v, v1);
        }

        @Override  // com.google.android.gms.internal.vision.zzii
        public final void zzb(int v) throws IOException {
            if(this.zza() >= 5) {
                if((v & 0xFFFFFF80) == 0) {
                    int v1 = this.zze;
                    this.zze = v1 + 1;
                    zzma.zza(this.zzb, ((long)v1), ((byte)v));
                    return;
                }
                int v2 = this.zze;
                this.zze = v2 + 1;
                zzma.zza(this.zzb, ((long)v2), ((byte)(v | 0x80)));
                if((v >>> 7 & 0xFFFFFF80) == 0) {
                    int v3 = this.zze;
                    this.zze = v3 + 1;
                    zzma.zza(this.zzb, ((long)v3), ((byte)(v >>> 7)));
                    return;
                }
                int v4 = this.zze;
                this.zze = v4 + 1;
                zzma.zza(this.zzb, ((long)v4), ((byte)(v >>> 7 | 0x80)));
                if((v >>> 14 & 0xFFFFFF80) == 0) {
                    int v5 = this.zze;
                    this.zze = v5 + 1;
                    zzma.zza(this.zzb, ((long)v5), ((byte)(v >>> 14)));
                    return;
                }
                int v6 = this.zze;
                this.zze = v6 + 1;
                zzma.zza(this.zzb, ((long)v6), ((byte)(v >>> 14 | 0x80)));
                if((v >>> 21 & 0xFFFFFF80) == 0) {
                    int v7 = this.zze;
                    this.zze = v7 + 1;
                    zzma.zza(this.zzb, ((long)v7), ((byte)(v >>> 21)));
                    return;
                }
                int v8 = this.zze;
                this.zze = v8 + 1;
                zzma.zza(this.zzb, ((long)v8), ((byte)(v >>> 21 | 0x80)));
                int v9 = this.zze;
                this.zze = v9 + 1;
                zzma.zza(this.zzb, ((long)v9), ((byte)(v >>> 28)));
                return;
            }
            try {
                while(true) {
                    if((v & 0xFFFFFF80) == 0) {
                        int v10 = this.zze;
                        this.zze = v10 + 1;
                        this.zzb[v10] = (byte)v;
                        return;
                    }
                    int v11 = this.zze;
                    this.zze = v11 + 1;
                    this.zzb[v11] = (byte)(v & 0x7F | 0x80);
                    v >>>= 7;
                }
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            }
            throw new zzb(String.format("Pos: %d, limit: %d, len: %d", this.zze, this.zzd, 1), indexOutOfBoundsException0);
        }

        @Override  // com.google.android.gms.internal.vision.zzii
        public final void zzb(int v, int v1) throws IOException {
            this.zza(v, 0);
            this.zza(v1);
        }

        @Override  // com.google.android.gms.internal.vision.zzii
        public final void zzb(int v, zzht zzht0) throws IOException {
            this.zza(1, 3);
            this.zzc(2, v);
            this.zza(3, zzht0);
            this.zza(1, 4);
        }

        @Override  // com.google.android.gms.internal.vision.zzii
        public final void zzb(byte[] arr_b, int v, int v1) throws IOException {
            this.zzb(v1);
            this.zzc(arr_b, 0, v1);
        }

        private final void zzc(byte[] arr_b, int v, int v1) throws IOException {
            try {
                System.arraycopy(arr_b, v, this.zzb, this.zze, v1);
                this.zze += v1;
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", this.zze, this.zzd, v1), indexOutOfBoundsException0);
            }
        }

        @Override  // com.google.android.gms.internal.vision.zzii
        public final void zzc(int v, int v1) throws IOException {
            this.zza(v, 0);
            this.zzb(v1);
        }

        @Override  // com.google.android.gms.internal.vision.zzii
        public final void zzc(int v, long v1) throws IOException {
            this.zza(v, 1);
            this.zzc(v1);
        }

        @Override  // com.google.android.gms.internal.vision.zzii
        public final void zzc(long v) throws IOException {
            try {
                int v1 = this.zze;
                this.zze = v1 + 1;
                this.zzb[v1] = (byte)(((int)v));
                this.zze = v1 + 2;
                this.zzb[v1 + 1] = (byte)(((int)(v >> 8)));
                this.zze = v1 + 3;
                this.zzb[v1 + 2] = (byte)(((int)(v >> 16)));
                this.zze = v1 + 4;
                this.zzb[v1 + 3] = (byte)(((int)(v >> 24)));
                this.zze = v1 + 5;
                this.zzb[v1 + 4] = (byte)(((int)(v >> 0x20)));
                this.zze = v1 + 6;
                this.zzb[v1 + 5] = (byte)(((int)(v >> 40)));
                this.zze = v1 + 7;
                this.zzb[v1 + 6] = (byte)(((int)(v >> 0x30)));
                this.zze = v1 + 8;
                this.zzb[v1 + 7] = (byte)(((int)(v >> 56)));
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", this.zze, this.zzd, 1), indexOutOfBoundsException0);
            }
        }

        @Override  // com.google.android.gms.internal.vision.zzii
        public final void zzd(int v) throws IOException {
            try {
                int v1 = this.zze;
                this.zze = v1 + 1;
                this.zzb[v1] = (byte)v;
                this.zze = v1 + 2;
                this.zzb[v1 + 1] = (byte)(v >> 8);
                this.zze = v1 + 3;
                this.zzb[v1 + 2] = (byte)(v >> 16);
                this.zze = v1 + 4;
                this.zzb[v1 + 3] = (byte)(v >>> 24);
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", this.zze, this.zzd, 1), indexOutOfBoundsException0);
            }
        }

        @Override  // com.google.android.gms.internal.vision.zzii
        public final void zze(int v, int v1) throws IOException {
            this.zza(v, 5);
            this.zzd(v1);
        }
    }

    public static final class zzb extends IOException {
        zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zzb(String s, Throwable throwable0) {
            String s1 = String.valueOf(s);
            super((s1.length() == 0 ? new String("CodedOutputStream was writing to a flat byte array and ran out of space.: ") : "CodedOutputStream was writing to a flat byte array and ran out of space.: " + s1), throwable0);
        }

        zzb(Throwable throwable0) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", throwable0);
        }
    }

    zzil zza;
    private static final Logger zzb;
    private static final boolean zzc;

    static {
        zzii.zzb = Logger.getLogger("com.google.android.gms.internal.vision.zzii");
        zzii.zzc = true;
    }

    private zzii() {
    }

    zzii(zzik zzik0) {
    }

    public static int zza(int v, zzjt zzjt0) {
        int v1 = zzjt0.zzb();
        return zzii.zzg(v << 3) + (zzii.zzg(v1) + v1);
    }

    public static int zza(zzjt zzjt0) {
        int v = zzjt0.zzb();
        return zzii.zzg(v) + v;
    }

    static int zza(zzkk zzkk0, zzlc zzlc0) {
        int v = ((zzhf)zzkk0).zzi();
        if(v == -1) {
            v = zzlc0.zzb(((zzhf)zzkk0));
            ((zzhf)zzkk0).zzb(v);
        }
        return zzii.zzg(v) + v;
    }

    public static zzii zza(byte[] arr_b) {
        return new zza(arr_b, 0, arr_b.length);
    }

    public abstract int zza();

    public abstract void zza(byte arg1) throws IOException;

    public final void zza(double f) throws IOException {
        this.zzc(Double.doubleToRawLongBits(f));
    }

    public final void zza(float f) throws IOException {
        this.zzd(Float.floatToRawIntBits(f));
    }

    public abstract void zza(int arg1) throws IOException;

    public final void zza(int v, double f) throws IOException {
        this.zzc(v, Double.doubleToRawLongBits(f));
    }

    public final void zza(int v, float f) throws IOException {
        this.zze(v, Float.floatToRawIntBits(f));
    }

    public abstract void zza(int arg1, int arg2) throws IOException;

    public abstract void zza(int arg1, long arg2) throws IOException;

    public abstract void zza(int arg1, zzht arg2) throws IOException;

    public abstract void zza(int arg1, zzkk arg2) throws IOException;

    abstract void zza(int arg1, zzkk arg2, zzlc arg3) throws IOException;

    public abstract void zza(int arg1, String arg2) throws IOException;

    public abstract void zza(int arg1, boolean arg2) throws IOException;

    public abstract void zza(long arg1) throws IOException;

    public abstract void zza(zzht arg1) throws IOException;

    public abstract void zza(zzkk arg1) throws IOException;

    public abstract void zza(String arg1) throws IOException;

    final void zza(String s, zzmg zzmg0) throws IOException {
        zzii.zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzmg0);
        byte[] arr_b = s.getBytes(zzjf.zza);
        try {
            this.zzb(arr_b.length);
            this.zza(arr_b, 0, arr_b.length);
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new zzb(indexOutOfBoundsException0);
        }
    }

    public final void zza(boolean z) throws IOException {
        this.zza(((byte)z));
    }

    public static int zzb(double f) {
        return 8;
    }

    public static int zzb(float f) {
        return 4;
    }

    public static int zzb(int v, double f) {
        return zzii.zzg(v << 3) + 8;
    }

    public static int zzb(int v, float f) {
        return zzii.zzg(v << 3) + 4;
    }

    // 去混淆评级： 低(20)
    public static int zzb(int v, zzjt zzjt0) {
        return zzii.zzg(2, v) + 2 + zzii.zza(3, zzjt0);
    }

    // 去混淆评级： 低(40)
    public static int zzb(int v, zzkk zzkk0) {
        return zzii.zzg(2, v) + 2 + (zzii.zzb(zzkk0) + 1);
    }

    static int zzb(int v, zzkk zzkk0, zzlc zzlc0) {
        return zzii.zzg(v << 3) + zzii.zza(zzkk0, zzlc0);
    }

    public static int zzb(int v, String s) {
        return zzii.zzg(v << 3) + zzii.zzb(s);
    }

    public static int zzb(int v, boolean z) {
        return zzii.zzg(v << 3) + 1;
    }

    public static int zzb(zzht zzht0) {
        int v = zzht0.zza();
        return zzii.zzg(v) + v;
    }

    public static int zzb(zzkk zzkk0) {
        int v = zzkk0.zzm();
        return zzii.zzg(v) + v;
    }

    public static int zzb(String s) {
        int v;
        try {
            v = zzmd.zza(s);
            return zzii.zzg(v) + v;
        }
        catch(zzmg unused_ex) {
            v = s.getBytes(zzjf.zza).length;
            return zzii.zzg(v) + v;
        }
    }

    public static int zzb(boolean z) {
        return 1;
    }

    public static int zzb(byte[] arr_b) {
        return zzii.zzg(arr_b.length) + arr_b.length;
    }

    public final void zzb() {
        if(this.zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void zzb(int arg1) throws IOException;

    public abstract void zzb(int arg1, int arg2) throws IOException;

    public final void zzb(int v, long v1) throws IOException {
        this.zza(v, v1 >> 0x3F ^ v1 << 1);
    }

    public abstract void zzb(int arg1, zzht arg2) throws IOException;

    public final void zzb(long v) throws IOException {
        this.zza(v >> 0x3F ^ v << 1);
    }

    abstract void zzb(byte[] arg1, int arg2, int arg3) throws IOException;

    public static int zzc(int v, zzht zzht0) {
        int v1 = zzht0.zza();
        return zzii.zzg(v << 3) + (zzii.zzg(v1) + v1);
    }

    @Deprecated
    static int zzc(int v, zzkk zzkk0, zzlc zzlc0) {
        int v1 = zzii.zzg(v << 3);
        int v2 = ((zzhf)zzkk0).zzi();
        if(v2 == -1) {
            v2 = zzlc0.zzb(((zzhf)zzkk0));
            ((zzhf)zzkk0).zzb(v2);
        }
        return (v1 << 1) + v2;
    }

    @Deprecated
    public static int zzc(zzkk zzkk0) {
        return zzkk0.zzm();
    }

    static boolean zzc() [...] // 潜在的解密器

    public final void zzc(int v) throws IOException {
        this.zzb(v >> 0x1F ^ v << 1);
    }

    public abstract void zzc(int arg1, int arg2) throws IOException;

    public abstract void zzc(int arg1, long arg2) throws IOException;

    public abstract void zzc(long arg1) throws IOException;

    public static int zzd(int v, long v1) {
        return zzii.zzg(v << 3) + zzii.zze(v1);
    }

    // 去混淆评级： 低(20)
    public static int zzd(int v, zzht zzht0) {
        return zzii.zzg(2, v) + 2 + zzii.zzc(3, zzht0);
    }

    public static int zzd(long v) {
        return zzii.zze(v);
    }

    public abstract void zzd(int arg1) throws IOException;

    public final void zzd(int v, int v1) throws IOException {
        this.zzc(v, v1 >> 0x1F ^ v1 << 1);
    }

    public static int zze(int v) {
        return zzii.zzg(v << 3);
    }

    public static int zze(int v, long v1) {
        return zzii.zzg(v << 3) + zzii.zze(v1);
    }

    public static int zze(long v) {
        int v1;
        if((0xFFFFFFFFFFFFFF80L & v) == 0L) {
            return 1;
        }
        if(v < 0L) {
            return 10;
        }
        if((0xFFFFFFF800000000L & v) == 0L) {
            v1 = 2;
        }
        else {
            v >>>= 28;
            v1 = 6;
        }
        if((0xFFFFFFFFFFE00000L & v) != 0L) {
            v1 += 2;
            v >>>= 14;
        }
        return (v & 0xFFFFFFFFFFFFC000L) == 0L ? v1 : v1 + 1;
    }

    public abstract void zze(int arg1, int arg2) throws IOException;

    public static int zzf(int v) {
        return v < 0 ? 10 : zzii.zzg(v);
    }

    public static int zzf(int v, int v1) {
        return zzii.zzg(v << 3) + zzii.zzf(v1);
    }

    public static int zzf(int v, long v1) {
        return zzii.zzg(v << 3) + zzii.zze(v1 >> 0x3F ^ v1 << 1);
    }

    public static int zzf(long v) {
        return zzii.zze(v >> 0x3F ^ v << 1);
    }

    public static int zzg(int v) [...] // 潜在的解密器

    public static int zzg(int v, int v1) {
        return zzii.zzg(v << 3) + zzii.zzg(v1);
    }

    public static int zzg(int v, long v1) {
        return zzii.zzg(v << 3) + 8;
    }

    public static int zzg(long v) {
        return 8;
    }

    public static int zzh(int v) {
        return zzii.zzg(v >> 0x1F ^ v << 1);
    }

    public static int zzh(int v, int v1) {
        return zzii.zzg(v << 3) + zzii.zzg(zzii.zzm(v1));
    }

    public static int zzh(int v, long v1) {
        return zzii.zzg(v << 3) + 8;
    }

    public static int zzh(long v) {
        return 8;
    }

    public static int zzi(int v) {
        return 4;
    }

    public static int zzi(int v, int v1) {
        return zzii.zzg(v << 3) + 4;
    }

    private static long zzi(long v) [...] // Inlined contents

    public static int zzj(int v) {
        return 4;
    }

    public static int zzj(int v, int v1) {
        return zzii.zzg(v << 3) + 4;
    }

    public static int zzk(int v) {
        return zzii.zzf(v);
    }

    public static int zzk(int v, int v1) {
        return zzii.zzg(v << 3) + zzii.zzf(v1);
    }

    @Deprecated
    public static int zzl(int v) {
        return zzii.zzg(v);
    }

    private static int zzm(int v) [...] // Inlined contents
}

