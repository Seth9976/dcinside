package com.fasterxml.jackson.databind.util;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class q {
    public static final class a implements Serializable {
        private final Set a;
        private final Set b;
        private static final long c = 1L;

        private a(Set set0, Set set1) {
            if(set0 == null) {
                set0 = Collections.emptySet();
            }
            this.a = set0;
            this.b = set1;
        }

        public static a a(Set set0, Set set1) {
            return new a(set0, set1);
        }

        // 去混淆评级： 低(30)
        public boolean b(Object object0) {
            return this.b != null && !this.b.contains(object0) || this.a.contains(object0);
        }
    }

    // 去混淆评级： 低(20)
    public static a a(Set set0, Set set1) {
        return set1 != null || set0 != null && !set0.isEmpty() ? a.a(set0, set1) : null;
    }

    public static Set b(Set set0, Set set1) {
        if(set0 == null) {
            return set1;
        }
        if(set1 == null) {
            return set0;
        }
        Set set2 = new HashSet();
        for(Object object0: set1) {
            String s = (String)object0;
            if(set0.contains(s)) {
                set2.add(s);
            }
        }
        return set2;
    }

    public static boolean c(Object object0, Collection collection0, Collection collection1) {
        if(collection0 == null && collection1 == null) {
            return false;
        }
        if(collection1 == null) {
            return collection0.contains(object0);
        }
        return collection0 == null ? !collection1.contains(object0) : !collection1.contains(object0) || collection0.contains(object0);
    }
}

