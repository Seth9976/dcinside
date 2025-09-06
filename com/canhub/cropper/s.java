package com.canhub.cropper;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager.PackageInfoFlags;
import android.content.pm.PackageManager.ResolveInfoFlags;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.provider.MediaStore.Images.Media;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import y4.l;
import y4.m;

@s0({"SMAP\nCropImageIntentChooser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CropImageIntentChooser.kt\ncom/canhub/cropper/CropImageIntentChooser\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,242:1\n37#2,2:243\n295#3,2:245\n12511#4,2:247\n*S KotlinDebug\n*F\n+ 1 CropImageIntentChooser.kt\ncom/canhub/cropper/CropImageIntentChooser\n*L\n106#1:243,2\n174#1:245,2\n210#1:247,2\n*E\n"})
public final class s {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    public interface b {
        void a(@m Uri arg1);

        void b();
    }

    @l
    private final ComponentActivity a;
    @l
    private final b b;
    @l
    private String c;
    @l
    private List d;
    @m
    private Uri e;
    @l
    private final ActivityResultLauncher f;
    @l
    public static final a g = null;
    @l
    public static final String h = "com.google.android.apps.photos";
    @l
    public static final String i = "com.google.android.apps.photosgo";
    @l
    public static final String j = "com.sec.android.gallery3d";
    @l
    public static final String k = "com.oneplus.gallery";
    @l
    public static final String l = "com.miui.gallery";

    static {
        s.g = new a(null);
    }

    public s(@l ComponentActivity componentActivity0, @l b s$b0) {
        L.p(componentActivity0, "activity");
        L.p(s$b0, "callback");
        super();
        this.a = componentActivity0;
        this.b = s$b0;
        String s = componentActivity0.getString(string.pick_image_chooser_title);
        L.o(s, "getString(...)");
        this.c = s;
        this.d = u.O(new String[]{"com.google.android.apps.photos", "com.google.android.apps.photosgo", "com.sec.android.gallery3d", "com.oneplus.gallery", "com.miui.gallery"});
        this.f = componentActivity0.registerForActivityResult(new StartActivityForResult(), (ActivityResult activityResult0) -> {
            Uri uri0;
            L.p(this, "this$0");
            L.p(activityResult0, "activityRes");
            if(activityResult0.c() == -1) {
                Intent intent0 = activityResult0.a();
                if(intent0 == null) {
                    uri0 = this.e;
                }
                else {
                    uri0 = intent0.getData();
                    if(uri0 == null) {
                        uri0 = this.e;
                    }
                }
                this.b.a(uri0);
                return;
            }
            this.b.b();
        });
    }

    private final List b(Context context0, PackageManager packageManager0) {
        List list0 = new ArrayList();
        Intent intent0 = new Intent("android.media.action.IMAGE_CAPTURE");
        List list1 = Build.VERSION.SDK_INT < 33 ? packageManager0.queryIntentActivities(intent0, 0) : packageManager0.queryIntentActivities(intent0, PackageManager.ResolveInfoFlags.of(0L));
        L.m(list1);
        for(Object object0: list1) {
            ResolveInfo resolveInfo0 = (ResolveInfo)object0;
            Intent intent1 = new Intent(intent0);
            intent1.setComponent(new ComponentName(resolveInfo0.activityInfo.packageName, resolveInfo0.activityInfo.name));
            intent1.setPackage(resolveInfo0.activityInfo.packageName);
            if(context0 instanceof Activity) {
                ((Activity)context0).grantUriPermission(resolveInfo0.activityInfo.packageName, this.e, 3);
            }
            intent1.putExtra("output", this.e);
            list0.add(intent1);
        }
        return list0;
    }

