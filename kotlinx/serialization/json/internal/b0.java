package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.y;
import y4.l;
import y4.m;

public final class b0 extends a {
    @l
    private final d0 e;
    private int f;
    @l
    private final i g;

    public b0(@l d0 d00, @l char[] arr_c) {
        L.p(d00, "reader");
        L.p(arr_c, "charsBuffer");
        super();
        this.e = d00;
        this.f = 0x80;
        this.g = new i(arr_c);
        this.W(0);
    }

    public b0(d0 d00, char[] arr_c, int v, w w0) {
        if((v & 2) != 0) {
            arr_c = new char[0x4000];
        }
        this(d00, arr_c);
    }

    @Override  // kotlinx.serialization.json.internal.a
    public CharSequence D() {
        return this.V();
    }

    @Override  // kotlinx.serialization.json.internal.a
    public int E(char c, int v) {
        i i0 = this.V();
        int v1 = i0.length();
        while(v < v1) {
            if(i0.charAt(v) == c) {
                return v;
            }
            ++v;
        }
        return -1;
    }

    @Override  // kotlinx.serialization.json.internal.a
    public int J(int v) {
        if(v < this.V().length()) {
            return v;
        }
        this.a = v;
        this.v();
        return this.a != 0 || this.V().length() == 0 ? -1 : 0;
    }

    @Override  // kotlinx.serialization.json.internal.a
    @l
    public String P(int v, int v1) {
        return this.V().e(v, v1);
    }

    @Override  // kotlinx.serialization.json.internal.a
    public boolean R() {
        int v = this.O();
        if(v < this.V().length() && v != -1 && this.V().charAt(v) == 44) {
            ++this.a;
            return true;
        }
        return false;
    }

    @l
    protected i V() {
        return this.g;
    }

    private final void W(int v) {
        char[] arr_c = this.V().b();
        if(v != 0) {
            kotlin.collections.l.w0(arr_c, arr_c, 0, this.a, this.a + v);
        }
        int v1 = this.V().length();
        while(v != v1) {
            int v2 = this.e.a(arr_c, v, v1 - v);
            if(v2 == -1) {
                this.V().f(v);
                this.f = -1;
                break;
            }
            v += v2;
        }
        this.a = 0;
    }

    @Override  // kotlinx.serialization.json.internal.a
    protected void e(int v, int v1) {
        StringBuilder stringBuilder0 = this.C();
        stringBuilder0.append(this.V().b(), v, v1 - v);
        L.o(stringBuilder0, "this.append(value, start…x, endIndex - startIndex)");
    }

    @Override  // kotlinx.serialization.json.internal.a
    public boolean f() {
        this.v();
        int v = this.a;
        int v1;
        while((v1 = this.J(v)) != -1) {
            int v2 = this.V().charAt(v1);
            if(v2 != 9 && v2 != 10 && v2 != 13 && v2 != 0x20) {
                this.a = v1;
                return this.G(((char)v2));
            }
            v = v1 + 1;
        }
        this.a = -1;
        return false;
    }

    @Override  // kotlinx.serialization.json.internal.a
    @l
    public String k() {
        this.o('\"');
        int v = this.a;
        int v1 = this.E('\"', v);
        if(v1 == -1) {
            int v2 = this.J(v);
            if(v2 != -1) {
                return this.r(this.V(), this.a, v2);
            }
            this.z(1);
            throw new y();
        }
        for(int v3 = v; v3 < v1; ++v3) {
            if(this.V().charAt(v3) == 92) {
                return this.r(this.V(), this.a, v3);
            }
        }
        this.a = v1 + 1;
        return this.P(v, v1);
    }

    @Override  // kotlinx.serialization.json.internal.a
    @m
    public String l(@l String s, boolean z) {
        L.p(s, "keyToMatch");
        return null;
    }

    @Override  // kotlinx.serialization.json.internal.a
    public byte m() {
        this.v();
        i i0 = this.V();
        int v = this.a;
        int v1;
        while((v1 = this.J(v)) != -1) {
            byte b = b.a(i0.charAt(v1));
            if(b != 3) {
                this.a = v1 + 1;
                return b;
            }
            v = v1 + 1;
        }
        this.a = -1;
        return 10;
    }

    @Override  // kotlinx.serialization.json.internal.a
    public void v() {
        int v = this.V().length() - this.a;
        if(v > this.f) {
            return;
        }
        this.W(v);
    }
}

