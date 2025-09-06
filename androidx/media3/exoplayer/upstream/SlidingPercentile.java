package androidx.media3.exoplayer.upstream;

import androidx.media3.common.util.UnstableApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

@UnstableApi
public class SlidingPercentile {
    static class Sample {
        public int a;
        public int b;
        public float c;

        private Sample() {
        }

        Sample(androidx.media3.exoplayer.upstream.SlidingPercentile.1 slidingPercentile$10) {
        }
    }

    private final int a;
    private final ArrayList b;
    private final Sample[] c;
    private int d;
    private int e;
    private int f;
    private int g;
    private static final Comparator h = null;
    private static final Comparator i = null;
    private static final int j = -1;
    private static final int k = 0;
    private static final int l = 1;
    private static final int m = 5;

    static {
        SlidingPercentile.h = (Sample slidingPercentile$Sample0, Sample slidingPercentile$Sample1) -> slidingPercentile$Sample0.a - slidingPercentile$Sample1.a;
        SlidingPercentile.i = (Sample slidingPercentile$Sample0, Sample slidingPercentile$Sample1) -> Float.compare(slidingPercentile$Sample0.c, slidingPercentile$Sample1.c);
    }

    public SlidingPercentile(int v) {
        this.a = v;
        this.c = new Sample[5];
        this.b = new ArrayList();
        this.d = -1;
    }

    public void c(int v, float f) {
        Sample slidingPercentile$Sample0;
        this.d();
        int v1 = this.g;
        if(v1 > 0) {
            this.g = v1 - 1;
            slidingPercentile$Sample0 = this.c[v1 - 1];
        }
        else {
            slidingPercentile$Sample0 = new Sample(null);
        }
        int v2 = this.e;
        this.e = v2 + 1;
        slidingPercentile$Sample0.a = v2;
        slidingPercentile$Sample0.b = v;
        slidingPercentile$Sample0.c = f;
        this.b.add(slidingPercentile$Sample0);
        this.f += v;
        while(true) {
            int v3 = this.f;
            int v4 = this.a;
            if(v3 <= v4) {
                break;
            }
            int v5 = v3 - v4;
            Sample slidingPercentile$Sample1 = (Sample)this.b.get(0);
            int v6 = slidingPercentile$Sample1.b;
            if(v6 <= v5) {
                this.f -= v6;
                this.b.remove(0);
                int v7 = this.g;
                if(v7 >= 5) {
                    continue;
                }
                this.g = v7 + 1;
                this.c[v7] = slidingPercentile$Sample1;
            }
            else {
                slidingPercentile$Sample1.b = v6 - v5;
                this.f -= v5;
            }
        }
    }

    private void d() {
        if(this.d != 1) {
            Collections.sort(this.b, SlidingPercentile.h);
            this.d = 1;
        }
    }

    private void e() {
        if(this.d != 0) {
            Collections.sort(this.b, SlidingPercentile.i);
            this.d = 0;
        }
    }

    public float f(float f) {
        this.e();
        float f1 = f * ((float)this.f);
        int v1 = 0;
        for(int v = 0; v < this.b.size(); ++v) {
            Sample slidingPercentile$Sample0 = (Sample)this.b.get(v);
            v1 += slidingPercentile$Sample0.b;
            if(((float)v1) >= f1) {
                return slidingPercentile$Sample0.c;
            }
        }
        return this.b.isEmpty() ? NaNf : ((Sample)this.b.get(this.b.size() - 1)).c;
    }

    // 检测为 Lambda 实现
    private static int g(Sample slidingPercentile$Sample0, Sample slidingPercentile$Sample1) [...]

    // 检测为 Lambda 实现
    private static int h(Sample slidingPercentile$Sample0, Sample slidingPercentile$Sample1) [...]

    public void i() {
        this.b.clear();
        this.d = -1;
        this.e = 0;
        this.f = 0;
    }

    class androidx.media3.exoplayer.upstream.SlidingPercentile.1 {
    }

}

