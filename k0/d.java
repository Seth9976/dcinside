package k0;

public final class d {
    public @interface a {
    }

    @a
    private final int a;
    private final Object b;
    private final Throwable c;
    public static final int d = 2;
    public static final int e = 4;
    public static final int f = 8;

    private d(@a int v, Object object0, Throwable throwable0) {
        this.a = v;
        this.b = object0;
        this.c = throwable0;
    }

    public static d a() {
        return new d(8, null, null);
    }

    public Object b() {
        return this.b;
    }

    public Throwable c() {
        return this.c;
    }

    @a
    public int d() {
        return this.a;
    }

    public static d e() {
        return new d(2, null, null);
    }

    public static d f(Object object0) {
        return new d(8, object0, null);
    }

    public static d g(Throwable throwable0) {
        return new d(4, null, throwable0);
    }
}

