package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzjc extends zzil {
    static final class zza extends zzjc {
        private final byte[] zzb;
        private final int zzc;
        private int zzd;

        zza(byte[] arr_b, int v, int v1) {
            super(null);
            if(arr_b == null) {
                throw new NullPointerException("buffer");
            }
            if((arr_b.length - v1 | v1) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", ((int)arr_b.length), 0, v1));
            }
            this.zzb = arr_b;
            this.zzd = 0;
            this.zzc = v1;
        }

        @Override  // com.google.android.gms.internal.measurement.zzjc
        public final int zza() {
            return this.zzc - this.zzd;
        }

        @Override  // com.google.android.gms.internal.measurement.zzjc
        public final void zza(byte b) throws IOException {
            int v;
            try {
                v = this.zzd;
                this.zzb[v] = b;
                this.zzd = v + 1;
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", ((int)(v + 1)), this.zzc, 1), indexOutOfBoundsException0);
            }
        }

        @Override  // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int v) throws IOException {
            try {
                int v1 = this.zzd;
                this.zzd = v1 + 1;
                this.zzb[v1] = (byte)v;
                this.zzd = v1 + 2;
                this.zzb[v1 + 1] = (byte)(v >> 8);
                this.zzd = v1 + 3;
                this.zzb[v1 + 2] = (byte)(v >> 16);
                this.zzd = v1 + 4;
                this.zzb[v1 + 3] = (byte)(v >>> 24);
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", this.zzd, this.zzc, 1), indexOutOfBoundsException0);
            }
        }

        @Override  // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int v, int v1) throws IOException {
            this.zzc(v, 5);
            this.zza(v1);
        }

        @Override  // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int v, long v1) throws IOException {
            this.zzc(v, 1);
            this.zza(v1);
        }

        @Override  // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int v, zzik zzik0) throws IOException {
            this.zzc(v, 2);
            this.zza(zzik0);
        }

        @Override  // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int v, zzlc zzlc0) throws IOException {
            this.zzc(1, 3);
            this.zzd(2, v);
            this.zzc(3, 2);
            this.zza(zzlc0);
            this.zzc(1, 4);
        }

        @Override  // com.google.android.gms.internal.measurement.zzjc
        final void zza(int v, zzlc zzlc0, zzlu zzlu0) throws IOException {
            this.zzc(v, 2);
            this.zzc(((zzib)zzlc0).zza(zzlu0));
            zzlu0.zza(zzlc0, this.zza);
        }

        @Override  // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int v, String s) throws IOException {
            this.zzc(v, 2);
            this.zza(s);
        }

        @Override  // com.google.android.gms.internal.measurement.zzjc
        public final void zza(int v, boolean z) throws IOException {
            this.zzc(v, 0);
            this.zza(((byte)z));
        }

        @Override  // com.google.android.gms.internal.measurement.zzjc
        public final void zza(long v) throws IOException {
            try {
                int v1 = this.zzd;
                this.zzd = v1 + 1;
                this.zzb[v1] = (byte)(((int)v));
                this.zzd = v1 + 2;
                this.zzb[v1 + 1] = (byte)(((int)(v >> 8)));
                this.zzd = v1 + 3;
                this.zzb[v1 + 2] = (byte)(((int)(v >> 16)));
                this.zzd = v1 + 4;
                this.zzb[v1 + 3] = (byte)(((int)(v >> 24)));
                this.zzd = v1 + 5;
                this.zzb[v1 + 4] = (byte)(((int)(v >> 0x20)));
                this.zzd = v1 + 6;
                this.zzb[v1 + 5] = (byte)(((int)(v >> 40)));
                this.zzd = v1 + 7;
                this.zzb[v1 + 6] = (byte)(((int)(v >> 0x30)));
                this.zzd = v1 + 8;
                this.zzb[v1 + 7] = (byte)(((int)(v >> 56)));
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", this.zzd, this.zzc, 1), indexOutOfBoundsException0);
            }
        }

        @Override  // com.google.android.gms.internal.measurement.zzjc
        public final void zza(zzik zzik0) throws IOException {
            this.zzc(zzik0.zzb());
            zzik0.zza(this);
        }

        @Override  // com.google.android.gms.internal.measurement.zzjc
        public final void zza(zzlc zzlc0) throws IOException {
            this.zzc(zzlc0.zzcb());
            zzlc0.zza(this);
        }

        @Override  // com.google.android.gms.internal.measurement.zzjc
        public final void zza(String s) throws IOException {
            int v;
            try {
                v = this.zzd;
                int v1 = zzjc.zzj(s.length());
                if(v1 == zzjc.zzj(s.length() * 3)) {
                    int v2 = v + v1;
                    this.zzd = v2;
                    int v3 = this.zza();
                    int v4 = zzmp.zza(s, this.zzb, v2, v3);
                    this.zzd = v;
                    this.zzc(v4 - v - v1);
                    this.zzd = v4;
                    return;
                }
                this.zzc(zzmp.zza(s));
                int v5 = this.zzd;
                int v6 = this.zza();
                this.zzd = zzmp.zza(s, this.zzb, v5, v6);
                return;
            }
            catch(zzmt zzmt0) {
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                throw new zzb(indexOutOfBoundsException0);
            }
            this.zzd = v;
            this.zza(s, zzmt0);
        }

        @Override  // com.google.android.gms.internal.measurement.zzil
        public final void zza(byte[] arr_b, int v, int v1) throws IOException {
            this.zzc(arr_b, v, v1);
        }

        @Override  // com.google.android.gms.internal.measurement.zzjc
        public final void zzb(int v) throws IOException {
            if(v >= 0) {
                this.zzc(v);
                return;
            }
            this.zzb(((long)v));
        }

        @Override  // com.google.android.gms.internal.measurement.zzjc
        public final void zzb(int v, int v1) throws IOException {
            this.zzc(v, 0);
            this.zzb(v1);
        }

        @Override  // com.google.android.gms.internal.measurement.zzjc
        public final void zzb(int v, long v1) throws IOException {
            this.zzc(v, 0);
            this.zzb(v1);
        }

        @Override  // com.google.android.gms.internal.measurement.zzjc
        public final void zzb(int v, zzik zzik0) throws IOException {
            this.zzc(1, 3);
            this.zzd(2, v);
            this.zza(3, zzik0);
            this.zzc(1, 4);
        }

        @Override  // com.google.android.gms.internal.measurement.zzjc
        public final void zzb(long v) throws IOException {
            try {
                while(true) {
                    if((v & 0xFFFFFFFFFFFFFF80L) == 0L) {
                        int v1 = this.zzd;
                        this.zzd = v1 + 1;
                        this.zzb[v1] = (byte)(((int)v));
                        return;
                    }
                    int v2 = this.zzd;
                    this.zzd = v2 + 1;
                    this.zzb[v2] = (byte)(((int)v) | 0x80);
                    v >>>= 7;
                }
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            }
            throw new zzb(String.format("Pos: %d, limit: %d, len: %d", this.zzd, this.zzc, 1), indexOutOfBoundsException0);
        }

        @Override  // com.google.android.gms.internal.measurement.zzjc
        public final void zzb(byte[] arr_b, int v, int v1) throws IOException {
            this.zzc(v1);
            this.zzc(arr_b, 0, v1);
        }

        private final void zzc(byte[] arr_b, int v, int v1) throws IOException {
            try {
                System.arraycopy(arr_b, v, this.zzb, this.zzd, v1);
                this.zzd += v1;
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", this.zzd, this.zzc, v1), indexOutOfBoundsException0);
            }
        }

        @Override  // com.google.android.gms.internal.measurement.zzjc
        public final void zzc(int v) throws IOException {
            try {
                while(true) {
                    if((v & 0xFFFFFF80) == 0) {
                        int v1 = this.zzd;
                        this.zzd = v1 + 1;
                        this.zzb[v1] = (byte)v;
                        return;
                    }
                    int v2 = this.zzd;
                    this.zzd = v2 + 1;
                    this.zzb[v2] = (byte)(v | 0x80);
                    v >>>= 7;
                }
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            }
            throw new zzb(String.format("Pos: %d, limit: %d, len: %d", this.zzd, this.zzc, 1), indexOutOfBoundsException0);
        }

        @Override  // com.google.android.gms.internal.measurement.zzjc
        public final void zzc(int v, int v1) throws IOException {
            this.zzc(v << 3 | v1);
        }

        @Override  // com.google.android.gms.internal.measurement.zzjc
        public final void zzd(int v, int v1) throws IOException {
            this.zzc(v, 0);
            this.zzc(v1);
        }
    }

    public static final class zzb extends IOException {
        zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zzb(String s, Throwable throwable0) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + s, throwable0);
        }

        zzb(Throwable throwable0) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", throwable0);
        }
    }

    zzjf zza;
    private static final Logger zzb;
    private static final boolean zzc;

    static {
        zzjc.zzb = Logger.getLogger("com.google.android.gms.internal.measurement.zzjc");
        zzjc.zzc = false;
    }

    private zzjc() {
    }

    zzjc(zzjd zzjd0) {
    }

    public static int zza(double f) {
        return 8;
    }

    public static int zza(float f) {
        return 4;
    }

    public static int zza(int v, double f) {
        return zzjc.zzj(v << 3) + 8;
    }

    public static int zza(int v, float f) {
        return zzjc.zzj(v << 3) + 4;
    }

    // 去混淆评级： 低(20)
    public static int zza(int v, zzkk zzkk0) {
        return zzjc.zzj(2, v) + 2 + zzjc.zzb(3, zzkk0);
    }

    public static int zza(zzkk zzkk0) {
        int v = zzkk0.zza();
        return zzjc.zzj(v) + v;
    }

    static int zza(zzlc zzlc0, zzlu zzlu0) {
        int v = ((zzib)zzlc0).zza(zzlu0);
        return zzjc.zzj(v) + v;
    }

    public static int zza(boolean z) {
        return 1;
    }

    public static int zza(byte[] arr_b) {
        return zzjc.zzj(arr_b.length) + arr_b.length;
    }

    public abstract int zza();

    public abstract void zza(byte arg1) throws IOException;

    public abstract void zza(int arg1) throws IOException;

    public abstract void zza(int arg1, int arg2) throws IOException;

    public abstract void zza(int arg1, long arg2) throws IOException;

    public abstract void zza(int arg1, zzik arg2) throws IOException;

    public abstract void zza(int arg1, zzlc arg2) throws IOException;

    abstract void zza(int arg1, zzlc arg2, zzlu arg3) throws IOException;

    public abstract void zza(int arg1, String arg2) throws IOException;

    public abstract void zza(int arg1, boolean arg2) throws IOException;

    public abstract void zza(long arg1) throws IOException;

    public abstract void zza(zzik arg1) throws IOException;

    public abstract void zza(zzlc arg1) throws IOException;

    public abstract void zza(String arg1) throws IOException;

    final void zza(String s, zzmt zzmt0) throws IOException {
        zzjc.zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzmt0);
        byte[] arr_b = s.getBytes(zzjv.zza);
        try {
            this.zzc(arr_b.length);
            this.zza(arr_b, 0, arr_b.length);
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new zzb(indexOutOfBoundsException0);
        }
    }

    public static int zzb(int v, zzkk zzkk0) {
        int v1 = zzkk0.zza();
        return zzjc.zzj(v << 3) + (zzjc.zzj(v1) + v1);
    }

    // 去混淆评级： 低(40)
    public static int zzb(int v, zzlc zzlc0) {
        return zzjc.zzj(2, v) + 2 + (zzjc.zzc(zzlc0) + 1);
    }

    @Deprecated
    static int zzb(int v, zzlc zzlc0, zzlu zzlu0) {
        return (zzjc.zzj(v << 3) << 1) + ((zzib)zzlc0).zza(zzlu0);
    }

    public static int zzb(int v, String s) {
        return zzjc.zzj(v << 3) + zzjc.zzb(s);
    }

    public static int zzb(int v, boolean z) {
        return zzjc.zzj(v << 3) + 1;
    }

    public static int zzb(zzik zzik0) {
        int v = zzik0.zzb();
        return zzjc.zzj(v) + v;
    }

    @Deprecated
    public static int zzb(zzlc zzlc0) {
        return zzlc0.zzcb();
    }

    public static int zzb(String s) {
        int v;
        try {
            v = zzmp.zza(s);
            return zzjc.zzj(v) + v;
        }
        catch(zzmt unused_ex) {
            v = s.getBytes(zzjv.zza).length;
            return zzjc.zzj(v) + v;
        }
    }

    public static zzjc zzb(byte[] arr_b) {
        return new zza(arr_b, 0, arr_b.length);
    }

    public final void zzb() {
        if(this.zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzb(double f) throws IOException {
        this.zza(Double.doubleToRawLongBits(f));
    }

    public final void zzb(float f) throws IOException {
        this.zza(Float.floatToRawIntBits(f));
    }

    public abstract void zzb(int arg1) throws IOException;

    public final void zzb(int v, double f) throws IOException {
        this.zza(v, Double.doubleToRawLongBits(f));
    }

    public final void zzb(int v, float f) throws IOException {
        this.zza(v, Float.floatToRawIntBits(f));
    }

    public abstract void zzb(int arg1, int arg2) throws IOException;

    public abstract void zzb(int arg1, long arg2) throws IOException;

    public abstract void zzb(int arg1, zzik arg2) throws IOException;

    public abstract void zzb(long arg1) throws IOException;

    public final void zzb(boolean z) throws IOException {
        this.zza(((byte)z));
    }

    abstract void zzb(byte[] arg1, int arg2, int arg3) throws IOException;

    public static int zzc(int v, long v1) {
        return zzjc.zzj(v << 3) + 8;
    }

    public static int zzc(int v, zzik zzik0) {
        int v1 = zzik0.zzb();
        return zzjc.zzj(v << 3) + (zzjc.zzj(v1) + v1);
    }

    static int zzc(int v, zzlc zzlc0, zzlu zzlu0) {
        return zzjc.zzj(v << 3) + zzjc.zza(zzlc0, zzlu0);
    }

    public static int zzc(long v) {
        return 8;
    }

    public static int zzc(zzlc zzlc0) {
        int v = zzlc0.zzcb();
        return zzjc.zzj(v) + v;
    }

    static boolean zzc() [...] // 潜在的解密器

    public abstract void zzc(int arg1) throws IOException;

    public abstract void zzc(int arg1, int arg2) throws IOException;

    public static int zzd(int v) {
        return zzjc.zzg(v);
    }

    public static int zzd(int v, long v1) {
        return zzjc.zzj(v << 3) + zzjc.zzg(v1);
    }

    // 去混淆评级： 低(20)
    public static int zzd(int v, zzik zzik0) {
        return zzjc.zzj(2, v) + 2 + zzjc.zzc(3, zzik0);
    }

    public static int zzd(long v) {
        return zzjc.zzg(v);
    }

    public abstract void zzd(int arg1, int arg2) throws IOException;

    public static int zze(int v) {
        return 4;
    }

    public static int zze(int v, int v1) {
        return zzjc.zzj(v << 3) + zzjc.zzg(v1);
    }

    public static int zze(int v, long v1) {
        return zzjc.zzj(v << 3) + 8;
    }

    public static int zze(long v) {
        return 8;
    }

    public static int zzf(int v) {
        return zzjc.zzg(v);
    }

    public static int zzf(int v, int v1) {
        return zzjc.zzj(v << 3) + 4;
    }

    public static int zzf(int v, long v1) {
        return zzjc.zzj(v << 3) + zzjc.zzg(v1 >> 0x3F ^ v1 << 1);
    }

    public static int zzf(long v) {
        return zzjc.zzg(v >> 0x3F ^ v << 1);
    }

    public static int zzg(int v) {
        return 4;
    }

    public static int zzg(int v, int v1) {
        return zzjc.zzj(v << 3) + zzjc.zzg(v1);
    }

    public static int zzg(int v, long v1) {
        return zzjc.zzj(v << 3) + zzjc.zzg(v1);
    }

    public static int zzg(long v) {
        return 640 - Long.numberOfLeadingZeros(v) * 9 >>> 6;
    }

    public static int zzh(int v) {
        return zzjc.zzj(v >> 0x1F ^ v << 1);
    }

    public static int zzh(int v, int v1) {
        return zzjc.zzj(v << 3) + 4;
    }

    public final void zzh(int v, long v1) throws IOException {
        this.zzb(v, v1 >> 0x3F ^ v1 << 1);
    }

    public final void zzh(long v) throws IOException {
        this.zzb(v >> 0x3F ^ v << 1);
    }

    public static int zzi(int v) {
        return zzjc.zzj(v << 3);
    }

    public static int zzi(int v, int v1) {
        return zzjc.zzj(v << 3) + zzjc.zzj(v1 >> 0x1F ^ v1 << 1);
    }

    private static long zzi(long v) [...] // Inlined contents

    public static int zzj(int v) [...] // 潜在的解密器

    public static int zzj(int v, int v1) {
        return zzjc.zzj(v << 3) + zzjc.zzj(v1);
    }

    public final void zzk(int v) throws IOException {
        this.zzc(v >> 0x1F ^ v << 1);
    }

    public final void zzk(int v, int v1) throws IOException {
        this.zzd(v, v1 >> 0x1F ^ v1 << 1);
    }

    private static int zzl(int v) [...] // Inlined contents
}

