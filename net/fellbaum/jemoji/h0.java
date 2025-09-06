package net.fellbaum.jemoji;

import com.fasterxml.jackson.core.p;
import com.fasterxml.jackson.databind.type.j;
import com.fasterxml.jackson.databind.type.q;
import com.fasterxml.jackson.databind.x;
import com.google.common.collect.N0;
import j..io.BufferedReaderRetargetClass;
import j..util.Collection.-EL;
import j..util.Comparator.-CC;
import j..util.DesugarArrays;
import j..util.DesugarCollections;
import j..util.List.-EL;
import j..util.Map.-EL;
import j..util.Optional;
import j..util.function.Function.-CC;
import j..util.stream.Collector;
import j..util.stream.Collectors;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.regex.Pattern;

public final class H0 {
    private static final String a = "/emoji_sources/emojis.json";
    private static final Map b;
    private static final Map c;
    private static final List d;
    private static final Map e;
    private static Pattern f;
    private static final Pattern g;
    private static final Map h;

    static {
        H0.e = new EnumMap(K1.class);
        H0.g = Pattern.compile("[\\p{Alpha}\\p{Z}]");
        H0.h = new HashMap();
        HashSet hashSet0 = new HashSet();
        hashSet0.addAll(q0.a);
        hashSet0.addAll(r0.a);
        H0.b = DesugarCollections.unmodifiableMap(((Map)Collection.-EL.stream(hashSet0).collect(Collectors.toMap(new D0(), Function.-CC.identity()))));
        H0.d = DesugarCollections.unmodifiableList(((List)Collection.-EL.stream(hashSet0).sorted(Comparator.-CC.reverseOrder()).collect(Collectors.toList())));
        H0.c = (Map)Collection.-EL.stream(hashSet0).collect(H0.B());
    }

    static Optional A(y y0, String s) {
        E0 e00 = new E0();
        return Optional.ofNullable(((Map)Map.-EL.computeIfAbsent(H0.h, y0, e00)).get(s));
    }

    private static Collector B() {
        return Collectors.groupingBy(new B0(), new N0(), Collectors.collectingAndThen(Collectors.toList(), new C0()));
    }

    public static Pattern C() {
        if(H0.f == null) {
            H0.f = Pattern.compile(((String)Collection.-EL.stream(H0.d).map(new G0()).collect(Collectors.joining("|"))));
        }
        return H0.f;
    }

    // 去混淆评级： 低(20)
    public static boolean D(String s) {
        return L1.d(s) ? false : H0.b.containsKey(s);
    }

    // 检测为 Lambda 实现
    private static boolean E(d0 d00, f f0) [...]

    // 检测为 Lambda 实现
    private static boolean F(q1 q10, f f0) [...]

    // 去混淆评级： 低(20)
    // 检测为 Lambda 实现
    private static boolean G(String s, String s1, Map map0) [...]

    private static Optional H(String s, String s1, Map map0) {
        return L1.b(map0, s, s1);
    }

    private static Map I(K1 k10) {
        HashMap hashMap0 = new HashMap();
        for(Object object0: H0.d) {
            f f0 = (f)object0;
            for(Object object1: ((Collection)k10.a().apply(f0))) {
                hashMap0.put(((String)object1), f0);
            }
        }
        return DesugarCollections.unmodifiableMap(hashMap0);
    }

    private static Map J(y y0) {
        String s = H0.P(("/emoji_sources/description/" + y0.a() + ".json"));
        j j0 = q.j0().O(HashMap.class, String.class, String.class);
        try {
            return (Map)new x().l2(s, j0);
        }
        catch(p p0) {
            throw new RuntimeException(p0);
        }
    }

    private static Integer K(f f0) {
        return f0.j().codePointAt(0);
    }

    private static List L(List list0) {
        List.-EL.sort(list0, Comparator.-CC.reverseOrder());
        return list0;
    }

    private static String M(f f0) {
        return "(" + Pattern.quote(f0.j()) + ")";
    }

    private static String N(String s, f f0) [...] // Inlined contents

    private static String O(String s, f f0) [...] // Inlined contents

    private static String P(String s) {
        try(InputStream inputStream0 = H0.class.getResourceAsStream(s)) {
            if(inputStream0 == null) {
                return null;
            }
            try(InputStreamReader inputStreamReader0 = new InputStreamReader(inputStream0, StandardCharsets.UTF_8); BufferedReader bufferedReader0 = new BufferedReader(inputStreamReader0)) {
                return (String)BufferedReaderRetargetClass.lines(bufferedReader0).collect(Collectors.joining("\r\n"));
            }
        }
        catch(IOException iOException0) {
            throw new RuntimeException(iOException0);
        }
    }

