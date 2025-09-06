package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.jvm.internal.L;
import kotlin.ranges.s;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
public final class CommitTextCommand implements EditCommand {
    @l
    private final AnnotatedString a;
    private final int b;
    public static final int c;

    static {
    }

    public CommitTextCommand(@l AnnotatedString annotatedString0, int v) {
        L.p(annotatedString0, "annotatedString");
        super();
        this.a = annotatedString0;
        this.b = v;
    }

    public CommitTextCommand(@l String s, int v) {
        L.p(s, "text");
        this(new AnnotatedString(s, null, null, 6, null), v);
    }

    @Override  // androidx.compose.ui.text.input.EditCommand
    public void a(@l EditingBuffer editingBuffer0) {
        L.p(editingBuffer0, "buffer");
        if(editingBuffer0.m()) {
            editingBuffer0.o(editingBuffer0.g(), editingBuffer0.f(), this.d());
        }
        else {
            editingBuffer0.o(editingBuffer0.l(), editingBuffer0.k(), this.d());
        }
        int v = editingBuffer0.h();
        editingBuffer0.q(s.I((this.b <= 0 ? v + this.b - this.d().length() : v + this.b - 1), 0, editingBuffer0.i()));
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
        if(!(object0 instanceof CommitTextCommand)) {
            return false;
        }
        return L.g(this.d(), ((CommitTextCommand)object0).d()) ? this.b == ((CommitTextCommand)object0).b : false;
    }

    @Override
    public int hashCode() {
        return this.d().hashCode() * 0x1F + this.b;
    }

    @Override
    @l
    public String toString() {
        return "CommitTextCommand(text=\'" + this.d() + "\', newCursorPosition=" + this.b + ')';
    }
}

