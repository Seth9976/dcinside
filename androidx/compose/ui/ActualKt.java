package androidx.compose.ui;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import java.lang.reflect.Field;
import java.util.Comparator;
import java.util.List;
import kotlin.comparisons.a;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nActual.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Actual.kt\nandroidx/compose/ui/ActualKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,50:1\n6442#2:51\n33#3,6:52\n*S KotlinDebug\n*F\n+ 1 Actual.kt\nandroidx/compose/ui/ActualKt\n*L\n35#1:51\n36#1:52,6\n*E\n"})
public final class ActualKt {
    public static final boolean a(@l Object object0, @l Object object1) {
        L.p(object0, "a");
        L.p(object1, "b");
        return object0.getClass() == object1.getClass();
    }

    public static final void b(@l InspectorInfo inspectorInfo0, @l ModifierNodeElement modifierNodeElement0) {
        L.p(inspectorInfo0, "<this>");
        L.p(modifierNodeElement0, "element");
        Field[] arr_field = modifierNodeElement0.getClass().getDeclaredFields();
        L.o(arr_field, "element.javaClass.declaredFields");
        List list0 = kotlin.collections.l.Mv(arr_field, new Comparator() {
            @Override
            public final int compare(Object object0, Object object1) {
                return a.l(((Field)object0).getName(), ((Field)object1).getName());
            }
        });
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Field field0 = (Field)list0.get(v1);
            if(!field0.getDeclaringClass().isAssignableFrom(ModifierNodeElement.class)) {
                try {
                    field0.setAccessible(true);
                    String s = field0.getName();
                    L.o(s, "field.name");
                    inspectorInfo0.b().c(s, field0.get(modifierNodeElement0));
                }
                catch(SecurityException | IllegalAccessException unused_ex) {
                }
            }
        }
    }
}