    public static String Q(String s) {
        return H0.R(s, Collections.emptyList());
    }

    public static String R(String s, Collection collection0) {
        if(L1.d(s)) {
            return "";
        }
        int[] arr_v = L1.f(s);
        long v = (long)arr_v.length;
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v1 = 0; ((long)v1) < v; ++v1) {
            int v2 = arr_v[v1];
            stringBuilder0.appendCodePoint(v2);
            List list0 = (List)H0.c.get(v2);
            if(list0 != null) {
                Iterator iterator0 = list0.iterator();
            label_12:
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    f f0 = (f)object0;
                    int[] arr_v1 = L1.f(f0.j());
                    int v3 = arr_v1.length;
                    if(((long)(v1 + v3)) <= v) {
                        for(int v4 = 0; v4 < v3 && arr_v[v1 + v4] == arr_v1[v4]; ++v4) {
                            if(v4 == v3 - 1) {
                                v1 += v3 - 1;
                                stringBuilder0.delete(stringBuilder0.length() - Character.charCount(v2), stringBuilder0.length());
                                if(collection0.contains(f0)) {
                                    stringBuilder0.append(f0.j());
                                }
                                break label_12;
                            }
                        }
                    }
                }
            }
        }
        return stringBuilder0.toString();
    }

    public static String S(String s, f[] arr_f) {
        return H0.R(s, Arrays.asList(arr_f));
    }

    public static String T(String s, Collection collection0) {
        HashSet hashSet0 = new HashSet(H0.d);
        hashSet0.removeAll(collection0);
        return H0.R(s, hashSet0);
    }

    public static String U(String s, f[] arr_f) {
        return H0.T(s, Arrays.asList(arr_f));
    }

    public static String V(String s, String s1) {
        return H0.X(s, s1, H0.d);
    }

    public static String W(String s, Function function0) {
        return H0.Z(s, function0, H0.d);
    }

    public static String X(String s, String s1, Collection collection0) {
        return H0.Z(s, new A0(s1), collection0);
    }

    public static String Y(String s, String s1, f[] arr_f) {
        return H0.Z(s, new u0(s1), Arrays.asList(arr_f));
    }

    public static String Z(String s, Function function0, Collection collection0) {
        if(L1.d(s)) {
            return "";
        }
        int[] arr_v = L1.f(s);
        long v = (long)arr_v.length;
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v1 = 0; ((long)v1) < v; ++v1) {
            int v2 = arr_v[v1];
            stringBuilder0.appendCodePoint(v2);
            List list0 = (List)H0.c.get(v2);
            if(list0 != null) {
                Iterator iterator0 = list0.iterator();
            label_12:
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    f f0 = (f)object0;
                    int[] arr_v1 = L1.f(f0.j());
                    int v3 = arr_v1.length;
                    if(((long)(v1 + v3)) <= v) {
                        for(int v4 = 0; v4 < v3 && arr_v[v1 + v4] == arr_v1[v4]; ++v4) {
                            if(v4 == v3 - 1) {
                                v1 += v3 - 1;
                                stringBuilder0.delete(stringBuilder0.length() - Character.charCount(v2), stringBuilder0.length());
                                if(collection0.contains(f0)) {
                                    stringBuilder0.append(((String)function0.apply(f0)));
                                }
                                else {
                                    stringBuilder0.append(f0.j());
                                }
                                break label_12;
                            }
                        }
                    }
                }
            }
        }
        return stringBuilder0.toString();
    }

    public static String a0(String s, Function function0, f[] arr_f) {
        return H0.Z(s, function0, Arrays.asList(arr_f));
    }

    public static String c(String s, f f0) {
        return s;
    }

    public static String j(String s, f f0) {
        return s;
    }

    public static boolean m(String s) {
        if(L1.d(s)) {
            return false;
        }
        new ArrayList();
        int[] arr_v = L1.f(s);
        long v = (long)arr_v.length;
        for(int v1 = 0; ((long)v1) < v; ++v1) {
            List list0 = (List)H0.c.get(((int)arr_v[v1]));
            if(list0 != null) {
                for(Object object0: list0) {
                    int[] arr_v1 = L1.f(((f)object0).j());
                    int v2 = arr_v1.length;
                    if(((long)(v1 + v2)) <= v) {
                        for(int v3 = 0; v3 < v2 && arr_v[v1 + v3] == arr_v1[v3]; ++v3) {
                            if(v3 == v2 - 1) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static Set n(String s) {
        return DesugarCollections.unmodifiableSet(new HashSet(H0.o(s)));
    }

    public static List o(String s) {
        if(L1.d(s)) {
            return Collections.emptyList();
        }
        ArrayList arrayList0 = new ArrayList();
        int[] arr_v = L1.f(s);
        long v = (long)arr_v.length;
        for(int v1 = 0; ((long)v1) < v; ++v1) {
            List list0 = (List)H0.c.get(((int)arr_v[v1]));
            if(list0 != null) {
                Iterator iterator0 = list0.iterator();
            label_10:
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    f f0 = (f)object0;
                    int[] arr_v1 = L1.f(f0.j());
                    int v2 = arr_v1.length;
                    if(((long)(v1 + v2)) <= v) {
                        for(int v3 = 0; v3 < v2 && arr_v[v1 + v3] == arr_v1[v3]; ++v3) {
                            if(v3 == v2 - 1) {
                                arrayList0.add(f0);
                                v1 += v2 - 1;
                                break label_10;
                            }
                        }
                    }
                }
            }
        }
        return DesugarCollections.unmodifiableList(arrayList0);
    }

    public static List p(String s) {
        int v4;
        if(L1.d(s)) {
            return Collections.emptyList();
        }
        ArrayList arrayList0 = new ArrayList();
        int[] arr_v = L1.f(s);
        long v = (long)arr_v.length;
        int v2 = 0;
        for(int v1 = 0; ((long)v1) < v; ++v1) {
            int v3 = arr_v[v1];
            List list0 = (List)H0.c.get(v3);
            if(list0 == null) {
                v4 = Character.charCount(v3);
            }
            else {
                Iterator iterator0 = list0.iterator();
            alab1:
                while(true) {
                    if(!iterator0.hasNext()) {
                        v4 = Character.charCount(v3);
                        break;
                    }
                    Object object0 = iterator0.next();
                    f f0 = (f)object0;
                    int[] arr_v1 = L1.f(f0.j());
                    int v5 = arr_v1.length;
                    if(((long)(v1 + v5)) <= v) {
                        for(int v6 = 0; v6 < v5 && arr_v[v1 + v6] == arr_v1[v6]; ++v6) {
                            if(v6 == v5 - 1) {
                                arrayList0.add(new G1(f0, v2, v1));
                                v1 += v5 - 1;
                                v4 = f0.j().length();
                                break alab1;
                            }
                        }
                    }
                }
            }
            v2 += v4;
        }
        return DesugarCollections.unmodifiableList(arrayList0);
    }

    public static Set q() {
        return new HashSet(H0.d);
    }

    public static Set r(d0 d00) {
        return (Set)Collection.-EL.stream(H0.d).filter((f f0) -> f0.l() == d00).collect(Collectors.toSet());
    }

    public static Set s(q1 q10) {
        return (Set)Collection.-EL.stream(H0.d).filter((f f0) -> f0.s() == q10).collect(Collectors.toSet());
    }

    public static List t() {
        return H0.d;
    }

    public static Optional u(String s) {
        if(L1.d(s)) {
            return Optional.empty();
        }
        String s1 = L1.e(s);
        String s2 = L1.a(s);
        return DesugarArrays.stream(K1.values()).map(new v0()).filter((Map map0) -> // 去混淆评级： 低(20)
        map0.containsKey(s2) || map0.containsKey(s1)).map(new x0(s2, s1)).findAny().flatMap(Function.-CC.identity());
    }

    public static Optional v(String s) {
        if(L1.d(s)) {
            return Optional.empty();
        }
        String s1 = L1.a(s);
        return L1.b(H0.z(K1.b), s1, L1.e(s));
    }

    public static Optional w(String s) {
        if(L1.d(s)) {
            return Optional.empty();
        }
        String s1 = L1.a(s);
        return L1.b(H0.z(K1.c), s1, L1.e(s));
    }

    public static Optional x(String s) {
        if(L1.d(s)) {
            return Optional.empty();
        }
        String s1 = L1.a(s);
        return L1.b(H0.z(K1.d), s1, L1.e(s));
    }

    // 去混淆评级： 低(20)
    public static Optional y(String s) {
        return L1.d(s) ? Optional.empty() : Optional.ofNullable(H0.b.get(s));
    }

    private static Map z(K1 k10) {
        F0 f00 = new F0();
        return (Map)Map.-EL.computeIfAbsent(H0.e, k10, f00);
    }
}

