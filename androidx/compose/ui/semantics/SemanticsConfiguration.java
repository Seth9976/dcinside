package androidx.compose.ui.semantics;

import B3.a;
import androidx.compose.foundation.c;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.jvm.internal.L;
import kotlin.v;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
public final class SemanticsConfiguration implements a, SemanticsPropertyReceiver, Iterable {
    @l
    private final Map a;
    private boolean b;
    private boolean c;
    public static final int d = 8;

    static {
    }

    public SemanticsConfiguration() {
        this.a = new LinkedHashMap();
    }

    @Override  // androidx.compose.ui.semantics.SemanticsPropertyReceiver
    public void a(@l SemanticsPropertyKey semanticsPropertyKey0, Object object0) {
        L.p(semanticsPropertyKey0, "key");
        this.a.put(semanticsPropertyKey0, object0);
    }

    public final void b(@l SemanticsConfiguration semanticsConfiguration0) {
        L.p(semanticsConfiguration0, "peer");
        if(semanticsConfiguration0.b) {
            this.b = true;
        }
        if(semanticsConfiguration0.c) {
            this.c = true;
        }
        for(Object object0: semanticsConfiguration0.a.entrySet()) {
            SemanticsPropertyKey semanticsPropertyKey0 = (SemanticsPropertyKey)((Map.Entry)object0).getKey();
            Object object1 = ((Map.Entry)object0).getValue();
            if(!this.a.containsKey(semanticsPropertyKey0)) {
                this.a.put(semanticsPropertyKey0, object1);
            }
            else if(object1 instanceof AccessibilityAction) {
                Object object2 = this.a.get(semanticsPropertyKey0);
                L.n(object2, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                Map map0 = this.a;
                String s = ((AccessibilityAction)object2).b();
                if(s == null) {
                    s = ((AccessibilityAction)object1).b();
                }
                v v0 = ((AccessibilityAction)object2).a();
                if(v0 == null) {
                    v0 = ((AccessibilityAction)object1).a();
                }
                map0.put(semanticsPropertyKey0, new AccessibilityAction(s, v0));
            }
        }
    }

    public final boolean c(@l SemanticsPropertyKey semanticsPropertyKey0) {
        L.p(semanticsPropertyKey0, "key");
        return this.a.containsKey(semanticsPropertyKey0);
    }

    @l
    public final SemanticsConfiguration d() {
        SemanticsConfiguration semanticsConfiguration0 = new SemanticsConfiguration();
        semanticsConfiguration0.b = this.b;
        semanticsConfiguration0.c = this.c;
        semanticsConfiguration0.a.putAll(this.a);
        return semanticsConfiguration0;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SemanticsConfiguration)) {
            return false;
        }
        if(!L.g(this.a, ((SemanticsConfiguration)object0).a)) {
            return false;
        }
        return this.b == ((SemanticsConfiguration)object0).b ? this.c == ((SemanticsConfiguration)object0).c : false;
    }

    public final Object g(@l SemanticsPropertyKey semanticsPropertyKey0) {
        L.p(semanticsPropertyKey0, "key");
        Object object0 = this.a.get(semanticsPropertyKey0);
        if(object0 == null) {
            throw new IllegalStateException("Key not present: " + semanticsPropertyKey0 + " - consider getOrElse or getOrNull");
        }
        return object0;
    }

    public final Object h(@l SemanticsPropertyKey semanticsPropertyKey0, @l A3.a a0) {
        L.p(semanticsPropertyKey0, "key");
        L.p(a0, "defaultValue");
        Object object0 = this.a.get(semanticsPropertyKey0);
        return object0 == null ? a0.invoke() : object0;
    }

    @Override
    public int hashCode() {
        return (this.a.hashCode() * 0x1F + c.a(this.b)) * 0x1F + c.a(this.c);
    }

    @m
    public final Object i(@l SemanticsPropertyKey semanticsPropertyKey0, @l A3.a a0) {
        L.p(semanticsPropertyKey0, "key");
        L.p(a0, "defaultValue");
        Object object0 = this.a.get(semanticsPropertyKey0);
        return object0 == null ? a0.invoke() : object0;
    }

    @Override
    @l
    public Iterator iterator() {
        return this.a.entrySet().iterator();
    }

    public final boolean j() {
        return this.c;
    }

    public final boolean k() {
        return this.b;
    }

    public final void l(@l SemanticsConfiguration semanticsConfiguration0) {
        L.p(semanticsConfiguration0, "child");
        for(Object object0: semanticsConfiguration0.a.entrySet()) {
            SemanticsPropertyKey semanticsPropertyKey0 = (SemanticsPropertyKey)((Map.Entry)object0).getKey();
            Object object1 = ((Map.Entry)object0).getValue();
            Object object2 = this.a.get(semanticsPropertyKey0);
            L.n(semanticsPropertyKey0, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
            Object object3 = semanticsPropertyKey0.d(object2, object1);
            if(object3 != null) {
                this.a.put(semanticsPropertyKey0, object3);
            }
        }
    }

    public final void m(boolean z) {
        this.c = z;
    }

    public final void o(boolean z) {
        this.b = z;
    }

    @Override
    @l
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        String s = "";
        if(this.b) {
            stringBuilder0.append("");
            stringBuilder0.append("mergeDescendants=true");
            s = ", ";
        }
        if(this.c) {
            stringBuilder0.append(s);
            stringBuilder0.append("isClearingSemantics=true");
            s = ", ";
        }
        for(Object object0: this.a.entrySet()) {
            SemanticsPropertyKey semanticsPropertyKey0 = (SemanticsPropertyKey)((Map.Entry)object0).getKey();
            Object object1 = ((Map.Entry)object0).getValue();
            stringBuilder0.append(s);
            stringBuilder0.append(semanticsPropertyKey0.b());
            stringBuilder0.append(" : ");
            stringBuilder0.append(object1);
            s = ", ";
        }
        return JvmActuals_jvmKt.b(this, null) + "{ " + stringBuilder0 + " }";
    }
}

