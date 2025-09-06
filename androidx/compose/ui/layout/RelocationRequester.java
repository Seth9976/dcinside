package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Rect;
import kotlin.S0;
import kotlin.c0;
import kotlin.coroutines.d;
import kotlin.k;
import kotlin.m;
import y4.l;

@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
@k(level = m.b, message = "Please use BringIntoViewRequester instead.", replaceWith = @c0(expression = "BringIntoViewRequester", imports = {"androidx.compose.foundation.relocation.BringIntoViewRequester"}))
public final class RelocationRequester {
    public static final int a;

    static {
    }

    @k(level = m.b, message = "Please use BringIntoViewRequester instead.", replaceWith = @c0(expression = "bringIntoView", imports = {"androidx.compose.foundation.relocation.BringIntoViewRequester"}))
    @y4.m
    public final Object a(@y4.m Rect rect0, @l d d0) {
        return S0.a;
    }

    public static Object b(RelocationRequester relocationRequester0, Rect rect0, d d0, int v, Object object0) {
        if((v & 1) != 0) {
            rect0 = null;
        }
        return relocationRequester0.a(rect0, d0);
    }
}

