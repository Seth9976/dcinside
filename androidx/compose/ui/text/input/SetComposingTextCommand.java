package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.jvm.internal.L;
import kotlin.ranges.s;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
public final class SetComposingTextCommand implements EditCommand {
    @l
    private final AnnotatedString a;
    private final int b;
    public static final int c;

    static {
    }

    public SetComposingTextCommand(@l AnnotatedString annotatedString0, int v) {
        L.p(annotatedString0, "annotatedString");
        super();
        this.a = annotatedString0;
        this.b = v;
    }

    public SetComposingTextCommand(@l String s, int v) {
        L.p(s, "text");
        this(new AnnotatedString(s, null, null, 6, null), v);
    }

    @Override  // androidx.compose.ui.text.input.EditCommand
    public void a(@l EditingBuffer editingBuffer0) {
        L.p(editingBuffer0, "buffer");
        if(editingBuffer0.m()) {
            int v = editingBuffer0.g();
            editingBuffer0.o(editingBuffer0.g(), editingBuffer0.f(), this.d());
            if(this.d().length() > 0) {
                editingBuffer0.p(v, this.d().length() + v);
            }
        }
        else {
            int v1 = editingBuffer0.l();
            editingBuffer0.o(editingBuffer0.l(), editingBuffer0.k(), this.d());
            if(this.d().length() > 0) {
                editingBuffer0.p(v1, this.d().length() + v1);
            }
        }
        int v2 = editingBuffer0.h();
        editingBuffer0.q(s.I((this.b <= 0 ? v2 + this.b - this.d().length() : v2 + this.b - 1), 0, editingBuffer0.i()));
    }

    @l
    public final AnnotatedString b() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    @l
    public final String d() {
        return this.a.j();
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SetComposingTextCommand)) {
            return false;
        }
        return L.g(this.d(), ((SetComposingTextCommand)object0).d()) ? this.b == ((SetComposingTextCommand)object0).b : false;
    }

    @Override
    public int hashCode() {
        return this.d().hashCode() * 0x1F + this.b;
    }

    @Override
    @l
    public String toString() {
        return "SetComposingTextCommand(text=\'" + this.d() + "\', newCursorPosition=" + this.b + ')';
    }
}

