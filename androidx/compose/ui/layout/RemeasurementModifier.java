package androidx.compose.ui.layout;

import A3.o;
import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.a;
import androidx.compose.ui.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

public interface RemeasurementModifier extends Element {
    public static final class DefaultImpls {
        @Deprecated
        public static boolean a(@l RemeasurementModifier remeasurementModifier0, @l Function1 function10) {
            L.p(function10, "predicate");
            return b.a(remeasurementModifier0, function10);
        }

        @Deprecated
        public static boolean b(@l RemeasurementModifier remeasurementModifier0, @l Function1 function10) {
            L.p(function10, "predicate");
            return b.b(remeasurementModifier0, function10);
        }

        @Deprecated
        public static Object c(@l RemeasurementModifier remeasurementModifier0, Object object0, @l o o0) {
            L.p(o0, "operation");
            return b.c(remeasurementModifier0, object0, o0);
        }

        @Deprecated
        public static Object d(@l RemeasurementModifier remeasurementModifier0, Object object0, @l o o0) {
            L.p(o0, "operation");
            return b.d(remeasurementModifier0, object0, o0);
        }

        @Deprecated
        @l
        public static Modifier e(@l RemeasurementModifier remeasurementModifier0, @l Modifier modifier0) {
            L.p(modifier0, "other");
            return a.a(remeasurementModifier0, modifier0);
        }
    }

    void h1(@l Remeasurement arg1);
}

