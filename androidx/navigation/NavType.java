package androidx.navigation;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.io.Serializable;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import y4.l;
import y4.m;
import z3.f;
import z3.n;

public abstract class NavType {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        @n
        public NavType a(@m String s, @m String s1) {
            NavType navType0 = NavType.d;
            if(L.g("integer", s)) {
                return navType0;
            }
            NavType navType1 = NavType.f;
            if(L.g("integer[]", s)) {
                return navType1;
            }
            NavType navType2 = NavType.g;
            if(L.g("long", s)) {
                return navType2;
            }
            NavType navType3 = NavType.h;
            if(L.g("long[]", s)) {
                return navType3;
            }
            NavType navType4 = NavType.k;
            if(L.g("boolean", s)) {
                return navType4;
            }
            NavType navType5 = NavType.l;
            if(L.g("boolean[]", s)) {
                return navType5;
            }
            NavType navType6 = NavType.m;
            if(L.g("string", s)) {
                return navType6;
            }
            NavType navType7 = NavType.n;
            if(L.g("string[]", s)) {
                return navType7;
            }
            NavType navType8 = NavType.i;
            if(L.g("float", s)) {
                return navType8;
            }
            NavType navType9 = NavType.j;
            if(L.g("float[]", s)) {
                return navType9;
            }
            NavType navType10 = NavType.e;
            if(L.g("reference", s)) {
                return navType10;
            }
            if(s != null && s.length() != 0) {
                try {
                    String s2 = !v.v2(s, ".", false, 2, null) || s1 == null ? s : s1 + s;
                    boolean z = v.N1(s, "[]", false, 2, null);
                    Class class0 = Serializable.class;
                    Class class1 = Parcelable.class;
                    if(z) {
                        s2 = s2.substring(0, s2.length() - 2);
                        L.o(s2, "this as java.lang.String…ing(startIndex, endIndex)");
                        Class class2 = Class.forName(s2);
                        if(class1.isAssignableFrom(class2)) {
                            return new ParcelableArrayType(class2);
                        }
                        if(class0.isAssignableFrom(class2)) {
                            return new SerializableArrayType(class2);
                        }
                    }
                    else {
                        Class class3 = Class.forName(s2);
                        if(class1.isAssignableFrom(class3)) {
                            return new ParcelableType(class3);
                        }
                        if(Enum.class.isAssignableFrom(class3)) {
                            return new EnumType(class3);
                        }
                        if(class0.isAssignableFrom(class3)) {
                            return new SerializableType(class3);
                        }
                    }
                    throw new IllegalArgumentException(s2 + " is not Serializable or Parcelable.");
                }
                catch(ClassNotFoundException classNotFoundException0) {
                }
                throw new RuntimeException(classNotFoundException0);
            }
            return navType6;
        }

        @RestrictTo({Scope.b})
        @l
        @n
        public final NavType b(@l String s) {
            L.p(s, "value");
            try {
                NavType.d.h(s);
                return NavType.d;
            }
            catch(IllegalArgumentException unused_ex) {
                try {
                    NavType.g.h(s);
                    return NavType.g;
                }
                catch(IllegalArgumentException unused_ex) {
                    try {
                        NavType.i.h(s);
                        return NavType.i;
                    }
                    catch(IllegalArgumentException unused_ex) {
                        try {
                            NavType.k.h(s);
                            return NavType.k;
                        }
                        catch(IllegalArgumentException unused_ex) {
                            return NavType.m;
                        }
                    }
                }
            }
        }

