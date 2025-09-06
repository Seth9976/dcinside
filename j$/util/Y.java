package j$.util;

import j..com.android.tools.r8.a;
import java.util.function.IntConsumer;

public final class y implements IntConsumer {
    private long count;
    private int max;
    private int min;
    private long sum;

    public y() {
        this.min = 0x7FFFFFFF;
        this.max = 0x80000000;
    }

    @Override
    public final void accept(int v) {
        ++this.count;
        this.sum += (long)v;
        this.min = Math.min(this.min, v);
        this.max = Math.max(this.max, v);
    }

    @Override
    public final IntConsumer andThen(IntConsumer intConsumer0) {
        return a.b(this, intConsumer0);
    }

    public final void b(y y0) {
        this.count += y0.count;
        this.sum += y0.sum;
        this.min = Math.min(this.min, y0.min);
        this.max = Math.max(this.max, y0.max);
    }

    @Override
    public final String toString() {
        Long long0 = this.count;
        Long long1 = this.sum;
        Integer integer0 = this.min;
        return this.count <= 0L ? String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", "y", long0, long1, integer0, 0.0, this.max) : String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", "y", long0, long1, integer0, ((double)(((double)this.sum) / ((double)this.count))), this.max);
    }
}

