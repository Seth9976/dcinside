package g0;

import com.google.gson.annotations.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class e {
    @c("self_article")
    @m
    private final Boolean a;
    @c("article")
    @m
    private final Boolean b;
    @c("user")
    @m
    private final Boolean c;

    public e() {
        this(null, null, null, 7, null);
    }

    public e(@m Boolean boolean0, @m Boolean boolean1, @m Boolean boolean2) {
        this.a = boolean0;
        this.b = boolean1;
        this.c = boolean2;
    }

    public e(Boolean boolean0, Boolean boolean1, Boolean boolean2, int v, w w0) {
        if((v & 1) != 0) {
            boolean0 = null;
        }
        if((v & 2) != 0) {
            boolean1 = null;
        }
        if((v & 4) != 0) {
            boolean2 = null;
        }
        this(boolean0, boolean1, boolean2);
    }

    @m
    public final Boolean a() {
        return this.a;
    }

    @m
    public final Boolean b() {
        return this.b;
    }

    @m
    public final Boolean c() {
        return this.c;
    }

    @l
    public final e d(@m Boolean boolean0, @m Boolean boolean1, @m Boolean boolean2) {
        return new e(boolean0, boolean1, boolean2);
    }

    public static e e(e e0, Boolean boolean0, Boolean boolean1, Boolean boolean2, int v, Object object0) {
        if((v & 1) != 0) {
            boolean0 = e0.a;
        }
        if((v & 2) != 0) {
            boolean1 = e0.b;
        }
        if((v & 4) != 0) {
            boolean2 = e0.c;
        }
        return e0.d(boolean0, boolean1, boolean2);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof e)) {
            return false;
        }
        if(!L.g(this.a, ((e)object0).a)) {
            return false;
        }
        return L.g(this.b, ((e)object0).b) ? L.g(this.c, ((e)object0).c) : false;
    }

    @m
    public final Boolean f() {
        return this.b;
    }

    @m
    public final Boolean g() {
        return this.a;
    }

    @m
    public final Boolean h() {
        return this.c;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        Boolean boolean0 = this.c;
        if(boolean0 != null) {
            v = boolean0.hashCode();
        }
        return (v1 * 0x1F + v2) * 0x1F + v;
    }

    @Override
    @l
    public String toString() {
        return "PostPushStatusResult(myPostEnable=" + this.a + ", articleEnable=" + this.b + ", userEnable=" + this.c + ")";
    }
}

