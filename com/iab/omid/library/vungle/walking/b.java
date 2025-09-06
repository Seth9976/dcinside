package com.iab.omid.library.vungle.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.vungle.adsession.q;
import com.iab.omid.library.vungle.internal.c;
import com.iab.omid.library.vungle.internal.e;
import com.iab.omid.library.vungle.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

public class b {
    public static class a {
        private final e a;
        private final ArrayList b;

        public a(e e0, String s) {
            this.b = new ArrayList();
            this.a = e0;
            this.b(s);
        }

        public e a() {
            return this.a;
        }

        public void b(String s) {
            this.b.add(s);
        }

        public ArrayList c() {
            return this.b;
        }
    }

    private final HashMap a;
    private final HashMap b;
    private final HashMap c;
    private final HashSet d;
    private final HashSet e;
    private final HashSet f;
    private final HashMap g;
    private final HashSet h;
    private final Map i;
    private boolean j;

    public b() {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashSet();
        this.e = new HashSet();
        this.f = new HashSet();
        this.g = new HashMap();
        this.h = new HashSet();
        this.i = new WeakHashMap();
    }

    public View a(String s) {
        return (View)this.c.get(s);
    }

    private Boolean b(View view0) {
        if(view0.hasWindowFocus()) {
            this.i.remove(view0);
            return false;
        }
        if(this.i.containsKey(view0)) {
            return (Boolean)this.i.get(view0);
        }
        this.i.put(view0, Boolean.FALSE);
        return false;
    }

    private String c(View view0, boolean z) {
        if(!view0.isAttachedToWindow()) {
            return "notAttached";
        }
        if(this.b(view0).booleanValue() && !z) {
            return "noWindowFocus";
        }
        HashSet hashSet0 = new HashSet();
        while(view0 != null) {
            String s = h.a(view0);
            if(s != null) {
                return s;
            }
            hashSet0.add(view0);
            ViewParent viewParent0 = view0.getParent();
            view0 = viewParent0 instanceof View ? ((View)viewParent0) : null;
        }
        this.d.addAll(hashSet0);
        return null;
    }

    public void d() {
        this.a.clear();
        this.b.clear();
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.j = false;
        this.h.clear();
    }

    private void e(q q0) {
        for(Object object0: q0.s()) {
            this.f(((e)object0), q0);
        }
    }

    private void f(e e0, q q0) {
        View view0 = (View)e0.c().get();
        if(view0 == null) {
            return;
        }
        a b$a0 = (a)this.b.get(view0);
        if(b$a0 != null) {
            b$a0.b(q0.e());
            return;
        }
        a b$a1 = new a(e0, q0.e());
        this.b.put(view0, b$a1);
    }

    public a g(View view0) {
        a b$a0 = (a)this.b.get(view0);
        if(b$a0 != null) {
            this.b.remove(view0);
        }
        return b$a0;
    }

    public String h(String s) {
        return (String)this.g.get(s);
    }

    public HashSet i() {
        return this.f;
    }

    public String j(View view0) {
        if(this.a.size() == 0) {
            return null;
        }
        String s = (String)this.a.get(view0);
        if(s != null) {
            this.a.remove(view0);
        }
        return s;
    }

    public HashSet k() {
        return this.e;
    }

    public boolean l(String s) {
        return this.h.contains(s);
    }

    public d m(View view0) {
        if(this.d.contains(view0)) {
            return d.a;
        }
        return this.j ? d.b : d.c;
    }

    public void n() {
        this.j = true;
    }

    public void o() {
        c c0 = c.e();
        if(c0 != null) {
            for(Object object0: c0.a()) {
                q q0 = (q)object0;
                View view0 = q0.r();
                if(q0.u()) {
                    String s = q0.e();
                    if(view0 == null) {
                        this.f.add(s);
                        this.g.put(s, "noAdView");
                    }
                    else {
                        boolean z = h.e(view0);
                        if(z) {
                            this.h.add(s);
                        }
                        String s1 = this.c(view0, z);
                        if(s1 == null) {
                            this.e.add(s);
                            this.a.put(view0, s);
                            this.e(q0);
                        }
                        else {
                            if(s1 == "noWindowFocus") {
                                continue;
                            }
                            this.f.add(s);
                            this.c.put(s, view0);
                            this.g.put(s, s1);
                        }
                    }
                }
            }
        }
    }

    public boolean p(View view0) {
        if(this.i.containsKey(view0)) {
            this.i.put(view0, Boolean.TRUE);
            return false;
        }
        return true;
    }
}

