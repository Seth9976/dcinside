package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.deser.std.C;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.n;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.type.q;
import com.fasterxml.jackson.databind.util.j;
import j..util.DesugarCollections;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public abstract class l {
    static class a implements j {
        private final m a;
        private final int b;

        a(int v, m m0) {
            this.a = m0;
            this.b = v;
        }

        @Override  // com.fasterxml.jackson.databind.util.j
        public m a(q q0) {
            return this.a;
        }

        @Override  // com.fasterxml.jackson.databind.util.j
        public m b(q q0) {
            return this.a;
        }

        private void c(int v) {
            if(v != 1) {
                throw new IllegalArgumentException("Can not deserialize Singleton container from " + v + " entries");
            }
        }

        @Override  // com.fasterxml.jackson.databind.util.j
        public Object convert(Object object0) {
            if(object0 == null) {
                return null;
            }
            switch(this.b) {
                case 1: {
                    this.c(((Set)object0).size());
                    Object object1 = ((Set)object0).iterator().next();
                    return Collections.singleton(object1);
                }
                case 2: {
                    this.c(((List)object0).size());
                    return Collections.singletonList(((List)object0).get(0));
                }
                case 3: {
                    this.c(((Map)object0).size());
                    Object object2 = ((Map)object0).entrySet().iterator().next();
                    return Collections.singletonMap(((Map.Entry)object2).getKey(), ((Map.Entry)object2).getValue());
                }
                case 4: {
                    return DesugarCollections.unmodifiableSet(((Set)object0));
                }
                case 5: {
                    return DesugarCollections.unmodifiableList(((List)object0));
                }
                case 6: {
                    return DesugarCollections.unmodifiableMap(((Map)object0));
                }
                case 7: {
                    return DesugarCollections.synchronizedSet(((Set)object0));
                }
                case 8: {
                    return DesugarCollections.synchronizedCollection(((Collection)object0));
                }
                case 9: {
                    return DesugarCollections.synchronizedList(((List)object0));
                }
                case 10: {
                    return DesugarCollections.synchronizedMap(((Map)object0));
                }
                default: {
                    return object0;
                }
            }
        }
    }

    private static final int a = 1;
    private static final int b = 2;
    private static final int c = 3;
    private static final int d = 4;
    private static final int e = 5;
    private static final int f = 6;
    private static final int g = 7;
    private static final int h = 8;
    private static final int i = 9;
    private static final int j = 10;
    public static final int k = 11;
    private static final String l = "java.util.Collections$";
    private static final String m = "java.util.Arrays$";
    private static final String n = "java.util.ImmutableCollections$";

    // 去混淆评级： 低(20)
    private static String a(String s) {
        return s.startsWith("Singleton") ? s.substring(9) : null;
    }

    // 去混淆评级： 低(20)
    private static String b(String s) {
        return s.startsWith("Synchronized") ? s.substring(12) : null;
    }

    // 去混淆评级： 低(20)
    private static String c(String s) {
        return s.startsWith("Unmodifiable") ? s.substring(12) : null;
    }

    // 去混淆评级： 低(20)
    private static String d(String s) {
        return s.startsWith("java.util.Arrays$") ? s.substring(17) : null;
    }

    // 去混淆评级： 低(20)
    private static String e(String s) {
        return s.startsWith("java.util.ImmutableCollections$") ? s.substring(0x1F) : null;
    }

    // 去混淆评级： 低(20)
    private static String f(String s) {
        return s.startsWith("java.util.Collections$") ? s.substring(22) : null;
    }

    static a g(int v, m m0, Class class0) {
        return new a(v, m0.A(class0));
    }

    public static n h(h h0, m m0) throws o {
        a l$a0;
        String s = m0.g().getName();
        if(!s.startsWith("java.util.")) {
            return null;
        }
        String s1 = l.f(s);
        Class class0 = Set.class;
        Class class1 = List.class;
        if(s1 != null) {
            String s2 = l.c(s1);
            if(s2 == null) {
                String s3 = l.a(s1);
                if(s3 == null) {
                    String s4 = l.b(s1);
                    if(s4 == null) {
                        l$a0 = null;
                    }
                    else if(s4.endsWith("Set")) {
                        l$a0 = l.g(7, m0, class0);
                    }
                    else if(s4.endsWith("List")) {
                        l$a0 = l.g(9, m0, class1);
                    }
                    else if(s4.endsWith("Collection")) {
                        l$a0 = l.g(8, m0, Collection.class);
                    }
                    else {
                        l$a0 = null;
                    }
                }
                else if(s3.endsWith("Set")) {
                    l$a0 = l.g(1, m0, class0);
                }
                else if(s3.endsWith("List")) {
                    l$a0 = l.g(2, m0, class1);
                }
                else {
                    l$a0 = null;
                }
            }
            else if(s2.endsWith("Set")) {
                l$a0 = l.g(4, m0, class0);
            }
            else if(s2.endsWith("List")) {
                l$a0 = l.g(5, m0, class1);
            }
            else {
                l$a0 = null;
            }
            return l$a0 != null ? new C(l$a0) : null;
        }
        String s5 = l.d(s);
        if(s5 != null) {
            return s5.contains("List") ? new C(l.g(11, m0, class1)) : null;
        }
        String s6 = l.e(s);
        if(s6 != null) {
            if(s6.contains("List")) {
                return new C(l.g(11, m0, class1));
            }
            if(s6.contains("Set")) {
                return new C(l.g(4, m0, class0));
            }
        }
        return null;
    }

    public static n i(h h0, m m0) throws o {
        a l$a0;
        String s = m0.g().getName();
        String s1 = l.f(s);
        Class class0 = Map.class;
        if(s1 == null) {
            String s5 = l.e(s);
            l$a0 = s5 == null || !s5.contains("Map") ? null : l.g(6, m0, class0);
        }
        else {
            String s2 = l.c(s1);
            if(s2 == null) {
                String s3 = l.a(s1);
                if(s3 == null) {
                    String s4 = l.b(s1);
                    l$a0 = s4 == null || !s4.contains("Map") ? null : l.g(10, m0, class0);
                }
                else if(s3.contains("Map")) {
                    l$a0 = l.g(3, m0, class0);
                }
                else {
                    l$a0 = null;
                }
            }
            else if(s2.contains("Map")) {
                l$a0 = l.g(6, m0, class0);
            }
            else {
                l$a0 = null;
            }
        }
        return l$a0 != null ? new C(l$a0) : null;
    }
}

