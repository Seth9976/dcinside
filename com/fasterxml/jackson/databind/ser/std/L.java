package com.fasterxml.jackson.databind.ser.std;

import androidx.compose.animation.core.d;
import com.fasterxml.jackson.annotation.n.c;
import com.fasterxml.jackson.core.n.b;
import com.fasterxml.jackson.databind.H;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.jsonFormatVisitors.g;
import com.fasterxml.jackson.databind.jsonFormatVisitors.n;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.p;
import com.fasterxml.jackson.databind.r;
import com.fasterxml.jackson.databind.ser.k;
import com.fasterxml.jackson.databind.util.G;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

public abstract class l extends L implements k {
    protected final Boolean d;
    protected final DateFormat e;
    protected final AtomicReference f;

    protected l(Class class0, Boolean boolean0, DateFormat dateFormat0) {
        super(class0);
        this.d = boolean0;
        this.e = dateFormat0;
        this.f = dateFormat0 == null ? null : new AtomicReference();
    }

    protected void P(g g0, m m0, boolean z) throws o {
        if(z) {
            this.K(g0, m0, b.b, n.n);
            return;
        }
        this.M(g0, m0, n.d);
    }

    protected boolean Q(I i0) {
        Boolean boolean0 = this.d;
        if(boolean0 != null) {
            return boolean0.booleanValue();
        }
        if(this.e == null) {
            if(i0 == null) {
                throw new IllegalArgumentException("Null SerializerProvider passed for " + this.g().getName());
            }
            return i0.D0(H.l);
        }
        return false;
    }

    protected void R(Date date0, com.fasterxml.jackson.core.k k0, I i0) throws IOException {
        if(this.e == null) {
            i0.V(date0, k0);
            return;
        }
        DateFormat dateFormat0 = (DateFormat)this.f.getAndSet(null);
        if(dateFormat0 == null) {
            dateFormat0 = (DateFormat)this.e.clone();
        }
        k0.d(dateFormat0.format(date0));
        d.a(this.f, null, dateFormat0);
    }

    protected abstract long S(Object arg1);

    public abstract l T(Boolean arg1, DateFormat arg2);

    // 去混淆评级： 低(20)
    @Override  // com.fasterxml.jackson.databind.ser.std.L
    @Deprecated
    public p a(I i0, Type type0) {
        return this.Q(i0) ? this.x("number", true) : this.x("string", true);
    }

    @Override  // com.fasterxml.jackson.databind.ser.k
    public r c(I i0, com.fasterxml.jackson.databind.d d0) throws o {
        com.fasterxml.jackson.annotation.n.d n$d0 = this.C(i0, d0, this.g());
        if(n$d0 == null) {
            return this;
        }
        c n$c0 = n$d0.m();
        if(n$d0.q()) {
            SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("", (n$d0.p() ? n$d0.k() : i0.u()));
            simpleDateFormat0.setTimeZone((n$d0.s() ? n$d0.n() : i0.w()));
            return this.T(Boolean.FALSE, simpleDateFormat0);
        }
        boolean z = n$d0.p();
        if(!z && !n$d0.s() && n$c0 != c.i) {
            return this;
        }
        DateFormat dateFormat0 = i0.r0().w();
        if(dateFormat0 instanceof G) {
            G g0 = (G)dateFormat0;
            if(n$d0.p()) {
                g0 = g0.C(n$d0.k());
            }
            if(n$d0.s()) {
                g0 = g0.D(n$d0.n());
            }
            return this.T(Boolean.FALSE, g0);
        }
        if(!(dateFormat0 instanceof SimpleDateFormat)) {
            i0.E(this.g(), String.format("Configured `DateFormat` (%s) not a `SimpleDateFormat`; cannot configure `Locale` or `TimeZone`", dateFormat0.getClass().getName()));
        }
        SimpleDateFormat simpleDateFormat1 = z ? new SimpleDateFormat(((SimpleDateFormat)dateFormat0).toPattern(), n$d0.k()) : ((SimpleDateFormat)((SimpleDateFormat)dateFormat0).clone());
        TimeZone timeZone0 = n$d0.n();
        if(timeZone0 != null && !timeZone0.equals(simpleDateFormat1.getTimeZone())) {
            simpleDateFormat1.setTimeZone(timeZone0);
        }
        return this.T(Boolean.FALSE, simpleDateFormat1);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.L
    public void e(g g0, m m0) throws o {
        this.P(g0, m0, this.Q(g0.a()));
    }

    @Override  // com.fasterxml.jackson.databind.r
    public boolean h(I i0, Object object0) {
        return false;
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.M
    public abstract void m(Object arg1, com.fasterxml.jackson.core.k arg2, I arg3) throws IOException;
}

