package androidx.constraintlayout.core.state;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLContainer;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParsingException;

public class TransitionParser {
    private static int a(String s, String[] arr_s) {
        for(int v = 0; v < arr_s.length; ++v) {
            if(arr_s[v].equals(s)) {
                return v;
            }
        }
        return 0;
    }

    private static void b(TypedBundle typedBundle0, int v, String s, String[] arr_s) {
        for(int v1 = 0; v1 < arr_s.length; ++v1) {
            if(arr_s[v1].equals(s)) {
                typedBundle0.b(v, v1);
            }
        }
    }

    @RestrictTo({Scope.b})
    public static void c(@NonNull CLObject cLObject0, @NonNull Transition transition0) throws CLParsingException {
        transition0.j0();
        String s = cLObject0.W("pathMotionArc");
        TypedBundle typedBundle0 = new TypedBundle();
        int v = 1;
        int v1 = 0;
        if(s != null) {
            switch(s) {
                case "above": {
                    typedBundle0.b(509, 5);
                    break;
                }
                case "below": {
                    typedBundle0.b(509, 4);
                    break;
                }
                case "flip": {
                    typedBundle0.b(509, 3);
                    break;
                }
                case "none": {
                    typedBundle0.b(509, 0);
                    break;
                }
                case "startHorizontal": {
                    typedBundle0.b(509, 2);
                    break;
                }
                case "startVertical": {
                    typedBundle0.b(509, 1);
                }
            }
            v1 = 1;
        }
        String s1 = cLObject0.W("interpolator");
        if(s1 != null) {
            typedBundle0.c(705, s1);
            v1 = 1;
        }
        float f = cLObject0.M("staggered");
        if(Float.isNaN(f)) {
            v = v1;
        }
        else {
            typedBundle0.a(706, f);
        }
        if(v != 0) {
            transition0.l0(typedBundle0);
        }
        CLObject cLObject1 = cLObject0.Q("onSwipe");
        if(cLObject1 != null) {
            TransitionParser.i(cLObject1, transition0);
        }
        TransitionParser.g(cLObject0, transition0);
    }

    @Deprecated
    public static void d(CLObject cLObject0, Transition transition0, CorePixelDp corePixelDp0) throws CLParsingException {
        TransitionParser.c(cLObject0, transition0);
    }

