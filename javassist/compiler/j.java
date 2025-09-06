package javassist.compiler;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import javassist.D;
import javassist.E;
import javassist.bytecode.T;
import javassist.bytecode.w;
import javassist.compiler.ast.b;
import javassist.compiler.ast.i;
import javassist.compiler.ast.o;
import javassist.compiler.ast.v;
import javassist.g;
import javassist.l;

public class j implements q {
    public static class a {
        public l a;
        public T b;
        public int c;

        public a(l l0, T t0, int v) {
            this.a = l0;
            this.b = t0;
            this.c = v;
        }

        public boolean a() {
            return (this.b.c() & 8) != 0;
        }
    }

    private g a;
    private Map b;
    private static final int c = 0;
    private static final int d = -1;
    private static final String e = "<invalid>";
    private static Map f;

    static {
        j.f = new WeakHashMap();
    }

    public j(g g0) {
        this.b = null;
        this.a = g0;
    }

    private int a(String s, int[] arr_v, int[] arr_v1, String[] arr_s) throws c {
        int v = w.m(s);
        if(arr_v.length != v) {
            return -1;
        }
        int v1 = s.length();
        int v2 = 1;
        int v3 = 0;
        int v4 = 0;
        while(v2 < v1) {
            int v5 = v2 + 1;
            int v6 = s.charAt(v2);
            if(v6 == 41) {
                return v3 == arr_v.length ? v4 : -1;
            }
            if(v3 >= arr_v.length) {
                return -1;
            }
            int v7 = 0;
            while(v6 == 91) {
                ++v7;
                int v8 = s.charAt(v5);
                ++v5;
                v6 = v8;
            }
            if(arr_v[v3] == 412) {
                if(v7 == 0 && v6 != 76) {
                    return -1;
                }
                if(v6 == 76) {
                    v2 = s.indexOf(59, v5) + 1;
                    goto label_55;
                }
            }
            else if(arr_v1[v3] != v7) {
                if(v7 == 0 && v6 == 76 && s.startsWith("java/lang/Object;", v5)) {
                    int v9 = s.indexOf(59, v5) + 1;
                    ++v4;
                    if(v9 > 0) {
                        v2 = v9;
                        goto label_55;
                    }
                }
                return -1;
            }
            else if(v6 == 76) {
                int v10 = s.indexOf(59, v5);
                if(v10 >= 0 && arr_v[v3] == 307) {
                    String s1 = s.substring(v5, v10);
                    if(!s1.equals(arr_s[v3])) {
                        l l0 = this.q(arr_s[v3]);
                        try {
                            if(!l0.K0(this.q(s1))) {
                                return -1;
                            }
                        }
                        catch(E unused_ex) {
                        }
                        ++v4;
                    }
                    v2 = v10 + 1;
                    goto label_55;
                }
                return -1;
            }
            else {
                int v11 = j.b(((char)v6));
                int v12 = arr_v[v3];
                if(v11 != v12) {
                    if(v11 == 324 && (v12 == 303 || v12 == 306 || v12 == 334)) {
                        ++v4;
                        goto label_54;
                    }
                    return -1;
                }
            }
        label_54:
            v2 = v5;
        label_55:
            ++v3;
        }
        return -1;
    }

    public static int b(char c) throws c {
        switch(c) {
            case 66: {
                return 303;
            }
            case 67: {
                return 306;
            }
            case 68: {
                return 312;
            }
            case 70: {
                return 317;
            }
            case 73: {
                return 324;
            }
            case 74: {
                return 326;
            }
            case 83: {
                return 334;
            }
            case 86: {
                return 344;
            }
            case 90: {
                return 301;
            }
            case 76: 
            case 91: {
                return 307;
            }
            default: {
                j.c();
                return 344;
            }
        }
    }

    private static void c() throws c {
        throw new c("fatal");
    }

    public g d() {
        return this.a;
    }

    public static int e() {
        return j.f.size();
    }

    private Map f() {
        Map map0 = this.b;
        if(map0 == null) {
            synchronized(j.class) {
                Reference reference0 = (Reference)j.f.get(this.a);
                if(reference0 != null) {
                    map0 = (Map)reference0.get();
                }
                if(map0 == null) {
                    map0 = new Hashtable();
                    j.f.put(this.a, new WeakReference(map0));
                }
            }
            this.b = map0;
        }
        return map0;
    }

