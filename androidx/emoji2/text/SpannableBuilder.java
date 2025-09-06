package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@RestrictTo({Scope.b})
public final class SpannableBuilder extends SpannableStringBuilder {
    static class WatcherWrapper implements SpanWatcher, TextWatcher {
        final Object a;
        private final AtomicInteger b;

        WatcherWrapper(Object object0) {
            this.b = new AtomicInteger(0);
            this.a = object0;
        }

        final void a() {
            this.b.incrementAndGet();
        }

        @Override  // android.text.TextWatcher
        public void afterTextChanged(Editable editable0) {
            ((TextWatcher)this.a).afterTextChanged(editable0);
        }

        private boolean b(Object object0) {
            return object0 instanceof EmojiSpan;
        }

        @Override  // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
            ((TextWatcher)this.a).beforeTextChanged(charSequence0, v, v1, v2);
        }

        final void c() {
            this.b.decrementAndGet();
        }

        @Override  // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable0, Object object0, int v, int v1) {
            if(this.b.get() > 0 && this.b(object0)) {
                return;
            }
            ((SpanWatcher)this.a).onSpanAdded(spannable0, object0, v, v1);
        }

        @Override  // android.text.SpanWatcher
        public void onSpanChanged(Spannable spannable0, Object object0, int v, int v1, int v2, int v3) {
            int v5;
            int v4;
            if(this.b.get() > 0 && this.b(object0)) {
                return;
            }
            if(Build.VERSION.SDK_INT < 28) {
                if(v > v1) {
                    v = 0;
                }
                if(v2 > v3) {
                    v4 = v;
                    v5 = 0;
                }
                else {
                    v4 = v;
                    v5 = v2;
                }
            }
            else {
                v4 = v;
                v5 = v2;
            }
            ((SpanWatcher)this.a).onSpanChanged(spannable0, object0, v4, v1, v5, v3);
        }

        @Override  // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable0, Object object0, int v, int v1) {
            if(this.b.get() > 0 && this.b(object0)) {
                return;
            }
            ((SpanWatcher)this.a).onSpanRemoved(spannable0, object0, v, v1);
        }

        @Override  // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
            ((TextWatcher)this.a).onTextChanged(charSequence0, v, v1, v2);
        }
    }

    @NonNull
    private final Class a;
    @NonNull
    private final List b;

    @RestrictTo({Scope.a})
    SpannableBuilder(@NonNull Class class0) {
        this.b = new ArrayList();
        Preconditions.m(class0, "watcherClass cannot be null");
        this.a = class0;
    }

    @RestrictTo({Scope.a})
    SpannableBuilder(@NonNull Class class0, @NonNull CharSequence charSequence0) {
        super(charSequence0);
        this.b = new ArrayList();
        Preconditions.m(class0, "watcherClass cannot be null");
        this.a = class0;
    }

    @RestrictTo({Scope.a})
    SpannableBuilder(@NonNull Class class0, @NonNull CharSequence charSequence0, int v, int v1) {
        super(charSequence0, v, v1);
        this.b = new ArrayList();
        Preconditions.m(class0, "watcherClass cannot be null");
        this.a = class0;
    }

    @RestrictTo({Scope.a})
    public void a() {
        this.b();
    }

    @Override  // android.text.SpannableStringBuilder
    @NonNull
    public Editable append(char c) {
        return this.append(c);
    }

    @Override  // android.text.SpannableStringBuilder
    @NonNull
    public Editable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence0) {
        return this.append(charSequence0);
    }

    @Override  // android.text.SpannableStringBuilder
    @NonNull
    public Editable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence0, int v, int v1) {
        return this.append(charSequence0, v, v1);
    }

    @Override  // android.text.SpannableStringBuilder
    @NonNull
    public SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override  // android.text.SpannableStringBuilder
    @NonNull
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence0) {
        super.append(charSequence0);
        return this;
    }

    @Override  // android.text.SpannableStringBuilder
    @NonNull
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence0, int v, int v1) {
        super.append(charSequence0, v, v1);
        return this;
    }

    @Override  // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder append(CharSequence charSequence0, Object object0, int v) {
        super.append(charSequence0, object0, v);
        return this;
    }

    @Override  // android.text.SpannableStringBuilder
    @NonNull
    public Appendable append(char c) throws IOException {
        return this.append(c);
    }

    @Override  // android.text.SpannableStringBuilder
    @NonNull
    public Appendable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence0) throws IOException {
        return this.append(charSequence0);
    }

    @Override  // android.text.SpannableStringBuilder
    @NonNull
    public Appendable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence0, int v, int v1) throws IOException {
        return this.append(charSequence0, v, v1);
    }

    private void b() {
        for(int v = 0; v < this.b.size(); ++v) {
            ((WatcherWrapper)this.b.get(v)).a();
        }
    }

    @NonNull
    @RestrictTo({Scope.b})
    public static SpannableBuilder c(@NonNull Class class0, @NonNull CharSequence charSequence0) {
        return new SpannableBuilder(class0, charSequence0);
    }

    @RestrictTo({Scope.a})
    public void d() {
        this.i();
        this.e();
    }

    @Override  // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public Editable delete(int v, int v1) {
        return this.delete(v, v1);
    }

    @Override  // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder delete(int v, int v1) {
        super.delete(v, v1);
        return this;
    }

    private void e() {
        for(int v = 0; v < this.b.size(); ++v) {
            ((WatcherWrapper)this.b.get(v)).onTextChanged(this, 0, this.length(), this.length());
        }
    }

    private WatcherWrapper f(Object object0) {
        for(int v = 0; v < this.b.size(); ++v) {
            WatcherWrapper spannableBuilder$WatcherWrapper0 = (WatcherWrapper)this.b.get(v);
            if(spannableBuilder$WatcherWrapper0.a == object0) {
                return spannableBuilder$WatcherWrapper0;
            }
        }
        return null;
    }

    private boolean g(@NonNull Class class0) {
        return this.a == class0;
    }

    @Override  // android.text.SpannableStringBuilder
    public int getSpanEnd(@Nullable Object object0) {
        if(this.h(object0)) {
            WatcherWrapper spannableBuilder$WatcherWrapper0 = this.f(object0);
            if(spannableBuilder$WatcherWrapper0 != null) {
                object0 = spannableBuilder$WatcherWrapper0;
            }
        }
        return super.getSpanEnd(object0);
    }

    @Override  // android.text.SpannableStringBuilder
    public int getSpanFlags(@Nullable Object object0) {
        if(this.h(object0)) {
            WatcherWrapper spannableBuilder$WatcherWrapper0 = this.f(object0);
            if(spannableBuilder$WatcherWrapper0 != null) {
                object0 = spannableBuilder$WatcherWrapper0;
            }
        }
        return super.getSpanFlags(object0);
    }

    @Override  // android.text.SpannableStringBuilder
    public int getSpanStart(@Nullable Object object0) {
        if(this.h(object0)) {
            WatcherWrapper spannableBuilder$WatcherWrapper0 = this.f(object0);
            if(spannableBuilder$WatcherWrapper0 != null) {
                object0 = spannableBuilder$WatcherWrapper0;
            }
        }
        return super.getSpanStart(object0);
    }

    @Override  // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public Object[] getSpans(int v, int v1, @NonNull Class class0) {
        if(this.g(class0)) {
            WatcherWrapper[] arr_spannableBuilder$WatcherWrapper = (WatcherWrapper[])super.getSpans(v, v1, WatcherWrapper.class);
            Object[] arr_object = (Object[])Array.newInstance(class0, arr_spannableBuilder$WatcherWrapper.length);
            for(int v2 = 0; v2 < arr_spannableBuilder$WatcherWrapper.length; ++v2) {
                arr_object[v2] = arr_spannableBuilder$WatcherWrapper[v2].a;
            }
            return arr_object;
        }
        return super.getSpans(v, v1, class0);
    }

    private boolean h(@Nullable Object object0) {
        return object0 != null && this.g(object0.getClass());
    }

    private void i() {
        for(int v = 0; v < this.b.size(); ++v) {
            ((WatcherWrapper)this.b.get(v)).c();
        }
    }

    @Override  // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public Editable insert(int v, CharSequence charSequence0) {
        return this.insert(v, charSequence0);
    }

    @Override  // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public Editable insert(int v, CharSequence charSequence0, int v1, int v2) {
        return this.insert(v, charSequence0, v1, v2);
    }

    @Override  // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int v, CharSequence charSequence0) {
        super.insert(v, charSequence0);
        return this;
    }

    @Override  // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int v, CharSequence charSequence0, int v1, int v2) {
        super.insert(v, charSequence0, v1, v2);
        return this;
    }

    @Override  // android.text.SpannableStringBuilder
    public int nextSpanTransition(int v, int v1, @Nullable Class class0) {
        if(class0 == null || this.g(class0)) {
            class0 = WatcherWrapper.class;
        }
        return super.nextSpanTransition(v, v1, class0);
    }

    @Override  // android.text.SpannableStringBuilder
    public void removeSpan(@Nullable Object object0) {
        WatcherWrapper spannableBuilder$WatcherWrapper0;
        if(this.h(object0)) {
            spannableBuilder$WatcherWrapper0 = this.f(object0);
            if(spannableBuilder$WatcherWrapper0 != null) {
                object0 = spannableBuilder$WatcherWrapper0;
            }
        }
        else {
            spannableBuilder$WatcherWrapper0 = null;
        }
        super.removeSpan(object0);
        if(spannableBuilder$WatcherWrapper0 != null) {
            this.b.remove(spannableBuilder$WatcherWrapper0);
        }
    }

    @Override  // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public Editable replace(int v, int v1, CharSequence charSequence0) {
        return this.replace(v, v1, charSequence0);
    }

    @Override  // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public Editable replace(int v, int v1, CharSequence charSequence0, int v2, int v3) {
        return this.replace(v, v1, charSequence0, v2, v3);
    }

    @Override  // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int v, int v1, CharSequence charSequence0) {
        this.b();
        super.replace(v, v1, charSequence0);
        this.i();
        return this;
    }

    @Override  // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int v, int v1, CharSequence charSequence0, int v2, int v3) {
        this.b();
        super.replace(v, v1, charSequence0, v2, v3);
        this.i();
        return this;
    }

    @Override  // android.text.SpannableStringBuilder
    public void setSpan(@Nullable Object object0, int v, int v1, int v2) {
        if(this.h(object0)) {
            WatcherWrapper spannableBuilder$WatcherWrapper0 = new WatcherWrapper(object0);
            this.b.add(spannableBuilder$WatcherWrapper0);
            object0 = spannableBuilder$WatcherWrapper0;
        }
        super.setSpan(object0, v, v1, v2);
    }

    @Override  // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public CharSequence subSequence(int v, int v1) {
        return new SpannableBuilder(this.a, this, v, v1);
    }
}

