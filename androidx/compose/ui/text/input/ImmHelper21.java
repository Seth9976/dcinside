package androidx.compose.ui.text.input;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.DoNotInline;
import kotlin.jvm.internal.L;
import y4.l;

final class ImmHelper21 implements ImmHelper {
    @l
    private final View a;

    public ImmHelper21(@l View view0) {
        L.p(view0, "view");
        super();
        this.a = view0;
    }

    @Override  // androidx.compose.ui.text.input.ImmHelper
    @DoNotInline
    public void a(@l InputMethodManager inputMethodManager0) {
        L.p(inputMethodManager0, "imm");
        inputMethodManager0.hideSoftInputFromWindow(this.a.getWindowToken(), 0);
    }

    @Override  // androidx.compose.ui.text.input.ImmHelper
    @DoNotInline
    public void b(@l InputMethodManager inputMethodManager0) {
        L.p(inputMethodManager0, "imm");
        a a0 = () -> {
            L.p(inputMethodManager0, "$imm");
            L.p(this, "this$0");
            inputMethodManager0.showSoftInput(this.a, 0);
        };
        this.a.post(a0);
    }

    // 检测为 Lambda 实现
    private static final void d(InputMethodManager inputMethodManager0, ImmHelper21 immHelper210) [...]
}

