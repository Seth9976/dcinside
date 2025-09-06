package androidx.compose.foundation.text;

import A3.o;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;

final class TextFieldScrollerPosition.Companion.Saver.1 extends N implements o {
    public static final TextFieldScrollerPosition.Companion.Saver.1 e;

    static {
        TextFieldScrollerPosition.Companion.Saver.1.e = new TextFieldScrollerPosition.Companion.Saver.1();
    }

    TextFieldScrollerPosition.Companion.Saver.1() {
        super(2);
    }

    @l
    public final List a(@l SaverScope saverScope0, @l TextFieldScrollerPosition textFieldScrollerPosition0) {
        L.p(saverScope0, "$this$listSaver");
        L.p(textFieldScrollerPosition0, "it");
        Float float0 = textFieldScrollerPosition0.d();
        return textFieldScrollerPosition0.f() == Orientation.a ? u.O(new Object[]{float0, Boolean.TRUE}) : u.O(new Object[]{float0, Boolean.FALSE});
    }

    @Override  // A3.o
    public Object invoke(Object object0, Object object1) {
        return this.a(((SaverScope)object0), ((TextFieldScrollerPosition)object1));
    }
}

