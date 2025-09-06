package androidx.compose.foundation.gestures;

import A3.p;
import androidx.compose.foundation.interaction.DragInteraction.Cancel;
import androidx.compose.foundation.interaction.DragInteraction.Start;
import androidx.compose.foundation.interaction.DragInteraction.Stop;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

final class DragLogic {
    @l
    private final p a;
    @l
    private final p b;
    @l
    private final MutableState c;
    @m
    private final MutableInteractionSource d;

    public DragLogic(@l p p0, @l p p1, @l MutableState mutableState0, @m MutableInteractionSource mutableInteractionSource0) {
        L.p(p0, "onDragStarted");
        L.p(p1, "onDragStopped");
        L.p(mutableState0, "dragStartInteraction");
        super();
        this.a = p0;
        this.b = p1;
        this.c = mutableState0;
        this.d = mutableInteractionSource0;
    }

    @l
    public final MutableState a() {
        return this.c;
    }

    @m
    public final MutableInteractionSource b() {
        return this.d;
    }

    @l
    public final p c() {
        return this.a;
    }

    @l
    public final p d() {
        return this.b;
    }

    @m
    public final Object e(@l O o0, @l d d0) {
        DragLogic dragLogic0;
        androidx.compose.foundation.gestures.DragLogic.processDragCancel.1 dragLogic$processDragCancel$10;
        if(d0 instanceof androidx.compose.foundation.gestures.DragLogic.processDragCancel.1) {
            dragLogic$processDragCancel$10 = (androidx.compose.foundation.gestures.DragLogic.processDragCancel.1)d0;
            int v = dragLogic$processDragCancel$10.o;
            if((v & 0x80000000) == 0) {
                dragLogic$processDragCancel$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    Object l;
                    Object m;
                    int o;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.m = object0;
                        this.o |= 0x80000000;
                        return d0.e(null, this);
                    }
                };
            }
            else {
                dragLogic$processDragCancel$10.o = v ^ 0x80000000;
            }
        }
        else {
            dragLogic$processDragCancel$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object k;
                Object l;
                Object m;
                int o;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.m = object0;
                    this.o |= 0x80000000;
                    return d0.e(null, this);
                }
            };
        }
        Object object0 = dragLogic$processDragCancel$10.m;
        Object object1 = b.l();
        switch(dragLogic$processDragCancel$10.o) {
            case 0: {
                f0.n(object0);
                Start dragInteraction$Start0 = (Start)this.c.getValue();
                if(dragInteraction$Start0 == null) {
                    dragLogic0 = this;
                }
                else {
                    MutableInteractionSource mutableInteractionSource0 = this.d;
                    if(mutableInteractionSource0 != null) {
                        Cancel dragInteraction$Cancel0 = new Cancel(dragInteraction$Start0);
                        dragLogic$processDragCancel$10.k = this;
                        dragLogic$processDragCancel$10.l = o0;
                        dragLogic$processDragCancel$10.o = 1;
                        if(mutableInteractionSource0.b(dragInteraction$Cancel0, dragLogic$processDragCancel$10) == object1) {
                            return object1;
                        }
                    }
                    dragLogic0 = this;
                    dragLogic0.c.setValue(null);
                }
                break;
            }
            case 1: {
                o0 = (O)dragLogic$processDragCancel$10.l;
                dragLogic0 = (DragLogic)dragLogic$processDragCancel$10.k;
                f0.n(object0);
                dragLogic0.c.setValue(null);
                break;
            }
            case 2: {
                f0.n(object0);
                return S0.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Velocity velocity0 = Velocity.b(0L);
        dragLogic$processDragCancel$10.k = null;
        dragLogic$processDragCancel$10.l = null;
        dragLogic$processDragCancel$10.o = 2;
        return dragLogic0.b.invoke(o0, velocity0, dragLogic$processDragCancel$10) == object1 ? object1 : S0.a;
    }

    @m
    public final Object f(@l O o0, @l DragStarted dragEvent$DragStarted0, @l d d0) {
        Start dragInteraction$Start2;
        O o1;
        DragLogic dragLogic1;
        Start dragInteraction$Start1;
        DragLogic dragLogic0;
        androidx.compose.foundation.gestures.DragLogic.processDragStart.1 dragLogic$processDragStart$10;
        if(d0 instanceof androidx.compose.foundation.gestures.DragLogic.processDragStart.1) {
            dragLogic$processDragStart$10 = (androidx.compose.foundation.gestures.DragLogic.processDragStart.1)d0;
            int v = dragLogic$processDragStart$10.q;
            if((v & 0x80000000) == 0) {
                dragLogic$processDragStart$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    Object l;
                    Object m;
                    Object n;
                    Object o;
                    int q;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.o = object0;
                        this.q |= 0x80000000;
                        return d0.f(null, null, this);
                    }
                };
            }
            else {
                dragLogic$processDragStart$10.q = v ^ 0x80000000;
            }
        }
        else {
            dragLogic$processDragStart$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object k;
                Object l;
                Object m;
                Object n;
                Object o;
                int q;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.o = object0;
                    this.q |= 0x80000000;
                    return d0.f(null, null, this);
                }
            };
        }
        Object object0 = dragLogic$processDragStart$10.o;
        Object object1 = b.l();
        switch(dragLogic$processDragStart$10.q) {
            case 0: {
                f0.n(object0);
                Start dragInteraction$Start0 = (Start)this.c.getValue();
                if(dragInteraction$Start0 != null) {
                    MutableInteractionSource mutableInteractionSource0 = this.d;
                    if(mutableInteractionSource0 != null) {
                        Cancel dragInteraction$Cancel0 = new Cancel(dragInteraction$Start0);
                        dragLogic$processDragStart$10.k = this;
                        dragLogic$processDragStart$10.l = o0;
                        dragLogic$processDragStart$10.m = dragEvent$DragStarted0;
                        dragLogic$processDragStart$10.q = 1;
                        if(mutableInteractionSource0.b(dragInteraction$Cancel0, dragLogic$processDragStart$10) == object1) {
                            return object1;
                        }
                    }
                }
                dragLogic0 = this;
                goto label_33;
            }
            case 1: {
                dragEvent$DragStarted0 = (DragStarted)dragLogic$processDragStart$10.m;
                o0 = (O)dragLogic$processDragStart$10.l;
                dragLogic0 = (DragLogic)dragLogic$processDragStart$10.k;
                f0.n(object0);
            label_33:
                dragInteraction$Start1 = new Start();
                MutableInteractionSource mutableInteractionSource1 = dragLogic0.d;
                if(mutableInteractionSource1 != null) {
                    dragLogic$processDragStart$10.k = dragLogic0;
                    dragLogic$processDragStart$10.l = o0;
                    dragLogic$processDragStart$10.m = dragEvent$DragStarted0;
                    dragLogic$processDragStart$10.n = dragInteraction$Start1;
                    dragLogic$processDragStart$10.q = 2;
                    if(mutableInteractionSource1.b(dragInteraction$Start1, dragLogic$processDragStart$10) == object1) {
                        return object1;
                    }
                    dragLogic1 = dragLogic0;
                    o1 = o0;
                    dragInteraction$Start2 = dragInteraction$Start1;
                    dragInteraction$Start1 = dragInteraction$Start2;
                    o0 = o1;
                    dragLogic0 = dragLogic1;
                    break;
                }
                break;
            }
            case 2: {
                dragInteraction$Start2 = (Start)dragLogic$processDragStart$10.n;
                dragEvent$DragStarted0 = (DragStarted)dragLogic$processDragStart$10.m;
                o1 = (O)dragLogic$processDragStart$10.l;
                dragLogic1 = (DragLogic)dragLogic$processDragStart$10.k;
                f0.n(object0);
                dragInteraction$Start1 = dragInteraction$Start2;
                o0 = o1;
                dragLogic0 = dragLogic1;
                break;
            }
            case 3: {
                f0.n(object0);
                return S0.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        dragLogic0.c.setValue(dragInteraction$Start1);
        Offset offset0 = Offset.d(dragEvent$DragStarted0.a());
        dragLogic$processDragStart$10.k = null;
        dragLogic$processDragStart$10.l = null;
        dragLogic$processDragStart$10.m = null;
        dragLogic$processDragStart$10.n = null;
        dragLogic$processDragStart$10.q = 3;
        return dragLogic0.a.invoke(o0, offset0, dragLogic$processDragStart$10) == object1 ? object1 : S0.a;
    }

    @m
    public final Object g(@l O o0, @l DragStopped dragEvent$DragStopped0, @l d d0) {
        DragLogic dragLogic0;
        androidx.compose.foundation.gestures.DragLogic.processDragStop.1 dragLogic$processDragStop$10;
        if(d0 instanceof androidx.compose.foundation.gestures.DragLogic.processDragStop.1) {
            dragLogic$processDragStop$10 = (androidx.compose.foundation.gestures.DragLogic.processDragStop.1)d0;
            int v = dragLogic$processDragStop$10.p;
            if((v & 0x80000000) == 0) {
                dragLogic$processDragStop$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    Object l;
                    Object m;
                    Object n;
                    int p;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.n = object0;
                        this.p |= 0x80000000;
                        return d0.g(null, null, this);
                    }
                };
            }
            else {
                dragLogic$processDragStop$10.p = v ^ 0x80000000;
            }
        }
        else {
            dragLogic$processDragStop$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object k;
                Object l;
                Object m;
                Object n;
                int p;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.n = object0;
                    this.p |= 0x80000000;
                    return d0.g(null, null, this);
                }
            };
        }
        Object object0 = dragLogic$processDragStop$10.n;
        Object object1 = b.l();
        switch(dragLogic$processDragStop$10.p) {
            case 0: {
                f0.n(object0);
                Start dragInteraction$Start0 = (Start)this.c.getValue();
                if(dragInteraction$Start0 == null) {
                    dragLogic0 = this;
                }
                else {
                    MutableInteractionSource mutableInteractionSource0 = this.d;
                    if(mutableInteractionSource0 != null) {
                        Stop dragInteraction$Stop0 = new Stop(dragInteraction$Start0);
                        dragLogic$processDragStop$10.k = this;
                        dragLogic$processDragStop$10.l = o0;
                        dragLogic$processDragStop$10.m = dragEvent$DragStopped0;
                        dragLogic$processDragStop$10.p = 1;
                        if(mutableInteractionSource0.b(dragInteraction$Stop0, dragLogic$processDragStop$10) == object1) {
                            return object1;
                        }
                    }
                    dragLogic0 = this;
                    dragLogic0.c.setValue(null);
                }
                break;
            }
            case 1: {
                dragEvent$DragStopped0 = (DragStopped)dragLogic$processDragStop$10.m;
                o0 = (O)dragLogic$processDragStop$10.l;
                dragLogic0 = (DragLogic)dragLogic$processDragStop$10.k;
                f0.n(object0);
                dragLogic0.c.setValue(null);
                break;
            }
            case 2: {
                f0.n(object0);
                return S0.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Velocity velocity0 = Velocity.b(dragEvent$DragStopped0.a());
        dragLogic$processDragStop$10.k = null;
        dragLogic$processDragStop$10.l = null;
        dragLogic$processDragStop$10.m = null;
        dragLogic$processDragStop$10.p = 2;
        return dragLogic0.b.invoke(o0, velocity0, dragLogic$processDragStop$10) == object1 ? object1 : S0.a;
    }
}

