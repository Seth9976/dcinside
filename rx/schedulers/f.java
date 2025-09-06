package rx.schedulers;

public final class f {
    private final long a;
    private final Object b;

    public f(long v, Object object0) {
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
        if(!(object0 instanceof f)) {
            return false;
        }
        if(this.a == ((f)object0).a) {
            Object object1 = ((f)object0).b;
            return this.b == object1 || this.b != null && this.b.equals(object1);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int v = (((int)(this.a ^ this.a >>> 0x20)) + 0x1F) * 0x1F;
        return this.b == null ? v : v + this.b.hashCode();
    }

    @Override
    public String toString() {
        return String.format("Timestamped(timestampMillis = %d, value = %s)", this.a, this.b.toString());
    }
}

