package j$.time.zone;

import j..time.Duration;
import j..time.LocalDateTime;
import j..time.ZoneOffset;
import j..time.chrono.h;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

public final class b implements Serializable, Comparable {
    private final long a;
    private final LocalDateTime b;
    private final ZoneOffset c;
    private final ZoneOffset d;
    private static final long serialVersionUID = 0x9F9AB17D4C397C9EL;

    b(long v, ZoneOffset zoneOffset0, ZoneOffset zoneOffset1) {
        this.a = v;
        this.b = LocalDateTime.a0(v, 0, zoneOffset0);
        this.c = zoneOffset0;
        this.d = zoneOffset1;
    }

    b(LocalDateTime localDateTime0, ZoneOffset zoneOffset0, ZoneOffset zoneOffset1) {
        localDateTime0.getClass();
        this.a = h.n(localDateTime0, zoneOffset0);
        this.b = localDateTime0;
        this.c = zoneOffset0;
        this.d = zoneOffset1;
    }

    public final long P() {
        return this.a;
    }

    @Override
    public final int compareTo(Object object0) {
        return Long.compare(this.a, ((b)object0).a);
    }

    // 去混淆评级： 低(40)
    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : object0 instanceof b && (this.a == ((b)object0).a && this.c.equals(((b)object0).c) && this.d.equals(((b)object0).d));
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ this.c.hashCode() ^ Integer.rotateLeft(this.d.hashCode(), 16);
    }

    public final LocalDateTime l() {
        return this.b.d0(((long)(this.d.W() - this.c.W())));
    }

    public final LocalDateTime n() {
        return this.b;
    }

    public final Duration p() {
        return Duration.u(this.d.W() - this.c.W());
    }

    public final ZoneOffset q() {
        return this.d;
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    // 去混淆评级： 低(20)
    @Override
    public final String toString() {
        return "Transition[" + (this.z() ? "Gap" : "Overlap") + " at " + this.b + this.c + " to " + this.d + ']';
    }

    public final ZoneOffset u() {
        return this.c;
    }

    final void writeExternal(ObjectOutput objectOutput0) {
        a.c(this.a, objectOutput0);
        a.d(this.c, objectOutput0);
        a.d(this.d, objectOutput0);
    }

    private Object writeReplace() {
        return new a(2, this);
    }

    // 去混淆评级： 低(20)
    final List y() {
        return this.z() ? Collections.emptyList() : j..com.android.tools.r8.a.k(new Object[]{this.c, this.d});
    }

    public final boolean z() {
        return this.d.W() > this.c.W();
    }
}

