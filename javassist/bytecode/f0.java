package javassist.bytecode;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javassist.l;

public class f0 extends d {
    static class a {
    }

    public static class b extends i {
        int a;
        j b;

        public b(int v, j f0$j0) {
            this.a = v;
            this.b = f0$j0;
        }

        @Override  // javassist.bytecode.f0$j
        void a(StringBuffer stringBuffer0) {
            for(int v = 0; v < this.a; ++v) {
                stringBuffer0.append('[');
            }
            this.b.a(stringBuffer0);
        }

        public j e() {
            return this.b;
        }

        public int f() {
            return this.a;
        }

        @Override
        public String toString() {
            StringBuffer stringBuffer0 = new StringBuffer(this.b.toString());
            for(int v = 0; v < this.a; ++v) {
                stringBuffer0.append("[]");
            }
            return stringBuffer0.toString();
        }
    }

    public static class c extends j {
        char a;

        c(char c) {
            this.a = c;
        }

        public c(String s) {
            this(w.n(s).charAt(0));
        }

        @Override  // javassist.bytecode.f0$j
        void a(StringBuffer stringBuffer0) {
            stringBuffer0.append(this.a);
        }

        public l d() {
            return w.D(this.a);
        }

        public char e() {
            return this.a;
        }

        @Override
        public String toString() {
            return w.w(Character.toString(this.a));
        }
    }

    public static class javassist.bytecode.f0.d {
        javassist.bytecode.f0.l[] a;
        e b;
        e[] c;

        public javassist.bytecode.f0.d(javassist.bytecode.f0.l[] arr_f0$l) {
            this(arr_f0$l, null, null);
        }

        public javassist.bytecode.f0.d(javassist.bytecode.f0.l[] arr_f0$l, e f0$e0, e[] arr_f0$e) {
            if(arr_f0$l == null) {
                arr_f0$l = new javassist.bytecode.f0.l[0];
            }
            this.a = arr_f0$l;
            if(f0$e0 == null) {
                f0$e0 = e.c;
            }
            this.b = f0$e0;
            if(arr_f0$e == null) {
                arr_f0$e = new e[0];
            }
            this.c = arr_f0$e;
        }

        public String a() {
            StringBuffer stringBuffer0 = new StringBuffer();
            if(this.a.length > 0) {
                stringBuffer0.append('<');
                for(int v1 = 0; true; ++v1) {
                    javassist.bytecode.f0.l[] arr_f0$l = this.a;
                    if(v1 >= arr_f0$l.length) {
                        break;
                    }
                    arr_f0$l[v1].a(stringBuffer0);
                }
                stringBuffer0.append('>');
            }
            this.b.a(stringBuffer0);
            for(int v = 0; true; ++v) {
                e[] arr_f0$e = this.c;
                if(v >= arr_f0$e.length) {
                    break;
                }
                arr_f0$e[v].a(stringBuffer0);
            }
            return stringBuffer0.toString();
        }

        public e[] b() {
            return this.c;
        }

        public javassist.bytecode.f0.l[] c() {
            return this.a;
        }

        public e d() {
            return this.b;
        }

        @Override
        public String toString() {
            StringBuffer stringBuffer0 = new StringBuffer();
            javassist.bytecode.f0.l.e(stringBuffer0, this.a);
            stringBuffer0.append(" extends ");
            stringBuffer0.append(this.b);
            if(this.c.length > 0) {
                stringBuffer0.append(" implements ");
                j.c(stringBuffer0, this.c);
            }
            return stringBuffer0.toString();
        }
    }

    public static class e extends i {
        String a;
        k[] b;
        public static e c;

        static {
            e.c = new e("java.lang.Object", null);
        }

        public e(String s) {
            this(s, null);
        }

        e(String s, int v, int v1, k[] arr_f0$k) {
            this.a = s.substring(v, v1).replace('/', '.');
            this.b = arr_f0$k;
        }

        public e(String s, k[] arr_f0$k) {
            this.a = s;
            this.b = arr_f0$k;
        }

