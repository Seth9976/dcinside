package androidx.compose.ui.modifier;

import androidx.compose.ui.ExperimentalComposeUiApi;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.V;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import y4.l;

@s0({"SMAP\nModifierLocalNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalNode.kt\nandroidx/compose/ui/modifier/ModifierLocalNodeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,220:1\n1#2:221\n11335#3:222\n11670#3,3:223\n37#4,2:226\n*S KotlinDebug\n*F\n+ 1 ModifierLocalNode.kt\nandroidx/compose/ui/modifier/ModifierLocalNodeKt\n*L\n209#1:222\n209#1:223,3\n209#1:226,2\n*E\n"})
public final class ModifierLocalNodeKt {
    @ExperimentalComposeUiApi
    @l
    public static final ModifierLocalMap a() {
        return EmptyMap.b;
    }

    @ExperimentalComposeUiApi
    @l
    public static final ModifierLocalMap b(@l ModifierLocal modifierLocal0) {
        L.p(modifierLocal0, "key");
        return new SingleLocalMap(modifierLocal0);
    }

    @ExperimentalComposeUiApi
    @l
    public static final ModifierLocalMap c(@l V v0) {
        L.p(v0, "entry");
        ModifierLocalMap modifierLocalMap0 = new SingleLocalMap(((ModifierLocal)v0.e()));
        ((SingleLocalMap)modifierLocalMap0).c(((ModifierLocal)v0.e()), v0.f());
        return modifierLocalMap0;
    }

    @ExperimentalComposeUiApi
    @l
    public static final ModifierLocalMap d(@l ModifierLocal[] arr_modifierLocal) {
        L.p(arr_modifierLocal, "keys");
        ArrayList arrayList0 = new ArrayList(arr_modifierLocal.length);
        for(int v = 0; v < arr_modifierLocal.length; ++v) {
            arrayList0.add(r0.a(arr_modifierLocal[v], null));
        }
        V[] arr_v = (V[])arrayList0.toArray(new V[0]);
        return new MultiLocalMap(((V[])Arrays.copyOf(arr_v, arr_v.length)));
    }

    @ExperimentalComposeUiApi
    @l
    public static final ModifierLocalMap e(@l V[] arr_v) {
        L.p(arr_v, "entries");
        return new MultiLocalMap(((V[])Arrays.copyOf(arr_v, arr_v.length)));
    }
}

