package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import y4.l;

@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
public final class SemanticsPropertiesAndroid {
    @l
    public static final SemanticsPropertiesAndroid a;
    @l
    private static final SemanticsPropertyKey b;
    public static final int c;

    static {
        SemanticsPropertiesAndroid.a = new SemanticsPropertiesAndroid();
        SemanticsPropertiesAndroid.b = new SemanticsPropertyKey("TestTagsAsResourceId", SemanticsPropertiesAndroid.TestTagsAsResourceId.1.e);
    }

    @ExperimentalComposeUiApi
    @l
    public final SemanticsPropertyKey a() {
        return SemanticsPropertiesAndroid.b;
    }

    @ExperimentalComposeUiApi
    public static void b() {
    }
}

