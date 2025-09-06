package com.canhub.cropper;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts.GetContent;
import androidx.activity.result.contract.ActivityResultContracts.TakePicture;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.BlendModeColorFilterCompat;
import androidx.core.graphics.BlendModeCompat;
import java.io.File;
import java.util.List;
import kotlin.J;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.enums.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.text.v;
import y4.l;
import y4.m;

@s0({"SMAP\nCropImageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CropImageActivity.kt\ncom/canhub/cropper/CropImageActivity\n+ 2 ParcelableUtils.kt\ncom/canhub/cropper/ParcelableUtilsKt\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,488:1\n7#2,5:489\n7#2,5:494\n29#3:499\n1#4:500\n*S KotlinDebug\n*F\n+ 1 CropImageActivity.kt\ncom/canhub/cropper/CropImageActivity\n*L\n73#1:489,5\n75#1:494,5\n94#1:499\n*E\n"})
@k(message = "\n  Create your own Activity and use the CropImageView directly.\n  This way you can customize everything and have utter control of everything.\n  Feel free to use this Activity Code to create your own Activity.\n")
public class CropImageActivity extends AppCompatActivity implements f, j {
    static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    public static enum b {
        CAMERA,
        GALLERY;

        private static final b[] c;
        private static final kotlin.enums.a d;

        static {
            b.c = arr_cropImageActivity$b;
            L.p(arr_cropImageActivity$b, "entries");
            b.d = new d(arr_cropImageActivity$b);
        }

        private static final b[] a() [...] // Inlined contents

        @l
        public static kotlin.enums.a b() {
            return b.d;
        }
    }

    public final class c {
        public static final int[] a;

