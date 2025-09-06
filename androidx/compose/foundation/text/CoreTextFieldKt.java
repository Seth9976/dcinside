package androidx.compose.foundation.text;

import A3.a;
import A3.o;
import A3.p;
import android.view.KeyEvent;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.selection.SelectionHandleInfo;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.e;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteAllCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.Y;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.q0;
import kotlin.r0;
import kotlin.ranges.s;
import kotlinx.coroutines.O;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

@s0({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 10 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 11 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,1087:1\n25#2:1088\n36#2:1100\n50#2:1107\n49#2:1108\n25#2:1115\n25#2:1122\n25#2:1129\n25#2:1143\n25#2:1154\n460#2,13:1180\n473#2,3:1194\n36#2:1200\n36#2:1208\n1114#3,6:1089\n1114#3,6:1101\n1114#3,6:1109\n1114#3,6:1116\n1114#3,6:1123\n1114#3,6:1130\n1114#3,3:1144\n1117#3,3:1150\n1114#3,6:1155\n1114#3,6:1201\n1114#3,6:1209\n76#4:1095\n76#4:1096\n76#4:1097\n76#4:1098\n76#4:1099\n76#4:1136\n76#4:1137\n76#4:1138\n76#4:1168\n76#4:1207\n474#5,4:1139\n478#5,2:1147\n482#5:1153\n474#6:1149\n67#7,6:1161\n73#7:1193\n77#7:1198\n75#8:1167\n76#8,11:1169\n89#8:1197\n1#9:1199\n480#10,4:1215\n485#10:1224\n122#11,5:1219\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt\n*L\n200#1:1088\n216#1:1100\n219#1:1107\n219#1:1108\n232#1:1115\n260#1:1122\n263#1:1129\n275#1:1143\n276#1:1154\n669#1:1180,13\n669#1:1194,3\n1037#1:1200\n1045#1:1208\n200#1:1089,6\n216#1:1101,6\n219#1:1109,6\n232#1:1116,6\n260#1:1123,6\n263#1:1130,6\n275#1:1144,3\n275#1:1150,3\n276#1:1155,6\n1037#1:1201,6\n1045#1:1209,6\n204#1:1095\n205#1:1096\n206#1:1097\n207#1:1098\n208#1:1099\n269#1:1136\n270#1:1137\n271#1:1138\n669#1:1168\n1038#1:1207\n275#1:1139,4\n275#1:1147,2\n275#1:1153\n275#1:1149\n669#1:1161,6\n669#1:1193\n669#1:1198\n669#1:1167\n669#1:1169,11\n669#1:1197\n1073#1:1215,4\n1073#1:1224\n1073#1:1219,5\n*E\n"})
public final class CoreTextFieldKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    public static final void a(@l TextFieldValue textFieldValue0, @l Function1 function10, @m Modifier modifier0, @m TextStyle textStyle0, @m VisualTransformation visualTransformation0, @m Function1 function11, @m MutableInteractionSource mutableInteractionSource0, @m Brush brush0, boolean z, int v, int v1, @m ImeOptions imeOptions0, @m KeyboardActions keyboardActions0, boolean z1, boolean z2, @m p p0, @m Composer composer0, int v2, int v3, int v4) {
        Modifier modifier1;
        p p1;
        boolean z5;
        boolean z4;
        KeyboardActions keyboardActions1;
        ImeOptions imeOptions1;
        int v11;
        int v10;
        boolean z3;
        Brush brush1;
        MutableInteractionSource mutableInteractionSource1;
        Function1 function12;
        VisualTransformation visualTransformation1;
        TextStyle textStyle1;
        FocusManager focusManager1;
        int v14;
        p p2;
        boolean z8;
        boolean z7;
        KeyboardActions keyboardActions2;
        ImeOptions imeOptions2;
        int v13;
        int v12;
        boolean z6;
        Brush brush2;
        MutableInteractionSource mutableInteractionSource2;
        Function1 function13;
        VisualTransformation visualTransformation2;
        TextStyle textStyle2;
        Modifier modifier2;
        ImeOptions imeOptions3;
        Brush brush3;
        Modifier modifier4;
        int v15;
        int v8;
        int v6;
        L.p(textFieldValue0, "value");
        L.p(function10, "onValueChange");
        Composer composer1 = composer0.G(-958708118);
        int v5 = 4;
        if((v4 & 1) == 0) {
            v6 = (v2 & 14) == 0 ? v2 | (composer1.t(textFieldValue0) ? 4 : 2) : v2;
        }
        else {
            v6 = v2 | 6;
        }
        if((v4 & 2) != 0) {
            v6 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v6 |= (composer1.Y(function10) ? 0x20 : 16);
        }
        int v7 = v6;
        if((v4 & 4) != 0) {
            v7 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v7 |= (composer1.t(modifier0) ? 0x100 : 0x80);
        }
        if((v4 & 8) != 0) {
            v7 |= 0xC00;
        }
        else if((v2 & 0x1C00) == 0) {
            v7 |= (composer1.t(textStyle0) ? 0x800 : 0x400);
        }
        if((v4 & 16) != 0) {
            v7 |= 0x6000;
        }
        else if((v2 & 0xE000) == 0) {
            v7 |= (composer1.t(visualTransformation0) ? 0x4000 : 0x2000);
        }
        if((v4 & 0x20) != 0) {
            v7 |= 0x30000;
        }
        else if((v2 & 0x70000) == 0) {
            v7 |= (composer1.Y(function11) ? 0x20000 : 0x10000);
        }
        if((v4 & 0x40) != 0) {
            v7 |= 0x180000;
        }
        else if((v2 & 0x380000) == 0) {
            v7 |= (composer1.t(mutableInteractionSource0) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x80) != 0) {
            v7 |= 0xC00000;
        }
        else if((v2 & 0x1C00000) == 0) {
            v7 |= (composer1.t(brush0) ? 0x800000 : 0x400000);
        }
        if((v4 & 0x100) != 0) {
            v7 |= 0x6000000;
        }
        else if((v2 & 0xE000000) == 0) {
            v7 |= (composer1.v(z) ? 0x4000000 : 0x2000000);
        }
        if((v4 & 0x200) != 0) {
            v7 |= 0x30000000;
        }
        else if((v2 & 0x70000000) == 0) {
            v7 |= (composer1.z(v) ? 0x20000000 : 0x10000000);
        }
        if((v4 & 0x400) != 0) {
            v8 = v3 | 6;
        }
        else if((v3 & 14) == 0) {
            if(!composer1.z(v1)) {
                v5 = 2;
            }
            v8 = v3 | v5;
        }
        else {
            v8 = v3;
        }
        if((v3 & 0x70) == 0) {
            v8 |= ((v4 & 0x800) != 0 || !composer1.t(imeOptions0) ? 16 : 0x20);
        }
        int v9 = v8;
        if((v4 & 0x1000) != 0) {
            v9 |= 0x180;
        }
        else if((v3 & 0x380) == 0) {
            v9 |= (composer1.t(keyboardActions0) ? 0x100 : 0x80);
        }
        if((v4 & 0x2000) != 0) {
            v9 |= 0xC00;
        }
        else if((v3 & 0x1C00) == 0) {
            v9 |= (composer1.v(z1) ? 0x800 : 0x400);
        }
        if((v4 & 0x4000) != 0) {
            v9 |= 0x6000;
        }
        else if((v3 & 0xE000) == 0) {
            v9 |= (composer1.v(z2) ? 0x4000 : 0x2000);
        }
        if((v4 & 0x8000) != 0) {
            v9 |= 0x30000;
        }
        else if((v3 & 0x70000) == 0) {
            v9 |= (composer1.Y(p0) ? 0x20000 : 0x10000);
        }
        if((v7 & 0x5B6DB6DB) != 306783378 || (0x5B6DB & v9) != 74898 || !composer1.c()) {
            composer1.Z();
            if((v2 & 1) == 0 || composer1.p()) {
                Modifier modifier3 = (v4 & 4) == 0 ? modifier0 : Modifier.m0;
                TextStyle textStyle3 = (v4 & 8) == 0 ? textStyle0 : TextStyle.d.a();
                VisualTransformation visualTransformation3 = (v4 & 16) == 0 ? visualTransformation0 : VisualTransformation.a.a();
                function13 = (v4 & 0x20) == 0 ? function11 : androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.1.e;
                MutableInteractionSource mutableInteractionSource3 = (v4 & 0x40) == 0 ? mutableInteractionSource0 : null;
                if((v4 & 0x80) == 0) {
                    v15 = v4 & 0x2000;
                    modifier4 = modifier3;
                    brush3 = brush0;
                }
                else {
                    v15 = v4 & 0x2000;
                    modifier4 = modifier3;
                    brush3 = new SolidColor(16L, null);
                }
                boolean z9 = (v4 & 0x100) == 0 ? z : true;
                int v16 = (v4 & 0x400) == 0 ? v1 : 1;
                if((0x800 & v4) == 0) {
                    imeOptions3 = imeOptions0;
                }
                else {
                    imeOptions3 = ImeOptions.f.a();
                    v9 &= 0xFFFFFF8F;
                }
                KeyboardActions keyboardActions3 = (v4 & 0x1000) == 0 ? keyboardActions0 : KeyboardActions.g.a();
                boolean z10 = v15 == 0 ? z1 : true;
                boolean z11 = (v4 & 0x4000) == 0 ? z2 : false;
                if((v4 & 0x8000) == 0) {
                    modifier2 = modifier4;
                    p2 = p0;
                    z6 = z9;
                    keyboardActions2 = keyboardActions3;
                    v13 = v16;
                    v14 = v9;
                    imeOptions2 = imeOptions3;
                    z7 = z10;
                    z8 = z11;
                    textStyle2 = textStyle3;
                    visualTransformation2 = visualTransformation3;
                    mutableInteractionSource2 = mutableInteractionSource3;
                }
                else {
                    z6 = z9;
                    keyboardActions2 = keyboardActions3;
                    v13 = v16;
                    v14 = v9;
                    imeOptions2 = imeOptions3;
                    z7 = z10;
                    z8 = z11;
                    p2 = ComposableSingletons.CoreTextFieldKt.a.a();
                    textStyle2 = textStyle3;
                    visualTransformation2 = visualTransformation3;
                    mutableInteractionSource2 = mutableInteractionSource3;
                    modifier2 = modifier4;
                }
                v12 = (v4 & 0x200) == 0 ? v : 0x7FFFFFFF;
                brush2 = brush3;
            }
            else {
                composer1.m();
                if((0x800 & v4) == 0) {
                    modifier2 = modifier0;
                    textStyle2 = textStyle0;
                    visualTransformation2 = visualTransformation0;
                    function13 = function11;
                    mutableInteractionSource2 = mutableInteractionSource0;
                    brush2 = brush0;
                    z6 = z;
                    v12 = v;
                    v13 = v1;
                    keyboardActions2 = keyboardActions0;
                    z7 = z1;
                    z8 = z2;
                    p2 = p0;
                    v14 = v9;
                    imeOptions2 = imeOptions0;
                }
                else {
                    modifier2 = modifier0;
                    textStyle2 = textStyle0;
                    visualTransformation2 = visualTransformation0;
                    function13 = function11;
                    mutableInteractionSource2 = mutableInteractionSource0;
                    brush2 = brush0;
                    z6 = z;
                    v12 = v;
                    v13 = v1;
                    imeOptions2 = imeOptions0;
                    keyboardActions2 = keyboardActions0;
                    z7 = z1;
                    z8 = z2;
                    p2 = p0;
                    v14 = v9 & 0xFFFFFF8F;
                }
            }
            composer1.P();
            if(ComposerKt.g0()) {
                ComposerKt.w0(-958708118, v7, v14, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:180)");
            }
            composer1.V(0xE2A708A4);
            FocusRequester focusRequester0 = composer1.W();
            Companion composer$Companion0 = Composer.a;
            if(focusRequester0 == composer$Companion0.a()) {
                focusRequester0 = new FocusRequester();
                composer1.O(focusRequester0);
            }
            composer1.g0();
            composer1.V(-55012947);
            TextInputService textInputService0 = !z7 || z8 ? null : ((TextInputService)composer1.L(CompositionLocalsKt.t()));
            composer1.g0();
            Object object0 = composer1.L(CompositionLocalsKt.i());
            Resolver fontFamily$Resolver0 = (Resolver)composer1.L(CompositionLocalsKt.k());
            long v17 = ((TextSelectionColors)composer1.L(TextSelectionColorsKt.c())).a();
            FocusManager focusManager0 = (FocusManager)composer1.L(CompositionLocalsKt.j());
            Orientation orientation0 = v12 != 1 || z6 || !imeOptions2.h() ? Orientation.a : Orientation.b;
            Object[] arr_object = {orientation0};
            Saver saver0 = TextFieldScrollerPosition.f.a();
            composer1.V(0x44FAF204);
            boolean z12 = composer1.t(orientation0);
            androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.scrollerPosition.1.1 coreTextFieldKt$CoreTextField$scrollerPosition$1$10 = composer1.W();
            if(z12 || coreTextFieldKt$CoreTextField$scrollerPosition$1$10 == composer$Companion0.a()) {
                coreTextFieldKt$CoreTextField$scrollerPosition$1$10 = new a(orientation0) {
                    final Orientation e;

                    {
                        this.e = orientation0;
                        super(0);
                    }

                    @l
                    public final TextFieldScrollerPosition b() {
                        return new TextFieldScrollerPosition(this.e, 0.0f, 2, null);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.b();
                    }
                };
                composer1.O(coreTextFieldKt$CoreTextField$scrollerPosition$1$10);
            }
            composer1.g0();
            Object object1 = RememberSaveableKt.d(arr_object, saver0, null, coreTextFieldKt$CoreTextField$scrollerPosition$1$10, composer1, 72, 4);
            composer1.V(0x1E7B2B64);
            boolean z13 = composer1.t(textFieldValue0);
            boolean z14 = composer1.t(visualTransformation2);
            TransformedText transformedText0 = composer1.W();
            if(z13 || z14 || transformedText0 == composer$Companion0.a()) {
                TransformedText transformedText1 = ValidatingOffsetMappingKt.a(visualTransformation2, textFieldValue0.f());
                TextRange textRange0 = textFieldValue0.g();
                if(textRange0 == null) {
                    transformedText0 = transformedText1;
                }
                else {
                    transformedText0 = TextFieldDelegate.a.a(textRange0.r(), transformedText1);
                    if(transformedText0 == null) {
                        transformedText0 = transformedText1;
                    }
                }
                composer1.O(transformedText0);
            }
            composer1.g0();
            AnnotatedString annotatedString0 = transformedText0.b();
            OffsetMapping offsetMapping0 = transformedText0.a();
            RecomposeScope recomposeScope0 = ComposablesKt.m(composer1, 0);
            composer1.V(0xE2A708A4);
            TextFieldState textFieldState0 = composer1.W();
            if(textFieldState0 == composer$Companion0.a()) {
                textFieldState0 = new TextFieldState(new TextDelegate(annotatedString0, textStyle2, 0, 0, z6, 0, ((Density)object0), fontFamily$Resolver0, null, 300, null), recomposeScope0);
                composer1.O(textFieldState0);
            }
            composer1.g0();
            textFieldState0.G(textFieldValue0.f(), annotatedString0, textStyle2, z6, ((Density)object0), fontFamily$Resolver0, function10, keyboardActions2, focusManager0, v17);
            textFieldState0.k().f(textFieldValue0, textFieldState0.e());
            composer1.V(0xE2A708A4);
            UndoManager undoManager0 = composer1.W();
            if(undoManager0 == composer$Companion0.a()) {
                undoManager0 = new UndoManager(0, 1, null);
                composer1.O(undoManager0);
            }
            composer1.g0();
            UndoManager.g(undoManager0, textFieldValue0, 0L, 2, null);
            composer1.V(0xE2A708A4);
            TextFieldSelectionManager textFieldSelectionManager0 = composer1.W();
            if(textFieldSelectionManager0 == composer$Companion0.a()) {
                textFieldSelectionManager0 = new TextFieldSelectionManager(undoManager0);
                composer1.O(textFieldSelectionManager0);
            }
            composer1.g0();
            textFieldSelectionManager0.Y(offsetMapping0);
            textFieldSelectionManager0.d0(visualTransformation2);
            textFieldSelectionManager0.Z(textFieldState0.j());
            textFieldSelectionManager0.a0(textFieldState0);
            textFieldSelectionManager0.c0(textFieldValue0);
            textFieldSelectionManager0.R(((ClipboardManager)composer1.L(CompositionLocalsKt.h())));
            textFieldSelectionManager0.b0(((TextToolbar)composer1.L(CompositionLocalsKt.u())));
            textFieldSelectionManager0.X(((HapticFeedback)composer1.L(CompositionLocalsKt.n())));
            textFieldSelectionManager0.V(focusRequester0);
            textFieldSelectionManager0.U(!z8);
            composer1.V(0x2E20B340);
            composer1.V(0xE2A708A4);
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer1.W();
            if(compositionScopedCoroutineScopeCanceller0 == composer$Companion0.a()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller1 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.m(i.a, composer1));
                composer1.O(compositionScopedCoroutineScopeCanceller1);
                compositionScopedCoroutineScopeCanceller0 = compositionScopedCoroutineScopeCanceller1;
            }
            composer1.g0();
            O o0 = compositionScopedCoroutineScopeCanceller0.b();
            composer1.g0();
            composer1.V(0xE2A708A4);
            BringIntoViewRequester bringIntoViewRequester0 = composer1.W();
            if(bringIntoViewRequester0 == composer$Companion0.a()) {
                bringIntoViewRequester0 = BringIntoViewRequesterKt.a();
                composer1.O(bringIntoViewRequester0);
            }
            composer1.g0();
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.m0;
            Modifier modifier5 = TextFieldGestureModifiersKt.c(modifier$Companion0, z7, focusRequester0, mutableInteractionSource2, new Function1(textFieldState0, textInputService0, textFieldValue0, imeOptions2, offsetMapping0, textFieldSelectionManager0, o0, bringIntoViewRequester0) {
                final TextFieldState e;
                final TextInputService f;
                final TextFieldValue g;
                final ImeOptions h;
                final OffsetMapping i;
                final TextFieldSelectionManager j;
                final O k;
                final BringIntoViewRequester l;

                {
                    this.e = textFieldState0;
                    this.f = textInputService0;
                    this.g = textFieldValue0;
                    this.h = imeOptions0;
                    this.i = offsetMapping0;
                    this.j = textFieldSelectionManager0;
                    this.k = o0;
                    this.l = bringIntoViewRequester0;
                    super(1);
                }

                public final void a(@l FocusState focusState0) {
                    L.p(focusState0, "it");
                    if(this.e.d() == focusState0.a()) {
                        return;
                    }
                    boolean z = focusState0.a();
                    this.e.v(z);
                    TextInputService textInputService0 = this.f;
                    if(textInputService0 != null) {
                        CoreTextFieldKt.m(textInputService0, this.e, this.g, this.h, this.i);
                        if(focusState0.a()) {
                            TextLayoutResultProxy textLayoutResultProxy0 = this.e.g();
                            if(textLayoutResultProxy0 != null) {
                                androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.focusModifier.1.1.1 coreTextFieldKt$CoreTextField$focusModifier$1$1$10 = new o(this.g, this.e, textLayoutResultProxy0, this.i, null) {
                                    int k;
                                    final BringIntoViewRequester l;
                                    final TextFieldValue m;
                                    final TextFieldState n;
                                    final TextLayoutResultProxy o;
                                    final OffsetMapping p;

                                    {
                                        this.l = bringIntoViewRequester0;
                                        this.m = textFieldValue0;
                                        this.n = textFieldState0;
                                        this.o = textLayoutResultProxy0;
                                        this.p = offsetMapping0;
                                        super(2, d0);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @l
                                    public final d create(@m Object object0, @l d d0) {
                                        return new androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.focusModifier.1.1.1(this.l, this.m, this.n, this.o, this.p, d0);
                                    }

                                    @Override  // A3.o
                                    public Object invoke(Object object0, Object object1) {
                                        return this.invoke(((O)object0), ((d)object1));
                                    }

                                    @m
                                    public final Object invoke(@l O o0, @m d d0) {
                                        return ((androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.focusModifier.1.1.1)this.create(o0, d0)).invokeSuspend(S0.a);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @m
                                    public final Object invokeSuspend(@l Object object0) {
                                        Object object1 = b.l();
                                        switch(this.k) {
                                            case 0: {
                                                f0.n(object0);
                                                this.k = 1;
                                                return CoreTextFieldKt.k(this.l, this.m, this.n.r(), this.o.i(), this.p, this) == object1 ? object1 : S0.a;
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
                                k.f(this.k, null, null, coreTextFieldKt$CoreTextField$focusModifier$1$1$10, 3, null);
                            }
                        }
                    }
                    if(!focusState0.a()) {
                        TextFieldSelectionManager.r(this.j, null, 1, null);
                    }
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.a(((FocusState)object0));
                    return S0.a;
                }
            });
            composer1.V(-55008430);
            if(!z7 || z8) {
                focusManager1 = focusManager0;
            }
            else {
                focusManager1 = focusManager0;
                EffectsKt.c(textFieldState0, new Function1(textFieldState0) {
                    final TextFieldState e;

                    {
                        this.e = textFieldState0;
                        super(1);
                    }

                    @l
                    public final DisposableEffectResult a(@l DisposableEffectScope disposableEffectScope0) {
                        L.p(disposableEffectScope0, "$this$DisposableEffect");
                        return new DisposableEffectResult() {
                            @Override  // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                if(this.a.d()) {
                                    CoreTextFieldKt.n(this.a);
                                }
                            }
                        };
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.a(((DisposableEffectScope)object0));
                    }
                }, composer1, 8);
            }
            composer1.g0();
            Modifier modifier6 = TextFieldGestureModifiersKt.a(modifier$Companion0, textFieldSelectionManager0.I(), z7);
            Modifier modifier7 = TextFieldPressGestureFilterKt.a(modifier$Companion0, mutableInteractionSource2, z7, new Function1(textFieldState0, focusRequester0, z8, textFieldSelectionManager0, offsetMapping0) {
                final TextFieldState e;
                final FocusRequester f;
                final boolean g;
                final TextFieldSelectionManager h;
                final OffsetMapping i;

                {
                    this.e = textFieldState0;
                    this.f = focusRequester0;
                    this.g = z;
                    this.h = textFieldSelectionManager0;
                    this.i = offsetMapping0;
                    super(1);
                }

                public final void a(long v) {
                    CoreTextFieldKt.p(this.e, this.f, !this.g);
                    if(this.e.d()) {
                        if(this.e.c() == HandleState.b) {
                            Offset offset0 = Offset.d(v);
                            this.h.q(offset0);
                        }
                        else {
                            TextLayoutResultProxy textLayoutResultProxy0 = this.e.g();
                            if(textLayoutResultProxy0 != null) {
                                TextFieldState textFieldState0 = this.e;
                                TextFieldDelegate.a.j(v, textLayoutResultProxy0, textFieldState0.k(), this.i, textFieldState0.j());
                                if(textFieldState0.r().n().length() > 0) {
                                    textFieldState0.u(HandleState.c);
                                }
                            }
                        }
                    }
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.a(((Offset)object0).A());
                    return S0.a;
                }
            }).r0(modifier6);
            Modifier modifier8 = DrawModifierKt.a(modifier$Companion0, new Function1(textFieldState0, textFieldValue0, offsetMapping0) {
                final TextFieldState e;
                final TextFieldValue f;
                final OffsetMapping g;

                {
                    this.e = textFieldState0;
                    this.f = textFieldValue0;
                    this.g = offsetMapping0;
                    super(1);
                }

                public final void a(@l DrawScope drawScope0) {
                    L.p(drawScope0, "$this$drawBehind");
                    TextLayoutResultProxy textLayoutResultProxy0 = this.e.g();
                    if(textLayoutResultProxy0 != null) {
                        Canvas canvas0 = drawScope0.J0().a();
                        Paint paint0 = this.e.m();
                        TextFieldDelegate.a.b(canvas0, this.f, this.g, textLayoutResultProxy0.i(), paint0);
                    }
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.a(((DrawScope)object0));
                    return S0.a;
                }
            });
            Modifier modifier9 = OnGloballyPositionedModifierKt.a(modifier$Companion0, new Function1(textFieldState0, z7, textFieldSelectionManager0, textFieldValue0, offsetMapping0) {
                final TextFieldState e;
                final boolean f;
                final TextFieldSelectionManager g;
                final TextFieldValue h;
                final OffsetMapping i;

                {
                    this.e = textFieldState0;
                    this.f = z;
                    this.g = textFieldSelectionManager0;
                    this.h = textFieldValue0;
                    this.i = offsetMapping0;
                    super(1);
                }

                public final void a(@l LayoutCoordinates layoutCoordinates0) {
                    L.p(layoutCoordinates0, "it");
                    this.e.x(layoutCoordinates0);
                    if(this.f) {
                        if(this.e.c() == HandleState.b) {
                            if(this.e.o()) {
                                this.g.e0();
                            }
                            else {
                                this.g.N();
                            }
                            boolean z = TextFieldSelectionManagerKt.c(this.g, true);
                            this.e.D(z);
                            boolean z1 = TextFieldSelectionManagerKt.c(this.g, false);
                            this.e.C(z1);
                        }
                        else if(this.e.c() == HandleState.c) {
                            boolean z2 = TextFieldSelectionManagerKt.c(this.g, true);
                            this.e.A(z2);
                        }
                        CoreTextFieldKt.l(this.e, this.h, this.i);
                    }
                    TextLayoutResultProxy textLayoutResultProxy0 = this.e.g();
                    if(textLayoutResultProxy0 != null) {
                        textLayoutResultProxy0.m(layoutCoordinates0);
                    }
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.a(((LayoutCoordinates)object0));
                    return S0.a;
                }
            });
            Modifier modifier10 = SemanticsModifierKt.b(modifier$Companion0, true, new Function1(imeOptions2, transformedText0, textFieldValue0, z7, visualTransformation2 instanceof PasswordVisualTransformation, z8, textFieldState0, offsetMapping0, textFieldSelectionManager0, focusRequester0) {
                final ImeOptions e;
                final TransformedText f;
                final TextFieldValue g;
                final boolean h;
                final boolean i;
                final boolean j;
                final TextFieldState k;
                final OffsetMapping l;
                final TextFieldSelectionManager m;
                final FocusRequester n;

                {
                    this.e = imeOptions0;
                    this.f = transformedText0;
                    this.g = textFieldValue0;
                    this.h = z;
                    this.i = z1;
                    this.j = z2;
                    this.k = textFieldState0;
                    this.l = offsetMapping0;
                    this.m = textFieldSelectionManager0;
                    this.n = focusRequester0;
                    super(1);
                }

                public final void a(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
                    L.p(semanticsPropertyReceiver0, "$this$semantics");
                    SemanticsPropertiesKt.L0(semanticsPropertyReceiver0, this.e.f());
                    SemanticsPropertiesKt.I0(semanticsPropertyReceiver0, this.f.b());
                    SemanticsPropertiesKt.a1(semanticsPropertyReceiver0, this.g.h());
                    if(!this.h) {
                        SemanticsPropertiesKt.j(semanticsPropertyReceiver0);
                    }
                    if(this.i) {
                        SemanticsPropertiesKt.s0(semanticsPropertyReceiver0);
                    }
                    SemanticsPropertiesKt.U(semanticsPropertyReceiver0, null, new Function1() {
                        final TextFieldState e;

                        {
                            this.e = textFieldState0;
                            super(1);
                        }

                        @l
                        public final Boolean a(@l List list0) {
                            L.p(list0, "it");
                            if(this.e.g() != null) {
                                TextLayoutResultProxy textLayoutResultProxy0 = this.e.g();
                                L.m(textLayoutResultProxy0);
                                list0.add(textLayoutResultProxy0.i());
                                return true;
                            }
                            return false;
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            return this.a(((List)object0));
                        }
                    }, 1, null);
                    SemanticsPropertiesKt.Z0(semanticsPropertyReceiver0, null, new Function1(semanticsPropertyReceiver0) {
                        final TextFieldState e;
                        final SemanticsPropertyReceiver f;

                        {
                            this.e = textFieldState0;
                            this.f = semanticsPropertyReceiver0;
                            super(1);
                        }

                        @l
                        public final Boolean a(@l AnnotatedString annotatedString0) {
                            S0 s00;
                            L.p(annotatedString0, "text");
                            TextInputSession textInputSession0 = this.e.e();
                            if(textInputSession0 == null) {
                                s00 = null;
                            }
                            else {
                                List list0 = u.O(new EditCommand[]{new DeleteAllCommand(), new CommitTextCommand(annotatedString0, 1)});
                                TextFieldDelegate.a.g(list0, this.e.k(), this.e.j(), textInputSession0);
                                s00 = S0.a;
                            }
                            if(s00 == null) {
                                TextFieldValue textFieldValue0 = new TextFieldValue(annotatedString0.j(), TextRangeKt.a(annotatedString0.j().length()), null, 4, null);
                                this.e.j().invoke(textFieldValue0);
                            }
                            return true;
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            return this.a(((AnnotatedString)object0));
                        }
                    }, 1, null);
                    SemanticsPropertiesKt.U0(semanticsPropertyReceiver0, null, new p(this.h, this.g, this.m, this.k) {
                        final OffsetMapping e;
                        final boolean f;
                        final TextFieldValue g;
                        final TextFieldSelectionManager h;
                        final TextFieldState i;

                        {
                            this.e = offsetMapping0;
                            this.f = z;
                            this.g = textFieldValue0;
                            this.h = textFieldSelectionManager0;
                            this.i = textFieldState0;
                            super(3);
                        }

                        @l
                        public final Boolean a(int v, int v1, boolean z) {
                            if(!z) {
                                v = this.e.a(v);
                            }
                            if(!z) {
                                v1 = this.e.a(v1);
                            }
                            if(this.f && (v != TextRange.n(this.g.h()) || v1 != TextRange.i(this.g.h()))) {
                                if(s.B(v, v1) >= 0 && s.u(v, v1) <= this.g.f().length()) {
                                    if(z || v == v1) {
                                        this.h.t();
                                    }
                                    else {
                                        this.h.s();
                                    }
                                    long v2 = TextRangeKt.b(v, v1);
                                    TextFieldValue textFieldValue0 = new TextFieldValue(this.g.f(), v2, null, 4, null);
                                    this.i.j().invoke(textFieldValue0);
                                    return true;
                                }
                                this.h.t();
                            }
                            return false;
                        }

                        @Override  // A3.p
                        public Object invoke(Object object0, Object object1, Object object2) {
                            return this.a(((Number)object0).intValue(), ((Number)object1).intValue(), ((Boolean)object2).booleanValue());
                        }
                    }, 1, null);
                    SemanticsPropertiesKt.h0(semanticsPropertyReceiver0, null, new a(this.n, this.j) {
                        final TextFieldState e;
                        final FocusRequester f;
                        final boolean g;

                        {
                            this.e = textFieldState0;
                            this.f = focusRequester0;
                            this.g = z;
                            super(0);
                        }

                        @l
                        public final Boolean b() {
                            CoreTextFieldKt.p(this.e, this.f, !this.g);
                            return true;
                        }

                        @Override  // A3.a
                        public Object invoke() {
                            return this.b();
                        }
                    }, 1, null);
                    SemanticsPropertiesKt.j0(semanticsPropertyReceiver0, null, new a() {
                        final TextFieldSelectionManager e;

                        {
                            this.e = textFieldSelectionManager0;
                            super(0);
                        }

                        @l
                        public final Boolean b() {
                            this.e.s();
                            return true;
                        }

                        @Override  // A3.a
                        public Object invoke() {
                            return this.b();
                        }
                    }, 1, null);
                    if(!TextRange.h(this.g.h()) && !this.i) {
                        SemanticsPropertiesKt.f(semanticsPropertyReceiver0, null, new a() {
                            final TextFieldSelectionManager e;

                            {
                                this.e = textFieldSelectionManager0;
                                super(0);
                            }

                            @l
                            public final Boolean b() {
                                TextFieldSelectionManager.m(this.e, false, 1, null);
                                return true;
                            }

                            @Override  // A3.a
                            public Object invoke() {
                                return this.b();
                            }
                        }, 1, null);
                        if(this.h && !this.j) {
                            SemanticsPropertiesKt.h(semanticsPropertyReceiver0, null, new a() {
                                final TextFieldSelectionManager e;

                                {
                                    this.e = textFieldSelectionManager0;
                                    super(0);
                                }

                                @l
                                public final Boolean b() {
                                    this.e.p();
                                    return true;
                                }

                                @Override  // A3.a
                                public Object invoke() {
                                    return this.b();
                                }
                            }, 1, null);
                        }
                    }
                    if(this.h && !this.j) {
                        SemanticsPropertiesKt.u0(semanticsPropertyReceiver0, null, new a() {
                            final TextFieldSelectionManager e;

                            {
                                this.e = textFieldSelectionManager0;
                                super(0);
                            }

                            @l
                            public final Boolean b() {
                                this.e.P();
                                return true;
                            }

                            @Override  // A3.a
                            public Object invoke() {
                                return this.b();
                            }
                        }, 1, null);
                    }
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.a(((SemanticsPropertyReceiver)object0));
                    return S0.a;
                }
            });
            Modifier modifier11 = TextFieldCursorKt.b(modifier$Companion0, textFieldState0, textFieldValue0, offsetMapping0, brush2, z7 && !z8);
            EffectsKt.c(textFieldSelectionManager0, new Function1(textFieldSelectionManager0) {
                final TextFieldSelectionManager e;

                {
                    this.e = textFieldSelectionManager0;
                    super(1);
                }

                @l
                public final DisposableEffectResult a(@l DisposableEffectScope disposableEffectScope0) {
                    L.p(disposableEffectScope0, "$this$DisposableEffect");
                    return new DisposableEffectResult() {
                        @Override  // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            this.a.N();
                        }
                    };
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((DisposableEffectScope)object0));
                }
            }, composer1, 8);
            EffectsKt.c(imeOptions2, new Function1(textInputService0, textFieldState0, textFieldValue0, imeOptions2) {
                final TextInputService e;
                final TextFieldState f;
                final TextFieldValue g;
                final ImeOptions h;

                {
                    this.e = textInputService0;
                    this.f = textFieldState0;
                    this.g = textFieldValue0;
                    this.h = imeOptions0;
                    super(1);
                }

                @l
                public final DisposableEffectResult a(@l DisposableEffectScope disposableEffectScope0) {
                    L.p(disposableEffectScope0, "$this$DisposableEffect");
                    if(this.e != null && this.f.d()) {
                        TextInputSession textInputSession0 = TextFieldDelegate.a.i(this.e, this.g, this.f.k(), this.h, this.f.j(), this.f.i());
                        this.f.w(textInputSession0);
                    }
                    return new androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.4.invoke..inlined.onDispose.1();

                    @s0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$4\n*L\n1#1,484:1\n528#2:485\n*E\n"})
                    public final class androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.4.invoke..inlined.onDispose.1 implements DisposableEffectResult {
                        @Override  // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                        }
                    }

                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((DisposableEffectScope)object0));
                }
            }, composer1, v14 >> 3 & 14);
            Modifier modifier12 = TextFieldKeyInputKt.a(modifier$Companion0, textFieldState0, textFieldSelectionManager0, textFieldValue0, textFieldState0.j(), !z8, v12 == 1, offsetMapping0, undoManager0);
            Modifier modifier13 = OnGloballyPositionedModifierKt.a(TextFieldScrollKt.d(CoreTextFieldKt.o(TextFieldFocusModifier_androidKt.a(modifier2.r0(modifier5), textFieldState0, focusManager1), textFieldState0, textFieldSelectionManager0).r0(modifier12), ((TextFieldScrollerPosition)object1), mutableInteractionSource2, z7).r0(modifier7).r0(modifier10), new Function1(textFieldState0) {
                final TextFieldState e;

                {
                    this.e = textFieldState0;
                    super(1);
                }

                public final void a(@l LayoutCoordinates layoutCoordinates0) {
                    L.p(layoutCoordinates0, "it");
                    TextLayoutResultProxy textLayoutResultProxy0 = this.e.g();
                    if(textLayoutResultProxy0 != null) {
                        textLayoutResultProxy0.l(layoutCoordinates0);
                    }
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.a(((LayoutCoordinates)object0));
                    return S0.a;
                }
            });
            boolean z15 = z7 && textFieldState0.d();
            Modifier modifier14 = z15 ? TextFieldSelectionManager_androidKt.b(modifier$Companion0, textFieldSelectionManager0) : modifier$Companion0;
            CoreTextFieldKt.b(modifier13, textFieldSelectionManager0, ComposableLambdaKt.b(composer1, 0xE9B00DE0, true, new o(p2, v14, textFieldState0, textStyle2, v13, v12, ((TextFieldScrollerPosition)object1), textFieldValue0, visualTransformation2, modifier11, modifier8, modifier9, modifier14, bringIntoViewRequester0, textFieldSelectionManager0, z15, z8, function13, offsetMapping0, ((Density)object0)) {
                final p e;
                final int f;
                final TextFieldState g;
                final TextStyle h;
                final int i;
                final int j;
                final TextFieldScrollerPosition k;
                final TextFieldValue l;
                final VisualTransformation m;
                final Modifier n;
                final Modifier o;
                final Modifier p;
                final Modifier q;
                final BringIntoViewRequester r;
                final TextFieldSelectionManager s;
                final boolean t;
                final boolean u;
                final Function1 v;
                final OffsetMapping w;
                final Density x;

                {
                    this.e = p0;
                    this.f = v;
                    this.g = textFieldState0;
                    this.h = textStyle0;
                    this.i = v1;
                    this.j = v2;
                    this.k = textFieldScrollerPosition0;
                    this.l = textFieldValue0;
                    this.m = visualTransformation0;
                    this.n = modifier0;
                    this.o = modifier1;
                    this.p = modifier2;
                    this.q = modifier3;
                    this.r = bringIntoViewRequester0;
                    this.s = textFieldSelectionManager0;
                    this.t = z;
                    this.u = z1;
                    this.v = function10;
                    this.w = offsetMapping0;
                    this.x = density0;
                    super(2);
                }

                @Composable
                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                public final void a(@m Composer composer0, int v) {
                    if((v & 11) == 2 && composer0.c()) {
                        composer0.m();
                        return;
                    }
                    if(ComposerKt.g0()) {
                        ComposerKt.w0(0xE9B00DE0, v, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:563)");
                    }
                    ComposableLambda composableLambda0 = ComposableLambdaKt.b(composer0, 2032502107, true, new o(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x) {
                        final TextFieldState e;
                        final TextStyle f;
                        final int g;
                        final int h;
                        final TextFieldScrollerPosition i;
                        final TextFieldValue j;
                        final VisualTransformation k;
                        final Modifier l;
                        final Modifier m;
                        final Modifier n;
                        final Modifier o;
                        final BringIntoViewRequester p;
                        final TextFieldSelectionManager q;
                        final boolean r;
                        final boolean s;
                        final Function1 t;
                        final OffsetMapping u;
                        final Density v;

                        {
                            this.e = textFieldState0;
                            this.f = textStyle0;
                            this.g = v;
                            this.h = v1;
                            this.i = textFieldScrollerPosition0;
                            this.j = textFieldValue0;
                            this.k = visualTransformation0;
                            this.l = modifier0;
                            this.m = modifier1;
                            this.n = modifier2;
                            this.o = modifier3;
                            this.p = bringIntoViewRequester0;
                            this.q = textFieldSelectionManager0;
                            this.r = z;
                            this.s = z1;
                            this.t = function10;
                            this.u = offsetMapping0;
                            this.v = density0;
                            super(2);
                        }

                        @Composable
                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        public final void a(@m Composer composer0, int v) {
                            if((v & 11) == 2 && composer0.c()) {
                                composer0.m();
                                return;
                            }
                            if(ComposerKt.g0()) {
                                ComposerKt.w0(2032502107, v, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:564)");
                            }
                            float f = this.e.h();
                            Modifier modifier0 = HeightInLinesModifierKt.a(SizeKt.q(Modifier.m0, f, 0.0f, 2, null), this.f, this.g, this.h);
                            androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.coreTextFieldModifier.1 coreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$10 = new a() {
                                final TextFieldState e;

                                {
                                    this.e = textFieldState0;
                                    super(0);
                                }

                                @m
                                public final TextLayoutResultProxy b() {
                                    return this.e.g();
                                }

                                @Override  // A3.a
                                public Object invoke() {
                                    return this.b();
                                }
                            };
                            SimpleLayoutKt.a(BringIntoViewRequesterKt.b(TextFieldSizeKt.a(TextFieldScrollKt.c(modifier0, this.i, this.j, this.k, coreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$10).r0(this.l).r0(this.m), this.f).r0(this.n).r0(this.o), this.p), ComposableLambdaKt.b(composer0, 0xEA5A8151, true, new o(this.e, this.r, this.s, this.t, this.j, this.u, this.v, this.h) {
                                final TextFieldSelectionManager e;
                                final TextFieldState f;
                                final boolean g;
                                final boolean h;
                                final Function1 i;
                                final TextFieldValue j;
                                final OffsetMapping k;
                                final Density l;
                                final int m;

                                {
                                    this.e = textFieldSelectionManager0;
                                    this.f = textFieldState0;
                                    this.g = z;
                                    this.h = z1;
                                    this.i = function10;
                                    this.j = textFieldValue0;
                                    this.k = offsetMapping0;
                                    this.l = density0;
                                    this.m = v;
                                    super(2);
                                }

                                @Composable
                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                public final void a(@m Composer composer0, int v) {
                                    if((v & 11) == 2 && composer0.c()) {
                                        composer0.m();
                                        return;
                                    }
                                    if(ComposerKt.g0()) {
                                        ComposerKt.w0(0xEA5A8151, v, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:589)");
                                    }
                                    androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2 coreTextFieldKt$CoreTextField$5$1$1$20 = new MeasurePolicy() {
                                        @Override  // androidx.compose.ui.layout.MeasurePolicy
                                        @l
                                        public MeasureResult a(@l MeasureScope measureScope0, @l List list0, long v) {
                                            TextLayoutResult textLayoutResult0;
                                            L.p(measureScope0, "$this$measure");
                                            L.p(list0, "measurables");
                                            Snapshot snapshot0 = Snapshot.e.a();
                                            try {
                                                Snapshot snapshot1 = snapshot0.p();
                                                try {
                                                    TextLayoutResultProxy textLayoutResultProxy0 = this.i.g();
                                                    textLayoutResult0 = textLayoutResultProxy0 == null ? null : textLayoutResultProxy0.i();
                                                }
                                                finally {
                                                    snapshot0.w(snapshot1);
                                                }
                                            }
                                            finally {
                                                snapshot0.d();
                                            }
                                            LayoutDirection layoutDirection0 = measureScope0.getLayoutDirection();
                                            q0 q00 = TextFieldDelegate.a.c(this.i.r(), v, layoutDirection0, textLayoutResult0);
                                            int v3 = ((Number)q00.a()).intValue();
                                            int v4 = ((Number)q00.b()).intValue();
                                            TextLayoutResult textLayoutResult1 = (TextLayoutResult)q00.c();
                                            if(!L.g(textLayoutResult0, textLayoutResult1)) {
                                                TextLayoutResultProxy textLayoutResultProxy1 = new TextLayoutResultProxy(textLayoutResult1);
                                                this.i.y(textLayoutResultProxy1);
                                                this.j.invoke(textLayoutResult1);
                                                CoreTextFieldKt.l(this.i, this.k, this.l);
                                            }
                                            int v5 = this.f == 1 ? TextDelegateKt.a(textLayoutResult1.m(0)) : 0;
                                            this.i.z(this.m.C(v5));
                                            return measureScope0.o1(v3, v4, Y.W(new V[]{r0.a(AlignmentLineKt.a(), kotlin.math.b.L0(textLayoutResult1.h())), r0.a(AlignmentLineKt.b(), kotlin.math.b.L0(textLayoutResult1.k()))}), androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2.measure.2.e);

                                            final class androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2.measure.2 extends N implements Function1 {
                                                public static final androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2.measure.2 e;

                                                static {
                                                    androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2.measure.2.e = new androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2.measure.2();
                                                }

                                                androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2.measure.2() {
                                                    super(1);
                                                }

                                                public final void a(@l PlacementScope placeable$PlacementScope0) {
                                                    L.p(placeable$PlacementScope0, "$this$layout");
                                                }

                                                @Override  // kotlin.jvm.functions.Function1
                                                public Object invoke(Object object0) {
                                                    this.a(((PlacementScope)object0));
                                                    return S0.a;
                                                }
                                            }

                                        }

                                        @Override  // androidx.compose.ui.layout.MeasurePolicy
                                        public int b(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
                                            return e.c(this, intrinsicMeasureScope0, list0, v);
                                        }

                                        @Override  // androidx.compose.ui.layout.MeasurePolicy
                                        public int c(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
                                            return e.d(this, intrinsicMeasureScope0, list0, v);
                                        }

                                        @Override  // androidx.compose.ui.layout.MeasurePolicy
                                        public int d(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
                                            return e.a(this, intrinsicMeasureScope0, list0, v);
                                        }

                                        @Override  // androidx.compose.ui.layout.MeasurePolicy
                                        public int e(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l List list0, int v) {
                                            L.p(intrinsicMeasureScope0, "<this>");
                                            L.p(list0, "measurables");
                                            LayoutDirection layoutDirection0 = intrinsicMeasureScope0.getLayoutDirection();
                                            this.i.r().q(layoutDirection0);
                                            return this.i.r().d();
                                        }
                                    };
                                    composer0.V(-1323940314);
                                    Density density0 = (Density)composer0.L(CompositionLocalsKt.i());
                                    LayoutDirection layoutDirection0 = (LayoutDirection)composer0.L(CompositionLocalsKt.p());
                                    ViewConfiguration viewConfiguration0 = (ViewConfiguration)composer0.L(CompositionLocalsKt.w());
                                    androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.p0;
                                    a a0 = composeUiNode$Companion0.a();
                                    p p0 = LayoutKt.f(Modifier.m0);
                                    if(!(composer0.H() instanceof Applier)) {
                                        ComposablesKt.n();
                                    }
                                    composer0.h();
                                    if(composer0.E()) {
                                        composer0.k(a0);
                                    }
                                    else {
                                        composer0.f();
                                    }
                                    Composer composer1 = Updater.b(composer0);
                                    Updater.j(composer1, coreTextFieldKt$CoreTextField$5$1$1$20, composeUiNode$Companion0.d());
                                    Updater.j(composer1, density0, composeUiNode$Companion0.b());
                                    Updater.j(composer1, layoutDirection0, composeUiNode$Companion0.c());
                                    Updater.j(composer1, viewConfiguration0, composeUiNode$Companion0.f());
                                    boolean z = false;
                                    p0.invoke(SkippableUpdater.a(SkippableUpdater.b(composer0)), composer0, 0);
                                    composer0.V(2058660585);
                                    composer0.g0();
                                    composer0.g();
                                    composer0.g0();
                                    TextFieldSelectionManager textFieldSelectionManager0 = this.e;
                                    if(this.f.c() == HandleState.b && this.f.f() != null) {
                                        LayoutCoordinates layoutCoordinates0 = this.f.f();
                                        L.m(layoutCoordinates0);
                                        if(layoutCoordinates0.o() && this.g) {
                                            z = true;
                                        }
                                    }
                                    CoreTextFieldKt.c(textFieldSelectionManager0, z, composer0, 8);
                                    if(this.f.c() == HandleState.c && !this.h && this.g) {
                                        CoreTextFieldKt.d(this.e, composer0, 8);
                                    }
                                    if(ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override  // A3.o
                                public Object invoke(Object object0, Object object1) {
                                    this.a(((Composer)object0), ((Number)object1).intValue());
                                    return S0.a;
                                }
                            }), composer0, 0x30, 0);
                            if(ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override  // A3.o
                        public Object invoke(Object object0, Object object1) {
                            this.a(((Composer)object0), ((Number)object1).intValue());
                            return S0.a;
                        }
                    });
                    this.e.invoke(composableLambda0, composer0, ((int)(this.f >> 12 & 0x70 | 6)));
                    if(ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            }), composer1, 0x1C0);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            textStyle1 = textStyle2;
            function12 = function13;
            mutableInteractionSource1 = mutableInteractionSource2;
            brush1 = brush2;
            z3 = z6;
            modifier1 = modifier2;
            v11 = v13;
            keyboardActions1 = keyboardActions2;
            z5 = z8;
            p1 = p2;
            z4 = z7;
            imeOptions1 = imeOptions2;
            v10 = v12;
            visualTransformation1 = visualTransformation2;
        }
        else {
            composer1.m();
            textStyle1 = textStyle0;
            visualTransformation1 = visualTransformation0;
            function12 = function11;
            mutableInteractionSource1 = mutableInteractionSource0;
            brush1 = brush0;
            z3 = z;
            v10 = v;
            v11 = v1;
            imeOptions1 = imeOptions0;
            keyboardActions1 = keyboardActions0;
            z4 = z1;
            z5 = z2;
            p1 = p0;
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(textFieldValue0, function10, modifier1, textStyle1, visualTransformation1, function12, mutableInteractionSource1, brush1, z3, v10, v11, imeOptions1, keyboardActions1, z4, z5, p1, v2, v3, v4) {
                final TextFieldValue e;
                final Function1 f;
                final Modifier g;
                final TextStyle h;
                final VisualTransformation i;
                final Function1 j;
                final MutableInteractionSource k;
                final Brush l;
                final boolean m;
                final int n;
                final int o;
                final ImeOptions p;
                final KeyboardActions q;
                final boolean r;
                final boolean s;
                final p t;
                final int u;
                final int v;
                final int w;

                {
                    this.e = textFieldValue0;
                    this.f = function10;
                    this.g = modifier0;
                    this.h = textStyle0;
                    this.i = visualTransformation0;
                    this.j = function11;
                    this.k = mutableInteractionSource0;
                    this.l = brush0;
                    this.m = z;
                    this.n = v;
                    this.o = v1;
                    this.p = imeOptions0;
                    this.q = keyboardActions0;
                    this.r = z1;
                    this.s = z2;
                    this.t = p0;
                    this.u = v2;
                    this.v = v3;
                    this.w = v4;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    CoreTextFieldKt.a(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, composer0, (this.u | 1) & -920350135 | ((0x24924924 & (this.u | 1)) >> 1 | 306783378 & (this.u | 1)) | (306783378 & (this.u | 1)) << 1 & (0x24924924 & (this.u | 1)), this.v & -920350135 | ((0x24924924 & this.v) >> 1 | 306783378 & this.v) | (306783378 & this.v) << 1 & (0x24924924 & this.v), this.w);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }

        final class androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.1 extends N implements Function1 {
            public static final androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.1 e;

            static {
                androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.1.e = new androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.1();
            }

            androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.1() {
                super(1);
            }

            public final void a(@l TextLayoutResult textLayoutResult0) {
                L.p(textLayoutResult0, "it");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((TextLayoutResult)object0));
                return S0.a;
            }
        }

    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    private static final void b(Modifier modifier0, TextFieldSelectionManager textFieldSelectionManager0, o o0, Composer composer0, int v) {
        Composer composer1 = composer0.G(-20551815);
        if(ComposerKt.g0()) {
            ComposerKt.w0(-20551815, v, -1, "androidx.compose.foundation.text.CoreTextFieldRootBox (CoreTextField.kt:663)");
        }
        composer1.V(0x2BB5B5D7);
        MeasurePolicy measurePolicy0 = BoxKt.k(Alignment.a.C(), true, composer1, 0x30);
        composer1.V(-1323940314);
        Density density0 = (Density)composer1.L(CompositionLocalsKt.i());
        LayoutDirection layoutDirection0 = (LayoutDirection)composer1.L(CompositionLocalsKt.p());
        ViewConfiguration viewConfiguration0 = (ViewConfiguration)composer1.L(CompositionLocalsKt.w());
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.p0;
        a a0 = composeUiNode$Companion0.a();
        p p0 = LayoutKt.f(modifier0);
        if(!(composer1.H() instanceof Applier)) {
            ComposablesKt.n();
        }
        composer1.h();
        if(composer1.E()) {
            composer1.k(a0);
        }
        else {
            composer1.f();
        }
        composer1.b0();
        Composer composer2 = Updater.b(composer1);
        Updater.j(composer2, measurePolicy0, composeUiNode$Companion0.d());
        Updater.j(composer2, density0, composeUiNode$Companion0.b());
        Updater.j(composer2, layoutDirection0, composeUiNode$Companion0.c());
        Updater.j(composer2, viewConfiguration0, composeUiNode$Companion0.f());
        composer1.y();
        p0.invoke(SkippableUpdater.a(SkippableUpdater.b(composer1)), composer1, 0);
        composer1.V(2058660585);
        ContextMenu_androidKt.b(textFieldSelectionManager0, o0, composer1, v >> 3 & 0x70 | 8);
        composer1.g0();
        composer1.g();
        composer1.g0();
        composer1.g0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(modifier0, textFieldSelectionManager0, o0, v) {
                final Modifier e;
                final TextFieldSelectionManager f;
                final o g;
                final int h;

                {
                    this.e = modifier0;
                    this.f = textFieldSelectionManager0;
                    this.g = o0;
                    this.h = v;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    CoreTextFieldKt.b(this.e, this.f, this.g, composer0, (this.h | 1) & -920350135 | ((0x24924924 & (this.h | 1)) >> 1 | 306783378 & (this.h | 1)) | (306783378 & (this.h | 1)) << 1 & (0x24924924 & (this.h | 1)));
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    private static final void c(TextFieldSelectionManager textFieldSelectionManager0, boolean z, Composer composer0, int v) {
        Composer composer1 = composer0.G(626339208);
        if(ComposerKt.g0()) {
            ComposerKt.w0(626339208, v, -1, "androidx.compose.foundation.text.SelectionToolbarAndHandles (CoreTextField.kt:991)");
        }
        if(z) {
            TextFieldState textFieldState0 = textFieldSelectionManager0.G();
            TextLayoutResult textLayoutResult0 = null;
            if(textFieldState0 != null) {
                TextLayoutResultProxy textLayoutResultProxy0 = textFieldState0.g();
                if(textLayoutResultProxy0 != null) {
                    TextLayoutResult textLayoutResult1 = textLayoutResultProxy0.i();
                    if(textLayoutResult1 != null) {
                        TextFieldState textFieldState1 = textFieldSelectionManager0.G();
                        if(!(textFieldState1 == null ? true : textFieldState1.t())) {
                            textLayoutResult0 = textLayoutResult1;
                        }
                    }
                }
            }
            if(textLayoutResult0 != null) {
                if(!TextRange.h(textFieldSelectionManager0.K().h())) {
                    int v1 = textFieldSelectionManager0.E().b(TextRange.n(textFieldSelectionManager0.K().h()));
                    int v2 = textFieldSelectionManager0.E().b(TextRange.i(textFieldSelectionManager0.K().h()));
                    ResolvedTextDirection resolvedTextDirection0 = textLayoutResult0.c(v1);
                    ResolvedTextDirection resolvedTextDirection1 = textLayoutResult0.c(Math.max(v2 - 1, 0));
                    composer1.V(0xE24B2608);
                    TextFieldState textFieldState2 = textFieldSelectionManager0.G();
                    if(textFieldState2 != null && textFieldState2.q()) {
                        TextFieldSelectionManagerKt.a(true, resolvedTextDirection0, textFieldSelectionManager0, composer1, 0x206);
                    }
                    composer1.g0();
                    TextFieldState textFieldState3 = textFieldSelectionManager0.G();
                    if(textFieldState3 != null && textFieldState3.p()) {
                        TextFieldSelectionManagerKt.a(false, resolvedTextDirection1, textFieldSelectionManager0, composer1, 0x206);
                    }
                }
                TextFieldState textFieldState4 = textFieldSelectionManager0.G();
                if(textFieldState4 != null) {
                    if(textFieldSelectionManager0.O()) {
                        textFieldState4.B(false);
                    }
                    if(textFieldState4.d()) {
                        if(textFieldState4.o()) {
                            textFieldSelectionManager0.e0();
                        }
                        else {
                            textFieldSelectionManager0.N();
                        }
                    }
                }
            }
        }
        else {
            textFieldSelectionManager0.N();
        }
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(textFieldSelectionManager0, z, v) {
                final TextFieldSelectionManager e;
                final boolean f;
                final int g;

                {
                    this.e = textFieldSelectionManager0;
                    this.f = z;
                    this.g = v;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    CoreTextFieldKt.c(this.e, this.f, composer0, (this.g | 1) & -920350135 | ((0x24924924 & (this.g | 1)) >> 1 | 306783378 & (this.g | 1)) | (306783378 & (this.g | 1)) << 1 & (0x24924924 & (this.g | 1)));
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void d(@l TextFieldSelectionManager textFieldSelectionManager0, @m Composer composer0, int v) {
        L.p(textFieldSelectionManager0, "manager");
        Composer composer1 = composer0.G(-1436003720);
        if(ComposerKt.g0()) {
            ComposerKt.w0(-1436003720, v, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (CoreTextField.kt:1034)");
        }
        TextFieldState textFieldState0 = textFieldSelectionManager0.G();
        if(textFieldState0 != null && textFieldState0.n()) {
            composer1.V(0x44FAF204);
            boolean z = composer1.t(textFieldSelectionManager0);
            TextDragObserver textDragObserver0 = composer1.W();
            if(z || textDragObserver0 == Composer.a.a()) {
                textDragObserver0 = textFieldSelectionManager0.o();
                composer1.O(textDragObserver0);
            }
            composer1.g0();
            long v1 = textFieldSelectionManager0.x(((Density)composer1.L(CompositionLocalsKt.i())));
            androidx.compose.foundation.text.CoreTextFieldKt.TextFieldCursorHandle.1 coreTextFieldKt$TextFieldCursorHandle$10 = new o(textDragObserver0, null) {
                int k;
                private Object l;
                final TextDragObserver m;

                {
                    this.m = textDragObserver0;
                    super(2, d0);
                }

                @m
                public final Object a(@l PointerInputScope pointerInputScope0, @m d d0) {
                    return ((androidx.compose.foundation.text.CoreTextFieldKt.TextFieldCursorHandle.1)this.create(pointerInputScope0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    d d1 = new androidx.compose.foundation.text.CoreTextFieldKt.TextFieldCursorHandle.1(this.m, d0);
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
                            return LongPressTextDragObserverKt.c(((PointerInputScope)this.l), this.m, this) == object1 ? object1 : S0.a;
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
            Modifier modifier0 = SuspendingPointerInputFilterKt.c(Modifier.m0, textDragObserver0, coreTextFieldKt$TextFieldCursorHandle$10);
            Offset offset0 = Offset.d(v1);
            composer1.V(0x44FAF204);
            boolean z1 = composer1.t(offset0);
            androidx.compose.foundation.text.CoreTextFieldKt.TextFieldCursorHandle.2.1 coreTextFieldKt$TextFieldCursorHandle$2$10 = composer1.W();
            if(z1 || coreTextFieldKt$TextFieldCursorHandle$2$10 == Composer.a.a()) {
                coreTextFieldKt$TextFieldCursorHandle$2$10 = new Function1(v1) {
                    final long e;

                    {
                        this.e = v;
                        super(1);
                    }

                    public final void a(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
                        L.p(semanticsPropertyReceiver0, "$this$semantics");
                        semanticsPropertyReceiver0.a(SelectionHandlesKt.d(), new SelectionHandleInfo(Handle.a, this.e, null));
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((SemanticsPropertyReceiver)object0));
                        return S0.a;
                    }
                };
                composer1.O(coreTextFieldKt$TextFieldCursorHandle$2$10);
            }
            composer1.g0();
            AndroidCursorHandle_androidKt.a(v1, SemanticsModifierKt.c(modifier0, false, coreTextFieldKt$TextFieldCursorHandle$2$10, 1, null), null, composer1, 0x180);
        }
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(textFieldSelectionManager0, v) {
                final TextFieldSelectionManager e;
                final int f;

                {
                    this.e = textFieldSelectionManager0;
                    this.f = v;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    CoreTextFieldKt.d(this.e, composer0, (this.f | 1) & -920350135 | ((0x24924924 & (this.f | 1)) >> 1 | 306783378 & (this.f | 1)) | (306783378 & (this.f | 1)) << 1 & (0x24924924 & (this.f | 1)));
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
    }

    @m
    public static final Object k(@l BringIntoViewRequester bringIntoViewRequester0, @l TextFieldValue textFieldValue0, @l TextDelegate textDelegate0, @l TextLayoutResult textLayoutResult0, @l OffsetMapping offsetMapping0, @l d d0) {
        Rect rect0;
        int v = offsetMapping0.b(TextRange.k(textFieldValue0.h()));
        if(v < textLayoutResult0.l().n().length()) {
            rect0 = textLayoutResult0.d(v);
        }
        else {
            rect0 = v == 0 ? new Rect(0.0f, 0.0f, 1.0f, ((float)IntSize.j(TextFieldDelegateKt.b(textDelegate0.m(), textDelegate0.a(), textDelegate0.b(), null, 0, 24, null)))) : textLayoutResult0.d(v - 1);
        }
        Object object0 = bringIntoViewRequester0.a(rect0, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    private static final void l(TextFieldState textFieldState0, TextFieldValue textFieldValue0, OffsetMapping offsetMapping0) {
        Snapshot snapshot0 = Snapshot.e.a();
        try {
            Snapshot snapshot1 = snapshot0.p();
            try {
                TextLayoutResultProxy textLayoutResultProxy0 = textFieldState0.g();
                if(textLayoutResultProxy0 != null) {
                    TextInputSession textInputSession0 = textFieldState0.e();
                    if(textInputSession0 != null) {
                        LayoutCoordinates layoutCoordinates0 = textFieldState0.f();
                        if(layoutCoordinates0 != null) {
                            boolean z = textFieldState0.d();
                            TextFieldDelegate.a.e(textFieldValue0, textFieldState0.r(), textLayoutResultProxy0.i(), layoutCoordinates0, textInputSession0, z, offsetMapping0);
                            goto label_16;
                        }
                        goto label_19;
                    }
                    goto label_22;
                }
                goto label_25;
            }
            catch(Throwable throwable0) {
                snapshot0.w(snapshot1);
                throw throwable0;
            }
        label_16:
            snapshot0.w(snapshot1);
            return;
        label_19:
            snapshot0.w(snapshot1);
            return;
        label_22:
            snapshot0.w(snapshot1);
            return;
        label_25:
            snapshot0.w(snapshot1);
        }
        finally {
            snapshot0.d();
        }
    }

    private static final void m(TextInputService textInputService0, TextFieldState textFieldState0, TextFieldValue textFieldValue0, ImeOptions imeOptions0, OffsetMapping offsetMapping0) {
        if(textFieldState0.d()) {
            textFieldState0.w(TextFieldDelegate.a.h(textInputService0, textFieldValue0, textFieldState0.k(), imeOptions0, textFieldState0.j(), textFieldState0.i()));
            CoreTextFieldKt.l(textFieldState0, textFieldValue0, offsetMapping0);
            return;
        }
        CoreTextFieldKt.n(textFieldState0);
    }

    private static final void n(TextFieldState textFieldState0) {
        TextInputSession textInputSession0 = textFieldState0.e();
        if(textInputSession0 != null) {
            TextFieldDelegate.a.f(textInputSession0, textFieldState0.k(), textFieldState0.j());
        }
        textFieldState0.w(null);
    }

    private static final Modifier o(Modifier modifier0, TextFieldState textFieldState0, TextFieldSelectionManager textFieldSelectionManager0) {
        return KeyInputModifierKt.b(modifier0, new Function1(textFieldState0, textFieldSelectionManager0) {
            final TextFieldState e;
            final TextFieldSelectionManager f;

            {
                this.e = textFieldState0;
                this.f = textFieldSelectionManager0;
                super(1);
            }

            @l
            public final Boolean a(@l KeyEvent keyEvent0) {
                L.p(keyEvent0, "keyEvent");
                if(this.e.c() == HandleState.b && KeyEventHelpers_androidKt.a(keyEvent0)) {
                    TextFieldSelectionManager.r(this.f, null, 1, null);
                    return true;
                }
                return false;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((androidx.compose.ui.input.key.KeyEvent)object0).h());
            }
        });
    }

    private static final void p(TextFieldState textFieldState0, FocusRequester focusRequester0, boolean z) {
        if(!textFieldState0.d()) {
            focusRequester0.h();
            return;
        }
        if(z) {
            TextInputSession textInputSession0 = textFieldState0.e();
            if(textInputSession0 != null) {
                textInputSession0.f();
            }
        }
    }
}

