package androidx.compose.runtime;

import kotlin.jvm.functions.Function1;
import y4.l;

@Stable
public interface MutableState extends State {
    @l
    Function1 f();

    @Override  // androidx.compose.runtime.State
    Object getValue();

    Object l();

    void setValue(Object arg1);
}

