package androidx.compose.ui.text.input;

import A3.a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
@s0({"SMAP\nTextInputService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextInputService.kt\nandroidx/compose/ui/text/input/TextInputSession\n*L\n1#1,289:1\n153#1,5:290\n153#1,5:295\n153#1,5:300\n153#1,5:305\n*S KotlinDebug\n*F\n+ 1 TextInputService.kt\nandroidx/compose/ui/text/input/TextInputSession\n*L\n172#1:290,5\n194#1:295,5\n212#1:300,5\n227#1:305,5\n*E\n"})
public final class TextInputSession {
    @l
    private final TextInputService a;
    @l
    private final PlatformTextInputService b;
    public static final int c = 8;

    static {
    }

    public TextInputSession(@l TextInputService textInputService0, @l PlatformTextInputService platformTextInputService0) {
        L.p(textInputService0, "textInputService");
        L.p(platformTextInputService0, "platformTextInputService");
        super();
        this.a = textInputService0;
        this.b = platformTextInputService0;
    }

    public final void a() {
        this.a.e(this);
    }

    private final boolean b(a a0) {
        boolean z = this.d();
        if(z) {
            a0.invoke();
        }
        return z;
    }

    public final boolean c() {
        boolean z = this.d();
        if(z) {
            this.b.b();
        }
        return z;
    }

    public final boolean d() {
        return L.g(this.a.a(), this);
    }

    public final boolean e(@l Rect rect0) {
        L.p(rect0, "rect");
        boolean z = this.d();
        if(z) {
            this.b.e(rect0);
        }
        return z;
    }

    public final boolean f() {
        boolean z = this.d();
        if(z) {
            this.b.c();
        }
        return z;
    }

    public final boolean g(@m TextFieldValue textFieldValue0, @l TextFieldValue textFieldValue1) {
        L.p(textFieldValue1, "newValue");
        boolean z = this.d();
        if(z) {
            this.b.d(textFieldValue0, textFieldValue1);
        }
        return z;
    }
}

