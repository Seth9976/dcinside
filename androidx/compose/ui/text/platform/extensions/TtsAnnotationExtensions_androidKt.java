package androidx.compose.ui.text.platform.extensions;

import android.text.style.TtsSpan.VerbatimBuilder;
import android.text.style.TtsSpan;
import androidx.compose.ui.text.TtsAnnotation;
import androidx.compose.ui.text.VerbatimTtsAnnotation;
import kotlin.J;
import kotlin.jvm.internal.L;
import y4.l;

public final class TtsAnnotationExtensions_androidKt {
    @l
    public static final TtsSpan a(@l TtsAnnotation ttsAnnotation0) {
        L.p(ttsAnnotation0, "<this>");
        if(!(ttsAnnotation0 instanceof VerbatimTtsAnnotation)) {
            throw new J();
        }
        return TtsAnnotationExtensions_androidKt.b(((VerbatimTtsAnnotation)ttsAnnotation0));
    }

    @l
    public static final TtsSpan b(@l VerbatimTtsAnnotation verbatimTtsAnnotation0) {
        L.p(verbatimTtsAnnotation0, "<this>");
        TtsSpan ttsSpan0 = new TtsSpan.VerbatimBuilder(verbatimTtsAnnotation0.a()).build();
        L.o(ttsSpan0, "builder.build()");
        return ttsSpan0;
    }
}

