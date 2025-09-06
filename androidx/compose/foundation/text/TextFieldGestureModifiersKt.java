package androidx.compose.foundation.text;

import A3.o;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class TextFieldGestureModifiersKt {
    @l
    public static final Modifier a(@l Modifier modifier0, @l TextDragObserver textDragObserver0, boolean z) {
        L.p(modifier0, "<this>");
        L.p(textDragObserver0, "observer");
        return z ? SuspendingPointerInputFilterKt.c(modifier0, textDragObserver0, new o(textDragObserver0, null) {
            int k;
            private Object l;
            final TextDragObserver m;

            {
                this.m = textDragObserver0;
                super(2, d0);
            }

            @m
            public final Object a(@l PointerInputScope pointerInputScope0, @m d d0) {
                return ((androidx.compose.foundation.text.TextFieldGestureModifiersKt.longPressDragGestureFilter.1)this.create(pointerInputScope0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.foundation.text.TextFieldGestureModifiersKt.longPressDragGestureFilter.1(this.m, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((PointerInputScope)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        this.k = 1;
                        return LongPressTextDragObserverKt.d(((PointerInputScope)this.l), this.m, this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }) : modifier0;
    }

    @l
    public static final Modifier b(@l Modifier modifier0, @l MouseSelectionObserver mouseSelectionObserver0, boolean z) {
        L.p(modifier0, "<this>");
        L.p(mouseSelectionObserver0, "observer");
        if(z) {
            androidx.compose.foundation.text.TextFieldGestureModifiersKt.mouseDragGestureDetector.1 textFieldGestureModifiersKt$mouseDragGestureDetector$10 = new o(mouseSelectionObserver0, null) {
                int k;
                private Object l;
                final MouseSelectionObserver m;

                {
                    this.m = mouseSelectionObserver0;
                    super(2, d0);
                }

                @m
                public final Object a(@l PointerInputScope pointerInputScope0, @m d d0) {
                    return ((androidx.compose.foundation.text.TextFieldGestureModifiersKt.mouseDragGestureDetector.1)this.create(pointerInputScope0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    d d1 = new androidx.compose.foundation.text.TextFieldGestureModifiersKt.mouseDragGestureDetector.1(this.m, d0);
                    d1.l = object0;
                    return d1;
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.a(((PointerInputScope)object0), ((d)object1));
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    Object object1 = b.l();
                    switch(this.k) {
                        case 0: {
                            f0.n(object0);
                            this.k = 1;
                            return TextSelectionMouseDetectorKt.c(((PointerInputScope)this.l), this.m, this) == object1 ? object1 : S0.a;
                        }
                        case 1: {
                            f0.n(object0);
                            return S0.a;
                        }
                        default: {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                    }
                }
            };
            return SuspendingPointerInputFilterKt.c(Modifier.m0, mouseSelectionObserver0, textFieldGestureModifiersKt$mouseDragGestureDetector$10);
        }
        return modifier0;
    }

    @l
    public static final Modifier c(@l Modifier modifier0, boolean z, @l FocusRequester focusRequester0, @m MutableInteractionSource mutableInteractionSource0, @l Function1 function10) {
        L.p(modifier0, "<this>");
        L.p(focusRequester0, "focusRequester");
        L.p(function10, "onFocusChanged");
        return FocusableKt.b(FocusChangedModifierKt.a(FocusRequesterModifierKt.a(modifier0, focusRequester0), function10), z, mutableInteractionSource0);
    }
}

