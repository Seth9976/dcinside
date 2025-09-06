package androidx.compose.ui.text.input;

import A3.a;
import android.os.Build.VERSION;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import kotlin.D;
import kotlin.E;
import kotlin.H;
import kotlin.jvm.internal.L;
import y4.l;

public final class InputMethodManagerImpl implements InputMethodManager {
    @l
    private final View a;
    @l
    private final D b;
    @l
    private final ImmHelper c;

    public InputMethodManagerImpl(@l View view0) {
        L.p(view0, "view");
        super();
        this.a = view0;
        androidx.compose.ui.text.input.InputMethodManagerImpl.imm.2 inputMethodManagerImpl$imm$20 = new a() {
            final InputMethodManagerImpl e;

            {
                this.e = inputMethodManagerImpl0;
                super(0);
            }

            @l
            public final android.view.inputmethod.InputMethodManager b() {
                Object object0 = this.e.a.getContext().getSystemService("input_method");
                L.n(object0, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (android.view.inputmethod.InputMethodManager)object0;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        };
        this.b = E.c(H.c, inputMethodManagerImpl$imm$20);
        ImmHelper21 immHelper210 = Build.VERSION.SDK_INT < 30 ? new ImmHelper21(view0) : new ImmHelper30(view0);
        this.c = immHelper210;
    }

    @Override  // androidx.compose.ui.text.input.InputMethodManager
    public void a(int v, int v1, int v2, int v3) {
        this.g().updateSelection(this.a, v, v1, v2, v3);
    }

    @Override  // androidx.compose.ui.text.input.InputMethodManager
    public void b() {
        this.g().restartInput(this.a);
    }

    @Override  // androidx.compose.ui.text.input.InputMethodManager
    public void c() {
        android.view.inputmethod.InputMethodManager inputMethodManager0 = this.g();
        this.c.a(inputMethodManager0);
    }

    @Override  // androidx.compose.ui.text.input.InputMethodManager
    public void d(int v, @l ExtractedText extractedText0) {
        L.p(extractedText0, "extractedText");
        this.g().updateExtractedText(this.a, v, extractedText0);
    }

    @Override  // androidx.compose.ui.text.input.InputMethodManager
    public void e() {
        android.view.inputmethod.InputMethodManager inputMethodManager0 = this.g();
        this.c.b(inputMethodManager0);
    }

    private final android.view.inputmethod.InputMethodManager g() {
        return (android.view.inputmethod.InputMethodManager)this.b.getValue();
    }
}

