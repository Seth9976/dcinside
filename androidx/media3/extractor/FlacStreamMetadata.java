package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.Format.Builder;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@UnstableApi
public final class FlacStreamMetadata {
    public static class SeekTable {
        public final long[] a;
        public final long[] b;

        public SeekTable(long[] arr_v, long[] arr_v1) {
            this.a = arr_v;
            this.b = arr_v1;
        }
    }

    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    @Nullable
    public final SeekTable k;
    @Nullable
    private final Metadata l;
    private static final String m = "FlacStreamMetadata";
    public static final int n = -1;

    private FlacStreamMetadata(int v, int v1, int v2, int v3, int v4, int v5, int v6, long v7, @Nullable SeekTable flacStreamMetadata$SeekTable0, @Nullable Metadata metadata0) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
        this.f = FlacStreamMetadata.m(v4);
        this.g = v5;
        this.h = v6;
        this.i = FlacStreamMetadata.f(v6);
        this.j = v7;
        this.k = flacStreamMetadata$SeekTable0;
        this.l = metadata0;
    }

    public FlacStreamMetadata(int v, int v1, int v2, int v3, int v4, int v5, int v6, long v7, ArrayList arrayList0, ArrayList arrayList1) {
        this(v, v1, v2, v3, v4, v5, v6, v7, null, FlacStreamMetadata.a(arrayList0, arrayList1));
    }

    public FlacStreamMetadata(byte[] arr_b, int v) {
        ParsableBitArray parsableBitArray0 = new ParsableBitArray(arr_b);
        parsableBitArray0.q(v * 8);
        this.a = parsableBitArray0.h(16);
        this.b = parsableBitArray0.h(16);
        this.c = parsableBitArray0.h(24);
        this.d = parsableBitArray0.h(24);
        int v1 = parsableBitArray0.h(20);
        this.e = v1;
        this.f = FlacStreamMetadata.m(v1);
        this.g = parsableBitArray0.h(3) + 1;
        int v2 = parsableBitArray0.h(5);
        this.h = v2 + 1;
        this.i = FlacStreamMetadata.f(v2 + 1);
        this.j = parsableBitArray0.j(36);
        this.k = null;
        this.l = null;
    }

    @Nullable
    private static Metadata a(List list0, List list1) {
        Metadata metadata0 = VorbisUtil.d(list0);
        return metadata0 != null || !list1.isEmpty() ? new Metadata(list1).c(metadata0) : null;
    }

    public FlacStreamMetadata b(List list0) {
        Metadata metadata0 = this.k(new Metadata(list0));
        return new FlacStreamMetadata(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, this.k, metadata0);
    }

    public FlacStreamMetadata c(@Nullable SeekTable flacStreamMetadata$SeekTable0) {
        return new FlacStreamMetadata(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, flacStreamMetadata$SeekTable0, this.l);
    }

    public FlacStreamMetadata d(List list0) {
        Metadata metadata0 = this.k(VorbisUtil.d(list0));
        return new FlacStreamMetadata(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, this.k, metadata0);
    }

    public long e() {
        int v = this.d;
        if(v > 0) {
            return (((long)v) + ((long)this.c)) / 2L + 1L;
        }
        return this.a != this.b || this.a <= 0 ? 0x1000L * ((long)this.g) * ((long)this.h) / 8L + 0x40L : ((long)this.a) * ((long)this.g) * ((long)this.h) / 8L + 0x40L;
    }

    private static int f(int v) {
        switch(v) {
            case 8: {
                return 1;
            }
            case 12: {
                return 2;
            }
            case 16: {
                return 4;
            }
            case 20: {
                return 5;
            }
            case 24: {
                return 6;
            }
            default: {
                return -1;
            }
        }
    }

    public int g() {
        return this.h * this.e * this.g;
    }

    public long h() {
        return this.j == 0L ? 0x8000000000000001L : this.j * 1000000L / ((long)this.e);
    }

    public Format i(byte[] arr_b, @Nullable Metadata metadata0) {
        arr_b[4] = (byte)0x80;
        Metadata metadata1 = this.k(metadata0);
        return new Builder().o0("audio/flac").f0((this.d > 0 ? this.d : -1)).N(this.g).p0(this.e).i0(Util.z0(this.h)).b0(Collections.singletonList(arr_b)).h0(metadata1).K();
    }

    public int j() {
        return this.b * this.g * (this.h / 8);
    }

    @Nullable
    public Metadata k(@Nullable Metadata metadata0) {
        return this.l == null ? metadata0 : this.l.c(metadata0);
    }

    public long l(long v) {
        return Util.x(v * ((long)this.e) / 1000000L, 0L, this.j - 1L);
    }

    private static int m(int v) {
        switch(v) {
            case 8000: {
                return 4;
            }
            case 16000: {
                return 5;
            }
            case 22050: {
                return 6;
            }
            case 24000: {
                return 7;
            }
            case 32000: {
                return 8;
            }
            case 44100: {
                return 9;
            }
            case 48000: {
                return 10;
            }
            case 88200: {
                return 1;
            }
            case 96000: {
                return 11;
            }
            case 176400: {
                return 2;
            }
            case 192000: {
                return 3;
            }
            default: {
                return -1;
            }
        }
    }
}

