package j$.time.temporal;

import j..time.d;
import j..util.Objects;
import j..util.concurrent.ConcurrentHashMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class v implements Serializable {
    private final d a;
    private final int b;
    private final transient q c;
    private final transient q d;
    private final transient q e;
    private final transient q f;
    private static final ConcurrentHashMap g = null;
    public static final r h = null;
    private static final long serialVersionUID = 0xEFA92C928B0F09C7L;

    static {
        v.g = new ConcurrentHashMap(4, 0.75f, 2);
        new v(d.MONDAY, 4);
        v.g(d.SUNDAY, 1);
        v.h = i.d;
    }

    private v(d d0, int v) {
        this.c = u.e(this);
        this.d = u.h(this);
        this.e = u.i(this);
        this.f = u.g(this);
        Objects.requireNonNull(d0, "firstDayOfWeek");
        if(v < 1 || v > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.a = d0;
        this.b = v;
    }

    public final q d() {
        return this.c;
    }

    public final d e() {
        return this.a;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 instanceof v && this.hashCode() == object0.hashCode();
    }

    public final int f() {
        return this.b;
    }

    public static v g(d d0, int v) {
        String s = d0.toString() + v;
        ConcurrentHashMap concurrentHashMap0 = v.g;
        v v1 = (v)concurrentHashMap0.get(s);
        if(v1 == null) {
            concurrentHashMap0.putIfAbsent(s, new v(d0, v));
            return (v)concurrentHashMap0.get(s);
        }
        return v1;
    }

    public final q h() {
        return this.f;
    }

    @Override
    public final int hashCode() {
        return this.a.ordinal() * 7 + this.b;
    }

    public final q i() {
        return this.d;
    }

    public final q j() {
        return this.e;
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        objectInputStream0.defaultReadObject();
        if(this.a == null) {
            throw new InvalidObjectException("firstDayOfWeek is null");
        }
        if(this.b < 1 || this.b > 7) {
            throw new InvalidObjectException("Minimal number of days is invalid");
        }
    }

    private Object readResolve() {
        try {
            return v.g(this.a, this.b);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            throw new InvalidObjectException("Invalid serialized WeekFields: " + illegalArgumentException0.getMessage());
        }
    }

    @Override
    public final String toString() {
        return "WeekFields[" + this.a + "," + this.b + "]";
    }
}

