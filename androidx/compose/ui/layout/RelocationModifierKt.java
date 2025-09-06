package androidx.compose.ui.layout;

import A3.o;
import A3.p;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.L;
import kotlin.k;
import kotlin.m;
import y4.l;

public final class RelocationModifierKt {
    @ExperimentalComposeUiApi
    @k(level = m.b, message = "Please use BringIntoViewResponder instead.")
    @l
    public static final Modifier a(@l Modifier modifier0, @l o o0, @l p p0) {
        L.p(modifier0, "<this>");
        L.p(o0, "onProvideDestination");
        L.p(p0, "onPerformRelocation");
        return modifier0;
    }
}

