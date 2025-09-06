package androidx.datastore.preferences.protobuf;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public final class JavaType extends Enum {
    private final Class a;
    private final Class b;
    private final Object c;
    public static final enum JavaType d;
    public static final enum JavaType e;
    public static final enum JavaType f;
    public static final enum JavaType g;
    public static final enum JavaType h;
    public static final enum JavaType i;
    public static final enum JavaType j;
    public static final enum JavaType k;
    public static final enum JavaType l;
    public static final enum JavaType m;
    private static final JavaType[] n;

    static {
        JavaType.d = new JavaType("VOID", 0, Void.class, Void.class, null);
        Class class0 = Integer.TYPE;
        JavaType.e = new JavaType("INT", 1, class0, Integer.class, 0);
        JavaType.f = new JavaType("LONG", 2, Long.TYPE, Long.class, 0L);
        JavaType.g = new JavaType("FLOAT", 3, Float.TYPE, Float.class, 0.0f);
        JavaType.h = new JavaType("DOUBLE", 4, Double.TYPE, Double.class, 0.0);
        JavaType.i = new JavaType("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        JavaType.j = new JavaType("STRING", 6, String.class, String.class, "");
        JavaType.k = new JavaType("BYTE_STRING", 7, ByteString.class, ByteString.class, ByteString.e);
        JavaType.l = new JavaType("ENUM", 8, class0, Integer.class, null);
        JavaType.m = new JavaType("MESSAGE", 9, Object.class, Object.class, null);
        JavaType.n = new JavaType[]{JavaType.d, JavaType.e, JavaType.f, JavaType.g, JavaType.h, JavaType.i, JavaType.j, JavaType.k, JavaType.l, JavaType.m};
    }

    private JavaType(String s, int v, Class class0, Class class1, Object object0) {
        super(s, v);
        this.a = class0;
        this.b = class1;
        this.c = object0;
    }

    public Class a() {
        return this.b;
    }

    public Object b() {
        return this.c;
    }

    public Class c() {
        return this.a;
    }

    public boolean d(Class class0) {
        return this.a.isAssignableFrom(class0);
    }

    public static JavaType valueOf(String s) {
        return (JavaType)Enum.valueOf(JavaType.class, s);
    }

    public static JavaType[] values() {
        return (JavaType[])JavaType.n.clone();
    }
}

