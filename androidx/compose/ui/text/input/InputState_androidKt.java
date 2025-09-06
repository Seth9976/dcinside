package androidx.compose.ui.text.input;

import android.view.inputmethod.ExtractedText;
import androidx.compose.ui.text.TextRange;
import kotlin.jvm.internal.L;
import kotlin.text.v;
import y4.l;

public final class InputState_androidKt {
    @l
    public static final ExtractedText a(@l TextFieldValue textFieldValue0) {
        L.p(textFieldValue0, "<this>");
        ExtractedText extractedText0 = new ExtractedText();
        extractedText0.text = textFieldValue0.i();
        extractedText0.startOffset = 0;
        extractedText0.partialEndOffset = textFieldValue0.i().length();
        extractedText0.partialStartOffset = -1;
        extractedText0.selectionStart = TextRange.l(textFieldValue0.h());
        extractedText0.selectionEnd = TextRange.k(textFieldValue0.h());
        extractedText0.flags = !v.V2(textFieldValue0.i(), '\n', false, 2, null);
        return extractedText0;
    }
}

