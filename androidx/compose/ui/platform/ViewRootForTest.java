package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.node.RootForTest;
import kotlin.jvm.functions.Function1;
import y4.l;
import y4.m;

@VisibleForTesting
public interface ViewRootForTest extends RootForTest {
    public static final class Companion {
        static final Companion a;
        @m
        private static Function1 b;

        static {
            Companion.a = new Companion();
        }

        @m
        public final Function1 a() {
            return Companion.b;
        }

        @VisibleForTesting
        public static void b() {
        }

        public final void c(@m Function1 function10) {
            Companion.b = function10;
        }
    }

    @l
    public static final Companion s0;

    static {
        ViewRootForTest.s0 = Companion.a;
    }

    boolean g();

    boolean getHasPendingMeasureOrLayout();

    @l
    View getView();

    void x();
}

