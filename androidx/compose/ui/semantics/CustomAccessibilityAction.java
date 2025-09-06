package androidx.compose.ui.semantics;

import A3.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
public final class CustomAccessibilityAction {
    @l
    private final String a;
    @l
    private final a b;
    public static final int c;

    static {
    }

    public CustomAccessibilityAction(@l String s, @l a a0) {
        L.p(s, "label");
        L.p(a0, "action");
        super();
        this.a = s;
        this.b = a0;
    }

    @l
    public final a a() {
        return this.b;
    }

    @l
    public final String b() {
        return this.a;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof CustomAccessibilityAction)) {
            return false;
        }
        return L.g(this.a, ((CustomAccessibilityAction)object0).a) ? L.g(this.b, ((CustomAccessibilityAction)object0).b) : false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "CustomAccessibilityAction(label=" + this.a + ", action=" + this.b + ')';
    }
}

