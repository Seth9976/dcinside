package net.fellbaum.jemoji;

import j..util.Collection.-EL;
import java.util.Arrays;
import java.util.List;

public enum F1 {
    RED_HAIR("\uD83E\uDDB0"),
    CURLY_HAIR("\uD83E\uDDB1"),
    WHITE_HAIR("\uD83E\uDDB3"),
    BALD("\uD83E\uDDB2");

    private final String a;
    private static final List f;

    static {
        F1.f = Arrays.asList(((F1[])F1.g.clone()));
    }

    private F1(String s1) {
        this.a = s1;
    }

    public String b() {
        return this.a;
    }

    public static boolean c(String s) {
        return Collection.-EL.stream(F1.f).anyMatch((F1 f10) -> // 去混淆评级： 低(20)
        s.contains(f10.a) && !s.equals(f10.a));
    }

    // 去混淆评级： 低(20)
    // 检测为 Lambda 实现
    private static boolean d(String s, F1 f10) [...]

    public static String e(String s) {
        for(Object object0: F1.f) {
            s = s.replaceAll("‍?" + ((F1)object0).b(), "");
        }
        return s;
    }
}

