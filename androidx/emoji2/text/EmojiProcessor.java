package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.annotation.AnyThread;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.Arrays;
import java.util.Set;

@AnyThread
@RequiresApi(19)
@RestrictTo({Scope.a})
final class EmojiProcessor {
    @RequiresApi(19)
    static final class CodepointIndexFinder {
        private static final int a = -1;

        static int a(CharSequence charSequence0, int v, int v1) {
            boolean z;
            if(v < 0 || charSequence0.length() < v || v1 < 0) {
                return -1;
            }
            while(true) {
                z = false;
            label_3:
                if(v1 == 0) {
                    return v;
                }
                --v;
                if(v < 0) {
                    return z ? -1 : 0;
                }
                int v2 = charSequence0.charAt(v);
                if(!z) {
                    break;
                }
                if(!Character.isHighSurrogate(((char)v2))) {
                    return -1;
                }
                --v1;
            }
            if(!Character.isSurrogate(((char)v2))) {
                --v1;
                goto label_3;
            }
            if(!Character.isHighSurrogate(((char)v2))) {
                z = true;
                goto label_3;
            }
            return -1;
        }

        static int b(CharSequence charSequence0, int v, int v1) {
            boolean z;
            int v2 = charSequence0.length();
            if(v < 0 || v2 < v || v1 < 0) {
                return -1;
            }
            while(true) {
                z = false;
            label_4:
                if(v1 == 0) {
                    return v;
                }
                if(v >= v2) {
                    return z ? -1 : v2;
                }
                int v3 = charSequence0.charAt(v);
                if(!z) {
                    break;
                }
                if(!Character.isLowSurrogate(((char)v3))) {
                    return -1;
                }
                --v1;
                ++v;
            }
            if(!Character.isSurrogate(((char)v3))) {
                --v1;
                ++v;
                goto label_4;
            }
            if(!Character.isLowSurrogate(((char)v3))) {
                ++v;
                z = true;
                goto label_4;
            }
            return -1;
        }
    }

    static class EmojiProcessAddSpanCallback implements EmojiProcessCallback {
        @Nullable
        public UnprecomputeTextOnModificationSpannable a;
        private final SpanFactory b;

        EmojiProcessAddSpanCallback(@Nullable UnprecomputeTextOnModificationSpannable unprecomputeTextOnModificationSpannable0, SpanFactory emojiCompat$SpanFactory0) {
            this.a = unprecomputeTextOnModificationSpannable0;
            this.b = emojiCompat$SpanFactory0;
        }

        @Override  // androidx.emoji2.text.EmojiProcessor$EmojiProcessCallback
        public boolean a(@NonNull CharSequence charSequence0, int v, int v1, TypefaceEmojiRasterizer typefaceEmojiRasterizer0) {
            if(typefaceEmojiRasterizer0.m()) {
                return true;
            }
            if(this.a == null) {
                Spannable spannable0 = charSequence0 instanceof Spannable ? ((Spannable)charSequence0) : new SpannableString(charSequence0);
                this.a = new UnprecomputeTextOnModificationSpannable(spannable0);
            }
            EmojiSpan emojiSpan0 = this.b.a(typefaceEmojiRasterizer0);
            this.a.setSpan(emojiSpan0, v, v1, 33);
            return true;
        }

        public UnprecomputeTextOnModificationSpannable b() {
            return this.a;
        }

        @Override  // androidx.emoji2.text.EmojiProcessor$EmojiProcessCallback
        public Object getResult() {
            return this.b();
        }
    }

    interface EmojiProcessCallback {
        boolean a(@NonNull CharSequence arg1, int arg2, int arg3, TypefaceEmojiRasterizer arg4);

        Object getResult();
    }

    static class EmojiProcessLookupCallback implements EmojiProcessCallback {
        private final int a;
        public int b;
        public int c;

        EmojiProcessLookupCallback(int v) {
            this.b = -1;
            this.c = -1;
            this.a = v;
        }

        @Override  // androidx.emoji2.text.EmojiProcessor$EmojiProcessCallback
        public boolean a(@NonNull CharSequence charSequence0, int v, int v1, TypefaceEmojiRasterizer typefaceEmojiRasterizer0) {
            int v2 = this.a;
            if(v <= v2 && v2 < v1) {
                this.b = v;
                this.c = v1;
                return false;
            }
            return v1 <= v2;
        }

        public EmojiProcessLookupCallback b() [...] // Inlined contents

