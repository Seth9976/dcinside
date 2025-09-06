package androidx.compose.ui.platform;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.text.input.TextInputService;
import kotlin.jvm.internal.L;
import y4.l;

@ExperimentalComposeUiApi
final class DelegatingSoftwareKeyboardController implements SoftwareKeyboardController {
    @l
    private final TextInputService a;

    public DelegatingSoftwareKeyboardController(@l TextInputService textInputService0) {
        L.p(textInputService0, "textInputService");
        super();
        this.a = textInputService0;
    }

    @Override  // androidx.compose.ui.platform.SoftwareKeyboardController
    public void a() {
        this.a.b();
    }

    @Override  // androidx.compose.ui.platform.SoftwareKeyboardController
    public void b() {
        D0.a(this);
    }

    @Override  // androidx.compose.ui.platform.SoftwareKeyboardController
    public void c() {
        D0.b(this);
    }

    @l
    public final TextInputService d() {
        return this.a;
    }

    @Override  // androidx.compose.ui.platform.SoftwareKeyboardController
    public void show() {
        this.a.c();
    }
}

