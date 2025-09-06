package j$.time.format;

final class m extends n {
    @Override  // j$.time.format.n
    protected final boolean c(char c, char c1) {
        return w.c(c, c1);
    }

    @Override  // j$.time.format.n
    protected final n e(String s, String s1, n n0) {
        return new m(s, s1, n0, 0);  // 初始化器: Lj$/time/format/n;-><init>(Ljava/lang/String;Ljava/lang/String;Lj$/time/format/n;I)V
    }

    @Override  // j$.time.format.n
    protected final boolean h(CharSequence charSequence0, int v, int v1) {
        int v2 = this.a.length();
        if(v2 > v1 - v) {
            return false;
        }
        for(int v3 = 0; v2 > 0; ++v3) {
            if(!w.c(this.a.charAt(v3), charSequence0.charAt(v))) {
                return false;
            }
            ++v;
            --v2;
        }
        return true;
    }
}