        @Override  // javassist.bytecode.f0$j
        void a(StringBuffer stringBuffer0) {
            stringBuffer0.append('L');
            this.e(stringBuffer0);
            stringBuffer0.append(';');
        }

        @Override  // javassist.bytecode.f0$j
        public String b() {
            StringBuffer stringBuffer0 = new StringBuffer();
            e f0$e0 = this.f();
            if(f0$e0 != null) {
                stringBuffer0.append(f0$e0.b());
                stringBuffer0.append('$');
            }
            return this.j(stringBuffer0);
        }

        void e(StringBuffer stringBuffer0) {
            e f0$e0 = this.f();
            if(f0$e0 != null) {
                f0$e0.e(stringBuffer0);
                stringBuffer0.append('$');
            }
            stringBuffer0.append(this.a.replace('.', '/'));
            k[] arr_f0$k = this.b;
            if(arr_f0$k != null) {
                k.a(stringBuffer0, arr_f0$k);
            }
        }

        public e f() {
            return null;
        }

        public String g() {
            return this.a;
        }

        public k[] h() {
            return this.b;
        }

        static e i(String s, int v, int v1, k[] arr_f0$k, e f0$e0) {
            return f0$e0 == null ? new e(s, v, v1, arr_f0$k) : new h(s, v, v1, arr_f0$k, f0$e0);
        }

        private String j(StringBuffer stringBuffer0) {
            stringBuffer0.append(this.a);
            if(this.b != null) {
                stringBuffer0.append('<');
                for(int v = 0; v < this.b.length; ++v) {
                    if(v > 0) {
                        stringBuffer0.append(", ");
                    }
                    stringBuffer0.append("?");
                }
                stringBuffer0.append('>');
            }
            return stringBuffer0.toString();
        }

        @Override
        public String toString() {
            StringBuffer stringBuffer0 = new StringBuffer();
            e f0$e0 = this.f();
            if(f0$e0 != null) {
                stringBuffer0.append(f0$e0.toString());
                stringBuffer0.append('.');
            }
            return this.j(stringBuffer0);
        }
    }

    static class f {
        int a;

        private f() {
            this.a = 0;
        }

        f(a f0$a0) {
        }

        int a(String s, int v) throws javassist.bytecode.e {
            int v1 = s.indexOf(v, this.a);
            if(v1 < 0) {
                throw f0.u(s);
            }
            this.a = v1 + 1;
            return v1;
        }
    }

    public static class g {
        javassist.bytecode.f0.l[] a;
        j[] b;
        j c;
        i[] d;

        public g(javassist.bytecode.f0.l[] arr_f0$l, j[] arr_f0$j, j f0$j0, i[] arr_f0$i) {
            if(arr_f0$l == null) {
                arr_f0$l = new javassist.bytecode.f0.l[0];
            }
            this.a = arr_f0$l;
            if(arr_f0$j == null) {
                arr_f0$j = new j[0];
            }
            this.b = arr_f0$j;
            if(f0$j0 == null) {
                f0$j0 = new c("void");
            }
            this.c = f0$j0;
            if(arr_f0$i == null) {
                arr_f0$i = new i[0];
            }
            this.d = arr_f0$i;
        }

        public String a() {
            StringBuffer stringBuffer0 = new StringBuffer();
            if(this.a.length > 0) {
                stringBuffer0.append('<');
                for(int v1 = 0; true; ++v1) {
                    javassist.bytecode.f0.l[] arr_f0$l = this.a;
                    if(v1 >= arr_f0$l.length) {
                        break;
                    }
                    arr_f0$l[v1].a(stringBuffer0);
                }
                stringBuffer0.append('>');
            }
            stringBuffer0.append('(');
            for(int v2 = 0; true; ++v2) {
                j[] arr_f0$j = this.b;
                if(v2 >= arr_f0$j.length) {
                    break;
                }
                arr_f0$j[v2].a(stringBuffer0);
            }
            stringBuffer0.append(')');
            this.c.a(stringBuffer0);
            if(this.d.length > 0) {
                for(int v = 0; v < this.d.length; ++v) {
                    stringBuffer0.append('^');
                    this.d[v].a(stringBuffer0);
                }
            }
            return stringBuffer0.toString();
        }

