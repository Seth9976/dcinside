package j$.time.format;

import j..time.ZoneId;
import j..time.chrono.b;
import j..time.chrono.l;
import j..time.chrono.s;
import j..time.temporal.TemporalAccessor;
import j..time.temporal.TemporalQuery;
import j..time.temporal.a;
import j..time.temporal.m;
import j..time.temporal.q;
import j..util.Objects;
import java.util.Locale;

final class y {
    private TemporalAccessor a;
    private DateTimeFormatter b;
    private int c;

    y(TemporalAccessor temporalAccessor0, DateTimeFormatter dateTimeFormatter0) {
        l l0 = dateTimeFormatter0.b();
        if(l0 != null) {
            l l1 = (l)temporalAccessor0.y(m.e());
            ZoneId zoneId0 = (ZoneId)temporalAccessor0.y(m.l());
            b b0 = null;
            if(Objects.equals(l0, l1)) {
                l0 = null;
            }
            Objects.equals(null, zoneId0);
            if(l0 != null) {
                if(temporalAccessor0.e(a.EPOCH_DAY)) {
                    b0 = l0.o(temporalAccessor0);
                }
                else if(l0 != s.d || l1 != null) {
                    a[] arr_a = a.values();
                    for(int v = 0; v < arr_a.length; ++v) {
                        a a0 = arr_a[v];
                        if(a0.z() && temporalAccessor0.e(a0)) {
                            throw new j..time.b("Unable to apply override chronology \'" + l0 + "\' because the temporal object being formatted contains date fields but does not represent a whole date: " + temporalAccessor0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                        }
                    }
                }
                temporalAccessor0 = new x(b0, temporalAccessor0, l0, zoneId0);
            }
        }
        this.a = temporalAccessor0;
        this.b = dateTimeFormatter0;
    }

    final void a() {
        --this.c;
    }

    final C b() {
        return this.b.c();
    }

    final Locale c() {
        return this.b.d();
    }

    final TemporalAccessor d() {
        return this.a;
    }

    final Long e(q q0) {
        TemporalAccessor temporalAccessor0 = this.a;
        return this.c <= 0 || temporalAccessor0.e(q0) ? temporalAccessor0.u(q0) : null;
    }

    final Object f(TemporalQuery temporalQuery0) {
        TemporalAccessor temporalAccessor0 = this.a;
        Object object0 = temporalAccessor0.y(temporalQuery0);
        if(object0 == null && this.c == 0) {
            throw new j..time.b("Unable to extract " + temporalQuery0 + " from temporal " + temporalAccessor0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        return object0;
    }

    final void g() {
        ++this.c;
    }

    @Override
    public final String toString() {
        return this.a.toString();
    }
}

