package androidx.compose.foundation.lazy.grid;

import A3.o;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.a;
import androidx.compose.ui.b;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

final class AnimateItemPlacementModifier extends InspectorValueInfo implements ParentDataModifier {
    @l
    private final FiniteAnimationSpec d;

    public AnimateItemPlacementModifier(@l FiniteAnimationSpec finiteAnimationSpec0, @l Function1 function10) {
        L.p(finiteAnimationSpec0, "animationSpec");
        L.p(function10, "inspectorInfo");
        super(function10);
        this.d = finiteAnimationSpec0;
    }

    @Override  // androidx.compose.ui.layout.ParentDataModifier
    @l
    public Object E(@l Density density0, @m Object object0) {
        L.p(density0, "<this>");
        return this.d;
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean H(Function1 function10) {
        return b.b(this, function10);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object P(Object object0, o o0) {
        return b.c(this, object0, o0);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object U(Object object0, o o0) {
        return b.d(this, object0, o0);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof AnimateItemPlacementModifier ? !L.g(this.d, ((AnimateItemPlacementModifier)object0).d) : false;
    }

    @Override
    public int hashCode() {
        return this.d.hashCode();
    }

    @l
    public final FiniteAnimationSpec j() {
        return this.d;
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier r0(Modifier modifier0) {
        return a.a(this, modifier0);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean u(Function1 function10) {
        return b.a(this, function10);
    }
}

