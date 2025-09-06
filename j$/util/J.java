package j$.util;

final class j extends f implements Set, java.util.Set {
    private static final long serialVersionUID = 0x6C3C27902EEDF3CL;

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        Object object1 = this.b;
        return this.a.equals(object0);
    }

    @Override
    public final int hashCode() {
        synchronized(this.b) {
        }
        return this.a.hashCode();
    }
}

