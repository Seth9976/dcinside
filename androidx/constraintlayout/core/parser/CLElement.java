package androidx.constraintlayout.core.parser;

import androidx.annotation.NonNull;
import j..util.Objects;
import java.util.Arrays;

public class CLElement implements Cloneable {
    private final char[] a;
    protected long b;
    protected long c;
    protected CLContainer d;
    private int e;
    protected static int f = 80;
    protected static int g = 2;

    static {
    }

    public CLElement(char[] arr_c) {
        this.b = -1L;
        this.c = 0x7FFFFFFFFFFFFFFFL;
        this.a = arr_c;
    }

    protected void a(StringBuilder stringBuilder0, int v) {
        for(int v1 = 0; v1 < v; ++v1) {
            stringBuilder0.append(' ');
        }
    }

    @NonNull
    public CLElement b() {
        try {
            return (CLElement)super.clone();
        }
        catch(CloneNotSupportedException unused_ex) {
            throw new AssertionError();
        }
    }

    public String c() {
        String s = new String(this.a);
        if(s.length() < 1) {
            return "";
        }
        long v = this.c;
        if(v != 0x7FFFFFFFFFFFFFFFL) {
            return v < this.b ? s.substring(((int)this.b), ((int)this.b) + 1) : s.substring(((int)this.b), ((int)v) + 1);
        }
        return s.substring(((int)this.b), ((int)this.b) + 1);
    }

    @Override
    @NonNull
    public Object clone() throws CloneNotSupportedException {
        return this.b();
    }

    public CLElement d() {
        return this.d;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof CLElement)) {
            return false;
        }
        if(this.b != ((CLElement)object0).b) {
            return false;
        }
        if(this.c != ((CLElement)object0).c) {
            return false;
        }
        if(this.e != ((CLElement)object0).e) {
            return false;
        }
        return Arrays.equals(this.a, ((CLElement)object0).a) ? Objects.equals(this.d, ((CLElement)object0).d) : false;
    }

    protected String g() [...] // 潜在的解密器

    public long h() {
        return this.c;
    }

    @Override
    public int hashCode() {
        int v = ((Arrays.hashCode(this.a) * 0x1F + ((int)(this.b ^ this.b >>> 0x20))) * 0x1F + ((int)(this.c ^ this.c >>> 0x20))) * 0x1F;
        return this.d == null ? v * 0x1F + this.e : (v + this.d.hashCode()) * 0x1F + this.e;
    }

    // 去混淆评级： 低(20)
    public float j() {
        return this instanceof CLNumber ? ((CLNumber)this).j() : NaNf;
    }

    // 去混淆评级： 低(20)
    public int k() {
        return this instanceof CLNumber ? ((CLNumber)this).k() : 0;
    }

    public int l() {
        return this.e;
    }

    public long m() {
        return this.b;
    }

    protected String n() {
        String s = this.getClass().toString();
        return s.substring(s.lastIndexOf(46) + 1);
    }

    public boolean o() {
        return this.a != null && this.a.length >= 1;
    }

    public boolean p() {
        return this.c != 0x7FFFFFFFFFFFFFFFL;
    }

    public boolean q() {
        return this.b > -1L;
    }

    public boolean r() {
        return this.b == -1L;
    }

    public void t(CLContainer cLContainer0) {
        this.d = cLContainer0;
    }

    @Override
    public String toString() {
        if(this.b <= this.c && this.c != 0x7FFFFFFFFFFFFFFFL) {
            String s = new String(this.a).substring(((int)this.b), ((int)this.c) + 1);
            return this.n() + " (" + this.b + " : " + this.c + ") <<" + s + ">>";
        }
        return this.getClass() + " (INVALID, " + this.b + "-" + this.c + ")";
    }

    public void u(long v) {
        if(this.c != 0x7FFFFFFFFFFFFFFFL) {
            return;
        }
        this.c = v;
        CLContainer cLContainer0 = this.d;
        if(cLContainer0 != null) {
            cLContainer0.A(this);
        }
    }

    public void v(int v) {
        this.e = v;
    }

    public void x(long v) {
        this.b = v;
    }

    protected String y(int v, int v1) {
        return "";
    }

    protected String z() [...] // 潜在的解密器
}