    public static int g(javassist.compiler.ast.a a0) {
        int v = 0;
        while(a0 != null) {
            o o0 = (o)a0.i();
            a0 = a0.q();
            switch(o0.g()) {
                case 300: {
                    v |= 0x400;
                    break;
                }
                case 315: {
                    v |= 16;
                    break;
                }
                case 330: {
                    v |= 2;
                    break;
                }
                case 331: {
                    v |= 4;
                    break;
                }
                case 332: {
                    v |= 1;
                    break;
                }
                case 0x14F: {
                    v |= 8;
                    break;
                }
                case 338: {
                    v |= 0x20;
                    break;
                }
                case 342: {
                    v |= 0x80;
                    break;
                }
                case 345: {
                    v |= 0x40;
                    break;
                }
                case 347: {
                    v |= 0x800;
                }
            }
        }
        return v;
    }

    public static l h(l l0, String s) throws c {
        try {
            l[] arr_l = l0.T();
            for(int v = 0; v < arr_l.length; ++v) {
                if(arr_l[v].X().equals(s)) {
                    return arr_l[v];
                }
            }
        }
        catch(E unused_ex) {
        }
        throw new c("cannot find the super inetrface " + s + " of " + l0.X());
    }

    public static l i(l l0) throws c {
        try {
            l l1 = l0.c0();
            if(l1 != null) {
                return l1;
            }
        }
        catch(E unused_ex) {
        }
        throw new c("cannot find the super class of " + l0.X());
    }

    static String j(int v) throws c {
        switch(v) {
            case 301: {
                return "boolean";
            }
            case 303: {
                return "byte";
            }
            case 306: {
                return "char";
            }
            case 312: {
                return "double";
            }
            case 317: {
                return "float";
            }
            case 324: {
                return "int";
            }
            case 326: {
                return "long";
            }
            case 334: {
                return "short";
            }
            case 344: {
                return "void";
            }
            default: {
                j.c();
                return "";
            }
        }
    }

    public static String k(String s) {
        return s.replace('.', '/');
    }

    public static String l(String s) {
        return s.replace('/', '.');
    }

    public l m(int v, int v1, String s) throws c {
        String s1;
        if(v == 307) {
            l l0 = this.q(s);
            if(v1 > 0) {
                s1 = l0.X();
                goto label_7;
            }
            return l0;
        }
        else {
            s1 = j.j(v);
        }
    label_7:
        while(v1 > 0) {
            s1 = s1 + "[]";
            --v1;
        }
        return this.n(s1, false);
    }

    public l n(String s, boolean z) throws c {
        l l0;
        Map map0 = this.f();
        String s1 = (String)map0.get(s);
        switch(s1) {
            case 0: {
                try {
                label_4:
                    l0 = this.p(s, z);
                }
                catch(E unused_ex) {
                    l0 = this.z(s);
                }
                map0.put(s, l0.X());
                return l0;
            }
            case 0x2ECFB: {
                throw new c("no such class: " + s);
            }
            default: {
                try {
                    return this.a.s(s1);
                }
                catch(E unused_ex) {
                    goto label_4;
                }
            }
        }
    }

    public l o(i i0) throws c {
        return this.m(i0.A(), i0.w(), i0.x());
    }

    private l p(String s, boolean z) throws E {
        try {
            l l0 = null;
            do {
                l0 = this.a.s(s);
            label_2:
            }
            while(l0 == null);
            return l0;
        }
        catch(E e0) {
            int v = s.lastIndexOf(46);
            if(z || v < 0) {
                throw e0;
            }
            StringBuffer stringBuffer0 = new StringBuffer(s);
            stringBuffer0.setCharAt(v, '$');
            s = stringBuffer0.toString();
            goto label_2;
        }
    }

    public l q(String s) throws c {
        return this.n(j.l(s), false);
    }

    public l r(javassist.compiler.ast.a a0) throws c {
        return this.n(i.s(a0, '.'), false);
    }