        public i[] b() {
            return this.d;
        }

        public j[] c() {
            return this.b;
        }

        public j d() {
            return this.c;
        }

        public javassist.bytecode.f0.l[] e() {
            return this.a;
        }

        @Override
        public String toString() {
            StringBuffer stringBuffer0 = new StringBuffer();
            javassist.bytecode.f0.l.e(stringBuffer0, this.a);
            stringBuffer0.append(" (");
            j.c(stringBuffer0, this.b);
            stringBuffer0.append(") ");
            stringBuffer0.append(this.c);
            if(this.d.length > 0) {
                stringBuffer0.append(" throws ");
                j.c(stringBuffer0, this.d);
            }
            return stringBuffer0.toString();
        }
    }

    public static class h extends e {
        e d;

        h(String s, int v, int v1, k[] arr_f0$k, e f0$e0) {
            super(s, v, v1, arr_f0$k);
            this.d = f0$e0;
        }

        public h(e f0$e0, String s, k[] arr_f0$k) {
            super(s, arr_f0$k);
            this.d = f0$e0;
        }

        @Override  // javassist.bytecode.f0$e
        public e f() {
            return this.d;
        }
    }

    public static abstract class i extends j {
        public String d() {
            StringBuffer stringBuffer0 = new StringBuffer();
            this.a(stringBuffer0);
            return stringBuffer0.toString();
        }
    }

    public static abstract class j {
        abstract void a(StringBuffer arg1);

        public String b() [...] // 潜在的解密器

        static void c(StringBuffer stringBuffer0, j[] arr_f0$j) {
            for(int v = 0; v < arr_f0$j.length; ++v) {
                if(v > 0) {
                    stringBuffer0.append(", ");
                }
                stringBuffer0.append(arr_f0$j[v]);
            }
        }
    }

    public static class k {
        i a;
        char b;

        public k() {
            this(null, '*');
        }

        public k(i f0$i0) {
            this(f0$i0, ' ');
        }

        k(i f0$i0, char c) {
            this.a = f0$i0;
            this.b = c;
        }

        static void a(StringBuffer stringBuffer0, k[] arr_f0$k) {
            stringBuffer0.append('<');
            for(int v = 0; v < arr_f0$k.length; ++v) {
                k f0$k0 = arr_f0$k[v];
                if(f0$k0.d()) {
                    stringBuffer0.append(f0$k0.b);
                }
                if(f0$k0.c() != null) {
                    f0$k0.c().a(stringBuffer0);
                }
            }
            stringBuffer0.append('>');
        }

        public char b() {
            return this.b;
        }

        public i c() {
            return this.a;
        }

        public boolean d() {
            return this.b != 0x20;
        }

        public static k e(i f0$i0) {
            return new k(f0$i0, '+');
        }

        public static k f(i f0$i0) {
            return new k(f0$i0, '-');
        }

        @Override
        public String toString() [...] // 潜在的解密器
    }

    public static class javassist.bytecode.f0.l {
        String a;
        i b;
        i[] c;

        public javassist.bytecode.f0.l(String s) {
            this(s, null, null);
        }

        javassist.bytecode.f0.l(String s, int v, int v1, i f0$i0, i[] arr_f0$i) {
            this.a = s.substring(v, v1);
            this.b = f0$i0;
            this.c = arr_f0$i;
        }

        public javassist.bytecode.f0.l(String s, i f0$i0, i[] arr_f0$i) {
            this.a = s;
            this.b = f0$i0;
            if(arr_f0$i == null) {
                this.c = new i[0];
                return;
            }
            this.c = arr_f0$i;
        }

