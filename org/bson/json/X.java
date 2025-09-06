package org.bson.json;

import java.io.Reader;
import org.bson.S;

class x {
    static class a {
        static final int[] a;
        static final int[] b;

        static {
            int[] arr_v = new int[b.values().length];
            a.b = arr_v;
            try {
                arr_v[b.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.d.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.e.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.f.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.g.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.h.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.i.ordinal()] = 9;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.k.ordinal()] = 10;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[b.j.ordinal()] = 11;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v1 = new int[c.values().length];
            a.a = arr_v1;
            try {
                arr_v1[c.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[c.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[c.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[c.d.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[c.e.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    static enum b {
        SAW_LEADING_MINUS,
        SAW_LEADING_ZERO,
        SAW_INTEGER_DIGITS,
        SAW_DECIMAL_POINT,
        SAW_FRACTION_DIGITS,
        SAW_EXPONENT_LETTER,
        SAW_EXPONENT_SIGN,
        SAW_EXPONENT_DIGITS,
        SAW_MINUS_I,
        DONE,
        INVALID;

    }

    static enum c {
        IN_PATTERN,
        IN_ESCAPE_SEQUENCE,
        IN_OPTIONS,
        DONE,
        INVALID;

    }

    private final p a;

    x(Reader reader0) {
        this(new y(reader0));
    }

    x(String s) {
        this(new z(s));
    }

    x(p p0) {
        this.a = p0;
    }

    public void a(int v) {
        this.a.a(v);
    }

    public int b() {
        return this.a.B();
    }

    public C c() {
        int v;
        for(v = this.a.read(); v != -1 && Character.isWhitespace(v); v = this.a.read()) {
        }
        if(v == -1) {
            return new C(D.p, "<eof>");
        }
        switch(v) {
            case 34: 
            case 39: {
                return this.g(((char)v));
            }
            case 40: {
                return new C(D.e, "(");
            }
            case 41: {
                return new C(D.f, ")");
            }
            case 44: {
                return new C(D.i, ",");
            }
            case 0x2F: {
                return this.f();
            }
            case 58: {
                return new C(D.h, ":");
            }
            case 91: {
                return new C(D.b, "[");
            }
            case 93: {
                return new C(D.d, "]");
            }
            case 0x7B: {
                return new C(D.c, "{");
            }
            case 0x7D: {
                return new C(D.g, "}");
            }
            default: {
                if(v != 45 && !Character.isDigit(v)) {
                    if(v != 36 && v != 0x5F && !Character.isLetter(v)) {
                        int v1 = this.a.getPosition();
                        this.a.b(v);
                        throw new v("Invalid JSON input. Position: %d. Character: \'%c\'.", new Object[]{v1, v});
                    }
                    return this.h(((char)v));
                }
                return this.e(((char)v));
            }
        }
    }

    public void d(int v) {
        this.a.c(v);
    }

    private C e(char c) {
        D d1;
        b x$b1;
        b x$b0;
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(c);
        switch(c) {
            case 45: {
                x$b0 = b.a;
                break;
            }
            case 0x30: {
                x$b0 = b.b;
                break;
            }
            default: {
                x$b0 = b.c;
            }
        }
        D d0 = D.l;
        while(true) {
            int v = this.a.read();
        alab1:
            switch(x$b0) {
                case 1: {
                    switch(v) {
                        case 0x30: {
                            x$b1 = b.b;
                            break;
                        }
                        case 73: {
                            x$b1 = b.i;
                            break;
                        }
                        default: {
                            x$b1 = Character.isDigit(v) ? b.c : b.k;
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    switch(v) {
                        case 46: {
                            x$b0 = b.d;
                            break;
                        }
                        case 69: 
                        case 101: {
                            x$b0 = b.f;
                            break;
                        }
                        case -1: 
                        case 41: 
                        case 44: 
                        case 93: 
                        case 0x7D: {
                            x$b0 = b.j;
                            break;
                        }
                        default: {
                            if(Character.isDigit(v)) {
                                x$b0 = b.c;
                            }
                            else if(Character.isWhitespace(v)) {
                                x$b0 = b.j;
                            }
                            else {
                                x$b0 = b.k;
                            }
                            break;
                        }
                    }
                    x$b1 = x$b0;
                    break;
                }
                case 3: {
                    switch(v) {
                        case 46: {
                            x$b0 = b.d;
                            break;
                        }
                        case 69: 
                        case 101: {
                            x$b0 = b.f;
                            break;
                        }
                        case -1: 
                        case 41: 
                        case 44: 
                        case 93: 
                        case 0x7D: {
                            x$b0 = b.j;
                            break;
                        }
                        default: {
                            if(Character.isDigit(v)) {
                                x$b0 = b.c;
                            }
                            else if(Character.isWhitespace(v)) {
                                x$b0 = b.j;
                            }
                            else {
                                x$b0 = b.k;
                            }
                            break;
                        }
                    }
                    x$b1 = x$b0;
                    break;
                }
                case 4: {
                    d1 = D.j;
                    x$b1 = Character.isDigit(v) ? b.e : b.k;
                    d0 = d1;
                    break;
                }
                case 5: {
                    switch(v) {
                        case 69: 
                        case 101: {
                            x$b0 = b.f;
                            break;
                        }
                        case -1: 
                        case 41: 
                        case 44: 
                        case 93: 
                        case 0x7D: {
                            x$b0 = b.j;
                            break;
                        }
                        default: {
                            if(Character.isDigit(v)) {
                                x$b0 = b.e;
                            }
                            else if(Character.isWhitespace(v)) {
                                x$b0 = b.j;
                            }
                            else {
                                x$b0 = b.k;
                            }
                            break;
                        }
                    }
                    x$b1 = x$b0;
                    break;
                }
                case 6: {
                    d1 = D.j;
                    if(v == 43 || v == 45) {
                        x$b1 = b.g;
                    }
                    else if(Character.isDigit(v)) {
                        x$b1 = b.h;
                    }
                    else {
                        x$b1 = b.k;
                    }
                    d0 = d1;
                    break;
                }
                case 7: {
                    x$b0 = Character.isDigit(v) ? b.h : b.k;
                    x$b1 = x$b0;
                    break;
                }
                case 8: {
                    if(v == 41 || v == 44 || v == 93 || v == 0x7D) {
                        x$b0 = b.j;
                    }
                    else if(Character.isDigit(v)) {
                        x$b0 = b.h;
                    }
                    else if(Character.isWhitespace(v)) {
                        x$b0 = b.j;
                    }
                    else {
                        x$b0 = b.k;
                    }
                    x$b1 = x$b0;
                    break;
                }
                case 9: {
                    for(int v1 = 0; v1 < 7; ++v1) {
                        if(v != new char[]{'n', 'f', 'i', 'n', 'i', 't', 'y'}[v1]) {
                            x$b1 = b.k;
                            break alab1;
                        }
                        stringBuilder0.append(((char)v));
                        v = this.a.read();
                    }
                    d1 = D.j;
                    if(v == -1 || v == 41 || v == 44 || v == 93 || v == 0x7D) {
                        x$b1 = b.j;
                    }
                    else if(Character.isWhitespace(v)) {
                        x$b1 = b.j;
                    }
                    else {
                        x$b1 = b.k;
                    }
                    d0 = d1;
                    break;
                }
                default: {
                    x$b1 = x$b0;
                    break;
                }
            }
            switch(x$b1) {
                case 10: {
                    throw new v("Invalid JSON number");
                }
                case 11: {
                    this.a.b(v);
                    String s = stringBuilder0.toString();
                    D d2 = D.j;
                    if(d0 == d2) {
                        return new C(d2, Double.parseDouble(s));
                    }
                    long v2 = Long.parseLong(s);
                    return v2 < 0xFFFFFFFF80000000L || v2 > 0x7FFFFFFFL ? new C(D.l, v2) : new C(D.k, ((int)v2));
                }
                default: {
                    stringBuilder0.append(((char)v));
                    x$b0 = x$b1;
                    break;
                }
            }
        }
    }

    private C f() {
        StringBuilder stringBuilder0 = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder();
        c x$c0 = c.a;
        while(true) {
            int v = this.a.read();
            int[] arr_v = a.a;
            int v1 = arr_v[x$c0.ordinal()];
            if(v1 == 1) {
                switch(v) {
                    case -1: {
                        x$c0 = c.e;
                        break;
                    }
                    case 0x2F: {
                        x$c0 = c.c;
                        break;
                    }
                    default: {
                        x$c0 = v == 92 ? c.b : c.a;
                    }
                }
            }
            else {
                switch(v1) {
                    case 2: {
                        x$c0 = c.a;
                        break;
                    }
                    case 3: {
                        switch(v) {
                            case 105: 
                            case 109: 
                            case 0x73: 
                            case 120: {
                                x$c0 = c.c;
                                break;
                            }
                            case -1: 
                            case 41: 
                            case 44: 
                            case 93: 
                            case 0x7D: {
                                x$c0 = c.d;
                                break;
                            }
                            default: {
                                x$c0 = Character.isWhitespace(v) ? c.d : c.e;
                                break;
                            }
                        }
                    }
                }
            }
            switch(arr_v[x$c0.ordinal()]) {
                case 4: {
                    this.a.b(v);
                    S s0 = new S(stringBuilder0.toString(), stringBuilder1.toString());
                    return new C(D.m, s0);
                }
                case 5: {
                    throw new v("Invalid JSON regular expression. Position: %d.", new Object[]{this.a.getPosition()});
                label_38:
                    if(arr_v[x$c0.ordinal()] != 3) {
                        stringBuilder0.append(((char)v));
                        break;
                    }
                    if(v == 0x2F) {
                        break;
                    }
                    stringBuilder1.append(((char)v));
                    break;
                }
                default: {
                    goto label_38;
                }
            }
        }
    }

    private C g(char c) {
        StringBuilder stringBuilder0 = new StringBuilder();
        do {
            int v = this.a.read();
            if(v == 92) {
                v = this.a.read();
                switch(v) {
                    case 34: {
                        stringBuilder0.append('\"');
                        break;
                    }
                    case 39: {
                        stringBuilder0.append('\'');
                        break;
                    }
                    case 0x2F: {
                        stringBuilder0.append('/');
                        break;
                    }
                    case 92: {
                        stringBuilder0.append('\\');
                        break;
                    }
                    case 98: {
                        stringBuilder0.append('\b');
                        break;
                    }
                    case 102: {
                        stringBuilder0.append('\f');
                        break;
                    }
                    case 110: {
                        stringBuilder0.append('\n');
                        break;
                    }
                    case 0x72: {
                        stringBuilder0.append('\r');
                        break;
                    }
                    case 0x74: {
                        stringBuilder0.append('\t');
                        break;
                    }
                    case 0x75: {
                        int v1 = this.a.read();
                        int v2 = this.a.read();
                        int v3 = this.a.read();
                        int v4 = this.a.read();
                        if(v4 != -1) {
                            stringBuilder0.append(((char)Integer.parseInt(new String(new char[]{((char)v1), ((char)v2), ((char)v3), ((char)v4)}), 16)));
                        }
                        break;
                    }
                    default: {
                        throw new v("Invalid escape sequence in JSON string \'\\%c\'.", new Object[]{v});
                    }
                }
            }
            else {
                if(v == c) {
                    return new C(D.n, stringBuilder0.toString());
                }
                if(v != -1) {
                    stringBuilder0.append(((char)v));
                }
            }
        }
        while(v != -1);
        throw new v("End of file in JSON string.");
    }

    private C h(char c) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(c);
        int v;
        for(v = this.a.read(); v == 36 || v == 0x5F || Character.isLetterOrDigit(v); v = this.a.read()) {
            stringBuilder0.append(((char)v));
        }
        this.a.b(v);
        return new C(D.o, stringBuilder0.toString());
    }
}

