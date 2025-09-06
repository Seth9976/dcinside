package androidx.recyclerview.widget;

import java.util.List;

class OpReorderer {
    interface Callback {
        UpdateOp a(int arg1, int arg2, int arg3, Object arg4);

        void b(UpdateOp arg1);
    }

    final Callback a;

    OpReorderer(Callback opReorderer$Callback0) {
        this.a = opReorderer$Callback0;
    }

    private int a(List list0) {
        int v = list0.size() - 1;
        boolean z = false;
        while(v >= 0) {
            if(((UpdateOp)list0.get(v)).a != 8) {
                z = true;
            }
            else if(z) {
                return v;
            }
            --v;
        }
        return -1;
    }

    void b(List list0) {
        int v;
        while((v = this.a(list0)) != -1) {
            this.d(list0, v, v + 1);
        }
    }

    private void c(List list0, int v, UpdateOp adapterHelper$UpdateOp0, int v1, UpdateOp adapterHelper$UpdateOp1) {
        int v2 = adapterHelper$UpdateOp0.d;
        int v3 = adapterHelper$UpdateOp1.b;
        int v4 = v2 >= v3 ? 0 : -1;
        int v5 = adapterHelper$UpdateOp0.b;
        if(v5 < v3) {
            ++v4;
        }
        if(v3 <= v5) {
            adapterHelper$UpdateOp0.b = v5 + adapterHelper$UpdateOp1.d;
        }
        int v6 = adapterHelper$UpdateOp1.b;
        if(v6 <= v2) {
            adapterHelper$UpdateOp0.d = v2 + adapterHelper$UpdateOp1.d;
        }
        adapterHelper$UpdateOp1.b = v6 + v4;
        list0.set(v, adapterHelper$UpdateOp1);
        list0.set(v1, adapterHelper$UpdateOp0);
    }

    private void d(List list0, int v, int v1) {
        Object object0 = list0.get(v);
        Object object1 = list0.get(v1);
        switch(((UpdateOp)object1).a) {
            case 1: {
                this.c(list0, v, ((UpdateOp)object0), v1, ((UpdateOp)object1));
                return;
            }
            case 2: {
                this.e(list0, v, ((UpdateOp)object0), v1, ((UpdateOp)object1));
                return;
            }
            case 4: {
                this.f(list0, v, ((UpdateOp)object0), v1, ((UpdateOp)object1));
            }
        }
    }

