package j$.time.format;

final class d implements f {
    private final char a;

    d(char c) {
        this.a = c;
    }

    @Override  // j$.time.format.f
    public final boolean l(y y0, StringBuilder stringBuilder0) {
        stringBuilder0.append(this.a);
        return true;
    }

    @Override  // j$.time.format.f
    public final int n(w w0, CharSequence charSequence0, int v) {
        if(v == charSequence0.length()) {
            return ~v;
        }
        int v1 = charSequence0.charAt(v);
        return v1 == this.a || !w0.k() && (Character.toUpperCase(((char)v1)) == Character.toUpperCase(this.a) || Character.toLowerCase(((char)v1)) == Character.toLowerCase(this.a)) ? v + 1 : ~v;
    }

    @Override
    public final String toString() {
        return this.a == 39 ? "\'\'" : "\'" + this.a + "\'";
    }
}

