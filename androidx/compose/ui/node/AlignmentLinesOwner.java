package androidx.compose.ui.node;

import androidx.compose.ui.layout.Measurable;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import y4.l;
import y4.m;

public interface AlignmentLinesOwner extends Measurable {
    @l
    NodeCoordinator G0();

    @l
    Map e();

    void f();

    @m
    AlignmentLinesOwner h();

    @l
    AlignmentLines k();

    void r0();

    void requestLayout();

    boolean u();

    void u1(@l Function1 arg1);
}

