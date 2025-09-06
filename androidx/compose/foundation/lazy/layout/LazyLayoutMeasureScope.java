package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.layout.MeasureScope;
import java.util.List;
import kotlin.jvm.internal.s0;
import y4.l;

@ExperimentalFoundationApi
@Stable
@s0({"SMAP\nLazyLayoutMeasureScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutMeasureScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,147:1\n1#2:148\n174#3:149\n174#3:150\n473#3:151\n152#4:152\n*S KotlinDebug\n*F\n+ 1 LazyLayoutMeasureScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope\n*L\n70#1:149\n73#1:150\n85#1:151\n92#1:152\n*E\n"})
public interface LazyLayoutMeasureScope extends MeasureScope {
    @Override  // androidx.compose.ui.unit.Density
    @Stable
    float C(int arg1);

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    float D(float arg1);

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    long J(long arg1);

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    long M(float arg1);

    @l
    List i0(int arg1, long arg2);

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    long m(long arg1);

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    float p(long arg1);

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    long r(int arg1);

    @Override  // androidx.compose.ui.unit.Density
    @Stable
    long s(float arg1);
}

