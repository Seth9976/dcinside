package androidx.media3.extractor.ts;

import androidx.media3.common.util.Assertions;
import java.util.Arrays;

final class NalUnitTargetBuffer {
    private final int a;
    private boolean b;
    private boolean c;
    public byte[] d;
    public int e;

    public NalUnitTargetBuffer(int v, int v1) {
        this.a = v;
        byte[] arr_b = new byte[v1 + 3];
        this.d = arr_b;
        arr_b[2] = 1;
    }

    public void a(byte[] arr_b, int v, int v1) {
        if(!this.b) {
            return;
        }
        int v2 = v1 - v;
        byte[] arr_b1 = this.d;
        int v3 = this.e;
        if(arr_b1.length < v3 + v2) {
            this.d = Arrays.copyOf(arr_b1, (v3 + v2) * 2);
        }
        System.arraycopy(arr_b, v, this.d, this.e, v2);
        this.e += v2;
    }

    public boolean b(int v) {
        if(!this.b) {
            return false;
        }
        this.e -= v;
        this.b = false;
        this.c = true;
        return true;
    }

    public boolean c() {
        return this.c;
    }

    public void d() {
        this.b = false;
        this.c = false;
    }

    public void e(int v) {
        boolean z = true;
        Assertions.i(!this.b);
        if(v != this.a) {
            z = false;
        }
        this.b = z;
        if(z) {
            this.e = 3;
            this.c = false;
        }
    }
}

