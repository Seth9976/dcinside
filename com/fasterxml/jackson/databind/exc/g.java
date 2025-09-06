package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.l;
import com.fasterxml.jackson.core.n;
import j..util.DesugarCollections;
import java.util.Collection;
import java.util.Iterator;

public abstract class g extends f {
    protected final Class j;
    protected final String k;
    protected final Collection l;
    protected transient String m;
    private static final int n = 1000;

    protected g(n n0, String s, l l0, Class class0, String s1, Collection collection0) {
        super(n0, s, l0);
        this.j = class0;
        this.k = s1;
        this.l = collection0;
    }

    @Deprecated
    protected g(String s, l l0, Class class0, String s1, Collection collection0) {
        this(null, s, l0, class0, s1, collection0);
    }

    public Collection J() {
        return this.l == null ? null : DesugarCollections.unmodifiableCollection(this.l);
    }

    public String K() {
        return this.k;
    }

    public Class L() {
        return this.j;
    }

    @Override  // com.fasterxml.jackson.core.p
    public String e() {
        String s = this.m;
        if(s == null && this.l != null) {
            StringBuilder stringBuilder0 = new StringBuilder(100);
            int v = this.l.size();
            if(v == 1) {
                stringBuilder0.append(" (one known property: \"");
                Object object0 = this.l.iterator().next();
                stringBuilder0.append(String.valueOf(object0));
                stringBuilder0.append('\"');
            }
            else {
                stringBuilder0.append(" (");
                stringBuilder0.append(v);
                stringBuilder0.append(" known properties: ");
                Iterator iterator0 = this.l.iterator();
                while(iterator0.hasNext()) {
                    stringBuilder0.append('\"');
                    Object object1 = iterator0.next();
                    stringBuilder0.append(String.valueOf(object1));
                    stringBuilder0.append('\"');
                    if(stringBuilder0.length() > 1000) {
                        stringBuilder0.append(" [truncated]");
                        break;
                    }
                    if(iterator0.hasNext()) {
                        stringBuilder0.append(", ");
                    }
                }
            }
            stringBuilder0.append("])");
            s = stringBuilder0.toString();
            this.m = s;
        }
        return s;
    }
}

