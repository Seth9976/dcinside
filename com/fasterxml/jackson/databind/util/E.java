package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.annotation.u.a;
import com.fasterxml.jackson.databind.introspect.l;
import com.fasterxml.jackson.databind.m;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class e {
    public static String a(m m0) {
        String s = m0.g().getName();
        if(e.h(s)) {
            return s.indexOf(46, 10) < 0 ? String.format("%s type %s not supported by default: add Module \"%s\" to enable handling", "Java 8 date/time", h.Q(m0), "com.fasterxml.jackson.datatype:jackson-datatype-jsr310") : null;
        }
        if(e.j(s)) {
            return String.format("%s type %s not supported by default: add Module \"%s\" to enable handling", "Joda date/time", h.Q(m0), "com.fasterxml.jackson.datatype:jackson-datatype-joda");
        }
        return e.f(s) ? String.format("%s type %s not supported by default: add Module \"%s\" to enable handling", "Java 8 optional", h.Q(m0), "com.fasterxml.jackson.datatype:jackson-datatype-jdk8") : null;
    }

    public static Object b(m m0) {
        Class class0 = m0.g();
        Class class1 = h.p0(class0);
        if(class1 != null) {
            return h.o(class1);
        }
        if(!m0.o() && !m0.s()) {
            if(class0 == String.class) {
                return "";
            }
            if(m0.a0(Date.class)) {
                return new Date(0L);
            }
            if(m0.a0(Calendar.class)) {
                GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
                gregorianCalendar0.setTimeInMillis(0L);
                return gregorianCalendar0;
            }
            return null;
        }
        return a.d;
    }

    protected static boolean c(l l0) {
        Class class0 = l0.f();
        if(class0.isArray()) {
            String s = class0.getComponentType().getName();
            return s.contains(".cglib") && (s.startsWith("net.sf.cglib") || s.startsWith("org.hibernate.repackage.cglib") || s.startsWith("org.springframework.cglib"));
        }
        return false;
    }

    protected static boolean d(l l0) {
        return l0.f().getName().startsWith("groovy.lang");
    }

    public static boolean e(Class class0) {
        return e.f(class0.getName());
    }

    private static boolean f(String s) {
        return s.startsWith("java.util.Optional");
    }

    public static boolean g(Class class0) {
        return e.h(class0.getName());
    }

    private static boolean h(String s) {
        return s.startsWith("java.time.");
    }

    public static boolean i(Class class0) {
        return e.j(class0.getName());
    }

    private static boolean j(String s) {
        return s.startsWith("org.joda.time.");
    }

    protected static String k(String s, int v) {
        int v1 = s.length();
        if(v1 == v) {
            return null;
        }
        int v2 = s.charAt(v);
        int v3 = Character.toLowerCase(((char)v2));
        if(v2 == v3) {
            return s.substring(v);
        }
        StringBuilder stringBuilder0 = new StringBuilder(v1 - v);
        stringBuilder0.append(((char)v3));
        while(true) {
            ++v;
            if(v >= v1) {
                break;
            }
            int v4 = s.charAt(v);
            int v5 = Character.toLowerCase(((char)v4));
            if(v4 == v5) {
                stringBuilder0.append(s, v, v1);
                return stringBuilder0.toString();
            }
            stringBuilder0.append(((char)v5));
        }
        return stringBuilder0.toString();
    }

    @Deprecated
    public static String l(l l0, boolean z) {
        String s = l0.getName();
        String s1 = e.m(l0, s, z);
        return s1 == null ? e.o(l0, s, z) : s1;
    }

    @Deprecated
    public static String m(l l0, String s, boolean z) {
        if(s.startsWith("is")) {
            Class class0 = l0.f();
            if(class0 == Boolean.class || class0 == Boolean.TYPE) {
                return z ? e.q(s, 2) : e.k(s, 2);
            }
        }
        return null;
    }

    @Deprecated
    public static String n(l l0, String s, boolean z) {
        String s1 = l0.getName();
        if(s1.startsWith(s)) {
            return z ? e.q(s1, s.length()) : e.k(s1, s.length());
        }
        return null;
    }

    @Deprecated
    public static String o(l l0, String s, boolean z) {
        if(s.startsWith("get")) {
            if("getCallbacks".equals(s)) {
                if(e.c(l0)) {
                    return null;
                }
            }
            else if("getMetaClass".equals(s) && e.d(l0)) {
                return null;
            }
            return z ? e.q(s, 3) : e.k(s, 3);
        }
        return null;
    }

    @Deprecated
    public static String p(l l0, boolean z) {
        return e.n(l0, "set", z);
    }

    public static String q(String s, int v) {
        int v1 = s.length();
        if(v1 == v) {
            return null;
        }
        int v2 = s.charAt(v);
        int v3 = Character.toLowerCase(((char)v2));
        if(v2 == v3) {
            return s.substring(v);
        }
        if(v + 1 < v1 && Character.isUpperCase(s.charAt(v + 1))) {
            return s.substring(v);
        }
        StringBuilder stringBuilder0 = new StringBuilder(v1 - v);
        stringBuilder0.append(((char)v3));
        stringBuilder0.append(s, v + 1, v1);
        return stringBuilder0.toString();
    }
}

