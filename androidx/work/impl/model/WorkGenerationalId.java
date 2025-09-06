package androidx.work.impl.model;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class WorkGenerationalId {
    @l
    private final String a;
    private final int b;

    public WorkGenerationalId(@l String s, int v) {
        L.p(s, "workSpecId");
        super();
        this.a = s;
        this.b = v;
    }

    @l
    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    @l
    public final WorkGenerationalId c(@l String s, int v) {
        L.p(s, "workSpecId");
        return new WorkGenerationalId(s, v);
    }

    public static WorkGenerationalId d(WorkGenerationalId workGenerationalId0, String s, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = workGenerationalId0.a;
        }
        if((v1 & 2) != 0) {
            v = workGenerationalId0.b;
        }
        return workGenerationalId0.c(s, v);
    }

    public final int e() {
        return this.b;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof WorkGenerationalId)) {
            return false;
        }
        return L.g(this.a, ((WorkGenerationalId)object0).a) ? this.b == ((WorkGenerationalId)object0).b : false;
    }

    @l
    public final String f() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() * 0x1F + this.b;
    }

    @Override
    @l
    public String toString() {
        return "WorkGenerationalId(workSpecId=" + this.a + ", generation=" + this.b + ')';
    }
}

