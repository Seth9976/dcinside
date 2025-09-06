package androidx.compose.ui.text.input;

import A3.a;
import android.graphics.Rect;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.text.TextRange;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.D;
import kotlin.E;
import kotlin.H;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0.h;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.math.b;
import y4.l;
import y4.m;

@s0({"SMAP\nTextInputServiceAndroid.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextInputServiceAndroid.android.kt\nandroidx/compose/ui/text/input/TextInputServiceAndroid\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,507:1\n1182#2:508\n1161#2,2:509\n728#3,2:511\n460#3,11:514\n1#4:513\n*S KotlinDebug\n*F\n+ 1 TextInputServiceAndroid.android.kt\nandroidx/compose/ui/text/input/TextInputServiceAndroid\n*L\n101#1:508\n101#1:509,2\n205#1:511,2\n282#1:514,11\n*E\n"})
public final class TextInputServiceAndroid implements PlatformTextInputService {
    static enum TextInputCommand {
        StartInput,
        StopInput,
        ShowKeyboard,
        HideKeyboard;

        private static final TextInputCommand[] a() [...] // Inlined contents
    }

    public final class WhenMappings {
        public static final int[] a;

        static {
            int[] arr_v = new int[TextInputCommand.values().length];
            try {
                arr_v[TextInputCommand.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[TextInputCommand.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[TextInputCommand.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[TextInputCommand.d.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.a = arr_v;
        }
    }

    @l
    private final View a;
    @l
    private final InputMethodManager b;
    @m
    private final PlatformTextInput c;
    @l
    private final Executor d;
    @l
    private Function1 e;
    @l
    private Function1 f;
    @l
    private TextFieldValue g;
    @l
    private ImeOptions h;
    @l
    private List i;
    @l
    private final D j;
    @m
    private Rect k;
    @l
    private final MutableVector l;
    @m
    private Runnable m;

    public TextInputServiceAndroid(@l View view0, @l InputMethodManager inputMethodManager0, @m PlatformTextInput platformTextInput0, @l Executor executor0) {
        L.p(view0, "view");
        L.p(inputMethodManager0, "inputMethodManager");
        L.p(executor0, "inputCommandProcessorExecutor");
        super();
        this.a = view0;
        this.b = inputMethodManager0;
        this.c = platformTextInput0;
        this.d = executor0;
        this.e = androidx.compose.ui.text.input.TextInputServiceAndroid.onEditCommand.1.e;
        this.f = androidx.compose.ui.text.input.TextInputServiceAndroid.onImeActionPerformed.1.e;
        this.g = new TextFieldValue("", 0L, null, 4, null);
        this.h = ImeOptions.f.a();
        this.i = new ArrayList();
        androidx.compose.ui.text.input.TextInputServiceAndroid.baseInputConnection.2 textInputServiceAndroid$baseInputConnection$20 = new a() {
            final TextInputServiceAndroid e;

            {
                this.e = textInputServiceAndroid0;
                super(0);
            }

            @l
            public final BaseInputConnection b() {
                return new BaseInputConnection(this.e.o(), false);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        };
        this.j = E.c(H.c, textInputServiceAndroid$baseInputConnection$20);
        this.l = new MutableVector(new TextInputCommand[16], 0);

        final class androidx.compose.ui.text.input.TextInputServiceAndroid.onEditCommand.1 extends N implements Function1 {
            public static final androidx.compose.ui.text.input.TextInputServiceAndroid.onEditCommand.1 e;

            static {
                androidx.compose.ui.text.input.TextInputServiceAndroid.onEditCommand.1.e = new androidx.compose.ui.text.input.TextInputServiceAndroid.onEditCommand.1();
            }

            androidx.compose.ui.text.input.TextInputServiceAndroid.onEditCommand.1() {
                super(1);
            }

            public final void a(@l List list0) {
                L.p(list0, "it");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((List)object0));
                return S0.a;
            }
        }


        final class androidx.compose.ui.text.input.TextInputServiceAndroid.onImeActionPerformed.1 extends N implements Function1 {
            public static final androidx.compose.ui.text.input.TextInputServiceAndroid.onImeActionPerformed.1 e;

            static {
                androidx.compose.ui.text.input.TextInputServiceAndroid.onImeActionPerformed.1.e = new androidx.compose.ui.text.input.TextInputServiceAndroid.onImeActionPerformed.1();
            }

            androidx.compose.ui.text.input.TextInputServiceAndroid.onImeActionPerformed.1() {
                super(1);
            }

            public final void a(int v) {
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((ImeAction)object0).o());
                return S0.a;
            }
        }

    }

    public TextInputServiceAndroid(View view0, InputMethodManager inputMethodManager0, PlatformTextInput platformTextInput0, Executor executor0, int v, w w0) {
        if((v & 4) != 0) {
            platformTextInput0 = null;
        }
        if((v & 8) != 0) {
            Choreographer choreographer0 = Choreographer.getInstance();
            L.o(choreographer0, "getInstance()");
            executor0 = TextInputServiceAndroid_androidKt.d(choreographer0);
        }
        this(view0, inputMethodManager0, platformTextInput0, executor0);
    }

    public TextInputServiceAndroid(@l View view0, @m PlatformTextInput platformTextInput0) {
        L.p(view0, "view");
        this(view0, new InputMethodManagerImpl(view0), platformTextInput0, null, 8, null);
    }

    public TextInputServiceAndroid(View view0, PlatformTextInput platformTextInput0, int v, w w0) {
        if((v & 2) != 0) {
            platformTextInput0 = null;
        }
        this(view0, platformTextInput0);
    }

    @Override  // androidx.compose.ui.text.input.PlatformTextInputService
    public void a() {
        PlatformTextInput platformTextInput0 = this.c;
        if(platformTextInput0 != null) {
            platformTextInput0.a();
        }
        this.e = androidx.compose.ui.text.input.TextInputServiceAndroid.stopInput.1.e;
        this.f = androidx.compose.ui.text.input.TextInputServiceAndroid.stopInput.2.e;
        this.k = null;
        this.s(TextInputCommand.b);

        final class androidx.compose.ui.text.input.TextInputServiceAndroid.stopInput.1 extends N implements Function1 {
            public static final androidx.compose.ui.text.input.TextInputServiceAndroid.stopInput.1 e;

            static {
                androidx.compose.ui.text.input.TextInputServiceAndroid.stopInput.1.e = new androidx.compose.ui.text.input.TextInputServiceAndroid.stopInput.1();
            }

            androidx.compose.ui.text.input.TextInputServiceAndroid.stopInput.1() {
                super(1);
            }

            public final void a(@l List list0) {
                L.p(list0, "it");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((List)object0));
                return S0.a;
            }
        }


        final class androidx.compose.ui.text.input.TextInputServiceAndroid.stopInput.2 extends N implements Function1 {
            public static final androidx.compose.ui.text.input.TextInputServiceAndroid.stopInput.2 e;

            static {
                androidx.compose.ui.text.input.TextInputServiceAndroid.stopInput.2.e = new androidx.compose.ui.text.input.TextInputServiceAndroid.stopInput.2();
            }

            androidx.compose.ui.text.input.TextInputServiceAndroid.stopInput.2() {
                super(1);
            }

            public final void a(int v) {
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((ImeAction)object0).o());
                return S0.a;
            }
        }

    }

    @Override  // androidx.compose.ui.text.input.PlatformTextInputService
    public void b() {
        this.s(TextInputCommand.d);
    }

    @Override  // androidx.compose.ui.text.input.PlatformTextInputService
    public void c() {
        this.s(TextInputCommand.c);
    }

    @Override  // androidx.compose.ui.text.input.PlatformTextInputService
    public void d(@m TextFieldValue textFieldValue0, @l TextFieldValue textFieldValue1) {
        L.p(textFieldValue1, "newValue");
        boolean z = !TextRange.g(this.g.h(), textFieldValue1.h()) || !L.g(this.g.g(), textFieldValue1.g());
        this.g = textFieldValue1;
        int v1 = this.i.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            RecordingInputConnection recordingInputConnection0 = (RecordingInputConnection)((WeakReference)this.i.get(v2)).get();
            if(recordingInputConnection0 != null) {
                recordingInputConnection0.j(textFieldValue1);
            }
        }
        if(L.g(textFieldValue0, textFieldValue1)) {
            if(z) {
                InputMethodManager inputMethodManager0 = this.b;
                int v3 = TextRange.l(textFieldValue1.h());
                int v4 = TextRange.k(textFieldValue1.h());
                TextRange textRange0 = this.g.g();
                int v5 = -1;
                int v6 = textRange0 == null ? -1 : TextRange.l(textRange0.r());
                TextRange textRange1 = this.g.g();
                if(textRange1 != null) {
                    v5 = TextRange.k(textRange1.r());
                }
                inputMethodManager0.a(v3, v4, v6, v5);
            }
            return;
        }
        if(textFieldValue0 != null && (!L.g(textFieldValue0.i(), textFieldValue1.i()) || TextRange.g(textFieldValue0.h(), textFieldValue1.h()) && !L.g(textFieldValue0.g(), textFieldValue1.g()))) {
            this.r();
            return;
        }
        int v7 = this.i.size();
        for(int v = 0; v < v7; ++v) {
            RecordingInputConnection recordingInputConnection1 = (RecordingInputConnection)((WeakReference)this.i.get(v)).get();
            if(recordingInputConnection1 != null) {
                recordingInputConnection1.k(this.g, this.b);
            }
        }
    }

