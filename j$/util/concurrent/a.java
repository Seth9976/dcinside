package j$.util.concurrent;

abstract class a extends p {
    final ConcurrentHashMap i;
    l j;

    a(l[] arr_l, int v, int v1, ConcurrentHashMap concurrentHashMap0) {
        super(arr_l, v, 0, v1);
        this.i = concurrentHashMap0;
        this.a();
    }

    public final boolean hasMoreElements() {
        return this.b != null;
    }

    public final boolean hasNext() {
        return this.b != null;
    }

    public final void remove() {
        l l0 = this.j;
        if(l0 == null) {
            throw new IllegalStateException();
        }
        this.j = null;
        this.i.g(l0.b, null, null);
    }
}

