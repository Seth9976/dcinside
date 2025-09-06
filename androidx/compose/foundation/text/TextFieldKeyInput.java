package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.foundation.text.selection.TextFieldPreparedSelection;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextPreparedSelectionState;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.FinishComposingTextCommand;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0.a;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class TextFieldKeyInput {
    @l
    private final TextFieldState a;
    @l
    private final TextFieldSelectionManager b;
    @l
    private final TextFieldValue c;
    private final boolean d;
    private final boolean e;
    @l
    private final TextPreparedSelectionState f;
    @l
    private final OffsetMapping g;
    @m
    private final UndoManager h;
    @l
    private final DeadKeyCombiner i;
    @l
    private final KeyMapping j;
    @l
    private final Function1 k;

    public TextFieldKeyInput(@l TextFieldState textFieldState0, @l TextFieldSelectionManager textFieldSelectionManager0, @l TextFieldValue textFieldValue0, boolean z, boolean z1, @l TextPreparedSelectionState textPreparedSelectionState0, @l OffsetMapping offsetMapping0, @m UndoManager undoManager0, @l DeadKeyCombiner deadKeyCombiner0, @l KeyMapping keyMapping0, @l Function1 function10) {
        L.p(textFieldState0, "state");
        L.p(textFieldSelectionManager0, "selectionManager");
        L.p(textFieldValue0, "value");
        L.p(textPreparedSelectionState0, "preparedSelectionState");
        L.p(offsetMapping0, "offsetMapping");
        L.p(deadKeyCombiner0, "keyCombiner");
        L.p(keyMapping0, "keyMapping");
        L.p(function10, "onValueChange");
        super();
        this.a = textFieldState0;
        this.b = textFieldSelectionManager0;
        this.c = textFieldValue0;
        this.d = z;
        this.e = z1;
        this.f = textPreparedSelectionState0;
        this.g = offsetMapping0;
        this.h = undoManager0;
        this.i = deadKeyCombiner0;
        this.j = keyMapping0;
        this.k = function10;
    }

    public TextFieldKeyInput(TextFieldState textFieldState0, TextFieldSelectionManager textFieldSelectionManager0, TextFieldValue textFieldValue0, boolean z, boolean z1, TextPreparedSelectionState textPreparedSelectionState0, OffsetMapping offsetMapping0, UndoManager undoManager0, DeadKeyCombiner deadKeyCombiner0, KeyMapping keyMapping0, Function1 function10, int v, w w0) {
        TextFieldValue textFieldValue1 = (v & 4) == 0 ? textFieldValue0 : new TextFieldValue(null, 0L, null, 7, null);
        OffsetMapping offsetMapping1 = (v & 0x40) == 0 ? offsetMapping0 : OffsetMapping.a.a();
        KeyMapping keyMapping1 = (v & 0x200) == 0 ? keyMapping0 : KeyMapping_androidKt.a();
        Function1 function11 = (v & 0x400) == 0 ? function10 : androidx.compose.foundation.text.TextFieldKeyInput.1.e;
        this(textFieldState0, textFieldSelectionManager0, textFieldValue1, ((v & 8) == 0 ? z : true), ((v & 16) == 0 ? z1 : false), textPreparedSelectionState0, offsetMapping1, ((v & 0x80) == 0 ? undoManager0 : null), deadKeyCombiner0, keyMapping1, function11);

        final class androidx.compose.foundation.text.TextFieldKeyInput.1 extends N implements Function1 {
            public static final androidx.compose.foundation.text.TextFieldKeyInput.1 e;

            static {
                androidx.compose.foundation.text.TextFieldKeyInput.1.e = new androidx.compose.foundation.text.TextFieldKeyInput.1();
            }

            androidx.compose.foundation.text.TextFieldKeyInput.1() {
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

    private final void d(EditCommand editCommand0) {
        this.e(u.k(editCommand0));
    }

    private final void e(List list0) {
        List list1 = u.Y5(list0);
        list1.add(0, new FinishComposingTextCommand());
        TextFieldValue textFieldValue0 = this.a.k().b(list1);
        this.k.invoke(textFieldValue0);
    }

    private final void f(Function1 function10) {
        TextLayoutResultProxy textLayoutResultProxy0 = this.a.g();
        TextFieldPreparedSelection textFieldPreparedSelection0 = new TextFieldPreparedSelection(this.c, this.g, textLayoutResultProxy0, this.f);
        function10.invoke(textFieldPreparedSelection0);
        if(!TextRange.g(textFieldPreparedSelection0.B(), this.c.h()) || !L.g(textFieldPreparedSelection0.g(), this.c.f())) {
            TextFieldValue textFieldValue0 = textFieldPreparedSelection0.k0();
            this.k.invoke(textFieldValue0);
        }
    }

    public final boolean g() {
        return this.d;
    }

    @l
    public final OffsetMapping h() {
        return this.g;
    }

    @l
    public final TextPreparedSelectionState i() {
        return this.f;
    }

    @l
    public final TextFieldSelectionManager j() {
        return this.b;
    }

    public final boolean k() {
        return this.e;
    }

    @l
    public final TextFieldState l() {
        return this.a;
    }

    @m
    public final UndoManager m() {
        return this.h;
    }

    @l
    public final TextFieldValue n() {
        return this.c;
    }

    public final boolean o(@l KeyEvent keyEvent0) {
        L.p(keyEvent0, "event");
        CommitTextCommand commitTextCommand0 = this.p(keyEvent0);
        if(commitTextCommand0 != null) {
            if(this.d) {
                this.d(commitTextCommand0);
                this.f.b();
                return true;
            }
            return false;
        }
        if(!KeyEventType.g(KeyEvent_androidKt.b(keyEvent0), 2)) {
            return false;
        }
        KeyCommand keyCommand0 = this.j.a(keyEvent0);
        if(keyCommand0 != null && (!keyCommand0.b() || this.d)) {
            a l0$a0 = new a();
            l0$a0.a = true;
            this.f(new Function1(this, l0$a0) {
                public final class WhenMappings {
                    public static final int[] a;

                    static {
                        int[] arr_v = new int[KeyCommand.values().length];
                        try {
                            arr_v[KeyCommand.r.ordinal()] = 1;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[KeyCommand.s.ordinal()] = 2;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[KeyCommand.t.ordinal()] = 3;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[KeyCommand.b.ordinal()] = 4;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[KeyCommand.c.ordinal()] = 5;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[KeyCommand.e.ordinal()] = 6;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[KeyCommand.d.ordinal()] = 7;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[KeyCommand.g.ordinal()] = 8;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[KeyCommand.f.ordinal()] = 9;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[KeyCommand.l.ordinal()] = 10;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[KeyCommand.m.ordinal()] = 11;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[KeyCommand.n.ordinal()] = 12;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[KeyCommand.o.ordinal()] = 13;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[KeyCommand.h.ordinal()] = 14;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[KeyCommand.i.ordinal()] = 15;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[KeyCommand.j.ordinal()] = 16;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[KeyCommand.k.ordinal()] = 17;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[KeyCommand.p.ordinal()] = 18;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[KeyCommand.q.ordinal()] = 19;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[KeyCommand.u.ordinal()] = 20;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[KeyCommand.v.ordinal()] = 21;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[KeyCommand.w.ordinal()] = 22;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[KeyCommand.x.ordinal()] = 23;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[KeyCommand.y.ordinal()] = 24;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[KeyCommand.z.ordinal()] = 25;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[KeyCommand.Y.ordinal()] = 26;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[KeyCommand.Z.ordinal()] = 27;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[KeyCommand.A.ordinal()] = 28;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[KeyCommand.B.ordinal()] = 29;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[KeyCommand.C.ordinal()] = 30;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[KeyCommand.J.ordinal()] = 0x1F;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[KeyCommand.K.ordinal()] = 0x20;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[KeyCommand.M.ordinal()] = 33;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[KeyCommand.L.ordinal()] = 34;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[KeyCommand.N.ordinal()] = 35;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[KeyCommand.O.ordinal()] = 36;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[KeyCommand.P.ordinal()] = 37;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[KeyCommand.Q.ordinal()] = 38;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[KeyCommand.D.ordinal()] = 39;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[KeyCommand.E.ordinal()] = 40;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[KeyCommand.F.ordinal()] = 41;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[KeyCommand.G.ordinal()] = 42;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[KeyCommand.H.ordinal()] = 43;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[KeyCommand.I.ordinal()] = 44;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[KeyCommand.X.ordinal()] = 45;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[KeyCommand.M8.ordinal()] = 46;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[KeyCommand.N8.ordinal()] = 0x2F;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        try {
                            arr_v[KeyCommand.O8.ordinal()] = 0x30;
                        }
                        catch(NoSuchFieldError unused_ex) {
                        }
                        WhenMappings.a = arr_v;
                    }
                }

                final KeyCommand e;
                final TextFieldKeyInput f;
                final a g;

                {
                    this.e = keyCommand0;
                    this.f = textFieldKeyInput0;
                    this.g = l0$a0;
                    super(1);
                }

                public final void a(@l TextFieldPreparedSelection textFieldPreparedSelection0) {
                    L.p(textFieldPreparedSelection0, "$this$commandExecutionContext");
                    switch(this.e) {
                        case 1: {
                            this.f.j().l(false);
                            return;
                        }
                        case 2: {
                            this.f.j().P();
                            return;
                        }
                        case 3: {
                            this.f.j().p();
                            return;
                        }
                        case 4: {
                            textFieldPreparedSelection0.d(androidx.compose.foundation.text.TextFieldKeyInput.process.2.1.e);
                            return;
                        }
                        case 5: {
                            textFieldPreparedSelection0.e(androidx.compose.foundation.text.TextFieldKeyInput.process.2.2.e);
                            return;
                        }
                        case 6: {
                            textFieldPreparedSelection0.I();
                            return;
                        }
                        case 7: {
                            textFieldPreparedSelection0.Q();
                            return;
                        }
                        case 8: {
                            textFieldPreparedSelection0.N();
                            return;
                        }
                        case 9: {
                            textFieldPreparedSelection0.K();
                            return;
                        }
                        case 10: {
                            textFieldPreparedSelection0.X();
                            return;
                        }
                        case 11: {
                            textFieldPreparedSelection0.G();
                            return;
                        }
                        case 12: {
                            textFieldPreparedSelection0.n0();
                            return;
                        }
                        case 13: {
                            textFieldPreparedSelection0.m0();
                            return;
                        }
                        case 14: {
                            textFieldPreparedSelection0.W();
                            return;
                        }
                        case 15: {
                            textFieldPreparedSelection0.T();
                            return;
                        }
                        case 16: {
                            textFieldPreparedSelection0.U();
                            return;
                        }
                        case 17: {
                            textFieldPreparedSelection0.V();
                            return;
                        }
                        case 18: {
                            textFieldPreparedSelection0.S();
                            return;
                        }
                        case 19: {
                            textFieldPreparedSelection0.R();
                            return;
                        }
                        case 20: {
                            List list0 = textFieldPreparedSelection0.h0(androidx.compose.foundation.text.TextFieldKeyInput.process.2.3.e);
                            if(list0 != null) {
                                this.f.e(list0);
                                return;
                            }
                            break;
                        }
                        case 21: {
                            List list1 = textFieldPreparedSelection0.h0(androidx.compose.foundation.text.TextFieldKeyInput.process.2.4.e);
                            if(list1 != null) {
                                this.f.e(list1);
                                return;
                            }
                            break;
                        }
                        case 22: {
                            List list2 = textFieldPreparedSelection0.h0(androidx.compose.foundation.text.TextFieldKeyInput.process.2.5.e);
                            if(list2 != null) {
                                this.f.e(list2);
                                return;
                            }
                            break;
                        }
                        case 23: {
                            List list3 = textFieldPreparedSelection0.h0(androidx.compose.foundation.text.TextFieldKeyInput.process.2.6.e);
                            if(list3 != null) {
                                this.f.e(list3);
                                return;
                            }
                            break;
                        }
                        case 24: {
                            List list4 = textFieldPreparedSelection0.h0(androidx.compose.foundation.text.TextFieldKeyInput.process.2.7.e);
                            if(list4 != null) {
                                this.f.e(list4);
                                return;
                            }
                            break;
                        }
                        case 25: {
                            List list5 = textFieldPreparedSelection0.h0(androidx.compose.foundation.text.TextFieldKeyInput.process.2.8.e);
                            if(list5 != null) {
                                this.f.e(list5);
                                return;
                            }
                            break;
                        }
                        case 26: {
                            if(!this.f.k()) {
                                CommitTextCommand commitTextCommand0 = new CommitTextCommand("\n", 1);
                                this.f.d(commitTextCommand0);
                                return;
                            }
                            this.g.a = false;
                            return;
                        }
                        case 27: {
                            if(!this.f.k()) {
                                CommitTextCommand commitTextCommand1 = new CommitTextCommand("\t", 1);
                                this.f.d(commitTextCommand1);
                                return;
                            }
                            this.g.a = false;
                            return;
                        }
                        case 28: {
                            textFieldPreparedSelection0.Y();
                            return;
                        }
                        case 29: {
                            ((TextFieldPreparedSelection)textFieldPreparedSelection0.H()).Z();
                            return;
                        }
                        case 30: {
                            ((TextFieldPreparedSelection)textFieldPreparedSelection0.P()).Z();
                            return;
                        }
                        case 0x1F: {
                            ((TextFieldPreparedSelection)textFieldPreparedSelection0.I()).Z();
                            return;
                        }
                        case 0x20: {
                            ((TextFieldPreparedSelection)textFieldPreparedSelection0.Q()).Z();
                            return;
                        }
                        case 33: {
                            ((TextFieldPreparedSelection)textFieldPreparedSelection0.N()).Z();
                            return;
                        }
                        case 34: {
                            ((TextFieldPreparedSelection)textFieldPreparedSelection0.K()).Z();
                            return;
                        }
                        case 35: {
                            ((TextFieldPreparedSelection)textFieldPreparedSelection0.W()).Z();
                            return;
                        }
                        case 36: {
                            ((TextFieldPreparedSelection)textFieldPreparedSelection0.T()).Z();
                            return;
                        }
                        case 37: {
                            ((TextFieldPreparedSelection)textFieldPreparedSelection0.U()).Z();
                            return;
                        }
                        case 38: {
                            ((TextFieldPreparedSelection)textFieldPreparedSelection0.V()).Z();
                            return;
                        }
                        case 39: {
                            ((TextFieldPreparedSelection)textFieldPreparedSelection0.X()).Z();
                            return;
                        }
                        case 40: {
                            ((TextFieldPreparedSelection)textFieldPreparedSelection0.G()).Z();
                            return;
                        }
                        case 41: {
                            textFieldPreparedSelection0.n0().Z();
                            return;
                        }
                        case 42: {
                            textFieldPreparedSelection0.m0().Z();
                            return;
                        }
                        case 43: {
                            ((TextFieldPreparedSelection)textFieldPreparedSelection0.S()).Z();
                            return;
                        }
                        case 44: {
                            ((TextFieldPreparedSelection)textFieldPreparedSelection0.R()).Z();
                            return;
                        }
                        case 45: {
                            textFieldPreparedSelection0.f();
                            return;
                        }
                        case 46: {
                            UndoManager undoManager0 = this.f.m();
                            if(undoManager0 != null) {
                                undoManager0.c(textFieldPreparedSelection0.k0());
                            }
                            UndoManager undoManager1 = this.f.m();
                            if(undoManager1 != null) {
                                TextFieldValue textFieldValue0 = undoManager1.h();
                                if(textFieldValue0 != null) {
                                    this.f.k.invoke(textFieldValue0);
                                    return;
                                }
                            }
                            break;
                        }
                        case 0x2F: {
                            UndoManager undoManager2 = this.f.m();
                            if(undoManager2 != null) {
                                TextFieldValue textFieldValue1 = undoManager2.d();
                                if(textFieldValue1 != null) {
                                    this.f.k.invoke(textFieldValue1);
                                    return;
                                }
                            }
                            break;
                        }
                    }

                    final class androidx.compose.foundation.text.TextFieldKeyInput.process.2.1 extends N implements Function1 {
                        public static final androidx.compose.foundation.text.TextFieldKeyInput.process.2.1 e;

                        static {
                            androidx.compose.foundation.text.TextFieldKeyInput.process.2.1.e = new androidx.compose.foundation.text.TextFieldKeyInput.process.2.1();
                        }

                        androidx.compose.foundation.text.TextFieldKeyInput.process.2.1() {
                            super(1);
                        }

                        public final void a(@l TextFieldPreparedSelection textFieldPreparedSelection0) {
                            L.p(textFieldPreparedSelection0, "$this$collapseLeftOr");
                            textFieldPreparedSelection0.H();
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            this.a(((TextFieldPreparedSelection)object0));
                            return S0.a;
                        }
                    }


                    final class androidx.compose.foundation.text.TextFieldKeyInput.process.2.2 extends N implements Function1 {
                        public static final androidx.compose.foundation.text.TextFieldKeyInput.process.2.2 e;

                        static {
                            androidx.compose.foundation.text.TextFieldKeyInput.process.2.2.e = new androidx.compose.foundation.text.TextFieldKeyInput.process.2.2();
                        }

                        androidx.compose.foundation.text.TextFieldKeyInput.process.2.2() {
                            super(1);
                        }

                        public final void a(@l TextFieldPreparedSelection textFieldPreparedSelection0) {
                            L.p(textFieldPreparedSelection0, "$this$collapseRightOr");
                            textFieldPreparedSelection0.P();
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            this.a(((TextFieldPreparedSelection)object0));
                            return S0.a;
                        }
                    }


                    final class androidx.compose.foundation.text.TextFieldKeyInput.process.2.3 extends N implements Function1 {
                        public static final androidx.compose.foundation.text.TextFieldKeyInput.process.2.3 e;

                        static {
                            androidx.compose.foundation.text.TextFieldKeyInput.process.2.3.e = new androidx.compose.foundation.text.TextFieldKeyInput.process.2.3();
                        }

                        androidx.compose.foundation.text.TextFieldKeyInput.process.2.3() {
                            super(1);
                        }

                        @m
                        public final EditCommand a(@l TextFieldPreparedSelection textFieldPreparedSelection0) {
                            L.p(textFieldPreparedSelection0, "$this$deleteIfSelectedOr");
                            return new DeleteSurroundingTextCommand(TextRange.i(textFieldPreparedSelection0.B()) - textFieldPreparedSelection0.x(), 0);
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            return this.a(((TextFieldPreparedSelection)object0));
                        }
                    }


                    final class androidx.compose.foundation.text.TextFieldKeyInput.process.2.4 extends N implements Function1 {
                        public static final androidx.compose.foundation.text.TextFieldKeyInput.process.2.4 e;

                        static {
                            androidx.compose.foundation.text.TextFieldKeyInput.process.2.4.e = new androidx.compose.foundation.text.TextFieldKeyInput.process.2.4();
                        }

                        androidx.compose.foundation.text.TextFieldKeyInput.process.2.4() {
                            super(1);
                        }

                        @m
                        public final EditCommand a(@l TextFieldPreparedSelection textFieldPreparedSelection0) {
                            L.p(textFieldPreparedSelection0, "$this$deleteIfSelectedOr");
                            int v = textFieldPreparedSelection0.o();
                            return v != -1 ? new DeleteSurroundingTextCommand(0, v - ((int)(textFieldPreparedSelection0.B() & 0xFFFFFFFFL))) : null;
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            return this.a(((TextFieldPreparedSelection)object0));
                        }
                    }


                    final class androidx.compose.foundation.text.TextFieldKeyInput.process.2.5 extends N implements Function1 {
                        public static final androidx.compose.foundation.text.TextFieldKeyInput.process.2.5 e;

                        static {
                            androidx.compose.foundation.text.TextFieldKeyInput.process.2.5.e = new androidx.compose.foundation.text.TextFieldKeyInput.process.2.5();
                        }

                        androidx.compose.foundation.text.TextFieldKeyInput.process.2.5() {
                            super(1);
                        }

                        @m
                        public final EditCommand a(@l TextFieldPreparedSelection textFieldPreparedSelection0) {
                            L.p(textFieldPreparedSelection0, "$this$deleteIfSelectedOr");
                            Integer integer0 = textFieldPreparedSelection0.A();
                            return integer0 != null ? new DeleteSurroundingTextCommand(((int)(textFieldPreparedSelection0.B() & 0xFFFFFFFFL)) - integer0.intValue(), 0) : null;
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            return this.a(((TextFieldPreparedSelection)object0));
                        }
                    }


                    final class androidx.compose.foundation.text.TextFieldKeyInput.process.2.6 extends N implements Function1 {
                        public static final androidx.compose.foundation.text.TextFieldKeyInput.process.2.6 e;

                        static {
                            androidx.compose.foundation.text.TextFieldKeyInput.process.2.6.e = new androidx.compose.foundation.text.TextFieldKeyInput.process.2.6();
                        }

                        androidx.compose.foundation.text.TextFieldKeyInput.process.2.6() {
                            super(1);
                        }

                        @m
                        public final EditCommand a(@l TextFieldPreparedSelection textFieldPreparedSelection0) {
                            L.p(textFieldPreparedSelection0, "$this$deleteIfSelectedOr");
                            Integer integer0 = textFieldPreparedSelection0.p();
                            return integer0 != null ? new DeleteSurroundingTextCommand(0, integer0.intValue() - ((int)(textFieldPreparedSelection0.B() & 0xFFFFFFFFL))) : null;
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            return this.a(((TextFieldPreparedSelection)object0));
                        }
                    }


                    final class androidx.compose.foundation.text.TextFieldKeyInput.process.2.7 extends N implements Function1 {
                        public static final androidx.compose.foundation.text.TextFieldKeyInput.process.2.7 e;

                        static {
                            androidx.compose.foundation.text.TextFieldKeyInput.process.2.7.e = new androidx.compose.foundation.text.TextFieldKeyInput.process.2.7();
                        }

                        androidx.compose.foundation.text.TextFieldKeyInput.process.2.7() {
                            super(1);
                        }

                        @m
                        public final EditCommand a(@l TextFieldPreparedSelection textFieldPreparedSelection0) {
                            L.p(textFieldPreparedSelection0, "$this$deleteIfSelectedOr");
                            Integer integer0 = textFieldPreparedSelection0.l();
                            return integer0 != null ? new DeleteSurroundingTextCommand(((int)(textFieldPreparedSelection0.B() & 0xFFFFFFFFL)) - integer0.intValue(), 0) : null;
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            return this.a(((TextFieldPreparedSelection)object0));
                        }
                    }


                    final class androidx.compose.foundation.text.TextFieldKeyInput.process.2.8 extends N implements Function1 {
                        public static final androidx.compose.foundation.text.TextFieldKeyInput.process.2.8 e;

                        static {
                            androidx.compose.foundation.text.TextFieldKeyInput.process.2.8.e = new androidx.compose.foundation.text.TextFieldKeyInput.process.2.8();
                        }

                        androidx.compose.foundation.text.TextFieldKeyInput.process.2.8() {
                            super(1);
                        }

                        @m
                        public final EditCommand a(@l TextFieldPreparedSelection textFieldPreparedSelection0) {
                            L.p(textFieldPreparedSelection0, "$this$deleteIfSelectedOr");
                            Integer integer0 = textFieldPreparedSelection0.i();
                            return integer0 != null ? new DeleteSurroundingTextCommand(0, integer0.intValue() - ((int)(textFieldPreparedSelection0.B() & 0xFFFFFFFFL))) : null;
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            return this.a(((TextFieldPreparedSelection)object0));
                        }
                    }

                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.a(((TextFieldPreparedSelection)object0));
                    return S0.a;
                }
            });
            UndoManager undoManager0 = this.h;
            if(undoManager0 != null) {
                undoManager0.a();
            }
            return l0$a0.a;
        }
        return false;
    }

    private final CommitTextCommand p(KeyEvent keyEvent0) {
        if(!TextFieldKeyInput_androidKt.a(keyEvent0)) {
            return null;
        }
        Integer integer0 = this.i.a(keyEvent0);
        if(integer0 != null) {
            String s = StringHelpers_jvmKt.a(new StringBuilder(), ((int)integer0)).toString();
            L.o(s, "StringBuilder().appendCo…ntX(codePoint).toString()");
            return new CommitTextCommand(s, 1);
        }
        return null;
    }
}

