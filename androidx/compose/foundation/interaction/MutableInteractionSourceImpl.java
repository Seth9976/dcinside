package androidx.compose.foundation.interaction;

import androidx.compose.runtime.Stable;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.channels.i;
import kotlinx.coroutines.flow.D;
import kotlinx.coroutines.flow.K;
import y4.l;
import y4.m;

@Stable
final class MutableInteractionSourceImpl implements MutableInteractionSource {
    @l
    private final D a;

    public MutableInteractionSourceImpl() {
        this.a = K.b(0, 16, i.b, 1, null);
    }

    @Override  // androidx.compose.foundation.interaction.MutableInteractionSource
    public boolean a(@l Interaction interaction0) {
        L.p(interaction0, "interaction");
        return this.d().d(interaction0);
    }

    @Override  // androidx.compose.foundation.interaction.MutableInteractionSource
    @m
    public Object b(@l Interaction interaction0, @l d d0) {
        Object object0 = this.d().emit(interaction0, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    @Override  // androidx.compose.foundation.interaction.InteractionSource
    public kotlinx.coroutines.flow.i c() {
        return this.d();
    }

    @l
    public D d() {
        return this.a;
    }
}

