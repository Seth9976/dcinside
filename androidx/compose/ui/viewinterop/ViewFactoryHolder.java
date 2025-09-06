package androidx.compose.ui.viewinterop;

import A3.a;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.saveable.SaveableStateRegistry.Entry;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidView.android.kt\nandroidx/compose/ui/viewinterop/ViewFactoryHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,374:1\n1#2:375\n*E\n"})
public final class ViewFactoryHolder extends AndroidViewHolder implements ViewRootForInspector {
    @l
    private Function1 A;
    @l
    private Function1 B;
    @l
    private Function1 C;
    @l
    private final View v;
    @l
    private final NestedScrollDispatcher w;
    @m
    private final SaveableStateRegistry x;
    @l
    private final String y;
    @m
    private Entry z;

    private ViewFactoryHolder(Context context0, CompositionContext compositionContext0, View view0, NestedScrollDispatcher nestedScrollDispatcher0, SaveableStateRegistry saveableStateRegistry0, String s) {
        super(context0, compositionContext0, nestedScrollDispatcher0);
        this.v = view0;
        this.w = nestedScrollDispatcher0;
        this.x = saveableStateRegistry0;
        this.y = s;
        this.setClipChildren(false);
        this.setView$ui_release(view0);
        SparseArray sparseArray0 = null;
        Object object0 = saveableStateRegistry0 == null ? null : saveableStateRegistry0.f(s);
        if(object0 instanceof SparseArray) {
            sparseArray0 = (SparseArray)object0;
        }
        if(sparseArray0 != null) {
            view0.restoreHierarchyState(sparseArray0);
        }
        this.o();
        this.A = AndroidView_androidKt.e();
        this.B = AndroidView_androidKt.e();
        this.C = AndroidView_androidKt.e();
    }

    ViewFactoryHolder(Context context0, CompositionContext compositionContext0, View view0, NestedScrollDispatcher nestedScrollDispatcher0, SaveableStateRegistry saveableStateRegistry0, String s, int v, w w0) {
        if((v & 2) != 0) {
            compositionContext0 = null;
        }
        this(context0, compositionContext0, view0, nestedScrollDispatcher0, saveableStateRegistry0, s);
    }

    public ViewFactoryHolder(@l Context context0, @l Function1 function10, @m CompositionContext compositionContext0, @l NestedScrollDispatcher nestedScrollDispatcher0, @m SaveableStateRegistry saveableStateRegistry0, @l String s) {
        L.p(context0, "context");
        L.p(function10, "factory");
        L.p(nestedScrollDispatcher0, "dispatcher");
        L.p(s, "saveStateKey");
        this(context0, compositionContext0, ((View)function10.invoke(context0)), nestedScrollDispatcher0, saveableStateRegistry0, s);
    }

    public ViewFactoryHolder(Context context0, Function1 function10, CompositionContext compositionContext0, NestedScrollDispatcher nestedScrollDispatcher0, SaveableStateRegistry saveableStateRegistry0, String s, int v, w w0) {
        if((v & 4) != 0) {
            compositionContext0 = null;
        }
        this(context0, function10, compositionContext0, nestedScrollDispatcher0, saveableStateRegistry0, s);
    }

    @l
    public final NestedScrollDispatcher getDispatcher() {
        return this.w;
    }

    @l
    public final Function1 getReleaseBlock() {
        return this.C;
    }

    @l
    public final Function1 getResetBlock() {
        return this.B;
    }

    @Override  // androidx.compose.ui.platform.ViewRootForInspector
    public AbstractComposeView getSubCompositionView() {
        return null;
    }

    @l
    public final View getTypedView() {
        return this.v;
    }

    @l
    public final Function1 getUpdateBlock() {
        return this.A;
    }

    @Override  // androidx.compose.ui.platform.ViewRootForInspector
    @l
    public View getViewRoot() {
        return this;
    }

    private final void o() {
        SaveableStateRegistry saveableStateRegistry0 = this.x;
        if(saveableStateRegistry0 != null) {
            androidx.compose.ui.viewinterop.ViewFactoryHolder.registerSaveStateProvider.1 viewFactoryHolder$registerSaveStateProvider$10 = new a() {
                final ViewFactoryHolder e;

                {
                    this.e = viewFactoryHolder0;
                    super(0);
                }

                @Override  // A3.a
                @m
                public final Object invoke() {
                    SparseArray sparseArray0 = new SparseArray();
                    this.e.getTypedView().saveHierarchyState(sparseArray0);
                    return sparseArray0;
                }
            };
            this.setSaveableRegistryEntry(saveableStateRegistry0.e(this.y, viewFactoryHolder$registerSaveStateProvider$10));
        }
    }

    private final void q() {
        this.setSaveableRegistryEntry(null);
    }

    public final void setReleaseBlock(@l Function1 function10) {
        L.p(function10, "value");
        this.C = function10;
        this.setRelease(new a() {
            final ViewFactoryHolder e;

            {
                this.e = viewFactoryHolder0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.getReleaseBlock().invoke(this.e.getTypedView());
                this.e.q();
            }
        });
    }

    public final void setResetBlock(@l Function1 function10) {
        L.p(function10, "value");
        this.B = function10;
        this.setReset(new a() {
            final ViewFactoryHolder e;

            {
                this.e = viewFactoryHolder0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.getResetBlock().invoke(this.e.getTypedView());
            }
        });
    }

    private final void setSaveableRegistryEntry(Entry saveableStateRegistry$Entry0) {
        Entry saveableStateRegistry$Entry1 = this.z;
        if(saveableStateRegistry$Entry1 != null) {
            saveableStateRegistry$Entry1.a();
        }
        this.z = saveableStateRegistry$Entry0;
    }

    public final void setUpdateBlock(@l Function1 function10) {
        L.p(function10, "value");
        this.A = function10;
        this.setUpdate(new a() {
            final ViewFactoryHolder e;

            {
                this.e = viewFactoryHolder0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.getUpdateBlock().invoke(this.e.getTypedView());
            }
        });
    }
}

