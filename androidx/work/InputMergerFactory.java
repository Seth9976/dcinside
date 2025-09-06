package androidx.work;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public abstract class InputMergerFactory {
    @m
    public abstract InputMerger a(@l String arg1);

    @RestrictTo({Scope.b})
    @m
    public final InputMerger b(@l String s) {
        L.p(s, "className");
        InputMerger inputMerger0 = this.a(s);
        return inputMerger0 == null ? InputMergerKt.a(s) : inputMerger0;
    }
}

