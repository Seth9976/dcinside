package androidx.core.widget;

import A3.q;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,88:1\n55#1,12:89\n84#1,3:101\n55#1,12:104\n84#1,3:116\n55#1,12:119\n84#1,3:131\n*S KotlinDebug\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n30#1:89,12\n30#1:101,3\n39#1:104,12\n39#1:116,3\n48#1:119,12\n48#1:131,3\n*E\n"})
public final class TextViewKt {
    @l
    public static final TextWatcher a(@l TextView textView0, @l q q0, @l q q1, @l Function1 function10) {
        TextWatcher textWatcher0 = new TextWatcher() {
            @Override  // android.text.TextWatcher
            public void afterTextChanged(Editable editable0) {
                function10.invoke(editable0);
            }

            @Override  // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
                q0.T0(charSequence0, v, v1, v2);
            }

            @Override  // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
                q1.T0(charSequence0, v, v1, v2);
            }
        };
        textView0.addTextChangedListener(textWatcher0);
        return textWatcher0;
    }

    public static TextWatcher b(TextView textView0, q q0, q q1, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            q0 = androidx.core.widget.TextViewKt.addTextChangedListener.1.e;
        }
        if((v & 2) != 0) {
            q1 = androidx.core.widget.TextViewKt.addTextChangedListener.2.e;
        }
        if((v & 4) != 0) {
            function10 = androidx.core.widget.TextViewKt.addTextChangedListener.3.e;
        }
        TextWatcher textWatcher0 = new androidx.core.widget.TextViewKt.addTextChangedListener.textWatcher.1(function10, q0, q1);
        textView0.addTextChangedListener(textWatcher0);
        return textWatcher0;

        public final class androidx.core.widget.TextViewKt.addTextChangedListener.1 extends N implements q {
            public static final androidx.core.widget.TextViewKt.addTextChangedListener.1 e;

            static {
                androidx.core.widget.TextViewKt.addTextChangedListener.1.e = new androidx.core.widget.TextViewKt.addTextChangedListener.1();
            }

            public androidx.core.widget.TextViewKt.addTextChangedListener.1() {
                super(4);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                return S0.a;
            }

            public final void a(CharSequence charSequence0, int v, int v1, int v2) {
            }
        }


        public final class androidx.core.widget.TextViewKt.addTextChangedListener.2 extends N implements q {
            public static final androidx.core.widget.TextViewKt.addTextChangedListener.2 e;

            static {
                androidx.core.widget.TextViewKt.addTextChangedListener.2.e = new androidx.core.widget.TextViewKt.addTextChangedListener.2();
            }

            public androidx.core.widget.TextViewKt.addTextChangedListener.2() {
                super(4);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                return S0.a;
            }

            public final void a(CharSequence charSequence0, int v, int v1, int v2) {
            }
        }


        public final class androidx.core.widget.TextViewKt.addTextChangedListener.3 extends N implements Function1 {
            public static final androidx.core.widget.TextViewKt.addTextChangedListener.3 e;

            static {
                androidx.core.widget.TextViewKt.addTextChangedListener.3.e = new androidx.core.widget.TextViewKt.addTextChangedListener.3();
            }

            public androidx.core.widget.TextViewKt.addTextChangedListener.3() {
                super(1);
            }

            public final void a(Editable editable0) {
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return S0.a;
            }
        }

    }

    @l
    public static final TextWatcher c(@l TextView textView0, @l Function1 function10) {
        TextWatcher textWatcher0 = new TextWatcher() {
            @Override  // android.text.TextWatcher
            public void afterTextChanged(Editable editable0) {
                function10.invoke(editable0);
            }

            @Override  // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
            }

            @Override  // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
            }
        };
        textView0.addTextChangedListener(textWatcher0);
        return textWatcher0;
    }

    @l
    public static final TextWatcher d(@l TextView textView0, @l q q0) {
        TextWatcher textWatcher0 = new TextWatcher() {
            @Override  // android.text.TextWatcher
            public void afterTextChanged(Editable editable0) {
            }

            @Override  // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
                q0.T0(charSequence0, v, v1, v2);
            }

            @Override  // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
            }
        };
        textView0.addTextChangedListener(textWatcher0);
        return textWatcher0;
    }

    @l
    public static final TextWatcher e(@l TextView textView0, @l q q0) {
        TextWatcher textWatcher0 = new TextWatcher() {
            @Override  // android.text.TextWatcher
            public void afterTextChanged(Editable editable0) {
            }

            @Override  // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
            }

            @Override  // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
                q0.T0(charSequence0, v, v1, v2);
            }
        };
        textView0.addTextChangedListener(textWatcher0);
        return textWatcher0;
    }
}

