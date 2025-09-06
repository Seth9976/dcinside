package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ClipData.Item;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.RequiresApi;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import androidx.core.util.Predicate;
import j..util.Objects;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IntentSanitizer {
    @RequiresApi(29)
    static class Api29Impl {
        static String a(Intent intent0) {
            return intent0.getIdentifier();
        }

        static Intent b(Intent intent0, String s) {
            return intent0.setIdentifier(s);
        }
    }

    @RequiresApi(0x1F)
    static class Api31Impl {
        static void a(int v, ClipData.Item clipData$Item0, Consumer consumer0) {
            if(clipData$Item0.getHtmlText() != null || clipData$Item0.getIntent() != null || clipData$Item0.getTextLinks() != null) {
                consumer0.accept("ClipData item at position " + v + " contains htmlText, textLinks or intent: " + clipData$Item0);
            }
        }
    }

    public static final class Builder {
        private int a;
        private Predicate b;
        private Predicate c;
        private Predicate d;
        private Predicate e;
        private Predicate f;
        private Predicate g;
        private boolean h;
        private boolean i;
        private Map j;
        private boolean k;
        private Predicate l;
        private Predicate m;
        private boolean n;
        private boolean o;
        private boolean p;
        private static final int q = 0x7DEBF000;
        private static final int r = 0x78200000;

        public Builder() {
            this.b = new o();
            this.c = new p();
            this.d = new q();
            this.e = new r();
            this.f = new s();
            this.g = new t();
            this.j = new HashMap();
            this.k = false;
            this.l = new u();
            this.m = new v();
        }

        @SuppressLint({"BuilderSetStyle"})
        public Builder A(ComponentName componentName0) {
            Preconditions.l(componentName0);
            Objects.requireNonNull(componentName0);
            return this.B(new j(componentName0));
        }

        @SuppressLint({"BuilderSetStyle"})
        public Builder B(Predicate predicate0) {
            Preconditions.l(predicate0);
            this.i = true;
            this.g = this.g.b(predicate0);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        public Builder C(String s) {
            Preconditions.l(s);
            return this.B(new g(s));
        }

        @SuppressLint({"BuilderSetStyle"})
        public Builder D(Predicate predicate0) {
            Preconditions.l(predicate0);
            this.c = this.c.b(predicate0);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        public Builder E(String s) {
            Preconditions.l(s);
            this.D(new h(s));
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        public Builder F(String s, Predicate predicate0) {
            Preconditions.l(s);
            Preconditions.l(predicate0);
            Predicate predicate1 = (Predicate)this.j.get(s);
            if(predicate1 == null) {
                predicate1 = new m();
            }
            Predicate predicate2 = predicate1.b(predicate0);
            this.j.put(s, predicate2);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        public Builder G(String s, Class class0) {
            return this.H(s, class0, new w());
        }

        @SuppressLint({"BuilderSetStyle"})
        public Builder H(String s, Class class0, Predicate predicate0) {
            Preconditions.l(s);
            Preconditions.l(class0);
            Preconditions.l(predicate0);
            return this.F(s, new i(class0, predicate0));
        }

        @SuppressLint({"BuilderSetStyle"})
        public Builder I(Predicate predicate0) {
            this.H("output", Uri.class, predicate0);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        public Builder J(String s) {
            e e0 = new e(s);
            this.H("output", Uri.class, e0);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        public Builder K(Predicate predicate0) {
            this.H("android.intent.extra.STREAM", Uri.class, predicate0);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        public Builder L(String s) {
            Preconditions.l(s);
            n n0 = new n(s);
            this.H("android.intent.extra.STREAM", Uri.class, n0);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        public Builder M(int v) {
            this.a |= v;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        public Builder N() {
            this.a |= 0x7DEBF000;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        public Builder O() {
            this.n = true;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        public Builder P(Predicate predicate0) {
            Preconditions.l(predicate0);
            this.f = this.f.b(predicate0);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        public Builder Q(String s) {
            Preconditions.l(s);
            Objects.requireNonNull(s);
            return this.P(new f(s));
        }

        @SuppressLint({"BuilderSetStyle"})
        public Builder R() {
            this.a |= 0x78200000;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        public Builder S() {
            this.o = true;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        public Builder T() {
            this.p = true;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        public Builder U(Predicate predicate0) {
            Preconditions.l(predicate0);
            this.d = this.d.b(predicate0);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        public Builder V(String s) {
            Preconditions.l(s);
            Objects.requireNonNull(s);
            return this.U(new f(s));
        }

        public IntentSanitizer W() {
            if(this.h && this.i || !this.h && !this.i) {
                throw new SecurityException("You must call either allowAnyComponent or one or more of the allowComponent methods; but not both.");
            }
            IntentSanitizer intentSanitizer0 = new IntentSanitizer(null);
            intentSanitizer0.a = this.a;
            intentSanitizer0.b = this.b;
            intentSanitizer0.c = this.c;
            intentSanitizer0.d = this.d;
            intentSanitizer0.e = this.e;
            intentSanitizer0.f = this.f;
            intentSanitizer0.h = this.h;
            intentSanitizer0.g = this.g;
            intentSanitizer0.i = this.j;
            intentSanitizer0.j = this.k;
            intentSanitizer0.k = this.l;
            intentSanitizer0.l = this.m;
            intentSanitizer0.m = this.n;
            intentSanitizer0.n = this.o;
            intentSanitizer0.o = this.p;
            return intentSanitizer0;
        }

        private static boolean X(ComponentName componentName0) [...] // Inlined contents

        private static boolean Y(String s, Uri uri0) {
            return s.equals(uri0.getAuthority());
        }

        private static boolean Z(String s, ComponentName componentName0) {
            return s.equals(componentName0.getPackageName());
        }

        public static boolean a(ComponentName componentName0) {
            return false;
        }

        private static boolean a0(String s, Uri uri0) {
            return s.equals(uri0.getAuthority());
        }

        public static boolean b(String s) {
            return false;
        }

        private static boolean b0(Object object0) [...] // Inlined contents

        // 去混淆评级： 低(20)
        private static boolean c0(Class class0, Predicate predicate0, Object object0) {
            return class0.isInstance(object0) && predicate0.test(class0.cast(object0));
        }

        private static boolean d0(Object object0) [...] // Inlined contents

        private static boolean e0(String s, Uri uri0) {
            return s.equals(uri0.getAuthority());
        }

        public static boolean f(String s) {
            return false;
        }

        private static boolean f0(String s, Uri uri0) {
            return s.equals(uri0.getAuthority());
        }

        private static boolean g0(String s) [...] // Inlined contents

        private static boolean h0(Uri uri0) [...] // Inlined contents

        public static boolean i(Object object0) {
            return false;
        }

        private static boolean i0(String s) [...] // Inlined contents

        public static boolean j(ComponentName componentName0) {
            return true;
        }

        private static boolean j0(String s) [...] // Inlined contents

        public static boolean k(String s) {
            return false;
        }

        private static boolean k0(String s) [...] // Inlined contents

        public static boolean l(Uri uri0) {
            return false;
        }

        private static boolean l0(ComponentName componentName0) [...] // Inlined contents

        public static boolean m(Uri uri0) {
            return false;
        }

        private static boolean m0(Uri uri0) [...] // Inlined contents

        private static boolean n0(ClipData clipData0) [...] // Inlined contents

        public static boolean o(Object object0) {
            return true;
        }

        public static boolean p(String s) {
            return false;
        }

        public static boolean q(ClipData clipData0) {
            return false;
        }

        @SuppressLint({"BuilderSetStyle"})
        public Builder r(Predicate predicate0) {
            Preconditions.l(predicate0);
            this.b = this.b.b(predicate0);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        public Builder s(String s) {
            Preconditions.l(s);
            Objects.requireNonNull(s);
            this.r(new f(s));
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        public Builder t() {
            this.h = true;
            this.g = new k();
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        public Builder u(Predicate predicate0) {
            Preconditions.l(predicate0);
            this.e = this.e.b(predicate0);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        public Builder v(String s) {
            Preconditions.l(s);
            Objects.requireNonNull(s);
            return this.u(new f(s));
        }

        @SuppressLint({"BuilderSetStyle"})
        public Builder w(Predicate predicate0) {
            Preconditions.l(predicate0);
            this.m = this.m.b(predicate0);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        public Builder x() {
            this.k = true;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        public Builder y(Predicate predicate0) {
            Preconditions.l(predicate0);
            this.l = this.l.b(predicate0);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        public Builder z(String s) {
            Preconditions.l(s);
            return this.y(new l(s));
        }
    }

    private int a;
    private Predicate b;
    private Predicate c;
    private Predicate d;
    private Predicate e;
    private Predicate f;
    private Predicate g;
    private boolean h;
    private Map i;
    private boolean j;
    private Predicate k;
    private Predicate l;
    private boolean m;
    private boolean n;
    private boolean o;
    private static final String p = "IntentSanitizer";

    private IntentSanitizer() {
    }

    IntentSanitizer(androidx.core.content.IntentSanitizer.1 intentSanitizer$10) {
    }

    public static void b(String s) {
    }

    private static void r(int v, ClipData.Item clipData$Item0, Consumer consumer0) {
        if(clipData$Item0.getHtmlText() != null || clipData$Item0.getIntent() != null) {
            consumer0.accept("ClipData item at position " + v + " contains htmlText, textLinks or intent: " + clipData$Item0);
        }
    }

    private static void s(String s) {
    }

    // 检测为 Lambda 实现
    private static void t(String s) [...]

    private void u(Intent intent0, String s, Object object0) {
        if(object0 == null) {
            intent0.getExtras().putString(s, null);
            return;
        }
        if(object0 instanceof Parcelable) {
            intent0.putExtra(s, ((Parcelable)object0));
            return;
        }
        if(object0 instanceof Parcelable[]) {
            intent0.putExtra(s, ((Parcelable[])object0));
            return;
        }
        if(!(object0 instanceof Serializable)) {
            throw new IllegalArgumentException("Unsupported type " + object0.getClass());
        }
        intent0.putExtra(s, ((Serializable)object0));
    }

    public Intent v(Intent intent0, Consumer consumer0) {
        Intent intent1 = new Intent();
        ComponentName componentName0 = intent0.getComponent();
        if((!this.h || componentName0 != null) && !this.g.test(componentName0)) {
            consumer0.accept("Component is not allowed: " + componentName0);
            intent1.setComponent(new ComponentName("android", "java.lang.Void"));
        }
        else {
            intent1.setComponent(componentName0);
        }
        String s = intent0.getPackage();
        if(s == null || this.f.test(s)) {
            intent1.setPackage(s);
        }
        else {
            consumer0.accept("Package is not allowed: " + s);
        }
        int v = this.a;
        int v1 = intent0.getFlags();
        int v2 = this.a;
        if((v | v1) == v2) {
            intent1.setFlags(intent0.getFlags());
        }
        else {
            intent1.setFlags(intent0.getFlags() & v2);
            consumer0.accept("The intent contains flags that are not allowed: 0x" + Integer.toHexString(intent0.getFlags() & ~this.a));
        }
        String s1 = intent0.getAction();
        if(s1 == null || this.b.test(s1)) {
            intent1.setAction(s1);
        }
        else {
            consumer0.accept("Action is not allowed: " + s1);
        }
        Uri uri0 = intent0.getData();
        if(uri0 == null || this.c.test(uri0)) {
            intent1.setData(uri0);
        }
        else {
            consumer0.accept("Data is not allowed: " + uri0);
        }
        String s2 = intent0.getType();
        if(s2 == null || this.d.test(s2)) {
            intent1.setDataAndType(intent1.getData(), s2);
        }
        else {
            consumer0.accept("Type is not allowed: " + s2);
        }
        Set set0 = intent0.getCategories();
        if(set0 != null) {
            for(Object object0: set0) {
                String s3 = (String)object0;
                if(this.e.test(s3)) {
                    intent1.addCategory(s3);
                }
                else {
                    consumer0.accept("Category is not allowed: " + s3);
                }
            }
        }
        Bundle bundle0 = intent0.getExtras();
        if(bundle0 != null) {
            for(Object object1: bundle0.keySet()) {
                String s4 = (String)object1;
                if(s4.equals("android.intent.extra.STREAM") && (this.a & 1) == 0) {
                    consumer0.accept("Allowing Extra Stream requires also allowing at least  FLAG_GRANT_READ_URI_PERMISSION Flag.");
                }
                else if(s4.equals("output") && (~this.a & 3) != 0) {
                    consumer0.accept("Allowing Extra Output requires also allowing FLAG_GRANT_READ_URI_PERMISSION and FLAG_GRANT_WRITE_URI_PERMISSION Flags.");
                }
                else {
                    Object object2 = bundle0.get(s4);
                    Predicate predicate0 = (Predicate)this.i.get(s4);
                    if(predicate0 != null && predicate0.test(object2)) {
                        this.u(intent1, s4, object2);
                    }
                    else {
                        consumer0.accept("Extra is not allowed. Key: " + s4 + ". Value: " + object2);
                    }
                }
            }
        }
        IntentSanitizer.y(intent0, intent1, this.l, this.j, this.k, consumer0);
        if(Build.VERSION.SDK_INT >= 29) {
            if(this.m) {
                Api29Impl.b(intent1, Api29Impl.a(intent0));
            }
            else if(Api29Impl.a(intent0) != null) {
                consumer0.accept("Identifier is not allowed: " + Api29Impl.a(intent0));
            }
        }
        if(this.n) {
            intent1.setSelector(intent0.getSelector());
        }
        else if(intent0.getSelector() != null) {
            consumer0.accept("Selector is not allowed: " + intent0.getSelector());
        }
        if(this.o) {
            intent1.setSourceBounds(intent0.getSourceBounds());
            return intent1;
        }
        if(intent0.getSourceBounds() != null) {
            consumer0.accept("SourceBounds is not allowed: " + intent0.getSourceBounds());
        }
        return intent1;
    }

    public Intent w(Intent intent0) {
        return this.v(intent0, new d());
    }

    public Intent x(Intent intent0) {
        return this.v(intent0, (String s) -> throw new SecurityException(s));
    }

    static void y(Intent intent0, Intent intent1, Predicate predicate0, boolean z, Predicate predicate1, Consumer consumer0) {
        Uri uri0;
        CharSequence charSequence0;
        ClipData clipData0 = intent0.getClipData();
        if(clipData0 == null) {
            return;
        }
        if(predicate0 != null && predicate0.test(clipData0)) {
            intent1.setClipData(clipData0);
            return;
        }
        ClipData clipData1 = null;
        for(int v = 0; v < clipData0.getItemCount(); ++v) {
            ClipData.Item clipData$Item0 = clipData0.getItemAt(v);
            if(Build.VERSION.SDK_INT >= 0x1F) {
                Api31Impl.a(v, clipData$Item0, consumer0);
            }
            else {
                IntentSanitizer.r(v, clipData$Item0, consumer0);
            }
            if(z) {
                charSequence0 = clipData$Item0.getText();
            }
            else {
                if(clipData$Item0.getText() != null) {
                    consumer0.accept("Item text cannot contain value. Item position: " + v + ". Text: " + clipData$Item0.getText());
                }
                charSequence0 = null;
            }
            if(predicate1 == null) {
                if(clipData$Item0.getUri() != null) {
                    consumer0.accept("Item URI is not allowed. Item position: " + v + ". URI: " + clipData$Item0.getUri());
                }
                uri0 = null;
            }
            else if(clipData$Item0.getUri() == null || predicate1.test(clipData$Item0.getUri())) {
                uri0 = clipData$Item0.getUri();
            }
            else {
                consumer0.accept("Item URI is not allowed. Item position: " + v + ". URI: " + clipData$Item0.getUri());
                uri0 = null;
            }
            if(charSequence0 != null || uri0 != null) {
                if(clipData1 == null) {
                    clipData1 = new ClipData(clipData0.getDescription(), new ClipData.Item(charSequence0, null, uri0));
                }
                else {
                    clipData1.addItem(new ClipData.Item(charSequence0, null, uri0));
                }
            }
        }
        if(clipData1 != null) {
            intent1.setClipData(clipData1);
        }
    }

    class androidx.core.content.IntentSanitizer.1 {
    }

}

