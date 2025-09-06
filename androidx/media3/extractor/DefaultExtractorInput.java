package androidx.media3.extractor;

import androidx.media3.common.DataReader;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

@UnstableApi
public final class DefaultExtractorInput implements ExtractorInput {
    private final byte[] b;
    private final DataReader c;
    private final long d;
    private long e;
    private byte[] f;
    private int g;
    private int h;
    private static final int i = 0x10000;
    private static final int j = 0x80000;
    private static final int k = 0x1000;

    static {
        MediaLibraryInfo.a("media3.extractor");
    }

    public DefaultExtractorInput(DataReader dataReader0, long v, long v1) {
        this.c = dataReader0;
        this.e = v;
        this.d = v1;
        this.f = new byte[0x10000];
        this.b = new byte[0x1000];
    }

    @Override  // androidx.media3.extractor.ExtractorInput
    public boolean d(int v, boolean z) throws IOException {
        int v1;
        for(v1 = this.y(v); v1 < v && v1 != -1; v1 = this.x(this.b, -v1, Math.min(v, this.b.length + v1), v1, z)) {
        }
        this.u(v1);
        return v1 != -1;
    }

    @Override  // androidx.media3.extractor.ExtractorInput
    public boolean e(byte[] arr_b, int v, int v1, boolean z) throws IOException {
        int v2;
        for(v2 = this.w(arr_b, v, v1); v2 < v1 && v2 != -1; v2 = this.x(arr_b, v, v1, v2, z)) {
        }
        this.u(v2);
        return v2 != -1;
    }

    @Override  // androidx.media3.extractor.ExtractorInput
    public int g(int v) throws IOException {
        int v1 = this.y(v);
        if(v1 == 0) {
            v1 = this.x(this.b, 0, Math.min(v, this.b.length), 0, true);
        }
        this.u(v1);
        return v1;
    }

    @Override  // androidx.media3.extractor.ExtractorInput
    public long getLength() {
        return this.d;
    }

    @Override  // androidx.media3.extractor.ExtractorInput
    public long getPosition() {
        return this.e;
    }

    @Override  // androidx.media3.extractor.ExtractorInput
    public void h(long v, Throwable throwable0) throws Throwable {
        Assertions.a(v >= 0L);
        this.e = v;
        throw throwable0;
    }

    @Override  // androidx.media3.extractor.ExtractorInput
    public int i(byte[] arr_b, int v, int v1) throws IOException {
        int v4;
        this.v(v1);
        int v2 = this.g;
        int v3 = this.h - v2;
        if(v3 == 0) {
            v4 = this.x(this.f, v2, v1, 0, true);
            if(v4 == -1) {
                return -1;
            }
            this.h += v4;
        }
        else {
            v4 = Math.min(v1, v3);
        }
        System.arraycopy(this.f, this.g, arr_b, v, v4);
        this.g += v4;
        return v4;
    }

    @Override  // androidx.media3.extractor.ExtractorInput
    public void k(byte[] arr_b, int v, int v1) throws IOException {
        this.n(arr_b, v, v1, false);
    }

    @Override  // androidx.media3.extractor.ExtractorInput
    public boolean n(byte[] arr_b, int v, int v1, boolean z) throws IOException {
        if(!this.s(v1, z)) {
            return false;
        }
        System.arraycopy(this.f, this.g - v1, arr_b, v, v1);
        return true;
    }

    @Override  // androidx.media3.extractor.ExtractorInput
    public void o() {
        this.g = 0;
    }

    @Override  // androidx.media3.extractor.ExtractorInput
    public long p() {
        return this.e + ((long)this.g);
    }

    @Override  // androidx.media3.extractor.ExtractorInput
    public void q(int v) throws IOException {
        this.s(v, false);
    }

    @Override  // androidx.media3.extractor.ExtractorInput
    public void r(int v) throws IOException {
        this.d(v, false);
    }

    @Override  // androidx.media3.extractor.ExtractorInput
    public int read(byte[] arr_b, int v, int v1) throws IOException {
        int v2 = this.w(arr_b, v, v1);
        if(v2 == 0) {
            v2 = this.x(arr_b, v, v1, 0, true);
        }
        this.u(v2);
        return v2;
    }

    @Override  // androidx.media3.extractor.ExtractorInput
    public void readFully(byte[] arr_b, int v, int v1) throws IOException {
        this.e(arr_b, v, v1, false);
    }

    @Override  // androidx.media3.extractor.ExtractorInput
    public boolean s(int v, boolean z) throws IOException {
        this.v(v);
        int v1 = this.h - this.g;
        while(v1 < v) {
            v1 = this.x(this.f, this.g, v, v1, z);
            if(v1 == -1) {
                return false;
            }
            this.h = this.g + v1;
        }
        this.g += v;
        return true;
    }

    private void u(int v) {
        if(v != -1) {
            this.e += (long)v;
        }
    }

    private void v(int v) {
        int v1 = this.g + v;
        byte[] arr_b = this.f;
        if(v1 > arr_b.length) {
            this.f = Arrays.copyOf(this.f, Util.w(arr_b.length * 2, v1 + 0x10000, v1 + 0x80000));
        }
    }

    private int w(byte[] arr_b, int v, int v1) {
        int v2 = this.h;
        if(v2 == 0) {
            return 0;
        }
        int v3 = Math.min(v2, v1);
        System.arraycopy(this.f, 0, arr_b, v, v3);
        this.z(v3);
        return v3;
    }

    private int x(byte[] arr_b, int v, int v1, int v2, boolean z) throws IOException {
        if(Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int v3 = this.c.read(arr_b, v + v2, v1 - v2);
        if(v3 == -1) {
            if(v2 != 0 || !z) {
                throw new EOFException();
            }
            return -1;
        }
        return v2 + v3;
    }

    private int y(int v) {
        int v1 = Math.min(this.h, v);
        this.z(v1);
        return v1;
    }

    private void z(int v) {
        int v1 = this.h - v;
        this.h = v1;
        this.g = 0;
        byte[] arr_b = this.f;
        byte[] arr_b1 = v1 >= arr_b.length - 0x80000 ? arr_b : new byte[v1 + 0x10000];
        System.arraycopy(arr_b, v, arr_b1, 0, v1);
        this.f = arr_b1;
    }
}

