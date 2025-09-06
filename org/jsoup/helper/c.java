package org.jsoup.helper;

import j..util.DesugarCollections;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import org.jsoup.internal.n;

class c {
    private static final Map a = null;
    private static final String b = "; ";
    private static final String c = "Cookie";
    private static final String d = "Cookie2";

    static {
        c.a = DesugarCollections.unmodifiableMap(new HashMap());
    }

    static void a(d f$d0, HttpURLConnection httpURLConnection0) throws IOException {
        HashSet hashSet0;
        Set set1;
        LinkedHashSet linkedHashSet0 = c.c(f$d0);
        Set set0 = null;
        for(Object object0: f$d0.k0().get(c.b(f$d0.a), c.a).entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            List list0 = (List)map$Entry0.getValue();
            if(list0 != null && list0.size() != 0) {
                String s = (String)map$Entry0.getKey();
                if("Cookie".equals(s)) {
                    set1 = set0;
                    hashSet0 = linkedHashSet0;
                }
                else {
                    if(!"Cookie2".equals(s)) {
                        continue;
                    }
                    hashSet0 = new HashSet();
                    set1 = hashSet0;
                }
                hashSet0.addAll(list0);
                set0 = set1;
            }
        }
        if(linkedHashSet0.size() > 0) {
            httpURLConnection0.addRequestProperty("Cookie", n.m(linkedHashSet0, "; "));
        }
        if(set0 != null && set0.size() > 0) {
            httpURLConnection0.addRequestProperty("Cookie2", n.m(set0, "; "));
        }
    }

    static URI b(URL uRL0) throws IOException {
        try {
            return uRL0.toURI();
        }
        catch(URISyntaxException uRISyntaxException0) {
            MalformedURLException malformedURLException0 = new MalformedURLException(uRISyntaxException0.getMessage());
            malformedURLException0.initCause(uRISyntaxException0);
            throw malformedURLException0;
        }
    }

    private static LinkedHashSet c(org.jsoup.b.d b$d0) {
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        for(Object object0: b$d0.J().entrySet()) {
            linkedHashSet0.add(((String)((Map.Entry)object0).getKey()) + "=" + ((String)((Map.Entry)object0).getValue()));
        }
        return linkedHashSet0;
    }

    static void d(d f$d0, URL uRL0, Map map0) throws IOException {
        f$d0.k0().put(c.b(uRL0), map0);
    }
}

