package androidx.compose.ui.text.input;

import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.text.TextRange;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.L;
import y4.l;

public final class TextInputServiceAndroid_androidKt {
    @l
    private static final String a = "TextInputServiceAndroid";

    @l
    public static final Executor d(@l Choreographer choreographer0) {
        L.p(choreographer0, "<this>");
        return (Runnable runnable0) -> {
            L.p(choreographer0, "$this_asExecutor");
            choreographer0.postFrameCallback((long v) -> runnable0.run());
        };
    }

    // 检测为 Lambda 实现
    private static final void e(Choreographer choreographer0, Runnable runnable0) [...]

    // 检测为 Lambda 实现
    private static final void f(Runnable runnable0, long v) [...]

    private static final boolean g(int v, int v1) {
        return (v & v1) == v1;
    }

    public static final void h(@l EditorInfo editorInfo0, @l ImeOptions imeOptions0, @l TextFieldValue textFieldValue0) {
        L.p(editorInfo0, "<this>");
        L.p(imeOptions0, "imeOptions");
        L.p(textFieldValue0, "textFieldValue");
        int v = imeOptions0.f();
        int v1 = 6;
        if(ImeAction.l(v, 1)) {
            if(imeOptions0.h()) {
                goto label_28;
            }
            v1 = 0;
        }
        else {
            if(ImeAction.l(v, 0)) {
                v1 = 1;
                goto label_28;
            }
            if(ImeAction.l(v, 2)) {
                v1 = 2;
                goto label_28;
            }
            if(ImeAction.l(v, 6)) {
                v1 = 5;
                goto label_28;
            }
            if(ImeAction.l(v, 5)) {
                v1 = 7;
                goto label_28;
            }
            if(ImeAction.l(v, 3)) {
                v1 = 3;
                goto label_28;
            }
            if(ImeAction.l(v, 4)) {
                v1 = 4;
            }
            else if(ImeAction.l(v, 7)) {
            }
            else {
                throw new IllegalStateException("invalid ImeAction");
            }
        }
    label_28:
        editorInfo0.imeOptions = v1;
        int v2 = imeOptions0.g();
        if(KeyboardType.m(v2, 1)) {
            editorInfo0.inputType = 1;
        }
        else {
            if(KeyboardType.m(v2, 2)) {
                editorInfo0.inputType = 1;
                editorInfo0.imeOptions |= 0x80000000;
                goto label_57;
            }
            if(KeyboardType.m(v2, 3)) {
                editorInfo0.inputType = 2;
                goto label_57;
            }
            if(KeyboardType.m(v2, 4)) {
                editorInfo0.inputType = 3;
                goto label_57;
            }
            if(KeyboardType.m(v2, 5)) {
                editorInfo0.inputType = 17;
                goto label_57;
            }
            if(KeyboardType.m(v2, 6)) {
                editorInfo0.inputType = 33;
                goto label_57;
            }
            if(KeyboardType.m(v2, 7)) {
                editorInfo0.inputType = 0x81;
                goto label_57;
            }
            if(KeyboardType.m(v2, 8)) {
                editorInfo0.inputType = 18;
            }
            else if(KeyboardType.m(v2, 9)) {
                editorInfo0.inputType = 0x2002;
            }
            else {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
        }
    label_57:
        if(!imeOptions0.h() && TextInputServiceAndroid_androidKt.g(editorInfo0.inputType, 1)) {
            editorInfo0.inputType |= 0x20000;
            if(ImeAction.l(imeOptions0.f(), 1)) {
                editorInfo0.imeOptions |= 0x40000000;
            }
        }
        if(TextInputServiceAndroid_androidKt.g(editorInfo0.inputType, 1)) {
            int v3 = imeOptions0.e();
            if(KeyboardCapitalization.h(v3, 1)) {
                editorInfo0.inputType |= 0x1000;
            }
            else if(KeyboardCapitalization.h(v3, 2)) {
                editorInfo0.inputType |= 0x2000;
            }
            else if(KeyboardCapitalization.h(v3, 3)) {
                editorInfo0.inputType |= 0x4000;
            }
            if(imeOptions0.d()) {
                editorInfo0.inputType |= 0x8000;
            }
        }
        editorInfo0.initialSelStart = TextRange.n(textFieldValue0.h());
        editorInfo0.initialSelEnd = (int)(textFieldValue0.h() & 0xFFFFFFFFL);
        EditorInfoCompat.k(editorInfo0, textFieldValue0.i());
        editorInfo0.imeOptions |= 0x2000000;
    }

    // 去混淆评级： 低(30)
    private static final void i(EditorInfo editorInfo0) {
    }
}

