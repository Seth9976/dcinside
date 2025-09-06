package javassist.bytecode.stackmap;

public interface e {
    public static final String a = "*top*";
    public static final d b;
    public static final d c;
    public static final d d;
    public static final d e;
    public static final d f;

    static {
        e.b = new d("*top*", 0, ' ');
        e.c = new d("int", 1, 'I');
        e.d = new d("float", 2, 'F');
        e.e = new d("double", 3, 'D');
        e.f = new d("long", 4, 'J');
    }
}

