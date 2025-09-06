package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.b;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.SetSelectionCommand;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/TextFieldPreparedSelection\n+ 2 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/BaseTextPreparedSelection\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n74#2,5:433\n80#2:439\n74#2,7:440\n1#3:438\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/TextFieldPreparedSelection\n*L\n408#1:433,5\n408#1:439\n412#1:440,7\n*E\n"})
public final class TextFieldPreparedSelection extends BaseTextPreparedSelection {
    @l
    private final TextFieldValue j;
    @m
    private final TextLayoutResultProxy k;

    public TextFieldPreparedSelection(@l TextFieldValue textFieldValue0, @l OffsetMapping offsetMapping0, @m TextLayoutResultProxy textLayoutResultProxy0, @l TextPreparedSelectionState textPreparedSelectionState0) {
        L.p(textFieldValue0, "currentValue");
        L.p(offsetMapping0, "offsetMapping");
        L.p(textPreparedSelectionState0, "state");
        super(textFieldValue0.f(), textFieldValue0.h(), (textLayoutResultProxy0 == null ? null : textLayoutResultProxy0.i()), offsetMapping0, textPreparedSelectionState0, null);
        this.j = textFieldValue0;
        this.k = textLayoutResultProxy0;
    }

    public TextFieldPreparedSelection(TextFieldValue textFieldValue0, OffsetMapping offsetMapping0, TextLayoutResultProxy textLayoutResultProxy0, TextPreparedSelectionState textPreparedSelectionState0, int v, w w0) {
        if((v & 2) != 0) {
            offsetMapping0 = OffsetMapping.a.a();
        }
        if((v & 8) != 0) {
            textPreparedSelectionState0 = new TextPreparedSelectionState();
        }
        this(textFieldValue0, offsetMapping0, textLayoutResultProxy0, textPreparedSelectionState0);
    }

    @m
    public final List h0(@l Function1 function10) {
        L.p(function10, "or");
        if(TextRange.h(this.B())) {
            EditCommand editCommand0 = (EditCommand)function10.invoke(this);
            return editCommand0 == null ? null : u.k(editCommand0);
        }
        return u.O(new EditCommand[]{new CommitTextCommand("", 0), new SetSelectionCommand(TextRange.l(this.B()), TextRange.l(this.B()))});
    }

    @l
    public final TextFieldValue i0() {
        return this.j;
    }

    @m
    public final TextLayoutResultProxy j0() {
        return this.k;
    }

    @l
    public final TextFieldValue k0() {
        return TextFieldValue.d(this.j, this.g(), this.B(), null, 4, null);
    }

    private final int l0(TextLayoutResultProxy textLayoutResultProxy0, int v) {
        Rect rect0;
        LayoutCoordinates layoutCoordinates0 = textLayoutResultProxy0.c();
        if(layoutCoordinates0 == null) {
            rect0 = Rect.e.a();
        }
        else {
            LayoutCoordinates layoutCoordinates1 = textLayoutResultProxy0.b();
            rect0 = layoutCoordinates1 == null ? null : b.c(layoutCoordinates1, layoutCoordinates0, false, 2, null);
            if(rect0 == null) {
                rect0 = Rect.e.a();
            }
        }
        Rect rect1 = textLayoutResultProxy0.i().e(this.s().b(TextRange.i(this.j.h())));
        return this.s().a(textLayoutResultProxy0.i().x(OffsetKt.a(rect1.t(), rect1.B() + Size.m(rect0.z()) * ((float)v))));
    }

    @l
    public final TextFieldPreparedSelection m0() {
        if(this.D().length() > 0) {
            TextLayoutResultProxy textLayoutResultProxy0 = this.k;
            if(textLayoutResultProxy0 != null) {
                this.b0(this.l0(textLayoutResultProxy0, 1));
            }
        }
        L.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @l
    public final TextFieldPreparedSelection n0() {
        if(this.D().length() > 0) {
            TextLayoutResultProxy textLayoutResultProxy0 = this.k;
            if(textLayoutResultProxy0 != null) {
                this.b0(this.l0(textLayoutResultProxy0, -1));
            }
        }
        L.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }
}