    private static void e(CLObject cLObject0, Transition transition0) throws CLParsingException {
        int v13;
        int v12;
        CLObject cLObject2;
        CustomVariable[][] arr2_customVariable;
        CLArray cLArray0 = cLObject0.I("target");
        if(cLArray0 == null) {
            return;
        }
        CLArray cLArray1 = cLObject0.I("frames");
        if(cLArray1 == null) {
            return;
        }
        String s = cLObject0.W("transitionEasing");
        int v = cLArray1.size();
        TypedBundle[] arr_typedBundle = new TypedBundle[v];
        for(int v1 = 0; v1 < cLArray1.size(); ++v1) {
            arr_typedBundle[v1] = new TypedBundle();
        }
        for(int v2 = 0; v2 < 9; ++v2) {
            String s1 = new String[]{"scaleX", "scaleY", "translationX", "translationY", "translationZ", "rotationX", "rotationY", "rotationZ", "alpha"}[v2];
            int v3 = new int[]{311, 312, 304, 305, 306, 308, 309, 310, 303}[v2];
            boolean z = new boolean[]{false, false, true, true, true, false, false, false, false}[v2];
            CLArray cLArray2 = cLObject0.I(s1);
            if(cLArray2 != null && cLArray2.size() != v) {
                throw new CLParsingException("incorrect size for " + s1 + " array, not matching targets array!", cLObject0);
            }
            if(cLArray2 == null) {
                float f1 = cLObject0.M(s1);
                if(!Float.isNaN(f1)) {
                    if(z) {
                        f1 = transition0.r.a(f1);
                    }
                    for(int v5 = 0; v5 < v; ++v5) {
                        arr_typedBundle[v5].a(v3, f1);
                    }
                }
            }
            else {
                for(int v4 = 0; v4 < v; ++v4) {
                    float f = cLArray2.getFloat(v4);
                    if(z) {
                        f = transition0.r.a(f);
                    }
                    arr_typedBundle[v4].a(v3, f);
                }
            }
        }
        CLElement cLElement0 = cLObject0.S("custom");
        if(cLElement0 == null || !(cLElement0 instanceof CLObject)) {
            arr2_customVariable = null;
        }
        else {
            CLObject cLObject1 = (CLObject)cLElement0;
            int v6 = cLObject1.size();
            arr2_customVariable = new CustomVariable[cLArray1.size()][v6];
            int v7 = 0;
            while(v7 < v6) {
                CLKey cLKey0 = (CLKey)cLObject1.D(v7);
                String s2 = cLKey0.c();
                if(cLKey0.h0() instanceof CLArray) {
                    CLArray cLArray3 = (CLArray)cLKey0.h0();
                    int v8 = cLArray3.size();
                    if(v8 != v || v8 <= 0) {
                    label_78:
                        cLObject2 = cLObject1;
                    }
                    else if(cLArray3.D(0) instanceof CLNumber) {
                        for(int v9 = 0; v9 < v; ++v9) {
                            CustomVariable[] arr_customVariable = arr2_customVariable[v9];
                            arr_customVariable[v7] = new CustomVariable(s2, 901, cLArray3.D(v9).j());
                        }
                        goto label_78;
                    }
                    else {
                        cLObject2 = cLObject1;
                        int v10 = 0;
                        while(v10 < v) {
                            long v11 = ConstraintSetParser.h(cLArray3.D(v10).c());
                            if(v11 == -1L) {
                                v12 = v6;
                            }
                            else {
                                CustomVariable[] arr_customVariable1 = arr2_customVariable[v10];
                                v12 = v6;
                                arr_customVariable1[v7] = new CustomVariable(s2, 902, ((int)v11));
                            }
                            ++v10;
                            v6 = v12;
                        }
                    }
                    v13 = v6;
                }
                else {
                    cLObject2 = cLObject1;
                    v13 = v6;
                    CLElement cLElement1 = cLKey0.h0();
                    if(cLElement1 instanceof CLNumber) {
                        float f2 = cLElement1.j();
                        for(int v14 = 0; v14 < v; ++v14) {
                            CustomVariable[] arr_customVariable2 = arr2_customVariable[v14];
                            arr_customVariable2[v7] = new CustomVariable(s2, 901, f2);
                        }
                    }
                    else {
                        long v15 = ConstraintSetParser.h(cLElement1.c());
                        if(v15 != -1L) {
                            for(int v16 = 0; v16 < v; ++v16) {
                                CustomVariable[] arr_customVariable3 = arr2_customVariable[v16];
                                arr_customVariable3[v7] = new CustomVariable(s2, 902, ((int)v15));
                            }
                        }
                    }
                }
                ++v7;
                cLObject1 = cLObject2;
                v6 = v13;
            }
        }
        String s3 = cLObject0.W("curveFit");
        for(int v17 = 0; v17 < cLArray0.size(); ++v17) {
            for(int v18 = 0; v18 < v; ++v18) {
                String s4 = cLArray0.T(v17);
                TypedBundle typedBundle0 = arr_typedBundle[v18];
                if(s3 != null) {
                    typedBundle0.b(508, TransitionParser.a(s3, new String[]{"spline", "linear"}));
                }
                typedBundle0.e(501, s);
                typedBundle0.b(100, cLArray1.getInt(v18));
                transition0.q(s4, typedBundle0, (arr2_customVariable == null ? null : arr2_customVariable[v18]));
            }
        }
    }

