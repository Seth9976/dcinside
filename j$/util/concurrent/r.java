package j$.util.concurrent;

final class r extends l {
    r e;
    r f;
    r g;
    r h;
    boolean i;

    r(int v, Object object0, Object object1, l l0, r r0) {
        super(v, object0, object1, l0);
        this.e = r0;
    }

    @Override  // j$.util.concurrent.l
    final l a(int v, Object object0) {
        return this.b(v, object0, null);
    }

    final r b(int v, Object object0, Class class0) {
        if(object0 != null) {
            r r0 = this;
            do {
                r r1 = r0.f;
                r r2 = r0.g;
                int v1 = r0.a;
                if(v1 > v) {
                    r0 = r1;
                }
                else if(v1 >= v) {
                    Object object1 = r0.b;
                    if(object1 == object0 || object1 != null && object0.equals(object1)) {
                        return r0;
                    }
                    if(r1 == null) {
                        r0 = r2;
                        continue;
                    }
                    else if(r2 != null) {
                        if(class0 == null) {
                            class0 = ConcurrentHashMap.c(object0);
                            if(class0 != null) {
                                goto label_14;
                            }
                            goto label_19;
                        }
                    label_14:
                        int v2 = object1 == null || object1.getClass() != class0 ? 0 : ((Comparable)object0).compareTo(object1);
                        if(v2 == 0) {
                        label_19:
                            r r3 = r2.b(v, object0, class0);
                            if(r3 != null) {
                                return r3;
                            }
                        }
                        else if(v2 >= 0) {
                            r1 = r2;
                            r0 = r1;
                        }
                    }
                }
                else {
                    r0 = r2;
                }
            }
            while(r0 != null);
            return null;
        }
        return null;
    }
}

