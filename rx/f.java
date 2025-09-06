package rx;

public final class f {
    public static enum a {
        OnNext,
        OnError,
        OnCompleted;

    }

    private final a a;
    private final Throwable b;
    private final Object c;
    private static final f d;

    static {
        f.d = new f(a.c, null, null);
    }

    private f(a f$a0, Object object0, Throwable throwable0) {
        this.c = object0;
        this.b = throwable0;
        this.a = f$a0;
    }

    public void a(h h0) {
        a f$a0 = this.a;
        if(f$a0 == a.a) {
            h0.onNext(this.h());
            return;
        }
        if(f$a0 == a.c) {
            h0.d();
            return;
        }
        h0.onError(this.g());
    }

    public static f b() {
        return f.d;
    }

    @Deprecated
    public static f c(Class class0) {
        return f.d;
    }

    public static f d(Throwable throwable0) {
        return new f(a.b, null, throwable0);
    }

    public static f e(Object object0) {
        return new f(a.a, object0, null);
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == null) {
            return false;
        }
        if(this == object0) {
            return true;
        }
        if(object0.getClass() != f.class) {
            return false;
        }
        if(((f)object0).f() == this.f()) {
            Object object1 = ((f)object0).c;
            if(this.c == object1 || this.c != null && this.c.equals(object1)) {
                Throwable throwable0 = ((f)object0).b;
                return this.b == throwable0 || this.b != null && this.b.equals(throwable0);
            }
        }
        return false;
    }

    public a f() {
        return this.a;
    }

    public Throwable g() {
        return this.b;
    }

    public Object h() {
        return this.c;
    }

    @Override
    public int hashCode() {
        int v = this.f().hashCode();
        if(this.j()) {
            v = v * 0x1F + this.h().hashCode();
        }
        return this.i() ? v * 0x1F + this.g().hashCode() : v;
    }

    public boolean i() {
        return this.l() && this.b != null;
    }

    public boolean j() {
        return this.m() && this.c != null;
    }

    public boolean k() {
        return this.f() == a.c;
    }

    public boolean l() {
        return this.f() == a.b;
    }

    public boolean m() {
        return this.f() == a.a;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(0x40);
        stringBuilder0.append('[');
        stringBuilder0.append(super.toString());
        stringBuilder0.append(' ');
        stringBuilder0.append(this.f());
        if(this.j()) {
            stringBuilder0.append(' ');
            stringBuilder0.append(this.h());
        }
        if(this.i()) {
            stringBuilder0.append(' ');
            stringBuilder0.append(this.g().getMessage());
        }
        stringBuilder0.append(']');
        return stringBuilder0.toString();
    }
}

