package androidx.window.layout;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import androidx.annotation.VisibleForTesting;
import androidx.window.core.Bounds;
import androidx.window.core.SpecificationComputer.VerificationMode;
import androidx.window.core.SpecificationComputer;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class SidecarAdapter {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @SuppressLint({"BanUncheckedReflection"})
        @VisibleForTesting
        public final int a(@l SidecarDeviceState sidecarDeviceState0) {
            L.p(sidecarDeviceState0, "sidecarDeviceState");
            return sidecarDeviceState0.posture;
        }

        public final int b(@l SidecarDeviceState sidecarDeviceState0) {
            L.p(sidecarDeviceState0, "sidecarDeviceState");
            int v = this.a(sidecarDeviceState0);
            return v >= 0 && v <= 4 ? v : 0;
        }

        @SuppressLint({"BanUncheckedReflection"})
        @VisibleForTesting
        @l
        public final List c(@l SidecarWindowLayoutInfo sidecarWindowLayoutInfo0) {
            L.p(sidecarWindowLayoutInfo0, "info");
            try {
                return sidecarWindowLayoutInfo0.displayFeatures == null ? u.H() : sidecarWindowLayoutInfo0.displayFeatures;
            }
            catch(NoSuchFieldError unused_ex) {
                try {
                    Object object0 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo0, null);
                    if(object0 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                    }
                    return (List)object0;
                }
                catch(NoSuchMethodException | IllegalAccessException | InvocationTargetException unused_ex) {
                    return u.H();
                }
            }
        }

        @SuppressLint({"BanUncheckedReflection"})
        @VisibleForTesting
        public final void d(@l SidecarDeviceState sidecarDeviceState0, int v) {
            L.p(sidecarDeviceState0, "sidecarDeviceState");
            sidecarDeviceState0.posture = v;
        }

        @SuppressLint({"BanUncheckedReflection"})
        @VisibleForTesting
        public final void e(@l SidecarWindowLayoutInfo sidecarWindowLayoutInfo0, @l List list0) {
            L.p(sidecarWindowLayoutInfo0, "info");
            L.p(list0, "displayFeatures");
            sidecarWindowLayoutInfo0.displayFeatures = list0;
        }
    }

    @l
    private final VerificationMode a;
    @l
    public static final Companion b;
    private static final String c;

    static {
        SidecarAdapter.b = new Companion(null);
        SidecarAdapter.c = "SidecarAdapter";
    }

    public SidecarAdapter() {
        this(null, 1, null);
    }

    public SidecarAdapter(@l VerificationMode specificationComputer$VerificationMode0) {
        L.p(specificationComputer$VerificationMode0, "verificationMode");
        super();
        this.a = specificationComputer$VerificationMode0;
    }

    public SidecarAdapter(VerificationMode specificationComputer$VerificationMode0, int v, w w0) {
        if((v & 1) != 0) {
            specificationComputer$VerificationMode0 = VerificationMode.c;
        }
        this(specificationComputer$VerificationMode0);
    }

    public final boolean a(@m SidecarDeviceState sidecarDeviceState0, @m SidecarDeviceState sidecarDeviceState1) {
        if(L.g(sidecarDeviceState0, sidecarDeviceState1)) {
            return true;
        }
        if(sidecarDeviceState0 == null) {
            return false;
        }
        return sidecarDeviceState1 == null ? false : SidecarAdapter.b.b(sidecarDeviceState0) == SidecarAdapter.b.b(sidecarDeviceState1);
    }

    private final boolean b(SidecarDisplayFeature sidecarDisplayFeature0, SidecarDisplayFeature sidecarDisplayFeature1) {
        if(L.g(sidecarDisplayFeature0, sidecarDisplayFeature1)) {
            return true;
        }
        if(sidecarDisplayFeature0 == null) {
            return false;
        }
        if(sidecarDisplayFeature1 == null) {
            return false;
        }
        return sidecarDisplayFeature0.getType() == sidecarDisplayFeature1.getType() ? L.g(sidecarDisplayFeature0.getRect(), sidecarDisplayFeature1.getRect()) : false;
    }

    private final boolean c(List list0, List list1) {
        if(list0 == list1) {
            return true;
        }
        if(list0 == null) {
            return false;
        }
        if(list1 == null) {
            return false;
        }
        if(list0.size() != list1.size()) {
            return false;
        }
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(!this.b(((SidecarDisplayFeature)list0.get(v1)), ((SidecarDisplayFeature)list1.get(v1)))) {
                return false;
            }
        }
        return true;
    }

    public final boolean d(@m SidecarWindowLayoutInfo sidecarWindowLayoutInfo0, @m SidecarWindowLayoutInfo sidecarWindowLayoutInfo1) {
        if(L.g(sidecarWindowLayoutInfo0, sidecarWindowLayoutInfo1)) {
            return true;
        }
        if(sidecarWindowLayoutInfo0 == null) {
            return false;
        }
        return sidecarWindowLayoutInfo1 == null ? false : this.c(SidecarAdapter.b.c(sidecarWindowLayoutInfo0), SidecarAdapter.b.c(sidecarWindowLayoutInfo1));
    }

    @l
    public final WindowLayoutInfo e(@m SidecarWindowLayoutInfo sidecarWindowLayoutInfo0, @l SidecarDeviceState sidecarDeviceState0) {
        L.p(sidecarDeviceState0, "state");
        if(sidecarWindowLayoutInfo0 == null) {
            return new WindowLayoutInfo(u.H());
        }
        SidecarDeviceState sidecarDeviceState1 = new SidecarDeviceState();
        int v = SidecarAdapter.b.b(sidecarDeviceState0);
        SidecarAdapter.b.d(sidecarDeviceState1, v);
        return new WindowLayoutInfo(this.f(SidecarAdapter.b.c(sidecarWindowLayoutInfo0), sidecarDeviceState1));
    }

    @l
    public final List f(@l List list0, @l SidecarDeviceState sidecarDeviceState0) {
        L.p(list0, "sidecarDisplayFeatures");
        L.p(sidecarDeviceState0, "deviceState");
        List list1 = new ArrayList();
        for(Object object0: list0) {
            DisplayFeature displayFeature0 = this.g(((SidecarDisplayFeature)object0), sidecarDeviceState0);
            if(displayFeature0 != null) {
                list1.add(displayFeature0);
            }
        }
        return list1;
    }

    @m
    public final DisplayFeature g(@l SidecarDisplayFeature sidecarDisplayFeature0, @l SidecarDeviceState sidecarDeviceState0) {
        State foldingFeature$State0;
        Type hardwareFoldingFeature$Type0;
        L.p(sidecarDisplayFeature0, "feature");
        L.p(sidecarDeviceState0, "deviceState");
        L.o("SidecarAdapter", "TAG");
        SidecarDisplayFeature sidecarDisplayFeature1 = (SidecarDisplayFeature)androidx.window.core.SpecificationComputer.Companion.b(SpecificationComputer.a, sidecarDisplayFeature0, "SidecarAdapter", this.a, null, 4, null).c("Type must be either TYPE_FOLD or TYPE_HINGE", androidx.window.layout.SidecarAdapter.translate.checkedFeature.1.e).c("Feature bounds must not be 0", androidx.window.layout.SidecarAdapter.translate.checkedFeature.2.e).c("TYPE_FOLD must have 0 area", androidx.window.layout.SidecarAdapter.translate.checkedFeature.3.e).c("Feature be pinned to either left or top", androidx.window.layout.SidecarAdapter.translate.checkedFeature.4.e).a();
        if(sidecarDisplayFeature1 == null) {
            return null;
        }
        switch(sidecarDisplayFeature1.getType()) {
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
        switch(SidecarAdapter.b.b(sidecarDeviceState0)) {
            case 2: {
                foldingFeature$State0 = State.d;
                break;
            }
            case 3: {
                foldingFeature$State0 = State.c;
                break;
            }
            case 0: 
            case 1: 
            case 4: {
                return null;
            }
            default: {
                foldingFeature$State0 = State.c;
                break;
            }
        }
        Rect rect0 = sidecarDisplayFeature0.getRect();
        L.o(rect0, "feature.rect");
        return new HardwareFoldingFeature(new Bounds(rect0), hardwareFoldingFeature$Type0, foldingFeature$State0);

        final class androidx.window.layout.SidecarAdapter.translate.checkedFeature.1 extends N implements Function1 {
            public static final androidx.window.layout.SidecarAdapter.translate.checkedFeature.1 e;

            static {
                androidx.window.layout.SidecarAdapter.translate.checkedFeature.1.e = new androidx.window.layout.SidecarAdapter.translate.checkedFeature.1();
            }

            androidx.window.layout.SidecarAdapter.translate.checkedFeature.1() {
                super(1);
            }

            @l
            public final Boolean a(@l SidecarDisplayFeature sidecarDisplayFeature0) {
                L.p(sidecarDisplayFeature0, "$this$require");
                boolean z = true;
                switch(sidecarDisplayFeature0.getType()) {
                    case 1: 
                    case 2: {
                        break;
                    }
                    default: {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((SidecarDisplayFeature)object0));
            }
        }


        final class androidx.window.layout.SidecarAdapter.translate.checkedFeature.2 extends N implements Function1 {
            public static final androidx.window.layout.SidecarAdapter.translate.checkedFeature.2 e;

            static {
                androidx.window.layout.SidecarAdapter.translate.checkedFeature.2.e = new androidx.window.layout.SidecarAdapter.translate.checkedFeature.2();
            }

            androidx.window.layout.SidecarAdapter.translate.checkedFeature.2() {
                super(1);
            }

            @l
            public final Boolean a(@l SidecarDisplayFeature sidecarDisplayFeature0) {
                L.p(sidecarDisplayFeature0, "$this$require");
                return sidecarDisplayFeature0.getRect().width() != 0 || sidecarDisplayFeature0.getRect().height() != 0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((SidecarDisplayFeature)object0));
            }
        }


        final class androidx.window.layout.SidecarAdapter.translate.checkedFeature.3 extends N implements Function1 {
            public static final androidx.window.layout.SidecarAdapter.translate.checkedFeature.3 e;

            static {
                androidx.window.layout.SidecarAdapter.translate.checkedFeature.3.e = new androidx.window.layout.SidecarAdapter.translate.checkedFeature.3();
            }

            androidx.window.layout.SidecarAdapter.translate.checkedFeature.3() {
                super(1);
            }

            @l
            public final Boolean a(@l SidecarDisplayFeature sidecarDisplayFeature0) {
                L.p(sidecarDisplayFeature0, "$this$require");
                return Boolean.valueOf(sidecarDisplayFeature0.getType() != 1 || sidecarDisplayFeature0.getRect().width() == 0 || sidecarDisplayFeature0.getRect().height() == 0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((SidecarDisplayFeature)object0));
            }
        }


        final class androidx.window.layout.SidecarAdapter.translate.checkedFeature.4 extends N implements Function1 {
            public static final androidx.window.layout.SidecarAdapter.translate.checkedFeature.4 e;

            static {
                androidx.window.layout.SidecarAdapter.translate.checkedFeature.4.e = new androidx.window.layout.SidecarAdapter.translate.checkedFeature.4();
            }

            androidx.window.layout.SidecarAdapter.translate.checkedFeature.4() {
                super(1);
            }

            @l
            public final Boolean a(@l SidecarDisplayFeature sidecarDisplayFeature0) {
                L.p(sidecarDisplayFeature0, "$this$require");
                return sidecarDisplayFeature0.getRect().left == 0 || sidecarDisplayFeature0.getRect().top == 0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((SidecarDisplayFeature)object0));
            }
        }

    }
}

