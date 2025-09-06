package org.bson.codecs.pojo;

import S3.e;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import org.bson.codecs.configuration.a;

final class v implements s {
    private final l a;
    private final Map b;
    private final Map c;
    private final Object[] d;
    private Object e;

    v(l l0) {
        this.a = l0;
        if(l0.i().isEmpty()) {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = l0.e();
            return;
        }
        this.b = new HashMap();
        this.c = new HashMap();
        for(int v = 0; v < l0.i().size(); ++v) {
            if(l0.d() == null || ((int)l0.d()) != v) {
                String s = ((e)l0.i().get(v)).value();
                this.c.put(s, v);
            }
            else {
                this.c.put("_id", l0.d());
            }
        }
        this.d = new Object[this.c.size()];
    }

    @Override  // org.bson.codecs.pojo.s
    public void a(Object object0, J j0) {
        if(this.e != null) {
            j0.g().Q(this.e, object0);
            return;
        }
        if(!this.c.isEmpty()) {
            String s = j0.k();
            if(!this.c.containsKey(s)) {
                s = j0.f();
            }
            Integer integer0 = (Integer)this.c.get(s);
            if(integer0 != null) {
                this.d[((int)integer0)] = object0;
            }
            this.c.remove(s);
        }
        if(this.c.isEmpty()) {
            this.b();
            return;
        }
        this.b.put(j0, object0);
    }

    private void b() {
        try {
            this.e = this.a.f(this.d);
        }
        catch(Exception exception0) {
            throw new a(exception0.getMessage(), exception0);
        }
        for(Object object0: this.b.entrySet()) {
            this.c(((J)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue());
        }
    }

    private void c(J j0, Object object0) {
        this.a(object0, j0);
    }

    @Override  // org.bson.codecs.pojo.s
    public Object getInstance() {
        if(this.e == null) {
            try {
                for(Object object0: this.c.entrySet()) {
                    this.d[((int)(((Integer)((Map.Entry)object0).getValue())))] = null;
                }
                this.b();
                return this.e;
            }
            catch(a a0) {
            }
            throw new a(String.format("Could not construct new instance of: %s. Missing the following properties: %s", this.a.j().getSimpleName(), this.c.keySet()), a0);
        }
        return this.e;
    }
}

