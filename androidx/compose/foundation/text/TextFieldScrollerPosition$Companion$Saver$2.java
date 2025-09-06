package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;
import y4.m;

final class TextFieldScrollerPosition.Companion.Saver.2 extends N implements Function1 {
    public static final TextFieldScrollerPosition.Companion.Saver.2 e;

    static {
        TextFieldScrollerPosition.Companion.Saver.2.e = new TextFieldScrollerPosition.Companion.Saver.2();
    }

    TextFieldScrollerPosition.Companion.Saver.2() {
        super(1);
    }

    @m
    public final TextFieldScrollerPosition a(@l List list0) {
        L.p(list0, "restored");
        Object object0 = list0.get(1);
        L.n(object0, "null cannot be cast to non-null type kotlin.Boolean");
        Object object1 = list0.get(0);
        L.n(object1, "null cannot be cast to non-null type kotlin.Float");
        return new TextFieldScrollerPosition((((Boolean)object0).booleanValue() ? Orientation.a : Orientation.b), ((float)(((Float)object1))));
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.a(((List)object0));
    }
}

