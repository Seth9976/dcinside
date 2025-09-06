package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import androidx.window.core.Bounds;
import androidx.window.extensions.layout.DisplayFeature;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class ExtensionsWindowLayoutInfoAdapter {
    @l
    public static final ExtensionsWindowLayoutInfoAdapter a;

    static {
        ExtensionsWindowLayoutInfoAdapter.a = new ExtensionsWindowLayoutInfoAdapter();
    }

    @m
    public final FoldingFeature a(@l Activity activity0, @l androidx.window.extensions.layout.FoldingFeature foldingFeature0) {
        State foldingFeature$State0;
        Type hardwareFoldingFeature$Type0;
        L.p(activity0, "activity");
        L.p(foldingFeature0, "oemFeature");
        switch(foldingFeature0.getType()) {
            case 1: {
                hardwareFoldingFeature$Type0 = Type.b.a();
                break;
            }
            case 2: {
                hardwareFoldingFeature$Type0 = Type.b.b();
                break;
            }
            default: {
                return null;
            }
        }
        switch(foldingFeature0.getState()) {
            case 1: {
                foldingFeature$State0 = State.c;
                break;
            }
            case 2: {
                foldingFeature$State0 = State.d;
                break;
            }
            default: {
                return null;
            }
        }
        Rect rect0 = foldingFeature0.getBounds();
        L.o(rect0, "oemFeature.bounds");
        if(this.c(activity0, new Bounds(rect0))) {
            Rect rect1 = foldingFeature0.getBounds();
            L.o(rect1, "oemFeature.bounds");
            return new HardwareFoldingFeature(new Bounds(rect1), hardwareFoldingFeature$Type0, foldingFeature$State0);
        }
        return null;
    }

    @l
    public final WindowLayoutInfo b(@l Activity activity0, @l androidx.window.extensions.layout.WindowLayoutInfo windowLayoutInfo0) {
        FoldingFeature foldingFeature0;
        L.p(activity0, "activity");
        L.p(windowLayoutInfo0, "info");
        List list0 = windowLayoutInfo0.getDisplayFeatures();
        L.o(list0, "info.displayFeatures");
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            DisplayFeature displayFeature0 = (DisplayFeature)object0;
            if(displayFeature0 instanceof androidx.window.extensions.layout.FoldingFeature) {
                L.o(displayFeature0, "feature");
                foldingFeature0 = ExtensionsWindowLayoutInfoAdapter.a.a(activity0, ((androidx.window.extensions.layout.FoldingFeature)displayFeature0));
            }
            else {
                foldingFeature0 = null;
            }
            if(foldingFeature0 != null) {
                arrayList0.add(foldingFeature0);
            }
        }
        return new WindowLayoutInfo(arrayList0);
    }

    private final boolean c(Activity activity0, Bounds bounds0) {
        Rect rect0 = WindowMetricsCalculatorCompat.b.a(activity0).a();
        if(bounds0.h()) {
            return false;
        }
        if(bounds0.f() != rect0.width() && bounds0.b() != rect0.height()) {
            return false;
        }
        return bounds0.f() >= rect0.width() || bounds0.b() >= rect0.height() ? bounds0.f() != rect0.width() || bounds0.b() != rect0.height() : false;
    }
}

