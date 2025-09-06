package androidx.compose.ui.input.pointer;

import A3.o;
import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.a;
import androidx.compose.ui.b;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.List;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@ExperimentalComposeUiApi
public final class PointerInteropFilter implements PointerInputModifier {
    static enum DispatchToViewState {
        Unknown,
        Dispatching,
        NotDispatching;

        private static final DispatchToViewState[] a() [...] // Inlined contents
    }

    public Function1 a;
    @m
    private RequestDisallowInterceptTouchEvent b;
    private boolean c;
    @l
    private final PointerInputFilter d;

    public PointerInteropFilter() {
        this.d = new PointerInputFilter() {
            @l
            private DispatchToViewState d;

            {
                this.d = DispatchToViewState.a;
            }

            private final void A0(PointerEvent pointerEvent0) {
                List list0 = pointerEvent0.e();
                int v = list0.size();
                for(int v2 = 0; v2 < v; ++v2) {
                    if(((PointerInputChange)list0.get(v2)).A()) {
                        if(this.d == DispatchToViewState.b) {
                            LayoutCoordinates layoutCoordinates0 = this.Q();
                            if(layoutCoordinates0 == null) {
                                throw new IllegalStateException("layoutCoordinates not set");
                            }
                            PointerInteropUtils_androidKt.c(pointerEvent0, layoutCoordinates0.L(0L), new Function1() {
                                final PointerInteropFilter e;

                                {
                                    this.e = pointerInteropFilter0;
                                    super(1);
                                }

                                public final void a(@l MotionEvent motionEvent0) {
                                    L.p(motionEvent0, "motionEvent");
                                    this.e.b().invoke(motionEvent0);
                                }

                                @Override  // kotlin.jvm.functions.Function1
                                public Object invoke(Object object0) {
                                    this.a(((MotionEvent)object0));
                                    return S0.a;
                                }
                            });
                        }
                        this.d = DispatchToViewState.c;
                        return;
                    }
                }
                LayoutCoordinates layoutCoordinates1 = this.Q();
                if(layoutCoordinates1 == null) {
                    throw new IllegalStateException("layoutCoordinates not set");
                }
                PointerInteropUtils_androidKt.d(pointerEvent0, layoutCoordinates1.L(0L), new Function1(this.e) {
                    final androidx.compose.ui.input.pointer.PointerInteropFilter.pointerInputFilter.1 e;
                    final PointerInteropFilter f;

                    {
                        this.e = pointerInteropFilter$pointerInputFilter$10;
                        this.f = pointerInteropFilter0;
                        super(1);
                    }

                    public final void a(@l MotionEvent motionEvent0) {
                        L.p(motionEvent0, "motionEvent");
                        if(motionEvent0.getActionMasked() == 0) {
                            DispatchToViewState pointerInteropFilter$DispatchToViewState0 = ((Boolean)this.f.b().invoke(motionEvent0)).booleanValue() ? DispatchToViewState.b : DispatchToViewState.c;
                            this.e.d = pointerInteropFilter$DispatchToViewState0;
                            return;
                        }
                        this.f.b().invoke(motionEvent0);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((MotionEvent)object0));
                        return S0.a;
                    }
                });
                if(this.d == DispatchToViewState.b) {
                    int v3 = list0.size();
                    for(int v1 = 0; v1 < v3; ++v1) {
                        ((PointerInputChange)list0.get(v1)).a();
                    }
                    InternalPointerEvent internalPointerEvent0 = pointerEvent0.f();
                    if(internalPointerEvent0 != null) {
                        internalPointerEvent0.f(!this.e.a());
                    }
                }
            }

            private final void K0() {
                this.d = DispatchToViewState.a;
                this.e.i(false);
            }

            @Override  // androidx.compose.ui.input.pointer.PointerInputFilter
            public boolean Z() {
                return true;
            }

            @Override  // androidx.compose.ui.input.pointer.PointerInputFilter
            public void j0() {
                if(this.d == DispatchToViewState.b) {
                    PointerInteropUtils_androidKt.a(SystemClock.uptimeMillis(), new Function1() {
                        final PointerInteropFilter e;

                        {
                            this.e = pointerInteropFilter0;
                            super(1);
                        }

                        public final void a(@l MotionEvent motionEvent0) {
                            L.p(motionEvent0, "motionEvent");
                            this.e.b().invoke(motionEvent0);
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            this.a(((MotionEvent)object0));
                            return S0.a;
                        }
                    });
                    this.K0();
                }
            }

            @Override  // androidx.compose.ui.input.pointer.PointerInputFilter
            public void m0(@l PointerEvent pointerEvent0, @l PointerEventPass pointerEventPass0, long v) {
                boolean z;
                L.p(pointerEvent0, "pointerEvent");
                L.p(pointerEventPass0, "pass");
                List list0 = pointerEvent0.e();
                if(!this.e.a()) {
                    z = false;
                    int v2 = list0.size();
                    int v3 = 0;
                    while(true) {
                        if(v3 >= v2) {
                            goto label_14;
                        }
                        PointerInputChange pointerInputChange0 = (PointerInputChange)list0.get(v3);
                        if(PointerEventKt.c(pointerInputChange0) || PointerEventKt.e(pointerInputChange0)) {
                            break;
                        }
                        ++v3;
                    }
                }
                z = true;
            label_14:
                if(this.d != DispatchToViewState.c) {
                    if(pointerEventPass0 == PointerEventPass.a && z) {
                        this.A0(pointerEvent0);
                    }
                    if(pointerEventPass0 == PointerEventPass.c && !z) {
                        this.A0(pointerEvent0);
                    }
                }
                if(pointerEventPass0 == PointerEventPass.c) {
                    int v4 = list0.size();
                    for(int v1 = 0; true; ++v1) {
                        if(v1 >= v4) {
                            this.K0();
                            break;
                        }
                        if(!PointerEventKt.e(((PointerInputChange)list0.get(v1)))) {
                            break;
                        }
                    }
                }
            }
        };
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean H(Function1 function10) {
        return b.b(this, function10);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object P(Object object0, o o0) {
        return b.c(this, object0, o0);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object U(Object object0, o o0) {
        return b.d(this, object0, o0);
    }

    public final boolean a() {
        return this.c;
    }

    @l
    public final Function1 b() {
        Function1 function10 = this.a;
        if(function10 != null) {
            return function10;
        }
        L.S("onTouchEvent");
        return null;
    }

    @m
    public final RequestDisallowInterceptTouchEvent d() {
        return this.b;
    }

    public final void i(boolean z) {
        this.c = z;
    }

    public final void j(@l Function1 function10) {
        L.p(function10, "<set-?>");
        this.a = function10;
    }

    public final void l(@m RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent0) {
        RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent1 = this.b;
        if(requestDisallowInterceptTouchEvent1 != null) {
            requestDisallowInterceptTouchEvent1.c(null);
        }
        this.b = requestDisallowInterceptTouchEvent0;
        if(requestDisallowInterceptTouchEvent0 != null) {
            requestDisallowInterceptTouchEvent0.c(this);
        }
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier r0(Modifier modifier0) {
        return a.a(this, modifier0);
    }

    @Override  // androidx.compose.ui.input.pointer.PointerInputModifier
    @l
    public PointerInputFilter t1() {
        return this.d;
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean u(Function1 function10) {
        return b.a(this, function10);
    }
}

