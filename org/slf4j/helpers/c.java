package org.slf4j.helpers;

import j..util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.slf4j.IMarkerFactory;
import org.slf4j.d;

public class c implements IMarkerFactory {
    private final ConcurrentMap a;

    public c() {
        this.a = new ConcurrentHashMap();
    }

    @Override  // org.slf4j.IMarkerFactory
    public d a(String s) {
        if(s == null) {
            throw new IllegalArgumentException("Marker name cannot be null");
        }
        d d0 = (d)this.a.get(s);
        if(d0 == null) {
            d0 = new b(s);
            d d1 = (d)this.a.putIfAbsent(s, d0);
            return d1 == null ? d0 : d1;
        }
        return d0;
    }

    @Override  // org.slf4j.IMarkerFactory
    public boolean b(String s) {
        return s == null ? false : this.a.remove(s) != null;
    }

    @Override  // org.slf4j.IMarkerFactory
    public d c(String s) {
        return new b(s);
    }

    @Override  // org.slf4j.IMarkerFactory
    public boolean d(String s) {
        return s == null ? false : this.a.containsKey(s);
    }
}

