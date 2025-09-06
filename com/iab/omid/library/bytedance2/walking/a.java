package com.iab.omid.library.bytedance2.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.bytedance2.internal.e;
import com.iab.omid.library.bytedance2.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

public class a {
    public static class com.iab.omid.library.bytedance2.walking.a.a {
        private final e a;
        private final ArrayList b;

        public com.iab.omid.library.bytedance2.walking.a.a(e e0, String s) {
            this.b = new ArrayList();
            this.a = e0;
            this.a(s);
        }

        public e a() {
            return this.a;
        }

        public void a(String s) {
            this.b.add(s);
        }

        public ArrayList b() {
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

    public a() {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashSet();
        this.e = new HashSet();
        this.f = new HashSet();
        this.g = new HashMap();
        this.h = new WeakHashMap();
    }

    private String a(View view0) {
        if(!view0.isAttachedToWindow()) {
            return "notAttached";
        }
        if(this.b(view0).booleanValue()) {
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

    private void a(com.iab.omid.library.bytedance2.adsession.a a0) {
        for(Object object0: a0.d()) {
            this.a(((e)object0), a0);
        }
    }

    private void a(e e0, com.iab.omid.library.bytedance2.adsession.a a0) {
        View view0 = (View)e0.c().get();
        if(view0 == null) {
            return;
        }
        com.iab.omid.library.bytedance2.walking.a.a a$a0 = (com.iab.omid.library.bytedance2.walking.a.a)this.b.get(view0);
        if(a$a0 != null) {
            a$a0.a(a0.getAdSessionId());
            return;
        }
        com.iab.omid.library.bytedance2.walking.a.a a$a1 = new com.iab.omid.library.bytedance2.walking.a.a(e0, a0.getAdSessionId());
        this.b.put(view0, a$a1);
    }

    public View a(String s) {
        return (View)this.c.get(s);
    }

    public void a() {
        this.a.clear();
        this.b.clear();
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.i = false;
    }

    private Boolean b(View view0) {
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

    public String b(String s) {
        return (String)this.g.get(s);
    }

    public HashSet b() {
        return this.f;
    }

    public com.iab.omid.library.bytedance2.walking.a.a c(View view0) {
        com.iab.omid.library.bytedance2.walking.a.a a$a0 = (com.iab.omid.library.bytedance2.walking.a.a)this.b.get(view0);
        if(a$a0 != null) {
            this.b.remove(view0);
        }
        return a$a0;
    }

    public HashSet c() {
        return this.e;
    }

    public String d(View view0) {
        if(this.a.size() == 0) {
            return null;
        }
        String s = (String)this.a.get(view0);
        if(s != null) {
            this.a.remove(view0);
        }
        return s;
    }

    public void d() {
        this.i = true;
    }

    public c e(View view0) {
        if(this.d.contains(view0)) {
            return c.a;
        }
        return this.i ? c.b : c.c;
    }

    public void e() {
        com.iab.omid.library.bytedance2.internal.c c0 = com.iab.omid.library.bytedance2.internal.c.c();
        if(c0 != null) {
            for(Object object0: c0.a()) {
                com.iab.omid.library.bytedance2.adsession.a a0 = (com.iab.omid.library.bytedance2.adsession.a)object0;
                View view0 = a0.c();
                if(a0.f()) {
                    String s = a0.getAdSessionId();
                    if(view0 == null) {
                        this.f.add(s);
                        this.g.put(s, "noAdView");
                    }
                    else {
                        String s1 = this.a(view0);
                        if(s1 == null) {
                            this.e.add(s);
                            this.a.put(view0, s);
                            this.a(a0);
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

    public boolean f(View view0) {
        if(this.h.containsKey(view0)) {
            this.h.put(view0, Boolean.TRUE);
            return false;
        }
        return true;
    }
}

