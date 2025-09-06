package androidx.compose.ui.layout;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.k;
import kotlin.m;
import y4.l;

public final class RelocationRequesterModifierKt {
    @ExperimentalComposeUiApi
    @k(level = m.b, message = "Please use bringIntoViewRequester instead.", replaceWith = @c0(expression = "bringIntoViewRequester", imports = {"androidx.compose.foundation.relocation.bringIntoViewRequester"}))
    @l
    public static final Modifier a(@l Modifier modifier0, @l Object object0) {
        L.p(modifier0, "<this>");
        L.p(object0, "relocationRequester");
        return modifier0;
    }
}

