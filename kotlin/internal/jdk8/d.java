package kotlin.internal.jdk8;

import android.os.Build.VERSION;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.internal.jdk7.a;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.f;

public class d extends a {
    @s0({"SMAP\nJDK8PlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JDK8PlatformImplementations.kt\nkotlin/internal/jdk8/JDK8PlatformImplementations$ReflectSdkVersion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
    static final class kotlin.internal.jdk8.d.a {
        @l
        public static final kotlin.internal.jdk8.d.a a;
        @m
        @f
        public static final Integer b;

        static {
            kotlin.internal.jdk8.d.a.a = new kotlin.internal.jdk8.d.a();
            Integer integer0 = null;
            Integer integer1 = Build.VERSION.SDK_INT;
            Integer integer2 = integer1 instanceof Integer ? integer1 : null;
            if(integer2 != null && integer2.intValue() > 0) {
                integer0 = integer2;
            }
            kotlin.internal.jdk8.d.a.b = integer0;
        }
    }

    // 去混淆评级： 低(30)
    @Override  // kotlin.internal.l
    @l
    public kotlin.random.f b() {
        return super.b();
    }

    @Override  // kotlin.internal.l
    @m
    public kotlin.text.m c(@l MatchResult matchResult0, @l String s) {
        L.p(matchResult0, "matchResult");
        L.p(s, "name");
        Matcher matcher0 = matchResult0 instanceof Matcher ? ((Matcher)matchResult0) : null;
        if(matcher0 == null) {
            throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
        }
        kotlin.ranges.l l0 = new kotlin.ranges.l(matcher0.start(s), matcher0.end(s) - 1);
        if(((int)l0.q()) >= 0) {
            String s1 = matcher0.group(s);
            L.o(s1, "group(...)");
            return new kotlin.text.m(s1, l0);
        }
        return null;
    }

    private final boolean e(int v) [...] // 潜在的解密器
}

