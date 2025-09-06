package kotlin.reflect;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.r;
import y4.l;
import y4.m;

@r
final class C implements WildcardType, y {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public final C a() {
            return C.d;
        }
    }

    @m
    private final Type a;
    @m
    private final Type b;
    @l
    public static final a c;
    @l
    private static final C d;

    static {
        C.c = new a(null);
        C.d = new C(null, null);
    }

    public C(@m Type type0, @m Type type1) {
        this.a = type0;
        this.b = type1;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof WildcardType && Arrays.equals(this.getUpperBounds(), ((WildcardType)object0).getUpperBounds()) && Arrays.equals(this.getLowerBounds(), ((WildcardType)object0).getLowerBounds());
    }

    @Override
    @l
    public Type[] getLowerBounds() {
        return this.b == null ? new Type[0] : new Type[]{this.b};
    }

    @Override  // kotlin.reflect.y
    @l
    public String getTypeName() {
        if(this.b != null) {
            return "? super " + B.j(this.b);
        }
        return this.a == null || L.g(this.a, Object.class) ? "?" : "? extends " + B.j(this.a);
    }

    @Override
    @l
    public Type[] getUpperBounds() {
        Type type0 = this.a;
        if(type0 == null) {
            type0 = Object.class;
        }
        return new Type[]{type0};
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(this.getUpperBounds()) ^ Arrays.hashCode(this.getLowerBounds());
    }

    @Override
    @l
    public String toString() {
        return this.getTypeName();
    }
}

