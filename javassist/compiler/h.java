package javassist.compiler;

public class h implements q {
    private int a;
    private StringBuffer b;
    private p c;
    private p d;
    private String e;
    private int f;
    private int g;
    private int h;
    private static final int[] i;
    private static final g j;

    static {
        h.i = new int[]{350, 0, 0, 0, 0x15F, 0x160, 0, 0, 0, 353, 354, 0, 355, 0, 356, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 357, 358, 359, 0};
        g g0 = new g();
        h.j = g0;
        g0.a("abstract", 300);
        g0.a("boolean", 301);
        g0.a("break", 302);
        g0.a("byte", 303);
        g0.a("case", 304);
        g0.a("catch", 305);
        g0.a("char", 306);
        g0.a("class", 307);
        g0.a("const", 308);
        g0.a("continue", 309);
        g0.a("default", 310);
        g0.a("do", 311);
        g0.a("double", 312);
        g0.a("else", 313);
        g0.a("extends", 314);
        g0.a("false", 411);
        g0.a("final", 315);
        g0.a("finally", 316);
        g0.a("float", 317);
        g0.a("for", 318);
        g0.a("goto", 0x13F);
        g0.a("if", 320);
        g0.a("implements", 321);
        g0.a("import", 322);
        g0.a("instanceof", 323);
        g0.a("int", 324);
        g0.a("interface", 325);
        g0.a("long", 326);
        g0.a("native", 327);
        g0.a("new", 328);
        g0.a("null", 412);
        g0.a("package", 329);
        g0.a("private", 330);
        g0.a("protected", 331);
        g0.a("public", 332);
        g0.a("return", 333);
        g0.a("short", 334);
        g0.a("static", 0x14F);
        g0.a("strictfp", 347);
        g0.a("super", 0x150);
        g0.a("switch", 337);
        g0.a("synchronized", 338);
        g0.a("this", 339);
        g0.a("throw", 340);
        g0.a("throws", 341);
        g0.a("transient", 342);
        g0.a("true", 410);
        g0.a("try", 343);
        g0.a("void", 344);
        g0.a("volatile", 345);
        g0.a("while", 346);
    }

    public h(String s) {
        this.a = -1;
        this.b = new StringBuffer();
        this.c = new p();
        this.d = null;
        this.e = s;
        this.f = 0;
        this.g = s.length();
        this.h = 0;
    }

    public int a() {
        p p0 = this.d;
        if(p0 == null) {
            return this.b(this.c);
        }
        this.c = p0;
        this.d = p0.a;
        return p0.b;
    }

    private int b(p p0) {
        int v;
        do {
            v = this.q(p0);
        }
        while(v == 10);
        p0.b = v;
        return v;
    }

    public double c() {
        return this.c.d;
    }

    public long d() {
        return this.c.c;
    }

    private int e() {
        int v2;
        int v;
        do {
            v = this.h();
            if(v == 0x2F) {
                int v1 = this.h();
                if(v1 == 0x2F) {
                    do {
                        v2 = this.h();
                    }
                    while(v2 != -1 && v2 != 10 && v2 != 13);
                    v = v2;
                }
                else if(v1 == 42) {
                    while(true) {
                        v = this.h();
                        if(v == -1) {
                            break;
                        }
                        if(v == 42) {
                            int v3 = this.h();
                            if(v3 == 0x2F) {
                                v = 0x20;
                                break;
                            }
                            this.u(v3);
                        }
                    }
                }
                else {
                    this.u(v1);
                    v = 0x2F;
                }
            }
        }
        while(h.i(v));
        return v;
    }

    public String f() {
        return this.c.e;
    }

    public String g() {
        int v = this.f;
        int v1 = v + 10;
        int v2 = this.g;
        if(v1 > v2) {
            v1 = v2;
        }
        return this.e.substring((v - 10 >= 0 ? v - 10 : 0), v1);
    }

    private int h() {
        int v = this.a;
        if(v < 0) {
            int v1 = this.f;
            if(v1 < this.g) {
                this.f = v1 + 1;
                return this.e.charAt(v1);
            }
            return -1;
        }
        this.a = -1;
        return v;
    }

