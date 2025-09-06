package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.JvmCharHelpers_androidKt;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
public final class BackspaceCommand implements EditCommand {
    public static final int a;

    static {
    }

    @Override  // androidx.compose.ui.text.input.EditCommand
    public void a(@l EditingBuffer editingBuffer0) {
        L.p(editingBuffer0, "buffer");
        if(editingBuffer0.m()) {
            editingBuffer0.c(editingBuffer0.g(), editingBuffer0.f());
            return;
        }
        switch(editingBuffer0.h()) {
            case -1: {
                editingBuffer0.q(editingBuffer0.l());
                editingBuffer0.c(editingBuffer0.l(), editingBuffer0.k());
                return;
            }
            case 0: {
                return;
            }
            default: {
                editingBuffer0.c(JvmCharHelpers_androidKt.b(editingBuffer0.toString(), editingBuffer0.h()), editingBuffer0.h());
            }
        }
    }

    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof BackspaceCommand;
    }

    @Override
    public int hashCode() {
        return m0.d(BackspaceCommand.class).hashCode();
    }

    @Override
    @l
    public String toString() {
        return "BackspaceCommand()";
    }
}

