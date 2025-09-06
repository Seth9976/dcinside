package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.JvmCharHelpers_androidKt;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
public final class MoveCursorCommand implements EditCommand {
    private final int a;
    public static final int b;

    static {
    }

    public MoveCursorCommand(int v) {
        this.a = v;
    }

    @Override  // androidx.compose.ui.text.input.EditCommand
    public void a(@l EditingBuffer editingBuffer0) {
        L.p(editingBuffer0, "buffer");
        if(editingBuffer0.h() == -1) {
            editingBuffer0.q(editingBuffer0.l());
        }
        int v = editingBuffer0.l();
        String s = editingBuffer0.toString();
        int v1 = this.a;
        int v2 = 0;
        if(v1 > 0) {
            while(v2 < v1) {
                int v3 = JvmCharHelpers_androidKt.a(s, v);
                if(v3 == -1) {
                    break;
                }
                ++v2;
                v = v3;
            }
        }
        else {
            while(v2 < -v1) {
                int v4 = JvmCharHelpers_androidKt.b(s, v);
                if(v4 == -1) {
                    break;
                }
                ++v2;
                v = v4;
            }
        }
        editingBuffer0.q(v);
    }

    public final int b() {
        return this.a;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof MoveCursorCommand ? this.a == ((MoveCursorCommand)object0).a : false;
    }

    @Override
    public int hashCode() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return "MoveCursorCommand(amount=" + this.a + ')';
    }
}

