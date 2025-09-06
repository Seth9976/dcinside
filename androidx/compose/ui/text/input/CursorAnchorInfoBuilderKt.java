package androidx.compose.ui.text.input;

import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo.Builder;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.jvm.internal.L;
import y4.l;

public final class CursorAnchorInfoBuilderKt {
    @l
    public static final CursorAnchorInfo a(@l CursorAnchorInfo.Builder cursorAnchorInfo$Builder0, @l TextFieldValue textFieldValue0, @l TextLayoutResult textLayoutResult0, @l Matrix matrix0) {
        L.p(cursorAnchorInfo$Builder0, "<this>");
        L.p(textFieldValue0, "textFieldValue");
        L.p(textLayoutResult0, "textLayoutResult");
        L.p(matrix0, "matrix");
        cursorAnchorInfo$Builder0.reset();
        cursorAnchorInfo$Builder0.setMatrix(matrix0);
        int v = TextRange.l(textFieldValue0.h());
        cursorAnchorInfo$Builder0.setSelectionRange(v, TextRange.k(textFieldValue0.h()));
        CursorAnchorInfoBuilderKt.b(cursorAnchorInfo$Builder0, v, textLayoutResult0);
        TextRange textRange0 = textFieldValue0.g();
        int v1 = -1;
        int v2 = textRange0 == null ? -1 : TextRange.l(textRange0.r());
        TextRange textRange1 = textFieldValue0.g();
        if(textRange1 != null) {
            v1 = TextRange.k(textRange1.r());
        }
        if(v2 >= 0 && v2 < v1) {
            cursorAnchorInfo$Builder0.setComposingText(v2, textFieldValue0.i().subSequence(v2, v1));
        }
        CursorAnchorInfo cursorAnchorInfo0 = cursorAnchorInfo$Builder0.build();
        L.o(cursorAnchorInfo0, "build()");
        return cursorAnchorInfo0;
    }

    private static final CursorAnchorInfo.Builder b(CursorAnchorInfo.Builder cursorAnchorInfo$Builder0, int v, TextLayoutResult textLayoutResult0) {
        if(v < 0) {
            return cursorAnchorInfo$Builder0;
        }
        Rect rect0 = textLayoutResult0.e(v);
        cursorAnchorInfo$Builder0.setInsertionMarkerLocation(rect0.t(), rect0.B(), rect0.j(), rect0.j(), (textLayoutResult0.c(v) == ResolvedTextDirection.b ? 0 : 4));
        return cursorAnchorInfo$Builder0;
    }
}

