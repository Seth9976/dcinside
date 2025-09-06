package androidx.compose.ui.text.input;

import androidx.compose.animation.core.d;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.k;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
public class TextInputService {
    @l
    private final PlatformTextInputService a;
    @l
    private final AtomicReference b;
    public static final int c = 8;

    static {
    }

    public TextInputService(@l PlatformTextInputService platformTextInputService0) {
        L.p(platformTextInputService0, "platformTextInputService");
        super();
        this.a = platformTextInputService0;
        this.b = new AtomicReference(null);
    }

    @m
    public final TextInputSession a() {
        return (TextInputSession)this.b.get();
    }

    @k(message = "Use SoftwareKeyboardController.hide or TextInputSession.hideSoftwareKeyboard instead.", replaceWith = @c0(expression = "textInputSession.hideSoftwareKeyboard()", imports = {}))
    public final void b() {
        this.a.b();
    }

    @k(message = "Use SoftwareKeyboardController.show or TextInputSession.showSoftwareKeyboard instead.", replaceWith = @c0(expression = "textInputSession.showSoftwareKeyboard()", imports = {}))
    public final void c() {
        if(this.b.get() != null) {
            this.a.c();
        }
    }

    @l
    public TextInputSession d(@l TextFieldValue textFieldValue0, @l ImeOptions imeOptions0, @l Function1 function10, @l Function1 function11) {
        L.p(textFieldValue0, "value");
        L.p(imeOptions0, "imeOptions");
        L.p(function10, "onEditCommand");
        L.p(function11, "onImeActionPerformed");
        this.a.f(textFieldValue0, imeOptions0, function10, function11);
        TextInputSession textInputSession0 = new TextInputSession(this, this.a);
        this.b.set(textInputSession0);
        return textInputSession0;
    }

    public void e(@l TextInputSession textInputSession0) {
        L.p(textInputSession0, "session");
        if(d.a(this.b, textInputSession0, null)) {
            this.a.a();
        }
    }
}

