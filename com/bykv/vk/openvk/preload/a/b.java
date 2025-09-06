package com.bykv.vk.openvk.preload.a;

import java.lang.reflect.Field;
import java.util.Locale;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public abstract class b extends Enum implements c {
    public static final enum b a;
    private static enum b b;
    private static enum b c;
    private static enum b d;
    private static enum b e;
    private static enum b f;

    static {
        b.a = new b("IDENTITY") {
            @Override  // com.bykv.vk.openvk.preload.a.c
            public final String a(Field field0) {
                return field0.getName();
            }
        };
        b.b = new b("UPPER_CAMEL_CASE") {
            @Override  // com.bykv.vk.openvk.preload.a.c
            public final String a(Field field0) {
                return b.a(field0.getName());
            }
        };
        b.c = new b("UPPER_CAMEL_CASE_WITH_SPACES") {
            @Override  // com.bykv.vk.openvk.preload.a.c
            public final String a(Field field0) {
                return b.a(b.a(field0.getName(), " "));
            }
        };
        b.d = new b("LOWER_CASE_WITH_UNDERSCORES") {
            @Override  // com.bykv.vk.openvk.preload.a.c
            public final String a(Field field0) {
                return b.a(field0.getName(), "_").toLowerCase(Locale.ENGLISH);
            }
        };
        b.e = new b("LOWER_CASE_WITH_DASHES") {
            @Override  // com.bykv.vk.openvk.preload.a.c
            public final String a(Field field0) {
                return b.a(field0.getName(), "-").toLowerCase(Locale.ENGLISH);
            }
        };
        b.f = new b("LOWER_CASE_WITH_DOTS") {
            @Override  // com.bykv.vk.openvk.preload.a.c
            public final String a(Field field0) {
                return b.a(field0.getName(), ".").toLowerCase(Locale.ENGLISH);
            }
        };
    }

    private b(String s, int v) {
        super(s, v);
    }

    b(String s, int v, byte b) {
        this(s, v);
    }

    static String a(String s) {
        int v = s.length();
        int v1;
        for(v1 = 0; !Character.isLetter(s.charAt(v1)) && v1 < v - 1; ++v1) {
        }
        int v2 = s.charAt(v1);
        if(Character.isUpperCase(((char)v2))) {
            return s;
        }
        int v3 = Character.toUpperCase(((char)v2));
        return v1 == 0 ? ((char)v3) + s.substring(1) : s.substring(0, v1) + ((char)v3) + s.substring(v1 + 1);
    }

    static String a(String s, String s1) {
        StringBuilder stringBuilder0 = new StringBuilder();
        int v = s.length();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = s.charAt(v1);
            if(Character.isUpperCase(((char)v2)) && stringBuilder0.length() != 0) {
                stringBuilder0.append(s1);
            }
            stringBuilder0.append(((char)v2));
        }
        return stringBuilder0.toString();
    }
}

