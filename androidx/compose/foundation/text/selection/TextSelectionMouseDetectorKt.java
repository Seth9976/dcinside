package androidx.compose.foundation.text.selection;

import A3.o;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEvent_androidKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import java.util.List;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nTextSelectionMouseDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextSelectionMouseDetector.kt\nandroidx/compose/foundation/text/selection/TextSelectionMouseDetectorKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,134:1\n86#2,2:135\n33#2,6:137\n88#2:143\n*S KotlinDebug\n*F\n+ 1 TextSelectionMouseDetector.kt\nandroidx/compose/foundation/text/selection/TextSelectionMouseDetectorKt\n*L\n128#1:135,2\n128#1:137,6\n128#1:143\n*E\n"})
public final class TextSelectionMouseDetectorKt {
    public static final double a = 100.0;

    private static final Object b(AwaitPointerEventScope awaitPointerEventScope0, d d0) {
        androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt.awaitMouseEventDown.1 textSelectionMouseDetectorKt$awaitMouseEventDown$10;
        if(d0 instanceof androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt.awaitMouseEventDown.1) {
            textSelectionMouseDetectorKt$awaitMouseEventDown$10 = (androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt.awaitMouseEventDown.1)d0;
            int v = textSelectionMouseDetectorKt$awaitMouseEventDown$10.m;
            if((v & 0x80000000) == 0) {
                textSelectionMouseDetectorKt$awaitMouseEventDown$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                    Object k;
                    Object l;
                    int m;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.l = object0;
                        this.m |= 0x80000000;
                        return TextSelectionMouseDetectorKt.b(null, this);
                    }
                };
            }
            else {
                textSelectionMouseDetectorKt$awaitMouseEventDown$10.m = v ^ 0x80000000;
            }
        }
        else {
            textSelectionMouseDetectorKt$awaitMouseEventDown$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                Object k;
                Object l;
                int m;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.l = object0;
                    this.m |= 0x80000000;
                    return TextSelectionMouseDetectorKt.b(null, this);
                }
            };
        }
        Object object0 = textSelectionMouseDetectorKt$awaitMouseEventDown$10.l;
        Object object1 = b.l();
        switch(textSelectionMouseDetectorKt$awaitMouseEventDown$10.m) {
            case 0: {
                f0.n(object0);
                goto label_27;
            }
            case 1: {
                awaitPointerEventScope0 = (AwaitPointerEventScope)textSelectionMouseDetectorKt$awaitMouseEventDown$10.k;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            if(PointerEvent_androidKt.o(((PointerEvent)object0).d())) {
                List list0 = ((PointerEvent)object0).e();
                int v1 = list0.size();
                int v2 = 0;
                while(v2 < v1) {
                    PointerInputChange pointerInputChange0 = (PointerInputChange)list0.get(v2);
                    if(!PointerType.i(pointerInputChange0.y(), 2) || !PointerEventKt.b(pointerInputChange0)) {
                        goto label_27;
                    }
                    ++v2;
                }
                return (PointerEvent)object0;
            }
        label_27:
            textSelectionMouseDetectorKt$awaitMouseEventDown$10.k = awaitPointerEventScope0;
            textSelectionMouseDetectorKt$awaitMouseEventDown$10.m = 1;
            object0 = awaitPointerEventScope0.l1(PointerEventPass.b, textSelectionMouseDetectorKt$awaitMouseEventDown$10);
        }
        while(object0 != object1);
        return object1;
    }

    @m
    public static final Object c(@l PointerInputScope pointerInputScope0, @l MouseSelectionObserver mouseSelectionObserver0, @l d d0) {
        Object object0 = ForEachGestureKt.d(pointerInputScope0, new o(mouseSelectionObserver0, null) {
            Object l;
            int m;
            private Object n;
            final MouseSelectionObserver o;

            {
                this.o = mouseSelectionObserver0;
                super(2, d0);
            }

            @m
            public final Object a(@l AwaitPointerEventScope awaitPointerEventScope0, @m d d0) {
                return ((androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt.mouseSelectionDetector.2)this.create(awaitPointerEventScope0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt.mouseSelectionDetector.2(this.o, d0);
                d1.n = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((AwaitPointerEventScope)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                SelectionAdjustment selectionAdjustment0;
                PointerInputChange pointerInputChange0;
                AwaitPointerEventScope awaitPointerEventScope1;
                ClicksCounter clicksCounter0;
                AwaitPointerEventScope awaitPointerEventScope0;
                Object object1 = b.l();
                switch(this.m) {
                    case 0: {
                        f0.n(object0);
                        awaitPointerEventScope0 = (AwaitPointerEventScope)this.n;
                        clicksCounter0 = new ClicksCounter(awaitPointerEventScope0.getViewConfiguration());
                        goto label_15;
                    }
                    case 1: {
                        clicksCounter0 = (ClicksCounter)this.l;
                        awaitPointerEventScope1 = (AwaitPointerEventScope)this.n;
                        f0.n(object0);
                        goto label_23;
                    }
                    case 2: 
                    case 3: {
                        clicksCounter0 = (ClicksCounter)this.l;
                        awaitPointerEventScope1 = (AwaitPointerEventScope)this.n;
                        f0.n(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                do {
                    do {
                    alab1:
                        while(true) {
                            while(true) {
                                awaitPointerEventScope0 = awaitPointerEventScope1;
                            label_15:
                                this.n = awaitPointerEventScope0;
                                this.l = clicksCounter0;
                                this.m = 1;
                                Object object2 = TextSelectionMouseDetectorKt.b(awaitPointerEventScope0, this);
                                if(object2 == object1) {
                                    return object1;
                                }
                                awaitPointerEventScope1 = awaitPointerEventScope0;
                                object0 = object2;
                            label_23:
                                clicksCounter0.g(((PointerEvent)object0));
                                pointerInputChange0 = (PointerInputChange)((PointerEvent)object0).e().get(0);
                                if(!TextFieldSelectionManager_androidKt.a(((PointerEvent)object0))) {
                                    break alab1;
                                }
                                if(!this.o.d(pointerInputChange0.q())) {
                                    break;
                                }
                                pointerInputChange0.a();
                                androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt.mouseSelectionDetector.2.1 textSelectionMouseDetectorKt$mouseSelectionDetector$2$10 = new Function1() {
                                    final MouseSelectionObserver e;

                                    {
                                        this.e = mouseSelectionObserver0;
                                        super(1);
                                    }

                                    public final void a(@l PointerInputChange pointerInputChange0) {
                                        L.p(pointerInputChange0, "it");
                                        if(this.e.b(pointerInputChange0.q())) {
                                            pointerInputChange0.a();
                                        }
                                    }

                                    @Override  // kotlin.jvm.functions.Function1
                                    public Object invoke(Object object0) {
                                        this.a(((PointerInputChange)object0));
                                        return S0.a;
                                    }
                                };
                                this.n = awaitPointerEventScope1;
                                this.l = clicksCounter0;
                                this.m = 2;
                                if(DragGestureDetectorKt.y(awaitPointerEventScope1, pointerInputChange0.p(), textSelectionMouseDetectorKt$mouseSelectionDetector$2$10, this) != object1) {
                                    break;
                                }
                                return object1;
                            }
                        }
                        switch(clicksCounter0.a()) {
                            case 1: {
                                selectionAdjustment0 = SelectionAdjustment.a.e();
                                break;
                            }
                            case 2: {
                                selectionAdjustment0 = SelectionAdjustment.a.g();
                                break;
                            }
                            default: {
                                selectionAdjustment0 = SelectionAdjustment.a.f();
                            }
                        }
                    }
                    while(!this.o.c(pointerInputChange0.q(), selectionAdjustment0));
                    pointerInputChange0.a();
                    androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt.mouseSelectionDetector.2.2 textSelectionMouseDetectorKt$mouseSelectionDetector$2$20 = new Function1(selectionAdjustment0) {
                        final MouseSelectionObserver e;
                        final SelectionAdjustment f;

                        {
                            this.e = mouseSelectionObserver0;
                            this.f = selectionAdjustment0;
                            super(1);
                        }

                        public final void a(@l PointerInputChange pointerInputChange0) {
                            L.p(pointerInputChange0, "it");
                            if(this.e.a(pointerInputChange0.q(), this.f)) {
                                pointerInputChange0.a();
                            }
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            this.a(((PointerInputChange)object0));
                            return S0.a;
                        }
                    };
                    this.n = awaitPointerEventScope1;
                    this.l = clicksCounter0;
                    this.m = 3;
                }
                while(DragGestureDetectorKt.y(awaitPointerEventScope1, pointerInputChange0.p(), textSelectionMouseDetectorKt$mouseSelectionDetector$2$20, this) != object1);
                return object1;
            }
        }, d0);
        return object0 == b.l() ? object0 : S0.a;
    }
}

