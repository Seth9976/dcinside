package androidx.core.view;

import android.content.ClipData.Item;
import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Pair;
import android.view.ContentInfo.Builder;
import android.view.ContentInfo;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import j..util.Objects;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public final class ContentInfoCompat {
    @RequiresApi(0x1F)
    static final class Api31Impl {
        public static Pair a(ContentInfo contentInfo0, Predicate predicate0) {
            ClipData clipData0 = contentInfo0.getClip();
            if(clipData0.getItemCount() == 1) {
                boolean z = predicate0.test(clipData0.getItemAt(0));
                ContentInfo contentInfo1 = z ? contentInfo0 : null;
                if(z) {
                    contentInfo0 = null;
                }
                return Pair.create(contentInfo1, contentInfo0);
            }
            Objects.requireNonNull(predicate0);
            Pair pair0 = ContentInfoCompat.h(clipData0, new b(predicate0));
            if(pair0.first == null) {
                return Pair.create(null, contentInfo0);
            }
            return pair0.second == null ? Pair.create(contentInfo0, null) : Pair.create(new ContentInfo.Builder(contentInfo0).setClip(((ClipData)pair0.first)).build(), new ContentInfo.Builder(contentInfo0).setClip(((ClipData)pair0.second)).build());
        }
    }

    public static final class Builder {
        private final BuilderCompat a;

        public Builder(ClipData clipData0, int v) {
            if(Build.VERSION.SDK_INT >= 0x1F) {
                this.a = new BuilderCompat31Impl(clipData0, v);
                return;
            }
            this.a = new BuilderCompatImpl(clipData0, v);
        }

        public Builder(ContentInfoCompat contentInfoCompat0) {
            if(Build.VERSION.SDK_INT >= 0x1F) {
                this.a = new BuilderCompat31Impl(contentInfoCompat0);
                return;
            }
            this.a = new BuilderCompatImpl(contentInfoCompat0);
        }

        public ContentInfoCompat a() {
            return this.a.build();
        }

        public Builder b(ClipData clipData0) {
            this.a.b(clipData0);
            return this;
        }

        public Builder c(Bundle bundle0) {
            this.a.setExtras(bundle0);
            return this;
        }

        public Builder d(int v) {
            this.a.setFlags(v);
            return this;
        }

        public Builder e(Uri uri0) {
            this.a.a(uri0);
            return this;
        }

        public Builder f(int v) {
            this.a.c(v);
            return this;
        }
    }

    @RequiresApi(0x1F)
    static final class BuilderCompat31Impl implements BuilderCompat {
        private final ContentInfo.Builder a;

        BuilderCompat31Impl(ClipData clipData0, int v) {
            this.a = i.a(clipData0, v);
        }

        BuilderCompat31Impl(ContentInfoCompat contentInfoCompat0) {
            this.a = j.a(contentInfoCompat0.l());
        }

        @Override  // androidx.core.view.ContentInfoCompat$BuilderCompat
        public void a(Uri uri0) {
            this.a.setLinkUri(uri0);
        }

        @Override  // androidx.core.view.ContentInfoCompat$BuilderCompat
        public void b(ClipData clipData0) {
            this.a.setClip(clipData0);
        }

        @Override  // androidx.core.view.ContentInfoCompat$BuilderCompat
        public ContentInfoCompat build() {
            return new ContentInfoCompat(new Compat31Impl(this.a.build()));
        }

        @Override  // androidx.core.view.ContentInfoCompat$BuilderCompat
        public void c(int v) {
            this.a.setSource(v);
        }

        @Override  // androidx.core.view.ContentInfoCompat$BuilderCompat
        public void setExtras(Bundle bundle0) {
            this.a.setExtras(bundle0);
        }

        @Override  // androidx.core.view.ContentInfoCompat$BuilderCompat
        public void setFlags(int v) {
            this.a.setFlags(v);
        }
    }

    interface BuilderCompat {
        void a(Uri arg1);

        void b(ClipData arg1);

        ContentInfoCompat build();

        void c(int arg1);

        void setExtras(Bundle arg1);

        void setFlags(int arg1);
    }

    static final class BuilderCompatImpl implements BuilderCompat {
        ClipData a;
        int b;
        int c;
        Uri d;
        Bundle e;

        BuilderCompatImpl(ClipData clipData0, int v) {
            this.a = clipData0;
            this.b = v;
        }

        BuilderCompatImpl(ContentInfoCompat contentInfoCompat0) {
            this.a = contentInfoCompat0.c();
            this.b = contentInfoCompat0.g();
            this.c = contentInfoCompat0.e();
            this.d = contentInfoCompat0.f();
            this.e = contentInfoCompat0.d();
        }

        @Override  // androidx.core.view.ContentInfoCompat$BuilderCompat
        public void a(Uri uri0) {
            this.d = uri0;
        }

        @Override  // androidx.core.view.ContentInfoCompat$BuilderCompat
        public void b(ClipData clipData0) {
            this.a = clipData0;
        }

        @Override  // androidx.core.view.ContentInfoCompat$BuilderCompat
        public ContentInfoCompat build() {
            return new ContentInfoCompat(new CompatImpl(this));
        }

        @Override  // androidx.core.view.ContentInfoCompat$BuilderCompat
        public void c(int v) {
            this.b = v;
        }

        @Override  // androidx.core.view.ContentInfoCompat$BuilderCompat
        public void setExtras(Bundle bundle0) {
            this.e = bundle0;
        }

        @Override  // androidx.core.view.ContentInfoCompat$BuilderCompat
        public void setFlags(int v) {
            this.c = v;
        }
    }

    @RequiresApi(0x1F)
    static final class Compat31Impl implements Compat {
        private final ContentInfo a;

        Compat31Impl(ContentInfo contentInfo0) {
            this.a = a.a(Preconditions.l(contentInfo0));
        }

        @Override  // androidx.core.view.ContentInfoCompat$Compat
        public int N() {
            return this.a.getSource();
        }

        @Override  // androidx.core.view.ContentInfoCompat$Compat
        public Uri O() {
            return this.a.getLinkUri();
        }

        @Override  // androidx.core.view.ContentInfoCompat$Compat
        public ContentInfo P() {
            return this.a;
        }

        @Override  // androidx.core.view.ContentInfoCompat$Compat
        public ClipData d() {
            return this.a.getClip();
        }

        @Override  // androidx.core.view.ContentInfoCompat$Compat
        public Bundle getExtras() {
            return this.a.getExtras();
        }

        @Override  // androidx.core.view.ContentInfoCompat$Compat
        public int getFlags() {
            return this.a.getFlags();
        }

        @Override
        public String toString() {
            return "ContentInfoCompat{" + this.a + "}";
        }
    }

    interface Compat {
        int N();

        Uri O();

        ContentInfo P();

        ClipData d();

        Bundle getExtras();

        int getFlags();
    }

    static final class CompatImpl implements Compat {
        private final ClipData a;
        private final int b;
        private final int c;
        private final Uri d;
        private final Bundle e;

        CompatImpl(BuilderCompatImpl contentInfoCompat$BuilderCompatImpl0) {
            this.a = (ClipData)Preconditions.l(contentInfoCompat$BuilderCompatImpl0.a);
            this.b = Preconditions.g(contentInfoCompat$BuilderCompatImpl0.b, 0, 5, "source");
            this.c = Preconditions.k(contentInfoCompat$BuilderCompatImpl0.c, 1);
            this.d = contentInfoCompat$BuilderCompatImpl0.d;
            this.e = contentInfoCompat$BuilderCompatImpl0.e;
        }

        @Override  // androidx.core.view.ContentInfoCompat$Compat
        public int N() {
            return this.b;
        }

        @Override  // androidx.core.view.ContentInfoCompat$Compat
        public Uri O() {
            return this.d;
        }

        @Override  // androidx.core.view.ContentInfoCompat$Compat
        public ContentInfo P() {
            return null;
        }

        @Override  // androidx.core.view.ContentInfoCompat$Compat
        public ClipData d() {
            return this.a;
        }

        @Override  // androidx.core.view.ContentInfoCompat$Compat
        public Bundle getExtras() {
            return this.e;
        }

        @Override  // androidx.core.view.ContentInfoCompat$Compat
        public int getFlags() {
            return this.c;
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append("ContentInfoCompat{clip=");
            stringBuilder0.append(this.a.getDescription());
            stringBuilder0.append(", source=");
            stringBuilder0.append(ContentInfoCompat.k(this.b));
            stringBuilder0.append(", flags=");
            stringBuilder0.append(ContentInfoCompat.b(this.c));
            String s = "";
            stringBuilder0.append((this.d == null ? "" : ", hasLinkUri(" + this.d.toString().length() + ")"));
            if(this.e != null) {
                s = ", hasExtras";
            }
            stringBuilder0.append(s);
            stringBuilder0.append("}");
            return stringBuilder0.toString();
        }
    }

    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Source {
    }

    private final Compat a;
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 1;

    ContentInfoCompat(Compat contentInfoCompat$Compat0) {
        this.a = contentInfoCompat$Compat0;
    }

    static ClipData a(ClipDescription clipDescription0, List list0) {
        ClipData clipData0 = new ClipData(new ClipDescription(clipDescription0), ((ClipData.Item)list0.get(0)));
        for(int v = 1; v < list0.size(); ++v) {
            clipData0.addItem(((ClipData.Item)list0.get(v)));
        }
        return clipData0;
    }

    @RestrictTo({Scope.c})
    static String b(int v) {
        return (v & 1) == 0 ? String.valueOf(v) : "FLAG_CONVERT_TO_PLAIN_TEXT";
    }

    public ClipData c() {
        return this.a.d();
    }

    public Bundle d() {
        return this.a.getExtras();
    }

    public int e() {
        return this.a.getFlags();
    }

    public Uri f() {
        return this.a.O();
    }

    public int g() {
        return this.a.N();
    }

    static Pair h(ClipData clipData0, androidx.core.util.Predicate predicate0) {
        ArrayList arrayList0 = null;
        ArrayList arrayList1 = null;
        for(int v = 0; v < clipData0.getItemCount(); ++v) {
            ClipData.Item clipData$Item0 = clipData0.getItemAt(v);
            if(predicate0.test(clipData$Item0)) {
                if(arrayList0 == null) {
                    arrayList0 = new ArrayList();
                }
                arrayList0.add(clipData$Item0);
            }
            else {
                if(arrayList1 == null) {
                    arrayList1 = new ArrayList();
                }
                arrayList1.add(clipData$Item0);
            }
        }
        if(arrayList0 == null) {
            return Pair.create(null, clipData0);
        }
        return arrayList1 == null ? Pair.create(clipData0, null) : Pair.create(ContentInfoCompat.a(clipData0.getDescription(), arrayList0), ContentInfoCompat.a(clipData0.getDescription(), arrayList1));
    }

    @RequiresApi(0x1F)
    public static Pair i(ContentInfo contentInfo0, Predicate predicate0) {
        return Api31Impl.a(contentInfo0, predicate0);
    }

    public Pair j(androidx.core.util.Predicate predicate0) {
        ClipData clipData0 = this.a.d();
        ContentInfoCompat contentInfoCompat0 = null;
        if(clipData0.getItemCount() == 1) {
            boolean z = predicate0.test(clipData0.getItemAt(0));
            if(!z) {
                contentInfoCompat0 = this;
            }
            return Pair.create((z ? this : null), contentInfoCompat0);
        }
        Pair pair0 = ContentInfoCompat.h(clipData0, predicate0);
        if(pair0.first == null) {
            return Pair.create(null, this);
        }
        return pair0.second == null ? Pair.create(this, null) : Pair.create(new Builder(this).b(((ClipData)pair0.first)).a(), new Builder(this).b(((ClipData)pair0.second)).a());
    }

    @RestrictTo({Scope.c})
    static String k(int v) {
        switch(v) {
            case 0: {
                return "SOURCE_APP";
            }
            case 1: {
                return "SOURCE_CLIPBOARD";
            }
            case 2: {
                return "SOURCE_INPUT_METHOD";
            }
            case 3: {
                return "SOURCE_DRAG_AND_DROP";
            }
            case 4: {
                return "SOURCE_AUTOFILL";
            }
            case 5: {
                return "SOURCE_PROCESS_TEXT";
            }
            default: {
                return String.valueOf(v);
            }
        }
    }

    @RequiresApi(0x1F)
    public ContentInfo l() {
        ContentInfo contentInfo0 = this.a.P();
        Objects.requireNonNull(contentInfo0);
        return contentInfo0;
    }

    @RequiresApi(0x1F)
    public static ContentInfoCompat m(ContentInfo contentInfo0) {
        return new ContentInfoCompat(new Compat31Impl(contentInfo0));
    }

    @Override
    public String toString() {
        return this.a.toString();
    }
}

