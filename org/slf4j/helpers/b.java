package org.slf4j.helpers;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.slf4j.d;

public class b implements d {
    private final String a;
    private List b;
    private static final long c = 0x1908ED5291B507E7L;
    private static String d = "[ ";
    private static String e = " ]";
    private static String f = ", ";

    static {
    }

    b(String s) {
        this.b = new CopyOnWriteArrayList();
        if(s == null) {
            throw new IllegalArgumentException("A marker name cannot be null");
        }
        this.a = s;
    }

    @Override  // org.slf4j.d
    public void C3(d d0) {
        if(d0 == null) {
            throw new IllegalArgumentException("A null value cannot be added to a Marker as reference.");
        }
        if(this.d0(d0)) {
            return;
        }
        if(d0.d0(this)) {
            return;
        }
        this.b.add(d0);
    }

    @Override  // org.slf4j.d
    public boolean I2(d d0) {
        return this.b.remove(d0);
    }

    @Override  // org.slf4j.d
    public boolean contains(String s) {
        if(s == null) {
            throw new IllegalArgumentException("Other cannot be null");
        }
        if(this.a.equals(s)) {
            return true;
        }
        if(this.n3()) {
            for(Object object0: this.b) {
                if(((d)object0).contains(s)) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    @Override  // org.slf4j.d
    public boolean d0(d d0) {
        if(d0 == null) {
            throw new IllegalArgumentException("Other cannot be null");
        }
        if(this.equals(d0)) {
            return true;
        }
        if(this.n3()) {
            for(Object object0: this.b) {
                if(((d)object0).d0(d0)) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    @Override  // org.slf4j.d
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof d)) {
            return false;
        }
        String s = ((d)object0).getName();
        return this.a.equals(s);
    }

    @Override  // org.slf4j.d
    public String getName() {
        return this.a;
    }

    @Override  // org.slf4j.d
    public boolean hasChildren() {
        return this.n3();
    }

    @Override  // org.slf4j.d
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override  // org.slf4j.d
    public Iterator iterator() {
        return this.b.iterator();
    }

    @Override  // org.slf4j.d
    public boolean n3() {
        return this.b.size() > 0;
    }

    @Override
    public String toString() {
        if(!this.n3()) {
            return this.getName();
        }
        Iterator iterator0 = this.iterator();
        StringBuilder stringBuilder0 = new StringBuilder(this.getName());
        stringBuilder0.append(' ');
        stringBuilder0.append("[ ");
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            stringBuilder0.append(((d)object0).getName());
            if(iterator0.hasNext()) {
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append(" ]");
        return stringBuilder0.toString();
    }
}