        @Override  // androidx.emoji2.text.EmojiProcessor$EmojiProcessCallback
        public Object getResult() {
            return this;
        }
    }

    static class MarkExclusionCallback implements EmojiProcessCallback {
        private final String a;

        MarkExclusionCallback(String s) {
            this.a = s;
        }

        @Override  // androidx.emoji2.text.EmojiProcessor$EmojiProcessCallback
        public boolean a(@NonNull CharSequence charSequence0, int v, int v1, TypefaceEmojiRasterizer typefaceEmojiRasterizer0) {
            if(TextUtils.equals(charSequence0.subSequence(v, v1), this.a)) {
                typefaceEmojiRasterizer0.o(true);
                return false;
            }
            return true;
        }

        public MarkExclusionCallback b() [...] // Inlined contents

        @Override  // androidx.emoji2.text.EmojiProcessor$EmojiProcessCallback
        public Object getResult() {
            return this;
        }
    }

    static final class ProcessorSm {
        private int a;
        private final Node b;
        private Node c;
        private Node d;
        private int e;
        private int f;
        private final boolean g;
        private final int[] h;
        private static final int i = 1;
        private static final int j = 2;

        ProcessorSm(Node metadataRepo$Node0, boolean z, int[] arr_v) {
            this.a = 1;
            this.b = metadataRepo$Node0;
            this.c = metadataRepo$Node0;
            this.g = z;
            this.h = arr_v;
        }

        int a(int v) {
            Node metadataRepo$Node0 = this.c.a(v);
            int v1 = 2;
            if(this.a == 2) {
                if(metadataRepo$Node0 != null) {
                    this.c = metadataRepo$Node0;
                    ++this.f;
                }
                else if(ProcessorSm.f(v)) {
                    v1 = this.g();
                }
                else if(!ProcessorSm.d(v)) {
                    v1 = 3;
                    if(this.c.b() == null) {
                        v1 = this.g();
                    }
                    else if(this.f != 1) {
                        this.d = this.c;
                        this.g();
                    }
                    else if(this.h()) {
                        this.d = this.c;
                        this.g();
                    }
                    else {
                        v1 = this.g();
                    }
                }
            }
            else if(metadataRepo$Node0 == null) {
                v1 = this.g();
            }
            else {
                this.a = 2;
                this.c = metadataRepo$Node0;
                this.f = 1;
            }
            this.e = v;
            return v1;
        }

        TypefaceEmojiRasterizer b() {
            return this.c.b();
        }

        TypefaceEmojiRasterizer c() {
            return this.d.b();
        }

        private static boolean d(int v) {
            return v == 0xFE0F;
        }

        // 去混淆评级： 低(20)
        boolean e() {
            return this.a == 2 && this.c.b() != null && (this.f > 1 || this.h());
        }

        private static boolean f(int v) {
            return v == 0xFE0E;
        }

        private int g() {
            this.a = 1;
            this.c = this.b;
            this.f = 0;
            return 1;
        }

        private boolean h() {
            if(this.c.b().l()) {
                return true;
            }
            if(ProcessorSm.d(this.e)) {
                return true;
            }
            if(this.g) {
                if(this.h == null) {
                    return true;
                }
                int v = this.c.b().b(0);
                return Arrays.binarySearch(this.h, v) < 0;
            }
            return false;
        }
    }

    @NonNull
    private final SpanFactory a;
    @NonNull
    private final MetadataRepo b;
    @NonNull
    private GlyphChecker c;
    private final boolean d;
    @Nullable
    private final int[] e;
    private static final int f = 1;
    private static final int g = 2;
    private static final int h = 3;
    private static final int i = 16;

    EmojiProcessor(@NonNull MetadataRepo metadataRepo0, @NonNull SpanFactory emojiCompat$SpanFactory0, @NonNull GlyphChecker emojiCompat$GlyphChecker0, boolean z, @Nullable int[] arr_v, @NonNull Set set0) {
        this.a = emojiCompat$SpanFactory0;
        this.b = metadataRepo0;
        this.c = emojiCompat$GlyphChecker0;
        this.d = z;
        this.e = arr_v;
        this.k(set0);
    }