        @RestrictTo({Scope.b})
        @l
        @n
        public final NavType c(@m Object object0) {
            if(object0 instanceof Integer) {
                return NavType.d;
            }
            if(object0 instanceof int[]) {
                return NavType.f;
            }
            if(object0 instanceof Long) {
                return NavType.g;
            }
            if(object0 instanceof long[]) {
                return NavType.h;
            }
            if(object0 instanceof Float) {
                return NavType.i;
            }
            if(object0 instanceof float[]) {
                return NavType.j;
            }
            if(object0 instanceof Boolean) {
                return NavType.k;
            }
            if(object0 instanceof boolean[]) {
                return NavType.l;
            }
            if(!(object0 instanceof String) && object0 != null) {
                if(object0 instanceof Object[] && ((Object[])object0) instanceof String[]) {
                    return NavType.n;
                }
                if(object0.getClass().isArray()) {
                    Class class0 = object0.getClass().getComponentType();
                    L.m(class0);
                    if(Parcelable.class.isAssignableFrom(class0)) {
                        Class class1 = object0.getClass().getComponentType();
                        if(class1 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                        }
                        return new ParcelableArrayType(class1);
                    }
                }
                if(object0.getClass().isArray()) {
                    Class class2 = object0.getClass().getComponentType();
                    L.m(class2);
                    if(Serializable.class.isAssignableFrom(class2)) {
                        Class class3 = object0.getClass().getComponentType();
                        if(class3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                        }
                        return new SerializableArrayType(class3);
                    }
                }
                if(object0 instanceof Parcelable) {
                    return new ParcelableType(object0.getClass());
                }
                if(object0 instanceof Enum) {
                    return new EnumType(object0.getClass());
                }
                if(!(object0 instanceof Serializable)) {
                    throw new IllegalArgumentException("Object of type " + object0.getClass().getName() + " is not supported for navigation arguments.");
                }
                return new SerializableType(object0.getClass());
            }
            return NavType.m;
        }
    }

    public static final class EnumType extends SerializableType {
        @l
        private final Class p;

        public EnumType(@l Class class0) {
            L.p(class0, "type");
            super(false, class0);
            if(!class0.isEnum()) {
                throw new IllegalArgumentException((class0 + " is not an Enum type.").toString());
            }
            this.p = class0;
        }

        @Override  // androidx.navigation.NavType$SerializableType
        @l
        public String c() {
            String s = this.p.getName();
            L.o(s, "type.name");
            return s;
        }

        @Override  // androidx.navigation.NavType$SerializableType
        public Object h(String s) {
            return this.m(s);
        }

        @Override  // androidx.navigation.NavType$SerializableType
        public Serializable k(String s) {
            return this.m(s);
        }

        @l
        public Enum m(@l String s) {
            Object object0;
            L.p(s, "value");
            Object[] arr_object = this.p.getEnumConstants();
            L.o(arr_object, "type.enumConstants");
            for(int v = 0; true; ++v) {
                object0 = null;
                if(v >= arr_object.length) {
                    break;
                }
                Object object1 = arr_object[v];
                if(v.O1(((Enum)object1).name(), s, true)) {
                    object0 = object1;
                    break;
                }
            }
            if(((Enum)object0) == null) {
                throw new IllegalArgumentException("Enum value " + s + " not found for type " + this.p.getName() + '.');
            }
            return (Enum)object0;
        }
    }

    public static final class ParcelableArrayType extends NavType {
        @l
        private final Class o;

        public ParcelableArrayType(@l Class class0) {
            L.p(class0, "type");
            super(true);
            if(Parcelable.class.isAssignableFrom(class0)) {
                try {
                    this.o = Class.forName(("[L" + class0.getName() + ';'));
                    return;
                }
                catch(ClassNotFoundException classNotFoundException0) {
                    throw new RuntimeException(classNotFoundException0);
                }
            }
            throw new IllegalArgumentException((class0 + " does not implement Parcelable.").toString());
        }

        @Override  // androidx.navigation.NavType
        public Object b(Bundle bundle0, String s) {
            return this.j(bundle0, s);
        }

        @Override  // androidx.navigation.NavType
        @l
        public String c() {
            String s = this.o.getName();
            L.o(s, "arrayType.name");
            return s;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(object0 != null) {
                Class class0 = object0.getClass();
                return L.g(ParcelableArrayType.class, class0) ? L.g(this.o, ((ParcelableArrayType)object0).o) : false;
            }
            return false;
        }

        @Override  // androidx.navigation.NavType
        public Object h(String s) {
            return this.k(s);
        }

        @Override
        public int hashCode() {
            return this.o.hashCode();
        }

        @Override  // androidx.navigation.NavType
        public void i(Bundle bundle0, String s, Object object0) {
            this.l(bundle0, s, ((Parcelable[])object0));
        }

        @m
        public Parcelable[] j(@l Bundle bundle0, @l String s) {
            L.p(bundle0, "bundle");
            L.p(s, "key");
            return (Parcelable[])bundle0.get(s);
        }

        @l
        public Parcelable[] k(@l String s) {
            L.p(s, "value");
            throw new UnsupportedOperationException("Arrays don\'t support default values.");
        }

        public void l(@l Bundle bundle0, @l String s, @m Parcelable[] arr_parcelable) {
            L.p(bundle0, "bundle");
            L.p(s, "key");
            this.o.cast(arr_parcelable);
            bundle0.putParcelableArray(s, arr_parcelable);
        }
    }

    public static final class ParcelableType extends NavType {
        @l
        private final Class o;

        public ParcelableType(@l Class class0) {
            L.p(class0, "type");
            super(true);
            if(!Parcelable.class.isAssignableFrom(class0) && !Serializable.class.isAssignableFrom(class0)) {
                throw new IllegalArgumentException((class0 + " does not implement Parcelable or Serializable.").toString());
            }
            this.o = class0;
        }

        @Override  // androidx.navigation.NavType
        @m
        public Object b(@l Bundle bundle0, @l String s) {
            L.p(bundle0, "bundle");
            L.p(s, "key");
            return bundle0.get(s);
        }

        @Override  // androidx.navigation.NavType
        @l
        public String c() {
            String s = this.o.getName();
            L.o(s, "type.name");
            return s;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(object0 != null) {
                Class class0 = object0.getClass();
                return L.g(ParcelableType.class, class0) ? L.g(this.o, ((ParcelableType)object0).o) : false;
            }
            return false;
        }

        @Override  // androidx.navigation.NavType
        public Object h(@l String s) {
            L.p(s, "value");
            throw new UnsupportedOperationException("Parcelables don\'t support default values.");
        }

        @Override
        public int hashCode() {
            return this.o.hashCode();
        }

        @Override  // androidx.navigation.NavType
        public void i(@l Bundle bundle0, @l String s, Object object0) {
            L.p(bundle0, "bundle");
            L.p(s, "key");
            this.o.cast(object0);
            if(object0 == null || object0 instanceof Parcelable) {
                bundle0.putParcelable(s, ((Parcelable)object0));
            }
            else if(object0 instanceof Serializable) {
                bundle0.putSerializable(s, ((Serializable)object0));
            }
        }
    }

    public static final class SerializableArrayType extends NavType {
        @l
        private final Class o;

        public SerializableArrayType(@l Class class0) {
            L.p(class0, "type");
            super(true);
            if(Serializable.class.isAssignableFrom(class0)) {
                try {
                    this.o = Class.forName(("[L" + class0.getName() + ';'));
                    return;
                }
                catch(ClassNotFoundException classNotFoundException0) {
                    throw new RuntimeException(classNotFoundException0);
                }
            }
            throw new IllegalArgumentException((class0 + " does not implement Serializable.").toString());
        }

        @Override  // androidx.navigation.NavType
        public Object b(Bundle bundle0, String s) {
            return this.j(bundle0, s);
        }

        @Override  // androidx.navigation.NavType
        @l
        public String c() {
            String s = this.o.getName();
            L.o(s, "arrayType.name");
            return s;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(object0 != null) {
                Class class0 = object0.getClass();
                return L.g(SerializableArrayType.class, class0) ? L.g(this.o, ((SerializableArrayType)object0).o) : false;
            }
            return false;
        }

        @Override  // androidx.navigation.NavType
        public Object h(String s) {
            return this.k(s);
        }

        @Override
        public int hashCode() {
            return this.o.hashCode();
        }

        @Override  // androidx.navigation.NavType
        public void i(Bundle bundle0, String s, Object object0) {
            this.l(bundle0, s, ((Serializable[])object0));
        }

        @m
        public Serializable[] j(@l Bundle bundle0, @l String s) {
            L.p(bundle0, "bundle");
            L.p(s, "key");
            return (Serializable[])bundle0.get(s);
        }

        @l
        public Serializable[] k(@l String s) {
            L.p(s, "value");
            throw new UnsupportedOperationException("Arrays don\'t support default values.");
        }

        public void l(@l Bundle bundle0, @l String s, @m Serializable[] arr_serializable) {
            L.p(bundle0, "bundle");
            L.p(s, "key");
            this.o.cast(arr_serializable);
            bundle0.putSerializable(s, ((Serializable)arr_serializable));
        }
    }

    public static class SerializableType extends NavType {
        @l
        private final Class o;

        public SerializableType(@l Class class0) {
            L.p(class0, "type");
            super(true);
            if(!Serializable.class.isAssignableFrom(class0)) {
                throw new IllegalArgumentException((class0 + " does not implement Serializable.").toString());
            }
            if(class0.isEnum()) {
                throw new IllegalArgumentException((class0 + " is an Enum. You should use EnumType instead.").toString());
            }
            this.o = class0;
        }

        public SerializableType(boolean z, @l Class class0) {
            L.p(class0, "type");
            super(z);
            if(!Serializable.class.isAssignableFrom(class0)) {
                throw new IllegalArgumentException((class0 + " does not implement Serializable.").toString());
            }
            this.o = class0;
        }

        @Override  // androidx.navigation.NavType
        public Object b(Bundle bundle0, String s) {
            return this.j(bundle0, s);
        }

        @Override  // androidx.navigation.NavType
        @l
        public String c() {
            String s = this.o.getName();
            L.o(s, "type.name");
            return s;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof SerializableType ? L.g(this.o, ((SerializableType)object0).o) : false;
        }

        @Override  // androidx.navigation.NavType
        public Object h(String s) {
            return this.k(s);
        }

        @Override
        public int hashCode() {
            return this.o.hashCode();
        }

        @Override  // androidx.navigation.NavType
        public void i(Bundle bundle0, String s, Object object0) {
            this.l(bundle0, s, ((Serializable)object0));
        }

        @m
        public Serializable j(@l Bundle bundle0, @l String s) {
            L.p(bundle0, "bundle");
            L.p(s, "key");
            return (Serializable)bundle0.get(s);
        }

        @l
        public Serializable k(@l String s) {
            L.p(s, "value");
            throw new UnsupportedOperationException("Serializables don\'t support default values.");
        }

        public void l(@l Bundle bundle0, @l String s, @l Serializable serializable0) {
            L.p(bundle0, "bundle");
            L.p(s, "key");
            L.p(serializable0, "value");
            this.o.cast(serializable0);
            bundle0.putSerializable(s, serializable0);
        }
    }

    private final boolean a;
    @l
    private final String b;
    @l
    public static final Companion c;
    @l
    @f
    public static final NavType d;
    @l
    @f
    public static final NavType e;
    @l
    @f
    public static final NavType f;
    @l
    @f
    public static final NavType g;
    @l
    @f
    public static final NavType h;
    @l
    @f
    public static final NavType i;
    @l
    @f
    public static final NavType j;
    @l
    @f
    public static final NavType k;
    @l
    @f
    public static final NavType l;
    @l
    @f
    public static final NavType m;
    @l
    @f
    public static final NavType n;

    static {
        NavType.c = new Companion(null);
        NavType.d = new NavType.Companion.IntType.1();
        NavType.e = new NavType.Companion.ReferenceType.1();
        NavType.f = new NavType.Companion.IntArrayType.1();
        NavType.g = new NavType.Companion.LongType.1();
        NavType.h = new NavType.Companion.LongArrayType.1();
        NavType.i = new NavType.Companion.FloatType.1();
        NavType.j = new NavType.Companion.FloatArrayType.1();
        NavType.k = new NavType.Companion.BoolType.1();
        NavType.l = new NavType.Companion.BoolArrayType.1();
        NavType.m = new NavType.Companion.StringType.1();
        NavType.n = new NavType.Companion.StringArrayType.1();
    }

    public NavType(boolean z) {
        this.a = z;
        this.b = "nav_type";
    }

    @l
    @n
    public static NavType a(@m String s, @m String s1) {
        return b.a(NavType.c, s, s1);
    }

    @m
    public abstract Object b(@l Bundle arg1, @l String arg2);

    @l
    public String c() {
        return this.b;
    }

    @RestrictTo({Scope.b})
    @l
    @n
    public static final NavType d(@l String s) {
        return NavType.c.b(s);
    }

    @RestrictTo({Scope.b})
    @l
    @n
    public static final NavType e(@m Object object0) {
        return NavType.c.c(object0);
    }

    public boolean f() {
        return this.a;
    }

    @RestrictTo({Scope.b})
    public final Object g(@l Bundle bundle0, @l String s, @l String s1) {
        L.p(bundle0, "bundle");
        L.p(s, "key");
        L.p(s1, "value");
        Object object0 = this.h(s1);
        this.i(bundle0, s, object0);
        return object0;
    }

    public abstract Object h(@l String arg1);

    public abstract void i(@l Bundle arg1, @l String arg2, Object arg3);

    @Override
    @l
    public String toString() {
        return this.c();
    }
}

