package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzbn extends zzba {
    static class zza extends zzbn {
        private final byte[] buffer;
        private final int limit;
        private final int offset;
        private int position;

        zza(byte[] arr_b, int v, int v1) {
            super(null);
            if(arr_b == null) {
                throw new NullPointerException("buffer");
            }
            int v2 = v + v1;
            if((v | v1 | arr_b.length - v2) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", ((int)arr_b.length), v, v1));
            }
            this.buffer = arr_b;
            this.offset = v;
            this.position = v;
            this.limit = v2;
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public void flush() {
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void write(byte[] arr_b, int v, int v1) throws IOException {
            try {
                System.arraycopy(arr_b, v, this.buffer, this.position, v1);
                this.position += v1;
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", this.position, this.limit, v1), indexOutOfBoundsException0);
            }
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(byte b) throws IOException {
            try {
                int v = this.position;
                this.position = v + 1;
                this.buffer[v] = b;
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", this.position, this.limit, 1), indexOutOfBoundsException0);
            }
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int v, long v1) throws IOException {
            this.zzb(v, 0);
            this.zzb(v1);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int v, zzbb zzbb0) throws IOException {
            this.zzb(v, 2);
            this.zza(zzbb0);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int v, zzdo zzdo0) throws IOException {
            this.zzb(v, 2);
            this.zzb(zzdo0);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        final void zza(int v, zzdo zzdo0, zzef zzef0) throws IOException {
            this.zzb(v, 2);
            int v1 = ((zzas)zzdo0).zzs();
            if(v1 == -1) {
                v1 = zzef0.zzm(((zzas)zzdo0));
                ((zzas)zzdo0).zzf(v1);
            }
            this.zzo(v1);
            zzef0.zza(zzdo0, this.zzfz);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int v, String s) throws IOException {
            this.zzb(v, 2);
            this.zzg(s);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(zzbb zzbb0) throws IOException {
            this.zzo(zzbb0.size());
            zzbb0.zza(this);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        final void zza(zzdo zzdo0, zzef zzef0) throws IOException {
            int v = ((zzas)zzdo0).zzs();
            if(v == -1) {
                v = zzef0.zzm(((zzas)zzdo0));
                ((zzas)zzdo0).zzf(v);
            }
            this.zzo(v);
            zzef0.zza(zzdo0, this.zzfz);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzba
        public final void zza(byte[] arr_b, int v, int v1) throws IOException {
            this.write(arr_b, v, v1);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final int zzag() {
            return this.limit - this.position;
        }

        public final int zzai() {
            return this.position - this.offset;
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int v, int v1) throws IOException {
            this.zzo(v << 3 | v1);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int v, zzbb zzbb0) throws IOException {
            this.zzb(1, 3);
            this.zzd(2, v);
            this.zza(3, zzbb0);
            this.zzb(1, 4);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int v, zzdo zzdo0) throws IOException {
            this.zzb(1, 3);
            this.zzd(2, v);
            this.zza(3, zzdo0);
            this.zzb(1, 4);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int v, boolean z) throws IOException {
            this.zzb(v, 0);
            this.zza(((byte)z));
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(long v) throws IOException {
            if(this.zzag() >= 10) {
                while((v & 0xFFFFFFFFFFFFFF80L) != 0L) {
                    int v1 = this.position;
                    this.position = v1 + 1;
                    zzfd.zza(this.buffer, ((long)v1), ((byte)(((int)v) & 0x7F | 0x80)));
                    v >>>= 7;
                }
                int v2 = this.position;
                this.position = v2 + 1;
                zzfd.zza(this.buffer, ((long)v2), ((byte)(((int)v))));
                return;
            }
            try {
                while(true) {
                    if((v & 0xFFFFFFFFFFFFFF80L) == 0L) {
                        int v3 = this.position;
                        this.position = v3 + 1;
                        this.buffer[v3] = (byte)(((int)v));
                        return;
                    }
                    int v4 = this.position;
                    this.position = v4 + 1;
                    this.buffer[v4] = (byte)(((int)v) & 0x7F | 0x80);
                    v >>>= 7;
                }
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            }
            throw new zzc(String.format("Pos: %d, limit: %d, len: %d", this.position, this.limit, 1), indexOutOfBoundsException0);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(zzdo zzdo0) throws IOException {
            this.zzo(zzdo0.zzas());
            zzdo0.zzb(this);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzc(int v, int v1) throws IOException {
            this.zzb(v, 0);
            this.zzn(v1);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzc(int v, long v1) throws IOException {
            this.zzb(v, 1);
            this.zzd(v1);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzd(int v, int v1) throws IOException {
            this.zzb(v, 0);
            this.zzo(v1);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzd(long v) throws IOException {
            try {
                int v1 = this.position;
                this.position = v1 + 1;
                this.buffer[v1] = (byte)(((int)v));
                this.position = v1 + 2;
                this.buffer[v1 + 1] = (byte)(((int)(v >> 8)));
                this.position = v1 + 3;
                this.buffer[v1 + 2] = (byte)(((int)(v >> 16)));
                this.position = v1 + 4;
                this.buffer[v1 + 3] = (byte)(((int)(v >> 24)));
                this.position = v1 + 5;
                this.buffer[v1 + 4] = (byte)(((int)(v >> 0x20)));
                this.position = v1 + 6;
                this.buffer[v1 + 5] = (byte)(((int)(v >> 40)));
                this.position = v1 + 7;
                this.buffer[v1 + 6] = (byte)(((int)(v >> 0x30)));
                this.position = v1 + 8;
                this.buffer[v1 + 7] = (byte)(((int)(v >> 56)));
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", this.position, this.limit, 1), indexOutOfBoundsException0);
            }
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzd(byte[] arr_b, int v, int v1) throws IOException {
            this.zzo(v1);
            this.write(arr_b, 0, v1);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzf(int v, int v1) throws IOException {
            this.zzb(v, 5);
            this.zzq(v1);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzg(String s) throws IOException {
            int v;
            try {
                v = this.position;
                int v1 = zzbn.zzt(s.length());
                if(v1 == zzbn.zzt(s.length() * 3)) {
                    int v2 = v + v1;
                    this.position = v2;
                    int v3 = this.zzag();
                    int v4 = zzff.zza(s, this.buffer, v2, v3);
                    this.position = v;
                    this.zzo(v4 - v - v1);
                    this.position = v4;
                    return;
                }
                this.zzo(zzff.zza(s));
                int v5 = this.position;
                int v6 = this.zzag();
                this.position = zzff.zza(s, this.buffer, v5, v6);
                return;
            }
            catch(zzfi zzfi0) {
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                throw new zzc(indexOutOfBoundsException0);
            }
            this.position = v;
            this.zza(s, zzfi0);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzn(int v) throws IOException {
            if(v >= 0) {
                this.zzo(v);
                return;
            }
            this.zzb(((long)v));
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzo(int v) throws IOException {
            if(this.zzag() >= 10) {
                while((v & 0xFFFFFF80) != 0) {
                    int v1 = this.position;
                    this.position = v1 + 1;
                    zzfd.zza(this.buffer, ((long)v1), ((byte)(v & 0x7F | 0x80)));
                    v >>>= 7;
                }
                int v2 = this.position;
                this.position = v2 + 1;
                zzfd.zza(this.buffer, ((long)v2), ((byte)v));
                return;
            }
            try {
                while(true) {
                    if((v & 0xFFFFFF80) == 0) {
                        int v3 = this.position;
                        this.position = v3 + 1;
                        this.buffer[v3] = (byte)v;
                        return;
                    }
                    int v4 = this.position;
                    this.position = v4 + 1;
                    this.buffer[v4] = (byte)(v & 0x7F | 0x80);
                    v >>>= 7;
                }
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            }
            throw new zzc(String.format("Pos: %d, limit: %d, len: %d", this.position, this.limit, 1), indexOutOfBoundsException0);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzq(int v) throws IOException {
            try {
                int v1 = this.position;
                this.position = v1 + 1;
                this.buffer[v1] = (byte)v;
                this.position = v1 + 2;
                this.buffer[v1 + 1] = (byte)(v >> 8);
                this.position = v1 + 3;
                this.buffer[v1 + 2] = (byte)(v >> 16);
                this.position = v1 + 4;
                this.buffer[v1 + 3] = v >> 24;
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", this.position, this.limit, 1), indexOutOfBoundsException0);
            }
        }
    }

    static final class zzb extends zza {
        private final ByteBuffer zzga;
        private int zzgb;

        zzb(ByteBuffer byteBuffer0) {
            super(byteBuffer0.array(), byteBuffer0.arrayOffset() + byteBuffer0.position(), byteBuffer0.remaining());
            this.zzga = byteBuffer0;
            this.zzgb = byteBuffer0.position();
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn$zza
        public final void flush() {
            this.zzga.position(this.zzgb + this.zzai());
        }
    }

    public static final class zzc extends IOException {
        zzc() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zzc(String s) {
            String s1 = String.valueOf(s);
            super((s1.length() == 0 ? new String("CodedOutputStream was writing to a flat byte array and ran out of space.: ") : "CodedOutputStream was writing to a flat byte array and ran out of space.: " + s1));
        }

        zzc(String s, Throwable throwable0) {
            String s1 = String.valueOf(s);
            super((s1.length() == 0 ? new String("CodedOutputStream was writing to a flat byte array and ran out of space.: ") : "CodedOutputStream was writing to a flat byte array and ran out of space.: " + s1), throwable0);
        }

        zzc(Throwable throwable0) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", throwable0);
        }
    }

    static final class zzd extends zzbn {
        private final int zzgb;
        private final ByteBuffer zzgc;
        private final ByteBuffer zzgd;

        zzd(ByteBuffer byteBuffer0) {
            super(null);
            this.zzgc = byteBuffer0;
            this.zzgd = byteBuffer0.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.zzgb = byteBuffer0.position();
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void flush() {
            this.zzgc.position(this.zzgd.position());
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void write(byte[] arr_b, int v, int v1) throws IOException {
            try {
                this.zzgd.put(arr_b, v, v1);
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                throw new zzc(indexOutOfBoundsException0);
            }
            catch(BufferOverflowException bufferOverflowException0) {
                throw new zzc(bufferOverflowException0);
            }
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(byte b) throws IOException {
            try {
                this.zzgd.put(b);
            }
            catch(BufferOverflowException bufferOverflowException0) {
                throw new zzc(bufferOverflowException0);
            }
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int v, long v1) throws IOException {
            this.zzb(v, 0);
            this.zzb(v1);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int v, zzbb zzbb0) throws IOException {
            this.zzb(v, 2);
            this.zza(zzbb0);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int v, zzdo zzdo0) throws IOException {
            this.zzb(v, 2);
            this.zzb(zzdo0);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        final void zza(int v, zzdo zzdo0, zzef zzef0) throws IOException {
            this.zzb(v, 2);
            this.zza(zzdo0, zzef0);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int v, String s) throws IOException {
            this.zzb(v, 2);
            this.zzg(s);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(zzbb zzbb0) throws IOException {
            this.zzo(zzbb0.size());
            zzbb0.zza(this);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        final void zza(zzdo zzdo0, zzef zzef0) throws IOException {
            int v = ((zzas)zzdo0).zzs();
            if(v == -1) {
                v = zzef0.zzm(((zzas)zzdo0));
                ((zzas)zzdo0).zzf(v);
            }
            this.zzo(v);
            zzef0.zza(zzdo0, this.zzfz);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzba
        public final void zza(byte[] arr_b, int v, int v1) throws IOException {
            this.write(arr_b, v, v1);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final int zzag() {
            return this.zzgd.remaining();
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int v, int v1) throws IOException {
            this.zzo(v << 3 | v1);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int v, zzbb zzbb0) throws IOException {
            this.zzb(1, 3);
            this.zzd(2, v);
            this.zza(3, zzbb0);
            this.zzb(1, 4);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int v, zzdo zzdo0) throws IOException {
            this.zzb(1, 3);
            this.zzd(2, v);
            this.zza(3, zzdo0);
            this.zzb(1, 4);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int v, boolean z) throws IOException {
            this.zzb(v, 0);
            this.zza(((byte)z));
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(long v) throws IOException {
            try {
                while(true) {
                    if((0xFFFFFFFFFFFFFF80L & v) == 0L) {
                        this.zzgd.put(((byte)(((int)v))));
                        return;
                    }
                    this.zzgd.put(((byte)(((int)v) & 0x7F | 0x80)));
                    v >>>= 7;
                }
            }
            catch(BufferOverflowException bufferOverflowException0) {
            }
            throw new zzc(bufferOverflowException0);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(zzdo zzdo0) throws IOException {
            this.zzo(zzdo0.zzas());
            zzdo0.zzb(this);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzc(int v, int v1) throws IOException {
            this.zzb(v, 0);
            this.zzn(v1);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzc(int v, long v1) throws IOException {
            this.zzb(v, 1);
            this.zzd(v1);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzd(int v, int v1) throws IOException {
            this.zzb(v, 0);
            this.zzo(v1);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzd(long v) throws IOException {
            try {
                this.zzgd.putLong(v);
            }
            catch(BufferOverflowException bufferOverflowException0) {
                throw new zzc(bufferOverflowException0);
            }
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzd(byte[] arr_b, int v, int v1) throws IOException {
            this.zzo(v1);
            this.write(arr_b, 0, v1);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzf(int v, int v1) throws IOException {
            this.zzb(v, 5);
            this.zzq(v1);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzg(String s) throws IOException {
            int v = this.zzgd.position();
            try {
                int v1 = zzbn.zzt(s.length());
                if(v1 == zzbn.zzt(s.length() * 3)) {
                    int v2 = this.zzgd.position() + v1;
                    this.zzgd.position(v2);
                    this.zzi(s);
                    int v3 = this.zzgd.position();
                    this.zzgd.position(v);
                    this.zzo(v3 - v2);
                    this.zzgd.position(v3);
                    return;
                }
                this.zzo(zzff.zza(s));
                this.zzi(s);
                return;
            }
            catch(zzfi zzfi0) {
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                throw new zzc(illegalArgumentException0);
            }
            this.zzgd.position(v);
            this.zza(s, zzfi0);
        }

        private final void zzi(String s) throws IOException {
            try {
                zzff.zza(s, this.zzgd);
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                throw new zzc(indexOutOfBoundsException0);
            }
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzn(int v) throws IOException {
            if(v >= 0) {
                this.zzo(v);
                return;
            }
            this.zzb(((long)v));
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzo(int v) throws IOException {
            try {
                while(true) {
                    if((v & 0xFFFFFF80) == 0) {
                        this.zzgd.put(((byte)v));
                        return;
                    }
                    this.zzgd.put(((byte)(v & 0x7F | 0x80)));
                    v >>>= 7;
                }
            }
            catch(BufferOverflowException bufferOverflowException0) {
            }
            throw new zzc(bufferOverflowException0);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzq(int v) throws IOException {
            try {
                this.zzgd.putInt(v);
            }
            catch(BufferOverflowException bufferOverflowException0) {
                throw new zzc(bufferOverflowException0);
            }
        }
    }

    static final class zze extends zzbn {
        private final ByteBuffer zzgc;
        private final ByteBuffer zzgd;
        private final long zzge;
        private final long zzgf;
        private final long zzgg;
        private final long zzgh;
        private long zzgi;

        zze(ByteBuffer byteBuffer0) {
            super(null);
            this.zzgc = byteBuffer0;
            this.zzgd = byteBuffer0.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long v = zzfd.zzb(byteBuffer0);
            this.zzge = v;
            long v1 = ((long)byteBuffer0.position()) + v;
            this.zzgf = v1;
            long v2 = v + ((long)byteBuffer0.limit());
            this.zzgg = v2;
            this.zzgh = v2 - 10L;
            this.zzgi = v1;
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void flush() {
            this.zzgc.position(((int)(this.zzgi - this.zzge)));
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void write(byte[] arr_b, int v, int v1) throws IOException {
            if(arr_b != null && v >= 0 && v1 >= 0 && arr_b.length - v1 >= v) {
                long v2 = this.zzgi;
                if(this.zzgg - ((long)v1) >= v2) {
                    zzfd.zza(arr_b, ((long)v), v2, ((long)v1));
                    this.zzgi += (long)v1;
                    return;
                }
            }
            if(arr_b == null) {
                throw new NullPointerException("value");
            }
            throw new zzc(String.format("Pos: %d, limit: %d, len: %d", this.zzgi, this.zzgg, v1));
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(byte b) throws IOException {
            long v = this.zzgi;
            if(v >= this.zzgg) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", this.zzgi, this.zzgg, 1));
            }
            this.zzgi = v + 1L;
            zzfd.zza(v, b);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int v, long v1) throws IOException {
            this.zzb(v, 0);
            this.zzb(v1);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int v, zzbb zzbb0) throws IOException {
            this.zzb(v, 2);
            this.zza(zzbb0);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int v, zzdo zzdo0) throws IOException {
            this.zzb(v, 2);
            this.zzb(zzdo0);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        final void zza(int v, zzdo zzdo0, zzef zzef0) throws IOException {
            this.zzb(v, 2);
            this.zza(zzdo0, zzef0);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int v, String s) throws IOException {
            this.zzb(v, 2);
            this.zzg(s);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(zzbb zzbb0) throws IOException {
            this.zzo(zzbb0.size());
            zzbb0.zza(this);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        final void zza(zzdo zzdo0, zzef zzef0) throws IOException {
            int v = ((zzas)zzdo0).zzs();
            if(v == -1) {
                v = zzef0.zzm(((zzas)zzdo0));
                ((zzas)zzdo0).zzf(v);
            }
            this.zzo(v);
            zzef0.zza(zzdo0, this.zzfz);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzba
        public final void zza(byte[] arr_b, int v, int v1) throws IOException {
            this.write(arr_b, v, v1);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final int zzag() {
            return (int)(this.zzgg - this.zzgi);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int v, int v1) throws IOException {
            this.zzo(v << 3 | v1);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int v, zzbb zzbb0) throws IOException {
            this.zzb(1, 3);
            this.zzd(2, v);
            this.zza(3, zzbb0);
            this.zzb(1, 4);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int v, zzdo zzdo0) throws IOException {
            this.zzb(1, 3);
            this.zzd(2, v);
            this.zza(3, zzdo0);
            this.zzb(1, 4);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int v, boolean z) throws IOException {
            this.zzb(v, 0);
            this.zza(((byte)z));
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(long v) throws IOException {
            long v1;
            if(this.zzgi <= this.zzgh) {
                while(true) {
                    v1 = this.zzgi;
                    if(Long.compare(v & 0xFFFFFFFFFFFFFF80L, 0L) == 0) {
                        break;
                    }
                    this.zzgi = v1 + 1L;
                    zzfd.zza(v1, ((byte)(((int)v) & 0x7F | 0x80)));
                    v >>>= 7;
                }
                this.zzgi = v1 + 1L;
                zzfd.zza(v1, ((byte)(((int)v))));
                return;
            }
            long v2;
            while((v2 = this.zzgi) < this.zzgg) {
                if((v & 0xFFFFFFFFFFFFFF80L) == 0L) {
                    this.zzgi = v2 + 1L;
                    zzfd.zza(v2, ((byte)(((int)v))));
                    return;
                }
                this.zzgi = v2 + 1L;
                zzfd.zza(v2, ((byte)(((int)v) & 0x7F | 0x80)));
                v >>>= 7;
            }
            throw new zzc(String.format("Pos: %d, limit: %d, len: %d", this.zzgi, this.zzgg, 1));
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(zzdo zzdo0) throws IOException {
            this.zzo(zzdo0.zzas());
            zzdo0.zzb(this);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzc(int v, int v1) throws IOException {
            this.zzb(v, 0);
            this.zzn(v1);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzc(int v, long v1) throws IOException {
            this.zzb(v, 1);
            this.zzd(v1);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzd(int v, int v1) throws IOException {
            this.zzb(v, 0);
            this.zzo(v1);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzd(long v) throws IOException {
            this.zzgd.putLong(((int)(this.zzgi - this.zzge)), v);
            this.zzgi += 8L;
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzd(byte[] arr_b, int v, int v1) throws IOException {
            this.zzo(v1);
            this.write(arr_b, 0, v1);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzf(int v, int v1) throws IOException {
            this.zzb(v, 5);
            this.zzq(v1);
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzg(String s) throws IOException {
            long v;
            try {
                v = this.zzgi;
                int v1 = zzbn.zzt(s.length());
                if(v1 == zzbn.zzt(s.length() * 3)) {
                    int v2 = ((int)(this.zzgi - this.zzge)) + v1;
                    this.zzgd.position(v2);
                    zzff.zza(s, this.zzgd);
                    int v3 = this.zzgd.position() - v2;
                    this.zzo(v3);
                    this.zzgi += (long)v3;
                    return;
                }
                int v4 = zzff.zza(s);
                this.zzo(v4);
                this.zzk(this.zzgi);
                zzff.zza(s, this.zzgd);
                this.zzgi += (long)v4;
                return;
            }
            catch(zzfi zzfi0) {
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                throw new zzc(illegalArgumentException0);
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                throw new zzc(indexOutOfBoundsException0);
            }
            this.zzgi = v;
            this.zzk(v);
            this.zza(s, zzfi0);
        }

        private final void zzk(long v) {
            this.zzgd.position(((int)(v - this.zzge)));
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzn(int v) throws IOException {
            if(v >= 0) {
                this.zzo(v);
                return;
            }
            this.zzb(((long)v));
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzo(int v) throws IOException {
            if(this.zzgi <= this.zzgh) {
                while((v & 0xFFFFFF80) != 0) {
                    long v1 = this.zzgi;
                    this.zzgi = v1 + 1L;
                    zzfd.zza(v1, ((byte)(v & 0x7F | 0x80)));
                    v >>>= 7;
                }
                long v2 = this.zzgi;
                this.zzgi = v2 + 1L;
                zzfd.zza(v2, ((byte)v));
                return;
            }
            long v3;
            while((v3 = this.zzgi) < this.zzgg) {
                if((v & 0xFFFFFF80) == 0) {
                    this.zzgi = v3 + 1L;
                    zzfd.zza(v3, ((byte)v));
                    return;
                }
                this.zzgi = v3 + 1L;
                zzfd.zza(v3, ((byte)(v & 0x7F | 0x80)));
                v >>>= 7;
            }
            throw new zzc(String.format("Pos: %d, limit: %d, len: %d", this.zzgi, this.zzgg, 1));
        }

        @Override  // com.google.android.gms.internal.clearcut.zzbn
        public final void zzq(int v) throws IOException {
            this.zzgd.putInt(((int)(this.zzgi - this.zzge)), v);
            this.zzgi += 4L;
        }
    }

    private static final Logger logger;
    private static final boolean zzfy;
    zzbp zzfz;

    static {
        zzbn.logger = Logger.getLogger("com.google.android.gms.internal.clearcut.zzbn");
        zzbn.zzfy = true;
    }

    private zzbn() {
    }

    zzbn(zzbo zzbo0) {
    }

    public abstract void flush() throws IOException;

    public abstract void write(byte[] arg1, int arg2, int arg3) throws IOException;

    public static int zza(int v, zzcv zzcv0) {
        int v1 = zzcv0.zzas();
        return zzbn.zzr(v) + (zzbn.zzt(v1) + v1);
    }

    public static int zza(zzcv zzcv0) {
        int v = zzcv0.zzas();
        return zzbn.zzt(v) + v;
    }

    public static zzbn zza(ByteBuffer byteBuffer0) {
        if(byteBuffer0.hasArray()) {
            return new zzb(byteBuffer0);
        }
        if(!byteBuffer0.isDirect() || byteBuffer0.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        }
        return new zze(byteBuffer0);
    }

    public abstract void zza(byte arg1) throws IOException;

    public final void zza(double f) throws IOException {
        this.zzd(Double.doubleToRawLongBits(f));
    }

    public final void zza(float f) throws IOException {
        this.zzq(Float.floatToRawIntBits(f));
    }

    public final void zza(int v, double f) throws IOException {
        this.zzc(v, Double.doubleToRawLongBits(f));
    }

    public final void zza(int v, float f) throws IOException {
        this.zzf(v, Float.floatToRawIntBits(f));
    }

    public abstract void zza(int arg1, long arg2) throws IOException;

    public abstract void zza(int arg1, zzbb arg2) throws IOException;

    public abstract void zza(int arg1, zzdo arg2) throws IOException;

    abstract void zza(int arg1, zzdo arg2, zzef arg3) throws IOException;

    public abstract void zza(int arg1, String arg2) throws IOException;

    public abstract void zza(zzbb arg1) throws IOException;

    abstract void zza(zzdo arg1, zzef arg2) throws IOException;

    final void zza(String s, zzfi zzfi0) throws IOException {
        zzbn.logger.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzfi0);
        byte[] arr_b = s.getBytes(zzci.UTF_8);
        try {
            this.zzo(arr_b.length);
            this.zza(arr_b, 0, arr_b.length);
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new zzc(indexOutOfBoundsException0);
        }
    }

    public final void zza(boolean z) throws IOException {
        this.zza(((byte)z));
    }

    public abstract int zzag();

    static boolean zzah() [...] // 潜在的解密器

    public static int zzb(double f) {
        return 8;
    }

    public static int zzb(float f) {
        return 4;
    }

    public static int zzb(int v, double f) {
        return zzbn.zzr(v) + 8;
    }

    public static int zzb(int v, float f) {
        return zzbn.zzr(v) + 4;
    }

    // 去混淆评级： 低(20)
    public static int zzb(int v, zzcv zzcv0) {
        return zzbn.zzh(2, v) + 2 + zzbn.zza(3, zzcv0);
    }

    static int zzb(int v, zzdo zzdo0, zzef zzef0) {
        return zzbn.zzr(v) + zzbn.zzb(zzdo0, zzef0);
    }

    public static int zzb(int v, String s) {
        return zzbn.zzr(v) + zzbn.zzh(s);
    }

    public static int zzb(zzbb zzbb0) {
        int v = zzbb0.size();
        return zzbn.zzt(v) + v;
    }

    static int zzb(zzdo zzdo0, zzef zzef0) {
        int v = ((zzas)zzdo0).zzs();
        if(v == -1) {
            v = zzef0.zzm(((zzas)zzdo0));
            ((zzas)zzdo0).zzf(v);
        }
        return zzbn.zzt(v) + v;
    }

    public static int zzb(boolean z) {
        return 1;
    }

    public abstract void zzb(int arg1, int arg2) throws IOException;

    public final void zzb(int v, long v1) throws IOException {
        this.zza(v, v1 >> 0x3F ^ v1 << 1);
    }

    public abstract void zzb(int arg1, zzbb arg2) throws IOException;

    public abstract void zzb(int arg1, zzdo arg2) throws IOException;

    public abstract void zzb(int arg1, boolean arg2) throws IOException;

    public abstract void zzb(long arg1) throws IOException;

    public abstract void zzb(zzdo arg1) throws IOException;

    public static int zzc(int v, zzbb zzbb0) {
        int v1 = zzbb0.size();
        return zzbn.zzr(v) + (zzbn.zzt(v1) + v1);
    }

    public static int zzc(int v, zzdo zzdo0) {
        return zzbn.zzr(v) + zzbn.zzc(zzdo0);
    }

    @Deprecated
    static int zzc(int v, zzdo zzdo0, zzef zzef0) {
        int v1 = zzbn.zzr(v);
        int v2 = ((zzas)zzdo0).zzs();
        if(v2 == -1) {
            v2 = zzef0.zzm(((zzas)zzdo0));
            ((zzas)zzdo0).zzf(v2);
        }
        return (v1 << 1) + v2;
    }

    public static int zzc(int v, boolean z) {
        return zzbn.zzr(v) + 1;
    }

    public static int zzc(zzdo zzdo0) {
        int v = zzdo0.zzas();
        return zzbn.zzt(v) + v;
    }

    public static zzbn zzc(byte[] arr_b) {
        return new zza(arr_b, 0, arr_b.length);
    }

    public abstract void zzc(int arg1, int arg2) throws IOException;

    public abstract void zzc(int arg1, long arg2) throws IOException;

    public final void zzc(long v) throws IOException {
        this.zzb(v >> 0x3F ^ v << 1);
    }

    public static int zzd(int v, long v1) {
        return zzbn.zzr(v) + zzbn.zzf(v1);
    }

    // 去混淆评级： 低(20)
    public static int zzd(int v, zzbb zzbb0) {
        return zzbn.zzh(2, v) + 2 + zzbn.zzc(3, zzbb0);
    }

    // 去混淆评级： 低(20)
    public static int zzd(int v, zzdo zzdo0) {
        return zzbn.zzh(2, v) + 2 + zzbn.zzc(3, zzdo0);
    }

    @Deprecated
    public static int zzd(zzdo zzdo0) {
        return zzdo0.zzas();
    }

    public static int zzd(byte[] arr_b) {
        return zzbn.zzt(arr_b.length) + arr_b.length;
    }

    public abstract void zzd(int arg1, int arg2) throws IOException;

    public abstract void zzd(long arg1) throws IOException;

    abstract void zzd(byte[] arg1, int arg2, int arg3) throws IOException;

    public static int zze(int v, long v1) {
        return zzbn.zzr(v) + zzbn.zzf(v1);
    }

    public static int zze(long v) {
        return zzbn.zzf(v);
    }

    public final void zze(int v, int v1) throws IOException {
        this.zzd(v, v1 >> 0x1F ^ v1 << 1);
    }

    public static int zzf(int v, long v1) {
        return zzbn.zzr(v) + zzbn.zzf(v1 >> 0x3F ^ v1 << 1);
    }

    public static int zzf(long v) {
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

    public abstract void zzf(int arg1, int arg2) throws IOException;

    public static int zzg(int v, int v1) {
        return zzbn.zzr(v) + zzbn.zzs(v1);
    }

    public static int zzg(int v, long v1) {
        return zzbn.zzr(v) + 8;
    }

    public static int zzg(long v) {
        return zzbn.zzf(v >> 0x3F ^ v << 1);
    }

    public abstract void zzg(String arg1) throws IOException;

    public static int zzh(int v, int v1) {
        return zzbn.zzr(v) + zzbn.zzt(v1);
    }

    public static int zzh(int v, long v1) {
        return zzbn.zzr(v) + 8;
    }

    public static int zzh(long v) {
        return 8;
    }

    public static int zzh(String s) {
        int v;
        try {
            v = zzff.zza(s);
            return zzbn.zzt(v) + v;
        }
        catch(zzfi unused_ex) {
            v = s.getBytes(zzci.UTF_8).length;
            return zzbn.zzt(v) + v;
        }
    }

    public static int zzi(int v, int v1) {
        return zzbn.zzr(v) + zzbn.zzt(v1 >> 0x1F ^ v1 << 1);
    }

    public static int zzi(long v) {
        return 8;
    }

    public static int zzj(int v, int v1) {
        return zzbn.zzr(v) + 4;
    }

    private static long zzj(long v) [...] // Inlined contents

    public static int zzk(int v, int v1) {
        return zzbn.zzr(v) + 4;
    }

    public static int zzl(int v, int v1) {
        return zzbn.zzr(v) + zzbn.zzs(v1);
    }

    public abstract void zzn(int arg1) throws IOException;

    public abstract void zzo(int arg1) throws IOException;

    public final void zzp(int v) throws IOException {
        this.zzo(v >> 0x1F ^ v << 1);
    }

    public abstract void zzq(int arg1) throws IOException;

    public static int zzr(int v) [...] // 潜在的解密器

    public static int zzs(int v) {
        return v < 0 ? 10 : zzbn.zzt(v);
    }

    public static int zzt(int v) {
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

    public static int zzu(int v) {
        return zzbn.zzt(v >> 0x1F ^ v << 1);
    }

    public static int zzv(int v) {
        return 4;
    }

    public static int zzw(int v) {
        return 4;
    }

    public static int zzx(int v) {
        return zzbn.zzs(v);
    }

    private static int zzy(int v) [...] // Inlined contents

    @Deprecated
    public static int zzz(int v) {
        return zzbn.zzt(v);
    }
}

