package com.iab.omid.library.unity3d.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.unity3d.adsession.p;
import com.iab.omid.library.unity3d.internal.c;
import com.iab.omid.library.unity3d.internal.e;
import com.iab.omid.library.unity3d.utils.h;
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
    private final Map h;
    private boolean i;

    public b() {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashSet();
        this.e = new HashSet();
        this.f = new HashSet();
        this.g = new HashMap();
        this.h = new WeakHashMap();
    }

    public View a(String s) {
        return (View)this.c.get(s);
    }

    private String b(View view0) {
        if(!view0.isAttachedToWindow()) {
            return "notAttached";
        }
        if(this.f(view0).booleanValue()) {
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

    public void c() {
        this.a.clear();
        this.b.clear();
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.i = false;
    }

    private void d(p p0) {
        for(Object object0: p0.u()) {
            this.e(((e)object0), p0);
        }
    }

    private void e(e e0, p p0) {
        View view0 = (View)e0.c().get();
        if(view0 == null) {
            return;
        }
        a b$a0 = (a)this.b.get(view0);
        if(b$a0 != null) {
            b$a0.b(p0.e());
            return;
        }
        a b$a1 = new a(e0, p0.e());
        this.b.put(view0, b$a1);
    }

    private Boolean f(View view0) {
        if(view0.hasWindowFocus()) {
            this.h.remove(view0);
            return false;
        }
        if(this.h.containsKey(view0)) {
            return (Boolean)this.h.get(view0);
        }
        this.h.put(view0, Boolean.FALSE);
        return false;
    }

    public String g(String s) {
        return (String)this.g.get(s);
    }

    public HashSet h() {
        return this.f;
    }

    public a i(View view0) {
        a b$a0 = (a)this.b.get(view0);
        if(b$a0 != null) {
            this.b.remove(view0);
        }
        return b$a0;
    }

    public HashSet j() {
        return this.e;
    }

    public String k(View view0) {
        if(this.a.size() == 0) {
            return null;
        }
        String s = (String)this.a.get(view0);
        if(s != null) {
            this.a.remove(view0);
        }
        return s;
    }

    public void l() {
        this.i = true;
    }

    public d m(View view0) {
        if(this.d.contains(view0)) {
            return d.a;
        }
        return this.i ? d.b : d.c;
    }

    public void n() {
        c c0 = c.e();
        if(c0 != null) {
            for(Object object0: c0.a()) {
                p p0 = (p)object0;
                View view0 = p0.s();
                if(p0.x()) {
                    String s = p0.e();
                    if(view0 == null) {
                        this.f.add(s);
                        this.g.put(s, "noAdView");
                    }
                    else {
                        String s1 = this.b(view0);
                        if(s1 == null) {
                            this.e.add(s);
                            this.a.put(view0, s);
                            this.d(p0);
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

    public boolean o(View view0) {
        if(this.h.containsKey(view0)) {
            this.h.put(view0, Boolean.TRUE);
            return false;
        }
        return true;
    }
}