        static {
            int[] arr_v = new int[b.values().length];
            try {
                arr_v[b.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[b.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            c.a = arr_v;
        }
    }

    @m
    private Uri i;
    private CropImageOptions j;
    @m
    private CropImageView k;
    private H.a l;
    @m
    private Uri m;
    @l
    private final ActivityResultLauncher n;
    @l
    private final ActivityResultLauncher o;
    @l
    private static final a p = null;
    @Deprecated
    @l
    public static final String q = "bundle_key_tmp_uri";

    static {
        CropImageActivity.p = new a(null);
    }

    public CropImageActivity() {
        this.n = this.registerForActivityResult(new GetContent(), (Uri uri0) -> {
            L.p(this, "this$0");
            this.l1(uri0);
        });
        this.o = this.registerForActivityResult(new TakePicture(), (/* 缺少LAMBDA参数 */) -> {
            L.p(this, "this$0");
            if(((Boolean)object0).booleanValue()) {
                this.l1(this.m);
                return;
            }
            this.l1(null);
        });
    }

    public void A1(@l Menu menu0, int v, int v1) {
        L.p(menu0, "menu");
        MenuItem menuItem0 = menu0.findItem(v);
        if(menuItem0 == null) {
            return;
        }
        CharSequence charSequence0 = menuItem0.getTitle();
        if(charSequence0 != null && !v.x3(charSequence0) == 1) {
            try {
                SpannableString spannableString0 = new SpannableString(charSequence0);
                spannableString0.setSpan(new ForegroundColorSpan(v1), 0, spannableString0.length(), 33);
                menuItem0.setTitle(spannableString0);
            }
            catch(Exception exception0) {
                Log.w("AIC", "Failed to update menu item color", exception0);
            }
        }
    }

    public void h1() {
        CropImageOptions cropImageOptions0 = this.j;
        CropImageOptions cropImageOptions1 = null;
        if(cropImageOptions0 == null) {
            L.S("cropImageOptions");
            cropImageOptions0 = null;
        }
        if(cropImageOptions0.N8) {
            this.s1(null, null, 1);
            return;
        }
        CropImageView cropImageView0 = this.k;
        if(cropImageView0 != null) {
            CropImageOptions cropImageOptions2 = this.j;
            if(cropImageOptions2 == null) {
                L.S("cropImageOptions");
                cropImageOptions2 = null;
            }
            Bitmap.CompressFormat bitmap$CompressFormat0 = cropImageOptions2.Q;
            CropImageOptions cropImageOptions3 = this.j;
            if(cropImageOptions3 == null) {
                L.S("cropImageOptions");
                cropImageOptions3 = null;
            }
            int v = cropImageOptions3.X;
            CropImageOptions cropImageOptions4 = this.j;
            if(cropImageOptions4 == null) {
                L.S("cropImageOptions");
                cropImageOptions4 = null;
            }
            int v1 = cropImageOptions4.Y;
            CropImageOptions cropImageOptions5 = this.j;
            if(cropImageOptions5 == null) {
                L.S("cropImageOptions");
                cropImageOptions5 = null;
            }
            int v2 = cropImageOptions5.Z;
            CropImageOptions cropImageOptions6 = this.j;
            if(cropImageOptions6 == null) {
                L.S("cropImageOptions");
                cropImageOptions6 = null;
            }
            com.canhub.cropper.CropImageView.k cropImageView$k0 = cropImageOptions6.M8;
            CropImageOptions cropImageOptions7 = this.j;
            if(cropImageOptions7 == null) {
                L.S("cropImageOptions");
            }
            else {
                cropImageOptions1 = cropImageOptions7;
            }
            cropImageView0.h(bitmap$CompressFormat0, v, v1, v2, cropImageView$k0, cropImageOptions1.P);
        }
    }

    @l
    public Intent i1(@m Uri uri0, @m Exception exception0, int v) {
        ActivityResult cropImage$ActivityResult0 = new ActivityResult((this.k == null ? null : this.k.getImageUri()), uri0, exception0, (this.k == null ? null : this.k.getCropPoints()), (this.k == null ? null : this.k.getCropRect()), (this.k == null ? 0 : this.k.getRotatedDegrees()), (this.k == null ? null : this.k.getWholeImageRect()), v);
        Intent intent0 = new Intent();
        Bundle bundle0 = intent0.getExtras();
        if(bundle0 != null) {
            intent0.putExtras(bundle0);
        }
        intent0.putExtra("CROP_IMAGE_EXTRA_RESULT", cropImage$ActivityResult0);
        return intent0;
    }

    private final Uri j1() {
        File file0 = File.createTempFile("tmp_image_file", ".png", this.getCacheDir());
        file0.createNewFile();
        file0.deleteOnExit();
        L.m(file0);
        return I.d.b(this, file0);
    }

    // 检测为 Lambda 实现
    private static final S0 k1(CropImageActivity cropImageActivity0, OnBackPressedCallback onBackPressedCallback0) [...]

    protected void l1(@m Uri uri0) {
        if(uri0 == null) {
            this.t1();
            return;
        }
        this.i = uri0;
        CropImageView cropImageView0 = this.k;
        if(cropImageView0 != null) {
            cropImageView0.setImageUriAsync(uri0);
        }
    }

    private final void m1() {
        Uri uri0 = this.j1();
        this.m = uri0;
        this.o.b(uri0);
    }

    private final void n1(b cropImageActivity$b0) {
        switch(cropImageActivity$b0) {
            case 1: {
                this.m1();
                return;
            }
            case 2: {
                this.n.b("image/*");
                return;
            }
            default: {
                throw new J();
            }
        }
    }

    // 检测为 Lambda 实现
    private static final void o1(CropImageActivity cropImageActivity0, Uri uri0) [...]

    @Override  // androidx.fragment.app.FragmentActivity
    public void onCreate(@m Bundle bundle0) {
        final class com.canhub.cropper.CropImageActivity.d extends H implements Function1 {
            com.canhub.cropper.CropImageActivity.d(Object object0) {
                super(1, object0, CropImageActivity.class, "openSource", "openSource(Lcom/canhub/cropper/CropImageActivity$Source;)V", 0);
            }

            public final void a(b cropImageActivity$b0) {
                L.p(cropImageActivity$b0, "p0");
                ((CropImageActivity)this.receiver).n1(cropImageActivity$b0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((b)object0));
                return S0.a;
            }
        }

        CropImageOptions cropImageOptions0;
        Uri uri1;
        super.onCreate(bundle0);
        H.a a0 = H.a.c(this.getLayoutInflater());
        this.l = a0;
        Uri uri0 = null;
        if(a0 == null) {
            L.S("binding");
            a0 = null;
        }
        this.setContentView(a0.b());
        H.a a1 = this.l;
        if(a1 == null) {
            L.S("binding");
            a1 = null;
        }
        L.o(a1.b, "cropImageView");
        this.q1(a1.b);
        Bundle bundle1 = this.getIntent().getBundleExtra("CROP_IMAGE_EXTRA_BUNDLE");
        if(bundle1 == null) {
            uri1 = null;
        }
        else {
            Parcelable parcelable0 = bundle1.getParcelable("CROP_IMAGE_EXTRA_SOURCE");
            if(!(parcelable0 instanceof Uri)) {
                parcelable0 = null;
            }
            uri1 = (Uri)parcelable0;
        }
        this.i = uri1;
        if(bundle1 == null) {
            cropImageOptions0 = new CropImageOptions(false, false, null, null, 0.0f, 0.0f, 0.0f, null, null, false, false, false, 0, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, -1, -1, 0x3F, null);
        }
        else {
            Parcelable parcelable1 = bundle1.getParcelable("CROP_IMAGE_EXTRA_OPTIONS");
            if(!(parcelable1 instanceof CropImageOptions)) {
                parcelable1 = null;
            }
            cropImageOptions0 = (CropImageOptions)parcelable1;
            if(cropImageOptions0 == null) {
                cropImageOptions0 = new CropImageOptions(false, false, null, null, 0.0f, 0.0f, 0.0f, null, null, false, false, false, 0, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, -1, -1, 0x3F, null);
            }
        }
        this.j = cropImageOptions0;
        if(bundle0 != null) {
            String s = bundle0.getString("bundle_key_tmp_uri");
            if(s != null) {
                uri0 = Uri.parse(s);
            }
            this.m = uri0;
        }
        else if(this.i != null && !L.g(this.i, Uri.EMPTY)) {
            CropImageView cropImageView0 = this.k;
            if(cropImageView0 != null) {
                cropImageView0.setImageUriAsync(this.i);
            }
        }
        else {
            CropImageOptions cropImageOptions1 = this.j;
            if(cropImageOptions1 == null) {
                L.S("cropImageOptions");
                cropImageOptions1 = null;
            }
            if(cropImageOptions1.Z8) {
                this.x1();
            }
            else {
                CropImageOptions cropImageOptions2 = this.j;
                if(cropImageOptions2 == null) {
                    L.S("cropImageOptions");
                    cropImageOptions2 = null;
                }
                if(cropImageOptions2.a) {
                    CropImageOptions cropImageOptions3 = this.j;
                    if(cropImageOptions3 == null) {
                        L.S("cropImageOptions");
                        cropImageOptions3 = null;
                    }
                    if(cropImageOptions3.b) {
                        this.u1(new com.canhub.cropper.CropImageActivity.d(this));
                        this.r1();
                        OnBackPressedDispatcherKt.b(this.getOnBackPressedDispatcher(), null, false, (OnBackPressedCallback onBackPressedCallback0) -> {
                            L.p(this, "this$0");
                            L.p(onBackPressedCallback0, "$this$addCallback");
                            this.t1();
                            return S0.a;
                        }, 3, null);
                        return;
                    }
                    goto label_58;
                }
                else {
                label_58:
                    CropImageOptions cropImageOptions4 = this.j;
                    if(cropImageOptions4 == null) {
                        L.S("cropImageOptions");
                        cropImageOptions4 = null;
                    }
                    if(cropImageOptions4.a) {
                        this.n.b("image/*");
                    }
                    else {
                        CropImageOptions cropImageOptions5 = this.j;
                        if(cropImageOptions5 == null) {
                            L.S("cropImageOptions");
                        }
                        else {
                            uri0 = cropImageOptions5;
                        }
                        if(uri0.b) {
                            this.m1();
                        }
                        else {
                            this.finish();
                        }
                    }
                }
            }
        }
        this.r1();
        OnBackPressedDispatcherKt.b(this.getOnBackPressedDispatcher(), null, false, (OnBackPressedCallback onBackPressedCallback0) -> {
            L.p(this, "this$0");
            L.p(onBackPressedCallback0, "$this$addCallback");
            this.t1();
            return S0.a;
        }, 3, null);
    }

    @Override  // android.app.Activity
    public boolean onCreateOptionsMenu(@l Menu menu0) {
        Drawable drawable1;
        Drawable drawable0;
        L.p(menu0, "menu");
        CropImageOptions cropImageOptions0 = this.j;
        CropImageOptions cropImageOptions1 = null;
        if(cropImageOptions0 == null) {
            L.S("cropImageOptions");
            cropImageOptions0 = null;
        }
        if(cropImageOptions0.Y8) {
            return true;
        }
        this.getMenuInflater().inflate(menu.crop_image_menu, menu0);
        CropImageOptions cropImageOptions2 = this.j;
        if(cropImageOptions2 == null) {
            L.S("cropImageOptions");
            cropImageOptions2 = null;
        }
        if(cropImageOptions2.Q8) {
            CropImageOptions cropImageOptions3 = this.j;
            if(cropImageOptions3 == null) {
                L.S("cropImageOptions");
                cropImageOptions3 = null;
            }
            if(cropImageOptions3.S8) {
                menu0.findItem(id.ic_rotate_left_24).setVisible(true);
            }
        }
        else {
            menu0.removeItem(id.ic_rotate_left_24);
            menu0.removeItem(id.ic_rotate_right_24);
        }
        CropImageOptions cropImageOptions4 = this.j;
        if(cropImageOptions4 == null) {
            L.S("cropImageOptions");
            cropImageOptions4 = null;
        }
        if(!cropImageOptions4.R8) {
            menu0.removeItem(id.ic_flip_24);
        }
        CropImageOptions cropImageOptions5 = this.j;
        if(cropImageOptions5 == null) {
            L.S("cropImageOptions");
            cropImageOptions5 = null;
        }
        if(cropImageOptions5.W8 != null) {
            MenuItem menuItem0 = menu0.findItem(id.crop_image_menu_crop);
            CropImageOptions cropImageOptions6 = this.j;
            if(cropImageOptions6 == null) {
                L.S("cropImageOptions");
                cropImageOptions6 = null;
            }
            menuItem0.setTitle(cropImageOptions6.W8);
        }
        try {
            CropImageOptions cropImageOptions7 = this.j;
            if(cropImageOptions7 == null) {
                L.S("cropImageOptions");
                cropImageOptions7 = null;
            }
            if(cropImageOptions7.X8 == 0) {
                drawable0 = null;
            }
            else {
                CropImageOptions cropImageOptions8 = this.j;
                if(cropImageOptions8 == null) {
                    L.S("cropImageOptions");
                    cropImageOptions8 = null;
                }
                drawable0 = ContextCompat.getDrawable(this, cropImageOptions8.X8);
                try {
                    menu0.findItem(id.crop_image_menu_crop).setIcon(drawable0);
                }
                catch(Exception exception1) {
                    drawable1 = drawable0;
                    exception0 = exception1;
                    goto label_60;
                }
            }
            goto label_62;
        }
        catch(Exception exception0) {
            drawable1 = null;
        }
    label_60:
        Log.w("AIC", "Failed to read menu crop drawable", exception0);
        drawable0 = drawable1;
    label_62:
        CropImageOptions cropImageOptions9 = this.j;
        if(cropImageOptions9 == null) {
            L.S("cropImageOptions");
            cropImageOptions9 = null;
        }
        if(cropImageOptions9.N != 0) {
            CropImageOptions cropImageOptions10 = this.j;
            if(cropImageOptions10 == null) {
                L.S("cropImageOptions");
                cropImageOptions10 = null;
            }
            this.z1(menu0, 0x7F0B0585, cropImageOptions10.N);  // id:ic_rotate_left_24
            CropImageOptions cropImageOptions11 = this.j;
            if(cropImageOptions11 == null) {
                L.S("cropImageOptions");
                cropImageOptions11 = null;
            }
            this.z1(menu0, 0x7F0B0586, cropImageOptions11.N);  // id:ic_rotate_right_24
            CropImageOptions cropImageOptions12 = this.j;
            if(cropImageOptions12 == null) {
                L.S("cropImageOptions");
                cropImageOptions12 = null;
            }
            this.z1(menu0, 0x7F0B0582, cropImageOptions12.N);  // id:ic_flip_24
            if(drawable0 != null) {
                CropImageOptions cropImageOptions13 = this.j;
                if(cropImageOptions13 == null) {
                    L.S("cropImageOptions");
                    cropImageOptions13 = null;
                }
                this.z1(menu0, 0x7F0B030C, cropImageOptions13.N);  // id:crop_image_menu_crop
            }
        }
        CropImageOptions cropImageOptions14 = this.j;
        if(cropImageOptions14 == null) {
            L.S("cropImageOptions");
        }
        else {
            cropImageOptions1 = cropImageOptions14;
        }
        Integer integer0 = cropImageOptions1.O;
        if(integer0 != null) {
            int v = integer0.intValue();
            for(Object object0: u.O(new Integer[]{id.ic_rotate_left_24, id.ic_rotate_right_24, id.ic_flip_24, id.ic_flip_24_horizontally, id.ic_flip_24_vertically, id.crop_image_menu_crop})) {
                this.A1(menu0, ((Number)object0).intValue(), v);
            }
        }
        return true;
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        CropImageOptions cropImageOptions0 = null;
        L.p(menuItem0, "item");
        int v = menuItem0.getItemId();
        if(v == id.crop_image_menu_crop) {
            this.h1();
            return true;
        }
        if(v == id.ic_rotate_left_24) {
            CropImageOptions cropImageOptions1 = this.j;
            if(cropImageOptions1 == null) {
                L.S("cropImageOptions");
            }
            else {
                cropImageOptions0 = cropImageOptions1;
            }
            this.p1(-cropImageOptions0.T8);
            return true;
        }
        if(v == id.ic_rotate_right_24) {
            CropImageOptions cropImageOptions2 = this.j;
            if(cropImageOptions2 == null) {
                L.S("cropImageOptions");
            }
            else {
                cropImageOptions0 = cropImageOptions2;
            }
            this.p1(cropImageOptions0.T8);
            return true;
        }
        if(v == id.ic_flip_24_horizontally) {
            CropImageView cropImageView0 = this.k;
            if(cropImageView0 == null) {
                return true;
            }
            cropImageView0.k();
            return true;
        }
        if(v == id.ic_flip_24_vertically) {
            CropImageView cropImageView1 = this.k;
            if(cropImageView1 != null) {
                cropImageView1.l();
                return true;
            }
            return true;
        }
        if(v == 0x102002C) {
            this.t1();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }

    @Override  // androidx.activity.ComponentActivity
    protected void onSaveInstanceState(@l Bundle bundle0) {
        L.p(bundle0, "outState");
        super.onSaveInstanceState(bundle0);
        bundle0.putString("bundle_key_tmp_uri", String.valueOf(this.m));
    }

    @Override  // androidx.appcompat.app.AppCompatActivity
    public void onStart() {
        super.onStart();
        CropImageView cropImageView0 = this.k;
        if(cropImageView0 != null) {
            cropImageView0.setOnSetImageUriCompleteListener(this);
        }
        CropImageView cropImageView1 = this.k;
        if(cropImageView1 != null) {
            cropImageView1.setOnCropImageCompleteListener(this);
        }
    }

    @Override  // androidx.appcompat.app.AppCompatActivity
    public void onStop() {
        super.onStop();
        CropImageView cropImageView0 = this.k;
        if(cropImageView0 != null) {
            cropImageView0.setOnSetImageUriCompleteListener(null);
        }
        CropImageView cropImageView1 = this.k;
        if(cropImageView1 != null) {
            cropImageView1.setOnCropImageCompleteListener(null);
        }
    }

    public void p1(int v) {
        CropImageView cropImageView0 = this.k;
        if(cropImageView0 != null) {
            cropImageView0.E(v);
        }
    }

    @Override  // com.canhub.cropper.CropImageView$f
    public void q(@l CropImageView cropImageView0, @l com.canhub.cropper.CropImageView.c cropImageView$c0) {
        L.p(cropImageView0, "view");
        L.p(cropImageView$c0, "result");
        this.s1(cropImageView$c0.m(), cropImageView$c0.f(), cropImageView$c0.l());
    }

    public void q1(@l CropImageView cropImageView0) {
        L.p(cropImageView0, "cropImageView");
        this.k = cropImageView0;
    }

    private final void r1() {
        CropImageOptions cropImageOptions0 = this.j;
        CropImageOptions cropImageOptions1 = null;
        if(cropImageOptions0 == null) {
            L.S("cropImageOptions");
            cropImageOptions0 = null;
        }
        int v = cropImageOptions0.f9;
        H.a a0 = this.l;
        if(a0 == null) {
            L.S("binding");
            a0 = null;
        }
        a0.b().setBackgroundColor(v);
        ActionBar actionBar0 = this.I0();
        if(actionBar0 != null) {
            CropImageOptions cropImageOptions2 = this.j;
            if(cropImageOptions2 == null) {
                L.S("cropImageOptions");
                cropImageOptions2 = null;
            }
            CharSequence charSequence0 = cropImageOptions2.M;
            if(charSequence0.length() == 0) {
                charSequence0 = "";
            }
            this.setTitle(charSequence0);
            actionBar0.X(true);
            CropImageOptions cropImageOptions3 = this.j;
            if(cropImageOptions3 == null) {
                L.S("cropImageOptions");
                cropImageOptions3 = null;
            }
            Integer integer0 = cropImageOptions3.g9;
            if(integer0 != null) {
                actionBar0.S(new ColorDrawable(integer0.intValue()));
            }
            CropImageOptions cropImageOptions4 = this.j;
            if(cropImageOptions4 == null) {
                L.S("cropImageOptions");
                cropImageOptions4 = null;
            }
            Integer integer1 = cropImageOptions4.h9;
            if(integer1 != null) {
                SpannableString spannableString0 = new SpannableString(this.getTitle());
                spannableString0.setSpan(new ForegroundColorSpan(integer1.intValue()), 0, spannableString0.length(), 33);
                this.setTitle(spannableString0);
            }
            CropImageOptions cropImageOptions5 = this.j;
            if(cropImageOptions5 == null) {
                L.S("cropImageOptions");
            }
            else {
                cropImageOptions1 = cropImageOptions5;
            }
            Integer integer2 = cropImageOptions1.i9;
            if(integer2 != null) {
                int v1 = integer2.intValue();
                try {
                    Drawable drawable0 = ContextCompat.getDrawable(this, drawable.ic_arrow_back_24);
                    if(drawable0 != null) {
                        drawable0.setColorFilter(new PorterDuffColorFilter(v1, PorterDuff.Mode.SRC_ATOP));
                    }
                    actionBar0.k0(drawable0);
                    return;
                }
                catch(Exception exception0) {
                }
                exception0.printStackTrace();
            }
        }
    }

    public void s1(@m Uri uri0, @m Exception exception0, int v) {
        this.setResult((exception0 == null ? -1 : 204), this.i1(uri0, exception0, v));
        this.finish();
    }

    public void t1() {
        this.setResult(0);
        this.finish();
    }

    public void u1(@l Function1 function10) {
        L.p(function10, "openSource");
        Builder alertDialog$Builder0 = new Builder(this).b(false).x((DialogInterface dialogInterface0, int v, KeyEvent keyEvent0) -> {
            L.p(this, "this$0");
            if(v == 4 && keyEvent0.getAction() == 1) {
                this.t1();
                this.finish();
            }
            return true;
        }).F(string.pick_image_chooser_title);
        String s = this.getString(string.pick_image_camera);
        String s1 = this.getString(string.pick_image_gallery);
        i i0 = (DialogInterface dialogInterface0, int v) -> {
            L.p(function10, "$openSource");
            function10.invoke((v == 0 ? b.a : b.b));
        };
        alertDialog$Builder0.j(new String[]{s, s1}, i0).I();
    }

    @Override  // com.canhub.cropper.CropImageView$j
    public void v(@l CropImageView cropImageView0, @l Uri uri0, @m Exception exception0) {
        L.p(cropImageView0, "view");
        L.p(uri0, "uri");
        CropImageOptions cropImageOptions0 = null;
        if(exception0 == null) {
            CropImageOptions cropImageOptions1 = this.j;
            if(cropImageOptions1 == null) {
                L.S("cropImageOptions");
                cropImageOptions1 = null;
            }
            if(cropImageOptions1.O8 != null) {
                CropImageView cropImageView1 = this.k;
                if(cropImageView1 != null) {
                    CropImageOptions cropImageOptions2 = this.j;
                    if(cropImageOptions2 == null) {
                        L.S("cropImageOptions");
                        cropImageOptions2 = null;
                    }
                    cropImageView1.setCropRect(cropImageOptions2.O8);
                }
            }
            CropImageOptions cropImageOptions3 = this.j;
            if(cropImageOptions3 == null) {
                L.S("cropImageOptions");
                cropImageOptions3 = null;
            }
            if(cropImageOptions3.P8 > 0) {
                CropImageView cropImageView2 = this.k;
                if(cropImageView2 != null) {
                    CropImageOptions cropImageOptions4 = this.j;
                    if(cropImageOptions4 == null) {
                        L.S("cropImageOptions");
                        cropImageOptions4 = null;
                    }
                    cropImageView2.setRotatedDegrees(cropImageOptions4.P8);
                }
            }
            CropImageOptions cropImageOptions5 = this.j;
            if(cropImageOptions5 == null) {
                L.S("cropImageOptions");
            }
            else {
                cropImageOptions0 = cropImageOptions5;
            }
            if(cropImageOptions0.Y8) {
                this.h1();
            }
        }
        else {
            this.s1(null, exception0, 1);
        }
    }

    // 检测为 Lambda 实现
    private static final boolean v1(CropImageActivity cropImageActivity0, DialogInterface dialogInterface0, int v, KeyEvent keyEvent0) [...]

    // 检测为 Lambda 实现
    private static final void w1(Function1 function10, DialogInterface dialogInterface0, int v) [...]

    private final void x1() {
        public static final class e implements com.canhub.cropper.s.b {
            final CropImageActivity a;

            e(CropImageActivity cropImageActivity0) {
                this.a = cropImageActivity0;
                super();
            }

            @Override  // com.canhub.cropper.s$b
            public void a(Uri uri0) {
                this.a.l1(uri0);
            }

            @Override  // com.canhub.cropper.s$b
            public void b() {
                this.a.t1();
            }
        }

        s s0 = new s(this, new e(this));
        CropImageOptions cropImageOptions0 = this.j;
        Uri uri0 = null;
        if(cropImageOptions0 == null) {
            L.S("cropImageOptions");
            cropImageOptions0 = null;
        }
        String s1 = cropImageOptions0.a9;
        if(s1 != null) {
            if(v.x3(s1)) {
                s1 = null;
            }
            if(s1 != null) {
                s0.g(s1);
            }
        }
        List list0 = cropImageOptions0.b9;
        if(list0 != null) {
            if(list0.isEmpty()) {
                list0 = null;
            }
            if(list0 != null) {
                s0.h(list0);
            }
        }
        if(cropImageOptions0.b) {
            uri0 = this.j1();
        }
        s0.i(cropImageOptions0.b, cropImageOptions0.a, uri0);
    }

    // 检测为 Lambda 实现
    private static final void y1(CropImageActivity cropImageActivity0, boolean z) [...]

    public void z1(@l Menu menu0, int v, int v1) {
        L.p(menu0, "menu");
        MenuItem menuItem0 = menu0.findItem(v);
        if(menuItem0 != null) {
            Drawable drawable0 = menuItem0.getIcon();
            if(drawable0 != null) {
                try {
                    drawable0.mutate();
                    drawable0.setColorFilter(BlendModeColorFilterCompat.a(v1, BlendModeCompat.j));
                    menuItem0.setIcon(drawable0);
                }
                catch(Exception exception0) {
                    Log.w("AIC", "Failed to update menu item color", exception0);
                }
            }
        }
    }
}

