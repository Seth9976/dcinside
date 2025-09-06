package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@Immutable
@s0({"SMAP\nPlaceholder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Placeholder.kt\nandroidx/compose/ui/text/Placeholder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1#2:137\n*E\n"})
public final class Placeholder {
    private final long a;
    private final long b;
    private final int c;
    public static final int d;

    static {
    }

    private Placeholder(long v, long v1, int v2) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        if(TextUnitKt.s(v)) {
            throw new IllegalArgumentException("width cannot be TextUnit.Unspecified");
        }
        if(TextUnitKt.s(v1)) {
            throw new IllegalArgumentException("height cannot be TextUnit.Unspecified");
        }
    }

    public Placeholder(long v, long v1, int v2, w w0) {
        this(v, v1, v2);
    }

    @l
    public final Placeholder a(long v, long v1, int v2) {
        return new Placeholder(v, v1, v2, null);
    }

    public static Placeholder b(Placeholder placeholder0, long v, long v1, int v2, int v3, Object object0) {
        if((v3 & 1) != 0) {
            v = placeholder0.a;
        }
        if((v3 & 2) != 0) {
            v1 = placeholder0.b;
        }
        if((v3 & 4) != 0) {
            v2 = placeholder0.c;
        }
        return placeholder0.a(v, v1, v2);
    }

    public final long c() {
        return this.b;
    }

    public final int d() {
        return this.c;
    }

    public final long e() {
        return this.a;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Placeholder)) {
            return false;
        }
        if(!TextUnit.j(this.a, ((Placeholder)object0).a)) {
            return false;
        }
        return TextUnit.j(this.b, ((Placeholder)object0).b) ? PlaceholderVerticalAlign.k(this.c, ((Placeholder)object0).c) : false;
    }

    @Override
    public int hashCode() {
        return (TextUnit.o(this.a) * 0x1F + TextUnit.o(this.b)) * 0x1F + this.c;
    }

    @Override
    @l
    public String toString() {
        return "Placeholder(width=" + TextUnit.u(this.a) + ", height=" + TextUnit.u(this.b) + ", placeholderVerticalAlign=" + PlaceholderVerticalAlign.m(this.c) + ')';
    }
}

