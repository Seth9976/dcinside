package rx;

public final class a {
    static final class rx.a.a implements d {
        static final rx.a.a a;

        static {
            rx.a.a.a = new rx.a.a();
        }

        // 检测为 Lambda 实现
        @Override  // rx.a$d
        public boolean a() [...]
    }

    static final class b implements d {
        static final b a;

        static {
            b.a = new b();
        }

        // 检测为 Lambda 实现
        @Override  // rx.a$d
        public boolean a() [...]
    }

    static final class c implements d {
        static final c a;

        static {
            c.a = new c();
        }

        // 检测为 Lambda 实现
        @Override  // rx.a$d
        public boolean a() throws rx.exceptions.d [...]
    }

    public interface d {
        boolean a() throws rx.exceptions.d;
    }

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;

    static {
        a.a = () -> throw new rx.exceptions.d("Overflowed buffer");
        a.b = () -> throw new rx.exceptions.d("Overflowed buffer");
        a.c = () -> true;
        a.d = () -> false;
    }

    private a() {
        throw new IllegalStateException("No instances!");
    }
}

