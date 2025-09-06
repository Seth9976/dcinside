package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public abstract class c extends Enum implements d {
    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class a extends c {
        a(String s, int v) {
            super(s, v, null);
        }

        @Override  // com.google.gson.d
        public String a(Field field0) {
            return field0.getName();
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class b extends c {
        b(String s, int v) {
            super(s, v, null);
        }

        @Override  // com.google.gson.d
        public String a(Field field0) {
            return c.c(field0.getName());
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class com.google.gson.c.c extends c {
        com.google.gson.c.c(String s, int v) {
            super(s, v, null);
        }

        @Override  // com.google.gson.d
        public String a(Field field0) {
            return c.c(c.b(field0.getName(), ' '));
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class com.google.gson.c.d extends c {
        com.google.gson.c.d(String s, int v) {
            super(s, v, null);
        }

        @Override  // com.google.gson.d
        public String a(Field field0) {
            return c.b(field0.getName(), '_').toUpperCase(Locale.ENGLISH);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class e extends c {
        e(String s, int v) {
            super(s, v, null);
        }

        @Override  // com.google.gson.d
        public String a(Field field0) {
            return c.b(field0.getName(), '_').toLowerCase(Locale.ENGLISH);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class f extends c {
        f(String s, int v) {
            super(s, v, null);
        }

        @Override  // com.google.gson.d
        public String a(Field field0) {
            return c.b(field0.getName(), '-').toLowerCase(Locale.ENGLISH);
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    final class g extends c {
        g(String s, int v) {
            super(s, v, null);
        }

        @Override  // com.google.gson.d
        public String a(Field field0) {
            return c.b(field0.getName(), '.').toLowerCase(Locale.ENGLISH);
        }
    }

    public static final enum c a;
    public static final enum c b;
    public static final enum c c;
    public static final enum c d;
    public static final enum c e;
    public static final enum c f;
    public static final enum c g;
    private static final c[] h;

    static {
        a c$a0 = new a("IDENTITY", 0);
        c.a = c$a0;
        b c$b0 = new b("UPPER_CAMEL_CASE", 1);
        c.b = c$b0;
        com.google.gson.c.c c$c0 = new com.google.gson.c.c("UPPER_CAMEL_CASE_WITH_SPACES", 2);
        c.c = c$c0;
        com.google.gson.c.d c$d0 = new com.google.gson.c.d("UPPER_CASE_WITH_UNDERSCORES", 3);
        c.d = c$d0;
        e c$e0 = new e("LOWER_CASE_WITH_UNDERSCORES", 4);
        c.e = c$e0;
        f c$f0 = new f("LOWER_CASE_WITH_DASHES", 5);
        c.f = c$f0;
        g c$g0 = new g("LOWER_CASE_WITH_DOTS", 6);
        c.g = c$g0;
        c.h = new c[]{c$a0, c$b0, c$c0, c$d0, c$e0, c$f0, c$g0};
    }

    private c(String s, int v) {
        super(s, v);
    }

    c(String s, int v, a c$a0) {
        this(s, v);
    }

    static String b(String s, char c) {
        StringBuilder stringBuilder0 = new StringBuilder();
        int v = s.length();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = s.charAt(v1);
            if(Character.isUpperCase(((char)v2)) && stringBuilder0.length() != 0) {
                stringBuilder0.append(c);
            }
            stringBuilder0.append(((char)v2));
        }
        return stringBuilder0.toString();
    }

    static String c(String s) {
        int v = s.length();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = s.charAt(v1);
            if(Character.isLetter(((char)v2))) {
                if(Character.isUpperCase(((char)v2))) {
                    return s;
                }
                int v3 = Character.toUpperCase(((char)v2));
                return v1 == 0 ? ((char)v3) + s.substring(1) : s.substring(0, v1) + ((char)v3) + s.substring(v1 + 1);
            }
        }
        return s;
    }

    public static c valueOf(String s) {
        return (c)Enum.valueOf(c.class, s);
    }

    public static c[] values() {
        return (c[])c.h.clone();
    }
}

