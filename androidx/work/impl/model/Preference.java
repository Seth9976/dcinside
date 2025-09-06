package androidx.work.impl.model;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@RestrictTo({Scope.b})
@Entity
public final class Preference {
    @ColumnInfo(name = "key")
    @PrimaryKey
    @l
    private final String a;
    @ColumnInfo(name = "long_value")
    @m
    private final Long b;

    public Preference(@l String s, @m Long long0) {
        L.p(s, "key");
        super();
        this.a = s;
        this.b = long0;
    }

    public Preference(@l String s, boolean z) {
        L.p(s, "key");
        this(s, ((long)(z ? 1L : 0L)));
    }

    @l
    public final String a() {
        return this.a;
    }

    @m
    public final Long b() {
        return this.b;
    }

    @l
    public final Preference c(@l String s, @m Long long0) {
        L.p(s, "key");
        return new Preference(s, long0);
    }

    public static Preference d(Preference preference0, String s, Long long0, int v, Object object0) {
        if((v & 1) != 0) {
            s = preference0.a;
        }
        if((v & 2) != 0) {
            long0 = preference0.b;
        }
        return preference0.c(s, long0);
    }

    @l
    public final String e() {
        return this.a;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Preference)) {
            return false;
        }
        return L.g(this.a, ((Preference)object0).a) ? L.g(this.b, ((Preference)object0).b) : false;
    }

    @m
    public final Long f() {
        return this.b;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "Preference(key=" + this.a + ", value=" + this.b + ')';
    }
}

