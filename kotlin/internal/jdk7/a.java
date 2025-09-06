package kotlin.internal.jdk7;

import android.os.Build.VERSION;
import java.util.List;
import kotlin.internal.l;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.m;
import z3.f;

public class a extends l {
    @s0({"SMAP\nJDK7PlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JDK7PlatformImplementations.kt\nkotlin/internal/jdk7/JDK7PlatformImplementations$ReflectSdkVersion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1#2:39\n*E\n"})
    static final class kotlin.internal.jdk7.a.a {
        @y4.l
        public static final kotlin.internal.jdk7.a.a a;
        @m
        @f
        public static final Integer b;

        static {
            kotlin.internal.jdk7.a.a.a = new kotlin.internal.jdk7.a.a();
            Integer integer0 = null;
            Integer integer1 = Build.VERSION.SDK_INT;
            Integer integer2 = integer1 instanceof Integer ? integer1 : null;
            if(integer2 != null && integer2.intValue() > 0) {
                integer0 = integer2;
            }
            kotlin.internal.jdk7.a.a.b = integer0;
        }
    }

    @Override  // kotlin.internal.l
    public void a(@y4.l Throwable throwable0, @y4.l Throwable throwable1) {
        L.p(throwable0, "cause");
        L.p(throwable1, "exception");
        throwable0.addSuppressed(throwable1);
    }

    @Override  // kotlin.internal.l
    @y4.l
    public List d(@y4.l Throwable throwable0) {
        L.p(throwable0, "exception");
        Throwable[] arr_throwable = throwable0.getSuppressed();
        L.o(arr_throwable, "getSuppressed(...)");
        return kotlin.collections.l.t(arr_throwable);
    }

    private final boolean e(int v) [...] // 潜在的解密器
}

