package j$.util.stream;

abstract class d {
    protected final int a;
    protected int b;
    protected int c;
    protected long[] d;

    protected d() {
        this.a = 4;
    }

    protected d(int v) {
        if(v < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + v);
        }
        this.a = Math.max(4, 0x20 - Integer.numberOfLeadingZeros(v - 1));
    }

    public abstract void clear();

    public final long count() {
        return this.c == 0 ? ((long)this.b) : this.d[this.c] + ((long)this.b);
    }
}

