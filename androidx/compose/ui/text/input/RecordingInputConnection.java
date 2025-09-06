package androidx.compose.ui.text.input;

import A3.a;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.compose.ui.text.TextRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nRecordingInputConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordingInputConnection.android.kt\nandroidx/compose/ui/text/input/RecordingInputConnection\n*L\n1#1,403:1\n80#1,5:404\n80#1,5:409\n80#1,5:414\n80#1,5:419\n80#1,5:424\n80#1,5:429\n80#1,5:434\n80#1,5:439\n80#1,5:444\n80#1,5:449\n80#1,5:454\n80#1,5:459\n80#1,5:464\n80#1,5:469\n80#1,5:474\n80#1,5:479\n80#1,5:484\n*S KotlinDebug\n*F\n+ 1 RecordingInputConnection.android.kt\nandroidx/compose/ui/text/input/RecordingInputConnection\n*L\n139#1:404,5\n175#1:409,5\n180#1:414,5\n186#1:419,5\n194#1:424,5\n205#1:429,5\n211#1:434,5\n217#1:439,5\n223#1:444,5\n259#1:449,5\n295#1:454,5\n321#1:459,5\n344#1:464,5\n354#1:469,5\n366#1:474,5\n386#1:479,5\n395#1:484,5\n*E\n"})
public final class RecordingInputConnection implements InputConnection {
    @l
    private final InputEventCallback2 a;
    private final boolean b;
    private int c;
    @l
    private TextFieldValue d;
    private int e;
    private boolean f;
    @l
    private final List g;
    private boolean h;

    public RecordingInputConnection(@l TextFieldValue textFieldValue0, @l InputEventCallback2 inputEventCallback20, boolean z) {
        L.p(textFieldValue0, "initState");
        L.p(inputEventCallback20, "eventCallback");
        super();
        this.a = inputEventCallback20;
        this.b = z;
        this.d = textFieldValue0;
        this.g = new ArrayList();
        this.h = true;
    }

    private final void a(EditCommand editCommand0) {
        this.b();
        try {
            this.g.add(editCommand0);
        }
        finally {
            this.c();
        }
    }

    private final boolean b() {
        ++this.c;
        return true;
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        return this.h ? this.b() : false;
    }

