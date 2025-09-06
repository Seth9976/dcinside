package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.OffsetMapping;
import kotlin.jvm.internal.w;

public final class TextPreparedSelection extends BaseTextPreparedSelection {
    private TextPreparedSelection(AnnotatedString annotatedString0, long v, TextLayoutResult textLayoutResult0, OffsetMapping offsetMapping0, TextPreparedSelectionState textPreparedSelectionState0) {
        super(annotatedString0, v, textLayoutResult0, offsetMapping0, textPreparedSelectionState0, null);
    }

    public TextPreparedSelection(AnnotatedString annotatedString0, long v, TextLayoutResult textLayoutResult0, OffsetMapping offsetMapping0, TextPreparedSelectionState textPreparedSelectionState0, int v1, w w0) {
        this(annotatedString0, v, ((v1 & 4) == 0 ? textLayoutResult0 : null), ((v1 & 8) == 0 ? offsetMapping0 : OffsetMapping.a.a()), ((v1 & 16) == 0 ? textPreparedSelectionState0 : new TextPreparedSelectionState()), null);
    }

    public TextPreparedSelection(AnnotatedString annotatedString0, long v, TextLayoutResult textLayoutResult0, OffsetMapping offsetMapping0, TextPreparedSelectionState textPreparedSelectionState0, w w0) {
        this(annotatedString0, v, textLayoutResult0, offsetMapping0, textPreparedSelectionState0);
    }
}