    @Override  // androidx.compose.ui.text.input.PlatformTextInputService
    @k(message = "This method should not be called, used BringIntoViewRequester instead.")
    public void e(@l androidx.compose.ui.geometry.Rect rect0) {
        L.p(rect0, "rect");
        this.k = new Rect(b.L0(rect0.t()), b.L0(rect0.B()), b.L0(rect0.x()), b.L0(rect0.j()));
        if(this.i.isEmpty()) {
            Rect rect1 = this.k;
            if(rect1 != null) {
                Rect rect2 = new Rect(rect1);
                this.a.requestRectangleOnScreen(rect2);
            }
        }
    }

    @Override  // androidx.compose.ui.text.input.PlatformTextInputService
    public void f(@l TextFieldValue textFieldValue0, @l ImeOptions imeOptions0, @l Function1 function10, @l Function1 function11) {
        L.p(textFieldValue0, "value");
        L.p(imeOptions0, "imeOptions");
        L.p(function10, "onEditCommand");
        L.p(function11, "onImeActionPerformed");
        PlatformTextInput platformTextInput0 = this.c;
        if(platformTextInput0 != null) {
            platformTextInput0.b();
        }
        this.g = textFieldValue0;
        this.h = imeOptions0;
        this.e = function10;
        this.f = function11;
        this.s(TextInputCommand.a);
    }

