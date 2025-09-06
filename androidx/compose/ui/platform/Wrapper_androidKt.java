package androidx.compose.ui.platform;

import A3.o;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.annotation.MainThread;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.R.id;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.UiApplier;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nWrapper.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Wrapper.android.kt\nandroidx/compose/ui/platform/Wrapper_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,217:1\n1#2:218\n*E\n"})
public final class Wrapper_androidKt {
    @l
    private static final String a = "Wrapper";
    @l
    private static final ViewGroup.LayoutParams b;

    static {
        Wrapper_androidKt.b = new ViewGroup.LayoutParams(-2, -2);
    }

    @MainThread
    @l
    public static final Composition a(@l LayoutNode layoutNode0, @l CompositionContext compositionContext0) {
        L.p(layoutNode0, "container");
        L.p(compositionContext0, "parent");
        return CompositionKt.a(new UiApplier(layoutNode0), compositionContext0);
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    private static final Composition b(AndroidComposeView androidComposeView0, CompositionContext compositionContext0, o o0) {
        if(Wrapper_androidKt.d(androidComposeView0)) {
            Set set0 = Collections.newSetFromMap(new WeakHashMap());
            androidComposeView0.setTag(id.inspection_slot_table_set, set0);
            Wrapper_androidKt.c();
        }
        Composition composition0 = CompositionKt.a(new UiApplier(androidComposeView0.getRoot()), compositionContext0);
        Object object0 = androidComposeView0.getTag(id.wrapped_composition_tag);
        Composition composition1 = object0 instanceof WrappedComposition ? ((WrappedComposition)object0) : null;
        if(composition1 == null) {
            composition1 = new WrappedComposition(androidComposeView0, composition0);
            androidComposeView0.setTag(0x7F0B1100, composition1);  // id:wrapped_composition_tag
        }
        ((WrappedComposition)composition1).b(o0);
        return composition1;
    }

    private static final void c() {
        try {
            Field field0 = InspectableValueKt.class.getDeclaredField("isDebugInspectorInfoEnabled");
            field0.setAccessible(true);
            field0.setBoolean(null, true);
        }
        catch(Exception unused_ex) {
            Log.w("Wrapper", "Could not access isDebugInspectorInfoEnabled. Please set explicitly.");
        }
    }

    private static final boolean d(AndroidComposeView androidComposeView0) {
        return Build.VERSION.SDK_INT >= 29 && !WrapperVerificationHelperMethods.a.a(androidComposeView0).isEmpty();
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    @l
    public static final Composition e(@l AbstractComposeView abstractComposeView0, @l CompositionContext compositionContext0, @l o o0) {
        L.p(abstractComposeView0, "<this>");
        L.p(compositionContext0, "parent");
        L.p(o0, "content");
        GlobalSnapshotManager.a.a();
        AndroidComposeView androidComposeView0 = null;
        if(abstractComposeView0.getChildCount() > 0) {
            View view0 = abstractComposeView0.getChildAt(0);
            if(view0 instanceof AndroidComposeView) {
                androidComposeView0 = (AndroidComposeView)view0;
            }
        }
        else {
            abstractComposeView0.removeAllViews();
        }
        if(androidComposeView0 == null) {
            Context context0 = abstractComposeView0.getContext();
            L.o(context0, "context");
            androidComposeView0 = new AndroidComposeView(context0);
            abstractComposeView0.addView(androidComposeView0, Wrapper_androidKt.b);
        }
        return Wrapper_androidKt.b(androidComposeView0, compositionContext0, o0);
    }
}

