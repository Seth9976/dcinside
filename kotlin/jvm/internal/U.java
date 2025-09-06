package kotlin.jvm.internal;

import A3.c;
import A3.e;
import A3.f;
import A3.g;
import A3.h;
import A3.i;
import A3.j;
import A3.k;
import A3.n;
import A3.o;
import A3.p;
import A3.q;
import A3.r;
import A3.s;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.V;
import kotlin.collections.Y;
import kotlin.h0;
import kotlin.jvm.functions.Function1;
import kotlin.r0;
import kotlin.reflect.d;
import kotlin.text.v;
import kotlin.y;
import y4.l;
import y4.m;
import z3.b;

@s0({"SMAP\nClassReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,205:1\n1567#2:206\n1598#2,4:207\n1261#2,4:211\n1246#2,4:217\n462#3:215\n412#3:216\n*S KotlinDebug\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference\n*L\n107#1:206\n107#1:207,4\n155#1:211,4\n163#1:217,4\n163#1:215\n163#1:216\n*E\n"})
public final class u implements t, d {
    @s0({"SMAP\nClassReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,205:1\n1#2:206\n*E\n"})
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @m
        public final String a(@l Class class0) {
            L.p(class0, "jClass");
            String s = null;
            if(!class0.isAnonymousClass() && !class0.isLocalClass()) {
                if(class0.isArray()) {
                    Class class1 = class0.getComponentType();
                    if(class1.isPrimitive()) {
                        String s1 = (String)u.f.get(class1.getName());
                        if(s1 != null) {
                            s = s1 + "Array";
                        }
                    }
                    return s == null ? "kotlin.Array" : s;
                }
                s = (String)u.f.get(class0.getName());
                return s == null ? class0.getCanonicalName() : s;
            }
            return null;
        }

        @m
        public final String b(@l Class class0) {
            L.p(class0, "jClass");
            String s = null;
            if(!class0.isAnonymousClass()) {
                if(class0.isLocalClass()) {
                    String s1 = class0.getSimpleName();
                    Method method0 = class0.getEnclosingMethod();
                    if(method0 != null) {
                        L.m(s1);
                        String s2 = v.r5(s1, method0.getName() + '$', null, 2, null);
                        if(s2 != null) {
                            return s2;
                        }
                    }
                    Constructor constructor0 = class0.getEnclosingConstructor();
                    if(constructor0 != null) {
                        L.m(s1);
                        return v.r5(s1, constructor0.getName() + '$', null, 2, null);
                    }
                    L.m(s1);
                    return v.q5(s1, '$', null, 2, null);
                }
                if(class0.isArray()) {
                    Class class1 = class0.getComponentType();
                    if(class1.isPrimitive()) {
                        String s3 = (String)u.g.get(class1.getName());
                        if(s3 != null) {
                            s = s3 + "Array";
                        }
                    }
                    return s == null ? "Array" : s;
                }
                s = (String)u.g.get(class0.getName());
                return s == null ? class0.getSimpleName() : s;
            }
            return null;
        }

        public final boolean c(@m Object object0, @l Class class0) {
            L.p(class0, "jClass");
            Map map0 = u.c;
            L.n(map0, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer integer0 = (Integer)map0.get(class0);
            if(integer0 != null) {
                return v0.B(object0, integer0.intValue());
            }
            if(class0.isPrimitive()) {
                class0 = b.g(b.i(class0));
            }
            return class0.isInstance(object0);
        }
    }

    @l
    private final Class a;
    @l
    public static final a b;
    @l
    private static final Map c;
    @l
    private static final HashMap d;
    @l
    private static final HashMap e;
    @l
    private static final HashMap f;
    @l
    private static final Map g;

    static {
        u.b = new a(null);
        int v = 0;
        Iterable iterable0 = kotlin.collections.u.O(new Class[]{A3.a.class, Function1.class, o.class, p.class, q.class, r.class, s.class, A3.t.class, A3.u.class, A3.v.class, A3.b.class, c.class, A3.d.class, e.class, f.class, g.class, h.class, i.class, j.class, k.class, A3.l.class, A3.m.class, n.class});
        ArrayList arrayList0 = new ArrayList(kotlin.collections.u.b0(iterable0, 10));
        for(Object object0: iterable0) {
            if(v < 0) {
                kotlin.collections.u.Z();
            }
            arrayList0.add(r0.a(((Class)object0), v));
            ++v;
        }
        u.c = Y.B0(arrayList0);
        HashMap hashMap0 = new HashMap();
        hashMap0.put("boolean", "kotlin.Boolean");
        hashMap0.put("char", "kotlin.Char");
        hashMap0.put("byte", "kotlin.Byte");
        hashMap0.put("short", "kotlin.Short");
        hashMap0.put("int", "kotlin.Int");
        hashMap0.put("float", "kotlin.Float");
        hashMap0.put("long", "kotlin.Long");
        hashMap0.put("double", "kotlin.Double");
        u.d = hashMap0;
        HashMap hashMap1 = new HashMap();
        hashMap1.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap1.put("java.lang.Character", "kotlin.Char");
        hashMap1.put("java.lang.Byte", "kotlin.Byte");
        hashMap1.put("java.lang.Short", "kotlin.Short");
        hashMap1.put("java.lang.Integer", "kotlin.Int");
        hashMap1.put("java.lang.Float", "kotlin.Float");
        hashMap1.put("java.lang.Long", "kotlin.Long");
        hashMap1.put("java.lang.Double", "kotlin.Double");
        u.e = hashMap1;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Object", "kotlin.Any");
        hashMap2.put("java.lang.String", "kotlin.String");
        hashMap2.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap2.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap2.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap2.put("java.lang.Number", "kotlin.Number");
        hashMap2.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap2.put("java.lang.Enum", "kotlin.Enum");
        hashMap2.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap2.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap2.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap2.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap2.put("java.util.List", "kotlin.collections.List");
        hashMap2.put("java.util.Set", "kotlin.collections.Set");
        hashMap2.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap2.put("java.util.Map", "kotlin.collections.Map");
        hashMap2.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap2.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap2.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap2.putAll(hashMap0);
        hashMap2.putAll(hashMap1);
        Collection collection0 = hashMap0.values();
        L.o(collection0, "<get-values>(...)");
        for(Object object1: collection0) {
            L.m(((String)object1));
            V v1 = r0.a(("kotlin.jvm.internal." + v.u5(((String)object1), '.', null, 2, null) + "CompanionObject"), ((String)object1) + ".Companion");
            hashMap2.put(v1.e(), v1.f());
        }
        for(Object object2: u.c.entrySet()) {
            hashMap2.put(((Class)((Map.Entry)object2).getKey()).getName(), "kotlin.Function" + ((Number)((Map.Entry)object2).getValue()).intValue());
        }
        u.f = hashMap2;
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(Y.j(hashMap2.size()));
        for(Object object3: hashMap2.entrySet()) {
            linkedHashMap0.put(((Map.Entry)object3).getKey(), v.u5(((String)((Map.Entry)object3).getValue()), '.', null, 2, null));
        }
        u.g = linkedHashMap0;
    }