        void a(StringBuffer stringBuffer0) {
            stringBuffer0.append(this.a);
            if(this.b == null) {
                stringBuffer0.append(":Ljava/lang/Object;");
            }
            else {
                stringBuffer0.append(':');
                this.b.a(stringBuffer0);
            }
            for(int v = 0; v < this.c.length; ++v) {
                stringBuffer0.append(':');
                this.c[v].a(stringBuffer0);
            }
        }

        public i b() {
            return this.b;
        }

        public i[] c() {
            return this.c;
        }

        public String d() {
            return this.a;
        }

        static void e(StringBuffer stringBuffer0, javassist.bytecode.f0.l[] arr_f0$l) {
            stringBuffer0.append('<');
            for(int v = 0; v < arr_f0$l.length; ++v) {
                if(v > 0) {
                    stringBuffer0.append(", ");
                }
                stringBuffer0.append(arr_f0$l[v]);
            }
            stringBuffer0.append('>');
        }

        @Override
        public String toString() {
            StringBuffer stringBuffer0 = new StringBuffer(this.d());
            if(this.b != null) {
                stringBuffer0.append(" extends ");
                stringBuffer0.append(this.b.toString());
            }
            int v = this.c.length;
            if(v > 0) {
                for(int v1 = 0; v1 < v; ++v1) {
                    if(v1 > 0 || this.b != null) {
                        stringBuffer0.append(" & ");
                    }
                    else {
                        stringBuffer0.append(" extends ");
                    }
                    stringBuffer0.append(this.c[v1].toString());
                }
            }
            return stringBuffer0.toString();
        }
    }

    public static class m extends i {
        String a;

        public m(String s) {
            this.a = s;
        }

        m(String s, int v, int v1) {
            this.a = s.substring(v, v1);
        }

        @Override  // javassist.bytecode.f0$j
        void a(StringBuffer stringBuffer0) {
            stringBuffer0.append('T');
            stringBuffer0.append(this.a);
            stringBuffer0.append(';');
        }

        public String e() {
            return this.a;
        }

        @Override
        public String toString() {
            return this.a;
        }
    }

    public static final String d = "Signature";

    f0(t t0, int v, DataInputStream dataInputStream0) throws IOException {
        super(t0, v, dataInputStream0);
    }

    public f0(t t0, String s) {
        super(t0, "Signature");
        int v = t0.x(s);
        this.q(new byte[]{((byte)(v >>> 8)), ((byte)v)});
    }

    private static g A(String s) throws javassist.bytecode.e {
        f f0$f0 = new f(null);
        javassist.bytecode.f0.l[] arr_f0$l = f0.F(s, f0$f0);
        int v = f0$f0.a;
        f0$f0.a = v + 1;
        if(s.charAt(v) != 40) {
            throw f0.u(s);
        }
        ArrayList arrayList0 = new ArrayList();
        while(s.charAt(f0$f0.a) != 41) {
            arrayList0.add(f0.D(s, f0$f0));
        }
        ++f0$f0.a;
        j f0$j0 = f0.D(s, f0$f0);
        int v1 = s.length();
        ArrayList arrayList1 = new ArrayList();
        while(f0$f0.a < v1 && s.charAt(f0$f0.a) == 94) {
            ++f0$f0.a;
            i f0$i0 = f0.B(s, f0$f0, false);
            if(f0$i0 instanceof b) {
                throw f0.u(s);
            }
            arrayList1.add(f0$i0);
        }
        return new g(arr_f0$l, ((j[])arrayList0.toArray(new j[arrayList0.size()])), f0$j0, ((i[])arrayList1.toArray(new i[arrayList1.size()])));
    }

    private static i B(String s, f f0$f0, boolean z) throws javassist.bytecode.e {
        int v = f0$f0.a;
        switch(s.charAt(v)) {
            case 76: {
                return f0.z(s, f0$f0, null);
            }
            case 84: {
                return new m(s, v + 1, f0$f0.a(s, 59));
            }
            case 91: {
                return f0.x(s, f0$f0);
            }
            default: {
                if(!z) {
                    throw f0.u(s);
                }
                return null;
            }
        }
    }

