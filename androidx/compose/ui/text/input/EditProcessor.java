package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.TextRange;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
@s0({"SMAP\nEditProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditProcessor.kt\nandroidx/compose/ui/text/input/EditProcessor\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,173:1\n33#2,6:174\n*S KotlinDebug\n*F\n+ 1 EditProcessor.kt\nandroidx/compose/ui/text/input/EditProcessor\n*L\n112#1:174,6\n*E\n"})
public final class EditProcessor {
    @l
    private TextFieldValue a;
    @l
    private EditingBuffer b;
    public static final int c = 8;

    static {
    }

    public EditProcessor() {
        this.a = new TextFieldValue(AnnotatedStringKt.o(), 0L, null, null);
        this.b = new EditingBuffer(this.a.f(), this.a.h(), null);
    }

    @l
    public final TextFieldValue b(@l List list0) {
        Exception exception1;
        EditCommand editCommand1;
        int v1;
        L.p(list0, "editCommands");
        EditCommand editCommand0 = null;
        try {
            int v = list0.size();
            v1 = 0;
            while(true) {
            label_4:
                if(v1 >= v) {
                    goto label_18;
                }
                editCommand1 = (EditCommand)list0.get(v1);
                break;
            }
        }
        catch(Exception exception0) {
            editCommand1 = editCommand0;
            exception1 = exception0;
            throw new RuntimeException(this.c(list0, editCommand1), exception1);
        }
        try {
            editCommand1.a(this.b);
            ++v1;
            editCommand0 = editCommand1;
        }
        catch(Exception exception1) {
            throw new RuntimeException(this.c(list0, editCommand1), exception1);
        }
        goto label_4;
    label_18:
        TextFieldValue textFieldValue0 = new TextFieldValue(this.b.u(), this.b.j(), this.b.e(), null);
        this.a = textFieldValue0;
        return textFieldValue0;
    }

    private final String c(List list0, EditCommand editCommand0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("Error while applying EditCommand batch to buffer (length=" + this.b.i() + ", composition=" + this.b.e() + ", selection=" + TextRange.q(this.b.j()) + "):");
        L.o(stringBuilder0, "append(value)");
        stringBuilder0.append('\n');
        L.o(stringBuilder0, "append(\'\\n\')");
        u.k3(list0, stringBuilder0, "\n", null, null, 0, null, new Function1(this) {
            final EditCommand e;
            final EditProcessor f;

            {
                this.e = editCommand0;
                this.f = editProcessor0;
                super(1);
            }

            @l
            public final CharSequence a(@l EditCommand editCommand0) {
                L.p(editCommand0, "it");
                return this.e == editCommand0 ? " > " + this.f.g(editCommand0) : "   " + this.f.g(editCommand0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((EditCommand)object0));
            }
        }, 60, null);
        String s = stringBuilder0.toString();
        L.o(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    @l
    public final EditingBuffer d() {
        return this.b;
    }

    @l
    public final TextFieldValue e() {
        return this.a;
    }

    public final void f(@l TextFieldValue textFieldValue0, @m TextInputSession textInputSession0) {
        L.p(textFieldValue0, "value");
        boolean z = L.g(textFieldValue0.g(), this.b.e());
        boolean z1 = true;
        boolean z2 = false;
        if(!L.g(this.a.f(), textFieldValue0.f())) {
            this.b = new EditingBuffer(textFieldValue0.f(), textFieldValue0.h(), null);
        }
        else if(TextRange.g(this.a.h(), textFieldValue0.h())) {
            z1 = false;
        }
        else {
            this.b.r(TextRange.l(textFieldValue0.h()), TextRange.k(textFieldValue0.h()));
            z1 = false;
            z2 = true;
        }
        if(textFieldValue0.g() == null) {
            this.b.b();
        }
        else if(!TextRange.h(textFieldValue0.g().r())) {
            this.b.p(TextRange.l(textFieldValue0.g().r()), TextRange.k(textFieldValue0.g().r()));
        }
        if(z1 || !z2 && !z) {
            this.b.b();
            textFieldValue0 = TextFieldValue.d(textFieldValue0, null, 0L, null, 3, null);
        }
        TextFieldValue textFieldValue1 = this.a;
        this.a = textFieldValue0;
        if(textInputSession0 != null) {
            textInputSession0.g(textFieldValue1, textFieldValue0);
        }
    }

    private final String g(EditCommand editCommand0) {
        if(editCommand0 instanceof CommitTextCommand) {
            return "CommitTextCommand(text.length=" + ((CommitTextCommand)editCommand0).d().length() + ", newCursorPosition=" + ((CommitTextCommand)editCommand0).c() + ')';
        }
        if(editCommand0 instanceof SetComposingTextCommand) {
            return "SetComposingTextCommand(text.length=" + ((SetComposingTextCommand)editCommand0).d().length() + ", newCursorPosition=" + ((SetComposingTextCommand)editCommand0).c() + ')';
        }
        if(editCommand0 instanceof SetComposingRegionCommand) {
            return editCommand0.toString();
        }
        if(editCommand0 instanceof DeleteSurroundingTextCommand) {
            return editCommand0.toString();
        }
        if(editCommand0 instanceof DeleteSurroundingTextInCodePointsCommand) {
            return editCommand0.toString();
        }
        if(editCommand0 instanceof SetSelectionCommand) {
            return editCommand0.toString();
        }
        if(editCommand0 instanceof FinishComposingTextCommand) {
            return editCommand0.toString();
        }
        if(editCommand0 instanceof BackspaceCommand) {
            return editCommand0.toString();
        }
        if(editCommand0 instanceof MoveCursorCommand) {
            return editCommand0.toString();
        }
        if(editCommand0 instanceof DeleteAllCommand) {
            return editCommand0.toString();
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("Unknown EditCommand: ");
        String s = m0.d(editCommand0.getClass()).u();
        if(s == null) {
            s = "{anonymous EditCommand}";
        }
        stringBuilder0.append(s);
        return stringBuilder0.toString();
    }

    @l
    public final TextFieldValue h() {
        return this.a;
    }
}