    private static boolean a(@NonNull Editable editable0, @NonNull KeyEvent keyEvent0, boolean z) {
        if(EmojiProcessor.j(keyEvent0)) {
            return false;
        }
        int v = Selection.getSelectionStart(editable0);
        int v1 = Selection.getSelectionEnd(editable0);
        if(EmojiProcessor.i(v, v1)) {
            return false;
        }
        EmojiSpan[] arr_emojiSpan = (EmojiSpan[])editable0.getSpans(v, v1, EmojiSpan.class);
        if(arr_emojiSpan != null && arr_emojiSpan.length > 0) {
            for(int v2 = 0; v2 < arr_emojiSpan.length; ++v2) {
                EmojiSpan emojiSpan0 = arr_emojiSpan[v2];
                int v3 = editable0.getSpanStart(emojiSpan0);
                int v4 = editable0.getSpanEnd(emojiSpan0);
                if(z && v3 == v || !z && v4 == v || v > v3 && v < v4) {
                    editable0.delete(v3, v4);
                    return true;
                }
            }
        }
        return false;
    }

    int b(@NonNull CharSequence charSequence0, @IntRange(from = 0L) int v) {
        if(v >= 0 && v < charSequence0.length()) {
            if(charSequence0 instanceof Spanned) {
                EmojiSpan[] arr_emojiSpan = (EmojiSpan[])((Spanned)charSequence0).getSpans(v, v + 1, EmojiSpan.class);
                return arr_emojiSpan.length <= 0 ? ((EmojiProcessLookupCallback)this.m(charSequence0, Math.max(0, v - 16), Math.min(charSequence0.length(), v + 16), 0x7FFFFFFF, true, new EmojiProcessLookupCallback(v))).c : ((Spanned)charSequence0).getSpanEnd(arr_emojiSpan[0]);
            }
            return ((EmojiProcessLookupCallback)this.m(charSequence0, Math.max(0, v - 16), Math.min(charSequence0.length(), v + 16), 0x7FFFFFFF, true, new EmojiProcessLookupCallback(v))).c;
        }
        return -1;
    }

    int c(@NonNull CharSequence charSequence0) {
        return this.d(charSequence0, this.b.h());
    }

    int d(@NonNull CharSequence charSequence0, int v) {
        ProcessorSm emojiProcessor$ProcessorSm0 = new ProcessorSm(this.b.i(), this.d, this.e);
        int v1 = charSequence0.length();
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        while(v2 < v1) {
            int v5 = Character.codePointAt(charSequence0, v2);
            int v6 = emojiProcessor$ProcessorSm0.a(v5);
            TypefaceEmojiRasterizer typefaceEmojiRasterizer0 = emojiProcessor$ProcessorSm0.b();
            switch(v6) {
                case 1: {
                    v2 += Character.charCount(v5);
                    v4 = 0;
                    break;
                }
                case 2: {
                    v2 += Character.charCount(v5);
                    break;
                }
                default: {
                    if(v6 == 3) {
                        typefaceEmojiRasterizer0 = emojiProcessor$ProcessorSm0.c();
                        if(typefaceEmojiRasterizer0.d() <= v) {
                            ++v3;
                        }
                    }
                }
            }
            if(typefaceEmojiRasterizer0 != null && typefaceEmojiRasterizer0.d() <= v) {
                ++v4;
            }
        }
        if(v3 != 0) {
            return 2;
        }
        if(emojiProcessor$ProcessorSm0.e() && emojiProcessor$ProcessorSm0.b().d() <= v) {
            return 1;
        }
        return v4 == 0 ? 0 : 2;
    }

    int e(@NonNull CharSequence charSequence0, @IntRange(from = 0L) int v) {
        if(v >= 0 && v < charSequence0.length()) {
            if(charSequence0 instanceof Spanned) {
                EmojiSpan[] arr_emojiSpan = (EmojiSpan[])((Spanned)charSequence0).getSpans(v, v + 1, EmojiSpan.class);
                return arr_emojiSpan.length <= 0 ? ((EmojiProcessLookupCallback)this.m(charSequence0, Math.max(0, v - 16), Math.min(charSequence0.length(), v + 16), 0x7FFFFFFF, true, new EmojiProcessLookupCallback(v))).b : ((Spanned)charSequence0).getSpanStart(arr_emojiSpan[0]);
            }
            return ((EmojiProcessLookupCallback)this.m(charSequence0, Math.max(0, v - 16), Math.min(charSequence0.length(), v + 16), 0x7FFFFFFF, true, new EmojiProcessLookupCallback(v))).b;
        }
        return -1;
    }

