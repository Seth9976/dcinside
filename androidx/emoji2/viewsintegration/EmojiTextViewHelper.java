package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;

public final class EmojiTextViewHelper {
    @RequiresApi(19)
    static class HelperInternal19 extends HelperInternal {
        private final TextView a;
        private final EmojiInputFilter b;
        private boolean c;

        HelperInternal19(TextView textView0) {
            this.a = textView0;
            this.c = true;
            this.b = new EmojiInputFilter(textView0);
        }

        @Override  // androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal
        @NonNull
        InputFilter[] a(@NonNull InputFilter[] arr_inputFilter) {
            return this.c ? this.g(arr_inputFilter) : this.i(arr_inputFilter);
        }

        @Override  // androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal
        public boolean b() {
            return this.c;
        }

        @Override  // androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal
        void c(boolean z) {
            if(z) {
                this.e();
            }
        }

        @Override  // androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal
        void d(boolean z) {
            this.c = z;
            this.e();
            this.l();
        }

        @Override  // androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal
        void e() {
            TransformationMethod transformationMethod0 = this.f(this.a.getTransformationMethod());
            this.a.setTransformationMethod(transformationMethod0);
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal
        @Nullable
        TransformationMethod f(@Nullable TransformationMethod transformationMethod0) {
            return this.c ? this.m(transformationMethod0) : this.k(transformationMethod0);
        }

        @NonNull
        private InputFilter[] g(@NonNull InputFilter[] arr_inputFilter) {
            for(int v = 0; v < arr_inputFilter.length; ++v) {
                if(arr_inputFilter[v] == this.b) {
                    return arr_inputFilter;
                }
            }
            InputFilter[] arr_inputFilter1 = new InputFilter[arr_inputFilter.length + 1];
            System.arraycopy(arr_inputFilter, 0, arr_inputFilter1, 0, arr_inputFilter.length);
            arr_inputFilter1[arr_inputFilter.length] = this.b;
            return arr_inputFilter1;
        }

        private SparseArray h(@NonNull InputFilter[] arr_inputFilter) {
            SparseArray sparseArray0 = new SparseArray(1);
            for(int v = 0; v < arr_inputFilter.length; ++v) {
                InputFilter inputFilter0 = arr_inputFilter[v];
                if(inputFilter0 instanceof EmojiInputFilter) {
                    sparseArray0.put(v, inputFilter0);
                }
            }
            return sparseArray0;
        }

        @NonNull
        private InputFilter[] i(@NonNull InputFilter[] arr_inputFilter) {
            SparseArray sparseArray0 = this.h(arr_inputFilter);
            if(sparseArray0.size() == 0) {
                return arr_inputFilter;
            }
            InputFilter[] arr_inputFilter1 = new InputFilter[arr_inputFilter.length - sparseArray0.size()];
            int v1 = 0;
            for(int v = 0; v < arr_inputFilter.length; ++v) {
                if(sparseArray0.indexOfKey(v) < 0) {
                    arr_inputFilter1[v1] = arr_inputFilter[v];
                    ++v1;
                }
            }
            return arr_inputFilter1;
        }

        @RestrictTo({Scope.a})
        void j(boolean z) {
            this.c = z;
        }

        // 去混淆评级： 低(20)
        @Nullable
        private TransformationMethod k(@Nullable TransformationMethod transformationMethod0) {
            return transformationMethod0 instanceof EmojiTransformationMethod ? ((EmojiTransformationMethod)transformationMethod0).a() : transformationMethod0;
        }

        private void l() {
            InputFilter[] arr_inputFilter = this.a(this.a.getFilters());
            this.a.setFilters(arr_inputFilter);
        }

        @NonNull
        private TransformationMethod m(@Nullable TransformationMethod transformationMethod0) {
            if(transformationMethod0 instanceof EmojiTransformationMethod) {
                return transformationMethod0;
            }
            return transformationMethod0 instanceof PasswordTransformationMethod ? transformationMethod0 : new EmojiTransformationMethod(transformationMethod0);
        }
    }

    static class HelperInternal {
        @NonNull
        InputFilter[] a(@NonNull InputFilter[] arr_inputFilter) {
            return arr_inputFilter;
        }

        public boolean b() {
            return false;
        }

        void c(boolean z) {
        }

        void d(boolean z) {
        }

        void e() {
        }

        @Nullable
        TransformationMethod f(@Nullable TransformationMethod transformationMethod0) {
            return transformationMethod0;
        }
    }

    @RequiresApi(19)
    static class SkippingHelper19 extends HelperInternal {
        private final HelperInternal19 a;

        SkippingHelper19(TextView textView0) {
            this.a = new HelperInternal19(textView0);
        }

        // 去混淆评级： 低(30)
        @Override  // androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal
        @NonNull
        InputFilter[] a(@NonNull InputFilter[] arr_inputFilter) {
            return arr_inputFilter;
        }

        @Override  // androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal
        public boolean b() {
            return this.a.b();
        }

        // 去混淆评级： 低(30)
        @Override  // androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal
        void c(boolean z) {
        }

        @Override  // androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal
        void d(boolean z) {
            this.a.j(z);
        }

        // 去混淆评级： 低(30)
        @Override  // androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal
        void e() {
        }

        // 去混淆评级： 低(30)
        @Override  // androidx.emoji2.viewsintegration.EmojiTextViewHelper$HelperInternal
        @Nullable
        TransformationMethod f(@Nullable TransformationMethod transformationMethod0) {
            return transformationMethod0;
        }

        // 去混淆评级： 低(20)
        private boolean g() [...] // 潜在的解密器
    }

    private final HelperInternal a;

    public EmojiTextViewHelper(@NonNull TextView textView0) {
        this(textView0, true);
    }

    public EmojiTextViewHelper(@NonNull TextView textView0, boolean z) {
        Preconditions.m(textView0, "textView cannot be null");
        if(!z) {
            this.a = new SkippingHelper19(textView0);
            return;
        }
        this.a = new HelperInternal19(textView0);
    }

    @NonNull
    public InputFilter[] a(@NonNull InputFilter[] arr_inputFilter) {
        return this.a.a(arr_inputFilter);
    }

    public boolean b() {
        return this.a.b();
    }

    public void c(boolean z) {
        this.a.c(z);
    }

    public void d(boolean z) {
        this.a.d(z);
    }

    public void e() {
        this.a.e();
    }

    @Nullable
    public TransformationMethod f(@Nullable TransformationMethod transformationMethod0) {
        return this.a.f(transformationMethod0);
    }
}

