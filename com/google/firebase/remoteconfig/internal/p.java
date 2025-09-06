package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.BiConsumer;
import com.google.firebase.remoteconfig.w;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

public class p {
    private final Set a;
    private final Executor b;
    private final g c;
    private final g d;
    @VisibleForTesting(otherwise = 3)
    public static final Charset e;
    static final Pattern f;
    static final Pattern g;

    static {
        p.e = Charset.forName("UTF-8");
        p.f = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        p.g = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public p(Executor executor0, g g0, g g1) {
        this.a = new HashSet();
        this.b = executor0;
        this.c = g0;
        this.d = g1;
    }

    public void b(BiConsumer biConsumer0) {
        synchronized(this.a) {
            this.a.add(biConsumer0);
        }
    }

    private void c(String s, h h0) {
        if(h0 == null) {
            return;
        }
        synchronized(this.a) {
            for(Object object0: this.a) {
                o o0 = () -> ((BiConsumer)object0).accept(s, h0);
                this.b.execute(o0);
            }
        }
    }

    public Map d() {
        HashSet hashSet0 = new HashSet();
        hashSet0.addAll(p.j(this.c));
        hashSet0.addAll(p.j(this.d));
        Map map0 = new HashMap();
        for(Object object0: hashSet0) {
            ((HashMap)map0).put(((String)object0), this.q(((String)object0)));
        }
        return map0;
    }

    public boolean e(String s) {
        String s1 = p.p(this.c, s);
        if(s1 != null) {
            if(p.f.matcher(s1).matches()) {
                this.c(s, p.g(this.c));
                return true;
            }
            if(p.g.matcher(s1).matches()) {
                this.c(s, p.g(this.c));
                return false;
            }
        }
        String s2 = p.p(this.d, s);
        if(s2 != null) {
            if(p.f.matcher(s2).matches()) {
                return true;
            }
            if(p.g.matcher(s2).matches()) {
                return false;
            }
        }
        p.s(s, "Boolean");
        return false;
    }

    public byte[] f(String s) {
        String s1 = p.p(this.c, s);
        if(s1 != null) {
            this.c(s, p.g(this.c));
            return s1.getBytes(p.e);
        }
        String s2 = p.p(this.d, s);
        if(s2 != null) {
            return s2.getBytes(p.e);
        }
        p.s(s, "ByteArray");
        return com.google.firebase.remoteconfig.p.r;
    }

    @Nullable
    private static h g(g g0) {
        return g0.g();
    }

    public double h(String s) {
        Double double0 = p.i(this.c, s);
        if(double0 != null) {
            this.c(s, p.g(this.c));
            return (double)double0;
        }
        Double double1 = p.i(this.d, s);
        if(double1 != null) {
            return (double)double1;
        }
        p.s(s, "Double");
        return 0.0;
    }

    @Nullable
    private static Double i(g g0, String s) {
        h h0 = p.g(g0);
        if(h0 == null) {
            return null;
        }
        try {
            return h0.g().getDouble(s);
        }
        catch(JSONException unused_ex) {
            return null;
        }
    }

    private static Set j(g g0) {
        Set set0 = new HashSet();
        h h0 = p.g(g0);
        if(h0 == null) {
            return set0;
        }
        Iterator iterator0 = h0.g().keys();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            set0.add(((String)object0));
        }
        return set0;
    }

    public Set k(String s) {
        if(s == null) {
            s = "";
        }
        Set set0 = new TreeSet();
        h h0 = p.g(this.c);
        if(h0 != null) {
            ((TreeSet)set0).addAll(p.l(s, h0));
        }
        h h1 = p.g(this.d);
        if(h1 != null) {
            ((TreeSet)set0).addAll(p.l(s, h1));
        }
        return set0;
    }

    private static TreeSet l(String s, h h0) {
        TreeSet treeSet0 = new TreeSet();
        Iterator iterator0 = h0.g().keys();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            String s1 = (String)object0;
            if(s1.startsWith(s)) {
                treeSet0.add(s1);
            }
        }
        return treeSet0;
    }

    public long m(String s) {
        Long long0 = p.n(this.c, s);
        if(long0 != null) {
            this.c(s, p.g(this.c));
            return (long)long0;
        }
        Long long1 = p.n(this.d, s);
        if(long1 != null) {
            return (long)long1;
        }
        p.s(s, "Long");
        return 0L;
    }

    @Nullable
    private static Long n(g g0, String s) {
        h h0 = p.g(g0);
        if(h0 == null) {
            return null;
        }
        try {
            return h0.g().getLong(s);
        }
        catch(JSONException unused_ex) {
            return null;
        }
    }

    public String o(String s) {
        String s1 = p.p(this.c, s);
        if(s1 != null) {
            this.c(s, p.g(this.c));
            return s1;
        }
        String s2 = p.p(this.d, s);
        if(s2 != null) {
            return s2;
        }
        p.s(s, "String");
        return "";
    }

    @Nullable
    private static String p(g g0, String s) {
        h h0 = p.g(g0);
        if(h0 == null) {
            return null;
        }
        try {
            return h0.g().getString(s);
        }
        catch(JSONException unused_ex) {
            return null;
        }
    }

    public w q(String s) {
        String s1 = p.p(this.c, s);
        if(s1 != null) {
            this.c(s, p.g(this.c));
            return new y(s1, 2);
        }
        String s2 = p.p(this.d, s);
        if(s2 != null) {
            return new y(s2, 1);
        }
        p.s(s, "FirebaseRemoteConfigValue");
        return new y("", 0);
    }

    private static void s(String s, String s1) {
        Log.w("FirebaseRemoteConfig", String.format("No value of type \'%s\' exists for parameter key \'%s\'.", s1, s));
    }
}

