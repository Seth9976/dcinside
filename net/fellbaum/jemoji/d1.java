package net.fellbaum.jemoji;

import j..util.Collection.-EL;
import java.util.Arrays;
import java.util.List;

public enum D1 {
    LIGHT_SKIN("\uD83C\uDFFB"),
    MEDIUM_LIGHT_SKIN("\uD83C\uDFFC"),
    MEDIUM_SKIN("\uD83C\uDFFD"),
    MEDIUM_DARK_SKIN("\uD83C\uDFFE"),
    DARK_SKIN("\uD83C\uDFFF");

    private final String a;
    private static final List g;

    static {
        D1.g = Arrays.asList(((D1[])D1.h.clone()));
    }

    private D1(String s1) {
        this.a = s1;
    }

    public String b() {
        return this.a;
    }

    public static boolean c(String s) {
        return Collection.-EL.stream(D1.g).anyMatch((D1 d10) -> // 去混淆评级： 低(20)
        s.contains(d10.a) && !s.equals(d10.a));
    }

    // 去混淆评级： 低(20)
    // 检测为 Lambda 实现
    private static boolean d(String s, D1 d10) [...]

    public static String e(String s) {
        for(Object object0: D1.g) {
            s = s.replaceAll("‍?" + ((D1)object0).b(), "");
        }
        return s;
    }
}

