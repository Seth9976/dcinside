package org.jsoup.select;

import org.jsoup.nodes.o;
import org.jsoup.nodes.t;

public class j {
    static final boolean a;

    static {
    }

    public static a a(i i0, t t0) {
        t t1 = t0;
        int v = 0;
        while(t1 != null) {
            a i$a0 = i0.b(t1, v);
            if(i$a0 == a.e) {
                return i$a0;
            }
            if(i$a0 == a.a && t1.p() > 0) {
                t1 = t1.o(0);
                ++v;
            }
            else {
                while(t1.M() == null && v > 0) {
                    a i$a1 = a.a;
                    if(i$a0 == i$a1 || i$a0 == a.b) {
                        i$a0 = i0.a(t1, v);
                        if(i$a0 == a.e) {
                            return i$a0;
                        }
                    }
                    t t2 = t1.a0();
                    --v;
                    if(i$a0 == a.d) {
                        t1.d0();
                    }
                    i$a0 = i$a1;
                    t1 = t2;
                }
                if(i$a0 == a.a || i$a0 == a.b) {
                    i$a0 = i0.a(t1, v);
                    if(i$a0 == a.e) {
                        return i$a0;
                    }
                }
                if(t1 == t0) {
                    return i$a0;
                }
                t t3 = t1.M();
                if(i$a0 == a.d) {
                    t1.d0();
                }
                t1 = t3;
            }
        }
        return a.a;
    }

    public static void b(i i0, e e0) {
        org.jsoup.helper.i.o(i0);
        org.jsoup.helper.i.o(e0);
        for(Object object0: e0) {
            if(j.a(i0, ((o)object0)) == a.e) {
                break;
            }
        }
    }

    public static void c(l l0, t t0) {
        org.jsoup.helper.i.o(l0);
        org.jsoup.helper.i.o(t0);
        t t1 = t0;
        int v = 0;
        while(t1 != null) {
            t t2 = t1.a0();
            int v1 = t2 == null ? 0 : t2.p();
            t t3 = t1.M();
            l0.b(t1, v);
            if(t2 != null && !t1.F()) {
                if(v1 == t2.p()) {
                    t1 = t2.o(t1.o0());
                }
                else {
                    if(t3 == null) {
                        --v;
                        t1 = t2;
                    }
                    else {
                        t1 = t3;
                    }
                    continue;
                }
            }
            if(t1.p() > 0) {
                t1 = t1.o(0);
                ++v;
            }
            else {
                while(t1.M() == null && v > 0) {
                    l0.a(t1, v);
                    t1 = t1.a0();
                    --v;
                }
                l0.a(t1, v);
                if(t1 == t0) {
                    break;
                }
                t1 = t1.M();
            }
        }
    }

    public static void d(l l0, e e0) {
        org.jsoup.helper.i.o(l0);
        org.jsoup.helper.i.o(e0);
        for(Object object0: e0) {
            j.c(l0, ((o)object0));
        }
    }
}

