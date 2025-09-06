package kotlinx.serialization.json.internal;

import java.util.ArrayList;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.text.v;
import kotlin.y;
import y4.l;
import y4.m;
import z3.f;

public abstract class a {
    @f
    protected int a;
    @l
    @f
    public final K b;
    @m
    private String c;
    @l
    private StringBuilder d;

    public a() {
        this.b = new K();
        this.d = new StringBuilder();
    }

    public final void A(@l String s) {
        L.p(s, "key");
        this.x("Encountered an unknown key \'" + s + '\'', v.H3(this.P(0, this.a), s, 0, false, 6, null), "Use \'ignoreUnknownKeys = true\' in \'Json {}\' builder to ignore unknown keys.");
        throw new y();
    }

    private final int B(CharSequence charSequence0, int v) {
        int v1 = charSequence0.charAt(v);
        if(0x30 <= v1 && v1 < 58) {
            return v1 - 0x30;
        }
        if(97 <= v1 && v1 < 103) {
            return v1 - 87;
        }
        if(65 <= v1 && v1 < 71) {
            return v1 - 55;
        }
        a.y(this, "Invalid toHexChar char \'" + ((char)v1) + "\' in unicode escape", 0, null, 6, null);
        throw new y();
    }

    @l
    protected final StringBuilder C() {
        return this.d;
    }

    @l
    protected abstract CharSequence D();

    public int E(char c, int v) {
        return v.r3(this.D(), c, v, false, 4, null);
    }

    public final boolean F() {
        return this.H() != 10;
    }

    protected final boolean G(char c) {
        return c != 44 && c != 58 && c != 93 && c != 0x7D ? 1 : 0;
    }

    public final byte H() {
        CharSequence charSequence0 = this.D();
        int v = this.a;
        int v1;
        while((v1 = this.J(v)) != -1) {
            int v2 = charSequence0.charAt(v1);
            if(v2 != 10 && v2 != 0x20 && v2 != 13 && v2 != 9) {
                this.a = v1;
                return b.a(((char)v2));
            }
            v = v1 + 1;
        }
        this.a = -1;
        return 10;
    }

    @m
    public final String I(boolean z) {
        String s;
        int v = this.H();
        if(z) {
            if(v != 0 && v != 1) {
                return null;
            }
            s = this.s();
        }
        else {
            if(v != 1) {
                return null;
            }
            s = this.q();
        }
        this.c = s;
        return s;
    }

    public abstract int J(int arg1);

    public final void K(boolean z, int v, @l A3.a a0) {
        L.p(a0, "message");
        if(z) {
            return;
        }
        a.y(this, ((String)a0.invoke()), v, null, 4, null);
        throw new y();
    }