    @l
    public final InputConnection l(@l EditorInfo editorInfo0) {
        L.p(editorInfo0, "outAttrs");
        TextInputServiceAndroid_androidKt.h(editorInfo0, this.h, this.g);
        TextInputServiceAndroid_androidKt.i(editorInfo0);
        TextFieldValue textFieldValue0 = this.g;
        boolean z = this.h.d();
        InputConnection inputConnection0 = new RecordingInputConnection(textFieldValue0, new InputEventCallback2() {
            @Override  // androidx.compose.ui.text.input.InputEventCallback2
            public void a(int v) {
                this.a.f.invoke(ImeAction.i(v));
            }

            @Override  // androidx.compose.ui.text.input.InputEventCallback2
            public void b(@l List list0) {
                L.p(list0, "editCommands");
                this.a.e.invoke(list0);
            }

            @Override  // androidx.compose.ui.text.input.InputEventCallback2
            public void c(@l KeyEvent keyEvent0) {
                L.p(keyEvent0, "event");
                this.a.m().sendKeyEvent(keyEvent0);
            }

            @Override  // androidx.compose.ui.text.input.InputEventCallback2
            public void d(@l RecordingInputConnection recordingInputConnection0) {
                L.p(recordingInputConnection0, "ic");
                int v = this.a.i.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    if(L.g(((WeakReference)this.a.i.get(v1)).get(), recordingInputConnection0)) {
                        this.a.i.remove(v1);
                        return;
                    }
                }
            }
        }, z);
        this.i.add(new WeakReference(inputConnection0));
        return inputConnection0;
    }

    private final BaseInputConnection m() {
        return (BaseInputConnection)this.j.getValue();
    }

    @l
    public final TextFieldValue n() {
        return this.g;
    }

    @l
    public final View o() {
        return this.a;
    }

    private final void p() {
        if(!this.a.isFocused()) {
            this.l.l();
            return;
        }
        h l0$h0 = new h();
        h l0$h1 = new h();
        MutableVector mutableVector0 = this.l;
        int v = mutableVector0.J();
        if(v > 0) {
            Object[] arr_object = mutableVector0.F();
            int v1 = 0;
            while(true) {
                TextInputServiceAndroid.q(((TextInputCommand)arr_object[v1]), l0$h0, l0$h1);
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        if(L.g(l0$h0.a, Boolean.TRUE)) {
            this.r();
        }
        Boolean boolean0 = (Boolean)l0$h1.a;
        if(boolean0 != null) {
            this.u(boolean0.booleanValue());
        }
        if(L.g(l0$h0.a, Boolean.FALSE)) {
            this.r();
        }
    }

    private static final void q(TextInputCommand textInputServiceAndroid$TextInputCommand0, h l0$h0, h l0$h1) {
        boolean z = true;
        switch(textInputServiceAndroid$TextInputCommand0) {
            case 1: {
                l0$h0.a = Boolean.TRUE;
                l0$h1.a = Boolean.TRUE;
                return;
            }
            case 2: {
                l0$h0.a = Boolean.FALSE;
                l0$h1.a = Boolean.FALSE;
                return;
            }
            case 3: 
            case 4: {
                if(!L.g(l0$h0.a, Boolean.FALSE)) {
                    if(textInputServiceAndroid$TextInputCommand0 != TextInputCommand.c) {
                        z = false;
                    }
                    l0$h1.a = Boolean.valueOf(z);
                }
            }
        }
    }

    private final void r() {
        this.b.b();
    }

    private final void s(TextInputCommand textInputServiceAndroid$TextInputCommand0) {
        this.l.b(textInputServiceAndroid$TextInputCommand0);
        if(this.m == null) {
            d d0 = () -> {
                L.p(this, "this$0");
                this.m = null;
                this.p();
            };
            this.d.execute(d0);
            this.m = d0;
        }
    }

    // 检测为 Lambda 实现
    private static final void t(TextInputServiceAndroid textInputServiceAndroid0) [...]

    private final void u(boolean z) {
        if(z) {
            this.b.e();
            return;
        }
        this.b.c();
    }
}

