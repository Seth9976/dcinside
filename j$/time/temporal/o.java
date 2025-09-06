package j$.time.temporal;

public final class o implements n {
    public final int a;
    public final int b;

    public o(int v, int v1) {
        this.a = v1;
        this.b = v;
        super();
    }

    @Override  // j$.time.temporal.n
    public final l z(l l0) {
        if(this.a != 0) {
            int v = l0.n(a.DAY_OF_WEEK);
            int v1 = this.b;
            if(v != v1) {
                int v2 = v1 - v;
                return v2 < 0 ? l0.l(((long)(-v2)), ChronoUnit.DAYS) : l0.l(((long)(7 - v2)), ChronoUnit.DAYS);
            }
            return l0;
        }
        int v3 = l0.n(a.DAY_OF_WEEK);
        int v4 = this.b;
        if(v3 != v4) {
            int v5 = v3 - v4;
            return v5 < 0 ? l0.d(((long)(-v5)), ChronoUnit.DAYS) : l0.d(((long)(7 - v5)), ChronoUnit.DAYS);
        }
        return l0;
    }
}

