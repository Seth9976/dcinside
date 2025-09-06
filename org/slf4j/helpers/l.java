package org.slf4j.helpers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.ILoggerFactory;
import org.slf4j.a;

public class l implements ILoggerFactory {
    boolean a;
    final Map b;
    final LinkedBlockingQueue c;

    public l() {
        this.a = false;
        this.b = new HashMap();
        this.c = new LinkedBlockingQueue();
    }

    @Override  // org.slf4j.ILoggerFactory
    public a a(String s) {
        synchronized(this) {
            a a0 = (k)this.b.get(s);
            if(a0 == null) {
                a0 = new k(s, this.c, this.a);
                this.b.put(s, a0);
            }
            return a0;
        }
    }

    public void b() {
        this.b.clear();
        this.c.clear();
    }

    public LinkedBlockingQueue c() {
        return this.c;
    }

    public List d() {
        return new ArrayList(this.b.keySet());
    }

    public List e() {
        return new ArrayList(this.b.values());
    }

    public void f() {
        this.a = true;
    }
}

