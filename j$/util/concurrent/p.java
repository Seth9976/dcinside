package j$.util.concurrent;

class p {
    l[] a;
    l b;
    o c;
    o d;
    int e;
    int f;
    int g;
    final int h;

    p(l[] arr_l, int v, int v1, int v2) {
        this.a = arr_l;
        this.h = v;
        this.e = v1;
        this.f = v1;
        this.g = v2;
        this.b = null;
    }

    final l a() {
        l l0 = this.b;
        if(l0 != null) {
            l0 = l0.d;
        }
        while(true) {
            if(l0 != null) {
                this.b = l0;
                return l0;
            }
            if(this.f >= this.g) {
                break;
            }
            l[] arr_l = this.a;
            if(arr_l == null) {
                break;
            }
            int v = arr_l.length;
            int v1 = this.e;
            if(v <= v1 || v1 < 0) {
                break;
            }
            l l1 = ConcurrentHashMap.k(arr_l, v1);
            if(l1 == null || l1.a >= 0) {
            label_33:
                l0 = l1;
            }
            else {
                if(l1 instanceof g) {
                    this.a = ((g)l1).e;
                    o o0 = this.d;
                    if(o0 == null) {
                        o0 = new o();  // 初始化器: Ljava/lang/Object;-><init>()V
                    }
                    else {
                        this.d = o0.d;
                    }
                    o0.c = arr_l;
                    o0.a = v;
                    o0.b = v1;
                    o0.d = this.c;
                    this.c = o0;
                    l0 = null;
                    continue;
                }
                else {
                    l0 = l1 instanceof q ? ((q)l1).f : null;
                    goto label_34;
                }
                goto label_33;
            }
        label_34:
            if(this.c == null) {
                int v6 = v1 + this.h;
                this.e = v6;
                if(v6 >= v) {
                    int v7 = this.f + 1;
                    this.f = v7;
                    this.e = v7;
                }
            }
            else {
                o o1;
                while((o1 = this.c) != null) {
                    int v2 = o1.a;
                    int v3 = this.e + v2;
                    this.e = v3;
                    if(v3 < v) {
                        break;
                    }
                    this.e = o1.b;
                    this.a = o1.c;
                    o1.c = null;
                    o o2 = o1.d;
                    o1.d = this.d;
                    this.c = o2;
                    this.d = o1;
                    v = v2;
                }
                if(o1 != null) {
                    continue;
                }
                int v4 = this.e + this.h;
                this.e = v4;
                if(v4 < v) {
                    continue;
                }
                int v5 = this.f + 1;
                this.f = v5;
                this.e = v5;
            }
        }
        this.b = null;
        return null;
    }
}

