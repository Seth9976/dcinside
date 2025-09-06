package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.L;
import kotlin.v;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 1)
public final class AccessibilityAction {
    @m
    private final String a;
    @m
    private final v b;
    public static final int c;

    static {
    }

    public AccessibilityAction(@m String s, @m v v0) {
        this.a = s;
        this.b = v0;
    }

    @m
    public final v a() {
        return this.b;
    }

    @m
    public final String b() {
        return this.a;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof AccessibilityAction)) {
            return false;
        }
        return L.g(this.a, ((AccessibilityAction)object0).a) ? L.g(this.b, ((AccessibilityAction)object0).b) : false;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        v v2 = this.b;
        if(v2 != null) {
            v = v2.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override
    @l
    public String toString() {
        return "AccessibilityAction(label=" + this.a + ", action=" + this.b + ')';
    }
}

