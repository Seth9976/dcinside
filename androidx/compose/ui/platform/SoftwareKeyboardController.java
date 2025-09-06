package androidx.compose.ui.platform;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.c0;
import kotlin.k;

@Stable
@ExperimentalComposeUiApi
public interface SoftwareKeyboardController {
    void a();

    @k(message = "Use hide instead.", replaceWith = @c0(expression = "hide()", imports = {}))
    void b();

    @k(message = "Use show instead.", replaceWith = @c0(expression = "show()", imports = {}))
    void c();

    void show();
}

