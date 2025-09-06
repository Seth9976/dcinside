package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class t0 {
    private final ArrayList a;

    public t0(int v) {
        this.a = new ArrayList(v);
    }

    public void a(Object object0) {
        this.a.add(object0);
    }

    public void b(Object object0) {
        if(object0 == null) {
            return;
        }
        if(object0 instanceof Object[]) {
            if(((Object[])object0).length <= 0) {
                return;
            }
            this.a.ensureCapacity(this.a.size() + ((Object[])object0).length);
            Collections.addAll(this.a, ((Object[])object0));
            return;
        }
        if(object0 instanceof Collection) {
            this.a.addAll(((Collection)object0));
            return;
        }
        if(object0 instanceof Iterable) {
            for(Object object1: ((Iterable)object0)) {
                this.a.add(object1);
            }
            return;
        }
        if(!(object0 instanceof Iterator)) {
            throw new UnsupportedOperationException("Don\'t know how to spread " + object0.getClass());
        }
        while(((Iterator)object0).hasNext()) {
            Object object2 = ((Iterator)object0).next();
            this.a.add(object2);
        }
    }

    public int c() {
        return this.a.size();
    }

    public Object[] d(Object[] arr_object) {
        return this.a.toArray(arr_object);
    }
}