    public u(@l Class class0) {
        L.p(class0, "jClass");
        super();
        this.a = class0;
    }

    @h0(version = "1.3")
    public static void A() {
    }

    @h0(version = "1.1")
    public static void B() {
    }

    @h0(version = "1.1")
    public static void C() {
    }

    @h0(version = "1.1")
    public static void D() {
    }

    @h0(version = "1.1")
    public static void E() {
    }

    @h0(version = "1.1")
    public static void F() {
    }

    @h0(version = "1.1")
    public static void G() {
    }

    @h0(version = "1.1")
    public static void H() {
    }

    @h0(version = "1.4")
    public static void I() {
    }

    @h0(version = "1.1")
    public static void J() {
    }

    @h0(version = "1.1")
    public static void K() {
    }

    @h0(version = "1.1")
    public static void L() {
    }

    @h0(version = "1.5")
    public static void M() {
    }

    @Override  // kotlin.reflect.d, kotlin.reflect.h
    @l
    public Collection b() {
        this.z();
        throw new y();
    }

    @Override  // kotlin.reflect.d
    public boolean d() {
        this.z();
        throw new y();
    }

    // 去混淆评级： 低(20)
    @Override  // kotlin.reflect.d
    public boolean equals(@m Object object0) {
        return object0 instanceof u && L.g(b.g(this), b.g(((d)object0)));
    }

    @Override  // kotlin.reflect.d
    @m
    public String g() {
        return u.b.a(this.q());
    }

    @Override  // kotlin.reflect.b
    @l
    public List getAnnotations() {
        this.z();
        throw new y();
    }

    @Override  // kotlin.reflect.d
    @l
    public Collection getConstructors() {
        this.z();
        throw new y();
    }

    @Override  // kotlin.reflect.d
    @l
    public List getTypeParameters() {
        this.z();
        throw new y();
    }

    @Override  // kotlin.reflect.d
    @m
    public kotlin.reflect.w getVisibility() {
        this.z();
        throw new y();
    }

    @Override  // kotlin.reflect.d
    public int hashCode() {
        return b.g(this).hashCode();
    }

    @Override  // kotlin.reflect.d
    public boolean isAbstract() {
        this.z();
        throw new y();
    }

    @Override  // kotlin.reflect.d
    public boolean isFinal() {
        this.z();
        throw new y();
    }

    @Override  // kotlin.reflect.d
    @h0(version = "1.1")
    public boolean isInstance(@m Object object0) {
        return u.b.c(object0, this.q());
    }

    @Override  // kotlin.reflect.d
    public boolean isOpen() {
        this.z();
        throw new y();
    }

    @Override  // kotlin.reflect.d
    @l
    public Collection j() {
        this.z();
        throw new y();
    }

    @Override  // kotlin.reflect.d
    @l
    public List l() {
        this.z();
        throw new y();
    }

    @Override  // kotlin.reflect.d
    @m
    public Object m() {
        this.z();
        throw new y();
    }

    @Override  // kotlin.reflect.d
    public boolean n() {
        this.z();
        throw new y();
    }

    @Override  // kotlin.reflect.d
    public boolean o() {
        this.z();
        throw new y();
    }

    @Override  // kotlin.jvm.internal.t
    @l
    public Class q() {
        return this.a;
    }

    @Override  // kotlin.reflect.d
    public boolean r() {
        this.z();
        throw new y();
    }

    @Override  // kotlin.reflect.d
    public boolean s() {
        this.z();
        throw new y();
    }

    @Override
    @l
    public String toString() {
        return this.q().toString() + " (Kotlin reflection is not available)";
    }

    @Override  // kotlin.reflect.d
    @m
    public String u() {
        return u.b.b(this.q());
    }

    @Override  // kotlin.reflect.d
    @l
    public List w() {
        this.z();
        throw new y();
    }

    @Override  // kotlin.reflect.d
    public boolean x() {
        this.z();
        throw new y();
    }

    private final Void z() {
        throw new z3.r();
    }
}