    private final List c(PackageManager packageManager0, String s) {
        List list0 = new ArrayList();
        Intent intent0 = L.g(s, "android.intent.action.GET_CONTENT") ? new Intent(s) : new Intent(s, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        intent0.setType("image/*");
        List list1 = Build.VERSION.SDK_INT < 33 ? packageManager0.queryIntentActivities(intent0, 0) : packageManager0.queryIntentActivities(intent0, PackageManager.ResolveInfoFlags.of(0L));
        L.m(list1);
        for(Object object0: list1) {
            Intent intent1 = new Intent(intent0);
            intent1.setComponent(new ComponentName(((ResolveInfo)object0).activityInfo.packageName, ((ResolveInfo)object0).activityInfo.name));
            intent1.setPackage(((ResolveInfo)object0).activityInfo.packageName);
            list0.add(intent1);
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: this.d) {
            String s1 = (String)object1;
            for(Object object2: list0) {
                if(!L.g(((Intent)object2).getPackage(), s1)) {
                    continue;
                }
                goto label_24;
            }
            object2 = null;
        label_24:
            if(((Intent)object2) != null) {
                list0.remove(((Intent)object2));
                arrayList0.add(((Intent)object2));
            }
        }
        list0.addAll(0, arrayList0);
        return list0;
    }

    private final boolean d(Context context0) {
        try {
            String[] arr_s = (Build.VERSION.SDK_INT < 33 ? context0.getPackageManager().getPackageInfo("com.dcinside.app.android", 0x1000) : context0.getPackageManager().getPackageInfo("com.dcinside.app.android", PackageManager.PackageInfoFlags.of(0x1000L))).requestedPermissions;
            if(arr_s == null) {
                return false;
            }
            for(int v = 0; true; ++v) {
                if(v >= arr_s.length) {
                    return false;
                }
                String s = arr_s[v];
                if(s != null && v.O1(s, "android.permission.CAMERA", true)) {
                    return true;
                }
            }
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
        }
        packageManager$NameNotFoundException0.printStackTrace();
        return false;
    }

    // 检测为 Lambda 实现
    private static final void e(s s0, ActivityResult activityResult0) [...]

    private final boolean f(Context context0) {
        return Build.VERSION.SDK_INT >= 23 && this.d(context0) && context0.checkSelfPermission("android.permission.CAMERA") != 0;
    }

    @l
    public final s g(@l String s) {
        L.p(s, "title");
        this.c = s;
        return this;
    }

    @l
    public final s h(@l List list0) {
        L.p(list0, "appsList");
        this.d = list0;
        return this;
    }

    public final void i(boolean z, boolean z1, @m Uri uri0) {
        Intent intent0;
        this.e = uri0;
        ArrayList arrayList0 = new ArrayList();
        PackageManager packageManager0 = this.a.getPackageManager();
        if(!this.f(this.a) && z) {
            L.m(packageManager0);
            arrayList0.addAll(this.b(this.a, packageManager0));
        }
        if(z1) {
            L.m(packageManager0);
            List list0 = this.c(packageManager0, "android.intent.action.GET_CONTENT");
            if(list0.isEmpty()) {
                list0 = this.c(packageManager0, "android.intent.action.PICK");
            }
            arrayList0.addAll(list0);
        }
        if(arrayList0.isEmpty()) {
            intent0 = new Intent();
        }
        else {
            Intent intent1 = new Intent("android.intent.action.CHOOSER", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            if(z1) {
                intent1.setAction("android.intent.action.PICK");
                intent1.setType("image/*");
            }
            intent0 = intent1;
        }
        Intent intent2 = Intent.createChooser(intent0, this.c);
        intent2.putExtra("android.intent.extra.INITIAL_INTENTS", ((Parcelable[])arrayList0.toArray(new Parcelable[0])));
        L.m(intent2);
        this.f.b(intent2);
    }

    public static void j(s s0, boolean z, boolean z1, Uri uri0, int v, Object object0) {
        if((v & 4) != 0) {
            uri0 = null;
        }
        s0.i(z, z1, uri0);
    }
}

