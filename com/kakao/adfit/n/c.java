package com.kakao.adfit.n;

import com.kakao.adfit.ads.na.m.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.text.v;

public final class c {
    private final Function1 a;
    private int b;
    private int c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private final Map h;
    private List i;
    private final String j;

    public c(f m$f0, Function1 function10) {
        L.p(m$f0, "asset");
        L.p(function10, "sendTracking");
        super();
        this.a = function10;
        this.b = m$f0.a();
        this.c = m$f0.d();
        this.j = m$f0.e().b();
        HashMap hashMap0 = new HashMap();
        ArrayList arrayList0 = new ArrayList();
        List list0 = m$f0.e().d();
        if(list0 == null) {
            list0 = u.H();
        }
        for(Object object0: list0) {
            b b0 = (b)object0;
            String s = b0.a();
            if(s != null && s.length() != 0) {
                String s1 = b0.c();
                if(s1 != null && s1.length() != 0) {
                    String s2 = b0.a();
                    if(s2 != null) {
                        switch(s2) {
                            case "firstQuartile": {
                                arrayList0.add(new a(25.0f, b0.c()));
                                continue;
                            }
                            case "midpoint": {
                                arrayList0.add(new a(50.0f, b0.c()));
                                continue;
                            }
                            case "progress": {
                                String s3 = b0.b();
                                if(s3 == null) {
                                    continue;
                                }
                                String s4 = v.G5(s3).toString();
                                if(s4 == null) {
                                    continue;
                                }
                                d a$d0 = this.a(s4);
                                if(a$d0 == null) {
                                    continue;
                                }
                                arrayList0.add(new a(a$d0, b0.c()));
                                continue;
                            }
                            case "thirdQuartile": {
                                arrayList0.add(new a(75.0f, b0.c()));
                                continue;
                            }
                            case "thirtySeconds": {
                                arrayList0.add(new a(30000, b0.c()));
                                continue;
                            }
                        }
                    }
                    String s5 = b0.a();
                    ArrayList arrayList1 = hashMap0.get(s5);
                    if(arrayList1 == null) {
                        arrayList1 = new ArrayList();
                        hashMap0.put(s5, arrayList1);
                    }
                    arrayList1.add(b0.c());
                }
            }
        }
        this.h = hashMap0;
        for(Object object1: arrayList0) {
            ((a)object1).a().a(this.b);
        }
        this.i = arrayList0;
        if(this.b > 0 && this.c > 0) {
            this.d = true;
        }
    }

    private final d a(String s) {
        if(v.N1(s, "%", false, 2, null)) {
            String s1 = s.substring(0, s.length() - 1);
            L.o(s1, "this as java.lang.String…ing(startIndex, endIndex)");
            Float float0 = v.N0(s1);
            return float0 != null ? new com.kakao.adfit.n.a.c(((float)float0)) : null;
        }
        return new com.kakao.adfit.n.a.b(((int)com.kakao.adfit.n.f.a(s)));
    }

    public final void a(int v) {
        if(!this.d && this.b != v) {
            this.b = v;
            List list0 = this.i;
            for(Object object0: list0) {
                ((a)object0).a().a(v);
            }
            this.i = list0;
        }
    }

    public final boolean a() {
        return this.f;
    }

    public final void b(int v) {
        if(this.d && !this.f) {
            int v1 = this.c;
            if(v1 >= v) {
                return;
            }
            if(v1 == 0) {
                for(Object object0: this.i) {
                    a a0 = (a)object0;
                    if(a0.a().a() <= v) {
                        this.a.invoke(a0.b());
                    }
                }
            }
            else {
                for(Object object1: this.i) {
                    a a1 = (a)object1;
                    int v2 = this.c + 1;
                    int v3 = a1.a().a();
                    if(v2 <= v3 && v3 <= v) {
                        this.a.invoke(a1.b());
                    }
                }
            }
            this.c = v;
        }
    }

    public final boolean b() {
        return this.d;
    }

    public final void c() {
        if(this.d && !this.f) {
            int v = this.b;
            if(this.c < v) {
                this.b(v);
            }
            this.f = true;
            this.e = false;
            this.g = false;
            this.c = 0;
            List list0 = (List)this.h.get("complete");
            if(list0 != null) {
                for(Object object0: list0) {
                    this.a.invoke(((String)object0));
                }
            }
        }
    }

    public final void d() {
        if(this.f) {
            return;
        }
        if(this.j != null && this.j.length() > 0) {
            this.a.invoke(this.j);
        }
    }

    public final void e() {
        List list0 = (List)this.h.get("mute");
        if(list0 != null) {
            for(Object object0: list0) {
                this.a.invoke(((String)object0));
            }
        }
    }

    public final void f() {
        if(this.e && this.d && !this.f) {
            this.e = false;
            List list0 = (List)this.h.get("pause");
            if(list0 != null) {
                for(Object object0: list0) {
                    this.a.invoke(((String)object0));
                }
            }
        }
    }

    public final void g() {
        this.g = true;
    }

    public final void h() {
        if(!this.e && this.d && !this.f) {
            this.e = true;
            List list0 = (List)this.h.get("resume");
            if(list0 != null) {
                for(Object object0: list0) {
                    this.a.invoke(((String)object0));
                }
            }
        }
    }

    public final void i() {
        if(this.f) {
            return;
        }
        if(!this.d) {
            this.d = true;
            List list0 = (List)this.h.get("start");
            if(list0 != null) {
                for(Object object0: list0) {
                    String s = (String)object0;
                    if(v.W2(s, "[VX_START_TYPE]", false, 2, null)) {
                        s = v.l2(s, "[VX_START_TYPE]", (this.g ? "VIDEO_MANUAL_START" : "VIDEO_AUTO_START"), false, 4, null);
                    }
                    this.a.invoke(s);
                }
            }
            return;
        }
        this.e = true;
    }

    public final void j() {
        List list0 = (List)this.h.get("unmute");
        if(list0 != null) {
            for(Object object0: list0) {
                this.a.invoke(((String)object0));
            }
        }
    }

    public final void k() {
        if(this.d && this.f) {
            this.d = false;
            this.e = false;
            this.f = false;
            this.g = false;
            this.c = 0;
        }
    }
}

