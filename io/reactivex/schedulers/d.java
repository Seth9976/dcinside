package io.reactivex.schedulers;

import d3.f;
import io.reactivex.internal.functions.b;
import java.util.concurrent.TimeUnit;

public final class d {
    final Object a;
    final long b;
    final TimeUnit c;

    public d(@f Object object0, long v, @f TimeUnit timeUnit0) {
        this.a = object0;
        this.b = v;
        this.c = (TimeUnit)b.g(timeUnit0, "unit is null");
    }

    public long a() {
        return this.b;
    }

    public long b(@f TimeUnit timeUnit0) {
        return timeUnit0.convert(this.b, this.c);
    }

    @f
    public TimeUnit c() {
        return this.c;
    }

    @f
    public Object d() {
        return this.a;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof d && b.c(this.a, ((d)object0).a) && this.b == ((d)object0).b && b.c(this.c, ((d)object0).c);
    }

    @Override
    public int hashCode() {
        return this.a == null ? ((int)(this.b ^ this.b >>> 0x1F)) * 0x1F + this.c.hashCode() : (this.a.hashCode() * 0x1F + ((int)(this.b ^ this.b >>> 0x1F))) * 0x1F + this.c.hashCode();
    }

    @Override
    public String toString() {
        return "Timed[time=" + this.b + ", unit=" + this.c + ", value=" + this.a + "]";
    }
}

