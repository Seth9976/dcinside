package kotlin.comparisons;

import java.util.Comparator;
import kotlin.jvm.functions.Function1;

public final class e implements Comparator {
    public final Function1[] a;

    public e(Function1[] arr_function1) {
        this.a = arr_function1;
    }

    @Override
    public final int compare(Object object0, Object object1) {
        return g.i(this.a, object0, object1);
    }
}