    public javassist.o s(String s, v v0) throws c {
        l l0 = this.n(s, false);
        try {
            return l0.O(v0.g());
        }
        catch(E unused_ex) {
            throw new c("no such field: " + v0.g());
        }
    }

    public javassist.o t(String s, v v0) throws c {
        return this.s(j.l(s), v0);
    }

    public javassist.o u(String s, v v0, b b0) throws k {
        l l0;
        String s1 = v0.g();
        try {
            l0 = this.n(j.l(s), true);
        }
        catch(c unused_ex) {
            throw new k(s + "/" + s1, b0);
        }
        try {
            return l0.O(s1);
        }
        catch(E unused_ex) {
            throw new k(j.k(l0.X()) + "$" + s1, b0);
        }
    }

    private a v(l l0, String s, int[] arr_v, int[] arr_v1, String[] arr_s, boolean z) throws c {
        a j$a0;
        javassist.bytecode.k k0 = l0.u();
        if(k0 == null) {
            j$a0 = null;
        }
        else {
            j$a0 = null;
            for(Object object0: k0.r()) {
                T t0 = (T)object0;
                if(t0.k().equals(s) && (t0.c() & 0x40) == 0) {
                    int v = this.a(t0.h(), arr_v, arr_v1, arr_s);
                    if(v != -1) {
                        a j$a1 = new a(l0, t0, v);
                        if(v == 0) {
                            return j$a1;
                        }
                        if(j$a0 == null || j$a0.c > v) {
                            j$a0 = j$a1;
                        }
                    }
                }
            }
        }
        if(!z && j$a0 != null) {
            return j$a0;
        }
        boolean z1 = D.f(l0.W());
        if(!z1) {
            try {
                l l1 = l0.c0();
                if(l1 != null) {
                    a j$a2 = this.v(l1, s, arr_v, arr_v1, arr_s, z);
                    if(j$a2 != null) {
                        return j$a2;
                    }
                }
            }
            catch(E unused_ex) {
            }
        }
        try {
            l[] arr_l = l0.T();
            for(int v1 = 0; v1 < arr_l.length; ++v1) {
                a j$a3 = this.v(arr_l[v1], s, arr_v, arr_v1, arr_s, z);
                if(j$a3 != null) {
                    return j$a3;
                }
            }
            if(z1) {
                l l2 = l0.c0();
                if(l2 != null) {
                    a j$a4 = this.v(l2, s, arr_v, arr_v1, arr_s, z);
                    return j$a4 == null ? null : j$a4;
                }
            }
        }
        catch(E unused_ex) {
        }
        return null;
    }

    public a w(l l0, l l1, T t0, String s, int[] arr_v, int[] arr_v1, String[] arr_s) throws c {
        a j$a0;
        if(t0 == null || l0 != l1 || !t0.k().equals(s)) {
            j$a0 = null;
        }
        else {
            int v = this.a(t0.h(), arr_v, arr_v1, arr_s);
            if(v == -1) {
                j$a0 = null;
            }
            else {
                j$a0 = new a(l0, t0, v);
                if(v == 0) {
                    return j$a0;
                }
            }
        }
        a j$a1 = this.v(l0, s, arr_v, arr_v1, arr_s, j$a0 != null);
        return j$a1 == null ? j$a0 : j$a1;
    }

    public String x(javassist.compiler.ast.a a0) throws c {
        return a0 == null ? null : j.k(this.r(a0).X());
    }

    public String y(String s) throws c {
        return s == null ? null : j.k(this.q(s).X());
    }

    private l z(String s) throws c {
        if(s.indexOf(46) < 0) {
            Iterator iterator0 = this.a.Y();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                String s1 = (String)object0;
                String s2 = s1.replaceAll("\\.$", "") + "." + s;
                try {
                    return this.a.s(s2);
                }
                catch(E unused_ex) {
                    try {
                        if(!s1.endsWith("." + s)) {
                            continue;
                        }
                        return this.a.s(s1);
                    }
                    catch(E unused_ex) {
                    }
                }
            }
        }
        this.f().put(s, "<invalid>");
        throw new c("no such class: " + s);
    }
}

