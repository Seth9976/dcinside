package l2;

public class b implements a {
    private static b a;

    public static b a() {
        if(b.a == null) {
            b.a = new b();
        }
        return b.a;
    }

    @Override  // l2.a
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}