    private static javassist.bytecode.f0.d C(String s) throws javassist.bytecode.e, IndexOutOfBoundsException {
        f f0$f0 = new f(null);
        javassist.bytecode.f0.l[] arr_f0$l = f0.F(s, f0$f0);
        e f0$e0 = f0.y(s, f0$f0);
        int v = s.length();
        ArrayList arrayList0 = new ArrayList();
        while(f0$f0.a < v && s.charAt(f0$f0.a) == 76) {
            arrayList0.add(f0.y(s, f0$f0));
        }
        return new javassist.bytecode.f0.d(arr_f0$l, f0$e0, ((e[])arrayList0.toArray(new e[arrayList0.size()])));
    }

    private static j D(String s, f f0$f0) throws javassist.bytecode.e {
        j f0$j0 = f0.B(s, f0$f0, true);
        if(f0$j0 == null) {
            int v = f0$f0.a;
            f0$f0.a = v + 1;
            return new c(s.charAt(v));
        }
        return f0$j0;
    }

    private static k[] E(String s, f f0$f0) throws javassist.bytecode.e {
        k f0$k0;
        ArrayList arrayList0 = new ArrayList();
    alab1:
        while(true) {
            int v = f0$f0.a;
            f0$f0.a = v + 1;
            int v1 = s.charAt(v);
            switch(v1) {
                case 42: {
                    f0$k0 = new k(null, '*');
                    arrayList0.add(f0$k0);
                    break;
                }
                case 43: 
                case 45: {
                    f0$k0 = new k(f0.B(s, f0$f0, false), ((char)v1));
                    arrayList0.add(f0$k0);
                    break;
                }
                case 62: {
                    break alab1;
                }
                default: {
                    --f0$f0.a;
                    f0$k0 = new k(f0.B(s, f0$f0, false), ' ');
                    arrayList0.add(f0$k0);
                    break;
                }
            }
        }
        return (k[])arrayList0.toArray(new k[arrayList0.size()]);
    }

    private static javassist.bytecode.f0.l[] F(String s, f f0$f0) throws javassist.bytecode.e {
        ArrayList arrayList0 = new ArrayList();
        if(s.charAt(f0$f0.a) == 60) {
            ++f0$f0.a;
            while(s.charAt(f0$f0.a) != 62) {
                int v = f0$f0.a;
                int v1 = f0$f0.a(s, 58);
                i f0$i0 = f0.B(s, f0$f0, true);
                ArrayList arrayList1 = new ArrayList();
                while(s.charAt(f0$f0.a) == 58) {
                    ++f0$f0.a;
                    arrayList1.add(f0.B(s, f0$f0, false));
                }
                arrayList0.add(new javassist.bytecode.f0.l(s, v, v1, f0$i0, ((i[])arrayList1.toArray(new i[arrayList1.size()]))));
            }
            ++f0$f0.a;
        }
        return (javassist.bytecode.f0.l[])arrayList0.toArray(new javassist.bytecode.f0.l[arrayList0.size()]);
    }

    static String G(String s, String s1, String s2) {
        HashMap hashMap0 = new HashMap();
        hashMap0.put(s1, s2);
        return f0.H(s, hashMap0);
    }

