package com.google.common.collect;

import J1.b;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import o3.a;

@b(serializable = true)
@C1
final class q1 extends c4 implements Serializable {
    final Comparator[] c;
    private static final long d;

    q1(Iterable iterable0) {
        this.c = (Comparator[])p3.R(iterable0, new Comparator[0]);
    }

    q1(Comparator comparator0, Comparator comparator1) {
        this.c = new Comparator[]{comparator0, comparator1};
    }

    @Override  // com.google.common.collect.c4
    public int compare(@d4 Object object0, @d4 Object object1) {
        for(int v = 0; true; ++v) {
            Comparator[] arr_comparator = this.c;
            if(v >= arr_comparator.length) {
                break;
            }
            int v1 = arr_comparator[v].compare(object0, object1);
            if(v1 != 0) {
                return v1;
            }
        }
        return 0;
    }

    @Override
    public boolean equals(@a Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof q1 ? Arrays.equals(this.c, ((q1)object0).c) : false;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(this.c);
    }

    @Override
    public String toString() {
        return "Ordering.compound(" + Arrays.toString(this.c) + ")";
    }
}