    private static boolean i(int v) {
        return v == 9 || v == 10 || v == 12 || v == 13 || v == 0x20;
    }

    private static boolean j(int v) {
        return 0x30 <= v && v <= 57;
    }

    public int k() {
        return this.l(0);
    }

    public int l(int v) {
        p p0 = this.d;
        if(p0 == null) {
            p0 = this.c;
            this.d = p0;
            p0.a = null;
            this.b(p0);
        }
        while(v > 0) {
            if(p0.a == null) {
                p p1 = new p();
                p0.a = p1;
                this.b(p1);
            }
            p0 = p0.a;
            --v;
        }
        this.c = p0;
        return p0.b;
    }

    private int m(p p0) {
        int v = 0;
        while(true) {
            int v1 = this.h();
            switch(v1) {
                case 39: {
                    p0.c = (long)v;
                    return 401;
                label_6:
                    if(v1 < 0x20) {
                        if(v1 == 10) {
                            ++this.h;
                        }
                        return 500;
                    }
                    v = v1;
                    break;
                }
                case 92: {
                    v = this.o();
                    break;
                }
                default: {
                    goto label_6;
                }
            }
        }
    }

    private int n(StringBuffer stringBuffer0, int v, p p0) {
        if(v != 68 && v != 69 && v != 100 && v != 101) {
            stringBuffer0.append(((char)v));
            while(true) {
                v = this.h();
                if(0x30 > v || v > 57) {
                    break;
                }
                stringBuffer0.append(((char)v));
            }
        }
        if(v == 69 || v == 101) {
            stringBuffer0.append(((char)v));
            v = this.h();
            if(v == 43 || v == 45) {
                stringBuffer0.append(((char)v));
                v = this.h();
            }
            while(0x30 <= v && v <= 57) {
                stringBuffer0.append(((char)v));
                v = this.h();
            }
        }
        try {
            p0.d = Double.parseDouble(stringBuffer0.toString());
        }
        catch(NumberFormatException unused_ex) {
            return 500;
        }
        if(v != 70 && v != 102) {
            if(v != 68 && v != 100) {
                this.u(v);
            }
            return 405;
        }
        return 404;
    }

    private int o() {
        int v = this.h();
        switch(v) {
            case 10: {
                ++this.h;
                return 10;
            }
            case 102: {
                return 12;
            }
            case 110: {
                return 10;
            }
            case 0x72: {
                return 13;
            }
            case 0x74: {
                return 9;
            }
            default: {
                return v;
            }
        }
    }

    private int p(int v, p p0) {
        StringBuffer stringBuffer0 = this.b;
        stringBuffer0.setLength(0);
        do {
            stringBuffer0.append(((char)v));
            v = this.h();
        }
        while(Character.isJavaIdentifierPart(((char)v)));
        this.u(v);
        String s = stringBuffer0.toString();
        int v1 = h.j.b(s);
        if(v1 >= 0) {
            return v1;
        }
        p0.e = s;
        return 400;
    }

    private int q(p p0) {
        int v = this.e();
        if(v < 0) {
            return v;
        }
        switch(v) {
            case 10: {
                ++this.h;
                return 10;
            }
            case 34: {
                return this.t(p0);
            }
            case 39: {
                return this.m(p0);
            }
            default: {
                if(0x30 <= v && v <= 57) {
                    return this.r(v, p0);
                }
                if(v == 46) {
                    int v1 = this.h();
                    if(0x30 <= v1 && v1 <= 57) {
                        StringBuffer stringBuffer0 = this.b;
                        stringBuffer0.setLength(0);
                        stringBuffer0.append('.');
                        return this.n(stringBuffer0, v1, p0);
                    }
                    this.u(v1);
                    return this.s(46);
                }
                return Character.isJavaIdentifierStart(((char)v)) ? this.p(v, p0) : this.s(v);
            }
        }
    }

