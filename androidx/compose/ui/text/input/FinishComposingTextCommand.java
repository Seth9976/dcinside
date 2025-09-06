package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
public final class FinishComposingTextCommand implements EditCommand {
    public static final int a;

    static {
    }

    @Override  // androidx.compose.ui.text.input.EditCommand
    public void a(@l EditingBuffer editingBuffer0) {
        L.p(editingBuffer0, "buffer");
        editingBuffer0.b();
    }

    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof FinishComposingTextCommand;
    }

    @Override
    public int hashCode() {
        return m0.d(FinishComposingTextCommand.class).hashCode();
    }

    @Override
    @l
    public String toString() {
        return "FinishComposingTextCommand()";
    }
}