    private static void f(CLObject cLObject0, Transition transition0) throws CLParsingException {
        CLArray cLArray0 = cLObject0.G("target");
        CLArray cLArray1 = cLObject0.G("frames");
        String s = cLObject0.W("transitionEasing");
        String[] arr_s = {"scaleX", "scaleY", "translationX", "translationY", "translationZ", "rotationX", "rotationY", "rotationZ", "alpha", "period", "offset", "phase"};
        int[] arr_v = {0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 2, 0};
        int v = cLArray1.size();
        TypedBundle[] arr_typedBundle = new TypedBundle[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_typedBundle[v1] = new TypedBundle();
        }
        boolean z = false;
        for(int v2 = 0; v2 < 12; ++v2) {
            if(cLObject0.X(arr_s[v2]) && arr_v[v2] == 1) {
                z = true;
            }
        }
        for(int v3 = 0; v3 < 12; ++v3) {
            String s1 = arr_s[v3];
            int v4 = new int[]{311, 312, 304, 305, 306, 308, 309, 310, 403, 423, 424, 425}[v3];
            int v5 = arr_v[v3];
            CLArray cLArray2 = cLObject0.I(s1);
            if(cLArray2 != null && cLArray2.size() != v) {
                throw new CLParsingException("incorrect size for $attrName array, not matching targets array!", cLObject0);
            }
            if(cLArray2 == null) {
                float f1 = cLObject0.M(s1);
                if(!Float.isNaN(f1)) {
                    if(v5 == 1) {
                        f1 = transition0.r.a(f1);
                    }
                    else if(v5 == 2 && z) {
                        f1 = transition0.r.a(f1);
                    }
                    for(int v7 = 0; v7 < v; ++v7) {
                        arr_typedBundle[v7].a(v4, f1);
                    }
                }
            }
            else {
                for(int v6 = 0; v6 < v; ++v6) {
                    float f = cLArray2.getFloat(v6);
                    if(v5 == 1) {
                        f = transition0.r.a(f);
                    }
                    else if(v5 == 2 && z) {
                        f = transition0.r.a(f);
                    }
                    arr_typedBundle[v6].a(v4, f);
                }
            }
        }
        String s2 = cLObject0.W("curveFit");
        String s3 = cLObject0.W("easing");
        String s4 = cLObject0.W("waveShape");
        String s5 = cLObject0.W("customWave");
        for(int v8 = 0; v8 < cLArray0.size(); ++v8) {
            for(int v9 = 0; v9 < v; ++v9) {
                String s6 = cLArray0.T(v8);
                TypedBundle typedBundle0 = arr_typedBundle[v9];
                if(s2 != null) {
                    if(s2.equals("linear")) {
                        typedBundle0.b(401, 1);
                    }
                    else if(s2.equals("spline")) {
                        typedBundle0.b(401, 0);
                    }
                }
                typedBundle0.e(501, s);
                if(s3 != null) {
                    typedBundle0.c(420, s3);
                }
                if(s4 != null) {
                    typedBundle0.c(421, s4);
                }
                if(s5 != null) {
                    typedBundle0.c(422, s5);
                }
                typedBundle0.b(100, cLArray1.getInt(v9));
                transition0.r(s6, typedBundle0);
            }
        }
    }

    public static void g(CLObject cLObject0, Transition transition0) throws CLParsingException {
        CLObject cLObject1 = cLObject0.Q("KeyFrames");
        if(cLObject1 == null) {
            return;
        }
        CLArray cLArray0 = cLObject1.I("KeyPositions");
        if(cLArray0 != null) {
            for(int v1 = 0; v1 < cLArray0.size(); ++v1) {
                CLElement cLElement0 = cLArray0.D(v1);
                if(cLElement0 instanceof CLObject) {
                    TransitionParser.h(((CLObject)cLElement0), transition0);
                }
            }
        }
        CLArray cLArray1 = cLObject1.I("KeyAttributes");
        if(cLArray1 != null) {
            for(int v2 = 0; v2 < cLArray1.size(); ++v2) {
                CLElement cLElement1 = cLArray1.D(v2);
                if(cLElement1 instanceof CLObject) {
                    TransitionParser.e(((CLObject)cLElement1), transition0);
                }
            }
        }
        CLArray cLArray2 = cLObject1.I("KeyCycles");
        if(cLArray2 != null) {
            for(int v = 0; v < cLArray2.size(); ++v) {
                CLElement cLElement2 = cLArray2.D(v);
                if(cLElement2 instanceof CLObject) {
                    TransitionParser.f(((CLObject)cLElement2), transition0);
                }
            }
        }
    }

