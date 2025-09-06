package androidx.media3.exoplayer.video;

import androidx.annotation.VisibleForTesting;
import java.util.Arrays;

final class FixedFrameRateEstimator {
    static final class Matcher {
        private long a;
        private long b;
        private long c;
        private long d;
        private long e;
        private long f;
        private final boolean[] g;
        private int h;

        public Matcher() {
            this.g = new boolean[15];
        }

        public long a() {
            return this.e == 0L ? 0L : this.f / this.e;
        }

        public long b() {
            return this.f;
        }

        private static int c(long v) [...] // Inlined contents

        public boolean d() {
            return this.d == 0L ? false : this.g[((int)((this.d - 1L) % 15L))];
        }

        public boolean e() {
            return this.d > 15L && this.h == 0;
        }

        public void f(long v) {
            long v1 = this.d;
            if(v1 == 0L) {
                this.a = v;
            }
            else if(v1 == 1L) {
                long v2 = v - this.a;
                this.b = v2;
                this.f = v2;
                this.e = 1L;
            }
            else {
                long v3 = v - this.c;
                if(Math.abs(v3 - this.b) <= 1000000L) {
                    ++this.e;
                    this.f += v3;
                    boolean[] arr_z = this.g;
                    if(arr_z[((int)(v1 % 15L))]) {
                        arr_z[((int)(v1 % 15L))] = false;
                        --this.h;
                    }
                }
                else {
                    boolean[] arr_z1 = this.g;
                    if(!arr_z1[((int)(v1 % 15L))]) {
                        arr_z1[((int)(v1 % 15L))] = true;
                        ++this.h;
                    }
                }
            }
            ++this.d;
            this.c = v;
        }

        public void g() {
            this.d = 0L;
            this.e = 0L;
            this.f = 0L;
            this.h = 0;
            Arrays.fill(this.g, false);
        }
    }

    private Matcher a;
    private Matcher b;
    private boolean c;
    private boolean d;
    private long e;
    private int f;
    public static final int g = 15;
    @VisibleForTesting
    static final long h = 1000000L;

    public FixedFrameRateEstimator() {
        this.a = new Matcher();
        this.b = new Matcher();
        this.e = 0x8000000000000001L;
    }

    // 去混淆评级： 低(20)
    public long a() {
        return this.e() ? this.a.a() : 0x8000000000000001L;
    }

    // 去混淆评级： 低(20)
    public float b() {
        return this.e() ? ((float)(1000000000.0 / ((double)this.a.a()))) : -1.0f;
    }

    public int c() {
        return this.f;
    }

    // 去混淆评级： 低(20)
    public long d() {
        return this.e() ? this.a.b() : 0x8000000000000001L;
    }

    public boolean e() {
        return this.a.e();
    }

    public void f(long v) {
        this.a.f(v);
        int v1 = 0;
        if(this.a.e() && !this.d) {
            this.c = false;
        }
        else if(this.e != 0x8000000000000001L) {
            if(!this.c || this.b.d()) {
                this.b.g();
                this.b.f(this.e);
            }
            this.c = true;
            this.b.f(v);
        }
        if(this.c && this.b.e()) {
            Matcher fixedFrameRateEstimator$Matcher0 = this.a;
            this.a = this.b;
            this.b = fixedFrameRateEstimator$Matcher0;
            this.c = false;
            this.d = false;
        }
        this.e = v;
        if(!this.a.e()) {
            v1 = this.f + 1;
        }
        this.f = v1;
    }

    public void g() {
        this.a.g();
        this.b.g();
        this.c = false;
        this.e = 0x8000000000000001L;
        this.f = 0;
    }
}

