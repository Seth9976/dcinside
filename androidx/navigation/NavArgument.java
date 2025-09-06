package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class NavArgument {
    public static final class Builder {
        @m
        private NavType a;
        private boolean b;
        @m
        private Object c;
        private boolean d;

        @l
        public final NavArgument a() {
            return new NavArgument((this.a == null ? NavType.c.c(this.c) : this.a), this.b, this.c, this.d);
        }

        @l
        public final Builder b(@m Object object0) {
            this.c = object0;
            this.d = true;
            return this;
        }

        @l
        public final Builder c(boolean z) {
            this.b = z;
            return this;
        }

        @l
        public final Builder d(@l NavType navType0) {
            L.p(navType0, "type");
            this.a = navType0;
            return this;
        }
    }

    @l
    private final NavType a;
    private final boolean b;
    private final boolean c;
    @m
    private final Object d;

    public NavArgument(@l NavType navType0, boolean z, @m Object object0, boolean z1) {
        L.p(navType0, "type");
        super();
        if(!navType0.f() && z) {
            throw new IllegalArgumentException((navType0.c() + " does not allow nullable values").toString());
        }
        if(!z && z1 && object0 == null) {
            throw new IllegalArgumentException(("Argument with type " + navType0.c() + " has null value but is not nullable.").toString());
        }
        this.a = navType0;
        this.b = z;
        this.d = object0;
        this.c = z1;
    }

    @m
    public final Object a() {
        return this.d;
    }

    @l
    public final NavType b() {
        return this.a;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d() {
        return this.b;
    }

    @RestrictTo({Scope.b})
    public final void e(@l String s, @l Bundle bundle0) {
        L.p(s, "name");
        L.p(bundle0, "bundle");
        if(this.c) {
            this.a.i(bundle0, s, this.d);
        }
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(!L.g(NavArgument.class, class0) || this.b != ((NavArgument)object0).b) {
                return false;
            }
            if(this.c != ((NavArgument)object0).c) {
                return false;
            }
            if(!L.g(this.a, ((NavArgument)object0).a)) {
                return false;
            }
            return this.d == null ? ((NavArgument)object0).d == null : L.g(this.d, ((NavArgument)object0).d);
        }
        return false;
    }

    @RestrictTo({Scope.b})
    public final boolean f(@l String s, @l Bundle bundle0) {
        L.p(s, "name");
        L.p(bundle0, "bundle");
        if(!this.b && bundle0.containsKey(s) && bundle0.get(s) == null) {
            return false;
        }
        try {
            this.a.b(bundle0, s);
            return true;
        }
        catch(ClassCastException unused_ex) {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int v = ((this.a.hashCode() * 0x1F + this.b) * 0x1F + this.c) * 0x1F;
        return this.d == null ? v : v + this.d.hashCode();
    }

    @Override
    @l
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("NavArgument");
        stringBuilder0.append(" Type: " + this.a);
        stringBuilder0.append(" Nullable: " + this.b);
        if(this.c) {
            stringBuilder0.append(" DefaultValue: " + this.d);
        }
        String s = stringBuilder0.toString();
        L.o(s, "sb.toString()");
        return s;
    }
}