    private static void h(CLObject cLObject0, Transition transition0) throws CLParsingException {
        TypedBundle typedBundle0 = new TypedBundle();
        CLArray cLArray0 = cLObject0.G("target");
        CLArray cLArray1 = cLObject0.G("frames");
        CLArray cLArray2 = cLObject0.I("percentX");
        CLArray cLArray3 = cLObject0.I("percentY");
        CLArray cLArray4 = cLObject0.I("percentWidth");
        CLArray cLArray5 = cLObject0.I("percentHeight");
        String s = cLObject0.W("pathMotionArc");
        String s1 = cLObject0.W("transitionEasing");
        String s2 = cLObject0.W("curveFit");
        String s3 = cLObject0.W("type");
        if(s3 == null) {
            s3 = "parentRelative";
        }
        if(cLArray2 != null && cLArray1.size() != cLArray2.size()) {
            return;
        }
        if(cLArray3 != null && cLArray1.size() != cLArray3.size()) {
            return;
        }
        for(int v = 0; v < cLArray0.size(); ++v) {
            String s4 = cLArray0.T(v);
            int v1 = TransitionParser.a(s3, new String[]{"deltaRelative", "pathRelative", "parentRelative"});
            typedBundle0.h();
            typedBundle0.b(510, v1);
            if(s2 != null) {
                TransitionParser.b(typedBundle0, 508, s2, new String[]{"spline", "linear"});
            }
            typedBundle0.e(501, s1);
            if(s != null) {
                TransitionParser.b(typedBundle0, 509, s, new String[]{"none", "startVertical", "startHorizontal", "flip", "below", "above"});
            }
            for(int v2 = 0; v2 < cLArray1.size(); ++v2) {
                typedBundle0.b(100, cLArray1.getInt(v2));
                TransitionParser.j(typedBundle0, 506, cLArray2, v2);
                TransitionParser.j(typedBundle0, 507, cLArray3, v2);
                TransitionParser.j(typedBundle0, 503, cLArray4, v2);
                TransitionParser.j(typedBundle0, 504, cLArray5, v2);
                transition0.t(s4, typedBundle0);
            }
        }
    }

    private static void i(CLContainer cLContainer0, Transition transition0) {
        String s = cLContainer0.W("anchor");
        int v = TransitionParser.a(cLContainer0.W("side"), OnSwipe.B);
        int v1 = TransitionParser.a(cLContainer0.W("direction"), OnSwipe.L);
        float f = cLContainer0.M("scale");
        float f1 = cLContainer0.M("threshold");
        float f2 = cLContainer0.M("maxVelocity");
        float f3 = cLContainer0.M("maxAccel");
        String s1 = cLContainer0.W("limitBounds");
        int v2 = TransitionParser.a(cLContainer0.W("mode"), OnSwipe.O);
        int v3 = TransitionParser.a(cLContainer0.W("touchUp"), OnSwipe.X);
        float f4 = cLContainer0.M("springMass");
        float f5 = cLContainer0.M("springStiffness");
        float f6 = cLContainer0.M("springDamping");
        float f7 = cLContainer0.M("stopThreshold");
        int v4 = TransitionParser.a(cLContainer0.W("springBoundary"), OnSwipe.c0);
        String s2 = cLContainer0.W("around");
        OnSwipe transition$OnSwipe0 = transition0.y();
        transition$OnSwipe0.i(s);
        transition$OnSwipe0.j(v);
        transition$OnSwipe0.l(v1);
        transition$OnSwipe0.m(f);
        transition$OnSwipe0.n(f1);
        transition$OnSwipe0.q(f2);
        transition$OnSwipe0.p(f3);
        transition$OnSwipe0.o(s1);
        transition$OnSwipe0.k(v2);
        transition$OnSwipe0.r(v3);
        transition$OnSwipe0.v(f4);
        transition$OnSwipe0.w(f5);
        transition$OnSwipe0.u(f6);
        transition$OnSwipe0.x(f7);
        transition$OnSwipe0.t(v4);
        transition$OnSwipe0.s(s2);
    }

    private static void j(TypedBundle typedBundle0, int v, CLArray cLArray0, int v1) throws CLParsingException {
        if(cLArray0 != null) {
            typedBundle0.a(v, cLArray0.getFloat(v1));
        }
    }
}

