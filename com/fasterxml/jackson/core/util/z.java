package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.H;
import com.fasterxml.jackson.core.I;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.regex.Pattern;

public class z {
    private static final Pattern a;

    static {
        z.a = Pattern.compile("[-_./;:]");
    }

    private static final void a(Closeable closeable0) {
        try {
            closeable0.close();
        }
        catch(IOException unused_ex) {
        }
    }

    @Deprecated
    public static H b(ClassLoader classLoader0, String s, String s1) {
        InputStream inputStream0 = classLoader0.getResourceAsStream("META-INF/maven/" + s.replaceAll("\\.", "/") + "/" + s1 + "/pom.properties");
        if(inputStream0 != null) {
            try {
                Properties properties0 = new Properties();
                properties0.load(inputStream0);
                String s2 = properties0.getProperty("version");
                String s3 = properties0.getProperty("artifactId");
                return z.d(s2, properties0.getProperty("groupId"), s3);
            }
            catch(IOException unused_ex) {
                z.a(inputStream0);
                return H.k();
            }
            finally {
                z.a(inputStream0);
            }
        }
        return H.k();
    }

    @Deprecated
    public static H c(Class class0) {
        return z.i(class0);
    }

    public static H d(String s, String s1, String s2) {
        if(s != null) {
            String s3 = s.trim();
            if(s3.length() > 0) {
                String[] arr_s = z.a.split(s3);
                int v = z.e(arr_s[0]);
                int v1 = arr_s.length <= 1 ? 0 : z.e(arr_s[1]);
                int v2 = arr_s.length <= 2 ? 0 : z.e(arr_s[2]);
                return arr_s.length <= 3 ? new H(v, v1, v2, null, s1, s2) : new H(v, v1, v2, arr_s[3], s1, s2);
            }
        }
        return H.k();
    }

    protected static int e(String s) {
        int v = s.length();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            int v3 = s.charAt(v1);
            if(v3 > 57 || v3 < 0x30) {
                break;
            }
            v2 = v2 * 10 + (v3 - 0x30);
        }
        return v2;
    }

    public static final void f() {
        throw new RuntimeException("Internal error: this code path should never get executed");
    }

    public static final Object g() {
        throw new RuntimeException("Internal error: this code path should never get executed");
    }

    @Deprecated
    public H h() {
        return H.k();
    }

    public static H i(Class class0) {
        H h0 = null;
        try {
            h0 = ((I)Class.forName((class0.getPackage().getName() + ".PackageVersion"), true, class0.getClassLoader()).getDeclaredConstructor(null).newInstance(null)).version();
        }
        catch(Exception unused_ex) {
        }
        return h0 == null ? H.k() : h0;
    }
}

