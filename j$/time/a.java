package j$.time;

import java.io.ObjectInputStream;
import java.io.Serializable;

final class a extends Clock implements Serializable {
    private final ZoneId a;
    static final a b = null;
    private static final long serialVersionUID = 6740630888130243051L;

    static {
        a.b = new a(ZoneOffset.UTC);
    }

    a(ZoneId zoneId0) {
        this.a = zoneId0;
    }

    @Override  // j$.time.Clock
    public final ZoneId a() {
        return this.a;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof a ? this.a.equals(((a)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() + 1;
    }

    @Override  // j$.time.Clock
    public final Instant instant() {
        return Instant.ofEpochMilli(System.currentTimeMillis());
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        objectInputStream0.defaultReadObject();
    }

    @Override
    public final String toString() {
        return "SystemClock[" + this.a + "]";
    }
}

