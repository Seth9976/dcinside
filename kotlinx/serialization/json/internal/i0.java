package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.L;
import kotlin.text.v;
import kotlin.y;
import y4.l;
import y4.m;

public final class i0 extends a {
    @l
    private final String e;

    public i0(@l String s) {
        L.p(s, "source");
        super();
        this.e = s;
    }

    @Override  // kotlinx.serialization.json.internal.a
    public CharSequence D() {
        return this.V();
    }

    @Override  // kotlinx.serialization.json.internal.a
    public int J(int v) {
        return v < this.V().length() ? v : -1;
    }

    @Override  // kotlinx.serialization.json.internal.a
    public int O() {
        int v = this.a;
        if(v == -1) {
            return -1;
        }
    label_3:
        while(v < this.V().length()) {
            switch(this.V().charAt(v)) {
                case 9: 
                case 10: 
                case 13: 
                case 0x20: {
                    ++v;
                    continue;
                }
                default: {
                    break label_3;
                }
            }
        }
        this.a = v;
        return v;
    }

    @Override  // kotlinx.serialization.json.internal.a
    public boolean R() {
        int v = this.O();
        if(v != this.V().length() && v != -1 && this.V().charAt(v) == 44) {
            ++this.a;
            return true;
        }
        return false;
    }

    @l
    protected String V() {
        return this.e;
    }

    @Override  // kotlinx.serialization.json.internal.a
    public boolean f() {
        int v = this.a;
        if(v == -1) {
            return false;
        }
        while(v < this.V().length()) {
            int v1 = this.V().charAt(v);
            if(v1 != 9 && v1 != 10 && v1 != 13 && v1 != 0x20) {
                this.a = v;
                return this.G(((char)v1));
            }
            ++v;
        }
        this.a = v;
        return false;
    }

    @Override  // kotlinx.serialization.json.internal.a
    @l
    public String k() {
        this.o('\"');
        int v = this.a;
        int v1 = v.r3(this.V(), '\"', v, false, 4, null);
        if(v1 != -1) {
            for(int v2 = v; v2 < v1; ++v2) {
                if(this.V().charAt(v2) == 92) {
                    return this.r(this.V(), this.a, v2);
                }
            }
            this.a = v1 + 1;
            String s = this.V().substring(v, v1);
            L.o(s, "this as java.lang.String…ing(startIndex, endIndex)");
            return s;
        }
        this.z(1);
        throw new y();
    }

    @Override  // kotlinx.serialization.json.internal.a
    @m
    public String l(@l String s, boolean z) {
        String s1;
        L.p(s, "keyToMatch");
        int v = this.a;
        try {
            if(this.m() != 6) {
                this.a = v;
                return null;
            }
            if(!L.g((z ? this.k() : this.t()), s)) {
                this.a = v;
                return null;
            }
            if(this.m() != 5) {
                this.a = v;
                return null;
            }
            s1 = z ? this.q() : this.t();
        }
        catch(Throwable throwable0) {
            this.a = v;
            throw throwable0;
        }
        this.a = v;
        return s1;
    }

    @Override  // kotlinx.serialization.json.internal.a
    public byte m() {
        String s = this.V();
        while(this.a != -1 && this.a < s.length()) {
            int v = this.a;
            this.a = v + 1;
            byte b = b.a(s.charAt(v));
            if(b != 3) {
                return b;
            }
            if(false) {
                break;
            }
        }
        return 10;
    }

    @Override  // kotlinx.serialization.json.internal.a
    public void o(char c) {
        if(this.a == -1) {
            this.T(c);
        }
        String s = this.V();
        while(this.a < s.length()) {
            int v = this.a;
            this.a = v + 1;
            int v1 = s.charAt(v);
            if(v1 != 9 && v1 != 10 && v1 != 13 && v1 != 0x20) {
                if(v1 == c) {
                    return;
                }
                this.T(c);
            }
        }
        this.T(c);
    }
}

