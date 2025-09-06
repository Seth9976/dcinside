package androidx.activity.result.contract;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.PickVisualMediaRequest;
import androidx.annotation.CallSuper;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.J;
import kotlin.V;
import kotlin.c0;
import kotlin.collections.Y;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.r0;
import kotlin.ranges.s;
import y4.l;
import y4.m;
import z3.n;

public final class ActivityResultContracts {
    public static class CaptureVideo extends ActivityResultContract {
        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Intent a(Context context0, Object object0) {
            return this.d(context0, ((Uri)object0));
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public SynchronousResult b(Context context0, Object object0) {
            return this.e(context0, ((Uri)object0));
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Object c(int v, Intent intent0) {
            return this.f(v, intent0);
        }

        @CallSuper
        @l
        public Intent d(@l Context context0, @l Uri uri0) {
            L.p(context0, "context");
            L.p(uri0, "input");
            Intent intent0 = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", uri0);
            L.o(intent0, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return intent0;
        }

        @m
        public final SynchronousResult e(@l Context context0, @l Uri uri0) {
            L.p(context0, "context");
            L.p(uri0, "input");
            return null;
        }

        @l
        public final Boolean f(int v, @m Intent intent0) {
            return v == -1;
        }
    }

    @s0({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$CreateDocument\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,953:1\n1#2:954\n*E\n"})
    public static class CreateDocument extends ActivityResultContract {
        @l
        private final String a;

        @k(message = "Using a wildcard mime type with CreateDocument is not recommended as it breaks the automatic handling of file extensions. Instead, specify the mime type by using the constructor that takes an concrete mime type (e.g.., CreateDocument(\"image/png\")).", replaceWith = @c0(expression = "CreateDocument(\"todo/todo\")", imports = {}))
        public CreateDocument() {
            this("*/*");
        }

        public CreateDocument(@l String s) {
            L.p(s, "mimeType");
            super();
            this.a = s;
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Intent a(Context context0, Object object0) {
            return this.d(context0, ((String)object0));
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public SynchronousResult b(Context context0, Object object0) {
            return this.e(context0, ((String)object0));
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Object c(int v, Intent intent0) {
            return this.f(v, intent0);
        }

        @CallSuper
        @l
        public Intent d(@l Context context0, @l String s) {
            L.p(context0, "context");
            L.p(s, "input");
            Intent intent0 = new Intent("android.intent.action.CREATE_DOCUMENT").setType(this.a).putExtra("android.intent.extra.TITLE", s);
            L.o(intent0, "Intent(Intent.ACTION_CRE…ntent.EXTRA_TITLE, input)");
            return intent0;
        }

        @m
        public final SynchronousResult e(@l Context context0, @l String s) {
            L.p(context0, "context");
            L.p(s, "input");
            return null;
        }

        @m
        public final Uri f(int v, @m Intent intent0) {
            if(v != -1) {
                intent0 = null;
            }
            return intent0 == null ? null : intent0.getData();
        }
    }

    @s0({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$GetContent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,953:1\n1#2:954\n*E\n"})
    public static class GetContent extends ActivityResultContract {
        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Intent a(Context context0, Object object0) {
            return this.d(context0, ((String)object0));
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public SynchronousResult b(Context context0, Object object0) {
            return this.e(context0, ((String)object0));
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Object c(int v, Intent intent0) {
            return this.f(v, intent0);
        }

        @CallSuper
        @l
        public Intent d(@l Context context0, @l String s) {
            L.p(context0, "context");
            L.p(s, "input");
            Intent intent0 = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(s);
            L.o(intent0, "Intent(Intent.ACTION_GET…          .setType(input)");
            return intent0;
        }

        @m
        public final SynchronousResult e(@l Context context0, @l String s) {
            L.p(context0, "context");
            L.p(s, "input");
            return null;
        }

        @m
        public final Uri f(int v, @m Intent intent0) {
            if(v != -1) {
                intent0 = null;
            }
            return intent0 == null ? null : intent0.getData();
        }
    }

    public static class GetMultipleContents extends ActivityResultContract {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @l
            public final List a(@l Intent intent0) {
                L.p(intent0, "<this>");
                LinkedHashSet linkedHashSet0 = new LinkedHashSet();
                Uri uri0 = intent0.getData();
                if(uri0 != null) {
                    linkedHashSet0.add(uri0);
                }
                ClipData clipData0 = intent0.getClipData();
                if(clipData0 == null && linkedHashSet0.isEmpty()) {
                    return u.H();
                }
                if(clipData0 != null) {
                    int v = clipData0.getItemCount();
                    for(int v1 = 0; v1 < v; ++v1) {
                        Uri uri1 = clipData0.getItemAt(v1).getUri();
                        if(uri1 != null) {
                            linkedHashSet0.add(uri1);
                        }
                    }
                }
                return new ArrayList(linkedHashSet0);
            }
        }

        @l
        public static final Companion a;

        static {
            GetMultipleContents.a = new Companion(null);
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Intent a(Context context0, Object object0) {
            return this.d(context0, ((String)object0));
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public SynchronousResult b(Context context0, Object object0) {
            return this.e(context0, ((String)object0));
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Object c(int v, Intent intent0) {
            return this.f(v, intent0);
        }

        @CallSuper
        @l
        public Intent d(@l Context context0, @l String s) {
            L.p(context0, "context");
            L.p(s, "input");
            Intent intent0 = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(s).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            L.o(intent0, "Intent(Intent.ACTION_GET…TRA_ALLOW_MULTIPLE, true)");
            return intent0;
        }

        @m
        public final SynchronousResult e(@l Context context0, @l String s) {
            L.p(context0, "context");
            L.p(s, "input");
            return null;
        }

        @l
        public final List f(int v, @m Intent intent0) {
            if(v != -1) {
                intent0 = null;
            }
            if(intent0 != null) {
                List list0 = GetMultipleContents.a.a(intent0);
                return list0 == null ? u.H() : list0;
            }
            return u.H();
        }
    }

    @s0({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$OpenDocument\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,953:1\n1#2:954\n*E\n"})
    public static class OpenDocument extends ActivityResultContract {
        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Intent a(Context context0, Object object0) {
            return this.d(context0, ((String[])object0));
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public SynchronousResult b(Context context0, Object object0) {
            return this.e(context0, ((String[])object0));
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Object c(int v, Intent intent0) {
            return this.f(v, intent0);
        }

        @CallSuper
        @l
        public Intent d(@l Context context0, @l String[] arr_s) {
            L.p(context0, "context");
            L.p(arr_s, "input");
            Intent intent0 = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", arr_s).setType("*/*");
            L.o(intent0, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return intent0;
        }

        @m
        public final SynchronousResult e(@l Context context0, @l String[] arr_s) {
            L.p(context0, "context");
            L.p(arr_s, "input");
            return null;
        }

        @m
        public final Uri f(int v, @m Intent intent0) {
            if(v != -1) {
                intent0 = null;
            }
            return intent0 == null ? null : intent0.getData();
        }
    }

    @RequiresApi(21)
    @s0({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$OpenDocumentTree\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,953:1\n1#2:954\n*E\n"})
    public static class OpenDocumentTree extends ActivityResultContract {
        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Intent a(Context context0, Object object0) {
            return this.d(context0, ((Uri)object0));
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public SynchronousResult b(Context context0, Object object0) {
            return this.e(context0, ((Uri)object0));
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Object c(int v, Intent intent0) {
            return this.f(v, intent0);
        }

        @CallSuper
        @l
        public Intent d(@l Context context0, @m Uri uri0) {
            L.p(context0, "context");
            Intent intent0 = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            if(Build.VERSION.SDK_INT >= 26 && uri0 != null) {
                intent0.putExtra("android.provider.extra.INITIAL_URI", uri0);
            }
            return intent0;
        }

        @m
        public final SynchronousResult e(@l Context context0, @m Uri uri0) {
            L.p(context0, "context");
            return null;
        }

        @m
        public final Uri f(int v, @m Intent intent0) {
            if(v != -1) {
                intent0 = null;
            }
            return intent0 == null ? null : intent0.getData();
        }
    }

    public static class OpenMultipleDocuments extends ActivityResultContract {
        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Intent a(Context context0, Object object0) {
            return this.d(context0, ((String[])object0));
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public SynchronousResult b(Context context0, Object object0) {
            return this.e(context0, ((String[])object0));
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Object c(int v, Intent intent0) {
            return this.f(v, intent0);
        }

        @CallSuper
        @l
        public Intent d(@l Context context0, @l String[] arr_s) {
            L.p(context0, "context");
            L.p(arr_s, "input");
            Intent intent0 = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", arr_s).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
            L.o(intent0, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return intent0;
        }

        @m
        public final SynchronousResult e(@l Context context0, @l String[] arr_s) {
            L.p(context0, "context");
            L.p(arr_s, "input");
            return null;
        }

        @l
        public final List f(int v, @m Intent intent0) {
            if(v != -1) {
                intent0 = null;
            }
            if(intent0 != null) {
                List list0 = GetMultipleContents.a.a(intent0);
                return list0 == null ? u.H() : list0;
            }
            return u.H();
        }
    }

    @s0({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$PickContact\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,953:1\n1#2:954\n*E\n"})
    public static final class PickContact extends ActivityResultContract {
        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Intent a(Context context0, Object object0) {
            return this.d(context0, ((Void)object0));
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Object c(int v, Intent intent0) {
            return this.e(v, intent0);
        }

        @l
        public Intent d(@l Context context0, @m Void void0) {
            L.p(context0, "context");
            Intent intent0 = new Intent("android.intent.action.PICK").setType("vnd.android.cursor.dir/contact");
            L.o(intent0, "Intent(Intent.ACTION_PIC…ct.Contacts.CONTENT_TYPE)");
            return intent0;
        }

        @m
        public Uri e(int v, @m Intent intent0) {
            if(v != -1) {
                intent0 = null;
            }
            return intent0 == null ? null : intent0.getData();
        }
    }

    public static class PickMultipleVisualMedia extends ActivityResultContract {
        public static final class androidx.activity.result.contract.ActivityResultContracts.PickMultipleVisualMedia.Companion {
            private androidx.activity.result.contract.ActivityResultContracts.PickMultipleVisualMedia.Companion() {
            }

            public androidx.activity.result.contract.ActivityResultContracts.PickMultipleVisualMedia.Companion(w w0) {
            }

            // 去混淆评级： 低(20)
            @SuppressLint({"NewApi", "ClassVerificationFailure"})
            public final int a() {
                return PickVisualMedia.a.j() ? MediaStore.getPickImagesMaxLimit() : 0x7FFFFFFF;
            }
        }

        private final int a;
        @l
        public static final androidx.activity.result.contract.ActivityResultContracts.PickMultipleVisualMedia.Companion b;

        static {
            PickMultipleVisualMedia.b = new androidx.activity.result.contract.ActivityResultContracts.PickMultipleVisualMedia.Companion(null);
        }

        public PickMultipleVisualMedia() {
            this(0, 1, null);
        }

        public PickMultipleVisualMedia(int v) {
            this.a = v;
            if(v <= 1) {
                throw new IllegalArgumentException("Max items must be higher than 1");
            }
        }

        public PickMultipleVisualMedia(int v, int v1, w w0) {
            if((v1 & 1) != 0) {
                v = PickMultipleVisualMedia.b.a();
            }
            this(v);
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Intent a(Context context0, Object object0) {
            return this.d(context0, ((PickVisualMediaRequest)object0));
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public SynchronousResult b(Context context0, Object object0) {
            return this.e(context0, ((PickVisualMediaRequest)object0));
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Object c(int v, Intent intent0) {
            return this.f(v, intent0);
        }

        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        @CallSuper
        @l
        public Intent d(@l Context context0, @l PickVisualMediaRequest pickVisualMediaRequest0) {
            Intent intent0;
            L.p(context0, "context");
            L.p(pickVisualMediaRequest0, "input");
            androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion activityResultContracts$PickVisualMedia$Companion0 = PickVisualMedia.a;
            if(activityResultContracts$PickVisualMedia$Companion0.j()) {
                intent0 = new Intent("android.provider.action.PICK_IMAGES");
                intent0.setType(activityResultContracts$PickVisualMedia$Companion0.e(pickVisualMediaRequest0.a()));
                int v = MediaStore.getPickImagesMaxLimit();
                if(this.a > v) {
                    throw new IllegalArgumentException("Max items must be less or equals MediaStore.getPickImagesMaxLimit()");
                }
                intent0.putExtra("android.provider.extra.PICK_IMAGES_MAX", this.a);
                return intent0;
            }
            if(activityResultContracts$PickVisualMedia$Companion0.i(context0)) {
                ResolveInfo resolveInfo0 = activityResultContracts$PickVisualMedia$Companion0.d(context0);
                if(resolveInfo0 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ActivityInfo activityInfo0 = resolveInfo0.activityInfo;
                Intent intent1 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
                intent1.setClassName(activityInfo0.applicationInfo.packageName, activityInfo0.name);
                intent1.setType(activityResultContracts$PickVisualMedia$Companion0.e(pickVisualMediaRequest0.a()));
                intent1.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_MAX", this.a);
                return intent1;
            }
            if(activityResultContracts$PickVisualMedia$Companion0.f(context0)) {
                ResolveInfo resolveInfo1 = activityResultContracts$PickVisualMedia$Companion0.c(context0);
                if(resolveInfo1 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ActivityInfo activityInfo1 = resolveInfo1.activityInfo;
                Intent intent2 = new Intent("com.google.android.gms.provider.action.PICK_IMAGES");
                intent2.setClassName(activityInfo1.applicationInfo.packageName, activityInfo1.name);
                intent2.putExtra("com.google.android.gms.provider.extra.PICK_IMAGES_MAX", this.a);
                return intent2;
            }
            intent0 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent0.setType(activityResultContracts$PickVisualMedia$Companion0.e(pickVisualMediaRequest0.a()));
            intent0.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            if(intent0.getType() == null) {
                intent0.setType("*/*");
                intent0.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            }
            return intent0;
        }

        @m
        public final SynchronousResult e(@l Context context0, @l PickVisualMediaRequest pickVisualMediaRequest0) {
            L.p(context0, "context");
            L.p(pickVisualMediaRequest0, "input");
            return null;
        }

        @l
        public final List f(int v, @m Intent intent0) {
            if(v != -1) {
                intent0 = null;
            }
            if(intent0 != null) {
                List list0 = GetMultipleContents.a.a(intent0);
                return list0 == null ? u.H() : list0;
            }
            return u.H();
        }
    }

    @s0({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,953:1\n1#2:954\n*E\n"})
    public static class PickVisualMedia extends ActivityResultContract {
        public static final class androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion {
            private androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion() {
            }

            public androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion(w w0) {
            }

            public static void a() {
            }

            public static void b() {
            }

            @m
            @n
            public final ResolveInfo c(@l Context context0) {
                L.p(context0, "context");
                return context0.getPackageManager().resolveActivity(new Intent("com.google.android.gms.provider.action.PICK_IMAGES"), 0x110000);
            }

            @m
            @n
            public final ResolveInfo d(@l Context context0) {
                L.p(context0, "context");
                return context0.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 0x110000);
            }

            @m
            public final String e(@l VisualMediaType activityResultContracts$PickVisualMedia$VisualMediaType0) {
                L.p(activityResultContracts$PickVisualMedia$VisualMediaType0, "input");
                if(activityResultContracts$PickVisualMedia$VisualMediaType0 instanceof ImageOnly) {
                    return "image/*";
                }
                if(activityResultContracts$PickVisualMedia$VisualMediaType0 instanceof VideoOnly) {
                    return "video/*";
                }
                if(activityResultContracts$PickVisualMedia$VisualMediaType0 instanceof SingleMimeType) {
                    return ((SingleMimeType)activityResultContracts$PickVisualMedia$VisualMediaType0).a();
                }
                if(!(activityResultContracts$PickVisualMedia$VisualMediaType0 instanceof ImageAndVideo)) {
                    throw new J();
                }
                return null;
            }

            @n
            public final boolean f(@l Context context0) {
                L.p(context0, "context");
                return this.c(context0) != null;
            }

            @SuppressLint({"ClassVerificationFailure", "NewApi"})
            @k(message = "This method is deprecated in favor of isPhotoPickerAvailable(context) to support the picker provided by updatable system apps", replaceWith = @c0(expression = "isPhotoPickerAvailable(context)", imports = {}))
            @n
            public final boolean g() {
                return this.j();
            }

            @SuppressLint({"ClassVerificationFailure", "NewApi"})
            @n
            public final boolean h(@l Context context0) {
                L.p(context0, "context");
                return this.j() || this.i(context0) || this.f(context0);
            }

            @n
            public final boolean i(@l Context context0) {
                L.p(context0, "context");
                return this.d(context0) != null;
            }

            @SuppressLint({"ClassVerificationFailure", "NewApi"})
            @n
            public final boolean j() {
                return Build.VERSION.SDK_INT >= 33 || Build.VERSION.SDK_INT >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
            }
        }

        public static final class ImageAndVideo implements VisualMediaType {
            @l
            public static final ImageAndVideo a;

            static {
                ImageAndVideo.a = new ImageAndVideo();
            }
        }

        public static final class ImageOnly implements VisualMediaType {
            @l
            public static final ImageOnly a;

            static {
                ImageOnly.a = new ImageOnly();
            }
        }

        public static final class SingleMimeType implements VisualMediaType {
            @l
            private final String a;

            public SingleMimeType(@l String s) {
                L.p(s, "mimeType");
                super();
                this.a = s;
            }

            @l
            public final String a() {
                return this.a;
            }
        }

        public static final class VideoOnly implements VisualMediaType {
            @l
            public static final VideoOnly a;

            static {
                VideoOnly.a = new VideoOnly();
            }
        }

        public interface VisualMediaType {
        }

        @l
        public static final androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion a = null;
        @l
        public static final String b = "androidx.activity.result.contract.action.PICK_IMAGES";
        @l
        public static final String c = "androidx.activity.result.contract.extra.PICK_IMAGES_MAX";
        @l
        public static final String d = "com.google.android.gms.provider.action.PICK_IMAGES";
        @l
        public static final String e = "com.google.android.gms.provider.extra.PICK_IMAGES_MAX";

        static {
            PickVisualMedia.a = new androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion(null);
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Intent a(Context context0, Object object0) {
            return this.d(context0, ((PickVisualMediaRequest)object0));
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public SynchronousResult b(Context context0, Object object0) {
            return this.f(context0, ((PickVisualMediaRequest)object0));
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Object c(int v, Intent intent0) {
            return this.m(v, intent0);
        }

        @CallSuper
        @l
        public Intent d(@l Context context0, @l PickVisualMediaRequest pickVisualMediaRequest0) {
            Intent intent1;
            Intent intent0;
            L.p(context0, "context");
            L.p(pickVisualMediaRequest0, "input");
            androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion activityResultContracts$PickVisualMedia$Companion0 = PickVisualMedia.a;
            if(activityResultContracts$PickVisualMedia$Companion0.j()) {
                intent0 = new Intent("android.provider.action.PICK_IMAGES");
                intent0.setType(activityResultContracts$PickVisualMedia$Companion0.e(pickVisualMediaRequest0.a()));
                return intent0;
            }
            if(activityResultContracts$PickVisualMedia$Companion0.i(context0)) {
                ResolveInfo resolveInfo0 = activityResultContracts$PickVisualMedia$Companion0.d(context0);
                if(resolveInfo0 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ActivityInfo activityInfo0 = resolveInfo0.activityInfo;
                intent1 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
                intent1.setClassName(activityInfo0.applicationInfo.packageName, activityInfo0.name);
                intent1.setType(activityResultContracts$PickVisualMedia$Companion0.e(pickVisualMediaRequest0.a()));
                return intent1;
            }
            if(activityResultContracts$PickVisualMedia$Companion0.f(context0)) {
                ResolveInfo resolveInfo1 = activityResultContracts$PickVisualMedia$Companion0.c(context0);
                if(resolveInfo1 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ActivityInfo activityInfo1 = resolveInfo1.activityInfo;
                intent1 = new Intent("com.google.android.gms.provider.action.PICK_IMAGES");
                intent1.setClassName(activityInfo1.applicationInfo.packageName, activityInfo1.name);
                intent1.setType(activityResultContracts$PickVisualMedia$Companion0.e(pickVisualMediaRequest0.a()));
                return intent1;
            }
            intent0 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent0.setType(activityResultContracts$PickVisualMedia$Companion0.e(pickVisualMediaRequest0.a()));
            if(intent0.getType() == null) {
                intent0.setType("*/*");
                intent0.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            }
            return intent0;
        }

        @m
        @n
        public static final ResolveInfo e(@l Context context0) {
            return PickVisualMedia.a.c(context0);
        }

        @m
        public final SynchronousResult f(@l Context context0, @l PickVisualMediaRequest pickVisualMediaRequest0) {
            L.p(context0, "context");
            L.p(pickVisualMediaRequest0, "input");
            return null;
        }

        @m
        @n
        public static final ResolveInfo g(@l Context context0) {
            return PickVisualMedia.a.d(context0);
        }

        @n
        public static final boolean h(@l Context context0) {
            return PickVisualMedia.a.f(context0);
        }

        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        @k(message = "This method is deprecated in favor of isPhotoPickerAvailable(context) to support the picker provided by updatable system apps", replaceWith = @c0(expression = "isPhotoPickerAvailable(context)", imports = {}))
        @n
        public static final boolean i() {
            return PickVisualMedia.a.g();
        }

        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        @n
        public static final boolean j(@l Context context0) {
            return PickVisualMedia.a.h(context0);
        }

        @n
        public static final boolean k(@l Context context0) {
            return PickVisualMedia.a.i(context0);
        }

        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        @n
        public static final boolean l() {
            return PickVisualMedia.a.j();
        }

        @m
        public final Uri m(int v, @m Intent intent0) {
            if(v != -1) {
                intent0 = null;
            }
            if(intent0 != null) {
                Uri uri0 = intent0.getData();
                return uri0 == null ? ((Uri)u.G2(GetMultipleContents.a.a(intent0))) : uri0;
            }
            return null;
        }
    }

    @s0({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,953:1\n12541#2,2:954\n8676#2,2:956\n9358#2,4:958\n11365#2:962\n11700#2,3:963\n*S KotlinDebug\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions\n*L\n189#1:954,2\n196#1:956,2\n196#1:958,4\n209#1:962\n209#1:963,3\n*E\n"})
    public static final class RequestMultiplePermissions extends ActivityResultContract {
        public static final class androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions.Companion {
            private androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions.Companion() {
            }

            public androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions.Companion(w w0) {
            }

            @l
            public final Intent a(@l String[] arr_s) {
                L.p(arr_s, "input");
                Intent intent0 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", arr_s);
                L.o(intent0, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return intent0;
            }
        }

        @l
        public static final androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions.Companion a = null;
        @l
        public static final String b = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS";
        @l
        public static final String c = "androidx.activity.result.contract.extra.PERMISSIONS";
        @l
        public static final String d = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS";

        static {
            RequestMultiplePermissions.a = new androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions.Companion(null);
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Intent a(Context context0, Object object0) {
            return this.d(context0, ((String[])object0));
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public SynchronousResult b(Context context0, Object object0) {
            return this.e(context0, ((String[])object0));
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Object c(int v, Intent intent0) {
            return this.f(v, intent0);
        }

        @l
        public Intent d(@l Context context0, @l String[] arr_s) {
            L.p(context0, "context");
            L.p(arr_s, "input");
            return RequestMultiplePermissions.a.a(arr_s);
        }

        @m
        public SynchronousResult e(@l Context context0, @l String[] arr_s) {
            L.p(context0, "context");
            L.p(arr_s, "input");
            if(arr_s.length == 0) {
                return new SynchronousResult(Y.z());
            }
            int v1 = 0;
            while(v1 < arr_s.length) {
                if(ContextCompat.checkSelfPermission(context0, arr_s[v1]) == 0) {
                    ++v1;
                    continue;
                }
                return null;
            }
            LinkedHashMap linkedHashMap0 = new LinkedHashMap(s.u(Y.j(arr_s.length), 16));
            for(int v = 0; v < arr_s.length; ++v) {
                V v2 = r0.a(arr_s[v], Boolean.TRUE);
                linkedHashMap0.put(v2.e(), v2.f());
            }
            return new SynchronousResult(linkedHashMap0);
        }

        @l
        public Map f(int v, @m Intent intent0) {
            if(v != -1) {
                return Y.z();
            }
            if(intent0 == null) {
                return Y.z();
            }
            String[] arr_s = intent0.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] arr_v = intent0.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if(arr_v != null && arr_s != null) {
                ArrayList arrayList0 = new ArrayList(arr_v.length);
                for(int v1 = 0; v1 < arr_v.length; ++v1) {
                    arrayList0.add(Boolean.valueOf(arr_v[v1] == 0));
                }
                return Y.B0(u.i6(kotlin.collections.l.Ta(arr_s), arrayList0));
            }
            return Y.z();
        }
    }

    @s0({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestPermission\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,953:1\n12774#2,2:954\n*S KotlinDebug\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestPermission\n*L\n229#1:954,2\n*E\n"})
    public static final class RequestPermission extends ActivityResultContract {
        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Intent a(Context context0, Object object0) {
            return this.d(context0, ((String)object0));
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public SynchronousResult b(Context context0, Object object0) {
            return this.e(context0, ((String)object0));
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Object c(int v, Intent intent0) {
            return this.f(v, intent0);
        }

        @l
        public Intent d(@l Context context0, @l String s) {
            L.p(context0, "context");
            L.p(s, "input");
            return RequestMultiplePermissions.a.a(new String[]{s});
        }

        @m
        public SynchronousResult e(@l Context context0, @l String s) {
            L.p(context0, "context");
            L.p(s, "input");
            return ContextCompat.checkSelfPermission(context0, s) == 0 ? new SynchronousResult(Boolean.TRUE) : null;
        }

        @l
        public Boolean f(int v, @m Intent intent0) {
            if(intent0 != null && v == -1) {
                int[] arr_v = intent0.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if(arr_v != null) {
                    for(int v1 = 0; v1 < arr_v.length; ++v1) {
                        if(arr_v[v1] == 0) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return false;
        }
    }

    public static final class StartActivityForResult extends ActivityResultContract {
        public static final class androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult.Companion {
            private androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult.Companion() {
            }

            public androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult.Companion(w w0) {
            }
        }

        @l
        public static final androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult.Companion a = null;
        @l
        public static final String b = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE";

        static {
            StartActivityForResult.a = new androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult.Companion(null);
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Intent a(Context context0, Object object0) {
            return this.d(context0, ((Intent)object0));
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Object c(int v, Intent intent0) {
            return this.e(v, intent0);
        }

        @l
        public Intent d(@l Context context0, @l Intent intent0) {
            L.p(context0, "context");
            L.p(intent0, "input");
            return intent0;
        }

        @l
        public ActivityResult e(int v, @m Intent intent0) {
            return new ActivityResult(v, intent0);
        }
    }

    public static final class StartIntentSenderForResult extends ActivityResultContract {
        public static final class androidx.activity.result.contract.ActivityResultContracts.StartIntentSenderForResult.Companion {
            private androidx.activity.result.contract.ActivityResultContracts.StartIntentSenderForResult.Companion() {
            }

            public androidx.activity.result.contract.ActivityResultContracts.StartIntentSenderForResult.Companion(w w0) {
            }
        }

        @l
        public static final androidx.activity.result.contract.ActivityResultContracts.StartIntentSenderForResult.Companion a = null;
        @l
        public static final String b = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST";
        @l
        public static final String c = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST";
        @l
        public static final String d = "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION";

        static {
            StartIntentSenderForResult.a = new androidx.activity.result.contract.ActivityResultContracts.StartIntentSenderForResult.Companion(null);
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Intent a(Context context0, Object object0) {
            return this.d(context0, ((IntentSenderRequest)object0));
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Object c(int v, Intent intent0) {
            return this.e(v, intent0);
        }

        @l
        public Intent d(@l Context context0, @l IntentSenderRequest intentSenderRequest0) {
            L.p(context0, "context");
            L.p(intentSenderRequest0, "input");
            Intent intent0 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest0);
            L.o(intent0, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
            return intent0;
        }

        @l
        public ActivityResult e(int v, @m Intent intent0) {
            return new ActivityResult(v, intent0);
        }
    }

    public static class TakePicture extends ActivityResultContract {
        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Intent a(Context context0, Object object0) {
            return this.d(context0, ((Uri)object0));
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public SynchronousResult b(Context context0, Object object0) {
            return this.e(context0, ((Uri)object0));
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Object c(int v, Intent intent0) {
            return this.f(v, intent0);
        }

        @CallSuper
        @l
        public Intent d(@l Context context0, @l Uri uri0) {
            L.p(context0, "context");
            L.p(uri0, "input");
            Intent intent0 = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", uri0);
            L.o(intent0, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return intent0;
        }

        @m
        public final SynchronousResult e(@l Context context0, @l Uri uri0) {
            L.p(context0, "context");
            L.p(uri0, "input");
            return null;
        }

        @l
        public final Boolean f(int v, @m Intent intent0) {
            return v == -1;
        }
    }

    @s0({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$TakePicturePreview\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,953:1\n1#2:954\n*E\n"})
    public static class TakePicturePreview extends ActivityResultContract {
        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Intent a(Context context0, Object object0) {
            return this.d(context0, ((Void)object0));
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public SynchronousResult b(Context context0, Object object0) {
            return this.e(context0, ((Void)object0));
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Object c(int v, Intent intent0) {
            return this.f(v, intent0);
        }

        @CallSuper
        @l
        public Intent d(@l Context context0, @m Void void0) {
            L.p(context0, "context");
            return new Intent("android.media.action.IMAGE_CAPTURE");
        }

        @m
        public final SynchronousResult e(@l Context context0, @m Void void0) {
            L.p(context0, "context");
            return null;
        }

        @m
        public final Bitmap f(int v, @m Intent intent0) {
            if(v != -1) {
                intent0 = null;
            }
            return intent0 == null ? null : ((Bitmap)intent0.getParcelableExtra("data"));
        }
    }

    @s0({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$TakeVideo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,953:1\n1#2:954\n*E\n"})
    @k(message = "The thumbnail bitmap is rarely returned and is not a good signal to determine\n      whether the video was actually successfully captured. Use {@link CaptureVideo} instead.")
    public static class TakeVideo extends ActivityResultContract {
        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Intent a(Context context0, Object object0) {
            return this.d(context0, ((Uri)object0));
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public SynchronousResult b(Context context0, Object object0) {
            return this.e(context0, ((Uri)object0));
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        public Object c(int v, Intent intent0) {
            return this.f(v, intent0);
        }

        @CallSuper
        @l
        public Intent d(@l Context context0, @l Uri uri0) {
            L.p(context0, "context");
            L.p(uri0, "input");
            Intent intent0 = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", uri0);
            L.o(intent0, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return intent0;
        }

        @m
        public final SynchronousResult e(@l Context context0, @l Uri uri0) {
            L.p(context0, "context");
            L.p(uri0, "input");
            return null;
        }

        @m
        public final Bitmap f(int v, @m Intent intent0) {
            if(v != -1) {
                intent0 = null;
            }
            return intent0 == null ? null : ((Bitmap)intent0.getParcelableExtra("data"));
        }
    }

}

