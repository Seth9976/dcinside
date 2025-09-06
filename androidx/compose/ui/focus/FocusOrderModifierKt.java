package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import kotlin.c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.k;
import y4.l;

public final class FocusOrderModifierKt {
    @k(message = "Use focusRequester() instead", replaceWith = @c0(expression = "this.focusRequester(focusRequester)", imports = {"androidx.compose.ui.focus.focusRequester"}))
    @l
    public static final Modifier a(@l Modifier modifier0, @l FocusRequester focusRequester0) {
        L.p(modifier0, "<this>");
        L.p(focusRequester0, "focusRequester");
        return FocusRequesterModifierKt.a(modifier0, focusRequester0);
    }

    @k(message = "Use focusProperties() and focusRequester() instead", replaceWith = @c0(expression = "this.focusRequester(focusRequester).focusProperties(focusOrderReceiver)", imports = {"androidx.compose.ui.focus.focusProperties, androidx.compose.ui.focus.focusRequester"}))
    @l
    public static final Modifier b(@l Modifier modifier0, @l FocusRequester focusRequester0, @l Function1 function10) {
        L.p(modifier0, "<this>");
        L.p(focusRequester0, "focusRequester");
        L.p(function10, "focusOrderReceiver");
        return FocusPropertiesKt.a(FocusRequesterModifierKt.a(modifier0, focusRequester0), new FocusOrderToProperties(function10));
    }

    @k(message = "Use focusProperties() instead", replaceWith = @c0(expression = "this.focusProperties(focusOrderReceiver)", imports = {"androidx.compose.ui.focus.focusProperties"}))
    @l
    public static final Modifier c(@l Modifier modifier0, @l Function1 function10) {
        L.p(modifier0, "<this>");
        L.p(function10, "focusOrderReceiver");
        return FocusPropertiesKt.a(modifier0, new FocusOrderToProperties(function10));
    }
}

