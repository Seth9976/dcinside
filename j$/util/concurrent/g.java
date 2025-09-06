package j$.util.concurrent;

final class g extends l {
    final l[] e;

    g(l[] arr_l) {
        super(-1, null, null);
        this.e = arr_l;
    }

    @Override  // j$.util.concurrent.l
    final l a(int v, Object object0) {
        l[] arr_l = this.e;
        while(arr_l.length != 0) {
            l l0 = ConcurrentHashMap.k(arr_l, arr_l.length - 1 & v);
            if(l0 == null) {
                break;
            }
        label_4:
            int v1 = l0.a;
            if(v1 == v && (l0.b == object0 || l0.b != null && object0.equals(l0.b))) {
                return l0;
            }
            if(v1 < 0) {
                if(l0 instanceof g) {
                    arr_l = ((g)l0).e;
                    continue;
                }
                return l0.a(v, object0);
            }
            l0 = l0.d;
            if(l0 == null) {
                break;
            }
            goto label_4;
        }
        return null;
    }
}

