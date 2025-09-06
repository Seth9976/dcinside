package org.slf4j.helpers;

import java.io.PrintStream;

public final class m {
    static class a {
    }

    static final class b extends SecurityManager {
        private b() {
        }

        b(a m$a0) {
        }

        @Override
        protected Class[] getClassContext() {
            return super.getClassContext();
        }
    }

    private static b a = null;
    private static boolean b = false;

    static {
    }

    public static Class a() {
        b m$b0 = m.b();
        if(m$b0 == null) {
            return null;
        }
        Class[] arr_class = m$b0.getClassContext();
        int v;
        for(v = 0; v < arr_class.length && !"org.slf4j.helpers.m".equals(arr_class[v].getName()); ++v) {
        }
        if(v >= arr_class.length || v + 2 >= arr_class.length) {
            throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
        }
        return arr_class[v + 2];
    }

    private static b b() {
        b m$b0 = m.a;
        if(m$b0 != null) {
            return m$b0;
        }
        if(m.b) {
            return null;
        }
        b m$b1 = m.e();
        m.a = m$b1;
        m.b = true;
        return m$b1;
    }

    public static final void c(String s) {
        System.err.println("SLF4J: " + s);
    }

    public static final void d(String s, Throwable throwable0) {
        PrintStream printStream0 = System.err;
        printStream0.println(s);
        printStream0.println("Reported exception:");
        throwable0.printStackTrace();
    }

    private static b e() {
        try {
            return new b(null);
        }
        catch(SecurityException unused_ex) {
            return null;
        }
    }

    public static boolean f(String s) {
        String s1 = m.g(s);
        return s1 == null ? false : s1.equalsIgnoreCase("true");
    }

    public static String g(String s) [...] // 潜在的解密器
}

