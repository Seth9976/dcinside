package rx.schedulers;

public class e {
    private final long a;
    private final Object b;

    public e(long v, Object object0) {
        this.b = object0;
        this.a = v;
    }

    public long a() {
        return this.a;
    }

    public Object b() {
        return this.b;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null) {
            return false;
        }
        if(this.getClass() != object0.getClass()) {
            return false;
        }
        if(this.a != ((e)object0).a) {
            return false;
        }
        return this.b == null ? ((e)object0).b == null : this.b.equals(((e)object0).b);
    }

    @Override
    public int hashCode() {
        int v = (((int)(this.a ^ this.a >>> 0x20)) + 0x1F) * 0x1F;
        return this.b == null ? v : v + this.b.hashCode();
    }

    @Override
    public String toString() {
        return "TimeInterval [intervalInMilliseconds=" + this.a + ", value=" + this.b + "]";
    }
}