    public static void L(a a0, boolean z, int v, A3.a a1, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: require");
        }
        if((v1 & 2) != 0) {
            v = a0.a;
        }
        L.p(a1, "message");
        if(z) {
            return;
        }
        a.y(a0, ((String)a1.invoke()), v, null, 4, null);
        throw new y();
    }

    protected final void M(@l StringBuilder stringBuilder0) {
        L.p(stringBuilder0, "<set-?>");
        this.d = stringBuilder0;
    }

    public final void N(boolean z) {
        ArrayList arrayList0 = new ArrayList();
        int v = this.H();
        if(v != 8 && v != 6) {
            this.s();
            return;
        }
    alab1:
        while(true) {
            int v1 = this.H();
            switch(v1) {
                case 7: {
                    if(((Number)u.p3(arrayList0)).byteValue() != 6) {
                        throw E.f(this.a, "found } instead of ] at path: " + this.b, this.D());
                    }
                    u.O0(arrayList0);
                    break;
                }
                case 6: 
                case 8: {
                    arrayList0.add(((byte)v1));
                    break;
                }
                case 9: {
                    if(((Number)u.p3(arrayList0)).byteValue() != 8) {
                        break alab1;
                    }
                    u.O0(arrayList0);
                    break;
                }
                case 10: {
                    a.y(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                    throw new y();
                }
            }
            this.m();
            if(arrayList0.size() == 0) {
                return;
            }
        }
        throw E.f(this.a, "found ] instead of } at path: " + this.b, this.D());
    }

    public int O() {
        int v = this.a;
    alab1:
        int v1;
        while((v1 = this.J(v)) != -1) {
            switch(this.D().charAt(v1)) {
                case 9: 
                case 10: 
                case 13: 
                case 0x20: {
                    v = v1 + 1;
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        this.a = v1;
        return v1;
    }

    @l
    public String P(int v, int v1) {
        return this.D().subSequence(v, v1).toString();
    }

    private final String Q() {
        String s = this.c;
        L.m(s);
        this.c = null;
        return s;
    }

    public abstract boolean R();

    public final boolean S() {
        int v = this.J(this.O());
        int v1 = this.D().length() - v;
        if(v1 >= 4 && v != -1) {
            for(int v2 = 0; v2 < 4; ++v2) {
                if("null".charAt(v2) != this.D().charAt(v + v2)) {
                    return true;
                }
            }
            if(v1 > 4 && b.a(this.D().charAt(v + 4)) == 0) {
                return true;
            }
            this.a = v + 4;
            return false;
        }
        return true;
    }

    protected final void T(char c) {
        int v = this.a - 1;
        this.a = v;
        if(v >= 0 && c == 34 && L.g(this.s(), "null")) {
            this.x("Expected string literal but \'null\' literal was found", this.a - 4, "Use \'coerceInputValues = true\' in \'Json {}` builder to coerce nulls to default values.");
            throw new y();
        }
        this.z(b.a(c));
        throw new y();
    }

    private final boolean U() {
        return this.D().charAt(this.a - 1) != 34;
    }

    private final int b(int v) {
        int v1 = this.J(v);
        if(v1 != -1) {
            int v2 = this.D().charAt(v1);
            if(v2 == 0x75) {
                return this.d(this.D(), v1 + 1);
            }
            int v3 = b.b(v2);
            if(v3 != 0) {
                this.d.append(((char)v3));
                return v1 + 1;
            }
            a.y(this, "Invalid escaped char \'" + ((char)v2) + '\'', 0, null, 6, null);
            throw new y();
        }
        a.y(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
        throw new y();
    }

    private final int c(int v, int v1) {
        this.e(v, v1);
        return this.b(v1 + 1);
    }

    private final int d(CharSequence charSequence0, int v) {
        if(v + 4 >= charSequence0.length()) {
            this.a = v;
            this.v();
            if(this.a + 4 < charSequence0.length()) {
                return this.d(charSequence0, this.a);
            }
            a.y(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
            throw new y();
        }
        this.d.append(((char)((this.B(charSequence0, v) << 12) + (this.B(charSequence0, v + 1) << 8) + (this.B(charSequence0, v + 2) << 4) + this.B(charSequence0, v + 3))));
        return v + 4;
    }

    protected void e(int v, int v1) {
        this.d.append(this.D(), v, v1);
    }

    public abstract boolean f();

    public final boolean g() {
        return this.h(this.O());
    }

    private final boolean h(int v) {
        int v1 = this.J(v);
        if(v1 < this.D().length() && v1 != -1) {
            switch(this.D().charAt(v1) | 0x20) {
                case 102: {
                    this.j("alse", v1 + 1);
                    return false;
                }
                case 0x74: {
                    this.j("rue", v1 + 1);
                    return true;
                }
                default: {
                    a.y(this, "Expected valid boolean literal prefix, but had \'" + this.s() + '\'', 0, null, 6, null);
                    throw new y();
                }
            }
        }
        a.y(this, "EOF", 0, null, 6, null);
        throw new y();
    }

    public final boolean i() {
        boolean z;
        int v = this.O();
        if(v != this.D().length()) {
            if(this.D().charAt(v) == 34) {
                ++v;
                z = true;
            }
            else {
                z = false;
            }
            boolean z1 = this.h(v);
            if(z) {
                if(this.a != this.D().length()) {
                    if(this.D().charAt(this.a) == 34) {
                        ++this.a;
                        return z1;
                    }
                    a.y(this, "Expected closing quotation mark", 0, null, 6, null);
                    throw new y();
                }
                a.y(this, "EOF", 0, null, 6, null);
                throw new y();
            }
            return z1;
        }
        a.y(this, "EOF", 0, null, 6, null);
        throw new y();
    }

    private final void j(String s, int v) {
        if(this.D().length() - v >= s.length()) {
            int v1 = s.length();
            int v2 = 0;
            while(v2 < v1) {
                if(s.charAt(v2) == (this.D().charAt(v + v2) | 0x20)) {
                    ++v2;
                    continue;
                }
                a.y(this, "Expected valid boolean literal prefix, but had \'" + this.s() + '\'', 0, null, 6, null);
                throw new y();
            }
            this.a = v + s.length();
            return;
        }
        a.y(this, "Unexpected end of boolean literal", 0, null, 6, null);
        throw new y();
    }

    @l
    public abstract String k();

    @m
    public abstract String l(@l String arg1, boolean arg2);

    public abstract byte m();

    public final byte n(byte b) {
        byte b1 = this.m();
        if(b1 == b) {
            return b1;
        }
        this.z(b);
        throw new y();
    }

    public void o(char c) {
        this.v();
        CharSequence charSequence0 = this.D();
        int v = this.a;
        int v1;
        while((v1 = this.J(v)) != -1) {
            int v2 = charSequence0.charAt(v1);
            if(v2 != 9 && v2 != 10 && v2 != 13 && v2 != 0x20) {
                this.a = v1 + 1;
                if(v2 == c) {
                    return;
                }
                this.T(c);
            }
            v = v1 + 1;
        }
        this.a = -1;
        this.T(c);
    }

    public final long p() {
        boolean z;
        int v = this.J(this.O());
        if(v < this.D().length() && v != -1) {
            if(this.D().charAt(v) == 34) {
                ++v;
                if(v != this.D().length()) {
                    z = true;
                    goto label_10;
                }
                a.y(this, "EOF", 0, null, 6, null);
                throw new y();
            }
            else {
                z = false;
            }
        label_10:
            int v1 = v;
            long v2 = 0L;
            boolean z1 = false;
            boolean z2 = true;
            while(z2) {
                int v3 = this.D().charAt(v1);
                if(v3 == 45) {
                    if(v1 == v) {
                        ++v1;
                        z1 = true;
                        continue;
                    }
                    a.y(this, "Unexpected symbol \'-\' in numeric literal", 0, null, 6, null);
                    throw new y();
                }
                if(b.a(((char)v3)) != 0) {
                    break;
                }
                ++v1;
                z2 = v1 != this.D().length();
                if(v3 - 0x30 >= 0 && v3 - 0x30 < 10) {
                    v2 = v2 * 10L - ((long)(v3 - 0x30));
                    if(v2 <= 0L) {
                        continue;
                    }
                    a.y(this, "Numeric value overflow", 0, null, 6, null);
                    throw new y();
                }
                a.y(this, "Unexpected symbol \'" + ((char)v3) + "\' in numeric literal", 0, null, 6, null);
                throw new y();
            }
            if(v != v1 && (!z1 || v != v1 - 1)) {
                if(z) {
                    if(z2) {
                        if(this.D().charAt(v1) == 34) {
                            ++v1;
                            goto label_43;
                        }
                        a.y(this, "Expected closing quotation mark", 0, null, 6, null);
                        throw new y();
                    }
                    a.y(this, "EOF", 0, null, 6, null);
                    throw new y();
                }
            label_43:
                this.a = v1;
                if(!z1) {
                    if(v2 != 0x8000000000000000L) {
                        return -v2;
                    }
                    a.y(this, "Numeric value overflow", 0, null, 6, null);
                    throw new y();
                }
                return v2;
            }
            a.y(this, "Expected numeric literal", 0, null, 6, null);
            throw new y();
        }
        a.y(this, "EOF", 0, null, 6, null);
        throw new y();
    }

    @l
    public final String q() {
        return this.c == null ? this.k() : this.Q();
    }

    @l
    protected final String r(@l CharSequence charSequence0, int v, int v1) {
        int v3;
        L.p(charSequence0, "source");
        int v2 = charSequence0.charAt(v1);
        boolean z = false;
    alab1:
        while(true) {
            switch(v2) {
                case 34: {
                    String s = z ? this.u(v, v1) : this.P(v, v1);
                    this.a = v1 + 1;
                    return s;
                label_8:
                    ++v1;
                    if(v1 >= charSequence0.length()) {
                        this.e(v, v1);
                        v3 = this.J(v1);
                        if(v3 == -1) {
                            a.y(this, "EOF", -1, null, 4, null);
                            throw new y();
                        }
                        v = v3;
                        v1 = v;
                        z = true;
                        break;
                    }
                    break;
                }
                case 92: {
                    v3 = this.J(this.c(v, v1));
                    if(v3 == -1) {
                        break alab1;
                    }
                    v = v3;
                    v1 = v;
                    z = true;
                    break;
                }
                default: {
                    goto label_8;
                }
            }
            v2 = charSequence0.charAt(v1);
        }
        a.y(this, "EOF", -1, null, 4, null);
        throw new y();
    }

    @l
    public final String s() {
        if(this.c != null) {
            return this.Q();
        }
        int v = this.O();
        if(v < this.D().length() && v != -1) {
            int v1 = b.a(this.D().charAt(v));
            if(v1 == 1) {
                return this.q();
            }
            if(v1 == 0) {
                boolean z = false;
                while(b.a(this.D().charAt(v)) == 0) {
                    ++v;
                    if(v >= this.D().length()) {
                        this.e(this.a, v);
                        int v2 = this.J(v);
                        if(v2 == -1) {
                            this.a = v;
                            return this.u(0, 0);
                        }
                        v = v2;
                        z = true;
                    }
                }
                String s = z ? this.u(this.a, v) : this.P(this.a, v);
                this.a = v;
                return s;
            }
            a.y(this, "Expected beginning of the string, but got " + this.D().charAt(v), 0, null, 6, null);
            throw new y();
        }
        a.y(this, "EOF", v, null, 4, null);
        throw new y();
    }

    @l
    public final String t() {
        String s = this.s();
        if(L.g(s, "null") && this.U()) {
            a.y(this, "Unexpected \'null\' value instead of string literal", 0, null, 6, null);
            throw new y();
        }
        return s;
    }

    @Override
    @l
    public String toString() {
        return "JsonReader(source=\'" + this.D() + "\', currentPosition=" + this.a + ')';
    }

    private final String u(int v, int v1) {
        this.e(v, v1);
        String s = this.d.toString();
        L.o(s, "escapedString.toString()");
        this.d.setLength(0);
        return s;
    }

    public void v() {
    }

    public final void w() {
        if(this.m() == 10) {
            return;
        }
        a.y(this, "Expected EOF after parsing, but had " + this.D().charAt(this.a - 1) + " instead", 0, null, 6, null);
        throw new y();
    }

    @l
    public final Void x(@l String s, int v, @l String s1) {
        L.p(s, "message");
        L.p(s1, "hint");
        throw E.f(v, s + " at path: " + "$" + (s1.length() == 0 ? "" : '\n' + s1), this.D());
    }

    public static Void y(a a0, String s, int v, String s1, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if((v1 & 2) != 0) {
            v = a0.a;
        }
        if((v1 & 4) != 0) {
            s1 = "";
        }
        return a0.x(s, v, s1);
    }

    @l
    public final Void z(byte b) {
        String s;
        switch(b) {
            case 1: {
                s = "quotation mark \'\"\'";
                break;
            }
            case 4: {
                s = "comma \',\'";
                break;
            }
            case 5: {
                s = "colon \':\'";
                break;
            }
            case 6: {
                s = "start of the object \'{\'";
                break;
            }
            case 7: {
                s = "end of the object \'}\'";
                break;
            }
            case 8: {
                s = "start of the array \'[\'";
                break;
            }
            case 9: {
                s = "end of the array \']\'";
                break;
            }
            default: {
                s = "valid token";
            }
        }
        a.y(this, "Expected " + s + ", but had \'" + (this.a == this.D().length() || this.a <= 0 ? "EOF" : String.valueOf(this.D().charAt(this.a - 1))) + "\' instead", this.a - 1, null, 4, null);
        throw new y();
    }
}

