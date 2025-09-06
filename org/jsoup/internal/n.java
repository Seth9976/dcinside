package org.jsoup.internal;

import androidx.emoji2.text.flatbuffer.b;
import j..util.stream.Collector.-CC;
import j..util.stream.Collector.Characteristics;
import j..util.stream.Collector;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;
import java.util.regex.Pattern;
import org.jsoup.helper.i;

public final class n {
    public static class a {
        StringBuilder a;
        final String b;
        boolean c;

        public a(String s) {
            this.a = n.d();
            this.c = true;
            this.b = s;
        }

        public a a(Object object0) {
            i.o(this.a);
            if(!this.c) {
                this.a.append(this.b);
            }
            this.a.append(object0);
            this.c = false;
            return this;
        }

        public a b(Object object0) {
            i.o(this.a);
            this.a.append(object0);
            return this;
        }

        public String c() {
            String s = n.v(this.a);
            this.a = null;
            return s;
        }
    }

    static final String[] a = null;
    private static final Pattern b = null;
    private static final Pattern c = null;
    private static final Pattern d = null;
    private static final ThreadLocal e = null;
    private static final int f = 0x2000;
    private static final int g = 8;

    static {
        n.a = new String[]{"", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    "};
        n.b = Pattern.compile("^/(?>(?>\\.\\.?/)+)");
        n.c = Pattern.compile("^[a-zA-Z][a-zA-Z0-9+-.]*:");
        n.d = Pattern.compile("[\\x00-\\x1f]*");
        n.e = new b(new m());
    }

    public static void c(StringBuilder stringBuilder0, String s, boolean z) {
        int v = s.length();
        boolean z1 = false;
        boolean z2 = false;
        for(int v1 = 0; v1 < v; v1 += Character.charCount(v2)) {
            int v2 = s.codePointAt(v1);
            if(!n.g(v2)) {
                if(!n.j(v2)) {
                    stringBuilder0.appendCodePoint(v2);
                    z1 = true;
                    z2 = false;
                }
            }
            else if((!z || z1) && !z2) {
                stringBuilder0.append(' ');
                z2 = true;
            }
        }
    }

    public static StringBuilder d() {
        Stack stack0 = (Stack)n.e.get();
        return stack0.empty() ? new StringBuilder(0x2000) : ((StringBuilder)stack0.pop());
    }

    public static boolean e(String s, String[] arr_s) {
        for(int v = 0; v < arr_s.length; ++v) {
            if(arr_s[v].equals(s)) {
                return true;
            }
        }
        return false;
    }

    public static boolean f(String s, String[] arr_s) {
        return Arrays.binarySearch(arr_s, s) >= 0;
    }

    public static boolean g(int v) {
        switch(v) {
            case 9: 
            case 10: 
            case 12: 
            case 13: 
            case 0x20: 
            case 0xA0: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static boolean h(String s) {
        i.o(s);
        for(int v = 0; v < s.length(); ++v) {
            if(s.charAt(v) > 0x7F) {
                return false;
            }
        }
        return true;
    }

    public static boolean i(String s) {
        if(s != null && s.length() != 0) {
            int v = s.length();
            for(int v1 = 0; v1 < v; ++v1) {
                if(!n.l(s.codePointAt(v1))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean j(int v) {
        return v == 0xAD || v == 0x200B;
    }

    public static boolean k(String s) {
        if(s != null && s.length() != 0) {
            int v = s.length();
            for(int v1 = 0; v1 < v; ++v1) {
                if(!Character.isDigit(s.codePointAt(v1))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean l(int v) {
        return v == 9 || v == 10 || v == 12 || v == 13 || v == 0x20;
    }

    public static String m(Collection collection0, String s) {
        return n.n(collection0.iterator(), s);
    }

    public static String n(Iterator iterator0, String s) {
        if(!iterator0.hasNext()) {
            return "";
        }
        Object object0 = iterator0.next();
        String s1 = object0.toString();
        if(!iterator0.hasNext()) {
            return s1;
        }
        a n$a0 = new a(s);
        n$a0.a(s1);
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            n$a0.a(object1);
        }
        return n$a0.c();
    }

    public static String o(String[] arr_s, String s) {
        return n.m(Arrays.asList(arr_s), s);
    }

    public static Collector p(String s) {
        return Collector.-CC.of(() -> new a(s), new j(), (a n$a0, a n$a1) -> {
            n$a0.b(n$a1.c());
            return n$a0;
        }, new l(), new Characteristics[0]);
    }

    // 检测为 Lambda 实现
    private static a q(String s) [...]

    // 检测为 Lambda 实现
    private static a r(a n$a0, a n$a1) [...]

    public static String s(String s) {
        StringBuilder stringBuilder0 = n.d();
        n.c(stringBuilder0, s, false);
        return n.v(stringBuilder0);
    }

    public static String t(int v) {
        return n.u(v, 30);
    }

    public static String u(int v, int v1) {
        boolean z = true;
        i.i(v >= 0, "width must be >= 0");
        if(v1 < -1) {
            z = false;
        }
        i.h(z);
        if(v1 != -1) {
            v = Math.min(v, v1);
        }
        String[] arr_s = n.a;
        if(v < arr_s.length) {
            return arr_s[v];
        }
        char[] arr_c = new char[v];
        for(int v2 = 0; v2 < v; ++v2) {
            arr_c[v2] = ' ';
        }
        return String.valueOf(arr_c);
    }

    public static String v(StringBuilder stringBuilder0) {
        i.o(stringBuilder0);
        String s = stringBuilder0.toString();
        if(stringBuilder0.length() > 0x2000) {
            stringBuilder0 = new StringBuilder(0x2000);
        }
        else {
            stringBuilder0.delete(0, stringBuilder0.length());
        }
        Stack stack0 = (Stack)n.e.get();
        stack0.push(stringBuilder0);
        while(stack0.size() > 8) {
            stack0.pop();
        }
        return s;
    }

    public static String w(String s, String s1) {
        URL uRL0;
        String s2 = n.z(s);
        String s3 = n.z(s1);
        try {
            uRL0 = new URL(s2);
            return n.x(uRL0, s3).toExternalForm();
        }
        catch(MalformedURLException unused_ex) {
            try {
                return new URL(s3).toExternalForm();
            }
            catch(MalformedURLException unused_ex) {
                return n.c.matcher(s3).find() ? s3 : "";
            }
        }
    }

    public static URL x(URL uRL0, String s) throws MalformedURLException {
        String s1 = n.z(s);
        if(s1.startsWith("?")) {
            s1 = uRL0.getPath() + s1;
        }
        URL uRL1 = new URL(uRL0, s1);
        String s2 = uRL1.getFile();
        String s3 = n.b.matcher(s2).replaceFirst("/");
        if(uRL1.getRef() != null) {
            s3 = s3 + "#" + uRL1.getRef();
        }
        return new URL(uRL1.getProtocol(), uRL1.getHost(), uRL1.getPort(), s3);
    }

    public static boolean y(String s) {
        return s != null && s.length() != 0 && s.charAt(0) == 10;
    }

    private static String z(String s) {
        return n.d.matcher(s).replaceAll("");
    }
}

