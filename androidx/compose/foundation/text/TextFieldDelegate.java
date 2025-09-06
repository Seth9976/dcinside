package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString.Builder;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextPainter;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0.h;
import kotlin.jvm.internal.w;
import kotlin.q0;
import y4.l;
import y4.m;
import z3.n;

public final class TextFieldDelegate {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final TransformedText a(long v, @l TransformedText transformedText0) {
            L.p(transformedText0, "transformed");
            Builder annotatedString$Builder0 = new Builder(transformedText0.b());
            annotatedString$Builder0.c(new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, TextDecoration.b.f(), null, 0x2FFF, null), transformedText0.a().b(((int)(v >> 0x20))), transformedText0.a().b(((int)(v & 0xFFFFFFFFL))));
            return new TransformedText(annotatedString$Builder0.u(), transformedText0.a());
        }

        @n
        public final void b(@l Canvas canvas0, @l TextFieldValue textFieldValue0, @l OffsetMapping offsetMapping0, @l TextLayoutResult textLayoutResult0, @l Paint paint0) {
            L.p(canvas0, "canvas");
            L.p(textFieldValue0, "value");
            L.p(offsetMapping0, "offsetMapping");
            L.p(textLayoutResult0, "textLayoutResult");
            L.p(paint0, "selectionPaint");
            if(!TextRange.h(textFieldValue0.h())) {
                int v = offsetMapping0.b(TextRange.l(textFieldValue0.h()));
                int v1 = offsetMapping0.b(TextRange.k(textFieldValue0.h()));
                if(v != v1) {
                    canvas0.D(textLayoutResult0.z(v, v1), paint0);
                }
            }
            TextPainter.a.a(canvas0, textLayoutResult0);
        }

        @l
        @n
        public final q0 c(@l TextDelegate textDelegate0, long v, @l LayoutDirection layoutDirection0, @m TextLayoutResult textLayoutResult0) {
            L.p(textDelegate0, "textDelegate");
            L.p(layoutDirection0, "layoutDirection");
            TextLayoutResult textLayoutResult1 = textDelegate0.o(v, layoutDirection0, textLayoutResult0);
            return new q0(IntSize.m(textLayoutResult1.B()), IntSize.j(textLayoutResult1.B()), textLayoutResult1);
        }

        public static q0 d(Companion textFieldDelegate$Companion0, TextDelegate textDelegate0, long v, LayoutDirection layoutDirection0, TextLayoutResult textLayoutResult0, int v1, Object object0) {
            if((v1 & 8) != 0) {
                textLayoutResult0 = null;
            }
            return textFieldDelegate$Companion0.c(textDelegate0, v, layoutDirection0, textLayoutResult0);
        }

        @n
        public final void e(@l TextFieldValue textFieldValue0, @l TextDelegate textDelegate0, @l TextLayoutResult textLayoutResult0, @l LayoutCoordinates layoutCoordinates0, @l TextInputSession textInputSession0, boolean z, @l OffsetMapping offsetMapping0) {
            Rect rect0;
            L.p(textFieldValue0, "value");
            L.p(textDelegate0, "textDelegate");
            L.p(textLayoutResult0, "textLayoutResult");
            L.p(layoutCoordinates0, "layoutCoordinates");
            L.p(textInputSession0, "textInputSession");
            L.p(offsetMapping0, "offsetMapping");
            if(!z) {
                return;
            }
            int v = offsetMapping0.b(TextRange.k(textFieldValue0.h()));
            if(v < textLayoutResult0.l().n().length()) {
                rect0 = textLayoutResult0.d(v);
            }
            else {
                rect0 = v == 0 ? new Rect(0.0f, 0.0f, 1.0f, ((float)IntSize.j(TextFieldDelegateKt.b(textDelegate0.m(), textDelegate0.a(), textDelegate0.b(), null, 0, 24, null)))) : textLayoutResult0.d(v - 1);
            }
            long v1 = layoutCoordinates0.L(OffsetKt.a(rect0.t(), rect0.B()));
            textInputSession0.e(RectKt.c(OffsetKt.a(Offset.p(v1), Offset.r(v1)), SizeKt.a(rect0.G(), rect0.r())));
        }

        @n
        public final void f(@l TextInputSession textInputSession0, @l EditProcessor editProcessor0, @l Function1 function10) {
            L.p(textInputSession0, "textInputSession");
            L.p(editProcessor0, "editProcessor");
            L.p(function10, "onValueChange");
            function10.invoke(TextFieldValue.d(editProcessor0.h(), null, 0L, null, 3, null));
            textInputSession0.a();
        }

        @n
        public final void g(@l List list0, @l EditProcessor editProcessor0, @l Function1 function10, @m TextInputSession textInputSession0) {
            L.p(list0, "ops");
            L.p(editProcessor0, "editProcessor");
            L.p(function10, "onValueChange");
            TextFieldValue textFieldValue0 = editProcessor0.b(list0);
            if(textInputSession0 != null) {
                textInputSession0.g(null, textFieldValue0);
            }
            function10.invoke(textFieldValue0);
        }

        @l
        @n
        public final TextInputSession h(@l TextInputService textInputService0, @l TextFieldValue textFieldValue0, @l EditProcessor editProcessor0, @l ImeOptions imeOptions0, @l Function1 function10, @l Function1 function11) {
            L.p(textInputService0, "textInputService");
            L.p(textFieldValue0, "value");
            L.p(editProcessor0, "editProcessor");
            L.p(imeOptions0, "imeOptions");
            L.p(function10, "onValueChange");
            L.p(function11, "onImeActionPerformed");
            return this.i(textInputService0, textFieldValue0, editProcessor0, imeOptions0, function10, function11);
        }

        @l
        @n
        public final TextInputSession i(@l TextInputService textInputService0, @l TextFieldValue textFieldValue0, @l EditProcessor editProcessor0, @l ImeOptions imeOptions0, @l Function1 function10, @l Function1 function11) {
            L.p(textInputService0, "textInputService");
            L.p(textFieldValue0, "value");
            L.p(editProcessor0, "editProcessor");
            L.p(imeOptions0, "imeOptions");
            L.p(function10, "onValueChange");
            L.p(function11, "onImeActionPerformed");
            h l0$h0 = new h();
            TextInputSession textInputSession0 = textInputService0.d(textFieldValue0, imeOptions0, new Function1(function10, l0$h0) {
                final EditProcessor e;
                final Function1 f;
                final h g;

                {
                    this.e = editProcessor0;
                    this.f = function10;
                    this.g = l0$h0;
                    super(1);
                }

                public final void a(@l List list0) {
                    L.p(list0, "it");
                    TextFieldDelegate.a.g(list0, this.e, this.f, ((TextInputSession)this.g.a));
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.a(((List)object0));
                    return S0.a;
                }
            }, function11);
            l0$h0.a = textInputSession0;
            return textInputSession0;
        }

        @n
        public final void j(long v, @l TextLayoutResultProxy textLayoutResultProxy0, @l EditProcessor editProcessor0, @l OffsetMapping offsetMapping0, @l Function1 function10) {
            L.p(textLayoutResultProxy0, "textLayoutResult");
            L.p(editProcessor0, "editProcessor");
            L.p(offsetMapping0, "offsetMapping");
            L.p(function10, "onValueChange");
            function10.invoke(TextFieldValue.d(editProcessor0.h(), null, TextRangeKt.a(offsetMapping0.a(TextLayoutResultProxy.h(textLayoutResultProxy0, v, false, 2, null))), null, 5, null));
        }
    }

    @l
    public static final Companion a;

    static {
        TextFieldDelegate.a = new Companion(null);
    }

    @n
    public static final void a(@l Canvas canvas0, @l TextFieldValue textFieldValue0, @l OffsetMapping offsetMapping0, @l TextLayoutResult textLayoutResult0, @l Paint paint0) {
        TextFieldDelegate.a.b(canvas0, textFieldValue0, offsetMapping0, textLayoutResult0, paint0);
    }

    @l
    @n
    public static final q0 b(@l TextDelegate textDelegate0, long v, @l LayoutDirection layoutDirection0, @m TextLayoutResult textLayoutResult0) {
        return TextFieldDelegate.a.c(textDelegate0, v, layoutDirection0, textLayoutResult0);
    }

    @n
    public static final void c(@l TextFieldValue textFieldValue0, @l TextDelegate textDelegate0, @l TextLayoutResult textLayoutResult0, @l LayoutCoordinates layoutCoordinates0, @l TextInputSession textInputSession0, boolean z, @l OffsetMapping offsetMapping0) {
        TextFieldDelegate.a.e(textFieldValue0, textDelegate0, textLayoutResult0, layoutCoordinates0, textInputSession0, z, offsetMapping0);
    }

    @n
    public static final void d(@l TextInputSession textInputSession0, @l EditProcessor editProcessor0, @l Function1 function10) {
        TextFieldDelegate.a.f(textInputSession0, editProcessor0, function10);
    }

    @n
    public static final void e(@l List list0, @l EditProcessor editProcessor0, @l Function1 function10, @m TextInputSession textInputSession0) {
        TextFieldDelegate.a.g(list0, editProcessor0, function10, textInputSession0);
    }

    @l
    @n
    public static final TextInputSession f(@l TextInputService textInputService0, @l TextFieldValue textFieldValue0, @l EditProcessor editProcessor0, @l ImeOptions imeOptions0, @l Function1 function10, @l Function1 function11) {
        return TextFieldDelegate.a.h(textInputService0, textFieldValue0, editProcessor0, imeOptions0, function10, function11);
    }

    @l
    @n
    public static final TextInputSession g(@l TextInputService textInputService0, @l TextFieldValue textFieldValue0, @l EditProcessor editProcessor0, @l ImeOptions imeOptions0, @l Function1 function10, @l Function1 function11) {
        return TextFieldDelegate.a.i(textInputService0, textFieldValue0, editProcessor0, imeOptions0, function10, function11);
    }

    @n
    public static final void h(long v, @l TextLayoutResultProxy textLayoutResultProxy0, @l EditProcessor editProcessor0, @l OffsetMapping offsetMapping0, @l Function1 function10) {
        TextFieldDelegate.a.j(v, textLayoutResultProxy0, editProcessor0, offsetMapping0, function10);
    }
}

