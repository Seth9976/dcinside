package androidx.compose.ui.tooling.preview;

import e.a;
import kotlin.sequences.m;
import y4.l;

public interface PreviewParameterProvider {
    public static final class DefaultImpls {
        @Deprecated
        public static int a(@l PreviewParameterProvider previewParameterProvider0) {
            return a.a(previewParameterProvider0);
        }
    }

    @l
    m Q();

    int getCount();
}

