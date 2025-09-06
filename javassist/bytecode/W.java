package javassist.bytecode;

import java.util.Map;
import javassist.E;
import javassist.g;
import javassist.l;

public class w {
    public static class a {
        private String a;
        private int b;
        private int c;
        private boolean d;

        public a(String s) {
            this.a = s;
            this.c = 0;
            this.b = 0;
            this.d = false;
        }

        public char a() {
            return this.a.charAt(this.c);
        }

        public boolean b() {
            return this.b < this.a.length();
        }

        public boolean c() {
            switch(this.a()) {
                case 68: 
                case 74: {
                    return true;
                }
                default: {
                    return false;
                }
            }
        }

        public boolean d() {
            return this.d;
        }

        public int e() {
            int v2;
            int v = this.b;
            int v1 = this.a.charAt(v);
            if(v1 == 40) {
                ++this.b;
                ++v;
                v1 = this.a.charAt(v);
                this.d = true;
            }
            if(v1 == 41) {
                ++this.b;
                ++v;
                v1 = this.a.charAt(v);
                this.d = false;
            }
            while(true) {
                switch(v1) {
                    case 76: {
                        v2 = this.a.indexOf(59, v) + 1;
                        if(v2 <= 0) {
                            throw new IndexOutOfBoundsException("bad descriptor");
                        }
                    label_18:
                        int v3 = this.b;
                        this.c = v3;
                        this.b = v2;
                        return v3;
                    }
                    case 91: {
                        break;
                    }
                    default: {
                        v2 = v + 1;
                        goto label_18;
                    }
                }
                ++v;
                v1 = this.a.charAt(v);
            }
        }
    }

    static class b {
        static int a(StringBuffer stringBuffer0, int v, String s) {
            int v1 = s.charAt(v);
            int v2 = 0;
            while(true) {
                switch(v1) {
                    case 76: {
                    alab1:
                        while(true) {
                            ++v;
                            int v3 = s.charAt(v);
                            switch(v3) {
                                case 0x2F: {
                                    v3 = 46;
                                    stringBuffer0.append(((char)v3));
                                    break;
                                }
                                case 59: {
                                    break alab1;
                                }
                                default: {
                                    stringBuffer0.append(((char)v3));
                                    break;
                                }
                            }
                        }
                    label_12:
                        while(v2 > 0) {
                            stringBuffer0.append("[]");
                            --v2;
                        }
                        return v + 1;
                    }
                    case 91: {
                        break;
                    }
                    default: {
                        stringBuffer0.append(w.D(((char)v1)).X());
                        goto label_12;
                    }
                }
                ++v2;
                ++v;
                v1 = s.charAt(v);
            }
        }

        static String b(String s) {
            StringBuffer stringBuffer0 = new StringBuffer();
            if(s.charAt(0) == 40) {
                stringBuffer0.append('(');
                for(int v = 1; s.charAt(v) != 41; v = b.a(stringBuffer0, v, s)) {
                    if(v > 1) {
                        stringBuffer0.append(',');
                    }
                }
                stringBuffer0.append(')');
                return stringBuffer0.toString();
            }
            b.a(stringBuffer0, 0, s);
            return stringBuffer0.toString();
        }
    }

    public static String A(String s) {
        return s.replace('/', '.');
    }

    public static String B(String s) {
        return s.replace('.', '/');
    }

    // 去混淆评级： 低(20)
    public static String C(l l0) {
        return l0.k0() ? w.o(l0) : w.B(l0.X());
    }

    static l D(char c) {
        switch(c) {
            case 66: {
                return l.g;
            }
            case 67: {
                return l.f;
            }
            case 68: {
                return l.l;
            }
            case 70: {
                return l.k;
            }
            case 73: {
                return l.i;
            }
            case 74: {
                return l.j;
            }
            case 83: {
                return l.h;
            }
            case 86: {
                return l.m;
            }
            case 90: {
                return l.e;
            }
            default: {
                return null;
            }
        }
    }

    public static String E(String s) {
        return b.b(s);
    }

    public static String a(String s, String s1) {
        int v = s1.indexOf(41);
        return v >= 0 ? s1.substring(0, v) + 'L' + s.replace('.', '/') + ';' + s1.substring(v) : s1;
    }

    public static String b(l l0, String s) {
        int v = s.indexOf(41);
        if(v < 0) {
            return s;
        }
        StringBuffer stringBuffer0 = new StringBuffer();
        stringBuffer0.append(s.substring(0, v));
        w.z(stringBuffer0, l0);
        stringBuffer0.append(s.substring(v));
        return stringBuffer0.toString();
    }

    public static int c(String s) {
        int v;
        for(v = 0; s.charAt(v) == 91; ++v) {
        }
        return v;
    }

    public static String d(String s, String s1) {
        int v = s1.indexOf(41);
        return v >= 0 ? s1.substring(0, v + 1) + 'L' + s.replace('.', '/') + ';' : s1;
    }

    public static int e(String s) {
        return w.f(s, true);
    }