    static String H(String s, Map map0) {
        if(map0 == null) {
            return s;
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        int v = 0;
        int v1 = 0;
    alab1:
        int v2;
        while((v2 = s.indexOf(76, v)) >= 0) {
            StringBuilder stringBuilder1 = new StringBuilder();
            int v3 = v2;
            while(true) {
                int v4 = v3 + 1;
                int v5 = s.charAt(v4);
                if(v5 == 59) {
                    break;
                }
                try {
                    stringBuilder1.append(((char)v5));
                    if(v5 == 60) {
                        while(true) {
                            ++v4;
                            int v6 = s.charAt(v4);
                            if(v6 == 62) {
                                break;
                            }
                            stringBuilder1.append(((char)v6));
                        }
                        stringBuilder1.append('>');
                    }
                    v3 = v4;
                    continue;
                }
                catch(IndexOutOfBoundsException unused_ex) {
                }
                break alab1;
            }
            String s1 = (String)map0.get(stringBuilder1.toString());
            if(s1 != null) {
                stringBuilder0.append(s.substring(v1, v2));
                stringBuilder0.append('L');
                stringBuilder0.append(s1);
                stringBuilder0.append(';');
                v1 = v3 + 2;
            }
            v = v3 + 2;
        }
        if(v1 == 0) {
            return s;
        }
        int v7 = s.length();
        if(v1 < v7) {
            stringBuilder0.append(s.substring(v1, v7));
        }
        return stringBuilder0.toString();
    }

    public void I(String s) {
        javassist.bytecode.g.e(this.d().x(s), this.c, 0);
    }

    public static javassist.bytecode.f0.d J(String s) throws javassist.bytecode.e {
        try {
            return f0.C(s);
        }
        catch(IndexOutOfBoundsException unused_ex) {
            throw f0.u(s);
        }
    }

    public static i K(String s) throws javassist.bytecode.e {
        try {
            return f0.B(s, new f(null), false);
        }
        catch(IndexOutOfBoundsException unused_ex) {
            throw f0.u(s);
        }
    }

    public static g L(String s) throws javassist.bytecode.e {
        try {
            return f0.A(s);
        }
        catch(IndexOutOfBoundsException unused_ex) {
            throw f0.u(s);
        }
    }

    public static j M(String s) throws javassist.bytecode.e {
        try {
            return f0.D(s, new f(null));
        }
        catch(IndexOutOfBoundsException unused_ex) {
            throw f0.u(s);
        }
    }

    @Override  // javassist.bytecode.d
    public d a(t t0, Map map0) {
        return new f0(t0, this.v());
    }

    @Override  // javassist.bytecode.d
    void m(String s, String s1) {
        this.I(f0.G(this.v(), s, s1));
    }

    @Override  // javassist.bytecode.d
    void p(Map map0) {
        this.I(f0.H(this.v(), map0));
    }

    private static javassist.bytecode.e u(String s) {
        return new javassist.bytecode.e("bad signature: " + s);
    }

    public String v() {
        return this.d().p0(javassist.bytecode.g.d(this.c(), 0));
    }

    private static boolean w(int v) {
        return v != 59 && v != 60;
    }

    private static i x(String s, f f0$f0) throws javassist.bytecode.e {
        int v;
        for(v = 1; true; ++v) {
            int v1 = f0$f0.a + 1;
            f0$f0.a = v1;
            if(s.charAt(v1) != 91) {
                break;
            }
        }
        return new b(v, f0.D(s, f0$f0));
    }

    private static e y(String s, f f0$f0) throws javassist.bytecode.e {
        if(s.charAt(f0$f0.a) != 76) {
            throw f0.u(s);
        }
        return f0.z(s, f0$f0, null);
    }

    private static e z(String s, f f0$f0, e f0$e0) throws javassist.bytecode.e {
        int v5;
        k[] arr_f0$k;
        int v2;
        int v = f0$f0.a + 1;
        f0$f0.a = v;
        do {
            int v1 = f0$f0.a;
            f0$f0.a = v1 + 1;
            v2 = s.charAt(v1);
        }
        while(v2 != 36 && v2 != 60 && v2 != 59);
        int v3 = f0$f0.a - 1;
        if(v2 == 60) {
            arr_f0$k = f0.E(s, f0$f0);
            int v4 = f0$f0.a;
            f0$f0.a = v4 + 1;
            v5 = s.charAt(v4);
        }
        else {
            v5 = v2;
            arr_f0$k = null;
        }
        e f0$e1 = e.i(s, v, v3, arr_f0$k, f0$e0);
        if(v5 != 36 && v5 != 46) {
            return f0$e1;
        }
        --f0$f0.a;
        return f0.z(s, f0$f0, f0$e1);
    }
}

