package androidx.work.impl.model;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;
import z3.f;

@RestrictTo({Scope.b})
@Entity(foreignKeys = {@ForeignKey(childColumns = {"work_spec_id"}, entity = WorkSpec.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})}, primaryKeys = {"work_spec_id", "generation"})
public final class SystemIdInfo {
    @ColumnInfo(name = "work_spec_id")
    @l
    @f
    public final String a;
    @ColumnInfo(defaultValue = "0")
    private final int b;
    @ColumnInfo(name = "system_id")
    @f
    public final int c;

    public SystemIdInfo(@l String s, int v, int v1) {
        L.p(s, "workSpecId");
        super();
        this.a = s;
        this.b = v;
        this.c = v1;
    }

    @l
    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    @l
    public final SystemIdInfo d(@l String s, int v, int v1) {
        L.p(s, "workSpecId");
        return new SystemIdInfo(s, v, v1);
    }

    public static SystemIdInfo e(SystemIdInfo systemIdInfo0, String s, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            s = systemIdInfo0.a;
        }
        if((v2 & 2) != 0) {
            v = systemIdInfo0.b;
        }
        if((v2 & 4) != 0) {
            v1 = systemIdInfo0.c;
        }
        return systemIdInfo0.d(s, v, v1);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SystemIdInfo)) {
            return false;
        }
        if(!L.g(this.a, ((SystemIdInfo)object0).a)) {
            return false;
        }
        return this.b == ((SystemIdInfo)object0).b ? this.c == ((SystemIdInfo)object0).c : false;
    }

    public final int f() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return (this.a.hashCode() * 0x1F + this.b) * 0x1F + this.c;
    }

    @Override
    @l
    public String toString() {
        return "SystemIdInfo(workSpecId=" + this.a + ", generation=" + this.b + ", systemId=" + this.c + ')';
    }
}