    private final boolean c() {
        int v = this.c - 1;
        this.c = v;
        if(v == 0 && !this.g.isEmpty()) {
            List list0 = u.Y5(this.g);
            this.a.b(list0);
            this.g.clear();
        }
        return this.c > 0;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int v) {
        return false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.g.clear();
        this.c = 0;
        this.h = false;
        this.a.d(this);
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean commitCompletion(@m CompletionInfo completionInfo0) {
        return false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean commitContent(@l InputContentInfo inputContentInfo0, int v, @m Bundle bundle0) {
        L.p(inputContentInfo0, "inputContentInfo");
        return false;
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.inputmethod.InputConnection
    public boolean commitCorrection(@m CorrectionInfo correctionInfo0) {
        return this.h ? this.b : false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean commitText(@m CharSequence charSequence0, int v) {
        boolean z = this.h;
        if(z) {
            this.a(new CommitTextCommand(String.valueOf(charSequence0), v));
        }
        return z;
    }

    private final boolean d(a a0) {
        boolean z = this.h;
        if(z) {
            a0.invoke();
        }
        return z;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int v, int v1) {
        if(this.h) {
            this.a(new DeleteSurroundingTextCommand(v, v1));
            return true;
        }
        return false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int v, int v1) {
        if(this.h) {
            this.a(new DeleteSurroundingTextInCodePointsCommand(v, v1));
            return true;
        }
        return false;
    }

    public final boolean e() {
        return this.b;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return this.c();
    }

    @l
    public final InputEventCallback2 f() {
        return this.a;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        if(this.h) {
            this.a(new FinishComposingTextCommand());
            return true;
        }
        return false;
    }

    @l
    public final TextFieldValue g() {
        return this.d;
    }

    @Override  // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int v) {
        return TextUtils.getCapsMode(this.d.i(), TextRange.l(this.d.h()), v);
    }

    @Override  // android.view.inputmethod.InputConnection
    @l
    public ExtractedText getExtractedText(@m ExtractedTextRequest extractedTextRequest0, int v) {
        boolean z = true;
        int v1 = 0;
        if((v & 1) == 0) {
            z = false;
        }
        this.f = z;
        if(z) {
            if(extractedTextRequest0 != null) {
                v1 = extractedTextRequest0.token;
            }
            this.e = v1;
        }
        return InputState_androidKt.a(this.d);
    }

    @Override  // android.view.inputmethod.InputConnection
    @m
    public Handler getHandler() {
        return null;
    }

    @Override  // android.view.inputmethod.InputConnection
    @m
    public CharSequence getSelectedText(int v) {
        return TextRange.h(this.d.h()) ? null : TextFieldValueKt.a(this.d).toString();
    }

    @Override  // android.view.inputmethod.InputConnection
    @l
    public CharSequence getTextAfterCursor(int v, int v1) {
        return TextFieldValueKt.b(this.d, v).toString();
    }

    @Override  // android.view.inputmethod.InputConnection
    @l
    public CharSequence getTextBeforeCursor(int v, int v1) {
        return TextFieldValueKt.c(this.d, v).toString();
    }

    private final void h(String s) {
    }

    private final void i(int v) {
        this.sendKeyEvent(new KeyEvent(0, v));
        this.sendKeyEvent(new KeyEvent(1, v));
    }

    public final void j(@l TextFieldValue textFieldValue0) {
        L.p(textFieldValue0, "value");
        this.d = textFieldValue0;
    }

    public final void k(@l TextFieldValue textFieldValue0, @l InputMethodManager inputMethodManager0) {
        L.p(textFieldValue0, "state");
        L.p(inputMethodManager0, "inputMethodManager");
        if(!this.h) {
            return;
        }
        this.j(textFieldValue0);
        if(this.f) {
            inputMethodManager0.d(this.e, InputState_androidKt.a(textFieldValue0));
        }
        TextRange textRange0 = textFieldValue0.g();
        int v = -1;
        int v1 = textRange0 == null ? -1 : TextRange.l(textRange0.r());
        TextRange textRange1 = textFieldValue0.g();
        if(textRange1 != null) {
            v = TextRange.k(textRange1.r());
        }
        inputMethodManager0.a(TextRange.l(textFieldValue0.h()), TextRange.k(textFieldValue0.h()), v1, v);
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int v) {
        if(this.h) {
            switch(v) {
                case 0x102001F: {
                    this.a(new SetSelectionCommand(0, this.d.i().length()));
                    break;
                }
                case 0x1020020: {
                    this.i(277);
                    return false;
                }
                case 0x1020021: {
                    this.i(278);
                    return false;
                }
                case 0x1020022: {
                    this.i(279);
                    return false;
                }
                default: {
                    return false;
                }
            }
        }
        return false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int v) {
        int v1;
        if(this.h) {
            if(v == 0) {
                v1 = 1;
            }
            else {
                switch(v) {
                    case 2: {
                        v1 = 2;
                        break;
                    }
                    case 3: {
                        v1 = 3;
                        break;
                    }
                    case 4: {
                        v1 = 4;
                        break;
                    }
                    case 5: {
                        v1 = 6;
                        break;
                    }
                    case 6: {
                        v1 = 7;
                        break;
                    }
                    case 7: {
                        v1 = 5;
                        break;
                    }
                    default: {
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + v);
                        v1 = 1;
                    }
                }
            }
            this.a.a(v1);
            return true;
        }
        return false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(@m String s, @m Bundle bundle0) {
        return this.h;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int v) {
        if(this.h) {
            Log.w("RecordingIC", "requestCursorUpdates is not supported");
        }
        return false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(@l KeyEvent keyEvent0) {
        L.p(keyEvent0, "event");
        if(this.h) {
            this.a.c(keyEvent0);
            return true;
        }
        return false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int v, int v1) {
        boolean z = this.h;
        if(z) {
            this.a(new SetComposingRegionCommand(v, v1));
        }
        return z;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean setComposingText(@m CharSequence charSequence0, int v) {
        boolean z = this.h;
        if(z) {
            this.a(new SetComposingTextCommand(String.valueOf(charSequence0), v));
        }
        return z;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean setSelection(int v, int v1) {
        if(this.h) {
            this.a(new SetSelectionCommand(v, v1));
            return true;
        }
        return false;
    }
}

