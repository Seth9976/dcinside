package j$.util;

class u extends l implements Set, java.util.Set {
    private static final long serialVersionUID = 0x801D92D18F9B8055L;

    @Override
    public boolean equals(Object object0) {
        return object0 == this || this.a.equals(object0);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}

