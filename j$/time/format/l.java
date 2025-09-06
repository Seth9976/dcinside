package j$.time.format;

import j..time.b;

final class l implements f {
    private final f a;
    private final int b;
    private final char c;

    l(f f0, int v, char c) {
        this.a = f0;
        this.b = v;
        this.c = c;
    }

    @Override  // j$.time.format.f
    public final boolean l(y y0, StringBuilder stringBuilder0) {
        int v = stringBuilder0.length();
        if(!this.a.l(y0, stringBuilder0)) {
            return false;
        }
        int v2 = stringBuilder0.length() - v;
        int v3 = this.b;
        if(v2 > v3) {
            throw new b("Cannot print as output of " + v2 + " characters exceeds pad width of " + v3);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        for(int v1 = 0; v1 < v3 - v2; ++v1) {
            stringBuilder0.insert(v, this.c);
        }
        return true;
    }

    @Override  // j$.time.format.f
    public final int n(w w0, CharSequence charSequence0, int v) {
        boolean z = w0.l();
        if(v > charSequence0.length()) {
            throw new IndexOutOfBoundsException();
        }
        if(v == charSequence0.length()) {
            return ~v;
        }
        int v1 = this.b + v;
        if(v1 > charSequence0.length()) {
            if(z) {
                return ~v;
            }
            v1 = charSequence0.length();
        }
        int v2;
        for(v2 = v; v2 < v1 && w0.b(charSequence0.charAt(v2), this.c); ++v2) {
        }
        CharSequence charSequence1 = charSequence0.subSequence(0, v1);
        int v3 = this.a.n(w0, charSequence1, v2);
        return v3 == v1 || !z ? v3 : ~(v + v2);
    }

    @Override
    public final String toString() {
        return this.c == 0x20 ? "Pad(" + this.a + "," + this.b + ")" : "Pad(" + this.a + "," + this.b + (",\'" + this.c + "\')");
    }
}

