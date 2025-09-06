package androidx.compose.animation;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@ExperimentalAnimationApi
@StabilityInferred(parameters = 0)
@s0({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/ContentTransform\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,780:1\n76#2:781\n102#2,2:782\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/ContentTransform\n*L\n219#1:781\n219#1:782,2\n*E\n"})
public final class ContentTransform {
    @l
    private final EnterTransition a;
    @l
    private final ExitTransition b;
    @l
    private final MutableState c;
    @m
    private SizeTransform d;
    public static final int e = 8;

    static {
    }

    public ContentTransform(@l EnterTransition enterTransition0, @l ExitTransition exitTransition0, float f, @m SizeTransform sizeTransform0) {
        L.p(enterTransition0, "targetContentEnter");
        L.p(exitTransition0, "initialContentExit");
        super();
        this.a = enterTransition0;
        this.b = exitTransition0;
        this.c = SnapshotStateKt__SnapshotStateKt.g(f, null, 2, null);
        this.d = sizeTransform0;
    }

    public ContentTransform(EnterTransition enterTransition0, ExitTransition exitTransition0, float f, SizeTransform sizeTransform0, int v, w w0) {
        if((v & 4) != 0) {
            f = 0.0f;
        }
        if((v & 8) != 0) {
            sizeTransform0 = AnimatedContentKt.e(false, null, 3, null);
        }
        this(enterTransition0, exitTransition0, f, sizeTransform0);
    }

    @l
    public final ExitTransition a() {
        return this.b;
    }

    @m
    public final SizeTransform b() {
        return this.d;
    }

    @l
    public final EnterTransition c() {
        return this.a;
    }

    public final float d() {
        return ((Number)this.c.getValue()).floatValue();
    }

    public final void e(@m SizeTransform sizeTransform0) {
        this.d = sizeTransform0;
    }

    public final void f(float f) {
        this.c.setValue(f);
    }
}

