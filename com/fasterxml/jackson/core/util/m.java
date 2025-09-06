package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.core.r;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class m extends l {
    protected final n[] i;
    protected final boolean j;
    protected int k;
    protected boolean l;

    protected m(boolean z, n[] arr_n) {
        boolean z1 = false;
        super(arr_n[0]);
        this.j = z;
        if(z && this.h.S3()) {
            z1 = true;
        }
        this.l = z1;
        this.i = arr_n;
        this.k = 1;
    }

    @Deprecated
    protected m(n[] arr_n) {
        this(false, arr_n);
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public n I4() throws IOException {
        if(this.h.Y() != r.k && this.h.Y() != r.m) {
            return this;
        }
        int v = 1;
        while(true) {
            while(true) {
            label_3:
                r r0 = this.m4();
                if(r0 == null) {
                    return this;
                }
                if(r0.i()) {
                    ++v;
                }
                else if(r0.h()) {
                    break;
                }
            }
            --v;
            if(v != 0) {
                goto label_3;
            }
            break;
        }
        return this;
    }

    protected void L4(List list0) {
        for(int v = this.k - 1; v < this.i.length; ++v) {
            n n0 = this.i[v];
            if(n0 instanceof m) {
                ((m)n0).L4(list0);
            }
            else {
                list0.add(n0);
            }
        }
    }

    public int M4() {
        return this.i.length;
    }

    @Deprecated
    public static m N4(n n0, n n1) {
        return m.O4(false, n0, n1);
    }

    public static m O4(boolean z, n n0, n n1) {
        if(!(n0 instanceof m) && !(n1 instanceof m)) {
            return new m(z, new n[]{n0, n1});
        }
        ArrayList arrayList0 = new ArrayList();
        if(n0 instanceof m) {
            ((m)n0).L4(arrayList0);
        }
        else {
            arrayList0.add(n0);
        }
        if(n1 instanceof m) {
            ((m)n1).L4(arrayList0);
            return new m(z, ((n[])arrayList0.toArray(new n[arrayList0.size()])));
        }
        arrayList0.add(n1);
        return new m(z, ((n[])arrayList0.toArray(new n[arrayList0.size()])));
    }

    protected r P4() throws IOException {
        while(true) {
            int v = this.k;
            n[] arr_n = this.i;
            if(v >= arr_n.length) {
                break;
            }
            this.k = v + 1;
            n n0 = arr_n[v];
            this.h = n0;
            if(this.j && n0.S3()) {
                return this.h.c1();
            }
            r r0 = this.h.m4();
            if(r0 != null) {
                return r0;
            }
        }
        return null;
    }

    protected boolean Q4() {
        int v = this.k;
        n[] arr_n = this.i;
        if(v < arr_n.length) {
            this.k = v + 1;
            this.h = arr_n[v];
            return true;
        }
        return false;
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public void close() throws IOException {
        do {
            this.h.close();
        }
        while(this.Q4());
    }

    @Override  // com.fasterxml.jackson.core.util.l
    public r m4() throws IOException {
        n n0 = this.h;
        if(n0 == null) {
            return null;
        }
        if(this.l) {
            this.l = false;
            return n0.Y();
        }
        r r0 = n0.m4();
        return r0 == null ? this.P4() : r0;
    }
}

