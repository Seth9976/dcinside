package androidx.compose.foundation.text;

import A3.p;
import android.view.KeyEvent;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextPreparedSelectionState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;
import y4.m;

public final class TextFieldKeyInputKt {
    @l
    public static final Modifier a(@l Modifier modifier0, @l TextFieldState textFieldState0, @l TextFieldSelectionManager textFieldSelectionManager0, @l TextFieldValue textFieldValue0, @l Function1 function10, boolean z, boolean z1, @l OffsetMapping offsetMapping0, @l UndoManager undoManager0) {
        L.p(modifier0, "<this>");
        L.p(textFieldState0, "state");
        L.p(textFieldSelectionManager0, "manager");
        L.p(textFieldValue0, "value");
        L.p(function10, "onValueChange");
        L.p(offsetMapping0, "offsetMapping");
        L.p(undoManager0, "undoManager");
        return ComposedModifierKt.j(modifier0, null, new p(textFieldState0, textFieldSelectionManager0, textFieldValue0, z, z1, offsetMapping0, undoManager0, function10) {
            final TextFieldState e;
            final TextFieldSelectionManager f;
            final TextFieldValue g;
            final boolean h;
            final boolean i;
            final OffsetMapping j;
            final UndoManager k;
            final Function1 l;

            {
                this.e = textFieldState0;
                this.f = textFieldSelectionManager0;
                this.g = textFieldValue0;
                this.h = z;
                this.i = z1;
                this.j = offsetMapping0;
                this.k = undoManager0;
                this.l = function10;
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(0x37C5DE2);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0x37C5DE2, v, -1, "androidx.compose.foundation.text.textFieldKeyInput.<anonymous> (TextFieldKeyInput.kt:242)");
                }
                composer0.V(0xE2A708A4);
                TextPreparedSelectionState textPreparedSelectionState0 = composer0.W();
                Companion composer$Companion0 = Composer.a;
                if(textPreparedSelectionState0 == composer$Companion0.a()) {
                    textPreparedSelectionState0 = new TextPreparedSelectionState();
                    composer0.O(textPreparedSelectionState0);
                }
                composer0.g0();
                composer0.V(0xE2A708A4);
                DeadKeyCombiner deadKeyCombiner0 = composer0.W();
                if(deadKeyCombiner0 == composer$Companion0.a()) {
                    deadKeyCombiner0 = new DeadKeyCombiner();
                    composer0.O(deadKeyCombiner0);
                }
                composer0.g0();
                androidx.compose.foundation.text.TextFieldKeyInputKt.textFieldKeyInput.2.1 textFieldKeyInputKt$textFieldKeyInput$2$10 = new Function1() {
                    {
                        super(1, object0, TextFieldKeyInput.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
                    }

                    @l
                    public final Boolean a(@l KeyEvent keyEvent0) {
                        L.p(keyEvent0, "p0");
                        return Boolean.valueOf(((TextFieldKeyInput)this.receiver).o(keyEvent0));
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.a(((androidx.compose.ui.input.key.KeyEvent)object0).h());
                    }
                };
                Modifier modifier1 = KeyInputModifierKt.a(Modifier.m0, textFieldKeyInputKt$textFieldKeyInput$2$10);
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return modifier1;
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        }, 1, null);
    }

    public static Modifier b(Modifier modifier0, TextFieldState textFieldState0, TextFieldSelectionManager textFieldSelectionManager0, TextFieldValue textFieldValue0, Function1 function10, boolean z, boolean z1, OffsetMapping offsetMapping0, UndoManager undoManager0, int v, Object object0) {
        return (v & 8) == 0 ? TextFieldKeyInputKt.a(modifier0, textFieldState0, textFieldSelectionManager0, textFieldValue0, function10, z, z1, offsetMapping0, undoManager0) : TextFieldKeyInputKt.a(modifier0, textFieldState0, textFieldSelectionManager0, textFieldValue0, androidx.compose.foundation.text.TextFieldKeyInputKt.textFieldKeyInput.1.e, z, z1, offsetMapping0, undoManager0);

        final class androidx.compose.foundation.text.TextFieldKeyInputKt.textFieldKeyInput.1 extends N implements Function1 {
            public static final androidx.compose.foundation.text.TextFieldKeyInputKt.textFieldKeyInput.1 e;

            static {
                androidx.compose.foundation.text.TextFieldKeyInputKt.textFieldKeyInput.1.e = new androidx.compose.foundation.text.TextFieldKeyInputKt.textFieldKeyInput.1();
            }

            androidx.compose.foundation.text.TextFieldKeyInputKt.textFieldKeyInput.1() {
                super(1);
            }

            public final void a(@l TextFieldValue textFieldValue0) {
                L.p(textFieldValue0, "it");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((TextFieldValue)object0));
                return S0.a;
            }
        }

    }
}