    static boolean f(@NonNull InputConnection inputConnection0, @NonNull Editable editable0, @IntRange(from = 0L) int v, @IntRange(from = 0L) int v1, boolean z) {
        int v5;
        int v4;
        if(editable0 != null && inputConnection0 != null && v >= 0 && v1 >= 0) {
            int v2 = Selection.getSelectionStart(editable0);
            int v3 = Selection.getSelectionEnd(editable0);
            if(EmojiProcessor.i(v2, v3)) {
                return false;
            }
            if(z) {
                v4 = CodepointIndexFinder.a(editable0, v2, Math.max(v, 0));
                v5 = CodepointIndexFinder.b(editable0, v3, Math.max(v1, 0));
                if(v4 == -1 || v5 == -1) {
                    return false;
                }
            }
            else {
                v4 = Math.max(v2 - v, 0);
                v5 = Math.min(v3 + v1, editable0.length());
            }
            EmojiSpan[] arr_emojiSpan = (EmojiSpan[])editable0.getSpans(v4, v5, EmojiSpan.class);
            if(arr_emojiSpan != null && arr_emojiSpan.length > 0) {
                for(int v6 = 0; v6 < arr_emojiSpan.length; ++v6) {
                    EmojiSpan emojiSpan0 = arr_emojiSpan[v6];
                    v4 = Math.min(editable0.getSpanStart(emojiSpan0), v4);
                    v5 = Math.max(editable0.getSpanEnd(emojiSpan0), v5);
                }
                int v7 = Math.min(v5, editable0.length());
                inputConnection0.beginBatchEdit();
                editable0.delete(Math.max(v4, 0), v7);
                inputConnection0.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    static boolean g(@NonNull Editable editable0, int v, @NonNull KeyEvent keyEvent0) {
        boolean z;
        switch(v) {
            case 67: {
                z = EmojiProcessor.a(editable0, keyEvent0, false);
                break;
            }
            case 0x70: {
                z = EmojiProcessor.a(editable0, keyEvent0, true);
                break;
            }
            default: {
                z = false;
            }
        }
        if(z) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable0);
            return true;
        }
        return false;
    }

    private boolean h(CharSequence charSequence0, int v, int v1, TypefaceEmojiRasterizer typefaceEmojiRasterizer0) {
        if(typefaceEmojiRasterizer0.e() == 0) {
            typefaceEmojiRasterizer0.p(this.c.a(charSequence0, v, v1, typefaceEmojiRasterizer0.i()));
        }
        return typefaceEmojiRasterizer0.e() == 2;
    }

    private static boolean i(int v, int v1) {
        return v == -1 || v1 == -1 || v != v1;
    }

    private static boolean j(@NonNull KeyEvent keyEvent0) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent0.getMetaState());
    }

    private void k(@NonNull Set set0) {
        if(set0.isEmpty()) {
            return;
        }
        for(Object object0: set0) {
            String s = new String(((int[])object0), 0, ((int[])object0).length);
            this.m(s, 0, s.length(), 1, true, new MarkExclusionCallback(s));
        }
    }

    CharSequence l(@NonNull CharSequence charSequence0, @IntRange(from = 0L) int v, @IntRange(from = 0L) int v1, @IntRange(from = 0L) int v2, boolean z) {
        CharSequence charSequence1;
        UnprecomputeTextOnModificationSpannable unprecomputeTextOnModificationSpannable0;
        if(charSequence0 instanceof SpannableBuilder) {
            ((SpannableBuilder)charSequence0).a();
        }
        try {
            Class class0 = EmojiSpan.class;
            if(charSequence0 instanceof SpannableBuilder) {
                unprecomputeTextOnModificationSpannable0 = new UnprecomputeTextOnModificationSpannable(((Spannable)charSequence0));
            }
            else if(charSequence0 instanceof Spannable) {
                unprecomputeTextOnModificationSpannable0 = new UnprecomputeTextOnModificationSpannable(((Spannable)charSequence0));
            }
            else if(charSequence0 instanceof Spanned && ((Spanned)charSequence0).nextSpanTransition(v - 1, v1 + 1, class0) <= v1) {
                unprecomputeTextOnModificationSpannable0 = new UnprecomputeTextOnModificationSpannable(charSequence0);
            }
            else {
                unprecomputeTextOnModificationSpannable0 = null;
            }
            if(unprecomputeTextOnModificationSpannable0 != null) {
                EmojiSpan[] arr_emojiSpan = (EmojiSpan[])unprecomputeTextOnModificationSpannable0.getSpans(v, v1, class0);
                if(arr_emojiSpan != null && arr_emojiSpan.length > 0) {
                    for(int v3 = 0; v3 < arr_emojiSpan.length; ++v3) {
                        EmojiSpan emojiSpan0 = arr_emojiSpan[v3];
                        int v4 = unprecomputeTextOnModificationSpannable0.getSpanStart(emojiSpan0);
                        int v5 = unprecomputeTextOnModificationSpannable0.getSpanEnd(emojiSpan0);
                        if(v4 != v1) {
                            unprecomputeTextOnModificationSpannable0.removeSpan(emojiSpan0);
                        }
                        v = Math.min(v4, v);
                        v1 = Math.max(v5, v1);
                    }
                }
            }
            if(v != v1 && v < charSequence0.length()) {
                if(v2 != 0x7FFFFFFF && unprecomputeTextOnModificationSpannable0 != null) {
                    v2 -= ((EmojiSpan[])unprecomputeTextOnModificationSpannable0.getSpans(0, unprecomputeTextOnModificationSpannable0.length(), class0)).length;
                }
                UnprecomputeTextOnModificationSpannable unprecomputeTextOnModificationSpannable1 = (UnprecomputeTextOnModificationSpannable)this.m(charSequence0, v, v1, v2, z, new EmojiProcessAddSpanCallback(unprecomputeTextOnModificationSpannable0, this.a));
                if(unprecomputeTextOnModificationSpannable1 != null) {
                    charSequence1 = unprecomputeTextOnModificationSpannable1.b();
                    goto label_38;
                label_35:
                    if(!(charSequence0 instanceof SpannableBuilder)) {
                        throw throwable0;
                    }
                    goto label_36;
                }
                goto label_41;
            }
            goto label_44;
        }
        catch(Throwable throwable0) {
            goto label_35;
        }
    label_36:
        ((SpannableBuilder)charSequence0).d();
        throw throwable0;
    label_38:
        if(charSequence0 instanceof SpannableBuilder) {
            ((SpannableBuilder)charSequence0).d();
        }
        return charSequence1;
    label_41:
        if(charSequence0 instanceof SpannableBuilder) {
            ((SpannableBuilder)charSequence0).d();
        }
        return charSequence0;
    label_44:
        if(charSequence0 instanceof SpannableBuilder) {
            ((SpannableBuilder)charSequence0).d();
        }
        return charSequence0;
    }

    private Object m(@NonNull CharSequence charSequence0, @IntRange(from = 0L) int v, @IntRange(from = 0L) int v1, @IntRange(from = 0L) int v2, boolean z, EmojiProcessCallback emojiProcessor$EmojiProcessCallback0) {
        int v5;
        ProcessorSm emojiProcessor$ProcessorSm0 = new ProcessorSm(this.b.i(), this.d, this.e);
        int v3 = Character.codePointAt(charSequence0, v);
        int v4 = 0;
        boolean z1 = true;
    alab1:
        while(true) {
            v5 = v;
            while(true) {
                if(v >= v1 || v4 >= v2 || !z1) {
                    break alab1;
                }
                switch(emojiProcessor$ProcessorSm0.a(v3)) {
                    case 1: {
                        v5 += Character.charCount(Character.codePointAt(charSequence0, v5));
                        if(v5 < v1) {
                            v3 = Character.codePointAt(charSequence0, v5);
                        }
                        v = v5;
                        continue;
                    }
                    case 2: {
                        v += Character.charCount(v3);
                        if(v >= v1) {
                            continue;
                        }
                        v3 = Character.codePointAt(charSequence0, v);
                        continue;
                    }
                    case 3: {
                        break;
                    }
                    default: {
                        continue;
                    }
                }
                if(!z && this.h(charSequence0, v5, v, emojiProcessor$ProcessorSm0.c())) {
                    break;
                }
                z1 = emojiProcessor$EmojiProcessCallback0.a(charSequence0, v5, v, emojiProcessor$ProcessorSm0.c());
                ++v4;
                break;
            }
        }
        if(emojiProcessor$ProcessorSm0.e() && v4 < v2 && z1 && (z || !this.h(charSequence0, v5, v, emojiProcessor$ProcessorSm0.b()))) {
            emojiProcessor$EmojiProcessCallback0.a(charSequence0, v5, v, emojiProcessor$ProcessorSm0.b());
        }
        return emojiProcessor$EmojiProcessCallback0.getResult();
    }
}

