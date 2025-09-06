package androidx.datastore.core;

final class Data extends State {
    private final Object a;
    private final int b;

    public Data(Object object0, int v) {
        super(null);
        this.a = object0;
        this.b = v;
    }

    public final void a() {
        if((this.a == null ? 0 : this.a.hashCode()) != this.b) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
    }

    public final int b() {
        return this.b;
    }

    public final Object c() {
        return this.a;
    }
}