    private static int f(String s, boolean z) {
        int v = 0;
        int v1 = s.charAt(0);
        if(v1 == 40) {
            int v2 = 1;
            int v3 = 0;
            while(true) {
                int v4 = s.charAt(v2);
                if(v4 == 41) {
                    v1 = s.charAt(v2 + 1);
                    v = v3;
                    break;
                }
                boolean z1 = false;
            label_11:
                switch(v4) {
                    case 76: {
                        v2 = s.indexOf(59, v2) + 1;
                        if(v2 <= 0) {
                            throw new IndexOutOfBoundsException("bad descriptor");
                        }
                    label_17:
                        if(!z1 && (v4 == 68 || v4 == 74)) {
                            v3 -= 2;
                            continue;
                        }
                        --v3;
                        continue;
                    }
                    case 91: {
                        break;
                    }
                    default: {
                        ++v2;
                        goto label_17;
                    }
                }
                ++v2;
                v4 = s.charAt(v2);
                z1 = true;
                goto label_11;
            }
        }
        if(z) {
            if(v1 != 68 && v1 != 74) {
                return v1 == 86 ? v : v + 1;
            }
            return v + 2;
        }
        return v;
    }

    public static boolean g(String s, String s1) {
        if(s.charAt(0) != 40) {
            return false;
        }
        for(int v = 0; true; ++v) {
            int v1 = s.charAt(v);
            if(v1 != s1.charAt(v)) {
                return false;
            }
            if(v1 == 41) {
                return true;
            }
        }
    }

    public static String h(String s) {
        return s.substring(0, s.indexOf(41) + 1);
    }

    public static l[] i(String s, g g0) throws E {
        if(s.charAt(0) != 40) {
            return null;
        }
        l[] arr_l = new l[w.m(s)];
        int v1 = 1;
        for(int v = 0; true; ++v) {
            v1 = w.x(g0, s, v1, arr_l, v);
            if(v1 <= 0) {
                break;
            }
        }
        return arr_l;
    }

    public static l j(String s, g g0) throws E {
        int v = s.indexOf(41);
        if(v < 0) {
            return null;
        }
        l[] arr_l = new l[1];
        w.x(g0, s, v + 1, arr_l, 0);
        return arr_l[0];
    }

    public static String k(String s, String s1) {
        return s1.charAt(0) == 40 ? "(L" + s.replace('.', '/') + ';' + s1.substring(1) : s1;
    }

    public static String l(l l0, String s) {
        return s.charAt(0) == 40 ? "(" + w.o(l0) + s.substring(1) : s;
    }

    public static int m(String s) {
        int v2;
        int v = 0;
        int v1 = 1;
    alab1:
        while(true) {
            v2 = s.charAt(v1);
            if(v2 == 41) {
                return v;
            }
        label_5:
            switch(v2) {
                case 76: {
                    v1 = s.indexOf(59, v1) + 1;
                    if(v1 <= 0) {
                        throw new IndexOutOfBoundsException("bad descriptor");
                    }
                    ++v;
                    break;
                }
                case 91: {
                    break alab1;
                }
                default: {
                    ++v1;
                    ++v;
                    break;
                }
            }
        }
        ++v1;
        v2 = s.charAt(v1);
        goto label_5;
    }

    public static String n(String s) {
        if(s.equals("void")) {
            return "V";
        }
        if(s.equals("int")) {
            return "I";
        }
        if(s.equals("byte")) {
            return "B";
        }
        if(s.equals("long")) {
            return "J";
        }
        if(s.equals("double")) {
            return "D";
        }
        if(s.equals("float")) {
            return "F";
        }
        if(s.equals("char")) {
            return "C";
        }
        if(s.equals("short")) {
            return "S";
        }
        return s.equals("boolean") ? "Z" : "L" + w.B(s) + ";";
    }

    public static String o(l l0) {
        StringBuffer stringBuffer0 = new StringBuffer();
        w.z(stringBuffer0, l0);
        return stringBuffer0.toString();
    }

    public static String p(l[] arr_l) {
        return w.q(l.m, arr_l);
    }

    public static String q(l l0, l[] arr_l) {
        StringBuffer stringBuffer0 = new StringBuffer();
        stringBuffer0.append('(');
        if(arr_l != null) {
            for(int v = 0; v < arr_l.length; ++v) {
                w.z(stringBuffer0, arr_l[v]);
            }
        }
        stringBuffer0.append(')');
        if(l0 != null) {
            w.z(stringBuffer0, l0);
        }
        return stringBuffer0.toString();
    }

    public static String r(l[] arr_l) {
        return w.q(null, arr_l);
    }

    public static int s(String s) {
        return -w.f(s, false);
    }

    public static String t(String s, String s1, String s2) {
        if(s.indexOf(s1) < 0) {
            return s;
        }
        StringBuffer stringBuffer0 = new StringBuffer();
        int v = 0;
        int v1 = 0;
        int v2;
        while((v2 = s.indexOf(76, v)) >= 0) {
            if(s.startsWith(s1, v2 + 1) && s.charAt(s1.length() + v2 + 1) == 59) {
                stringBuffer0.append(s.substring(v1, v2));
                stringBuffer0.append('L');
                stringBuffer0.append(s2);
                stringBuffer0.append(';');
                v = v2 + s1.length() + 2;
                v1 = v;
            }
            else {
                v = s.indexOf(59, v2) + 1;
                if(v < 1) {
                    break;
                }
            }
        }
        if(v1 == 0) {
            return s;
        }
        int v3 = s.length();
        if(v1 < v3) {
            stringBuffer0.append(s.substring(v1, v3));
        }
        return stringBuffer0.toString();
    }