    void e(List list0, int v, UpdateOp adapterHelper$UpdateOp0, int v1, UpdateOp adapterHelper$UpdateOp1) {
        boolean z1;
        int v2 = adapterHelper$UpdateOp0.b;
        int v3 = adapterHelper$UpdateOp0.d;
        boolean z = false;
        if(v2 >= v3) {
            if(adapterHelper$UpdateOp1.b != v3 + 1 || adapterHelper$UpdateOp1.d != v2 - v3) {
                z1 = true;
            }
            else {
                z1 = true;
                z = true;
            }
        }
        else if(adapterHelper$UpdateOp1.b == v2 && adapterHelper$UpdateOp1.d == v3 - v2) {
            z1 = false;
            z = true;
        }
        else {
            z1 = false;
        }
        int v4 = adapterHelper$UpdateOp1.b;
        if(v3 < v4) {
            adapterHelper$UpdateOp1.b = v4 - 1;
        }
        else {
            int v5 = adapterHelper$UpdateOp1.d;
            if(v3 < v4 + v5) {
                adapterHelper$UpdateOp1.d = v5 - 1;
                adapterHelper$UpdateOp0.a = 2;
                adapterHelper$UpdateOp0.d = 1;
                if(adapterHelper$UpdateOp1.d == 0) {
                    list0.remove(v1);
                    this.a.b(adapterHelper$UpdateOp1);
                }
                return;
            }
        }
        int v6 = adapterHelper$UpdateOp0.b;
        int v7 = adapterHelper$UpdateOp1.b;
        UpdateOp adapterHelper$UpdateOp2 = null;
        if(v6 <= v7) {
            adapterHelper$UpdateOp1.b = v7 + 1;
        }
        else {
            int v8 = adapterHelper$UpdateOp1.d;
            if(v6 < v7 + v8) {
                adapterHelper$UpdateOp2 = this.a.a(2, v6 + 1, v7 + v8 - v6, null);
                adapterHelper$UpdateOp1.d = adapterHelper$UpdateOp0.b - adapterHelper$UpdateOp1.b;
            }
        }
        if(z) {
            list0.set(v, adapterHelper$UpdateOp1);
            list0.remove(v1);
            this.a.b(adapterHelper$UpdateOp0);
            return;
        }
        if(z1) {
            if(adapterHelper$UpdateOp2 != null) {
                int v9 = adapterHelper$UpdateOp0.b;
                if(v9 > adapterHelper$UpdateOp2.b) {
                    adapterHelper$UpdateOp0.b = v9 - adapterHelper$UpdateOp2.d;
                }
                int v10 = adapterHelper$UpdateOp0.d;
                if(v10 > adapterHelper$UpdateOp2.b) {
                    adapterHelper$UpdateOp0.d = v10 - adapterHelper$UpdateOp2.d;
                }
            }
            int v11 = adapterHelper$UpdateOp0.b;
            if(v11 > adapterHelper$UpdateOp1.b) {
                adapterHelper$UpdateOp0.b = v11 - adapterHelper$UpdateOp1.d;
            }
            int v12 = adapterHelper$UpdateOp0.d;
            if(v12 > adapterHelper$UpdateOp1.b) {
                adapterHelper$UpdateOp0.d = v12 - adapterHelper$UpdateOp1.d;
            }
        }
        else {
            if(adapterHelper$UpdateOp2 != null) {
                int v13 = adapterHelper$UpdateOp0.b;
                if(v13 >= adapterHelper$UpdateOp2.b) {
                    adapterHelper$UpdateOp0.b = v13 - adapterHelper$UpdateOp2.d;
                }
                int v14 = adapterHelper$UpdateOp0.d;
                if(v14 >= adapterHelper$UpdateOp2.b) {
                    adapterHelper$UpdateOp0.d = v14 - adapterHelper$UpdateOp2.d;
                }
            }
            int v15 = adapterHelper$UpdateOp0.b;
            if(v15 >= adapterHelper$UpdateOp1.b) {
                adapterHelper$UpdateOp0.b = v15 - adapterHelper$UpdateOp1.d;
            }
            int v16 = adapterHelper$UpdateOp0.d;
            if(v16 >= adapterHelper$UpdateOp1.b) {
                adapterHelper$UpdateOp0.d = v16 - adapterHelper$UpdateOp1.d;
            }
        }
        list0.set(v, adapterHelper$UpdateOp1);
        if(adapterHelper$UpdateOp0.b == adapterHelper$UpdateOp0.d) {
            list0.remove(v1);
        }
        else {
            list0.set(v1, adapterHelper$UpdateOp0);
        }
        if(adapterHelper$UpdateOp2 != null) {
            list0.add(v, adapterHelper$UpdateOp2);
        }
    }

    void f(List list0, int v, UpdateOp adapterHelper$UpdateOp0, int v1, UpdateOp adapterHelper$UpdateOp1) {
        UpdateOp adapterHelper$UpdateOp3;
        int v2 = adapterHelper$UpdateOp0.d;
        int v3 = adapterHelper$UpdateOp1.b;
        UpdateOp adapterHelper$UpdateOp2 = null;
        if(v2 < v3) {
            adapterHelper$UpdateOp1.b = v3 - 1;
            adapterHelper$UpdateOp3 = null;
        }
        else {
            int v4 = adapterHelper$UpdateOp1.d;
            if(v2 < v3 + v4) {
                adapterHelper$UpdateOp1.d = v4 - 1;
                adapterHelper$UpdateOp3 = this.a.a(4, adapterHelper$UpdateOp0.b, 1, adapterHelper$UpdateOp1.c);
            }
            else {
                adapterHelper$UpdateOp3 = null;
            }
        }
        int v5 = adapterHelper$UpdateOp0.b;
        int v6 = adapterHelper$UpdateOp1.b;
        if(v5 <= v6) {
            adapterHelper$UpdateOp1.b = v6 + 1;
        }
        else {
            int v7 = adapterHelper$UpdateOp1.d;
            if(v5 < v6 + v7) {
                int v8 = v6 + v7 - v5;
                adapterHelper$UpdateOp2 = this.a.a(4, v5 + 1, v8, adapterHelper$UpdateOp1.c);
                adapterHelper$UpdateOp1.d -= v8;
            }
        }
        list0.set(v1, adapterHelper$UpdateOp0);
        if(adapterHelper$UpdateOp1.d > 0) {
            list0.set(v, adapterHelper$UpdateOp1);
        }
        else {
            list0.remove(v);
            this.a.b(adapterHelper$UpdateOp1);
        }
        if(adapterHelper$UpdateOp3 != null) {
            list0.add(v, adapterHelper$UpdateOp3);
        }
        if(adapterHelper$UpdateOp2 != null) {
            list0.add(v, adapterHelper$UpdateOp2);
        }
    }
}