    private int r(int v, p p0) {
        int v7;
        long v6;
        int v5;
        int v3;
        int v1 = this.h();
        if(v == 0x30) {
            if(v1 == 88 || v1 == 120) {
                long v4;
                for(v4 = 0L; true; v4 = v6 + ((long)v7)) {
                    v5 = this.h();
                    if(0x30 <= v5 && v5 <= 57) {
                        v6 = v4 * 16L;
                        v7 = v5 - 0x30;
                    }
                    else if(65 > v5 || v5 > 70) {
                        if(97 > v5 || v5 > 102) {
                            break;
                        }
                        v6 = v4 * 16L;
                        v7 = v5 - 87;
                    }
                    else {
                        v6 = v4 * 16L;
                        v7 = v5 - 55;
                    }
                }
                p0.c = v4;
                if(v5 != 76 && v5 != 108) {
                    this.u(v5);
                    return 402;
                }
                return 403;
            }
            else if(0x30 <= v1 && v1 <= 55) {
                long v2;
                for(v2 = (long)(v1 - 0x30); true; v2 = v2 * 8L + ((long)(v3 - 0x30))) {
                    v3 = this.h();
                    if(0x30 > v3 || v3 > 55) {
                        break;
                    }
                }
                p0.c = v2;
                if(v3 != 76 && v3 != 108) {
                    this.u(v3);
                    return 402;
                }
                return 403;
            }
        }
        long v8 = (long)(v - 0x30);
        while(0x30 <= v1 && v1 <= 57) {
            v8 = v8 * 10L + ((long)v1) - 0x30L;
            v1 = this.h();
        }
        p0.c = v8;
        if(v1 != 70 && v1 != 102) {
            if(v1 != 46 && v1 != 68 && v1 != 69 && v1 != 100 && v1 != 101) {
                if(v1 != 76 && v1 != 108) {
                    this.u(v1);
                    return 402;
                }
                return 403;
            }
            StringBuffer stringBuffer0 = this.b;
            stringBuffer0.setLength(0);
            stringBuffer0.append(v8);
            return this.n(stringBuffer0, v1, p0);
        }
        p0.d = (double)v8;
        return 404;
    }

    private int s(int v) {
        int v2;
        if(33 > v || v > 0x3F) {
            switch(v) {
                case 94: {
                    v2 = this.h();
                    if(v2 == 61) {
                        return 360;
                    }
                    break;
                }
                case 0x7C: {
                    v2 = this.h();
                    if(v2 == 61) {
                        return 361;
                    }
                    if(v2 == 0x7C) {
                        return 0x170;
                    }
                    break;
                }
                default: {
                    return v;
                }
            }
        }
        else {
            int v1 = h.i[v - 33];
            if(v1 == 0) {
                return v;
            }
            v2 = this.h();
            if(v == v2) {
                switch(v) {
                    case 38: {
                        return 369;
                    }
                    case 43: {
                        return 362;
                    }
                    case 45: {
                        return 363;
                    }
                    case 60: {
                        int v3 = this.h();
                        if(v3 == 61) {
                            return 365;
                        }
                        this.u(v3);
                        return 364;
                    }
                    case 61: {
                        return 358;
                    }
                    case 62: {
                        int v4 = this.h();
                        if(v4 == 61) {
                            return 0x16F;
                        }
                        if(v4 == 62) {
                            int v5 = this.h();
                            if(v5 == 61) {
                                return 371;
                            }
                            this.u(v5);
                            return 370;
                        }
                        this.u(v4);
                        return 366;
                    }
                }
            }
            else if(v2 == 61) {
                return v1;
            }
        }
        this.u(v2);
        return v;
    }

    private int t(p p0) {
        int v1;
        StringBuffer stringBuffer0 = this.b;
        stringBuffer0.setLength(0);
        while(true) {
            int v = this.h();
            switch(v) {
                case 10: {
                    ++this.h;
                    return 500;
                }
                case 34: {
                    while(true) {
                        v1 = this.h();
                        if(v1 == 10) {
                            ++this.h;
                        }
                        else if(!h.i(v1)) {
                            break;
                        }
                    }
                    if(v1 == 34) {
                        continue;
                    }
                    this.u(v1);
                    p0.e = stringBuffer0.toString();
                    return 406;
                }
                case 92: {
                    v = this.o();
                    break;
                }
                default: {
                    if(v < 0) {
                        ++this.h;
                        return 500;
                    }
                }
            }
            stringBuffer0.append(((char)v));
        }
    }

    private void u(int v) {
        this.a = v;
    }
}