    public static String u(String s, Map map0) {
        if(map0 == null) {
            return s;
        }
        StringBuffer stringBuffer0 = new StringBuffer();
        int v1 = 0;
        int v2;
        for(int v = 0; (v2 = s.indexOf(76, v)) >= 0; v = v3 + 1) {
            int v3 = s.indexOf(59, v2);
            if(v3 < 0) {
                break;
            }
            String s1 = (String)map0.get(s.substring(v2 + 1, v3));
            if(s1 != null) {
                stringBuffer0.append(s.substring(v1, v2));
                stringBuffer0.append('L');
                stringBuffer0.append(s1);
                stringBuffer0.append(';');
                v1 = v3 + 1;
            }
        }
        if(v1 == 0) {
            return s;
        }
        int v4 = s.length();
        if(v1 < v4) {
            stringBuffer0.append(s.substring(v1, v4));
        }
        return stringBuffer0.toString();
    }

    public static String v(String s, int v) {
        return s.substring(v);
    }

    public static String w(String s) {
        String s1;
        int v = 0;
        int v1 = s.charAt(0);
        int v2 = 0;
    alab1:
        while(true) {
            switch(v1) {
                case 66: {
                    s1 = "byte";
                    goto label_30;
                }
                case 67: {
                    s1 = "char";
                    goto label_30;
                }
                case 68: {
                    s1 = "double";
                    goto label_30;
                }
                case 70: {
                    s1 = "float";
                    goto label_30;
                }
                case 73: {
                    s1 = "int";
                    goto label_30;
                }
                case 74: {
                    s1 = "long";
                    goto label_30;
                }
                case 76: {
                    break alab1;
                }
                case 83: {
                    s1 = "short";
                    goto label_30;
                }
                case 86: {
                    s1 = "void";
                    goto label_30;
                }
                case 90: {
                    goto label_29;
                }
                case 91: {
                    ++v;
                    ++v2;
                    v1 = s.charAt(v2);
                    break;
                }
                default: {
                    throw new RuntimeException("bad descriptor: " + s);
                }
            }
        }
        int v3 = v2 + 1;
        v2 = s.indexOf(59, v2);
        s1 = s.substring(v3, v2).replace('/', '.');
        goto label_30;
    label_29:
        s1 = "boolean";
    label_30:
        if(v2 + 1 != s.length()) {
            throw new RuntimeException("multiple descriptors?: " + s);
        }
        if(v == 0) {
            return s1;
        }
        StringBuffer stringBuffer0 = new StringBuffer(s1);
        do {
            stringBuffer0.append("[]");
            --v;
        }
        while(v > 0);
        return stringBuffer0.toString();
    }

    private static int x(g g0, String s, int v, l[] arr_l, int v1) throws E {
        String s1;
        int v4;
        int v2 = s.charAt(v);
        int v3 = 0;
        while(true) {
            switch(v2) {
                case 76: {
                    int v5 = s.indexOf(59, v + 1);
                    v4 = v5 + 1;
                    s1 = s.substring(v + 1, v5).replace('/', '.');
                label_15:
                    if(v3 > 0) {
                        StringBuffer stringBuffer0 = new StringBuffer(s1);
                        while(v3 > 0) {
                            stringBuffer0.append("[]");
                            --v3;
                        }
                        s1 = stringBuffer0.toString();
                    }
                    arr_l[v1] = g0.s(s1);
                    return v4;
                }
                case 91: {
                    break;
                }
                default: {
                    l l0 = w.D(((char)v2));
                    if(l0 == null) {
                        return -1;
                    }
                    v4 = v + 1;
                    if(v3 == 0) {
                        arr_l[v1] = l0;
                        return v4;
                    }
                    s1 = l0.X();
                    goto label_15;
                }
            }
            ++v3;
            ++v;
            v2 = s.charAt(v);
        }
    }

    public static l y(String s, g g0) throws E {
        l[] arr_l = new l[1];
        return w.x(g0, s, 0, arr_l, 0) < 0 ? g0.s(s.replace('/', '.')) : arr_l[0];
    }

    private static void z(StringBuffer stringBuffer0, l l0) {
        if(l0.k0()) {
            stringBuffer0.append('[');
            try {
                w.z(stringBuffer0, l0.x());
            }
            catch(E unused_ex) {
                stringBuffer0.append('L');
                String s = l0.X();
                stringBuffer0.append(w.B(s.substring(0, s.length() - 2)));
                stringBuffer0.append(';');
            }
            return;
        }
        if(l0.p0()) {
            stringBuffer0.append(((javassist.w)l0).W0());
            return;
        }
        stringBuffer0.append('L');
        stringBuffer0.append(l0.X().replace('.', '/'));
        stringBuffer0.append(';');
    }
}

